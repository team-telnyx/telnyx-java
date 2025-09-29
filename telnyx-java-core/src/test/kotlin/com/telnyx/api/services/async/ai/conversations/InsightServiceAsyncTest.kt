// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai.conversations

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.ai.conversations.insights.InsightCreateParams
import com.telnyx.api.models.ai.conversations.insights.InsightListParams
import com.telnyx.api.models.ai.conversations.insights.InsightUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InsightServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightServiceAsync = client.ai().conversations().insights()

        val insightTemplateDetailFuture =
            insightServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val insightTemplateDetail = insightTemplateDetailFuture.get()
        insightTemplateDetail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightServiceAsync = client.ai().conversations().insights()

        val insightsFuture =
            insightServiceAsync.list(
                InsightListParams.builder()
                    .page(InsightListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val insights = insightsFuture.get()
        insights.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightServiceAsync = client.ai().conversations().insights()

        val insightFuture = insightServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val insight = insightFuture.get()
        insight.validate()
    }
}
