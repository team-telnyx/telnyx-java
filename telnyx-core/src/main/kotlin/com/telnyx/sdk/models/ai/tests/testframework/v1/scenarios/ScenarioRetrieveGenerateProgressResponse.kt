// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ScenarioRetrieveGenerateProgressResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val completedScenarios: JsonField<Long>,
    private val failedScenarios: JsonField<Long>,
    private val scenariosList: JsonField<List<ScenariosList>>,
    private val totalScenarios: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("completed_scenarios")
        @ExcludeMissing
        completedScenarios: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("failed_scenarios")
        @ExcludeMissing
        failedScenarios: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("scenarios_list")
        @ExcludeMissing
        scenariosList: JsonField<List<ScenariosList>> = JsonMissing.of(),
        @JsonProperty("total_scenarios")
        @ExcludeMissing
        totalScenarios: JsonField<Long> = JsonMissing.of(),
    ) : this(completedScenarios, failedScenarios, scenariosList, totalScenarios, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedScenarios(): Optional<Long> = completedScenarios.getOptional("completed_scenarios")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failedScenarios(): Optional<Long> = failedScenarios.getOptional("failed_scenarios")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scenariosList(): Optional<List<ScenariosList>> = scenariosList.getOptional("scenarios_list")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalScenarios(): Optional<Long> = totalScenarios.getOptional("total_scenarios")

    /**
     * Returns the raw JSON value of [completedScenarios].
     *
     * Unlike [completedScenarios], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("completed_scenarios")
    @ExcludeMissing
    fun _completedScenarios(): JsonField<Long> = completedScenarios

    /**
     * Returns the raw JSON value of [failedScenarios].
     *
     * Unlike [failedScenarios], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failed_scenarios")
    @ExcludeMissing
    fun _failedScenarios(): JsonField<Long> = failedScenarios

    /**
     * Returns the raw JSON value of [scenariosList].
     *
     * Unlike [scenariosList], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scenarios_list")
    @ExcludeMissing
    fun _scenariosList(): JsonField<List<ScenariosList>> = scenariosList

    /**
     * Returns the raw JSON value of [totalScenarios].
     *
     * Unlike [totalScenarios], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_scenarios")
    @ExcludeMissing
    fun _totalScenarios(): JsonField<Long> = totalScenarios

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
         * [ScenarioRetrieveGenerateProgressResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScenarioRetrieveGenerateProgressResponse]. */
    class Builder internal constructor() {

        private var completedScenarios: JsonField<Long> = JsonMissing.of()
        private var failedScenarios: JsonField<Long> = JsonMissing.of()
        private var scenariosList: JsonField<MutableList<ScenariosList>>? = null
        private var totalScenarios: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            scenarioRetrieveGenerateProgressResponse: ScenarioRetrieveGenerateProgressResponse
        ) = apply {
            completedScenarios = scenarioRetrieveGenerateProgressResponse.completedScenarios
            failedScenarios = scenarioRetrieveGenerateProgressResponse.failedScenarios
            scenariosList =
                scenarioRetrieveGenerateProgressResponse.scenariosList.map { it.toMutableList() }
            totalScenarios = scenarioRetrieveGenerateProgressResponse.totalScenarios
            additionalProperties =
                scenarioRetrieveGenerateProgressResponse.additionalProperties.toMutableMap()
        }

        fun completedScenarios(completedScenarios: Long) =
            completedScenarios(JsonField.of(completedScenarios))

        /**
         * Sets [Builder.completedScenarios] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedScenarios] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedScenarios(completedScenarios: JsonField<Long>) = apply {
            this.completedScenarios = completedScenarios
        }

        fun failedScenarios(failedScenarios: Long) = failedScenarios(JsonField.of(failedScenarios))

        /**
         * Sets [Builder.failedScenarios] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failedScenarios] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failedScenarios(failedScenarios: JsonField<Long>) = apply {
            this.failedScenarios = failedScenarios
        }

        fun scenariosList(scenariosList: List<ScenariosList>) =
            scenariosList(JsonField.of(scenariosList))

        /**
         * Sets [Builder.scenariosList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scenariosList] with a well-typed `List<ScenariosList>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun scenariosList(scenariosList: JsonField<List<ScenariosList>>) = apply {
            this.scenariosList = scenariosList.map { it.toMutableList() }
        }

        /**
         * Adds a single [ScenariosList] to [Builder.scenariosList].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScenariosList(scenariosList: ScenariosList) = apply {
            this.scenariosList =
                (this.scenariosList ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scenariosList", it).add(scenariosList)
                }
        }

        fun totalScenarios(totalScenarios: Long) = totalScenarios(JsonField.of(totalScenarios))

        /**
         * Sets [Builder.totalScenarios] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalScenarios] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalScenarios(totalScenarios: JsonField<Long>) = apply {
            this.totalScenarios = totalScenarios
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
         * Returns an immutable instance of [ScenarioRetrieveGenerateProgressResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ScenarioRetrieveGenerateProgressResponse =
            ScenarioRetrieveGenerateProgressResponse(
                completedScenarios,
                failedScenarios,
                (scenariosList ?: JsonMissing.of()).map { it.toImmutable() },
                totalScenarios,
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
    fun validate(): ScenarioRetrieveGenerateProgressResponse = apply {
        if (validated) {
            return@apply
        }

        completedScenarios()
        failedScenarios()
        scenariosList().ifPresent { it.forEach { it.validate() } }
        totalScenarios()
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
        (if (completedScenarios.asKnown().isPresent) 1 else 0) +
            (if (failedScenarios.asKnown().isPresent) 1 else 0) +
            (scenariosList.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalScenarios.asKnown().isPresent) 1 else 0)

    class ScenariosList
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

            /** Returns a mutable builder for constructing an instance of [ScenariosList]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ScenariosList]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scenariosList: ScenariosList) = apply {
                additionalProperties = scenariosList.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ScenariosList].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ScenariosList = ScenariosList(additionalProperties.toImmutable())
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
        fun validate(): ScenariosList = apply {
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

            return other is ScenariosList && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ScenariosList{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScenarioRetrieveGenerateProgressResponse &&
            completedScenarios == other.completedScenarios &&
            failedScenarios == other.failedScenarios &&
            scenariosList == other.scenariosList &&
            totalScenarios == other.totalScenarios &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            completedScenarios,
            failedScenarios,
            scenariosList,
            totalScenarios,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScenarioRetrieveGenerateProgressResponse{completedScenarios=$completedScenarios, failedScenarios=$failedScenarios, scenariosList=$scenariosList, totalScenarios=$totalScenarios, additionalProperties=$additionalProperties}"
}
