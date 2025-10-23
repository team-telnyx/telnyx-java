// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.notificationprofiles.NotificationProfile
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileListParams
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NotificationProfileServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationProfileService = client.notificationProfiles()

        val notificationProfile =
            notificationProfileService.create(
                NotificationProfile.builder()
                    .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )

        notificationProfile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationProfileService = client.notificationProfiles()

        val notificationProfile =
            notificationProfileService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        notificationProfile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationProfileService = client.notificationProfiles()

        val notificationProfile =
            notificationProfileService.update(
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

        notificationProfile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationProfileService = client.notificationProfiles()

        val notificationProfiles =
            notificationProfileService.list(
                NotificationProfileListParams.builder()
                    .page(NotificationProfileListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        notificationProfiles.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationProfileService = client.notificationProfiles()

        val notificationProfile =
            notificationProfileService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        notificationProfile.validate()
    }
}
