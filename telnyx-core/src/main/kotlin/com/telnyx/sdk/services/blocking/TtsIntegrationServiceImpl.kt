// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.ttsintegrations.ActionService
import com.telnyx.sdk.services.blocking.ttsintegrations.ActionServiceImpl
import java.util.function.Consumer

class TtsIntegrationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TtsIntegrationService {

    private val withRawResponse: TtsIntegrationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): TtsIntegrationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TtsIntegrationService =
        TtsIntegrationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TtsIntegrationService.WithRawResponse {

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TtsIntegrationService.WithRawResponse =
            TtsIntegrationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions
    }
}
