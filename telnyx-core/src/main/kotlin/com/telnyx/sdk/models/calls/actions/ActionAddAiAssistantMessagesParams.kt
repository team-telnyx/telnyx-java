// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Add messages to the conversation started by an AI assistant on the call. */
class ActionAddAiAssistantMessagesParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded
     * string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = body.clientState()

    /**
     * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
     * `command_id` for the same `call_control_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commandId(): Optional<String> = body.commandId()

    /**
     * The messages to add to the conversation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messages(): Optional<List<Message>> = body.messages()

    /**
     * Returns the raw JSON value of [clientState].
     *
     * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientState(): JsonField<String> = body._clientState()

    /**
     * Returns the raw JSON value of [commandId].
     *
     * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commandId(): JsonField<String> = body._commandId()

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messages(): JsonField<List<Message>> = body._messages()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ActionAddAiAssistantMessagesParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ActionAddAiAssistantMessagesParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionAddAiAssistantMessagesParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionAddAiAssistantMessagesParams: ActionAddAiAssistantMessagesParams) =
            apply {
                callControlId = actionAddAiAssistantMessagesParams.callControlId
                body = actionAddAiAssistantMessagesParams.body.toBuilder()
                additionalHeaders = actionAddAiAssistantMessagesParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    actionAddAiAssistantMessagesParams.additionalQueryParams.toBuilder()
            }

        fun callControlId(callControlId: String?) = apply { this.callControlId = callControlId }

        /** Alias for calling [Builder.callControlId] with `callControlId.orElse(null)`. */
        fun callControlId(callControlId: Optional<String>) =
            callControlId(callControlId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [clientState]
         * - [commandId]
         * - [messages]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         */
        fun clientState(clientState: String) = apply { body.clientState(clientState) }

        /**
         * Sets [Builder.clientState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientState(clientState: JsonField<String>) = apply { body.clientState(clientState) }

        /**
         * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
         * `command_id` for the same `call_control_id`.
         */
        fun commandId(commandId: String) = apply { body.commandId(commandId) }

        /**
         * Sets [Builder.commandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commandId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commandId(commandId: JsonField<String>) = apply { body.commandId(commandId) }

        /** The messages to add to the conversation. */
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

        /** Alias for calling [addMessage] with `Message.ofUser(user)`. */
        fun addMessage(user: UserMessage) = apply { body.addMessage(user) }

        /**
         * Alias for calling [addMessage] with the following:
         * ```java
         * UserMessage.builder()
         *     .role(UserMessage.Role.USER)
         *     .content(content)
         *     .build()
         * ```
         */
        fun addUserMessage(content: String) = apply { body.addUserMessage(content) }

        /** Alias for calling [addMessage] with `Message.ofAssistant(assistant)`. */
        fun addMessage(assistant: AssistantMessage) = apply { body.addMessage(assistant) }

        /** Alias for calling [addMessage] with `Message.ofTool(tool)`. */
        fun addMessage(tool: ToolMessage) = apply { body.addMessage(tool) }

        /** Alias for calling [addMessage] with `Message.ofSystem(system)`. */
        fun addMessage(system: SystemMessage) = apply { body.addMessage(system) }

        /**
         * Alias for calling [addMessage] with the following:
         * ```java
         * SystemMessage.builder()
         *     .role(SystemMessage.Role.SYSTEM)
         *     .content(content)
         *     .build()
         * ```
         */
        fun addSystemMessage(content: String) = apply { body.addSystemMessage(content) }

        /** Alias for calling [addMessage] with `Message.ofDeveloper(developer)`. */
        fun addMessage(developer: DeveloperMessage) = apply { body.addMessage(developer) }

        /**
         * Alias for calling [addMessage] with the following:
         * ```java
         * DeveloperMessage.builder()
         *     .role(DeveloperMessage.Role.DEVELOPER)
         *     .content(content)
         *     .build()
         * ```
         */
        fun addDeveloperMessage(content: String) = apply { body.addDeveloperMessage(content) }

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
         * Returns an immutable instance of [ActionAddAiAssistantMessagesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionAddAiAssistantMessagesParams =
            ActionAddAiAssistantMessagesParams(
                callControlId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> callControlId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val messages: JsonField<List<Message>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("messages")
            @ExcludeMissing
            messages: JsonField<List<Message>> = JsonMissing.of(),
        ) : this(clientState, commandId, messages, mutableMapOf())

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientState(): Optional<String> = clientState.getOptional("client_state")

        /**
         * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
         * `command_id` for the same `call_control_id`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commandId(): Optional<String> = commandId.getOptional("command_id")

        /**
         * The messages to add to the conversation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messages(): Optional<List<Message>> = messages.getOptional("messages")

        /**
         * Returns the raw JSON value of [clientState].
         *
         * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_state")
        @ExcludeMissing
        fun _clientState(): JsonField<String> = clientState

        /**
         * Returns the raw JSON value of [commandId].
         *
         * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("command_id") @ExcludeMissing fun _commandId(): JsonField<String> = commandId

        /**
         * Returns the raw JSON value of [messages].
         *
         * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

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

            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var messages: JsonField<MutableList<Message>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                clientState = body.clientState
                commandId = body.commandId
                messages = body.messages.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Use this field to add state to every subsequent webhook. It must be a valid Base-64
             * encoded string.
             */
            fun clientState(clientState: String) = clientState(JsonField.of(clientState))

            /**
             * Sets [Builder.clientState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientState(clientState: JsonField<String>) = apply {
                this.clientState = clientState
            }

            /**
             * Use this field to avoid duplicate commands. Telnyx will ignore any command with the
             * same `command_id` for the same `call_control_id`.
             */
            fun commandId(commandId: String) = commandId(JsonField.of(commandId))

            /**
             * Sets [Builder.commandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commandId(commandId: JsonField<String>) = apply { this.commandId = commandId }

            /** The messages to add to the conversation. */
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

            /** Alias for calling [addMessage] with `Message.ofUser(user)`. */
            fun addMessage(user: UserMessage) = addMessage(Message.ofUser(user))

            /**
             * Alias for calling [addMessage] with the following:
             * ```java
             * UserMessage.builder()
             *     .role(UserMessage.Role.USER)
             *     .content(content)
             *     .build()
             * ```
             */
            fun addUserMessage(content: String) =
                addMessage(
                    UserMessage.builder().role(UserMessage.Role.USER).content(content).build()
                )

            /** Alias for calling [addMessage] with `Message.ofAssistant(assistant)`. */
            fun addMessage(assistant: AssistantMessage) = addMessage(Message.ofAssistant(assistant))

            /** Alias for calling [addMessage] with `Message.ofTool(tool)`. */
            fun addMessage(tool: ToolMessage) = addMessage(Message.ofTool(tool))

            /** Alias for calling [addMessage] with `Message.ofSystem(system)`. */
            fun addMessage(system: SystemMessage) = addMessage(Message.ofSystem(system))

            /**
             * Alias for calling [addMessage] with the following:
             * ```java
             * SystemMessage.builder()
             *     .role(SystemMessage.Role.SYSTEM)
             *     .content(content)
             *     .build()
             * ```
             */
            fun addSystemMessage(content: String) =
                addMessage(
                    SystemMessage.builder().role(SystemMessage.Role.SYSTEM).content(content).build()
                )

            /** Alias for calling [addMessage] with `Message.ofDeveloper(developer)`. */
            fun addMessage(developer: DeveloperMessage) = addMessage(Message.ofDeveloper(developer))

            /**
             * Alias for calling [addMessage] with the following:
             * ```java
             * DeveloperMessage.builder()
             *     .role(DeveloperMessage.Role.DEVELOPER)
             *     .content(content)
             *     .build()
             * ```
             */
            fun addDeveloperMessage(content: String) =
                addMessage(
                    DeveloperMessage.builder()
                        .role(DeveloperMessage.Role.DEVELOPER)
                        .content(content)
                        .build()
                )

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
                    clientState,
                    commandId,
                    (messages ?: JsonMissing.of()).map { it.toImmutable() },
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

            clientState()
            commandId()
            messages().ifPresent { it.forEach { it.validate() } }
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
            (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                messages == other.messages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(clientState, commandId, messages, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{clientState=$clientState, commandId=$commandId, messages=$messages, additionalProperties=$additionalProperties}"
    }

    /** Messages sent by an end user */
    @JsonDeserialize(using = Message.Deserializer::class)
    @JsonSerialize(using = Message.Serializer::class)
    class Message
    private constructor(
        private val user: UserMessage? = null,
        private val assistant: AssistantMessage? = null,
        private val tool: ToolMessage? = null,
        private val system: SystemMessage? = null,
        private val developer: DeveloperMessage? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Messages sent by an end user */
        fun user(): Optional<UserMessage> = Optional.ofNullable(user)

        /** Messages sent by the model in response to user messages. */
        fun assistant(): Optional<AssistantMessage> = Optional.ofNullable(assistant)

        fun tool(): Optional<ToolMessage> = Optional.ofNullable(tool)

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun system(): Optional<SystemMessage> = Optional.ofNullable(system)

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun developer(): Optional<DeveloperMessage> = Optional.ofNullable(developer)

        fun isUser(): Boolean = user != null

        fun isAssistant(): Boolean = assistant != null

        fun isTool(): Boolean = tool != null

        fun isSystem(): Boolean = system != null

        fun isDeveloper(): Boolean = developer != null

        /** Messages sent by an end user */
        fun asUser(): UserMessage = user.getOrThrow("user")

        /** Messages sent by the model in response to user messages. */
        fun asAssistant(): AssistantMessage = assistant.getOrThrow("assistant")

        fun asTool(): ToolMessage = tool.getOrThrow("tool")

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun asSystem(): SystemMessage = system.getOrThrow("system")

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun asDeveloper(): DeveloperMessage = developer.getOrThrow("developer")

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
         * Optional<String> result = message.accept(new Message.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitUser(UserMessage user) {
         *         return Optional.of(user.toString());
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
                user != null -> visitor.visitUser(user)
                assistant != null -> visitor.visitAssistant(assistant)
                tool != null -> visitor.visitTool(tool)
                system != null -> visitor.visitSystem(system)
                developer != null -> visitor.visitDeveloper(developer)
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
        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUser(user: UserMessage) {
                        user.validate()
                    }

                    override fun visitAssistant(assistant: AssistantMessage) {
                        assistant.validate()
                    }

                    override fun visitTool(tool: ToolMessage) {
                        tool.validate()
                    }

                    override fun visitSystem(system: SystemMessage) {
                        system.validate()
                    }

                    override fun visitDeveloper(developer: DeveloperMessage) {
                        developer.validate()
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
                    override fun visitUser(user: UserMessage) = user.validity()

                    override fun visitAssistant(assistant: AssistantMessage) = assistant.validity()

                    override fun visitTool(tool: ToolMessage) = tool.validity()

                    override fun visitSystem(system: SystemMessage) = system.validity()

                    override fun visitDeveloper(developer: DeveloperMessage) = developer.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Message &&
                user == other.user &&
                assistant == other.assistant &&
                tool == other.tool &&
                system == other.system &&
                developer == other.developer
        }

        override fun hashCode(): Int = Objects.hash(user, assistant, tool, system, developer)

        override fun toString(): String =
            when {
                user != null -> "Message{user=$user}"
                assistant != null -> "Message{assistant=$assistant}"
                tool != null -> "Message{tool=$tool}"
                system != null -> "Message{system=$system}"
                developer != null -> "Message{developer=$developer}"
                _json != null -> "Message{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Message")
            }

        companion object {

            /** Messages sent by an end user */
            @JvmStatic fun ofUser(user: UserMessage) = Message(user = user)

            /** Messages sent by the model in response to user messages. */
            @JvmStatic fun ofAssistant(assistant: AssistantMessage) = Message(assistant = assistant)

            @JvmStatic fun ofTool(tool: ToolMessage) = Message(tool = tool)

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            @JvmStatic fun ofSystem(system: SystemMessage) = Message(system = system)

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            @JvmStatic fun ofDeveloper(developer: DeveloperMessage) = Message(developer = developer)
        }

        /**
         * An interface that defines how to map each variant of [Message] to a value of type [T].
         */
        interface Visitor<out T> {

            /** Messages sent by an end user */
            fun visitUser(user: UserMessage): T

            /** Messages sent by the model in response to user messages. */
            fun visitAssistant(assistant: AssistantMessage): T

            fun visitTool(tool: ToolMessage): T

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            fun visitSystem(system: SystemMessage): T

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            fun visitDeveloper(developer: DeveloperMessage): T

            /**
             * Maps an unknown variant of [Message] to a value of type [T].
             *
             * An instance of [Message] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Message: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Message>(Message::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Message {
                val json = JsonValue.fromJsonNode(node)
                val role = json.asObject().getOrNull()?.get("role")?.asString()?.getOrNull()

                when (role) {
                    "user" -> {
                        return tryDeserialize(node, jacksonTypeRef<UserMessage>())?.let {
                            Message(user = it, _json = json)
                        } ?: Message(_json = json)
                    }
                    "assistant" -> {
                        return tryDeserialize(node, jacksonTypeRef<AssistantMessage>())?.let {
                            Message(assistant = it, _json = json)
                        } ?: Message(_json = json)
                    }
                    "tool" -> {
                        return tryDeserialize(node, jacksonTypeRef<ToolMessage>())?.let {
                            Message(tool = it, _json = json)
                        } ?: Message(_json = json)
                    }
                    "system" -> {
                        return tryDeserialize(node, jacksonTypeRef<SystemMessage>())?.let {
                            Message(system = it, _json = json)
                        } ?: Message(_json = json)
                    }
                    "developer" -> {
                        return tryDeserialize(node, jacksonTypeRef<DeveloperMessage>())?.let {
                            Message(developer = it, _json = json)
                        } ?: Message(_json = json)
                    }
                }

                return Message(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Message>(Message::class) {

            override fun serialize(
                value: Message,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.user != null -> generator.writeObject(value.user)
                    value.assistant != null -> generator.writeObject(value.assistant)
                    value.tool != null -> generator.writeObject(value.tool)
                    value.system != null -> generator.writeObject(value.system)
                    value.developer != null -> generator.writeObject(value.developer)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Message")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionAddAiAssistantMessagesParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionAddAiAssistantMessagesParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
