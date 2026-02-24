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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update properties of a conference participant. */
class ConferenceUpdateParticipantParams
private constructor(
    private val id: String,
    private val participantId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    fun participantId(): Optional<String> = Optional.ofNullable(participantId)

    /**
     * Whether entry/exit beeps are enabled for this participant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beepEnabled(): Optional<BeepEnabled> = body.beepEnabled()

    /**
     * Whether the conference should end when this participant exits.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endConferenceOnExit(): Optional<Boolean> = body.endConferenceOnExit()

    /**
     * Whether the conference should soft-end when this participant exits. A soft end will stop new
     * participants from joining but allow existing participants to remain.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun softEndConferenceOnExit(): Optional<Boolean> = body.softEndConferenceOnExit()

    /**
     * Returns the raw JSON value of [beepEnabled].
     *
     * Unlike [beepEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _beepEnabled(): JsonField<BeepEnabled> = body._beepEnabled()

    /**
     * Returns the raw JSON value of [endConferenceOnExit].
     *
     * Unlike [endConferenceOnExit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _endConferenceOnExit(): JsonField<Boolean> = body._endConferenceOnExit()

    /**
     * Returns the raw JSON value of [softEndConferenceOnExit].
     *
     * Unlike [softEndConferenceOnExit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _softEndConferenceOnExit(): JsonField<Boolean> = body._softEndConferenceOnExit()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ConferenceUpdateParticipantParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConferenceUpdateParticipantParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var participantId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(conferenceUpdateParticipantParams: ConferenceUpdateParticipantParams) =
            apply {
                id = conferenceUpdateParticipantParams.id
                participantId = conferenceUpdateParticipantParams.participantId
                body = conferenceUpdateParticipantParams.body.toBuilder()
                additionalHeaders = conferenceUpdateParticipantParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    conferenceUpdateParticipantParams.additionalQueryParams.toBuilder()
            }

        fun id(id: String) = apply { this.id = id }

        fun participantId(participantId: String?) = apply { this.participantId = participantId }

        /** Alias for calling [Builder.participantId] with `participantId.orElse(null)`. */
        fun participantId(participantId: Optional<String>) =
            participantId(participantId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [beepEnabled]
         * - [endConferenceOnExit]
         * - [softEndConferenceOnExit]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Whether entry/exit beeps are enabled for this participant. */
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

        /** Whether the conference should end when this participant exits. */
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
         * Whether the conference should soft-end when this participant exits. A soft end will stop
         * new participants from joining but allow existing participants to remain.
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
         * Returns an immutable instance of [ConferenceUpdateParticipantParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConferenceUpdateParticipantParams =
            ConferenceUpdateParticipantParams(
                checkRequired("id", id),
                participantId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            1 -> participantId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val beepEnabled: JsonField<BeepEnabled>,
        private val endConferenceOnExit: JsonField<Boolean>,
        private val softEndConferenceOnExit: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("beep_enabled")
            @ExcludeMissing
            beepEnabled: JsonField<BeepEnabled> = JsonMissing.of(),
            @JsonProperty("end_conference_on_exit")
            @ExcludeMissing
            endConferenceOnExit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("soft_end_conference_on_exit")
            @ExcludeMissing
            softEndConferenceOnExit: JsonField<Boolean> = JsonMissing.of(),
        ) : this(beepEnabled, endConferenceOnExit, softEndConferenceOnExit, mutableMapOf())

        /**
         * Whether entry/exit beeps are enabled for this participant.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun beepEnabled(): Optional<BeepEnabled> = beepEnabled.getOptional("beep_enabled")

        /**
         * Whether the conference should end when this participant exits.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endConferenceOnExit(): Optional<Boolean> =
            endConferenceOnExit.getOptional("end_conference_on_exit")

        /**
         * Whether the conference should soft-end when this participant exits. A soft end will stop
         * new participants from joining but allow existing participants to remain.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun softEndConferenceOnExit(): Optional<Boolean> =
            softEndConferenceOnExit.getOptional("soft_end_conference_on_exit")

        /**
         * Returns the raw JSON value of [beepEnabled].
         *
         * Unlike [beepEnabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beep_enabled")
        @ExcludeMissing
        fun _beepEnabled(): JsonField<BeepEnabled> = beepEnabled

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
         * Returns the raw JSON value of [softEndConferenceOnExit].
         *
         * Unlike [softEndConferenceOnExit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("soft_end_conference_on_exit")
        @ExcludeMissing
        fun _softEndConferenceOnExit(): JsonField<Boolean> = softEndConferenceOnExit

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

            private var beepEnabled: JsonField<BeepEnabled> = JsonMissing.of()
            private var endConferenceOnExit: JsonField<Boolean> = JsonMissing.of()
            private var softEndConferenceOnExit: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                beepEnabled = body.beepEnabled
                endConferenceOnExit = body.endConferenceOnExit
                softEndConferenceOnExit = body.softEndConferenceOnExit
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Whether entry/exit beeps are enabled for this participant. */
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

            /** Whether the conference should end when this participant exits. */
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
             * Whether the conference should soft-end when this participant exits. A soft end will
             * stop new participants from joining but allow existing participants to remain.
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
                    beepEnabled,
                    endConferenceOnExit,
                    softEndConferenceOnExit,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            beepEnabled().ifPresent { it.validate() }
            endConferenceOnExit()
            softEndConferenceOnExit()
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
            (beepEnabled.asKnown().getOrNull()?.validity() ?: 0) +
                (if (endConferenceOnExit.asKnown().isPresent) 1 else 0) +
                (if (softEndConferenceOnExit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                beepEnabled == other.beepEnabled &&
                endConferenceOnExit == other.endConferenceOnExit &&
                softEndConferenceOnExit == other.softEndConferenceOnExit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                beepEnabled,
                endConferenceOnExit,
                softEndConferenceOnExit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{beepEnabled=$beepEnabled, endConferenceOnExit=$endConferenceOnExit, softEndConferenceOnExit=$softEndConferenceOnExit, additionalProperties=$additionalProperties}"
    }

    /** Whether entry/exit beeps are enabled for this participant. */
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

        return other is ConferenceUpdateParticipantParams &&
            id == other.id &&
            participantId == other.participantId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, participantId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ConferenceUpdateParticipantParams{id=$id, participantId=$participantId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
