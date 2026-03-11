// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.messagetemplates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageTemplateListResponseTest {

    @Test
    fun create() {
        val messageTemplateListResponse =
            MessageTemplateListResponse.builder()
                .id("id")
                .category(MessageTemplateListResponse.Category.MARKETING)
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
                    MessageTemplateListResponse.WhatsappBusinessAccount.builder().id("id").build()
                )
                .build()

        assertThat(messageTemplateListResponse.id()).contains("id")
        assertThat(messageTemplateListResponse.category())
            .contains(MessageTemplateListResponse.Category.MARKETING)
        assertThat(messageTemplateListResponse.components().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(messageTemplateListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(messageTemplateListResponse.language()).contains("language")
        assertThat(messageTemplateListResponse.name()).contains("name")
        assertThat(messageTemplateListResponse.recordType()).contains("whatsapp_message_template")
        assertThat(messageTemplateListResponse.rejectionReason()).contains("rejection_reason")
        assertThat(messageTemplateListResponse.status()).contains("status")
        assertThat(messageTemplateListResponse.templateId()).contains("template_id")
        assertThat(messageTemplateListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(messageTemplateListResponse.whatsappBusinessAccount())
            .contains(
                MessageTemplateListResponse.WhatsappBusinessAccount.builder().id("id").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageTemplateListResponse =
            MessageTemplateListResponse.builder()
                .id("id")
                .category(MessageTemplateListResponse.Category.MARKETING)
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
                    MessageTemplateListResponse.WhatsappBusinessAccount.builder().id("id").build()
                )
                .build()

        val roundtrippedMessageTemplateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageTemplateListResponse),
                jacksonTypeRef<MessageTemplateListResponse>(),
            )

        assertThat(roundtrippedMessageTemplateListResponse).isEqualTo(messageTemplateListResponse)
    }
}
