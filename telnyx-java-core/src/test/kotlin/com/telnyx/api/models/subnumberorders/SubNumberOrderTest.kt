// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.subnumberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrderTest {

    @Test
    fun create() {
        val subNumberOrder =
            SubNumberOrder.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .customerReference("MY REF 001")
                .isBlockSubNumberOrder(false)
                .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
                .phoneNumberType(SubNumberOrder.PhoneNumberType.LOCAL)
                .phoneNumbersCount(1L)
                .recordType("sub_number_order")
                .addRegulatoryRequirement(
                    SubNumberOrderRegulatoryRequirement.builder()
                        .fieldType(SubNumberOrderRegulatoryRequirement.FieldType.ADDRESS)
                        .recordType("phone_number_regulatory_requirement")
                        .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                        .build()
                )
                .requirementsMet(true)
                .status(SubNumberOrder.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .userId("d70873cd-7c98-401a-81b6-b1ae08246995")
                .build()

        assertThat(subNumberOrder.id()).contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(subNumberOrder.countryCode()).contains("US")
        assertThat(subNumberOrder.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
        assertThat(subNumberOrder.customerReference()).contains("MY REF 001")
        assertThat(subNumberOrder.isBlockSubNumberOrder()).contains(false)
        assertThat(subNumberOrder.orderRequestId()).contains("12ade33a-21c0-473b-b055-b3c836e1c293")
        assertThat(subNumberOrder.phoneNumberType()).contains(SubNumberOrder.PhoneNumberType.LOCAL)
        assertThat(subNumberOrder.phoneNumbersCount()).contains(1L)
        assertThat(subNumberOrder.recordType()).contains("sub_number_order")
        assertThat(subNumberOrder.regulatoryRequirements().getOrNull())
            .containsExactly(
                SubNumberOrderRegulatoryRequirement.builder()
                    .fieldType(SubNumberOrderRegulatoryRequirement.FieldType.ADDRESS)
                    .recordType("phone_number_regulatory_requirement")
                    .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                    .build()
            )
        assertThat(subNumberOrder.requirementsMet()).contains(true)
        assertThat(subNumberOrder.status()).contains(SubNumberOrder.Status.PENDING)
        assertThat(subNumberOrder.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
        assertThat(subNumberOrder.userId()).contains("d70873cd-7c98-401a-81b6-b1ae08246995")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subNumberOrder =
            SubNumberOrder.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .customerReference("MY REF 001")
                .isBlockSubNumberOrder(false)
                .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
                .phoneNumberType(SubNumberOrder.PhoneNumberType.LOCAL)
                .phoneNumbersCount(1L)
                .recordType("sub_number_order")
                .addRegulatoryRequirement(
                    SubNumberOrderRegulatoryRequirement.builder()
                        .fieldType(SubNumberOrderRegulatoryRequirement.FieldType.ADDRESS)
                        .recordType("phone_number_regulatory_requirement")
                        .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                        .build()
                )
                .requirementsMet(true)
                .status(SubNumberOrder.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .userId("d70873cd-7c98-401a-81b6-b1ae08246995")
                .build()

        val roundtrippedSubNumberOrder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subNumberOrder),
                jacksonTypeRef<SubNumberOrder>(),
            )

        assertThat(roundtrippedSubNumberOrder).isEqualTo(subNumberOrder)
    }
}
