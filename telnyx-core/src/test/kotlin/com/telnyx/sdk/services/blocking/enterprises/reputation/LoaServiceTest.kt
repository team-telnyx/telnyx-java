// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises.reputation

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.enterprises.reputation.loa.LoaRenderParams
import com.telnyx.sdk.models.enterprises.reputation.loa.LoaUpdateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class LoaServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val loaService = client.enterprises().reputation().loa()

        val loa =
            loaService.update(
                LoaUpdateParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .build()
            )

        loa.validate()
    }

    @Test
    fun render(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val loaService = client.enterprises().reputation().loa()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            loaService.render(
                LoaRenderParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .agent(
                        LoaRenderParams.Agent.builder()
                            .administrativeArea("administrative_area")
                            .city("city")
                            .contactEmail("dev@stainless.com")
                            .contactName("contact_name")
                            .contactPhone("+13125550000")
                            .contactTitle("contact_title")
                            .country("US")
                            .legalName("legal_name")
                            .postalCode("postal_code")
                            .streetAddress("street_address")
                            .dba("dba")
                            .extendedAddress("extended_address")
                            .build()
                    )
                    .signature(
                        LoaRenderParams.Signature.builder()
                            .imageBase64("image_base64")
                            .signerName("signer_name")
                            .build()
                    )
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }
}
