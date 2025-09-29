// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.externalconnections.ExternalConnectionCreateParams
import com.telnyx.api.models.externalconnections.ExternalConnectionListParams
import com.telnyx.api.models.externalconnections.ExternalConnectionUpdateLocationParams
import com.telnyx.api.models.externalconnections.ExternalConnectionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalConnectionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
                        ExternalConnectionCreateParams.Inbound.builder().channelLimit(10L).build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalConnectionServiceAsync = client.externalConnections()

        val externalConnectionFuture = externalConnectionServiceAsync.retrieve("id")

        val externalConnection = externalConnectionFuture.get()
        externalConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalConnectionServiceAsync = client.externalConnections()

        val externalConnectionsFuture =
            externalConnectionServiceAsync.list(
                ExternalConnectionListParams.builder()
                    .filter(
                        ExternalConnectionListParams.Filter.builder()
                            .id("1930241863466354012")
                            .connectionName(
                                ExternalConnectionListParams.Filter.ConnectionName.builder()
                                    .contains("My Connection")
                                    .build()
                            )
                            .createdAt("2022-12-31")
                            .externalSipConnection(
                                ExternalConnectionListParams.Filter.ExternalSipConnection.ZOOM
                            )
                            .phoneNumber(
                                ExternalConnectionListParams.Filter.PhoneNumber.builder()
                                    .contains("+15555555555")
                                    .build()
                            )
                            .build()
                    )
                    .page(ExternalConnectionListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val externalConnections = externalConnectionsFuture.get()
        externalConnections.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalConnectionServiceAsync = client.externalConnections()

        val externalConnectionFuture = externalConnectionServiceAsync.delete("id")

        val externalConnection = externalConnectionFuture.get()
        externalConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateLocation() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
