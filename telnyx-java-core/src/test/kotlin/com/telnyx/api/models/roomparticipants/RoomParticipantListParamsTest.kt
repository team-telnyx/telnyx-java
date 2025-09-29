// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.roomparticipants

import com.telnyx.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomParticipantListParamsTest {

    @Test
    fun create() {
        RoomParticipantListParams.builder()
            .filter(
                RoomParticipantListParams.Filter.builder()
                    .context("Alice")
                    .dateJoinedAt(
                        RoomParticipantListParams.Filter.DateJoinedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .dateLeftAt(
                        RoomParticipantListParams.Filter.DateLeftAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .dateUpdatedAt(
                        RoomParticipantListParams.Filter.DateUpdatedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .sessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .build()
            )
            .page(RoomParticipantListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RoomParticipantListParams.builder()
                .filter(
                    RoomParticipantListParams.Filter.builder()
                        .context("Alice")
                        .dateJoinedAt(
                            RoomParticipantListParams.Filter.DateJoinedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .dateLeftAt(
                            RoomParticipantListParams.Filter.DateLeftAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .dateUpdatedAt(
                            RoomParticipantListParams.Filter.DateUpdatedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .sessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .build()
                )
                .page(RoomParticipantListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[context]", "Alice")
                    .put("filter[date_joined_at][eq]", "2021-04-25")
                    .put("filter[date_joined_at][gte]", "2021-04-25")
                    .put("filter[date_joined_at][lte]", "2021-04-25")
                    .put("filter[date_left_at][eq]", "2021-04-25")
                    .put("filter[date_left_at][gte]", "2021-04-25")
                    .put("filter[date_left_at][lte]", "2021-04-25")
                    .put("filter[date_updated_at][eq]", "2021-04-25")
                    .put("filter[date_updated_at][gte]", "2021-04-25")
                    .put("filter[date_updated_at][lte]", "2021-04-25")
                    .put("filter[session_id]", "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RoomParticipantListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
