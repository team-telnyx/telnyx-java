// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionShareParamsTest {

    @Test
    fun create() {
        ActionShareParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .expiresInSeconds(3600L)
            .permissions(ActionShareParams.Permissions.PORTING_ORDER_DOCUMENT_READ)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionShareParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionShareParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresInSeconds(3600L)
                .permissions(ActionShareParams.Permissions.PORTING_ORDER_DOCUMENT_READ)
                .build()

        val body = params._body()

        assertThat(body.expiresInSeconds()).contains(3600L)
        assertThat(body.permissions())
            .contains(ActionShareParams.Permissions.PORTING_ORDER_DOCUMENT_READ)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionShareParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
