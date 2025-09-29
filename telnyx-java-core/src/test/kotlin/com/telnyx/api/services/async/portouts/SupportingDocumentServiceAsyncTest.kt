// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.portouts

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.portouts.supportingdocuments.SupportingDocumentCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SupportingDocumentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val supportingDocumentServiceAsync = client.portouts().supportingDocuments()

        val supportingDocumentFuture =
            supportingDocumentServiceAsync.create(
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

        val supportingDocument = supportingDocumentFuture.get()
        supportingDocument.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val supportingDocumentServiceAsync = client.portouts().supportingDocuments()

        val supportingDocumentsFuture =
            supportingDocumentServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val supportingDocuments = supportingDocumentsFuture.get()
        supportingDocuments.validate()
    }
}
