// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsappmessagetemplates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappMessageTemplateRetrieveResponseTest {

    @Test
    fun create() {
        val whatsappMessageTemplateRetrieveResponse =
            WhatsappMessageTemplateRetrieveResponse.builder()
                .data(
                    WhatsappMessageTemplateRetrieveResponse.Data.builder()
                        .id("id")
                        .category(WhatsappMessageTemplateRetrieveResponse.Data.Category.MARKETING)
                        .addComponent(JsonValue.from(mapOf<String, Any>()))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .language("language")
                        .name("name")
                        .recordType("whatsapp_message_template")
                        .rejectionReason("rejection_reason")
                        .status("status")
                        .templateId("template_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .whatsappBusinessAccount(
                            WhatsappMessageTemplateRetrieveResponse.Data.WhatsappBusinessAccount
                                .builder()
                                .id("id")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(whatsappMessageTemplateRetrieveResponse.data())
            .contains(
                WhatsappMessageTemplateRetrieveResponse.Data.builder()
                    .id("id")
                    .category(WhatsappMessageTemplateRetrieveResponse.Data.Category.MARKETING)
                    .addComponent(JsonValue.from(mapOf<String, Any>()))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .language("language")
                    .name("name")
                    .recordType("whatsapp_message_template")
                    .rejectionReason("rejection_reason")
                    .status("status")
                    .templateId("template_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .whatsappBusinessAccount(
                        WhatsappMessageTemplateRetrieveResponse.Data.WhatsappBusinessAccount
                            .builder()
                            .id("id")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappMessageTemplateRetrieveResponse =
            WhatsappMessageTemplateRetrieveResponse.builder()
                .data(
                    WhatsappMessageTemplateRetrieveResponse.Data.builder()
                        .id("id")
                        .category(WhatsappMessageTemplateRetrieveResponse.Data.Category.MARKETING)
                        .addComponent(JsonValue.from(mapOf<String, Any>()))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .language("language")
                        .name("name")
                        .recordType("whatsapp_message_template")
                        .rejectionReason("rejection_reason")
                        .status("status")
                        .templateId("template_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .whatsappBusinessAccount(
                            WhatsappMessageTemplateRetrieveResponse.Data.WhatsappBusinessAccount
                                .builder()
                                .id("id")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedWhatsappMessageTemplateRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappMessageTemplateRetrieveResponse),
                jacksonTypeRef<WhatsappMessageTemplateRetrieveResponse>(),
            )

        assertThat(roundtrippedWhatsappMessageTemplateRetrieveResponse)
            .isEqualTo(whatsappMessageTemplateRetrieveResponse)
    }
}
