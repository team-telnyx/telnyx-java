// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.keys.toolpermissions

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Replaces the grant whole and returns it. Every server must be one of the instance's MCP servers
 * or APIs, named once. A key reaches the servers granted to it or to its team, and the servers open
 * to every key; when both grant, only the servers in both. The instance must be `ready`; otherwise
 * the request answers `409`.
 */
class ToolPermissionCreateParams
private constructor(
    private val instanceId: String,
    private val keyId: String?,
    private val agentGatewayToolPermissions: AgentGatewayToolPermissions,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun instanceId(): String = instanceId

    fun keyId(): Optional<String> = Optional.ofNullable(keyId)

    fun agentGatewayToolPermissions(): AgentGatewayToolPermissions = agentGatewayToolPermissions

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        agentGatewayToolPermissions._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ToolPermissionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .instanceId()
         * .agentGatewayToolPermissions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ToolPermissionCreateParams]. */
    class Builder internal constructor() {

        private var instanceId: String? = null
        private var keyId: String? = null
        private var agentGatewayToolPermissions: AgentGatewayToolPermissions? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(toolPermissionCreateParams: ToolPermissionCreateParams) = apply {
            instanceId = toolPermissionCreateParams.instanceId
            keyId = toolPermissionCreateParams.keyId
            agentGatewayToolPermissions = toolPermissionCreateParams.agentGatewayToolPermissions
            additionalHeaders = toolPermissionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = toolPermissionCreateParams.additionalQueryParams.toBuilder()
        }

        fun instanceId(instanceId: String) = apply { this.instanceId = instanceId }

        fun keyId(keyId: String?) = apply { this.keyId = keyId }

        /** Alias for calling [Builder.keyId] with `keyId.orElse(null)`. */
        fun keyId(keyId: Optional<String>) = keyId(keyId.getOrNull())

        fun agentGatewayToolPermissions(agentGatewayToolPermissions: AgentGatewayToolPermissions) =
            apply {
                this.agentGatewayToolPermissions = agentGatewayToolPermissions
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
         * Returns an immutable instance of [ToolPermissionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instanceId()
         * .agentGatewayToolPermissions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ToolPermissionCreateParams =
            ToolPermissionCreateParams(
                checkRequired("instanceId", instanceId),
                keyId,
                checkRequired("agentGatewayToolPermissions", agentGatewayToolPermissions),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): AgentGatewayToolPermissions = agentGatewayToolPermissions

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> instanceId
            1 -> keyId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolPermissionCreateParams &&
            instanceId == other.instanceId &&
            keyId == other.keyId &&
            agentGatewayToolPermissions == other.agentGatewayToolPermissions &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            instanceId,
            keyId,
            agentGatewayToolPermissions,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ToolPermissionCreateParams{instanceId=$instanceId, keyId=$keyId, agentGatewayToolPermissions=$agentGatewayToolPermissions, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
