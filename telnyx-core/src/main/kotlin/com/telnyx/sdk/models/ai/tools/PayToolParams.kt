// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PayToolParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val connectorName: JsonField<String>,
    private val connectorParameters: JsonField<ConnectorParameters>,
    private val currency: JsonField<String>,
    private val description: JsonField<String>,
    private val interDigitTimeoutMillis: JsonField<Long>,
    private val maxAttempts: JsonField<Long>,
    private val minPostalCodeLength: JsonField<Long>,
    private val paymentMethod: JsonField<String>,
    private val postalCode: JsonField<PostalCode>,
    private val prompts: JsonField<Prompts>,
    private val timeoutMillis: JsonField<Long>,
    private val validCardTypes: JsonField<List<ValidCardType>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("connector_name")
        @ExcludeMissing
        connectorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connector_parameters")
        @ExcludeMissing
        connectorParameters: JsonField<ConnectorParameters> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inter_digit_timeout_millis")
        @ExcludeMissing
        interDigitTimeoutMillis: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_attempts")
        @ExcludeMissing
        maxAttempts: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("min_postal_code_length")
        @ExcludeMissing
        minPostalCodeLength: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("payment_method")
        @ExcludeMissing
        paymentMethod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        postalCode: JsonField<PostalCode> = JsonMissing.of(),
        @JsonProperty("prompts") @ExcludeMissing prompts: JsonField<Prompts> = JsonMissing.of(),
        @JsonProperty("timeout_millis")
        @ExcludeMissing
        timeoutMillis: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("valid_card_types")
        @ExcludeMissing
        validCardTypes: JsonField<List<ValidCardType>> = JsonMissing.of(),
    ) : this(
        connectorName,
        connectorParameters,
        currency,
        description,
        interDigitTimeoutMillis,
        maxAttempts,
        minPostalCodeLength,
        paymentMethod,
        postalCode,
        prompts,
        timeoutMillis,
        validCardTypes,
        mutableMapOf(),
    )

    /**
     * The name of the pay connector configured in the Telnyx API. Must reference an existing pay
     * connector for this organization.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectorName(): String = connectorName.getRequired("connector_name")

    /**
     * Custom key/value parameters forwarded to the pay connector as `parameters` in the processor
     * request. String values may use `{{dynamic_variable}}` templating, resolved per call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectorParameters(): Optional<ConnectorParameters> =
        connectorParameters.getOptional("connector_parameters")

    /**
     * Default currency for payments processed by this tool.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * Description of the pay tool shown to the assistant so it knows when to call the tool. Not
     * sent to the payment connector — the per-call `description` argument the assistant passes is
     * what reaches the processor.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Time in milliseconds to wait between consecutive DTMF digits. Omitted means the platform
     * default (5000) applies.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interDigitTimeoutMillis(): Optional<Long> =
        interDigitTimeoutMillis.getOptional("inter_digit_timeout_millis")

    /**
     * Maximum number of attempts for each payment collection step. Omitted means the platform
     * default (3) applies.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxAttempts(): Optional<Long> = maxAttempts.getOptional("max_attempts")

    /**
     * Minimum number of digits the caller must enter when collecting a credit-card billing postal
     * code. Applies only when `postal_code` prompts the caller. Omitted means the platform default
     * (1) applies. The maximum number of digits collected is the greater of 10 and this value. This
     * does not validate the length of a postal code supplied directly in `postal_code`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minPostalCodeLength(): Optional<Long> =
        minPostalCodeLength.getOptional("min_postal_code_length")

    /**
     * Default payment method for payments processed by this tool.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentMethod(): Optional<String> = paymentMethod.getOptional("payment_method")

    /**
     * Controls billing postal code collection for credit-card payments. Set to `false` to skip the
     * postal code prompt without supplying a postal code to the payment connector (non-US cards,
     * e.g. Irish Eircodes). Set to `true` to prompt the caller. Supply a non-empty string, such as
     * `"90210"`, to use that postal code without prompting. This option does not affect ACH debit
     * payments or payments using an existing token.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postalCode(): Optional<PostalCode> = postalCode.getOptional("postal_code")

    /**
     * Custom text-to-speech prompts keyed by payment collection step. The AI assistant merges its
     * own card-number prompt into this map, matching on the same step keys.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prompts(): Optional<Prompts> = prompts.getOptional("prompts")

    /**
     * Time in milliseconds to wait for DTMF input for each collection step. Omitted means the
     * platform default (5000) applies. Increase this for slower entry, e.g. a 16-digit card number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutMillis(): Optional<Long> = timeoutMillis.getOptional("timeout_millis")

    /**
     * Restricts accepted card numbers to the listed card types. When the caller enters a card
     * number that does not match one of the listed types, Pay treats the input as invalid and
     * re-prompts for the card number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validCardTypes(): Optional<List<ValidCardType>> =
        validCardTypes.getOptional("valid_card_types")

    /**
     * Returns the raw JSON value of [connectorName].
     *
     * Unlike [connectorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connector_name")
    @ExcludeMissing
    fun _connectorName(): JsonField<String> = connectorName

    /**
     * Returns the raw JSON value of [connectorParameters].
     *
     * Unlike [connectorParameters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("connector_parameters")
    @ExcludeMissing
    fun _connectorParameters(): JsonField<ConnectorParameters> = connectorParameters

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [interDigitTimeoutMillis].
     *
     * Unlike [interDigitTimeoutMillis], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("inter_digit_timeout_millis")
    @ExcludeMissing
    fun _interDigitTimeoutMillis(): JsonField<Long> = interDigitTimeoutMillis

    /**
     * Returns the raw JSON value of [maxAttempts].
     *
     * Unlike [maxAttempts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_attempts") @ExcludeMissing fun _maxAttempts(): JsonField<Long> = maxAttempts

    /**
     * Returns the raw JSON value of [minPostalCodeLength].
     *
     * Unlike [minPostalCodeLength], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("min_postal_code_length")
    @ExcludeMissing
    fun _minPostalCodeLength(): JsonField<Long> = minPostalCodeLength

    /**
     * Returns the raw JSON value of [paymentMethod].
     *
     * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_method")
    @ExcludeMissing
    fun _paymentMethod(): JsonField<String> = paymentMethod

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postal_code")
    @ExcludeMissing
    fun _postalCode(): JsonField<PostalCode> = postalCode

    /**
     * Returns the raw JSON value of [prompts].
     *
     * Unlike [prompts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompts") @ExcludeMissing fun _prompts(): JsonField<Prompts> = prompts

    /**
     * Returns the raw JSON value of [timeoutMillis].
     *
     * Unlike [timeoutMillis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeout_millis")
    @ExcludeMissing
    fun _timeoutMillis(): JsonField<Long> = timeoutMillis

    /**
     * Returns the raw JSON value of [validCardTypes].
     *
     * Unlike [validCardTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valid_card_types")
    @ExcludeMissing
    fun _validCardTypes(): JsonField<List<ValidCardType>> = validCardTypes

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
         * Returns a mutable builder for constructing an instance of [PayToolParams].
         *
         * The following fields are required:
         * ```java
         * .connectorName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PayToolParams]. */
    class Builder internal constructor() {

        private var connectorName: JsonField<String>? = null
        private var connectorParameters: JsonField<ConnectorParameters> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var interDigitTimeoutMillis: JsonField<Long> = JsonMissing.of()
        private var maxAttempts: JsonField<Long> = JsonMissing.of()
        private var minPostalCodeLength: JsonField<Long> = JsonMissing.of()
        private var paymentMethod: JsonField<String> = JsonMissing.of()
        private var postalCode: JsonField<PostalCode> = JsonMissing.of()
        private var prompts: JsonField<Prompts> = JsonMissing.of()
        private var timeoutMillis: JsonField<Long> = JsonMissing.of()
        private var validCardTypes: JsonField<MutableList<ValidCardType>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payToolParams: PayToolParams) = apply {
            connectorName = payToolParams.connectorName
            connectorParameters = payToolParams.connectorParameters
            currency = payToolParams.currency
            description = payToolParams.description
            interDigitTimeoutMillis = payToolParams.interDigitTimeoutMillis
            maxAttempts = payToolParams.maxAttempts
            minPostalCodeLength = payToolParams.minPostalCodeLength
            paymentMethod = payToolParams.paymentMethod
            postalCode = payToolParams.postalCode
            prompts = payToolParams.prompts
            timeoutMillis = payToolParams.timeoutMillis
            validCardTypes = payToolParams.validCardTypes.map { it.toMutableList() }
            additionalProperties = payToolParams.additionalProperties.toMutableMap()
        }

        /**
         * The name of the pay connector configured in the Telnyx API. Must reference an existing
         * pay connector for this organization.
         */
        fun connectorName(connectorName: String) = connectorName(JsonField.of(connectorName))

        /**
         * Sets [Builder.connectorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectorName(connectorName: JsonField<String>) = apply {
            this.connectorName = connectorName
        }

        /**
         * Custom key/value parameters forwarded to the pay connector as `parameters` in the
         * processor request. String values may use `{{dynamic_variable}}` templating, resolved per
         * call.
         */
        fun connectorParameters(connectorParameters: ConnectorParameters) =
            connectorParameters(JsonField.of(connectorParameters))

        /**
         * Sets [Builder.connectorParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectorParameters] with a well-typed
         * [ConnectorParameters] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun connectorParameters(connectorParameters: JsonField<ConnectorParameters>) = apply {
            this.connectorParameters = connectorParameters
        }

        /** Default currency for payments processed by this tool. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * Description of the pay tool shown to the assistant so it knows when to call the tool. Not
         * sent to the payment connector — the per-call `description` argument the assistant passes
         * is what reaches the processor.
         */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * Time in milliseconds to wait between consecutive DTMF digits. Omitted means the platform
         * default (5000) applies.
         */
        fun interDigitTimeoutMillis(interDigitTimeoutMillis: Long) =
            interDigitTimeoutMillis(JsonField.of(interDigitTimeoutMillis))

        /**
         * Sets [Builder.interDigitTimeoutMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interDigitTimeoutMillis] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interDigitTimeoutMillis(interDigitTimeoutMillis: JsonField<Long>) = apply {
            this.interDigitTimeoutMillis = interDigitTimeoutMillis
        }

        /**
         * Maximum number of attempts for each payment collection step. Omitted means the platform
         * default (3) applies.
         */
        fun maxAttempts(maxAttempts: Long) = maxAttempts(JsonField.of(maxAttempts))

        /**
         * Sets [Builder.maxAttempts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxAttempts] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxAttempts(maxAttempts: JsonField<Long>) = apply { this.maxAttempts = maxAttempts }

        /**
         * Minimum number of digits the caller must enter when collecting a credit-card billing
         * postal code. Applies only when `postal_code` prompts the caller. Omitted means the
         * platform default (1) applies. The maximum number of digits collected is the greater of 10
         * and this value. This does not validate the length of a postal code supplied directly in
         * `postal_code`.
         */
        fun minPostalCodeLength(minPostalCodeLength: Long) =
            minPostalCodeLength(JsonField.of(minPostalCodeLength))

        /**
         * Sets [Builder.minPostalCodeLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minPostalCodeLength] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minPostalCodeLength(minPostalCodeLength: JsonField<Long>) = apply {
            this.minPostalCodeLength = minPostalCodeLength
        }

        /** Default payment method for payments processed by this tool. */
        fun paymentMethod(paymentMethod: String) = paymentMethod(JsonField.of(paymentMethod))

        /**
         * Sets [Builder.paymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentMethod] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentMethod(paymentMethod: JsonField<String>) = apply {
            this.paymentMethod = paymentMethod
        }

        /**
         * Controls billing postal code collection for credit-card payments. Set to `false` to skip
         * the postal code prompt without supplying a postal code to the payment connector (non-US
         * cards, e.g. Irish Eircodes). Set to `true` to prompt the caller. Supply a non-empty
         * string, such as `"90210"`, to use that postal code without prompting. This option does
         * not affect ACH debit payments or payments using an existing token.
         */
        fun postalCode(postalCode: PostalCode) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [PostalCode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun postalCode(postalCode: JsonField<PostalCode>) = apply { this.postalCode = postalCode }

        /** Alias for calling [postalCode] with `PostalCode.ofString(string)`. */
        fun postalCode(string: String) = postalCode(PostalCode.ofString(string))

        /** Alias for calling [postalCode] with `PostalCode.ofBool(bool)`. */
        fun postalCode(bool: Boolean) = postalCode(PostalCode.ofBool(bool))

        /**
         * Custom text-to-speech prompts keyed by payment collection step. The AI assistant merges
         * its own card-number prompt into this map, matching on the same step keys.
         */
        fun prompts(prompts: Prompts) = prompts(JsonField.of(prompts))

        /**
         * Sets [Builder.prompts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompts] with a well-typed [Prompts] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prompts(prompts: JsonField<Prompts>) = apply { this.prompts = prompts }

        /**
         * Time in milliseconds to wait for DTMF input for each collection step. Omitted means the
         * platform default (5000) applies. Increase this for slower entry, e.g. a 16-digit card
         * number.
         */
        fun timeoutMillis(timeoutMillis: Long) = timeoutMillis(JsonField.of(timeoutMillis))

        /**
         * Sets [Builder.timeoutMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutMillis] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeoutMillis(timeoutMillis: JsonField<Long>) = apply {
            this.timeoutMillis = timeoutMillis
        }

        /**
         * Restricts accepted card numbers to the listed card types. When the caller enters a card
         * number that does not match one of the listed types, Pay treats the input as invalid and
         * re-prompts for the card number.
         */
        fun validCardTypes(validCardTypes: List<ValidCardType>) =
            validCardTypes(JsonField.of(validCardTypes))

        /**
         * Sets [Builder.validCardTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validCardTypes] with a well-typed `List<ValidCardType>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun validCardTypes(validCardTypes: JsonField<List<ValidCardType>>) = apply {
            this.validCardTypes = validCardTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [ValidCardType] to [validCardTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addValidCardType(validCardType: ValidCardType) = apply {
            validCardTypes =
                (validCardTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("validCardTypes", it).add(validCardType)
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
         * Returns an immutable instance of [PayToolParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .connectorName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PayToolParams =
            PayToolParams(
                checkRequired("connectorName", connectorName),
                connectorParameters,
                currency,
                description,
                interDigitTimeoutMillis,
                maxAttempts,
                minPostalCodeLength,
                paymentMethod,
                postalCode,
                prompts,
                timeoutMillis,
                (validCardTypes ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PayToolParams = apply {
        if (validated) {
            return@apply
        }

        connectorName()
        connectorParameters().ifPresent { it.validate() }
        currency()
        description()
        interDigitTimeoutMillis()
        maxAttempts()
        minPostalCodeLength()
        paymentMethod()
        postalCode().ifPresent { it.validate() }
        prompts().ifPresent { it.validate() }
        timeoutMillis()
        validCardTypes().ifPresent { it.forEach { it.validate() } }
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
        (if (connectorName.asKnown().isPresent) 1 else 0) +
            (connectorParameters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (interDigitTimeoutMillis.asKnown().isPresent) 1 else 0) +
            (if (maxAttempts.asKnown().isPresent) 1 else 0) +
            (if (minPostalCodeLength.asKnown().isPresent) 1 else 0) +
            (if (paymentMethod.asKnown().isPresent) 1 else 0) +
            (postalCode.asKnown().getOrNull()?.validity() ?: 0) +
            (prompts.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timeoutMillis.asKnown().isPresent) 1 else 0) +
            (validCardTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * Custom key/value parameters forwarded to the pay connector as `parameters` in the processor
     * request. String values may use `{{dynamic_variable}}` templating, resolved per call.
     */
    class ConnectorParameters
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ConnectorParameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConnectorParameters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(connectorParameters: ConnectorParameters) = apply {
                additionalProperties = connectorParameters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ConnectorParameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ConnectorParameters =
                ConnectorParameters(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ConnectorParameters = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConnectorParameters &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ConnectorParameters{additionalProperties=$additionalProperties}"
    }

    /**
     * Controls billing postal code collection for credit-card payments. Set to `false` to skip the
     * postal code prompt without supplying a postal code to the payment connector (non-US cards,
     * e.g. Irish Eircodes). Set to `true` to prompt the caller. Supply a non-empty string, such as
     * `"90210"`, to use that postal code without prompting. This option does not affect ACH debit
     * payments or payments using an existing token.
     */
    @JsonDeserialize(using = PostalCode.Deserializer::class)
    @JsonSerialize(using = PostalCode.Serializer::class)
    class PostalCode
    private constructor(
        private val string: String? = null,
        private val bool: Boolean? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

        fun isString(): Boolean = string != null

        fun isBool(): Boolean = bool != null

        fun asString(): String = string.getOrThrow("string")

        fun asBool(): Boolean = bool.getOrThrow("bool")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = postalCode.accept(new PostalCode.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitString(String string) {
         *         return Optional.of(string.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                bool != null -> visitor.visitBool(bool)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PostalCode = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitBool(bool: Boolean) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitBool(bool: Boolean) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PostalCode && string == other.string && bool == other.bool
        }

        override fun hashCode(): Int = Objects.hash(string, bool)

        override fun toString(): String =
            when {
                string != null -> "PostalCode{string=$string}"
                bool != null -> "PostalCode{bool=$bool}"
                _json != null -> "PostalCode{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid PostalCode")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = PostalCode(string = string)

            @JvmStatic fun ofBool(bool: Boolean) = PostalCode(bool = bool)
        }

        /**
         * An interface that defines how to map each variant of [PostalCode] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitBool(bool: Boolean): T

            /**
             * Maps an unknown variant of [PostalCode] to a value of type [T].
             *
             * An instance of [PostalCode] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown PostalCode: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<PostalCode>(PostalCode::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): PostalCode {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                PostalCode(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                PostalCode(bool = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from integer).
                    0 -> PostalCode(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<PostalCode>(PostalCode::class) {

            override fun serialize(
                value: PostalCode,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.bool != null -> generator.writeObject(value.bool)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid PostalCode")
                }
            }
        }
    }

    /**
     * Custom text-to-speech prompts keyed by payment collection step. The AI assistant merges its
     * own card-number prompt into this map, matching on the same step keys.
     */
    class Prompts
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bankAccountNumber: JsonField<BankAccountNumber>,
        private val bankRoutingNumber: JsonField<BankRoutingNumber>,
        private val expirationDate: JsonField<ExpirationDate>,
        private val paymentCardNumber: JsonField<PaymentCardNumber>,
        private val postalCode: JsonField<PostalCode>,
        private val securityCode: JsonField<SecurityCode>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bank-account-number")
            @ExcludeMissing
            bankAccountNumber: JsonField<BankAccountNumber> = JsonMissing.of(),
            @JsonProperty("bank-routing-number")
            @ExcludeMissing
            bankRoutingNumber: JsonField<BankRoutingNumber> = JsonMissing.of(),
            @JsonProperty("expiration-date")
            @ExcludeMissing
            expirationDate: JsonField<ExpirationDate> = JsonMissing.of(),
            @JsonProperty("payment-card-number")
            @ExcludeMissing
            paymentCardNumber: JsonField<PaymentCardNumber> = JsonMissing.of(),
            @JsonProperty("postal-code")
            @ExcludeMissing
            postalCode: JsonField<PostalCode> = JsonMissing.of(),
            @JsonProperty("security-code")
            @ExcludeMissing
            securityCode: JsonField<SecurityCode> = JsonMissing.of(),
        ) : this(
            bankAccountNumber,
            bankRoutingNumber,
            expirationDate,
            paymentCardNumber,
            postalCode,
            securityCode,
            mutableMapOf(),
        )

        /**
         * A default prompt string or an ordered list of qualified prompts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bankAccountNumber(): Optional<BankAccountNumber> =
            bankAccountNumber.getOptional("bank-account-number")

        /**
         * A default prompt string or an ordered list of qualified prompts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bankRoutingNumber(): Optional<BankRoutingNumber> =
            bankRoutingNumber.getOptional("bank-routing-number")

        /**
         * A default prompt string or an ordered list of qualified prompts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expirationDate(): Optional<ExpirationDate> =
            expirationDate.getOptional("expiration-date")

        /**
         * A default prompt string or an ordered list of qualified prompts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentCardNumber(): Optional<PaymentCardNumber> =
            paymentCardNumber.getOptional("payment-card-number")

        /**
         * A default prompt string or an ordered list of qualified prompts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun postalCode(): Optional<PostalCode> = postalCode.getOptional("postal-code")

        /**
         * A default prompt string or an ordered list of qualified prompts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun securityCode(): Optional<SecurityCode> = securityCode.getOptional("security-code")

        /**
         * Returns the raw JSON value of [bankAccountNumber].
         *
         * Unlike [bankAccountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bank-account-number")
        @ExcludeMissing
        fun _bankAccountNumber(): JsonField<BankAccountNumber> = bankAccountNumber

        /**
         * Returns the raw JSON value of [bankRoutingNumber].
         *
         * Unlike [bankRoutingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bank-routing-number")
        @ExcludeMissing
        fun _bankRoutingNumber(): JsonField<BankRoutingNumber> = bankRoutingNumber

        /**
         * Returns the raw JSON value of [expirationDate].
         *
         * Unlike [expirationDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expiration-date")
        @ExcludeMissing
        fun _expirationDate(): JsonField<ExpirationDate> = expirationDate

        /**
         * Returns the raw JSON value of [paymentCardNumber].
         *
         * Unlike [paymentCardNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment-card-number")
        @ExcludeMissing
        fun _paymentCardNumber(): JsonField<PaymentCardNumber> = paymentCardNumber

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal-code")
        @ExcludeMissing
        fun _postalCode(): JsonField<PostalCode> = postalCode

        /**
         * Returns the raw JSON value of [securityCode].
         *
         * Unlike [securityCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("security-code")
        @ExcludeMissing
        fun _securityCode(): JsonField<SecurityCode> = securityCode

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

            /** Returns a mutable builder for constructing an instance of [Prompts]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Prompts]. */
        class Builder internal constructor() {

            private var bankAccountNumber: JsonField<BankAccountNumber> = JsonMissing.of()
            private var bankRoutingNumber: JsonField<BankRoutingNumber> = JsonMissing.of()
            private var expirationDate: JsonField<ExpirationDate> = JsonMissing.of()
            private var paymentCardNumber: JsonField<PaymentCardNumber> = JsonMissing.of()
            private var postalCode: JsonField<PostalCode> = JsonMissing.of()
            private var securityCode: JsonField<SecurityCode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(prompts: Prompts) = apply {
                bankAccountNumber = prompts.bankAccountNumber
                bankRoutingNumber = prompts.bankRoutingNumber
                expirationDate = prompts.expirationDate
                paymentCardNumber = prompts.paymentCardNumber
                postalCode = prompts.postalCode
                securityCode = prompts.securityCode
                additionalProperties = prompts.additionalProperties.toMutableMap()
            }

            /** A default prompt string or an ordered list of qualified prompts. */
            fun bankAccountNumber(bankAccountNumber: BankAccountNumber) =
                bankAccountNumber(JsonField.of(bankAccountNumber))

            /**
             * Sets [Builder.bankAccountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankAccountNumber] with a well-typed
             * [BankAccountNumber] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun bankAccountNumber(bankAccountNumber: JsonField<BankAccountNumber>) = apply {
                this.bankAccountNumber = bankAccountNumber
            }

            /** Alias for calling [bankAccountNumber] with `BankAccountNumber.ofString(string)`. */
            fun bankAccountNumber(string: String) =
                bankAccountNumber(BankAccountNumber.ofString(string))

            /**
             * Alias for calling [bankAccountNumber] with
             * `BankAccountNumber.ofPayToolPrompts(payToolPrompts)`.
             */
            fun bankAccountNumberOfPayToolPrompts(
                payToolPrompts: List<BankAccountNumber.PayToolPrompt>
            ) = bankAccountNumber(BankAccountNumber.ofPayToolPrompts(payToolPrompts))

            /** A default prompt string or an ordered list of qualified prompts. */
            fun bankRoutingNumber(bankRoutingNumber: BankRoutingNumber) =
                bankRoutingNumber(JsonField.of(bankRoutingNumber))

            /**
             * Sets [Builder.bankRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankRoutingNumber] with a well-typed
             * [BankRoutingNumber] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun bankRoutingNumber(bankRoutingNumber: JsonField<BankRoutingNumber>) = apply {
                this.bankRoutingNumber = bankRoutingNumber
            }

            /** Alias for calling [bankRoutingNumber] with `BankRoutingNumber.ofString(string)`. */
            fun bankRoutingNumber(string: String) =
                bankRoutingNumber(BankRoutingNumber.ofString(string))

            /**
             * Alias for calling [bankRoutingNumber] with
             * `BankRoutingNumber.ofPayToolPrompts(payToolPrompts)`.
             */
            fun bankRoutingNumberOfPayToolPrompts(
                payToolPrompts: List<BankRoutingNumber.PayToolPrompt>
            ) = bankRoutingNumber(BankRoutingNumber.ofPayToolPrompts(payToolPrompts))

            /** A default prompt string or an ordered list of qualified prompts. */
            fun expirationDate(expirationDate: ExpirationDate) =
                expirationDate(JsonField.of(expirationDate))

            /**
             * Sets [Builder.expirationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expirationDate] with a well-typed [ExpirationDate]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun expirationDate(expirationDate: JsonField<ExpirationDate>) = apply {
                this.expirationDate = expirationDate
            }

            /** Alias for calling [expirationDate] with `ExpirationDate.ofString(string)`. */
            fun expirationDate(string: String) = expirationDate(ExpirationDate.ofString(string))

            /**
             * Alias for calling [expirationDate] with
             * `ExpirationDate.ofPayToolPrompts(payToolPrompts)`.
             */
            fun expirationDateOfPayToolPrompts(payToolPrompts: List<ExpirationDate.PayToolPrompt>) =
                expirationDate(ExpirationDate.ofPayToolPrompts(payToolPrompts))

            /** A default prompt string or an ordered list of qualified prompts. */
            fun paymentCardNumber(paymentCardNumber: PaymentCardNumber) =
                paymentCardNumber(JsonField.of(paymentCardNumber))

            /**
             * Sets [Builder.paymentCardNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentCardNumber] with a well-typed
             * [PaymentCardNumber] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun paymentCardNumber(paymentCardNumber: JsonField<PaymentCardNumber>) = apply {
                this.paymentCardNumber = paymentCardNumber
            }

            /** Alias for calling [paymentCardNumber] with `PaymentCardNumber.ofString(string)`. */
            fun paymentCardNumber(string: String) =
                paymentCardNumber(PaymentCardNumber.ofString(string))

            /**
             * Alias for calling [paymentCardNumber] with
             * `PaymentCardNumber.ofPayToolPrompts(payToolPrompts)`.
             */
            fun paymentCardNumberOfPayToolPrompts(
                payToolPrompts: List<PaymentCardNumber.PayToolPrompt>
            ) = paymentCardNumber(PaymentCardNumber.ofPayToolPrompts(payToolPrompts))

            /** A default prompt string or an ordered list of qualified prompts. */
            fun postalCode(postalCode: PostalCode) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [PostalCode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<PostalCode>) = apply {
                this.postalCode = postalCode
            }

            /** Alias for calling [postalCode] with `PostalCode.ofString(string)`. */
            fun postalCode(string: String) = postalCode(PostalCode.ofString(string))

            /**
             * Alias for calling [postalCode] with `PostalCode.ofPayToolPrompts(payToolPrompts)`.
             */
            fun postalCodeOfPayToolPrompts(payToolPrompts: List<PostalCode.PayToolPrompt>) =
                postalCode(PostalCode.ofPayToolPrompts(payToolPrompts))

            /** A default prompt string or an ordered list of qualified prompts. */
            fun securityCode(securityCode: SecurityCode) = securityCode(JsonField.of(securityCode))

            /**
             * Sets [Builder.securityCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.securityCode] with a well-typed [SecurityCode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun securityCode(securityCode: JsonField<SecurityCode>) = apply {
                this.securityCode = securityCode
            }

            /** Alias for calling [securityCode] with `SecurityCode.ofString(string)`. */
            fun securityCode(string: String) = securityCode(SecurityCode.ofString(string))

            /**
             * Alias for calling [securityCode] with
             * `SecurityCode.ofPayToolPrompts(payToolPrompts)`.
             */
            fun securityCodeOfPayToolPrompts(payToolPrompts: List<SecurityCode.PayToolPrompt>) =
                securityCode(SecurityCode.ofPayToolPrompts(payToolPrompts))

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
             * Returns an immutable instance of [Prompts].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Prompts =
                Prompts(
                    bankAccountNumber,
                    bankRoutingNumber,
                    expirationDate,
                    paymentCardNumber,
                    postalCode,
                    securityCode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Prompts = apply {
            if (validated) {
                return@apply
            }

            bankAccountNumber().ifPresent { it.validate() }
            bankRoutingNumber().ifPresent { it.validate() }
            expirationDate().ifPresent { it.validate() }
            paymentCardNumber().ifPresent { it.validate() }
            postalCode().ifPresent { it.validate() }
            securityCode().ifPresent { it.validate() }
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
            (bankAccountNumber.asKnown().getOrNull()?.validity() ?: 0) +
                (bankRoutingNumber.asKnown().getOrNull()?.validity() ?: 0) +
                (expirationDate.asKnown().getOrNull()?.validity() ?: 0) +
                (paymentCardNumber.asKnown().getOrNull()?.validity() ?: 0) +
                (postalCode.asKnown().getOrNull()?.validity() ?: 0) +
                (securityCode.asKnown().getOrNull()?.validity() ?: 0)

        /** A default prompt string or an ordered list of qualified prompts. */
        @JsonDeserialize(using = BankAccountNumber.Deserializer::class)
        @JsonSerialize(using = BankAccountNumber.Serializer::class)
        class BankAccountNumber
        private constructor(
            private val string: String? = null,
            private val payToolPrompts: List<PayToolPrompt>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun payToolPrompts(): Optional<List<PayToolPrompt>> =
                Optional.ofNullable(payToolPrompts)

            fun isString(): Boolean = string != null

            fun isPayToolPrompts(): Boolean = payToolPrompts != null

            fun asString(): String = string.getOrThrow("string")

            fun asPayToolPrompts(): List<PayToolPrompt> =
                payToolPrompts.getOrThrow("payToolPrompts")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = bankAccountNumber.accept(new BankAccountNumber.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitString(String string) {
             *         return Optional.of(string.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    payToolPrompts != null -> visitor.visitPayToolPrompts(payToolPrompts)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): BankAccountNumber = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>) {
                            payToolPrompts.forEach { it.validate() }
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>) =
                            payToolPrompts.sumOf { it.validity().toInt() }

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BankAccountNumber &&
                    string == other.string &&
                    payToolPrompts == other.payToolPrompts
            }

            override fun hashCode(): Int = Objects.hash(string, payToolPrompts)

            override fun toString(): String =
                when {
                    string != null -> "BankAccountNumber{string=$string}"
                    payToolPrompts != null -> "BankAccountNumber{payToolPrompts=$payToolPrompts}"
                    _json != null -> "BankAccountNumber{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid BankAccountNumber")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = BankAccountNumber(string = string)

                @JvmStatic
                fun ofPayToolPrompts(payToolPrompts: List<PayToolPrompt>) =
                    BankAccountNumber(payToolPrompts = payToolPrompts.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [BankAccountNumber] to a value
             * of type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>): T

                /**
                 * Maps an unknown variant of [BankAccountNumber] to a value of type [T].
                 *
                 * An instance of [BankAccountNumber] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown BankAccountNumber: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<BankAccountNumber>(BankAccountNumber::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): BankAccountNumber {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    BankAccountNumber(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<PayToolPrompt>>())?.let {
                                    BankAccountNumber(payToolPrompts = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> BankAccountNumber(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer :
                BaseSerializer<BankAccountNumber>(BankAccountNumber::class) {

                override fun serialize(
                    value: BankAccountNumber,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.payToolPrompts != null -> generator.writeObject(value.payToolPrompts)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid BankAccountNumber")
                    }
                }
            }

            /**
             * A text-to-speech prompt with optional matching qualifiers, mirroring the Voice API
             * PayPrompt schema.
             */
            class PayToolPrompt
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val text: JsonField<String>,
                private val attempt: JsonField<String>,
                private val cardType: JsonField<CardType>,
                private val errorType: JsonField<ErrorType>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("text")
                    @ExcludeMissing
                    text: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("attempt")
                    @ExcludeMissing
                    attempt: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("card_type")
                    @ExcludeMissing
                    cardType: JsonField<CardType> = JsonMissing.of(),
                    @JsonProperty("error_type")
                    @ExcludeMissing
                    errorType: JsonField<ErrorType> = JsonMissing.of(),
                ) : this(text, attempt, cardType, errorType, mutableMapOf())

                /**
                 * Text spoken for the payment collection step.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun text(): String = text.getRequired("text")

                /**
                 * Space-separated 1-based attempt numbers (1-9 followed by digits only, e.g. `"2
                 * 3"`) for which this prompt applies. A prompt qualified with an attempt number
                 * above `max_attempts` (default 3) is rejected at write time — it could never play.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun attempt(): Optional<String> = attempt.getOptional("attempt")

                /**
                 * Lowercase, case-sensitive detected card type for which this prompt applies.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun cardType(): Optional<CardType> = cardType.getOptional("card_type")

                /**
                 * Step error for which this prompt applies.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun errorType(): Optional<ErrorType> = errorType.getOptional("error_type")

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                /**
                 * Returns the raw JSON value of [attempt].
                 *
                 * Unlike [attempt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("attempt") @ExcludeMissing fun _attempt(): JsonField<String> = attempt

                /**
                 * Returns the raw JSON value of [cardType].
                 *
                 * Unlike [cardType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("card_type")
                @ExcludeMissing
                fun _cardType(): JsonField<CardType> = cardType

                /**
                 * Returns the raw JSON value of [errorType].
                 *
                 * Unlike [errorType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error_type")
                @ExcludeMissing
                fun _errorType(): JsonField<ErrorType> = errorType

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
                     * Returns a mutable builder for constructing an instance of [PayToolPrompt].
                     *
                     * The following fields are required:
                     * ```java
                     * .text()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PayToolPrompt]. */
                class Builder internal constructor() {

                    private var text: JsonField<String>? = null
                    private var attempt: JsonField<String> = JsonMissing.of()
                    private var cardType: JsonField<CardType> = JsonMissing.of()
                    private var errorType: JsonField<ErrorType> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(payToolPrompt: PayToolPrompt) = apply {
                        text = payToolPrompt.text
                        attempt = payToolPrompt.attempt
                        cardType = payToolPrompt.cardType
                        errorType = payToolPrompt.errorType
                        additionalProperties = payToolPrompt.additionalProperties.toMutableMap()
                    }

                    /** Text spoken for the payment collection step. */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

                    /**
                     * Space-separated 1-based attempt numbers (1-9 followed by digits only, e.g.
                     * `"2 3"`) for which this prompt applies. A prompt qualified with an attempt
                     * number above `max_attempts` (default 3) is rejected at write time — it could
                     * never play.
                     */
                    fun attempt(attempt: String) = attempt(JsonField.of(attempt))

                    /**
                     * Sets [Builder.attempt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attempt] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun attempt(attempt: JsonField<String>) = apply { this.attempt = attempt }

                    /**
                     * Lowercase, case-sensitive detected card type for which this prompt applies.
                     */
                    fun cardType(cardType: CardType) = cardType(JsonField.of(cardType))

                    /**
                     * Sets [Builder.cardType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cardType] with a well-typed [CardType] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cardType(cardType: JsonField<CardType>) = apply { this.cardType = cardType }

                    /** Step error for which this prompt applies. */
                    fun errorType(errorType: ErrorType) = errorType(JsonField.of(errorType))

                    /**
                     * Sets [Builder.errorType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.errorType] with a well-typed [ErrorType]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun errorType(errorType: JsonField<ErrorType>) = apply {
                        this.errorType = errorType
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [PayToolPrompt].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .text()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PayToolPrompt =
                        PayToolPrompt(
                            checkRequired("text", text),
                            attempt,
                            cardType,
                            errorType,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): PayToolPrompt = apply {
                    if (validated) {
                        return@apply
                    }

                    text()
                    attempt()
                    cardType().ifPresent { it.validate() }
                    errorType().ifPresent { it.validate() }
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
                    (if (text.asKnown().isPresent) 1 else 0) +
                        (if (attempt.asKnown().isPresent) 1 else 0) +
                        (cardType.asKnown().getOrNull()?.validity() ?: 0) +
                        (errorType.asKnown().getOrNull()?.validity() ?: 0)

                /** Lowercase, case-sensitive detected card type for which this prompt applies. */
                class CardType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val VISA = of("visa")

                        @JvmField val MASTERCARD = of("mastercard")

                        @JvmField val AMEX = of("amex")

                        @JvmField val OPTIMA = of("optima")

                        @JvmField val DISCOVER = of("discover")

                        @JvmField val DINERS_CLUB = of("diners-club")

                        @JvmField val JCB = of("jcb")

                        @JvmField val MAESTRO = of("maestro")

                        @JvmField val ENROUTE = of("enroute")

                        @JvmStatic fun of(value: String) = CardType(JsonField.of(value))
                    }

                    /** An enum containing [CardType]'s known values. */
                    enum class Known {
                        VISA,
                        MASTERCARD,
                        AMEX,
                        OPTIMA,
                        DISCOVER,
                        DINERS_CLUB,
                        JCB,
                        MAESTRO,
                        ENROUTE,
                    }

                    /**
                     * An enum containing [CardType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [CardType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        VISA,
                        MASTERCARD,
                        AMEX,
                        OPTIMA,
                        DISCOVER,
                        DINERS_CLUB,
                        JCB,
                        MAESTRO,
                        ENROUTE,
                        /**
                         * An enum member indicating that [CardType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            VISA -> Value.VISA
                            MASTERCARD -> Value.MASTERCARD
                            AMEX -> Value.AMEX
                            OPTIMA -> Value.OPTIMA
                            DISCOVER -> Value.DISCOVER
                            DINERS_CLUB -> Value.DINERS_CLUB
                            JCB -> Value.JCB
                            MAESTRO -> Value.MAESTRO
                            ENROUTE -> Value.ENROUTE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            VISA -> Known.VISA
                            MASTERCARD -> Known.MASTERCARD
                            AMEX -> Known.AMEX
                            OPTIMA -> Known.OPTIMA
                            DISCOVER -> Known.DISCOVER
                            DINERS_CLUB -> Known.DINERS_CLUB
                            JCB -> Known.JCB
                            MAESTRO -> Known.MAESTRO
                            ENROUTE -> Known.ENROUTE
                            else -> throw TelnyxInvalidDataException("Unknown CardType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): CardType = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CardType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Step error for which this prompt applies. */
                class ErrorType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val TIMEOUT = of("timeout")

                        @JvmField val INVALID_CARD_NUMBER = of("invalid-card-number")

                        @JvmField val INVALID_CARD_TYPE = of("invalid-card-type")

                        @JvmField val INVALID_DATE = of("invalid-date")

                        @JvmField val INVALID_SECURITY_CODE = of("invalid-security-code")

                        @JvmField val INVALID_POSTAL_CODE = of("invalid-postal-code")

                        @JvmField
                        val INVALID_BANK_ROUTING_NUMBER = of("invalid-bank-routing-number")

                        @JvmField
                        val INVALID_BANK_ACCOUNT_NUMBER = of("invalid-bank-account-number")

                        @JvmField val INPUT_MATCHING_FAILED = of("input-matching-failed")

                        @JvmStatic fun of(value: String) = ErrorType(JsonField.of(value))
                    }

                    /** An enum containing [ErrorType]'s known values. */
                    enum class Known {
                        TIMEOUT,
                        INVALID_CARD_NUMBER,
                        INVALID_CARD_TYPE,
                        INVALID_DATE,
                        INVALID_SECURITY_CODE,
                        INVALID_POSTAL_CODE,
                        INVALID_BANK_ROUTING_NUMBER,
                        INVALID_BANK_ACCOUNT_NUMBER,
                        INPUT_MATCHING_FAILED,
                    }

                    /**
                     * An enum containing [ErrorType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ErrorType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        TIMEOUT,
                        INVALID_CARD_NUMBER,
                        INVALID_CARD_TYPE,
                        INVALID_DATE,
                        INVALID_SECURITY_CODE,
                        INVALID_POSTAL_CODE,
                        INVALID_BANK_ROUTING_NUMBER,
                        INVALID_BANK_ACCOUNT_NUMBER,
                        INPUT_MATCHING_FAILED,
                        /**
                         * An enum member indicating that [ErrorType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            TIMEOUT -> Value.TIMEOUT
                            INVALID_CARD_NUMBER -> Value.INVALID_CARD_NUMBER
                            INVALID_CARD_TYPE -> Value.INVALID_CARD_TYPE
                            INVALID_DATE -> Value.INVALID_DATE
                            INVALID_SECURITY_CODE -> Value.INVALID_SECURITY_CODE
                            INVALID_POSTAL_CODE -> Value.INVALID_POSTAL_CODE
                            INVALID_BANK_ROUTING_NUMBER -> Value.INVALID_BANK_ROUTING_NUMBER
                            INVALID_BANK_ACCOUNT_NUMBER -> Value.INVALID_BANK_ACCOUNT_NUMBER
                            INPUT_MATCHING_FAILED -> Value.INPUT_MATCHING_FAILED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            TIMEOUT -> Known.TIMEOUT
                            INVALID_CARD_NUMBER -> Known.INVALID_CARD_NUMBER
                            INVALID_CARD_TYPE -> Known.INVALID_CARD_TYPE
                            INVALID_DATE -> Known.INVALID_DATE
                            INVALID_SECURITY_CODE -> Known.INVALID_SECURITY_CODE
                            INVALID_POSTAL_CODE -> Known.INVALID_POSTAL_CODE
                            INVALID_BANK_ROUTING_NUMBER -> Known.INVALID_BANK_ROUTING_NUMBER
                            INVALID_BANK_ACCOUNT_NUMBER -> Known.INVALID_BANK_ACCOUNT_NUMBER
                            INPUT_MATCHING_FAILED -> Known.INPUT_MATCHING_FAILED
                            else -> throw TelnyxInvalidDataException("Unknown ErrorType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): ErrorType = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ErrorType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PayToolPrompt &&
                        text == other.text &&
                        attempt == other.attempt &&
                        cardType == other.cardType &&
                        errorType == other.errorType &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(text, attempt, cardType, errorType, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PayToolPrompt{text=$text, attempt=$attempt, cardType=$cardType, errorType=$errorType, additionalProperties=$additionalProperties}"
            }
        }

        /** A default prompt string or an ordered list of qualified prompts. */
        @JsonDeserialize(using = BankRoutingNumber.Deserializer::class)
        @JsonSerialize(using = BankRoutingNumber.Serializer::class)
        class BankRoutingNumber
        private constructor(
            private val string: String? = null,
            private val payToolPrompts: List<PayToolPrompt>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun payToolPrompts(): Optional<List<PayToolPrompt>> =
                Optional.ofNullable(payToolPrompts)

            fun isString(): Boolean = string != null

            fun isPayToolPrompts(): Boolean = payToolPrompts != null

            fun asString(): String = string.getOrThrow("string")

            fun asPayToolPrompts(): List<PayToolPrompt> =
                payToolPrompts.getOrThrow("payToolPrompts")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = bankRoutingNumber.accept(new BankRoutingNumber.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitString(String string) {
             *         return Optional.of(string.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    payToolPrompts != null -> visitor.visitPayToolPrompts(payToolPrompts)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): BankRoutingNumber = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>) {
                            payToolPrompts.forEach { it.validate() }
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>) =
                            payToolPrompts.sumOf { it.validity().toInt() }

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BankRoutingNumber &&
                    string == other.string &&
                    payToolPrompts == other.payToolPrompts
            }

            override fun hashCode(): Int = Objects.hash(string, payToolPrompts)

            override fun toString(): String =
                when {
                    string != null -> "BankRoutingNumber{string=$string}"
                    payToolPrompts != null -> "BankRoutingNumber{payToolPrompts=$payToolPrompts}"
                    _json != null -> "BankRoutingNumber{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid BankRoutingNumber")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = BankRoutingNumber(string = string)

                @JvmStatic
                fun ofPayToolPrompts(payToolPrompts: List<PayToolPrompt>) =
                    BankRoutingNumber(payToolPrompts = payToolPrompts.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [BankRoutingNumber] to a value
             * of type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>): T

                /**
                 * Maps an unknown variant of [BankRoutingNumber] to a value of type [T].
                 *
                 * An instance of [BankRoutingNumber] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown BankRoutingNumber: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<BankRoutingNumber>(BankRoutingNumber::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): BankRoutingNumber {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    BankRoutingNumber(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<PayToolPrompt>>())?.let {
                                    BankRoutingNumber(payToolPrompts = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> BankRoutingNumber(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer :
                BaseSerializer<BankRoutingNumber>(BankRoutingNumber::class) {

                override fun serialize(
                    value: BankRoutingNumber,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.payToolPrompts != null -> generator.writeObject(value.payToolPrompts)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid BankRoutingNumber")
                    }
                }
            }

            /**
             * A text-to-speech prompt with optional matching qualifiers, mirroring the Voice API
             * PayPrompt schema.
             */
            class PayToolPrompt
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val text: JsonField<String>,
                private val attempt: JsonField<String>,
                private val cardType: JsonField<CardType>,
                private val errorType: JsonField<ErrorType>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("text")
                    @ExcludeMissing
                    text: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("attempt")
                    @ExcludeMissing
                    attempt: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("card_type")
                    @ExcludeMissing
                    cardType: JsonField<CardType> = JsonMissing.of(),
                    @JsonProperty("error_type")
                    @ExcludeMissing
                    errorType: JsonField<ErrorType> = JsonMissing.of(),
                ) : this(text, attempt, cardType, errorType, mutableMapOf())

                /**
                 * Text spoken for the payment collection step.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun text(): String = text.getRequired("text")

                /**
                 * Space-separated 1-based attempt numbers (1-9 followed by digits only, e.g. `"2
                 * 3"`) for which this prompt applies. A prompt qualified with an attempt number
                 * above `max_attempts` (default 3) is rejected at write time — it could never play.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun attempt(): Optional<String> = attempt.getOptional("attempt")

                /**
                 * Lowercase, case-sensitive detected card type for which this prompt applies.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun cardType(): Optional<CardType> = cardType.getOptional("card_type")

                /**
                 * Step error for which this prompt applies.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun errorType(): Optional<ErrorType> = errorType.getOptional("error_type")

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                /**
                 * Returns the raw JSON value of [attempt].
                 *
                 * Unlike [attempt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("attempt") @ExcludeMissing fun _attempt(): JsonField<String> = attempt

                /**
                 * Returns the raw JSON value of [cardType].
                 *
                 * Unlike [cardType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("card_type")
                @ExcludeMissing
                fun _cardType(): JsonField<CardType> = cardType

                /**
                 * Returns the raw JSON value of [errorType].
                 *
                 * Unlike [errorType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error_type")
                @ExcludeMissing
                fun _errorType(): JsonField<ErrorType> = errorType

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
                     * Returns a mutable builder for constructing an instance of [PayToolPrompt].
                     *
                     * The following fields are required:
                     * ```java
                     * .text()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PayToolPrompt]. */
                class Builder internal constructor() {

                    private var text: JsonField<String>? = null
                    private var attempt: JsonField<String> = JsonMissing.of()
                    private var cardType: JsonField<CardType> = JsonMissing.of()
                    private var errorType: JsonField<ErrorType> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(payToolPrompt: PayToolPrompt) = apply {
                        text = payToolPrompt.text
                        attempt = payToolPrompt.attempt
                        cardType = payToolPrompt.cardType
                        errorType = payToolPrompt.errorType
                        additionalProperties = payToolPrompt.additionalProperties.toMutableMap()
                    }

                    /** Text spoken for the payment collection step. */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

                    /**
                     * Space-separated 1-based attempt numbers (1-9 followed by digits only, e.g.
                     * `"2 3"`) for which this prompt applies. A prompt qualified with an attempt
                     * number above `max_attempts` (default 3) is rejected at write time — it could
                     * never play.
                     */
                    fun attempt(attempt: String) = attempt(JsonField.of(attempt))

                    /**
                     * Sets [Builder.attempt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attempt] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun attempt(attempt: JsonField<String>) = apply { this.attempt = attempt }

                    /**
                     * Lowercase, case-sensitive detected card type for which this prompt applies.
                     */
                    fun cardType(cardType: CardType) = cardType(JsonField.of(cardType))

                    /**
                     * Sets [Builder.cardType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cardType] with a well-typed [CardType] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cardType(cardType: JsonField<CardType>) = apply { this.cardType = cardType }

                    /** Step error for which this prompt applies. */
                    fun errorType(errorType: ErrorType) = errorType(JsonField.of(errorType))

                    /**
                     * Sets [Builder.errorType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.errorType] with a well-typed [ErrorType]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun errorType(errorType: JsonField<ErrorType>) = apply {
                        this.errorType = errorType
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [PayToolPrompt].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .text()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PayToolPrompt =
                        PayToolPrompt(
                            checkRequired("text", text),
                            attempt,
                            cardType,
                            errorType,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): PayToolPrompt = apply {
                    if (validated) {
                        return@apply
                    }

                    text()
                    attempt()
                    cardType().ifPresent { it.validate() }
                    errorType().ifPresent { it.validate() }
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
                    (if (text.asKnown().isPresent) 1 else 0) +
                        (if (attempt.asKnown().isPresent) 1 else 0) +
                        (cardType.asKnown().getOrNull()?.validity() ?: 0) +
                        (errorType.asKnown().getOrNull()?.validity() ?: 0)

                /** Lowercase, case-sensitive detected card type for which this prompt applies. */
                class CardType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val VISA = of("visa")

                        @JvmField val MASTERCARD = of("mastercard")

                        @JvmField val AMEX = of("amex")

                        @JvmField val OPTIMA = of("optima")

                        @JvmField val DISCOVER = of("discover")

                        @JvmField val DINERS_CLUB = of("diners-club")

                        @JvmField val JCB = of("jcb")

                        @JvmField val MAESTRO = of("maestro")

                        @JvmField val ENROUTE = of("enroute")

                        @JvmStatic fun of(value: String) = CardType(JsonField.of(value))
                    }

                    /** An enum containing [CardType]'s known values. */
                    enum class Known {
                        VISA,
                        MASTERCARD,
                        AMEX,
                        OPTIMA,
                        DISCOVER,
                        DINERS_CLUB,
                        JCB,
                        MAESTRO,
                        ENROUTE,
                    }

                    /**
                     * An enum containing [CardType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [CardType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        VISA,
                        MASTERCARD,
                        AMEX,
                        OPTIMA,
                        DISCOVER,
                        DINERS_CLUB,
                        JCB,
                        MAESTRO,
                        ENROUTE,
                        /**
                         * An enum member indicating that [CardType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            VISA -> Value.VISA
                            MASTERCARD -> Value.MASTERCARD
                            AMEX -> Value.AMEX
                            OPTIMA -> Value.OPTIMA
                            DISCOVER -> Value.DISCOVER
                            DINERS_CLUB -> Value.DINERS_CLUB
                            JCB -> Value.JCB
                            MAESTRO -> Value.MAESTRO
                            ENROUTE -> Value.ENROUTE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            VISA -> Known.VISA
                            MASTERCARD -> Known.MASTERCARD
                            AMEX -> Known.AMEX
                            OPTIMA -> Known.OPTIMA
                            DISCOVER -> Known.DISCOVER
                            DINERS_CLUB -> Known.DINERS_CLUB
                            JCB -> Known.JCB
                            MAESTRO -> Known.MAESTRO
                            ENROUTE -> Known.ENROUTE
                            else -> throw TelnyxInvalidDataException("Unknown CardType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): CardType = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CardType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Step error for which this prompt applies. */
                class ErrorType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val TIMEOUT = of("timeout")

                        @JvmField val INVALID_CARD_NUMBER = of("invalid-card-number")

                        @JvmField val INVALID_CARD_TYPE = of("invalid-card-type")

                        @JvmField val INVALID_DATE = of("invalid-date")

                        @JvmField val INVALID_SECURITY_CODE = of("invalid-security-code")

                        @JvmField val INVALID_POSTAL_CODE = of("invalid-postal-code")

                        @JvmField
                        val INVALID_BANK_ROUTING_NUMBER = of("invalid-bank-routing-number")

                        @JvmField
                        val INVALID_BANK_ACCOUNT_NUMBER = of("invalid-bank-account-number")

                        @JvmField val INPUT_MATCHING_FAILED = of("input-matching-failed")

                        @JvmStatic fun of(value: String) = ErrorType(JsonField.of(value))
                    }

                    /** An enum containing [ErrorType]'s known values. */
                    enum class Known {
                        TIMEOUT,
                        INVALID_CARD_NUMBER,
                        INVALID_CARD_TYPE,
                        INVALID_DATE,
                        INVALID_SECURITY_CODE,
                        INVALID_POSTAL_CODE,
                        INVALID_BANK_ROUTING_NUMBER,
                        INVALID_BANK_ACCOUNT_NUMBER,
                        INPUT_MATCHING_FAILED,
                    }

                    /**
                     * An enum containing [ErrorType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ErrorType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        TIMEOUT,
                        INVALID_CARD_NUMBER,
                        INVALID_CARD_TYPE,
                        INVALID_DATE,
                        INVALID_SECURITY_CODE,
                        INVALID_POSTAL_CODE,
                        INVALID_BANK_ROUTING_NUMBER,
                        INVALID_BANK_ACCOUNT_NUMBER,
                        INPUT_MATCHING_FAILED,
                        /**
                         * An enum member indicating that [ErrorType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            TIMEOUT -> Value.TIMEOUT
                            INVALID_CARD_NUMBER -> Value.INVALID_CARD_NUMBER
                            INVALID_CARD_TYPE -> Value.INVALID_CARD_TYPE
                            INVALID_DATE -> Value.INVALID_DATE
                            INVALID_SECURITY_CODE -> Value.INVALID_SECURITY_CODE
                            INVALID_POSTAL_CODE -> Value.INVALID_POSTAL_CODE
                            INVALID_BANK_ROUTING_NUMBER -> Value.INVALID_BANK_ROUTING_NUMBER
                            INVALID_BANK_ACCOUNT_NUMBER -> Value.INVALID_BANK_ACCOUNT_NUMBER
                            INPUT_MATCHING_FAILED -> Value.INPUT_MATCHING_FAILED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            TIMEOUT -> Known.TIMEOUT
                            INVALID_CARD_NUMBER -> Known.INVALID_CARD_NUMBER
                            INVALID_CARD_TYPE -> Known.INVALID_CARD_TYPE
                            INVALID_DATE -> Known.INVALID_DATE
                            INVALID_SECURITY_CODE -> Known.INVALID_SECURITY_CODE
                            INVALID_POSTAL_CODE -> Known.INVALID_POSTAL_CODE
                            INVALID_BANK_ROUTING_NUMBER -> Known.INVALID_BANK_ROUTING_NUMBER
                            INVALID_BANK_ACCOUNT_NUMBER -> Known.INVALID_BANK_ACCOUNT_NUMBER
                            INPUT_MATCHING_FAILED -> Known.INPUT_MATCHING_FAILED
                            else -> throw TelnyxInvalidDataException("Unknown ErrorType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): ErrorType = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ErrorType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PayToolPrompt &&
                        text == other.text &&
                        attempt == other.attempt &&
                        cardType == other.cardType &&
                        errorType == other.errorType &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(text, attempt, cardType, errorType, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PayToolPrompt{text=$text, attempt=$attempt, cardType=$cardType, errorType=$errorType, additionalProperties=$additionalProperties}"
            }
        }

        /** A default prompt string or an ordered list of qualified prompts. */
        @JsonDeserialize(using = ExpirationDate.Deserializer::class)
        @JsonSerialize(using = ExpirationDate.Serializer::class)
        class ExpirationDate
        private constructor(
            private val string: String? = null,
            private val payToolPrompts: List<PayToolPrompt>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun payToolPrompts(): Optional<List<PayToolPrompt>> =
                Optional.ofNullable(payToolPrompts)

            fun isString(): Boolean = string != null

            fun isPayToolPrompts(): Boolean = payToolPrompts != null

            fun asString(): String = string.getOrThrow("string")

            fun asPayToolPrompts(): List<PayToolPrompt> =
                payToolPrompts.getOrThrow("payToolPrompts")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = expirationDate.accept(new ExpirationDate.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitString(String string) {
             *         return Optional.of(string.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    payToolPrompts != null -> visitor.visitPayToolPrompts(payToolPrompts)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): ExpirationDate = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>) {
                            payToolPrompts.forEach { it.validate() }
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>) =
                            payToolPrompts.sumOf { it.validity().toInt() }

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExpirationDate &&
                    string == other.string &&
                    payToolPrompts == other.payToolPrompts
            }

            override fun hashCode(): Int = Objects.hash(string, payToolPrompts)

            override fun toString(): String =
                when {
                    string != null -> "ExpirationDate{string=$string}"
                    payToolPrompts != null -> "ExpirationDate{payToolPrompts=$payToolPrompts}"
                    _json != null -> "ExpirationDate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid ExpirationDate")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = ExpirationDate(string = string)

                @JvmStatic
                fun ofPayToolPrompts(payToolPrompts: List<PayToolPrompt>) =
                    ExpirationDate(payToolPrompts = payToolPrompts.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [ExpirationDate] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>): T

                /**
                 * Maps an unknown variant of [ExpirationDate] to a value of type [T].
                 *
                 * An instance of [ExpirationDate] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown ExpirationDate: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<ExpirationDate>(ExpirationDate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): ExpirationDate {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    ExpirationDate(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<PayToolPrompt>>())?.let {
                                    ExpirationDate(payToolPrompts = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> ExpirationDate(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<ExpirationDate>(ExpirationDate::class) {

                override fun serialize(
                    value: ExpirationDate,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.payToolPrompts != null -> generator.writeObject(value.payToolPrompts)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid ExpirationDate")
                    }
                }
            }

            /**
             * A text-to-speech prompt with optional matching qualifiers, mirroring the Voice API
             * PayPrompt schema.
             */
            class PayToolPrompt
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val text: JsonField<String>,
                private val attempt: JsonField<String>,
                private val cardType: JsonField<CardType>,
                private val errorType: JsonField<ErrorType>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("text")
                    @ExcludeMissing
                    text: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("attempt")
                    @ExcludeMissing
                    attempt: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("card_type")
                    @ExcludeMissing
                    cardType: JsonField<CardType> = JsonMissing.of(),
                    @JsonProperty("error_type")
                    @ExcludeMissing
                    errorType: JsonField<ErrorType> = JsonMissing.of(),
                ) : this(text, attempt, cardType, errorType, mutableMapOf())

                /**
                 * Text spoken for the payment collection step.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun text(): String = text.getRequired("text")

                /**
                 * Space-separated 1-based attempt numbers (1-9 followed by digits only, e.g. `"2
                 * 3"`) for which this prompt applies. A prompt qualified with an attempt number
                 * above `max_attempts` (default 3) is rejected at write time — it could never play.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun attempt(): Optional<String> = attempt.getOptional("attempt")

                /**
                 * Lowercase, case-sensitive detected card type for which this prompt applies.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun cardType(): Optional<CardType> = cardType.getOptional("card_type")

                /**
                 * Step error for which this prompt applies.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun errorType(): Optional<ErrorType> = errorType.getOptional("error_type")

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                /**
                 * Returns the raw JSON value of [attempt].
                 *
                 * Unlike [attempt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("attempt") @ExcludeMissing fun _attempt(): JsonField<String> = attempt

                /**
                 * Returns the raw JSON value of [cardType].
                 *
                 * Unlike [cardType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("card_type")
                @ExcludeMissing
                fun _cardType(): JsonField<CardType> = cardType

                /**
                 * Returns the raw JSON value of [errorType].
                 *
                 * Unlike [errorType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error_type")
                @ExcludeMissing
                fun _errorType(): JsonField<ErrorType> = errorType

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
                     * Returns a mutable builder for constructing an instance of [PayToolPrompt].
                     *
                     * The following fields are required:
                     * ```java
                     * .text()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PayToolPrompt]. */
                class Builder internal constructor() {

                    private var text: JsonField<String>? = null
                    private var attempt: JsonField<String> = JsonMissing.of()
                    private var cardType: JsonField<CardType> = JsonMissing.of()
                    private var errorType: JsonField<ErrorType> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(payToolPrompt: PayToolPrompt) = apply {
                        text = payToolPrompt.text
                        attempt = payToolPrompt.attempt
                        cardType = payToolPrompt.cardType
                        errorType = payToolPrompt.errorType
                        additionalProperties = payToolPrompt.additionalProperties.toMutableMap()
                    }

                    /** Text spoken for the payment collection step. */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

                    /**
                     * Space-separated 1-based attempt numbers (1-9 followed by digits only, e.g.
                     * `"2 3"`) for which this prompt applies. A prompt qualified with an attempt
                     * number above `max_attempts` (default 3) is rejected at write time — it could
                     * never play.
                     */
                    fun attempt(attempt: String) = attempt(JsonField.of(attempt))

                    /**
                     * Sets [Builder.attempt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attempt] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun attempt(attempt: JsonField<String>) = apply { this.attempt = attempt }

                    /**
                     * Lowercase, case-sensitive detected card type for which this prompt applies.
                     */
                    fun cardType(cardType: CardType) = cardType(JsonField.of(cardType))

                    /**
                     * Sets [Builder.cardType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cardType] with a well-typed [CardType] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cardType(cardType: JsonField<CardType>) = apply { this.cardType = cardType }

                    /** Step error for which this prompt applies. */
                    fun errorType(errorType: ErrorType) = errorType(JsonField.of(errorType))

                    /**
                     * Sets [Builder.errorType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.errorType] with a well-typed [ErrorType]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun errorType(errorType: JsonField<ErrorType>) = apply {
                        this.errorType = errorType
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [PayToolPrompt].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .text()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PayToolPrompt =
                        PayToolPrompt(
                            checkRequired("text", text),
                            attempt,
                            cardType,
                            errorType,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): PayToolPrompt = apply {
                    if (validated) {
                        return@apply
                    }

                    text()
                    attempt()
                    cardType().ifPresent { it.validate() }
                    errorType().ifPresent { it.validate() }
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
                    (if (text.asKnown().isPresent) 1 else 0) +
                        (if (attempt.asKnown().isPresent) 1 else 0) +
                        (cardType.asKnown().getOrNull()?.validity() ?: 0) +
                        (errorType.asKnown().getOrNull()?.validity() ?: 0)

                /** Lowercase, case-sensitive detected card type for which this prompt applies. */
                class CardType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val VISA = of("visa")

                        @JvmField val MASTERCARD = of("mastercard")

                        @JvmField val AMEX = of("amex")

                        @JvmField val OPTIMA = of("optima")

                        @JvmField val DISCOVER = of("discover")

                        @JvmField val DINERS_CLUB = of("diners-club")

                        @JvmField val JCB = of("jcb")

                        @JvmField val MAESTRO = of("maestro")

                        @JvmField val ENROUTE = of("enroute")

                        @JvmStatic fun of(value: String) = CardType(JsonField.of(value))
                    }

                    /** An enum containing [CardType]'s known values. */
                    enum class Known {
                        VISA,
                        MASTERCARD,
                        AMEX,
                        OPTIMA,
                        DISCOVER,
                        DINERS_CLUB,
                        JCB,
                        MAESTRO,
                        ENROUTE,
                    }

                    /**
                     * An enum containing [CardType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [CardType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        VISA,
                        MASTERCARD,
                        AMEX,
                        OPTIMA,
                        DISCOVER,
                        DINERS_CLUB,
                        JCB,
                        MAESTRO,
                        ENROUTE,
                        /**
                         * An enum member indicating that [CardType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            VISA -> Value.VISA
                            MASTERCARD -> Value.MASTERCARD
                            AMEX -> Value.AMEX
                            OPTIMA -> Value.OPTIMA
                            DISCOVER -> Value.DISCOVER
                            DINERS_CLUB -> Value.DINERS_CLUB
                            JCB -> Value.JCB
                            MAESTRO -> Value.MAESTRO
                            ENROUTE -> Value.ENROUTE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            VISA -> Known.VISA
                            MASTERCARD -> Known.MASTERCARD
                            AMEX -> Known.AMEX
                            OPTIMA -> Known.OPTIMA
                            DISCOVER -> Known.DISCOVER
                            DINERS_CLUB -> Known.DINERS_CLUB
                            JCB -> Known.JCB
                            MAESTRO -> Known.MAESTRO
                            ENROUTE -> Known.ENROUTE
                            else -> throw TelnyxInvalidDataException("Unknown CardType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): CardType = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CardType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Step error for which this prompt applies. */
                class ErrorType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val TIMEOUT = of("timeout")

                        @JvmField val INVALID_CARD_NUMBER = of("invalid-card-number")

                        @JvmField val INVALID_CARD_TYPE = of("invalid-card-type")

                        @JvmField val INVALID_DATE = of("invalid-date")

                        @JvmField val INVALID_SECURITY_CODE = of("invalid-security-code")

                        @JvmField val INVALID_POSTAL_CODE = of("invalid-postal-code")

                        @JvmField
                        val INVALID_BANK_ROUTING_NUMBER = of("invalid-bank-routing-number")

                        @JvmField
                        val INVALID_BANK_ACCOUNT_NUMBER = of("invalid-bank-account-number")

                        @JvmField val INPUT_MATCHING_FAILED = of("input-matching-failed")

                        @JvmStatic fun of(value: String) = ErrorType(JsonField.of(value))
                    }

                    /** An enum containing [ErrorType]'s known values. */
                    enum class Known {
                        TIMEOUT,
                        INVALID_CARD_NUMBER,
                        INVALID_CARD_TYPE,
                        INVALID_DATE,
                        INVALID_SECURITY_CODE,
                        INVALID_POSTAL_CODE,
                        INVALID_BANK_ROUTING_NUMBER,
                        INVALID_BANK_ACCOUNT_NUMBER,
                        INPUT_MATCHING_FAILED,
                    }

                    /**
                     * An enum containing [ErrorType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ErrorType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        TIMEOUT,
                        INVALID_CARD_NUMBER,
                        INVALID_CARD_TYPE,
                        INVALID_DATE,
                        INVALID_SECURITY_CODE,
                        INVALID_POSTAL_CODE,
                        INVALID_BANK_ROUTING_NUMBER,
                        INVALID_BANK_ACCOUNT_NUMBER,
                        INPUT_MATCHING_FAILED,
                        /**
                         * An enum member indicating that [ErrorType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            TIMEOUT -> Value.TIMEOUT
                            INVALID_CARD_NUMBER -> Value.INVALID_CARD_NUMBER
                            INVALID_CARD_TYPE -> Value.INVALID_CARD_TYPE
                            INVALID_DATE -> Value.INVALID_DATE
                            INVALID_SECURITY_CODE -> Value.INVALID_SECURITY_CODE
                            INVALID_POSTAL_CODE -> Value.INVALID_POSTAL_CODE
                            INVALID_BANK_ROUTING_NUMBER -> Value.INVALID_BANK_ROUTING_NUMBER
                            INVALID_BANK_ACCOUNT_NUMBER -> Value.INVALID_BANK_ACCOUNT_NUMBER
                            INPUT_MATCHING_FAILED -> Value.INPUT_MATCHING_FAILED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            TIMEOUT -> Known.TIMEOUT
                            INVALID_CARD_NUMBER -> Known.INVALID_CARD_NUMBER
                            INVALID_CARD_TYPE -> Known.INVALID_CARD_TYPE
                            INVALID_DATE -> Known.INVALID_DATE
                            INVALID_SECURITY_CODE -> Known.INVALID_SECURITY_CODE
                            INVALID_POSTAL_CODE -> Known.INVALID_POSTAL_CODE
                            INVALID_BANK_ROUTING_NUMBER -> Known.INVALID_BANK_ROUTING_NUMBER
                            INVALID_BANK_ACCOUNT_NUMBER -> Known.INVALID_BANK_ACCOUNT_NUMBER
                            INPUT_MATCHING_FAILED -> Known.INPUT_MATCHING_FAILED
                            else -> throw TelnyxInvalidDataException("Unknown ErrorType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): ErrorType = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ErrorType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PayToolPrompt &&
                        text == other.text &&
                        attempt == other.attempt &&
                        cardType == other.cardType &&
                        errorType == other.errorType &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(text, attempt, cardType, errorType, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PayToolPrompt{text=$text, attempt=$attempt, cardType=$cardType, errorType=$errorType, additionalProperties=$additionalProperties}"
            }
        }

        /** A default prompt string or an ordered list of qualified prompts. */
        @JsonDeserialize(using = PaymentCardNumber.Deserializer::class)
        @JsonSerialize(using = PaymentCardNumber.Serializer::class)
        class PaymentCardNumber
        private constructor(
            private val string: String? = null,
            private val payToolPrompts: List<PayToolPrompt>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun payToolPrompts(): Optional<List<PayToolPrompt>> =
                Optional.ofNullable(payToolPrompts)

            fun isString(): Boolean = string != null

            fun isPayToolPrompts(): Boolean = payToolPrompts != null

            fun asString(): String = string.getOrThrow("string")

            fun asPayToolPrompts(): List<PayToolPrompt> =
                payToolPrompts.getOrThrow("payToolPrompts")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = paymentCardNumber.accept(new PaymentCardNumber.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitString(String string) {
             *         return Optional.of(string.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    payToolPrompts != null -> visitor.visitPayToolPrompts(payToolPrompts)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): PaymentCardNumber = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>) {
                            payToolPrompts.forEach { it.validate() }
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>) =
                            payToolPrompts.sumOf { it.validity().toInt() }

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentCardNumber &&
                    string == other.string &&
                    payToolPrompts == other.payToolPrompts
            }

            override fun hashCode(): Int = Objects.hash(string, payToolPrompts)

            override fun toString(): String =
                when {
                    string != null -> "PaymentCardNumber{string=$string}"
                    payToolPrompts != null -> "PaymentCardNumber{payToolPrompts=$payToolPrompts}"
                    _json != null -> "PaymentCardNumber{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid PaymentCardNumber")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = PaymentCardNumber(string = string)

                @JvmStatic
                fun ofPayToolPrompts(payToolPrompts: List<PayToolPrompt>) =
                    PaymentCardNumber(payToolPrompts = payToolPrompts.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [PaymentCardNumber] to a value
             * of type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>): T

                /**
                 * Maps an unknown variant of [PaymentCardNumber] to a value of type [T].
                 *
                 * An instance of [PaymentCardNumber] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown PaymentCardNumber: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<PaymentCardNumber>(PaymentCardNumber::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): PaymentCardNumber {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    PaymentCardNumber(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<PayToolPrompt>>())?.let {
                                    PaymentCardNumber(payToolPrompts = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> PaymentCardNumber(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer :
                BaseSerializer<PaymentCardNumber>(PaymentCardNumber::class) {

                override fun serialize(
                    value: PaymentCardNumber,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.payToolPrompts != null -> generator.writeObject(value.payToolPrompts)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid PaymentCardNumber")
                    }
                }
            }

            /**
             * A text-to-speech prompt with optional matching qualifiers, mirroring the Voice API
             * PayPrompt schema.
             */
            class PayToolPrompt
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val text: JsonField<String>,
                private val attempt: JsonField<String>,
                private val cardType: JsonField<CardType>,
                private val errorType: JsonField<ErrorType>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("text")
                    @ExcludeMissing
                    text: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("attempt")
                    @ExcludeMissing
                    attempt: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("card_type")
                    @ExcludeMissing
                    cardType: JsonField<CardType> = JsonMissing.of(),
                    @JsonProperty("error_type")
                    @ExcludeMissing
                    errorType: JsonField<ErrorType> = JsonMissing.of(),
                ) : this(text, attempt, cardType, errorType, mutableMapOf())

                /**
                 * Text spoken for the payment collection step.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun text(): String = text.getRequired("text")

                /**
                 * Space-separated 1-based attempt numbers (1-9 followed by digits only, e.g. `"2
                 * 3"`) for which this prompt applies. A prompt qualified with an attempt number
                 * above `max_attempts` (default 3) is rejected at write time — it could never play.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun attempt(): Optional<String> = attempt.getOptional("attempt")

                /**
                 * Lowercase, case-sensitive detected card type for which this prompt applies.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun cardType(): Optional<CardType> = cardType.getOptional("card_type")

                /**
                 * Step error for which this prompt applies.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun errorType(): Optional<ErrorType> = errorType.getOptional("error_type")

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                /**
                 * Returns the raw JSON value of [attempt].
                 *
                 * Unlike [attempt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("attempt") @ExcludeMissing fun _attempt(): JsonField<String> = attempt

                /**
                 * Returns the raw JSON value of [cardType].
                 *
                 * Unlike [cardType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("card_type")
                @ExcludeMissing
                fun _cardType(): JsonField<CardType> = cardType

                /**
                 * Returns the raw JSON value of [errorType].
                 *
                 * Unlike [errorType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error_type")
                @ExcludeMissing
                fun _errorType(): JsonField<ErrorType> = errorType

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
                     * Returns a mutable builder for constructing an instance of [PayToolPrompt].
                     *
                     * The following fields are required:
                     * ```java
                     * .text()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PayToolPrompt]. */
                class Builder internal constructor() {

                    private var text: JsonField<String>? = null
                    private var attempt: JsonField<String> = JsonMissing.of()
                    private var cardType: JsonField<CardType> = JsonMissing.of()
                    private var errorType: JsonField<ErrorType> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(payToolPrompt: PayToolPrompt) = apply {
                        text = payToolPrompt.text
                        attempt = payToolPrompt.attempt
                        cardType = payToolPrompt.cardType
                        errorType = payToolPrompt.errorType
                        additionalProperties = payToolPrompt.additionalProperties.toMutableMap()
                    }

                    /** Text spoken for the payment collection step. */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

                    /**
                     * Space-separated 1-based attempt numbers (1-9 followed by digits only, e.g.
                     * `"2 3"`) for which this prompt applies. A prompt qualified with an attempt
                     * number above `max_attempts` (default 3) is rejected at write time — it could
                     * never play.
                     */
                    fun attempt(attempt: String) = attempt(JsonField.of(attempt))

                    /**
                     * Sets [Builder.attempt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attempt] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun attempt(attempt: JsonField<String>) = apply { this.attempt = attempt }

                    /**
                     * Lowercase, case-sensitive detected card type for which this prompt applies.
                     */
                    fun cardType(cardType: CardType) = cardType(JsonField.of(cardType))

                    /**
                     * Sets [Builder.cardType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cardType] with a well-typed [CardType] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cardType(cardType: JsonField<CardType>) = apply { this.cardType = cardType }

                    /** Step error for which this prompt applies. */
                    fun errorType(errorType: ErrorType) = errorType(JsonField.of(errorType))

                    /**
                     * Sets [Builder.errorType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.errorType] with a well-typed [ErrorType]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun errorType(errorType: JsonField<ErrorType>) = apply {
                        this.errorType = errorType
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [PayToolPrompt].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .text()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PayToolPrompt =
                        PayToolPrompt(
                            checkRequired("text", text),
                            attempt,
                            cardType,
                            errorType,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): PayToolPrompt = apply {
                    if (validated) {
                        return@apply
                    }

                    text()
                    attempt()
                    cardType().ifPresent { it.validate() }
                    errorType().ifPresent { it.validate() }
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
                    (if (text.asKnown().isPresent) 1 else 0) +
                        (if (attempt.asKnown().isPresent) 1 else 0) +
                        (cardType.asKnown().getOrNull()?.validity() ?: 0) +
                        (errorType.asKnown().getOrNull()?.validity() ?: 0)

                /** Lowercase, case-sensitive detected card type for which this prompt applies. */
                class CardType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val VISA = of("visa")

                        @JvmField val MASTERCARD = of("mastercard")

                        @JvmField val AMEX = of("amex")

                        @JvmField val OPTIMA = of("optima")

                        @JvmField val DISCOVER = of("discover")

                        @JvmField val DINERS_CLUB = of("diners-club")

                        @JvmField val JCB = of("jcb")

                        @JvmField val MAESTRO = of("maestro")

                        @JvmField val ENROUTE = of("enroute")

                        @JvmStatic fun of(value: String) = CardType(JsonField.of(value))
                    }

                    /** An enum containing [CardType]'s known values. */
                    enum class Known {
                        VISA,
                        MASTERCARD,
                        AMEX,
                        OPTIMA,
                        DISCOVER,
                        DINERS_CLUB,
                        JCB,
                        MAESTRO,
                        ENROUTE,
                    }

                    /**
                     * An enum containing [CardType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [CardType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        VISA,
                        MASTERCARD,
                        AMEX,
                        OPTIMA,
                        DISCOVER,
                        DINERS_CLUB,
                        JCB,
                        MAESTRO,
                        ENROUTE,
                        /**
                         * An enum member indicating that [CardType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            VISA -> Value.VISA
                            MASTERCARD -> Value.MASTERCARD
                            AMEX -> Value.AMEX
                            OPTIMA -> Value.OPTIMA
                            DISCOVER -> Value.DISCOVER
                            DINERS_CLUB -> Value.DINERS_CLUB
                            JCB -> Value.JCB
                            MAESTRO -> Value.MAESTRO
                            ENROUTE -> Value.ENROUTE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            VISA -> Known.VISA
                            MASTERCARD -> Known.MASTERCARD
                            AMEX -> Known.AMEX
                            OPTIMA -> Known.OPTIMA
                            DISCOVER -> Known.DISCOVER
                            DINERS_CLUB -> Known.DINERS_CLUB
                            JCB -> Known.JCB
                            MAESTRO -> Known.MAESTRO
                            ENROUTE -> Known.ENROUTE
                            else -> throw TelnyxInvalidDataException("Unknown CardType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): CardType = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CardType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Step error for which this prompt applies. */
                class ErrorType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val TIMEOUT = of("timeout")

                        @JvmField val INVALID_CARD_NUMBER = of("invalid-card-number")

                        @JvmField val INVALID_CARD_TYPE = of("invalid-card-type")

                        @JvmField val INVALID_DATE = of("invalid-date")

                        @JvmField val INVALID_SECURITY_CODE = of("invalid-security-code")

                        @JvmField val INVALID_POSTAL_CODE = of("invalid-postal-code")

                        @JvmField
                        val INVALID_BANK_ROUTING_NUMBER = of("invalid-bank-routing-number")

                        @JvmField
                        val INVALID_BANK_ACCOUNT_NUMBER = of("invalid-bank-account-number")

                        @JvmField val INPUT_MATCHING_FAILED = of("input-matching-failed")

                        @JvmStatic fun of(value: String) = ErrorType(JsonField.of(value))
                    }

                    /** An enum containing [ErrorType]'s known values. */
                    enum class Known {
                        TIMEOUT,
                        INVALID_CARD_NUMBER,
                        INVALID_CARD_TYPE,
                        INVALID_DATE,
                        INVALID_SECURITY_CODE,
                        INVALID_POSTAL_CODE,
                        INVALID_BANK_ROUTING_NUMBER,
                        INVALID_BANK_ACCOUNT_NUMBER,
                        INPUT_MATCHING_FAILED,
                    }

                    /**
                     * An enum containing [ErrorType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ErrorType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        TIMEOUT,
                        INVALID_CARD_NUMBER,
                        INVALID_CARD_TYPE,
                        INVALID_DATE,
                        INVALID_SECURITY_CODE,
                        INVALID_POSTAL_CODE,
                        INVALID_BANK_ROUTING_NUMBER,
                        INVALID_BANK_ACCOUNT_NUMBER,
                        INPUT_MATCHING_FAILED,
                        /**
                         * An enum member indicating that [ErrorType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            TIMEOUT -> Value.TIMEOUT
                            INVALID_CARD_NUMBER -> Value.INVALID_CARD_NUMBER
                            INVALID_CARD_TYPE -> Value.INVALID_CARD_TYPE
                            INVALID_DATE -> Value.INVALID_DATE
                            INVALID_SECURITY_CODE -> Value.INVALID_SECURITY_CODE
                            INVALID_POSTAL_CODE -> Value.INVALID_POSTAL_CODE
                            INVALID_BANK_ROUTING_NUMBER -> Value.INVALID_BANK_ROUTING_NUMBER
                            INVALID_BANK_ACCOUNT_NUMBER -> Value.INVALID_BANK_ACCOUNT_NUMBER
                            INPUT_MATCHING_FAILED -> Value.INPUT_MATCHING_FAILED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            TIMEOUT -> Known.TIMEOUT
                            INVALID_CARD_NUMBER -> Known.INVALID_CARD_NUMBER
                            INVALID_CARD_TYPE -> Known.INVALID_CARD_TYPE
                            INVALID_DATE -> Known.INVALID_DATE
                            INVALID_SECURITY_CODE -> Known.INVALID_SECURITY_CODE
                            INVALID_POSTAL_CODE -> Known.INVALID_POSTAL_CODE
                            INVALID_BANK_ROUTING_NUMBER -> Known.INVALID_BANK_ROUTING_NUMBER
                            INVALID_BANK_ACCOUNT_NUMBER -> Known.INVALID_BANK_ACCOUNT_NUMBER
                            INPUT_MATCHING_FAILED -> Known.INPUT_MATCHING_FAILED
                            else -> throw TelnyxInvalidDataException("Unknown ErrorType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): ErrorType = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ErrorType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PayToolPrompt &&
                        text == other.text &&
                        attempt == other.attempt &&
                        cardType == other.cardType &&
                        errorType == other.errorType &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(text, attempt, cardType, errorType, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PayToolPrompt{text=$text, attempt=$attempt, cardType=$cardType, errorType=$errorType, additionalProperties=$additionalProperties}"
            }
        }

        /** A default prompt string or an ordered list of qualified prompts. */
        @JsonDeserialize(using = PostalCode.Deserializer::class)
        @JsonSerialize(using = PostalCode.Serializer::class)
        class PostalCode
        private constructor(
            private val string: String? = null,
            private val payToolPrompts: List<PayToolPrompt>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun payToolPrompts(): Optional<List<PayToolPrompt>> =
                Optional.ofNullable(payToolPrompts)

            fun isString(): Boolean = string != null

            fun isPayToolPrompts(): Boolean = payToolPrompts != null

            fun asString(): String = string.getOrThrow("string")

            fun asPayToolPrompts(): List<PayToolPrompt> =
                payToolPrompts.getOrThrow("payToolPrompts")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = postalCode.accept(new PostalCode.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitString(String string) {
             *         return Optional.of(string.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    payToolPrompts != null -> visitor.visitPayToolPrompts(payToolPrompts)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): PostalCode = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>) {
                            payToolPrompts.forEach { it.validate() }
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>) =
                            payToolPrompts.sumOf { it.validity().toInt() }

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PostalCode &&
                    string == other.string &&
                    payToolPrompts == other.payToolPrompts
            }

            override fun hashCode(): Int = Objects.hash(string, payToolPrompts)

            override fun toString(): String =
                when {
                    string != null -> "PostalCode{string=$string}"
                    payToolPrompts != null -> "PostalCode{payToolPrompts=$payToolPrompts}"
                    _json != null -> "PostalCode{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid PostalCode")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = PostalCode(string = string)

                @JvmStatic
                fun ofPayToolPrompts(payToolPrompts: List<PayToolPrompt>) =
                    PostalCode(payToolPrompts = payToolPrompts.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [PostalCode] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>): T

                /**
                 * Maps an unknown variant of [PostalCode] to a value of type [T].
                 *
                 * An instance of [PostalCode] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown PostalCode: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<PostalCode>(PostalCode::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): PostalCode {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    PostalCode(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<PayToolPrompt>>())?.let {
                                    PostalCode(payToolPrompts = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> PostalCode(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<PostalCode>(PostalCode::class) {

                override fun serialize(
                    value: PostalCode,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.payToolPrompts != null -> generator.writeObject(value.payToolPrompts)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid PostalCode")
                    }
                }
            }

            /**
             * A text-to-speech prompt with optional matching qualifiers, mirroring the Voice API
             * PayPrompt schema.
             */
            class PayToolPrompt
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val text: JsonField<String>,
                private val attempt: JsonField<String>,
                private val cardType: JsonField<CardType>,
                private val errorType: JsonField<ErrorType>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("text")
                    @ExcludeMissing
                    text: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("attempt")
                    @ExcludeMissing
                    attempt: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("card_type")
                    @ExcludeMissing
                    cardType: JsonField<CardType> = JsonMissing.of(),
                    @JsonProperty("error_type")
                    @ExcludeMissing
                    errorType: JsonField<ErrorType> = JsonMissing.of(),
                ) : this(text, attempt, cardType, errorType, mutableMapOf())

                /**
                 * Text spoken for the payment collection step.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun text(): String = text.getRequired("text")

                /**
                 * Space-separated 1-based attempt numbers (1-9 followed by digits only, e.g. `"2
                 * 3"`) for which this prompt applies. A prompt qualified with an attempt number
                 * above `max_attempts` (default 3) is rejected at write time — it could never play.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun attempt(): Optional<String> = attempt.getOptional("attempt")

                /**
                 * Lowercase, case-sensitive detected card type for which this prompt applies.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun cardType(): Optional<CardType> = cardType.getOptional("card_type")

                /**
                 * Step error for which this prompt applies.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun errorType(): Optional<ErrorType> = errorType.getOptional("error_type")

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                /**
                 * Returns the raw JSON value of [attempt].
                 *
                 * Unlike [attempt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("attempt") @ExcludeMissing fun _attempt(): JsonField<String> = attempt

                /**
                 * Returns the raw JSON value of [cardType].
                 *
                 * Unlike [cardType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("card_type")
                @ExcludeMissing
                fun _cardType(): JsonField<CardType> = cardType

                /**
                 * Returns the raw JSON value of [errorType].
                 *
                 * Unlike [errorType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error_type")
                @ExcludeMissing
                fun _errorType(): JsonField<ErrorType> = errorType

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
                     * Returns a mutable builder for constructing an instance of [PayToolPrompt].
                     *
                     * The following fields are required:
                     * ```java
                     * .text()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PayToolPrompt]. */
                class Builder internal constructor() {

                    private var text: JsonField<String>? = null
                    private var attempt: JsonField<String> = JsonMissing.of()
                    private var cardType: JsonField<CardType> = JsonMissing.of()
                    private var errorType: JsonField<ErrorType> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(payToolPrompt: PayToolPrompt) = apply {
                        text = payToolPrompt.text
                        attempt = payToolPrompt.attempt
                        cardType = payToolPrompt.cardType
                        errorType = payToolPrompt.errorType
                        additionalProperties = payToolPrompt.additionalProperties.toMutableMap()
                    }

                    /** Text spoken for the payment collection step. */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

                    /**
                     * Space-separated 1-based attempt numbers (1-9 followed by digits only, e.g.
                     * `"2 3"`) for which this prompt applies. A prompt qualified with an attempt
                     * number above `max_attempts` (default 3) is rejected at write time — it could
                     * never play.
                     */
                    fun attempt(attempt: String) = attempt(JsonField.of(attempt))

                    /**
                     * Sets [Builder.attempt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attempt] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun attempt(attempt: JsonField<String>) = apply { this.attempt = attempt }

                    /**
                     * Lowercase, case-sensitive detected card type for which this prompt applies.
                     */
                    fun cardType(cardType: CardType) = cardType(JsonField.of(cardType))

                    /**
                     * Sets [Builder.cardType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cardType] with a well-typed [CardType] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cardType(cardType: JsonField<CardType>) = apply { this.cardType = cardType }

                    /** Step error for which this prompt applies. */
                    fun errorType(errorType: ErrorType) = errorType(JsonField.of(errorType))

                    /**
                     * Sets [Builder.errorType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.errorType] with a well-typed [ErrorType]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun errorType(errorType: JsonField<ErrorType>) = apply {
                        this.errorType = errorType
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [PayToolPrompt].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .text()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PayToolPrompt =
                        PayToolPrompt(
                            checkRequired("text", text),
                            attempt,
                            cardType,
                            errorType,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): PayToolPrompt = apply {
                    if (validated) {
                        return@apply
                    }

                    text()
                    attempt()
                    cardType().ifPresent { it.validate() }
                    errorType().ifPresent { it.validate() }
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
                    (if (text.asKnown().isPresent) 1 else 0) +
                        (if (attempt.asKnown().isPresent) 1 else 0) +
                        (cardType.asKnown().getOrNull()?.validity() ?: 0) +
                        (errorType.asKnown().getOrNull()?.validity() ?: 0)

                /** Lowercase, case-sensitive detected card type for which this prompt applies. */
                class CardType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val VISA = of("visa")

                        @JvmField val MASTERCARD = of("mastercard")

                        @JvmField val AMEX = of("amex")

                        @JvmField val OPTIMA = of("optima")

                        @JvmField val DISCOVER = of("discover")

                        @JvmField val DINERS_CLUB = of("diners-club")

                        @JvmField val JCB = of("jcb")

                        @JvmField val MAESTRO = of("maestro")

                        @JvmField val ENROUTE = of("enroute")

                        @JvmStatic fun of(value: String) = CardType(JsonField.of(value))
                    }

                    /** An enum containing [CardType]'s known values. */
                    enum class Known {
                        VISA,
                        MASTERCARD,
                        AMEX,
                        OPTIMA,
                        DISCOVER,
                        DINERS_CLUB,
                        JCB,
                        MAESTRO,
                        ENROUTE,
                    }

                    /**
                     * An enum containing [CardType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [CardType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        VISA,
                        MASTERCARD,
                        AMEX,
                        OPTIMA,
                        DISCOVER,
                        DINERS_CLUB,
                        JCB,
                        MAESTRO,
                        ENROUTE,
                        /**
                         * An enum member indicating that [CardType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            VISA -> Value.VISA
                            MASTERCARD -> Value.MASTERCARD
                            AMEX -> Value.AMEX
                            OPTIMA -> Value.OPTIMA
                            DISCOVER -> Value.DISCOVER
                            DINERS_CLUB -> Value.DINERS_CLUB
                            JCB -> Value.JCB
                            MAESTRO -> Value.MAESTRO
                            ENROUTE -> Value.ENROUTE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            VISA -> Known.VISA
                            MASTERCARD -> Known.MASTERCARD
                            AMEX -> Known.AMEX
                            OPTIMA -> Known.OPTIMA
                            DISCOVER -> Known.DISCOVER
                            DINERS_CLUB -> Known.DINERS_CLUB
                            JCB -> Known.JCB
                            MAESTRO -> Known.MAESTRO
                            ENROUTE -> Known.ENROUTE
                            else -> throw TelnyxInvalidDataException("Unknown CardType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): CardType = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CardType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Step error for which this prompt applies. */
                class ErrorType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val TIMEOUT = of("timeout")

                        @JvmField val INVALID_CARD_NUMBER = of("invalid-card-number")

                        @JvmField val INVALID_CARD_TYPE = of("invalid-card-type")

                        @JvmField val INVALID_DATE = of("invalid-date")

                        @JvmField val INVALID_SECURITY_CODE = of("invalid-security-code")

                        @JvmField val INVALID_POSTAL_CODE = of("invalid-postal-code")

                        @JvmField
                        val INVALID_BANK_ROUTING_NUMBER = of("invalid-bank-routing-number")

                        @JvmField
                        val INVALID_BANK_ACCOUNT_NUMBER = of("invalid-bank-account-number")

                        @JvmField val INPUT_MATCHING_FAILED = of("input-matching-failed")

                        @JvmStatic fun of(value: String) = ErrorType(JsonField.of(value))
                    }

                    /** An enum containing [ErrorType]'s known values. */
                    enum class Known {
                        TIMEOUT,
                        INVALID_CARD_NUMBER,
                        INVALID_CARD_TYPE,
                        INVALID_DATE,
                        INVALID_SECURITY_CODE,
                        INVALID_POSTAL_CODE,
                        INVALID_BANK_ROUTING_NUMBER,
                        INVALID_BANK_ACCOUNT_NUMBER,
                        INPUT_MATCHING_FAILED,
                    }

                    /**
                     * An enum containing [ErrorType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ErrorType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        TIMEOUT,
                        INVALID_CARD_NUMBER,
                        INVALID_CARD_TYPE,
                        INVALID_DATE,
                        INVALID_SECURITY_CODE,
                        INVALID_POSTAL_CODE,
                        INVALID_BANK_ROUTING_NUMBER,
                        INVALID_BANK_ACCOUNT_NUMBER,
                        INPUT_MATCHING_FAILED,
                        /**
                         * An enum member indicating that [ErrorType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            TIMEOUT -> Value.TIMEOUT
                            INVALID_CARD_NUMBER -> Value.INVALID_CARD_NUMBER
                            INVALID_CARD_TYPE -> Value.INVALID_CARD_TYPE
                            INVALID_DATE -> Value.INVALID_DATE
                            INVALID_SECURITY_CODE -> Value.INVALID_SECURITY_CODE
                            INVALID_POSTAL_CODE -> Value.INVALID_POSTAL_CODE
                            INVALID_BANK_ROUTING_NUMBER -> Value.INVALID_BANK_ROUTING_NUMBER
                            INVALID_BANK_ACCOUNT_NUMBER -> Value.INVALID_BANK_ACCOUNT_NUMBER
                            INPUT_MATCHING_FAILED -> Value.INPUT_MATCHING_FAILED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            TIMEOUT -> Known.TIMEOUT
                            INVALID_CARD_NUMBER -> Known.INVALID_CARD_NUMBER
                            INVALID_CARD_TYPE -> Known.INVALID_CARD_TYPE
                            INVALID_DATE -> Known.INVALID_DATE
                            INVALID_SECURITY_CODE -> Known.INVALID_SECURITY_CODE
                            INVALID_POSTAL_CODE -> Known.INVALID_POSTAL_CODE
                            INVALID_BANK_ROUTING_NUMBER -> Known.INVALID_BANK_ROUTING_NUMBER
                            INVALID_BANK_ACCOUNT_NUMBER -> Known.INVALID_BANK_ACCOUNT_NUMBER
                            INPUT_MATCHING_FAILED -> Known.INPUT_MATCHING_FAILED
                            else -> throw TelnyxInvalidDataException("Unknown ErrorType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): ErrorType = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ErrorType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PayToolPrompt &&
                        text == other.text &&
                        attempt == other.attempt &&
                        cardType == other.cardType &&
                        errorType == other.errorType &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(text, attempt, cardType, errorType, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PayToolPrompt{text=$text, attempt=$attempt, cardType=$cardType, errorType=$errorType, additionalProperties=$additionalProperties}"
            }
        }

        /** A default prompt string or an ordered list of qualified prompts. */
        @JsonDeserialize(using = SecurityCode.Deserializer::class)
        @JsonSerialize(using = SecurityCode.Serializer::class)
        class SecurityCode
        private constructor(
            private val string: String? = null,
            private val payToolPrompts: List<PayToolPrompt>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun payToolPrompts(): Optional<List<PayToolPrompt>> =
                Optional.ofNullable(payToolPrompts)

            fun isString(): Boolean = string != null

            fun isPayToolPrompts(): Boolean = payToolPrompts != null

            fun asString(): String = string.getOrThrow("string")

            fun asPayToolPrompts(): List<PayToolPrompt> =
                payToolPrompts.getOrThrow("payToolPrompts")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = securityCode.accept(new SecurityCode.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitString(String string) {
             *         return Optional.of(string.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    payToolPrompts != null -> visitor.visitPayToolPrompts(payToolPrompts)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): SecurityCode = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>) {
                            payToolPrompts.forEach { it.validate() }
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>) =
                            payToolPrompts.sumOf { it.validity().toInt() }

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SecurityCode &&
                    string == other.string &&
                    payToolPrompts == other.payToolPrompts
            }

            override fun hashCode(): Int = Objects.hash(string, payToolPrompts)

            override fun toString(): String =
                when {
                    string != null -> "SecurityCode{string=$string}"
                    payToolPrompts != null -> "SecurityCode{payToolPrompts=$payToolPrompts}"
                    _json != null -> "SecurityCode{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid SecurityCode")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = SecurityCode(string = string)

                @JvmStatic
                fun ofPayToolPrompts(payToolPrompts: List<PayToolPrompt>) =
                    SecurityCode(payToolPrompts = payToolPrompts.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [SecurityCode] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitPayToolPrompts(payToolPrompts: List<PayToolPrompt>): T

                /**
                 * Maps an unknown variant of [SecurityCode] to a value of type [T].
                 *
                 * An instance of [SecurityCode] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown SecurityCode: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<SecurityCode>(SecurityCode::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): SecurityCode {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    SecurityCode(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<PayToolPrompt>>())?.let {
                                    SecurityCode(payToolPrompts = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> SecurityCode(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<SecurityCode>(SecurityCode::class) {

                override fun serialize(
                    value: SecurityCode,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.payToolPrompts != null -> generator.writeObject(value.payToolPrompts)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid SecurityCode")
                    }
                }
            }

            /**
             * A text-to-speech prompt with optional matching qualifiers, mirroring the Voice API
             * PayPrompt schema.
             */
            class PayToolPrompt
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val text: JsonField<String>,
                private val attempt: JsonField<String>,
                private val cardType: JsonField<CardType>,
                private val errorType: JsonField<ErrorType>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("text")
                    @ExcludeMissing
                    text: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("attempt")
                    @ExcludeMissing
                    attempt: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("card_type")
                    @ExcludeMissing
                    cardType: JsonField<CardType> = JsonMissing.of(),
                    @JsonProperty("error_type")
                    @ExcludeMissing
                    errorType: JsonField<ErrorType> = JsonMissing.of(),
                ) : this(text, attempt, cardType, errorType, mutableMapOf())

                /**
                 * Text spoken for the payment collection step.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun text(): String = text.getRequired("text")

                /**
                 * Space-separated 1-based attempt numbers (1-9 followed by digits only, e.g. `"2
                 * 3"`) for which this prompt applies. A prompt qualified with an attempt number
                 * above `max_attempts` (default 3) is rejected at write time — it could never play.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun attempt(): Optional<String> = attempt.getOptional("attempt")

                /**
                 * Lowercase, case-sensitive detected card type for which this prompt applies.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun cardType(): Optional<CardType> = cardType.getOptional("card_type")

                /**
                 * Step error for which this prompt applies.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun errorType(): Optional<ErrorType> = errorType.getOptional("error_type")

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                /**
                 * Returns the raw JSON value of [attempt].
                 *
                 * Unlike [attempt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("attempt") @ExcludeMissing fun _attempt(): JsonField<String> = attempt

                /**
                 * Returns the raw JSON value of [cardType].
                 *
                 * Unlike [cardType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("card_type")
                @ExcludeMissing
                fun _cardType(): JsonField<CardType> = cardType

                /**
                 * Returns the raw JSON value of [errorType].
                 *
                 * Unlike [errorType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("error_type")
                @ExcludeMissing
                fun _errorType(): JsonField<ErrorType> = errorType

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
                     * Returns a mutable builder for constructing an instance of [PayToolPrompt].
                     *
                     * The following fields are required:
                     * ```java
                     * .text()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PayToolPrompt]. */
                class Builder internal constructor() {

                    private var text: JsonField<String>? = null
                    private var attempt: JsonField<String> = JsonMissing.of()
                    private var cardType: JsonField<CardType> = JsonMissing.of()
                    private var errorType: JsonField<ErrorType> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(payToolPrompt: PayToolPrompt) = apply {
                        text = payToolPrompt.text
                        attempt = payToolPrompt.attempt
                        cardType = payToolPrompt.cardType
                        errorType = payToolPrompt.errorType
                        additionalProperties = payToolPrompt.additionalProperties.toMutableMap()
                    }

                    /** Text spoken for the payment collection step. */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

                    /**
                     * Space-separated 1-based attempt numbers (1-9 followed by digits only, e.g.
                     * `"2 3"`) for which this prompt applies. A prompt qualified with an attempt
                     * number above `max_attempts` (default 3) is rejected at write time — it could
                     * never play.
                     */
                    fun attempt(attempt: String) = attempt(JsonField.of(attempt))

                    /**
                     * Sets [Builder.attempt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attempt] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun attempt(attempt: JsonField<String>) = apply { this.attempt = attempt }

                    /**
                     * Lowercase, case-sensitive detected card type for which this prompt applies.
                     */
                    fun cardType(cardType: CardType) = cardType(JsonField.of(cardType))

                    /**
                     * Sets [Builder.cardType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cardType] with a well-typed [CardType] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cardType(cardType: JsonField<CardType>) = apply { this.cardType = cardType }

                    /** Step error for which this prompt applies. */
                    fun errorType(errorType: ErrorType) = errorType(JsonField.of(errorType))

                    /**
                     * Sets [Builder.errorType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.errorType] with a well-typed [ErrorType]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun errorType(errorType: JsonField<ErrorType>) = apply {
                        this.errorType = errorType
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [PayToolPrompt].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .text()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PayToolPrompt =
                        PayToolPrompt(
                            checkRequired("text", text),
                            attempt,
                            cardType,
                            errorType,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): PayToolPrompt = apply {
                    if (validated) {
                        return@apply
                    }

                    text()
                    attempt()
                    cardType().ifPresent { it.validate() }
                    errorType().ifPresent { it.validate() }
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
                    (if (text.asKnown().isPresent) 1 else 0) +
                        (if (attempt.asKnown().isPresent) 1 else 0) +
                        (cardType.asKnown().getOrNull()?.validity() ?: 0) +
                        (errorType.asKnown().getOrNull()?.validity() ?: 0)

                /** Lowercase, case-sensitive detected card type for which this prompt applies. */
                class CardType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val VISA = of("visa")

                        @JvmField val MASTERCARD = of("mastercard")

                        @JvmField val AMEX = of("amex")

                        @JvmField val OPTIMA = of("optima")

                        @JvmField val DISCOVER = of("discover")

                        @JvmField val DINERS_CLUB = of("diners-club")

                        @JvmField val JCB = of("jcb")

                        @JvmField val MAESTRO = of("maestro")

                        @JvmField val ENROUTE = of("enroute")

                        @JvmStatic fun of(value: String) = CardType(JsonField.of(value))
                    }

                    /** An enum containing [CardType]'s known values. */
                    enum class Known {
                        VISA,
                        MASTERCARD,
                        AMEX,
                        OPTIMA,
                        DISCOVER,
                        DINERS_CLUB,
                        JCB,
                        MAESTRO,
                        ENROUTE,
                    }

                    /**
                     * An enum containing [CardType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [CardType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        VISA,
                        MASTERCARD,
                        AMEX,
                        OPTIMA,
                        DISCOVER,
                        DINERS_CLUB,
                        JCB,
                        MAESTRO,
                        ENROUTE,
                        /**
                         * An enum member indicating that [CardType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            VISA -> Value.VISA
                            MASTERCARD -> Value.MASTERCARD
                            AMEX -> Value.AMEX
                            OPTIMA -> Value.OPTIMA
                            DISCOVER -> Value.DISCOVER
                            DINERS_CLUB -> Value.DINERS_CLUB
                            JCB -> Value.JCB
                            MAESTRO -> Value.MAESTRO
                            ENROUTE -> Value.ENROUTE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            VISA -> Known.VISA
                            MASTERCARD -> Known.MASTERCARD
                            AMEX -> Known.AMEX
                            OPTIMA -> Known.OPTIMA
                            DISCOVER -> Known.DISCOVER
                            DINERS_CLUB -> Known.DINERS_CLUB
                            JCB -> Known.JCB
                            MAESTRO -> Known.MAESTRO
                            ENROUTE -> Known.ENROUTE
                            else -> throw TelnyxInvalidDataException("Unknown CardType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): CardType = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CardType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Step error for which this prompt applies. */
                class ErrorType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val TIMEOUT = of("timeout")

                        @JvmField val INVALID_CARD_NUMBER = of("invalid-card-number")

                        @JvmField val INVALID_CARD_TYPE = of("invalid-card-type")

                        @JvmField val INVALID_DATE = of("invalid-date")

                        @JvmField val INVALID_SECURITY_CODE = of("invalid-security-code")

                        @JvmField val INVALID_POSTAL_CODE = of("invalid-postal-code")

                        @JvmField
                        val INVALID_BANK_ROUTING_NUMBER = of("invalid-bank-routing-number")

                        @JvmField
                        val INVALID_BANK_ACCOUNT_NUMBER = of("invalid-bank-account-number")

                        @JvmField val INPUT_MATCHING_FAILED = of("input-matching-failed")

                        @JvmStatic fun of(value: String) = ErrorType(JsonField.of(value))
                    }

                    /** An enum containing [ErrorType]'s known values. */
                    enum class Known {
                        TIMEOUT,
                        INVALID_CARD_NUMBER,
                        INVALID_CARD_TYPE,
                        INVALID_DATE,
                        INVALID_SECURITY_CODE,
                        INVALID_POSTAL_CODE,
                        INVALID_BANK_ROUTING_NUMBER,
                        INVALID_BANK_ACCOUNT_NUMBER,
                        INPUT_MATCHING_FAILED,
                    }

                    /**
                     * An enum containing [ErrorType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ErrorType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        TIMEOUT,
                        INVALID_CARD_NUMBER,
                        INVALID_CARD_TYPE,
                        INVALID_DATE,
                        INVALID_SECURITY_CODE,
                        INVALID_POSTAL_CODE,
                        INVALID_BANK_ROUTING_NUMBER,
                        INVALID_BANK_ACCOUNT_NUMBER,
                        INPUT_MATCHING_FAILED,
                        /**
                         * An enum member indicating that [ErrorType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            TIMEOUT -> Value.TIMEOUT
                            INVALID_CARD_NUMBER -> Value.INVALID_CARD_NUMBER
                            INVALID_CARD_TYPE -> Value.INVALID_CARD_TYPE
                            INVALID_DATE -> Value.INVALID_DATE
                            INVALID_SECURITY_CODE -> Value.INVALID_SECURITY_CODE
                            INVALID_POSTAL_CODE -> Value.INVALID_POSTAL_CODE
                            INVALID_BANK_ROUTING_NUMBER -> Value.INVALID_BANK_ROUTING_NUMBER
                            INVALID_BANK_ACCOUNT_NUMBER -> Value.INVALID_BANK_ACCOUNT_NUMBER
                            INPUT_MATCHING_FAILED -> Value.INPUT_MATCHING_FAILED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            TIMEOUT -> Known.TIMEOUT
                            INVALID_CARD_NUMBER -> Known.INVALID_CARD_NUMBER
                            INVALID_CARD_TYPE -> Known.INVALID_CARD_TYPE
                            INVALID_DATE -> Known.INVALID_DATE
                            INVALID_SECURITY_CODE -> Known.INVALID_SECURITY_CODE
                            INVALID_POSTAL_CODE -> Known.INVALID_POSTAL_CODE
                            INVALID_BANK_ROUTING_NUMBER -> Known.INVALID_BANK_ROUTING_NUMBER
                            INVALID_BANK_ACCOUNT_NUMBER -> Known.INVALID_BANK_ACCOUNT_NUMBER
                            INPUT_MATCHING_FAILED -> Known.INPUT_MATCHING_FAILED
                            else -> throw TelnyxInvalidDataException("Unknown ErrorType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): ErrorType = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ErrorType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PayToolPrompt &&
                        text == other.text &&
                        attempt == other.attempt &&
                        cardType == other.cardType &&
                        errorType == other.errorType &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(text, attempt, cardType, errorType, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PayToolPrompt{text=$text, attempt=$attempt, cardType=$cardType, errorType=$errorType, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Prompts &&
                bankAccountNumber == other.bankAccountNumber &&
                bankRoutingNumber == other.bankRoutingNumber &&
                expirationDate == other.expirationDate &&
                paymentCardNumber == other.paymentCardNumber &&
                postalCode == other.postalCode &&
                securityCode == other.securityCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                bankAccountNumber,
                bankRoutingNumber,
                expirationDate,
                paymentCardNumber,
                postalCode,
                securityCode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Prompts{bankAccountNumber=$bankAccountNumber, bankRoutingNumber=$bankRoutingNumber, expirationDate=$expirationDate, paymentCardNumber=$paymentCardNumber, postalCode=$postalCode, securityCode=$securityCode, additionalProperties=$additionalProperties}"
    }

    class ValidCardType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val VISA = of("visa")

            @JvmField val MASTERCARD = of("mastercard")

            @JvmField val AMEX = of("amex")

            @JvmField val MAESTRO = of("maestro")

            @JvmField val DISCOVER = of("discover")

            @JvmField val OPTIMA = of("optima")

            @JvmField val JCB = of("jcb")

            @JvmField val DINERS_CLUB = of("diners-club")

            @JvmField val ENROUTE = of("enroute")

            @JvmStatic fun of(value: String) = ValidCardType(JsonField.of(value))
        }

        /** An enum containing [ValidCardType]'s known values. */
        enum class Known {
            VISA,
            MASTERCARD,
            AMEX,
            MAESTRO,
            DISCOVER,
            OPTIMA,
            JCB,
            DINERS_CLUB,
            ENROUTE,
        }

        /**
         * An enum containing [ValidCardType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ValidCardType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VISA,
            MASTERCARD,
            AMEX,
            MAESTRO,
            DISCOVER,
            OPTIMA,
            JCB,
            DINERS_CLUB,
            ENROUTE,
            /**
             * An enum member indicating that [ValidCardType] was instantiated with an unknown
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
                VISA -> Value.VISA
                MASTERCARD -> Value.MASTERCARD
                AMEX -> Value.AMEX
                MAESTRO -> Value.MAESTRO
                DISCOVER -> Value.DISCOVER
                OPTIMA -> Value.OPTIMA
                JCB -> Value.JCB
                DINERS_CLUB -> Value.DINERS_CLUB
                ENROUTE -> Value.ENROUTE
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
                VISA -> Known.VISA
                MASTERCARD -> Known.MASTERCARD
                AMEX -> Known.AMEX
                MAESTRO -> Known.MAESTRO
                DISCOVER -> Known.DISCOVER
                OPTIMA -> Known.OPTIMA
                JCB -> Known.JCB
                DINERS_CLUB -> Known.DINERS_CLUB
                ENROUTE -> Known.ENROUTE
                else -> throw TelnyxInvalidDataException("Unknown ValidCardType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ValidCardType = apply {
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

            return other is ValidCardType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PayToolParams &&
            connectorName == other.connectorName &&
            connectorParameters == other.connectorParameters &&
            currency == other.currency &&
            description == other.description &&
            interDigitTimeoutMillis == other.interDigitTimeoutMillis &&
            maxAttempts == other.maxAttempts &&
            minPostalCodeLength == other.minPostalCodeLength &&
            paymentMethod == other.paymentMethod &&
            postalCode == other.postalCode &&
            prompts == other.prompts &&
            timeoutMillis == other.timeoutMillis &&
            validCardTypes == other.validCardTypes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            connectorName,
            connectorParameters,
            currency,
            description,
            interDigitTimeoutMillis,
            maxAttempts,
            minPostalCodeLength,
            paymentMethod,
            postalCode,
            prompts,
            timeoutMillis,
            validCardTypes,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayToolParams{connectorName=$connectorName, connectorParameters=$connectorParameters, currency=$currency, description=$description, interDigitTimeoutMillis=$interDigitTimeoutMillis, maxAttempts=$maxAttempts, minPostalCodeLength=$minPostalCodeLength, paymentMethod=$paymentMethod, postalCode=$postalCode, prompts=$prompts, timeoutMillis=$timeoutMillis, validCardTypes=$validCardTypes, additionalProperties=$additionalProperties}"
}
