// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionCreateParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MobileVoiceConnectionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mobileVoiceConnectionService = client.mobileVoiceConnections()

        val mobileVoiceConnection =
            mobileVoiceConnectionService.create(
                MobileVoiceConnectionCreateParams.builder()
                    .active(true)
                    .connectionName("connection_name")
                    .inbound(
                        MobileVoiceConnectionCreateParams.Inbound.builder().channelLimit(0L).build()
                    )
                    .outbound(
                        MobileVoiceConnectionCreateParams.Outbound.builder()
                            .channelLimit(0L)
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .build()
                    )
                    .addTag("string")
                    .webhookApiVersion(MobileVoiceConnectionCreateParams.WebhookApiVersion.V1)
                    .webhookEventFailoverUrl("webhook_event_failover_url")
                    .webhookEventUrl("webhook_event_url")
                    .webhookTimeoutSecs(0L)
                    .build()
            )

        mobileVoiceConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mobileVoiceConnectionService = client.mobileVoiceConnections()

        val mobileVoiceConnection = mobileVoiceConnectionService.retrieve("id")

        mobileVoiceConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mobileVoiceConnectionService = client.mobileVoiceConnections()

        val mobileVoiceConnection =
            mobileVoiceConnectionService.update(
                MobileVoiceConnectionUpdateParams.builder()
                    .id("id")
                    .active(true)
                    .connectionName("connection_name")
                    .inbound(
                        MobileVoiceConnectionUpdateParams.Inbound.builder().channelLimit(0L).build()
                    )
                    .outbound(
                        MobileVoiceConnectionUpdateParams.Outbound.builder()
                            .channelLimit(0L)
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .build()
                    )
                    .addTag("string")
                    .webhookApiVersion(MobileVoiceConnectionUpdateParams.WebhookApiVersion.V1)
                    .webhookEventFailoverUrl("webhook_event_failover_url")
                    .webhookEventUrl("webhook_event_url")
                    .webhookTimeoutSecs(0L)
                    .build()
            )

        mobileVoiceConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mobileVoiceConnectionService = client.mobileVoiceConnections()

        val page = mobileVoiceConnectionService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mobileVoiceConnectionService = client.mobileVoiceConnections()

        val mobileVoiceConnection = mobileVoiceConnectionService.delete("id")

        mobileVoiceConnection.validate()
    }
}
