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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Updates the specified metric. */
class MetricUpdateParams
private constructor(
    private val id: Long?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<Long> = Optional.ofNullable(id)

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addToNewAgents(): Optional<Boolean> = body.addToNewAgents()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agents(): Optional<List<Long>> = body.agents()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioEnabled(): Optional<Boolean> = body.audioEnabled()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayOrder(): Optional<Long> = body.displayOrder()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enumValues(): Optional<List<String>> = body.enumValues()

    /**
     * What the metric scores: numeric, continuous_qualitative, or binary_workflow_adherence.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evalType(): Optional<String> = body.evalType()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun observabilityEnabled(): Optional<Boolean> = body.observabilityEnabled()

    /**
     * Judge prompt used by llm_judge metrics.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prompt(): Optional<String> = body.prompt()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun samplingEnabled(): Optional<Boolean> = body.samplingEnabled()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun simulationEnabled(): Optional<Boolean> = body.simulationEnabled()

    /**
     * How the metric is evaluated: custom_code or llm_judge.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<String> = body.type()

    /**
     * Returns the raw JSON value of [addToNewAgents].
     *
     * Unlike [addToNewAgents], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addToNewAgents(): JsonField<Boolean> = body._addToNewAgents()

    /**
     * Returns the raw JSON value of [agents].
     *
     * Unlike [agents], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agents(): JsonField<List<Long>> = body._agents()

    /**
     * Returns the raw JSON value of [audioEnabled].
     *
     * Unlike [audioEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _audioEnabled(): JsonField<Boolean> = body._audioEnabled()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [displayOrder].
     *
     * Unlike [displayOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayOrder(): JsonField<Long> = body._displayOrder()

    /**
     * Returns the raw JSON value of [enumValues].
     *
     * Unlike [enumValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enumValues(): JsonField<List<String>> = body._enumValues()

    /**
     * Returns the raw JSON value of [evalType].
     *
     * Unlike [evalType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _evalType(): JsonField<String> = body._evalType()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [observabilityEnabled].
     *
     * Unlike [observabilityEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _observabilityEnabled(): JsonField<Boolean> = body._observabilityEnabled()

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _prompt(): JsonField<String> = body._prompt()

    /**
     * Returns the raw JSON value of [samplingEnabled].
     *
     * Unlike [samplingEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _samplingEnabled(): JsonField<Boolean> = body._samplingEnabled()

    /**
     * Returns the raw JSON value of [simulationEnabled].
     *
     * Unlike [simulationEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _simulationEnabled(): JsonField<Boolean> = body._simulationEnabled()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<String> = body._type()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MetricUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [MetricUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MetricUpdateParams]. */
    class Builder internal constructor() {

        private var id: Long? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(metricUpdateParams: MetricUpdateParams) = apply {
            id = metricUpdateParams.id
            body = metricUpdateParams.body.toBuilder()
            additionalHeaders = metricUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = metricUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: Long?) = apply { this.id = id }

        /**
         * Alias for [Builder.id].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun id(id: Long) = id(id as Long?)

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<Long>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [addToNewAgents]
         * - [agents]
         * - [audioEnabled]
         * - [description]
         * - [displayOrder]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun addToNewAgents(addToNewAgents: Boolean?) = apply { body.addToNewAgents(addToNewAgents) }

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
            body.addToNewAgents(addToNewAgents)
        }

        fun agents(agents: List<Long>) = apply { body.agents(agents) }

        /**
         * Sets [Builder.agents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agents] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agents(agents: JsonField<List<Long>>) = apply { body.agents(agents) }

        /**
         * Adds a single [Long] to [agents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAgent(agent: Long) = apply { body.addAgent(agent) }

        fun audioEnabled(audioEnabled: Boolean) = apply { body.audioEnabled(audioEnabled) }

        /**
         * Sets [Builder.audioEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun audioEnabled(audioEnabled: JsonField<Boolean>) = apply {
            body.audioEnabled(audioEnabled)
        }

        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun displayOrder(displayOrder: Long) = apply { body.displayOrder(displayOrder) }

        /**
         * Sets [Builder.displayOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayOrder] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayOrder(displayOrder: JsonField<Long>) = apply { body.displayOrder(displayOrder) }

        fun enumValues(enumValues: List<String>) = apply { body.enumValues(enumValues) }

        /**
         * Sets [Builder.enumValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enumValues] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enumValues(enumValues: JsonField<List<String>>) = apply { body.enumValues(enumValues) }

        /**
         * Adds a single [String] to [enumValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnumValue(enumValue: String) = apply { body.addEnumValue(enumValue) }

        /**
         * What the metric scores: numeric, continuous_qualitative, or binary_workflow_adherence.
         */
        fun evalType(evalType: String) = apply { body.evalType(evalType) }

        /**
         * Sets [Builder.evalType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evalType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun evalType(evalType: JsonField<String>) = apply { body.evalType(evalType) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun observabilityEnabled(observabilityEnabled: Boolean) = apply {
            body.observabilityEnabled(observabilityEnabled)
        }

        /**
         * Sets [Builder.observabilityEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observabilityEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun observabilityEnabled(observabilityEnabled: JsonField<Boolean>) = apply {
            body.observabilityEnabled(observabilityEnabled)
        }

        /** Judge prompt used by llm_judge metrics. */
        fun prompt(prompt: String) = apply { body.prompt(prompt) }

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prompt(prompt: JsonField<String>) = apply { body.prompt(prompt) }

        fun samplingEnabled(samplingEnabled: Boolean) = apply {
            body.samplingEnabled(samplingEnabled)
        }

        /**
         * Sets [Builder.samplingEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.samplingEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun samplingEnabled(samplingEnabled: JsonField<Boolean>) = apply {
            body.samplingEnabled(samplingEnabled)
        }

        fun simulationEnabled(simulationEnabled: Boolean) = apply {
            body.simulationEnabled(simulationEnabled)
        }

        /**
         * Sets [Builder.simulationEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.simulationEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun simulationEnabled(simulationEnabled: JsonField<Boolean>) = apply {
            body.simulationEnabled(simulationEnabled)
        }

        /** How the metric is evaluated: custom_code or llm_judge. */
        fun type(type: String) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { body.type(type) }

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

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [MetricUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MetricUpdateParams =
            MetricUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addToNewAgents: JsonField<Boolean>,
        private val agents: JsonField<List<Long>>,
        private val audioEnabled: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val displayOrder: JsonField<Long>,
        private val enumValues: JsonField<List<String>>,
        private val evalType: JsonField<String>,
        private val name: JsonField<String>,
        private val observabilityEnabled: JsonField<Boolean>,
        private val prompt: JsonField<String>,
        private val samplingEnabled: JsonField<Boolean>,
        private val simulationEnabled: JsonField<Boolean>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("add_to_new_agents")
            @ExcludeMissing
            addToNewAgents: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("agents")
            @ExcludeMissing
            agents: JsonField<List<Long>> = JsonMissing.of(),
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
            @JsonProperty("eval_type")
            @ExcludeMissing
            evalType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
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
            addToNewAgents,
            agents,
            audioEnabled,
            description,
            displayOrder,
            enumValues,
            evalType,
            name,
            observabilityEnabled,
            prompt,
            samplingEnabled,
            simulationEnabled,
            type,
            mutableMapOf(),
        )

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
        fun name(): Optional<String> = name.getOptional("name")

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
        fun simulationEnabled(): Optional<Boolean> =
            simulationEnabled.getOptional("simulation_enabled")

        /**
         * How the metric is evaluated: custom_code or llm_judge.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [addToNewAgents].
         *
         * Unlike [addToNewAgents], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [audioEnabled].
         *
         * Unlike [audioEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("audio_enabled")
        @ExcludeMissing
        fun _audioEnabled(): JsonField<Boolean> = audioEnabled

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [displayOrder].
         *
         * Unlike [displayOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [observabilityEnabled].
         *
         * Unlike [observabilityEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Unlike [samplingEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var addToNewAgents: JsonField<Boolean> = JsonMissing.of()
            private var agents: JsonField<MutableList<Long>>? = null
            private var audioEnabled: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var displayOrder: JsonField<Long> = JsonMissing.of()
            private var enumValues: JsonField<MutableList<String>>? = null
            private var evalType: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var observabilityEnabled: JsonField<Boolean> = JsonMissing.of()
            private var prompt: JsonField<String> = JsonMissing.of()
            private var samplingEnabled: JsonField<Boolean> = JsonMissing.of()
            private var simulationEnabled: JsonField<Boolean> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                addToNewAgents = body.addToNewAgents
                agents = body.agents.map { it.toMutableList() }
                audioEnabled = body.audioEnabled
                description = body.description
                displayOrder = body.displayOrder
                enumValues = body.enumValues.map { it.toMutableList() }
                evalType = body.evalType
                name = body.name
                observabilityEnabled = body.observabilityEnabled
                prompt = body.prompt
                samplingEnabled = body.samplingEnabled
                simulationEnabled = body.simulationEnabled
                type = body.type
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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
             * You should usually call [Builder.agents] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun audioEnabled(audioEnabled: Boolean) = audioEnabled(JsonField.of(audioEnabled))

            /**
             * Sets [Builder.audioEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audioEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audioEnabled(audioEnabled: JsonField<Boolean>) = apply {
                this.audioEnabled = audioEnabled
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun displayOrder(displayOrder: Long) = displayOrder(JsonField.of(displayOrder))

            /**
             * Sets [Builder.displayOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayOrder(displayOrder: JsonField<Long>) = apply {
                this.displayOrder = displayOrder
            }

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
             * What the metric scores: numeric, continuous_qualitative, or
             * binary_workflow_adherence.
             */
            fun evalType(evalType: String) = evalType(JsonField.of(evalType))

            /**
             * Sets [Builder.evalType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evalType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun evalType(evalType: JsonField<String>) = apply { this.evalType = evalType }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun observabilityEnabled(observabilityEnabled: Boolean) =
                observabilityEnabled(JsonField.of(observabilityEnabled))

            /**
             * Sets [Builder.observabilityEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.observabilityEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun observabilityEnabled(observabilityEnabled: JsonField<Boolean>) = apply {
                this.observabilityEnabled = observabilityEnabled
            }

            /** Judge prompt used by llm_judge metrics. */
            fun prompt(prompt: String) = prompt(JsonField.of(prompt))

            /**
             * Sets [Builder.prompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prompt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    addToNewAgents,
                    (agents ?: JsonMissing.of()).map { it.toImmutable() },
                    audioEnabled,
                    description,
                    displayOrder,
                    (enumValues ?: JsonMissing.of()).map { it.toImmutable() },
                    evalType,
                    name,
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
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            addToNewAgents()
            agents()
            audioEnabled()
            description()
            displayOrder()
            enumValues()
            evalType()
            name()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (addToNewAgents.asKnown().isPresent) 1 else 0) +
                (agents.asKnown().getOrNull()?.size ?: 0) +
                (if (audioEnabled.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (displayOrder.asKnown().isPresent) 1 else 0) +
                (enumValues.asKnown().getOrNull()?.size ?: 0) +
                (if (evalType.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (observabilityEnabled.asKnown().isPresent) 1 else 0) +
                (if (prompt.asKnown().isPresent) 1 else 0) +
                (if (samplingEnabled.asKnown().isPresent) 1 else 0) +
                (if (simulationEnabled.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                addToNewAgents == other.addToNewAgents &&
                agents == other.agents &&
                audioEnabled == other.audioEnabled &&
                description == other.description &&
                displayOrder == other.displayOrder &&
                enumValues == other.enumValues &&
                evalType == other.evalType &&
                name == other.name &&
                observabilityEnabled == other.observabilityEnabled &&
                prompt == other.prompt &&
                samplingEnabled == other.samplingEnabled &&
                simulationEnabled == other.simulationEnabled &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addToNewAgents,
                agents,
                audioEnabled,
                description,
                displayOrder,
                enumValues,
                evalType,
                name,
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
            "Body{addToNewAgents=$addToNewAgents, agents=$agents, audioEnabled=$audioEnabled, description=$description, displayOrder=$displayOrder, enumValues=$enumValues, evalType=$evalType, name=$name, observabilityEnabled=$observabilityEnabled, prompt=$prompt, samplingEnabled=$samplingEnabled, simulationEnabled=$simulationEnabled, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MetricUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MetricUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
