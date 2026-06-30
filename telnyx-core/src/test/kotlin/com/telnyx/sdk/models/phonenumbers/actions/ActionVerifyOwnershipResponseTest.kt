// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionVerifyOwnershipResponseTest {

    @Test
    fun create() {
        val actionVerifyOwnershipResponse =
            ActionVerifyOwnershipResponse.builder()
                .data(
                    ActionVerifyOwnershipResponse.Data.builder()
                        .addFound(
                            ActionVerifyOwnershipResponse.Data.Found.builder()
                                .id("1293384261075731499")
                                .numberValE164("+15551234567")
                                .build()
                        )
                        .addNotFound("+15551234568")
                        .recordType("number_ownership_verification")
                        .build()
                )
                .build()

        assertThat(actionVerifyOwnershipResponse.data())
            .contains(
                ActionVerifyOwnershipResponse.Data.builder()
                    .addFound(
                        ActionVerifyOwnershipResponse.Data.Found.builder()
                            .id("1293384261075731499")
                            .numberValE164("+15551234567")
                            .build()
                    )
                    .addNotFound("+15551234568")
                    .recordType("number_ownership_verification")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionVerifyOwnershipResponse =
            ActionVerifyOwnershipResponse.builder()
                .data(
                    ActionVerifyOwnershipResponse.Data.builder()
                        .addFound(
                            ActionVerifyOwnershipResponse.Data.Found.builder()
                                .id("1293384261075731499")
                                .numberValE164("+15551234567")
                                .build()
                        )
                        .addNotFound("+15551234568")
                        .recordType("number_ownership_verification")
                        .build()
                )
                .build()

        val roundtrippedActionVerifyOwnershipResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionVerifyOwnershipResponse),
                jacksonTypeRef<ActionVerifyOwnershipResponse>(),
            )

        assertThat(roundtrippedActionVerifyOwnershipResponse)
            .isEqualTo(actionVerifyOwnershipResponse)
    }
}
