// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberRefreshResponseTest {

    @Test
    fun create() {
        val numberRefreshResponse =
            NumberRefreshResponse.builder()
                .data(
                    NumberRefreshResponse.Data.builder()
                        .addResult(
                            NumberRefreshResponse.Data.Result.builder()
                                .phoneNumber("+19493253498")
                                .success(true)
                                .error(null)
                                .build()
                        )
                        .totalFailed(0L)
                        .totalRequested(1L)
                        .totalSuccessful(1L)
                        .build()
                )
                .build()

        assertThat(numberRefreshResponse.data())
            .isEqualTo(
                NumberRefreshResponse.Data.builder()
                    .addResult(
                        NumberRefreshResponse.Data.Result.builder()
                            .phoneNumber("+19493253498")
                            .success(true)
                            .error(null)
                            .build()
                    )
                    .totalFailed(0L)
                    .totalRequested(1L)
                    .totalSuccessful(1L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberRefreshResponse =
            NumberRefreshResponse.builder()
                .data(
                    NumberRefreshResponse.Data.builder()
                        .addResult(
                            NumberRefreshResponse.Data.Result.builder()
                                .phoneNumber("+19493253498")
                                .success(true)
                                .error(null)
                                .build()
                        )
                        .totalFailed(0L)
                        .totalRequested(1L)
                        .totalSuccessful(1L)
                        .build()
                )
                .build()

        val roundtrippedNumberRefreshResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberRefreshResponse),
                jacksonTypeRef<NumberRefreshResponse>(),
            )

        assertThat(roundtrippedNumberRefreshResponse).isEqualTo(numberRefreshResponse)
    }
}
