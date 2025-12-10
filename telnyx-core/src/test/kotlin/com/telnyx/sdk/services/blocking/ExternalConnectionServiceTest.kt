// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.externalconnections.ExternalConnectionCreateParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionListParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateLocationParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalConnectionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalConnectionService = client.externalConnections()

        val externalConnection = externalConnectionService.retrieve("id")

        externalConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalConnectionService = client.externalConnections()

        val externalConnections =
            externalConnectionService.list(
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

        externalConnections.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalConnectionService = client.externalConnections()

        val externalConnection = externalConnectionService.delete("id")

        externalConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateLocation() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
