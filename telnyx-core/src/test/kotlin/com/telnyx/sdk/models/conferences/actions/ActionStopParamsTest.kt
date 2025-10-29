// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStopParamsTest {

    @Test
    fun create() {
        ActionStopParams.builder()
            .id("id")
            .addCallControlId("string")
            .region(ActionStopParams.Region.US)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionStopParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionStopParams.builder()
                .id("id")
                .addCallControlId("string")
                .region(ActionStopParams.Region.US)
                .build()

        val body = params._body()

        assertThat(body.callControlIds().getOrNull()).containsExactly("string")
        assertThat(body.region()).contains(ActionStopParams.Region.US)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionStopParams.builder().id("id").build()

        val body = params._body()
    }
}
