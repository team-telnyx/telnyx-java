// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.termsofservice

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
import com.telnyx.sdk.models.termsofservice.agreements.TosAgreementWrapped
import com.telnyx.sdk.models.termsofservice.numberreputation.NumberReputationAgreeParams
import java.util.function.Consumer

/** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
class NumberReputationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NumberReputationService {

    private val withRawResponse: NumberReputationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NumberReputationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberReputationService =
        NumberReputationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun agree(
        params: NumberReputationAgreeParams,
        requestOptions: RequestOptions,
    ): TosAgreementWrapped =
        // post /terms_of_service/number_reputation/agree
        withRawResponse().agree(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumberReputationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberReputationService.WithRawResponse =
            NumberReputationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val agreeHandler: Handler<TosAgreementWrapped> =
            jsonHandler<TosAgreementWrapped>(clientOptions.jsonMapper)

        override fun agree(
            params: NumberReputationAgreeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TosAgreementWrapped> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("terms_of_service", "number_reputation", "agree")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
