// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.logmessages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogMessageRetrieveParamsTest {

    @Test
    fun create() {
        LogMessageRetrieveParams.builder().id("1293384261075731499").build()
    }

    @Test
    fun pathParams() {
        val params = LogMessageRetrieveParams.builder().id("1293384261075731499").build()

        assertThat(params._pathParam(0)).isEqualTo("1293384261075731499")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
