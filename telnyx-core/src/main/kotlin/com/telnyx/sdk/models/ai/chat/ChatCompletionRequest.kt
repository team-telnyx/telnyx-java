// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.chat

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

class ChatCompletionRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val messages: JsonField<List<Message>>,
    private val apiKeyRef: JsonField<String>,
    private val bestOf: JsonField<Long>,
    private val earlyStopping: JsonField<Boolean>,
    private val enableThinking: JsonField<Boolean>,
    private val frequencyPenalty: JsonField<Double>,
    private val lengthPenalty: JsonField<Double>,
    private val logprobs: JsonField<Boolean>,
    private val maxTokens: JsonField<Long>,
    private val minP: JsonField<Double>,
    private val mode: JsonField<Mode>,
    private val model: JsonField<String>,
    private val n: JsonField<Double>,
    private val presencePenalty: JsonField<Double>,
    private val reasoningEffort: JsonField<ReasoningEffort>,
    private val region: JsonField<Region>,
    private val responseFormat: JsonField<ResponseFormat>,
    private val seed: JsonField<Long>,
    private val serviceTier: JsonField<String>,
    private val stop: JsonField<Stop>,
    private val stream: JsonField<Boolean>,
    private val temperature: JsonField<Double>,
    private val toolChoice: JsonField<ToolChoice>,
    private val tools: JsonField<List<Tool>>,
    private val topLogprobs: JsonField<Long>,
    private val topP: JsonField<Double>,
    private val useBeamSearch: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("messages")
        @ExcludeMissing
        messages: JsonField<List<Message>> = JsonMissing.of(),
        @JsonProperty("api_key_ref")
        @ExcludeMissing
        apiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("best_of") @ExcludeMissing bestOf: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("early_stopping")
        @ExcludeMissing
        earlyStopping: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enable_thinking")
        @ExcludeMissing
        enableThinking: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("frequency_penalty")
        @ExcludeMissing
        frequencyPenalty: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("length_penalty")
        @ExcludeMissing
        lengthPenalty: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("logprobs") @ExcludeMissing logprobs: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("max_tokens") @ExcludeMissing maxTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("min_p") @ExcludeMissing minP: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("n") @ExcludeMissing n: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("presence_penalty")
        @ExcludeMissing
        presencePenalty: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("reasoning_effort")
        @ExcludeMissing
        reasoningEffort: JsonField<ReasoningEffort> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<Region> = JsonMissing.of(),
        @JsonProperty("response_format")
        @ExcludeMissing
        responseFormat: JsonField<ResponseFormat> = JsonMissing.of(),
        @JsonProperty("seed") @ExcludeMissing seed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("service_tier")
        @ExcludeMissing
        serviceTier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stop") @ExcludeMissing stop: JsonField<Stop> = JsonMissing.of(),
        @JsonProperty("stream") @ExcludeMissing stream: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("temperature")
        @ExcludeMissing
        temperature: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tool_choice")
        @ExcludeMissing
        toolChoice: JsonField<ToolChoice> = JsonMissing.of(),
        @JsonProperty("tools") @ExcludeMissing tools: JsonField<List<Tool>> = JsonMissing.of(),
        @JsonProperty("top_logprobs")
        @ExcludeMissing
        topLogprobs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("top_p") @ExcludeMissing topP: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("use_beam_search")
        @ExcludeMissing
        useBeamSearch: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        messages,
        apiKeyRef,
        bestOf,
        earlyStopping,
        enableThinking,
        frequencyPenalty,
        lengthPenalty,
        logprobs,
        maxTokens,
        minP,
        mode,
        model,
        n,
        presencePenalty,
        reasoningEffort,
        region,
        responseFormat,
        seed,
        serviceTier,
        stop,
        stream,
        temperature,
        toolChoice,
        tools,
        topLogprobs,
        topP,
        useBeamSearch,
        mutableMapOf(),
    )

    /**
     * A list of the previous chat messages for context.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messages(): List<Message> = messages.getRequired("messages")

    /**
     * If you are using an external inference provider like xAI or OpenAI, this field allows you to
     * pass along a reference to your API key. After creating an
     * [integration secret](https://developers.telnyx.com/api-reference/integration-secrets/create-a-secret)
     * for you API key, pass the secret's `identifier` in this field.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKeyRef(): Optional<String> = apiKeyRef.getOptional("api_key_ref")

    /**
     * This is used with `use_beam_search` to determine how many candidate beams to explore.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bestOf(): Optional<Long> = bestOf.getOptional("best_of")

    /**
     * This is used with `use_beam_search`. If `true`, generation stops as soon as there are
     * `best_of` complete candidates; if `false`, a heuristic is applied and the generation stops
     * when is it very unlikely to find better candidates.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun earlyStopping(): Optional<Boolean> = earlyStopping.getOptional("early_stopping")

    /**
     * Whether to enable the thinking/reasoning phase for models that support it (e.g., QwQ, Qwen3).
     * When set to false, the model will skip the internal reasoning step and respond directly,
     * which can reduce latency. Defaults to true.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableThinking(): Optional<Boolean> = enableThinking.getOptional("enable_thinking")

    /**
     * Higher values will penalize the model from repeating the same output tokens.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequencyPenalty(): Optional<Double> = frequencyPenalty.getOptional("frequency_penalty")

    /**
     * This is used with `use_beam_search` to prefer shorter or longer completions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lengthPenalty(): Optional<Double> = lengthPenalty.getOptional("length_penalty")

    /**
     * Whether to return log probabilities of the output tokens or not. If true, returns the log
     * probabilities of each output token returned in the `content` of `message`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logprobs(): Optional<Boolean> = logprobs.getOptional("logprobs")

    /**
     * Maximum number of completion tokens the model should generate.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxTokens(): Optional<Long> = maxTokens.getOptional("max_tokens")

    /**
     * This is an alternative to `top_p` that
     * [many prefer](https://github.com/huggingface/transformers/issues/27670). Must be in [0, 1].
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minP(): Optional<Double> = minP.getOptional("min_p")

    /**
     * How strictly `region` is applied. `preferred` (the default when `region` is set) tries that
     * region first and falls back to another when the model cannot be served there, so a request
     * that would have succeeded still succeeds. `strict` pins the request: it is served from that
     * region or it fails with a 422, never redirected to another region. Requires `region`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mode(): Optional<Mode> = mode.getOptional("mode")

    /**
     * The language model to chat with.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * This will return multiple choices for you instead of a single chat completion.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun n(): Optional<Double> = n.getOptional("n")

    /**
     * Higher values will penalize the model from repeating the same output tokens.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presencePenalty(): Optional<Double> = presencePenalty.getOptional("presence_penalty")

    /**
     * Controls the reasoning effort for models that support it. When set, the model spends more or
     * less compute on internal reasoning before generating its response. Supported values: none,
     * minimal, low, medium, high, xhigh, max. Not all models support all values; unsupported values
     * are rejected with a 400 error. When omitted, reasoning models use their default effort level.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reasoningEffort(): Optional<ReasoningEffort> =
        reasoningEffort.getOptional("reasoning_effort")

    /**
     * Optional data-residency region the request should be served from, using the same vocabulary
     * as your account's Data Locality setting. Behavior depends on `mode`. Supported for
     * Telnyx-hosted models only: a request routed to an external provider never passes through
     * Telnyx model routing, so a region cannot be enforced for it. Omit for today's latency-based
     * routing.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun region(): Optional<Region> = region.getOptional("region")

    /**
     * Controls the format of the model output. `json_object` guarantees valid JSON output without
     * defining a schema; `json_schema` constrains the output to the JSON schema you supply via the
     * `json_schema` property and is the supported way to get guaranteed structured output on
     * Telnyx-hosted models.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseFormat(): Optional<ResponseFormat> = responseFormat.getOptional("response_format")

    /**
     * If specified, the system will make a best effort to sample deterministically, such that
     * repeated requests with the same `seed` and parameters should return the same result.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seed(): Optional<Long> = seed.getOptional("seed")

    /**
     * The service tier to use for this request. Supported values vary by model; use `GET
     * /v2/ai/openai/models` and inspect the model's `service_tiers` field. If omitted,
     * Telnyx-hosted models use `default`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceTier(): Optional<String> = serviceTier.getOptional("service_tier")

    /**
     * Up to 4 sequences where the API will stop generating further tokens. The returned text will
     * not contain the stop sequence.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stop(): Optional<Stop> = stop.getOptional("stop")

    /**
     * Whether or not to stream data-only server-sent events as they become available.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stream(): Optional<Boolean> = stream.getOptional("stream")

    /**
     * Adjusts the "creativity" of the model. Lower values make the model more deterministic and
     * repetitive, while higher values make the model more random and creative.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun temperature(): Optional<Double> = temperature.getOptional("temperature")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolChoice(): Optional<ToolChoice> = toolChoice.getOptional("tool_choice")

    /**
     * The `function` tool type follows the same schema as the
     * [OpenAI Chat Completions API](https://platform.openai.com/docs/api-reference/chat). The
     * `retrieval` tool type is unique to Telnyx. You may pass a list of
     * [embedded storage buckets](https://developers.telnyx.com/api-reference/embeddings/embed-documents)
     * for retrieval-augmented generation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tools(): Optional<List<Tool>> = tools.getOptional("tools")

    /**
     * This is used with `logprobs`. An integer between 0 and 20 specifying the number of most
     * likely tokens to return at each token position, each with an associated log probability.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topLogprobs(): Optional<Long> = topLogprobs.getOptional("top_logprobs")

    /**
     * An alternative or complement to `temperature`. This adjusts how many of the top possibilities
     * to consider.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topP(): Optional<Double> = topP.getOptional("top_p")

    /**
     * Setting this to `true` will allow the model to
     * [explore more completion options](https://huggingface.co/blog/how-to-generate#beam-search).
     * This is not supported by OpenAI.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useBeamSearch(): Optional<Boolean> = useBeamSearch.getOptional("use_beam_search")

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messages") @ExcludeMissing fun _messages(): JsonField<List<Message>> = messages

    /**
     * Returns the raw JSON value of [apiKeyRef].
     *
     * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_key_ref") @ExcludeMissing fun _apiKeyRef(): JsonField<String> = apiKeyRef

    /**
     * Returns the raw JSON value of [bestOf].
     *
     * Unlike [bestOf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("best_of") @ExcludeMissing fun _bestOf(): JsonField<Long> = bestOf

    /**
     * Returns the raw JSON value of [earlyStopping].
     *
     * Unlike [earlyStopping], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("early_stopping")
    @ExcludeMissing
    fun _earlyStopping(): JsonField<Boolean> = earlyStopping

    /**
     * Returns the raw JSON value of [enableThinking].
     *
     * Unlike [enableThinking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enable_thinking")
    @ExcludeMissing
    fun _enableThinking(): JsonField<Boolean> = enableThinking

    /**
     * Returns the raw JSON value of [frequencyPenalty].
     *
     * Unlike [frequencyPenalty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("frequency_penalty")
    @ExcludeMissing
    fun _frequencyPenalty(): JsonField<Double> = frequencyPenalty

    /**
     * Returns the raw JSON value of [lengthPenalty].
     *
     * Unlike [lengthPenalty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("length_penalty")
    @ExcludeMissing
    fun _lengthPenalty(): JsonField<Double> = lengthPenalty

    /**
     * Returns the raw JSON value of [logprobs].
     *
     * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Boolean> = logprobs

    /**
     * Returns the raw JSON value of [maxTokens].
     *
     * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens(): JsonField<Long> = maxTokens

    /**
     * Returns the raw JSON value of [minP].
     *
     * Unlike [minP], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("min_p") @ExcludeMissing fun _minP(): JsonField<Double> = minP

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [n].
     *
     * Unlike [n], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("n") @ExcludeMissing fun _n(): JsonField<Double> = n

    /**
     * Returns the raw JSON value of [presencePenalty].
     *
     * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("presence_penalty")
    @ExcludeMissing
    fun _presencePenalty(): JsonField<Double> = presencePenalty

    /**
     * Returns the raw JSON value of [reasoningEffort].
     *
     * Unlike [reasoningEffort], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reasoning_effort")
    @ExcludeMissing
    fun _reasoningEffort(): JsonField<ReasoningEffort> = reasoningEffort

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<Region> = region

    /**
     * Returns the raw JSON value of [responseFormat].
     *
     * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response_format")
    @ExcludeMissing
    fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

    /**
     * Returns the raw JSON value of [seed].
     *
     * Unlike [seed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seed") @ExcludeMissing fun _seed(): JsonField<Long> = seed

    /**
     * Returns the raw JSON value of [serviceTier].
     *
     * Unlike [serviceTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_tier")
    @ExcludeMissing
    fun _serviceTier(): JsonField<String> = serviceTier

    /**
     * Returns the raw JSON value of [stop].
     *
     * Unlike [stop], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stop") @ExcludeMissing fun _stop(): JsonField<Stop> = stop

    /**
     * Returns the raw JSON value of [stream].
     *
     * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("temperature") @ExcludeMissing fun _temperature(): JsonField<Double> = temperature

    /**
     * Returns the raw JSON value of [toolChoice].
     *
     * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_choice")
    @ExcludeMissing
    fun _toolChoice(): JsonField<ToolChoice> = toolChoice

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<Tool>> = tools

    /**
     * Returns the raw JSON value of [topLogprobs].
     *
     * Unlike [topLogprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top_logprobs") @ExcludeMissing fun _topLogprobs(): JsonField<Long> = topLogprobs

    /**
     * Returns the raw JSON value of [topP].
     *
     * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

    /**
     * Returns the raw JSON value of [useBeamSearch].
     *
     * Unlike [useBeamSearch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("use_beam_search")
    @ExcludeMissing
    fun _useBeamSearch(): JsonField<Boolean> = useBeamSearch

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
         * Returns a mutable builder for constructing an instance of [ChatCompletionRequest].
         *
         * The following fields are required:
         * ```java
         * .messages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatCompletionRequest]. */
    class Builder internal constructor() {

        private var messages: JsonField<MutableList<Message>>? = null
        private var apiKeyRef: JsonField<String> = JsonMissing.of()
        private var bestOf: JsonField<Long> = JsonMissing.of()
        private var earlyStopping: JsonField<Boolean> = JsonMissing.of()
        private var enableThinking: JsonField<Boolean> = JsonMissing.of()
        private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
        private var lengthPenalty: JsonField<Double> = JsonMissing.of()
        private var logprobs: JsonField<Boolean> = JsonMissing.of()
        private var maxTokens: JsonField<Long> = JsonMissing.of()
        private var minP: JsonField<Double> = JsonMissing.of()
        private var mode: JsonField<Mode> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var n: JsonField<Double> = JsonMissing.of()
        private var presencePenalty: JsonField<Double> = JsonMissing.of()
        private var reasoningEffort: JsonField<ReasoningEffort> = JsonMissing.of()
        private var region: JsonField<Region> = JsonMissing.of()
        private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
        private var seed: JsonField<Long> = JsonMissing.of()
        private var serviceTier: JsonField<String> = JsonMissing.of()
        private var stop: JsonField<Stop> = JsonMissing.of()
        private var stream: JsonField<Boolean> = JsonMissing.of()
        private var temperature: JsonField<Double> = JsonMissing.of()
        private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
        private var tools: JsonField<MutableList<Tool>>? = null
        private var topLogprobs: JsonField<Long> = JsonMissing.of()
        private var topP: JsonField<Double> = JsonMissing.of()
        private var useBeamSearch: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatCompletionRequest: ChatCompletionRequest) = apply {
            messages = chatCompletionRequest.messages.map { it.toMutableList() }
            apiKeyRef = chatCompletionRequest.apiKeyRef
            bestOf = chatCompletionRequest.bestOf
            earlyStopping = chatCompletionRequest.earlyStopping
            enableThinking = chatCompletionRequest.enableThinking
            frequencyPenalty = chatCompletionRequest.frequencyPenalty
            lengthPenalty = chatCompletionRequest.lengthPenalty
            logprobs = chatCompletionRequest.logprobs
            maxTokens = chatCompletionRequest.maxTokens
            minP = chatCompletionRequest.minP
            mode = chatCompletionRequest.mode
            model = chatCompletionRequest.model
            n = chatCompletionRequest.n
            presencePenalty = chatCompletionRequest.presencePenalty
            reasoningEffort = chatCompletionRequest.reasoningEffort
            region = chatCompletionRequest.region
            responseFormat = chatCompletionRequest.responseFormat
            seed = chatCompletionRequest.seed
            serviceTier = chatCompletionRequest.serviceTier
            stop = chatCompletionRequest.stop
            stream = chatCompletionRequest.stream
            temperature = chatCompletionRequest.temperature
            toolChoice = chatCompletionRequest.toolChoice
            tools = chatCompletionRequest.tools.map { it.toMutableList() }
            topLogprobs = chatCompletionRequest.topLogprobs
            topP = chatCompletionRequest.topP
            useBeamSearch = chatCompletionRequest.useBeamSearch
            additionalProperties = chatCompletionRequest.additionalProperties.toMutableMap()
        }

        /** A list of the previous chat messages for context. */
        fun messages(messages: List<Message>) = messages(JsonField.of(messages))

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed `List<Message>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messages(messages: JsonField<List<Message>>) = apply {
            this.messages = messages.map { it.toMutableList() }
        }

        /**
         * Adds a single [Message] to [messages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessage(message: Message) = apply {
            messages =
                (messages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("messages", it).add(message)
                }
        }

        /**
         * If you are using an external inference provider like xAI or OpenAI, this field allows you
         * to pass along a reference to your API key. After creating an
         * [integration secret](https://developers.telnyx.com/api-reference/integration-secrets/create-a-secret)
         * for you API key, pass the secret's `identifier` in this field.
         */
        fun apiKeyRef(apiKeyRef: String) = apiKeyRef(JsonField.of(apiKeyRef))

        /**
         * Sets [Builder.apiKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apiKeyRef(apiKeyRef: JsonField<String>) = apply { this.apiKeyRef = apiKeyRef }

        /** This is used with `use_beam_search` to determine how many candidate beams to explore. */
        fun bestOf(bestOf: Long) = bestOf(JsonField.of(bestOf))

        /**
         * Sets [Builder.bestOf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bestOf] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bestOf(bestOf: JsonField<Long>) = apply { this.bestOf = bestOf }

        /**
         * This is used with `use_beam_search`. If `true`, generation stops as soon as there are
         * `best_of` complete candidates; if `false`, a heuristic is applied and the generation
         * stops when is it very unlikely to find better candidates.
         */
        fun earlyStopping(earlyStopping: Boolean) = earlyStopping(JsonField.of(earlyStopping))

        /**
         * Sets [Builder.earlyStopping] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earlyStopping] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun earlyStopping(earlyStopping: JsonField<Boolean>) = apply {
            this.earlyStopping = earlyStopping
        }

        /**
         * Whether to enable the thinking/reasoning phase for models that support it (e.g., QwQ,
         * Qwen3). When set to false, the model will skip the internal reasoning step and respond
         * directly, which can reduce latency. Defaults to true.
         */
        fun enableThinking(enableThinking: Boolean) = enableThinking(JsonField.of(enableThinking))

        /**
         * Sets [Builder.enableThinking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableThinking] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableThinking(enableThinking: JsonField<Boolean>) = apply {
            this.enableThinking = enableThinking
        }

        /** Higher values will penalize the model from repeating the same output tokens. */
        fun frequencyPenalty(frequencyPenalty: Double) =
            frequencyPenalty(JsonField.of(frequencyPenalty))

        /**
         * Sets [Builder.frequencyPenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencyPenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
            this.frequencyPenalty = frequencyPenalty
        }

        /** This is used with `use_beam_search` to prefer shorter or longer completions. */
        fun lengthPenalty(lengthPenalty: Double) = lengthPenalty(JsonField.of(lengthPenalty))

        /**
         * Sets [Builder.lengthPenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lengthPenalty] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lengthPenalty(lengthPenalty: JsonField<Double>) = apply {
            this.lengthPenalty = lengthPenalty
        }

        /**
         * Whether to return log probabilities of the output tokens or not. If true, returns the log
         * probabilities of each output token returned in the `content` of `message`.
         */
        fun logprobs(logprobs: Boolean) = logprobs(JsonField.of(logprobs))

        /**
         * Sets [Builder.logprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logprobs] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logprobs(logprobs: JsonField<Boolean>) = apply { this.logprobs = logprobs }

        /** Maximum number of completion tokens the model should generate. */
        fun maxTokens(maxTokens: Long) = maxTokens(JsonField.of(maxTokens))

        /**
         * Sets [Builder.maxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

        /**
         * This is an alternative to `top_p` that
         * [many prefer](https://github.com/huggingface/transformers/issues/27670). Must be in
         * [0, 1].
         */
        fun minP(minP: Double) = minP(JsonField.of(minP))

        /**
         * Sets [Builder.minP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minP(minP: JsonField<Double>) = apply { this.minP = minP }

        /**
         * How strictly `region` is applied. `preferred` (the default when `region` is set) tries
         * that region first and falls back to another when the model cannot be served there, so a
         * request that would have succeeded still succeeds. `strict` pins the request: it is served
         * from that region or it fails with a 422, never redirected to another region. Requires
         * `region`.
         */
        fun mode(mode: Mode) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

        /** The language model to chat with. */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /** This will return multiple choices for you instead of a single chat completion. */
        fun n(n: Double) = n(JsonField.of(n))

        /**
         * Sets [Builder.n] to an arbitrary JSON value.
         *
         * You should usually call [Builder.n] with a well-typed [Double] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun n(n: JsonField<Double>) = apply { this.n = n }

        /** Higher values will penalize the model from repeating the same output tokens. */
        fun presencePenalty(presencePenalty: Double) =
            presencePenalty(JsonField.of(presencePenalty))

        /**
         * Sets [Builder.presencePenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presencePenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
            this.presencePenalty = presencePenalty
        }

        /**
         * Controls the reasoning effort for models that support it. When set, the model spends more
         * or less compute on internal reasoning before generating its response. Supported values:
         * none, minimal, low, medium, high, xhigh, max. Not all models support all values;
         * unsupported values are rejected with a 400 error. When omitted, reasoning models use
         * their default effort level.
         */
        fun reasoningEffort(reasoningEffort: ReasoningEffort) =
            reasoningEffort(JsonField.of(reasoningEffort))

        /**
         * Sets [Builder.reasoningEffort] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasoningEffort] with a well-typed [ReasoningEffort]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun reasoningEffort(reasoningEffort: JsonField<ReasoningEffort>) = apply {
            this.reasoningEffort = reasoningEffort
        }

        /**
         * Optional data-residency region the request should be served from, using the same
         * vocabulary as your account's Data Locality setting. Behavior depends on `mode`. Supported
         * for Telnyx-hosted models only: a request routed to an external provider never passes
         * through Telnyx model routing, so a region cannot be enforced for it. Omit for today's
         * latency-based routing.
         */
        fun region(region: Region) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [Region] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<Region>) = apply { this.region = region }

        /**
         * Controls the format of the model output. `json_object` guarantees valid JSON output
         * without defining a schema; `json_schema` constrains the output to the JSON schema you
         * supply via the `json_schema` property and is the supported way to get guaranteed
         * structured output on Telnyx-hosted models.
         */
        fun responseFormat(responseFormat: ResponseFormat) =
            responseFormat(JsonField.of(responseFormat))

        /**
         * Sets [Builder.responseFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            this.responseFormat = responseFormat
        }

        /** Alias for calling [responseFormat] with `ResponseFormat.ofText()`. */
        fun responseFormatText() = responseFormat(ResponseFormat.ofText())

        /** Alias for calling [responseFormat] with `ResponseFormat.ofJsonObject()`. */
        fun responseFormatJsonObject() = responseFormat(ResponseFormat.ofJsonObject())

        /**
         * Alias for calling [responseFormat] with
         * `ResponseFormat.ofJsonSchemaParam(jsonSchemaParam)`.
         */
        fun responseFormat(jsonSchemaParam: ResponseFormat.ResponseFormatJsonSchemaParam) =
            responseFormat(ResponseFormat.ofJsonSchemaParam(jsonSchemaParam))

        /**
         * If specified, the system will make a best effort to sample deterministically, such that
         * repeated requests with the same `seed` and parameters should return the same result.
         */
        fun seed(seed: Long) = seed(JsonField.of(seed))

        /**
         * Sets [Builder.seed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seed] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun seed(seed: JsonField<Long>) = apply { this.seed = seed }

        /**
         * The service tier to use for this request. Supported values vary by model; use `GET
         * /v2/ai/openai/models` and inspect the model's `service_tiers` field. If omitted,
         * Telnyx-hosted models use `default`.
         */
        fun serviceTier(serviceTier: String) = serviceTier(JsonField.of(serviceTier))

        /**
         * Sets [Builder.serviceTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceTier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serviceTier(serviceTier: JsonField<String>) = apply { this.serviceTier = serviceTier }

        /**
         * Up to 4 sequences where the API will stop generating further tokens. The returned text
         * will not contain the stop sequence.
         */
        fun stop(stop: Stop) = stop(JsonField.of(stop))

        /**
         * Sets [Builder.stop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stop] with a well-typed [Stop] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stop(stop: JsonField<Stop>) = apply { this.stop = stop }

        /** Alias for calling [stop] with `Stop.ofString(string)`. */
        fun stop(string: String) = stop(Stop.ofString(string))

        /** Alias for calling [stop] with `Stop.ofStrings(strings)`. */
        fun stopOfStrings(strings: List<String>) = stop(Stop.ofStrings(strings))

        /** Whether or not to stream data-only server-sent events as they become available. */
        fun stream(stream: Boolean) = stream(JsonField.of(stream))

        /**
         * Sets [Builder.stream] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stream] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

        /**
         * Adjusts the "creativity" of the model. Lower values make the model more deterministic and
         * repetitive, while higher values make the model more random and creative.
         */
        fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { this.temperature = temperature }

        fun toolChoice(toolChoice: ToolChoice) = toolChoice(JsonField.of(toolChoice))

        /**
         * Sets [Builder.toolChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply { this.toolChoice = toolChoice }

        /**
         * The `function` tool type follows the same schema as the
         * [OpenAI Chat Completions API](https://platform.openai.com/docs/api-reference/chat). The
         * `retrieval` tool type is unique to Telnyx. You may pass a list of
         * [embedded storage buckets](https://developers.telnyx.com/api-reference/embeddings/embed-documents)
         * for retrieval-augmented generation.
         */
        fun tools(tools: List<Tool>) = tools(JsonField.of(tools))

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<Tool>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tools(tools: JsonField<List<Tool>>) = apply {
            this.tools = tools.map { it.toMutableList() }
        }

        /**
         * Adds a single [Tool] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTool(tool: Tool) = apply {
            tools =
                (tools ?: JsonField.of(mutableListOf())).also { checkKnown("tools", it).add(tool) }
        }

        /** Alias for calling [addTool] with `Tool.ofFunction(function)`. */
        fun addTool(function: Tool.ChatCompletionTool) = addTool(Tool.ofFunction(function))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * Tool.ChatCompletionTool.builder()
         *     .function(function)
         *     .build()
         * ```
         */
        fun addFunctionTool(function: Tool.ChatCompletionTool.Function) =
            addTool(Tool.ChatCompletionTool.builder().function(function).build())

        /** Alias for calling [addTool] with `Tool.ofRetrieval(retrieval)`. */
        fun addTool(retrieval: Tool.Retrieval) = addTool(Tool.ofRetrieval(retrieval))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * Tool.Retrieval.builder()
         *     .retrieval(retrieval)
         *     .build()
         * ```
         */
        fun addRetrievalTool(retrieval: BucketIds) =
            addTool(Tool.Retrieval.builder().retrieval(retrieval).build())

        /**
         * This is used with `logprobs`. An integer between 0 and 20 specifying the number of most
         * likely tokens to return at each token position, each with an associated log probability.
         */
        fun topLogprobs(topLogprobs: Long) = topLogprobs(JsonField.of(topLogprobs))

        /**
         * Sets [Builder.topLogprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topLogprobs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun topLogprobs(topLogprobs: JsonField<Long>) = apply { this.topLogprobs = topLogprobs }

        /**
         * An alternative or complement to `temperature`. This adjusts how many of the top
         * possibilities to consider.
         */
        fun topP(topP: Double) = topP(JsonField.of(topP))

        /**
         * Sets [Builder.topP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

        /**
         * Setting this to `true` will allow the model to
         * [explore more completion options](https://huggingface.co/blog/how-to-generate#beam-search).
         * This is not supported by OpenAI.
         */
        fun useBeamSearch(useBeamSearch: Boolean) = useBeamSearch(JsonField.of(useBeamSearch))

        /**
         * Sets [Builder.useBeamSearch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useBeamSearch] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useBeamSearch(useBeamSearch: JsonField<Boolean>) = apply {
            this.useBeamSearch = useBeamSearch
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
         * Returns an immutable instance of [ChatCompletionRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .messages()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatCompletionRequest =
            ChatCompletionRequest(
                checkRequired("messages", messages).map { it.toImmutable() },
                apiKeyRef,
                bestOf,
                earlyStopping,
                enableThinking,
                frequencyPenalty,
                lengthPenalty,
                logprobs,
                maxTokens,
                minP,
                mode,
                model,
                n,
                presencePenalty,
                reasoningEffort,
                region,
                responseFormat,
                seed,
                serviceTier,
                stop,
                stream,
                temperature,
                toolChoice,
                (tools ?: JsonMissing.of()).map { it.toImmutable() },
                topLogprobs,
                topP,
                useBeamSearch,
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
    fun validate(): ChatCompletionRequest = apply {
        if (validated) {
            return@apply
        }

        messages().forEach { it.validate() }
        apiKeyRef()
        bestOf()
        earlyStopping()
        enableThinking()
        frequencyPenalty()
        lengthPenalty()
        logprobs()
        maxTokens()
        minP()
        mode().ifPresent { it.validate() }
        model()
        n()
        presencePenalty()
        reasoningEffort().ifPresent { it.validate() }
        region().ifPresent { it.validate() }
        responseFormat().ifPresent { it.validate() }
        seed()
        serviceTier()
        stop().ifPresent { it.validate() }
        stream()
        temperature()
        toolChoice().ifPresent { it.validate() }
        tools().ifPresent { it.forEach { it.validate() } }
        topLogprobs()
        topP()
        useBeamSearch()
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
        (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (apiKeyRef.asKnown().isPresent) 1 else 0) +
            (if (bestOf.asKnown().isPresent) 1 else 0) +
            (if (earlyStopping.asKnown().isPresent) 1 else 0) +
            (if (enableThinking.asKnown().isPresent) 1 else 0) +
            (if (frequencyPenalty.asKnown().isPresent) 1 else 0) +
            (if (lengthPenalty.asKnown().isPresent) 1 else 0) +
            (if (logprobs.asKnown().isPresent) 1 else 0) +
            (if (maxTokens.asKnown().isPresent) 1 else 0) +
            (if (minP.asKnown().isPresent) 1 else 0) +
            (mode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (n.asKnown().isPresent) 1 else 0) +
            (if (presencePenalty.asKnown().isPresent) 1 else 0) +
            (reasoningEffort.asKnown().getOrNull()?.validity() ?: 0) +
            (region.asKnown().getOrNull()?.validity() ?: 0) +
            (responseFormat.asKnown().getOrNull()?.validity() ?: 0) +
            (if (seed.asKnown().isPresent) 1 else 0) +
            (if (serviceTier.asKnown().isPresent) 1 else 0) +
            (stop.asKnown().getOrNull()?.validity() ?: 0) +
            (if (stream.asKnown().isPresent) 1 else 0) +
            (if (temperature.asKnown().isPresent) 1 else 0) +
            (toolChoice.asKnown().getOrNull()?.validity() ?: 0) +
            (tools.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (topLogprobs.asKnown().isPresent) 1 else 0) +
            (if (topP.asKnown().isPresent) 1 else 0) +
            (if (useBeamSearch.asKnown().isPresent) 1 else 0)

    class Message
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val content: JsonField<Content>,
        private val role: JsonField<Role>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content") @ExcludeMissing content: JsonField<Content> = JsonMissing.of(),
            @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
        ) : this(content, role, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun content(): Content = content.getRequired("content")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun role(): Role = role.getRequired("role")

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

        /**
         * Returns the raw JSON value of [role].
         *
         * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

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
             * Returns a mutable builder for constructing an instance of [Message].
             *
             * The following fields are required:
             * ```java
             * .content()
             * .role()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Message]. */
        class Builder internal constructor() {

            private var content: JsonField<Content>? = null
            private var role: JsonField<Role>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(message: Message) = apply {
                content = message.content
                role = message.role
                additionalProperties = message.additionalProperties.toMutableMap()
            }

            fun content(content: Content) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [Content] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<Content>) = apply { this.content = content }

            /** Alias for calling [content] with `Content.ofString(string)`. */
            fun content(string: String) = content(Content.ofString(string))

            /**
             * Alias for calling [content] with `Content.ofTextAndImageArray(textAndImageArray)`.
             */
            fun contentOfTextAndImageArray(textAndImageArray: List<Content.TextAndImage>) =
                content(Content.ofTextAndImageArray(textAndImageArray))

            fun role(role: Role) = role(JsonField.of(role))

            /**
             * Sets [Builder.role] to an arbitrary JSON value.
             *
             * You should usually call [Builder.role] with a well-typed [Role] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun role(role: JsonField<Role>) = apply { this.role = role }

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
             * Returns an immutable instance of [Message].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .content()
             * .role()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Message =
                Message(
                    checkRequired("content", content),
                    checkRequired("role", role),
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
        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            content().validate()
            role().validate()
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
            (content.asKnown().getOrNull()?.validity() ?: 0) +
                (role.asKnown().getOrNull()?.validity() ?: 0)

        @JsonDeserialize(using = Content.Deserializer::class)
        @JsonSerialize(using = Content.Serializer::class)
        class Content
        private constructor(
            private val string: String? = null,
            private val textAndImageArray: List<TextAndImage>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun textAndImageArray(): Optional<List<TextAndImage>> =
                Optional.ofNullable(textAndImageArray)

            fun isString(): Boolean = string != null

            fun isTextAndImageArray(): Boolean = textAndImageArray != null

            fun asString(): String = string.getOrThrow("string")

            fun asTextAndImageArray(): List<TextAndImage> =
                textAndImageArray.getOrThrow("textAndImageArray")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = content.accept(new Content.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitString(String string) {
             *         return Optional.of(string.toString());
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
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    textAndImageArray != null -> visitor.visitTextAndImageArray(textAndImageArray)
                    else -> visitor.unknown(_json)
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
            fun validate(): Content = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitTextAndImageArray(textAndImageArray: List<TextAndImage>) {
                            textAndImageArray.forEach { it.validate() }
                        }
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
                        override fun visitString(string: String) = 1

                        override fun visitTextAndImageArray(textAndImageArray: List<TextAndImage>) =
                            textAndImageArray.sumOf { it.validity().toInt() }

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Content &&
                    string == other.string &&
                    textAndImageArray == other.textAndImageArray
            }

            override fun hashCode(): Int = Objects.hash(string, textAndImageArray)

            override fun toString(): String =
                when {
                    string != null -> "Content{string=$string}"
                    textAndImageArray != null -> "Content{textAndImageArray=$textAndImageArray}"
                    _json != null -> "Content{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Content")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = Content(string = string)

                @JvmStatic
                fun ofTextAndImageArray(textAndImageArray: List<TextAndImage>) =
                    Content(textAndImageArray = textAndImageArray.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [Content] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitTextAndImageArray(textAndImageArray: List<TextAndImage>): T

                /**
                 * Maps an unknown variant of [Content] to a value of type [T].
                 *
                 * An instance of [Content] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown Content: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Content {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Content(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<TextAndImage>>())?.let {
                                    Content(textAndImageArray = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Content(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Content>(Content::class) {

                override fun serialize(
                    value: Content,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.textAndImageArray != null ->
                            generator.writeObject(value.textAndImageArray)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Content")
                    }
                }
            }

            class TextAndImage
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val type: JsonField<Type>,
                private val imageUrl: JsonField<String>,
                private val text: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("image_url")
                    @ExcludeMissing
                    imageUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
                ) : this(type, imageUrl, text, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun imageUrl(): Optional<String> = imageUrl.getOptional("image_url")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun text(): Optional<String> = text.getOptional("text")

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [imageUrl].
                 *
                 * Unlike [imageUrl], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("image_url")
                @ExcludeMissing
                fun _imageUrl(): JsonField<String> = imageUrl

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
                     * Returns a mutable builder for constructing an instance of [TextAndImage].
                     *
                     * The following fields are required:
                     * ```java
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TextAndImage]. */
                class Builder internal constructor() {

                    private var type: JsonField<Type>? = null
                    private var imageUrl: JsonField<String> = JsonMissing.of()
                    private var text: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(textAndImage: TextAndImage) = apply {
                        type = textAndImage.type
                        imageUrl = textAndImage.imageUrl
                        text = textAndImage.text
                        additionalProperties = textAndImage.additionalProperties.toMutableMap()
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun imageUrl(imageUrl: String) = imageUrl(JsonField.of(imageUrl))

                    /**
                     * Sets [Builder.imageUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.imageUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun imageUrl(imageUrl: JsonField<String>) = apply { this.imageUrl = imageUrl }

                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

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
                     * Returns an immutable instance of [TextAndImage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): TextAndImage =
                        TextAndImage(
                            checkRequired("type", type),
                            imageUrl,
                            text,
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): TextAndImage = apply {
                    if (validated) {
                        return@apply
                    }

                    type().validate()
                    imageUrl()
                    text()
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
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (imageUrl.asKnown().isPresent) 1 else 0) +
                        (if (text.asKnown().isPresent) 1 else 0)

                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val TEXT = of("text")

                        @JvmField val IMAGE_URL = of("image_url")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        TEXT,
                        IMAGE_URL,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        TEXT,
                        IMAGE_URL,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            TEXT -> Value.TEXT
                            IMAGE_URL -> Value.IMAGE_URL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            TEXT -> Known.TEXT
                            IMAGE_URL -> Known.IMAGE_URL
                            else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Type = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TextAndImage &&
                        type == other.type &&
                        imageUrl == other.imageUrl &&
                        text == other.text &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(type, imageUrl, text, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TextAndImage{type=$type, imageUrl=$imageUrl, text=$text, additionalProperties=$additionalProperties}"
            }
        }

        class Role @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SYSTEM = of("system")

                @JvmField val USER = of("user")

                @JvmField val ASSISTANT = of("assistant")

                @JvmField val TOOL = of("tool")

                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
            }

            /** An enum containing [Role]'s known values. */
            enum class Known {
                SYSTEM,
                USER,
                ASSISTANT,
                TOOL,
            }

            /**
             * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Role] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SYSTEM,
                USER,
                ASSISTANT,
                TOOL,
                /** An enum member indicating that [Role] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SYSTEM -> Value.SYSTEM
                    USER -> Value.USER
                    ASSISTANT -> Value.ASSISTANT
                    TOOL -> Value.TOOL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SYSTEM -> Known.SYSTEM
                    USER -> Known.USER
                    ASSISTANT -> Known.ASSISTANT
                    TOOL -> Known.TOOL
                    else -> throw TelnyxInvalidDataException("Unknown Role: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
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
            fun validate(): Role = apply {
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

                return other is Role && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Message &&
                content == other.content &&
                role == other.role &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(content, role, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Message{content=$content, role=$role, additionalProperties=$additionalProperties}"
    }

    /**
     * How strictly `region` is applied. `preferred` (the default when `region` is set) tries that
     * region first and falls back to another when the model cannot be served there, so a request
     * that would have succeeded still succeeds. `strict` pins the request: it is served from that
     * region or it fails with a 422, never redirected to another region. Requires `region`.
     */
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

            @JvmField val PREFERRED = of("preferred")

            @JvmField val STRICT = of("strict")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            PREFERRED,
            STRICT,
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
            PREFERRED,
            STRICT,
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
                PREFERRED -> Value.PREFERRED
                STRICT -> Value.STRICT
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
                PREFERRED -> Known.PREFERRED
                STRICT -> Known.STRICT
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

    /**
     * Controls the reasoning effort for models that support it. When set, the model spends more or
     * less compute on internal reasoning before generating its response. Supported values: none,
     * minimal, low, medium, high, xhigh, max. Not all models support all values; unsupported values
     * are rejected with a 400 error. When omitted, reasoning models use their default effort level.
     */
    class ReasoningEffort @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val NONE = of("none")

            @JvmField val MINIMAL = of("minimal")

            @JvmField val LOW = of("low")

            @JvmField val MEDIUM = of("medium")

            @JvmField val HIGH = of("high")

            @JvmField val XHIGH = of("xhigh")

            @JvmField val MAX = of("max")

            @JvmStatic fun of(value: String) = ReasoningEffort(JsonField.of(value))
        }

        /** An enum containing [ReasoningEffort]'s known values. */
        enum class Known {
            NONE,
            MINIMAL,
            LOW,
            MEDIUM,
            HIGH,
            XHIGH,
            MAX,
        }

        /**
         * An enum containing [ReasoningEffort]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReasoningEffort] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            MINIMAL,
            LOW,
            MEDIUM,
            HIGH,
            XHIGH,
            MAX,
            /**
             * An enum member indicating that [ReasoningEffort] was instantiated with an unknown
             * value.
             */
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
                NONE -> Value.NONE
                MINIMAL -> Value.MINIMAL
                LOW -> Value.LOW
                MEDIUM -> Value.MEDIUM
                HIGH -> Value.HIGH
                XHIGH -> Value.XHIGH
                MAX -> Value.MAX
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
                NONE -> Known.NONE
                MINIMAL -> Known.MINIMAL
                LOW -> Known.LOW
                MEDIUM -> Known.MEDIUM
                HIGH -> Known.HIGH
                XHIGH -> Known.XHIGH
                MAX -> Known.MAX
                else -> throw TelnyxInvalidDataException("Unknown ReasoningEffort: $value")
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
        fun validate(): ReasoningEffort = apply {
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

            return other is ReasoningEffort && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Optional data-residency region the request should be served from, using the same vocabulary
     * as your account's Data Locality setting. Behavior depends on `mode`. Supported for
     * Telnyx-hosted models only: a request routed to an external provider never passes through
     * Telnyx model routing, so a region cannot be enforced for it. Omit for today's latency-based
     * routing.
     */
    class Region @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val USA = of("USA")

            @JvmField val EU = of("EU")

            @JvmField val AUS = of("AUS")

            @JvmField val UAE = of("UAE")

            @JvmStatic fun of(value: String) = Region(JsonField.of(value))
        }

        /** An enum containing [Region]'s known values. */
        enum class Known {
            USA,
            EU,
            AUS,
            UAE,
        }

        /**
         * An enum containing [Region]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Region] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USA,
            EU,
            AUS,
            UAE,
            /** An enum member indicating that [Region] was instantiated with an unknown value. */
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
                USA -> Value.USA
                EU -> Value.EU
                AUS -> Value.AUS
                UAE -> Value.UAE
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
                USA -> Known.USA
                EU -> Known.EU
                AUS -> Known.AUS
                UAE -> Known.UAE
                else -> throw TelnyxInvalidDataException("Unknown Region: $value")
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
        fun validate(): Region = apply {
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

            return other is Region && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Controls the format of the model output. `json_object` guarantees valid JSON output without
     * defining a schema; `json_schema` constrains the output to the JSON schema you supply via the
     * `json_schema` property and is the supported way to get guaranteed structured output on
     * Telnyx-hosted models.
     */
    @JsonDeserialize(using = ResponseFormat.Deserializer::class)
    @JsonSerialize(using = ResponseFormat.Serializer::class)
    class ResponseFormat
    private constructor(
        private val text: JsonValue? = null,
        private val jsonObject: JsonValue? = null,
        private val jsonSchemaParam: ResponseFormatJsonSchemaParam? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Plain text output. */
        fun text(): Optional<JsonValue> = Optional.ofNullable(text)

        /** JSON mode: the model output is valid JSON, without a schema. */
        fun jsonObject(): Optional<JsonValue> = Optional.ofNullable(jsonObject)

        /**
         * Structured output: the model output is constrained to the JSON schema supplied in
         * `json_schema`.
         */
        fun jsonSchemaParam(): Optional<ResponseFormatJsonSchemaParam> =
            Optional.ofNullable(jsonSchemaParam)

        fun isText(): Boolean = text != null

        fun isJsonObject(): Boolean = jsonObject != null

        fun isJsonSchemaParam(): Boolean = jsonSchemaParam != null

        /** Plain text output. */
        fun asText(): JsonValue = text.getOrThrow("text")

        /** JSON mode: the model output is valid JSON, without a schema. */
        fun asJsonObject(): JsonValue = jsonObject.getOrThrow("jsonObject")

        /**
         * Structured output: the model output is constrained to the JSON schema supplied in
         * `json_schema`.
         */
        fun asJsonSchemaParam(): ResponseFormatJsonSchemaParam =
            jsonSchemaParam.getOrThrow("jsonSchemaParam")

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
         * Optional<String> result = responseFormat.accept(new ResponseFormat.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitText(JsonValue text) {
         *         return Optional.of(text.toString());
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
                text != null -> visitor.visitText(text)
                jsonObject != null -> visitor.visitJsonObject(jsonObject)
                jsonSchemaParam != null -> visitor.visitJsonSchemaParam(jsonSchemaParam)
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
        fun validate(): ResponseFormat = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitText(text: JsonValue) {
                        text.let {
                            if (it != JsonValue.from(mapOf("type" to "text"))) {
                                throw TelnyxInvalidDataException("'text' is invalid, received $it")
                            }
                        }
                    }

                    override fun visitJsonObject(jsonObject: JsonValue) {
                        jsonObject.let {
                            if (it != JsonValue.from(mapOf("type" to "json_object"))) {
                                throw TelnyxInvalidDataException(
                                    "'jsonObject' is invalid, received $it"
                                )
                            }
                        }
                    }

                    override fun visitJsonSchemaParam(
                        jsonSchemaParam: ResponseFormatJsonSchemaParam
                    ) {
                        jsonSchemaParam.validate()
                    }
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
                    override fun visitText(text: JsonValue) =
                        text.let { if (it == JsonValue.from(mapOf("type" to "text"))) 1 else 0 }

                    override fun visitJsonObject(jsonObject: JsonValue) =
                        jsonObject.let {
                            if (it == JsonValue.from(mapOf("type" to "json_object"))) 1 else 0
                        }

                    override fun visitJsonSchemaParam(
                        jsonSchemaParam: ResponseFormatJsonSchemaParam
                    ) = jsonSchemaParam.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResponseFormat &&
                text == other.text &&
                jsonObject == other.jsonObject &&
                jsonSchemaParam == other.jsonSchemaParam
        }

        override fun hashCode(): Int = Objects.hash(text, jsonObject, jsonSchemaParam)

        override fun toString(): String =
            when {
                text != null -> "ResponseFormat{text=$text}"
                jsonObject != null -> "ResponseFormat{jsonObject=$jsonObject}"
                jsonSchemaParam != null -> "ResponseFormat{jsonSchemaParam=$jsonSchemaParam}"
                _json != null -> "ResponseFormat{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ResponseFormat")
            }

        companion object {

            /** Plain text output. */
            @JvmStatic fun ofText() = ResponseFormat(text = JsonValue.from(mapOf("type" to "text")))

            /** JSON mode: the model output is valid JSON, without a schema. */
            @JvmStatic
            fun ofJsonObject() =
                ResponseFormat(jsonObject = JsonValue.from(mapOf("type" to "json_object")))

            /**
             * Structured output: the model output is constrained to the JSON schema supplied in
             * `json_schema`.
             */
            @JvmStatic
            fun ofJsonSchemaParam(jsonSchemaParam: ResponseFormatJsonSchemaParam) =
                ResponseFormat(jsonSchemaParam = jsonSchemaParam)
        }

        /**
         * An interface that defines how to map each variant of [ResponseFormat] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            /** Plain text output. */
            fun visitText(text: JsonValue): T

            /** JSON mode: the model output is valid JSON, without a schema. */
            fun visitJsonObject(jsonObject: JsonValue): T

            /**
             * Structured output: the model output is constrained to the JSON schema supplied in
             * `json_schema`.
             */
            fun visitJsonSchemaParam(jsonSchemaParam: ResponseFormatJsonSchemaParam): T

            /**
             * Maps an unknown variant of [ResponseFormat] to a value of type [T].
             *
             * An instance of [ResponseFormat] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown ResponseFormat: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ResponseFormat>(ResponseFormat::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ResponseFormat {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                ?.let { ResponseFormat(text = it, _json = json) }
                                ?.takeIf { it.isValid() },
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                ?.let { ResponseFormat(jsonObject = it, _json = json) }
                                ?.takeIf { it.isValid() },
                            tryDeserialize(node, jacksonTypeRef<ResponseFormatJsonSchemaParam>())
                                ?.let { ResponseFormat(jsonSchemaParam = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ResponseFormat(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ResponseFormat>(ResponseFormat::class) {

            override fun serialize(
                value: ResponseFormat,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.text != null -> generator.writeObject(value.text)
                    value.jsonObject != null -> generator.writeObject(value.jsonObject)
                    value.jsonSchemaParam != null -> generator.writeObject(value.jsonSchemaParam)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ResponseFormat")
                }
            }
        }

        /**
         * Structured output: the model output is constrained to the JSON schema supplied in
         * `json_schema`.
         */
        class ResponseFormatJsonSchemaParam
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val jsonSchema: JsonField<JsonSchema>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("json_schema")
                @ExcludeMissing
                jsonSchema: JsonField<JsonSchema> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(jsonSchema, type, mutableMapOf())

            /**
             * The JSON schema configuration, required when `type` is `json_schema`. Matches the
             * [OpenAI structured outputs](https://platform.openai.com/docs/guides/structured-outputs)
             * `json_schema` response format.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun jsonSchema(): JsonSchema = jsonSchema.getRequired("json_schema")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("json_schema")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [jsonSchema].
             *
             * Unlike [jsonSchema], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("json_schema")
            @ExcludeMissing
            fun _jsonSchema(): JsonField<JsonSchema> = jsonSchema

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
                 * [ResponseFormatJsonSchemaParam].
                 *
                 * The following fields are required:
                 * ```java
                 * .jsonSchema()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ResponseFormatJsonSchemaParam]. */
            class Builder internal constructor() {

                private var jsonSchema: JsonField<JsonSchema>? = null
                private var type: JsonValue = JsonValue.from("json_schema")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(responseFormatJsonSchemaParam: ResponseFormatJsonSchemaParam) =
                    apply {
                        jsonSchema = responseFormatJsonSchemaParam.jsonSchema
                        type = responseFormatJsonSchemaParam.type
                        additionalProperties =
                            responseFormatJsonSchemaParam.additionalProperties.toMutableMap()
                    }

                /**
                 * The JSON schema configuration, required when `type` is `json_schema`. Matches the
                 * [OpenAI structured outputs](https://platform.openai.com/docs/guides/structured-outputs)
                 * `json_schema` response format.
                 */
                fun jsonSchema(jsonSchema: JsonSchema) = jsonSchema(JsonField.of(jsonSchema))

                /**
                 * Sets [Builder.jsonSchema] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.jsonSchema] with a well-typed [JsonSchema] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun jsonSchema(jsonSchema: JsonField<JsonSchema>) = apply {
                    this.jsonSchema = jsonSchema
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("json_schema")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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
                 * Returns an immutable instance of [ResponseFormatJsonSchemaParam].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .jsonSchema()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ResponseFormatJsonSchemaParam =
                    ResponseFormatJsonSchemaParam(
                        checkRequired("jsonSchema", jsonSchema),
                        type,
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
            fun validate(): ResponseFormatJsonSchemaParam = apply {
                if (validated) {
                    return@apply
                }

                jsonSchema().validate()
                _type().let {
                    if (it != JsonValue.from("json_schema")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
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
                (jsonSchema.asKnown().getOrNull()?.validity() ?: 0) +
                    type.let { if (it == JsonValue.from("json_schema")) 1 else 0 }

            /**
             * The JSON schema configuration, required when `type` is `json_schema`. Matches the
             * [OpenAI structured outputs](https://platform.openai.com/docs/guides/structured-outputs)
             * `json_schema` response format.
             */
            class JsonSchema
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val description: JsonField<String>,
                private val schema: JsonField<Schema>,
                private val strict: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("schema")
                    @ExcludeMissing
                    schema: JsonField<Schema> = JsonMissing.of(),
                    @JsonProperty("strict")
                    @ExcludeMissing
                    strict: JsonField<Boolean> = JsonMissing.of(),
                ) : this(name, description, schema, strict, mutableMapOf())

                /**
                 * The name of the response format. Used for clarity only.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * A description of what the response format is for, typically used to guide the
                 * model.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun description(): Optional<String> = description.getOptional("description")

                /**
                 * The JSON schema the model output must conform to. A valid
                 * [JSON Schema](https://json-schema.org) object, e.g. a Pydantic
                 * `model_json_schema()` export.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun schema(): Optional<Schema> = schema.getOptional("schema")

                /**
                 * Enables strict schema adherence when supported by the model. If the generated
                 * output does not match the provided schema, the request fails instead of returning
                 * non-conformant output.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun strict(): Optional<Boolean> = strict.getOptional("strict")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [schema].
                 *
                 * Unlike [schema], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("schema") @ExcludeMissing fun _schema(): JsonField<Schema> = schema

                /**
                 * Returns the raw JSON value of [strict].
                 *
                 * Unlike [strict], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("strict") @ExcludeMissing fun _strict(): JsonField<Boolean> = strict

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
                     * Returns a mutable builder for constructing an instance of [JsonSchema].
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [JsonSchema]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var description: JsonField<String> = JsonMissing.of()
                    private var schema: JsonField<Schema> = JsonMissing.of()
                    private var strict: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(jsonSchema: JsonSchema) = apply {
                        name = jsonSchema.name
                        description = jsonSchema.description
                        schema = jsonSchema.schema
                        strict = jsonSchema.strict
                        additionalProperties = jsonSchema.additionalProperties.toMutableMap()
                    }

                    /** The name of the response format. Used for clarity only. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * A description of what the response format is for, typically used to guide the
                     * model.
                     */
                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * The JSON schema the model output must conform to. A valid
                     * [JSON Schema](https://json-schema.org) object, e.g. a Pydantic
                     * `model_json_schema()` export.
                     */
                    fun schema(schema: Schema) = schema(JsonField.of(schema))

                    /**
                     * Sets [Builder.schema] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.schema] with a well-typed [Schema] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun schema(schema: JsonField<Schema>) = apply { this.schema = schema }

                    /**
                     * Enables strict schema adherence when supported by the model. If the generated
                     * output does not match the provided schema, the request fails instead of
                     * returning non-conformant output.
                     */
                    fun strict(strict: Boolean) = strict(JsonField.of(strict))

                    /**
                     * Sets [Builder.strict] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.strict] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun strict(strict: JsonField<Boolean>) = apply { this.strict = strict }

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
                     * Returns an immutable instance of [JsonSchema].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): JsonSchema =
                        JsonSchema(
                            checkRequired("name", name),
                            description,
                            schema,
                            strict,
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): JsonSchema = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    description()
                    schema().ifPresent { it.validate() }
                    strict()
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                        (if (description.asKnown().isPresent) 1 else 0) +
                        (schema.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (strict.asKnown().isPresent) 1 else 0)

                /**
                 * The JSON schema the model output must conform to. A valid
                 * [JSON Schema](https://json-schema.org) object, e.g. a Pydantic
                 * `model_json_schema()` export.
                 */
                class Schema
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

                        /** Returns a mutable builder for constructing an instance of [Schema]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Schema]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(schema: Schema) = apply {
                            additionalProperties = schema.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Schema].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Schema = Schema(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Schema = apply {
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

                        return other is Schema && additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Schema{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is JsonSchema &&
                        name == other.name &&
                        description == other.description &&
                        schema == other.schema &&
                        strict == other.strict &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, description, schema, strict, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "JsonSchema{name=$name, description=$description, schema=$schema, strict=$strict, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ResponseFormatJsonSchemaParam &&
                    jsonSchema == other.jsonSchema &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(jsonSchema, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ResponseFormatJsonSchemaParam{jsonSchema=$jsonSchema, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    /**
     * Up to 4 sequences where the API will stop generating further tokens. The returned text will
     * not contain the stop sequence.
     */
    @JsonDeserialize(using = Stop.Deserializer::class)
    @JsonSerialize(using = Stop.Serializer::class)
    class Stop
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

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
         * Optional<String> result = stop.accept(new Stop.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitString(String string) {
         *         return Optional.of(string.toString());
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
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
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
        fun validate(): Stop = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitStrings(strings: List<String>) {}
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
                    override fun visitString(string: String) = 1

                    override fun visitStrings(strings: List<String>) = strings.size

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Stop && string == other.string && strings == other.strings
        }

        override fun hashCode(): Int = Objects.hash(string, strings)

        override fun toString(): String =
            when {
                string != null -> "Stop{string=$string}"
                strings != null -> "Stop{strings=$strings}"
                _json != null -> "Stop{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Stop")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Stop(string = string)

            @JvmStatic fun ofStrings(strings: List<String>) = Stop(strings = strings.toImmutable())
        }

        /** An interface that defines how to map each variant of [Stop] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            /**
             * Maps an unknown variant of [Stop] to a value of type [T].
             *
             * An instance of [Stop] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Stop: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Stop>(Stop::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Stop {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Stop(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                Stop(strings = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Stop(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Stop>(Stop::class) {

            override fun serialize(
                value: Stop,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Stop")
                }
            }
        }
    }

    class ToolChoice @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NONE = of("none")

            @JvmField val AUTO = of("auto")

            @JvmField val REQUIRED = of("required")

            @JvmStatic fun of(value: String) = ToolChoice(JsonField.of(value))
        }

        /** An enum containing [ToolChoice]'s known values. */
        enum class Known {
            NONE,
            AUTO,
            REQUIRED,
        }

        /**
         * An enum containing [ToolChoice]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ToolChoice] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            AUTO,
            REQUIRED,
            /**
             * An enum member indicating that [ToolChoice] was instantiated with an unknown value.
             */
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
                NONE -> Value.NONE
                AUTO -> Value.AUTO
                REQUIRED -> Value.REQUIRED
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
                NONE -> Known.NONE
                AUTO -> Known.AUTO
                REQUIRED -> Known.REQUIRED
                else -> throw TelnyxInvalidDataException("Unknown ToolChoice: $value")
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
        fun validate(): ToolChoice = apply {
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

            return other is ToolChoice && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = Tool.Deserializer::class)
    @JsonSerialize(using = Tool.Serializer::class)
    class Tool
    private constructor(
        private val function: ChatCompletionTool? = null,
        private val retrieval: Retrieval? = null,
        private val _json: JsonValue? = null,
    ) {

        fun function(): Optional<ChatCompletionTool> = Optional.ofNullable(function)

        fun retrieval(): Optional<Retrieval> = Optional.ofNullable(retrieval)

        fun isFunction(): Boolean = function != null

        fun isRetrieval(): Boolean = retrieval != null

        fun asFunction(): ChatCompletionTool = function.getOrThrow("function")

        fun asRetrieval(): Retrieval = retrieval.getOrThrow("retrieval")

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
         * Optional<String> result = tool.accept(new Tool.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitFunction(ChatCompletionTool function) {
         *         return Optional.of(function.toString());
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
                function != null -> visitor.visitFunction(function)
                retrieval != null -> visitor.visitRetrieval(retrieval)
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
        fun validate(): Tool = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitFunction(function: ChatCompletionTool) {
                        function.validate()
                    }

                    override fun visitRetrieval(retrieval: Retrieval) {
                        retrieval.validate()
                    }
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
                    override fun visitFunction(function: ChatCompletionTool) = function.validity()

                    override fun visitRetrieval(retrieval: Retrieval) = retrieval.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tool && function == other.function && retrieval == other.retrieval
        }

        override fun hashCode(): Int = Objects.hash(function, retrieval)

        override fun toString(): String =
            when {
                function != null -> "Tool{function=$function}"
                retrieval != null -> "Tool{retrieval=$retrieval}"
                _json != null -> "Tool{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Tool")
            }

        companion object {

            @JvmStatic fun ofFunction(function: ChatCompletionTool) = Tool(function = function)

            @JvmStatic fun ofRetrieval(retrieval: Retrieval) = Tool(retrieval = retrieval)
        }

        /** An interface that defines how to map each variant of [Tool] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitFunction(function: ChatCompletionTool): T

            fun visitRetrieval(retrieval: Retrieval): T

            /**
             * Maps an unknown variant of [Tool] to a value of type [T].
             *
             * An instance of [Tool] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Tool: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Tool>(Tool::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Tool {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "function" -> {
                        return tryDeserialize(node, jacksonTypeRef<ChatCompletionTool>())?.let {
                            Tool(function = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                    "retrieval" -> {
                        return tryDeserialize(node, jacksonTypeRef<Retrieval>())?.let {
                            Tool(retrieval = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                }

                return Tool(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Tool>(Tool::class) {

            override fun serialize(
                value: Tool,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.function != null -> generator.writeObject(value.function)
                    value.retrieval != null -> generator.writeObject(value.retrieval)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Tool")
                }
            }
        }

        class ChatCompletionTool
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val function: JsonField<Function>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("function")
                @ExcludeMissing
                function: JsonField<Function> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(function, type, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun function(): Function = function.getRequired("function")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("function")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [function].
             *
             * Unlike [function], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("function")
            @ExcludeMissing
            fun _function(): JsonField<Function> = function

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
                 * Returns a mutable builder for constructing an instance of [ChatCompletionTool].
                 *
                 * The following fields are required:
                 * ```java
                 * .function()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ChatCompletionTool]. */
            class Builder internal constructor() {

                private var function: JsonField<Function>? = null
                private var type: JsonValue = JsonValue.from("function")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(chatCompletionTool: ChatCompletionTool) = apply {
                    function = chatCompletionTool.function
                    type = chatCompletionTool.type
                    additionalProperties = chatCompletionTool.additionalProperties.toMutableMap()
                }

                fun function(function: Function) = function(JsonField.of(function))

                /**
                 * Sets [Builder.function] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.function] with a well-typed [Function] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun function(function: JsonField<Function>) = apply { this.function = function }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("function")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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
                 * Returns an immutable instance of [ChatCompletionTool].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .function()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ChatCompletionTool =
                    ChatCompletionTool(
                        checkRequired("function", function),
                        type,
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
            fun validate(): ChatCompletionTool = apply {
                if (validated) {
                    return@apply
                }

                function().validate()
                _type().let {
                    if (it != JsonValue.from("function")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
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
                (function.asKnown().getOrNull()?.validity() ?: 0) +
                    type.let { if (it == JsonValue.from("function")) 1 else 0 }

            class Function
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val description: JsonField<String>,
                private val parameters: JsonField<Parameters>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("parameters")
                    @ExcludeMissing
                    parameters: JsonField<Parameters> = JsonMissing.of(),
                ) : this(name, description, parameters, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun description(): Optional<String> = description.getOptional("description")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun parameters(): Optional<Parameters> = parameters.getOptional("parameters")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [parameters].
                 *
                 * Unlike [parameters], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("parameters")
                @ExcludeMissing
                fun _parameters(): JsonField<Parameters> = parameters

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
                     * Returns a mutable builder for constructing an instance of [Function].
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Function]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var description: JsonField<String> = JsonMissing.of()
                    private var parameters: JsonField<Parameters> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(function: Function) = apply {
                        name = function.name
                        description = function.description
                        parameters = function.parameters
                        additionalProperties = function.additionalProperties.toMutableMap()
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

                    /**
                     * Sets [Builder.parameters] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.parameters] with a well-typed [Parameters]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun parameters(parameters: JsonField<Parameters>) = apply {
                        this.parameters = parameters
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
                     * Returns an immutable instance of [Function].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Function =
                        Function(
                            checkRequired("name", name),
                            description,
                            parameters,
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Function = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    description()
                    parameters().ifPresent { it.validate() }
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                        (if (description.asKnown().isPresent) 1 else 0) +
                        (parameters.asKnown().getOrNull()?.validity() ?: 0)

                class Parameters
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
                         * Returns a mutable builder for constructing an instance of [Parameters].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Parameters]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(parameters: Parameters) = apply {
                            additionalProperties = parameters.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Parameters].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Parameters = Parameters(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Parameters = apply {
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

                        return other is Parameters &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Parameters{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Function &&
                        name == other.name &&
                        description == other.description &&
                        parameters == other.parameters &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, description, parameters, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Function{name=$name, description=$description, parameters=$parameters, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChatCompletionTool &&
                    function == other.function &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(function, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChatCompletionTool{function=$function, type=$type, additionalProperties=$additionalProperties}"
        }

        class Retrieval
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val retrieval: JsonField<BucketIds>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("retrieval")
                @ExcludeMissing
                retrieval: JsonField<BucketIds> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(retrieval, type, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun retrieval(): BucketIds = retrieval.getRequired("retrieval")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("retrieval")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [retrieval].
             *
             * Unlike [retrieval], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("retrieval")
            @ExcludeMissing
            fun _retrieval(): JsonField<BucketIds> = retrieval

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
                 * Returns a mutable builder for constructing an instance of [Retrieval].
                 *
                 * The following fields are required:
                 * ```java
                 * .retrieval()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Retrieval]. */
            class Builder internal constructor() {

                private var retrieval: JsonField<BucketIds>? = null
                private var type: JsonValue = JsonValue.from("retrieval")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(retrieval: Retrieval) = apply {
                    this.retrieval = retrieval.retrieval
                    type = retrieval.type
                    additionalProperties = retrieval.additionalProperties.toMutableMap()
                }

                fun retrieval(retrieval: BucketIds) = retrieval(JsonField.of(retrieval))

                /**
                 * Sets [Builder.retrieval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.retrieval] with a well-typed [BucketIds] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun retrieval(retrieval: JsonField<BucketIds>) = apply {
                    this.retrieval = retrieval
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("retrieval")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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
                 * Returns an immutable instance of [Retrieval].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .retrieval()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Retrieval =
                    Retrieval(
                        checkRequired("retrieval", retrieval),
                        type,
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
            fun validate(): Retrieval = apply {
                if (validated) {
                    return@apply
                }

                retrieval().validate()
                _type().let {
                    if (it != JsonValue.from("retrieval")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
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
                (retrieval.asKnown().getOrNull()?.validity() ?: 0) +
                    type.let { if (it == JsonValue.from("retrieval")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Retrieval &&
                    retrieval == other.retrieval &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(retrieval, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Retrieval{retrieval=$retrieval, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatCompletionRequest &&
            messages == other.messages &&
            apiKeyRef == other.apiKeyRef &&
            bestOf == other.bestOf &&
            earlyStopping == other.earlyStopping &&
            enableThinking == other.enableThinking &&
            frequencyPenalty == other.frequencyPenalty &&
            lengthPenalty == other.lengthPenalty &&
            logprobs == other.logprobs &&
            maxTokens == other.maxTokens &&
            minP == other.minP &&
            mode == other.mode &&
            model == other.model &&
            n == other.n &&
            presencePenalty == other.presencePenalty &&
            reasoningEffort == other.reasoningEffort &&
            region == other.region &&
            responseFormat == other.responseFormat &&
            seed == other.seed &&
            serviceTier == other.serviceTier &&
            stop == other.stop &&
            stream == other.stream &&
            temperature == other.temperature &&
            toolChoice == other.toolChoice &&
            tools == other.tools &&
            topLogprobs == other.topLogprobs &&
            topP == other.topP &&
            useBeamSearch == other.useBeamSearch &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            messages,
            apiKeyRef,
            bestOf,
            earlyStopping,
            enableThinking,
            frequencyPenalty,
            lengthPenalty,
            logprobs,
            maxTokens,
            minP,
            mode,
            model,
            n,
            presencePenalty,
            reasoningEffort,
            region,
            responseFormat,
            seed,
            serviceTier,
            stop,
            stream,
            temperature,
            toolChoice,
            tools,
            topLogprobs,
            topP,
            useBeamSearch,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCompletionRequest{messages=$messages, apiKeyRef=$apiKeyRef, bestOf=$bestOf, earlyStopping=$earlyStopping, enableThinking=$enableThinking, frequencyPenalty=$frequencyPenalty, lengthPenalty=$lengthPenalty, logprobs=$logprobs, maxTokens=$maxTokens, minP=$minP, mode=$mode, model=$model, n=$n, presencePenalty=$presencePenalty, reasoningEffort=$reasoningEffort, region=$region, responseFormat=$responseFormat, seed=$seed, serviceTier=$serviceTier, stop=$stop, stream=$stream, temperature=$temperature, toolChoice=$toolChoice, tools=$tools, topLogprobs=$topLogprobs, topP=$topP, useBeamSearch=$useBeamSearch, additionalProperties=$additionalProperties}"
}
