// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.documentlinks.DocumentLinkListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentLinkServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentLinkServiceAsync = client.documentLinks()

        val documentLinksFuture =
            documentLinkServiceAsync.list(
                DocumentLinkListParams.builder()
                    .filter(
                        DocumentLinkListParams.Filter.builder()
                            .linkedRecordType("porting_order")
                            .linkedResourceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                            .build()
                    )
                    .page(DocumentLinkListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val documentLinks = documentLinksFuture.get()
        documentLinks.validate()
    }
}
