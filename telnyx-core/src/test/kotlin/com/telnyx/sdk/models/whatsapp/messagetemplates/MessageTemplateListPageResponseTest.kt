// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.messagetemplates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingPaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageTemplateListPageResponseTest {

    @Test
    fun create() {
        val messageTemplateListPageResponse =
            MessageTemplateListPageResponse.builder()
                .addData(
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
                            MessageTemplateListResponse.WhatsappBusinessAccount.builder()
                                .id("id")
                                .build()
                        )
                        .build()
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(messageTemplateListPageResponse.data().getOrNull())
            .containsExactly(
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
                        MessageTemplateListResponse.WhatsappBusinessAccount.builder()
                            .id("id")
                            .build()
                    )
                    .build()
            )
        assertThat(messageTemplateListPageResponse.meta())
            .contains(
                MessagingPaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageTemplateListPageResponse =
            MessageTemplateListPageResponse.builder()
                .addData(
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
                            MessageTemplateListResponse.WhatsappBusinessAccount.builder()
                                .id("id")
                                .build()
                        )
                        .build()
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedMessageTemplateListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageTemplateListPageResponse),
                jacksonTypeRef<MessageTemplateListPageResponse>(),
            )

        assertThat(roundtrippedMessageTemplateListPageResponse)
            .isEqualTo(messageTemplateListPageResponse)
    }
}
