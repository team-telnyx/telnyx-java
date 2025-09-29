// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingprofiles.autorespconfigs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoRespConfigCreateTest {

    @Test
    fun create() {
        val autoRespConfigCreate =
            AutoRespConfigCreate.builder()
                .countryCode("US")
                .addKeyword("keyword1")
                .addKeyword("keyword2")
                .op(AutoRespConfigCreate.Op.START)
                .respText("Thank you for your message")
                .build()

        assertThat(autoRespConfigCreate.countryCode()).isEqualTo("US")
        assertThat(autoRespConfigCreate.keywords()).containsExactly("keyword1", "keyword2")
        assertThat(autoRespConfigCreate.op()).isEqualTo(AutoRespConfigCreate.Op.START)
        assertThat(autoRespConfigCreate.respText()).contains("Thank you for your message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autoRespConfigCreate =
            AutoRespConfigCreate.builder()
                .countryCode("US")
                .addKeyword("keyword1")
                .addKeyword("keyword2")
                .op(AutoRespConfigCreate.Op.START)
                .respText("Thank you for your message")
                .build()

        val roundtrippedAutoRespConfigCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autoRespConfigCreate),
                jacksonTypeRef<AutoRespConfigCreate>(),
            )

        assertThat(roundtrippedAutoRespConfigCreate).isEqualTo(autoRespConfigCreate)
    }
}
