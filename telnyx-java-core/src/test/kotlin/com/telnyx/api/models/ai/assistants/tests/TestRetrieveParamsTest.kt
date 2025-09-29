// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.tests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestRetrieveParamsTest {

    @Test
    fun create() {
        TestRetrieveParams.builder().testId("test_id").build()
    }

    @Test
    fun pathParams() {
        val params = TestRetrieveParams.builder().testId("test_id").build()

        assertThat(params._pathParam(0)).isEqualTo("test_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
