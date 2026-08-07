// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.profile

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileUpdateParamsTest {

    @Test
    fun create() {
        ProfileUpdateParams.builder()
            .phoneNumber("phone_number")
            .about("string")
            .address("string")
            .category("string")
            .description("string")
            .displayName("string")
            .email("string")
            .profileId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
            .website("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProfileUpdateParams.builder().phoneNumber("phone_number").build()

        assertThat(params._pathParam(0)).isEqualTo("phone_number")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProfileUpdateParams.builder()
                .phoneNumber("phone_number")
                .about("string")
                .address("string")
                .category("string")
                .description("string")
                .displayName("string")
                .email("string")
                .profileId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .website("string")
                .build()

        val body = params._body()

        assertThat(body.about()).contains("string")
        assertThat(body.address()).contains("string")
        assertThat(body.category()).contains("string")
        assertThat(body.description()).contains("string")
        assertThat(body.displayName()).contains("string")
        assertThat(body.email()).contains("string")
        assertThat(body.profileId()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(body.website()).contains("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProfileUpdateParams.builder().phoneNumber("phone_number").build()

        val body = params._body()
    }
}
