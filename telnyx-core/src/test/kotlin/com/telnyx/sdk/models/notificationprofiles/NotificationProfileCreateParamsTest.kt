// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationprofiles

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationProfileCreateParamsTest {

    @Test
    fun create() {
        NotificationProfileCreateParams.builder()
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
    fun body() {
        val params =
            NotificationProfileCreateParams.builder()
                .notificationProfile(
                    NotificationProfile.builder()
                        .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .build()

        val body = params._body().getOrNull()

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
        val params = NotificationProfileCreateParams.builder().build()

        val body = params._body().getOrNull()
    }
}
