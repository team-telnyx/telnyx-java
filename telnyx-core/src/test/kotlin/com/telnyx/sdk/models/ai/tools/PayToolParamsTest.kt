// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayToolParamsTest {

    @Test
    fun create() {
        val payToolParams =
            PayToolParams.builder()
                .connectorName("connector_name")
                .connectorParameters(
                    PayToolParams.ConnectorParameters.builder()
                        .putAdditionalProperty("campaignid", JsonValue.from("bar"))
                        .putAdditionalProperty("customer_ref", JsonValue.from("bar"))
                        .build()
                )
                .currency("currency")
                .description("description")
                .paymentMethod("payment_method")
                .addValidCardType(PayToolParams.ValidCardType.VISA)
                .addValidCardType(PayToolParams.ValidCardType.MASTERCARD)
                .build()

        assertThat(payToolParams.connectorName()).isEqualTo("connector_name")
        assertThat(payToolParams.connectorParameters())
            .contains(
                PayToolParams.ConnectorParameters.builder()
                    .putAdditionalProperty("campaignid", JsonValue.from("bar"))
                    .putAdditionalProperty("customer_ref", JsonValue.from("bar"))
                    .build()
            )
        assertThat(payToolParams.currency()).contains("currency")
        assertThat(payToolParams.description()).contains("description")
        assertThat(payToolParams.paymentMethod()).contains("payment_method")
        assertThat(payToolParams.validCardTypes().getOrNull())
            .containsExactly(
                PayToolParams.ValidCardType.VISA,
                PayToolParams.ValidCardType.MASTERCARD,
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payToolParams =
            PayToolParams.builder()
                .connectorName("connector_name")
                .connectorParameters(
                    PayToolParams.ConnectorParameters.builder()
                        .putAdditionalProperty("campaignid", JsonValue.from("bar"))
                        .putAdditionalProperty("customer_ref", JsonValue.from("bar"))
                        .build()
                )
                .currency("currency")
                .description("description")
                .paymentMethod("payment_method")
                .addValidCardType(PayToolParams.ValidCardType.VISA)
                .addValidCardType(PayToolParams.ValidCardType.MASTERCARD)
                .build()

        val roundtrippedPayToolParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payToolParams),
                jacksonTypeRef<PayToolParams>(),
            )

        assertThat(roundtrippedPayToolParams).isEqualTo(payToolParams)
    }
}
