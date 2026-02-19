// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.conversations.insightgroups

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightAssignParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightDeleteUnassignParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InsightServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun assign() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val insightServiceAsync = client.ai().conversations().insightGroups().insights()

        val future =
            insightServiceAsync.assign(
                InsightAssignParams.builder()
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteUnassign() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val insightServiceAsync = client.ai().conversations().insightGroups().insights()

        val future =
            insightServiceAsync.deleteUnassign(
                InsightDeleteUnassignParams.builder()
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }
}
