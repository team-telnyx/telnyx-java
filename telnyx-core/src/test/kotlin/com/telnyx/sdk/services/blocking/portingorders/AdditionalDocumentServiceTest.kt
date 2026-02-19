// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentCreateParams
import com.telnyx.sdk.models.portingorders.additionaldocuments.AdditionalDocumentDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AdditionalDocumentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val additionalDocumentService = client.portingOrders().additionalDocuments()

        val additionalDocument =
            additionalDocumentService.create(
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

        additionalDocument.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val additionalDocumentService = client.portingOrders().additionalDocuments()

        val page = additionalDocumentService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val additionalDocumentService = client.portingOrders().additionalDocuments()

        additionalDocumentService.delete(
            AdditionalDocumentDeleteParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .additionalDocumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
