// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingRoutingPatchAllResponseTest {

    @Test
    fun create() {
        val callingRoutingPatchAllResponse =
            CallingRoutingPatchAllResponse.builder()
                .data(
                    WhatsappCallingRoutingData.builder()
                        .connectionId("1234567890")
                        .phoneNumber("+13125550100")
                        .recordType(WhatsappCallingRoutingData.RecordType.WHATSAPP_CALLING_ROUTING)
                        .build()
                )
                .build()

        assertThat(callingRoutingPatchAllResponse.data())
            .isEqualTo(
                WhatsappCallingRoutingData.builder()
                    .connectionId("1234567890")
                    .phoneNumber("+13125550100")
                    .recordType(WhatsappCallingRoutingData.RecordType.WHATSAPP_CALLING_ROUTING)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callingRoutingPatchAllResponse =
            CallingRoutingPatchAllResponse.builder()
                .data(
                    WhatsappCallingRoutingData.builder()
                        .connectionId("1234567890")
                        .phoneNumber("+13125550100")
                        .recordType(WhatsappCallingRoutingData.RecordType.WHATSAPP_CALLING_ROUTING)
                        .build()
                )
                .build()

        val roundtrippedCallingRoutingPatchAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callingRoutingPatchAllResponse),
                jacksonTypeRef<CallingRoutingPatchAllResponse>(),
            )

        assertThat(roundtrippedCallingRoutingPatchAllResponse)
            .isEqualTo(callingRoutingPatchAllResponse)
    }
}
