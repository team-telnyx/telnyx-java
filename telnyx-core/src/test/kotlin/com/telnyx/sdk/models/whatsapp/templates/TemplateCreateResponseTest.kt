// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.WhatsappTemplateData
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateCreateResponseTest {

    @Test
    fun create() {
        val templateCreateResponse =
            TemplateCreateResponse.builder()
                .data(
                    WhatsappTemplateData.builder()
                        .id("id")
                        .category(WhatsappTemplateData.Category.MARKETING)
                        .addComponent(
                            WhatsappTemplateData.Component.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
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
                )
                .build()

        assertThat(templateCreateResponse.data())
            .contains(
                WhatsappTemplateData.builder()
                    .id("id")
                    .category(WhatsappTemplateData.Category.MARKETING)
                    .addComponent(
                        WhatsappTemplateData.Component.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templateCreateResponse =
            TemplateCreateResponse.builder()
                .data(
                    WhatsappTemplateData.builder()
                        .id("id")
                        .category(WhatsappTemplateData.Category.MARKETING)
                        .addComponent(
                            WhatsappTemplateData.Component.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
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
                )
                .build()

        val roundtrippedTemplateCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateCreateResponse),
                jacksonTypeRef<TemplateCreateResponse>(),
            )

        assertThat(roundtrippedTemplateCreateResponse).isEqualTo(templateCreateResponse)
    }
}
