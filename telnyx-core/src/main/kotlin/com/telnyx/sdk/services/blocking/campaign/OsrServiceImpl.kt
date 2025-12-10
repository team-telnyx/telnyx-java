// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.campaign

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class OsrServiceImpl internal constructor(private val clientOptions: ClientOptions) : OsrService {

    private val withRawResponse: OsrService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OsrService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OsrService =
        OsrServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OsrService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OsrService.WithRawResponse =
            OsrServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
