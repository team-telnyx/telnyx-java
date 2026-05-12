// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

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

/**
 * Metadata for a model available on Telnyx Inference. Returned by `GET /v2/ai/openai/models` (and
 * the deprecated `GET /v2/ai/models`). Open-source models live under their Hugging Face
 * organization (e.g. `moonshotai/Kimi-K2.6`, `zai-org/GLM-5.1-FP8`, `MiniMaxAI/MiniMax-M2.7`);
 * fine-tuned models are owned by the Telnyx organization that trained them.
 */
class ModelMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val contextLength: JsonField<Long>,
    private val created: JsonField<OffsetDateTime>,
    private val languages: JsonField<List<String>>,
    private val license: JsonField<String>,
    private val organization: JsonField<String>,
    private val ownedBy: JsonField<String>,
    private val parameters: JsonField<Long>,
    private val tier: JsonField<Tier>,
    private val baseModel: JsonField<String>,
    private val description: JsonField<String>,
    private val isFineTunable: JsonField<Boolean>,
    private val isVisionSupported: JsonField<Boolean>,
    private val maxCompletionTokens: JsonField<Long>,
    private val modelObject: JsonField<String>,
    private val parametersStr: JsonField<String>,
    private val pricing: JsonField<Pricing>,
    private val recommendedForAssistants: JsonField<Boolean>,
    private val regions: JsonField<List<String>>,
    private val task: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("context_length")
        @ExcludeMissing
        contextLength: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("languages")
        @ExcludeMissing
        languages: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("license") @ExcludeMissing license: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization")
        @ExcludeMissing
        organization: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owned_by") @ExcludeMissing ownedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parameters") @ExcludeMissing parameters: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("tier") @ExcludeMissing tier: JsonField<Tier> = JsonMissing.of(),
        @JsonProperty("base_model") @ExcludeMissing baseModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_fine_tunable")
        @ExcludeMissing
        isFineTunable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_vision_supported")
        @ExcludeMissing
        isVisionSupported: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("max_completion_tokens")
        @ExcludeMissing
        maxCompletionTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing modelObject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parameters_str")
        @ExcludeMissing
        parametersStr: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pricing") @ExcludeMissing pricing: JsonField<Pricing> = JsonMissing.of(),
        @JsonProperty("recommended_for_assistants")
        @ExcludeMissing
        recommendedForAssistants: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("regions")
        @ExcludeMissing
        regions: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("task") @ExcludeMissing task: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        contextLength,
        created,
        languages,
        license,
        organization,
        ownedBy,
        parameters,
        tier,
        baseModel,
        description,
        isFineTunable,
        isVisionSupported,
        maxCompletionTokens,
        modelObject,
        parametersStr,
        pricing,
        recommendedForAssistants,
        regions,
        task,
        mutableMapOf(),
    )

    /**
     * Model identifier. For open-source models, follows the `{organization}/{model_name}`
     * convention from Hugging Face (e.g. `moonshotai/Kimi-K2.6`).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Maximum total tokens (prompt + completion) supported by the model in a single request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contextLength(): Long = contextLength.getRequired("context_length")

    /**
     * Timestamp at which the model was registered on Telnyx Inference (ISO 8601).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * ISO language codes the model supports (e.g. `en`, `es`).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun languages(): List<String> = languages.getRequired("languages")

    /**
     * License the model is distributed under, e.g. `Apache 2.0`, `MIT`, `Llama 3 Community
     * License`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun license(): String = license.getRequired("license")

    /**
     * Organization that originally published the model, matching the prefix of `id` for open-source
     * models.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organization(): String = organization.getRequired("organization")

    /**
     * Owner of the model. `Telnyx` for Telnyx-hosted open-source models, the upstream provider name
     * for proxied models, or the Telnyx organization id for fine-tuned models.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ownedBy(): String = ownedBy.getRequired("owned_by")

    /**
     * Total parameter count of the model.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parameters(): Long = parameters.getRequired("parameters")

    /**
     * Billing tier the model belongs to. Used together with `pricing` to determine cost per 1M
     * tokens.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tier(): Tier = tier.getRequired("tier")

    /**
     * Base model the fine-tuned model was trained from. Only set for fine-tuned models.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baseModel(): Optional<String> = baseModel.getOptional("base_model")

    /**
     * Short, human-readable summary of what the model is best suited for.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Whether the model can be used as a base for a fine-tuning job via `POST
     * /v2/ai/fine_tuning/jobs`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isFineTunable(): Optional<Boolean> = isFineTunable.getOptional("is_fine_tunable")

    /**
     * Whether the model accepts image inputs in chat completions (multimodal vision support).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isVisionSupported(): Optional<Boolean> =
        isVisionSupported.getOptional("is_vision_supported")

    /**
     * Maximum number of completion (output) tokens the model will generate per request. `null` if
     * unconstrained beyond `context_length`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxCompletionTokens(): Optional<Long> =
        maxCompletionTokens.getOptional("max_completion_tokens")

    /**
     * Object type. Always `model`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelObject(): Optional<String> = modelObject.getOptional("object")

    /**
     * Human-readable parameter count, e.g. `1.0T`, `753.9B`, `8B`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parametersStr(): Optional<String> = parametersStr.getOptional("parameters_str")

    /**
     * Mapping of token kind to price, as strings to preserve precision. Typical keys are `prompt`,
     * `cached_prompt`, and `completion`. When pricing is available the block also includes
     * `currency` (ISO 4217 code matching the account's configured billing currency) and `unit` (the
     * denomination the prices are quoted in, currently always `1M_tokens` for token-priced models).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pricing(): Optional<Pricing> = pricing.getOptional("pricing")

    /**
     * Whether Telnyx currently recommends this model as the LLM powering a Telnyx AI Assistant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recommendedForAssistants(): Optional<Boolean> =
        recommendedForAssistants.getOptional("recommended_for_assistants")

    /**
     * Public region names where the model is currently deployed (e.g. `us-central-1`,
     * `eu-central-1`).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regions(): Optional<List<String>> = regions.getOptional("regions")

    /**
     * Primary task the model is intended for, e.g. `text-generation`, `audio-text-to-text`,
     * `feature-extraction` (embeddings).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun task(): Optional<String> = task.getOptional("task")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [contextLength].
     *
     * Unlike [contextLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("context_length")
    @ExcludeMissing
    fun _contextLength(): JsonField<Long> = contextLength

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [languages].
     *
     * Unlike [languages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("languages") @ExcludeMissing fun _languages(): JsonField<List<String>> = languages

    /**
     * Returns the raw JSON value of [license].
     *
     * Unlike [license], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("license") @ExcludeMissing fun _license(): JsonField<String> = license

    /**
     * Returns the raw JSON value of [organization].
     *
     * Unlike [organization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization")
    @ExcludeMissing
    fun _organization(): JsonField<String> = organization

    /**
     * Returns the raw JSON value of [ownedBy].
     *
     * Unlike [ownedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("owned_by") @ExcludeMissing fun _ownedBy(): JsonField<String> = ownedBy

    /**
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parameters") @ExcludeMissing fun _parameters(): JsonField<Long> = parameters

    /**
     * Returns the raw JSON value of [tier].
     *
     * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<Tier> = tier

    /**
     * Returns the raw JSON value of [baseModel].
     *
     * Unlike [baseModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("base_model") @ExcludeMissing fun _baseModel(): JsonField<String> = baseModel

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [isFineTunable].
     *
     * Unlike [isFineTunable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_fine_tunable")
    @ExcludeMissing
    fun _isFineTunable(): JsonField<Boolean> = isFineTunable

    /**
     * Returns the raw JSON value of [isVisionSupported].
     *
     * Unlike [isVisionSupported], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("is_vision_supported")
    @ExcludeMissing
    fun _isVisionSupported(): JsonField<Boolean> = isVisionSupported

    /**
     * Returns the raw JSON value of [maxCompletionTokens].
     *
     * Unlike [maxCompletionTokens], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_completion_tokens")
    @ExcludeMissing
    fun _maxCompletionTokens(): JsonField<Long> = maxCompletionTokens

    /**
     * Returns the raw JSON value of [modelObject].
     *
     * Unlike [modelObject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _modelObject(): JsonField<String> = modelObject

    /**
     * Returns the raw JSON value of [parametersStr].
     *
     * Unlike [parametersStr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parameters_str")
    @ExcludeMissing
    fun _parametersStr(): JsonField<String> = parametersStr

    /**
     * Returns the raw JSON value of [pricing].
     *
     * Unlike [pricing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pricing") @ExcludeMissing fun _pricing(): JsonField<Pricing> = pricing

    /**
     * Returns the raw JSON value of [recommendedForAssistants].
     *
     * Unlike [recommendedForAssistants], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("recommended_for_assistants")
    @ExcludeMissing
    fun _recommendedForAssistants(): JsonField<Boolean> = recommendedForAssistants

    /**
     * Returns the raw JSON value of [regions].
     *
     * Unlike [regions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regions") @ExcludeMissing fun _regions(): JsonField<List<String>> = regions

    /**
     * Returns the raw JSON value of [task].
     *
     * Unlike [task], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("task") @ExcludeMissing fun _task(): JsonField<String> = task

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
         * Returns a mutable builder for constructing an instance of [ModelMetadata].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .contextLength()
         * .created()
         * .languages()
         * .license()
         * .organization()
         * .ownedBy()
         * .parameters()
         * .tier()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModelMetadata]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var contextLength: JsonField<Long>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var languages: JsonField<MutableList<String>>? = null
        private var license: JsonField<String>? = null
        private var organization: JsonField<String>? = null
        private var ownedBy: JsonField<String>? = null
        private var parameters: JsonField<Long>? = null
        private var tier: JsonField<Tier>? = null
        private var baseModel: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var isFineTunable: JsonField<Boolean> = JsonMissing.of()
        private var isVisionSupported: JsonField<Boolean> = JsonMissing.of()
        private var maxCompletionTokens: JsonField<Long> = JsonMissing.of()
        private var modelObject: JsonField<String> = JsonMissing.of()
        private var parametersStr: JsonField<String> = JsonMissing.of()
        private var pricing: JsonField<Pricing> = JsonMissing.of()
        private var recommendedForAssistants: JsonField<Boolean> = JsonMissing.of()
        private var regions: JsonField<MutableList<String>>? = null
        private var task: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(modelMetadata: ModelMetadata) = apply {
            id = modelMetadata.id
            contextLength = modelMetadata.contextLength
            created = modelMetadata.created
            languages = modelMetadata.languages.map { it.toMutableList() }
            license = modelMetadata.license
            organization = modelMetadata.organization
            ownedBy = modelMetadata.ownedBy
            parameters = modelMetadata.parameters
            tier = modelMetadata.tier
            baseModel = modelMetadata.baseModel
            description = modelMetadata.description
            isFineTunable = modelMetadata.isFineTunable
            isVisionSupported = modelMetadata.isVisionSupported
            maxCompletionTokens = modelMetadata.maxCompletionTokens
            modelObject = modelMetadata.modelObject
            parametersStr = modelMetadata.parametersStr
            pricing = modelMetadata.pricing
            recommendedForAssistants = modelMetadata.recommendedForAssistants
            regions = modelMetadata.regions.map { it.toMutableList() }
            task = modelMetadata.task
            additionalProperties = modelMetadata.additionalProperties.toMutableMap()
        }

        /**
         * Model identifier. For open-source models, follows the `{organization}/{model_name}`
         * convention from Hugging Face (e.g. `moonshotai/Kimi-K2.6`).
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Maximum total tokens (prompt + completion) supported by the model in a single request.
         */
        fun contextLength(contextLength: Long) = contextLength(JsonField.of(contextLength))

        /**
         * Sets [Builder.contextLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contextLength] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contextLength(contextLength: JsonField<Long>) = apply {
            this.contextLength = contextLength
        }

        /** Timestamp at which the model was registered on Telnyx Inference (ISO 8601). */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** ISO language codes the model supports (e.g. `en`, `es`). */
        fun languages(languages: List<String>) = languages(JsonField.of(languages))

        /**
         * Sets [Builder.languages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.languages] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun languages(languages: JsonField<List<String>>) = apply {
            this.languages = languages.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [languages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLanguage(language: String) = apply {
            languages =
                (languages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("languages", it).add(language)
                }
        }

        /**
         * License the model is distributed under, e.g. `Apache 2.0`, `MIT`, `Llama 3 Community
         * License`.
         */
        fun license(license: String) = license(JsonField.of(license))

        /**
         * Sets [Builder.license] to an arbitrary JSON value.
         *
         * You should usually call [Builder.license] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun license(license: JsonField<String>) = apply { this.license = license }

        /**
         * Organization that originally published the model, matching the prefix of `id` for
         * open-source models.
         */
        fun organization(organization: String) = organization(JsonField.of(organization))

        /**
         * Sets [Builder.organization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organization] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun organization(organization: JsonField<String>) = apply {
            this.organization = organization
        }

        /**
         * Owner of the model. `Telnyx` for Telnyx-hosted open-source models, the upstream provider
         * name for proxied models, or the Telnyx organization id for fine-tuned models.
         */
        fun ownedBy(ownedBy: String) = ownedBy(JsonField.of(ownedBy))

        /**
         * Sets [Builder.ownedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ownedBy] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ownedBy(ownedBy: JsonField<String>) = apply { this.ownedBy = ownedBy }

        /** Total parameter count of the model. */
        fun parameters(parameters: Long) = parameters(JsonField.of(parameters))

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun parameters(parameters: JsonField<Long>) = apply { this.parameters = parameters }

        /**
         * Billing tier the model belongs to. Used together with `pricing` to determine cost per 1M
         * tokens.
         */
        fun tier(tier: Tier) = tier(JsonField.of(tier))

        /**
         * Sets [Builder.tier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tier] with a well-typed [Tier] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tier(tier: JsonField<Tier>) = apply { this.tier = tier }

        /** Base model the fine-tuned model was trained from. Only set for fine-tuned models. */
        fun baseModel(baseModel: String?) = baseModel(JsonField.ofNullable(baseModel))

        /** Alias for calling [Builder.baseModel] with `baseModel.orElse(null)`. */
        fun baseModel(baseModel: Optional<String>) = baseModel(baseModel.getOrNull())

        /**
         * Sets [Builder.baseModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseModel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun baseModel(baseModel: JsonField<String>) = apply { this.baseModel = baseModel }

        /** Short, human-readable summary of what the model is best suited for. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * Whether the model can be used as a base for a fine-tuning job via `POST
         * /v2/ai/fine_tuning/jobs`.
         */
        fun isFineTunable(isFineTunable: Boolean) = isFineTunable(JsonField.of(isFineTunable))

        /**
         * Sets [Builder.isFineTunable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isFineTunable] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isFineTunable(isFineTunable: JsonField<Boolean>) = apply {
            this.isFineTunable = isFineTunable
        }

        /**
         * Whether the model accepts image inputs in chat completions (multimodal vision support).
         */
        fun isVisionSupported(isVisionSupported: Boolean) =
            isVisionSupported(JsonField.of(isVisionSupported))

        /**
         * Sets [Builder.isVisionSupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isVisionSupported] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isVisionSupported(isVisionSupported: JsonField<Boolean>) = apply {
            this.isVisionSupported = isVisionSupported
        }

        /**
         * Maximum number of completion (output) tokens the model will generate per request. `null`
         * if unconstrained beyond `context_length`.
         */
        fun maxCompletionTokens(maxCompletionTokens: Long?) =
            maxCompletionTokens(JsonField.ofNullable(maxCompletionTokens))

        /**
         * Alias for [Builder.maxCompletionTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxCompletionTokens(maxCompletionTokens: Long) =
            maxCompletionTokens(maxCompletionTokens as Long?)

        /**
         * Alias for calling [Builder.maxCompletionTokens] with `maxCompletionTokens.orElse(null)`.
         */
        fun maxCompletionTokens(maxCompletionTokens: Optional<Long>) =
            maxCompletionTokens(maxCompletionTokens.getOrNull())

        /**
         * Sets [Builder.maxCompletionTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxCompletionTokens] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxCompletionTokens(maxCompletionTokens: JsonField<Long>) = apply {
            this.maxCompletionTokens = maxCompletionTokens
        }

        /** Object type. Always `model`. */
        fun modelObject(modelObject: String) = modelObject(JsonField.of(modelObject))

        /**
         * Sets [Builder.modelObject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelObject] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelObject(modelObject: JsonField<String>) = apply { this.modelObject = modelObject }

        /** Human-readable parameter count, e.g. `1.0T`, `753.9B`, `8B`. */
        fun parametersStr(parametersStr: String?) =
            parametersStr(JsonField.ofNullable(parametersStr))

        /** Alias for calling [Builder.parametersStr] with `parametersStr.orElse(null)`. */
        fun parametersStr(parametersStr: Optional<String>) =
            parametersStr(parametersStr.getOrNull())

        /**
         * Sets [Builder.parametersStr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parametersStr] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parametersStr(parametersStr: JsonField<String>) = apply {
            this.parametersStr = parametersStr
        }

        /**
         * Mapping of token kind to price, as strings to preserve precision. Typical keys are
         * `prompt`, `cached_prompt`, and `completion`. When pricing is available the block also
         * includes `currency` (ISO 4217 code matching the account's configured billing currency)
         * and `unit` (the denomination the prices are quoted in, currently always `1M_tokens` for
         * token-priced models).
         */
        fun pricing(pricing: Pricing) = pricing(JsonField.of(pricing))

        /**
         * Sets [Builder.pricing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricing] with a well-typed [Pricing] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pricing(pricing: JsonField<Pricing>) = apply { this.pricing = pricing }

        /**
         * Whether Telnyx currently recommends this model as the LLM powering a Telnyx AI Assistant.
         */
        fun recommendedForAssistants(recommendedForAssistants: Boolean) =
            recommendedForAssistants(JsonField.of(recommendedForAssistants))

        /**
         * Sets [Builder.recommendedForAssistants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recommendedForAssistants] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recommendedForAssistants(recommendedForAssistants: JsonField<Boolean>) = apply {
            this.recommendedForAssistants = recommendedForAssistants
        }

        /**
         * Public region names where the model is currently deployed (e.g. `us-central-1`,
         * `eu-central-1`).
         */
        fun regions(regions: List<String>) = regions(JsonField.of(regions))

        /**
         * Sets [Builder.regions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regions] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regions(regions: JsonField<List<String>>) = apply {
            this.regions = regions.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [regions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRegion(region: String) = apply {
            regions =
                (regions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("regions", it).add(region)
                }
        }

        /**
         * Primary task the model is intended for, e.g. `text-generation`, `audio-text-to-text`,
         * `feature-extraction` (embeddings).
         */
        fun task(task: String) = task(JsonField.of(task))

        /**
         * Sets [Builder.task] to an arbitrary JSON value.
         *
         * You should usually call [Builder.task] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun task(task: JsonField<String>) = apply { this.task = task }

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
         * Returns an immutable instance of [ModelMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .contextLength()
         * .created()
         * .languages()
         * .license()
         * .organization()
         * .ownedBy()
         * .parameters()
         * .tier()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModelMetadata =
            ModelMetadata(
                checkRequired("id", id),
                checkRequired("contextLength", contextLength),
                checkRequired("created", created),
                checkRequired("languages", languages).map { it.toImmutable() },
                checkRequired("license", license),
                checkRequired("organization", organization),
                checkRequired("ownedBy", ownedBy),
                checkRequired("parameters", parameters),
                checkRequired("tier", tier),
                baseModel,
                description,
                isFineTunable,
                isVisionSupported,
                maxCompletionTokens,
                modelObject,
                parametersStr,
                pricing,
                recommendedForAssistants,
                (regions ?: JsonMissing.of()).map { it.toImmutable() },
                task,
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
    fun validate(): ModelMetadata = apply {
        if (validated) {
            return@apply
        }

        id()
        contextLength()
        created()
        languages()
        license()
        organization()
        ownedBy()
        parameters()
        tier().validate()
        baseModel()
        description()
        isFineTunable()
        isVisionSupported()
        maxCompletionTokens()
        modelObject()
        parametersStr()
        pricing().ifPresent { it.validate() }
        recommendedForAssistants()
        regions()
        task()
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
            (if (contextLength.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (languages.asKnown().getOrNull()?.size ?: 0) +
            (if (license.asKnown().isPresent) 1 else 0) +
            (if (organization.asKnown().isPresent) 1 else 0) +
            (if (ownedBy.asKnown().isPresent) 1 else 0) +
            (if (parameters.asKnown().isPresent) 1 else 0) +
            (tier.asKnown().getOrNull()?.validity() ?: 0) +
            (if (baseModel.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (isFineTunable.asKnown().isPresent) 1 else 0) +
            (if (isVisionSupported.asKnown().isPresent) 1 else 0) +
            (if (maxCompletionTokens.asKnown().isPresent) 1 else 0) +
            (if (modelObject.asKnown().isPresent) 1 else 0) +
            (if (parametersStr.asKnown().isPresent) 1 else 0) +
            (pricing.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recommendedForAssistants.asKnown().isPresent) 1 else 0) +
            (regions.asKnown().getOrNull()?.size ?: 0) +
            (if (task.asKnown().isPresent) 1 else 0)

    /**
     * Billing tier the model belongs to. Used together with `pricing` to determine cost per 1M
     * tokens.
     */
    class Tier @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SMALL = of("small")

            @JvmField val MEDIUM = of("medium")

            @JvmField val LARGE = of("large")

            @JvmField val UNLISTED = of("unlisted")

            @JvmStatic fun of(value: String) = Tier(JsonField.of(value))
        }

        /** An enum containing [Tier]'s known values. */
        enum class Known {
            SMALL,
            MEDIUM,
            LARGE,
            UNLISTED,
        }

        /**
         * An enum containing [Tier]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Tier] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SMALL,
            MEDIUM,
            LARGE,
            UNLISTED,
            /** An enum member indicating that [Tier] was instantiated with an unknown value. */
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
                SMALL -> Value.SMALL
                MEDIUM -> Value.MEDIUM
                LARGE -> Value.LARGE
                UNLISTED -> Value.UNLISTED
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
                SMALL -> Known.SMALL
                MEDIUM -> Known.MEDIUM
                LARGE -> Known.LARGE
                UNLISTED -> Known.UNLISTED
                else -> throw TelnyxInvalidDataException("Unknown Tier: $value")
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
        fun validate(): Tier = apply {
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

            return other is Tier && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Mapping of token kind to price, as strings to preserve precision. Typical keys are `prompt`,
     * `cached_prompt`, and `completion`. When pricing is available the block also includes
     * `currency` (ISO 4217 code matching the account's configured billing currency) and `unit` (the
     * denomination the prices are quoted in, currently always `1M_tokens` for token-priced models).
     */
    class Pricing
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

            /** Returns a mutable builder for constructing an instance of [Pricing]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Pricing]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pricing: Pricing) = apply {
                additionalProperties = pricing.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Pricing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Pricing = Pricing(additionalProperties.toImmutable())
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
        fun validate(): Pricing = apply {
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

            return other is Pricing && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Pricing{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModelMetadata &&
            id == other.id &&
            contextLength == other.contextLength &&
            created == other.created &&
            languages == other.languages &&
            license == other.license &&
            organization == other.organization &&
            ownedBy == other.ownedBy &&
            parameters == other.parameters &&
            tier == other.tier &&
            baseModel == other.baseModel &&
            description == other.description &&
            isFineTunable == other.isFineTunable &&
            isVisionSupported == other.isVisionSupported &&
            maxCompletionTokens == other.maxCompletionTokens &&
            modelObject == other.modelObject &&
            parametersStr == other.parametersStr &&
            pricing == other.pricing &&
            recommendedForAssistants == other.recommendedForAssistants &&
            regions == other.regions &&
            task == other.task &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            contextLength,
            created,
            languages,
            license,
            organization,
            ownedBy,
            parameters,
            tier,
            baseModel,
            description,
            isFineTunable,
            isVisionSupported,
            maxCompletionTokens,
            modelObject,
            parametersStr,
            pricing,
            recommendedForAssistants,
            regions,
            task,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModelMetadata{id=$id, contextLength=$contextLength, created=$created, languages=$languages, license=$license, organization=$organization, ownedBy=$ownedBy, parameters=$parameters, tier=$tier, baseModel=$baseModel, description=$description, isFineTunable=$isFineTunable, isVisionSupported=$isVisionSupported, maxCompletionTokens=$maxCompletionTokens, modelObject=$modelObject, parametersStr=$parametersStr, pricing=$pricing, recommendedForAssistants=$recommendedForAssistants, regions=$regions, task=$task, additionalProperties=$additionalProperties}"
}
