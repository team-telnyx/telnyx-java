// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRetrieveParamsTest {

    @Test
    fun create() {
        ActionRetrieveParams.builder().id("id").actionId("actionId").build()
    }

    @Test
    fun pathParams() {
        val params = ActionRetrieveParams.builder().id("id").actionId("actionId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("actionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
