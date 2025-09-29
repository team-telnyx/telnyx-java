// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.blocking.operatorconnect.ActionService
import com.telnyx.api.services.blocking.operatorconnect.ActionServiceImpl
import java.util.function.Consumer

class OperatorConnectServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OperatorConnectService {

    private val withRawResponse: OperatorConnectService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): OperatorConnectService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperatorConnectService =
        OperatorConnectServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OperatorConnectService.WithRawResponse {

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OperatorConnectService.WithRawResponse =
            OperatorConnectServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions
    }
}
