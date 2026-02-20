// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.authenticationproviders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthenticationProviderTest {

    @Test
    fun create() {
        val authenticationProvider =
            AuthenticationProvider.builder()
                .id("35146afd-df93-4963-b1e9-1a085e2ae874")
                .activatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .active(true)
                .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .name("Okta")
                .organizationId("24b4a4bb-c4df-46ad-bbcb-23fc741c5ad7")
                .recordType("authentication_provider")
                .settings(
                    AuthenticationProvider.Settings.builder()
                        .assertionConsumerServiceUrl("https://api.telnyx.com/sso/saml/auth/myorg")
                        .idpAttributeNames(
                            JsonValue.from(
                                mapOf(
                                    "email" to
                                        "http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress"
                                )
                            )
                        )
                        .idpCertFingerprint(
                            "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                        )
                        .idpCertFingerprintAlgorithm(
                            AuthenticationProvider.Settings.IdpCertFingerprintAlgorithm.SHA256
                        )
                        .idpCertificate(
                            "-----BEGIN CERTIFICATE-----\nMIIC...\n-----END CERTIFICATE-----"
                        )
                        .idpEntityId("https://myorg.myidp.com/saml/metadata")
                        .idpSloTargetUrl("https://myorg.myidp.com/trust/saml2/http-redirect/slo")
                        .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                        .nameIdentifierFormat("urn:oasis:names:tc:SAML:1.1:nameid-format")
                        .provisionGroups(false)
                        .serviceProviderEntityId("https://api.telnyx.com/sso/saml/metadata/myorg")
                        .serviceProviderLoginUrl("https://api.telnyx.com/sso/myorg")
                        .build()
                )
                .shortName("myorg")
                .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .build()

        assertThat(authenticationProvider.id()).contains("35146afd-df93-4963-b1e9-1a085e2ae874")
        assertThat(authenticationProvider.activatedAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
        assertThat(authenticationProvider.active()).contains(true)
        assertThat(authenticationProvider.createdAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
        assertThat(authenticationProvider.name()).contains("Okta")
        assertThat(authenticationProvider.organizationId())
            .contains("24b4a4bb-c4df-46ad-bbcb-23fc741c5ad7")
        assertThat(authenticationProvider.recordType()).contains("authentication_provider")
        assertThat(authenticationProvider.settings())
            .contains(
                AuthenticationProvider.Settings.builder()
                    .assertionConsumerServiceUrl("https://api.telnyx.com/sso/saml/auth/myorg")
                    .idpAttributeNames(
                        JsonValue.from(
                            mapOf(
                                "email" to
                                    "http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress"
                            )
                        )
                    )
                    .idpCertFingerprint(
                        "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                    )
                    .idpCertFingerprintAlgorithm(
                        AuthenticationProvider.Settings.IdpCertFingerprintAlgorithm.SHA256
                    )
                    .idpCertificate(
                        "-----BEGIN CERTIFICATE-----\nMIIC...\n-----END CERTIFICATE-----"
                    )
                    .idpEntityId("https://myorg.myidp.com/saml/metadata")
                    .idpSloTargetUrl("https://myorg.myidp.com/trust/saml2/http-redirect/slo")
                    .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                    .nameIdentifierFormat("urn:oasis:names:tc:SAML:1.1:nameid-format")
                    .provisionGroups(false)
                    .serviceProviderEntityId("https://api.telnyx.com/sso/saml/metadata/myorg")
                    .serviceProviderLoginUrl("https://api.telnyx.com/sso/myorg")
                    .build()
            )
        assertThat(authenticationProvider.shortName()).contains("myorg")
        assertThat(authenticationProvider.updatedAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authenticationProvider =
            AuthenticationProvider.builder()
                .id("35146afd-df93-4963-b1e9-1a085e2ae874")
                .activatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .active(true)
                .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .name("Okta")
                .organizationId("24b4a4bb-c4df-46ad-bbcb-23fc741c5ad7")
                .recordType("authentication_provider")
                .settings(
                    AuthenticationProvider.Settings.builder()
                        .assertionConsumerServiceUrl("https://api.telnyx.com/sso/saml/auth/myorg")
                        .idpAttributeNames(
                            JsonValue.from(
                                mapOf(
                                    "email" to
                                        "http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress"
                                )
                            )
                        )
                        .idpCertFingerprint(
                            "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                        )
                        .idpCertFingerprintAlgorithm(
                            AuthenticationProvider.Settings.IdpCertFingerprintAlgorithm.SHA256
                        )
                        .idpCertificate(
                            "-----BEGIN CERTIFICATE-----\nMIIC...\n-----END CERTIFICATE-----"
                        )
                        .idpEntityId("https://myorg.myidp.com/saml/metadata")
                        .idpSloTargetUrl("https://myorg.myidp.com/trust/saml2/http-redirect/slo")
                        .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                        .nameIdentifierFormat("urn:oasis:names:tc:SAML:1.1:nameid-format")
                        .provisionGroups(false)
                        .serviceProviderEntityId("https://api.telnyx.com/sso/saml/metadata/myorg")
                        .serviceProviderLoginUrl("https://api.telnyx.com/sso/myorg")
                        .build()
                )
                .shortName("myorg")
                .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .build()

        val roundtrippedAuthenticationProvider =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authenticationProvider),
                jacksonTypeRef<AuthenticationProvider>(),
            )

        assertThat(roundtrippedAuthenticationProvider).isEqualTo(authenticationProvider)
    }
}
