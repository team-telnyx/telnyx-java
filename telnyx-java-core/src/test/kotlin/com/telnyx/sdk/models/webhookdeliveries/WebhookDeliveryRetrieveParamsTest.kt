// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhookdeliveries

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookDeliveryRetrieveParamsTest {

    @Test
    fun create() {
        WebhookDeliveryRetrieveParams.builder().id("C9C0797E-901D-4349-A33C-C2C8F31A92C2").build()
    }

    @Test
    fun pathParams() {
        val params =
            WebhookDeliveryRetrieveParams.builder()
                .id("C9C0797E-901D-4349-A33C-C2C8F31A92C2")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("C9C0797E-901D-4349-A33C-C2C8F31A92C2")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
