// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.telephonycredentials

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List all On-demand Credentials. */
class TelephonyCredentialListParams
private constructor(
    private val filter: Filter?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[tag], filter[name],
     * filter[status], filter[resource_id], filter[sip_username]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TelephonyCredentialListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [TelephonyCredentialListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TelephonyCredentialListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(telephonyCredentialListParams: TelephonyCredentialListParams) = apply {
            filter = telephonyCredentialListParams.filter
            pageNumber = telephonyCredentialListParams.pageNumber
            pageSize = telephonyCredentialListParams.pageSize
            additionalHeaders = telephonyCredentialListParams.additionalHeaders.toBuilder()
            additionalQueryParams = telephonyCredentialListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[tag], filter[name],
         * filter[status], filter[resource_id], filter[sip_username]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

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
         * Returns an immutable instance of [TelephonyCredentialListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TelephonyCredentialListParams =
            TelephonyCredentialListParams(
                filter,
                pageNumber,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.name().ifPresent { put("filter[name]", it) }
                    it.resourceId().ifPresent { put("filter[resource_id]", it) }
                    it.sipUsername().ifPresent { put("filter[sip_username]", it) }
                    it.status().ifPresent { put("filter[status]", it) }
                    it.tag().ifPresent { put("filter[tag]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[tag], filter[name],
     * filter[status], filter[resource_id], filter[sip_username]
     */
    class Filter
    private constructor(
        private val name: String?,
        private val resourceId: String?,
        private val sipUsername: String?,
        private val status: String?,
        private val tag: String?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter by name */
        fun name(): Optional<String> = Optional.ofNullable(name)

        /** Filter by resource_id */
        fun resourceId(): Optional<String> = Optional.ofNullable(resourceId)

        /** Filter by sip_username */
        fun sipUsername(): Optional<String> = Optional.ofNullable(sipUsername)

        /** Filter by status */
        fun status(): Optional<String> = Optional.ofNullable(status)

        /** Filter by tag */
        fun tag(): Optional<String> = Optional.ofNullable(tag)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var name: String? = null
            private var resourceId: String? = null
            private var sipUsername: String? = null
            private var status: String? = null
            private var tag: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                name = filter.name
                resourceId = filter.resourceId
                sipUsername = filter.sipUsername
                status = filter.status
                tag = filter.tag
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter by name */
            fun name(name: String?) = apply { this.name = name }

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /** Filter by resource_id */
            fun resourceId(resourceId: String?) = apply { this.resourceId = resourceId }

            /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
            fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.getOrNull())

            /** Filter by sip_username */
            fun sipUsername(sipUsername: String?) = apply { this.sipUsername = sipUsername }

            /** Alias for calling [Builder.sipUsername] with `sipUsername.orElse(null)`. */
            fun sipUsername(sipUsername: Optional<String>) = sipUsername(sipUsername.getOrNull())

            /** Filter by status */
            fun status(status: String?) = apply { this.status = status }

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<String>) = status(status.getOrNull())

            /** Filter by tag */
            fun tag(tag: String?) = apply { this.tag = tag }

            /** Alias for calling [Builder.tag] with `tag.orElse(null)`. */
            fun tag(tag: Optional<String>) = tag(tag.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Filter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filter =
                Filter(name, resourceId, sipUsername, status, tag, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                name == other.name &&
                resourceId == other.resourceId &&
                sipUsername == other.sipUsername &&
                status == other.status &&
                tag == other.tag &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(name, resourceId, sipUsername, status, tag, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{name=$name, resourceId=$resourceId, sipUsername=$sipUsername, status=$status, tag=$tag, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TelephonyCredentialListParams &&
            filter == other.filter &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, pageNumber, pageSize, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TelephonyCredentialListParams{filter=$filter, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
