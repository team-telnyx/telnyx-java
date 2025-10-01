// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voice

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The call recording settings for a phone number. */
class CallRecording
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inboundCallRecordingChannels: JsonField<InboundCallRecordingChannels>,
    private val inboundCallRecordingEnabled: JsonField<Boolean>,
    private val inboundCallRecordingFormat: JsonField<InboundCallRecordingFormat>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("inbound_call_recording_channels")
        @ExcludeMissing
        inboundCallRecordingChannels: JsonField<InboundCallRecordingChannels> = JsonMissing.of(),
        @JsonProperty("inbound_call_recording_enabled")
        @ExcludeMissing
        inboundCallRecordingEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("inbound_call_recording_format")
        @ExcludeMissing
        inboundCallRecordingFormat: JsonField<InboundCallRecordingFormat> = JsonMissing.of(),
    ) : this(
        inboundCallRecordingChannels,
        inboundCallRecordingEnabled,
        inboundCallRecordingFormat,
        mutableMapOf(),
    )

    /**
     * When using 'dual' channels, final audio file will be stereo recorded with the first leg on
     * channel A, and the rest on channel B.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundCallRecordingChannels(): Optional<InboundCallRecordingChannels> =
        inboundCallRecordingChannels.getOptional("inbound_call_recording_channels")

    /**
     * When enabled, any inbound call to this number will be recorded.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundCallRecordingEnabled(): Optional<Boolean> =
        inboundCallRecordingEnabled.getOptional("inbound_call_recording_enabled")

    /**
     * The audio file format for calls being recorded.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundCallRecordingFormat(): Optional<InboundCallRecordingFormat> =
        inboundCallRecordingFormat.getOptional("inbound_call_recording_format")

    /**
     * Returns the raw JSON value of [inboundCallRecordingChannels].
     *
     * Unlike [inboundCallRecordingChannels], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("inbound_call_recording_channels")
    @ExcludeMissing
    fun _inboundCallRecordingChannels(): JsonField<InboundCallRecordingChannels> =
        inboundCallRecordingChannels

    /**
     * Returns the raw JSON value of [inboundCallRecordingEnabled].
     *
     * Unlike [inboundCallRecordingEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("inbound_call_recording_enabled")
    @ExcludeMissing
    fun _inboundCallRecordingEnabled(): JsonField<Boolean> = inboundCallRecordingEnabled

    /**
     * Returns the raw JSON value of [inboundCallRecordingFormat].
     *
     * Unlike [inboundCallRecordingFormat], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("inbound_call_recording_format")
    @ExcludeMissing
    fun _inboundCallRecordingFormat(): JsonField<InboundCallRecordingFormat> =
        inboundCallRecordingFormat

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

        /** Returns a mutable builder for constructing an instance of [CallRecording]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallRecording]. */
    class Builder internal constructor() {

        private var inboundCallRecordingChannels: JsonField<InboundCallRecordingChannels> =
            JsonMissing.of()
        private var inboundCallRecordingEnabled: JsonField<Boolean> = JsonMissing.of()
        private var inboundCallRecordingFormat: JsonField<InboundCallRecordingFormat> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callRecording: CallRecording) = apply {
            inboundCallRecordingChannels = callRecording.inboundCallRecordingChannels
            inboundCallRecordingEnabled = callRecording.inboundCallRecordingEnabled
            inboundCallRecordingFormat = callRecording.inboundCallRecordingFormat
            additionalProperties = callRecording.additionalProperties.toMutableMap()
        }

        /**
         * When using 'dual' channels, final audio file will be stereo recorded with the first leg
         * on channel A, and the rest on channel B.
         */
        fun inboundCallRecordingChannels(
            inboundCallRecordingChannels: InboundCallRecordingChannels
        ) = inboundCallRecordingChannels(JsonField.of(inboundCallRecordingChannels))

        /**
         * Sets [Builder.inboundCallRecordingChannels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundCallRecordingChannels] with a well-typed
         * [InboundCallRecordingChannels] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun inboundCallRecordingChannels(
            inboundCallRecordingChannels: JsonField<InboundCallRecordingChannels>
        ) = apply { this.inboundCallRecordingChannels = inboundCallRecordingChannels }

        /** When enabled, any inbound call to this number will be recorded. */
        fun inboundCallRecordingEnabled(inboundCallRecordingEnabled: Boolean) =
            inboundCallRecordingEnabled(JsonField.of(inboundCallRecordingEnabled))

        /**
         * Sets [Builder.inboundCallRecordingEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundCallRecordingEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun inboundCallRecordingEnabled(inboundCallRecordingEnabled: JsonField<Boolean>) = apply {
            this.inboundCallRecordingEnabled = inboundCallRecordingEnabled
        }

        /** The audio file format for calls being recorded. */
        fun inboundCallRecordingFormat(inboundCallRecordingFormat: InboundCallRecordingFormat) =
            inboundCallRecordingFormat(JsonField.of(inboundCallRecordingFormat))

        /**
         * Sets [Builder.inboundCallRecordingFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundCallRecordingFormat] with a well-typed
         * [InboundCallRecordingFormat] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun inboundCallRecordingFormat(
            inboundCallRecordingFormat: JsonField<InboundCallRecordingFormat>
        ) = apply { this.inboundCallRecordingFormat = inboundCallRecordingFormat }

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
         * Returns an immutable instance of [CallRecording].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallRecording =
            CallRecording(
                inboundCallRecordingChannels,
                inboundCallRecordingEnabled,
                inboundCallRecordingFormat,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CallRecording = apply {
        if (validated) {
            return@apply
        }

        inboundCallRecordingChannels().ifPresent { it.validate() }
        inboundCallRecordingEnabled()
        inboundCallRecordingFormat().ifPresent { it.validate() }
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
        (inboundCallRecordingChannels.asKnown().getOrNull()?.validity() ?: 0) +
            (if (inboundCallRecordingEnabled.asKnown().isPresent) 1 else 0) +
            (inboundCallRecordingFormat.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * When using 'dual' channels, final audio file will be stereo recorded with the first leg on
     * channel A, and the rest on channel B.
     */
    class InboundCallRecordingChannels
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

            @JvmStatic fun of(value: String) = InboundCallRecordingChannels(JsonField.of(value))
        }

        /** An enum containing [InboundCallRecordingChannels]'s known values. */
        enum class Known {
            SINGLE,
            DUAL,
        }

        /**
         * An enum containing [InboundCallRecordingChannels]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [InboundCallRecordingChannels] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SINGLE,
            DUAL,
            /**
             * An enum member indicating that [InboundCallRecordingChannels] was instantiated with
             * an unknown value.
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
                else ->
                    throw TelnyxInvalidDataException("Unknown InboundCallRecordingChannels: $value")
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

        fun validate(): InboundCallRecordingChannels = apply {
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

            return other is InboundCallRecordingChannels && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The audio file format for calls being recorded. */
    class InboundCallRecordingFormat
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

            @JvmStatic fun of(value: String) = InboundCallRecordingFormat(JsonField.of(value))
        }

        /** An enum containing [InboundCallRecordingFormat]'s known values. */
        enum class Known {
            WAV,
            MP3,
        }

        /**
         * An enum containing [InboundCallRecordingFormat]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [InboundCallRecordingFormat] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WAV,
            MP3,
            /**
             * An enum member indicating that [InboundCallRecordingFormat] was instantiated with an
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
                else ->
                    throw TelnyxInvalidDataException("Unknown InboundCallRecordingFormat: $value")
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

        fun validate(): InboundCallRecordingFormat = apply {
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

            return other is InboundCallRecordingFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallRecording &&
            inboundCallRecordingChannels == other.inboundCallRecordingChannels &&
            inboundCallRecordingEnabled == other.inboundCallRecordingEnabled &&
            inboundCallRecordingFormat == other.inboundCallRecordingFormat &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            inboundCallRecordingChannels,
            inboundCallRecordingEnabled,
            inboundCallRecordingFormat,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallRecording{inboundCallRecordingChannels=$inboundCallRecordingChannels, inboundCallRecordingEnabled=$inboundCallRecordingEnabled, inboundCallRecordingFormat=$inboundCallRecordingFormat, additionalProperties=$additionalProperties}"
}
