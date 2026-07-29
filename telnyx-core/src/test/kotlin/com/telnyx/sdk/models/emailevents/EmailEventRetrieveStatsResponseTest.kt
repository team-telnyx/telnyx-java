// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailEventRetrieveStatsResponseTest {

    @Test
    fun create() {
        val emailEventRetrieveStatsResponse =
            EmailEventRetrieveStatsResponse.builder()
                .data(
                    EmailEventRetrieveStatsResponse.Data.builder()
                        .counts(
                            EmailEventRetrieveStatsResponse.Data.Counts.builder()
                                .bounced(0L)
                                .clicked(0L)
                                .complained(0L)
                                .deferred(0L)
                                .delivered(0L)
                                .failed(0L)
                                .opened(0L)
                                .queued(0L)
                                .sent(0L)
                                .unsubscribed(0L)
                                .build()
                        )
                        .rates(
                            EmailEventRetrieveStatsResponse.Data.Rates.builder()
                                .bounceRate(0.0f)
                                .clickRate(0.0f)
                                .complaintRate(0.0f)
                                .deferredRate(0.0f)
                                .deliveryRate(0.0f)
                                .openRate(0.0f)
                                .build()
                        )
                        .recordType(
                            EmailEventRetrieveStatsResponse.Data.RecordType.EMAIL_EVENT_STATS
                        )
                        .timeRange(
                            TimeRange.builder()
                                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(emailEventRetrieveStatsResponse.data())
            .isEqualTo(
                EmailEventRetrieveStatsResponse.Data.builder()
                    .counts(
                        EmailEventRetrieveStatsResponse.Data.Counts.builder()
                            .bounced(0L)
                            .clicked(0L)
                            .complained(0L)
                            .deferred(0L)
                            .delivered(0L)
                            .failed(0L)
                            .opened(0L)
                            .queued(0L)
                            .sent(0L)
                            .unsubscribed(0L)
                            .build()
                    )
                    .rates(
                        EmailEventRetrieveStatsResponse.Data.Rates.builder()
                            .bounceRate(0.0f)
                            .clickRate(0.0f)
                            .complaintRate(0.0f)
                            .deferredRate(0.0f)
                            .deliveryRate(0.0f)
                            .openRate(0.0f)
                            .build()
                    )
                    .recordType(EmailEventRetrieveStatsResponse.Data.RecordType.EMAIL_EVENT_STATS)
                    .timeRange(
                        TimeRange.builder()
                            .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailEventRetrieveStatsResponse =
            EmailEventRetrieveStatsResponse.builder()
                .data(
                    EmailEventRetrieveStatsResponse.Data.builder()
                        .counts(
                            EmailEventRetrieveStatsResponse.Data.Counts.builder()
                                .bounced(0L)
                                .clicked(0L)
                                .complained(0L)
                                .deferred(0L)
                                .delivered(0L)
                                .failed(0L)
                                .opened(0L)
                                .queued(0L)
                                .sent(0L)
                                .unsubscribed(0L)
                                .build()
                        )
                        .rates(
                            EmailEventRetrieveStatsResponse.Data.Rates.builder()
                                .bounceRate(0.0f)
                                .clickRate(0.0f)
                                .complaintRate(0.0f)
                                .deferredRate(0.0f)
                                .deliveryRate(0.0f)
                                .openRate(0.0f)
                                .build()
                        )
                        .recordType(
                            EmailEventRetrieveStatsResponse.Data.RecordType.EMAIL_EVENT_STATS
                        )
                        .timeRange(
                            TimeRange.builder()
                                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedEmailEventRetrieveStatsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailEventRetrieveStatsResponse),
                jacksonTypeRef<EmailEventRetrieveStatsResponse>(),
            )

        assertThat(roundtrippedEmailEventRetrieveStatsResponse)
            .isEqualTo(emailEventRetrieveStatsResponse)
    }
}
