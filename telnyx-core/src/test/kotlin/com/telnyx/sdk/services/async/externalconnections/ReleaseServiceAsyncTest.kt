// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.externalconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.externalconnections.releases.ReleaseRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReleaseServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val releaseServiceAsync = client.externalConnections().releases()

        val releaseFuture =
            releaseServiceAsync.retrieve(
                ReleaseRetrieveParams.builder()
                    .id("id")
                    .releaseId("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6")
                    .build()
            )

        val release = releaseFuture.get()
        release.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val releaseServiceAsync = client.externalConnections().releases()

        val pageFuture = releaseServiceAsync.list("id")

        val page = pageFuture.get()
        page.response().validate()
    }
}
