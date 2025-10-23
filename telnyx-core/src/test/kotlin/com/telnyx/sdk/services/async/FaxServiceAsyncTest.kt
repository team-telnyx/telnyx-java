// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.faxes.FaxCreateParams
import com.telnyx.sdk.models.faxes.FaxListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FaxServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxServiceAsync = client.faxes()

        val faxFuture =
            faxServiceAsync.create(
                FaxCreateParams.builder()
                    .connectionId("234423")
                    .from("+13125790015")
                    .to("+13127367276")
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

        val fax = faxFuture.get()
        fax.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxServiceAsync = client.faxes()

        val faxFuture = faxServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val fax = faxFuture.get()
        fax.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxServiceAsync = client.faxes()

        val faxesFuture =
            faxServiceAsync.list(
                FaxListParams.builder()
                    .filter(
                        FaxListParams.Filter.builder()
                            .createdAt(
                                FaxListParams.Filter.CreatedAt.builder()
                                    .gt(OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"))
                                    .gte(OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"))
                                    .lt(OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"))
                                    .lte(OffsetDateTime.parse("2020-02-02T22:25:27.521992Z"))
                                    .build()
                            )
                            .direction(
                                FaxListParams.Filter.Direction.builder().eq("inbound").build()
                            )
                            .from(FaxListParams.Filter.From.builder().eq("+13127367276").build())
                            .to(FaxListParams.Filter.To.builder().eq("+13127367276").build())
                            .build()
                    )
                    .page(FaxListParams.Page.builder().number(2L).size(2L).build())
                    .build()
            )

        val faxes = faxesFuture.get()
        faxes.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxServiceAsync = client.faxes()

        val future = faxServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }
}
