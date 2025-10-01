// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.advancedorders

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedOrderUpdateRequirementGroupParamsTest {

    @Test
    fun create() {
        AdvancedOrderUpdateRequirementGroupParams.builder()
            .advancedOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .areaCode("xxx")
            .comments("comments")
            .countryCode("xx")
            .customerReference("customer_reference")
            .addFeature(AdvancedOrderUpdateRequirementGroupParams.Feature.SMS)
            .phoneNumberType(AdvancedOrderUpdateRequirementGroupParams.PhoneNumberType.LOCAL)
            .quantity(1L)
            .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AdvancedOrderUpdateRequirementGroupParams.builder()
                .advancedOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AdvancedOrderUpdateRequirementGroupParams.builder()
                .advancedOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .areaCode("xxx")
                .comments("comments")
                .countryCode("xx")
                .customerReference("customer_reference")
                .addFeature(AdvancedOrderUpdateRequirementGroupParams.Feature.SMS)
                .phoneNumberType(AdvancedOrderUpdateRequirementGroupParams.PhoneNumberType.LOCAL)
                .quantity(1L)
                .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .build()

        val body = params._body()

        assertThat(body.areaCode()).contains("xxx")
        assertThat(body.comments()).contains("comments")
        assertThat(body.countryCode()).contains("xx")
        assertThat(body.customerReference()).contains("customer_reference")
        assertThat(body.features().getOrNull())
            .containsExactly(AdvancedOrderUpdateRequirementGroupParams.Feature.SMS)
        assertThat(body.phoneNumberType())
            .contains(AdvancedOrderUpdateRequirementGroupParams.PhoneNumberType.LOCAL)
        assertThat(body.quantity()).contains(1L)
        assertThat(body.requirementGroupId()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AdvancedOrderUpdateRequirementGroupParams.builder()
                .advancedOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
