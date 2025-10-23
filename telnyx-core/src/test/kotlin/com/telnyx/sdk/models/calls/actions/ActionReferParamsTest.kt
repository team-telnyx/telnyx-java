// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.telnyx.sdk.models.calls.CustomSipHeader
import com.telnyx.sdk.models.calls.SipHeader
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionReferParamsTest {

    @Test
    fun create() {
        ActionReferParams.builder()
            .callControlId("call_control_id")
            .sipAddress("sip:username@sip.non-telnyx-address.com")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .addCustomHeader(CustomSipHeader.builder().name("head_1").value("val_1").build())
            .addCustomHeader(CustomSipHeader.builder().name("head_2").value("val_2").build())
            .sipAuthPassword("sip_auth_password")
            .sipAuthUsername("sip_auth_username")
            .addSipHeader(
                SipHeader.builder().name(SipHeader.Name.USER_TO_USER).value("value").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionReferParams.builder()
                .callControlId("call_control_id")
                .sipAddress("sip:username@sip.non-telnyx-address.com")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionReferParams.builder()
                .callControlId("call_control_id")
                .sipAddress("sip:username@sip.non-telnyx-address.com")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .addCustomHeader(CustomSipHeader.builder().name("head_1").value("val_1").build())
                .addCustomHeader(CustomSipHeader.builder().name("head_2").value("val_2").build())
                .sipAuthPassword("sip_auth_password")
                .sipAuthUsername("sip_auth_username")
                .addSipHeader(
                    SipHeader.builder().name(SipHeader.Name.USER_TO_USER).value("value").build()
                )
                .build()

        val body = params._body()

        assertThat(body.sipAddress()).isEqualTo("sip:username@sip.non-telnyx-address.com")
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.customHeaders().getOrNull())
            .containsExactly(
                CustomSipHeader.builder().name("head_1").value("val_1").build(),
                CustomSipHeader.builder().name("head_2").value("val_2").build(),
            )
        assertThat(body.sipAuthPassword()).contains("sip_auth_password")
        assertThat(body.sipAuthUsername()).contains("sip_auth_username")
        assertThat(body.sipHeaders().getOrNull())
            .containsExactly(
                SipHeader.builder().name(SipHeader.Name.USER_TO_USER).value("value").build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionReferParams.builder()
                .callControlId("call_control_id")
                .sipAddress("sip:username@sip.non-telnyx-address.com")
                .build()

        val body = params._body()

        assertThat(body.sipAddress()).isEqualTo("sip:username@sip.non-telnyx-address.com")
    }
}
