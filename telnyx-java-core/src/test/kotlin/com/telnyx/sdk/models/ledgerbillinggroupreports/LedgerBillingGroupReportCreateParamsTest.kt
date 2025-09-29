// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ledgerbillinggroupreports

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerBillingGroupReportCreateParamsTest {

    @Test
    fun create() {
        LedgerBillingGroupReportCreateParams.builder().month(10L).year(2019L).build()
    }

    @Test
    fun body() {
        val params = LedgerBillingGroupReportCreateParams.builder().month(10L).year(2019L).build()

        val body = params._body()

        assertThat(body.month()).contains(10L)
        assertThat(body.year()).contains(2019L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LedgerBillingGroupReportCreateParams.builder().build()

        val body = params._body()
    }
}
