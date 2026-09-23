// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.compute.funcs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.compute.funcs.export.ExportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExportServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val exportService = client.compute().funcs().export()

        val funcLogExportConfigResponse =
            exportService.create(
                ExportCreateParams.builder()
                    .id("id")
                    .endpoint("https://api.honeycomb.io/v1/logs")
                    .headers(
                        ExportCreateParams.Headers.builder()
                            .putAdditionalProperty("x-honeycomb-team", JsonValue.from("abc123"))
                            .build()
                    )
                    .invocationExportEnabled(true)
                    .runtimeExportEnabled(true)
                    .build()
            )

        funcLogExportConfigResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val exportService = client.compute().funcs().export()

        val funcLogExportConfigResponse = exportService.list("id")

        funcLogExportConfigResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAll() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val exportService = client.compute().funcs().export()

        exportService.deleteAll("id")
    }
}
