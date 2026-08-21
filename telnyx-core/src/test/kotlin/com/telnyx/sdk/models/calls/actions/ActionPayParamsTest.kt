// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionPayParamsTest {

    @Test
    fun create() {
        ActionPayParams.builder()
            .callControlId("call_control_id")
            .amount(10.5)
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .connectorName("Default")
            .currency(ActionPayParams.Currency.USD)
            .description("Order 12345")
            .interDigitTimeoutMillis(5000)
            .language("en-US")
            .maxAttempts(3)
            .metadata(
                ActionPayParams.Metadata.builder()
                    .putAdditionalProperty("order_id", JsonValue.from("bar"))
                    .build()
            )
            .parameters(
                ActionPayParams.Parameters.builder()
                    .putAdditionalProperty("customer_id", JsonValue.from("bar"))
                    .build()
            )
            .paymentMethod(ActionPayParams.PaymentMethod.CREDIT_CARD)
            .paymentToken("tok_abc123")
            .prompts(
                ActionPayParams.Prompts.builder()
                    .bankAccountNumber("x")
                    .bankRoutingNumber("x")
                    .expirationDate("x")
                    .paymentCardNumberOfList(
                        listOf(
                            PayPromptValue.PayPrompt.builder()
                                .text("Please enter your card number.")
                                .attempt("2 3")
                                .cardType(PayPromptValue.PayPrompt.CardType.AMEX)
                                .errorType(PayPromptValue.PayPrompt.ErrorType.INVALID_CARD_NUMBER)
                                .build(),
                            PayPromptValue.PayPrompt.builder()
                                .text("That card number was not accepted. Please try again.")
                                .attempt("2 3")
                                .cardType(PayPromptValue.PayPrompt.CardType.AMEX)
                                .errorType(PayPromptValue.PayPrompt.ErrorType.INVALID_CARD_NUMBER)
                                .build(),
                        )
                    )
                    .postalCode("x")
                    .securityCode("x")
                    .build()
            )
            .serviceLevel("service_level")
            .timeoutMillis(5000)
            .transactionType(ActionPayParams.TransactionType.CHARGE)
            .addValidCardType(ActionPayParams.ValidCardType.VISA)
            .addValidCardType(ActionPayParams.ValidCardType.MASTERCARD)
            .voice("female")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionPayParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionPayParams.builder()
                .callControlId("call_control_id")
                .amount(10.5)
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .connectorName("Default")
                .currency(ActionPayParams.Currency.USD)
                .description("Order 12345")
                .interDigitTimeoutMillis(5000)
                .language("en-US")
                .maxAttempts(3)
                .metadata(
                    ActionPayParams.Metadata.builder()
                        .putAdditionalProperty("order_id", JsonValue.from("bar"))
                        .build()
                )
                .parameters(
                    ActionPayParams.Parameters.builder()
                        .putAdditionalProperty("customer_id", JsonValue.from("bar"))
                        .build()
                )
                .paymentMethod(ActionPayParams.PaymentMethod.CREDIT_CARD)
                .paymentToken("tok_abc123")
                .prompts(
                    ActionPayParams.Prompts.builder()
                        .bankAccountNumber("x")
                        .bankRoutingNumber("x")
                        .expirationDate("x")
                        .paymentCardNumberOfList(
                            listOf(
                                PayPromptValue.PayPrompt.builder()
                                    .text("Please enter your card number.")
                                    .attempt("2 3")
                                    .cardType(PayPromptValue.PayPrompt.CardType.AMEX)
                                    .errorType(
                                        PayPromptValue.PayPrompt.ErrorType.INVALID_CARD_NUMBER
                                    )
                                    .build(),
                                PayPromptValue.PayPrompt.builder()
                                    .text("That card number was not accepted. Please try again.")
                                    .attempt("2 3")
                                    .cardType(PayPromptValue.PayPrompt.CardType.AMEX)
                                    .errorType(
                                        PayPromptValue.PayPrompt.ErrorType.INVALID_CARD_NUMBER
                                    )
                                    .build(),
                            )
                        )
                        .postalCode("x")
                        .securityCode("x")
                        .build()
                )
                .serviceLevel("service_level")
                .timeoutMillis(5000)
                .transactionType(ActionPayParams.TransactionType.CHARGE)
                .addValidCardType(ActionPayParams.ValidCardType.VISA)
                .addValidCardType(ActionPayParams.ValidCardType.MASTERCARD)
                .voice("female")
                .build()

        val body = params._body()

        assertThat(body.amount()).contains(10.5)
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.connectorName()).contains("Default")
        assertThat(body.currency()).contains(ActionPayParams.Currency.USD)
        assertThat(body.description()).contains("Order 12345")
        assertThat(body.interDigitTimeoutMillis()).contains(5000)
        assertThat(body.language()).contains("en-US")
        assertThat(body.maxAttempts()).contains(3)
        assertThat(body.metadata())
            .contains(
                ActionPayParams.Metadata.builder()
                    .putAdditionalProperty("order_id", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.parameters())
            .contains(
                ActionPayParams.Parameters.builder()
                    .putAdditionalProperty("customer_id", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.paymentMethod()).contains(ActionPayParams.PaymentMethod.CREDIT_CARD)
        assertThat(body.paymentToken()).contains("tok_abc123")
        assertThat(body.prompts())
            .contains(
                ActionPayParams.Prompts.builder()
                    .bankAccountNumber("x")
                    .bankRoutingNumber("x")
                    .expirationDate("x")
                    .paymentCardNumberOfList(
                        listOf(
                            PayPromptValue.PayPrompt.builder()
                                .text("Please enter your card number.")
                                .attempt("2 3")
                                .cardType(PayPromptValue.PayPrompt.CardType.AMEX)
                                .errorType(PayPromptValue.PayPrompt.ErrorType.INVALID_CARD_NUMBER)
                                .build(),
                            PayPromptValue.PayPrompt.builder()
                                .text("That card number was not accepted. Please try again.")
                                .attempt("2 3")
                                .cardType(PayPromptValue.PayPrompt.CardType.AMEX)
                                .errorType(PayPromptValue.PayPrompt.ErrorType.INVALID_CARD_NUMBER)
                                .build(),
                        )
                    )
                    .postalCode("x")
                    .securityCode("x")
                    .build()
            )
        assertThat(body.serviceLevel()).contains("service_level")
        assertThat(body.timeoutMillis()).contains(5000)
        assertThat(body.transactionType()).contains(ActionPayParams.TransactionType.CHARGE)
        assertThat(body.validCardTypes().getOrNull())
            .containsExactly(
                ActionPayParams.ValidCardType.VISA,
                ActionPayParams.ValidCardType.MASTERCARD,
            )
        assertThat(body.voice()).contains("female")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionPayParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
