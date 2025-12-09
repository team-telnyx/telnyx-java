// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.conversations

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupInsightGroupsParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InsightGroupServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightGroupServiceAsync = client.ai().conversations().insightGroups()

        val insightTemplateGroupDetailFuture =
            insightGroupServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val insightTemplateGroupDetail = insightTemplateGroupDetailFuture.get()
        insightTemplateGroupDetail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightGroupServiceAsync = client.ai().conversations().insightGroups()

        val insightTemplateGroupDetailFuture =
            insightGroupServiceAsync.update(
                InsightGroupUpdateParams.builder()
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .name("name")
                    .webhook("webhook")
                    .build()
            )

        val insightTemplateGroupDetail = insightTemplateGroupDetailFuture.get()
        insightTemplateGroupDetail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightGroupServiceAsync = client.ai().conversations().insightGroups()

        val future = insightGroupServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun insightGroups() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightGroupServiceAsync = client.ai().conversations().insightGroups()

        val insightTemplateGroupDetailFuture =
            insightGroupServiceAsync.insightGroups(
                InsightGroupInsightGroupsParams.builder()
                    .name("name")
                    .description("description")
                    .webhook("webhook")
                    .build()
            )

        val insightTemplateGroupDetail = insightTemplateGroupDetailFuture.get()
        insightTemplateGroupDetail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveInsightGroups() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightGroupServiceAsync = client.ai().conversations().insightGroups()

        val pageFuture = insightGroupServiceAsync.retrieveInsightGroups()

        val page = pageFuture.get()
        page.response().validate()
    }
}
