// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.invoices

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceRetrieveResponseTest {

    @Test
    fun create() {
        val invoiceRetrieveResponse =
            InvoiceRetrieveResponse.builder()
                .data(
                    InvoiceRetrieveResponse.Data.builder()
                        .downloadUrl(
                            "https://us-east-1.telnyxstorage.com/porting-documents/telnyx/..."
                        )
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
                .build()

        assertThat(invoiceRetrieveResponse.data())
            .contains(
                InvoiceRetrieveResponse.Data.builder()
                    .downloadUrl("https://us-east-1.telnyxstorage.com/porting-documents/telnyx/...")
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceRetrieveResponse =
            InvoiceRetrieveResponse.builder()
                .data(
                    InvoiceRetrieveResponse.Data.builder()
                        .downloadUrl(
                            "https://us-east-1.telnyxstorage.com/porting-documents/telnyx/..."
                        )
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
                .build()

        val roundtrippedInvoiceRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceRetrieveResponse),
                jacksonTypeRef<InvoiceRetrieveResponse>(),
            )

        assertThat(roundtrippedInvoiceRetrieveResponse).isEqualTo(invoiceRetrieveResponse)
    }
}
