// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.phonenumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.phonenumbers.actions.ActionChangeBundleStatusParams
import com.telnyx.sdk.models.phonenumbers.actions.ActionEnableEmergencyParams
import com.telnyx.sdk.models.phonenumbers.actions.ActionVerifyOwnershipParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun changeBundleStatus() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.phoneNumbers().actions()

        val responseFuture =
            actionServiceAsync.changeBundleStatus(
                ActionChangeBundleStatusParams.builder()
                    .id("1293384261075731499")
                    .bundleId("5194d8fc-87e6-4188-baa9-1c434bbe861b")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun enableEmergency() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.phoneNumbers().actions()

        val responseFuture =
            actionServiceAsync.enableEmergency(
                ActionEnableEmergencyParams.builder()
                    .id("1293384261075731499")
                    .emergencyAddressId("53829456729313")
                    .emergencyEnabled(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun verifyOwnership() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.phoneNumbers().actions()

        val responseFuture =
            actionServiceAsync.verifyOwnership(
                ActionVerifyOwnershipParams.builder().addPhoneNumber("+15551234567").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
