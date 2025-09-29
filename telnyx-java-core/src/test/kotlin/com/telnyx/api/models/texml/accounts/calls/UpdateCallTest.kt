// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateCallTest {

    @Test
    fun create() {
        val updateCall =
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

        assertThat(updateCall.fallbackMethod()).contains(UpdateCall.FallbackMethod.GET)
        assertThat(updateCall.fallbackUrl()).contains("https://www.example.com/intruction-c.xml")
        assertThat(updateCall.method()).contains(UpdateCall.Method.GET)
        assertThat(updateCall.status()).contains("completed")
        assertThat(updateCall.statusCallback()).contains("https://www.example.com/callback")
        assertThat(updateCall.statusCallbackMethod()).contains(UpdateCall.StatusCallbackMethod.GET)
        assertThat(updateCall.texml())
            .contains(
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Say>Hello</Say></Response>"
            )
        assertThat(updateCall.url()).contains("https://www.example.com/intruction-b.xml")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateCall =
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

        val roundtrippedUpdateCall =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateCall),
                jacksonTypeRef<UpdateCall>(),
            )

        assertThat(roundtrippedUpdateCall).isEqualTo(updateCall)
    }
}
