// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ledgerbillinggroupreports

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerBillingGroupReportRetrieveParamsTest {

    @Test
    fun create() {
        LedgerBillingGroupReportRetrieveParams.builder()
            .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LedgerBillingGroupReportRetrieveParams.builder()
                .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("f5586561-8ff0-4291-a0ac-84fe544797bd")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
