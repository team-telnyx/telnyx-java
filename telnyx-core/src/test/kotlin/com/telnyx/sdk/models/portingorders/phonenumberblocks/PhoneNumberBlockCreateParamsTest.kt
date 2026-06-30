// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberblocks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberBlockCreateParamsTest {

    @Test
    fun create() {
        PhoneNumberBlockCreateParams.builder()
            .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addActivationRange(
                PhoneNumberBlockCreateParams.ActivationRange.builder()
                    .endAt("+4930244999910")
                    .startAt("+4930244999901")
                    .build()
            )
            .phoneNumberRange(
                PhoneNumberBlockCreateParams.PhoneNumberRange.builder()
                    .endAt("+4930244999910")
                    .startAt("+4930244999901")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberBlockCreateParams.builder()
                .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addActivationRange(
                    PhoneNumberBlockCreateParams.ActivationRange.builder()
                        .endAt("+4930244999910")
                        .startAt("+4930244999901")
                        .build()
                )
                .phoneNumberRange(
                    PhoneNumberBlockCreateParams.PhoneNumberRange.builder()
                        .endAt("+4930244999910")
                        .startAt("+4930244999901")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhoneNumberBlockCreateParams.builder()
                .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addActivationRange(
                    PhoneNumberBlockCreateParams.ActivationRange.builder()
                        .endAt("+4930244999910")
                        .startAt("+4930244999901")
                        .build()
                )
                .phoneNumberRange(
                    PhoneNumberBlockCreateParams.PhoneNumberRange.builder()
                        .endAt("+4930244999910")
                        .startAt("+4930244999901")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.activationRanges())
            .containsExactly(
                PhoneNumberBlockCreateParams.ActivationRange.builder()
                    .endAt("+4930244999910")
                    .startAt("+4930244999901")
                    .build()
            )
        assertThat(body.phoneNumberRange())
            .isEqualTo(
                PhoneNumberBlockCreateParams.PhoneNumberRange.builder()
                    .endAt("+4930244999910")
                    .startAt("+4930244999901")
                    .build()
            )
    }
}
