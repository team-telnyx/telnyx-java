// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.reports

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The parameters for generating a port-outs CSV report. */
class ExportPortoutsCsvReport
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filters: JsonField<Filters>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filters") @ExcludeMissing filters: JsonField<Filters> = JsonMissing.of()
    ) : this(filters, mutableMapOf())

    /**
     * The filters to apply to the export port-out CSV report.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filters(): Filters = filters.getRequired("filters")

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<Filters> = filters

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

        /**
         * Returns a mutable builder for constructing an instance of [ExportPortoutsCsvReport].
         *
         * The following fields are required:
         * ```java
         * .filters()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExportPortoutsCsvReport]. */
    class Builder internal constructor() {

        private var filters: JsonField<Filters>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exportPortoutsCsvReport: ExportPortoutsCsvReport) = apply {
            filters = exportPortoutsCsvReport.filters
            additionalProperties = exportPortoutsCsvReport.additionalProperties.toMutableMap()
        }

        /** The filters to apply to the export port-out CSV report. */
        fun filters(filters: Filters) = filters(JsonField.of(filters))

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed [Filters] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filters(filters: JsonField<Filters>) = apply { this.filters = filters }

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
         * Returns an immutable instance of [ExportPortoutsCsvReport].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .filters()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExportPortoutsCsvReport =
            ExportPortoutsCsvReport(
                checkRequired("filters", filters),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExportPortoutsCsvReport = apply {
        if (validated) {
            return@apply
        }

        filters().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = (filters.asKnown().getOrNull()?.validity() ?: 0)

    /** The filters to apply to the export port-out CSV report. */
    class Filters
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val createdAtGt: JsonField<OffsetDateTime>,
        private val createdAtLt: JsonField<OffsetDateTime>,
        private val customerReferenceIn: JsonField<List<String>>,
        private val endUserName: JsonField<String>,
        private val phoneNumbersOverlaps: JsonField<List<String>>,
        private val statusIn: JsonField<List<StatusIn>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created_at__gt")
            @ExcludeMissing
            createdAtGt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("created_at__lt")
            @ExcludeMissing
            createdAtLt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customer_reference__in")
            @ExcludeMissing
            customerReferenceIn: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("end_user_name")
            @ExcludeMissing
            endUserName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_numbers__overlaps")
            @ExcludeMissing
            phoneNumbersOverlaps: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("status__in")
            @ExcludeMissing
            statusIn: JsonField<List<StatusIn>> = JsonMissing.of(),
        ) : this(
            createdAtGt,
            createdAtLt,
            customerReferenceIn,
            endUserName,
            phoneNumbersOverlaps,
            statusIn,
            mutableMapOf(),
        )

        /**
         * The date and time the port-out was created after.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAtGt(): Optional<OffsetDateTime> = createdAtGt.getOptional("created_at__gt")

        /**
         * The date and time the port-out was created before.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAtLt(): Optional<OffsetDateTime> = createdAtLt.getOptional("created_at__lt")

        /**
         * The customer reference of the port-outs to include in the report.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReferenceIn(): Optional<List<String>> =
            customerReferenceIn.getOptional("customer_reference__in")

        /**
         * The end user name of the port-outs to include in the report.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endUserName(): Optional<String> = endUserName.getOptional("end_user_name")

        /**
         * A list of phone numbers that the port-outs phone numbers must overlap with.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumbersOverlaps(): Optional<List<String>> =
            phoneNumbersOverlaps.getOptional("phone_numbers__overlaps")

        /**
         * The status of the port-outs to include in the report.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusIn(): Optional<List<StatusIn>> = statusIn.getOptional("status__in")

        /**
         * Returns the raw JSON value of [createdAtGt].
         *
         * Unlike [createdAtGt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at__gt")
        @ExcludeMissing
        fun _createdAtGt(): JsonField<OffsetDateTime> = createdAtGt

        /**
         * Returns the raw JSON value of [createdAtLt].
         *
         * Unlike [createdAtLt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at__lt")
        @ExcludeMissing
        fun _createdAtLt(): JsonField<OffsetDateTime> = createdAtLt

        /**
         * Returns the raw JSON value of [customerReferenceIn].
         *
         * Unlike [customerReferenceIn], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("customer_reference__in")
        @ExcludeMissing
        fun _customerReferenceIn(): JsonField<List<String>> = customerReferenceIn

        /**
         * Returns the raw JSON value of [endUserName].
         *
         * Unlike [endUserName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_user_name")
        @ExcludeMissing
        fun _endUserName(): JsonField<String> = endUserName

        /**
         * Returns the raw JSON value of [phoneNumbersOverlaps].
         *
         * Unlike [phoneNumbersOverlaps], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("phone_numbers__overlaps")
        @ExcludeMissing
        fun _phoneNumbersOverlaps(): JsonField<List<String>> = phoneNumbersOverlaps

        /**
         * Returns the raw JSON value of [statusIn].
         *
         * Unlike [statusIn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status__in")
        @ExcludeMissing
        fun _statusIn(): JsonField<List<StatusIn>> = statusIn

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

            /** Returns a mutable builder for constructing an instance of [Filters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filters]. */
        class Builder internal constructor() {

            private var createdAtGt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdAtLt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customerReferenceIn: JsonField<MutableList<String>>? = null
            private var endUserName: JsonField<String> = JsonMissing.of()
            private var phoneNumbersOverlaps: JsonField<MutableList<String>>? = null
            private var statusIn: JsonField<MutableList<StatusIn>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filters: Filters) = apply {
                createdAtGt = filters.createdAtGt
                createdAtLt = filters.createdAtLt
                customerReferenceIn = filters.customerReferenceIn.map { it.toMutableList() }
                endUserName = filters.endUserName
                phoneNumbersOverlaps = filters.phoneNumbersOverlaps.map { it.toMutableList() }
                statusIn = filters.statusIn.map { it.toMutableList() }
                additionalProperties = filters.additionalProperties.toMutableMap()
            }

            /** The date and time the port-out was created after. */
            fun createdAtGt(createdAtGt: OffsetDateTime) = createdAtGt(JsonField.of(createdAtGt))

            /**
             * Sets [Builder.createdAtGt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAtGt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun createdAtGt(createdAtGt: JsonField<OffsetDateTime>) = apply {
                this.createdAtGt = createdAtGt
            }

            /** The date and time the port-out was created before. */
            fun createdAtLt(createdAtLt: OffsetDateTime) = createdAtLt(JsonField.of(createdAtLt))

            /**
             * Sets [Builder.createdAtLt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAtLt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun createdAtLt(createdAtLt: JsonField<OffsetDateTime>) = apply {
                this.createdAtLt = createdAtLt
            }

            /** The customer reference of the port-outs to include in the report. */
            fun customerReferenceIn(customerReferenceIn: List<String>) =
                customerReferenceIn(JsonField.of(customerReferenceIn))

            /**
             * Sets [Builder.customerReferenceIn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerReferenceIn] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun customerReferenceIn(customerReferenceIn: JsonField<List<String>>) = apply {
                this.customerReferenceIn = customerReferenceIn.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.customerReferenceIn].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCustomerReferenceIn(customerReferenceIn: String) = apply {
                this.customerReferenceIn =
                    (this.customerReferenceIn ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customerReferenceIn", it).add(customerReferenceIn)
                    }
            }

            /** The end user name of the port-outs to include in the report. */
            fun endUserName(endUserName: String) = endUserName(JsonField.of(endUserName))

            /**
             * Sets [Builder.endUserName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endUserName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endUserName(endUserName: JsonField<String>) = apply {
                this.endUserName = endUserName
            }

            /** A list of phone numbers that the port-outs phone numbers must overlap with. */
            fun phoneNumbersOverlaps(phoneNumbersOverlaps: List<String>) =
                phoneNumbersOverlaps(JsonField.of(phoneNumbersOverlaps))

            /**
             * Sets [Builder.phoneNumbersOverlaps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumbersOverlaps] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun phoneNumbersOverlaps(phoneNumbersOverlaps: JsonField<List<String>>) = apply {
                this.phoneNumbersOverlaps = phoneNumbersOverlaps.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [phoneNumbersOverlaps].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPhoneNumbersOverlap(phoneNumbersOverlap: String) = apply {
                phoneNumbersOverlaps =
                    (phoneNumbersOverlaps ?: JsonField.of(mutableListOf())).also {
                        checkKnown("phoneNumbersOverlaps", it).add(phoneNumbersOverlap)
                    }
            }

            /** The status of the port-outs to include in the report. */
            fun statusIn(statusIn: List<StatusIn>) = statusIn(JsonField.of(statusIn))

            /**
             * Sets [Builder.statusIn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusIn] with a well-typed `List<StatusIn>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusIn(statusIn: JsonField<List<StatusIn>>) = apply {
                this.statusIn = statusIn.map { it.toMutableList() }
            }

            /**
             * Adds a single [StatusIn] to [Builder.statusIn].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStatusIn(statusIn: StatusIn) = apply {
                this.statusIn =
                    (this.statusIn ?: JsonField.of(mutableListOf())).also {
                        checkKnown("statusIn", it).add(statusIn)
                    }
            }

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
             * Returns an immutable instance of [Filters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filters =
                Filters(
                    createdAtGt,
                    createdAtLt,
                    (customerReferenceIn ?: JsonMissing.of()).map { it.toImmutable() },
                    endUserName,
                    (phoneNumbersOverlaps ?: JsonMissing.of()).map { it.toImmutable() },
                    (statusIn ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Filters = apply {
            if (validated) {
                return@apply
            }

            createdAtGt()
            createdAtLt()
            customerReferenceIn()
            endUserName()
            phoneNumbersOverlaps()
            statusIn().ifPresent { it.forEach { it.validate() } }
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
            (if (createdAtGt.asKnown().isPresent) 1 else 0) +
                (if (createdAtLt.asKnown().isPresent) 1 else 0) +
                (customerReferenceIn.asKnown().getOrNull()?.size ?: 0) +
                (if (endUserName.asKnown().isPresent) 1 else 0) +
                (phoneNumbersOverlaps.asKnown().getOrNull()?.size ?: 0) +
                (statusIn.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class StatusIn @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val PENDING = of("pending")

                @JvmField val AUTHORIZED = of("authorized")

                @JvmField val PORTED = of("ported")

                @JvmField val REJECTED = of("rejected")

                @JvmField val REJECTED_PENDING = of("rejected-pending")

                @JvmField val CANCELED = of("canceled")

                @JvmStatic fun of(value: String) = StatusIn(JsonField.of(value))
            }

            /** An enum containing [StatusIn]'s known values. */
            enum class Known {
                PENDING,
                AUTHORIZED,
                PORTED,
                REJECTED,
                REJECTED_PENDING,
                CANCELED,
            }

            /**
             * An enum containing [StatusIn]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [StatusIn] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                AUTHORIZED,
                PORTED,
                REJECTED,
                REJECTED_PENDING,
                CANCELED,
                /**
                 * An enum member indicating that [StatusIn] was instantiated with an unknown value.
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
                    PENDING -> Value.PENDING
                    AUTHORIZED -> Value.AUTHORIZED
                    PORTED -> Value.PORTED
                    REJECTED -> Value.REJECTED
                    REJECTED_PENDING -> Value.REJECTED_PENDING
                    CANCELED -> Value.CANCELED
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
                    PENDING -> Known.PENDING
                    AUTHORIZED -> Known.AUTHORIZED
                    PORTED -> Known.PORTED
                    REJECTED -> Known.REJECTED
                    REJECTED_PENDING -> Known.REJECTED_PENDING
                    CANCELED -> Known.CANCELED
                    else -> throw TelnyxInvalidDataException("Unknown StatusIn: $value")
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

            fun validate(): StatusIn = apply {
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

                return other is StatusIn && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filters &&
                createdAtGt == other.createdAtGt &&
                createdAtLt == other.createdAtLt &&
                customerReferenceIn == other.customerReferenceIn &&
                endUserName == other.endUserName &&
                phoneNumbersOverlaps == other.phoneNumbersOverlaps &&
                statusIn == other.statusIn &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                createdAtGt,
                createdAtLt,
                customerReferenceIn,
                endUserName,
                phoneNumbersOverlaps,
                statusIn,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filters{createdAtGt=$createdAtGt, createdAtLt=$createdAtLt, customerReferenceIn=$customerReferenceIn, endUserName=$endUserName, phoneNumbersOverlaps=$phoneNumbersOverlaps, statusIn=$statusIn, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExportPortoutsCsvReport &&
            filters == other.filters &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(filters, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExportPortoutsCsvReport{filters=$filters, additionalProperties=$additionalProperties}"
}
