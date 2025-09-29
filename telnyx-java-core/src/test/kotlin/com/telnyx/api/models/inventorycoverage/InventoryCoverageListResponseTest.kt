// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.inventorycoverage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InventoryCoverageListResponseTest {

    @Test
    fun create() {
        val inventoryCoverageListResponse =
            InventoryCoverageListResponse.builder()
                .addData(
                    InventoryCoverageListResponse.Data.builder()
                        .administrativeArea("NJ")
                        .advanceRequirements(true)
                        .count(3L)
                        .coverageType(InventoryCoverageListResponse.Data.CoverageType.NUMBER)
                        .group("318")
                        .groupType("npa")
                        .numberRange(1L)
                        .numberType(InventoryCoverageListResponse.Data.NumberType.DID)
                        .phoneNumberType(InventoryCoverageListResponse.Data.PhoneNumberType.LOCAL)
                        .recordType("inventory_coverage_group")
                        .build()
                )
                .meta(InventoryCoverageListResponse.Meta.builder().totalResults(25L).build())
                .build()

        assertThat(inventoryCoverageListResponse.data().getOrNull())
            .containsExactly(
                InventoryCoverageListResponse.Data.builder()
                    .administrativeArea("NJ")
                    .advanceRequirements(true)
                    .count(3L)
                    .coverageType(InventoryCoverageListResponse.Data.CoverageType.NUMBER)
                    .group("318")
                    .groupType("npa")
                    .numberRange(1L)
                    .numberType(InventoryCoverageListResponse.Data.NumberType.DID)
                    .phoneNumberType(InventoryCoverageListResponse.Data.PhoneNumberType.LOCAL)
                    .recordType("inventory_coverage_group")
                    .build()
            )
        assertThat(inventoryCoverageListResponse.meta())
            .contains(InventoryCoverageListResponse.Meta.builder().totalResults(25L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inventoryCoverageListResponse =
            InventoryCoverageListResponse.builder()
                .addData(
                    InventoryCoverageListResponse.Data.builder()
                        .administrativeArea("NJ")
                        .advanceRequirements(true)
                        .count(3L)
                        .coverageType(InventoryCoverageListResponse.Data.CoverageType.NUMBER)
                        .group("318")
                        .groupType("npa")
                        .numberRange(1L)
                        .numberType(InventoryCoverageListResponse.Data.NumberType.DID)
                        .phoneNumberType(InventoryCoverageListResponse.Data.PhoneNumberType.LOCAL)
                        .recordType("inventory_coverage_group")
                        .build()
                )
                .meta(InventoryCoverageListResponse.Meta.builder().totalResults(25L).build())
                .build()

        val roundtrippedInventoryCoverageListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inventoryCoverageListResponse),
                jacksonTypeRef<InventoryCoverageListResponse>(),
            )

        assertThat(roundtrippedInventoryCoverageListResponse)
            .isEqualTo(inventoryCoverageListResponse)
    }
}
