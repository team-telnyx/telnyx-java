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
import com.telnyx.sdk.models.calls.DialogflowConfig
import com.telnyx.sdk.models.calls.StreamBidirectionalCodec
import com.telnyx.sdk.models.calls.StreamBidirectionalMode
import com.telnyx.sdk.models.calls.StreamBidirectionalSamplingRate
import com.telnyx.sdk.models.calls.StreamBidirectionalTargetLegs
import com.telnyx.sdk.models.calls.StreamCodec
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Start streaming the media from a call to a specific WebSocket address or Dialogflow connection in
 * near-realtime. Audio will be delivered as base64-encoded RTP payload (raw audio), wrapped in JSON
 * payloads.
 *
 * Please find more details about media streaming messages specification under the
 * [link](https://developers.telnyx.com/docs/voice/programmable-voice/media-streaming).
 */
class ActionStartStreamingParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

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
     * Custom parameters to be sent as part of the WebSocket connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customParameters(): Optional<List<CustomParameter>> = body.customParameters()

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
     * An authentication token to be sent as part of the WebSocket connection. Maximum length is
     * 4000 characters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamAuthToken(): Optional<String> = body.streamAuthToken()

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
     * Returns the raw JSON value of [customParameters].
     *
     * Unlike [customParameters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customParameters(): JsonField<List<CustomParameter>> = body._customParameters()

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
     * Returns the raw JSON value of [streamAuthToken].
     *
     * Unlike [streamAuthToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _streamAuthToken(): JsonField<String> = body._streamAuthToken()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ActionStartStreamingParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ActionStartStreamingParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionStartStreamingParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionStartStreamingParams: ActionStartStreamingParams) = apply {
            callControlId = actionStartStreamingParams.callControlId
            body = actionStartStreamingParams.body.toBuilder()
            additionalHeaders = actionStartStreamingParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionStartStreamingParams.additionalQueryParams.toBuilder()
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
         * - [clientState]
         * - [commandId]
         * - [customParameters]
         * - [dialogflowConfig]
         * - [enableDialogflow]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

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

        /** Custom parameters to be sent as part of the WebSocket connection. */
        fun customParameters(customParameters: List<CustomParameter>) = apply {
            body.customParameters(customParameters)
        }

        /**
         * Sets [Builder.customParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customParameters] with a well-typed
         * `List<CustomParameter>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun customParameters(customParameters: JsonField<List<CustomParameter>>) = apply {
            body.customParameters(customParameters)
        }

        /**
         * Adds a single [CustomParameter] to [customParameters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomParameter(customParameter: CustomParameter) = apply {
            body.addCustomParameter(customParameter)
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
         * An authentication token to be sent as part of the WebSocket connection. Maximum length is
         * 4000 characters.
         */
        fun streamAuthToken(streamAuthToken: String) = apply {
            body.streamAuthToken(streamAuthToken)
        }

        /**
         * Sets [Builder.streamAuthToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamAuthToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun streamAuthToken(streamAuthToken: JsonField<String>) = apply {
            body.streamAuthToken(streamAuthToken)
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
         * Returns an immutable instance of [ActionStartStreamingParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionStartStreamingParams =
            ActionStartStreamingParams(
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
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val customParameters: JsonField<List<CustomParameter>>,
        private val dialogflowConfig: JsonField<DialogflowConfig>,
        private val enableDialogflow: JsonField<Boolean>,
        private val streamAuthToken: JsonField<String>,
        private val streamBidirectionalCodec: JsonField<StreamBidirectionalCodec>,
        private val streamBidirectionalMode: JsonField<StreamBidirectionalMode>,
        private val streamBidirectionalSamplingRate: JsonField<StreamBidirectionalSamplingRate>,
        private val streamBidirectionalTargetLegs: JsonField<StreamBidirectionalTargetLegs>,
        private val streamCodec: JsonField<StreamCodec>,
        private val streamTrack: JsonField<StreamTrack>,
        private val streamUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_parameters")
            @ExcludeMissing
            customParameters: JsonField<List<CustomParameter>> = JsonMissing.of(),
            @JsonProperty("dialogflow_config")
            @ExcludeMissing
            dialogflowConfig: JsonField<DialogflowConfig> = JsonMissing.of(),
            @JsonProperty("enable_dialogflow")
            @ExcludeMissing
            enableDialogflow: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("stream_auth_token")
            @ExcludeMissing
            streamAuthToken: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("stream_track")
            @ExcludeMissing
            streamTrack: JsonField<StreamTrack> = JsonMissing.of(),
            @JsonProperty("stream_url")
            @ExcludeMissing
            streamUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            clientState,
            commandId,
            customParameters,
            dialogflowConfig,
            enableDialogflow,
            streamAuthToken,
            streamBidirectionalCodec,
            streamBidirectionalMode,
            streamBidirectionalSamplingRate,
            streamBidirectionalTargetLegs,
            streamCodec,
            streamTrack,
            streamUrl,
            mutableMapOf(),
        )

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
         * Custom parameters to be sent as part of the WebSocket connection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customParameters(): Optional<List<CustomParameter>> =
            customParameters.getOptional("custom_parameters")

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
         * An authentication token to be sent as part of the WebSocket connection. Maximum length is
         * 4000 characters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streamAuthToken(): Optional<String> = streamAuthToken.getOptional("stream_auth_token")

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
         * Returns the raw JSON value of [customParameters].
         *
         * Unlike [customParameters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_parameters")
        @ExcludeMissing
        fun _customParameters(): JsonField<List<CustomParameter>> = customParameters

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
         * Returns the raw JSON value of [streamAuthToken].
         *
         * Unlike [streamAuthToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("stream_auth_token")
        @ExcludeMissing
        fun _streamAuthToken(): JsonField<String> = streamAuthToken

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

            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var customParameters: JsonField<MutableList<CustomParameter>>? = null
            private var dialogflowConfig: JsonField<DialogflowConfig> = JsonMissing.of()
            private var enableDialogflow: JsonField<Boolean> = JsonMissing.of()
            private var streamAuthToken: JsonField<String> = JsonMissing.of()
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
            private var streamTrack: JsonField<StreamTrack> = JsonMissing.of()
            private var streamUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                clientState = body.clientState
                commandId = body.commandId
                customParameters = body.customParameters.map { it.toMutableList() }
                dialogflowConfig = body.dialogflowConfig
                enableDialogflow = body.enableDialogflow
                streamAuthToken = body.streamAuthToken
                streamBidirectionalCodec = body.streamBidirectionalCodec
                streamBidirectionalMode = body.streamBidirectionalMode
                streamBidirectionalSamplingRate = body.streamBidirectionalSamplingRate
                streamBidirectionalTargetLegs = body.streamBidirectionalTargetLegs
                streamCodec = body.streamCodec
                streamTrack = body.streamTrack
                streamUrl = body.streamUrl
                additionalProperties = body.additionalProperties.toMutableMap()
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

            /** Custom parameters to be sent as part of the WebSocket connection. */
            fun customParameters(customParameters: List<CustomParameter>) =
                customParameters(JsonField.of(customParameters))

            /**
             * Sets [Builder.customParameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customParameters] with a well-typed
             * `List<CustomParameter>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun customParameters(customParameters: JsonField<List<CustomParameter>>) = apply {
                this.customParameters = customParameters.map { it.toMutableList() }
            }

            /**
             * Adds a single [CustomParameter] to [customParameters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCustomParameter(customParameter: CustomParameter) = apply {
                customParameters =
                    (customParameters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customParameters", it).add(customParameter)
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
             * An authentication token to be sent as part of the WebSocket connection. Maximum
             * length is 4000 characters.
             */
            fun streamAuthToken(streamAuthToken: String) =
                streamAuthToken(JsonField.of(streamAuthToken))

            /**
             * Sets [Builder.streamAuthToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamAuthToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun streamAuthToken(streamAuthToken: JsonField<String>) = apply {
                this.streamAuthToken = streamAuthToken
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
                    clientState,
                    commandId,
                    (customParameters ?: JsonMissing.of()).map { it.toImmutable() },
                    dialogflowConfig,
                    enableDialogflow,
                    streamAuthToken,
                    streamBidirectionalCodec,
                    streamBidirectionalMode,
                    streamBidirectionalSamplingRate,
                    streamBidirectionalTargetLegs,
                    streamCodec,
                    streamTrack,
                    streamUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            clientState()
            commandId()
            customParameters().ifPresent { it.forEach { it.validate() } }
            dialogflowConfig().ifPresent { it.validate() }
            enableDialogflow()
            streamAuthToken()
            streamBidirectionalCodec().ifPresent { it.validate() }
            streamBidirectionalMode().ifPresent { it.validate() }
            streamBidirectionalSamplingRate().ifPresent { it.validate() }
            streamBidirectionalTargetLegs().ifPresent { it.validate() }
            streamCodec().ifPresent { it.validate() }
            streamTrack().ifPresent { it.validate() }
            streamUrl()
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
            (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (customParameters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (dialogflowConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (enableDialogflow.asKnown().isPresent) 1 else 0) +
                (if (streamAuthToken.asKnown().isPresent) 1 else 0) +
                (streamBidirectionalCodec.asKnown().getOrNull()?.validity() ?: 0) +
                (streamBidirectionalMode.asKnown().getOrNull()?.validity() ?: 0) +
                (streamBidirectionalSamplingRate.asKnown().getOrNull()?.validity() ?: 0) +
                (streamBidirectionalTargetLegs.asKnown().getOrNull()?.validity() ?: 0) +
                (streamCodec.asKnown().getOrNull()?.validity() ?: 0) +
                (streamTrack.asKnown().getOrNull()?.validity() ?: 0) +
                (if (streamUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                customParameters == other.customParameters &&
                dialogflowConfig == other.dialogflowConfig &&
                enableDialogflow == other.enableDialogflow &&
                streamAuthToken == other.streamAuthToken &&
                streamBidirectionalCodec == other.streamBidirectionalCodec &&
                streamBidirectionalMode == other.streamBidirectionalMode &&
                streamBidirectionalSamplingRate == other.streamBidirectionalSamplingRate &&
                streamBidirectionalTargetLegs == other.streamBidirectionalTargetLegs &&
                streamCodec == other.streamCodec &&
                streamTrack == other.streamTrack &&
                streamUrl == other.streamUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                clientState,
                commandId,
                customParameters,
                dialogflowConfig,
                enableDialogflow,
                streamAuthToken,
                streamBidirectionalCodec,
                streamBidirectionalMode,
                streamBidirectionalSamplingRate,
                streamBidirectionalTargetLegs,
                streamCodec,
                streamTrack,
                streamUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{clientState=$clientState, commandId=$commandId, customParameters=$customParameters, dialogflowConfig=$dialogflowConfig, enableDialogflow=$enableDialogflow, streamAuthToken=$streamAuthToken, streamBidirectionalCodec=$streamBidirectionalCodec, streamBidirectionalMode=$streamBidirectionalMode, streamBidirectionalSamplingRate=$streamBidirectionalSamplingRate, streamBidirectionalTargetLegs=$streamBidirectionalTargetLegs, streamCodec=$streamCodec, streamTrack=$streamTrack, streamUrl=$streamUrl, additionalProperties=$additionalProperties}"
    }

    class CustomParameter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(name, value, mutableMapOf())

        /**
         * The name of the custom parameter.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * The value of the custom parameter.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun value(): Optional<String> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

            /** Returns a mutable builder for constructing an instance of [CustomParameter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomParameter]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customParameter: CustomParameter) = apply {
                name = customParameter.name
                value = customParameter.value
                additionalProperties = customParameter.additionalProperties.toMutableMap()
            }

            /** The name of the custom parameter. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The value of the custom parameter. */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [CustomParameter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomParameter =
                CustomParameter(name, value, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): CustomParameter = apply {
            if (validated) {
                return@apply
            }

            name()
            value()
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
            (if (name.asKnown().isPresent) 1 else 0) + (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomParameter &&
                name == other.name &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomParameter{name=$name, value=$value, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionStartStreamingParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionStartStreamingParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
