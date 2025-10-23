// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.managedaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagedAccountListResponseTest {

    @Test
    fun create() {
        val managedAccountListResponse =
            ManagedAccountListResponse.builder()
                .addData(
                    ManagedAccountListResponse.Data.builder()
                        .id("f65ceda4-6522-4ad6-aede-98de83385123")
                        .apiUser("managed_account@example.com")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .email("user@example.com")
                        .managerAccountId("f65ceda4-6522-4ad6-aede-98de83385123")
                        .recordType(ManagedAccountListResponse.Data.RecordType.MANAGED_ACCOUNT)
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

        assertThat(managedAccountListResponse.data().getOrNull())
            .containsExactly(
                ManagedAccountListResponse.Data.builder()
                    .id("f65ceda4-6522-4ad6-aede-98de83385123")
                    .apiUser("managed_account@example.com")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .email("user@example.com")
                    .managerAccountId("f65ceda4-6522-4ad6-aede-98de83385123")
                    .recordType(ManagedAccountListResponse.Data.RecordType.MANAGED_ACCOUNT)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .managedAccountAllowCustomPricing(true)
                    .organizationName("Example Company LLC")
                    .rollupBilling(false)
                    .build()
            )
        assertThat(managedAccountListResponse.meta())
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
        val managedAccountListResponse =
            ManagedAccountListResponse.builder()
                .addData(
                    ManagedAccountListResponse.Data.builder()
                        .id("f65ceda4-6522-4ad6-aede-98de83385123")
                        .apiUser("managed_account@example.com")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .email("user@example.com")
                        .managerAccountId("f65ceda4-6522-4ad6-aede-98de83385123")
                        .recordType(ManagedAccountListResponse.Data.RecordType.MANAGED_ACCOUNT)
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

        val roundtrippedManagedAccountListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(managedAccountListResponse),
                jacksonTypeRef<ManagedAccountListResponse>(),
            )

        assertThat(roundtrippedManagedAccountListResponse).isEqualTo(managedAccountListResponse)
    }
}
