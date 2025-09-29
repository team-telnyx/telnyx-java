// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderCreateParams
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderListParams
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderUpdateParams
import com.telnyx.api.models.authenticationproviders.Settings
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuthenticationProviderServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authenticationProviderServiceAsync = client.authenticationProviders()

        val authenticationProviderFuture =
            authenticationProviderServiceAsync.create(
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

        val authenticationProvider = authenticationProviderFuture.get()
        authenticationProvider.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authenticationProviderServiceAsync = client.authenticationProviders()

        val authenticationProviderFuture = authenticationProviderServiceAsync.retrieve("id")

        val authenticationProvider = authenticationProviderFuture.get()
        authenticationProvider.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authenticationProviderServiceAsync = client.authenticationProviders()

        val authenticationProviderFuture =
            authenticationProviderServiceAsync.update(
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

        val authenticationProvider = authenticationProviderFuture.get()
        authenticationProvider.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authenticationProviderServiceAsync = client.authenticationProviders()

        val authenticationProvidersFuture =
            authenticationProviderServiceAsync.list(
                AuthenticationProviderListParams.builder()
                    .page(
                        AuthenticationProviderListParams.Page.builder().number(1L).size(1L).build()
                    )
                    .sort(AuthenticationProviderListParams.Sort.NAME)
                    .build()
            )

        val authenticationProviders = authenticationProvidersFuture.get()
        authenticationProviders.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authenticationProviderServiceAsync = client.authenticationProviders()

        val authenticationProviderFuture = authenticationProviderServiceAsync.delete("id")

        val authenticationProvider = authenticationProviderFuture.get()
        authenticationProvider.validate()
    }
}
