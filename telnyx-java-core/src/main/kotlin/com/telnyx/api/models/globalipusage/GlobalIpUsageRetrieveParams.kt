// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globalipusage

import com.telnyx.api.core.Params
import com.telnyx.api.core.getOrThrow
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Global IP Usage Metrics */
class GlobalIpUsageRetrieveParams
private constructor(
    private val filter: Filter?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Consolidated filter parameter (deepObject style). Originally: filter[global_ip_id][in] */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): GlobalIpUsageRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [GlobalIpUsageRetrieveParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GlobalIpUsageRetrieveParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(globalIpUsageRetrieveParams: GlobalIpUsageRetrieveParams) = apply {
            filter = globalIpUsageRetrieveParams.filter
            additionalHeaders = globalIpUsageRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = globalIpUsageRetrieveParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[global_ip_id][in]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

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
         * Returns an immutable instance of [GlobalIpUsageRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GlobalIpUsageRetrieveParams =
            GlobalIpUsageRetrieveParams(
                filter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.globalIpId().ifPresent {
                        it.accept(
                            object : Filter.GlobalIpId.Visitor<Unit> {
                                override fun visitString(string: String) {
                                    put("filter[global_ip_id]", string)
                                }

                                override fun visitIn(in_: Filter.GlobalIpId.In) {
                                    in_.in_().ifPresent { put("filter[global_ip_id][in]", it) }
                                    in_._additionalProperties().keys().forEach { key ->
                                        in_._additionalProperties().values(key).forEach { value ->
                                            put("filter[global_ip_id][$key]", value)
                                        }
                                    }
                                }
                            }
                        )
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    /** Consolidated filter parameter (deepObject style). Originally: filter[global_ip_id][in] */
    class Filter
    private constructor(
        private val globalIpId: GlobalIpId?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter by exact Global IP ID */
        fun globalIpId(): Optional<GlobalIpId> = Optional.ofNullable(globalIpId)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var globalIpId: GlobalIpId? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                globalIpId = filter.globalIpId
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter by exact Global IP ID */
            fun globalIpId(globalIpId: GlobalIpId?) = apply { this.globalIpId = globalIpId }

            /** Alias for calling [Builder.globalIpId] with `globalIpId.orElse(null)`. */
            fun globalIpId(globalIpId: Optional<GlobalIpId>) = globalIpId(globalIpId.getOrNull())

            /** Alias for calling [globalIpId] with `GlobalIpId.ofString(string)`. */
            fun globalIpId(string: String) = globalIpId(GlobalIpId.ofString(string))

            /** Alias for calling [globalIpId] with `GlobalIpId.ofIn(in_)`. */
            fun globalIpId(in_: GlobalIpId.In) = globalIpId(GlobalIpId.ofIn(in_))

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
            fun build(): Filter = Filter(globalIpId, additionalProperties.build())
        }

        /** Filter by exact Global IP ID */
        class GlobalIpId
        private constructor(private val string: String? = null, private val in_: In? = null) {

            /** Filter by exact Global IP ID */
            fun string(): Optional<String> = Optional.ofNullable(string)

            /** Filtering operations */
            fun in_(): Optional<In> = Optional.ofNullable(in_)

            fun isString(): Boolean = string != null

            fun isIn(): Boolean = in_ != null

            /** Filter by exact Global IP ID */
            fun asString(): String = string.getOrThrow("string")

            /** Filtering operations */
            fun asIn(): In = in_.getOrThrow("in_")

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    in_ != null -> visitor.visitIn(in_)
                    else -> throw IllegalStateException("Invalid GlobalIpId")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GlobalIpId && string == other.string && in_ == other.in_
            }

            override fun hashCode(): Int = Objects.hash(string, in_)

            override fun toString(): String =
                when {
                    string != null -> "GlobalIpId{string=$string}"
                    in_ != null -> "GlobalIpId{in_=$in_}"
                    else -> throw IllegalStateException("Invalid GlobalIpId")
                }

            companion object {

                /** Filter by exact Global IP ID */
                @JvmStatic fun ofString(string: String) = GlobalIpId(string = string)

                /** Filtering operations */
                @JvmStatic fun ofIn(in_: In) = GlobalIpId(in_ = in_)
            }

            /**
             * An interface that defines how to map each variant of [GlobalIpId] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                /** Filter by exact Global IP ID */
                fun visitString(string: String): T

                /** Filtering operations */
                fun visitIn(in_: In): T
            }

            /** Filtering operations */
            class In private constructor(private val in_: String?) {

                /** Filter by Global IP ID(s) separated by commas */
                fun in_(): Optional<String> = Optional.ofNullable(in_)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [In]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [In]. */
                class Builder internal constructor() {

                    private var in_: String? = null

                    @JvmSynthetic internal fun from(in_: In) = apply { this.in_ = in_.in_ }

                    /** Filter by Global IP ID(s) separated by commas */
                    fun in_(in_: String?) = apply { this.in_ = in_ }

                    /** Alias for calling [Builder.in_] with `in_.orElse(null)`. */
                    fun in_(in_: Optional<String>) = in_(in_.getOrNull())

                    /**
                     * Returns an immutable instance of [In].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): In = In(in_)
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is In && in_ == other.in_
                }

                private val hashCode: Int by lazy { Objects.hash(in_) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "In{in_=$in_}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                globalIpId == other.globalIpId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(globalIpId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{globalIpId=$globalIpId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GlobalIpUsageRetrieveParams &&
            filter == other.filter &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(filter, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "GlobalIpUsageRetrieveParams{filter=$filter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
