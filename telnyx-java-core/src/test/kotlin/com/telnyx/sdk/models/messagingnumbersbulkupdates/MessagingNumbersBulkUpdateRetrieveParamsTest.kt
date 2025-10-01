// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingnumbersbulkupdates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingNumbersBulkUpdateRetrieveParamsTest {

    @Test
    fun create() {
        MessagingNumbersBulkUpdateRetrieveParams.builder().orderId("order_id").build()
    }

    @Test
    fun pathParams() {
        val params = MessagingNumbersBulkUpdateRetrieveParams.builder().orderId("order_id").build()

        assertThat(params._pathParam(0)).isEqualTo("order_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
