// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.conversations.insightgroups

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightAssignParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightDeleteUnassignParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InsightServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun assign() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val insightService = client.ai().conversations().insightGroups().insights()

        insightService.assign(
            InsightAssignParams.builder()
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteUnassign() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val insightService = client.ai().conversations().insightGroups().insights()

        insightService.deleteUnassign(
            InsightDeleteUnassignParams.builder()
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
