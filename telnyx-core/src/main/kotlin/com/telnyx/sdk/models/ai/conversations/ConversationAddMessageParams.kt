// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations

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
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Add a new message to the conversation. Used to insert a new messages to a conversation manually (
 * without using chat endpoint )
 */
class ConversationAddMessageParams
private constructor(
    private val conversationId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The ID of the conversation */
    fun conversationId(): Optional<String> = Optional.ofNullable(conversationId)

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun role(): String = body.role()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<String> = body.content()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sentAt(): Optional<OffsetDateTime> = body.sentAt()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolCallId(): Optional<String> = body.toolCallId()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolCalls(): Optional<List<ToolCall>> = body.toolCalls()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolChoice(): Optional<ToolChoice> = body.toolChoice()

    /**
     * Returns the raw JSON value of [role].
     *
     * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _role(): JsonField<String> = body._role()

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _content(): JsonField<String> = body._content()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [sentAt].
     *
     * Unlike [sentAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sentAt(): JsonField<OffsetDateTime> = body._sentAt()

    /**
     * Returns the raw JSON value of [toolCallId].
     *
     * Unlike [toolCallId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _toolCallId(): JsonField<String> = body._toolCallId()

    /**
     * Returns the raw JSON value of [toolCalls].
     *
     * Unlike [toolCalls], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _toolCalls(): JsonField<List<ToolCall>> = body._toolCalls()

    /**
     * Returns the raw JSON value of [toolChoice].
     *
     * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _toolChoice(): JsonField<ToolChoice> = body._toolChoice()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConversationAddMessageParams].
         *
         * The following fields are required:
         * ```java
         * .role()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConversationAddMessageParams]. */
    class Builder internal constructor() {

        private var conversationId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(conversationAddMessageParams: ConversationAddMessageParams) = apply {
            conversationId = conversationAddMessageParams.conversationId
            body = conversationAddMessageParams.body.toBuilder()
            additionalHeaders = conversationAddMessageParams.additionalHeaders.toBuilder()
            additionalQueryParams = conversationAddMessageParams.additionalQueryParams.toBuilder()
        }

        /** The ID of the conversation */
        fun conversationId(conversationId: String?) = apply { this.conversationId = conversationId }

        /** Alias for calling [Builder.conversationId] with `conversationId.orElse(null)`. */
        fun conversationId(conversationId: Optional<String>) =
            conversationId(conversationId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [role]
         * - [content]
         * - [metadata]
         * - [name]
         * - [sentAt]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun role(role: String) = apply { body.role(role) }

        /**
         * Sets [Builder.role] to an arbitrary JSON value.
         *
         * You should usually call [Builder.role] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun role(role: JsonField<String>) = apply { body.role(role) }

        fun content(content: String) = apply { body.content(content) }

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<String>) = apply { body.content(content) }

        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun sentAt(sentAt: OffsetDateTime) = apply { body.sentAt(sentAt) }

        /**
         * Sets [Builder.sentAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sentAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sentAt(sentAt: JsonField<OffsetDateTime>) = apply { body.sentAt(sentAt) }

        fun toolCallId(toolCallId: String) = apply { body.toolCallId(toolCallId) }

        /**
         * Sets [Builder.toolCallId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolCallId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toolCallId(toolCallId: JsonField<String>) = apply { body.toolCallId(toolCallId) }

        fun toolCalls(toolCalls: List<ToolCall>) = apply { body.toolCalls(toolCalls) }

        /**
         * Sets [Builder.toolCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolCalls] with a well-typed `List<ToolCall>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply { body.toolCalls(toolCalls) }

        /**
         * Adds a single [ToolCall] to [toolCalls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToolCall(toolCall: ToolCall) = apply { body.addToolCall(toolCall) }

        fun toolChoice(toolChoice: ToolChoice) = apply { body.toolChoice(toolChoice) }

        /**
         * Sets [Builder.toolChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply { body.toolChoice(toolChoice) }

        /** Alias for calling [toolChoice] with `ToolChoice.ofString(string)`. */
        fun toolChoice(string: String) = apply { body.toolChoice(string) }

        /**
         * Alias for calling [toolChoice] with `ToolChoice.ofToolChoiceObject(toolChoiceObject)`.
         */
        fun toolChoice(toolChoiceObject: JsonValue) = apply { body.toolChoice(toolChoiceObject) }

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
         * Returns an immutable instance of [ConversationAddMessageParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .role()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConversationAddMessageParams =
            ConversationAddMessageParams(
                conversationId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> conversationId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val role: JsonField<String>,
        private val content: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val name: JsonField<String>,
        private val sentAt: JsonField<OffsetDateTime>,
        private val toolCallId: JsonField<String>,
        private val toolCalls: JsonField<List<ToolCall>>,
        private val toolChoice: JsonField<ToolChoice>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sent_at")
            @ExcludeMissing
            sentAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("tool_call_id")
            @ExcludeMissing
            toolCallId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tool_calls")
            @ExcludeMissing
            toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
            @JsonProperty("tool_choice")
            @ExcludeMissing
            toolChoice: JsonField<ToolChoice> = JsonMissing.of(),
        ) : this(
            role,
            content,
            metadata,
            name,
            sentAt,
            toolCallId,
            toolCalls,
            toolChoice,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun role(): String = role.getRequired("role")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun content(): Optional<String> = content.getOptional("content")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sentAt(): Optional<OffsetDateTime> = sentAt.getOptional("sent_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun toolCallId(): Optional<String> = toolCallId.getOptional("tool_call_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun toolCalls(): Optional<List<ToolCall>> = toolCalls.getOptional("tool_calls")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun toolChoice(): Optional<ToolChoice> = toolChoice.getOptional("tool_choice")

        /**
         * Returns the raw JSON value of [role].
         *
         * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [sentAt].
         *
         * Unlike [sentAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sent_at") @ExcludeMissing fun _sentAt(): JsonField<OffsetDateTime> = sentAt

        /**
         * Returns the raw JSON value of [toolCallId].
         *
         * Unlike [toolCallId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool_call_id")
        @ExcludeMissing
        fun _toolCallId(): JsonField<String> = toolCallId

        /**
         * Returns the raw JSON value of [toolCalls].
         *
         * Unlike [toolCalls], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool_calls")
        @ExcludeMissing
        fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

        /**
         * Returns the raw JSON value of [toolChoice].
         *
         * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool_choice")
        @ExcludeMissing
        fun _toolChoice(): JsonField<ToolChoice> = toolChoice

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
             * .role()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var role: JsonField<String>? = null
            private var content: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var sentAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var toolCallId: JsonField<String> = JsonMissing.of()
            private var toolCalls: JsonField<MutableList<ToolCall>>? = null
            private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                role = body.role
                content = body.content
                metadata = body.metadata
                name = body.name
                sentAt = body.sentAt
                toolCallId = body.toolCallId
                toolCalls = body.toolCalls.map { it.toMutableList() }
                toolChoice = body.toolChoice
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun role(role: String) = role(JsonField.of(role))

            /**
             * Sets [Builder.role] to an arbitrary JSON value.
             *
             * You should usually call [Builder.role] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun role(role: JsonField<String>) = apply { this.role = role }

            fun content(content: String) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun sentAt(sentAt: OffsetDateTime) = sentAt(JsonField.of(sentAt))

            /**
             * Sets [Builder.sentAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sentAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sentAt(sentAt: JsonField<OffsetDateTime>) = apply { this.sentAt = sentAt }

            fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

            /**
             * Sets [Builder.toolCallId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolCallId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolCallId(toolCallId: JsonField<String>) = apply { this.toolCallId = toolCallId }

            fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

            /**
             * Sets [Builder.toolCalls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolCalls] with a well-typed `List<ToolCall>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                this.toolCalls = toolCalls.map { it.toMutableList() }
            }

            /**
             * Adds a single [ToolCall] to [toolCalls].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addToolCall(toolCall: ToolCall) = apply {
                toolCalls =
                    (toolCalls ?: JsonField.of(mutableListOf())).also {
                        checkKnown("toolCalls", it).add(toolCall)
                    }
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

            /** Alias for calling [toolChoice] with `ToolChoice.ofString(string)`. */
            fun toolChoice(string: String) = toolChoice(ToolChoice.ofString(string))

            /**
             * Alias for calling [toolChoice] with
             * `ToolChoice.ofToolChoiceObject(toolChoiceObject)`.
             */
            fun toolChoice(toolChoiceObject: JsonValue) =
                toolChoice(ToolChoice.ofToolChoiceObject(toolChoiceObject))

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
             * .role()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("role", role),
                    content,
                    metadata,
                    name,
                    sentAt,
                    toolCallId,
                    (toolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                    toolChoice,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            role()
            content()
            metadata().ifPresent { it.validate() }
            name()
            sentAt()
            toolCallId()
            toolCalls().ifPresent { it.forEach { it.validate() } }
            toolChoice().ifPresent { it.validate() }
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
            (if (role.asKnown().isPresent) 1 else 0) +
                (if (content.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (sentAt.asKnown().isPresent) 1 else 0) +
                (if (toolCallId.asKnown().isPresent) 1 else 0) +
                (toolCalls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (toolChoice.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                role == other.role &&
                content == other.content &&
                metadata == other.metadata &&
                name == other.name &&
                sentAt == other.sentAt &&
                toolCallId == other.toolCallId &&
                toolCalls == other.toolCalls &&
                toolChoice == other.toolChoice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                role,
                content,
                metadata,
                name,
                sentAt,
                toolCallId,
                toolCalls,
                toolChoice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{role=$role, content=$content, metadata=$metadata, name=$name, sentAt=$sentAt, toolCallId=$toolCallId, toolCalls=$toolCalls, toolChoice=$toolChoice, additionalProperties=$additionalProperties}"
    }

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

    class ToolCall
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

            /** Returns a mutable builder for constructing an instance of [ToolCall]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ToolCall]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(toolCall: ToolCall) = apply {
                additionalProperties = toolCall.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ToolCall].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ToolCall = ToolCall(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ToolCall = apply {
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

            return other is ToolCall && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ToolCall{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = ToolChoice.Deserializer::class)
    @JsonSerialize(using = ToolChoice.Serializer::class)
    class ToolChoice
    private constructor(
        private val string: String? = null,
        private val toolChoiceObject: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun toolChoiceObject(): Optional<JsonValue> = Optional.ofNullable(toolChoiceObject)

        fun isString(): Boolean = string != null

        fun isToolChoiceObject(): Boolean = toolChoiceObject != null

        fun asString(): String = string.getOrThrow("string")

        fun asToolChoiceObject(): JsonValue = toolChoiceObject.getOrThrow("toolChoiceObject")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                toolChoiceObject != null -> visitor.visitToolChoiceObject(toolChoiceObject)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): ToolChoice = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitToolChoiceObject(toolChoiceObject: JsonValue) {}
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

                    override fun visitToolChoiceObject(toolChoiceObject: JsonValue) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ToolChoice &&
                string == other.string &&
                toolChoiceObject == other.toolChoiceObject
        }

        override fun hashCode(): Int = Objects.hash(string, toolChoiceObject)

        override fun toString(): String =
            when {
                string != null -> "ToolChoice{string=$string}"
                toolChoiceObject != null -> "ToolChoice{toolChoiceObject=$toolChoiceObject}"
                _json != null -> "ToolChoice{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ToolChoice")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = ToolChoice(string = string)

            @JvmStatic
            fun ofToolChoiceObject(toolChoiceObject: JsonValue) =
                ToolChoice(toolChoiceObject = toolChoiceObject)
        }

        /**
         * An interface that defines how to map each variant of [ToolChoice] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitToolChoiceObject(toolChoiceObject: JsonValue): T

            /**
             * Maps an unknown variant of [ToolChoice] to a value of type [T].
             *
             * An instance of [ToolChoice] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown ToolChoice: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ToolChoice>(ToolChoice::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ToolChoice {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                ToolChoice(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                ToolChoice(toolChoiceObject = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants.
                    0 -> ToolChoice(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ToolChoice>(ToolChoice::class) {

            override fun serialize(
                value: ToolChoice,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.toolChoiceObject != null -> generator.writeObject(value.toolChoiceObject)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ToolChoice")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConversationAddMessageParams &&
            conversationId == other.conversationId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(conversationId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ConversationAddMessageParams{conversationId=$conversationId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
