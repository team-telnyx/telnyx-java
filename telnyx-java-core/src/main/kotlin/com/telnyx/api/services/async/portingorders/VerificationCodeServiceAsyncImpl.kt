// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.portingorders

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.emptyHandler
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
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.portingorders.verificationcodes.VerificationCodeListParams
import com.telnyx.api.models.portingorders.verificationcodes.VerificationCodeListResponse
import com.telnyx.api.models.portingorders.verificationcodes.VerificationCodeSendParams
import com.telnyx.api.models.portingorders.verificationcodes.VerificationCodeVerifyParams
import com.telnyx.api.models.portingorders.verificationcodes.VerificationCodeVerifyResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VerificationCodeServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : VerificationCodeServiceAsync {

    private val withRawResponse: VerificationCodeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VerificationCodeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): VerificationCodeServiceAsync =
        VerificationCodeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: VerificationCodeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationCodeListResponse> =
        // get /porting_orders/{id}/verification_codes
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun send(
        params: VerificationCodeSendParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /porting_orders/{id}/verification_codes/send
        withRawResponse().send(params, requestOptions).thenAccept {}

    override fun verify(
        params: VerificationCodeVerifyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationCodeVerifyResponse> =
        // post /porting_orders/{id}/verification_codes/verify
        withRawResponse().verify(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerificationCodeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerificationCodeServiceAsync.WithRawResponse =
            VerificationCodeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<VerificationCodeListResponse> =
            jsonHandler<VerificationCodeListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VerificationCodeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationCodeListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "verification_codes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val sendHandler: Handler<Void?> = emptyHandler()

        override fun send(
            params: VerificationCodeSendParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "porting_orders",
                        params._pathParam(0),
                        "verification_codes",
                        "send",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { sendHandler.handle(it) }
                    }
                }
        }

        private val verifyHandler: Handler<VerificationCodeVerifyResponse> =
            jsonHandler<VerificationCodeVerifyResponse>(clientOptions.jsonMapper)

        override fun verify(
            params: VerificationCodeVerifyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationCodeVerifyResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "porting_orders",
                        params._pathParam(0),
                        "verification_codes",
                        "verify",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { verifyHandler.handle(it) }
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
