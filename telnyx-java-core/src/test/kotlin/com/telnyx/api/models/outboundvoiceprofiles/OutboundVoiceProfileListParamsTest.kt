// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.outboundvoiceprofiles

import com.telnyx.api.core.http.QueryParams
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
            .page(OutboundVoiceProfileListParams.Page.builder().number(1L).size(1L).build())
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
                .page(OutboundVoiceProfileListParams.Page.builder().number(1L).size(1L).build())
                .sort(OutboundVoiceProfileListParams.Sort.NAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name][contains]", "office-profile")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
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
