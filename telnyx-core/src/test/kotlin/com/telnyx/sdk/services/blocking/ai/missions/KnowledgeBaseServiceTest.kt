// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseDeleteKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseGetKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseUpdateKnowledgeBaseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class KnowledgeBaseServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createKnowledgeBase() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val knowledgeBaseService = client.ai().missions().knowledgeBases()

        val response = knowledgeBaseService.createKnowledgeBase("mission_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteKnowledgeBase() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val knowledgeBaseService = client.ai().missions().knowledgeBases()

        knowledgeBaseService.deleteKnowledgeBase(
            KnowledgeBaseDeleteKnowledgeBaseParams.builder()
                .missionId("mission_id")
                .knowledgeBaseId("knowledge_base_id")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getKnowledgeBase() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val knowledgeBaseService = client.ai().missions().knowledgeBases()

        val response =
            knowledgeBaseService.getKnowledgeBase(
                KnowledgeBaseGetKnowledgeBaseParams.builder()
                    .missionId("mission_id")
                    .knowledgeBaseId("knowledge_base_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listKnowledgeBases() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val knowledgeBaseService = client.ai().missions().knowledgeBases()

        val response = knowledgeBaseService.listKnowledgeBases("mission_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateKnowledgeBase() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val knowledgeBaseService = client.ai().missions().knowledgeBases()

        val response =
            knowledgeBaseService.updateKnowledgeBase(
                KnowledgeBaseUpdateKnowledgeBaseParams.builder()
                    .missionId("mission_id")
                    .knowledgeBaseId("knowledge_base_id")
                    .build()
            )

        response.validate()
    }
}
