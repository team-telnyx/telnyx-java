// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.seti

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SetiRetrieveBlackBoxTestResultsResponseTest {

    @Test
    fun create() {
        val setiRetrieveBlackBoxTestResultsResponse =
            SetiRetrieveBlackBoxTestResultsResponse.builder()
                .addData(
                    SetiRetrieveBlackBoxTestResultsResponse.Data.builder()
                        .addBlackBoxTest(
                            SetiRetrieveBlackBoxTestResultsResponse.Data.BlackBoxTest.builder()
                                .id("msg_overview_outbound_sms")
                                .recordType("black_box_test")
                                .result(0.999)
                                .build()
                        )
                        .product("cloud_storage")
                        .recordType("black_box_test_result")
                        .build()
                )
                .build()

        assertThat(setiRetrieveBlackBoxTestResultsResponse.data().getOrNull())
            .containsExactly(
                SetiRetrieveBlackBoxTestResultsResponse.Data.builder()
                    .addBlackBoxTest(
                        SetiRetrieveBlackBoxTestResultsResponse.Data.BlackBoxTest.builder()
                            .id("msg_overview_outbound_sms")
                            .recordType("black_box_test")
                            .result(0.999)
                            .build()
                    )
                    .product("cloud_storage")
                    .recordType("black_box_test_result")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val setiRetrieveBlackBoxTestResultsResponse =
            SetiRetrieveBlackBoxTestResultsResponse.builder()
                .addData(
                    SetiRetrieveBlackBoxTestResultsResponse.Data.builder()
                        .addBlackBoxTest(
                            SetiRetrieveBlackBoxTestResultsResponse.Data.BlackBoxTest.builder()
                                .id("msg_overview_outbound_sms")
                                .recordType("black_box_test")
                                .result(0.999)
                                .build()
                        )
                        .product("cloud_storage")
                        .recordType("black_box_test_result")
                        .build()
                )
                .build()

        val roundtrippedSetiRetrieveBlackBoxTestResultsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(setiRetrieveBlackBoxTestResultsResponse),
                jacksonTypeRef<SetiRetrieveBlackBoxTestResultsResponse>(),
            )

        assertThat(roundtrippedSetiRetrieveBlackBoxTestResultsResponse)
            .isEqualTo(setiRetrieveBlackBoxTestResultsResponse)
    }
}
