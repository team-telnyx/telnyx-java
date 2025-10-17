// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.csvdownloads

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a CSV download */
class CsvDownloadCreateParams
private constructor(
    private val csvFormat: CsvFormat?,
    private val filter: Filter?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    /**
     * Which format to use when generating the CSV file. The default for backwards compatibility is
     * 'V1'
     */
    fun csvFormat(): Optional<CsvFormat> = Optional.ofNullable(csvFormat)

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[has_bundle],
     * filter[tag], filter[connection_id], filter[phone_number], filter[status],
     * filter[voice.connection_name], filter[voice.usage_payment_method], filter[billing_group_id],
     * filter[emergency_address_id], filter[customer_reference]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CsvDownloadCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CsvDownloadCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CsvDownloadCreateParams]. */
    class Builder internal constructor() {

        private var csvFormat: CsvFormat? = null
        private var filter: Filter? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(csvDownloadCreateParams: CsvDownloadCreateParams) = apply {
            csvFormat = csvDownloadCreateParams.csvFormat
            filter = csvDownloadCreateParams.filter
            additionalHeaders = csvDownloadCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = csvDownloadCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                csvDownloadCreateParams.additionalBodyProperties.toMutableMap()
        }

        /**
         * Which format to use when generating the CSV file. The default for backwards compatibility
         * is 'V1'
         */
        fun csvFormat(csvFormat: CsvFormat?) = apply { this.csvFormat = csvFormat }

        /** Alias for calling [Builder.csvFormat] with `csvFormat.orElse(null)`. */
        fun csvFormat(csvFormat: Optional<CsvFormat>) = csvFormat(csvFormat.getOrNull())

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[has_bundle],
         * filter[tag], filter[connection_id], filter[phone_number], filter[status],
         * filter[voice.connection_name], filter[voice.usage_payment_method],
         * filter[billing_group_id], filter[emergency_address_id], filter[customer_reference]
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [CsvDownloadCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CsvDownloadCreateParams =
            CsvDownloadCreateParams(
                csvFormat,
                filter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Optional<Map<String, JsonValue>> =
        Optional.ofNullable(additionalBodyProperties.ifEmpty { null })

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                csvFormat?.let { put("csv_format", it.toString()) }
                filter?.let {
                    it.billingGroupId().ifPresent { put("filter[billing_group_id]", it) }
                    it.connectionId().ifPresent { put("filter[connection_id]", it) }
                    it.customerReference().ifPresent { put("filter[customer_reference]", it) }
                    it.emergencyAddressId().ifPresent { put("filter[emergency_address_id]", it) }
                    it.hasBundle().ifPresent { put("filter[has_bundle]", it) }
                    it.phoneNumber().ifPresent { put("filter[phone_number]", it) }
                    it.status().ifPresent { put("filter[status]", it.toString()) }
                    it.tag().ifPresent { put("filter[tag]", it) }
                    it.voiceConnectionName().ifPresent {
                        it.contains().ifPresent {
                            put("filter[voice.connection_name][contains]", it)
                        }
                        it.endsWith().ifPresent {
                            put("filter[voice.connection_name][ends_with]", it)
                        }
                        it.eq().ifPresent { put("filter[voice.connection_name][eq]", it) }
                        it.startsWith().ifPresent {
                            put("filter[voice.connection_name][starts_with]", it)
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[voice.connection_name][$key]", value)
                            }
                        }
                    }
                    it.voiceUsagePaymentMethod().ifPresent {
                        put("filter[voice.usage_payment_method]", it.toString())
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
     * Which format to use when generating the CSV file. The default for backwards compatibility is
     * 'V1'
     */
    class CsvFormat @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val V1 = of("V1")

            @JvmField val V2 = of("V2")

            @JvmStatic fun of(value: String) = CsvFormat(JsonField.of(value))
        }

        /** An enum containing [CsvFormat]'s known values. */
        enum class Known {
            V1,
            V2,
        }

        /**
         * An enum containing [CsvFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CsvFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            V1,
            V2,
            /**
             * An enum member indicating that [CsvFormat] was instantiated with an unknown value.
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
                V1 -> Value.V1
                V2 -> Value.V2
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
                V1 -> Known.V1
                V2 -> Known.V2
                else -> throw TelnyxInvalidDataException("Unknown CsvFormat: $value")
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

        fun validate(): CsvFormat = apply {
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

            return other is CsvFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[has_bundle],
     * filter[tag], filter[connection_id], filter[phone_number], filter[status],
     * filter[voice.connection_name], filter[voice.usage_payment_method], filter[billing_group_id],
     * filter[emergency_address_id], filter[customer_reference]
     */
    class Filter
    private constructor(
        private val billingGroupId: String?,
        private val connectionId: String?,
        private val customerReference: String?,
        private val emergencyAddressId: String?,
        private val hasBundle: String?,
        private val phoneNumber: String?,
        private val status: Status?,
        private val tag: String?,
        private val voiceConnectionName: VoiceConnectionName?,
        private val voiceUsagePaymentMethod: VoiceUsagePaymentMethod?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * Filter by the billing_group_id associated with phone numbers. To filter to only phone
         * numbers that have no billing group associated them, set the value of this filter to the
         * string 'null'.
         */
        fun billingGroupId(): Optional<String> = Optional.ofNullable(billingGroupId)

        /** Filter by connection_id. */
        fun connectionId(): Optional<String> = Optional.ofNullable(connectionId)

        /** Filter numbers via the customer_reference set. */
        fun customerReference(): Optional<String> = Optional.ofNullable(customerReference)

        /**
         * Filter by the emergency_address_id associated with phone numbers. To filter only phone
         * numbers that have no emergency address associated with them, set the value of this filter
         * to the string 'null'.
         */
        fun emergencyAddressId(): Optional<String> = Optional.ofNullable(emergencyAddressId)

        /** Filter by phone number that have bundles. */
        fun hasBundle(): Optional<String> = Optional.ofNullable(hasBundle)

        /**
         * Filter by phone number. Requires at least three digits. Non-numerical characters will
         * result in no values being returned.
         */
        fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

        /** Filter by phone number status. */
        fun status(): Optional<Status> = Optional.ofNullable(status)

        /** Filter by phone number tags. */
        fun tag(): Optional<String> = Optional.ofNullable(tag)

        /** Filter by voice connection name pattern matching. */
        fun voiceConnectionName(): Optional<VoiceConnectionName> =
            Optional.ofNullable(voiceConnectionName)

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

            private var billingGroupId: String? = null
            private var connectionId: String? = null
            private var customerReference: String? = null
            private var emergencyAddressId: String? = null
            private var hasBundle: String? = null
            private var phoneNumber: String? = null
            private var status: Status? = null
            private var tag: String? = null
            private var voiceConnectionName: VoiceConnectionName? = null
            private var voiceUsagePaymentMethod: VoiceUsagePaymentMethod? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                billingGroupId = filter.billingGroupId
                connectionId = filter.connectionId
                customerReference = filter.customerReference
                emergencyAddressId = filter.emergencyAddressId
                hasBundle = filter.hasBundle
                phoneNumber = filter.phoneNumber
                status = filter.status
                tag = filter.tag
                voiceConnectionName = filter.voiceConnectionName
                voiceUsagePaymentMethod = filter.voiceUsagePaymentMethod
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /**
             * Filter by the billing_group_id associated with phone numbers. To filter to only phone
             * numbers that have no billing group associated them, set the value of this filter to
             * the string 'null'.
             */
            fun billingGroupId(billingGroupId: String?) = apply {
                this.billingGroupId = billingGroupId
            }

            /** Alias for calling [Builder.billingGroupId] with `billingGroupId.orElse(null)`. */
            fun billingGroupId(billingGroupId: Optional<String>) =
                billingGroupId(billingGroupId.getOrNull())

            /** Filter by connection_id. */
            fun connectionId(connectionId: String?) = apply { this.connectionId = connectionId }

            /** Alias for calling [Builder.connectionId] with `connectionId.orElse(null)`. */
            fun connectionId(connectionId: Optional<String>) =
                connectionId(connectionId.getOrNull())

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
             * Filter by the emergency_address_id associated with phone numbers. To filter only
             * phone numbers that have no emergency address associated with them, set the value of
             * this filter to the string 'null'.
             */
            fun emergencyAddressId(emergencyAddressId: String?) = apply {
                this.emergencyAddressId = emergencyAddressId
            }

            /**
             * Alias for calling [Builder.emergencyAddressId] with
             * `emergencyAddressId.orElse(null)`.
             */
            fun emergencyAddressId(emergencyAddressId: Optional<String>) =
                emergencyAddressId(emergencyAddressId.getOrNull())

            /** Filter by phone number that have bundles. */
            fun hasBundle(hasBundle: String?) = apply { this.hasBundle = hasBundle }

            /** Alias for calling [Builder.hasBundle] with `hasBundle.orElse(null)`. */
            fun hasBundle(hasBundle: Optional<String>) = hasBundle(hasBundle.getOrNull())

            /**
             * Filter by phone number. Requires at least three digits. Non-numerical characters will
             * result in no values being returned.
             */
            fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

            /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
            fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

            /** Filter by phone number status. */
            fun status(status: Status?) = apply { this.status = status }

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<Status>) = status(status.getOrNull())

            /** Filter by phone number tags. */
            fun tag(tag: String?) = apply { this.tag = tag }

            /** Alias for calling [Builder.tag] with `tag.orElse(null)`. */
            fun tag(tag: Optional<String>) = tag(tag.getOrNull())

            /** Filter by voice connection name pattern matching. */
            fun voiceConnectionName(voiceConnectionName: VoiceConnectionName?) = apply {
                this.voiceConnectionName = voiceConnectionName
            }

            /**
             * Alias for calling [Builder.voiceConnectionName] with
             * `voiceConnectionName.orElse(null)`.
             */
            fun voiceConnectionName(voiceConnectionName: Optional<VoiceConnectionName>) =
                voiceConnectionName(voiceConnectionName.getOrNull())

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
                    billingGroupId,
                    connectionId,
                    customerReference,
                    emergencyAddressId,
                    hasBundle,
                    phoneNumber,
                    status,
                    tag,
                    voiceConnectionName,
                    voiceUsagePaymentMethod,
                    additionalProperties.build(),
                )
        }

        /** Filter by phone number status. */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val PURCHASE_PENDING = of("purchase-pending")

                @JvmField val PURCHASE_FAILED = of("purchase-failed")

                @JvmField val PORT_PENDING = of("port-pending")

                @JvmField val ACTIVE = of("active")

                @JvmField val DELETED = of("deleted")

                @JvmField val PORT_FAILED = of("port-failed")

                @JvmField val EMERGENCY_ONLY = of("emergency-only")

                @JvmField val PORTED_OUT = of("ported-out")

                @JvmField val PORT_OUT_PENDING = of("port-out-pending")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PURCHASE_PENDING,
                PURCHASE_FAILED,
                PORT_PENDING,
                ACTIVE,
                DELETED,
                PORT_FAILED,
                EMERGENCY_ONLY,
                PORTED_OUT,
                PORT_OUT_PENDING,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PURCHASE_PENDING,
                PURCHASE_FAILED,
                PORT_PENDING,
                ACTIVE,
                DELETED,
                PORT_FAILED,
                EMERGENCY_ONLY,
                PORTED_OUT,
                PORT_OUT_PENDING,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    PURCHASE_PENDING -> Value.PURCHASE_PENDING
                    PURCHASE_FAILED -> Value.PURCHASE_FAILED
                    PORT_PENDING -> Value.PORT_PENDING
                    ACTIVE -> Value.ACTIVE
                    DELETED -> Value.DELETED
                    PORT_FAILED -> Value.PORT_FAILED
                    EMERGENCY_ONLY -> Value.EMERGENCY_ONLY
                    PORTED_OUT -> Value.PORTED_OUT
                    PORT_OUT_PENDING -> Value.PORT_OUT_PENDING
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
                    PURCHASE_PENDING -> Known.PURCHASE_PENDING
                    PURCHASE_FAILED -> Known.PURCHASE_FAILED
                    PORT_PENDING -> Known.PORT_PENDING
                    ACTIVE -> Known.ACTIVE
                    DELETED -> Known.DELETED
                    PORT_FAILED -> Known.PORT_FAILED
                    EMERGENCY_ONLY -> Known.EMERGENCY_ONLY
                    PORTED_OUT -> Known.PORTED_OUT
                    PORT_OUT_PENDING -> Known.PORT_OUT_PENDING
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        /** Filter by voice connection name pattern matching. */
        class VoiceConnectionName
        private constructor(
            private val contains: String?,
            private val endsWith: String?,
            private val eq: String?,
            private val startsWith: String?,
            private val additionalProperties: QueryParams,
        ) {

            /** Filter contains connection name. Requires at least three characters. */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /** Filter ends with connection name. Requires at least three characters. */
            fun endsWith(): Optional<String> = Optional.ofNullable(endsWith)

            /** Filter by connection name. */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            /** Filter starts with connection name. Requires at least three characters. */
            fun startsWith(): Optional<String> = Optional.ofNullable(startsWith)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [VoiceConnectionName].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [VoiceConnectionName]. */
            class Builder internal constructor() {

                private var contains: String? = null
                private var endsWith: String? = null
                private var eq: String? = null
                private var startsWith: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(voiceConnectionName: VoiceConnectionName) = apply {
                    contains = voiceConnectionName.contains
                    endsWith = voiceConnectionName.endsWith
                    eq = voiceConnectionName.eq
                    startsWith = voiceConnectionName.startsWith
                    additionalProperties = voiceConnectionName.additionalProperties.toBuilder()
                }

                /** Filter contains connection name. Requires at least three characters. */
                fun contains(contains: String?) = apply { this.contains = contains }

                /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                /** Filter ends with connection name. Requires at least three characters. */
                fun endsWith(endsWith: String?) = apply { this.endsWith = endsWith }

                /** Alias for calling [Builder.endsWith] with `endsWith.orElse(null)`. */
                fun endsWith(endsWith: Optional<String>) = endsWith(endsWith.getOrNull())

                /** Filter by connection name. */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

                /** Filter starts with connection name. Requires at least three characters. */
                fun startsWith(startsWith: String?) = apply { this.startsWith = startsWith }

                /** Alias for calling [Builder.startsWith] with `startsWith.orElse(null)`. */
                fun startsWith(startsWith: Optional<String>) = startsWith(startsWith.getOrNull())

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
                 * Returns an immutable instance of [VoiceConnectionName].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): VoiceConnectionName =
                    VoiceConnectionName(
                        contains,
                        endsWith,
                        eq,
                        startsWith,
                        additionalProperties.build(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VoiceConnectionName &&
                    contains == other.contains &&
                    endsWith == other.endsWith &&
                    eq == other.eq &&
                    startsWith == other.startsWith &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(contains, endsWith, eq, startsWith, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VoiceConnectionName{contains=$contains, endsWith=$endsWith, eq=$eq, startsWith=$startsWith, additionalProperties=$additionalProperties}"
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
                billingGroupId == other.billingGroupId &&
                connectionId == other.connectionId &&
                customerReference == other.customerReference &&
                emergencyAddressId == other.emergencyAddressId &&
                hasBundle == other.hasBundle &&
                phoneNumber == other.phoneNumber &&
                status == other.status &&
                tag == other.tag &&
                voiceConnectionName == other.voiceConnectionName &&
                voiceUsagePaymentMethod == other.voiceUsagePaymentMethod &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingGroupId,
                connectionId,
                customerReference,
                emergencyAddressId,
                hasBundle,
                phoneNumber,
                status,
                tag,
                voiceConnectionName,
                voiceUsagePaymentMethod,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{billingGroupId=$billingGroupId, connectionId=$connectionId, customerReference=$customerReference, emergencyAddressId=$emergencyAddressId, hasBundle=$hasBundle, phoneNumber=$phoneNumber, status=$status, tag=$tag, voiceConnectionName=$voiceConnectionName, voiceUsagePaymentMethod=$voiceUsagePaymentMethod, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CsvDownloadCreateParams &&
            csvFormat == other.csvFormat &&
            filter == other.filter &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(
            csvFormat,
            filter,
            additionalHeaders,
            additionalQueryParams,
            additionalBodyProperties,
        )

    override fun toString() =
        "CsvDownloadCreateParams{csvFormat=$csvFormat, filter=$filter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
