// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.campaignbuilder.BrandServiceAsync
import com.telnyx.sdk.services.async.campaignbuilder.BrandServiceAsyncImpl
import java.util.function.Consumer

class CampaignBuilderServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CampaignBuilderServiceAsync {

    private val withRawResponse: CampaignBuilderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val brand: BrandServiceAsync by lazy { BrandServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CampaignBuilderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CampaignBuilderServiceAsync =
        CampaignBuilderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun brand(): BrandServiceAsync = brand

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CampaignBuilderServiceAsync.WithRawResponse {

        private val brand: BrandServiceAsync.WithRawResponse by lazy {
            BrandServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignBuilderServiceAsync.WithRawResponse =
            CampaignBuilderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun brand(): BrandServiceAsync.WithRawResponse = brand
    }
}
