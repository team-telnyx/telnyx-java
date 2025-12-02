// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.brand.externalvetting

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVettingListResponseTest {

    @Test
    fun create() {
        val externalVettingListResponse =
            ExternalVettingListResponse.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        assertThat(externalVettingListResponse.createDate()).contains("createDate")
        assertThat(externalVettingListResponse.evpId()).contains("evpId")
        assertThat(externalVettingListResponse.vettedDate()).contains("vettedDate")
        assertThat(externalVettingListResponse.vettingClass()).contains("vettingClass")
        assertThat(externalVettingListResponse.vettingId()).contains("vettingId")
        assertThat(externalVettingListResponse.vettingScore()).contains(0L)
        assertThat(externalVettingListResponse.vettingToken()).contains("vettingToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalVettingListResponse =
            ExternalVettingListResponse.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        val roundtrippedExternalVettingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalVettingListResponse),
                jacksonTypeRef<ExternalVettingListResponse>(),
            )

        assertThat(roundtrippedExternalVettingListResponse).isEqualTo(externalVettingListResponse)
    }
}
