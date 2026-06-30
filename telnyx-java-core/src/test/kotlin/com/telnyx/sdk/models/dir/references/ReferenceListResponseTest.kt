// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.references

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReferenceListResponseTest {

    @Test
    fun create() {
        val referenceListResponse =
            ReferenceListResponse.builder()
                .addData(
                    ReferenceListResponse.Data.builder()
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .recordType(ReferenceListResponse.Data.RecordType.DIR_REFERENCE)
                        .refType(ReferenceListResponse.Data.RefType.BUSINESS)
                        .slot(0L)
                        .timezone("America/New_York")
                        .email("dana.reyes@example.com")
                        .jobTitle("VP of Operations")
                        .organization("Acme Logistics")
                        .relationshipToRegistrant("Supplier")
                        .build()
                )
                .build()

        assertThat(referenceListResponse.data())
            .containsExactly(
                ReferenceListResponse.Data.builder()
                    .fullName("Dana Reyes")
                    .phoneE164("+14155550123")
                    .recordType(ReferenceListResponse.Data.RecordType.DIR_REFERENCE)
                    .refType(ReferenceListResponse.Data.RefType.BUSINESS)
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
        val referenceListResponse =
            ReferenceListResponse.builder()
                .addData(
                    ReferenceListResponse.Data.builder()
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .recordType(ReferenceListResponse.Data.RecordType.DIR_REFERENCE)
                        .refType(ReferenceListResponse.Data.RefType.BUSINESS)
                        .slot(0L)
                        .timezone("America/New_York")
                        .email("dana.reyes@example.com")
                        .jobTitle("VP of Operations")
                        .organization("Acme Logistics")
                        .relationshipToRegistrant("Supplier")
                        .build()
                )
                .build()

        val roundtrippedReferenceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(referenceListResponse),
                jacksonTypeRef<ReferenceListResponse>(),
            )

        assertThat(roundtrippedReferenceListResponse).isEqualTo(referenceListResponse)
    }
}
