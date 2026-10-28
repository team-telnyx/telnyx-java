// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
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

/** Updates the specified scheduled test job. */
class CronJobUpdateParams
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
    fun agent(): Optional<Long> = body.agent()

    /**
     * Cron expression controlling when the job runs.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun crontabExpression(): Optional<String> = body.crontabExpression()

    /**
     * Execution mode for the test runs, such as voice, text, or sip.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionMode(): Optional<String> = body.executionMode()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequency(): Optional<Long> = body.frequency()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = body.isActive()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notifyOn(): Optional<NotifyOn> = body.notifyOn()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun personalities(): Optional<List<Long>> = body.personalities()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runAsText(): Optional<Boolean> = body.runAsText()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scenarios(): Optional<List<Long>> = body.scenarios()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezone(): Optional<String> = body.timezone()

    /**
     * Returns the raw JSON value of [agent].
     *
     * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agent(): JsonField<Long> = body._agent()

    /**
     * Returns the raw JSON value of [crontabExpression].
     *
     * Unlike [crontabExpression], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _crontabExpression(): JsonField<String> = body._crontabExpression()

    /**
     * Returns the raw JSON value of [executionMode].
     *
     * Unlike [executionMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _executionMode(): JsonField<String> = body._executionMode()

    /**
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _frequency(): JsonField<Long> = body._frequency()

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isActive(): JsonField<Boolean> = body._isActive()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [notifyOn].
     *
     * Unlike [notifyOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _notifyOn(): JsonField<NotifyOn> = body._notifyOn()

    /**
     * Returns the raw JSON value of [personalities].
     *
     * Unlike [personalities], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _personalities(): JsonField<List<Long>> = body._personalities()

    /**
     * Returns the raw JSON value of [runAsText].
     *
     * Unlike [runAsText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _runAsText(): JsonField<Boolean> = body._runAsText()

    /**
     * Returns the raw JSON value of [scenarios].
     *
     * Unlike [scenarios], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scenarios(): JsonField<List<Long>> = body._scenarios()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timezone(): JsonField<String> = body._timezone()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CronJobUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CronJobUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CronJobUpdateParams]. */
    class Builder internal constructor() {

        private var id: Long? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cronJobUpdateParams: CronJobUpdateParams) = apply {
            id = cronJobUpdateParams.id
            body = cronJobUpdateParams.body.toBuilder()
            additionalHeaders = cronJobUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cronJobUpdateParams.additionalQueryParams.toBuilder()
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
         * - [agent]
         * - [crontabExpression]
         * - [executionMode]
         * - [frequency]
         * - [isActive]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun agent(agent: Long?) = apply { body.agent(agent) }

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
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agent(agent: JsonField<Long>) = apply { body.agent(agent) }

        /** Cron expression controlling when the job runs. */
        fun crontabExpression(crontabExpression: String) = apply {
            body.crontabExpression(crontabExpression)
        }

        /**
         * Sets [Builder.crontabExpression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.crontabExpression] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun crontabExpression(crontabExpression: JsonField<String>) = apply {
            body.crontabExpression(crontabExpression)
        }

        /** Execution mode for the test runs, such as voice, text, or sip. */
        fun executionMode(executionMode: String) = apply { body.executionMode(executionMode) }

        /**
         * Sets [Builder.executionMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionMode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun executionMode(executionMode: JsonField<String>) = apply {
            body.executionMode(executionMode)
        }

        fun frequency(frequency: Long) = apply { body.frequency(frequency) }

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun frequency(frequency: JsonField<Long>) = apply { body.frequency(frequency) }

        fun isActive(isActive: Boolean) = apply { body.isActive(isActive) }

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { body.isActive(isActive) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun notifyOn(notifyOn: NotifyOn) = apply { body.notifyOn(notifyOn) }

        /**
         * Sets [Builder.notifyOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notifyOn] with a well-typed [NotifyOn] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun notifyOn(notifyOn: JsonField<NotifyOn>) = apply { body.notifyOn(notifyOn) }

        fun personalities(personalities: List<Long>) = apply { body.personalities(personalities) }

        /**
         * Sets [Builder.personalities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.personalities] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun personalities(personalities: JsonField<List<Long>>) = apply {
            body.personalities(personalities)
        }

        /**
         * Adds a single [Long] to [personalities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPersonality(personality: Long) = apply { body.addPersonality(personality) }

        fun runAsText(runAsText: Boolean) = apply { body.runAsText(runAsText) }

        /**
         * Sets [Builder.runAsText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runAsText] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runAsText(runAsText: JsonField<Boolean>) = apply { body.runAsText(runAsText) }

        fun scenarios(scenarios: List<Long>) = apply { body.scenarios(scenarios) }

        /**
         * Sets [Builder.scenarios] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scenarios] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scenarios(scenarios: JsonField<List<Long>>) = apply { body.scenarios(scenarios) }

        /**
         * Adds a single [Long] to [scenarios].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScenario(scenario: Long) = apply { body.addScenario(scenario) }

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

        fun timezone(timezone: String) = apply { body.timezone(timezone) }

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { body.timezone(timezone) }

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
         * Returns an immutable instance of [CronJobUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CronJobUpdateParams =
            CronJobUpdateParams(
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
        private val agent: JsonField<Long>,
        private val crontabExpression: JsonField<String>,
        private val executionMode: JsonField<String>,
        private val frequency: JsonField<Long>,
        private val isActive: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val notifyOn: JsonField<NotifyOn>,
        private val personalities: JsonField<List<Long>>,
        private val runAsText: JsonField<Boolean>,
        private val scenarios: JsonField<List<Long>>,
        private val tags: JsonField<List<String>>,
        private val timezone: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agent") @ExcludeMissing agent: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("crontab_expression")
            @ExcludeMissing
            crontabExpression: JsonField<String> = JsonMissing.of(),
            @JsonProperty("execution_mode")
            @ExcludeMissing
            executionMode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("frequency")
            @ExcludeMissing
            frequency: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("is_active")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("notify_on")
            @ExcludeMissing
            notifyOn: JsonField<NotifyOn> = JsonMissing.of(),
            @JsonProperty("personalities")
            @ExcludeMissing
            personalities: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("run_as_text")
            @ExcludeMissing
            runAsText: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("scenarios")
            @ExcludeMissing
            scenarios: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        ) : this(
            agent,
            crontabExpression,
            executionMode,
            frequency,
            isActive,
            name,
            notifyOn,
            personalities,
            runAsText,
            scenarios,
            tags,
            timezone,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agent(): Optional<Long> = agent.getOptional("agent")

        /**
         * Cron expression controlling when the job runs.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun crontabExpression(): Optional<String> =
            crontabExpression.getOptional("crontab_expression")

        /**
         * Execution mode for the test runs, such as voice, text, or sip.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun executionMode(): Optional<String> = executionMode.getOptional("execution_mode")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun frequency(): Optional<Long> = frequency.getOptional("frequency")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isActive(): Optional<Boolean> = isActive.getOptional("is_active")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun notifyOn(): Optional<NotifyOn> = notifyOn.getOptional("notify_on")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun personalities(): Optional<List<Long>> = personalities.getOptional("personalities")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun runAsText(): Optional<Boolean> = runAsText.getOptional("run_as_text")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scenarios(): Optional<List<Long>> = scenarios.getOptional("scenarios")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timezone(): Optional<String> = timezone.getOptional("timezone")

        /**
         * Returns the raw JSON value of [agent].
         *
         * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent") @ExcludeMissing fun _agent(): JsonField<Long> = agent

        /**
         * Returns the raw JSON value of [crontabExpression].
         *
         * Unlike [crontabExpression], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("crontab_expression")
        @ExcludeMissing
        fun _crontabExpression(): JsonField<String> = crontabExpression

        /**
         * Returns the raw JSON value of [executionMode].
         *
         * Unlike [executionMode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("execution_mode")
        @ExcludeMissing
        fun _executionMode(): JsonField<String> = executionMode

        /**
         * Returns the raw JSON value of [frequency].
         *
         * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("frequency") @ExcludeMissing fun _frequency(): JsonField<Long> = frequency

        /**
         * Returns the raw JSON value of [isActive].
         *
         * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [notifyOn].
         *
         * Unlike [notifyOn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notify_on") @ExcludeMissing fun _notifyOn(): JsonField<NotifyOn> = notifyOn

        /**
         * Returns the raw JSON value of [personalities].
         *
         * Unlike [personalities], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("personalities")
        @ExcludeMissing
        fun _personalities(): JsonField<List<Long>> = personalities

        /**
         * Returns the raw JSON value of [runAsText].
         *
         * Unlike [runAsText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_as_text")
        @ExcludeMissing
        fun _runAsText(): JsonField<Boolean> = runAsText

        /**
         * Returns the raw JSON value of [scenarios].
         *
         * Unlike [scenarios], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scenarios")
        @ExcludeMissing
        fun _scenarios(): JsonField<List<Long>> = scenarios

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [timezone].
         *
         * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

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

            private var agent: JsonField<Long> = JsonMissing.of()
            private var crontabExpression: JsonField<String> = JsonMissing.of()
            private var executionMode: JsonField<String> = JsonMissing.of()
            private var frequency: JsonField<Long> = JsonMissing.of()
            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var notifyOn: JsonField<NotifyOn> = JsonMissing.of()
            private var personalities: JsonField<MutableList<Long>>? = null
            private var runAsText: JsonField<Boolean> = JsonMissing.of()
            private var scenarios: JsonField<MutableList<Long>>? = null
            private var tags: JsonField<MutableList<String>>? = null
            private var timezone: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                agent = body.agent
                crontabExpression = body.crontabExpression
                executionMode = body.executionMode
                frequency = body.frequency
                isActive = body.isActive
                name = body.name
                notifyOn = body.notifyOn
                personalities = body.personalities.map { it.toMutableList() }
                runAsText = body.runAsText
                scenarios = body.scenarios.map { it.toMutableList() }
                tags = body.tags.map { it.toMutableList() }
                timezone = body.timezone
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            /** Cron expression controlling when the job runs. */
            fun crontabExpression(crontabExpression: String) =
                crontabExpression(JsonField.of(crontabExpression))

            /**
             * Sets [Builder.crontabExpression] to an arbitrary JSON value.
             *
             * You should usually call [Builder.crontabExpression] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun crontabExpression(crontabExpression: JsonField<String>) = apply {
                this.crontabExpression = crontabExpression
            }

            /** Execution mode for the test runs, such as voice, text, or sip. */
            fun executionMode(executionMode: String) = executionMode(JsonField.of(executionMode))

            /**
             * Sets [Builder.executionMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.executionMode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun executionMode(executionMode: JsonField<String>) = apply {
                this.executionMode = executionMode
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

            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun notifyOn(notifyOn: NotifyOn) = notifyOn(JsonField.of(notifyOn))

            /**
             * Sets [Builder.notifyOn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notifyOn] with a well-typed [NotifyOn] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notifyOn(notifyOn: JsonField<NotifyOn>) = apply { this.notifyOn = notifyOn }

            fun personalities(personalities: List<Long>) =
                personalities(JsonField.of(personalities))

            /**
             * Sets [Builder.personalities] to an arbitrary JSON value.
             *
             * You should usually call [Builder.personalities] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun personalities(personalities: JsonField<List<Long>>) = apply {
                this.personalities = personalities.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [personalities].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPersonality(personality: Long) = apply {
                personalities =
                    (personalities ?: JsonField.of(mutableListOf())).also {
                        checkKnown("personalities", it).add(personality)
                    }
            }

            fun runAsText(runAsText: Boolean) = runAsText(JsonField.of(runAsText))

            /**
             * Sets [Builder.runAsText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runAsText] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runAsText(runAsText: JsonField<Boolean>) = apply { this.runAsText = runAsText }

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

            fun timezone(timezone: String) = timezone(JsonField.of(timezone))

            /**
             * Sets [Builder.timezone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timezone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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
                    agent,
                    crontabExpression,
                    executionMode,
                    frequency,
                    isActive,
                    name,
                    notifyOn,
                    (personalities ?: JsonMissing.of()).map { it.toImmutable() },
                    runAsText,
                    (scenarios ?: JsonMissing.of()).map { it.toImmutable() },
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    timezone,
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

            agent()
            crontabExpression()
            executionMode()
            frequency()
            isActive()
            name()
            notifyOn().ifPresent { it.validate() }
            personalities()
            runAsText()
            scenarios()
            tags()
            timezone()
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
                (if (crontabExpression.asKnown().isPresent) 1 else 0) +
                (if (executionMode.asKnown().isPresent) 1 else 0) +
                (if (frequency.asKnown().isPresent) 1 else 0) +
                (if (isActive.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (notifyOn.asKnown().getOrNull()?.validity() ?: 0) +
                (personalities.asKnown().getOrNull()?.size ?: 0) +
                (if (runAsText.asKnown().isPresent) 1 else 0) +
                (scenarios.asKnown().getOrNull()?.size ?: 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (timezone.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                agent == other.agent &&
                crontabExpression == other.crontabExpression &&
                executionMode == other.executionMode &&
                frequency == other.frequency &&
                isActive == other.isActive &&
                name == other.name &&
                notifyOn == other.notifyOn &&
                personalities == other.personalities &&
                runAsText == other.runAsText &&
                scenarios == other.scenarios &&
                tags == other.tags &&
                timezone == other.timezone &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                agent,
                crontabExpression,
                executionMode,
                frequency,
                isActive,
                name,
                notifyOn,
                personalities,
                runAsText,
                scenarios,
                tags,
                timezone,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{agent=$agent, crontabExpression=$crontabExpression, executionMode=$executionMode, frequency=$frequency, isActive=$isActive, name=$name, notifyOn=$notifyOn, personalities=$personalities, runAsText=$runAsText, scenarios=$scenarios, tags=$tags, timezone=$timezone, additionalProperties=$additionalProperties}"
    }

    class NotifyOn @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NEVER = of("never")

            @JvmField val SUCCESS = of("success")

            @JvmField val FAILURE = of("failure")

            @JvmField val BOTH = of("both")

            @JvmStatic fun of(value: String) = NotifyOn(JsonField.of(value))
        }

        /** An enum containing [NotifyOn]'s known values. */
        enum class Known {
            NEVER,
            SUCCESS,
            FAILURE,
            BOTH,
        }

        /**
         * An enum containing [NotifyOn]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [NotifyOn] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NEVER,
            SUCCESS,
            FAILURE,
            BOTH,
            /** An enum member indicating that [NotifyOn] was instantiated with an unknown value. */
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
                NEVER -> Value.NEVER
                SUCCESS -> Value.SUCCESS
                FAILURE -> Value.FAILURE
                BOTH -> Value.BOTH
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
                NEVER -> Known.NEVER
                SUCCESS -> Known.SUCCESS
                FAILURE -> Known.FAILURE
                BOTH -> Known.BOTH
                else -> throw TelnyxInvalidDataException("Unknown NotifyOn: $value")
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
        fun validate(): NotifyOn = apply {
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

            return other is NotifyOn && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CronJobUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CronJobUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
