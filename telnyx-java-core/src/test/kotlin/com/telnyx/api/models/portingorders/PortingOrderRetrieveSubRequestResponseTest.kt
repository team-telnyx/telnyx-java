// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderRetrieveSubRequestResponseTest {

    @Test
    fun create() {
        val portingOrderRetrieveSubRequestResponse =
            PortingOrderRetrieveSubRequestResponse.builder()
                .data(
                    PortingOrderRetrieveSubRequestResponse.Data.builder()
                        .portRequestId("59b0762a-b274-4f76-ac32-4d5cf0272e66")
                        .subRequestId("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                        .build()
                )
                .build()

        assertThat(portingOrderRetrieveSubRequestResponse.data())
            .contains(
                PortingOrderRetrieveSubRequestResponse.Data.builder()
                    .portRequestId("59b0762a-b274-4f76-ac32-4d5cf0272e66")
                    .subRequestId("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderRetrieveSubRequestResponse =
            PortingOrderRetrieveSubRequestResponse.builder()
                .data(
                    PortingOrderRetrieveSubRequestResponse.Data.builder()
                        .portRequestId("59b0762a-b274-4f76-ac32-4d5cf0272e66")
                        .subRequestId("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                        .build()
                )
                .build()

        val roundtrippedPortingOrderRetrieveSubRequestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderRetrieveSubRequestResponse),
                jacksonTypeRef<PortingOrderRetrieveSubRequestResponse>(),
            )

        assertThat(roundtrippedPortingOrderRetrieveSubRequestResponse)
            .isEqualTo(portingOrderRetrieveSubRequestResponse)
    }
}
