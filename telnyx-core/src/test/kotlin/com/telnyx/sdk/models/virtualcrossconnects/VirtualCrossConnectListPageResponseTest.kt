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
                    VirtualCrossConnectCombined.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .bandwidthMbps(50.0)
                        .bgpAsn(1234.0)
                        .cloudProvider(VirtualCrossConnectCombined.CloudProvider.AWS)
                        .cloudProviderRegion("us-east-1")
                        .createdAt("created_at")
                        .name("name")
                        .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                        .primaryCloudAccountId("123456789012")
                        .primaryCloudIp("169.254.0.2")
                        .primaryEnabled(true)
                        .primaryRoutingAnnouncement(true)
                        .primaryTelnyxIp("169.254.0.1")
                        .recordType("virtual_cross_connect")
                        .region(
                            VirtualCrossConnectCombined.Region.builder()
                                .code("ashburn-va")
                                .name("Ashburn")
                                .recordType("region")
                                .build()
                        )
                        .regionCode("region_code")
                        .status(InterfaceStatus.PROVISIONED)
                        .updatedAt("updated_at")
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
                VirtualCrossConnectCombined.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .bandwidthMbps(50.0)
                    .bgpAsn(1234.0)
                    .cloudProvider(VirtualCrossConnectCombined.CloudProvider.AWS)
                    .cloudProviderRegion("us-east-1")
                    .createdAt("created_at")
                    .name("name")
                    .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                    .primaryCloudAccountId("123456789012")
                    .primaryCloudIp("169.254.0.2")
                    .primaryEnabled(true)
                    .primaryRoutingAnnouncement(true)
                    .primaryTelnyxIp("169.254.0.1")
                    .recordType("virtual_cross_connect")
                    .region(
                        VirtualCrossConnectCombined.Region.builder()
                            .code("ashburn-va")
                            .name("Ashburn")
                            .recordType("region")
                            .build()
                    )
                    .regionCode("region_code")
                    .status(InterfaceStatus.PROVISIONED)
                    .updatedAt("updated_at")
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
                    VirtualCrossConnectCombined.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .bandwidthMbps(50.0)
                        .bgpAsn(1234.0)
                        .cloudProvider(VirtualCrossConnectCombined.CloudProvider.AWS)
                        .cloudProviderRegion("us-east-1")
                        .createdAt("created_at")
                        .name("name")
                        .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                        .primaryCloudAccountId("123456789012")
                        .primaryCloudIp("169.254.0.2")
                        .primaryEnabled(true)
                        .primaryRoutingAnnouncement(true)
                        .primaryTelnyxIp("169.254.0.1")
                        .recordType("virtual_cross_connect")
                        .region(
                            VirtualCrossConnectCombined.Region.builder()
                                .code("ashburn-va")
                                .name("Ashburn")
                                .recordType("region")
                                .build()
                        )
                        .regionCode("region_code")
                        .status(InterfaceStatus.PROVISIONED)
                        .updatedAt("updated_at")
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
