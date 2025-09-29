// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.phonenumbers

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.phonenumbers.actions.ActionChangeBundleStatusParams
import com.telnyx.api.models.phonenumbers.actions.ActionEnableEmergencyParams
import com.telnyx.api.models.phonenumbers.actions.ActionVerifyOwnershipParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun changeBundleStatus() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun enableEmergency() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun verifyOwnership() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.phoneNumbers().actions()

        val response =
            actionService.verifyOwnership(
                ActionVerifyOwnershipParams.builder().addPhoneNumber("+15551234567").build()
            )

        response.validate()
    }
}
