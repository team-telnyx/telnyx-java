// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.memory.namespaces.profiles

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceDeleteParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceListParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SourceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sourceServiceAsync = client.ai().memory().namespaces().profiles().sources()

        val sourceFuture =
            sourceServiceAsync.retrieve(
                SourceRetrieveParams.builder()
                    .namespace("namespace")
                    .profileId("profile_id")
                    .sourceId("source_id")
                    .build()
            )

        val source = sourceFuture.get()
        source.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sourceServiceAsync = client.ai().memory().namespaces().profiles().sources()

        val pageFuture =
            sourceServiceAsync.list(
                SourceListParams.builder().namespace("namespace").profileId("profile_id").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sourceServiceAsync = client.ai().memory().namespaces().profiles().sources()

        val sourceFuture =
            sourceServiceAsync.delete(
                SourceDeleteParams.builder()
                    .namespace("namespace")
                    .profileId("profile_id")
                    .sourceId("source_id")
                    .build()
            )

        val source = sourceFuture.get()
        source.validate()
    }
}
