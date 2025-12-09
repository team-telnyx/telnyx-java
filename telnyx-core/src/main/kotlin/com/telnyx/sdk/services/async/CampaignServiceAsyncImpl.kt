// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.campaign.OsrServiceAsync
import com.telnyx.sdk.services.async.campaign.OsrServiceAsyncImpl
import com.telnyx.sdk.services.async.campaign.UsecaseServiceAsync
import com.telnyx.sdk.services.async.campaign.UsecaseServiceAsyncImpl
import java.util.function.Consumer

class CampaignServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CampaignServiceAsync {

    private val withRawResponse: CampaignServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val usecase: UsecaseServiceAsync by lazy { UsecaseServiceAsyncImpl(clientOptions) }

    private val osr: OsrServiceAsync by lazy { OsrServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CampaignServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignServiceAsync =
        CampaignServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun usecase(): UsecaseServiceAsync = usecase

    override fun osr(): OsrServiceAsync = osr

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CampaignServiceAsync.WithRawResponse {

        private val usecase: UsecaseServiceAsync.WithRawResponse by lazy {
            UsecaseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val osr: OsrServiceAsync.WithRawResponse by lazy {
            OsrServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignServiceAsync.WithRawResponse =
            CampaignServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun usecase(): UsecaseServiceAsync.WithRawResponse = usecase

        override fun osr(): OsrServiceAsync.WithRawResponse = osr
    }
}
