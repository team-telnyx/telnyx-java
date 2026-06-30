// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callreasons

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallReasonValidateParamsTest {

    @Test
    fun create() {
        CallReasonValidateParams.builder()
            .addBody("Appointment reminders")
            .addBody("Billing inquiries")
            .build()
    }

    @Test
    fun body() {
        val params =
            CallReasonValidateParams.builder()
                .addBody("Appointment reminders")
                .addBody("Billing inquiries")
                .build()

        val body = params._body()

        assertThat(body).containsExactly("Appointment reminders", "Billing inquiries")
    }
}
