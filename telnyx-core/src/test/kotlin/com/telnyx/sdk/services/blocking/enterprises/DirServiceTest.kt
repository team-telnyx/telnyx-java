// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.enterprises.dir.DirCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DirServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dirService = client.enterprises().dir()

        val dir =
            dirService.create(
                DirCreateParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .authorizerEmail("sam@acmeplumbing.example.com")
                    .authorizerName("Sam Owner")
                    .certifyBrandIsAccurate(DirCreateParams.CertifyBrandIsAccurate.TRUE)
                    .certifyIpOwnership(DirCreateParams.CertifyIpOwnership.TRUE)
                    .certifyNoShaftContent(DirCreateParams.CertifyNoShaftContent.TRUE)
                    .displayName("Acme Plumbing")
                    .addCallReason("Appointment reminders")
                    .addCallReason("Billing inquiries")
                    .addDocument(
                        DirCreateParams.Document.builder()
                            .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                            .documentType(
                                DirCreateParams.Document.DocumentType.BUSINESS_REGISTRATION
                            )
                            .description("Certificate of incorporation.")
                            .build()
                    )
                    .logoUrl("https://acmeplumbing.example.com/logo-256.bmp")
                    .reselling(false)
                    .build()
            )

        dir.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dirService = client.enterprises().dir()

        val page = dirService.list("4a6192a4-573d-446d-b3ce-aff9117272a6")

        page.response().validate()
    }
}
