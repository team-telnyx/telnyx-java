// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.dir

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirCreateParamsTest {

    @Test
    fun create() {
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
                    .documentType(DirCreateParams.Document.DocumentType.BUSINESS_REGISTRATION)
                    .description("Certificate of incorporation.")
                    .build()
            )
            .logoUrl("https://acmeplumbing.example.com/logo-256.bmp")
            .reselling(false)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DirCreateParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .authorizerEmail("sam@acmeplumbing.example.com")
                .authorizerName("Sam Owner")
                .certifyBrandIsAccurate(DirCreateParams.CertifyBrandIsAccurate.TRUE)
                .certifyIpOwnership(DirCreateParams.CertifyIpOwnership.TRUE)
                .certifyNoShaftContent(DirCreateParams.CertifyNoShaftContent.TRUE)
                .displayName("Acme Plumbing")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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
                        .documentType(DirCreateParams.Document.DocumentType.BUSINESS_REGISTRATION)
                        .description("Certificate of incorporation.")
                        .build()
                )
                .logoUrl("https://acmeplumbing.example.com/logo-256.bmp")
                .reselling(false)
                .build()

        val body = params._body()

        assertThat(body.authorizerEmail()).isEqualTo("sam@acmeplumbing.example.com")
        assertThat(body.authorizerName()).isEqualTo("Sam Owner")
        assertThat(body.certifyBrandIsAccurate())
            .isEqualTo(DirCreateParams.CertifyBrandIsAccurate.TRUE)
        assertThat(body.certifyIpOwnership()).isEqualTo(DirCreateParams.CertifyIpOwnership.TRUE)
        assertThat(body.certifyNoShaftContent())
            .isEqualTo(DirCreateParams.CertifyNoShaftContent.TRUE)
        assertThat(body.displayName()).isEqualTo("Acme Plumbing")
        assertThat(body.callReasons().getOrNull())
            .containsExactly("Appointment reminders", "Billing inquiries")
        assertThat(body.documents().getOrNull())
            .containsExactly(
                DirCreateParams.Document.builder()
                    .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .documentType(DirCreateParams.Document.DocumentType.BUSINESS_REGISTRATION)
                    .description("Certificate of incorporation.")
                    .build()
            )
        assertThat(body.logoUrl()).contains("https://acmeplumbing.example.com/logo-256.bmp")
        assertThat(body.reselling()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DirCreateParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .authorizerEmail("sam@acmeplumbing.example.com")
                .authorizerName("Sam Owner")
                .certifyBrandIsAccurate(DirCreateParams.CertifyBrandIsAccurate.TRUE)
                .certifyIpOwnership(DirCreateParams.CertifyIpOwnership.TRUE)
                .certifyNoShaftContent(DirCreateParams.CertifyNoShaftContent.TRUE)
                .displayName("Acme Plumbing")
                .build()

        val body = params._body()

        assertThat(body.authorizerEmail()).isEqualTo("sam@acmeplumbing.example.com")
        assertThat(body.authorizerName()).isEqualTo("Sam Owner")
        assertThat(body.certifyBrandIsAccurate())
            .isEqualTo(DirCreateParams.CertifyBrandIsAccurate.TRUE)
        assertThat(body.certifyIpOwnership()).isEqualTo(DirCreateParams.CertifyIpOwnership.TRUE)
        assertThat(body.certifyNoShaftContent())
            .isEqualTo(DirCreateParams.CertifyNoShaftContent.TRUE)
        assertThat(body.displayName()).isEqualTo("Acme Plumbing")
    }
}
