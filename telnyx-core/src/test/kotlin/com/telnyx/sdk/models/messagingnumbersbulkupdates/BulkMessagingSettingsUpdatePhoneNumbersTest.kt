// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingnumbersbulkupdates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkMessagingSettingsUpdatePhoneNumbersTest {

    @Test
    fun create() {
        val bulkMessagingSettingsUpdatePhoneNumbers =
            BulkMessagingSettingsUpdatePhoneNumbers.builder()
                .addFailed("string")
                .orderId("00000000-0000-0000-0000-000000000000")
                .addPending("string")
                .recordType(
                    BulkMessagingSettingsUpdatePhoneNumbers.RecordType.MESSAGING_NUMBERS_BULK_UPDATE
                )
                .success(listOf("+18880000000", "+18880000001", "+18880000002"))
                .build()

        assertThat(bulkMessagingSettingsUpdatePhoneNumbers.failed().getOrNull())
            .containsExactly("string")
        assertThat(bulkMessagingSettingsUpdatePhoneNumbers.orderId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(bulkMessagingSettingsUpdatePhoneNumbers.pending().getOrNull())
            .containsExactly("string")
        assertThat(bulkMessagingSettingsUpdatePhoneNumbers.recordType())
            .contains(
                BulkMessagingSettingsUpdatePhoneNumbers.RecordType.MESSAGING_NUMBERS_BULK_UPDATE
            )
        assertThat(bulkMessagingSettingsUpdatePhoneNumbers.success().getOrNull())
            .containsExactly("+18880000000", "+18880000001", "+18880000002")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkMessagingSettingsUpdatePhoneNumbers =
            BulkMessagingSettingsUpdatePhoneNumbers.builder()
                .addFailed("string")
                .orderId("00000000-0000-0000-0000-000000000000")
                .addPending("string")
                .recordType(
                    BulkMessagingSettingsUpdatePhoneNumbers.RecordType.MESSAGING_NUMBERS_BULK_UPDATE
                )
                .success(listOf("+18880000000", "+18880000001", "+18880000002"))
                .build()

        val roundtrippedBulkMessagingSettingsUpdatePhoneNumbers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkMessagingSettingsUpdatePhoneNumbers),
                jacksonTypeRef<BulkMessagingSettingsUpdatePhoneNumbers>(),
            )

        assertThat(roundtrippedBulkMessagingSettingsUpdatePhoneNumbers)
            .isEqualTo(bulkMessagingSettingsUpdatePhoneNumbers)
    }
}
