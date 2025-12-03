// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.advancedorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedOrderCreateResponseTest {

    @Test
    fun create() {
        val advancedOrderCreateResponse =
            AdvancedOrderCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .areaCode("xxx")
                .comments("comments")
                .countryCode("xx")
                .customerReference("customer_reference")
                .addFeature(AdvancedOrderCreateResponse.Feature.SMS)
                .addOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPhoneNumberType(AdvancedOrderCreateResponse.PhoneNumberType.LOCAL)
                .quantity(1L)
                .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .addStatus(AdvancedOrderCreateResponse.Status.PENDING)
                .build()

        assertThat(advancedOrderCreateResponse.id())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(advancedOrderCreateResponse.areaCode()).contains("xxx")
        assertThat(advancedOrderCreateResponse.comments()).contains("comments")
        assertThat(advancedOrderCreateResponse.countryCode()).contains("xx")
        assertThat(advancedOrderCreateResponse.customerReference()).contains("customer_reference")
        assertThat(advancedOrderCreateResponse.features().getOrNull())
            .containsExactly(AdvancedOrderCreateResponse.Feature.SMS)
        assertThat(advancedOrderCreateResponse.orders().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(advancedOrderCreateResponse.phoneNumberType().getOrNull())
            .containsExactly(AdvancedOrderCreateResponse.PhoneNumberType.LOCAL)
        assertThat(advancedOrderCreateResponse.quantity()).contains(1L)
        assertThat(advancedOrderCreateResponse.requirementGroupId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(advancedOrderCreateResponse.status().getOrNull())
            .containsExactly(AdvancedOrderCreateResponse.Status.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val advancedOrderCreateResponse =
            AdvancedOrderCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .areaCode("xxx")
                .comments("comments")
                .countryCode("xx")
                .customerReference("customer_reference")
                .addFeature(AdvancedOrderCreateResponse.Feature.SMS)
                .addOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPhoneNumberType(AdvancedOrderCreateResponse.PhoneNumberType.LOCAL)
                .quantity(1L)
                .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .addStatus(AdvancedOrderCreateResponse.Status.PENDING)
                .build()

        val roundtrippedAdvancedOrderCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedOrderCreateResponse),
                jacksonTypeRef<AdvancedOrderCreateResponse>(),
            )

        assertThat(roundtrippedAdvancedOrderCreateResponse).isEqualTo(advancedOrderCreateResponse)
    }
}
