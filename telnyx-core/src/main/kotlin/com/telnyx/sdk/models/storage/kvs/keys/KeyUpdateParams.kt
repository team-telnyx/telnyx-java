// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs.keys

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates or replaces the value for a key. The request body is stored verbatim as the value — no
 * base64, no JSON envelope — up to 1 MiB. The request's `Content-Type` header is stored with the
 * value and echoed back on retrieval. Returns `201` when the key is created and `200` when an
 * existing key is updated.
 */
class KeyUpdateParams
private constructor(
    private val id: String,
    private val key: String?,
    private val ttlSecs: Long?,
    private val body: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    fun key(): Optional<String> = Optional.ofNullable(key)

    /**
     * Time-to-live in seconds. When set, the key expires and is deleted after this duration.
     * Requires a namespace provisioned with TTL support; namespaces without it return a `409`.
     */
    fun ttlSecs(): Optional<Long> = Optional.ofNullable(ttlSecs)

    /** Raw value bytes, stored verbatim. */
    fun body(): String = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [KeyUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [KeyUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var key: String? = null
        private var ttlSecs: Long? = null
        private var body: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(keyUpdateParams: KeyUpdateParams) = apply {
            id = keyUpdateParams.id
            key = keyUpdateParams.key
            ttlSecs = keyUpdateParams.ttlSecs
            body = keyUpdateParams.body
            additionalHeaders = keyUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = keyUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        fun key(key: String?) = apply { this.key = key }

        /** Alias for calling [Builder.key] with `key.orElse(null)`. */
        fun key(key: Optional<String>) = key(key.getOrNull())

        /**
         * Time-to-live in seconds. When set, the key expires and is deleted after this duration.
         * Requires a namespace provisioned with TTL support; namespaces without it return a `409`.
         */
        fun ttlSecs(ttlSecs: Long?) = apply { this.ttlSecs = ttlSecs }

        /**
         * Alias for [Builder.ttlSecs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun ttlSecs(ttlSecs: Long) = ttlSecs(ttlSecs as Long?)

        /** Alias for calling [Builder.ttlSecs] with `ttlSecs.orElse(null)`. */
        fun ttlSecs(ttlSecs: Optional<Long>) = ttlSecs(ttlSecs.getOrNull())

        /** Raw value bytes, stored verbatim. */
        fun body(body: String) = apply { this.body = body }

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
         * Returns an immutable instance of [KeyUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): KeyUpdateParams =
            KeyUpdateParams(
                checkRequired("id", id),
                key,
                ttlSecs,
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): String = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            1 -> key ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                ttlSecs?.let { put("ttl_secs", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KeyUpdateParams &&
            id == other.id &&
            key == other.key &&
            ttlSecs == other.ttlSecs &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, key, ttlSecs, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "KeyUpdateParams{id=$id, key=$key, ttlSecs=$ttlSecs, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
