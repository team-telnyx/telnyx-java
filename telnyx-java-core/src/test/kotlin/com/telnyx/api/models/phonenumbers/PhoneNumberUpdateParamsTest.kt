// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberUpdateParamsTest {

    @Test
    fun create() {
        PhoneNumberUpdateParams.builder()
            .pathId("1293384261075731499")
            .bodyId("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
            .billingGroupId("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
            .connectionId("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
            .customerReference("customer-reference")
            .externalPin("1234")
            .hdVoiceEnabled(true)
            .addTag("tag")
            .build()
    }

    @Test
    fun pathParams() {
        val params = PhoneNumberUpdateParams.builder().pathId("1293384261075731499").build()

        assertThat(params._pathParam(0)).isEqualTo("1293384261075731499")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhoneNumberUpdateParams.builder()
                .pathId("1293384261075731499")
                .bodyId("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                .billingGroupId("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                .connectionId("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                .customerReference("customer-reference")
                .externalPin("1234")
                .hdVoiceEnabled(true)
                .addTag("tag")
                .build()

        val body = params._body()

        assertThat(body.bodyId()).contains("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
        assertThat(body.billingGroupId()).contains("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
        assertThat(body.connectionId()).contains("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
        assertThat(body.customerReference()).contains("customer-reference")
        assertThat(body.externalPin()).contains("1234")
        assertThat(body.hdVoiceEnabled()).contains(true)
        assertThat(body.tags().getOrNull()).containsExactly("tag")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PhoneNumberUpdateParams.builder().pathId("1293384261075731499").build()

        val body = params._body()
    }
}
