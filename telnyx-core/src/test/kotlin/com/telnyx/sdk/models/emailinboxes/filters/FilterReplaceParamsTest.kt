// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.filters

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterReplaceParamsTest {

    @Test
    fun create() {
        FilterReplaceParams.builder()
            .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addAllowlist("trusted@example.com")
            .addAllowlist("@partner.example")
            .addBlocklist("@spam.example")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FilterReplaceParams.builder().inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FilterReplaceParams.builder()
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAllowlist("trusted@example.com")
                .addAllowlist("@partner.example")
                .addBlocklist("@spam.example")
                .build()

        val body = params._body()

        assertThat(body.allowlist().getOrNull())
            .containsExactly("trusted@example.com", "@partner.example")
        assertThat(body.blocklist().getOrNull()).containsExactly("@spam.example")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FilterReplaceParams.builder().inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
