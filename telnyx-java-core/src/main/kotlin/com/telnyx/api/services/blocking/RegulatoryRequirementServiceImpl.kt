// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.regulatoryrequirements.RegulatoryRequirementRetrieveParams
import com.telnyx.api.models.regulatoryrequirements.RegulatoryRequirementRetrieveResponse
import java.util.function.Consumer

class RegulatoryRequirementServiceImpl
internal constructor(private val clientOptions: ClientOptions) : RegulatoryRequirementService {

    private val withRawResponse: RegulatoryRequirementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RegulatoryRequirementService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): RegulatoryRequirementService =
        RegulatoryRequirementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: RegulatoryRequirementRetrieveParams,
        requestOptions: RequestOptions,
    ): RegulatoryRequirementRetrieveResponse =
        // get /regulatory_requirements
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RegulatoryRequirementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RegulatoryRequirementService.WithRawResponse =
            RegulatoryRequirementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<RegulatoryRequirementRetrieveResponse> =
            jsonHandler<RegulatoryRequirementRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RegulatoryRequirementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegulatoryRequirementRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("regulatory_requirements")
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
    }
}
