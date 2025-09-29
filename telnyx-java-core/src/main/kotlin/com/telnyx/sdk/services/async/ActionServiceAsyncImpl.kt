// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.actions.PurchaseServiceAsync
import com.telnyx.sdk.services.async.actions.PurchaseServiceAsyncImpl
import com.telnyx.sdk.services.async.actions.RegisterServiceAsync
import com.telnyx.sdk.services.async.actions.RegisterServiceAsyncImpl
import java.util.function.Consumer

class ActionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionServiceAsync {

    private val withRawResponse: ActionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val purchase: PurchaseServiceAsync by lazy { PurchaseServiceAsyncImpl(clientOptions) }

    private val register: RegisterServiceAsync by lazy { RegisterServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ActionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync =
        ActionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun purchase(): PurchaseServiceAsync = purchase

    override fun register(): RegisterServiceAsync = register

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionServiceAsync.WithRawResponse {

        private val purchase: PurchaseServiceAsync.WithRawResponse by lazy {
            PurchaseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val register: RegisterServiceAsync.WithRawResponse by lazy {
            RegisterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse =
            ActionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun purchase(): PurchaseServiceAsync.WithRawResponse = purchase

        override fun register(): RegisterServiceAsync.WithRawResponse = register
    }
}
