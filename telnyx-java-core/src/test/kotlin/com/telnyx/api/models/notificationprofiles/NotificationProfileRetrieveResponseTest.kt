// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.notificationprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationProfileRetrieveResponseTest {

    @Test
    fun create() {
        val notificationProfileRetrieveResponse =
            NotificationProfileRetrieveResponse.builder()
                .data(
                    NotificationProfile.builder()
                        .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .build()

        assertThat(notificationProfileRetrieveResponse.data())
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
        val notificationProfileRetrieveResponse =
            NotificationProfileRetrieveResponse.builder()
                .data(
                    NotificationProfile.builder()
                        .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .build()

        val roundtrippedNotificationProfileRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationProfileRetrieveResponse),
                jacksonTypeRef<NotificationProfileRetrieveResponse>(),
            )

        assertThat(roundtrippedNotificationProfileRetrieveResponse)
            .isEqualTo(notificationProfileRetrieveResponse)
    }
}
