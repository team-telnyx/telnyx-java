// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingPaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileListAlphanumericSenderIdsPageResponseTest {

    @Test
    fun create() {
        val messagingProfileListAlphanumericSenderIdsPageResponse =
            MessagingProfileListAlphanumericSenderIdsPageResponse.builder()
                .addData(
                    MessagingProfileListAlphanumericSenderIdsResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .alphanumericSenderId("MyCompany")
                        .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .organizationId("organization_id")
                        .recordType(
                            MessagingProfileListAlphanumericSenderIdsResponse.RecordType
                                .ALPHANUMERIC_SENDER_ID
                        )
                        .usLongCodeFallback("+15551234567")
                        .build()
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(messagingProfileListAlphanumericSenderIdsPageResponse.data().getOrNull())
            .containsExactly(
                MessagingProfileListAlphanumericSenderIdsResponse.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .alphanumericSenderId("MyCompany")
                    .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("organization_id")
                    .recordType(
                        MessagingProfileListAlphanumericSenderIdsResponse.RecordType
                            .ALPHANUMERIC_SENDER_ID
                    )
                    .usLongCodeFallback("+15551234567")
                    .build()
            )
        assertThat(messagingProfileListAlphanumericSenderIdsPageResponse.meta())
            .contains(
                MessagingPaginationMeta.builder()
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
        val messagingProfileListAlphanumericSenderIdsPageResponse =
            MessagingProfileListAlphanumericSenderIdsPageResponse.builder()
                .addData(
                    MessagingProfileListAlphanumericSenderIdsResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .alphanumericSenderId("MyCompany")
                        .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .organizationId("organization_id")
                        .recordType(
                            MessagingProfileListAlphanumericSenderIdsResponse.RecordType
                                .ALPHANUMERIC_SENDER_ID
                        )
                        .usLongCodeFallback("+15551234567")
                        .build()
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedMessagingProfileListAlphanumericSenderIdsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    messagingProfileListAlphanumericSenderIdsPageResponse
                ),
                jacksonTypeRef<MessagingProfileListAlphanumericSenderIdsPageResponse>(),
            )

        assertThat(roundtrippedMessagingProfileListAlphanumericSenderIdsPageResponse)
            .isEqualTo(messagingProfileListAlphanumericSenderIdsPageResponse)
    }
}
