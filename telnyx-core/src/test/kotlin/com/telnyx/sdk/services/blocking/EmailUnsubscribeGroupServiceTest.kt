// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupCreateParams
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupDeleteParams
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailUnsubscribeGroupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailUnsubscribeGroupService = client.emailUnsubscribeGroups()

        val unsubscribeGroupResponse =
            emailUnsubscribeGroupService.create(
                EmailUnsubscribeGroupCreateParams.builder()
                    .name("Marketing Newsletter")
                    .description("Weekly product updates and promotions")
                    .build()
            )

        unsubscribeGroupResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailUnsubscribeGroupService = client.emailUnsubscribeGroups()

        val unsubscribeGroupResponse =
            emailUnsubscribeGroupService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        unsubscribeGroupResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailUnsubscribeGroupService = client.emailUnsubscribeGroups()

        val unsubscribeGroupResponse =
            emailUnsubscribeGroupService.update(
                EmailUnsubscribeGroupUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("Weekly product updates and promotions")
                    .name("x")
                    .build()
            )

        unsubscribeGroupResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailUnsubscribeGroupService = client.emailUnsubscribeGroups()

        val page = emailUnsubscribeGroupService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailUnsubscribeGroupService = client.emailUnsubscribeGroups()

        emailUnsubscribeGroupService.delete(
            EmailUnsubscribeGroupDeleteParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .force(EmailUnsubscribeGroupDeleteParams.Force.UnionMember0.TRUE)
                .build()
        )
    }
}
