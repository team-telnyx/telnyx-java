// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorders

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberOrderCreateParamsTest {

    @Test
    fun create() {
        NumberOrderCreateParams.builder()
            .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
            .connectionId("346789098765567")
            .customerReference("MY REF 001")
            .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
            .addPhoneNumber(
                NumberOrderCreateParams.PhoneNumber.builder()
                    .phoneNumber("+19705555098")
                    .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                    .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                    .build()
            )
            .addPhoneNumber(
                NumberOrderCreateParams.PhoneNumber.builder()
                    .phoneNumber("+492111609539")
                    .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                    .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            NumberOrderCreateParams.builder()
                .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                .connectionId("346789098765567")
                .customerReference("MY REF 001")
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                .addPhoneNumber(
                    NumberOrderCreateParams.PhoneNumber.builder()
                        .phoneNumber("+19705555098")
                        .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                        .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                        .build()
                )
                .addPhoneNumber(
                    NumberOrderCreateParams.PhoneNumber.builder()
                        .phoneNumber("+492111609539")
                        .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                        .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.billingGroupId()).contains("abc85f64-5717-4562-b3fc-2c9600")
        assertThat(body.connectionId()).contains("346789098765567")
        assertThat(body.customerReference()).contains("MY REF 001")
        assertThat(body.messagingProfileId()).contains("abc85f64-5717-4562-b3fc-2c9600")
        assertThat(body.phoneNumbers().getOrNull())
            .containsExactly(
                NumberOrderCreateParams.PhoneNumber.builder()
                    .phoneNumber("+19705555098")
                    .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                    .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                    .build(),
                NumberOrderCreateParams.PhoneNumber.builder()
                    .phoneNumber("+492111609539")
                    .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                    .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                    .build(),
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = NumberOrderCreateParams.builder().build()

        val body = params._body()
    }
}
