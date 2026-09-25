// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileRecallParamsTest {

    @Test
    fun create() {
        ProfileRecallParams.builder()
            .namespace("namespace")
            .profileId("profile_id")
            .query("where do invoices go?")
            .topK(5L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProfileRecallParams.builder()
                .namespace("namespace")
                .profileId("profile_id")
                .query("where do invoices go?")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("namespace")
        assertThat(params._pathParam(1)).isEqualTo("profile_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProfileRecallParams.builder()
                .namespace("namespace")
                .profileId("profile_id")
                .query("where do invoices go?")
                .topK(5L)
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("where do invoices go?")
        assertThat(body.topK()).contains(5L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProfileRecallParams.builder()
                .namespace("namespace")
                .profileId("profile_id")
                .query("where do invoices go?")
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("where do invoices go?")
    }
}
