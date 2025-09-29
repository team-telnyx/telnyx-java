// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.conferences.participants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ParticipantParticipantsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountSid: JsonField<String>,
    private val callSid: JsonField<String>,
    private val coaching: JsonField<Boolean>,
    private val coachingCallSid: JsonField<String>,
    private val endConferenceOnExit: JsonField<Boolean>,
    private val hold: JsonField<Boolean>,
    private val muted: JsonField<Boolean>,
    private val status: JsonField<Status>,
    private val uri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_sid")
        @ExcludeMissing
        accountSid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_sid") @ExcludeMissing callSid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("coaching") @ExcludeMissing coaching: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("coaching_call_sid")
        @ExcludeMissing
        coachingCallSid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_conference_on_exit")
        @ExcludeMissing
        endConferenceOnExit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hold") @ExcludeMissing hold: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("muted") @ExcludeMissing muted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountSid,
        callSid,
        coaching,
        coachingCallSid,
        endConferenceOnExit,
        hold,
        muted,
        status,
        uri,
        mutableMapOf(),
    )

    /**
     * The id of the account the resource belongs to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountSid(): Optional<String> = accountSid.getOptional("account_sid")

    /**
     * The identifier of this participant's call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callSid(): Optional<String> = callSid.getOptional("call_sid")

    /**
     * Whether the participant is coaching another call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun coaching(): Optional<Boolean> = coaching.getOptional("coaching")

    /**
     * The identifier of the coached participant's call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun coachingCallSid(): Optional<String> = coachingCallSid.getOptional("coaching_call_sid")

    /**
     * Whether the conference ends when the participant leaves.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endConferenceOnExit(): Optional<Boolean> =
        endConferenceOnExit.getOptional("end_conference_on_exit")

    /**
     * Whether the participant is on hold.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hold(): Optional<Boolean> = hold.getOptional("hold")

    /**
     * Whether the participant is muted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun muted(): Optional<Boolean> = muted.getOptional("muted")

    /**
     * The status of the participant's call in the conference.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * The relative URI for this participant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uri(): Optional<String> = uri.getOptional("uri")

    /**
     * Returns the raw JSON value of [accountSid].
     *
     * Unlike [accountSid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_sid") @ExcludeMissing fun _accountSid(): JsonField<String> = accountSid

    /**
     * Returns the raw JSON value of [callSid].
     *
     * Unlike [callSid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_sid") @ExcludeMissing fun _callSid(): JsonField<String> = callSid

    /**
     * Returns the raw JSON value of [coaching].
     *
     * Unlike [coaching], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coaching") @ExcludeMissing fun _coaching(): JsonField<Boolean> = coaching

    /**
     * Returns the raw JSON value of [coachingCallSid].
     *
     * Unlike [coachingCallSid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coaching_call_sid")
    @ExcludeMissing
    fun _coachingCallSid(): JsonField<String> = coachingCallSid

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
     * Returns the raw JSON value of [hold].
     *
     * Unlike [hold], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hold") @ExcludeMissing fun _hold(): JsonField<Boolean> = hold

    /**
     * Returns the raw JSON value of [muted].
     *
     * Unlike [muted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("muted") @ExcludeMissing fun _muted(): JsonField<Boolean> = muted

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [uri].
     *
     * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

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
         * Returns a mutable builder for constructing an instance of
         * [ParticipantParticipantsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantParticipantsResponse]. */
    class Builder internal constructor() {

        private var accountSid: JsonField<String> = JsonMissing.of()
        private var callSid: JsonField<String> = JsonMissing.of()
        private var coaching: JsonField<Boolean> = JsonMissing.of()
        private var coachingCallSid: JsonField<String> = JsonMissing.of()
        private var endConferenceOnExit: JsonField<Boolean> = JsonMissing.of()
        private var hold: JsonField<Boolean> = JsonMissing.of()
        private var muted: JsonField<Boolean> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(participantParticipantsResponse: ParticipantParticipantsResponse) =
            apply {
                accountSid = participantParticipantsResponse.accountSid
                callSid = participantParticipantsResponse.callSid
                coaching = participantParticipantsResponse.coaching
                coachingCallSid = participantParticipantsResponse.coachingCallSid
                endConferenceOnExit = participantParticipantsResponse.endConferenceOnExit
                hold = participantParticipantsResponse.hold
                muted = participantParticipantsResponse.muted
                status = participantParticipantsResponse.status
                uri = participantParticipantsResponse.uri
                additionalProperties =
                    participantParticipantsResponse.additionalProperties.toMutableMap()
            }

        /** The id of the account the resource belongs to. */
        fun accountSid(accountSid: String) = accountSid(JsonField.of(accountSid))

        /**
         * Sets [Builder.accountSid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountSid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountSid(accountSid: JsonField<String>) = apply { this.accountSid = accountSid }

        /** The identifier of this participant's call. */
        fun callSid(callSid: String) = callSid(JsonField.of(callSid))

        /**
         * Sets [Builder.callSid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun callSid(callSid: JsonField<String>) = apply { this.callSid = callSid }

        /** Whether the participant is coaching another call. */
        fun coaching(coaching: Boolean) = coaching(JsonField.of(coaching))

        /**
         * Sets [Builder.coaching] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coaching] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun coaching(coaching: JsonField<Boolean>) = apply { this.coaching = coaching }

        /** The identifier of the coached participant's call. */
        fun coachingCallSid(coachingCallSid: String) =
            coachingCallSid(JsonField.of(coachingCallSid))

        /**
         * Sets [Builder.coachingCallSid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coachingCallSid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun coachingCallSid(coachingCallSid: JsonField<String>) = apply {
            this.coachingCallSid = coachingCallSid
        }

        /** Whether the conference ends when the participant leaves. */
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

        /** Whether the participant is on hold. */
        fun hold(hold: Boolean) = hold(JsonField.of(hold))

        /**
         * Sets [Builder.hold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hold] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hold(hold: JsonField<Boolean>) = apply { this.hold = hold }

        /** Whether the participant is muted. */
        fun muted(muted: Boolean) = muted(JsonField.of(muted))

        /**
         * Sets [Builder.muted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.muted] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun muted(muted: JsonField<Boolean>) = apply { this.muted = muted }

        /** The status of the participant's call in the conference. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The relative URI for this participant. */
        fun uri(uri: String) = uri(JsonField.of(uri))

        /**
         * Sets [Builder.uri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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
         * Returns an immutable instance of [ParticipantParticipantsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ParticipantParticipantsResponse =
            ParticipantParticipantsResponse(
                accountSid,
                callSid,
                coaching,
                coachingCallSid,
                endConferenceOnExit,
                hold,
                muted,
                status,
                uri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ParticipantParticipantsResponse = apply {
        if (validated) {
            return@apply
        }

        accountSid()
        callSid()
        coaching()
        coachingCallSid()
        endConferenceOnExit()
        hold()
        muted()
        status().ifPresent { it.validate() }
        uri()
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
        (if (accountSid.asKnown().isPresent) 1 else 0) +
            (if (callSid.asKnown().isPresent) 1 else 0) +
            (if (coaching.asKnown().isPresent) 1 else 0) +
            (if (coachingCallSid.asKnown().isPresent) 1 else 0) +
            (if (endConferenceOnExit.asKnown().isPresent) 1 else 0) +
            (if (hold.asKnown().isPresent) 1 else 0) +
            (if (muted.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (uri.asKnown().isPresent) 1 else 0)

    /** The status of the participant's call in the conference. */
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

            @JvmField val CONNECTING = of("connecting")

            @JvmField val CONNECTED = of("connected")

            @JvmField val COMPLETED = of("completed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CONNECTING,
            CONNECTED,
            COMPLETED,
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
            CONNECTING,
            CONNECTED,
            COMPLETED,
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
                CONNECTING -> Value.CONNECTING
                CONNECTED -> Value.CONNECTED
                COMPLETED -> Value.COMPLETED
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
                CONNECTING -> Known.CONNECTING
                CONNECTED -> Known.CONNECTED
                COMPLETED -> Known.COMPLETED
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

        return other is ParticipantParticipantsResponse &&
            accountSid == other.accountSid &&
            callSid == other.callSid &&
            coaching == other.coaching &&
            coachingCallSid == other.coachingCallSid &&
            endConferenceOnExit == other.endConferenceOnExit &&
            hold == other.hold &&
            muted == other.muted &&
            status == other.status &&
            uri == other.uri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountSid,
            callSid,
            coaching,
            coachingCallSid,
            endConferenceOnExit,
            hold,
            muted,
            status,
            uri,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipantParticipantsResponse{accountSid=$accountSid, callSid=$callSid, coaching=$coaching, coachingCallSid=$coachingCallSid, endConferenceOnExit=$endConferenceOnExit, hold=$hold, muted=$muted, status=$status, uri=$uri, additionalProperties=$additionalProperties}"
}
