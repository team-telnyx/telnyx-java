// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ledgerbillinggroupreports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerBillingGroupReportCreateResponseTest {

    @Test
    fun create() {
        val ledgerBillingGroupReportCreateResponse =
            LedgerBillingGroupReportCreateResponse.builder()
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

        assertThat(ledgerBillingGroupReportCreateResponse.data())
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
        val ledgerBillingGroupReportCreateResponse =
            LedgerBillingGroupReportCreateResponse.builder()
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

        val roundtrippedLedgerBillingGroupReportCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerBillingGroupReportCreateResponse),
                jacksonTypeRef<LedgerBillingGroupReportCreateResponse>(),
            )

        assertThat(roundtrippedLedgerBillingGroupReportCreateResponse)
            .isEqualTo(ledgerBillingGroupReportCreateResponse)
    }
}
