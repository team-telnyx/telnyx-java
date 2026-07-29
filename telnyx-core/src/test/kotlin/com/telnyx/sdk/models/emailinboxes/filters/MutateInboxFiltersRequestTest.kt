// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.filters

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MutateInboxFiltersRequestTest {

    @Test
    fun create() {
        val mutateInboxFiltersRequest =
            MutateInboxFiltersRequest.builder()
                .addEntry("@example.com")
                .type(MutateInboxFiltersRequest.Type.ALLOWLIST)
                .build()

        assertThat(mutateInboxFiltersRequest.entries()).containsExactly("@example.com")
        assertThat(mutateInboxFiltersRequest.type())
            .isEqualTo(MutateInboxFiltersRequest.Type.ALLOWLIST)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mutateInboxFiltersRequest =
            MutateInboxFiltersRequest.builder()
                .addEntry("@example.com")
                .type(MutateInboxFiltersRequest.Type.ALLOWLIST)
                .build()

        val roundtrippedMutateInboxFiltersRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mutateInboxFiltersRequest),
                jacksonTypeRef<MutateInboxFiltersRequest>(),
            )

        assertThat(roundtrippedMutateInboxFiltersRequest).isEqualTo(mutateInboxFiltersRequest)
    }
}
