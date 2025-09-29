// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.BaseDeserializer
import com.telnyx.api.core.BaseSerializer
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.allMaxBy
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.getOrThrow
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.calls.actions.TranscriptionStartRequest
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Dial a number or SIP URI from a given connection. A successful response will include a
 * `call_leg_id` which can be used to correlate the command with subsequent webhooks.
 *
 * **Expected Webhooks:**
 * - `call.initiated`
 * - `call.answered` or `call.hangup`
 * - `call.machine.detection.ended` if `answering_machine_detection` was requested
 * - `call.machine.greeting.ended` if `answering_machine_detection` was requested to detect the end
 *   of machine greeting
 * - `call.machine.premium.detection.ended` if `answering_machine_detection=premium` was requested
 * - `call.machine.premium.greeting.ended` if `answering_machine_detection=premium` was requested
 *   and a beep was detected
 * - `streaming.started`, `streaming.stopped` or `streaming.failed` if `stream_url` was set
 *
 * When the `record` parameter is set to `record-from-answer`, the response will include a
 * `recording_id` field.
 */
class CallDialParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The ID of the Call Control App (formerly ID of the connection) to be used when dialing the
     * destination.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectionId(): String = body.connectionId()

    /**
     * The `from` number to be used as the caller id presented to the destination (`to` number). The
     * number should be in +E164 format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): String = body.from()

    /**
     * The DID or SIP URI to dial out to. Multiple DID or SIP URIs can be provided using an array of
     * strings
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): To = body.to()

    /**
     * Enables Answering Machine Detection. Telnyx offers Premium and Standard detections. With
     * Premium detection, when a call is answered, Telnyx runs real-time detection and sends a
     * `call.machine.premium.detection.ended` webhook with one of the following results:
     * `human_residence`, `human_business`, `machine`, `silence` or `fax_detected`. If we detect a
     * beep, we also send a `call.machine.premium.greeting.ended` webhook with the result of
     * `beep_detected`. If we detect a beep before `call.machine.premium.detection.ended` we only
     * send `call.machine.premium.greeting.ended`, and if we detect a beep after
     * `call.machine.premium.detection.ended`, we send both webhooks. With Standard detection, when
     * a call is answered, Telnyx runs real-time detection to determine if it was picked up by a
     * human or a machine and sends an `call.machine.detection.ended` webhook with the analysis
     * result. If `greeting_end` or `detect_words` is used and a `machine` is detected, you will
     * receive another `call.machine.greeting.ended` webhook when the answering machine greeting
     * ends with a beep or silence. If `detect_beep` is used, you will only receive
     * `call.machine.greeting.ended` if a beep is detected.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun answeringMachineDetection(): Optional<AnsweringMachineDetection> =
        body.answeringMachineDetection()

    /**
     * Optional configuration parameters to modify 'answering_machine_detection' performance.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun answeringMachineDetectionConfig(): Optional<AnsweringMachineDetectionConfig> =
        body.answeringMachineDetectionConfig()

    /**
     * The URL of a file to be played back to the callee when the call is answered. The URL can
     * point to either a WAV or MP3 file. media_name and audio_url cannot be used together in one
     * request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioUrl(): Optional<String> = body.audioUrl()

    /**
     * Use this field to set the Billing Group ID for the call. Must be a valid and existing Billing
     * Group ID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingGroupId(): Optional<String> = body.billingGroupId()

    /**
     * Indicates the intent to bridge this call with the call specified in link_to. When
     * bridge_intent is true, link_to becomes required and the from number will be overwritten by
     * the from number from the linked call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bridgeIntent(): Optional<Boolean> = body.bridgeIntent()

    /**
     * Whether to automatically bridge answered call to the call specified in link_to. When
     * bridge_on_answer is true, link_to becomes required.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bridgeOnAnswer(): Optional<Boolean> = body.bridgeOnAnswer()

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded
     * string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = body.clientState()

    /**
     * Use this field to avoid duplicate commands. Telnyx will ignore others Dial commands with the
     * same `command_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commandId(): Optional<String> = body.commandId()

    /**
     * Optional configuration parameters to dial new participant into a conference.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conferenceConfig(): Optional<ConferenceConfig> = body.conferenceConfig()

    /**
     * Custom headers to be added to the SIP INVITE.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customHeaders(): Optional<List<CustomSipHeader>> = body.customHeaders()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dialogflowConfig(): Optional<DialogflowConfig> = body.dialogflowConfig()

    /**
     * Enables Dialogflow for the current call. The default value is false.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableDialogflow(): Optional<Boolean> = body.enableDialogflow()

    /**
     * The `from_display_name` string to be used as the caller id name (SIP From Display Name)
     * presented to the destination (`to` number). The string should have a maximum of 128
     * characters, containing only letters, numbers, spaces, and -_~!.+ special characters. If
     * ommited, the display name will be the same as the number in the `from` field.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fromDisplayName(): Optional<String> = body.fromDisplayName()

    /**
     * Use another call's control id for sharing the same call session id
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun linkTo(): Optional<String> = body.linkTo()

    /**
     * Defines whether media should be encrypted on the call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaEncryption(): Optional<MediaEncryption> = body.mediaEncryption()

    /**
     * The media_name of a file to be played back to the callee when the call is answered. The
     * media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same
     * user/organization. The file must either be a WAV or MP3 file.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaName(): Optional<String> = body.mediaName()

    /**
     * If supplied with the value `self`, the current leg will be parked after unbridge. If not set,
     * the default behavior is to hang up the leg. When park_after_unbridge is set, link_to becomes
     * required.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parkAfterUnbridge(): Optional<String> = body.parkAfterUnbridge()

    /**
     * The list of comma-separated codecs in a preferred order for the forked media to be received.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferredCodecs(): Optional<String> = body.preferredCodecs()

    /**
     * Start recording automatically after an event. Disabled by default.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun record(): Optional<Record> = body.record()

    /**
     * Defines which channel should be recorded ('single' or 'dual') when `record` is specified.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordChannels(): Optional<RecordChannels> = body.recordChannels()

    /**
     * The custom recording file name to be used instead of the default `call_leg_id`. Telnyx will
     * still add a Unix timestamp suffix.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordCustomFileName(): Optional<String> = body.recordCustomFileName()

    /**
     * Defines the format of the recording ('wav' or 'mp3') when `record` is specified.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordFormat(): Optional<RecordFormat> = body.recordFormat()

    /**
     * Defines the maximum length for the recording in seconds when `record` is specified. The
     * minimum value is 0. The maximum value is 43200. The default value is 0 (infinite).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordMaxLength(): Optional<Int> = body.recordMaxLength()

    /**
     * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
     * detected when `record` is specified. The timer only starts when the speech is detected.
     * Please note that call transcription is used to detect silence and the related charge will be
     * applied. The minimum value is 0. The default value is 0 (infinite).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordTimeoutSecs(): Optional<Int> = body.recordTimeoutSecs()

    /**
     * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If only single
     * track is specified (`inbound`, `outbound`), `channels` configuration is ignored and it will
     * be recorded as mono (single channel).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordTrack(): Optional<RecordTrack> = body.recordTrack()

    /**
     * When set to `trim-silence`, silence will be removed from the beginning and end of the
     * recording.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordTrim(): Optional<RecordTrim> = body.recordTrim()

    /**
     * Generate silence RTP packets when no transmission available.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendSilenceWhenIdle(): Optional<Boolean> = body.sendSilenceWhenIdle()

    /**
     * SIP Authentication password used for SIP challenges.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipAuthPassword(): Optional<String> = body.sipAuthPassword()

    /**
     * SIP Authentication username used for SIP challenges.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipAuthUsername(): Optional<String> = body.sipAuthUsername()

    /**
     * SIP headers to be added to the SIP INVITE request. Currently only User-to-User header is
     * supported.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipHeaders(): Optional<List<SipHeader>> = body.sipHeaders()

    /**
     * Defines SIP transport protocol to be used on the call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipTransportProtocol(): Optional<SipTransportProtocol> = body.sipTransportProtocol()

    /**
     * Use this field to modify sound effects, for example adjust the pitch.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun soundModifications(): Optional<SoundModifications> = body.soundModifications()

    /**
     * Indicates codec for bidirectional streaming RTP payloads. Used only with
     * stream_bidirectional_mode=rtp. Case sensitive.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamBidirectionalCodec(): Optional<StreamBidirectionalCodec> =
        body.streamBidirectionalCodec()

    /**
     * Configures method of bidirectional streaming (mp3, rtp).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamBidirectionalMode(): Optional<StreamBidirectionalMode> =
        body.streamBidirectionalMode()

    /**
     * Audio sampling rate.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamBidirectionalSamplingRate(): Optional<StreamBidirectionalSamplingRate> =
        body.streamBidirectionalSamplingRate()

    /**
     * Specifies which call legs should receive the bidirectional stream audio.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamBidirectionalTargetLegs(): Optional<StreamBidirectionalTargetLegs> =
        body.streamBidirectionalTargetLegs()

    /**
     * Specifies the codec to be used for the streamed audio. When set to 'default' or when
     * transcoding is not possible, the codec from the call will be used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamCodec(): Optional<StreamCodec> = body.streamCodec()

    /**
     * Establish websocket connection before dialing the destination. This is useful for cases where
     * the websocket connection takes a long time to establish.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamEstablishBeforeCallOriginate(): Optional<Boolean> =
        body.streamEstablishBeforeCallOriginate()

    /**
     * Specifies which track should be streamed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamTrack(): Optional<StreamTrack> = body.streamTrack()

    /**
     * The destination WebSocket address where the stream is going to be delivered.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamUrl(): Optional<String> = body.streamUrl()

    /**
     * The call leg which will be supervised by the new call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun superviseCallControlId(): Optional<String> = body.superviseCallControlId()

    /**
     * The role of the supervisor call. 'barge' means that supervisor call hears and is being heard
     * by both ends of the call (caller & callee). 'whisper' means that only
     * supervised_call_control_id hears supervisor but supervisor can hear everything. 'monitor'
     * means that nobody can hear supervisor call, but supervisor can hear everything on the call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supervisorRole(): Optional<SupervisorRole> = body.supervisorRole()

    /**
     * Sets the maximum duration of a Call Control Leg in seconds. If the time limit is reached, the
     * call will hangup and a `call.hangup` webhook with a `hangup_cause` of `time_limit` will be
     * sent. For example, by setting a time limit of 120 seconds, a Call Leg will be automatically
     * terminated two minutes after being answered. The default time limit is 14400 seconds or 4
     * hours and this is also the maximum allowed call length.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeLimitSecs(): Optional<Int> = body.timeLimitSecs()

    /**
     * The number of seconds that Telnyx will wait for the call to be answered by the destination to
     * which it is being called. If the timeout is reached before an answer is received, the call
     * will hangup and a `call.hangup` webhook with a `hangup_cause` of `timeout` will be sent.
     * Minimum value is 5 seconds. Maximum value is 600 seconds.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutSecs(): Optional<Int> = body.timeoutSecs()

    /**
     * Enable transcription upon call answer. The default value is false.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcription(): Optional<Boolean> = body.transcription()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionConfig(): Optional<TranscriptionStartRequest> = body.transcriptionConfig()

    /**
     * Use this field to override the URL for which Telnyx will send subsequent webhooks to for this
     * call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * HTTP request type used for `webhook_url`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrlMethod(): Optional<WebhookUrlMethod> = body.webhookUrlMethod()

    /**
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _connectionId(): JsonField<String> = body._connectionId()

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _from(): JsonField<String> = body._from()

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _to(): JsonField<To> = body._to()

    /**
     * Returns the raw JSON value of [answeringMachineDetection].
     *
     * Unlike [answeringMachineDetection], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _answeringMachineDetection(): JsonField<AnsweringMachineDetection> =
        body._answeringMachineDetection()

    /**
     * Returns the raw JSON value of [answeringMachineDetectionConfig].
     *
     * Unlike [answeringMachineDetectionConfig], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _answeringMachineDetectionConfig(): JsonField<AnsweringMachineDetectionConfig> =
        body._answeringMachineDetectionConfig()

    /**
     * Returns the raw JSON value of [audioUrl].
     *
     * Unlike [audioUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _audioUrl(): JsonField<String> = body._audioUrl()

    /**
     * Returns the raw JSON value of [billingGroupId].
     *
     * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingGroupId(): JsonField<String> = body._billingGroupId()

    /**
     * Returns the raw JSON value of [bridgeIntent].
     *
     * Unlike [bridgeIntent], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bridgeIntent(): JsonField<Boolean> = body._bridgeIntent()

    /**
     * Returns the raw JSON value of [bridgeOnAnswer].
     *
     * Unlike [bridgeOnAnswer], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bridgeOnAnswer(): JsonField<Boolean> = body._bridgeOnAnswer()

    /**
     * Returns the raw JSON value of [clientState].
     *
     * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientState(): JsonField<String> = body._clientState()

    /**
     * Returns the raw JSON value of [commandId].
     *
     * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commandId(): JsonField<String> = body._commandId()

    /**
     * Returns the raw JSON value of [conferenceConfig].
     *
     * Unlike [conferenceConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _conferenceConfig(): JsonField<ConferenceConfig> = body._conferenceConfig()

    /**
     * Returns the raw JSON value of [customHeaders].
     *
     * Unlike [customHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customHeaders(): JsonField<List<CustomSipHeader>> = body._customHeaders()

    /**
     * Returns the raw JSON value of [dialogflowConfig].
     *
     * Unlike [dialogflowConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _dialogflowConfig(): JsonField<DialogflowConfig> = body._dialogflowConfig()

    /**
     * Returns the raw JSON value of [enableDialogflow].
     *
     * Unlike [enableDialogflow], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _enableDialogflow(): JsonField<Boolean> = body._enableDialogflow()

    /**
     * Returns the raw JSON value of [fromDisplayName].
     *
     * Unlike [fromDisplayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fromDisplayName(): JsonField<String> = body._fromDisplayName()

    /**
     * Returns the raw JSON value of [linkTo].
     *
     * Unlike [linkTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _linkTo(): JsonField<String> = body._linkTo()

    /**
     * Returns the raw JSON value of [mediaEncryption].
     *
     * Unlike [mediaEncryption], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mediaEncryption(): JsonField<MediaEncryption> = body._mediaEncryption()

    /**
     * Returns the raw JSON value of [mediaName].
     *
     * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mediaName(): JsonField<String> = body._mediaName()

    /**
     * Returns the raw JSON value of [parkAfterUnbridge].
     *
     * Unlike [parkAfterUnbridge], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _parkAfterUnbridge(): JsonField<String> = body._parkAfterUnbridge()

    /**
     * Returns the raw JSON value of [preferredCodecs].
     *
     * Unlike [preferredCodecs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _preferredCodecs(): JsonField<String> = body._preferredCodecs()

    /**
     * Returns the raw JSON value of [record].
     *
     * Unlike [record], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _record(): JsonField<Record> = body._record()

    /**
     * Returns the raw JSON value of [recordChannels].
     *
     * Unlike [recordChannels], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordChannels(): JsonField<RecordChannels> = body._recordChannels()

    /**
     * Returns the raw JSON value of [recordCustomFileName].
     *
     * Unlike [recordCustomFileName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _recordCustomFileName(): JsonField<String> = body._recordCustomFileName()

    /**
     * Returns the raw JSON value of [recordFormat].
     *
     * Unlike [recordFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordFormat(): JsonField<RecordFormat> = body._recordFormat()

    /**
     * Returns the raw JSON value of [recordMaxLength].
     *
     * Unlike [recordMaxLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordMaxLength(): JsonField<Int> = body._recordMaxLength()

    /**
     * Returns the raw JSON value of [recordTimeoutSecs].
     *
     * Unlike [recordTimeoutSecs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _recordTimeoutSecs(): JsonField<Int> = body._recordTimeoutSecs()

    /**
     * Returns the raw JSON value of [recordTrack].
     *
     * Unlike [recordTrack], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordTrack(): JsonField<RecordTrack> = body._recordTrack()

    /**
     * Returns the raw JSON value of [recordTrim].
     *
     * Unlike [recordTrim], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordTrim(): JsonField<RecordTrim> = body._recordTrim()

    /**
     * Returns the raw JSON value of [sendSilenceWhenIdle].
     *
     * Unlike [sendSilenceWhenIdle], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sendSilenceWhenIdle(): JsonField<Boolean> = body._sendSilenceWhenIdle()

    /**
     * Returns the raw JSON value of [sipAuthPassword].
     *
     * Unlike [sipAuthPassword], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sipAuthPassword(): JsonField<String> = body._sipAuthPassword()

    /**
     * Returns the raw JSON value of [sipAuthUsername].
     *
     * Unlike [sipAuthUsername], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sipAuthUsername(): JsonField<String> = body._sipAuthUsername()

    /**
     * Returns the raw JSON value of [sipHeaders].
     *
     * Unlike [sipHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sipHeaders(): JsonField<List<SipHeader>> = body._sipHeaders()

    /**
     * Returns the raw JSON value of [sipTransportProtocol].
     *
     * Unlike [sipTransportProtocol], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sipTransportProtocol(): JsonField<SipTransportProtocol> = body._sipTransportProtocol()

    /**
     * Returns the raw JSON value of [soundModifications].
     *
     * Unlike [soundModifications], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _soundModifications(): JsonField<SoundModifications> = body._soundModifications()

    /**
     * Returns the raw JSON value of [streamBidirectionalCodec].
     *
     * Unlike [streamBidirectionalCodec], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _streamBidirectionalCodec(): JsonField<StreamBidirectionalCodec> =
        body._streamBidirectionalCodec()

    /**
     * Returns the raw JSON value of [streamBidirectionalMode].
     *
     * Unlike [streamBidirectionalMode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _streamBidirectionalMode(): JsonField<StreamBidirectionalMode> =
        body._streamBidirectionalMode()

    /**
     * Returns the raw JSON value of [streamBidirectionalSamplingRate].
     *
     * Unlike [streamBidirectionalSamplingRate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _streamBidirectionalSamplingRate(): JsonField<StreamBidirectionalSamplingRate> =
        body._streamBidirectionalSamplingRate()

    /**
     * Returns the raw JSON value of [streamBidirectionalTargetLegs].
     *
     * Unlike [streamBidirectionalTargetLegs], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _streamBidirectionalTargetLegs(): JsonField<StreamBidirectionalTargetLegs> =
        body._streamBidirectionalTargetLegs()

    /**
     * Returns the raw JSON value of [streamCodec].
     *
     * Unlike [streamCodec], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _streamCodec(): JsonField<StreamCodec> = body._streamCodec()

    /**
     * Returns the raw JSON value of [streamEstablishBeforeCallOriginate].
     *
     * Unlike [streamEstablishBeforeCallOriginate], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _streamEstablishBeforeCallOriginate(): JsonField<Boolean> =
        body._streamEstablishBeforeCallOriginate()

    /**
     * Returns the raw JSON value of [streamTrack].
     *
     * Unlike [streamTrack], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _streamTrack(): JsonField<StreamTrack> = body._streamTrack()

    /**
     * Returns the raw JSON value of [streamUrl].
     *
     * Unlike [streamUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _streamUrl(): JsonField<String> = body._streamUrl()

    /**
     * Returns the raw JSON value of [superviseCallControlId].
     *
     * Unlike [superviseCallControlId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _superviseCallControlId(): JsonField<String> = body._superviseCallControlId()

    /**
     * Returns the raw JSON value of [supervisorRole].
     *
     * Unlike [supervisorRole], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _supervisorRole(): JsonField<SupervisorRole> = body._supervisorRole()

    /**
     * Returns the raw JSON value of [timeLimitSecs].
     *
     * Unlike [timeLimitSecs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeLimitSecs(): JsonField<Int> = body._timeLimitSecs()

    /**
     * Returns the raw JSON value of [timeoutSecs].
     *
     * Unlike [timeoutSecs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeoutSecs(): JsonField<Int> = body._timeoutSecs()

    /**
     * Returns the raw JSON value of [transcription].
     *
     * Unlike [transcription], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transcription(): JsonField<Boolean> = body._transcription()

    /**
     * Returns the raw JSON value of [transcriptionConfig].
     *
     * Unlike [transcriptionConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _transcriptionConfig(): JsonField<TranscriptionStartRequest> = body._transcriptionConfig()

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookUrl(): JsonField<String> = body._webhookUrl()

    /**
     * Returns the raw JSON value of [webhookUrlMethod].
     *
     * Unlike [webhookUrlMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _webhookUrlMethod(): JsonField<WebhookUrlMethod> = body._webhookUrlMethod()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CallDialParams].
         *
         * The following fields are required:
         * ```java
         * .connectionId()
         * .from()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallDialParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(callDialParams: CallDialParams) = apply {
            body = callDialParams.body.toBuilder()
            additionalHeaders = callDialParams.additionalHeaders.toBuilder()
            additionalQueryParams = callDialParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [connectionId]
         * - [from]
         * - [to]
         * - [answeringMachineDetection]
         * - [answeringMachineDetectionConfig]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The ID of the Call Control App (formerly ID of the connection) to be used when dialing
         * the destination.
         */
        fun connectionId(connectionId: String) = apply { body.connectionId(connectionId) }

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            body.connectionId(connectionId)
        }

        /**
         * The `from` number to be used as the caller id presented to the destination (`to` number).
         * The number should be in +E164 format.
         */
        fun from(from: String) = apply { body.from(from) }

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { body.from(from) }

        /**
         * The DID or SIP URI to dial out to. Multiple DID or SIP URIs can be provided using an
         * array of strings
         */
        fun to(to: To) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [To] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<To>) = apply { body.to(to) }

        /** Alias for calling [to] with `To.ofString(string)`. */
        fun to(string: String) = apply { body.to(string) }

        /** Alias for calling [to] with `To.ofStrings(strings)`. */
        fun toOfStrings(strings: List<String>) = apply { body.toOfStrings(strings) }

        /**
         * Enables Answering Machine Detection. Telnyx offers Premium and Standard detections. With
         * Premium detection, when a call is answered, Telnyx runs real-time detection and sends a
         * `call.machine.premium.detection.ended` webhook with one of the following results:
         * `human_residence`, `human_business`, `machine`, `silence` or `fax_detected`. If we detect
         * a beep, we also send a `call.machine.premium.greeting.ended` webhook with the result of
         * `beep_detected`. If we detect a beep before `call.machine.premium.detection.ended` we
         * only send `call.machine.premium.greeting.ended`, and if we detect a beep after
         * `call.machine.premium.detection.ended`, we send both webhooks. With Standard detection,
         * when a call is answered, Telnyx runs real-time detection to determine if it was picked up
         * by a human or a machine and sends an `call.machine.detection.ended` webhook with the
         * analysis result. If `greeting_end` or `detect_words` is used and a `machine` is detected,
         * you will receive another `call.machine.greeting.ended` webhook when the answering machine
         * greeting ends with a beep or silence. If `detect_beep` is used, you will only receive
         * `call.machine.greeting.ended` if a beep is detected.
         */
        fun answeringMachineDetection(answeringMachineDetection: AnsweringMachineDetection) =
            apply {
                body.answeringMachineDetection(answeringMachineDetection)
            }

        /**
         * Sets [Builder.answeringMachineDetection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.answeringMachineDetection] with a well-typed
         * [AnsweringMachineDetection] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun answeringMachineDetection(
            answeringMachineDetection: JsonField<AnsweringMachineDetection>
        ) = apply { body.answeringMachineDetection(answeringMachineDetection) }

        /**
         * Optional configuration parameters to modify 'answering_machine_detection' performance.
         */
        fun answeringMachineDetectionConfig(
            answeringMachineDetectionConfig: AnsweringMachineDetectionConfig
        ) = apply { body.answeringMachineDetectionConfig(answeringMachineDetectionConfig) }

        /**
         * Sets [Builder.answeringMachineDetectionConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.answeringMachineDetectionConfig] with a well-typed
         * [AnsweringMachineDetectionConfig] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun answeringMachineDetectionConfig(
            answeringMachineDetectionConfig: JsonField<AnsweringMachineDetectionConfig>
        ) = apply { body.answeringMachineDetectionConfig(answeringMachineDetectionConfig) }

        /**
         * The URL of a file to be played back to the callee when the call is answered. The URL can
         * point to either a WAV or MP3 file. media_name and audio_url cannot be used together in
         * one request.
         */
        fun audioUrl(audioUrl: String) = apply { body.audioUrl(audioUrl) }

        /**
         * Sets [Builder.audioUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun audioUrl(audioUrl: JsonField<String>) = apply { body.audioUrl(audioUrl) }

        /**
         * Use this field to set the Billing Group ID for the call. Must be a valid and existing
         * Billing Group ID.
         */
        fun billingGroupId(billingGroupId: String) = apply { body.billingGroupId(billingGroupId) }

        /**
         * Sets [Builder.billingGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingGroupId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingGroupId(billingGroupId: JsonField<String>) = apply {
            body.billingGroupId(billingGroupId)
        }

        /**
         * Indicates the intent to bridge this call with the call specified in link_to. When
         * bridge_intent is true, link_to becomes required and the from number will be overwritten
         * by the from number from the linked call.
         */
        fun bridgeIntent(bridgeIntent: Boolean) = apply { body.bridgeIntent(bridgeIntent) }

        /**
         * Sets [Builder.bridgeIntent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bridgeIntent] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bridgeIntent(bridgeIntent: JsonField<Boolean>) = apply {
            body.bridgeIntent(bridgeIntent)
        }

        /**
         * Whether to automatically bridge answered call to the call specified in link_to. When
         * bridge_on_answer is true, link_to becomes required.
         */
        fun bridgeOnAnswer(bridgeOnAnswer: Boolean) = apply { body.bridgeOnAnswer(bridgeOnAnswer) }

        /**
         * Sets [Builder.bridgeOnAnswer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bridgeOnAnswer] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bridgeOnAnswer(bridgeOnAnswer: JsonField<Boolean>) = apply {
            body.bridgeOnAnswer(bridgeOnAnswer)
        }

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         */
        fun clientState(clientState: String) = apply { body.clientState(clientState) }

        /**
         * Sets [Builder.clientState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientState(clientState: JsonField<String>) = apply { body.clientState(clientState) }

        /**
         * Use this field to avoid duplicate commands. Telnyx will ignore others Dial commands with
         * the same `command_id`.
         */
        fun commandId(commandId: String) = apply { body.commandId(commandId) }

        /**
         * Sets [Builder.commandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commandId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commandId(commandId: JsonField<String>) = apply { body.commandId(commandId) }

        /** Optional configuration parameters to dial new participant into a conference. */
        fun conferenceConfig(conferenceConfig: ConferenceConfig) = apply {
            body.conferenceConfig(conferenceConfig)
        }

        /**
         * Sets [Builder.conferenceConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conferenceConfig] with a well-typed [ConferenceConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun conferenceConfig(conferenceConfig: JsonField<ConferenceConfig>) = apply {
            body.conferenceConfig(conferenceConfig)
        }

        /** Custom headers to be added to the SIP INVITE. */
        fun customHeaders(customHeaders: List<CustomSipHeader>) = apply {
            body.customHeaders(customHeaders)
        }

        /**
         * Sets [Builder.customHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customHeaders] with a well-typed `List<CustomSipHeader>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customHeaders(customHeaders: JsonField<List<CustomSipHeader>>) = apply {
            body.customHeaders(customHeaders)
        }

        /**
         * Adds a single [CustomSipHeader] to [customHeaders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomHeader(customHeader: CustomSipHeader) = apply {
            body.addCustomHeader(customHeader)
        }

        fun dialogflowConfig(dialogflowConfig: DialogflowConfig) = apply {
            body.dialogflowConfig(dialogflowConfig)
        }

        /**
         * Sets [Builder.dialogflowConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dialogflowConfig] with a well-typed [DialogflowConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dialogflowConfig(dialogflowConfig: JsonField<DialogflowConfig>) = apply {
            body.dialogflowConfig(dialogflowConfig)
        }

        /** Enables Dialogflow for the current call. The default value is false. */
        fun enableDialogflow(enableDialogflow: Boolean) = apply {
            body.enableDialogflow(enableDialogflow)
        }

        /**
         * Sets [Builder.enableDialogflow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableDialogflow] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableDialogflow(enableDialogflow: JsonField<Boolean>) = apply {
            body.enableDialogflow(enableDialogflow)
        }

        /**
         * The `from_display_name` string to be used as the caller id name (SIP From Display Name)
         * presented to the destination (`to` number). The string should have a maximum of 128
         * characters, containing only letters, numbers, spaces, and -_~!.+ special characters. If
         * ommited, the display name will be the same as the number in the `from` field.
         */
        fun fromDisplayName(fromDisplayName: String) = apply {
            body.fromDisplayName(fromDisplayName)
        }

        /**
         * Sets [Builder.fromDisplayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromDisplayName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fromDisplayName(fromDisplayName: JsonField<String>) = apply {
            body.fromDisplayName(fromDisplayName)
        }

        /** Use another call's control id for sharing the same call session id */
        fun linkTo(linkTo: String) = apply { body.linkTo(linkTo) }

        /**
         * Sets [Builder.linkTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkTo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun linkTo(linkTo: JsonField<String>) = apply { body.linkTo(linkTo) }

        /** Defines whether media should be encrypted on the call. */
        fun mediaEncryption(mediaEncryption: MediaEncryption) = apply {
            body.mediaEncryption(mediaEncryption)
        }

        /**
         * Sets [Builder.mediaEncryption] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaEncryption] with a well-typed [MediaEncryption]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun mediaEncryption(mediaEncryption: JsonField<MediaEncryption>) = apply {
            body.mediaEncryption(mediaEncryption)
        }

        /**
         * The media_name of a file to be played back to the callee when the call is answered. The
         * media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the
         * same user/organization. The file must either be a WAV or MP3 file.
         */
        fun mediaName(mediaName: String) = apply { body.mediaName(mediaName) }

        /**
         * Sets [Builder.mediaName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaName(mediaName: JsonField<String>) = apply { body.mediaName(mediaName) }

        /**
         * If supplied with the value `self`, the current leg will be parked after unbridge. If not
         * set, the default behavior is to hang up the leg. When park_after_unbridge is set, link_to
         * becomes required.
         */
        fun parkAfterUnbridge(parkAfterUnbridge: String) = apply {
            body.parkAfterUnbridge(parkAfterUnbridge)
        }

        /**
         * Sets [Builder.parkAfterUnbridge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parkAfterUnbridge] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parkAfterUnbridge(parkAfterUnbridge: JsonField<String>) = apply {
            body.parkAfterUnbridge(parkAfterUnbridge)
        }

        /**
         * The list of comma-separated codecs in a preferred order for the forked media to be
         * received.
         */
        fun preferredCodecs(preferredCodecs: String) = apply {
            body.preferredCodecs(preferredCodecs)
        }

        /**
         * Sets [Builder.preferredCodecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferredCodecs] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preferredCodecs(preferredCodecs: JsonField<String>) = apply {
            body.preferredCodecs(preferredCodecs)
        }

        /** Start recording automatically after an event. Disabled by default. */
        fun record(record: Record) = apply { body.record(record) }

        /**
         * Sets [Builder.record] to an arbitrary JSON value.
         *
         * You should usually call [Builder.record] with a well-typed [Record] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun record(record: JsonField<Record>) = apply { body.record(record) }

        /**
         * Defines which channel should be recorded ('single' or 'dual') when `record` is specified.
         */
        fun recordChannels(recordChannels: RecordChannels) = apply {
            body.recordChannels(recordChannels)
        }

        /**
         * Sets [Builder.recordChannels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordChannels] with a well-typed [RecordChannels] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordChannels(recordChannels: JsonField<RecordChannels>) = apply {
            body.recordChannels(recordChannels)
        }

        /**
         * The custom recording file name to be used instead of the default `call_leg_id`. Telnyx
         * will still add a Unix timestamp suffix.
         */
        fun recordCustomFileName(recordCustomFileName: String) = apply {
            body.recordCustomFileName(recordCustomFileName)
        }

        /**
         * Sets [Builder.recordCustomFileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordCustomFileName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordCustomFileName(recordCustomFileName: JsonField<String>) = apply {
            body.recordCustomFileName(recordCustomFileName)
        }

        /** Defines the format of the recording ('wav' or 'mp3') when `record` is specified. */
        fun recordFormat(recordFormat: RecordFormat) = apply { body.recordFormat(recordFormat) }

        /**
         * Sets [Builder.recordFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordFormat] with a well-typed [RecordFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordFormat(recordFormat: JsonField<RecordFormat>) = apply {
            body.recordFormat(recordFormat)
        }

        /**
         * Defines the maximum length for the recording in seconds when `record` is specified. The
         * minimum value is 0. The maximum value is 43200. The default value is 0 (infinite).
         */
        fun recordMaxLength(recordMaxLength: Int) = apply { body.recordMaxLength(recordMaxLength) }

        /**
         * Sets [Builder.recordMaxLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordMaxLength] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordMaxLength(recordMaxLength: JsonField<Int>) = apply {
            body.recordMaxLength(recordMaxLength)
        }

        /**
         * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
         * detected when `record` is specified. The timer only starts when the speech is detected.
         * Please note that call transcription is used to detect silence and the related charge will
         * be applied. The minimum value is 0. The default value is 0 (infinite).
         */
        fun recordTimeoutSecs(recordTimeoutSecs: Int) = apply {
            body.recordTimeoutSecs(recordTimeoutSecs)
        }

        /**
         * Sets [Builder.recordTimeoutSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordTimeoutSecs] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordTimeoutSecs(recordTimeoutSecs: JsonField<Int>) = apply {
            body.recordTimeoutSecs(recordTimeoutSecs)
        }

        /**
         * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If only
         * single track is specified (`inbound`, `outbound`), `channels` configuration is ignored
         * and it will be recorded as mono (single channel).
         */
        fun recordTrack(recordTrack: RecordTrack) = apply { body.recordTrack(recordTrack) }

        /**
         * Sets [Builder.recordTrack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordTrack] with a well-typed [RecordTrack] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordTrack(recordTrack: JsonField<RecordTrack>) = apply {
            body.recordTrack(recordTrack)
        }

        /**
         * When set to `trim-silence`, silence will be removed from the beginning and end of the
         * recording.
         */
        fun recordTrim(recordTrim: RecordTrim) = apply { body.recordTrim(recordTrim) }

        /**
         * Sets [Builder.recordTrim] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordTrim] with a well-typed [RecordTrim] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordTrim(recordTrim: JsonField<RecordTrim>) = apply { body.recordTrim(recordTrim) }

        /** Generate silence RTP packets when no transmission available. */
        fun sendSilenceWhenIdle(sendSilenceWhenIdle: Boolean) = apply {
            body.sendSilenceWhenIdle(sendSilenceWhenIdle)
        }

        /**
         * Sets [Builder.sendSilenceWhenIdle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendSilenceWhenIdle] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendSilenceWhenIdle(sendSilenceWhenIdle: JsonField<Boolean>) = apply {
            body.sendSilenceWhenIdle(sendSilenceWhenIdle)
        }

        /** SIP Authentication password used for SIP challenges. */
        fun sipAuthPassword(sipAuthPassword: String) = apply {
            body.sipAuthPassword(sipAuthPassword)
        }

        /**
         * Sets [Builder.sipAuthPassword] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipAuthPassword] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sipAuthPassword(sipAuthPassword: JsonField<String>) = apply {
            body.sipAuthPassword(sipAuthPassword)
        }

        /** SIP Authentication username used for SIP challenges. */
        fun sipAuthUsername(sipAuthUsername: String) = apply {
            body.sipAuthUsername(sipAuthUsername)
        }

        /**
         * Sets [Builder.sipAuthUsername] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipAuthUsername] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sipAuthUsername(sipAuthUsername: JsonField<String>) = apply {
            body.sipAuthUsername(sipAuthUsername)
        }

        /**
         * SIP headers to be added to the SIP INVITE request. Currently only User-to-User header is
         * supported.
         */
        fun sipHeaders(sipHeaders: List<SipHeader>) = apply { body.sipHeaders(sipHeaders) }

        /**
         * Sets [Builder.sipHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipHeaders] with a well-typed `List<SipHeader>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sipHeaders(sipHeaders: JsonField<List<SipHeader>>) = apply {
            body.sipHeaders(sipHeaders)
        }

        /**
         * Adds a single [SipHeader] to [sipHeaders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSipHeader(sipHeader: SipHeader) = apply { body.addSipHeader(sipHeader) }

        /** Defines SIP transport protocol to be used on the call. */
        fun sipTransportProtocol(sipTransportProtocol: SipTransportProtocol) = apply {
            body.sipTransportProtocol(sipTransportProtocol)
        }

        /**
         * Sets [Builder.sipTransportProtocol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipTransportProtocol] with a well-typed
         * [SipTransportProtocol] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun sipTransportProtocol(sipTransportProtocol: JsonField<SipTransportProtocol>) = apply {
            body.sipTransportProtocol(sipTransportProtocol)
        }

        /** Use this field to modify sound effects, for example adjust the pitch. */
        fun soundModifications(soundModifications: SoundModifications) = apply {
            body.soundModifications(soundModifications)
        }

        /**
         * Sets [Builder.soundModifications] to an arbitrary JSON value.
         *
         * You should usually call [Builder.soundModifications] with a well-typed
         * [SoundModifications] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun soundModifications(soundModifications: JsonField<SoundModifications>) = apply {
            body.soundModifications(soundModifications)
        }

        /**
         * Indicates codec for bidirectional streaming RTP payloads. Used only with
         * stream_bidirectional_mode=rtp. Case sensitive.
         */
        fun streamBidirectionalCodec(streamBidirectionalCodec: StreamBidirectionalCodec) = apply {
            body.streamBidirectionalCodec(streamBidirectionalCodec)
        }

        /**
         * Sets [Builder.streamBidirectionalCodec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamBidirectionalCodec] with a well-typed
         * [StreamBidirectionalCodec] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun streamBidirectionalCodec(
            streamBidirectionalCodec: JsonField<StreamBidirectionalCodec>
        ) = apply { body.streamBidirectionalCodec(streamBidirectionalCodec) }

        /** Configures method of bidirectional streaming (mp3, rtp). */
        fun streamBidirectionalMode(streamBidirectionalMode: StreamBidirectionalMode) = apply {
            body.streamBidirectionalMode(streamBidirectionalMode)
        }

        /**
         * Sets [Builder.streamBidirectionalMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamBidirectionalMode] with a well-typed
         * [StreamBidirectionalMode] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun streamBidirectionalMode(streamBidirectionalMode: JsonField<StreamBidirectionalMode>) =
            apply {
                body.streamBidirectionalMode(streamBidirectionalMode)
            }

        /** Audio sampling rate. */
        fun streamBidirectionalSamplingRate(
            streamBidirectionalSamplingRate: StreamBidirectionalSamplingRate
        ) = apply { body.streamBidirectionalSamplingRate(streamBidirectionalSamplingRate) }

        /**
         * Sets [Builder.streamBidirectionalSamplingRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamBidirectionalSamplingRate] with a well-typed
         * [StreamBidirectionalSamplingRate] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun streamBidirectionalSamplingRate(
            streamBidirectionalSamplingRate: JsonField<StreamBidirectionalSamplingRate>
        ) = apply { body.streamBidirectionalSamplingRate(streamBidirectionalSamplingRate) }

        /** Specifies which call legs should receive the bidirectional stream audio. */
        fun streamBidirectionalTargetLegs(
            streamBidirectionalTargetLegs: StreamBidirectionalTargetLegs
        ) = apply { body.streamBidirectionalTargetLegs(streamBidirectionalTargetLegs) }

        /**
         * Sets [Builder.streamBidirectionalTargetLegs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamBidirectionalTargetLegs] with a well-typed
         * [StreamBidirectionalTargetLegs] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun streamBidirectionalTargetLegs(
            streamBidirectionalTargetLegs: JsonField<StreamBidirectionalTargetLegs>
        ) = apply { body.streamBidirectionalTargetLegs(streamBidirectionalTargetLegs) }

        /**
         * Specifies the codec to be used for the streamed audio. When set to 'default' or when
         * transcoding is not possible, the codec from the call will be used.
         */
        fun streamCodec(streamCodec: StreamCodec) = apply { body.streamCodec(streamCodec) }

        /**
         * Sets [Builder.streamCodec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamCodec] with a well-typed [StreamCodec] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun streamCodec(streamCodec: JsonField<StreamCodec>) = apply {
            body.streamCodec(streamCodec)
        }

        /**
         * Establish websocket connection before dialing the destination. This is useful for cases
         * where the websocket connection takes a long time to establish.
         */
        fun streamEstablishBeforeCallOriginate(streamEstablishBeforeCallOriginate: Boolean) =
            apply {
                body.streamEstablishBeforeCallOriginate(streamEstablishBeforeCallOriginate)
            }

        /**
         * Sets [Builder.streamEstablishBeforeCallOriginate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamEstablishBeforeCallOriginate] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun streamEstablishBeforeCallOriginate(
            streamEstablishBeforeCallOriginate: JsonField<Boolean>
        ) = apply { body.streamEstablishBeforeCallOriginate(streamEstablishBeforeCallOriginate) }

        /** Specifies which track should be streamed. */
        fun streamTrack(streamTrack: StreamTrack) = apply { body.streamTrack(streamTrack) }

        /**
         * Sets [Builder.streamTrack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamTrack] with a well-typed [StreamTrack] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun streamTrack(streamTrack: JsonField<StreamTrack>) = apply {
            body.streamTrack(streamTrack)
        }

        /** The destination WebSocket address where the stream is going to be delivered. */
        fun streamUrl(streamUrl: String) = apply { body.streamUrl(streamUrl) }

        /**
         * Sets [Builder.streamUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun streamUrl(streamUrl: JsonField<String>) = apply { body.streamUrl(streamUrl) }

        /** The call leg which will be supervised by the new call. */
        fun superviseCallControlId(superviseCallControlId: String) = apply {
            body.superviseCallControlId(superviseCallControlId)
        }

        /**
         * Sets [Builder.superviseCallControlId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.superviseCallControlId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun superviseCallControlId(superviseCallControlId: JsonField<String>) = apply {
            body.superviseCallControlId(superviseCallControlId)
        }

        /**
         * The role of the supervisor call. 'barge' means that supervisor call hears and is being
         * heard by both ends of the call (caller & callee). 'whisper' means that only
         * supervised_call_control_id hears supervisor but supervisor can hear everything. 'monitor'
         * means that nobody can hear supervisor call, but supervisor can hear everything on the
         * call.
         */
        fun supervisorRole(supervisorRole: SupervisorRole) = apply {
            body.supervisorRole(supervisorRole)
        }

        /**
         * Sets [Builder.supervisorRole] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supervisorRole] with a well-typed [SupervisorRole] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun supervisorRole(supervisorRole: JsonField<SupervisorRole>) = apply {
            body.supervisorRole(supervisorRole)
        }

        /**
         * Sets the maximum duration of a Call Control Leg in seconds. If the time limit is reached,
         * the call will hangup and a `call.hangup` webhook with a `hangup_cause` of `time_limit`
         * will be sent. For example, by setting a time limit of 120 seconds, a Call Leg will be
         * automatically terminated two minutes after being answered. The default time limit is
         * 14400 seconds or 4 hours and this is also the maximum allowed call length.
         */
        fun timeLimitSecs(timeLimitSecs: Int) = apply { body.timeLimitSecs(timeLimitSecs) }

        /**
         * Sets [Builder.timeLimitSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeLimitSecs] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeLimitSecs(timeLimitSecs: JsonField<Int>) = apply {
            body.timeLimitSecs(timeLimitSecs)
        }

        /**
         * The number of seconds that Telnyx will wait for the call to be answered by the
         * destination to which it is being called. If the timeout is reached before an answer is
         * received, the call will hangup and a `call.hangup` webhook with a `hangup_cause` of
         * `timeout` will be sent. Minimum value is 5 seconds. Maximum value is 600 seconds.
         */
        fun timeoutSecs(timeoutSecs: Int) = apply { body.timeoutSecs(timeoutSecs) }

        /**
         * Sets [Builder.timeoutSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutSecs] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeoutSecs(timeoutSecs: JsonField<Int>) = apply { body.timeoutSecs(timeoutSecs) }

        /** Enable transcription upon call answer. The default value is false. */
        fun transcription(transcription: Boolean) = apply { body.transcription(transcription) }

        /**
         * Sets [Builder.transcription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcription] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transcription(transcription: JsonField<Boolean>) = apply {
            body.transcription(transcription)
        }

        fun transcriptionConfig(transcriptionConfig: TranscriptionStartRequest) = apply {
            body.transcriptionConfig(transcriptionConfig)
        }

        /**
         * Sets [Builder.transcriptionConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionConfig] with a well-typed
         * [TranscriptionStartRequest] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun transcriptionConfig(transcriptionConfig: JsonField<TranscriptionStartRequest>) = apply {
            body.transcriptionConfig(transcriptionConfig)
        }

        /**
         * Use this field to override the URL for which Telnyx will send subsequent webhooks to for
         * this call.
         */
        fun webhookUrl(webhookUrl: String) = apply { body.webhookUrl(webhookUrl) }

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { body.webhookUrl(webhookUrl) }

        /** HTTP request type used for `webhook_url`. */
        fun webhookUrlMethod(webhookUrlMethod: WebhookUrlMethod) = apply {
            body.webhookUrlMethod(webhookUrlMethod)
        }

        /**
         * Sets [Builder.webhookUrlMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrlMethod] with a well-typed [WebhookUrlMethod]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhookUrlMethod(webhookUrlMethod: JsonField<WebhookUrlMethod>) = apply {
            body.webhookUrlMethod(webhookUrlMethod)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CallDialParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .connectionId()
         * .from()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CallDialParams =
            CallDialParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val connectionId: JsonField<String>,
        private val from: JsonField<String>,
        private val to: JsonField<To>,
        private val answeringMachineDetection: JsonField<AnsweringMachineDetection>,
        private val answeringMachineDetectionConfig: JsonField<AnsweringMachineDetectionConfig>,
        private val audioUrl: JsonField<String>,
        private val billingGroupId: JsonField<String>,
        private val bridgeIntent: JsonField<Boolean>,
        private val bridgeOnAnswer: JsonField<Boolean>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val conferenceConfig: JsonField<ConferenceConfig>,
        private val customHeaders: JsonField<List<CustomSipHeader>>,
        private val dialogflowConfig: JsonField<DialogflowConfig>,
        private val enableDialogflow: JsonField<Boolean>,
        private val fromDisplayName: JsonField<String>,
        private val linkTo: JsonField<String>,
        private val mediaEncryption: JsonField<MediaEncryption>,
        private val mediaName: JsonField<String>,
        private val parkAfterUnbridge: JsonField<String>,
        private val preferredCodecs: JsonField<String>,
        private val record: JsonField<Record>,
        private val recordChannels: JsonField<RecordChannels>,
        private val recordCustomFileName: JsonField<String>,
        private val recordFormat: JsonField<RecordFormat>,
        private val recordMaxLength: JsonField<Int>,
        private val recordTimeoutSecs: JsonField<Int>,
        private val recordTrack: JsonField<RecordTrack>,
        private val recordTrim: JsonField<RecordTrim>,
        private val sendSilenceWhenIdle: JsonField<Boolean>,
        private val sipAuthPassword: JsonField<String>,
        private val sipAuthUsername: JsonField<String>,
        private val sipHeaders: JsonField<List<SipHeader>>,
        private val sipTransportProtocol: JsonField<SipTransportProtocol>,
        private val soundModifications: JsonField<SoundModifications>,
        private val streamBidirectionalCodec: JsonField<StreamBidirectionalCodec>,
        private val streamBidirectionalMode: JsonField<StreamBidirectionalMode>,
        private val streamBidirectionalSamplingRate: JsonField<StreamBidirectionalSamplingRate>,
        private val streamBidirectionalTargetLegs: JsonField<StreamBidirectionalTargetLegs>,
        private val streamCodec: JsonField<StreamCodec>,
        private val streamEstablishBeforeCallOriginate: JsonField<Boolean>,
        private val streamTrack: JsonField<StreamTrack>,
        private val streamUrl: JsonField<String>,
        private val superviseCallControlId: JsonField<String>,
        private val supervisorRole: JsonField<SupervisorRole>,
        private val timeLimitSecs: JsonField<Int>,
        private val timeoutSecs: JsonField<Int>,
        private val transcription: JsonField<Boolean>,
        private val transcriptionConfig: JsonField<TranscriptionStartRequest>,
        private val webhookUrl: JsonField<String>,
        private val webhookUrlMethod: JsonField<WebhookUrlMethod>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<To> = JsonMissing.of(),
            @JsonProperty("answering_machine_detection")
            @ExcludeMissing
            answeringMachineDetection: JsonField<AnsweringMachineDetection> = JsonMissing.of(),
            @JsonProperty("answering_machine_detection_config")
            @ExcludeMissing
            answeringMachineDetectionConfig: JsonField<AnsweringMachineDetectionConfig> =
                JsonMissing.of(),
            @JsonProperty("audio_url")
            @ExcludeMissing
            audioUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billing_group_id")
            @ExcludeMissing
            billingGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bridge_intent")
            @ExcludeMissing
            bridgeIntent: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("bridge_on_answer")
            @ExcludeMissing
            bridgeOnAnswer: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("conference_config")
            @ExcludeMissing
            conferenceConfig: JsonField<ConferenceConfig> = JsonMissing.of(),
            @JsonProperty("custom_headers")
            @ExcludeMissing
            customHeaders: JsonField<List<CustomSipHeader>> = JsonMissing.of(),
            @JsonProperty("dialogflow_config")
            @ExcludeMissing
            dialogflowConfig: JsonField<DialogflowConfig> = JsonMissing.of(),
            @JsonProperty("enable_dialogflow")
            @ExcludeMissing
            enableDialogflow: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("from_display_name")
            @ExcludeMissing
            fromDisplayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("link_to") @ExcludeMissing linkTo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("media_encryption")
            @ExcludeMissing
            mediaEncryption: JsonField<MediaEncryption> = JsonMissing.of(),
            @JsonProperty("media_name")
            @ExcludeMissing
            mediaName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("park_after_unbridge")
            @ExcludeMissing
            parkAfterUnbridge: JsonField<String> = JsonMissing.of(),
            @JsonProperty("preferred_codecs")
            @ExcludeMissing
            preferredCodecs: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record") @ExcludeMissing record: JsonField<Record> = JsonMissing.of(),
            @JsonProperty("record_channels")
            @ExcludeMissing
            recordChannels: JsonField<RecordChannels> = JsonMissing.of(),
            @JsonProperty("record_custom_file_name")
            @ExcludeMissing
            recordCustomFileName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_format")
            @ExcludeMissing
            recordFormat: JsonField<RecordFormat> = JsonMissing.of(),
            @JsonProperty("record_max_length")
            @ExcludeMissing
            recordMaxLength: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("record_timeout_secs")
            @ExcludeMissing
            recordTimeoutSecs: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("record_track")
            @ExcludeMissing
            recordTrack: JsonField<RecordTrack> = JsonMissing.of(),
            @JsonProperty("record_trim")
            @ExcludeMissing
            recordTrim: JsonField<RecordTrim> = JsonMissing.of(),
            @JsonProperty("send_silence_when_idle")
            @ExcludeMissing
            sendSilenceWhenIdle: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("sip_auth_password")
            @ExcludeMissing
            sipAuthPassword: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sip_auth_username")
            @ExcludeMissing
            sipAuthUsername: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sip_headers")
            @ExcludeMissing
            sipHeaders: JsonField<List<SipHeader>> = JsonMissing.of(),
            @JsonProperty("sip_transport_protocol")
            @ExcludeMissing
            sipTransportProtocol: JsonField<SipTransportProtocol> = JsonMissing.of(),
            @JsonProperty("sound_modifications")
            @ExcludeMissing
            soundModifications: JsonField<SoundModifications> = JsonMissing.of(),
            @JsonProperty("stream_bidirectional_codec")
            @ExcludeMissing
            streamBidirectionalCodec: JsonField<StreamBidirectionalCodec> = JsonMissing.of(),
            @JsonProperty("stream_bidirectional_mode")
            @ExcludeMissing
            streamBidirectionalMode: JsonField<StreamBidirectionalMode> = JsonMissing.of(),
            @JsonProperty("stream_bidirectional_sampling_rate")
            @ExcludeMissing
            streamBidirectionalSamplingRate: JsonField<StreamBidirectionalSamplingRate> =
                JsonMissing.of(),
            @JsonProperty("stream_bidirectional_target_legs")
            @ExcludeMissing
            streamBidirectionalTargetLegs: JsonField<StreamBidirectionalTargetLegs> =
                JsonMissing.of(),
            @JsonProperty("stream_codec")
            @ExcludeMissing
            streamCodec: JsonField<StreamCodec> = JsonMissing.of(),
            @JsonProperty("stream_establish_before_call_originate")
            @ExcludeMissing
            streamEstablishBeforeCallOriginate: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("stream_track")
            @ExcludeMissing
            streamTrack: JsonField<StreamTrack> = JsonMissing.of(),
            @JsonProperty("stream_url")
            @ExcludeMissing
            streamUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("supervise_call_control_id")
            @ExcludeMissing
            superviseCallControlId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("supervisor_role")
            @ExcludeMissing
            supervisorRole: JsonField<SupervisorRole> = JsonMissing.of(),
            @JsonProperty("time_limit_secs")
            @ExcludeMissing
            timeLimitSecs: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("timeout_secs")
            @ExcludeMissing
            timeoutSecs: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("transcription")
            @ExcludeMissing
            transcription: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("transcription_config")
            @ExcludeMissing
            transcriptionConfig: JsonField<TranscriptionStartRequest> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_url_method")
            @ExcludeMissing
            webhookUrlMethod: JsonField<WebhookUrlMethod> = JsonMissing.of(),
        ) : this(
            connectionId,
            from,
            to,
            answeringMachineDetection,
            answeringMachineDetectionConfig,
            audioUrl,
            billingGroupId,
            bridgeIntent,
            bridgeOnAnswer,
            clientState,
            commandId,
            conferenceConfig,
            customHeaders,
            dialogflowConfig,
            enableDialogflow,
            fromDisplayName,
            linkTo,
            mediaEncryption,
            mediaName,
            parkAfterUnbridge,
            preferredCodecs,
            record,
            recordChannels,
            recordCustomFileName,
            recordFormat,
            recordMaxLength,
            recordTimeoutSecs,
            recordTrack,
            recordTrim,
            sendSilenceWhenIdle,
            sipAuthPassword,
            sipAuthUsername,
            sipHeaders,
            sipTransportProtocol,
            soundModifications,
            streamBidirectionalCodec,
            streamBidirectionalMode,
            streamBidirectionalSamplingRate,
            streamBidirectionalTargetLegs,
            streamCodec,
            streamEstablishBeforeCallOriginate,
            streamTrack,
            streamUrl,
            superviseCallControlId,
            supervisorRole,
            timeLimitSecs,
            timeoutSecs,
            transcription,
            transcriptionConfig,
            webhookUrl,
            webhookUrlMethod,
            mutableMapOf(),
        )

        /**
         * The ID of the Call Control App (formerly ID of the connection) to be used when dialing
         * the destination.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun connectionId(): String = connectionId.getRequired("connection_id")

        /**
         * The `from` number to be used as the caller id presented to the destination (`to` number).
         * The number should be in +E164 format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): String = from.getRequired("from")

        /**
         * The DID or SIP URI to dial out to. Multiple DID or SIP URIs can be provided using an
         * array of strings
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): To = to.getRequired("to")

        /**
         * Enables Answering Machine Detection. Telnyx offers Premium and Standard detections. With
         * Premium detection, when a call is answered, Telnyx runs real-time detection and sends a
         * `call.machine.premium.detection.ended` webhook with one of the following results:
         * `human_residence`, `human_business`, `machine`, `silence` or `fax_detected`. If we detect
         * a beep, we also send a `call.machine.premium.greeting.ended` webhook with the result of
         * `beep_detected`. If we detect a beep before `call.machine.premium.detection.ended` we
         * only send `call.machine.premium.greeting.ended`, and if we detect a beep after
         * `call.machine.premium.detection.ended`, we send both webhooks. With Standard detection,
         * when a call is answered, Telnyx runs real-time detection to determine if it was picked up
         * by a human or a machine and sends an `call.machine.detection.ended` webhook with the
         * analysis result. If `greeting_end` or `detect_words` is used and a `machine` is detected,
         * you will receive another `call.machine.greeting.ended` webhook when the answering machine
         * greeting ends with a beep or silence. If `detect_beep` is used, you will only receive
         * `call.machine.greeting.ended` if a beep is detected.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun answeringMachineDetection(): Optional<AnsweringMachineDetection> =
            answeringMachineDetection.getOptional("answering_machine_detection")

        /**
         * Optional configuration parameters to modify 'answering_machine_detection' performance.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun answeringMachineDetectionConfig(): Optional<AnsweringMachineDetectionConfig> =
            answeringMachineDetectionConfig.getOptional("answering_machine_detection_config")

        /**
         * The URL of a file to be played back to the callee when the call is answered. The URL can
         * point to either a WAV or MP3 file. media_name and audio_url cannot be used together in
         * one request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audioUrl(): Optional<String> = audioUrl.getOptional("audio_url")

        /**
         * Use this field to set the Billing Group ID for the call. Must be a valid and existing
         * Billing Group ID.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingGroupId(): Optional<String> = billingGroupId.getOptional("billing_group_id")

        /**
         * Indicates the intent to bridge this call with the call specified in link_to. When
         * bridge_intent is true, link_to becomes required and the from number will be overwritten
         * by the from number from the linked call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bridgeIntent(): Optional<Boolean> = bridgeIntent.getOptional("bridge_intent")

        /**
         * Whether to automatically bridge answered call to the call specified in link_to. When
         * bridge_on_answer is true, link_to becomes required.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bridgeOnAnswer(): Optional<Boolean> = bridgeOnAnswer.getOptional("bridge_on_answer")

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientState(): Optional<String> = clientState.getOptional("client_state")

        /**
         * Use this field to avoid duplicate commands. Telnyx will ignore others Dial commands with
         * the same `command_id`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commandId(): Optional<String> = commandId.getOptional("command_id")

        /**
         * Optional configuration parameters to dial new participant into a conference.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conferenceConfig(): Optional<ConferenceConfig> =
            conferenceConfig.getOptional("conference_config")

        /**
         * Custom headers to be added to the SIP INVITE.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customHeaders(): Optional<List<CustomSipHeader>> =
            customHeaders.getOptional("custom_headers")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dialogflowConfig(): Optional<DialogflowConfig> =
            dialogflowConfig.getOptional("dialogflow_config")

        /**
         * Enables Dialogflow for the current call. The default value is false.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enableDialogflow(): Optional<Boolean> =
            enableDialogflow.getOptional("enable_dialogflow")

        /**
         * The `from_display_name` string to be used as the caller id name (SIP From Display Name)
         * presented to the destination (`to` number). The string should have a maximum of 128
         * characters, containing only letters, numbers, spaces, and -_~!.+ special characters. If
         * ommited, the display name will be the same as the number in the `from` field.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fromDisplayName(): Optional<String> = fromDisplayName.getOptional("from_display_name")

        /**
         * Use another call's control id for sharing the same call session id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun linkTo(): Optional<String> = linkTo.getOptional("link_to")

        /**
         * Defines whether media should be encrypted on the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaEncryption(): Optional<MediaEncryption> =
            mediaEncryption.getOptional("media_encryption")

        /**
         * The media_name of a file to be played back to the callee when the call is answered. The
         * media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the
         * same user/organization. The file must either be a WAV or MP3 file.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaName(): Optional<String> = mediaName.getOptional("media_name")

        /**
         * If supplied with the value `self`, the current leg will be parked after unbridge. If not
         * set, the default behavior is to hang up the leg. When park_after_unbridge is set, link_to
         * becomes required.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parkAfterUnbridge(): Optional<String> =
            parkAfterUnbridge.getOptional("park_after_unbridge")

        /**
         * The list of comma-separated codecs in a preferred order for the forked media to be
         * received.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun preferredCodecs(): Optional<String> = preferredCodecs.getOptional("preferred_codecs")

        /**
         * Start recording automatically after an event. Disabled by default.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun record(): Optional<Record> = record.getOptional("record")

        /**
         * Defines which channel should be recorded ('single' or 'dual') when `record` is specified.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordChannels(): Optional<RecordChannels> =
            recordChannels.getOptional("record_channels")

        /**
         * The custom recording file name to be used instead of the default `call_leg_id`. Telnyx
         * will still add a Unix timestamp suffix.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordCustomFileName(): Optional<String> =
            recordCustomFileName.getOptional("record_custom_file_name")

        /**
         * Defines the format of the recording ('wav' or 'mp3') when `record` is specified.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordFormat(): Optional<RecordFormat> = recordFormat.getOptional("record_format")

        /**
         * Defines the maximum length for the recording in seconds when `record` is specified. The
         * minimum value is 0. The maximum value is 43200. The default value is 0 (infinite).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordMaxLength(): Optional<Int> = recordMaxLength.getOptional("record_max_length")

        /**
         * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
         * detected when `record` is specified. The timer only starts when the speech is detected.
         * Please note that call transcription is used to detect silence and the related charge will
         * be applied. The minimum value is 0. The default value is 0 (infinite).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordTimeoutSecs(): Optional<Int> =
            recordTimeoutSecs.getOptional("record_timeout_secs")

        /**
         * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If only
         * single track is specified (`inbound`, `outbound`), `channels` configuration is ignored
         * and it will be recorded as mono (single channel).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordTrack(): Optional<RecordTrack> = recordTrack.getOptional("record_track")

        /**
         * When set to `trim-silence`, silence will be removed from the beginning and end of the
         * recording.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordTrim(): Optional<RecordTrim> = recordTrim.getOptional("record_trim")

        /**
         * Generate silence RTP packets when no transmission available.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sendSilenceWhenIdle(): Optional<Boolean> =
            sendSilenceWhenIdle.getOptional("send_silence_when_idle")

        /**
         * SIP Authentication password used for SIP challenges.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipAuthPassword(): Optional<String> = sipAuthPassword.getOptional("sip_auth_password")

        /**
         * SIP Authentication username used for SIP challenges.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipAuthUsername(): Optional<String> = sipAuthUsername.getOptional("sip_auth_username")

        /**
         * SIP headers to be added to the SIP INVITE request. Currently only User-to-User header is
         * supported.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipHeaders(): Optional<List<SipHeader>> = sipHeaders.getOptional("sip_headers")

        /**
         * Defines SIP transport protocol to be used on the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipTransportProtocol(): Optional<SipTransportProtocol> =
            sipTransportProtocol.getOptional("sip_transport_protocol")

        /**
         * Use this field to modify sound effects, for example adjust the pitch.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun soundModifications(): Optional<SoundModifications> =
            soundModifications.getOptional("sound_modifications")

        /**
         * Indicates codec for bidirectional streaming RTP payloads. Used only with
         * stream_bidirectional_mode=rtp. Case sensitive.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streamBidirectionalCodec(): Optional<StreamBidirectionalCodec> =
            streamBidirectionalCodec.getOptional("stream_bidirectional_codec")

        /**
         * Configures method of bidirectional streaming (mp3, rtp).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streamBidirectionalMode(): Optional<StreamBidirectionalMode> =
            streamBidirectionalMode.getOptional("stream_bidirectional_mode")

        /**
         * Audio sampling rate.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streamBidirectionalSamplingRate(): Optional<StreamBidirectionalSamplingRate> =
            streamBidirectionalSamplingRate.getOptional("stream_bidirectional_sampling_rate")

        /**
         * Specifies which call legs should receive the bidirectional stream audio.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streamBidirectionalTargetLegs(): Optional<StreamBidirectionalTargetLegs> =
            streamBidirectionalTargetLegs.getOptional("stream_bidirectional_target_legs")

        /**
         * Specifies the codec to be used for the streamed audio. When set to 'default' or when
         * transcoding is not possible, the codec from the call will be used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streamCodec(): Optional<StreamCodec> = streamCodec.getOptional("stream_codec")

        /**
         * Establish websocket connection before dialing the destination. This is useful for cases
         * where the websocket connection takes a long time to establish.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streamEstablishBeforeCallOriginate(): Optional<Boolean> =
            streamEstablishBeforeCallOriginate.getOptional("stream_establish_before_call_originate")

        /**
         * Specifies which track should be streamed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streamTrack(): Optional<StreamTrack> = streamTrack.getOptional("stream_track")

        /**
         * The destination WebSocket address where the stream is going to be delivered.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streamUrl(): Optional<String> = streamUrl.getOptional("stream_url")

        /**
         * The call leg which will be supervised by the new call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun superviseCallControlId(): Optional<String> =
            superviseCallControlId.getOptional("supervise_call_control_id")

        /**
         * The role of the supervisor call. 'barge' means that supervisor call hears and is being
         * heard by both ends of the call (caller & callee). 'whisper' means that only
         * supervised_call_control_id hears supervisor but supervisor can hear everything. 'monitor'
         * means that nobody can hear supervisor call, but supervisor can hear everything on the
         * call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun supervisorRole(): Optional<SupervisorRole> =
            supervisorRole.getOptional("supervisor_role")

        /**
         * Sets the maximum duration of a Call Control Leg in seconds. If the time limit is reached,
         * the call will hangup and a `call.hangup` webhook with a `hangup_cause` of `time_limit`
         * will be sent. For example, by setting a time limit of 120 seconds, a Call Leg will be
         * automatically terminated two minutes after being answered. The default time limit is
         * 14400 seconds or 4 hours and this is also the maximum allowed call length.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeLimitSecs(): Optional<Int> = timeLimitSecs.getOptional("time_limit_secs")

        /**
         * The number of seconds that Telnyx will wait for the call to be answered by the
         * destination to which it is being called. If the timeout is reached before an answer is
         * received, the call will hangup and a `call.hangup` webhook with a `hangup_cause` of
         * `timeout` will be sent. Minimum value is 5 seconds. Maximum value is 600 seconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeoutSecs(): Optional<Int> = timeoutSecs.getOptional("timeout_secs")

        /**
         * Enable transcription upon call answer. The default value is false.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcription(): Optional<Boolean> = transcription.getOptional("transcription")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcriptionConfig(): Optional<TranscriptionStartRequest> =
            transcriptionConfig.getOptional("transcription_config")

        /**
         * Use this field to override the URL for which Telnyx will send subsequent webhooks to for
         * this call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

        /**
         * HTTP request type used for `webhook_url`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrlMethod(): Optional<WebhookUrlMethod> =
            webhookUrlMethod.getOptional("webhook_url_method")

        /**
         * Returns the raw JSON value of [connectionId].
         *
         * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<String> = connectionId

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<To> = to

        /**
         * Returns the raw JSON value of [answeringMachineDetection].
         *
         * Unlike [answeringMachineDetection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("answering_machine_detection")
        @ExcludeMissing
        fun _answeringMachineDetection(): JsonField<AnsweringMachineDetection> =
            answeringMachineDetection

        /**
         * Returns the raw JSON value of [answeringMachineDetectionConfig].
         *
         * Unlike [answeringMachineDetectionConfig], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("answering_machine_detection_config")
        @ExcludeMissing
        fun _answeringMachineDetectionConfig(): JsonField<AnsweringMachineDetectionConfig> =
            answeringMachineDetectionConfig

        /**
         * Returns the raw JSON value of [audioUrl].
         *
         * Unlike [audioUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audio_url") @ExcludeMissing fun _audioUrl(): JsonField<String> = audioUrl

        /**
         * Returns the raw JSON value of [billingGroupId].
         *
         * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_group_id")
        @ExcludeMissing
        fun _billingGroupId(): JsonField<String> = billingGroupId

        /**
         * Returns the raw JSON value of [bridgeIntent].
         *
         * Unlike [bridgeIntent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bridge_intent")
        @ExcludeMissing
        fun _bridgeIntent(): JsonField<Boolean> = bridgeIntent

        /**
         * Returns the raw JSON value of [bridgeOnAnswer].
         *
         * Unlike [bridgeOnAnswer], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bridge_on_answer")
        @ExcludeMissing
        fun _bridgeOnAnswer(): JsonField<Boolean> = bridgeOnAnswer

        /**
         * Returns the raw JSON value of [clientState].
         *
         * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_state")
        @ExcludeMissing
        fun _clientState(): JsonField<String> = clientState

        /**
         * Returns the raw JSON value of [commandId].
         *
         * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("command_id") @ExcludeMissing fun _commandId(): JsonField<String> = commandId

        /**
         * Returns the raw JSON value of [conferenceConfig].
         *
         * Unlike [conferenceConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("conference_config")
        @ExcludeMissing
        fun _conferenceConfig(): JsonField<ConferenceConfig> = conferenceConfig

        /**
         * Returns the raw JSON value of [customHeaders].
         *
         * Unlike [customHeaders], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_headers")
        @ExcludeMissing
        fun _customHeaders(): JsonField<List<CustomSipHeader>> = customHeaders

        /**
         * Returns the raw JSON value of [dialogflowConfig].
         *
         * Unlike [dialogflowConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dialogflow_config")
        @ExcludeMissing
        fun _dialogflowConfig(): JsonField<DialogflowConfig> = dialogflowConfig

        /**
         * Returns the raw JSON value of [enableDialogflow].
         *
         * Unlike [enableDialogflow], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("enable_dialogflow")
        @ExcludeMissing
        fun _enableDialogflow(): JsonField<Boolean> = enableDialogflow

        /**
         * Returns the raw JSON value of [fromDisplayName].
         *
         * Unlike [fromDisplayName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("from_display_name")
        @ExcludeMissing
        fun _fromDisplayName(): JsonField<String> = fromDisplayName

        /**
         * Returns the raw JSON value of [linkTo].
         *
         * Unlike [linkTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("link_to") @ExcludeMissing fun _linkTo(): JsonField<String> = linkTo

        /**
         * Returns the raw JSON value of [mediaEncryption].
         *
         * Unlike [mediaEncryption], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("media_encryption")
        @ExcludeMissing
        fun _mediaEncryption(): JsonField<MediaEncryption> = mediaEncryption

        /**
         * Returns the raw JSON value of [mediaName].
         *
         * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("media_name") @ExcludeMissing fun _mediaName(): JsonField<String> = mediaName

        /**
         * Returns the raw JSON value of [parkAfterUnbridge].
         *
         * Unlike [parkAfterUnbridge], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("park_after_unbridge")
        @ExcludeMissing
        fun _parkAfterUnbridge(): JsonField<String> = parkAfterUnbridge

        /**
         * Returns the raw JSON value of [preferredCodecs].
         *
         * Unlike [preferredCodecs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preferred_codecs")
        @ExcludeMissing
        fun _preferredCodecs(): JsonField<String> = preferredCodecs

        /**
         * Returns the raw JSON value of [record].
         *
         * Unlike [record], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record") @ExcludeMissing fun _record(): JsonField<Record> = record

        /**
         * Returns the raw JSON value of [recordChannels].
         *
         * Unlike [recordChannels], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("record_channels")
        @ExcludeMissing
        fun _recordChannels(): JsonField<RecordChannels> = recordChannels

        /**
         * Returns the raw JSON value of [recordCustomFileName].
         *
         * Unlike [recordCustomFileName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("record_custom_file_name")
        @ExcludeMissing
        fun _recordCustomFileName(): JsonField<String> = recordCustomFileName

        /**
         * Returns the raw JSON value of [recordFormat].
         *
         * Unlike [recordFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("record_format")
        @ExcludeMissing
        fun _recordFormat(): JsonField<RecordFormat> = recordFormat

        /**
         * Returns the raw JSON value of [recordMaxLength].
         *
         * Unlike [recordMaxLength], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("record_max_length")
        @ExcludeMissing
        fun _recordMaxLength(): JsonField<Int> = recordMaxLength

        /**
         * Returns the raw JSON value of [recordTimeoutSecs].
         *
         * Unlike [recordTimeoutSecs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("record_timeout_secs")
        @ExcludeMissing
        fun _recordTimeoutSecs(): JsonField<Int> = recordTimeoutSecs

        /**
         * Returns the raw JSON value of [recordTrack].
         *
         * Unlike [recordTrack], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_track")
        @ExcludeMissing
        fun _recordTrack(): JsonField<RecordTrack> = recordTrack

        /**
         * Returns the raw JSON value of [recordTrim].
         *
         * Unlike [recordTrim], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_trim")
        @ExcludeMissing
        fun _recordTrim(): JsonField<RecordTrim> = recordTrim

        /**
         * Returns the raw JSON value of [sendSilenceWhenIdle].
         *
         * Unlike [sendSilenceWhenIdle], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("send_silence_when_idle")
        @ExcludeMissing
        fun _sendSilenceWhenIdle(): JsonField<Boolean> = sendSilenceWhenIdle

        /**
         * Returns the raw JSON value of [sipAuthPassword].
         *
         * Unlike [sipAuthPassword], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sip_auth_password")
        @ExcludeMissing
        fun _sipAuthPassword(): JsonField<String> = sipAuthPassword

        /**
         * Returns the raw JSON value of [sipAuthUsername].
         *
         * Unlike [sipAuthUsername], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sip_auth_username")
        @ExcludeMissing
        fun _sipAuthUsername(): JsonField<String> = sipAuthUsername

        /**
         * Returns the raw JSON value of [sipHeaders].
         *
         * Unlike [sipHeaders], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sip_headers")
        @ExcludeMissing
        fun _sipHeaders(): JsonField<List<SipHeader>> = sipHeaders

        /**
         * Returns the raw JSON value of [sipTransportProtocol].
         *
         * Unlike [sipTransportProtocol], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("sip_transport_protocol")
        @ExcludeMissing
        fun _sipTransportProtocol(): JsonField<SipTransportProtocol> = sipTransportProtocol

        /**
         * Returns the raw JSON value of [soundModifications].
         *
         * Unlike [soundModifications], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("sound_modifications")
        @ExcludeMissing
        fun _soundModifications(): JsonField<SoundModifications> = soundModifications

        /**
         * Returns the raw JSON value of [streamBidirectionalCodec].
         *
         * Unlike [streamBidirectionalCodec], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("stream_bidirectional_codec")
        @ExcludeMissing
        fun _streamBidirectionalCodec(): JsonField<StreamBidirectionalCodec> =
            streamBidirectionalCodec

        /**
         * Returns the raw JSON value of [streamBidirectionalMode].
         *
         * Unlike [streamBidirectionalMode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("stream_bidirectional_mode")
        @ExcludeMissing
        fun _streamBidirectionalMode(): JsonField<StreamBidirectionalMode> = streamBidirectionalMode

        /**
         * Returns the raw JSON value of [streamBidirectionalSamplingRate].
         *
         * Unlike [streamBidirectionalSamplingRate], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("stream_bidirectional_sampling_rate")
        @ExcludeMissing
        fun _streamBidirectionalSamplingRate(): JsonField<StreamBidirectionalSamplingRate> =
            streamBidirectionalSamplingRate

        /**
         * Returns the raw JSON value of [streamBidirectionalTargetLegs].
         *
         * Unlike [streamBidirectionalTargetLegs], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("stream_bidirectional_target_legs")
        @ExcludeMissing
        fun _streamBidirectionalTargetLegs(): JsonField<StreamBidirectionalTargetLegs> =
            streamBidirectionalTargetLegs

        /**
         * Returns the raw JSON value of [streamCodec].
         *
         * Unlike [streamCodec], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stream_codec")
        @ExcludeMissing
        fun _streamCodec(): JsonField<StreamCodec> = streamCodec

        /**
         * Returns the raw JSON value of [streamEstablishBeforeCallOriginate].
         *
         * Unlike [streamEstablishBeforeCallOriginate], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("stream_establish_before_call_originate")
        @ExcludeMissing
        fun _streamEstablishBeforeCallOriginate(): JsonField<Boolean> =
            streamEstablishBeforeCallOriginate

        /**
         * Returns the raw JSON value of [streamTrack].
         *
         * Unlike [streamTrack], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stream_track")
        @ExcludeMissing
        fun _streamTrack(): JsonField<StreamTrack> = streamTrack

        /**
         * Returns the raw JSON value of [streamUrl].
         *
         * Unlike [streamUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stream_url") @ExcludeMissing fun _streamUrl(): JsonField<String> = streamUrl

        /**
         * Returns the raw JSON value of [superviseCallControlId].
         *
         * Unlike [superviseCallControlId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("supervise_call_control_id")
        @ExcludeMissing
        fun _superviseCallControlId(): JsonField<String> = superviseCallControlId

        /**
         * Returns the raw JSON value of [supervisorRole].
         *
         * Unlike [supervisorRole], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("supervisor_role")
        @ExcludeMissing
        fun _supervisorRole(): JsonField<SupervisorRole> = supervisorRole

        /**
         * Returns the raw JSON value of [timeLimitSecs].
         *
         * Unlike [timeLimitSecs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("time_limit_secs")
        @ExcludeMissing
        fun _timeLimitSecs(): JsonField<Int> = timeLimitSecs

        /**
         * Returns the raw JSON value of [timeoutSecs].
         *
         * Unlike [timeoutSecs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout_secs")
        @ExcludeMissing
        fun _timeoutSecs(): JsonField<Int> = timeoutSecs

        /**
         * Returns the raw JSON value of [transcription].
         *
         * Unlike [transcription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transcription")
        @ExcludeMissing
        fun _transcription(): JsonField<Boolean> = transcription

        /**
         * Returns the raw JSON value of [transcriptionConfig].
         *
         * Unlike [transcriptionConfig], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transcription_config")
        @ExcludeMissing
        fun _transcriptionConfig(): JsonField<TranscriptionStartRequest> = transcriptionConfig

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_url")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

        /**
         * Returns the raw JSON value of [webhookUrlMethod].
         *
         * Unlike [webhookUrlMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhook_url_method")
        @ExcludeMissing
        fun _webhookUrlMethod(): JsonField<WebhookUrlMethod> = webhookUrlMethod

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .connectionId()
             * .from()
             * .to()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var connectionId: JsonField<String>? = null
            private var from: JsonField<String>? = null
            private var to: JsonField<To>? = null
            private var answeringMachineDetection: JsonField<AnsweringMachineDetection> =
                JsonMissing.of()
            private var answeringMachineDetectionConfig:
                JsonField<AnsweringMachineDetectionConfig> =
                JsonMissing.of()
            private var audioUrl: JsonField<String> = JsonMissing.of()
            private var billingGroupId: JsonField<String> = JsonMissing.of()
            private var bridgeIntent: JsonField<Boolean> = JsonMissing.of()
            private var bridgeOnAnswer: JsonField<Boolean> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var conferenceConfig: JsonField<ConferenceConfig> = JsonMissing.of()
            private var customHeaders: JsonField<MutableList<CustomSipHeader>>? = null
            private var dialogflowConfig: JsonField<DialogflowConfig> = JsonMissing.of()
            private var enableDialogflow: JsonField<Boolean> = JsonMissing.of()
            private var fromDisplayName: JsonField<String> = JsonMissing.of()
            private var linkTo: JsonField<String> = JsonMissing.of()
            private var mediaEncryption: JsonField<MediaEncryption> = JsonMissing.of()
            private var mediaName: JsonField<String> = JsonMissing.of()
            private var parkAfterUnbridge: JsonField<String> = JsonMissing.of()
            private var preferredCodecs: JsonField<String> = JsonMissing.of()
            private var record: JsonField<Record> = JsonMissing.of()
            private var recordChannels: JsonField<RecordChannels> = JsonMissing.of()
            private var recordCustomFileName: JsonField<String> = JsonMissing.of()
            private var recordFormat: JsonField<RecordFormat> = JsonMissing.of()
            private var recordMaxLength: JsonField<Int> = JsonMissing.of()
            private var recordTimeoutSecs: JsonField<Int> = JsonMissing.of()
            private var recordTrack: JsonField<RecordTrack> = JsonMissing.of()
            private var recordTrim: JsonField<RecordTrim> = JsonMissing.of()
            private var sendSilenceWhenIdle: JsonField<Boolean> = JsonMissing.of()
            private var sipAuthPassword: JsonField<String> = JsonMissing.of()
            private var sipAuthUsername: JsonField<String> = JsonMissing.of()
            private var sipHeaders: JsonField<MutableList<SipHeader>>? = null
            private var sipTransportProtocol: JsonField<SipTransportProtocol> = JsonMissing.of()
            private var soundModifications: JsonField<SoundModifications> = JsonMissing.of()
            private var streamBidirectionalCodec: JsonField<StreamBidirectionalCodec> =
                JsonMissing.of()
            private var streamBidirectionalMode: JsonField<StreamBidirectionalMode> =
                JsonMissing.of()
            private var streamBidirectionalSamplingRate:
                JsonField<StreamBidirectionalSamplingRate> =
                JsonMissing.of()
            private var streamBidirectionalTargetLegs: JsonField<StreamBidirectionalTargetLegs> =
                JsonMissing.of()
            private var streamCodec: JsonField<StreamCodec> = JsonMissing.of()
            private var streamEstablishBeforeCallOriginate: JsonField<Boolean> = JsonMissing.of()
            private var streamTrack: JsonField<StreamTrack> = JsonMissing.of()
            private var streamUrl: JsonField<String> = JsonMissing.of()
            private var superviseCallControlId: JsonField<String> = JsonMissing.of()
            private var supervisorRole: JsonField<SupervisorRole> = JsonMissing.of()
            private var timeLimitSecs: JsonField<Int> = JsonMissing.of()
            private var timeoutSecs: JsonField<Int> = JsonMissing.of()
            private var transcription: JsonField<Boolean> = JsonMissing.of()
            private var transcriptionConfig: JsonField<TranscriptionStartRequest> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var webhookUrlMethod: JsonField<WebhookUrlMethod> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                connectionId = body.connectionId
                from = body.from
                to = body.to
                answeringMachineDetection = body.answeringMachineDetection
                answeringMachineDetectionConfig = body.answeringMachineDetectionConfig
                audioUrl = body.audioUrl
                billingGroupId = body.billingGroupId
                bridgeIntent = body.bridgeIntent
                bridgeOnAnswer = body.bridgeOnAnswer
                clientState = body.clientState
                commandId = body.commandId
                conferenceConfig = body.conferenceConfig
                customHeaders = body.customHeaders.map { it.toMutableList() }
                dialogflowConfig = body.dialogflowConfig
                enableDialogflow = body.enableDialogflow
                fromDisplayName = body.fromDisplayName
                linkTo = body.linkTo
                mediaEncryption = body.mediaEncryption
                mediaName = body.mediaName
                parkAfterUnbridge = body.parkAfterUnbridge
                preferredCodecs = body.preferredCodecs
                record = body.record
                recordChannels = body.recordChannels
                recordCustomFileName = body.recordCustomFileName
                recordFormat = body.recordFormat
                recordMaxLength = body.recordMaxLength
                recordTimeoutSecs = body.recordTimeoutSecs
                recordTrack = body.recordTrack
                recordTrim = body.recordTrim
                sendSilenceWhenIdle = body.sendSilenceWhenIdle
                sipAuthPassword = body.sipAuthPassword
                sipAuthUsername = body.sipAuthUsername
                sipHeaders = body.sipHeaders.map { it.toMutableList() }
                sipTransportProtocol = body.sipTransportProtocol
                soundModifications = body.soundModifications
                streamBidirectionalCodec = body.streamBidirectionalCodec
                streamBidirectionalMode = body.streamBidirectionalMode
                streamBidirectionalSamplingRate = body.streamBidirectionalSamplingRate
                streamBidirectionalTargetLegs = body.streamBidirectionalTargetLegs
                streamCodec = body.streamCodec
                streamEstablishBeforeCallOriginate = body.streamEstablishBeforeCallOriginate
                streamTrack = body.streamTrack
                streamUrl = body.streamUrl
                superviseCallControlId = body.superviseCallControlId
                supervisorRole = body.supervisorRole
                timeLimitSecs = body.timeLimitSecs
                timeoutSecs = body.timeoutSecs
                transcription = body.transcription
                transcriptionConfig = body.transcriptionConfig
                webhookUrl = body.webhookUrl
                webhookUrlMethod = body.webhookUrlMethod
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The ID of the Call Control App (formerly ID of the connection) to be used when
             * dialing the destination.
             */
            fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

            /**
             * Sets [Builder.connectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /**
             * The `from` number to be used as the caller id presented to the destination (`to`
             * number). The number should be in +E164 format.
             */
            fun from(from: String) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<String>) = apply { this.from = from }

            /**
             * The DID or SIP URI to dial out to. Multiple DID or SIP URIs can be provided using an
             * array of strings
             */
            fun to(to: To) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [To] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<To>) = apply { this.to = to }

            /** Alias for calling [to] with `To.ofString(string)`. */
            fun to(string: String) = to(To.ofString(string))

            /** Alias for calling [to] with `To.ofStrings(strings)`. */
            fun toOfStrings(strings: List<String>) = to(To.ofStrings(strings))

            /**
             * Enables Answering Machine Detection. Telnyx offers Premium and Standard detections.
             * With Premium detection, when a call is answered, Telnyx runs real-time detection and
             * sends a `call.machine.premium.detection.ended` webhook with one of the following
             * results: `human_residence`, `human_business`, `machine`, `silence` or `fax_detected`.
             * If we detect a beep, we also send a `call.machine.premium.greeting.ended` webhook
             * with the result of `beep_detected`. If we detect a beep before
             * `call.machine.premium.detection.ended` we only send
             * `call.machine.premium.greeting.ended`, and if we detect a beep after
             * `call.machine.premium.detection.ended`, we send both webhooks. With Standard
             * detection, when a call is answered, Telnyx runs real-time detection to determine if
             * it was picked up by a human or a machine and sends an `call.machine.detection.ended`
             * webhook with the analysis result. If `greeting_end` or `detect_words` is used and a
             * `machine` is detected, you will receive another `call.machine.greeting.ended` webhook
             * when the answering machine greeting ends with a beep or silence. If `detect_beep` is
             * used, you will only receive `call.machine.greeting.ended` if a beep is detected.
             */
            fun answeringMachineDetection(answeringMachineDetection: AnsweringMachineDetection) =
                answeringMachineDetection(JsonField.of(answeringMachineDetection))

            /**
             * Sets [Builder.answeringMachineDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.answeringMachineDetection] with a well-typed
             * [AnsweringMachineDetection] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun answeringMachineDetection(
                answeringMachineDetection: JsonField<AnsweringMachineDetection>
            ) = apply { this.answeringMachineDetection = answeringMachineDetection }

            /**
             * Optional configuration parameters to modify 'answering_machine_detection'
             * performance.
             */
            fun answeringMachineDetectionConfig(
                answeringMachineDetectionConfig: AnsweringMachineDetectionConfig
            ) = answeringMachineDetectionConfig(JsonField.of(answeringMachineDetectionConfig))

            /**
             * Sets [Builder.answeringMachineDetectionConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.answeringMachineDetectionConfig] with a well-typed
             * [AnsweringMachineDetectionConfig] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun answeringMachineDetectionConfig(
                answeringMachineDetectionConfig: JsonField<AnsweringMachineDetectionConfig>
            ) = apply { this.answeringMachineDetectionConfig = answeringMachineDetectionConfig }

            /**
             * The URL of a file to be played back to the callee when the call is answered. The URL
             * can point to either a WAV or MP3 file. media_name and audio_url cannot be used
             * together in one request.
             */
            fun audioUrl(audioUrl: String) = audioUrl(JsonField.of(audioUrl))

            /**
             * Sets [Builder.audioUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audioUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audioUrl(audioUrl: JsonField<String>) = apply { this.audioUrl = audioUrl }

            /**
             * Use this field to set the Billing Group ID for the call. Must be a valid and existing
             * Billing Group ID.
             */
            fun billingGroupId(billingGroupId: String) =
                billingGroupId(JsonField.of(billingGroupId))

            /**
             * Sets [Builder.billingGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingGroupId(billingGroupId: JsonField<String>) = apply {
                this.billingGroupId = billingGroupId
            }

            /**
             * Indicates the intent to bridge this call with the call specified in link_to. When
             * bridge_intent is true, link_to becomes required and the from number will be
             * overwritten by the from number from the linked call.
             */
            fun bridgeIntent(bridgeIntent: Boolean) = bridgeIntent(JsonField.of(bridgeIntent))

            /**
             * Sets [Builder.bridgeIntent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bridgeIntent] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bridgeIntent(bridgeIntent: JsonField<Boolean>) = apply {
                this.bridgeIntent = bridgeIntent
            }

            /**
             * Whether to automatically bridge answered call to the call specified in link_to. When
             * bridge_on_answer is true, link_to becomes required.
             */
            fun bridgeOnAnswer(bridgeOnAnswer: Boolean) =
                bridgeOnAnswer(JsonField.of(bridgeOnAnswer))

            /**
             * Sets [Builder.bridgeOnAnswer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bridgeOnAnswer] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bridgeOnAnswer(bridgeOnAnswer: JsonField<Boolean>) = apply {
                this.bridgeOnAnswer = bridgeOnAnswer
            }

            /**
             * Use this field to add state to every subsequent webhook. It must be a valid Base-64
             * encoded string.
             */
            fun clientState(clientState: String) = clientState(JsonField.of(clientState))

            /**
             * Sets [Builder.clientState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientState(clientState: JsonField<String>) = apply {
                this.clientState = clientState
            }

            /**
             * Use this field to avoid duplicate commands. Telnyx will ignore others Dial commands
             * with the same `command_id`.
             */
            fun commandId(commandId: String) = commandId(JsonField.of(commandId))

            /**
             * Sets [Builder.commandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commandId(commandId: JsonField<String>) = apply { this.commandId = commandId }

            /** Optional configuration parameters to dial new participant into a conference. */
            fun conferenceConfig(conferenceConfig: ConferenceConfig) =
                conferenceConfig(JsonField.of(conferenceConfig))

            /**
             * Sets [Builder.conferenceConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conferenceConfig] with a well-typed
             * [ConferenceConfig] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun conferenceConfig(conferenceConfig: JsonField<ConferenceConfig>) = apply {
                this.conferenceConfig = conferenceConfig
            }

            /** Custom headers to be added to the SIP INVITE. */
            fun customHeaders(customHeaders: List<CustomSipHeader>) =
                customHeaders(JsonField.of(customHeaders))

            /**
             * Sets [Builder.customHeaders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customHeaders] with a well-typed
             * `List<CustomSipHeader>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun customHeaders(customHeaders: JsonField<List<CustomSipHeader>>) = apply {
                this.customHeaders = customHeaders.map { it.toMutableList() }
            }

            /**
             * Adds a single [CustomSipHeader] to [customHeaders].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCustomHeader(customHeader: CustomSipHeader) = apply {
                customHeaders =
                    (customHeaders ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customHeaders", it).add(customHeader)
                    }
            }

            fun dialogflowConfig(dialogflowConfig: DialogflowConfig) =
                dialogflowConfig(JsonField.of(dialogflowConfig))

            /**
             * Sets [Builder.dialogflowConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dialogflowConfig] with a well-typed
             * [DialogflowConfig] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun dialogflowConfig(dialogflowConfig: JsonField<DialogflowConfig>) = apply {
                this.dialogflowConfig = dialogflowConfig
            }

            /** Enables Dialogflow for the current call. The default value is false. */
            fun enableDialogflow(enableDialogflow: Boolean) =
                enableDialogflow(JsonField.of(enableDialogflow))

            /**
             * Sets [Builder.enableDialogflow] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enableDialogflow] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enableDialogflow(enableDialogflow: JsonField<Boolean>) = apply {
                this.enableDialogflow = enableDialogflow
            }

            /**
             * The `from_display_name` string to be used as the caller id name (SIP From Display
             * Name) presented to the destination (`to` number). The string should have a maximum of
             * 128 characters, containing only letters, numbers, spaces, and -_~!.+ special
             * characters. If ommited, the display name will be the same as the number in the `from`
             * field.
             */
            fun fromDisplayName(fromDisplayName: String) =
                fromDisplayName(JsonField.of(fromDisplayName))

            /**
             * Sets [Builder.fromDisplayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromDisplayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fromDisplayName(fromDisplayName: JsonField<String>) = apply {
                this.fromDisplayName = fromDisplayName
            }

            /** Use another call's control id for sharing the same call session id */
            fun linkTo(linkTo: String) = linkTo(JsonField.of(linkTo))

            /**
             * Sets [Builder.linkTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkTo] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkTo(linkTo: JsonField<String>) = apply { this.linkTo = linkTo }

            /** Defines whether media should be encrypted on the call. */
            fun mediaEncryption(mediaEncryption: MediaEncryption) =
                mediaEncryption(JsonField.of(mediaEncryption))

            /**
             * Sets [Builder.mediaEncryption] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mediaEncryption] with a well-typed [MediaEncryption]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mediaEncryption(mediaEncryption: JsonField<MediaEncryption>) = apply {
                this.mediaEncryption = mediaEncryption
            }

            /**
             * The media_name of a file to be played back to the callee when the call is answered.
             * The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by
             * the same user/organization. The file must either be a WAV or MP3 file.
             */
            fun mediaName(mediaName: String) = mediaName(JsonField.of(mediaName))

            /**
             * Sets [Builder.mediaName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mediaName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaName(mediaName: JsonField<String>) = apply { this.mediaName = mediaName }

            /**
             * If supplied with the value `self`, the current leg will be parked after unbridge. If
             * not set, the default behavior is to hang up the leg. When park_after_unbridge is set,
             * link_to becomes required.
             */
            fun parkAfterUnbridge(parkAfterUnbridge: String) =
                parkAfterUnbridge(JsonField.of(parkAfterUnbridge))

            /**
             * Sets [Builder.parkAfterUnbridge] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parkAfterUnbridge] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parkAfterUnbridge(parkAfterUnbridge: JsonField<String>) = apply {
                this.parkAfterUnbridge = parkAfterUnbridge
            }

            /**
             * The list of comma-separated codecs in a preferred order for the forked media to be
             * received.
             */
            fun preferredCodecs(preferredCodecs: String) =
                preferredCodecs(JsonField.of(preferredCodecs))

            /**
             * Sets [Builder.preferredCodecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preferredCodecs] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preferredCodecs(preferredCodecs: JsonField<String>) = apply {
                this.preferredCodecs = preferredCodecs
            }

            /** Start recording automatically after an event. Disabled by default. */
            fun record(record: Record) = record(JsonField.of(record))

            /**
             * Sets [Builder.record] to an arbitrary JSON value.
             *
             * You should usually call [Builder.record] with a well-typed [Record] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun record(record: JsonField<Record>) = apply { this.record = record }

            /**
             * Defines which channel should be recorded ('single' or 'dual') when `record` is
             * specified.
             */
            fun recordChannels(recordChannels: RecordChannels) =
                recordChannels(JsonField.of(recordChannels))

            /**
             * Sets [Builder.recordChannels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordChannels] with a well-typed [RecordChannels]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recordChannels(recordChannels: JsonField<RecordChannels>) = apply {
                this.recordChannels = recordChannels
            }

            /**
             * The custom recording file name to be used instead of the default `call_leg_id`.
             * Telnyx will still add a Unix timestamp suffix.
             */
            fun recordCustomFileName(recordCustomFileName: String) =
                recordCustomFileName(JsonField.of(recordCustomFileName))

            /**
             * Sets [Builder.recordCustomFileName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordCustomFileName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recordCustomFileName(recordCustomFileName: JsonField<String>) = apply {
                this.recordCustomFileName = recordCustomFileName
            }

            /** Defines the format of the recording ('wav' or 'mp3') when `record` is specified. */
            fun recordFormat(recordFormat: RecordFormat) = recordFormat(JsonField.of(recordFormat))

            /**
             * Sets [Builder.recordFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordFormat] with a well-typed [RecordFormat] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordFormat(recordFormat: JsonField<RecordFormat>) = apply {
                this.recordFormat = recordFormat
            }

            /**
             * Defines the maximum length for the recording in seconds when `record` is specified.
             * The minimum value is 0. The maximum value is 43200. The default value is 0
             * (infinite).
             */
            fun recordMaxLength(recordMaxLength: Int) =
                recordMaxLength(JsonField.of(recordMaxLength))

            /**
             * Sets [Builder.recordMaxLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordMaxLength] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordMaxLength(recordMaxLength: JsonField<Int>) = apply {
                this.recordMaxLength = recordMaxLength
            }

            /**
             * The number of seconds that Telnyx will wait for the recording to be stopped if
             * silence is detected when `record` is specified. The timer only starts when the speech
             * is detected. Please note that call transcription is used to detect silence and the
             * related charge will be applied. The minimum value is 0. The default value is 0
             * (infinite).
             */
            fun recordTimeoutSecs(recordTimeoutSecs: Int) =
                recordTimeoutSecs(JsonField.of(recordTimeoutSecs))

            /**
             * Sets [Builder.recordTimeoutSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordTimeoutSecs] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordTimeoutSecs(recordTimeoutSecs: JsonField<Int>) = apply {
                this.recordTimeoutSecs = recordTimeoutSecs
            }

            /**
             * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If
             * only single track is specified (`inbound`, `outbound`), `channels` configuration is
             * ignored and it will be recorded as mono (single channel).
             */
            fun recordTrack(recordTrack: RecordTrack) = recordTrack(JsonField.of(recordTrack))

            /**
             * Sets [Builder.recordTrack] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordTrack] with a well-typed [RecordTrack] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordTrack(recordTrack: JsonField<RecordTrack>) = apply {
                this.recordTrack = recordTrack
            }

            /**
             * When set to `trim-silence`, silence will be removed from the beginning and end of the
             * recording.
             */
            fun recordTrim(recordTrim: RecordTrim) = recordTrim(JsonField.of(recordTrim))

            /**
             * Sets [Builder.recordTrim] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordTrim] with a well-typed [RecordTrim] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordTrim(recordTrim: JsonField<RecordTrim>) = apply {
                this.recordTrim = recordTrim
            }

            /** Generate silence RTP packets when no transmission available. */
            fun sendSilenceWhenIdle(sendSilenceWhenIdle: Boolean) =
                sendSilenceWhenIdle(JsonField.of(sendSilenceWhenIdle))

            /**
             * Sets [Builder.sendSilenceWhenIdle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendSilenceWhenIdle] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sendSilenceWhenIdle(sendSilenceWhenIdle: JsonField<Boolean>) = apply {
                this.sendSilenceWhenIdle = sendSilenceWhenIdle
            }

            /** SIP Authentication password used for SIP challenges. */
            fun sipAuthPassword(sipAuthPassword: String) =
                sipAuthPassword(JsonField.of(sipAuthPassword))

            /**
             * Sets [Builder.sipAuthPassword] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipAuthPassword] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sipAuthPassword(sipAuthPassword: JsonField<String>) = apply {
                this.sipAuthPassword = sipAuthPassword
            }

            /** SIP Authentication username used for SIP challenges. */
            fun sipAuthUsername(sipAuthUsername: String) =
                sipAuthUsername(JsonField.of(sipAuthUsername))

            /**
             * Sets [Builder.sipAuthUsername] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipAuthUsername] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sipAuthUsername(sipAuthUsername: JsonField<String>) = apply {
                this.sipAuthUsername = sipAuthUsername
            }

            /**
             * SIP headers to be added to the SIP INVITE request. Currently only User-to-User header
             * is supported.
             */
            fun sipHeaders(sipHeaders: List<SipHeader>) = sipHeaders(JsonField.of(sipHeaders))

            /**
             * Sets [Builder.sipHeaders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipHeaders] with a well-typed `List<SipHeader>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sipHeaders(sipHeaders: JsonField<List<SipHeader>>) = apply {
                this.sipHeaders = sipHeaders.map { it.toMutableList() }
            }

            /**
             * Adds a single [SipHeader] to [sipHeaders].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSipHeader(sipHeader: SipHeader) = apply {
                sipHeaders =
                    (sipHeaders ?: JsonField.of(mutableListOf())).also {
                        checkKnown("sipHeaders", it).add(sipHeader)
                    }
            }

            /** Defines SIP transport protocol to be used on the call. */
            fun sipTransportProtocol(sipTransportProtocol: SipTransportProtocol) =
                sipTransportProtocol(JsonField.of(sipTransportProtocol))

            /**
             * Sets [Builder.sipTransportProtocol] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipTransportProtocol] with a well-typed
             * [SipTransportProtocol] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun sipTransportProtocol(sipTransportProtocol: JsonField<SipTransportProtocol>) =
                apply {
                    this.sipTransportProtocol = sipTransportProtocol
                }

            /** Use this field to modify sound effects, for example adjust the pitch. */
            fun soundModifications(soundModifications: SoundModifications) =
                soundModifications(JsonField.of(soundModifications))

            /**
             * Sets [Builder.soundModifications] to an arbitrary JSON value.
             *
             * You should usually call [Builder.soundModifications] with a well-typed
             * [SoundModifications] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun soundModifications(soundModifications: JsonField<SoundModifications>) = apply {
                this.soundModifications = soundModifications
            }

            /**
             * Indicates codec for bidirectional streaming RTP payloads. Used only with
             * stream_bidirectional_mode=rtp. Case sensitive.
             */
            fun streamBidirectionalCodec(streamBidirectionalCodec: StreamBidirectionalCodec) =
                streamBidirectionalCodec(JsonField.of(streamBidirectionalCodec))

            /**
             * Sets [Builder.streamBidirectionalCodec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamBidirectionalCodec] with a well-typed
             * [StreamBidirectionalCodec] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun streamBidirectionalCodec(
                streamBidirectionalCodec: JsonField<StreamBidirectionalCodec>
            ) = apply { this.streamBidirectionalCodec = streamBidirectionalCodec }

            /** Configures method of bidirectional streaming (mp3, rtp). */
            fun streamBidirectionalMode(streamBidirectionalMode: StreamBidirectionalMode) =
                streamBidirectionalMode(JsonField.of(streamBidirectionalMode))

            /**
             * Sets [Builder.streamBidirectionalMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamBidirectionalMode] with a well-typed
             * [StreamBidirectionalMode] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun streamBidirectionalMode(
                streamBidirectionalMode: JsonField<StreamBidirectionalMode>
            ) = apply { this.streamBidirectionalMode = streamBidirectionalMode }

            /** Audio sampling rate. */
            fun streamBidirectionalSamplingRate(
                streamBidirectionalSamplingRate: StreamBidirectionalSamplingRate
            ) = streamBidirectionalSamplingRate(JsonField.of(streamBidirectionalSamplingRate))

            /**
             * Sets [Builder.streamBidirectionalSamplingRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamBidirectionalSamplingRate] with a well-typed
             * [StreamBidirectionalSamplingRate] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun streamBidirectionalSamplingRate(
                streamBidirectionalSamplingRate: JsonField<StreamBidirectionalSamplingRate>
            ) = apply { this.streamBidirectionalSamplingRate = streamBidirectionalSamplingRate }

            /** Specifies which call legs should receive the bidirectional stream audio. */
            fun streamBidirectionalTargetLegs(
                streamBidirectionalTargetLegs: StreamBidirectionalTargetLegs
            ) = streamBidirectionalTargetLegs(JsonField.of(streamBidirectionalTargetLegs))

            /**
             * Sets [Builder.streamBidirectionalTargetLegs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamBidirectionalTargetLegs] with a well-typed
             * [StreamBidirectionalTargetLegs] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun streamBidirectionalTargetLegs(
                streamBidirectionalTargetLegs: JsonField<StreamBidirectionalTargetLegs>
            ) = apply { this.streamBidirectionalTargetLegs = streamBidirectionalTargetLegs }

            /**
             * Specifies the codec to be used for the streamed audio. When set to 'default' or when
             * transcoding is not possible, the codec from the call will be used.
             */
            fun streamCodec(streamCodec: StreamCodec) = streamCodec(JsonField.of(streamCodec))

            /**
             * Sets [Builder.streamCodec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamCodec] with a well-typed [StreamCodec] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun streamCodec(streamCodec: JsonField<StreamCodec>) = apply {
                this.streamCodec = streamCodec
            }

            /**
             * Establish websocket connection before dialing the destination. This is useful for
             * cases where the websocket connection takes a long time to establish.
             */
            fun streamEstablishBeforeCallOriginate(streamEstablishBeforeCallOriginate: Boolean) =
                streamEstablishBeforeCallOriginate(JsonField.of(streamEstablishBeforeCallOriginate))

            /**
             * Sets [Builder.streamEstablishBeforeCallOriginate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamEstablishBeforeCallOriginate] with a
             * well-typed [Boolean] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun streamEstablishBeforeCallOriginate(
                streamEstablishBeforeCallOriginate: JsonField<Boolean>
            ) = apply {
                this.streamEstablishBeforeCallOriginate = streamEstablishBeforeCallOriginate
            }

            /** Specifies which track should be streamed. */
            fun streamTrack(streamTrack: StreamTrack) = streamTrack(JsonField.of(streamTrack))

            /**
             * Sets [Builder.streamTrack] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamTrack] with a well-typed [StreamTrack] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun streamTrack(streamTrack: JsonField<StreamTrack>) = apply {
                this.streamTrack = streamTrack
            }

            /** The destination WebSocket address where the stream is going to be delivered. */
            fun streamUrl(streamUrl: String) = streamUrl(JsonField.of(streamUrl))

            /**
             * Sets [Builder.streamUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun streamUrl(streamUrl: JsonField<String>) = apply { this.streamUrl = streamUrl }

            /** The call leg which will be supervised by the new call. */
            fun superviseCallControlId(superviseCallControlId: String) =
                superviseCallControlId(JsonField.of(superviseCallControlId))

            /**
             * Sets [Builder.superviseCallControlId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.superviseCallControlId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun superviseCallControlId(superviseCallControlId: JsonField<String>) = apply {
                this.superviseCallControlId = superviseCallControlId
            }

            /**
             * The role of the supervisor call. 'barge' means that supervisor call hears and is
             * being heard by both ends of the call (caller & callee). 'whisper' means that only
             * supervised_call_control_id hears supervisor but supervisor can hear everything.
             * 'monitor' means that nobody can hear supervisor call, but supervisor can hear
             * everything on the call.
             */
            fun supervisorRole(supervisorRole: SupervisorRole) =
                supervisorRole(JsonField.of(supervisorRole))

            /**
             * Sets [Builder.supervisorRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.supervisorRole] with a well-typed [SupervisorRole]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun supervisorRole(supervisorRole: JsonField<SupervisorRole>) = apply {
                this.supervisorRole = supervisorRole
            }

            /**
             * Sets the maximum duration of a Call Control Leg in seconds. If the time limit is
             * reached, the call will hangup and a `call.hangup` webhook with a `hangup_cause` of
             * `time_limit` will be sent. For example, by setting a time limit of 120 seconds, a
             * Call Leg will be automatically terminated two minutes after being answered. The
             * default time limit is 14400 seconds or 4 hours and this is also the maximum allowed
             * call length.
             */
            fun timeLimitSecs(timeLimitSecs: Int) = timeLimitSecs(JsonField.of(timeLimitSecs))

            /**
             * Sets [Builder.timeLimitSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeLimitSecs] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeLimitSecs(timeLimitSecs: JsonField<Int>) = apply {
                this.timeLimitSecs = timeLimitSecs
            }

            /**
             * The number of seconds that Telnyx will wait for the call to be answered by the
             * destination to which it is being called. If the timeout is reached before an answer
             * is received, the call will hangup and a `call.hangup` webhook with a `hangup_cause`
             * of `timeout` will be sent. Minimum value is 5 seconds. Maximum value is 600 seconds.
             */
            fun timeoutSecs(timeoutSecs: Int) = timeoutSecs(JsonField.of(timeoutSecs))

            /**
             * Sets [Builder.timeoutSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeoutSecs] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeoutSecs(timeoutSecs: JsonField<Int>) = apply { this.timeoutSecs = timeoutSecs }

            /** Enable transcription upon call answer. The default value is false. */
            fun transcription(transcription: Boolean) = transcription(JsonField.of(transcription))

            /**
             * Sets [Builder.transcription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcription] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transcription(transcription: JsonField<Boolean>) = apply {
                this.transcription = transcription
            }

            fun transcriptionConfig(transcriptionConfig: TranscriptionStartRequest) =
                transcriptionConfig(JsonField.of(transcriptionConfig))

            /**
             * Sets [Builder.transcriptionConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionConfig] with a well-typed
             * [TranscriptionStartRequest] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun transcriptionConfig(transcriptionConfig: JsonField<TranscriptionStartRequest>) =
                apply {
                    this.transcriptionConfig = transcriptionConfig
                }

            /**
             * Use this field to override the URL for which Telnyx will send subsequent webhooks to
             * for this call.
             */
            fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

            /** HTTP request type used for `webhook_url`. */
            fun webhookUrlMethod(webhookUrlMethod: WebhookUrlMethod) =
                webhookUrlMethod(JsonField.of(webhookUrlMethod))

            /**
             * Sets [Builder.webhookUrlMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrlMethod] with a well-typed
             * [WebhookUrlMethod] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun webhookUrlMethod(webhookUrlMethod: JsonField<WebhookUrlMethod>) = apply {
                this.webhookUrlMethod = webhookUrlMethod
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .connectionId()
             * .from()
             * .to()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("connectionId", connectionId),
                    checkRequired("from", from),
                    checkRequired("to", to),
                    answeringMachineDetection,
                    answeringMachineDetectionConfig,
                    audioUrl,
                    billingGroupId,
                    bridgeIntent,
                    bridgeOnAnswer,
                    clientState,
                    commandId,
                    conferenceConfig,
                    (customHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                    dialogflowConfig,
                    enableDialogflow,
                    fromDisplayName,
                    linkTo,
                    mediaEncryption,
                    mediaName,
                    parkAfterUnbridge,
                    preferredCodecs,
                    record,
                    recordChannels,
                    recordCustomFileName,
                    recordFormat,
                    recordMaxLength,
                    recordTimeoutSecs,
                    recordTrack,
                    recordTrim,
                    sendSilenceWhenIdle,
                    sipAuthPassword,
                    sipAuthUsername,
                    (sipHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                    sipTransportProtocol,
                    soundModifications,
                    streamBidirectionalCodec,
                    streamBidirectionalMode,
                    streamBidirectionalSamplingRate,
                    streamBidirectionalTargetLegs,
                    streamCodec,
                    streamEstablishBeforeCallOriginate,
                    streamTrack,
                    streamUrl,
                    superviseCallControlId,
                    supervisorRole,
                    timeLimitSecs,
                    timeoutSecs,
                    transcription,
                    transcriptionConfig,
                    webhookUrl,
                    webhookUrlMethod,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            connectionId()
            from()
            to().validate()
            answeringMachineDetection().ifPresent { it.validate() }
            answeringMachineDetectionConfig().ifPresent { it.validate() }
            audioUrl()
            billingGroupId()
            bridgeIntent()
            bridgeOnAnswer()
            clientState()
            commandId()
            conferenceConfig().ifPresent { it.validate() }
            customHeaders().ifPresent { it.forEach { it.validate() } }
            dialogflowConfig().ifPresent { it.validate() }
            enableDialogflow()
            fromDisplayName()
            linkTo()
            mediaEncryption().ifPresent { it.validate() }
            mediaName()
            parkAfterUnbridge()
            preferredCodecs()
            record().ifPresent { it.validate() }
            recordChannels().ifPresent { it.validate() }
            recordCustomFileName()
            recordFormat().ifPresent { it.validate() }
            recordMaxLength()
            recordTimeoutSecs()
            recordTrack().ifPresent { it.validate() }
            recordTrim().ifPresent { it.validate() }
            sendSilenceWhenIdle()
            sipAuthPassword()
            sipAuthUsername()
            sipHeaders().ifPresent { it.forEach { it.validate() } }
            sipTransportProtocol().ifPresent { it.validate() }
            soundModifications().ifPresent { it.validate() }
            streamBidirectionalCodec().ifPresent { it.validate() }
            streamBidirectionalMode().ifPresent { it.validate() }
            streamBidirectionalSamplingRate().ifPresent { it.validate() }
            streamBidirectionalTargetLegs().ifPresent { it.validate() }
            streamCodec().ifPresent { it.validate() }
            streamEstablishBeforeCallOriginate()
            streamTrack().ifPresent { it.validate() }
            streamUrl()
            superviseCallControlId()
            supervisorRole().ifPresent { it.validate() }
            timeLimitSecs()
            timeoutSecs()
            transcription()
            transcriptionConfig().ifPresent { it.validate() }
            webhookUrl()
            webhookUrlMethod().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (connectionId.asKnown().isPresent) 1 else 0) +
                (if (from.asKnown().isPresent) 1 else 0) +
                (to.asKnown().getOrNull()?.validity() ?: 0) +
                (answeringMachineDetection.asKnown().getOrNull()?.validity() ?: 0) +
                (answeringMachineDetectionConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (audioUrl.asKnown().isPresent) 1 else 0) +
                (if (billingGroupId.asKnown().isPresent) 1 else 0) +
                (if (bridgeIntent.asKnown().isPresent) 1 else 0) +
                (if (bridgeOnAnswer.asKnown().isPresent) 1 else 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (conferenceConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (customHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (dialogflowConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (enableDialogflow.asKnown().isPresent) 1 else 0) +
                (if (fromDisplayName.asKnown().isPresent) 1 else 0) +
                (if (linkTo.asKnown().isPresent) 1 else 0) +
                (mediaEncryption.asKnown().getOrNull()?.validity() ?: 0) +
                (if (mediaName.asKnown().isPresent) 1 else 0) +
                (if (parkAfterUnbridge.asKnown().isPresent) 1 else 0) +
                (if (preferredCodecs.asKnown().isPresent) 1 else 0) +
                (record.asKnown().getOrNull()?.validity() ?: 0) +
                (recordChannels.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordCustomFileName.asKnown().isPresent) 1 else 0) +
                (recordFormat.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordMaxLength.asKnown().isPresent) 1 else 0) +
                (if (recordTimeoutSecs.asKnown().isPresent) 1 else 0) +
                (recordTrack.asKnown().getOrNull()?.validity() ?: 0) +
                (recordTrim.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sendSilenceWhenIdle.asKnown().isPresent) 1 else 0) +
                (if (sipAuthPassword.asKnown().isPresent) 1 else 0) +
                (if (sipAuthUsername.asKnown().isPresent) 1 else 0) +
                (sipHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (sipTransportProtocol.asKnown().getOrNull()?.validity() ?: 0) +
                (soundModifications.asKnown().getOrNull()?.validity() ?: 0) +
                (streamBidirectionalCodec.asKnown().getOrNull()?.validity() ?: 0) +
                (streamBidirectionalMode.asKnown().getOrNull()?.validity() ?: 0) +
                (streamBidirectionalSamplingRate.asKnown().getOrNull()?.validity() ?: 0) +
                (streamBidirectionalTargetLegs.asKnown().getOrNull()?.validity() ?: 0) +
                (streamCodec.asKnown().getOrNull()?.validity() ?: 0) +
                (if (streamEstablishBeforeCallOriginate.asKnown().isPresent) 1 else 0) +
                (streamTrack.asKnown().getOrNull()?.validity() ?: 0) +
                (if (streamUrl.asKnown().isPresent) 1 else 0) +
                (if (superviseCallControlId.asKnown().isPresent) 1 else 0) +
                (supervisorRole.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timeLimitSecs.asKnown().isPresent) 1 else 0) +
                (if (timeoutSecs.asKnown().isPresent) 1 else 0) +
                (if (transcription.asKnown().isPresent) 1 else 0) +
                (transcriptionConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0) +
                (webhookUrlMethod.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                connectionId == other.connectionId &&
                from == other.from &&
                to == other.to &&
                answeringMachineDetection == other.answeringMachineDetection &&
                answeringMachineDetectionConfig == other.answeringMachineDetectionConfig &&
                audioUrl == other.audioUrl &&
                billingGroupId == other.billingGroupId &&
                bridgeIntent == other.bridgeIntent &&
                bridgeOnAnswer == other.bridgeOnAnswer &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                conferenceConfig == other.conferenceConfig &&
                customHeaders == other.customHeaders &&
                dialogflowConfig == other.dialogflowConfig &&
                enableDialogflow == other.enableDialogflow &&
                fromDisplayName == other.fromDisplayName &&
                linkTo == other.linkTo &&
                mediaEncryption == other.mediaEncryption &&
                mediaName == other.mediaName &&
                parkAfterUnbridge == other.parkAfterUnbridge &&
                preferredCodecs == other.preferredCodecs &&
                record == other.record &&
                recordChannels == other.recordChannels &&
                recordCustomFileName == other.recordCustomFileName &&
                recordFormat == other.recordFormat &&
                recordMaxLength == other.recordMaxLength &&
                recordTimeoutSecs == other.recordTimeoutSecs &&
                recordTrack == other.recordTrack &&
                recordTrim == other.recordTrim &&
                sendSilenceWhenIdle == other.sendSilenceWhenIdle &&
                sipAuthPassword == other.sipAuthPassword &&
                sipAuthUsername == other.sipAuthUsername &&
                sipHeaders == other.sipHeaders &&
                sipTransportProtocol == other.sipTransportProtocol &&
                soundModifications == other.soundModifications &&
                streamBidirectionalCodec == other.streamBidirectionalCodec &&
                streamBidirectionalMode == other.streamBidirectionalMode &&
                streamBidirectionalSamplingRate == other.streamBidirectionalSamplingRate &&
                streamBidirectionalTargetLegs == other.streamBidirectionalTargetLegs &&
                streamCodec == other.streamCodec &&
                streamEstablishBeforeCallOriginate == other.streamEstablishBeforeCallOriginate &&
                streamTrack == other.streamTrack &&
                streamUrl == other.streamUrl &&
                superviseCallControlId == other.superviseCallControlId &&
                supervisorRole == other.supervisorRole &&
                timeLimitSecs == other.timeLimitSecs &&
                timeoutSecs == other.timeoutSecs &&
                transcription == other.transcription &&
                transcriptionConfig == other.transcriptionConfig &&
                webhookUrl == other.webhookUrl &&
                webhookUrlMethod == other.webhookUrlMethod &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                connectionId,
                from,
                to,
                answeringMachineDetection,
                answeringMachineDetectionConfig,
                audioUrl,
                billingGroupId,
                bridgeIntent,
                bridgeOnAnswer,
                clientState,
                commandId,
                conferenceConfig,
                customHeaders,
                dialogflowConfig,
                enableDialogflow,
                fromDisplayName,
                linkTo,
                mediaEncryption,
                mediaName,
                parkAfterUnbridge,
                preferredCodecs,
                record,
                recordChannels,
                recordCustomFileName,
                recordFormat,
                recordMaxLength,
                recordTimeoutSecs,
                recordTrack,
                recordTrim,
                sendSilenceWhenIdle,
                sipAuthPassword,
                sipAuthUsername,
                sipHeaders,
                sipTransportProtocol,
                soundModifications,
                streamBidirectionalCodec,
                streamBidirectionalMode,
                streamBidirectionalSamplingRate,
                streamBidirectionalTargetLegs,
                streamCodec,
                streamEstablishBeforeCallOriginate,
                streamTrack,
                streamUrl,
                superviseCallControlId,
                supervisorRole,
                timeLimitSecs,
                timeoutSecs,
                transcription,
                transcriptionConfig,
                webhookUrl,
                webhookUrlMethod,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{connectionId=$connectionId, from=$from, to=$to, answeringMachineDetection=$answeringMachineDetection, answeringMachineDetectionConfig=$answeringMachineDetectionConfig, audioUrl=$audioUrl, billingGroupId=$billingGroupId, bridgeIntent=$bridgeIntent, bridgeOnAnswer=$bridgeOnAnswer, clientState=$clientState, commandId=$commandId, conferenceConfig=$conferenceConfig, customHeaders=$customHeaders, dialogflowConfig=$dialogflowConfig, enableDialogflow=$enableDialogflow, fromDisplayName=$fromDisplayName, linkTo=$linkTo, mediaEncryption=$mediaEncryption, mediaName=$mediaName, parkAfterUnbridge=$parkAfterUnbridge, preferredCodecs=$preferredCodecs, record=$record, recordChannels=$recordChannels, recordCustomFileName=$recordCustomFileName, recordFormat=$recordFormat, recordMaxLength=$recordMaxLength, recordTimeoutSecs=$recordTimeoutSecs, recordTrack=$recordTrack, recordTrim=$recordTrim, sendSilenceWhenIdle=$sendSilenceWhenIdle, sipAuthPassword=$sipAuthPassword, sipAuthUsername=$sipAuthUsername, sipHeaders=$sipHeaders, sipTransportProtocol=$sipTransportProtocol, soundModifications=$soundModifications, streamBidirectionalCodec=$streamBidirectionalCodec, streamBidirectionalMode=$streamBidirectionalMode, streamBidirectionalSamplingRate=$streamBidirectionalSamplingRate, streamBidirectionalTargetLegs=$streamBidirectionalTargetLegs, streamCodec=$streamCodec, streamEstablishBeforeCallOriginate=$streamEstablishBeforeCallOriginate, streamTrack=$streamTrack, streamUrl=$streamUrl, superviseCallControlId=$superviseCallControlId, supervisorRole=$supervisorRole, timeLimitSecs=$timeLimitSecs, timeoutSecs=$timeoutSecs, transcription=$transcription, transcriptionConfig=$transcriptionConfig, webhookUrl=$webhookUrl, webhookUrlMethod=$webhookUrlMethod, additionalProperties=$additionalProperties}"
    }

    /**
     * The DID or SIP URI to dial out to. Multiple DID or SIP URIs can be provided using an array of
     * strings
     */
    @JsonDeserialize(using = To.Deserializer::class)
    @JsonSerialize(using = To.Serializer::class)
    class To
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): To = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitStrings(strings: List<String>) {}
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitStrings(strings: List<String>) = strings.size

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is To && string == other.string && strings == other.strings
        }

        override fun hashCode(): Int = Objects.hash(string, strings)

        override fun toString(): String =
            when {
                string != null -> "To{string=$string}"
                strings != null -> "To{strings=$strings}"
                _json != null -> "To{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid To")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = To(string = string)

            @JvmStatic fun ofStrings(strings: List<String>) = To(strings = strings.toImmutable())
        }

        /** An interface that defines how to map each variant of [To] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            /**
             * Maps an unknown variant of [To] to a value of type [T].
             *
             * An instance of [To] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown To: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<To>(To::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): To {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                To(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                To(strings = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> To(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<To>(To::class) {

            override fun serialize(
                value: To,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid To")
                }
            }
        }
    }

    /**
     * Enables Answering Machine Detection. Telnyx offers Premium and Standard detections. With
     * Premium detection, when a call is answered, Telnyx runs real-time detection and sends a
     * `call.machine.premium.detection.ended` webhook with one of the following results:
     * `human_residence`, `human_business`, `machine`, `silence` or `fax_detected`. If we detect a
     * beep, we also send a `call.machine.premium.greeting.ended` webhook with the result of
     * `beep_detected`. If we detect a beep before `call.machine.premium.detection.ended` we only
     * send `call.machine.premium.greeting.ended`, and if we detect a beep after
     * `call.machine.premium.detection.ended`, we send both webhooks. With Standard detection, when
     * a call is answered, Telnyx runs real-time detection to determine if it was picked up by a
     * human or a machine and sends an `call.machine.detection.ended` webhook with the analysis
     * result. If `greeting_end` or `detect_words` is used and a `machine` is detected, you will
     * receive another `call.machine.greeting.ended` webhook when the answering machine greeting
     * ends with a beep or silence. If `detect_beep` is used, you will only receive
     * `call.machine.greeting.ended` if a beep is detected.
     */
    class AnsweringMachineDetection
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PREMIUM = of("premium")

            @JvmField val DETECT = of("detect")

            @JvmField val DETECT_BEEP = of("detect_beep")

            @JvmField val DETECT_WORDS = of("detect_words")

            @JvmField val GREETING_END = of("greeting_end")

            @JvmField val DISABLED = of("disabled")

            @JvmStatic fun of(value: String) = AnsweringMachineDetection(JsonField.of(value))
        }

        /** An enum containing [AnsweringMachineDetection]'s known values. */
        enum class Known {
            PREMIUM,
            DETECT,
            DETECT_BEEP,
            DETECT_WORDS,
            GREETING_END,
            DISABLED,
        }

        /**
         * An enum containing [AnsweringMachineDetection]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AnsweringMachineDetection] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PREMIUM,
            DETECT,
            DETECT_BEEP,
            DETECT_WORDS,
            GREETING_END,
            DISABLED,
            /**
             * An enum member indicating that [AnsweringMachineDetection] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PREMIUM -> Value.PREMIUM
                DETECT -> Value.DETECT
                DETECT_BEEP -> Value.DETECT_BEEP
                DETECT_WORDS -> Value.DETECT_WORDS
                GREETING_END -> Value.GREETING_END
                DISABLED -> Value.DISABLED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PREMIUM -> Known.PREMIUM
                DETECT -> Known.DETECT
                DETECT_BEEP -> Known.DETECT_BEEP
                DETECT_WORDS -> Known.DETECT_WORDS
                GREETING_END -> Known.GREETING_END
                DISABLED -> Known.DISABLED
                else ->
                    throw TelnyxInvalidDataException("Unknown AnsweringMachineDetection: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): AnsweringMachineDetection = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AnsweringMachineDetection && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Optional configuration parameters to modify 'answering_machine_detection' performance. */
    class AnsweringMachineDetectionConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val afterGreetingSilenceMillis: JsonField<Int>,
        private val betweenWordsSilenceMillis: JsonField<Int>,
        private val greetingDurationMillis: JsonField<Int>,
        private val greetingSilenceDurationMillis: JsonField<Int>,
        private val greetingTotalAnalysisTimeMillis: JsonField<Int>,
        private val initialSilenceMillis: JsonField<Int>,
        private val maximumNumberOfWords: JsonField<Int>,
        private val maximumWordLengthMillis: JsonField<Int>,
        private val silenceThreshold: JsonField<Int>,
        private val totalAnalysisTimeMillis: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("after_greeting_silence_millis")
            @ExcludeMissing
            afterGreetingSilenceMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("between_words_silence_millis")
            @ExcludeMissing
            betweenWordsSilenceMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("greeting_duration_millis")
            @ExcludeMissing
            greetingDurationMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("greeting_silence_duration_millis")
            @ExcludeMissing
            greetingSilenceDurationMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("greeting_total_analysis_time_millis")
            @ExcludeMissing
            greetingTotalAnalysisTimeMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("initial_silence_millis")
            @ExcludeMissing
            initialSilenceMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("maximum_number_of_words")
            @ExcludeMissing
            maximumNumberOfWords: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("maximum_word_length_millis")
            @ExcludeMissing
            maximumWordLengthMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("silence_threshold")
            @ExcludeMissing
            silenceThreshold: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("total_analysis_time_millis")
            @ExcludeMissing
            totalAnalysisTimeMillis: JsonField<Int> = JsonMissing.of(),
        ) : this(
            afterGreetingSilenceMillis,
            betweenWordsSilenceMillis,
            greetingDurationMillis,
            greetingSilenceDurationMillis,
            greetingTotalAnalysisTimeMillis,
            initialSilenceMillis,
            maximumNumberOfWords,
            maximumWordLengthMillis,
            silenceThreshold,
            totalAnalysisTimeMillis,
            mutableMapOf(),
        )

        /**
         * Silence duration threshold after a greeting message or voice for it be considered human.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun afterGreetingSilenceMillis(): Optional<Int> =
            afterGreetingSilenceMillis.getOptional("after_greeting_silence_millis")

        /**
         * Maximum threshold for silence between words.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun betweenWordsSilenceMillis(): Optional<Int> =
            betweenWordsSilenceMillis.getOptional("between_words_silence_millis")

        /**
         * Maximum threshold of a human greeting. If greeting longer than this value, considered
         * machine.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun greetingDurationMillis(): Optional<Int> =
            greetingDurationMillis.getOptional("greeting_duration_millis")

        /**
         * If machine already detected, maximum threshold for silence between words. If exceeded,
         * the greeting is considered ended.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun greetingSilenceDurationMillis(): Optional<Int> =
            greetingSilenceDurationMillis.getOptional("greeting_silence_duration_millis")

        /**
         * If machine already detected, maximum timeout threshold to determine the end of the
         * machine greeting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun greetingTotalAnalysisTimeMillis(): Optional<Int> =
            greetingTotalAnalysisTimeMillis.getOptional("greeting_total_analysis_time_millis")

        /**
         * If initial silence duration is greater than this value, consider it a machine.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun initialSilenceMillis(): Optional<Int> =
            initialSilenceMillis.getOptional("initial_silence_millis")

        /**
         * If number of detected words is greater than this value, consder it a machine.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximumNumberOfWords(): Optional<Int> =
            maximumNumberOfWords.getOptional("maximum_number_of_words")

        /**
         * If a single word lasts longer than this threshold, consider it a machine.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximumWordLengthMillis(): Optional<Int> =
            maximumWordLengthMillis.getOptional("maximum_word_length_millis")

        /**
         * Minimum noise threshold for any analysis.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun silenceThreshold(): Optional<Int> = silenceThreshold.getOptional("silence_threshold")

        /**
         * Maximum timeout threshold for overall detection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalAnalysisTimeMillis(): Optional<Int> =
            totalAnalysisTimeMillis.getOptional("total_analysis_time_millis")

        /**
         * Returns the raw JSON value of [afterGreetingSilenceMillis].
         *
         * Unlike [afterGreetingSilenceMillis], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("after_greeting_silence_millis")
        @ExcludeMissing
        fun _afterGreetingSilenceMillis(): JsonField<Int> = afterGreetingSilenceMillis

        /**
         * Returns the raw JSON value of [betweenWordsSilenceMillis].
         *
         * Unlike [betweenWordsSilenceMillis], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("between_words_silence_millis")
        @ExcludeMissing
        fun _betweenWordsSilenceMillis(): JsonField<Int> = betweenWordsSilenceMillis

        /**
         * Returns the raw JSON value of [greetingDurationMillis].
         *
         * Unlike [greetingDurationMillis], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("greeting_duration_millis")
        @ExcludeMissing
        fun _greetingDurationMillis(): JsonField<Int> = greetingDurationMillis

        /**
         * Returns the raw JSON value of [greetingSilenceDurationMillis].
         *
         * Unlike [greetingSilenceDurationMillis], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("greeting_silence_duration_millis")
        @ExcludeMissing
        fun _greetingSilenceDurationMillis(): JsonField<Int> = greetingSilenceDurationMillis

        /**
         * Returns the raw JSON value of [greetingTotalAnalysisTimeMillis].
         *
         * Unlike [greetingTotalAnalysisTimeMillis], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("greeting_total_analysis_time_millis")
        @ExcludeMissing
        fun _greetingTotalAnalysisTimeMillis(): JsonField<Int> = greetingTotalAnalysisTimeMillis

        /**
         * Returns the raw JSON value of [initialSilenceMillis].
         *
         * Unlike [initialSilenceMillis], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("initial_silence_millis")
        @ExcludeMissing
        fun _initialSilenceMillis(): JsonField<Int> = initialSilenceMillis

        /**
         * Returns the raw JSON value of [maximumNumberOfWords].
         *
         * Unlike [maximumNumberOfWords], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("maximum_number_of_words")
        @ExcludeMissing
        fun _maximumNumberOfWords(): JsonField<Int> = maximumNumberOfWords

        /**
         * Returns the raw JSON value of [maximumWordLengthMillis].
         *
         * Unlike [maximumWordLengthMillis], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("maximum_word_length_millis")
        @ExcludeMissing
        fun _maximumWordLengthMillis(): JsonField<Int> = maximumWordLengthMillis

        /**
         * Returns the raw JSON value of [silenceThreshold].
         *
         * Unlike [silenceThreshold], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("silence_threshold")
        @ExcludeMissing
        fun _silenceThreshold(): JsonField<Int> = silenceThreshold

        /**
         * Returns the raw JSON value of [totalAnalysisTimeMillis].
         *
         * Unlike [totalAnalysisTimeMillis], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("total_analysis_time_millis")
        @ExcludeMissing
        fun _totalAnalysisTimeMillis(): JsonField<Int> = totalAnalysisTimeMillis

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [AnsweringMachineDetectionConfig].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AnsweringMachineDetectionConfig]. */
        class Builder internal constructor() {

            private var afterGreetingSilenceMillis: JsonField<Int> = JsonMissing.of()
            private var betweenWordsSilenceMillis: JsonField<Int> = JsonMissing.of()
            private var greetingDurationMillis: JsonField<Int> = JsonMissing.of()
            private var greetingSilenceDurationMillis: JsonField<Int> = JsonMissing.of()
            private var greetingTotalAnalysisTimeMillis: JsonField<Int> = JsonMissing.of()
            private var initialSilenceMillis: JsonField<Int> = JsonMissing.of()
            private var maximumNumberOfWords: JsonField<Int> = JsonMissing.of()
            private var maximumWordLengthMillis: JsonField<Int> = JsonMissing.of()
            private var silenceThreshold: JsonField<Int> = JsonMissing.of()
            private var totalAnalysisTimeMillis: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(answeringMachineDetectionConfig: AnsweringMachineDetectionConfig) =
                apply {
                    afterGreetingSilenceMillis =
                        answeringMachineDetectionConfig.afterGreetingSilenceMillis
                    betweenWordsSilenceMillis =
                        answeringMachineDetectionConfig.betweenWordsSilenceMillis
                    greetingDurationMillis = answeringMachineDetectionConfig.greetingDurationMillis
                    greetingSilenceDurationMillis =
                        answeringMachineDetectionConfig.greetingSilenceDurationMillis
                    greetingTotalAnalysisTimeMillis =
                        answeringMachineDetectionConfig.greetingTotalAnalysisTimeMillis
                    initialSilenceMillis = answeringMachineDetectionConfig.initialSilenceMillis
                    maximumNumberOfWords = answeringMachineDetectionConfig.maximumNumberOfWords
                    maximumWordLengthMillis =
                        answeringMachineDetectionConfig.maximumWordLengthMillis
                    silenceThreshold = answeringMachineDetectionConfig.silenceThreshold
                    totalAnalysisTimeMillis =
                        answeringMachineDetectionConfig.totalAnalysisTimeMillis
                    additionalProperties =
                        answeringMachineDetectionConfig.additionalProperties.toMutableMap()
                }

            /**
             * Silence duration threshold after a greeting message or voice for it be considered
             * human.
             */
            fun afterGreetingSilenceMillis(afterGreetingSilenceMillis: Int) =
                afterGreetingSilenceMillis(JsonField.of(afterGreetingSilenceMillis))

            /**
             * Sets [Builder.afterGreetingSilenceMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.afterGreetingSilenceMillis] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun afterGreetingSilenceMillis(afterGreetingSilenceMillis: JsonField<Int>) = apply {
                this.afterGreetingSilenceMillis = afterGreetingSilenceMillis
            }

            /** Maximum threshold for silence between words. */
            fun betweenWordsSilenceMillis(betweenWordsSilenceMillis: Int) =
                betweenWordsSilenceMillis(JsonField.of(betweenWordsSilenceMillis))

            /**
             * Sets [Builder.betweenWordsSilenceMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.betweenWordsSilenceMillis] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun betweenWordsSilenceMillis(betweenWordsSilenceMillis: JsonField<Int>) = apply {
                this.betweenWordsSilenceMillis = betweenWordsSilenceMillis
            }

            /**
             * Maximum threshold of a human greeting. If greeting longer than this value, considered
             * machine.
             */
            fun greetingDurationMillis(greetingDurationMillis: Int) =
                greetingDurationMillis(JsonField.of(greetingDurationMillis))

            /**
             * Sets [Builder.greetingDurationMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.greetingDurationMillis] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun greetingDurationMillis(greetingDurationMillis: JsonField<Int>) = apply {
                this.greetingDurationMillis = greetingDurationMillis
            }

            /**
             * If machine already detected, maximum threshold for silence between words. If
             * exceeded, the greeting is considered ended.
             */
            fun greetingSilenceDurationMillis(greetingSilenceDurationMillis: Int) =
                greetingSilenceDurationMillis(JsonField.of(greetingSilenceDurationMillis))

            /**
             * Sets [Builder.greetingSilenceDurationMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.greetingSilenceDurationMillis] with a well-typed
             * [Int] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun greetingSilenceDurationMillis(greetingSilenceDurationMillis: JsonField<Int>) =
                apply {
                    this.greetingSilenceDurationMillis = greetingSilenceDurationMillis
                }

            /**
             * If machine already detected, maximum timeout threshold to determine the end of the
             * machine greeting.
             */
            fun greetingTotalAnalysisTimeMillis(greetingTotalAnalysisTimeMillis: Int) =
                greetingTotalAnalysisTimeMillis(JsonField.of(greetingTotalAnalysisTimeMillis))

            /**
             * Sets [Builder.greetingTotalAnalysisTimeMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.greetingTotalAnalysisTimeMillis] with a well-typed
             * [Int] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun greetingTotalAnalysisTimeMillis(greetingTotalAnalysisTimeMillis: JsonField<Int>) =
                apply {
                    this.greetingTotalAnalysisTimeMillis = greetingTotalAnalysisTimeMillis
                }

            /** If initial silence duration is greater than this value, consider it a machine. */
            fun initialSilenceMillis(initialSilenceMillis: Int) =
                initialSilenceMillis(JsonField.of(initialSilenceMillis))

            /**
             * Sets [Builder.initialSilenceMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initialSilenceMillis] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun initialSilenceMillis(initialSilenceMillis: JsonField<Int>) = apply {
                this.initialSilenceMillis = initialSilenceMillis
            }

            /** If number of detected words is greater than this value, consder it a machine. */
            fun maximumNumberOfWords(maximumNumberOfWords: Int) =
                maximumNumberOfWords(JsonField.of(maximumNumberOfWords))

            /**
             * Sets [Builder.maximumNumberOfWords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumNumberOfWords] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumNumberOfWords(maximumNumberOfWords: JsonField<Int>) = apply {
                this.maximumNumberOfWords = maximumNumberOfWords
            }

            /** If a single word lasts longer than this threshold, consider it a machine. */
            fun maximumWordLengthMillis(maximumWordLengthMillis: Int) =
                maximumWordLengthMillis(JsonField.of(maximumWordLengthMillis))

            /**
             * Sets [Builder.maximumWordLengthMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumWordLengthMillis] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun maximumWordLengthMillis(maximumWordLengthMillis: JsonField<Int>) = apply {
                this.maximumWordLengthMillis = maximumWordLengthMillis
            }

            /** Minimum noise threshold for any analysis. */
            fun silenceThreshold(silenceThreshold: Int) =
                silenceThreshold(JsonField.of(silenceThreshold))

            /**
             * Sets [Builder.silenceThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.silenceThreshold] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun silenceThreshold(silenceThreshold: JsonField<Int>) = apply {
                this.silenceThreshold = silenceThreshold
            }

            /** Maximum timeout threshold for overall detection. */
            fun totalAnalysisTimeMillis(totalAnalysisTimeMillis: Int) =
                totalAnalysisTimeMillis(JsonField.of(totalAnalysisTimeMillis))

            /**
             * Sets [Builder.totalAnalysisTimeMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalAnalysisTimeMillis] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun totalAnalysisTimeMillis(totalAnalysisTimeMillis: JsonField<Int>) = apply {
                this.totalAnalysisTimeMillis = totalAnalysisTimeMillis
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [AnsweringMachineDetectionConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AnsweringMachineDetectionConfig =
                AnsweringMachineDetectionConfig(
                    afterGreetingSilenceMillis,
                    betweenWordsSilenceMillis,
                    greetingDurationMillis,
                    greetingSilenceDurationMillis,
                    greetingTotalAnalysisTimeMillis,
                    initialSilenceMillis,
                    maximumNumberOfWords,
                    maximumWordLengthMillis,
                    silenceThreshold,
                    totalAnalysisTimeMillis,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AnsweringMachineDetectionConfig = apply {
            if (validated) {
                return@apply
            }

            afterGreetingSilenceMillis()
            betweenWordsSilenceMillis()
            greetingDurationMillis()
            greetingSilenceDurationMillis()
            greetingTotalAnalysisTimeMillis()
            initialSilenceMillis()
            maximumNumberOfWords()
            maximumWordLengthMillis()
            silenceThreshold()
            totalAnalysisTimeMillis()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (afterGreetingSilenceMillis.asKnown().isPresent) 1 else 0) +
                (if (betweenWordsSilenceMillis.asKnown().isPresent) 1 else 0) +
                (if (greetingDurationMillis.asKnown().isPresent) 1 else 0) +
                (if (greetingSilenceDurationMillis.asKnown().isPresent) 1 else 0) +
                (if (greetingTotalAnalysisTimeMillis.asKnown().isPresent) 1 else 0) +
                (if (initialSilenceMillis.asKnown().isPresent) 1 else 0) +
                (if (maximumNumberOfWords.asKnown().isPresent) 1 else 0) +
                (if (maximumWordLengthMillis.asKnown().isPresent) 1 else 0) +
                (if (silenceThreshold.asKnown().isPresent) 1 else 0) +
                (if (totalAnalysisTimeMillis.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AnsweringMachineDetectionConfig &&
                afterGreetingSilenceMillis == other.afterGreetingSilenceMillis &&
                betweenWordsSilenceMillis == other.betweenWordsSilenceMillis &&
                greetingDurationMillis == other.greetingDurationMillis &&
                greetingSilenceDurationMillis == other.greetingSilenceDurationMillis &&
                greetingTotalAnalysisTimeMillis == other.greetingTotalAnalysisTimeMillis &&
                initialSilenceMillis == other.initialSilenceMillis &&
                maximumNumberOfWords == other.maximumNumberOfWords &&
                maximumWordLengthMillis == other.maximumWordLengthMillis &&
                silenceThreshold == other.silenceThreshold &&
                totalAnalysisTimeMillis == other.totalAnalysisTimeMillis &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                afterGreetingSilenceMillis,
                betweenWordsSilenceMillis,
                greetingDurationMillis,
                greetingSilenceDurationMillis,
                greetingTotalAnalysisTimeMillis,
                initialSilenceMillis,
                maximumNumberOfWords,
                maximumWordLengthMillis,
                silenceThreshold,
                totalAnalysisTimeMillis,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AnsweringMachineDetectionConfig{afterGreetingSilenceMillis=$afterGreetingSilenceMillis, betweenWordsSilenceMillis=$betweenWordsSilenceMillis, greetingDurationMillis=$greetingDurationMillis, greetingSilenceDurationMillis=$greetingSilenceDurationMillis, greetingTotalAnalysisTimeMillis=$greetingTotalAnalysisTimeMillis, initialSilenceMillis=$initialSilenceMillis, maximumNumberOfWords=$maximumNumberOfWords, maximumWordLengthMillis=$maximumWordLengthMillis, silenceThreshold=$silenceThreshold, totalAnalysisTimeMillis=$totalAnalysisTimeMillis, additionalProperties=$additionalProperties}"
    }

    /** Optional configuration parameters to dial new participant into a conference. */
    class ConferenceConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val beepEnabled: JsonField<BeepEnabled>,
        private val conferenceName: JsonField<String>,
        private val earlyMedia: JsonField<Boolean>,
        private val endConferenceOnExit: JsonField<Boolean>,
        private val hold: JsonField<Boolean>,
        private val holdAudioUrl: JsonField<String>,
        private val holdMediaName: JsonField<String>,
        private val mute: JsonField<Boolean>,
        private val softEndConferenceOnExit: JsonField<Boolean>,
        private val startConferenceOnCreate: JsonField<Boolean>,
        private val startConferenceOnEnter: JsonField<Boolean>,
        private val supervisorRole: JsonField<SupervisorRole>,
        private val whisperCallControlIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("beep_enabled")
            @ExcludeMissing
            beepEnabled: JsonField<BeepEnabled> = JsonMissing.of(),
            @JsonProperty("conference_name")
            @ExcludeMissing
            conferenceName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("early_media")
            @ExcludeMissing
            earlyMedia: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("end_conference_on_exit")
            @ExcludeMissing
            endConferenceOnExit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hold") @ExcludeMissing hold: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hold_audio_url")
            @ExcludeMissing
            holdAudioUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hold_media_name")
            @ExcludeMissing
            holdMediaName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mute") @ExcludeMissing mute: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("soft_end_conference_on_exit")
            @ExcludeMissing
            softEndConferenceOnExit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("start_conference_on_create")
            @ExcludeMissing
            startConferenceOnCreate: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("start_conference_on_enter")
            @ExcludeMissing
            startConferenceOnEnter: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("supervisor_role")
            @ExcludeMissing
            supervisorRole: JsonField<SupervisorRole> = JsonMissing.of(),
            @JsonProperty("whisper_call_control_ids")
            @ExcludeMissing
            whisperCallControlIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            id,
            beepEnabled,
            conferenceName,
            earlyMedia,
            endConferenceOnExit,
            hold,
            holdAudioUrl,
            holdMediaName,
            mute,
            softEndConferenceOnExit,
            startConferenceOnCreate,
            startConferenceOnEnter,
            supervisorRole,
            whisperCallControlIds,
            mutableMapOf(),
        )

        /**
         * Conference ID to be joined
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Whether a beep sound should be played when the participant joins and/or leaves the
         * conference. Can be used to override the conference-level setting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun beepEnabled(): Optional<BeepEnabled> = beepEnabled.getOptional("beep_enabled")

        /**
         * Conference name to be joined
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conferenceName(): Optional<String> = conferenceName.getOptional("conference_name")

        /**
         * Controls the moment when dialled call is joined into conference. If set to `true` user
         * will be joined as soon as media is available (ringback). If `false` user will be joined
         * when call is answered. Defaults to `true`
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun earlyMedia(): Optional<Boolean> = earlyMedia.getOptional("early_media")

        /**
         * Whether the conference should end and all remaining participants be hung up after the
         * participant leaves the conference. Defaults to "false".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endConferenceOnExit(): Optional<Boolean> =
            endConferenceOnExit.getOptional("end_conference_on_exit")

        /**
         * Whether the participant should be put on hold immediately after joining the conference.
         * Defaults to "false".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hold(): Optional<Boolean> = hold.getOptional("hold")

        /**
         * The URL of a file to be played to the participant when they are put on hold after joining
         * the conference. hold_media_name and hold_audio_url cannot be used together in one
         * request. Takes effect only when "start_conference_on_create" is set to "false". This
         * property takes effect only if "hold" is set to "true".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun holdAudioUrl(): Optional<String> = holdAudioUrl.getOptional("hold_audio_url")

        /**
         * The media_name of a file to be played to the participant when they are put on hold after
         * joining the conference. The media_name must point to a file previously uploaded to
         * api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or
         * MP3 file. Takes effect only when "start_conference_on_create" is set to "false". This
         * property takes effect only if "hold" is set to "true".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun holdMediaName(): Optional<String> = holdMediaName.getOptional("hold_media_name")

        /**
         * Whether the participant should be muted immediately after joining the conference.
         * Defaults to "false".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mute(): Optional<Boolean> = mute.getOptional("mute")

        /**
         * Whether the conference should end after the participant leaves the conference. NOTE this
         * doesn't hang up the other participants. Defaults to "false".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun softEndConferenceOnExit(): Optional<Boolean> =
            softEndConferenceOnExit.getOptional("soft_end_conference_on_exit")

        /**
         * Whether the conference should be started on creation. If the conference isn't started all
         * participants that join are automatically put on hold. Defaults to "true".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startConferenceOnCreate(): Optional<Boolean> =
            startConferenceOnCreate.getOptional("start_conference_on_create")

        /**
         * Whether the conference should be started after the participant joins the conference.
         * Defaults to "false".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startConferenceOnEnter(): Optional<Boolean> =
            startConferenceOnEnter.getOptional("start_conference_on_enter")

        /**
         * Sets the joining participant as a supervisor for the conference. A conference can have
         * multiple supervisors. "barge" means the supervisor enters the conference as a normal
         * participant. This is the same as "none". "monitor" means the supervisor is muted but can
         * hear all participants. "whisper" means that only the specified "whisper_call_control_ids"
         * can hear the supervisor. Defaults to "none".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun supervisorRole(): Optional<SupervisorRole> =
            supervisorRole.getOptional("supervisor_role")

        /**
         * Array of unique call_control_ids the joining supervisor can whisper to. If none provided,
         * the supervisor will join the conference as a monitoring participant only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun whisperCallControlIds(): Optional<List<String>> =
            whisperCallControlIds.getOptional("whisper_call_control_ids")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [beepEnabled].
         *
         * Unlike [beepEnabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beep_enabled")
        @ExcludeMissing
        fun _beepEnabled(): JsonField<BeepEnabled> = beepEnabled

        /**
         * Returns the raw JSON value of [conferenceName].
         *
         * Unlike [conferenceName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("conference_name")
        @ExcludeMissing
        fun _conferenceName(): JsonField<String> = conferenceName

        /**
         * Returns the raw JSON value of [earlyMedia].
         *
         * Unlike [earlyMedia], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("early_media")
        @ExcludeMissing
        fun _earlyMedia(): JsonField<Boolean> = earlyMedia

        /**
         * Returns the raw JSON value of [endConferenceOnExit].
         *
         * Unlike [endConferenceOnExit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("end_conference_on_exit")
        @ExcludeMissing
        fun _endConferenceOnExit(): JsonField<Boolean> = endConferenceOnExit

        /**
         * Returns the raw JSON value of [hold].
         *
         * Unlike [hold], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hold") @ExcludeMissing fun _hold(): JsonField<Boolean> = hold

        /**
         * Returns the raw JSON value of [holdAudioUrl].
         *
         * Unlike [holdAudioUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hold_audio_url")
        @ExcludeMissing
        fun _holdAudioUrl(): JsonField<String> = holdAudioUrl

        /**
         * Returns the raw JSON value of [holdMediaName].
         *
         * Unlike [holdMediaName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hold_media_name")
        @ExcludeMissing
        fun _holdMediaName(): JsonField<String> = holdMediaName

        /**
         * Returns the raw JSON value of [mute].
         *
         * Unlike [mute], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mute") @ExcludeMissing fun _mute(): JsonField<Boolean> = mute

        /**
         * Returns the raw JSON value of [softEndConferenceOnExit].
         *
         * Unlike [softEndConferenceOnExit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("soft_end_conference_on_exit")
        @ExcludeMissing
        fun _softEndConferenceOnExit(): JsonField<Boolean> = softEndConferenceOnExit

        /**
         * Returns the raw JSON value of [startConferenceOnCreate].
         *
         * Unlike [startConferenceOnCreate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("start_conference_on_create")
        @ExcludeMissing
        fun _startConferenceOnCreate(): JsonField<Boolean> = startConferenceOnCreate

        /**
         * Returns the raw JSON value of [startConferenceOnEnter].
         *
         * Unlike [startConferenceOnEnter], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("start_conference_on_enter")
        @ExcludeMissing
        fun _startConferenceOnEnter(): JsonField<Boolean> = startConferenceOnEnter

        /**
         * Returns the raw JSON value of [supervisorRole].
         *
         * Unlike [supervisorRole], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("supervisor_role")
        @ExcludeMissing
        fun _supervisorRole(): JsonField<SupervisorRole> = supervisorRole

        /**
         * Returns the raw JSON value of [whisperCallControlIds].
         *
         * Unlike [whisperCallControlIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("whisper_call_control_ids")
        @ExcludeMissing
        fun _whisperCallControlIds(): JsonField<List<String>> = whisperCallControlIds

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ConferenceConfig]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConferenceConfig]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var beepEnabled: JsonField<BeepEnabled> = JsonMissing.of()
            private var conferenceName: JsonField<String> = JsonMissing.of()
            private var earlyMedia: JsonField<Boolean> = JsonMissing.of()
            private var endConferenceOnExit: JsonField<Boolean> = JsonMissing.of()
            private var hold: JsonField<Boolean> = JsonMissing.of()
            private var holdAudioUrl: JsonField<String> = JsonMissing.of()
            private var holdMediaName: JsonField<String> = JsonMissing.of()
            private var mute: JsonField<Boolean> = JsonMissing.of()
            private var softEndConferenceOnExit: JsonField<Boolean> = JsonMissing.of()
            private var startConferenceOnCreate: JsonField<Boolean> = JsonMissing.of()
            private var startConferenceOnEnter: JsonField<Boolean> = JsonMissing.of()
            private var supervisorRole: JsonField<SupervisorRole> = JsonMissing.of()
            private var whisperCallControlIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(conferenceConfig: ConferenceConfig) = apply {
                id = conferenceConfig.id
                beepEnabled = conferenceConfig.beepEnabled
                conferenceName = conferenceConfig.conferenceName
                earlyMedia = conferenceConfig.earlyMedia
                endConferenceOnExit = conferenceConfig.endConferenceOnExit
                hold = conferenceConfig.hold
                holdAudioUrl = conferenceConfig.holdAudioUrl
                holdMediaName = conferenceConfig.holdMediaName
                mute = conferenceConfig.mute
                softEndConferenceOnExit = conferenceConfig.softEndConferenceOnExit
                startConferenceOnCreate = conferenceConfig.startConferenceOnCreate
                startConferenceOnEnter = conferenceConfig.startConferenceOnEnter
                supervisorRole = conferenceConfig.supervisorRole
                whisperCallControlIds =
                    conferenceConfig.whisperCallControlIds.map { it.toMutableList() }
                additionalProperties = conferenceConfig.additionalProperties.toMutableMap()
            }

            /** Conference ID to be joined */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Whether a beep sound should be played when the participant joins and/or leaves the
             * conference. Can be used to override the conference-level setting.
             */
            fun beepEnabled(beepEnabled: BeepEnabled) = beepEnabled(JsonField.of(beepEnabled))

            /**
             * Sets [Builder.beepEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beepEnabled] with a well-typed [BeepEnabled] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beepEnabled(beepEnabled: JsonField<BeepEnabled>) = apply {
                this.beepEnabled = beepEnabled
            }

            /** Conference name to be joined */
            fun conferenceName(conferenceName: String) =
                conferenceName(JsonField.of(conferenceName))

            /**
             * Sets [Builder.conferenceName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conferenceName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun conferenceName(conferenceName: JsonField<String>) = apply {
                this.conferenceName = conferenceName
            }

            /**
             * Controls the moment when dialled call is joined into conference. If set to `true`
             * user will be joined as soon as media is available (ringback). If `false` user will be
             * joined when call is answered. Defaults to `true`
             */
            fun earlyMedia(earlyMedia: Boolean) = earlyMedia(JsonField.of(earlyMedia))

            /**
             * Sets [Builder.earlyMedia] to an arbitrary JSON value.
             *
             * You should usually call [Builder.earlyMedia] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun earlyMedia(earlyMedia: JsonField<Boolean>) = apply { this.earlyMedia = earlyMedia }

            /**
             * Whether the conference should end and all remaining participants be hung up after the
             * participant leaves the conference. Defaults to "false".
             */
            fun endConferenceOnExit(endConferenceOnExit: Boolean) =
                endConferenceOnExit(JsonField.of(endConferenceOnExit))

            /**
             * Sets [Builder.endConferenceOnExit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endConferenceOnExit] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endConferenceOnExit(endConferenceOnExit: JsonField<Boolean>) = apply {
                this.endConferenceOnExit = endConferenceOnExit
            }

            /**
             * Whether the participant should be put on hold immediately after joining the
             * conference. Defaults to "false".
             */
            fun hold(hold: Boolean) = hold(JsonField.of(hold))

            /**
             * Sets [Builder.hold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hold] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hold(hold: JsonField<Boolean>) = apply { this.hold = hold }

            /**
             * The URL of a file to be played to the participant when they are put on hold after
             * joining the conference. hold_media_name and hold_audio_url cannot be used together in
             * one request. Takes effect only when "start_conference_on_create" is set to "false".
             * This property takes effect only if "hold" is set to "true".
             */
            fun holdAudioUrl(holdAudioUrl: String) = holdAudioUrl(JsonField.of(holdAudioUrl))

            /**
             * Sets [Builder.holdAudioUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.holdAudioUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun holdAudioUrl(holdAudioUrl: JsonField<String>) = apply {
                this.holdAudioUrl = holdAudioUrl
            }

            /**
             * The media_name of a file to be played to the participant when they are put on hold
             * after joining the conference. The media_name must point to a file previously uploaded
             * to api.telnyx.com/v2/media by the same user/organization. The file must either be a
             * WAV or MP3 file. Takes effect only when "start_conference_on_create" is set to
             * "false". This property takes effect only if "hold" is set to "true".
             */
            fun holdMediaName(holdMediaName: String) = holdMediaName(JsonField.of(holdMediaName))

            /**
             * Sets [Builder.holdMediaName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.holdMediaName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun holdMediaName(holdMediaName: JsonField<String>) = apply {
                this.holdMediaName = holdMediaName
            }

            /**
             * Whether the participant should be muted immediately after joining the conference.
             * Defaults to "false".
             */
            fun mute(mute: Boolean) = mute(JsonField.of(mute))

            /**
             * Sets [Builder.mute] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mute] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mute(mute: JsonField<Boolean>) = apply { this.mute = mute }

            /**
             * Whether the conference should end after the participant leaves the conference. NOTE
             * this doesn't hang up the other participants. Defaults to "false".
             */
            fun softEndConferenceOnExit(softEndConferenceOnExit: Boolean) =
                softEndConferenceOnExit(JsonField.of(softEndConferenceOnExit))

            /**
             * Sets [Builder.softEndConferenceOnExit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.softEndConferenceOnExit] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun softEndConferenceOnExit(softEndConferenceOnExit: JsonField<Boolean>) = apply {
                this.softEndConferenceOnExit = softEndConferenceOnExit
            }

            /**
             * Whether the conference should be started on creation. If the conference isn't started
             * all participants that join are automatically put on hold. Defaults to "true".
             */
            fun startConferenceOnCreate(startConferenceOnCreate: Boolean) =
                startConferenceOnCreate(JsonField.of(startConferenceOnCreate))

            /**
             * Sets [Builder.startConferenceOnCreate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startConferenceOnCreate] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun startConferenceOnCreate(startConferenceOnCreate: JsonField<Boolean>) = apply {
                this.startConferenceOnCreate = startConferenceOnCreate
            }

            /**
             * Whether the conference should be started after the participant joins the conference.
             * Defaults to "false".
             */
            fun startConferenceOnEnter(startConferenceOnEnter: Boolean) =
                startConferenceOnEnter(JsonField.of(startConferenceOnEnter))

            /**
             * Sets [Builder.startConferenceOnEnter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startConferenceOnEnter] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun startConferenceOnEnter(startConferenceOnEnter: JsonField<Boolean>) = apply {
                this.startConferenceOnEnter = startConferenceOnEnter
            }

            /**
             * Sets the joining participant as a supervisor for the conference. A conference can
             * have multiple supervisors. "barge" means the supervisor enters the conference as a
             * normal participant. This is the same as "none". "monitor" means the supervisor is
             * muted but can hear all participants. "whisper" means that only the specified
             * "whisper_call_control_ids" can hear the supervisor. Defaults to "none".
             */
            fun supervisorRole(supervisorRole: SupervisorRole) =
                supervisorRole(JsonField.of(supervisorRole))

            /**
             * Sets [Builder.supervisorRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.supervisorRole] with a well-typed [SupervisorRole]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun supervisorRole(supervisorRole: JsonField<SupervisorRole>) = apply {
                this.supervisorRole = supervisorRole
            }

            /**
             * Array of unique call_control_ids the joining supervisor can whisper to. If none
             * provided, the supervisor will join the conference as a monitoring participant only.
             */
            fun whisperCallControlIds(whisperCallControlIds: List<String>) =
                whisperCallControlIds(JsonField.of(whisperCallControlIds))

            /**
             * Sets [Builder.whisperCallControlIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.whisperCallControlIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun whisperCallControlIds(whisperCallControlIds: JsonField<List<String>>) = apply {
                this.whisperCallControlIds = whisperCallControlIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [whisperCallControlIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWhisperCallControlId(whisperCallControlId: String) = apply {
                whisperCallControlIds =
                    (whisperCallControlIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("whisperCallControlIds", it).add(whisperCallControlId)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ConferenceConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ConferenceConfig =
                ConferenceConfig(
                    id,
                    beepEnabled,
                    conferenceName,
                    earlyMedia,
                    endConferenceOnExit,
                    hold,
                    holdAudioUrl,
                    holdMediaName,
                    mute,
                    softEndConferenceOnExit,
                    startConferenceOnCreate,
                    startConferenceOnEnter,
                    supervisorRole,
                    (whisperCallControlIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ConferenceConfig = apply {
            if (validated) {
                return@apply
            }

            id()
            beepEnabled().ifPresent { it.validate() }
            conferenceName()
            earlyMedia()
            endConferenceOnExit()
            hold()
            holdAudioUrl()
            holdMediaName()
            mute()
            softEndConferenceOnExit()
            startConferenceOnCreate()
            startConferenceOnEnter()
            supervisorRole().ifPresent { it.validate() }
            whisperCallControlIds()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (beepEnabled.asKnown().getOrNull()?.validity() ?: 0) +
                (if (conferenceName.asKnown().isPresent) 1 else 0) +
                (if (earlyMedia.asKnown().isPresent) 1 else 0) +
                (if (endConferenceOnExit.asKnown().isPresent) 1 else 0) +
                (if (hold.asKnown().isPresent) 1 else 0) +
                (if (holdAudioUrl.asKnown().isPresent) 1 else 0) +
                (if (holdMediaName.asKnown().isPresent) 1 else 0) +
                (if (mute.asKnown().isPresent) 1 else 0) +
                (if (softEndConferenceOnExit.asKnown().isPresent) 1 else 0) +
                (if (startConferenceOnCreate.asKnown().isPresent) 1 else 0) +
                (if (startConferenceOnEnter.asKnown().isPresent) 1 else 0) +
                (supervisorRole.asKnown().getOrNull()?.validity() ?: 0) +
                (whisperCallControlIds.asKnown().getOrNull()?.size ?: 0)

        /**
         * Whether a beep sound should be played when the participant joins and/or leaves the
         * conference. Can be used to override the conference-level setting.
         */
        class BeepEnabled @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ALWAYS = of("always")

                @JvmField val NEVER = of("never")

                @JvmField val ON_ENTER = of("on_enter")

                @JvmField val ON_EXIT = of("on_exit")

                @JvmStatic fun of(value: String) = BeepEnabled(JsonField.of(value))
            }

            /** An enum containing [BeepEnabled]'s known values. */
            enum class Known {
                ALWAYS,
                NEVER,
                ON_ENTER,
                ON_EXIT,
            }

            /**
             * An enum containing [BeepEnabled]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BeepEnabled] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ALWAYS,
                NEVER,
                ON_ENTER,
                ON_EXIT,
                /**
                 * An enum member indicating that [BeepEnabled] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ALWAYS -> Value.ALWAYS
                    NEVER -> Value.NEVER
                    ON_ENTER -> Value.ON_ENTER
                    ON_EXIT -> Value.ON_EXIT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ALWAYS -> Known.ALWAYS
                    NEVER -> Known.NEVER
                    ON_ENTER -> Known.ON_ENTER
                    ON_EXIT -> Known.ON_EXIT
                    else -> throw TelnyxInvalidDataException("Unknown BeepEnabled: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): BeepEnabled = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BeepEnabled && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Sets the joining participant as a supervisor for the conference. A conference can have
         * multiple supervisors. "barge" means the supervisor enters the conference as a normal
         * participant. This is the same as "none". "monitor" means the supervisor is muted but can
         * hear all participants. "whisper" means that only the specified "whisper_call_control_ids"
         * can hear the supervisor. Defaults to "none".
         */
        class SupervisorRole
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val BARGE = of("barge")

                @JvmField val MONITOR = of("monitor")

                @JvmField val NONE = of("none")

                @JvmField val WHISPER = of("whisper")

                @JvmStatic fun of(value: String) = SupervisorRole(JsonField.of(value))
            }

            /** An enum containing [SupervisorRole]'s known values. */
            enum class Known {
                BARGE,
                MONITOR,
                NONE,
                WHISPER,
            }

            /**
             * An enum containing [SupervisorRole]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [SupervisorRole] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BARGE,
                MONITOR,
                NONE,
                WHISPER,
                /**
                 * An enum member indicating that [SupervisorRole] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    BARGE -> Value.BARGE
                    MONITOR -> Value.MONITOR
                    NONE -> Value.NONE
                    WHISPER -> Value.WHISPER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    BARGE -> Known.BARGE
                    MONITOR -> Known.MONITOR
                    NONE -> Known.NONE
                    WHISPER -> Known.WHISPER
                    else -> throw TelnyxInvalidDataException("Unknown SupervisorRole: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): SupervisorRole = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SupervisorRole && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConferenceConfig &&
                id == other.id &&
                beepEnabled == other.beepEnabled &&
                conferenceName == other.conferenceName &&
                earlyMedia == other.earlyMedia &&
                endConferenceOnExit == other.endConferenceOnExit &&
                hold == other.hold &&
                holdAudioUrl == other.holdAudioUrl &&
                holdMediaName == other.holdMediaName &&
                mute == other.mute &&
                softEndConferenceOnExit == other.softEndConferenceOnExit &&
                startConferenceOnCreate == other.startConferenceOnCreate &&
                startConferenceOnEnter == other.startConferenceOnEnter &&
                supervisorRole == other.supervisorRole &&
                whisperCallControlIds == other.whisperCallControlIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                beepEnabled,
                conferenceName,
                earlyMedia,
                endConferenceOnExit,
                hold,
                holdAudioUrl,
                holdMediaName,
                mute,
                softEndConferenceOnExit,
                startConferenceOnCreate,
                startConferenceOnEnter,
                supervisorRole,
                whisperCallControlIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConferenceConfig{id=$id, beepEnabled=$beepEnabled, conferenceName=$conferenceName, earlyMedia=$earlyMedia, endConferenceOnExit=$endConferenceOnExit, hold=$hold, holdAudioUrl=$holdAudioUrl, holdMediaName=$holdMediaName, mute=$mute, softEndConferenceOnExit=$softEndConferenceOnExit, startConferenceOnCreate=$startConferenceOnCreate, startConferenceOnEnter=$startConferenceOnEnter, supervisorRole=$supervisorRole, whisperCallControlIds=$whisperCallControlIds, additionalProperties=$additionalProperties}"
    }

    /** Defines whether media should be encrypted on the call. */
    class MediaEncryption @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DISABLED = of("disabled")

            @JvmField val SRTP = of("SRTP")

            @JvmField val DTLS = of("DTLS")

            @JvmStatic fun of(value: String) = MediaEncryption(JsonField.of(value))
        }

        /** An enum containing [MediaEncryption]'s known values. */
        enum class Known {
            DISABLED,
            SRTP,
            DTLS,
        }

        /**
         * An enum containing [MediaEncryption]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MediaEncryption] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DISABLED,
            SRTP,
            DTLS,
            /**
             * An enum member indicating that [MediaEncryption] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DISABLED -> Value.DISABLED
                SRTP -> Value.SRTP
                DTLS -> Value.DTLS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                DISABLED -> Known.DISABLED
                SRTP -> Known.SRTP
                DTLS -> Known.DTLS
                else -> throw TelnyxInvalidDataException("Unknown MediaEncryption: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): MediaEncryption = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MediaEncryption && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Start recording automatically after an event. Disabled by default. */
    class Record @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val RECORD_FROM_ANSWER = of("record-from-answer")

            @JvmStatic fun of(value: String) = Record(JsonField.of(value))
        }

        /** An enum containing [Record]'s known values. */
        enum class Known {
            RECORD_FROM_ANSWER
        }

        /**
         * An enum containing [Record]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Record] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RECORD_FROM_ANSWER,
            /** An enum member indicating that [Record] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                RECORD_FROM_ANSWER -> Value.RECORD_FROM_ANSWER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                RECORD_FROM_ANSWER -> Known.RECORD_FROM_ANSWER
                else -> throw TelnyxInvalidDataException("Unknown Record: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Record = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Record && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Defines which channel should be recorded ('single' or 'dual') when `record` is specified. */
    class RecordChannels @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SINGLE = of("single")

            @JvmField val DUAL = of("dual")

            @JvmStatic fun of(value: String) = RecordChannels(JsonField.of(value))
        }

        /** An enum containing [RecordChannels]'s known values. */
        enum class Known {
            SINGLE,
            DUAL,
        }

        /**
         * An enum containing [RecordChannels]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordChannels] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SINGLE,
            DUAL,
            /**
             * An enum member indicating that [RecordChannels] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SINGLE -> Value.SINGLE
                DUAL -> Value.DUAL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SINGLE -> Known.SINGLE
                DUAL -> Known.DUAL
                else -> throw TelnyxInvalidDataException("Unknown RecordChannels: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): RecordChannels = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RecordChannels && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Defines the format of the recording ('wav' or 'mp3') when `record` is specified. */
    class RecordFormat @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val WAV = of("wav")

            @JvmField val MP3 = of("mp3")

            @JvmStatic fun of(value: String) = RecordFormat(JsonField.of(value))
        }

        /** An enum containing [RecordFormat]'s known values. */
        enum class Known {
            WAV,
            MP3,
        }

        /**
         * An enum containing [RecordFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WAV,
            MP3,
            /**
             * An enum member indicating that [RecordFormat] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                WAV -> Value.WAV
                MP3 -> Value.MP3
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                WAV -> Known.WAV
                MP3 -> Known.MP3
                else -> throw TelnyxInvalidDataException("Unknown RecordFormat: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): RecordFormat = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RecordFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If only single
     * track is specified (`inbound`, `outbound`), `channels` configuration is ignored and it will
     * be recorded as mono (single channel).
     */
    class RecordTrack @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BOTH = of("both")

            @JvmField val INBOUND = of("inbound")

            @JvmField val OUTBOUND = of("outbound")

            @JvmStatic fun of(value: String) = RecordTrack(JsonField.of(value))
        }

        /** An enum containing [RecordTrack]'s known values. */
        enum class Known {
            BOTH,
            INBOUND,
            OUTBOUND,
        }

        /**
         * An enum containing [RecordTrack]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordTrack] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BOTH,
            INBOUND,
            OUTBOUND,
            /**
             * An enum member indicating that [RecordTrack] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BOTH -> Value.BOTH
                INBOUND -> Value.INBOUND
                OUTBOUND -> Value.OUTBOUND
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BOTH -> Known.BOTH
                INBOUND -> Known.INBOUND
                OUTBOUND -> Known.OUTBOUND
                else -> throw TelnyxInvalidDataException("Unknown RecordTrack: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): RecordTrack = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RecordTrack && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * When set to `trim-silence`, silence will be removed from the beginning and end of the
     * recording.
     */
    class RecordTrim @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TRIM_SILENCE = of("trim-silence")

            @JvmStatic fun of(value: String) = RecordTrim(JsonField.of(value))
        }

        /** An enum containing [RecordTrim]'s known values. */
        enum class Known {
            TRIM_SILENCE
        }

        /**
         * An enum containing [RecordTrim]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordTrim] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRIM_SILENCE,
            /**
             * An enum member indicating that [RecordTrim] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TRIM_SILENCE -> Value.TRIM_SILENCE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TRIM_SILENCE -> Known.TRIM_SILENCE
                else -> throw TelnyxInvalidDataException("Unknown RecordTrim: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): RecordTrim = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RecordTrim && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Defines SIP transport protocol to be used on the call. */
    class SipTransportProtocol
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val UDP = of("UDP")

            @JvmField val TCP = of("TCP")

            @JvmField val TLS = of("TLS")

            @JvmStatic fun of(value: String) = SipTransportProtocol(JsonField.of(value))
        }

        /** An enum containing [SipTransportProtocol]'s known values. */
        enum class Known {
            UDP,
            TCP,
            TLS,
        }

        /**
         * An enum containing [SipTransportProtocol]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [SipTransportProtocol] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UDP,
            TCP,
            TLS,
            /**
             * An enum member indicating that [SipTransportProtocol] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                UDP -> Value.UDP
                TCP -> Value.TCP
                TLS -> Value.TLS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                UDP -> Known.UDP
                TCP -> Known.TCP
                TLS -> Known.TLS
                else -> throw TelnyxInvalidDataException("Unknown SipTransportProtocol: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): SipTransportProtocol = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SipTransportProtocol && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Audio sampling rate. */
    class StreamBidirectionalSamplingRate
    @JsonCreator
    private constructor(private val value: JsonField<Long>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

        companion object {

            @JvmField val _8000 = of(8000L)

            @JvmField val _16000 = of(16000L)

            @JvmField val _22050 = of(22050L)

            @JvmField val _24000 = of(24000L)

            @JvmField val _48000 = of(48000L)

            @JvmStatic fun of(value: Long) = StreamBidirectionalSamplingRate(JsonField.of(value))
        }

        /** An enum containing [StreamBidirectionalSamplingRate]'s known values. */
        enum class Known {
            _8000,
            _16000,
            _22050,
            _24000,
            _48000,
        }

        /**
         * An enum containing [StreamBidirectionalSamplingRate]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [StreamBidirectionalSamplingRate] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _8000,
            _16000,
            _22050,
            _24000,
            _48000,
            /**
             * An enum member indicating that [StreamBidirectionalSamplingRate] was instantiated
             * with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                _8000 -> Value._8000
                _16000 -> Value._16000
                _22050 -> Value._22050
                _24000 -> Value._24000
                _48000 -> Value._48000
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                _8000 -> Known._8000
                _16000 -> Known._16000
                _22050 -> Known._22050
                _24000 -> Known._24000
                _48000 -> Known._48000
                else ->
                    throw TelnyxInvalidDataException(
                        "Unknown StreamBidirectionalSamplingRate: $value"
                    )
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asLong(): Long =
            _value().asNumber().getOrNull()?.let {
                if (it.toDouble() % 1 == 0.0) it.toLong() else null
            } ?: throw TelnyxInvalidDataException("Value is not a Long")

        private var validated: Boolean = false

        fun validate(): StreamBidirectionalSamplingRate = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StreamBidirectionalSamplingRate && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Specifies which track should be streamed. */
    class StreamTrack @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INBOUND_TRACK = of("inbound_track")

            @JvmField val OUTBOUND_TRACK = of("outbound_track")

            @JvmField val BOTH_TRACKS = of("both_tracks")

            @JvmStatic fun of(value: String) = StreamTrack(JsonField.of(value))
        }

        /** An enum containing [StreamTrack]'s known values. */
        enum class Known {
            INBOUND_TRACK,
            OUTBOUND_TRACK,
            BOTH_TRACKS,
        }

        /**
         * An enum containing [StreamTrack]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [StreamTrack] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND_TRACK,
            OUTBOUND_TRACK,
            BOTH_TRACKS,
            /**
             * An enum member indicating that [StreamTrack] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                INBOUND_TRACK -> Value.INBOUND_TRACK
                OUTBOUND_TRACK -> Value.OUTBOUND_TRACK
                BOTH_TRACKS -> Value.BOTH_TRACKS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                INBOUND_TRACK -> Known.INBOUND_TRACK
                OUTBOUND_TRACK -> Known.OUTBOUND_TRACK
                BOTH_TRACKS -> Known.BOTH_TRACKS
                else -> throw TelnyxInvalidDataException("Unknown StreamTrack: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): StreamTrack = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StreamTrack && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The role of the supervisor call. 'barge' means that supervisor call hears and is being heard
     * by both ends of the call (caller & callee). 'whisper' means that only
     * supervised_call_control_id hears supervisor but supervisor can hear everything. 'monitor'
     * means that nobody can hear supervisor call, but supervisor can hear everything on the call.
     */
    class SupervisorRole @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BARGE = of("barge")

            @JvmField val WHISPER = of("whisper")

            @JvmField val MONITOR = of("monitor")

            @JvmStatic fun of(value: String) = SupervisorRole(JsonField.of(value))
        }

        /** An enum containing [SupervisorRole]'s known values. */
        enum class Known {
            BARGE,
            WHISPER,
            MONITOR,
        }

        /**
         * An enum containing [SupervisorRole]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SupervisorRole] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BARGE,
            WHISPER,
            MONITOR,
            /**
             * An enum member indicating that [SupervisorRole] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BARGE -> Value.BARGE
                WHISPER -> Value.WHISPER
                MONITOR -> Value.MONITOR
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BARGE -> Known.BARGE
                WHISPER -> Known.WHISPER
                MONITOR -> Known.MONITOR
                else -> throw TelnyxInvalidDataException("Unknown SupervisorRole: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): SupervisorRole = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SupervisorRole && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** HTTP request type used for `webhook_url`. */
    class WebhookUrlMethod @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val POST = of("POST")

            @JvmField val GET = of("GET")

            @JvmStatic fun of(value: String) = WebhookUrlMethod(JsonField.of(value))
        }

        /** An enum containing [WebhookUrlMethod]'s known values. */
        enum class Known {
            POST,
            GET,
        }

        /**
         * An enum containing [WebhookUrlMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WebhookUrlMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            POST,
            GET,
            /**
             * An enum member indicating that [WebhookUrlMethod] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                POST -> Value.POST
                GET -> Value.GET
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                POST -> Known.POST
                GET -> Known.GET
                else -> throw TelnyxInvalidDataException("Unknown WebhookUrlMethod: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): WebhookUrlMethod = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WebhookUrlMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallDialParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CallDialParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
