// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceListParticipantsParamsTest {

    @Test
    fun create() {
        ConferenceListParticipantsParams.builder()
            .conferenceId("conference_id")
            .filter(
                ConferenceListParticipantsParams.Filter.builder()
                    .muted(true)
                    .onHold(true)
                    .whispering(true)
                    .build()
            )
            .page(
                ConferenceListParticipantsParams.Page.builder()
                    .after("after")
                    .before("before")
                    .limit(1L)
                    .number(1L)
                    .size(1L)
                    .build()
            )
            .region(ConferenceListParticipantsParams.Region.AUSTRALIA)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConferenceListParticipantsParams.builder().conferenceId("conference_id").build()

        assertThat(params._pathParam(0)).isEqualTo("conference_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ConferenceListParticipantsParams.builder()
                .conferenceId("conference_id")
                .filter(
                    ConferenceListParticipantsParams.Filter.builder()
                        .muted(true)
                        .onHold(true)
                        .whispering(true)
                        .build()
                )
                .page(
                    ConferenceListParticipantsParams.Page.builder()
                        .after("after")
                        .before("before")
                        .limit(1L)
                        .number(1L)
                        .size(1L)
                        .build()
                )
                .region(ConferenceListParticipantsParams.Region.AUSTRALIA)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[muted]", "true")
                    .put("filter[on_hold]", "true")
                    .put("filter[whispering]", "true")
                    .put("page[after]", "after")
                    .put("page[before]", "before")
                    .put("page[limit]", "1")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("region", "Australia")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ConferenceListParticipantsParams.builder().conferenceId("conference_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
