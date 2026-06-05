// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises.dir

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class PhoneNumberBatchServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PhoneNumberBatchServiceAsync {

    private val withRawResponse: PhoneNumberBatchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberBatchServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PhoneNumberBatchServiceAsync =
        PhoneNumberBatchServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberBatchServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberBatchServiceAsync.WithRawResponse =
            PhoneNumberBatchServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
