// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Given a port-out ID, list rejection codes that are eligible for that port-out */
class PortoutListRejectionCodesParams
private constructor(
    private val portoutId: String?,
    private val filter: Filter?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun portoutId(): Optional<String> = Optional.ofNullable(portoutId)

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[code], filter[code][in]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PortoutListRejectionCodesParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [PortoutListRejectionCodesParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortoutListRejectionCodesParams]. */
    class Builder internal constructor() {

        private var portoutId: String? = null
        private var filter: Filter? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(portoutListRejectionCodesParams: PortoutListRejectionCodesParams) =
            apply {
                portoutId = portoutListRejectionCodesParams.portoutId
                filter = portoutListRejectionCodesParams.filter
                additionalHeaders = portoutListRejectionCodesParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    portoutListRejectionCodesParams.additionalQueryParams.toBuilder()
            }

        fun portoutId(portoutId: String?) = apply { this.portoutId = portoutId }

        /** Alias for calling [Builder.portoutId] with `portoutId.orElse(null)`. */
        fun portoutId(portoutId: Optional<String>) = portoutId(portoutId.getOrNull())

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[code],
         * filter[code][in]
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
         * Returns an immutable instance of [PortoutListRejectionCodesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortoutListRejectionCodesParams =
            PortoutListRejectionCodesParams(
                portoutId,
                filter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> portoutId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.code().ifPresent {
                        it.accept(
                            object : Filter.Code.Visitor<Unit> {
                                override fun visitInteger(integer: Long) {
                                    put("filter[code]", integer.toString())
                                }

                                override fun visitInteger(integer: List<Long>) {
                                    put("filter[code]", integer.joinToString(",") { it.toString() })
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

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[code], filter[code][in]
     */
    class Filter
    private constructor(private val code: Code?, private val additionalProperties: QueryParams) {

        /** Filter rejections of a specific code */
        fun code(): Optional<Code> = Optional.ofNullable(code)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var code: Code? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                code = filter.code
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter rejections of a specific code */
            fun code(code: Code?) = apply { this.code = code }

            /** Alias for calling [Builder.code] with `code.orElse(null)`. */
            fun code(code: Optional<Code>) = code(code.getOrNull())

            /** Alias for calling [code] with `Code.ofInteger(integer)`. */
            fun code(integer: Long) = code(Code.ofInteger(integer))

            /** Alias for calling [code] with `Code.ofInteger(integer)`. */
            fun codeOfInteger(integer: List<Long>) = code(Code.ofInteger(integer))

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
            fun build(): Filter = Filter(code, additionalProperties.build())
        }

        /** Filter rejections of a specific code */
        class Code
        private constructor(
            private val integer: Long? = null,
            private val integer: List<Long>? = null,
        ) {

            /** Filter rejections of a specific code */
            fun integer(): Optional<Long> = Optional.ofNullable(integer)

            /** Filter rejections in a list of codes */
            fun integer(): Optional<List<Long>> = Optional.ofNullable(integer)

            fun isInteger(): Boolean = integer != null

            fun isInteger(): Boolean = integer != null

            /** Filter rejections of a specific code */
            fun asInteger(): Long = integer.getOrThrow("integer")

            /** Filter rejections in a list of codes */
            fun asInteger(): List<Long> = integer.getOrThrow("integer")

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    integer != null -> visitor.visitInteger(integer)
                    integer != null -> visitor.visitInteger(integer)
                    else -> throw IllegalStateException("Invalid Code")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Code && integer == other.integer && integer == other.integer
            }

            override fun hashCode(): Int = Objects.hash(integer, integer)

            override fun toString(): String =
                when {
                    integer != null -> "Code{integer=$integer}"
                    integer != null -> "Code{integer=$integer}"
                    else -> throw IllegalStateException("Invalid Code")
                }

            companion object {

                /** Filter rejections of a specific code */
                @JvmStatic fun ofInteger(integer: Long) = Code(integer = integer)

                /** Filter rejections in a list of codes */
                @JvmStatic
                fun ofInteger(integer: List<Long>) = Code(integer = integer.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [Code] to a value of type [T].
             */
            interface Visitor<out T> {

                /** Filter rejections of a specific code */
                fun visitInteger(integer: Long): T

                /** Filter rejections in a list of codes */
                fun visitInteger(integer: List<Long>): T
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                code == other.code &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(code, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Filter{code=$code, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortoutListRejectionCodesParams &&
            portoutId == other.portoutId &&
            filter == other.filter &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(portoutId, filter, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PortoutListRejectionCodesParams{portoutId=$portoutId, filter=$filter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
