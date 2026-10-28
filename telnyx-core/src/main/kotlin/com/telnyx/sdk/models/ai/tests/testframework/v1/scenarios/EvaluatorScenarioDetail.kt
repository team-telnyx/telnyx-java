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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EvaluatorScenarioDetail
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val agent: JsonField<Long>,
    private val name: JsonField<String>,
    private val dynamicVariableValues: JsonField<DynamicVariableValues>,
    private val expectedOutcomePrompt: JsonField<String>,
    private val firstMessage: JsonField<String>,
    private val folderPath: JsonField<String>,
    private val inboundPhoneNumber: JsonField<Long>,
    private val inboundPhoneNumberData: JsonField<InboundPhoneNumberData>,
    private val informationFields: JsonField<InformationFields>,
    private val instructions: JsonField<String>,
    private val isPredefined: JsonField<Boolean>,
    private val maxDuration: JsonField<Long>,
    private val metricNames: JsonField<List<String>>,
    private val metrics: JsonField<List<Long>>,
    private val outboundPhoneNumberData: JsonField<OutboundPhoneNumberData>,
    private val personality: JsonField<Long>,
    private val personalityName: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val project: JsonField<Long>,
    private val runs: JsonField<List<Long>>,
    private val scenarioLanguage: JsonField<String>,
    private val scenarioType: JsonField<String>,
    private val simulationDescription: JsonField<String>,
    private val suiteType: JsonField<String>,
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
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
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
        inboundPhoneNumberData: JsonField<InboundPhoneNumberData> = JsonMissing.of(),
        @JsonProperty("information_fields")
        @ExcludeMissing
        informationFields: JsonField<InformationFields> = JsonMissing.of(),
        @JsonProperty("instructions")
        @ExcludeMissing
        instructions: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_predefined")
        @ExcludeMissing
        isPredefined: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("max_duration")
        @ExcludeMissing
        maxDuration: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metric_names")
        @ExcludeMissing
        metricNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("metrics") @ExcludeMissing metrics: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("outbound_phone_number_data")
        @ExcludeMissing
        outboundPhoneNumberData: JsonField<OutboundPhoneNumberData> = JsonMissing.of(),
        @JsonProperty("personality")
        @ExcludeMissing
        personality: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("personality_name")
        @ExcludeMissing
        personalityName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project") @ExcludeMissing project: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("runs") @ExcludeMissing runs: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("scenario_language")
        @ExcludeMissing
        scenarioLanguage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scenario_type")
        @ExcludeMissing
        scenarioType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("simulation_description")
        @ExcludeMissing
        simulationDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("suite_type") @ExcludeMissing suiteType: JsonField<String> = JsonMissing.of(),
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
        name,
        dynamicVariableValues,
        expectedOutcomePrompt,
        firstMessage,
        folderPath,
        inboundPhoneNumber,
        inboundPhoneNumberData,
        informationFields,
        instructions,
        isPredefined,
        maxDuration,
        metricNames,
        metrics,
        outboundPhoneNumberData,
        personality,
        personalityName,
        phoneNumber,
        project,
        runs,
        scenarioLanguage,
        scenarioType,
        simulationDescription,
        suiteType,
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agent(): Optional<Long> = agent.getOptional("agent")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dynamicVariableValues(): Optional<DynamicVariableValues> =
        dynamicVariableValues.getOptional("dynamic_variable_values")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expectedOutcomePrompt(): Optional<String> =
        expectedOutcomePrompt.getOptional("expected_outcome_prompt")

    /**
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
    fun inboundPhoneNumberData(): Optional<InboundPhoneNumberData> =
        inboundPhoneNumberData.getOptional("inbound_phone_number_data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun informationFields(): Optional<InformationFields> =
        informationFields.getOptional("information_fields")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<String> = instructions.getOptional("instructions")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isPredefined(): Optional<Boolean> = isPredefined.getOptional("is_predefined")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxDuration(): Optional<Long> = maxDuration.getOptional("max_duration")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metricNames(): Optional<List<String>> = metricNames.getOptional("metric_names")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metrics(): Optional<List<Long>> = metrics.getOptional("metrics")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outboundPhoneNumberData(): Optional<OutboundPhoneNumberData> =
        outboundPhoneNumberData.getOptional("outbound_phone_number_data")

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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun project(): Optional<Long> = project.getOptional("project")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runs(): Optional<List<Long>> = runs.getOptional("runs")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scenarioLanguage(): Optional<String> = scenarioLanguage.getOptional("scenario_language")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scenarioType(): Optional<String> = scenarioType.getOptional("scenario_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun simulationDescription(): Optional<String> =
        simulationDescription.getOptional("simulation_description")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suiteType(): Optional<String> = suiteType.getOptional("suite_type")

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [dynamicVariableValues].
     *
     * Unlike [dynamicVariableValues], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dynamic_variable_values")
    @ExcludeMissing
    fun _dynamicVariableValues(): JsonField<DynamicVariableValues> = dynamicVariableValues

    /**
     * Returns the raw JSON value of [expectedOutcomePrompt].
     *
     * Unlike [expectedOutcomePrompt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("expected_outcome_prompt")
    @ExcludeMissing
    fun _expectedOutcomePrompt(): JsonField<String> = expectedOutcomePrompt

    /**
     * Returns the raw JSON value of [firstMessage].
     *
     * Unlike [firstMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_message")
    @ExcludeMissing
    fun _firstMessage(): JsonField<String> = firstMessage

    /**
     * Returns the raw JSON value of [folderPath].
     *
     * Unlike [folderPath], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folder_path") @ExcludeMissing fun _folderPath(): JsonField<String> = folderPath

    /**
     * Returns the raw JSON value of [inboundPhoneNumber].
     *
     * Unlike [inboundPhoneNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
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
    fun _inboundPhoneNumberData(): JsonField<InboundPhoneNumberData> = inboundPhoneNumberData

    /**
     * Returns the raw JSON value of [informationFields].
     *
     * Unlike [informationFields], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("information_fields")
    @ExcludeMissing
    fun _informationFields(): JsonField<InformationFields> = informationFields

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<String> = instructions

    /**
     * Returns the raw JSON value of [isPredefined].
     *
     * Unlike [isPredefined], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_predefined")
    @ExcludeMissing
    fun _isPredefined(): JsonField<Boolean> = isPredefined

    /**
     * Returns the raw JSON value of [maxDuration].
     *
     * Unlike [maxDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_duration") @ExcludeMissing fun _maxDuration(): JsonField<Long> = maxDuration

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
     * Returns the raw JSON value of [outboundPhoneNumberData].
     *
     * Unlike [outboundPhoneNumberData], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("outbound_phone_number_data")
    @ExcludeMissing
    fun _outboundPhoneNumberData(): JsonField<OutboundPhoneNumberData> = outboundPhoneNumberData

    /**
     * Returns the raw JSON value of [personality].
     *
     * Unlike [personality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("personality") @ExcludeMissing fun _personality(): JsonField<Long> = personality

    /**
     * Returns the raw JSON value of [personalityName].
     *
     * Unlike [personalityName], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [project].
     *
     * Unlike [project], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project") @ExcludeMissing fun _project(): JsonField<Long> = project

    /**
     * Returns the raw JSON value of [runs].
     *
     * Unlike [runs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runs") @ExcludeMissing fun _runs(): JsonField<List<Long>> = runs

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
     * Unlike [scenarioType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scenario_type")
    @ExcludeMissing
    fun _scenarioType(): JsonField<String> = scenarioType

    /**
     * Returns the raw JSON value of [simulationDescription].
     *
     * Unlike [simulationDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("simulation_description")
    @ExcludeMissing
    fun _simulationDescription(): JsonField<String> = simulationDescription

    /**
     * Returns the raw JSON value of [suiteType].
     *
     * Unlike [suiteType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("suite_type") @ExcludeMissing fun _suiteType(): JsonField<String> = suiteType

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
    @JsonProperty("test_profile") @ExcludeMissing fun _testProfile(): JsonField<Long> = testProfile

    /**
     * Returns the raw JSON value of [testProfileData].
     *
     * Unlike [testProfileData], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [EvaluatorScenarioDetail].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .agent()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EvaluatorScenarioDetail]. */
    class Builder internal constructor() {

        private var id: JsonField<Long>? = null
        private var agent: JsonField<Long>? = null
        private var name: JsonField<String>? = null
        private var dynamicVariableValues: JsonField<DynamicVariableValues> = JsonMissing.of()
        private var expectedOutcomePrompt: JsonField<String> = JsonMissing.of()
        private var firstMessage: JsonField<String> = JsonMissing.of()
        private var folderPath: JsonField<String> = JsonMissing.of()
        private var inboundPhoneNumber: JsonField<Long> = JsonMissing.of()
        private var inboundPhoneNumberData: JsonField<InboundPhoneNumberData> = JsonMissing.of()
        private var informationFields: JsonField<InformationFields> = JsonMissing.of()
        private var instructions: JsonField<String> = JsonMissing.of()
        private var isPredefined: JsonField<Boolean> = JsonMissing.of()
        private var maxDuration: JsonField<Long> = JsonMissing.of()
        private var metricNames: JsonField<MutableList<String>>? = null
        private var metrics: JsonField<MutableList<Long>>? = null
        private var outboundPhoneNumberData: JsonField<OutboundPhoneNumberData> = JsonMissing.of()
        private var personality: JsonField<Long> = JsonMissing.of()
        private var personalityName: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var project: JsonField<Long> = JsonMissing.of()
        private var runs: JsonField<MutableList<Long>>? = null
        private var scenarioLanguage: JsonField<String> = JsonMissing.of()
        private var scenarioType: JsonField<String> = JsonMissing.of()
        private var simulationDescription: JsonField<String> = JsonMissing.of()
        private var suiteType: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var testProfile: JsonField<Long> = JsonMissing.of()
        private var testProfileData: JsonField<TestProfileData> = JsonMissing.of()
        private var toolIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(evaluatorScenarioDetail: EvaluatorScenarioDetail) = apply {
            id = evaluatorScenarioDetail.id
            agent = evaluatorScenarioDetail.agent
            name = evaluatorScenarioDetail.name
            dynamicVariableValues = evaluatorScenarioDetail.dynamicVariableValues
            expectedOutcomePrompt = evaluatorScenarioDetail.expectedOutcomePrompt
            firstMessage = evaluatorScenarioDetail.firstMessage
            folderPath = evaluatorScenarioDetail.folderPath
            inboundPhoneNumber = evaluatorScenarioDetail.inboundPhoneNumber
            inboundPhoneNumberData = evaluatorScenarioDetail.inboundPhoneNumberData
            informationFields = evaluatorScenarioDetail.informationFields
            instructions = evaluatorScenarioDetail.instructions
            isPredefined = evaluatorScenarioDetail.isPredefined
            maxDuration = evaluatorScenarioDetail.maxDuration
            metricNames = evaluatorScenarioDetail.metricNames.map { it.toMutableList() }
            metrics = evaluatorScenarioDetail.metrics.map { it.toMutableList() }
            outboundPhoneNumberData = evaluatorScenarioDetail.outboundPhoneNumberData
            personality = evaluatorScenarioDetail.personality
            personalityName = evaluatorScenarioDetail.personalityName
            phoneNumber = evaluatorScenarioDetail.phoneNumber
            project = evaluatorScenarioDetail.project
            runs = evaluatorScenarioDetail.runs.map { it.toMutableList() }
            scenarioLanguage = evaluatorScenarioDetail.scenarioLanguage
            scenarioType = evaluatorScenarioDetail.scenarioType
            simulationDescription = evaluatorScenarioDetail.simulationDescription
            suiteType = evaluatorScenarioDetail.suiteType
            tags = evaluatorScenarioDetail.tags.map { it.toMutableList() }
            testProfile = evaluatorScenarioDetail.testProfile
            testProfileData = evaluatorScenarioDetail.testProfileData
            toolIds = evaluatorScenarioDetail.toolIds.map { it.toMutableList() }
            additionalProperties = evaluatorScenarioDetail.additionalProperties.toMutableMap()
        }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
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
         * You should usually call [Builder.agent] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agent(agent: JsonField<Long>) = apply { this.agent = agent }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * [DynamicVariableValues] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun dynamicVariableValues(dynamicVariableValues: JsonField<DynamicVariableValues>) = apply {
            this.dynamicVariableValues = dynamicVariableValues
        }

        fun expectedOutcomePrompt(expectedOutcomePrompt: String) =
            expectedOutcomePrompt(JsonField.of(expectedOutcomePrompt))

        /**
         * Sets [Builder.expectedOutcomePrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedOutcomePrompt] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expectedOutcomePrompt(expectedOutcomePrompt: JsonField<String>) = apply {
            this.expectedOutcomePrompt = expectedOutcomePrompt
        }

        fun firstMessage(firstMessage: String) = firstMessage(JsonField.of(firstMessage))

        /**
         * Sets [Builder.firstMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * You should usually call [Builder.folderPath] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Alias for calling [Builder.inboundPhoneNumber] with `inboundPhoneNumber.orElse(null)`.
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

        fun inboundPhoneNumberData(inboundPhoneNumberData: InboundPhoneNumberData?) =
            inboundPhoneNumberData(JsonField.ofNullable(inboundPhoneNumberData))

        /**
         * Alias for calling [Builder.inboundPhoneNumberData] with
         * `inboundPhoneNumberData.orElse(null)`.
         */
        fun inboundPhoneNumberData(inboundPhoneNumberData: Optional<InboundPhoneNumberData>) =
            inboundPhoneNumberData(inboundPhoneNumberData.getOrNull())

        /**
         * Sets [Builder.inboundPhoneNumberData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundPhoneNumberData] with a well-typed
         * [InboundPhoneNumberData] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun inboundPhoneNumberData(inboundPhoneNumberData: JsonField<InboundPhoneNumberData>) =
            apply {
                this.inboundPhoneNumberData = inboundPhoneNumberData
            }

        fun informationFields(informationFields: InformationFields?) =
            informationFields(JsonField.ofNullable(informationFields))

        /** Alias for calling [Builder.informationFields] with `informationFields.orElse(null)`. */
        fun informationFields(informationFields: Optional<InformationFields>) =
            informationFields(informationFields.getOrNull())

        /**
         * Sets [Builder.informationFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.informationFields] with a well-typed [InformationFields]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun informationFields(informationFields: JsonField<InformationFields>) = apply {
            this.informationFields = informationFields
        }

        fun instructions(instructions: String) = instructions(JsonField.of(instructions))

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            this.instructions = instructions
        }

        fun isPredefined(isPredefined: Boolean) = isPredefined(JsonField.of(isPredefined))

        /**
         * Sets [Builder.isPredefined] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPredefined] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPredefined(isPredefined: JsonField<Boolean>) = apply {
            this.isPredefined = isPredefined
        }

        fun maxDuration(maxDuration: Long?) = maxDuration(JsonField.ofNullable(maxDuration))

        /**
         * Alias for [Builder.maxDuration].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxDuration(maxDuration: Long) = maxDuration(maxDuration as Long?)

        /** Alias for calling [Builder.maxDuration] with `maxDuration.orElse(null)`. */
        fun maxDuration(maxDuration: Optional<Long>) = maxDuration(maxDuration.getOrNull())

        /**
         * Sets [Builder.maxDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxDuration] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxDuration(maxDuration: JsonField<Long>) = apply { this.maxDuration = maxDuration }

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

        fun metrics(metrics: List<Long>) = metrics(JsonField.of(metrics))

        /**
         * Sets [Builder.metrics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metrics] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        fun outboundPhoneNumberData(outboundPhoneNumberData: OutboundPhoneNumberData?) =
            outboundPhoneNumberData(JsonField.ofNullable(outboundPhoneNumberData))

        /**
         * Alias for calling [Builder.outboundPhoneNumberData] with
         * `outboundPhoneNumberData.orElse(null)`.
         */
        fun outboundPhoneNumberData(outboundPhoneNumberData: Optional<OutboundPhoneNumberData>) =
            outboundPhoneNumberData(outboundPhoneNumberData.getOrNull())

        /**
         * Sets [Builder.outboundPhoneNumberData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outboundPhoneNumberData] with a well-typed
         * [OutboundPhoneNumberData] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun outboundPhoneNumberData(outboundPhoneNumberData: JsonField<OutboundPhoneNumberData>) =
            apply {
                this.outboundPhoneNumberData = outboundPhoneNumberData
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

        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

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

        fun runs(runs: List<Long>) = runs(JsonField.of(runs))

        /**
         * Sets [Builder.runs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runs] with a well-typed `List<Long>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runs(runs: JsonField<List<Long>>) = apply {
            this.runs = runs.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [runs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRun(run: Long) = apply {
            runs = (runs ?: JsonField.of(mutableListOf())).also { checkKnown("runs", it).add(run) }
        }

        fun scenarioLanguage(scenarioLanguage: String?) =
            scenarioLanguage(JsonField.ofNullable(scenarioLanguage))

        /** Alias for calling [Builder.scenarioLanguage] with `scenarioLanguage.orElse(null)`. */
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

        fun scenarioType(scenarioType: String) = scenarioType(JsonField.of(scenarioType))

        /**
         * Sets [Builder.scenarioType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scenarioType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scenarioType(scenarioType: JsonField<String>) = apply {
            this.scenarioType = scenarioType
        }

        fun simulationDescription(simulationDescription: String) =
            simulationDescription(JsonField.of(simulationDescription))

        /**
         * Sets [Builder.simulationDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.simulationDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun simulationDescription(simulationDescription: JsonField<String>) = apply {
            this.simulationDescription = simulationDescription
        }

        fun suiteType(suiteType: String) = suiteType(JsonField.of(suiteType))

        /**
         * Sets [Builder.suiteType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suiteType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun suiteType(suiteType: JsonField<String>) = apply { this.suiteType = suiteType }

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
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun testProfileData(testProfileData: JsonField<TestProfileData>) = apply {
            this.testProfileData = testProfileData
        }

        fun toolIds(toolIds: List<String>) = toolIds(JsonField.of(toolIds))

        /**
         * Sets [Builder.toolIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [EvaluatorScenarioDetail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .agent()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EvaluatorScenarioDetail =
            EvaluatorScenarioDetail(
                checkRequired("id", id),
                checkRequired("agent", agent),
                checkRequired("name", name),
                dynamicVariableValues,
                expectedOutcomePrompt,
                firstMessage,
                folderPath,
                inboundPhoneNumber,
                inboundPhoneNumberData,
                informationFields,
                instructions,
                isPredefined,
                maxDuration,
                (metricNames ?: JsonMissing.of()).map { it.toImmutable() },
                (metrics ?: JsonMissing.of()).map { it.toImmutable() },
                outboundPhoneNumberData,
                personality,
                personalityName,
                phoneNumber,
                project,
                (runs ?: JsonMissing.of()).map { it.toImmutable() },
                scenarioLanguage,
                scenarioType,
                simulationDescription,
                suiteType,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                testProfile,
                testProfileData,
                (toolIds ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): EvaluatorScenarioDetail = apply {
        if (validated) {
            return@apply
        }

        id()
        agent()
        name()
        dynamicVariableValues().ifPresent { it.validate() }
        expectedOutcomePrompt()
        firstMessage()
        folderPath()
        inboundPhoneNumber()
        inboundPhoneNumberData().ifPresent { it.validate() }
        informationFields().ifPresent { it.validate() }
        instructions()
        isPredefined()
        maxDuration()
        metricNames()
        metrics()
        outboundPhoneNumberData().ifPresent { it.validate() }
        personality()
        personalityName()
        phoneNumber()
        project()
        runs()
        scenarioLanguage()
        scenarioType()
        simulationDescription()
        suiteType()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (agent.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (dynamicVariableValues.asKnown().getOrNull()?.validity() ?: 0) +
            (if (expectedOutcomePrompt.asKnown().isPresent) 1 else 0) +
            (if (firstMessage.asKnown().isPresent) 1 else 0) +
            (if (folderPath.asKnown().isPresent) 1 else 0) +
            (if (inboundPhoneNumber.asKnown().isPresent) 1 else 0) +
            (inboundPhoneNumberData.asKnown().getOrNull()?.validity() ?: 0) +
            (informationFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (instructions.asKnown().isPresent) 1 else 0) +
            (if (isPredefined.asKnown().isPresent) 1 else 0) +
            (if (maxDuration.asKnown().isPresent) 1 else 0) +
            (metricNames.asKnown().getOrNull()?.size ?: 0) +
            (metrics.asKnown().getOrNull()?.size ?: 0) +
            (outboundPhoneNumberData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (personality.asKnown().isPresent) 1 else 0) +
            (if (personalityName.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (if (project.asKnown().isPresent) 1 else 0) +
            (runs.asKnown().getOrNull()?.size ?: 0) +
            (if (scenarioLanguage.asKnown().isPresent) 1 else 0) +
            (if (scenarioType.asKnown().isPresent) 1 else 0) +
            (if (simulationDescription.asKnown().isPresent) 1 else 0) +
            (if (suiteType.asKnown().isPresent) 1 else 0) +
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
             * Returns a mutable builder for constructing an instance of [DynamicVariableValues].
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
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

    class InboundPhoneNumberData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Long>,
        private val number: JsonField<String>,
        private val phoneNumberId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("number") @ExcludeMissing number: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number_id")
            @ExcludeMissing
            phoneNumberId: JsonField<String> = JsonMissing.of(),
        ) : this(id, number, phoneNumberId, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<Long> = id.getOptional("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun number(): Optional<String> = number.getOptional("number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberId(): Optional<String> = phoneNumberId.getOptional("phone_number_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [number].
         *
         * Unlike [number], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

        /**
         * Returns the raw JSON value of [phoneNumberId].
         *
         * Unlike [phoneNumberId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_number_id")
        @ExcludeMissing
        fun _phoneNumberId(): JsonField<String> = phoneNumberId

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
             * Returns a mutable builder for constructing an instance of [InboundPhoneNumberData].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InboundPhoneNumberData]. */
        class Builder internal constructor() {

            private var id: JsonField<Long> = JsonMissing.of()
            private var number: JsonField<String> = JsonMissing.of()
            private var phoneNumberId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inboundPhoneNumberData: InboundPhoneNumberData) = apply {
                id = inboundPhoneNumberData.id
                number = inboundPhoneNumberData.number
                phoneNumberId = inboundPhoneNumberData.phoneNumberId
                additionalProperties = inboundPhoneNumberData.additionalProperties.toMutableMap()
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

            fun number(number: String) = number(JsonField.of(number))

            /**
             * Sets [Builder.number] to an arbitrary JSON value.
             *
             * You should usually call [Builder.number] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun number(number: JsonField<String>) = apply { this.number = number }

            fun phoneNumberId(phoneNumberId: String) = phoneNumberId(JsonField.of(phoneNumberId))

            /**
             * Sets [Builder.phoneNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumberId(phoneNumberId: JsonField<String>) = apply {
                this.phoneNumberId = phoneNumberId
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
             * Returns an immutable instance of [InboundPhoneNumberData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InboundPhoneNumberData =
                InboundPhoneNumberData(
                    id,
                    number,
                    phoneNumberId,
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
        fun validate(): InboundPhoneNumberData = apply {
            if (validated) {
                return@apply
            }

            id()
            number()
            phoneNumberId()
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
                (if (number.asKnown().isPresent) 1 else 0) +
                (if (phoneNumberId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InboundPhoneNumberData &&
                id == other.id &&
                number == other.number &&
                phoneNumberId == other.phoneNumberId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, number, phoneNumberId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InboundPhoneNumberData{id=$id, number=$number, phoneNumberId=$phoneNumberId, additionalProperties=$additionalProperties}"
    }

    class InformationFields
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

            /** Returns a mutable builder for constructing an instance of [InformationFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InformationFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(informationFields: InformationFields) = apply {
                additionalProperties = informationFields.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [InformationFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InformationFields = InformationFields(additionalProperties.toImmutable())
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
        fun validate(): InformationFields = apply {
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

            return other is InformationFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "InformationFields{additionalProperties=$additionalProperties}"
    }

    class OutboundPhoneNumberData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Long>,
        private val number: JsonField<String>,
        private val phoneNumberId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("number") @ExcludeMissing number: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number_id")
            @ExcludeMissing
            phoneNumberId: JsonField<String> = JsonMissing.of(),
        ) : this(id, number, phoneNumberId, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<Long> = id.getOptional("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun number(): Optional<String> = number.getOptional("number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberId(): Optional<String> = phoneNumberId.getOptional("phone_number_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [number].
         *
         * Unlike [number], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

        /**
         * Returns the raw JSON value of [phoneNumberId].
         *
         * Unlike [phoneNumberId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_number_id")
        @ExcludeMissing
        fun _phoneNumberId(): JsonField<String> = phoneNumberId

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
             * Returns a mutable builder for constructing an instance of [OutboundPhoneNumberData].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OutboundPhoneNumberData]. */
        class Builder internal constructor() {

            private var id: JsonField<Long> = JsonMissing.of()
            private var number: JsonField<String> = JsonMissing.of()
            private var phoneNumberId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outboundPhoneNumberData: OutboundPhoneNumberData) = apply {
                id = outboundPhoneNumberData.id
                number = outboundPhoneNumberData.number
                phoneNumberId = outboundPhoneNumberData.phoneNumberId
                additionalProperties = outboundPhoneNumberData.additionalProperties.toMutableMap()
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

            fun number(number: String) = number(JsonField.of(number))

            /**
             * Sets [Builder.number] to an arbitrary JSON value.
             *
             * You should usually call [Builder.number] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun number(number: JsonField<String>) = apply { this.number = number }

            fun phoneNumberId(phoneNumberId: String) = phoneNumberId(JsonField.of(phoneNumberId))

            /**
             * Sets [Builder.phoneNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumberId(phoneNumberId: JsonField<String>) = apply {
                this.phoneNumberId = phoneNumberId
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
             * Returns an immutable instance of [OutboundPhoneNumberData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OutboundPhoneNumberData =
                OutboundPhoneNumberData(
                    id,
                    number,
                    phoneNumberId,
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
        fun validate(): OutboundPhoneNumberData = apply {
            if (validated) {
                return@apply
            }

            id()
            number()
            phoneNumberId()
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
                (if (number.asKnown().isPresent) 1 else 0) +
                (if (phoneNumberId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OutboundPhoneNumberData &&
                id == other.id &&
                number == other.number &&
                phoneNumberId == other.phoneNumberId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, number, phoneNumberId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OutboundPhoneNumberData{id=$id, number=$number, phoneNumberId=$phoneNumberId, additionalProperties=$additionalProperties}"
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
        fun information(): Optional<Information> = information.getOptional("information")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
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
         * Unlike [information], this method doesn't throw if the JSON field has an unexpected type.
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
             * You should usually call [Builder.agent] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * You should usually call [Builder.information] with a well-typed [Information] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun information(information: JsonField<Information>) = apply {
                this.information = information
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
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
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Information && additionalProperties == other.additionalProperties
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

        return other is EvaluatorScenarioDetail &&
            id == other.id &&
            agent == other.agent &&
            name == other.name &&
            dynamicVariableValues == other.dynamicVariableValues &&
            expectedOutcomePrompt == other.expectedOutcomePrompt &&
            firstMessage == other.firstMessage &&
            folderPath == other.folderPath &&
            inboundPhoneNumber == other.inboundPhoneNumber &&
            inboundPhoneNumberData == other.inboundPhoneNumberData &&
            informationFields == other.informationFields &&
            instructions == other.instructions &&
            isPredefined == other.isPredefined &&
            maxDuration == other.maxDuration &&
            metricNames == other.metricNames &&
            metrics == other.metrics &&
            outboundPhoneNumberData == other.outboundPhoneNumberData &&
            personality == other.personality &&
            personalityName == other.personalityName &&
            phoneNumber == other.phoneNumber &&
            project == other.project &&
            runs == other.runs &&
            scenarioLanguage == other.scenarioLanguage &&
            scenarioType == other.scenarioType &&
            simulationDescription == other.simulationDescription &&
            suiteType == other.suiteType &&
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
            name,
            dynamicVariableValues,
            expectedOutcomePrompt,
            firstMessage,
            folderPath,
            inboundPhoneNumber,
            inboundPhoneNumberData,
            informationFields,
            instructions,
            isPredefined,
            maxDuration,
            metricNames,
            metrics,
            outboundPhoneNumberData,
            personality,
            personalityName,
            phoneNumber,
            project,
            runs,
            scenarioLanguage,
            scenarioType,
            simulationDescription,
            suiteType,
            tags,
            testProfile,
            testProfileData,
            toolIds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EvaluatorScenarioDetail{id=$id, agent=$agent, name=$name, dynamicVariableValues=$dynamicVariableValues, expectedOutcomePrompt=$expectedOutcomePrompt, firstMessage=$firstMessage, folderPath=$folderPath, inboundPhoneNumber=$inboundPhoneNumber, inboundPhoneNumberData=$inboundPhoneNumberData, informationFields=$informationFields, instructions=$instructions, isPredefined=$isPredefined, maxDuration=$maxDuration, metricNames=$metricNames, metrics=$metrics, outboundPhoneNumberData=$outboundPhoneNumberData, personality=$personality, personalityName=$personalityName, phoneNumber=$phoneNumber, project=$project, runs=$runs, scenarioLanguage=$scenarioLanguage, scenarioType=$scenarioType, simulationDescription=$simulationDescription, suiteType=$suiteType, tags=$tags, testProfile=$testProfile, testProfileData=$testProfileData, toolIds=$toolIds, additionalProperties=$additionalProperties}"
}
