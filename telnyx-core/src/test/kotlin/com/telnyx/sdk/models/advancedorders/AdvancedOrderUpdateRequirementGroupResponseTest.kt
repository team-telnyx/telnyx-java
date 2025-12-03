// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.advancedorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedOrderUpdateRequirementGroupResponseTest {

    @Test
    fun create() {
        val advancedOrderUpdateRequirementGroupResponse =
            AdvancedOrderUpdateRequirementGroupResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val advancedOrderUpdateRequirementGroupResponse =
            AdvancedOrderUpdateRequirementGroupResponse.builder().build()

        val roundtrippedAdvancedOrderUpdateRequirementGroupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedOrderUpdateRequirementGroupResponse),
                jacksonTypeRef<AdvancedOrderUpdateRequirementGroupResponse>(),
            )

        assertThat(roundtrippedAdvancedOrderUpdateRequirementGroupResponse)
            .isEqualTo(advancedOrderUpdateRequirementGroupResponse)
    }
}
