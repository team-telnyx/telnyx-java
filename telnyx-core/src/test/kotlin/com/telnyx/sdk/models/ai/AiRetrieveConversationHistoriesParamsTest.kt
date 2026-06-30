// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiRetrieveConversationHistoriesParamsTest {

    @Test
    fun create() {
        AiRetrieveConversationHistoriesParams.builder()
            .q("customer called about billing issue")
            .filterIngestedAtGte(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
            .filterIngestedAtLte(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
            .filterRecordCreatedAtGte(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
            .filterRecordCreatedAtLte(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
            .filterRecordId("rec-001")
            .filterRegionIn("USA,DEU")
            .filterRetention("filter[retention]")
            .filterUserId("user-123")
            .minScore(0.5f)
            .pageNumber(1L)
            .pageSize(10L)
            .region(AiRetrieveConversationHistoriesParams.Region.USA)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AiRetrieveConversationHistoriesParams.builder()
                .q("customer called about billing issue")
                .filterIngestedAtGte(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                .filterIngestedAtLte(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                .filterRecordCreatedAtGte(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                .filterRecordCreatedAtLte(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                .filterRecordId("rec-001")
                .filterRegionIn("USA,DEU")
                .filterRetention("filter[retention]")
                .filterUserId("user-123")
                .minScore(0.5f)
                .pageNumber(1L)
                .pageSize(10L)
                .region(AiRetrieveConversationHistoriesParams.Region.USA)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("q", "customer called about billing issue")
                    .put("filter[ingested_at][gte]", "2026-01-01T00:00:00Z")
                    .put("filter[ingested_at][lte]", "2026-12-31T23:59:59Z")
                    .put("filter[record_created_at][gte]", "2026-01-01T00:00:00Z")
                    .put("filter[record_created_at][lte]", "2026-12-31T23:59:59Z")
                    .put("filter[record_id]", "rec-001")
                    .put("filter[region][in]", "USA,DEU")
                    .put("filter[retention]", "filter[retention]")
                    .put("filter[user_id]", "user-123")
                    .put("min_score", "0.5")
                    .put("page[number]", "1")
                    .put("page[size]", "10")
                    .put("region", "USA")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AiRetrieveConversationHistoriesParams.builder()
                .q("customer called about billing issue")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("q", "customer called about billing issue").build()
            )
    }
}
