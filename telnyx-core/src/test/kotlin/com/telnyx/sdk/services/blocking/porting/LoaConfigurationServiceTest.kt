// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.porting

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationCreateParams
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationPreview0Params
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationUpdateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class LoaConfigurationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val loaConfigurationService = client.porting().loaConfigurations()

        val loaConfiguration =
            loaConfigurationService.create(
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

        loaConfiguration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val loaConfigurationService = client.porting().loaConfigurations()

        val loaConfiguration =
            loaConfigurationService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        loaConfiguration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val loaConfigurationService = client.porting().loaConfigurations()

        val loaConfiguration =
            loaConfigurationService.update(
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

        loaConfiguration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val loaConfigurationService = client.porting().loaConfigurations()

        val page = loaConfigurationService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val loaConfigurationService = client.porting().loaConfigurations()

        loaConfigurationService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun preview0(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val loaConfigurationService = client.porting().loaConfigurations()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            loaConfigurationService.preview0(
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

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun preview1(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val loaConfigurationService = client.porting().loaConfigurations()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response = loaConfigurationService.preview1("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        assertThat(response.body()).hasContent("abc")
    }
}
