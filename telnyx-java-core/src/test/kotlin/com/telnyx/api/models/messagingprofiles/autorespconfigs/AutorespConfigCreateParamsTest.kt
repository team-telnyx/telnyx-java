// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingprofiles.autorespconfigs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutorespConfigCreateParamsTest {

    @Test
    fun create() {
        AutorespConfigCreateParams.builder()
            .profileId("profile_id")
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
            AutorespConfigCreateParams.builder()
                .profileId("profile_id")
                .autoRespConfigCreate(
                    AutoRespConfigCreate.builder()
                        .countryCode("US")
                        .addKeyword("keyword1")
                        .addKeyword("keyword2")
                        .op(AutoRespConfigCreate.Op.START)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("profile_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AutorespConfigCreateParams.builder()
                .profileId("profile_id")
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
            AutorespConfigCreateParams.builder()
                .profileId("profile_id")
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
