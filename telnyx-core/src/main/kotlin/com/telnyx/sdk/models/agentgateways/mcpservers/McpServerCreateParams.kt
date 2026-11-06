// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.mcpservers

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
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayNoAuth
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayOAuthClientCredentials
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayPassthroughAuth
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayStaticAuth
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Adds an MCP server. The instance serves its tools at `{gateway_url}/mcp`, each named with the
 * server's `name` and a hyphen, to the keys granted the server and, with `open_to_every_key`, to
 * every key. The instance must be `ready`; otherwise the request answers `409`.
 */
class McpServerCreateParams
private constructor(
    private val instanceId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun instanceId(): Optional<String> = Optional.ofNullable(instanceId)

    /**
     * A name for the server, unique on the instance across MCP servers and APIs, regardless of
     * case. Up to 100 letters, digits, `_`, and `.`. The gateway prefixes the server's tools with
     * it and a hyphen.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The server's MCP endpoint, `http` or `https`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = body.url()

    /**
     * How the gateway authenticates to the server. Replaced whole on an update; `{"type": "none"}`
     * removes the credential.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun auth(): Optional<Auth> = body.auth()

    /**
     * Headers copied from the agent's request, by name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun forwardedHeaders(): Optional<List<String>> = body.forwardedHeaders()

    /**
     * `true` lets every key on the instance use the server, granted or not.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun openToEveryKey(): Optional<Boolean> = body.openToEveryKey()

    /**
     * Headers sent on every request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun staticHeaders(): Optional<StaticHeaders> = body.staticHeaders()

    /**
     * The tools the server exposes to every key, by name. `[]` exposes every tool.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tools(): Optional<List<String>> = body.tools()

    /**
     * `http` for Streamable HTTP, or `sse` for Server-Sent Events.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transport(): Optional<Transport> = body.transport()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

    /**
     * Returns the raw JSON value of [auth].
     *
     * Unlike [auth], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _auth(): JsonField<Auth> = body._auth()

    /**
     * Returns the raw JSON value of [forwardedHeaders].
     *
     * Unlike [forwardedHeaders], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _forwardedHeaders(): JsonField<List<String>> = body._forwardedHeaders()

    /**
     * Returns the raw JSON value of [openToEveryKey].
     *
     * Unlike [openToEveryKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _openToEveryKey(): JsonField<Boolean> = body._openToEveryKey()

    /**
     * Returns the raw JSON value of [staticHeaders].
     *
     * Unlike [staticHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _staticHeaders(): JsonField<StaticHeaders> = body._staticHeaders()

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tools(): JsonField<List<String>> = body._tools()

    /**
     * Returns the raw JSON value of [transport].
     *
     * Unlike [transport], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transport(): JsonField<Transport> = body._transport()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [McpServerCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [McpServerCreateParams]. */
    class Builder internal constructor() {

        private var instanceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(mcpServerCreateParams: McpServerCreateParams) = apply {
            instanceId = mcpServerCreateParams.instanceId
            body = mcpServerCreateParams.body.toBuilder()
            additionalHeaders = mcpServerCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = mcpServerCreateParams.additionalQueryParams.toBuilder()
        }

        fun instanceId(instanceId: String?) = apply { this.instanceId = instanceId }

        /** Alias for calling [Builder.instanceId] with `instanceId.orElse(null)`. */
        fun instanceId(instanceId: Optional<String>) = instanceId(instanceId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [url]
         * - [auth]
         * - [forwardedHeaders]
         * - [openToEveryKey]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * A name for the server, unique on the instance across MCP servers and APIs, regardless of
         * case. Up to 100 letters, digits, `_`, and `.`. The gateway prefixes the server's tools
         * with it and a hyphen.
         */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The server's MCP endpoint, `http` or `https`. */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

        /**
         * How the gateway authenticates to the server. Replaced whole on an update; `{"type":
         * "none"}` removes the credential.
         */
        fun auth(auth: Auth) = apply { body.auth(auth) }

        /**
         * Sets [Builder.auth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.auth] with a well-typed [Auth] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun auth(auth: JsonField<Auth>) = apply { body.auth(auth) }

        /** Alias for calling [auth] with `Auth.ofAgentGatewayNo(agentGatewayNo)`. */
        fun auth(agentGatewayNo: AgentGatewayNoAuth) = apply { body.auth(agentGatewayNo) }

        /** Alias for calling [auth] with `Auth.ofAgentGatewayStatic(agentGatewayStatic)`. */
        fun auth(agentGatewayStatic: AgentGatewayStaticAuth) = apply {
            body.auth(agentGatewayStatic)
        }

        /**
         * Alias for calling [auth] with
         * `Auth.ofAgentGatewayOAuthClientCredentials(agentGatewayOAuthClientCredentials)`.
         */
        fun auth(agentGatewayOAuthClientCredentials: AgentGatewayOAuthClientCredentials) = apply {
            body.auth(agentGatewayOAuthClientCredentials)
        }

        /**
         * Alias for calling [auth] with `Auth.ofAgentGatewayPassthrough(agentGatewayPassthrough)`.
         */
        fun auth(agentGatewayPassthrough: AgentGatewayPassthroughAuth) = apply {
            body.auth(agentGatewayPassthrough)
        }

        /** Alias for calling [auth] with `Auth.ofAgentGatewayAwsSigV4(agentGatewayAwsSigV4)`. */
        fun auth(agentGatewayAwsSigV4: AgentGatewayAwsSigV4Auth) = apply {
            body.auth(agentGatewayAwsSigV4)
        }

        /** Headers copied from the agent's request, by name. */
        fun forwardedHeaders(forwardedHeaders: List<String>) = apply {
            body.forwardedHeaders(forwardedHeaders)
        }

        /**
         * Sets [Builder.forwardedHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.forwardedHeaders] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun forwardedHeaders(forwardedHeaders: JsonField<List<String>>) = apply {
            body.forwardedHeaders(forwardedHeaders)
        }

        /**
         * Adds a single [String] to [forwardedHeaders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addForwardedHeader(forwardedHeader: String) = apply {
            body.addForwardedHeader(forwardedHeader)
        }

        /** `true` lets every key on the instance use the server, granted or not. */
        fun openToEveryKey(openToEveryKey: Boolean) = apply { body.openToEveryKey(openToEveryKey) }

        /**
         * Sets [Builder.openToEveryKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openToEveryKey] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun openToEveryKey(openToEveryKey: JsonField<Boolean>) = apply {
            body.openToEveryKey(openToEveryKey)
        }

        /** Headers sent on every request. */
        fun staticHeaders(staticHeaders: StaticHeaders) = apply {
            body.staticHeaders(staticHeaders)
        }

        /**
         * Sets [Builder.staticHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.staticHeaders] with a well-typed [StaticHeaders] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun staticHeaders(staticHeaders: JsonField<StaticHeaders>) = apply {
            body.staticHeaders(staticHeaders)
        }

        /** The tools the server exposes to every key, by name. `[]` exposes every tool. */
        fun tools(tools: List<String>) = apply { body.tools(tools) }

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tools(tools: JsonField<List<String>>) = apply { body.tools(tools) }

        /**
         * Adds a single [String] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTool(tool: String) = apply { body.addTool(tool) }

        /** `http` for Streamable HTTP, or `sse` for Server-Sent Events. */
        fun transport(transport: Transport) = apply { body.transport(transport) }

        /**
         * Sets [Builder.transport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transport] with a well-typed [Transport] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transport(transport: JsonField<Transport>) = apply { body.transport(transport) }

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
         * Returns an immutable instance of [McpServerCreateParams].
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
        fun build(): McpServerCreateParams =
            McpServerCreateParams(
                instanceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> instanceId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val url: JsonField<String>,
        private val auth: JsonField<Auth>,
        private val forwardedHeaders: JsonField<List<String>>,
        private val openToEveryKey: JsonField<Boolean>,
        private val staticHeaders: JsonField<StaticHeaders>,
        private val tools: JsonField<List<String>>,
        private val transport: JsonField<Transport>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auth") @ExcludeMissing auth: JsonField<Auth> = JsonMissing.of(),
            @JsonProperty("forwarded_headers")
            @ExcludeMissing
            forwardedHeaders: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("open_to_every_key")
            @ExcludeMissing
            openToEveryKey: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("static_headers")
            @ExcludeMissing
            staticHeaders: JsonField<StaticHeaders> = JsonMissing.of(),
            @JsonProperty("tools")
            @ExcludeMissing
            tools: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("transport")
            @ExcludeMissing
            transport: JsonField<Transport> = JsonMissing.of(),
        ) : this(
            name,
            url,
            auth,
            forwardedHeaders,
            openToEveryKey,
            staticHeaders,
            tools,
            transport,
            mutableMapOf(),
        )

        /**
         * A name for the server, unique on the instance across MCP servers and APIs, regardless of
         * case. Up to 100 letters, digits, `_`, and `.`. The gateway prefixes the server's tools
         * with it and a hyphen.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The server's MCP endpoint, `http` or `https`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * How the gateway authenticates to the server. Replaced whole on an update; `{"type":
         * "none"}` removes the credential.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun auth(): Optional<Auth> = auth.getOptional("auth")

        /**
         * Headers copied from the agent's request, by name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun forwardedHeaders(): Optional<List<String>> =
            forwardedHeaders.getOptional("forwarded_headers")

        /**
         * `true` lets every key on the instance use the server, granted or not.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun openToEveryKey(): Optional<Boolean> = openToEveryKey.getOptional("open_to_every_key")

        /**
         * Headers sent on every request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun staticHeaders(): Optional<StaticHeaders> = staticHeaders.getOptional("static_headers")

        /**
         * The tools the server exposes to every key, by name. `[]` exposes every tool.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tools(): Optional<List<String>> = tools.getOptional("tools")

        /**
         * `http` for Streamable HTTP, or `sse` for Server-Sent Events.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transport(): Optional<Transport> = transport.getOptional("transport")

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
         * Returns the raw JSON value of [auth].
         *
         * Unlike [auth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auth") @ExcludeMissing fun _auth(): JsonField<Auth> = auth

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
         * Returns the raw JSON value of [openToEveryKey].
         *
         * Unlike [openToEveryKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("open_to_every_key")
        @ExcludeMissing
        fun _openToEveryKey(): JsonField<Boolean> = openToEveryKey

        /**
         * Returns the raw JSON value of [staticHeaders].
         *
         * Unlike [staticHeaders], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        @JsonProperty("transport")
        @ExcludeMissing
        fun _transport(): JsonField<Transport> = transport

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
             * .name()
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var url: JsonField<String>? = null
            private var auth: JsonField<Auth> = JsonMissing.of()
            private var forwardedHeaders: JsonField<MutableList<String>>? = null
            private var openToEveryKey: JsonField<Boolean> = JsonMissing.of()
            private var staticHeaders: JsonField<StaticHeaders> = JsonMissing.of()
            private var tools: JsonField<MutableList<String>>? = null
            private var transport: JsonField<Transport> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                url = body.url
                auth = body.auth
                forwardedHeaders = body.forwardedHeaders.map { it.toMutableList() }
                openToEveryKey = body.openToEveryKey
                staticHeaders = body.staticHeaders
                tools = body.tools.map { it.toMutableList() }
                transport = body.transport
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * A name for the server, unique on the instance across MCP servers and APIs, regardless
             * of case. Up to 100 letters, digits, `_`, and `.`. The gateway prefixes the server's
             * tools with it and a hyphen.
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

            /** The server's MCP endpoint, `http` or `https`. */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /**
             * How the gateway authenticates to the server. Replaced whole on an update; `{"type":
             * "none"}` removes the credential.
             */
            fun auth(auth: Auth) = auth(JsonField.of(auth))

            /**
             * Sets [Builder.auth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.auth] with a well-typed [Auth] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun auth(auth: JsonField<Auth>) = apply { this.auth = auth }

            /** Alias for calling [auth] with `Auth.ofAgentGatewayNo(agentGatewayNo)`. */
            fun auth(agentGatewayNo: AgentGatewayNoAuth) =
                auth(Auth.ofAgentGatewayNo(agentGatewayNo))

            /** Alias for calling [auth] with `Auth.ofAgentGatewayStatic(agentGatewayStatic)`. */
            fun auth(agentGatewayStatic: AgentGatewayStaticAuth) =
                auth(Auth.ofAgentGatewayStatic(agentGatewayStatic))

            /**
             * Alias for calling [auth] with
             * `Auth.ofAgentGatewayOAuthClientCredentials(agentGatewayOAuthClientCredentials)`.
             */
            fun auth(agentGatewayOAuthClientCredentials: AgentGatewayOAuthClientCredentials) =
                auth(Auth.ofAgentGatewayOAuthClientCredentials(agentGatewayOAuthClientCredentials))

            /**
             * Alias for calling [auth] with
             * `Auth.ofAgentGatewayPassthrough(agentGatewayPassthrough)`.
             */
            fun auth(agentGatewayPassthrough: AgentGatewayPassthroughAuth) =
                auth(Auth.ofAgentGatewayPassthrough(agentGatewayPassthrough))

            /**
             * Alias for calling [auth] with `Auth.ofAgentGatewayAwsSigV4(agentGatewayAwsSigV4)`.
             */
            fun auth(agentGatewayAwsSigV4: AgentGatewayAwsSigV4Auth) =
                auth(Auth.ofAgentGatewayAwsSigV4(agentGatewayAwsSigV4))

            /** Headers copied from the agent's request, by name. */
            fun forwardedHeaders(forwardedHeaders: List<String>) =
                forwardedHeaders(JsonField.of(forwardedHeaders))

            /**
             * Sets [Builder.forwardedHeaders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.forwardedHeaders] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** `true` lets every key on the instance use the server, granted or not. */
            fun openToEveryKey(openToEveryKey: Boolean) =
                openToEveryKey(JsonField.of(openToEveryKey))

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
            fun staticHeaders(staticHeaders: StaticHeaders) =
                staticHeaders(JsonField.of(staticHeaders))

            /**
             * Sets [Builder.staticHeaders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.staticHeaders] with a well-typed [StaticHeaders]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun staticHeaders(staticHeaders: JsonField<StaticHeaders>) = apply {
                this.staticHeaders = staticHeaders
            }

            /** The tools the server exposes to every key, by name. `[]` exposes every tool. */
            fun tools(tools: List<String>) = tools(JsonField.of(tools))

            /**
             * Sets [Builder.tools] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tools] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                    (tools ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tools", it).add(tool)
                    }
            }

            /** `http` for Streamable HTTP, or `sse` for Server-Sent Events. */
            fun transport(transport: Transport) = transport(JsonField.of(transport))

            /**
             * Sets [Builder.transport] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transport] with a well-typed [Transport] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transport(transport: JsonField<Transport>) = apply { this.transport = transport }

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
             * .name()
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    checkRequired("url", url),
                    auth,
                    (forwardedHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                    openToEveryKey,
                    staticHeaders,
                    (tools ?: JsonMissing.of()).map { it.toImmutable() },
                    transport,
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

            name()
            url()
            auth().ifPresent { it.validate() }
            forwardedHeaders()
            openToEveryKey()
            staticHeaders().ifPresent { it.validate() }
            tools()
            transport().ifPresent { it.validate() }
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
                (if (url.asKnown().isPresent) 1 else 0) +
                (auth.asKnown().getOrNull()?.validity() ?: 0) +
                (forwardedHeaders.asKnown().getOrNull()?.size ?: 0) +
                (if (openToEveryKey.asKnown().isPresent) 1 else 0) +
                (staticHeaders.asKnown().getOrNull()?.validity() ?: 0) +
                (tools.asKnown().getOrNull()?.size ?: 0) +
                (transport.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                url == other.url &&
                auth == other.auth &&
                forwardedHeaders == other.forwardedHeaders &&
                openToEveryKey == other.openToEveryKey &&
                staticHeaders == other.staticHeaders &&
                tools == other.tools &&
                transport == other.transport &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                url,
                auth,
                forwardedHeaders,
                openToEveryKey,
                staticHeaders,
                tools,
                transport,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, url=$url, auth=$auth, forwardedHeaders=$forwardedHeaders, openToEveryKey=$openToEveryKey, staticHeaders=$staticHeaders, tools=$tools, transport=$transport, additionalProperties=$additionalProperties}"
    }

    /**
     * How the gateway authenticates to the server. Replaced whole on an update; `{"type": "none"}`
     * removes the credential.
     */
    @JsonDeserialize(using = Auth.Deserializer::class)
    @JsonSerialize(using = Auth.Serializer::class)
    class Auth
    private constructor(
        private val agentGatewayNo: AgentGatewayNoAuth? = null,
        private val agentGatewayStatic: AgentGatewayStaticAuth? = null,
        private val agentGatewayOAuthClientCredentials: AgentGatewayOAuthClientCredentials? = null,
        private val agentGatewayPassthrough: AgentGatewayPassthroughAuth? = null,
        private val agentGatewayAwsSigV4: AgentGatewayAwsSigV4Auth? = null,
        private val _json: JsonValue? = null,
    ) {

        /** The gateway sends no credential. */
        fun agentGatewayNo(): Optional<AgentGatewayNoAuth> = Optional.ofNullable(agentGatewayNo)

        /**
         * A static credential the gateway sends on every request. Write-only: responses show its
         * `type` only.
         */
        fun agentGatewayStatic(): Optional<AgentGatewayStaticAuth> =
            Optional.ofNullable(agentGatewayStatic)

        /**
         * The gateway gets its own access token with the `client_credentials` grant and sends it as
         * a bearer token on every request, renewing it before it expires. The client ID and secret
         * are write-only.
         */
        fun agentGatewayOAuthClientCredentials(): Optional<AgentGatewayOAuthClientCredentials> =
            Optional.ofNullable(agentGatewayOAuthClientCredentials)

        /** The gateway forwards the agent's own `Authorization` header to the server unchanged. */
        fun agentGatewayPassthrough(): Optional<AgentGatewayPassthroughAuth> =
            Optional.ofNullable(agentGatewayPassthrough)

        /**
         * The gateway signs each request with AWS Signature Version 4. Without keys or a role, it
         * uses the instance's own AWS identity. Keys are write-only.
         */
        fun agentGatewayAwsSigV4(): Optional<AgentGatewayAwsSigV4Auth> =
            Optional.ofNullable(agentGatewayAwsSigV4)

        fun isAgentGatewayNo(): Boolean = agentGatewayNo != null

        fun isAgentGatewayStatic(): Boolean = agentGatewayStatic != null

        fun isAgentGatewayOAuthClientCredentials(): Boolean =
            agentGatewayOAuthClientCredentials != null

        fun isAgentGatewayPassthrough(): Boolean = agentGatewayPassthrough != null

        fun isAgentGatewayAwsSigV4(): Boolean = agentGatewayAwsSigV4 != null

        /** The gateway sends no credential. */
        fun asAgentGatewayNo(): AgentGatewayNoAuth = agentGatewayNo.getOrThrow("agentGatewayNo")

        /**
         * A static credential the gateway sends on every request. Write-only: responses show its
         * `type` only.
         */
        fun asAgentGatewayStatic(): AgentGatewayStaticAuth =
            agentGatewayStatic.getOrThrow("agentGatewayStatic")

        /**
         * The gateway gets its own access token with the `client_credentials` grant and sends it as
         * a bearer token on every request, renewing it before it expires. The client ID and secret
         * are write-only.
         */
        fun asAgentGatewayOAuthClientCredentials(): AgentGatewayOAuthClientCredentials =
            agentGatewayOAuthClientCredentials.getOrThrow("agentGatewayOAuthClientCredentials")

        /** The gateway forwards the agent's own `Authorization` header to the server unchanged. */
        fun asAgentGatewayPassthrough(): AgentGatewayPassthroughAuth =
            agentGatewayPassthrough.getOrThrow("agentGatewayPassthrough")

        /**
         * The gateway signs each request with AWS Signature Version 4. Without keys or a role, it
         * uses the instance's own AWS identity. Keys are write-only.
         */
        fun asAgentGatewayAwsSigV4(): AgentGatewayAwsSigV4Auth =
            agentGatewayAwsSigV4.getOrThrow("agentGatewayAwsSigV4")

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
         * Optional<String> result = auth.accept(new Auth.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitAgentGatewayNo(AgentGatewayNoAuth agentGatewayNo) {
         *         return Optional.of(agentGatewayNo.toString());
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
                agentGatewayNo != null -> visitor.visitAgentGatewayNo(agentGatewayNo)
                agentGatewayStatic != null -> visitor.visitAgentGatewayStatic(agentGatewayStatic)
                agentGatewayOAuthClientCredentials != null ->
                    visitor.visitAgentGatewayOAuthClientCredentials(
                        agentGatewayOAuthClientCredentials
                    )
                agentGatewayPassthrough != null ->
                    visitor.visitAgentGatewayPassthrough(agentGatewayPassthrough)
                agentGatewayAwsSigV4 != null ->
                    visitor.visitAgentGatewayAwsSigV4(agentGatewayAwsSigV4)
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
        fun validate(): Auth = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAgentGatewayNo(agentGatewayNo: AgentGatewayNoAuth) {
                        agentGatewayNo.validate()
                    }

                    override fun visitAgentGatewayStatic(
                        agentGatewayStatic: AgentGatewayStaticAuth
                    ) {
                        agentGatewayStatic.validate()
                    }

                    override fun visitAgentGatewayOAuthClientCredentials(
                        agentGatewayOAuthClientCredentials: AgentGatewayOAuthClientCredentials
                    ) {
                        agentGatewayOAuthClientCredentials.validate()
                    }

                    override fun visitAgentGatewayPassthrough(
                        agentGatewayPassthrough: AgentGatewayPassthroughAuth
                    ) {
                        agentGatewayPassthrough.validate()
                    }

                    override fun visitAgentGatewayAwsSigV4(
                        agentGatewayAwsSigV4: AgentGatewayAwsSigV4Auth
                    ) {
                        agentGatewayAwsSigV4.validate()
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
                    override fun visitAgentGatewayNo(agentGatewayNo: AgentGatewayNoAuth) =
                        agentGatewayNo.validity()

                    override fun visitAgentGatewayStatic(
                        agentGatewayStatic: AgentGatewayStaticAuth
                    ) = agentGatewayStatic.validity()

                    override fun visitAgentGatewayOAuthClientCredentials(
                        agentGatewayOAuthClientCredentials: AgentGatewayOAuthClientCredentials
                    ) = agentGatewayOAuthClientCredentials.validity()

                    override fun visitAgentGatewayPassthrough(
                        agentGatewayPassthrough: AgentGatewayPassthroughAuth
                    ) = agentGatewayPassthrough.validity()

                    override fun visitAgentGatewayAwsSigV4(
                        agentGatewayAwsSigV4: AgentGatewayAwsSigV4Auth
                    ) = agentGatewayAwsSigV4.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Auth &&
                agentGatewayNo == other.agentGatewayNo &&
                agentGatewayStatic == other.agentGatewayStatic &&
                agentGatewayOAuthClientCredentials == other.agentGatewayOAuthClientCredentials &&
                agentGatewayPassthrough == other.agentGatewayPassthrough &&
                agentGatewayAwsSigV4 == other.agentGatewayAwsSigV4
        }

        override fun hashCode(): Int =
            Objects.hash(
                agentGatewayNo,
                agentGatewayStatic,
                agentGatewayOAuthClientCredentials,
                agentGatewayPassthrough,
                agentGatewayAwsSigV4,
            )

        override fun toString(): String =
            when {
                agentGatewayNo != null -> "Auth{agentGatewayNo=$agentGatewayNo}"
                agentGatewayStatic != null -> "Auth{agentGatewayStatic=$agentGatewayStatic}"
                agentGatewayOAuthClientCredentials != null ->
                    "Auth{agentGatewayOAuthClientCredentials=$agentGatewayOAuthClientCredentials}"
                agentGatewayPassthrough != null ->
                    "Auth{agentGatewayPassthrough=$agentGatewayPassthrough}"
                agentGatewayAwsSigV4 != null -> "Auth{agentGatewayAwsSigV4=$agentGatewayAwsSigV4}"
                _json != null -> "Auth{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Auth")
            }

        companion object {

            /** The gateway sends no credential. */
            @JvmStatic
            fun ofAgentGatewayNo(agentGatewayNo: AgentGatewayNoAuth) =
                Auth(agentGatewayNo = agentGatewayNo)

            /**
             * A static credential the gateway sends on every request. Write-only: responses show
             * its `type` only.
             */
            @JvmStatic
            fun ofAgentGatewayStatic(agentGatewayStatic: AgentGatewayStaticAuth) =
                Auth(agentGatewayStatic = agentGatewayStatic)

            /**
             * The gateway gets its own access token with the `client_credentials` grant and sends
             * it as a bearer token on every request, renewing it before it expires. The client ID
             * and secret are write-only.
             */
            @JvmStatic
            fun ofAgentGatewayOAuthClientCredentials(
                agentGatewayOAuthClientCredentials: AgentGatewayOAuthClientCredentials
            ) = Auth(agentGatewayOAuthClientCredentials = agentGatewayOAuthClientCredentials)

            /**
             * The gateway forwards the agent's own `Authorization` header to the server unchanged.
             */
            @JvmStatic
            fun ofAgentGatewayPassthrough(agentGatewayPassthrough: AgentGatewayPassthroughAuth) =
                Auth(agentGatewayPassthrough = agentGatewayPassthrough)

            /**
             * The gateway signs each request with AWS Signature Version 4. Without keys or a role,
             * it uses the instance's own AWS identity. Keys are write-only.
             */
            @JvmStatic
            fun ofAgentGatewayAwsSigV4(agentGatewayAwsSigV4: AgentGatewayAwsSigV4Auth) =
                Auth(agentGatewayAwsSigV4 = agentGatewayAwsSigV4)
        }

        /** An interface that defines how to map each variant of [Auth] to a value of type [T]. */
        interface Visitor<out T> {

            /** The gateway sends no credential. */
            fun visitAgentGatewayNo(agentGatewayNo: AgentGatewayNoAuth): T

            /**
             * A static credential the gateway sends on every request. Write-only: responses show
             * its `type` only.
             */
            fun visitAgentGatewayStatic(agentGatewayStatic: AgentGatewayStaticAuth): T

            /**
             * The gateway gets its own access token with the `client_credentials` grant and sends
             * it as a bearer token on every request, renewing it before it expires. The client ID
             * and secret are write-only.
             */
            fun visitAgentGatewayOAuthClientCredentials(
                agentGatewayOAuthClientCredentials: AgentGatewayOAuthClientCredentials
            ): T

            /**
             * The gateway forwards the agent's own `Authorization` header to the server unchanged.
             */
            fun visitAgentGatewayPassthrough(
                agentGatewayPassthrough: AgentGatewayPassthroughAuth
            ): T

            /**
             * The gateway signs each request with AWS Signature Version 4. Without keys or a role,
             * it uses the instance's own AWS identity. Keys are write-only.
             */
            fun visitAgentGatewayAwsSigV4(agentGatewayAwsSigV4: AgentGatewayAwsSigV4Auth): T

            /**
             * Maps an unknown variant of [Auth] to a value of type [T].
             *
             * An instance of [Auth] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Auth: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Auth>(Auth::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Auth {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<AgentGatewayNoAuth>())?.let {
                                Auth(agentGatewayNo = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<AgentGatewayStaticAuth>())?.let {
                                Auth(agentGatewayStatic = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<AgentGatewayOAuthClientCredentials>(),
                                )
                                ?.let {
                                    Auth(agentGatewayOAuthClientCredentials = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<AgentGatewayPassthroughAuth>())
                                ?.let { Auth(agentGatewayPassthrough = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<AgentGatewayAwsSigV4Auth>())?.let {
                                Auth(agentGatewayAwsSigV4 = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Auth(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Auth>(Auth::class) {

            override fun serialize(
                value: Auth,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.agentGatewayNo != null -> generator.writeObject(value.agentGatewayNo)
                    value.agentGatewayStatic != null ->
                        generator.writeObject(value.agentGatewayStatic)
                    value.agentGatewayOAuthClientCredentials != null ->
                        generator.writeObject(value.agentGatewayOAuthClientCredentials)
                    value.agentGatewayPassthrough != null ->
                        generator.writeObject(value.agentGatewayPassthrough)
                    value.agentGatewayAwsSigV4 != null ->
                        generator.writeObject(value.agentGatewayAwsSigV4)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Auth")
                }
            }
        }
    }

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

        return other is McpServerCreateParams &&
            instanceId == other.instanceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(instanceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "McpServerCreateParams{instanceId=$instanceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
