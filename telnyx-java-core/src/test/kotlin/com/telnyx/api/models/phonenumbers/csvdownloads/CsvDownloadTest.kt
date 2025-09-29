// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.csvdownloads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CsvDownloadTest {

    @Test
    fun create() {
        val csvDownload =
            CsvDownload.builder()
                .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                .recordType("csv_download")
                .status(CsvDownload.Status.PENDING)
                .url("https://www.telnyx.com/sample/42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                .build()

        assertThat(csvDownload.id()).contains("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
        assertThat(csvDownload.recordType()).contains("csv_download")
        assertThat(csvDownload.status()).contains(CsvDownload.Status.PENDING)
        assertThat(csvDownload.url())
            .contains("https://www.telnyx.com/sample/42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val csvDownload =
            CsvDownload.builder()
                .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                .recordType("csv_download")
                .status(CsvDownload.Status.PENDING)
                .url("https://www.telnyx.com/sample/42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                .build()

        val roundtrippedCsvDownload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(csvDownload),
                jacksonTypeRef<CsvDownload>(),
            )

        assertThat(roundtrippedCsvDownload).isEqualTo(csvDownload)
    }
}
