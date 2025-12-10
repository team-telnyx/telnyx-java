// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilepushcredentials

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobilePushCredentialCreateParamsTest {

    @Test
    fun create() {
        MobilePushCredentialCreateParams.builder()
            .createMobilePushCredentialRequest(
                MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.Ios.builder()
                    .alias("LucyIosCredential")
                    .certificate(
                        "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----"
                    )
                    .privateKey(
                        "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----"
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            MobilePushCredentialCreateParams.builder()
                .createMobilePushCredentialRequest(
                    MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.Ios.builder()
                        .alias("LucyIosCredential")
                        .certificate(
                            "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----"
                        )
                        .privateKey(
                            "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----"
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.ofIos(
                    MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.Ios.builder()
                        .alias("LucyIosCredential")
                        .certificate(
                            "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----"
                        )
                        .privateKey(
                            "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----"
                        )
                        .build()
                )
            )
    }
}
