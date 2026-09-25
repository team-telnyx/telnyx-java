// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.memory.namespaces.profiles

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceDeleteParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceListParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SourceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sourceService = client.ai().memory().namespaces().profiles().sources()

        val source =
            sourceService.retrieve(
                SourceRetrieveParams.builder()
                    .namespace("namespace")
                    .profileId("profile_id")
                    .sourceId("source_id")
                    .build()
            )

        source.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sourceService = client.ai().memory().namespaces().profiles().sources()

        val page =
            sourceService.list(
                SourceListParams.builder().namespace("namespace").profileId("profile_id").build()
            )

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sourceService = client.ai().memory().namespaces().profiles().sources()

        val source =
            sourceService.delete(
                SourceDeleteParams.builder()
                    .namespace("namespace")
                    .profileId("profile_id")
                    .sourceId("source_id")
                    .build()
            )

        source.validate()
    }
}
