// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.machinepayments.MachinePaymentAccountCreditParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MachinePaymentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun accountCredit() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val machinePaymentService = client.machinePayments()

        val response =
            machinePaymentService.accountCredit(
                MachinePaymentAccountCreditParams.builder().amountUsd("10.00").build()
            )

        response.validate()
    }
}
