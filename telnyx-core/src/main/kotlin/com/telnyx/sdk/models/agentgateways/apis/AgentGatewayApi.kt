// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.apis

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class AgentGatewayApi
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val auth: JsonField<AgentGatewayShownAuth>,
    private val baseUrl: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val forwardedHeaders: JsonField<List<String>>,
    private val name: JsonField<String>,
    private val openToEveryKey: JsonField<Boolean>,
    private val specUrl: JsonField<String>,
    private val staticHeaders: JsonField<StaticHeaders>,
    private val tools: JsonField<List<String>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("auth")
        @ExcludeMissing
        auth: JsonField<AgentGatewayShownAuth> = JsonMissing.of(),
        @JsonProperty("base_url") @ExcludeMissing baseUrl: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("spec_url") @ExcludeMissing specUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("static_headers")
        @ExcludeMissing
        staticHeaders: JsonField<StaticHeaders> = JsonMissing.of(),
        @JsonProperty("tools") @ExcludeMissing tools: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        auth,
        baseUrl,
        createdAt,
        forwardedHeaders,
        name,
        openToEveryKey,
        specUrl,
        staticHeaders,
        tools,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Identifies the API.
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
     * Where the gateway sends the API's requests. `null` takes the description's first `servers`
     * entry.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baseUrl(): Optional<String> = baseUrl.getOptional("base_url")

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
     * A name for the API, unique on the instance across MCP servers and APIs, regardless of case.
     * Letters, digits, `_`, and `.`. The gateway prefixes the API's tools with it and a hyphen.
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
     * The URL of the API's OpenAPI description.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun specUrl(): String = specUrl.getRequired("spec_url")

    /**
     * Headers sent on every request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun staticHeaders(): StaticHeaders = staticHeaders.getRequired("static_headers")

    /**
     * The operations the API exposes as tools, by tool name. `[]` exposes every operation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tools(): List<String> = tools.getRequired("tools")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

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
     * Returns the raw JSON value of [baseUrl].
     *
     * Unlike [baseUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("base_url") @ExcludeMissing fun _baseUrl(): JsonField<String> = baseUrl

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
     * Returns the raw JSON value of [specUrl].
     *
     * Unlike [specUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spec_url") @ExcludeMissing fun _specUrl(): JsonField<String> = specUrl

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
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [AgentGatewayApi].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .auth()
         * .baseUrl()
         * .createdAt()
         * .forwardedHeaders()
         * .name()
         * .openToEveryKey()
         * .specUrl()
         * .staticHeaders()
         * .tools()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentGatewayApi]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var auth: JsonField<AgentGatewayShownAuth>? = null
        private var baseUrl: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var forwardedHeaders: JsonField<MutableList<String>>? = null
        private var name: JsonField<String>? = null
        private var openToEveryKey: JsonField<Boolean>? = null
        private var specUrl: JsonField<String>? = null
        private var staticHeaders: JsonField<StaticHeaders>? = null
        private var tools: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentGatewayApi: AgentGatewayApi) = apply {
            id = agentGatewayApi.id
            auth = agentGatewayApi.auth
            baseUrl = agentGatewayApi.baseUrl
            createdAt = agentGatewayApi.createdAt
            forwardedHeaders = agentGatewayApi.forwardedHeaders.map { it.toMutableList() }
            name = agentGatewayApi.name
            openToEveryKey = agentGatewayApi.openToEveryKey
            specUrl = agentGatewayApi.specUrl
            staticHeaders = agentGatewayApi.staticHeaders
            tools = agentGatewayApi.tools.map { it.toMutableList() }
            updatedAt = agentGatewayApi.updatedAt
            additionalProperties = agentGatewayApi.additionalProperties.toMutableMap()
        }

        /** Identifies the API. */
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

        /**
         * Where the gateway sends the API's requests. `null` takes the description's first
         * `servers` entry.
         */
        fun baseUrl(baseUrl: String?) = baseUrl(JsonField.ofNullable(baseUrl))

        /** Alias for calling [Builder.baseUrl] with `baseUrl.orElse(null)`. */
        fun baseUrl(baseUrl: Optional<String>) = baseUrl(baseUrl.getOrNull())

        /**
         * Sets [Builder.baseUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

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
         * A name for the API, unique on the instance across MCP servers and APIs, regardless of
         * case. Letters, digits, `_`, and `.`. The gateway prefixes the API's tools with it and a
         * hyphen.
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

        /** The URL of the API's OpenAPI description. */
        fun specUrl(specUrl: String) = specUrl(JsonField.of(specUrl))

        /**
         * Sets [Builder.specUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun specUrl(specUrl: JsonField<String>) = apply { this.specUrl = specUrl }

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

        /** The operations the API exposes as tools, by tool name. `[]` exposes every operation. */
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
         * Returns an immutable instance of [AgentGatewayApi].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .auth()
         * .baseUrl()
         * .createdAt()
         * .forwardedHeaders()
         * .name()
         * .openToEveryKey()
         * .specUrl()
         * .staticHeaders()
         * .tools()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentGatewayApi =
            AgentGatewayApi(
                checkRequired("id", id),
                checkRequired("auth", auth),
                checkRequired("baseUrl", baseUrl),
                checkRequired("createdAt", createdAt),
                checkRequired("forwardedHeaders", forwardedHeaders).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("openToEveryKey", openToEveryKey),
                checkRequired("specUrl", specUrl),
                checkRequired("staticHeaders", staticHeaders),
                checkRequired("tools", tools).map { it.toImmutable() },
                checkRequired("updatedAt", updatedAt),
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
    fun validate(): AgentGatewayApi = apply {
        if (validated) {
            return@apply
        }

        id()
        auth().validate()
        baseUrl()
        createdAt()
        forwardedHeaders()
        name()
        openToEveryKey()
        specUrl()
        staticHeaders().validate()
        tools()
        updatedAt()
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
            (if (baseUrl.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (forwardedHeaders.asKnown().getOrNull()?.size ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (openToEveryKey.asKnown().isPresent) 1 else 0) +
            (if (specUrl.asKnown().isPresent) 1 else 0) +
            (staticHeaders.asKnown().getOrNull()?.validity() ?: 0) +
            (tools.asKnown().getOrNull()?.size ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentGatewayApi &&
            id == other.id &&
            auth == other.auth &&
            baseUrl == other.baseUrl &&
            createdAt == other.createdAt &&
            forwardedHeaders == other.forwardedHeaders &&
            name == other.name &&
            openToEveryKey == other.openToEveryKey &&
            specUrl == other.specUrl &&
            staticHeaders == other.staticHeaders &&
            tools == other.tools &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            auth,
            baseUrl,
            createdAt,
            forwardedHeaders,
            name,
            openToEveryKey,
            specUrl,
            staticHeaders,
            tools,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentGatewayApi{id=$id, auth=$auth, baseUrl=$baseUrl, createdAt=$createdAt, forwardedHeaders=$forwardedHeaders, name=$name, openToEveryKey=$openToEveryKey, specUrl=$specUrl, staticHeaders=$staticHeaders, tools=$tools, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
