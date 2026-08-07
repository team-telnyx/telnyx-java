// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.phonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberUpdateParamsTest {

    @Test
    fun create() {
        PhoneNumberUpdateParams.builder()
            .id("1293384261075731499")
            .phoneNumberId("1234567889")
            .locationId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberUpdateParams.builder()
                .id("1293384261075731499")
                .phoneNumberId("1234567889")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("1293384261075731499")
        assertThat(params._pathParam(1)).isEqualTo("1234567889")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhoneNumberUpdateParams.builder()
                .id("1293384261075731499")
                .phoneNumberId("1234567889")
                .locationId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .build()

        val body = params._body()

        assertThat(body.locationId()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PhoneNumberUpdateParams.builder()
                .id("1293384261075731499")
                .phoneNumberId("1234567889")
                .build()

        val body = params._body()
    }
}
