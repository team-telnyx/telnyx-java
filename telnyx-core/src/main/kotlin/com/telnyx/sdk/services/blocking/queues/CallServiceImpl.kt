// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.queues

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
import com.telnyx.sdk.models.queues.calls.CallListParams
import com.telnyx.sdk.models.queues.calls.CallListResponse
import com.telnyx.sdk.models.queues.calls.CallRetrieveParams
import com.telnyx.sdk.models.queues.calls.CallRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CallServiceImpl internal constructor(private val clientOptions: ClientOptions) : CallService {

    private val withRawResponse: CallService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CallService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService =
        CallServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CallRetrieveParams,
        requestOptions: RequestOptions,
    ): CallRetrieveResponse =
        // get /queues/{queue_name}/calls/{call_control_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: CallListParams, requestOptions: RequestOptions): CallListResponse =
        // get /queues/{queue_name}/calls
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallService.WithRawResponse =
            CallServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CallRetrieveResponse> =
            jsonHandler<CallRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CallRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("queues", params._pathParam(0), "calls", params._pathParam(1))
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

        private val listHandler: Handler<CallListResponse> =
            jsonHandler<CallListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CallListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueName", params.queueName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("queues", params._pathParam(0), "calls")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
