// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.phonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberUpdateParamsTest {

    @Test
    fun create() {
        PhoneNumberUpdateParams.builder()
            .id("id")
            .phoneNumberId("1234567889")
            .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params = PhoneNumberUpdateParams.builder().id("id").phoneNumberId("1234567889").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("1234567889")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhoneNumberUpdateParams.builder()
                .id("id")
                .phoneNumberId("1234567889")
                .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.locationId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PhoneNumberUpdateParams.builder().id("id").phoneNumberId("1234567889").build()

        val body = params._body()
    }
}
