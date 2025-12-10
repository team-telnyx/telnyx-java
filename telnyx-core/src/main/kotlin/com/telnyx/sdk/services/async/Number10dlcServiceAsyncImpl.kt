// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.number10dlc.Number10dlcGetEnumParams
import com.telnyx.sdk.models.number10dlc.Number10dlcGetEnumResponse
import com.telnyx.sdk.services.async.number10dlc.BrandServiceAsync
import com.telnyx.sdk.services.async.number10dlc.BrandServiceAsyncImpl
import com.telnyx.sdk.services.async.number10dlc.CampaignBuilderServiceAsync
import com.telnyx.sdk.services.async.number10dlc.CampaignBuilderServiceAsyncImpl
import com.telnyx.sdk.services.async.number10dlc.CampaignServiceAsync
import com.telnyx.sdk.services.async.number10dlc.CampaignServiceAsyncImpl
import com.telnyx.sdk.services.async.number10dlc.PartnerCampaignServiceAsync
import com.telnyx.sdk.services.async.number10dlc.PartnerCampaignServiceAsyncImpl
import com.telnyx.sdk.services.async.number10dlc.PhoneNumberAssignmentByProfileServiceAsync
import com.telnyx.sdk.services.async.number10dlc.PhoneNumberAssignmentByProfileServiceAsyncImpl
import com.telnyx.sdk.services.async.number10dlc.PhoneNumberCampaignServiceAsync
import com.telnyx.sdk.services.async.number10dlc.PhoneNumberCampaignServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class Number10dlcServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    Number10dlcServiceAsync {

    private val withRawResponse: Number10dlcServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val brand: BrandServiceAsync by lazy { BrandServiceAsyncImpl(clientOptions) }

    private val campaign: CampaignServiceAsync by lazy { CampaignServiceAsyncImpl(clientOptions) }

    private val campaignBuilder: CampaignBuilderServiceAsync by lazy {
        CampaignBuilderServiceAsyncImpl(clientOptions)
    }

    private val partnerCampaign: PartnerCampaignServiceAsync by lazy {
        PartnerCampaignServiceAsyncImpl(clientOptions)
    }

    private val partnerCampaigns: PartnerCampaignServiceAsync by lazy {
        PartnerCampaignServiceAsyncImpl(clientOptions)
    }

    private val phoneNumberAssignmentByProfile: PhoneNumberAssignmentByProfileServiceAsync by lazy {
        PhoneNumberAssignmentByProfileServiceAsyncImpl(clientOptions)
    }

    private val phoneNumberCampaigns: PhoneNumberCampaignServiceAsync by lazy {
        PhoneNumberCampaignServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): Number10dlcServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): Number10dlcServiceAsync =
        Number10dlcServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun brand(): BrandServiceAsync = brand

    override fun campaign(): CampaignServiceAsync = campaign

    override fun campaignBuilder(): CampaignBuilderServiceAsync = campaignBuilder

    override fun partnerCampaign(): PartnerCampaignServiceAsync = partnerCampaign

    override fun partnerCampaigns(): PartnerCampaignServiceAsync = partnerCampaigns

    override fun phoneNumberAssignmentByProfile(): PhoneNumberAssignmentByProfileServiceAsync =
        phoneNumberAssignmentByProfile

    override fun phoneNumberCampaigns(): PhoneNumberCampaignServiceAsync = phoneNumberCampaigns

    override fun getEnum(
        params: Number10dlcGetEnumParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Number10dlcGetEnumResponse> =
        // get /10dlc/enum/{endpoint}
        withRawResponse().getEnum(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        Number10dlcServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val brand: BrandServiceAsync.WithRawResponse by lazy {
            BrandServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val campaign: CampaignServiceAsync.WithRawResponse by lazy {
            CampaignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val campaignBuilder: CampaignBuilderServiceAsync.WithRawResponse by lazy {
            CampaignBuilderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val partnerCampaign: PartnerCampaignServiceAsync.WithRawResponse by lazy {
            PartnerCampaignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val partnerCampaigns: PartnerCampaignServiceAsync.WithRawResponse by lazy {
            PartnerCampaignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberAssignmentByProfile:
            PhoneNumberAssignmentByProfileServiceAsync.WithRawResponse by lazy {
            PhoneNumberAssignmentByProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberCampaigns: PhoneNumberCampaignServiceAsync.WithRawResponse by lazy {
            PhoneNumberCampaignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): Number10dlcServiceAsync.WithRawResponse =
            Number10dlcServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun brand(): BrandServiceAsync.WithRawResponse = brand

        override fun campaign(): CampaignServiceAsync.WithRawResponse = campaign

        override fun campaignBuilder(): CampaignBuilderServiceAsync.WithRawResponse =
            campaignBuilder

        override fun partnerCampaign(): PartnerCampaignServiceAsync.WithRawResponse =
            partnerCampaign

        override fun partnerCampaigns(): PartnerCampaignServiceAsync.WithRawResponse =
            partnerCampaigns

        override fun phoneNumberAssignmentByProfile():
            PhoneNumberAssignmentByProfileServiceAsync.WithRawResponse =
            phoneNumberAssignmentByProfile

        override fun phoneNumberCampaigns(): PhoneNumberCampaignServiceAsync.WithRawResponse =
            phoneNumberCampaigns

        private val getEnumHandler: Handler<Number10dlcGetEnumResponse> =
            jsonHandler<Number10dlcGetEnumResponse>(clientOptions.jsonMapper)

        override fun getEnum(
            params: Number10dlcGetEnumParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Number10dlcGetEnumResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "enum", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
