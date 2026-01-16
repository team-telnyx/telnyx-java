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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.ai.assistants.InferenceEmbeddingBucketIds
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Chat with a language model. This endpoint is consistent with the
 * [OpenAI Chat Completions API](https://platform.openai.com/docs/api-reference/chat) and may be
 * used with the OpenAI JS or Python SDK.
 */
class ChatCreateCompletionParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A list of the previous chat messages for context.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messages(): List<Message> = body.messages()

    /**
     * If you are using an external inference provider like xAI or OpenAI, this field allows you to
     * pass along a reference to your API key. After creating an
     * [integration secret](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
     * for you API key, pass the secret's `identifier` in this field.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKeyRef(): Optional<String> = body.apiKeyRef()

    /**
     * This is used with `use_beam_search` to determine how many candidate beams to explore.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bestOf(): Optional<Long> = body.bestOf()

    /**
     * This is used with `use_beam_search`. If `true`, generation stops as soon as there are
     * `best_of` complete candidates; if `false`, a heuristic is applied and the generation stops
     * when is it very unlikely to find better candidates.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun earlyStopping(): Optional<Boolean> = body.earlyStopping()

    /**
     * Higher values will penalize the model from repeating the same output tokens.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequencyPenalty(): Optional<Double> = body.frequencyPenalty()

    /**
     * If specified, the output will be exactly one of the choices.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun guidedChoice(): Optional<List<String>> = body.guidedChoice()

    /**
     * Must be a valid JSON schema. If specified, the output will follow the JSON schema.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun guidedJson(): Optional<GuidedJson> = body.guidedJson()

    /**
     * If specified, the output will follow the regex pattern.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun guidedRegex(): Optional<String> = body.guidedRegex()

    /**
     * This is used with `use_beam_search` to prefer shorter or longer completions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lengthPenalty(): Optional<Double> = body.lengthPenalty()

    /**
     * Whether to return log probabilities of the output tokens or not. If true, returns the log
     * probabilities of each output token returned in the `content` of `message`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logprobs(): Optional<Boolean> = body.logprobs()

    /**
     * Maximum number of completion tokens the model should generate.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxTokens(): Optional<Long> = body.maxTokens()

    /**
     * This is an alternative to `top_p` that
     * [many prefer](https://github.com/huggingface/transformers/issues/27670). Must be in [0, 1].
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minP(): Optional<Double> = body.minP()

    /**
     * The language model to chat with.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * This will return multiple choices for you instead of a single chat completion.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun n(): Optional<Double> = body.n()

    /**
     * Higher values will penalize the model from repeating the same output tokens.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presencePenalty(): Optional<Double> = body.presencePenalty()

    /**
     * Use this is you want to guarantee a JSON output without defining a schema. For control over
     * the schema, use `guided_json`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseFormat(): Optional<ResponseFormat> = body.responseFormat()

    /**
     * Whether or not to stream data-only server-sent events as they become available.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stream(): Optional<Boolean> = body.stream()

    /**
     * Adjusts the "creativity" of the model. Lower values make the model more deterministic and
     * repetitive, while higher values make the model more random and creative.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun temperature(): Optional<Double> = body.temperature()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolChoice(): Optional<ToolChoice> = body.toolChoice()

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
    fun tools(): Optional<List<Tool>> = body.tools()

    /**
     * This is used with `logprobs`. An integer between 0 and 20 specifying the number of most
     * likely tokens to return at each token position, each with an associated log probability.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topLogprobs(): Optional<Long> = body.topLogprobs()

    /**
     * An alternative or complement to `temperature`. This adjusts how many of the top possibilities
     * to consider.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topP(): Optional<Double> = body.topP()

    /**
     * Setting this to `true` will allow the model to
     * [explore more completion options](https://huggingface.co/blog/how-to-generate#beam-search).
     * This is not supported by OpenAI.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useBeamSearch(): Optional<Boolean> = body.useBeamSearch()

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messages(): JsonField<List<Message>> = body._messages()

    /**
     * Returns the raw JSON value of [apiKeyRef].
     *
     * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _apiKeyRef(): JsonField<String> = body._apiKeyRef()

    /**
     * Returns the raw JSON value of [bestOf].
     *
     * Unlike [bestOf], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bestOf(): JsonField<Long> = body._bestOf()

    /**
     * Returns the raw JSON value of [earlyStopping].
     *
     * Unlike [earlyStopping], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _earlyStopping(): JsonField<Boolean> = body._earlyStopping()

    /**
     * Returns the raw JSON value of [frequencyPenalty].
     *
     * Unlike [frequencyPenalty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _frequencyPenalty(): JsonField<Double> = body._frequencyPenalty()

    /**
     * Returns the raw JSON value of [guidedChoice].
     *
     * Unlike [guidedChoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _guidedChoice(): JsonField<List<String>> = body._guidedChoice()

    /**
     * Returns the raw JSON value of [guidedJson].
     *
     * Unlike [guidedJson], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _guidedJson(): JsonField<GuidedJson> = body._guidedJson()

    /**
     * Returns the raw JSON value of [guidedRegex].
     *
     * Unlike [guidedRegex], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _guidedRegex(): JsonField<String> = body._guidedRegex()

    /**
     * Returns the raw JSON value of [lengthPenalty].
     *
     * Unlike [lengthPenalty], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lengthPenalty(): JsonField<Double> = body._lengthPenalty()

    /**
     * Returns the raw JSON value of [logprobs].
     *
     * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _logprobs(): JsonField<Boolean> = body._logprobs()

    /**
     * Returns the raw JSON value of [maxTokens].
     *
     * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxTokens(): JsonField<Long> = body._maxTokens()

    /**
     * Returns the raw JSON value of [minP].
     *
     * Unlike [minP], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _minP(): JsonField<Double> = body._minP()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [n].
     *
     * Unlike [n], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _n(): JsonField<Double> = body._n()

    /**
     * Returns the raw JSON value of [presencePenalty].
     *
     * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _presencePenalty(): JsonField<Double> = body._presencePenalty()

    /**
     * Returns the raw JSON value of [responseFormat].
     *
     * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _responseFormat(): JsonField<ResponseFormat> = body._responseFormat()

    /**
     * Returns the raw JSON value of [stream].
     *
     * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stream(): JsonField<Boolean> = body._stream()

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _temperature(): JsonField<Double> = body._temperature()

    /**
     * Returns the raw JSON value of [toolChoice].
     *
     * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _toolChoice(): JsonField<ToolChoice> = body._toolChoice()

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tools(): JsonField<List<Tool>> = body._tools()

    /**
     * Returns the raw JSON value of [topLogprobs].
     *
     * Unlike [topLogprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topLogprobs(): JsonField<Long> = body._topLogprobs()

    /**
     * Returns the raw JSON value of [topP].
     *
     * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topP(): JsonField<Double> = body._topP()

    /**
     * Returns the raw JSON value of [useBeamSearch].
     *
     * Unlike [useBeamSearch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _useBeamSearch(): JsonField<Boolean> = body._useBeamSearch()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChatCreateCompletionParams].
         *
         * The following fields are required:
         * ```java
         * .messages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatCreateCompletionParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(chatCreateCompletionParams: ChatCreateCompletionParams) = apply {
            body = chatCreateCompletionParams.body.toBuilder()
            additionalHeaders = chatCreateCompletionParams.additionalHeaders.toBuilder()
            additionalQueryParams = chatCreateCompletionParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [messages]
         * - [apiKeyRef]
         * - [bestOf]
         * - [earlyStopping]
         * - [frequencyPenalty]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** A list of the previous chat messages for context. */
        fun messages(messages: List<Message>) = apply { body.messages(messages) }

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed `List<Message>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messages(messages: JsonField<List<Message>>) = apply { body.messages(messages) }

        /**
         * Adds a single [Message] to [messages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessage(message: Message) = apply { body.addMessage(message) }

        /**
         * If you are using an external inference provider like xAI or OpenAI, this field allows you
         * to pass along a reference to your API key. After creating an
         * [integration secret](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         * for you API key, pass the secret's `identifier` in this field.
         */
        fun apiKeyRef(apiKeyRef: String) = apply { body.apiKeyRef(apiKeyRef) }

        /**
         * Sets [Builder.apiKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apiKeyRef(apiKeyRef: JsonField<String>) = apply { body.apiKeyRef(apiKeyRef) }

        /** This is used with `use_beam_search` to determine how many candidate beams to explore. */
        fun bestOf(bestOf: Long) = apply { body.bestOf(bestOf) }

        /**
         * Sets [Builder.bestOf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bestOf] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bestOf(bestOf: JsonField<Long>) = apply { body.bestOf(bestOf) }

        /**
         * This is used with `use_beam_search`. If `true`, generation stops as soon as there are
         * `best_of` complete candidates; if `false`, a heuristic is applied and the generation
         * stops when is it very unlikely to find better candidates.
         */
        fun earlyStopping(earlyStopping: Boolean) = apply { body.earlyStopping(earlyStopping) }

        /**
         * Sets [Builder.earlyStopping] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earlyStopping] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun earlyStopping(earlyStopping: JsonField<Boolean>) = apply {
            body.earlyStopping(earlyStopping)
        }

        /** Higher values will penalize the model from repeating the same output tokens. */
        fun frequencyPenalty(frequencyPenalty: Double) = apply {
            body.frequencyPenalty(frequencyPenalty)
        }

        /**
         * Sets [Builder.frequencyPenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencyPenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
            body.frequencyPenalty(frequencyPenalty)
        }

        /** If specified, the output will be exactly one of the choices. */
        fun guidedChoice(guidedChoice: List<String>) = apply { body.guidedChoice(guidedChoice) }

        /**
         * Sets [Builder.guidedChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guidedChoice] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun guidedChoice(guidedChoice: JsonField<List<String>>) = apply {
            body.guidedChoice(guidedChoice)
        }

        /**
         * Adds a single [String] to [Builder.guidedChoice].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGuidedChoice(guidedChoice: String) = apply { body.addGuidedChoice(guidedChoice) }

        /** Must be a valid JSON schema. If specified, the output will follow the JSON schema. */
        fun guidedJson(guidedJson: GuidedJson) = apply { body.guidedJson(guidedJson) }

        /**
         * Sets [Builder.guidedJson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guidedJson] with a well-typed [GuidedJson] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun guidedJson(guidedJson: JsonField<GuidedJson>) = apply { body.guidedJson(guidedJson) }

        /** If specified, the output will follow the regex pattern. */
        fun guidedRegex(guidedRegex: String) = apply { body.guidedRegex(guidedRegex) }

        /**
         * Sets [Builder.guidedRegex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guidedRegex] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun guidedRegex(guidedRegex: JsonField<String>) = apply { body.guidedRegex(guidedRegex) }

        /** This is used with `use_beam_search` to prefer shorter or longer completions. */
        fun lengthPenalty(lengthPenalty: Double) = apply { body.lengthPenalty(lengthPenalty) }

        /**
         * Sets [Builder.lengthPenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lengthPenalty] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lengthPenalty(lengthPenalty: JsonField<Double>) = apply {
            body.lengthPenalty(lengthPenalty)
        }

        /**
         * Whether to return log probabilities of the output tokens or not. If true, returns the log
         * probabilities of each output token returned in the `content` of `message`.
         */
        fun logprobs(logprobs: Boolean) = apply { body.logprobs(logprobs) }

        /**
         * Sets [Builder.logprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logprobs] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logprobs(logprobs: JsonField<Boolean>) = apply { body.logprobs(logprobs) }

        /** Maximum number of completion tokens the model should generate. */
        fun maxTokens(maxTokens: Long) = apply { body.maxTokens(maxTokens) }

        /**
         * Sets [Builder.maxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTokens(maxTokens: JsonField<Long>) = apply { body.maxTokens(maxTokens) }

        /**
         * This is an alternative to `top_p` that
         * [many prefer](https://github.com/huggingface/transformers/issues/27670). Must be in
         * [0, 1].
         */
        fun minP(minP: Double) = apply { body.minP(minP) }

        /**
         * Sets [Builder.minP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minP(minP: JsonField<Double>) = apply { body.minP(minP) }

        /** The language model to chat with. */
        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /** This will return multiple choices for you instead of a single chat completion. */
        fun n(n: Double) = apply { body.n(n) }

        /**
         * Sets [Builder.n] to an arbitrary JSON value.
         *
         * You should usually call [Builder.n] with a well-typed [Double] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun n(n: JsonField<Double>) = apply { body.n(n) }

        /** Higher values will penalize the model from repeating the same output tokens. */
        fun presencePenalty(presencePenalty: Double) = apply {
            body.presencePenalty(presencePenalty)
        }

        /**
         * Sets [Builder.presencePenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presencePenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
            body.presencePenalty(presencePenalty)
        }

        /**
         * Use this is you want to guarantee a JSON output without defining a schema. For control
         * over the schema, use `guided_json`.
         */
        fun responseFormat(responseFormat: ResponseFormat) = apply {
            body.responseFormat(responseFormat)
        }

        /**
         * Sets [Builder.responseFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            body.responseFormat(responseFormat)
        }

        /** Whether or not to stream data-only server-sent events as they become available. */
        fun stream(stream: Boolean) = apply { body.stream(stream) }

        /**
         * Sets [Builder.stream] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stream] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stream(stream: JsonField<Boolean>) = apply { body.stream(stream) }

        /**
         * Adjusts the "creativity" of the model. Lower values make the model more deterministic and
         * repetitive, while higher values make the model more random and creative.
         */
        fun temperature(temperature: Double) = apply { body.temperature(temperature) }

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { body.temperature(temperature) }

        fun toolChoice(toolChoice: ToolChoice) = apply { body.toolChoice(toolChoice) }

        /**
         * Sets [Builder.toolChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply { body.toolChoice(toolChoice) }

        /**
         * The `function` tool type follows the same schema as the
         * [OpenAI Chat Completions API](https://platform.openai.com/docs/api-reference/chat). The
         * `retrieval` tool type is unique to Telnyx. You may pass a list of
         * [embedded storage buckets](https://developers.telnyx.com/api-reference/embeddings/embed-documents)
         * for retrieval-augmented generation.
         */
        fun tools(tools: List<Tool>) = apply { body.tools(tools) }

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<Tool>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tools(tools: JsonField<List<Tool>>) = apply { body.tools(tools) }

        /**
         * Adds a single [Tool] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTool(tool: Tool) = apply { body.addTool(tool) }

        /** Alias for calling [addTool] with `Tool.ofFunction(function)`. */
        fun addTool(function: Tool.ChatCompletionTool) = apply { body.addTool(function) }

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * Tool.ChatCompletionTool.builder()
         *     .function(function)
         *     .build()
         * ```
         */
        fun addFunctionTool(function: Tool.ChatCompletionTool.Function) = apply {
            body.addFunctionTool(function)
        }

        /** Alias for calling [addTool] with `Tool.ofRetrieval(retrieval)`. */
        fun addTool(retrieval: Tool.Retrieval) = apply { body.addTool(retrieval) }

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * Tool.Retrieval.builder()
         *     .retrieval(retrieval)
         *     .build()
         * ```
         */
        fun addRetrievalTool(retrieval: InferenceEmbeddingBucketIds) = apply {
            body.addRetrievalTool(retrieval)
        }

        /**
         * This is used with `logprobs`. An integer between 0 and 20 specifying the number of most
         * likely tokens to return at each token position, each with an associated log probability.
         */
        fun topLogprobs(topLogprobs: Long) = apply { body.topLogprobs(topLogprobs) }

        /**
         * Sets [Builder.topLogprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topLogprobs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun topLogprobs(topLogprobs: JsonField<Long>) = apply { body.topLogprobs(topLogprobs) }

        /**
         * An alternative or complement to `temperature`. This adjusts how many of the top
         * possibilities to consider.
         */
        fun topP(topP: Double) = apply { body.topP(topP) }

        /**
         * Sets [Builder.topP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topP(topP: JsonField<Double>) = apply { body.topP(topP) }

        /**
         * Setting this to `true` will allow the model to
         * [explore more completion options](https://huggingface.co/blog/how-to-generate#beam-search).
         * This is not supported by OpenAI.
         */
        fun useBeamSearch(useBeamSearch: Boolean) = apply { body.useBeamSearch(useBeamSearch) }

        /**
         * Sets [Builder.useBeamSearch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useBeamSearch] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useBeamSearch(useBeamSearch: JsonField<Boolean>) = apply {
            body.useBeamSearch(useBeamSearch)
        }

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

        fun additionalHeaders(additionalHeaders: Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
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
         * Returns an immutable instance of [ChatCreateCompletionParams].
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
        fun build(): ChatCreateCompletionParams =
            ChatCreateCompletionParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val messages: JsonField<List<Message>>,
        private val apiKeyRef: JsonField<String>,
        private val bestOf: JsonField<Long>,
        private val earlyStopping: JsonField<Boolean>,
        private val frequencyPenalty: JsonField<Double>,
        private val guidedChoice: JsonField<List<String>>,
        private val guidedJson: JsonField<GuidedJson>,
        private val guidedRegex: JsonField<String>,
        private val lengthPenalty: JsonField<Double>,
        private val logprobs: JsonField<Boolean>,
        private val maxTokens: JsonField<Long>,
        private val minP: JsonField<Double>,
        private val model: JsonField<String>,
        private val n: JsonField<Double>,
        private val presencePenalty: JsonField<Double>,
        private val responseFormat: JsonField<ResponseFormat>,
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
            @JsonProperty("frequency_penalty")
            @ExcludeMissing
            frequencyPenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("guided_choice")
            @ExcludeMissing
            guidedChoice: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("guided_json")
            @ExcludeMissing
            guidedJson: JsonField<GuidedJson> = JsonMissing.of(),
            @JsonProperty("guided_regex")
            @ExcludeMissing
            guidedRegex: JsonField<String> = JsonMissing.of(),
            @JsonProperty("length_penalty")
            @ExcludeMissing
            lengthPenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("logprobs")
            @ExcludeMissing
            logprobs: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("max_tokens")
            @ExcludeMissing
            maxTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("min_p") @ExcludeMissing minP: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("n") @ExcludeMissing n: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("presence_penalty")
            @ExcludeMissing
            presencePenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("response_format")
            @ExcludeMissing
            responseFormat: JsonField<ResponseFormat> = JsonMissing.of(),
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
            frequencyPenalty,
            guidedChoice,
            guidedJson,
            guidedRegex,
            lengthPenalty,
            logprobs,
            maxTokens,
            minP,
            model,
            n,
            presencePenalty,
            responseFormat,
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
         * If you are using an external inference provider like xAI or OpenAI, this field allows you
         * to pass along a reference to your API key. After creating an
         * [integration secret](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
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
         * `best_of` complete candidates; if `false`, a heuristic is applied and the generation
         * stops when is it very unlikely to find better candidates.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun earlyStopping(): Optional<Boolean> = earlyStopping.getOptional("early_stopping")

        /**
         * Higher values will penalize the model from repeating the same output tokens.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun frequencyPenalty(): Optional<Double> = frequencyPenalty.getOptional("frequency_penalty")

        /**
         * If specified, the output will be exactly one of the choices.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun guidedChoice(): Optional<List<String>> = guidedChoice.getOptional("guided_choice")

        /**
         * Must be a valid JSON schema. If specified, the output will follow the JSON schema.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun guidedJson(): Optional<GuidedJson> = guidedJson.getOptional("guided_json")

        /**
         * If specified, the output will follow the regex pattern.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun guidedRegex(): Optional<String> = guidedRegex.getOptional("guided_regex")

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
         * [many prefer](https://github.com/huggingface/transformers/issues/27670). Must be in
         * [0, 1].
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minP(): Optional<Double> = minP.getOptional("min_p")

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
         * Use this is you want to guarantee a JSON output without defining a schema. For control
         * over the schema, use `guided_json`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun responseFormat(): Optional<ResponseFormat> =
            responseFormat.getOptional("response_format")

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
         * An alternative or complement to `temperature`. This adjusts how many of the top
         * possibilities to consider.
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
        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

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
         * Unlike [earlyStopping], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("early_stopping")
        @ExcludeMissing
        fun _earlyStopping(): JsonField<Boolean> = earlyStopping

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
         * Returns the raw JSON value of [guidedChoice].
         *
         * Unlike [guidedChoice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("guided_choice")
        @ExcludeMissing
        fun _guidedChoice(): JsonField<List<String>> = guidedChoice

        /**
         * Returns the raw JSON value of [guidedJson].
         *
         * Unlike [guidedJson], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("guided_json")
        @ExcludeMissing
        fun _guidedJson(): JsonField<GuidedJson> = guidedJson

        /**
         * Returns the raw JSON value of [guidedRegex].
         *
         * Unlike [guidedRegex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("guided_regex")
        @ExcludeMissing
        fun _guidedRegex(): JsonField<String> = guidedRegex

        /**
         * Returns the raw JSON value of [lengthPenalty].
         *
         * Unlike [lengthPenalty], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("presence_penalty")
        @ExcludeMissing
        fun _presencePenalty(): JsonField<Double> = presencePenalty

        /**
         * Returns the raw JSON value of [responseFormat].
         *
         * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("response_format")
        @ExcludeMissing
        fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

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
        @JsonProperty("temperature")
        @ExcludeMissing
        fun _temperature(): JsonField<Double> = temperature

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
        @JsonProperty("top_logprobs")
        @ExcludeMissing
        fun _topLogprobs(): JsonField<Long> = topLogprobs

        /**
         * Returns the raw JSON value of [topP].
         *
         * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

        /**
         * Returns the raw JSON value of [useBeamSearch].
         *
         * Unlike [useBeamSearch], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .messages()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var messages: JsonField<MutableList<Message>>? = null
            private var apiKeyRef: JsonField<String> = JsonMissing.of()
            private var bestOf: JsonField<Long> = JsonMissing.of()
            private var earlyStopping: JsonField<Boolean> = JsonMissing.of()
            private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
            private var guidedChoice: JsonField<MutableList<String>>? = null
            private var guidedJson: JsonField<GuidedJson> = JsonMissing.of()
            private var guidedRegex: JsonField<String> = JsonMissing.of()
            private var lengthPenalty: JsonField<Double> = JsonMissing.of()
            private var logprobs: JsonField<Boolean> = JsonMissing.of()
            private var maxTokens: JsonField<Long> = JsonMissing.of()
            private var minP: JsonField<Double> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var n: JsonField<Double> = JsonMissing.of()
            private var presencePenalty: JsonField<Double> = JsonMissing.of()
            private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
            private var stream: JsonField<Boolean> = JsonMissing.of()
            private var temperature: JsonField<Double> = JsonMissing.of()
            private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
            private var tools: JsonField<MutableList<Tool>>? = null
            private var topLogprobs: JsonField<Long> = JsonMissing.of()
            private var topP: JsonField<Double> = JsonMissing.of()
            private var useBeamSearch: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                messages = body.messages.map { it.toMutableList() }
                apiKeyRef = body.apiKeyRef
                bestOf = body.bestOf
                earlyStopping = body.earlyStopping
                frequencyPenalty = body.frequencyPenalty
                guidedChoice = body.guidedChoice.map { it.toMutableList() }
                guidedJson = body.guidedJson
                guidedRegex = body.guidedRegex
                lengthPenalty = body.lengthPenalty
                logprobs = body.logprobs
                maxTokens = body.maxTokens
                minP = body.minP
                model = body.model
                n = body.n
                presencePenalty = body.presencePenalty
                responseFormat = body.responseFormat
                stream = body.stream
                temperature = body.temperature
                toolChoice = body.toolChoice
                tools = body.tools.map { it.toMutableList() }
                topLogprobs = body.topLogprobs
                topP = body.topP
                useBeamSearch = body.useBeamSearch
                additionalProperties = body.additionalProperties.toMutableMap()
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
             * If you are using an external inference provider like xAI or OpenAI, this field allows
             * you to pass along a reference to your API key. After creating an
             * [integration secret](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
             * for you API key, pass the secret's `identifier` in this field.
             */
            fun apiKeyRef(apiKeyRef: String) = apiKeyRef(JsonField.of(apiKeyRef))

            /**
             * Sets [Builder.apiKeyRef] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKeyRef] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKeyRef(apiKeyRef: JsonField<String>) = apply { this.apiKeyRef = apiKeyRef }

            /**
             * This is used with `use_beam_search` to determine how many candidate beams to explore.
             */
            fun bestOf(bestOf: Long) = bestOf(JsonField.of(bestOf))

            /**
             * Sets [Builder.bestOf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bestOf] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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

            /** If specified, the output will be exactly one of the choices. */
            fun guidedChoice(guidedChoice: List<String>) = guidedChoice(JsonField.of(guidedChoice))

            /**
             * Sets [Builder.guidedChoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guidedChoice] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guidedChoice(guidedChoice: JsonField<List<String>>) = apply {
                this.guidedChoice = guidedChoice.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.guidedChoice].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGuidedChoice(guidedChoice: String) = apply {
                this.guidedChoice =
                    (this.guidedChoice ?: JsonField.of(mutableListOf())).also {
                        checkKnown("guidedChoice", it).add(guidedChoice)
                    }
            }

            /**
             * Must be a valid JSON schema. If specified, the output will follow the JSON schema.
             */
            fun guidedJson(guidedJson: GuidedJson) = guidedJson(JsonField.of(guidedJson))

            /**
             * Sets [Builder.guidedJson] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guidedJson] with a well-typed [GuidedJson] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guidedJson(guidedJson: JsonField<GuidedJson>) = apply {
                this.guidedJson = guidedJson
            }

            /** If specified, the output will follow the regex pattern. */
            fun guidedRegex(guidedRegex: String) = guidedRegex(JsonField.of(guidedRegex))

            /**
             * Sets [Builder.guidedRegex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guidedRegex] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guidedRegex(guidedRegex: JsonField<String>) = apply {
                this.guidedRegex = guidedRegex
            }

            /** This is used with `use_beam_search` to prefer shorter or longer completions. */
            fun lengthPenalty(lengthPenalty: Double) = lengthPenalty(JsonField.of(lengthPenalty))

            /**
             * Sets [Builder.lengthPenalty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lengthPenalty] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lengthPenalty(lengthPenalty: JsonField<Double>) = apply {
                this.lengthPenalty = lengthPenalty
            }

            /**
             * Whether to return log probabilities of the output tokens or not. If true, returns the
             * log probabilities of each output token returned in the `content` of `message`.
             */
            fun logprobs(logprobs: Boolean) = logprobs(JsonField.of(logprobs))

            /**
             * Sets [Builder.logprobs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logprobs] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logprobs(logprobs: JsonField<Boolean>) = apply { this.logprobs = logprobs }

            /** Maximum number of completion tokens the model should generate. */
            fun maxTokens(maxTokens: Long) = maxTokens(JsonField.of(maxTokens))

            /**
             * Sets [Builder.maxTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun minP(minP: JsonField<Double>) = apply { this.minP = minP }

            /** The language model to chat with. */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** This will return multiple choices for you instead of a single chat completion. */
            fun n(n: Double) = n(JsonField.of(n))

            /**
             * Sets [Builder.n] to an arbitrary JSON value.
             *
             * You should usually call [Builder.n] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Use this is you want to guarantee a JSON output without defining a schema. For
             * control over the schema, use `guided_json`.
             */
            fun responseFormat(responseFormat: ResponseFormat) =
                responseFormat(JsonField.of(responseFormat))

            /**
             * Sets [Builder.responseFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
                this.responseFormat = responseFormat
            }

            /** Whether or not to stream data-only server-sent events as they become available. */
            fun stream(stream: Boolean) = stream(JsonField.of(stream))

            /**
             * Sets [Builder.stream] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stream] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

            /**
             * Adjusts the "creativity" of the model. Lower values make the model more deterministic
             * and repetitive, while higher values make the model more random and creative.
             */
            fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

            /**
             * Sets [Builder.temperature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.temperature] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun temperature(temperature: JsonField<Double>) = apply {
                this.temperature = temperature
            }

            fun toolChoice(toolChoice: ToolChoice) = toolChoice(JsonField.of(toolChoice))

            /**
             * Sets [Builder.toolChoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply {
                this.toolChoice = toolChoice
            }

            /**
             * The `function` tool type follows the same schema as the
             * [OpenAI Chat Completions API](https://platform.openai.com/docs/api-reference/chat).
             * The `retrieval` tool type is unique to Telnyx. You may pass a list of
             * [embedded storage buckets](https://developers.telnyx.com/api-reference/embeddings/embed-documents)
             * for retrieval-augmented generation.
             */
            fun tools(tools: List<Tool>) = tools(JsonField.of(tools))

            /**
             * Sets [Builder.tools] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tools] with a well-typed `List<Tool>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                    (tools ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tools", it).add(tool)
                    }
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
            fun addRetrievalTool(retrieval: InferenceEmbeddingBucketIds) =
                addTool(Tool.Retrieval.builder().retrieval(retrieval).build())

            /**
             * This is used with `logprobs`. An integer between 0 and 20 specifying the number of
             * most likely tokens to return at each token position, each with an associated log
             * probability.
             */
            fun topLogprobs(topLogprobs: Long) = topLogprobs(JsonField.of(topLogprobs))

            /**
             * Sets [Builder.topLogprobs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topLogprobs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Body].
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
            fun build(): Body =
                Body(
                    checkRequired("messages", messages).map { it.toImmutable() },
                    apiKeyRef,
                    bestOf,
                    earlyStopping,
                    frequencyPenalty,
                    (guidedChoice ?: JsonMissing.of()).map { it.toImmutable() },
                    guidedJson,
                    guidedRegex,
                    lengthPenalty,
                    logprobs,
                    maxTokens,
                    minP,
                    model,
                    n,
                    presencePenalty,
                    responseFormat,
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

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            messages().forEach { it.validate() }
            apiKeyRef()
            bestOf()
            earlyStopping()
            frequencyPenalty()
            guidedChoice()
            guidedJson().ifPresent { it.validate() }
            guidedRegex()
            lengthPenalty()
            logprobs()
            maxTokens()
            minP()
            model()
            n()
            presencePenalty()
            responseFormat().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (apiKeyRef.asKnown().isPresent) 1 else 0) +
                (if (bestOf.asKnown().isPresent) 1 else 0) +
                (if (earlyStopping.asKnown().isPresent) 1 else 0) +
                (if (frequencyPenalty.asKnown().isPresent) 1 else 0) +
                (guidedChoice.asKnown().getOrNull()?.size ?: 0) +
                (guidedJson.asKnown().getOrNull()?.validity() ?: 0) +
                (if (guidedRegex.asKnown().isPresent) 1 else 0) +
                (if (lengthPenalty.asKnown().isPresent) 1 else 0) +
                (if (logprobs.asKnown().isPresent) 1 else 0) +
                (if (maxTokens.asKnown().isPresent) 1 else 0) +
                (if (minP.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (n.asKnown().isPresent) 1 else 0) +
                (if (presencePenalty.asKnown().isPresent) 1 else 0) +
                (responseFormat.asKnown().getOrNull()?.validity() ?: 0) +
                (if (stream.asKnown().isPresent) 1 else 0) +
                (if (temperature.asKnown().isPresent) 1 else 0) +
                (toolChoice.asKnown().getOrNull()?.validity() ?: 0) +
                (tools.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (topLogprobs.asKnown().isPresent) 1 else 0) +
                (if (topP.asKnown().isPresent) 1 else 0) +
                (if (useBeamSearch.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                messages == other.messages &&
                apiKeyRef == other.apiKeyRef &&
                bestOf == other.bestOf &&
                earlyStopping == other.earlyStopping &&
                frequencyPenalty == other.frequencyPenalty &&
                guidedChoice == other.guidedChoice &&
                guidedJson == other.guidedJson &&
                guidedRegex == other.guidedRegex &&
                lengthPenalty == other.lengthPenalty &&
                logprobs == other.logprobs &&
                maxTokens == other.maxTokens &&
                minP == other.minP &&
                model == other.model &&
                n == other.n &&
                presencePenalty == other.presencePenalty &&
                responseFormat == other.responseFormat &&
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
                frequencyPenalty,
                guidedChoice,
                guidedJson,
                guidedRegex,
                lengthPenalty,
                logprobs,
                maxTokens,
                minP,
                model,
                n,
                presencePenalty,
                responseFormat,
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
            "Body{messages=$messages, apiKeyRef=$apiKeyRef, bestOf=$bestOf, earlyStopping=$earlyStopping, frequencyPenalty=$frequencyPenalty, guidedChoice=$guidedChoice, guidedJson=$guidedJson, guidedRegex=$guidedRegex, lengthPenalty=$lengthPenalty, logprobs=$logprobs, maxTokens=$maxTokens, minP=$minP, model=$model, n=$n, presencePenalty=$presencePenalty, responseFormat=$responseFormat, stream=$stream, temperature=$temperature, toolChoice=$toolChoice, tools=$tools, topLogprobs=$topLogprobs, topP=$topP, useBeamSearch=$useBeamSearch, additionalProperties=$additionalProperties}"
    }

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

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    textAndImageArray != null -> visitor.visitTextAndImageArray(textAndImageArray)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

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

    /** Must be a valid JSON schema. If specified, the output will follow the JSON schema. */
    class GuidedJson
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

            /** Returns a mutable builder for constructing an instance of [GuidedJson]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GuidedJson]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(guidedJson: GuidedJson) = apply {
                additionalProperties = guidedJson.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [GuidedJson].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): GuidedJson = GuidedJson(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): GuidedJson = apply {
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

            return other is GuidedJson && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "GuidedJson{additionalProperties=$additionalProperties}"
    }

    /**
     * Use this is you want to guarantee a JSON output without defining a schema. For control over
     * the schema, use `guided_json`.
     */
    class ResponseFormat
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of()
        ) : this(type, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [ResponseFormat].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ResponseFormat]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(responseFormat: ResponseFormat) = apply {
                type = responseFormat.type
                additionalProperties = responseFormat.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [ResponseFormat].
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
            fun build(): ResponseFormat =
                ResponseFormat(checkRequired("type", type), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): ResponseFormat = apply {
            if (validated) {
                return@apply
            }

            type().validate()
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
        @JvmSynthetic internal fun validity(): Int = (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val TEXT = of("text")

                @JvmField val JSON_OBJECT = of("json_object")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                TEXT,
                JSON_OBJECT,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TEXT,
                JSON_OBJECT,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    TEXT -> Value.TEXT
                    JSON_OBJECT -> Value.JSON_OBJECT
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
                    TEXT -> Known.TEXT
                    JSON_OBJECT -> Known.JSON_OBJECT
                    else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            return other is ResponseFormat &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseFormat{type=$type, additionalProperties=$additionalProperties}"
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

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                function != null -> visitor.visitFunction(function)
                retrieval != null -> visitor.visitRetrieval(retrieval)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

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
            private val retrieval: JsonField<InferenceEmbeddingBucketIds>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("retrieval")
                @ExcludeMissing
                retrieval: JsonField<InferenceEmbeddingBucketIds> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(retrieval, type, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun retrieval(): InferenceEmbeddingBucketIds = retrieval.getRequired("retrieval")

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
            fun _retrieval(): JsonField<InferenceEmbeddingBucketIds> = retrieval

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

                private var retrieval: JsonField<InferenceEmbeddingBucketIds>? = null
                private var type: JsonValue = JsonValue.from("retrieval")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(retrieval: Retrieval) = apply {
                    this.retrieval = retrieval.retrieval
                    type = retrieval.type
                    additionalProperties = retrieval.additionalProperties.toMutableMap()
                }

                fun retrieval(retrieval: InferenceEmbeddingBucketIds) =
                    retrieval(JsonField.of(retrieval))

                /**
                 * Sets [Builder.retrieval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.retrieval] with a well-typed
                 * [InferenceEmbeddingBucketIds] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun retrieval(retrieval: JsonField<InferenceEmbeddingBucketIds>) = apply {
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

        return other is ChatCreateCompletionParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ChatCreateCompletionParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
