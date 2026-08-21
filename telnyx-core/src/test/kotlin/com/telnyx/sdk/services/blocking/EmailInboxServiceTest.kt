// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emailinboxes.EmailInboxCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailInboxServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailInboxService = client.emailInboxes()

        val emailInboxResponse =
            emailInboxService.create(
                EmailInboxCreateParams.builder()
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .username("username")
                    .build()
            )

        emailInboxResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailInboxService = client.emailInboxes()

        val emailInboxResponse = emailInboxService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        emailInboxResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailInboxService = client.emailInboxes()

        val page = emailInboxService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailInboxService = client.emailInboxes()

        emailInboxService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
