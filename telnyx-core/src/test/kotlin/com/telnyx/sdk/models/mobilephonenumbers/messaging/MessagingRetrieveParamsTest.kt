// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilephonenumbers.messaging

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingRetrieveParamsTest {

    @Test
    fun create() {
        MessagingRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = MessagingRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
