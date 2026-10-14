// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberRetrieveOwnershipResponseTest {

    @Test
    fun create() {
        val numberRetrieveOwnershipResponse =
            NumberRetrieveOwnershipResponse.builder()
                .data(
                    NumberRetrieveOwnershipResponse.Data.builder()
                        .baselineCarrier("114J")
                        .baselineRecordedAt(OffsetDateTime.parse("2026-09-20T15:22:09Z"))
                        .confirmBy(null)
                        .flagReason(null)
                        .addHistory(
                            NumberRetrieveOwnershipResponse.Data.History.builder()
                                .eventType("check")
                                .occurredAt(OffsetDateTime.parse("2026-10-05T06:00:41Z"))
                                .outcome("unchanged")
                                .build()
                        )
                        .lastCheckedAt(OffsetDateTime.parse("2026-10-05T06:00:41Z"))
                        .ownershipStatus(ReputationOwnershipStatus.VERIFIED)
                        .phoneNumber("+19493253498")
                        .source(ReputationNumberSource.EXTERNAL)
                        .build()
                )
                .build()

        assertThat(numberRetrieveOwnershipResponse.data())
            .isEqualTo(
                NumberRetrieveOwnershipResponse.Data.builder()
                    .baselineCarrier("114J")
                    .baselineRecordedAt(OffsetDateTime.parse("2026-09-20T15:22:09Z"))
                    .confirmBy(null)
                    .flagReason(null)
                    .addHistory(
                        NumberRetrieveOwnershipResponse.Data.History.builder()
                            .eventType("check")
                            .occurredAt(OffsetDateTime.parse("2026-10-05T06:00:41Z"))
                            .outcome("unchanged")
                            .build()
                    )
                    .lastCheckedAt(OffsetDateTime.parse("2026-10-05T06:00:41Z"))
                    .ownershipStatus(ReputationOwnershipStatus.VERIFIED)
                    .phoneNumber("+19493253498")
                    .source(ReputationNumberSource.EXTERNAL)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberRetrieveOwnershipResponse =
            NumberRetrieveOwnershipResponse.builder()
                .data(
                    NumberRetrieveOwnershipResponse.Data.builder()
                        .baselineCarrier("114J")
                        .baselineRecordedAt(OffsetDateTime.parse("2026-09-20T15:22:09Z"))
                        .confirmBy(null)
                        .flagReason(null)
                        .addHistory(
                            NumberRetrieveOwnershipResponse.Data.History.builder()
                                .eventType("check")
                                .occurredAt(OffsetDateTime.parse("2026-10-05T06:00:41Z"))
                                .outcome("unchanged")
                                .build()
                        )
                        .lastCheckedAt(OffsetDateTime.parse("2026-10-05T06:00:41Z"))
                        .ownershipStatus(ReputationOwnershipStatus.VERIFIED)
                        .phoneNumber("+19493253498")
                        .source(ReputationNumberSource.EXTERNAL)
                        .build()
                )
                .build()

        val roundtrippedNumberRetrieveOwnershipResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberRetrieveOwnershipResponse),
                jacksonTypeRef<NumberRetrieveOwnershipResponse>(),
            )

        assertThat(roundtrippedNumberRetrieveOwnershipResponse)
            .isEqualTo(numberRetrieveOwnershipResponse)
    }
}
