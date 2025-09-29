// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.conversations.insightgroups

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.ai.conversations.insightgroups.insights.InsightAssignParams
import com.telnyx.api.models.ai.conversations.insightgroups.insights.InsightDeleteUnassignParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InsightServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun assign() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightService = client.ai().conversations().insightGroups().insights()

        val response =
            insightService.assign(
                InsightAssignParams.builder()
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteUnassign() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightService = client.ai().conversations().insightGroups().insights()

        val response =
            insightService.deleteUnassign(
                InsightDeleteUnassignParams.builder()
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
