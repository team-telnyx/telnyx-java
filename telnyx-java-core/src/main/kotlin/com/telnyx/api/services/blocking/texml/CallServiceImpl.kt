// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml

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
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.texml.calls.CallInitiateParams
import com.telnyx.api.models.texml.calls.CallInitiateResponse
import com.telnyx.api.models.texml.calls.CallUpdateParams
import com.telnyx.api.models.texml.calls.CallUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CallServiceImpl internal constructor(private val clientOptions: ClientOptions) : CallService {

    private val withRawResponse: CallService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CallService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService =
        CallServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: CallUpdateParams,
        requestOptions: RequestOptions,
    ): CallUpdateResponse =
        // post /texml/calls/{call_sid}/update
        withRawResponse().update(params, requestOptions).parse()

    override fun initiate(
        params: CallInitiateParams,
        requestOptions: RequestOptions,
    ): CallInitiateResponse =
        // post /texml/calls/{application_id}
        withRawResponse().initiate(params, requestOptions).parse()

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

        private val updateHandler: Handler<CallUpdateResponse> =
            jsonHandler<CallUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CallUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callSid", params.callSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "calls", params._pathParam(0), "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val initiateHandler: Handler<CallInitiateResponse> =
            jsonHandler<CallInitiateResponse>(clientOptions.jsonMapper)

        override fun initiate(
            params: CallInitiateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallInitiateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("applicationId", params.applicationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "calls", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { initiateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
