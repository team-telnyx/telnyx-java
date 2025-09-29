// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomSipHeaderTest {

    @Test
    fun create() {
        val customSipHeader = CustomSipHeader.builder().name("head_1").value("val_1").build()

        assertThat(customSipHeader.name()).isEqualTo("head_1")
        assertThat(customSipHeader.value()).isEqualTo("val_1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customSipHeader = CustomSipHeader.builder().name("head_1").value("val_1").build()

        val roundtrippedCustomSipHeader =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customSipHeader),
                jacksonTypeRef<CustomSipHeader>(),
            )

        assertThat(roundtrippedCustomSipHeader).isEqualTo(customSipHeader)
    }
}
