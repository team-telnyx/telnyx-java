// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.advancedorders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedOrderCreateParamsTest {

    @Test
    fun create() {
        AdvancedOrderCreateParams.builder()
            .advancedOrderRequest(
                AdvancedOrderRequest.builder()
                    .areaCode("xxx")
                    .comments("comments")
                    .countryCode("xx")
                    .customerReference("customer_reference")
                    .addFeature(AdvancedOrderRequest.Feature.SMS)
                    .phoneNumberType(AdvancedOrderRequest.PhoneNumberType.LOCAL)
                    .quantity(1L)
                    .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AdvancedOrderCreateParams.builder()
                .advancedOrderRequest(
                    AdvancedOrderRequest.builder()
                        .areaCode("xxx")
                        .comments("comments")
                        .countryCode("xx")
                        .customerReference("customer_reference")
                        .addFeature(AdvancedOrderRequest.Feature.SMS)
                        .phoneNumberType(AdvancedOrderRequest.PhoneNumberType.LOCAL)
                        .quantity(1L)
                        .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AdvancedOrderRequest.builder()
                    .areaCode("xxx")
                    .comments("comments")
                    .countryCode("xx")
                    .customerReference("customer_reference")
                    .addFeature(AdvancedOrderRequest.Feature.SMS)
                    .phoneNumberType(AdvancedOrderRequest.PhoneNumberType.LOCAL)
                    .quantity(1L)
                    .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AdvancedOrderCreateParams.builder()
                .advancedOrderRequest(AdvancedOrderRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(AdvancedOrderRequest.builder().build())
    }
}
