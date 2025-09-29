// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.requirementgroups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementGroupRetrieveParamsTest {

    @Test
    fun create() {
        RequirementGroupRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = RequirementGroupRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
