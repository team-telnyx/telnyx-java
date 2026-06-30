// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.references

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReferenceSubmitResponseTest {

    @Test
    fun create() {
        val referenceSubmitResponse =
            ReferenceSubmitResponse.builder()
                .addData(
                    ReferenceSubmitResponse.Data.builder()
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .recordType(ReferenceSubmitResponse.Data.RecordType.DIR_REFERENCE)
                        .refType(ReferenceSubmitResponse.Data.RefType.BUSINESS)
                        .slot(0L)
                        .timezone("America/New_York")
                        .email("dana.reyes@example.com")
                        .jobTitle("VP of Operations")
                        .organization("Acme Logistics")
                        .relationshipToRegistrant("Supplier")
                        .build()
                )
                .build()

        assertThat(referenceSubmitResponse.data())
            .containsExactly(
                ReferenceSubmitResponse.Data.builder()
                    .fullName("Dana Reyes")
                    .phoneE164("+14155550123")
                    .recordType(ReferenceSubmitResponse.Data.RecordType.DIR_REFERENCE)
                    .refType(ReferenceSubmitResponse.Data.RefType.BUSINESS)
                    .slot(0L)
                    .timezone("America/New_York")
                    .email("dana.reyes@example.com")
                    .jobTitle("VP of Operations")
                    .organization("Acme Logistics")
                    .relationshipToRegistrant("Supplier")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val referenceSubmitResponse =
            ReferenceSubmitResponse.builder()
                .addData(
                    ReferenceSubmitResponse.Data.builder()
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .recordType(ReferenceSubmitResponse.Data.RecordType.DIR_REFERENCE)
                        .refType(ReferenceSubmitResponse.Data.RefType.BUSINESS)
                        .slot(0L)
                        .timezone("America/New_York")
                        .email("dana.reyes@example.com")
                        .jobTitle("VP of Operations")
                        .organization("Acme Logistics")
                        .relationshipToRegistrant("Supplier")
                        .build()
                )
                .build()

        val roundtrippedReferenceSubmitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(referenceSubmitResponse),
                jacksonTypeRef<ReferenceSubmitResponse>(),
            )

        assertThat(roundtrippedReferenceSubmitResponse).isEqualTo(referenceSubmitResponse)
    }
}
