// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationSettingTest {

    @Test
    fun create() {
        val notificationSetting =
            NotificationSetting.builder()
                .id("8eb5b5f9-5893-423c-9f15-b487713d44d4")
                .associatedRecordType("phone_number")
                .associatedRecordTypeValue("+13125550000")
                .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .notificationChannelId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                .notificationEventConditionId("70c7c5cb-dce2-4124-accb-870d39dbe852")
                .notificationProfileId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                .addParameter(
                    NotificationSetting.Parameter.builder()
                        .name("phone_number")
                        .value("+13125550000")
                        .build()
                )
                .status(NotificationSetting.Status.ENABLE_RECEIVED)
                .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .build()

        assertThat(notificationSetting.id()).contains("8eb5b5f9-5893-423c-9f15-b487713d44d4")
        assertThat(notificationSetting.associatedRecordType()).contains("phone_number")
        assertThat(notificationSetting.associatedRecordTypeValue()).contains("+13125550000")
        assertThat(notificationSetting.createdAt())
            .contains(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
        assertThat(notificationSetting.notificationChannelId())
            .contains("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
        assertThat(notificationSetting.notificationEventConditionId())
            .contains("70c7c5cb-dce2-4124-accb-870d39dbe852")
        assertThat(notificationSetting.notificationProfileId())
            .contains("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
        assertThat(notificationSetting.parameters().getOrNull())
            .containsExactly(
                NotificationSetting.Parameter.builder()
                    .name("phone_number")
                    .value("+13125550000")
                    .build()
            )
        assertThat(notificationSetting.status())
            .contains(NotificationSetting.Status.ENABLE_RECEIVED)
        assertThat(notificationSetting.updatedAt())
            .contains(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationSetting =
            NotificationSetting.builder()
                .id("8eb5b5f9-5893-423c-9f15-b487713d44d4")
                .associatedRecordType("phone_number")
                .associatedRecordTypeValue("+13125550000")
                .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .notificationChannelId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                .notificationEventConditionId("70c7c5cb-dce2-4124-accb-870d39dbe852")
                .notificationProfileId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                .addParameter(
                    NotificationSetting.Parameter.builder()
                        .name("phone_number")
                        .value("+13125550000")
                        .build()
                )
                .status(NotificationSetting.Status.ENABLE_RECEIVED)
                .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .build()

        val roundtrippedNotificationSetting =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationSetting),
                jacksonTypeRef<NotificationSetting>(),
            )

        assertThat(roundtrippedNotificationSetting).isEqualTo(notificationSetting)
    }
}
