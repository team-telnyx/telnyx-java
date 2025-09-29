// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texmlapplications

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlApplicationListParamsTest {

    @Test
    fun create() {
        TexmlApplicationListParams.builder()
            .filter(
                TexmlApplicationListParams.Filter.builder()
                    .friendlyName("friendly_name")
                    .outboundVoiceProfileId("1293384261075731499")
                    .build()
            )
            .page(TexmlApplicationListParams.Page.builder().number(1L).size(1L).build())
            .sort(TexmlApplicationListParams.Sort.FRIENDLY_NAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TexmlApplicationListParams.builder()
                .filter(
                    TexmlApplicationListParams.Filter.builder()
                        .friendlyName("friendly_name")
                        .outboundVoiceProfileId("1293384261075731499")
                        .build()
                )
                .page(TexmlApplicationListParams.Page.builder().number(1L).size(1L).build())
                .sort(TexmlApplicationListParams.Sort.FRIENDLY_NAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[friendly_name]", "friendly_name")
                    .put("filter[outbound_voice_profile_id]", "1293384261075731499")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "friendly_name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TexmlApplicationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
