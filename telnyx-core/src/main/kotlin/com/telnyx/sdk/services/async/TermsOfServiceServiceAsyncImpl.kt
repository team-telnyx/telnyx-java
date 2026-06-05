// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.termsofservice.TermsOfServiceStatusParams
import com.telnyx.sdk.models.termsofservice.TermsOfServiceStatusResponse
import com.telnyx.sdk.services.async.termsofservice.AgreementServiceAsync
import com.telnyx.sdk.services.async.termsofservice.AgreementServiceAsyncImpl
import com.telnyx.sdk.services.async.termsofservice.BrandedCallingServiceAsync
import com.telnyx.sdk.services.async.termsofservice.BrandedCallingServiceAsyncImpl
import com.telnyx.sdk.services.async.termsofservice.NumberReputationServiceAsync
import com.telnyx.sdk.services.async.termsofservice.NumberReputationServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
class TermsOfServiceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : TermsOfServiceServiceAsync {

    private val withRawResponse: TermsOfServiceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val numberReputation: NumberReputationServiceAsync by lazy {
        NumberReputationServiceAsyncImpl(clientOptions)
    }

    private val agreements: AgreementServiceAsync by lazy {
        AgreementServiceAsyncImpl(clientOptions)
    }

    private val brandedCalling: BrandedCallingServiceAsync by lazy {
        BrandedCallingServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): TermsOfServiceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): TermsOfServiceServiceAsync =
        TermsOfServiceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
    override fun numberReputation(): NumberReputationServiceAsync = numberReputation

    /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
    override fun agreements(): AgreementServiceAsync = agreements

    /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
    override fun brandedCalling(): BrandedCallingServiceAsync = brandedCalling

    override fun status(
        params: TermsOfServiceStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TermsOfServiceStatusResponse> =
        // get /terms_of_service/status
        withRawResponse().status(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TermsOfServiceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val numberReputation: NumberReputationServiceAsync.WithRawResponse by lazy {
            NumberReputationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val agreements: AgreementServiceAsync.WithRawResponse by lazy {
            AgreementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val brandedCalling: BrandedCallingServiceAsync.WithRawResponse by lazy {
            BrandedCallingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TermsOfServiceServiceAsync.WithRawResponse =
            TermsOfServiceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
        override fun numberReputation(): NumberReputationServiceAsync.WithRawResponse =
            numberReputation

        /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
        override fun agreements(): AgreementServiceAsync.WithRawResponse = agreements

        /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
        override fun brandedCalling(): BrandedCallingServiceAsync.WithRawResponse = brandedCalling

        private val statusHandler: Handler<TermsOfServiceStatusResponse> =
            jsonHandler<TermsOfServiceStatusResponse>(clientOptions.jsonMapper)

        override fun status(
            params: TermsOfServiceStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TermsOfServiceStatusResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("terms_of_service", "status")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { statusHandler.handle(it) }
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
