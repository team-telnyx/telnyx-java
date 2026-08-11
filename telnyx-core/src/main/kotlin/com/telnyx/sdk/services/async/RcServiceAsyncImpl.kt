// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.rcs.AgentServiceAsync
import com.telnyx.sdk.services.async.rcs.AgentServiceAsyncImpl
import com.telnyx.sdk.services.async.rcs.BrandServiceAsync
import com.telnyx.sdk.services.async.rcs.BrandServiceAsyncImpl
import java.util.function.Consumer

class RcServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RcServiceAsync {

    private val withRawResponse: RcServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val agents: AgentServiceAsync by lazy { AgentServiceAsyncImpl(clientOptions) }

    private val brands: BrandServiceAsync by lazy { BrandServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): RcServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcServiceAsync =
        RcServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage RCS agent registration, testing, verification, and launch. */
    override fun agents(): AgentServiceAsync = agents

    /** Manage the legal business entities that operate RCS agents. */
    override fun brands(): BrandServiceAsync = brands

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RcServiceAsync.WithRawResponse {

        private val agents: AgentServiceAsync.WithRawResponse by lazy {
            AgentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val brands: BrandServiceAsync.WithRawResponse by lazy {
            BrandServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RcServiceAsync.WithRawResponse =
            RcServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage RCS agent registration, testing, verification, and launch. */
        override fun agents(): AgentServiceAsync.WithRawResponse = agents

        /** Manage the legal business entities that operate RCS agents. */
        override fun brands(): BrandServiceAsync.WithRawResponse = brands
    }
}
