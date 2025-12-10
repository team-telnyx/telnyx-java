// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.campaign.OsrService
import com.telnyx.sdk.services.blocking.campaign.OsrServiceImpl
import com.telnyx.sdk.services.blocking.campaign.UsecaseService
import com.telnyx.sdk.services.blocking.campaign.UsecaseServiceImpl
import java.util.function.Consumer

class CampaignServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CampaignService {

    private val withRawResponse: CampaignService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val usecase: UsecaseService by lazy { UsecaseServiceImpl(clientOptions) }

    private val osr: OsrService by lazy { OsrServiceImpl(clientOptions) }

    override fun withRawResponse(): CampaignService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignService =
        CampaignServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun usecase(): UsecaseService = usecase

    override fun osr(): OsrService = osr

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CampaignService.WithRawResponse {

        private val usecase: UsecaseService.WithRawResponse by lazy {
            UsecaseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val osr: OsrService.WithRawResponse by lazy {
            OsrServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignService.WithRawResponse =
            CampaignServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun usecase(): UsecaseService.WithRawResponse = usecase

        override fun osr(): OsrService.WithRawResponse = osr
    }
}
