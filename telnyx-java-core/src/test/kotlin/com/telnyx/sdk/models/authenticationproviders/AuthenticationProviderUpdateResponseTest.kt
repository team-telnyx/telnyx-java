// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.authenticationproviders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthenticationProviderUpdateResponseTest {

    @Test
    fun create() {
        val authenticationProviderUpdateResponse =
            AuthenticationProviderUpdateResponse.builder()
                .data(
                    AuthenticationProvider.builder()
                        .id("35146afd-df93-4963-b1e9-1a085e2ae874")
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .name("Okta")
                        .organizationId("24b4a4bb-c4df-46ad-bbcb-23fc741c5ad7")
                        .recordType("authentication_provider")
                        .settings(
                            AuthenticationProvider.Settings.builder()
                                .assertionConsumerServiceUrl(
                                    "https://api.telnyx.com/sso/saml/auth/myorg"
                                )
                                .idpCertFingerprint(
                                    "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                                )
                                .idpCertFingerprintAlgorithm(
                                    AuthenticationProvider.Settings.IdpCertFingerprintAlgorithm
                                        .SHA256
                                )
                                .idpEntityId("https://myorg.myidp.com/saml/metadata")
                                .idpSsoTargetUrl(
                                    "https://myorg.myidp.com/trust/saml2/http-post/sso"
                                )
                                .nameIdentifierFormat("urn:oasis:names:tc:SAML:1.1:nameid-format")
                                .serviceProviderEntityId(
                                    "https://api.telnyx.com/sso/saml/metadata/myorg"
                                )
                                .build()
                        )
                        .shortName("myorg")
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .build()

        assertThat(authenticationProviderUpdateResponse.data())
            .contains(
                AuthenticationProvider.builder()
                    .id("35146afd-df93-4963-b1e9-1a085e2ae874")
                    .active(true)
                    .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .name("Okta")
                    .organizationId("24b4a4bb-c4df-46ad-bbcb-23fc741c5ad7")
                    .recordType("authentication_provider")
                    .settings(
                        AuthenticationProvider.Settings.builder()
                            .assertionConsumerServiceUrl(
                                "https://api.telnyx.com/sso/saml/auth/myorg"
                            )
                            .idpCertFingerprint(
                                "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                            )
                            .idpCertFingerprintAlgorithm(
                                AuthenticationProvider.Settings.IdpCertFingerprintAlgorithm.SHA256
                            )
                            .idpEntityId("https://myorg.myidp.com/saml/metadata")
                            .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                            .nameIdentifierFormat("urn:oasis:names:tc:SAML:1.1:nameid-format")
                            .serviceProviderEntityId(
                                "https://api.telnyx.com/sso/saml/metadata/myorg"
                            )
                            .build()
                    )
                    .shortName("myorg")
                    .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authenticationProviderUpdateResponse =
            AuthenticationProviderUpdateResponse.builder()
                .data(
                    AuthenticationProvider.builder()
                        .id("35146afd-df93-4963-b1e9-1a085e2ae874")
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .name("Okta")
                        .organizationId("24b4a4bb-c4df-46ad-bbcb-23fc741c5ad7")
                        .recordType("authentication_provider")
                        .settings(
                            AuthenticationProvider.Settings.builder()
                                .assertionConsumerServiceUrl(
                                    "https://api.telnyx.com/sso/saml/auth/myorg"
                                )
                                .idpCertFingerprint(
                                    "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                                )
                                .idpCertFingerprintAlgorithm(
                                    AuthenticationProvider.Settings.IdpCertFingerprintAlgorithm
                                        .SHA256
                                )
                                .idpEntityId("https://myorg.myidp.com/saml/metadata")
                                .idpSsoTargetUrl(
                                    "https://myorg.myidp.com/trust/saml2/http-post/sso"
                                )
                                .nameIdentifierFormat("urn:oasis:names:tc:SAML:1.1:nameid-format")
                                .serviceProviderEntityId(
                                    "https://api.telnyx.com/sso/saml/metadata/myorg"
                                )
                                .build()
                        )
                        .shortName("myorg")
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .build()

        val roundtrippedAuthenticationProviderUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authenticationProviderUpdateResponse),
                jacksonTypeRef<AuthenticationProviderUpdateResponse>(),
            )

        assertThat(roundtrippedAuthenticationProviderUpdateResponse)
            .isEqualTo(authenticationProviderUpdateResponse)
    }
}
