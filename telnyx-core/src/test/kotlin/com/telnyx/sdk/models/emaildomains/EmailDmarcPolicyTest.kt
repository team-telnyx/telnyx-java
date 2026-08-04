// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDmarcPolicyTest {

    @Test
    fun create() {
        val emailDmarcPolicy =
            EmailDmarcPolicy.builder()
                .p(EmailDmarcPolicy.P.NONE)
                .pct(0L)
                .rua("rua")
                .sp(EmailDmarcPolicy.Sp.NONE)
                .build()

        assertThat(emailDmarcPolicy.p()).contains(EmailDmarcPolicy.P.NONE)
        assertThat(emailDmarcPolicy.pct()).contains(0L)
        assertThat(emailDmarcPolicy.rua()).contains("rua")
        assertThat(emailDmarcPolicy.sp()).contains(EmailDmarcPolicy.Sp.NONE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailDmarcPolicy =
            EmailDmarcPolicy.builder()
                .p(EmailDmarcPolicy.P.NONE)
                .pct(0L)
                .rua("rua")
                .sp(EmailDmarcPolicy.Sp.NONE)
                .build()

        val roundtrippedEmailDmarcPolicy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailDmarcPolicy),
                jacksonTypeRef<EmailDmarcPolicy>(),
            )

        assertThat(roundtrippedEmailDmarcPolicy).isEqualTo(emailDmarcPolicy)
    }
}
