// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.dir.DirNewLoaParams
import com.telnyx.sdk.models.dir.DirUpdateInfringementParams
import com.telnyx.sdk.models.dir.DirUpdateParams
import com.telnyx.sdk.models.dir.Document
import com.telnyx.sdk.models.enterprises.reputation.loa.AgentInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class DirServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dirServiceAsync = client.dir()

        val dirWrappedFuture = dirServiceAsync.retrieve("16635d38-75a6-4481-82e8-69af60e05011")

        val dirWrapped = dirWrappedFuture.get()
        dirWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dirServiceAsync = client.dir()

        val dirWrappedFuture =
            dirServiceAsync.update(
                DirUpdateParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .authorizerEmail("dev@stainless.com")
                    .authorizerName("authorizer_name")
                    .callReasons(
                        listOf("Appointment reminders", "Billing inquiries", "Lab results")
                    )
                    .certifyBrandIsAccurate(true)
                    .certifyIpOwnership(true)
                    .certifyNoShaftContent(true)
                    .displayName("Acme Plumbing & Wellness")
                    .addDocument(
                        Document.builder()
                            .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                            .documentType(Document.DocumentType.BUSINESS_REGISTRATION)
                            .description("Certificate of incorporation.")
                            .build()
                    )
                    .logoUrl("https://acmeplumbing.example.com/logo-v2-256.bmp")
                    .reselling(true)
                    .build()
            )

        val dirWrapped = dirWrappedFuture.get()
        dirWrapped.validate()
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

    @Test
    fun newLoa(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val dirServiceAsync = client.dir()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            dirServiceAsync.newLoa(
                DirNewLoaParams.builder()
                    .dirId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addPhoneNumber("+13125550000")
                    .agent(
                        AgentInput.builder()
                            .administrativeArea("administrative_area")
                            .city("city")
                            .contactEmail("dev@stainless.com")
                            .contactName("contact_name")
                            .contactPhone("+13125550000")
                            .contactTitle("contact_title")
                            .country("US")
                            .legalName("legal_name")
                            .postalCode("postal_code")
                            .streetAddress("street_address")
                            .dba("dba")
                            .extendedAddress("extended_address")
                            .build()
                    )
                    .signature(
                        DirNewLoaParams.Signature.builder()
                            .imageBase64("x")
                            .signerName("signer_name")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dirServiceAsync = client.dir()

        val dirWrappedFuture = dirServiceAsync.submit("16635d38-75a6-4481-82e8-69af60e05011")

        val dirWrapped = dirWrappedFuture.get()
        dirWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateInfringement() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dirServiceAsync = client.dir()

        val dirWrappedFuture =
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
                        Document.builder()
                            .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                            .documentType(Document.DocumentType.BUSINESS_REGISTRATION)
                            .description("Certificate of incorporation.")
                            .build()
                    )
                    .logoUrl("logo_url")
                    .build()
            )

        val dirWrapped = dirWrappedFuture.get()
        dirWrapped.validate()
    }
}
