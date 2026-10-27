// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

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
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Runs the selected evaluator scenarios against their test agents and creates a run batch. Returns
 * the ID of the created batch, whose results can be listed with the test-run-results endpoints.
 */
class ScenarioRunScenariosParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agentId(): Optional<Long> = body.agentId()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agentNumber(): Optional<String> = body.agentNumber()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assistantId(): Optional<String> = body.assistantId()

    /**
     * Maximum number of concurrent simulated calls.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun concurrencyLimit(): Optional<Long> = body.concurrencyLimit()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequency(): Optional<Long> = body.frequency()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mode(): Optional<Mode> = body.mode()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outboundPhoneNumber(): Optional<String> = body.outboundPhoneNumber()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun personalityIds(): Optional<List<Long>> = body.personalityIds()

    /**
     * Scenario IDs to run, or the literal string 'all'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scenarios(): Optional<Scenarios> = body.scenarios()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun testProfileIds(): Optional<List<Long>> = body.testProfileIds()

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agentId(): JsonField<Long> = body._agentId()

    /**
     * Returns the raw JSON value of [agentNumber].
     *
     * Unlike [agentNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agentNumber(): JsonField<String> = body._agentNumber()

    /**
     * Returns the raw JSON value of [assistantId].
     *
     * Unlike [assistantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assistantId(): JsonField<String> = body._assistantId()

    /**
     * Returns the raw JSON value of [concurrencyLimit].
     *
     * Unlike [concurrencyLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _concurrencyLimit(): JsonField<Long> = body._concurrencyLimit()

    /**
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _frequency(): JsonField<Long> = body._frequency()

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mode(): JsonField<Mode> = body._mode()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [outboundPhoneNumber].
     *
     * Unlike [outboundPhoneNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _outboundPhoneNumber(): JsonField<String> = body._outboundPhoneNumber()

    /**
     * Returns the raw JSON value of [personalityIds].
     *
     * Unlike [personalityIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _personalityIds(): JsonField<List<Long>> = body._personalityIds()

    /**
     * Returns the raw JSON value of [scenarios].
     *
     * Unlike [scenarios], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scenarios(): JsonField<Scenarios> = body._scenarios()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    /**
     * Returns the raw JSON value of [testProfileIds].
     *
     * Unlike [testProfileIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _testProfileIds(): JsonField<List<Long>> = body._testProfileIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ScenarioRunScenariosParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ScenarioRunScenariosParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScenarioRunScenariosParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(scenarioRunScenariosParams: ScenarioRunScenariosParams) = apply {
            body = scenarioRunScenariosParams.body.toBuilder()
            additionalHeaders = scenarioRunScenariosParams.additionalHeaders.toBuilder()
            additionalQueryParams = scenarioRunScenariosParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [agentId]
         * - [agentNumber]
         * - [assistantId]
         * - [concurrencyLimit]
         * - [frequency]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun agentId(agentId: Long) = apply { body.agentId(agentId) }

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<Long>) = apply { body.agentId(agentId) }

        fun agentNumber(agentNumber: String) = apply { body.agentNumber(agentNumber) }

        /**
         * Sets [Builder.agentNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agentNumber(agentNumber: JsonField<String>) = apply { body.agentNumber(agentNumber) }

        fun assistantId(assistantId: String) = apply { body.assistantId(assistantId) }

        /**
         * Sets [Builder.assistantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assistantId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assistantId(assistantId: JsonField<String>) = apply { body.assistantId(assistantId) }

        /** Maximum number of concurrent simulated calls. */
        fun concurrencyLimit(concurrencyLimit: Long) = apply {
            body.concurrencyLimit(concurrencyLimit)
        }

        /**
         * Sets [Builder.concurrencyLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.concurrencyLimit] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun concurrencyLimit(concurrencyLimit: JsonField<Long>) = apply {
            body.concurrencyLimit(concurrencyLimit)
        }

        fun frequency(frequency: Long) = apply { body.frequency(frequency) }

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun frequency(frequency: JsonField<Long>) = apply { body.frequency(frequency) }

        fun mode(mode: Mode) = apply { body.mode(mode) }

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<Mode>) = apply { body.mode(mode) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun outboundPhoneNumber(outboundPhoneNumber: String) = apply {
            body.outboundPhoneNumber(outboundPhoneNumber)
        }

        /**
         * Sets [Builder.outboundPhoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outboundPhoneNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outboundPhoneNumber(outboundPhoneNumber: JsonField<String>) = apply {
            body.outboundPhoneNumber(outboundPhoneNumber)
        }

        fun personalityIds(personalityIds: List<Long>) = apply {
            body.personalityIds(personalityIds)
        }

        /**
         * Sets [Builder.personalityIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.personalityIds] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun personalityIds(personalityIds: JsonField<List<Long>>) = apply {
            body.personalityIds(personalityIds)
        }

        /**
         * Adds a single [Long] to [personalityIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPersonalityId(personalityId: Long) = apply { body.addPersonalityId(personalityId) }

        /** Scenario IDs to run, or the literal string 'all'. */
        fun scenarios(scenarios: Scenarios) = apply { body.scenarios(scenarios) }

        /**
         * Sets [Builder.scenarios] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scenarios] with a well-typed [Scenarios] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scenarios(scenarios: JsonField<Scenarios>) = apply { body.scenarios(scenarios) }

        /** Alias for calling [scenarios] with `Scenarios.ofJsonValues(jsonValues)`. */
        fun scenariosOfJsonValues(jsonValues: List<JsonValue>) = apply {
            body.scenariosOfJsonValues(jsonValues)
        }

        /** Alias for calling [scenarios] with `Scenarios.ofString(string)`. */
        fun scenarios(string: String) = apply { body.scenarios(string) }

        fun tags(tags: List<String>) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

        fun testProfileIds(testProfileIds: List<Long>) = apply {
            body.testProfileIds(testProfileIds)
        }

        /**
         * Sets [Builder.testProfileIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testProfileIds] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun testProfileIds(testProfileIds: JsonField<List<Long>>) = apply {
            body.testProfileIds(testProfileIds)
        }

        /**
         * Adds a single [Long] to [testProfileIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTestProfileId(testProfileId: Long) = apply { body.addTestProfileId(testProfileId) }

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
         * Returns an immutable instance of [ScenarioRunScenariosParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ScenarioRunScenariosParams =
            ScenarioRunScenariosParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agentId: JsonField<Long>,
        private val agentNumber: JsonField<String>,
        private val assistantId: JsonField<String>,
        private val concurrencyLimit: JsonField<Long>,
        private val frequency: JsonField<Long>,
        private val mode: JsonField<Mode>,
        private val name: JsonField<String>,
        private val outboundPhoneNumber: JsonField<String>,
        private val personalityIds: JsonField<List<Long>>,
        private val scenarios: JsonField<Scenarios>,
        private val tags: JsonField<List<String>>,
        private val testProfileIds: JsonField<List<Long>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agent_id") @ExcludeMissing agentId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("agent_number")
            @ExcludeMissing
            agentNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("assistant_id")
            @ExcludeMissing
            assistantId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("concurrency_limit")
            @ExcludeMissing
            concurrencyLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("frequency")
            @ExcludeMissing
            frequency: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("outbound_phone_number")
            @ExcludeMissing
            outboundPhoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("personality_ids")
            @ExcludeMissing
            personalityIds: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("scenarios")
            @ExcludeMissing
            scenarios: JsonField<Scenarios> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("test_profile_ids")
            @ExcludeMissing
            testProfileIds: JsonField<List<Long>> = JsonMissing.of(),
        ) : this(
            agentId,
            agentNumber,
            assistantId,
            concurrencyLimit,
            frequency,
            mode,
            name,
            outboundPhoneNumber,
            personalityIds,
            scenarios,
            tags,
            testProfileIds,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentId(): Optional<Long> = agentId.getOptional("agent_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentNumber(): Optional<String> = agentNumber.getOptional("agent_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assistantId(): Optional<String> = assistantId.getOptional("assistant_id")

        /**
         * Maximum number of concurrent simulated calls.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun concurrencyLimit(): Optional<Long> = concurrencyLimit.getOptional("concurrency_limit")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun frequency(): Optional<Long> = frequency.getOptional("frequency")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mode(): Optional<Mode> = mode.getOptional("mode")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outboundPhoneNumber(): Optional<String> =
            outboundPhoneNumber.getOptional("outbound_phone_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun personalityIds(): Optional<List<Long>> = personalityIds.getOptional("personality_ids")

        /**
         * Scenario IDs to run, or the literal string 'all'.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scenarios(): Optional<Scenarios> = scenarios.getOptional("scenarios")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun testProfileIds(): Optional<List<Long>> = testProfileIds.getOptional("test_profile_ids")

        /**
         * Returns the raw JSON value of [agentId].
         *
         * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent_id") @ExcludeMissing fun _agentId(): JsonField<Long> = agentId

        /**
         * Returns the raw JSON value of [agentNumber].
         *
         * Unlike [agentNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent_number")
        @ExcludeMissing
        fun _agentNumber(): JsonField<String> = agentNumber

        /**
         * Returns the raw JSON value of [assistantId].
         *
         * Unlike [assistantId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assistant_id")
        @ExcludeMissing
        fun _assistantId(): JsonField<String> = assistantId

        /**
         * Returns the raw JSON value of [concurrencyLimit].
         *
         * Unlike [concurrencyLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("concurrency_limit")
        @ExcludeMissing
        fun _concurrencyLimit(): JsonField<Long> = concurrencyLimit

        /**
         * Returns the raw JSON value of [frequency].
         *
         * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("frequency") @ExcludeMissing fun _frequency(): JsonField<Long> = frequency

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [outboundPhoneNumber].
         *
         * Unlike [outboundPhoneNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("outbound_phone_number")
        @ExcludeMissing
        fun _outboundPhoneNumber(): JsonField<String> = outboundPhoneNumber

        /**
         * Returns the raw JSON value of [personalityIds].
         *
         * Unlike [personalityIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("personality_ids")
        @ExcludeMissing
        fun _personalityIds(): JsonField<List<Long>> = personalityIds

        /**
         * Returns the raw JSON value of [scenarios].
         *
         * Unlike [scenarios], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scenarios")
        @ExcludeMissing
        fun _scenarios(): JsonField<Scenarios> = scenarios

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [testProfileIds].
         *
         * Unlike [testProfileIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("test_profile_ids")
        @ExcludeMissing
        fun _testProfileIds(): JsonField<List<Long>> = testProfileIds

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

            private var agentId: JsonField<Long> = JsonMissing.of()
            private var agentNumber: JsonField<String> = JsonMissing.of()
            private var assistantId: JsonField<String> = JsonMissing.of()
            private var concurrencyLimit: JsonField<Long> = JsonMissing.of()
            private var frequency: JsonField<Long> = JsonMissing.of()
            private var mode: JsonField<Mode> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var outboundPhoneNumber: JsonField<String> = JsonMissing.of()
            private var personalityIds: JsonField<MutableList<Long>>? = null
            private var scenarios: JsonField<Scenarios> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var testProfileIds: JsonField<MutableList<Long>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                agentId = body.agentId
                agentNumber = body.agentNumber
                assistantId = body.assistantId
                concurrencyLimit = body.concurrencyLimit
                frequency = body.frequency
                mode = body.mode
                name = body.name
                outboundPhoneNumber = body.outboundPhoneNumber
                personalityIds = body.personalityIds.map { it.toMutableList() }
                scenarios = body.scenarios
                tags = body.tags.map { it.toMutableList() }
                testProfileIds = body.testProfileIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun agentId(agentId: Long) = agentId(JsonField.of(agentId))

            /**
             * Sets [Builder.agentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentId] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentId(agentId: JsonField<Long>) = apply { this.agentId = agentId }

            fun agentNumber(agentNumber: String) = agentNumber(JsonField.of(agentNumber))

            /**
             * Sets [Builder.agentNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentNumber(agentNumber: JsonField<String>) = apply {
                this.agentNumber = agentNumber
            }

            fun assistantId(assistantId: String) = assistantId(JsonField.of(assistantId))

            /**
             * Sets [Builder.assistantId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assistantId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assistantId(assistantId: JsonField<String>) = apply {
                this.assistantId = assistantId
            }

            /** Maximum number of concurrent simulated calls. */
            fun concurrencyLimit(concurrencyLimit: Long) =
                concurrencyLimit(JsonField.of(concurrencyLimit))

            /**
             * Sets [Builder.concurrencyLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.concurrencyLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun concurrencyLimit(concurrencyLimit: JsonField<Long>) = apply {
                this.concurrencyLimit = concurrencyLimit
            }

            fun frequency(frequency: Long) = frequency(JsonField.of(frequency))

            /**
             * Sets [Builder.frequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frequency] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frequency(frequency: JsonField<Long>) = apply { this.frequency = frequency }

            fun mode(mode: Mode) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun outboundPhoneNumber(outboundPhoneNumber: String) =
                outboundPhoneNumber(JsonField.of(outboundPhoneNumber))

            /**
             * Sets [Builder.outboundPhoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outboundPhoneNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun outboundPhoneNumber(outboundPhoneNumber: JsonField<String>) = apply {
                this.outboundPhoneNumber = outboundPhoneNumber
            }

            fun personalityIds(personalityIds: List<Long>) =
                personalityIds(JsonField.of(personalityIds))

            /**
             * Sets [Builder.personalityIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.personalityIds] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun personalityIds(personalityIds: JsonField<List<Long>>) = apply {
                this.personalityIds = personalityIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [personalityIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPersonalityId(personalityId: Long) = apply {
                personalityIds =
                    (personalityIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("personalityIds", it).add(personalityId)
                    }
            }

            /** Scenario IDs to run, or the literal string 'all'. */
            fun scenarios(scenarios: Scenarios) = scenarios(JsonField.of(scenarios))

            /**
             * Sets [Builder.scenarios] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scenarios] with a well-typed [Scenarios] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scenarios(scenarios: JsonField<Scenarios>) = apply { this.scenarios = scenarios }

            /** Alias for calling [scenarios] with `Scenarios.ofJsonValues(jsonValues)`. */
            fun scenariosOfJsonValues(jsonValues: List<JsonValue>) =
                scenarios(Scenarios.ofJsonValues(jsonValues))

            /** Alias for calling [scenarios] with `Scenarios.ofString(string)`. */
            fun scenarios(string: String) = scenarios(Scenarios.ofString(string))

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

            fun testProfileIds(testProfileIds: List<Long>) =
                testProfileIds(JsonField.of(testProfileIds))

            /**
             * Sets [Builder.testProfileIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.testProfileIds] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun testProfileIds(testProfileIds: JsonField<List<Long>>) = apply {
                this.testProfileIds = testProfileIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [testProfileIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTestProfileId(testProfileId: Long) = apply {
                testProfileIds =
                    (testProfileIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("testProfileIds", it).add(testProfileId)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    agentId,
                    agentNumber,
                    assistantId,
                    concurrencyLimit,
                    frequency,
                    mode,
                    name,
                    outboundPhoneNumber,
                    (personalityIds ?: JsonMissing.of()).map { it.toImmutable() },
                    scenarios,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    (testProfileIds ?: JsonMissing.of()).map { it.toImmutable() },
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

            agentId()
            agentNumber()
            assistantId()
            concurrencyLimit()
            frequency()
            mode().ifPresent { it.validate() }
            name()
            outboundPhoneNumber()
            personalityIds()
            scenarios().ifPresent { it.validate() }
            tags()
            testProfileIds()
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
            (if (agentId.asKnown().isPresent) 1 else 0) +
                (if (agentNumber.asKnown().isPresent) 1 else 0) +
                (if (assistantId.asKnown().isPresent) 1 else 0) +
                (if (concurrencyLimit.asKnown().isPresent) 1 else 0) +
                (if (frequency.asKnown().isPresent) 1 else 0) +
                (mode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (outboundPhoneNumber.asKnown().isPresent) 1 else 0) +
                (personalityIds.asKnown().getOrNull()?.size ?: 0) +
                (scenarios.asKnown().getOrNull()?.validity() ?: 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (testProfileIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                agentId == other.agentId &&
                agentNumber == other.agentNumber &&
                assistantId == other.assistantId &&
                concurrencyLimit == other.concurrencyLimit &&
                frequency == other.frequency &&
                mode == other.mode &&
                name == other.name &&
                outboundPhoneNumber == other.outboundPhoneNumber &&
                personalityIds == other.personalityIds &&
                scenarios == other.scenarios &&
                tags == other.tags &&
                testProfileIds == other.testProfileIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                agentId,
                agentNumber,
                assistantId,
                concurrencyLimit,
                frequency,
                mode,
                name,
                outboundPhoneNumber,
                personalityIds,
                scenarios,
                tags,
                testProfileIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{agentId=$agentId, agentNumber=$agentNumber, assistantId=$assistantId, concurrencyLimit=$concurrencyLimit, frequency=$frequency, mode=$mode, name=$name, outboundPhoneNumber=$outboundPhoneNumber, personalityIds=$personalityIds, scenarios=$scenarios, tags=$tags, testProfileIds=$testProfileIds, additionalProperties=$additionalProperties}"
    }

    class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SAME_NUMBER = of("same_number")

            @JvmField val DIFFERENT_NUMBERS = of("different_numbers")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            SAME_NUMBER,
            DIFFERENT_NUMBERS,
        }

        /**
         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SAME_NUMBER,
            DIFFERENT_NUMBERS,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                SAME_NUMBER -> Value.SAME_NUMBER
                DIFFERENT_NUMBERS -> Value.DIFFERENT_NUMBERS
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
                SAME_NUMBER -> Known.SAME_NUMBER
                DIFFERENT_NUMBERS -> Known.DIFFERENT_NUMBERS
                else -> throw TelnyxInvalidDataException("Unknown Mode: $value")
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

    /** Scenario IDs to run, or the literal string 'all'. */
    @JsonDeserialize(using = Scenarios.Deserializer::class)
    @JsonSerialize(using = Scenarios.Serializer::class)
    class Scenarios
    private constructor(
        private val jsonValues: List<JsonValue>? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Scenario IDs to run, or the literal string 'all'. */
        fun jsonValues(): Optional<List<JsonValue>> = Optional.ofNullable(jsonValues)

        /** Scenario IDs to run, or the literal string 'all'. */
        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isJsonValues(): Boolean = jsonValues != null

        fun isString(): Boolean = string != null

        /** Scenario IDs to run, or the literal string 'all'. */
        fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

        /** Scenario IDs to run, or the literal string 'all'. */
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
         * Optional<String> result = scenarios.accept(new Scenarios.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitJsonValues(List<JsonValue> jsonValues) {
         *         return Optional.of(jsonValues.toString());
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
                jsonValues != null -> visitor.visitJsonValues(jsonValues)
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
        fun validate(): Scenarios = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitJsonValues(jsonValues: List<JsonValue>) {}

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
                    override fun visitJsonValues(jsonValues: List<JsonValue>) = jsonValues.size

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Scenarios && jsonValues == other.jsonValues && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(jsonValues, string)

        override fun toString(): String =
            when {
                jsonValues != null -> "Scenarios{jsonValues=$jsonValues}"
                string != null -> "Scenarios{string=$string}"
                _json != null -> "Scenarios{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Scenarios")
            }

        companion object {

            /** Scenario IDs to run, or the literal string 'all'. */
            @JvmStatic
            fun ofJsonValues(jsonValues: List<JsonValue>) =
                Scenarios(jsonValues = jsonValues.toImmutable())

            /** Scenario IDs to run, or the literal string 'all'. */
            @JvmStatic fun ofString(string: String) = Scenarios(string = string)
        }

        /**
         * An interface that defines how to map each variant of [Scenarios] to a value of type [T].
         */
        interface Visitor<out T> {

            /** Scenario IDs to run, or the literal string 'all'. */
            fun visitJsonValues(jsonValues: List<JsonValue>): T

            /** Scenario IDs to run, or the literal string 'all'. */
            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [Scenarios] to a value of type [T].
             *
             * An instance of [Scenarios] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Scenarios: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Scenarios>(Scenarios::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Scenarios {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Scenarios(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                Scenarios(jsonValues = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Scenarios(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Scenarios>(Scenarios::class) {

            override fun serialize(
                value: Scenarios,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.jsonValues != null -> generator.writeObject(value.jsonValues)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Scenarios")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScenarioRunScenariosParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ScenarioRunScenariosParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
