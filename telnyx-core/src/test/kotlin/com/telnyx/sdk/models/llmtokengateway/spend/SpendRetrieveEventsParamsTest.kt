// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.spend

import com.telnyx.sdk.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendRetrieveEventsParamsTest {

    @Test
    fun create() {
        SpendRetrieveEventsParams.builder()
            .endDate(LocalDate.parse("2019-12-27"))
            .endUserId("end_user_id")
            .metadata(
                SpendRetrieveEventsParams.Metadata.builder()
                    .putAdditionalProperty("foo", "J!Q0Ok0bzJb7")
                    .build()
            )
            .pageNumber(1L)
            .pageSize(1L)
            .pageSnapshot("page[snapshot]")
            .startDate(LocalDate.parse("2019-12-27"))
            .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .tokenKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SpendRetrieveEventsParams.builder()
                .endDate(LocalDate.parse("2019-12-27"))
                .endUserId("end_user_id")
                .metadata(
                    SpendRetrieveEventsParams.Metadata.builder()
                        .putAdditionalProperty("foo", "J!Q0Ok0bzJb7")
                        .build()
                )
                .pageNumber(1L)
                .pageSize(1L)
                .pageSnapshot("page[snapshot]")
                .startDate(LocalDate.parse("2019-12-27"))
                .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tokenKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end_date", LocalDate.parse("2019-12-27").toString())
                    .put("end_user_id", "end_user_id")
                    .put("metadata[foo]", "J!Q0Ok0bzJb7")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("page[snapshot]", "page[snapshot]")
                    .put("start_date", LocalDate.parse("2019-12-27").toString())
                    .put("token_group_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("token_key_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("token_user_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SpendRetrieveEventsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
