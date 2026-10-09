// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingRoutingListResponseTest {

    @Test
    fun create() {
        val callingRoutingListResponse =
            CallingRoutingListResponse.builder()
                .data(
                    WhatsappCallingRoutingData.builder()
                        .connectionId("1234567890")
                        .phoneNumber("+13125550100")
                        .recordType(WhatsappCallingRoutingData.RecordType.WHATSAPP_CALLING_ROUTING)
                        .build()
                )
                .build()

        assertThat(callingRoutingListResponse.data())
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
        val callingRoutingListResponse =
            CallingRoutingListResponse.builder()
                .data(
                    WhatsappCallingRoutingData.builder()
                        .connectionId("1234567890")
                        .phoneNumber("+13125550100")
                        .recordType(WhatsappCallingRoutingData.RecordType.WHATSAPP_CALLING_ROUTING)
                        .build()
                )
                .build()

        val roundtrippedCallingRoutingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callingRoutingListResponse),
                jacksonTypeRef<CallingRoutingListResponse>(),
            )

        assertThat(roundtrippedCallingRoutingListResponse).isEqualTo(callingRoutingListResponse)
    }
}
