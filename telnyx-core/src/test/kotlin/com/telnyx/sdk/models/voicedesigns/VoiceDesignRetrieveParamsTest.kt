// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceDesignRetrieveParamsTest {

    @Test
    fun create() {
        VoiceDesignRetrieveParams.builder().id("id").version(1L).build()
    }

    @Test
    fun pathParams() {
        val params = VoiceDesignRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = VoiceDesignRetrieveParams.builder().id("id").version(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("version", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VoiceDesignRetrieveParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
