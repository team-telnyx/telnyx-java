// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.assistants.tags.TagAddParams
import com.telnyx.sdk.models.ai.assistants.tags.TagRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TagServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tagServiceAsync = client.ai().assistants().tags()

        val tagsFuture = tagServiceAsync.list()

        val tags = tagsFuture.get()
        tags.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tagServiceAsync = client.ai().assistants().tags()

        val responseFuture =
            tagServiceAsync.add(
                TagAddParams.builder().assistantId("assistant_id").tag("tag").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tagServiceAsync = client.ai().assistants().tags()

        val tagFuture =
            tagServiceAsync.remove(
                TagRemoveParams.builder().assistantId("assistant_id").tag("tag").build()
            )

        val tag = tagFuture.get()
        tag.validate()
    }
}
