// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseDeleteKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseGetKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseUpdateKnowledgeBaseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class KnowledgeBaseServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createKnowledgeBase() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val knowledgeBaseServiceAsync = client.ai().missions().knowledgeBases()

        val responseFuture = knowledgeBaseServiceAsync.createKnowledgeBase("mission_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteKnowledgeBase() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val knowledgeBaseServiceAsync = client.ai().missions().knowledgeBases()

        val future =
            knowledgeBaseServiceAsync.deleteKnowledgeBase(
                KnowledgeBaseDeleteKnowledgeBaseParams.builder()
                    .missionId("mission_id")
                    .knowledgeBaseId("knowledge_base_id")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getKnowledgeBase() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val knowledgeBaseServiceAsync = client.ai().missions().knowledgeBases()

        val responseFuture =
            knowledgeBaseServiceAsync.getKnowledgeBase(
                KnowledgeBaseGetKnowledgeBaseParams.builder()
                    .missionId("mission_id")
                    .knowledgeBaseId("knowledge_base_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listKnowledgeBases() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val knowledgeBaseServiceAsync = client.ai().missions().knowledgeBases()

        val responseFuture = knowledgeBaseServiceAsync.listKnowledgeBases("mission_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateKnowledgeBase() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val knowledgeBaseServiceAsync = client.ai().missions().knowledgeBases()

        val responseFuture =
            knowledgeBaseServiceAsync.updateKnowledgeBase(
                KnowledgeBaseUpdateKnowledgeBaseParams.builder()
                    .missionId("mission_id")
                    .knowledgeBaseId("knowledge_base_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
