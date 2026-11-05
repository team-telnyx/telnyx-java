// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.apis

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
 * Changes an API's settings. A field left out stays as it is, `"base_url": null` clears the base
 * URL, and `auth` is replaced whole. The instance must be `ready`; otherwise the request answers
 * `409`.
 */
class ApiUpdateParams
private constructor(
    private val instanceId: String,
    private val apiId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun instanceId(): String = instanceId

    fun apiId(): Optional<String> = Optional.ofNullable(apiId)

    /**
     * How the gateway authenticates to the API. AWS Signature Version 4 is for MCP servers only.
     * Replaced whole on an update.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun auth(): Optional<Auth> = body.auth()

    /**
     * Where the gateway sends the API's requests. Without it, the gateway takes the description's
     * first `servers` entry.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baseUrl(): Optional<String> = body.baseUrl()

    /**
     * Headers copied from the agent's request, by name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun forwardedHeaders(): Optional<List<String>> = body.forwardedHeaders()

    /**
     * A name for the API, unique on the instance across MCP servers and APIs, regardless of case.
     * Letters, digits, `_`, and `.`. The gateway prefixes the API's tools with it and a hyphen.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * `true` lets every key on the instance use the server, granted or not.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun openToEveryKey(): Optional<Boolean> = body.openToEveryKey()

    /**
     * The URL of the API's OpenAPI description: OpenAPI 3.0, OpenAPI 3.1, or Swagger 2.0.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun specUrl(): Optional<String> = body.specUrl()

    /**
     * Headers sent on every request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun staticHeaders(): Optional<StaticHeaders> = body.staticHeaders()

    /**
     * The operations the API exposes as tools, by tool name. `[]` exposes every operation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tools(): Optional<List<String>> = body.tools()

    /**
     * Returns the raw JSON value of [auth].
     *
     * Unlike [auth], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _auth(): JsonField<Auth> = body._auth()

    /**
     * Returns the raw JSON value of [baseUrl].
     *
     * Unlike [baseUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _baseUrl(): JsonField<String> = body._baseUrl()

    /**
     * Returns the raw JSON value of [forwardedHeaders].
     *
     * Unlike [forwardedHeaders], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _forwardedHeaders(): JsonField<List<String>> = body._forwardedHeaders()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [openToEveryKey].
     *
     * Unlike [openToEveryKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _openToEveryKey(): JsonField<Boolean> = body._openToEveryKey()

    /**
     * Returns the raw JSON value of [specUrl].
     *
     * Unlike [specUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _specUrl(): JsonField<String> = body._specUrl()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ApiUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .instanceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiUpdateParams]. */
    class Builder internal constructor() {

        private var instanceId: String? = null
        private var apiId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(apiUpdateParams: ApiUpdateParams) = apply {
            instanceId = apiUpdateParams.instanceId
            apiId = apiUpdateParams.apiId
            body = apiUpdateParams.body.toBuilder()
            additionalHeaders = apiUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = apiUpdateParams.additionalQueryParams.toBuilder()
        }

        fun instanceId(instanceId: String) = apply { this.instanceId = instanceId }

        fun apiId(apiId: String?) = apply { this.apiId = apiId }

        /** Alias for calling [Builder.apiId] with `apiId.orElse(null)`. */
        fun apiId(apiId: Optional<String>) = apiId(apiId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [auth]
         * - [baseUrl]
         * - [forwardedHeaders]
         * - [name]
         * - [openToEveryKey]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * How the gateway authenticates to the API. AWS Signature Version 4 is for MCP servers
         * only. Replaced whole on an update.
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

        /**
         * Where the gateway sends the API's requests. Without it, the gateway takes the
         * description's first `servers` entry.
         */
        fun baseUrl(baseUrl: String?) = apply { body.baseUrl(baseUrl) }

        /** Alias for calling [Builder.baseUrl] with `baseUrl.orElse(null)`. */
        fun baseUrl(baseUrl: Optional<String>) = baseUrl(baseUrl.getOrNull())

        /**
         * Sets [Builder.baseUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun baseUrl(baseUrl: JsonField<String>) = apply { body.baseUrl(baseUrl) }

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

        /**
         * A name for the API, unique on the instance across MCP servers and APIs, regardless of
         * case. Letters, digits, `_`, and `.`. The gateway prefixes the API's tools with it and a
         * hyphen.
         */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

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

        /** The URL of the API's OpenAPI description: OpenAPI 3.0, OpenAPI 3.1, or Swagger 2.0. */
        fun specUrl(specUrl: String) = apply { body.specUrl(specUrl) }

        /**
         * Sets [Builder.specUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun specUrl(specUrl: JsonField<String>) = apply { body.specUrl(specUrl) }

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

        /** The operations the API exposes as tools, by tool name. `[]` exposes every operation. */
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
         * Returns an immutable instance of [ApiUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instanceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiUpdateParams =
            ApiUpdateParams(
                checkRequired("instanceId", instanceId),
                apiId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> instanceId
            1 -> apiId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * The fields to change. A field left out stays as it is, and `"base_url": null` clears the base
     * URL.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val auth: JsonField<Auth>,
        private val baseUrl: JsonField<String>,
        private val forwardedHeaders: JsonField<List<String>>,
        private val name: JsonField<String>,
        private val openToEveryKey: JsonField<Boolean>,
        private val specUrl: JsonField<String>,
        private val staticHeaders: JsonField<StaticHeaders>,
        private val tools: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("auth") @ExcludeMissing auth: JsonField<Auth> = JsonMissing.of(),
            @JsonProperty("base_url") @ExcludeMissing baseUrl: JsonField<String> = JsonMissing.of(),
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
        ) : this(
            auth,
            baseUrl,
            forwardedHeaders,
            name,
            openToEveryKey,
            specUrl,
            staticHeaders,
            tools,
            mutableMapOf(),
        )

        /**
         * How the gateway authenticates to the API. AWS Signature Version 4 is for MCP servers
         * only. Replaced whole on an update.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun auth(): Optional<Auth> = auth.getOptional("auth")

        /**
         * Where the gateway sends the API's requests. Without it, the gateway takes the
         * description's first `servers` entry.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun baseUrl(): Optional<String> = baseUrl.getOptional("base_url")

        /**
         * Headers copied from the agent's request, by name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun forwardedHeaders(): Optional<List<String>> =
            forwardedHeaders.getOptional("forwarded_headers")

        /**
         * A name for the API, unique on the instance across MCP servers and APIs, regardless of
         * case. Letters, digits, `_`, and `.`. The gateway prefixes the API's tools with it and a
         * hyphen.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * `true` lets every key on the instance use the server, granted or not.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun openToEveryKey(): Optional<Boolean> = openToEveryKey.getOptional("open_to_every_key")

        /**
         * The URL of the API's OpenAPI description: OpenAPI 3.0, OpenAPI 3.1, or Swagger 2.0.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun specUrl(): Optional<String> = specUrl.getOptional("spec_url")

        /**
         * Headers sent on every request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun staticHeaders(): Optional<StaticHeaders> = staticHeaders.getOptional("static_headers")

        /**
         * The operations the API exposes as tools, by tool name. `[]` exposes every operation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tools(): Optional<List<String>> = tools.getOptional("tools")

        /**
         * Returns the raw JSON value of [auth].
         *
         * Unlike [auth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auth") @ExcludeMissing fun _auth(): JsonField<Auth> = auth

        /**
         * Returns the raw JSON value of [baseUrl].
         *
         * Unlike [baseUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("base_url") @ExcludeMissing fun _baseUrl(): JsonField<String> = baseUrl

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
         * Unlike [openToEveryKey], this method doesn't throw if the JSON field has an unexpected
         * type.
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

            private var auth: JsonField<Auth> = JsonMissing.of()
            private var baseUrl: JsonField<String> = JsonMissing.of()
            private var forwardedHeaders: JsonField<MutableList<String>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var openToEveryKey: JsonField<Boolean> = JsonMissing.of()
            private var specUrl: JsonField<String> = JsonMissing.of()
            private var staticHeaders: JsonField<StaticHeaders> = JsonMissing.of()
            private var tools: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                auth = body.auth
                baseUrl = body.baseUrl
                forwardedHeaders = body.forwardedHeaders.map { it.toMutableList() }
                name = body.name
                openToEveryKey = body.openToEveryKey
                specUrl = body.specUrl
                staticHeaders = body.staticHeaders
                tools = body.tools.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * How the gateway authenticates to the API. AWS Signature Version 4 is for MCP servers
             * only. Replaced whole on an update.
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
             * Where the gateway sends the API's requests. Without it, the gateway takes the
             * description's first `servers` entry.
             */
            fun baseUrl(baseUrl: String?) = baseUrl(JsonField.ofNullable(baseUrl))

            /** Alias for calling [Builder.baseUrl] with `baseUrl.orElse(null)`. */
            fun baseUrl(baseUrl: Optional<String>) = baseUrl(baseUrl.getOrNull())

            /**
             * Sets [Builder.baseUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

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

            /**
             * A name for the API, unique on the instance across MCP servers and APIs, regardless of
             * case. Letters, digits, `_`, and `.`. The gateway prefixes the API's tools with it and
             * a hyphen.
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

            /**
             * The URL of the API's OpenAPI description: OpenAPI 3.0, OpenAPI 3.1, or Swagger 2.0.
             */
            fun specUrl(specUrl: String) = specUrl(JsonField.of(specUrl))

            /**
             * Sets [Builder.specUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun specUrl(specUrl: JsonField<String>) = apply { this.specUrl = specUrl }

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

            /**
             * The operations the API exposes as tools, by tool name. `[]` exposes every operation.
             */
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
                    auth,
                    baseUrl,
                    (forwardedHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    openToEveryKey,
                    specUrl,
                    staticHeaders,
                    (tools ?: JsonMissing.of()).map { it.toImmutable() },
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

            auth().ifPresent { it.validate() }
            baseUrl()
            forwardedHeaders()
            name()
            openToEveryKey()
            specUrl()
            staticHeaders().ifPresent { it.validate() }
            tools()
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
            (auth.asKnown().getOrNull()?.validity() ?: 0) +
                (if (baseUrl.asKnown().isPresent) 1 else 0) +
                (forwardedHeaders.asKnown().getOrNull()?.size ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (openToEveryKey.asKnown().isPresent) 1 else 0) +
                (if (specUrl.asKnown().isPresent) 1 else 0) +
                (staticHeaders.asKnown().getOrNull()?.validity() ?: 0) +
                (tools.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                auth == other.auth &&
                baseUrl == other.baseUrl &&
                forwardedHeaders == other.forwardedHeaders &&
                name == other.name &&
                openToEveryKey == other.openToEveryKey &&
                specUrl == other.specUrl &&
                staticHeaders == other.staticHeaders &&
                tools == other.tools &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                auth,
                baseUrl,
                forwardedHeaders,
                name,
                openToEveryKey,
                specUrl,
                staticHeaders,
                tools,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{auth=$auth, baseUrl=$baseUrl, forwardedHeaders=$forwardedHeaders, name=$name, openToEveryKey=$openToEveryKey, specUrl=$specUrl, staticHeaders=$staticHeaders, tools=$tools, additionalProperties=$additionalProperties}"
    }

    /**
     * How the gateway authenticates to the API. AWS Signature Version 4 is for MCP servers only.
     * Replaced whole on an update.
     */
    @JsonDeserialize(using = Auth.Deserializer::class)
    @JsonSerialize(using = Auth.Serializer::class)
    class Auth
    private constructor(
        private val agentGatewayNo: AgentGatewayNoAuth? = null,
        private val agentGatewayStatic: AgentGatewayStaticAuth? = null,
        private val agentGatewayOAuthClientCredentials: AgentGatewayOAuthClientCredentials? = null,
        private val agentGatewayPassthrough: AgentGatewayPassthroughAuth? = null,
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

        fun isAgentGatewayNo(): Boolean = agentGatewayNo != null

        fun isAgentGatewayStatic(): Boolean = agentGatewayStatic != null

        fun isAgentGatewayOAuthClientCredentials(): Boolean =
            agentGatewayOAuthClientCredentials != null

        fun isAgentGatewayPassthrough(): Boolean = agentGatewayPassthrough != null

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
                agentGatewayPassthrough == other.agentGatewayPassthrough
        }

        override fun hashCode(): Int =
            Objects.hash(
                agentGatewayNo,
                agentGatewayStatic,
                agentGatewayOAuthClientCredentials,
                agentGatewayPassthrough,
            )

        override fun toString(): String =
            when {
                agentGatewayNo != null -> "Auth{agentGatewayNo=$agentGatewayNo}"
                agentGatewayStatic != null -> "Auth{agentGatewayStatic=$agentGatewayStatic}"
                agentGatewayOAuthClientCredentials != null ->
                    "Auth{agentGatewayOAuthClientCredentials=$agentGatewayOAuthClientCredentials}"
                agentGatewayPassthrough != null ->
                    "Auth{agentGatewayPassthrough=$agentGatewayPassthrough}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiUpdateParams &&
            instanceId == other.instanceId &&
            apiId == other.apiId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(instanceId, apiId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ApiUpdateParams{instanceId=$instanceId, apiId=$apiId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
