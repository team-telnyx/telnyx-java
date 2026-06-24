// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.loa

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LoaRenderParamsTest {

    @Test
    fun create() {
        LoaRenderParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .agent(
                AgentInput.builder()
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
    }

    @Test
    fun pathParams() {
        val params =
            LoaRenderParams.builder().enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6").build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LoaRenderParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .agent(
                    AgentInput.builder()
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

        val body = params._body()

        assertThat(body.agent())
            .contains(
                AgentInput.builder()
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
        assertThat(body.signature())
            .contains(
                LoaRenderParams.Signature.builder()
                    .imageBase64("image_base64")
                    .signerName("signer_name")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LoaRenderParams.builder().enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6").build()

        val body = params._body()
    }
}
