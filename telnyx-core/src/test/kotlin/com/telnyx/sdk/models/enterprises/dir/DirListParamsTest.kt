// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.dir

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirListParamsTest {

    @Test
    fun create() {
        DirListParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .filterCallReasonContains("filter[call_reason][contains]")
            .filterDisplayNameContains("filter[display_name][contains]")
            .filterExpiringAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .filterExpiringAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .filterExpiringWithinDays(1L)
            .filterStatus(DirListParams.FilterStatus.DRAFT)
            .pageNumber(1L)
            .pageSize(20L)
            .search("search")
            .sort(DirListParams.Sort.CREATED_AT)
            .status(DirListParams.Status.DRAFT)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DirListParams.builder().enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6").build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DirListParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .filterCallReasonContains("filter[call_reason][contains]")
                .filterDisplayNameContains("filter[display_name][contains]")
                .filterExpiringAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filterExpiringAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filterExpiringWithinDays(1L)
                .filterStatus(DirListParams.FilterStatus.DRAFT)
                .pageNumber(1L)
                .pageSize(20L)
                .search("search")
                .sort(DirListParams.Sort.CREATED_AT)
                .status(DirListParams.Status.DRAFT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[call_reason][contains]", "filter[call_reason][contains]")
                    .put("filter[display_name][contains]", "filter[display_name][contains]")
                    .put("filter[expiring_at][gte]", "2019-12-27T18:11:19.117Z")
                    .put("filter[expiring_at][lte]", "2019-12-27T18:11:19.117Z")
                    .put("filter[expiring_within_days]", "1")
                    .put("filter[status]", "draft")
                    .put("page[number]", "1")
                    .put("page[size]", "20")
                    .put("search", "search")
                    .put("sort", "created_at")
                    .put("status", "draft")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            DirListParams.builder().enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
