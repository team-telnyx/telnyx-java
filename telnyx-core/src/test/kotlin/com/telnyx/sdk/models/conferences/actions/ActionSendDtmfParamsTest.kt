// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSendDtmfParamsTest {

    @Test
    fun create() {
        ActionSendDtmfParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .digits("1234#")
            .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .durationMillis(250L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionSendDtmfParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .digits("1234#")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionSendDtmfParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .digits("1234#")
                .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .durationMillis(250L)
                .build()

        val body = params._body()

        assertThat(body.digits()).isEqualTo("1234#")
        assertThat(body.callControlIds().getOrNull())
            .containsExactly("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.durationMillis()).contains(250L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionSendDtmfParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .digits("1234#")
                .build()

        val body = params._body()

        assertThat(body.digits()).isEqualTo("1234#")
    }
}
