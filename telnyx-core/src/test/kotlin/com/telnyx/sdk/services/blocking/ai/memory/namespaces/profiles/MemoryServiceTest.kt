// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.memory.namespaces.profiles

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories.MemoryListParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories.MemoryRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MemoryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val memoryService = client.ai().memory().namespaces().profiles().memories()

        val memory =
            memoryService.retrieve(
                MemoryRetrieveParams.builder()
                    .namespace("namespace")
                    .profileId("profile_id")
                    .memoryId("memory_id")
                    .build()
            )

        memory.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val memoryService = client.ai().memory().namespaces().profiles().memories()

        val page =
            memoryService.list(
                MemoryListParams.builder().namespace("namespace").profileId("profile_id").build()
            )

        page.response().validate()
    }
}
