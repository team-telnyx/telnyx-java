// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappCallingRoutingDataTest {

    @Test
    fun create() {
        val whatsappCallingRoutingData =
            WhatsappCallingRoutingData.builder()
                .connectionId("1234567890")
                .phoneNumber("+13125550100")
                .recordType(WhatsappCallingRoutingData.RecordType.WHATSAPP_CALLING_ROUTING)
                .build()

        assertThat(whatsappCallingRoutingData.connectionId()).contains("1234567890")
        assertThat(whatsappCallingRoutingData.phoneNumber()).isEqualTo("+13125550100")
        assertThat(whatsappCallingRoutingData.recordType())
            .isEqualTo(WhatsappCallingRoutingData.RecordType.WHATSAPP_CALLING_ROUTING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappCallingRoutingData =
            WhatsappCallingRoutingData.builder()
                .connectionId("1234567890")
                .phoneNumber("+13125550100")
                .recordType(WhatsappCallingRoutingData.RecordType.WHATSAPP_CALLING_ROUTING)
                .build()

        val roundtrippedWhatsappCallingRoutingData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappCallingRoutingData),
                jacksonTypeRef<WhatsappCallingRoutingData>(),
            )

        assertThat(roundtrippedWhatsappCallingRoutingData).isEqualTo(whatsappCallingRoutingData)
    }
}
