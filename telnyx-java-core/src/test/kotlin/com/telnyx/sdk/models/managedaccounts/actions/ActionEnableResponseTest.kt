// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.managedaccounts.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.managedaccounts.ManagedAccount
import com.telnyx.sdk.models.managedaccounts.ManagedAccountBalance
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionEnableResponseTest {

    @Test
    fun create() {
        val actionEnableResponse =
            ActionEnableResponse.builder()
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

        assertThat(actionEnableResponse.data())
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
        val actionEnableResponse =
            ActionEnableResponse.builder()
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

        val roundtrippedActionEnableResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionEnableResponse),
                jacksonTypeRef<ActionEnableResponse>(),
            )

        assertThat(roundtrippedActionEnableResponse).isEqualTo(actionEnableResponse)
    }
}
