// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalConnectionUpdateLocationResponseTest {

    @Test
    fun create() {
        val externalConnectionUpdateLocationResponse =
            ExternalConnectionUpdateLocationResponse.builder()
                .data(
                    ExternalConnectionUpdateLocationResponse.Data.builder()
                        .acceptedAddressSuggestions(true)
                        .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .staticEmergencyAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(externalConnectionUpdateLocationResponse.data())
            .contains(
                ExternalConnectionUpdateLocationResponse.Data.builder()
                    .acceptedAddressSuggestions(true)
                    .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .staticEmergencyAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalConnectionUpdateLocationResponse =
            ExternalConnectionUpdateLocationResponse.builder()
                .data(
                    ExternalConnectionUpdateLocationResponse.Data.builder()
                        .acceptedAddressSuggestions(true)
                        .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .staticEmergencyAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedExternalConnectionUpdateLocationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalConnectionUpdateLocationResponse),
                jacksonTypeRef<ExternalConnectionUpdateLocationResponse>(),
            )

        assertThat(roundtrippedExternalConnectionUpdateLocationResponse)
            .isEqualTo(externalConnectionUpdateLocationResponse)
    }
}
