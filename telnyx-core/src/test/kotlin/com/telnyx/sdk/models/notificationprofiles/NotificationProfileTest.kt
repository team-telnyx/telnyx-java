// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationProfileTest {

    @Test
    fun create() {
        val notificationProfile =
            NotificationProfile.builder()
                .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .build()

        assertThat(notificationProfile.id()).contains("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
        assertThat(notificationProfile.createdAt())
            .contains(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
        assertThat(notificationProfile.name()).contains("name")
        assertThat(notificationProfile.updatedAt())
            .contains(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationProfile =
            NotificationProfile.builder()
                .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .build()

        val roundtrippedNotificationProfile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationProfile),
                jacksonTypeRef<NotificationProfile>(),
            )

        assertThat(roundtrippedNotificationProfile).isEqualTo(notificationProfile)
    }
}
