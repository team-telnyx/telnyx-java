// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberBatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberBatchService = client.dir().phoneNumberBatches()

        val phoneNumberBatch =
            phoneNumberBatchService.retrieve(
                PhoneNumberBatchRetrieveParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .batchId("0a4b1f5e-2f12-4c0c-9a98-9b3a7d8b8e62")
                    .build()
            )

        phoneNumberBatch.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberBatchService = client.dir().phoneNumberBatches()

        val page = phoneNumberBatchService.list("16635d38-75a6-4481-82e8-69af60e05011")

        page.response().validate()
    }
}
