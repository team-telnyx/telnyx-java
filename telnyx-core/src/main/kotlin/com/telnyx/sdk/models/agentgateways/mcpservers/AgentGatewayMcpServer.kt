// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.mcpservers

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
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayShownAuth
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AgentGatewayMcpServer
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val auth: JsonField<AgentGatewayShownAuth>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val forwardedHeaders: JsonField<List<String>>,
    private val name: JsonField<String>,
    private val openToEveryKey: JsonField<Boolean>,
    private val staticHeaders: JsonField<StaticHeaders>,
    private val tools: JsonField<List<String>>,
    private val transport: JsonField<Transport>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("auth")
        @ExcludeMissing
        auth: JsonField<AgentGatewayShownAuth> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("forwarded_headers")
        @ExcludeMissing
        forwardedHeaders: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("open_to_every_key")
        @ExcludeMissing
        openToEveryKey: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("static_headers")
        @ExcludeMissing
        staticHeaders: JsonField<StaticHeaders> = JsonMissing.of(),
        @JsonProperty("tools") @ExcludeMissing tools: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("transport")
        @ExcludeMissing
        transport: JsonField<Transport> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        auth,
        createdAt,
        forwardedHeaders,
        name,
        openToEveryKey,
        staticHeaders,
        tools,
        transport,
        updatedAt,
        url,
        mutableMapOf(),
    )

    /**
     * Identifies the server.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The server's outbound authentication method. Credentials are never returned.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun auth(): AgentGatewayShownAuth = auth.getRequired("auth")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Headers copied from the agent's request, by name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun forwardedHeaders(): List<String> = forwardedHeaders.getRequired("forwarded_headers")

    /**
     * A name for the server, unique on the instance across MCP servers and APIs, regardless of
     * case. Letters, digits, `_`, and `.`. The gateway prefixes the server's tools with it and a
     * hyphen.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * `true` lets every key on the instance use the server, granted or not.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun openToEveryKey(): Boolean = openToEveryKey.getRequired("open_to_every_key")

    /**
     * Headers sent on every request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun staticHeaders(): StaticHeaders = staticHeaders.getRequired("static_headers")

    /**
     * The tools the server exposes to every key, by name. `[]` exposes every tool.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tools(): List<String> = tools.getRequired("tools")

    /**
     * `http` for Streamable HTTP, or `sse` for Server-Sent Events.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transport(): Transport = transport.getRequired("transport")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * The server's MCP endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [auth].
     *
     * Unlike [auth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth") @ExcludeMissing fun _auth(): JsonField<AgentGatewayShownAuth> = auth

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [forwardedHeaders].
     *
     * Unlike [forwardedHeaders], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("forwarded_headers")
    @ExcludeMissing
    fun _forwardedHeaders(): JsonField<List<String>> = forwardedHeaders

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [openToEveryKey].
     *
     * Unlike [openToEveryKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("open_to_every_key")
    @ExcludeMissing
    fun _openToEveryKey(): JsonField<Boolean> = openToEveryKey

    /**
     * Returns the raw JSON value of [staticHeaders].
     *
     * Unlike [staticHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("static_headers")
    @ExcludeMissing
    fun _staticHeaders(): JsonField<StaticHeaders> = staticHeaders

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<String>> = tools

    /**
     * Returns the raw JSON value of [transport].
     *
     * Unlike [transport], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transport") @ExcludeMissing fun _transport(): JsonField<Transport> = transport

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
         * Returns a mutable builder for constructing an instance of [AgentGatewayMcpServer].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .auth()
         * .createdAt()
         * .forwardedHeaders()
         * .name()
         * .openToEveryKey()
         * .staticHeaders()
         * .tools()
         * .transport()
         * .updatedAt()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentGatewayMcpServer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var auth: JsonField<AgentGatewayShownAuth>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var forwardedHeaders: JsonField<MutableList<String>>? = null
        private var name: JsonField<String>? = null
        private var openToEveryKey: JsonField<Boolean>? = null
        private var staticHeaders: JsonField<StaticHeaders>? = null
        private var tools: JsonField<MutableList<String>>? = null
        private var transport: JsonField<Transport>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var url: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentGatewayMcpServer: AgentGatewayMcpServer) = apply {
            id = agentGatewayMcpServer.id
            auth = agentGatewayMcpServer.auth
            createdAt = agentGatewayMcpServer.createdAt
            forwardedHeaders = agentGatewayMcpServer.forwardedHeaders.map { it.toMutableList() }
            name = agentGatewayMcpServer.name
            openToEveryKey = agentGatewayMcpServer.openToEveryKey
            staticHeaders = agentGatewayMcpServer.staticHeaders
            tools = agentGatewayMcpServer.tools.map { it.toMutableList() }
            transport = agentGatewayMcpServer.transport
            updatedAt = agentGatewayMcpServer.updatedAt
            url = agentGatewayMcpServer.url
            additionalProperties = agentGatewayMcpServer.additionalProperties.toMutableMap()
        }

        /** Identifies the server. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The server's outbound authentication method. Credentials are never returned. */
        fun auth(auth: AgentGatewayShownAuth) = auth(JsonField.of(auth))

        /**
         * Sets [Builder.auth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.auth] with a well-typed [AgentGatewayShownAuth] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun auth(auth: JsonField<AgentGatewayShownAuth>) = apply { this.auth = auth }

        fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Headers copied from the agent's request, by name. */
        fun forwardedHeaders(forwardedHeaders: List<String>) =
            forwardedHeaders(JsonField.of(forwardedHeaders))

        /**
         * Sets [Builder.forwardedHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.forwardedHeaders] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun forwardedHeaders(forwardedHeaders: JsonField<List<String>>) = apply {
            this.forwardedHeaders = forwardedHeaders.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [forwardedHeaders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addForwardedHeader(forwardedHeader: String) = apply {
            forwardedHeaders =
                (forwardedHeaders ?: JsonField.of(mutableListOf())).also {
                    checkKnown("forwardedHeaders", it).add(forwardedHeader)
                }
        }

        /**
         * A name for the server, unique on the instance across MCP servers and APIs, regardless of
         * case. Letters, digits, `_`, and `.`. The gateway prefixes the server's tools with it and
         * a hyphen.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** `true` lets every key on the instance use the server, granted or not. */
        fun openToEveryKey(openToEveryKey: Boolean) = openToEveryKey(JsonField.of(openToEveryKey))

        /**
         * Sets [Builder.openToEveryKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openToEveryKey] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun openToEveryKey(openToEveryKey: JsonField<Boolean>) = apply {
            this.openToEveryKey = openToEveryKey
        }

        /** Headers sent on every request. */
        fun staticHeaders(staticHeaders: StaticHeaders) = staticHeaders(JsonField.of(staticHeaders))

        /**
         * Sets [Builder.staticHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.staticHeaders] with a well-typed [StaticHeaders] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun staticHeaders(staticHeaders: JsonField<StaticHeaders>) = apply {
            this.staticHeaders = staticHeaders
        }

        /** The tools the server exposes to every key, by name. `[]` exposes every tool. */
        fun tools(tools: List<String>) = tools(JsonField.of(tools))

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tools(tools: JsonField<List<String>>) = apply {
            this.tools = tools.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTool(tool: String) = apply {
            tools =
                (tools ?: JsonField.of(mutableListOf())).also { checkKnown("tools", it).add(tool) }
        }

        /** `http` for Streamable HTTP, or `sse` for Server-Sent Events. */
        fun transport(transport: Transport) = transport(JsonField.of(transport))

        /**
         * Sets [Builder.transport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transport] with a well-typed [Transport] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transport(transport: JsonField<Transport>) = apply { this.transport = transport }

        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The server's MCP endpoint. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [AgentGatewayMcpServer].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .auth()
         * .createdAt()
         * .forwardedHeaders()
         * .name()
         * .openToEveryKey()
         * .staticHeaders()
         * .tools()
         * .transport()
         * .updatedAt()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentGatewayMcpServer =
            AgentGatewayMcpServer(
                checkRequired("id", id),
                checkRequired("auth", auth),
                checkRequired("createdAt", createdAt),
                checkRequired("forwardedHeaders", forwardedHeaders).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("openToEveryKey", openToEveryKey),
                checkRequired("staticHeaders", staticHeaders),
                checkRequired("tools", tools).map { it.toImmutable() },
                checkRequired("transport", transport),
                checkRequired("updatedAt", updatedAt),
                checkRequired("url", url),
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
    fun validate(): AgentGatewayMcpServer = apply {
        if (validated) {
            return@apply
        }

        id()
        auth().validate()
        createdAt()
        forwardedHeaders()
        name()
        openToEveryKey()
        staticHeaders().validate()
        tools()
        transport().validate()
        updatedAt()
        url()
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
            (auth.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (forwardedHeaders.asKnown().getOrNull()?.size ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (openToEveryKey.asKnown().isPresent) 1 else 0) +
            (staticHeaders.asKnown().getOrNull()?.validity() ?: 0) +
            (tools.asKnown().getOrNull()?.size ?: 0) +
            (transport.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    /** Headers sent on every request. */
    class StaticHeaders
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

            /** Returns a mutable builder for constructing an instance of [StaticHeaders]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [StaticHeaders]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(staticHeaders: StaticHeaders) = apply {
                additionalProperties = staticHeaders.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [StaticHeaders].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): StaticHeaders = StaticHeaders(additionalProperties.toImmutable())
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
        fun validate(): StaticHeaders = apply {
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

            return other is StaticHeaders && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "StaticHeaders{additionalProperties=$additionalProperties}"
    }

    /** `http` for Streamable HTTP, or `sse` for Server-Sent Events. */
    class Transport @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val HTTP = of("http")

            @JvmField val SSE = of("sse")

            @JvmStatic fun of(value: String) = Transport(JsonField.of(value))
        }

        /** An enum containing [Transport]'s known values. */
        enum class Known {
            HTTP,
            SSE,
        }

        /**
         * An enum containing [Transport]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Transport] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HTTP,
            SSE,
            /**
             * An enum member indicating that [Transport] was instantiated with an unknown value.
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
                HTTP -> Value.HTTP
                SSE -> Value.SSE
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
                HTTP -> Known.HTTP
                SSE -> Known.SSE
                else -> throw TelnyxInvalidDataException("Unknown Transport: $value")
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
        fun validate(): Transport = apply {
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

            return other is Transport && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentGatewayMcpServer &&
            id == other.id &&
            auth == other.auth &&
            createdAt == other.createdAt &&
            forwardedHeaders == other.forwardedHeaders &&
            name == other.name &&
            openToEveryKey == other.openToEveryKey &&
            staticHeaders == other.staticHeaders &&
            tools == other.tools &&
            transport == other.transport &&
            updatedAt == other.updatedAt &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            auth,
            createdAt,
            forwardedHeaders,
            name,
            openToEveryKey,
            staticHeaders,
            tools,
            transport,
            updatedAt,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentGatewayMcpServer{id=$id, auth=$auth, createdAt=$createdAt, forwardedHeaders=$forwardedHeaders, name=$name, openToEveryKey=$openToEveryKey, staticHeaders=$staticHeaders, tools=$tools, transport=$transport, updatedAt=$updatedAt, url=$url, additionalProperties=$additionalProperties}"
}
