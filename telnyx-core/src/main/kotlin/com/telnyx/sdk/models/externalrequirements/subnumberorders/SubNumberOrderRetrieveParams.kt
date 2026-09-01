// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalrequirements.subnumberorders

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns the input fields an action requirement needs and the current requirement action for a sub
 * number order. Action requirements are fulfilled by an external step rather than by uploading
 * documents. Australia mobile ID verification is currently the only action requirement. Once a
 * verification link has been generated, it is returned in `requirement_action.value`.
 */
class SubNumberOrderRetrieveParams
private constructor(
    private val regulatoryRequirementId: String,
    private val subNumberOrderId: String?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun regulatoryRequirementId(): String = regulatoryRequirementId

    fun subNumberOrderId(): Optional<String> = Optional.ofNullable(subNumberOrderId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubNumberOrderRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .regulatoryRequirementId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubNumberOrderRetrieveParams]. */
    class Builder internal constructor() {

        private var regulatoryRequirementId: String? = null
        private var subNumberOrderId: String? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subNumberOrderRetrieveParams: SubNumberOrderRetrieveParams) = apply {
            regulatoryRequirementId = subNumberOrderRetrieveParams.regulatoryRequirementId
            subNumberOrderId = subNumberOrderRetrieveParams.subNumberOrderId
            additionalHeaders = subNumberOrderRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = subNumberOrderRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun regulatoryRequirementId(regulatoryRequirementId: String) = apply {
            this.regulatoryRequirementId = regulatoryRequirementId
        }

        fun subNumberOrderId(subNumberOrderId: String?) = apply {
            this.subNumberOrderId = subNumberOrderId
        }

        /** Alias for calling [Builder.subNumberOrderId] with `subNumberOrderId.orElse(null)`. */
        fun subNumberOrderId(subNumberOrderId: Optional<String>) =
            subNumberOrderId(subNumberOrderId.getOrNull())

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
         * Returns an immutable instance of [SubNumberOrderRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .regulatoryRequirementId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubNumberOrderRetrieveParams =
            SubNumberOrderRetrieveParams(
                checkRequired("regulatoryRequirementId", regulatoryRequirementId),
                subNumberOrderId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> regulatoryRequirementId
            1 -> subNumberOrderId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubNumberOrderRetrieveParams &&
            regulatoryRequirementId == other.regulatoryRequirementId &&
            subNumberOrderId == other.subNumberOrderId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            regulatoryRequirementId,
            subNumberOrderId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SubNumberOrderRetrieveParams{regulatoryRequirementId=$regulatoryRequirementId, subNumberOrderId=$subNumberOrderId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
