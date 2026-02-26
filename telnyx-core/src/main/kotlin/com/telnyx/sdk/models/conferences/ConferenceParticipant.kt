// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences

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
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConferenceParticipant
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val callControlId: JsonField<String>,
    private val callLegId: JsonField<String>,
    private val conferenceId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val endConferenceOnExit: JsonField<Boolean>,
    private val label: JsonField<String>,
    private val muted: JsonField<Boolean>,
    private val onHold: JsonField<Boolean>,
    private val softEndConferenceOnExit: JsonField<Boolean>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val whisperCallControlIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_control_id")
        @ExcludeMissing
        callControlId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_leg_id")
        @ExcludeMissing
        callLegId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conference_id")
        @ExcludeMissing
        conferenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_conference_on_exit")
        @ExcludeMissing
        endConferenceOnExit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("muted") @ExcludeMissing muted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("on_hold") @ExcludeMissing onHold: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("soft_end_conference_on_exit")
        @ExcludeMissing
        softEndConferenceOnExit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("whisper_call_control_ids")
        @ExcludeMissing
        whisperCallControlIds: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        callControlId,
        callLegId,
        conferenceId,
        createdAt,
        endConferenceOnExit,
        label,
        muted,
        onHold,
        softEndConferenceOnExit,
        status,
        updatedAt,
        whisperCallControlIds,
        mutableMapOf(),
    )

    /**
     * Uniquely identifies the participant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Unique identifier and token for controlling the participant's call leg.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callControlId(): Optional<String> = callControlId.getOptional("call_control_id")

    /**
     * Unique identifier for the call leg.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callLegId(): Optional<String> = callLegId.getOptional("call_leg_id")

    /**
     * Unique identifier for the conference.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conferenceId(): Optional<String> = conferenceId.getOptional("conference_id")

    /**
     * Timestamp when the participant joined.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Whether the conference ends when this participant exits.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endConferenceOnExit(): Optional<Boolean> =
        endConferenceOnExit.getOptional("end_conference_on_exit")

    /**
     * Label assigned to the participant when joining.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * Whether the participant is muted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun muted(): Optional<Boolean> = muted.getOptional("muted")

    /**
     * Whether the participant is on hold.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onHold(): Optional<Boolean> = onHold.getOptional("on_hold")

    /**
     * Whether the conference soft-ends when this participant exits.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun softEndConferenceOnExit(): Optional<Boolean> =
        softEndConferenceOnExit.getOptional("soft_end_conference_on_exit")

    /**
     * Status of the participant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Timestamp when the participant was last updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * List of call control IDs this participant is whispering to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun whisperCallControlIds(): Optional<List<String>> =
        whisperCallControlIds.getOptional("whisper_call_control_ids")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [callControlId].
     *
     * Unlike [callControlId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_control_id")
    @ExcludeMissing
    fun _callControlId(): JsonField<String> = callControlId

    /**
     * Returns the raw JSON value of [callLegId].
     *
     * Unlike [callLegId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_leg_id") @ExcludeMissing fun _callLegId(): JsonField<String> = callLegId

    /**
     * Returns the raw JSON value of [conferenceId].
     *
     * Unlike [conferenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conference_id")
    @ExcludeMissing
    fun _conferenceId(): JsonField<String> = conferenceId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [endConferenceOnExit].
     *
     * Unlike [endConferenceOnExit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("end_conference_on_exit")
    @ExcludeMissing
    fun _endConferenceOnExit(): JsonField<Boolean> = endConferenceOnExit

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [muted].
     *
     * Unlike [muted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("muted") @ExcludeMissing fun _muted(): JsonField<Boolean> = muted

    /**
     * Returns the raw JSON value of [onHold].
     *
     * Unlike [onHold], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("on_hold") @ExcludeMissing fun _onHold(): JsonField<Boolean> = onHold

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
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [whisperCallControlIds].
     *
     * Unlike [whisperCallControlIds], this method doesn't throw if the JSON field has an unexpected
     * type.
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

        /** Returns a mutable builder for constructing an instance of [ConferenceParticipant]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConferenceParticipant]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var callControlId: JsonField<String> = JsonMissing.of()
        private var callLegId: JsonField<String> = JsonMissing.of()
        private var conferenceId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endConferenceOnExit: JsonField<Boolean> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var muted: JsonField<Boolean> = JsonMissing.of()
        private var onHold: JsonField<Boolean> = JsonMissing.of()
        private var softEndConferenceOnExit: JsonField<Boolean> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var whisperCallControlIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(conferenceParticipant: ConferenceParticipant) = apply {
            id = conferenceParticipant.id
            callControlId = conferenceParticipant.callControlId
            callLegId = conferenceParticipant.callLegId
            conferenceId = conferenceParticipant.conferenceId
            createdAt = conferenceParticipant.createdAt
            endConferenceOnExit = conferenceParticipant.endConferenceOnExit
            label = conferenceParticipant.label
            muted = conferenceParticipant.muted
            onHold = conferenceParticipant.onHold
            softEndConferenceOnExit = conferenceParticipant.softEndConferenceOnExit
            status = conferenceParticipant.status
            updatedAt = conferenceParticipant.updatedAt
            whisperCallControlIds =
                conferenceParticipant.whisperCallControlIds.map { it.toMutableList() }
            additionalProperties = conferenceParticipant.additionalProperties.toMutableMap()
        }

        /** Uniquely identifies the participant. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Unique identifier and token for controlling the participant's call leg. */
        fun callControlId(callControlId: String) = callControlId(JsonField.of(callControlId))

        /**
         * Sets [Builder.callControlId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callControlId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callControlId(callControlId: JsonField<String>) = apply {
            this.callControlId = callControlId
        }

        /** Unique identifier for the call leg. */
        fun callLegId(callLegId: String) = callLegId(JsonField.of(callLegId))

        /**
         * Sets [Builder.callLegId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callLegId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callLegId(callLegId: JsonField<String>) = apply { this.callLegId = callLegId }

        /** Unique identifier for the conference. */
        fun conferenceId(conferenceId: String) = conferenceId(JsonField.of(conferenceId))

        /**
         * Sets [Builder.conferenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conferenceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun conferenceId(conferenceId: JsonField<String>) = apply {
            this.conferenceId = conferenceId
        }

        /** Timestamp when the participant joined. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Whether the conference ends when this participant exits. */
        fun endConferenceOnExit(endConferenceOnExit: Boolean) =
            endConferenceOnExit(JsonField.of(endConferenceOnExit))

        /**
         * Sets [Builder.endConferenceOnExit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endConferenceOnExit] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endConferenceOnExit(endConferenceOnExit: JsonField<Boolean>) = apply {
            this.endConferenceOnExit = endConferenceOnExit
        }

        /** Label assigned to the participant when joining. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** Whether the participant is muted. */
        fun muted(muted: Boolean) = muted(JsonField.of(muted))

        /**
         * Sets [Builder.muted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.muted] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun muted(muted: JsonField<Boolean>) = apply { this.muted = muted }

        /** Whether the participant is on hold. */
        fun onHold(onHold: Boolean) = onHold(JsonField.of(onHold))

        /**
         * Sets [Builder.onHold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onHold] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun onHold(onHold: JsonField<Boolean>) = apply { this.onHold = onHold }

        /** Whether the conference soft-ends when this participant exits. */
        fun softEndConferenceOnExit(softEndConferenceOnExit: Boolean) =
            softEndConferenceOnExit(JsonField.of(softEndConferenceOnExit))

        /**
         * Sets [Builder.softEndConferenceOnExit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.softEndConferenceOnExit] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun softEndConferenceOnExit(softEndConferenceOnExit: JsonField<Boolean>) = apply {
            this.softEndConferenceOnExit = softEndConferenceOnExit
        }

        /** Status of the participant. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Timestamp when the participant was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** List of call control IDs this participant is whispering to. */
        fun whisperCallControlIds(whisperCallControlIds: List<String>) =
            whisperCallControlIds(JsonField.of(whisperCallControlIds))

        /**
         * Sets [Builder.whisperCallControlIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.whisperCallControlIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * Returns an immutable instance of [ConferenceParticipant].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConferenceParticipant =
            ConferenceParticipant(
                id,
                callControlId,
                callLegId,
                conferenceId,
                createdAt,
                endConferenceOnExit,
                label,
                muted,
                onHold,
                softEndConferenceOnExit,
                status,
                updatedAt,
                (whisperCallControlIds ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConferenceParticipant = apply {
        if (validated) {
            return@apply
        }

        id()
        callControlId()
        callLegId()
        conferenceId()
        createdAt()
        endConferenceOnExit()
        label()
        muted()
        onHold()
        softEndConferenceOnExit()
        status().ifPresent { it.validate() }
        updatedAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (callControlId.asKnown().isPresent) 1 else 0) +
            (if (callLegId.asKnown().isPresent) 1 else 0) +
            (if (conferenceId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (endConferenceOnExit.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (muted.asKnown().isPresent) 1 else 0) +
            (if (onHold.asKnown().isPresent) 1 else 0) +
            (if (softEndConferenceOnExit.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (whisperCallControlIds.asKnown().getOrNull()?.size ?: 0)

    /** Status of the participant. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val JOINING = of("joining")

            @JvmField val JOINED = of("joined")

            @JvmField val LEFT = of("left")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            JOINING,
            JOINED,
            LEFT,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            JOINING,
            JOINED,
            LEFT,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                JOINING -> Value.JOINING
                JOINED -> Value.JOINED
                LEFT -> Value.LEFT
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
                JOINING -> Known.JOINING
                JOINED -> Known.JOINED
                LEFT -> Known.LEFT
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConferenceParticipant &&
            id == other.id &&
            callControlId == other.callControlId &&
            callLegId == other.callLegId &&
            conferenceId == other.conferenceId &&
            createdAt == other.createdAt &&
            endConferenceOnExit == other.endConferenceOnExit &&
            label == other.label &&
            muted == other.muted &&
            onHold == other.onHold &&
            softEndConferenceOnExit == other.softEndConferenceOnExit &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            whisperCallControlIds == other.whisperCallControlIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            callControlId,
            callLegId,
            conferenceId,
            createdAt,
            endConferenceOnExit,
            label,
            muted,
            onHold,
            softEndConferenceOnExit,
            status,
            updatedAt,
            whisperCallControlIds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConferenceParticipant{id=$id, callControlId=$callControlId, callLegId=$callLegId, conferenceId=$conferenceId, createdAt=$createdAt, endConferenceOnExit=$endConferenceOnExit, label=$label, muted=$muted, onHold=$onHold, softEndConferenceOnExit=$softEndConferenceOnExit, status=$status, updatedAt=$updatedAt, whisperCallControlIds=$whisperCallControlIds, additionalProperties=$additionalProperties}"
}
