// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.telnyx.sdk.models.enterprises.reputation.loa.AgentInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirLoaParamsTest {

    @Test
    fun create() {
        DirLoaParams.builder()
            .dirId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addPhoneNumber("+13125550000")
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
                DirLoaParams.Signature.builder().imageBase64("x").signerName("signer_name").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DirLoaParams.builder()
                .dirId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPhoneNumber("+13125550000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DirLoaParams.builder()
                .dirId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPhoneNumber("+13125550000")
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
                    DirLoaParams.Signature.builder()
                        .imageBase64("x")
                        .signerName("signer_name")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.phoneNumbers()).containsExactly("+13125550000")
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
                DirLoaParams.Signature.builder().imageBase64("x").signerName("signer_name").build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DirLoaParams.builder()
                .dirId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPhoneNumber("+13125550000")
                .build()

        val body = params._body()

        assertThat(body.phoneNumbers()).containsExactly("+13125550000")
    }
}
