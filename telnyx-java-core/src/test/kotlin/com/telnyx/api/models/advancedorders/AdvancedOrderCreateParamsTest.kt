// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.advancedorders

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedOrderCreateParamsTest {

    @Test
    fun create() {
        AdvancedOrderCreateParams.builder()
            .areaCode("xxx")
            .comments("comments")
            .countryCode("xx")
            .customerReference("customer_reference")
            .addFeature(AdvancedOrderCreateParams.Feature.SMS)
            .phoneNumberType(AdvancedOrderCreateParams.PhoneNumberType.LOCAL)
            .quantity(1L)
            .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
            .build()
    }

    @Test
    fun body() {
        val params =
            AdvancedOrderCreateParams.builder()
                .areaCode("xxx")
                .comments("comments")
                .countryCode("xx")
                .customerReference("customer_reference")
                .addFeature(AdvancedOrderCreateParams.Feature.SMS)
                .phoneNumberType(AdvancedOrderCreateParams.PhoneNumberType.LOCAL)
                .quantity(1L)
                .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .build()

        val body = params._body()

        assertThat(body.areaCode()).contains("xxx")
        assertThat(body.comments()).contains("comments")
        assertThat(body.countryCode()).contains("xx")
        assertThat(body.customerReference()).contains("customer_reference")
        assertThat(body.features().getOrNull())
            .containsExactly(AdvancedOrderCreateParams.Feature.SMS)
        assertThat(body.phoneNumberType()).contains(AdvancedOrderCreateParams.PhoneNumberType.LOCAL)
        assertThat(body.quantity()).contains(1L)
        assertThat(body.requirementGroupId()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AdvancedOrderCreateParams.builder().build()

        val body = params._body()
    }
}
