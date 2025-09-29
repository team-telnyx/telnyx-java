// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.rooms

import com.telnyx.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomListParamsTest {

    @Test
    fun create() {
        RoomListParams.builder()
            .filter(
                RoomListParams.Filter.builder()
                    .dateCreatedAt(
                        RoomListParams.Filter.DateCreatedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .dateUpdatedAt(
                        RoomListParams.Filter.DateUpdatedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .uniqueName("my_video_room")
                    .build()
            )
            .includeSessions(true)
            .page(RoomListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RoomListParams.builder()
                .filter(
                    RoomListParams.Filter.builder()
                        .dateCreatedAt(
                            RoomListParams.Filter.DateCreatedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .dateUpdatedAt(
                            RoomListParams.Filter.DateUpdatedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .uniqueName("my_video_room")
                        .build()
                )
                .includeSessions(true)
                .page(RoomListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[date_created_at][eq]", "2021-04-25")
                    .put("filter[date_created_at][gte]", "2021-04-25")
                    .put("filter[date_created_at][lte]", "2021-04-25")
                    .put("filter[date_updated_at][eq]", "2021-04-25")
                    .put("filter[date_updated_at][gte]", "2021-04-25")
                    .put("filter[date_updated_at][lte]", "2021-04-25")
                    .put("filter[unique_name]", "my_video_room")
                    .put("include_sessions", "true")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RoomListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
