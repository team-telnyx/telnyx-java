// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callreasons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallReasonListPageResponseTest {

    @Test
    fun create() {
        val callReasonListPageResponse =
            CallReasonListPageResponse.builder()
                .addData(
                    CallReasonListResponse.builder()
                        .id("d29914a4-3c93-440c-af72-03778f442522")
                        .description("Alert about account status or changes")
                        .reason("Account Alert")
                        .build()
                )
                .meta(
                    CallReasonListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(callReasonListPageResponse.data())
            .containsExactly(
                CallReasonListResponse.builder()
                    .id("d29914a4-3c93-440c-af72-03778f442522")
                    .description("Alert about account status or changes")
                    .reason("Account Alert")
                    .build()
            )
        assertThat(callReasonListPageResponse.meta())
            .isEqualTo(
                CallReasonListPageResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(3L)
                    .totalResults(42L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callReasonListPageResponse =
            CallReasonListPageResponse.builder()
                .addData(
                    CallReasonListResponse.builder()
                        .id("d29914a4-3c93-440c-af72-03778f442522")
                        .description("Alert about account status or changes")
                        .reason("Account Alert")
                        .build()
                )
                .meta(
                    CallReasonListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedCallReasonListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callReasonListPageResponse),
                jacksonTypeRef<CallReasonListPageResponse>(),
            )

        assertThat(roundtrippedCallReasonListPageResponse).isEqualTo(callReasonListPageResponse)
    }
}
