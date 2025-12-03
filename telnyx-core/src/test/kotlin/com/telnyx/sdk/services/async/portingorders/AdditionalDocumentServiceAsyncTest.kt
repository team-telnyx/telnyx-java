// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentCreateParams
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentDeleteParams
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AdditionalDocumentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val additionalDocumentServiceAsync = client.portingOrders().additionalDocuments()

        val additionalDocumentFuture =
            additionalDocumentServiceAsync.create(
                AdditionalDocumentCreateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAdditionalDocument(
                        AdditionalDocumentCreateParams.AdditionalDocument.builder()
                            .documentId("22771a52-c43a-4539-80db-9dd9ec36e237")
                            .documentType(
                                AdditionalDocumentCreateParams.AdditionalDocument.DocumentType.LOA
                            )
                            .build()
                    )
                    .addAdditionalDocument(
                        AdditionalDocumentCreateParams.AdditionalDocument.builder()
                            .documentId("d91474e6-4ebc-4ec1-b379-c596eeb405d6")
                            .documentType(
                                AdditionalDocumentCreateParams.AdditionalDocument.DocumentType
                                    .INVOICE
                            )
                            .build()
                    )
                    .build()
            )

        val additionalDocument = additionalDocumentFuture.get()
        additionalDocument.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val additionalDocumentServiceAsync = client.portingOrders().additionalDocuments()

        val additionalDocumentsFuture =
            additionalDocumentServiceAsync.list(
                AdditionalDocumentListParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filter(
                        AdditionalDocumentListParams.Filter.builder()
                            .addDocumentType(AdditionalDocumentListParams.Filter.DocumentType.LOA)
                            .build()
                    )
                    .page(AdditionalDocumentListParams.Page.builder().number(1L).size(1L).build())
                    .sort(
                        AdditionalDocumentListParams.Sort.builder()
                            .value(AdditionalDocumentListParams.Sort.Value_.CREATED_AT)
                            .build()
                    )
                    .build()
            )

        val additionalDocuments = additionalDocumentsFuture.get()
        additionalDocuments.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val additionalDocumentServiceAsync = client.portingOrders().additionalDocuments()

        val future =
            additionalDocumentServiceAsync.delete(
                AdditionalDocumentDeleteParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .additionalDocumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }
}
