// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.advancedorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedOrderUpdateRequirementGroupResponseTest {

    @Test
    fun create() {
        val advancedOrderUpdateRequirementGroupResponse =
            AdvancedOrderUpdateRequirementGroupResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .areaCode("xxx")
                .comments("comments")
                .countryCode("xx")
                .customerReference("customer_reference")
                .addFeature(AdvancedOrderUpdateRequirementGroupResponse.Feature.SMS)
                .addOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPhoneNumberType(
                    AdvancedOrderUpdateRequirementGroupResponse.PhoneNumberType.LOCAL
                )
                .quantity(1L)
                .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .addStatus(AdvancedOrderUpdateRequirementGroupResponse.Status.PENDING)
                .build()

        assertThat(advancedOrderUpdateRequirementGroupResponse.id())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(advancedOrderUpdateRequirementGroupResponse.areaCode()).contains("xxx")
        assertThat(advancedOrderUpdateRequirementGroupResponse.comments()).contains("comments")
        assertThat(advancedOrderUpdateRequirementGroupResponse.countryCode()).contains("xx")
        assertThat(advancedOrderUpdateRequirementGroupResponse.customerReference())
            .contains("customer_reference")
        assertThat(advancedOrderUpdateRequirementGroupResponse.features().getOrNull())
            .containsExactly(AdvancedOrderUpdateRequirementGroupResponse.Feature.SMS)
        assertThat(advancedOrderUpdateRequirementGroupResponse.orders().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(advancedOrderUpdateRequirementGroupResponse.phoneNumberType().getOrNull())
            .containsExactly(AdvancedOrderUpdateRequirementGroupResponse.PhoneNumberType.LOCAL)
        assertThat(advancedOrderUpdateRequirementGroupResponse.quantity()).contains(1L)
        assertThat(advancedOrderUpdateRequirementGroupResponse.requirementGroupId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(advancedOrderUpdateRequirementGroupResponse.status().getOrNull())
            .containsExactly(AdvancedOrderUpdateRequirementGroupResponse.Status.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val advancedOrderUpdateRequirementGroupResponse =
            AdvancedOrderUpdateRequirementGroupResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .areaCode("xxx")
                .comments("comments")
                .countryCode("xx")
                .customerReference("customer_reference")
                .addFeature(AdvancedOrderUpdateRequirementGroupResponse.Feature.SMS)
                .addOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPhoneNumberType(
                    AdvancedOrderUpdateRequirementGroupResponse.PhoneNumberType.LOCAL
                )
                .quantity(1L)
                .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .addStatus(AdvancedOrderUpdateRequirementGroupResponse.Status.PENDING)
                .build()

        val roundtrippedAdvancedOrderUpdateRequirementGroupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedOrderUpdateRequirementGroupResponse),
                jacksonTypeRef<AdvancedOrderUpdateRequirementGroupResponse>(),
            )

        assertThat(roundtrippedAdvancedOrderUpdateRequirementGroupResponse)
            .isEqualTo(advancedOrderUpdateRequirementGroupResponse)
    }
}
