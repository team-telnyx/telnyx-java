// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalConnectionListParamsTest {

    @Test
    fun create() {
        ExternalConnectionListParams.builder()
            .filter(
                ExternalConnectionListParams.Filter.builder()
                    .id("1930241863466354012")
                    .connectionName(
                        ExternalConnectionListParams.Filter.ConnectionName.builder()
                            .contains("My Connection")
                            .build()
                    )
                    .createdAt("2022-12-31")
                    .externalSipConnection(
                        ExternalConnectionListParams.Filter.ExternalSipConnection.ZOOM
                    )
                    .phoneNumber(
                        ExternalConnectionListParams.Filter.PhoneNumber.builder()
                            .contains("+15555555555")
                            .build()
                    )
                    .build()
            )
            .page(ExternalConnectionListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExternalConnectionListParams.builder()
                .filter(
                    ExternalConnectionListParams.Filter.builder()
                        .id("1930241863466354012")
                        .connectionName(
                            ExternalConnectionListParams.Filter.ConnectionName.builder()
                                .contains("My Connection")
                                .build()
                        )
                        .createdAt("2022-12-31")
                        .externalSipConnection(
                            ExternalConnectionListParams.Filter.ExternalSipConnection.ZOOM
                        )
                        .phoneNumber(
                            ExternalConnectionListParams.Filter.PhoneNumber.builder()
                                .contains("+15555555555")
                                .build()
                        )
                        .build()
                )
                .page(ExternalConnectionListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[id]", "1930241863466354012")
                    .put("filter[connection_name][contains]", "My Connection")
                    .put("filter[created_at]", "2022-12-31")
                    .put("filter[external_sip_connection]", "zoom")
                    .put("filter[phone_number][contains]", "+15555555555")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExternalConnectionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
