// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

/** Play an audio file to a specific conference participant and gather DTMF input. */
class ActionGatherUsingAudioParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Unique identifier and token for controlling the call leg that will receive the gather prompt.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callControlId(): String = body.callControlId()

    /**
     * The URL of the audio file to play as the gather prompt. Must be WAV or MP3 format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioUrl(): Optional<String> = body.audioUrl()

    /**
     * Use this field to add state to every subsequent webhook. Must be a valid Base-64 encoded
     * string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = body.clientState()

    /**
     * Identifier for this gather command. Will be included in the gather ended webhook. Maximum 100
     * characters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gatherId(): Optional<String> = body.gatherId()

    /**
     * Duration in milliseconds to wait for the first digit before timing out.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun initialTimeoutMillis(): Optional<Long> = body.initialTimeoutMillis()

    /**
     * Duration in milliseconds to wait between digits.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interDigitTimeoutMillis(): Optional<Long> = body.interDigitTimeoutMillis()

    /**
     * URL of audio file to play when invalid input is received.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invalidAudioUrl(): Optional<String> = body.invalidAudioUrl()

    /**
     * Name of media file to play when invalid input is received.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invalidMediaName(): Optional<String> = body.invalidMediaName()

    /**
     * Maximum number of digits to gather.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maximumDigits(): Optional<Long> = body.maximumDigits()

    /**
     * Maximum number of times to play the prompt if no input is received.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maximumTries(): Optional<Long> = body.maximumTries()

    /**
     * The name of the media file uploaded to the Media Storage API to play as the gather prompt.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaName(): Optional<String> = body.mediaName()

    /**
     * Minimum number of digits to gather.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumDigits(): Optional<Long> = body.minimumDigits()

    /**
     * Whether to stop the audio playback when a DTMF digit is received.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stopPlaybackOnDtmf(): Optional<Boolean> = body.stopPlaybackOnDtmf()

    /**
     * Digit that terminates gathering.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun terminatingDigit(): Optional<String> = body.terminatingDigit()

    /**
     * Duration in milliseconds to wait for input before timing out.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutMillis(): Optional<Long> = body.timeoutMillis()

    /**
     * Digits that are valid for gathering. All other digits will be ignored.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validDigits(): Optional<String> = body.validDigits()

    /**
     * Returns the raw JSON value of [callControlId].
     *
     * Unlike [callControlId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callControlId(): JsonField<String> = body._callControlId()

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
     * Returns the raw JSON value of [gatherId].
     *
     * Unlike [gatherId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _gatherId(): JsonField<String> = body._gatherId()

    /**
     * Returns the raw JSON value of [initialTimeoutMillis].
     *
     * Unlike [initialTimeoutMillis], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _initialTimeoutMillis(): JsonField<Long> = body._initialTimeoutMillis()

    /**
     * Returns the raw JSON value of [interDigitTimeoutMillis].
     *
     * Unlike [interDigitTimeoutMillis], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _interDigitTimeoutMillis(): JsonField<Long> = body._interDigitTimeoutMillis()

    /**
     * Returns the raw JSON value of [invalidAudioUrl].
     *
     * Unlike [invalidAudioUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invalidAudioUrl(): JsonField<String> = body._invalidAudioUrl()

    /**
     * Returns the raw JSON value of [invalidMediaName].
     *
     * Unlike [invalidMediaName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _invalidMediaName(): JsonField<String> = body._invalidMediaName()

    /**
     * Returns the raw JSON value of [maximumDigits].
     *
     * Unlike [maximumDigits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maximumDigits(): JsonField<Long> = body._maximumDigits()

    /**
     * Returns the raw JSON value of [maximumTries].
     *
     * Unlike [maximumTries], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maximumTries(): JsonField<Long> = body._maximumTries()

    /**
     * Returns the raw JSON value of [mediaName].
     *
     * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mediaName(): JsonField<String> = body._mediaName()

    /**
     * Returns the raw JSON value of [minimumDigits].
     *
     * Unlike [minimumDigits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _minimumDigits(): JsonField<Long> = body._minimumDigits()

    /**
     * Returns the raw JSON value of [stopPlaybackOnDtmf].
     *
     * Unlike [stopPlaybackOnDtmf], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _stopPlaybackOnDtmf(): JsonField<Boolean> = body._stopPlaybackOnDtmf()

    /**
     * Returns the raw JSON value of [terminatingDigit].
     *
     * Unlike [terminatingDigit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _terminatingDigit(): JsonField<String> = body._terminatingDigit()

    /**
     * Returns the raw JSON value of [timeoutMillis].
     *
     * Unlike [timeoutMillis], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeoutMillis(): JsonField<Long> = body._timeoutMillis()

    /**
     * Returns the raw JSON value of [validDigits].
     *
     * Unlike [validDigits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _validDigits(): JsonField<String> = body._validDigits()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionGatherUsingAudioParams].
         *
         * The following fields are required:
         * ```java
         * .callControlId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionGatherUsingAudioParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionGatherUsingAudioParams: ActionGatherUsingAudioParams) = apply {
            id = actionGatherUsingAudioParams.id
            body = actionGatherUsingAudioParams.body.toBuilder()
            additionalHeaders = actionGatherUsingAudioParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionGatherUsingAudioParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [callControlId]
         * - [audioUrl]
         * - [clientState]
         * - [gatherId]
         * - [initialTimeoutMillis]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Unique identifier and token for controlling the call leg that will receive the gather
         * prompt.
         */
        fun callControlId(callControlId: String) = apply { body.callControlId(callControlId) }

        /**
         * Sets [Builder.callControlId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callControlId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callControlId(callControlId: JsonField<String>) = apply {
            body.callControlId(callControlId)
        }

        /** The URL of the audio file to play as the gather prompt. Must be WAV or MP3 format. */
        fun audioUrl(audioUrl: String) = apply { body.audioUrl(audioUrl) }

        /**
         * Sets [Builder.audioUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun audioUrl(audioUrl: JsonField<String>) = apply { body.audioUrl(audioUrl) }

        /**
         * Use this field to add state to every subsequent webhook. Must be a valid Base-64 encoded
         * string.
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
         * Identifier for this gather command. Will be included in the gather ended webhook. Maximum
         * 100 characters.
         */
        fun gatherId(gatherId: String) = apply { body.gatherId(gatherId) }

        /**
         * Sets [Builder.gatherId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gatherId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gatherId(gatherId: JsonField<String>) = apply { body.gatherId(gatherId) }

        /** Duration in milliseconds to wait for the first digit before timing out. */
        fun initialTimeoutMillis(initialTimeoutMillis: Long) = apply {
            body.initialTimeoutMillis(initialTimeoutMillis)
        }

        /**
         * Sets [Builder.initialTimeoutMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialTimeoutMillis] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun initialTimeoutMillis(initialTimeoutMillis: JsonField<Long>) = apply {
            body.initialTimeoutMillis(initialTimeoutMillis)
        }

        /** Duration in milliseconds to wait between digits. */
        fun interDigitTimeoutMillis(interDigitTimeoutMillis: Long) = apply {
            body.interDigitTimeoutMillis(interDigitTimeoutMillis)
        }

        /**
         * Sets [Builder.interDigitTimeoutMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interDigitTimeoutMillis] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interDigitTimeoutMillis(interDigitTimeoutMillis: JsonField<Long>) = apply {
            body.interDigitTimeoutMillis(interDigitTimeoutMillis)
        }

        /** URL of audio file to play when invalid input is received. */
        fun invalidAudioUrl(invalidAudioUrl: String) = apply {
            body.invalidAudioUrl(invalidAudioUrl)
        }

        /**
         * Sets [Builder.invalidAudioUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invalidAudioUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invalidAudioUrl(invalidAudioUrl: JsonField<String>) = apply {
            body.invalidAudioUrl(invalidAudioUrl)
        }

        /** Name of media file to play when invalid input is received. */
        fun invalidMediaName(invalidMediaName: String) = apply {
            body.invalidMediaName(invalidMediaName)
        }

        /**
         * Sets [Builder.invalidMediaName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invalidMediaName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invalidMediaName(invalidMediaName: JsonField<String>) = apply {
            body.invalidMediaName(invalidMediaName)
        }

        /** Maximum number of digits to gather. */
        fun maximumDigits(maximumDigits: Long) = apply { body.maximumDigits(maximumDigits) }

        /**
         * Sets [Builder.maximumDigits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumDigits] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maximumDigits(maximumDigits: JsonField<Long>) = apply {
            body.maximumDigits(maximumDigits)
        }

        /** Maximum number of times to play the prompt if no input is received. */
        fun maximumTries(maximumTries: Long) = apply { body.maximumTries(maximumTries) }

        /**
         * Sets [Builder.maximumTries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumTries] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maximumTries(maximumTries: JsonField<Long>) = apply { body.maximumTries(maximumTries) }

        /**
         * The name of the media file uploaded to the Media Storage API to play as the gather
         * prompt.
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

        /** Minimum number of digits to gather. */
        fun minimumDigits(minimumDigits: Long) = apply { body.minimumDigits(minimumDigits) }

        /**
         * Sets [Builder.minimumDigits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumDigits] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minimumDigits(minimumDigits: JsonField<Long>) = apply {
            body.minimumDigits(minimumDigits)
        }

        /** Whether to stop the audio playback when a DTMF digit is received. */
        fun stopPlaybackOnDtmf(stopPlaybackOnDtmf: Boolean) = apply {
            body.stopPlaybackOnDtmf(stopPlaybackOnDtmf)
        }

        /**
         * Sets [Builder.stopPlaybackOnDtmf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stopPlaybackOnDtmf] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stopPlaybackOnDtmf(stopPlaybackOnDtmf: JsonField<Boolean>) = apply {
            body.stopPlaybackOnDtmf(stopPlaybackOnDtmf)
        }

        /** Digit that terminates gathering. */
        fun terminatingDigit(terminatingDigit: String) = apply {
            body.terminatingDigit(terminatingDigit)
        }

        /**
         * Sets [Builder.terminatingDigit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.terminatingDigit] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun terminatingDigit(terminatingDigit: JsonField<String>) = apply {
            body.terminatingDigit(terminatingDigit)
        }

        /** Duration in milliseconds to wait for input before timing out. */
        fun timeoutMillis(timeoutMillis: Long) = apply { body.timeoutMillis(timeoutMillis) }

        /**
         * Sets [Builder.timeoutMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutMillis] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeoutMillis(timeoutMillis: JsonField<Long>) = apply {
            body.timeoutMillis(timeoutMillis)
        }

        /** Digits that are valid for gathering. All other digits will be ignored. */
        fun validDigits(validDigits: String) = apply { body.validDigits(validDigits) }

        /**
         * Sets [Builder.validDigits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validDigits] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun validDigits(validDigits: JsonField<String>) = apply { body.validDigits(validDigits) }

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
         * Returns an immutable instance of [ActionGatherUsingAudioParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .callControlId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionGatherUsingAudioParams =
            ActionGatherUsingAudioParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val callControlId: JsonField<String>,
        private val audioUrl: JsonField<String>,
        private val clientState: JsonField<String>,
        private val gatherId: JsonField<String>,
        private val initialTimeoutMillis: JsonField<Long>,
        private val interDigitTimeoutMillis: JsonField<Long>,
        private val invalidAudioUrl: JsonField<String>,
        private val invalidMediaName: JsonField<String>,
        private val maximumDigits: JsonField<Long>,
        private val maximumTries: JsonField<Long>,
        private val mediaName: JsonField<String>,
        private val minimumDigits: JsonField<Long>,
        private val stopPlaybackOnDtmf: JsonField<Boolean>,
        private val terminatingDigit: JsonField<String>,
        private val timeoutMillis: JsonField<Long>,
        private val validDigits: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("call_control_id")
            @ExcludeMissing
            callControlId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("audio_url")
            @ExcludeMissing
            audioUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gather_id")
            @ExcludeMissing
            gatherId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("initial_timeout_millis")
            @ExcludeMissing
            initialTimeoutMillis: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("inter_digit_timeout_millis")
            @ExcludeMissing
            interDigitTimeoutMillis: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("invalid_audio_url")
            @ExcludeMissing
            invalidAudioUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invalid_media_name")
            @ExcludeMissing
            invalidMediaName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maximum_digits")
            @ExcludeMissing
            maximumDigits: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("maximum_tries")
            @ExcludeMissing
            maximumTries: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("media_name")
            @ExcludeMissing
            mediaName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimum_digits")
            @ExcludeMissing
            minimumDigits: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("stop_playback_on_dtmf")
            @ExcludeMissing
            stopPlaybackOnDtmf: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("terminating_digit")
            @ExcludeMissing
            terminatingDigit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeout_millis")
            @ExcludeMissing
            timeoutMillis: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("valid_digits")
            @ExcludeMissing
            validDigits: JsonField<String> = JsonMissing.of(),
        ) : this(
            callControlId,
            audioUrl,
            clientState,
            gatherId,
            initialTimeoutMillis,
            interDigitTimeoutMillis,
            invalidAudioUrl,
            invalidMediaName,
            maximumDigits,
            maximumTries,
            mediaName,
            minimumDigits,
            stopPlaybackOnDtmf,
            terminatingDigit,
            timeoutMillis,
            validDigits,
            mutableMapOf(),
        )

        /**
         * Unique identifier and token for controlling the call leg that will receive the gather
         * prompt.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun callControlId(): String = callControlId.getRequired("call_control_id")

        /**
         * The URL of the audio file to play as the gather prompt. Must be WAV or MP3 format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audioUrl(): Optional<String> = audioUrl.getOptional("audio_url")

        /**
         * Use this field to add state to every subsequent webhook. Must be a valid Base-64 encoded
         * string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientState(): Optional<String> = clientState.getOptional("client_state")

        /**
         * Identifier for this gather command. Will be included in the gather ended webhook. Maximum
         * 100 characters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gatherId(): Optional<String> = gatherId.getOptional("gather_id")

        /**
         * Duration in milliseconds to wait for the first digit before timing out.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun initialTimeoutMillis(): Optional<Long> =
            initialTimeoutMillis.getOptional("initial_timeout_millis")

        /**
         * Duration in milliseconds to wait between digits.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interDigitTimeoutMillis(): Optional<Long> =
            interDigitTimeoutMillis.getOptional("inter_digit_timeout_millis")

        /**
         * URL of audio file to play when invalid input is received.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invalidAudioUrl(): Optional<String> = invalidAudioUrl.getOptional("invalid_audio_url")

        /**
         * Name of media file to play when invalid input is received.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invalidMediaName(): Optional<String> =
            invalidMediaName.getOptional("invalid_media_name")

        /**
         * Maximum number of digits to gather.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximumDigits(): Optional<Long> = maximumDigits.getOptional("maximum_digits")

        /**
         * Maximum number of times to play the prompt if no input is received.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximumTries(): Optional<Long> = maximumTries.getOptional("maximum_tries")

        /**
         * The name of the media file uploaded to the Media Storage API to play as the gather
         * prompt.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaName(): Optional<String> = mediaName.getOptional("media_name")

        /**
         * Minimum number of digits to gather.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumDigits(): Optional<Long> = minimumDigits.getOptional("minimum_digits")

        /**
         * Whether to stop the audio playback when a DTMF digit is received.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stopPlaybackOnDtmf(): Optional<Boolean> =
            stopPlaybackOnDtmf.getOptional("stop_playback_on_dtmf")

        /**
         * Digit that terminates gathering.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun terminatingDigit(): Optional<String> = terminatingDigit.getOptional("terminating_digit")

        /**
         * Duration in milliseconds to wait for input before timing out.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeoutMillis(): Optional<Long> = timeoutMillis.getOptional("timeout_millis")

        /**
         * Digits that are valid for gathering. All other digits will be ignored.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun validDigits(): Optional<String> = validDigits.getOptional("valid_digits")

        /**
         * Returns the raw JSON value of [callControlId].
         *
         * Unlike [callControlId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_control_id")
        @ExcludeMissing
        fun _callControlId(): JsonField<String> = callControlId

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
         * Returns the raw JSON value of [gatherId].
         *
         * Unlike [gatherId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gather_id") @ExcludeMissing fun _gatherId(): JsonField<String> = gatherId

        /**
         * Returns the raw JSON value of [initialTimeoutMillis].
         *
         * Unlike [initialTimeoutMillis], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("initial_timeout_millis")
        @ExcludeMissing
        fun _initialTimeoutMillis(): JsonField<Long> = initialTimeoutMillis

        /**
         * Returns the raw JSON value of [interDigitTimeoutMillis].
         *
         * Unlike [interDigitTimeoutMillis], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inter_digit_timeout_millis")
        @ExcludeMissing
        fun _interDigitTimeoutMillis(): JsonField<Long> = interDigitTimeoutMillis

        /**
         * Returns the raw JSON value of [invalidAudioUrl].
         *
         * Unlike [invalidAudioUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invalid_audio_url")
        @ExcludeMissing
        fun _invalidAudioUrl(): JsonField<String> = invalidAudioUrl

        /**
         * Returns the raw JSON value of [invalidMediaName].
         *
         * Unlike [invalidMediaName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invalid_media_name")
        @ExcludeMissing
        fun _invalidMediaName(): JsonField<String> = invalidMediaName

        /**
         * Returns the raw JSON value of [maximumDigits].
         *
         * Unlike [maximumDigits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maximum_digits")
        @ExcludeMissing
        fun _maximumDigits(): JsonField<Long> = maximumDigits

        /**
         * Returns the raw JSON value of [maximumTries].
         *
         * Unlike [maximumTries], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maximum_tries")
        @ExcludeMissing
        fun _maximumTries(): JsonField<Long> = maximumTries

        /**
         * Returns the raw JSON value of [mediaName].
         *
         * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("media_name") @ExcludeMissing fun _mediaName(): JsonField<String> = mediaName

        /**
         * Returns the raw JSON value of [minimumDigits].
         *
         * Unlike [minimumDigits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimum_digits")
        @ExcludeMissing
        fun _minimumDigits(): JsonField<Long> = minimumDigits

        /**
         * Returns the raw JSON value of [stopPlaybackOnDtmf].
         *
         * Unlike [stopPlaybackOnDtmf], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("stop_playback_on_dtmf")
        @ExcludeMissing
        fun _stopPlaybackOnDtmf(): JsonField<Boolean> = stopPlaybackOnDtmf

        /**
         * Returns the raw JSON value of [terminatingDigit].
         *
         * Unlike [terminatingDigit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("terminating_digit")
        @ExcludeMissing
        fun _terminatingDigit(): JsonField<String> = terminatingDigit

        /**
         * Returns the raw JSON value of [timeoutMillis].
         *
         * Unlike [timeoutMillis], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeout_millis")
        @ExcludeMissing
        fun _timeoutMillis(): JsonField<Long> = timeoutMillis

        /**
         * Returns the raw JSON value of [validDigits].
         *
         * Unlike [validDigits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("valid_digits")
        @ExcludeMissing
        fun _validDigits(): JsonField<String> = validDigits

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
             * .callControlId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var callControlId: JsonField<String>? = null
            private var audioUrl: JsonField<String> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var gatherId: JsonField<String> = JsonMissing.of()
            private var initialTimeoutMillis: JsonField<Long> = JsonMissing.of()
            private var interDigitTimeoutMillis: JsonField<Long> = JsonMissing.of()
            private var invalidAudioUrl: JsonField<String> = JsonMissing.of()
            private var invalidMediaName: JsonField<String> = JsonMissing.of()
            private var maximumDigits: JsonField<Long> = JsonMissing.of()
            private var maximumTries: JsonField<Long> = JsonMissing.of()
            private var mediaName: JsonField<String> = JsonMissing.of()
            private var minimumDigits: JsonField<Long> = JsonMissing.of()
            private var stopPlaybackOnDtmf: JsonField<Boolean> = JsonMissing.of()
            private var terminatingDigit: JsonField<String> = JsonMissing.of()
            private var timeoutMillis: JsonField<Long> = JsonMissing.of()
            private var validDigits: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                callControlId = body.callControlId
                audioUrl = body.audioUrl
                clientState = body.clientState
                gatherId = body.gatherId
                initialTimeoutMillis = body.initialTimeoutMillis
                interDigitTimeoutMillis = body.interDigitTimeoutMillis
                invalidAudioUrl = body.invalidAudioUrl
                invalidMediaName = body.invalidMediaName
                maximumDigits = body.maximumDigits
                maximumTries = body.maximumTries
                mediaName = body.mediaName
                minimumDigits = body.minimumDigits
                stopPlaybackOnDtmf = body.stopPlaybackOnDtmf
                terminatingDigit = body.terminatingDigit
                timeoutMillis = body.timeoutMillis
                validDigits = body.validDigits
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Unique identifier and token for controlling the call leg that will receive the gather
             * prompt.
             */
            fun callControlId(callControlId: String) = callControlId(JsonField.of(callControlId))

            /**
             * Sets [Builder.callControlId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callControlId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callControlId(callControlId: JsonField<String>) = apply {
                this.callControlId = callControlId
            }

            /**
             * The URL of the audio file to play as the gather prompt. Must be WAV or MP3 format.
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
             * Use this field to add state to every subsequent webhook. Must be a valid Base-64
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
             * Identifier for this gather command. Will be included in the gather ended webhook.
             * Maximum 100 characters.
             */
            fun gatherId(gatherId: String) = gatherId(JsonField.of(gatherId))

            /**
             * Sets [Builder.gatherId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gatherId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gatherId(gatherId: JsonField<String>) = apply { this.gatherId = gatherId }

            /** Duration in milliseconds to wait for the first digit before timing out. */
            fun initialTimeoutMillis(initialTimeoutMillis: Long) =
                initialTimeoutMillis(JsonField.of(initialTimeoutMillis))

            /**
             * Sets [Builder.initialTimeoutMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initialTimeoutMillis] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun initialTimeoutMillis(initialTimeoutMillis: JsonField<Long>) = apply {
                this.initialTimeoutMillis = initialTimeoutMillis
            }

            /** Duration in milliseconds to wait between digits. */
            fun interDigitTimeoutMillis(interDigitTimeoutMillis: Long) =
                interDigitTimeoutMillis(JsonField.of(interDigitTimeoutMillis))

            /**
             * Sets [Builder.interDigitTimeoutMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interDigitTimeoutMillis] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun interDigitTimeoutMillis(interDigitTimeoutMillis: JsonField<Long>) = apply {
                this.interDigitTimeoutMillis = interDigitTimeoutMillis
            }

            /** URL of audio file to play when invalid input is received. */
            fun invalidAudioUrl(invalidAudioUrl: String) =
                invalidAudioUrl(JsonField.of(invalidAudioUrl))

            /**
             * Sets [Builder.invalidAudioUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invalidAudioUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invalidAudioUrl(invalidAudioUrl: JsonField<String>) = apply {
                this.invalidAudioUrl = invalidAudioUrl
            }

            /** Name of media file to play when invalid input is received. */
            fun invalidMediaName(invalidMediaName: String) =
                invalidMediaName(JsonField.of(invalidMediaName))

            /**
             * Sets [Builder.invalidMediaName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invalidMediaName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invalidMediaName(invalidMediaName: JsonField<String>) = apply {
                this.invalidMediaName = invalidMediaName
            }

            /** Maximum number of digits to gather. */
            fun maximumDigits(maximumDigits: Long) = maximumDigits(JsonField.of(maximumDigits))

            /**
             * Sets [Builder.maximumDigits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumDigits] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumDigits(maximumDigits: JsonField<Long>) = apply {
                this.maximumDigits = maximumDigits
            }

            /** Maximum number of times to play the prompt if no input is received. */
            fun maximumTries(maximumTries: Long) = maximumTries(JsonField.of(maximumTries))

            /**
             * Sets [Builder.maximumTries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumTries] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumTries(maximumTries: JsonField<Long>) = apply {
                this.maximumTries = maximumTries
            }

            /**
             * The name of the media file uploaded to the Media Storage API to play as the gather
             * prompt.
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

            /** Minimum number of digits to gather. */
            fun minimumDigits(minimumDigits: Long) = minimumDigits(JsonField.of(minimumDigits))

            /**
             * Sets [Builder.minimumDigits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumDigits] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimumDigits(minimumDigits: JsonField<Long>) = apply {
                this.minimumDigits = minimumDigits
            }

            /** Whether to stop the audio playback when a DTMF digit is received. */
            fun stopPlaybackOnDtmf(stopPlaybackOnDtmf: Boolean) =
                stopPlaybackOnDtmf(JsonField.of(stopPlaybackOnDtmf))

            /**
             * Sets [Builder.stopPlaybackOnDtmf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stopPlaybackOnDtmf] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun stopPlaybackOnDtmf(stopPlaybackOnDtmf: JsonField<Boolean>) = apply {
                this.stopPlaybackOnDtmf = stopPlaybackOnDtmf
            }

            /** Digit that terminates gathering. */
            fun terminatingDigit(terminatingDigit: String) =
                terminatingDigit(JsonField.of(terminatingDigit))

            /**
             * Sets [Builder.terminatingDigit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.terminatingDigit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun terminatingDigit(terminatingDigit: JsonField<String>) = apply {
                this.terminatingDigit = terminatingDigit
            }

            /** Duration in milliseconds to wait for input before timing out. */
            fun timeoutMillis(timeoutMillis: Long) = timeoutMillis(JsonField.of(timeoutMillis))

            /**
             * Sets [Builder.timeoutMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeoutMillis] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeoutMillis(timeoutMillis: JsonField<Long>) = apply {
                this.timeoutMillis = timeoutMillis
            }

            /** Digits that are valid for gathering. All other digits will be ignored. */
            fun validDigits(validDigits: String) = validDigits(JsonField.of(validDigits))

            /**
             * Sets [Builder.validDigits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.validDigits] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun validDigits(validDigits: JsonField<String>) = apply {
                this.validDigits = validDigits
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
             * .callControlId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("callControlId", callControlId),
                    audioUrl,
                    clientState,
                    gatherId,
                    initialTimeoutMillis,
                    interDigitTimeoutMillis,
                    invalidAudioUrl,
                    invalidMediaName,
                    maximumDigits,
                    maximumTries,
                    mediaName,
                    minimumDigits,
                    stopPlaybackOnDtmf,
                    terminatingDigit,
                    timeoutMillis,
                    validDigits,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            callControlId()
            audioUrl()
            clientState()
            gatherId()
            initialTimeoutMillis()
            interDigitTimeoutMillis()
            invalidAudioUrl()
            invalidMediaName()
            maximumDigits()
            maximumTries()
            mediaName()
            minimumDigits()
            stopPlaybackOnDtmf()
            terminatingDigit()
            timeoutMillis()
            validDigits()
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
            (if (callControlId.asKnown().isPresent) 1 else 0) +
                (if (audioUrl.asKnown().isPresent) 1 else 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (gatherId.asKnown().isPresent) 1 else 0) +
                (if (initialTimeoutMillis.asKnown().isPresent) 1 else 0) +
                (if (interDigitTimeoutMillis.asKnown().isPresent) 1 else 0) +
                (if (invalidAudioUrl.asKnown().isPresent) 1 else 0) +
                (if (invalidMediaName.asKnown().isPresent) 1 else 0) +
                (if (maximumDigits.asKnown().isPresent) 1 else 0) +
                (if (maximumTries.asKnown().isPresent) 1 else 0) +
                (if (mediaName.asKnown().isPresent) 1 else 0) +
                (if (minimumDigits.asKnown().isPresent) 1 else 0) +
                (if (stopPlaybackOnDtmf.asKnown().isPresent) 1 else 0) +
                (if (terminatingDigit.asKnown().isPresent) 1 else 0) +
                (if (timeoutMillis.asKnown().isPresent) 1 else 0) +
                (if (validDigits.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                callControlId == other.callControlId &&
                audioUrl == other.audioUrl &&
                clientState == other.clientState &&
                gatherId == other.gatherId &&
                initialTimeoutMillis == other.initialTimeoutMillis &&
                interDigitTimeoutMillis == other.interDigitTimeoutMillis &&
                invalidAudioUrl == other.invalidAudioUrl &&
                invalidMediaName == other.invalidMediaName &&
                maximumDigits == other.maximumDigits &&
                maximumTries == other.maximumTries &&
                mediaName == other.mediaName &&
                minimumDigits == other.minimumDigits &&
                stopPlaybackOnDtmf == other.stopPlaybackOnDtmf &&
                terminatingDigit == other.terminatingDigit &&
                timeoutMillis == other.timeoutMillis &&
                validDigits == other.validDigits &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                callControlId,
                audioUrl,
                clientState,
                gatherId,
                initialTimeoutMillis,
                interDigitTimeoutMillis,
                invalidAudioUrl,
                invalidMediaName,
                maximumDigits,
                maximumTries,
                mediaName,
                minimumDigits,
                stopPlaybackOnDtmf,
                terminatingDigit,
                timeoutMillis,
                validDigits,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{callControlId=$callControlId, audioUrl=$audioUrl, clientState=$clientState, gatherId=$gatherId, initialTimeoutMillis=$initialTimeoutMillis, interDigitTimeoutMillis=$interDigitTimeoutMillis, invalidAudioUrl=$invalidAudioUrl, invalidMediaName=$invalidMediaName, maximumDigits=$maximumDigits, maximumTries=$maximumTries, mediaName=$mediaName, minimumDigits=$minimumDigits, stopPlaybackOnDtmf=$stopPlaybackOnDtmf, terminatingDigit=$terminatingDigit, timeoutMillis=$timeoutMillis, validDigits=$validDigits, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionGatherUsingAudioParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionGatherUsingAudioParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
