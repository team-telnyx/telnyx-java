// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailTemplateRenderParamsTest {

    @Test
    fun create() {
        EmailTemplateRenderParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .templateVariables(
                EmailTemplateRenderParams.TemplateVariables.builder()
                    .putAdditionalProperty("first_name", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EmailTemplateRenderParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EmailTemplateRenderParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .templateVariables(
                    EmailTemplateRenderParams.TemplateVariables.builder()
                        .putAdditionalProperty("first_name", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.templateVariables())
            .contains(
                EmailTemplateRenderParams.TemplateVariables.builder()
                    .putAdditionalProperty("first_name", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmailTemplateRenderParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
