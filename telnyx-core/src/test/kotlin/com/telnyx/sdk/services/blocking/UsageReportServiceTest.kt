// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.usagereports.UsageReportGetOptionsParams
import com.telnyx.sdk.models.usagereports.UsageReportListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UsageReportServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val usageReportService = client.usageReports()

        val page =
            usageReportService.list(
                UsageReportListParams.builder()
                    .addDimension("string")
                    .addMetric("string")
                    .product("product")
                    .build()
            )

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOptions() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val usageReportService = client.usageReports()

        val response =
            usageReportService.getOptions(
                UsageReportGetOptionsParams.builder()
                    .product("product")
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        response.validate()
    }
}
