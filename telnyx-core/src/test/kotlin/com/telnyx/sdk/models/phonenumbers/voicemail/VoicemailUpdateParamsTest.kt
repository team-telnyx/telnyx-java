// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voicemail

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoicemailUpdateParamsTest {

    @Test
    fun create() {
        VoicemailUpdateParams.builder()
            .phoneNumberId("123455678900")
            .voicemailRequest(VoicemailRequest.builder().enabled(true).pin("1234").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VoicemailUpdateParams.builder()
                .phoneNumberId("123455678900")
                .voicemailRequest(VoicemailRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("123455678900")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VoicemailUpdateParams.builder()
                .phoneNumberId("123455678900")
                .voicemailRequest(VoicemailRequest.builder().enabled(true).pin("1234").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(VoicemailRequest.builder().enabled(true).pin("1234").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VoicemailUpdateParams.builder()
                .phoneNumberId("123455678900")
                .voicemailRequest(VoicemailRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(VoicemailRequest.builder().build())
    }
}
