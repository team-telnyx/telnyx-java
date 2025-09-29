// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.managedaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagedAccountBalanceTest {

    @Test
    fun create() {
        val managedAccountBalance =
            ManagedAccountBalance.builder()
                .availableCredit("400.00")
                .balance("300.00")
                .creditLimit("100.00")
                .currency("USD")
                .recordType(ManagedAccountBalance.RecordType.BALANCE)
                .build()

        assertThat(managedAccountBalance.availableCredit()).contains("400.00")
        assertThat(managedAccountBalance.balance()).contains("300.00")
        assertThat(managedAccountBalance.creditLimit()).contains("100.00")
        assertThat(managedAccountBalance.currency()).contains("USD")
        assertThat(managedAccountBalance.recordType())
            .contains(ManagedAccountBalance.RecordType.BALANCE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val managedAccountBalance =
            ManagedAccountBalance.builder()
                .availableCredit("400.00")
                .balance("300.00")
                .creditLimit("100.00")
                .currency("USD")
                .recordType(ManagedAccountBalance.RecordType.BALANCE)
                .build()

        val roundtrippedManagedAccountBalance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(managedAccountBalance),
                jacksonTypeRef<ManagedAccountBalance>(),
            )

        assertThat(roundtrippedManagedAccountBalance).isEqualTo(managedAccountBalance)
    }
}
