// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AiTestMetric
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val evalType: JsonField<String>,
    private val name: JsonField<String>,
    private val type: JsonField<String>,
    private val addToNewAgents: JsonField<Boolean>,
    private val agent: JsonField<Long>,
    private val agentNames: JsonField<List<String>>,
    private val agents: JsonField<List<Long>>,
    private val alertFilters: JsonField<AlertFilters>,
    private val alertType: JsonField<String>,
    private val audioEnabled: JsonField<Boolean>,
    private val configuration: JsonField<Configuration>,
    private val description: JsonField<String>,
    private val displayOrder: JsonField<Long>,
    private val enumValues: JsonField<List<String>>,
    private val evaluationTrigger: JsonField<String>,
    private val evaluationTriggerCustomCode: JsonField<String>,
    private val evaluationTriggerPrompt: JsonField<String>,
    private val ewmaAlpha: JsonField<Double>,
    private val functionName: JsonField<String>,
    private val kbFileIds: JsonField<List<Long>>,
    private val knowledgeBaseFiles: JsonField<List<String>>,
    private val metricCost: JsonField<Double>,
    private val observabilityEnabled: JsonField<Boolean>,
    private val overallScore: JsonField<OverallScore>,
    private val priorityAssignmentPrompt: JsonField<String>,
    private val project: JsonField<Long>,
    private val prompt: JsonField<String>,
    private val sampleRate: JsonField<Double>,
    private val samplingEnabled: JsonField<Boolean>,
    private val significantChangeAlertDirection: JsonField<String>,
    private val significantChangeAlertStatus: JsonField<String>,
    private val simulationEnabled: JsonField<Boolean>,
    private val slug: JsonField<String>,
    private val stdMultiplier: JsonField<Double>,
    private val totalScore: JsonField<TotalScore>,
    private val triggerType: JsonField<String>,
    private val userDefined: JsonField<Boolean>,
    private val usesLlmJudge: JsonField<Boolean>,
    private val windowSize: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("eval_type") @ExcludeMissing evalType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("add_to_new_agents")
        @ExcludeMissing
        addToNewAgents: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("agent") @ExcludeMissing agent: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("agent_names")
        @ExcludeMissing
        agentNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("agents") @ExcludeMissing agents: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("alert_filters")
        @ExcludeMissing
        alertFilters: JsonField<AlertFilters> = JsonMissing.of(),
        @JsonProperty("alert_type") @ExcludeMissing alertType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("audio_enabled")
        @ExcludeMissing
        audioEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("configuration")
        @ExcludeMissing
        configuration: JsonField<Configuration> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("display_order")
        @ExcludeMissing
        displayOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("enum_values")
        @ExcludeMissing
        enumValues: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("evaluation_trigger")
        @ExcludeMissing
        evaluationTrigger: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluation_trigger_custom_code")
        @ExcludeMissing
        evaluationTriggerCustomCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluation_trigger_prompt")
        @ExcludeMissing
        evaluationTriggerPrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ewma_alpha") @ExcludeMissing ewmaAlpha: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("function_name")
        @ExcludeMissing
        functionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("kb_file_ids")
        @ExcludeMissing
        kbFileIds: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("knowledge_base_files")
        @ExcludeMissing
        knowledgeBaseFiles: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("metric_cost")
        @ExcludeMissing
        metricCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("observability_enabled")
        @ExcludeMissing
        observabilityEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("overall_score")
        @ExcludeMissing
        overallScore: JsonField<OverallScore> = JsonMissing.of(),
        @JsonProperty("priority_assignment_prompt")
        @ExcludeMissing
        priorityAssignmentPrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project") @ExcludeMissing project: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sample_rate")
        @ExcludeMissing
        sampleRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sampling_enabled")
        @ExcludeMissing
        samplingEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("significant_change_alert_direction")
        @ExcludeMissing
        significantChangeAlertDirection: JsonField<String> = JsonMissing.of(),
        @JsonProperty("significant_change_alert_status")
        @ExcludeMissing
        significantChangeAlertStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("simulation_enabled")
        @ExcludeMissing
        simulationEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("std_multiplier")
        @ExcludeMissing
        stdMultiplier: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("total_score")
        @ExcludeMissing
        totalScore: JsonField<TotalScore> = JsonMissing.of(),
        @JsonProperty("trigger_type")
        @ExcludeMissing
        triggerType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_defined")
        @ExcludeMissing
        userDefined: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("uses_llm_judge")
        @ExcludeMissing
        usesLlmJudge: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("window_size") @ExcludeMissing windowSize: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        evalType,
        name,
        type,
        addToNewAgents,
        agent,
        agentNames,
        agents,
        alertFilters,
        alertType,
        audioEnabled,
        configuration,
        description,
        displayOrder,
        enumValues,
        evaluationTrigger,
        evaluationTriggerCustomCode,
        evaluationTriggerPrompt,
        ewmaAlpha,
        functionName,
        kbFileIds,
        knowledgeBaseFiles,
        metricCost,
        observabilityEnabled,
        overallScore,
        priorityAssignmentPrompt,
        project,
        prompt,
        sampleRate,
        samplingEnabled,
        significantChangeAlertDirection,
        significantChangeAlertStatus,
        simulationEnabled,
        slug,
        stdMultiplier,
        totalScore,
        triggerType,
        userDefined,
        usesLlmJudge,
        windowSize,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Long = id.getRequired("id")

    /**
     * What the metric scores: numeric, continuous_qualitative, or binary_workflow_adherence.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun evalType(): String = evalType.getRequired("eval_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * How the metric is evaluated: custom_code or llm_judge.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Whether the metric is attached to newly created test agents by default.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addToNewAgents(): Optional<Boolean> = addToNewAgents.getOptional("add_to_new_agents")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agent(): Optional<Long> = agent.getOptional("agent")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agentNames(): Optional<List<String>> = agentNames.getOptional("agent_names")

    /**
     * Test agent IDs the metric is attached to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agents(): Optional<List<Long>> = agents.getOptional("agents")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alertFilters(): Optional<AlertFilters> = alertFilters.getOptional("alert_filters")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alertType(): Optional<String> = alertType.getOptional("alert_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioEnabled(): Optional<Boolean> = audioEnabled.getOptional("audio_enabled")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configuration(): Optional<Configuration> = configuration.getOptional("configuration")

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
     * Allowed values for qualitative enum metrics.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enumValues(): Optional<List<String>> = enumValues.getOptional("enum_values")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluationTrigger(): Optional<String> = evaluationTrigger.getOptional("evaluation_trigger")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluationTriggerCustomCode(): Optional<String> =
        evaluationTriggerCustomCode.getOptional("evaluation_trigger_custom_code")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluationTriggerPrompt(): Optional<String> =
        evaluationTriggerPrompt.getOptional("evaluation_trigger_prompt")

    /**
     * Smoothing factor for the alert trend.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ewmaAlpha(): Optional<Double> = ewmaAlpha.getOptional("ewma_alpha")

    /**
     * Built-in evaluation function used by custom_code metrics.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun functionName(): Optional<String> = functionName.getOptional("function_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun kbFileIds(): Optional<List<Long>> = kbFileIds.getOptional("kb_file_ids")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun knowledgeBaseFiles(): Optional<List<String>> =
        knowledgeBaseFiles.getOptional("knowledge_base_files")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metricCost(): Optional<Double> = metricCost.getOptional("metric_cost")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun observabilityEnabled(): Optional<Boolean> =
        observabilityEnabled.getOptional("observability_enabled")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overallScore(): Optional<OverallScore> = overallScore.getOptional("overall_score")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priorityAssignmentPrompt(): Optional<String> =
        priorityAssignmentPrompt.getOptional("priority_assignment_prompt")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun project(): Optional<Long> = project.getOptional("project")

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
    fun sampleRate(): Optional<Double> = sampleRate.getOptional("sample_rate")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun samplingEnabled(): Optional<Boolean> = samplingEnabled.getOptional("sampling_enabled")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun significantChangeAlertDirection(): Optional<String> =
        significantChangeAlertDirection.getOptional("significant_change_alert_direction")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun significantChangeAlertStatus(): Optional<String> =
        significantChangeAlertStatus.getOptional("significant_change_alert_status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun simulationEnabled(): Optional<Boolean> = simulationEnabled.getOptional("simulation_enabled")

    /**
     * Stable identifier of a built-in metric.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun slug(): Optional<String> = slug.getOptional("slug")

    /**
     * Standard-deviation multiplier for significant-change alerts.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stdMultiplier(): Optional<Double> = stdMultiplier.getOptional("std_multiplier")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalScore(): Optional<TotalScore> = totalScore.getOptional("total_score")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun triggerType(): Optional<String> = triggerType.getOptional("trigger_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userDefined(): Optional<Boolean> = userDefined.getOptional("user_defined")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usesLlmJudge(): Optional<Boolean> = usesLlmJudge.getOptional("uses_llm_judge")

    /**
     * Sliding window size the alert status is computed over.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun windowSize(): Optional<Long> = windowSize.getOptional("window_size")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

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
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [addToNewAgents].
     *
     * Unlike [addToNewAgents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("add_to_new_agents")
    @ExcludeMissing
    fun _addToNewAgents(): JsonField<Boolean> = addToNewAgents

    /**
     * Returns the raw JSON value of [agent].
     *
     * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent") @ExcludeMissing fun _agent(): JsonField<Long> = agent

    /**
     * Returns the raw JSON value of [agentNames].
     *
     * Unlike [agentNames], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_names")
    @ExcludeMissing
    fun _agentNames(): JsonField<List<String>> = agentNames

    /**
     * Returns the raw JSON value of [agents].
     *
     * Unlike [agents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agents") @ExcludeMissing fun _agents(): JsonField<List<Long>> = agents

    /**
     * Returns the raw JSON value of [alertFilters].
     *
     * Unlike [alertFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alert_filters")
    @ExcludeMissing
    fun _alertFilters(): JsonField<AlertFilters> = alertFilters

    /**
     * Returns the raw JSON value of [alertType].
     *
     * Unlike [alertType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alert_type") @ExcludeMissing fun _alertType(): JsonField<String> = alertType

    /**
     * Returns the raw JSON value of [audioEnabled].
     *
     * Unlike [audioEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audio_enabled")
    @ExcludeMissing
    fun _audioEnabled(): JsonField<Boolean> = audioEnabled

    /**
     * Returns the raw JSON value of [configuration].
     *
     * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configuration")
    @ExcludeMissing
    fun _configuration(): JsonField<Configuration> = configuration

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
     * Returns the raw JSON value of [evaluationTrigger].
     *
     * Unlike [evaluationTrigger], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("evaluation_trigger")
    @ExcludeMissing
    fun _evaluationTrigger(): JsonField<String> = evaluationTrigger

    /**
     * Returns the raw JSON value of [evaluationTriggerCustomCode].
     *
     * Unlike [evaluationTriggerCustomCode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("evaluation_trigger_custom_code")
    @ExcludeMissing
    fun _evaluationTriggerCustomCode(): JsonField<String> = evaluationTriggerCustomCode

    /**
     * Returns the raw JSON value of [evaluationTriggerPrompt].
     *
     * Unlike [evaluationTriggerPrompt], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("evaluation_trigger_prompt")
    @ExcludeMissing
    fun _evaluationTriggerPrompt(): JsonField<String> = evaluationTriggerPrompt

    /**
     * Returns the raw JSON value of [ewmaAlpha].
     *
     * Unlike [ewmaAlpha], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ewma_alpha") @ExcludeMissing fun _ewmaAlpha(): JsonField<Double> = ewmaAlpha

    /**
     * Returns the raw JSON value of [functionName].
     *
     * Unlike [functionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("function_name")
    @ExcludeMissing
    fun _functionName(): JsonField<String> = functionName

    /**
     * Returns the raw JSON value of [kbFileIds].
     *
     * Unlike [kbFileIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kb_file_ids") @ExcludeMissing fun _kbFileIds(): JsonField<List<Long>> = kbFileIds

    /**
     * Returns the raw JSON value of [knowledgeBaseFiles].
     *
     * Unlike [knowledgeBaseFiles], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("knowledge_base_files")
    @ExcludeMissing
    fun _knowledgeBaseFiles(): JsonField<List<String>> = knowledgeBaseFiles

    /**
     * Returns the raw JSON value of [metricCost].
     *
     * Unlike [metricCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metric_cost") @ExcludeMissing fun _metricCost(): JsonField<Double> = metricCost

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
     * Returns the raw JSON value of [overallScore].
     *
     * Unlike [overallScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overall_score")
    @ExcludeMissing
    fun _overallScore(): JsonField<OverallScore> = overallScore

    /**
     * Returns the raw JSON value of [priorityAssignmentPrompt].
     *
     * Unlike [priorityAssignmentPrompt], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("priority_assignment_prompt")
    @ExcludeMissing
    fun _priorityAssignmentPrompt(): JsonField<String> = priorityAssignmentPrompt

    /**
     * Returns the raw JSON value of [project].
     *
     * Unlike [project], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project") @ExcludeMissing fun _project(): JsonField<Long> = project

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

    /**
     * Returns the raw JSON value of [sampleRate].
     *
     * Unlike [sampleRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sample_rate") @ExcludeMissing fun _sampleRate(): JsonField<Double> = sampleRate

    /**
     * Returns the raw JSON value of [samplingEnabled].
     *
     * Unlike [samplingEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sampling_enabled")
    @ExcludeMissing
    fun _samplingEnabled(): JsonField<Boolean> = samplingEnabled

    /**
     * Returns the raw JSON value of [significantChangeAlertDirection].
     *
     * Unlike [significantChangeAlertDirection], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("significant_change_alert_direction")
    @ExcludeMissing
    fun _significantChangeAlertDirection(): JsonField<String> = significantChangeAlertDirection

    /**
     * Returns the raw JSON value of [significantChangeAlertStatus].
     *
     * Unlike [significantChangeAlertStatus], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("significant_change_alert_status")
    @ExcludeMissing
    fun _significantChangeAlertStatus(): JsonField<String> = significantChangeAlertStatus

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
     * Returns the raw JSON value of [slug].
     *
     * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

    /**
     * Returns the raw JSON value of [stdMultiplier].
     *
     * Unlike [stdMultiplier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("std_multiplier")
    @ExcludeMissing
    fun _stdMultiplier(): JsonField<Double> = stdMultiplier

    /**
     * Returns the raw JSON value of [totalScore].
     *
     * Unlike [totalScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_score")
    @ExcludeMissing
    fun _totalScore(): JsonField<TotalScore> = totalScore

    /**
     * Returns the raw JSON value of [triggerType].
     *
     * Unlike [triggerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trigger_type")
    @ExcludeMissing
    fun _triggerType(): JsonField<String> = triggerType

    /**
     * Returns the raw JSON value of [userDefined].
     *
     * Unlike [userDefined], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_defined")
    @ExcludeMissing
    fun _userDefined(): JsonField<Boolean> = userDefined

    /**
     * Returns the raw JSON value of [usesLlmJudge].
     *
     * Unlike [usesLlmJudge], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uses_llm_judge")
    @ExcludeMissing
    fun _usesLlmJudge(): JsonField<Boolean> = usesLlmJudge

    /**
     * Returns the raw JSON value of [windowSize].
     *
     * Unlike [windowSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("window_size") @ExcludeMissing fun _windowSize(): JsonField<Long> = windowSize

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
         * Returns a mutable builder for constructing an instance of [AiTestMetric].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .evalType()
         * .name()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AiTestMetric]. */
    class Builder internal constructor() {

        private var id: JsonField<Long>? = null
        private var evalType: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var addToNewAgents: JsonField<Boolean> = JsonMissing.of()
        private var agent: JsonField<Long> = JsonMissing.of()
        private var agentNames: JsonField<MutableList<String>>? = null
        private var agents: JsonField<MutableList<Long>>? = null
        private var alertFilters: JsonField<AlertFilters> = JsonMissing.of()
        private var alertType: JsonField<String> = JsonMissing.of()
        private var audioEnabled: JsonField<Boolean> = JsonMissing.of()
        private var configuration: JsonField<Configuration> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var displayOrder: JsonField<Long> = JsonMissing.of()
        private var enumValues: JsonField<MutableList<String>>? = null
        private var evaluationTrigger: JsonField<String> = JsonMissing.of()
        private var evaluationTriggerCustomCode: JsonField<String> = JsonMissing.of()
        private var evaluationTriggerPrompt: JsonField<String> = JsonMissing.of()
        private var ewmaAlpha: JsonField<Double> = JsonMissing.of()
        private var functionName: JsonField<String> = JsonMissing.of()
        private var kbFileIds: JsonField<MutableList<Long>>? = null
        private var knowledgeBaseFiles: JsonField<MutableList<String>>? = null
        private var metricCost: JsonField<Double> = JsonMissing.of()
        private var observabilityEnabled: JsonField<Boolean> = JsonMissing.of()
        private var overallScore: JsonField<OverallScore> = JsonMissing.of()
        private var priorityAssignmentPrompt: JsonField<String> = JsonMissing.of()
        private var project: JsonField<Long> = JsonMissing.of()
        private var prompt: JsonField<String> = JsonMissing.of()
        private var sampleRate: JsonField<Double> = JsonMissing.of()
        private var samplingEnabled: JsonField<Boolean> = JsonMissing.of()
        private var significantChangeAlertDirection: JsonField<String> = JsonMissing.of()
        private var significantChangeAlertStatus: JsonField<String> = JsonMissing.of()
        private var simulationEnabled: JsonField<Boolean> = JsonMissing.of()
        private var slug: JsonField<String> = JsonMissing.of()
        private var stdMultiplier: JsonField<Double> = JsonMissing.of()
        private var totalScore: JsonField<TotalScore> = JsonMissing.of()
        private var triggerType: JsonField<String> = JsonMissing.of()
        private var userDefined: JsonField<Boolean> = JsonMissing.of()
        private var usesLlmJudge: JsonField<Boolean> = JsonMissing.of()
        private var windowSize: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aiTestMetric: AiTestMetric) = apply {
            id = aiTestMetric.id
            evalType = aiTestMetric.evalType
            name = aiTestMetric.name
            type = aiTestMetric.type
            addToNewAgents = aiTestMetric.addToNewAgents
            agent = aiTestMetric.agent
            agentNames = aiTestMetric.agentNames.map { it.toMutableList() }
            agents = aiTestMetric.agents.map { it.toMutableList() }
            alertFilters = aiTestMetric.alertFilters
            alertType = aiTestMetric.alertType
            audioEnabled = aiTestMetric.audioEnabled
            configuration = aiTestMetric.configuration
            description = aiTestMetric.description
            displayOrder = aiTestMetric.displayOrder
            enumValues = aiTestMetric.enumValues.map { it.toMutableList() }
            evaluationTrigger = aiTestMetric.evaluationTrigger
            evaluationTriggerCustomCode = aiTestMetric.evaluationTriggerCustomCode
            evaluationTriggerPrompt = aiTestMetric.evaluationTriggerPrompt
            ewmaAlpha = aiTestMetric.ewmaAlpha
            functionName = aiTestMetric.functionName
            kbFileIds = aiTestMetric.kbFileIds.map { it.toMutableList() }
            knowledgeBaseFiles = aiTestMetric.knowledgeBaseFiles.map { it.toMutableList() }
            metricCost = aiTestMetric.metricCost
            observabilityEnabled = aiTestMetric.observabilityEnabled
            overallScore = aiTestMetric.overallScore
            priorityAssignmentPrompt = aiTestMetric.priorityAssignmentPrompt
            project = aiTestMetric.project
            prompt = aiTestMetric.prompt
            sampleRate = aiTestMetric.sampleRate
            samplingEnabled = aiTestMetric.samplingEnabled
            significantChangeAlertDirection = aiTestMetric.significantChangeAlertDirection
            significantChangeAlertStatus = aiTestMetric.significantChangeAlertStatus
            simulationEnabled = aiTestMetric.simulationEnabled
            slug = aiTestMetric.slug
            stdMultiplier = aiTestMetric.stdMultiplier
            totalScore = aiTestMetric.totalScore
            triggerType = aiTestMetric.triggerType
            userDefined = aiTestMetric.userDefined
            usesLlmJudge = aiTestMetric.usesLlmJudge
            windowSize = aiTestMetric.windowSize
            additionalProperties = aiTestMetric.additionalProperties.toMutableMap()
        }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

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

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** How the metric is evaluated: custom_code or llm_judge. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** Whether the metric is attached to newly created test agents by default. */
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
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agent(agent: JsonField<Long>) = apply { this.agent = agent }

        fun agentNames(agentNames: List<String>) = agentNames(JsonField.of(agentNames))

        /**
         * Sets [Builder.agentNames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentNames] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agentNames(agentNames: JsonField<List<String>>) = apply {
            this.agentNames = agentNames.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [agentNames].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAgentName(agentName: String) = apply {
            agentNames =
                (agentNames ?: JsonField.of(mutableListOf())).also {
                    checkKnown("agentNames", it).add(agentName)
                }
        }

        /** Test agent IDs the metric is attached to. */
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

        fun alertFilters(alertFilters: AlertFilters?) =
            alertFilters(JsonField.ofNullable(alertFilters))

        /** Alias for calling [Builder.alertFilters] with `alertFilters.orElse(null)`. */
        fun alertFilters(alertFilters: Optional<AlertFilters>) =
            alertFilters(alertFilters.getOrNull())

        /**
         * Sets [Builder.alertFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alertFilters] with a well-typed [AlertFilters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun alertFilters(alertFilters: JsonField<AlertFilters>) = apply {
            this.alertFilters = alertFilters
        }

        fun alertType(alertType: String) = alertType(JsonField.of(alertType))

        /**
         * Sets [Builder.alertType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alertType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun alertType(alertType: JsonField<String>) = apply { this.alertType = alertType }

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

        fun configuration(configuration: Configuration?) =
            configuration(JsonField.ofNullable(configuration))

        /** Alias for calling [Builder.configuration] with `configuration.orElse(null)`. */
        fun configuration(configuration: Optional<Configuration>) =
            configuration(configuration.getOrNull())

        /**
         * Sets [Builder.configuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configuration] with a well-typed [Configuration] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun configuration(configuration: JsonField<Configuration>) = apply {
            this.configuration = configuration
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

        /** Allowed values for qualitative enum metrics. */
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

        fun evaluationTrigger(evaluationTrigger: String) =
            evaluationTrigger(JsonField.of(evaluationTrigger))

        /**
         * Sets [Builder.evaluationTrigger] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluationTrigger] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluationTrigger(evaluationTrigger: JsonField<String>) = apply {
            this.evaluationTrigger = evaluationTrigger
        }

        fun evaluationTriggerCustomCode(evaluationTriggerCustomCode: String) =
            evaluationTriggerCustomCode(JsonField.of(evaluationTriggerCustomCode))

        /**
         * Sets [Builder.evaluationTriggerCustomCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluationTriggerCustomCode] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun evaluationTriggerCustomCode(evaluationTriggerCustomCode: JsonField<String>) = apply {
            this.evaluationTriggerCustomCode = evaluationTriggerCustomCode
        }

        fun evaluationTriggerPrompt(evaluationTriggerPrompt: String) =
            evaluationTriggerPrompt(JsonField.of(evaluationTriggerPrompt))

        /**
         * Sets [Builder.evaluationTriggerPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluationTriggerPrompt] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun evaluationTriggerPrompt(evaluationTriggerPrompt: JsonField<String>) = apply {
            this.evaluationTriggerPrompt = evaluationTriggerPrompt
        }

        /** Smoothing factor for the alert trend. */
        fun ewmaAlpha(ewmaAlpha: Double) = ewmaAlpha(JsonField.of(ewmaAlpha))

        /**
         * Sets [Builder.ewmaAlpha] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ewmaAlpha] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ewmaAlpha(ewmaAlpha: JsonField<Double>) = apply { this.ewmaAlpha = ewmaAlpha }

        /** Built-in evaluation function used by custom_code metrics. */
        fun functionName(functionName: String?) = functionName(JsonField.ofNullable(functionName))

        /** Alias for calling [Builder.functionName] with `functionName.orElse(null)`. */
        fun functionName(functionName: Optional<String>) = functionName(functionName.getOrNull())

        /**
         * Sets [Builder.functionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.functionName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun functionName(functionName: JsonField<String>) = apply {
            this.functionName = functionName
        }

        fun kbFileIds(kbFileIds: List<Long>) = kbFileIds(JsonField.of(kbFileIds))

        /**
         * Sets [Builder.kbFileIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kbFileIds] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun kbFileIds(kbFileIds: JsonField<List<Long>>) = apply {
            this.kbFileIds = kbFileIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [kbFileIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKbFileId(kbFileId: Long) = apply {
            kbFileIds =
                (kbFileIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("kbFileIds", it).add(kbFileId)
                }
        }

        fun knowledgeBaseFiles(knowledgeBaseFiles: List<String>) =
            knowledgeBaseFiles(JsonField.of(knowledgeBaseFiles))

        /**
         * Sets [Builder.knowledgeBaseFiles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.knowledgeBaseFiles] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun knowledgeBaseFiles(knowledgeBaseFiles: JsonField<List<String>>) = apply {
            this.knowledgeBaseFiles = knowledgeBaseFiles.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [knowledgeBaseFiles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKnowledgeBaseFile(knowledgeBaseFile: String) = apply {
            knowledgeBaseFiles =
                (knowledgeBaseFiles ?: JsonField.of(mutableListOf())).also {
                    checkKnown("knowledgeBaseFiles", it).add(knowledgeBaseFile)
                }
        }

        fun metricCost(metricCost: Double) = metricCost(JsonField.of(metricCost))

        /**
         * Sets [Builder.metricCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metricCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metricCost(metricCost: JsonField<Double>) = apply { this.metricCost = metricCost }

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

        fun overallScore(overallScore: OverallScore) = overallScore(JsonField.of(overallScore))

        /**
         * Sets [Builder.overallScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overallScore] with a well-typed [OverallScore] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun overallScore(overallScore: JsonField<OverallScore>) = apply {
            this.overallScore = overallScore
        }

        /** Alias for calling [overallScore] with `OverallScore.ofNumber(number)`. */
        fun overallScore(number: Double) = overallScore(OverallScore.ofNumber(number))

        /** Alias for calling [overallScore] with `OverallScore.ofString(string)`. */
        fun overallScore(string: String) = overallScore(OverallScore.ofString(string))

        fun priorityAssignmentPrompt(priorityAssignmentPrompt: String) =
            priorityAssignmentPrompt(JsonField.of(priorityAssignmentPrompt))

        /**
         * Sets [Builder.priorityAssignmentPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priorityAssignmentPrompt] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun priorityAssignmentPrompt(priorityAssignmentPrompt: JsonField<String>) = apply {
            this.priorityAssignmentPrompt = priorityAssignmentPrompt
        }

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

        /** Judge prompt used by llm_judge metrics. */
        fun prompt(prompt: String) = prompt(JsonField.of(prompt))

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

        fun sampleRate(sampleRate: Double?) = sampleRate(JsonField.ofNullable(sampleRate))

        /**
         * Alias for [Builder.sampleRate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sampleRate(sampleRate: Double) = sampleRate(sampleRate as Double?)

        /** Alias for calling [Builder.sampleRate] with `sampleRate.orElse(null)`. */
        fun sampleRate(sampleRate: Optional<Double>) = sampleRate(sampleRate.getOrNull())

        /**
         * Sets [Builder.sampleRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sampleRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sampleRate(sampleRate: JsonField<Double>) = apply { this.sampleRate = sampleRate }

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

        fun significantChangeAlertDirection(significantChangeAlertDirection: String) =
            significantChangeAlertDirection(JsonField.of(significantChangeAlertDirection))

        /**
         * Sets [Builder.significantChangeAlertDirection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.significantChangeAlertDirection] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun significantChangeAlertDirection(significantChangeAlertDirection: JsonField<String>) =
            apply {
                this.significantChangeAlertDirection = significantChangeAlertDirection
            }

        fun significantChangeAlertStatus(significantChangeAlertStatus: String) =
            significantChangeAlertStatus(JsonField.of(significantChangeAlertStatus))

        /**
         * Sets [Builder.significantChangeAlertStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.significantChangeAlertStatus] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun significantChangeAlertStatus(significantChangeAlertStatus: JsonField<String>) = apply {
            this.significantChangeAlertStatus = significantChangeAlertStatus
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

        /** Stable identifier of a built-in metric. */
        fun slug(slug: String?) = slug(JsonField.ofNullable(slug))

        /** Alias for calling [Builder.slug] with `slug.orElse(null)`. */
        fun slug(slug: Optional<String>) = slug(slug.getOrNull())

        /**
         * Sets [Builder.slug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slug(slug: JsonField<String>) = apply { this.slug = slug }

        /** Standard-deviation multiplier for significant-change alerts. */
        fun stdMultiplier(stdMultiplier: Double) = stdMultiplier(JsonField.of(stdMultiplier))

        /**
         * Sets [Builder.stdMultiplier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stdMultiplier] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stdMultiplier(stdMultiplier: JsonField<Double>) = apply {
            this.stdMultiplier = stdMultiplier
        }

        fun totalScore(totalScore: TotalScore) = totalScore(JsonField.of(totalScore))

        /**
         * Sets [Builder.totalScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalScore] with a well-typed [TotalScore] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalScore(totalScore: JsonField<TotalScore>) = apply { this.totalScore = totalScore }

        /** Alias for calling [totalScore] with `TotalScore.ofNumber(number)`. */
        fun totalScore(number: Double) = totalScore(TotalScore.ofNumber(number))

        /** Alias for calling [totalScore] with `TotalScore.ofString(string)`. */
        fun totalScore(string: String) = totalScore(TotalScore.ofString(string))

        fun triggerType(triggerType: String) = triggerType(JsonField.of(triggerType))

        /**
         * Sets [Builder.triggerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggerType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun triggerType(triggerType: JsonField<String>) = apply { this.triggerType = triggerType }

        fun userDefined(userDefined: Boolean) = userDefined(JsonField.of(userDefined))

        /**
         * Sets [Builder.userDefined] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userDefined] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userDefined(userDefined: JsonField<Boolean>) = apply { this.userDefined = userDefined }

        fun usesLlmJudge(usesLlmJudge: Boolean) = usesLlmJudge(JsonField.of(usesLlmJudge))

        /**
         * Sets [Builder.usesLlmJudge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usesLlmJudge] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun usesLlmJudge(usesLlmJudge: JsonField<Boolean>) = apply {
            this.usesLlmJudge = usesLlmJudge
        }

        /** Sliding window size the alert status is computed over. */
        fun windowSize(windowSize: Long) = windowSize(JsonField.of(windowSize))

        /**
         * Sets [Builder.windowSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.windowSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun windowSize(windowSize: JsonField<Long>) = apply { this.windowSize = windowSize }

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
         * Returns an immutable instance of [AiTestMetric].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .evalType()
         * .name()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AiTestMetric =
            AiTestMetric(
                checkRequired("id", id),
                checkRequired("evalType", evalType),
                checkRequired("name", name),
                checkRequired("type", type),
                addToNewAgents,
                agent,
                (agentNames ?: JsonMissing.of()).map { it.toImmutable() },
                (agents ?: JsonMissing.of()).map { it.toImmutable() },
                alertFilters,
                alertType,
                audioEnabled,
                configuration,
                description,
                displayOrder,
                (enumValues ?: JsonMissing.of()).map { it.toImmutable() },
                evaluationTrigger,
                evaluationTriggerCustomCode,
                evaluationTriggerPrompt,
                ewmaAlpha,
                functionName,
                (kbFileIds ?: JsonMissing.of()).map { it.toImmutable() },
                (knowledgeBaseFiles ?: JsonMissing.of()).map { it.toImmutable() },
                metricCost,
                observabilityEnabled,
                overallScore,
                priorityAssignmentPrompt,
                project,
                prompt,
                sampleRate,
                samplingEnabled,
                significantChangeAlertDirection,
                significantChangeAlertStatus,
                simulationEnabled,
                slug,
                stdMultiplier,
                totalScore,
                triggerType,
                userDefined,
                usesLlmJudge,
                windowSize,
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
    fun validate(): AiTestMetric = apply {
        if (validated) {
            return@apply
        }

        id()
        evalType()
        name()
        type()
        addToNewAgents()
        agent()
        agentNames()
        agents()
        alertFilters().ifPresent { it.validate() }
        alertType()
        audioEnabled()
        configuration().ifPresent { it.validate() }
        description()
        displayOrder()
        enumValues()
        evaluationTrigger()
        evaluationTriggerCustomCode()
        evaluationTriggerPrompt()
        ewmaAlpha()
        functionName()
        kbFileIds()
        knowledgeBaseFiles()
        metricCost()
        observabilityEnabled()
        overallScore().ifPresent { it.validate() }
        priorityAssignmentPrompt()
        project()
        prompt()
        sampleRate()
        samplingEnabled()
        significantChangeAlertDirection()
        significantChangeAlertStatus()
        simulationEnabled()
        slug()
        stdMultiplier()
        totalScore().ifPresent { it.validate() }
        triggerType()
        userDefined()
        usesLlmJudge()
        windowSize()
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
            (if (evalType.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (addToNewAgents.asKnown().isPresent) 1 else 0) +
            (if (agent.asKnown().isPresent) 1 else 0) +
            (agentNames.asKnown().getOrNull()?.size ?: 0) +
            (agents.asKnown().getOrNull()?.size ?: 0) +
            (alertFilters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (alertType.asKnown().isPresent) 1 else 0) +
            (if (audioEnabled.asKnown().isPresent) 1 else 0) +
            (configuration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (displayOrder.asKnown().isPresent) 1 else 0) +
            (enumValues.asKnown().getOrNull()?.size ?: 0) +
            (if (evaluationTrigger.asKnown().isPresent) 1 else 0) +
            (if (evaluationTriggerCustomCode.asKnown().isPresent) 1 else 0) +
            (if (evaluationTriggerPrompt.asKnown().isPresent) 1 else 0) +
            (if (ewmaAlpha.asKnown().isPresent) 1 else 0) +
            (if (functionName.asKnown().isPresent) 1 else 0) +
            (kbFileIds.asKnown().getOrNull()?.size ?: 0) +
            (knowledgeBaseFiles.asKnown().getOrNull()?.size ?: 0) +
            (if (metricCost.asKnown().isPresent) 1 else 0) +
            (if (observabilityEnabled.asKnown().isPresent) 1 else 0) +
            (overallScore.asKnown().getOrNull()?.validity() ?: 0) +
            (if (priorityAssignmentPrompt.asKnown().isPresent) 1 else 0) +
            (if (project.asKnown().isPresent) 1 else 0) +
            (if (prompt.asKnown().isPresent) 1 else 0) +
            (if (sampleRate.asKnown().isPresent) 1 else 0) +
            (if (samplingEnabled.asKnown().isPresent) 1 else 0) +
            (if (significantChangeAlertDirection.asKnown().isPresent) 1 else 0) +
            (if (significantChangeAlertStatus.asKnown().isPresent) 1 else 0) +
            (if (simulationEnabled.asKnown().isPresent) 1 else 0) +
            (if (slug.asKnown().isPresent) 1 else 0) +
            (if (stdMultiplier.asKnown().isPresent) 1 else 0) +
            (totalScore.asKnown().getOrNull()?.validity() ?: 0) +
            (if (triggerType.asKnown().isPresent) 1 else 0) +
            (if (userDefined.asKnown().isPresent) 1 else 0) +
            (if (usesLlmJudge.asKnown().isPresent) 1 else 0) +
            (if (windowSize.asKnown().isPresent) 1 else 0)

    class AlertFilters
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

            /** Returns a mutable builder for constructing an instance of [AlertFilters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AlertFilters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(alertFilters: AlertFilters) = apply {
                additionalProperties = alertFilters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [AlertFilters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AlertFilters = AlertFilters(additionalProperties.toImmutable())
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
        fun validate(): AlertFilters = apply {
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

            return other is AlertFilters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "AlertFilters{additionalProperties=$additionalProperties}"
    }

    class Configuration
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

            /** Returns a mutable builder for constructing an instance of [Configuration]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Configuration]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(configuration: Configuration) = apply {
                additionalProperties = configuration.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Configuration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Configuration = Configuration(additionalProperties.toImmutable())
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
        fun validate(): Configuration = apply {
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

            return other is Configuration && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Configuration{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = OverallScore.Deserializer::class)
    @JsonSerialize(using = OverallScore.Serializer::class)
    class OverallScore
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
         * Optional<String> result = overallScore.accept(new OverallScore.Visitor<Optional<String>>() {
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
        fun validate(): OverallScore = apply {
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

            return other is OverallScore && number == other.number && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(number, string)

        override fun toString(): String =
            when {
                number != null -> "OverallScore{number=$number}"
                string != null -> "OverallScore{string=$string}"
                _json != null -> "OverallScore{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid OverallScore")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = OverallScore(number = number)

            @JvmStatic fun ofString(string: String) = OverallScore(string = string)
        }

        /**
         * An interface that defines how to map each variant of [OverallScore] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [OverallScore] to a value of type [T].
             *
             * An instance of [OverallScore] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown OverallScore: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<OverallScore>(OverallScore::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): OverallScore {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                OverallScore(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                OverallScore(number = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> OverallScore(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<OverallScore>(OverallScore::class) {

            override fun serialize(
                value: OverallScore,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid OverallScore")
                }
            }
        }
    }

    @JsonDeserialize(using = TotalScore.Deserializer::class)
    @JsonSerialize(using = TotalScore.Serializer::class)
    class TotalScore
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
         * Optional<String> result = totalScore.accept(new TotalScore.Visitor<Optional<String>>() {
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
        fun validate(): TotalScore = apply {
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

            return other is TotalScore && number == other.number && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(number, string)

        override fun toString(): String =
            when {
                number != null -> "TotalScore{number=$number}"
                string != null -> "TotalScore{string=$string}"
                _json != null -> "TotalScore{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TotalScore")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = TotalScore(number = number)

            @JvmStatic fun ofString(string: String) = TotalScore(string = string)
        }

        /**
         * An interface that defines how to map each variant of [TotalScore] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [TotalScore] to a value of type [T].
             *
             * An instance of [TotalScore] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown TotalScore: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<TotalScore>(TotalScore::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): TotalScore {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                TotalScore(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                TotalScore(number = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> TotalScore(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<TotalScore>(TotalScore::class) {

            override fun serialize(
                value: TotalScore,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TotalScore")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AiTestMetric &&
            id == other.id &&
            evalType == other.evalType &&
            name == other.name &&
            type == other.type &&
            addToNewAgents == other.addToNewAgents &&
            agent == other.agent &&
            agentNames == other.agentNames &&
            agents == other.agents &&
            alertFilters == other.alertFilters &&
            alertType == other.alertType &&
            audioEnabled == other.audioEnabled &&
            configuration == other.configuration &&
            description == other.description &&
            displayOrder == other.displayOrder &&
            enumValues == other.enumValues &&
            evaluationTrigger == other.evaluationTrigger &&
            evaluationTriggerCustomCode == other.evaluationTriggerCustomCode &&
            evaluationTriggerPrompt == other.evaluationTriggerPrompt &&
            ewmaAlpha == other.ewmaAlpha &&
            functionName == other.functionName &&
            kbFileIds == other.kbFileIds &&
            knowledgeBaseFiles == other.knowledgeBaseFiles &&
            metricCost == other.metricCost &&
            observabilityEnabled == other.observabilityEnabled &&
            overallScore == other.overallScore &&
            priorityAssignmentPrompt == other.priorityAssignmentPrompt &&
            project == other.project &&
            prompt == other.prompt &&
            sampleRate == other.sampleRate &&
            samplingEnabled == other.samplingEnabled &&
            significantChangeAlertDirection == other.significantChangeAlertDirection &&
            significantChangeAlertStatus == other.significantChangeAlertStatus &&
            simulationEnabled == other.simulationEnabled &&
            slug == other.slug &&
            stdMultiplier == other.stdMultiplier &&
            totalScore == other.totalScore &&
            triggerType == other.triggerType &&
            userDefined == other.userDefined &&
            usesLlmJudge == other.usesLlmJudge &&
            windowSize == other.windowSize &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            evalType,
            name,
            type,
            addToNewAgents,
            agent,
            agentNames,
            agents,
            alertFilters,
            alertType,
            audioEnabled,
            configuration,
            description,
            displayOrder,
            enumValues,
            evaluationTrigger,
            evaluationTriggerCustomCode,
            evaluationTriggerPrompt,
            ewmaAlpha,
            functionName,
            kbFileIds,
            knowledgeBaseFiles,
            metricCost,
            observabilityEnabled,
            overallScore,
            priorityAssignmentPrompt,
            project,
            prompt,
            sampleRate,
            samplingEnabled,
            significantChangeAlertDirection,
            significantChangeAlertStatus,
            simulationEnabled,
            slug,
            stdMultiplier,
            totalScore,
            triggerType,
            userDefined,
            usesLlmJudge,
            windowSize,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AiTestMetric{id=$id, evalType=$evalType, name=$name, type=$type, addToNewAgents=$addToNewAgents, agent=$agent, agentNames=$agentNames, agents=$agents, alertFilters=$alertFilters, alertType=$alertType, audioEnabled=$audioEnabled, configuration=$configuration, description=$description, displayOrder=$displayOrder, enumValues=$enumValues, evaluationTrigger=$evaluationTrigger, evaluationTriggerCustomCode=$evaluationTriggerCustomCode, evaluationTriggerPrompt=$evaluationTriggerPrompt, ewmaAlpha=$ewmaAlpha, functionName=$functionName, kbFileIds=$kbFileIds, knowledgeBaseFiles=$knowledgeBaseFiles, metricCost=$metricCost, observabilityEnabled=$observabilityEnabled, overallScore=$overallScore, priorityAssignmentPrompt=$priorityAssignmentPrompt, project=$project, prompt=$prompt, sampleRate=$sampleRate, samplingEnabled=$samplingEnabled, significantChangeAlertDirection=$significantChangeAlertDirection, significantChangeAlertStatus=$significantChangeAlertStatus, simulationEnabled=$simulationEnabled, slug=$slug, stdMultiplier=$stdMultiplier, totalScore=$totalScore, triggerType=$triggerType, userDefined=$userDefined, usesLlmJudge=$usesLlmJudge, windowSize=$windowSize, additionalProperties=$additionalProperties}"
}
