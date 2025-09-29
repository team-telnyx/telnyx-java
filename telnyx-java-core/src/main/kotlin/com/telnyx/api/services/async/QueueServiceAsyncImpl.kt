// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.queues.QueueRetrieveParams
import com.telnyx.api.models.queues.QueueRetrieveResponse
import com.telnyx.api.services.async.queues.CallServiceAsync
import com.telnyx.api.services.async.queues.CallServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class QueueServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    QueueServiceAsync {

    private val withRawResponse: QueueServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val calls: CallServiceAsync by lazy { CallServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): QueueServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueServiceAsync =
        QueueServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun calls(): CallServiceAsync = calls

    override fun retrieve(
        params: QueueRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<QueueRetrieveResponse> =
        // get /queues/{queue_name}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QueueServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val calls: CallServiceAsync.WithRawResponse by lazy {
            CallServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueueServiceAsync.WithRawResponse =
            QueueServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun calls(): CallServiceAsync.WithRawResponse = calls

        private val retrieveHandler: Handler<QueueRetrieveResponse> =
            jsonHandler<QueueRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: QueueRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<QueueRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueName", params.queueName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("queues", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
