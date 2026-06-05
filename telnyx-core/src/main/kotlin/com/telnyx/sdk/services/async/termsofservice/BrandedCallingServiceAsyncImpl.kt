// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.termsofservice

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.termsofservice.brandedcalling.BrandedCallingAgreeParams
import com.telnyx.sdk.models.termsofservice.brandedcalling.BrandedCallingAgreeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
class BrandedCallingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BrandedCallingServiceAsync {

    private val withRawResponse: BrandedCallingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BrandedCallingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): BrandedCallingServiceAsync =
        BrandedCallingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun agree(
        params: BrandedCallingAgreeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandedCallingAgreeResponse> =
        // post /terms_of_service/branded_calling/agree
        withRawResponse().agree(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandedCallingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandedCallingServiceAsync.WithRawResponse =
            BrandedCallingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val agreeHandler: Handler<BrandedCallingAgreeResponse> =
            jsonHandler<BrandedCallingAgreeResponse>(clientOptions.jsonMapper)

        override fun agree(
            params: BrandedCallingAgreeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandedCallingAgreeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("terms_of_service", "branded_calling", "agree")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { agreeHandler.handle(it) }
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
