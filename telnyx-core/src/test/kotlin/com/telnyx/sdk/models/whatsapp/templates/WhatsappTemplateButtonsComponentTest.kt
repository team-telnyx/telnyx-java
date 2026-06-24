// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappTemplateButtonsComponentTest {

    @Test
    fun create() {
        val whatsappTemplateButtonsComponent =
            WhatsappTemplateButtonsComponent.builder()
                .addButton(
                    WhatsappTemplateButtonsComponent.Button.builder()
                        .type(WhatsappTemplateButtonsComponent.Button.Type.URL)
                        .autofillText("autofill_text")
                        .addExample("string")
                        .flowAction(WhatsappTemplateButtonsComponent.Button.FlowAction.NAVIGATE)
                        .flowId("flow_id")
                        .navigateScreen("navigate_screen")
                        .otpType(WhatsappTemplateButtonsComponent.Button.OtpType.COPY_CODE)
                        .packageName("package_name")
                        .phoneNumber("phone_number")
                        .signatureHash("signature_hash")
                        .text("text")
                        .url("url")
                        .zeroTapTermsAccepted(true)
                        .build()
                )
                .type(WhatsappTemplateButtonsComponent.Type.BUTTONS)
                .build()

        assertThat(whatsappTemplateButtonsComponent.buttons())
            .containsExactly(
                WhatsappTemplateButtonsComponent.Button.builder()
                    .type(WhatsappTemplateButtonsComponent.Button.Type.URL)
                    .autofillText("autofill_text")
                    .addExample("string")
                    .flowAction(WhatsappTemplateButtonsComponent.Button.FlowAction.NAVIGATE)
                    .flowId("flow_id")
                    .navigateScreen("navigate_screen")
                    .otpType(WhatsappTemplateButtonsComponent.Button.OtpType.COPY_CODE)
                    .packageName("package_name")
                    .phoneNumber("phone_number")
                    .signatureHash("signature_hash")
                    .text("text")
                    .url("url")
                    .zeroTapTermsAccepted(true)
                    .build()
            )
        assertThat(whatsappTemplateButtonsComponent.type())
            .isEqualTo(WhatsappTemplateButtonsComponent.Type.BUTTONS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappTemplateButtonsComponent =
            WhatsappTemplateButtonsComponent.builder()
                .addButton(
                    WhatsappTemplateButtonsComponent.Button.builder()
                        .type(WhatsappTemplateButtonsComponent.Button.Type.URL)
                        .autofillText("autofill_text")
                        .addExample("string")
                        .flowAction(WhatsappTemplateButtonsComponent.Button.FlowAction.NAVIGATE)
                        .flowId("flow_id")
                        .navigateScreen("navigate_screen")
                        .otpType(WhatsappTemplateButtonsComponent.Button.OtpType.COPY_CODE)
                        .packageName("package_name")
                        .phoneNumber("phone_number")
                        .signatureHash("signature_hash")
                        .text("text")
                        .url("url")
                        .zeroTapTermsAccepted(true)
                        .build()
                )
                .type(WhatsappTemplateButtonsComponent.Type.BUTTONS)
                .build()

        val roundtrippedWhatsappTemplateButtonsComponent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappTemplateButtonsComponent),
                jacksonTypeRef<WhatsappTemplateButtonsComponent>(),
            )

        assertThat(roundtrippedWhatsappTemplateButtonsComponent)
            .isEqualTo(whatsappTemplateButtonsComponent)
    }
}
