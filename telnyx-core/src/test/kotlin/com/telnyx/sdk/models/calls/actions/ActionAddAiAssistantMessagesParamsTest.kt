// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionAddAiAssistantMessagesParamsTest {

    @Test
    fun create() {
        ActionAddAiAssistantMessagesParams.builder()
            .callControlId("call_control_id")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .addMessage(
                ActionAddAiAssistantMessagesParams.Message.System.builder()
                    .content("Get the user's favorite color")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionAddAiAssistantMessagesParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionAddAiAssistantMessagesParams.builder()
                .callControlId("call_control_id")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .addMessage(
                    ActionAddAiAssistantMessagesParams.Message.System.builder()
                        .content("Get the user's favorite color")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.messages().getOrNull())
            .containsExactly(
                ActionAddAiAssistantMessagesParams.Message.ofSystem(
                    ActionAddAiAssistantMessagesParams.Message.System.builder()
                        .content("Get the user's favorite color")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionAddAiAssistantMessagesParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
