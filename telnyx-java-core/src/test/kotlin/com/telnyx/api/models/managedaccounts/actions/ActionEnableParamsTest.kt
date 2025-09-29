// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.managedaccounts.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionEnableParamsTest {

    @Test
    fun create() {
        ActionEnableParams.builder().id("id").reenableAllConnections(true).build()
    }

    @Test
    fun pathParams() {
        val params = ActionEnableParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = ActionEnableParams.builder().id("id").reenableAllConnections(true).build()

        val body = params._body()

        assertThat(body.reenableAllConnections()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionEnableParams.builder().id("id").build()

        val body = params._body()
    }
}
