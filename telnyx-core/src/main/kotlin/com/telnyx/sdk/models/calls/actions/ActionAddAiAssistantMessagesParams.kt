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
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
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
        fun addMessage(user: Message.User) = apply { body.addMessage(user) }

        /**
         * Alias for calling [addMessage] with the following:
         * ```java
         * Message.User.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addUserMessage(content: String) = apply { body.addUserMessage(content) }

        /** Alias for calling [addMessage] with `Message.ofAssistant(assistant)`. */
        fun addMessage(assistant: Message.Assistant) = apply { body.addMessage(assistant) }

        /** Alias for calling [addMessage] with `Message.ofTool(tool)`. */
        fun addMessage(tool: Message.Tool) = apply { body.addMessage(tool) }

        /** Alias for calling [addMessage] with `Message.ofSystem(system)`. */
        fun addMessage(system: Message.System) = apply { body.addMessage(system) }

        /**
         * Alias for calling [addMessage] with the following:
         * ```java
         * Message.System.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addSystemMessage(content: String) = apply { body.addSystemMessage(content) }

        /** Alias for calling [addMessage] with `Message.ofDeveloper(developer)`. */
        fun addMessage(developer: Message.Developer) = apply { body.addMessage(developer) }

        /**
         * Alias for calling [addMessage] with the following:
         * ```java
         * Message.Developer.builder()
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
            fun addMessage(user: Message.User) = addMessage(Message.ofUser(user))

            /**
             * Alias for calling [addMessage] with the following:
             * ```java
             * Message.User.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun addUserMessage(content: String) =
                addMessage(Message.User.builder().content(content).build())

            /** Alias for calling [addMessage] with `Message.ofAssistant(assistant)`. */
            fun addMessage(assistant: Message.Assistant) =
                addMessage(Message.ofAssistant(assistant))

            /** Alias for calling [addMessage] with `Message.ofTool(tool)`. */
            fun addMessage(tool: Message.Tool) = addMessage(Message.ofTool(tool))

            /** Alias for calling [addMessage] with `Message.ofSystem(system)`. */
            fun addMessage(system: Message.System) = addMessage(Message.ofSystem(system))

            /**
             * Alias for calling [addMessage] with the following:
             * ```java
             * Message.System.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun addSystemMessage(content: String) =
                addMessage(Message.System.builder().content(content).build())

            /** Alias for calling [addMessage] with `Message.ofDeveloper(developer)`. */
            fun addMessage(developer: Message.Developer) =
                addMessage(Message.ofDeveloper(developer))

            /**
             * Alias for calling [addMessage] with the following:
             * ```java
             * Message.Developer.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun addDeveloperMessage(content: String) =
                addMessage(Message.Developer.builder().content(content).build())

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
        private val user: User? = null,
        private val assistant: Assistant? = null,
        private val tool: Tool? = null,
        private val system: System? = null,
        private val developer: Developer? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Messages sent by an end user */
        fun user(): Optional<User> = Optional.ofNullable(user)

        /** Messages sent by the model in response to user messages. */
        fun assistant(): Optional<Assistant> = Optional.ofNullable(assistant)

        fun tool(): Optional<Tool> = Optional.ofNullable(tool)

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun system(): Optional<System> = Optional.ofNullable(system)

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun developer(): Optional<Developer> = Optional.ofNullable(developer)

        fun isUser(): Boolean = user != null

        fun isAssistant(): Boolean = assistant != null

        fun isTool(): Boolean = tool != null

        fun isSystem(): Boolean = system != null

        fun isDeveloper(): Boolean = developer != null

        /** Messages sent by an end user */
        fun asUser(): User = user.getOrThrow("user")

        /** Messages sent by the model in response to user messages. */
        fun asAssistant(): Assistant = assistant.getOrThrow("assistant")

        fun asTool(): Tool = tool.getOrThrow("tool")

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun asSystem(): System = system.getOrThrow("system")

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        fun asDeveloper(): Developer = developer.getOrThrow("developer")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

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

        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUser(user: User) {
                        user.validate()
                    }

                    override fun visitAssistant(assistant: Assistant) {
                        assistant.validate()
                    }

                    override fun visitTool(tool: Tool) {
                        tool.validate()
                    }

                    override fun visitSystem(system: System) {
                        system.validate()
                    }

                    override fun visitDeveloper(developer: Developer) {
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
                    override fun visitUser(user: User) = user.validity()

                    override fun visitAssistant(assistant: Assistant) = assistant.validity()

                    override fun visitTool(tool: Tool) = tool.validity()

                    override fun visitSystem(system: System) = system.validity()

                    override fun visitDeveloper(developer: Developer) = developer.validity()

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
            @JvmStatic fun ofUser(user: User) = Message(user = user)

            /** Messages sent by the model in response to user messages. */
            @JvmStatic fun ofAssistant(assistant: Assistant) = Message(assistant = assistant)

            @JvmStatic fun ofTool(tool: Tool) = Message(tool = tool)

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            @JvmStatic fun ofSystem(system: System) = Message(system = system)

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            @JvmStatic fun ofDeveloper(developer: Developer) = Message(developer = developer)
        }

        /**
         * An interface that defines how to map each variant of [Message] to a value of type [T].
         */
        interface Visitor<out T> {

            /** Messages sent by an end user */
            fun visitUser(user: User): T

            /** Messages sent by the model in response to user messages. */
            fun visitAssistant(assistant: Assistant): T

            fun visitTool(tool: Tool): T

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            fun visitSystem(system: System): T

            /**
             * Developer-provided instructions that the model should follow, regardless of messages
             * sent by the user.
             */
            fun visitDeveloper(developer: Developer): T

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
                        return tryDeserialize(node, jacksonTypeRef<User>())?.let {
                            Message(user = it, _json = json)
                        } ?: Message(_json = json)
                    }
                    "assistant" -> {
                        return tryDeserialize(node, jacksonTypeRef<Assistant>())?.let {
                            Message(assistant = it, _json = json)
                        } ?: Message(_json = json)
                    }
                    "tool" -> {
                        return tryDeserialize(node, jacksonTypeRef<Tool>())?.let {
                            Message(tool = it, _json = json)
                        } ?: Message(_json = json)
                    }
                    "system" -> {
                        return tryDeserialize(node, jacksonTypeRef<System>())?.let {
                            Message(system = it, _json = json)
                        } ?: Message(_json = json)
                    }
                    "developer" -> {
                        return tryDeserialize(node, jacksonTypeRef<Developer>())?.let {
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

        /** Messages sent by an end user */
        class User
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val role: JsonValue,
            private val metadata: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            ) : this(content, role, metadata, mutableMapOf())

            /**
             * The contents of the user message.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * The role of the messages author, in this case `user`.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("user")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /** Metadata to add to the message */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

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
                 * Returns a mutable builder for constructing an instance of [User].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [User]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var role: JsonValue = JsonValue.from("user")
                private var metadata: JsonValue = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(user: User) = apply {
                    content = user.content
                    role = user.role
                    metadata = user.metadata
                    additionalProperties = user.additionalProperties.toMutableMap()
                }

                /** The contents of the user message. */
                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("user")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** Metadata to add to the message */
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

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
                 * Returns an immutable instance of [User].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): User =
                    User(
                        checkRequired("content", content),
                        role,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): User = apply {
                if (validated) {
                    return@apply
                }

                content()
                _role().let {
                    if (it != JsonValue.from("user")) {
                        throw TelnyxInvalidDataException("'role' is invalid, received $it")
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    role.let { if (it == JsonValue.from("user")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is User &&
                    content == other.content &&
                    role == other.role &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, role, metadata, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "User{content=$content, role=$role, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        /** Messages sent by the model in response to user messages. */
        class Assistant
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val role: JsonValue,
            private val content: JsonField<String>,
            private val metadata: JsonValue,
            private val toolCalls: JsonField<List<ToolCall>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
                @JsonProperty("tool_calls")
                @ExcludeMissing
                toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
            ) : this(role, content, metadata, toolCalls, mutableMapOf())

            /**
             * The role of the messages author, in this case `assistant`.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("assistant")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * The contents of the assistant message. Required unless `tool_calls`
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun content(): Optional<String> = content.getOptional("content")

            /** Metadata to add to the message */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /**
             * The tool calls generated by the model, such as function calls.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun toolCalls(): Optional<List<ToolCall>> = toolCalls.getOptional("tool_calls")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [toolCalls].
             *
             * Unlike [toolCalls], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tool_calls")
            @ExcludeMissing
            fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

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

                /** Returns a mutable builder for constructing an instance of [Assistant]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Assistant]. */
            class Builder internal constructor() {

                private var role: JsonValue = JsonValue.from("assistant")
                private var content: JsonField<String> = JsonMissing.of()
                private var metadata: JsonValue = JsonMissing.of()
                private var toolCalls: JsonField<MutableList<ToolCall>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(assistant: Assistant) = apply {
                    role = assistant.role
                    content = assistant.content
                    metadata = assistant.metadata
                    toolCalls = assistant.toolCalls.map { it.toMutableList() }
                    additionalProperties = assistant.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("assistant")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** The contents of the assistant message. Required unless `tool_calls` */
                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                /** Metadata to add to the message */
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                /** The tool calls generated by the model, such as function calls. */
                fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

                /**
                 * Sets [Builder.toolCalls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolCalls] with a well-typed `List<ToolCall>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [Assistant].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Assistant =
                    Assistant(
                        role,
                        content,
                        metadata,
                        (toolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Assistant = apply {
                if (validated) {
                    return@apply
                }

                _role().let {
                    if (it != JsonValue.from("assistant")) {
                        throw TelnyxInvalidDataException("'role' is invalid, received $it")
                    }
                }
                content()
                toolCalls().ifPresent { it.forEach { it.validate() } }
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
                role.let { if (it == JsonValue.from("assistant")) 1 else 0 } +
                    (if (content.asKnown().isPresent) 1 else 0) +
                    (toolCalls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** A call to a function tool created by the model. */
            class ToolCall
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val function: JsonField<Function>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("function")
                    @ExcludeMissing
                    function: JsonField<Function> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(id, function, type, mutableMapOf())

                /**
                 * The ID of the tool call.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * The function that the model called.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun function(): Function = function.getRequired("function")

                /**
                 * The type of the tool. Currently, only `function` is supported.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [function].
                 *
                 * Unlike [function], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("function")
                @ExcludeMissing
                fun _function(): JsonField<Function> = function

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * Returns a mutable builder for constructing an instance of [ToolCall].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .function()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ToolCall]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var function: JsonField<Function>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(toolCall: ToolCall) = apply {
                        id = toolCall.id
                        function = toolCall.function
                        type = toolCall.type
                        additionalProperties = toolCall.additionalProperties.toMutableMap()
                    }

                    /** The ID of the tool call. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** The function that the model called. */
                    fun function(function: Function) = function(JsonField.of(function))

                    /**
                     * Sets [Builder.function] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.function] with a well-typed [Function] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun function(function: JsonField<Function>) = apply { this.function = function }

                    /** The type of the tool. Currently, only `function` is supported. */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

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
                     * Returns an immutable instance of [ToolCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .function()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ToolCall =
                        ToolCall(
                            checkRequired("id", id),
                            checkRequired("function", function),
                            checkRequired("type", type),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ToolCall = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    function().validate()
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
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (function.asKnown().getOrNull()?.validity() ?: 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                /** The function that the model called. */
                class Function
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val name: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of()
                    ) : this(name, mutableMapOf())

                    /**
                     * The name of the function to call.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(function: Function) = apply {
                            name = function.name
                            additionalProperties = function.additionalProperties.toMutableMap()
                        }

                        /** The name of the function to call. */
                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

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
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Function = apply {
                        if (validated) {
                            return@apply
                        }

                        name()
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
                    internal fun validity(): Int = (if (name.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Function &&
                            name == other.name &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Function{name=$name, additionalProperties=$additionalProperties}"
                }

                /** The type of the tool. Currently, only `function` is supported. */
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

                        @JvmField val FUNCTION = of("function")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        FUNCTION
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
                        FUNCTION,
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
                            FUNCTION -> Value.FUNCTION
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
                            FUNCTION -> Known.FUNCTION
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

                    return other is ToolCall &&
                        id == other.id &&
                        function == other.function &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, function, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ToolCall{id=$id, function=$function, type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Assistant &&
                    role == other.role &&
                    content == other.content &&
                    metadata == other.metadata &&
                    toolCalls == other.toolCalls &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(role, content, metadata, toolCalls, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Assistant{role=$role, content=$content, metadata=$metadata, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
        }

        class Tool
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val role: JsonValue,
            private val toolCallId: JsonField<String>,
            private val metadata: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("tool_call_id")
                @ExcludeMissing
                toolCallId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            ) : this(content, role, toolCallId, metadata, mutableMapOf())

            /**
             * The contents of the tool message.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * The role of the messages author, in this case `tool`.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("tool")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * Tool call that this message is responding to.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun toolCallId(): String = toolCallId.getRequired("tool_call_id")

            /** Metadata to add to the message */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [toolCallId].
             *
             * Unlike [toolCallId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tool_call_id")
            @ExcludeMissing
            fun _toolCallId(): JsonField<String> = toolCallId

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
                 * Returns a mutable builder for constructing an instance of [Tool].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .toolCallId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tool]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var role: JsonValue = JsonValue.from("tool")
                private var toolCallId: JsonField<String>? = null
                private var metadata: JsonValue = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tool: Tool) = apply {
                    content = tool.content
                    role = tool.role
                    toolCallId = tool.toolCallId
                    metadata = tool.metadata
                    additionalProperties = tool.additionalProperties.toMutableMap()
                }

                /** The contents of the tool message. */
                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("tool")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** Tool call that this message is responding to. */
                fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

                /**
                 * Sets [Builder.toolCallId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolCallId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun toolCallId(toolCallId: JsonField<String>) = apply {
                    this.toolCallId = toolCallId
                }

                /** Metadata to add to the message */
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

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
                 * Returns an immutable instance of [Tool].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .toolCallId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tool =
                    Tool(
                        checkRequired("content", content),
                        role,
                        checkRequired("toolCallId", toolCallId),
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tool = apply {
                if (validated) {
                    return@apply
                }

                content()
                _role().let {
                    if (it != JsonValue.from("tool")) {
                        throw TelnyxInvalidDataException("'role' is invalid, received $it")
                    }
                }
                toolCallId()
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    role.let { if (it == JsonValue.from("tool")) 1 else 0 } +
                    (if (toolCallId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tool &&
                    content == other.content &&
                    role == other.role &&
                    toolCallId == other.toolCallId &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, role, toolCallId, metadata, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tool{content=$content, role=$role, toolCallId=$toolCallId, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        class System
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val role: JsonValue,
            private val metadata: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            ) : this(content, role, metadata, mutableMapOf())

            /**
             * The contents of the system message.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * The role of the messages author, in this case `system`.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("system")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /** Metadata to add to the message */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

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
                 * Returns a mutable builder for constructing an instance of [System].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [System]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var role: JsonValue = JsonValue.from("system")
                private var metadata: JsonValue = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(system: System) = apply {
                    content = system.content
                    role = system.role
                    metadata = system.metadata
                    additionalProperties = system.additionalProperties.toMutableMap()
                }

                /** The contents of the system message. */
                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("system")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** Metadata to add to the message */
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

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
                 * Returns an immutable instance of [System].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): System =
                    System(
                        checkRequired("content", content),
                        role,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): System = apply {
                if (validated) {
                    return@apply
                }

                content()
                _role().let {
                    if (it != JsonValue.from("system")) {
                        throw TelnyxInvalidDataException("'role' is invalid, received $it")
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    role.let { if (it == JsonValue.from("system")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is System &&
                    content == other.content &&
                    role == other.role &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, role, metadata, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "System{content=$content, role=$role, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        /**
         * Developer-provided instructions that the model should follow, regardless of messages sent
         * by the user.
         */
        class Developer
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val role: JsonValue,
            private val metadata: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            ) : this(content, role, metadata, mutableMapOf())

            /**
             * The contents of the developer message.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * The role of the messages author, in this case developer.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("developer")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /** Metadata to add to the message */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

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
                 * Returns a mutable builder for constructing an instance of [Developer].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Developer]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var role: JsonValue = JsonValue.from("developer")
                private var metadata: JsonValue = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(developer: Developer) = apply {
                    content = developer.content
                    role = developer.role
                    metadata = developer.metadata
                    additionalProperties = developer.additionalProperties.toMutableMap()
                }

                /** The contents of the developer message. */
                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("developer")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                /** Metadata to add to the message */
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

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
                 * Returns an immutable instance of [Developer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Developer =
                    Developer(
                        checkRequired("content", content),
                        role,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Developer = apply {
                if (validated) {
                    return@apply
                }

                content()
                _role().let {
                    if (it != JsonValue.from("developer")) {
                        throw TelnyxInvalidDataException("'role' is invalid, received $it")
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    role.let { if (it == JsonValue.from("developer")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Developer &&
                    content == other.content &&
                    role == other.role &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, role, metadata, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Developer{content=$content, role=$role, metadata=$metadata, additionalProperties=$additionalProperties}"
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
