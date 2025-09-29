// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences.actions

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
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Join an existing call leg to a conference. Issue the Join Conference command with the conference
 * ID in the path and the `call_control_id` of the leg you wish to join to the conference as an
 * attribute. The conference can have up to a certain amount of active participants, as set by the
 * `max_participants` parameter in conference creation request.
 *
 * **Expected Webhooks:**
 * - `conference.participant.joined`
 * - `conference.participant.left`
 */
class ActionJoinParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Unique identifier and token for controlling the call
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callControlId(): String = body.callControlId()

    /**
     * Whether a beep sound should be played when the participant joins and/or leaves the
     * conference. Can be used to override the conference-level setting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beepEnabled(): Optional<BeepEnabled> = body.beepEnabled()

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded
     * string. Please note that the client_state will be updated for the participient call leg and
     * the change will not affect conferencing webhooks unless the participient is the owner of the
     * conference.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = body.clientState()

    /**
     * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent
     * commands with the same `command_id` as one that has already been executed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commandId(): Optional<String> = body.commandId()

    /**
     * Whether the conference should end and all remaining participants be hung up after the
     * participant leaves the conference. Defaults to "false".
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endConferenceOnExit(): Optional<Boolean> = body.endConferenceOnExit()

    /**
     * Whether the participant should be put on hold immediately after joining the conference.
     * Defaults to "false".
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hold(): Optional<Boolean> = body.hold()

    /**
     * The URL of a file to be played to the participant when they are put on hold after joining the
     * conference. hold_media_name and hold_audio_url cannot be used together in one request. Takes
     * effect only when "start_conference_on_create" is set to "false". This property takes effect
     * only if "hold" is set to "true".
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun holdAudioUrl(): Optional<String> = body.holdAudioUrl()

    /**
     * The media_name of a file to be played to the participant when they are put on hold after
     * joining the conference. The media_name must point to a file previously uploaded to
     * api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3
     * file. Takes effect only when "start_conference_on_create" is set to "false". This property
     * takes effect only if "hold" is set to "true".
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun holdMediaName(): Optional<String> = body.holdMediaName()

    /**
     * Whether the participant should be muted immediately after joining the conference. Defaults to
     * "false".
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mute(): Optional<Boolean> = body.mute()

    /**
     * Whether the conference should end after the participant leaves the conference. NOTE this
     * doesn't hang up the other participants. Defaults to "false".
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun softEndConferenceOnExit(): Optional<Boolean> = body.softEndConferenceOnExit()

    /**
     * Whether the conference should be started after the participant joins the conference. Defaults
     * to "false".
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startConferenceOnEnter(): Optional<Boolean> = body.startConferenceOnEnter()

    /**
     * Sets the joining participant as a supervisor for the conference. A conference can have
     * multiple supervisors. "barge" means the supervisor enters the conference as a normal
     * participant. This is the same as "none". "monitor" means the supervisor is muted but can hear
     * all participants. "whisper" means that only the specified "whisper_call_control_ids" can hear
     * the supervisor. Defaults to "none".
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supervisorRole(): Optional<SupervisorRole> = body.supervisorRole()

    /**
     * Array of unique call_control_ids the joining supervisor can whisper to. If none provided, the
     * supervisor will join the conference as a monitoring participant only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun whisperCallControlIds(): Optional<List<String>> = body.whisperCallControlIds()

    /**
     * Returns the raw JSON value of [callControlId].
     *
     * Unlike [callControlId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callControlId(): JsonField<String> = body._callControlId()

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
     * Returns the raw JSON value of [commandId].
     *
     * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commandId(): JsonField<String> = body._commandId()

    /**
     * Returns the raw JSON value of [endConferenceOnExit].
     *
     * Unlike [endConferenceOnExit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _endConferenceOnExit(): JsonField<Boolean> = body._endConferenceOnExit()

    /**
     * Returns the raw JSON value of [hold].
     *
     * Unlike [hold], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _hold(): JsonField<Boolean> = body._hold()

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
     * Returns the raw JSON value of [mute].
     *
     * Unlike [mute], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mute(): JsonField<Boolean> = body._mute()

    /**
     * Returns the raw JSON value of [softEndConferenceOnExit].
     *
     * Unlike [softEndConferenceOnExit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _softEndConferenceOnExit(): JsonField<Boolean> = body._softEndConferenceOnExit()

    /**
     * Returns the raw JSON value of [startConferenceOnEnter].
     *
     * Unlike [startConferenceOnEnter], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _startConferenceOnEnter(): JsonField<Boolean> = body._startConferenceOnEnter()

    /**
     * Returns the raw JSON value of [supervisorRole].
     *
     * Unlike [supervisorRole], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _supervisorRole(): JsonField<SupervisorRole> = body._supervisorRole()

    /**
     * Returns the raw JSON value of [whisperCallControlIds].
     *
     * Unlike [whisperCallControlIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _whisperCallControlIds(): JsonField<List<String>> = body._whisperCallControlIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionJoinParams].
         *
         * The following fields are required:
         * ```java
         * .callControlId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionJoinParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionJoinParams: ActionJoinParams) = apply {
            id = actionJoinParams.id
            body = actionJoinParams.body.toBuilder()
            additionalHeaders = actionJoinParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionJoinParams.additionalQueryParams.toBuilder()
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
         * - [beepEnabled]
         * - [clientState]
         * - [commandId]
         * - [endConferenceOnExit]
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

        /**
         * Whether a beep sound should be played when the participant joins and/or leaves the
         * conference. Can be used to override the conference-level setting.
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
         * encoded string. Please note that the client_state will be updated for the participient
         * call leg and the change will not affect conferencing webhooks unless the participient is
         * the owner of the conference.
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

        /**
         * Whether the conference should end and all remaining participants be hung up after the
         * participant leaves the conference. Defaults to "false".
         */
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
         * Whether the participant should be put on hold immediately after joining the conference.
         * Defaults to "false".
         */
        fun hold(hold: Boolean) = apply { body.hold(hold) }

        /**
         * Sets [Builder.hold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hold] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hold(hold: JsonField<Boolean>) = apply { body.hold(hold) }

        /**
         * The URL of a file to be played to the participant when they are put on hold after joining
         * the conference. hold_media_name and hold_audio_url cannot be used together in one
         * request. Takes effect only when "start_conference_on_create" is set to "false". This
         * property takes effect only if "hold" is set to "true".
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
         * The media_name of a file to be played to the participant when they are put on hold after
         * joining the conference. The media_name must point to a file previously uploaded to
         * api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or
         * MP3 file. Takes effect only when "start_conference_on_create" is set to "false". This
         * property takes effect only if "hold" is set to "true".
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
         * Whether the participant should be muted immediately after joining the conference.
         * Defaults to "false".
         */
        fun mute(mute: Boolean) = apply { body.mute(mute) }

        /**
         * Sets [Builder.mute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mute] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mute(mute: JsonField<Boolean>) = apply { body.mute(mute) }

        /**
         * Whether the conference should end after the participant leaves the conference. NOTE this
         * doesn't hang up the other participants. Defaults to "false".
         */
        fun softEndConferenceOnExit(softEndConferenceOnExit: Boolean) = apply {
            body.softEndConferenceOnExit(softEndConferenceOnExit)
        }

        /**
         * Sets [Builder.softEndConferenceOnExit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.softEndConferenceOnExit] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun softEndConferenceOnExit(softEndConferenceOnExit: JsonField<Boolean>) = apply {
            body.softEndConferenceOnExit(softEndConferenceOnExit)
        }

        /**
         * Whether the conference should be started after the participant joins the conference.
         * Defaults to "false".
         */
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

        /**
         * Sets the joining participant as a supervisor for the conference. A conference can have
         * multiple supervisors. "barge" means the supervisor enters the conference as a normal
         * participant. This is the same as "none". "monitor" means the supervisor is muted but can
         * hear all participants. "whisper" means that only the specified "whisper_call_control_ids"
         * can hear the supervisor. Defaults to "none".
         */
        fun supervisorRole(supervisorRole: SupervisorRole) = apply {
            body.supervisorRole(supervisorRole)
        }

        /**
         * Sets [Builder.supervisorRole] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supervisorRole] with a well-typed [SupervisorRole] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun supervisorRole(supervisorRole: JsonField<SupervisorRole>) = apply {
            body.supervisorRole(supervisorRole)
        }

        /**
         * Array of unique call_control_ids the joining supervisor can whisper to. If none provided,
         * the supervisor will join the conference as a monitoring participant only.
         */
        fun whisperCallControlIds(whisperCallControlIds: List<String>) = apply {
            body.whisperCallControlIds(whisperCallControlIds)
        }

        /**
         * Sets [Builder.whisperCallControlIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.whisperCallControlIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun whisperCallControlIds(whisperCallControlIds: JsonField<List<String>>) = apply {
            body.whisperCallControlIds(whisperCallControlIds)
        }

        /**
         * Adds a single [String] to [whisperCallControlIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWhisperCallControlId(whisperCallControlId: String) = apply {
            body.addWhisperCallControlId(whisperCallControlId)
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
         * Returns an immutable instance of [ActionJoinParams].
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
        fun build(): ActionJoinParams =
            ActionJoinParams(
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
        private val beepEnabled: JsonField<BeepEnabled>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val endConferenceOnExit: JsonField<Boolean>,
        private val hold: JsonField<Boolean>,
        private val holdAudioUrl: JsonField<String>,
        private val holdMediaName: JsonField<String>,
        private val mute: JsonField<Boolean>,
        private val softEndConferenceOnExit: JsonField<Boolean>,
        private val startConferenceOnEnter: JsonField<Boolean>,
        private val supervisorRole: JsonField<SupervisorRole>,
        private val whisperCallControlIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("call_control_id")
            @ExcludeMissing
            callControlId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("beep_enabled")
            @ExcludeMissing
            beepEnabled: JsonField<BeepEnabled> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_conference_on_exit")
            @ExcludeMissing
            endConferenceOnExit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hold") @ExcludeMissing hold: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hold_audio_url")
            @ExcludeMissing
            holdAudioUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hold_media_name")
            @ExcludeMissing
            holdMediaName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mute") @ExcludeMissing mute: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("soft_end_conference_on_exit")
            @ExcludeMissing
            softEndConferenceOnExit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("start_conference_on_enter")
            @ExcludeMissing
            startConferenceOnEnter: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("supervisor_role")
            @ExcludeMissing
            supervisorRole: JsonField<SupervisorRole> = JsonMissing.of(),
            @JsonProperty("whisper_call_control_ids")
            @ExcludeMissing
            whisperCallControlIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            callControlId,
            beepEnabled,
            clientState,
            commandId,
            endConferenceOnExit,
            hold,
            holdAudioUrl,
            holdMediaName,
            mute,
            softEndConferenceOnExit,
            startConferenceOnEnter,
            supervisorRole,
            whisperCallControlIds,
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
         * Whether a beep sound should be played when the participant joins and/or leaves the
         * conference. Can be used to override the conference-level setting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun beepEnabled(): Optional<BeepEnabled> = beepEnabled.getOptional("beep_enabled")

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string. Please note that the client_state will be updated for the participient
         * call leg and the change will not affect conferencing webhooks unless the participient is
         * the owner of the conference.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientState(): Optional<String> = clientState.getOptional("client_state")

        /**
         * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent
         * commands with the same `command_id` as one that has already been executed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commandId(): Optional<String> = commandId.getOptional("command_id")

        /**
         * Whether the conference should end and all remaining participants be hung up after the
         * participant leaves the conference. Defaults to "false".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endConferenceOnExit(): Optional<Boolean> =
            endConferenceOnExit.getOptional("end_conference_on_exit")

        /**
         * Whether the participant should be put on hold immediately after joining the conference.
         * Defaults to "false".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hold(): Optional<Boolean> = hold.getOptional("hold")

        /**
         * The URL of a file to be played to the participant when they are put on hold after joining
         * the conference. hold_media_name and hold_audio_url cannot be used together in one
         * request. Takes effect only when "start_conference_on_create" is set to "false". This
         * property takes effect only if "hold" is set to "true".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun holdAudioUrl(): Optional<String> = holdAudioUrl.getOptional("hold_audio_url")

        /**
         * The media_name of a file to be played to the participant when they are put on hold after
         * joining the conference. The media_name must point to a file previously uploaded to
         * api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or
         * MP3 file. Takes effect only when "start_conference_on_create" is set to "false". This
         * property takes effect only if "hold" is set to "true".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun holdMediaName(): Optional<String> = holdMediaName.getOptional("hold_media_name")

        /**
         * Whether the participant should be muted immediately after joining the conference.
         * Defaults to "false".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mute(): Optional<Boolean> = mute.getOptional("mute")

        /**
         * Whether the conference should end after the participant leaves the conference. NOTE this
         * doesn't hang up the other participants. Defaults to "false".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun softEndConferenceOnExit(): Optional<Boolean> =
            softEndConferenceOnExit.getOptional("soft_end_conference_on_exit")

        /**
         * Whether the conference should be started after the participant joins the conference.
         * Defaults to "false".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startConferenceOnEnter(): Optional<Boolean> =
            startConferenceOnEnter.getOptional("start_conference_on_enter")

        /**
         * Sets the joining participant as a supervisor for the conference. A conference can have
         * multiple supervisors. "barge" means the supervisor enters the conference as a normal
         * participant. This is the same as "none". "monitor" means the supervisor is muted but can
         * hear all participants. "whisper" means that only the specified "whisper_call_control_ids"
         * can hear the supervisor. Defaults to "none".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun supervisorRole(): Optional<SupervisorRole> =
            supervisorRole.getOptional("supervisor_role")

        /**
         * Array of unique call_control_ids the joining supervisor can whisper to. If none provided,
         * the supervisor will join the conference as a monitoring participant only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun whisperCallControlIds(): Optional<List<String>> =
            whisperCallControlIds.getOptional("whisper_call_control_ids")

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
         * Returns the raw JSON value of [commandId].
         *
         * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("command_id") @ExcludeMissing fun _commandId(): JsonField<String> = commandId

        /**
         * Returns the raw JSON value of [endConferenceOnExit].
         *
         * Unlike [endConferenceOnExit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("end_conference_on_exit")
        @ExcludeMissing
        fun _endConferenceOnExit(): JsonField<Boolean> = endConferenceOnExit

        /**
         * Returns the raw JSON value of [hold].
         *
         * Unlike [hold], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hold") @ExcludeMissing fun _hold(): JsonField<Boolean> = hold

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
         * Returns the raw JSON value of [mute].
         *
         * Unlike [mute], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mute") @ExcludeMissing fun _mute(): JsonField<Boolean> = mute

        /**
         * Returns the raw JSON value of [softEndConferenceOnExit].
         *
         * Unlike [softEndConferenceOnExit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("soft_end_conference_on_exit")
        @ExcludeMissing
        fun _softEndConferenceOnExit(): JsonField<Boolean> = softEndConferenceOnExit

        /**
         * Returns the raw JSON value of [startConferenceOnEnter].
         *
         * Unlike [startConferenceOnEnter], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("start_conference_on_enter")
        @ExcludeMissing
        fun _startConferenceOnEnter(): JsonField<Boolean> = startConferenceOnEnter

        /**
         * Returns the raw JSON value of [supervisorRole].
         *
         * Unlike [supervisorRole], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("supervisor_role")
        @ExcludeMissing
        fun _supervisorRole(): JsonField<SupervisorRole> = supervisorRole

        /**
         * Returns the raw JSON value of [whisperCallControlIds].
         *
         * Unlike [whisperCallControlIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("whisper_call_control_ids")
        @ExcludeMissing
        fun _whisperCallControlIds(): JsonField<List<String>> = whisperCallControlIds

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
            private var beepEnabled: JsonField<BeepEnabled> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var endConferenceOnExit: JsonField<Boolean> = JsonMissing.of()
            private var hold: JsonField<Boolean> = JsonMissing.of()
            private var holdAudioUrl: JsonField<String> = JsonMissing.of()
            private var holdMediaName: JsonField<String> = JsonMissing.of()
            private var mute: JsonField<Boolean> = JsonMissing.of()
            private var softEndConferenceOnExit: JsonField<Boolean> = JsonMissing.of()
            private var startConferenceOnEnter: JsonField<Boolean> = JsonMissing.of()
            private var supervisorRole: JsonField<SupervisorRole> = JsonMissing.of()
            private var whisperCallControlIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                callControlId = body.callControlId
                beepEnabled = body.beepEnabled
                clientState = body.clientState
                commandId = body.commandId
                endConferenceOnExit = body.endConferenceOnExit
                hold = body.hold
                holdAudioUrl = body.holdAudioUrl
                holdMediaName = body.holdMediaName
                mute = body.mute
                softEndConferenceOnExit = body.softEndConferenceOnExit
                startConferenceOnEnter = body.startConferenceOnEnter
                supervisorRole = body.supervisorRole
                whisperCallControlIds = body.whisperCallControlIds.map { it.toMutableList() }
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

            /**
             * Whether a beep sound should be played when the participant joins and/or leaves the
             * conference. Can be used to override the conference-level setting.
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
             * encoded string. Please note that the client_state will be updated for the
             * participient call leg and the change will not affect conferencing webhooks unless the
             * participient is the owner of the conference.
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

            /**
             * Whether the conference should end and all remaining participants be hung up after the
             * participant leaves the conference. Defaults to "false".
             */
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
             * Whether the participant should be put on hold immediately after joining the
             * conference. Defaults to "false".
             */
            fun hold(hold: Boolean) = hold(JsonField.of(hold))

            /**
             * Sets [Builder.hold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hold] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hold(hold: JsonField<Boolean>) = apply { this.hold = hold }

            /**
             * The URL of a file to be played to the participant when they are put on hold after
             * joining the conference. hold_media_name and hold_audio_url cannot be used together in
             * one request. Takes effect only when "start_conference_on_create" is set to "false".
             * This property takes effect only if "hold" is set to "true".
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
             * The media_name of a file to be played to the participant when they are put on hold
             * after joining the conference. The media_name must point to a file previously uploaded
             * to api.telnyx.com/v2/media by the same user/organization. The file must either be a
             * WAV or MP3 file. Takes effect only when "start_conference_on_create" is set to
             * "false". This property takes effect only if "hold" is set to "true".
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
             * Whether the participant should be muted immediately after joining the conference.
             * Defaults to "false".
             */
            fun mute(mute: Boolean) = mute(JsonField.of(mute))

            /**
             * Sets [Builder.mute] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mute] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mute(mute: JsonField<Boolean>) = apply { this.mute = mute }

            /**
             * Whether the conference should end after the participant leaves the conference. NOTE
             * this doesn't hang up the other participants. Defaults to "false".
             */
            fun softEndConferenceOnExit(softEndConferenceOnExit: Boolean) =
                softEndConferenceOnExit(JsonField.of(softEndConferenceOnExit))

            /**
             * Sets [Builder.softEndConferenceOnExit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.softEndConferenceOnExit] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun softEndConferenceOnExit(softEndConferenceOnExit: JsonField<Boolean>) = apply {
                this.softEndConferenceOnExit = softEndConferenceOnExit
            }

            /**
             * Whether the conference should be started after the participant joins the conference.
             * Defaults to "false".
             */
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

            /**
             * Sets the joining participant as a supervisor for the conference. A conference can
             * have multiple supervisors. "barge" means the supervisor enters the conference as a
             * normal participant. This is the same as "none". "monitor" means the supervisor is
             * muted but can hear all participants. "whisper" means that only the specified
             * "whisper_call_control_ids" can hear the supervisor. Defaults to "none".
             */
            fun supervisorRole(supervisorRole: SupervisorRole) =
                supervisorRole(JsonField.of(supervisorRole))

            /**
             * Sets [Builder.supervisorRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.supervisorRole] with a well-typed [SupervisorRole]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun supervisorRole(supervisorRole: JsonField<SupervisorRole>) = apply {
                this.supervisorRole = supervisorRole
            }

            /**
             * Array of unique call_control_ids the joining supervisor can whisper to. If none
             * provided, the supervisor will join the conference as a monitoring participant only.
             */
            fun whisperCallControlIds(whisperCallControlIds: List<String>) =
                whisperCallControlIds(JsonField.of(whisperCallControlIds))

            /**
             * Sets [Builder.whisperCallControlIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.whisperCallControlIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun whisperCallControlIds(whisperCallControlIds: JsonField<List<String>>) = apply {
                this.whisperCallControlIds = whisperCallControlIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [whisperCallControlIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWhisperCallControlId(whisperCallControlId: String) = apply {
                whisperCallControlIds =
                    (whisperCallControlIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("whisperCallControlIds", it).add(whisperCallControlId)
                    }
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
                    beepEnabled,
                    clientState,
                    commandId,
                    endConferenceOnExit,
                    hold,
                    holdAudioUrl,
                    holdMediaName,
                    mute,
                    softEndConferenceOnExit,
                    startConferenceOnEnter,
                    supervisorRole,
                    (whisperCallControlIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            callControlId()
            beepEnabled().ifPresent { it.validate() }
            clientState()
            commandId()
            endConferenceOnExit()
            hold()
            holdAudioUrl()
            holdMediaName()
            mute()
            softEndConferenceOnExit()
            startConferenceOnEnter()
            supervisorRole().ifPresent { it.validate() }
            whisperCallControlIds()
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
                (beepEnabled.asKnown().getOrNull()?.validity() ?: 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (if (endConferenceOnExit.asKnown().isPresent) 1 else 0) +
                (if (hold.asKnown().isPresent) 1 else 0) +
                (if (holdAudioUrl.asKnown().isPresent) 1 else 0) +
                (if (holdMediaName.asKnown().isPresent) 1 else 0) +
                (if (mute.asKnown().isPresent) 1 else 0) +
                (if (softEndConferenceOnExit.asKnown().isPresent) 1 else 0) +
                (if (startConferenceOnEnter.asKnown().isPresent) 1 else 0) +
                (supervisorRole.asKnown().getOrNull()?.validity() ?: 0) +
                (whisperCallControlIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                callControlId == other.callControlId &&
                beepEnabled == other.beepEnabled &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                endConferenceOnExit == other.endConferenceOnExit &&
                hold == other.hold &&
                holdAudioUrl == other.holdAudioUrl &&
                holdMediaName == other.holdMediaName &&
                mute == other.mute &&
                softEndConferenceOnExit == other.softEndConferenceOnExit &&
                startConferenceOnEnter == other.startConferenceOnEnter &&
                supervisorRole == other.supervisorRole &&
                whisperCallControlIds == other.whisperCallControlIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                callControlId,
                beepEnabled,
                clientState,
                commandId,
                endConferenceOnExit,
                hold,
                holdAudioUrl,
                holdMediaName,
                mute,
                softEndConferenceOnExit,
                startConferenceOnEnter,
                supervisorRole,
                whisperCallControlIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{callControlId=$callControlId, beepEnabled=$beepEnabled, clientState=$clientState, commandId=$commandId, endConferenceOnExit=$endConferenceOnExit, hold=$hold, holdAudioUrl=$holdAudioUrl, holdMediaName=$holdMediaName, mute=$mute, softEndConferenceOnExit=$softEndConferenceOnExit, startConferenceOnEnter=$startConferenceOnEnter, supervisorRole=$supervisorRole, whisperCallControlIds=$whisperCallControlIds, additionalProperties=$additionalProperties}"
    }

    /**
     * Whether a beep sound should be played when the participant joins and/or leaves the
     * conference. Can be used to override the conference-level setting.
     */
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

    /**
     * Sets the joining participant as a supervisor for the conference. A conference can have
     * multiple supervisors. "barge" means the supervisor enters the conference as a normal
     * participant. This is the same as "none". "monitor" means the supervisor is muted but can hear
     * all participants. "whisper" means that only the specified "whisper_call_control_ids" can hear
     * the supervisor. Defaults to "none".
     */
    class SupervisorRole @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val BARGE = of("barge")

            @JvmField val MONITOR = of("monitor")

            @JvmField val NONE = of("none")

            @JvmField val WHISPER = of("whisper")

            @JvmStatic fun of(value: String) = SupervisorRole(JsonField.of(value))
        }

        /** An enum containing [SupervisorRole]'s known values. */
        enum class Known {
            BARGE,
            MONITOR,
            NONE,
            WHISPER,
        }

        /**
         * An enum containing [SupervisorRole]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SupervisorRole] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BARGE,
            MONITOR,
            NONE,
            WHISPER,
            /**
             * An enum member indicating that [SupervisorRole] was instantiated with an unknown
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
                BARGE -> Value.BARGE
                MONITOR -> Value.MONITOR
                NONE -> Value.NONE
                WHISPER -> Value.WHISPER
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
                BARGE -> Known.BARGE
                MONITOR -> Known.MONITOR
                NONE -> Known.NONE
                WHISPER -> Known.WHISPER
                else -> throw TelnyxInvalidDataException("Unknown SupervisorRole: $value")
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

        fun validate(): SupervisorRole = apply {
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

            return other is SupervisorRole && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionJoinParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionJoinParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
