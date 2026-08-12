// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupCreateParams
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupDeleteParams
import com.telnyx.sdk.models.emailunsubscribegroups.EmailUnsubscribeGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailUnsubscribeGroupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailUnsubscribeGroupServiceAsync = client.emailUnsubscribeGroups()

        val unsubscribeGroupResponseFuture =
            emailUnsubscribeGroupServiceAsync.create(
                EmailUnsubscribeGroupCreateParams.builder()
                    .name("Marketing Newsletter")
                    .description("Weekly product updates and promotions")
                    .build()
            )

        val unsubscribeGroupResponse = unsubscribeGroupResponseFuture.get()
        unsubscribeGroupResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailUnsubscribeGroupServiceAsync = client.emailUnsubscribeGroups()

        val unsubscribeGroupResponseFuture =
            emailUnsubscribeGroupServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val unsubscribeGroupResponse = unsubscribeGroupResponseFuture.get()
        unsubscribeGroupResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailUnsubscribeGroupServiceAsync = client.emailUnsubscribeGroups()

        val unsubscribeGroupResponseFuture =
            emailUnsubscribeGroupServiceAsync.update(
                EmailUnsubscribeGroupUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("Weekly product updates and promotions")
                    .name("x")
                    .build()
            )

        val unsubscribeGroupResponse = unsubscribeGroupResponseFuture.get()
        unsubscribeGroupResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailUnsubscribeGroupServiceAsync = client.emailUnsubscribeGroups()

        val pageFuture = emailUnsubscribeGroupServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailUnsubscribeGroupServiceAsync = client.emailUnsubscribeGroups()

        val future =
            emailUnsubscribeGroupServiceAsync.delete(
                EmailUnsubscribeGroupDeleteParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .force(EmailUnsubscribeGroupDeleteParams.Force.UnionMember0.TRUE)
                    .build()
            )

        val response = future.get()
    }
}
