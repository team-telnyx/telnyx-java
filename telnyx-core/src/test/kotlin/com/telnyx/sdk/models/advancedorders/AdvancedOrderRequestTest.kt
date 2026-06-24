// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.advancedorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedOrderRequestTest {

    @Test
    fun create() {
        val advancedOrderRequest =
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

        assertThat(advancedOrderRequest.areaCode()).contains("xxx")
        assertThat(advancedOrderRequest.comments()).contains("comments")
        assertThat(advancedOrderRequest.countryCode()).contains("xx")
        assertThat(advancedOrderRequest.customerReference()).contains("customer_reference")
        assertThat(advancedOrderRequest.features().getOrNull())
            .containsExactly(AdvancedOrderRequest.Feature.SMS)
        assertThat(advancedOrderRequest.phoneNumberType())
            .contains(AdvancedOrderRequest.PhoneNumberType.LOCAL)
        assertThat(advancedOrderRequest.quantity()).contains(1L)
        assertThat(advancedOrderRequest.requirementGroupId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val advancedOrderRequest =
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

        val roundtrippedAdvancedOrderRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedOrderRequest),
                jacksonTypeRef<AdvancedOrderRequest>(),
            )

        assertThat(roundtrippedAdvancedOrderRequest).isEqualTo(advancedOrderRequest)
    }
}
