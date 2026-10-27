// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioDeleteParamsTest {

    @Test
    fun create() {
        ScenarioDeleteParams.builder().id(0L).build()
    }

    @Test
    fun pathParams() {
        val params = ScenarioDeleteParams.builder().id(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
