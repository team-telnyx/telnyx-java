// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailBlockCreateParamsTest {

    @Test
    fun create() {
        EmailBlockCreateParams.builder()
            .to("to")
            .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .from("from")
            .build()
    }

    @Test
    fun body() {
        val params =
            EmailBlockCreateParams.builder()
                .to("to")
                .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .from("from")
                .build()

        val body = params._body()

        assertThat(body.to()).isEqualTo("to")
        assertThat(body.domainId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.from()).contains("from")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EmailBlockCreateParams.builder().to("to").build()

        val body = params._body()

        assertThat(body.to()).isEqualTo("to")
    }
}
