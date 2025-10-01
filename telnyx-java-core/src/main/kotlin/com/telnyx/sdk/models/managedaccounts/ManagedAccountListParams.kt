// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.managedaccounts

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Lists the accounts managed by the current user. Users need to be explictly approved by Telnyx in
 * order to become manager accounts.
 */
class ManagedAccountListParams
private constructor(
    private val filter: Filter?,
    private val includeCancelledAccounts: Boolean?,
    private val page: Page?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[email][contains],
     * filter[email][eq], filter[organization_name][contains], filter[organization_name][eq]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Specifies if cancelled accounts should be included in the results. */
    fun includeCancelledAccounts(): Optional<Boolean> =
        Optional.ofNullable(includeCancelledAccounts)

    /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /**
     * Specifies the sort order for results. By default sorting direction is ascending. To have the
     * results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>
     * <li> <code>email</code>: sorts the result by the <code>email</code> field in ascending order.
     *   </li>
     * <li> <code>-email</code>: sorts the result by the <code>email</code> field in descending
     *   order. </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in
     *   descending order.
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ManagedAccountListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ManagedAccountListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ManagedAccountListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var includeCancelledAccounts: Boolean? = null
        private var page: Page? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(managedAccountListParams: ManagedAccountListParams) = apply {
            filter = managedAccountListParams.filter
            includeCancelledAccounts = managedAccountListParams.includeCancelledAccounts
            page = managedAccountListParams.page
            sort = managedAccountListParams.sort
            additionalHeaders = managedAccountListParams.additionalHeaders.toBuilder()
            additionalQueryParams = managedAccountListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[email][contains],
         * filter[email][eq], filter[organization_name][contains], filter[organization_name][eq]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** Specifies if cancelled accounts should be included in the results. */
        fun includeCancelledAccounts(includeCancelledAccounts: Boolean?) = apply {
            this.includeCancelledAccounts = includeCancelledAccounts
        }

        /**
         * Alias for [Builder.includeCancelledAccounts].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeCancelledAccounts(includeCancelledAccounts: Boolean) =
            includeCancelledAccounts(includeCancelledAccounts as Boolean?)

        /**
         * Alias for calling [Builder.includeCancelledAccounts] with
         * `includeCancelledAccounts.orElse(null)`.
         */
        fun includeCancelledAccounts(includeCancelledAccounts: Optional<Boolean>) =
            includeCancelledAccounts(includeCancelledAccounts.getOrNull())

        /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

        /**
         * Specifies the sort order for results. By default sorting direction is ascending. To have
         * the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is:
         * <ul>
         * <li> <code>email</code>: sorts the result by the <code>email</code> field in ascending
         *   order. </li>
         * <li> <code>-email</code>: sorts the result by the <code>email</code> field in descending
         *   order. </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in
         *   descending order.
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
         * Returns an immutable instance of [ManagedAccountListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ManagedAccountListParams =
            ManagedAccountListParams(
                filter,
                includeCancelledAccounts,
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
                    it.email().ifPresent {
                        it.contains().ifPresent { put("filter[email][contains]", it) }
                        it.eq().ifPresent { put("filter[email][eq]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[email][$key]", value)
                            }
                        }
                    }
                    it.organizationName().ifPresent {
                        it.contains().ifPresent { put("filter[organization_name][contains]", it) }
                        it.eq().ifPresent { put("filter[organization_name][eq]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[organization_name][$key]", value)
                            }
                        }
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                includeCancelledAccounts?.let { put("include_cancelled_accounts", it.toString()) }
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
     * Consolidated filter parameter (deepObject style). Originally: filter[email][contains],
     * filter[email][eq], filter[organization_name][contains], filter[organization_name][eq]
     */
    class Filter
    private constructor(
        private val email: Email?,
        private val organizationName: OrganizationName?,
        private val additionalProperties: QueryParams,
    ) {

        fun email(): Optional<Email> = Optional.ofNullable(email)

        fun organizationName(): Optional<OrganizationName> = Optional.ofNullable(organizationName)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var email: Email? = null
            private var organizationName: OrganizationName? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                email = filter.email
                organizationName = filter.organizationName
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            fun email(email: Email?) = apply { this.email = email }

            /** Alias for calling [Builder.email] with `email.orElse(null)`. */
            fun email(email: Optional<Email>) = email(email.getOrNull())

            fun organizationName(organizationName: OrganizationName?) = apply {
                this.organizationName = organizationName
            }

            /**
             * Alias for calling [Builder.organizationName] with `organizationName.orElse(null)`.
             */
            fun organizationName(organizationName: Optional<OrganizationName>) =
                organizationName(organizationName.getOrNull())

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
            fun build(): Filter = Filter(email, organizationName, additionalProperties.build())
        }

        class Email private constructor(private val contains: String?, private val eq: String?) {

            /**
             * If present, email containing the given value will be returned. Matching is not
             * case-sensitive. Requires at least three characters.
             */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /**
             * If present, only returns results with the <code>email</code> matching exactly the
             * value given.
             */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Email]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Email]. */
            class Builder internal constructor() {

                private var contains: String? = null
                private var eq: String? = null

                @JvmSynthetic
                internal fun from(email: Email) = apply {
                    contains = email.contains
                    eq = email.eq
                }

                /**
                 * If present, email containing the given value will be returned. Matching is not
                 * case-sensitive. Requires at least three characters.
                 */
                fun contains(contains: String?) = apply { this.contains = contains }

                /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                /**
                 * If present, only returns results with the <code>email</code> matching exactly the
                 * value given.
                 */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

                /**
                 * Returns an immutable instance of [Email].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Email = Email(contains, eq)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Email && contains == other.contains && eq == other.eq
            }

            private val hashCode: Int by lazy { Objects.hash(contains, eq) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Email{contains=$contains, eq=$eq}"
        }

        class OrganizationName
        private constructor(private val contains: String?, private val eq: String?) {

            /**
             * If present, only returns results with the <code>organization_name</code> containing
             * the given value. Matching is not case-sensitive. Requires at least three characters.
             */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /**
             * If present, only returns results with the <code>organization_name</code> matching
             * exactly the value given.
             */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [OrganizationName]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OrganizationName]. */
            class Builder internal constructor() {

                private var contains: String? = null
                private var eq: String? = null

                @JvmSynthetic
                internal fun from(organizationName: OrganizationName) = apply {
                    contains = organizationName.contains
                    eq = organizationName.eq
                }

                /**
                 * If present, only returns results with the <code>organization_name</code>
                 * containing the given value. Matching is not case-sensitive. Requires at least
                 * three characters.
                 */
                fun contains(contains: String?) = apply { this.contains = contains }

                /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                /**
                 * If present, only returns results with the <code>organization_name</code> matching
                 * exactly the value given.
                 */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

                /**
                 * Returns an immutable instance of [OrganizationName].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): OrganizationName = OrganizationName(contains, eq)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OrganizationName && contains == other.contains && eq == other.eq
            }

            private val hashCode: Int by lazy { Objects.hash(contains, eq) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "OrganizationName{contains=$contains, eq=$eq}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                email == other.email &&
                organizationName == other.organizationName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(email, organizationName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{email=$email, organizationName=$organizationName, additionalProperties=$additionalProperties}"
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
     * <li> <code>email</code>: sorts the result by the <code>email</code> field in ascending order.
     *   </li>
     * <li> <code>-email</code>: sorts the result by the <code>email</code> field in descending
     *   order. </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in
     *   descending order.
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

            @JvmField val EMAIL = of("email")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            CREATED_AT,
            EMAIL,
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
            EMAIL,
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
                EMAIL -> Value.EMAIL
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
                EMAIL -> Known.EMAIL
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

        return other is ManagedAccountListParams &&
            filter == other.filter &&
            includeCancelledAccounts == other.includeCancelledAccounts &&
            page == other.page &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filter,
            includeCancelledAccounts,
            page,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ManagedAccountListParams{filter=$filter, includeCancelledAccounts=$includeCancelledAccounts, page=$page, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
