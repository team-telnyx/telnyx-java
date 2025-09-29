// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.authenticationproviders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthenticationProviderUpdateParamsTest {

    @Test
    fun create() {
        AuthenticationProviderUpdateParams.builder()
            .id("id")
            .active(true)
            .name("Okta")
            .settings(
                Settings.builder()
                    .idpCertFingerprint(
                        "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                    )
                    .idpEntityId("https://myorg.myidp.com/saml/metadata")
                    .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                    .idpCertFingerprintAlgorithm(Settings.IdpCertFingerprintAlgorithm.SHA1)
                    .build()
            )
            .settingsUrl("https://myorg.myidp.com/saml/metadata")
            .shortName("myorg")
            .build()
    }

    @Test
    fun pathParams() {
        val params = AuthenticationProviderUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AuthenticationProviderUpdateParams.builder()
                .id("id")
                .active(true)
                .name("Okta")
                .settings(
                    Settings.builder()
                        .idpCertFingerprint(
                            "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                        )
                        .idpEntityId("https://myorg.myidp.com/saml/metadata")
                        .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                        .idpCertFingerprintAlgorithm(Settings.IdpCertFingerprintAlgorithm.SHA1)
                        .build()
                )
                .settingsUrl("https://myorg.myidp.com/saml/metadata")
                .shortName("myorg")
                .build()

        val body = params._body()

        assertThat(body.active()).contains(true)
        assertThat(body.name()).contains("Okta")
        assertThat(body.settings())
            .contains(
                Settings.builder()
                    .idpCertFingerprint(
                        "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                    )
                    .idpEntityId("https://myorg.myidp.com/saml/metadata")
                    .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                    .idpCertFingerprintAlgorithm(Settings.IdpCertFingerprintAlgorithm.SHA1)
                    .build()
            )
        assertThat(body.settingsUrl()).contains("https://myorg.myidp.com/saml/metadata")
        assertThat(body.shortName()).contains("myorg")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AuthenticationProviderUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
