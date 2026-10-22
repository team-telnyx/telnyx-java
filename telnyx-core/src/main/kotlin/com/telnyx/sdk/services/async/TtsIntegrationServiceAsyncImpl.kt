// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.ttsintegrations.ActionServiceAsync
import com.telnyx.sdk.services.async.ttsintegrations.ActionServiceAsyncImpl
import java.util.function.Consumer

class TtsIntegrationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : TtsIntegrationServiceAsync {

    private val withRawResponse: TtsIntegrationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TtsIntegrationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): TtsIntegrationServiceAsync =
        TtsIntegrationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionServiceAsync = actions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TtsIntegrationServiceAsync.WithRawResponse {

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TtsIntegrationServiceAsync.WithRawResponse =
            TtsIntegrationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionServiceAsync.WithRawResponse = actions
    }
}
