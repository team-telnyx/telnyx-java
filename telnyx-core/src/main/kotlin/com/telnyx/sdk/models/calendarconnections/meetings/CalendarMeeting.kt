// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections.meetings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CalendarMeeting
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val attendees: JsonField<List<Attendee>>,
    private val botWillJoin: JsonField<Boolean>,
    private val botWillJoinOverride: JsonField<Boolean>,
    private val decision: JsonField<Decision>,
    private val endTime: JsonField<OffsetDateTime>,
    private val isExternalOrganizer: JsonField<Boolean>,
    private val organizer: JsonField<Organizer>,
    private val platform: JsonField<Platform>,
    private val sessionId: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attendees")
        @ExcludeMissing
        attendees: JsonField<List<Attendee>> = JsonMissing.of(),
        @JsonProperty("bot_will_join")
        @ExcludeMissing
        botWillJoin: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("bot_will_join_override")
        @ExcludeMissing
        botWillJoinOverride: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("decision") @ExcludeMissing decision: JsonField<Decision> = JsonMissing.of(),
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("is_external_organizer")
        @ExcludeMissing
        isExternalOrganizer: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("organizer")
        @ExcludeMissing
        organizer: JsonField<Organizer> = JsonMissing.of(),
        @JsonProperty("platform") @ExcludeMissing platform: JsonField<Platform> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        attendees,
        botWillJoin,
        botWillJoinOverride,
        decision,
        endTime,
        isExternalOrganizer,
        organizer,
        platform,
        sessionId,
        startTime,
        mutableMapOf(),
    )

    /**
     * Tracked calendar meeting ID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Calendar attendees; identity fields are cleared after the retention window.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attendees(): List<Attendee> = attendees.getRequired("attendees")

    /**
     * Effective policy decision, not proof that the bot has joined.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun botWillJoin(): Boolean = botWillJoin.getRequired("bot_will_join")

    /**
     * Explicit override; null follows the connection policy.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun botWillJoinOverride(): Optional<Boolean> =
        botWillJoinOverride.getOptional("bot_will_join_override")

    /**
     * Scheduling decision.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun decision(): Decision = decision.getRequired("decision")

    /**
     * Event end time.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    /**
     * Whether the connected calendar user is not the organizer.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isExternalOrganizer(): Optional<Boolean> =
        isExternalOrganizer.getOptional("is_external_organizer")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizer(): Optional<Organizer> = organizer.getOptional("organizer")

    /**
     * Detected meeting platform.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platform(): Platform = platform.getRequired("platform")

    /**
     * Linked meeting session ID, or null until one exists.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

    /**
     * Event start time.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [attendees].
     *
     * Unlike [attendees], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attendees")
    @ExcludeMissing
    fun _attendees(): JsonField<List<Attendee>> = attendees

    /**
     * Returns the raw JSON value of [botWillJoin].
     *
     * Unlike [botWillJoin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bot_will_join")
    @ExcludeMissing
    fun _botWillJoin(): JsonField<Boolean> = botWillJoin

    /**
     * Returns the raw JSON value of [botWillJoinOverride].
     *
     * Unlike [botWillJoinOverride], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("bot_will_join_override")
    @ExcludeMissing
    fun _botWillJoinOverride(): JsonField<Boolean> = botWillJoinOverride

    /**
     * Returns the raw JSON value of [decision].
     *
     * Unlike [decision], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decision") @ExcludeMissing fun _decision(): JsonField<Decision> = decision

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [isExternalOrganizer].
     *
     * Unlike [isExternalOrganizer], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("is_external_organizer")
    @ExcludeMissing
    fun _isExternalOrganizer(): JsonField<Boolean> = isExternalOrganizer

    /**
     * Returns the raw JSON value of [organizer].
     *
     * Unlike [organizer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organizer") @ExcludeMissing fun _organizer(): JsonField<Organizer> = organizer

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<Platform> = platform

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

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
         * Returns a mutable builder for constructing an instance of [CalendarMeeting].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .attendees()
         * .botWillJoin()
         * .botWillJoinOverride()
         * .decision()
         * .endTime()
         * .isExternalOrganizer()
         * .organizer()
         * .platform()
         * .sessionId()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CalendarMeeting]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attendees: JsonField<MutableList<Attendee>>? = null
        private var botWillJoin: JsonField<Boolean>? = null
        private var botWillJoinOverride: JsonField<Boolean>? = null
        private var decision: JsonField<Decision>? = null
        private var endTime: JsonField<OffsetDateTime>? = null
        private var isExternalOrganizer: JsonField<Boolean>? = null
        private var organizer: JsonField<Organizer>? = null
        private var platform: JsonField<Platform>? = null
        private var sessionId: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(calendarMeeting: CalendarMeeting) = apply {
            id = calendarMeeting.id
            attendees = calendarMeeting.attendees.map { it.toMutableList() }
            botWillJoin = calendarMeeting.botWillJoin
            botWillJoinOverride = calendarMeeting.botWillJoinOverride
            decision = calendarMeeting.decision
            endTime = calendarMeeting.endTime
            isExternalOrganizer = calendarMeeting.isExternalOrganizer
            organizer = calendarMeeting.organizer
            platform = calendarMeeting.platform
            sessionId = calendarMeeting.sessionId
            startTime = calendarMeeting.startTime
            additionalProperties = calendarMeeting.additionalProperties.toMutableMap()
        }

        /** Tracked calendar meeting ID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Calendar attendees; identity fields are cleared after the retention window. */
        fun attendees(attendees: List<Attendee>) = attendees(JsonField.of(attendees))

        /**
         * Sets [Builder.attendees] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attendees] with a well-typed `List<Attendee>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attendees(attendees: JsonField<List<Attendee>>) = apply {
            this.attendees = attendees.map { it.toMutableList() }
        }

        /**
         * Adds a single [Attendee] to [attendees].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttendee(attendee: Attendee) = apply {
            attendees =
                (attendees ?: JsonField.of(mutableListOf())).also {
                    checkKnown("attendees", it).add(attendee)
                }
        }

        /** Effective policy decision, not proof that the bot has joined. */
        fun botWillJoin(botWillJoin: Boolean) = botWillJoin(JsonField.of(botWillJoin))

        /**
         * Sets [Builder.botWillJoin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.botWillJoin] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun botWillJoin(botWillJoin: JsonField<Boolean>) = apply { this.botWillJoin = botWillJoin }

        /** Explicit override; null follows the connection policy. */
        fun botWillJoinOverride(botWillJoinOverride: Boolean?) =
            botWillJoinOverride(JsonField.ofNullable(botWillJoinOverride))

        /**
         * Alias for [Builder.botWillJoinOverride].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun botWillJoinOverride(botWillJoinOverride: Boolean) =
            botWillJoinOverride(botWillJoinOverride as Boolean?)

        /**
         * Alias for calling [Builder.botWillJoinOverride] with `botWillJoinOverride.orElse(null)`.
         */
        fun botWillJoinOverride(botWillJoinOverride: Optional<Boolean>) =
            botWillJoinOverride(botWillJoinOverride.getOrNull())

        /**
         * Sets [Builder.botWillJoinOverride] to an arbitrary JSON value.
         *
         * You should usually call [Builder.botWillJoinOverride] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun botWillJoinOverride(botWillJoinOverride: JsonField<Boolean>) = apply {
            this.botWillJoinOverride = botWillJoinOverride
        }

        /** Scheduling decision. */
        fun decision(decision: Decision) = decision(JsonField.of(decision))

        /**
         * Sets [Builder.decision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decision] with a well-typed [Decision] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

        /** Event end time. */
        fun endTime(endTime: OffsetDateTime?) = endTime(JsonField.ofNullable(endTime))

        /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
        fun endTime(endTime: Optional<OffsetDateTime>) = endTime(endTime.getOrNull())

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        /** Whether the connected calendar user is not the organizer. */
        fun isExternalOrganizer(isExternalOrganizer: Boolean?) =
            isExternalOrganizer(JsonField.ofNullable(isExternalOrganizer))

        /**
         * Alias for [Builder.isExternalOrganizer].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isExternalOrganizer(isExternalOrganizer: Boolean) =
            isExternalOrganizer(isExternalOrganizer as Boolean?)

        /**
         * Alias for calling [Builder.isExternalOrganizer] with `isExternalOrganizer.orElse(null)`.
         */
        fun isExternalOrganizer(isExternalOrganizer: Optional<Boolean>) =
            isExternalOrganizer(isExternalOrganizer.getOrNull())

        /**
         * Sets [Builder.isExternalOrganizer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isExternalOrganizer] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isExternalOrganizer(isExternalOrganizer: JsonField<Boolean>) = apply {
            this.isExternalOrganizer = isExternalOrganizer
        }

        fun organizer(organizer: Organizer?) = organizer(JsonField.ofNullable(organizer))

        /** Alias for calling [Builder.organizer] with `organizer.orElse(null)`. */
        fun organizer(organizer: Optional<Organizer>) = organizer(organizer.getOrNull())

        /**
         * Sets [Builder.organizer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizer] with a well-typed [Organizer] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun organizer(organizer: JsonField<Organizer>) = apply { this.organizer = organizer }

        /** Detected meeting platform. */
        fun platform(platform: Platform) = platform(JsonField.of(platform))

        /**
         * Sets [Builder.platform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platform] with a well-typed [Platform] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

        /** Linked meeting session ID, or null until one exists. */
        fun sessionId(sessionId: String?) = sessionId(JsonField.ofNullable(sessionId))

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        /** Event start time. */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

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
         * Returns an immutable instance of [CalendarMeeting].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .attendees()
         * .botWillJoin()
         * .botWillJoinOverride()
         * .decision()
         * .endTime()
         * .isExternalOrganizer()
         * .organizer()
         * .platform()
         * .sessionId()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CalendarMeeting =
            CalendarMeeting(
                checkRequired("id", id),
                checkRequired("attendees", attendees).map { it.toImmutable() },
                checkRequired("botWillJoin", botWillJoin),
                checkRequired("botWillJoinOverride", botWillJoinOverride),
                checkRequired("decision", decision),
                checkRequired("endTime", endTime),
                checkRequired("isExternalOrganizer", isExternalOrganizer),
                checkRequired("organizer", organizer),
                checkRequired("platform", platform),
                checkRequired("sessionId", sessionId),
                checkRequired("startTime", startTime),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): CalendarMeeting = apply {
        if (validated) {
            return@apply
        }

        id()
        attendees().forEach { it.validate() }
        botWillJoin()
        botWillJoinOverride()
        decision().validate()
        endTime()
        isExternalOrganizer()
        organizer().ifPresent { it.validate() }
        platform().validate()
        sessionId()
        startTime()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (attendees.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (botWillJoin.asKnown().isPresent) 1 else 0) +
            (if (botWillJoinOverride.asKnown().isPresent) 1 else 0) +
            (decision.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (isExternalOrganizer.asKnown().isPresent) 1 else 0) +
            (organizer.asKnown().getOrNull()?.validity() ?: 0) +
            (platform.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0)

    class Attendee
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val displayName: JsonField<String>,
        private val email: JsonField<String>,
        private val optional: JsonField<Boolean>,
        private val responseStatus: JsonField<String>,
        private val self: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("optional")
            @ExcludeMissing
            optional: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("response_status")
            @ExcludeMissing
            responseStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("self") @ExcludeMissing self: JsonField<Boolean> = JsonMissing.of(),
        ) : this(displayName, email, optional, responseStatus, self, mutableMapOf())

        /**
         * Display name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.getOptional("display_name")

        /**
         * Email address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * Whether attendance is optional.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun optional(): Optional<Boolean> = optional.getOptional("optional")

        /**
         * Calendar RSVP status.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun responseStatus(): Optional<String> = responseStatus.getOptional("response_status")

        /**
         * Whether this is the connected calendar user.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun self(): Optional<Boolean> = self.getOptional("self")

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [optional].
         *
         * Unlike [optional], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("optional") @ExcludeMissing fun _optional(): JsonField<Boolean> = optional

        /**
         * Returns the raw JSON value of [responseStatus].
         *
         * Unlike [responseStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("response_status")
        @ExcludeMissing
        fun _responseStatus(): JsonField<String> = responseStatus

        /**
         * Returns the raw JSON value of [self].
         *
         * Unlike [self], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("self") @ExcludeMissing fun _self(): JsonField<Boolean> = self

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
             * Returns a mutable builder for constructing an instance of [Attendee].
             *
             * The following fields are required:
             * ```java
             * .displayName()
             * .email()
             * .optional()
             * .responseStatus()
             * .self()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Attendee]. */
        class Builder internal constructor() {

            private var displayName: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var optional: JsonField<Boolean>? = null
            private var responseStatus: JsonField<String>? = null
            private var self: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(attendee: Attendee) = apply {
                displayName = attendee.displayName
                email = attendee.email
                optional = attendee.optional
                responseStatus = attendee.responseStatus
                self = attendee.self
                additionalProperties = attendee.additionalProperties.toMutableMap()
            }

            /** Display name. */
            fun displayName(displayName: String?) = displayName(JsonField.ofNullable(displayName))

            /** Alias for calling [Builder.displayName] with `displayName.orElse(null)`. */
            fun displayName(displayName: Optional<String>) = displayName(displayName.getOrNull())

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            /** Email address. */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** Alias for calling [Builder.email] with `email.orElse(null)`. */
            fun email(email: Optional<String>) = email(email.getOrNull())

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Whether attendance is optional. */
            fun optional(optional: Boolean?) = optional(JsonField.ofNullable(optional))

            /**
             * Alias for [Builder.optional].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun optional(optional: Boolean) = optional(optional as Boolean?)

            /** Alias for calling [Builder.optional] with `optional.orElse(null)`. */
            fun optional(optional: Optional<Boolean>) = optional(optional.getOrNull())

            /**
             * Sets [Builder.optional] to an arbitrary JSON value.
             *
             * You should usually call [Builder.optional] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun optional(optional: JsonField<Boolean>) = apply { this.optional = optional }

            /** Calendar RSVP status. */
            fun responseStatus(responseStatus: String?) =
                responseStatus(JsonField.ofNullable(responseStatus))

            /** Alias for calling [Builder.responseStatus] with `responseStatus.orElse(null)`. */
            fun responseStatus(responseStatus: Optional<String>) =
                responseStatus(responseStatus.getOrNull())

            /**
             * Sets [Builder.responseStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun responseStatus(responseStatus: JsonField<String>) = apply {
                this.responseStatus = responseStatus
            }

            /** Whether this is the connected calendar user. */
            fun self(self: Boolean?) = self(JsonField.ofNullable(self))

            /**
             * Alias for [Builder.self].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun self(self: Boolean) = self(self as Boolean?)

            /** Alias for calling [Builder.self] with `self.orElse(null)`. */
            fun self(self: Optional<Boolean>) = self(self.getOrNull())

            /**
             * Sets [Builder.self] to an arbitrary JSON value.
             *
             * You should usually call [Builder.self] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun self(self: JsonField<Boolean>) = apply { this.self = self }

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
             * Returns an immutable instance of [Attendee].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .displayName()
             * .email()
             * .optional()
             * .responseStatus()
             * .self()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Attendee =
                Attendee(
                    checkRequired("displayName", displayName),
                    checkRequired("email", email),
                    checkRequired("optional", optional),
                    checkRequired("responseStatus", responseStatus),
                    checkRequired("self", self),
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
        fun validate(): Attendee = apply {
            if (validated) {
                return@apply
            }

            displayName()
            email()
            optional()
            responseStatus()
            self()
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
            (if (displayName.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (optional.asKnown().isPresent) 1 else 0) +
                (if (responseStatus.asKnown().isPresent) 1 else 0) +
                (if (self.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attendee &&
                displayName == other.displayName &&
                email == other.email &&
                optional == other.optional &&
                responseStatus == other.responseStatus &&
                self == other.self &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(displayName, email, optional, responseStatus, self, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attendee{displayName=$displayName, email=$email, optional=$optional, responseStatus=$responseStatus, self=$self, additionalProperties=$additionalProperties}"
    }

    /** Scheduling decision. */
    class Decision @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING = of("pending")

            @JvmField val SCHEDULED = of("scheduled")

            @JvmField val SKIPPED_POLICY = of("skipped_policy")

            @JvmField val SKIPPED_NO_URL = of("skipped_no_url")

            @JvmField val SKIPPED_DUPLICATE = of("skipped_duplicate")

            @JvmField val SKIPPED_UNSUPPORTED = of("skipped_unsupported")

            @JvmField val CANCELLED = of("cancelled")

            @JvmStatic fun of(value: String) = Decision(JsonField.of(value))
        }

        /** An enum containing [Decision]'s known values. */
        enum class Known {
            PENDING,
            SCHEDULED,
            SKIPPED_POLICY,
            SKIPPED_NO_URL,
            SKIPPED_DUPLICATE,
            SKIPPED_UNSUPPORTED,
            CANCELLED,
        }

        /**
         * An enum containing [Decision]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Decision] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            SCHEDULED,
            SKIPPED_POLICY,
            SKIPPED_NO_URL,
            SKIPPED_DUPLICATE,
            SKIPPED_UNSUPPORTED,
            CANCELLED,
            /** An enum member indicating that [Decision] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                SCHEDULED -> Value.SCHEDULED
                SKIPPED_POLICY -> Value.SKIPPED_POLICY
                SKIPPED_NO_URL -> Value.SKIPPED_NO_URL
                SKIPPED_DUPLICATE -> Value.SKIPPED_DUPLICATE
                SKIPPED_UNSUPPORTED -> Value.SKIPPED_UNSUPPORTED
                CANCELLED -> Value.CANCELLED
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
                PENDING -> Known.PENDING
                SCHEDULED -> Known.SCHEDULED
                SKIPPED_POLICY -> Known.SKIPPED_POLICY
                SKIPPED_NO_URL -> Known.SKIPPED_NO_URL
                SKIPPED_DUPLICATE -> Known.SKIPPED_DUPLICATE
                SKIPPED_UNSUPPORTED -> Known.SKIPPED_UNSUPPORTED
                CANCELLED -> Known.CANCELLED
                else -> throw TelnyxInvalidDataException("Unknown Decision: $value")
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
        fun validate(): Decision = apply {
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

            return other is Decision && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Organizer
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val displayName: JsonField<String>,
        private val email: JsonField<String>,
        private val self: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("self") @ExcludeMissing self: JsonField<Boolean> = JsonMissing.of(),
        ) : this(displayName, email, self, mutableMapOf())

        /**
         * Display name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.getOptional("display_name")

        /**
         * Email address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * Whether this is the connected calendar user.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun self(): Optional<Boolean> = self.getOptional("self")

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [self].
         *
         * Unlike [self], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("self") @ExcludeMissing fun _self(): JsonField<Boolean> = self

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
             * Returns a mutable builder for constructing an instance of [Organizer].
             *
             * The following fields are required:
             * ```java
             * .displayName()
             * .email()
             * .self()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Organizer]. */
        class Builder internal constructor() {

            private var displayName: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var self: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(organizer: Organizer) = apply {
                displayName = organizer.displayName
                email = organizer.email
                self = organizer.self
                additionalProperties = organizer.additionalProperties.toMutableMap()
            }

            /** Display name. */
            fun displayName(displayName: String?) = displayName(JsonField.ofNullable(displayName))

            /** Alias for calling [Builder.displayName] with `displayName.orElse(null)`. */
            fun displayName(displayName: Optional<String>) = displayName(displayName.getOrNull())

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            /** Email address. */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** Alias for calling [Builder.email] with `email.orElse(null)`. */
            fun email(email: Optional<String>) = email(email.getOrNull())

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Whether this is the connected calendar user. */
            fun self(self: Boolean?) = self(JsonField.ofNullable(self))

            /**
             * Alias for [Builder.self].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun self(self: Boolean) = self(self as Boolean?)

            /** Alias for calling [Builder.self] with `self.orElse(null)`. */
            fun self(self: Optional<Boolean>) = self(self.getOrNull())

            /**
             * Sets [Builder.self] to an arbitrary JSON value.
             *
             * You should usually call [Builder.self] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun self(self: JsonField<Boolean>) = apply { this.self = self }

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
             * Returns an immutable instance of [Organizer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .displayName()
             * .email()
             * .self()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Organizer =
                Organizer(
                    checkRequired("displayName", displayName),
                    checkRequired("email", email),
                    checkRequired("self", self),
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
        fun validate(): Organizer = apply {
            if (validated) {
                return@apply
            }

            displayName()
            email()
            self()
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
            (if (displayName.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (self.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Organizer &&
                displayName == other.displayName &&
                email == other.email &&
                self == other.self &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(displayName, email, self, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Organizer{displayName=$displayName, email=$email, self=$self, additionalProperties=$additionalProperties}"
    }

    /** Detected meeting platform. */
    class Platform @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ZOOM = of("zoom")

            @JvmField val GOOGLE_MEET = of("google_meet")

            @JvmField val TEAMS = of("teams")

            @JvmField val WEBEX = of("webex")

            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = Platform(JsonField.of(value))
        }

        /** An enum containing [Platform]'s known values. */
        enum class Known {
            ZOOM,
            GOOGLE_MEET,
            TEAMS,
            WEBEX,
            UNKNOWN,
        }

        /**
         * An enum containing [Platform]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Platform] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ZOOM,
            GOOGLE_MEET,
            TEAMS,
            WEBEX,
            UNKNOWN,
            /** An enum member indicating that [Platform] was instantiated with an unknown value. */
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
                ZOOM -> Value.ZOOM
                GOOGLE_MEET -> Value.GOOGLE_MEET
                TEAMS -> Value.TEAMS
                WEBEX -> Value.WEBEX
                UNKNOWN -> Value.UNKNOWN
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
                ZOOM -> Known.ZOOM
                GOOGLE_MEET -> Known.GOOGLE_MEET
                TEAMS -> Known.TEAMS
                WEBEX -> Known.WEBEX
                UNKNOWN -> Known.UNKNOWN
                else -> throw TelnyxInvalidDataException("Unknown Platform: $value")
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
        fun validate(): Platform = apply {
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

            return other is Platform && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CalendarMeeting &&
            id == other.id &&
            attendees == other.attendees &&
            botWillJoin == other.botWillJoin &&
            botWillJoinOverride == other.botWillJoinOverride &&
            decision == other.decision &&
            endTime == other.endTime &&
            isExternalOrganizer == other.isExternalOrganizer &&
            organizer == other.organizer &&
            platform == other.platform &&
            sessionId == other.sessionId &&
            startTime == other.startTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            attendees,
            botWillJoin,
            botWillJoinOverride,
            decision,
            endTime,
            isExternalOrganizer,
            organizer,
            platform,
            sessionId,
            startTime,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CalendarMeeting{id=$id, attendees=$attendees, botWillJoin=$botWillJoin, botWillJoinOverride=$botWillJoinOverride, decision=$decision, endTime=$endTime, isExternalOrganizer=$isExternalOrganizer, organizer=$organizer, platform=$platform, sessionId=$sessionId, startTime=$startTime, additionalProperties=$additionalProperties}"
}
