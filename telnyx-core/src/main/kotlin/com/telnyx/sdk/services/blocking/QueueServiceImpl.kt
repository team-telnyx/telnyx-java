// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.queues.QueueRetrieveParams
import com.telnyx.sdk.models.queues.QueueRetrieveResponse
import com.telnyx.sdk.services.blocking.queues.CallService
import com.telnyx.sdk.services.blocking.queues.CallServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class QueueServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    QueueService {

    private val withRawResponse: QueueService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val calls: CallService by lazy { CallServiceImpl(clientOptions) }

    override fun withRawResponse(): QueueService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueService =
        QueueServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun calls(): CallService = calls

    override fun retrieve(
        params: QueueRetrieveParams,
        requestOptions: RequestOptions,
    ): QueueRetrieveResponse =
        // get /queues/{queue_name}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QueueService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val calls: CallService.WithRawResponse by lazy {
            CallServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueueService.WithRawResponse =
            QueueServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun calls(): CallService.WithRawResponse = calls

        private val retrieveHandler: Handler<QueueRetrieveResponse> =
            jsonHandler<QueueRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: QueueRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QueueRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueName", params.queueName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("queues", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
