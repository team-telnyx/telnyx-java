// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.requirements

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List all requirements with filtering, sorting, and pagination */
class RequirementListParams
private constructor(
    private val filter: Filter?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val sort: List<Sort>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter for requirements (deepObject style). Originally:
     * filter[country_code], filter[phone_number_type], filter[action]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Consolidated sort parameter for requirements (deepObject style). Originally: sort[] */
    fun sort(): Optional<List<Sort>> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RequirementListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RequirementListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RequirementListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var sort: MutableList<Sort>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(requirementListParams: RequirementListParams) = apply {
            filter = requirementListParams.filter
            pageNumber = requirementListParams.pageNumber
            pageSize = requirementListParams.pageSize
            sort = requirementListParams.sort?.toMutableList()
            additionalHeaders = requirementListParams.additionalHeaders.toBuilder()
            additionalQueryParams = requirementListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter for requirements (deepObject style). Originally:
         * filter[country_code], filter[phone_number_type], filter[action]
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

        /** Consolidated sort parameter for requirements (deepObject style). Originally: sort[] */
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
         * Returns an immutable instance of [RequirementListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RequirementListParams =
            RequirementListParams(
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
                    it.action().ifPresent { put("filter[action]", it.toString()) }
                    it.countryCode().ifPresent { put("filter[country_code]", it) }
                    it.phoneNumberType().ifPresent {
                        put("filter[phone_number_type]", it.toString())
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
     * Consolidated filter parameter for requirements (deepObject style). Originally:
     * filter[country_code], filter[phone_number_type], filter[action]
     */
    class Filter
    private constructor(
        private val action: Action?,
        private val countryCode: String?,
        private val phoneNumberType: PhoneNumberType?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filters requirements to those applying to a specific action. */
        fun action(): Optional<Action> = Optional.ofNullable(action)

        /** Filters results to those applying to a 2-character (ISO 3166-1 alpha-2) country code */
        fun countryCode(): Optional<String> = Optional.ofNullable(countryCode)

        /** Filters results to those applying to a specific phone_number_type */
        fun phoneNumberType(): Optional<PhoneNumberType> = Optional.ofNullable(phoneNumberType)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var action: Action? = null
            private var countryCode: String? = null
            private var phoneNumberType: PhoneNumberType? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                action = filter.action
                countryCode = filter.countryCode
                phoneNumberType = filter.phoneNumberType
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filters requirements to those applying to a specific action. */
            fun action(action: Action?) = apply { this.action = action }

            /** Alias for calling [Builder.action] with `action.orElse(null)`. */
            fun action(action: Optional<Action>) = action(action.getOrNull())

            /**
             * Filters results to those applying to a 2-character (ISO 3166-1 alpha-2) country code
             */
            fun countryCode(countryCode: String?) = apply { this.countryCode = countryCode }

            /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
            fun countryCode(countryCode: Optional<String>) = countryCode(countryCode.getOrNull())

            /** Filters results to those applying to a specific phone_number_type */
            fun phoneNumberType(phoneNumberType: PhoneNumberType?) = apply {
                this.phoneNumberType = phoneNumberType
            }

            /** Alias for calling [Builder.phoneNumberType] with `phoneNumberType.orElse(null)`. */
            fun phoneNumberType(phoneNumberType: Optional<PhoneNumberType>) =
                phoneNumberType(phoneNumberType.getOrNull())

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
                Filter(action, countryCode, phoneNumberType, additionalProperties.build())
        }

        /** Filters requirements to those applying to a specific action. */
        class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val BRANDED_CALLING = of("branded_calling")

                @JvmField val ORDERING = of("ordering")

                @JvmField val PORTING = of("porting")

                @JvmStatic fun of(value: String) = Action(JsonField.of(value))
            }

            /** An enum containing [Action]'s known values. */
            enum class Known {
                BRANDED_CALLING,
                ORDERING,
                PORTING,
            }

            /**
             * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Action] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BRANDED_CALLING,
                ORDERING,
                PORTING,
                /**
                 * An enum member indicating that [Action] was instantiated with an unknown value.
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
                    BRANDED_CALLING -> Value.BRANDED_CALLING
                    ORDERING -> Value.ORDERING
                    PORTING -> Value.PORTING
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
                    BRANDED_CALLING -> Known.BRANDED_CALLING
                    ORDERING -> Known.ORDERING
                    PORTING -> Known.PORTING
                    else -> throw TelnyxInvalidDataException("Unknown Action: $value")
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

            fun validate(): Action = apply {
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

                return other is Action && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Filters results to those applying to a specific phone_number_type */
        class PhoneNumberType
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

                @JvmField val LOCAL = of("local")

                @JvmField val NATIONAL = of("national")

                @JvmField val TOLL_FREE = of("toll_free")

                @JvmStatic fun of(value: String) = PhoneNumberType(JsonField.of(value))
            }

            /** An enum containing [PhoneNumberType]'s known values. */
            enum class Known {
                LOCAL,
                NATIONAL,
                TOLL_FREE,
            }

            /**
             * An enum containing [PhoneNumberType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PhoneNumberType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOCAL,
                NATIONAL,
                TOLL_FREE,
                /**
                 * An enum member indicating that [PhoneNumberType] was instantiated with an unknown
                 * value.
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
                    LOCAL -> Value.LOCAL
                    NATIONAL -> Value.NATIONAL
                    TOLL_FREE -> Value.TOLL_FREE
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
                    LOCAL -> Known.LOCAL
                    NATIONAL -> Known.NATIONAL
                    TOLL_FREE -> Known.TOLL_FREE
                    else -> throw TelnyxInvalidDataException("Unknown PhoneNumberType: $value")
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

            fun validate(): PhoneNumberType = apply {
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

                return other is PhoneNumberType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                action == other.action &&
                countryCode == other.countryCode &&
                phoneNumberType == other.phoneNumberType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(action, countryCode, phoneNumberType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{action=$action, countryCode=$countryCode, phoneNumberType=$phoneNumberType, additionalProperties=$additionalProperties}"
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

            @JvmField val CREATED_AT = of("created_at")

            @JvmField val UPDATED_AT = of("updated_at")

            @JvmField val COUNTRY_CODE = of("country_code")

            @JvmField val PHONE_NUMBER_TYPE = of("phone_number_type")

            @JvmField val CREATED_AT_DESC = of("-created_at")

            @JvmField val UPDATED_AT_DESC = of("-updated_at")

            @JvmField val COUNTRY_CODE_DESC = of("-country_code")

            @JvmField val PHONE_NUMBER_TYPE_DESC = of("-phone_number_type")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            CREATED_AT,
            UPDATED_AT,
            COUNTRY_CODE,
            PHONE_NUMBER_TYPE,
            CREATED_AT_DESC,
            UPDATED_AT_DESC,
            COUNTRY_CODE_DESC,
            PHONE_NUMBER_TYPE_DESC,
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
            UPDATED_AT,
            COUNTRY_CODE,
            PHONE_NUMBER_TYPE,
            CREATED_AT_DESC,
            UPDATED_AT_DESC,
            COUNTRY_CODE_DESC,
            PHONE_NUMBER_TYPE_DESC,
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
                UPDATED_AT -> Value.UPDATED_AT
                COUNTRY_CODE -> Value.COUNTRY_CODE
                PHONE_NUMBER_TYPE -> Value.PHONE_NUMBER_TYPE
                CREATED_AT_DESC -> Value.CREATED_AT_DESC
                UPDATED_AT_DESC -> Value.UPDATED_AT_DESC
                COUNTRY_CODE_DESC -> Value.COUNTRY_CODE_DESC
                PHONE_NUMBER_TYPE_DESC -> Value.PHONE_NUMBER_TYPE_DESC
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
                UPDATED_AT -> Known.UPDATED_AT
                COUNTRY_CODE -> Known.COUNTRY_CODE
                PHONE_NUMBER_TYPE -> Known.PHONE_NUMBER_TYPE
                CREATED_AT_DESC -> Known.CREATED_AT_DESC
                UPDATED_AT_DESC -> Known.UPDATED_AT_DESC
                COUNTRY_CODE_DESC -> Known.COUNTRY_CODE_DESC
                PHONE_NUMBER_TYPE_DESC -> Known.PHONE_NUMBER_TYPE_DESC
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

        return other is RequirementListParams &&
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
        "RequirementListParams{filter=$filter, pageNumber=$pageNumber, pageSize=$pageSize, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
