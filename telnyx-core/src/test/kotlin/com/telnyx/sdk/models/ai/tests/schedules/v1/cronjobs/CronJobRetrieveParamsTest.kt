// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CronJobRetrieveParamsTest {

    @Test
    fun create() {
        CronJobRetrieveParams.builder().id(0L).build()
    }

    @Test
    fun pathParams() {
        val params = CronJobRetrieveParams.builder().id(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
