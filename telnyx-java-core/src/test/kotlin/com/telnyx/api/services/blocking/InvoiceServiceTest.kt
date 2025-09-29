// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.invoices.InvoiceListParams
import com.telnyx.api.models.invoices.InvoiceRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InvoiceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.retrieve(
                InvoiceRetrieveParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .action(InvoiceRetrieveParams.Action.JSON)
                    .build()
            )

        invoice.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()

        val invoices =
            invoiceService.list(
                InvoiceListParams.builder()
                    .page(InvoiceListParams.Page.builder().number(1L).size(1L).build())
                    .sort(InvoiceListParams.Sort.PERIOD_START)
                    .build()
            )

        invoices.validate()
    }
}
