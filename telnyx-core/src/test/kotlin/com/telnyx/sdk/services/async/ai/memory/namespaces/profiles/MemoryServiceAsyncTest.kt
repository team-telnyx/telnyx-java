// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.memory.namespaces.profiles

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories.MemoryListParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories.MemoryRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MemoryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val memoryServiceAsync = client.ai().memory().namespaces().profiles().memories()

        val memoryFuture =
            memoryServiceAsync.retrieve(
                MemoryRetrieveParams.builder()
                    .namespace("namespace")
                    .profileId("profile_id")
                    .memoryId("memory_id")
                    .build()
            )

        val memory = memoryFuture.get()
        memory.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val memoryServiceAsync = client.ai().memory().namespaces().profiles().memories()

        val pageFuture =
            memoryServiceAsync.list(
                MemoryListParams.builder().namespace("namespace").profileId("profile_id").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
