// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.compute.funcs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.compute.funcs.export.ExportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExportServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val exportServiceAsync = client.compute().funcs().export()

        val funcLogExportConfigResponseFuture =
            exportServiceAsync.create(
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

        val funcLogExportConfigResponse = funcLogExportConfigResponseFuture.get()
        funcLogExportConfigResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val exportServiceAsync = client.compute().funcs().export()

        val funcLogExportConfigResponseFuture = exportServiceAsync.list("id")

        val funcLogExportConfigResponse = funcLogExportConfigResponseFuture.get()
        funcLogExportConfigResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAll() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val exportServiceAsync = client.compute().funcs().export()

        val future = exportServiceAsync.deleteAll("id")

        val response = future.get()
    }
}
