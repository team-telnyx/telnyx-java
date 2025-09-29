// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcards

import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns the details regarding a specific SIM card. */
class SimCardRetrieveParams
private constructor(
    private val id: String?,
    private val includePinPukCodes: Boolean?,
    private val includeSimCardGroup: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * When set to true, includes the PIN and PUK codes in the response. These codes are used for
     * SIM card security and unlocking purposes. Available for both physical SIM cards and eSIMs.
     */
    fun includePinPukCodes(): Optional<Boolean> = Optional.ofNullable(includePinPukCodes)

    /** It includes the associated SIM card group object in the response when present. */
    fun includeSimCardGroup(): Optional<Boolean> = Optional.ofNullable(includeSimCardGroup)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SimCardRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SimCardRetrieveParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimCardRetrieveParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var includePinPukCodes: Boolean? = null
        private var includeSimCardGroup: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(simCardRetrieveParams: SimCardRetrieveParams) = apply {
            id = simCardRetrieveParams.id
            includePinPukCodes = simCardRetrieveParams.includePinPukCodes
            includeSimCardGroup = simCardRetrieveParams.includeSimCardGroup
            additionalHeaders = simCardRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = simCardRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * When set to true, includes the PIN and PUK codes in the response. These codes are used
         * for SIM card security and unlocking purposes. Available for both physical SIM cards and
         * eSIMs.
         */
        fun includePinPukCodes(includePinPukCodes: Boolean?) = apply {
            this.includePinPukCodes = includePinPukCodes
        }

        /**
         * Alias for [Builder.includePinPukCodes].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includePinPukCodes(includePinPukCodes: Boolean) =
            includePinPukCodes(includePinPukCodes as Boolean?)

        /**
         * Alias for calling [Builder.includePinPukCodes] with `includePinPukCodes.orElse(null)`.
         */
        fun includePinPukCodes(includePinPukCodes: Optional<Boolean>) =
            includePinPukCodes(includePinPukCodes.getOrNull())

        /** It includes the associated SIM card group object in the response when present. */
        fun includeSimCardGroup(includeSimCardGroup: Boolean?) = apply {
            this.includeSimCardGroup = includeSimCardGroup
        }

        /**
         * Alias for [Builder.includeSimCardGroup].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeSimCardGroup(includeSimCardGroup: Boolean) =
            includeSimCardGroup(includeSimCardGroup as Boolean?)

        /**
         * Alias for calling [Builder.includeSimCardGroup] with `includeSimCardGroup.orElse(null)`.
         */
        fun includeSimCardGroup(includeSimCardGroup: Optional<Boolean>) =
            includeSimCardGroup(includeSimCardGroup.getOrNull())

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
         * Returns an immutable instance of [SimCardRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SimCardRetrieveParams =
            SimCardRetrieveParams(
                id,
                includePinPukCodes,
                includeSimCardGroup,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includePinPukCodes?.let { put("include_pin_puk_codes", it.toString()) }
                includeSimCardGroup?.let { put("include_sim_card_group", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimCardRetrieveParams &&
            id == other.id &&
            includePinPukCodes == other.includePinPukCodes &&
            includeSimCardGroup == other.includeSimCardGroup &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            includePinPukCodes,
            includeSimCardGroup,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SimCardRetrieveParams{id=$id, includePinPukCodes=$includePinPukCodes, includeSimCardGroup=$includeSimCardGroup, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
