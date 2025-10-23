// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Play an audio file on the call until the required DTMF signals are gathered to build interactive
 * menus.
 *
 * You can pass a list of valid digits along with an 'invalid_audio_url', which will be played back
 * at the beginning of each prompt. Playback will be interrupted when a DTMF signal is received. The
 * `Answer command must be issued before the `gather_using_audio` command.
 *
 * **Expected Webhooks:**
 * - `call.playback.started`
 * - `call.playback.ended`
 * - `call.dtmf.received` (you may receive many of these webhooks)
 * - `call.gather.ended`
 */
class ActionGatherUsingAudioParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    /**
     * The URL of a file to be played back at the beginning of each prompt. The URL can point to
     * either a WAV or MP3 file. media_name and audio_url cannot be used together in one request.
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
     * The number of milliseconds to wait for input between digits.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interDigitTimeoutMillis(): Optional<Int> = body.interDigitTimeoutMillis()

    /**
     * The URL of a file to play when digits don't match the `valid_digits` parameter or the number
     * of digits is not between `min` and `max`. The URL can point to either a WAV or MP3 file.
     * invalid_media_name and invalid_audio_url cannot be used together in one request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invalidAudioUrl(): Optional<String> = body.invalidAudioUrl()

    /**
     * The media_name of a file to be played back when digits don't match the `valid_digits`
     * parameter or the number of digits is not between `min` and `max`. The media_name must point
     * to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The
     * file must either be a WAV or MP3 file.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invalidMediaName(): Optional<String> = body.invalidMediaName()

    /**
     * The maximum number of digits to fetch. This parameter has a maximum value of 128.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maximumDigits(): Optional<Int> = body.maximumDigits()

    /**
     * The maximum number of times the file should be played if there is no input from the user on
     * the call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maximumTries(): Optional<Int> = body.maximumTries()

    /**
     * The media_name of a file to be played back at the beginning of each prompt. The media_name
     * must point to a file previously uploaded to api.telnyx.com/v2/media by the same
     * user/organization. The file must either be a WAV or MP3 file.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaName(): Optional<String> = body.mediaName()

    /**
     * The minimum number of digits to fetch. This parameter has a minimum value of 1.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumDigits(): Optional<Int> = body.minimumDigits()

    /**
     * The digit used to terminate input if fewer than `maximum_digits` digits have been gathered.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun terminatingDigit(): Optional<String> = body.terminatingDigit()

    /**
     * The number of milliseconds to wait for a DTMF response after file playback ends before a
     * replaying the sound file.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutMillis(): Optional<Int> = body.timeoutMillis()

    /**
     * A list of all digits accepted as valid.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validDigits(): Optional<String> = body.validDigits()

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
     * Returns the raw JSON value of [interDigitTimeoutMillis].
     *
     * Unlike [interDigitTimeoutMillis], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _interDigitTimeoutMillis(): JsonField<Int> = body._interDigitTimeoutMillis()

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
    fun _maximumDigits(): JsonField<Int> = body._maximumDigits()

    /**
     * Returns the raw JSON value of [maximumTries].
     *
     * Unlike [maximumTries], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maximumTries(): JsonField<Int> = body._maximumTries()

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
    fun _minimumDigits(): JsonField<Int> = body._minimumDigits()

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
    fun _timeoutMillis(): JsonField<Int> = body._timeoutMillis()

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

        @JvmStatic fun none(): ActionGatherUsingAudioParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ActionGatherUsingAudioParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionGatherUsingAudioParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionGatherUsingAudioParams: ActionGatherUsingAudioParams) = apply {
            callControlId = actionGatherUsingAudioParams.callControlId
            body = actionGatherUsingAudioParams.body.toBuilder()
            additionalHeaders = actionGatherUsingAudioParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionGatherUsingAudioParams.additionalQueryParams.toBuilder()
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
         * - [audioUrl]
         * - [clientState]
         * - [commandId]
         * - [interDigitTimeoutMillis]
         * - [invalidAudioUrl]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The URL of a file to be played back at the beginning of each prompt. The URL can point to
         * either a WAV or MP3 file. media_name and audio_url cannot be used together in one
         * request.
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

        /** The number of milliseconds to wait for input between digits. */
        fun interDigitTimeoutMillis(interDigitTimeoutMillis: Int) = apply {
            body.interDigitTimeoutMillis(interDigitTimeoutMillis)
        }

        /**
         * Sets [Builder.interDigitTimeoutMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interDigitTimeoutMillis] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interDigitTimeoutMillis(interDigitTimeoutMillis: JsonField<Int>) = apply {
            body.interDigitTimeoutMillis(interDigitTimeoutMillis)
        }

        /**
         * The URL of a file to play when digits don't match the `valid_digits` parameter or the
         * number of digits is not between `min` and `max`. The URL can point to either a WAV or MP3
         * file. invalid_media_name and invalid_audio_url cannot be used together in one request.
         */
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

        /**
         * The media_name of a file to be played back when digits don't match the `valid_digits`
         * parameter or the number of digits is not between `min` and `max`. The media_name must
         * point to a file previously uploaded to api.telnyx.com/v2/media by the same
         * user/organization. The file must either be a WAV or MP3 file.
         */
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

        /** The maximum number of digits to fetch. This parameter has a maximum value of 128. */
        fun maximumDigits(maximumDigits: Int) = apply { body.maximumDigits(maximumDigits) }

        /**
         * Sets [Builder.maximumDigits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumDigits] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maximumDigits(maximumDigits: JsonField<Int>) = apply {
            body.maximumDigits(maximumDigits)
        }

        /**
         * The maximum number of times the file should be played if there is no input from the user
         * on the call.
         */
        fun maximumTries(maximumTries: Int) = apply { body.maximumTries(maximumTries) }

        /**
         * Sets [Builder.maximumTries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumTries] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maximumTries(maximumTries: JsonField<Int>) = apply { body.maximumTries(maximumTries) }

        /**
         * The media_name of a file to be played back at the beginning of each prompt. The
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

        /** The minimum number of digits to fetch. This parameter has a minimum value of 1. */
        fun minimumDigits(minimumDigits: Int) = apply { body.minimumDigits(minimumDigits) }

        /**
         * Sets [Builder.minimumDigits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumDigits] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minimumDigits(minimumDigits: JsonField<Int>) = apply {
            body.minimumDigits(minimumDigits)
        }

        /**
         * The digit used to terminate input if fewer than `maximum_digits` digits have been
         * gathered.
         */
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

        /**
         * The number of milliseconds to wait for a DTMF response after file playback ends before a
         * replaying the sound file.
         */
        fun timeoutMillis(timeoutMillis: Int) = apply { body.timeoutMillis(timeoutMillis) }

        /**
         * Sets [Builder.timeoutMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutMillis] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeoutMillis(timeoutMillis: JsonField<Int>) = apply {
            body.timeoutMillis(timeoutMillis)
        }

        /** A list of all digits accepted as valid. */
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
         */
        fun build(): ActionGatherUsingAudioParams =
            ActionGatherUsingAudioParams(
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
        private val audioUrl: JsonField<String>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val interDigitTimeoutMillis: JsonField<Int>,
        private val invalidAudioUrl: JsonField<String>,
        private val invalidMediaName: JsonField<String>,
        private val maximumDigits: JsonField<Int>,
        private val maximumTries: JsonField<Int>,
        private val mediaName: JsonField<String>,
        private val minimumDigits: JsonField<Int>,
        private val terminatingDigit: JsonField<String>,
        private val timeoutMillis: JsonField<Int>,
        private val validDigits: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("audio_url")
            @ExcludeMissing
            audioUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inter_digit_timeout_millis")
            @ExcludeMissing
            interDigitTimeoutMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("invalid_audio_url")
            @ExcludeMissing
            invalidAudioUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invalid_media_name")
            @ExcludeMissing
            invalidMediaName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maximum_digits")
            @ExcludeMissing
            maximumDigits: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("maximum_tries")
            @ExcludeMissing
            maximumTries: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("media_name")
            @ExcludeMissing
            mediaName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimum_digits")
            @ExcludeMissing
            minimumDigits: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("terminating_digit")
            @ExcludeMissing
            terminatingDigit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeout_millis")
            @ExcludeMissing
            timeoutMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("valid_digits")
            @ExcludeMissing
            validDigits: JsonField<String> = JsonMissing.of(),
        ) : this(
            audioUrl,
            clientState,
            commandId,
            interDigitTimeoutMillis,
            invalidAudioUrl,
            invalidMediaName,
            maximumDigits,
            maximumTries,
            mediaName,
            minimumDigits,
            terminatingDigit,
            timeoutMillis,
            validDigits,
            mutableMapOf(),
        )

        /**
         * The URL of a file to be played back at the beginning of each prompt. The URL can point to
         * either a WAV or MP3 file. media_name and audio_url cannot be used together in one
         * request.
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
         * The number of milliseconds to wait for input between digits.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interDigitTimeoutMillis(): Optional<Int> =
            interDigitTimeoutMillis.getOptional("inter_digit_timeout_millis")

        /**
         * The URL of a file to play when digits don't match the `valid_digits` parameter or the
         * number of digits is not between `min` and `max`. The URL can point to either a WAV or MP3
         * file. invalid_media_name and invalid_audio_url cannot be used together in one request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invalidAudioUrl(): Optional<String> = invalidAudioUrl.getOptional("invalid_audio_url")

        /**
         * The media_name of a file to be played back when digits don't match the `valid_digits`
         * parameter or the number of digits is not between `min` and `max`. The media_name must
         * point to a file previously uploaded to api.telnyx.com/v2/media by the same
         * user/organization. The file must either be a WAV or MP3 file.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invalidMediaName(): Optional<String> =
            invalidMediaName.getOptional("invalid_media_name")

        /**
         * The maximum number of digits to fetch. This parameter has a maximum value of 128.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximumDigits(): Optional<Int> = maximumDigits.getOptional("maximum_digits")

        /**
         * The maximum number of times the file should be played if there is no input from the user
         * on the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximumTries(): Optional<Int> = maximumTries.getOptional("maximum_tries")

        /**
         * The media_name of a file to be played back at the beginning of each prompt. The
         * media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the
         * same user/organization. The file must either be a WAV or MP3 file.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaName(): Optional<String> = mediaName.getOptional("media_name")

        /**
         * The minimum number of digits to fetch. This parameter has a minimum value of 1.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumDigits(): Optional<Int> = minimumDigits.getOptional("minimum_digits")

        /**
         * The digit used to terminate input if fewer than `maximum_digits` digits have been
         * gathered.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun terminatingDigit(): Optional<String> = terminatingDigit.getOptional("terminating_digit")

        /**
         * The number of milliseconds to wait for a DTMF response after file playback ends before a
         * replaying the sound file.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeoutMillis(): Optional<Int> = timeoutMillis.getOptional("timeout_millis")

        /**
         * A list of all digits accepted as valid.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun validDigits(): Optional<String> = validDigits.getOptional("valid_digits")

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
         * Returns the raw JSON value of [interDigitTimeoutMillis].
         *
         * Unlike [interDigitTimeoutMillis], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inter_digit_timeout_millis")
        @ExcludeMissing
        fun _interDigitTimeoutMillis(): JsonField<Int> = interDigitTimeoutMillis

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
        fun _maximumDigits(): JsonField<Int> = maximumDigits

        /**
         * Returns the raw JSON value of [maximumTries].
         *
         * Unlike [maximumTries], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maximum_tries")
        @ExcludeMissing
        fun _maximumTries(): JsonField<Int> = maximumTries

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
        fun _minimumDigits(): JsonField<Int> = minimumDigits

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
        fun _timeoutMillis(): JsonField<Int> = timeoutMillis

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var audioUrl: JsonField<String> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var interDigitTimeoutMillis: JsonField<Int> = JsonMissing.of()
            private var invalidAudioUrl: JsonField<String> = JsonMissing.of()
            private var invalidMediaName: JsonField<String> = JsonMissing.of()
            private var maximumDigits: JsonField<Int> = JsonMissing.of()
            private var maximumTries: JsonField<Int> = JsonMissing.of()
            private var mediaName: JsonField<String> = JsonMissing.of()
            private var minimumDigits: JsonField<Int> = JsonMissing.of()
            private var terminatingDigit: JsonField<String> = JsonMissing.of()
            private var timeoutMillis: JsonField<Int> = JsonMissing.of()
            private var validDigits: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                audioUrl = body.audioUrl
                clientState = body.clientState
                commandId = body.commandId
                interDigitTimeoutMillis = body.interDigitTimeoutMillis
                invalidAudioUrl = body.invalidAudioUrl
                invalidMediaName = body.invalidMediaName
                maximumDigits = body.maximumDigits
                maximumTries = body.maximumTries
                mediaName = body.mediaName
                minimumDigits = body.minimumDigits
                terminatingDigit = body.terminatingDigit
                timeoutMillis = body.timeoutMillis
                validDigits = body.validDigits
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The URL of a file to be played back at the beginning of each prompt. The URL can
             * point to either a WAV or MP3 file. media_name and audio_url cannot be used together
             * in one request.
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

            /** The number of milliseconds to wait for input between digits. */
            fun interDigitTimeoutMillis(interDigitTimeoutMillis: Int) =
                interDigitTimeoutMillis(JsonField.of(interDigitTimeoutMillis))

            /**
             * Sets [Builder.interDigitTimeoutMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interDigitTimeoutMillis] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun interDigitTimeoutMillis(interDigitTimeoutMillis: JsonField<Int>) = apply {
                this.interDigitTimeoutMillis = interDigitTimeoutMillis
            }

            /**
             * The URL of a file to play when digits don't match the `valid_digits` parameter or the
             * number of digits is not between `min` and `max`. The URL can point to either a WAV or
             * MP3 file. invalid_media_name and invalid_audio_url cannot be used together in one
             * request.
             */
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

            /**
             * The media_name of a file to be played back when digits don't match the `valid_digits`
             * parameter or the number of digits is not between `min` and `max`. The media_name must
             * point to a file previously uploaded to api.telnyx.com/v2/media by the same
             * user/organization. The file must either be a WAV or MP3 file.
             */
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

            /** The maximum number of digits to fetch. This parameter has a maximum value of 128. */
            fun maximumDigits(maximumDigits: Int) = maximumDigits(JsonField.of(maximumDigits))

            /**
             * Sets [Builder.maximumDigits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumDigits] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumDigits(maximumDigits: JsonField<Int>) = apply {
                this.maximumDigits = maximumDigits
            }

            /**
             * The maximum number of times the file should be played if there is no input from the
             * user on the call.
             */
            fun maximumTries(maximumTries: Int) = maximumTries(JsonField.of(maximumTries))

            /**
             * Sets [Builder.maximumTries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumTries] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumTries(maximumTries: JsonField<Int>) = apply {
                this.maximumTries = maximumTries
            }

            /**
             * The media_name of a file to be played back at the beginning of each prompt. The
             * media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the
             * same user/organization. The file must either be a WAV or MP3 file.
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

            /** The minimum number of digits to fetch. This parameter has a minimum value of 1. */
            fun minimumDigits(minimumDigits: Int) = minimumDigits(JsonField.of(minimumDigits))

            /**
             * Sets [Builder.minimumDigits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumDigits] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimumDigits(minimumDigits: JsonField<Int>) = apply {
                this.minimumDigits = minimumDigits
            }

            /**
             * The digit used to terminate input if fewer than `maximum_digits` digits have been
             * gathered.
             */
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

            /**
             * The number of milliseconds to wait for a DTMF response after file playback ends
             * before a replaying the sound file.
             */
            fun timeoutMillis(timeoutMillis: Int) = timeoutMillis(JsonField.of(timeoutMillis))

            /**
             * Sets [Builder.timeoutMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeoutMillis] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeoutMillis(timeoutMillis: JsonField<Int>) = apply {
                this.timeoutMillis = timeoutMillis
            }

            /** A list of all digits accepted as valid. */
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
             */
            fun build(): Body =
                Body(
                    audioUrl,
                    clientState,
                    commandId,
                    interDigitTimeoutMillis,
                    invalidAudioUrl,
                    invalidMediaName,
                    maximumDigits,
                    maximumTries,
                    mediaName,
                    minimumDigits,
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

            audioUrl()
            clientState()
            commandId()
            interDigitTimeoutMillis()
            invalidAudioUrl()
            invalidMediaName()
            maximumDigits()
            maximumTries()
            mediaName()
            minimumDigits()
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
            (if (audioUrl.asKnown().isPresent) 1 else 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (if (interDigitTimeoutMillis.asKnown().isPresent) 1 else 0) +
                (if (invalidAudioUrl.asKnown().isPresent) 1 else 0) +
                (if (invalidMediaName.asKnown().isPresent) 1 else 0) +
                (if (maximumDigits.asKnown().isPresent) 1 else 0) +
                (if (maximumTries.asKnown().isPresent) 1 else 0) +
                (if (mediaName.asKnown().isPresent) 1 else 0) +
                (if (minimumDigits.asKnown().isPresent) 1 else 0) +
                (if (terminatingDigit.asKnown().isPresent) 1 else 0) +
                (if (timeoutMillis.asKnown().isPresent) 1 else 0) +
                (if (validDigits.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                audioUrl == other.audioUrl &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                interDigitTimeoutMillis == other.interDigitTimeoutMillis &&
                invalidAudioUrl == other.invalidAudioUrl &&
                invalidMediaName == other.invalidMediaName &&
                maximumDigits == other.maximumDigits &&
                maximumTries == other.maximumTries &&
                mediaName == other.mediaName &&
                minimumDigits == other.minimumDigits &&
                terminatingDigit == other.terminatingDigit &&
                timeoutMillis == other.timeoutMillis &&
                validDigits == other.validDigits &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                audioUrl,
                clientState,
                commandId,
                interDigitTimeoutMillis,
                invalidAudioUrl,
                invalidMediaName,
                maximumDigits,
                maximumTries,
                mediaName,
                minimumDigits,
                terminatingDigit,
                timeoutMillis,
                validDigits,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{audioUrl=$audioUrl, clientState=$clientState, commandId=$commandId, interDigitTimeoutMillis=$interDigitTimeoutMillis, invalidAudioUrl=$invalidAudioUrl, invalidMediaName=$invalidMediaName, maximumDigits=$maximumDigits, maximumTries=$maximumTries, mediaName=$mediaName, minimumDigits=$minimumDigits, terminatingDigit=$terminatingDigit, timeoutMillis=$timeoutMillis, validDigits=$validDigits, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionGatherUsingAudioParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionGatherUsingAudioParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
