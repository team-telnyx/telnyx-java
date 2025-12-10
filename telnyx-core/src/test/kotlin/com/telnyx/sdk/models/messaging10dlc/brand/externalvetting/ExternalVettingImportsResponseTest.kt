// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.brand.externalvetting

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVettingImportsResponseTest {

    @Test
    fun create() {
        val externalVettingImportsResponse =
            ExternalVettingImportsResponse.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        assertThat(externalVettingImportsResponse.createDate()).contains("createDate")
        assertThat(externalVettingImportsResponse.evpId()).contains("evpId")
        assertThat(externalVettingImportsResponse.vettedDate()).contains("vettedDate")
        assertThat(externalVettingImportsResponse.vettingClass()).contains("vettingClass")
        assertThat(externalVettingImportsResponse.vettingId()).contains("vettingId")
        assertThat(externalVettingImportsResponse.vettingScore()).contains(0L)
        assertThat(externalVettingImportsResponse.vettingToken()).contains("vettingToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalVettingImportsResponse =
            ExternalVettingImportsResponse.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        val roundtrippedExternalVettingImportsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalVettingImportsResponse),
                jacksonTypeRef<ExternalVettingImportsResponse>(),
            )

        assertThat(roundtrippedExternalVettingImportsResponse)
            .isEqualTo(externalVettingImportsResponse)
    }
}
