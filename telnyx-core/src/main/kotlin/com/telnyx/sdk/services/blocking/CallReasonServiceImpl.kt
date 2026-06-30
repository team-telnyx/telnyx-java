// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.callreasons.CallReasonListPage
import com.telnyx.sdk.models.callreasons.CallReasonListPageResponse
import com.telnyx.sdk.models.callreasons.CallReasonListParams
import com.telnyx.sdk.models.callreasons.CallReasonValidateParams
import com.telnyx.sdk.models.callreasons.CallReasonValidateResponse
import java.util.function.Consumer

/** Static reference values the API accepts: call reasons, document types, rejection types. */
class CallReasonServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CallReasonService {

    private val withRawResponse: CallReasonService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CallReasonService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallReasonService =
        CallReasonServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: CallReasonListParams,
        requestOptions: RequestOptions,
    ): CallReasonListPage =
        // get /call_reasons
        withRawResponse().list(params, requestOptions).parse()

    override fun validate(
        params: CallReasonValidateParams,
        requestOptions: RequestOptions,
    ): CallReasonValidateResponse =
        // post /call_reasons/validate
        withRawResponse().validate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallReasonService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallReasonService.WithRawResponse =
            CallReasonServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CallReasonListPageResponse> =
            jsonHandler<CallReasonListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CallReasonListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallReasonListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("call_reasons")
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
                    .let {
                        CallReasonListPage.builder()
                            .service(CallReasonServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val validateHandler: Handler<CallReasonValidateResponse> =
            jsonHandler<CallReasonValidateResponse>(clientOptions.jsonMapper)

        override fun validate(
            params: CallReasonValidateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallReasonValidateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("call_reasons", "validate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { validateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
