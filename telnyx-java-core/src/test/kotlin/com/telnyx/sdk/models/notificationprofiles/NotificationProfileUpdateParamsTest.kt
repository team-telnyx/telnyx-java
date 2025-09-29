// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationprofiles

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationProfileUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            NotificationProfileUpdateParams.builder()
                .pathId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .notificationProfile(NotificationProfile.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NotificationProfile.builder()
                    .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NotificationProfileUpdateParams.builder()
                .pathId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .notificationProfile(NotificationProfile.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(NotificationProfile.builder().build())
    }
}
