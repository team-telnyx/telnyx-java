// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionCreateParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionListParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MobileVoiceConnectionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobileVoiceConnectionServiceAsync = client.mobileVoiceConnections()

        val mobileVoiceConnectionFuture =
            mobileVoiceConnectionServiceAsync.create(
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
                    .webhookApiVersion(MobileVoiceConnectionCreateParams.WebhookApiVersion._1)
                    .webhookEventFailoverUrl("webhook_event_failover_url")
                    .webhookEventUrl("webhook_event_url")
                    .webhookTimeoutSecs(0L)
                    .build()
            )

        val mobileVoiceConnection = mobileVoiceConnectionFuture.get()
        mobileVoiceConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobileVoiceConnectionServiceAsync = client.mobileVoiceConnections()

        val mobileVoiceConnectionFuture = mobileVoiceConnectionServiceAsync.retrieve("id")

        val mobileVoiceConnection = mobileVoiceConnectionFuture.get()
        mobileVoiceConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobileVoiceConnectionServiceAsync = client.mobileVoiceConnections()

        val mobileVoiceConnectionFuture =
            mobileVoiceConnectionServiceAsync.update(
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
                    .webhookApiVersion(MobileVoiceConnectionUpdateParams.WebhookApiVersion._1)
                    .webhookEventFailoverUrl("webhook_event_failover_url")
                    .webhookEventUrl("webhook_event_url")
                    .webhookTimeoutSecs(0L)
                    .build()
            )

        val mobileVoiceConnection = mobileVoiceConnectionFuture.get()
        mobileVoiceConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobileVoiceConnectionServiceAsync = client.mobileVoiceConnections()

        val mobileVoiceConnectionsFuture =
            mobileVoiceConnectionServiceAsync.list(
                MobileVoiceConnectionListParams.builder()
                    .filterConnectionNameContains("filter[connection_name][contains]")
                    .pageNumber(0L)
                    .pageSize(0L)
                    .sort("sort")
                    .build()
            )

        val mobileVoiceConnections = mobileVoiceConnectionsFuture.get()
        mobileVoiceConnections.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobileVoiceConnectionServiceAsync = client.mobileVoiceConnections()

        val mobileVoiceConnectionFuture = mobileVoiceConnectionServiceAsync.delete("id")

        val mobileVoiceConnection = mobileVoiceConnectionFuture.get()
        mobileVoiceConnection.validate()
    }
}
