// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand.externalvetting

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVettingExternalVettingResponseTest {

    @Test
    fun create() {
        val externalVettingExternalVettingResponse =
            ExternalVettingExternalVettingResponse.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        assertThat(externalVettingExternalVettingResponse.createDate()).contains("createDate")
        assertThat(externalVettingExternalVettingResponse.evpId()).contains("evpId")
        assertThat(externalVettingExternalVettingResponse.vettedDate()).contains("vettedDate")
        assertThat(externalVettingExternalVettingResponse.vettingClass()).contains("vettingClass")
        assertThat(externalVettingExternalVettingResponse.vettingId()).contains("vettingId")
        assertThat(externalVettingExternalVettingResponse.vettingScore()).contains(0L)
        assertThat(externalVettingExternalVettingResponse.vettingToken()).contains("vettingToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalVettingExternalVettingResponse =
            ExternalVettingExternalVettingResponse.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        val roundtrippedExternalVettingExternalVettingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalVettingExternalVettingResponse),
                jacksonTypeRef<ExternalVettingExternalVettingResponse>(),
            )

        assertThat(roundtrippedExternalVettingExternalVettingResponse)
            .isEqualTo(externalVettingExternalVettingResponse)
    }
}
