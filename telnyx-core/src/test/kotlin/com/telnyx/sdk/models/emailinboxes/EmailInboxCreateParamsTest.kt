// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailInboxCreateParamsTest {

    @Test
    fun create() {
        EmailInboxCreateParams.builder()
            .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .username("username")
            .build()
    }

    @Test
    fun body() {
        val params =
            EmailInboxCreateParams.builder()
                .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .username("username")
                .build()

        val body = params._body()

        assertThat(body.domainId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.username()).contains("username")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EmailInboxCreateParams.builder().build()

        val body = params._body()
    }
}
