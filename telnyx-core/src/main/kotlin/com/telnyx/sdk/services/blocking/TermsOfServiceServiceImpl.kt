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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.termsofservice.TermsOfServiceStatusParams
import com.telnyx.sdk.models.termsofservice.TermsOfServiceStatusResponse
import com.telnyx.sdk.services.blocking.termsofservice.AgreementService
import com.telnyx.sdk.services.blocking.termsofservice.AgreementServiceImpl
import com.telnyx.sdk.services.blocking.termsofservice.BrandedCallingService
import com.telnyx.sdk.services.blocking.termsofservice.BrandedCallingServiceImpl
import com.telnyx.sdk.services.blocking.termsofservice.NumberReputationService
import com.telnyx.sdk.services.blocking.termsofservice.NumberReputationServiceImpl
import java.util.function.Consumer

/** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
class TermsOfServiceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TermsOfServiceService {

    private val withRawResponse: TermsOfServiceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val numberReputation: NumberReputationService by lazy {
        NumberReputationServiceImpl(clientOptions)
    }

    private val agreements: AgreementService by lazy { AgreementServiceImpl(clientOptions) }

    private val brandedCalling: BrandedCallingService by lazy {
        BrandedCallingServiceImpl(clientOptions)
    }

    override fun withRawResponse(): TermsOfServiceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TermsOfServiceService =
        TermsOfServiceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
    override fun numberReputation(): NumberReputationService = numberReputation

    /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
    override fun agreements(): AgreementService = agreements

    /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
    override fun brandedCalling(): BrandedCallingService = brandedCalling

    override fun status(
        params: TermsOfServiceStatusParams,
        requestOptions: RequestOptions,
    ): TermsOfServiceStatusResponse =
        // get /terms_of_service/status
        withRawResponse().status(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TermsOfServiceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val numberReputation: NumberReputationService.WithRawResponse by lazy {
            NumberReputationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val agreements: AgreementService.WithRawResponse by lazy {
            AgreementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val brandedCalling: BrandedCallingService.WithRawResponse by lazy {
            BrandedCallingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TermsOfServiceService.WithRawResponse =
            TermsOfServiceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
        override fun numberReputation(): NumberReputationService.WithRawResponse = numberReputation

        /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
        override fun agreements(): AgreementService.WithRawResponse = agreements

        /** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
        override fun brandedCalling(): BrandedCallingService.WithRawResponse = brandedCalling

        private val statusHandler: Handler<TermsOfServiceStatusResponse> =
            jsonHandler<TermsOfServiceStatusResponse>(clientOptions.jsonMapper)

        override fun status(
            params: TermsOfServiceStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TermsOfServiceStatusResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("terms_of_service", "status")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
