// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.managedaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagedAccountRetrieveResponseTest {

    @Test
    fun create() {
        val managedAccountRetrieveResponse =
            ManagedAccountRetrieveResponse.builder()
                .data(
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
                )
                .build()

        assertThat(managedAccountRetrieveResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val managedAccountRetrieveResponse =
            ManagedAccountRetrieveResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedManagedAccountRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(managedAccountRetrieveResponse),
                jacksonTypeRef<ManagedAccountRetrieveResponse>(),
            )

        assertThat(roundtrippedManagedAccountRetrieveResponse)
            .isEqualTo(managedAccountRetrieveResponse)
    }
}
