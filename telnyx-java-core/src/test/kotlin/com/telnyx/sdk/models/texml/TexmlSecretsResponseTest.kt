// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlSecretsResponseTest {

    @Test
    fun create() {
        val texmlSecretsResponse =
            TexmlSecretsResponse.builder()
                .data(
                    TexmlSecretsResponse.Data.builder()
                        .name("My Secret Name")
                        .value(TexmlSecretsResponse.Data.SecretValue.REDACTED)
                        .build()
                )
                .build()

        assertThat(texmlSecretsResponse.data())
            .contains(
                TexmlSecretsResponse.Data.builder()
                    .name("My Secret Name")
                    .value(TexmlSecretsResponse.Data.SecretValue.REDACTED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val texmlSecretsResponse =
            TexmlSecretsResponse.builder()
                .data(
                    TexmlSecretsResponse.Data.builder()
                        .name("My Secret Name")
                        .value(TexmlSecretsResponse.Data.SecretValue.REDACTED)
                        .build()
                )
                .build()

        val roundtrippedTexmlSecretsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(texmlSecretsResponse),
                jacksonTypeRef<TexmlSecretsResponse>(),
            )

        assertThat(roundtrippedTexmlSecretsResponse).isEqualTo(texmlSecretsResponse)
    }
}
