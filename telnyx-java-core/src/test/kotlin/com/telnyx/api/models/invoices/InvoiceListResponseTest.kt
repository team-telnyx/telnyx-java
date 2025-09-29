// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.invoices

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceListResponseTest {

    @Test
    fun create() {
        val invoiceListResponse =
            InvoiceListResponse.builder()
                .addData(
                    InvoiceListResponse.Data.builder()
                        .fileId("454ea3b0-9eaa-4fa9-992e-6d9f31c0a37e")
                        .invoiceId("48eff763-ea80-4345-b688-78249eb165a8")
                        .paid(true)
                        .periodEnd(LocalDate.parse("2023-11-30"))
                        .periodStart(LocalDate.parse("2023-11-01"))
                        .url(
                            "https://api.telnyx.com:443/v2/invoices/48eff763-ea80-4345-b688-78249eb165a8"
                        )
                        .build()
                )
                .meta(
                    InvoiceListResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(1L)
                        .totalResults(20L)
                        .build()
                )
                .build()

        assertThat(invoiceListResponse.data().getOrNull())
            .containsExactly(
                InvoiceListResponse.Data.builder()
                    .fileId("454ea3b0-9eaa-4fa9-992e-6d9f31c0a37e")
                    .invoiceId("48eff763-ea80-4345-b688-78249eb165a8")
                    .paid(true)
                    .periodEnd(LocalDate.parse("2023-11-30"))
                    .periodStart(LocalDate.parse("2023-11-01"))
                    .url(
                        "https://api.telnyx.com:443/v2/invoices/48eff763-ea80-4345-b688-78249eb165a8"
                    )
                    .build()
            )
        assertThat(invoiceListResponse.meta())
            .contains(
                InvoiceListResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(1L)
                    .totalResults(20L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceListResponse =
            InvoiceListResponse.builder()
                .addData(
                    InvoiceListResponse.Data.builder()
                        .fileId("454ea3b0-9eaa-4fa9-992e-6d9f31c0a37e")
                        .invoiceId("48eff763-ea80-4345-b688-78249eb165a8")
                        .paid(true)
                        .periodEnd(LocalDate.parse("2023-11-30"))
                        .periodStart(LocalDate.parse("2023-11-01"))
                        .url(
                            "https://api.telnyx.com:443/v2/invoices/48eff763-ea80-4345-b688-78249eb165a8"
                        )
                        .build()
                )
                .meta(
                    InvoiceListResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(1L)
                        .totalResults(20L)
                        .build()
                )
                .build()

        val roundtrippedInvoiceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceListResponse),
                jacksonTypeRef<InvoiceListResponse>(),
            )

        assertThat(roundtrippedInvoiceListResponse).isEqualTo(invoiceListResponse)
    }
}
