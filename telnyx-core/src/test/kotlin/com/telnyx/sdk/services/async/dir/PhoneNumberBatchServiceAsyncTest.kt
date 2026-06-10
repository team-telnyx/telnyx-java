// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.dir

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberBatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberBatchServiceAsync = client.dir().phoneNumberBatches()

        val phoneNumberBatchFuture =
            phoneNumberBatchServiceAsync.retrieve(
                PhoneNumberBatchRetrieveParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .batchId("0a4b1f5e-2f12-4c0c-9a98-9b3a7d8b8e62")
                    .build()
            )

        val phoneNumberBatch = phoneNumberBatchFuture.get()
        phoneNumberBatch.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberBatchServiceAsync = client.dir().phoneNumberBatches()

        val pageFuture = phoneNumberBatchServiceAsync.list("16635d38-75a6-4481-82e8-69af60e05011")

        val page = pageFuture.get()
        page.response().validate()
    }
}
