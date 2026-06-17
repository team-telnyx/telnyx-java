// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects

/**
 * Create a new Virtual Cross Connect.<br /><br />For AWS and GCE, you have the option of creating
 * the primary connection first and the secondary connection later. You also have the option of
 * disabling the primary and/or secondary connections at any time and later re-enabling them. With
 * Azure, you do not have this option. Azure requires both the primary and secondary connections to
 * be created at the same time and they can not be independantly disabled.
 */
class VirtualCrossConnectCreateParams
private constructor(
    private val virtualCrossConnectCreate: VirtualCrossConnectCreate,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun virtualCrossConnectCreate(): VirtualCrossConnectCreate = virtualCrossConnectCreate

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        virtualCrossConnectCreate._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [VirtualCrossConnectCreateParams].
         *
         * The following fields are required:
         * ```java
         * .virtualCrossConnectCreate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VirtualCrossConnectCreateParams]. */
    class Builder internal constructor() {

        private var virtualCrossConnectCreate: VirtualCrossConnectCreate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(virtualCrossConnectCreateParams: VirtualCrossConnectCreateParams) =
            apply {
                virtualCrossConnectCreate =
                    virtualCrossConnectCreateParams.virtualCrossConnectCreate
                additionalHeaders = virtualCrossConnectCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    virtualCrossConnectCreateParams.additionalQueryParams.toBuilder()
            }

        fun virtualCrossConnectCreate(virtualCrossConnectCreate: VirtualCrossConnectCreate) =
            apply {
                this.virtualCrossConnectCreate = virtualCrossConnectCreate
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
         * Returns an immutable instance of [VirtualCrossConnectCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .virtualCrossConnectCreate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VirtualCrossConnectCreateParams =
            VirtualCrossConnectCreateParams(
                checkRequired("virtualCrossConnectCreate", virtualCrossConnectCreate),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): VirtualCrossConnectCreate = virtualCrossConnectCreate

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VirtualCrossConnectCreateParams &&
            virtualCrossConnectCreate == other.virtualCrossConnectCreate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(virtualCrossConnectCreate, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VirtualCrossConnectCreateParams{virtualCrossConnectCreate=$virtualCrossConnectCreate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
