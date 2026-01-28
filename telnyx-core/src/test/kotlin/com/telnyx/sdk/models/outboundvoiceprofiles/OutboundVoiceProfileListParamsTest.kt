// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.outboundvoiceprofiles

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutboundVoiceProfileListParamsTest {

    @Test
    fun create() {
        OutboundVoiceProfileListParams.builder()
            .filter(
                OutboundVoiceProfileListParams.Filter.builder()
                    .name(
                        OutboundVoiceProfileListParams.Filter.Name.builder()
                            .contains("office-profile")
                            .build()
                    )
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .sort(OutboundVoiceProfileListParams.Sort.NAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OutboundVoiceProfileListParams.builder()
                .filter(
                    OutboundVoiceProfileListParams.Filter.builder()
                        .name(
                            OutboundVoiceProfileListParams.Filter.Name.builder()
                                .contains("office-profile")
                                .build()
                        )
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .sort(OutboundVoiceProfileListParams.Sort.NAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name][contains]", "office-profile")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("sort", "name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OutboundVoiceProfileListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
