// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokenkeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.llmtokengateway.tokengroups.AiGatewayResourcesPageMeta
import com.telnyx.sdk.models.llmtokengateway.tokengroups.BudgetDuration
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenKeyListPageResponseTest {

    @Test
    fun create() {
        val tokenKeyListPageResponse =
            TokenKeyListPageResponse.builder()
                .addData(
                    TokenKey.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAllowedModel("J!Q0Ok0bzJb7")
                        .blocked(true)
                        .budgetDuration(BudgetDuration._1D)
                        .budgetStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maxBudget(0.0)
                        .name("name")
                        .requiredEndUserId(true)
                        .reservedSpend(0.0)
                        .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .rpmLimit(0L)
                        .spend(0.0)
                        .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tpmLimit(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .version(1L)
                        .maxParallelRequests(1L)
                        .provisioning(TokenKey.Provisioning.READY)
                        .build()
                )
                .meta(
                    AiGatewayResourcesPageMeta.builder()
                        .hasMore(true)
                        .pageNumber(1L)
                        .pageSize(1L)
                        .snapshot("snapshot")
                        .build()
                )
                .build()

        assertThat(tokenKeyListPageResponse.data())
            .containsExactly(
                TokenKey.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAllowedModel("J!Q0Ok0bzJb7")
                    .blocked(true)
                    .budgetDuration(BudgetDuration._1D)
                    .budgetStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .maxBudget(0.0)
                    .name("name")
                    .requiredEndUserId(true)
                    .reservedSpend(0.0)
                    .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .rpmLimit(0L)
                    .spend(0.0)
                    .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tpmLimit(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .version(1L)
                    .maxParallelRequests(1L)
                    .provisioning(TokenKey.Provisioning.READY)
                    .build()
            )
        assertThat(tokenKeyListPageResponse.meta())
            .isEqualTo(
                AiGatewayResourcesPageMeta.builder()
                    .hasMore(true)
                    .pageNumber(1L)
                    .pageSize(1L)
                    .snapshot("snapshot")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenKeyListPageResponse =
            TokenKeyListPageResponse.builder()
                .addData(
                    TokenKey.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAllowedModel("J!Q0Ok0bzJb7")
                        .blocked(true)
                        .budgetDuration(BudgetDuration._1D)
                        .budgetStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maxBudget(0.0)
                        .name("name")
                        .requiredEndUserId(true)
                        .reservedSpend(0.0)
                        .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .rpmLimit(0L)
                        .spend(0.0)
                        .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tpmLimit(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .version(1L)
                        .maxParallelRequests(1L)
                        .provisioning(TokenKey.Provisioning.READY)
                        .build()
                )
                .meta(
                    AiGatewayResourcesPageMeta.builder()
                        .hasMore(true)
                        .pageNumber(1L)
                        .pageSize(1L)
                        .snapshot("snapshot")
                        .build()
                )
                .build()

        val roundtrippedTokenKeyListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenKeyListPageResponse),
                jacksonTypeRef<TokenKeyListPageResponse>(),
            )

        assertThat(roundtrippedTokenKeyListPageResponse).isEqualTo(tokenKeyListPageResponse)
    }
}
