// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailMessageUpdateScheduleParamsTest {

    @Test
    fun create() {
        EmailMessageUpdateScheduleParams.builder()
            .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .scheduledAt(OffsetDateTime.parse("2099-08-07T14:30:00Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EmailMessageUpdateScheduleParams.builder()
                .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scheduledAt(OffsetDateTime.parse("2099-08-07T14:30:00Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EmailMessageUpdateScheduleParams.builder()
                .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scheduledAt(OffsetDateTime.parse("2099-08-07T14:30:00Z"))
                .build()

        val body = params._body()

        assertThat(body.scheduledAt()).isEqualTo(OffsetDateTime.parse("2099-08-07T14:30:00Z"))
    }
}
