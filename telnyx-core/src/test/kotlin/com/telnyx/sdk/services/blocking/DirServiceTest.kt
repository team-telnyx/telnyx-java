// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.dir.DirCreateLoaParams
import com.telnyx.sdk.models.dir.DirUpdateInfringementParams
import com.telnyx.sdk.models.dir.DirUpdateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class DirServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dirService = client.dir()

        val dir = dirService.retrieve("16635d38-75a6-4481-82e8-69af60e05011")

        dir.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dirService = client.dir()

        val dir =
            dirService.update(
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

        dir.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dirService = client.dir()

        val page = dirService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dirService = client.dir()

        dirService.delete("16635d38-75a6-4481-82e8-69af60e05011")
    }

    @Test
    fun createLoa(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val dirService = client.dir()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            dirService.createLoa(
                DirCreateLoaParams.builder()
                    .dirId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addPhoneNumber("+13125550000")
                    .agent(
                        DirCreateLoaParams.Agent.builder()
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
                        DirCreateLoaParams.Signature.builder()
                            .imageBase64("x")
                            .signerName("signer_name")
                            .build()
                    )
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listDocumentTypes() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dirService = client.dir()

        val response = dirService.listDocumentTypes()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listInfringementClaims() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dirService = client.dir()

        val page = dirService.listInfringementClaims("16635d38-75a6-4481-82e8-69af60e05011")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dirService = client.dir()

        val response = dirService.submit("16635d38-75a6-4481-82e8-69af60e05011")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateInfringement() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dirService = client.dir()

        val response =
            dirService.updateInfringement(
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

        response.validate()
    }
}
