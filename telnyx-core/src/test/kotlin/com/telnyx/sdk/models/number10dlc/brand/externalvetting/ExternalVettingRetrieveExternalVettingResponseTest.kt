// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand.externalvetting

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVettingRetrieveExternalVettingResponseTest {

    @Test
    fun create() {
        val externalVettingRetrieveExternalVettingResponse =
            ExternalVettingRetrieveExternalVettingResponse.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        assertThat(externalVettingRetrieveExternalVettingResponse.createDate())
            .contains("createDate")
        assertThat(externalVettingRetrieveExternalVettingResponse.evpId()).contains("evpId")
        assertThat(externalVettingRetrieveExternalVettingResponse.vettedDate())
            .contains("vettedDate")
        assertThat(externalVettingRetrieveExternalVettingResponse.vettingClass())
            .contains("vettingClass")
        assertThat(externalVettingRetrieveExternalVettingResponse.vettingId()).contains("vettingId")
        assertThat(externalVettingRetrieveExternalVettingResponse.vettingScore()).contains(0L)
        assertThat(externalVettingRetrieveExternalVettingResponse.vettingToken())
            .contains("vettingToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalVettingRetrieveExternalVettingResponse =
            ExternalVettingRetrieveExternalVettingResponse.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        val roundtrippedExternalVettingRetrieveExternalVettingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalVettingRetrieveExternalVettingResponse),
                jacksonTypeRef<ExternalVettingRetrieveExternalVettingResponse>(),
            )

        assertThat(roundtrippedExternalVettingRetrieveExternalVettingResponse)
            .isEqualTo(externalVettingRetrieveExternalVettingResponse)
    }
}
