// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationalComponentPatchAllParamsTest {

    @Test
    fun create() {
        ConversationalComponentPatchAllParams.builder()
            .phoneNumber("phone_number")
            .addCommand(
                ConversationalComponentPatchAllParams.Command.builder()
                    .command("command")
                    .description("description")
                    .build()
            )
            .addIceBreaker("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConversationalComponentPatchAllParams.builder().phoneNumber("phone_number").build()

        assertThat(params._pathParam(0)).isEqualTo("phone_number")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ConversationalComponentPatchAllParams.builder()
                .phoneNumber("phone_number")
                .addCommand(
                    ConversationalComponentPatchAllParams.Command.builder()
                        .command("command")
                        .description("description")
                        .build()
                )
                .addIceBreaker("string")
                .build()

        val body = params._body()

        assertThat(body.commands().getOrNull())
            .containsExactly(
                ConversationalComponentPatchAllParams.Command.builder()
                    .command("command")
                    .description("description")
                    .build()
            )
        assertThat(body.iceBreakers().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConversationalComponentPatchAllParams.builder().phoneNumber("phone_number").build()

        val body = params._body()
    }
}
