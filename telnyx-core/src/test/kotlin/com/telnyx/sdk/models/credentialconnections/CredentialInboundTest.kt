// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.credentialconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialInboundTest {

    @Test
    fun create() {
        val credentialInbound =
            CredentialInbound.builder()
                .aniNumberFormat(CredentialInbound.AniNumberFormat.PLUS_E_164)
                .channelLimit(10L)
                .addCodec("string")
                .dnisNumberFormat(CredentialInbound.DnisNumberFormat.PLUS_E164)
                .generateRingbackTone(true)
                .isupHeadersEnabled(true)
                .prackEnabled(true)
                .shakenStirEnabled(true)
                .sipCompactHeadersEnabled(true)
                .timeout1xxSecs(10L)
                .timeout2xxSecs(20L)
                .build()

        assertThat(credentialInbound.aniNumberFormat())
            .contains(CredentialInbound.AniNumberFormat.PLUS_E_164)
        assertThat(credentialInbound.channelLimit()).contains(10L)
        assertThat(credentialInbound.codecs().getOrNull()).containsExactly("string")
        assertThat(credentialInbound.dnisNumberFormat())
            .contains(CredentialInbound.DnisNumberFormat.PLUS_E164)
        assertThat(credentialInbound.generateRingbackTone()).contains(true)
        assertThat(credentialInbound.isupHeadersEnabled()).contains(true)
        assertThat(credentialInbound.prackEnabled()).contains(true)
        assertThat(credentialInbound.shakenStirEnabled()).contains(true)
        assertThat(credentialInbound.sipCompactHeadersEnabled()).contains(true)
        assertThat(credentialInbound.timeout1xxSecs()).contains(10L)
        assertThat(credentialInbound.timeout2xxSecs()).contains(20L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credentialInbound =
            CredentialInbound.builder()
                .aniNumberFormat(CredentialInbound.AniNumberFormat.PLUS_E_164)
                .channelLimit(10L)
                .addCodec("string")
                .dnisNumberFormat(CredentialInbound.DnisNumberFormat.PLUS_E164)
                .generateRingbackTone(true)
                .isupHeadersEnabled(true)
                .prackEnabled(true)
                .shakenStirEnabled(true)
                .sipCompactHeadersEnabled(true)
                .timeout1xxSecs(10L)
                .timeout2xxSecs(20L)
                .build()

        val roundtrippedCredentialInbound =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialInbound),
                jacksonTypeRef<CredentialInbound>(),
            )

        assertThat(roundtrippedCredentialInbound).isEqualTo(credentialInbound)
    }
}
