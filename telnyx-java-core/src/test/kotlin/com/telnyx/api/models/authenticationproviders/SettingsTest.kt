// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.authenticationproviders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingsTest {

    @Test
    fun create() {
        val settings =
            Settings.builder()
                .idpCertFingerprint("13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7")
                .idpEntityId("https://myorg.myidp.com/saml/metadata")
                .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                .idpCertFingerprintAlgorithm(Settings.IdpCertFingerprintAlgorithm.SHA256)
                .build()

        assertThat(settings.idpCertFingerprint())
            .isEqualTo("13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7")
        assertThat(settings.idpEntityId()).isEqualTo("https://myorg.myidp.com/saml/metadata")
        assertThat(settings.idpSsoTargetUrl())
            .isEqualTo("https://myorg.myidp.com/trust/saml2/http-post/sso")
        assertThat(settings.idpCertFingerprintAlgorithm())
            .contains(Settings.IdpCertFingerprintAlgorithm.SHA256)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settings =
            Settings.builder()
                .idpCertFingerprint("13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7")
                .idpEntityId("https://myorg.myidp.com/saml/metadata")
                .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                .idpCertFingerprintAlgorithm(Settings.IdpCertFingerprintAlgorithm.SHA256)
                .build()

        val roundtrippedSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settings),
                jacksonTypeRef<Settings>(),
            )

        assertThat(roundtrippedSettings).isEqualTo(settings)
    }
}
