// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.requirements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementRetrieveParamsTest {

    @Test
    fun create() {
        RequirementRetrieveParams.builder().id("a9dad8d5-fdbd-49d7-aa23-39bb08a5ebaa").build()
    }

    @Test
    fun pathParams() {
        val params =
            RequirementRetrieveParams.builder().id("a9dad8d5-fdbd-49d7-aa23-39bb08a5ebaa").build()

        assertThat(params._pathParam(0)).isEqualTo("a9dad8d5-fdbd-49d7-aa23-39bb08a5ebaa")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
