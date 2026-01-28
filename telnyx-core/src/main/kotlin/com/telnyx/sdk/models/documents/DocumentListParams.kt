// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documents

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List all documents ordered by created_at descending. */
class DocumentListParams
private constructor(
    private val filter: Filter?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val sort: List<Sort>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter for documents (deepObject style). Originally:
     * filter[filename][contains], filter[customer_reference][eq], filter[customer_reference][in][],
     * filter[created_at][gt], filter[created_at][lt]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Consolidated sort parameter for documents (deepObject style). Originally: sort[] */
    fun sort(): Optional<List<Sort>> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DocumentListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DocumentListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var sort: MutableList<Sort>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(documentListParams: DocumentListParams) = apply {
            filter = documentListParams.filter
            pageNumber = documentListParams.pageNumber
            pageSize = documentListParams.pageSize
            sort = documentListParams.sort?.toMutableList()
            additionalHeaders = documentListParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter for documents (deepObject style). Originally:
         * filter[filename][contains], filter[customer_reference][eq],
         * filter[customer_reference][in][], filter[created_at][gt], filter[created_at][lt]
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

        /** Consolidated sort parameter for documents (deepObject style). Originally: sort[] */
        fun sort(sort: List<Sort>?) = apply { this.sort = sort?.toMutableList() }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<List<Sort>>) = sort(sort.getOrNull())

        /**
         * Adds a single [Sort] to [Builder.sort].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSort(sort: Sort) = apply {
            this.sort = (this.sort ?: mutableListOf()).apply { add(sort) }
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
         * Returns an immutable instance of [DocumentListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocumentListParams =
            DocumentListParams(
                filter,
                pageNumber,
                pageSize,
                sort?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.createdAt().ifPresent {
                        it.gt().ifPresent {
                            put(
                                "filter[created_at][gt]",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                            )
                        }
                        it.lt().ifPresent {
                            put(
                                "filter[created_at][lt]",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                            )
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[created_at][$key]", value)
                            }
                        }
                    }
                    it.customerReference().ifPresent {
                        it.eq().ifPresent { put("filter[customer_reference][eq]", it) }
                        it.inList().ifPresent {
                            put("filter[customer_reference][in]", it.joinToString(","))
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[customer_reference][$key]", value)
                            }
                        }
                    }
                    it.filename().ifPresent {
                        it.contains().ifPresent { put("filter[filename][contains]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[filename][$key]", value)
                            }
                        }
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                sort?.let { put("sort", it.joinToString(",") { it.toString() }) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter for documents (deepObject style). Originally:
     * filter[filename][contains], filter[customer_reference][eq], filter[customer_reference][in][],
     * filter[created_at][gt], filter[created_at][lt]
     */
    class Filter
    private constructor(
        private val createdAt: CreatedAt?,
        private val customerReference: CustomerReference?,
        private val filename: Filename?,
        private val additionalProperties: QueryParams,
    ) {

        fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

        fun customerReference(): Optional<CustomerReference> =
            Optional.ofNullable(customerReference)

        fun filename(): Optional<Filename> = Optional.ofNullable(filename)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var createdAt: CreatedAt? = null
            private var customerReference: CustomerReference? = null
            private var filename: Filename? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                createdAt = filter.createdAt
                customerReference = filter.customerReference
                filename = filter.filename
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

            fun customerReference(customerReference: CustomerReference?) = apply {
                this.customerReference = customerReference
            }

            /**
             * Alias for calling [Builder.customerReference] with `customerReference.orElse(null)`.
             */
            fun customerReference(customerReference: Optional<CustomerReference>) =
                customerReference(customerReference.getOrNull())

            fun filename(filename: Filename?) = apply { this.filename = filename }

            /** Alias for calling [Builder.filename] with `filename.orElse(null)`. */
            fun filename(filename: Optional<Filename>) = filename(filename.getOrNull())

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
                Filter(createdAt, customerReference, filename, additionalProperties.build())
        }

        class CreatedAt
        private constructor(
            private val gt: OffsetDateTime?,
            private val lt: OffsetDateTime?,
            private val additionalProperties: QueryParams,
        ) {

            /** Filter by created at greater than provided value. */
            fun gt(): Optional<OffsetDateTime> = Optional.ofNullable(gt)

            /** Filter by created at less than provided value. */
            fun lt(): Optional<OffsetDateTime> = Optional.ofNullable(lt)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreatedAt]. */
            class Builder internal constructor() {

                private var gt: OffsetDateTime? = null
                private var lt: OffsetDateTime? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(createdAt: CreatedAt) = apply {
                    gt = createdAt.gt
                    lt = createdAt.lt
                    additionalProperties = createdAt.additionalProperties.toBuilder()
                }

                /** Filter by created at greater than provided value. */
                fun gt(gt: OffsetDateTime?) = apply { this.gt = gt }

                /** Alias for calling [Builder.gt] with `gt.orElse(null)`. */
                fun gt(gt: Optional<OffsetDateTime>) = gt(gt.getOrNull())

                /** Filter by created at less than provided value. */
                fun lt(lt: OffsetDateTime?) = apply { this.lt = lt }

                /** Alias for calling [Builder.lt] with `lt.orElse(null)`. */
                fun lt(lt: Optional<OffsetDateTime>) = lt(lt.getOrNull())

                fun additionalProperties(additionalProperties: QueryParams) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                    apply {
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

                fun putAllAdditionalProperties(
                    additionalProperties: Map<String, Iterable<String>>
                ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                fun removeAdditionalProperties(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    additionalProperties.removeAll(keys)
                }

                /**
                 * Returns an immutable instance of [CreatedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CreatedAt = CreatedAt(gt, lt, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt &&
                    gt == other.gt &&
                    lt == other.lt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(gt, lt, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreatedAt{gt=$gt, lt=$lt, additionalProperties=$additionalProperties}"
        }

        class CustomerReference
        private constructor(
            private val eq: String?,
            private val inList: List<String>?,
            private val additionalProperties: QueryParams,
        ) {

            /** Filter documents by a customer reference. */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            /** Filter documents by a list of customer references. */
            fun inList(): Optional<List<String>> = Optional.ofNullable(inList)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [CustomerReference].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomerReference]. */
            class Builder internal constructor() {

                private var eq: String? = null
                private var inList: MutableList<String>? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(customerReference: CustomerReference) = apply {
                    eq = customerReference.eq
                    inList = customerReference.inList?.toMutableList()
                    additionalProperties = customerReference.additionalProperties.toBuilder()
                }

                /** Filter documents by a customer reference. */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

                /** Filter documents by a list of customer references. */
                fun inList(inList: List<String>?) = apply { this.inList = inList?.toMutableList() }

                /** Alias for calling [Builder.inList] with `inList.orElse(null)`. */
                fun inList(inList: Optional<List<String>>) = inList(inList.getOrNull())

                /**
                 * Adds a single [String] to [Builder.inList].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addInList(inList: String) = apply {
                    this.inList = (this.inList ?: mutableListOf()).apply { add(inList) }
                }

                fun additionalProperties(additionalProperties: QueryParams) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                    apply {
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

                fun putAllAdditionalProperties(
                    additionalProperties: Map<String, Iterable<String>>
                ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                fun removeAdditionalProperties(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    additionalProperties.removeAll(keys)
                }

                /**
                 * Returns an immutable instance of [CustomerReference].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomerReference =
                    CustomerReference(eq, inList?.toImmutable(), additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomerReference &&
                    eq == other.eq &&
                    inList == other.inList &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(eq, inList, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CustomerReference{eq=$eq, inList=$inList, additionalProperties=$additionalProperties}"
        }

        class Filename
        private constructor(
            private val contains: String?,
            private val additionalProperties: QueryParams,
        ) {

            /** Filter by string matching part of filename. */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Filename]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Filename]. */
            class Builder internal constructor() {

                private var contains: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(filename: Filename) = apply {
                    contains = filename.contains
                    additionalProperties = filename.additionalProperties.toBuilder()
                }

                /** Filter by string matching part of filename. */
                fun contains(contains: String?) = apply { this.contains = contains }

                /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                fun additionalProperties(additionalProperties: QueryParams) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                    apply {
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

                fun putAllAdditionalProperties(
                    additionalProperties: Map<String, Iterable<String>>
                ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                fun removeAdditionalProperties(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    additionalProperties.removeAll(keys)
                }

                /**
                 * Returns an immutable instance of [Filename].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Filename = Filename(contains, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Filename &&
                    contains == other.contains &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(contains, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Filename{contains=$contains, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                createdAt == other.createdAt &&
                customerReference == other.customerReference &&
                filename == other.filename &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(createdAt, customerReference, filename, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{createdAt=$createdAt, customerReference=$customerReference, filename=$filename, additionalProperties=$additionalProperties}"
    }

    class Sort @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FILENAME = of("filename")

            @JvmField val CREATED_AT = of("created_at")

            @JvmField val UPDATED_AT = of("updated_at")

            @JvmField val FILENAME_DESC = of("-filename")

            @JvmField val CREATED_AT_DESC = of("-created_at")

            @JvmField val UPDATED_AT_DESC = of("-updated_at")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            FILENAME,
            CREATED_AT,
            UPDATED_AT,
            FILENAME_DESC,
            CREATED_AT_DESC,
            UPDATED_AT_DESC,
        }

        /**
         * An enum containing [Sort]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Sort] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FILENAME,
            CREATED_AT,
            UPDATED_AT,
            FILENAME_DESC,
            CREATED_AT_DESC,
            UPDATED_AT_DESC,
            /** An enum member indicating that [Sort] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                FILENAME -> Value.FILENAME
                CREATED_AT -> Value.CREATED_AT
                UPDATED_AT -> Value.UPDATED_AT
                FILENAME_DESC -> Value.FILENAME_DESC
                CREATED_AT_DESC -> Value.CREATED_AT_DESC
                UPDATED_AT_DESC -> Value.UPDATED_AT_DESC
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                FILENAME -> Known.FILENAME
                CREATED_AT -> Known.CREATED_AT
                UPDATED_AT -> Known.UPDATED_AT
                FILENAME_DESC -> Known.FILENAME_DESC
                CREATED_AT_DESC -> Known.CREATED_AT_DESC
                UPDATED_AT_DESC -> Known.UPDATED_AT_DESC
                else -> throw TelnyxInvalidDataException("Unknown Sort: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Sort = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sort && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentListParams &&
            filter == other.filter &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, pageNumber, pageSize, sort, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DocumentListParams{filter=$filter, pageNumber=$pageNumber, pageSize=$pageSize, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
