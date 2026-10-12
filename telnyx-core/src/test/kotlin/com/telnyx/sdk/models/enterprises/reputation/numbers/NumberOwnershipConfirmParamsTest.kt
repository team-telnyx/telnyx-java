// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberOwnershipConfirmParamsTest {

    @Test
    fun create() {
        NumberOwnershipConfirmParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .phoneNumber("+19493253498")
            .stillOwn(true)
            .evidenceDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NumberOwnershipConfirmParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .phoneNumber("+19493253498")
                .stillOwn(true)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        assertThat(params._pathParam(1)).isEqualTo("+19493253498")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NumberOwnershipConfirmParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .phoneNumber("+19493253498")
                .stillOwn(true)
                .evidenceDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .build()

        val body = params._body()

        assertThat(body.stillOwn()).isEqualTo(true)
        assertThat(body.evidenceDocumentId()).contains("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NumberOwnershipConfirmParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .phoneNumber("+19493253498")
                .stillOwn(true)
                .build()

        val body = params._body()

        assertThat(body.stillOwn()).isEqualTo(true)
    }
}
