// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilepushcredentials

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobilePushCredentialCreateParamsTest {

    @Test
    fun create() {
        MobilePushCredentialCreateParams.builder()
            .body(
                MobilePushCredentialCreateParams.Body.CreateIosPushCredentialRequest.builder()
                    .alias("LucyIosCredential")
                    .certificate(
                        "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----"
                    )
                    .privateKey(
                        "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----"
                    )
                    .type(
                        MobilePushCredentialCreateParams.Body.CreateIosPushCredentialRequest.Type
                            .IOS
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            MobilePushCredentialCreateParams.builder()
                .body(
                    MobilePushCredentialCreateParams.Body.CreateIosPushCredentialRequest.builder()
                        .alias("LucyIosCredential")
                        .certificate(
                            "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----"
                        )
                        .privateKey(
                            "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----"
                        )
                        .type(
                            MobilePushCredentialCreateParams.Body.CreateIosPushCredentialRequest
                                .Type
                                .IOS
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MobilePushCredentialCreateParams.Body.ofCreateIosPushCredentialRequest(
                    MobilePushCredentialCreateParams.Body.CreateIosPushCredentialRequest.builder()
                        .alias("LucyIosCredential")
                        .certificate(
                            "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----"
                        )
                        .privateKey(
                            "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----"
                        )
                        .type(
                            MobilePushCredentialCreateParams.Body.CreateIosPushCredentialRequest
                                .Type
                                .IOS
                        )
                        .build()
                )
            )
    }
}
