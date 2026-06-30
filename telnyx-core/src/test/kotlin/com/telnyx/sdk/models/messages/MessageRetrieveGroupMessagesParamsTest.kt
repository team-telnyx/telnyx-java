// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageRetrieveGroupMessagesParamsTest {

    @Test
    fun create() {
        MessageRetrieveGroupMessagesParams.builder()
            .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageRetrieveGroupMessagesParams.builder()
                .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
