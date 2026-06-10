// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirListDocumentTypesResponseTest {

    @Test
    fun create() {
        val dirListDocumentTypesResponse =
            DirListDocumentTypesResponse.builder()
                .addData(
                    DirListDocumentTypesResponse.Data.builder()
                        .description(
                            "Signed authorization from the DIR owner permitting Telnyx to register the DIR and its associated numbers on their behalf"
                        )
                        .shortName("letter_of_authorization")
                        .build()
                )
                .meta(
                    DirListDocumentTypesResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(dirListDocumentTypesResponse.data())
            .containsExactly(
                DirListDocumentTypesResponse.Data.builder()
                    .description(
                        "Signed authorization from the DIR owner permitting Telnyx to register the DIR and its associated numbers on their behalf"
                    )
                    .shortName("letter_of_authorization")
                    .build()
            )
        assertThat(dirListDocumentTypesResponse.meta())
            .isEqualTo(
                DirListDocumentTypesResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(3L)
                    .totalResults(42L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dirListDocumentTypesResponse =
            DirListDocumentTypesResponse.builder()
                .addData(
                    DirListDocumentTypesResponse.Data.builder()
                        .description(
                            "Signed authorization from the DIR owner permitting Telnyx to register the DIR and its associated numbers on their behalf"
                        )
                        .shortName("letter_of_authorization")
                        .build()
                )
                .meta(
                    DirListDocumentTypesResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedDirListDocumentTypesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dirListDocumentTypesResponse),
                jacksonTypeRef<DirListDocumentTypesResponse>(),
            )

        assertThat(roundtrippedDirListDocumentTypesResponse).isEqualTo(dirListDocumentTypesResponse)
    }
}
