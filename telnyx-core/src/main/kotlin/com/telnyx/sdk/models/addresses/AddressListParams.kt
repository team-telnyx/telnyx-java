// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.addresses

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns a list of your addresses. */
class AddressListParams
private constructor(
    private val filter: Filter?,
    private val page: Page?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[customer_reference][eq],
     * filter[customer_reference][contains], filter[used_as_emergency],
     * filter[street_address][contains], filter[address_book][eq]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /**
     * Specifies the sort order for results. By default sorting direction is ascending. To have the
     * results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>
     * <li> <code>street_address</code>: sorts the result by the <code>street_address</code> field
     *   in ascending order. </li>
     * <li> <code>-street_address</code>: sorts the result by the <code>street_address</code> field
     *   in descending order. </li> </ul> <br/> If not given, results are sorted by
     *   <code>created_at</code> in descending order.
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AddressListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AddressListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AddressListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(addressListParams: AddressListParams) = apply {
            filter = addressListParams.filter
            page = addressListParams.page
            sort = addressListParams.sort
            additionalHeaders = addressListParams.additionalHeaders.toBuilder()
            additionalQueryParams = addressListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally:
         * filter[customer_reference][eq], filter[customer_reference][contains],
         * filter[used_as_emergency], filter[street_address][contains], filter[address_book][eq]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

        /**
         * Specifies the sort order for results. By default sorting direction is ascending. To have
         * the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is:
         * <ul>
         * <li> <code>street_address</code>: sorts the result by the <code>street_address</code>
         *   field in ascending order. </li>
         * <li> <code>-street_address</code>: sorts the result by the <code>street_address</code>
         *   field in descending order. </li> </ul> <br/> If not given, results are sorted by
         *   <code>created_at</code> in descending order.
         */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<Sort>) = sort(sort.getOrNull())

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
         * Returns an immutable instance of [AddressListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AddressListParams =
            AddressListParams(
                filter,
                page,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.addressBook().ifPresent {
                        it.eq().ifPresent { put("filter[address_book][eq]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[address_book][$key]", value)
                            }
                        }
                    }
                    it.customerReference().ifPresent {
                        it.accept(
                            object : Filter.CustomerReference.Visitor<Unit> {
                                override fun visitString(string: String) {
                                    put("filter[customer_reference]", string)
                                }

                                override fun visitUnionMember1(
                                    unionMember1: Filter.CustomerReference.UnionMember1
                                ) {
                                    unionMember1.contains().ifPresent {
                                        put("filter[customer_reference][contains]", it)
                                    }
                                    unionMember1.eq().ifPresent {
                                        put("filter[customer_reference][eq]", it)
                                    }
                                    unionMember1._additionalProperties().keys().forEach { key ->
                                        unionMember1._additionalProperties().values(key).forEach {
                                            value ->
                                            put("filter[customer_reference][$key]", value)
                                        }
                                    }
                                }
                            }
                        )
                    }
                    it.streetAddress().ifPresent {
                        it.contains().ifPresent { put("filter[street_address][contains]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[street_address][$key]", value)
                            }
                        }
                    }
                    it.usedAsEmergency().ifPresent { put("filter[used_as_emergency]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                page?.let {
                    it.number().ifPresent { put("page[number]", it.toString()) }
                    it.size().ifPresent { put("page[size]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("page[$key]", value)
                        }
                    }
                }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[customer_reference][eq],
     * filter[customer_reference][contains], filter[used_as_emergency],
     * filter[street_address][contains], filter[address_book][eq]
     */
    class Filter
    private constructor(
        private val addressBook: AddressBook?,
        private val customerReference: CustomerReference?,
        private val streetAddress: StreetAddress?,
        private val usedAsEmergency: String?,
        private val additionalProperties: QueryParams,
    ) {

        fun addressBook(): Optional<AddressBook> = Optional.ofNullable(addressBook)

        /**
         * If present, addresses with <code>customer_reference</code> containing the given value
         * will be returned. Matching is not case-sensitive.
         */
        fun customerReference(): Optional<CustomerReference> =
            Optional.ofNullable(customerReference)

        fun streetAddress(): Optional<StreetAddress> = Optional.ofNullable(streetAddress)

        /**
         * If set as 'true', only addresses used as the emergency address for at least one active
         * phone-number will be returned. When set to 'false', the opposite happens: only addresses
         * not used as the emergency address from phone-numbers will be returned.
         */
        fun usedAsEmergency(): Optional<String> = Optional.ofNullable(usedAsEmergency)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var addressBook: AddressBook? = null
            private var customerReference: CustomerReference? = null
            private var streetAddress: StreetAddress? = null
            private var usedAsEmergency: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                addressBook = filter.addressBook
                customerReference = filter.customerReference
                streetAddress = filter.streetAddress
                usedAsEmergency = filter.usedAsEmergency
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            fun addressBook(addressBook: AddressBook?) = apply { this.addressBook = addressBook }

            /** Alias for calling [Builder.addressBook] with `addressBook.orElse(null)`. */
            fun addressBook(addressBook: Optional<AddressBook>) =
                addressBook(addressBook.getOrNull())

            /**
             * If present, addresses with <code>customer_reference</code> containing the given value
             * will be returned. Matching is not case-sensitive.
             */
            fun customerReference(customerReference: CustomerReference?) = apply {
                this.customerReference = customerReference
            }

            /**
             * Alias for calling [Builder.customerReference] with `customerReference.orElse(null)`.
             */
            fun customerReference(customerReference: Optional<CustomerReference>) =
                customerReference(customerReference.getOrNull())

            /** Alias for calling [customerReference] with `CustomerReference.ofString(string)`. */
            fun customerReference(string: String) =
                customerReference(CustomerReference.ofString(string))

            /**
             * Alias for calling [customerReference] with
             * `CustomerReference.ofUnionMember1(unionMember1)`.
             */
            fun customerReference(unionMember1: CustomerReference.UnionMember1) =
                customerReference(CustomerReference.ofUnionMember1(unionMember1))

            fun streetAddress(streetAddress: StreetAddress?) = apply {
                this.streetAddress = streetAddress
            }

            /** Alias for calling [Builder.streetAddress] with `streetAddress.orElse(null)`. */
            fun streetAddress(streetAddress: Optional<StreetAddress>) =
                streetAddress(streetAddress.getOrNull())

            /**
             * If set as 'true', only addresses used as the emergency address for at least one
             * active phone-number will be returned. When set to 'false', the opposite happens: only
             * addresses not used as the emergency address from phone-numbers will be returned.
             */
            fun usedAsEmergency(usedAsEmergency: String?) = apply {
                this.usedAsEmergency = usedAsEmergency
            }

            /** Alias for calling [Builder.usedAsEmergency] with `usedAsEmergency.orElse(null)`. */
            fun usedAsEmergency(usedAsEmergency: Optional<String>) =
                usedAsEmergency(usedAsEmergency.getOrNull())

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
                Filter(
                    addressBook,
                    customerReference,
                    streetAddress,
                    usedAsEmergency,
                    additionalProperties.build(),
                )
        }

        class AddressBook
        private constructor(
            private val eq: String?,
            private val additionalProperties: QueryParams,
        ) {

            /**
             * If present, only returns results with the <code>address_book</code> flag equal to the
             * given value.
             */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [AddressBook]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AddressBook]. */
            class Builder internal constructor() {

                private var eq: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(addressBook: AddressBook) = apply {
                    eq = addressBook.eq
                    additionalProperties = addressBook.additionalProperties.toBuilder()
                }

                /**
                 * If present, only returns results with the <code>address_book</code> flag equal to
                 * the given value.
                 */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

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
                 * Returns an immutable instance of [AddressBook].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AddressBook = AddressBook(eq, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AddressBook &&
                    eq == other.eq &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(eq, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AddressBook{eq=$eq, additionalProperties=$additionalProperties}"
        }

        /**
         * If present, addresses with <code>customer_reference</code> containing the given value
         * will be returned. Matching is not case-sensitive.
         */
        class CustomerReference
        private constructor(
            private val string: String? = null,
            private val unionMember1: UnionMember1? = null,
        ) {

            /**
             * If present, addresses with <code>customer_reference</code> containing the given value
             * will be returned. Matching is not case-sensitive.
             */
            fun string(): Optional<String> = Optional.ofNullable(string)

            fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

            fun isString(): Boolean = string != null

            fun isUnionMember1(): Boolean = unionMember1 != null

            /**
             * If present, addresses with <code>customer_reference</code> containing the given value
             * will be returned. Matching is not case-sensitive.
             */
            fun asString(): String = string.getOrThrow("string")

            fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                    else -> throw IllegalStateException("Invalid CustomerReference")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomerReference &&
                    string == other.string &&
                    unionMember1 == other.unionMember1
            }

            override fun hashCode(): Int = Objects.hash(string, unionMember1)

            override fun toString(): String =
                when {
                    string != null -> "CustomerReference{string=$string}"
                    unionMember1 != null -> "CustomerReference{unionMember1=$unionMember1}"
                    else -> throw IllegalStateException("Invalid CustomerReference")
                }

            companion object {

                /**
                 * If present, addresses with <code>customer_reference</code> containing the given
                 * value will be returned. Matching is not case-sensitive.
                 */
                @JvmStatic fun ofString(string: String) = CustomerReference(string = string)

                @JvmStatic
                fun ofUnionMember1(unionMember1: UnionMember1) =
                    CustomerReference(unionMember1 = unionMember1)
            }

            /**
             * An interface that defines how to map each variant of [CustomerReference] to a value
             * of type [T].
             */
            interface Visitor<out T> {

                /**
                 * If present, addresses with <code>customer_reference</code> containing the given
                 * value will be returned. Matching is not case-sensitive.
                 */
                fun visitString(string: String): T

                fun visitUnionMember1(unionMember1: UnionMember1): T
            }

            class UnionMember1
            private constructor(
                private val contains: String?,
                private val eq: String?,
                private val additionalProperties: QueryParams,
            ) {

                /** Partial match for customer_reference. Matching is not case-sensitive. */
                fun contains(): Optional<String> = Optional.ofNullable(contains)

                /** Exact match for customer_reference. */
                fun eq(): Optional<String> = Optional.ofNullable(eq)

                /** Query params to send with the request. */
                fun _additionalProperties(): QueryParams = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [UnionMember1]. */
                class Builder internal constructor() {

                    private var contains: String? = null
                    private var eq: String? = null
                    private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                    @JvmSynthetic
                    internal fun from(unionMember1: UnionMember1) = apply {
                        contains = unionMember1.contains
                        eq = unionMember1.eq
                        additionalProperties = unionMember1.additionalProperties.toBuilder()
                    }

                    /** Partial match for customer_reference. Matching is not case-sensitive. */
                    fun contains(contains: String?) = apply { this.contains = contains }

                    /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                    fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                    /** Exact match for customer_reference. */
                    fun eq(eq: String?) = apply { this.eq = eq }

                    /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                    fun eq(eq: Optional<String>) = eq(eq.getOrNull())

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
                     * Returns an immutable instance of [UnionMember1].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): UnionMember1 =
                        UnionMember1(contains, eq, additionalProperties.build())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UnionMember1 &&
                        contains == other.contains &&
                        eq == other.eq &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(contains, eq, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "UnionMember1{contains=$contains, eq=$eq, additionalProperties=$additionalProperties}"
            }
        }

        class StreetAddress
        private constructor(
            private val contains: String?,
            private val additionalProperties: QueryParams,
        ) {

            /**
             * If present, addresses with <code>street_address</code> containing the given value
             * will be returned. Matching is not case-sensitive. Requires at least three characters.
             */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [StreetAddress]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [StreetAddress]. */
            class Builder internal constructor() {

                private var contains: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(streetAddress: StreetAddress) = apply {
                    contains = streetAddress.contains
                    additionalProperties = streetAddress.additionalProperties.toBuilder()
                }

                /**
                 * If present, addresses with <code>street_address</code> containing the given value
                 * will be returned. Matching is not case-sensitive. Requires at least three
                 * characters.
                 */
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
                 * Returns an immutable instance of [StreetAddress].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): StreetAddress = StreetAddress(contains, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StreetAddress &&
                    contains == other.contains &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(contains, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StreetAddress{contains=$contains, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                addressBook == other.addressBook &&
                customerReference == other.customerReference &&
                streetAddress == other.streetAddress &&
                usedAsEmergency == other.usedAsEmergency &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addressBook,
                customerReference,
                streetAddress,
                usedAsEmergency,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{addressBook=$addressBook, customerReference=$customerReference, streetAddress=$streetAddress, usedAsEmergency=$usedAsEmergency, additionalProperties=$additionalProperties}"
    }

    /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
    class Page
    private constructor(
        private val number: Long?,
        private val size: Long?,
        private val additionalProperties: QueryParams,
    ) {

        /** The page number to load */
        fun number(): Optional<Long> = Optional.ofNullable(number)

        /** The size of the page */
        fun size(): Optional<Long> = Optional.ofNullable(size)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Page]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Page]. */
        class Builder internal constructor() {

            private var number: Long? = null
            private var size: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(page: Page) = apply {
                number = page.number
                size = page.size
                additionalProperties = page.additionalProperties.toBuilder()
            }

            /** The page number to load */
            fun number(number: Long?) = apply { this.number = number }

            /**
             * Alias for [Builder.number].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun number(number: Long) = number(number as Long?)

            /** Alias for calling [Builder.number] with `number.orElse(null)`. */
            fun number(number: Optional<Long>) = number(number.getOrNull())

            /** The size of the page */
            fun size(size: Long?) = apply { this.size = size }

            /**
             * Alias for [Builder.size].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun size(size: Long) = size(size as Long?)

            /** Alias for calling [Builder.size] with `size.orElse(null)`. */
            fun size(size: Optional<Long>) = size(size.getOrNull())

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
             * Returns an immutable instance of [Page].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Page = Page(number, size, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Page &&
                number == other.number &&
                size == other.size &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(number, size, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Page{number=$number, size=$size, additionalProperties=$additionalProperties}"
    }

    /**
     * Specifies the sort order for results. By default sorting direction is ascending. To have the
     * results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>
     * <li> <code>street_address</code>: sorts the result by the <code>street_address</code> field
     *   in ascending order. </li>
     * <li> <code>-street_address</code>: sorts the result by the <code>street_address</code> field
     *   in descending order. </li> </ul> <br/> If not given, results are sorted by
     *   <code>created_at</code> in descending order.
     */
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

            @JvmField val CREATED_AT = of("created_at")

            @JvmField val FIRST_NAME = of("first_name")

            @JvmField val LAST_NAME = of("last_name")

            @JvmField val BUSINESS_NAME = of("business_name")

            @JvmField val STREET_ADDRESS = of("street_address")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            CREATED_AT,
            FIRST_NAME,
            LAST_NAME,
            BUSINESS_NAME,
            STREET_ADDRESS,
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
            CREATED_AT,
            FIRST_NAME,
            LAST_NAME,
            BUSINESS_NAME,
            STREET_ADDRESS,
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
                CREATED_AT -> Value.CREATED_AT
                FIRST_NAME -> Value.FIRST_NAME
                LAST_NAME -> Value.LAST_NAME
                BUSINESS_NAME -> Value.BUSINESS_NAME
                STREET_ADDRESS -> Value.STREET_ADDRESS
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
                CREATED_AT -> Known.CREATED_AT
                FIRST_NAME -> Known.FIRST_NAME
                LAST_NAME -> Known.LAST_NAME
                BUSINESS_NAME -> Known.BUSINESS_NAME
                STREET_ADDRESS -> Known.STREET_ADDRESS
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

        return other is AddressListParams &&
            filter == other.filter &&
            page == other.page &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, sort, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AddressListParams{filter=$filter, page=$page, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
