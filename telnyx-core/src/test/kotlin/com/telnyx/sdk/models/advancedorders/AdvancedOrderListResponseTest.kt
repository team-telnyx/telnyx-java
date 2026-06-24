// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.advancedorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedOrderListResponseTest {

    @Test
    fun create() {
        val advancedOrderListResponse =
            AdvancedOrderListResponse.builder()
                .addData(
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
                )
                .build()

        assertThat(advancedOrderListResponse.data().getOrNull())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val advancedOrderListResponse =
            AdvancedOrderListResponse.builder()
                .addData(
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
                )
                .build()

        val roundtrippedAdvancedOrderListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedOrderListResponse),
                jacksonTypeRef<AdvancedOrderListResponse>(),
            )

        assertThat(roundtrippedAdvancedOrderListResponse).isEqualTo(advancedOrderListResponse)
    }
}
