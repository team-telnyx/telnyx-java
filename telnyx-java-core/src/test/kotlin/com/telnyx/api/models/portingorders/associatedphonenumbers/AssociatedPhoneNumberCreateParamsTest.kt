// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.associatedphonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociatedPhoneNumberCreateParamsTest {

    @Test
    fun create() {
        AssociatedPhoneNumberCreateParams.builder()
            .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .action(AssociatedPhoneNumberCreateParams.Action.KEEP)
            .phoneNumberRange(
                AssociatedPhoneNumberCreateParams.PhoneNumberRange.builder()
                    .endAt("+441234567899")
                    .startAt("+441234567890")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AssociatedPhoneNumberCreateParams.builder()
                .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .action(AssociatedPhoneNumberCreateParams.Action.KEEP)
                .phoneNumberRange(
                    AssociatedPhoneNumberCreateParams.PhoneNumberRange.builder().build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AssociatedPhoneNumberCreateParams.builder()
                .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .action(AssociatedPhoneNumberCreateParams.Action.KEEP)
                .phoneNumberRange(
                    AssociatedPhoneNumberCreateParams.PhoneNumberRange.builder()
                        .endAt("+441234567899")
                        .startAt("+441234567890")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.action()).isEqualTo(AssociatedPhoneNumberCreateParams.Action.KEEP)
        assertThat(body.phoneNumberRange())
            .isEqualTo(
                AssociatedPhoneNumberCreateParams.PhoneNumberRange.builder()
                    .endAt("+441234567899")
                    .startAt("+441234567890")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AssociatedPhoneNumberCreateParams.builder()
                .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .action(AssociatedPhoneNumberCreateParams.Action.KEEP)
                .phoneNumberRange(
                    AssociatedPhoneNumberCreateParams.PhoneNumberRange.builder().build()
                )
                .build()

        val body = params._body()

        assertThat(body.action()).isEqualTo(AssociatedPhoneNumberCreateParams.Action.KEEP)
        assertThat(body.phoneNumberRange())
            .isEqualTo(AssociatedPhoneNumberCreateParams.PhoneNumberRange.builder().build())
    }
}
