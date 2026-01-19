// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.queues

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueCreateParamsTest {

    @Test
    fun create() {
        QueueCreateParams.builder()
            .accountSid("account_sid")
            .friendlyName("Support Queue")
            .maxSize(10L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = QueueCreateParams.builder().accountSid("account_sid").build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            QueueCreateParams.builder()
                .accountSid("account_sid")
                .friendlyName("Support Queue")
                .maxSize(10L)
                .build()

        val body = params._body()

        assertThat(body.friendlyName()).contains("Support Queue")
        assertThat(body.maxSize()).contains(10L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = QueueCreateParams.builder().accountSid("account_sid").build()

        val body = params._body()
    }
}
