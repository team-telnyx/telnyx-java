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
import com.telnyx.sdk.models.messaging10dlc.Messaging10dlcGetEnumParams
import com.telnyx.sdk.models.messaging10dlc.Messaging10dlcGetEnumResponse
import com.telnyx.sdk.services.async.messaging10dlc.BrandServiceAsync
import com.telnyx.sdk.services.async.messaging10dlc.BrandServiceAsyncImpl
import com.telnyx.sdk.services.async.messaging10dlc.CampaignBuilderServiceAsync
import com.telnyx.sdk.services.async.messaging10dlc.CampaignBuilderServiceAsyncImpl
import com.telnyx.sdk.services.async.messaging10dlc.CampaignServiceAsync
import com.telnyx.sdk.services.async.messaging10dlc.CampaignServiceAsyncImpl
import com.telnyx.sdk.services.async.messaging10dlc.PartnerCampaignServiceAsync
import com.telnyx.sdk.services.async.messaging10dlc.PartnerCampaignServiceAsyncImpl
import com.telnyx.sdk.services.async.messaging10dlc.PhoneNumberAssignmentByProfileServiceAsync
import com.telnyx.sdk.services.async.messaging10dlc.PhoneNumberAssignmentByProfileServiceAsyncImpl
import com.telnyx.sdk.services.async.messaging10dlc.PhoneNumberCampaignServiceAsync
import com.telnyx.sdk.services.async.messaging10dlc.PhoneNumberCampaignServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class Messaging10dlcServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : Messaging10dlcServiceAsync {

    private val withRawResponse: Messaging10dlcServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val brand: BrandServiceAsync by lazy { BrandServiceAsyncImpl(clientOptions) }

    private val campaign: CampaignServiceAsync by lazy { CampaignServiceAsyncImpl(clientOptions) }

    private val campaignBuilder: CampaignBuilderServiceAsync by lazy {
        CampaignBuilderServiceAsyncImpl(clientOptions)
    }

    private val partnerCampaigns: PartnerCampaignServiceAsync by lazy {
        PartnerCampaignServiceAsyncImpl(clientOptions)
    }

    private val phoneNumberCampaigns: PhoneNumberCampaignServiceAsync by lazy {
        PhoneNumberCampaignServiceAsyncImpl(clientOptions)
    }

    private val phoneNumberAssignmentByProfile: PhoneNumberAssignmentByProfileServiceAsync by lazy {
        PhoneNumberAssignmentByProfileServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): Messaging10dlcServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): Messaging10dlcServiceAsync =
        Messaging10dlcServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Brand operations */
    override fun brand(): BrandServiceAsync = brand

    /** Campaign operations */
    override fun campaign(): CampaignServiceAsync = campaign

    /** Campaign operations */
    override fun campaignBuilder(): CampaignBuilderServiceAsync = campaignBuilder

    override fun partnerCampaigns(): PartnerCampaignServiceAsync = partnerCampaigns

    /** Phone number campaign assignment */
    override fun phoneNumberCampaigns(): PhoneNumberCampaignServiceAsync = phoneNumberCampaigns

    /** Phone number campaign bulk assignment */
    override fun phoneNumberAssignmentByProfile(): PhoneNumberAssignmentByProfileServiceAsync =
        phoneNumberAssignmentByProfile

    override fun getEnum(
        params: Messaging10dlcGetEnumParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Messaging10dlcGetEnumResponse> =
        // get /10dlc/enum/{endpoint}
        withRawResponse().getEnum(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        Messaging10dlcServiceAsync.WithRawResponse {

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

        private val partnerCampaigns: PartnerCampaignServiceAsync.WithRawResponse by lazy {
            PartnerCampaignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberCampaigns: PhoneNumberCampaignServiceAsync.WithRawResponse by lazy {
            PhoneNumberCampaignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberAssignmentByProfile:
            PhoneNumberAssignmentByProfileServiceAsync.WithRawResponse by lazy {
            PhoneNumberAssignmentByProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): Messaging10dlcServiceAsync.WithRawResponse =
            Messaging10dlcServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Brand operations */
        override fun brand(): BrandServiceAsync.WithRawResponse = brand

        /** Campaign operations */
        override fun campaign(): CampaignServiceAsync.WithRawResponse = campaign

        /** Campaign operations */
        override fun campaignBuilder(): CampaignBuilderServiceAsync.WithRawResponse =
            campaignBuilder

        override fun partnerCampaigns(): PartnerCampaignServiceAsync.WithRawResponse =
            partnerCampaigns

        /** Phone number campaign assignment */
        override fun phoneNumberCampaigns(): PhoneNumberCampaignServiceAsync.WithRawResponse =
            phoneNumberCampaigns

        /** Phone number campaign bulk assignment */
        override fun phoneNumberAssignmentByProfile():
            PhoneNumberAssignmentByProfileServiceAsync.WithRawResponse =
            phoneNumberAssignmentByProfile

        private val getEnumHandler: Handler<Messaging10dlcGetEnumResponse> =
            jsonHandler<Messaging10dlcGetEnumResponse>(clientOptions.jsonMapper)

        override fun getEnum(
            params: Messaging10dlcGetEnumParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Messaging10dlcGetEnumResponse>> {
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
