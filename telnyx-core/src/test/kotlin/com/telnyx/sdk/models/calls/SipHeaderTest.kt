// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SipHeaderTest {

    @Test
    fun create() {
        val sipHeader = SipHeader.builder().name(SipHeader.Name.USER_TO_USER).value("value").build()

        assertThat(sipHeader.name()).isEqualTo(SipHeader.Name.USER_TO_USER)
        assertThat(sipHeader.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sipHeader = SipHeader.builder().name(SipHeader.Name.USER_TO_USER).value("value").build()

        val roundtrippedSipHeader =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sipHeader),
                jacksonTypeRef<SipHeader>(),
            )

        assertThat(roundtrippedSipHeader).isEqualTo(sipHeader)
    }
}
