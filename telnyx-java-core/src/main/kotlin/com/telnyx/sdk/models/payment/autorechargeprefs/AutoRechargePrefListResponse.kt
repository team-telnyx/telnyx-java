// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payment.autorechargeprefs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AutoRechargePrefListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of [AutoRechargePrefListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AutoRechargePrefListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(autoRechargePrefListResponse: AutoRechargePrefListResponse) = apply {
            data = autoRechargePrefListResponse.data
            additionalProperties = autoRechargePrefListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [AutoRechargePrefListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AutoRechargePrefListResponse =
            AutoRechargePrefListResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): AutoRechargePrefListResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val enabled: JsonField<Boolean>,
        private val invoiceEnabled: JsonField<Boolean>,
        private val preference: JsonField<Preference>,
        private val rechargeAmount: JsonField<String>,
        private val recordType: JsonField<String>,
        private val thresholdAmount: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("invoice_enabled")
            @ExcludeMissing
            invoiceEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("preference")
            @ExcludeMissing
            preference: JsonField<Preference> = JsonMissing.of(),
            @JsonProperty("recharge_amount")
            @ExcludeMissing
            rechargeAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("threshold_amount")
            @ExcludeMissing
            thresholdAmount: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            enabled,
            invoiceEnabled,
            preference,
            rechargeAmount,
            recordType,
            thresholdAmount,
            mutableMapOf(),
        )

        /**
         * The unique identifier for the auto recharge preference.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Whether auto recharge is enabled.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invoiceEnabled(): Optional<Boolean> = invoiceEnabled.getOptional("invoice_enabled")

        /**
         * The payment preference for auto recharge.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun preference(): Optional<Preference> = preference.getOptional("preference")

        /**
         * The amount to recharge the account, the actual recharge amount will be the amount
         * necessary to reach the threshold amount plus the recharge amount.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rechargeAmount(): Optional<String> = rechargeAmount.getOptional("recharge_amount")

        /**
         * The record type.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * The threshold amount at which the account will be recharged.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun thresholdAmount(): Optional<String> = thresholdAmount.getOptional("threshold_amount")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [invoiceEnabled].
         *
         * Unlike [invoiceEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoice_enabled")
        @ExcludeMissing
        fun _invoiceEnabled(): JsonField<Boolean> = invoiceEnabled

        /**
         * Returns the raw JSON value of [preference].
         *
         * Unlike [preference], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preference")
        @ExcludeMissing
        fun _preference(): JsonField<Preference> = preference

        /**
         * Returns the raw JSON value of [rechargeAmount].
         *
         * Unlike [rechargeAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recharge_amount")
        @ExcludeMissing
        fun _rechargeAmount(): JsonField<String> = rechargeAmount

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [thresholdAmount].
         *
         * Unlike [thresholdAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("threshold_amount")
        @ExcludeMissing
        fun _thresholdAmount(): JsonField<String> = thresholdAmount

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var enabled: JsonField<Boolean> = JsonMissing.of()
            private var invoiceEnabled: JsonField<Boolean> = JsonMissing.of()
            private var preference: JsonField<Preference> = JsonMissing.of()
            private var rechargeAmount: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var thresholdAmount: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                enabled = data.enabled
                invoiceEnabled = data.invoiceEnabled
                preference = data.preference
                rechargeAmount = data.rechargeAmount
                recordType = data.recordType
                thresholdAmount = data.thresholdAmount
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The unique identifier for the auto recharge preference. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Whether auto recharge is enabled. */
            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            fun invoiceEnabled(invoiceEnabled: Boolean) =
                invoiceEnabled(JsonField.of(invoiceEnabled))

            /**
             * Sets [Builder.invoiceEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoiceEnabled(invoiceEnabled: JsonField<Boolean>) = apply {
                this.invoiceEnabled = invoiceEnabled
            }

            /** The payment preference for auto recharge. */
            fun preference(preference: Preference) = preference(JsonField.of(preference))

            /**
             * Sets [Builder.preference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preference] with a well-typed [Preference] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preference(preference: JsonField<Preference>) = apply {
                this.preference = preference
            }

            /**
             * The amount to recharge the account, the actual recharge amount will be the amount
             * necessary to reach the threshold amount plus the recharge amount.
             */
            fun rechargeAmount(rechargeAmount: String) =
                rechargeAmount(JsonField.of(rechargeAmount))

            /**
             * Sets [Builder.rechargeAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rechargeAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rechargeAmount(rechargeAmount: JsonField<String>) = apply {
                this.rechargeAmount = rechargeAmount
            }

            /** The record type. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** The threshold amount at which the account will be recharged. */
            fun thresholdAmount(thresholdAmount: String) =
                thresholdAmount(JsonField.of(thresholdAmount))

            /**
             * Sets [Builder.thresholdAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thresholdAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun thresholdAmount(thresholdAmount: JsonField<String>) = apply {
                this.thresholdAmount = thresholdAmount
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    id,
                    enabled,
                    invoiceEnabled,
                    preference,
                    rechargeAmount,
                    recordType,
                    thresholdAmount,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            enabled()
            invoiceEnabled()
            preference().ifPresent { it.validate() }
            rechargeAmount()
            recordType()
            thresholdAmount()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (enabled.asKnown().isPresent) 1 else 0) +
                (if (invoiceEnabled.asKnown().isPresent) 1 else 0) +
                (preference.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rechargeAmount.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (thresholdAmount.asKnown().isPresent) 1 else 0)

        /** The payment preference for auto recharge. */
        class Preference @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val CREDIT_PAYPAL = of("credit_paypal")

                @JvmField val ACH = of("ach")

                @JvmStatic fun of(value: String) = Preference(JsonField.of(value))
            }

            /** An enum containing [Preference]'s known values. */
            enum class Known {
                CREDIT_PAYPAL,
                ACH,
            }

            /**
             * An enum containing [Preference]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Preference] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CREDIT_PAYPAL,
                ACH,
                /**
                 * An enum member indicating that [Preference] was instantiated with an unknown
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
                    CREDIT_PAYPAL -> Value.CREDIT_PAYPAL
                    ACH -> Value.ACH
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
                    CREDIT_PAYPAL -> Known.CREDIT_PAYPAL
                    ACH -> Known.ACH
                    else -> throw TelnyxInvalidDataException("Unknown Preference: $value")
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

            fun validate(): Preference = apply {
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

                return other is Preference && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                enabled == other.enabled &&
                invoiceEnabled == other.invoiceEnabled &&
                preference == other.preference &&
                rechargeAmount == other.rechargeAmount &&
                recordType == other.recordType &&
                thresholdAmount == other.thresholdAmount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                enabled,
                invoiceEnabled,
                preference,
                rechargeAmount,
                recordType,
                thresholdAmount,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, enabled=$enabled, invoiceEnabled=$invoiceEnabled, preference=$preference, rechargeAmount=$rechargeAmount, recordType=$recordType, thresholdAmount=$thresholdAmount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AutoRechargePrefListResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AutoRechargePrefListResponse{data=$data, additionalProperties=$additionalProperties}"
}
