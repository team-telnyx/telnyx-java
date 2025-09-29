// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.porting.reports

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The parameters for generating a porting orders CSV report. */
class ExportPortingOrdersCsvReport
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
     * The filters to apply to the export porting order CSV report.
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
         * Returns a mutable builder for constructing an instance of [ExportPortingOrdersCsvReport].
         *
         * The following fields are required:
         * ```java
         * .filters()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExportPortingOrdersCsvReport]. */
    class Builder internal constructor() {

        private var filters: JsonField<Filters>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exportPortingOrdersCsvReport: ExportPortingOrdersCsvReport) = apply {
            filters = exportPortingOrdersCsvReport.filters
            additionalProperties = exportPortingOrdersCsvReport.additionalProperties.toMutableMap()
        }

        /** The filters to apply to the export porting order CSV report. */
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
         * Returns an immutable instance of [ExportPortingOrdersCsvReport].
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
        fun build(): ExportPortingOrdersCsvReport =
            ExportPortingOrdersCsvReport(
                checkRequired("filters", filters),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExportPortingOrdersCsvReport = apply {
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

    /** The filters to apply to the export porting order CSV report. */
    class Filters
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val createdAtGt: JsonField<OffsetDateTime>,
        private val createdAtLt: JsonField<OffsetDateTime>,
        private val customerReferenceIn: JsonField<List<String>>,
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
            @JsonProperty("status__in")
            @ExcludeMissing
            statusIn: JsonField<List<StatusIn>> = JsonMissing.of(),
        ) : this(createdAtGt, createdAtLt, customerReferenceIn, statusIn, mutableMapOf())

        /**
         * The date and time the porting order was created after.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAtGt(): Optional<OffsetDateTime> = createdAtGt.getOptional("created_at__gt")

        /**
         * The date and time the porting order was created before.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAtLt(): Optional<OffsetDateTime> = createdAtLt.getOptional("created_at__lt")

        /**
         * The customer reference of the porting orders to include in the report.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReferenceIn(): Optional<List<String>> =
            customerReferenceIn.getOptional("customer_reference__in")

        /**
         * The status of the porting orders to include in the report.
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
            private var statusIn: JsonField<MutableList<StatusIn>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filters: Filters) = apply {
                createdAtGt = filters.createdAtGt
                createdAtLt = filters.createdAtLt
                customerReferenceIn = filters.customerReferenceIn.map { it.toMutableList() }
                statusIn = filters.statusIn.map { it.toMutableList() }
                additionalProperties = filters.additionalProperties.toMutableMap()
            }

            /** The date and time the porting order was created after. */
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

            /** The date and time the porting order was created before. */
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

            /** The customer reference of the porting orders to include in the report. */
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

            /** The status of the porting orders to include in the report. */
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

                @JvmField val DRAFT = of("draft")

                @JvmField val IN_PROCESS = of("in-process")

                @JvmField val SUBMITTED = of("submitted")

                @JvmField val EXCEPTION = of("exception")

                @JvmField val FOC_DATE_CONFIRMED = of("foc-date-confirmed")

                @JvmField val CANCEL_PENDING = of("cancel-pending")

                @JvmField val PORTED = of("ported")

                @JvmField val CANCELLED = of("cancelled")

                @JvmStatic fun of(value: String) = StatusIn(JsonField.of(value))
            }

            /** An enum containing [StatusIn]'s known values. */
            enum class Known {
                DRAFT,
                IN_PROCESS,
                SUBMITTED,
                EXCEPTION,
                FOC_DATE_CONFIRMED,
                CANCEL_PENDING,
                PORTED,
                CANCELLED,
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
                DRAFT,
                IN_PROCESS,
                SUBMITTED,
                EXCEPTION,
                FOC_DATE_CONFIRMED,
                CANCEL_PENDING,
                PORTED,
                CANCELLED,
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
                    DRAFT -> Value.DRAFT
                    IN_PROCESS -> Value.IN_PROCESS
                    SUBMITTED -> Value.SUBMITTED
                    EXCEPTION -> Value.EXCEPTION
                    FOC_DATE_CONFIRMED -> Value.FOC_DATE_CONFIRMED
                    CANCEL_PENDING -> Value.CANCEL_PENDING
                    PORTED -> Value.PORTED
                    CANCELLED -> Value.CANCELLED
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
                    DRAFT -> Known.DRAFT
                    IN_PROCESS -> Known.IN_PROCESS
                    SUBMITTED -> Known.SUBMITTED
                    EXCEPTION -> Known.EXCEPTION
                    FOC_DATE_CONFIRMED -> Known.FOC_DATE_CONFIRMED
                    CANCEL_PENDING -> Known.CANCEL_PENDING
                    PORTED -> Known.PORTED
                    CANCELLED -> Known.CANCELLED
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
                statusIn == other.statusIn &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                createdAtGt,
                createdAtLt,
                customerReferenceIn,
                statusIn,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filters{createdAtGt=$createdAtGt, createdAtLt=$createdAtLt, customerReferenceIn=$customerReferenceIn, statusIn=$statusIn, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExportPortingOrdersCsvReport &&
            filters == other.filters &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(filters, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExportPortingOrdersCsvReport{filters=$filters, additionalProperties=$additionalProperties}"
}
