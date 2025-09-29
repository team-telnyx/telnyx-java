// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messages.rcs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RcGenerateDeeplinkResponseTest {

    @Test
    fun create() {
        val rcGenerateDeeplinkResponse =
            RcGenerateDeeplinkResponse.builder()
                .data(
                    RcGenerateDeeplinkResponse.Data.builder()
                        .url(
                            "sms:+18445550001?service_id=my_agent_id%40rbm.goog&body=hello%20world"
                        )
                        .build()
                )
                .build()

        assertThat(rcGenerateDeeplinkResponse.data())
            .isEqualTo(
                RcGenerateDeeplinkResponse.Data.builder()
                    .url("sms:+18445550001?service_id=my_agent_id%40rbm.goog&body=hello%20world")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rcGenerateDeeplinkResponse =
            RcGenerateDeeplinkResponse.builder()
                .data(
                    RcGenerateDeeplinkResponse.Data.builder()
                        .url(
                            "sms:+18445550001?service_id=my_agent_id%40rbm.goog&body=hello%20world"
                        )
                        .build()
                )
                .build()

        val roundtrippedRcGenerateDeeplinkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rcGenerateDeeplinkResponse),
                jacksonTypeRef<RcGenerateDeeplinkResponse>(),
            )

        assertThat(roundtrippedRcGenerateDeeplinkResponse).isEqualTo(rcGenerateDeeplinkResponse)
    }
}
