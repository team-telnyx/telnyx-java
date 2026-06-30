// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.references

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReferenceUpdateResponseTest {

    @Test
    fun create() {
        val referenceUpdateResponse =
            ReferenceUpdateResponse.builder()
                .data(
                    Reference.builder()
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .recordType(Reference.RecordType.DIR_REFERENCE)
                        .refType(Reference.RefType.BUSINESS)
                        .slot(0L)
                        .timezone("America/New_York")
                        .email("dana.reyes@example.com")
                        .jobTitle("VP of Operations")
                        .organization("Acme Logistics")
                        .relationshipToRegistrant("Supplier")
                        .build()
                )
                .build()

        assertThat(referenceUpdateResponse.data())
            .isEqualTo(
                Reference.builder()
                    .fullName("Dana Reyes")
                    .phoneE164("+14155550123")
                    .recordType(Reference.RecordType.DIR_REFERENCE)
                    .refType(Reference.RefType.BUSINESS)
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
        val referenceUpdateResponse =
            ReferenceUpdateResponse.builder()
                .data(
                    Reference.builder()
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .recordType(Reference.RecordType.DIR_REFERENCE)
                        .refType(Reference.RefType.BUSINESS)
                        .slot(0L)
                        .timezone("America/New_York")
                        .email("dana.reyes@example.com")
                        .jobTitle("VP of Operations")
                        .organization("Acme Logistics")
                        .relationshipToRegistrant("Supplier")
                        .build()
                )
                .build()

        val roundtrippedReferenceUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(referenceUpdateResponse),
                jacksonTypeRef<ReferenceUpdateResponse>(),
            )

        assertThat(roundtrippedReferenceUpdateResponse).isEqualTo(referenceUpdateResponse)
    }
}
