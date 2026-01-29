// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voice

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

/** List phone numbers with voice settings */
class VoiceListParams
private constructor(
    private val filter: Filter?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[phone_number],
     * filter[connection_name], filter[customer_reference], filter[voice.usage_payment_method]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Specifies the sort order for results. If not given, results are sorted by created_at in
     * descending order.
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): VoiceListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [VoiceListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoiceListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(voiceListParams: VoiceListParams) = apply {
            filter = voiceListParams.filter
            pageNumber = voiceListParams.pageNumber
            pageSize = voiceListParams.pageSize
            sort = voiceListParams.sort
            additionalHeaders = voiceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = voiceListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[phone_number],
         * filter[connection_name], filter[customer_reference], filter[voice.usage_payment_method]
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

        /**
         * Specifies the sort order for results. If not given, results are sorted by created_at in
         * descending order.
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
         * Returns an immutable instance of [VoiceListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VoiceListParams =
            VoiceListParams(
                filter,
                pageNumber,
                pageSize,
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
                    it.connectionName().ifPresent {
                        it.contains().ifPresent { put("filter[connection_name][contains]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[connection_name][$key]", value)
                            }
                        }
                    }
                    it.customerReference().ifPresent { put("filter[customer_reference]", it) }
                    it.phoneNumber().ifPresent { put("filter[phone_number]", it) }
                    it.voiceUsagePaymentMethod().ifPresent {
                        put("filter[voice.usage_payment_method]", it.toString())
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[phone_number],
     * filter[connection_name], filter[customer_reference], filter[voice.usage_payment_method]
     */
    class Filter
    private constructor(
        private val connectionName: ConnectionName?,
        private val customerReference: String?,
        private val phoneNumber: String?,
        private val voiceUsagePaymentMethod: VoiceUsagePaymentMethod?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter by connection name pattern matching. */
        fun connectionName(): Optional<ConnectionName> = Optional.ofNullable(connectionName)

        /** Filter numbers via the customer_reference set. */
        fun customerReference(): Optional<String> = Optional.ofNullable(customerReference)

        /**
         * Filter by phone number. Requires at least three digits. Non-numerical characters will
         * result in no values being returned.
         */
        fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

        /** Filter by usage_payment_method. */
        fun voiceUsagePaymentMethod(): Optional<VoiceUsagePaymentMethod> =
            Optional.ofNullable(voiceUsagePaymentMethod)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var connectionName: ConnectionName? = null
            private var customerReference: String? = null
            private var phoneNumber: String? = null
            private var voiceUsagePaymentMethod: VoiceUsagePaymentMethod? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                connectionName = filter.connectionName
                customerReference = filter.customerReference
                phoneNumber = filter.phoneNumber
                voiceUsagePaymentMethod = filter.voiceUsagePaymentMethod
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter by connection name pattern matching. */
            fun connectionName(connectionName: ConnectionName?) = apply {
                this.connectionName = connectionName
            }

            /** Alias for calling [Builder.connectionName] with `connectionName.orElse(null)`. */
            fun connectionName(connectionName: Optional<ConnectionName>) =
                connectionName(connectionName.getOrNull())

            /** Filter numbers via the customer_reference set. */
            fun customerReference(customerReference: String?) = apply {
                this.customerReference = customerReference
            }

            /**
             * Alias for calling [Builder.customerReference] with `customerReference.orElse(null)`.
             */
            fun customerReference(customerReference: Optional<String>) =
                customerReference(customerReference.getOrNull())

            /**
             * Filter by phone number. Requires at least three digits. Non-numerical characters will
             * result in no values being returned.
             */
            fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

            /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
            fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

            /** Filter by usage_payment_method. */
            fun voiceUsagePaymentMethod(voiceUsagePaymentMethod: VoiceUsagePaymentMethod?) = apply {
                this.voiceUsagePaymentMethod = voiceUsagePaymentMethod
            }

            /**
             * Alias for calling [Builder.voiceUsagePaymentMethod] with
             * `voiceUsagePaymentMethod.orElse(null)`.
             */
            fun voiceUsagePaymentMethod(
                voiceUsagePaymentMethod: Optional<VoiceUsagePaymentMethod>
            ) = voiceUsagePaymentMethod(voiceUsagePaymentMethod.getOrNull())

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
                    connectionName,
                    customerReference,
                    phoneNumber,
                    voiceUsagePaymentMethod,
                    additionalProperties.build(),
                )
        }

        /** Filter by connection name pattern matching. */
        class ConnectionName
        private constructor(
            private val contains: String?,
            private val additionalProperties: QueryParams,
        ) {

            /** Filter contains connection name. Requires at least three characters. */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [ConnectionName]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ConnectionName]. */
            class Builder internal constructor() {

                private var contains: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(connectionName: ConnectionName) = apply {
                    contains = connectionName.contains
                    additionalProperties = connectionName.additionalProperties.toBuilder()
                }

                /** Filter contains connection name. Requires at least three characters. */
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
                 * Returns an immutable instance of [ConnectionName].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ConnectionName = ConnectionName(contains, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ConnectionName &&
                    contains == other.contains &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(contains, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ConnectionName{contains=$contains, additionalProperties=$additionalProperties}"
        }

        /** Filter by usage_payment_method. */
        class VoiceUsagePaymentMethod
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val PAY_PER_MINUTE = of("pay-per-minute")

                @JvmField val CHANNEL = of("channel")

                @JvmStatic fun of(value: String) = VoiceUsagePaymentMethod(JsonField.of(value))
            }

            /** An enum containing [VoiceUsagePaymentMethod]'s known values. */
            enum class Known {
                PAY_PER_MINUTE,
                CHANNEL,
            }

            /**
             * An enum containing [VoiceUsagePaymentMethod]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [VoiceUsagePaymentMethod] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PAY_PER_MINUTE,
                CHANNEL,
                /**
                 * An enum member indicating that [VoiceUsagePaymentMethod] was instantiated with an
                 * unknown value.
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
                    PAY_PER_MINUTE -> Value.PAY_PER_MINUTE
                    CHANNEL -> Value.CHANNEL
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
                    PAY_PER_MINUTE -> Known.PAY_PER_MINUTE
                    CHANNEL -> Known.CHANNEL
                    else ->
                        throw TelnyxInvalidDataException("Unknown VoiceUsagePaymentMethod: $value")
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

            fun validate(): VoiceUsagePaymentMethod = apply {
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

                return other is VoiceUsagePaymentMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                connectionName == other.connectionName &&
                customerReference == other.customerReference &&
                phoneNumber == other.phoneNumber &&
                voiceUsagePaymentMethod == other.voiceUsagePaymentMethod &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                connectionName,
                customerReference,
                phoneNumber,
                voiceUsagePaymentMethod,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{connectionName=$connectionName, customerReference=$customerReference, phoneNumber=$phoneNumber, voiceUsagePaymentMethod=$voiceUsagePaymentMethod, additionalProperties=$additionalProperties}"
    }

    /**
     * Specifies the sort order for results. If not given, results are sorted by created_at in
     * descending order.
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

            @JvmField val PURCHASED_AT = of("purchased_at")

            @JvmField val PHONE_NUMBER = of("phone_number")

            @JvmField val CONNECTION_NAME = of("connection_name")

            @JvmField val USAGE_PAYMENT_METHOD = of("usage_payment_method")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            PURCHASED_AT,
            PHONE_NUMBER,
            CONNECTION_NAME,
            USAGE_PAYMENT_METHOD,
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
            PURCHASED_AT,
            PHONE_NUMBER,
            CONNECTION_NAME,
            USAGE_PAYMENT_METHOD,
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
                PURCHASED_AT -> Value.PURCHASED_AT
                PHONE_NUMBER -> Value.PHONE_NUMBER
                CONNECTION_NAME -> Value.CONNECTION_NAME
                USAGE_PAYMENT_METHOD -> Value.USAGE_PAYMENT_METHOD
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
                PURCHASED_AT -> Known.PURCHASED_AT
                PHONE_NUMBER -> Known.PHONE_NUMBER
                CONNECTION_NAME -> Known.CONNECTION_NAME
                USAGE_PAYMENT_METHOD -> Known.USAGE_PAYMENT_METHOD
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

        return other is VoiceListParams &&
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
        "VoiceListParams{filter=$filter, pageNumber=$pageNumber, pageSize=$pageSize, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
