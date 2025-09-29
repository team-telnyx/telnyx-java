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
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.campaignbuilder.CampaignBuilderCreateParams
import com.telnyx.api.models.campaignbuilder.CampaignBuilderCreateResponse
import com.telnyx.api.services.blocking.campaignbuilder.BrandService
import com.telnyx.api.services.blocking.campaignbuilder.BrandServiceImpl
import java.util.function.Consumer

class CampaignBuilderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CampaignBuilderService {

    private val withRawResponse: CampaignBuilderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val brand: BrandService by lazy { BrandServiceImpl(clientOptions) }

    override fun withRawResponse(): CampaignBuilderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignBuilderService =
        CampaignBuilderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun brand(): BrandService = brand

    override fun create(
        params: CampaignBuilderCreateParams,
        requestOptions: RequestOptions,
    ): CampaignBuilderCreateResponse =
        // post /campaignBuilder
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CampaignBuilderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val brand: BrandService.WithRawResponse by lazy {
            BrandServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignBuilderService.WithRawResponse =
            CampaignBuilderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun brand(): BrandService.WithRawResponse = brand

        private val createHandler: Handler<CampaignBuilderCreateResponse> =
            jsonHandler<CampaignBuilderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CampaignBuilderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignBuilderCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaignBuilder")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
