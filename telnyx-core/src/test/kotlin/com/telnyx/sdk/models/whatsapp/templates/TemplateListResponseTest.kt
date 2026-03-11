// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateListResponseTest {

    @Test
    fun create() {
        val templateListResponse =
            TemplateListResponse.builder()
                .id("id")
                .category(TemplateListResponse.Category.MARKETING)
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
                    TemplateListResponse.WhatsappBusinessAccount.builder().id("id").build()
                )
                .build()

        assertThat(templateListResponse.id()).contains("id")
        assertThat(templateListResponse.category())
            .contains(TemplateListResponse.Category.MARKETING)
        assertThat(templateListResponse.components().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(templateListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(templateListResponse.language()).contains("language")
        assertThat(templateListResponse.name()).contains("name")
        assertThat(templateListResponse.recordType()).contains("whatsapp_message_template")
        assertThat(templateListResponse.rejectionReason()).contains("rejection_reason")
        assertThat(templateListResponse.status()).contains("status")
        assertThat(templateListResponse.templateId()).contains("template_id")
        assertThat(templateListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(templateListResponse.whatsappBusinessAccount())
            .contains(TemplateListResponse.WhatsappBusinessAccount.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templateListResponse =
            TemplateListResponse.builder()
                .id("id")
                .category(TemplateListResponse.Category.MARKETING)
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
                    TemplateListResponse.WhatsappBusinessAccount.builder().id("id").build()
                )
                .build()

        val roundtrippedTemplateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateListResponse),
                jacksonTypeRef<TemplateListResponse>(),
            )

        assertThat(roundtrippedTemplateListResponse).isEqualTo(templateListResponse)
    }
}
