// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.notificationprofiles.NotificationProfile
import com.telnyx.api.models.notificationprofiles.NotificationProfileListParams
import com.telnyx.api.models.notificationprofiles.NotificationProfileUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NotificationProfileServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationProfileServiceAsync = client.notificationProfiles()

        val notificationProfileFuture =
            notificationProfileServiceAsync.create(
                NotificationProfile.builder()
                    .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )

        val notificationProfile = notificationProfileFuture.get()
        notificationProfile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationProfileServiceAsync = client.notificationProfiles()

        val notificationProfileFuture =
            notificationProfileServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val notificationProfile = notificationProfileFuture.get()
        notificationProfile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationProfileServiceAsync = client.notificationProfiles()

        val notificationProfileFuture =
            notificationProfileServiceAsync.update(
                NotificationProfileUpdateParams.builder()
                    .pathId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .notificationProfile(
                        NotificationProfile.builder()
                            .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                            .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                            .name("name")
                            .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                            .build()
                    )
                    .build()
            )

        val notificationProfile = notificationProfileFuture.get()
        notificationProfile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationProfileServiceAsync = client.notificationProfiles()

        val notificationProfilesFuture =
            notificationProfileServiceAsync.list(
                NotificationProfileListParams.builder()
                    .page(NotificationProfileListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val notificationProfiles = notificationProfilesFuture.get()
        notificationProfiles.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationProfileServiceAsync = client.notificationProfiles()

        val notificationProfileFuture =
            notificationProfileServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val notificationProfile = notificationProfileFuture.get()
        notificationProfile.validate()
    }
}
