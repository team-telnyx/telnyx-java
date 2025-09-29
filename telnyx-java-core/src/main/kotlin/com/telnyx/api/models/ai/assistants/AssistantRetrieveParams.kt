// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants

import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve an AI Assistant configuration by `assistant_id`. */
class AssistantRetrieveParams
private constructor(
    private val assistantId: String?,
    private val callControlId: String?,
    private val fetchDynamicVariablesFromWebhook: Boolean?,
    private val from: String?,
    private val to: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun assistantId(): Optional<String> = Optional.ofNullable(assistantId)

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    fun fetchDynamicVariablesFromWebhook(): Optional<Boolean> =
        Optional.ofNullable(fetchDynamicVariablesFromWebhook)

    fun from(): Optional<String> = Optional.ofNullable(from)

    fun to(): Optional<String> = Optional.ofNullable(to)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AssistantRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AssistantRetrieveParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssistantRetrieveParams]. */
    class Builder internal constructor() {

        private var assistantId: String? = null
        private var callControlId: String? = null
        private var fetchDynamicVariablesFromWebhook: Boolean? = null
        private var from: String? = null
        private var to: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(assistantRetrieveParams: AssistantRetrieveParams) = apply {
            assistantId = assistantRetrieveParams.assistantId
            callControlId = assistantRetrieveParams.callControlId
            fetchDynamicVariablesFromWebhook =
                assistantRetrieveParams.fetchDynamicVariablesFromWebhook
            from = assistantRetrieveParams.from
            to = assistantRetrieveParams.to
            additionalHeaders = assistantRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = assistantRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun assistantId(assistantId: String?) = apply { this.assistantId = assistantId }

        /** Alias for calling [Builder.assistantId] with `assistantId.orElse(null)`. */
        fun assistantId(assistantId: Optional<String>) = assistantId(assistantId.getOrNull())

        fun callControlId(callControlId: String?) = apply { this.callControlId = callControlId }

        /** Alias for calling [Builder.callControlId] with `callControlId.orElse(null)`. */
        fun callControlId(callControlId: Optional<String>) =
            callControlId(callControlId.getOrNull())

        fun fetchDynamicVariablesFromWebhook(fetchDynamicVariablesFromWebhook: Boolean?) = apply {
            this.fetchDynamicVariablesFromWebhook = fetchDynamicVariablesFromWebhook
        }

        /**
         * Alias for [Builder.fetchDynamicVariablesFromWebhook].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun fetchDynamicVariablesFromWebhook(fetchDynamicVariablesFromWebhook: Boolean) =
            fetchDynamicVariablesFromWebhook(fetchDynamicVariablesFromWebhook as Boolean?)

        /**
         * Alias for calling [Builder.fetchDynamicVariablesFromWebhook] with
         * `fetchDynamicVariablesFromWebhook.orElse(null)`.
         */
        fun fetchDynamicVariablesFromWebhook(fetchDynamicVariablesFromWebhook: Optional<Boolean>) =
            fetchDynamicVariablesFromWebhook(fetchDynamicVariablesFromWebhook.getOrNull())

        fun from(from: String?) = apply { this.from = from }

        /** Alias for calling [Builder.from] with `from.orElse(null)`. */
        fun from(from: Optional<String>) = from(from.getOrNull())

        fun to(to: String?) = apply { this.to = to }

        /** Alias for calling [Builder.to] with `to.orElse(null)`. */
        fun to(to: Optional<String>) = to(to.getOrNull())

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
         * Returns an immutable instance of [AssistantRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AssistantRetrieveParams =
            AssistantRetrieveParams(
                assistantId,
                callControlId,
                fetchDynamicVariablesFromWebhook,
                from,
                to,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> assistantId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                callControlId?.let { put("call_control_id", it) }
                fetchDynamicVariablesFromWebhook?.let {
                    put("fetch_dynamic_variables_from_webhook", it.toString())
                }
                from?.let { put("from", it) }
                to?.let { put("to", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssistantRetrieveParams &&
            assistantId == other.assistantId &&
            callControlId == other.callControlId &&
            fetchDynamicVariablesFromWebhook == other.fetchDynamicVariablesFromWebhook &&
            from == other.from &&
            to == other.to &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            assistantId,
            callControlId,
            fetchDynamicVariablesFromWebhook,
            from,
            to,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AssistantRetrieveParams{assistantId=$assistantId, callControlId=$callControlId, fetchDynamicVariablesFromWebhook=$fetchDynamicVariablesFromWebhook, from=$from, to=$to, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
