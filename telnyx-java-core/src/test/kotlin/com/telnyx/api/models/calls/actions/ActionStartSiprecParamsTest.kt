// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartSiprecParamsTest {

    @Test
    fun create() {
        ActionStartSiprecParams.builder()
            .callControlId("call_control_id")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .connectorName("my-siprec-connector")
            .includeMetadataCustomHeaders(ActionStartSiprecParams.IncludeMetadataCustomHeaders.TRUE)
            .secure(ActionStartSiprecParams.Secure.TRUE)
            .sessionTimeoutSecs(900L)
            .sipTransport(ActionStartSiprecParams.SipTransport.TCP)
            .siprecTrack(ActionStartSiprecParams.SiprecTrack.BOTH_TRACKS)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionStartSiprecParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionStartSiprecParams.builder()
                .callControlId("call_control_id")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .connectorName("my-siprec-connector")
                .includeMetadataCustomHeaders(
                    ActionStartSiprecParams.IncludeMetadataCustomHeaders.TRUE
                )
                .secure(ActionStartSiprecParams.Secure.TRUE)
                .sessionTimeoutSecs(900L)
                .sipTransport(ActionStartSiprecParams.SipTransport.TCP)
                .siprecTrack(ActionStartSiprecParams.SiprecTrack.BOTH_TRACKS)
                .build()

        val body = params._body()

        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.connectorName()).contains("my-siprec-connector")
        assertThat(body.includeMetadataCustomHeaders())
            .contains(ActionStartSiprecParams.IncludeMetadataCustomHeaders.TRUE)
        assertThat(body.secure()).contains(ActionStartSiprecParams.Secure.TRUE)
        assertThat(body.sessionTimeoutSecs()).contains(900L)
        assertThat(body.sipTransport()).contains(ActionStartSiprecParams.SipTransport.TCP)
        assertThat(body.siprecTrack()).contains(ActionStartSiprecParams.SiprecTrack.BOTH_TRACKS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionStartSiprecParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
