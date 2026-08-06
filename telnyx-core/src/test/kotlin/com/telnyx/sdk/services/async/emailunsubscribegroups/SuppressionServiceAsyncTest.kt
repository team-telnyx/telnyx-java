// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailunsubscribegroups

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionCreateParams
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SuppressionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val suppressionServiceAsync = client.emailUnsubscribeGroups().suppressions()

        val emailBlockResponseFuture =
            suppressionServiceAsync.create(
                SuppressionCreateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .to("user@example.com")
                    .build()
            )

        val emailBlockResponse = emailBlockResponseFuture.get()
        emailBlockResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val suppressionServiceAsync = client.emailUnsubscribeGroups().suppressions()

        val pageFuture = suppressionServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val suppressionServiceAsync = client.emailUnsubscribeGroups().suppressions()

        val future =
            suppressionServiceAsync.delete(
                SuppressionDeleteParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .email("email")
                    .build()
            )

        val response = future.get()
    }
}
