// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.references

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReferenceTest {

    @Test
    fun create() {
        val reference =
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

        assertThat(reference.fullName()).isEqualTo("Dana Reyes")
        assertThat(reference.phoneE164()).isEqualTo("+14155550123")
        assertThat(reference.recordType()).isEqualTo(Reference.RecordType.DIR_REFERENCE)
        assertThat(reference.refType()).isEqualTo(Reference.RefType.BUSINESS)
        assertThat(reference.slot()).isEqualTo(0L)
        assertThat(reference.timezone()).isEqualTo("America/New_York")
        assertThat(reference.email()).contains("dana.reyes@example.com")
        assertThat(reference.jobTitle()).contains("VP of Operations")
        assertThat(reference.organization()).contains("Acme Logistics")
        assertThat(reference.relationshipToRegistrant()).contains("Supplier")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reference =
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

        val roundtrippedReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reference),
                jacksonTypeRef<Reference>(),
            )

        assertThat(roundtrippedReference).isEqualTo(reference)
    }
}
