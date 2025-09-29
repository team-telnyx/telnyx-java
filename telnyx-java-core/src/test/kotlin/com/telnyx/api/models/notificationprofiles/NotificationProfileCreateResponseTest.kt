// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.notificationprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationProfileCreateResponseTest {

    @Test
    fun create() {
        val notificationProfileCreateResponse =
            NotificationProfileCreateResponse.builder()
                .data(
                    NotificationProfile.builder()
                        .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .build()

        assertThat(notificationProfileCreateResponse.data())
            .contains(
                NotificationProfile.builder()
                    .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationProfileCreateResponse =
            NotificationProfileCreateResponse.builder()
                .data(
                    NotificationProfile.builder()
                        .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .build()

        val roundtrippedNotificationProfileCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationProfileCreateResponse),
                jacksonTypeRef<NotificationProfileCreateResponse>(),
            )

        assertThat(roundtrippedNotificationProfileCreateResponse)
            .isEqualTo(notificationProfileCreateResponse)
    }
}
