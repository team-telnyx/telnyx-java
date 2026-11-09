// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolUpdateParamsTest {

    @Test
    fun create() {
        ToolUpdateParams.builder()
            .toolId("tool_id")
            .clientSideTool(
                ToolUpdateParams.ClientSideTool.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .displayName("display_name")
            .function(
                ToolUpdateParams.Function.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .handoff(
                ToolUpdateParams.Handoff.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .invite(
                ToolUpdateParams.Invite.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .pay(
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
            )
            .retrieval(
                ToolUpdateParams.Retrieval.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .timeoutMs(0L)
            .type("type")
            .updateDynamicVariables(
                UpdateDynamicVariablesToolParams.builder()
                    .description("Collect caller details into conversation variables.")
                    .name("collect_details")
                    .addUpdatableVariable(
                        UpdateDynamicVariablesToolParams.UpdatableVariable.builder()
                            .name("customer_name")
                            .description("The caller's full name.")
                            .type("string")
                            .build()
                    )
                    .build()
            )
            .vision(VisionToolParams.builder().maxFrameAgeSecs(1L).build())
            .webhook(
                ToolUpdateParams.Webhook.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ToolUpdateParams.builder().toolId("tool_id").build()

        assertThat(params._pathParam(0)).isEqualTo("tool_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ToolUpdateParams.builder()
                .toolId("tool_id")
                .clientSideTool(
                    ToolUpdateParams.ClientSideTool.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .displayName("display_name")
                .function(
                    ToolUpdateParams.Function.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .handoff(
                    ToolUpdateParams.Handoff.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .invite(
                    ToolUpdateParams.Invite.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .pay(
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
                )
                .retrieval(
                    ToolUpdateParams.Retrieval.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .timeoutMs(0L)
                .type("type")
                .updateDynamicVariables(
                    UpdateDynamicVariablesToolParams.builder()
                        .description("Collect caller details into conversation variables.")
                        .name("collect_details")
                        .addUpdatableVariable(
                            UpdateDynamicVariablesToolParams.UpdatableVariable.builder()
                                .name("customer_name")
                                .description("The caller's full name.")
                                .type("string")
                                .build()
                        )
                        .build()
                )
                .vision(VisionToolParams.builder().maxFrameAgeSecs(1L).build())
                .webhook(
                    ToolUpdateParams.Webhook.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.clientSideTool())
            .contains(
                ToolUpdateParams.ClientSideTool.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.displayName()).contains("display_name")
        assertThat(body.function())
            .contains(
                ToolUpdateParams.Function.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.handoff())
            .contains(
                ToolUpdateParams.Handoff.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.invite())
            .contains(
                ToolUpdateParams.Invite.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.pay())
            .contains(
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
            )
        assertThat(body.retrieval())
            .contains(
                ToolUpdateParams.Retrieval.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.timeoutMs()).contains(0L)
        assertThat(body.type()).contains("type")
        assertThat(body.updateDynamicVariables())
            .contains(
                UpdateDynamicVariablesToolParams.builder()
                    .description("Collect caller details into conversation variables.")
                    .name("collect_details")
                    .addUpdatableVariable(
                        UpdateDynamicVariablesToolParams.UpdatableVariable.builder()
                            .name("customer_name")
                            .description("The caller's full name.")
                            .type("string")
                            .build()
                    )
                    .build()
            )
        assertThat(body.vision()).contains(VisionToolParams.builder().maxFrameAgeSecs(1L).build())
        assertThat(body.webhook())
            .contains(
                ToolUpdateParams.Webhook.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ToolUpdateParams.builder().toolId("tool_id").build()

        val body = params._body()
    }
}
