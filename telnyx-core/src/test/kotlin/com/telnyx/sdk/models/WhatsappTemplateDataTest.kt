// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappTemplateDataTest {

    @Test
    fun create() {
        val whatsappTemplateData =
            WhatsappTemplateData.builder()
                .id("id")
                .category(WhatsappTemplateData.Category.MARKETING)
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
                    WhatsappTemplateData.WhatsappBusinessAccount.builder().id("id").build()
                )
                .build()

        assertThat(whatsappTemplateData.id()).contains("id")
        assertThat(whatsappTemplateData.category())
            .contains(WhatsappTemplateData.Category.MARKETING)
        assertThat(whatsappTemplateData.components().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(whatsappTemplateData.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(whatsappTemplateData.language()).contains("language")
        assertThat(whatsappTemplateData.name()).contains("name")
        assertThat(whatsappTemplateData.recordType()).contains("whatsapp_message_template")
        assertThat(whatsappTemplateData.rejectionReason()).contains("rejection_reason")
        assertThat(whatsappTemplateData.status()).contains("status")
        assertThat(whatsappTemplateData.templateId()).contains("template_id")
        assertThat(whatsappTemplateData.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(whatsappTemplateData.whatsappBusinessAccount())
            .contains(WhatsappTemplateData.WhatsappBusinessAccount.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappTemplateData =
            WhatsappTemplateData.builder()
                .id("id")
                .category(WhatsappTemplateData.Category.MARKETING)
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
                    WhatsappTemplateData.WhatsappBusinessAccount.builder().id("id").build()
                )
                .build()

        val roundtrippedWhatsappTemplateData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappTemplateData),
                jacksonTypeRef<WhatsappTemplateData>(),
            )

        assertThat(roundtrippedWhatsappTemplateData).isEqualTo(whatsappTemplateData)
    }
}
