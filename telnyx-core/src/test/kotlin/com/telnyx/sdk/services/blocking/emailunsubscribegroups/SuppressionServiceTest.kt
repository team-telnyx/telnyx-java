// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailunsubscribegroups

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionCreateParams
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SuppressionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val suppressionService = client.emailUnsubscribeGroups().suppressions()

        val emailBlockResponse =
            suppressionService.create(
                SuppressionCreateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .to("user@example.com")
                    .build()
            )

        emailBlockResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val suppressionService = client.emailUnsubscribeGroups().suppressions()

        val page = suppressionService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val suppressionService = client.emailUnsubscribeGroups().suppressions()

        suppressionService.delete(
            SuppressionDeleteParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .email("email")
                .build()
        )
    }
}
