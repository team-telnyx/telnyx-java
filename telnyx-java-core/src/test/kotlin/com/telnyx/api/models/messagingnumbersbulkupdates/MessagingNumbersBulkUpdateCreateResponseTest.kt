// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingnumbersbulkupdates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingNumbersBulkUpdateCreateResponseTest {

    @Test
    fun create() {
        val messagingNumbersBulkUpdateCreateResponse =
            MessagingNumbersBulkUpdateCreateResponse.builder()
                .data(
                    MessagingNumbersBulkUpdateCreateResponse.Data.builder()
                        .addFailed("string")
                        .orderId("00000000-0000-0000-0000-000000000000")
                        .addPending("string")
                        .recordType(
                            MessagingNumbersBulkUpdateCreateResponse.Data.RecordType
                                .MESSAGING_NUMBERS_BULK_UPDATE
                        )
                        .success(listOf("+18880000000", "+18880000001", "+18880000002"))
                        .build()
                )
                .build()

        assertThat(messagingNumbersBulkUpdateCreateResponse.data())
            .contains(
                MessagingNumbersBulkUpdateCreateResponse.Data.builder()
                    .addFailed("string")
                    .orderId("00000000-0000-0000-0000-000000000000")
                    .addPending("string")
                    .recordType(
                        MessagingNumbersBulkUpdateCreateResponse.Data.RecordType
                            .MESSAGING_NUMBERS_BULK_UPDATE
                    )
                    .success(listOf("+18880000000", "+18880000001", "+18880000002"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingNumbersBulkUpdateCreateResponse =
            MessagingNumbersBulkUpdateCreateResponse.builder()
                .data(
                    MessagingNumbersBulkUpdateCreateResponse.Data.builder()
                        .addFailed("string")
                        .orderId("00000000-0000-0000-0000-000000000000")
                        .addPending("string")
                        .recordType(
                            MessagingNumbersBulkUpdateCreateResponse.Data.RecordType
                                .MESSAGING_NUMBERS_BULK_UPDATE
                        )
                        .success(listOf("+18880000000", "+18880000001", "+18880000002"))
                        .build()
                )
                .build()

        val roundtrippedMessagingNumbersBulkUpdateCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingNumbersBulkUpdateCreateResponse),
                jacksonTypeRef<MessagingNumbersBulkUpdateCreateResponse>(),
            )

        assertThat(roundtrippedMessagingNumbersBulkUpdateCreateResponse)
            .isEqualTo(messagingNumbersBulkUpdateCreateResponse)
    }
}
