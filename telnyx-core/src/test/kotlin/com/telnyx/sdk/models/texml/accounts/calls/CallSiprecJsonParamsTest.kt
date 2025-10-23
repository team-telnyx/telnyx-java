// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallSiprecJsonParamsTest {

    @Test
    fun create() {
        CallSiprecJsonParams.builder()
            .accountSid("account_sid")
            .callSid("call_sid")
            .connectorName("my_connector")
            .includeMetadataCustomHeaders(CallSiprecJsonParams.IncludeMetadataCustomHeaders.TRUE)
            .name("my_siprec_session")
            .secure(CallSiprecJsonParams.Secure.TRUE)
            .sessionTimeoutSecs(900L)
            .sipTransport(CallSiprecJsonParams.SipTransport.TCP)
            .statusCallback("https://www.example.com/callback")
            .statusCallbackMethod(CallSiprecJsonParams.StatusCallbackMethod.GET)
            .track(CallSiprecJsonParams.Track.BOTH_TRACKS)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CallSiprecJsonParams.builder().accountSid("account_sid").callSid("call_sid").build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        assertThat(params._pathParam(1)).isEqualTo("call_sid")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallSiprecJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .connectorName("my_connector")
                .includeMetadataCustomHeaders(
                    CallSiprecJsonParams.IncludeMetadataCustomHeaders.TRUE
                )
                .name("my_siprec_session")
                .secure(CallSiprecJsonParams.Secure.TRUE)
                .sessionTimeoutSecs(900L)
                .sipTransport(CallSiprecJsonParams.SipTransport.TCP)
                .statusCallback("https://www.example.com/callback")
                .statusCallbackMethod(CallSiprecJsonParams.StatusCallbackMethod.GET)
                .track(CallSiprecJsonParams.Track.BOTH_TRACKS)
                .build()

        val body = params._body()

        assertThat(body.connectorName()).contains("my_connector")
        assertThat(body.includeMetadataCustomHeaders())
            .contains(CallSiprecJsonParams.IncludeMetadataCustomHeaders.TRUE)
        assertThat(body.name()).contains("my_siprec_session")
        assertThat(body.secure()).contains(CallSiprecJsonParams.Secure.TRUE)
        assertThat(body.sessionTimeoutSecs()).contains(900L)
        assertThat(body.sipTransport()).contains(CallSiprecJsonParams.SipTransport.TCP)
        assertThat(body.statusCallback()).contains("https://www.example.com/callback")
        assertThat(body.statusCallbackMethod())
            .contains(CallSiprecJsonParams.StatusCallbackMethod.GET)
        assertThat(body.track()).contains(CallSiprecJsonParams.Track.BOTH_TRACKS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallSiprecJsonParams.builder().accountSid("account_sid").callSid("call_sid").build()

        val body = params._body()
    }
}
