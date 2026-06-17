// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.brand.externalvetting

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVettingTest {

    @Test
    fun create() {
        val externalVetting =
            ExternalVetting.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        assertThat(externalVetting.createDate()).contains("createDate")
        assertThat(externalVetting.evpId()).contains("evpId")
        assertThat(externalVetting.vettedDate()).contains("vettedDate")
        assertThat(externalVetting.vettingClass()).contains("vettingClass")
        assertThat(externalVetting.vettingId()).contains("vettingId")
        assertThat(externalVetting.vettingScore()).contains(0L)
        assertThat(externalVetting.vettingToken()).contains("vettingToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalVetting =
            ExternalVetting.builder()
                .createDate("createDate")
                .evpId("evpId")
                .vettedDate("vettedDate")
                .vettingClass("vettingClass")
                .vettingId("vettingId")
                .vettingScore(0L)
                .vettingToken("vettingToken")
                .build()

        val roundtrippedExternalVetting =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalVetting),
                jacksonTypeRef<ExternalVetting>(),
            )

        assertThat(roundtrippedExternalVetting).isEqualTo(externalVetting)
    }
}
