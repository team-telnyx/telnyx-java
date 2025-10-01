// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.sessions

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionRetrieveParamsTest {

    @Test
    fun create() {
        SessionRetrieveParams.builder()
            .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
            .includeParticipants(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionRetrieveParams.builder()
                .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SessionRetrieveParams.builder()
                .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .includeParticipants(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("include_participants", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SessionRetrieveParams.builder()
                .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
