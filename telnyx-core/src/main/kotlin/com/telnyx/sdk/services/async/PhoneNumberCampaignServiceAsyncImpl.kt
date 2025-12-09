// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class PhoneNumberCampaignServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PhoneNumberCampaignServiceAsync {

    private val withRawResponse: PhoneNumberCampaignServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberCampaignServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PhoneNumberCampaignServiceAsync =
        PhoneNumberCampaignServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberCampaignServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberCampaignServiceAsync.WithRawResponse =
            PhoneNumberCampaignServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
