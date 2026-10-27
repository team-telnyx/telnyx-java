// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.dedicatedips

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DedicatedIpListResponseTest {

    @Test
    fun create() {
        val dedicatedIpListResponse =
            DedicatedIpListResponse.builder()
                .addData(
                    DedicatedIp.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .billing(
                            DedicatedIp.Billing.builder()
                                .charged(true)
                                .status(DedicatedIp.Billing.Status.NOT_STARTED)
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dnsConfirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ipAddress("ip_address")
                        .ipVersion(DedicatedIp.IpVersion.IPV4)
                        .poolId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .provisioning(
                            DedicatedIp.Provisioning.builder()
                                .checklist(
                                    DedicatedIp.Provisioning.Checklist.builder()
                                        .forwardConfirmed(true)
                                        .ptrAuthored(true)
                                        .ptrMerged(true)
                                        .ptrRequested(true)
                                        .build()
                                )
                                .dnsStatus(DedicatedIp.Provisioning.DnsStatus.NOT_APPLICABLE)
                                .ptrRequestPrUrl("ptr_request_pr_url")
                                .ptrRequestState(DedicatedIp.Provisioning.PtrRequestState.PENDING)
                                .build()
                        )
                        .provisioningStatus(DedicatedIp.ProvisioningStatus.NOT_APPLICABLE)
                        .ptrHostname("ptr_hostname")
                        .quarantineUntil(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordType(DedicatedIp.RecordType.DEDICATED_IP)
                        .region("region")
                        .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(DedicatedIp.Status.PROVISIONING)
                        .suspensionReason("suspension_reason")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .warmup(
                            DedicatedIp.Warmup.builder()
                                .dailyCap(1L)
                                .paused(true)
                                .pausedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .progress(0L)
                                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .today(
                                    DedicatedIp.Warmup.Today.builder()
                                        .cap(0L)
                                        .day(LocalDate.parse("2019-12-27"))
                                        .granted(0L)
                                        .remaining(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(dedicatedIpListResponse.data())
            .containsExactly(
                DedicatedIp.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .billing(
                        DedicatedIp.Billing.builder()
                            .charged(true)
                            .status(DedicatedIp.Billing.Status.NOT_STARTED)
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dnsConfirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ipAddress("ip_address")
                    .ipVersion(DedicatedIp.IpVersion.IPV4)
                    .poolId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .provisioning(
                        DedicatedIp.Provisioning.builder()
                            .checklist(
                                DedicatedIp.Provisioning.Checklist.builder()
                                    .forwardConfirmed(true)
                                    .ptrAuthored(true)
                                    .ptrMerged(true)
                                    .ptrRequested(true)
                                    .build()
                            )
                            .dnsStatus(DedicatedIp.Provisioning.DnsStatus.NOT_APPLICABLE)
                            .ptrRequestPrUrl("ptr_request_pr_url")
                            .ptrRequestState(DedicatedIp.Provisioning.PtrRequestState.PENDING)
                            .build()
                    )
                    .provisioningStatus(DedicatedIp.ProvisioningStatus.NOT_APPLICABLE)
                    .ptrHostname("ptr_hostname")
                    .quarantineUntil(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recordType(DedicatedIp.RecordType.DEDICATED_IP)
                    .region("region")
                    .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(DedicatedIp.Status.PROVISIONING)
                    .suspensionReason("suspension_reason")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .warmup(
                        DedicatedIp.Warmup.builder()
                            .dailyCap(1L)
                            .paused(true)
                            .pausedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .progress(0L)
                            .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .today(
                                DedicatedIp.Warmup.Today.builder()
                                    .cap(0L)
                                    .day(LocalDate.parse("2019-12-27"))
                                    .granted(0L)
                                    .remaining(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dedicatedIpListResponse =
            DedicatedIpListResponse.builder()
                .addData(
                    DedicatedIp.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .billing(
                            DedicatedIp.Billing.builder()
                                .charged(true)
                                .status(DedicatedIp.Billing.Status.NOT_STARTED)
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dnsConfirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ipAddress("ip_address")
                        .ipVersion(DedicatedIp.IpVersion.IPV4)
                        .poolId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .provisioning(
                            DedicatedIp.Provisioning.builder()
                                .checklist(
                                    DedicatedIp.Provisioning.Checklist.builder()
                                        .forwardConfirmed(true)
                                        .ptrAuthored(true)
                                        .ptrMerged(true)
                                        .ptrRequested(true)
                                        .build()
                                )
                                .dnsStatus(DedicatedIp.Provisioning.DnsStatus.NOT_APPLICABLE)
                                .ptrRequestPrUrl("ptr_request_pr_url")
                                .ptrRequestState(DedicatedIp.Provisioning.PtrRequestState.PENDING)
                                .build()
                        )
                        .provisioningStatus(DedicatedIp.ProvisioningStatus.NOT_APPLICABLE)
                        .ptrHostname("ptr_hostname")
                        .quarantineUntil(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordType(DedicatedIp.RecordType.DEDICATED_IP)
                        .region("region")
                        .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(DedicatedIp.Status.PROVISIONING)
                        .suspensionReason("suspension_reason")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .warmup(
                            DedicatedIp.Warmup.builder()
                                .dailyCap(1L)
                                .paused(true)
                                .pausedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .progress(0L)
                                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .today(
                                    DedicatedIp.Warmup.Today.builder()
                                        .cap(0L)
                                        .day(LocalDate.parse("2019-12-27"))
                                        .granted(0L)
                                        .remaining(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedDedicatedIpListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dedicatedIpListResponse),
                jacksonTypeRef<DedicatedIpListResponse>(),
            )

        assertThat(roundtrippedDedicatedIpListResponse).isEqualTo(dedicatedIpListResponse)
    }
}
