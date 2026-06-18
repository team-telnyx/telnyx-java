// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RemediationRetrieveParamsTest {

    @Test
    fun create() {
        RemediationRetrieveParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .remediationId("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RemediationRetrieveParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .remediationId("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        assertThat(params._pathParam(1)).isEqualTo("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
