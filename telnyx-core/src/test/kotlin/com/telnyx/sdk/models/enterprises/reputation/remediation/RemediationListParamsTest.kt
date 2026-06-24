// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RemediationListParamsTest {

    @Test
    fun create() {
        RemediationListParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .filterCreatedAtGte(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
            .filterCreatedAtLte(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
            .filterStatus(RemediationStatus.IN_PROGRESS)
            .pageNumber(1L)
            .pageSize(20L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RemediationListParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RemediationListParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .filterCreatedAtGte(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                .filterCreatedAtLte(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                .filterStatus(RemediationStatus.IN_PROGRESS)
                .pageNumber(1L)
                .pageSize(20L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[created_at][gte]", "2026-01-01T00:00:00Z")
                    .put("filter[created_at][lte]", "2026-12-31T23:59:59Z")
                    .put("filter[status]", "in_progress")
                    .put("page[number]", "1")
                    .put("page[size]", "20")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RemediationListParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
