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
import com.telnyx.sdk.models.messaging10dlc.Messaging10dlcGetEnumParams
import com.telnyx.sdk.models.messaging10dlc.Messaging10dlcGetEnumResponse
import com.telnyx.sdk.services.blocking.messaging10dlc.BrandService
import com.telnyx.sdk.services.blocking.messaging10dlc.BrandServiceImpl
import com.telnyx.sdk.services.blocking.messaging10dlc.CampaignBuilderService
import com.telnyx.sdk.services.blocking.messaging10dlc.CampaignBuilderServiceImpl
import com.telnyx.sdk.services.blocking.messaging10dlc.CampaignService
import com.telnyx.sdk.services.blocking.messaging10dlc.CampaignServiceImpl
import com.telnyx.sdk.services.blocking.messaging10dlc.PartnerCampaignService
import com.telnyx.sdk.services.blocking.messaging10dlc.PartnerCampaignServiceImpl
import com.telnyx.sdk.services.blocking.messaging10dlc.PhoneNumberAssignmentByProfileService
import com.telnyx.sdk.services.blocking.messaging10dlc.PhoneNumberAssignmentByProfileServiceImpl
import com.telnyx.sdk.services.blocking.messaging10dlc.PhoneNumberCampaignService
import com.telnyx.sdk.services.blocking.messaging10dlc.PhoneNumberCampaignServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class Messaging10dlcServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    Messaging10dlcService {

    private val withRawResponse: Messaging10dlcService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val brand: BrandService by lazy { BrandServiceImpl(clientOptions) }

    private val campaign: CampaignService by lazy { CampaignServiceImpl(clientOptions) }

    private val campaignBuilder: CampaignBuilderService by lazy {
        CampaignBuilderServiceImpl(clientOptions)
    }

    private val partnerCampaigns: PartnerCampaignService by lazy {
        PartnerCampaignServiceImpl(clientOptions)
    }

    private val phoneNumberCampaigns: PhoneNumberCampaignService by lazy {
        PhoneNumberCampaignServiceImpl(clientOptions)
    }

    private val phoneNumberAssignmentByProfile: PhoneNumberAssignmentByProfileService by lazy {
        PhoneNumberAssignmentByProfileServiceImpl(clientOptions)
    }

    override fun withRawResponse(): Messaging10dlcService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): Messaging10dlcService =
        Messaging10dlcServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Brand operations */
    override fun brand(): BrandService = brand

    /** Campaign operations */
    override fun campaign(): CampaignService = campaign

    /** Campaign operations */
    override fun campaignBuilder(): CampaignBuilderService = campaignBuilder

    override fun partnerCampaigns(): PartnerCampaignService = partnerCampaigns

    /** Phone number campaign assignment */
    override fun phoneNumberCampaigns(): PhoneNumberCampaignService = phoneNumberCampaigns

    /** Phone number campaign bulk assignment */
    override fun phoneNumberAssignmentByProfile(): PhoneNumberAssignmentByProfileService =
        phoneNumberAssignmentByProfile

    override fun getEnum(
        params: Messaging10dlcGetEnumParams,
        requestOptions: RequestOptions,
    ): Messaging10dlcGetEnumResponse =
        // get /10dlc/enum/{endpoint}
        withRawResponse().getEnum(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        Messaging10dlcService.WithRawResponse {

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

        private val partnerCampaigns: PartnerCampaignService.WithRawResponse by lazy {
            PartnerCampaignServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberCampaigns: PhoneNumberCampaignService.WithRawResponse by lazy {
            PhoneNumberCampaignServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberAssignmentByProfile:
            PhoneNumberAssignmentByProfileService.WithRawResponse by lazy {
            PhoneNumberAssignmentByProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): Messaging10dlcService.WithRawResponse =
            Messaging10dlcServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Brand operations */
        override fun brand(): BrandService.WithRawResponse = brand

        /** Campaign operations */
        override fun campaign(): CampaignService.WithRawResponse = campaign

        /** Campaign operations */
        override fun campaignBuilder(): CampaignBuilderService.WithRawResponse = campaignBuilder

        override fun partnerCampaigns(): PartnerCampaignService.WithRawResponse = partnerCampaigns

        /** Phone number campaign assignment */
        override fun phoneNumberCampaigns(): PhoneNumberCampaignService.WithRawResponse =
            phoneNumberCampaigns

        /** Phone number campaign bulk assignment */
        override fun phoneNumberAssignmentByProfile():
            PhoneNumberAssignmentByProfileService.WithRawResponse = phoneNumberAssignmentByProfile

        private val getEnumHandler: Handler<Messaging10dlcGetEnumResponse> =
            jsonHandler<Messaging10dlcGetEnumResponse>(clientOptions.jsonMapper)

        override fun getEnum(
            params: Messaging10dlcGetEnumParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Messaging10dlcGetEnumResponse> {
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
