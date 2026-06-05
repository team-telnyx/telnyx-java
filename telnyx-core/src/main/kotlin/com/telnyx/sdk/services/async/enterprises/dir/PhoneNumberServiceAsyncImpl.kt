// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises.dir

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class PhoneNumberServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PhoneNumberServiceAsync {

    private val withRawResponse: PhoneNumberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberServiceAsync =
        PhoneNumberServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberServiceAsync.WithRawResponse =
            PhoneNumberServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
