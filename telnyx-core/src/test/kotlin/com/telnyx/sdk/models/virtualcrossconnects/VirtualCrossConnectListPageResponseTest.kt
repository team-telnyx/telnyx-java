// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.models.networks.InterfaceStatus
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectListPageResponseTest {

    @Test
    fun create() {
        val virtualCrossConnectListPageResponse =
            VirtualCrossConnectListPageResponse.builder()
                .addData(
                    VirtualCrossConnectListResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .regionCode("ashburn-va")
                        .bandwidthMbps(50.0)
                        .bgpAsn(1234.0)
                        .cloudProvider(VirtualCrossConnectListResponse.CloudProvider.AWS)
                        .cloudProviderRegion("us-east-1")
                        .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                        .primaryCloudAccountId("123456789012")
                        .primaryCloudIp("169.254.0.2")
                        .primaryEnabled(true)
                        .primaryRoutingAnnouncement(false)
                        .primaryTelnyxIp("169.254.0.1")
                        .region(
                            VirtualCrossConnectListResponse.Region.builder()
                                .code("ashburn-va")
                                .name("Ashburn")
                                .recordType("region")
                                .build()
                        )
                        .secondaryBgpKey("ge1lONeK9RcA83uuWaw9DvZy")
                        .secondaryCloudAccountId("")
                        .secondaryCloudIp("169.254.0.4")
                        .secondaryEnabled(true)
                        .secondaryRoutingAnnouncement(false)
                        .secondaryTelnyxIp("169.254.0.3")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(virtualCrossConnectListPageResponse.data().getOrNull())
            .containsExactly(
                VirtualCrossConnectListResponse.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test interface")
                    .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(InterfaceStatus.PROVISIONED)
                    .regionCode("ashburn-va")
                    .bandwidthMbps(50.0)
                    .bgpAsn(1234.0)
                    .cloudProvider(VirtualCrossConnectListResponse.CloudProvider.AWS)
                    .cloudProviderRegion("us-east-1")
                    .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                    .primaryCloudAccountId("123456789012")
                    .primaryCloudIp("169.254.0.2")
                    .primaryEnabled(true)
                    .primaryRoutingAnnouncement(false)
                    .primaryTelnyxIp("169.254.0.1")
                    .region(
                        VirtualCrossConnectListResponse.Region.builder()
                            .code("ashburn-va")
                            .name("Ashburn")
                            .recordType("region")
                            .build()
                    )
                    .secondaryBgpKey("ge1lONeK9RcA83uuWaw9DvZy")
                    .secondaryCloudAccountId("")
                    .secondaryCloudIp("169.254.0.4")
                    .secondaryEnabled(true)
                    .secondaryRoutingAnnouncement(false)
                    .secondaryTelnyxIp("169.254.0.3")
                    .build()
            )
        assertThat(virtualCrossConnectListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val virtualCrossConnectListPageResponse =
            VirtualCrossConnectListPageResponse.builder()
                .addData(
                    VirtualCrossConnectListResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .regionCode("ashburn-va")
                        .bandwidthMbps(50.0)
                        .bgpAsn(1234.0)
                        .cloudProvider(VirtualCrossConnectListResponse.CloudProvider.AWS)
                        .cloudProviderRegion("us-east-1")
                        .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                        .primaryCloudAccountId("123456789012")
                        .primaryCloudIp("169.254.0.2")
                        .primaryEnabled(true)
                        .primaryRoutingAnnouncement(false)
                        .primaryTelnyxIp("169.254.0.1")
                        .region(
                            VirtualCrossConnectListResponse.Region.builder()
                                .code("ashburn-va")
                                .name("Ashburn")
                                .recordType("region")
                                .build()
                        )
                        .secondaryBgpKey("ge1lONeK9RcA83uuWaw9DvZy")
                        .secondaryCloudAccountId("")
                        .secondaryCloudIp("169.254.0.4")
                        .secondaryEnabled(true)
                        .secondaryRoutingAnnouncement(false)
                        .secondaryTelnyxIp("169.254.0.3")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedVirtualCrossConnectListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(virtualCrossConnectListPageResponse),
                jacksonTypeRef<VirtualCrossConnectListPageResponse>(),
            )

        assertThat(roundtrippedVirtualCrossConnectListPageResponse)
            .isEqualTo(virtualCrossConnectListPageResponse)
    }
}
