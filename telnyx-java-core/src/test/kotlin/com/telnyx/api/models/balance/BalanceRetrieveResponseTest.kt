// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.balance

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceRetrieveResponseTest {

    @Test
    fun create() {
        val balanceRetrieveResponse =
            BalanceRetrieveResponse.builder()
                .data(
                    BalanceRetrieveResponse.Data.builder()
                        .availableCredit("400.00")
                        .balance("300.00")
                        .creditLimit("100.00")
                        .currency("USD")
                        .pending("10.00")
                        .recordType(BalanceRetrieveResponse.Data.RecordType.BALANCE)
                        .build()
                )
                .build()

        assertThat(balanceRetrieveResponse.data())
            .contains(
                BalanceRetrieveResponse.Data.builder()
                    .availableCredit("400.00")
                    .balance("300.00")
                    .creditLimit("100.00")
                    .currency("USD")
                    .pending("10.00")
                    .recordType(BalanceRetrieveResponse.Data.RecordType.BALANCE)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceRetrieveResponse =
            BalanceRetrieveResponse.builder()
                .data(
                    BalanceRetrieveResponse.Data.builder()
                        .availableCredit("400.00")
                        .balance("300.00")
                        .creditLimit("100.00")
                        .currency("USD")
                        .pending("10.00")
                        .recordType(BalanceRetrieveResponse.Data.RecordType.BALANCE)
                        .build()
                )
                .build()

        val roundtrippedBalanceRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceRetrieveResponse),
                jacksonTypeRef<BalanceRetrieveResponse>(),
            )

        assertThat(roundtrippedBalanceRetrieveResponse).isEqualTo(balanceRetrieveResponse)
    }
}
