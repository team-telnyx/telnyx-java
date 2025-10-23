// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.credentialconnections.DtmfType
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationCreateParams
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationListParams
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TexmlApplicationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val texmlApplicationServiceAsync = client.texmlApplications()

        val texmlApplicationFuture =
            texmlApplicationServiceAsync.create(
                TexmlApplicationCreateParams.builder()
                    .friendlyName("call-router")
                    .voiceUrl("https://example.com")
                    .active(false)
                    .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                    .dtmfType(DtmfType.INBAND)
                    .firstCommandTimeout(true)
                    .firstCommandTimeoutSecs(10L)
                    .inbound(
                        TexmlApplicationCreateParams.Inbound.builder()
                            .channelLimit(10L)
                            .shakenStirEnabled(true)
                            .sipSubdomain("example")
                            .sipSubdomainReceiveSettings(
                                TexmlApplicationCreateParams.Inbound.SipSubdomainReceiveSettings
                                    .ONLY_MY_CONNECTIONS
                            )
                            .build()
                    )
                    .outbound(
                        TexmlApplicationCreateParams.Outbound.builder()
                            .channelLimit(10L)
                            .outboundVoiceProfileId("1293384261075731499")
                            .build()
                    )
                    .statusCallback("https://example.com")
                    .statusCallbackMethod(TexmlApplicationCreateParams.StatusCallbackMethod.GET)
                    .addTag("tag1")
                    .addTag("tag2")
                    .voiceFallbackUrl("https://fallback.example.com")
                    .voiceMethod(TexmlApplicationCreateParams.VoiceMethod.GET)
                    .build()
            )

        val texmlApplication = texmlApplicationFuture.get()
        texmlApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val texmlApplicationServiceAsync = client.texmlApplications()

        val texmlApplicationFuture = texmlApplicationServiceAsync.retrieve("1293384261075731499")

        val texmlApplication = texmlApplicationFuture.get()
        texmlApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val texmlApplicationServiceAsync = client.texmlApplications()

        val texmlApplicationFuture =
            texmlApplicationServiceAsync.update(
                TexmlApplicationUpdateParams.builder()
                    .id("1293384261075731499")
                    .friendlyName("call-router")
                    .voiceUrl("https://example.com")
                    .active(false)
                    .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                    .dtmfType(DtmfType.INBAND)
                    .firstCommandTimeout(true)
                    .firstCommandTimeoutSecs(10L)
                    .inbound(
                        TexmlApplicationUpdateParams.Inbound.builder()
                            .channelLimit(10L)
                            .shakenStirEnabled(true)
                            .sipSubdomain("example")
                            .sipSubdomainReceiveSettings(
                                TexmlApplicationUpdateParams.Inbound.SipSubdomainReceiveSettings
                                    .ONLY_MY_CONNECTIONS
                            )
                            .build()
                    )
                    .outbound(
                        TexmlApplicationUpdateParams.Outbound.builder()
                            .channelLimit(10L)
                            .outboundVoiceProfileId("1293384261075731499")
                            .build()
                    )
                    .statusCallback("https://example.com")
                    .statusCallbackMethod(TexmlApplicationUpdateParams.StatusCallbackMethod.GET)
                    .addTag("tag1")
                    .addTag("tag2")
                    .voiceFallbackUrl("https://fallback.example.com")
                    .voiceMethod(TexmlApplicationUpdateParams.VoiceMethod.GET)
                    .build()
            )

        val texmlApplication = texmlApplicationFuture.get()
        texmlApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val texmlApplicationServiceAsync = client.texmlApplications()

        val texmlApplicationsFuture =
            texmlApplicationServiceAsync.list(
                TexmlApplicationListParams.builder()
                    .filter(
                        TexmlApplicationListParams.Filter.builder()
                            .friendlyName("friendly_name")
                            .outboundVoiceProfileId("1293384261075731499")
                            .build()
                    )
                    .page(TexmlApplicationListParams.Page.builder().number(1L).size(1L).build())
                    .sort(TexmlApplicationListParams.Sort.FRIENDLY_NAME)
                    .build()
            )

        val texmlApplications = texmlApplicationsFuture.get()
        texmlApplications.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val texmlApplicationServiceAsync = client.texmlApplications()

        val texmlApplicationFuture = texmlApplicationServiceAsync.delete("1293384261075731499")

        val texmlApplication = texmlApplicationFuture.get()
        texmlApplication.validate()
    }
}
