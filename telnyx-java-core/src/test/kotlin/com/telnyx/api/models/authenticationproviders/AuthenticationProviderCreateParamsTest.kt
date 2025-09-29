// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.authenticationproviders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthenticationProviderCreateParamsTest {

    @Test
    fun create() {
        AuthenticationProviderCreateParams.builder()
            .name("Okta")
            .settings(
                Settings.builder()
                    .idpCertFingerprint(
                        "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                    )
                    .idpEntityId("https://myorg.myidp.com/saml/metadata")
                    .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                    .idpCertFingerprintAlgorithm(Settings.IdpCertFingerprintAlgorithm.SHA256)
                    .build()
            )
            .shortName("myorg")
            .active(true)
            .settingsUrl("https://myorg.myidp.com/saml/metadata")
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthenticationProviderCreateParams.builder()
                .name("Okta")
                .settings(
                    Settings.builder()
                        .idpCertFingerprint(
                            "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                        )
                        .idpEntityId("https://myorg.myidp.com/saml/metadata")
                        .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                        .idpCertFingerprintAlgorithm(Settings.IdpCertFingerprintAlgorithm.SHA256)
                        .build()
                )
                .shortName("myorg")
                .active(true)
                .settingsUrl("https://myorg.myidp.com/saml/metadata")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Okta")
        assertThat(body.settings())
            .isEqualTo(
                Settings.builder()
                    .idpCertFingerprint(
                        "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                    )
                    .idpEntityId("https://myorg.myidp.com/saml/metadata")
                    .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                    .idpCertFingerprintAlgorithm(Settings.IdpCertFingerprintAlgorithm.SHA256)
                    .build()
            )
        assertThat(body.shortName()).isEqualTo("myorg")
        assertThat(body.active()).contains(true)
        assertThat(body.settingsUrl()).contains("https://myorg.myidp.com/saml/metadata")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthenticationProviderCreateParams.builder()
                .name("Okta")
                .settings(
                    Settings.builder()
                        .idpCertFingerprint(
                            "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                        )
                        .idpEntityId("https://myorg.myidp.com/saml/metadata")
                        .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                        .build()
                )
                .shortName("myorg")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Okta")
        assertThat(body.settings())
            .isEqualTo(
                Settings.builder()
                    .idpCertFingerprint(
                        "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                    )
                    .idpEntityId("https://myorg.myidp.com/saml/metadata")
                    .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                    .build()
            )
        assertThat(body.shortName()).isEqualTo("myorg")
    }
}
