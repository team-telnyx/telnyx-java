// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign.osr

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OsrGetAttributesResponseTest {

    @Test
    fun create() {
        val osrGetAttributesResponse =
            OsrGetAttributesResponse.builder()
                .putAdditionalProperty("msg_class", JsonValue.from("bar"))
                .putAdditionalProperty("status", JsonValue.from("bar"))
                .putAdditionalProperty("brandId", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val osrGetAttributesResponse =
            OsrGetAttributesResponse.builder()
                .putAdditionalProperty("msg_class", JsonValue.from("bar"))
                .putAdditionalProperty("status", JsonValue.from("bar"))
                .putAdditionalProperty("brandId", JsonValue.from("bar"))
                .build()

        val roundtrippedOsrGetAttributesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(osrGetAttributesResponse),
                jacksonTypeRef<OsrGetAttributesResponse>(),
            )

        assertThat(roundtrippedOsrGetAttributesResponse).isEqualTo(osrGetAttributesResponse)
    }
}
