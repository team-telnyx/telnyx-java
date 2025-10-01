// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.legacy.ReportingService
import com.telnyx.sdk.services.blocking.legacy.ReportingServiceImpl
import java.util.function.Consumer

class LegacyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LegacyService {

    private val withRawResponse: LegacyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val reporting: ReportingService by lazy { ReportingServiceImpl(clientOptions) }

    override fun withRawResponse(): LegacyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegacyService =
        LegacyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun reporting(): ReportingService = reporting

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LegacyService.WithRawResponse {

        private val reporting: ReportingService.WithRawResponse by lazy {
            ReportingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LegacyService.WithRawResponse =
            LegacyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun reporting(): ReportingService.WithRawResponse = reporting
    }
}
