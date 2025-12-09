// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationEventListResponseTest {

    @Test
    fun create() {
        val notificationEventListResponse =
            NotificationEventListResponse.builder()
                .id("d5c395cd-9864-4609-b5e2-3f9fd4ce201a")
                .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .enabled(true)
                .name("Emergency Number Dialed")
                .notificationCategory("Calls")
                .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .build()

        assertThat(notificationEventListResponse.id())
            .contains("d5c395cd-9864-4609-b5e2-3f9fd4ce201a")
        assertThat(notificationEventListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
        assertThat(notificationEventListResponse.enabled()).contains(true)
        assertThat(notificationEventListResponse.name()).contains("Emergency Number Dialed")
        assertThat(notificationEventListResponse.notificationCategory()).contains("Calls")
        assertThat(notificationEventListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationEventListResponse =
            NotificationEventListResponse.builder()
                .id("d5c395cd-9864-4609-b5e2-3f9fd4ce201a")
                .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .enabled(true)
                .name("Emergency Number Dialed")
                .notificationCategory("Calls")
                .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .build()

        val roundtrippedNotificationEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationEventListResponse),
                jacksonTypeRef<NotificationEventListResponse>(),
            )

        assertThat(roundtrippedNotificationEventListResponse)
            .isEqualTo(notificationEventListResponse)
    }
}
