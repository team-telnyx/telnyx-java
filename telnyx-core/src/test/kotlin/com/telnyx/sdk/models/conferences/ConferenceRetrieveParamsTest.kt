// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceRetrieveParamsTest {

    @Test
    fun create() {
        ConferenceRetrieveParams.builder()
            .id("id")
            .region(ConferenceRetrieveParams.Region.AUSTRALIA)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ConferenceRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ConferenceRetrieveParams.builder()
                .id("id")
                .region(ConferenceRetrieveParams.Region.AUSTRALIA)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("region", "Australia").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ConferenceRetrieveParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
