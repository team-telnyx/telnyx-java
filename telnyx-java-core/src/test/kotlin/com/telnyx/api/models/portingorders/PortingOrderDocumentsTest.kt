// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderDocumentsTest {

    @Test
    fun create() {
        val portingOrderDocuments =
            PortingOrderDocuments.builder()
                .invoice("ce74b771-d23d-4960-81ec-8741b3862146")
                .loa("64ffb720-04c7-455b-92d6-20fcca92e935")
                .build()

        assertThat(portingOrderDocuments.invoice()).contains("ce74b771-d23d-4960-81ec-8741b3862146")
        assertThat(portingOrderDocuments.loa()).contains("64ffb720-04c7-455b-92d6-20fcca92e935")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderDocuments =
            PortingOrderDocuments.builder()
                .invoice("ce74b771-d23d-4960-81ec-8741b3862146")
                .loa("64ffb720-04c7-455b-92d6-20fcca92e935")
                .build()

        val roundtrippedPortingOrderDocuments =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderDocuments),
                jacksonTypeRef<PortingOrderDocuments>(),
            )

        assertThat(roundtrippedPortingOrderDocuments).isEqualTo(portingOrderDocuments)
    }
}
