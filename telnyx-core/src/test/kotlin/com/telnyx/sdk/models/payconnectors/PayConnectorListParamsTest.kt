// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payconnectors

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayConnectorListParamsTest {

    @Test
    fun create() {
        PayConnectorListParams.builder()
            .filterCreatedAtEq("2026-10-01T00:00:00Z")
            .filterCreatedAtGt("2026-10-01T00:00:00Z")
            .filterCreatedAtGte("2026-10-01T00:00:00Z")
            .filterCreatedAtLt("2026-10-01T00:00:00Z")
            .filterCreatedAtLte("2026-10-01T00:00:00Z")
            .filterMode("test")
            .filterName("my-payment-connector")
            .filterType("generic")
            .filterUpdatedAtEq("2026-10-01T00:00:00Z")
            .filterUpdatedAtGt("2026-10-01T00:00:00Z")
            .filterUpdatedAtGte("2026-10-01T00:00:00Z")
            .filterUpdatedAtLt("2026-10-01T00:00:00Z")
            .filterUpdatedAtLte("2026-10-01T00:00:00Z")
            .pageAfter("page[after]")
            .pageBefore("page[before]")
            .pageSize(1L)
            .sort("-created_at")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PayConnectorListParams.builder()
                .filterCreatedAtEq("2026-10-01T00:00:00Z")
                .filterCreatedAtGt("2026-10-01T00:00:00Z")
                .filterCreatedAtGte("2026-10-01T00:00:00Z")
                .filterCreatedAtLt("2026-10-01T00:00:00Z")
                .filterCreatedAtLte("2026-10-01T00:00:00Z")
                .filterMode("test")
                .filterName("my-payment-connector")
                .filterType("generic")
                .filterUpdatedAtEq("2026-10-01T00:00:00Z")
                .filterUpdatedAtGt("2026-10-01T00:00:00Z")
                .filterUpdatedAtGte("2026-10-01T00:00:00Z")
                .filterUpdatedAtLt("2026-10-01T00:00:00Z")
                .filterUpdatedAtLte("2026-10-01T00:00:00Z")
                .pageAfter("page[after]")
                .pageBefore("page[before]")
                .pageSize(1L)
                .sort("-created_at")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[created_at][eq]", "2026-10-01T00:00:00Z")
                    .put("filter[created_at][gt]", "2026-10-01T00:00:00Z")
                    .put("filter[created_at][gte]", "2026-10-01T00:00:00Z")
                    .put("filter[created_at][lt]", "2026-10-01T00:00:00Z")
                    .put("filter[created_at][lte]", "2026-10-01T00:00:00Z")
                    .put("filter[mode]", "test")
                    .put("filter[name]", "my-payment-connector")
                    .put("filter[type]", "generic")
                    .put("filter[updated_at][eq]", "2026-10-01T00:00:00Z")
                    .put("filter[updated_at][gt]", "2026-10-01T00:00:00Z")
                    .put("filter[updated_at][gte]", "2026-10-01T00:00:00Z")
                    .put("filter[updated_at][lt]", "2026-10-01T00:00:00Z")
                    .put("filter[updated_at][lte]", "2026-10-01T00:00:00Z")
                    .put("page[after]", "page[after]")
                    .put("page[before]", "page[before]")
                    .put("page[size]", "1")
                    .put("sort", "-created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PayConnectorListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
