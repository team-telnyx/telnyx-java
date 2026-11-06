// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MeetingSessionAssistant
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val audioGate: JsonField<AudioGate>,
    private val leaveOnEnd: JsonField<Boolean>,
    private val dynamicVariables: JsonField<DynamicVariables>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("audio_gate")
        @ExcludeMissing
        audioGate: JsonField<AudioGate> = JsonMissing.of(),
        @JsonProperty("leave_on_end")
        @ExcludeMissing
        leaveOnEnd: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("dynamic_variables")
        @ExcludeMissing
        dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of(),
    ) : this(id, audioGate, leaveOnEnd, dynamicVariables, mutableMapOf())

    /**
     * Identifier of the assistant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Audio gating strategy in force for the assistant call leg.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun audioGate(): AudioGate = audioGate.getRequired("audio_gate")

    /**
     * Whether the bot leaves when the Assistant's conversation ends or fails.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun leaveOnEnd(): Boolean = leaveOnEnd.getRequired("leave_on_end")

    /**
     * Dynamic variables in individual-session responses; null when none were supplied. Omitted from
     * session list items.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dynamicVariables(): Optional<DynamicVariables> =
        dynamicVariables.getOptional("dynamic_variables")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [audioGate].
     *
     * Unlike [audioGate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audio_gate") @ExcludeMissing fun _audioGate(): JsonField<AudioGate> = audioGate

    /**
     * Returns the raw JSON value of [leaveOnEnd].
     *
     * Unlike [leaveOnEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("leave_on_end") @ExcludeMissing fun _leaveOnEnd(): JsonField<Boolean> = leaveOnEnd

    /**
     * Returns the raw JSON value of [dynamicVariables].
     *
     * Unlike [dynamicVariables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dynamic_variables")
    @ExcludeMissing
    fun _dynamicVariables(): JsonField<DynamicVariables> = dynamicVariables

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
         * Returns a mutable builder for constructing an instance of [MeetingSessionAssistant].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .audioGate()
         * .leaveOnEnd()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeetingSessionAssistant]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var audioGate: JsonField<AudioGate>? = null
        private var leaveOnEnd: JsonField<Boolean>? = null
        private var dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(meetingSessionAssistant: MeetingSessionAssistant) = apply {
            id = meetingSessionAssistant.id
            audioGate = meetingSessionAssistant.audioGate
            leaveOnEnd = meetingSessionAssistant.leaveOnEnd
            dynamicVariables = meetingSessionAssistant.dynamicVariables
            additionalProperties = meetingSessionAssistant.additionalProperties.toMutableMap()
        }

        /** Identifier of the assistant. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Audio gating strategy in force for the assistant call leg. */
        fun audioGate(audioGate: AudioGate) = audioGate(JsonField.of(audioGate))

        /**
         * Sets [Builder.audioGate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioGate] with a well-typed [AudioGate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun audioGate(audioGate: JsonField<AudioGate>) = apply { this.audioGate = audioGate }

        /** Whether the bot leaves when the Assistant's conversation ends or fails. */
        fun leaveOnEnd(leaveOnEnd: Boolean) = leaveOnEnd(JsonField.of(leaveOnEnd))

        /**
         * Sets [Builder.leaveOnEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.leaveOnEnd] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun leaveOnEnd(leaveOnEnd: JsonField<Boolean>) = apply { this.leaveOnEnd = leaveOnEnd }

        /**
         * Dynamic variables in individual-session responses; null when none were supplied. Omitted
         * from session list items.
         */
        fun dynamicVariables(dynamicVariables: DynamicVariables?) =
            dynamicVariables(JsonField.ofNullable(dynamicVariables))

        /** Alias for calling [Builder.dynamicVariables] with `dynamicVariables.orElse(null)`. */
        fun dynamicVariables(dynamicVariables: Optional<DynamicVariables>) =
            dynamicVariables(dynamicVariables.getOrNull())

        /**
         * Sets [Builder.dynamicVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dynamicVariables] with a well-typed [DynamicVariables]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dynamicVariables(dynamicVariables: JsonField<DynamicVariables>) = apply {
            this.dynamicVariables = dynamicVariables
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
         * Returns an immutable instance of [MeetingSessionAssistant].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .audioGate()
         * .leaveOnEnd()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeetingSessionAssistant =
            MeetingSessionAssistant(
                checkRequired("id", id),
                checkRequired("audioGate", audioGate),
                checkRequired("leaveOnEnd", leaveOnEnd),
                dynamicVariables,
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
    fun validate(): MeetingSessionAssistant = apply {
        if (validated) {
            return@apply
        }

        id()
        audioGate().validate()
        leaveOnEnd()
        dynamicVariables().ifPresent { it.validate() }
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
            (audioGate.asKnown().getOrNull()?.validity() ?: 0) +
            (if (leaveOnEnd.asKnown().isPresent) 1 else 0) +
            (dynamicVariables.asKnown().getOrNull()?.validity() ?: 0)

    /** Audio gating strategy in force for the assistant call leg. */
    class AudioGate @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val HALF_DUPLEX = of("half_duplex")

            @JvmField val FULL_DUPLEX = of("full_duplex")

            @JvmStatic fun of(value: String) = AudioGate(JsonField.of(value))
        }

        /** An enum containing [AudioGate]'s known values. */
        enum class Known {
            HALF_DUPLEX,
            FULL_DUPLEX,
        }

        /**
         * An enum containing [AudioGate]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AudioGate] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HALF_DUPLEX,
            FULL_DUPLEX,
            /**
             * An enum member indicating that [AudioGate] was instantiated with an unknown value.
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
                HALF_DUPLEX -> Value.HALF_DUPLEX
                FULL_DUPLEX -> Value.FULL_DUPLEX
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
                HALF_DUPLEX -> Known.HALF_DUPLEX
                FULL_DUPLEX -> Known.FULL_DUPLEX
                else -> throw TelnyxInvalidDataException("Unknown AudioGate: $value")
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
        fun validate(): AudioGate = apply {
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

            return other is AudioGate && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Dynamic variables in individual-session responses; null when none were supplied. Omitted from
     * session list items.
     */
    class DynamicVariables
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [DynamicVariables]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DynamicVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dynamicVariables: DynamicVariables) = apply {
                additionalProperties = dynamicVariables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DynamicVariables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DynamicVariables = DynamicVariables(additionalProperties.toImmutable())
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
        fun validate(): DynamicVariables = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DynamicVariables && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "DynamicVariables{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeetingSessionAssistant &&
            id == other.id &&
            audioGate == other.audioGate &&
            leaveOnEnd == other.leaveOnEnd &&
            dynamicVariables == other.dynamicVariables &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, audioGate, leaveOnEnd, dynamicVariables, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MeetingSessionAssistant{id=$id, audioGate=$audioGate, leaveOnEnd=$leaveOnEnd, dynamicVariables=$dynamicVariables, additionalProperties=$additionalProperties}"
}
