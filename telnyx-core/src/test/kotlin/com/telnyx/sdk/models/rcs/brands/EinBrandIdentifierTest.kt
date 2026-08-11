// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.brands

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EinBrandIdentifierTest {

    @Test
    fun create() {
        val einBrandIdentifier = EinBrandIdentifier.builder().value("29-1051329").build()

        assertThat(einBrandIdentifier.value()).isEqualTo("29-1051329")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val einBrandIdentifier = EinBrandIdentifier.builder().value("29-1051329").build()

        val roundtrippedEinBrandIdentifier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(einBrandIdentifier),
                jacksonTypeRef<EinBrandIdentifier>(),
            )

        assertThat(roundtrippedEinBrandIdentifier).isEqualTo(einBrandIdentifier)
    }
}
