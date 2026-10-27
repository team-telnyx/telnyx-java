// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CreateAiTestMetricRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val addToNewAgents: JsonField<Boolean>,
    private val agents: JsonField<List<Long>>,
    private val assistantId: JsonField<String>,
    private val audioEnabled: JsonField<Boolean>,
    private val description: JsonField<String>,
    private val displayOrder: JsonField<Long>,
    private val enumValues: JsonField<List<String>>,
    private val evalType: JsonField<String>,
    private val observabilityEnabled: JsonField<Boolean>,
    private val prompt: JsonField<String>,
    private val samplingEnabled: JsonField<Boolean>,
    private val simulationEnabled: JsonField<Boolean>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("add_to_new_agents")
        @ExcludeMissing
        addToNewAgents: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("agents") @ExcludeMissing agents: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("assistant_id")
        @ExcludeMissing
        assistantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("audio_enabled")
        @ExcludeMissing
        audioEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("display_order")
        @ExcludeMissing
        displayOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("enum_values")
        @ExcludeMissing
        enumValues: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("eval_type") @ExcludeMissing evalType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("observability_enabled")
        @ExcludeMissing
        observabilityEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sampling_enabled")
        @ExcludeMissing
        samplingEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("simulation_enabled")
        @ExcludeMissing
        simulationEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(
        name,
        addToNewAgents,
        agents,
        assistantId,
        audioEnabled,
        description,
        displayOrder,
        enumValues,
        evalType,
        observabilityEnabled,
        prompt,
        samplingEnabled,
        simulationEnabled,
        type,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addToNewAgents(): Optional<Boolean> = addToNewAgents.getOptional("add_to_new_agents")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agents(): Optional<List<Long>> = agents.getOptional("agents")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assistantId(): Optional<String> = assistantId.getOptional("assistant_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioEnabled(): Optional<Boolean> = audioEnabled.getOptional("audio_enabled")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayOrder(): Optional<Long> = displayOrder.getOptional("display_order")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enumValues(): Optional<List<String>> = enumValues.getOptional("enum_values")

    /**
     * What the metric scores: numeric, continuous_qualitative, or binary_workflow_adherence.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evalType(): Optional<String> = evalType.getOptional("eval_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun observabilityEnabled(): Optional<Boolean> =
        observabilityEnabled.getOptional("observability_enabled")

    /**
     * Judge prompt used by llm_judge metrics.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prompt(): Optional<String> = prompt.getOptional("prompt")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun samplingEnabled(): Optional<Boolean> = samplingEnabled.getOptional("sampling_enabled")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun simulationEnabled(): Optional<Boolean> = simulationEnabled.getOptional("simulation_enabled")

    /**
     * How the metric is evaluated: custom_code or llm_judge.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [addToNewAgents].
     *
     * Unlike [addToNewAgents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("add_to_new_agents")
    @ExcludeMissing
    fun _addToNewAgents(): JsonField<Boolean> = addToNewAgents

    /**
     * Returns the raw JSON value of [agents].
     *
     * Unlike [agents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agents") @ExcludeMissing fun _agents(): JsonField<List<Long>> = agents

    /**
     * Returns the raw JSON value of [assistantId].
     *
     * Unlike [assistantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("assistant_id")
    @ExcludeMissing
    fun _assistantId(): JsonField<String> = assistantId

    /**
     * Returns the raw JSON value of [audioEnabled].
     *
     * Unlike [audioEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audio_enabled")
    @ExcludeMissing
    fun _audioEnabled(): JsonField<Boolean> = audioEnabled

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [displayOrder].
     *
     * Unlike [displayOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_order")
    @ExcludeMissing
    fun _displayOrder(): JsonField<Long> = displayOrder

    /**
     * Returns the raw JSON value of [enumValues].
     *
     * Unlike [enumValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enum_values")
    @ExcludeMissing
    fun _enumValues(): JsonField<List<String>> = enumValues

    /**
     * Returns the raw JSON value of [evalType].
     *
     * Unlike [evalType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eval_type") @ExcludeMissing fun _evalType(): JsonField<String> = evalType

    /**
     * Returns the raw JSON value of [observabilityEnabled].
     *
     * Unlike [observabilityEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("observability_enabled")
    @ExcludeMissing
    fun _observabilityEnabled(): JsonField<Boolean> = observabilityEnabled

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

    /**
     * Returns the raw JSON value of [samplingEnabled].
     *
     * Unlike [samplingEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sampling_enabled")
    @ExcludeMissing
    fun _samplingEnabled(): JsonField<Boolean> = samplingEnabled

    /**
     * Returns the raw JSON value of [simulationEnabled].
     *
     * Unlike [simulationEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("simulation_enabled")
    @ExcludeMissing
    fun _simulationEnabled(): JsonField<Boolean> = simulationEnabled

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
         * Returns a mutable builder for constructing an instance of [CreateAiTestMetricRequest].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreateAiTestMetricRequest]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var addToNewAgents: JsonField<Boolean> = JsonMissing.of()
        private var agents: JsonField<MutableList<Long>>? = null
        private var assistantId: JsonField<String> = JsonMissing.of()
        private var audioEnabled: JsonField<Boolean> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var displayOrder: JsonField<Long> = JsonMissing.of()
        private var enumValues: JsonField<MutableList<String>>? = null
        private var evalType: JsonField<String> = JsonMissing.of()
        private var observabilityEnabled: JsonField<Boolean> = JsonMissing.of()
        private var prompt: JsonField<String> = JsonMissing.of()
        private var samplingEnabled: JsonField<Boolean> = JsonMissing.of()
        private var simulationEnabled: JsonField<Boolean> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createAiTestMetricRequest: CreateAiTestMetricRequest) = apply {
            name = createAiTestMetricRequest.name
            addToNewAgents = createAiTestMetricRequest.addToNewAgents
            agents = createAiTestMetricRequest.agents.map { it.toMutableList() }
            assistantId = createAiTestMetricRequest.assistantId
            audioEnabled = createAiTestMetricRequest.audioEnabled
            description = createAiTestMetricRequest.description
            displayOrder = createAiTestMetricRequest.displayOrder
            enumValues = createAiTestMetricRequest.enumValues.map { it.toMutableList() }
            evalType = createAiTestMetricRequest.evalType
            observabilityEnabled = createAiTestMetricRequest.observabilityEnabled
            prompt = createAiTestMetricRequest.prompt
            samplingEnabled = createAiTestMetricRequest.samplingEnabled
            simulationEnabled = createAiTestMetricRequest.simulationEnabled
            type = createAiTestMetricRequest.type
            additionalProperties = createAiTestMetricRequest.additionalProperties.toMutableMap()
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun addToNewAgents(addToNewAgents: Boolean?) =
            addToNewAgents(JsonField.ofNullable(addToNewAgents))

        /**
         * Alias for [Builder.addToNewAgents].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun addToNewAgents(addToNewAgents: Boolean) = addToNewAgents(addToNewAgents as Boolean?)

        /** Alias for calling [Builder.addToNewAgents] with `addToNewAgents.orElse(null)`. */
        fun addToNewAgents(addToNewAgents: Optional<Boolean>) =
            addToNewAgents(addToNewAgents.getOrNull())

        /**
         * Sets [Builder.addToNewAgents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addToNewAgents] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addToNewAgents(addToNewAgents: JsonField<Boolean>) = apply {
            this.addToNewAgents = addToNewAgents
        }

        fun agents(agents: List<Long>) = agents(JsonField.of(agents))

        /**
         * Sets [Builder.agents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agents] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agents(agents: JsonField<List<Long>>) = apply {
            this.agents = agents.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [agents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAgent(agent: Long) = apply {
            agents =
                (agents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("agents", it).add(agent)
                }
        }

        fun assistantId(assistantId: String) = assistantId(JsonField.of(assistantId))

        /**
         * Sets [Builder.assistantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assistantId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assistantId(assistantId: JsonField<String>) = apply { this.assistantId = assistantId }

        fun audioEnabled(audioEnabled: Boolean) = audioEnabled(JsonField.of(audioEnabled))

        /**
         * Sets [Builder.audioEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun audioEnabled(audioEnabled: JsonField<Boolean>) = apply {
            this.audioEnabled = audioEnabled
        }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun displayOrder(displayOrder: Long) = displayOrder(JsonField.of(displayOrder))

        /**
         * Sets [Builder.displayOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayOrder] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayOrder(displayOrder: JsonField<Long>) = apply { this.displayOrder = displayOrder }

        fun enumValues(enumValues: List<String>) = enumValues(JsonField.of(enumValues))

        /**
         * Sets [Builder.enumValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enumValues] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enumValues(enumValues: JsonField<List<String>>) = apply {
            this.enumValues = enumValues.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [enumValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnumValue(enumValue: String) = apply {
            enumValues =
                (enumValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("enumValues", it).add(enumValue)
                }
        }

        /**
         * What the metric scores: numeric, continuous_qualitative, or binary_workflow_adherence.
         */
        fun evalType(evalType: String) = evalType(JsonField.of(evalType))

        /**
         * Sets [Builder.evalType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evalType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun evalType(evalType: JsonField<String>) = apply { this.evalType = evalType }

        fun observabilityEnabled(observabilityEnabled: Boolean) =
            observabilityEnabled(JsonField.of(observabilityEnabled))

        /**
         * Sets [Builder.observabilityEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observabilityEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun observabilityEnabled(observabilityEnabled: JsonField<Boolean>) = apply {
            this.observabilityEnabled = observabilityEnabled
        }

        /** Judge prompt used by llm_judge metrics. */
        fun prompt(prompt: String) = prompt(JsonField.of(prompt))

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

        fun samplingEnabled(samplingEnabled: Boolean) =
            samplingEnabled(JsonField.of(samplingEnabled))

        /**
         * Sets [Builder.samplingEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.samplingEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun samplingEnabled(samplingEnabled: JsonField<Boolean>) = apply {
            this.samplingEnabled = samplingEnabled
        }

        fun simulationEnabled(simulationEnabled: Boolean) =
            simulationEnabled(JsonField.of(simulationEnabled))

        /**
         * Sets [Builder.simulationEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.simulationEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun simulationEnabled(simulationEnabled: JsonField<Boolean>) = apply {
            this.simulationEnabled = simulationEnabled
        }

        /** How the metric is evaluated: custom_code or llm_judge. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Returns an immutable instance of [CreateAiTestMetricRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreateAiTestMetricRequest =
            CreateAiTestMetricRequest(
                checkRequired("name", name),
                addToNewAgents,
                (agents ?: JsonMissing.of()).map { it.toImmutable() },
                assistantId,
                audioEnabled,
                description,
                displayOrder,
                (enumValues ?: JsonMissing.of()).map { it.toImmutable() },
                evalType,
                observabilityEnabled,
                prompt,
                samplingEnabled,
                simulationEnabled,
                type,
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
    fun validate(): CreateAiTestMetricRequest = apply {
        if (validated) {
            return@apply
        }

        name()
        addToNewAgents()
        agents()
        assistantId()
        audioEnabled()
        description()
        displayOrder()
        enumValues()
        evalType()
        observabilityEnabled()
        prompt()
        samplingEnabled()
        simulationEnabled()
        type()
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (addToNewAgents.asKnown().isPresent) 1 else 0) +
            (agents.asKnown().getOrNull()?.size ?: 0) +
            (if (assistantId.asKnown().isPresent) 1 else 0) +
            (if (audioEnabled.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (displayOrder.asKnown().isPresent) 1 else 0) +
            (enumValues.asKnown().getOrNull()?.size ?: 0) +
            (if (evalType.asKnown().isPresent) 1 else 0) +
            (if (observabilityEnabled.asKnown().isPresent) 1 else 0) +
            (if (prompt.asKnown().isPresent) 1 else 0) +
            (if (samplingEnabled.asKnown().isPresent) 1 else 0) +
            (if (simulationEnabled.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateAiTestMetricRequest &&
            name == other.name &&
            addToNewAgents == other.addToNewAgents &&
            agents == other.agents &&
            assistantId == other.assistantId &&
            audioEnabled == other.audioEnabled &&
            description == other.description &&
            displayOrder == other.displayOrder &&
            enumValues == other.enumValues &&
            evalType == other.evalType &&
            observabilityEnabled == other.observabilityEnabled &&
            prompt == other.prompt &&
            samplingEnabled == other.samplingEnabled &&
            simulationEnabled == other.simulationEnabled &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            name,
            addToNewAgents,
            agents,
            assistantId,
            audioEnabled,
            description,
            displayOrder,
            enumValues,
            evalType,
            observabilityEnabled,
            prompt,
            samplingEnabled,
            simulationEnabled,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateAiTestMetricRequest{name=$name, addToNewAgents=$addToNewAgents, agents=$agents, assistantId=$assistantId, audioEnabled=$audioEnabled, description=$description, displayOrder=$displayOrder, enumValues=$enumValues, evalType=$evalType, observabilityEnabled=$observabilityEnabled, prompt=$prompt, samplingEnabled=$samplingEnabled, simulationEnabled=$simulationEnabled, type=$type, additionalProperties=$additionalProperties}"
}
