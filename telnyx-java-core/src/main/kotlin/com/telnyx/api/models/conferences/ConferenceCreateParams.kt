// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences

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

/**
 * Create a conference from an existing call leg using a `call_control_id` and a conference name.
 * Upon creating the conference, the call will be automatically bridged to the conference.
 * Conferences will expire after all participants have left the conference or after 4 hours
 * regardless of the number of active participants.
 *
 * **Expected Webhooks:**
 * - `conference.created`
 * - `conference.participant.joined`
 * - `conference.participant.left`
 * - `conference.ended`
 * - `conference.recording.saved`
 * - `conference.floor.changed`
 */
class ConferenceCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Unique identifier and token for controlling the call
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callControlId(): String = body.callControlId()

    /**
     * Name of the conference
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Whether a beep sound should be played when participants join and/or leave the conference.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beepEnabled(): Optional<BeepEnabled> = body.beepEnabled()

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded
     * string. The client_state will be updated for the creator call leg and will be used for all
     * webhooks related to the created conference.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = body.clientState()

    /**
     * Toggle background comfort noise.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comfortNoise(): Optional<Boolean> = body.comfortNoise()

    /**
     * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent
     * commands with the same `command_id` as one that has already been executed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commandId(): Optional<String> = body.commandId()

    /**
     * Time length (minutes) after which the conference will end.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationMinutes(): Optional<Long> = body.durationMinutes()

    /**
     * The URL of a file to be played to participants joining the conference. The URL can point to
     * either a WAV or MP3 file. hold_media_name and hold_audio_url cannot be used together in one
     * request. Takes effect only when "start_conference_on_create" is set to "false".
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun holdAudioUrl(): Optional<String> = body.holdAudioUrl()

    /**
     * The media_name of a file to be played to participants joining the conference. The media_name
     * must point to a file previously uploaded to api.telnyx.com/v2/media by the same
     * user/organization. The file must either be a WAV or MP3 file. Takes effect only when
     * "start_conference_on_create" is set to "false".
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun holdMediaName(): Optional<String> = body.holdMediaName()

    /**
     * The maximum number of active conference participants to allow. Must be between 2 and 800.
     * Defaults to 250
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxParticipants(): Optional<Long> = body.maxParticipants()

    /**
     * Whether the conference should be started on creation. If the conference isn't started all
     * participants that join are automatically put on hold. Defaults to "true".
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startConferenceOnCreate(): Optional<Boolean> = body.startConferenceOnCreate()

    /**
     * Returns the raw JSON value of [callControlId].
     *
     * Unlike [callControlId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callControlId(): JsonField<String> = body._callControlId()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [beepEnabled].
     *
     * Unlike [beepEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _beepEnabled(): JsonField<BeepEnabled> = body._beepEnabled()

    /**
     * Returns the raw JSON value of [clientState].
     *
     * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientState(): JsonField<String> = body._clientState()

    /**
     * Returns the raw JSON value of [comfortNoise].
     *
     * Unlike [comfortNoise], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _comfortNoise(): JsonField<Boolean> = body._comfortNoise()

    /**
     * Returns the raw JSON value of [commandId].
     *
     * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commandId(): JsonField<String> = body._commandId()

    /**
     * Returns the raw JSON value of [durationMinutes].
     *
     * Unlike [durationMinutes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _durationMinutes(): JsonField<Long> = body._durationMinutes()

    /**
     * Returns the raw JSON value of [holdAudioUrl].
     *
     * Unlike [holdAudioUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _holdAudioUrl(): JsonField<String> = body._holdAudioUrl()

    /**
     * Returns the raw JSON value of [holdMediaName].
     *
     * Unlike [holdMediaName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _holdMediaName(): JsonField<String> = body._holdMediaName()

    /**
     * Returns the raw JSON value of [maxParticipants].
     *
     * Unlike [maxParticipants], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxParticipants(): JsonField<Long> = body._maxParticipants()

    /**
     * Returns the raw JSON value of [startConferenceOnCreate].
     *
     * Unlike [startConferenceOnCreate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _startConferenceOnCreate(): JsonField<Boolean> = body._startConferenceOnCreate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConferenceCreateParams].
         *
         * The following fields are required:
         * ```java
         * .callControlId()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConferenceCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(conferenceCreateParams: ConferenceCreateParams) = apply {
            body = conferenceCreateParams.body.toBuilder()
            additionalHeaders = conferenceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = conferenceCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [callControlId]
         * - [name]
         * - [beepEnabled]
         * - [clientState]
         * - [comfortNoise]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Unique identifier and token for controlling the call */
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

        /** Name of the conference */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Whether a beep sound should be played when participants join and/or leave the conference.
         */
        fun beepEnabled(beepEnabled: BeepEnabled) = apply { body.beepEnabled(beepEnabled) }

        /**
         * Sets [Builder.beepEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beepEnabled] with a well-typed [BeepEnabled] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun beepEnabled(beepEnabled: JsonField<BeepEnabled>) = apply {
            body.beepEnabled(beepEnabled)
        }

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string. The client_state will be updated for the creator call leg and will be
         * used for all webhooks related to the created conference.
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

        /** Toggle background comfort noise. */
        fun comfortNoise(comfortNoise: Boolean) = apply { body.comfortNoise(comfortNoise) }

        /**
         * Sets [Builder.comfortNoise] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comfortNoise] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun comfortNoise(comfortNoise: JsonField<Boolean>) = apply {
            body.comfortNoise(comfortNoise)
        }

        /**
         * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent
         * commands with the same `command_id` as one that has already been executed.
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

        /** Time length (minutes) after which the conference will end. */
        fun durationMinutes(durationMinutes: Long) = apply { body.durationMinutes(durationMinutes) }

        /**
         * Sets [Builder.durationMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationMinutes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun durationMinutes(durationMinutes: JsonField<Long>) = apply {
            body.durationMinutes(durationMinutes)
        }

        /**
         * The URL of a file to be played to participants joining the conference. The URL can point
         * to either a WAV or MP3 file. hold_media_name and hold_audio_url cannot be used together
         * in one request. Takes effect only when "start_conference_on_create" is set to "false".
         */
        fun holdAudioUrl(holdAudioUrl: String) = apply { body.holdAudioUrl(holdAudioUrl) }

        /**
         * Sets [Builder.holdAudioUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.holdAudioUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun holdAudioUrl(holdAudioUrl: JsonField<String>) = apply {
            body.holdAudioUrl(holdAudioUrl)
        }

        /**
         * The media_name of a file to be played to participants joining the conference. The
         * media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the
         * same user/organization. The file must either be a WAV or MP3 file. Takes effect only when
         * "start_conference_on_create" is set to "false".
         */
        fun holdMediaName(holdMediaName: String) = apply { body.holdMediaName(holdMediaName) }

        /**
         * Sets [Builder.holdMediaName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.holdMediaName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun holdMediaName(holdMediaName: JsonField<String>) = apply {
            body.holdMediaName(holdMediaName)
        }

        /**
         * The maximum number of active conference participants to allow. Must be between 2 and 800.
         * Defaults to 250
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

        /**
         * Whether the conference should be started on creation. If the conference isn't started all
         * participants that join are automatically put on hold. Defaults to "true".
         */
        fun startConferenceOnCreate(startConferenceOnCreate: Boolean) = apply {
            body.startConferenceOnCreate(startConferenceOnCreate)
        }

        /**
         * Sets [Builder.startConferenceOnCreate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startConferenceOnCreate] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun startConferenceOnCreate(startConferenceOnCreate: JsonField<Boolean>) = apply {
            body.startConferenceOnCreate(startConferenceOnCreate)
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
         * Returns an immutable instance of [ConferenceCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .callControlId()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConferenceCreateParams =
            ConferenceCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val callControlId: JsonField<String>,
        private val name: JsonField<String>,
        private val beepEnabled: JsonField<BeepEnabled>,
        private val clientState: JsonField<String>,
        private val comfortNoise: JsonField<Boolean>,
        private val commandId: JsonField<String>,
        private val durationMinutes: JsonField<Long>,
        private val holdAudioUrl: JsonField<String>,
        private val holdMediaName: JsonField<String>,
        private val maxParticipants: JsonField<Long>,
        private val startConferenceOnCreate: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("call_control_id")
            @ExcludeMissing
            callControlId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("beep_enabled")
            @ExcludeMissing
            beepEnabled: JsonField<BeepEnabled> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("comfort_noise")
            @ExcludeMissing
            comfortNoise: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("duration_minutes")
            @ExcludeMissing
            durationMinutes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("hold_audio_url")
            @ExcludeMissing
            holdAudioUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hold_media_name")
            @ExcludeMissing
            holdMediaName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_participants")
            @ExcludeMissing
            maxParticipants: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("start_conference_on_create")
            @ExcludeMissing
            startConferenceOnCreate: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            callControlId,
            name,
            beepEnabled,
            clientState,
            comfortNoise,
            commandId,
            durationMinutes,
            holdAudioUrl,
            holdMediaName,
            maxParticipants,
            startConferenceOnCreate,
            mutableMapOf(),
        )

        /**
         * Unique identifier and token for controlling the call
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun callControlId(): String = callControlId.getRequired("call_control_id")

        /**
         * Name of the conference
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Whether a beep sound should be played when participants join and/or leave the conference.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun beepEnabled(): Optional<BeepEnabled> = beepEnabled.getOptional("beep_enabled")

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string. The client_state will be updated for the creator call leg and will be
         * used for all webhooks related to the created conference.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientState(): Optional<String> = clientState.getOptional("client_state")

        /**
         * Toggle background comfort noise.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun comfortNoise(): Optional<Boolean> = comfortNoise.getOptional("comfort_noise")

        /**
         * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent
         * commands with the same `command_id` as one that has already been executed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commandId(): Optional<String> = commandId.getOptional("command_id")

        /**
         * Time length (minutes) after which the conference will end.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun durationMinutes(): Optional<Long> = durationMinutes.getOptional("duration_minutes")

        /**
         * The URL of a file to be played to participants joining the conference. The URL can point
         * to either a WAV or MP3 file. hold_media_name and hold_audio_url cannot be used together
         * in one request. Takes effect only when "start_conference_on_create" is set to "false".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun holdAudioUrl(): Optional<String> = holdAudioUrl.getOptional("hold_audio_url")

        /**
         * The media_name of a file to be played to participants joining the conference. The
         * media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the
         * same user/organization. The file must either be a WAV or MP3 file. Takes effect only when
         * "start_conference_on_create" is set to "false".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun holdMediaName(): Optional<String> = holdMediaName.getOptional("hold_media_name")

        /**
         * The maximum number of active conference participants to allow. Must be between 2 and 800.
         * Defaults to 250
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxParticipants(): Optional<Long> = maxParticipants.getOptional("max_participants")

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
         * Returns the raw JSON value of [callControlId].
         *
         * Unlike [callControlId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_control_id")
        @ExcludeMissing
        fun _callControlId(): JsonField<String> = callControlId

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [beepEnabled].
         *
         * Unlike [beepEnabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beep_enabled")
        @ExcludeMissing
        fun _beepEnabled(): JsonField<BeepEnabled> = beepEnabled

        /**
         * Returns the raw JSON value of [clientState].
         *
         * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_state")
        @ExcludeMissing
        fun _clientState(): JsonField<String> = clientState

        /**
         * Returns the raw JSON value of [comfortNoise].
         *
         * Unlike [comfortNoise], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("comfort_noise")
        @ExcludeMissing
        fun _comfortNoise(): JsonField<Boolean> = comfortNoise

        /**
         * Returns the raw JSON value of [commandId].
         *
         * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("command_id") @ExcludeMissing fun _commandId(): JsonField<String> = commandId

        /**
         * Returns the raw JSON value of [durationMinutes].
         *
         * Unlike [durationMinutes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("duration_minutes")
        @ExcludeMissing
        fun _durationMinutes(): JsonField<Long> = durationMinutes

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
         * Returns the raw JSON value of [maxParticipants].
         *
         * Unlike [maxParticipants], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_participants")
        @ExcludeMissing
        fun _maxParticipants(): JsonField<Long> = maxParticipants

        /**
         * Returns the raw JSON value of [startConferenceOnCreate].
         *
         * Unlike [startConferenceOnCreate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("start_conference_on_create")
        @ExcludeMissing
        fun _startConferenceOnCreate(): JsonField<Boolean> = startConferenceOnCreate

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
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var callControlId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var beepEnabled: JsonField<BeepEnabled> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var comfortNoise: JsonField<Boolean> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var durationMinutes: JsonField<Long> = JsonMissing.of()
            private var holdAudioUrl: JsonField<String> = JsonMissing.of()
            private var holdMediaName: JsonField<String> = JsonMissing.of()
            private var maxParticipants: JsonField<Long> = JsonMissing.of()
            private var startConferenceOnCreate: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                callControlId = body.callControlId
                name = body.name
                beepEnabled = body.beepEnabled
                clientState = body.clientState
                comfortNoise = body.comfortNoise
                commandId = body.commandId
                durationMinutes = body.durationMinutes
                holdAudioUrl = body.holdAudioUrl
                holdMediaName = body.holdMediaName
                maxParticipants = body.maxParticipants
                startConferenceOnCreate = body.startConferenceOnCreate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Unique identifier and token for controlling the call */
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

            /** Name of the conference */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Whether a beep sound should be played when participants join and/or leave the
             * conference.
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

            /**
             * Use this field to add state to every subsequent webhook. It must be a valid Base-64
             * encoded string. The client_state will be updated for the creator call leg and will be
             * used for all webhooks related to the created conference.
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

            /** Toggle background comfort noise. */
            fun comfortNoise(comfortNoise: Boolean) = comfortNoise(JsonField.of(comfortNoise))

            /**
             * Sets [Builder.comfortNoise] to an arbitrary JSON value.
             *
             * You should usually call [Builder.comfortNoise] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun comfortNoise(comfortNoise: JsonField<Boolean>) = apply {
                this.comfortNoise = comfortNoise
            }

            /**
             * Use this field to avoid execution of duplicate commands. Telnyx will ignore
             * subsequent commands with the same `command_id` as one that has already been executed.
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

            /** Time length (minutes) after which the conference will end. */
            fun durationMinutes(durationMinutes: Long) =
                durationMinutes(JsonField.of(durationMinutes))

            /**
             * Sets [Builder.durationMinutes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.durationMinutes] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun durationMinutes(durationMinutes: JsonField<Long>) = apply {
                this.durationMinutes = durationMinutes
            }

            /**
             * The URL of a file to be played to participants joining the conference. The URL can
             * point to either a WAV or MP3 file. hold_media_name and hold_audio_url cannot be used
             * together in one request. Takes effect only when "start_conference_on_create" is set
             * to "false".
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
             * The media_name of a file to be played to participants joining the conference. The
             * media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the
             * same user/organization. The file must either be a WAV or MP3 file. Takes effect only
             * when "start_conference_on_create" is set to "false".
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
             * The maximum number of active conference participants to allow. Must be between 2
             * and 800. Defaults to 250
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
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("callControlId", callControlId),
                    checkRequired("name", name),
                    beepEnabled,
                    clientState,
                    comfortNoise,
                    commandId,
                    durationMinutes,
                    holdAudioUrl,
                    holdMediaName,
                    maxParticipants,
                    startConferenceOnCreate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            callControlId()
            name()
            beepEnabled().ifPresent { it.validate() }
            clientState()
            comfortNoise()
            commandId()
            durationMinutes()
            holdAudioUrl()
            holdMediaName()
            maxParticipants()
            startConferenceOnCreate()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                (beepEnabled.asKnown().getOrNull()?.validity() ?: 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (comfortNoise.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (if (durationMinutes.asKnown().isPresent) 1 else 0) +
                (if (holdAudioUrl.asKnown().isPresent) 1 else 0) +
                (if (holdMediaName.asKnown().isPresent) 1 else 0) +
                (if (maxParticipants.asKnown().isPresent) 1 else 0) +
                (if (startConferenceOnCreate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                callControlId == other.callControlId &&
                name == other.name &&
                beepEnabled == other.beepEnabled &&
                clientState == other.clientState &&
                comfortNoise == other.comfortNoise &&
                commandId == other.commandId &&
                durationMinutes == other.durationMinutes &&
                holdAudioUrl == other.holdAudioUrl &&
                holdMediaName == other.holdMediaName &&
                maxParticipants == other.maxParticipants &&
                startConferenceOnCreate == other.startConferenceOnCreate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                callControlId,
                name,
                beepEnabled,
                clientState,
                comfortNoise,
                commandId,
                durationMinutes,
                holdAudioUrl,
                holdMediaName,
                maxParticipants,
                startConferenceOnCreate,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{callControlId=$callControlId, name=$name, beepEnabled=$beepEnabled, clientState=$clientState, comfortNoise=$comfortNoise, commandId=$commandId, durationMinutes=$durationMinutes, holdAudioUrl=$holdAudioUrl, holdMediaName=$holdMediaName, maxParticipants=$maxParticipants, startConferenceOnCreate=$startConferenceOnCreate, additionalProperties=$additionalProperties}"
    }

    /** Whether a beep sound should be played when participants join and/or leave the conference. */
    class BeepEnabled @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALWAYS,
            NEVER,
            ON_ENTER,
            ON_EXIT,
            /**
             * An enum member indicating that [BeepEnabled] was instantiated with an unknown value.
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
                ALWAYS -> Value.ALWAYS
                NEVER -> Value.NEVER
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
                ALWAYS -> Known.ALWAYS
                NEVER -> Known.NEVER
                ON_ENTER -> Known.ON_ENTER
                ON_EXIT -> Known.ON_EXIT
                else -> throw TelnyxInvalidDataException("Unknown BeepEnabled: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConferenceCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ConferenceCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
