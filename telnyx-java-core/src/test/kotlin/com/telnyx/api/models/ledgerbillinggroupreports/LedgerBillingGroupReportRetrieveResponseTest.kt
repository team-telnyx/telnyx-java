// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ledgerbillinggroupreports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerBillingGroupReportRetrieveResponseTest {

    @Test
    fun create() {
        val ledgerBillingGroupReportRetrieveResponse =
            LedgerBillingGroupReportRetrieveResponse.builder()
                .data(
                    LedgerBillingGroupReport.builder()
                        .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .organizationId("f5586561-8ff0-4291-a0ac-84fe544797bd")
                        .recordType(LedgerBillingGroupReport.RecordType.LEDGER_BILLING_GROUP_REPORT)
                        .reportUrl("https://example.com")
                        .status(LedgerBillingGroupReport.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .build()

        assertThat(ledgerBillingGroupReportRetrieveResponse.data())
            .contains(
                LedgerBillingGroupReport.builder()
                    .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .organizationId("f5586561-8ff0-4291-a0ac-84fe544797bd")
                    .recordType(LedgerBillingGroupReport.RecordType.LEDGER_BILLING_GROUP_REPORT)
                    .reportUrl("https://example.com")
                    .status(LedgerBillingGroupReport.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerBillingGroupReportRetrieveResponse =
            LedgerBillingGroupReportRetrieveResponse.builder()
                .data(
                    LedgerBillingGroupReport.builder()
                        .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .organizationId("f5586561-8ff0-4291-a0ac-84fe544797bd")
                        .recordType(LedgerBillingGroupReport.RecordType.LEDGER_BILLING_GROUP_REPORT)
                        .reportUrl("https://example.com")
                        .status(LedgerBillingGroupReport.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .build()

        val roundtrippedLedgerBillingGroupReportRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerBillingGroupReportRetrieveResponse),
                jacksonTypeRef<LedgerBillingGroupReportRetrieveResponse>(),
            )

        assertThat(roundtrippedLedgerBillingGroupReportRetrieveResponse)
            .isEqualTo(ledgerBillingGroupReportRetrieveResponse)
    }
}
