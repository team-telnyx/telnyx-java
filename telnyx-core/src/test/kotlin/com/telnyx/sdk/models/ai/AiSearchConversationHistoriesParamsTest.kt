// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiSearchConversationHistoriesParamsTest {

    @Test
    fun create() {
        AiSearchConversationHistoriesParams.builder()
            .q("customer called about billing issue")
            .recordType(AiSearchConversationHistoriesParams.RecordType.VOICE)
            .filterDocumentId("doc-789")
            .filterIngestedAtGte(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
            .filterIngestedAtLte(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
            .filterRecordCreatedAtGte(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
            .filterRecordCreatedAtLte(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
            .filterRecordId("rec-001")
            .filterRegionIn("USA,DEU")
            .filterRetention("filter[retention]")
            .filterUserId("user-123")
            .minScore(0.5f)
            .region(AiSearchConversationHistoriesParams.Region.USA)
            .topK(10L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AiSearchConversationHistoriesParams.builder()
                .q("customer called about billing issue")
                .recordType(AiSearchConversationHistoriesParams.RecordType.VOICE)
                .filterDocumentId("doc-789")
                .filterIngestedAtGte(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                .filterIngestedAtLte(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                .filterRecordCreatedAtGte(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                .filterRecordCreatedAtLte(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                .filterRecordId("rec-001")
                .filterRegionIn("USA,DEU")
                .filterRetention("filter[retention]")
                .filterUserId("user-123")
                .minScore(0.5f)
                .region(AiSearchConversationHistoriesParams.Region.USA)
                .topK(10L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("q", "customer called about billing issue")
                    .put("record_type", "voice")
                    .put("filter[document_id]", "doc-789")
                    .put("filter[ingested_at][gte]", "2026-01-01T00:00:00Z")
                    .put("filter[ingested_at][lte]", "2026-12-31T23:59:59Z")
                    .put("filter[record_created_at][gte]", "2026-01-01T00:00:00Z")
                    .put("filter[record_created_at][lte]", "2026-12-31T23:59:59Z")
                    .put("filter[record_id]", "rec-001")
                    .put("filter[region][in]", "USA,DEU")
                    .put("filter[retention]", "filter[retention]")
                    .put("filter[user_id]", "user-123")
                    .put("min_score", "0.5")
                    .put("region", "USA")
                    .put("top_k", "10")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AiSearchConversationHistoriesParams.builder()
                .q("customer called about billing issue")
                .recordType(AiSearchConversationHistoriesParams.RecordType.VOICE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("q", "customer called about billing issue")
                    .put("record_type", "voice")
                    .build()
            )
    }
}
