// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.advancedorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedOrderRetrieveResponseTest {

    @Test
    fun create() {
        val advancedOrderRetrieveResponse =
            AdvancedOrderRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .areaCode("xxx")
                .comments("comments")
                .countryCode("xx")
                .customerReference("customer_reference")
                .addFeature(AdvancedOrderRetrieveResponse.Feature.SMS)
                .addOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPhoneNumberType(AdvancedOrderRetrieveResponse.PhoneNumberType.LOCAL)
                .quantity(1L)
                .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .addStatus(AdvancedOrderRetrieveResponse.Status.PENDING)
                .build()

        assertThat(advancedOrderRetrieveResponse.id())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(advancedOrderRetrieveResponse.areaCode()).contains("xxx")
        assertThat(advancedOrderRetrieveResponse.comments()).contains("comments")
        assertThat(advancedOrderRetrieveResponse.countryCode()).contains("xx")
        assertThat(advancedOrderRetrieveResponse.customerReference()).contains("customer_reference")
        assertThat(advancedOrderRetrieveResponse.features().getOrNull())
            .containsExactly(AdvancedOrderRetrieveResponse.Feature.SMS)
        assertThat(advancedOrderRetrieveResponse.orders().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(advancedOrderRetrieveResponse.phoneNumberType().getOrNull())
            .containsExactly(AdvancedOrderRetrieveResponse.PhoneNumberType.LOCAL)
        assertThat(advancedOrderRetrieveResponse.quantity()).contains(1L)
        assertThat(advancedOrderRetrieveResponse.requirementGroupId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(advancedOrderRetrieveResponse.status().getOrNull())
            .containsExactly(AdvancedOrderRetrieveResponse.Status.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val advancedOrderRetrieveResponse =
            AdvancedOrderRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .areaCode("xxx")
                .comments("comments")
                .countryCode("xx")
                .customerReference("customer_reference")
                .addFeature(AdvancedOrderRetrieveResponse.Feature.SMS)
                .addOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPhoneNumberType(AdvancedOrderRetrieveResponse.PhoneNumberType.LOCAL)
                .quantity(1L)
                .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .addStatus(AdvancedOrderRetrieveResponse.Status.PENDING)
                .build()

        val roundtrippedAdvancedOrderRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedOrderRetrieveResponse),
                jacksonTypeRef<AdvancedOrderRetrieveResponse>(),
            )

        assertThat(roundtrippedAdvancedOrderRetrieveResponse)
            .isEqualTo(advancedOrderRetrieveResponse)
    }
}
