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
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .areaCode("xxx")
                .comments("comments")
                .countryCode("xx")
                .customerReference("customer_reference")
                .addFeature(AdvancedOrder.Feature.SMS)
                .addOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPhoneNumberType(AdvancedOrder.PhoneNumberType.LOCAL)
                .quantity(1L)
                .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .addStatus(AdvancedOrder.Status.PENDING)
                .build()

        assertThat(advancedOrder.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(advancedOrder.areaCode()).contains("xxx")
        assertThat(advancedOrder.comments()).contains("comments")
        assertThat(advancedOrder.countryCode()).contains("xx")
        assertThat(advancedOrder.customerReference()).contains("customer_reference")
        assertThat(advancedOrder.features().getOrNull()).containsExactly(AdvancedOrder.Feature.SMS)
        assertThat(advancedOrder.orders().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(advancedOrder.phoneNumberType().getOrNull())
            .containsExactly(AdvancedOrder.PhoneNumberType.LOCAL)
        assertThat(advancedOrder.quantity()).contains(1L)
        assertThat(advancedOrder.requirementGroupId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(advancedOrder.status().getOrNull()).containsExactly(AdvancedOrder.Status.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val advancedOrder =
            AdvancedOrder.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .areaCode("xxx")
                .comments("comments")
                .countryCode("xx")
                .customerReference("customer_reference")
                .addFeature(AdvancedOrder.Feature.SMS)
                .addOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPhoneNumberType(AdvancedOrder.PhoneNumberType.LOCAL)
                .quantity(1L)
                .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .addStatus(AdvancedOrder.Status.PENDING)
                .build()

        val roundtrippedAdvancedOrder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedOrder),
                jacksonTypeRef<AdvancedOrder>(),
            )

        assertThat(roundtrippedAdvancedOrder).isEqualTo(advancedOrder)
    }
}
