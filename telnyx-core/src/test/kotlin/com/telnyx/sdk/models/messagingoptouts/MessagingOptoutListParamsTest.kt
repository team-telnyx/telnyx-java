// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingoptouts

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingOptoutListParamsTest {

    @Test
    fun create() {
        MessagingOptoutListParams.builder()
            .createdAt(
                MessagingOptoutListParams.CreatedAt.builder()
                    .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .filter(
                MessagingOptoutListParams.Filter.builder()
                    .from("from")
                    .messagingProfileId("messaging_profile_id")
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .redactionEnabled("redaction_enabled")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MessagingOptoutListParams.builder()
                .createdAt(
                    MessagingOptoutListParams.CreatedAt.builder()
                        .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .filter(
                    MessagingOptoutListParams.Filter.builder()
                        .from("from")
                        .messagingProfileId("messaging_profile_id")
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .redactionEnabled("redaction_enabled")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("created_at[gte]", "2019-12-27T18:11:19.117Z")
                    .put("created_at[lte]", "2019-12-27T18:11:19.117Z")
                    .put("filter[from]", "from")
                    .put("filter[messaging_profile_id]", "messaging_profile_id")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("redaction_enabled", "redaction_enabled")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MessagingOptoutListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
