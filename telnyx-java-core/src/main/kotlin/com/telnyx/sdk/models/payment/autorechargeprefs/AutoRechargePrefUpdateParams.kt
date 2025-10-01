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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update payment auto recharge preferences. */
class AutoRechargePrefUpdateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Whether auto recharge is enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = body.enabled()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceEnabled(): Optional<Boolean> = body.invoiceEnabled()

    /**
     * The payment preference for auto recharge.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preference(): Optional<Preference> = body.preference()

    /**
     * The amount to recharge the account, the actual recharge amount will be the amount necessary
     * to reach the threshold amount plus the recharge amount.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rechargeAmount(): Optional<String> = body.rechargeAmount()

    /**
     * The threshold amount at which the account will be recharged.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thresholdAmount(): Optional<String> = body.thresholdAmount()

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enabled(): JsonField<Boolean> = body._enabled()

    /**
     * Returns the raw JSON value of [invoiceEnabled].
     *
     * Unlike [invoiceEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invoiceEnabled(): JsonField<Boolean> = body._invoiceEnabled()

    /**
     * Returns the raw JSON value of [preference].
     *
     * Unlike [preference], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _preference(): JsonField<Preference> = body._preference()

    /**
     * Returns the raw JSON value of [rechargeAmount].
     *
     * Unlike [rechargeAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rechargeAmount(): JsonField<String> = body._rechargeAmount()

    /**
     * Returns the raw JSON value of [thresholdAmount].
     *
     * Unlike [thresholdAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _thresholdAmount(): JsonField<String> = body._thresholdAmount()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AutoRechargePrefUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [AutoRechargePrefUpdateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AutoRechargePrefUpdateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(autoRechargePrefUpdateParams: AutoRechargePrefUpdateParams) = apply {
            body = autoRechargePrefUpdateParams.body.toBuilder()
            additionalHeaders = autoRechargePrefUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = autoRechargePrefUpdateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [enabled]
         * - [invoiceEnabled]
         * - [preference]
         * - [rechargeAmount]
         * - [thresholdAmount]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Whether auto recharge is enabled. */
        fun enabled(enabled: Boolean) = apply { body.enabled(enabled) }

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { body.enabled(enabled) }

        fun invoiceEnabled(invoiceEnabled: Boolean) = apply { body.invoiceEnabled(invoiceEnabled) }

        /**
         * Sets [Builder.invoiceEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoiceEnabled(invoiceEnabled: JsonField<Boolean>) = apply {
            body.invoiceEnabled(invoiceEnabled)
        }

        /** The payment preference for auto recharge. */
        fun preference(preference: Preference) = apply { body.preference(preference) }

        /**
         * Sets [Builder.preference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preference] with a well-typed [Preference] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preference(preference: JsonField<Preference>) = apply { body.preference(preference) }

        /**
         * The amount to recharge the account, the actual recharge amount will be the amount
         * necessary to reach the threshold amount plus the recharge amount.
         */
        fun rechargeAmount(rechargeAmount: String) = apply { body.rechargeAmount(rechargeAmount) }

        /**
         * Sets [Builder.rechargeAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rechargeAmount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rechargeAmount(rechargeAmount: JsonField<String>) = apply {
            body.rechargeAmount(rechargeAmount)
        }

        /** The threshold amount at which the account will be recharged. */
        fun thresholdAmount(thresholdAmount: String) = apply {
            body.thresholdAmount(thresholdAmount)
        }

        /**
         * Sets [Builder.thresholdAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thresholdAmount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thresholdAmount(thresholdAmount: JsonField<String>) = apply {
            body.thresholdAmount(thresholdAmount)
        }

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
         * Returns an immutable instance of [AutoRechargePrefUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AutoRechargePrefUpdateParams =
            AutoRechargePrefUpdateParams(
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
        private val enabled: JsonField<Boolean>,
        private val invoiceEnabled: JsonField<Boolean>,
        private val preference: JsonField<Preference>,
        private val rechargeAmount: JsonField<String>,
        private val thresholdAmount: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
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
            @JsonProperty("threshold_amount")
            @ExcludeMissing
            thresholdAmount: JsonField<String> = JsonMissing.of(),
        ) : this(
            enabled,
            invoiceEnabled,
            preference,
            rechargeAmount,
            thresholdAmount,
            mutableMapOf(),
        )

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
         * The threshold amount at which the account will be recharged.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun thresholdAmount(): Optional<String> = thresholdAmount.getOptional("threshold_amount")

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var enabled: JsonField<Boolean> = JsonMissing.of()
            private var invoiceEnabled: JsonField<Boolean> = JsonMissing.of()
            private var preference: JsonField<Preference> = JsonMissing.of()
            private var rechargeAmount: JsonField<String> = JsonMissing.of()
            private var thresholdAmount: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                enabled = body.enabled
                invoiceEnabled = body.invoiceEnabled
                preference = body.preference
                rechargeAmount = body.rechargeAmount
                thresholdAmount = body.thresholdAmount
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    enabled,
                    invoiceEnabled,
                    preference,
                    rechargeAmount,
                    thresholdAmount,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            enabled()
            invoiceEnabled()
            preference().ifPresent { it.validate() }
            rechargeAmount()
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
            (if (enabled.asKnown().isPresent) 1 else 0) +
                (if (invoiceEnabled.asKnown().isPresent) 1 else 0) +
                (preference.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rechargeAmount.asKnown().isPresent) 1 else 0) +
                (if (thresholdAmount.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                enabled == other.enabled &&
                invoiceEnabled == other.invoiceEnabled &&
                preference == other.preference &&
                rechargeAmount == other.rechargeAmount &&
                thresholdAmount == other.thresholdAmount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                enabled,
                invoiceEnabled,
                preference,
                rechargeAmount,
                thresholdAmount,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{enabled=$enabled, invoiceEnabled=$invoiceEnabled, preference=$preference, rechargeAmount=$rechargeAmount, thresholdAmount=$thresholdAmount, additionalProperties=$additionalProperties}"
    }

    /** The payment preference for auto recharge. */
    class Preference @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT_PAYPAL,
            ACH,
            /**
             * An enum member indicating that [Preference] was instantiated with an unknown value.
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
                CREDIT_PAYPAL -> Value.CREDIT_PAYPAL
                ACH -> Value.ACH
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
                CREDIT_PAYPAL -> Known.CREDIT_PAYPAL
                ACH -> Known.ACH
                else -> throw TelnyxInvalidDataException("Unknown Preference: $value")
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

        return other is AutoRechargePrefUpdateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AutoRechargePrefUpdateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
