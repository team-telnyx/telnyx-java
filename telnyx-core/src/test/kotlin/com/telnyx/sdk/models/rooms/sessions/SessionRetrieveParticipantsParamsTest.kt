// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.sessions

import com.telnyx.sdk.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionRetrieveParticipantsParamsTest {

    @Test
    fun create() {
        SessionRetrieveParticipantsParams.builder()
            .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
            .filter(
                SessionRetrieveParticipantsParams.Filter.builder()
                    .context("Alice")
                    .dateJoinedAt(
                        SessionRetrieveParticipantsParams.Filter.DateJoinedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .dateLeftAt(
                        SessionRetrieveParticipantsParams.Filter.DateLeftAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .dateUpdatedAt(
                        SessionRetrieveParticipantsParams.Filter.DateUpdatedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionRetrieveParticipantsParams.builder()
                .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SessionRetrieveParticipantsParams.builder()
                .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .filter(
                    SessionRetrieveParticipantsParams.Filter.builder()
                        .context("Alice")
                        .dateJoinedAt(
                            SessionRetrieveParticipantsParams.Filter.DateJoinedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .dateLeftAt(
                            SessionRetrieveParticipantsParams.Filter.DateLeftAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .dateUpdatedAt(
                            SessionRetrieveParticipantsParams.Filter.DateUpdatedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
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
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SessionRetrieveParticipantsParams.builder()
                .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
