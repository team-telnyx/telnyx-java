// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.ai.chat.BucketIds
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class AssistantToolTest {

    @Test
    fun ofWebhook() {
        val webhook =
            InferenceEmbeddingWebhookToolParams.builder()
                .type(InferenceEmbeddingWebhookToolParams.Type.WEBHOOK)
                .webhook(
                    InferenceEmbeddingWebhookToolParams.Webhook.builder()
                        .description("description")
                        .name("name")
                        .url("https://example.com/api/v1/function")
                        .async(true)
                        .bodyParameters(
                            InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters
                                        .Properties
                                        .builder()
                                        .putAdditionalProperty("age", JsonValue.from("bar"))
                                        .putAdditionalProperty("location", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("age")
                                .addRequired("location")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters.Type
                                        .OBJECT
                                )
                                .build()
                        )
                        .addHeader(
                            InferenceEmbeddingWebhookToolParams.Webhook.Header.builder()
                                .name("name")
                                .value("value")
                                .build()
                        )
                        .method(InferenceEmbeddingWebhookToolParams.Webhook.Method.GET)
                        .pathParameters(
                            InferenceEmbeddingWebhookToolParams.Webhook.PathParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.Webhook.PathParameters
                                        .Properties
                                        .builder()
                                        .putAdditionalProperty("id", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("id")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.Webhook.PathParameters.Type
                                        .OBJECT
                                )
                                .build()
                        )
                        .queryParameters(
                            InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters.builder()
                                .properties(
                                    InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters
                                        .Properties
                                        .builder()
                                        .putAdditionalProperty("page", JsonValue.from("bar"))
                                        .build()
                                )
                                .addRequired("page")
                                .type(
                                    InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters.Type
                                        .OBJECT
                                )
                                .build()
                        )
                        .timeoutMs(500L)
                        .build()
                )
                .build()

        val assistantTool = AssistantTool.ofWebhook(webhook)

        assertThat(assistantTool.webhook()).contains(webhook)
        assertThat(assistantTool.retrieval()).isEmpty
        assertThat(assistantTool.handoff()).isEmpty
        assertThat(assistantTool.hangup()).isEmpty
        assertThat(assistantTool.transfer()).isEmpty
        assertThat(assistantTool.refer()).isEmpty
        assertThat(assistantTool.sendDtmf()).isEmpty
        assertThat(assistantTool.sendMessage()).isEmpty
    }

    @Test
    fun ofWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val assistantTool =
            AssistantTool.ofWebhook(
                InferenceEmbeddingWebhookToolParams.builder()
                    .type(InferenceEmbeddingWebhookToolParams.Type.WEBHOOK)
                    .webhook(
                        InferenceEmbeddingWebhookToolParams.Webhook.builder()
                            .description("description")
                            .name("name")
                            .url("https://example.com/api/v1/function")
                            .async(true)
                            .bodyParameters(
                                InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters.builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters
                                            .Properties
                                            .builder()
                                            .putAdditionalProperty("age", JsonValue.from("bar"))
                                            .putAdditionalProperty(
                                                "location",
                                                JsonValue.from("bar"),
                                            )
                                            .build()
                                    )
                                    .addRequired("age")
                                    .addRequired("location")
                                    .type(
                                        InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters
                                            .Type
                                            .OBJECT
                                    )
                                    .build()
                            )
                            .addHeader(
                                InferenceEmbeddingWebhookToolParams.Webhook.Header.builder()
                                    .name("name")
                                    .value("value")
                                    .build()
                            )
                            .method(InferenceEmbeddingWebhookToolParams.Webhook.Method.GET)
                            .pathParameters(
                                InferenceEmbeddingWebhookToolParams.Webhook.PathParameters.builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.Webhook.PathParameters
                                            .Properties
                                            .builder()
                                            .putAdditionalProperty("id", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .addRequired("id")
                                    .type(
                                        InferenceEmbeddingWebhookToolParams.Webhook.PathParameters
                                            .Type
                                            .OBJECT
                                    )
                                    .build()
                            )
                            .queryParameters(
                                InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters
                                    .builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters
                                            .Properties
                                            .builder()
                                            .putAdditionalProperty("page", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .addRequired("page")
                                    .type(
                                        InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters
                                            .Type
                                            .OBJECT
                                    )
                                    .build()
                            )
                            .timeoutMs(500L)
                            .build()
                    )
                    .build()
            )

        val roundtrippedAssistantTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantTool),
                jacksonTypeRef<AssistantTool>(),
            )

        assertThat(roundtrippedAssistantTool).isEqualTo(assistantTool)
    }

    @Test
    fun ofRetrieval() {
        val retrieval =
            RetrievalTool.builder()
                .retrieval(BucketIds.builder().addBucketId("string").maxNumResults(0L).build())
                .type(RetrievalTool.Type.RETRIEVAL)
                .build()

        val assistantTool = AssistantTool.ofRetrieval(retrieval)

        assertThat(assistantTool.webhook()).isEmpty
        assertThat(assistantTool.retrieval()).contains(retrieval)
        assertThat(assistantTool.handoff()).isEmpty
        assertThat(assistantTool.hangup()).isEmpty
        assertThat(assistantTool.transfer()).isEmpty
        assertThat(assistantTool.refer()).isEmpty
        assertThat(assistantTool.sendDtmf()).isEmpty
        assertThat(assistantTool.sendMessage()).isEmpty
    }

    @Test
    fun ofRetrievalRoundtrip() {
        val jsonMapper = jsonMapper()
        val assistantTool =
            AssistantTool.ofRetrieval(
                RetrievalTool.builder()
                    .retrieval(BucketIds.builder().addBucketId("string").maxNumResults(0L).build())
                    .type(RetrievalTool.Type.RETRIEVAL)
                    .build()
            )

        val roundtrippedAssistantTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantTool),
                jacksonTypeRef<AssistantTool>(),
            )

        assertThat(roundtrippedAssistantTool).isEqualTo(assistantTool)
    }

    @Test
    fun ofHandoff() {
        val handoff =
            AssistantTool.HandoffTool.builder()
                .handoff(
                    AssistantTool.HandoffTool.Handoff.builder()
                        .addAiAssistant(
                            AssistantTool.HandoffTool.Handoff.AiAssistant.builder()
                                .id("assistant-1234567890abcdef")
                                .name("Scheduling Specialist")
                                .build()
                        )
                        .voiceMode(AssistantTool.HandoffTool.Handoff.VoiceMode.UNIFIED)
                        .build()
                )
                .build()

        val assistantTool = AssistantTool.ofHandoff(handoff)

        assertThat(assistantTool.webhook()).isEmpty
        assertThat(assistantTool.retrieval()).isEmpty
        assertThat(assistantTool.handoff()).contains(handoff)
        assertThat(assistantTool.hangup()).isEmpty
        assertThat(assistantTool.transfer()).isEmpty
        assertThat(assistantTool.refer()).isEmpty
        assertThat(assistantTool.sendDtmf()).isEmpty
        assertThat(assistantTool.sendMessage()).isEmpty
    }

    @Test
    fun ofHandoffRoundtrip() {
        val jsonMapper = jsonMapper()
        val assistantTool =
            AssistantTool.ofHandoff(
                AssistantTool.HandoffTool.builder()
                    .handoff(
                        AssistantTool.HandoffTool.Handoff.builder()
                            .addAiAssistant(
                                AssistantTool.HandoffTool.Handoff.AiAssistant.builder()
                                    .id("assistant-1234567890abcdef")
                                    .name("Scheduling Specialist")
                                    .build()
                            )
                            .voiceMode(AssistantTool.HandoffTool.Handoff.VoiceMode.UNIFIED)
                            .build()
                    )
                    .build()
            )

        val roundtrippedAssistantTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantTool),
                jacksonTypeRef<AssistantTool>(),
            )

        assertThat(roundtrippedAssistantTool).isEqualTo(assistantTool)
    }

    @Test
    fun ofHangup() {
        val hangup =
            HangupTool.builder()
                .hangup(HangupToolParams.builder().description("description").build())
                .type(HangupTool.Type.HANGUP)
                .build()

        val assistantTool = AssistantTool.ofHangup(hangup)

        assertThat(assistantTool.webhook()).isEmpty
        assertThat(assistantTool.retrieval()).isEmpty
        assertThat(assistantTool.handoff()).isEmpty
        assertThat(assistantTool.hangup()).contains(hangup)
        assertThat(assistantTool.transfer()).isEmpty
        assertThat(assistantTool.refer()).isEmpty
        assertThat(assistantTool.sendDtmf()).isEmpty
        assertThat(assistantTool.sendMessage()).isEmpty
    }

    @Test
    fun ofHangupRoundtrip() {
        val jsonMapper = jsonMapper()
        val assistantTool =
            AssistantTool.ofHangup(
                HangupTool.builder()
                    .hangup(HangupToolParams.builder().description("description").build())
                    .type(HangupTool.Type.HANGUP)
                    .build()
            )

        val roundtrippedAssistantTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantTool),
                jacksonTypeRef<AssistantTool>(),
            )

        assertThat(roundtrippedAssistantTool).isEqualTo(assistantTool)
    }

    @Test
    fun ofTransfer() {
        val transfer =
            AssistantTool.Transfer.builder()
                .transfer(
                    AssistantTool.Transfer.InnerTransfer.builder()
                        .from("+35319605860")
                        .addTarget(
                            AssistantTool.Transfer.InnerTransfer.Target.builder()
                                .name("Support")
                                .to("+13129457420")
                                .build()
                        )
                        .addCustomHeader(
                            AssistantTool.Transfer.InnerTransfer.CustomHeader.builder()
                                .name("name")
                                .value("value")
                                .build()
                        )
                        .voicemailDetection(
                            AssistantTool.Transfer.InnerTransfer.VoicemailDetection.builder()
                                .detectionConfig(
                                    AssistantTool.Transfer.InnerTransfer.VoicemailDetection
                                        .DetectionConfig
                                        .builder()
                                        .afterGreetingSilenceMillis(100L)
                                        .betweenWordsSilenceMillis(10L)
                                        .greetingDurationMillis(100L)
                                        .greetingSilenceDurationMillis(500L)
                                        .greetingTotalAnalysisTimeMillis(500L)
                                        .initialSilenceMillis(100L)
                                        .maximumNumberOfWords(1L)
                                        .maximumWordLengthMillis(50L)
                                        .minWordLengthMillis(1L)
                                        .silenceThreshold(1L)
                                        .totalAnalysisTimeMillis(500L)
                                        .build()
                                )
                                .detectionMode(
                                    AssistantTool.Transfer.InnerTransfer.VoicemailDetection
                                        .DetectionMode
                                        .DISABLED
                                )
                                .onVoicemailDetected(
                                    AssistantTool.Transfer.InnerTransfer.VoicemailDetection
                                        .OnVoicemailDetected
                                        .builder()
                                        .action(
                                            AssistantTool.Transfer.InnerTransfer.VoicemailDetection
                                                .OnVoicemailDetected
                                                .Action
                                                .STOP_TRANSFER
                                        )
                                        .voicemailMessage(
                                            AssistantTool.Transfer.InnerTransfer.VoicemailDetection
                                                .OnVoicemailDetected
                                                .VoicemailMessage
                                                .builder()
                                                .message("message")
                                                .type(
                                                    AssistantTool.Transfer.InnerTransfer
                                                        .VoicemailDetection
                                                        .OnVoicemailDetected
                                                        .VoicemailMessage
                                                        .Type
                                                        .MESSAGE
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .warmTransferInstructions(
                            "Briefly greet the transfer recipient and provide any relevant information from the call. Let them know you will bridge the call right after."
                        )
                        .build()
                )
                .build()

        val assistantTool = AssistantTool.ofTransfer(transfer)

        assertThat(assistantTool.webhook()).isEmpty
        assertThat(assistantTool.retrieval()).isEmpty
        assertThat(assistantTool.handoff()).isEmpty
        assertThat(assistantTool.hangup()).isEmpty
        assertThat(assistantTool.transfer()).contains(transfer)
        assertThat(assistantTool.refer()).isEmpty
        assertThat(assistantTool.sendDtmf()).isEmpty
        assertThat(assistantTool.sendMessage()).isEmpty
    }

    @Test
    fun ofTransferRoundtrip() {
        val jsonMapper = jsonMapper()
        val assistantTool =
            AssistantTool.ofTransfer(
                AssistantTool.Transfer.builder()
                    .transfer(
                        AssistantTool.Transfer.InnerTransfer.builder()
                            .from("+35319605860")
                            .addTarget(
                                AssistantTool.Transfer.InnerTransfer.Target.builder()
                                    .name("Support")
                                    .to("+13129457420")
                                    .build()
                            )
                            .addCustomHeader(
                                AssistantTool.Transfer.InnerTransfer.CustomHeader.builder()
                                    .name("name")
                                    .value("value")
                                    .build()
                            )
                            .voicemailDetection(
                                AssistantTool.Transfer.InnerTransfer.VoicemailDetection.builder()
                                    .detectionConfig(
                                        AssistantTool.Transfer.InnerTransfer.VoicemailDetection
                                            .DetectionConfig
                                            .builder()
                                            .afterGreetingSilenceMillis(100L)
                                            .betweenWordsSilenceMillis(10L)
                                            .greetingDurationMillis(100L)
                                            .greetingSilenceDurationMillis(500L)
                                            .greetingTotalAnalysisTimeMillis(500L)
                                            .initialSilenceMillis(100L)
                                            .maximumNumberOfWords(1L)
                                            .maximumWordLengthMillis(50L)
                                            .minWordLengthMillis(1L)
                                            .silenceThreshold(1L)
                                            .totalAnalysisTimeMillis(500L)
                                            .build()
                                    )
                                    .detectionMode(
                                        AssistantTool.Transfer.InnerTransfer.VoicemailDetection
                                            .DetectionMode
                                            .DISABLED
                                    )
                                    .onVoicemailDetected(
                                        AssistantTool.Transfer.InnerTransfer.VoicemailDetection
                                            .OnVoicemailDetected
                                            .builder()
                                            .action(
                                                AssistantTool.Transfer.InnerTransfer
                                                    .VoicemailDetection
                                                    .OnVoicemailDetected
                                                    .Action
                                                    .STOP_TRANSFER
                                            )
                                            .voicemailMessage(
                                                AssistantTool.Transfer.InnerTransfer
                                                    .VoicemailDetection
                                                    .OnVoicemailDetected
                                                    .VoicemailMessage
                                                    .builder()
                                                    .message("message")
                                                    .type(
                                                        AssistantTool.Transfer.InnerTransfer
                                                            .VoicemailDetection
                                                            .OnVoicemailDetected
                                                            .VoicemailMessage
                                                            .Type
                                                            .MESSAGE
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .warmTransferInstructions(
                                "Briefly greet the transfer recipient and provide any relevant information from the call. Let them know you will bridge the call right after."
                            )
                            .build()
                    )
                    .build()
            )

        val roundtrippedAssistantTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantTool),
                jacksonTypeRef<AssistantTool>(),
            )

        assertThat(roundtrippedAssistantTool).isEqualTo(assistantTool)
    }

    @Test
    fun ofRefer() {
        val refer =
            AssistantTool.SipReferTool.builder()
                .refer(
                    AssistantTool.SipReferTool.Refer.builder()
                        .addTarget(
                            AssistantTool.SipReferTool.Refer.Target.builder()
                                .name("Support")
                                .sipAddress("sip:username@sip.non-telnyx-address.com")
                                .sipAuthPassword("sip_auth_password")
                                .sipAuthUsername("sip_auth_username")
                                .build()
                        )
                        .addCustomHeader(
                            AssistantTool.SipReferTool.Refer.CustomHeader.builder()
                                .name("name")
                                .value("value")
                                .build()
                        )
                        .addSipHeader(
                            AssistantTool.SipReferTool.Refer.SipHeader.builder()
                                .name(AssistantTool.SipReferTool.Refer.SipHeader.Name.USER_TO_USER)
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .build()

        val assistantTool = AssistantTool.ofRefer(refer)

        assertThat(assistantTool.webhook()).isEmpty
        assertThat(assistantTool.retrieval()).isEmpty
        assertThat(assistantTool.handoff()).isEmpty
        assertThat(assistantTool.hangup()).isEmpty
        assertThat(assistantTool.transfer()).isEmpty
        assertThat(assistantTool.refer()).contains(refer)
        assertThat(assistantTool.sendDtmf()).isEmpty
        assertThat(assistantTool.sendMessage()).isEmpty
    }

    @Test
    fun ofReferRoundtrip() {
        val jsonMapper = jsonMapper()
        val assistantTool =
            AssistantTool.ofRefer(
                AssistantTool.SipReferTool.builder()
                    .refer(
                        AssistantTool.SipReferTool.Refer.builder()
                            .addTarget(
                                AssistantTool.SipReferTool.Refer.Target.builder()
                                    .name("Support")
                                    .sipAddress("sip:username@sip.non-telnyx-address.com")
                                    .sipAuthPassword("sip_auth_password")
                                    .sipAuthUsername("sip_auth_username")
                                    .build()
                            )
                            .addCustomHeader(
                                AssistantTool.SipReferTool.Refer.CustomHeader.builder()
                                    .name("name")
                                    .value("value")
                                    .build()
                            )
                            .addSipHeader(
                                AssistantTool.SipReferTool.Refer.SipHeader.builder()
                                    .name(
                                        AssistantTool.SipReferTool.Refer.SipHeader.Name.USER_TO_USER
                                    )
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val roundtrippedAssistantTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantTool),
                jacksonTypeRef<AssistantTool>(),
            )

        assertThat(roundtrippedAssistantTool).isEqualTo(assistantTool)
    }

    @Test
    fun ofSendDtmf() {
        val sendDtmf =
            AssistantTool.DtmfTool.builder()
                .sendDtmf(
                    AssistantTool.DtmfTool.SendDtmf.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val assistantTool = AssistantTool.ofSendDtmf(sendDtmf)

        assertThat(assistantTool.webhook()).isEmpty
        assertThat(assistantTool.retrieval()).isEmpty
        assertThat(assistantTool.handoff()).isEmpty
        assertThat(assistantTool.hangup()).isEmpty
        assertThat(assistantTool.transfer()).isEmpty
        assertThat(assistantTool.refer()).isEmpty
        assertThat(assistantTool.sendDtmf()).contains(sendDtmf)
        assertThat(assistantTool.sendMessage()).isEmpty
    }

    @Test
    fun ofSendDtmfRoundtrip() {
        val jsonMapper = jsonMapper()
        val assistantTool =
            AssistantTool.ofSendDtmf(
                AssistantTool.DtmfTool.builder()
                    .sendDtmf(
                        AssistantTool.DtmfTool.SendDtmf.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val roundtrippedAssistantTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantTool),
                jacksonTypeRef<AssistantTool>(),
            )

        assertThat(roundtrippedAssistantTool).isEqualTo(assistantTool)
    }

    @Test
    fun ofSendMessage() {
        val sendMessage =
            AssistantTool.SendMessage.builder()
                .sendMessage(
                    AssistantTool.SendMessage.InnerSendMessage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val assistantTool = AssistantTool.ofSendMessage(sendMessage)

        assertThat(assistantTool.webhook()).isEmpty
        assertThat(assistantTool.retrieval()).isEmpty
        assertThat(assistantTool.handoff()).isEmpty
        assertThat(assistantTool.hangup()).isEmpty
        assertThat(assistantTool.transfer()).isEmpty
        assertThat(assistantTool.refer()).isEmpty
        assertThat(assistantTool.sendDtmf()).isEmpty
        assertThat(assistantTool.sendMessage()).contains(sendMessage)
    }

    @Test
    fun ofSendMessageRoundtrip() {
        val jsonMapper = jsonMapper()
        val assistantTool =
            AssistantTool.ofSendMessage(
                AssistantTool.SendMessage.builder()
                    .sendMessage(
                        AssistantTool.SendMessage.InnerSendMessage.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val roundtrippedAssistantTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantTool),
                jacksonTypeRef<AssistantTool>(),
            )

        assertThat(roundtrippedAssistantTool).isEqualTo(assistantTool)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val assistantTool =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<AssistantTool>())

        val e = assertThrows<TelnyxInvalidDataException> { assistantTool.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
