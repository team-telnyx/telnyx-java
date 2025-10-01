// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.uploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TnUploadEntryTest {

    @Test
    fun create() {
        val tnUploadEntry =
            TnUploadEntry.builder()
                .civicAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .errorCode(TnUploadEntry.ErrorCode.INTERNAL_ERROR)
                .errorMessage("error_message")
                .internalStatus(TnUploadEntry.InternalStatus.ERROR)
                .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .numberId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                .phoneNumber("phone_number")
                .status(TnUploadEntry.Status.ERROR)
                .build()

        assertThat(tnUploadEntry.civicAddressId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tnUploadEntry.errorCode()).contains(TnUploadEntry.ErrorCode.INTERNAL_ERROR)
        assertThat(tnUploadEntry.errorMessage()).contains("error_message")
        assertThat(tnUploadEntry.internalStatus()).contains(TnUploadEntry.InternalStatus.ERROR)
        assertThat(tnUploadEntry.locationId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tnUploadEntry.numberId()).contains("542c3bca-d247-42bc-8fe7-e01d16ecd761")
        assertThat(tnUploadEntry.phoneNumber()).contains("phone_number")
        assertThat(tnUploadEntry.status()).contains(TnUploadEntry.Status.ERROR)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tnUploadEntry =
            TnUploadEntry.builder()
                .civicAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .errorCode(TnUploadEntry.ErrorCode.INTERNAL_ERROR)
                .errorMessage("error_message")
                .internalStatus(TnUploadEntry.InternalStatus.ERROR)
                .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .numberId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                .phoneNumber("phone_number")
                .status(TnUploadEntry.Status.ERROR)
                .build()

        val roundtrippedTnUploadEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tnUploadEntry),
                jacksonTypeRef<TnUploadEntry>(),
            )

        assertThat(roundtrippedTnUploadEntry).isEqualTo(tnUploadEntry)
    }
}
