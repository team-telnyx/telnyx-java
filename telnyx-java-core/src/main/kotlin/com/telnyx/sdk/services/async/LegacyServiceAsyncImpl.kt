// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.legacy.ReportingServiceAsync
import com.telnyx.sdk.services.async.legacy.ReportingServiceAsyncImpl
import java.util.function.Consumer

class LegacyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LegacyServiceAsync {

    private val withRawResponse: LegacyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val reporting: ReportingServiceAsync by lazy {
        ReportingServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): LegacyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegacyServiceAsync =
        LegacyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun reporting(): ReportingServiceAsync = reporting

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LegacyServiceAsync.WithRawResponse {

        private val reporting: ReportingServiceAsync.WithRawResponse by lazy {
            ReportingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LegacyServiceAsync.WithRawResponse =
            LegacyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun reporting(): ReportingServiceAsync.WithRawResponse = reporting
    }
}
