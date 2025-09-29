// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.notificationsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationSettingRetrieveResponseTest {

    @Test
    fun create() {
        val notificationSettingRetrieveResponse =
            NotificationSettingRetrieveResponse.builder()
                .data(
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
                )
                .build()

        assertThat(notificationSettingRetrieveResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationSettingRetrieveResponse =
            NotificationSettingRetrieveResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedNotificationSettingRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationSettingRetrieveResponse),
                jacksonTypeRef<NotificationSettingRetrieveResponse>(),
            )

        assertThat(roundtrippedNotificationSettingRetrieveResponse)
            .isEqualTo(notificationSettingRetrieveResponse)
    }
}
