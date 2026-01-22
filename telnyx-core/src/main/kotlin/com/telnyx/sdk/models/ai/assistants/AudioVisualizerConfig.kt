// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

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

class AudioVisualizerConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val color: JsonField<Color>,
    private val preset: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("color") @ExcludeMissing color: JsonField<Color> = JsonMissing.of(),
        @JsonProperty("preset") @ExcludeMissing preset: JsonField<String> = JsonMissing.of(),
    ) : this(color, preset, mutableMapOf())

    /**
     * The color theme for the audio visualizer.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun color(): Optional<Color> = color.getOptional("color")

    /**
     * The preset style for the audio visualizer.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preset(): Optional<String> = preset.getOptional("preset")

    /**
     * Returns the raw JSON value of [color].
     *
     * Unlike [color], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<Color> = color

    /**
     * Returns the raw JSON value of [preset].
     *
     * Unlike [preset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preset") @ExcludeMissing fun _preset(): JsonField<String> = preset

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

        /** Returns a mutable builder for constructing an instance of [AudioVisualizerConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AudioVisualizerConfig]. */
    class Builder internal constructor() {

        private var color: JsonField<Color> = JsonMissing.of()
        private var preset: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(audioVisualizerConfig: AudioVisualizerConfig) = apply {
            color = audioVisualizerConfig.color
            preset = audioVisualizerConfig.preset
            additionalProperties = audioVisualizerConfig.additionalProperties.toMutableMap()
        }

        /** The color theme for the audio visualizer. */
        fun color(color: Color) = color(JsonField.of(color))

        /**
         * Sets [Builder.color] to an arbitrary JSON value.
         *
         * You should usually call [Builder.color] with a well-typed [Color] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun color(color: JsonField<Color>) = apply { this.color = color }

        /** The preset style for the audio visualizer. */
        fun preset(preset: String) = preset(JsonField.of(preset))

        /**
         * Sets [Builder.preset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preset] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun preset(preset: JsonField<String>) = apply { this.preset = preset }

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
         * Returns an immutable instance of [AudioVisualizerConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AudioVisualizerConfig =
            AudioVisualizerConfig(color, preset, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): AudioVisualizerConfig = apply {
        if (validated) {
            return@apply
        }

        color().ifPresent { it.validate() }
        preset()
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
        (color.asKnown().getOrNull()?.validity() ?: 0) + (if (preset.asKnown().isPresent) 1 else 0)

    /** The color theme for the audio visualizer. */
    class Color @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val VERDANT = of("verdant")

            @JvmField val TWILIGHT = of("twilight")

            @JvmField val BLOOM = of("bloom")

            @JvmField val MYSTIC = of("mystic")

            @JvmField val FLARE = of("flare")

            @JvmField val GLACIER = of("glacier")

            @JvmStatic fun of(value: String) = Color(JsonField.of(value))
        }

        /** An enum containing [Color]'s known values. */
        enum class Known {
            VERDANT,
            TWILIGHT,
            BLOOM,
            MYSTIC,
            FLARE,
            GLACIER,
        }

        /**
         * An enum containing [Color]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Color] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VERDANT,
            TWILIGHT,
            BLOOM,
            MYSTIC,
            FLARE,
            GLACIER,
            /** An enum member indicating that [Color] was instantiated with an unknown value. */
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
                VERDANT -> Value.VERDANT
                TWILIGHT -> Value.TWILIGHT
                BLOOM -> Value.BLOOM
                MYSTIC -> Value.MYSTIC
                FLARE -> Value.FLARE
                GLACIER -> Value.GLACIER
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
                VERDANT -> Known.VERDANT
                TWILIGHT -> Known.TWILIGHT
                BLOOM -> Known.BLOOM
                MYSTIC -> Known.MYSTIC
                FLARE -> Known.FLARE
                GLACIER -> Known.GLACIER
                else -> throw TelnyxInvalidDataException("Unknown Color: $value")
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

        fun validate(): Color = apply {
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

            return other is Color && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AudioVisualizerConfig &&
            color == other.color &&
            preset == other.preset &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(color, preset, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AudioVisualizerConfig{color=$color, preset=$preset, additionalProperties=$additionalProperties}"
}
