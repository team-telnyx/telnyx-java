// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.uploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadRefreshStatusResponseTest {

    @Test
    fun create() {
        val uploadRefreshStatusResponse =
            UploadRefreshStatusResponse.builder().success(true).build()

        assertThat(uploadRefreshStatusResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uploadRefreshStatusResponse =
            UploadRefreshStatusResponse.builder().success(true).build()

        val roundtrippedUploadRefreshStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadRefreshStatusResponse),
                jacksonTypeRef<UploadRefreshStatusResponse>(),
            )

        assertThat(roundtrippedUploadRefreshStatusResponse).isEqualTo(uploadRefreshStatusResponse)
    }
}
