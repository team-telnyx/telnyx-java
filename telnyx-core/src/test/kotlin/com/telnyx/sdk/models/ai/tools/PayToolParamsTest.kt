// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayToolParamsTest {

    @Test
    fun create() {
        val payToolParams =
            PayToolParams.builder()
                .connectorName("connector_name")
                .currency("currency")
                .description("description")
                .paymentMethod("payment_method")
                .build()

        assertThat(payToolParams.connectorName()).isEqualTo("connector_name")
        assertThat(payToolParams.currency()).contains("currency")
        assertThat(payToolParams.description()).contains("description")
        assertThat(payToolParams.paymentMethod()).contains("payment_method")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payToolParams =
            PayToolParams.builder()
                .connectorName("connector_name")
                .currency("currency")
                .description("description")
                .paymentMethod("payment_method")
                .build()

        val roundtrippedPayToolParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payToolParams),
                jacksonTypeRef<PayToolParams>(),
            )

        assertThat(roundtrippedPayToolParams).isEqualTo(payToolParams)
    }
}
