// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messaging.rcs.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentRetrieveParamsTest {

    @Test
    fun create() {
        AgentRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = AgentRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
