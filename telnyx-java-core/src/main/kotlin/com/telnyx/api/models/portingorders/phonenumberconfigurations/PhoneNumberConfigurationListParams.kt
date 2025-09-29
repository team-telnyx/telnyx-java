// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.phonenumberconfigurations

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.api.core.Enum
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns a list of phone number configurations paginated. */
class PhoneNumberConfigurationListParams
private constructor(
    private val filter: Filter?,
    private val page: Page?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally:
     * filter[porting_order.status][in][], filter[porting_phone_number][in][],
     * filter[user_bundle_id][in][]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /** Consolidated sort parameter (deepObject style). Originally: sort[value] */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PhoneNumberConfigurationListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhoneNumberConfigurationListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberConfigurationListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(phoneNumberConfigurationListParams: PhoneNumberConfigurationListParams) =
            apply {
                filter = phoneNumberConfigurationListParams.filter
                page = phoneNumberConfigurationListParams.page
                sort = phoneNumberConfigurationListParams.sort
                additionalHeaders = phoneNumberConfigurationListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    phoneNumberConfigurationListParams.additionalQueryParams.toBuilder()
            }

        /**
         * Consolidated filter parameter (deepObject style). Originally:
         * filter[porting_order.status][in][], filter[porting_phone_number][in][],
         * filter[user_bundle_id][in][]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

        /** Consolidated sort parameter (deepObject style). Originally: sort[value] */
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
         * Returns an immutable instance of [PhoneNumberConfigurationListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberConfigurationListParams =
            PhoneNumberConfigurationListParams(
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
                    it.portingOrder().ifPresent {
                        it.status().ifPresent {
                            put(
                                "filter[porting_order][status]",
                                it.joinToString(",") { it.toString() },
                            )
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[porting_order][$key]", value)
                            }
                        }
                    }
                    it.portingPhoneNumber().ifPresent {
                        put("filter[porting_phone_number]", it.joinToString(","))
                    }
                    it.userBundleId().ifPresent {
                        put("filter[user_bundle_id]", it.joinToString(","))
                    }
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
                sort?.let {
                    it.value().ifPresent { put("sort[value]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("sort[$key]", value)
                        }
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally:
     * filter[porting_order.status][in][], filter[porting_phone_number][in][],
     * filter[user_bundle_id][in][]
     */
    class Filter
    private constructor(
        private val portingOrder: PortingOrder?,
        private val portingPhoneNumber: List<String>?,
        private val userBundleId: List<String>?,
        private val additionalProperties: QueryParams,
    ) {

        fun portingOrder(): Optional<PortingOrder> = Optional.ofNullable(portingOrder)

        /** Filter results by a list of porting phone number IDs */
        fun portingPhoneNumber(): Optional<List<String>> = Optional.ofNullable(portingPhoneNumber)

        /** Filter results by a list of user bundle IDs */
        fun userBundleId(): Optional<List<String>> = Optional.ofNullable(userBundleId)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var portingOrder: PortingOrder? = null
            private var portingPhoneNumber: MutableList<String>? = null
            private var userBundleId: MutableList<String>? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                portingOrder = filter.portingOrder
                portingPhoneNumber = filter.portingPhoneNumber?.toMutableList()
                userBundleId = filter.userBundleId?.toMutableList()
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            fun portingOrder(portingOrder: PortingOrder?) = apply {
                this.portingOrder = portingOrder
            }

            /** Alias for calling [Builder.portingOrder] with `portingOrder.orElse(null)`. */
            fun portingOrder(portingOrder: Optional<PortingOrder>) =
                portingOrder(portingOrder.getOrNull())

            /** Filter results by a list of porting phone number IDs */
            fun portingPhoneNumber(portingPhoneNumber: List<String>?) = apply {
                this.portingPhoneNumber = portingPhoneNumber?.toMutableList()
            }

            /**
             * Alias for calling [Builder.portingPhoneNumber] with
             * `portingPhoneNumber.orElse(null)`.
             */
            fun portingPhoneNumber(portingPhoneNumber: Optional<List<String>>) =
                portingPhoneNumber(portingPhoneNumber.getOrNull())

            /**
             * Adds a single [String] to [Builder.portingPhoneNumber].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPortingPhoneNumber(portingPhoneNumber: String) = apply {
                this.portingPhoneNumber =
                    (this.portingPhoneNumber ?: mutableListOf()).apply { add(portingPhoneNumber) }
            }

            /** Filter results by a list of user bundle IDs */
            fun userBundleId(userBundleId: List<String>?) = apply {
                this.userBundleId = userBundleId?.toMutableList()
            }

            /** Alias for calling [Builder.userBundleId] with `userBundleId.orElse(null)`. */
            fun userBundleId(userBundleId: Optional<List<String>>) =
                userBundleId(userBundleId.getOrNull())

            /**
             * Adds a single [String] to [Builder.userBundleId].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUserBundleId(userBundleId: String) = apply {
                this.userBundleId =
                    (this.userBundleId ?: mutableListOf()).apply { add(userBundleId) }
            }

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
                    portingOrder,
                    portingPhoneNumber?.toImmutable(),
                    userBundleId?.toImmutable(),
                    additionalProperties.build(),
                )
        }

        class PortingOrder private constructor(private val status: List<Status>?) {

            /** Filter results by specific porting order statuses */
            fun status(): Optional<List<Status>> = Optional.ofNullable(status)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [PortingOrder]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PortingOrder]. */
            class Builder internal constructor() {

                private var status: MutableList<Status>? = null

                @JvmSynthetic
                internal fun from(portingOrder: PortingOrder) = apply {
                    status = portingOrder.status?.toMutableList()
                }

                /** Filter results by specific porting order statuses */
                fun status(status: List<Status>?) = apply { this.status = status?.toMutableList() }

                /** Alias for calling [Builder.status] with `status.orElse(null)`. */
                fun status(status: Optional<List<Status>>) = status(status.getOrNull())

                /**
                 * Adds a single [Status] to [Builder.status].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addStatus(status: Status) = apply {
                    this.status = (this.status ?: mutableListOf()).apply { add(status) }
                }

                /**
                 * Returns an immutable instance of [PortingOrder].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PortingOrder = PortingOrder(status?.toImmutable())
            }

            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACTIVATION_IN_PROGRESS = of("activation-in-progress")

                    @JvmField val CANCEL_PENDING = of("cancel-pending")

                    @JvmField val CANCELLED = of("cancelled")

                    @JvmField val DRAFT = of("draft")

                    @JvmField val EXCEPTION = of("exception")

                    @JvmField val FOC_DATE_CONFIRMED = of("foc-date-confirmed")

                    @JvmField val IN_PROCESS = of("in-process")

                    @JvmField val PORTED = of("ported")

                    @JvmField val SUBMITTED = of("submitted")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    ACTIVATION_IN_PROGRESS,
                    CANCEL_PENDING,
                    CANCELLED,
                    DRAFT,
                    EXCEPTION,
                    FOC_DATE_CONFIRMED,
                    IN_PROCESS,
                    PORTED,
                    SUBMITTED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACTIVATION_IN_PROGRESS,
                    CANCEL_PENDING,
                    CANCELLED,
                    DRAFT,
                    EXCEPTION,
                    FOC_DATE_CONFIRMED,
                    IN_PROCESS,
                    PORTED,
                    SUBMITTED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACTIVATION_IN_PROGRESS -> Value.ACTIVATION_IN_PROGRESS
                        CANCEL_PENDING -> Value.CANCEL_PENDING
                        CANCELLED -> Value.CANCELLED
                        DRAFT -> Value.DRAFT
                        EXCEPTION -> Value.EXCEPTION
                        FOC_DATE_CONFIRMED -> Value.FOC_DATE_CONFIRMED
                        IN_PROCESS -> Value.IN_PROCESS
                        PORTED -> Value.PORTED
                        SUBMITTED -> Value.SUBMITTED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ACTIVATION_IN_PROGRESS -> Known.ACTIVATION_IN_PROGRESS
                        CANCEL_PENDING -> Known.CANCEL_PENDING
                        CANCELLED -> Known.CANCELLED
                        DRAFT -> Known.DRAFT
                        EXCEPTION -> Known.EXCEPTION
                        FOC_DATE_CONFIRMED -> Known.FOC_DATE_CONFIRMED
                        IN_PROCESS -> Known.IN_PROCESS
                        PORTED -> Known.PORTED
                        SUBMITTED -> Known.SUBMITTED
                        else -> throw TelnyxInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Status = apply {
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

                    return other is Status && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PortingOrder && status == other.status
            }

            private val hashCode: Int by lazy { Objects.hash(status) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "PortingOrder{status=$status}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                portingOrder == other.portingOrder &&
                portingPhoneNumber == other.portingPhoneNumber &&
                userBundleId == other.userBundleId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(portingOrder, portingPhoneNumber, userBundleId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{portingOrder=$portingOrder, portingPhoneNumber=$portingPhoneNumber, userBundleId=$userBundleId, additionalProperties=$additionalProperties}"
    }

    /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
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

    /** Consolidated sort parameter (deepObject style). Originally: sort[value] */
    class Sort
    private constructor(private val value: Value?, private val additionalProperties: QueryParams) {

        /**
         * Specifies the sort order for results. If not given, results are sorted by created_at in
         * descending order.
         */
        fun value(): Optional<Value> = Optional.ofNullable(value)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Sort]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Sort]. */
        class Builder internal constructor() {

            private var value: Value? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(sort: Sort) = apply {
                value = sort.value
                additionalProperties = sort.additionalProperties.toBuilder()
            }

            /**
             * Specifies the sort order for results. If not given, results are sorted by created_at
             * in descending order.
             */
            fun value(value: Value?) = apply { this.value = value }

            /** Alias for calling [Builder.value] with `value.orElse(null)`. */
            fun value(value: Optional<Value>) = value(value.getOrNull())

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
             * Returns an immutable instance of [Sort].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Sort = Sort(value, additionalProperties.build())
        }

        /**
         * Specifies the sort order for results. If not given, results are sorted by created_at in
         * descending order.
         */
        class Value @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CREATED_AT = of("created_at")

                @JvmField val CREATED_AT_DESC = of("-created_at")

                @JvmStatic fun of(value: String) = Value(JsonField.of(value))
            }

            /** An enum containing [Value]'s known values. */
            enum class Known {
                CREATED_AT,
                CREATED_AT_DESC,
            }

            /**
             * An enum containing [Value]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Value] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CREATED_AT,
                CREATED_AT_DESC,
                /**
                 * An enum member indicating that [Value] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CREATED_AT -> Value.CREATED_AT
                    CREATED_AT_DESC -> Value.CREATED_AT_DESC
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CREATED_AT -> Known.CREATED_AT
                    CREATED_AT_DESC -> Known.CREATED_AT_DESC
                    else -> throw TelnyxInvalidDataException("Unknown Value: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Value = apply {
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

                return other is Value && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sort &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Sort{value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberConfigurationListParams &&
            filter == other.filter &&
            page == other.page &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, sort, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PhoneNumberConfigurationListParams{filter=$filter, page=$page, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
