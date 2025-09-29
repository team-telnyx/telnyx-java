// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.conferences.participants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Dials a new conference participant */
class ParticipantParticipantsParams
private constructor(
    private val accountSid: String,
    private val conferenceSid: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountSid(): String = accountSid

    fun conferenceSid(): Optional<String> = Optional.ofNullable(conferenceSid)

    /**
     * The URL the result of answering machine detection will be sent to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amdStatusCallback(): Optional<String> = body.amdStatusCallback()

    /**
     * HTTP request type used for `AmdStatusCallback`. Defaults to `POST`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amdStatusCallbackMethod(): Optional<AmdStatusCallbackMethod> =
        body.amdStatusCallbackMethod()

    /**
     * Whether to play a notification beep to the conference when the participant enters and exits.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beep(): Optional<Beep> = body.beep()

    /**
     * To be used as the caller id name (SIP From Display Name) presented to the destination (`To`
     * number). The string should have a maximum of 128 characters, containing only letters,
     * numbers, spaces, and `-_~!.+` special characters. If ommited, the display name will be the
     * same as the number in the `From` field.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callerId(): Optional<String> = body.callerId()

    /**
     * The SID of the participant who is being coached. The participant being coached is the only
     * participant who can hear the participant who is coaching.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callSidToCoach(): Optional<String> = body.callSidToCoach()

    /**
     * Whether to cancel ongoing playback on `greeting ended` detection. Defaults to `true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancelPlaybackOnDetectMessageEnd(): Optional<Boolean> =
        body.cancelPlaybackOnDetectMessageEnd()

    /**
     * Whether to cancel ongoing playback on `machine` detection. Defaults to `true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancelPlaybackOnMachineDetection(): Optional<Boolean> =
        body.cancelPlaybackOnMachineDetection()

    /**
     * Whether the participant is coaching another call. When `true`, `CallSidToCoach` has to be
     * given.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun coaching(): Optional<Boolean> = body.coaching()

    /**
     * Whether to record the conference the participant is joining. Defualts to `do-not-record`. The
     * boolean values `true` and `false` are synonymous with `record-from-start` and `do-not-record`
     * respectively.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conferenceRecord(): Optional<ConferenceRecord> = body.conferenceRecord()

    /**
     * The URL the conference recording callbacks will be sent to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conferenceRecordingStatusCallback(): Optional<String> =
        body.conferenceRecordingStatusCallback()

    /**
     * The changes to the conference recording's state that should generate a call to
     * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate multiple
     * values with a space. Defaults to `completed`. `failed` and `absent` are synonymous.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conferenceRecordingStatusCallbackEvent(): Optional<String> =
        body.conferenceRecordingStatusCallbackEvent()

    /**
     * HTTP request type used for `ConferenceRecordingStatusCallback`. Defaults to `POST`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conferenceRecordingStatusCallbackMethod():
        Optional<ConferenceRecordingStatusCallbackMethod> =
        body.conferenceRecordingStatusCallbackMethod()

    /**
     * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
     * detected. The timer only starts when the speech is detected. Please note that the
     * transcription is used to detect silence and the related charge will be applied. The minimum
     * value is 0. The default value is 0 (infinite)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conferenceRecordingTimeout(): Optional<Long> = body.conferenceRecordingTimeout()

    /**
     * The URL the conference callbacks will be sent to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conferenceStatusCallback(): Optional<String> = body.conferenceStatusCallback()

    /**
     * The changes to the conference's state that should generate a call to
     * `ConferenceStatusCallback`. Can be: `start`, `end`, `join` and `leave`. Separate multiple
     * values with a space. By default no callbacks are sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conferenceStatusCallbackEvent(): Optional<String> = body.conferenceStatusCallbackEvent()

    /**
     * HTTP request type used for `ConferenceStatusCallback`. Defaults to `POST`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conferenceStatusCallbackMethod(): Optional<ConferenceStatusCallbackMethod> =
        body.conferenceStatusCallbackMethod()

    /**
     * Whether to trim any leading and trailing silence from the conference recording. Defaults to
     * `trim-silence`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conferenceTrim(): Optional<ConferenceTrim> = body.conferenceTrim()

    /**
     * Whether participant shall be bridged to conference before the participant answers (from early
     * media if available). Defaults to `false`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun earlyMedia(): Optional<Boolean> = body.earlyMedia()

    /**
     * Whether to end the conference when the participant leaves. Defaults to `false`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endConferenceOnExit(): Optional<Boolean> = body.endConferenceOnExit()

    /**
     * The phone number of the party that initiated the call. Phone numbers are formatted with a `+`
     * and country code.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun from(): Optional<String> = body.from()

    /**
     * Whether to detect if a human or an answering machine picked up the call. Use `Enable` if you
     * would like to ne notified as soon as the called party is identified. Use `DetectMessageEnd`,
     * if you would like to leave a message on an answering machine.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun machineDetection(): Optional<MachineDetection> = body.machineDetection()

    /**
     * If initial silence duration is greater than this value, consider it a machine. Ignored when
     * `premium` detection is used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun machineDetectionSilenceTimeout(): Optional<Long> = body.machineDetectionSilenceTimeout()

    /**
     * Silence duration threshold after a greeting message or voice for it be considered human.
     * Ignored when `premium` detection is used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun machineDetectionSpeechEndThreshold(): Optional<Long> =
        body.machineDetectionSpeechEndThreshold()

    /**
     * Maximum threshold of a human greeting. If greeting longer than this value, considered
     * machine. Ignored when `premium` detection is used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun machineDetectionSpeechThreshold(): Optional<Long> = body.machineDetectionSpeechThreshold()

    /**
     * How long answering machine detection should go on for before sending an `Unknown` result.
     * Given in milliseconds.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun machineDetectionTimeout(): Optional<Long> = body.machineDetectionTimeout()

    /**
     * The maximum number of participants in the conference. Can be a positive integer from 2
     * to 800. The default value is 250.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxParticipants(): Optional<Long> = body.maxParticipants()

    /**
     * Whether the participant should be muted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun muted(): Optional<Boolean> = body.muted()

    /**
     * The list of comma-separated codecs to be offered on a call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferredCodecs(): Optional<String> = body.preferredCodecs()

    /**
     * Whether to record the entire participant's call leg. Defaults to `false`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun record(): Optional<Boolean> = body.record()

    /**
     * The number of channels in the final recording. Defaults to `mono`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingChannels(): Optional<RecordingChannels> = body.recordingChannels()

    /**
     * The URL the recording callbacks will be sent to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingStatusCallback(): Optional<String> = body.recordingStatusCallback()

    /**
     * The changes to the recording's state that should generate a call to
     * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate multiple
     * values with a space. Defaults to `completed`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingStatusCallbackEvent(): Optional<String> = body.recordingStatusCallbackEvent()

    /**
     * HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingStatusCallbackMethod(): Optional<RecordingStatusCallbackMethod> =
        body.recordingStatusCallbackMethod()

    /**
     * The audio track to record for the call. The default is `both`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingTrack(): Optional<RecordingTrack> = body.recordingTrack()

    /**
     * The password to use for SIP authentication.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipAuthPassword(): Optional<String> = body.sipAuthPassword()

    /**
     * The username to use for SIP authentication.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipAuthUsername(): Optional<String> = body.sipAuthUsername()

    /**
     * Whether to start the conference when the participant enters. Defaults to `true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startConferenceOnEnter(): Optional<Boolean> = body.startConferenceOnEnter()

    /**
     * URL destination for Telnyx to send status callback events to for the call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCallback(): Optional<String> = body.statusCallback()

    /**
     * The changes to the call's state that should generate a call to `StatusCallback`. Can be:
     * `initiated`, `ringing`, `answered`, and `completed`. Separate multiple values with a space.
     * The default value is `completed`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCallbackEvent(): Optional<String> = body.statusCallbackEvent()

    /**
     * HTTP request type used for `StatusCallback`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCallbackMethod(): Optional<StatusCallbackMethod> = body.statusCallbackMethod()

    /**
     * The maximum duration of the call in seconds.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeLimit(): Optional<Long> = body.timeLimit()

    /**
     * The number of seconds that we should allow the phone to ring before assuming there is no
     * answer. Can be an integer between 5 and 120, inclusive. The default value is 30.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeout(): Optional<Long> = body.timeout()

    /**
     * The phone number of the called party. Phone numbers are formatted with a `+` and country
     * code.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun to(): Optional<String> = body.to()

    /**
     * Whether to trim any leading and trailing silence from the recording. Defaults to
     * `trim-silence`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trim(): Optional<Trim> = body.trim()

    /**
     * The URL to call for an audio file to play while the participant is waiting for the conference
     * to start.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun waitUrl(): Optional<String> = body.waitUrl()

    /**
     * Returns the raw JSON value of [amdStatusCallback].
     *
     * Unlike [amdStatusCallback], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _amdStatusCallback(): JsonField<String> = body._amdStatusCallback()

    /**
     * Returns the raw JSON value of [amdStatusCallbackMethod].
     *
     * Unlike [amdStatusCallbackMethod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _amdStatusCallbackMethod(): JsonField<AmdStatusCallbackMethod> =
        body._amdStatusCallbackMethod()

    /**
     * Returns the raw JSON value of [beep].
     *
     * Unlike [beep], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _beep(): JsonField<Beep> = body._beep()

    /**
     * Returns the raw JSON value of [callerId].
     *
     * Unlike [callerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callerId(): JsonField<String> = body._callerId()

    /**
     * Returns the raw JSON value of [callSidToCoach].
     *
     * Unlike [callSidToCoach], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callSidToCoach(): JsonField<String> = body._callSidToCoach()

    /**
     * Returns the raw JSON value of [cancelPlaybackOnDetectMessageEnd].
     *
     * Unlike [cancelPlaybackOnDetectMessageEnd], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _cancelPlaybackOnDetectMessageEnd(): JsonField<Boolean> =
        body._cancelPlaybackOnDetectMessageEnd()

    /**
     * Returns the raw JSON value of [cancelPlaybackOnMachineDetection].
     *
     * Unlike [cancelPlaybackOnMachineDetection], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _cancelPlaybackOnMachineDetection(): JsonField<Boolean> =
        body._cancelPlaybackOnMachineDetection()

    /**
     * Returns the raw JSON value of [coaching].
     *
     * Unlike [coaching], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _coaching(): JsonField<Boolean> = body._coaching()

    /**
     * Returns the raw JSON value of [conferenceRecord].
     *
     * Unlike [conferenceRecord], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _conferenceRecord(): JsonField<ConferenceRecord> = body._conferenceRecord()

    /**
     * Returns the raw JSON value of [conferenceRecordingStatusCallback].
     *
     * Unlike [conferenceRecordingStatusCallback], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _conferenceRecordingStatusCallback(): JsonField<String> =
        body._conferenceRecordingStatusCallback()

    /**
     * Returns the raw JSON value of [conferenceRecordingStatusCallbackEvent].
     *
     * Unlike [conferenceRecordingStatusCallbackEvent], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    fun _conferenceRecordingStatusCallbackEvent(): JsonField<String> =
        body._conferenceRecordingStatusCallbackEvent()

    /**
     * Returns the raw JSON value of [conferenceRecordingStatusCallbackMethod].
     *
     * Unlike [conferenceRecordingStatusCallbackMethod], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    fun _conferenceRecordingStatusCallbackMethod():
        JsonField<ConferenceRecordingStatusCallbackMethod> =
        body._conferenceRecordingStatusCallbackMethod()

    /**
     * Returns the raw JSON value of [conferenceRecordingTimeout].
     *
     * Unlike [conferenceRecordingTimeout], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _conferenceRecordingTimeout(): JsonField<Long> = body._conferenceRecordingTimeout()

    /**
     * Returns the raw JSON value of [conferenceStatusCallback].
     *
     * Unlike [conferenceStatusCallback], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _conferenceStatusCallback(): JsonField<String> = body._conferenceStatusCallback()

    /**
     * Returns the raw JSON value of [conferenceStatusCallbackEvent].
     *
     * Unlike [conferenceStatusCallbackEvent], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _conferenceStatusCallbackEvent(): JsonField<String> = body._conferenceStatusCallbackEvent()

    /**
     * Returns the raw JSON value of [conferenceStatusCallbackMethod].
     *
     * Unlike [conferenceStatusCallbackMethod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _conferenceStatusCallbackMethod(): JsonField<ConferenceStatusCallbackMethod> =
        body._conferenceStatusCallbackMethod()

    /**
     * Returns the raw JSON value of [conferenceTrim].
     *
     * Unlike [conferenceTrim], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _conferenceTrim(): JsonField<ConferenceTrim> = body._conferenceTrim()

    /**
     * Returns the raw JSON value of [earlyMedia].
     *
     * Unlike [earlyMedia], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _earlyMedia(): JsonField<Boolean> = body._earlyMedia()

    /**
     * Returns the raw JSON value of [endConferenceOnExit].
     *
     * Unlike [endConferenceOnExit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _endConferenceOnExit(): JsonField<Boolean> = body._endConferenceOnExit()

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _from(): JsonField<String> = body._from()

    /**
     * Returns the raw JSON value of [machineDetection].
     *
     * Unlike [machineDetection], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _machineDetection(): JsonField<MachineDetection> = body._machineDetection()

    /**
     * Returns the raw JSON value of [machineDetectionSilenceTimeout].
     *
     * Unlike [machineDetectionSilenceTimeout], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _machineDetectionSilenceTimeout(): JsonField<Long> = body._machineDetectionSilenceTimeout()

    /**
     * Returns the raw JSON value of [machineDetectionSpeechEndThreshold].
     *
     * Unlike [machineDetectionSpeechEndThreshold], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _machineDetectionSpeechEndThreshold(): JsonField<Long> =
        body._machineDetectionSpeechEndThreshold()

    /**
     * Returns the raw JSON value of [machineDetectionSpeechThreshold].
     *
     * Unlike [machineDetectionSpeechThreshold], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _machineDetectionSpeechThreshold(): JsonField<Long> =
        body._machineDetectionSpeechThreshold()

    /**
     * Returns the raw JSON value of [machineDetectionTimeout].
     *
     * Unlike [machineDetectionTimeout], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _machineDetectionTimeout(): JsonField<Long> = body._machineDetectionTimeout()

    /**
     * Returns the raw JSON value of [maxParticipants].
     *
     * Unlike [maxParticipants], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxParticipants(): JsonField<Long> = body._maxParticipants()

    /**
     * Returns the raw JSON value of [muted].
     *
     * Unlike [muted], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _muted(): JsonField<Boolean> = body._muted()

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
    fun _record(): JsonField<Boolean> = body._record()

    /**
     * Returns the raw JSON value of [recordingChannels].
     *
     * Unlike [recordingChannels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _recordingChannels(): JsonField<RecordingChannels> = body._recordingChannels()

    /**
     * Returns the raw JSON value of [recordingStatusCallback].
     *
     * Unlike [recordingStatusCallback], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _recordingStatusCallback(): JsonField<String> = body._recordingStatusCallback()

    /**
     * Returns the raw JSON value of [recordingStatusCallbackEvent].
     *
     * Unlike [recordingStatusCallbackEvent], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _recordingStatusCallbackEvent(): JsonField<String> = body._recordingStatusCallbackEvent()

    /**
     * Returns the raw JSON value of [recordingStatusCallbackMethod].
     *
     * Unlike [recordingStatusCallbackMethod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _recordingStatusCallbackMethod(): JsonField<RecordingStatusCallbackMethod> =
        body._recordingStatusCallbackMethod()

    /**
     * Returns the raw JSON value of [recordingTrack].
     *
     * Unlike [recordingTrack], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordingTrack(): JsonField<RecordingTrack> = body._recordingTrack()

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
     * Returns the raw JSON value of [startConferenceOnEnter].
     *
     * Unlike [startConferenceOnEnter], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _startConferenceOnEnter(): JsonField<Boolean> = body._startConferenceOnEnter()

    /**
     * Returns the raw JSON value of [statusCallback].
     *
     * Unlike [statusCallback], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _statusCallback(): JsonField<String> = body._statusCallback()

    /**
     * Returns the raw JSON value of [statusCallbackEvent].
     *
     * Unlike [statusCallbackEvent], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _statusCallbackEvent(): JsonField<String> = body._statusCallbackEvent()

    /**
     * Returns the raw JSON value of [statusCallbackMethod].
     *
     * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = body._statusCallbackMethod()

    /**
     * Returns the raw JSON value of [timeLimit].
     *
     * Unlike [timeLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeLimit(): JsonField<Long> = body._timeLimit()

    /**
     * Returns the raw JSON value of [timeout].
     *
     * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeout(): JsonField<Long> = body._timeout()

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _to(): JsonField<String> = body._to()

    /**
     * Returns the raw JSON value of [trim].
     *
     * Unlike [trim], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trim(): JsonField<Trim> = body._trim()

    /**
     * Returns the raw JSON value of [waitUrl].
     *
     * Unlike [waitUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _waitUrl(): JsonField<String> = body._waitUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ParticipantParticipantsParams].
         *
         * The following fields are required:
         * ```java
         * .accountSid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantParticipantsParams]. */
    class Builder internal constructor() {

        private var accountSid: String? = null
        private var conferenceSid: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(participantParticipantsParams: ParticipantParticipantsParams) = apply {
            accountSid = participantParticipantsParams.accountSid
            conferenceSid = participantParticipantsParams.conferenceSid
            body = participantParticipantsParams.body.toBuilder()
            additionalHeaders = participantParticipantsParams.additionalHeaders.toBuilder()
            additionalQueryParams = participantParticipantsParams.additionalQueryParams.toBuilder()
        }

        fun accountSid(accountSid: String) = apply { this.accountSid = accountSid }

        fun conferenceSid(conferenceSid: String?) = apply { this.conferenceSid = conferenceSid }

        /** Alias for calling [Builder.conferenceSid] with `conferenceSid.orElse(null)`. */
        fun conferenceSid(conferenceSid: Optional<String>) =
            conferenceSid(conferenceSid.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amdStatusCallback]
         * - [amdStatusCallbackMethod]
         * - [beep]
         * - [callerId]
         * - [callSidToCoach]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The URL the result of answering machine detection will be sent to. */
        fun amdStatusCallback(amdStatusCallback: String) = apply {
            body.amdStatusCallback(amdStatusCallback)
        }

        /**
         * Sets [Builder.amdStatusCallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amdStatusCallback] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amdStatusCallback(amdStatusCallback: JsonField<String>) = apply {
            body.amdStatusCallback(amdStatusCallback)
        }

        /** HTTP request type used for `AmdStatusCallback`. Defaults to `POST`. */
        fun amdStatusCallbackMethod(amdStatusCallbackMethod: AmdStatusCallbackMethod) = apply {
            body.amdStatusCallbackMethod(amdStatusCallbackMethod)
        }

        /**
         * Sets [Builder.amdStatusCallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amdStatusCallbackMethod] with a well-typed
         * [AmdStatusCallbackMethod] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun amdStatusCallbackMethod(amdStatusCallbackMethod: JsonField<AmdStatusCallbackMethod>) =
            apply {
                body.amdStatusCallbackMethod(amdStatusCallbackMethod)
            }

        /**
         * Whether to play a notification beep to the conference when the participant enters and
         * exits.
         */
        fun beep(beep: Beep) = apply { body.beep(beep) }

        /**
         * Sets [Builder.beep] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beep] with a well-typed [Beep] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun beep(beep: JsonField<Beep>) = apply { body.beep(beep) }

        /**
         * To be used as the caller id name (SIP From Display Name) presented to the destination
         * (`To` number). The string should have a maximum of 128 characters, containing only
         * letters, numbers, spaces, and `-_~!.+` special characters. If ommited, the display name
         * will be the same as the number in the `From` field.
         */
        fun callerId(callerId: String) = apply { body.callerId(callerId) }

        /**
         * Sets [Builder.callerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callerId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun callerId(callerId: JsonField<String>) = apply { body.callerId(callerId) }

        /**
         * The SID of the participant who is being coached. The participant being coached is the
         * only participant who can hear the participant who is coaching.
         */
        fun callSidToCoach(callSidToCoach: String) = apply { body.callSidToCoach(callSidToCoach) }

        /**
         * Sets [Builder.callSidToCoach] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSidToCoach] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callSidToCoach(callSidToCoach: JsonField<String>) = apply {
            body.callSidToCoach(callSidToCoach)
        }

        /** Whether to cancel ongoing playback on `greeting ended` detection. Defaults to `true`. */
        fun cancelPlaybackOnDetectMessageEnd(cancelPlaybackOnDetectMessageEnd: Boolean) = apply {
            body.cancelPlaybackOnDetectMessageEnd(cancelPlaybackOnDetectMessageEnd)
        }

        /**
         * Sets [Builder.cancelPlaybackOnDetectMessageEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelPlaybackOnDetectMessageEnd] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun cancelPlaybackOnDetectMessageEnd(cancelPlaybackOnDetectMessageEnd: JsonField<Boolean>) =
            apply {
                body.cancelPlaybackOnDetectMessageEnd(cancelPlaybackOnDetectMessageEnd)
            }

        /** Whether to cancel ongoing playback on `machine` detection. Defaults to `true`. */
        fun cancelPlaybackOnMachineDetection(cancelPlaybackOnMachineDetection: Boolean) = apply {
            body.cancelPlaybackOnMachineDetection(cancelPlaybackOnMachineDetection)
        }

        /**
         * Sets [Builder.cancelPlaybackOnMachineDetection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelPlaybackOnMachineDetection] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun cancelPlaybackOnMachineDetection(cancelPlaybackOnMachineDetection: JsonField<Boolean>) =
            apply {
                body.cancelPlaybackOnMachineDetection(cancelPlaybackOnMachineDetection)
            }

        /**
         * Whether the participant is coaching another call. When `true`, `CallSidToCoach` has to be
         * given.
         */
        fun coaching(coaching: Boolean) = apply { body.coaching(coaching) }

        /**
         * Sets [Builder.coaching] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coaching] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun coaching(coaching: JsonField<Boolean>) = apply { body.coaching(coaching) }

        /**
         * Whether to record the conference the participant is joining. Defualts to `do-not-record`.
         * The boolean values `true` and `false` are synonymous with `record-from-start` and
         * `do-not-record` respectively.
         */
        fun conferenceRecord(conferenceRecord: ConferenceRecord) = apply {
            body.conferenceRecord(conferenceRecord)
        }

        /**
         * Sets [Builder.conferenceRecord] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conferenceRecord] with a well-typed [ConferenceRecord]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun conferenceRecord(conferenceRecord: JsonField<ConferenceRecord>) = apply {
            body.conferenceRecord(conferenceRecord)
        }

        /** The URL the conference recording callbacks will be sent to. */
        fun conferenceRecordingStatusCallback(conferenceRecordingStatusCallback: String) = apply {
            body.conferenceRecordingStatusCallback(conferenceRecordingStatusCallback)
        }

        /**
         * Sets [Builder.conferenceRecordingStatusCallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conferenceRecordingStatusCallback] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun conferenceRecordingStatusCallback(
            conferenceRecordingStatusCallback: JsonField<String>
        ) = apply { body.conferenceRecordingStatusCallback(conferenceRecordingStatusCallback) }

        /**
         * The changes to the conference recording's state that should generate a call to
         * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
         * multiple values with a space. Defaults to `completed`. `failed` and `absent` are
         * synonymous.
         */
        fun conferenceRecordingStatusCallbackEvent(conferenceRecordingStatusCallbackEvent: String) =
            apply {
                body.conferenceRecordingStatusCallbackEvent(conferenceRecordingStatusCallbackEvent)
            }

        /**
         * Sets [Builder.conferenceRecordingStatusCallbackEvent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conferenceRecordingStatusCallbackEvent] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun conferenceRecordingStatusCallbackEvent(
            conferenceRecordingStatusCallbackEvent: JsonField<String>
        ) = apply {
            body.conferenceRecordingStatusCallbackEvent(conferenceRecordingStatusCallbackEvent)
        }

        /** HTTP request type used for `ConferenceRecordingStatusCallback`. Defaults to `POST`. */
        fun conferenceRecordingStatusCallbackMethod(
            conferenceRecordingStatusCallbackMethod: ConferenceRecordingStatusCallbackMethod
        ) = apply {
            body.conferenceRecordingStatusCallbackMethod(conferenceRecordingStatusCallbackMethod)
        }

        /**
         * Sets [Builder.conferenceRecordingStatusCallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conferenceRecordingStatusCallbackMethod] with a
         * well-typed [ConferenceRecordingStatusCallbackMethod] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun conferenceRecordingStatusCallbackMethod(
            conferenceRecordingStatusCallbackMethod:
                JsonField<ConferenceRecordingStatusCallbackMethod>
        ) = apply {
            body.conferenceRecordingStatusCallbackMethod(conferenceRecordingStatusCallbackMethod)
        }

        /**
         * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
         * detected. The timer only starts when the speech is detected. Please note that the
         * transcription is used to detect silence and the related charge will be applied. The
         * minimum value is 0. The default value is 0 (infinite)
         */
        fun conferenceRecordingTimeout(conferenceRecordingTimeout: Long) = apply {
            body.conferenceRecordingTimeout(conferenceRecordingTimeout)
        }

        /**
         * Sets [Builder.conferenceRecordingTimeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conferenceRecordingTimeout] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun conferenceRecordingTimeout(conferenceRecordingTimeout: JsonField<Long>) = apply {
            body.conferenceRecordingTimeout(conferenceRecordingTimeout)
        }

        /** The URL the conference callbacks will be sent to. */
        fun conferenceStatusCallback(conferenceStatusCallback: String) = apply {
            body.conferenceStatusCallback(conferenceStatusCallback)
        }

        /**
         * Sets [Builder.conferenceStatusCallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conferenceStatusCallback] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun conferenceStatusCallback(conferenceStatusCallback: JsonField<String>) = apply {
            body.conferenceStatusCallback(conferenceStatusCallback)
        }

        /**
         * The changes to the conference's state that should generate a call to
         * `ConferenceStatusCallback`. Can be: `start`, `end`, `join` and `leave`. Separate multiple
         * values with a space. By default no callbacks are sent.
         */
        fun conferenceStatusCallbackEvent(conferenceStatusCallbackEvent: String) = apply {
            body.conferenceStatusCallbackEvent(conferenceStatusCallbackEvent)
        }

        /**
         * Sets [Builder.conferenceStatusCallbackEvent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conferenceStatusCallbackEvent] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun conferenceStatusCallbackEvent(conferenceStatusCallbackEvent: JsonField<String>) =
            apply {
                body.conferenceStatusCallbackEvent(conferenceStatusCallbackEvent)
            }

        /** HTTP request type used for `ConferenceStatusCallback`. Defaults to `POST`. */
        fun conferenceStatusCallbackMethod(
            conferenceStatusCallbackMethod: ConferenceStatusCallbackMethod
        ) = apply { body.conferenceStatusCallbackMethod(conferenceStatusCallbackMethod) }

        /**
         * Sets [Builder.conferenceStatusCallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conferenceStatusCallbackMethod] with a well-typed
         * [ConferenceStatusCallbackMethod] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun conferenceStatusCallbackMethod(
            conferenceStatusCallbackMethod: JsonField<ConferenceStatusCallbackMethod>
        ) = apply { body.conferenceStatusCallbackMethod(conferenceStatusCallbackMethod) }

        /**
         * Whether to trim any leading and trailing silence from the conference recording. Defaults
         * to `trim-silence`.
         */
        fun conferenceTrim(conferenceTrim: ConferenceTrim) = apply {
            body.conferenceTrim(conferenceTrim)
        }

        /**
         * Sets [Builder.conferenceTrim] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conferenceTrim] with a well-typed [ConferenceTrim] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conferenceTrim(conferenceTrim: JsonField<ConferenceTrim>) = apply {
            body.conferenceTrim(conferenceTrim)
        }

        /**
         * Whether participant shall be bridged to conference before the participant answers (from
         * early media if available). Defaults to `false`.
         */
        fun earlyMedia(earlyMedia: Boolean) = apply { body.earlyMedia(earlyMedia) }

        /**
         * Sets [Builder.earlyMedia] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earlyMedia] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun earlyMedia(earlyMedia: JsonField<Boolean>) = apply { body.earlyMedia(earlyMedia) }

        /** Whether to end the conference when the participant leaves. Defaults to `false`. */
        fun endConferenceOnExit(endConferenceOnExit: Boolean) = apply {
            body.endConferenceOnExit(endConferenceOnExit)
        }

        /**
         * Sets [Builder.endConferenceOnExit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endConferenceOnExit] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endConferenceOnExit(endConferenceOnExit: JsonField<Boolean>) = apply {
            body.endConferenceOnExit(endConferenceOnExit)
        }

        /**
         * The phone number of the party that initiated the call. Phone numbers are formatted with a
         * `+` and country code.
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
         * Whether to detect if a human or an answering machine picked up the call. Use `Enable` if
         * you would like to ne notified as soon as the called party is identified. Use
         * `DetectMessageEnd`, if you would like to leave a message on an answering machine.
         */
        fun machineDetection(machineDetection: MachineDetection) = apply {
            body.machineDetection(machineDetection)
        }

        /**
         * Sets [Builder.machineDetection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineDetection] with a well-typed [MachineDetection]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun machineDetection(machineDetection: JsonField<MachineDetection>) = apply {
            body.machineDetection(machineDetection)
        }

        /**
         * If initial silence duration is greater than this value, consider it a machine. Ignored
         * when `premium` detection is used.
         */
        fun machineDetectionSilenceTimeout(machineDetectionSilenceTimeout: Long) = apply {
            body.machineDetectionSilenceTimeout(machineDetectionSilenceTimeout)
        }

        /**
         * Sets [Builder.machineDetectionSilenceTimeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineDetectionSilenceTimeout] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun machineDetectionSilenceTimeout(machineDetectionSilenceTimeout: JsonField<Long>) =
            apply {
                body.machineDetectionSilenceTimeout(machineDetectionSilenceTimeout)
            }

        /**
         * Silence duration threshold after a greeting message or voice for it be considered human.
         * Ignored when `premium` detection is used.
         */
        fun machineDetectionSpeechEndThreshold(machineDetectionSpeechEndThreshold: Long) = apply {
            body.machineDetectionSpeechEndThreshold(machineDetectionSpeechEndThreshold)
        }

        /**
         * Sets [Builder.machineDetectionSpeechEndThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineDetectionSpeechEndThreshold] with a well-typed
         * [Long] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun machineDetectionSpeechEndThreshold(
            machineDetectionSpeechEndThreshold: JsonField<Long>
        ) = apply { body.machineDetectionSpeechEndThreshold(machineDetectionSpeechEndThreshold) }

        /**
         * Maximum threshold of a human greeting. If greeting longer than this value, considered
         * machine. Ignored when `premium` detection is used.
         */
        fun machineDetectionSpeechThreshold(machineDetectionSpeechThreshold: Long) = apply {
            body.machineDetectionSpeechThreshold(machineDetectionSpeechThreshold)
        }

        /**
         * Sets [Builder.machineDetectionSpeechThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineDetectionSpeechThreshold] with a well-typed
         * [Long] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun machineDetectionSpeechThreshold(machineDetectionSpeechThreshold: JsonField<Long>) =
            apply {
                body.machineDetectionSpeechThreshold(machineDetectionSpeechThreshold)
            }

        /**
         * How long answering machine detection should go on for before sending an `Unknown` result.
         * Given in milliseconds.
         */
        fun machineDetectionTimeout(machineDetectionTimeout: Long) = apply {
            body.machineDetectionTimeout(machineDetectionTimeout)
        }

        /**
         * Sets [Builder.machineDetectionTimeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineDetectionTimeout] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun machineDetectionTimeout(machineDetectionTimeout: JsonField<Long>) = apply {
            body.machineDetectionTimeout(machineDetectionTimeout)
        }

        /**
         * The maximum number of participants in the conference. Can be a positive integer from 2
         * to 800. The default value is 250.
         */
        fun maxParticipants(maxParticipants: Long) = apply { body.maxParticipants(maxParticipants) }

        /**
         * Sets [Builder.maxParticipants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxParticipants] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxParticipants(maxParticipants: JsonField<Long>) = apply {
            body.maxParticipants(maxParticipants)
        }

        /** Whether the participant should be muted. */
        fun muted(muted: Boolean) = apply { body.muted(muted) }

        /**
         * Sets [Builder.muted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.muted] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun muted(muted: JsonField<Boolean>) = apply { body.muted(muted) }

        /** The list of comma-separated codecs to be offered on a call. */
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

        /** Whether to record the entire participant's call leg. Defaults to `false`. */
        fun record(record: Boolean) = apply { body.record(record) }

        /**
         * Sets [Builder.record] to an arbitrary JSON value.
         *
         * You should usually call [Builder.record] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun record(record: JsonField<Boolean>) = apply { body.record(record) }

        /** The number of channels in the final recording. Defaults to `mono`. */
        fun recordingChannels(recordingChannels: RecordingChannels) = apply {
            body.recordingChannels(recordingChannels)
        }

        /**
         * Sets [Builder.recordingChannels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingChannels] with a well-typed [RecordingChannels]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recordingChannels(recordingChannels: JsonField<RecordingChannels>) = apply {
            body.recordingChannels(recordingChannels)
        }

        /** The URL the recording callbacks will be sent to. */
        fun recordingStatusCallback(recordingStatusCallback: String) = apply {
            body.recordingStatusCallback(recordingStatusCallback)
        }

        /**
         * Sets [Builder.recordingStatusCallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingStatusCallback] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recordingStatusCallback(recordingStatusCallback: JsonField<String>) = apply {
            body.recordingStatusCallback(recordingStatusCallback)
        }

        /**
         * The changes to the recording's state that should generate a call to
         * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
         * multiple values with a space. Defaults to `completed`.
         */
        fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: String) = apply {
            body.recordingStatusCallbackEvent(recordingStatusCallbackEvent)
        }

        /**
         * Sets [Builder.recordingStatusCallbackEvent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingStatusCallbackEvent] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: JsonField<String>) = apply {
            body.recordingStatusCallbackEvent(recordingStatusCallbackEvent)
        }

        /** HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`. */
        fun recordingStatusCallbackMethod(
            recordingStatusCallbackMethod: RecordingStatusCallbackMethod
        ) = apply { body.recordingStatusCallbackMethod(recordingStatusCallbackMethod) }

        /**
         * Sets [Builder.recordingStatusCallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingStatusCallbackMethod] with a well-typed
         * [RecordingStatusCallbackMethod] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun recordingStatusCallbackMethod(
            recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>
        ) = apply { body.recordingStatusCallbackMethod(recordingStatusCallbackMethod) }

        /** The audio track to record for the call. The default is `both`. */
        fun recordingTrack(recordingTrack: RecordingTrack) = apply {
            body.recordingTrack(recordingTrack)
        }

        /**
         * Sets [Builder.recordingTrack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingTrack] with a well-typed [RecordingTrack] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordingTrack(recordingTrack: JsonField<RecordingTrack>) = apply {
            body.recordingTrack(recordingTrack)
        }

        /** The password to use for SIP authentication. */
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

        /** The username to use for SIP authentication. */
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

        /** Whether to start the conference when the participant enters. Defaults to `true`. */
        fun startConferenceOnEnter(startConferenceOnEnter: Boolean) = apply {
            body.startConferenceOnEnter(startConferenceOnEnter)
        }

        /**
         * Sets [Builder.startConferenceOnEnter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startConferenceOnEnter] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun startConferenceOnEnter(startConferenceOnEnter: JsonField<Boolean>) = apply {
            body.startConferenceOnEnter(startConferenceOnEnter)
        }

        /** URL destination for Telnyx to send status callback events to for the call. */
        fun statusCallback(statusCallback: String) = apply { body.statusCallback(statusCallback) }

        /**
         * Sets [Builder.statusCallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallback] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusCallback(statusCallback: JsonField<String>) = apply {
            body.statusCallback(statusCallback)
        }

        /**
         * The changes to the call's state that should generate a call to `StatusCallback`. Can be:
         * `initiated`, `ringing`, `answered`, and `completed`. Separate multiple values with a
         * space. The default value is `completed`.
         */
        fun statusCallbackEvent(statusCallbackEvent: String) = apply {
            body.statusCallbackEvent(statusCallbackEvent)
        }

        /**
         * Sets [Builder.statusCallbackEvent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallbackEvent] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusCallbackEvent(statusCallbackEvent: JsonField<String>) = apply {
            body.statusCallbackEvent(statusCallbackEvent)
        }

        /** HTTP request type used for `StatusCallback`. */
        fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) = apply {
            body.statusCallbackMethod(statusCallbackMethod)
        }

        /**
         * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallbackMethod] with a well-typed
         * [StatusCallbackMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) = apply {
            body.statusCallbackMethod(statusCallbackMethod)
        }

        /** The maximum duration of the call in seconds. */
        fun timeLimit(timeLimit: Long) = apply { body.timeLimit(timeLimit) }

        /**
         * Sets [Builder.timeLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeLimit(timeLimit: JsonField<Long>) = apply { body.timeLimit(timeLimit) }

        /**
         * The number of seconds that we should allow the phone to ring before assuming there is no
         * answer. Can be an integer between 5 and 120, inclusive. The default value is 30.
         */
        fun timeout(timeout: Long) = apply { body.timeout(timeout) }

        /**
         * Sets [Builder.timeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeout] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeout(timeout: JsonField<Long>) = apply { body.timeout(timeout) }

        /**
         * The phone number of the called party. Phone numbers are formatted with a `+` and country
         * code.
         */
        fun to(to: String) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { body.to(to) }

        /**
         * Whether to trim any leading and trailing silence from the recording. Defaults to
         * `trim-silence`.
         */
        fun trim(trim: Trim) = apply { body.trim(trim) }

        /**
         * Sets [Builder.trim] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trim] with a well-typed [Trim] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trim(trim: JsonField<Trim>) = apply { body.trim(trim) }

        /**
         * The URL to call for an audio file to play while the participant is waiting for the
         * conference to start.
         */
        fun waitUrl(waitUrl: String) = apply { body.waitUrl(waitUrl) }

        /**
         * Sets [Builder.waitUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.waitUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun waitUrl(waitUrl: JsonField<String>) = apply { body.waitUrl(waitUrl) }

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
         * Returns an immutable instance of [ParticipantParticipantsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountSid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantParticipantsParams =
            ParticipantParticipantsParams(
                checkRequired("accountSid", accountSid),
                conferenceSid,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountSid
            1 -> conferenceSid ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amdStatusCallback: JsonField<String>,
        private val amdStatusCallbackMethod: JsonField<AmdStatusCallbackMethod>,
        private val beep: JsonField<Beep>,
        private val callerId: JsonField<String>,
        private val callSidToCoach: JsonField<String>,
        private val cancelPlaybackOnDetectMessageEnd: JsonField<Boolean>,
        private val cancelPlaybackOnMachineDetection: JsonField<Boolean>,
        private val coaching: JsonField<Boolean>,
        private val conferenceRecord: JsonField<ConferenceRecord>,
        private val conferenceRecordingStatusCallback: JsonField<String>,
        private val conferenceRecordingStatusCallbackEvent: JsonField<String>,
        private val conferenceRecordingStatusCallbackMethod:
            JsonField<ConferenceRecordingStatusCallbackMethod>,
        private val conferenceRecordingTimeout: JsonField<Long>,
        private val conferenceStatusCallback: JsonField<String>,
        private val conferenceStatusCallbackEvent: JsonField<String>,
        private val conferenceStatusCallbackMethod: JsonField<ConferenceStatusCallbackMethod>,
        private val conferenceTrim: JsonField<ConferenceTrim>,
        private val earlyMedia: JsonField<Boolean>,
        private val endConferenceOnExit: JsonField<Boolean>,
        private val from: JsonField<String>,
        private val machineDetection: JsonField<MachineDetection>,
        private val machineDetectionSilenceTimeout: JsonField<Long>,
        private val machineDetectionSpeechEndThreshold: JsonField<Long>,
        private val machineDetectionSpeechThreshold: JsonField<Long>,
        private val machineDetectionTimeout: JsonField<Long>,
        private val maxParticipants: JsonField<Long>,
        private val muted: JsonField<Boolean>,
        private val preferredCodecs: JsonField<String>,
        private val record: JsonField<Boolean>,
        private val recordingChannels: JsonField<RecordingChannels>,
        private val recordingStatusCallback: JsonField<String>,
        private val recordingStatusCallbackEvent: JsonField<String>,
        private val recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>,
        private val recordingTrack: JsonField<RecordingTrack>,
        private val sipAuthPassword: JsonField<String>,
        private val sipAuthUsername: JsonField<String>,
        private val startConferenceOnEnter: JsonField<Boolean>,
        private val statusCallback: JsonField<String>,
        private val statusCallbackEvent: JsonField<String>,
        private val statusCallbackMethod: JsonField<StatusCallbackMethod>,
        private val timeLimit: JsonField<Long>,
        private val timeout: JsonField<Long>,
        private val to: JsonField<String>,
        private val trim: JsonField<Trim>,
        private val waitUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("AmdStatusCallback")
            @ExcludeMissing
            amdStatusCallback: JsonField<String> = JsonMissing.of(),
            @JsonProperty("AmdStatusCallbackMethod")
            @ExcludeMissing
            amdStatusCallbackMethod: JsonField<AmdStatusCallbackMethod> = JsonMissing.of(),
            @JsonProperty("Beep") @ExcludeMissing beep: JsonField<Beep> = JsonMissing.of(),
            @JsonProperty("CallerId")
            @ExcludeMissing
            callerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("CallSidToCoach")
            @ExcludeMissing
            callSidToCoach: JsonField<String> = JsonMissing.of(),
            @JsonProperty("CancelPlaybackOnDetectMessageEnd")
            @ExcludeMissing
            cancelPlaybackOnDetectMessageEnd: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("CancelPlaybackOnMachineDetection")
            @ExcludeMissing
            cancelPlaybackOnMachineDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("Coaching")
            @ExcludeMissing
            coaching: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("ConferenceRecord")
            @ExcludeMissing
            conferenceRecord: JsonField<ConferenceRecord> = JsonMissing.of(),
            @JsonProperty("ConferenceRecordingStatusCallback")
            @ExcludeMissing
            conferenceRecordingStatusCallback: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ConferenceRecordingStatusCallbackEvent")
            @ExcludeMissing
            conferenceRecordingStatusCallbackEvent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ConferenceRecordingStatusCallbackMethod")
            @ExcludeMissing
            conferenceRecordingStatusCallbackMethod:
                JsonField<ConferenceRecordingStatusCallbackMethod> =
                JsonMissing.of(),
            @JsonProperty("ConferenceRecordingTimeout")
            @ExcludeMissing
            conferenceRecordingTimeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("ConferenceStatusCallback")
            @ExcludeMissing
            conferenceStatusCallback: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ConferenceStatusCallbackEvent")
            @ExcludeMissing
            conferenceStatusCallbackEvent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ConferenceStatusCallbackMethod")
            @ExcludeMissing
            conferenceStatusCallbackMethod: JsonField<ConferenceStatusCallbackMethod> =
                JsonMissing.of(),
            @JsonProperty("ConferenceTrim")
            @ExcludeMissing
            conferenceTrim: JsonField<ConferenceTrim> = JsonMissing.of(),
            @JsonProperty("EarlyMedia")
            @ExcludeMissing
            earlyMedia: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("EndConferenceOnExit")
            @ExcludeMissing
            endConferenceOnExit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("From") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("MachineDetection")
            @ExcludeMissing
            machineDetection: JsonField<MachineDetection> = JsonMissing.of(),
            @JsonProperty("MachineDetectionSilenceTimeout")
            @ExcludeMissing
            machineDetectionSilenceTimeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("MachineDetectionSpeechEndThreshold")
            @ExcludeMissing
            machineDetectionSpeechEndThreshold: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("MachineDetectionSpeechThreshold")
            @ExcludeMissing
            machineDetectionSpeechThreshold: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("MachineDetectionTimeout")
            @ExcludeMissing
            machineDetectionTimeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("MaxParticipants")
            @ExcludeMissing
            maxParticipants: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("Muted") @ExcludeMissing muted: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("PreferredCodecs")
            @ExcludeMissing
            preferredCodecs: JsonField<String> = JsonMissing.of(),
            @JsonProperty("Record") @ExcludeMissing record: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("RecordingChannels")
            @ExcludeMissing
            recordingChannels: JsonField<RecordingChannels> = JsonMissing.of(),
            @JsonProperty("RecordingStatusCallback")
            @ExcludeMissing
            recordingStatusCallback: JsonField<String> = JsonMissing.of(),
            @JsonProperty("RecordingStatusCallbackEvent")
            @ExcludeMissing
            recordingStatusCallbackEvent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("RecordingStatusCallbackMethod")
            @ExcludeMissing
            recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod> =
                JsonMissing.of(),
            @JsonProperty("RecordingTrack")
            @ExcludeMissing
            recordingTrack: JsonField<RecordingTrack> = JsonMissing.of(),
            @JsonProperty("SipAuthPassword")
            @ExcludeMissing
            sipAuthPassword: JsonField<String> = JsonMissing.of(),
            @JsonProperty("SipAuthUsername")
            @ExcludeMissing
            sipAuthUsername: JsonField<String> = JsonMissing.of(),
            @JsonProperty("StartConferenceOnEnter")
            @ExcludeMissing
            startConferenceOnEnter: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("StatusCallback")
            @ExcludeMissing
            statusCallback: JsonField<String> = JsonMissing.of(),
            @JsonProperty("StatusCallbackEvent")
            @ExcludeMissing
            statusCallbackEvent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("StatusCallbackMethod")
            @ExcludeMissing
            statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of(),
            @JsonProperty("TimeLimit")
            @ExcludeMissing
            timeLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("Timeout") @ExcludeMissing timeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("To") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
            @JsonProperty("Trim") @ExcludeMissing trim: JsonField<Trim> = JsonMissing.of(),
            @JsonProperty("WaitUrl") @ExcludeMissing waitUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            amdStatusCallback,
            amdStatusCallbackMethod,
            beep,
            callerId,
            callSidToCoach,
            cancelPlaybackOnDetectMessageEnd,
            cancelPlaybackOnMachineDetection,
            coaching,
            conferenceRecord,
            conferenceRecordingStatusCallback,
            conferenceRecordingStatusCallbackEvent,
            conferenceRecordingStatusCallbackMethod,
            conferenceRecordingTimeout,
            conferenceStatusCallback,
            conferenceStatusCallbackEvent,
            conferenceStatusCallbackMethod,
            conferenceTrim,
            earlyMedia,
            endConferenceOnExit,
            from,
            machineDetection,
            machineDetectionSilenceTimeout,
            machineDetectionSpeechEndThreshold,
            machineDetectionSpeechThreshold,
            machineDetectionTimeout,
            maxParticipants,
            muted,
            preferredCodecs,
            record,
            recordingChannels,
            recordingStatusCallback,
            recordingStatusCallbackEvent,
            recordingStatusCallbackMethod,
            recordingTrack,
            sipAuthPassword,
            sipAuthUsername,
            startConferenceOnEnter,
            statusCallback,
            statusCallbackEvent,
            statusCallbackMethod,
            timeLimit,
            timeout,
            to,
            trim,
            waitUrl,
            mutableMapOf(),
        )

        /**
         * The URL the result of answering machine detection will be sent to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amdStatusCallback(): Optional<String> =
            amdStatusCallback.getOptional("AmdStatusCallback")

        /**
         * HTTP request type used for `AmdStatusCallback`. Defaults to `POST`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amdStatusCallbackMethod(): Optional<AmdStatusCallbackMethod> =
            amdStatusCallbackMethod.getOptional("AmdStatusCallbackMethod")

        /**
         * Whether to play a notification beep to the conference when the participant enters and
         * exits.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun beep(): Optional<Beep> = beep.getOptional("Beep")

        /**
         * To be used as the caller id name (SIP From Display Name) presented to the destination
         * (`To` number). The string should have a maximum of 128 characters, containing only
         * letters, numbers, spaces, and `-_~!.+` special characters. If ommited, the display name
         * will be the same as the number in the `From` field.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callerId(): Optional<String> = callerId.getOptional("CallerId")

        /**
         * The SID of the participant who is being coached. The participant being coached is the
         * only participant who can hear the participant who is coaching.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callSidToCoach(): Optional<String> = callSidToCoach.getOptional("CallSidToCoach")

        /**
         * Whether to cancel ongoing playback on `greeting ended` detection. Defaults to `true`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cancelPlaybackOnDetectMessageEnd(): Optional<Boolean> =
            cancelPlaybackOnDetectMessageEnd.getOptional("CancelPlaybackOnDetectMessageEnd")

        /**
         * Whether to cancel ongoing playback on `machine` detection. Defaults to `true`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cancelPlaybackOnMachineDetection(): Optional<Boolean> =
            cancelPlaybackOnMachineDetection.getOptional("CancelPlaybackOnMachineDetection")

        /**
         * Whether the participant is coaching another call. When `true`, `CallSidToCoach` has to be
         * given.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun coaching(): Optional<Boolean> = coaching.getOptional("Coaching")

        /**
         * Whether to record the conference the participant is joining. Defualts to `do-not-record`.
         * The boolean values `true` and `false` are synonymous with `record-from-start` and
         * `do-not-record` respectively.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conferenceRecord(): Optional<ConferenceRecord> =
            conferenceRecord.getOptional("ConferenceRecord")

        /**
         * The URL the conference recording callbacks will be sent to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conferenceRecordingStatusCallback(): Optional<String> =
            conferenceRecordingStatusCallback.getOptional("ConferenceRecordingStatusCallback")

        /**
         * The changes to the conference recording's state that should generate a call to
         * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
         * multiple values with a space. Defaults to `completed`. `failed` and `absent` are
         * synonymous.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conferenceRecordingStatusCallbackEvent(): Optional<String> =
            conferenceRecordingStatusCallbackEvent.getOptional(
                "ConferenceRecordingStatusCallbackEvent"
            )

        /**
         * HTTP request type used for `ConferenceRecordingStatusCallback`. Defaults to `POST`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conferenceRecordingStatusCallbackMethod():
            Optional<ConferenceRecordingStatusCallbackMethod> =
            conferenceRecordingStatusCallbackMethod.getOptional(
                "ConferenceRecordingStatusCallbackMethod"
            )

        /**
         * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
         * detected. The timer only starts when the speech is detected. Please note that the
         * transcription is used to detect silence and the related charge will be applied. The
         * minimum value is 0. The default value is 0 (infinite)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conferenceRecordingTimeout(): Optional<Long> =
            conferenceRecordingTimeout.getOptional("ConferenceRecordingTimeout")

        /**
         * The URL the conference callbacks will be sent to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conferenceStatusCallback(): Optional<String> =
            conferenceStatusCallback.getOptional("ConferenceStatusCallback")

        /**
         * The changes to the conference's state that should generate a call to
         * `ConferenceStatusCallback`. Can be: `start`, `end`, `join` and `leave`. Separate multiple
         * values with a space. By default no callbacks are sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conferenceStatusCallbackEvent(): Optional<String> =
            conferenceStatusCallbackEvent.getOptional("ConferenceStatusCallbackEvent")

        /**
         * HTTP request type used for `ConferenceStatusCallback`. Defaults to `POST`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conferenceStatusCallbackMethod(): Optional<ConferenceStatusCallbackMethod> =
            conferenceStatusCallbackMethod.getOptional("ConferenceStatusCallbackMethod")

        /**
         * Whether to trim any leading and trailing silence from the conference recording. Defaults
         * to `trim-silence`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conferenceTrim(): Optional<ConferenceTrim> =
            conferenceTrim.getOptional("ConferenceTrim")

        /**
         * Whether participant shall be bridged to conference before the participant answers (from
         * early media if available). Defaults to `false`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun earlyMedia(): Optional<Boolean> = earlyMedia.getOptional("EarlyMedia")

        /**
         * Whether to end the conference when the participant leaves. Defaults to `false`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endConferenceOnExit(): Optional<Boolean> =
            endConferenceOnExit.getOptional("EndConferenceOnExit")

        /**
         * The phone number of the party that initiated the call. Phone numbers are formatted with a
         * `+` and country code.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun from(): Optional<String> = from.getOptional("From")

        /**
         * Whether to detect if a human or an answering machine picked up the call. Use `Enable` if
         * you would like to ne notified as soon as the called party is identified. Use
         * `DetectMessageEnd`, if you would like to leave a message on an answering machine.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun machineDetection(): Optional<MachineDetection> =
            machineDetection.getOptional("MachineDetection")

        /**
         * If initial silence duration is greater than this value, consider it a machine. Ignored
         * when `premium` detection is used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun machineDetectionSilenceTimeout(): Optional<Long> =
            machineDetectionSilenceTimeout.getOptional("MachineDetectionSilenceTimeout")

        /**
         * Silence duration threshold after a greeting message or voice for it be considered human.
         * Ignored when `premium` detection is used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun machineDetectionSpeechEndThreshold(): Optional<Long> =
            machineDetectionSpeechEndThreshold.getOptional("MachineDetectionSpeechEndThreshold")

        /**
         * Maximum threshold of a human greeting. If greeting longer than this value, considered
         * machine. Ignored when `premium` detection is used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun machineDetectionSpeechThreshold(): Optional<Long> =
            machineDetectionSpeechThreshold.getOptional("MachineDetectionSpeechThreshold")

        /**
         * How long answering machine detection should go on for before sending an `Unknown` result.
         * Given in milliseconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun machineDetectionTimeout(): Optional<Long> =
            machineDetectionTimeout.getOptional("MachineDetectionTimeout")

        /**
         * The maximum number of participants in the conference. Can be a positive integer from 2
         * to 800. The default value is 250.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxParticipants(): Optional<Long> = maxParticipants.getOptional("MaxParticipants")

        /**
         * Whether the participant should be muted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun muted(): Optional<Boolean> = muted.getOptional("Muted")

        /**
         * The list of comma-separated codecs to be offered on a call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun preferredCodecs(): Optional<String> = preferredCodecs.getOptional("PreferredCodecs")

        /**
         * Whether to record the entire participant's call leg. Defaults to `false`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun record(): Optional<Boolean> = record.getOptional("Record")

        /**
         * The number of channels in the final recording. Defaults to `mono`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingChannels(): Optional<RecordingChannels> =
            recordingChannels.getOptional("RecordingChannels")

        /**
         * The URL the recording callbacks will be sent to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingStatusCallback(): Optional<String> =
            recordingStatusCallback.getOptional("RecordingStatusCallback")

        /**
         * The changes to the recording's state that should generate a call to
         * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
         * multiple values with a space. Defaults to `completed`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingStatusCallbackEvent(): Optional<String> =
            recordingStatusCallbackEvent.getOptional("RecordingStatusCallbackEvent")

        /**
         * HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingStatusCallbackMethod(): Optional<RecordingStatusCallbackMethod> =
            recordingStatusCallbackMethod.getOptional("RecordingStatusCallbackMethod")

        /**
         * The audio track to record for the call. The default is `both`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingTrack(): Optional<RecordingTrack> =
            recordingTrack.getOptional("RecordingTrack")

        /**
         * The password to use for SIP authentication.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipAuthPassword(): Optional<String> = sipAuthPassword.getOptional("SipAuthPassword")

        /**
         * The username to use for SIP authentication.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipAuthUsername(): Optional<String> = sipAuthUsername.getOptional("SipAuthUsername")

        /**
         * Whether to start the conference when the participant enters. Defaults to `true`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startConferenceOnEnter(): Optional<Boolean> =
            startConferenceOnEnter.getOptional("StartConferenceOnEnter")

        /**
         * URL destination for Telnyx to send status callback events to for the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCallback(): Optional<String> = statusCallback.getOptional("StatusCallback")

        /**
         * The changes to the call's state that should generate a call to `StatusCallback`. Can be:
         * `initiated`, `ringing`, `answered`, and `completed`. Separate multiple values with a
         * space. The default value is `completed`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCallbackEvent(): Optional<String> =
            statusCallbackEvent.getOptional("StatusCallbackEvent")

        /**
         * HTTP request type used for `StatusCallback`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCallbackMethod(): Optional<StatusCallbackMethod> =
            statusCallbackMethod.getOptional("StatusCallbackMethod")

        /**
         * The maximum duration of the call in seconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeLimit(): Optional<Long> = timeLimit.getOptional("TimeLimit")

        /**
         * The number of seconds that we should allow the phone to ring before assuming there is no
         * answer. Can be an integer between 5 and 120, inclusive. The default value is 30.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Optional<Long> = timeout.getOptional("Timeout")

        /**
         * The phone number of the called party. Phone numbers are formatted with a `+` and country
         * code.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun to(): Optional<String> = to.getOptional("To")

        /**
         * Whether to trim any leading and trailing silence from the recording. Defaults to
         * `trim-silence`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trim(): Optional<Trim> = trim.getOptional("Trim")

        /**
         * The URL to call for an audio file to play while the participant is waiting for the
         * conference to start.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun waitUrl(): Optional<String> = waitUrl.getOptional("WaitUrl")

        /**
         * Returns the raw JSON value of [amdStatusCallback].
         *
         * Unlike [amdStatusCallback], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("AmdStatusCallback")
        @ExcludeMissing
        fun _amdStatusCallback(): JsonField<String> = amdStatusCallback

        /**
         * Returns the raw JSON value of [amdStatusCallbackMethod].
         *
         * Unlike [amdStatusCallbackMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("AmdStatusCallbackMethod")
        @ExcludeMissing
        fun _amdStatusCallbackMethod(): JsonField<AmdStatusCallbackMethod> = amdStatusCallbackMethod

        /**
         * Returns the raw JSON value of [beep].
         *
         * Unlike [beep], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Beep") @ExcludeMissing fun _beep(): JsonField<Beep> = beep

        /**
         * Returns the raw JSON value of [callerId].
         *
         * Unlike [callerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("CallerId") @ExcludeMissing fun _callerId(): JsonField<String> = callerId

        /**
         * Returns the raw JSON value of [callSidToCoach].
         *
         * Unlike [callSidToCoach], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("CallSidToCoach")
        @ExcludeMissing
        fun _callSidToCoach(): JsonField<String> = callSidToCoach

        /**
         * Returns the raw JSON value of [cancelPlaybackOnDetectMessageEnd].
         *
         * Unlike [cancelPlaybackOnDetectMessageEnd], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("CancelPlaybackOnDetectMessageEnd")
        @ExcludeMissing
        fun _cancelPlaybackOnDetectMessageEnd(): JsonField<Boolean> =
            cancelPlaybackOnDetectMessageEnd

        /**
         * Returns the raw JSON value of [cancelPlaybackOnMachineDetection].
         *
         * Unlike [cancelPlaybackOnMachineDetection], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("CancelPlaybackOnMachineDetection")
        @ExcludeMissing
        fun _cancelPlaybackOnMachineDetection(): JsonField<Boolean> =
            cancelPlaybackOnMachineDetection

        /**
         * Returns the raw JSON value of [coaching].
         *
         * Unlike [coaching], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Coaching") @ExcludeMissing fun _coaching(): JsonField<Boolean> = coaching

        /**
         * Returns the raw JSON value of [conferenceRecord].
         *
         * Unlike [conferenceRecord], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ConferenceRecord")
        @ExcludeMissing
        fun _conferenceRecord(): JsonField<ConferenceRecord> = conferenceRecord

        /**
         * Returns the raw JSON value of [conferenceRecordingStatusCallback].
         *
         * Unlike [conferenceRecordingStatusCallback], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("ConferenceRecordingStatusCallback")
        @ExcludeMissing
        fun _conferenceRecordingStatusCallback(): JsonField<String> =
            conferenceRecordingStatusCallback

        /**
         * Returns the raw JSON value of [conferenceRecordingStatusCallbackEvent].
         *
         * Unlike [conferenceRecordingStatusCallbackEvent], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("ConferenceRecordingStatusCallbackEvent")
        @ExcludeMissing
        fun _conferenceRecordingStatusCallbackEvent(): JsonField<String> =
            conferenceRecordingStatusCallbackEvent

        /**
         * Returns the raw JSON value of [conferenceRecordingStatusCallbackMethod].
         *
         * Unlike [conferenceRecordingStatusCallbackMethod], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("ConferenceRecordingStatusCallbackMethod")
        @ExcludeMissing
        fun _conferenceRecordingStatusCallbackMethod():
            JsonField<ConferenceRecordingStatusCallbackMethod> =
            conferenceRecordingStatusCallbackMethod

        /**
         * Returns the raw JSON value of [conferenceRecordingTimeout].
         *
         * Unlike [conferenceRecordingTimeout], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ConferenceRecordingTimeout")
        @ExcludeMissing
        fun _conferenceRecordingTimeout(): JsonField<Long> = conferenceRecordingTimeout

        /**
         * Returns the raw JSON value of [conferenceStatusCallback].
         *
         * Unlike [conferenceStatusCallback], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ConferenceStatusCallback")
        @ExcludeMissing
        fun _conferenceStatusCallback(): JsonField<String> = conferenceStatusCallback

        /**
         * Returns the raw JSON value of [conferenceStatusCallbackEvent].
         *
         * Unlike [conferenceStatusCallbackEvent], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("ConferenceStatusCallbackEvent")
        @ExcludeMissing
        fun _conferenceStatusCallbackEvent(): JsonField<String> = conferenceStatusCallbackEvent

        /**
         * Returns the raw JSON value of [conferenceStatusCallbackMethod].
         *
         * Unlike [conferenceStatusCallbackMethod], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("ConferenceStatusCallbackMethod")
        @ExcludeMissing
        fun _conferenceStatusCallbackMethod(): JsonField<ConferenceStatusCallbackMethod> =
            conferenceStatusCallbackMethod

        /**
         * Returns the raw JSON value of [conferenceTrim].
         *
         * Unlike [conferenceTrim], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ConferenceTrim")
        @ExcludeMissing
        fun _conferenceTrim(): JsonField<ConferenceTrim> = conferenceTrim

        /**
         * Returns the raw JSON value of [earlyMedia].
         *
         * Unlike [earlyMedia], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("EarlyMedia")
        @ExcludeMissing
        fun _earlyMedia(): JsonField<Boolean> = earlyMedia

        /**
         * Returns the raw JSON value of [endConferenceOnExit].
         *
         * Unlike [endConferenceOnExit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("EndConferenceOnExit")
        @ExcludeMissing
        fun _endConferenceOnExit(): JsonField<Boolean> = endConferenceOnExit

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("From") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [machineDetection].
         *
         * Unlike [machineDetection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("MachineDetection")
        @ExcludeMissing
        fun _machineDetection(): JsonField<MachineDetection> = machineDetection

        /**
         * Returns the raw JSON value of [machineDetectionSilenceTimeout].
         *
         * Unlike [machineDetectionSilenceTimeout], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("MachineDetectionSilenceTimeout")
        @ExcludeMissing
        fun _machineDetectionSilenceTimeout(): JsonField<Long> = machineDetectionSilenceTimeout

        /**
         * Returns the raw JSON value of [machineDetectionSpeechEndThreshold].
         *
         * Unlike [machineDetectionSpeechEndThreshold], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("MachineDetectionSpeechEndThreshold")
        @ExcludeMissing
        fun _machineDetectionSpeechEndThreshold(): JsonField<Long> =
            machineDetectionSpeechEndThreshold

        /**
         * Returns the raw JSON value of [machineDetectionSpeechThreshold].
         *
         * Unlike [machineDetectionSpeechThreshold], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("MachineDetectionSpeechThreshold")
        @ExcludeMissing
        fun _machineDetectionSpeechThreshold(): JsonField<Long> = machineDetectionSpeechThreshold

        /**
         * Returns the raw JSON value of [machineDetectionTimeout].
         *
         * Unlike [machineDetectionTimeout], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("MachineDetectionTimeout")
        @ExcludeMissing
        fun _machineDetectionTimeout(): JsonField<Long> = machineDetectionTimeout

        /**
         * Returns the raw JSON value of [maxParticipants].
         *
         * Unlike [maxParticipants], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("MaxParticipants")
        @ExcludeMissing
        fun _maxParticipants(): JsonField<Long> = maxParticipants

        /**
         * Returns the raw JSON value of [muted].
         *
         * Unlike [muted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Muted") @ExcludeMissing fun _muted(): JsonField<Boolean> = muted

        /**
         * Returns the raw JSON value of [preferredCodecs].
         *
         * Unlike [preferredCodecs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("PreferredCodecs")
        @ExcludeMissing
        fun _preferredCodecs(): JsonField<String> = preferredCodecs

        /**
         * Returns the raw JSON value of [record].
         *
         * Unlike [record], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Record") @ExcludeMissing fun _record(): JsonField<Boolean> = record

        /**
         * Returns the raw JSON value of [recordingChannels].
         *
         * Unlike [recordingChannels], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("RecordingChannels")
        @ExcludeMissing
        fun _recordingChannels(): JsonField<RecordingChannels> = recordingChannels

        /**
         * Returns the raw JSON value of [recordingStatusCallback].
         *
         * Unlike [recordingStatusCallback], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("RecordingStatusCallback")
        @ExcludeMissing
        fun _recordingStatusCallback(): JsonField<String> = recordingStatusCallback

        /**
         * Returns the raw JSON value of [recordingStatusCallbackEvent].
         *
         * Unlike [recordingStatusCallbackEvent], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("RecordingStatusCallbackEvent")
        @ExcludeMissing
        fun _recordingStatusCallbackEvent(): JsonField<String> = recordingStatusCallbackEvent

        /**
         * Returns the raw JSON value of [recordingStatusCallbackMethod].
         *
         * Unlike [recordingStatusCallbackMethod], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("RecordingStatusCallbackMethod")
        @ExcludeMissing
        fun _recordingStatusCallbackMethod(): JsonField<RecordingStatusCallbackMethod> =
            recordingStatusCallbackMethod

        /**
         * Returns the raw JSON value of [recordingTrack].
         *
         * Unlike [recordingTrack], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("RecordingTrack")
        @ExcludeMissing
        fun _recordingTrack(): JsonField<RecordingTrack> = recordingTrack

        /**
         * Returns the raw JSON value of [sipAuthPassword].
         *
         * Unlike [sipAuthPassword], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("SipAuthPassword")
        @ExcludeMissing
        fun _sipAuthPassword(): JsonField<String> = sipAuthPassword

        /**
         * Returns the raw JSON value of [sipAuthUsername].
         *
         * Unlike [sipAuthUsername], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("SipAuthUsername")
        @ExcludeMissing
        fun _sipAuthUsername(): JsonField<String> = sipAuthUsername

        /**
         * Returns the raw JSON value of [startConferenceOnEnter].
         *
         * Unlike [startConferenceOnEnter], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("StartConferenceOnEnter")
        @ExcludeMissing
        fun _startConferenceOnEnter(): JsonField<Boolean> = startConferenceOnEnter

        /**
         * Returns the raw JSON value of [statusCallback].
         *
         * Unlike [statusCallback], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("StatusCallback")
        @ExcludeMissing
        fun _statusCallback(): JsonField<String> = statusCallback

        /**
         * Returns the raw JSON value of [statusCallbackEvent].
         *
         * Unlike [statusCallbackEvent], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("StatusCallbackEvent")
        @ExcludeMissing
        fun _statusCallbackEvent(): JsonField<String> = statusCallbackEvent

        /**
         * Returns the raw JSON value of [statusCallbackMethod].
         *
         * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("StatusCallbackMethod")
        @ExcludeMissing
        fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = statusCallbackMethod

        /**
         * Returns the raw JSON value of [timeLimit].
         *
         * Unlike [timeLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("TimeLimit") @ExcludeMissing fun _timeLimit(): JsonField<Long> = timeLimit

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Timeout") @ExcludeMissing fun _timeout(): JsonField<Long> = timeout

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("To") @ExcludeMissing fun _to(): JsonField<String> = to

        /**
         * Returns the raw JSON value of [trim].
         *
         * Unlike [trim], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Trim") @ExcludeMissing fun _trim(): JsonField<Trim> = trim

        /**
         * Returns the raw JSON value of [waitUrl].
         *
         * Unlike [waitUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("WaitUrl") @ExcludeMissing fun _waitUrl(): JsonField<String> = waitUrl

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amdStatusCallback: JsonField<String> = JsonMissing.of()
            private var amdStatusCallbackMethod: JsonField<AmdStatusCallbackMethod> =
                JsonMissing.of()
            private var beep: JsonField<Beep> = JsonMissing.of()
            private var callerId: JsonField<String> = JsonMissing.of()
            private var callSidToCoach: JsonField<String> = JsonMissing.of()
            private var cancelPlaybackOnDetectMessageEnd: JsonField<Boolean> = JsonMissing.of()
            private var cancelPlaybackOnMachineDetection: JsonField<Boolean> = JsonMissing.of()
            private var coaching: JsonField<Boolean> = JsonMissing.of()
            private var conferenceRecord: JsonField<ConferenceRecord> = JsonMissing.of()
            private var conferenceRecordingStatusCallback: JsonField<String> = JsonMissing.of()
            private var conferenceRecordingStatusCallbackEvent: JsonField<String> = JsonMissing.of()
            private var conferenceRecordingStatusCallbackMethod:
                JsonField<ConferenceRecordingStatusCallbackMethod> =
                JsonMissing.of()
            private var conferenceRecordingTimeout: JsonField<Long> = JsonMissing.of()
            private var conferenceStatusCallback: JsonField<String> = JsonMissing.of()
            private var conferenceStatusCallbackEvent: JsonField<String> = JsonMissing.of()
            private var conferenceStatusCallbackMethod: JsonField<ConferenceStatusCallbackMethod> =
                JsonMissing.of()
            private var conferenceTrim: JsonField<ConferenceTrim> = JsonMissing.of()
            private var earlyMedia: JsonField<Boolean> = JsonMissing.of()
            private var endConferenceOnExit: JsonField<Boolean> = JsonMissing.of()
            private var from: JsonField<String> = JsonMissing.of()
            private var machineDetection: JsonField<MachineDetection> = JsonMissing.of()
            private var machineDetectionSilenceTimeout: JsonField<Long> = JsonMissing.of()
            private var machineDetectionSpeechEndThreshold: JsonField<Long> = JsonMissing.of()
            private var machineDetectionSpeechThreshold: JsonField<Long> = JsonMissing.of()
            private var machineDetectionTimeout: JsonField<Long> = JsonMissing.of()
            private var maxParticipants: JsonField<Long> = JsonMissing.of()
            private var muted: JsonField<Boolean> = JsonMissing.of()
            private var preferredCodecs: JsonField<String> = JsonMissing.of()
            private var record: JsonField<Boolean> = JsonMissing.of()
            private var recordingChannels: JsonField<RecordingChannels> = JsonMissing.of()
            private var recordingStatusCallback: JsonField<String> = JsonMissing.of()
            private var recordingStatusCallbackEvent: JsonField<String> = JsonMissing.of()
            private var recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod> =
                JsonMissing.of()
            private var recordingTrack: JsonField<RecordingTrack> = JsonMissing.of()
            private var sipAuthPassword: JsonField<String> = JsonMissing.of()
            private var sipAuthUsername: JsonField<String> = JsonMissing.of()
            private var startConferenceOnEnter: JsonField<Boolean> = JsonMissing.of()
            private var statusCallback: JsonField<String> = JsonMissing.of()
            private var statusCallbackEvent: JsonField<String> = JsonMissing.of()
            private var statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of()
            private var timeLimit: JsonField<Long> = JsonMissing.of()
            private var timeout: JsonField<Long> = JsonMissing.of()
            private var to: JsonField<String> = JsonMissing.of()
            private var trim: JsonField<Trim> = JsonMissing.of()
            private var waitUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                amdStatusCallback = body.amdStatusCallback
                amdStatusCallbackMethod = body.amdStatusCallbackMethod
                beep = body.beep
                callerId = body.callerId
                callSidToCoach = body.callSidToCoach
                cancelPlaybackOnDetectMessageEnd = body.cancelPlaybackOnDetectMessageEnd
                cancelPlaybackOnMachineDetection = body.cancelPlaybackOnMachineDetection
                coaching = body.coaching
                conferenceRecord = body.conferenceRecord
                conferenceRecordingStatusCallback = body.conferenceRecordingStatusCallback
                conferenceRecordingStatusCallbackEvent = body.conferenceRecordingStatusCallbackEvent
                conferenceRecordingStatusCallbackMethod =
                    body.conferenceRecordingStatusCallbackMethod
                conferenceRecordingTimeout = body.conferenceRecordingTimeout
                conferenceStatusCallback = body.conferenceStatusCallback
                conferenceStatusCallbackEvent = body.conferenceStatusCallbackEvent
                conferenceStatusCallbackMethod = body.conferenceStatusCallbackMethod
                conferenceTrim = body.conferenceTrim
                earlyMedia = body.earlyMedia
                endConferenceOnExit = body.endConferenceOnExit
                from = body.from
                machineDetection = body.machineDetection
                machineDetectionSilenceTimeout = body.machineDetectionSilenceTimeout
                machineDetectionSpeechEndThreshold = body.machineDetectionSpeechEndThreshold
                machineDetectionSpeechThreshold = body.machineDetectionSpeechThreshold
                machineDetectionTimeout = body.machineDetectionTimeout
                maxParticipants = body.maxParticipants
                muted = body.muted
                preferredCodecs = body.preferredCodecs
                record = body.record
                recordingChannels = body.recordingChannels
                recordingStatusCallback = body.recordingStatusCallback
                recordingStatusCallbackEvent = body.recordingStatusCallbackEvent
                recordingStatusCallbackMethod = body.recordingStatusCallbackMethod
                recordingTrack = body.recordingTrack
                sipAuthPassword = body.sipAuthPassword
                sipAuthUsername = body.sipAuthUsername
                startConferenceOnEnter = body.startConferenceOnEnter
                statusCallback = body.statusCallback
                statusCallbackEvent = body.statusCallbackEvent
                statusCallbackMethod = body.statusCallbackMethod
                timeLimit = body.timeLimit
                timeout = body.timeout
                to = body.to
                trim = body.trim
                waitUrl = body.waitUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The URL the result of answering machine detection will be sent to. */
            fun amdStatusCallback(amdStatusCallback: String) =
                amdStatusCallback(JsonField.of(amdStatusCallback))

            /**
             * Sets [Builder.amdStatusCallback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amdStatusCallback] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amdStatusCallback(amdStatusCallback: JsonField<String>) = apply {
                this.amdStatusCallback = amdStatusCallback
            }

            /** HTTP request type used for `AmdStatusCallback`. Defaults to `POST`. */
            fun amdStatusCallbackMethod(amdStatusCallbackMethod: AmdStatusCallbackMethod) =
                amdStatusCallbackMethod(JsonField.of(amdStatusCallbackMethod))

            /**
             * Sets [Builder.amdStatusCallbackMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amdStatusCallbackMethod] with a well-typed
             * [AmdStatusCallbackMethod] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun amdStatusCallbackMethod(
                amdStatusCallbackMethod: JsonField<AmdStatusCallbackMethod>
            ) = apply { this.amdStatusCallbackMethod = amdStatusCallbackMethod }

            /**
             * Whether to play a notification beep to the conference when the participant enters and
             * exits.
             */
            fun beep(beep: Beep) = beep(JsonField.of(beep))

            /**
             * Sets [Builder.beep] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beep] with a well-typed [Beep] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun beep(beep: JsonField<Beep>) = apply { this.beep = beep }

            /**
             * To be used as the caller id name (SIP From Display Name) presented to the destination
             * (`To` number). The string should have a maximum of 128 characters, containing only
             * letters, numbers, spaces, and `-_~!.+` special characters. If ommited, the display
             * name will be the same as the number in the `From` field.
             */
            fun callerId(callerId: String) = callerId(JsonField.of(callerId))

            /**
             * Sets [Builder.callerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callerId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callerId(callerId: JsonField<String>) = apply { this.callerId = callerId }

            /**
             * The SID of the participant who is being coached. The participant being coached is the
             * only participant who can hear the participant who is coaching.
             */
            fun callSidToCoach(callSidToCoach: String) =
                callSidToCoach(JsonField.of(callSidToCoach))

            /**
             * Sets [Builder.callSidToCoach] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSidToCoach] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSidToCoach(callSidToCoach: JsonField<String>) = apply {
                this.callSidToCoach = callSidToCoach
            }

            /**
             * Whether to cancel ongoing playback on `greeting ended` detection. Defaults to `true`.
             */
            fun cancelPlaybackOnDetectMessageEnd(cancelPlaybackOnDetectMessageEnd: Boolean) =
                cancelPlaybackOnDetectMessageEnd(JsonField.of(cancelPlaybackOnDetectMessageEnd))

            /**
             * Sets [Builder.cancelPlaybackOnDetectMessageEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelPlaybackOnDetectMessageEnd] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun cancelPlaybackOnDetectMessageEnd(
                cancelPlaybackOnDetectMessageEnd: JsonField<Boolean>
            ) = apply { this.cancelPlaybackOnDetectMessageEnd = cancelPlaybackOnDetectMessageEnd }

            /** Whether to cancel ongoing playback on `machine` detection. Defaults to `true`. */
            fun cancelPlaybackOnMachineDetection(cancelPlaybackOnMachineDetection: Boolean) =
                cancelPlaybackOnMachineDetection(JsonField.of(cancelPlaybackOnMachineDetection))

            /**
             * Sets [Builder.cancelPlaybackOnMachineDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelPlaybackOnMachineDetection] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun cancelPlaybackOnMachineDetection(
                cancelPlaybackOnMachineDetection: JsonField<Boolean>
            ) = apply { this.cancelPlaybackOnMachineDetection = cancelPlaybackOnMachineDetection }

            /**
             * Whether the participant is coaching another call. When `true`, `CallSidToCoach` has
             * to be given.
             */
            fun coaching(coaching: Boolean) = coaching(JsonField.of(coaching))

            /**
             * Sets [Builder.coaching] to an arbitrary JSON value.
             *
             * You should usually call [Builder.coaching] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun coaching(coaching: JsonField<Boolean>) = apply { this.coaching = coaching }

            /**
             * Whether to record the conference the participant is joining. Defualts to
             * `do-not-record`. The boolean values `true` and `false` are synonymous with
             * `record-from-start` and `do-not-record` respectively.
             */
            fun conferenceRecord(conferenceRecord: ConferenceRecord) =
                conferenceRecord(JsonField.of(conferenceRecord))

            /**
             * Sets [Builder.conferenceRecord] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conferenceRecord] with a well-typed
             * [ConferenceRecord] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun conferenceRecord(conferenceRecord: JsonField<ConferenceRecord>) = apply {
                this.conferenceRecord = conferenceRecord
            }

            /** The URL the conference recording callbacks will be sent to. */
            fun conferenceRecordingStatusCallback(conferenceRecordingStatusCallback: String) =
                conferenceRecordingStatusCallback(JsonField.of(conferenceRecordingStatusCallback))

            /**
             * Sets [Builder.conferenceRecordingStatusCallback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conferenceRecordingStatusCallback] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun conferenceRecordingStatusCallback(
                conferenceRecordingStatusCallback: JsonField<String>
            ) = apply { this.conferenceRecordingStatusCallback = conferenceRecordingStatusCallback }

            /**
             * The changes to the conference recording's state that should generate a call to
             * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
             * multiple values with a space. Defaults to `completed`. `failed` and `absent` are
             * synonymous.
             */
            fun conferenceRecordingStatusCallbackEvent(
                conferenceRecordingStatusCallbackEvent: String
            ) =
                conferenceRecordingStatusCallbackEvent(
                    JsonField.of(conferenceRecordingStatusCallbackEvent)
                )

            /**
             * Sets [Builder.conferenceRecordingStatusCallbackEvent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conferenceRecordingStatusCallbackEvent] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun conferenceRecordingStatusCallbackEvent(
                conferenceRecordingStatusCallbackEvent: JsonField<String>
            ) = apply {
                this.conferenceRecordingStatusCallbackEvent = conferenceRecordingStatusCallbackEvent
            }

            /**
             * HTTP request type used for `ConferenceRecordingStatusCallback`. Defaults to `POST`.
             */
            fun conferenceRecordingStatusCallbackMethod(
                conferenceRecordingStatusCallbackMethod: ConferenceRecordingStatusCallbackMethod
            ) =
                conferenceRecordingStatusCallbackMethod(
                    JsonField.of(conferenceRecordingStatusCallbackMethod)
                )

            /**
             * Sets [Builder.conferenceRecordingStatusCallbackMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conferenceRecordingStatusCallbackMethod] with a
             * well-typed [ConferenceRecordingStatusCallbackMethod] value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun conferenceRecordingStatusCallbackMethod(
                conferenceRecordingStatusCallbackMethod:
                    JsonField<ConferenceRecordingStatusCallbackMethod>
            ) = apply {
                this.conferenceRecordingStatusCallbackMethod =
                    conferenceRecordingStatusCallbackMethod
            }

            /**
             * The number of seconds that Telnyx will wait for the recording to be stopped if
             * silence is detected. The timer only starts when the speech is detected. Please note
             * that the transcription is used to detect silence and the related charge will be
             * applied. The minimum value is 0. The default value is 0 (infinite)
             */
            fun conferenceRecordingTimeout(conferenceRecordingTimeout: Long) =
                conferenceRecordingTimeout(JsonField.of(conferenceRecordingTimeout))

            /**
             * Sets [Builder.conferenceRecordingTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conferenceRecordingTimeout] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun conferenceRecordingTimeout(conferenceRecordingTimeout: JsonField<Long>) = apply {
                this.conferenceRecordingTimeout = conferenceRecordingTimeout
            }

            /** The URL the conference callbacks will be sent to. */
            fun conferenceStatusCallback(conferenceStatusCallback: String) =
                conferenceStatusCallback(JsonField.of(conferenceStatusCallback))

            /**
             * Sets [Builder.conferenceStatusCallback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conferenceStatusCallback] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun conferenceStatusCallback(conferenceStatusCallback: JsonField<String>) = apply {
                this.conferenceStatusCallback = conferenceStatusCallback
            }

            /**
             * The changes to the conference's state that should generate a call to
             * `ConferenceStatusCallback`. Can be: `start`, `end`, `join` and `leave`. Separate
             * multiple values with a space. By default no callbacks are sent.
             */
            fun conferenceStatusCallbackEvent(conferenceStatusCallbackEvent: String) =
                conferenceStatusCallbackEvent(JsonField.of(conferenceStatusCallbackEvent))

            /**
             * Sets [Builder.conferenceStatusCallbackEvent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conferenceStatusCallbackEvent] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun conferenceStatusCallbackEvent(conferenceStatusCallbackEvent: JsonField<String>) =
                apply {
                    this.conferenceStatusCallbackEvent = conferenceStatusCallbackEvent
                }

            /** HTTP request type used for `ConferenceStatusCallback`. Defaults to `POST`. */
            fun conferenceStatusCallbackMethod(
                conferenceStatusCallbackMethod: ConferenceStatusCallbackMethod
            ) = conferenceStatusCallbackMethod(JsonField.of(conferenceStatusCallbackMethod))

            /**
             * Sets [Builder.conferenceStatusCallbackMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conferenceStatusCallbackMethod] with a well-typed
             * [ConferenceStatusCallbackMethod] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun conferenceStatusCallbackMethod(
                conferenceStatusCallbackMethod: JsonField<ConferenceStatusCallbackMethod>
            ) = apply { this.conferenceStatusCallbackMethod = conferenceStatusCallbackMethod }

            /**
             * Whether to trim any leading and trailing silence from the conference recording.
             * Defaults to `trim-silence`.
             */
            fun conferenceTrim(conferenceTrim: ConferenceTrim) =
                conferenceTrim(JsonField.of(conferenceTrim))

            /**
             * Sets [Builder.conferenceTrim] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conferenceTrim] with a well-typed [ConferenceTrim]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun conferenceTrim(conferenceTrim: JsonField<ConferenceTrim>) = apply {
                this.conferenceTrim = conferenceTrim
            }

            /**
             * Whether participant shall be bridged to conference before the participant answers
             * (from early media if available). Defaults to `false`.
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

            /** Whether to end the conference when the participant leaves. Defaults to `false`. */
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
             * The phone number of the party that initiated the call. Phone numbers are formatted
             * with a `+` and country code.
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
             * Whether to detect if a human or an answering machine picked up the call. Use `Enable`
             * if you would like to ne notified as soon as the called party is identified. Use
             * `DetectMessageEnd`, if you would like to leave a message on an answering machine.
             */
            fun machineDetection(machineDetection: MachineDetection) =
                machineDetection(JsonField.of(machineDetection))

            /**
             * Sets [Builder.machineDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.machineDetection] with a well-typed
             * [MachineDetection] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun machineDetection(machineDetection: JsonField<MachineDetection>) = apply {
                this.machineDetection = machineDetection
            }

            /**
             * If initial silence duration is greater than this value, consider it a machine.
             * Ignored when `premium` detection is used.
             */
            fun machineDetectionSilenceTimeout(machineDetectionSilenceTimeout: Long) =
                machineDetectionSilenceTimeout(JsonField.of(machineDetectionSilenceTimeout))

            /**
             * Sets [Builder.machineDetectionSilenceTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.machineDetectionSilenceTimeout] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun machineDetectionSilenceTimeout(machineDetectionSilenceTimeout: JsonField<Long>) =
                apply {
                    this.machineDetectionSilenceTimeout = machineDetectionSilenceTimeout
                }

            /**
             * Silence duration threshold after a greeting message or voice for it be considered
             * human. Ignored when `premium` detection is used.
             */
            fun machineDetectionSpeechEndThreshold(machineDetectionSpeechEndThreshold: Long) =
                machineDetectionSpeechEndThreshold(JsonField.of(machineDetectionSpeechEndThreshold))

            /**
             * Sets [Builder.machineDetectionSpeechEndThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.machineDetectionSpeechEndThreshold] with a
             * well-typed [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun machineDetectionSpeechEndThreshold(
                machineDetectionSpeechEndThreshold: JsonField<Long>
            ) = apply {
                this.machineDetectionSpeechEndThreshold = machineDetectionSpeechEndThreshold
            }

            /**
             * Maximum threshold of a human greeting. If greeting longer than this value, considered
             * machine. Ignored when `premium` detection is used.
             */
            fun machineDetectionSpeechThreshold(machineDetectionSpeechThreshold: Long) =
                machineDetectionSpeechThreshold(JsonField.of(machineDetectionSpeechThreshold))

            /**
             * Sets [Builder.machineDetectionSpeechThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.machineDetectionSpeechThreshold] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun machineDetectionSpeechThreshold(machineDetectionSpeechThreshold: JsonField<Long>) =
                apply {
                    this.machineDetectionSpeechThreshold = machineDetectionSpeechThreshold
                }

            /**
             * How long answering machine detection should go on for before sending an `Unknown`
             * result. Given in milliseconds.
             */
            fun machineDetectionTimeout(machineDetectionTimeout: Long) =
                machineDetectionTimeout(JsonField.of(machineDetectionTimeout))

            /**
             * Sets [Builder.machineDetectionTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.machineDetectionTimeout] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun machineDetectionTimeout(machineDetectionTimeout: JsonField<Long>) = apply {
                this.machineDetectionTimeout = machineDetectionTimeout
            }

            /**
             * The maximum number of participants in the conference. Can be a positive integer from
             * 2 to 800. The default value is 250.
             */
            fun maxParticipants(maxParticipants: Long) =
                maxParticipants(JsonField.of(maxParticipants))

            /**
             * Sets [Builder.maxParticipants] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxParticipants] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxParticipants(maxParticipants: JsonField<Long>) = apply {
                this.maxParticipants = maxParticipants
            }

            /** Whether the participant should be muted. */
            fun muted(muted: Boolean) = muted(JsonField.of(muted))

            /**
             * Sets [Builder.muted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.muted] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun muted(muted: JsonField<Boolean>) = apply { this.muted = muted }

            /** The list of comma-separated codecs to be offered on a call. */
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

            /** Whether to record the entire participant's call leg. Defaults to `false`. */
            fun record(record: Boolean) = record(JsonField.of(record))

            /**
             * Sets [Builder.record] to an arbitrary JSON value.
             *
             * You should usually call [Builder.record] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun record(record: JsonField<Boolean>) = apply { this.record = record }

            /** The number of channels in the final recording. Defaults to `mono`. */
            fun recordingChannels(recordingChannels: RecordingChannels) =
                recordingChannels(JsonField.of(recordingChannels))

            /**
             * Sets [Builder.recordingChannels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingChannels] with a well-typed
             * [RecordingChannels] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun recordingChannels(recordingChannels: JsonField<RecordingChannels>) = apply {
                this.recordingChannels = recordingChannels
            }

            /** The URL the recording callbacks will be sent to. */
            fun recordingStatusCallback(recordingStatusCallback: String) =
                recordingStatusCallback(JsonField.of(recordingStatusCallback))

            /**
             * Sets [Builder.recordingStatusCallback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingStatusCallback] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recordingStatusCallback(recordingStatusCallback: JsonField<String>) = apply {
                this.recordingStatusCallback = recordingStatusCallback
            }

            /**
             * The changes to the recording's state that should generate a call to
             * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
             * multiple values with a space. Defaults to `completed`.
             */
            fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: String) =
                recordingStatusCallbackEvent(JsonField.of(recordingStatusCallbackEvent))

            /**
             * Sets [Builder.recordingStatusCallbackEvent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingStatusCallbackEvent] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: JsonField<String>) =
                apply {
                    this.recordingStatusCallbackEvent = recordingStatusCallbackEvent
                }

            /** HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`. */
            fun recordingStatusCallbackMethod(
                recordingStatusCallbackMethod: RecordingStatusCallbackMethod
            ) = recordingStatusCallbackMethod(JsonField.of(recordingStatusCallbackMethod))

            /**
             * Sets [Builder.recordingStatusCallbackMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingStatusCallbackMethod] with a well-typed
             * [RecordingStatusCallbackMethod] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun recordingStatusCallbackMethod(
                recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>
            ) = apply { this.recordingStatusCallbackMethod = recordingStatusCallbackMethod }

            /** The audio track to record for the call. The default is `both`. */
            fun recordingTrack(recordingTrack: RecordingTrack) =
                recordingTrack(JsonField.of(recordingTrack))

            /**
             * Sets [Builder.recordingTrack] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingTrack] with a well-typed [RecordingTrack]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recordingTrack(recordingTrack: JsonField<RecordingTrack>) = apply {
                this.recordingTrack = recordingTrack
            }

            /** The password to use for SIP authentication. */
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

            /** The username to use for SIP authentication. */
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

            /** Whether to start the conference when the participant enters. Defaults to `true`. */
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

            /** URL destination for Telnyx to send status callback events to for the call. */
            fun statusCallback(statusCallback: String) =
                statusCallback(JsonField.of(statusCallback))

            /**
             * Sets [Builder.statusCallback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCallback] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusCallback(statusCallback: JsonField<String>) = apply {
                this.statusCallback = statusCallback
            }

            /**
             * The changes to the call's state that should generate a call to `StatusCallback`. Can
             * be: `initiated`, `ringing`, `answered`, and `completed`. Separate multiple values
             * with a space. The default value is `completed`.
             */
            fun statusCallbackEvent(statusCallbackEvent: String) =
                statusCallbackEvent(JsonField.of(statusCallbackEvent))

            /**
             * Sets [Builder.statusCallbackEvent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCallbackEvent] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun statusCallbackEvent(statusCallbackEvent: JsonField<String>) = apply {
                this.statusCallbackEvent = statusCallbackEvent
            }

            /** HTTP request type used for `StatusCallback`. */
            fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) =
                statusCallbackMethod(JsonField.of(statusCallbackMethod))

            /**
             * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCallbackMethod] with a well-typed
             * [StatusCallbackMethod] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) =
                apply {
                    this.statusCallbackMethod = statusCallbackMethod
                }

            /** The maximum duration of the call in seconds. */
            fun timeLimit(timeLimit: Long) = timeLimit(JsonField.of(timeLimit))

            /**
             * Sets [Builder.timeLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeLimit(timeLimit: JsonField<Long>) = apply { this.timeLimit = timeLimit }

            /**
             * The number of seconds that we should allow the phone to ring before assuming there is
             * no answer. Can be an integer between 5 and 120, inclusive. The default value is 30.
             */
            fun timeout(timeout: Long) = timeout(JsonField.of(timeout))

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Long>) = apply { this.timeout = timeout }

            /**
             * The phone number of the called party. Phone numbers are formatted with a `+` and
             * country code.
             */
            fun to(to: String) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<String>) = apply { this.to = to }

            /**
             * Whether to trim any leading and trailing silence from the recording. Defaults to
             * `trim-silence`.
             */
            fun trim(trim: Trim) = trim(JsonField.of(trim))

            /**
             * Sets [Builder.trim] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trim] with a well-typed [Trim] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun trim(trim: JsonField<Trim>) = apply { this.trim = trim }

            /**
             * The URL to call for an audio file to play while the participant is waiting for the
             * conference to start.
             */
            fun waitUrl(waitUrl: String) = waitUrl(JsonField.of(waitUrl))

            /**
             * Sets [Builder.waitUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waitUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun waitUrl(waitUrl: JsonField<String>) = apply { this.waitUrl = waitUrl }

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
             */
            fun build(): Body =
                Body(
                    amdStatusCallback,
                    amdStatusCallbackMethod,
                    beep,
                    callerId,
                    callSidToCoach,
                    cancelPlaybackOnDetectMessageEnd,
                    cancelPlaybackOnMachineDetection,
                    coaching,
                    conferenceRecord,
                    conferenceRecordingStatusCallback,
                    conferenceRecordingStatusCallbackEvent,
                    conferenceRecordingStatusCallbackMethod,
                    conferenceRecordingTimeout,
                    conferenceStatusCallback,
                    conferenceStatusCallbackEvent,
                    conferenceStatusCallbackMethod,
                    conferenceTrim,
                    earlyMedia,
                    endConferenceOnExit,
                    from,
                    machineDetection,
                    machineDetectionSilenceTimeout,
                    machineDetectionSpeechEndThreshold,
                    machineDetectionSpeechThreshold,
                    machineDetectionTimeout,
                    maxParticipants,
                    muted,
                    preferredCodecs,
                    record,
                    recordingChannels,
                    recordingStatusCallback,
                    recordingStatusCallbackEvent,
                    recordingStatusCallbackMethod,
                    recordingTrack,
                    sipAuthPassword,
                    sipAuthUsername,
                    startConferenceOnEnter,
                    statusCallback,
                    statusCallbackEvent,
                    statusCallbackMethod,
                    timeLimit,
                    timeout,
                    to,
                    trim,
                    waitUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            amdStatusCallback()
            amdStatusCallbackMethod().ifPresent { it.validate() }
            beep().ifPresent { it.validate() }
            callerId()
            callSidToCoach()
            cancelPlaybackOnDetectMessageEnd()
            cancelPlaybackOnMachineDetection()
            coaching()
            conferenceRecord().ifPresent { it.validate() }
            conferenceRecordingStatusCallback()
            conferenceRecordingStatusCallbackEvent()
            conferenceRecordingStatusCallbackMethod().ifPresent { it.validate() }
            conferenceRecordingTimeout()
            conferenceStatusCallback()
            conferenceStatusCallbackEvent()
            conferenceStatusCallbackMethod().ifPresent { it.validate() }
            conferenceTrim().ifPresent { it.validate() }
            earlyMedia()
            endConferenceOnExit()
            from()
            machineDetection().ifPresent { it.validate() }
            machineDetectionSilenceTimeout()
            machineDetectionSpeechEndThreshold()
            machineDetectionSpeechThreshold()
            machineDetectionTimeout()
            maxParticipants()
            muted()
            preferredCodecs()
            record()
            recordingChannels().ifPresent { it.validate() }
            recordingStatusCallback()
            recordingStatusCallbackEvent()
            recordingStatusCallbackMethod().ifPresent { it.validate() }
            recordingTrack().ifPresent { it.validate() }
            sipAuthPassword()
            sipAuthUsername()
            startConferenceOnEnter()
            statusCallback()
            statusCallbackEvent()
            statusCallbackMethod().ifPresent { it.validate() }
            timeLimit()
            timeout()
            to()
            trim().ifPresent { it.validate() }
            waitUrl()
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
            (if (amdStatusCallback.asKnown().isPresent) 1 else 0) +
                (amdStatusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (beep.asKnown().getOrNull()?.validity() ?: 0) +
                (if (callerId.asKnown().isPresent) 1 else 0) +
                (if (callSidToCoach.asKnown().isPresent) 1 else 0) +
                (if (cancelPlaybackOnDetectMessageEnd.asKnown().isPresent) 1 else 0) +
                (if (cancelPlaybackOnMachineDetection.asKnown().isPresent) 1 else 0) +
                (if (coaching.asKnown().isPresent) 1 else 0) +
                (conferenceRecord.asKnown().getOrNull()?.validity() ?: 0) +
                (if (conferenceRecordingStatusCallback.asKnown().isPresent) 1 else 0) +
                (if (conferenceRecordingStatusCallbackEvent.asKnown().isPresent) 1 else 0) +
                (conferenceRecordingStatusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (conferenceRecordingTimeout.asKnown().isPresent) 1 else 0) +
                (if (conferenceStatusCallback.asKnown().isPresent) 1 else 0) +
                (if (conferenceStatusCallbackEvent.asKnown().isPresent) 1 else 0) +
                (conferenceStatusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (conferenceTrim.asKnown().getOrNull()?.validity() ?: 0) +
                (if (earlyMedia.asKnown().isPresent) 1 else 0) +
                (if (endConferenceOnExit.asKnown().isPresent) 1 else 0) +
                (if (from.asKnown().isPresent) 1 else 0) +
                (machineDetection.asKnown().getOrNull()?.validity() ?: 0) +
                (if (machineDetectionSilenceTimeout.asKnown().isPresent) 1 else 0) +
                (if (machineDetectionSpeechEndThreshold.asKnown().isPresent) 1 else 0) +
                (if (machineDetectionSpeechThreshold.asKnown().isPresent) 1 else 0) +
                (if (machineDetectionTimeout.asKnown().isPresent) 1 else 0) +
                (if (maxParticipants.asKnown().isPresent) 1 else 0) +
                (if (muted.asKnown().isPresent) 1 else 0) +
                (if (preferredCodecs.asKnown().isPresent) 1 else 0) +
                (if (record.asKnown().isPresent) 1 else 0) +
                (recordingChannels.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordingStatusCallback.asKnown().isPresent) 1 else 0) +
                (if (recordingStatusCallbackEvent.asKnown().isPresent) 1 else 0) +
                (recordingStatusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (recordingTrack.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sipAuthPassword.asKnown().isPresent) 1 else 0) +
                (if (sipAuthUsername.asKnown().isPresent) 1 else 0) +
                (if (startConferenceOnEnter.asKnown().isPresent) 1 else 0) +
                (if (statusCallback.asKnown().isPresent) 1 else 0) +
                (if (statusCallbackEvent.asKnown().isPresent) 1 else 0) +
                (statusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timeLimit.asKnown().isPresent) 1 else 0) +
                (if (timeout.asKnown().isPresent) 1 else 0) +
                (if (to.asKnown().isPresent) 1 else 0) +
                (trim.asKnown().getOrNull()?.validity() ?: 0) +
                (if (waitUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                amdStatusCallback == other.amdStatusCallback &&
                amdStatusCallbackMethod == other.amdStatusCallbackMethod &&
                beep == other.beep &&
                callerId == other.callerId &&
                callSidToCoach == other.callSidToCoach &&
                cancelPlaybackOnDetectMessageEnd == other.cancelPlaybackOnDetectMessageEnd &&
                cancelPlaybackOnMachineDetection == other.cancelPlaybackOnMachineDetection &&
                coaching == other.coaching &&
                conferenceRecord == other.conferenceRecord &&
                conferenceRecordingStatusCallback == other.conferenceRecordingStatusCallback &&
                conferenceRecordingStatusCallbackEvent ==
                    other.conferenceRecordingStatusCallbackEvent &&
                conferenceRecordingStatusCallbackMethod ==
                    other.conferenceRecordingStatusCallbackMethod &&
                conferenceRecordingTimeout == other.conferenceRecordingTimeout &&
                conferenceStatusCallback == other.conferenceStatusCallback &&
                conferenceStatusCallbackEvent == other.conferenceStatusCallbackEvent &&
                conferenceStatusCallbackMethod == other.conferenceStatusCallbackMethod &&
                conferenceTrim == other.conferenceTrim &&
                earlyMedia == other.earlyMedia &&
                endConferenceOnExit == other.endConferenceOnExit &&
                from == other.from &&
                machineDetection == other.machineDetection &&
                machineDetectionSilenceTimeout == other.machineDetectionSilenceTimeout &&
                machineDetectionSpeechEndThreshold == other.machineDetectionSpeechEndThreshold &&
                machineDetectionSpeechThreshold == other.machineDetectionSpeechThreshold &&
                machineDetectionTimeout == other.machineDetectionTimeout &&
                maxParticipants == other.maxParticipants &&
                muted == other.muted &&
                preferredCodecs == other.preferredCodecs &&
                record == other.record &&
                recordingChannels == other.recordingChannels &&
                recordingStatusCallback == other.recordingStatusCallback &&
                recordingStatusCallbackEvent == other.recordingStatusCallbackEvent &&
                recordingStatusCallbackMethod == other.recordingStatusCallbackMethod &&
                recordingTrack == other.recordingTrack &&
                sipAuthPassword == other.sipAuthPassword &&
                sipAuthUsername == other.sipAuthUsername &&
                startConferenceOnEnter == other.startConferenceOnEnter &&
                statusCallback == other.statusCallback &&
                statusCallbackEvent == other.statusCallbackEvent &&
                statusCallbackMethod == other.statusCallbackMethod &&
                timeLimit == other.timeLimit &&
                timeout == other.timeout &&
                to == other.to &&
                trim == other.trim &&
                waitUrl == other.waitUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amdStatusCallback,
                amdStatusCallbackMethod,
                beep,
                callerId,
                callSidToCoach,
                cancelPlaybackOnDetectMessageEnd,
                cancelPlaybackOnMachineDetection,
                coaching,
                conferenceRecord,
                conferenceRecordingStatusCallback,
                conferenceRecordingStatusCallbackEvent,
                conferenceRecordingStatusCallbackMethod,
                conferenceRecordingTimeout,
                conferenceStatusCallback,
                conferenceStatusCallbackEvent,
                conferenceStatusCallbackMethod,
                conferenceTrim,
                earlyMedia,
                endConferenceOnExit,
                from,
                machineDetection,
                machineDetectionSilenceTimeout,
                machineDetectionSpeechEndThreshold,
                machineDetectionSpeechThreshold,
                machineDetectionTimeout,
                maxParticipants,
                muted,
                preferredCodecs,
                record,
                recordingChannels,
                recordingStatusCallback,
                recordingStatusCallbackEvent,
                recordingStatusCallbackMethod,
                recordingTrack,
                sipAuthPassword,
                sipAuthUsername,
                startConferenceOnEnter,
                statusCallback,
                statusCallbackEvent,
                statusCallbackMethod,
                timeLimit,
                timeout,
                to,
                trim,
                waitUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amdStatusCallback=$amdStatusCallback, amdStatusCallbackMethod=$amdStatusCallbackMethod, beep=$beep, callerId=$callerId, callSidToCoach=$callSidToCoach, cancelPlaybackOnDetectMessageEnd=$cancelPlaybackOnDetectMessageEnd, cancelPlaybackOnMachineDetection=$cancelPlaybackOnMachineDetection, coaching=$coaching, conferenceRecord=$conferenceRecord, conferenceRecordingStatusCallback=$conferenceRecordingStatusCallback, conferenceRecordingStatusCallbackEvent=$conferenceRecordingStatusCallbackEvent, conferenceRecordingStatusCallbackMethod=$conferenceRecordingStatusCallbackMethod, conferenceRecordingTimeout=$conferenceRecordingTimeout, conferenceStatusCallback=$conferenceStatusCallback, conferenceStatusCallbackEvent=$conferenceStatusCallbackEvent, conferenceStatusCallbackMethod=$conferenceStatusCallbackMethod, conferenceTrim=$conferenceTrim, earlyMedia=$earlyMedia, endConferenceOnExit=$endConferenceOnExit, from=$from, machineDetection=$machineDetection, machineDetectionSilenceTimeout=$machineDetectionSilenceTimeout, machineDetectionSpeechEndThreshold=$machineDetectionSpeechEndThreshold, machineDetectionSpeechThreshold=$machineDetectionSpeechThreshold, machineDetectionTimeout=$machineDetectionTimeout, maxParticipants=$maxParticipants, muted=$muted, preferredCodecs=$preferredCodecs, record=$record, recordingChannels=$recordingChannels, recordingStatusCallback=$recordingStatusCallback, recordingStatusCallbackEvent=$recordingStatusCallbackEvent, recordingStatusCallbackMethod=$recordingStatusCallbackMethod, recordingTrack=$recordingTrack, sipAuthPassword=$sipAuthPassword, sipAuthUsername=$sipAuthUsername, startConferenceOnEnter=$startConferenceOnEnter, statusCallback=$statusCallback, statusCallbackEvent=$statusCallbackEvent, statusCallbackMethod=$statusCallbackMethod, timeLimit=$timeLimit, timeout=$timeout, to=$to, trim=$trim, waitUrl=$waitUrl, additionalProperties=$additionalProperties}"
    }

    /** HTTP request type used for `AmdStatusCallback`. Defaults to `POST`. */
    class AmdStatusCallbackMethod
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

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = AmdStatusCallbackMethod(JsonField.of(value))
        }

        /** An enum containing [AmdStatusCallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [AmdStatusCallbackMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AmdStatusCallbackMethod] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [AmdStatusCallbackMethod] was instantiated with an
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
                GET -> Value.GET
                POST -> Value.POST
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
                GET -> Known.GET
                POST -> Known.POST
                else -> throw TelnyxInvalidDataException("Unknown AmdStatusCallbackMethod: $value")
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

        fun validate(): AmdStatusCallbackMethod = apply {
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

            return other is AmdStatusCallbackMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Whether to play a notification beep to the conference when the participant enters and exits.
     */
    class Beep @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmField val ON_ENTER = of("onEnter")

            @JvmField val ON_EXIT = of("onExit")

            @JvmStatic fun of(value: String) = Beep(JsonField.of(value))
        }

        /** An enum containing [Beep]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
            ON_ENTER,
            ON_EXIT,
        }

        /**
         * An enum containing [Beep]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Beep] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            ON_ENTER,
            ON_EXIT,
            /** An enum member indicating that [Beep] was instantiated with an unknown value. */
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                ON_ENTER -> Value.ON_ENTER
                ON_EXIT -> Value.ON_EXIT
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
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                ON_ENTER -> Known.ON_ENTER
                ON_EXIT -> Known.ON_EXIT
                else -> throw TelnyxInvalidDataException("Unknown Beep: $value")
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

        fun validate(): Beep = apply {
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

            return other is Beep && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Whether to record the conference the participant is joining. Defualts to `do-not-record`. The
     * boolean values `true` and `false` are synonymous with `record-from-start` and `do-not-record`
     * respectively.
     */
    class ConferenceRecord @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmField val RECORD_FROM_START = of("record-from-start")

            @JvmField val DO_NOT_RECORD = of("do-not-record")

            @JvmStatic fun of(value: String) = ConferenceRecord(JsonField.of(value))
        }

        /** An enum containing [ConferenceRecord]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
            RECORD_FROM_START,
            DO_NOT_RECORD,
        }

        /**
         * An enum containing [ConferenceRecord]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ConferenceRecord] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            RECORD_FROM_START,
            DO_NOT_RECORD,
            /**
             * An enum member indicating that [ConferenceRecord] was instantiated with an unknown
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                RECORD_FROM_START -> Value.RECORD_FROM_START
                DO_NOT_RECORD -> Value.DO_NOT_RECORD
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
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                RECORD_FROM_START -> Known.RECORD_FROM_START
                DO_NOT_RECORD -> Known.DO_NOT_RECORD
                else -> throw TelnyxInvalidDataException("Unknown ConferenceRecord: $value")
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

        fun validate(): ConferenceRecord = apply {
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

            return other is ConferenceRecord && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** HTTP request type used for `ConferenceRecordingStatusCallback`. Defaults to `POST`. */
    class ConferenceRecordingStatusCallbackMethod
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

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic
            fun of(value: String) = ConferenceRecordingStatusCallbackMethod(JsonField.of(value))
        }

        /** An enum containing [ConferenceRecordingStatusCallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [ConferenceRecordingStatusCallbackMethod]'s known values, as well as
         * an [_UNKNOWN] member.
         *
         * An instance of [ConferenceRecordingStatusCallbackMethod] can contain an unknown value in
         * a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [ConferenceRecordingStatusCallbackMethod] was
             * instantiated with an unknown value.
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
                GET -> Value.GET
                POST -> Value.POST
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
                GET -> Known.GET
                POST -> Known.POST
                else ->
                    throw TelnyxInvalidDataException(
                        "Unknown ConferenceRecordingStatusCallbackMethod: $value"
                    )
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

        fun validate(): ConferenceRecordingStatusCallbackMethod = apply {
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

            return other is ConferenceRecordingStatusCallbackMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** HTTP request type used for `ConferenceStatusCallback`. Defaults to `POST`. */
    class ConferenceStatusCallbackMethod
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

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = ConferenceStatusCallbackMethod(JsonField.of(value))
        }

        /** An enum containing [ConferenceStatusCallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [ConferenceStatusCallbackMethod]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [ConferenceStatusCallbackMethod] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [ConferenceStatusCallbackMethod] was instantiated with
             * an unknown value.
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
                GET -> Value.GET
                POST -> Value.POST
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
                GET -> Known.GET
                POST -> Known.POST
                else ->
                    throw TelnyxInvalidDataException(
                        "Unknown ConferenceStatusCallbackMethod: $value"
                    )
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

        fun validate(): ConferenceStatusCallbackMethod = apply {
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

            return other is ConferenceStatusCallbackMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Whether to trim any leading and trailing silence from the conference recording. Defaults to
     * `trim-silence`.
     */
    class ConferenceTrim @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TRIM_SILENCE = of("trim-silence")

            @JvmField val DO_NOT_TRIM = of("do-not-trim")

            @JvmStatic fun of(value: String) = ConferenceTrim(JsonField.of(value))
        }

        /** An enum containing [ConferenceTrim]'s known values. */
        enum class Known {
            TRIM_SILENCE,
            DO_NOT_TRIM,
        }

        /**
         * An enum containing [ConferenceTrim]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ConferenceTrim] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRIM_SILENCE,
            DO_NOT_TRIM,
            /**
             * An enum member indicating that [ConferenceTrim] was instantiated with an unknown
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
                TRIM_SILENCE -> Value.TRIM_SILENCE
                DO_NOT_TRIM -> Value.DO_NOT_TRIM
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
                DO_NOT_TRIM -> Known.DO_NOT_TRIM
                else -> throw TelnyxInvalidDataException("Unknown ConferenceTrim: $value")
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

        fun validate(): ConferenceTrim = apply {
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

            return other is ConferenceTrim && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Whether to detect if a human or an answering machine picked up the call. Use `Enable` if you
     * would like to ne notified as soon as the called party is identified. Use `DetectMessageEnd`,
     * if you would like to leave a message on an answering machine.
     */
    class MachineDetection @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ENABLE = of("Enable")

            @JvmField val DETECT_MESSAGE_END = of("DetectMessageEnd")

            @JvmStatic fun of(value: String) = MachineDetection(JsonField.of(value))
        }

        /** An enum containing [MachineDetection]'s known values. */
        enum class Known {
            ENABLE,
            DETECT_MESSAGE_END,
        }

        /**
         * An enum containing [MachineDetection]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MachineDetection] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENABLE,
            DETECT_MESSAGE_END,
            /**
             * An enum member indicating that [MachineDetection] was instantiated with an unknown
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
                ENABLE -> Value.ENABLE
                DETECT_MESSAGE_END -> Value.DETECT_MESSAGE_END
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
                ENABLE -> Known.ENABLE
                DETECT_MESSAGE_END -> Known.DETECT_MESSAGE_END
                else -> throw TelnyxInvalidDataException("Unknown MachineDetection: $value")
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

        fun validate(): MachineDetection = apply {
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

            return other is MachineDetection && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The number of channels in the final recording. Defaults to `mono`. */
    class RecordingChannels @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val MONO = of("mono")

            @JvmField val DUAL = of("dual")

            @JvmStatic fun of(value: String) = RecordingChannels(JsonField.of(value))
        }

        /** An enum containing [RecordingChannels]'s known values. */
        enum class Known {
            MONO,
            DUAL,
        }

        /**
         * An enum containing [RecordingChannels]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordingChannels] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MONO,
            DUAL,
            /**
             * An enum member indicating that [RecordingChannels] was instantiated with an unknown
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
                MONO -> Value.MONO
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
                MONO -> Known.MONO
                DUAL -> Known.DUAL
                else -> throw TelnyxInvalidDataException("Unknown RecordingChannels: $value")
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

        fun validate(): RecordingChannels = apply {
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

            return other is RecordingChannels && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`. */
    class RecordingStatusCallbackMethod
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

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = RecordingStatusCallbackMethod(JsonField.of(value))
        }

        /** An enum containing [RecordingStatusCallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [RecordingStatusCallbackMethod]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [RecordingStatusCallbackMethod] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [RecordingStatusCallbackMethod] was instantiated with
             * an unknown value.
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
                GET -> Value.GET
                POST -> Value.POST
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
                GET -> Known.GET
                POST -> Known.POST
                else ->
                    throw TelnyxInvalidDataException(
                        "Unknown RecordingStatusCallbackMethod: $value"
                    )
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

        fun validate(): RecordingStatusCallbackMethod = apply {
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

            return other is RecordingStatusCallbackMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The audio track to record for the call. The default is `both`. */
    class RecordingTrack @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val INBOUND = of("inbound")

            @JvmField val OUTBOUND = of("outbound")

            @JvmField val BOTH = of("both")

            @JvmStatic fun of(value: String) = RecordingTrack(JsonField.of(value))
        }

        /** An enum containing [RecordingTrack]'s known values. */
        enum class Known {
            INBOUND,
            OUTBOUND,
            BOTH,
        }

        /**
         * An enum containing [RecordingTrack]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordingTrack] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND,
            OUTBOUND,
            BOTH,
            /**
             * An enum member indicating that [RecordingTrack] was instantiated with an unknown
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
                INBOUND -> Value.INBOUND
                OUTBOUND -> Value.OUTBOUND
                BOTH -> Value.BOTH
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
                INBOUND -> Known.INBOUND
                OUTBOUND -> Known.OUTBOUND
                BOTH -> Known.BOTH
                else -> throw TelnyxInvalidDataException("Unknown RecordingTrack: $value")
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

        fun validate(): RecordingTrack = apply {
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

            return other is RecordingTrack && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** HTTP request type used for `StatusCallback`. */
    class StatusCallbackMethod
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

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = StatusCallbackMethod(JsonField.of(value))
        }

        /** An enum containing [StatusCallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [StatusCallbackMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [StatusCallbackMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [StatusCallbackMethod] was instantiated with an
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
                GET -> Value.GET
                POST -> Value.POST
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
                GET -> Known.GET
                POST -> Known.POST
                else -> throw TelnyxInvalidDataException("Unknown StatusCallbackMethod: $value")
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

        fun validate(): StatusCallbackMethod = apply {
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

            return other is StatusCallbackMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Whether to trim any leading and trailing silence from the recording. Defaults to
     * `trim-silence`.
     */
    class Trim @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DO_NOT_TRIM = of("do-not-trim")

            @JvmStatic fun of(value: String) = Trim(JsonField.of(value))
        }

        /** An enum containing [Trim]'s known values. */
        enum class Known {
            TRIM_SILENCE,
            DO_NOT_TRIM,
        }

        /**
         * An enum containing [Trim]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Trim] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRIM_SILENCE,
            DO_NOT_TRIM,
            /** An enum member indicating that [Trim] was instantiated with an unknown value. */
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
                DO_NOT_TRIM -> Value.DO_NOT_TRIM
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
                DO_NOT_TRIM -> Known.DO_NOT_TRIM
                else -> throw TelnyxInvalidDataException("Unknown Trim: $value")
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

        fun validate(): Trim = apply {
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

            return other is Trim && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantParticipantsParams &&
            accountSid == other.accountSid &&
            conferenceSid == other.conferenceSid &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountSid, conferenceSid, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ParticipantParticipantsParams{accountSid=$accountSid, conferenceSid=$conferenceSid, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
