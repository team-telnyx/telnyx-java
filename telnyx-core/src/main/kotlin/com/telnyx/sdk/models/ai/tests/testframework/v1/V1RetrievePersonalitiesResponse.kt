// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1RetrievePersonalitiesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val endCallEnabled: JsonField<Boolean>,
    private val language: JsonField<String>,
    private val name: JsonField<String>,
    private val prompt: JsonField<String>,
    private val accent: JsonField<String>,
    private val backgroundNoise: JsonField<String>,
    private val backgroundSoundVolume: JsonField<Double>,
    private val effectiveVoiceVolume: JsonField<Double>,
    private val forkedFrom: JsonField<Long>,
    private val generationConfig: JsonField<GenerationConfig>,
    private val interruptionLevel: JsonField<String>,
    private val messagePlan: JsonField<MessagePlan>,
    private val networkSimulation: JsonField<NetworkSimulation>,
    private val organization: JsonField<Long>,
    private val project: JsonField<Long>,
    private val speed: JsonField<Speed>,
    private val startSpeakingPlan: JsonField<StartSpeakingPlan>,
    private val stopSpeakingPlan: JsonField<StopSpeakingPlan>,
    private val voiceVolume: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("end_call_enabled")
        @ExcludeMissing
        endCallEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accent") @ExcludeMissing accent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("background_noise")
        @ExcludeMissing
        backgroundNoise: JsonField<String> = JsonMissing.of(),
        @JsonProperty("background_sound_volume")
        @ExcludeMissing
        backgroundSoundVolume: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("effective_voice_volume")
        @ExcludeMissing
        effectiveVoiceVolume: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("forked_from") @ExcludeMissing forkedFrom: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("generation_config")
        @ExcludeMissing
        generationConfig: JsonField<GenerationConfig> = JsonMissing.of(),
        @JsonProperty("interruption_level")
        @ExcludeMissing
        interruptionLevel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_plan")
        @ExcludeMissing
        messagePlan: JsonField<MessagePlan> = JsonMissing.of(),
        @JsonProperty("network_simulation")
        @ExcludeMissing
        networkSimulation: JsonField<NetworkSimulation> = JsonMissing.of(),
        @JsonProperty("organization")
        @ExcludeMissing
        organization: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("project") @ExcludeMissing project: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("speed") @ExcludeMissing speed: JsonField<Speed> = JsonMissing.of(),
        @JsonProperty("start_speaking_plan")
        @ExcludeMissing
        startSpeakingPlan: JsonField<StartSpeakingPlan> = JsonMissing.of(),
        @JsonProperty("stop_speaking_plan")
        @ExcludeMissing
        stopSpeakingPlan: JsonField<StopSpeakingPlan> = JsonMissing.of(),
        @JsonProperty("voice_volume")
        @ExcludeMissing
        voiceVolume: JsonField<Double> = JsonMissing.of(),
    ) : this(
        id,
        endCallEnabled,
        language,
        name,
        prompt,
        accent,
        backgroundNoise,
        backgroundSoundVolume,
        effectiveVoiceVolume,
        forkedFrom,
        generationConfig,
        interruptionLevel,
        messagePlan,
        networkSimulation,
        organization,
        project,
        speed,
        startSpeakingPlan,
        stopSpeakingPlan,
        voiceVolume,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Long = id.getRequired("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endCallEnabled(): Boolean = endCallEnabled.getRequired("end_call_enabled")

    /**
     * ISO language code the simulated caller speaks.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun language(): String = language.getRequired("language")

    /**
     * Display name of the personality.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Instructions the simulated caller follows.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prompt(): String = prompt.getRequired("prompt")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accent(): Optional<String> = accent.getOptional("accent")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backgroundNoise(): Optional<String> = backgroundNoise.getOptional("background_noise")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backgroundSoundVolume(): Optional<Double> =
        backgroundSoundVolume.getOptional("background_sound_volume")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveVoiceVolume(): Optional<Double> =
        effectiveVoiceVolume.getOptional("effective_voice_volume")

    /**
     * ID of the personality this one was forked from.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun forkedFrom(): Optional<Long> = forkedFrom.getOptional("forked_from")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun generationConfig(): Optional<GenerationConfig> =
        generationConfig.getOptional("generation_config")

    /**
     * How aggressively the personality interrupts the assistant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interruptionLevel(): Optional<String> = interruptionLevel.getOptional("interruption_level")

    /**
     * Idle-timeout plan for messages during a call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagePlan(): Optional<MessagePlan> = messagePlan.getOptional("message_plan")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkSimulation(): Optional<NetworkSimulation> =
        networkSimulation.getOptional("network_simulation")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organization(): Optional<Long> = organization.getOptional("organization")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun project(): Optional<Long> = project.getOptional("project")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speed(): Optional<Speed> = speed.getOptional("speed")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startSpeakingPlan(): Optional<StartSpeakingPlan> =
        startSpeakingPlan.getOptional("start_speaking_plan")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stopSpeakingPlan(): Optional<StopSpeakingPlan> =
        stopSpeakingPlan.getOptional("stop_speaking_plan")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceVolume(): Optional<Double> = voiceVolume.getOptional("voice_volume")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [endCallEnabled].
     *
     * Unlike [endCallEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_call_enabled")
    @ExcludeMissing
    fun _endCallEnabled(): JsonField<Boolean> = endCallEnabled

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

    /**
     * Returns the raw JSON value of [accent].
     *
     * Unlike [accent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accent") @ExcludeMissing fun _accent(): JsonField<String> = accent

    /**
     * Returns the raw JSON value of [backgroundNoise].
     *
     * Unlike [backgroundNoise], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("background_noise")
    @ExcludeMissing
    fun _backgroundNoise(): JsonField<String> = backgroundNoise

    /**
     * Returns the raw JSON value of [backgroundSoundVolume].
     *
     * Unlike [backgroundSoundVolume], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("background_sound_volume")
    @ExcludeMissing
    fun _backgroundSoundVolume(): JsonField<Double> = backgroundSoundVolume

    /**
     * Returns the raw JSON value of [effectiveVoiceVolume].
     *
     * Unlike [effectiveVoiceVolume], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("effective_voice_volume")
    @ExcludeMissing
    fun _effectiveVoiceVolume(): JsonField<Double> = effectiveVoiceVolume

    /**
     * Returns the raw JSON value of [forkedFrom].
     *
     * Unlike [forkedFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("forked_from") @ExcludeMissing fun _forkedFrom(): JsonField<Long> = forkedFrom

    /**
     * Returns the raw JSON value of [generationConfig].
     *
     * Unlike [generationConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("generation_config")
    @ExcludeMissing
    fun _generationConfig(): JsonField<GenerationConfig> = generationConfig

    /**
     * Returns the raw JSON value of [interruptionLevel].
     *
     * Unlike [interruptionLevel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("interruption_level")
    @ExcludeMissing
    fun _interruptionLevel(): JsonField<String> = interruptionLevel

    /**
     * Returns the raw JSON value of [messagePlan].
     *
     * Unlike [messagePlan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_plan")
    @ExcludeMissing
    fun _messagePlan(): JsonField<MessagePlan> = messagePlan

    /**
     * Returns the raw JSON value of [networkSimulation].
     *
     * Unlike [networkSimulation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("network_simulation")
    @ExcludeMissing
    fun _networkSimulation(): JsonField<NetworkSimulation> = networkSimulation

    /**
     * Returns the raw JSON value of [organization].
     *
     * Unlike [organization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization")
    @ExcludeMissing
    fun _organization(): JsonField<Long> = organization

    /**
     * Returns the raw JSON value of [project].
     *
     * Unlike [project], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project") @ExcludeMissing fun _project(): JsonField<Long> = project

    /**
     * Returns the raw JSON value of [speed].
     *
     * Unlike [speed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speed") @ExcludeMissing fun _speed(): JsonField<Speed> = speed

    /**
     * Returns the raw JSON value of [startSpeakingPlan].
     *
     * Unlike [startSpeakingPlan], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("start_speaking_plan")
    @ExcludeMissing
    fun _startSpeakingPlan(): JsonField<StartSpeakingPlan> = startSpeakingPlan

    /**
     * Returns the raw JSON value of [stopSpeakingPlan].
     *
     * Unlike [stopSpeakingPlan], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("stop_speaking_plan")
    @ExcludeMissing
    fun _stopSpeakingPlan(): JsonField<StopSpeakingPlan> = stopSpeakingPlan

    /**
     * Returns the raw JSON value of [voiceVolume].
     *
     * Unlike [voiceVolume], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voice_volume")
    @ExcludeMissing
    fun _voiceVolume(): JsonField<Double> = voiceVolume

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
         * [V1RetrievePersonalitiesResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .endCallEnabled()
         * .language()
         * .name()
         * .prompt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1RetrievePersonalitiesResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<Long>? = null
        private var endCallEnabled: JsonField<Boolean>? = null
        private var language: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var prompt: JsonField<String>? = null
        private var accent: JsonField<String> = JsonMissing.of()
        private var backgroundNoise: JsonField<String> = JsonMissing.of()
        private var backgroundSoundVolume: JsonField<Double> = JsonMissing.of()
        private var effectiveVoiceVolume: JsonField<Double> = JsonMissing.of()
        private var forkedFrom: JsonField<Long> = JsonMissing.of()
        private var generationConfig: JsonField<GenerationConfig> = JsonMissing.of()
        private var interruptionLevel: JsonField<String> = JsonMissing.of()
        private var messagePlan: JsonField<MessagePlan> = JsonMissing.of()
        private var networkSimulation: JsonField<NetworkSimulation> = JsonMissing.of()
        private var organization: JsonField<Long> = JsonMissing.of()
        private var project: JsonField<Long> = JsonMissing.of()
        private var speed: JsonField<Speed> = JsonMissing.of()
        private var startSpeakingPlan: JsonField<StartSpeakingPlan> = JsonMissing.of()
        private var stopSpeakingPlan: JsonField<StopSpeakingPlan> = JsonMissing.of()
        private var voiceVolume: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1RetrievePersonalitiesResponse: V1RetrievePersonalitiesResponse) =
            apply {
                id = v1RetrievePersonalitiesResponse.id
                endCallEnabled = v1RetrievePersonalitiesResponse.endCallEnabled
                language = v1RetrievePersonalitiesResponse.language
                name = v1RetrievePersonalitiesResponse.name
                prompt = v1RetrievePersonalitiesResponse.prompt
                accent = v1RetrievePersonalitiesResponse.accent
                backgroundNoise = v1RetrievePersonalitiesResponse.backgroundNoise
                backgroundSoundVolume = v1RetrievePersonalitiesResponse.backgroundSoundVolume
                effectiveVoiceVolume = v1RetrievePersonalitiesResponse.effectiveVoiceVolume
                forkedFrom = v1RetrievePersonalitiesResponse.forkedFrom
                generationConfig = v1RetrievePersonalitiesResponse.generationConfig
                interruptionLevel = v1RetrievePersonalitiesResponse.interruptionLevel
                messagePlan = v1RetrievePersonalitiesResponse.messagePlan
                networkSimulation = v1RetrievePersonalitiesResponse.networkSimulation
                organization = v1RetrievePersonalitiesResponse.organization
                project = v1RetrievePersonalitiesResponse.project
                speed = v1RetrievePersonalitiesResponse.speed
                startSpeakingPlan = v1RetrievePersonalitiesResponse.startSpeakingPlan
                stopSpeakingPlan = v1RetrievePersonalitiesResponse.stopSpeakingPlan
                voiceVolume = v1RetrievePersonalitiesResponse.voiceVolume
                additionalProperties =
                    v1RetrievePersonalitiesResponse.additionalProperties.toMutableMap()
            }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        fun endCallEnabled(endCallEnabled: Boolean) = endCallEnabled(JsonField.of(endCallEnabled))

        /**
         * Sets [Builder.endCallEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endCallEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endCallEnabled(endCallEnabled: JsonField<Boolean>) = apply {
            this.endCallEnabled = endCallEnabled
        }

        /** ISO language code the simulated caller speaks. */
        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        /** Display name of the personality. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Instructions the simulated caller follows. */
        fun prompt(prompt: String) = prompt(JsonField.of(prompt))

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

        fun accent(accent: String) = accent(JsonField.of(accent))

        /**
         * Sets [Builder.accent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accent] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun accent(accent: JsonField<String>) = apply { this.accent = accent }

        fun backgroundNoise(backgroundNoise: String?) =
            backgroundNoise(JsonField.ofNullable(backgroundNoise))

        /** Alias for calling [Builder.backgroundNoise] with `backgroundNoise.orElse(null)`. */
        fun backgroundNoise(backgroundNoise: Optional<String>) =
            backgroundNoise(backgroundNoise.getOrNull())

        /**
         * Sets [Builder.backgroundNoise] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundNoise] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundNoise(backgroundNoise: JsonField<String>) = apply {
            this.backgroundNoise = backgroundNoise
        }

        fun backgroundSoundVolume(backgroundSoundVolume: Double?) =
            backgroundSoundVolume(JsonField.ofNullable(backgroundSoundVolume))

        /**
         * Alias for [Builder.backgroundSoundVolume].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun backgroundSoundVolume(backgroundSoundVolume: Double) =
            backgroundSoundVolume(backgroundSoundVolume as Double?)

        /**
         * Alias for calling [Builder.backgroundSoundVolume] with
         * `backgroundSoundVolume.orElse(null)`.
         */
        fun backgroundSoundVolume(backgroundSoundVolume: Optional<Double>) =
            backgroundSoundVolume(backgroundSoundVolume.getOrNull())

        /**
         * Sets [Builder.backgroundSoundVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundSoundVolume] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundSoundVolume(backgroundSoundVolume: JsonField<Double>) = apply {
            this.backgroundSoundVolume = backgroundSoundVolume
        }

        fun effectiveVoiceVolume(effectiveVoiceVolume: Double?) =
            effectiveVoiceVolume(JsonField.ofNullable(effectiveVoiceVolume))

        /**
         * Alias for [Builder.effectiveVoiceVolume].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun effectiveVoiceVolume(effectiveVoiceVolume: Double) =
            effectiveVoiceVolume(effectiveVoiceVolume as Double?)

        /**
         * Alias for calling [Builder.effectiveVoiceVolume] with
         * `effectiveVoiceVolume.orElse(null)`.
         */
        fun effectiveVoiceVolume(effectiveVoiceVolume: Optional<Double>) =
            effectiveVoiceVolume(effectiveVoiceVolume.getOrNull())

        /**
         * Sets [Builder.effectiveVoiceVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveVoiceVolume] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveVoiceVolume(effectiveVoiceVolume: JsonField<Double>) = apply {
            this.effectiveVoiceVolume = effectiveVoiceVolume
        }

        /** ID of the personality this one was forked from. */
        fun forkedFrom(forkedFrom: Long?) = forkedFrom(JsonField.ofNullable(forkedFrom))

        /**
         * Alias for [Builder.forkedFrom].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun forkedFrom(forkedFrom: Long) = forkedFrom(forkedFrom as Long?)

        /** Alias for calling [Builder.forkedFrom] with `forkedFrom.orElse(null)`. */
        fun forkedFrom(forkedFrom: Optional<Long>) = forkedFrom(forkedFrom.getOrNull())

        /**
         * Sets [Builder.forkedFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.forkedFrom] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun forkedFrom(forkedFrom: JsonField<Long>) = apply { this.forkedFrom = forkedFrom }

        fun generationConfig(generationConfig: GenerationConfig?) =
            generationConfig(JsonField.ofNullable(generationConfig))

        /** Alias for calling [Builder.generationConfig] with `generationConfig.orElse(null)`. */
        fun generationConfig(generationConfig: Optional<GenerationConfig>) =
            generationConfig(generationConfig.getOrNull())

        /**
         * Sets [Builder.generationConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.generationConfig] with a well-typed [GenerationConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun generationConfig(generationConfig: JsonField<GenerationConfig>) = apply {
            this.generationConfig = generationConfig
        }

        /** How aggressively the personality interrupts the assistant. */
        fun interruptionLevel(interruptionLevel: String?) =
            interruptionLevel(JsonField.ofNullable(interruptionLevel))

        /** Alias for calling [Builder.interruptionLevel] with `interruptionLevel.orElse(null)`. */
        fun interruptionLevel(interruptionLevel: Optional<String>) =
            interruptionLevel(interruptionLevel.getOrNull())

        /**
         * Sets [Builder.interruptionLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interruptionLevel] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interruptionLevel(interruptionLevel: JsonField<String>) = apply {
            this.interruptionLevel = interruptionLevel
        }

        /** Idle-timeout plan for messages during a call. */
        fun messagePlan(messagePlan: MessagePlan?) = messagePlan(JsonField.ofNullable(messagePlan))

        /** Alias for calling [Builder.messagePlan] with `messagePlan.orElse(null)`. */
        fun messagePlan(messagePlan: Optional<MessagePlan>) = messagePlan(messagePlan.getOrNull())

        /**
         * Sets [Builder.messagePlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagePlan] with a well-typed [MessagePlan] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messagePlan(messagePlan: JsonField<MessagePlan>) = apply {
            this.messagePlan = messagePlan
        }

        fun networkSimulation(networkSimulation: NetworkSimulation?) =
            networkSimulation(JsonField.ofNullable(networkSimulation))

        /** Alias for calling [Builder.networkSimulation] with `networkSimulation.orElse(null)`. */
        fun networkSimulation(networkSimulation: Optional<NetworkSimulation>) =
            networkSimulation(networkSimulation.getOrNull())

        /**
         * Sets [Builder.networkSimulation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkSimulation] with a well-typed [NetworkSimulation]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun networkSimulation(networkSimulation: JsonField<NetworkSimulation>) = apply {
            this.networkSimulation = networkSimulation
        }

        fun organization(organization: Long?) = organization(JsonField.ofNullable(organization))

        /**
         * Alias for [Builder.organization].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun organization(organization: Long) = organization(organization as Long?)

        /** Alias for calling [Builder.organization] with `organization.orElse(null)`. */
        fun organization(organization: Optional<Long>) = organization(organization.getOrNull())

        /**
         * Sets [Builder.organization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organization] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun organization(organization: JsonField<Long>) = apply { this.organization = organization }

        fun project(project: Long?) = project(JsonField.ofNullable(project))

        /**
         * Alias for [Builder.project].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun project(project: Long) = project(project as Long?)

        /** Alias for calling [Builder.project] with `project.orElse(null)`. */
        fun project(project: Optional<Long>) = project(project.getOrNull())

        /**
         * Sets [Builder.project] to an arbitrary JSON value.
         *
         * You should usually call [Builder.project] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun project(project: JsonField<Long>) = apply { this.project = project }

        fun speed(speed: Speed?) = speed(JsonField.ofNullable(speed))

        /** Alias for calling [Builder.speed] with `speed.orElse(null)`. */
        fun speed(speed: Optional<Speed>) = speed(speed.getOrNull())

        /**
         * Sets [Builder.speed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speed] with a well-typed [Speed] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun speed(speed: JsonField<Speed>) = apply { this.speed = speed }

        /** Alias for calling [speed] with `Speed.ofNumber(number)`. */
        fun speed(number: Double) = speed(Speed.ofNumber(number))

        /** Alias for calling [speed] with `Speed.ofString(string)`. */
        fun speed(string: String) = speed(Speed.ofString(string))

        fun startSpeakingPlan(startSpeakingPlan: StartSpeakingPlan?) =
            startSpeakingPlan(JsonField.ofNullable(startSpeakingPlan))

        /** Alias for calling [Builder.startSpeakingPlan] with `startSpeakingPlan.orElse(null)`. */
        fun startSpeakingPlan(startSpeakingPlan: Optional<StartSpeakingPlan>) =
            startSpeakingPlan(startSpeakingPlan.getOrNull())

        /**
         * Sets [Builder.startSpeakingPlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startSpeakingPlan] with a well-typed [StartSpeakingPlan]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun startSpeakingPlan(startSpeakingPlan: JsonField<StartSpeakingPlan>) = apply {
            this.startSpeakingPlan = startSpeakingPlan
        }

        /** Alias for calling [startSpeakingPlan] with `StartSpeakingPlan.ofNumber(number)`. */
        fun startSpeakingPlan(number: Double) =
            startSpeakingPlan(StartSpeakingPlan.ofNumber(number))

        /**
         * Alias for calling [startSpeakingPlan] with
         * `StartSpeakingPlan.ofUnionMember1(unionMember1)`.
         */
        fun startSpeakingPlan(unionMember1: StartSpeakingPlan.UnionMember1) =
            startSpeakingPlan(StartSpeakingPlan.ofUnionMember1(unionMember1))

        fun stopSpeakingPlan(stopSpeakingPlan: StopSpeakingPlan?) =
            stopSpeakingPlan(JsonField.ofNullable(stopSpeakingPlan))

        /** Alias for calling [Builder.stopSpeakingPlan] with `stopSpeakingPlan.orElse(null)`. */
        fun stopSpeakingPlan(stopSpeakingPlan: Optional<StopSpeakingPlan>) =
            stopSpeakingPlan(stopSpeakingPlan.getOrNull())

        /**
         * Sets [Builder.stopSpeakingPlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stopSpeakingPlan] with a well-typed [StopSpeakingPlan]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun stopSpeakingPlan(stopSpeakingPlan: JsonField<StopSpeakingPlan>) = apply {
            this.stopSpeakingPlan = stopSpeakingPlan
        }

        fun voiceVolume(voiceVolume: Double?) = voiceVolume(JsonField.ofNullable(voiceVolume))

        /**
         * Alias for [Builder.voiceVolume].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun voiceVolume(voiceVolume: Double) = voiceVolume(voiceVolume as Double?)

        /** Alias for calling [Builder.voiceVolume] with `voiceVolume.orElse(null)`. */
        fun voiceVolume(voiceVolume: Optional<Double>) = voiceVolume(voiceVolume.getOrNull())

        /**
         * Sets [Builder.voiceVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceVolume] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voiceVolume(voiceVolume: JsonField<Double>) = apply { this.voiceVolume = voiceVolume }

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
         * Returns an immutable instance of [V1RetrievePersonalitiesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .endCallEnabled()
         * .language()
         * .name()
         * .prompt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1RetrievePersonalitiesResponse =
            V1RetrievePersonalitiesResponse(
                checkRequired("id", id),
                checkRequired("endCallEnabled", endCallEnabled),
                checkRequired("language", language),
                checkRequired("name", name),
                checkRequired("prompt", prompt),
                accent,
                backgroundNoise,
                backgroundSoundVolume,
                effectiveVoiceVolume,
                forkedFrom,
                generationConfig,
                interruptionLevel,
                messagePlan,
                networkSimulation,
                organization,
                project,
                speed,
                startSpeakingPlan,
                stopSpeakingPlan,
                voiceVolume,
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
    fun validate(): V1RetrievePersonalitiesResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        endCallEnabled()
        language()
        name()
        prompt()
        accent()
        backgroundNoise()
        backgroundSoundVolume()
        effectiveVoiceVolume()
        forkedFrom()
        generationConfig().ifPresent { it.validate() }
        interruptionLevel()
        messagePlan().ifPresent { it.validate() }
        networkSimulation().ifPresent { it.validate() }
        organization()
        project()
        speed().ifPresent { it.validate() }
        startSpeakingPlan().ifPresent { it.validate() }
        stopSpeakingPlan().ifPresent { it.validate() }
        voiceVolume()
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
            (if (endCallEnabled.asKnown().isPresent) 1 else 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (prompt.asKnown().isPresent) 1 else 0) +
            (if (accent.asKnown().isPresent) 1 else 0) +
            (if (backgroundNoise.asKnown().isPresent) 1 else 0) +
            (if (backgroundSoundVolume.asKnown().isPresent) 1 else 0) +
            (if (effectiveVoiceVolume.asKnown().isPresent) 1 else 0) +
            (if (forkedFrom.asKnown().isPresent) 1 else 0) +
            (generationConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (interruptionLevel.asKnown().isPresent) 1 else 0) +
            (messagePlan.asKnown().getOrNull()?.validity() ?: 0) +
            (networkSimulation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (organization.asKnown().isPresent) 1 else 0) +
            (if (project.asKnown().isPresent) 1 else 0) +
            (speed.asKnown().getOrNull()?.validity() ?: 0) +
            (startSpeakingPlan.asKnown().getOrNull()?.validity() ?: 0) +
            (stopSpeakingPlan.asKnown().getOrNull()?.validity() ?: 0) +
            (if (voiceVolume.asKnown().isPresent) 1 else 0)

    class GenerationConfig
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

            /** Returns a mutable builder for constructing an instance of [GenerationConfig]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GenerationConfig]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(generationConfig: GenerationConfig) = apply {
                additionalProperties = generationConfig.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [GenerationConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): GenerationConfig = GenerationConfig(additionalProperties.toImmutable())
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
        fun validate(): GenerationConfig = apply {
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

            return other is GenerationConfig && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "GenerationConfig{additionalProperties=$additionalProperties}"
    }

    /** Idle-timeout plan for messages during a call. */
    class MessagePlan
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

            /** Returns a mutable builder for constructing an instance of [MessagePlan]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MessagePlan]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(messagePlan: MessagePlan) = apply {
                additionalProperties = messagePlan.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [MessagePlan].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): MessagePlan = MessagePlan(additionalProperties.toImmutable())
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
        fun validate(): MessagePlan = apply {
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

            return other is MessagePlan && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "MessagePlan{additionalProperties=$additionalProperties}"
    }

    class NetworkSimulation
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

            /** Returns a mutable builder for constructing an instance of [NetworkSimulation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [NetworkSimulation]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(networkSimulation: NetworkSimulation) = apply {
                additionalProperties = networkSimulation.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [NetworkSimulation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): NetworkSimulation = NetworkSimulation(additionalProperties.toImmutable())
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
        fun validate(): NetworkSimulation = apply {
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

            return other is NetworkSimulation && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "NetworkSimulation{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Speed.Deserializer::class)
    @JsonSerialize(using = Speed.Serializer::class)
    class Speed
    private constructor(
        private val number: Double? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = speed.accept(new Speed.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitNumber(Double number) {
         *         return Optional.of(number.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
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
        fun validate(): Speed = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitString(string: String) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Speed && number == other.number && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(number, string)

        override fun toString(): String =
            when {
                number != null -> "Speed{number=$number}"
                string != null -> "Speed{string=$string}"
                _json != null -> "Speed{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Speed")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = Speed(number = number)

            @JvmStatic fun ofString(string: String) = Speed(string = string)
        }

        /** An interface that defines how to map each variant of [Speed] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [Speed] to a value of type [T].
             *
             * An instance of [Speed] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Speed: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Speed>(Speed::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Speed {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Speed(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                Speed(number = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Speed(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Speed>(Speed::class) {

            override fun serialize(
                value: Speed,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Speed")
                }
            }
        }
    }

    @JsonDeserialize(using = StartSpeakingPlan.Deserializer::class)
    @JsonSerialize(using = StartSpeakingPlan.Serializer::class)
    class StartSpeakingPlan
    private constructor(
        private val number: Double? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

        fun isNumber(): Boolean = number != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = startSpeakingPlan.accept(new StartSpeakingPlan.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitNumber(Double number) {
         *         return Optional.of(number.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
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
        fun validate(): StartSpeakingPlan = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StartSpeakingPlan &&
                number == other.number &&
                unionMember1 == other.unionMember1
        }

        override fun hashCode(): Int = Objects.hash(number, unionMember1)

        override fun toString(): String =
            when {
                number != null -> "StartSpeakingPlan{number=$number}"
                unionMember1 != null -> "StartSpeakingPlan{unionMember1=$unionMember1}"
                _json != null -> "StartSpeakingPlan{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid StartSpeakingPlan")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = StartSpeakingPlan(number = number)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) =
                StartSpeakingPlan(unionMember1 = unionMember1)
        }

        /**
         * An interface that defines how to map each variant of [StartSpeakingPlan] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Maps an unknown variant of [StartSpeakingPlan] to a value of type [T].
             *
             * An instance of [StartSpeakingPlan] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown StartSpeakingPlan: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<StartSpeakingPlan>(StartSpeakingPlan::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): StartSpeakingPlan {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                StartSpeakingPlan(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                StartSpeakingPlan(number = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> StartSpeakingPlan(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<StartSpeakingPlan>(StartSpeakingPlan::class) {

            override fun serialize(
                value: StartSpeakingPlan,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid StartSpeakingPlan")
                }
            }
        }

        class UnionMember1
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

                /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember1: UnionMember1) = apply {
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember1 = UnionMember1(additionalProperties.toImmutable())
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
            fun validate(): UnionMember1 = apply {
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

                return other is UnionMember1 && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember1{additionalProperties=$additionalProperties}"
        }
    }

    class StopSpeakingPlan
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

            /** Returns a mutable builder for constructing an instance of [StopSpeakingPlan]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [StopSpeakingPlan]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stopSpeakingPlan: StopSpeakingPlan) = apply {
                additionalProperties = stopSpeakingPlan.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [StopSpeakingPlan].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): StopSpeakingPlan = StopSpeakingPlan(additionalProperties.toImmutable())
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
        fun validate(): StopSpeakingPlan = apply {
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

            return other is StopSpeakingPlan && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "StopSpeakingPlan{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1RetrievePersonalitiesResponse &&
            id == other.id &&
            endCallEnabled == other.endCallEnabled &&
            language == other.language &&
            name == other.name &&
            prompt == other.prompt &&
            accent == other.accent &&
            backgroundNoise == other.backgroundNoise &&
            backgroundSoundVolume == other.backgroundSoundVolume &&
            effectiveVoiceVolume == other.effectiveVoiceVolume &&
            forkedFrom == other.forkedFrom &&
            generationConfig == other.generationConfig &&
            interruptionLevel == other.interruptionLevel &&
            messagePlan == other.messagePlan &&
            networkSimulation == other.networkSimulation &&
            organization == other.organization &&
            project == other.project &&
            speed == other.speed &&
            startSpeakingPlan == other.startSpeakingPlan &&
            stopSpeakingPlan == other.stopSpeakingPlan &&
            voiceVolume == other.voiceVolume &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            endCallEnabled,
            language,
            name,
            prompt,
            accent,
            backgroundNoise,
            backgroundSoundVolume,
            effectiveVoiceVolume,
            forkedFrom,
            generationConfig,
            interruptionLevel,
            messagePlan,
            networkSimulation,
            organization,
            project,
            speed,
            startSpeakingPlan,
            stopSpeakingPlan,
            voiceVolume,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1RetrievePersonalitiesResponse{id=$id, endCallEnabled=$endCallEnabled, language=$language, name=$name, prompt=$prompt, accent=$accent, backgroundNoise=$backgroundNoise, backgroundSoundVolume=$backgroundSoundVolume, effectiveVoiceVolume=$effectiveVoiceVolume, forkedFrom=$forkedFrom, generationConfig=$generationConfig, interruptionLevel=$interruptionLevel, messagePlan=$messagePlan, networkSimulation=$networkSimulation, organization=$organization, project=$project, speed=$speed, startSpeakingPlan=$startSpeakingPlan, stopSpeakingPlan=$stopSpeakingPlan, voiceVolume=$voiceVolume, additionalProperties=$additionalProperties}"
}
