// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.anthropic.v1

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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Send a message to a language model using the Anthropic Messages API format. This endpoint is
 * compatible with the [Anthropic Messages API](https://docs.anthropic.com/en/api/messages) and may
 * be used with the Anthropic JS or Python SDK by setting the base URL to
 * `https://api.telnyx.com/v2/ai/anthropic`.
 *
 * The endpoint translates Anthropic-format requests into Telnyx's inference internals, then
 * translates the response back to the Anthropic message shape. Streaming responses use Anthropic
 * SSE event types (`message_start`, `content_block_start`, `content_block_delta`,
 * `content_block_stop`, `message_delta`, `message_stop`).
 */
class V1MessagesParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The maximum number of tokens to generate in the response.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maxTokens(): Long = body.maxTokens()

    /**
     * The messages to send to the model, following the
     * [Anthropic Messages API](https://docs.anthropic.com/en/api/messages) format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messages(): List<Message> = body.messages()

    /**
     * The model to use for generating the response, for example `zai-org/GLM-5.3-Flash` or another
     * model available from the Telnyx models endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = body.model()

    /**
     * If you are using an external inference provider, this field allows you to pass along a
     * reference to your API key. After creating an
     * [integration secret](https://developers.telnyx.com/api-reference/integration-secrets/create-a-secret)
     * for your API key, pass the secret's `identifier` in this field.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKeyRef(): Optional<String> = body.apiKeyRef()

    /**
     * The billing group ID to associate with this request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingGroupId(): Optional<String> = body.billingGroupId()

    /**
     * Configuration for model fallback behavior when the primary model is unavailable.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fallbackConfig(): Optional<FallbackConfig> = body.fallbackConfig()

    /**
     * Maximum number of retries for the request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxRetries(): Optional<Long> = body.maxRetries()

    /**
     * List of MCP (Model Context Protocol) servers to make available to the model.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mcpServers(): Optional<List<McpServer>> = body.mcpServers()

    /**
     * An object describing metadata about the request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * The service tier to use for this request. Supported values vary by model; use the Telnyx
     * models endpoint and inspect the model's `service_tiers` field. If omitted, Telnyx-hosted
     * models use `default`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceTier(): Optional<String> = body.serviceTier()

    /**
     * Custom sequences that will cause the model to stop generating.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stopSequences(): Optional<List<String>> = body.stopSequences()

    /**
     * Whether to stream the response as Anthropic-format Server-Sent Events.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stream(): Optional<Boolean> = body.stream()

    /**
     * System prompt. Can be a string or an array of content blocks following the Anthropic API
     * format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun system(): Optional<System> = body.system()

    /**
     * Amount of randomness injected into the response. Ranges from 0 to 1.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun temperature(): Optional<Double> = body.temperature()

    /**
     * Extended thinking configuration for models that support it. Set `type` to `enabled` to turn
     * on extended thinking.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thinking(): Optional<Thinking> = body.thinking()

    /**
     * Request timeout in seconds.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeout(): Optional<Double> = body.timeout()

    /**
     * Controls how the model uses tools, following the Anthropic API format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolChoice(): Optional<ToolChoice> = body.toolChoice()

    /**
     * Definitions of tools that the model may use, following the Anthropic API format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tools(): Optional<List<Tool>> = body.tools()

    /**
     * Top-k sampling parameter. Only sample from the top K options for each subsequent token.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topK(): Optional<Long> = body.topK()

    /**
     * Nucleus sampling parameter. Use temperature or top_p, but not both.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topP(): Optional<Double> = body.topP()

    /**
     * Returns the raw JSON value of [maxTokens].
     *
     * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxTokens(): JsonField<Long> = body._maxTokens()

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messages(): JsonField<List<Message>> = body._messages()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [apiKeyRef].
     *
     * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _apiKeyRef(): JsonField<String> = body._apiKeyRef()

    /**
     * Returns the raw JSON value of [billingGroupId].
     *
     * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingGroupId(): JsonField<String> = body._billingGroupId()

    /**
     * Returns the raw JSON value of [fallbackConfig].
     *
     * Unlike [fallbackConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fallbackConfig(): JsonField<FallbackConfig> = body._fallbackConfig()

    /**
     * Returns the raw JSON value of [maxRetries].
     *
     * Unlike [maxRetries], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxRetries(): JsonField<Long> = body._maxRetries()

    /**
     * Returns the raw JSON value of [mcpServers].
     *
     * Unlike [mcpServers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mcpServers(): JsonField<List<McpServer>> = body._mcpServers()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [serviceTier].
     *
     * Unlike [serviceTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _serviceTier(): JsonField<String> = body._serviceTier()

    /**
     * Returns the raw JSON value of [stopSequences].
     *
     * Unlike [stopSequences], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stopSequences(): JsonField<List<String>> = body._stopSequences()

    /**
     * Returns the raw JSON value of [stream].
     *
     * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stream(): JsonField<Boolean> = body._stream()

    /**
     * Returns the raw JSON value of [system].
     *
     * Unlike [system], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _system(): JsonField<System> = body._system()

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _temperature(): JsonField<Double> = body._temperature()

    /**
     * Returns the raw JSON value of [thinking].
     *
     * Unlike [thinking], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _thinking(): JsonField<Thinking> = body._thinking()

    /**
     * Returns the raw JSON value of [timeout].
     *
     * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeout(): JsonField<Double> = body._timeout()

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
     * Returns the raw JSON value of [topK].
     *
     * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topK(): JsonField<Long> = body._topK()

    /**
     * Returns the raw JSON value of [topP].
     *
     * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topP(): JsonField<Double> = body._topP()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1MessagesParams].
         *
         * The following fields are required:
         * ```java
         * .maxTokens()
         * .messages()
         * .model()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1MessagesParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1MessagesParams: V1MessagesParams) = apply {
            body = v1MessagesParams.body.toBuilder()
            additionalHeaders = v1MessagesParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1MessagesParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [maxTokens]
         * - [messages]
         * - [model]
         * - [apiKeyRef]
         * - [billingGroupId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The maximum number of tokens to generate in the response. */
        fun maxTokens(maxTokens: Long) = apply { body.maxTokens(maxTokens) }

        /**
         * Sets [Builder.maxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTokens(maxTokens: JsonField<Long>) = apply { body.maxTokens(maxTokens) }

        /**
         * The messages to send to the model, following the
         * [Anthropic Messages API](https://docs.anthropic.com/en/api/messages) format.
         */
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
         * The model to use for generating the response, for example `zai-org/GLM-5.3-Flash` or
         * another model available from the Telnyx models endpoint.
         */
        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /**
         * If you are using an external inference provider, this field allows you to pass along a
         * reference to your API key. After creating an
         * [integration secret](https://developers.telnyx.com/api-reference/integration-secrets/create-a-secret)
         * for your API key, pass the secret's `identifier` in this field.
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

        /** The billing group ID to associate with this request. */
        fun billingGroupId(billingGroupId: String) = apply { body.billingGroupId(billingGroupId) }

        /**
         * Sets [Builder.billingGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingGroupId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingGroupId(billingGroupId: JsonField<String>) = apply {
            body.billingGroupId(billingGroupId)
        }

        /** Configuration for model fallback behavior when the primary model is unavailable. */
        fun fallbackConfig(fallbackConfig: FallbackConfig) = apply {
            body.fallbackConfig(fallbackConfig)
        }

        /**
         * Sets [Builder.fallbackConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fallbackConfig] with a well-typed [FallbackConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fallbackConfig(fallbackConfig: JsonField<FallbackConfig>) = apply {
            body.fallbackConfig(fallbackConfig)
        }

        /** Maximum number of retries for the request. */
        fun maxRetries(maxRetries: Long) = apply { body.maxRetries(maxRetries) }

        /**
         * Sets [Builder.maxRetries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRetries] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxRetries(maxRetries: JsonField<Long>) = apply { body.maxRetries(maxRetries) }

        /** List of MCP (Model Context Protocol) servers to make available to the model. */
        fun mcpServers(mcpServers: List<McpServer>) = apply { body.mcpServers(mcpServers) }

        /**
         * Sets [Builder.mcpServers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcpServers] with a well-typed `List<McpServer>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mcpServers(mcpServers: JsonField<List<McpServer>>) = apply {
            body.mcpServers(mcpServers)
        }

        /**
         * Adds a single [McpServer] to [mcpServers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMcpServer(mcpServer: McpServer) = apply { body.addMcpServer(mcpServer) }

        /** An object describing metadata about the request. */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * The service tier to use for this request. Supported values vary by model; use the Telnyx
         * models endpoint and inspect the model's `service_tiers` field. If omitted, Telnyx-hosted
         * models use `default`.
         */
        fun serviceTier(serviceTier: String) = apply { body.serviceTier(serviceTier) }

        /**
         * Sets [Builder.serviceTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceTier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serviceTier(serviceTier: JsonField<String>) = apply { body.serviceTier(serviceTier) }

        /** Custom sequences that will cause the model to stop generating. */
        fun stopSequences(stopSequences: List<String>) = apply { body.stopSequences(stopSequences) }

        /**
         * Sets [Builder.stopSequences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stopSequences] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stopSequences(stopSequences: JsonField<List<String>>) = apply {
            body.stopSequences(stopSequences)
        }

        /**
         * Adds a single [String] to [stopSequences].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStopSequence(stopSequence: String) = apply { body.addStopSequence(stopSequence) }

        /** Whether to stream the response as Anthropic-format Server-Sent Events. */
        fun stream(stream: Boolean) = apply { body.stream(stream) }

        /**
         * Sets [Builder.stream] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stream] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stream(stream: JsonField<Boolean>) = apply { body.stream(stream) }

        /**
         * System prompt. Can be a string or an array of content blocks following the Anthropic API
         * format.
         */
        fun system(system: System) = apply { body.system(system) }

        /**
         * Sets [Builder.system] to an arbitrary JSON value.
         *
         * You should usually call [Builder.system] with a well-typed [System] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun system(system: JsonField<System>) = apply { body.system(system) }

        /** Alias for calling [system] with `System.ofString(string)`. */
        fun system(string: String) = apply { body.system(string) }

        /**
         * Alias for calling [system] with
         * `System.ofAnthropicSystemContentItems(anthropicSystemContentItems)`.
         */
        fun systemOfAnthropicSystemContentItems(
            anthropicSystemContentItems: List<System.AnthropicSystemContentItem>
        ) = apply { body.systemOfAnthropicSystemContentItems(anthropicSystemContentItems) }

        /** Amount of randomness injected into the response. Ranges from 0 to 1. */
        fun temperature(temperature: Double) = apply { body.temperature(temperature) }

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { body.temperature(temperature) }

        /**
         * Extended thinking configuration for models that support it. Set `type` to `enabled` to
         * turn on extended thinking.
         */
        fun thinking(thinking: Thinking) = apply { body.thinking(thinking) }

        /**
         * Sets [Builder.thinking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thinking] with a well-typed [Thinking] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun thinking(thinking: JsonField<Thinking>) = apply { body.thinking(thinking) }

        /** Request timeout in seconds. */
        fun timeout(timeout: Double) = apply { body.timeout(timeout) }

        /**
         * Sets [Builder.timeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeout] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeout(timeout: JsonField<Double>) = apply { body.timeout(timeout) }

        /** Controls how the model uses tools, following the Anthropic API format. */
        fun toolChoice(toolChoice: ToolChoice) = apply { body.toolChoice(toolChoice) }

        /**
         * Sets [Builder.toolChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply { body.toolChoice(toolChoice) }

        /** Definitions of tools that the model may use, following the Anthropic API format. */
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

        /**
         * Top-k sampling parameter. Only sample from the top K options for each subsequent token.
         */
        fun topK(topK: Long) = apply { body.topK(topK) }

        /**
         * Sets [Builder.topK] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topK] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topK(topK: JsonField<Long>) = apply { body.topK(topK) }

        /** Nucleus sampling parameter. Use temperature or top_p, but not both. */
        fun topP(topP: Double) = apply { body.topP(topP) }

        /**
         * Sets [Builder.topP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topP(topP: JsonField<Double>) = apply { body.topP(topP) }

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
         * Returns an immutable instance of [V1MessagesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .maxTokens()
         * .messages()
         * .model()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1MessagesParams =
            V1MessagesParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Anthropic Messages-compatible request with Telnyx extensions. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val maxTokens: JsonField<Long>,
        private val messages: JsonField<List<Message>>,
        private val model: JsonField<String>,
        private val apiKeyRef: JsonField<String>,
        private val billingGroupId: JsonField<String>,
        private val fallbackConfig: JsonField<FallbackConfig>,
        private val maxRetries: JsonField<Long>,
        private val mcpServers: JsonField<List<McpServer>>,
        private val metadata: JsonField<Metadata>,
        private val serviceTier: JsonField<String>,
        private val stopSequences: JsonField<List<String>>,
        private val stream: JsonField<Boolean>,
        private val system: JsonField<System>,
        private val temperature: JsonField<Double>,
        private val thinking: JsonField<Thinking>,
        private val timeout: JsonField<Double>,
        private val toolChoice: JsonField<ToolChoice>,
        private val tools: JsonField<List<Tool>>,
        private val topK: JsonField<Long>,
        private val topP: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("max_tokens")
            @ExcludeMissing
            maxTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("messages")
            @ExcludeMissing
            messages: JsonField<List<Message>> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("api_key_ref")
            @ExcludeMissing
            apiKeyRef: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billing_group_id")
            @ExcludeMissing
            billingGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fallback_config")
            @ExcludeMissing
            fallbackConfig: JsonField<FallbackConfig> = JsonMissing.of(),
            @JsonProperty("max_retries")
            @ExcludeMissing
            maxRetries: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("mcp_servers")
            @ExcludeMissing
            mcpServers: JsonField<List<McpServer>> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("service_tier")
            @ExcludeMissing
            serviceTier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stop_sequences")
            @ExcludeMissing
            stopSequences: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("stream") @ExcludeMissing stream: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("system") @ExcludeMissing system: JsonField<System> = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("thinking")
            @ExcludeMissing
            thinking: JsonField<Thinking> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tool_choice")
            @ExcludeMissing
            toolChoice: JsonField<ToolChoice> = JsonMissing.of(),
            @JsonProperty("tools") @ExcludeMissing tools: JsonField<List<Tool>> = JsonMissing.of(),
            @JsonProperty("top_k") @ExcludeMissing topK: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("top_p") @ExcludeMissing topP: JsonField<Double> = JsonMissing.of(),
        ) : this(
            maxTokens,
            messages,
            model,
            apiKeyRef,
            billingGroupId,
            fallbackConfig,
            maxRetries,
            mcpServers,
            metadata,
            serviceTier,
            stopSequences,
            stream,
            system,
            temperature,
            thinking,
            timeout,
            toolChoice,
            tools,
            topK,
            topP,
            mutableMapOf(),
        )

        /**
         * The maximum number of tokens to generate in the response.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun maxTokens(): Long = maxTokens.getRequired("max_tokens")

        /**
         * The messages to send to the model, following the
         * [Anthropic Messages API](https://docs.anthropic.com/en/api/messages) format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messages(): List<Message> = messages.getRequired("messages")

        /**
         * The model to use for generating the response, for example `zai-org/GLM-5.3-Flash` or
         * another model available from the Telnyx models endpoint.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * If you are using an external inference provider, this field allows you to pass along a
         * reference to your API key. After creating an
         * [integration secret](https://developers.telnyx.com/api-reference/integration-secrets/create-a-secret)
         * for your API key, pass the secret's `identifier` in this field.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiKeyRef(): Optional<String> = apiKeyRef.getOptional("api_key_ref")

        /**
         * The billing group ID to associate with this request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingGroupId(): Optional<String> = billingGroupId.getOptional("billing_group_id")

        /**
         * Configuration for model fallback behavior when the primary model is unavailable.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fallbackConfig(): Optional<FallbackConfig> =
            fallbackConfig.getOptional("fallback_config")

        /**
         * Maximum number of retries for the request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxRetries(): Optional<Long> = maxRetries.getOptional("max_retries")

        /**
         * List of MCP (Model Context Protocol) servers to make available to the model.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mcpServers(): Optional<List<McpServer>> = mcpServers.getOptional("mcp_servers")

        /**
         * An object describing metadata about the request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * The service tier to use for this request. Supported values vary by model; use the Telnyx
         * models endpoint and inspect the model's `service_tiers` field. If omitted, Telnyx-hosted
         * models use `default`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun serviceTier(): Optional<String> = serviceTier.getOptional("service_tier")

        /**
         * Custom sequences that will cause the model to stop generating.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stopSequences(): Optional<List<String>> = stopSequences.getOptional("stop_sequences")

        /**
         * Whether to stream the response as Anthropic-format Server-Sent Events.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stream(): Optional<Boolean> = stream.getOptional("stream")

        /**
         * System prompt. Can be a string or an array of content blocks following the Anthropic API
         * format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun system(): Optional<System> = system.getOptional("system")

        /**
         * Amount of randomness injected into the response. Ranges from 0 to 1.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun temperature(): Optional<Double> = temperature.getOptional("temperature")

        /**
         * Extended thinking configuration for models that support it. Set `type` to `enabled` to
         * turn on extended thinking.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun thinking(): Optional<Thinking> = thinking.getOptional("thinking")

        /**
         * Request timeout in seconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Optional<Double> = timeout.getOptional("timeout")

        /**
         * Controls how the model uses tools, following the Anthropic API format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun toolChoice(): Optional<ToolChoice> = toolChoice.getOptional("tool_choice")

        /**
         * Definitions of tools that the model may use, following the Anthropic API format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tools(): Optional<List<Tool>> = tools.getOptional("tools")

        /**
         * Top-k sampling parameter. Only sample from the top K options for each subsequent token.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun topK(): Optional<Long> = topK.getOptional("top_k")

        /**
         * Nucleus sampling parameter. Use temperature or top_p, but not both.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun topP(): Optional<Double> = topP.getOptional("top_p")

        /**
         * Returns the raw JSON value of [maxTokens].
         *
         * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens(): JsonField<Long> = maxTokens

        /**
         * Returns the raw JSON value of [messages].
         *
         * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [apiKeyRef].
         *
         * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key_ref") @ExcludeMissing fun _apiKeyRef(): JsonField<String> = apiKeyRef

        /**
         * Returns the raw JSON value of [billingGroupId].
         *
         * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_group_id")
        @ExcludeMissing
        fun _billingGroupId(): JsonField<String> = billingGroupId

        /**
         * Returns the raw JSON value of [fallbackConfig].
         *
         * Unlike [fallbackConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fallback_config")
        @ExcludeMissing
        fun _fallbackConfig(): JsonField<FallbackConfig> = fallbackConfig

        /**
         * Returns the raw JSON value of [maxRetries].
         *
         * Unlike [maxRetries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_retries") @ExcludeMissing fun _maxRetries(): JsonField<Long> = maxRetries

        /**
         * Returns the raw JSON value of [mcpServers].
         *
         * Unlike [mcpServers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mcp_servers")
        @ExcludeMissing
        fun _mcpServers(): JsonField<List<McpServer>> = mcpServers

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [serviceTier].
         *
         * Unlike [serviceTier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("service_tier")
        @ExcludeMissing
        fun _serviceTier(): JsonField<String> = serviceTier

        /**
         * Returns the raw JSON value of [stopSequences].
         *
         * Unlike [stopSequences], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("stop_sequences")
        @ExcludeMissing
        fun _stopSequences(): JsonField<List<String>> = stopSequences

        /**
         * Returns the raw JSON value of [stream].
         *
         * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

        /**
         * Returns the raw JSON value of [system].
         *
         * Unlike [system], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("system") @ExcludeMissing fun _system(): JsonField<System> = system

        /**
         * Returns the raw JSON value of [temperature].
         *
         * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temperature")
        @ExcludeMissing
        fun _temperature(): JsonField<Double> = temperature

        /**
         * Returns the raw JSON value of [thinking].
         *
         * Unlike [thinking], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("thinking") @ExcludeMissing fun _thinking(): JsonField<Thinking> = thinking

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Double> = timeout

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
         * Returns the raw JSON value of [topK].
         *
         * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top_k") @ExcludeMissing fun _topK(): JsonField<Long> = topK

        /**
         * Returns the raw JSON value of [topP].
         *
         * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

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
             * .maxTokens()
             * .messages()
             * .model()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var maxTokens: JsonField<Long>? = null
            private var messages: JsonField<MutableList<Message>>? = null
            private var model: JsonField<String>? = null
            private var apiKeyRef: JsonField<String> = JsonMissing.of()
            private var billingGroupId: JsonField<String> = JsonMissing.of()
            private var fallbackConfig: JsonField<FallbackConfig> = JsonMissing.of()
            private var maxRetries: JsonField<Long> = JsonMissing.of()
            private var mcpServers: JsonField<MutableList<McpServer>>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var serviceTier: JsonField<String> = JsonMissing.of()
            private var stopSequences: JsonField<MutableList<String>>? = null
            private var stream: JsonField<Boolean> = JsonMissing.of()
            private var system: JsonField<System> = JsonMissing.of()
            private var temperature: JsonField<Double> = JsonMissing.of()
            private var thinking: JsonField<Thinking> = JsonMissing.of()
            private var timeout: JsonField<Double> = JsonMissing.of()
            private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
            private var tools: JsonField<MutableList<Tool>>? = null
            private var topK: JsonField<Long> = JsonMissing.of()
            private var topP: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                maxTokens = body.maxTokens
                messages = body.messages.map { it.toMutableList() }
                model = body.model
                apiKeyRef = body.apiKeyRef
                billingGroupId = body.billingGroupId
                fallbackConfig = body.fallbackConfig
                maxRetries = body.maxRetries
                mcpServers = body.mcpServers.map { it.toMutableList() }
                metadata = body.metadata
                serviceTier = body.serviceTier
                stopSequences = body.stopSequences.map { it.toMutableList() }
                stream = body.stream
                system = body.system
                temperature = body.temperature
                thinking = body.thinking
                timeout = body.timeout
                toolChoice = body.toolChoice
                tools = body.tools.map { it.toMutableList() }
                topK = body.topK
                topP = body.topP
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The maximum number of tokens to generate in the response. */
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
             * The messages to send to the model, following the
             * [Anthropic Messages API](https://docs.anthropic.com/en/api/messages) format.
             */
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
             * The model to use for generating the response, for example `zai-org/GLM-5.3-Flash` or
             * another model available from the Telnyx models endpoint.
             */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /**
             * If you are using an external inference provider, this field allows you to pass along
             * a reference to your API key. After creating an
             * [integration secret](https://developers.telnyx.com/api-reference/integration-secrets/create-a-secret)
             * for your API key, pass the secret's `identifier` in this field.
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

            /** The billing group ID to associate with this request. */
            fun billingGroupId(billingGroupId: String) =
                billingGroupId(JsonField.of(billingGroupId))

            /**
             * Sets [Builder.billingGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingGroupId(billingGroupId: JsonField<String>) = apply {
                this.billingGroupId = billingGroupId
            }

            /** Configuration for model fallback behavior when the primary model is unavailable. */
            fun fallbackConfig(fallbackConfig: FallbackConfig) =
                fallbackConfig(JsonField.of(fallbackConfig))

            /**
             * Sets [Builder.fallbackConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fallbackConfig] with a well-typed [FallbackConfig]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fallbackConfig(fallbackConfig: JsonField<FallbackConfig>) = apply {
                this.fallbackConfig = fallbackConfig
            }

            /** Maximum number of retries for the request. */
            fun maxRetries(maxRetries: Long) = maxRetries(JsonField.of(maxRetries))

            /**
             * Sets [Builder.maxRetries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxRetries] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxRetries(maxRetries: JsonField<Long>) = apply { this.maxRetries = maxRetries }

            /** List of MCP (Model Context Protocol) servers to make available to the model. */
            fun mcpServers(mcpServers: List<McpServer>) = mcpServers(JsonField.of(mcpServers))

            /**
             * Sets [Builder.mcpServers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcpServers] with a well-typed `List<McpServer>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mcpServers(mcpServers: JsonField<List<McpServer>>) = apply {
                this.mcpServers = mcpServers.map { it.toMutableList() }
            }

            /**
             * Adds a single [McpServer] to [mcpServers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMcpServer(mcpServer: McpServer) = apply {
                mcpServers =
                    (mcpServers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("mcpServers", it).add(mcpServer)
                    }
            }

            /** An object describing metadata about the request. */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * The service tier to use for this request. Supported values vary by model; use the
             * Telnyx models endpoint and inspect the model's `service_tiers` field. If omitted,
             * Telnyx-hosted models use `default`.
             */
            fun serviceTier(serviceTier: String) = serviceTier(JsonField.of(serviceTier))

            /**
             * Sets [Builder.serviceTier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serviceTier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun serviceTier(serviceTier: JsonField<String>) = apply {
                this.serviceTier = serviceTier
            }

            /** Custom sequences that will cause the model to stop generating. */
            fun stopSequences(stopSequences: List<String>) =
                stopSequences(JsonField.of(stopSequences))

            /**
             * Sets [Builder.stopSequences] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stopSequences] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun stopSequences(stopSequences: JsonField<List<String>>) = apply {
                this.stopSequences = stopSequences.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [stopSequences].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStopSequence(stopSequence: String) = apply {
                stopSequences =
                    (stopSequences ?: JsonField.of(mutableListOf())).also {
                        checkKnown("stopSequences", it).add(stopSequence)
                    }
            }

            /** Whether to stream the response as Anthropic-format Server-Sent Events. */
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
             * System prompt. Can be a string or an array of content blocks following the Anthropic
             * API format.
             */
            fun system(system: System) = system(JsonField.of(system))

            /**
             * Sets [Builder.system] to an arbitrary JSON value.
             *
             * You should usually call [Builder.system] with a well-typed [System] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun system(system: JsonField<System>) = apply { this.system = system }

            /** Alias for calling [system] with `System.ofString(string)`. */
            fun system(string: String) = system(System.ofString(string))

            /**
             * Alias for calling [system] with
             * `System.ofAnthropicSystemContentItems(anthropicSystemContentItems)`.
             */
            fun systemOfAnthropicSystemContentItems(
                anthropicSystemContentItems: List<System.AnthropicSystemContentItem>
            ) = system(System.ofAnthropicSystemContentItems(anthropicSystemContentItems))

            /** Amount of randomness injected into the response. Ranges from 0 to 1. */
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

            /**
             * Extended thinking configuration for models that support it. Set `type` to `enabled`
             * to turn on extended thinking.
             */
            fun thinking(thinking: Thinking) = thinking(JsonField.of(thinking))

            /**
             * Sets [Builder.thinking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thinking] with a well-typed [Thinking] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun thinking(thinking: JsonField<Thinking>) = apply { this.thinking = thinking }

            /** Request timeout in seconds. */
            fun timeout(timeout: Double) = timeout(JsonField.of(timeout))

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Double>) = apply { this.timeout = timeout }

            /** Controls how the model uses tools, following the Anthropic API format. */
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

            /** Definitions of tools that the model may use, following the Anthropic API format. */
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

            /**
             * Top-k sampling parameter. Only sample from the top K options for each subsequent
             * token.
             */
            fun topK(topK: Long) = topK(JsonField.of(topK))

            /**
             * Sets [Builder.topK] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topK] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

            /** Nucleus sampling parameter. Use temperature or top_p, but not both. */
            fun topP(topP: Double) = topP(JsonField.of(topP))

            /**
             * Sets [Builder.topP] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

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
             * .maxTokens()
             * .messages()
             * .model()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("maxTokens", maxTokens),
                    checkRequired("messages", messages).map { it.toImmutable() },
                    checkRequired("model", model),
                    apiKeyRef,
                    billingGroupId,
                    fallbackConfig,
                    maxRetries,
                    (mcpServers ?: JsonMissing.of()).map { it.toImmutable() },
                    metadata,
                    serviceTier,
                    (stopSequences ?: JsonMissing.of()).map { it.toImmutable() },
                    stream,
                    system,
                    temperature,
                    thinking,
                    timeout,
                    toolChoice,
                    (tools ?: JsonMissing.of()).map { it.toImmutable() },
                    topK,
                    topP,
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

            maxTokens()
            messages().forEach { it.validate() }
            model()
            apiKeyRef()
            billingGroupId()
            fallbackConfig().ifPresent { it.validate() }
            maxRetries()
            mcpServers().ifPresent { it.forEach { it.validate() } }
            metadata().ifPresent { it.validate() }
            serviceTier()
            stopSequences()
            stream()
            system().ifPresent { it.validate() }
            temperature()
            thinking().ifPresent { it.validate() }
            timeout()
            toolChoice().ifPresent { it.validate() }
            tools().ifPresent { it.forEach { it.validate() } }
            topK()
            topP()
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
            (if (maxTokens.asKnown().isPresent) 1 else 0) +
                (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (apiKeyRef.asKnown().isPresent) 1 else 0) +
                (if (billingGroupId.asKnown().isPresent) 1 else 0) +
                (fallbackConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (maxRetries.asKnown().isPresent) 1 else 0) +
                (mcpServers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (serviceTier.asKnown().isPresent) 1 else 0) +
                (stopSequences.asKnown().getOrNull()?.size ?: 0) +
                (if (stream.asKnown().isPresent) 1 else 0) +
                (system.asKnown().getOrNull()?.validity() ?: 0) +
                (if (temperature.asKnown().isPresent) 1 else 0) +
                (thinking.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timeout.asKnown().isPresent) 1 else 0) +
                (toolChoice.asKnown().getOrNull()?.validity() ?: 0) +
                (tools.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (topK.asKnown().isPresent) 1 else 0) +
                (if (topP.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                maxTokens == other.maxTokens &&
                messages == other.messages &&
                model == other.model &&
                apiKeyRef == other.apiKeyRef &&
                billingGroupId == other.billingGroupId &&
                fallbackConfig == other.fallbackConfig &&
                maxRetries == other.maxRetries &&
                mcpServers == other.mcpServers &&
                metadata == other.metadata &&
                serviceTier == other.serviceTier &&
                stopSequences == other.stopSequences &&
                stream == other.stream &&
                system == other.system &&
                temperature == other.temperature &&
                thinking == other.thinking &&
                timeout == other.timeout &&
                toolChoice == other.toolChoice &&
                tools == other.tools &&
                topK == other.topK &&
                topP == other.topP &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                maxTokens,
                messages,
                model,
                apiKeyRef,
                billingGroupId,
                fallbackConfig,
                maxRetries,
                mcpServers,
                metadata,
                serviceTier,
                stopSequences,
                stream,
                system,
                temperature,
                thinking,
                timeout,
                toolChoice,
                tools,
                topK,
                topP,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{maxTokens=$maxTokens, messages=$messages, model=$model, apiKeyRef=$apiKeyRef, billingGroupId=$billingGroupId, fallbackConfig=$fallbackConfig, maxRetries=$maxRetries, mcpServers=$mcpServers, metadata=$metadata, serviceTier=$serviceTier, stopSequences=$stopSequences, stream=$stream, system=$system, temperature=$temperature, thinking=$thinking, timeout=$timeout, toolChoice=$toolChoice, tools=$tools, topK=$topK, topP=$topP, additionalProperties=$additionalProperties}"
    }

    class Message
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

            /** Returns a mutable builder for constructing an instance of [Message]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Message]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(message: Message) = apply {
                additionalProperties = message.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Message].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Message = Message(additionalProperties.toImmutable())
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

            return other is Message && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Message{additionalProperties=$additionalProperties}"
    }

    /** Configuration for model fallback behavior when the primary model is unavailable. */
    class FallbackConfig
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

            /** Returns a mutable builder for constructing an instance of [FallbackConfig]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FallbackConfig]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fallbackConfig: FallbackConfig) = apply {
                additionalProperties = fallbackConfig.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [FallbackConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FallbackConfig = FallbackConfig(additionalProperties.toImmutable())
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
        fun validate(): FallbackConfig = apply {
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

            return other is FallbackConfig && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "FallbackConfig{additionalProperties=$additionalProperties}"
    }

    class McpServer
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

            /** Returns a mutable builder for constructing an instance of [McpServer]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [McpServer]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(mcpServer: McpServer) = apply {
                additionalProperties = mcpServer.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [McpServer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): McpServer = McpServer(additionalProperties.toImmutable())
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
        fun validate(): McpServer = apply {
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

            return other is McpServer && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "McpServer{additionalProperties=$additionalProperties}"
    }

    /** An object describing metadata about the request. */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /**
     * System prompt. Can be a string or an array of content blocks following the Anthropic API
     * format.
     */
    @JsonDeserialize(using = System.Deserializer::class)
    @JsonSerialize(using = System.Serializer::class)
    class System
    private constructor(
        private val string: String? = null,
        private val anthropicSystemContentItems: List<AnthropicSystemContentItem>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun anthropicSystemContentItems(): Optional<List<AnthropicSystemContentItem>> =
            Optional.ofNullable(anthropicSystemContentItems)

        fun isString(): Boolean = string != null

        fun isAnthropicSystemContentItems(): Boolean = anthropicSystemContentItems != null

        fun asString(): String = string.getOrThrow("string")

        fun asAnthropicSystemContentItems(): List<AnthropicSystemContentItem> =
            anthropicSystemContentItems.getOrThrow("anthropicSystemContentItems")

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
         * Optional<String> result = system.accept(new System.Visitor<Optional<String>>() {
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
                anthropicSystemContentItems != null ->
                    visitor.visitAnthropicSystemContentItems(anthropicSystemContentItems)
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
        fun validate(): System = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitAnthropicSystemContentItems(
                        anthropicSystemContentItems: List<AnthropicSystemContentItem>
                    ) {
                        anthropicSystemContentItems.forEach { it.validate() }
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

                    override fun visitAnthropicSystemContentItems(
                        anthropicSystemContentItems: List<AnthropicSystemContentItem>
                    ) = anthropicSystemContentItems.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is System &&
                string == other.string &&
                anthropicSystemContentItems == other.anthropicSystemContentItems
        }

        override fun hashCode(): Int = Objects.hash(string, anthropicSystemContentItems)

        override fun toString(): String =
            when {
                string != null -> "System{string=$string}"
                anthropicSystemContentItems != null ->
                    "System{anthropicSystemContentItems=$anthropicSystemContentItems}"
                _json != null -> "System{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid System")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = System(string = string)

            @JvmStatic
            fun ofAnthropicSystemContentItems(
                anthropicSystemContentItems: List<AnthropicSystemContentItem>
            ) = System(anthropicSystemContentItems = anthropicSystemContentItems.toImmutable())
        }

        /** An interface that defines how to map each variant of [System] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitAnthropicSystemContentItems(
                anthropicSystemContentItems: List<AnthropicSystemContentItem>
            ): T

            /**
             * Maps an unknown variant of [System] to a value of type [T].
             *
             * An instance of [System] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown System: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<System>(System::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): System {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                System(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<AnthropicSystemContentItem>>())
                                ?.let { System(anthropicSystemContentItems = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> System(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<System>(System::class) {

            override fun serialize(
                value: System,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.anthropicSystemContentItems != null ->
                        generator.writeObject(value.anthropicSystemContentItems)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid System")
                }
            }
        }

        class AnthropicSystemContentItem
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
                 * [AnthropicSystemContentItem].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AnthropicSystemContentItem]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(anthropicSystemContentItem: AnthropicSystemContentItem) = apply {
                    additionalProperties =
                        anthropicSystemContentItem.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [AnthropicSystemContentItem].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AnthropicSystemContentItem =
                    AnthropicSystemContentItem(additionalProperties.toImmutable())
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
            fun validate(): AnthropicSystemContentItem = apply {
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

                return other is AnthropicSystemContentItem &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AnthropicSystemContentItem{additionalProperties=$additionalProperties}"
        }
    }

    /**
     * Extended thinking configuration for models that support it. Set `type` to `enabled` to turn
     * on extended thinking.
     */
    class Thinking
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

            /** Returns a mutable builder for constructing an instance of [Thinking]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Thinking]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(thinking: Thinking) = apply {
                additionalProperties = thinking.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Thinking].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Thinking = Thinking(additionalProperties.toImmutable())
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
        fun validate(): Thinking = apply {
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

            return other is Thinking && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Thinking{additionalProperties=$additionalProperties}"
    }

    /** Controls how the model uses tools, following the Anthropic API format. */
    class ToolChoice
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

            /** Returns a mutable builder for constructing an instance of [ToolChoice]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ToolChoice]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(toolChoice: ToolChoice) = apply {
                additionalProperties = toolChoice.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ToolChoice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ToolChoice = ToolChoice(additionalProperties.toImmutable())
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
        fun validate(): ToolChoice = apply {
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

            return other is ToolChoice && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ToolChoice{additionalProperties=$additionalProperties}"
    }

    class Tool
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

            /** Returns a mutable builder for constructing an instance of [Tool]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Tool]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tool: Tool) = apply {
                additionalProperties = tool.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Tool].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Tool = Tool(additionalProperties.toImmutable())
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

            return other is Tool && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Tool{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1MessagesParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1MessagesParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
