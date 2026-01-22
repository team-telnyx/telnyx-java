// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documents

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListParamsTest {

    @Test
    fun create() {
        DocumentListParams.builder()
            .filter(
                DocumentListParams.Filter.builder()
                    .createdAt(
                        DocumentListParams.Filter.CreatedAt.builder()
                            .gt(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                            .lt(OffsetDateTime.parse("2021-04-09T22:25:27.521Z"))
                            .build()
                    )
                    .customerReference(
                        DocumentListParams.Filter.CustomerReference.builder()
                            .eq("MY REF 001")
                            .addInList("REF001")
                            .addInList("REF002")
                            .build()
                    )
                    .filename(
                        DocumentListParams.Filter.Filename.builder().contains("invoice").build()
                    )
                    .build()
            )
            .page(DocumentListParams.Page.builder().number(1L).size(1L).build())
            .addSort(DocumentListParams.Sort.FILENAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DocumentListParams.builder()
                .filter(
                    DocumentListParams.Filter.builder()
                        .createdAt(
                            DocumentListParams.Filter.CreatedAt.builder()
                                .gt(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                                .lt(OffsetDateTime.parse("2021-04-09T22:25:27.521Z"))
                                .build()
                        )
                        .customerReference(
                            DocumentListParams.Filter.CustomerReference.builder()
                                .eq("MY REF 001")
                                .addInList("REF001")
                                .addInList("REF002")
                                .build()
                        )
                        .filename(
                            DocumentListParams.Filter.Filename.builder().contains("invoice").build()
                        )
                        .build()
                )
                .page(DocumentListParams.Page.builder().number(1L).size(1L).build())
                .addSort(DocumentListParams.Sort.FILENAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[created_at][gt]", "2021-01-01T00:00:00Z")
                    .put("filter[created_at][lt]", "2021-04-09T22:25:27.521Z")
                    .put("filter[customer_reference][eq]", "MY REF 001")
                    .put(
                        "filter[customer_reference][in]",
                        listOf("REF001", "REF002").joinToString(","),
                    )
                    .put("filter[filename][contains]", "invoice")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", listOf("filename").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DocumentListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
