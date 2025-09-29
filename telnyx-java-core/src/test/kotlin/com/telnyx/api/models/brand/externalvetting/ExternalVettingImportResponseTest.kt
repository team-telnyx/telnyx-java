// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.brand.externalvetting

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVettingImportResponseTest {

    @Test
    fun create() {
        val externalVettingImportResponse =
            ExternalVettingImportResponse.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        assertThat(externalVettingImportResponse.createDate()).contains("createDate")
        assertThat(externalVettingImportResponse.evpId()).contains("evpId")
        assertThat(externalVettingImportResponse.vettedDate()).contains("vettedDate")
        assertThat(externalVettingImportResponse.vettingClass()).contains("vettingClass")
        assertThat(externalVettingImportResponse.vettingId()).contains("vettingId")
        assertThat(externalVettingImportResponse.vettingScore()).contains(0L)
        assertThat(externalVettingImportResponse.vettingToken()).contains("vettingToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalVettingImportResponse =
            ExternalVettingImportResponse.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        val roundtrippedExternalVettingImportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalVettingImportResponse),
                jacksonTypeRef<ExternalVettingImportResponse>(),
            )

        assertThat(roundtrippedExternalVettingImportResponse)
            .isEqualTo(externalVettingImportResponse)
    }
}
