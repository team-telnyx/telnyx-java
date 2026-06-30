// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.infringementclaims

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfringementClaimRetrieveParamsTest {

    @Test
    fun create() {
        InfringementClaimRetrieveParams.builder()
            .claimId("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InfringementClaimRetrieveParams.builder()
                .claimId("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
