// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand.externalvetting

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVettingOrderResponseTest {

    @Test
    fun create() {
        val externalVettingOrderResponse =
            ExternalVettingOrderResponse.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        assertThat(externalVettingOrderResponse.createDate()).contains("createDate")
        assertThat(externalVettingOrderResponse.evpId()).contains("evpId")
        assertThat(externalVettingOrderResponse.vettedDate()).contains("vettedDate")
        assertThat(externalVettingOrderResponse.vettingClass()).contains("vettingClass")
        assertThat(externalVettingOrderResponse.vettingId()).contains("vettingId")
        assertThat(externalVettingOrderResponse.vettingScore()).contains(0L)
        assertThat(externalVettingOrderResponse.vettingToken()).contains("vettingToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalVettingOrderResponse =
            ExternalVettingOrderResponse.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        val roundtrippedExternalVettingOrderResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalVettingOrderResponse),
                jacksonTypeRef<ExternalVettingOrderResponse>(),
            )

        assertThat(roundtrippedExternalVettingOrderResponse).isEqualTo(externalVettingOrderResponse)
    }
}
