// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand.externalvetting

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVettingUpdateExternalVettingResponseTest {

    @Test
    fun create() {
        val externalVettingUpdateExternalVettingResponse =
            ExternalVettingUpdateExternalVettingResponse.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        assertThat(externalVettingUpdateExternalVettingResponse.createDate()).contains("createDate")
        assertThat(externalVettingUpdateExternalVettingResponse.evpId()).contains("evpId")
        assertThat(externalVettingUpdateExternalVettingResponse.vettedDate()).contains("vettedDate")
        assertThat(externalVettingUpdateExternalVettingResponse.vettingClass())
            .contains("vettingClass")
        assertThat(externalVettingUpdateExternalVettingResponse.vettingId()).contains("vettingId")
        assertThat(externalVettingUpdateExternalVettingResponse.vettingScore()).contains(0L)
        assertThat(externalVettingUpdateExternalVettingResponse.vettingToken())
            .contains("vettingToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalVettingUpdateExternalVettingResponse =
            ExternalVettingUpdateExternalVettingResponse.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        val roundtrippedExternalVettingUpdateExternalVettingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalVettingUpdateExternalVettingResponse),
                jacksonTypeRef<ExternalVettingUpdateExternalVettingResponse>(),
            )

        assertThat(roundtrippedExternalVettingUpdateExternalVettingResponse)
            .isEqualTo(externalVettingUpdateExternalVettingResponse)
    }
}
