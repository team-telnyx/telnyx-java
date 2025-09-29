// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.csvdownloads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CsvDownloadCreateResponseTest {

    @Test
    fun create() {
        val csvDownloadCreateResponse =
            CsvDownloadCreateResponse.builder()
                .addData(
                    CsvDownload.builder()
                        .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                        .recordType("csv_download")
                        .status(CsvDownload.Status.PENDING)
                        .url("https://www.telnyx.com/sample/42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                        .build()
                )
                .build()

        assertThat(csvDownloadCreateResponse.data().getOrNull())
            .containsExactly(
                CsvDownload.builder()
                    .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                    .recordType("csv_download")
                    .status(CsvDownload.Status.PENDING)
                    .url("https://www.telnyx.com/sample/42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val csvDownloadCreateResponse =
            CsvDownloadCreateResponse.builder()
                .addData(
                    CsvDownload.builder()
                        .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                        .recordType("csv_download")
                        .status(CsvDownload.Status.PENDING)
                        .url("https://www.telnyx.com/sample/42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                        .build()
                )
                .build()

        val roundtrippedCsvDownloadCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(csvDownloadCreateResponse),
                jacksonTypeRef<CsvDownloadCreateResponse>(),
            )

        assertThat(roundtrippedCsvDownloadCreateResponse).isEqualTo(csvDownloadCreateResponse)
    }
}
