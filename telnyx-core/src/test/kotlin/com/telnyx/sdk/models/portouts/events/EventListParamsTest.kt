// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.events

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventListParamsTest {

    @Test
    fun create() {
        EventListParams.builder()
            .filter(
                EventListParams.Filter.builder()
                    .createdAt(
                        EventListParams.Filter.CreatedAt.builder()
                            .gte(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                            .lte(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                            .build()
                    )
                    .eventType(EventListParams.Filter.EventType.PORTOUT_STATUS_CHANGED)
                    .portoutId("34dc46a9-53ed-4e01-9454-26227ea13326")
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EventListParams.builder()
                .filter(
                    EventListParams.Filter.builder()
                        .createdAt(
                            EventListParams.Filter.CreatedAt.builder()
                                .gte(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                                .lte(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                                .build()
                        )
                        .eventType(EventListParams.Filter.EventType.PORTOUT_STATUS_CHANGED)
                        .portoutId("34dc46a9-53ed-4e01-9454-26227ea13326")
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[created_at][gte]", "2021-01-01T00:00:00Z")
                    .put("filter[created_at][lte]", "2021-01-01T00:00:00Z")
                    .put("filter[event_type]", "portout.status_changed")
                    .put("filter[portout_id]", "34dc46a9-53ed-4e01-9454-26227ea13326")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EventListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
