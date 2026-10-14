// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirUpdateParamsTest {

    @Test
    fun create() {
        DirUpdateParams.builder()
            .dirId("16635d38-75a6-4481-82e8-69af60e05011")
            .authorizerEmail("dev@stainless.com")
            .authorizerName("authorizer_name")
            .addBpoAuthorization(
                BpoAuthorizationInput.builder()
                    .bpoEnterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .build()
            )
            .callReasons(listOf("Appointment reminders", "Billing inquiries", "Lab results"))
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
            .webhookUrl("https://mapleridge.example.com/webhooks/branded-calling")
            .build()
    }

    @Test
    fun pathParams() {
        val params = DirUpdateParams.builder().dirId("16635d38-75a6-4481-82e8-69af60e05011").build()

        assertThat(params._pathParam(0)).isEqualTo("16635d38-75a6-4481-82e8-69af60e05011")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DirUpdateParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .authorizerEmail("dev@stainless.com")
                .authorizerName("authorizer_name")
                .addBpoAuthorization(
                    BpoAuthorizationInput.builder()
                        .bpoEnterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .build()
                )
                .callReasons(listOf("Appointment reminders", "Billing inquiries", "Lab results"))
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
                .webhookUrl("https://mapleridge.example.com/webhooks/branded-calling")
                .build()

        val body = params._body()

        assertThat(body.authorizerEmail()).contains("dev@stainless.com")
        assertThat(body.authorizerName()).contains("authorizer_name")
        assertThat(body.bpoAuthorizations().getOrNull())
            .containsExactly(
                BpoAuthorizationInput.builder()
                    .bpoEnterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .build()
            )
        assertThat(body.callReasons().getOrNull())
            .containsExactly("Appointment reminders", "Billing inquiries", "Lab results")
        assertThat(body.certifyBrandIsAccurate()).contains(true)
        assertThat(body.certifyIpOwnership()).contains(true)
        assertThat(body.certifyNoShaftContent()).contains(true)
        assertThat(body.displayName()).contains("Acme Plumbing & Wellness")
        assertThat(body.documents().getOrNull())
            .containsExactly(
                Document.builder()
                    .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .documentType(Document.DocumentType.BUSINESS_REGISTRATION)
                    .description("Certificate of incorporation.")
                    .build()
            )
        assertThat(body.logoUrl()).contains("https://acmeplumbing.example.com/logo-v2-256.bmp")
        assertThat(body.reselling()).contains(true)
        assertThat(body.webhookUrl())
            .contains("https://mapleridge.example.com/webhooks/branded-calling")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DirUpdateParams.builder().dirId("16635d38-75a6-4481-82e8-69af60e05011").build()

        val body = params._body()
    }
}
