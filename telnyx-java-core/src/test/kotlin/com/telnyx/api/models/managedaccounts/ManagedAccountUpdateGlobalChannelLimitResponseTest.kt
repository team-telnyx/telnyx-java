// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.managedaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagedAccountUpdateGlobalChannelLimitResponseTest {

    @Test
    fun create() {
        val managedAccountUpdateGlobalChannelLimitResponse =
            ManagedAccountUpdateGlobalChannelLimitResponse.builder()
                .data(
                    ManagedAccountUpdateGlobalChannelLimitResponse.Data.builder()
                        .id("096abcde-1122-3344-ab77-ff0123456789")
                        .channelLimit(30L)
                        .email("allocate_demo@customer.com")
                        .managerAccountId("beeabcde-1122-3344-ab77-ff0123456789")
                        .recordType("managed_account_global_outbound_settings")
                        .build()
                )
                .build()

        assertThat(managedAccountUpdateGlobalChannelLimitResponse.data())
            .contains(
                ManagedAccountUpdateGlobalChannelLimitResponse.Data.builder()
                    .id("096abcde-1122-3344-ab77-ff0123456789")
                    .channelLimit(30L)
                    .email("allocate_demo@customer.com")
                    .managerAccountId("beeabcde-1122-3344-ab77-ff0123456789")
                    .recordType("managed_account_global_outbound_settings")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val managedAccountUpdateGlobalChannelLimitResponse =
            ManagedAccountUpdateGlobalChannelLimitResponse.builder()
                .data(
                    ManagedAccountUpdateGlobalChannelLimitResponse.Data.builder()
                        .id("096abcde-1122-3344-ab77-ff0123456789")
                        .channelLimit(30L)
                        .email("allocate_demo@customer.com")
                        .managerAccountId("beeabcde-1122-3344-ab77-ff0123456789")
                        .recordType("managed_account_global_outbound_settings")
                        .build()
                )
                .build()

        val roundtrippedManagedAccountUpdateGlobalChannelLimitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(managedAccountUpdateGlobalChannelLimitResponse),
                jacksonTypeRef<ManagedAccountUpdateGlobalChannelLimitResponse>(),
            )

        assertThat(roundtrippedManagedAccountUpdateGlobalChannelLimitResponse)
            .isEqualTo(managedAccountUpdateGlobalChannelLimitResponse)
    }
}
