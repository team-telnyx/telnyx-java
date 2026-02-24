// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.usagereports.UsageReportGetOptionsParams
import com.telnyx.sdk.models.usagereports.UsageReportListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UsageReportServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val usageReportServiceAsync = client.usageReports()

        val pageFuture =
            usageReportServiceAsync.list(
                UsageReportListParams.builder()
                    .addDimension("string")
                    .addMetric("string")
                    .product("product")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOptions() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val usageReportServiceAsync = client.usageReports()

        val responseFuture =
            usageReportServiceAsync.getOptions(
                UsageReportGetOptionsParams.builder()
                    .product("product")
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
