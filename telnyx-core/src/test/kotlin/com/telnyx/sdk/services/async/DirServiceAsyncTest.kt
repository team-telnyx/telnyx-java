// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.dir.DirUpdateInfringementParams
import com.telnyx.sdk.models.dir.DirUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DirServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dirServiceAsync = client.dir()

        val dirFuture = dirServiceAsync.retrieve("16635d38-75a6-4481-82e8-69af60e05011")

        val dir = dirFuture.get()
        dir.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dirServiceAsync = client.dir()

        val dirFuture =
            dirServiceAsync.update(
                DirUpdateParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .authorizerEmail("dev@stainless.com")
                    .authorizerName("authorizer_name")
                    .callReasons(
                        listOf("Appointment reminders", "Billing inquiries", "Lab results")
                    )
                    .displayName("Acme Plumbing & Wellness")
                    .logoUrl("https://acmeplumbing.example.com/logo-v2-256.bmp")
                    .reselling(true)
                    .build()
            )

        val dir = dirFuture.get()
        dir.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dirServiceAsync = client.dir()

        val pageFuture = dirServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dirServiceAsync = client.dir()

        val future = dirServiceAsync.delete("16635d38-75a6-4481-82e8-69af60e05011")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listDocumentTypes() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dirServiceAsync = client.dir()

        val responseFuture = dirServiceAsync.listDocumentTypes()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listInfringementClaims() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dirServiceAsync = client.dir()

        val pageFuture =
            dirServiceAsync.listInfringementClaims("16635d38-75a6-4481-82e8-69af60e05011")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dirServiceAsync = client.dir()

        val responseFuture = dirServiceAsync.submit("16635d38-75a6-4481-82e8-69af60e05011")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateInfringement() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dirServiceAsync = client.dir()

        val responseFuture =
            dirServiceAsync.updateInfringement(
                DirUpdateInfringementParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .certifyBrandIsAccurate(DirUpdateInfringementParams.CertifyBrandIsAccurate.TRUE)
                    .certifyIpOwnership(DirUpdateInfringementParams.CertifyIpOwnership.TRUE)
                    .certifyNoInfringement(DirUpdateInfringementParams.CertifyNoInfringement.TRUE)
                    .certifyNoShaftContent(DirUpdateInfringementParams.CertifyNoShaftContent.TRUE)
                    .infringementResolutionNotes(
                        "Updated the display name to remove the disputed mark and re-uploaded the authorization."
                    )
                    .addCallReason("string")
                    .displayName("x")
                    .addDocument(
                        DirUpdateInfringementParams.Document.builder()
                            .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                            .documentType(
                                DirUpdateInfringementParams.Document.DocumentType
                                    .BUSINESS_REGISTRATION
                            )
                            .description("Certificate of incorporation.")
                            .build()
                    )
                    .logoUrl("logo_url")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
