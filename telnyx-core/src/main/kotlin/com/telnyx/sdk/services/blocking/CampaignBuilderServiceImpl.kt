// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.campaignbuilder.BrandService
import com.telnyx.sdk.services.blocking.campaignbuilder.BrandServiceImpl
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

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CampaignBuilderService.WithRawResponse {

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
    }
}
