// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.phonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberRetrieveParamsTest {

    @Test
    fun create() {
        PhoneNumberRetrieveParams.builder()
            .id("1293384261075731499")
            .phoneNumberId("1234567889")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberRetrieveParams.builder()
                .id("1293384261075731499")
                .phoneNumberId("1234567889")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("1293384261075731499")
        assertThat(params._pathParam(1)).isEqualTo("1234567889")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
