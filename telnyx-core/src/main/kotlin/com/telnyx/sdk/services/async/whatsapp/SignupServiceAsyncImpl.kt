// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.composeCancellableAsync
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.whatsapp.signup.SignupListPageAsync
import com.telnyx.sdk.models.whatsapp.signup.SignupListPageResponse
import com.telnyx.sdk.models.whatsapp.signup.SignupListParams
import com.telnyx.sdk.models.whatsapp.signup.SignupRetrieveStatusParams
import com.telnyx.sdk.models.whatsapp.signup.SignupRetrieveStatusResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SignupServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SignupServiceAsync {

    private val withRawResponse: SignupServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SignupServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SignupServiceAsync =
        SignupServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: SignupListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SignupListPageAsync> =
        // get /whatsapp/signup
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieveStatus(
        params: SignupRetrieveStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SignupRetrieveStatusResponse> =
        // get /whatsapp/signup/{id}/status
        withRawResponse().retrieveStatus(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SignupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SignupServiceAsync.WithRawResponse =
            SignupServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<SignupListPageResponse> =
            jsonHandler<SignupListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SignupListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SignupListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("whatsapp", "signup")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                SignupListPageAsync.builder()
                                    .service(SignupServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val retrieveStatusHandler: Handler<SignupRetrieveStatusResponse> =
            jsonHandler<SignupRetrieveStatusResponse>(clientOptions.jsonMapper)

        override fun retrieveStatus(
            params: SignupRetrieveStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SignupRetrieveStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("whatsapp", "signup", params._pathParam(0), "status")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
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
}
