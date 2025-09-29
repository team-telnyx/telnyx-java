// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumberblocks.jobs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobRetrieveParamsTest {

    @Test
    fun create() {
        JobRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = JobRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
