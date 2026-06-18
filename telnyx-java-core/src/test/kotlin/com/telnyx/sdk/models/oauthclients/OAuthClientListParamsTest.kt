// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauthclients

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthClientListParamsTest {

    @Test
    fun create() {
        OAuthClientListParams.builder()
            .filterAllowedGrantTypesContains(
                OAuthClientListParams.FilterAllowedGrantTypesContains.CLIENT_CREDENTIALS
            )
            .filterClientId("filter[client_id]")
            .filterClientType(OAuthClientListParams.FilterClientType.CONFIDENTIAL)
            .filterName("filter[name]")
            .filterNameContains("filter[name][contains]")
            .filterVerified(true)
            .pageNumber(1L)
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OAuthClientListParams.builder()
                .filterAllowedGrantTypesContains(
                    OAuthClientListParams.FilterAllowedGrantTypesContains.CLIENT_CREDENTIALS
                )
                .filterClientId("filter[client_id]")
                .filterClientType(OAuthClientListParams.FilterClientType.CONFIDENTIAL)
                .filterName("filter[name]")
                .filterNameContains("filter[name][contains]")
                .filterVerified(true)
                .pageNumber(1L)
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[allowed_grant_types][contains]", "client_credentials")
                    .put("filter[client_id]", "filter[client_id]")
                    .put("filter[client_type]", "confidential")
                    .put("filter[name]", "filter[name]")
                    .put("filter[name][contains]", "filter[name][contains]")
                    .put("filter[verified]", "true")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OAuthClientListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
