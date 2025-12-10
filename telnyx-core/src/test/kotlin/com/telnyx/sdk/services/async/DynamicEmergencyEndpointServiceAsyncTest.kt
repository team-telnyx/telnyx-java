// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpoint
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DynamicEmergencyEndpointServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dynamicEmergencyEndpointServiceAsync = client.dynamicEmergencyEndpoints()

        val dynamicEmergencyEndpointFuture =
            dynamicEmergencyEndpointServiceAsync.create(
                DynamicEmergencyEndpoint.builder()
                    .callbackNumber("+13125550000")
                    .callerName("Jane Doe Desk Phone")
                    .dynamicEmergencyAddressId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("dynamic_emergency_endpoint")
                    .sipFromId("FXDFWEDF")
                    .status(DynamicEmergencyEndpoint.Status.PENDING)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )

        val dynamicEmergencyEndpoint = dynamicEmergencyEndpointFuture.get()
        dynamicEmergencyEndpoint.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dynamicEmergencyEndpointServiceAsync = client.dynamicEmergencyEndpoints()

        val dynamicEmergencyEndpointFuture =
            dynamicEmergencyEndpointServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val dynamicEmergencyEndpoint = dynamicEmergencyEndpointFuture.get()
        dynamicEmergencyEndpoint.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dynamicEmergencyEndpointServiceAsync = client.dynamicEmergencyEndpoints()

        val pageFuture = dynamicEmergencyEndpointServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dynamicEmergencyEndpointServiceAsync = client.dynamicEmergencyEndpoints()

        val dynamicEmergencyEndpointFuture =
            dynamicEmergencyEndpointServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val dynamicEmergencyEndpoint = dynamicEmergencyEndpointFuture.get()
        dynamicEmergencyEndpoint.validate()
    }
}
