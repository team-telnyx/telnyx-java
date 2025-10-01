// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.credentialconnections

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialConnectionListParamsTest {

    @Test
    fun create() {
        CredentialConnectionListParams.builder()
            .filter(
                CredentialConnectionListParams.Filter.builder()
                    .connectionName(
                        CredentialConnectionListParams.Filter.ConnectionName.builder()
                            .contains("contains")
                            .build()
                    )
                    .fqdn("fqdn")
                    .outboundVoiceProfileId("outbound_voice_profile_id")
                    .build()
            )
            .page(CredentialConnectionListParams.Page.builder().number(1L).size(1L).build())
            .sort(CredentialConnectionListParams.Sort.CONNECTION_NAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CredentialConnectionListParams.builder()
                .filter(
                    CredentialConnectionListParams.Filter.builder()
                        .connectionName(
                            CredentialConnectionListParams.Filter.ConnectionName.builder()
                                .contains("contains")
                                .build()
                        )
                        .fqdn("fqdn")
                        .outboundVoiceProfileId("outbound_voice_profile_id")
                        .build()
                )
                .page(CredentialConnectionListParams.Page.builder().number(1L).size(1L).build())
                .sort(CredentialConnectionListParams.Sort.CONNECTION_NAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[connection_name][contains]", "contains")
                    .put("filter[fqdn]", "fqdn")
                    .put("filter[outbound_voice_profile_id]", "outbound_voice_profile_id")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "connection_name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CredentialConnectionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
