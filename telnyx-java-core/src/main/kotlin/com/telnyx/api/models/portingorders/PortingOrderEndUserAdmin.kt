// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PortingOrderEndUserAdmin
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountNumber: JsonField<String>,
    private val authPersonName: JsonField<String>,
    private val billingPhoneNumber: JsonField<String>,
    private val businessIdentifier: JsonField<String>,
    private val entityName: JsonField<String>,
    private val pinPasscode: JsonField<String>,
    private val taxIdentifier: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_number")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("auth_person_name")
        @ExcludeMissing
        authPersonName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_phone_number")
        @ExcludeMissing
        billingPhoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("business_identifier")
        @ExcludeMissing
        businessIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entity_name")
        @ExcludeMissing
        entityName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pin_passcode")
        @ExcludeMissing
        pinPasscode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        taxIdentifier: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountNumber,
        authPersonName,
        billingPhoneNumber,
        businessIdentifier,
        entityName,
        pinPasscode,
        taxIdentifier,
        mutableMapOf(),
    )

    /**
     * The authorized person's account number with the current service provider
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountNumber(): Optional<String> = accountNumber.getOptional("account_number")

    /**
     * Name of person authorizing the porting order
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authPersonName(): Optional<String> = authPersonName.getOptional("auth_person_name")

    /**
     * Billing phone number associated with these phone numbers
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingPhoneNumber(): Optional<String> =
        billingPhoneNumber.getOptional("billing_phone_number")

    /**
     * European business identification number. Applicable only in the European Union
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessIdentifier(): Optional<String> =
        businessIdentifier.getOptional("business_identifier")

    /**
     * Person Name or Company name requesting the port
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityName(): Optional<String> = entityName.getOptional("entity_name")

    /**
     * PIN/passcode possibly required by the old service provider for extra verification
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pinPasscode(): Optional<String> = pinPasscode.getOptional("pin_passcode")

    /**
     * European tax identification number. Applicable only in the European Union
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxIdentifier(): Optional<String> = taxIdentifier.getOptional("tax_identifier")

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * Returns the raw JSON value of [authPersonName].
     *
     * Unlike [authPersonName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth_person_name")
    @ExcludeMissing
    fun _authPersonName(): JsonField<String> = authPersonName

    /**
     * Returns the raw JSON value of [billingPhoneNumber].
     *
     * Unlike [billingPhoneNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("billing_phone_number")
    @ExcludeMissing
    fun _billingPhoneNumber(): JsonField<String> = billingPhoneNumber

    /**
     * Returns the raw JSON value of [businessIdentifier].
     *
     * Unlike [businessIdentifier], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("business_identifier")
    @ExcludeMissing
    fun _businessIdentifier(): JsonField<String> = businessIdentifier

    /**
     * Returns the raw JSON value of [entityName].
     *
     * Unlike [entityName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity_name") @ExcludeMissing fun _entityName(): JsonField<String> = entityName

    /**
     * Returns the raw JSON value of [pinPasscode].
     *
     * Unlike [pinPasscode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pin_passcode")
    @ExcludeMissing
    fun _pinPasscode(): JsonField<String> = pinPasscode

    /**
     * Returns the raw JSON value of [taxIdentifier].
     *
     * Unlike [taxIdentifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_identifier")
    @ExcludeMissing
    fun _taxIdentifier(): JsonField<String> = taxIdentifier

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

        /** Returns a mutable builder for constructing an instance of [PortingOrderEndUserAdmin]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderEndUserAdmin]. */
    class Builder internal constructor() {

        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var authPersonName: JsonField<String> = JsonMissing.of()
        private var billingPhoneNumber: JsonField<String> = JsonMissing.of()
        private var businessIdentifier: JsonField<String> = JsonMissing.of()
        private var entityName: JsonField<String> = JsonMissing.of()
        private var pinPasscode: JsonField<String> = JsonMissing.of()
        private var taxIdentifier: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingOrderEndUserAdmin: PortingOrderEndUserAdmin) = apply {
            accountNumber = portingOrderEndUserAdmin.accountNumber
            authPersonName = portingOrderEndUserAdmin.authPersonName
            billingPhoneNumber = portingOrderEndUserAdmin.billingPhoneNumber
            businessIdentifier = portingOrderEndUserAdmin.businessIdentifier
            entityName = portingOrderEndUserAdmin.entityName
            pinPasscode = portingOrderEndUserAdmin.pinPasscode
            taxIdentifier = portingOrderEndUserAdmin.taxIdentifier
            additionalProperties = portingOrderEndUserAdmin.additionalProperties.toMutableMap()
        }

        /** The authorized person's account number with the current service provider */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** Name of person authorizing the porting order */
        fun authPersonName(authPersonName: String) = authPersonName(JsonField.of(authPersonName))

        /**
         * Sets [Builder.authPersonName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authPersonName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authPersonName(authPersonName: JsonField<String>) = apply {
            this.authPersonName = authPersonName
        }

        /** Billing phone number associated with these phone numbers */
        fun billingPhoneNumber(billingPhoneNumber: String) =
            billingPhoneNumber(JsonField.of(billingPhoneNumber))

        /**
         * Sets [Builder.billingPhoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingPhoneNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingPhoneNumber(billingPhoneNumber: JsonField<String>) = apply {
            this.billingPhoneNumber = billingPhoneNumber
        }

        /** European business identification number. Applicable only in the European Union */
        fun businessIdentifier(businessIdentifier: String) =
            businessIdentifier(JsonField.of(businessIdentifier))

        /**
         * Sets [Builder.businessIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessIdentifier] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessIdentifier(businessIdentifier: JsonField<String>) = apply {
            this.businessIdentifier = businessIdentifier
        }

        /** Person Name or Company name requesting the port */
        fun entityName(entityName: String) = entityName(JsonField.of(entityName))

        /**
         * Sets [Builder.entityName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entityName(entityName: JsonField<String>) = apply { this.entityName = entityName }

        /** PIN/passcode possibly required by the old service provider for extra verification */
        fun pinPasscode(pinPasscode: String) = pinPasscode(JsonField.of(pinPasscode))

        /**
         * Sets [Builder.pinPasscode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pinPasscode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pinPasscode(pinPasscode: JsonField<String>) = apply { this.pinPasscode = pinPasscode }

        /** European tax identification number. Applicable only in the European Union */
        fun taxIdentifier(taxIdentifier: String) = taxIdentifier(JsonField.of(taxIdentifier))

        /**
         * Sets [Builder.taxIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxIdentifier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
            this.taxIdentifier = taxIdentifier
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
         * Returns an immutable instance of [PortingOrderEndUserAdmin].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderEndUserAdmin =
            PortingOrderEndUserAdmin(
                accountNumber,
                authPersonName,
                billingPhoneNumber,
                businessIdentifier,
                entityName,
                pinPasscode,
                taxIdentifier,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingOrderEndUserAdmin = apply {
        if (validated) {
            return@apply
        }

        accountNumber()
        authPersonName()
        billingPhoneNumber()
        businessIdentifier()
        entityName()
        pinPasscode()
        taxIdentifier()
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
        (if (accountNumber.asKnown().isPresent) 1 else 0) +
            (if (authPersonName.asKnown().isPresent) 1 else 0) +
            (if (billingPhoneNumber.asKnown().isPresent) 1 else 0) +
            (if (businessIdentifier.asKnown().isPresent) 1 else 0) +
            (if (entityName.asKnown().isPresent) 1 else 0) +
            (if (pinPasscode.asKnown().isPresent) 1 else 0) +
            (if (taxIdentifier.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderEndUserAdmin &&
            accountNumber == other.accountNumber &&
            authPersonName == other.authPersonName &&
            billingPhoneNumber == other.billingPhoneNumber &&
            businessIdentifier == other.businessIdentifier &&
            entityName == other.entityName &&
            pinPasscode == other.pinPasscode &&
            taxIdentifier == other.taxIdentifier &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountNumber,
            authPersonName,
            billingPhoneNumber,
            businessIdentifier,
            entityName,
            pinPasscode,
            taxIdentifier,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrderEndUserAdmin{accountNumber=$accountNumber, authPersonName=$authPersonName, billingPhoneNumber=$billingPhoneNumber, businessIdentifier=$businessIdentifier, entityName=$entityName, pinPasscode=$pinPasscode, taxIdentifier=$taxIdentifier, additionalProperties=$additionalProperties}"
}
