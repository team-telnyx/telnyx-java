// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

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
import com.telnyx.sdk.models.whatsapp.signup.SignupListPage
import com.telnyx.sdk.models.whatsapp.signup.SignupListPageResponse
import com.telnyx.sdk.models.whatsapp.signup.SignupListParams
import com.telnyx.sdk.models.whatsapp.signup.SignupRetrieveStatusParams
import com.telnyx.sdk.models.whatsapp.signup.SignupRetrieveStatusResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SignupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SignupService {

    private val withRawResponse: SignupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SignupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SignupService =
        SignupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: SignupListParams, requestOptions: RequestOptions): SignupListPage =
        // get /whatsapp/signup
        withRawResponse().list(params, requestOptions).parse()

    override fun retrieveStatus(
        params: SignupRetrieveStatusParams,
        requestOptions: RequestOptions,
    ): SignupRetrieveStatusResponse =
        // get /whatsapp/signup/{id}/status
        withRawResponse().retrieveStatus(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SignupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SignupService.WithRawResponse =
            SignupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<SignupListPageResponse> =
            jsonHandler<SignupListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SignupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SignupListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("whatsapp", "signup")
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
                        SignupListPage.builder()
                            .service(SignupServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveStatusHandler: Handler<SignupRetrieveStatusResponse> =
            jsonHandler<SignupRetrieveStatusResponse>(clientOptions.jsonMapper)

        override fun retrieveStatus(
            params: SignupRetrieveStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SignupRetrieveStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("whatsapp", "signup", params._pathParam(0), "status")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
