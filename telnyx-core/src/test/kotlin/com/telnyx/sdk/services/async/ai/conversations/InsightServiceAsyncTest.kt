// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.conversations

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.conversations.insights.InsightCreateParams
import com.telnyx.sdk.models.ai.conversations.insights.InsightUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InsightServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val insightServiceAsync = client.ai().conversations().insights()

        val insightTemplateDetailFuture =
            insightServiceAsync.create(
                InsightCreateParams.builder()
                    .instructions("instructions")
                    .name("name")
                    .jsonSchema("string")
                    .webhook("webhook")
                    .build()
            )

        val insightTemplateDetail = insightTemplateDetailFuture.get()
        insightTemplateDetail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val insightServiceAsync = client.ai().conversations().insights()

        val insightTemplateDetailFuture =
            insightServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val insightTemplateDetail = insightTemplateDetailFuture.get()
        insightTemplateDetail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val insightServiceAsync = client.ai().conversations().insights()

        val insightTemplateDetailFuture =
            insightServiceAsync.update(
                InsightUpdateParams.builder()
                    .insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .instructions("instructions")
                    .jsonSchema("string")
                    .name("name")
                    .webhook("webhook")
                    .build()
            )

        val insightTemplateDetail = insightTemplateDetailFuture.get()
        insightTemplateDetail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val insightServiceAsync = client.ai().conversations().insights()

        val pageFuture = insightServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val insightServiceAsync = client.ai().conversations().insights()

        val future = insightServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }
}
