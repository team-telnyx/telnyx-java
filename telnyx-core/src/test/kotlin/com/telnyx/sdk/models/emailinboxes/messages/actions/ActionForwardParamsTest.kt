// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionForwardParamsTest {

    @Test
    fun create() {
        ActionForwardParams.builder()
            .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .to("new@example.com")
            .bccOfRecipientList(listOf(InboxActionEmailAddressInput.ofString("blind@example.com")))
            .ccOfRecipientList(
                listOf(
                    InboxActionEmailAddressInput.ofRecipientAddress(
                        InboxActionEmailAddressInput.InboxRecipientAddress.builder()
                            .email("copy@example.com")
                            .name("name")
                            .build()
                    )
                )
            )
            .html("html")
            .text("FYI")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionForwardParams.builder()
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .to("new@example.com")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionForwardParams.builder()
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .to("new@example.com")
                .bccOfRecipientList(
                    listOf(InboxActionEmailAddressInput.ofString("blind@example.com"))
                )
                .ccOfRecipientList(
                    listOf(
                        InboxActionEmailAddressInput.ofRecipientAddress(
                            InboxActionEmailAddressInput.InboxRecipientAddress.builder()
                                .email("copy@example.com")
                                .name("name")
                                .build()
                        )
                    )
                )
                .html("html")
                .text("FYI")
                .build()

        val body = params._body()

        assertThat(body.to()).isEqualTo(ActionForwardParams.To.ofString("new@example.com"))
        assertThat(body.bcc())
            .contains(
                InboxActionRecipientInput.ofRecipientList(
                    listOf(InboxActionEmailAddressInput.ofString("blind@example.com"))
                )
            )
        assertThat(body.cc())
            .contains(
                InboxActionRecipientInput.ofRecipientList(
                    listOf(
                        InboxActionEmailAddressInput.ofRecipientAddress(
                            InboxActionEmailAddressInput.InboxRecipientAddress.builder()
                                .email("copy@example.com")
                                .name("name")
                                .build()
                        )
                    )
                )
            )
        assertThat(body.html()).contains("html")
        assertThat(body.text()).contains("FYI")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionForwardParams.builder()
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .to("new@example.com")
                .build()

        val body = params._body()

        assertThat(body.to()).isEqualTo(ActionForwardParams.To.ofString("new@example.com"))
    }
}
