// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.assistants.tags.TagAddParams
import com.telnyx.sdk.models.ai.assistants.tags.TagRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TagServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tagService = client.ai().assistants().tags()

        val tagsResponse = tagService.list()

        tagsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tagService = client.ai().assistants().tags()

        val tagsResponse =
            tagService.add(TagAddParams.builder().assistantId("assistant_id").tag("tag").build())

        tagsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tagService = client.ai().assistants().tags()

        val tagsResponse =
            tagService.remove(
                TagRemoveParams.builder().assistantId("assistant_id").tag("tag").build()
            )

        tagsResponse.validate()
    }
}
