// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.termsofservice

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
import com.telnyx.sdk.models.termsofservice.agreements.AgreementListPage
import com.telnyx.sdk.models.termsofservice.agreements.AgreementListPageResponse
import com.telnyx.sdk.models.termsofservice.agreements.AgreementListParams
import com.telnyx.sdk.models.termsofservice.agreements.AgreementRetrieveParams
import com.telnyx.sdk.models.termsofservice.agreements.AgreementRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
class AgreementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AgreementService {

    private val withRawResponse: AgreementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AgreementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgreementService =
        AgreementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: AgreementRetrieveParams,
        requestOptions: RequestOptions,
    ): AgreementRetrieveResponse =
        // get /terms_of_service/agreements/{agreement_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AgreementListParams,
        requestOptions: RequestOptions,
    ): AgreementListPage =
        // get /terms_of_service/agreements
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgreementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgreementService.WithRawResponse =
            AgreementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<AgreementRetrieveResponse> =
            jsonHandler<AgreementRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AgreementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgreementRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agreementId", params.agreementId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("terms_of_service", "agreements", params._pathParam(0))
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

        private val listHandler: Handler<AgreementListPageResponse> =
            jsonHandler<AgreementListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AgreementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgreementListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("terms_of_service", "agreements")
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
                        AgreementListPage.builder()
                            .service(AgreementServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
