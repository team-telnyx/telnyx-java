// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectsCoverageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val virtualCrossConnectsCoverageService = client.virtualCrossConnectsCoverage()

        val page = virtualCrossConnectsCoverageService.list()

        page.response().validate()
    }
}
