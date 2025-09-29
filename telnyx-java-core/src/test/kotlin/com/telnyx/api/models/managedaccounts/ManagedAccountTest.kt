// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.managedaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagedAccountTest {

    @Test
    fun create() {
        val managedAccount =
            ManagedAccount.builder()
                .id("f65ceda4-6522-4ad6-aede-98de83385123")
                .apiKey("KEY01236170692E74656C6E79782E636F6D_YmlnIGlyb24gaXMgZGVhZA")
                .apiToken("x6oexQNHTs-fZ7-QsDMOeg")
                .apiUser("managed_account@example.com")
                .createdAt("2018-02-02T22:25:27.521Z")
                .email("user@example.com")
                .managerAccountId("f65ceda4-6522-4ad6-aede-98de83385123")
                .recordType(ManagedAccount.RecordType.MANAGED_ACCOUNT)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .balance(
                    ManagedAccountBalance.builder()
                        .availableCredit("400.00")
                        .balance("300.00")
                        .creditLimit("100.00")
                        .currency("USD")
                        .recordType(ManagedAccountBalance.RecordType.BALANCE)
                        .build()
                )
                .managedAccountAllowCustomPricing(true)
                .organizationName("Example Company LLC")
                .rollupBilling(false)
                .build()

        assertThat(managedAccount.id()).isEqualTo("f65ceda4-6522-4ad6-aede-98de83385123")
        assertThat(managedAccount.apiKey())
            .isEqualTo("KEY01236170692E74656C6E79782E636F6D_YmlnIGlyb24gaXMgZGVhZA")
        assertThat(managedAccount.apiToken()).isEqualTo("x6oexQNHTs-fZ7-QsDMOeg")
        assertThat(managedAccount.apiUser()).isEqualTo("managed_account@example.com")
        assertThat(managedAccount.createdAt()).isEqualTo("2018-02-02T22:25:27.521Z")
        assertThat(managedAccount.email()).isEqualTo("user@example.com")
        assertThat(managedAccount.managerAccountId())
            .isEqualTo("f65ceda4-6522-4ad6-aede-98de83385123")
        assertThat(managedAccount.recordType()).isEqualTo(ManagedAccount.RecordType.MANAGED_ACCOUNT)
        assertThat(managedAccount.updatedAt()).isEqualTo("2018-02-02T22:25:27.521Z")
        assertThat(managedAccount.balance())
            .contains(
                ManagedAccountBalance.builder()
                    .availableCredit("400.00")
                    .balance("300.00")
                    .creditLimit("100.00")
                    .currency("USD")
                    .recordType(ManagedAccountBalance.RecordType.BALANCE)
                    .build()
            )
        assertThat(managedAccount.managedAccountAllowCustomPricing()).contains(true)
        assertThat(managedAccount.organizationName()).contains("Example Company LLC")
        assertThat(managedAccount.rollupBilling()).contains(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val managedAccount =
            ManagedAccount.builder()
                .id("f65ceda4-6522-4ad6-aede-98de83385123")
                .apiKey("KEY01236170692E74656C6E79782E636F6D_YmlnIGlyb24gaXMgZGVhZA")
                .apiToken("x6oexQNHTs-fZ7-QsDMOeg")
                .apiUser("managed_account@example.com")
                .createdAt("2018-02-02T22:25:27.521Z")
                .email("user@example.com")
                .managerAccountId("f65ceda4-6522-4ad6-aede-98de83385123")
                .recordType(ManagedAccount.RecordType.MANAGED_ACCOUNT)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .balance(
                    ManagedAccountBalance.builder()
                        .availableCredit("400.00")
                        .balance("300.00")
                        .creditLimit("100.00")
                        .currency("USD")
                        .recordType(ManagedAccountBalance.RecordType.BALANCE)
                        .build()
                )
                .managedAccountAllowCustomPricing(true)
                .organizationName("Example Company LLC")
                .rollupBilling(false)
                .build()

        val roundtrippedManagedAccount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(managedAccount),
                jacksonTypeRef<ManagedAccount>(),
            )

        assertThat(roundtrippedManagedAccount).isEqualTo(managedAccount)
    }
}
