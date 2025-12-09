// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationeventconditions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationEventConditionListResponseTest {

    @Test
    fun create() {
        val notificationEventConditionListResponse =
            NotificationEventConditionListResponse.builder()
                .id("70c7c5cb-dce2-4124-accb-870d39dbe852")
                .allowMultipleChannels(false)
                .associatedRecordType(
                    NotificationEventConditionListResponse.AssociatedRecordType.PHONE_NUMBER
                )
                .asynchronous(true)
                .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .description("When emergency number dialed from phone number X")
                .enabled(true)
                .name("from phone number")
                .notificationEventId("d5c395cd-9864-4609-b5e2-3f9fd4ce201a")
                .addParameter(
                    NotificationEventConditionListResponse.Parameter.builder()
                        .dataType("string")
                        .name("phone_number")
                        .optional(false)
                        .build()
                )
                .supportedChannels(listOf("webhook", "sms", "email", "voice"))
                .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .build()

        assertThat(notificationEventConditionListResponse.id())
            .contains("70c7c5cb-dce2-4124-accb-870d39dbe852")
        assertThat(notificationEventConditionListResponse.allowMultipleChannels()).contains(false)
        assertThat(notificationEventConditionListResponse.associatedRecordType())
            .contains(NotificationEventConditionListResponse.AssociatedRecordType.PHONE_NUMBER)
        assertThat(notificationEventConditionListResponse.asynchronous()).contains(true)
        assertThat(notificationEventConditionListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
        assertThat(notificationEventConditionListResponse.description())
            .contains("When emergency number dialed from phone number X")
        assertThat(notificationEventConditionListResponse.enabled()).contains(true)
        assertThat(notificationEventConditionListResponse.name()).contains("from phone number")
        assertThat(notificationEventConditionListResponse.notificationEventId())
            .contains("d5c395cd-9864-4609-b5e2-3f9fd4ce201a")
        assertThat(notificationEventConditionListResponse.parameters().getOrNull())
            .containsExactly(
                NotificationEventConditionListResponse.Parameter.builder()
                    .dataType("string")
                    .name("phone_number")
                    .optional(false)
                    .build()
            )
        assertThat(notificationEventConditionListResponse.supportedChannels().getOrNull())
            .containsExactly("webhook", "sms", "email", "voice")
        assertThat(notificationEventConditionListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationEventConditionListResponse =
            NotificationEventConditionListResponse.builder()
                .id("70c7c5cb-dce2-4124-accb-870d39dbe852")
                .allowMultipleChannels(false)
                .associatedRecordType(
                    NotificationEventConditionListResponse.AssociatedRecordType.PHONE_NUMBER
                )
                .asynchronous(true)
                .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .description("When emergency number dialed from phone number X")
                .enabled(true)
                .name("from phone number")
                .notificationEventId("d5c395cd-9864-4609-b5e2-3f9fd4ce201a")
                .addParameter(
                    NotificationEventConditionListResponse.Parameter.builder()
                        .dataType("string")
                        .name("phone_number")
                        .optional(false)
                        .build()
                )
                .supportedChannels(listOf("webhook", "sms", "email", "voice"))
                .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .build()

        val roundtrippedNotificationEventConditionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationEventConditionListResponse),
                jacksonTypeRef<NotificationEventConditionListResponse>(),
            )

        assertThat(roundtrippedNotificationEventConditionListResponse)
            .isEqualTo(notificationEventConditionListResponse)
    }
}
