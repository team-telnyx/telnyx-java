// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.advancedorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedOrderTest {

    @Test
    fun create() {
        val advancedOrder =
            AdvancedOrder.builder()
                .areaCode("xxx")
                .comments("comments")
                .countryCode("xx")
                .customerReference("customer_reference")
                .addFeature(AdvancedOrder.Feature.SMS)
                .phoneNumberType(AdvancedOrder.PhoneNumberType.LOCAL)
                .quantity(1L)
                .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .build()

        assertThat(advancedOrder.areaCode()).contains("xxx")
        assertThat(advancedOrder.comments()).contains("comments")
        assertThat(advancedOrder.countryCode()).contains("xx")
        assertThat(advancedOrder.customerReference()).contains("customer_reference")
        assertThat(advancedOrder.features().getOrNull()).containsExactly(AdvancedOrder.Feature.SMS)
        assertThat(advancedOrder.phoneNumberType()).contains(AdvancedOrder.PhoneNumberType.LOCAL)
        assertThat(advancedOrder.quantity()).contains(1L)
        assertThat(advancedOrder.requirementGroupId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val advancedOrder =
            AdvancedOrder.builder()
                .areaCode("xxx")
                .comments("comments")
                .countryCode("xx")
                .customerReference("customer_reference")
                .addFeature(AdvancedOrder.Feature.SMS)
                .phoneNumberType(AdvancedOrder.PhoneNumberType.LOCAL)
                .quantity(1L)
                .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .build()

        val roundtrippedAdvancedOrder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedOrder),
                jacksonTypeRef<AdvancedOrder>(),
            )

        assertThat(roundtrippedAdvancedOrder).isEqualTo(advancedOrder)
    }
}
