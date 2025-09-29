// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portouts

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portouts.supportingdocuments.SupportingDocumentCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SupportingDocumentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val supportingDocumentService = client.portouts().supportingDocuments()

        val supportingDocument =
            supportingDocumentService.create(
                SupportingDocumentCreateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addDocument(
                        SupportingDocumentCreateParams.Document.builder()
                            .documentId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                            .type(SupportingDocumentCreateParams.Document.Type.LOA)
                            .build()
                    )
                    .build()
            )

        supportingDocument.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val supportingDocumentService = client.portouts().supportingDocuments()

        val supportingDocuments =
            supportingDocumentService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        supportingDocuments.validate()
    }
}
