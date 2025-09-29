// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.faxes

import com.telnyx.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxListParamsTest {

    @Test
    fun create() {
        FaxListParams.builder()
            .filter(
                FaxListParams.Filter.builder()
                    .createdAt(
                        FaxListParams.Filter.CreatedAt.builder()
                            .gt(OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"))
                            .gte(OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"))
                            .lt(OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"))
                            .lte(OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"))
                            .build()
                    )
                    .direction(FaxListParams.Filter.Direction.builder().eq("inbound").build())
                    .from(FaxListParams.Filter.From.builder().eq("+13127367276").build())
                    .to(FaxListParams.Filter.To.builder().eq("+13127367276").build())
                    .build()
            )
            .page(FaxListParams.Page.builder().number(2L).size(2L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FaxListParams.builder()
                .filter(
                    FaxListParams.Filter.builder()
                        .createdAt(
                            FaxListParams.Filter.CreatedAt.builder()
                                .gt(OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"))
                                .gte(OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"))
                                .lt(OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"))
                                .lte(OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"))
                                .build()
                        )
                        .direction(FaxListParams.Filter.Direction.builder().eq("inbound").build())
                        .from(FaxListParams.Filter.From.builder().eq("+13127367276").build())
                        .to(FaxListParams.Filter.To.builder().eq("+13127367276").build())
                        .build()
                )
                .page(FaxListParams.Page.builder().number(2L).size(2L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[created_at][gt]", "2020-02-02T22:25:27.521992Z")
                    .put("filter[created_at][gte]", "2020-02-02T22:25:27.521992Z")
                    .put("filter[created_at][lt]", "2020-02-02T22:25:27.521992Z")
                    .put("filter[created_at][lte]", "2020-02-02T22:25:27.521992Z")
                    .put("filter[direction][eq]", "inbound")
                    .put("filter[from][eq]", "+13127367276")
                    .put("filter[to][eq]", "+13127367276")
                    .put("page[number]", "2")
                    .put("page[size]", "2")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FaxListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
