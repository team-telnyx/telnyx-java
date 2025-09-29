// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.calls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallUpdateParamsTest {

    @Test
    fun create() {
        CallUpdateParams.builder()
            .accountSid("account_sid")
            .callSid("call_sid")
            .updateCall(
                UpdateCall.builder()
                    .fallbackMethod(UpdateCall.FallbackMethod.GET)
                    .fallbackUrl("https://www.example.com/intruction-c.xml")
                    .method(UpdateCall.Method.GET)
                    .status("completed")
                    .statusCallback("https://www.example.com/callback")
                    .statusCallbackMethod(UpdateCall.StatusCallbackMethod.GET)
                    .texml(
                        "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Say>Hello</Say></Response>"
                    )
                    .url("https://www.example.com/intruction-b.xml")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CallUpdateParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .updateCall(UpdateCall.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        assertThat(params._pathParam(1)).isEqualTo("call_sid")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallUpdateParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .updateCall(
                    UpdateCall.builder()
                        .fallbackMethod(UpdateCall.FallbackMethod.GET)
                        .fallbackUrl("https://www.example.com/intruction-c.xml")
                        .method(UpdateCall.Method.GET)
                        .status("completed")
                        .statusCallback("https://www.example.com/callback")
                        .statusCallbackMethod(UpdateCall.StatusCallbackMethod.GET)
                        .texml(
                            "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Say>Hello</Say></Response>"
                        )
                        .url("https://www.example.com/intruction-b.xml")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpdateCall.builder()
                    .fallbackMethod(UpdateCall.FallbackMethod.GET)
                    .fallbackUrl("https://www.example.com/intruction-c.xml")
                    .method(UpdateCall.Method.GET)
                    .status("completed")
                    .statusCallback("https://www.example.com/callback")
                    .statusCallbackMethod(UpdateCall.StatusCallbackMethod.GET)
                    .texml(
                        "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Say>Hello</Say></Response>"
                    )
                    .url("https://www.example.com/intruction-b.xml")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallUpdateParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .updateCall(UpdateCall.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(UpdateCall.builder().build())
    }
}
