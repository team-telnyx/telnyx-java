// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ledgerbillinggroupreports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerBillingGroupReportTest {

    @Test
    fun create() {
        val ledgerBillingGroupReport =
            LedgerBillingGroupReport.builder()
                .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .organizationId("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .recordType(LedgerBillingGroupReport.RecordType.LEDGER_BILLING_GROUP_REPORT)
                .reportUrl("https://example.com")
                .status(LedgerBillingGroupReport.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .build()

        assertThat(ledgerBillingGroupReport.id()).contains("f5586561-8ff0-4291-a0ac-84fe544797bd")
        assertThat(ledgerBillingGroupReport.createdAt())
            .contains(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
        assertThat(ledgerBillingGroupReport.organizationId())
            .contains("f5586561-8ff0-4291-a0ac-84fe544797bd")
        assertThat(ledgerBillingGroupReport.recordType())
            .contains(LedgerBillingGroupReport.RecordType.LEDGER_BILLING_GROUP_REPORT)
        assertThat(ledgerBillingGroupReport.reportUrl()).contains("https://example.com")
        assertThat(ledgerBillingGroupReport.status())
            .contains(LedgerBillingGroupReport.Status.PENDING)
        assertThat(ledgerBillingGroupReport.updatedAt())
            .contains(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerBillingGroupReport =
            LedgerBillingGroupReport.builder()
                .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .organizationId("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .recordType(LedgerBillingGroupReport.RecordType.LEDGER_BILLING_GROUP_REPORT)
                .reportUrl("https://example.com")
                .status(LedgerBillingGroupReport.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .build()

        val roundtrippedLedgerBillingGroupReport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerBillingGroupReport),
                jacksonTypeRef<LedgerBillingGroupReport>(),
            )

        assertThat(roundtrippedLedgerBillingGroupReport).isEqualTo(ledgerBillingGroupReport)
    }
}
