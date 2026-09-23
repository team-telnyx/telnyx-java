// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

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

/**
 * A remote agent, reachable over the A2A (Agent2Agent) protocol, that an assistant can delegate to.
 * Tools are not configured here: at the start of every conversation the agent's card is fetched and
 * one tool is derived per skill the card advertises.
 */
class AssistantA2AAgent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val url: JsonField<String>,
    private val async: JsonField<Boolean>,
    private val headers: JsonField<List<Header>>,
    private val messages: JsonField<List<Message>>,
    private val pollIntervalMs: JsonField<Long>,
    private val timeoutMs: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("async") @ExcludeMissing async: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("headers")
        @ExcludeMissing
        headers: JsonField<List<Header>> = JsonMissing.of(),
        @JsonProperty("messages")
        @ExcludeMissing
        messages: JsonField<List<Message>> = JsonMissing.of(),
        @JsonProperty("poll_interval_ms")
        @ExcludeMissing
        pollIntervalMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("timeout_ms") @ExcludeMissing timeoutMs: JsonField<Long> = JsonMissing.of(),
    ) : this(name, url, async, headers, messages, pollIntervalMs, timeoutMs, mutableMapOf())

    /**
     * Identifies the agent and seeds the names of the tools derived from its card
     * (`a2a_<name>_<skill_id>`). Characters outside `[A-Za-z0-9_]` are replaced with `_` before the
     * tool name is built, so two agents whose names differ only in punctuation collide and are
     * rejected.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The agent's base URL, or the URL of its agent card. At most 2,048 bytes once UTF-8 encoded.
     * `/.well-known/agent-card.json` is appended to the path unless it already ends in `.json`.
     * Must be an `http://` or `https://` URL for an externally reachable host: internal
     * destinations (`localhost`, private and reserved IP ranges, `.local` domains) are rejected,
     * and the hostname may not contain a `{{...}}` placeholder. Placeholders in the path are
     * allowed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * When `true`, the assistant hands the turn straight back to the model and the agent's answer
     * is delivered into the conversation once it arrives, instead of the caller waiting for it in
     * silence.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun async(): Optional<Boolean> = async.getOptional("async")

    /**
     * Headers sent when fetching this agent's card and on every call made to it. Use them to
     * authenticate to the agent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headers(): Optional<List<Header>> = headers.getOptional("headers")

    /**
     * Filler messages spoken while a call to this agent is in progress. `request_start` messages
     * are spoken immediately when the call begins. `request_response_delayed` messages are spoken
     * after `timing_ms` has elapsed only if the agent has not answered yet. Filler messages are not
     * used when `async` is `true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messages(): Optional<List<Message>> = messages.getOptional("messages")

    /**
     * How often, in milliseconds, to poll an agent task that has not finished yet. Defaults to 500.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pollIntervalMs(): Optional<Long> = pollIntervalMs.getOptional("poll_interval_ms")

    /**
     * Total budget, in milliseconds, for one call to this agent, including any time spent polling a
     * task that is still running. Omit to inherit the assistant's tool timeout.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutMs(): Optional<Long> = timeoutMs.getOptional("timeout_ms")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [async].
     *
     * Unlike [async], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("async") @ExcludeMissing fun _async(): JsonField<Boolean> = async

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<List<Header>> = headers

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messages") @ExcludeMissing fun _messages(): JsonField<List<Message>> = messages

    /**
     * Returns the raw JSON value of [pollIntervalMs].
     *
     * Unlike [pollIntervalMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("poll_interval_ms")
    @ExcludeMissing
    fun _pollIntervalMs(): JsonField<Long> = pollIntervalMs

    /**
     * Returns the raw JSON value of [timeoutMs].
     *
     * Unlike [timeoutMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeout_ms") @ExcludeMissing fun _timeoutMs(): JsonField<Long> = timeoutMs

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
         * Returns a mutable builder for constructing an instance of [AssistantA2AAgent].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssistantA2AAgent]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var async: JsonField<Boolean> = JsonMissing.of()
        private var headers: JsonField<MutableList<Header>>? = null
        private var messages: JsonField<MutableList<Message>>? = null
        private var pollIntervalMs: JsonField<Long> = JsonMissing.of()
        private var timeoutMs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(assistantA2AAgent: AssistantA2AAgent) = apply {
            name = assistantA2AAgent.name
            url = assistantA2AAgent.url
            async = assistantA2AAgent.async
            headers = assistantA2AAgent.headers.map { it.toMutableList() }
            messages = assistantA2AAgent.messages.map { it.toMutableList() }
            pollIntervalMs = assistantA2AAgent.pollIntervalMs
            timeoutMs = assistantA2AAgent.timeoutMs
            additionalProperties = assistantA2AAgent.additionalProperties.toMutableMap()
        }

        /**
         * Identifies the agent and seeds the names of the tools derived from its card
         * (`a2a_<name>_<skill_id>`). Characters outside `[A-Za-z0-9_]` are replaced with `_` before
         * the tool name is built, so two agents whose names differ only in punctuation collide and
         * are rejected.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The agent's base URL, or the URL of its agent card. At most 2,048 bytes once UTF-8
         * encoded. `/.well-known/agent-card.json` is appended to the path unless it already ends in
         * `.json`. Must be an `http://` or `https://` URL for an externally reachable host:
         * internal destinations (`localhost`, private and reserved IP ranges, `.local` domains) are
         * rejected, and the hostname may not contain a `{{...}}` placeholder. Placeholders in the
         * path are allowed.
         */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /**
         * When `true`, the assistant hands the turn straight back to the model and the agent's
         * answer is delivered into the conversation once it arrives, instead of the caller waiting
         * for it in silence.
         */
        fun async(async: Boolean) = async(JsonField.of(async))

        /**
         * Sets [Builder.async] to an arbitrary JSON value.
         *
         * You should usually call [Builder.async] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun async(async: JsonField<Boolean>) = apply { this.async = async }

        /**
         * Headers sent when fetching this agent's card and on every call made to it. Use them to
         * authenticate to the agent.
         */
        fun headers(headers: List<Header>) = headers(JsonField.of(headers))

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed `List<Header>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun headers(headers: JsonField<List<Header>>) = apply {
            this.headers = headers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Header] to [headers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHeader(header: Header) = apply {
            headers =
                (headers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("headers", it).add(header)
                }
        }

        /**
         * Filler messages spoken while a call to this agent is in progress. `request_start`
         * messages are spoken immediately when the call begins. `request_response_delayed` messages
         * are spoken after `timing_ms` has elapsed only if the agent has not answered yet. Filler
         * messages are not used when `async` is `true`.
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
         * Alias for calling [addMessage] with
         * `Message.ofA2AAgentRequestStart(a2AAgentRequestStart)`.
         */
        fun addMessage(a2AAgentRequestStart: Message.A2AAgentRequestStartMessage) =
            addMessage(Message.ofA2AAgentRequestStart(a2AAgentRequestStart))

        /**
         * Alias for calling [addMessage] with
         * `Message.ofA2AAgentRequestResponseDelayed(a2AAgentRequestResponseDelayed)`.
         */
        fun addMessage(
            a2AAgentRequestResponseDelayed: Message.A2AAgentRequestResponseDelayedMessage
        ) = addMessage(Message.ofA2AAgentRequestResponseDelayed(a2AAgentRequestResponseDelayed))

        /**
         * How often, in milliseconds, to poll an agent task that has not finished yet. Defaults
         * to 500.
         */
        fun pollIntervalMs(pollIntervalMs: Long) = pollIntervalMs(JsonField.of(pollIntervalMs))

        /**
         * Sets [Builder.pollIntervalMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pollIntervalMs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pollIntervalMs(pollIntervalMs: JsonField<Long>) = apply {
            this.pollIntervalMs = pollIntervalMs
        }

        /**
         * Total budget, in milliseconds, for one call to this agent, including any time spent
         * polling a task that is still running. Omit to inherit the assistant's tool timeout.
         */
        fun timeoutMs(timeoutMs: Long) = timeoutMs(JsonField.of(timeoutMs))

        /**
         * Sets [Builder.timeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeoutMs(timeoutMs: JsonField<Long>) = apply { this.timeoutMs = timeoutMs }

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
         * Returns an immutable instance of [AssistantA2AAgent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssistantA2AAgent =
            AssistantA2AAgent(
                checkRequired("name", name),
                checkRequired("url", url),
                async,
                (headers ?: JsonMissing.of()).map { it.toImmutable() },
                (messages ?: JsonMissing.of()).map { it.toImmutable() },
                pollIntervalMs,
                timeoutMs,
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
    fun validate(): AssistantA2AAgent = apply {
        if (validated) {
            return@apply
        }

        name()
        url()
        async()
        headers().ifPresent { it.forEach { it.validate() } }
        messages().ifPresent { it.forEach { it.validate() } }
        pollIntervalMs()
        timeoutMs()
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (async.asKnown().isPresent) 1 else 0) +
            (headers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (pollIntervalMs.asKnown().isPresent) 1 else 0) +
            (if (timeoutMs.asKnown().isPresent) 1 else 0)

    /** A header sent when fetching an A2A agent's card and on every call made to that agent. */
    class Header
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(name, value, mutableMapOf())

        /**
         * HTTP header name. May only contain alphanumeric characters, hyphens, and underscores, or
         * a `{{dynamic_variable}}` placeholder surrounded by those characters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Header value, stored exactly as written. It may be a literal, a `{{dynamic_variable}}`,
         * or an `{{#integration_secret}}identifier{{/integration_secret}}` section that resolves to
         * a stored integration secret when the conversation starts. Control characters are not
         * allowed. The encrypted `{{variable | encryption_secret_ref}}` form used for per-caller
         * credentials is not resolved here and is rejected when the assistant is saved.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
             * Returns a mutable builder for constructing an instance of [Header].
             *
             * The following fields are required:
             * ```java
             * .name()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Header]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(header: Header) = apply {
                name = header.name
                value = header.value
                additionalProperties = header.additionalProperties.toMutableMap()
            }

            /**
             * HTTP header name. May only contain alphanumeric characters, hyphens, and underscores,
             * or a `{{dynamic_variable}}` placeholder surrounded by those characters.
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Header value, stored exactly as written. It may be a literal, a
             * `{{dynamic_variable}}`, or an
             * `{{#integration_secret}}identifier{{/integration_secret}}` section that resolves to a
             * stored integration secret when the conversation starts. Control characters are not
             * allowed. The encrypted `{{variable | encryption_secret_ref}}` form used for
             * per-caller credentials is not resolved here and is rejected when the assistant is
             * saved.
             */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [Header].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Header =
                Header(
                    checkRequired("name", name),
                    checkRequired("value", value),
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
        fun validate(): Header = apply {
            if (validated) {
                return@apply
            }

            name()
            value()
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
            (if (name.asKnown().isPresent) 1 else 0) + (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Header &&
                name == other.name &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Header{name=$name, value=$value, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Message.Deserializer::class)
    @JsonSerialize(using = Message.Serializer::class)
    class Message
    private constructor(
        private val a2AAgentRequestStart: A2AAgentRequestStartMessage? = null,
        private val a2AAgentRequestResponseDelayed: A2AAgentRequestResponseDelayedMessage? = null,
        private val _json: JsonValue? = null,
    ) {

        fun a2AAgentRequestStart(): Optional<A2AAgentRequestStartMessage> =
            Optional.ofNullable(a2AAgentRequestStart)

        fun a2AAgentRequestResponseDelayed(): Optional<A2AAgentRequestResponseDelayedMessage> =
            Optional.ofNullable(a2AAgentRequestResponseDelayed)

        fun isA2AAgentRequestStart(): Boolean = a2AAgentRequestStart != null

        fun isA2AAgentRequestResponseDelayed(): Boolean = a2AAgentRequestResponseDelayed != null

        fun asA2AAgentRequestStart(): A2AAgentRequestStartMessage =
            a2AAgentRequestStart.getOrThrow("a2AAgentRequestStart")

        fun asA2AAgentRequestResponseDelayed(): A2AAgentRequestResponseDelayedMessage =
            a2AAgentRequestResponseDelayed.getOrThrow("a2AAgentRequestResponseDelayed")

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
         *     public Optional<String> visitA2AAgentRequestStart(A2AAgentRequestStartMessage a2AAgentRequestStart) {
         *         return Optional.of(a2AAgentRequestStart.toString());
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
                a2AAgentRequestStart != null ->
                    visitor.visitA2AAgentRequestStart(a2AAgentRequestStart)
                a2AAgentRequestResponseDelayed != null ->
                    visitor.visitA2AAgentRequestResponseDelayed(a2AAgentRequestResponseDelayed)
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
                    override fun visitA2AAgentRequestStart(
                        a2AAgentRequestStart: A2AAgentRequestStartMessage
                    ) {
                        a2AAgentRequestStart.validate()
                    }

                    override fun visitA2AAgentRequestResponseDelayed(
                        a2AAgentRequestResponseDelayed: A2AAgentRequestResponseDelayedMessage
                    ) {
                        a2AAgentRequestResponseDelayed.validate()
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
                    override fun visitA2AAgentRequestStart(
                        a2AAgentRequestStart: A2AAgentRequestStartMessage
                    ) = a2AAgentRequestStart.validity()

                    override fun visitA2AAgentRequestResponseDelayed(
                        a2AAgentRequestResponseDelayed: A2AAgentRequestResponseDelayedMessage
                    ) = a2AAgentRequestResponseDelayed.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Message &&
                a2AAgentRequestStart == other.a2AAgentRequestStart &&
                a2AAgentRequestResponseDelayed == other.a2AAgentRequestResponseDelayed
        }

        override fun hashCode(): Int =
            Objects.hash(a2AAgentRequestStart, a2AAgentRequestResponseDelayed)

        override fun toString(): String =
            when {
                a2AAgentRequestStart != null ->
                    "Message{a2AAgentRequestStart=$a2AAgentRequestStart}"
                a2AAgentRequestResponseDelayed != null ->
                    "Message{a2AAgentRequestResponseDelayed=$a2AAgentRequestResponseDelayed}"
                _json != null -> "Message{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Message")
            }

        companion object {

            @JvmStatic
            fun ofA2AAgentRequestStart(a2AAgentRequestStart: A2AAgentRequestStartMessage) =
                Message(a2AAgentRequestStart = a2AAgentRequestStart)

            @JvmStatic
            fun ofA2AAgentRequestResponseDelayed(
                a2AAgentRequestResponseDelayed: A2AAgentRequestResponseDelayedMessage
            ) = Message(a2AAgentRequestResponseDelayed = a2AAgentRequestResponseDelayed)
        }

        /**
         * An interface that defines how to map each variant of [Message] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitA2AAgentRequestStart(a2AAgentRequestStart: A2AAgentRequestStartMessage): T

            fun visitA2AAgentRequestResponseDelayed(
                a2AAgentRequestResponseDelayed: A2AAgentRequestResponseDelayedMessage
            ): T

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<A2AAgentRequestStartMessage>())
                                ?.let { Message(a2AAgentRequestStart = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<A2AAgentRequestResponseDelayedMessage>(),
                                )
                                ?.let { Message(a2AAgentRequestResponseDelayed = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Message(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Message>(Message::class) {

            override fun serialize(
                value: Message,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.a2AAgentRequestStart != null ->
                        generator.writeObject(value.a2AAgentRequestStart)
                    value.a2AAgentRequestResponseDelayed != null ->
                        generator.writeObject(value.a2AAgentRequestResponseDelayed)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Message")
                }
            }
        }

        class A2AAgentRequestStartMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val type: JsonValue,
            private val timingMs: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("timing_ms")
                @ExcludeMissing
                timingMs: JsonField<Long> = JsonMissing.of(),
            ) : this(content, type, timingMs, mutableMapOf())

            /**
             * The text the assistant speaks.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * Speak the filler message immediately when the call to the agent begins.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("request_start")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * An optional delay value. This value is ignored for `request_start` messages.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timingMs(): Optional<Long> = timingMs.getOptional("timing_ms")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [timingMs].
             *
             * Unlike [timingMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timing_ms") @ExcludeMissing fun _timingMs(): JsonField<Long> = timingMs

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
                 * [A2AAgentRequestStartMessage].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [A2AAgentRequestStartMessage]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("request_start")
                private var timingMs: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(a2AAgentRequestStartMessage: A2AAgentRequestStartMessage) =
                    apply {
                        content = a2AAgentRequestStartMessage.content
                        type = a2AAgentRequestStartMessage.type
                        timingMs = a2AAgentRequestStartMessage.timingMs
                        additionalProperties =
                            a2AAgentRequestStartMessage.additionalProperties.toMutableMap()
                    }

                /** The text the assistant speaks. */
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
                 * JsonValue.from("request_start")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /** An optional delay value. This value is ignored for `request_start` messages. */
                fun timingMs(timingMs: Long) = timingMs(JsonField.of(timingMs))

                /**
                 * Sets [Builder.timingMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timingMs] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timingMs(timingMs: JsonField<Long>) = apply { this.timingMs = timingMs }

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
                 * Returns an immutable instance of [A2AAgentRequestStartMessage].
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
                fun build(): A2AAgentRequestStartMessage =
                    A2AAgentRequestStartMessage(
                        checkRequired("content", content),
                        type,
                        timingMs,
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
            fun validate(): A2AAgentRequestStartMessage = apply {
                if (validated) {
                    return@apply
                }

                content()
                _type().let {
                    if (it != JsonValue.from("request_start")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
                timingMs()
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
                    type.let { if (it == JsonValue.from("request_start")) 1 else 0 } +
                    (if (timingMs.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is A2AAgentRequestStartMessage &&
                    content == other.content &&
                    type == other.type &&
                    timingMs == other.timingMs &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, type, timingMs, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "A2AAgentRequestStartMessage{content=$content, type=$type, timingMs=$timingMs, additionalProperties=$additionalProperties}"
        }

        class A2AAgentRequestResponseDelayedMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val timingMs: JsonField<Long>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timing_ms")
                @ExcludeMissing
                timingMs: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(content, timingMs, type, mutableMapOf())

            /**
             * The text the assistant speaks.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * How long to wait, in milliseconds, before speaking this message.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timingMs(): Long = timingMs.getRequired("timing_ms")

            /**
             * Speak the filler message only if the agent has not answered yet after `timing_ms`.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("request_response_delayed")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [timingMs].
             *
             * Unlike [timingMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timing_ms") @ExcludeMissing fun _timingMs(): JsonField<Long> = timingMs

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
                 * [A2AAgentRequestResponseDelayedMessage].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .timingMs()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [A2AAgentRequestResponseDelayedMessage]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var timingMs: JsonField<Long>? = null
                private var type: JsonValue = JsonValue.from("request_response_delayed")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    a2AAgentRequestResponseDelayedMessage: A2AAgentRequestResponseDelayedMessage
                ) = apply {
                    content = a2AAgentRequestResponseDelayedMessage.content
                    timingMs = a2AAgentRequestResponseDelayedMessage.timingMs
                    type = a2AAgentRequestResponseDelayedMessage.type
                    additionalProperties =
                        a2AAgentRequestResponseDelayedMessage.additionalProperties.toMutableMap()
                }

                /** The text the assistant speaks. */
                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                /** How long to wait, in milliseconds, before speaking this message. */
                fun timingMs(timingMs: Long) = timingMs(JsonField.of(timingMs))

                /**
                 * Sets [Builder.timingMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timingMs] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timingMs(timingMs: JsonField<Long>) = apply { this.timingMs = timingMs }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("request_response_delayed")
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
                 * Returns an immutable instance of [A2AAgentRequestResponseDelayedMessage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .timingMs()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): A2AAgentRequestResponseDelayedMessage =
                    A2AAgentRequestResponseDelayedMessage(
                        checkRequired("content", content),
                        checkRequired("timingMs", timingMs),
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
            fun validate(): A2AAgentRequestResponseDelayedMessage = apply {
                if (validated) {
                    return@apply
                }

                content()
                timingMs()
                _type().let {
                    if (it != JsonValue.from("request_response_delayed")) {
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    (if (timingMs.asKnown().isPresent) 1 else 0) +
                    type.let { if (it == JsonValue.from("request_response_delayed")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is A2AAgentRequestResponseDelayedMessage &&
                    content == other.content &&
                    timingMs == other.timingMs &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, timingMs, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "A2AAgentRequestResponseDelayedMessage{content=$content, timingMs=$timingMs, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssistantA2AAgent &&
            name == other.name &&
            url == other.url &&
            async == other.async &&
            headers == other.headers &&
            messages == other.messages &&
            pollIntervalMs == other.pollIntervalMs &&
            timeoutMs == other.timeoutMs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            name,
            url,
            async,
            headers,
            messages,
            pollIntervalMs,
            timeoutMs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AssistantA2AAgent{name=$name, url=$url, async=$async, headers=$headers, messages=$messages, pollIntervalMs=$pollIntervalMs, timeoutMs=$timeoutMs, additionalProperties=$additionalProperties}"
}
