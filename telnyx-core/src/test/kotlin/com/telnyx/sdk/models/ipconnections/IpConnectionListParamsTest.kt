// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ipconnections

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpConnectionListParamsTest {

    @Test
    fun create() {
        IpConnectionListParams.builder()
            .filter(
                IpConnectionListParams.Filter.builder()
                    .connectionName(
                        IpConnectionListParams.Filter.ConnectionName.builder()
                            .contains("contains")
                            .build()
                    )
                    .fqdn("fqdn")
                    .outboundVoiceProfileId("1293384261075731499")
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .sort(IpConnectionListParams.Sort.CONNECTION_NAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IpConnectionListParams.builder()
                .filter(
                    IpConnectionListParams.Filter.builder()
                        .connectionName(
                            IpConnectionListParams.Filter.ConnectionName.builder()
                                .contains("contains")
                                .build()
                        )
                        .fqdn("fqdn")
                        .outboundVoiceProfileId("1293384261075731499")
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .sort(IpConnectionListParams.Sort.CONNECTION_NAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[connection_name][contains]", "contains")
                    .put("filter[fqdn]", "fqdn")
                    .put("filter[outbound_voice_profile_id]", "1293384261075731499")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("sort", "connection_name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = IpConnectionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
