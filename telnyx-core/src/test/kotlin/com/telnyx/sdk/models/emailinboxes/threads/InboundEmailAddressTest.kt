// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.threads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundEmailAddressTest {

    @Test
    fun create() {
        val inboundEmailAddress =
            InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()

        assertThat(inboundEmailAddress.email()).isEqualTo("dev@stainless.com")
        assertThat(inboundEmailAddress.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundEmailAddress =
            InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()

        val roundtrippedInboundEmailAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundEmailAddress),
                jacksonTypeRef<InboundEmailAddress>(),
            )

        assertThat(roundtrippedInboundEmailAddress).isEqualTo(inboundEmailAddress)
    }
}
