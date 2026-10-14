// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BpoAuthorizationInputTest {

    @Test
    fun create() {
        val bpoAuthorizationInput =
            BpoAuthorizationInput.builder()
                .bpoEnterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .build()

        assertThat(bpoAuthorizationInput.bpoEnterpriseId())
            .isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        assertThat(bpoAuthorizationInput.loaDocumentId())
            .isEqualTo("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bpoAuthorizationInput =
            BpoAuthorizationInput.builder()
                .bpoEnterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .build()

        val roundtrippedBpoAuthorizationInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bpoAuthorizationInput),
                jacksonTypeRef<BpoAuthorizationInput>(),
            )

        assertThat(roundtrippedBpoAuthorizationInput).isEqualTo(bpoAuthorizationInput)
    }
}
