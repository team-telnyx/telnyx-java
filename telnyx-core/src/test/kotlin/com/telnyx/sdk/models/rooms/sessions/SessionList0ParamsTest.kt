// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.sessions

import com.telnyx.sdk.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionList0ParamsTest {

    @Test
    fun create() {
        SessionList0Params.builder()
            .filter(
                SessionList0Params.Filter.builder()
                    .active(true)
                    .dateCreatedAt(
                        SessionList0Params.Filter.DateCreatedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .dateEndedAt(
                        SessionList0Params.Filter.DateEndedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .dateUpdatedAt(
                        SessionList0Params.Filter.DateUpdatedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .build()
            )
            .includeParticipants(true)
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SessionList0Params.builder()
                .filter(
                    SessionList0Params.Filter.builder()
                        .active(true)
                        .dateCreatedAt(
                            SessionList0Params.Filter.DateCreatedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .dateEndedAt(
                            SessionList0Params.Filter.DateEndedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .dateUpdatedAt(
                            SessionList0Params.Filter.DateUpdatedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .build()
                )
                .includeParticipants(true)
                .pageNumber(0L)
                .pageSize(0L)
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
                    .put("filter[room_id]", "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .put("include_participants", "true")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SessionList0Params.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
