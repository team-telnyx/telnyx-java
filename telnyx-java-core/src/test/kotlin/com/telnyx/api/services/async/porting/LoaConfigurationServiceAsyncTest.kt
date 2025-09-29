// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.porting

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationCreateParams
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationListParams
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationPreview0Params
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationUpdateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class LoaConfigurationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val loaConfigurationServiceAsync = client.porting().loaConfigurations()

        val loaConfigurationFuture =
            loaConfigurationServiceAsync.create(
                LoaConfigurationCreateParams.builder()
                    .address(
                        LoaConfigurationCreateParams.Address.builder()
                            .city("Austin")
                            .countryCode("US")
                            .state("TX")
                            .streetAddress("600 Congress Avenue")
                            .zipCode("78701")
                            .extendedAddress("14th Floor")
                            .build()
                    )
                    .companyName("Telnyx")
                    .contact(
                        LoaConfigurationCreateParams.Contact.builder()
                            .email("testing@telnyx.com")
                            .phoneNumber("+12003270001")
                            .build()
                    )
                    .logo(
                        LoaConfigurationCreateParams.Logo.builder()
                            .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .name("My LOA Configuration")
                    .build()
            )

        val loaConfiguration = loaConfigurationFuture.get()
        loaConfiguration.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val loaConfigurationServiceAsync = client.porting().loaConfigurations()

        val loaConfigurationFuture =
            loaConfigurationServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val loaConfiguration = loaConfigurationFuture.get()
        loaConfiguration.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val loaConfigurationServiceAsync = client.porting().loaConfigurations()

        val loaConfigurationFuture =
            loaConfigurationServiceAsync.update(
                LoaConfigurationUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .address(
                        LoaConfigurationUpdateParams.Address.builder()
                            .city("Austin")
                            .countryCode("US")
                            .state("TX")
                            .streetAddress("600 Congress Avenue")
                            .zipCode("78701")
                            .extendedAddress("14th Floor")
                            .build()
                    )
                    .companyName("Telnyx")
                    .contact(
                        LoaConfigurationUpdateParams.Contact.builder()
                            .email("testing@telnyx.com")
                            .phoneNumber("+12003270001")
                            .build()
                    )
                    .logo(
                        LoaConfigurationUpdateParams.Logo.builder()
                            .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .name("My LOA Configuration")
                    .build()
            )

        val loaConfiguration = loaConfigurationFuture.get()
        loaConfiguration.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val loaConfigurationServiceAsync = client.porting().loaConfigurations()

        val loaConfigurationsFuture =
            loaConfigurationServiceAsync.list(
                LoaConfigurationListParams.builder()
                    .page(LoaConfigurationListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val loaConfigurations = loaConfigurationsFuture.get()
        loaConfigurations.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val loaConfigurationServiceAsync = client.porting().loaConfigurations()

        val future = loaConfigurationServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Test
    fun preview0(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val loaConfigurationServiceAsync = client.porting().loaConfigurations()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            loaConfigurationServiceAsync.preview0(
                LoaConfigurationPreview0Params.builder()
                    .address(
                        LoaConfigurationPreview0Params.Address.builder()
                            .city("Austin")
                            .countryCode("US")
                            .state("TX")
                            .streetAddress("600 Congress Avenue")
                            .zipCode("78701")
                            .extendedAddress("14th Floor")
                            .build()
                    )
                    .companyName("Telnyx")
                    .contact(
                        LoaConfigurationPreview0Params.Contact.builder()
                            .email("testing@telnyx.com")
                            .phoneNumber("+12003270001")
                            .build()
                    )
                    .logo(
                        LoaConfigurationPreview0Params.Logo.builder()
                            .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .name("My LOA Configuration")
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun preview1(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val loaConfigurationServiceAsync = client.porting().loaConfigurations()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            loaConfigurationServiceAsync.preview1("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }
}
