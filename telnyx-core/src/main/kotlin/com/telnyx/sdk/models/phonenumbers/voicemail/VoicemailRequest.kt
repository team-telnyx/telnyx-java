// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voicemail

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

class VoicemailRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enabled: JsonField<Boolean>,
    private val greeting: JsonField<Greeting>,
    private val pin: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("greeting") @ExcludeMissing greeting: JsonField<Greeting> = JsonMissing.of(),
        @JsonProperty("pin") @ExcludeMissing pin: JsonField<String> = JsonMissing.of(),
    ) : this(enabled, greeting, pin, mutableMapOf())

    /**
     * Whether voicemail is enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

    /**
     * Controls the greeting a caller hears before leaving a voicemail. Set `mode` to `default` to
     * play the standard system greeting, or to `custom_greeting` to play your own audio. When
     * `mode` is `custom_greeting`, `media_name` is required and must reference an audio file
     * already uploaded to your account through the Media Storage API.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun greeting(): Optional<Greeting> = greeting.getOptional("greeting")

    /**
     * The pin used for voicemail
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pin(): Optional<String> = pin.getOptional("pin")

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [greeting].
     *
     * Unlike [greeting], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("greeting") @ExcludeMissing fun _greeting(): JsonField<Greeting> = greeting

    /**
     * Returns the raw JSON value of [pin].
     *
     * Unlike [pin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pin") @ExcludeMissing fun _pin(): JsonField<String> = pin

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

        /** Returns a mutable builder for constructing an instance of [VoicemailRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoicemailRequest]. */
    class Builder internal constructor() {

        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var greeting: JsonField<Greeting> = JsonMissing.of()
        private var pin: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(voicemailRequest: VoicemailRequest) = apply {
            enabled = voicemailRequest.enabled
            greeting = voicemailRequest.greeting
            pin = voicemailRequest.pin
            additionalProperties = voicemailRequest.additionalProperties.toMutableMap()
        }

        /** Whether voicemail is enabled. */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /**
         * Controls the greeting a caller hears before leaving a voicemail. Set `mode` to `default`
         * to play the standard system greeting, or to `custom_greeting` to play your own audio.
         * When `mode` is `custom_greeting`, `media_name` is required and must reference an audio
         * file already uploaded to your account through the Media Storage API.
         */
        fun greeting(greeting: Greeting) = greeting(JsonField.of(greeting))

        /**
         * Sets [Builder.greeting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.greeting] with a well-typed [Greeting] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun greeting(greeting: JsonField<Greeting>) = apply { this.greeting = greeting }

        /** The pin used for voicemail */
        fun pin(pin: String) = pin(JsonField.of(pin))

        /**
         * Sets [Builder.pin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pin] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pin(pin: JsonField<String>) = apply { this.pin = pin }

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
         * Returns an immutable instance of [VoicemailRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VoicemailRequest =
            VoicemailRequest(enabled, greeting, pin, additionalProperties.toMutableMap())
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
    fun validate(): VoicemailRequest = apply {
        if (validated) {
            return@apply
        }

        enabled()
        greeting().ifPresent { it.validate() }
        pin()
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
        (if (enabled.asKnown().isPresent) 1 else 0) +
            (greeting.asKnown().getOrNull()?.validity() ?: 0) +
            (if (pin.asKnown().isPresent) 1 else 0)

    /**
     * Controls the greeting a caller hears before leaving a voicemail. Set `mode` to `default` to
     * play the standard system greeting, or to `custom_greeting` to play your own audio. When
     * `mode` is `custom_greeting`, `media_name` is required and must reference an audio file
     * already uploaded to your account through the Media Storage API.
     */
    class Greeting
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val mediaName: JsonField<String>,
        private val mode: JsonField<Mode>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("media_name")
            @ExcludeMissing
            mediaName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
        ) : this(mediaName, mode, mutableMapOf())

        /**
         * The name of the media file to play as the greeting. Required when `mode` is
         * `custom_greeting`; ignored when `mode` is `default`. The value must match the
         * `media_name` of a file you previously uploaded with the Media Storage API (`POST
         * /v2/media`).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaName(): Optional<String> = mediaName.getOptional("media_name")

        /**
         * The greeting mode. `default` plays the standard system greeting. `custom_greeting` plays
         * the audio referenced by `media_name`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mode(): Optional<Mode> = mode.getOptional("mode")

        /**
         * Returns the raw JSON value of [mediaName].
         *
         * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("media_name") @ExcludeMissing fun _mediaName(): JsonField<String> = mediaName

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

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

            /** Returns a mutable builder for constructing an instance of [Greeting]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Greeting]. */
        class Builder internal constructor() {

            private var mediaName: JsonField<String> = JsonMissing.of()
            private var mode: JsonField<Mode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(greeting: Greeting) = apply {
                mediaName = greeting.mediaName
                mode = greeting.mode
                additionalProperties = greeting.additionalProperties.toMutableMap()
            }

            /**
             * The name of the media file to play as the greeting. Required when `mode` is
             * `custom_greeting`; ignored when `mode` is `default`. The value must match the
             * `media_name` of a file you previously uploaded with the Media Storage API (`POST
             * /v2/media`).
             */
            fun mediaName(mediaName: String?) = mediaName(JsonField.ofNullable(mediaName))

            /** Alias for calling [Builder.mediaName] with `mediaName.orElse(null)`. */
            fun mediaName(mediaName: Optional<String>) = mediaName(mediaName.getOrNull())

            /**
             * Sets [Builder.mediaName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mediaName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaName(mediaName: JsonField<String>) = apply { this.mediaName = mediaName }

            /**
             * The greeting mode. `default` plays the standard system greeting. `custom_greeting`
             * plays the audio referenced by `media_name`.
             */
            fun mode(mode: Mode) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

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
             * Returns an immutable instance of [Greeting].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Greeting = Greeting(mediaName, mode, additionalProperties.toMutableMap())
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
        fun validate(): Greeting = apply {
            if (validated) {
                return@apply
            }

            mediaName()
            mode().ifPresent { it.validate() }
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
            (if (mediaName.asKnown().isPresent) 1 else 0) +
                (mode.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The greeting mode. `default` plays the standard system greeting. `custom_greeting` plays
         * the audio referenced by `media_name`.
         */
        class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DEFAULT = of("default")

                @JvmField val CUSTOM_GREETING = of("custom_greeting")

                @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
            }

            /** An enum containing [Mode]'s known values. */
            enum class Known {
                DEFAULT,
                CUSTOM_GREETING,
            }

            /**
             * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Mode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEFAULT,
                CUSTOM_GREETING,
                /** An enum member indicating that [Mode] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DEFAULT -> Value.DEFAULT
                    CUSTOM_GREETING -> Value.CUSTOM_GREETING
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DEFAULT -> Known.DEFAULT
                    CUSTOM_GREETING -> Known.CUSTOM_GREETING
                    else -> throw TelnyxInvalidDataException("Unknown Mode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Mode = apply {
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

                return other is Mode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Greeting &&
                mediaName == other.mediaName &&
                mode == other.mode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(mediaName, mode, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Greeting{mediaName=$mediaName, mode=$mode, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoicemailRequest &&
            enabled == other.enabled &&
            greeting == other.greeting &&
            pin == other.pin &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(enabled, greeting, pin, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VoicemailRequest{enabled=$enabled, greeting=$greeting, pin=$pin, additionalProperties=$additionalProperties}"
}
