// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirDeleteResponseTest {

    @Test
    fun create() {
        val dirDeleteResponse =
            DirDeleteResponse.builder()
                .data(
                    DirDeleteResponse.Data.builder()
                        .id("16635d38-75a6-4481-82e8-69af60e05011")
                        .status(DirDeleteResponse.Data.Status.DELETE_REQUESTED)
                        .build()
                )
                .build()

        assertThat(dirDeleteResponse.data())
            .isEqualTo(
                DirDeleteResponse.Data.builder()
                    .id("16635d38-75a6-4481-82e8-69af60e05011")
                    .status(DirDeleteResponse.Data.Status.DELETE_REQUESTED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dirDeleteResponse =
            DirDeleteResponse.builder()
                .data(
                    DirDeleteResponse.Data.builder()
                        .id("16635d38-75a6-4481-82e8-69af60e05011")
                        .status(DirDeleteResponse.Data.Status.DELETE_REQUESTED)
                        .build()
                )
                .build()

        val roundtrippedDirDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dirDeleteResponse),
                jacksonTypeRef<DirDeleteResponse>(),
            )

        assertThat(roundtrippedDirDeleteResponse).isEqualTo(dirDeleteResponse)
    }
}
