// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.externalconnections.ExternalConnectionCreateParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateLocationParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExternalConnectionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val externalConnectionService = client.externalConnections()

        val externalConnection =
            externalConnectionService.create(
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

        externalConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val externalConnectionService = client.externalConnections()

        val externalConnection = externalConnectionService.retrieve("id")

        externalConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val externalConnectionService = client.externalConnections()

        val externalConnection =
            externalConnectionService.update(
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

        externalConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val externalConnectionService = client.externalConnections()

        val page = externalConnectionService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val externalConnectionService = client.externalConnections()

        val externalConnection = externalConnectionService.delete("id")

        externalConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateLocation() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val externalConnectionService = client.externalConnections()

        val response =
            externalConnectionService.updateLocation(
                ExternalConnectionUpdateLocationParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .staticEmergencyAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
