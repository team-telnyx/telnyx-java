// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.externalconnections.releases.ReleaseRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReleaseServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val releaseService = client.externalConnections().releases()

        val release =
            releaseService.retrieve(
                ReleaseRetrieveParams.builder()
                    .id("id")
                    .releaseId("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6")
                    .build()
            )

        release.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val releaseService = client.externalConnections().releases()

        val page = releaseService.list("id")

        page.response().validate()
    }
}
