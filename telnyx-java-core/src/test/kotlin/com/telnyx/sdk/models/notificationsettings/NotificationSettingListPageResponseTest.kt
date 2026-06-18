// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationSettingListPageResponseTest {

    @Test
    fun create() {
        val notificationSettingListPageResponse =
            NotificationSettingListPageResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(notificationSettingListPageResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(notificationSettingListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationSettingListPageResponse =
            NotificationSettingListPageResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedNotificationSettingListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationSettingListPageResponse),
                jacksonTypeRef<NotificationSettingListPageResponse>(),
            )

        assertThat(roundtrippedNotificationSettingListPageResponse)
            .isEqualTo(notificationSettingListPageResponse)
    }
}
