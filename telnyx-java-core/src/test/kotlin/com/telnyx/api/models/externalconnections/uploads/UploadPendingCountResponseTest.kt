// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections.uploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadPendingCountResponseTest {

    @Test
    fun create() {
        val uploadPendingCountResponse =
            UploadPendingCountResponse.builder()
                .data(
                    UploadPendingCountResponse.Data.builder()
                        .pendingNumbersCount(0L)
                        .pendingOrdersCount(0L)
                        .build()
                )
                .build()

        assertThat(uploadPendingCountResponse.data())
            .contains(
                UploadPendingCountResponse.Data.builder()
                    .pendingNumbersCount(0L)
                    .pendingOrdersCount(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uploadPendingCountResponse =
            UploadPendingCountResponse.builder()
                .data(
                    UploadPendingCountResponse.Data.builder()
                        .pendingNumbersCount(0L)
                        .pendingOrdersCount(0L)
                        .build()
                )
                .build()

        val roundtrippedUploadPendingCountResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadPendingCountResponse),
                jacksonTypeRef<UploadPendingCountResponse>(),
            )

        assertThat(roundtrippedUploadPendingCountResponse).isEqualTo(uploadPendingCountResponse)
    }
}
