// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.filters

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterAddParamsTest {

    @Test
    fun create() {
        FilterAddParams.builder()
            .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .mutateInboxFiltersRequest(
                MutateInboxFiltersRequest.builder()
                    .addEntry("@spam.example")
                    .type(MutateInboxFiltersRequest.Type.BLOCKLIST)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FilterAddParams.builder()
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .mutateInboxFiltersRequest(
                    MutateInboxFiltersRequest.builder()
                        .addEntry("@spam.example")
                        .type(MutateInboxFiltersRequest.Type.BLOCKLIST)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FilterAddParams.builder()
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .mutateInboxFiltersRequest(
                    MutateInboxFiltersRequest.builder()
                        .addEntry("@spam.example")
                        .type(MutateInboxFiltersRequest.Type.BLOCKLIST)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MutateInboxFiltersRequest.builder()
                    .addEntry("@spam.example")
                    .type(MutateInboxFiltersRequest.Type.BLOCKLIST)
                    .build()
            )
    }
}
