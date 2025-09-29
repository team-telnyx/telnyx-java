// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.conversations

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.ai.conversations.insights.InsightCreateParams
import com.telnyx.api.models.ai.conversations.insights.InsightListParams
import com.telnyx.api.models.ai.conversations.insights.InsightUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InsightServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightService = client.ai().conversations().insights()

        val insightTemplateDetail =
            insightService.create(
                InsightCreateParams.builder()
                    .instructions("instructions")
                    .name("name")
                    .jsonSchema("string")
                    .webhook("webhook")
                    .build()
            )

        insightTemplateDetail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightService = client.ai().conversations().insights()

        val insightTemplateDetail = insightService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        insightTemplateDetail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightService = client.ai().conversations().insights()

        val insightTemplateDetail =
            insightService.update(
                InsightUpdateParams.builder()
                    .insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .instructions("instructions")
                    .jsonSchema("string")
                    .name("name")
                    .webhook("webhook")
                    .build()
            )

        insightTemplateDetail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightService = client.ai().conversations().insights()

        val insights =
            insightService.list(
                InsightListParams.builder()
                    .page(InsightListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        insights.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightService = client.ai().conversations().insights()

        val insight = insightService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        insight.validate()
    }
}
