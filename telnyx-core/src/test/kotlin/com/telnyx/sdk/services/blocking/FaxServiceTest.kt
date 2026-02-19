// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.faxes.FaxCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FaxServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val faxService = client.faxes()

        val fax =
            faxService.create(
                FaxCreateParams.builder()
                    .connectionId("234423")
                    .from("+13125790015")
                    .to("+13127367276")
                    .blackThreshold(1L)
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .fromDisplayName("Company Name")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .mediaUrl(
                        "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                    )
                    .monochrome(true)
                    .previewFormat(FaxCreateParams.PreviewFormat.PDF)
                    .quality(FaxCreateParams.Quality.HIGH)
                    .storeMedia(true)
                    .storePreview(true)
                    .t38Enabled(true)
                    .webhookUrl("https://www.example.com/server-b/")
                    .build()
            )

        fax.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val faxService = client.faxes()

        val fax = faxService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        fax.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val faxService = client.faxes()

        val page = faxService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val faxService = client.faxes()

        faxService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
