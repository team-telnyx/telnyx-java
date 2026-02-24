// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.phonenumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.phonenumbers.actions.ActionChangeBundleStatusParams
import com.telnyx.sdk.models.phonenumbers.actions.ActionEnableEmergencyParams
import com.telnyx.sdk.models.phonenumbers.actions.ActionVerifyOwnershipParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun changeBundleStatus() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.phoneNumbers().actions()

        val response =
            actionService.changeBundleStatus(
                ActionChangeBundleStatusParams.builder()
                    .id("1293384261075731499")
                    .bundleId("5194d8fc-87e6-4188-baa9-1c434bbe861b")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun enableEmergency() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.phoneNumbers().actions()

        val response =
            actionService.enableEmergency(
                ActionEnableEmergencyParams.builder()
                    .id("1293384261075731499")
                    .emergencyAddressId("53829456729313")
                    .emergencyEnabled(true)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun verifyOwnership() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.phoneNumbers().actions()

        val response =
            actionService.verifyOwnership(
                ActionVerifyOwnershipParams.builder().addPhoneNumber("+15551234567").build()
            )

        response.validate()
    }
}
