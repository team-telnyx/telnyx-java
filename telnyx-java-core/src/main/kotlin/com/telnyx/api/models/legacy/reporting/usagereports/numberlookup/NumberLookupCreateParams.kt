// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.legacy.reporting.usagereports.numberlookup

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Submit a new telco data usage report */
class NumberLookupCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Type of aggregation for the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregationType(): Optional<AggregationType> = body.aggregationType()

    /**
     * End date for the usage report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<LocalDate> = body.endDate()

    /**
     * List of managed accounts to include in the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managedAccounts(): Optional<List<String>> = body.managedAccounts()

    /**
     * Start date for the usage report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): Optional<LocalDate> = body.startDate()

    /**
     * Returns the raw JSON value of [aggregationType].
     *
     * Unlike [aggregationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _aggregationType(): JsonField<AggregationType> = body._aggregationType()

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endDate(): JsonField<LocalDate> = body._endDate()

    /**
     * Returns the raw JSON value of [managedAccounts].
     *
     * Unlike [managedAccounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _managedAccounts(): JsonField<List<String>> = body._managedAccounts()

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startDate(): JsonField<LocalDate> = body._startDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): NumberLookupCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [NumberLookupCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberLookupCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(numberLookupCreateParams: NumberLookupCreateParams) = apply {
            body = numberLookupCreateParams.body.toBuilder()
            additionalHeaders = numberLookupCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = numberLookupCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [aggregationType]
         * - [endDate]
         * - [managedAccounts]
         * - [startDate]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Type of aggregation for the report */
        fun aggregationType(aggregationType: AggregationType) = apply {
            body.aggregationType(aggregationType)
        }

        /**
         * Sets [Builder.aggregationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregationType] with a well-typed [AggregationType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun aggregationType(aggregationType: JsonField<AggregationType>) = apply {
            body.aggregationType(aggregationType)
        }

        /** End date for the usage report */
        fun endDate(endDate: LocalDate) = apply { body.endDate(endDate) }

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endDate(endDate: JsonField<LocalDate>) = apply { body.endDate(endDate) }

        /** List of managed accounts to include in the report */
        fun managedAccounts(managedAccounts: List<String>) = apply {
            body.managedAccounts(managedAccounts)
        }

        /**
         * Sets [Builder.managedAccounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.managedAccounts] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun managedAccounts(managedAccounts: JsonField<List<String>>) = apply {
            body.managedAccounts(managedAccounts)
        }

        /**
         * Adds a single [String] to [managedAccounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addManagedAccount(managedAccount: String) = apply {
            body.addManagedAccount(managedAccount)
        }

        /** Start date for the usage report */
        fun startDate(startDate: LocalDate) = apply { body.startDate(startDate) }

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startDate(startDate: JsonField<LocalDate>) = apply { body.startDate(startDate) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [NumberLookupCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NumberLookupCreateParams =
            NumberLookupCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val aggregationType: JsonField<AggregationType>,
        private val endDate: JsonField<LocalDate>,
        private val managedAccounts: JsonField<List<String>>,
        private val startDate: JsonField<LocalDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aggregationType")
            @ExcludeMissing
            aggregationType: JsonField<AggregationType> = JsonMissing.of(),
            @JsonProperty("endDate")
            @ExcludeMissing
            endDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("managedAccounts")
            @ExcludeMissing
            managedAccounts: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("startDate")
            @ExcludeMissing
            startDate: JsonField<LocalDate> = JsonMissing.of(),
        ) : this(aggregationType, endDate, managedAccounts, startDate, mutableMapOf())

        /**
         * Type of aggregation for the report
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun aggregationType(): Optional<AggregationType> =
            aggregationType.getOptional("aggregationType")

        /**
         * End date for the usage report
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<LocalDate> = endDate.getOptional("endDate")

        /**
         * List of managed accounts to include in the report
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun managedAccounts(): Optional<List<String>> =
            managedAccounts.getOptional("managedAccounts")

        /**
         * Start date for the usage report
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): Optional<LocalDate> = startDate.getOptional("startDate")

        /**
         * Returns the raw JSON value of [aggregationType].
         *
         * Unlike [aggregationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aggregationType")
        @ExcludeMissing
        fun _aggregationType(): JsonField<AggregationType> = aggregationType

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

        /**
         * Returns the raw JSON value of [managedAccounts].
         *
         * Unlike [managedAccounts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("managedAccounts")
        @ExcludeMissing
        fun _managedAccounts(): JsonField<List<String>> = managedAccounts

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startDate")
        @ExcludeMissing
        fun _startDate(): JsonField<LocalDate> = startDate

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var aggregationType: JsonField<AggregationType> = JsonMissing.of()
            private var endDate: JsonField<LocalDate> = JsonMissing.of()
            private var managedAccounts: JsonField<MutableList<String>>? = null
            private var startDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                aggregationType = body.aggregationType
                endDate = body.endDate
                managedAccounts = body.managedAccounts.map { it.toMutableList() }
                startDate = body.startDate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Type of aggregation for the report */
            fun aggregationType(aggregationType: AggregationType) =
                aggregationType(JsonField.of(aggregationType))

            /**
             * Sets [Builder.aggregationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aggregationType] with a well-typed [AggregationType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun aggregationType(aggregationType: JsonField<AggregationType>) = apply {
                this.aggregationType = aggregationType
            }

            /** End date for the usage report */
            fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

            /** List of managed accounts to include in the report */
            fun managedAccounts(managedAccounts: List<String>) =
                managedAccounts(JsonField.of(managedAccounts))

            /**
             * Sets [Builder.managedAccounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.managedAccounts] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun managedAccounts(managedAccounts: JsonField<List<String>>) = apply {
                this.managedAccounts = managedAccounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [managedAccounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addManagedAccount(managedAccount: String) = apply {
                managedAccounts =
                    (managedAccounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("managedAccounts", it).add(managedAccount)
                    }
            }

            /** Start date for the usage report */
            fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    aggregationType,
                    endDate,
                    (managedAccounts ?: JsonMissing.of()).map { it.toImmutable() },
                    startDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            aggregationType().ifPresent { it.validate() }
            endDate()
            managedAccounts()
            startDate()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (aggregationType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (managedAccounts.asKnown().getOrNull()?.size ?: 0) +
                (if (startDate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                aggregationType == other.aggregationType &&
                endDate == other.endDate &&
                managedAccounts == other.managedAccounts &&
                startDate == other.startDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(aggregationType, endDate, managedAccounts, startDate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{aggregationType=$aggregationType, endDate=$endDate, managedAccounts=$managedAccounts, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    /** Type of aggregation for the report */
    class AggregationType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val ALL = of("ALL")

            @JvmField val BY_ORGANIZATION_MEMBER = of("BY_ORGANIZATION_MEMBER")

            @JvmStatic fun of(value: String) = AggregationType(JsonField.of(value))
        }

        /** An enum containing [AggregationType]'s known values. */
        enum class Known {
            ALL,
            BY_ORGANIZATION_MEMBER,
        }

        /**
         * An enum containing [AggregationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AggregationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL,
            BY_ORGANIZATION_MEMBER,
            /**
             * An enum member indicating that [AggregationType] was instantiated with an unknown
             * value.
             */
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
                ALL -> Value.ALL
                BY_ORGANIZATION_MEMBER -> Value.BY_ORGANIZATION_MEMBER
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
                ALL -> Known.ALL
                BY_ORGANIZATION_MEMBER -> Known.BY_ORGANIZATION_MEMBER
                else -> throw TelnyxInvalidDataException("Unknown AggregationType: $value")
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

        fun validate(): AggregationType = apply {
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

            return other is AggregationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberLookupCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "NumberLookupCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
