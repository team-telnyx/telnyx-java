// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch.research

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResearchRetrieveParamsTest {

    @Test
    fun create() {
        ResearchRetrieveParams.builder().taskId("bf3026a5-dd57-44dd-b922-200041be3a4b").build()
    }

    @Test
    fun pathParams() {
        val params =
            ResearchRetrieveParams.builder().taskId("bf3026a5-dd57-44dd-b922-200041be3a4b").build()

        assertThat(params._pathParam(0)).isEqualTo("bf3026a5-dd57-44dd-b922-200041be3a4b")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
