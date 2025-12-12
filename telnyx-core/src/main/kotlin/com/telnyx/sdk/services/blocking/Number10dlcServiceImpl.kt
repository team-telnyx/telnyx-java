// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.models.number10dlc.Number10dlcGetEnumParams
import com.telnyx.sdk.models.number10dlc.Number10dlcGetEnumResponse
import com.telnyx.sdk.services.blocking.number10dlc.BrandService
import com.telnyx.sdk.services.blocking.number10dlc.BrandServiceImpl
import com.telnyx.sdk.services.blocking.number10dlc.CampaignBuilderService
import com.telnyx.sdk.services.blocking.number10dlc.CampaignBuilderServiceImpl
import com.telnyx.sdk.services.blocking.number10dlc.CampaignService
import com.telnyx.sdk.services.blocking.number10dlc.CampaignServiceImpl
import com.telnyx.sdk.services.blocking.number10dlc.PhoneNumberCampaignService
import com.telnyx.sdk.services.blocking.number10dlc.PhoneNumberCampaignServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class Number10dlcServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    Number10dlcService {

    private val withRawResponse: Number10dlcService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val brand: BrandService by lazy { BrandServiceImpl(clientOptions) }

    private val campaign: CampaignService by lazy { CampaignServiceImpl(clientOptions) }

    private val campaignBuilder: CampaignBuilderService by lazy {
        CampaignBuilderServiceImpl(clientOptions)
    }

    private val phoneNumberCampaigns: PhoneNumberCampaignService by lazy {
        PhoneNumberCampaignServiceImpl(clientOptions)
    }

    override fun withRawResponse(): Number10dlcService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): Number10dlcService =
        Number10dlcServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun brand(): BrandService = brand

    override fun campaign(): CampaignService = campaign

    override fun campaignBuilder(): CampaignBuilderService = campaignBuilder

    override fun phoneNumberCampaigns(): PhoneNumberCampaignService = phoneNumberCampaigns

    override fun getEnum(
        params: Number10dlcGetEnumParams,
        requestOptions: RequestOptions,
    ): Number10dlcGetEnumResponse =
        // get /10dlc/enum/{endpoint}
        withRawResponse().getEnum(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        Number10dlcService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val brand: BrandService.WithRawResponse by lazy {
            BrandServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val campaign: CampaignService.WithRawResponse by lazy {
            CampaignServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val campaignBuilder: CampaignBuilderService.WithRawResponse by lazy {
            CampaignBuilderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberCampaigns: PhoneNumberCampaignService.WithRawResponse by lazy {
            PhoneNumberCampaignServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): Number10dlcService.WithRawResponse =
            Number10dlcServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun brand(): BrandService.WithRawResponse = brand

        override fun campaign(): CampaignService.WithRawResponse = campaign

        override fun campaignBuilder(): CampaignBuilderService.WithRawResponse = campaignBuilder

        override fun phoneNumberCampaigns(): PhoneNumberCampaignService.WithRawResponse =
            phoneNumberCampaigns

        private val getEnumHandler: Handler<Number10dlcGetEnumResponse> =
            jsonHandler<Number10dlcGetEnumResponse>(clientOptions.jsonMapper)

        override fun getEnum(
            params: Number10dlcGetEnumParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Number10dlcGetEnumResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "enum", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getEnumHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
