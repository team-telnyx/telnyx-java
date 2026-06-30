// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.references

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReferenceUpdateParamsTest {

    @Test
    fun create() {
        ReferenceUpdateParams.builder()
            .dirId("16635d38-75a6-4481-82e8-69af60e05011")
            .refType(ReferenceUpdateParams.RefType.BUSINESS)
            .slot(0L)
            .email("dana.reyes@example.com")
            .fullName("Dana Reyes")
            .jobTitle("VP of Operations")
            .organization("Acme Logistics")
            .phoneE164("+14155550123")
            .relationshipToRegistrant("Supplier")
            .timezone("America/New_York")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ReferenceUpdateParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .refType(ReferenceUpdateParams.RefType.BUSINESS)
                .slot(0L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("16635d38-75a6-4481-82e8-69af60e05011")
        assertThat(params._pathParam(1)).isEqualTo("business")
        assertThat(params._pathParam(2)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ReferenceUpdateParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .refType(ReferenceUpdateParams.RefType.BUSINESS)
                .slot(0L)
                .email("dana.reyes@example.com")
                .fullName("Dana Reyes")
                .jobTitle("VP of Operations")
                .organization("Acme Logistics")
                .phoneE164("+14155550123")
                .relationshipToRegistrant("Supplier")
                .timezone("America/New_York")
                .build()

        val body = params._body()

        assertThat(body.email()).contains("dana.reyes@example.com")
        assertThat(body.fullName()).contains("Dana Reyes")
        assertThat(body.jobTitle()).contains("VP of Operations")
        assertThat(body.organization()).contains("Acme Logistics")
        assertThat(body.phoneE164()).contains("+14155550123")
        assertThat(body.relationshipToRegistrant()).contains("Supplier")
        assertThat(body.timezone()).contains("America/New_York")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ReferenceUpdateParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .refType(ReferenceUpdateParams.RefType.BUSINESS)
                .slot(0L)
                .build()

        val body = params._body()
    }
}
