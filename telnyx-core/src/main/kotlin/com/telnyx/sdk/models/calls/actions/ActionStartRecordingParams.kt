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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Start recording the call. Recording will stop on call hang-up, or can be initiated via the Stop
 * Recording command.
 *
 * **Expected Webhooks:**
 * - `call.recording.saved`
 * - `call.recording.transcription.saved`
 * - `call.recording.error`
 */
class ActionStartRecordingParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    /**
     * When `dual`, final audio file will be stereo recorded with the first leg on channel A, and
     * the rest on channel B.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channels(): Channels = body.channels()

    /**
     * The audio file format used when storing the call recording. Can be either `mp3` or `wav`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun format(): Format = body.format()

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
     * The custom recording file name to be used instead of the default `call_leg_id`. Telnyx will
     * still add a Unix timestamp suffix.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFileName(): Optional<String> = body.customFileName()

    /**
     * Defines the maximum length for the recording in seconds. The minimum value is 0. The maximum
     * value is 14400. The default value is 0 (infinite)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxLength(): Optional<Int> = body.maxLength()

    /**
     * If enabled, a beep sound will be played at the start of a recording.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun playBeep(): Optional<Boolean> = body.playBeep()

    /**
     * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If only single
     * track is specified (`inbound`, `outbound`), `channels` configuration is ignored and it will
     * be recorded as mono (single channel).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingTrack(): Optional<RecordingTrack> = body.recordingTrack()

    /**
     * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
     * detected. The timer only starts when the speech is detected. Please note that call
     * transcription is used to detect silence and the related charge will be applied. The minimum
     * value is 0. The default value is 0 (infinite)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutSecs(): Optional<Int> = body.timeoutSecs()

    /**
     * Enable post recording transcription. The default value is false.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcription(): Optional<Boolean> = body.transcription()

    /**
     * Engine to use for speech recognition. `A` - `Google`, `B` - `Telnyx`, `deepgram/nova-3` -
     * `Deepgram Nova-3`. Note: `deepgram/nova-3` supports only `en` and `en-{Region}` languages.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionEngine(): Optional<TranscriptionEngine> = body.transcriptionEngine()

    /**
     * Language code for transcription. Note: Not all languages are supported by all transcription
     * engines (google, telnyx, deepgram). See engine-specific documentation for supported values.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionLanguage(): Optional<TranscriptionLanguage> = body.transcriptionLanguage()

    /**
     * Defines maximum number of speakers in the conversation. Applies to `google` engine only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionMaxSpeakerCount(): Optional<Int> = body.transcriptionMaxSpeakerCount()

    /**
     * Defines minimum number of speakers in the conversation. Applies to `google` engine only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionMinSpeakerCount(): Optional<Int> = body.transcriptionMinSpeakerCount()

    /**
     * Enables profanity_filter. Applies to `google` engine only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionProfanityFilter(): Optional<Boolean> = body.transcriptionProfanityFilter()

    /**
     * Enables speaker diarization. Applies to `google` engine only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionSpeakerDiarization(): Optional<Boolean> =
        body.transcriptionSpeakerDiarization()

    /**
     * When set to `trim-silence`, silence will be removed from the beginning and end of the
     * recording.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trim(): Optional<Trim> = body.trim()

    /**
     * Returns the raw JSON value of [channels].
     *
     * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _channels(): JsonField<Channels> = body._channels()

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _format(): JsonField<Format> = body._format()

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
     * Returns the raw JSON value of [customFileName].
     *
     * Unlike [customFileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFileName(): JsonField<String> = body._customFileName()

    /**
     * Returns the raw JSON value of [maxLength].
     *
     * Unlike [maxLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxLength(): JsonField<Int> = body._maxLength()

    /**
     * Returns the raw JSON value of [playBeep].
     *
     * Unlike [playBeep], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _playBeep(): JsonField<Boolean> = body._playBeep()

    /**
     * Returns the raw JSON value of [recordingTrack].
     *
     * Unlike [recordingTrack], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordingTrack(): JsonField<RecordingTrack> = body._recordingTrack()

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
     * Returns the raw JSON value of [transcriptionEngine].
     *
     * Unlike [transcriptionEngine], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _transcriptionEngine(): JsonField<TranscriptionEngine> = body._transcriptionEngine()

    /**
     * Returns the raw JSON value of [transcriptionLanguage].
     *
     * Unlike [transcriptionLanguage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _transcriptionLanguage(): JsonField<TranscriptionLanguage> = body._transcriptionLanguage()

    /**
     * Returns the raw JSON value of [transcriptionMaxSpeakerCount].
     *
     * Unlike [transcriptionMaxSpeakerCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _transcriptionMaxSpeakerCount(): JsonField<Int> = body._transcriptionMaxSpeakerCount()

    /**
     * Returns the raw JSON value of [transcriptionMinSpeakerCount].
     *
     * Unlike [transcriptionMinSpeakerCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _transcriptionMinSpeakerCount(): JsonField<Int> = body._transcriptionMinSpeakerCount()

    /**
     * Returns the raw JSON value of [transcriptionProfanityFilter].
     *
     * Unlike [transcriptionProfanityFilter], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _transcriptionProfanityFilter(): JsonField<Boolean> = body._transcriptionProfanityFilter()

    /**
     * Returns the raw JSON value of [transcriptionSpeakerDiarization].
     *
     * Unlike [transcriptionSpeakerDiarization], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _transcriptionSpeakerDiarization(): JsonField<Boolean> =
        body._transcriptionSpeakerDiarization()

    /**
     * Returns the raw JSON value of [trim].
     *
     * Unlike [trim], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trim(): JsonField<Trim> = body._trim()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionStartRecordingParams].
         *
         * The following fields are required:
         * ```java
         * .channels()
         * .format()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionStartRecordingParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionStartRecordingParams: ActionStartRecordingParams) = apply {
            callControlId = actionStartRecordingParams.callControlId
            body = actionStartRecordingParams.body.toBuilder()
            additionalHeaders = actionStartRecordingParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionStartRecordingParams.additionalQueryParams.toBuilder()
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
         * - [channels]
         * - [format]
         * - [clientState]
         * - [commandId]
         * - [customFileName]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * When `dual`, final audio file will be stereo recorded with the first leg on channel A,
         * and the rest on channel B.
         */
        fun channels(channels: Channels) = apply { body.channels(channels) }

        /**
         * Sets [Builder.channels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channels] with a well-typed [Channels] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun channels(channels: JsonField<Channels>) = apply { body.channels(channels) }

        /**
         * The audio file format used when storing the call recording. Can be either `mp3` or `wav`.
         */
        fun format(format: Format) = apply { body.format(format) }

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed [Format] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun format(format: JsonField<Format>) = apply { body.format(format) }

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
         * The custom recording file name to be used instead of the default `call_leg_id`. Telnyx
         * will still add a Unix timestamp suffix.
         */
        fun customFileName(customFileName: String) = apply { body.customFileName(customFileName) }

        /**
         * Sets [Builder.customFileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFileName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFileName(customFileName: JsonField<String>) = apply {
            body.customFileName(customFileName)
        }

        /**
         * Defines the maximum length for the recording in seconds. The minimum value is 0. The
         * maximum value is 14400. The default value is 0 (infinite)
         */
        fun maxLength(maxLength: Int) = apply { body.maxLength(maxLength) }

        /**
         * Sets [Builder.maxLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxLength] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxLength(maxLength: JsonField<Int>) = apply { body.maxLength(maxLength) }

        /** If enabled, a beep sound will be played at the start of a recording. */
        fun playBeep(playBeep: Boolean) = apply { body.playBeep(playBeep) }

        /**
         * Sets [Builder.playBeep] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playBeep] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun playBeep(playBeep: JsonField<Boolean>) = apply { body.playBeep(playBeep) }

        /**
         * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If only
         * single track is specified (`inbound`, `outbound`), `channels` configuration is ignored
         * and it will be recorded as mono (single channel).
         */
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

        /**
         * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
         * detected. The timer only starts when the speech is detected. Please note that call
         * transcription is used to detect silence and the related charge will be applied. The
         * minimum value is 0. The default value is 0 (infinite)
         */
        fun timeoutSecs(timeoutSecs: Int) = apply { body.timeoutSecs(timeoutSecs) }

        /**
         * Sets [Builder.timeoutSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutSecs] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeoutSecs(timeoutSecs: JsonField<Int>) = apply { body.timeoutSecs(timeoutSecs) }

        /** Enable post recording transcription. The default value is false. */
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

        /**
         * Engine to use for speech recognition. `A` - `Google`, `B` - `Telnyx`, `deepgram/nova-3` -
         * `Deepgram Nova-3`. Note: `deepgram/nova-3` supports only `en` and `en-{Region}`
         * languages.
         */
        fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) = apply {
            body.transcriptionEngine(transcriptionEngine)
        }

        /**
         * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionEngine] with a well-typed
         * [TranscriptionEngine] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) = apply {
            body.transcriptionEngine(transcriptionEngine)
        }

        /**
         * Language code for transcription. Note: Not all languages are supported by all
         * transcription engines (google, telnyx, deepgram). See engine-specific documentation for
         * supported values.
         */
        fun transcriptionLanguage(transcriptionLanguage: TranscriptionLanguage) = apply {
            body.transcriptionLanguage(transcriptionLanguage)
        }

        /**
         * Sets [Builder.transcriptionLanguage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionLanguage] with a well-typed
         * [TranscriptionLanguage] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun transcriptionLanguage(transcriptionLanguage: JsonField<TranscriptionLanguage>) = apply {
            body.transcriptionLanguage(transcriptionLanguage)
        }

        /**
         * Defines maximum number of speakers in the conversation. Applies to `google` engine only.
         */
        fun transcriptionMaxSpeakerCount(transcriptionMaxSpeakerCount: Int) = apply {
            body.transcriptionMaxSpeakerCount(transcriptionMaxSpeakerCount)
        }

        /**
         * Sets [Builder.transcriptionMaxSpeakerCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionMaxSpeakerCount] with a well-typed [Int]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transcriptionMaxSpeakerCount(transcriptionMaxSpeakerCount: JsonField<Int>) = apply {
            body.transcriptionMaxSpeakerCount(transcriptionMaxSpeakerCount)
        }

        /**
         * Defines minimum number of speakers in the conversation. Applies to `google` engine only.
         */
        fun transcriptionMinSpeakerCount(transcriptionMinSpeakerCount: Int) = apply {
            body.transcriptionMinSpeakerCount(transcriptionMinSpeakerCount)
        }

        /**
         * Sets [Builder.transcriptionMinSpeakerCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionMinSpeakerCount] with a well-typed [Int]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transcriptionMinSpeakerCount(transcriptionMinSpeakerCount: JsonField<Int>) = apply {
            body.transcriptionMinSpeakerCount(transcriptionMinSpeakerCount)
        }

        /** Enables profanity_filter. Applies to `google` engine only. */
        fun transcriptionProfanityFilter(transcriptionProfanityFilter: Boolean) = apply {
            body.transcriptionProfanityFilter(transcriptionProfanityFilter)
        }

        /**
         * Sets [Builder.transcriptionProfanityFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionProfanityFilter] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun transcriptionProfanityFilter(transcriptionProfanityFilter: JsonField<Boolean>) = apply {
            body.transcriptionProfanityFilter(transcriptionProfanityFilter)
        }

        /** Enables speaker diarization. Applies to `google` engine only. */
        fun transcriptionSpeakerDiarization(transcriptionSpeakerDiarization: Boolean) = apply {
            body.transcriptionSpeakerDiarization(transcriptionSpeakerDiarization)
        }

        /**
         * Sets [Builder.transcriptionSpeakerDiarization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionSpeakerDiarization] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun transcriptionSpeakerDiarization(transcriptionSpeakerDiarization: JsonField<Boolean>) =
            apply {
                body.transcriptionSpeakerDiarization(transcriptionSpeakerDiarization)
            }

        /**
         * When set to `trim-silence`, silence will be removed from the beginning and end of the
         * recording.
         */
        fun trim(trim: Trim) = apply { body.trim(trim) }

        /**
         * Sets [Builder.trim] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trim] with a well-typed [Trim] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trim(trim: JsonField<Trim>) = apply { body.trim(trim) }

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
         * Returns an immutable instance of [ActionStartRecordingParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .channels()
         * .format()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionStartRecordingParams =
            ActionStartRecordingParams(
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
        private val channels: JsonField<Channels>,
        private val format: JsonField<Format>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val customFileName: JsonField<String>,
        private val maxLength: JsonField<Int>,
        private val playBeep: JsonField<Boolean>,
        private val recordingTrack: JsonField<RecordingTrack>,
        private val timeoutSecs: JsonField<Int>,
        private val transcription: JsonField<Boolean>,
        private val transcriptionEngine: JsonField<TranscriptionEngine>,
        private val transcriptionLanguage: JsonField<TranscriptionLanguage>,
        private val transcriptionMaxSpeakerCount: JsonField<Int>,
        private val transcriptionMinSpeakerCount: JsonField<Int>,
        private val transcriptionProfanityFilter: JsonField<Boolean>,
        private val transcriptionSpeakerDiarization: JsonField<Boolean>,
        private val trim: JsonField<Trim>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("channels")
            @ExcludeMissing
            channels: JsonField<Channels> = JsonMissing.of(),
            @JsonProperty("format") @ExcludeMissing format: JsonField<Format> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_file_name")
            @ExcludeMissing
            customFileName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_length")
            @ExcludeMissing
            maxLength: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("play_beep")
            @ExcludeMissing
            playBeep: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("recording_track")
            @ExcludeMissing
            recordingTrack: JsonField<RecordingTrack> = JsonMissing.of(),
            @JsonProperty("timeout_secs")
            @ExcludeMissing
            timeoutSecs: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("transcription")
            @ExcludeMissing
            transcription: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("transcription_engine")
            @ExcludeMissing
            transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
            @JsonProperty("transcription_language")
            @ExcludeMissing
            transcriptionLanguage: JsonField<TranscriptionLanguage> = JsonMissing.of(),
            @JsonProperty("transcription_max_speaker_count")
            @ExcludeMissing
            transcriptionMaxSpeakerCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("transcription_min_speaker_count")
            @ExcludeMissing
            transcriptionMinSpeakerCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("transcription_profanity_filter")
            @ExcludeMissing
            transcriptionProfanityFilter: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("transcription_speaker_diarization")
            @ExcludeMissing
            transcriptionSpeakerDiarization: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("trim") @ExcludeMissing trim: JsonField<Trim> = JsonMissing.of(),
        ) : this(
            channels,
            format,
            clientState,
            commandId,
            customFileName,
            maxLength,
            playBeep,
            recordingTrack,
            timeoutSecs,
            transcription,
            transcriptionEngine,
            transcriptionLanguage,
            transcriptionMaxSpeakerCount,
            transcriptionMinSpeakerCount,
            transcriptionProfanityFilter,
            transcriptionSpeakerDiarization,
            trim,
            mutableMapOf(),
        )

        /**
         * When `dual`, final audio file will be stereo recorded with the first leg on channel A,
         * and the rest on channel B.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun channels(): Channels = channels.getRequired("channels")

        /**
         * The audio file format used when storing the call recording. Can be either `mp3` or `wav`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun format(): Format = format.getRequired("format")

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
         * The custom recording file name to be used instead of the default `call_leg_id`. Telnyx
         * will still add a Unix timestamp suffix.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customFileName(): Optional<String> = customFileName.getOptional("custom_file_name")

        /**
         * Defines the maximum length for the recording in seconds. The minimum value is 0. The
         * maximum value is 14400. The default value is 0 (infinite)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxLength(): Optional<Int> = maxLength.getOptional("max_length")

        /**
         * If enabled, a beep sound will be played at the start of a recording.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun playBeep(): Optional<Boolean> = playBeep.getOptional("play_beep")

        /**
         * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If only
         * single track is specified (`inbound`, `outbound`), `channels` configuration is ignored
         * and it will be recorded as mono (single channel).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingTrack(): Optional<RecordingTrack> =
            recordingTrack.getOptional("recording_track")

        /**
         * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
         * detected. The timer only starts when the speech is detected. Please note that call
         * transcription is used to detect silence and the related charge will be applied. The
         * minimum value is 0. The default value is 0 (infinite)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeoutSecs(): Optional<Int> = timeoutSecs.getOptional("timeout_secs")

        /**
         * Enable post recording transcription. The default value is false.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcription(): Optional<Boolean> = transcription.getOptional("transcription")

        /**
         * Engine to use for speech recognition. `A` - `Google`, `B` - `Telnyx`, `deepgram/nova-3` -
         * `Deepgram Nova-3`. Note: `deepgram/nova-3` supports only `en` and `en-{Region}`
         * languages.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcriptionEngine(): Optional<TranscriptionEngine> =
            transcriptionEngine.getOptional("transcription_engine")

        /**
         * Language code for transcription. Note: Not all languages are supported by all
         * transcription engines (google, telnyx, deepgram). See engine-specific documentation for
         * supported values.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcriptionLanguage(): Optional<TranscriptionLanguage> =
            transcriptionLanguage.getOptional("transcription_language")

        /**
         * Defines maximum number of speakers in the conversation. Applies to `google` engine only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcriptionMaxSpeakerCount(): Optional<Int> =
            transcriptionMaxSpeakerCount.getOptional("transcription_max_speaker_count")

        /**
         * Defines minimum number of speakers in the conversation. Applies to `google` engine only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcriptionMinSpeakerCount(): Optional<Int> =
            transcriptionMinSpeakerCount.getOptional("transcription_min_speaker_count")

        /**
         * Enables profanity_filter. Applies to `google` engine only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcriptionProfanityFilter(): Optional<Boolean> =
            transcriptionProfanityFilter.getOptional("transcription_profanity_filter")

        /**
         * Enables speaker diarization. Applies to `google` engine only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcriptionSpeakerDiarization(): Optional<Boolean> =
            transcriptionSpeakerDiarization.getOptional("transcription_speaker_diarization")

        /**
         * When set to `trim-silence`, silence will be removed from the beginning and end of the
         * recording.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trim(): Optional<Trim> = trim.getOptional("trim")

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels") @ExcludeMissing fun _channels(): JsonField<Channels> = channels

        /**
         * Returns the raw JSON value of [format].
         *
         * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<Format> = format

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
         * Returns the raw JSON value of [customFileName].
         *
         * Unlike [customFileName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_file_name")
        @ExcludeMissing
        fun _customFileName(): JsonField<String> = customFileName

        /**
         * Returns the raw JSON value of [maxLength].
         *
         * Unlike [maxLength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_length") @ExcludeMissing fun _maxLength(): JsonField<Int> = maxLength

        /**
         * Returns the raw JSON value of [playBeep].
         *
         * Unlike [playBeep], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("play_beep") @ExcludeMissing fun _playBeep(): JsonField<Boolean> = playBeep

        /**
         * Returns the raw JSON value of [recordingTrack].
         *
         * Unlike [recordingTrack], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recording_track")
        @ExcludeMissing
        fun _recordingTrack(): JsonField<RecordingTrack> = recordingTrack

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
         * Returns the raw JSON value of [transcriptionEngine].
         *
         * Unlike [transcriptionEngine], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transcription_engine")
        @ExcludeMissing
        fun _transcriptionEngine(): JsonField<TranscriptionEngine> = transcriptionEngine

        /**
         * Returns the raw JSON value of [transcriptionLanguage].
         *
         * Unlike [transcriptionLanguage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transcription_language")
        @ExcludeMissing
        fun _transcriptionLanguage(): JsonField<TranscriptionLanguage> = transcriptionLanguage

        /**
         * Returns the raw JSON value of [transcriptionMaxSpeakerCount].
         *
         * Unlike [transcriptionMaxSpeakerCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transcription_max_speaker_count")
        @ExcludeMissing
        fun _transcriptionMaxSpeakerCount(): JsonField<Int> = transcriptionMaxSpeakerCount

        /**
         * Returns the raw JSON value of [transcriptionMinSpeakerCount].
         *
         * Unlike [transcriptionMinSpeakerCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transcription_min_speaker_count")
        @ExcludeMissing
        fun _transcriptionMinSpeakerCount(): JsonField<Int> = transcriptionMinSpeakerCount

        /**
         * Returns the raw JSON value of [transcriptionProfanityFilter].
         *
         * Unlike [transcriptionProfanityFilter], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transcription_profanity_filter")
        @ExcludeMissing
        fun _transcriptionProfanityFilter(): JsonField<Boolean> = transcriptionProfanityFilter

        /**
         * Returns the raw JSON value of [transcriptionSpeakerDiarization].
         *
         * Unlike [transcriptionSpeakerDiarization], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("transcription_speaker_diarization")
        @ExcludeMissing
        fun _transcriptionSpeakerDiarization(): JsonField<Boolean> = transcriptionSpeakerDiarization

        /**
         * Returns the raw JSON value of [trim].
         *
         * Unlike [trim], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trim") @ExcludeMissing fun _trim(): JsonField<Trim> = trim

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
             * .channels()
             * .format()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var channels: JsonField<Channels>? = null
            private var format: JsonField<Format>? = null
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var customFileName: JsonField<String> = JsonMissing.of()
            private var maxLength: JsonField<Int> = JsonMissing.of()
            private var playBeep: JsonField<Boolean> = JsonMissing.of()
            private var recordingTrack: JsonField<RecordingTrack> = JsonMissing.of()
            private var timeoutSecs: JsonField<Int> = JsonMissing.of()
            private var transcription: JsonField<Boolean> = JsonMissing.of()
            private var transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of()
            private var transcriptionLanguage: JsonField<TranscriptionLanguage> = JsonMissing.of()
            private var transcriptionMaxSpeakerCount: JsonField<Int> = JsonMissing.of()
            private var transcriptionMinSpeakerCount: JsonField<Int> = JsonMissing.of()
            private var transcriptionProfanityFilter: JsonField<Boolean> = JsonMissing.of()
            private var transcriptionSpeakerDiarization: JsonField<Boolean> = JsonMissing.of()
            private var trim: JsonField<Trim> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                channels = body.channels
                format = body.format
                clientState = body.clientState
                commandId = body.commandId
                customFileName = body.customFileName
                maxLength = body.maxLength
                playBeep = body.playBeep
                recordingTrack = body.recordingTrack
                timeoutSecs = body.timeoutSecs
                transcription = body.transcription
                transcriptionEngine = body.transcriptionEngine
                transcriptionLanguage = body.transcriptionLanguage
                transcriptionMaxSpeakerCount = body.transcriptionMaxSpeakerCount
                transcriptionMinSpeakerCount = body.transcriptionMinSpeakerCount
                transcriptionProfanityFilter = body.transcriptionProfanityFilter
                transcriptionSpeakerDiarization = body.transcriptionSpeakerDiarization
                trim = body.trim
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * When `dual`, final audio file will be stereo recorded with the first leg on channel
             * A, and the rest on channel B.
             */
            fun channels(channels: Channels) = channels(JsonField.of(channels))

            /**
             * Sets [Builder.channels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channels] with a well-typed [Channels] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channels(channels: JsonField<Channels>) = apply { this.channels = channels }

            /**
             * The audio file format used when storing the call recording. Can be either `mp3` or
             * `wav`.
             */
            fun format(format: Format) = format(JsonField.of(format))

            /**
             * Sets [Builder.format] to an arbitrary JSON value.
             *
             * You should usually call [Builder.format] with a well-typed [Format] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun format(format: JsonField<Format>) = apply { this.format = format }

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
             * The custom recording file name to be used instead of the default `call_leg_id`.
             * Telnyx will still add a Unix timestamp suffix.
             */
            fun customFileName(customFileName: String) =
                customFileName(JsonField.of(customFileName))

            /**
             * Sets [Builder.customFileName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFileName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFileName(customFileName: JsonField<String>) = apply {
                this.customFileName = customFileName
            }

            /**
             * Defines the maximum length for the recording in seconds. The minimum value is 0. The
             * maximum value is 14400. The default value is 0 (infinite)
             */
            fun maxLength(maxLength: Int) = maxLength(JsonField.of(maxLength))

            /**
             * Sets [Builder.maxLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxLength] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxLength(maxLength: JsonField<Int>) = apply { this.maxLength = maxLength }

            /** If enabled, a beep sound will be played at the start of a recording. */
            fun playBeep(playBeep: Boolean) = playBeep(JsonField.of(playBeep))

            /**
             * Sets [Builder.playBeep] to an arbitrary JSON value.
             *
             * You should usually call [Builder.playBeep] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun playBeep(playBeep: JsonField<Boolean>) = apply { this.playBeep = playBeep }

            /**
             * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If
             * only single track is specified (`inbound`, `outbound`), `channels` configuration is
             * ignored and it will be recorded as mono (single channel).
             */
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

            /**
             * The number of seconds that Telnyx will wait for the recording to be stopped if
             * silence is detected. The timer only starts when the speech is detected. Please note
             * that call transcription is used to detect silence and the related charge will be
             * applied. The minimum value is 0. The default value is 0 (infinite)
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

            /** Enable post recording transcription. The default value is false. */
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

            /**
             * Engine to use for speech recognition. `A` - `Google`, `B` - `Telnyx`,
             * `deepgram/nova-3` - `Deepgram Nova-3`. Note: `deepgram/nova-3` supports only `en` and
             * `en-{Region}` languages.
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
             * Language code for transcription. Note: Not all languages are supported by all
             * transcription engines (google, telnyx, deepgram). See engine-specific documentation
             * for supported values.
             */
            fun transcriptionLanguage(transcriptionLanguage: TranscriptionLanguage) =
                transcriptionLanguage(JsonField.of(transcriptionLanguage))

            /**
             * Sets [Builder.transcriptionLanguage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionLanguage] with a well-typed
             * [TranscriptionLanguage] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun transcriptionLanguage(transcriptionLanguage: JsonField<TranscriptionLanguage>) =
                apply {
                    this.transcriptionLanguage = transcriptionLanguage
                }

            /**
             * Defines maximum number of speakers in the conversation. Applies to `google` engine
             * only.
             */
            fun transcriptionMaxSpeakerCount(transcriptionMaxSpeakerCount: Int) =
                transcriptionMaxSpeakerCount(JsonField.of(transcriptionMaxSpeakerCount))

            /**
             * Sets [Builder.transcriptionMaxSpeakerCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionMaxSpeakerCount] with a well-typed
             * [Int] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun transcriptionMaxSpeakerCount(transcriptionMaxSpeakerCount: JsonField<Int>) = apply {
                this.transcriptionMaxSpeakerCount = transcriptionMaxSpeakerCount
            }

            /**
             * Defines minimum number of speakers in the conversation. Applies to `google` engine
             * only.
             */
            fun transcriptionMinSpeakerCount(transcriptionMinSpeakerCount: Int) =
                transcriptionMinSpeakerCount(JsonField.of(transcriptionMinSpeakerCount))

            /**
             * Sets [Builder.transcriptionMinSpeakerCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionMinSpeakerCount] with a well-typed
             * [Int] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun transcriptionMinSpeakerCount(transcriptionMinSpeakerCount: JsonField<Int>) = apply {
                this.transcriptionMinSpeakerCount = transcriptionMinSpeakerCount
            }

            /** Enables profanity_filter. Applies to `google` engine only. */
            fun transcriptionProfanityFilter(transcriptionProfanityFilter: Boolean) =
                transcriptionProfanityFilter(JsonField.of(transcriptionProfanityFilter))

            /**
             * Sets [Builder.transcriptionProfanityFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionProfanityFilter] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun transcriptionProfanityFilter(transcriptionProfanityFilter: JsonField<Boolean>) =
                apply {
                    this.transcriptionProfanityFilter = transcriptionProfanityFilter
                }

            /** Enables speaker diarization. Applies to `google` engine only. */
            fun transcriptionSpeakerDiarization(transcriptionSpeakerDiarization: Boolean) =
                transcriptionSpeakerDiarization(JsonField.of(transcriptionSpeakerDiarization))

            /**
             * Sets [Builder.transcriptionSpeakerDiarization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionSpeakerDiarization] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun transcriptionSpeakerDiarization(
                transcriptionSpeakerDiarization: JsonField<Boolean>
            ) = apply { this.transcriptionSpeakerDiarization = transcriptionSpeakerDiarization }

            /**
             * When set to `trim-silence`, silence will be removed from the beginning and end of the
             * recording.
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
             * .channels()
             * .format()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("channels", channels),
                    checkRequired("format", format),
                    clientState,
                    commandId,
                    customFileName,
                    maxLength,
                    playBeep,
                    recordingTrack,
                    timeoutSecs,
                    transcription,
                    transcriptionEngine,
                    transcriptionLanguage,
                    transcriptionMaxSpeakerCount,
                    transcriptionMinSpeakerCount,
                    transcriptionProfanityFilter,
                    transcriptionSpeakerDiarization,
                    trim,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            channels().validate()
            format().validate()
            clientState()
            commandId()
            customFileName()
            maxLength()
            playBeep()
            recordingTrack().ifPresent { it.validate() }
            timeoutSecs()
            transcription()
            transcriptionEngine().ifPresent { it.validate() }
            transcriptionLanguage().ifPresent { it.validate() }
            transcriptionMaxSpeakerCount()
            transcriptionMinSpeakerCount()
            transcriptionProfanityFilter()
            transcriptionSpeakerDiarization()
            trim().ifPresent { it.validate() }
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
            (channels.asKnown().getOrNull()?.validity() ?: 0) +
                (format.asKnown().getOrNull()?.validity() ?: 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (if (customFileName.asKnown().isPresent) 1 else 0) +
                (if (maxLength.asKnown().isPresent) 1 else 0) +
                (if (playBeep.asKnown().isPresent) 1 else 0) +
                (recordingTrack.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timeoutSecs.asKnown().isPresent) 1 else 0) +
                (if (transcription.asKnown().isPresent) 1 else 0) +
                (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                (transcriptionLanguage.asKnown().getOrNull()?.validity() ?: 0) +
                (if (transcriptionMaxSpeakerCount.asKnown().isPresent) 1 else 0) +
                (if (transcriptionMinSpeakerCount.asKnown().isPresent) 1 else 0) +
                (if (transcriptionProfanityFilter.asKnown().isPresent) 1 else 0) +
                (if (transcriptionSpeakerDiarization.asKnown().isPresent) 1 else 0) +
                (trim.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                channels == other.channels &&
                format == other.format &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                customFileName == other.customFileName &&
                maxLength == other.maxLength &&
                playBeep == other.playBeep &&
                recordingTrack == other.recordingTrack &&
                timeoutSecs == other.timeoutSecs &&
                transcription == other.transcription &&
                transcriptionEngine == other.transcriptionEngine &&
                transcriptionLanguage == other.transcriptionLanguage &&
                transcriptionMaxSpeakerCount == other.transcriptionMaxSpeakerCount &&
                transcriptionMinSpeakerCount == other.transcriptionMinSpeakerCount &&
                transcriptionProfanityFilter == other.transcriptionProfanityFilter &&
                transcriptionSpeakerDiarization == other.transcriptionSpeakerDiarization &&
                trim == other.trim &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                channels,
                format,
                clientState,
                commandId,
                customFileName,
                maxLength,
                playBeep,
                recordingTrack,
                timeoutSecs,
                transcription,
                transcriptionEngine,
                transcriptionLanguage,
                transcriptionMaxSpeakerCount,
                transcriptionMinSpeakerCount,
                transcriptionProfanityFilter,
                transcriptionSpeakerDiarization,
                trim,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{channels=$channels, format=$format, clientState=$clientState, commandId=$commandId, customFileName=$customFileName, maxLength=$maxLength, playBeep=$playBeep, recordingTrack=$recordingTrack, timeoutSecs=$timeoutSecs, transcription=$transcription, transcriptionEngine=$transcriptionEngine, transcriptionLanguage=$transcriptionLanguage, transcriptionMaxSpeakerCount=$transcriptionMaxSpeakerCount, transcriptionMinSpeakerCount=$transcriptionMinSpeakerCount, transcriptionProfanityFilter=$transcriptionProfanityFilter, transcriptionSpeakerDiarization=$transcriptionSpeakerDiarization, trim=$trim, additionalProperties=$additionalProperties}"
    }

    /**
     * When `dual`, final audio file will be stereo recorded with the first leg on channel A, and
     * the rest on channel B.
     */
    class Channels @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = Channels(JsonField.of(value))
        }

        /** An enum containing [Channels]'s known values. */
        enum class Known {
            SINGLE,
            DUAL,
        }

        /**
         * An enum containing [Channels]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Channels] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SINGLE,
            DUAL,
            /** An enum member indicating that [Channels] was instantiated with an unknown value. */
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
                else -> throw TelnyxInvalidDataException("Unknown Channels: $value")
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

        fun validate(): Channels = apply {
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

            return other is Channels && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The audio file format used when storing the call recording. Can be either `mp3` or `wav`. */
    class Format @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = Format(JsonField.of(value))
        }

        /** An enum containing [Format]'s known values. */
        enum class Known {
            WAV,
            MP3,
        }

        /**
         * An enum containing [Format]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Format] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WAV,
            MP3,
            /** An enum member indicating that [Format] was instantiated with an unknown value. */
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
                else -> throw TelnyxInvalidDataException("Unknown Format: $value")
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

        fun validate(): Format = apply {
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

            return other is Format && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If only single
     * track is specified (`inbound`, `outbound`), `channels` configuration is ignored and it will
     * be recorded as mono (single channel).
     */
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

            @JvmField val BOTH = of("both")

            @JvmField val INBOUND = of("inbound")

            @JvmField val OUTBOUND = of("outbound")

            @JvmStatic fun of(value: String) = RecordingTrack(JsonField.of(value))
        }

        /** An enum containing [RecordingTrack]'s known values. */
        enum class Known {
            BOTH,
            INBOUND,
            OUTBOUND,
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
            BOTH,
            INBOUND,
            OUTBOUND,
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

    /**
     * Engine to use for speech recognition. `A` - `Google`, `B` - `Telnyx`, `deepgram/nova-3` -
     * `Deepgram Nova-3`. Note: `deepgram/nova-3` supports only `en` and `en-{Region}` languages.
     */
    class TranscriptionEngine
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

            @JvmField val A = of("A")

            @JvmField val B = of("B")

            @JvmField val DEEPGRAM_NOVA_3 = of("deepgram/nova-3")

            @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
        }

        /** An enum containing [TranscriptionEngine]'s known values. */
        enum class Known {
            A,
            B,
            DEEPGRAM_NOVA_3,
        }

        /**
         * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TranscriptionEngine] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            A,
            B,
            DEEPGRAM_NOVA_3,
            /**
             * An enum member indicating that [TranscriptionEngine] was instantiated with an unknown
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
                A -> Value.A
                B -> Value.B
                DEEPGRAM_NOVA_3 -> Value.DEEPGRAM_NOVA_3
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
                A -> Known.A
                B -> Known.B
                DEEPGRAM_NOVA_3 -> Known.DEEPGRAM_NOVA_3
                else -> throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
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
     * Language code for transcription. Note: Not all languages are supported by all transcription
     * engines (google, telnyx, deepgram). See engine-specific documentation for supported values.
     */
    class TranscriptionLanguage
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

            @JvmField val AF = of("af")

            @JvmField val AF_ZA = of("af-ZA")

            @JvmField val AM = of("am")

            @JvmField val AM_ET = of("am-ET")

            @JvmField val AR = of("ar")

            @JvmField val AR_AE = of("ar-AE")

            @JvmField val AR_BH = of("ar-BH")

            @JvmField val AR_DZ = of("ar-DZ")

            @JvmField val AR_EG = of("ar-EG")

            @JvmField val AR_IL = of("ar-IL")

            @JvmField val AR_IQ = of("ar-IQ")

            @JvmField val AR_JO = of("ar-JO")

            @JvmField val AR_KW = of("ar-KW")

            @JvmField val AR_LB = of("ar-LB")

            @JvmField val AR_MA = of("ar-MA")

            @JvmField val AR_MR = of("ar-MR")

            @JvmField val AR_OM = of("ar-OM")

            @JvmField val AR_PS = of("ar-PS")

            @JvmField val AR_QA = of("ar-QA")

            @JvmField val AR_SA = of("ar-SA")

            @JvmField val AR_TN = of("ar-TN")

            @JvmField val AR_YE = of("ar-YE")

            @JvmField val AS = of("as")

            @JvmField val AUTO_DETECT = of("auto_detect")

            @JvmField val AZ = of("az")

            @JvmField val AZ_AZ = of("az-AZ")

            @JvmField val BA = of("ba")

            @JvmField val BE = of("be")

            @JvmField val BG = of("bg")

            @JvmField val BG_BG = of("bg-BG")

            @JvmField val BN = of("bn")

            @JvmField val BN_BD = of("bn-BD")

            @JvmField val BN_IN = of("bn-IN")

            @JvmField val BO = of("bo")

            @JvmField val BR = of("br")

            @JvmField val BS = of("bs")

            @JvmField val BS_BA = of("bs-BA")

            @JvmField val CA = of("ca")

            @JvmField val CA_ES = of("ca-ES")

            @JvmField val CS = of("cs")

            @JvmField val CS_CZ = of("cs-CZ")

            @JvmField val CY = of("cy")

            @JvmField val DA = of("da")

            @JvmField val DA_DK = of("da-DK")

            @JvmField val DE = of("de")

            @JvmField val DE_AT = of("de-AT")

            @JvmField val DE_CH = of("de-CH")

            @JvmField val DE_DE = of("de-DE")

            @JvmField val EL = of("el")

            @JvmField val EL_GR = of("el-GR")

            @JvmField val EN = of("en")

            @JvmField val EN_AU = of("en-AU")

            @JvmField val EN_CA = of("en-CA")

            @JvmField val EN_GB = of("en-GB")

            @JvmField val EN_GH = of("en-GH")

            @JvmField val EN_HK = of("en-HK")

            @JvmField val EN_IE = of("en-IE")

            @JvmField val EN_IN = of("en-IN")

            @JvmField val EN_KE = of("en-KE")

            @JvmField val EN_NG = of("en-NG")

            @JvmField val EN_NZ = of("en-NZ")

            @JvmField val EN_PH = of("en-PH")

            @JvmField val EN_PK = of("en-PK")

            @JvmField val EN_SG = of("en-SG")

            @JvmField val EN_TZ = of("en-TZ")

            @JvmField val EN_US = of("en-US")

            @JvmField val EN_ZA = of("en-ZA")

            @JvmField val ES = of("es")

            @JvmField val ES_419 = of("es-419")

            @JvmField val ES_AR = of("es-AR")

            @JvmField val ES_BO = of("es-BO")

            @JvmField val ES_CL = of("es-CL")

            @JvmField val ES_CO = of("es-CO")

            @JvmField val ES_CR = of("es-CR")

            @JvmField val ES_DO = of("es-DO")

            @JvmField val ES_EC = of("es-EC")

            @JvmField val ES_ES = of("es-ES")

            @JvmField val ES_GT = of("es-GT")

            @JvmField val ES_HN = of("es-HN")

            @JvmField val ES_MX = of("es-MX")

            @JvmField val ES_NI = of("es-NI")

            @JvmField val ES_PA = of("es-PA")

            @JvmField val ES_PE = of("es-PE")

            @JvmField val ES_PR = of("es-PR")

            @JvmField val ES_PY = of("es-PY")

            @JvmField val ES_SV = of("es-SV")

            @JvmField val ES_US = of("es-US")

            @JvmField val ES_UY = of("es-UY")

            @JvmField val ES_VE = of("es-VE")

            @JvmField val ET = of("et")

            @JvmField val ET_EE = of("et-EE")

            @JvmField val EU = of("eu")

            @JvmField val EU_ES = of("eu-ES")

            @JvmField val FA = of("fa")

            @JvmField val FA_IR = of("fa-IR")

            @JvmField val FI = of("fi")

            @JvmField val FI_FI = of("fi-FI")

            @JvmField val FIL_PH = of("fil-PH")

            @JvmField val FO = of("fo")

            @JvmField val FR = of("fr")

            @JvmField val FR_BE = of("fr-BE")

            @JvmField val FR_CA = of("fr-CA")

            @JvmField val FR_CH = of("fr-CH")

            @JvmField val FR_FR = of("fr-FR")

            @JvmField val GL = of("gl")

            @JvmField val GL_ES = of("gl-ES")

            @JvmField val GU = of("gu")

            @JvmField val GU_IN = of("gu-IN")

            @JvmField val HA = of("ha")

            @JvmField val HAW = of("haw")

            @JvmField val HE = of("he")

            @JvmField val HI = of("hi")

            @JvmField val HI_IN = of("hi-IN")

            @JvmField val HR = of("hr")

            @JvmField val HR_HR = of("hr-HR")

            @JvmField val HT = of("ht")

            @JvmField val HU = of("hu")

            @JvmField val HU_HU = of("hu-HU")

            @JvmField val HY = of("hy")

            @JvmField val HY_AM = of("hy-AM")

            @JvmField val ID = of("id")

            @JvmField val ID_ID = of("id-ID")

            @JvmField val IS = of("is")

            @JvmField val IS_IS = of("is-IS")

            @JvmField val IT = of("it")

            @JvmField val IT_CH = of("it-CH")

            @JvmField val IT_IT = of("it-IT")

            @JvmField val IW_IL = of("iw-IL")

            @JvmField val JA = of("ja")

            @JvmField val JA_JP = of("ja-JP")

            @JvmField val JV_ID = of("jv-ID")

            @JvmField val JW = of("jw")

            @JvmField val KA = of("ka")

            @JvmField val KA_GE = of("ka-GE")

            @JvmField val KK = of("kk")

            @JvmField val KK_KZ = of("kk-KZ")

            @JvmField val KM = of("km")

            @JvmField val KM_KH = of("km-KH")

            @JvmField val KN = of("kn")

            @JvmField val KN_IN = of("kn-IN")

            @JvmField val KO = of("ko")

            @JvmField val KO_KR = of("ko-KR")

            @JvmField val LA = of("la")

            @JvmField val LB = of("lb")

            @JvmField val LN = of("ln")

            @JvmField val LO = of("lo")

            @JvmField val LO_LA = of("lo-LA")

            @JvmField val LT = of("lt")

            @JvmField val LT_LT = of("lt-LT")

            @JvmField val LV = of("lv")

            @JvmField val LV_LV = of("lv-LV")

            @JvmField val MG = of("mg")

            @JvmField val MI = of("mi")

            @JvmField val MK = of("mk")

            @JvmField val MK_MK = of("mk-MK")

            @JvmField val ML = of("ml")

            @JvmField val ML_IN = of("ml-IN")

            @JvmField val MN = of("mn")

            @JvmField val MN_MN = of("mn-MN")

            @JvmField val MR = of("mr")

            @JvmField val MR_IN = of("mr-IN")

            @JvmField val MS = of("ms")

            @JvmField val MS_MY = of("ms-MY")

            @JvmField val MT = of("mt")

            @JvmField val MY = of("my")

            @JvmField val MY_MM = of("my-MM")

            @JvmField val NE = of("ne")

            @JvmField val NE_NP = of("ne-NP")

            @JvmField val NL = of("nl")

            @JvmField val NL_BE = of("nl-BE")

            @JvmField val NL_NL = of("nl-NL")

            @JvmField val NN = of("nn")

            @JvmField val NO = of("no")

            @JvmField val NO_NO = of("no-NO")

            @JvmField val OC = of("oc")

            @JvmField val PA = of("pa")

            @JvmField val PA_GURU_IN = of("pa-Guru-IN")

            @JvmField val PL = of("pl")

            @JvmField val PL_PL = of("pl-PL")

            @JvmField val PS = of("ps")

            @JvmField val PT = of("pt")

            @JvmField val PT_BR = of("pt-BR")

            @JvmField val PT_PT = of("pt-PT")

            @JvmField val RO = of("ro")

            @JvmField val RO_RO = of("ro-RO")

            @JvmField val RU = of("ru")

            @JvmField val RU_RU = of("ru-RU")

            @JvmField val RW_RW = of("rw-RW")

            @JvmField val SA = of("sa")

            @JvmField val SD = of("sd")

            @JvmField val SI = of("si")

            @JvmField val SI_LK = of("si-LK")

            @JvmField val SK = of("sk")

            @JvmField val SK_SK = of("sk-SK")

            @JvmField val SL = of("sl")

            @JvmField val SL_SI = of("sl-SI")

            @JvmField val SN = of("sn")

            @JvmField val SO = of("so")

            @JvmField val SQ = of("sq")

            @JvmField val SQ_AL = of("sq-AL")

            @JvmField val SR = of("sr")

            @JvmField val SR_RS = of("sr-RS")

            @JvmField val SS_LATN_ZA = of("ss-latn-za")

            @JvmField val ST_ZA = of("st-ZA")

            @JvmField val SU = of("su")

            @JvmField val SU_ID = of("su-ID")

            @JvmField val SV = of("sv")

            @JvmField val SV_SE = of("sv-SE")

            @JvmField val SW = of("sw")

            @JvmField val SW_KE = of("sw-KE")

            @JvmField val SW_TZ = of("sw-TZ")

            @JvmField val TA = of("ta")

            @JvmField val TA_IN = of("ta-IN")

            @JvmField val TA_LK = of("ta-LK")

            @JvmField val TA_MY = of("ta-MY")

            @JvmField val TA_SG = of("ta-SG")

            @JvmField val TE = of("te")

            @JvmField val TE_IN = of("te-IN")

            @JvmField val TG = of("tg")

            @JvmField val TH = of("th")

            @JvmField val TH_TH = of("th-TH")

            @JvmField val TK = of("tk")

            @JvmField val TL = of("tl")

            @JvmField val TN_LATN_ZA = of("tn-latn-za")

            @JvmField val TR = of("tr")

            @JvmField val TR_TR = of("tr-TR")

            @JvmField val TS_ZA = of("ts-ZA")

            @JvmField val TT = of("tt")

            @JvmField val UK = of("uk")

            @JvmField val UK_UA = of("uk-UA")

            @JvmField val UR = of("ur")

            @JvmField val UR_IN = of("ur-IN")

            @JvmField val UR_PK = of("ur-PK")

            @JvmField val UZ = of("uz")

            @JvmField val UZ_UZ = of("uz-UZ")

            @JvmField val VE_ZA = of("ve-ZA")

            @JvmField val VI = of("vi")

            @JvmField val VI_VN = of("vi-VN")

            @JvmField val XH_ZA = of("xh-ZA")

            @JvmField val YI = of("yi")

            @JvmField val YO = of("yo")

            @JvmField val YUE_HANT_HK = of("yue-Hant-HK")

            @JvmField val ZH = of("zh")

            @JvmField val ZH_TW = of("zh-TW")

            @JvmField val ZU_ZA = of("zu-ZA")

            @JvmStatic fun of(value: String) = TranscriptionLanguage(JsonField.of(value))
        }

        /** An enum containing [TranscriptionLanguage]'s known values. */
        enum class Known {
            AF,
            AF_ZA,
            AM,
            AM_ET,
            AR,
            AR_AE,
            AR_BH,
            AR_DZ,
            AR_EG,
            AR_IL,
            AR_IQ,
            AR_JO,
            AR_KW,
            AR_LB,
            AR_MA,
            AR_MR,
            AR_OM,
            AR_PS,
            AR_QA,
            AR_SA,
            AR_TN,
            AR_YE,
            AS,
            AUTO_DETECT,
            AZ,
            AZ_AZ,
            BA,
            BE,
            BG,
            BG_BG,
            BN,
            BN_BD,
            BN_IN,
            BO,
            BR,
            BS,
            BS_BA,
            CA,
            CA_ES,
            CS,
            CS_CZ,
            CY,
            DA,
            DA_DK,
            DE,
            DE_AT,
            DE_CH,
            DE_DE,
            EL,
            EL_GR,
            EN,
            EN_AU,
            EN_CA,
            EN_GB,
            EN_GH,
            EN_HK,
            EN_IE,
            EN_IN,
            EN_KE,
            EN_NG,
            EN_NZ,
            EN_PH,
            EN_PK,
            EN_SG,
            EN_TZ,
            EN_US,
            EN_ZA,
            ES,
            ES_419,
            ES_AR,
            ES_BO,
            ES_CL,
            ES_CO,
            ES_CR,
            ES_DO,
            ES_EC,
            ES_ES,
            ES_GT,
            ES_HN,
            ES_MX,
            ES_NI,
            ES_PA,
            ES_PE,
            ES_PR,
            ES_PY,
            ES_SV,
            ES_US,
            ES_UY,
            ES_VE,
            ET,
            ET_EE,
            EU,
            EU_ES,
            FA,
            FA_IR,
            FI,
            FI_FI,
            FIL_PH,
            FO,
            FR,
            FR_BE,
            FR_CA,
            FR_CH,
            FR_FR,
            GL,
            GL_ES,
            GU,
            GU_IN,
            HA,
            HAW,
            HE,
            HI,
            HI_IN,
            HR,
            HR_HR,
            HT,
            HU,
            HU_HU,
            HY,
            HY_AM,
            ID,
            ID_ID,
            IS,
            IS_IS,
            IT,
            IT_CH,
            IT_IT,
            IW_IL,
            JA,
            JA_JP,
            JV_ID,
            JW,
            KA,
            KA_GE,
            KK,
            KK_KZ,
            KM,
            KM_KH,
            KN,
            KN_IN,
            KO,
            KO_KR,
            LA,
            LB,
            LN,
            LO,
            LO_LA,
            LT,
            LT_LT,
            LV,
            LV_LV,
            MG,
            MI,
            MK,
            MK_MK,
            ML,
            ML_IN,
            MN,
            MN_MN,
            MR,
            MR_IN,
            MS,
            MS_MY,
            MT,
            MY,
            MY_MM,
            NE,
            NE_NP,
            NL,
            NL_BE,
            NL_NL,
            NN,
            NO,
            NO_NO,
            OC,
            PA,
            PA_GURU_IN,
            PL,
            PL_PL,
            PS,
            PT,
            PT_BR,
            PT_PT,
            RO,
            RO_RO,
            RU,
            RU_RU,
            RW_RW,
            SA,
            SD,
            SI,
            SI_LK,
            SK,
            SK_SK,
            SL,
            SL_SI,
            SN,
            SO,
            SQ,
            SQ_AL,
            SR,
            SR_RS,
            SS_LATN_ZA,
            ST_ZA,
            SU,
            SU_ID,
            SV,
            SV_SE,
            SW,
            SW_KE,
            SW_TZ,
            TA,
            TA_IN,
            TA_LK,
            TA_MY,
            TA_SG,
            TE,
            TE_IN,
            TG,
            TH,
            TH_TH,
            TK,
            TL,
            TN_LATN_ZA,
            TR,
            TR_TR,
            TS_ZA,
            TT,
            UK,
            UK_UA,
            UR,
            UR_IN,
            UR_PK,
            UZ,
            UZ_UZ,
            VE_ZA,
            VI,
            VI_VN,
            XH_ZA,
            YI,
            YO,
            YUE_HANT_HK,
            ZH,
            ZH_TW,
            ZU_ZA,
        }

        /**
         * An enum containing [TranscriptionLanguage]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [TranscriptionLanguage] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AF,
            AF_ZA,
            AM,
            AM_ET,
            AR,
            AR_AE,
            AR_BH,
            AR_DZ,
            AR_EG,
            AR_IL,
            AR_IQ,
            AR_JO,
            AR_KW,
            AR_LB,
            AR_MA,
            AR_MR,
            AR_OM,
            AR_PS,
            AR_QA,
            AR_SA,
            AR_TN,
            AR_YE,
            AS,
            AUTO_DETECT,
            AZ,
            AZ_AZ,
            BA,
            BE,
            BG,
            BG_BG,
            BN,
            BN_BD,
            BN_IN,
            BO,
            BR,
            BS,
            BS_BA,
            CA,
            CA_ES,
            CS,
            CS_CZ,
            CY,
            DA,
            DA_DK,
            DE,
            DE_AT,
            DE_CH,
            DE_DE,
            EL,
            EL_GR,
            EN,
            EN_AU,
            EN_CA,
            EN_GB,
            EN_GH,
            EN_HK,
            EN_IE,
            EN_IN,
            EN_KE,
            EN_NG,
            EN_NZ,
            EN_PH,
            EN_PK,
            EN_SG,
            EN_TZ,
            EN_US,
            EN_ZA,
            ES,
            ES_419,
            ES_AR,
            ES_BO,
            ES_CL,
            ES_CO,
            ES_CR,
            ES_DO,
            ES_EC,
            ES_ES,
            ES_GT,
            ES_HN,
            ES_MX,
            ES_NI,
            ES_PA,
            ES_PE,
            ES_PR,
            ES_PY,
            ES_SV,
            ES_US,
            ES_UY,
            ES_VE,
            ET,
            ET_EE,
            EU,
            EU_ES,
            FA,
            FA_IR,
            FI,
            FI_FI,
            FIL_PH,
            FO,
            FR,
            FR_BE,
            FR_CA,
            FR_CH,
            FR_FR,
            GL,
            GL_ES,
            GU,
            GU_IN,
            HA,
            HAW,
            HE,
            HI,
            HI_IN,
            HR,
            HR_HR,
            HT,
            HU,
            HU_HU,
            HY,
            HY_AM,
            ID,
            ID_ID,
            IS,
            IS_IS,
            IT,
            IT_CH,
            IT_IT,
            IW_IL,
            JA,
            JA_JP,
            JV_ID,
            JW,
            KA,
            KA_GE,
            KK,
            KK_KZ,
            KM,
            KM_KH,
            KN,
            KN_IN,
            KO,
            KO_KR,
            LA,
            LB,
            LN,
            LO,
            LO_LA,
            LT,
            LT_LT,
            LV,
            LV_LV,
            MG,
            MI,
            MK,
            MK_MK,
            ML,
            ML_IN,
            MN,
            MN_MN,
            MR,
            MR_IN,
            MS,
            MS_MY,
            MT,
            MY,
            MY_MM,
            NE,
            NE_NP,
            NL,
            NL_BE,
            NL_NL,
            NN,
            NO,
            NO_NO,
            OC,
            PA,
            PA_GURU_IN,
            PL,
            PL_PL,
            PS,
            PT,
            PT_BR,
            PT_PT,
            RO,
            RO_RO,
            RU,
            RU_RU,
            RW_RW,
            SA,
            SD,
            SI,
            SI_LK,
            SK,
            SK_SK,
            SL,
            SL_SI,
            SN,
            SO,
            SQ,
            SQ_AL,
            SR,
            SR_RS,
            SS_LATN_ZA,
            ST_ZA,
            SU,
            SU_ID,
            SV,
            SV_SE,
            SW,
            SW_KE,
            SW_TZ,
            TA,
            TA_IN,
            TA_LK,
            TA_MY,
            TA_SG,
            TE,
            TE_IN,
            TG,
            TH,
            TH_TH,
            TK,
            TL,
            TN_LATN_ZA,
            TR,
            TR_TR,
            TS_ZA,
            TT,
            UK,
            UK_UA,
            UR,
            UR_IN,
            UR_PK,
            UZ,
            UZ_UZ,
            VE_ZA,
            VI,
            VI_VN,
            XH_ZA,
            YI,
            YO,
            YUE_HANT_HK,
            ZH,
            ZH_TW,
            ZU_ZA,
            /**
             * An enum member indicating that [TranscriptionLanguage] was instantiated with an
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
                AF -> Value.AF
                AF_ZA -> Value.AF_ZA
                AM -> Value.AM
                AM_ET -> Value.AM_ET
                AR -> Value.AR
                AR_AE -> Value.AR_AE
                AR_BH -> Value.AR_BH
                AR_DZ -> Value.AR_DZ
                AR_EG -> Value.AR_EG
                AR_IL -> Value.AR_IL
                AR_IQ -> Value.AR_IQ
                AR_JO -> Value.AR_JO
                AR_KW -> Value.AR_KW
                AR_LB -> Value.AR_LB
                AR_MA -> Value.AR_MA
                AR_MR -> Value.AR_MR
                AR_OM -> Value.AR_OM
                AR_PS -> Value.AR_PS
                AR_QA -> Value.AR_QA
                AR_SA -> Value.AR_SA
                AR_TN -> Value.AR_TN
                AR_YE -> Value.AR_YE
                AS -> Value.AS
                AUTO_DETECT -> Value.AUTO_DETECT
                AZ -> Value.AZ
                AZ_AZ -> Value.AZ_AZ
                BA -> Value.BA
                BE -> Value.BE
                BG -> Value.BG
                BG_BG -> Value.BG_BG
                BN -> Value.BN
                BN_BD -> Value.BN_BD
                BN_IN -> Value.BN_IN
                BO -> Value.BO
                BR -> Value.BR
                BS -> Value.BS
                BS_BA -> Value.BS_BA
                CA -> Value.CA
                CA_ES -> Value.CA_ES
                CS -> Value.CS
                CS_CZ -> Value.CS_CZ
                CY -> Value.CY
                DA -> Value.DA
                DA_DK -> Value.DA_DK
                DE -> Value.DE
                DE_AT -> Value.DE_AT
                DE_CH -> Value.DE_CH
                DE_DE -> Value.DE_DE
                EL -> Value.EL
                EL_GR -> Value.EL_GR
                EN -> Value.EN
                EN_AU -> Value.EN_AU
                EN_CA -> Value.EN_CA
                EN_GB -> Value.EN_GB
                EN_GH -> Value.EN_GH
                EN_HK -> Value.EN_HK
                EN_IE -> Value.EN_IE
                EN_IN -> Value.EN_IN
                EN_KE -> Value.EN_KE
                EN_NG -> Value.EN_NG
                EN_NZ -> Value.EN_NZ
                EN_PH -> Value.EN_PH
                EN_PK -> Value.EN_PK
                EN_SG -> Value.EN_SG
                EN_TZ -> Value.EN_TZ
                EN_US -> Value.EN_US
                EN_ZA -> Value.EN_ZA
                ES -> Value.ES
                ES_419 -> Value.ES_419
                ES_AR -> Value.ES_AR
                ES_BO -> Value.ES_BO
                ES_CL -> Value.ES_CL
                ES_CO -> Value.ES_CO
                ES_CR -> Value.ES_CR
                ES_DO -> Value.ES_DO
                ES_EC -> Value.ES_EC
                ES_ES -> Value.ES_ES
                ES_GT -> Value.ES_GT
                ES_HN -> Value.ES_HN
                ES_MX -> Value.ES_MX
                ES_NI -> Value.ES_NI
                ES_PA -> Value.ES_PA
                ES_PE -> Value.ES_PE
                ES_PR -> Value.ES_PR
                ES_PY -> Value.ES_PY
                ES_SV -> Value.ES_SV
                ES_US -> Value.ES_US
                ES_UY -> Value.ES_UY
                ES_VE -> Value.ES_VE
                ET -> Value.ET
                ET_EE -> Value.ET_EE
                EU -> Value.EU
                EU_ES -> Value.EU_ES
                FA -> Value.FA
                FA_IR -> Value.FA_IR
                FI -> Value.FI
                FI_FI -> Value.FI_FI
                FIL_PH -> Value.FIL_PH
                FO -> Value.FO
                FR -> Value.FR
                FR_BE -> Value.FR_BE
                FR_CA -> Value.FR_CA
                FR_CH -> Value.FR_CH
                FR_FR -> Value.FR_FR
                GL -> Value.GL
                GL_ES -> Value.GL_ES
                GU -> Value.GU
                GU_IN -> Value.GU_IN
                HA -> Value.HA
                HAW -> Value.HAW
                HE -> Value.HE
                HI -> Value.HI
                HI_IN -> Value.HI_IN
                HR -> Value.HR
                HR_HR -> Value.HR_HR
                HT -> Value.HT
                HU -> Value.HU
                HU_HU -> Value.HU_HU
                HY -> Value.HY
                HY_AM -> Value.HY_AM
                ID -> Value.ID
                ID_ID -> Value.ID_ID
                IS -> Value.IS
                IS_IS -> Value.IS_IS
                IT -> Value.IT
                IT_CH -> Value.IT_CH
                IT_IT -> Value.IT_IT
                IW_IL -> Value.IW_IL
                JA -> Value.JA
                JA_JP -> Value.JA_JP
                JV_ID -> Value.JV_ID
                JW -> Value.JW
                KA -> Value.KA
                KA_GE -> Value.KA_GE
                KK -> Value.KK
                KK_KZ -> Value.KK_KZ
                KM -> Value.KM
                KM_KH -> Value.KM_KH
                KN -> Value.KN
                KN_IN -> Value.KN_IN
                KO -> Value.KO
                KO_KR -> Value.KO_KR
                LA -> Value.LA
                LB -> Value.LB
                LN -> Value.LN
                LO -> Value.LO
                LO_LA -> Value.LO_LA
                LT -> Value.LT
                LT_LT -> Value.LT_LT
                LV -> Value.LV
                LV_LV -> Value.LV_LV
                MG -> Value.MG
                MI -> Value.MI
                MK -> Value.MK
                MK_MK -> Value.MK_MK
                ML -> Value.ML
                ML_IN -> Value.ML_IN
                MN -> Value.MN
                MN_MN -> Value.MN_MN
                MR -> Value.MR
                MR_IN -> Value.MR_IN
                MS -> Value.MS
                MS_MY -> Value.MS_MY
                MT -> Value.MT
                MY -> Value.MY
                MY_MM -> Value.MY_MM
                NE -> Value.NE
                NE_NP -> Value.NE_NP
                NL -> Value.NL
                NL_BE -> Value.NL_BE
                NL_NL -> Value.NL_NL
                NN -> Value.NN
                NO -> Value.NO
                NO_NO -> Value.NO_NO
                OC -> Value.OC
                PA -> Value.PA
                PA_GURU_IN -> Value.PA_GURU_IN
                PL -> Value.PL
                PL_PL -> Value.PL_PL
                PS -> Value.PS
                PT -> Value.PT
                PT_BR -> Value.PT_BR
                PT_PT -> Value.PT_PT
                RO -> Value.RO
                RO_RO -> Value.RO_RO
                RU -> Value.RU
                RU_RU -> Value.RU_RU
                RW_RW -> Value.RW_RW
                SA -> Value.SA
                SD -> Value.SD
                SI -> Value.SI
                SI_LK -> Value.SI_LK
                SK -> Value.SK
                SK_SK -> Value.SK_SK
                SL -> Value.SL
                SL_SI -> Value.SL_SI
                SN -> Value.SN
                SO -> Value.SO
                SQ -> Value.SQ
                SQ_AL -> Value.SQ_AL
                SR -> Value.SR
                SR_RS -> Value.SR_RS
                SS_LATN_ZA -> Value.SS_LATN_ZA
                ST_ZA -> Value.ST_ZA
                SU -> Value.SU
                SU_ID -> Value.SU_ID
                SV -> Value.SV
                SV_SE -> Value.SV_SE
                SW -> Value.SW
                SW_KE -> Value.SW_KE
                SW_TZ -> Value.SW_TZ
                TA -> Value.TA
                TA_IN -> Value.TA_IN
                TA_LK -> Value.TA_LK
                TA_MY -> Value.TA_MY
                TA_SG -> Value.TA_SG
                TE -> Value.TE
                TE_IN -> Value.TE_IN
                TG -> Value.TG
                TH -> Value.TH
                TH_TH -> Value.TH_TH
                TK -> Value.TK
                TL -> Value.TL
                TN_LATN_ZA -> Value.TN_LATN_ZA
                TR -> Value.TR
                TR_TR -> Value.TR_TR
                TS_ZA -> Value.TS_ZA
                TT -> Value.TT
                UK -> Value.UK
                UK_UA -> Value.UK_UA
                UR -> Value.UR
                UR_IN -> Value.UR_IN
                UR_PK -> Value.UR_PK
                UZ -> Value.UZ
                UZ_UZ -> Value.UZ_UZ
                VE_ZA -> Value.VE_ZA
                VI -> Value.VI
                VI_VN -> Value.VI_VN
                XH_ZA -> Value.XH_ZA
                YI -> Value.YI
                YO -> Value.YO
                YUE_HANT_HK -> Value.YUE_HANT_HK
                ZH -> Value.ZH
                ZH_TW -> Value.ZH_TW
                ZU_ZA -> Value.ZU_ZA
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
                AF -> Known.AF
                AF_ZA -> Known.AF_ZA
                AM -> Known.AM
                AM_ET -> Known.AM_ET
                AR -> Known.AR
                AR_AE -> Known.AR_AE
                AR_BH -> Known.AR_BH
                AR_DZ -> Known.AR_DZ
                AR_EG -> Known.AR_EG
                AR_IL -> Known.AR_IL
                AR_IQ -> Known.AR_IQ
                AR_JO -> Known.AR_JO
                AR_KW -> Known.AR_KW
                AR_LB -> Known.AR_LB
                AR_MA -> Known.AR_MA
                AR_MR -> Known.AR_MR
                AR_OM -> Known.AR_OM
                AR_PS -> Known.AR_PS
                AR_QA -> Known.AR_QA
                AR_SA -> Known.AR_SA
                AR_TN -> Known.AR_TN
                AR_YE -> Known.AR_YE
                AS -> Known.AS
                AUTO_DETECT -> Known.AUTO_DETECT
                AZ -> Known.AZ
                AZ_AZ -> Known.AZ_AZ
                BA -> Known.BA
                BE -> Known.BE
                BG -> Known.BG
                BG_BG -> Known.BG_BG
                BN -> Known.BN
                BN_BD -> Known.BN_BD
                BN_IN -> Known.BN_IN
                BO -> Known.BO
                BR -> Known.BR
                BS -> Known.BS
                BS_BA -> Known.BS_BA
                CA -> Known.CA
                CA_ES -> Known.CA_ES
                CS -> Known.CS
                CS_CZ -> Known.CS_CZ
                CY -> Known.CY
                DA -> Known.DA
                DA_DK -> Known.DA_DK
                DE -> Known.DE
                DE_AT -> Known.DE_AT
                DE_CH -> Known.DE_CH
                DE_DE -> Known.DE_DE
                EL -> Known.EL
                EL_GR -> Known.EL_GR
                EN -> Known.EN
                EN_AU -> Known.EN_AU
                EN_CA -> Known.EN_CA
                EN_GB -> Known.EN_GB
                EN_GH -> Known.EN_GH
                EN_HK -> Known.EN_HK
                EN_IE -> Known.EN_IE
                EN_IN -> Known.EN_IN
                EN_KE -> Known.EN_KE
                EN_NG -> Known.EN_NG
                EN_NZ -> Known.EN_NZ
                EN_PH -> Known.EN_PH
                EN_PK -> Known.EN_PK
                EN_SG -> Known.EN_SG
                EN_TZ -> Known.EN_TZ
                EN_US -> Known.EN_US
                EN_ZA -> Known.EN_ZA
                ES -> Known.ES
                ES_419 -> Known.ES_419
                ES_AR -> Known.ES_AR
                ES_BO -> Known.ES_BO
                ES_CL -> Known.ES_CL
                ES_CO -> Known.ES_CO
                ES_CR -> Known.ES_CR
                ES_DO -> Known.ES_DO
                ES_EC -> Known.ES_EC
                ES_ES -> Known.ES_ES
                ES_GT -> Known.ES_GT
                ES_HN -> Known.ES_HN
                ES_MX -> Known.ES_MX
                ES_NI -> Known.ES_NI
                ES_PA -> Known.ES_PA
                ES_PE -> Known.ES_PE
                ES_PR -> Known.ES_PR
                ES_PY -> Known.ES_PY
                ES_SV -> Known.ES_SV
                ES_US -> Known.ES_US
                ES_UY -> Known.ES_UY
                ES_VE -> Known.ES_VE
                ET -> Known.ET
                ET_EE -> Known.ET_EE
                EU -> Known.EU
                EU_ES -> Known.EU_ES
                FA -> Known.FA
                FA_IR -> Known.FA_IR
                FI -> Known.FI
                FI_FI -> Known.FI_FI
                FIL_PH -> Known.FIL_PH
                FO -> Known.FO
                FR -> Known.FR
                FR_BE -> Known.FR_BE
                FR_CA -> Known.FR_CA
                FR_CH -> Known.FR_CH
                FR_FR -> Known.FR_FR
                GL -> Known.GL
                GL_ES -> Known.GL_ES
                GU -> Known.GU
                GU_IN -> Known.GU_IN
                HA -> Known.HA
                HAW -> Known.HAW
                HE -> Known.HE
                HI -> Known.HI
                HI_IN -> Known.HI_IN
                HR -> Known.HR
                HR_HR -> Known.HR_HR
                HT -> Known.HT
                HU -> Known.HU
                HU_HU -> Known.HU_HU
                HY -> Known.HY
                HY_AM -> Known.HY_AM
                ID -> Known.ID
                ID_ID -> Known.ID_ID
                IS -> Known.IS
                IS_IS -> Known.IS_IS
                IT -> Known.IT
                IT_CH -> Known.IT_CH
                IT_IT -> Known.IT_IT
                IW_IL -> Known.IW_IL
                JA -> Known.JA
                JA_JP -> Known.JA_JP
                JV_ID -> Known.JV_ID
                JW -> Known.JW
                KA -> Known.KA
                KA_GE -> Known.KA_GE
                KK -> Known.KK
                KK_KZ -> Known.KK_KZ
                KM -> Known.KM
                KM_KH -> Known.KM_KH
                KN -> Known.KN
                KN_IN -> Known.KN_IN
                KO -> Known.KO
                KO_KR -> Known.KO_KR
                LA -> Known.LA
                LB -> Known.LB
                LN -> Known.LN
                LO -> Known.LO
                LO_LA -> Known.LO_LA
                LT -> Known.LT
                LT_LT -> Known.LT_LT
                LV -> Known.LV
                LV_LV -> Known.LV_LV
                MG -> Known.MG
                MI -> Known.MI
                MK -> Known.MK
                MK_MK -> Known.MK_MK
                ML -> Known.ML
                ML_IN -> Known.ML_IN
                MN -> Known.MN
                MN_MN -> Known.MN_MN
                MR -> Known.MR
                MR_IN -> Known.MR_IN
                MS -> Known.MS
                MS_MY -> Known.MS_MY
                MT -> Known.MT
                MY -> Known.MY
                MY_MM -> Known.MY_MM
                NE -> Known.NE
                NE_NP -> Known.NE_NP
                NL -> Known.NL
                NL_BE -> Known.NL_BE
                NL_NL -> Known.NL_NL
                NN -> Known.NN
                NO -> Known.NO
                NO_NO -> Known.NO_NO
                OC -> Known.OC
                PA -> Known.PA
                PA_GURU_IN -> Known.PA_GURU_IN
                PL -> Known.PL
                PL_PL -> Known.PL_PL
                PS -> Known.PS
                PT -> Known.PT
                PT_BR -> Known.PT_BR
                PT_PT -> Known.PT_PT
                RO -> Known.RO
                RO_RO -> Known.RO_RO
                RU -> Known.RU
                RU_RU -> Known.RU_RU
                RW_RW -> Known.RW_RW
                SA -> Known.SA
                SD -> Known.SD
                SI -> Known.SI
                SI_LK -> Known.SI_LK
                SK -> Known.SK
                SK_SK -> Known.SK_SK
                SL -> Known.SL
                SL_SI -> Known.SL_SI
                SN -> Known.SN
                SO -> Known.SO
                SQ -> Known.SQ
                SQ_AL -> Known.SQ_AL
                SR -> Known.SR
                SR_RS -> Known.SR_RS
                SS_LATN_ZA -> Known.SS_LATN_ZA
                ST_ZA -> Known.ST_ZA
                SU -> Known.SU
                SU_ID -> Known.SU_ID
                SV -> Known.SV
                SV_SE -> Known.SV_SE
                SW -> Known.SW
                SW_KE -> Known.SW_KE
                SW_TZ -> Known.SW_TZ
                TA -> Known.TA
                TA_IN -> Known.TA_IN
                TA_LK -> Known.TA_LK
                TA_MY -> Known.TA_MY
                TA_SG -> Known.TA_SG
                TE -> Known.TE
                TE_IN -> Known.TE_IN
                TG -> Known.TG
                TH -> Known.TH
                TH_TH -> Known.TH_TH
                TK -> Known.TK
                TL -> Known.TL
                TN_LATN_ZA -> Known.TN_LATN_ZA
                TR -> Known.TR
                TR_TR -> Known.TR_TR
                TS_ZA -> Known.TS_ZA
                TT -> Known.TT
                UK -> Known.UK
                UK_UA -> Known.UK_UA
                UR -> Known.UR
                UR_IN -> Known.UR_IN
                UR_PK -> Known.UR_PK
                UZ -> Known.UZ
                UZ_UZ -> Known.UZ_UZ
                VE_ZA -> Known.VE_ZA
                VI -> Known.VI
                VI_VN -> Known.VI_VN
                XH_ZA -> Known.XH_ZA
                YI -> Known.YI
                YO -> Known.YO
                YUE_HANT_HK -> Known.YUE_HANT_HK
                ZH -> Known.ZH
                ZH_TW -> Known.ZH_TW
                ZU_ZA -> Known.ZU_ZA
                else -> throw TelnyxInvalidDataException("Unknown TranscriptionLanguage: $value")
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

        fun validate(): TranscriptionLanguage = apply {
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

            return other is TranscriptionLanguage && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * When set to `trim-silence`, silence will be removed from the beginning and end of the
     * recording.
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

            @JvmStatic fun of(value: String) = Trim(JsonField.of(value))
        }

        /** An enum containing [Trim]'s known values. */
        enum class Known {
            TRIM_SILENCE
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

        return other is ActionStartRecordingParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionStartRecordingParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
