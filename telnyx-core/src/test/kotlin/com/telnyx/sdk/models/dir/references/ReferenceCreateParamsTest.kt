// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.references

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReferenceCreateParamsTest {

    @Test
    fun create() {
        ReferenceCreateParams.builder()
            .dirId("16635d38-75a6-4481-82e8-69af60e05011")
            .addBusinessReference(
                ReferenceInput.builder()
                    .email("dana.reyes@example.com")
                    .fullName("Dana Reyes")
                    .phoneE164("+14155550123")
                    .timezone("America/New_York")
                    .jobTitle("VP of Operations")
                    .organization("Acme Logistics")
                    .relationshipToRegistrant("Supplier")
                    .build()
            )
            .addBusinessReference(
                ReferenceInput.builder()
                    .email("dana.reyes@example.com")
                    .fullName("Dana Reyes")
                    .phoneE164("+14155550123")
                    .timezone("America/New_York")
                    .jobTitle("VP of Operations")
                    .organization("Acme Logistics")
                    .relationshipToRegistrant("Supplier")
                    .build()
            )
            .financialReference(
                ReferenceInput.builder()
                    .email("dana.reyes@example.com")
                    .fullName("Dana Reyes")
                    .phoneE164("+14155550123")
                    .timezone("America/New_York")
                    .jobTitle("VP of Operations")
                    .organization("Acme Logistics")
                    .relationshipToRegistrant("Supplier")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ReferenceCreateParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .addBusinessReference(
                    ReferenceInput.builder()
                        .email("dana.reyes@example.com")
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .timezone("America/New_York")
                        .build()
                )
                .addBusinessReference(
                    ReferenceInput.builder()
                        .email("dana.reyes@example.com")
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .timezone("America/New_York")
                        .build()
                )
                .financialReference(
                    ReferenceInput.builder()
                        .email("dana.reyes@example.com")
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .timezone("America/New_York")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("16635d38-75a6-4481-82e8-69af60e05011")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ReferenceCreateParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .addBusinessReference(
                    ReferenceInput.builder()
                        .email("dana.reyes@example.com")
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .timezone("America/New_York")
                        .jobTitle("VP of Operations")
                        .organization("Acme Logistics")
                        .relationshipToRegistrant("Supplier")
                        .build()
                )
                .addBusinessReference(
                    ReferenceInput.builder()
                        .email("dana.reyes@example.com")
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .timezone("America/New_York")
                        .jobTitle("VP of Operations")
                        .organization("Acme Logistics")
                        .relationshipToRegistrant("Supplier")
                        .build()
                )
                .financialReference(
                    ReferenceInput.builder()
                        .email("dana.reyes@example.com")
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .timezone("America/New_York")
                        .jobTitle("VP of Operations")
                        .organization("Acme Logistics")
                        .relationshipToRegistrant("Supplier")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.businessReferences())
            .containsExactly(
                ReferenceInput.builder()
                    .email("dana.reyes@example.com")
                    .fullName("Dana Reyes")
                    .phoneE164("+14155550123")
                    .timezone("America/New_York")
                    .jobTitle("VP of Operations")
                    .organization("Acme Logistics")
                    .relationshipToRegistrant("Supplier")
                    .build(),
                ReferenceInput.builder()
                    .email("dana.reyes@example.com")
                    .fullName("Dana Reyes")
                    .phoneE164("+14155550123")
                    .timezone("America/New_York")
                    .jobTitle("VP of Operations")
                    .organization("Acme Logistics")
                    .relationshipToRegistrant("Supplier")
                    .build(),
            )
        assertThat(body.financialReference())
            .isEqualTo(
                ReferenceInput.builder()
                    .email("dana.reyes@example.com")
                    .fullName("Dana Reyes")
                    .phoneE164("+14155550123")
                    .timezone("America/New_York")
                    .jobTitle("VP of Operations")
                    .organization("Acme Logistics")
                    .relationshipToRegistrant("Supplier")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ReferenceCreateParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .addBusinessReference(
                    ReferenceInput.builder()
                        .email("dana.reyes@example.com")
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .timezone("America/New_York")
                        .build()
                )
                .addBusinessReference(
                    ReferenceInput.builder()
                        .email("dana.reyes@example.com")
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .timezone("America/New_York")
                        .build()
                )
                .financialReference(
                    ReferenceInput.builder()
                        .email("dana.reyes@example.com")
                        .fullName("Dana Reyes")
                        .phoneE164("+14155550123")
                        .timezone("America/New_York")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.businessReferences())
            .containsExactly(
                ReferenceInput.builder()
                    .email("dana.reyes@example.com")
                    .fullName("Dana Reyes")
                    .phoneE164("+14155550123")
                    .timezone("America/New_York")
                    .build(),
                ReferenceInput.builder()
                    .email("dana.reyes@example.com")
                    .fullName("Dana Reyes")
                    .phoneE164("+14155550123")
                    .timezone("America/New_York")
                    .build(),
            )
        assertThat(body.financialReference())
            .isEqualTo(
                ReferenceInput.builder()
                    .email("dana.reyes@example.com")
                    .fullName("Dana Reyes")
                    .phoneE164("+14155550123")
                    .timezone("America/New_York")
                    .build()
            )
    }
}
