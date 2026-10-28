// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.networkroutes.NetworkRouteCreateParams
import com.telnyx.sdk.models.networkroutes.NetworkRouteListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NetworkRouteServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val networkRouteServiceAsync = client.networkRoutes()

        val networkRouteFuture =
            networkRouteServiceAsync.create(
                NetworkRouteCreateParams.builder()
                    .cidr("10.20.0.0/16")
                    .networkId("91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24")
                    .nextHop(
                        NetworkRouteCreateParams.NextHop.builder()
                            .id("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")
                            .type(NetworkRouteCreateParams.NextHop.Type.TUNNEL)
                            .build()
                    )
                    .build()
            )

        val networkRoute = networkRouteFuture.get()
        networkRoute.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val networkRouteServiceAsync = client.networkRoutes()

        val networkRouteFuture =
            networkRouteServiceAsync.retrieve("e8a2c5d0-3f7b-4a19-b6d2-9c1e0f8a7b53")

        val networkRoute = networkRouteFuture.get()
        networkRoute.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val networkRouteServiceAsync = client.networkRoutes()

        val networkRoutesFuture =
            networkRouteServiceAsync.list(
                NetworkRouteListParams.builder()
                    .filter(
                        NetworkRouteListParams.Filter.builder()
                            .networkId("91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24")
                            .cidr("10.20.0.0/16")
                            .nextHopType(NetworkRouteListParams.Filter.NextHopType.TUNNEL)
                            .origin(NetworkRouteListParams.Filter.Origin.STATIC)
                            .status(NetworkRouteListParams.Filter.Status.ACTIVE)
                            .build()
                    )
                    .page(NetworkRouteListParams.Page.builder().after("after").limit(1L).build())
                    .sort(NetworkRouteListParams.Sort.CREATED_AT_DESC)
                    .build()
            )

        val networkRoutes = networkRoutesFuture.get()
        networkRoutes.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val networkRouteServiceAsync = client.networkRoutes()

        val future = networkRouteServiceAsync.delete("e8a2c5d0-3f7b-4a19-b6d2-9c1e0f8a7b53")

        val response = future.get()
    }
}
