// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.references

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReferenceInputTest {

    @Test
    fun create() {
        val referenceInput =
            ReferenceInput.builder()
                .email("dana.reyes@example.com")
                .fullName("Dana Reyes")
                .phoneE164("+14155550123")
                .timezone("America/New_York")
                .jobTitle("VP of Operations")
                .organization("Acme Logistics")
                .relationshipToRegistrant("Supplier")
                .build()

        assertThat(referenceInput.email()).isEqualTo("dana.reyes@example.com")
        assertThat(referenceInput.fullName()).isEqualTo("Dana Reyes")
        assertThat(referenceInput.phoneE164()).isEqualTo("+14155550123")
        assertThat(referenceInput.timezone()).isEqualTo("America/New_York")
        assertThat(referenceInput.jobTitle()).contains("VP of Operations")
        assertThat(referenceInput.organization()).contains("Acme Logistics")
        assertThat(referenceInput.relationshipToRegistrant()).contains("Supplier")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val referenceInput =
            ReferenceInput.builder()
                .email("dana.reyes@example.com")
                .fullName("Dana Reyes")
                .phoneE164("+14155550123")
                .timezone("America/New_York")
                .jobTitle("VP of Operations")
                .organization("Acme Logistics")
                .relationshipToRegistrant("Supplier")
                .build()

        val roundtrippedReferenceInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(referenceInput),
                jacksonTypeRef<ReferenceInput>(),
            )

        assertThat(roundtrippedReferenceInput).isEqualTo(referenceInput)
    }
}
