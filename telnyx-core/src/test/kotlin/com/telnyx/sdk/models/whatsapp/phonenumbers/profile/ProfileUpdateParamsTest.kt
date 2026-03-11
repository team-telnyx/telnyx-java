// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.profile

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileUpdateParamsTest {

    @Test
    fun create() {
        ProfileUpdateParams.builder()
            .phoneNumber("phone_number")
            .about("about")
            .address("address")
            .category("category")
            .description("description")
            .displayName("display_name")
            .email("email")
            .website("website")
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
                .about("about")
                .address("address")
                .category("category")
                .description("description")
                .displayName("display_name")
                .email("email")
                .website("website")
                .build()

        val body = params._body()

        assertThat(body.about()).contains("about")
        assertThat(body.address()).contains("address")
        assertThat(body.category()).contains("category")
        assertThat(body.description()).contains("description")
        assertThat(body.displayName()).contains("display_name")
        assertThat(body.email()).contains("email")
        assertThat(body.website()).contains("website")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProfileUpdateParams.builder().phoneNumber("phone_number").build()

        val body = params._body()
    }
}
