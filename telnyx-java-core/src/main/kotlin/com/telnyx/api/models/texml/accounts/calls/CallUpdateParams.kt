// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.calls

import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update TeXML call. Please note that the keys present in the payload MUST BE formatted in
 * CamelCase as specified in the example.
 */
class CallUpdateParams
private constructor(
    private val accountSid: String,
    private val callSid: String?,
    private val updateCall: UpdateCall,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountSid(): String = accountSid

    fun callSid(): Optional<String> = Optional.ofNullable(callSid)

    fun updateCall(): UpdateCall = updateCall

    fun _additionalBodyProperties(): Map<String, JsonValue> = updateCall._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CallUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .accountSid()
         * .updateCall()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallUpdateParams]. */
    class Builder internal constructor() {

        private var accountSid: String? = null
        private var callSid: String? = null
        private var updateCall: UpdateCall? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(callUpdateParams: CallUpdateParams) = apply {
            accountSid = callUpdateParams.accountSid
            callSid = callUpdateParams.callSid
            updateCall = callUpdateParams.updateCall
            additionalHeaders = callUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = callUpdateParams.additionalQueryParams.toBuilder()
        }

        fun accountSid(accountSid: String) = apply { this.accountSid = accountSid }

        fun callSid(callSid: String?) = apply { this.callSid = callSid }

        /** Alias for calling [Builder.callSid] with `callSid.orElse(null)`. */
        fun callSid(callSid: Optional<String>) = callSid(callSid.getOrNull())

        fun updateCall(updateCall: UpdateCall) = apply { this.updateCall = updateCall }

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
         * Returns an immutable instance of [CallUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountSid()
         * .updateCall()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CallUpdateParams =
            CallUpdateParams(
                checkRequired("accountSid", accountSid),
                callSid,
                checkRequired("updateCall", updateCall),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): UpdateCall = updateCall

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountSid
            1 -> callSid ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallUpdateParams &&
            accountSid == other.accountSid &&
            callSid == other.callSid &&
            updateCall == other.updateCall &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountSid, callSid, updateCall, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CallUpdateParams{accountSid=$accountSid, callSid=$callSid, updateCall=$updateCall, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
