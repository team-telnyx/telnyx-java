// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderCreateParams
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderListParams
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderUpdateParams
import com.telnyx.sdk.models.authenticationproviders.Settings
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuthenticationProviderServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authenticationProviderService = client.authenticationProviders()

        val authenticationProvider =
            authenticationProviderService.create(
                AuthenticationProviderCreateParams.builder()
                    .name("Okta")
                    .settings(
                        Settings.builder()
                            .idpCertFingerprint(
                                "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7"
                            )
                            .idpEntityId("https://myorg.myidp.com/saml/metadata")
                            .idpSsoTargetUrl("https://myorg.myidp.com/trust/saml2/http-post/sso")
                            .idpCertFingerprintAlgorithm(
                                Settings.IdpCertFingerprintAlgorithm.SHA256
                            )
                            .build()
                    )
                    .shortName("myorg")
                    .active(true)
                    .settingsUrl("https://myorg.myidp.com/saml/metadata")
                    .build()
            )

        authenticationProvider.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authenticationProviderService = client.authenticationProviders()

        val authenticationProvider = authenticationProviderService.retrieve("id")

        authenticationProvider.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authenticationProviderService = client.authenticationProviders()

        val authenticationProvider =
            authenticationProviderService.update(
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
            )

        authenticationProvider.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authenticationProviderService = client.authenticationProviders()

        val authenticationProviders =
            authenticationProviderService.list(
                AuthenticationProviderListParams.builder()
                    .page(
                        AuthenticationProviderListParams.Page.builder().number(1L).size(1L).build()
                    )
                    .sort(AuthenticationProviderListParams.Sort.NAME)
                    .build()
            )

        authenticationProviders.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authenticationProviderService = client.authenticationProviders()

        val authenticationProvider = authenticationProviderService.delete("id")

        authenticationProvider.validate()
    }
}
