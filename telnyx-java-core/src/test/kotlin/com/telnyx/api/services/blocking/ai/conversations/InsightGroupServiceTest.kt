// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.conversations

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.ai.conversations.insightgroups.InsightGroupInsightGroupsParams
import com.telnyx.api.models.ai.conversations.insightgroups.InsightGroupRetrieveInsightGroupsParams
import com.telnyx.api.models.ai.conversations.insightgroups.InsightGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InsightGroupServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightGroupService = client.ai().conversations().insightGroups()

        val insightTemplateGroupDetail =
            insightGroupService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        insightTemplateGroupDetail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightGroupService = client.ai().conversations().insightGroups()

        val insightTemplateGroupDetail =
            insightGroupService.update(
                InsightGroupUpdateParams.builder()
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .name("name")
                    .webhook("webhook")
                    .build()
            )

        insightTemplateGroupDetail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightGroupService = client.ai().conversations().insightGroups()

        val insightGroup = insightGroupService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        insightGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun insightGroups() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightGroupService = client.ai().conversations().insightGroups()

        val insightTemplateGroupDetail =
            insightGroupService.insightGroups(
                InsightGroupInsightGroupsParams.builder()
                    .name("name")
                    .description("description")
                    .webhook("webhook")
                    .build()
            )

        insightTemplateGroupDetail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveInsightGroups() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightGroupService = client.ai().conversations().insightGroups()

        val response =
            insightGroupService.retrieveInsightGroups(
                InsightGroupRetrieveInsightGroupsParams.builder()
                    .page(
                        InsightGroupRetrieveInsightGroupsParams.Page.builder()
                            .number(1L)
                            .size(1L)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
