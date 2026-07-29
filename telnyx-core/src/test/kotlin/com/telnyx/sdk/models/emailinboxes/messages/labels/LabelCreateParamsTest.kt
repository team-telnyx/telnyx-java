// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages.labels

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LabelCreateParamsTest {

    @Test
    fun create() {
        LabelCreateParams.builder()
            .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .labelMutationRequest(
                LabelMutationRequest.builder().addLabel("spam").addLabel("urgent").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LabelCreateParams.builder()
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .labelMutationRequest(
                    LabelMutationRequest.builder().addLabel("spam").addLabel("urgent").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LabelCreateParams.builder()
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .labelMutationRequest(
                    LabelMutationRequest.builder().addLabel("spam").addLabel("urgent").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(LabelMutationRequest.builder().addLabel("spam").addLabel("urgent").build())
    }
}
