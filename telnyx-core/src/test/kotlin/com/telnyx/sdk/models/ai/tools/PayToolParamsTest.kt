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
                .interDigitTimeoutMillis(1L)
                .maxAttempts(1L)
                .minPostalCodeLength(5L)
                .paymentMethod("payment_method")
                .postalCode(false)
                .prompts(
                    PayToolParams.Prompts.builder()
                        .bankAccountNumber("x")
                        .bankRoutingNumber("x")
                        .expirationDate("x")
                        .paymentCardNumber("x")
                        .postalCode("x")
                        .securityCode("x")
                        .build()
                )
                .timeoutMillis(12000L)
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
        assertThat(payToolParams.interDigitTimeoutMillis()).contains(1L)
        assertThat(payToolParams.maxAttempts()).contains(1L)
        assertThat(payToolParams.minPostalCodeLength()).contains(5L)
        assertThat(payToolParams.paymentMethod()).contains("payment_method")
        assertThat(payToolParams.postalCode()).contains(PayToolParams.PostalCode.ofBool(false))
        assertThat(payToolParams.prompts())
            .contains(
                PayToolParams.Prompts.builder()
                    .bankAccountNumber("x")
                    .bankRoutingNumber("x")
                    .expirationDate("x")
                    .paymentCardNumber("x")
                    .postalCode("x")
                    .securityCode("x")
                    .build()
            )
        assertThat(payToolParams.timeoutMillis()).contains(12000L)
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
                .interDigitTimeoutMillis(1L)
                .maxAttempts(1L)
                .minPostalCodeLength(5L)
                .paymentMethod("payment_method")
                .postalCode(false)
                .prompts(
                    PayToolParams.Prompts.builder()
                        .bankAccountNumber("x")
                        .bankRoutingNumber("x")
                        .expirationDate("x")
                        .paymentCardNumber("x")
                        .postalCode("x")
                        .securityCode("x")
                        .build()
                )
                .timeoutMillis(12000L)
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
