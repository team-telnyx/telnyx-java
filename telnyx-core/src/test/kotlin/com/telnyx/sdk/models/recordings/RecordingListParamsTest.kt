// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.recordings

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingListParamsTest {

    @Test
    fun create() {
        RecordingListParams.builder()
            .filter(
                RecordingListParams.Filter.builder()
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .conferenceId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .connectionId("175237942907135762")
                    .createdAt(
                        RecordingListParams.Filter.CreatedAt.builder()
                            .gte("2019-03-29T11:10:00Z")
                            .lte("2019-03-29T11:10:00Z")
                            .build()
                    )
                    .from("1234567890")
                    .sipCallId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .to("1234567890")
                    .build()
            )
            .page(RecordingListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RecordingListParams.builder()
                .filter(
                    RecordingListParams.Filter.builder()
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .conferenceId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .connectionId("175237942907135762")
                        .createdAt(
                            RecordingListParams.Filter.CreatedAt.builder()
                                .gte("2019-03-29T11:10:00Z")
                                .lte("2019-03-29T11:10:00Z")
                                .build()
                        )
                        .from("1234567890")
                        .sipCallId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .to("1234567890")
                        .build()
                )
                .page(RecordingListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[call_leg_id]", "428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .put("filter[call_session_id]", "428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .put("filter[conference_id]", "428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .put("filter[connection_id]", "175237942907135762")
                    .put("filter[created_at][gte]", "2019-03-29T11:10:00Z")
                    .put("filter[created_at][lte]", "2019-03-29T11:10:00Z")
                    .put("filter[from]", "1234567890")
                    .put("filter[sip_call_id]", "428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .put("filter[to]", "1234567890")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RecordingListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
