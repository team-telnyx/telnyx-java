// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberRefreshParamsTest {

    @Test
    fun create() {
        NumberRefreshParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .addPhoneNumber("+19493253498")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NumberRefreshParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .addPhoneNumber("+19493253498")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NumberRefreshParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .addPhoneNumber("+19493253498")
                .build()

        val body = params._body()

        assertThat(body.phoneNumbers()).containsExactly("+19493253498")
    }
}
