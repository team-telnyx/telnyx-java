// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirListParamsTest {

    @Test
    fun create() {
        DirListParams.builder()
            .filterCallReasonContains("filter[call_reason][contains]")
            .filterDisplayNameContains("filter[display_name][contains]")
            .filterEnterpriseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filterExpiringAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .filterExpiringAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .filterStatus(DirStatus.DRAFT)
            .pageNumber(1L)
            .pageSize(20L)
            .sort(DirListParams.Sort.CREATED_AT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DirListParams.builder()
                .filterCallReasonContains("filter[call_reason][contains]")
                .filterDisplayNameContains("filter[display_name][contains]")
                .filterEnterpriseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filterExpiringAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filterExpiringAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filterStatus(DirStatus.DRAFT)
                .pageNumber(1L)
                .pageSize(20L)
                .sort(DirListParams.Sort.CREATED_AT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[call_reason][contains]", "filter[call_reason][contains]")
                    .put("filter[display_name][contains]", "filter[display_name][contains]")
                    .put("filter[enterprise_id]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("filter[expiring_at][gte]", "2019-12-27T18:11:19.117Z")
                    .put("filter[expiring_at][lte]", "2019-12-27T18:11:19.117Z")
                    .put("filter[status]", "draft")
                    .put("page[number]", "1")
                    .put("page[size]", "20")
                    .put("sort", "created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DirListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
