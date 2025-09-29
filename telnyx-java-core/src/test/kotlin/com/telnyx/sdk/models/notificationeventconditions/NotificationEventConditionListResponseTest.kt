// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationeventconditions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationEventConditionListResponseTest {

    @Test
    fun create() {
        val notificationEventConditionListResponse =
            NotificationEventConditionListResponse.builder()
                .addData(
                    NotificationEventConditionListResponse.Data.builder()
                        .id("70c7c5cb-dce2-4124-accb-870d39dbe852")
                        .allowMultipleChannels(false)
                        .associatedRecordType(
                            NotificationEventConditionListResponse.Data.AssociatedRecordType
                                .PHONE_NUMBER
                        )
                        .asynchronous(true)
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .description("When emergency number dialed from phone number X")
                        .enabled(true)
                        .name("from phone number")
                        .notificationEventId("d5c395cd-9864-4609-b5e2-3f9fd4ce201a")
                        .addParameter(
                            NotificationEventConditionListResponse.Data.Parameter.builder()
                                .dataType("string")
                                .name("phone_number")
                                .optional(false)
                                .build()
                        )
                        .supportedChannels(listOf("webhook", "sms", "email", "voice"))
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(notificationEventConditionListResponse.data().getOrNull())
            .containsExactly(
                NotificationEventConditionListResponse.Data.builder()
                    .id("70c7c5cb-dce2-4124-accb-870d39dbe852")
                    .allowMultipleChannels(false)
                    .associatedRecordType(
                        NotificationEventConditionListResponse.Data.AssociatedRecordType
                            .PHONE_NUMBER
                    )
                    .asynchronous(true)
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .description("When emergency number dialed from phone number X")
                    .enabled(true)
                    .name("from phone number")
                    .notificationEventId("d5c395cd-9864-4609-b5e2-3f9fd4ce201a")
                    .addParameter(
                        NotificationEventConditionListResponse.Data.Parameter.builder()
                            .dataType("string")
                            .name("phone_number")
                            .optional(false)
                            .build()
                    )
                    .supportedChannels(listOf("webhook", "sms", "email", "voice"))
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )
        assertThat(notificationEventConditionListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationEventConditionListResponse =
            NotificationEventConditionListResponse.builder()
                .addData(
                    NotificationEventConditionListResponse.Data.builder()
                        .id("70c7c5cb-dce2-4124-accb-870d39dbe852")
                        .allowMultipleChannels(false)
                        .associatedRecordType(
                            NotificationEventConditionListResponse.Data.AssociatedRecordType
                                .PHONE_NUMBER
                        )
                        .asynchronous(true)
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .description("When emergency number dialed from phone number X")
                        .enabled(true)
                        .name("from phone number")
                        .notificationEventId("d5c395cd-9864-4609-b5e2-3f9fd4ce201a")
                        .addParameter(
                            NotificationEventConditionListResponse.Data.Parameter.builder()
                                .dataType("string")
                                .name("phone_number")
                                .optional(false)
                                .build()
                        )
                        .supportedChannels(listOf("webhook", "sms", "email", "voice"))
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
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
