// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.subnumberorders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrderUpdateRequirementGroupParamsTest {

    @Test
    fun create() {
        SubNumberOrderUpdateRequirementGroupParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .requirementGroupId("a4b201f9-8646-4e54-a7d2-b2e403eeaf8c")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubNumberOrderUpdateRequirementGroupParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .requirementGroupId("a4b201f9-8646-4e54-a7d2-b2e403eeaf8c")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubNumberOrderUpdateRequirementGroupParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .requirementGroupId("a4b201f9-8646-4e54-a7d2-b2e403eeaf8c")
                .build()

        val body = params._body()

        assertThat(body.requirementGroupId()).isEqualTo("a4b201f9-8646-4e54-a7d2-b2e403eeaf8c")
    }
}
