// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.managedaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagedAccountListResponseTest {

    @Test
    fun create() {
        val managedAccountListResponse =
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

        assertThat(managedAccountListResponse.id())
            .isEqualTo("f65ceda4-6522-4ad6-aede-98de83385123")
        assertThat(managedAccountListResponse.apiUser()).isEqualTo("managed_account@example.com")
        assertThat(managedAccountListResponse.createdAt()).isEqualTo("2018-02-02T22:25:27.521Z")
        assertThat(managedAccountListResponse.email()).isEqualTo("user@example.com")
        assertThat(managedAccountListResponse.managerAccountId())
            .isEqualTo("f65ceda4-6522-4ad6-aede-98de83385123")
        assertThat(managedAccountListResponse.recordType())
            .isEqualTo(ManagedAccountListResponse.RecordType.MANAGED_ACCOUNT)
        assertThat(managedAccountListResponse.updatedAt()).isEqualTo("2018-02-02T22:25:27.521Z")
        assertThat(managedAccountListResponse.managedAccountAllowCustomPricing()).contains(true)
        assertThat(managedAccountListResponse.organizationName()).contains("Example Company LLC")
        assertThat(managedAccountListResponse.rollupBilling()).contains(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val managedAccountListResponse =
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

        val roundtrippedManagedAccountListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(managedAccountListResponse),
                jacksonTypeRef<ManagedAccountListResponse>(),
            )

        assertThat(roundtrippedManagedAccountListResponse).isEqualTo(managedAccountListResponse)
    }
}
