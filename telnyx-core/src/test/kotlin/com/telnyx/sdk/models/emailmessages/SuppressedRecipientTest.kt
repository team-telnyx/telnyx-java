// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SuppressedRecipientTest {

    @Test
    fun create() {
        val suppressedRecipient =
            SuppressedRecipient.builder()
                .overrideAllowed(true)
                .reason("reason")
                .scope("scope")
                .to("dev@stainless.com")
                .build()

        assertThat(suppressedRecipient.overrideAllowed()).isEqualTo(true)
        assertThat(suppressedRecipient.reason()).isEqualTo("reason")
        assertThat(suppressedRecipient.scope()).isEqualTo("scope")
        assertThat(suppressedRecipient.to()).isEqualTo("dev@stainless.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val suppressedRecipient =
            SuppressedRecipient.builder()
                .overrideAllowed(true)
                .reason("reason")
                .scope("scope")
                .to("dev@stainless.com")
                .build()

        val roundtrippedSuppressedRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(suppressedRecipient),
                jacksonTypeRef<SuppressedRecipient>(),
            )

        assertThat(roundtrippedSuppressedRecipient).isEqualTo(suppressedRecipient)
    }
}
