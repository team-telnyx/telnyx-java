// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
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

class MetricRetrieveGenerateMetricsProgressResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val agentId: JsonField<Long>,
    private val currentStep: JsonField<String>,
    private val error: JsonField<String>,
    private val metrics: JsonField<List<Metric>>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agent_id") @ExcludeMissing agentId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("current_step")
        @ExcludeMissing
        currentStep: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metrics")
        @ExcludeMissing
        metrics: JsonField<List<Metric>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(agentId, currentStep, error, metrics, status, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentId(): Long = agentId.getRequired("agent_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currentStep(): String = currentStep.getRequired("current_step")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metrics(): List<Metric> = metrics.getRequired("metrics")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_id") @ExcludeMissing fun _agentId(): JsonField<Long> = agentId

    /**
     * Returns the raw JSON value of [currentStep].
     *
     * Unlike [currentStep], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_step")
    @ExcludeMissing
    fun _currentStep(): JsonField<String> = currentStep

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [metrics].
     *
     * Unlike [metrics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonField<List<Metric>> = metrics

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
         * [MetricRetrieveGenerateMetricsProgressResponse].
         *
         * The following fields are required:
         * ```java
         * .agentId()
         * .currentStep()
         * .error()
         * .metrics()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MetricRetrieveGenerateMetricsProgressResponse]. */
    class Builder internal constructor() {

        private var agentId: JsonField<Long>? = null
        private var currentStep: JsonField<String>? = null
        private var error: JsonField<String>? = null
        private var metrics: JsonField<MutableList<Metric>>? = null
        private var status: JsonField<Status>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            metricRetrieveGenerateMetricsProgressResponse:
                MetricRetrieveGenerateMetricsProgressResponse
        ) = apply {
            agentId = metricRetrieveGenerateMetricsProgressResponse.agentId
            currentStep = metricRetrieveGenerateMetricsProgressResponse.currentStep
            error = metricRetrieveGenerateMetricsProgressResponse.error
            metrics =
                metricRetrieveGenerateMetricsProgressResponse.metrics.map { it.toMutableList() }
            status = metricRetrieveGenerateMetricsProgressResponse.status
            additionalProperties =
                metricRetrieveGenerateMetricsProgressResponse.additionalProperties.toMutableMap()
        }

        fun agentId(agentId: Long) = agentId(JsonField.of(agentId))

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<Long>) = apply { this.agentId = agentId }

        fun currentStep(currentStep: String) = currentStep(JsonField.of(currentStep))

        /**
         * Sets [Builder.currentStep] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentStep] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentStep(currentStep: JsonField<String>) = apply { this.currentStep = currentStep }

        fun error(error: String?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<String>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        fun metrics(metrics: List<Metric>) = metrics(JsonField.of(metrics))

        /**
         * Sets [Builder.metrics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metrics] with a well-typed `List<Metric>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metrics(metrics: JsonField<List<Metric>>) = apply {
            this.metrics = metrics.map { it.toMutableList() }
        }

        /**
         * Adds a single [Metric] to [metrics].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMetric(metric: Metric) = apply {
            metrics =
                (metrics ?: JsonField.of(mutableListOf())).also {
                    checkKnown("metrics", it).add(metric)
                }
        }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [MetricRetrieveGenerateMetricsProgressResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .agentId()
         * .currentStep()
         * .error()
         * .metrics()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MetricRetrieveGenerateMetricsProgressResponse =
            MetricRetrieveGenerateMetricsProgressResponse(
                checkRequired("agentId", agentId),
                checkRequired("currentStep", currentStep),
                checkRequired("error", error),
                checkRequired("metrics", metrics).map { it.toImmutable() },
                checkRequired("status", status),
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
    fun validate(): MetricRetrieveGenerateMetricsProgressResponse = apply {
        if (validated) {
            return@apply
        }

        agentId()
        currentStep()
        error()
        metrics().forEach { it.validate() }
        status().validate()
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
        (if (agentId.asKnown().isPresent) 1 else 0) +
            (if (currentStep.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (metrics.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    class Metric
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agent: JsonField<Long>,
        private val description: JsonField<String>,
        private val evalType: JsonField<String>,
        private val name: JsonField<String>,
        private val scenarios: JsonField<List<Long>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agent") @ExcludeMissing agent: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("eval_type")
            @ExcludeMissing
            evalType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scenarios")
            @ExcludeMissing
            scenarios: JsonField<List<Long>> = JsonMissing.of(),
        ) : this(agent, description, evalType, name, scenarios, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agent(): Optional<Long> = agent.getOptional("agent")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
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
        fun scenarios(): Optional<List<Long>> = scenarios.getOptional("scenarios")

        /**
         * Returns the raw JSON value of [agent].
         *
         * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent") @ExcludeMissing fun _agent(): JsonField<Long> = agent

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
         * Returns the raw JSON value of [scenarios].
         *
         * Unlike [scenarios], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scenarios")
        @ExcludeMissing
        fun _scenarios(): JsonField<List<Long>> = scenarios

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

            /** Returns a mutable builder for constructing an instance of [Metric]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metric]. */
        class Builder internal constructor() {

            private var agent: JsonField<Long> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var evalType: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var scenarios: JsonField<MutableList<Long>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metric: Metric) = apply {
                agent = metric.agent
                description = metric.description
                evalType = metric.evalType
                name = metric.name
                scenarios = metric.scenarios.map { it.toMutableList() }
                additionalProperties = metric.additionalProperties.toMutableMap()
            }

            fun agent(agent: Long) = agent(JsonField.of(agent))

            /**
             * Sets [Builder.agent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agent] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun agent(agent: JsonField<Long>) = apply { this.agent = agent }

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

            fun scenarios(scenarios: List<Long>) = scenarios(JsonField.of(scenarios))

            /**
             * Sets [Builder.scenarios] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scenarios] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scenarios(scenarios: JsonField<List<Long>>) = apply {
                this.scenarios = scenarios.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [scenarios].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addScenario(scenario: Long) = apply {
                scenarios =
                    (scenarios ?: JsonField.of(mutableListOf())).also {
                        checkKnown("scenarios", it).add(scenario)
                    }
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
             * Returns an immutable instance of [Metric].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metric =
                Metric(
                    agent,
                    description,
                    evalType,
                    name,
                    (scenarios ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Metric = apply {
            if (validated) {
                return@apply
            }

            agent()
            description()
            evalType()
            name()
            scenarios()
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
            (if (agent.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (evalType.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (scenarios.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metric &&
                agent == other.agent &&
                description == other.description &&
                evalType == other.evalType &&
                name == other.name &&
                scenarios == other.scenarios &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(agent, description, evalType, name, scenarios, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metric{agent=$agent, description=$description, evalType=$evalType, name=$name, scenarios=$scenarios, additionalProperties=$additionalProperties}"
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val QUEUED = of("queued")

            @JvmField val PROCESSING = of("processing")

            @JvmField val COMPLETED = of("completed")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            QUEUED,
            PROCESSING,
            COMPLETED,
            FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUEUED,
            PROCESSING,
            COMPLETED,
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                QUEUED -> Value.QUEUED
                PROCESSING -> Value.PROCESSING
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
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
                QUEUED -> Known.QUEUED
                PROCESSING -> Known.PROCESSING
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MetricRetrieveGenerateMetricsProgressResponse &&
            agentId == other.agentId &&
            currentStep == other.currentStep &&
            error == other.error &&
            metrics == other.metrics &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(agentId, currentStep, error, metrics, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MetricRetrieveGenerateMetricsProgressResponse{agentId=$agentId, currentStep=$currentStep, error=$error, metrics=$metrics, status=$status, additionalProperties=$additionalProperties}"
}
