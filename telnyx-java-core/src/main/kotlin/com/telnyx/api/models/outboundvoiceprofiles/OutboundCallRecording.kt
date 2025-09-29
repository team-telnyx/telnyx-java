// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.outboundvoiceprofiles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OutboundCallRecording
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val callRecordingCallerPhoneNumbers: JsonField<List<String>>,
    private val callRecordingChannels: JsonField<CallRecordingChannels>,
    private val callRecordingFormat: JsonField<CallRecordingFormat>,
    private val callRecordingType: JsonField<CallRecordingType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("call_recording_caller_phone_numbers")
        @ExcludeMissing
        callRecordingCallerPhoneNumbers: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("call_recording_channels")
        @ExcludeMissing
        callRecordingChannels: JsonField<CallRecordingChannels> = JsonMissing.of(),
        @JsonProperty("call_recording_format")
        @ExcludeMissing
        callRecordingFormat: JsonField<CallRecordingFormat> = JsonMissing.of(),
        @JsonProperty("call_recording_type")
        @ExcludeMissing
        callRecordingType: JsonField<CallRecordingType> = JsonMissing.of(),
    ) : this(
        callRecordingCallerPhoneNumbers,
        callRecordingChannels,
        callRecordingFormat,
        callRecordingType,
        mutableMapOf(),
    )

    /**
     * When call_recording_type is 'by_caller_phone_number', only outbound calls using one of these
     * numbers will be recorded. Numbers must be specified in E164 format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callRecordingCallerPhoneNumbers(): Optional<List<String>> =
        callRecordingCallerPhoneNumbers.getOptional("call_recording_caller_phone_numbers")

    /**
     * When using 'dual' channels, the final audio file will be a stereo recording with the first
     * leg on channel A, and the rest on channel B.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callRecordingChannels(): Optional<CallRecordingChannels> =
        callRecordingChannels.getOptional("call_recording_channels")

    /**
     * The audio file format for calls being recorded.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callRecordingFormat(): Optional<CallRecordingFormat> =
        callRecordingFormat.getOptional("call_recording_format")

    /**
     * Specifies which calls are recorded.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callRecordingType(): Optional<CallRecordingType> =
        callRecordingType.getOptional("call_recording_type")

    /**
     * Returns the raw JSON value of [callRecordingCallerPhoneNumbers].
     *
     * Unlike [callRecordingCallerPhoneNumbers], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("call_recording_caller_phone_numbers")
    @ExcludeMissing
    fun _callRecordingCallerPhoneNumbers(): JsonField<List<String>> =
        callRecordingCallerPhoneNumbers

    /**
     * Returns the raw JSON value of [callRecordingChannels].
     *
     * Unlike [callRecordingChannels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("call_recording_channels")
    @ExcludeMissing
    fun _callRecordingChannels(): JsonField<CallRecordingChannels> = callRecordingChannels

    /**
     * Returns the raw JSON value of [callRecordingFormat].
     *
     * Unlike [callRecordingFormat], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("call_recording_format")
    @ExcludeMissing
    fun _callRecordingFormat(): JsonField<CallRecordingFormat> = callRecordingFormat

    /**
     * Returns the raw JSON value of [callRecordingType].
     *
     * Unlike [callRecordingType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("call_recording_type")
    @ExcludeMissing
    fun _callRecordingType(): JsonField<CallRecordingType> = callRecordingType

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

        /** Returns a mutable builder for constructing an instance of [OutboundCallRecording]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OutboundCallRecording]. */
    class Builder internal constructor() {

        private var callRecordingCallerPhoneNumbers: JsonField<MutableList<String>>? = null
        private var callRecordingChannels: JsonField<CallRecordingChannels> = JsonMissing.of()
        private var callRecordingFormat: JsonField<CallRecordingFormat> = JsonMissing.of()
        private var callRecordingType: JsonField<CallRecordingType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(outboundCallRecording: OutboundCallRecording) = apply {
            callRecordingCallerPhoneNumbers =
                outboundCallRecording.callRecordingCallerPhoneNumbers.map { it.toMutableList() }
            callRecordingChannels = outboundCallRecording.callRecordingChannels
            callRecordingFormat = outboundCallRecording.callRecordingFormat
            callRecordingType = outboundCallRecording.callRecordingType
            additionalProperties = outboundCallRecording.additionalProperties.toMutableMap()
        }

        /**
         * When call_recording_type is 'by_caller_phone_number', only outbound calls using one of
         * these numbers will be recorded. Numbers must be specified in E164 format.
         */
        fun callRecordingCallerPhoneNumbers(callRecordingCallerPhoneNumbers: List<String>) =
            callRecordingCallerPhoneNumbers(JsonField.of(callRecordingCallerPhoneNumbers))

        /**
         * Sets [Builder.callRecordingCallerPhoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callRecordingCallerPhoneNumbers] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun callRecordingCallerPhoneNumbers(
            callRecordingCallerPhoneNumbers: JsonField<List<String>>
        ) = apply {
            this.callRecordingCallerPhoneNumbers =
                callRecordingCallerPhoneNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [callRecordingCallerPhoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCallRecordingCallerPhoneNumber(callRecordingCallerPhoneNumber: String) = apply {
            callRecordingCallerPhoneNumbers =
                (callRecordingCallerPhoneNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("callRecordingCallerPhoneNumbers", it)
                        .add(callRecordingCallerPhoneNumber)
                }
        }

        /**
         * When using 'dual' channels, the final audio file will be a stereo recording with the
         * first leg on channel A, and the rest on channel B.
         */
        fun callRecordingChannels(callRecordingChannels: CallRecordingChannels) =
            callRecordingChannels(JsonField.of(callRecordingChannels))

        /**
         * Sets [Builder.callRecordingChannels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callRecordingChannels] with a well-typed
         * [CallRecordingChannels] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun callRecordingChannels(callRecordingChannels: JsonField<CallRecordingChannels>) = apply {
            this.callRecordingChannels = callRecordingChannels
        }

        /** The audio file format for calls being recorded. */
        fun callRecordingFormat(callRecordingFormat: CallRecordingFormat) =
            callRecordingFormat(JsonField.of(callRecordingFormat))

        /**
         * Sets [Builder.callRecordingFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callRecordingFormat] with a well-typed
         * [CallRecordingFormat] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun callRecordingFormat(callRecordingFormat: JsonField<CallRecordingFormat>) = apply {
            this.callRecordingFormat = callRecordingFormat
        }

        /** Specifies which calls are recorded. */
        fun callRecordingType(callRecordingType: CallRecordingType) =
            callRecordingType(JsonField.of(callRecordingType))

        /**
         * Sets [Builder.callRecordingType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callRecordingType] with a well-typed [CallRecordingType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun callRecordingType(callRecordingType: JsonField<CallRecordingType>) = apply {
            this.callRecordingType = callRecordingType
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
         * Returns an immutable instance of [OutboundCallRecording].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OutboundCallRecording =
            OutboundCallRecording(
                (callRecordingCallerPhoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                callRecordingChannels,
                callRecordingFormat,
                callRecordingType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OutboundCallRecording = apply {
        if (validated) {
            return@apply
        }

        callRecordingCallerPhoneNumbers()
        callRecordingChannels().ifPresent { it.validate() }
        callRecordingFormat().ifPresent { it.validate() }
        callRecordingType().ifPresent { it.validate() }
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
        (callRecordingCallerPhoneNumbers.asKnown().getOrNull()?.size ?: 0) +
            (callRecordingChannels.asKnown().getOrNull()?.validity() ?: 0) +
            (callRecordingFormat.asKnown().getOrNull()?.validity() ?: 0) +
            (callRecordingType.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * When using 'dual' channels, the final audio file will be a stereo recording with the first
     * leg on channel A, and the rest on channel B.
     */
    class CallRecordingChannels
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

            @JvmField val SINGLE = of("single")

            @JvmField val DUAL = of("dual")

            @JvmStatic fun of(value: String) = CallRecordingChannels(JsonField.of(value))
        }

        /** An enum containing [CallRecordingChannels]'s known values. */
        enum class Known {
            SINGLE,
            DUAL,
        }

        /**
         * An enum containing [CallRecordingChannels]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [CallRecordingChannels] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SINGLE,
            DUAL,
            /**
             * An enum member indicating that [CallRecordingChannels] was instantiated with an
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
                else -> throw TelnyxInvalidDataException("Unknown CallRecordingChannels: $value")
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

        fun validate(): CallRecordingChannels = apply {
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

            return other is CallRecordingChannels && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The audio file format for calls being recorded. */
    class CallRecordingFormat
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

            @JvmField val WAV = of("wav")

            @JvmField val MP3 = of("mp3")

            @JvmStatic fun of(value: String) = CallRecordingFormat(JsonField.of(value))
        }

        /** An enum containing [CallRecordingFormat]'s known values. */
        enum class Known {
            WAV,
            MP3,
        }

        /**
         * An enum containing [CallRecordingFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CallRecordingFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WAV,
            MP3,
            /**
             * An enum member indicating that [CallRecordingFormat] was instantiated with an unknown
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
                else -> throw TelnyxInvalidDataException("Unknown CallRecordingFormat: $value")
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

        fun validate(): CallRecordingFormat = apply {
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

            return other is CallRecordingFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Specifies which calls are recorded. */
    class CallRecordingType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ALL = of("all")

            @JvmField val NONE = of("none")

            @JvmField val BY_CALLER_PHONE_NUMBER = of("by_caller_phone_number")

            @JvmStatic fun of(value: String) = CallRecordingType(JsonField.of(value))
        }

        /** An enum containing [CallRecordingType]'s known values. */
        enum class Known {
            ALL,
            NONE,
            BY_CALLER_PHONE_NUMBER,
        }

        /**
         * An enum containing [CallRecordingType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CallRecordingType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL,
            NONE,
            BY_CALLER_PHONE_NUMBER,
            /**
             * An enum member indicating that [CallRecordingType] was instantiated with an unknown
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
                ALL -> Value.ALL
                NONE -> Value.NONE
                BY_CALLER_PHONE_NUMBER -> Value.BY_CALLER_PHONE_NUMBER
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
                ALL -> Known.ALL
                NONE -> Known.NONE
                BY_CALLER_PHONE_NUMBER -> Known.BY_CALLER_PHONE_NUMBER
                else -> throw TelnyxInvalidDataException("Unknown CallRecordingType: $value")
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

        fun validate(): CallRecordingType = apply {
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

            return other is CallRecordingType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OutboundCallRecording &&
            callRecordingCallerPhoneNumbers == other.callRecordingCallerPhoneNumbers &&
            callRecordingChannels == other.callRecordingChannels &&
            callRecordingFormat == other.callRecordingFormat &&
            callRecordingType == other.callRecordingType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            callRecordingCallerPhoneNumbers,
            callRecordingChannels,
            callRecordingFormat,
            callRecordingType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OutboundCallRecording{callRecordingCallerPhoneNumbers=$callRecordingCallerPhoneNumbers, callRecordingChannels=$callRecordingChannels, callRecordingFormat=$callRecordingFormat, callRecordingType=$callRecordingType, additionalProperties=$additionalProperties}"
}
