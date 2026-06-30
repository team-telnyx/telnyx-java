// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.integrations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationRetrieveParamsTest {

    @Test
    fun create() {
        IntegrationRetrieveParams.builder().integrationId("integration_id").build()
    }

    @Test
    fun pathParams() {
        val params = IntegrationRetrieveParams.builder().integrationId("integration_id").build()

        assertThat(params._pathParam(0)).isEqualTo("integration_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
