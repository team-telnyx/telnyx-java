// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RcsToItemTest {

    @Test
    fun create() {
        val rcsToItem =
            RcsToItem.builder()
                .carrier("Verizon Wireless")
                .lineType("Wireless")
                .phoneNumber("+13125551234")
                .status("queued")
                .build()

        assertThat(rcsToItem.carrier()).contains("Verizon Wireless")
        assertThat(rcsToItem.lineType()).contains("Wireless")
        assertThat(rcsToItem.phoneNumber()).contains("+13125551234")
        assertThat(rcsToItem.status()).contains("queued")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rcsToItem =
            RcsToItem.builder()
                .carrier("Verizon Wireless")
                .lineType("Wireless")
                .phoneNumber("+13125551234")
                .status("queued")
                .build()

        val roundtrippedRcsToItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rcsToItem),
                jacksonTypeRef<RcsToItem>(),
            )

        assertThat(roundtrippedRcsToItem).isEqualTo(rcsToItem)
    }
}
