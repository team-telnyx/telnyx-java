// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.ippools.ips

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Remove the dedicated IP from the pool. The IP is kept but carries no mail until added to a pool
 * again. Removing the last IP requires `force=true` and `drain=true`.
 */
class IpDeleteParams
private constructor(
    private val id: String,
    private val ipId: String?,
    private val drain: Boolean?,
    private val force: Boolean?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    fun id(): String = id

    fun ipId(): Optional<String> = Optional.ofNullable(ipId)

    /**
     * Set together with `force=true` to remove the last IP in the pool. Acknowledges that mail
     * routed to the emptied pool is held until the pool has a sendable IP again.
     */
    fun drain(): Optional<Boolean> = Optional.ofNullable(drain)

    /**
     * Set together with `drain=true` to remove the last IP in the pool. Either flag alone has no
     * effect.
     */
    fun force(): Optional<Boolean> = Optional.ofNullable(force)

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IpDeleteParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IpDeleteParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var ipId: String? = null
        private var drain: Boolean? = null
        private var force: Boolean? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ipDeleteParams: IpDeleteParams) = apply {
            id = ipDeleteParams.id
            ipId = ipDeleteParams.ipId
            drain = ipDeleteParams.drain
            force = ipDeleteParams.force
            additionalHeaders = ipDeleteParams.additionalHeaders.toBuilder()
            additionalQueryParams = ipDeleteParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = ipDeleteParams.additionalBodyProperties.toMutableMap()
        }

        fun id(id: String) = apply { this.id = id }

        fun ipId(ipId: String?) = apply { this.ipId = ipId }

        /** Alias for calling [Builder.ipId] with `ipId.orElse(null)`. */
        fun ipId(ipId: Optional<String>) = ipId(ipId.getOrNull())

        /**
         * Set together with `force=true` to remove the last IP in the pool. Acknowledges that mail
         * routed to the emptied pool is held until the pool has a sendable IP again.
         */
        fun drain(drain: Boolean?) = apply { this.drain = drain }

        /**
         * Alias for [Builder.drain].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun drain(drain: Boolean) = drain(drain as Boolean?)

        /** Alias for calling [Builder.drain] with `drain.orElse(null)`. */
        fun drain(drain: Optional<Boolean>) = drain(drain.getOrNull())

        /**
         * Set together with `drain=true` to remove the last IP in the pool. Either flag alone has
         * no effect.
         */
        fun force(force: Boolean?) = apply { this.force = force }

        /**
         * Alias for [Builder.force].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun force(force: Boolean) = force(force as Boolean?)

        /** Alias for calling [Builder.force] with `force.orElse(null)`. */
        fun force(force: Optional<Boolean>) = force(force.getOrNull())

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [IpDeleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IpDeleteParams =
            IpDeleteParams(
                checkRequired("id", id),
                ipId,
                drain,
                force,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Optional<Map<String, JsonValue>> =
        Optional.ofNullable(additionalBodyProperties.ifEmpty { null })

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            1 -> ipId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                drain?.let { put("drain", it.toString()) }
                force?.let { put("force", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IpDeleteParams &&
            id == other.id &&
            ipId == other.ipId &&
            drain == other.drain &&
            force == other.force &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            ipId,
            drain,
            force,
            additionalHeaders,
            additionalQueryParams,
            additionalBodyProperties,
        )

    override fun toString() =
        "IpDeleteParams{id=$id, ipId=$ipId, drain=$drain, force=$force, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
