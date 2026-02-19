// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.externalconnections.ExternalConnectionCreateParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateLocationParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExternalConnectionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val externalConnectionServiceAsync = client.externalConnections()

        val externalConnectionFuture =
            externalConnectionServiceAsync.create(
                ExternalConnectionCreateParams.builder()
                    .externalSipConnection(
                        ExternalConnectionCreateParams.ExternalSipConnection.ZOOM
                    )
                    .outbound(
                        ExternalConnectionCreateParams.Outbound.builder()
                            .channelLimit(10L)
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .build()
                    )
                    .active(false)
                    .inbound(
                        ExternalConnectionCreateParams.Inbound.builder()
                            .outboundVoiceProfileId("12345678-1234-1234-1234-123456789012")
                            .channelLimit(10L)
                            .build()
                    )
                    .addTag("tag1")
                    .addTag("tag2")
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        val externalConnection = externalConnectionFuture.get()
        externalConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val externalConnectionServiceAsync = client.externalConnections()

        val externalConnectionFuture = externalConnectionServiceAsync.retrieve("id")

        val externalConnection = externalConnectionFuture.get()
        externalConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val externalConnectionServiceAsync = client.externalConnections()

        val externalConnectionFuture =
            externalConnectionServiceAsync.update(
                ExternalConnectionUpdateParams.builder()
                    .id("id")
                    .outbound(
                        ExternalConnectionUpdateParams.Outbound.builder()
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .channelLimit(10L)
                            .build()
                    )
                    .active(false)
                    .inbound(
                        ExternalConnectionUpdateParams.Inbound.builder().channelLimit(10L).build()
                    )
                    .addTag("tag1")
                    .addTag("tag2")
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        val externalConnection = externalConnectionFuture.get()
        externalConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val externalConnectionServiceAsync = client.externalConnections()

        val pageFuture = externalConnectionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val externalConnectionServiceAsync = client.externalConnections()

        val externalConnectionFuture = externalConnectionServiceAsync.delete("id")

        val externalConnection = externalConnectionFuture.get()
        externalConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateLocation() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val externalConnectionServiceAsync = client.externalConnections()

        val responseFuture =
            externalConnectionServiceAsync.updateLocation(
                ExternalConnectionUpdateLocationParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .staticEmergencyAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
