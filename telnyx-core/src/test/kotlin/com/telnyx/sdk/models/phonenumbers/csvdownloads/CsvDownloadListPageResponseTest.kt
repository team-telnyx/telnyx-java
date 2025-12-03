// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.csvdownloads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CsvDownloadListPageResponseTest {

    @Test
    fun create() {
        val csvDownloadListPageResponse =
            CsvDownloadListPageResponse.builder()
                .addData(
                    CsvDownload.builder()
                        .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                        .recordType("csv_download")
                        .status(CsvDownload.Status.PENDING)
                        .url("https://www.telnyx.com/sample/42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(csvDownloadListPageResponse.data().getOrNull())
            .containsExactly(
                CsvDownload.builder()
                    .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                    .recordType("csv_download")
                    .status(CsvDownload.Status.PENDING)
                    .url("https://www.telnyx.com/sample/42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                    .build()
            )
        assertThat(csvDownloadListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val csvDownloadListPageResponse =
            CsvDownloadListPageResponse.builder()
                .addData(
                    CsvDownload.builder()
                        .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                        .recordType("csv_download")
                        .status(CsvDownload.Status.PENDING)
                        .url("https://www.telnyx.com/sample/42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedCsvDownloadListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(csvDownloadListPageResponse),
                jacksonTypeRef<CsvDownloadListPageResponse>(),
            )

        assertThat(roundtrippedCsvDownloadListPageResponse).isEqualTo(csvDownloadListPageResponse)
    }
}
