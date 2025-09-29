// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.notificationsettings

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationSettingCreateParamsTest {

    @Test
    fun create() {
        NotificationSettingCreateParams.builder()
            .notificationSetting(
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
    }

    @Test
    fun body() {
        val params =
            NotificationSettingCreateParams.builder()
                .notificationSetting(
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

        val body = params._body().getOrNull()

        assertThat(body)
            .isEqualTo(
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
    fun bodyWithoutOptionalFields() {
        val params = NotificationSettingCreateParams.builder().build()

        val body = params._body().getOrNull()
    }
}
