// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.invoices.InvoiceRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InvoiceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val invoiceServiceAsync = client.invoices()

        val invoiceFuture =
            invoiceServiceAsync.retrieve(
                InvoiceRetrieveParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .action(InvoiceRetrieveParams.Action.JSON)
                    .build()
            )

        val invoice = invoiceFuture.get()
        invoice.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val invoiceServiceAsync = client.invoices()

        val pageFuture = invoiceServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
