// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc

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
import com.telnyx.sdk.models.number10dlc.campaign.TelnyxCampaignCsp
import com.telnyx.sdk.models.number10dlc.campaignbuilder.CampaignBuilderSubmitParams
import com.telnyx.sdk.services.blocking.number10dlc.campaignbuilder.BrandService
import com.telnyx.sdk.services.blocking.number10dlc.campaignbuilder.BrandServiceImpl
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

    override fun submit(
        params: CampaignBuilderSubmitParams,
        requestOptions: RequestOptions,
    ): TelnyxCampaignCsp =
        // post /10dlc/campaignBuilder
        withRawResponse().submit(params, requestOptions).parse()

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

        private val submitHandler: Handler<TelnyxCampaignCsp> =
            jsonHandler<TelnyxCampaignCsp>(clientOptions.jsonMapper)

        override fun submit(
            params: CampaignBuilderSubmitParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelnyxCampaignCsp> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaignBuilder")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { submitHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
