// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.managedaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagedAccountGetAllocatableGlobalOutboundChannelsResponseTest {

    @Test
    fun create() {
        val managedAccountGetAllocatableGlobalOutboundChannelsResponse =
            ManagedAccountGetAllocatableGlobalOutboundChannelsResponse.builder()
                .data(
                    ManagedAccountGetAllocatableGlobalOutboundChannelsResponse.Data.builder()
                        .allocatableGlobalOutboundChannels(500L)
                        .managedAccountAllowCustomPricing(false)
                        .recordType("allocatable_global_outbound_channels")
                        .totalGlobalChannelsAllocated(135L)
                        .build()
                )
                .build()

        assertThat(managedAccountGetAllocatableGlobalOutboundChannelsResponse.data())
            .contains(
                ManagedAccountGetAllocatableGlobalOutboundChannelsResponse.Data.builder()
                    .allocatableGlobalOutboundChannels(500L)
                    .managedAccountAllowCustomPricing(false)
                    .recordType("allocatable_global_outbound_channels")
                    .totalGlobalChannelsAllocated(135L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val managedAccountGetAllocatableGlobalOutboundChannelsResponse =
            ManagedAccountGetAllocatableGlobalOutboundChannelsResponse.builder()
                .data(
                    ManagedAccountGetAllocatableGlobalOutboundChannelsResponse.Data.builder()
                        .allocatableGlobalOutboundChannels(500L)
                        .managedAccountAllowCustomPricing(false)
                        .recordType("allocatable_global_outbound_channels")
                        .totalGlobalChannelsAllocated(135L)
                        .build()
                )
                .build()

        val roundtrippedManagedAccountGetAllocatableGlobalOutboundChannelsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    managedAccountGetAllocatableGlobalOutboundChannelsResponse
                ),
                jacksonTypeRef<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse>(),
            )

        assertThat(roundtrippedManagedAccountGetAllocatableGlobalOutboundChannelsResponse)
            .isEqualTo(managedAccountGetAllocatableGlobalOutboundChannelsResponse)
    }
}
