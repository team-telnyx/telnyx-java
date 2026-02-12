// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = UnwrapWebhookEvent.Deserializer::class)
@JsonSerialize(using = UnwrapWebhookEvent.Serializer::class)
class UnwrapWebhookEvent
private constructor(
    private val callAiGatherEnded: CallAiGatherEndedWebhookEvent? = null,
    private val callAiGatherMessageHistoryUpdated: CallAiGatherMessageHistoryUpdatedWebhookEvent? =
        null,
    private val callAiGatherPartialResults: CallAiGatherPartialResultsWebhookEvent? = null,
    private val callAnswered: CallAnsweredWebhookEvent? = null,
    private val callBridged: CallBridged? = null,
    private val callConversationEnded: CallConversationEndedWebhookEvent? = null,
    private val callConversationInsightsGenerated: CallConversationInsightsGeneratedWebhookEvent? =
        null,
    private val callDtmfReceived: CallDtmfReceivedWebhookEvent? = null,
    private val callEnqueued: CallEnqueuedWebhookEvent? = null,
    private val callForkStarted: CallForkStartedWebhookEvent? = null,
    private val callForkStopped: CallForkStoppedWebhookEvent? = null,
    private val callGatherEnded: CallGatherEndedWebhookEvent? = null,
    private val callHangup: CallHangupWebhookEvent? = null,
    private val callInitiated: CallInitiatedWebhookEvent? = null,
    private val callLeftQueue: CallLeftQueueWebhookEvent? = null,
    private val callMachineDetectionEnded: CallMachineDetectionEndedWebhookEvent? = null,
    private val callMachineGreetingEnded: CallMachineGreetingEndedWebhookEvent? = null,
    private val callMachinePremiumDetectionEnded: CallMachinePremiumDetectionEndedWebhookEvent? =
        null,
    private val callMachinePremiumGreetingEnded: CallMachinePremiumGreetingEndedWebhookEvent? =
        null,
    private val callPlaybackEnded: CallPlaybackEndedWebhookEvent? = null,
    private val callPlaybackStarted: CallPlaybackStartedWebhookEvent? = null,
    private val callRecordingError: CallRecordingErrorWebhookEvent? = null,
    private val callRecordingSaved: CallRecordingSavedWebhookEvent? = null,
    private val callRecordingTranscriptionSaved: CallRecordingTranscriptionSavedWebhookEvent? =
        null,
    private val callReferCompleted: CallReferCompletedWebhookEvent? = null,
    private val callReferFailed: CallReferFailedWebhookEvent? = null,
    private val callReferStarted: CallReferStartedWebhookEvent? = null,
    private val callSiprecFailed: CallSiprecFailedWebhookEvent? = null,
    private val callSiprecStarted: CallSiprecStartedWebhookEvent? = null,
    private val callSiprecStopped: CallSiprecStoppedWebhookEvent? = null,
    private val callSpeakEnded: CallSpeakEndedWebhookEvent? = null,
    private val callSpeakStarted: CallSpeakStartedWebhookEvent? = null,
    private val callStreamingFailed: CallStreamingFailedWebhookEvent? = null,
    private val callStreamingStarted: CallStreamingStartedWebhookEvent? = null,
    private val callStreamingStopped: CallStreamingStoppedWebhookEvent? = null,
    private val campaignStatusUpdate: CampaignStatusUpdate? = null,
    private val conferenceCreated: ConferenceCreatedWebhookEvent? = null,
    private val conferenceEnded: ConferenceEndedWebhookEvent? = null,
    private val conferenceFloorChanged: ConferenceFloorChanged? = null,
    private val conferenceParticipantJoined: ConferenceParticipantJoinedWebhookEvent? = null,
    private val conferenceParticipantLeft: ConferenceParticipantLeftWebhookEvent? = null,
    private val conferenceParticipantPlaybackEnded:
        ConferenceParticipantPlaybackEndedWebhookEvent? =
        null,
    private val conferenceParticipantPlaybackStarted:
        ConferenceParticipantPlaybackStartedWebhookEvent? =
        null,
    private val conferenceParticipantSpeakEnded: ConferenceParticipantSpeakEndedWebhookEvent? =
        null,
    private val conferenceParticipantSpeakStarted: ConferenceParticipantSpeakStartedWebhookEvent? =
        null,
    private val conferencePlaybackEnded: ConferencePlaybackEndedWebhookEvent? = null,
    private val conferencePlaybackStarted: ConferencePlaybackStartedWebhookEvent? = null,
    private val conferenceRecordingSaved: ConferenceRecordingSavedWebhookEvent? = null,
    private val conferenceSpeakEnded: ConferenceSpeakEndedWebhookEvent? = null,
    private val conferenceSpeakStarted: ConferenceSpeakStartedWebhookEvent? = null,
    private val deliveryUpdate: DeliveryUpdateWebhookEvent? = null,
    private val faxDelivered: FaxDelivered? = null,
    private val faxFailed: FaxFailed? = null,
    private val faxMediaProcessed: FaxMediaProcessed? = null,
    private val faxQueued: FaxQueued? = null,
    private val faxSendingStarted: FaxSendingStarted? = null,
    private val inboundMessage: InboundMessageWebhookEvent? = null,
    private val numberOrderStatusUpdate: NumberOrderStatusUpdate? = null,
    private val replacedLinkClick: ReplacedLinkClickWebhookEvent? = null,
    private val transcription: TranscriptionWebhookEvent? = null,
    private val _json: JsonValue? = null,
) {

    fun callAiGatherEnded(): Optional<CallAiGatherEndedWebhookEvent> =
        Optional.ofNullable(callAiGatherEnded)

    fun callAiGatherMessageHistoryUpdated():
        Optional<CallAiGatherMessageHistoryUpdatedWebhookEvent> =
        Optional.ofNullable(callAiGatherMessageHistoryUpdated)

    fun callAiGatherPartialResults(): Optional<CallAiGatherPartialResultsWebhookEvent> =
        Optional.ofNullable(callAiGatherPartialResults)

    fun callAnswered(): Optional<CallAnsweredWebhookEvent> = Optional.ofNullable(callAnswered)

    fun callBridged(): Optional<CallBridged> = Optional.ofNullable(callBridged)

    fun callConversationEnded(): Optional<CallConversationEndedWebhookEvent> =
        Optional.ofNullable(callConversationEnded)

    fun callConversationInsightsGenerated():
        Optional<CallConversationInsightsGeneratedWebhookEvent> =
        Optional.ofNullable(callConversationInsightsGenerated)

    fun callDtmfReceived(): Optional<CallDtmfReceivedWebhookEvent> =
        Optional.ofNullable(callDtmfReceived)

    fun callEnqueued(): Optional<CallEnqueuedWebhookEvent> = Optional.ofNullable(callEnqueued)

    fun callForkStarted(): Optional<CallForkStartedWebhookEvent> =
        Optional.ofNullable(callForkStarted)

    fun callForkStopped(): Optional<CallForkStoppedWebhookEvent> =
        Optional.ofNullable(callForkStopped)

    fun callGatherEnded(): Optional<CallGatherEndedWebhookEvent> =
        Optional.ofNullable(callGatherEnded)

    fun callHangup(): Optional<CallHangupWebhookEvent> = Optional.ofNullable(callHangup)

    fun callInitiated(): Optional<CallInitiatedWebhookEvent> = Optional.ofNullable(callInitiated)

    fun callLeftQueue(): Optional<CallLeftQueueWebhookEvent> = Optional.ofNullable(callLeftQueue)

    fun callMachineDetectionEnded(): Optional<CallMachineDetectionEndedWebhookEvent> =
        Optional.ofNullable(callMachineDetectionEnded)

    fun callMachineGreetingEnded(): Optional<CallMachineGreetingEndedWebhookEvent> =
        Optional.ofNullable(callMachineGreetingEnded)

    fun callMachinePremiumDetectionEnded(): Optional<CallMachinePremiumDetectionEndedWebhookEvent> =
        Optional.ofNullable(callMachinePremiumDetectionEnded)

    fun callMachinePremiumGreetingEnded(): Optional<CallMachinePremiumGreetingEndedWebhookEvent> =
        Optional.ofNullable(callMachinePremiumGreetingEnded)

    fun callPlaybackEnded(): Optional<CallPlaybackEndedWebhookEvent> =
        Optional.ofNullable(callPlaybackEnded)

    fun callPlaybackStarted(): Optional<CallPlaybackStartedWebhookEvent> =
        Optional.ofNullable(callPlaybackStarted)

    fun callRecordingError(): Optional<CallRecordingErrorWebhookEvent> =
        Optional.ofNullable(callRecordingError)

    fun callRecordingSaved(): Optional<CallRecordingSavedWebhookEvent> =
        Optional.ofNullable(callRecordingSaved)

    fun callRecordingTranscriptionSaved(): Optional<CallRecordingTranscriptionSavedWebhookEvent> =
        Optional.ofNullable(callRecordingTranscriptionSaved)

    fun callReferCompleted(): Optional<CallReferCompletedWebhookEvent> =
        Optional.ofNullable(callReferCompleted)

    fun callReferFailed(): Optional<CallReferFailedWebhookEvent> =
        Optional.ofNullable(callReferFailed)

    fun callReferStarted(): Optional<CallReferStartedWebhookEvent> =
        Optional.ofNullable(callReferStarted)

    fun callSiprecFailed(): Optional<CallSiprecFailedWebhookEvent> =
        Optional.ofNullable(callSiprecFailed)

    fun callSiprecStarted(): Optional<CallSiprecStartedWebhookEvent> =
        Optional.ofNullable(callSiprecStarted)

    fun callSiprecStopped(): Optional<CallSiprecStoppedWebhookEvent> =
        Optional.ofNullable(callSiprecStopped)

    fun callSpeakEnded(): Optional<CallSpeakEndedWebhookEvent> = Optional.ofNullable(callSpeakEnded)

    fun callSpeakStarted(): Optional<CallSpeakStartedWebhookEvent> =
        Optional.ofNullable(callSpeakStarted)

    fun callStreamingFailed(): Optional<CallStreamingFailedWebhookEvent> =
        Optional.ofNullable(callStreamingFailed)

    fun callStreamingStarted(): Optional<CallStreamingStartedWebhookEvent> =
        Optional.ofNullable(callStreamingStarted)

    fun callStreamingStopped(): Optional<CallStreamingStoppedWebhookEvent> =
        Optional.ofNullable(callStreamingStopped)

    fun campaignStatusUpdate(): Optional<CampaignStatusUpdate> =
        Optional.ofNullable(campaignStatusUpdate)

    fun conferenceCreated(): Optional<ConferenceCreatedWebhookEvent> =
        Optional.ofNullable(conferenceCreated)

    fun conferenceEnded(): Optional<ConferenceEndedWebhookEvent> =
        Optional.ofNullable(conferenceEnded)

    fun conferenceFloorChanged(): Optional<ConferenceFloorChanged> =
        Optional.ofNullable(conferenceFloorChanged)

    fun conferenceParticipantJoined(): Optional<ConferenceParticipantJoinedWebhookEvent> =
        Optional.ofNullable(conferenceParticipantJoined)

    fun conferenceParticipantLeft(): Optional<ConferenceParticipantLeftWebhookEvent> =
        Optional.ofNullable(conferenceParticipantLeft)

    fun conferenceParticipantPlaybackEnded():
        Optional<ConferenceParticipantPlaybackEndedWebhookEvent> =
        Optional.ofNullable(conferenceParticipantPlaybackEnded)

    fun conferenceParticipantPlaybackStarted():
        Optional<ConferenceParticipantPlaybackStartedWebhookEvent> =
        Optional.ofNullable(conferenceParticipantPlaybackStarted)

    fun conferenceParticipantSpeakEnded(): Optional<ConferenceParticipantSpeakEndedWebhookEvent> =
        Optional.ofNullable(conferenceParticipantSpeakEnded)

    fun conferenceParticipantSpeakStarted():
        Optional<ConferenceParticipantSpeakStartedWebhookEvent> =
        Optional.ofNullable(conferenceParticipantSpeakStarted)

    fun conferencePlaybackEnded(): Optional<ConferencePlaybackEndedWebhookEvent> =
        Optional.ofNullable(conferencePlaybackEnded)

    fun conferencePlaybackStarted(): Optional<ConferencePlaybackStartedWebhookEvent> =
        Optional.ofNullable(conferencePlaybackStarted)

    fun conferenceRecordingSaved(): Optional<ConferenceRecordingSavedWebhookEvent> =
        Optional.ofNullable(conferenceRecordingSaved)

    fun conferenceSpeakEnded(): Optional<ConferenceSpeakEndedWebhookEvent> =
        Optional.ofNullable(conferenceSpeakEnded)

    fun conferenceSpeakStarted(): Optional<ConferenceSpeakStartedWebhookEvent> =
        Optional.ofNullable(conferenceSpeakStarted)

    fun deliveryUpdate(): Optional<DeliveryUpdateWebhookEvent> = Optional.ofNullable(deliveryUpdate)

    fun faxDelivered(): Optional<FaxDelivered> = Optional.ofNullable(faxDelivered)

    fun faxFailed(): Optional<FaxFailed> = Optional.ofNullable(faxFailed)

    fun faxMediaProcessed(): Optional<FaxMediaProcessed> = Optional.ofNullable(faxMediaProcessed)

    fun faxQueued(): Optional<FaxQueued> = Optional.ofNullable(faxQueued)

    fun faxSendingStarted(): Optional<FaxSendingStarted> = Optional.ofNullable(faxSendingStarted)

    fun inboundMessage(): Optional<InboundMessageWebhookEvent> = Optional.ofNullable(inboundMessage)

    fun numberOrderStatusUpdate(): Optional<NumberOrderStatusUpdate> =
        Optional.ofNullable(numberOrderStatusUpdate)

    fun replacedLinkClick(): Optional<ReplacedLinkClickWebhookEvent> =
        Optional.ofNullable(replacedLinkClick)

    fun transcription(): Optional<TranscriptionWebhookEvent> = Optional.ofNullable(transcription)

    fun isCallAiGatherEnded(): Boolean = callAiGatherEnded != null

    fun isCallAiGatherMessageHistoryUpdated(): Boolean = callAiGatherMessageHistoryUpdated != null

    fun isCallAiGatherPartialResults(): Boolean = callAiGatherPartialResults != null

    fun isCallAnswered(): Boolean = callAnswered != null

    fun isCallBridged(): Boolean = callBridged != null

    fun isCallConversationEnded(): Boolean = callConversationEnded != null

    fun isCallConversationInsightsGenerated(): Boolean = callConversationInsightsGenerated != null

    fun isCallDtmfReceived(): Boolean = callDtmfReceived != null

    fun isCallEnqueued(): Boolean = callEnqueued != null

    fun isCallForkStarted(): Boolean = callForkStarted != null

    fun isCallForkStopped(): Boolean = callForkStopped != null

    fun isCallGatherEnded(): Boolean = callGatherEnded != null

    fun isCallHangup(): Boolean = callHangup != null

    fun isCallInitiated(): Boolean = callInitiated != null

    fun isCallLeftQueue(): Boolean = callLeftQueue != null

    fun isCallMachineDetectionEnded(): Boolean = callMachineDetectionEnded != null

    fun isCallMachineGreetingEnded(): Boolean = callMachineGreetingEnded != null

    fun isCallMachinePremiumDetectionEnded(): Boolean = callMachinePremiumDetectionEnded != null

    fun isCallMachinePremiumGreetingEnded(): Boolean = callMachinePremiumGreetingEnded != null

    fun isCallPlaybackEnded(): Boolean = callPlaybackEnded != null

    fun isCallPlaybackStarted(): Boolean = callPlaybackStarted != null

    fun isCallRecordingError(): Boolean = callRecordingError != null

    fun isCallRecordingSaved(): Boolean = callRecordingSaved != null

    fun isCallRecordingTranscriptionSaved(): Boolean = callRecordingTranscriptionSaved != null

    fun isCallReferCompleted(): Boolean = callReferCompleted != null

    fun isCallReferFailed(): Boolean = callReferFailed != null

    fun isCallReferStarted(): Boolean = callReferStarted != null

    fun isCallSiprecFailed(): Boolean = callSiprecFailed != null

    fun isCallSiprecStarted(): Boolean = callSiprecStarted != null

    fun isCallSiprecStopped(): Boolean = callSiprecStopped != null

    fun isCallSpeakEnded(): Boolean = callSpeakEnded != null

    fun isCallSpeakStarted(): Boolean = callSpeakStarted != null

    fun isCallStreamingFailed(): Boolean = callStreamingFailed != null

    fun isCallStreamingStarted(): Boolean = callStreamingStarted != null

    fun isCallStreamingStopped(): Boolean = callStreamingStopped != null

    fun isCampaignStatusUpdate(): Boolean = campaignStatusUpdate != null

    fun isConferenceCreated(): Boolean = conferenceCreated != null

    fun isConferenceEnded(): Boolean = conferenceEnded != null

    fun isConferenceFloorChanged(): Boolean = conferenceFloorChanged != null

    fun isConferenceParticipantJoined(): Boolean = conferenceParticipantJoined != null

    fun isConferenceParticipantLeft(): Boolean = conferenceParticipantLeft != null

    fun isConferenceParticipantPlaybackEnded(): Boolean = conferenceParticipantPlaybackEnded != null

    fun isConferenceParticipantPlaybackStarted(): Boolean =
        conferenceParticipantPlaybackStarted != null

    fun isConferenceParticipantSpeakEnded(): Boolean = conferenceParticipantSpeakEnded != null

    fun isConferenceParticipantSpeakStarted(): Boolean = conferenceParticipantSpeakStarted != null

    fun isConferencePlaybackEnded(): Boolean = conferencePlaybackEnded != null

    fun isConferencePlaybackStarted(): Boolean = conferencePlaybackStarted != null

    fun isConferenceRecordingSaved(): Boolean = conferenceRecordingSaved != null

    fun isConferenceSpeakEnded(): Boolean = conferenceSpeakEnded != null

    fun isConferenceSpeakStarted(): Boolean = conferenceSpeakStarted != null

    fun isDeliveryUpdate(): Boolean = deliveryUpdate != null

    fun isFaxDelivered(): Boolean = faxDelivered != null

    fun isFaxFailed(): Boolean = faxFailed != null

    fun isFaxMediaProcessed(): Boolean = faxMediaProcessed != null

    fun isFaxQueued(): Boolean = faxQueued != null

    fun isFaxSendingStarted(): Boolean = faxSendingStarted != null

    fun isInboundMessage(): Boolean = inboundMessage != null

    fun isNumberOrderStatusUpdate(): Boolean = numberOrderStatusUpdate != null

    fun isReplacedLinkClick(): Boolean = replacedLinkClick != null

    fun isTranscription(): Boolean = transcription != null

    fun asCallAiGatherEnded(): CallAiGatherEndedWebhookEvent =
        callAiGatherEnded.getOrThrow("callAiGatherEnded")

    fun asCallAiGatherMessageHistoryUpdated(): CallAiGatherMessageHistoryUpdatedWebhookEvent =
        callAiGatherMessageHistoryUpdated.getOrThrow("callAiGatherMessageHistoryUpdated")

    fun asCallAiGatherPartialResults(): CallAiGatherPartialResultsWebhookEvent =
        callAiGatherPartialResults.getOrThrow("callAiGatherPartialResults")

    fun asCallAnswered(): CallAnsweredWebhookEvent = callAnswered.getOrThrow("callAnswered")

    fun asCallBridged(): CallBridged = callBridged.getOrThrow("callBridged")

    fun asCallConversationEnded(): CallConversationEndedWebhookEvent =
        callConversationEnded.getOrThrow("callConversationEnded")

    fun asCallConversationInsightsGenerated(): CallConversationInsightsGeneratedWebhookEvent =
        callConversationInsightsGenerated.getOrThrow("callConversationInsightsGenerated")

    fun asCallDtmfReceived(): CallDtmfReceivedWebhookEvent =
        callDtmfReceived.getOrThrow("callDtmfReceived")

    fun asCallEnqueued(): CallEnqueuedWebhookEvent = callEnqueued.getOrThrow("callEnqueued")

    fun asCallForkStarted(): CallForkStartedWebhookEvent =
        callForkStarted.getOrThrow("callForkStarted")

    fun asCallForkStopped(): CallForkStoppedWebhookEvent =
        callForkStopped.getOrThrow("callForkStopped")

    fun asCallGatherEnded(): CallGatherEndedWebhookEvent =
        callGatherEnded.getOrThrow("callGatherEnded")

    fun asCallHangup(): CallHangupWebhookEvent = callHangup.getOrThrow("callHangup")

    fun asCallInitiated(): CallInitiatedWebhookEvent = callInitiated.getOrThrow("callInitiated")

    fun asCallLeftQueue(): CallLeftQueueWebhookEvent = callLeftQueue.getOrThrow("callLeftQueue")

    fun asCallMachineDetectionEnded(): CallMachineDetectionEndedWebhookEvent =
        callMachineDetectionEnded.getOrThrow("callMachineDetectionEnded")

    fun asCallMachineGreetingEnded(): CallMachineGreetingEndedWebhookEvent =
        callMachineGreetingEnded.getOrThrow("callMachineGreetingEnded")

    fun asCallMachinePremiumDetectionEnded(): CallMachinePremiumDetectionEndedWebhookEvent =
        callMachinePremiumDetectionEnded.getOrThrow("callMachinePremiumDetectionEnded")

    fun asCallMachinePremiumGreetingEnded(): CallMachinePremiumGreetingEndedWebhookEvent =
        callMachinePremiumGreetingEnded.getOrThrow("callMachinePremiumGreetingEnded")

    fun asCallPlaybackEnded(): CallPlaybackEndedWebhookEvent =
        callPlaybackEnded.getOrThrow("callPlaybackEnded")

    fun asCallPlaybackStarted(): CallPlaybackStartedWebhookEvent =
        callPlaybackStarted.getOrThrow("callPlaybackStarted")

    fun asCallRecordingError(): CallRecordingErrorWebhookEvent =
        callRecordingError.getOrThrow("callRecordingError")

    fun asCallRecordingSaved(): CallRecordingSavedWebhookEvent =
        callRecordingSaved.getOrThrow("callRecordingSaved")

    fun asCallRecordingTranscriptionSaved(): CallRecordingTranscriptionSavedWebhookEvent =
        callRecordingTranscriptionSaved.getOrThrow("callRecordingTranscriptionSaved")

    fun asCallReferCompleted(): CallReferCompletedWebhookEvent =
        callReferCompleted.getOrThrow("callReferCompleted")

    fun asCallReferFailed(): CallReferFailedWebhookEvent =
        callReferFailed.getOrThrow("callReferFailed")

    fun asCallReferStarted(): CallReferStartedWebhookEvent =
        callReferStarted.getOrThrow("callReferStarted")

    fun asCallSiprecFailed(): CallSiprecFailedWebhookEvent =
        callSiprecFailed.getOrThrow("callSiprecFailed")

    fun asCallSiprecStarted(): CallSiprecStartedWebhookEvent =
        callSiprecStarted.getOrThrow("callSiprecStarted")

    fun asCallSiprecStopped(): CallSiprecStoppedWebhookEvent =
        callSiprecStopped.getOrThrow("callSiprecStopped")

    fun asCallSpeakEnded(): CallSpeakEndedWebhookEvent = callSpeakEnded.getOrThrow("callSpeakEnded")

    fun asCallSpeakStarted(): CallSpeakStartedWebhookEvent =
        callSpeakStarted.getOrThrow("callSpeakStarted")

    fun asCallStreamingFailed(): CallStreamingFailedWebhookEvent =
        callStreamingFailed.getOrThrow("callStreamingFailed")

    fun asCallStreamingStarted(): CallStreamingStartedWebhookEvent =
        callStreamingStarted.getOrThrow("callStreamingStarted")

    fun asCallStreamingStopped(): CallStreamingStoppedWebhookEvent =
        callStreamingStopped.getOrThrow("callStreamingStopped")

    fun asCampaignStatusUpdate(): CampaignStatusUpdate =
        campaignStatusUpdate.getOrThrow("campaignStatusUpdate")

    fun asConferenceCreated(): ConferenceCreatedWebhookEvent =
        conferenceCreated.getOrThrow("conferenceCreated")

    fun asConferenceEnded(): ConferenceEndedWebhookEvent =
        conferenceEnded.getOrThrow("conferenceEnded")

    fun asConferenceFloorChanged(): ConferenceFloorChanged =
        conferenceFloorChanged.getOrThrow("conferenceFloorChanged")

    fun asConferenceParticipantJoined(): ConferenceParticipantJoinedWebhookEvent =
        conferenceParticipantJoined.getOrThrow("conferenceParticipantJoined")

    fun asConferenceParticipantLeft(): ConferenceParticipantLeftWebhookEvent =
        conferenceParticipantLeft.getOrThrow("conferenceParticipantLeft")

    fun asConferenceParticipantPlaybackEnded(): ConferenceParticipantPlaybackEndedWebhookEvent =
        conferenceParticipantPlaybackEnded.getOrThrow("conferenceParticipantPlaybackEnded")

    fun asConferenceParticipantPlaybackStarted(): ConferenceParticipantPlaybackStartedWebhookEvent =
        conferenceParticipantPlaybackStarted.getOrThrow("conferenceParticipantPlaybackStarted")

    fun asConferenceParticipantSpeakEnded(): ConferenceParticipantSpeakEndedWebhookEvent =
        conferenceParticipantSpeakEnded.getOrThrow("conferenceParticipantSpeakEnded")

    fun asConferenceParticipantSpeakStarted(): ConferenceParticipantSpeakStartedWebhookEvent =
        conferenceParticipantSpeakStarted.getOrThrow("conferenceParticipantSpeakStarted")

    fun asConferencePlaybackEnded(): ConferencePlaybackEndedWebhookEvent =
        conferencePlaybackEnded.getOrThrow("conferencePlaybackEnded")

    fun asConferencePlaybackStarted(): ConferencePlaybackStartedWebhookEvent =
        conferencePlaybackStarted.getOrThrow("conferencePlaybackStarted")

    fun asConferenceRecordingSaved(): ConferenceRecordingSavedWebhookEvent =
        conferenceRecordingSaved.getOrThrow("conferenceRecordingSaved")

    fun asConferenceSpeakEnded(): ConferenceSpeakEndedWebhookEvent =
        conferenceSpeakEnded.getOrThrow("conferenceSpeakEnded")

    fun asConferenceSpeakStarted(): ConferenceSpeakStartedWebhookEvent =
        conferenceSpeakStarted.getOrThrow("conferenceSpeakStarted")

    fun asDeliveryUpdate(): DeliveryUpdateWebhookEvent = deliveryUpdate.getOrThrow("deliveryUpdate")

    fun asFaxDelivered(): FaxDelivered = faxDelivered.getOrThrow("faxDelivered")

    fun asFaxFailed(): FaxFailed = faxFailed.getOrThrow("faxFailed")

    fun asFaxMediaProcessed(): FaxMediaProcessed = faxMediaProcessed.getOrThrow("faxMediaProcessed")

    fun asFaxQueued(): FaxQueued = faxQueued.getOrThrow("faxQueued")

    fun asFaxSendingStarted(): FaxSendingStarted = faxSendingStarted.getOrThrow("faxSendingStarted")

    fun asInboundMessage(): InboundMessageWebhookEvent = inboundMessage.getOrThrow("inboundMessage")

    fun asNumberOrderStatusUpdate(): NumberOrderStatusUpdate =
        numberOrderStatusUpdate.getOrThrow("numberOrderStatusUpdate")

    fun asReplacedLinkClick(): ReplacedLinkClickWebhookEvent =
        replacedLinkClick.getOrThrow("replacedLinkClick")

    fun asTranscription(): TranscriptionWebhookEvent = transcription.getOrThrow("transcription")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            callAiGatherEnded != null -> visitor.visitCallAiGatherEnded(callAiGatherEnded)
            callAiGatherMessageHistoryUpdated != null ->
                visitor.visitCallAiGatherMessageHistoryUpdated(callAiGatherMessageHistoryUpdated)
            callAiGatherPartialResults != null ->
                visitor.visitCallAiGatherPartialResults(callAiGatherPartialResults)
            callAnswered != null -> visitor.visitCallAnswered(callAnswered)
            callBridged != null -> visitor.visitCallBridged(callBridged)
            callConversationEnded != null ->
                visitor.visitCallConversationEnded(callConversationEnded)
            callConversationInsightsGenerated != null ->
                visitor.visitCallConversationInsightsGenerated(callConversationInsightsGenerated)
            callDtmfReceived != null -> visitor.visitCallDtmfReceived(callDtmfReceived)
            callEnqueued != null -> visitor.visitCallEnqueued(callEnqueued)
            callForkStarted != null -> visitor.visitCallForkStarted(callForkStarted)
            callForkStopped != null -> visitor.visitCallForkStopped(callForkStopped)
            callGatherEnded != null -> visitor.visitCallGatherEnded(callGatherEnded)
            callHangup != null -> visitor.visitCallHangup(callHangup)
            callInitiated != null -> visitor.visitCallInitiated(callInitiated)
            callLeftQueue != null -> visitor.visitCallLeftQueue(callLeftQueue)
            callMachineDetectionEnded != null ->
                visitor.visitCallMachineDetectionEnded(callMachineDetectionEnded)
            callMachineGreetingEnded != null ->
                visitor.visitCallMachineGreetingEnded(callMachineGreetingEnded)
            callMachinePremiumDetectionEnded != null ->
                visitor.visitCallMachinePremiumDetectionEnded(callMachinePremiumDetectionEnded)
            callMachinePremiumGreetingEnded != null ->
                visitor.visitCallMachinePremiumGreetingEnded(callMachinePremiumGreetingEnded)
            callPlaybackEnded != null -> visitor.visitCallPlaybackEnded(callPlaybackEnded)
            callPlaybackStarted != null -> visitor.visitCallPlaybackStarted(callPlaybackStarted)
            callRecordingError != null -> visitor.visitCallRecordingError(callRecordingError)
            callRecordingSaved != null -> visitor.visitCallRecordingSaved(callRecordingSaved)
            callRecordingTranscriptionSaved != null ->
                visitor.visitCallRecordingTranscriptionSaved(callRecordingTranscriptionSaved)
            callReferCompleted != null -> visitor.visitCallReferCompleted(callReferCompleted)
            callReferFailed != null -> visitor.visitCallReferFailed(callReferFailed)
            callReferStarted != null -> visitor.visitCallReferStarted(callReferStarted)
            callSiprecFailed != null -> visitor.visitCallSiprecFailed(callSiprecFailed)
            callSiprecStarted != null -> visitor.visitCallSiprecStarted(callSiprecStarted)
            callSiprecStopped != null -> visitor.visitCallSiprecStopped(callSiprecStopped)
            callSpeakEnded != null -> visitor.visitCallSpeakEnded(callSpeakEnded)
            callSpeakStarted != null -> visitor.visitCallSpeakStarted(callSpeakStarted)
            callStreamingFailed != null -> visitor.visitCallStreamingFailed(callStreamingFailed)
            callStreamingStarted != null -> visitor.visitCallStreamingStarted(callStreamingStarted)
            callStreamingStopped != null -> visitor.visitCallStreamingStopped(callStreamingStopped)
            campaignStatusUpdate != null -> visitor.visitCampaignStatusUpdate(campaignStatusUpdate)
            conferenceCreated != null -> visitor.visitConferenceCreated(conferenceCreated)
            conferenceEnded != null -> visitor.visitConferenceEnded(conferenceEnded)
            conferenceFloorChanged != null ->
                visitor.visitConferenceFloorChanged(conferenceFloorChanged)
            conferenceParticipantJoined != null ->
                visitor.visitConferenceParticipantJoined(conferenceParticipantJoined)
            conferenceParticipantLeft != null ->
                visitor.visitConferenceParticipantLeft(conferenceParticipantLeft)
            conferenceParticipantPlaybackEnded != null ->
                visitor.visitConferenceParticipantPlaybackEnded(conferenceParticipantPlaybackEnded)
            conferenceParticipantPlaybackStarted != null ->
                visitor.visitConferenceParticipantPlaybackStarted(
                    conferenceParticipantPlaybackStarted
                )
            conferenceParticipantSpeakEnded != null ->
                visitor.visitConferenceParticipantSpeakEnded(conferenceParticipantSpeakEnded)
            conferenceParticipantSpeakStarted != null ->
                visitor.visitConferenceParticipantSpeakStarted(conferenceParticipantSpeakStarted)
            conferencePlaybackEnded != null ->
                visitor.visitConferencePlaybackEnded(conferencePlaybackEnded)
            conferencePlaybackStarted != null ->
                visitor.visitConferencePlaybackStarted(conferencePlaybackStarted)
            conferenceRecordingSaved != null ->
                visitor.visitConferenceRecordingSaved(conferenceRecordingSaved)
            conferenceSpeakEnded != null -> visitor.visitConferenceSpeakEnded(conferenceSpeakEnded)
            conferenceSpeakStarted != null ->
                visitor.visitConferenceSpeakStarted(conferenceSpeakStarted)
            deliveryUpdate != null -> visitor.visitDeliveryUpdate(deliveryUpdate)
            faxDelivered != null -> visitor.visitFaxDelivered(faxDelivered)
            faxFailed != null -> visitor.visitFaxFailed(faxFailed)
            faxMediaProcessed != null -> visitor.visitFaxMediaProcessed(faxMediaProcessed)
            faxQueued != null -> visitor.visitFaxQueued(faxQueued)
            faxSendingStarted != null -> visitor.visitFaxSendingStarted(faxSendingStarted)
            inboundMessage != null -> visitor.visitInboundMessage(inboundMessage)
            numberOrderStatusUpdate != null ->
                visitor.visitNumberOrderStatusUpdate(numberOrderStatusUpdate)
            replacedLinkClick != null -> visitor.visitReplacedLinkClick(replacedLinkClick)
            transcription != null -> visitor.visitTranscription(transcription)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): UnwrapWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitCallAiGatherEnded(
                    callAiGatherEnded: CallAiGatherEndedWebhookEvent
                ) {
                    callAiGatherEnded.validate()
                }

                override fun visitCallAiGatherMessageHistoryUpdated(
                    callAiGatherMessageHistoryUpdated: CallAiGatherMessageHistoryUpdatedWebhookEvent
                ) {
                    callAiGatherMessageHistoryUpdated.validate()
                }

                override fun visitCallAiGatherPartialResults(
                    callAiGatherPartialResults: CallAiGatherPartialResultsWebhookEvent
                ) {
                    callAiGatherPartialResults.validate()
                }

                override fun visitCallAnswered(callAnswered: CallAnsweredWebhookEvent) {
                    callAnswered.validate()
                }

                override fun visitCallBridged(callBridged: CallBridged) {
                    callBridged.validate()
                }

                override fun visitCallConversationEnded(
                    callConversationEnded: CallConversationEndedWebhookEvent
                ) {
                    callConversationEnded.validate()
                }

                override fun visitCallConversationInsightsGenerated(
                    callConversationInsightsGenerated: CallConversationInsightsGeneratedWebhookEvent
                ) {
                    callConversationInsightsGenerated.validate()
                }

                override fun visitCallDtmfReceived(callDtmfReceived: CallDtmfReceivedWebhookEvent) {
                    callDtmfReceived.validate()
                }

                override fun visitCallEnqueued(callEnqueued: CallEnqueuedWebhookEvent) {
                    callEnqueued.validate()
                }

                override fun visitCallForkStarted(callForkStarted: CallForkStartedWebhookEvent) {
                    callForkStarted.validate()
                }

                override fun visitCallForkStopped(callForkStopped: CallForkStoppedWebhookEvent) {
                    callForkStopped.validate()
                }

                override fun visitCallGatherEnded(callGatherEnded: CallGatherEndedWebhookEvent) {
                    callGatherEnded.validate()
                }

                override fun visitCallHangup(callHangup: CallHangupWebhookEvent) {
                    callHangup.validate()
                }

                override fun visitCallInitiated(callInitiated: CallInitiatedWebhookEvent) {
                    callInitiated.validate()
                }

                override fun visitCallLeftQueue(callLeftQueue: CallLeftQueueWebhookEvent) {
                    callLeftQueue.validate()
                }

                override fun visitCallMachineDetectionEnded(
                    callMachineDetectionEnded: CallMachineDetectionEndedWebhookEvent
                ) {
                    callMachineDetectionEnded.validate()
                }

                override fun visitCallMachineGreetingEnded(
                    callMachineGreetingEnded: CallMachineGreetingEndedWebhookEvent
                ) {
                    callMachineGreetingEnded.validate()
                }

                override fun visitCallMachinePremiumDetectionEnded(
                    callMachinePremiumDetectionEnded: CallMachinePremiumDetectionEndedWebhookEvent
                ) {
                    callMachinePremiumDetectionEnded.validate()
                }

                override fun visitCallMachinePremiumGreetingEnded(
                    callMachinePremiumGreetingEnded: CallMachinePremiumGreetingEndedWebhookEvent
                ) {
                    callMachinePremiumGreetingEnded.validate()
                }

                override fun visitCallPlaybackEnded(
                    callPlaybackEnded: CallPlaybackEndedWebhookEvent
                ) {
                    callPlaybackEnded.validate()
                }

                override fun visitCallPlaybackStarted(
                    callPlaybackStarted: CallPlaybackStartedWebhookEvent
                ) {
                    callPlaybackStarted.validate()
                }

                override fun visitCallRecordingError(
                    callRecordingError: CallRecordingErrorWebhookEvent
                ) {
                    callRecordingError.validate()
                }

                override fun visitCallRecordingSaved(
                    callRecordingSaved: CallRecordingSavedWebhookEvent
                ) {
                    callRecordingSaved.validate()
                }

                override fun visitCallRecordingTranscriptionSaved(
                    callRecordingTranscriptionSaved: CallRecordingTranscriptionSavedWebhookEvent
                ) {
                    callRecordingTranscriptionSaved.validate()
                }

                override fun visitCallReferCompleted(
                    callReferCompleted: CallReferCompletedWebhookEvent
                ) {
                    callReferCompleted.validate()
                }

                override fun visitCallReferFailed(callReferFailed: CallReferFailedWebhookEvent) {
                    callReferFailed.validate()
                }

                override fun visitCallReferStarted(callReferStarted: CallReferStartedWebhookEvent) {
                    callReferStarted.validate()
                }

                override fun visitCallSiprecFailed(callSiprecFailed: CallSiprecFailedWebhookEvent) {
                    callSiprecFailed.validate()
                }

                override fun visitCallSiprecStarted(
                    callSiprecStarted: CallSiprecStartedWebhookEvent
                ) {
                    callSiprecStarted.validate()
                }

                override fun visitCallSiprecStopped(
                    callSiprecStopped: CallSiprecStoppedWebhookEvent
                ) {
                    callSiprecStopped.validate()
                }

                override fun visitCallSpeakEnded(callSpeakEnded: CallSpeakEndedWebhookEvent) {
                    callSpeakEnded.validate()
                }

                override fun visitCallSpeakStarted(callSpeakStarted: CallSpeakStartedWebhookEvent) {
                    callSpeakStarted.validate()
                }

                override fun visitCallStreamingFailed(
                    callStreamingFailed: CallStreamingFailedWebhookEvent
                ) {
                    callStreamingFailed.validate()
                }

                override fun visitCallStreamingStarted(
                    callStreamingStarted: CallStreamingStartedWebhookEvent
                ) {
                    callStreamingStarted.validate()
                }

                override fun visitCallStreamingStopped(
                    callStreamingStopped: CallStreamingStoppedWebhookEvent
                ) {
                    callStreamingStopped.validate()
                }

                override fun visitCampaignStatusUpdate(campaignStatusUpdate: CampaignStatusUpdate) {
                    campaignStatusUpdate.validate()
                }

                override fun visitConferenceCreated(
                    conferenceCreated: ConferenceCreatedWebhookEvent
                ) {
                    conferenceCreated.validate()
                }

                override fun visitConferenceEnded(conferenceEnded: ConferenceEndedWebhookEvent) {
                    conferenceEnded.validate()
                }

                override fun visitConferenceFloorChanged(
                    conferenceFloorChanged: ConferenceFloorChanged
                ) {
                    conferenceFloorChanged.validate()
                }

                override fun visitConferenceParticipantJoined(
                    conferenceParticipantJoined: ConferenceParticipantJoinedWebhookEvent
                ) {
                    conferenceParticipantJoined.validate()
                }

                override fun visitConferenceParticipantLeft(
                    conferenceParticipantLeft: ConferenceParticipantLeftWebhookEvent
                ) {
                    conferenceParticipantLeft.validate()
                }

                override fun visitConferenceParticipantPlaybackEnded(
                    conferenceParticipantPlaybackEnded:
                        ConferenceParticipantPlaybackEndedWebhookEvent
                ) {
                    conferenceParticipantPlaybackEnded.validate()
                }

                override fun visitConferenceParticipantPlaybackStarted(
                    conferenceParticipantPlaybackStarted:
                        ConferenceParticipantPlaybackStartedWebhookEvent
                ) {
                    conferenceParticipantPlaybackStarted.validate()
                }

                override fun visitConferenceParticipantSpeakEnded(
                    conferenceParticipantSpeakEnded: ConferenceParticipantSpeakEndedWebhookEvent
                ) {
                    conferenceParticipantSpeakEnded.validate()
                }

                override fun visitConferenceParticipantSpeakStarted(
                    conferenceParticipantSpeakStarted: ConferenceParticipantSpeakStartedWebhookEvent
                ) {
                    conferenceParticipantSpeakStarted.validate()
                }

                override fun visitConferencePlaybackEnded(
                    conferencePlaybackEnded: ConferencePlaybackEndedWebhookEvent
                ) {
                    conferencePlaybackEnded.validate()
                }

                override fun visitConferencePlaybackStarted(
                    conferencePlaybackStarted: ConferencePlaybackStartedWebhookEvent
                ) {
                    conferencePlaybackStarted.validate()
                }

                override fun visitConferenceRecordingSaved(
                    conferenceRecordingSaved: ConferenceRecordingSavedWebhookEvent
                ) {
                    conferenceRecordingSaved.validate()
                }

                override fun visitConferenceSpeakEnded(
                    conferenceSpeakEnded: ConferenceSpeakEndedWebhookEvent
                ) {
                    conferenceSpeakEnded.validate()
                }

                override fun visitConferenceSpeakStarted(
                    conferenceSpeakStarted: ConferenceSpeakStartedWebhookEvent
                ) {
                    conferenceSpeakStarted.validate()
                }

                override fun visitDeliveryUpdate(deliveryUpdate: DeliveryUpdateWebhookEvent) {
                    deliveryUpdate.validate()
                }

                override fun visitFaxDelivered(faxDelivered: FaxDelivered) {
                    faxDelivered.validate()
                }

                override fun visitFaxFailed(faxFailed: FaxFailed) {
                    faxFailed.validate()
                }

                override fun visitFaxMediaProcessed(faxMediaProcessed: FaxMediaProcessed) {
                    faxMediaProcessed.validate()
                }

                override fun visitFaxQueued(faxQueued: FaxQueued) {
                    faxQueued.validate()
                }

                override fun visitFaxSendingStarted(faxSendingStarted: FaxSendingStarted) {
                    faxSendingStarted.validate()
                }

                override fun visitInboundMessage(inboundMessage: InboundMessageWebhookEvent) {
                    inboundMessage.validate()
                }

                override fun visitNumberOrderStatusUpdate(
                    numberOrderStatusUpdate: NumberOrderStatusUpdate
                ) {
                    numberOrderStatusUpdate.validate()
                }

                override fun visitReplacedLinkClick(
                    replacedLinkClick: ReplacedLinkClickWebhookEvent
                ) {
                    replacedLinkClick.validate()
                }

                override fun visitTranscription(transcription: TranscriptionWebhookEvent) {
                    transcription.validate()
                }
            }
        )
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: TelnyxInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitCallAiGatherEnded(
                    callAiGatherEnded: CallAiGatherEndedWebhookEvent
                ) = callAiGatherEnded.validity()

                override fun visitCallAiGatherMessageHistoryUpdated(
                    callAiGatherMessageHistoryUpdated: CallAiGatherMessageHistoryUpdatedWebhookEvent
                ) = callAiGatherMessageHistoryUpdated.validity()

                override fun visitCallAiGatherPartialResults(
                    callAiGatherPartialResults: CallAiGatherPartialResultsWebhookEvent
                ) = callAiGatherPartialResults.validity()

                override fun visitCallAnswered(callAnswered: CallAnsweredWebhookEvent) =
                    callAnswered.validity()

                override fun visitCallBridged(callBridged: CallBridged) = callBridged.validity()

                override fun visitCallConversationEnded(
                    callConversationEnded: CallConversationEndedWebhookEvent
                ) = callConversationEnded.validity()

                override fun visitCallConversationInsightsGenerated(
                    callConversationInsightsGenerated: CallConversationInsightsGeneratedWebhookEvent
                ) = callConversationInsightsGenerated.validity()

                override fun visitCallDtmfReceived(callDtmfReceived: CallDtmfReceivedWebhookEvent) =
                    callDtmfReceived.validity()

                override fun visitCallEnqueued(callEnqueued: CallEnqueuedWebhookEvent) =
                    callEnqueued.validity()

                override fun visitCallForkStarted(callForkStarted: CallForkStartedWebhookEvent) =
                    callForkStarted.validity()

                override fun visitCallForkStopped(callForkStopped: CallForkStoppedWebhookEvent) =
                    callForkStopped.validity()

                override fun visitCallGatherEnded(callGatherEnded: CallGatherEndedWebhookEvent) =
                    callGatherEnded.validity()

                override fun visitCallHangup(callHangup: CallHangupWebhookEvent) =
                    callHangup.validity()

                override fun visitCallInitiated(callInitiated: CallInitiatedWebhookEvent) =
                    callInitiated.validity()

                override fun visitCallLeftQueue(callLeftQueue: CallLeftQueueWebhookEvent) =
                    callLeftQueue.validity()

                override fun visitCallMachineDetectionEnded(
                    callMachineDetectionEnded: CallMachineDetectionEndedWebhookEvent
                ) = callMachineDetectionEnded.validity()

                override fun visitCallMachineGreetingEnded(
                    callMachineGreetingEnded: CallMachineGreetingEndedWebhookEvent
                ) = callMachineGreetingEnded.validity()

                override fun visitCallMachinePremiumDetectionEnded(
                    callMachinePremiumDetectionEnded: CallMachinePremiumDetectionEndedWebhookEvent
                ) = callMachinePremiumDetectionEnded.validity()

                override fun visitCallMachinePremiumGreetingEnded(
                    callMachinePremiumGreetingEnded: CallMachinePremiumGreetingEndedWebhookEvent
                ) = callMachinePremiumGreetingEnded.validity()

                override fun visitCallPlaybackEnded(
                    callPlaybackEnded: CallPlaybackEndedWebhookEvent
                ) = callPlaybackEnded.validity()

                override fun visitCallPlaybackStarted(
                    callPlaybackStarted: CallPlaybackStartedWebhookEvent
                ) = callPlaybackStarted.validity()

                override fun visitCallRecordingError(
                    callRecordingError: CallRecordingErrorWebhookEvent
                ) = callRecordingError.validity()

                override fun visitCallRecordingSaved(
                    callRecordingSaved: CallRecordingSavedWebhookEvent
                ) = callRecordingSaved.validity()

                override fun visitCallRecordingTranscriptionSaved(
                    callRecordingTranscriptionSaved: CallRecordingTranscriptionSavedWebhookEvent
                ) = callRecordingTranscriptionSaved.validity()

                override fun visitCallReferCompleted(
                    callReferCompleted: CallReferCompletedWebhookEvent
                ) = callReferCompleted.validity()

                override fun visitCallReferFailed(callReferFailed: CallReferFailedWebhookEvent) =
                    callReferFailed.validity()

                override fun visitCallReferStarted(callReferStarted: CallReferStartedWebhookEvent) =
                    callReferStarted.validity()

                override fun visitCallSiprecFailed(callSiprecFailed: CallSiprecFailedWebhookEvent) =
                    callSiprecFailed.validity()

                override fun visitCallSiprecStarted(
                    callSiprecStarted: CallSiprecStartedWebhookEvent
                ) = callSiprecStarted.validity()

                override fun visitCallSiprecStopped(
                    callSiprecStopped: CallSiprecStoppedWebhookEvent
                ) = callSiprecStopped.validity()

                override fun visitCallSpeakEnded(callSpeakEnded: CallSpeakEndedWebhookEvent) =
                    callSpeakEnded.validity()

                override fun visitCallSpeakStarted(callSpeakStarted: CallSpeakStartedWebhookEvent) =
                    callSpeakStarted.validity()

                override fun visitCallStreamingFailed(
                    callStreamingFailed: CallStreamingFailedWebhookEvent
                ) = callStreamingFailed.validity()

                override fun visitCallStreamingStarted(
                    callStreamingStarted: CallStreamingStartedWebhookEvent
                ) = callStreamingStarted.validity()

                override fun visitCallStreamingStopped(
                    callStreamingStopped: CallStreamingStoppedWebhookEvent
                ) = callStreamingStopped.validity()

                override fun visitCampaignStatusUpdate(campaignStatusUpdate: CampaignStatusUpdate) =
                    campaignStatusUpdate.validity()

                override fun visitConferenceCreated(
                    conferenceCreated: ConferenceCreatedWebhookEvent
                ) = conferenceCreated.validity()

                override fun visitConferenceEnded(conferenceEnded: ConferenceEndedWebhookEvent) =
                    conferenceEnded.validity()

                override fun visitConferenceFloorChanged(
                    conferenceFloorChanged: ConferenceFloorChanged
                ) = conferenceFloorChanged.validity()

                override fun visitConferenceParticipantJoined(
                    conferenceParticipantJoined: ConferenceParticipantJoinedWebhookEvent
                ) = conferenceParticipantJoined.validity()

                override fun visitConferenceParticipantLeft(
                    conferenceParticipantLeft: ConferenceParticipantLeftWebhookEvent
                ) = conferenceParticipantLeft.validity()

                override fun visitConferenceParticipantPlaybackEnded(
                    conferenceParticipantPlaybackEnded:
                        ConferenceParticipantPlaybackEndedWebhookEvent
                ) = conferenceParticipantPlaybackEnded.validity()

                override fun visitConferenceParticipantPlaybackStarted(
                    conferenceParticipantPlaybackStarted:
                        ConferenceParticipantPlaybackStartedWebhookEvent
                ) = conferenceParticipantPlaybackStarted.validity()

                override fun visitConferenceParticipantSpeakEnded(
                    conferenceParticipantSpeakEnded: ConferenceParticipantSpeakEndedWebhookEvent
                ) = conferenceParticipantSpeakEnded.validity()

                override fun visitConferenceParticipantSpeakStarted(
                    conferenceParticipantSpeakStarted: ConferenceParticipantSpeakStartedWebhookEvent
                ) = conferenceParticipantSpeakStarted.validity()

                override fun visitConferencePlaybackEnded(
                    conferencePlaybackEnded: ConferencePlaybackEndedWebhookEvent
                ) = conferencePlaybackEnded.validity()

                override fun visitConferencePlaybackStarted(
                    conferencePlaybackStarted: ConferencePlaybackStartedWebhookEvent
                ) = conferencePlaybackStarted.validity()

                override fun visitConferenceRecordingSaved(
                    conferenceRecordingSaved: ConferenceRecordingSavedWebhookEvent
                ) = conferenceRecordingSaved.validity()

                override fun visitConferenceSpeakEnded(
                    conferenceSpeakEnded: ConferenceSpeakEndedWebhookEvent
                ) = conferenceSpeakEnded.validity()

                override fun visitConferenceSpeakStarted(
                    conferenceSpeakStarted: ConferenceSpeakStartedWebhookEvent
                ) = conferenceSpeakStarted.validity()

                override fun visitDeliveryUpdate(deliveryUpdate: DeliveryUpdateWebhookEvent) =
                    deliveryUpdate.validity()

                override fun visitFaxDelivered(faxDelivered: FaxDelivered) = faxDelivered.validity()

                override fun visitFaxFailed(faxFailed: FaxFailed) = faxFailed.validity()

                override fun visitFaxMediaProcessed(faxMediaProcessed: FaxMediaProcessed) =
                    faxMediaProcessed.validity()

                override fun visitFaxQueued(faxQueued: FaxQueued) = faxQueued.validity()

                override fun visitFaxSendingStarted(faxSendingStarted: FaxSendingStarted) =
                    faxSendingStarted.validity()

                override fun visitInboundMessage(inboundMessage: InboundMessageWebhookEvent) =
                    inboundMessage.validity()

                override fun visitNumberOrderStatusUpdate(
                    numberOrderStatusUpdate: NumberOrderStatusUpdate
                ) = numberOrderStatusUpdate.validity()

                override fun visitReplacedLinkClick(
                    replacedLinkClick: ReplacedLinkClickWebhookEvent
                ) = replacedLinkClick.validity()

                override fun visitTranscription(transcription: TranscriptionWebhookEvent) =
                    transcription.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnwrapWebhookEvent &&
            callAiGatherEnded == other.callAiGatherEnded &&
            callAiGatherMessageHistoryUpdated == other.callAiGatherMessageHistoryUpdated &&
            callAiGatherPartialResults == other.callAiGatherPartialResults &&
            callAnswered == other.callAnswered &&
            callBridged == other.callBridged &&
            callConversationEnded == other.callConversationEnded &&
            callConversationInsightsGenerated == other.callConversationInsightsGenerated &&
            callDtmfReceived == other.callDtmfReceived &&
            callEnqueued == other.callEnqueued &&
            callForkStarted == other.callForkStarted &&
            callForkStopped == other.callForkStopped &&
            callGatherEnded == other.callGatherEnded &&
            callHangup == other.callHangup &&
            callInitiated == other.callInitiated &&
            callLeftQueue == other.callLeftQueue &&
            callMachineDetectionEnded == other.callMachineDetectionEnded &&
            callMachineGreetingEnded == other.callMachineGreetingEnded &&
            callMachinePremiumDetectionEnded == other.callMachinePremiumDetectionEnded &&
            callMachinePremiumGreetingEnded == other.callMachinePremiumGreetingEnded &&
            callPlaybackEnded == other.callPlaybackEnded &&
            callPlaybackStarted == other.callPlaybackStarted &&
            callRecordingError == other.callRecordingError &&
            callRecordingSaved == other.callRecordingSaved &&
            callRecordingTranscriptionSaved == other.callRecordingTranscriptionSaved &&
            callReferCompleted == other.callReferCompleted &&
            callReferFailed == other.callReferFailed &&
            callReferStarted == other.callReferStarted &&
            callSiprecFailed == other.callSiprecFailed &&
            callSiprecStarted == other.callSiprecStarted &&
            callSiprecStopped == other.callSiprecStopped &&
            callSpeakEnded == other.callSpeakEnded &&
            callSpeakStarted == other.callSpeakStarted &&
            callStreamingFailed == other.callStreamingFailed &&
            callStreamingStarted == other.callStreamingStarted &&
            callStreamingStopped == other.callStreamingStopped &&
            campaignStatusUpdate == other.campaignStatusUpdate &&
            conferenceCreated == other.conferenceCreated &&
            conferenceEnded == other.conferenceEnded &&
            conferenceFloorChanged == other.conferenceFloorChanged &&
            conferenceParticipantJoined == other.conferenceParticipantJoined &&
            conferenceParticipantLeft == other.conferenceParticipantLeft &&
            conferenceParticipantPlaybackEnded == other.conferenceParticipantPlaybackEnded &&
            conferenceParticipantPlaybackStarted == other.conferenceParticipantPlaybackStarted &&
            conferenceParticipantSpeakEnded == other.conferenceParticipantSpeakEnded &&
            conferenceParticipantSpeakStarted == other.conferenceParticipantSpeakStarted &&
            conferencePlaybackEnded == other.conferencePlaybackEnded &&
            conferencePlaybackStarted == other.conferencePlaybackStarted &&
            conferenceRecordingSaved == other.conferenceRecordingSaved &&
            conferenceSpeakEnded == other.conferenceSpeakEnded &&
            conferenceSpeakStarted == other.conferenceSpeakStarted &&
            deliveryUpdate == other.deliveryUpdate &&
            faxDelivered == other.faxDelivered &&
            faxFailed == other.faxFailed &&
            faxMediaProcessed == other.faxMediaProcessed &&
            faxQueued == other.faxQueued &&
            faxSendingStarted == other.faxSendingStarted &&
            inboundMessage == other.inboundMessage &&
            numberOrderStatusUpdate == other.numberOrderStatusUpdate &&
            replacedLinkClick == other.replacedLinkClick &&
            transcription == other.transcription
    }

    override fun hashCode(): Int =
        Objects.hash(
            callAiGatherEnded,
            callAiGatherMessageHistoryUpdated,
            callAiGatherPartialResults,
            callAnswered,
            callBridged,
            callConversationEnded,
            callConversationInsightsGenerated,
            callDtmfReceived,
            callEnqueued,
            callForkStarted,
            callForkStopped,
            callGatherEnded,
            callHangup,
            callInitiated,
            callLeftQueue,
            callMachineDetectionEnded,
            callMachineGreetingEnded,
            callMachinePremiumDetectionEnded,
            callMachinePremiumGreetingEnded,
            callPlaybackEnded,
            callPlaybackStarted,
            callRecordingError,
            callRecordingSaved,
            callRecordingTranscriptionSaved,
            callReferCompleted,
            callReferFailed,
            callReferStarted,
            callSiprecFailed,
            callSiprecStarted,
            callSiprecStopped,
            callSpeakEnded,
            callSpeakStarted,
            callStreamingFailed,
            callStreamingStarted,
            callStreamingStopped,
            campaignStatusUpdate,
            conferenceCreated,
            conferenceEnded,
            conferenceFloorChanged,
            conferenceParticipantJoined,
            conferenceParticipantLeft,
            conferenceParticipantPlaybackEnded,
            conferenceParticipantPlaybackStarted,
            conferenceParticipantSpeakEnded,
            conferenceParticipantSpeakStarted,
            conferencePlaybackEnded,
            conferencePlaybackStarted,
            conferenceRecordingSaved,
            conferenceSpeakEnded,
            conferenceSpeakStarted,
            deliveryUpdate,
            faxDelivered,
            faxFailed,
            faxMediaProcessed,
            faxQueued,
            faxSendingStarted,
            inboundMessage,
            numberOrderStatusUpdate,
            replacedLinkClick,
            transcription,
        )

    override fun toString(): String =
        when {
            callAiGatherEnded != null -> "UnwrapWebhookEvent{callAiGatherEnded=$callAiGatherEnded}"
            callAiGatherMessageHistoryUpdated != null ->
                "UnwrapWebhookEvent{callAiGatherMessageHistoryUpdated=$callAiGatherMessageHistoryUpdated}"
            callAiGatherPartialResults != null ->
                "UnwrapWebhookEvent{callAiGatherPartialResults=$callAiGatherPartialResults}"
            callAnswered != null -> "UnwrapWebhookEvent{callAnswered=$callAnswered}"
            callBridged != null -> "UnwrapWebhookEvent{callBridged=$callBridged}"
            callConversationEnded != null ->
                "UnwrapWebhookEvent{callConversationEnded=$callConversationEnded}"
            callConversationInsightsGenerated != null ->
                "UnwrapWebhookEvent{callConversationInsightsGenerated=$callConversationInsightsGenerated}"
            callDtmfReceived != null -> "UnwrapWebhookEvent{callDtmfReceived=$callDtmfReceived}"
            callEnqueued != null -> "UnwrapWebhookEvent{callEnqueued=$callEnqueued}"
            callForkStarted != null -> "UnwrapWebhookEvent{callForkStarted=$callForkStarted}"
            callForkStopped != null -> "UnwrapWebhookEvent{callForkStopped=$callForkStopped}"
            callGatherEnded != null -> "UnwrapWebhookEvent{callGatherEnded=$callGatherEnded}"
            callHangup != null -> "UnwrapWebhookEvent{callHangup=$callHangup}"
            callInitiated != null -> "UnwrapWebhookEvent{callInitiated=$callInitiated}"
            callLeftQueue != null -> "UnwrapWebhookEvent{callLeftQueue=$callLeftQueue}"
            callMachineDetectionEnded != null ->
                "UnwrapWebhookEvent{callMachineDetectionEnded=$callMachineDetectionEnded}"
            callMachineGreetingEnded != null ->
                "UnwrapWebhookEvent{callMachineGreetingEnded=$callMachineGreetingEnded}"
            callMachinePremiumDetectionEnded != null ->
                "UnwrapWebhookEvent{callMachinePremiumDetectionEnded=$callMachinePremiumDetectionEnded}"
            callMachinePremiumGreetingEnded != null ->
                "UnwrapWebhookEvent{callMachinePremiumGreetingEnded=$callMachinePremiumGreetingEnded}"
            callPlaybackEnded != null -> "UnwrapWebhookEvent{callPlaybackEnded=$callPlaybackEnded}"
            callPlaybackStarted != null ->
                "UnwrapWebhookEvent{callPlaybackStarted=$callPlaybackStarted}"
            callRecordingError != null ->
                "UnwrapWebhookEvent{callRecordingError=$callRecordingError}"
            callRecordingSaved != null ->
                "UnwrapWebhookEvent{callRecordingSaved=$callRecordingSaved}"
            callRecordingTranscriptionSaved != null ->
                "UnwrapWebhookEvent{callRecordingTranscriptionSaved=$callRecordingTranscriptionSaved}"
            callReferCompleted != null ->
                "UnwrapWebhookEvent{callReferCompleted=$callReferCompleted}"
            callReferFailed != null -> "UnwrapWebhookEvent{callReferFailed=$callReferFailed}"
            callReferStarted != null -> "UnwrapWebhookEvent{callReferStarted=$callReferStarted}"
            callSiprecFailed != null -> "UnwrapWebhookEvent{callSiprecFailed=$callSiprecFailed}"
            callSiprecStarted != null -> "UnwrapWebhookEvent{callSiprecStarted=$callSiprecStarted}"
            callSiprecStopped != null -> "UnwrapWebhookEvent{callSiprecStopped=$callSiprecStopped}"
            callSpeakEnded != null -> "UnwrapWebhookEvent{callSpeakEnded=$callSpeakEnded}"
            callSpeakStarted != null -> "UnwrapWebhookEvent{callSpeakStarted=$callSpeakStarted}"
            callStreamingFailed != null ->
                "UnwrapWebhookEvent{callStreamingFailed=$callStreamingFailed}"
            callStreamingStarted != null ->
                "UnwrapWebhookEvent{callStreamingStarted=$callStreamingStarted}"
            callStreamingStopped != null ->
                "UnwrapWebhookEvent{callStreamingStopped=$callStreamingStopped}"
            campaignStatusUpdate != null ->
                "UnwrapWebhookEvent{campaignStatusUpdate=$campaignStatusUpdate}"
            conferenceCreated != null -> "UnwrapWebhookEvent{conferenceCreated=$conferenceCreated}"
            conferenceEnded != null -> "UnwrapWebhookEvent{conferenceEnded=$conferenceEnded}"
            conferenceFloorChanged != null ->
                "UnwrapWebhookEvent{conferenceFloorChanged=$conferenceFloorChanged}"
            conferenceParticipantJoined != null ->
                "UnwrapWebhookEvent{conferenceParticipantJoined=$conferenceParticipantJoined}"
            conferenceParticipantLeft != null ->
                "UnwrapWebhookEvent{conferenceParticipantLeft=$conferenceParticipantLeft}"
            conferenceParticipantPlaybackEnded != null ->
                "UnwrapWebhookEvent{conferenceParticipantPlaybackEnded=$conferenceParticipantPlaybackEnded}"
            conferenceParticipantPlaybackStarted != null ->
                "UnwrapWebhookEvent{conferenceParticipantPlaybackStarted=$conferenceParticipantPlaybackStarted}"
            conferenceParticipantSpeakEnded != null ->
                "UnwrapWebhookEvent{conferenceParticipantSpeakEnded=$conferenceParticipantSpeakEnded}"
            conferenceParticipantSpeakStarted != null ->
                "UnwrapWebhookEvent{conferenceParticipantSpeakStarted=$conferenceParticipantSpeakStarted}"
            conferencePlaybackEnded != null ->
                "UnwrapWebhookEvent{conferencePlaybackEnded=$conferencePlaybackEnded}"
            conferencePlaybackStarted != null ->
                "UnwrapWebhookEvent{conferencePlaybackStarted=$conferencePlaybackStarted}"
            conferenceRecordingSaved != null ->
                "UnwrapWebhookEvent{conferenceRecordingSaved=$conferenceRecordingSaved}"
            conferenceSpeakEnded != null ->
                "UnwrapWebhookEvent{conferenceSpeakEnded=$conferenceSpeakEnded}"
            conferenceSpeakStarted != null ->
                "UnwrapWebhookEvent{conferenceSpeakStarted=$conferenceSpeakStarted}"
            deliveryUpdate != null -> "UnwrapWebhookEvent{deliveryUpdate=$deliveryUpdate}"
            faxDelivered != null -> "UnwrapWebhookEvent{faxDelivered=$faxDelivered}"
            faxFailed != null -> "UnwrapWebhookEvent{faxFailed=$faxFailed}"
            faxMediaProcessed != null -> "UnwrapWebhookEvent{faxMediaProcessed=$faxMediaProcessed}"
            faxQueued != null -> "UnwrapWebhookEvent{faxQueued=$faxQueued}"
            faxSendingStarted != null -> "UnwrapWebhookEvent{faxSendingStarted=$faxSendingStarted}"
            inboundMessage != null -> "UnwrapWebhookEvent{inboundMessage=$inboundMessage}"
            numberOrderStatusUpdate != null ->
                "UnwrapWebhookEvent{numberOrderStatusUpdate=$numberOrderStatusUpdate}"
            replacedLinkClick != null -> "UnwrapWebhookEvent{replacedLinkClick=$replacedLinkClick}"
            transcription != null -> "UnwrapWebhookEvent{transcription=$transcription}"
            _json != null -> "UnwrapWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid UnwrapWebhookEvent")
        }

    companion object {

        @JvmStatic
        fun ofCallAiGatherEnded(callAiGatherEnded: CallAiGatherEndedWebhookEvent) =
            UnwrapWebhookEvent(callAiGatherEnded = callAiGatherEnded)

        @JvmStatic
        fun ofCallAiGatherMessageHistoryUpdated(
            callAiGatherMessageHistoryUpdated: CallAiGatherMessageHistoryUpdatedWebhookEvent
        ) =
            UnwrapWebhookEvent(
                callAiGatherMessageHistoryUpdated = callAiGatherMessageHistoryUpdated
            )

        @JvmStatic
        fun ofCallAiGatherPartialResults(
            callAiGatherPartialResults: CallAiGatherPartialResultsWebhookEvent
        ) = UnwrapWebhookEvent(callAiGatherPartialResults = callAiGatherPartialResults)

        @JvmStatic
        fun ofCallAnswered(callAnswered: CallAnsweredWebhookEvent) =
            UnwrapWebhookEvent(callAnswered = callAnswered)

        @JvmStatic
        fun ofCallBridged(callBridged: CallBridged) = UnwrapWebhookEvent(callBridged = callBridged)

        @JvmStatic
        fun ofCallConversationEnded(callConversationEnded: CallConversationEndedWebhookEvent) =
            UnwrapWebhookEvent(callConversationEnded = callConversationEnded)

        @JvmStatic
        fun ofCallConversationInsightsGenerated(
            callConversationInsightsGenerated: CallConversationInsightsGeneratedWebhookEvent
        ) =
            UnwrapWebhookEvent(
                callConversationInsightsGenerated = callConversationInsightsGenerated
            )

        @JvmStatic
        fun ofCallDtmfReceived(callDtmfReceived: CallDtmfReceivedWebhookEvent) =
            UnwrapWebhookEvent(callDtmfReceived = callDtmfReceived)

        @JvmStatic
        fun ofCallEnqueued(callEnqueued: CallEnqueuedWebhookEvent) =
            UnwrapWebhookEvent(callEnqueued = callEnqueued)

        @JvmStatic
        fun ofCallForkStarted(callForkStarted: CallForkStartedWebhookEvent) =
            UnwrapWebhookEvent(callForkStarted = callForkStarted)

        @JvmStatic
        fun ofCallForkStopped(callForkStopped: CallForkStoppedWebhookEvent) =
            UnwrapWebhookEvent(callForkStopped = callForkStopped)

        @JvmStatic
        fun ofCallGatherEnded(callGatherEnded: CallGatherEndedWebhookEvent) =
            UnwrapWebhookEvent(callGatherEnded = callGatherEnded)

        @JvmStatic
        fun ofCallHangup(callHangup: CallHangupWebhookEvent) =
            UnwrapWebhookEvent(callHangup = callHangup)

        @JvmStatic
        fun ofCallInitiated(callInitiated: CallInitiatedWebhookEvent) =
            UnwrapWebhookEvent(callInitiated = callInitiated)

        @JvmStatic
        fun ofCallLeftQueue(callLeftQueue: CallLeftQueueWebhookEvent) =
            UnwrapWebhookEvent(callLeftQueue = callLeftQueue)

        @JvmStatic
        fun ofCallMachineDetectionEnded(
            callMachineDetectionEnded: CallMachineDetectionEndedWebhookEvent
        ) = UnwrapWebhookEvent(callMachineDetectionEnded = callMachineDetectionEnded)

        @JvmStatic
        fun ofCallMachineGreetingEnded(
            callMachineGreetingEnded: CallMachineGreetingEndedWebhookEvent
        ) = UnwrapWebhookEvent(callMachineGreetingEnded = callMachineGreetingEnded)

        @JvmStatic
        fun ofCallMachinePremiumDetectionEnded(
            callMachinePremiumDetectionEnded: CallMachinePremiumDetectionEndedWebhookEvent
        ) = UnwrapWebhookEvent(callMachinePremiumDetectionEnded = callMachinePremiumDetectionEnded)

        @JvmStatic
        fun ofCallMachinePremiumGreetingEnded(
            callMachinePremiumGreetingEnded: CallMachinePremiumGreetingEndedWebhookEvent
        ) = UnwrapWebhookEvent(callMachinePremiumGreetingEnded = callMachinePremiumGreetingEnded)

        @JvmStatic
        fun ofCallPlaybackEnded(callPlaybackEnded: CallPlaybackEndedWebhookEvent) =
            UnwrapWebhookEvent(callPlaybackEnded = callPlaybackEnded)

        @JvmStatic
        fun ofCallPlaybackStarted(callPlaybackStarted: CallPlaybackStartedWebhookEvent) =
            UnwrapWebhookEvent(callPlaybackStarted = callPlaybackStarted)

        @JvmStatic
        fun ofCallRecordingError(callRecordingError: CallRecordingErrorWebhookEvent) =
            UnwrapWebhookEvent(callRecordingError = callRecordingError)

        @JvmStatic
        fun ofCallRecordingSaved(callRecordingSaved: CallRecordingSavedWebhookEvent) =
            UnwrapWebhookEvent(callRecordingSaved = callRecordingSaved)

        @JvmStatic
        fun ofCallRecordingTranscriptionSaved(
            callRecordingTranscriptionSaved: CallRecordingTranscriptionSavedWebhookEvent
        ) = UnwrapWebhookEvent(callRecordingTranscriptionSaved = callRecordingTranscriptionSaved)

        @JvmStatic
        fun ofCallReferCompleted(callReferCompleted: CallReferCompletedWebhookEvent) =
            UnwrapWebhookEvent(callReferCompleted = callReferCompleted)

        @JvmStatic
        fun ofCallReferFailed(callReferFailed: CallReferFailedWebhookEvent) =
            UnwrapWebhookEvent(callReferFailed = callReferFailed)

        @JvmStatic
        fun ofCallReferStarted(callReferStarted: CallReferStartedWebhookEvent) =
            UnwrapWebhookEvent(callReferStarted = callReferStarted)

        @JvmStatic
        fun ofCallSiprecFailed(callSiprecFailed: CallSiprecFailedWebhookEvent) =
            UnwrapWebhookEvent(callSiprecFailed = callSiprecFailed)

        @JvmStatic
        fun ofCallSiprecStarted(callSiprecStarted: CallSiprecStartedWebhookEvent) =
            UnwrapWebhookEvent(callSiprecStarted = callSiprecStarted)

        @JvmStatic
        fun ofCallSiprecStopped(callSiprecStopped: CallSiprecStoppedWebhookEvent) =
            UnwrapWebhookEvent(callSiprecStopped = callSiprecStopped)

        @JvmStatic
        fun ofCallSpeakEnded(callSpeakEnded: CallSpeakEndedWebhookEvent) =
            UnwrapWebhookEvent(callSpeakEnded = callSpeakEnded)

        @JvmStatic
        fun ofCallSpeakStarted(callSpeakStarted: CallSpeakStartedWebhookEvent) =
            UnwrapWebhookEvent(callSpeakStarted = callSpeakStarted)

        @JvmStatic
        fun ofCallStreamingFailed(callStreamingFailed: CallStreamingFailedWebhookEvent) =
            UnwrapWebhookEvent(callStreamingFailed = callStreamingFailed)

        @JvmStatic
        fun ofCallStreamingStarted(callStreamingStarted: CallStreamingStartedWebhookEvent) =
            UnwrapWebhookEvent(callStreamingStarted = callStreamingStarted)

        @JvmStatic
        fun ofCallStreamingStopped(callStreamingStopped: CallStreamingStoppedWebhookEvent) =
            UnwrapWebhookEvent(callStreamingStopped = callStreamingStopped)

        @JvmStatic
        fun ofCampaignStatusUpdate(campaignStatusUpdate: CampaignStatusUpdate) =
            UnwrapWebhookEvent(campaignStatusUpdate = campaignStatusUpdate)

        @JvmStatic
        fun ofConferenceCreated(conferenceCreated: ConferenceCreatedWebhookEvent) =
            UnwrapWebhookEvent(conferenceCreated = conferenceCreated)

        @JvmStatic
        fun ofConferenceEnded(conferenceEnded: ConferenceEndedWebhookEvent) =
            UnwrapWebhookEvent(conferenceEnded = conferenceEnded)

        @JvmStatic
        fun ofConferenceFloorChanged(conferenceFloorChanged: ConferenceFloorChanged) =
            UnwrapWebhookEvent(conferenceFloorChanged = conferenceFloorChanged)

        @JvmStatic
        fun ofConferenceParticipantJoined(
            conferenceParticipantJoined: ConferenceParticipantJoinedWebhookEvent
        ) = UnwrapWebhookEvent(conferenceParticipantJoined = conferenceParticipantJoined)

        @JvmStatic
        fun ofConferenceParticipantLeft(
            conferenceParticipantLeft: ConferenceParticipantLeftWebhookEvent
        ) = UnwrapWebhookEvent(conferenceParticipantLeft = conferenceParticipantLeft)

        @JvmStatic
        fun ofConferenceParticipantPlaybackEnded(
            conferenceParticipantPlaybackEnded: ConferenceParticipantPlaybackEndedWebhookEvent
        ) =
            UnwrapWebhookEvent(
                conferenceParticipantPlaybackEnded = conferenceParticipantPlaybackEnded
            )

        @JvmStatic
        fun ofConferenceParticipantPlaybackStarted(
            conferenceParticipantPlaybackStarted: ConferenceParticipantPlaybackStartedWebhookEvent
        ) =
            UnwrapWebhookEvent(
                conferenceParticipantPlaybackStarted = conferenceParticipantPlaybackStarted
            )

        @JvmStatic
        fun ofConferenceParticipantSpeakEnded(
            conferenceParticipantSpeakEnded: ConferenceParticipantSpeakEndedWebhookEvent
        ) = UnwrapWebhookEvent(conferenceParticipantSpeakEnded = conferenceParticipantSpeakEnded)

        @JvmStatic
        fun ofConferenceParticipantSpeakStarted(
            conferenceParticipantSpeakStarted: ConferenceParticipantSpeakStartedWebhookEvent
        ) =
            UnwrapWebhookEvent(
                conferenceParticipantSpeakStarted = conferenceParticipantSpeakStarted
            )

        @JvmStatic
        fun ofConferencePlaybackEnded(
            conferencePlaybackEnded: ConferencePlaybackEndedWebhookEvent
        ) = UnwrapWebhookEvent(conferencePlaybackEnded = conferencePlaybackEnded)

        @JvmStatic
        fun ofConferencePlaybackStarted(
            conferencePlaybackStarted: ConferencePlaybackStartedWebhookEvent
        ) = UnwrapWebhookEvent(conferencePlaybackStarted = conferencePlaybackStarted)

        @JvmStatic
        fun ofConferenceRecordingSaved(
            conferenceRecordingSaved: ConferenceRecordingSavedWebhookEvent
        ) = UnwrapWebhookEvent(conferenceRecordingSaved = conferenceRecordingSaved)

        @JvmStatic
        fun ofConferenceSpeakEnded(conferenceSpeakEnded: ConferenceSpeakEndedWebhookEvent) =
            UnwrapWebhookEvent(conferenceSpeakEnded = conferenceSpeakEnded)

        @JvmStatic
        fun ofConferenceSpeakStarted(conferenceSpeakStarted: ConferenceSpeakStartedWebhookEvent) =
            UnwrapWebhookEvent(conferenceSpeakStarted = conferenceSpeakStarted)

        @JvmStatic
        fun ofDeliveryUpdate(deliveryUpdate: DeliveryUpdateWebhookEvent) =
            UnwrapWebhookEvent(deliveryUpdate = deliveryUpdate)

        @JvmStatic
        fun ofFaxDelivered(faxDelivered: FaxDelivered) =
            UnwrapWebhookEvent(faxDelivered = faxDelivered)

        @JvmStatic fun ofFaxFailed(faxFailed: FaxFailed) = UnwrapWebhookEvent(faxFailed = faxFailed)

        @JvmStatic
        fun ofFaxMediaProcessed(faxMediaProcessed: FaxMediaProcessed) =
            UnwrapWebhookEvent(faxMediaProcessed = faxMediaProcessed)

        @JvmStatic fun ofFaxQueued(faxQueued: FaxQueued) = UnwrapWebhookEvent(faxQueued = faxQueued)

        @JvmStatic
        fun ofFaxSendingStarted(faxSendingStarted: FaxSendingStarted) =
            UnwrapWebhookEvent(faxSendingStarted = faxSendingStarted)

        @JvmStatic
        fun ofInboundMessage(inboundMessage: InboundMessageWebhookEvent) =
            UnwrapWebhookEvent(inboundMessage = inboundMessage)

        @JvmStatic
        fun ofNumberOrderStatusUpdate(numberOrderStatusUpdate: NumberOrderStatusUpdate) =
            UnwrapWebhookEvent(numberOrderStatusUpdate = numberOrderStatusUpdate)

        @JvmStatic
        fun ofReplacedLinkClick(replacedLinkClick: ReplacedLinkClickWebhookEvent) =
            UnwrapWebhookEvent(replacedLinkClick = replacedLinkClick)

        @JvmStatic
        fun ofTranscription(transcription: TranscriptionWebhookEvent) =
            UnwrapWebhookEvent(transcription = transcription)
    }

    /**
     * An interface that defines how to map each variant of [UnwrapWebhookEvent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitCallAiGatherEnded(callAiGatherEnded: CallAiGatherEndedWebhookEvent): T

        fun visitCallAiGatherMessageHistoryUpdated(
            callAiGatherMessageHistoryUpdated: CallAiGatherMessageHistoryUpdatedWebhookEvent
        ): T

        fun visitCallAiGatherPartialResults(
            callAiGatherPartialResults: CallAiGatherPartialResultsWebhookEvent
        ): T

        fun visitCallAnswered(callAnswered: CallAnsweredWebhookEvent): T

        fun visitCallBridged(callBridged: CallBridged): T

        fun visitCallConversationEnded(callConversationEnded: CallConversationEndedWebhookEvent): T

        fun visitCallConversationInsightsGenerated(
            callConversationInsightsGenerated: CallConversationInsightsGeneratedWebhookEvent
        ): T

        fun visitCallDtmfReceived(callDtmfReceived: CallDtmfReceivedWebhookEvent): T

        fun visitCallEnqueued(callEnqueued: CallEnqueuedWebhookEvent): T

        fun visitCallForkStarted(callForkStarted: CallForkStartedWebhookEvent): T

        fun visitCallForkStopped(callForkStopped: CallForkStoppedWebhookEvent): T

        fun visitCallGatherEnded(callGatherEnded: CallGatherEndedWebhookEvent): T

        fun visitCallHangup(callHangup: CallHangupWebhookEvent): T

        fun visitCallInitiated(callInitiated: CallInitiatedWebhookEvent): T

        fun visitCallLeftQueue(callLeftQueue: CallLeftQueueWebhookEvent): T

        fun visitCallMachineDetectionEnded(
            callMachineDetectionEnded: CallMachineDetectionEndedWebhookEvent
        ): T

        fun visitCallMachineGreetingEnded(
            callMachineGreetingEnded: CallMachineGreetingEndedWebhookEvent
        ): T

        fun visitCallMachinePremiumDetectionEnded(
            callMachinePremiumDetectionEnded: CallMachinePremiumDetectionEndedWebhookEvent
        ): T

        fun visitCallMachinePremiumGreetingEnded(
            callMachinePremiumGreetingEnded: CallMachinePremiumGreetingEndedWebhookEvent
        ): T

        fun visitCallPlaybackEnded(callPlaybackEnded: CallPlaybackEndedWebhookEvent): T

        fun visitCallPlaybackStarted(callPlaybackStarted: CallPlaybackStartedWebhookEvent): T

        fun visitCallRecordingError(callRecordingError: CallRecordingErrorWebhookEvent): T

        fun visitCallRecordingSaved(callRecordingSaved: CallRecordingSavedWebhookEvent): T

        fun visitCallRecordingTranscriptionSaved(
            callRecordingTranscriptionSaved: CallRecordingTranscriptionSavedWebhookEvent
        ): T

        fun visitCallReferCompleted(callReferCompleted: CallReferCompletedWebhookEvent): T

        fun visitCallReferFailed(callReferFailed: CallReferFailedWebhookEvent): T

        fun visitCallReferStarted(callReferStarted: CallReferStartedWebhookEvent): T

        fun visitCallSiprecFailed(callSiprecFailed: CallSiprecFailedWebhookEvent): T

        fun visitCallSiprecStarted(callSiprecStarted: CallSiprecStartedWebhookEvent): T

        fun visitCallSiprecStopped(callSiprecStopped: CallSiprecStoppedWebhookEvent): T

        fun visitCallSpeakEnded(callSpeakEnded: CallSpeakEndedWebhookEvent): T

        fun visitCallSpeakStarted(callSpeakStarted: CallSpeakStartedWebhookEvent): T

        fun visitCallStreamingFailed(callStreamingFailed: CallStreamingFailedWebhookEvent): T

        fun visitCallStreamingStarted(callStreamingStarted: CallStreamingStartedWebhookEvent): T

        fun visitCallStreamingStopped(callStreamingStopped: CallStreamingStoppedWebhookEvent): T

        fun visitCampaignStatusUpdate(campaignStatusUpdate: CampaignStatusUpdate): T

        fun visitConferenceCreated(conferenceCreated: ConferenceCreatedWebhookEvent): T

        fun visitConferenceEnded(conferenceEnded: ConferenceEndedWebhookEvent): T

        fun visitConferenceFloorChanged(conferenceFloorChanged: ConferenceFloorChanged): T

        fun visitConferenceParticipantJoined(
            conferenceParticipantJoined: ConferenceParticipantJoinedWebhookEvent
        ): T

        fun visitConferenceParticipantLeft(
            conferenceParticipantLeft: ConferenceParticipantLeftWebhookEvent
        ): T

        fun visitConferenceParticipantPlaybackEnded(
            conferenceParticipantPlaybackEnded: ConferenceParticipantPlaybackEndedWebhookEvent
        ): T

        fun visitConferenceParticipantPlaybackStarted(
            conferenceParticipantPlaybackStarted: ConferenceParticipantPlaybackStartedWebhookEvent
        ): T

        fun visitConferenceParticipantSpeakEnded(
            conferenceParticipantSpeakEnded: ConferenceParticipantSpeakEndedWebhookEvent
        ): T

        fun visitConferenceParticipantSpeakStarted(
            conferenceParticipantSpeakStarted: ConferenceParticipantSpeakStartedWebhookEvent
        ): T

        fun visitConferencePlaybackEnded(
            conferencePlaybackEnded: ConferencePlaybackEndedWebhookEvent
        ): T

        fun visitConferencePlaybackStarted(
            conferencePlaybackStarted: ConferencePlaybackStartedWebhookEvent
        ): T

        fun visitConferenceRecordingSaved(
            conferenceRecordingSaved: ConferenceRecordingSavedWebhookEvent
        ): T

        fun visitConferenceSpeakEnded(conferenceSpeakEnded: ConferenceSpeakEndedWebhookEvent): T

        fun visitConferenceSpeakStarted(
            conferenceSpeakStarted: ConferenceSpeakStartedWebhookEvent
        ): T

        fun visitDeliveryUpdate(deliveryUpdate: DeliveryUpdateWebhookEvent): T

        fun visitFaxDelivered(faxDelivered: FaxDelivered): T

        fun visitFaxFailed(faxFailed: FaxFailed): T

        fun visitFaxMediaProcessed(faxMediaProcessed: FaxMediaProcessed): T

        fun visitFaxQueued(faxQueued: FaxQueued): T

        fun visitFaxSendingStarted(faxSendingStarted: FaxSendingStarted): T

        fun visitInboundMessage(inboundMessage: InboundMessageWebhookEvent): T

        fun visitNumberOrderStatusUpdate(numberOrderStatusUpdate: NumberOrderStatusUpdate): T

        fun visitReplacedLinkClick(replacedLinkClick: ReplacedLinkClickWebhookEvent): T

        fun visitTranscription(transcription: TranscriptionWebhookEvent): T

        /**
         * Maps an unknown variant of [UnwrapWebhookEvent] to a value of type [T].
         *
         * An instance of [UnwrapWebhookEvent] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown UnwrapWebhookEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<UnwrapWebhookEvent>(UnwrapWebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): UnwrapWebhookEvent {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<CallAiGatherEndedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callAiGatherEnded = it, _json = json)
                        },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CallAiGatherMessageHistoryUpdatedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    callAiGatherMessageHistoryUpdated = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CallAiGatherPartialResultsWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(callAiGatherPartialResults = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<CallAnsweredWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callAnswered = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallBridged>())?.let {
                            UnwrapWebhookEvent(callBridged = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallConversationEndedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(callConversationEnded = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CallConversationInsightsGeneratedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    callConversationInsightsGenerated = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<CallDtmfReceivedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callDtmfReceived = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallEnqueuedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callEnqueued = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallForkStartedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callForkStarted = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallForkStoppedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callForkStopped = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallGatherEndedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callGatherEnded = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallHangupWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callHangup = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallInitiatedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callInitiated = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallLeftQueueWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callLeftQueue = it, _json = json)
                        },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CallMachineDetectionEndedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(callMachineDetectionEnded = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<CallMachineGreetingEndedWebhookEvent>())
                            ?.let {
                                UnwrapWebhookEvent(callMachineGreetingEnded = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CallMachinePremiumDetectionEndedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    callMachinePremiumDetectionEnded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CallMachinePremiumGreetingEndedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    callMachinePremiumGreetingEnded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<CallPlaybackEndedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callPlaybackEnded = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallPlaybackStartedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(callPlaybackStarted = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<CallRecordingErrorWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(callRecordingError = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<CallRecordingSavedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(callRecordingSaved = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CallRecordingTranscriptionSavedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    callRecordingTranscriptionSaved = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<CallReferCompletedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(callReferCompleted = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<CallReferFailedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callReferFailed = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallReferStartedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callReferStarted = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallSiprecFailedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callSiprecFailed = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallSiprecStartedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callSiprecStarted = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallSiprecStoppedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callSiprecStopped = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallSpeakEndedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callSpeakEnded = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallSpeakStartedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(callSpeakStarted = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CallStreamingFailedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(callStreamingFailed = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<CallStreamingStartedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(callStreamingStarted = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<CallStreamingStoppedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(callStreamingStopped = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<CampaignStatusUpdate>())?.let {
                            UnwrapWebhookEvent(campaignStatusUpdate = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ConferenceCreatedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(conferenceCreated = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ConferenceEndedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(conferenceEnded = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ConferenceFloorChanged>())?.let {
                            UnwrapWebhookEvent(conferenceFloorChanged = it, _json = json)
                        },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ConferenceParticipantJoinedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(conferenceParticipantJoined = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ConferenceParticipantLeftWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(conferenceParticipantLeft = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ConferenceParticipantPlaybackEndedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    conferenceParticipantPlaybackEnded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ConferenceParticipantPlaybackStartedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    conferenceParticipantPlaybackStarted = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ConferenceParticipantSpeakEndedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    conferenceParticipantSpeakEnded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ConferenceParticipantSpeakStartedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    conferenceParticipantSpeakStarted = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<ConferencePlaybackEndedWebhookEvent>())
                            ?.let {
                                UnwrapWebhookEvent(conferencePlaybackEnded = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ConferencePlaybackStartedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(conferencePlaybackStarted = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<ConferenceRecordingSavedWebhookEvent>())
                            ?.let {
                                UnwrapWebhookEvent(conferenceRecordingSaved = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<ConferenceSpeakEndedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(conferenceSpeakEnded = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<ConferenceSpeakStartedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(conferenceSpeakStarted = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<DeliveryUpdateWebhookEvent>())?.let {
                            UnwrapWebhookEvent(deliveryUpdate = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FaxDelivered>())?.let {
                            UnwrapWebhookEvent(faxDelivered = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FaxFailed>())?.let {
                            UnwrapWebhookEvent(faxFailed = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FaxMediaProcessed>())?.let {
                            UnwrapWebhookEvent(faxMediaProcessed = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FaxQueued>())?.let {
                            UnwrapWebhookEvent(faxQueued = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FaxSendingStarted>())?.let {
                            UnwrapWebhookEvent(faxSendingStarted = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<InboundMessageWebhookEvent>())?.let {
                            UnwrapWebhookEvent(inboundMessage = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<NumberOrderStatusUpdate>())?.let {
                            UnwrapWebhookEvent(numberOrderStatusUpdate = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ReplacedLinkClickWebhookEvent>())?.let {
                            UnwrapWebhookEvent(replacedLinkClick = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<TranscriptionWebhookEvent>())?.let {
                            UnwrapWebhookEvent(transcription = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> UnwrapWebhookEvent(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<UnwrapWebhookEvent>(UnwrapWebhookEvent::class) {

        override fun serialize(
            value: UnwrapWebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.callAiGatherEnded != null -> generator.writeObject(value.callAiGatherEnded)
                value.callAiGatherMessageHistoryUpdated != null ->
                    generator.writeObject(value.callAiGatherMessageHistoryUpdated)
                value.callAiGatherPartialResults != null ->
                    generator.writeObject(value.callAiGatherPartialResults)
                value.callAnswered != null -> generator.writeObject(value.callAnswered)
                value.callBridged != null -> generator.writeObject(value.callBridged)
                value.callConversationEnded != null ->
                    generator.writeObject(value.callConversationEnded)
                value.callConversationInsightsGenerated != null ->
                    generator.writeObject(value.callConversationInsightsGenerated)
                value.callDtmfReceived != null -> generator.writeObject(value.callDtmfReceived)
                value.callEnqueued != null -> generator.writeObject(value.callEnqueued)
                value.callForkStarted != null -> generator.writeObject(value.callForkStarted)
                value.callForkStopped != null -> generator.writeObject(value.callForkStopped)
                value.callGatherEnded != null -> generator.writeObject(value.callGatherEnded)
                value.callHangup != null -> generator.writeObject(value.callHangup)
                value.callInitiated != null -> generator.writeObject(value.callInitiated)
                value.callLeftQueue != null -> generator.writeObject(value.callLeftQueue)
                value.callMachineDetectionEnded != null ->
                    generator.writeObject(value.callMachineDetectionEnded)
                value.callMachineGreetingEnded != null ->
                    generator.writeObject(value.callMachineGreetingEnded)
                value.callMachinePremiumDetectionEnded != null ->
                    generator.writeObject(value.callMachinePremiumDetectionEnded)
                value.callMachinePremiumGreetingEnded != null ->
                    generator.writeObject(value.callMachinePremiumGreetingEnded)
                value.callPlaybackEnded != null -> generator.writeObject(value.callPlaybackEnded)
                value.callPlaybackStarted != null ->
                    generator.writeObject(value.callPlaybackStarted)
                value.callRecordingError != null -> generator.writeObject(value.callRecordingError)
                value.callRecordingSaved != null -> generator.writeObject(value.callRecordingSaved)
                value.callRecordingTranscriptionSaved != null ->
                    generator.writeObject(value.callRecordingTranscriptionSaved)
                value.callReferCompleted != null -> generator.writeObject(value.callReferCompleted)
                value.callReferFailed != null -> generator.writeObject(value.callReferFailed)
                value.callReferStarted != null -> generator.writeObject(value.callReferStarted)
                value.callSiprecFailed != null -> generator.writeObject(value.callSiprecFailed)
                value.callSiprecStarted != null -> generator.writeObject(value.callSiprecStarted)
                value.callSiprecStopped != null -> generator.writeObject(value.callSiprecStopped)
                value.callSpeakEnded != null -> generator.writeObject(value.callSpeakEnded)
                value.callSpeakStarted != null -> generator.writeObject(value.callSpeakStarted)
                value.callStreamingFailed != null ->
                    generator.writeObject(value.callStreamingFailed)
                value.callStreamingStarted != null ->
                    generator.writeObject(value.callStreamingStarted)
                value.callStreamingStopped != null ->
                    generator.writeObject(value.callStreamingStopped)
                value.campaignStatusUpdate != null ->
                    generator.writeObject(value.campaignStatusUpdate)
                value.conferenceCreated != null -> generator.writeObject(value.conferenceCreated)
                value.conferenceEnded != null -> generator.writeObject(value.conferenceEnded)
                value.conferenceFloorChanged != null ->
                    generator.writeObject(value.conferenceFloorChanged)
                value.conferenceParticipantJoined != null ->
                    generator.writeObject(value.conferenceParticipantJoined)
                value.conferenceParticipantLeft != null ->
                    generator.writeObject(value.conferenceParticipantLeft)
                value.conferenceParticipantPlaybackEnded != null ->
                    generator.writeObject(value.conferenceParticipantPlaybackEnded)
                value.conferenceParticipantPlaybackStarted != null ->
                    generator.writeObject(value.conferenceParticipantPlaybackStarted)
                value.conferenceParticipantSpeakEnded != null ->
                    generator.writeObject(value.conferenceParticipantSpeakEnded)
                value.conferenceParticipantSpeakStarted != null ->
                    generator.writeObject(value.conferenceParticipantSpeakStarted)
                value.conferencePlaybackEnded != null ->
                    generator.writeObject(value.conferencePlaybackEnded)
                value.conferencePlaybackStarted != null ->
                    generator.writeObject(value.conferencePlaybackStarted)
                value.conferenceRecordingSaved != null ->
                    generator.writeObject(value.conferenceRecordingSaved)
                value.conferenceSpeakEnded != null ->
                    generator.writeObject(value.conferenceSpeakEnded)
                value.conferenceSpeakStarted != null ->
                    generator.writeObject(value.conferenceSpeakStarted)
                value.deliveryUpdate != null -> generator.writeObject(value.deliveryUpdate)
                value.faxDelivered != null -> generator.writeObject(value.faxDelivered)
                value.faxFailed != null -> generator.writeObject(value.faxFailed)
                value.faxMediaProcessed != null -> generator.writeObject(value.faxMediaProcessed)
                value.faxQueued != null -> generator.writeObject(value.faxQueued)
                value.faxSendingStarted != null -> generator.writeObject(value.faxSendingStarted)
                value.inboundMessage != null -> generator.writeObject(value.inboundMessage)
                value.numberOrderStatusUpdate != null ->
                    generator.writeObject(value.numberOrderStatusUpdate)
                value.replacedLinkClick != null -> generator.writeObject(value.replacedLinkClick)
                value.transcription != null -> generator.writeObject(value.transcription)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid UnwrapWebhookEvent")
            }
        }
    }
}
