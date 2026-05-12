// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.openai

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Create a response using Telnyx's OpenAI-compatible Responses API. This endpoint is compatible
 * with the [OpenAI Responses API](https://developers.openai.com/api/reference/responses/overview)
 * and may be used with the OpenAI JS or Python SDK by setting the base URL to
 * `https://api.telnyx.com/v2/ai/openai`.
 *
 * The `conversation` parameter refers to a Telnyx Conversation rather than an OpenAI-hosted
 * conversation object. To persist a thread across turns, first
 * [create a conversation](https://developers.telnyx.com/api-reference/conversations/create-a-conversation)
 * with `POST /ai/conversations`, then pass that conversation's `id` in the Responses request as
 * `conversation`. The endpoint appends the new input, assistant output, reasoning, and tool-call
 * messages to that conversation. Reuse the same `conversation` id on subsequent Responses requests,
 * including tool-result followups, so the model receives the prior context.
 *
 * If `conversation` is omitted, the request is processed without persisting messages to a Telnyx
 * conversation. Use the Conversations API to manage history:
 * [list conversations](https://developers.telnyx.com/api-reference/conversations/list-conversations)
 * (optionally filtered by metadata),
 * [fetch messages](https://developers.telnyx.com/api-reference/conversations/get-conversation-messages)
 * for a conversation, and optionally
 * [add messages](https://developers.telnyx.com/api-reference/conversations/create-message) outside
 * the Responses flow.
 *
 * You can attach arbitrary metadata when creating a conversation (for example to tag the
 * conversation's source, channel, or user) and later filter by it when listing conversations.
 */
class OpenAICreateResponseParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Optional Telnyx Conversation ID from `POST /ai/conversations`. When provided, Telnyx stores
     * this turn on that conversation and uses the conversation's prior messages as context. Reuse
     * the same ID for subsequent turns and tool-result followups. Omit it for a non-persisted,
     * stateless response.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversation(): Optional<String> = body.conversation()

    /**
     * The input items for this turn, using the OpenAI Responses API input format.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = openaiCreateResponseParams.input().convert(MyClass.class);
     * ```
     */
    fun _input(): JsonValue = body._input()

    /**
     * Optional system/developer instructions for the model. When used with a persisted
     * `conversation`, send these on the first request that creates the thread; subsequent turns can
     * rely on the stored history.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<String> = body.instructions()

    /**
     * Model identifier to use for the response, for example `zai-org/GLM-5.1-FP8` or another model
     * available from the Telnyx OpenAI-compatible models endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * Set to `true` to stream Server-Sent Events, matching OpenAI's Responses streaming format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stream(): Optional<Boolean> = body.stream()

    /**
     * Returns the raw JSON value of [conversation].
     *
     * Unlike [conversation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _conversation(): JsonField<String> = body._conversation()

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _instructions(): JsonField<String> = body._instructions()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [stream].
     *
     * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stream(): JsonField<Boolean> = body._stream()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OpenAICreateResponseParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [OpenAICreateResponseParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OpenAICreateResponseParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(openaiCreateResponseParams: OpenAICreateResponseParams) = apply {
            body = openaiCreateResponseParams.body.toBuilder()
            additionalHeaders = openaiCreateResponseParams.additionalHeaders.toBuilder()
            additionalQueryParams = openaiCreateResponseParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [conversation]
         * - [input]
         * - [instructions]
         * - [model]
         * - [stream]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Optional Telnyx Conversation ID from `POST /ai/conversations`. When provided, Telnyx
         * stores this turn on that conversation and uses the conversation's prior messages as
         * context. Reuse the same ID for subsequent turns and tool-result followups. Omit it for a
         * non-persisted, stateless response.
         */
        fun conversation(conversation: String) = apply { body.conversation(conversation) }

        /**
         * Sets [Builder.conversation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun conversation(conversation: JsonField<String>) = apply {
            body.conversation(conversation)
        }

        /** The input items for this turn, using the OpenAI Responses API input format. */
        fun input(input: JsonValue) = apply { body.input(input) }

        /**
         * Optional system/developer instructions for the model. When used with a persisted
         * `conversation`, send these on the first request that creates the thread; subsequent turns
         * can rely on the stored history.
         */
        fun instructions(instructions: String) = apply { body.instructions(instructions) }

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            body.instructions(instructions)
        }

        /**
         * Model identifier to use for the response, for example `zai-org/GLM-5.1-FP8` or another
         * model available from the Telnyx OpenAI-compatible models endpoint.
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
         * Set to `true` to stream Server-Sent Events, matching OpenAI's Responses streaming format.
         */
        fun stream(stream: Boolean) = apply { body.stream(stream) }

        /**
         * Sets [Builder.stream] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stream] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stream(stream: JsonField<Boolean>) = apply { body.stream(stream) }

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
         * Returns an immutable instance of [OpenAICreateResponseParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OpenAICreateResponseParams =
            OpenAICreateResponseParams(
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
        private val conversation: JsonField<String>,
        private val input: JsonValue,
        private val instructions: JsonField<String>,
        private val model: JsonField<String>,
        private val stream: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("conversation")
            @ExcludeMissing
            conversation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input") @ExcludeMissing input: JsonValue = JsonMissing.of(),
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stream") @ExcludeMissing stream: JsonField<Boolean> = JsonMissing.of(),
        ) : this(conversation, input, instructions, model, stream, mutableMapOf())

        /**
         * Optional Telnyx Conversation ID from `POST /ai/conversations`. When provided, Telnyx
         * stores this turn on that conversation and uses the conversation's prior messages as
         * context. Reuse the same ID for subsequent turns and tool-result followups. Omit it for a
         * non-persisted, stateless response.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conversation(): Optional<String> = conversation.getOptional("conversation")

        /**
         * The input items for this turn, using the OpenAI Responses API input format.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = body.input().convert(MyClass.class);
         * ```
         */
        @JsonProperty("input") @ExcludeMissing fun _input(): JsonValue = input

        /**
         * Optional system/developer instructions for the model. When used with a persisted
         * `conversation`, send these on the first request that creates the thread; subsequent turns
         * can rely on the stored history.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun instructions(): Optional<String> = instructions.getOptional("instructions")

        /**
         * Model identifier to use for the response, for example `zai-org/GLM-5.1-FP8` or another
         * model available from the Telnyx OpenAI-compatible models endpoint.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Set to `true` to stream Server-Sent Events, matching OpenAI's Responses streaming format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stream(): Optional<Boolean> = stream.getOptional("stream")

        /**
         * Returns the raw JSON value of [conversation].
         *
         * Unlike [conversation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("conversation")
        @ExcludeMissing
        fun _conversation(): JsonField<String> = conversation

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
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [stream].
         *
         * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

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

            private var conversation: JsonField<String> = JsonMissing.of()
            private var input: JsonValue = JsonMissing.of()
            private var instructions: JsonField<String> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var stream: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                conversation = body.conversation
                input = body.input
                instructions = body.instructions
                model = body.model
                stream = body.stream
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Optional Telnyx Conversation ID from `POST /ai/conversations`. When provided, Telnyx
             * stores this turn on that conversation and uses the conversation's prior messages as
             * context. Reuse the same ID for subsequent turns and tool-result followups. Omit it
             * for a non-persisted, stateless response.
             */
            fun conversation(conversation: String) = conversation(JsonField.of(conversation))

            /**
             * Sets [Builder.conversation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conversation] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun conversation(conversation: JsonField<String>) = apply {
                this.conversation = conversation
            }

            /** The input items for this turn, using the OpenAI Responses API input format. */
            fun input(input: JsonValue) = apply { this.input = input }

            /**
             * Optional system/developer instructions for the model. When used with a persisted
             * `conversation`, send these on the first request that creates the thread; subsequent
             * turns can rely on the stored history.
             */
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

            /**
             * Model identifier to use for the response, for example `zai-org/GLM-5.1-FP8` or
             * another model available from the Telnyx OpenAI-compatible models endpoint.
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
             * Set to `true` to stream Server-Sent Events, matching OpenAI's Responses streaming
             * format.
             */
            fun stream(stream: Boolean) = stream(JsonField.of(stream))

            /**
             * Sets [Builder.stream] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stream] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

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
                    conversation,
                    input,
                    instructions,
                    model,
                    stream,
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

            conversation()
            instructions()
            model()
            stream()
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
            (if (conversation.asKnown().isPresent) 1 else 0) +
                (if (instructions.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (stream.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                conversation == other.conversation &&
                input == other.input &&
                instructions == other.instructions &&
                model == other.model &&
                stream == other.stream &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(conversation, input, instructions, model, stream, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{conversation=$conversation, input=$input, instructions=$instructions, model=$model, stream=$stream, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OpenAICreateResponseParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OpenAICreateResponseParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
