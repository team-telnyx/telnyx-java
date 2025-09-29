// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai.conversations.insightgroups

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.ai.conversations.insightgroups.insights.InsightAssignParams
import com.telnyx.api.models.ai.conversations.insightgroups.insights.InsightDeleteUnassignParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InsightServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun assign() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightServiceAsync = client.ai().conversations().insightGroups().insights()

        val responseFuture =
            insightServiceAsync.assign(
                InsightAssignParams.builder()
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteUnassign() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val insightServiceAsync = client.ai().conversations().insightGroups().insights()

        val responseFuture =
            insightServiceAsync.deleteUnassign(
                InsightDeleteUnassignParams.builder()
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
