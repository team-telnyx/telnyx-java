// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.scheduledevents

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledEventListParamsTest {

    @Test
    fun create() {
        ScheduledEventListParams.builder()
            .assistantId("assistant_id")
            .conversationChannel(ConversationChannelType.PHONE_CALL)
            .fromDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .pageNumber(0L)
            .pageSize(0L)
            .toDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = ScheduledEventListParams.builder().assistantId("assistant_id").build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ScheduledEventListParams.builder()
                .assistantId("assistant_id")
                .conversationChannel(ConversationChannelType.PHONE_CALL)
                .fromDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pageNumber(0L)
                .pageSize(0L)
                .toDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("conversation_channel", "phone_call")
                    .put("from_date", "2019-12-27T18:11:19.117Z")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("to_date", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ScheduledEventListParams.builder().assistantId("assistant_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
