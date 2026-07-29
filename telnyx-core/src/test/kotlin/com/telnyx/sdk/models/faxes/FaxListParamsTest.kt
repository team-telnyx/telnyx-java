// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxes

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
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
            .pageNumber(0L)
            .pageSize(0L)
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
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "filter[created_at][gt]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2020-02-02T22:25:27.521992Z")
                        ),
                    )
                    .put(
                        "filter[created_at][gte]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2020-02-02T22:25:27.521992Z")
                        ),
                    )
                    .put(
                        "filter[created_at][lt]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2020-02-02T22:25:27.521992Z")
                        ),
                    )
                    .put(
                        "filter[created_at][lte]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2020-02-02T22:25:27.521992Z")
                        ),
                    )
                    .put("filter[direction][eq]", "inbound")
                    .put("filter[from][eq]", "+13127367276")
                    .put("filter[to][eq]", "+13127367276")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
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
