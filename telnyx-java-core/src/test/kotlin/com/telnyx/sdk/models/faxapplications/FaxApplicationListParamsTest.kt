// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxapplications

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxApplicationListParamsTest {

    @Test
    fun create() {
        FaxApplicationListParams.builder()
            .filter(
                FaxApplicationListParams.Filter.builder()
                    .applicationName(
                        FaxApplicationListParams.Filter.ApplicationName.builder()
                            .contains("fax-app")
                            .build()
                    )
                    .outboundVoiceProfileId("1293384261075731499")
                    .build()
            )
            .page(FaxApplicationListParams.Page.builder().number(1L).size(1L).build())
            .sort(FaxApplicationListParams.Sort.APPLICATION_NAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FaxApplicationListParams.builder()
                .filter(
                    FaxApplicationListParams.Filter.builder()
                        .applicationName(
                            FaxApplicationListParams.Filter.ApplicationName.builder()
                                .contains("fax-app")
                                .build()
                        )
                        .outboundVoiceProfileId("1293384261075731499")
                        .build()
                )
                .page(FaxApplicationListParams.Page.builder().number(1L).size(1L).build())
                .sort(FaxApplicationListParams.Sort.APPLICATION_NAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[application_name][contains]", "fax-app")
                    .put("filter[outbound_voice_profile_id]", "1293384261075731499")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "application_name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FaxApplicationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
