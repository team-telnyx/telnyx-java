// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.assistants.tags.TagCreateParams
import com.telnyx.sdk.models.ai.assistants.tags.TagDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TagServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tagServiceAsync = client.ai().assistants().tags()

        val tagFuture =
            tagServiceAsync.create(
                TagCreateParams.builder().assistantId("assistant_id").tag("tag").build()
            )

        val tag = tagFuture.get()
        tag.validate()
    }

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
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tagServiceAsync = client.ai().assistants().tags()

        val tagFuture =
            tagServiceAsync.delete(
                TagDeleteParams.builder().assistantId("assistant_id").tag("tag").build()
            )

        val tag = tagFuture.get()
        tag.validate()
    }
}
