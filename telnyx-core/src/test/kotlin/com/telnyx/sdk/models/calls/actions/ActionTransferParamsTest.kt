// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.telnyx.sdk.models.calls.CustomSipHeader
import com.telnyx.sdk.models.calls.SipHeader
import com.telnyx.sdk.models.calls.SoundModifications
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionTransferParamsTest {

    @Test
    fun create() {
        ActionTransferParams.builder()
            .callControlId("call_control_id")
            .to("+18005550100 or sip:username@sip.telnyx.com")
            .answeringMachineDetection(ActionTransferParams.AnsweringMachineDetection.DETECT)
            .answeringMachineDetectionConfig(
                ActionTransferParams.AnsweringMachineDetectionConfig.builder()
                    .afterGreetingSilenceMillis(1000)
                    .betweenWordsSilenceMillis(1000)
                    .greetingDurationMillis(1000)
                    .greetingSilenceDurationMillis(2000)
                    .greetingTotalAnalysisTimeMillis(50000)
                    .initialSilenceMillis(1000)
                    .maximumNumberOfWords(1000)
                    .maximumWordLengthMillis(2000)
                    .silenceThreshold(512)
                    .totalAnalysisTimeMillis(5000)
                    .build()
            )
            .audioUrl("http://www.example.com/sounds/greeting.wav")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .addCustomHeader(CustomSipHeader.builder().name("head_1").value("val_1").build())
            .addCustomHeader(CustomSipHeader.builder().name("head_2").value("val_2").build())
            .earlyMedia(true)
            .from("+18005550101")
            .fromDisplayName("Company Name")
            .mediaEncryption(ActionTransferParams.MediaEncryption.SRTP)
            .mediaName("my_media_uploaded_to_media_storage_api")
            .muteDtmf(ActionTransferParams.MuteDtmf.OPPOSITE)
            .parkAfterUnbridge("self")
            .record(ActionTransferParams.Record.RECORD_FROM_ANSWER)
            .recordChannels(ActionTransferParams.RecordChannels.SINGLE)
            .recordCustomFileName("my_recording_file_name")
            .recordFormat(ActionTransferParams.RecordFormat.WAV)
            .recordMaxLength(1000)
            .recordTimeoutSecs(100)
            .recordTrack(ActionTransferParams.RecordTrack.OUTBOUND)
            .recordTrim(ActionTransferParams.RecordTrim.TRIM_SILENCE)
            .sipAuthPassword("password")
            .sipAuthUsername("username")
            .addSipHeader(
                SipHeader.builder().name(SipHeader.Name.USER_TO_USER).value("value").build()
            )
            .sipRegion(ActionTransferParams.SipRegion.CANADA)
            .sipTransportProtocol(ActionTransferParams.SipTransportProtocol.TLS)
            .soundModifications(
                SoundModifications.builder()
                    .octaves(0.1)
                    .pitch(0.8)
                    .semitone(-2.0)
                    .track("both")
                    .build()
            )
            .targetLegClientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .timeLimitSecs(60)
            .timeoutSecs(60)
            .webhookUrl("https://www.example.com/server-b/")
            .webhookUrlMethod(ActionTransferParams.WebhookUrlMethod.POST)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionTransferParams.builder()
                .callControlId("call_control_id")
                .to("+18005550100 or sip:username@sip.telnyx.com")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionTransferParams.builder()
                .callControlId("call_control_id")
                .to("+18005550100 or sip:username@sip.telnyx.com")
                .answeringMachineDetection(ActionTransferParams.AnsweringMachineDetection.DETECT)
                .answeringMachineDetectionConfig(
                    ActionTransferParams.AnsweringMachineDetectionConfig.builder()
                        .afterGreetingSilenceMillis(1000)
                        .betweenWordsSilenceMillis(1000)
                        .greetingDurationMillis(1000)
                        .greetingSilenceDurationMillis(2000)
                        .greetingTotalAnalysisTimeMillis(50000)
                        .initialSilenceMillis(1000)
                        .maximumNumberOfWords(1000)
                        .maximumWordLengthMillis(2000)
                        .silenceThreshold(512)
                        .totalAnalysisTimeMillis(5000)
                        .build()
                )
                .audioUrl("http://www.example.com/sounds/greeting.wav")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .addCustomHeader(CustomSipHeader.builder().name("head_1").value("val_1").build())
                .addCustomHeader(CustomSipHeader.builder().name("head_2").value("val_2").build())
                .earlyMedia(true)
                .from("+18005550101")
                .fromDisplayName("Company Name")
                .mediaEncryption(ActionTransferParams.MediaEncryption.SRTP)
                .mediaName("my_media_uploaded_to_media_storage_api")
                .muteDtmf(ActionTransferParams.MuteDtmf.OPPOSITE)
                .parkAfterUnbridge("self")
                .record(ActionTransferParams.Record.RECORD_FROM_ANSWER)
                .recordChannels(ActionTransferParams.RecordChannels.SINGLE)
                .recordCustomFileName("my_recording_file_name")
                .recordFormat(ActionTransferParams.RecordFormat.WAV)
                .recordMaxLength(1000)
                .recordTimeoutSecs(100)
                .recordTrack(ActionTransferParams.RecordTrack.OUTBOUND)
                .recordTrim(ActionTransferParams.RecordTrim.TRIM_SILENCE)
                .sipAuthPassword("password")
                .sipAuthUsername("username")
                .addSipHeader(
                    SipHeader.builder().name(SipHeader.Name.USER_TO_USER).value("value").build()
                )
                .sipRegion(ActionTransferParams.SipRegion.CANADA)
                .sipTransportProtocol(ActionTransferParams.SipTransportProtocol.TLS)
                .soundModifications(
                    SoundModifications.builder()
                        .octaves(0.1)
                        .pitch(0.8)
                        .semitone(-2.0)
                        .track("both")
                        .build()
                )
                .targetLegClientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .timeLimitSecs(60)
                .timeoutSecs(60)
                .webhookUrl("https://www.example.com/server-b/")
                .webhookUrlMethod(ActionTransferParams.WebhookUrlMethod.POST)
                .build()

        val body = params._body()

        assertThat(body.to()).isEqualTo("+18005550100 or sip:username@sip.telnyx.com")
        assertThat(body.answeringMachineDetection())
            .contains(ActionTransferParams.AnsweringMachineDetection.DETECT)
        assertThat(body.answeringMachineDetectionConfig())
            .contains(
                ActionTransferParams.AnsweringMachineDetectionConfig.builder()
                    .afterGreetingSilenceMillis(1000)
                    .betweenWordsSilenceMillis(1000)
                    .greetingDurationMillis(1000)
                    .greetingSilenceDurationMillis(2000)
                    .greetingTotalAnalysisTimeMillis(50000)
                    .initialSilenceMillis(1000)
                    .maximumNumberOfWords(1000)
                    .maximumWordLengthMillis(2000)
                    .silenceThreshold(512)
                    .totalAnalysisTimeMillis(5000)
                    .build()
            )
        assertThat(body.audioUrl()).contains("http://www.example.com/sounds/greeting.wav")
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.customHeaders().getOrNull())
            .containsExactly(
                CustomSipHeader.builder().name("head_1").value("val_1").build(),
                CustomSipHeader.builder().name("head_2").value("val_2").build(),
            )
        assertThat(body.earlyMedia()).contains(true)
        assertThat(body.from()).contains("+18005550101")
        assertThat(body.fromDisplayName()).contains("Company Name")
        assertThat(body.mediaEncryption()).contains(ActionTransferParams.MediaEncryption.SRTP)
        assertThat(body.mediaName()).contains("my_media_uploaded_to_media_storage_api")
        assertThat(body.muteDtmf()).contains(ActionTransferParams.MuteDtmf.OPPOSITE)
        assertThat(body.parkAfterUnbridge()).contains("self")
        assertThat(body.record()).contains(ActionTransferParams.Record.RECORD_FROM_ANSWER)
        assertThat(body.recordChannels()).contains(ActionTransferParams.RecordChannels.SINGLE)
        assertThat(body.recordCustomFileName()).contains("my_recording_file_name")
        assertThat(body.recordFormat()).contains(ActionTransferParams.RecordFormat.WAV)
        assertThat(body.recordMaxLength()).contains(1000)
        assertThat(body.recordTimeoutSecs()).contains(100)
        assertThat(body.recordTrack()).contains(ActionTransferParams.RecordTrack.OUTBOUND)
        assertThat(body.recordTrim()).contains(ActionTransferParams.RecordTrim.TRIM_SILENCE)
        assertThat(body.sipAuthPassword()).contains("password")
        assertThat(body.sipAuthUsername()).contains("username")
        assertThat(body.sipHeaders().getOrNull())
            .containsExactly(
                SipHeader.builder().name(SipHeader.Name.USER_TO_USER).value("value").build()
            )
        assertThat(body.sipRegion()).contains(ActionTransferParams.SipRegion.CANADA)
        assertThat(body.sipTransportProtocol())
            .contains(ActionTransferParams.SipTransportProtocol.TLS)
        assertThat(body.soundModifications())
            .contains(
                SoundModifications.builder()
                    .octaves(0.1)
                    .pitch(0.8)
                    .semitone(-2.0)
                    .track("both")
                    .build()
            )
        assertThat(body.targetLegClientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.timeLimitSecs()).contains(60)
        assertThat(body.timeoutSecs()).contains(60)
        assertThat(body.webhookUrl()).contains("https://www.example.com/server-b/")
        assertThat(body.webhookUrlMethod()).contains(ActionTransferParams.WebhookUrlMethod.POST)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionTransferParams.builder()
                .callControlId("call_control_id")
                .to("+18005550100 or sip:username@sip.telnyx.com")
                .build()

        val body = params._body()

        assertThat(body.to()).isEqualTo("+18005550100 or sip:username@sip.telnyx.com")
    }
}
