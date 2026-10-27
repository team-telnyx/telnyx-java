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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ScenarioListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val count: JsonField<Long>,
    private val next: JsonField<String>,
    private val previous: JsonField<String>,
    private val results: JsonField<List<Result>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous") @ExcludeMissing previous: JsonField<String> = JsonMissing.of(),
        @JsonProperty("results") @ExcludeMissing results: JsonField<List<Result>> = JsonMissing.of(),
    ) : this(count, next, previous, results, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun count(): Long = count.getRequired("count")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun next(): Optional<String> = next.getOptional("next")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previous(): Optional<String> = previous.getOptional("previous")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<Result> = results.getRequired("results")

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

    /**
     * Returns the raw JSON value of [next].
     *
     * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

    /**
     * Returns the raw JSON value of [previous].
     *
     * Unlike [previous], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous") @ExcludeMissing fun _previous(): JsonField<String> = previous

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

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
         * Returns a mutable builder for constructing an instance of [ScenarioListResponse].
         *
         * The following fields are required:
         * ```java
         * .count()
         * .next()
         * .previous()
         * .results()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScenarioListResponse]. */
    class Builder internal constructor() {

        private var count: JsonField<Long>? = null
        private var next: JsonField<String>? = null
        private var previous: JsonField<String>? = null
        private var results: JsonField<MutableList<Result>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scenarioListResponse: ScenarioListResponse) = apply {
            count = scenarioListResponse.count
            next = scenarioListResponse.next
            previous = scenarioListResponse.previous
            results = scenarioListResponse.results.map { it.toMutableList() }
            additionalProperties = scenarioListResponse.additionalProperties.toMutableMap()
        }

        fun count(count: Long) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Long>) = apply { this.count = count }

        fun next(next: String?) = next(JsonField.ofNullable(next))

        /** Alias for calling [Builder.next] with `next.orElse(null)`. */
        fun next(next: Optional<String>) = next(next.getOrNull())

        /**
         * Sets [Builder.next] to an arbitrary JSON value.
         *
         * You should usually call [Builder.next] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun next(next: JsonField<String>) = apply { this.next = next }

        fun previous(previous: String?) = previous(JsonField.ofNullable(previous))

        /** Alias for calling [Builder.previous] with `previous.orElse(null)`. */
        fun previous(previous: Optional<String>) = previous(previous.getOrNull())

        /**
         * Sets [Builder.previous] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previous] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun previous(previous: JsonField<String>) = apply { this.previous = previous }

        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
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
         * Returns an immutable instance of [ScenarioListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .count()
         * .next()
         * .previous()
         * .results()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScenarioListResponse =
            ScenarioListResponse(
                checkRequired("count", count),
                checkRequired("next", next),
                checkRequired("previous", previous),
                checkRequired("results", results).map { it.toImmutable() },
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
    fun validate(): ScenarioListResponse = apply {
        if (validated) {
            return@apply
        }

        count()
        next()
        previous()
        results().forEach { it.validate() }
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
        (if (count.asKnown().isPresent) 1 else 0) +
            (if (next.asKnown().isPresent) 1 else 0) +
            (if (previous.asKnown().isPresent) 1 else 0) +
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Long>,
        private val agent: JsonField<Long>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val dynamicVariableValues: JsonField<DynamicVariableValues>,
        private val expectedOutcomePrompt: JsonField<String>,
        private val firstMessage: JsonField<String>,
        private val folderPath: JsonField<String>,
        private val inboundPhoneNumber: JsonField<Long>,
        private val inboundPhoneNumberData: JsonField<String>,
        private val instructions: JsonField<String>,
        private val lastUpdatedBy: JsonField<Long>,
        private val metricNames: JsonField<List<String>>,
        private val metrics: JsonField<List<Long>>,
        private val personality: JsonField<Long>,
        private val personalityName: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val scenarioLanguage: JsonField<String>,
        private val scenarioType: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val testProfile: JsonField<Long>,
        private val testProfileData: JsonField<TestProfileData>,
        private val toolIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("agent") @ExcludeMissing agent: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dynamic_variable_values")
            @ExcludeMissing
            dynamicVariableValues: JsonField<DynamicVariableValues> = JsonMissing.of(),
            @JsonProperty("expected_outcome_prompt")
            @ExcludeMissing
            expectedOutcomePrompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_message")
            @ExcludeMissing
            firstMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("folder_path")
            @ExcludeMissing
            folderPath: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inbound_phone_number")
            @ExcludeMissing
            inboundPhoneNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("inbound_phone_number_data")
            @ExcludeMissing
            inboundPhoneNumberData: JsonField<String> = JsonMissing.of(),
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_updated_by")
            @ExcludeMissing
            lastUpdatedBy: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metric_names")
            @ExcludeMissing
            metricNames: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("metrics")
            @ExcludeMissing
            metrics: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("personality")
            @ExcludeMissing
            personality: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("personality_name")
            @ExcludeMissing
            personalityName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scenario_language")
            @ExcludeMissing
            scenarioLanguage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scenario_type")
            @ExcludeMissing
            scenarioType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("test_profile")
            @ExcludeMissing
            testProfile: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("test_profile_data")
            @ExcludeMissing
            testProfileData: JsonField<TestProfileData> = JsonMissing.of(),
            @JsonProperty("tool_ids")
            @ExcludeMissing
            toolIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            id,
            agent,
            createdAt,
            name,
            updatedAt,
            dynamicVariableValues,
            expectedOutcomePrompt,
            firstMessage,
            folderPath,
            inboundPhoneNumber,
            inboundPhoneNumberData,
            instructions,
            lastUpdatedBy,
            metricNames,
            metrics,
            personality,
            personalityName,
            phoneNumber,
            scenarioLanguage,
            scenarioType,
            tags,
            testProfile,
            testProfileData,
            toolIds,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): Long = id.getRequired("id")

        /**
         * ID of the test agent the scenario runs against.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agent(): Optional<Long> = agent.getOptional("agent")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dynamicVariableValues(): Optional<DynamicVariableValues> =
            dynamicVariableValues.getOptional("dynamic_variable_values")

        /**
         * What a successful conversation looks like; scored by the expected-outcome metric.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expectedOutcomePrompt(): Optional<String> =
            expectedOutcomePrompt.getOptional("expected_outcome_prompt")

        /**
         * First message the simulated caller speaks or sends.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun firstMessage(): Optional<String> = firstMessage.getOptional("first_message")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun folderPath(): Optional<String> = folderPath.getOptional("folder_path")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inboundPhoneNumber(): Optional<Long> =
            inboundPhoneNumber.getOptional("inbound_phone_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inboundPhoneNumberData(): Optional<String> =
            inboundPhoneNumberData.getOptional("inbound_phone_number_data")

        /**
         * What the simulated caller should do during the conversation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun instructions(): Optional<String> = instructions.getOptional("instructions")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastUpdatedBy(): Optional<Long> = lastUpdatedBy.getOptional("last_updated_by")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metricNames(): Optional<List<String>> = metricNames.getOptional("metric_names")

        /**
         * Metric IDs applied to the scenario.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metrics(): Optional<List<Long>> = metrics.getOptional("metrics")

        /**
         * ID of the test personality the caller simulates.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun personality(): Optional<Long> = personality.getOptional("personality")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun personalityName(): Optional<String> = personalityName.getOptional("personality_name")

        /**
         * Outbound phone number used to place the simulated call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scenarioLanguage(): Optional<String> = scenarioLanguage.getOptional("scenario_language")

        /**
         * Type of scenario: workflow, red_teaming_voice, or red_teaming_text.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scenarioType(): Optional<String> = scenarioType.getOptional("scenario_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun testProfile(): Optional<Long> = testProfile.getOptional("test_profile")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun testProfileData(): Optional<TestProfileData> =
            testProfileData.getOptional("test_profile_data")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun toolIds(): Optional<List<String>> = toolIds.getOptional("tool_ids")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [agent].
         *
         * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent") @ExcludeMissing fun _agent(): JsonField<Long> = agent

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [dynamicVariableValues].
         *
         * Unlike [dynamicVariableValues], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("dynamic_variable_values")
        @ExcludeMissing
        fun _dynamicVariableValues(): JsonField<DynamicVariableValues> = dynamicVariableValues

        /**
         * Returns the raw JSON value of [expectedOutcomePrompt].
         *
         * Unlike [expectedOutcomePrompt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("expected_outcome_prompt")
        @ExcludeMissing
        fun _expectedOutcomePrompt(): JsonField<String> = expectedOutcomePrompt

        /**
         * Returns the raw JSON value of [firstMessage].
         *
         * Unlike [firstMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("first_message")
        @ExcludeMissing
        fun _firstMessage(): JsonField<String> = firstMessage

        /**
         * Returns the raw JSON value of [folderPath].
         *
         * Unlike [folderPath], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("folder_path")
        @ExcludeMissing
        fun _folderPath(): JsonField<String> = folderPath

        /**
         * Returns the raw JSON value of [inboundPhoneNumber].
         *
         * Unlike [inboundPhoneNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inbound_phone_number")
        @ExcludeMissing
        fun _inboundPhoneNumber(): JsonField<Long> = inboundPhoneNumber

        /**
         * Returns the raw JSON value of [inboundPhoneNumberData].
         *
         * Unlike [inboundPhoneNumberData], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inbound_phone_number_data")
        @ExcludeMissing
        fun _inboundPhoneNumberData(): JsonField<String> = inboundPhoneNumberData

        /**
         * Returns the raw JSON value of [instructions].
         *
         * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instructions")
        @ExcludeMissing
        fun _instructions(): JsonField<String> = instructions

        /**
         * Returns the raw JSON value of [lastUpdatedBy].
         *
         * Unlike [lastUpdatedBy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("last_updated_by")
        @ExcludeMissing
        fun _lastUpdatedBy(): JsonField<Long> = lastUpdatedBy

        /**
         * Returns the raw JSON value of [metricNames].
         *
         * Unlike [metricNames], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metric_names")
        @ExcludeMissing
        fun _metricNames(): JsonField<List<String>> = metricNames

        /**
         * Returns the raw JSON value of [metrics].
         *
         * Unlike [metrics], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonField<List<Long>> = metrics

        /**
         * Returns the raw JSON value of [personality].
         *
         * Unlike [personality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("personality")
        @ExcludeMissing
        fun _personality(): JsonField<Long> = personality

        /**
         * Returns the raw JSON value of [personalityName].
         *
         * Unlike [personalityName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("personality_name")
        @ExcludeMissing
        fun _personalityName(): JsonField<String> = personalityName

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [scenarioLanguage].
         *
         * Unlike [scenarioLanguage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scenario_language")
        @ExcludeMissing
        fun _scenarioLanguage(): JsonField<String> = scenarioLanguage

        /**
         * Returns the raw JSON value of [scenarioType].
         *
         * Unlike [scenarioType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scenario_type")
        @ExcludeMissing
        fun _scenarioType(): JsonField<String> = scenarioType

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [testProfile].
         *
         * Unlike [testProfile], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("test_profile")
        @ExcludeMissing
        fun _testProfile(): JsonField<Long> = testProfile

        /**
         * Returns the raw JSON value of [testProfileData].
         *
         * Unlike [testProfileData], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("test_profile_data")
        @ExcludeMissing
        fun _testProfileData(): JsonField<TestProfileData> = testProfileData

        /**
         * Returns the raw JSON value of [toolIds].
         *
         * Unlike [toolIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool_ids") @ExcludeMissing fun _toolIds(): JsonField<List<String>> = toolIds

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
             * Returns a mutable builder for constructing an instance of [Result].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .agent()
             * .createdAt()
             * .name()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var id: JsonField<Long>? = null
            private var agent: JsonField<Long>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var name: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var dynamicVariableValues: JsonField<DynamicVariableValues> = JsonMissing.of()
            private var expectedOutcomePrompt: JsonField<String> = JsonMissing.of()
            private var firstMessage: JsonField<String> = JsonMissing.of()
            private var folderPath: JsonField<String> = JsonMissing.of()
            private var inboundPhoneNumber: JsonField<Long> = JsonMissing.of()
            private var inboundPhoneNumberData: JsonField<String> = JsonMissing.of()
            private var instructions: JsonField<String> = JsonMissing.of()
            private var lastUpdatedBy: JsonField<Long> = JsonMissing.of()
            private var metricNames: JsonField<MutableList<String>>? = null
            private var metrics: JsonField<MutableList<Long>>? = null
            private var personality: JsonField<Long> = JsonMissing.of()
            private var personalityName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var scenarioLanguage: JsonField<String> = JsonMissing.of()
            private var scenarioType: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var testProfile: JsonField<Long> = JsonMissing.of()
            private var testProfileData: JsonField<TestProfileData> = JsonMissing.of()
            private var toolIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                id = result.id
                agent = result.agent
                createdAt = result.createdAt
                name = result.name
                updatedAt = result.updatedAt
                dynamicVariableValues = result.dynamicVariableValues
                expectedOutcomePrompt = result.expectedOutcomePrompt
                firstMessage = result.firstMessage
                folderPath = result.folderPath
                inboundPhoneNumber = result.inboundPhoneNumber
                inboundPhoneNumberData = result.inboundPhoneNumberData
                instructions = result.instructions
                lastUpdatedBy = result.lastUpdatedBy
                metricNames = result.metricNames.map { it.toMutableList() }
                metrics = result.metrics.map { it.toMutableList() }
                personality = result.personality
                personalityName = result.personalityName
                phoneNumber = result.phoneNumber
                scenarioLanguage = result.scenarioLanguage
                scenarioType = result.scenarioType
                tags = result.tags.map { it.toMutableList() }
                testProfile = result.testProfile
                testProfileData = result.testProfileData
                toolIds = result.toolIds.map { it.toMutableList() }
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            fun id(id: Long) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            /** ID of the test agent the scenario runs against. */
            fun agent(agent: Long?) = agent(JsonField.ofNullable(agent))

            /**
             * Alias for [Builder.agent].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun agent(agent: Long) = agent(agent as Long?)

            /** Alias for calling [Builder.agent] with `agent.orElse(null)`. */
            fun agent(agent: Optional<Long>) = agent(agent.getOrNull())

            /**
             * Sets [Builder.agent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agent] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun agent(agent: JsonField<Long>) = apply { this.agent = agent }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun dynamicVariableValues(dynamicVariableValues: DynamicVariableValues?) =
                dynamicVariableValues(JsonField.ofNullable(dynamicVariableValues))

            /**
             * Alias for calling [Builder.dynamicVariableValues] with
             * `dynamicVariableValues.orElse(null)`.
             */
            fun dynamicVariableValues(dynamicVariableValues: Optional<DynamicVariableValues>) =
                dynamicVariableValues(dynamicVariableValues.getOrNull())

            /**
             * Sets [Builder.dynamicVariableValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dynamicVariableValues] with a well-typed
             * [DynamicVariableValues] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun dynamicVariableValues(dynamicVariableValues: JsonField<DynamicVariableValues>) =
                apply {
                    this.dynamicVariableValues = dynamicVariableValues
                }

            /** What a successful conversation looks like; scored by the expected-outcome metric. */
            fun expectedOutcomePrompt(expectedOutcomePrompt: String) =
                expectedOutcomePrompt(JsonField.of(expectedOutcomePrompt))

            /**
             * Sets [Builder.expectedOutcomePrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expectedOutcomePrompt] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun expectedOutcomePrompt(expectedOutcomePrompt: JsonField<String>) = apply {
                this.expectedOutcomePrompt = expectedOutcomePrompt
            }

            /** First message the simulated caller speaks or sends. */
            fun firstMessage(firstMessage: String) = firstMessage(JsonField.of(firstMessage))

            /**
             * Sets [Builder.firstMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstMessage(firstMessage: JsonField<String>) = apply {
                this.firstMessage = firstMessage
            }

            fun folderPath(folderPath: String?) = folderPath(JsonField.ofNullable(folderPath))

            /** Alias for calling [Builder.folderPath] with `folderPath.orElse(null)`. */
            fun folderPath(folderPath: Optional<String>) = folderPath(folderPath.getOrNull())

            /**
             * Sets [Builder.folderPath] to an arbitrary JSON value.
             *
             * You should usually call [Builder.folderPath] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun folderPath(folderPath: JsonField<String>) = apply { this.folderPath = folderPath }

            fun inboundPhoneNumber(inboundPhoneNumber: Long?) =
                inboundPhoneNumber(JsonField.ofNullable(inboundPhoneNumber))

            /**
             * Alias for [Builder.inboundPhoneNumber].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inboundPhoneNumber(inboundPhoneNumber: Long) =
                inboundPhoneNumber(inboundPhoneNumber as Long?)

            /**
             * Alias for calling [Builder.inboundPhoneNumber] with
             * `inboundPhoneNumber.orElse(null)`.
             */
            fun inboundPhoneNumber(inboundPhoneNumber: Optional<Long>) =
                inboundPhoneNumber(inboundPhoneNumber.getOrNull())

            /**
             * Sets [Builder.inboundPhoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundPhoneNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inboundPhoneNumber(inboundPhoneNumber: JsonField<Long>) = apply {
                this.inboundPhoneNumber = inboundPhoneNumber
            }

            fun inboundPhoneNumberData(inboundPhoneNumberData: String?) =
                inboundPhoneNumberData(JsonField.ofNullable(inboundPhoneNumberData))

            /**
             * Alias for calling [Builder.inboundPhoneNumberData] with
             * `inboundPhoneNumberData.orElse(null)`.
             */
            fun inboundPhoneNumberData(inboundPhoneNumberData: Optional<String>) =
                inboundPhoneNumberData(inboundPhoneNumberData.getOrNull())

            /**
             * Sets [Builder.inboundPhoneNumberData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundPhoneNumberData] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inboundPhoneNumberData(inboundPhoneNumberData: JsonField<String>) = apply {
                this.inboundPhoneNumberData = inboundPhoneNumberData
            }

            /** What the simulated caller should do during the conversation. */
            fun instructions(instructions: String) = instructions(JsonField.of(instructions))

            /**
             * Sets [Builder.instructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instructions(instructions: JsonField<String>) = apply {
                this.instructions = instructions
            }

            fun lastUpdatedBy(lastUpdatedBy: Long?) =
                lastUpdatedBy(JsonField.ofNullable(lastUpdatedBy))

            /**
             * Alias for [Builder.lastUpdatedBy].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lastUpdatedBy(lastUpdatedBy: Long) = lastUpdatedBy(lastUpdatedBy as Long?)

            /** Alias for calling [Builder.lastUpdatedBy] with `lastUpdatedBy.orElse(null)`. */
            fun lastUpdatedBy(lastUpdatedBy: Optional<Long>) =
                lastUpdatedBy(lastUpdatedBy.getOrNull())

            /**
             * Sets [Builder.lastUpdatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastUpdatedBy] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastUpdatedBy(lastUpdatedBy: JsonField<Long>) = apply {
                this.lastUpdatedBy = lastUpdatedBy
            }

            fun metricNames(metricNames: List<String>) = metricNames(JsonField.of(metricNames))

            /**
             * Sets [Builder.metricNames] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metricNames] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metricNames(metricNames: JsonField<List<String>>) = apply {
                this.metricNames = metricNames.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [metricNames].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMetricName(metricName: String) = apply {
                metricNames =
                    (metricNames ?: JsonField.of(mutableListOf())).also {
                        checkKnown("metricNames", it).add(metricName)
                    }
            }

            /** Metric IDs applied to the scenario. */
            fun metrics(metrics: List<Long>) = metrics(JsonField.of(metrics))

            /**
             * Sets [Builder.metrics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metrics] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metrics(metrics: JsonField<List<Long>>) = apply {
                this.metrics = metrics.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [metrics].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMetric(metric: Long) = apply {
                metrics =
                    (metrics ?: JsonField.of(mutableListOf())).also {
                        checkKnown("metrics", it).add(metric)
                    }
            }

            /** ID of the test personality the caller simulates. */
            fun personality(personality: Long?) = personality(JsonField.ofNullable(personality))

            /**
             * Alias for [Builder.personality].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun personality(personality: Long) = personality(personality as Long?)

            /** Alias for calling [Builder.personality] with `personality.orElse(null)`. */
            fun personality(personality: Optional<Long>) = personality(personality.getOrNull())

            /**
             * Sets [Builder.personality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.personality] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun personality(personality: JsonField<Long>) = apply { this.personality = personality }

            fun personalityName(personalityName: String) =
                personalityName(JsonField.of(personalityName))

            /**
             * Sets [Builder.personalityName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.personalityName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun personalityName(personalityName: JsonField<String>) = apply {
                this.personalityName = personalityName
            }

            /** Outbound phone number used to place the simulated call. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            fun scenarioLanguage(scenarioLanguage: String?) =
                scenarioLanguage(JsonField.ofNullable(scenarioLanguage))

            /**
             * Alias for calling [Builder.scenarioLanguage] with `scenarioLanguage.orElse(null)`.
             */
            fun scenarioLanguage(scenarioLanguage: Optional<String>) =
                scenarioLanguage(scenarioLanguage.getOrNull())

            /**
             * Sets [Builder.scenarioLanguage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scenarioLanguage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scenarioLanguage(scenarioLanguage: JsonField<String>) = apply {
                this.scenarioLanguage = scenarioLanguage
            }

            /** Type of scenario: workflow, red_teaming_voice, or red_teaming_text. */
            fun scenarioType(scenarioType: String) = scenarioType(JsonField.of(scenarioType))

            /**
             * Sets [Builder.scenarioType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scenarioType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scenarioType(scenarioType: JsonField<String>) = apply {
                this.scenarioType = scenarioType
            }

            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            fun testProfile(testProfile: Long?) = testProfile(JsonField.ofNullable(testProfile))

            /**
             * Alias for [Builder.testProfile].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun testProfile(testProfile: Long) = testProfile(testProfile as Long?)

            /** Alias for calling [Builder.testProfile] with `testProfile.orElse(null)`. */
            fun testProfile(testProfile: Optional<Long>) = testProfile(testProfile.getOrNull())

            /**
             * Sets [Builder.testProfile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.testProfile] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun testProfile(testProfile: JsonField<Long>) = apply { this.testProfile = testProfile }

            fun testProfileData(testProfileData: TestProfileData?) =
                testProfileData(JsonField.ofNullable(testProfileData))

            /** Alias for calling [Builder.testProfileData] with `testProfileData.orElse(null)`. */
            fun testProfileData(testProfileData: Optional<TestProfileData>) =
                testProfileData(testProfileData.getOrNull())

            /**
             * Sets [Builder.testProfileData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.testProfileData] with a well-typed [TestProfileData]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun testProfileData(testProfileData: JsonField<TestProfileData>) = apply {
                this.testProfileData = testProfileData
            }

            fun toolIds(toolIds: List<String>) = toolIds(JsonField.of(toolIds))

            /**
             * Sets [Builder.toolIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolIds(toolIds: JsonField<List<String>>) = apply {
                this.toolIds = toolIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [toolIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addToolId(toolId: String) = apply {
                toolIds =
                    (toolIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("toolIds", it).add(toolId)
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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .agent()
             * .createdAt()
             * .name()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Result =
                Result(
                    checkRequired("id", id),
                    checkRequired("agent", agent),
                    checkRequired("createdAt", createdAt),
                    checkRequired("name", name),
                    checkRequired("updatedAt", updatedAt),
                    dynamicVariableValues,
                    expectedOutcomePrompt,
                    firstMessage,
                    folderPath,
                    inboundPhoneNumber,
                    inboundPhoneNumberData,
                    instructions,
                    lastUpdatedBy,
                    (metricNames ?: JsonMissing.of()).map { it.toImmutable() },
                    (metrics ?: JsonMissing.of()).map { it.toImmutable() },
                    personality,
                    personalityName,
                    phoneNumber,
                    scenarioLanguage,
                    scenarioType,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    testProfile,
                    testProfileData,
                    (toolIds ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            id()
            agent()
            createdAt()
            name()
            updatedAt()
            dynamicVariableValues().ifPresent { it.validate() }
            expectedOutcomePrompt()
            firstMessage()
            folderPath()
            inboundPhoneNumber()
            inboundPhoneNumberData()
            instructions()
            lastUpdatedBy()
            metricNames()
            metrics()
            personality()
            personalityName()
            phoneNumber()
            scenarioLanguage()
            scenarioType()
            tags()
            testProfile()
            testProfileData().ifPresent { it.validate() }
            toolIds()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (agent.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (dynamicVariableValues.asKnown().getOrNull()?.validity() ?: 0) +
                (if (expectedOutcomePrompt.asKnown().isPresent) 1 else 0) +
                (if (firstMessage.asKnown().isPresent) 1 else 0) +
                (if (folderPath.asKnown().isPresent) 1 else 0) +
                (if (inboundPhoneNumber.asKnown().isPresent) 1 else 0) +
                (if (inboundPhoneNumberData.asKnown().isPresent) 1 else 0) +
                (if (instructions.asKnown().isPresent) 1 else 0) +
                (if (lastUpdatedBy.asKnown().isPresent) 1 else 0) +
                (metricNames.asKnown().getOrNull()?.size ?: 0) +
                (metrics.asKnown().getOrNull()?.size ?: 0) +
                (if (personality.asKnown().isPresent) 1 else 0) +
                (if (personalityName.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (scenarioLanguage.asKnown().isPresent) 1 else 0) +
                (if (scenarioType.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (testProfile.asKnown().isPresent) 1 else 0) +
                (testProfileData.asKnown().getOrNull()?.validity() ?: 0) +
                (toolIds.asKnown().getOrNull()?.size ?: 0)

        class DynamicVariableValues
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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [DynamicVariableValues].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DynamicVariableValues]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dynamicVariableValues: DynamicVariableValues) = apply {
                    additionalProperties = dynamicVariableValues.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [DynamicVariableValues].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DynamicVariableValues =
                    DynamicVariableValues(additionalProperties.toImmutable())
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
            fun validate(): DynamicVariableValues = apply {
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

                return other is DynamicVariableValues &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DynamicVariableValues{additionalProperties=$additionalProperties}"
        }

        class TestProfileData
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<Long>,
            private val agent: JsonField<Long>,
            private val information: JsonField<Information>,
            private val name: JsonField<String>,
            private val project: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("agent") @ExcludeMissing agent: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("information")
                @ExcludeMissing
                information: JsonField<Information> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("project") @ExcludeMissing project: JsonField<Long> = JsonMissing.of(),
            ) : this(id, agent, information, name, project, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<Long> = id.getOptional("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun agent(): Optional<Long> = agent.getOptional("agent")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun information(): Optional<Information> = information.getOptional("information")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun project(): Optional<Long> = project.getOptional("project")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

            /**
             * Returns the raw JSON value of [agent].
             *
             * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("agent") @ExcludeMissing fun _agent(): JsonField<Long> = agent

            /**
             * Returns the raw JSON value of [information].
             *
             * Unlike [information], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("information")
            @ExcludeMissing
            fun _information(): JsonField<Information> = information

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [project].
             *
             * Unlike [project], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("project") @ExcludeMissing fun _project(): JsonField<Long> = project

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

                /** Returns a mutable builder for constructing an instance of [TestProfileData]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TestProfileData]. */
            class Builder internal constructor() {

                private var id: JsonField<Long> = JsonMissing.of()
                private var agent: JsonField<Long> = JsonMissing.of()
                private var information: JsonField<Information> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var project: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(testProfileData: TestProfileData) = apply {
                    id = testProfileData.id
                    agent = testProfileData.agent
                    information = testProfileData.information
                    name = testProfileData.name
                    project = testProfileData.project
                    additionalProperties = testProfileData.additionalProperties.toMutableMap()
                }

                fun id(id: Long) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun id(id: JsonField<Long>) = apply { this.id = id }

                fun agent(agent: Long?) = agent(JsonField.ofNullable(agent))

                /**
                 * Alias for [Builder.agent].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun agent(agent: Long) = agent(agent as Long?)

                /** Alias for calling [Builder.agent] with `agent.orElse(null)`. */
                fun agent(agent: Optional<Long>) = agent(agent.getOrNull())

                /**
                 * Sets [Builder.agent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.agent] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun agent(agent: JsonField<Long>) = apply { this.agent = agent }

                fun information(information: Information?) =
                    information(JsonField.ofNullable(information))

                /** Alias for calling [Builder.information] with `information.orElse(null)`. */
                fun information(information: Optional<Information>) =
                    information(information.getOrNull())

                /**
                 * Sets [Builder.information] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.information] with a well-typed [Information]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun information(information: JsonField<Information>) = apply {
                    this.information = information
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * You should usually call [Builder.project] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun project(project: JsonField<Long>) = apply { this.project = project }

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
                 * Returns an immutable instance of [TestProfileData].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TestProfileData =
                    TestProfileData(
                        id,
                        agent,
                        information,
                        name,
                        project,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): TestProfileData = apply {
                if (validated) {
                    return@apply
                }

                id()
                agent()
                information().ifPresent { it.validate() }
                name()
                project()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (agent.asKnown().isPresent) 1 else 0) +
                    (information.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (project.asKnown().isPresent) 1 else 0)

            class Information
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

                    /** Returns a mutable builder for constructing an instance of [Information]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Information]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(information: Information) = apply {
                        additionalProperties = information.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Information].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Information = Information(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Information = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Information &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Information{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TestProfileData &&
                    id == other.id &&
                    agent == other.agent &&
                    information == other.information &&
                    name == other.name &&
                    project == other.project &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, agent, information, name, project, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TestProfileData{id=$id, agent=$agent, information=$information, name=$name, project=$project, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                id == other.id &&
                agent == other.agent &&
                createdAt == other.createdAt &&
                name == other.name &&
                updatedAt == other.updatedAt &&
                dynamicVariableValues == other.dynamicVariableValues &&
                expectedOutcomePrompt == other.expectedOutcomePrompt &&
                firstMessage == other.firstMessage &&
                folderPath == other.folderPath &&
                inboundPhoneNumber == other.inboundPhoneNumber &&
                inboundPhoneNumberData == other.inboundPhoneNumberData &&
                instructions == other.instructions &&
                lastUpdatedBy == other.lastUpdatedBy &&
                metricNames == other.metricNames &&
                metrics == other.metrics &&
                personality == other.personality &&
                personalityName == other.personalityName &&
                phoneNumber == other.phoneNumber &&
                scenarioLanguage == other.scenarioLanguage &&
                scenarioType == other.scenarioType &&
                tags == other.tags &&
                testProfile == other.testProfile &&
                testProfileData == other.testProfileData &&
                toolIds == other.toolIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                agent,
                createdAt,
                name,
                updatedAt,
                dynamicVariableValues,
                expectedOutcomePrompt,
                firstMessage,
                folderPath,
                inboundPhoneNumber,
                inboundPhoneNumberData,
                instructions,
                lastUpdatedBy,
                metricNames,
                metrics,
                personality,
                personalityName,
                phoneNumber,
                scenarioLanguage,
                scenarioType,
                tags,
                testProfile,
                testProfileData,
                toolIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{id=$id, agent=$agent, createdAt=$createdAt, name=$name, updatedAt=$updatedAt, dynamicVariableValues=$dynamicVariableValues, expectedOutcomePrompt=$expectedOutcomePrompt, firstMessage=$firstMessage, folderPath=$folderPath, inboundPhoneNumber=$inboundPhoneNumber, inboundPhoneNumberData=$inboundPhoneNumberData, instructions=$instructions, lastUpdatedBy=$lastUpdatedBy, metricNames=$metricNames, metrics=$metrics, personality=$personality, personalityName=$personalityName, phoneNumber=$phoneNumber, scenarioLanguage=$scenarioLanguage, scenarioType=$scenarioType, tags=$tags, testProfile=$testProfile, testProfileData=$testProfileData, toolIds=$toolIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScenarioListResponse &&
            count == other.count &&
            next == other.next &&
            previous == other.previous &&
            results == other.results &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(count, next, previous, results, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScenarioListResponse{count=$count, next=$next, previous=$previous, results=$results, additionalProperties=$additionalProperties}"
}
