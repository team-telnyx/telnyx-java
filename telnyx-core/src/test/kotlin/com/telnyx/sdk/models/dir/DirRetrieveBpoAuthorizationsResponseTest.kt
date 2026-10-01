// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.callreasons.BrandedCallingPaginationMeta
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirRetrieveBpoAuthorizationsResponseTest {

    @Test
    fun create() {
        val dirRetrieveBpoAuthorizationsResponse =
            DirRetrieveBpoAuthorizationsResponse.builder()
                .addData(
                    DirRetrieveBpoAuthorizationsResponse.Data.builder()
                        .bpoEnterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .recordType(
                            DirRetrieveBpoAuthorizationsResponse.Data.RecordType.BPO_AUTHORIZATION
                        )
                        .status(DirRetrieveBpoAuthorizationsResponse.Data.Status.PENDING)
                        .rejectionReason("Letter of Authorization is unsigned")
                        .build()
                )
                .meta(
                    BrandedCallingPaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(dirRetrieveBpoAuthorizationsResponse.data())
            .containsExactly(
                DirRetrieveBpoAuthorizationsResponse.Data.builder()
                    .bpoEnterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .recordType(
                        DirRetrieveBpoAuthorizationsResponse.Data.RecordType.BPO_AUTHORIZATION
                    )
                    .status(DirRetrieveBpoAuthorizationsResponse.Data.Status.PENDING)
                    .rejectionReason("Letter of Authorization is unsigned")
                    .build()
            )
        assertThat(dirRetrieveBpoAuthorizationsResponse.meta())
            .isEqualTo(
                BrandedCallingPaginationMeta.builder()
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
        val dirRetrieveBpoAuthorizationsResponse =
            DirRetrieveBpoAuthorizationsResponse.builder()
                .addData(
                    DirRetrieveBpoAuthorizationsResponse.Data.builder()
                        .bpoEnterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .recordType(
                            DirRetrieveBpoAuthorizationsResponse.Data.RecordType.BPO_AUTHORIZATION
                        )
                        .status(DirRetrieveBpoAuthorizationsResponse.Data.Status.PENDING)
                        .rejectionReason("Letter of Authorization is unsigned")
                        .build()
                )
                .meta(
                    BrandedCallingPaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedDirRetrieveBpoAuthorizationsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dirRetrieveBpoAuthorizationsResponse),
                jacksonTypeRef<DirRetrieveBpoAuthorizationsResponse>(),
            )

        assertThat(roundtrippedDirRetrieveBpoAuthorizationsResponse)
            .isEqualTo(dirRetrieveBpoAuthorizationsResponse)
    }
}
