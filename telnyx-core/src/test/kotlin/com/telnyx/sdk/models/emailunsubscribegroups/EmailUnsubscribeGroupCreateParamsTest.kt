// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailunsubscribegroups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailUnsubscribeGroupCreateParamsTest {

    @Test
    fun create() {
        EmailUnsubscribeGroupCreateParams.builder().name("x").description("description").build()
    }

    @Test
    fun body() {
        val params =
            EmailUnsubscribeGroupCreateParams.builder().name("x").description("description").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EmailUnsubscribeGroupCreateParams.builder().name("x").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }
}
