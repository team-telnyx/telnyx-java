// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.calls.CustomSipHeader
import com.telnyx.sdk.models.calls.SipHeader
import com.telnyx.sdk.models.calls.SoundModifications
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Transfer a call to a new destination. If the transfer is unsuccessful, a `call.hangup` webhook
 * for the other call (Leg B) will be sent indicating that the transfer could not be completed. The
 * original call will remain active and may be issued additional commands, potentially transfering
 * the call to an alternate destination.
 *
 * **Expected Webhooks:**
 * - `call.initiated`
 * - `call.bridged` to Leg B
 * - `call.answered` or `call.hangup`
 * - `call.machine.detection.ended` if `answering_machine_detection` was requested
 * - `call.machine.greeting.ended` if `answering_machine_detection` was requested to detect the end
 *   of machine greeting
 * - `call.machine.premium.detection.ended` if `answering_machine_detection=premium` was requested
 * - `call.machine.premium.greeting.ended` if `answering_machine_detection=premium` was requested
 *   and a beep was detected
 */
class ActionTransferParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    /**
     * The DID or SIP URI to dial out to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): String = body.to()

    /**
     * Enables Answering Machine Detection. When a call is answered, Telnyx runs real-time detection
     * to determine if it was picked up by a human or a machine and sends an
     * `call.machine.detection.ended` webhook with the analysis result. If 'greeting_end' or
     * 'detect_words' is used and a 'machine' is detected, you will receive another
     * 'call.machine.greeting.ended' webhook when the answering machine greeting ends with a beep or
     * silence. If `detect_beep` is used, you will only receive 'call.machine.greeting.ended' if a
     * beep is detected.
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
     * The URL of a file to be played back when the transfer destination answers before bridging the
     * call. The URL can point to either a WAV or MP3 file. media_name and audio_url cannot be used
     * together in one request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioUrl(): Optional<String> = body.audioUrl()

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded
     * string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = body.clientState()

    /**
     * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
     * `command_id` for the same `call_control_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commandId(): Optional<String> = body.commandId()

    /**
     * Custom headers to be added to the SIP INVITE.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customHeaders(): Optional<List<CustomSipHeader>> = body.customHeaders()

    /**
     * If set to false, early media will not be passed to the originating leg.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun earlyMedia(): Optional<Boolean> = body.earlyMedia()

    /**
     * The `from` number to be used as the caller id presented to the destination (`to` number). The
     * number should be in +E164 format. This attribute will default to the `to` number of the
     * original call if omitted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun from(): Optional<String> = body.from()

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
     * Defines whether media should be encrypted on the new call leg.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaEncryption(): Optional<MediaEncryption> = body.mediaEncryption()

    /**
     * The media_name of a file to be played back when the transfer destination answers before
     * bridging the call. The media_name must point to a file previously uploaded to
     * api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3
     * file.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaName(): Optional<String> = body.mediaName()

    /**
     * When enabled, DTMF tones are not passed to the call participant. The webhooks containing the
     * DTMF information will be sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun muteDtmf(): Optional<MuteDtmf> = body.muteDtmf()

    /**
     * Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is
     * transferred). If supplied with the value `self`, the current leg will be parked after
     * unbridge. If not set, the default behavior is to hang up the leg.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parkAfterUnbridge(): Optional<String> = body.parkAfterUnbridge()

    /**
     * The list of comma-separated codecs in order of preference to be used during the call. The
     * codecs supported are `G722`, `PCMU`, `PCMA`, `G729`, `OPUS`, `VP8`, `H264`, `AMR-WB`.
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
     * SIP headers to be added to the SIP INVITE. Currently only User-to-User header is supported.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipHeaders(): Optional<List<SipHeader>> = body.sipHeaders()

    /**
     * Defines the SIP region to be used for the call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipRegion(): Optional<SipRegion> = body.sipRegion()

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
     * Use this field to add state to every subsequent webhook for the new leg. It must be a valid
     * Base-64 encoded string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetLegClientState(): Optional<String> = body.targetLegClientState()

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
     * which it is being transferred. If the timeout is reached before an answer is received, the
     * call will hangup and a `call.hangup` webhook with a `hangup_cause` of `timeout` will be sent.
     * Minimum value is 5 seconds. Maximum value is 600 seconds.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutSecs(): Optional<Int> = body.timeoutSecs()

    /**
     * A map of event types to retry policies. Each retry policy contains an array of `retries_ms`
     * specifying the delays between retry attempts in milliseconds. Maximum 5 retries, total delay
     * cannot exceed 60 seconds.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookRetriesPolicies(): Optional<WebhookRetriesPolicies> = body.webhookRetriesPolicies()

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
     * A map of event types to webhook URLs. When an event of the specified type occurs, the webhook
     * URL associated with that event type will be called instead of `webhook_url`. Events not
     * mapped here will use the default `webhook_url`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrls(): Optional<WebhookUrls> = body.webhookUrls()

    /**
     * HTTP request method to invoke `webhook_urls`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrlsMethod(): Optional<WebhookUrlsMethod> = body.webhookUrlsMethod()

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _to(): JsonField<String> = body._to()

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
     * Returns the raw JSON value of [customHeaders].
     *
     * Unlike [customHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customHeaders(): JsonField<List<CustomSipHeader>> = body._customHeaders()

    /**
     * Returns the raw JSON value of [earlyMedia].
     *
     * Unlike [earlyMedia], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _earlyMedia(): JsonField<Boolean> = body._earlyMedia()

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _from(): JsonField<String> = body._from()

    /**
     * Returns the raw JSON value of [fromDisplayName].
     *
     * Unlike [fromDisplayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fromDisplayName(): JsonField<String> = body._fromDisplayName()

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
     * Returns the raw JSON value of [muteDtmf].
     *
     * Unlike [muteDtmf], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _muteDtmf(): JsonField<MuteDtmf> = body._muteDtmf()

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
     * Returns the raw JSON value of [sipRegion].
     *
     * Unlike [sipRegion], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sipRegion(): JsonField<SipRegion> = body._sipRegion()

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
     * Returns the raw JSON value of [targetLegClientState].
     *
     * Unlike [targetLegClientState], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _targetLegClientState(): JsonField<String> = body._targetLegClientState()

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
     * Returns the raw JSON value of [webhookRetriesPolicies].
     *
     * Unlike [webhookRetriesPolicies], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _webhookRetriesPolicies(): JsonField<WebhookRetriesPolicies> =
        body._webhookRetriesPolicies()

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

    /**
     * Returns the raw JSON value of [webhookUrls].
     *
     * Unlike [webhookUrls], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookUrls(): JsonField<WebhookUrls> = body._webhookUrls()

    /**
     * Returns the raw JSON value of [webhookUrlsMethod].
     *
     * Unlike [webhookUrlsMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _webhookUrlsMethod(): JsonField<WebhookUrlsMethod> = body._webhookUrlsMethod()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionTransferParams].
         *
         * The following fields are required:
         * ```java
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionTransferParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionTransferParams: ActionTransferParams) = apply {
            callControlId = actionTransferParams.callControlId
            body = actionTransferParams.body.toBuilder()
            additionalHeaders = actionTransferParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionTransferParams.additionalQueryParams.toBuilder()
        }

        fun callControlId(callControlId: String?) = apply { this.callControlId = callControlId }

        /** Alias for calling [Builder.callControlId] with `callControlId.orElse(null)`. */
        fun callControlId(callControlId: Optional<String>) =
            callControlId(callControlId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [to]
         * - [answeringMachineDetection]
         * - [answeringMachineDetectionConfig]
         * - [audioUrl]
         * - [clientState]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The DID or SIP URI to dial out to. */
        fun to(to: String) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { body.to(to) }

        /**
         * Enables Answering Machine Detection. When a call is answered, Telnyx runs real-time
         * detection to determine if it was picked up by a human or a machine and sends an
         * `call.machine.detection.ended` webhook with the analysis result. If 'greeting_end' or
         * 'detect_words' is used and a 'machine' is detected, you will receive another
         * 'call.machine.greeting.ended' webhook when the answering machine greeting ends with a
         * beep or silence. If `detect_beep` is used, you will only receive
         * 'call.machine.greeting.ended' if a beep is detected.
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
         * The URL of a file to be played back when the transfer destination answers before bridging
         * the call. The URL can point to either a WAV or MP3 file. media_name and audio_url cannot
         * be used together in one request.
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
         * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
         * `command_id` for the same `call_control_id`.
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

        /** If set to false, early media will not be passed to the originating leg. */
        fun earlyMedia(earlyMedia: Boolean) = apply { body.earlyMedia(earlyMedia) }

        /**
         * Sets [Builder.earlyMedia] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earlyMedia] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun earlyMedia(earlyMedia: JsonField<Boolean>) = apply { body.earlyMedia(earlyMedia) }

        /**
         * The `from` number to be used as the caller id presented to the destination (`to` number).
         * The number should be in +E164 format. This attribute will default to the `to` number of
         * the original call if omitted.
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

        /** Defines whether media should be encrypted on the new call leg. */
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
         * The media_name of a file to be played back when the transfer destination answers before
         * bridging the call. The media_name must point to a file previously uploaded to
         * api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or
         * MP3 file.
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
         * When enabled, DTMF tones are not passed to the call participant. The webhooks containing
         * the DTMF information will be sent.
         */
        fun muteDtmf(muteDtmf: MuteDtmf) = apply { body.muteDtmf(muteDtmf) }

        /**
         * Sets [Builder.muteDtmf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.muteDtmf] with a well-typed [MuteDtmf] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun muteDtmf(muteDtmf: JsonField<MuteDtmf>) = apply { body.muteDtmf(muteDtmf) }

        /**
         * Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is
         * transferred). If supplied with the value `self`, the current leg will be parked after
         * unbridge. If not set, the default behavior is to hang up the leg.
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
         * The list of comma-separated codecs in order of preference to be used during the call. The
         * codecs supported are `G722`, `PCMU`, `PCMA`, `G729`, `OPUS`, `VP8`, `H264`, `AMR-WB`.
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
         * SIP headers to be added to the SIP INVITE. Currently only User-to-User header is
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

        /** Defines the SIP region to be used for the call. */
        fun sipRegion(sipRegion: SipRegion) = apply { body.sipRegion(sipRegion) }

        /**
         * Sets [Builder.sipRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipRegion] with a well-typed [SipRegion] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sipRegion(sipRegion: JsonField<SipRegion>) = apply { body.sipRegion(sipRegion) }

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
         * Use this field to add state to every subsequent webhook for the new leg. It must be a
         * valid Base-64 encoded string.
         */
        fun targetLegClientState(targetLegClientState: String) = apply {
            body.targetLegClientState(targetLegClientState)
        }

        /**
         * Sets [Builder.targetLegClientState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetLegClientState] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetLegClientState(targetLegClientState: JsonField<String>) = apply {
            body.targetLegClientState(targetLegClientState)
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
         * destination to which it is being transferred. If the timeout is reached before an answer
         * is received, the call will hangup and a `call.hangup` webhook with a `hangup_cause` of
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

        /**
         * A map of event types to retry policies. Each retry policy contains an array of
         * `retries_ms` specifying the delays between retry attempts in milliseconds. Maximum 5
         * retries, total delay cannot exceed 60 seconds.
         */
        fun webhookRetriesPolicies(webhookRetriesPolicies: WebhookRetriesPolicies) = apply {
            body.webhookRetriesPolicies(webhookRetriesPolicies)
        }

        /**
         * Sets [Builder.webhookRetriesPolicies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookRetriesPolicies] with a well-typed
         * [WebhookRetriesPolicies] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun webhookRetriesPolicies(webhookRetriesPolicies: JsonField<WebhookRetriesPolicies>) =
            apply {
                body.webhookRetriesPolicies(webhookRetriesPolicies)
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

        /**
         * A map of event types to webhook URLs. When an event of the specified type occurs, the
         * webhook URL associated with that event type will be called instead of `webhook_url`.
         * Events not mapped here will use the default `webhook_url`.
         */
        fun webhookUrls(webhookUrls: WebhookUrls) = apply { body.webhookUrls(webhookUrls) }

        /**
         * Sets [Builder.webhookUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrls] with a well-typed [WebhookUrls] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookUrls(webhookUrls: JsonField<WebhookUrls>) = apply {
            body.webhookUrls(webhookUrls)
        }

        /** HTTP request method to invoke `webhook_urls`. */
        fun webhookUrlsMethod(webhookUrlsMethod: WebhookUrlsMethod) = apply {
            body.webhookUrlsMethod(webhookUrlsMethod)
        }

        /**
         * Sets [Builder.webhookUrlsMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrlsMethod] with a well-typed [WebhookUrlsMethod]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhookUrlsMethod(webhookUrlsMethod: JsonField<WebhookUrlsMethod>) = apply {
            body.webhookUrlsMethod(webhookUrlsMethod)
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
         * Returns an immutable instance of [ActionTransferParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionTransferParams =
            ActionTransferParams(
                callControlId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> callControlId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val to: JsonField<String>,
        private val answeringMachineDetection: JsonField<AnsweringMachineDetection>,
        private val answeringMachineDetectionConfig: JsonField<AnsweringMachineDetectionConfig>,
        private val audioUrl: JsonField<String>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val customHeaders: JsonField<List<CustomSipHeader>>,
        private val earlyMedia: JsonField<Boolean>,
        private val from: JsonField<String>,
        private val fromDisplayName: JsonField<String>,
        private val mediaEncryption: JsonField<MediaEncryption>,
        private val mediaName: JsonField<String>,
        private val muteDtmf: JsonField<MuteDtmf>,
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
        private val sipAuthPassword: JsonField<String>,
        private val sipAuthUsername: JsonField<String>,
        private val sipHeaders: JsonField<List<SipHeader>>,
        private val sipRegion: JsonField<SipRegion>,
        private val sipTransportProtocol: JsonField<SipTransportProtocol>,
        private val soundModifications: JsonField<SoundModifications>,
        private val targetLegClientState: JsonField<String>,
        private val timeLimitSecs: JsonField<Int>,
        private val timeoutSecs: JsonField<Int>,
        private val webhookRetriesPolicies: JsonField<WebhookRetriesPolicies>,
        private val webhookUrl: JsonField<String>,
        private val webhookUrlMethod: JsonField<WebhookUrlMethod>,
        private val webhookUrls: JsonField<WebhookUrls>,
        private val webhookUrlsMethod: JsonField<WebhookUrlsMethod>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_headers")
            @ExcludeMissing
            customHeaders: JsonField<List<CustomSipHeader>> = JsonMissing.of(),
            @JsonProperty("early_media")
            @ExcludeMissing
            earlyMedia: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from_display_name")
            @ExcludeMissing
            fromDisplayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("media_encryption")
            @ExcludeMissing
            mediaEncryption: JsonField<MediaEncryption> = JsonMissing.of(),
            @JsonProperty("media_name")
            @ExcludeMissing
            mediaName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mute_dtmf")
            @ExcludeMissing
            muteDtmf: JsonField<MuteDtmf> = JsonMissing.of(),
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
            @JsonProperty("sip_auth_password")
            @ExcludeMissing
            sipAuthPassword: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sip_auth_username")
            @ExcludeMissing
            sipAuthUsername: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sip_headers")
            @ExcludeMissing
            sipHeaders: JsonField<List<SipHeader>> = JsonMissing.of(),
            @JsonProperty("sip_region")
            @ExcludeMissing
            sipRegion: JsonField<SipRegion> = JsonMissing.of(),
            @JsonProperty("sip_transport_protocol")
            @ExcludeMissing
            sipTransportProtocol: JsonField<SipTransportProtocol> = JsonMissing.of(),
            @JsonProperty("sound_modifications")
            @ExcludeMissing
            soundModifications: JsonField<SoundModifications> = JsonMissing.of(),
            @JsonProperty("target_leg_client_state")
            @ExcludeMissing
            targetLegClientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("time_limit_secs")
            @ExcludeMissing
            timeLimitSecs: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("timeout_secs")
            @ExcludeMissing
            timeoutSecs: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("webhook_retries_policies")
            @ExcludeMissing
            webhookRetriesPolicies: JsonField<WebhookRetriesPolicies> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_url_method")
            @ExcludeMissing
            webhookUrlMethod: JsonField<WebhookUrlMethod> = JsonMissing.of(),
            @JsonProperty("webhook_urls")
            @ExcludeMissing
            webhookUrls: JsonField<WebhookUrls> = JsonMissing.of(),
            @JsonProperty("webhook_urls_method")
            @ExcludeMissing
            webhookUrlsMethod: JsonField<WebhookUrlsMethod> = JsonMissing.of(),
        ) : this(
            to,
            answeringMachineDetection,
            answeringMachineDetectionConfig,
            audioUrl,
            clientState,
            commandId,
            customHeaders,
            earlyMedia,
            from,
            fromDisplayName,
            mediaEncryption,
            mediaName,
            muteDtmf,
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
            sipAuthPassword,
            sipAuthUsername,
            sipHeaders,
            sipRegion,
            sipTransportProtocol,
            soundModifications,
            targetLegClientState,
            timeLimitSecs,
            timeoutSecs,
            webhookRetriesPolicies,
            webhookUrl,
            webhookUrlMethod,
            webhookUrls,
            webhookUrlsMethod,
            mutableMapOf(),
        )

        /**
         * The DID or SIP URI to dial out to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): String = to.getRequired("to")

        /**
         * Enables Answering Machine Detection. When a call is answered, Telnyx runs real-time
         * detection to determine if it was picked up by a human or a machine and sends an
         * `call.machine.detection.ended` webhook with the analysis result. If 'greeting_end' or
         * 'detect_words' is used and a 'machine' is detected, you will receive another
         * 'call.machine.greeting.ended' webhook when the answering machine greeting ends with a
         * beep or silence. If `detect_beep` is used, you will only receive
         * 'call.machine.greeting.ended' if a beep is detected.
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
         * The URL of a file to be played back when the transfer destination answers before bridging
         * the call. The URL can point to either a WAV or MP3 file. media_name and audio_url cannot
         * be used together in one request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audioUrl(): Optional<String> = audioUrl.getOptional("audio_url")

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientState(): Optional<String> = clientState.getOptional("client_state")

        /**
         * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
         * `command_id` for the same `call_control_id`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commandId(): Optional<String> = commandId.getOptional("command_id")

        /**
         * Custom headers to be added to the SIP INVITE.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customHeaders(): Optional<List<CustomSipHeader>> =
            customHeaders.getOptional("custom_headers")

        /**
         * If set to false, early media will not be passed to the originating leg.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun earlyMedia(): Optional<Boolean> = earlyMedia.getOptional("early_media")

        /**
         * The `from` number to be used as the caller id presented to the destination (`to` number).
         * The number should be in +E164 format. This attribute will default to the `to` number of
         * the original call if omitted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun from(): Optional<String> = from.getOptional("from")

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
         * Defines whether media should be encrypted on the new call leg.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaEncryption(): Optional<MediaEncryption> =
            mediaEncryption.getOptional("media_encryption")

        /**
         * The media_name of a file to be played back when the transfer destination answers before
         * bridging the call. The media_name must point to a file previously uploaded to
         * api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or
         * MP3 file.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaName(): Optional<String> = mediaName.getOptional("media_name")

        /**
         * When enabled, DTMF tones are not passed to the call participant. The webhooks containing
         * the DTMF information will be sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun muteDtmf(): Optional<MuteDtmf> = muteDtmf.getOptional("mute_dtmf")

        /**
         * Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is
         * transferred). If supplied with the value `self`, the current leg will be parked after
         * unbridge. If not set, the default behavior is to hang up the leg.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parkAfterUnbridge(): Optional<String> =
            parkAfterUnbridge.getOptional("park_after_unbridge")

        /**
         * The list of comma-separated codecs in order of preference to be used during the call. The
         * codecs supported are `G722`, `PCMU`, `PCMA`, `G729`, `OPUS`, `VP8`, `H264`, `AMR-WB`.
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
         * SIP headers to be added to the SIP INVITE. Currently only User-to-User header is
         * supported.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipHeaders(): Optional<List<SipHeader>> = sipHeaders.getOptional("sip_headers")

        /**
         * Defines the SIP region to be used for the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipRegion(): Optional<SipRegion> = sipRegion.getOptional("sip_region")

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
         * Use this field to add state to every subsequent webhook for the new leg. It must be a
         * valid Base-64 encoded string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun targetLegClientState(): Optional<String> =
            targetLegClientState.getOptional("target_leg_client_state")

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
         * destination to which it is being transferred. If the timeout is reached before an answer
         * is received, the call will hangup and a `call.hangup` webhook with a `hangup_cause` of
         * `timeout` will be sent. Minimum value is 5 seconds. Maximum value is 600 seconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeoutSecs(): Optional<Int> = timeoutSecs.getOptional("timeout_secs")

        /**
         * A map of event types to retry policies. Each retry policy contains an array of
         * `retries_ms` specifying the delays between retry attempts in milliseconds. Maximum 5
         * retries, total delay cannot exceed 60 seconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookRetriesPolicies(): Optional<WebhookRetriesPolicies> =
            webhookRetriesPolicies.getOptional("webhook_retries_policies")

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
         * A map of event types to webhook URLs. When an event of the specified type occurs, the
         * webhook URL associated with that event type will be called instead of `webhook_url`.
         * Events not mapped here will use the default `webhook_url`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrls(): Optional<WebhookUrls> = webhookUrls.getOptional("webhook_urls")

        /**
         * HTTP request method to invoke `webhook_urls`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrlsMethod(): Optional<WebhookUrlsMethod> =
            webhookUrlsMethod.getOptional("webhook_urls_method")

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

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
         * Returns the raw JSON value of [customHeaders].
         *
         * Unlike [customHeaders], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_headers")
        @ExcludeMissing
        fun _customHeaders(): JsonField<List<CustomSipHeader>> = customHeaders

        /**
         * Returns the raw JSON value of [earlyMedia].
         *
         * Unlike [earlyMedia], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("early_media")
        @ExcludeMissing
        fun _earlyMedia(): JsonField<Boolean> = earlyMedia

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

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
         * Returns the raw JSON value of [muteDtmf].
         *
         * Unlike [muteDtmf], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mute_dtmf") @ExcludeMissing fun _muteDtmf(): JsonField<MuteDtmf> = muteDtmf

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
         * Returns the raw JSON value of [sipRegion].
         *
         * Unlike [sipRegion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sip_region")
        @ExcludeMissing
        fun _sipRegion(): JsonField<SipRegion> = sipRegion

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
         * Returns the raw JSON value of [targetLegClientState].
         *
         * Unlike [targetLegClientState], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("target_leg_client_state")
        @ExcludeMissing
        fun _targetLegClientState(): JsonField<String> = targetLegClientState

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
         * Returns the raw JSON value of [webhookRetriesPolicies].
         *
         * Unlike [webhookRetriesPolicies], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhook_retries_policies")
        @ExcludeMissing
        fun _webhookRetriesPolicies(): JsonField<WebhookRetriesPolicies> = webhookRetriesPolicies

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

        /**
         * Returns the raw JSON value of [webhookUrls].
         *
         * Unlike [webhookUrls], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_urls")
        @ExcludeMissing
        fun _webhookUrls(): JsonField<WebhookUrls> = webhookUrls

        /**
         * Returns the raw JSON value of [webhookUrlsMethod].
         *
         * Unlike [webhookUrlsMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhook_urls_method")
        @ExcludeMissing
        fun _webhookUrlsMethod(): JsonField<WebhookUrlsMethod> = webhookUrlsMethod

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
             * .to()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var to: JsonField<String>? = null
            private var answeringMachineDetection: JsonField<AnsweringMachineDetection> =
                JsonMissing.of()
            private var answeringMachineDetectionConfig:
                JsonField<AnsweringMachineDetectionConfig> =
                JsonMissing.of()
            private var audioUrl: JsonField<String> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var customHeaders: JsonField<MutableList<CustomSipHeader>>? = null
            private var earlyMedia: JsonField<Boolean> = JsonMissing.of()
            private var from: JsonField<String> = JsonMissing.of()
            private var fromDisplayName: JsonField<String> = JsonMissing.of()
            private var mediaEncryption: JsonField<MediaEncryption> = JsonMissing.of()
            private var mediaName: JsonField<String> = JsonMissing.of()
            private var muteDtmf: JsonField<MuteDtmf> = JsonMissing.of()
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
            private var sipAuthPassword: JsonField<String> = JsonMissing.of()
            private var sipAuthUsername: JsonField<String> = JsonMissing.of()
            private var sipHeaders: JsonField<MutableList<SipHeader>>? = null
            private var sipRegion: JsonField<SipRegion> = JsonMissing.of()
            private var sipTransportProtocol: JsonField<SipTransportProtocol> = JsonMissing.of()
            private var soundModifications: JsonField<SoundModifications> = JsonMissing.of()
            private var targetLegClientState: JsonField<String> = JsonMissing.of()
            private var timeLimitSecs: JsonField<Int> = JsonMissing.of()
            private var timeoutSecs: JsonField<Int> = JsonMissing.of()
            private var webhookRetriesPolicies: JsonField<WebhookRetriesPolicies> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var webhookUrlMethod: JsonField<WebhookUrlMethod> = JsonMissing.of()
            private var webhookUrls: JsonField<WebhookUrls> = JsonMissing.of()
            private var webhookUrlsMethod: JsonField<WebhookUrlsMethod> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                to = body.to
                answeringMachineDetection = body.answeringMachineDetection
                answeringMachineDetectionConfig = body.answeringMachineDetectionConfig
                audioUrl = body.audioUrl
                clientState = body.clientState
                commandId = body.commandId
                customHeaders = body.customHeaders.map { it.toMutableList() }
                earlyMedia = body.earlyMedia
                from = body.from
                fromDisplayName = body.fromDisplayName
                mediaEncryption = body.mediaEncryption
                mediaName = body.mediaName
                muteDtmf = body.muteDtmf
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
                sipAuthPassword = body.sipAuthPassword
                sipAuthUsername = body.sipAuthUsername
                sipHeaders = body.sipHeaders.map { it.toMutableList() }
                sipRegion = body.sipRegion
                sipTransportProtocol = body.sipTransportProtocol
                soundModifications = body.soundModifications
                targetLegClientState = body.targetLegClientState
                timeLimitSecs = body.timeLimitSecs
                timeoutSecs = body.timeoutSecs
                webhookRetriesPolicies = body.webhookRetriesPolicies
                webhookUrl = body.webhookUrl
                webhookUrlMethod = body.webhookUrlMethod
                webhookUrls = body.webhookUrls
                webhookUrlsMethod = body.webhookUrlsMethod
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The DID or SIP URI to dial out to. */
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
             * Enables Answering Machine Detection. When a call is answered, Telnyx runs real-time
             * detection to determine if it was picked up by a human or a machine and sends an
             * `call.machine.detection.ended` webhook with the analysis result. If 'greeting_end' or
             * 'detect_words' is used and a 'machine' is detected, you will receive another
             * 'call.machine.greeting.ended' webhook when the answering machine greeting ends with a
             * beep or silence. If `detect_beep` is used, you will only receive
             * 'call.machine.greeting.ended' if a beep is detected.
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
             * The URL of a file to be played back when the transfer destination answers before
             * bridging the call. The URL can point to either a WAV or MP3 file. media_name and
             * audio_url cannot be used together in one request.
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
             * Use this field to avoid duplicate commands. Telnyx will ignore any command with the
             * same `command_id` for the same `call_control_id`.
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

            /** If set to false, early media will not be passed to the originating leg. */
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
             * The `from` number to be used as the caller id presented to the destination (`to`
             * number). The number should be in +E164 format. This attribute will default to the
             * `to` number of the original call if omitted.
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

            /** Defines whether media should be encrypted on the new call leg. */
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
             * The media_name of a file to be played back when the transfer destination answers
             * before bridging the call. The media_name must point to a file previously uploaded to
             * api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV
             * or MP3 file.
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
             * When enabled, DTMF tones are not passed to the call participant. The webhooks
             * containing the DTMF information will be sent.
             */
            fun muteDtmf(muteDtmf: MuteDtmf) = muteDtmf(JsonField.of(muteDtmf))

            /**
             * Sets [Builder.muteDtmf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.muteDtmf] with a well-typed [MuteDtmf] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun muteDtmf(muteDtmf: JsonField<MuteDtmf>) = apply { this.muteDtmf = muteDtmf }

            /**
             * Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is
             * transferred). If supplied with the value `self`, the current leg will be parked after
             * unbridge. If not set, the default behavior is to hang up the leg.
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
             * The list of comma-separated codecs in order of preference to be used during the call.
             * The codecs supported are `G722`, `PCMU`, `PCMA`, `G729`, `OPUS`, `VP8`, `H264`,
             * `AMR-WB`.
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
             * SIP headers to be added to the SIP INVITE. Currently only User-to-User header is
             * supported.
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

            /** Defines the SIP region to be used for the call. */
            fun sipRegion(sipRegion: SipRegion) = sipRegion(JsonField.of(sipRegion))

            /**
             * Sets [Builder.sipRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipRegion] with a well-typed [SipRegion] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sipRegion(sipRegion: JsonField<SipRegion>) = apply { this.sipRegion = sipRegion }

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
             * Use this field to add state to every subsequent webhook for the new leg. It must be a
             * valid Base-64 encoded string.
             */
            fun targetLegClientState(targetLegClientState: String) =
                targetLegClientState(JsonField.of(targetLegClientState))

            /**
             * Sets [Builder.targetLegClientState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetLegClientState] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun targetLegClientState(targetLegClientState: JsonField<String>) = apply {
                this.targetLegClientState = targetLegClientState
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
             * destination to which it is being transferred. If the timeout is reached before an
             * answer is received, the call will hangup and a `call.hangup` webhook with a
             * `hangup_cause` of `timeout` will be sent. Minimum value is 5 seconds. Maximum value
             * is 600 seconds.
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

            /**
             * A map of event types to retry policies. Each retry policy contains an array of
             * `retries_ms` specifying the delays between retry attempts in milliseconds. Maximum 5
             * retries, total delay cannot exceed 60 seconds.
             */
            fun webhookRetriesPolicies(webhookRetriesPolicies: WebhookRetriesPolicies) =
                webhookRetriesPolicies(JsonField.of(webhookRetriesPolicies))

            /**
             * Sets [Builder.webhookRetriesPolicies] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookRetriesPolicies] with a well-typed
             * [WebhookRetriesPolicies] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun webhookRetriesPolicies(webhookRetriesPolicies: JsonField<WebhookRetriesPolicies>) =
                apply {
                    this.webhookRetriesPolicies = webhookRetriesPolicies
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

            /**
             * A map of event types to webhook URLs. When an event of the specified type occurs, the
             * webhook URL associated with that event type will be called instead of `webhook_url`.
             * Events not mapped here will use the default `webhook_url`.
             */
            fun webhookUrls(webhookUrls: WebhookUrls) = webhookUrls(JsonField.of(webhookUrls))

            /**
             * Sets [Builder.webhookUrls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrls] with a well-typed [WebhookUrls] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrls(webhookUrls: JsonField<WebhookUrls>) = apply {
                this.webhookUrls = webhookUrls
            }

            /** HTTP request method to invoke `webhook_urls`. */
            fun webhookUrlsMethod(webhookUrlsMethod: WebhookUrlsMethod) =
                webhookUrlsMethod(JsonField.of(webhookUrlsMethod))

            /**
             * Sets [Builder.webhookUrlsMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrlsMethod] with a well-typed
             * [WebhookUrlsMethod] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun webhookUrlsMethod(webhookUrlsMethod: JsonField<WebhookUrlsMethod>) = apply {
                this.webhookUrlsMethod = webhookUrlsMethod
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
             * .to()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("to", to),
                    answeringMachineDetection,
                    answeringMachineDetectionConfig,
                    audioUrl,
                    clientState,
                    commandId,
                    (customHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                    earlyMedia,
                    from,
                    fromDisplayName,
                    mediaEncryption,
                    mediaName,
                    muteDtmf,
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
                    sipAuthPassword,
                    sipAuthUsername,
                    (sipHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                    sipRegion,
                    sipTransportProtocol,
                    soundModifications,
                    targetLegClientState,
                    timeLimitSecs,
                    timeoutSecs,
                    webhookRetriesPolicies,
                    webhookUrl,
                    webhookUrlMethod,
                    webhookUrls,
                    webhookUrlsMethod,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            to()
            answeringMachineDetection().ifPresent { it.validate() }
            answeringMachineDetectionConfig().ifPresent { it.validate() }
            audioUrl()
            clientState()
            commandId()
            customHeaders().ifPresent { it.forEach { it.validate() } }
            earlyMedia()
            from()
            fromDisplayName()
            mediaEncryption().ifPresent { it.validate() }
            mediaName()
            muteDtmf().ifPresent { it.validate() }
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
            sipAuthPassword()
            sipAuthUsername()
            sipHeaders().ifPresent { it.forEach { it.validate() } }
            sipRegion().ifPresent { it.validate() }
            sipTransportProtocol().ifPresent { it.validate() }
            soundModifications().ifPresent { it.validate() }
            targetLegClientState()
            timeLimitSecs()
            timeoutSecs()
            webhookRetriesPolicies().ifPresent { it.validate() }
            webhookUrl()
            webhookUrlMethod().ifPresent { it.validate() }
            webhookUrls().ifPresent { it.validate() }
            webhookUrlsMethod().ifPresent { it.validate() }
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
            (if (to.asKnown().isPresent) 1 else 0) +
                (answeringMachineDetection.asKnown().getOrNull()?.validity() ?: 0) +
                (answeringMachineDetectionConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (audioUrl.asKnown().isPresent) 1 else 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (customHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (earlyMedia.asKnown().isPresent) 1 else 0) +
                (if (from.asKnown().isPresent) 1 else 0) +
                (if (fromDisplayName.asKnown().isPresent) 1 else 0) +
                (mediaEncryption.asKnown().getOrNull()?.validity() ?: 0) +
                (if (mediaName.asKnown().isPresent) 1 else 0) +
                (muteDtmf.asKnown().getOrNull()?.validity() ?: 0) +
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
                (if (sipAuthPassword.asKnown().isPresent) 1 else 0) +
                (if (sipAuthUsername.asKnown().isPresent) 1 else 0) +
                (sipHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (sipRegion.asKnown().getOrNull()?.validity() ?: 0) +
                (sipTransportProtocol.asKnown().getOrNull()?.validity() ?: 0) +
                (soundModifications.asKnown().getOrNull()?.validity() ?: 0) +
                (if (targetLegClientState.asKnown().isPresent) 1 else 0) +
                (if (timeLimitSecs.asKnown().isPresent) 1 else 0) +
                (if (timeoutSecs.asKnown().isPresent) 1 else 0) +
                (webhookRetriesPolicies.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0) +
                (webhookUrlMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (webhookUrls.asKnown().getOrNull()?.validity() ?: 0) +
                (webhookUrlsMethod.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                to == other.to &&
                answeringMachineDetection == other.answeringMachineDetection &&
                answeringMachineDetectionConfig == other.answeringMachineDetectionConfig &&
                audioUrl == other.audioUrl &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                customHeaders == other.customHeaders &&
                earlyMedia == other.earlyMedia &&
                from == other.from &&
                fromDisplayName == other.fromDisplayName &&
                mediaEncryption == other.mediaEncryption &&
                mediaName == other.mediaName &&
                muteDtmf == other.muteDtmf &&
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
                sipAuthPassword == other.sipAuthPassword &&
                sipAuthUsername == other.sipAuthUsername &&
                sipHeaders == other.sipHeaders &&
                sipRegion == other.sipRegion &&
                sipTransportProtocol == other.sipTransportProtocol &&
                soundModifications == other.soundModifications &&
                targetLegClientState == other.targetLegClientState &&
                timeLimitSecs == other.timeLimitSecs &&
                timeoutSecs == other.timeoutSecs &&
                webhookRetriesPolicies == other.webhookRetriesPolicies &&
                webhookUrl == other.webhookUrl &&
                webhookUrlMethod == other.webhookUrlMethod &&
                webhookUrls == other.webhookUrls &&
                webhookUrlsMethod == other.webhookUrlsMethod &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                to,
                answeringMachineDetection,
                answeringMachineDetectionConfig,
                audioUrl,
                clientState,
                commandId,
                customHeaders,
                earlyMedia,
                from,
                fromDisplayName,
                mediaEncryption,
                mediaName,
                muteDtmf,
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
                sipAuthPassword,
                sipAuthUsername,
                sipHeaders,
                sipRegion,
                sipTransportProtocol,
                soundModifications,
                targetLegClientState,
                timeLimitSecs,
                timeoutSecs,
                webhookRetriesPolicies,
                webhookUrl,
                webhookUrlMethod,
                webhookUrls,
                webhookUrlsMethod,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{to=$to, answeringMachineDetection=$answeringMachineDetection, answeringMachineDetectionConfig=$answeringMachineDetectionConfig, audioUrl=$audioUrl, clientState=$clientState, commandId=$commandId, customHeaders=$customHeaders, earlyMedia=$earlyMedia, from=$from, fromDisplayName=$fromDisplayName, mediaEncryption=$mediaEncryption, mediaName=$mediaName, muteDtmf=$muteDtmf, parkAfterUnbridge=$parkAfterUnbridge, preferredCodecs=$preferredCodecs, record=$record, recordChannels=$recordChannels, recordCustomFileName=$recordCustomFileName, recordFormat=$recordFormat, recordMaxLength=$recordMaxLength, recordTimeoutSecs=$recordTimeoutSecs, recordTrack=$recordTrack, recordTrim=$recordTrim, sipAuthPassword=$sipAuthPassword, sipAuthUsername=$sipAuthUsername, sipHeaders=$sipHeaders, sipRegion=$sipRegion, sipTransportProtocol=$sipTransportProtocol, soundModifications=$soundModifications, targetLegClientState=$targetLegClientState, timeLimitSecs=$timeLimitSecs, timeoutSecs=$timeoutSecs, webhookRetriesPolicies=$webhookRetriesPolicies, webhookUrl=$webhookUrl, webhookUrlMethod=$webhookUrlMethod, webhookUrls=$webhookUrls, webhookUrlsMethod=$webhookUrlsMethod, additionalProperties=$additionalProperties}"
    }

    /**
     * Enables Answering Machine Detection. When a call is answered, Telnyx runs real-time detection
     * to determine if it was picked up by a human or a machine and sends an
     * `call.machine.detection.ended` webhook with the analysis result. If 'greeting_end' or
     * 'detect_words' is used and a 'machine' is detected, you will receive another
     * 'call.machine.greeting.ended' webhook when the answering machine greeting ends with a beep or
     * silence. If `detect_beep` is used, you will only receive 'call.machine.greeting.ended' if a
     * beep is detected.
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

    /** Defines whether media should be encrypted on the new call leg. */
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

    /**
     * When enabled, DTMF tones are not passed to the call participant. The webhooks containing the
     * DTMF information will be sent.
     */
    class MuteDtmf @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NONE = of("none")

            @JvmField val BOTH = of("both")

            @JvmField val SELF = of("self")

            @JvmField val OPPOSITE = of("opposite")

            @JvmStatic fun of(value: String) = MuteDtmf(JsonField.of(value))
        }

        /** An enum containing [MuteDtmf]'s known values. */
        enum class Known {
            NONE,
            BOTH,
            SELF,
            OPPOSITE,
        }

        /**
         * An enum containing [MuteDtmf]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MuteDtmf] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            BOTH,
            SELF,
            OPPOSITE,
            /** An enum member indicating that [MuteDtmf] was instantiated with an unknown value. */
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
                NONE -> Value.NONE
                BOTH -> Value.BOTH
                SELF -> Value.SELF
                OPPOSITE -> Value.OPPOSITE
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
                NONE -> Known.NONE
                BOTH -> Known.BOTH
                SELF -> Known.SELF
                OPPOSITE -> Known.OPPOSITE
                else -> throw TelnyxInvalidDataException("Unknown MuteDtmf: $value")
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

        fun validate(): MuteDtmf = apply {
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

            return other is MuteDtmf && value == other.value
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

    /** Defines the SIP region to be used for the call. */
    class SipRegion @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val US = of("US")

            @JvmField val EUROPE = of("Europe")

            @JvmField val CANADA = of("Canada")

            @JvmField val AUSTRALIA = of("Australia")

            @JvmField val MIDDLE_EAST = of("Middle East")

            @JvmStatic fun of(value: String) = SipRegion(JsonField.of(value))
        }

        /** An enum containing [SipRegion]'s known values. */
        enum class Known {
            US,
            EUROPE,
            CANADA,
            AUSTRALIA,
            MIDDLE_EAST,
        }

        /**
         * An enum containing [SipRegion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SipRegion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            US,
            EUROPE,
            CANADA,
            AUSTRALIA,
            MIDDLE_EAST,
            /**
             * An enum member indicating that [SipRegion] was instantiated with an unknown value.
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
                US -> Value.US
                EUROPE -> Value.EUROPE
                CANADA -> Value.CANADA
                AUSTRALIA -> Value.AUSTRALIA
                MIDDLE_EAST -> Value.MIDDLE_EAST
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
                US -> Known.US
                EUROPE -> Known.EUROPE
                CANADA -> Known.CANADA
                AUSTRALIA -> Known.AUSTRALIA
                MIDDLE_EAST -> Known.MIDDLE_EAST
                else -> throw TelnyxInvalidDataException("Unknown SipRegion: $value")
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

        fun validate(): SipRegion = apply {
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

            return other is SipRegion && value == other.value
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

    /**
     * A map of event types to retry policies. Each retry policy contains an array of `retries_ms`
     * specifying the delays between retry attempts in milliseconds. Maximum 5 retries, total delay
     * cannot exceed 60 seconds.
     */
    class WebhookRetriesPolicies
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [WebhookRetriesPolicies].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WebhookRetriesPolicies]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhookRetriesPolicies: WebhookRetriesPolicies) = apply {
                additionalProperties = webhookRetriesPolicies.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [WebhookRetriesPolicies].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): WebhookRetriesPolicies =
                WebhookRetriesPolicies(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): WebhookRetriesPolicies = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WebhookRetriesPolicies &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WebhookRetriesPolicies{additionalProperties=$additionalProperties}"
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

    /**
     * A map of event types to webhook URLs. When an event of the specified type occurs, the webhook
     * URL associated with that event type will be called instead of `webhook_url`. Events not
     * mapped here will use the default `webhook_url`.
     */
    class WebhookUrls
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [WebhookUrls]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WebhookUrls]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhookUrls: WebhookUrls) = apply {
                additionalProperties = webhookUrls.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [WebhookUrls].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): WebhookUrls = WebhookUrls(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): WebhookUrls = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WebhookUrls && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "WebhookUrls{additionalProperties=$additionalProperties}"
    }

    /** HTTP request method to invoke `webhook_urls`. */
    class WebhookUrlsMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmStatic fun of(value: String) = WebhookUrlsMethod(JsonField.of(value))
        }

        /** An enum containing [WebhookUrlsMethod]'s known values. */
        enum class Known {
            POST,
            GET,
        }

        /**
         * An enum containing [WebhookUrlsMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WebhookUrlsMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            POST,
            GET,
            /**
             * An enum member indicating that [WebhookUrlsMethod] was instantiated with an unknown
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
                else -> throw TelnyxInvalidDataException("Unknown WebhookUrlsMethod: $value")
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

        fun validate(): WebhookUrlsMethod = apply {
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

            return other is WebhookUrlsMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionTransferParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionTransferParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
