// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.addresses.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionAcceptSuggestionsParamsTest {

    @Test
    fun create() {
        ActionAcceptSuggestionsParams.builder()
            .pathId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .bodyId("id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionAcceptSuggestionsParams.builder()
                .pathId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionAcceptSuggestionsParams.builder()
                .pathId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bodyId("id")
                .build()

        val body = params._body()

        assertThat(body.bodyId()).contains("id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionAcceptSuggestionsParams.builder()
                .pathId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
