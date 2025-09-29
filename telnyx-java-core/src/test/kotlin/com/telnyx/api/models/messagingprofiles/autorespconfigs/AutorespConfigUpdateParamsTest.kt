// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingprofiles.autorespconfigs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutorespConfigUpdateParamsTest {

    @Test
    fun create() {
        AutorespConfigUpdateParams.builder()
            .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .autorespCfgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .autoRespConfigCreate(
                AutoRespConfigCreate.builder()
                    .countryCode("US")
                    .addKeyword("keyword1")
                    .addKeyword("keyword2")
                    .op(AutoRespConfigCreate.Op.START)
                    .respText("Thank you for your message")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AutorespConfigUpdateParams.builder()
                .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .autorespCfgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .autoRespConfigCreate(
                    AutoRespConfigCreate.builder()
                        .countryCode("US")
                        .addKeyword("keyword1")
                        .addKeyword("keyword2")
                        .op(AutoRespConfigCreate.Op.START)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AutorespConfigUpdateParams.builder()
                .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .autorespCfgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .autoRespConfigCreate(
                    AutoRespConfigCreate.builder()
                        .countryCode("US")
                        .addKeyword("keyword1")
                        .addKeyword("keyword2")
                        .op(AutoRespConfigCreate.Op.START)
                        .respText("Thank you for your message")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AutoRespConfigCreate.builder()
                    .countryCode("US")
                    .addKeyword("keyword1")
                    .addKeyword("keyword2")
                    .op(AutoRespConfigCreate.Op.START)
                    .respText("Thank you for your message")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AutorespConfigUpdateParams.builder()
                .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .autorespCfgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .autoRespConfigCreate(
                    AutoRespConfigCreate.builder()
                        .countryCode("US")
                        .addKeyword("keyword1")
                        .addKeyword("keyword2")
                        .op(AutoRespConfigCreate.Op.START)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AutoRespConfigCreate.builder()
                    .countryCode("US")
                    .addKeyword("keyword1")
                    .addKeyword("keyword2")
                    .op(AutoRespConfigCreate.Op.START)
                    .build()
            )
    }
}
