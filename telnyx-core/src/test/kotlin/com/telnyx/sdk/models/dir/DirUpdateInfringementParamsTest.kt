// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirUpdateInfringementParamsTest {

    @Test
    fun create() {
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
                        DirUpdateInfringementParams.Document.DocumentType.BUSINESS_REGISTRATION
                    )
                    .description("Certificate of incorporation.")
                    .build()
            )
            .logoUrl("logo_url")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DirUpdateInfringementParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .certifyBrandIsAccurate(DirUpdateInfringementParams.CertifyBrandIsAccurate.TRUE)
                .certifyIpOwnership(DirUpdateInfringementParams.CertifyIpOwnership.TRUE)
                .certifyNoInfringement(DirUpdateInfringementParams.CertifyNoInfringement.TRUE)
                .certifyNoShaftContent(DirUpdateInfringementParams.CertifyNoShaftContent.TRUE)
                .infringementResolutionNotes(
                    "Updated the display name to remove the disputed mark and re-uploaded the authorization."
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("16635d38-75a6-4481-82e8-69af60e05011")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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
                            DirUpdateInfringementParams.Document.DocumentType.BUSINESS_REGISTRATION
                        )
                        .description("Certificate of incorporation.")
                        .build()
                )
                .logoUrl("logo_url")
                .build()

        val body = params._body()

        assertThat(body.certifyBrandIsAccurate())
            .isEqualTo(DirUpdateInfringementParams.CertifyBrandIsAccurate.TRUE)
        assertThat(body.certifyIpOwnership())
            .isEqualTo(DirUpdateInfringementParams.CertifyIpOwnership.TRUE)
        assertThat(body.certifyNoInfringement())
            .isEqualTo(DirUpdateInfringementParams.CertifyNoInfringement.TRUE)
        assertThat(body.certifyNoShaftContent())
            .isEqualTo(DirUpdateInfringementParams.CertifyNoShaftContent.TRUE)
        assertThat(body.infringementResolutionNotes())
            .isEqualTo(
                "Updated the display name to remove the disputed mark and re-uploaded the authorization."
            )
        assertThat(body.callReasons().getOrNull()).containsExactly("string")
        assertThat(body.displayName()).contains("x")
        assertThat(body.documents().getOrNull())
            .containsExactly(
                DirUpdateInfringementParams.Document.builder()
                    .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .documentType(
                        DirUpdateInfringementParams.Document.DocumentType.BUSINESS_REGISTRATION
                    )
                    .description("Certificate of incorporation.")
                    .build()
            )
        assertThat(body.logoUrl()).contains("logo_url")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DirUpdateInfringementParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .certifyBrandIsAccurate(DirUpdateInfringementParams.CertifyBrandIsAccurate.TRUE)
                .certifyIpOwnership(DirUpdateInfringementParams.CertifyIpOwnership.TRUE)
                .certifyNoInfringement(DirUpdateInfringementParams.CertifyNoInfringement.TRUE)
                .certifyNoShaftContent(DirUpdateInfringementParams.CertifyNoShaftContent.TRUE)
                .infringementResolutionNotes(
                    "Updated the display name to remove the disputed mark and re-uploaded the authorization."
                )
                .build()

        val body = params._body()

        assertThat(body.certifyBrandIsAccurate())
            .isEqualTo(DirUpdateInfringementParams.CertifyBrandIsAccurate.TRUE)
        assertThat(body.certifyIpOwnership())
            .isEqualTo(DirUpdateInfringementParams.CertifyIpOwnership.TRUE)
        assertThat(body.certifyNoInfringement())
            .isEqualTo(DirUpdateInfringementParams.CertifyNoInfringement.TRUE)
        assertThat(body.certifyNoShaftContent())
            .isEqualTo(DirUpdateInfringementParams.CertifyNoShaftContent.TRUE)
        assertThat(body.infringementResolutionNotes())
            .isEqualTo(
                "Updated the display name to remove the disputed mark and re-uploaded the authorization."
            )
    }
}
