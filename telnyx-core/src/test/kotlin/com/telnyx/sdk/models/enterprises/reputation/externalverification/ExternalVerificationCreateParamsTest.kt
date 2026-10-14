// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.externalverification

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVerificationCreateParamsTest {

    @Test
    fun create() {
        ExternalVerificationCreateParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .addDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
            .addPhoneNumber("+13125550142")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalVerificationCreateParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .addDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalVerificationCreateParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .addDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .addPhoneNumber("+13125550142")
                .build()

        val body = params._body()

        assertThat(body.documentIds()).containsExactly("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
        assertThat(body.phoneNumbers().getOrNull()).containsExactly("+13125550142")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalVerificationCreateParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .addDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .build()

        val body = params._body()

        assertThat(body.documentIds()).containsExactly("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
    }
}
