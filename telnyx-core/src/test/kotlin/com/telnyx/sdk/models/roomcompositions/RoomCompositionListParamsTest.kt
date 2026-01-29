// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomcompositions

import com.telnyx.sdk.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomCompositionListParamsTest {

    @Test
    fun create() {
        RoomCompositionListParams.builder()
            .filter(
                RoomCompositionListParams.Filter.builder()
                    .dateCreatedAt(
                        RoomCompositionListParams.Filter.DateCreatedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .sessionId("92e7d459-bcc5-4386-9f5f-6dd14a82588d")
                    .status(RoomCompositionListParams.Filter.Status.COMPLETED)
                    .build()
            )
            .page(RoomCompositionListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RoomCompositionListParams.builder()
                .filter(
                    RoomCompositionListParams.Filter.builder()
                        .dateCreatedAt(
                            RoomCompositionListParams.Filter.DateCreatedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .sessionId("92e7d459-bcc5-4386-9f5f-6dd14a82588d")
                        .status(RoomCompositionListParams.Filter.Status.COMPLETED)
                        .build()
                )
                .page(RoomCompositionListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[date_created_at][eq]", "2021-04-25")
                    .put("filter[date_created_at][gte]", "2021-04-25")
                    .put("filter[date_created_at][lte]", "2021-04-25")
                    .put("filter[session_id]", "92e7d459-bcc5-4386-9f5f-6dd14a82588d")
                    .put("filter[status]", "completed")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RoomCompositionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
