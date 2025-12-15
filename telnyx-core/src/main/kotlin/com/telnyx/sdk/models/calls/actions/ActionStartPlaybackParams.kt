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
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Play an audio file on the call. If multiple play audio commands are issued consecutively, the
 * audio files will be placed in a queue awaiting playback.
 *
 * *Notes:*
 * - When `overlay` is enabled, `target_legs` is limited to `self`.
 * - A customer cannot Play Audio with `overlay=true` unless there is a Play Audio with
 *   `overlay=false` actively playing.
 *
 * **Expected Webhooks:**
 * - `call.playback.started`
 * - `call.playback.ended`
 */
class ActionStartPlaybackParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    /**
     * Specifies the type of audio provided in `audio_url` or `playback_content`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioType(): Optional<AudioType> = body.audioType()

    /**
     * The URL of a file to be played back on the call. The URL can point to either a WAV or MP3
     * file. media_name and audio_url cannot be used together in one request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioUrl(): Optional<String> = body.audioUrl()

    /**
     * Caches the audio file. Useful when playing the same audio file multiple times during the
     * call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cacheAudio(): Optional<Boolean> = body.cacheAudio()

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
     * The number of times the audio file should be played. If supplied, the value must be an
     * integer between 1 and 100, or the special string `infinity` for an endless loop.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loop(): Optional<Loopcount> = body.loop()

    /**
     * The media_name of a file to be played back on the call. The media_name must point to a file
     * previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must
     * either be a WAV or MP3 file.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaName(): Optional<String> = body.mediaName()

    /**
     * When enabled, audio will be mixed on top of any other audio that is actively being played
     * back. Note that `overlay: true` will only work if there is another audio file already being
     * played on the call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overlay(): Optional<Boolean> = body.overlay()

    /**
     * Allows a user to provide base64 encoded mp3 or wav. Note: when using this parameter,
     * `media_url` and `media_name` in the `playback_started` and `playback_ended` webhooks will be
     * empty
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun playbackContent(): Optional<String> = body.playbackContent()

    /**
     * When specified, it stops the current audio being played. Specify `current` to stop the
     * current audio being played, and to play the next file in the queue. Specify `all` to stop the
     * current audio file being played and to also clear all audio files from the queue.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stop(): Optional<String> = body.stop()

    /**
     * Specifies the leg or legs on which audio will be played. If supplied, the value must be
     * either `self`, `opposite` or `both`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetLegs(): Optional<String> = body.targetLegs()

    /**
     * Returns the raw JSON value of [audioType].
     *
     * Unlike [audioType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _audioType(): JsonField<AudioType> = body._audioType()

    /**
     * Returns the raw JSON value of [audioUrl].
     *
     * Unlike [audioUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _audioUrl(): JsonField<String> = body._audioUrl()

    /**
     * Returns the raw JSON value of [cacheAudio].
     *
     * Unlike [cacheAudio], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cacheAudio(): JsonField<Boolean> = body._cacheAudio()

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
     * Returns the raw JSON value of [loop].
     *
     * Unlike [loop], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _loop(): JsonField<Loopcount> = body._loop()

    /**
     * Returns the raw JSON value of [mediaName].
     *
     * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mediaName(): JsonField<String> = body._mediaName()

    /**
     * Returns the raw JSON value of [overlay].
     *
     * Unlike [overlay], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _overlay(): JsonField<Boolean> = body._overlay()

    /**
     * Returns the raw JSON value of [playbackContent].
     *
     * Unlike [playbackContent], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _playbackContent(): JsonField<String> = body._playbackContent()

    /**
     * Returns the raw JSON value of [stop].
     *
     * Unlike [stop], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stop(): JsonField<String> = body._stop()

    /**
     * Returns the raw JSON value of [targetLegs].
     *
     * Unlike [targetLegs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _targetLegs(): JsonField<String> = body._targetLegs()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ActionStartPlaybackParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ActionStartPlaybackParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionStartPlaybackParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionStartPlaybackParams: ActionStartPlaybackParams) = apply {
            callControlId = actionStartPlaybackParams.callControlId
            body = actionStartPlaybackParams.body.toBuilder()
            additionalHeaders = actionStartPlaybackParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionStartPlaybackParams.additionalQueryParams.toBuilder()
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
         * - [audioType]
         * - [audioUrl]
         * - [cacheAudio]
         * - [clientState]
         * - [commandId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Specifies the type of audio provided in `audio_url` or `playback_content`. */
        fun audioType(audioType: AudioType) = apply { body.audioType(audioType) }

        /**
         * Sets [Builder.audioType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioType] with a well-typed [AudioType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun audioType(audioType: JsonField<AudioType>) = apply { body.audioType(audioType) }

        /**
         * The URL of a file to be played back on the call. The URL can point to either a WAV or MP3
         * file. media_name and audio_url cannot be used together in one request.
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
         * Caches the audio file. Useful when playing the same audio file multiple times during the
         * call.
         */
        fun cacheAudio(cacheAudio: Boolean) = apply { body.cacheAudio(cacheAudio) }

        /**
         * Sets [Builder.cacheAudio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cacheAudio] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cacheAudio(cacheAudio: JsonField<Boolean>) = apply { body.cacheAudio(cacheAudio) }

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
         * The number of times the audio file should be played. If supplied, the value must be an
         * integer between 1 and 100, or the special string `infinity` for an endless loop.
         */
        fun loop(loop: Loopcount) = apply { body.loop(loop) }

        /**
         * Sets [Builder.loop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loop] with a well-typed [Loopcount] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun loop(loop: JsonField<Loopcount>) = apply { body.loop(loop) }

        /** Alias for calling [loop] with `Loopcount.ofLoopcountString(loopcountString)`. */
        fun loop(loopcountString: String) = apply { body.loop(loopcountString) }

        /** Alias for calling [loop] with `Loopcount.ofInteger(integer)`. */
        fun loop(integer: Long) = apply { body.loop(integer) }

        /**
         * The media_name of a file to be played back on the call. The media_name must point to a
         * file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The
         * file must either be a WAV or MP3 file.
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
         * When enabled, audio will be mixed on top of any other audio that is actively being played
         * back. Note that `overlay: true` will only work if there is another audio file already
         * being played on the call.
         */
        fun overlay(overlay: Boolean) = apply { body.overlay(overlay) }

        /**
         * Sets [Builder.overlay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overlay] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun overlay(overlay: JsonField<Boolean>) = apply { body.overlay(overlay) }

        /**
         * Allows a user to provide base64 encoded mp3 or wav. Note: when using this parameter,
         * `media_url` and `media_name` in the `playback_started` and `playback_ended` webhooks will
         * be empty
         */
        fun playbackContent(playbackContent: String) = apply {
            body.playbackContent(playbackContent)
        }

        /**
         * Sets [Builder.playbackContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playbackContent] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun playbackContent(playbackContent: JsonField<String>) = apply {
            body.playbackContent(playbackContent)
        }

        /**
         * When specified, it stops the current audio being played. Specify `current` to stop the
         * current audio being played, and to play the next file in the queue. Specify `all` to stop
         * the current audio file being played and to also clear all audio files from the queue.
         */
        fun stop(stop: String) = apply { body.stop(stop) }

        /**
         * Sets [Builder.stop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stop] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stop(stop: JsonField<String>) = apply { body.stop(stop) }

        /**
         * Specifies the leg or legs on which audio will be played. If supplied, the value must be
         * either `self`, `opposite` or `both`.
         */
        fun targetLegs(targetLegs: String) = apply { body.targetLegs(targetLegs) }

        /**
         * Sets [Builder.targetLegs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetLegs] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetLegs(targetLegs: JsonField<String>) = apply { body.targetLegs(targetLegs) }

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
         * Returns an immutable instance of [ActionStartPlaybackParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionStartPlaybackParams =
            ActionStartPlaybackParams(
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
        private val audioType: JsonField<AudioType>,
        private val audioUrl: JsonField<String>,
        private val cacheAudio: JsonField<Boolean>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val loop: JsonField<Loopcount>,
        private val mediaName: JsonField<String>,
        private val overlay: JsonField<Boolean>,
        private val playbackContent: JsonField<String>,
        private val stop: JsonField<String>,
        private val targetLegs: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("audio_type")
            @ExcludeMissing
            audioType: JsonField<AudioType> = JsonMissing.of(),
            @JsonProperty("audio_url")
            @ExcludeMissing
            audioUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cache_audio")
            @ExcludeMissing
            cacheAudio: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("loop") @ExcludeMissing loop: JsonField<Loopcount> = JsonMissing.of(),
            @JsonProperty("media_name")
            @ExcludeMissing
            mediaName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("overlay") @ExcludeMissing overlay: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("playback_content")
            @ExcludeMissing
            playbackContent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stop") @ExcludeMissing stop: JsonField<String> = JsonMissing.of(),
            @JsonProperty("target_legs")
            @ExcludeMissing
            targetLegs: JsonField<String> = JsonMissing.of(),
        ) : this(
            audioType,
            audioUrl,
            cacheAudio,
            clientState,
            commandId,
            loop,
            mediaName,
            overlay,
            playbackContent,
            stop,
            targetLegs,
            mutableMapOf(),
        )

        /**
         * Specifies the type of audio provided in `audio_url` or `playback_content`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audioType(): Optional<AudioType> = audioType.getOptional("audio_type")

        /**
         * The URL of a file to be played back on the call. The URL can point to either a WAV or MP3
         * file. media_name and audio_url cannot be used together in one request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audioUrl(): Optional<String> = audioUrl.getOptional("audio_url")

        /**
         * Caches the audio file. Useful when playing the same audio file multiple times during the
         * call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cacheAudio(): Optional<Boolean> = cacheAudio.getOptional("cache_audio")

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
         * The number of times the audio file should be played. If supplied, the value must be an
         * integer between 1 and 100, or the special string `infinity` for an endless loop.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun loop(): Optional<Loopcount> = loop.getOptional("loop")

        /**
         * The media_name of a file to be played back on the call. The media_name must point to a
         * file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The
         * file must either be a WAV or MP3 file.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaName(): Optional<String> = mediaName.getOptional("media_name")

        /**
         * When enabled, audio will be mixed on top of any other audio that is actively being played
         * back. Note that `overlay: true` will only work if there is another audio file already
         * being played on the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun overlay(): Optional<Boolean> = overlay.getOptional("overlay")

        /**
         * Allows a user to provide base64 encoded mp3 or wav. Note: when using this parameter,
         * `media_url` and `media_name` in the `playback_started` and `playback_ended` webhooks will
         * be empty
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun playbackContent(): Optional<String> = playbackContent.getOptional("playback_content")

        /**
         * When specified, it stops the current audio being played. Specify `current` to stop the
         * current audio being played, and to play the next file in the queue. Specify `all` to stop
         * the current audio file being played and to also clear all audio files from the queue.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stop(): Optional<String> = stop.getOptional("stop")

        /**
         * Specifies the leg or legs on which audio will be played. If supplied, the value must be
         * either `self`, `opposite` or `both`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun targetLegs(): Optional<String> = targetLegs.getOptional("target_legs")

        /**
         * Returns the raw JSON value of [audioType].
         *
         * Unlike [audioType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audio_type")
        @ExcludeMissing
        fun _audioType(): JsonField<AudioType> = audioType

        /**
         * Returns the raw JSON value of [audioUrl].
         *
         * Unlike [audioUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audio_url") @ExcludeMissing fun _audioUrl(): JsonField<String> = audioUrl

        /**
         * Returns the raw JSON value of [cacheAudio].
         *
         * Unlike [cacheAudio], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cache_audio")
        @ExcludeMissing
        fun _cacheAudio(): JsonField<Boolean> = cacheAudio

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
         * Returns the raw JSON value of [loop].
         *
         * Unlike [loop], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("loop") @ExcludeMissing fun _loop(): JsonField<Loopcount> = loop

        /**
         * Returns the raw JSON value of [mediaName].
         *
         * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("media_name") @ExcludeMissing fun _mediaName(): JsonField<String> = mediaName

        /**
         * Returns the raw JSON value of [overlay].
         *
         * Unlike [overlay], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("overlay") @ExcludeMissing fun _overlay(): JsonField<Boolean> = overlay

        /**
         * Returns the raw JSON value of [playbackContent].
         *
         * Unlike [playbackContent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("playback_content")
        @ExcludeMissing
        fun _playbackContent(): JsonField<String> = playbackContent

        /**
         * Returns the raw JSON value of [stop].
         *
         * Unlike [stop], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stop") @ExcludeMissing fun _stop(): JsonField<String> = stop

        /**
         * Returns the raw JSON value of [targetLegs].
         *
         * Unlike [targetLegs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target_legs")
        @ExcludeMissing
        fun _targetLegs(): JsonField<String> = targetLegs

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

            private var audioType: JsonField<AudioType> = JsonMissing.of()
            private var audioUrl: JsonField<String> = JsonMissing.of()
            private var cacheAudio: JsonField<Boolean> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<Loopcount> = JsonMissing.of()
            private var mediaName: JsonField<String> = JsonMissing.of()
            private var overlay: JsonField<Boolean> = JsonMissing.of()
            private var playbackContent: JsonField<String> = JsonMissing.of()
            private var stop: JsonField<String> = JsonMissing.of()
            private var targetLegs: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                audioType = body.audioType
                audioUrl = body.audioUrl
                cacheAudio = body.cacheAudio
                clientState = body.clientState
                commandId = body.commandId
                loop = body.loop
                mediaName = body.mediaName
                overlay = body.overlay
                playbackContent = body.playbackContent
                stop = body.stop
                targetLegs = body.targetLegs
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Specifies the type of audio provided in `audio_url` or `playback_content`. */
            fun audioType(audioType: AudioType) = audioType(JsonField.of(audioType))

            /**
             * Sets [Builder.audioType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audioType] with a well-typed [AudioType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audioType(audioType: JsonField<AudioType>) = apply { this.audioType = audioType }

            /**
             * The URL of a file to be played back on the call. The URL can point to either a WAV or
             * MP3 file. media_name and audio_url cannot be used together in one request.
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
             * Caches the audio file. Useful when playing the same audio file multiple times during
             * the call.
             */
            fun cacheAudio(cacheAudio: Boolean) = cacheAudio(JsonField.of(cacheAudio))

            /**
             * Sets [Builder.cacheAudio] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheAudio] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cacheAudio(cacheAudio: JsonField<Boolean>) = apply { this.cacheAudio = cacheAudio }

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
             * The number of times the audio file should be played. If supplied, the value must be
             * an integer between 1 and 100, or the special string `infinity` for an endless loop.
             */
            fun loop(loop: Loopcount) = loop(JsonField.of(loop))

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [Loopcount] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loop(loop: JsonField<Loopcount>) = apply { this.loop = loop }

            /** Alias for calling [loop] with `Loopcount.ofLoopcountString(loopcountString)`. */
            fun loop(loopcountString: String) = loop(Loopcount.ofLoopcountString(loopcountString))

            /** Alias for calling [loop] with `Loopcount.ofInteger(integer)`. */
            fun loop(integer: Long) = loop(Loopcount.ofInteger(integer))

            /**
             * The media_name of a file to be played back on the call. The media_name must point to
             * a file previously uploaded to api.telnyx.com/v2/media by the same user/organization.
             * The file must either be a WAV or MP3 file.
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
             * When enabled, audio will be mixed on top of any other audio that is actively being
             * played back. Note that `overlay: true` will only work if there is another audio file
             * already being played on the call.
             */
            fun overlay(overlay: Boolean) = overlay(JsonField.of(overlay))

            /**
             * Sets [Builder.overlay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overlay] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overlay(overlay: JsonField<Boolean>) = apply { this.overlay = overlay }

            /**
             * Allows a user to provide base64 encoded mp3 or wav. Note: when using this parameter,
             * `media_url` and `media_name` in the `playback_started` and `playback_ended` webhooks
             * will be empty
             */
            fun playbackContent(playbackContent: String) =
                playbackContent(JsonField.of(playbackContent))

            /**
             * Sets [Builder.playbackContent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.playbackContent] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun playbackContent(playbackContent: JsonField<String>) = apply {
                this.playbackContent = playbackContent
            }

            /**
             * When specified, it stops the current audio being played. Specify `current` to stop
             * the current audio being played, and to play the next file in the queue. Specify `all`
             * to stop the current audio file being played and to also clear all audio files from
             * the queue.
             */
            fun stop(stop: String) = stop(JsonField.of(stop))

            /**
             * Sets [Builder.stop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun stop(stop: JsonField<String>) = apply { this.stop = stop }

            /**
             * Specifies the leg or legs on which audio will be played. If supplied, the value must
             * be either `self`, `opposite` or `both`.
             */
            fun targetLegs(targetLegs: String) = targetLegs(JsonField.of(targetLegs))

            /**
             * Sets [Builder.targetLegs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetLegs] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetLegs(targetLegs: JsonField<String>) = apply { this.targetLegs = targetLegs }

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
                    audioType,
                    audioUrl,
                    cacheAudio,
                    clientState,
                    commandId,
                    loop,
                    mediaName,
                    overlay,
                    playbackContent,
                    stop,
                    targetLegs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            audioType().ifPresent { it.validate() }
            audioUrl()
            cacheAudio()
            clientState()
            commandId()
            loop().ifPresent { it.validate() }
            mediaName()
            overlay()
            playbackContent()
            stop()
            targetLegs()
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
            (audioType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (audioUrl.asKnown().isPresent) 1 else 0) +
                (if (cacheAudio.asKnown().isPresent) 1 else 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (loop.asKnown().getOrNull()?.validity() ?: 0) +
                (if (mediaName.asKnown().isPresent) 1 else 0) +
                (if (overlay.asKnown().isPresent) 1 else 0) +
                (if (playbackContent.asKnown().isPresent) 1 else 0) +
                (if (stop.asKnown().isPresent) 1 else 0) +
                (if (targetLegs.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                audioType == other.audioType &&
                audioUrl == other.audioUrl &&
                cacheAudio == other.cacheAudio &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                loop == other.loop &&
                mediaName == other.mediaName &&
                overlay == other.overlay &&
                playbackContent == other.playbackContent &&
                stop == other.stop &&
                targetLegs == other.targetLegs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                audioType,
                audioUrl,
                cacheAudio,
                clientState,
                commandId,
                loop,
                mediaName,
                overlay,
                playbackContent,
                stop,
                targetLegs,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{audioType=$audioType, audioUrl=$audioUrl, cacheAudio=$cacheAudio, clientState=$clientState, commandId=$commandId, loop=$loop, mediaName=$mediaName, overlay=$overlay, playbackContent=$playbackContent, stop=$stop, targetLegs=$targetLegs, additionalProperties=$additionalProperties}"
    }

    /** Specifies the type of audio provided in `audio_url` or `playback_content`. */
    class AudioType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MP3 = of("mp3")

            @JvmField val WAV = of("wav")

            @JvmStatic fun of(value: String) = AudioType(JsonField.of(value))
        }

        /** An enum containing [AudioType]'s known values. */
        enum class Known {
            MP3,
            WAV,
        }

        /**
         * An enum containing [AudioType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AudioType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MP3,
            WAV,
            /**
             * An enum member indicating that [AudioType] was instantiated with an unknown value.
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
                MP3 -> Value.MP3
                WAV -> Value.WAV
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
                MP3 -> Known.MP3
                WAV -> Known.WAV
                else -> throw TelnyxInvalidDataException("Unknown AudioType: $value")
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

        fun validate(): AudioType = apply {
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

            return other is AudioType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionStartPlaybackParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionStartPlaybackParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
