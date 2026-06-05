// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberDisassociateParamsTest {

    @Test
    fun create() {
        NumberDisassociateParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .phoneNumber("+19493253498")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NumberDisassociateParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .phoneNumber("+19493253498")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        assertThat(params._pathParam(1)).isEqualTo("+19493253498")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
