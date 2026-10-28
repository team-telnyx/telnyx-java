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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ScheduledTestJob
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val agent: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val crontabExpression: JsonField<String>,
    private val isActive: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val executionMode: JsonField<String>,
    private val frequency: JsonField<Long>,
    private val notifyOn: JsonField<NotifyOn>,
    private val personalities: JsonField<List<Long>>,
    private val personality: JsonField<Long>,
    private val runAsText: JsonField<Boolean>,
    private val scenarioIds: JsonField<List<Long>>,
    private val scenariosData: JsonField<List<ScenariosData>>,
    private val tags: JsonField<List<String>>,
    private val timezone: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("agent") @ExcludeMissing agent: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("crontab_expression")
        @ExcludeMissing
        crontabExpression: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_active") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("execution_mode")
        @ExcludeMissing
        executionMode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("frequency") @ExcludeMissing frequency: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("notify_on") @ExcludeMissing notifyOn: JsonField<NotifyOn> = JsonMissing.of(),
        @JsonProperty("personalities")
        @ExcludeMissing
        personalities: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("personality")
        @ExcludeMissing
        personality: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("run_as_text")
        @ExcludeMissing
        runAsText: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("scenario_ids")
        @ExcludeMissing
        scenarioIds: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("scenarios_data")
        @ExcludeMissing
        scenariosData: JsonField<List<ScenariosData>> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        agent,
        createdAt,
        crontabExpression,
        isActive,
        name,
        updatedAt,
        executionMode,
        frequency,
        notifyOn,
        personalities,
        personality,
        runAsText,
        scenarioIds,
        scenariosData,
        tags,
        timezone,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Long = id.getRequired("id")

    /**
     * ID of the test agent the job belongs to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agent(): Long = agent.getRequired("agent")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Cron expression controlling when the job runs, in the job's timezone.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun crontabExpression(): String = crontabExpression.getRequired("crontab_expression")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isActive(): Boolean = isActive.getRequired("is_active")

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
     * When the job sends a notification.
     *
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
    fun personality(): Optional<Long> = personality.getOptional("personality")

    /**
     * Whether the job runs scenarios as text chat rather than voice calls.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runAsText(): Optional<Boolean> = runAsText.getOptional("run_as_text")

    /**
     * Scenario IDs the job executes.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scenarioIds(): Optional<List<Long>> = scenarioIds.getOptional("scenario_ids")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scenariosData(): Optional<List<ScenariosData>> = scenariosData.getOptional("scenarios_data")

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
     * Returns the raw JSON value of [crontabExpression].
     *
     * Unlike [crontabExpression], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("crontab_expression")
    @ExcludeMissing
    fun _crontabExpression(): JsonField<String> = crontabExpression

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
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [executionMode].
     *
     * Unlike [executionMode], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [notifyOn].
     *
     * Unlike [notifyOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notify_on") @ExcludeMissing fun _notifyOn(): JsonField<NotifyOn> = notifyOn

    /**
     * Returns the raw JSON value of [personalities].
     *
     * Unlike [personalities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("personalities")
    @ExcludeMissing
    fun _personalities(): JsonField<List<Long>> = personalities

    /**
     * Returns the raw JSON value of [personality].
     *
     * Unlike [personality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("personality") @ExcludeMissing fun _personality(): JsonField<Long> = personality

    /**
     * Returns the raw JSON value of [runAsText].
     *
     * Unlike [runAsText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_as_text") @ExcludeMissing fun _runAsText(): JsonField<Boolean> = runAsText

    /**
     * Returns the raw JSON value of [scenarioIds].
     *
     * Unlike [scenarioIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scenario_ids")
    @ExcludeMissing
    fun _scenarioIds(): JsonField<List<Long>> = scenarioIds

    /**
     * Returns the raw JSON value of [scenariosData].
     *
     * Unlike [scenariosData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scenarios_data")
    @ExcludeMissing
    fun _scenariosData(): JsonField<List<ScenariosData>> = scenariosData

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

        /**
         * Returns a mutable builder for constructing an instance of [ScheduledTestJob].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .agent()
         * .createdAt()
         * .crontabExpression()
         * .isActive()
         * .name()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScheduledTestJob]. */
    class Builder internal constructor() {

        private var id: JsonField<Long>? = null
        private var agent: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var crontabExpression: JsonField<String>? = null
        private var isActive: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var executionMode: JsonField<String> = JsonMissing.of()
        private var frequency: JsonField<Long> = JsonMissing.of()
        private var notifyOn: JsonField<NotifyOn> = JsonMissing.of()
        private var personalities: JsonField<MutableList<Long>>? = null
        private var personality: JsonField<Long> = JsonMissing.of()
        private var runAsText: JsonField<Boolean> = JsonMissing.of()
        private var scenarioIds: JsonField<MutableList<Long>>? = null
        private var scenariosData: JsonField<MutableList<ScenariosData>>? = null
        private var tags: JsonField<MutableList<String>>? = null
        private var timezone: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scheduledTestJob: ScheduledTestJob) = apply {
            id = scheduledTestJob.id
            agent = scheduledTestJob.agent
            createdAt = scheduledTestJob.createdAt
            crontabExpression = scheduledTestJob.crontabExpression
            isActive = scheduledTestJob.isActive
            name = scheduledTestJob.name
            updatedAt = scheduledTestJob.updatedAt
            executionMode = scheduledTestJob.executionMode
            frequency = scheduledTestJob.frequency
            notifyOn = scheduledTestJob.notifyOn
            personalities = scheduledTestJob.personalities.map { it.toMutableList() }
            personality = scheduledTestJob.personality
            runAsText = scheduledTestJob.runAsText
            scenarioIds = scheduledTestJob.scenarioIds.map { it.toMutableList() }
            scenariosData = scheduledTestJob.scenariosData.map { it.toMutableList() }
            tags = scheduledTestJob.tags.map { it.toMutableList() }
            timezone = scheduledTestJob.timezone
            additionalProperties = scheduledTestJob.additionalProperties.toMutableMap()
        }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        /** ID of the test agent the job belongs to. */
        fun agent(agent: Long) = agent(JsonField.of(agent))

        /**
         * Sets [Builder.agent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agent] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Cron expression controlling when the job runs, in the job's timezone. */
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

        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Execution mode for the test runs, such as voice, text, or sip. */
        fun executionMode(executionMode: String) = executionMode(JsonField.of(executionMode))

        /**
         * Sets [Builder.executionMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionMode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun executionMode(executionMode: JsonField<String>) = apply {
            this.executionMode = executionMode
        }

        fun frequency(frequency: Long) = frequency(JsonField.of(frequency))

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun frequency(frequency: JsonField<Long>) = apply { this.frequency = frequency }

        /** When the job sends a notification. */
        fun notifyOn(notifyOn: NotifyOn) = notifyOn(JsonField.of(notifyOn))

        /**
         * Sets [Builder.notifyOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notifyOn] with a well-typed [NotifyOn] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun notifyOn(notifyOn: JsonField<NotifyOn>) = apply { this.notifyOn = notifyOn }

        fun personalities(personalities: List<Long>) = personalities(JsonField.of(personalities))

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
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun personality(personality: JsonField<Long>) = apply { this.personality = personality }

        /** Whether the job runs scenarios as text chat rather than voice calls. */
        fun runAsText(runAsText: Boolean) = runAsText(JsonField.of(runAsText))

        /**
         * Sets [Builder.runAsText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runAsText] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runAsText(runAsText: JsonField<Boolean>) = apply { this.runAsText = runAsText }

        /** Scenario IDs the job executes. */
        fun scenarioIds(scenarioIds: List<Long>) = scenarioIds(JsonField.of(scenarioIds))

        /**
         * Sets [Builder.scenarioIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scenarioIds] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scenarioIds(scenarioIds: JsonField<List<Long>>) = apply {
            this.scenarioIds = scenarioIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [scenarioIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScenarioId(scenarioId: Long) = apply {
            scenarioIds =
                (scenarioIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scenarioIds", it).add(scenarioId)
                }
        }

        fun scenariosData(scenariosData: List<ScenariosData>) =
            scenariosData(JsonField.of(scenariosData))

        /**
         * Sets [Builder.scenariosData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scenariosData] with a well-typed `List<ScenariosData>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun scenariosData(scenariosData: JsonField<List<ScenariosData>>) = apply {
            this.scenariosData = scenariosData.map { it.toMutableList() }
        }

        /**
         * Adds a single [ScenariosData] to [Builder.scenariosData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScenariosData(scenariosData: ScenariosData) = apply {
            this.scenariosData =
                (this.scenariosData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scenariosData", it).add(scenariosData)
                }
        }

        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [ScheduledTestJob].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .agent()
         * .createdAt()
         * .crontabExpression()
         * .isActive()
         * .name()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScheduledTestJob =
            ScheduledTestJob(
                checkRequired("id", id),
                checkRequired("agent", agent),
                checkRequired("createdAt", createdAt),
                checkRequired("crontabExpression", crontabExpression),
                checkRequired("isActive", isActive),
                checkRequired("name", name),
                checkRequired("updatedAt", updatedAt),
                executionMode,
                frequency,
                notifyOn,
                (personalities ?: JsonMissing.of()).map { it.toImmutable() },
                personality,
                runAsText,
                (scenarioIds ?: JsonMissing.of()).map { it.toImmutable() },
                (scenariosData ?: JsonMissing.of()).map { it.toImmutable() },
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                timezone,
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
    fun validate(): ScheduledTestJob = apply {
        if (validated) {
            return@apply
        }

        id()
        agent()
        createdAt()
        crontabExpression()
        isActive()
        name()
        updatedAt()
        executionMode()
        frequency()
        notifyOn().ifPresent { it.validate() }
        personalities()
        personality()
        runAsText()
        scenarioIds()
        scenariosData().ifPresent { it.forEach { it.validate() } }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (agent.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (crontabExpression.asKnown().isPresent) 1 else 0) +
            (if (isActive.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (executionMode.asKnown().isPresent) 1 else 0) +
            (if (frequency.asKnown().isPresent) 1 else 0) +
            (notifyOn.asKnown().getOrNull()?.validity() ?: 0) +
            (personalities.asKnown().getOrNull()?.size ?: 0) +
            (if (personality.asKnown().isPresent) 1 else 0) +
            (if (runAsText.asKnown().isPresent) 1 else 0) +
            (scenarioIds.asKnown().getOrNull()?.size ?: 0) +
            (scenariosData.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (timezone.asKnown().isPresent) 1 else 0)

    /** When the job sends a notification. */
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

    class ScenariosData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Long>,
        private val agent: JsonField<Long>,
        private val name: JsonField<String>,
        private val personality: JsonField<Long>,
        private val personalityName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("agent") @ExcludeMissing agent: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("personality")
            @ExcludeMissing
            personality: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("personality_name")
            @ExcludeMissing
            personalityName: JsonField<String> = JsonMissing.of(),
        ) : this(id, agent, name, personality, personalityName, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<Long> = id.getOptional("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agent(): Optional<Long> = agent.getOptional("agent")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [ScenariosData]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ScenariosData]. */
        class Builder internal constructor() {

            private var id: JsonField<Long> = JsonMissing.of()
            private var agent: JsonField<Long> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var personality: JsonField<Long> = JsonMissing.of()
            private var personalityName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scenariosData: ScenariosData) = apply {
                id = scenariosData.id
                agent = scenariosData.agent
                name = scenariosData.name
                personality = scenariosData.personality
                personalityName = scenariosData.personalityName
                additionalProperties = scenariosData.additionalProperties.toMutableMap()
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

            fun agent(agent: Long) = agent(JsonField.of(agent))

            /**
             * Sets [Builder.agent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agent] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun agent(agent: JsonField<Long>) = apply { this.agent = agent }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [ScenariosData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ScenariosData =
                ScenariosData(
                    id,
                    agent,
                    name,
                    personality,
                    personalityName,
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
        fun validate(): ScenariosData = apply {
            if (validated) {
                return@apply
            }

            id()
            agent()
            name()
            personality()
            personalityName()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (personality.asKnown().isPresent) 1 else 0) +
                (if (personalityName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ScenariosData &&
                id == other.id &&
                agent == other.agent &&
                name == other.name &&
                personality == other.personality &&
                personalityName == other.personalityName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, agent, name, personality, personalityName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScenariosData{id=$id, agent=$agent, name=$name, personality=$personality, personalityName=$personalityName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScheduledTestJob &&
            id == other.id &&
            agent == other.agent &&
            createdAt == other.createdAt &&
            crontabExpression == other.crontabExpression &&
            isActive == other.isActive &&
            name == other.name &&
            updatedAt == other.updatedAt &&
            executionMode == other.executionMode &&
            frequency == other.frequency &&
            notifyOn == other.notifyOn &&
            personalities == other.personalities &&
            personality == other.personality &&
            runAsText == other.runAsText &&
            scenarioIds == other.scenarioIds &&
            scenariosData == other.scenariosData &&
            tags == other.tags &&
            timezone == other.timezone &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            agent,
            createdAt,
            crontabExpression,
            isActive,
            name,
            updatedAt,
            executionMode,
            frequency,
            notifyOn,
            personalities,
            personality,
            runAsText,
            scenarioIds,
            scenariosData,
            tags,
            timezone,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScheduledTestJob{id=$id, agent=$agent, createdAt=$createdAt, crontabExpression=$crontabExpression, isActive=$isActive, name=$name, updatedAt=$updatedAt, executionMode=$executionMode, frequency=$frequency, notifyOn=$notifyOn, personalities=$personalities, personality=$personality, runAsText=$runAsText, scenarioIds=$scenarioIds, scenariosData=$scenariosData, tags=$tags, timezone=$timezone, additionalProperties=$additionalProperties}"
}
