// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.actions.PurchaseService
import com.telnyx.sdk.services.blocking.actions.PurchaseServiceImpl
import com.telnyx.sdk.services.blocking.actions.RegisterService
import com.telnyx.sdk.services.blocking.actions.RegisterServiceImpl
import java.util.function.Consumer

class ActionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionService {

    private val withRawResponse: ActionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val purchase: PurchaseService by lazy { PurchaseServiceImpl(clientOptions) }

    private val register: RegisterService by lazy { RegisterServiceImpl(clientOptions) }

    override fun withRawResponse(): ActionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService =
        ActionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** SIM Cards operations */
    override fun purchase(): PurchaseService = purchase

    /** SIM Cards operations */
    override fun register(): RegisterService = register

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionService.WithRawResponse {

        private val purchase: PurchaseService.WithRawResponse by lazy {
            PurchaseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val register: RegisterService.WithRawResponse by lazy {
            RegisterServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionService.WithRawResponse =
            ActionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** SIM Cards operations */
        override fun purchase(): PurchaseService.WithRawResponse = purchase

        /** SIM Cards operations */
        override fun register(): RegisterService.WithRawResponse = register
    }
}
