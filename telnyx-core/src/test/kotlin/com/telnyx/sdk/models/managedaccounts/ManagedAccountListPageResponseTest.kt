// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.managedaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagedAccountListPageResponseTest {

    @Test
    fun create() {
        val managedAccountListPageResponse =
            ManagedAccountListPageResponse.builder()
                .addData(
                    ManagedAccountListResponse.builder()
                        .id("f65ceda4-6522-4ad6-aede-98de83385123")
                        .apiUser("managed_account@example.com")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .email("user@example.com")
                        .managerAccountId("f65ceda4-6522-4ad6-aede-98de83385123")
                        .recordType(ManagedAccountListResponse.RecordType.MANAGED_ACCOUNT)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .managedAccountAllowCustomPricing(true)
                        .organizationName("Example Company LLC")
                        .rollupBilling(false)
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(managedAccountListPageResponse.data().getOrNull())
            .containsExactly(
                ManagedAccountListResponse.builder()
                    .id("f65ceda4-6522-4ad6-aede-98de83385123")
                    .apiUser("managed_account@example.com")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .email("user@example.com")
                    .managerAccountId("f65ceda4-6522-4ad6-aede-98de83385123")
                    .recordType(ManagedAccountListResponse.RecordType.MANAGED_ACCOUNT)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .managedAccountAllowCustomPricing(true)
                    .organizationName("Example Company LLC")
                    .rollupBilling(false)
                    .build()
            )
        assertThat(managedAccountListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val managedAccountListPageResponse =
            ManagedAccountListPageResponse.builder()
                .addData(
                    ManagedAccountListResponse.builder()
                        .id("f65ceda4-6522-4ad6-aede-98de83385123")
                        .apiUser("managed_account@example.com")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .email("user@example.com")
                        .managerAccountId("f65ceda4-6522-4ad6-aede-98de83385123")
                        .recordType(ManagedAccountListResponse.RecordType.MANAGED_ACCOUNT)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .managedAccountAllowCustomPricing(true)
                        .organizationName("Example Company LLC")
                        .rollupBilling(false)
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedManagedAccountListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(managedAccountListPageResponse),
                jacksonTypeRef<ManagedAccountListPageResponse>(),
            )

        assertThat(roundtrippedManagedAccountListPageResponse)
            .isEqualTo(managedAccountListPageResponse)
    }
}
