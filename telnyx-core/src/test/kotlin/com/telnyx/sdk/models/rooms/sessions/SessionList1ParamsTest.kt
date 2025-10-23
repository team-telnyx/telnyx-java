// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.sessions

import com.telnyx.sdk.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionList1ParamsTest {

    @Test
    fun create() {
        SessionList1Params.builder()
            .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
            .filter(
                SessionList1Params.Filter.builder()
                    .active(true)
                    .dateCreatedAt(
                        SessionList1Params.Filter.DateCreatedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .dateEndedAt(
                        SessionList1Params.Filter.DateEndedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .dateUpdatedAt(
                        SessionList1Params.Filter.DateUpdatedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .build()
            )
            .includeParticipants(true)
            .page(SessionList1Params.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionList1Params.builder().roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0").build()

        assertThat(params._pathParam(0)).isEqualTo("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SessionList1Params.builder()
                .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .filter(
                    SessionList1Params.Filter.builder()
                        .active(true)
                        .dateCreatedAt(
                            SessionList1Params.Filter.DateCreatedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .dateEndedAt(
                            SessionList1Params.Filter.DateEndedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .dateUpdatedAt(
                            SessionList1Params.Filter.DateUpdatedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .build()
                )
                .includeParticipants(true)
                .page(SessionList1Params.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[active]", "true")
                    .put("filter[date_created_at][eq]", "2021-04-25")
                    .put("filter[date_created_at][gte]", "2021-04-25")
                    .put("filter[date_created_at][lte]", "2021-04-25")
                    .put("filter[date_ended_at][eq]", "2021-04-25")
                    .put("filter[date_ended_at][gte]", "2021-04-25")
                    .put("filter[date_ended_at][lte]", "2021-04-25")
                    .put("filter[date_updated_at][eq]", "2021-04-25")
                    .put("filter[date_updated_at][gte]", "2021-04-25")
                    .put("filter[date_updated_at][lte]", "2021-04-25")
                    .put("include_participants", "true")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SessionList1Params.builder().roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
