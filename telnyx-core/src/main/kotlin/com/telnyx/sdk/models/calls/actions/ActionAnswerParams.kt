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
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.calls.CustomSipHeader
import com.telnyx.sdk.models.calls.SipHeader
import com.telnyx.sdk.models.calls.SoundModifications
import com.telnyx.sdk.models.calls.StreamBidirectionalCodec
import com.telnyx.sdk.models.calls.StreamBidirectionalMode
import com.telnyx.sdk.models.calls.StreamBidirectionalTargetLegs
import com.telnyx.sdk.models.calls.StreamCodec
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Answer an incoming call. You must issue this command before executing subsequent commands on an
 * incoming call.
 *
 * **Expected Webhooks:**
 * - `call.answered`
 * - `streaming.started`, `streaming.stopped` or `streaming.failed` if `stream_url` was set
 *
 * When the `record` parameter is set to `record-from-answer`, the response will include a
 * `recording_id` field.
 */
class ActionAnswerParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    /**
     * Use this field to set the Billing Group ID for the call. Must be a valid and existing Billing
     * Group ID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingGroupId(): Optional<String> = body.billingGroupId()

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
     * Custom headers to be added to the SIP INVITE response.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customHeaders(): Optional<List<CustomSipHeader>> = body.customHeaders()

    /**
     * The list of comma-separated codecs in a preferred order for the forked media to be received.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferredCodecs(): Optional<PreferredCodecs> = body.preferredCodecs()

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
     * SIP headers to be added to the SIP INVITE response. Currently only User-to-User header is
     * supported.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipHeaders(): Optional<List<SipHeader>> = body.sipHeaders()

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
     * Returns the raw JSON value of [billingGroupId].
     *
     * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingGroupId(): JsonField<String> = body._billingGroupId()

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
     * Returns the raw JSON value of [preferredCodecs].
     *
     * Unlike [preferredCodecs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _preferredCodecs(): JsonField<PreferredCodecs> = body._preferredCodecs()

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
     * Returns the raw JSON value of [sipHeaders].
     *
     * Unlike [sipHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sipHeaders(): JsonField<List<SipHeader>> = body._sipHeaders()

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

        @JvmStatic fun none(): ActionAnswerParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ActionAnswerParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionAnswerParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionAnswerParams: ActionAnswerParams) = apply {
            callControlId = actionAnswerParams.callControlId
            body = actionAnswerParams.body.toBuilder()
            additionalHeaders = actionAnswerParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionAnswerParams.additionalQueryParams.toBuilder()
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
         * - [billingGroupId]
         * - [clientState]
         * - [commandId]
         * - [customHeaders]
         * - [preferredCodecs]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

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

        /** Custom headers to be added to the SIP INVITE response. */
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

        /**
         * The list of comma-separated codecs in a preferred order for the forked media to be
         * received.
         */
        fun preferredCodecs(preferredCodecs: PreferredCodecs) = apply {
            body.preferredCodecs(preferredCodecs)
        }

        /**
         * Sets [Builder.preferredCodecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferredCodecs] with a well-typed [PreferredCodecs]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun preferredCodecs(preferredCodecs: JsonField<PreferredCodecs>) = apply {
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

        /**
         * SIP headers to be added to the SIP INVITE response. Currently only User-to-User header is
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
         * Returns an immutable instance of [ActionAnswerParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionAnswerParams =
            ActionAnswerParams(
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
        private val billingGroupId: JsonField<String>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val customHeaders: JsonField<List<CustomSipHeader>>,
        private val preferredCodecs: JsonField<PreferredCodecs>,
        private val record: JsonField<Record>,
        private val recordChannels: JsonField<RecordChannels>,
        private val recordCustomFileName: JsonField<String>,
        private val recordFormat: JsonField<RecordFormat>,
        private val recordMaxLength: JsonField<Int>,
        private val recordTimeoutSecs: JsonField<Int>,
        private val recordTrack: JsonField<RecordTrack>,
        private val recordTrim: JsonField<RecordTrim>,
        private val sendSilenceWhenIdle: JsonField<Boolean>,
        private val sipHeaders: JsonField<List<SipHeader>>,
        private val soundModifications: JsonField<SoundModifications>,
        private val streamBidirectionalCodec: JsonField<StreamBidirectionalCodec>,
        private val streamBidirectionalMode: JsonField<StreamBidirectionalMode>,
        private val streamBidirectionalTargetLegs: JsonField<StreamBidirectionalTargetLegs>,
        private val streamCodec: JsonField<StreamCodec>,
        private val streamTrack: JsonField<StreamTrack>,
        private val streamUrl: JsonField<String>,
        private val transcription: JsonField<Boolean>,
        private val transcriptionConfig: JsonField<TranscriptionStartRequest>,
        private val webhookRetriesPolicies: JsonField<WebhookRetriesPolicies>,
        private val webhookUrl: JsonField<String>,
        private val webhookUrlMethod: JsonField<WebhookUrlMethod>,
        private val webhookUrls: JsonField<WebhookUrls>,
        private val webhookUrlsMethod: JsonField<WebhookUrlsMethod>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing_group_id")
            @ExcludeMissing
            billingGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_headers")
            @ExcludeMissing
            customHeaders: JsonField<List<CustomSipHeader>> = JsonMissing.of(),
            @JsonProperty("preferred_codecs")
            @ExcludeMissing
            preferredCodecs: JsonField<PreferredCodecs> = JsonMissing.of(),
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
            @JsonProperty("sip_headers")
            @ExcludeMissing
            sipHeaders: JsonField<List<SipHeader>> = JsonMissing.of(),
            @JsonProperty("sound_modifications")
            @ExcludeMissing
            soundModifications: JsonField<SoundModifications> = JsonMissing.of(),
            @JsonProperty("stream_bidirectional_codec")
            @ExcludeMissing
            streamBidirectionalCodec: JsonField<StreamBidirectionalCodec> = JsonMissing.of(),
            @JsonProperty("stream_bidirectional_mode")
            @ExcludeMissing
            streamBidirectionalMode: JsonField<StreamBidirectionalMode> = JsonMissing.of(),
            @JsonProperty("stream_bidirectional_target_legs")
            @ExcludeMissing
            streamBidirectionalTargetLegs: JsonField<StreamBidirectionalTargetLegs> =
                JsonMissing.of(),
            @JsonProperty("stream_codec")
            @ExcludeMissing
            streamCodec: JsonField<StreamCodec> = JsonMissing.of(),
            @JsonProperty("stream_track")
            @ExcludeMissing
            streamTrack: JsonField<StreamTrack> = JsonMissing.of(),
            @JsonProperty("stream_url")
            @ExcludeMissing
            streamUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transcription")
            @ExcludeMissing
            transcription: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("transcription_config")
            @ExcludeMissing
            transcriptionConfig: JsonField<TranscriptionStartRequest> = JsonMissing.of(),
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
            billingGroupId,
            clientState,
            commandId,
            customHeaders,
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
            sipHeaders,
            soundModifications,
            streamBidirectionalCodec,
            streamBidirectionalMode,
            streamBidirectionalTargetLegs,
            streamCodec,
            streamTrack,
            streamUrl,
            transcription,
            transcriptionConfig,
            webhookRetriesPolicies,
            webhookUrl,
            webhookUrlMethod,
            webhookUrls,
            webhookUrlsMethod,
            mutableMapOf(),
        )

        /**
         * Use this field to set the Billing Group ID for the call. Must be a valid and existing
         * Billing Group ID.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingGroupId(): Optional<String> = billingGroupId.getOptional("billing_group_id")

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
         * Custom headers to be added to the SIP INVITE response.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customHeaders(): Optional<List<CustomSipHeader>> =
            customHeaders.getOptional("custom_headers")

        /**
         * The list of comma-separated codecs in a preferred order for the forked media to be
         * received.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun preferredCodecs(): Optional<PreferredCodecs> =
            preferredCodecs.getOptional("preferred_codecs")

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
         * SIP headers to be added to the SIP INVITE response. Currently only User-to-User header is
         * supported.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipHeaders(): Optional<List<SipHeader>> = sipHeaders.getOptional("sip_headers")

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
         * Returns the raw JSON value of [billingGroupId].
         *
         * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_group_id")
        @ExcludeMissing
        fun _billingGroupId(): JsonField<String> = billingGroupId

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
         * Returns the raw JSON value of [preferredCodecs].
         *
         * Unlike [preferredCodecs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preferred_codecs")
        @ExcludeMissing
        fun _preferredCodecs(): JsonField<PreferredCodecs> = preferredCodecs

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
         * Returns the raw JSON value of [sipHeaders].
         *
         * Unlike [sipHeaders], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sip_headers")
        @ExcludeMissing
        fun _sipHeaders(): JsonField<List<SipHeader>> = sipHeaders

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billingGroupId: JsonField<String> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var customHeaders: JsonField<MutableList<CustomSipHeader>>? = null
            private var preferredCodecs: JsonField<PreferredCodecs> = JsonMissing.of()
            private var record: JsonField<Record> = JsonMissing.of()
            private var recordChannels: JsonField<RecordChannels> = JsonMissing.of()
            private var recordCustomFileName: JsonField<String> = JsonMissing.of()
            private var recordFormat: JsonField<RecordFormat> = JsonMissing.of()
            private var recordMaxLength: JsonField<Int> = JsonMissing.of()
            private var recordTimeoutSecs: JsonField<Int> = JsonMissing.of()
            private var recordTrack: JsonField<RecordTrack> = JsonMissing.of()
            private var recordTrim: JsonField<RecordTrim> = JsonMissing.of()
            private var sendSilenceWhenIdle: JsonField<Boolean> = JsonMissing.of()
            private var sipHeaders: JsonField<MutableList<SipHeader>>? = null
            private var soundModifications: JsonField<SoundModifications> = JsonMissing.of()
            private var streamBidirectionalCodec: JsonField<StreamBidirectionalCodec> =
                JsonMissing.of()
            private var streamBidirectionalMode: JsonField<StreamBidirectionalMode> =
                JsonMissing.of()
            private var streamBidirectionalTargetLegs: JsonField<StreamBidirectionalTargetLegs> =
                JsonMissing.of()
            private var streamCodec: JsonField<StreamCodec> = JsonMissing.of()
            private var streamTrack: JsonField<StreamTrack> = JsonMissing.of()
            private var streamUrl: JsonField<String> = JsonMissing.of()
            private var transcription: JsonField<Boolean> = JsonMissing.of()
            private var transcriptionConfig: JsonField<TranscriptionStartRequest> = JsonMissing.of()
            private var webhookRetriesPolicies: JsonField<WebhookRetriesPolicies> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var webhookUrlMethod: JsonField<WebhookUrlMethod> = JsonMissing.of()
            private var webhookUrls: JsonField<WebhookUrls> = JsonMissing.of()
            private var webhookUrlsMethod: JsonField<WebhookUrlsMethod> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                billingGroupId = body.billingGroupId
                clientState = body.clientState
                commandId = body.commandId
                customHeaders = body.customHeaders.map { it.toMutableList() }
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
                sipHeaders = body.sipHeaders.map { it.toMutableList() }
                soundModifications = body.soundModifications
                streamBidirectionalCodec = body.streamBidirectionalCodec
                streamBidirectionalMode = body.streamBidirectionalMode
                streamBidirectionalTargetLegs = body.streamBidirectionalTargetLegs
                streamCodec = body.streamCodec
                streamTrack = body.streamTrack
                streamUrl = body.streamUrl
                transcription = body.transcription
                transcriptionConfig = body.transcriptionConfig
                webhookRetriesPolicies = body.webhookRetriesPolicies
                webhookUrl = body.webhookUrl
                webhookUrlMethod = body.webhookUrlMethod
                webhookUrls = body.webhookUrls
                webhookUrlsMethod = body.webhookUrlsMethod
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            /** Custom headers to be added to the SIP INVITE response. */
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

            /**
             * The list of comma-separated codecs in a preferred order for the forked media to be
             * received.
             */
            fun preferredCodecs(preferredCodecs: PreferredCodecs) =
                preferredCodecs(JsonField.of(preferredCodecs))

            /**
             * Sets [Builder.preferredCodecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preferredCodecs] with a well-typed [PreferredCodecs]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun preferredCodecs(preferredCodecs: JsonField<PreferredCodecs>) = apply {
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

            /**
             * SIP headers to be added to the SIP INVITE response. Currently only User-to-User
             * header is supported.
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
             */
            fun build(): Body =
                Body(
                    billingGroupId,
                    clientState,
                    commandId,
                    (customHeaders ?: JsonMissing.of()).map { it.toImmutable() },
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
                    (sipHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                    soundModifications,
                    streamBidirectionalCodec,
                    streamBidirectionalMode,
                    streamBidirectionalTargetLegs,
                    streamCodec,
                    streamTrack,
                    streamUrl,
                    transcription,
                    transcriptionConfig,
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

            billingGroupId()
            clientState()
            commandId()
            customHeaders().ifPresent { it.forEach { it.validate() } }
            preferredCodecs().ifPresent { it.validate() }
            record().ifPresent { it.validate() }
            recordChannels().ifPresent { it.validate() }
            recordCustomFileName()
            recordFormat().ifPresent { it.validate() }
            recordMaxLength()
            recordTimeoutSecs()
            recordTrack().ifPresent { it.validate() }
            recordTrim().ifPresent { it.validate() }
            sendSilenceWhenIdle()
            sipHeaders().ifPresent { it.forEach { it.validate() } }
            soundModifications().ifPresent { it.validate() }
            streamBidirectionalCodec().ifPresent { it.validate() }
            streamBidirectionalMode().ifPresent { it.validate() }
            streamBidirectionalTargetLegs().ifPresent { it.validate() }
            streamCodec().ifPresent { it.validate() }
            streamTrack().ifPresent { it.validate() }
            streamUrl()
            transcription()
            transcriptionConfig().ifPresent { it.validate() }
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
            (if (billingGroupId.asKnown().isPresent) 1 else 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (customHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (preferredCodecs.asKnown().getOrNull()?.validity() ?: 0) +
                (record.asKnown().getOrNull()?.validity() ?: 0) +
                (recordChannels.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordCustomFileName.asKnown().isPresent) 1 else 0) +
                (recordFormat.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordMaxLength.asKnown().isPresent) 1 else 0) +
                (if (recordTimeoutSecs.asKnown().isPresent) 1 else 0) +
                (recordTrack.asKnown().getOrNull()?.validity() ?: 0) +
                (recordTrim.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sendSilenceWhenIdle.asKnown().isPresent) 1 else 0) +
                (sipHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (soundModifications.asKnown().getOrNull()?.validity() ?: 0) +
                (streamBidirectionalCodec.asKnown().getOrNull()?.validity() ?: 0) +
                (streamBidirectionalMode.asKnown().getOrNull()?.validity() ?: 0) +
                (streamBidirectionalTargetLegs.asKnown().getOrNull()?.validity() ?: 0) +
                (streamCodec.asKnown().getOrNull()?.validity() ?: 0) +
                (streamTrack.asKnown().getOrNull()?.validity() ?: 0) +
                (if (streamUrl.asKnown().isPresent) 1 else 0) +
                (if (transcription.asKnown().isPresent) 1 else 0) +
                (transcriptionConfig.asKnown().getOrNull()?.validity() ?: 0) +
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
                billingGroupId == other.billingGroupId &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                customHeaders == other.customHeaders &&
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
                sipHeaders == other.sipHeaders &&
                soundModifications == other.soundModifications &&
                streamBidirectionalCodec == other.streamBidirectionalCodec &&
                streamBidirectionalMode == other.streamBidirectionalMode &&
                streamBidirectionalTargetLegs == other.streamBidirectionalTargetLegs &&
                streamCodec == other.streamCodec &&
                streamTrack == other.streamTrack &&
                streamUrl == other.streamUrl &&
                transcription == other.transcription &&
                transcriptionConfig == other.transcriptionConfig &&
                webhookRetriesPolicies == other.webhookRetriesPolicies &&
                webhookUrl == other.webhookUrl &&
                webhookUrlMethod == other.webhookUrlMethod &&
                webhookUrls == other.webhookUrls &&
                webhookUrlsMethod == other.webhookUrlsMethod &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingGroupId,
                clientState,
                commandId,
                customHeaders,
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
                sipHeaders,
                soundModifications,
                streamBidirectionalCodec,
                streamBidirectionalMode,
                streamBidirectionalTargetLegs,
                streamCodec,
                streamTrack,
                streamUrl,
                transcription,
                transcriptionConfig,
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
            "Body{billingGroupId=$billingGroupId, clientState=$clientState, commandId=$commandId, customHeaders=$customHeaders, preferredCodecs=$preferredCodecs, record=$record, recordChannels=$recordChannels, recordCustomFileName=$recordCustomFileName, recordFormat=$recordFormat, recordMaxLength=$recordMaxLength, recordTimeoutSecs=$recordTimeoutSecs, recordTrack=$recordTrack, recordTrim=$recordTrim, sendSilenceWhenIdle=$sendSilenceWhenIdle, sipHeaders=$sipHeaders, soundModifications=$soundModifications, streamBidirectionalCodec=$streamBidirectionalCodec, streamBidirectionalMode=$streamBidirectionalMode, streamBidirectionalTargetLegs=$streamBidirectionalTargetLegs, streamCodec=$streamCodec, streamTrack=$streamTrack, streamUrl=$streamUrl, transcription=$transcription, transcriptionConfig=$transcriptionConfig, webhookRetriesPolicies=$webhookRetriesPolicies, webhookUrl=$webhookUrl, webhookUrlMethod=$webhookUrlMethod, webhookUrls=$webhookUrls, webhookUrlsMethod=$webhookUrlsMethod, additionalProperties=$additionalProperties}"
    }

    /**
     * The list of comma-separated codecs in a preferred order for the forked media to be received.
     */
    class PreferredCodecs @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField
            val G722_PCMU_PCMA_G729_OPUS_VP8_H264 = of("G722,PCMU,PCMA,G729,OPUS,VP8,H264")

            @JvmStatic fun of(value: String) = PreferredCodecs(JsonField.of(value))
        }

        /** An enum containing [PreferredCodecs]'s known values. */
        enum class Known {
            G722_PCMU_PCMA_G729_OPUS_VP8_H264
        }

        /**
         * An enum containing [PreferredCodecs]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PreferredCodecs] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            G722_PCMU_PCMA_G729_OPUS_VP8_H264,
            /**
             * An enum member indicating that [PreferredCodecs] was instantiated with an unknown
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
                G722_PCMU_PCMA_G729_OPUS_VP8_H264 -> Value.G722_PCMU_PCMA_G729_OPUS_VP8_H264
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
                G722_PCMU_PCMA_G729_OPUS_VP8_H264 -> Known.G722_PCMU_PCMA_G729_OPUS_VP8_H264
                else -> throw TelnyxInvalidDataException("Unknown PreferredCodecs: $value")
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

        fun validate(): PreferredCodecs = apply {
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

            return other is PreferredCodecs && value == other.value
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

        return other is ActionAnswerParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionAnswerParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
