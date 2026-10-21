// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

/** What the engine supports. An unknown key is rejected. */
class CommunityTtsEngineCapabilities
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val streamedAudio: JsonField<Boolean>,
    private val flushSupport: JsonField<Boolean>,
    private val forceInterruptSupport: JsonField<Boolean>,
    private val ssmlSupport: JsonField<Boolean>,
    private val voiceSettingsSchema: JsonField<VoiceSettingsSchema>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("streamed_audio")
        @ExcludeMissing
        streamedAudio: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("flush_support")
        @ExcludeMissing
        flushSupport: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("force_interrupt_support")
        @ExcludeMissing
        forceInterruptSupport: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ssml_support")
        @ExcludeMissing
        ssmlSupport: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("voice_settings_schema")
        @ExcludeMissing
        voiceSettingsSchema: JsonField<VoiceSettingsSchema> = JsonMissing.of(),
    ) : this(
        streamedAudio,
        flushSupport,
        forceInterruptSupport,
        ssmlSupport,
        voiceSettingsSchema,
        mutableMapOf(),
    )

    /**
     * Required. `true` when the engine sends audio in small frames as it synthesizes; `false` when
     * it sends one frame per sentence.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun streamedAudio(): Boolean = streamedAudio.getRequired("streamed_audio")

    /**
     * The engine speaks the buffered text when a frame carries `"flush": true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun flushSupport(): Optional<Boolean> = flushSupport.getOptional("flush_support")

    /**
     * The engine supports a restart of the current speech (barge-in).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun forceInterruptSupport(): Optional<Boolean> =
        forceInterruptSupport.getOptional("force_interrupt_support")

    /**
     * The engine accepts SSML in the text.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ssmlSupport(): Optional<Boolean> = ssmlSupport.getOptional("ssml_support")

    /**
     * The settings callers can pass to the engine in `voice_settings`, one entry per setting:
     * `{"type": "number" | "integer", "min", "max"}`, `{"type": "boolean"}`, `{"type": "string"}`
     * (at most 1000 characters) or `{"type": "enum", "values": [...]}`, each with an optional
     * `default`. A caller's settings are checked against it before Telnyx connects to the engine:
     * an undeclared setting, a value of the wrong type, or a value out of bounds is refused. An
     * engine that declares none receives the settings as sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceSettingsSchema(): Optional<VoiceSettingsSchema> =
        voiceSettingsSchema.getOptional("voice_settings_schema")

    /**
     * Returns the raw JSON value of [streamedAudio].
     *
     * Unlike [streamedAudio], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("streamed_audio")
    @ExcludeMissing
    fun _streamedAudio(): JsonField<Boolean> = streamedAudio

    /**
     * Returns the raw JSON value of [flushSupport].
     *
     * Unlike [flushSupport], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flush_support")
    @ExcludeMissing
    fun _flushSupport(): JsonField<Boolean> = flushSupport

    /**
     * Returns the raw JSON value of [forceInterruptSupport].
     *
     * Unlike [forceInterruptSupport], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("force_interrupt_support")
    @ExcludeMissing
    fun _forceInterruptSupport(): JsonField<Boolean> = forceInterruptSupport

    /**
     * Returns the raw JSON value of [ssmlSupport].
     *
     * Unlike [ssmlSupport], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ssml_support")
    @ExcludeMissing
    fun _ssmlSupport(): JsonField<Boolean> = ssmlSupport

    /**
     * Returns the raw JSON value of [voiceSettingsSchema].
     *
     * Unlike [voiceSettingsSchema], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("voice_settings_schema")
    @ExcludeMissing
    fun _voiceSettingsSchema(): JsonField<VoiceSettingsSchema> = voiceSettingsSchema

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
         * [CommunityTtsEngineCapabilities].
         *
         * The following fields are required:
         * ```java
         * .streamedAudio()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommunityTtsEngineCapabilities]. */
    class Builder internal constructor() {

        private var streamedAudio: JsonField<Boolean>? = null
        private var flushSupport: JsonField<Boolean> = JsonMissing.of()
        private var forceInterruptSupport: JsonField<Boolean> = JsonMissing.of()
        private var ssmlSupport: JsonField<Boolean> = JsonMissing.of()
        private var voiceSettingsSchema: JsonField<VoiceSettingsSchema> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(communityTtsEngineCapabilities: CommunityTtsEngineCapabilities) = apply {
            streamedAudio = communityTtsEngineCapabilities.streamedAudio
            flushSupport = communityTtsEngineCapabilities.flushSupport
            forceInterruptSupport = communityTtsEngineCapabilities.forceInterruptSupport
            ssmlSupport = communityTtsEngineCapabilities.ssmlSupport
            voiceSettingsSchema = communityTtsEngineCapabilities.voiceSettingsSchema
            additionalProperties =
                communityTtsEngineCapabilities.additionalProperties.toMutableMap()
        }

        /**
         * Required. `true` when the engine sends audio in small frames as it synthesizes; `false`
         * when it sends one frame per sentence.
         */
        fun streamedAudio(streamedAudio: Boolean) = streamedAudio(JsonField.of(streamedAudio))

        /**
         * Sets [Builder.streamedAudio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamedAudio] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun streamedAudio(streamedAudio: JsonField<Boolean>) = apply {
            this.streamedAudio = streamedAudio
        }

        /** The engine speaks the buffered text when a frame carries `"flush": true`. */
        fun flushSupport(flushSupport: Boolean) = flushSupport(JsonField.of(flushSupport))

        /**
         * Sets [Builder.flushSupport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flushSupport] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun flushSupport(flushSupport: JsonField<Boolean>) = apply {
            this.flushSupport = flushSupport
        }

        /** The engine supports a restart of the current speech (barge-in). */
        fun forceInterruptSupport(forceInterruptSupport: Boolean) =
            forceInterruptSupport(JsonField.of(forceInterruptSupport))

        /**
         * Sets [Builder.forceInterruptSupport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.forceInterruptSupport] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun forceInterruptSupport(forceInterruptSupport: JsonField<Boolean>) = apply {
            this.forceInterruptSupport = forceInterruptSupport
        }

        /** The engine accepts SSML in the text. */
        fun ssmlSupport(ssmlSupport: Boolean) = ssmlSupport(JsonField.of(ssmlSupport))

        /**
         * Sets [Builder.ssmlSupport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ssmlSupport] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ssmlSupport(ssmlSupport: JsonField<Boolean>) = apply { this.ssmlSupport = ssmlSupport }

        /**
         * The settings callers can pass to the engine in `voice_settings`, one entry per setting:
         * `{"type": "number" | "integer", "min", "max"}`, `{"type": "boolean"}`, `{"type":
         * "string"}` (at most 1000 characters) or `{"type": "enum", "values": [...]}`, each with an
         * optional `default`. A caller's settings are checked against it before Telnyx connects to
         * the engine: an undeclared setting, a value of the wrong type, or a value out of bounds is
         * refused. An engine that declares none receives the settings as sent.
         */
        fun voiceSettingsSchema(voiceSettingsSchema: VoiceSettingsSchema?) =
            voiceSettingsSchema(JsonField.ofNullable(voiceSettingsSchema))

        /**
         * Alias for calling [Builder.voiceSettingsSchema] with `voiceSettingsSchema.orElse(null)`.
         */
        fun voiceSettingsSchema(voiceSettingsSchema: Optional<VoiceSettingsSchema>) =
            voiceSettingsSchema(voiceSettingsSchema.getOrNull())

        /**
         * Sets [Builder.voiceSettingsSchema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceSettingsSchema] with a well-typed
         * [VoiceSettingsSchema] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun voiceSettingsSchema(voiceSettingsSchema: JsonField<VoiceSettingsSchema>) = apply {
            this.voiceSettingsSchema = voiceSettingsSchema
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
         * Returns an immutable instance of [CommunityTtsEngineCapabilities].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .streamedAudio()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CommunityTtsEngineCapabilities =
            CommunityTtsEngineCapabilities(
                checkRequired("streamedAudio", streamedAudio),
                flushSupport,
                forceInterruptSupport,
                ssmlSupport,
                voiceSettingsSchema,
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
    fun validate(): CommunityTtsEngineCapabilities = apply {
        if (validated) {
            return@apply
        }

        streamedAudio()
        flushSupport()
        forceInterruptSupport()
        ssmlSupport()
        voiceSettingsSchema().ifPresent { it.validate() }
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
        (if (streamedAudio.asKnown().isPresent) 1 else 0) +
            (if (flushSupport.asKnown().isPresent) 1 else 0) +
            (if (forceInterruptSupport.asKnown().isPresent) 1 else 0) +
            (if (ssmlSupport.asKnown().isPresent) 1 else 0) +
            (voiceSettingsSchema.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The settings callers can pass to the engine in `voice_settings`, one entry per setting:
     * `{"type": "number" | "integer", "min", "max"}`, `{"type": "boolean"}`, `{"type": "string"}`
     * (at most 1000 characters) or `{"type": "enum", "values": [...]}`, each with an optional
     * `default`. A caller's settings are checked against it before Telnyx connects to the engine:
     * an undeclared setting, a value of the wrong type, or a value out of bounds is refused. An
     * engine that declares none receives the settings as sent.
     */
    class VoiceSettingsSchema
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

            /** Returns a mutable builder for constructing an instance of [VoiceSettingsSchema]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VoiceSettingsSchema]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(voiceSettingsSchema: VoiceSettingsSchema) = apply {
                additionalProperties = voiceSettingsSchema.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [VoiceSettingsSchema].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): VoiceSettingsSchema =
                VoiceSettingsSchema(additionalProperties.toImmutable())
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
        fun validate(): VoiceSettingsSchema = apply {
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

            return other is VoiceSettingsSchema &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "VoiceSettingsSchema{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommunityTtsEngineCapabilities &&
            streamedAudio == other.streamedAudio &&
            flushSupport == other.flushSupport &&
            forceInterruptSupport == other.forceInterruptSupport &&
            ssmlSupport == other.ssmlSupport &&
            voiceSettingsSchema == other.voiceSettingsSchema &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            streamedAudio,
            flushSupport,
            forceInterruptSupport,
            ssmlSupport,
            voiceSettingsSchema,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommunityTtsEngineCapabilities{streamedAudio=$streamedAudio, flushSupport=$flushSupport, forceInterruptSupport=$forceInterruptSupport, ssmlSupport=$ssmlSupport, voiceSettingsSchema=$voiceSettingsSchema, additionalProperties=$additionalProperties}"
}
