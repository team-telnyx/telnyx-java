// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingPaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateListPageResponseTest {

    @Test
    fun create() {
        val templateListPageResponse =
            TemplateListPageResponse.builder()
                .addData(
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

        assertThat(templateListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(templateListPageResponse.meta())
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
        val templateListPageResponse =
            TemplateListPageResponse.builder()
                .addData(
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

        val roundtrippedTemplateListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateListPageResponse),
                jacksonTypeRef<TemplateListPageResponse>(),
            )

        assertThat(roundtrippedTemplateListPageResponse).isEqualTo(templateListPageResponse)
    }
}
