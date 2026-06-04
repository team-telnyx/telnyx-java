// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

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
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.AzureVoiceSettings
import com.telnyx.sdk.models.MinimaxVoiceSettings
import com.telnyx.sdk.models.ResembleVoiceSettings
import com.telnyx.sdk.models.RimeVoiceSettings
import com.telnyx.sdk.models.XaiVoiceSettings
import com.telnyx.sdk.models.calls.CallAssistantRequest
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
 * - `call.hold` and `call.unhold` if the call is held/unheld
 * - `call.deepfake_detection.result` if `deepfake_detection` was enabled
 * - `call.deepfake_detection.error` if `deepfake_detection` was enabled and an error occurred
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
     * AI Assistant configuration. All fields except `id` are optional — the assistant's stored
     * configuration will be used as fallback for any omitted fields.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assistant(): Optional<CallAssistantRequest> = body.assistant()

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
     * Starts a Conversation Relay session automatically when the answered/dialed call is answered.
     * This embedded shape is supported on `answer` and `dial`. It uses public field names (`url`,
     * `dtmf_detection`, `greeting`, `voice`, `language`, etc.) and maps them to the underlying
     * Conversation Relay action. `client_state`, `tts_language`, and `transcription_language`
     * inside this object are ignored; use the parent command's `client_state` and `command_id`
     * fields instead.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationRelayConfig(): Optional<ConversationRelayConfig> =
        body.conversationRelayConfig()

    /**
     * Custom headers to be added to the SIP INVITE response.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customHeaders(): Optional<List<CustomSipHeader>> = body.customHeaders()

    /**
     * Enables deepfake detection on the call. When enabled, audio from the remote party is streamed
     * to a detection service that analyzes whether the voice is AI-generated. Results are delivered
     * via the `call.deepfake_detection.result` webhook.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deepfakeDetection(): Optional<DeepfakeDetection> = body.deepfakeDetection()

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
     * Returns the raw JSON value of [assistant].
     *
     * Unlike [assistant], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assistant(): JsonField<CallAssistantRequest> = body._assistant()

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
     * Returns the raw JSON value of [conversationRelayConfig].
     *
     * Unlike [conversationRelayConfig], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _conversationRelayConfig(): JsonField<ConversationRelayConfig> =
        body._conversationRelayConfig()

    /**
     * Returns the raw JSON value of [customHeaders].
     *
     * Unlike [customHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customHeaders(): JsonField<List<CustomSipHeader>> = body._customHeaders()

    /**
     * Returns the raw JSON value of [deepfakeDetection].
     *
     * Unlike [deepfakeDetection], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _deepfakeDetection(): JsonField<DeepfakeDetection> = body._deepfakeDetection()

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
         * - [assistant]
         * - [billingGroupId]
         * - [clientState]
         * - [commandId]
         * - [conversationRelayConfig]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * AI Assistant configuration. All fields except `id` are optional — the assistant's stored
         * configuration will be used as fallback for any omitted fields.
         */
        fun assistant(assistant: CallAssistantRequest) = apply { body.assistant(assistant) }

        /**
         * Sets [Builder.assistant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assistant] with a well-typed [CallAssistantRequest]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun assistant(assistant: JsonField<CallAssistantRequest>) = apply {
            body.assistant(assistant)
        }

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

        /**
         * Starts a Conversation Relay session automatically when the answered/dialed call is
         * answered. This embedded shape is supported on `answer` and `dial`. It uses public field
         * names (`url`, `dtmf_detection`, `greeting`, `voice`, `language`, etc.) and maps them to
         * the underlying Conversation Relay action. `client_state`, `tts_language`, and
         * `transcription_language` inside this object are ignored; use the parent command's
         * `client_state` and `command_id` fields instead.
         */
        fun conversationRelayConfig(conversationRelayConfig: ConversationRelayConfig) = apply {
            body.conversationRelayConfig(conversationRelayConfig)
        }

        /**
         * Sets [Builder.conversationRelayConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationRelayConfig] with a well-typed
         * [ConversationRelayConfig] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun conversationRelayConfig(conversationRelayConfig: JsonField<ConversationRelayConfig>) =
            apply {
                body.conversationRelayConfig(conversationRelayConfig)
            }

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
         * Enables deepfake detection on the call. When enabled, audio from the remote party is
         * streamed to a detection service that analyzes whether the voice is AI-generated. Results
         * are delivered via the `call.deepfake_detection.result` webhook.
         */
        fun deepfakeDetection(deepfakeDetection: DeepfakeDetection) = apply {
            body.deepfakeDetection(deepfakeDetection)
        }

        /**
         * Sets [Builder.deepfakeDetection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deepfakeDetection] with a well-typed [DeepfakeDetection]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun deepfakeDetection(deepfakeDetection: JsonField<DeepfakeDetection>) = apply {
            body.deepfakeDetection(deepfakeDetection)
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
        private val assistant: JsonField<CallAssistantRequest>,
        private val billingGroupId: JsonField<String>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val conversationRelayConfig: JsonField<ConversationRelayConfig>,
        private val customHeaders: JsonField<List<CustomSipHeader>>,
        private val deepfakeDetection: JsonField<DeepfakeDetection>,
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
            @JsonProperty("assistant")
            @ExcludeMissing
            assistant: JsonField<CallAssistantRequest> = JsonMissing.of(),
            @JsonProperty("billing_group_id")
            @ExcludeMissing
            billingGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("conversation_relay_config")
            @ExcludeMissing
            conversationRelayConfig: JsonField<ConversationRelayConfig> = JsonMissing.of(),
            @JsonProperty("custom_headers")
            @ExcludeMissing
            customHeaders: JsonField<List<CustomSipHeader>> = JsonMissing.of(),
            @JsonProperty("deepfake_detection")
            @ExcludeMissing
            deepfakeDetection: JsonField<DeepfakeDetection> = JsonMissing.of(),
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
            assistant,
            billingGroupId,
            clientState,
            commandId,
            conversationRelayConfig,
            customHeaders,
            deepfakeDetection,
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
         * AI Assistant configuration. All fields except `id` are optional — the assistant's stored
         * configuration will be used as fallback for any omitted fields.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assistant(): Optional<CallAssistantRequest> = assistant.getOptional("assistant")

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
         * Starts a Conversation Relay session automatically when the answered/dialed call is
         * answered. This embedded shape is supported on `answer` and `dial`. It uses public field
         * names (`url`, `dtmf_detection`, `greeting`, `voice`, `language`, etc.) and maps them to
         * the underlying Conversation Relay action. `client_state`, `tts_language`, and
         * `transcription_language` inside this object are ignored; use the parent command's
         * `client_state` and `command_id` fields instead.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conversationRelayConfig(): Optional<ConversationRelayConfig> =
            conversationRelayConfig.getOptional("conversation_relay_config")

        /**
         * Custom headers to be added to the SIP INVITE response.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customHeaders(): Optional<List<CustomSipHeader>> =
            customHeaders.getOptional("custom_headers")

        /**
         * Enables deepfake detection on the call. When enabled, audio from the remote party is
         * streamed to a detection service that analyzes whether the voice is AI-generated. Results
         * are delivered via the `call.deepfake_detection.result` webhook.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deepfakeDetection(): Optional<DeepfakeDetection> =
            deepfakeDetection.getOptional("deepfake_detection")

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
         * Returns the raw JSON value of [assistant].
         *
         * Unlike [assistant], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assistant")
        @ExcludeMissing
        fun _assistant(): JsonField<CallAssistantRequest> = assistant

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
         * Returns the raw JSON value of [conversationRelayConfig].
         *
         * Unlike [conversationRelayConfig], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("conversation_relay_config")
        @ExcludeMissing
        fun _conversationRelayConfig(): JsonField<ConversationRelayConfig> = conversationRelayConfig

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
         * Returns the raw JSON value of [deepfakeDetection].
         *
         * Unlike [deepfakeDetection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("deepfake_detection")
        @ExcludeMissing
        fun _deepfakeDetection(): JsonField<DeepfakeDetection> = deepfakeDetection

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

            private var assistant: JsonField<CallAssistantRequest> = JsonMissing.of()
            private var billingGroupId: JsonField<String> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var conversationRelayConfig: JsonField<ConversationRelayConfig> =
                JsonMissing.of()
            private var customHeaders: JsonField<MutableList<CustomSipHeader>>? = null
            private var deepfakeDetection: JsonField<DeepfakeDetection> = JsonMissing.of()
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
                assistant = body.assistant
                billingGroupId = body.billingGroupId
                clientState = body.clientState
                commandId = body.commandId
                conversationRelayConfig = body.conversationRelayConfig
                customHeaders = body.customHeaders.map { it.toMutableList() }
                deepfakeDetection = body.deepfakeDetection
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
             * AI Assistant configuration. All fields except `id` are optional — the assistant's
             * stored configuration will be used as fallback for any omitted fields.
             */
            fun assistant(assistant: CallAssistantRequest) = assistant(JsonField.of(assistant))

            /**
             * Sets [Builder.assistant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assistant] with a well-typed [CallAssistantRequest]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun assistant(assistant: JsonField<CallAssistantRequest>) = apply {
                this.assistant = assistant
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

            /**
             * Starts a Conversation Relay session automatically when the answered/dialed call is
             * answered. This embedded shape is supported on `answer` and `dial`. It uses public
             * field names (`url`, `dtmf_detection`, `greeting`, `voice`, `language`, etc.) and maps
             * them to the underlying Conversation Relay action. `client_state`, `tts_language`, and
             * `transcription_language` inside this object are ignored; use the parent command's
             * `client_state` and `command_id` fields instead.
             */
            fun conversationRelayConfig(conversationRelayConfig: ConversationRelayConfig) =
                conversationRelayConfig(JsonField.of(conversationRelayConfig))

            /**
             * Sets [Builder.conversationRelayConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conversationRelayConfig] with a well-typed
             * [ConversationRelayConfig] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun conversationRelayConfig(
                conversationRelayConfig: JsonField<ConversationRelayConfig>
            ) = apply { this.conversationRelayConfig = conversationRelayConfig }

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
             * Enables deepfake detection on the call. When enabled, audio from the remote party is
             * streamed to a detection service that analyzes whether the voice is AI-generated.
             * Results are delivered via the `call.deepfake_detection.result` webhook.
             */
            fun deepfakeDetection(deepfakeDetection: DeepfakeDetection) =
                deepfakeDetection(JsonField.of(deepfakeDetection))

            /**
             * Sets [Builder.deepfakeDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deepfakeDetection] with a well-typed
             * [DeepfakeDetection] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun deepfakeDetection(deepfakeDetection: JsonField<DeepfakeDetection>) = apply {
                this.deepfakeDetection = deepfakeDetection
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
                    assistant,
                    billingGroupId,
                    clientState,
                    commandId,
                    conversationRelayConfig,
                    (customHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                    deepfakeDetection,
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            assistant().ifPresent { it.validate() }
            billingGroupId()
            clientState()
            commandId()
            conversationRelayConfig().ifPresent { it.validate() }
            customHeaders().ifPresent { it.forEach { it.validate() } }
            deepfakeDetection().ifPresent { it.validate() }
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
            (assistant.asKnown().getOrNull()?.validity() ?: 0) +
                (if (billingGroupId.asKnown().isPresent) 1 else 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (conversationRelayConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (customHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (deepfakeDetection.asKnown().getOrNull()?.validity() ?: 0) +
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
                assistant == other.assistant &&
                billingGroupId == other.billingGroupId &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                conversationRelayConfig == other.conversationRelayConfig &&
                customHeaders == other.customHeaders &&
                deepfakeDetection == other.deepfakeDetection &&
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
                assistant,
                billingGroupId,
                clientState,
                commandId,
                conversationRelayConfig,
                customHeaders,
                deepfakeDetection,
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
            "Body{assistant=$assistant, billingGroupId=$billingGroupId, clientState=$clientState, commandId=$commandId, conversationRelayConfig=$conversationRelayConfig, customHeaders=$customHeaders, deepfakeDetection=$deepfakeDetection, preferredCodecs=$preferredCodecs, record=$record, recordChannels=$recordChannels, recordCustomFileName=$recordCustomFileName, recordFormat=$recordFormat, recordMaxLength=$recordMaxLength, recordTimeoutSecs=$recordTimeoutSecs, recordTrack=$recordTrack, recordTrim=$recordTrim, sendSilenceWhenIdle=$sendSilenceWhenIdle, sipHeaders=$sipHeaders, soundModifications=$soundModifications, streamBidirectionalCodec=$streamBidirectionalCodec, streamBidirectionalMode=$streamBidirectionalMode, streamBidirectionalTargetLegs=$streamBidirectionalTargetLegs, streamCodec=$streamCodec, streamTrack=$streamTrack, streamUrl=$streamUrl, transcription=$transcription, transcriptionConfig=$transcriptionConfig, webhookRetriesPolicies=$webhookRetriesPolicies, webhookUrl=$webhookUrl, webhookUrlMethod=$webhookUrlMethod, webhookUrls=$webhookUrls, webhookUrlsMethod=$webhookUrlsMethod, additionalProperties=$additionalProperties}"
    }

    /**
     * Starts a Conversation Relay session automatically when the answered/dialed call is answered.
     * This embedded shape is supported on `answer` and `dial`. It uses public field names (`url`,
     * `dtmf_detection`, `greeting`, `voice`, `language`, etc.) and maps them to the underlying
     * Conversation Relay action. `client_state`, `tts_language`, and `transcription_language`
     * inside this object are ignored; use the parent command's `client_state` and `command_id`
     * fields instead.
     */
    class ConversationRelayConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val url: JsonField<String>,
        private val customParameters: JsonField<CustomParameters>,
        private val dtmfDetection: JsonField<Boolean>,
        private val greeting: JsonField<String>,
        private val interruptible: JsonField<Interruptible>,
        private val interruptibleGreeting: JsonField<InterruptibleGreeting>,
        private val interruptionSettings: JsonField<InterruptionSettings>,
        private val language: JsonField<String>,
        private val languages: JsonField<List<Language>>,
        private val provider: JsonField<String>,
        private val structuredProvider: JsonField<StructuredProvider>,
        private val transcriptionEngine: JsonField<TranscriptionEngine>,
        private val transcriptionEngineConfig: JsonField<TranscriptionEngineConfig>,
        private val ttsProvider: JsonField<String>,
        private val voice: JsonField<String>,
        private val voiceSettings: JsonField<VoiceSettings>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_parameters")
            @ExcludeMissing
            customParameters: JsonField<CustomParameters> = JsonMissing.of(),
            @JsonProperty("dtmf_detection")
            @ExcludeMissing
            dtmfDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("greeting")
            @ExcludeMissing
            greeting: JsonField<String> = JsonMissing.of(),
            @JsonProperty("interruptible")
            @ExcludeMissing
            interruptible: JsonField<Interruptible> = JsonMissing.of(),
            @JsonProperty("interruptible_greeting")
            @ExcludeMissing
            interruptibleGreeting: JsonField<InterruptibleGreeting> = JsonMissing.of(),
            @JsonProperty("interruption_settings")
            @ExcludeMissing
            interruptionSettings: JsonField<InterruptionSettings> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("languages")
            @ExcludeMissing
            languages: JsonField<List<Language>> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("structured_provider")
            @ExcludeMissing
            structuredProvider: JsonField<StructuredProvider> = JsonMissing.of(),
            @JsonProperty("transcription_engine")
            @ExcludeMissing
            transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
            @JsonProperty("transcription_engine_config")
            @ExcludeMissing
            transcriptionEngineConfig: JsonField<TranscriptionEngineConfig> = JsonMissing.of(),
            @JsonProperty("tts_provider")
            @ExcludeMissing
            ttsProvider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice_settings")
            @ExcludeMissing
            voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
        ) : this(
            url,
            customParameters,
            dtmfDetection,
            greeting,
            interruptible,
            interruptibleGreeting,
            interruptionSettings,
            language,
            languages,
            provider,
            structuredProvider,
            transcriptionEngine,
            transcriptionEngineConfig,
            ttsProvider,
            voice,
            voiceSettings,
            mutableMapOf(),
        )

        /**
         * WebSocket URL for your Conversation Relay server. Must start with `ws://` or `wss://`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Custom key-value parameters forwarded to the relay session as assistant dynamic
         * variables.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customParameters(): Optional<CustomParameters> =
            customParameters.getOptional("custom_parameters")

        /**
         * Enable DTMF detection for the relay session.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtmfDetection(): Optional<Boolean> = dtmfDetection.getOptional("dtmf_detection")

        /**
         * Text played when the relay session starts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun greeting(): Optional<String> = greeting.getOptional("greeting")

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interruptible(): Optional<Interruptible> = interruptible.getOptional("interruptible")

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interruptibleGreeting(): Optional<InterruptibleGreeting> =
            interruptibleGreeting.getOptional("interruptible_greeting")

        /**
         * Settings for handling caller interruptions during Conversation Relay speech.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interruptionSettings(): Optional<InterruptionSettings> =
            interruptionSettings.getOptional("interruption_settings")

        /**
         * Default language for both text-to-speech and speech recognition.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * Per-language TTS and transcription settings.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun languages(): Optional<List<Language>> = languages.getOptional("languages")

        /**
         * Structured voice provider. Must be supplied together with `structured_provider`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provider(): Optional<String> = provider.getOptional("provider")

        /**
         * Provider-specific structured voice settings. Must be supplied together with `provider`;
         * Telnyx sends the value as the nested provider configuration for Conversation Relay.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun structuredProvider(): Optional<StructuredProvider> =
            structuredProvider.getOptional("structured_provider")

        /**
         * Engine to use for speech recognition. Legacy values `A` - `Google`, `B` - `Telnyx` are
         * supported for backward compatibility. For Conversation Relay, use this field with
         * `transcription_engine_config`; the `transcription` object is not supported.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcriptionEngine(): Optional<TranscriptionEngine> =
            transcriptionEngine.getOptional("transcription_engine")

        /**
         * Engine-specific transcription settings for Conversation Relay. This accepts the same
         * provider-specific options used by the Call Transcription Start command, such as
         * `transcription_model`, without requiring the engine discriminator to be repeated inside
         * this object.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcriptionEngineConfig(): Optional<TranscriptionEngineConfig> =
            transcriptionEngineConfig.getOptional("transcription_engine_config")

        /**
         * Text-to-speech provider. If omitted, Telnyx derives it from `voice` or `provider`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ttsProvider(): Optional<String> = ttsProvider.getOptional("tts_provider")

        /**
         * The voice to be used by the voice assistant. Currently we support ElevenLabs, Telnyx and
         * AWS voices.
         *
         *     **Supported Providers:**
         * - **AWS:** Use `AWS.Polly.<VoiceId>` (e.g., `AWS.Polly.Joanna`). For neural voices, which
         *   provide more realistic, human-like speech, append `-Neural` to the `VoiceId` (e.g.,
         *   `AWS.Polly.Joanna-Neural`). Check the
         *   [available voices](https://docs.aws.amazon.com/polly/latest/dg/available-voices.html)
         *   for compatibility.
         * - **Azure:** Use `Azure.<VoiceId>. (e.g. Azure.en-CA-ClaraNeural, Azure.en-CA-LiamNeural,
         *   Azure.en-US-BrianMultilingualNeural, Azure.en-US-Ava:DragonHDLatestNeural. For a
         *   complete list of voices, go to
         *   [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery).)
         * - **ElevenLabs:** Use `ElevenLabs.<ModelId>.<VoiceId>` (e.g.,
         *   `ElevenLabs.BaseModel.John`). The `ModelId` part is optional. To use ElevenLabs, you
         *   must provide your ElevenLabs API key as an integration secret under `"voice_settings":
         *   {"api_key_ref": "<secret_id>"}`. See
         *   [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         *   for details. Check
         *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
         *     - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`
         * - **Inworld:** Use `Inworld.<ModelId>.<VoiceId>` (e.g., `Inworld.Mini.Loretta`,
         *   `Inworld.Max.Oliver`). Supported models: `Mini`, `Max`.
         * - **xAI:** Use `xAI.<VoiceId>` (e.g., `xAI.eve`). Available voices: `eve`, `ara`, `rex`,
         *   `sal`, `leo`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voice(): Optional<String> = voice.getOptional("voice")

        /**
         * The settings associated with the voice selected
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceSettings(): Optional<VoiceSettings> = voiceSettings.getOptional("voice_settings")

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [customParameters].
         *
         * Unlike [customParameters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_parameters")
        @ExcludeMissing
        fun _customParameters(): JsonField<CustomParameters> = customParameters

        /**
         * Returns the raw JSON value of [dtmfDetection].
         *
         * Unlike [dtmfDetection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dtmf_detection")
        @ExcludeMissing
        fun _dtmfDetection(): JsonField<Boolean> = dtmfDetection

        /**
         * Returns the raw JSON value of [greeting].
         *
         * Unlike [greeting], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("greeting") @ExcludeMissing fun _greeting(): JsonField<String> = greeting

        /**
         * Returns the raw JSON value of [interruptible].
         *
         * Unlike [interruptible], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interruptible")
        @ExcludeMissing
        fun _interruptible(): JsonField<Interruptible> = interruptible

        /**
         * Returns the raw JSON value of [interruptibleGreeting].
         *
         * Unlike [interruptibleGreeting], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("interruptible_greeting")
        @ExcludeMissing
        fun _interruptibleGreeting(): JsonField<InterruptibleGreeting> = interruptibleGreeting

        /**
         * Returns the raw JSON value of [interruptionSettings].
         *
         * Unlike [interruptionSettings], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("interruption_settings")
        @ExcludeMissing
        fun _interruptionSettings(): JsonField<InterruptionSettings> = interruptionSettings

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [languages].
         *
         * Unlike [languages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("languages")
        @ExcludeMissing
        fun _languages(): JsonField<List<Language>> = languages

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

        /**
         * Returns the raw JSON value of [structuredProvider].
         *
         * Unlike [structuredProvider], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("structured_provider")
        @ExcludeMissing
        fun _structuredProvider(): JsonField<StructuredProvider> = structuredProvider

        /**
         * Returns the raw JSON value of [transcriptionEngine].
         *
         * Unlike [transcriptionEngine], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transcription_engine")
        @ExcludeMissing
        fun _transcriptionEngine(): JsonField<TranscriptionEngine> = transcriptionEngine

        /**
         * Returns the raw JSON value of [transcriptionEngineConfig].
         *
         * Unlike [transcriptionEngineConfig], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transcription_engine_config")
        @ExcludeMissing
        fun _transcriptionEngineConfig(): JsonField<TranscriptionEngineConfig> =
            transcriptionEngineConfig

        /**
         * Returns the raw JSON value of [ttsProvider].
         *
         * Unlike [ttsProvider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tts_provider")
        @ExcludeMissing
        fun _ttsProvider(): JsonField<String> = ttsProvider

        /**
         * Returns the raw JSON value of [voice].
         *
         * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<String> = voice

        /**
         * Returns the raw JSON value of [voiceSettings].
         *
         * Unlike [voiceSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("voice_settings")
        @ExcludeMissing
        fun _voiceSettings(): JsonField<VoiceSettings> = voiceSettings

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
             * Returns a mutable builder for constructing an instance of [ConversationRelayConfig].
             *
             * The following fields are required:
             * ```java
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConversationRelayConfig]. */
        class Builder internal constructor() {

            private var url: JsonField<String>? = null
            private var customParameters: JsonField<CustomParameters> = JsonMissing.of()
            private var dtmfDetection: JsonField<Boolean> = JsonMissing.of()
            private var greeting: JsonField<String> = JsonMissing.of()
            private var interruptible: JsonField<Interruptible> = JsonMissing.of()
            private var interruptibleGreeting: JsonField<InterruptibleGreeting> = JsonMissing.of()
            private var interruptionSettings: JsonField<InterruptionSettings> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var languages: JsonField<MutableList<Language>>? = null
            private var provider: JsonField<String> = JsonMissing.of()
            private var structuredProvider: JsonField<StructuredProvider> = JsonMissing.of()
            private var transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of()
            private var transcriptionEngineConfig: JsonField<TranscriptionEngineConfig> =
                JsonMissing.of()
            private var ttsProvider: JsonField<String> = JsonMissing.of()
            private var voice: JsonField<String> = JsonMissing.of()
            private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(conversationRelayConfig: ConversationRelayConfig) = apply {
                url = conversationRelayConfig.url
                customParameters = conversationRelayConfig.customParameters
                dtmfDetection = conversationRelayConfig.dtmfDetection
                greeting = conversationRelayConfig.greeting
                interruptible = conversationRelayConfig.interruptible
                interruptibleGreeting = conversationRelayConfig.interruptibleGreeting
                interruptionSettings = conversationRelayConfig.interruptionSettings
                language = conversationRelayConfig.language
                languages = conversationRelayConfig.languages.map { it.toMutableList() }
                provider = conversationRelayConfig.provider
                structuredProvider = conversationRelayConfig.structuredProvider
                transcriptionEngine = conversationRelayConfig.transcriptionEngine
                transcriptionEngineConfig = conversationRelayConfig.transcriptionEngineConfig
                ttsProvider = conversationRelayConfig.ttsProvider
                voice = conversationRelayConfig.voice
                voiceSettings = conversationRelayConfig.voiceSettings
                additionalProperties = conversationRelayConfig.additionalProperties.toMutableMap()
            }

            /**
             * WebSocket URL for your Conversation Relay server. Must start with `ws://` or
             * `wss://`.
             */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /**
             * Custom key-value parameters forwarded to the relay session as assistant dynamic
             * variables.
             */
            fun customParameters(customParameters: CustomParameters) =
                customParameters(JsonField.of(customParameters))

            /**
             * Sets [Builder.customParameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customParameters] with a well-typed
             * [CustomParameters] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun customParameters(customParameters: JsonField<CustomParameters>) = apply {
                this.customParameters = customParameters
            }

            /** Enable DTMF detection for the relay session. */
            fun dtmfDetection(dtmfDetection: Boolean) = dtmfDetection(JsonField.of(dtmfDetection))

            /**
             * Sets [Builder.dtmfDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dtmfDetection] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dtmfDetection(dtmfDetection: JsonField<Boolean>) = apply {
                this.dtmfDetection = dtmfDetection
            }

            /** Text played when the relay session starts. */
            fun greeting(greeting: String) = greeting(JsonField.of(greeting))

            /**
             * Sets [Builder.greeting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.greeting] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun greeting(greeting: JsonField<String>) = apply { this.greeting = greeting }

            /**
             * Controls when caller input can interrupt assistant speech. `any` allows speech or
             * DTMF interruptions; `none` disables interruptions; `speech` allows speech only;
             * `dtmf` allows DTMF only.
             */
            fun interruptible(interruptible: Interruptible) =
                interruptible(JsonField.of(interruptible))

            /**
             * Sets [Builder.interruptible] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interruptible] with a well-typed [Interruptible]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun interruptible(interruptible: JsonField<Interruptible>) = apply {
                this.interruptible = interruptible
            }

            /**
             * Controls when caller input can interrupt assistant speech. `any` allows speech or
             * DTMF interruptions; `none` disables interruptions; `speech` allows speech only;
             * `dtmf` allows DTMF only.
             */
            fun interruptibleGreeting(interruptibleGreeting: InterruptibleGreeting) =
                interruptibleGreeting(JsonField.of(interruptibleGreeting))

            /**
             * Sets [Builder.interruptibleGreeting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interruptibleGreeting] with a well-typed
             * [InterruptibleGreeting] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun interruptibleGreeting(interruptibleGreeting: JsonField<InterruptibleGreeting>) =
                apply {
                    this.interruptibleGreeting = interruptibleGreeting
                }

            /** Settings for handling caller interruptions during Conversation Relay speech. */
            fun interruptionSettings(interruptionSettings: InterruptionSettings) =
                interruptionSettings(JsonField.of(interruptionSettings))

            /**
             * Sets [Builder.interruptionSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interruptionSettings] with a well-typed
             * [InterruptionSettings] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun interruptionSettings(interruptionSettings: JsonField<InterruptionSettings>) =
                apply {
                    this.interruptionSettings = interruptionSettings
                }

            /** Default language for both text-to-speech and speech recognition. */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /** Per-language TTS and transcription settings. */
            fun languages(languages: List<Language>) = languages(JsonField.of(languages))

            /**
             * Sets [Builder.languages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.languages] with a well-typed `List<Language>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun languages(languages: JsonField<List<Language>>) = apply {
                this.languages = languages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Language] to [languages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLanguage(language: Language) = apply {
                languages =
                    (languages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("languages", it).add(language)
                    }
            }

            /** Structured voice provider. Must be supplied together with `structured_provider`. */
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

            /**
             * Provider-specific structured voice settings. Must be supplied together with
             * `provider`; Telnyx sends the value as the nested provider configuration for
             * Conversation Relay.
             */
            fun structuredProvider(structuredProvider: StructuredProvider) =
                structuredProvider(JsonField.of(structuredProvider))

            /**
             * Sets [Builder.structuredProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.structuredProvider] with a well-typed
             * [StructuredProvider] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun structuredProvider(structuredProvider: JsonField<StructuredProvider>) = apply {
                this.structuredProvider = structuredProvider
            }

            /**
             * Engine to use for speech recognition. Legacy values `A` - `Google`, `B` - `Telnyx`
             * are supported for backward compatibility. For Conversation Relay, use this field with
             * `transcription_engine_config`; the `transcription` object is not supported.
             */
            fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) =
                transcriptionEngine(JsonField.of(transcriptionEngine))

            /**
             * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionEngine] with a well-typed
             * [TranscriptionEngine] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) = apply {
                this.transcriptionEngine = transcriptionEngine
            }

            /**
             * Engine-specific transcription settings for Conversation Relay. This accepts the same
             * provider-specific options used by the Call Transcription Start command, such as
             * `transcription_model`, without requiring the engine discriminator to be repeated
             * inside this object.
             */
            fun transcriptionEngineConfig(transcriptionEngineConfig: TranscriptionEngineConfig) =
                transcriptionEngineConfig(JsonField.of(transcriptionEngineConfig))

            /**
             * Sets [Builder.transcriptionEngineConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionEngineConfig] with a well-typed
             * [TranscriptionEngineConfig] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun transcriptionEngineConfig(
                transcriptionEngineConfig: JsonField<TranscriptionEngineConfig>
            ) = apply { this.transcriptionEngineConfig = transcriptionEngineConfig }

            /**
             * Text-to-speech provider. If omitted, Telnyx derives it from `voice` or `provider`.
             */
            fun ttsProvider(ttsProvider: String) = ttsProvider(JsonField.of(ttsProvider))

            /**
             * Sets [Builder.ttsProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ttsProvider] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ttsProvider(ttsProvider: JsonField<String>) = apply {
                this.ttsProvider = ttsProvider
            }

            /**
             * The voice to be used by the voice assistant. Currently we support ElevenLabs, Telnyx
             * and AWS voices.
             *
             *     **Supported Providers:**
             * - **AWS:** Use `AWS.Polly.<VoiceId>` (e.g., `AWS.Polly.Joanna`). For neural voices,
             *   which provide more realistic, human-like speech, append `-Neural` to the `VoiceId`
             *   (e.g., `AWS.Polly.Joanna-Neural`). Check the
             *   [available voices](https://docs.aws.amazon.com/polly/latest/dg/available-voices.html)
             *   for compatibility.
             * - **Azure:** Use `Azure.<VoiceId>. (e.g. Azure.en-CA-ClaraNeural,
             *   Azure.en-CA-LiamNeural, Azure.en-US-BrianMultilingualNeural,
             *   Azure.en-US-Ava:DragonHDLatestNeural. For a complete list of voices, go to
             *   [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery).)
             * - **ElevenLabs:** Use `ElevenLabs.<ModelId>.<VoiceId>` (e.g.,
             *   `ElevenLabs.BaseModel.John`). The `ModelId` part is optional. To use ElevenLabs,
             *   you must provide your ElevenLabs API key as an integration secret under
             *   `"voice_settings": {"api_key_ref": "<secret_id>"}`. See
             *   [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
             *   for details. Check
             *   [available voices](https://elevenlabs.io/docs/api-reference/get-voices).
             *     - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`
             * - **Inworld:** Use `Inworld.<ModelId>.<VoiceId>` (e.g., `Inworld.Mini.Loretta`,
             *   `Inworld.Max.Oliver`). Supported models: `Mini`, `Max`.
             * - **xAI:** Use `xAI.<VoiceId>` (e.g., `xAI.eve`). Available voices: `eve`, `ara`,
             *   `rex`, `sal`, `leo`.
             */
            fun voice(voice: String) = voice(JsonField.of(voice))

            /**
             * Sets [Builder.voice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voice] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voice(voice: JsonField<String>) = apply { this.voice = voice }

            /** The settings associated with the voice selected */
            fun voiceSettings(voiceSettings: VoiceSettings) =
                voiceSettings(JsonField.of(voiceSettings))

            /**
             * Sets [Builder.voiceSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceSettings] with a well-typed [VoiceSettings]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun voiceSettings(voiceSettings: JsonField<VoiceSettings>) = apply {
                this.voiceSettings = voiceSettings
            }

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofElevenlabs(elevenlabs)`. */
            fun voiceSettings(elevenlabs: ElevenLabsVoiceSettings) =
                voiceSettings(VoiceSettings.ofElevenlabs(elevenlabs))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofTelnyx(telnyx)`. */
            fun voiceSettings(telnyx: TelnyxVoiceSettings) =
                voiceSettings(VoiceSettings.ofTelnyx(telnyx))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofAws(aws)`. */
            fun voiceSettings(aws: AwsVoiceSettings) = voiceSettings(VoiceSettings.ofAws(aws))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofMinimax(minimax)`. */
            fun voiceSettings(minimax: MinimaxVoiceSettings) =
                voiceSettings(VoiceSettings.ofMinimax(minimax))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofAzure(azure)`. */
            fun voiceSettings(azure: AzureVoiceSettings) =
                voiceSettings(VoiceSettings.ofAzure(azure))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofRime(rime)`. */
            fun voiceSettings(rime: RimeVoiceSettings) = voiceSettings(VoiceSettings.ofRime(rime))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofResemble(resemble)`. */
            fun voiceSettings(resemble: ResembleVoiceSettings) =
                voiceSettings(VoiceSettings.ofResemble(resemble))

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofInworld()`. */
            fun voiceSettingsInworld() = voiceSettings(VoiceSettings.ofInworld())

            /** Alias for calling [voiceSettings] with `VoiceSettings.ofXai(xai)`. */
            fun voiceSettings(xai: XaiVoiceSettings) = voiceSettings(VoiceSettings.ofXai(xai))

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
             * Returns an immutable instance of [ConversationRelayConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ConversationRelayConfig =
                ConversationRelayConfig(
                    checkRequired("url", url),
                    customParameters,
                    dtmfDetection,
                    greeting,
                    interruptible,
                    interruptibleGreeting,
                    interruptionSettings,
                    language,
                    (languages ?: JsonMissing.of()).map { it.toImmutable() },
                    provider,
                    structuredProvider,
                    transcriptionEngine,
                    transcriptionEngineConfig,
                    ttsProvider,
                    voice,
                    voiceSettings,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ConversationRelayConfig = apply {
            if (validated) {
                return@apply
            }

            url()
            customParameters().ifPresent { it.validate() }
            dtmfDetection()
            greeting()
            interruptible().ifPresent { it.validate() }
            interruptibleGreeting().ifPresent { it.validate() }
            interruptionSettings().ifPresent { it.validate() }
            language()
            languages().ifPresent { it.forEach { it.validate() } }
            provider()
            structuredProvider().ifPresent { it.validate() }
            transcriptionEngine().ifPresent { it.validate() }
            transcriptionEngineConfig().ifPresent { it.validate() }
            ttsProvider()
            voice()
            voiceSettings().ifPresent { it.validate() }
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
            (if (url.asKnown().isPresent) 1 else 0) +
                (customParameters.asKnown().getOrNull()?.validity() ?: 0) +
                (if (dtmfDetection.asKnown().isPresent) 1 else 0) +
                (if (greeting.asKnown().isPresent) 1 else 0) +
                (interruptible.asKnown().getOrNull()?.validity() ?: 0) +
                (interruptibleGreeting.asKnown().getOrNull()?.validity() ?: 0) +
                (interruptionSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (languages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (provider.asKnown().isPresent) 1 else 0) +
                (structuredProvider.asKnown().getOrNull()?.validity() ?: 0) +
                (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                (transcriptionEngineConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (ttsProvider.asKnown().isPresent) 1 else 0) +
                (if (voice.asKnown().isPresent) 1 else 0) +
                (voiceSettings.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Custom key-value parameters forwarded to the relay session as assistant dynamic
         * variables.
         */
        class CustomParameters
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

                /** Returns a mutable builder for constructing an instance of [CustomParameters]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomParameters]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customParameters: CustomParameters) = apply {
                    additionalProperties = customParameters.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CustomParameters].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomParameters = CustomParameters(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): CustomParameters = apply {
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

                return other is CustomParameters &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomParameters{additionalProperties=$additionalProperties}"
        }

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         */
        class Interruptible @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val NONE = of("none")

                @JvmField val ANY = of("any")

                @JvmField val SPEECH = of("speech")

                @JvmField val DTMF = of("dtmf")

                @JvmStatic fun of(value: String) = Interruptible(JsonField.of(value))
            }

            /** An enum containing [Interruptible]'s known values. */
            enum class Known {
                NONE,
                ANY,
                SPEECH,
                DTMF,
            }

            /**
             * An enum containing [Interruptible]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Interruptible] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NONE,
                ANY,
                SPEECH,
                DTMF,
                /**
                 * An enum member indicating that [Interruptible] was instantiated with an unknown
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
                    NONE -> Value.NONE
                    ANY -> Value.ANY
                    SPEECH -> Value.SPEECH
                    DTMF -> Value.DTMF
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
                    NONE -> Known.NONE
                    ANY -> Known.ANY
                    SPEECH -> Known.SPEECH
                    DTMF -> Known.DTMF
                    else -> throw TelnyxInvalidDataException("Unknown Interruptible: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Interruptible = apply {
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

                return other is Interruptible && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
         * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows
         * DTMF only.
         */
        class InterruptibleGreeting
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

                @JvmField val NONE = of("none")

                @JvmField val ANY = of("any")

                @JvmField val SPEECH = of("speech")

                @JvmField val DTMF = of("dtmf")

                @JvmStatic fun of(value: String) = InterruptibleGreeting(JsonField.of(value))
            }

            /** An enum containing [InterruptibleGreeting]'s known values. */
            enum class Known {
                NONE,
                ANY,
                SPEECH,
                DTMF,
            }

            /**
             * An enum containing [InterruptibleGreeting]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [InterruptibleGreeting] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NONE,
                ANY,
                SPEECH,
                DTMF,
                /**
                 * An enum member indicating that [InterruptibleGreeting] was instantiated with an
                 * unknown value.
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
                    NONE -> Value.NONE
                    ANY -> Value.ANY
                    SPEECH -> Value.SPEECH
                    DTMF -> Value.DTMF
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
                    NONE -> Known.NONE
                    ANY -> Known.ANY
                    SPEECH -> Known.SPEECH
                    DTMF -> Known.DTMF
                    else ->
                        throw TelnyxInvalidDataException("Unknown InterruptibleGreeting: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): InterruptibleGreeting = apply {
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

                return other is InterruptibleGreeting && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Settings for handling caller interruptions during Conversation Relay speech. */
        class InterruptionSettings
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val enable: JsonField<Boolean>,
            private val interruptible: JsonField<Interruptible>,
            private val interruptibleGreeting: JsonField<InterruptibleGreeting>,
            private val welcomeGreetingInterruptible: JsonField<WelcomeGreetingInterruptible>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("enable")
                @ExcludeMissing
                enable: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("interruptible")
                @ExcludeMissing
                interruptible: JsonField<Interruptible> = JsonMissing.of(),
                @JsonProperty("interruptible_greeting")
                @ExcludeMissing
                interruptibleGreeting: JsonField<InterruptibleGreeting> = JsonMissing.of(),
                @JsonProperty("welcome_greeting_interruptible")
                @ExcludeMissing
                welcomeGreetingInterruptible: JsonField<WelcomeGreetingInterruptible> =
                    JsonMissing.of(),
            ) : this(
                enable,
                interruptible,
                interruptibleGreeting,
                welcomeGreetingInterruptible,
                mutableMapOf(),
            )

            /**
             * Legacy boolean form. `true` is equivalent to `interruptible=any`; `false` is
             * equivalent to `interruptible=none`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun enable(): Optional<Boolean> = enable.getOptional("enable")

            /**
             * Controls when caller input can interrupt assistant speech. `any` allows speech or
             * DTMF interruptions; `none` disables interruptions; `speech` allows speech only;
             * `dtmf` allows DTMF only.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun interruptible(): Optional<Interruptible> =
                interruptible.getOptional("interruptible")

            /**
             * Controls when caller input can interrupt assistant speech. `any` allows speech or
             * DTMF interruptions; `none` disables interruptions; `speech` allows speech only;
             * `dtmf` allows DTMF only.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun interruptibleGreeting(): Optional<InterruptibleGreeting> =
                interruptibleGreeting.getOptional("interruptible_greeting")

            /**
             * Controls when caller input can interrupt assistant speech. `any` allows speech or
             * DTMF interruptions; `none` disables interruptions; `speech` allows speech only;
             * `dtmf` allows DTMF only.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun welcomeGreetingInterruptible(): Optional<WelcomeGreetingInterruptible> =
                welcomeGreetingInterruptible.getOptional("welcome_greeting_interruptible")

            /**
             * Returns the raw JSON value of [enable].
             *
             * Unlike [enable], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("enable") @ExcludeMissing fun _enable(): JsonField<Boolean> = enable

            /**
             * Returns the raw JSON value of [interruptible].
             *
             * Unlike [interruptible], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("interruptible")
            @ExcludeMissing
            fun _interruptible(): JsonField<Interruptible> = interruptible

            /**
             * Returns the raw JSON value of [interruptibleGreeting].
             *
             * Unlike [interruptibleGreeting], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("interruptible_greeting")
            @ExcludeMissing
            fun _interruptibleGreeting(): JsonField<InterruptibleGreeting> = interruptibleGreeting

            /**
             * Returns the raw JSON value of [welcomeGreetingInterruptible].
             *
             * Unlike [welcomeGreetingInterruptible], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("welcome_greeting_interruptible")
            @ExcludeMissing
            fun _welcomeGreetingInterruptible(): JsonField<WelcomeGreetingInterruptible> =
                welcomeGreetingInterruptible

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
                 * Returns a mutable builder for constructing an instance of [InterruptionSettings].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InterruptionSettings]. */
            class Builder internal constructor() {

                private var enable: JsonField<Boolean> = JsonMissing.of()
                private var interruptible: JsonField<Interruptible> = JsonMissing.of()
                private var interruptibleGreeting: JsonField<InterruptibleGreeting> =
                    JsonMissing.of()
                private var welcomeGreetingInterruptible: JsonField<WelcomeGreetingInterruptible> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(interruptionSettings: InterruptionSettings) = apply {
                    enable = interruptionSettings.enable
                    interruptible = interruptionSettings.interruptible
                    interruptibleGreeting = interruptionSettings.interruptibleGreeting
                    welcomeGreetingInterruptible = interruptionSettings.welcomeGreetingInterruptible
                    additionalProperties = interruptionSettings.additionalProperties.toMutableMap()
                }

                /**
                 * Legacy boolean form. `true` is equivalent to `interruptible=any`; `false` is
                 * equivalent to `interruptible=none`.
                 */
                fun enable(enable: Boolean) = enable(JsonField.of(enable))

                /**
                 * Sets [Builder.enable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enable] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun enable(enable: JsonField<Boolean>) = apply { this.enable = enable }

                /**
                 * Controls when caller input can interrupt assistant speech. `any` allows speech or
                 * DTMF interruptions; `none` disables interruptions; `speech` allows speech only;
                 * `dtmf` allows DTMF only.
                 */
                fun interruptible(interruptible: Interruptible) =
                    interruptible(JsonField.of(interruptible))

                /**
                 * Sets [Builder.interruptible] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.interruptible] with a well-typed [Interruptible]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun interruptible(interruptible: JsonField<Interruptible>) = apply {
                    this.interruptible = interruptible
                }

                /**
                 * Controls when caller input can interrupt assistant speech. `any` allows speech or
                 * DTMF interruptions; `none` disables interruptions; `speech` allows speech only;
                 * `dtmf` allows DTMF only.
                 */
                fun interruptibleGreeting(interruptibleGreeting: InterruptibleGreeting) =
                    interruptibleGreeting(JsonField.of(interruptibleGreeting))

                /**
                 * Sets [Builder.interruptibleGreeting] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.interruptibleGreeting] with a well-typed
                 * [InterruptibleGreeting] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun interruptibleGreeting(interruptibleGreeting: JsonField<InterruptibleGreeting>) =
                    apply {
                        this.interruptibleGreeting = interruptibleGreeting
                    }

                /**
                 * Controls when caller input can interrupt assistant speech. `any` allows speech or
                 * DTMF interruptions; `none` disables interruptions; `speech` allows speech only;
                 * `dtmf` allows DTMF only.
                 */
                fun welcomeGreetingInterruptible(
                    welcomeGreetingInterruptible: WelcomeGreetingInterruptible
                ) = welcomeGreetingInterruptible(JsonField.of(welcomeGreetingInterruptible))

                /**
                 * Sets [Builder.welcomeGreetingInterruptible] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.welcomeGreetingInterruptible] with a well-typed
                 * [WelcomeGreetingInterruptible] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun welcomeGreetingInterruptible(
                    welcomeGreetingInterruptible: JsonField<WelcomeGreetingInterruptible>
                ) = apply { this.welcomeGreetingInterruptible = welcomeGreetingInterruptible }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [InterruptionSettings].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): InterruptionSettings =
                    InterruptionSettings(
                        enable,
                        interruptible,
                        interruptibleGreeting,
                        welcomeGreetingInterruptible,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): InterruptionSettings = apply {
                if (validated) {
                    return@apply
                }

                enable()
                interruptible().ifPresent { it.validate() }
                interruptibleGreeting().ifPresent { it.validate() }
                welcomeGreetingInterruptible().ifPresent { it.validate() }
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
                (if (enable.asKnown().isPresent) 1 else 0) +
                    (interruptible.asKnown().getOrNull()?.validity() ?: 0) +
                    (interruptibleGreeting.asKnown().getOrNull()?.validity() ?: 0) +
                    (welcomeGreetingInterruptible.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Controls when caller input can interrupt assistant speech. `any` allows speech or
             * DTMF interruptions; `none` disables interruptions; `speech` allows speech only;
             * `dtmf` allows DTMF only.
             */
            class Interruptible
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val NONE = of("none")

                    @JvmField val ANY = of("any")

                    @JvmField val SPEECH = of("speech")

                    @JvmField val DTMF = of("dtmf")

                    @JvmStatic fun of(value: String) = Interruptible(JsonField.of(value))
                }

                /** An enum containing [Interruptible]'s known values. */
                enum class Known {
                    NONE,
                    ANY,
                    SPEECH,
                    DTMF,
                }

                /**
                 * An enum containing [Interruptible]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [Interruptible] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NONE,
                    ANY,
                    SPEECH,
                    DTMF,
                    /**
                     * An enum member indicating that [Interruptible] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        NONE -> Value.NONE
                        ANY -> Value.ANY
                        SPEECH -> Value.SPEECH
                        DTMF -> Value.DTMF
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        NONE -> Known.NONE
                        ANY -> Known.ANY
                        SPEECH -> Known.SPEECH
                        DTMF -> Known.DTMF
                        else -> throw TelnyxInvalidDataException("Unknown Interruptible: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Interruptible = apply {
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

                    return other is Interruptible && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Controls when caller input can interrupt assistant speech. `any` allows speech or
             * DTMF interruptions; `none` disables interruptions; `speech` allows speech only;
             * `dtmf` allows DTMF only.
             */
            class InterruptibleGreeting
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val NONE = of("none")

                    @JvmField val ANY = of("any")

                    @JvmField val SPEECH = of("speech")

                    @JvmField val DTMF = of("dtmf")

                    @JvmStatic fun of(value: String) = InterruptibleGreeting(JsonField.of(value))
                }

                /** An enum containing [InterruptibleGreeting]'s known values. */
                enum class Known {
                    NONE,
                    ANY,
                    SPEECH,
                    DTMF,
                }

                /**
                 * An enum containing [InterruptibleGreeting]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [InterruptibleGreeting] can contain an unknown value in a couple
                 * of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NONE,
                    ANY,
                    SPEECH,
                    DTMF,
                    /**
                     * An enum member indicating that [InterruptibleGreeting] was instantiated with
                     * an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        NONE -> Value.NONE
                        ANY -> Value.ANY
                        SPEECH -> Value.SPEECH
                        DTMF -> Value.DTMF
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        NONE -> Known.NONE
                        ANY -> Known.ANY
                        SPEECH -> Known.SPEECH
                        DTMF -> Known.DTMF
                        else ->
                            throw TelnyxInvalidDataException(
                                "Unknown InterruptibleGreeting: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): InterruptibleGreeting = apply {
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

                    return other is InterruptibleGreeting && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Controls when caller input can interrupt assistant speech. `any` allows speech or
             * DTMF interruptions; `none` disables interruptions; `speech` allows speech only;
             * `dtmf` allows DTMF only.
             */
            class WelcomeGreetingInterruptible
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val NONE = of("none")

                    @JvmField val ANY = of("any")

                    @JvmField val SPEECH = of("speech")

                    @JvmField val DTMF = of("dtmf")

                    @JvmStatic
                    fun of(value: String) = WelcomeGreetingInterruptible(JsonField.of(value))
                }

                /** An enum containing [WelcomeGreetingInterruptible]'s known values. */
                enum class Known {
                    NONE,
                    ANY,
                    SPEECH,
                    DTMF,
                }

                /**
                 * An enum containing [WelcomeGreetingInterruptible]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [WelcomeGreetingInterruptible] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NONE,
                    ANY,
                    SPEECH,
                    DTMF,
                    /**
                     * An enum member indicating that [WelcomeGreetingInterruptible] was
                     * instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        NONE -> Value.NONE
                        ANY -> Value.ANY
                        SPEECH -> Value.SPEECH
                        DTMF -> Value.DTMF
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        NONE -> Known.NONE
                        ANY -> Known.ANY
                        SPEECH -> Known.SPEECH
                        DTMF -> Known.DTMF
                        else ->
                            throw TelnyxInvalidDataException(
                                "Unknown WelcomeGreetingInterruptible: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): WelcomeGreetingInterruptible = apply {
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

                    return other is WelcomeGreetingInterruptible && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InterruptionSettings &&
                    enable == other.enable &&
                    interruptible == other.interruptible &&
                    interruptibleGreeting == other.interruptibleGreeting &&
                    welcomeGreetingInterruptible == other.welcomeGreetingInterruptible &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    enable,
                    interruptible,
                    interruptibleGreeting,
                    welcomeGreetingInterruptible,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InterruptionSettings{enable=$enable, interruptible=$interruptible, interruptibleGreeting=$interruptibleGreeting, welcomeGreetingInterruptible=$welcomeGreetingInterruptible, additionalProperties=$additionalProperties}"
        }

        /** Language-specific TTS and transcription settings for Conversation Relay. */
        class Language
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val language: JsonField<String>,
            private val speechModel: JsonField<String>,
            private val transcriptionEngine: JsonField<TranscriptionEngine>,
            private val transcriptionEngineConfig: JsonField<TranscriptionEngineConfig>,
            private val transcriptionProvider: JsonField<String>,
            private val ttsProvider: JsonField<String>,
            private val voice: JsonField<String>,
            private val voiceSettings: JsonField<VoiceSettings>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("language")
                @ExcludeMissing
                language: JsonField<String> = JsonMissing.of(),
                @JsonProperty("speech_model")
                @ExcludeMissing
                speechModel: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transcription_engine")
                @ExcludeMissing
                transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
                @JsonProperty("transcription_engine_config")
                @ExcludeMissing
                transcriptionEngineConfig: JsonField<TranscriptionEngineConfig> = JsonMissing.of(),
                @JsonProperty("transcription_provider")
                @ExcludeMissing
                transcriptionProvider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tts_provider")
                @ExcludeMissing
                ttsProvider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
                @JsonProperty("voice_settings")
                @ExcludeMissing
                voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
            ) : this(
                language,
                speechModel,
                transcriptionEngine,
                transcriptionEngineConfig,
                transcriptionProvider,
                ttsProvider,
                voice,
                voiceSettings,
                mutableMapOf(),
            )

            /**
             * BCP 47 language tag for this language configuration.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun language(): String = language.getRequired("language")

            /**
             * Conversation Relay speech model. Prefer
             * `transcription_engine_config.transcription_model` when configuring speech-to-text.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun speechModel(): Optional<String> = speechModel.getOptional("speech_model")

            /**
             * Engine to use for speech recognition. Legacy values `A` - `Google`, `B` - `Telnyx`
             * are supported for backward compatibility. When provided in a Conversation Relay
             * language entry, Telnyx derives `transcription_provider` and `speech_model` for that
             * language.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transcriptionEngine(): Optional<TranscriptionEngine> =
                transcriptionEngine.getOptional("transcription_engine")

            /**
             * Engine-specific transcription settings for Conversation Relay. This accepts the same
             * provider-specific options used by the Call Transcription Start command, such as
             * `transcription_model`, without requiring the engine discriminator to be repeated
             * inside this object.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transcriptionEngineConfig(): Optional<TranscriptionEngineConfig> =
                transcriptionEngineConfig.getOptional("transcription_engine_config")

            /**
             * Conversation Relay transcription provider name. Prefer `transcription_engine` when
             * configuring speech-to-text.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transcriptionProvider(): Optional<String> =
                transcriptionProvider.getOptional("transcription_provider")

            /**
             * Text-to-speech provider for this language. If omitted and `voice` is provided, Telnyx
             * derives the provider from the voice identifier.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ttsProvider(): Optional<String> = ttsProvider.getOptional("tts_provider")

            /**
             * Voice identifier for this language.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun voice(): Optional<String> = voice.getOptional("voice")

            /**
             * The settings associated with the voice selected
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun voiceSettings(): Optional<VoiceSettings> =
                voiceSettings.getOptional("voice_settings")

            /**
             * Returns the raw JSON value of [language].
             *
             * Unlike [language], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

            /**
             * Returns the raw JSON value of [speechModel].
             *
             * Unlike [speechModel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("speech_model")
            @ExcludeMissing
            fun _speechModel(): JsonField<String> = speechModel

            /**
             * Returns the raw JSON value of [transcriptionEngine].
             *
             * Unlike [transcriptionEngine], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("transcription_engine")
            @ExcludeMissing
            fun _transcriptionEngine(): JsonField<TranscriptionEngine> = transcriptionEngine

            /**
             * Returns the raw JSON value of [transcriptionEngineConfig].
             *
             * Unlike [transcriptionEngineConfig], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("transcription_engine_config")
            @ExcludeMissing
            fun _transcriptionEngineConfig(): JsonField<TranscriptionEngineConfig> =
                transcriptionEngineConfig

            /**
             * Returns the raw JSON value of [transcriptionProvider].
             *
             * Unlike [transcriptionProvider], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("transcription_provider")
            @ExcludeMissing
            fun _transcriptionProvider(): JsonField<String> = transcriptionProvider

            /**
             * Returns the raw JSON value of [ttsProvider].
             *
             * Unlike [ttsProvider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tts_provider")
            @ExcludeMissing
            fun _ttsProvider(): JsonField<String> = ttsProvider

            /**
             * Returns the raw JSON value of [voice].
             *
             * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<String> = voice

            /**
             * Returns the raw JSON value of [voiceSettings].
             *
             * Unlike [voiceSettings], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("voice_settings")
            @ExcludeMissing
            fun _voiceSettings(): JsonField<VoiceSettings> = voiceSettings

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
                 * Returns a mutable builder for constructing an instance of [Language].
                 *
                 * The following fields are required:
                 * ```java
                 * .language()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Language]. */
            class Builder internal constructor() {

                private var language: JsonField<String>? = null
                private var speechModel: JsonField<String> = JsonMissing.of()
                private var transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of()
                private var transcriptionEngineConfig: JsonField<TranscriptionEngineConfig> =
                    JsonMissing.of()
                private var transcriptionProvider: JsonField<String> = JsonMissing.of()
                private var ttsProvider: JsonField<String> = JsonMissing.of()
                private var voice: JsonField<String> = JsonMissing.of()
                private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(language: Language) = apply {
                    this.language = language.language
                    speechModel = language.speechModel
                    transcriptionEngine = language.transcriptionEngine
                    transcriptionEngineConfig = language.transcriptionEngineConfig
                    transcriptionProvider = language.transcriptionProvider
                    ttsProvider = language.ttsProvider
                    voice = language.voice
                    voiceSettings = language.voiceSettings
                    additionalProperties = language.additionalProperties.toMutableMap()
                }

                /** BCP 47 language tag for this language configuration. */
                fun language(language: String) = language(JsonField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.language] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun language(language: JsonField<String>) = apply { this.language = language }

                /**
                 * Conversation Relay speech model. Prefer
                 * `transcription_engine_config.transcription_model` when configuring
                 * speech-to-text.
                 */
                fun speechModel(speechModel: String) = speechModel(JsonField.of(speechModel))

                /**
                 * Sets [Builder.speechModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.speechModel] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun speechModel(speechModel: JsonField<String>) = apply {
                    this.speechModel = speechModel
                }

                /**
                 * Engine to use for speech recognition. Legacy values `A` - `Google`, `B` -
                 * `Telnyx` are supported for backward compatibility. When provided in a
                 * Conversation Relay language entry, Telnyx derives `transcription_provider` and
                 * `speech_model` for that language.
                 */
                fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) =
                    transcriptionEngine(JsonField.of(transcriptionEngine))

                /**
                 * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transcriptionEngine] with a well-typed
                 * [TranscriptionEngine] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) =
                    apply {
                        this.transcriptionEngine = transcriptionEngine
                    }

                /**
                 * Engine-specific transcription settings for Conversation Relay. This accepts the
                 * same provider-specific options used by the Call Transcription Start command, such
                 * as `transcription_model`, without requiring the engine discriminator to be
                 * repeated inside this object.
                 */
                fun transcriptionEngineConfig(
                    transcriptionEngineConfig: TranscriptionEngineConfig
                ) = transcriptionEngineConfig(JsonField.of(transcriptionEngineConfig))

                /**
                 * Sets [Builder.transcriptionEngineConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transcriptionEngineConfig] with a well-typed
                 * [TranscriptionEngineConfig] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun transcriptionEngineConfig(
                    transcriptionEngineConfig: JsonField<TranscriptionEngineConfig>
                ) = apply { this.transcriptionEngineConfig = transcriptionEngineConfig }

                /**
                 * Conversation Relay transcription provider name. Prefer `transcription_engine`
                 * when configuring speech-to-text.
                 */
                fun transcriptionProvider(transcriptionProvider: String) =
                    transcriptionProvider(JsonField.of(transcriptionProvider))

                /**
                 * Sets [Builder.transcriptionProvider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transcriptionProvider] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun transcriptionProvider(transcriptionProvider: JsonField<String>) = apply {
                    this.transcriptionProvider = transcriptionProvider
                }

                /**
                 * Text-to-speech provider for this language. If omitted and `voice` is provided,
                 * Telnyx derives the provider from the voice identifier.
                 */
                fun ttsProvider(ttsProvider: String) = ttsProvider(JsonField.of(ttsProvider))

                /**
                 * Sets [Builder.ttsProvider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ttsProvider] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ttsProvider(ttsProvider: JsonField<String>) = apply {
                    this.ttsProvider = ttsProvider
                }

                /** Voice identifier for this language. */
                fun voice(voice: String) = voice(JsonField.of(voice))

                /**
                 * Sets [Builder.voice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.voice] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun voice(voice: JsonField<String>) = apply { this.voice = voice }

                /** The settings associated with the voice selected */
                fun voiceSettings(voiceSettings: VoiceSettings) =
                    voiceSettings(JsonField.of(voiceSettings))

                /**
                 * Sets [Builder.voiceSettings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.voiceSettings] with a well-typed [VoiceSettings]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun voiceSettings(voiceSettings: JsonField<VoiceSettings>) = apply {
                    this.voiceSettings = voiceSettings
                }

                /**
                 * Alias for calling [voiceSettings] with `VoiceSettings.ofElevenlabs(elevenlabs)`.
                 */
                fun voiceSettings(elevenlabs: ElevenLabsVoiceSettings) =
                    voiceSettings(VoiceSettings.ofElevenlabs(elevenlabs))

                /** Alias for calling [voiceSettings] with `VoiceSettings.ofTelnyx(telnyx)`. */
                fun voiceSettings(telnyx: TelnyxVoiceSettings) =
                    voiceSettings(VoiceSettings.ofTelnyx(telnyx))

                /** Alias for calling [voiceSettings] with `VoiceSettings.ofAws(aws)`. */
                fun voiceSettings(aws: AwsVoiceSettings) = voiceSettings(VoiceSettings.ofAws(aws))

                /** Alias for calling [voiceSettings] with `VoiceSettings.ofMinimax(minimax)`. */
                fun voiceSettings(minimax: MinimaxVoiceSettings) =
                    voiceSettings(VoiceSettings.ofMinimax(minimax))

                /** Alias for calling [voiceSettings] with `VoiceSettings.ofAzure(azure)`. */
                fun voiceSettings(azure: AzureVoiceSettings) =
                    voiceSettings(VoiceSettings.ofAzure(azure))

                /** Alias for calling [voiceSettings] with `VoiceSettings.ofRime(rime)`. */
                fun voiceSettings(rime: RimeVoiceSettings) =
                    voiceSettings(VoiceSettings.ofRime(rime))

                /** Alias for calling [voiceSettings] with `VoiceSettings.ofResemble(resemble)`. */
                fun voiceSettings(resemble: ResembleVoiceSettings) =
                    voiceSettings(VoiceSettings.ofResemble(resemble))

                /** Alias for calling [voiceSettings] with `VoiceSettings.ofInworld()`. */
                fun voiceSettingsInworld() = voiceSettings(VoiceSettings.ofInworld())

                /** Alias for calling [voiceSettings] with `VoiceSettings.ofXai(xai)`. */
                fun voiceSettings(xai: XaiVoiceSettings) = voiceSettings(VoiceSettings.ofXai(xai))

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Language].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .language()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Language =
                    Language(
                        checkRequired("language", language),
                        speechModel,
                        transcriptionEngine,
                        transcriptionEngineConfig,
                        transcriptionProvider,
                        ttsProvider,
                        voice,
                        voiceSettings,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Language = apply {
                if (validated) {
                    return@apply
                }

                language()
                speechModel()
                transcriptionEngine().ifPresent { it.validate() }
                transcriptionEngineConfig().ifPresent { it.validate() }
                transcriptionProvider()
                ttsProvider()
                voice()
                voiceSettings().ifPresent { it.validate() }
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
                (if (language.asKnown().isPresent) 1 else 0) +
                    (if (speechModel.asKnown().isPresent) 1 else 0) +
                    (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                    (transcriptionEngineConfig.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (transcriptionProvider.asKnown().isPresent) 1 else 0) +
                    (if (ttsProvider.asKnown().isPresent) 1 else 0) +
                    (if (voice.asKnown().isPresent) 1 else 0) +
                    (voiceSettings.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Engine to use for speech recognition. Legacy values `A` - `Google`, `B` - `Telnyx`
             * are supported for backward compatibility. When provided in a Conversation Relay
             * language entry, Telnyx derives `transcription_provider` and `speech_model` for that
             * language.
             */
            class TranscriptionEngine
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GOOGLE = of("Google")

                    @JvmField val TELNYX = of("Telnyx")

                    @JvmField val DEEPGRAM = of("Deepgram")

                    @JvmField val AZURE = of("Azure")

                    @JvmField val X_AI = of("xAI")

                    @JvmField val ASSEMBLY_AI = of("AssemblyAI")

                    @JvmField val SPEECHMATICS = of("Speechmatics")

                    @JvmField val SONIOX = of("Soniox")

                    @JvmField val A = of("A")

                    @JvmField val B = of("B")

                    @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
                }

                /** An enum containing [TranscriptionEngine]'s known values. */
                enum class Known {
                    GOOGLE,
                    TELNYX,
                    DEEPGRAM,
                    AZURE,
                    X_AI,
                    ASSEMBLY_AI,
                    SPEECHMATICS,
                    SONIOX,
                    A,
                    B,
                }

                /**
                 * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [TranscriptionEngine] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GOOGLE,
                    TELNYX,
                    DEEPGRAM,
                    AZURE,
                    X_AI,
                    ASSEMBLY_AI,
                    SPEECHMATICS,
                    SONIOX,
                    A,
                    B,
                    /**
                     * An enum member indicating that [TranscriptionEngine] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GOOGLE -> Value.GOOGLE
                        TELNYX -> Value.TELNYX
                        DEEPGRAM -> Value.DEEPGRAM
                        AZURE -> Value.AZURE
                        X_AI -> Value.X_AI
                        ASSEMBLY_AI -> Value.ASSEMBLY_AI
                        SPEECHMATICS -> Value.SPEECHMATICS
                        SONIOX -> Value.SONIOX
                        A -> Value.A
                        B -> Value.B
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GOOGLE -> Known.GOOGLE
                        TELNYX -> Known.TELNYX
                        DEEPGRAM -> Known.DEEPGRAM
                        AZURE -> Known.AZURE
                        X_AI -> Known.X_AI
                        ASSEMBLY_AI -> Known.ASSEMBLY_AI
                        SPEECHMATICS -> Known.SPEECHMATICS
                        SONIOX -> Known.SONIOX
                        A -> Known.A
                        B -> Known.B
                        else ->
                            throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): TranscriptionEngine = apply {
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

                    return other is TranscriptionEngine && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Engine-specific transcription settings for Conversation Relay. This accepts the same
             * provider-specific options used by the Call Transcription Start command, such as
             * `transcription_model`, without requiring the engine discriminator to be repeated
             * inside this object.
             */
            class TranscriptionEngineConfig
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
                     * Returns a mutable builder for constructing an instance of
                     * [TranscriptionEngineConfig].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TranscriptionEngineConfig]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(transcriptionEngineConfig: TranscriptionEngineConfig) =
                        apply {
                            additionalProperties =
                                transcriptionEngineConfig.additionalProperties.toMutableMap()
                        }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [TranscriptionEngineConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): TranscriptionEngineConfig =
                        TranscriptionEngineConfig(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): TranscriptionEngineConfig = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TranscriptionEngineConfig &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TranscriptionEngineConfig{additionalProperties=$additionalProperties}"
            }

            /** The settings associated with the voice selected */
            @JsonDeserialize(using = VoiceSettings.Deserializer::class)
            @JsonSerialize(using = VoiceSettings.Serializer::class)
            class VoiceSettings
            private constructor(
                private val elevenlabs: ElevenLabsVoiceSettings? = null,
                private val telnyx: TelnyxVoiceSettings? = null,
                private val aws: AwsVoiceSettings? = null,
                private val minimax: MinimaxVoiceSettings? = null,
                private val azure: AzureVoiceSettings? = null,
                private val rime: RimeVoiceSettings? = null,
                private val resemble: ResembleVoiceSettings? = null,
                private val inworld: JsonValue? = null,
                private val xai: XaiVoiceSettings? = null,
                private val _json: JsonValue? = null,
            ) {

                fun elevenlabs(): Optional<ElevenLabsVoiceSettings> =
                    Optional.ofNullable(elevenlabs)

                fun telnyx(): Optional<TelnyxVoiceSettings> = Optional.ofNullable(telnyx)

                fun aws(): Optional<AwsVoiceSettings> = Optional.ofNullable(aws)

                fun minimax(): Optional<MinimaxVoiceSettings> = Optional.ofNullable(minimax)

                fun azure(): Optional<AzureVoiceSettings> = Optional.ofNullable(azure)

                fun rime(): Optional<RimeVoiceSettings> = Optional.ofNullable(rime)

                fun resemble(): Optional<ResembleVoiceSettings> = Optional.ofNullable(resemble)

                fun inworld(): Optional<JsonValue> = Optional.ofNullable(inworld)

                fun xai(): Optional<XaiVoiceSettings> = Optional.ofNullable(xai)

                fun isElevenlabs(): Boolean = elevenlabs != null

                fun isTelnyx(): Boolean = telnyx != null

                fun isAws(): Boolean = aws != null

                fun isMinimax(): Boolean = minimax != null

                fun isAzure(): Boolean = azure != null

                fun isRime(): Boolean = rime != null

                fun isResemble(): Boolean = resemble != null

                fun isInworld(): Boolean = inworld != null

                fun isXai(): Boolean = xai != null

                fun asElevenlabs(): ElevenLabsVoiceSettings = elevenlabs.getOrThrow("elevenlabs")

                fun asTelnyx(): TelnyxVoiceSettings = telnyx.getOrThrow("telnyx")

                fun asAws(): AwsVoiceSettings = aws.getOrThrow("aws")

                fun asMinimax(): MinimaxVoiceSettings = minimax.getOrThrow("minimax")

                fun asAzure(): AzureVoiceSettings = azure.getOrThrow("azure")

                fun asRime(): RimeVoiceSettings = rime.getOrThrow("rime")

                fun asResemble(): ResembleVoiceSettings = resemble.getOrThrow("resemble")

                fun asInworld(): JsonValue = inworld.getOrThrow("inworld")

                fun asXai(): XaiVoiceSettings = xai.getOrThrow("xai")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.telnyx.sdk.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = voiceSettings.accept(new VoiceSettings.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitElevenlabs(ElevenLabsVoiceSettings elevenlabs) {
                 *         return Optional.of(elevenlabs.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        elevenlabs != null -> visitor.visitElevenlabs(elevenlabs)
                        telnyx != null -> visitor.visitTelnyx(telnyx)
                        aws != null -> visitor.visitAws(aws)
                        minimax != null -> visitor.visitMinimax(minimax)
                        azure != null -> visitor.visitAzure(azure)
                        rime != null -> visitor.visitRime(rime)
                        resemble != null -> visitor.visitResemble(resemble)
                        inworld != null -> visitor.visitInworld(inworld)
                        xai != null -> visitor.visitXai(xai)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): VoiceSettings = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitElevenlabs(elevenlabs: ElevenLabsVoiceSettings) {
                                elevenlabs.validate()
                            }

                            override fun visitTelnyx(telnyx: TelnyxVoiceSettings) {
                                telnyx.validate()
                            }

                            override fun visitAws(aws: AwsVoiceSettings) {
                                aws.validate()
                            }

                            override fun visitMinimax(minimax: MinimaxVoiceSettings) {
                                minimax.validate()
                            }

                            override fun visitAzure(azure: AzureVoiceSettings) {
                                azure.validate()
                            }

                            override fun visitRime(rime: RimeVoiceSettings) {
                                rime.validate()
                            }

                            override fun visitResemble(resemble: ResembleVoiceSettings) {
                                resemble.validate()
                            }

                            override fun visitInworld(inworld: JsonValue) {
                                inworld.let {
                                    if (it != JsonValue.from(mapOf("type" to "inworld"))) {
                                        throw TelnyxInvalidDataException(
                                            "'inworld' is invalid, received $it"
                                        )
                                    }
                                }
                            }

                            override fun visitXai(xai: XaiVoiceSettings) {
                                xai.validate()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitElevenlabs(elevenlabs: ElevenLabsVoiceSettings) =
                                elevenlabs.validity()

                            override fun visitTelnyx(telnyx: TelnyxVoiceSettings) =
                                telnyx.validity()

                            override fun visitAws(aws: AwsVoiceSettings) = aws.validity()

                            override fun visitMinimax(minimax: MinimaxVoiceSettings) =
                                minimax.validity()

                            override fun visitAzure(azure: AzureVoiceSettings) = azure.validity()

                            override fun visitRime(rime: RimeVoiceSettings) = rime.validity()

                            override fun visitResemble(resemble: ResembleVoiceSettings) =
                                resemble.validity()

                            override fun visitInworld(inworld: JsonValue) =
                                inworld.let {
                                    if (it == JsonValue.from(mapOf("type" to "inworld"))) 1 else 0
                                }

                            override fun visitXai(xai: XaiVoiceSettings) = xai.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is VoiceSettings &&
                        elevenlabs == other.elevenlabs &&
                        telnyx == other.telnyx &&
                        aws == other.aws &&
                        minimax == other.minimax &&
                        azure == other.azure &&
                        rime == other.rime &&
                        resemble == other.resemble &&
                        inworld == other.inworld &&
                        xai == other.xai
                }

                override fun hashCode(): Int =
                    Objects.hash(
                        elevenlabs,
                        telnyx,
                        aws,
                        minimax,
                        azure,
                        rime,
                        resemble,
                        inworld,
                        xai,
                    )

                override fun toString(): String =
                    when {
                        elevenlabs != null -> "VoiceSettings{elevenlabs=$elevenlabs}"
                        telnyx != null -> "VoiceSettings{telnyx=$telnyx}"
                        aws != null -> "VoiceSettings{aws=$aws}"
                        minimax != null -> "VoiceSettings{minimax=$minimax}"
                        azure != null -> "VoiceSettings{azure=$azure}"
                        rime != null -> "VoiceSettings{rime=$rime}"
                        resemble != null -> "VoiceSettings{resemble=$resemble}"
                        inworld != null -> "VoiceSettings{inworld=$inworld}"
                        xai != null -> "VoiceSettings{xai=$xai}"
                        _json != null -> "VoiceSettings{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid VoiceSettings")
                    }

                companion object {

                    @JvmStatic
                    fun ofElevenlabs(elevenlabs: ElevenLabsVoiceSettings) =
                        VoiceSettings(elevenlabs = elevenlabs)

                    @JvmStatic
                    fun ofTelnyx(telnyx: TelnyxVoiceSettings) = VoiceSettings(telnyx = telnyx)

                    @JvmStatic fun ofAws(aws: AwsVoiceSettings) = VoiceSettings(aws = aws)

                    @JvmStatic
                    fun ofMinimax(minimax: MinimaxVoiceSettings) = VoiceSettings(minimax = minimax)

                    @JvmStatic fun ofAzure(azure: AzureVoiceSettings) = VoiceSettings(azure = azure)

                    @JvmStatic fun ofRime(rime: RimeVoiceSettings) = VoiceSettings(rime = rime)

                    @JvmStatic
                    fun ofResemble(resemble: ResembleVoiceSettings) =
                        VoiceSettings(resemble = resemble)

                    @JvmStatic
                    fun ofInworld() =
                        VoiceSettings(inworld = JsonValue.from(mapOf("type" to "inworld")))

                    @JvmStatic fun ofXai(xai: XaiVoiceSettings) = VoiceSettings(xai = xai)
                }

                /**
                 * An interface that defines how to map each variant of [VoiceSettings] to a value
                 * of type [T].
                 */
                interface Visitor<out T> {

                    fun visitElevenlabs(elevenlabs: ElevenLabsVoiceSettings): T

                    fun visitTelnyx(telnyx: TelnyxVoiceSettings): T

                    fun visitAws(aws: AwsVoiceSettings): T

                    fun visitMinimax(minimax: MinimaxVoiceSettings): T

                    fun visitAzure(azure: AzureVoiceSettings): T

                    fun visitRime(rime: RimeVoiceSettings): T

                    fun visitResemble(resemble: ResembleVoiceSettings): T

                    fun visitInworld(inworld: JsonValue): T

                    fun visitXai(xai: XaiVoiceSettings): T

                    /**
                     * Maps an unknown variant of [VoiceSettings] to a value of type [T].
                     *
                     * An instance of [VoiceSettings] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws TelnyxInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw TelnyxInvalidDataException("Unknown VoiceSettings: $json")
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<VoiceSettings>(VoiceSettings::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): VoiceSettings {
                        val json = JsonValue.fromJsonNode(node)
                        val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                        when (type) {
                            "elevenlabs" -> {
                                return tryDeserialize(
                                        node,
                                        jacksonTypeRef<ElevenLabsVoiceSettings>(),
                                    )
                                    ?.let { VoiceSettings(elevenlabs = it, _json = json) }
                                    ?: VoiceSettings(_json = json)
                            }
                            "telnyx" -> {
                                return tryDeserialize(node, jacksonTypeRef<TelnyxVoiceSettings>())
                                    ?.let { VoiceSettings(telnyx = it, _json = json) }
                                    ?: VoiceSettings(_json = json)
                            }
                            "aws" -> {
                                return tryDeserialize(node, jacksonTypeRef<AwsVoiceSettings>())
                                    ?.let { VoiceSettings(aws = it, _json = json) }
                                    ?: VoiceSettings(_json = json)
                            }
                            "minimax" -> {
                                return tryDeserialize(node, jacksonTypeRef<MinimaxVoiceSettings>())
                                    ?.let { VoiceSettings(minimax = it, _json = json) }
                                    ?: VoiceSettings(_json = json)
                            }
                            "azure" -> {
                                return tryDeserialize(node, jacksonTypeRef<AzureVoiceSettings>())
                                    ?.let { VoiceSettings(azure = it, _json = json) }
                                    ?: VoiceSettings(_json = json)
                            }
                            "rime" -> {
                                return tryDeserialize(node, jacksonTypeRef<RimeVoiceSettings>())
                                    ?.let { VoiceSettings(rime = it, _json = json) }
                                    ?: VoiceSettings(_json = json)
                            }
                            "resemble" -> {
                                return tryDeserialize(node, jacksonTypeRef<ResembleVoiceSettings>())
                                    ?.let { VoiceSettings(resemble = it, _json = json) }
                                    ?: VoiceSettings(_json = json)
                            }
                            "inworld" -> {
                                return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                    ?.let { VoiceSettings(inworld = it, _json = json) }
                                    ?.takeIf { it.isValid() } ?: VoiceSettings(_json = json)
                            }
                            "xai" -> {
                                return tryDeserialize(node, jacksonTypeRef<XaiVoiceSettings>())
                                    ?.let { VoiceSettings(xai = it, _json = json) }
                                    ?: VoiceSettings(_json = json)
                            }
                        }

                        return VoiceSettings(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<VoiceSettings>(VoiceSettings::class) {

                    override fun serialize(
                        value: VoiceSettings,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.elevenlabs != null -> generator.writeObject(value.elevenlabs)
                            value.telnyx != null -> generator.writeObject(value.telnyx)
                            value.aws != null -> generator.writeObject(value.aws)
                            value.minimax != null -> generator.writeObject(value.minimax)
                            value.azure != null -> generator.writeObject(value.azure)
                            value.rime != null -> generator.writeObject(value.rime)
                            value.resemble != null -> generator.writeObject(value.resemble)
                            value.inworld != null -> generator.writeObject(value.inworld)
                            value.xai != null -> generator.writeObject(value.xai)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid VoiceSettings")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Language &&
                    language == other.language &&
                    speechModel == other.speechModel &&
                    transcriptionEngine == other.transcriptionEngine &&
                    transcriptionEngineConfig == other.transcriptionEngineConfig &&
                    transcriptionProvider == other.transcriptionProvider &&
                    ttsProvider == other.ttsProvider &&
                    voice == other.voice &&
                    voiceSettings == other.voiceSettings &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    language,
                    speechModel,
                    transcriptionEngine,
                    transcriptionEngineConfig,
                    transcriptionProvider,
                    ttsProvider,
                    voice,
                    voiceSettings,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Language{language=$language, speechModel=$speechModel, transcriptionEngine=$transcriptionEngine, transcriptionEngineConfig=$transcriptionEngineConfig, transcriptionProvider=$transcriptionProvider, ttsProvider=$ttsProvider, voice=$voice, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
        }

        /**
         * Provider-specific structured voice settings. Must be supplied together with `provider`;
         * Telnyx sends the value as the nested provider configuration for Conversation Relay.
         */
        class StructuredProvider
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
                 * Returns a mutable builder for constructing an instance of [StructuredProvider].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [StructuredProvider]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(structuredProvider: StructuredProvider) = apply {
                    additionalProperties = structuredProvider.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [StructuredProvider].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): StructuredProvider =
                    StructuredProvider(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): StructuredProvider = apply {
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

                return other is StructuredProvider &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StructuredProvider{additionalProperties=$additionalProperties}"
        }

        /**
         * Engine to use for speech recognition. Legacy values `A` - `Google`, `B` - `Telnyx` are
         * supported for backward compatibility. For Conversation Relay, use this field with
         * `transcription_engine_config`; the `transcription` object is not supported.
         */
        class TranscriptionEngine
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

                @JvmField val GOOGLE = of("Google")

                @JvmField val TELNYX = of("Telnyx")

                @JvmField val DEEPGRAM = of("Deepgram")

                @JvmField val AZURE = of("Azure")

                @JvmField val X_AI = of("xAI")

                @JvmField val ASSEMBLY_AI = of("AssemblyAI")

                @JvmField val SPEECHMATICS = of("Speechmatics")

                @JvmField val SONIOX = of("Soniox")

                @JvmField val A = of("A")

                @JvmField val B = of("B")

                @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
            }

            /** An enum containing [TranscriptionEngine]'s known values. */
            enum class Known {
                GOOGLE,
                TELNYX,
                DEEPGRAM,
                AZURE,
                X_AI,
                ASSEMBLY_AI,
                SPEECHMATICS,
                SONIOX,
                A,
                B,
            }

            /**
             * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TranscriptionEngine] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                GOOGLE,
                TELNYX,
                DEEPGRAM,
                AZURE,
                X_AI,
                ASSEMBLY_AI,
                SPEECHMATICS,
                SONIOX,
                A,
                B,
                /**
                 * An enum member indicating that [TranscriptionEngine] was instantiated with an
                 * unknown value.
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
                    GOOGLE -> Value.GOOGLE
                    TELNYX -> Value.TELNYX
                    DEEPGRAM -> Value.DEEPGRAM
                    AZURE -> Value.AZURE
                    X_AI -> Value.X_AI
                    ASSEMBLY_AI -> Value.ASSEMBLY_AI
                    SPEECHMATICS -> Value.SPEECHMATICS
                    SONIOX -> Value.SONIOX
                    A -> Value.A
                    B -> Value.B
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
                    GOOGLE -> Known.GOOGLE
                    TELNYX -> Known.TELNYX
                    DEEPGRAM -> Known.DEEPGRAM
                    AZURE -> Known.AZURE
                    X_AI -> Known.X_AI
                    ASSEMBLY_AI -> Known.ASSEMBLY_AI
                    SPEECHMATICS -> Known.SPEECHMATICS
                    SONIOX -> Known.SONIOX
                    A -> Known.A
                    B -> Known.B
                    else -> throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): TranscriptionEngine = apply {
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

                return other is TranscriptionEngine && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Engine-specific transcription settings for Conversation Relay. This accepts the same
         * provider-specific options used by the Call Transcription Start command, such as
         * `transcription_model`, without requiring the engine discriminator to be repeated inside
         * this object.
         */
        class TranscriptionEngineConfig
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
                 * Returns a mutable builder for constructing an instance of
                 * [TranscriptionEngineConfig].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TranscriptionEngineConfig]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(transcriptionEngineConfig: TranscriptionEngineConfig) = apply {
                    additionalProperties =
                        transcriptionEngineConfig.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [TranscriptionEngineConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TranscriptionEngineConfig =
                    TranscriptionEngineConfig(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): TranscriptionEngineConfig = apply {
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

                return other is TranscriptionEngineConfig &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TranscriptionEngineConfig{additionalProperties=$additionalProperties}"
        }

        /** The settings associated with the voice selected */
        @JsonDeserialize(using = VoiceSettings.Deserializer::class)
        @JsonSerialize(using = VoiceSettings.Serializer::class)
        class VoiceSettings
        private constructor(
            private val elevenlabs: ElevenLabsVoiceSettings? = null,
            private val telnyx: TelnyxVoiceSettings? = null,
            private val aws: AwsVoiceSettings? = null,
            private val minimax: MinimaxVoiceSettings? = null,
            private val azure: AzureVoiceSettings? = null,
            private val rime: RimeVoiceSettings? = null,
            private val resemble: ResembleVoiceSettings? = null,
            private val inworld: JsonValue? = null,
            private val xai: XaiVoiceSettings? = null,
            private val _json: JsonValue? = null,
        ) {

            fun elevenlabs(): Optional<ElevenLabsVoiceSettings> = Optional.ofNullable(elevenlabs)

            fun telnyx(): Optional<TelnyxVoiceSettings> = Optional.ofNullable(telnyx)

            fun aws(): Optional<AwsVoiceSettings> = Optional.ofNullable(aws)

            fun minimax(): Optional<MinimaxVoiceSettings> = Optional.ofNullable(minimax)

            fun azure(): Optional<AzureVoiceSettings> = Optional.ofNullable(azure)

            fun rime(): Optional<RimeVoiceSettings> = Optional.ofNullable(rime)

            fun resemble(): Optional<ResembleVoiceSettings> = Optional.ofNullable(resemble)

            fun inworld(): Optional<JsonValue> = Optional.ofNullable(inworld)

            fun xai(): Optional<XaiVoiceSettings> = Optional.ofNullable(xai)

            fun isElevenlabs(): Boolean = elevenlabs != null

            fun isTelnyx(): Boolean = telnyx != null

            fun isAws(): Boolean = aws != null

            fun isMinimax(): Boolean = minimax != null

            fun isAzure(): Boolean = azure != null

            fun isRime(): Boolean = rime != null

            fun isResemble(): Boolean = resemble != null

            fun isInworld(): Boolean = inworld != null

            fun isXai(): Boolean = xai != null

            fun asElevenlabs(): ElevenLabsVoiceSettings = elevenlabs.getOrThrow("elevenlabs")

            fun asTelnyx(): TelnyxVoiceSettings = telnyx.getOrThrow("telnyx")

            fun asAws(): AwsVoiceSettings = aws.getOrThrow("aws")

            fun asMinimax(): MinimaxVoiceSettings = minimax.getOrThrow("minimax")

            fun asAzure(): AzureVoiceSettings = azure.getOrThrow("azure")

            fun asRime(): RimeVoiceSettings = rime.getOrThrow("rime")

            fun asResemble(): ResembleVoiceSettings = resemble.getOrThrow("resemble")

            fun asInworld(): JsonValue = inworld.getOrThrow("inworld")

            fun asXai(): XaiVoiceSettings = xai.getOrThrow("xai")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = voiceSettings.accept(new VoiceSettings.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitElevenlabs(ElevenLabsVoiceSettings elevenlabs) {
             *         return Optional.of(elevenlabs.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    elevenlabs != null -> visitor.visitElevenlabs(elevenlabs)
                    telnyx != null -> visitor.visitTelnyx(telnyx)
                    aws != null -> visitor.visitAws(aws)
                    minimax != null -> visitor.visitMinimax(minimax)
                    azure != null -> visitor.visitAzure(azure)
                    rime != null -> visitor.visitRime(rime)
                    resemble != null -> visitor.visitResemble(resemble)
                    inworld != null -> visitor.visitInworld(inworld)
                    xai != null -> visitor.visitXai(xai)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): VoiceSettings = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitElevenlabs(elevenlabs: ElevenLabsVoiceSettings) {
                            elevenlabs.validate()
                        }

                        override fun visitTelnyx(telnyx: TelnyxVoiceSettings) {
                            telnyx.validate()
                        }

                        override fun visitAws(aws: AwsVoiceSettings) {
                            aws.validate()
                        }

                        override fun visitMinimax(minimax: MinimaxVoiceSettings) {
                            minimax.validate()
                        }

                        override fun visitAzure(azure: AzureVoiceSettings) {
                            azure.validate()
                        }

                        override fun visitRime(rime: RimeVoiceSettings) {
                            rime.validate()
                        }

                        override fun visitResemble(resemble: ResembleVoiceSettings) {
                            resemble.validate()
                        }

                        override fun visitInworld(inworld: JsonValue) {
                            inworld.let {
                                if (it != JsonValue.from(mapOf("type" to "inworld"))) {
                                    throw TelnyxInvalidDataException(
                                        "'inworld' is invalid, received $it"
                                    )
                                }
                            }
                        }

                        override fun visitXai(xai: XaiVoiceSettings) {
                            xai.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitElevenlabs(elevenlabs: ElevenLabsVoiceSettings) =
                            elevenlabs.validity()

                        override fun visitTelnyx(telnyx: TelnyxVoiceSettings) = telnyx.validity()

                        override fun visitAws(aws: AwsVoiceSettings) = aws.validity()

                        override fun visitMinimax(minimax: MinimaxVoiceSettings) =
                            minimax.validity()

                        override fun visitAzure(azure: AzureVoiceSettings) = azure.validity()

                        override fun visitRime(rime: RimeVoiceSettings) = rime.validity()

                        override fun visitResemble(resemble: ResembleVoiceSettings) =
                            resemble.validity()

                        override fun visitInworld(inworld: JsonValue) =
                            inworld.let {
                                if (it == JsonValue.from(mapOf("type" to "inworld"))) 1 else 0
                            }

                        override fun visitXai(xai: XaiVoiceSettings) = xai.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VoiceSettings &&
                    elevenlabs == other.elevenlabs &&
                    telnyx == other.telnyx &&
                    aws == other.aws &&
                    minimax == other.minimax &&
                    azure == other.azure &&
                    rime == other.rime &&
                    resemble == other.resemble &&
                    inworld == other.inworld &&
                    xai == other.xai
            }

            override fun hashCode(): Int =
                Objects.hash(elevenlabs, telnyx, aws, minimax, azure, rime, resemble, inworld, xai)

            override fun toString(): String =
                when {
                    elevenlabs != null -> "VoiceSettings{elevenlabs=$elevenlabs}"
                    telnyx != null -> "VoiceSettings{telnyx=$telnyx}"
                    aws != null -> "VoiceSettings{aws=$aws}"
                    minimax != null -> "VoiceSettings{minimax=$minimax}"
                    azure != null -> "VoiceSettings{azure=$azure}"
                    rime != null -> "VoiceSettings{rime=$rime}"
                    resemble != null -> "VoiceSettings{resemble=$resemble}"
                    inworld != null -> "VoiceSettings{inworld=$inworld}"
                    xai != null -> "VoiceSettings{xai=$xai}"
                    _json != null -> "VoiceSettings{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid VoiceSettings")
                }

            companion object {

                @JvmStatic
                fun ofElevenlabs(elevenlabs: ElevenLabsVoiceSettings) =
                    VoiceSettings(elevenlabs = elevenlabs)

                @JvmStatic
                fun ofTelnyx(telnyx: TelnyxVoiceSettings) = VoiceSettings(telnyx = telnyx)

                @JvmStatic fun ofAws(aws: AwsVoiceSettings) = VoiceSettings(aws = aws)

                @JvmStatic
                fun ofMinimax(minimax: MinimaxVoiceSettings) = VoiceSettings(minimax = minimax)

                @JvmStatic fun ofAzure(azure: AzureVoiceSettings) = VoiceSettings(azure = azure)

                @JvmStatic fun ofRime(rime: RimeVoiceSettings) = VoiceSettings(rime = rime)

                @JvmStatic
                fun ofResemble(resemble: ResembleVoiceSettings) = VoiceSettings(resemble = resemble)

                @JvmStatic
                fun ofInworld() =
                    VoiceSettings(inworld = JsonValue.from(mapOf("type" to "inworld")))

                @JvmStatic fun ofXai(xai: XaiVoiceSettings) = VoiceSettings(xai = xai)
            }

            /**
             * An interface that defines how to map each variant of [VoiceSettings] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitElevenlabs(elevenlabs: ElevenLabsVoiceSettings): T

                fun visitTelnyx(telnyx: TelnyxVoiceSettings): T

                fun visitAws(aws: AwsVoiceSettings): T

                fun visitMinimax(minimax: MinimaxVoiceSettings): T

                fun visitAzure(azure: AzureVoiceSettings): T

                fun visitRime(rime: RimeVoiceSettings): T

                fun visitResemble(resemble: ResembleVoiceSettings): T

                fun visitInworld(inworld: JsonValue): T

                fun visitXai(xai: XaiVoiceSettings): T

                /**
                 * Maps an unknown variant of [VoiceSettings] to a value of type [T].
                 *
                 * An instance of [VoiceSettings] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown VoiceSettings: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<VoiceSettings>(VoiceSettings::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): VoiceSettings {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                    when (type) {
                        "elevenlabs" -> {
                            return tryDeserialize(node, jacksonTypeRef<ElevenLabsVoiceSettings>())
                                ?.let { VoiceSettings(elevenlabs = it, _json = json) }
                                ?: VoiceSettings(_json = json)
                        }
                        "telnyx" -> {
                            return tryDeserialize(node, jacksonTypeRef<TelnyxVoiceSettings>())
                                ?.let { VoiceSettings(telnyx = it, _json = json) }
                                ?: VoiceSettings(_json = json)
                        }
                        "aws" -> {
                            return tryDeserialize(node, jacksonTypeRef<AwsVoiceSettings>())?.let {
                                VoiceSettings(aws = it, _json = json)
                            } ?: VoiceSettings(_json = json)
                        }
                        "minimax" -> {
                            return tryDeserialize(node, jacksonTypeRef<MinimaxVoiceSettings>())
                                ?.let { VoiceSettings(minimax = it, _json = json) }
                                ?: VoiceSettings(_json = json)
                        }
                        "azure" -> {
                            return tryDeserialize(node, jacksonTypeRef<AzureVoiceSettings>())?.let {
                                VoiceSettings(azure = it, _json = json)
                            } ?: VoiceSettings(_json = json)
                        }
                        "rime" -> {
                            return tryDeserialize(node, jacksonTypeRef<RimeVoiceSettings>())?.let {
                                VoiceSettings(rime = it, _json = json)
                            } ?: VoiceSettings(_json = json)
                        }
                        "resemble" -> {
                            return tryDeserialize(node, jacksonTypeRef<ResembleVoiceSettings>())
                                ?.let { VoiceSettings(resemble = it, _json = json) }
                                ?: VoiceSettings(_json = json)
                        }
                        "inworld" -> {
                            return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                ?.let { VoiceSettings(inworld = it, _json = json) }
                                ?.takeIf { it.isValid() } ?: VoiceSettings(_json = json)
                        }
                        "xai" -> {
                            return tryDeserialize(node, jacksonTypeRef<XaiVoiceSettings>())?.let {
                                VoiceSettings(xai = it, _json = json)
                            } ?: VoiceSettings(_json = json)
                        }
                    }

                    return VoiceSettings(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<VoiceSettings>(VoiceSettings::class) {

                override fun serialize(
                    value: VoiceSettings,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.elevenlabs != null -> generator.writeObject(value.elevenlabs)
                        value.telnyx != null -> generator.writeObject(value.telnyx)
                        value.aws != null -> generator.writeObject(value.aws)
                        value.minimax != null -> generator.writeObject(value.minimax)
                        value.azure != null -> generator.writeObject(value.azure)
                        value.rime != null -> generator.writeObject(value.rime)
                        value.resemble != null -> generator.writeObject(value.resemble)
                        value.inworld != null -> generator.writeObject(value.inworld)
                        value.xai != null -> generator.writeObject(value.xai)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid VoiceSettings")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConversationRelayConfig &&
                url == other.url &&
                customParameters == other.customParameters &&
                dtmfDetection == other.dtmfDetection &&
                greeting == other.greeting &&
                interruptible == other.interruptible &&
                interruptibleGreeting == other.interruptibleGreeting &&
                interruptionSettings == other.interruptionSettings &&
                language == other.language &&
                languages == other.languages &&
                provider == other.provider &&
                structuredProvider == other.structuredProvider &&
                transcriptionEngine == other.transcriptionEngine &&
                transcriptionEngineConfig == other.transcriptionEngineConfig &&
                ttsProvider == other.ttsProvider &&
                voice == other.voice &&
                voiceSettings == other.voiceSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                url,
                customParameters,
                dtmfDetection,
                greeting,
                interruptible,
                interruptibleGreeting,
                interruptionSettings,
                language,
                languages,
                provider,
                structuredProvider,
                transcriptionEngine,
                transcriptionEngineConfig,
                ttsProvider,
                voice,
                voiceSettings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConversationRelayConfig{url=$url, customParameters=$customParameters, dtmfDetection=$dtmfDetection, greeting=$greeting, interruptible=$interruptible, interruptibleGreeting=$interruptibleGreeting, interruptionSettings=$interruptionSettings, language=$language, languages=$languages, provider=$provider, structuredProvider=$structuredProvider, transcriptionEngine=$transcriptionEngine, transcriptionEngineConfig=$transcriptionEngineConfig, ttsProvider=$ttsProvider, voice=$voice, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
    }

    /**
     * Enables deepfake detection on the call. When enabled, audio from the remote party is streamed
     * to a detection service that analyzes whether the voice is AI-generated. Results are delivered
     * via the `call.deepfake_detection.result` webhook.
     */
    class DeepfakeDetection
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val enabled: JsonField<Boolean>,
        private val rtpTimeout: JsonField<Int>,
        private val timeout: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("rtp_timeout")
            @ExcludeMissing
            rtpTimeout: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Int> = JsonMissing.of(),
        ) : this(enabled, rtpTimeout, timeout, mutableMapOf())

        /**
         * Whether deepfake detection is enabled.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun enabled(): Boolean = enabled.getRequired("enabled")

        /**
         * Maximum time in seconds to wait for RTP audio before timing out. If no audio is received
         * within this window, detection stops with an error.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rtpTimeout(): Optional<Int> = rtpTimeout.getOptional("rtp_timeout")

        /**
         * Maximum time in seconds to wait for a detection result before timing out.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Optional<Int> = timeout.getOptional("timeout")

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [rtpTimeout].
         *
         * Unlike [rtpTimeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rtp_timeout") @ExcludeMissing fun _rtpTimeout(): JsonField<Int> = rtpTimeout

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Int> = timeout

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
             * Returns a mutable builder for constructing an instance of [DeepfakeDetection].
             *
             * The following fields are required:
             * ```java
             * .enabled()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DeepfakeDetection]. */
        class Builder internal constructor() {

            private var enabled: JsonField<Boolean>? = null
            private var rtpTimeout: JsonField<Int> = JsonMissing.of()
            private var timeout: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deepfakeDetection: DeepfakeDetection) = apply {
                enabled = deepfakeDetection.enabled
                rtpTimeout = deepfakeDetection.rtpTimeout
                timeout = deepfakeDetection.timeout
                additionalProperties = deepfakeDetection.additionalProperties.toMutableMap()
            }

            /** Whether deepfake detection is enabled. */
            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            /**
             * Maximum time in seconds to wait for RTP audio before timing out. If no audio is
             * received within this window, detection stops with an error.
             */
            fun rtpTimeout(rtpTimeout: Int) = rtpTimeout(JsonField.of(rtpTimeout))

            /**
             * Sets [Builder.rtpTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rtpTimeout] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rtpTimeout(rtpTimeout: JsonField<Int>) = apply { this.rtpTimeout = rtpTimeout }

            /** Maximum time in seconds to wait for a detection result before timing out. */
            fun timeout(timeout: Int) = timeout(JsonField.of(timeout))

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun timeout(timeout: JsonField<Int>) = apply { this.timeout = timeout }

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
             * Returns an immutable instance of [DeepfakeDetection].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .enabled()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DeepfakeDetection =
                DeepfakeDetection(
                    checkRequired("enabled", enabled),
                    rtpTimeout,
                    timeout,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): DeepfakeDetection = apply {
            if (validated) {
                return@apply
            }

            enabled()
            rtpTimeout()
            timeout()
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
            (if (enabled.asKnown().isPresent) 1 else 0) +
                (if (rtpTimeout.asKnown().isPresent) 1 else 0) +
                (if (timeout.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DeepfakeDetection &&
                enabled == other.enabled &&
                rtpTimeout == other.rtpTimeout &&
                timeout == other.timeout &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(enabled, rtpTimeout, timeout, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DeepfakeDetection{enabled=$enabled, rtpTimeout=$rtpTimeout, timeout=$timeout, additionalProperties=$additionalProperties}"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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
