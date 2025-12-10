// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class PartnerCampaignServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PartnerCampaignService {

    private val withRawResponse: PartnerCampaignService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PartnerCampaignService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PartnerCampaignService =
        PartnerCampaignServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PartnerCampaignService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PartnerCampaignService.WithRawResponse =
            PartnerCampaignServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
