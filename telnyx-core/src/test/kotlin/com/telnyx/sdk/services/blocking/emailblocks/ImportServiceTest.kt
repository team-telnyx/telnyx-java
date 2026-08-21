// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailblocks

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emailblocks.imports.ImportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ImportServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val importService = client.emailBlocks().imports()

        val emailBlockImportResponse =
            importService.create(
                ImportCreateParams.builder()
                    .file("Example data".byteInputStream())
                    .blockTtlDays(30L)
                    .build()
            )

        emailBlockImportResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val importService = client.emailBlocks().imports()

        val emailBlockImportResponse =
            importService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        emailBlockImportResponse.validate()
    }
}
