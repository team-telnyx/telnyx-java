// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.csvdownloads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CsvDownloadListResponseTest {

    @Test
    fun create() {
        val csvDownloadListResponse =
            CsvDownloadListResponse.builder()
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

        assertThat(csvDownloadListResponse.data().getOrNull())
            .containsExactly(
                CsvDownload.builder()
                    .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                    .recordType("csv_download")
                    .status(CsvDownload.Status.PENDING)
                    .url("https://www.telnyx.com/sample/42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                    .build()
            )
        assertThat(csvDownloadListResponse.meta())
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
        val csvDownloadListResponse =
            CsvDownloadListResponse.builder()
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

        val roundtrippedCsvDownloadListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(csvDownloadListResponse),
                jacksonTypeRef<CsvDownloadListResponse>(),
            )

        assertThat(roundtrippedCsvDownloadListResponse).isEqualTo(csvDownloadListResponse)
    }
}
