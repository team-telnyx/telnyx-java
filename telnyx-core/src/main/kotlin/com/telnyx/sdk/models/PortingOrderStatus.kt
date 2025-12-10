// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

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
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Porting order status */
class PortingOrderStatus
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val details: JsonField<List<PortingOrdersExceptionType>>,
    private val value: JsonField<PortingOrderStatusValue>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("details")
        @ExcludeMissing
        details: JsonField<List<PortingOrdersExceptionType>> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        value: JsonField<PortingOrderStatusValue> = JsonMissing.of(),
    ) : this(details, value, mutableMapOf())

    /**
     * A list of 0 or more details about this porting order's status
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun details(): Optional<List<PortingOrdersExceptionType>> = details.getOptional("details")

    /**
     * The current status of the porting order
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<PortingOrderStatusValue> = value.getOptional("value")

    /**
     * Returns the raw JSON value of [details].
     *
     * Unlike [details], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("details")
    @ExcludeMissing
    fun _details(): JsonField<List<PortingOrdersExceptionType>> = details

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<PortingOrderStatusValue> = value

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

        /** Returns a mutable builder for constructing an instance of [PortingOrderStatus]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderStatus]. */
    class Builder internal constructor() {

        private var details: JsonField<MutableList<PortingOrdersExceptionType>>? = null
        private var value: JsonField<PortingOrderStatusValue> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingOrderStatus: PortingOrderStatus) = apply {
            details = portingOrderStatus.details.map { it.toMutableList() }
            value = portingOrderStatus.value
            additionalProperties = portingOrderStatus.additionalProperties.toMutableMap()
        }

        /** A list of 0 or more details about this porting order's status */
        fun details(details: List<PortingOrdersExceptionType>) = details(JsonField.of(details))

        /**
         * Sets [Builder.details] to an arbitrary JSON value.
         *
         * You should usually call [Builder.details] with a well-typed
         * `List<PortingOrdersExceptionType>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun details(details: JsonField<List<PortingOrdersExceptionType>>) = apply {
            this.details = details.map { it.toMutableList() }
        }

        /**
         * Adds a single [PortingOrdersExceptionType] to [details].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDetail(detail: PortingOrdersExceptionType) = apply {
            details =
                (details ?: JsonField.of(mutableListOf())).also {
                    checkKnown("details", it).add(detail)
                }
        }

        /** The current status of the porting order */
        fun value(value: PortingOrderStatusValue) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [PortingOrderStatusValue] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun value(value: JsonField<PortingOrderStatusValue>) = apply { this.value = value }

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
         * Returns an immutable instance of [PortingOrderStatus].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderStatus =
            PortingOrderStatus(
                (details ?: JsonMissing.of()).map { it.toImmutable() },
                value,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingOrderStatus = apply {
        if (validated) {
            return@apply
        }

        details().ifPresent { it.forEach { it.validate() } }
        value().ifPresent { it.validate() }
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
    @JvmSynthetic
    internal fun validity(): Int =
        (details.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (value.asKnown().getOrNull()?.validity() ?: 0)

    /** The current status of the porting order */
    class PortingOrderStatusValue
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DRAFT = of("draft")

            @JvmField val IN_PROCESS = of("in-process")

            @JvmField val SUBMITTED = of("submitted")

            @JvmField val EXCEPTION = of("exception")

            @JvmField val FOC_DATE_CONFIRMED = of("foc-date-confirmed")

            @JvmField val PORTED = of("ported")

            @JvmField val CANCELLED = of("cancelled")

            @JvmField val CANCEL_PENDING = of("cancel-pending")

            @JvmStatic fun of(value: String) = PortingOrderStatusValue(JsonField.of(value))
        }

        /** An enum containing [PortingOrderStatusValue]'s known values. */
        enum class Known {
            DRAFT,
            IN_PROCESS,
            SUBMITTED,
            EXCEPTION,
            FOC_DATE_CONFIRMED,
            PORTED,
            CANCELLED,
            CANCEL_PENDING,
        }

        /**
         * An enum containing [PortingOrderStatusValue]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [PortingOrderStatusValue] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DRAFT,
            IN_PROCESS,
            SUBMITTED,
            EXCEPTION,
            FOC_DATE_CONFIRMED,
            PORTED,
            CANCELLED,
            CANCEL_PENDING,
            /**
             * An enum member indicating that [PortingOrderStatusValue] was instantiated with an
             * unknown value.
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
                DRAFT -> Value.DRAFT
                IN_PROCESS -> Value.IN_PROCESS
                SUBMITTED -> Value.SUBMITTED
                EXCEPTION -> Value.EXCEPTION
                FOC_DATE_CONFIRMED -> Value.FOC_DATE_CONFIRMED
                PORTED -> Value.PORTED
                CANCELLED -> Value.CANCELLED
                CANCEL_PENDING -> Value.CANCEL_PENDING
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
                DRAFT -> Known.DRAFT
                IN_PROCESS -> Known.IN_PROCESS
                SUBMITTED -> Known.SUBMITTED
                EXCEPTION -> Known.EXCEPTION
                FOC_DATE_CONFIRMED -> Known.FOC_DATE_CONFIRMED
                PORTED -> Known.PORTED
                CANCELLED -> Known.CANCELLED
                CANCEL_PENDING -> Known.CANCEL_PENDING
                else -> throw TelnyxInvalidDataException("Unknown PortingOrderStatusValue: $value")
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

        fun validate(): PortingOrderStatusValue = apply {
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

            return other is PortingOrderStatusValue && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderStatus &&
            details == other.details &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(details, value, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrderStatus{details=$details, value=$value, additionalProperties=$additionalProperties}"
}
