// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.faxes.FaxCreateParams
import com.telnyx.api.models.faxes.FaxListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FaxServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxService = client.faxes()

        val fax =
            faxService.create(
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

        fax.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxService = client.faxes()

        val fax = faxService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        fax.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxService = client.faxes()

        val faxes =
            faxService.list(
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

        faxes.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxService = client.faxes()

        faxService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
