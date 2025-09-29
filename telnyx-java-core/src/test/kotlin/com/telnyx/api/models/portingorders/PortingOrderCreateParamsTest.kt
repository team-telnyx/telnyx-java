// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderCreateParamsTest {

    @Test
    fun create() {
        PortingOrderCreateParams.builder()
            .phoneNumbers(listOf("+13035550000", "+13035550001", "+13035550002"))
            .customerGroupReference("Group-456")
            .customerReference("Acct 123abc")
            .build()
    }

    @Test
    fun body() {
        val params =
            PortingOrderCreateParams.builder()
                .phoneNumbers(listOf("+13035550000", "+13035550001", "+13035550002"))
                .customerGroupReference("Group-456")
                .customerReference("Acct 123abc")
                .build()

        val body = params._body()

        assertThat(body.phoneNumbers())
            .containsExactly("+13035550000", "+13035550001", "+13035550002")
        assertThat(body.customerGroupReference()).contains("Group-456")
        assertThat(body.customerReference()).contains("Acct 123abc")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PortingOrderCreateParams.builder()
                .phoneNumbers(listOf("+13035550000", "+13035550001", "+13035550002"))
                .build()

        val body = params._body()

        assertThat(body.phoneNumbers())
            .containsExactly("+13035550000", "+13035550001", "+13035550002")
    }
}
