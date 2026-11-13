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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortingOrdersExceptionType
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val code: JsonField<Code>,
    private val description: JsonField<String>,
    private val remediation: JsonField<Remediation>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<Code> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remediation")
        @ExcludeMissing
        remediation: JsonField<Remediation> = JsonMissing.of(),
    ) : this(code, description, remediation, mutableMapOf())

    /**
     * Identifier of an exception type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): Code = code.getRequired("code")

    /**
     * Description of an exception type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * Structured remediation steps so an agent can map the exception to a fix via the API alone
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun remediation(): Remediation = remediation.getRequired("remediation")

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Code> = code

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [remediation].
     *
     * Unlike [remediation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remediation")
    @ExcludeMissing
    fun _remediation(): JsonField<Remediation> = remediation

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
         * Returns a mutable builder for constructing an instance of [PortingOrdersExceptionType].
         *
         * The following fields are required:
         * ```java
         * .code()
         * .description()
         * .remediation()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrdersExceptionType]. */
    class Builder internal constructor() {

        private var code: JsonField<Code>? = null
        private var description: JsonField<String>? = null
        private var remediation: JsonField<Remediation>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingOrdersExceptionType: PortingOrdersExceptionType) = apply {
            code = portingOrdersExceptionType.code
            description = portingOrdersExceptionType.description
            remediation = portingOrdersExceptionType.remediation
            additionalProperties = portingOrdersExceptionType.additionalProperties.toMutableMap()
        }

        /** Identifier of an exception type */
        fun code(code: Code) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Code] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Code>) = apply { this.code = code }

        /** Description of an exception type */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * Structured remediation steps so an agent can map the exception to a fix via the API alone
         */
        fun remediation(remediation: Remediation) = remediation(JsonField.of(remediation))

        /**
         * Sets [Builder.remediation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remediation] with a well-typed [Remediation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remediation(remediation: JsonField<Remediation>) = apply {
            this.remediation = remediation
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
         * Returns an immutable instance of [PortingOrdersExceptionType].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .code()
         * .description()
         * .remediation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PortingOrdersExceptionType =
            PortingOrdersExceptionType(
                checkRequired("code", code),
                checkRequired("description", description),
                checkRequired("remediation", remediation),
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
    fun validate(): PortingOrdersExceptionType = apply {
        if (validated) {
            return@apply
        }

        code().validate()
        description()
        remediation().validate()
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
        (code.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (remediation.asKnown().getOrNull()?.validity() ?: 0)

    /** Identifier of an exception type */
    class Code @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACCOUNT_NUMBER_MISMATCH = of("ACCOUNT_NUMBER_MISMATCH")

            @JvmField
            val ACCOUNT_NUMBER_MISMATCH_OR_MISSING = of("ACCOUNT_NUMBER_MISMATCH_OR_MISSING")

            @JvmField val ACCOUNT_NUMBER_REQUIRED = of("ACCOUNT_NUMBER_REQUIRED")

            @JvmField val ALL_DATA_MISMATCH = of("ALL_DATA_MISMATCH")

            @JvmField val AUTH_PERSON_MISMATCH = of("AUTH_PERSON_MISMATCH")

            @JvmField val BTN_ATN_MISMATCH = of("BTN_ATN_MISMATCH")

            @JvmField val DOCUMENT_BLOCKED = of("DOCUMENT_BLOCKED")

            @JvmField val ENTITY_NAME_MISMATCH = of("ENTITY_NAME_MISMATCH")

            @JvmField val FOC_EXPIRED = of("FOC_EXPIRED")

            @JvmField val FOC_REJECTED = of("FOC_REJECTED")

            @JvmField val INCORRECT_LOA_TEMPLATE = of("INCORRECT_LOA_TEMPLATE")

            @JvmField
            val INCORRECT_LOSING_COMMUNICATION_PROVIDER =
                of("INCORRECT_LOSING_COMMUNICATION_PROVIDER")

            @JvmField val INCORRECT_PORT_TYPE = of("INCORRECT_PORT_TYPE")

            @JvmField val INVALID_OR_MISSING_INVOICE = of("INVALID_OR_MISSING_INVOICE")

            @JvmField val INVALID_OR_MISSING_LOA = of("INVALID_OR_MISSING_LOA")

            @JvmField val INVALID_SIGNATURE_ON_THE_LOA = of("INVALID_SIGNATURE_ON_THE_LOA")

            @JvmField val J2_PASSCODE_PIN_INVALID = of("J2_PASSCODE_PIN_INVALID")

            @JvmField val LOCATION_MISMATCH = of("LOCATION_MISMATCH")

            @JvmField val LSR_PENDING = of("LSR_PENDING")

            @JvmField val MAIN_BTN_PORTING = of("MAIN_BTN_PORTING")

            @JvmField val MISSING_MANDATORY_REQUIREMENT = of("MISSING_MANDATORY_REQUIREMENT")

            @JvmField val MISSING_NUMBER_DETAILS = of("MISSING_NUMBER_DETAILS")

            @JvmField val NUMBER_HAS_ASSOCIATED_SERVICES = of("NUMBER_HAS_ASSOCIATED_SERVICES")

            @JvmField val ORDER_REFLOW = of("ORDER_REFLOW")

            @JvmField val OSP_IRRESPONSIVE = of("OSP_IRRESPONSIVE")

            @JvmField val OTHER = of("OTHER")

            @JvmField val PASSCODE_PIN_INVALID = of("PASSCODE_PIN_INVALID")

            @JvmField val PHONE_NUMBER_MISMATCH = of("PHONE_NUMBER_MISMATCH")

            @JvmField val PHONE_NUMBER_NOT_PORTABLE = of("PHONE_NUMBER_NOT_PORTABLE")

            @JvmField val POSTAL_CODE_MISMATCH = of("POSTAL_CODE_MISMATCH")

            @JvmField val RATE_CENTER_NOT_PORTABLE = of("RATE_CENTER_NOT_PORTABLE")

            @JvmField val RESELLER_INVALID = of("RESELLER_INVALID")

            @JvmField val STRANDED_SERVICES_NEED_NEW_BTN = of("STRANDED_SERVICES_NEED_NEW_BTN")

            @JvmField val SV_CONFLICT = of("SV_CONFLICT")

            @JvmField val SV_UNKNOWN_FAILURE = of("SV_UNKNOWN_FAILURE")

            @JvmField val TNS_ON_MULTIPLE_ACCOUNTS = of("TNS_ON_MULTIPLE_ACCOUNTS")

            @JvmField val TN_BUILD_CONFLICT = of("TN_BUILD_CONFLICT")

            @JvmField val TN_DISCONNECTED = of("TN_DISCONNECTED")

            @JvmField val UNAUTHORIZED_PERSON_SIGNATURE = of("UNAUTHORIZED_PERSON_SIGNATURE")

            @JvmStatic fun of(value: String) = Code(JsonField.of(value))
        }

        /** An enum containing [Code]'s known values. */
        enum class Known {
            ACCOUNT_NUMBER_MISMATCH,
            ACCOUNT_NUMBER_MISMATCH_OR_MISSING,
            ACCOUNT_NUMBER_REQUIRED,
            ALL_DATA_MISMATCH,
            AUTH_PERSON_MISMATCH,
            BTN_ATN_MISMATCH,
            DOCUMENT_BLOCKED,
            ENTITY_NAME_MISMATCH,
            FOC_EXPIRED,
            FOC_REJECTED,
            INCORRECT_LOA_TEMPLATE,
            INCORRECT_LOSING_COMMUNICATION_PROVIDER,
            INCORRECT_PORT_TYPE,
            INVALID_OR_MISSING_INVOICE,
            INVALID_OR_MISSING_LOA,
            INVALID_SIGNATURE_ON_THE_LOA,
            J2_PASSCODE_PIN_INVALID,
            LOCATION_MISMATCH,
            LSR_PENDING,
            MAIN_BTN_PORTING,
            MISSING_MANDATORY_REQUIREMENT,
            MISSING_NUMBER_DETAILS,
            NUMBER_HAS_ASSOCIATED_SERVICES,
            ORDER_REFLOW,
            OSP_IRRESPONSIVE,
            OTHER,
            PASSCODE_PIN_INVALID,
            PHONE_NUMBER_MISMATCH,
            PHONE_NUMBER_NOT_PORTABLE,
            POSTAL_CODE_MISMATCH,
            RATE_CENTER_NOT_PORTABLE,
            RESELLER_INVALID,
            STRANDED_SERVICES_NEED_NEW_BTN,
            SV_CONFLICT,
            SV_UNKNOWN_FAILURE,
            TNS_ON_MULTIPLE_ACCOUNTS,
            TN_BUILD_CONFLICT,
            TN_DISCONNECTED,
            UNAUTHORIZED_PERSON_SIGNATURE,
        }

        /**
         * An enum containing [Code]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Code] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCOUNT_NUMBER_MISMATCH,
            ACCOUNT_NUMBER_MISMATCH_OR_MISSING,
            ACCOUNT_NUMBER_REQUIRED,
            ALL_DATA_MISMATCH,
            AUTH_PERSON_MISMATCH,
            BTN_ATN_MISMATCH,
            DOCUMENT_BLOCKED,
            ENTITY_NAME_MISMATCH,
            FOC_EXPIRED,
            FOC_REJECTED,
            INCORRECT_LOA_TEMPLATE,
            INCORRECT_LOSING_COMMUNICATION_PROVIDER,
            INCORRECT_PORT_TYPE,
            INVALID_OR_MISSING_INVOICE,
            INVALID_OR_MISSING_LOA,
            INVALID_SIGNATURE_ON_THE_LOA,
            J2_PASSCODE_PIN_INVALID,
            LOCATION_MISMATCH,
            LSR_PENDING,
            MAIN_BTN_PORTING,
            MISSING_MANDATORY_REQUIREMENT,
            MISSING_NUMBER_DETAILS,
            NUMBER_HAS_ASSOCIATED_SERVICES,
            ORDER_REFLOW,
            OSP_IRRESPONSIVE,
            OTHER,
            PASSCODE_PIN_INVALID,
            PHONE_NUMBER_MISMATCH,
            PHONE_NUMBER_NOT_PORTABLE,
            POSTAL_CODE_MISMATCH,
            RATE_CENTER_NOT_PORTABLE,
            RESELLER_INVALID,
            STRANDED_SERVICES_NEED_NEW_BTN,
            SV_CONFLICT,
            SV_UNKNOWN_FAILURE,
            TNS_ON_MULTIPLE_ACCOUNTS,
            TN_BUILD_CONFLICT,
            TN_DISCONNECTED,
            UNAUTHORIZED_PERSON_SIGNATURE,
            /** An enum member indicating that [Code] was instantiated with an unknown value. */
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
                ACCOUNT_NUMBER_MISMATCH -> Value.ACCOUNT_NUMBER_MISMATCH
                ACCOUNT_NUMBER_MISMATCH_OR_MISSING -> Value.ACCOUNT_NUMBER_MISMATCH_OR_MISSING
                ACCOUNT_NUMBER_REQUIRED -> Value.ACCOUNT_NUMBER_REQUIRED
                ALL_DATA_MISMATCH -> Value.ALL_DATA_MISMATCH
                AUTH_PERSON_MISMATCH -> Value.AUTH_PERSON_MISMATCH
                BTN_ATN_MISMATCH -> Value.BTN_ATN_MISMATCH
                DOCUMENT_BLOCKED -> Value.DOCUMENT_BLOCKED
                ENTITY_NAME_MISMATCH -> Value.ENTITY_NAME_MISMATCH
                FOC_EXPIRED -> Value.FOC_EXPIRED
                FOC_REJECTED -> Value.FOC_REJECTED
                INCORRECT_LOA_TEMPLATE -> Value.INCORRECT_LOA_TEMPLATE
                INCORRECT_LOSING_COMMUNICATION_PROVIDER ->
                    Value.INCORRECT_LOSING_COMMUNICATION_PROVIDER
                INCORRECT_PORT_TYPE -> Value.INCORRECT_PORT_TYPE
                INVALID_OR_MISSING_INVOICE -> Value.INVALID_OR_MISSING_INVOICE
                INVALID_OR_MISSING_LOA -> Value.INVALID_OR_MISSING_LOA
                INVALID_SIGNATURE_ON_THE_LOA -> Value.INVALID_SIGNATURE_ON_THE_LOA
                J2_PASSCODE_PIN_INVALID -> Value.J2_PASSCODE_PIN_INVALID
                LOCATION_MISMATCH -> Value.LOCATION_MISMATCH
                LSR_PENDING -> Value.LSR_PENDING
                MAIN_BTN_PORTING -> Value.MAIN_BTN_PORTING
                MISSING_MANDATORY_REQUIREMENT -> Value.MISSING_MANDATORY_REQUIREMENT
                MISSING_NUMBER_DETAILS -> Value.MISSING_NUMBER_DETAILS
                NUMBER_HAS_ASSOCIATED_SERVICES -> Value.NUMBER_HAS_ASSOCIATED_SERVICES
                ORDER_REFLOW -> Value.ORDER_REFLOW
                OSP_IRRESPONSIVE -> Value.OSP_IRRESPONSIVE
                OTHER -> Value.OTHER
                PASSCODE_PIN_INVALID -> Value.PASSCODE_PIN_INVALID
                PHONE_NUMBER_MISMATCH -> Value.PHONE_NUMBER_MISMATCH
                PHONE_NUMBER_NOT_PORTABLE -> Value.PHONE_NUMBER_NOT_PORTABLE
                POSTAL_CODE_MISMATCH -> Value.POSTAL_CODE_MISMATCH
                RATE_CENTER_NOT_PORTABLE -> Value.RATE_CENTER_NOT_PORTABLE
                RESELLER_INVALID -> Value.RESELLER_INVALID
                STRANDED_SERVICES_NEED_NEW_BTN -> Value.STRANDED_SERVICES_NEED_NEW_BTN
                SV_CONFLICT -> Value.SV_CONFLICT
                SV_UNKNOWN_FAILURE -> Value.SV_UNKNOWN_FAILURE
                TNS_ON_MULTIPLE_ACCOUNTS -> Value.TNS_ON_MULTIPLE_ACCOUNTS
                TN_BUILD_CONFLICT -> Value.TN_BUILD_CONFLICT
                TN_DISCONNECTED -> Value.TN_DISCONNECTED
                UNAUTHORIZED_PERSON_SIGNATURE -> Value.UNAUTHORIZED_PERSON_SIGNATURE
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
                ACCOUNT_NUMBER_MISMATCH -> Known.ACCOUNT_NUMBER_MISMATCH
                ACCOUNT_NUMBER_MISMATCH_OR_MISSING -> Known.ACCOUNT_NUMBER_MISMATCH_OR_MISSING
                ACCOUNT_NUMBER_REQUIRED -> Known.ACCOUNT_NUMBER_REQUIRED
                ALL_DATA_MISMATCH -> Known.ALL_DATA_MISMATCH
                AUTH_PERSON_MISMATCH -> Known.AUTH_PERSON_MISMATCH
                BTN_ATN_MISMATCH -> Known.BTN_ATN_MISMATCH
                DOCUMENT_BLOCKED -> Known.DOCUMENT_BLOCKED
                ENTITY_NAME_MISMATCH -> Known.ENTITY_NAME_MISMATCH
                FOC_EXPIRED -> Known.FOC_EXPIRED
                FOC_REJECTED -> Known.FOC_REJECTED
                INCORRECT_LOA_TEMPLATE -> Known.INCORRECT_LOA_TEMPLATE
                INCORRECT_LOSING_COMMUNICATION_PROVIDER ->
                    Known.INCORRECT_LOSING_COMMUNICATION_PROVIDER
                INCORRECT_PORT_TYPE -> Known.INCORRECT_PORT_TYPE
                INVALID_OR_MISSING_INVOICE -> Known.INVALID_OR_MISSING_INVOICE
                INVALID_OR_MISSING_LOA -> Known.INVALID_OR_MISSING_LOA
                INVALID_SIGNATURE_ON_THE_LOA -> Known.INVALID_SIGNATURE_ON_THE_LOA
                J2_PASSCODE_PIN_INVALID -> Known.J2_PASSCODE_PIN_INVALID
                LOCATION_MISMATCH -> Known.LOCATION_MISMATCH
                LSR_PENDING -> Known.LSR_PENDING
                MAIN_BTN_PORTING -> Known.MAIN_BTN_PORTING
                MISSING_MANDATORY_REQUIREMENT -> Known.MISSING_MANDATORY_REQUIREMENT
                MISSING_NUMBER_DETAILS -> Known.MISSING_NUMBER_DETAILS
                NUMBER_HAS_ASSOCIATED_SERVICES -> Known.NUMBER_HAS_ASSOCIATED_SERVICES
                ORDER_REFLOW -> Known.ORDER_REFLOW
                OSP_IRRESPONSIVE -> Known.OSP_IRRESPONSIVE
                OTHER -> Known.OTHER
                PASSCODE_PIN_INVALID -> Known.PASSCODE_PIN_INVALID
                PHONE_NUMBER_MISMATCH -> Known.PHONE_NUMBER_MISMATCH
                PHONE_NUMBER_NOT_PORTABLE -> Known.PHONE_NUMBER_NOT_PORTABLE
                POSTAL_CODE_MISMATCH -> Known.POSTAL_CODE_MISMATCH
                RATE_CENTER_NOT_PORTABLE -> Known.RATE_CENTER_NOT_PORTABLE
                RESELLER_INVALID -> Known.RESELLER_INVALID
                STRANDED_SERVICES_NEED_NEW_BTN -> Known.STRANDED_SERVICES_NEED_NEW_BTN
                SV_CONFLICT -> Known.SV_CONFLICT
                SV_UNKNOWN_FAILURE -> Known.SV_UNKNOWN_FAILURE
                TNS_ON_MULTIPLE_ACCOUNTS -> Known.TNS_ON_MULTIPLE_ACCOUNTS
                TN_BUILD_CONFLICT -> Known.TN_BUILD_CONFLICT
                TN_DISCONNECTED -> Known.TN_DISCONNECTED
                UNAUTHORIZED_PERSON_SIGNATURE -> Known.UNAUTHORIZED_PERSON_SIGNATURE
                else -> throw TelnyxInvalidDataException("Unknown Code: $value")
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
        fun validate(): Code = apply {
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

            return other is Code && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Structured remediation steps so an agent can map the exception to a fix via the API alone */
    class Remediation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val action: JsonField<Action>,
        private val fields: JsonField<List<String>>,
        private val requiredDocument: JsonField<RequiredDocument>,
        private val retryable: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
            @JsonProperty("fields")
            @ExcludeMissing
            fields: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("required_document")
            @ExcludeMissing
            requiredDocument: JsonField<RequiredDocument> = JsonMissing.of(),
            @JsonProperty("retryable")
            @ExcludeMissing
            retryable: JsonField<Boolean> = JsonMissing.of(),
        ) : this(action, fields, requiredDocument, retryable, mutableMapOf())

        /**
         * The type of remediation action to take
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun action(): Action = action.getRequired("action")

        /**
         * Patchable field paths to correct, empty when no field update applies
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fields(): List<String> = fields.getRequired("fields")

        /**
         * The document to (re)upload, when applicable
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requiredDocument(): Optional<RequiredDocument> =
            requiredDocument.getOptional("required_document")

        /**
         * Whether resubmission or polling alone can unblock the order
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun retryable(): Boolean = retryable.getRequired("retryable")

        /**
         * Returns the raw JSON value of [action].
         *
         * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

        /**
         * Returns the raw JSON value of [fields].
         *
         * Unlike [fields], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fields") @ExcludeMissing fun _fields(): JsonField<List<String>> = fields

        /**
         * Returns the raw JSON value of [requiredDocument].
         *
         * Unlike [requiredDocument], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("required_document")
        @ExcludeMissing
        fun _requiredDocument(): JsonField<RequiredDocument> = requiredDocument

        /**
         * Returns the raw JSON value of [retryable].
         *
         * Unlike [retryable], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retryable") @ExcludeMissing fun _retryable(): JsonField<Boolean> = retryable

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
             * Returns a mutable builder for constructing an instance of [Remediation].
             *
             * The following fields are required:
             * ```java
             * .action()
             * .fields()
             * .requiredDocument()
             * .retryable()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Remediation]. */
        class Builder internal constructor() {

            private var action: JsonField<Action>? = null
            private var fields: JsonField<MutableList<String>>? = null
            private var requiredDocument: JsonField<RequiredDocument>? = null
            private var retryable: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(remediation: Remediation) = apply {
                action = remediation.action
                fields = remediation.fields.map { it.toMutableList() }
                requiredDocument = remediation.requiredDocument
                retryable = remediation.retryable
                additionalProperties = remediation.additionalProperties.toMutableMap()
            }

            /** The type of remediation action to take */
            fun action(action: Action) = action(JsonField.of(action))

            /**
             * Sets [Builder.action] to an arbitrary JSON value.
             *
             * You should usually call [Builder.action] with a well-typed [Action] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun action(action: JsonField<Action>) = apply { this.action = action }

            /** Patchable field paths to correct, empty when no field update applies */
            fun fields(fields: List<String>) = fields(JsonField.of(fields))

            /**
             * Sets [Builder.fields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fields] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fields(fields: JsonField<List<String>>) = apply {
                this.fields = fields.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [fields].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addField(field: String) = apply {
                fields =
                    (fields ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fields", it).add(field)
                    }
            }

            /** The document to (re)upload, when applicable */
            fun requiredDocument(requiredDocument: RequiredDocument?) =
                requiredDocument(JsonField.ofNullable(requiredDocument))

            /**
             * Alias for calling [Builder.requiredDocument] with `requiredDocument.orElse(null)`.
             */
            fun requiredDocument(requiredDocument: Optional<RequiredDocument>) =
                requiredDocument(requiredDocument.getOrNull())

            /**
             * Sets [Builder.requiredDocument] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requiredDocument] with a well-typed
             * [RequiredDocument] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun requiredDocument(requiredDocument: JsonField<RequiredDocument>) = apply {
                this.requiredDocument = requiredDocument
            }

            /** Whether resubmission or polling alone can unblock the order */
            fun retryable(retryable: Boolean) = retryable(JsonField.of(retryable))

            /**
             * Sets [Builder.retryable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retryable] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retryable(retryable: JsonField<Boolean>) = apply { this.retryable = retryable }

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
             * Returns an immutable instance of [Remediation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .action()
             * .fields()
             * .requiredDocument()
             * .retryable()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Remediation =
                Remediation(
                    checkRequired("action", action),
                    checkRequired("fields", fields).map { it.toImmutable() },
                    checkRequired("requiredDocument", requiredDocument),
                    checkRequired("retryable", retryable),
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
        fun validate(): Remediation = apply {
            if (validated) {
                return@apply
            }

            action().validate()
            fields()
            requiredDocument().ifPresent { it.validate() }
            retryable()
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
            (action.asKnown().getOrNull()?.validity() ?: 0) +
                (fields.asKnown().getOrNull()?.size ?: 0) +
                (requiredDocument.asKnown().getOrNull()?.validity() ?: 0) +
                (if (retryable.asKnown().isPresent) 1 else 0)

        /** The type of remediation action to take */
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

                @JvmField val UPDATE_ORDER_FIELDS = of("update_order_fields")

                @JvmField val UPLOAD_DOCUMENT = of("upload_document")

                @JvmField val CREATE_ORDERS = of("create_orders")

                @JvmField val ASSIGN_FOC_DATETIME = of("assign_foc_datetime")

                @JvmField val WAIT = of("wait")

                @JvmField val EXTERNAL_ACTION = of("external_action")

                @JvmField val CONTACT_SUPPORT = of("contact_support")

                @JvmStatic fun of(value: String) = Action(JsonField.of(value))
            }

            /** An enum containing [Action]'s known values. */
            enum class Known {
                UPDATE_ORDER_FIELDS,
                UPLOAD_DOCUMENT,
                CREATE_ORDERS,
                ASSIGN_FOC_DATETIME,
                WAIT,
                EXTERNAL_ACTION,
                CONTACT_SUPPORT,
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
                UPDATE_ORDER_FIELDS,
                UPLOAD_DOCUMENT,
                CREATE_ORDERS,
                ASSIGN_FOC_DATETIME,
                WAIT,
                EXTERNAL_ACTION,
                CONTACT_SUPPORT,
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
                    UPDATE_ORDER_FIELDS -> Value.UPDATE_ORDER_FIELDS
                    UPLOAD_DOCUMENT -> Value.UPLOAD_DOCUMENT
                    CREATE_ORDERS -> Value.CREATE_ORDERS
                    ASSIGN_FOC_DATETIME -> Value.ASSIGN_FOC_DATETIME
                    WAIT -> Value.WAIT
                    EXTERNAL_ACTION -> Value.EXTERNAL_ACTION
                    CONTACT_SUPPORT -> Value.CONTACT_SUPPORT
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
                    UPDATE_ORDER_FIELDS -> Known.UPDATE_ORDER_FIELDS
                    UPLOAD_DOCUMENT -> Known.UPLOAD_DOCUMENT
                    CREATE_ORDERS -> Known.CREATE_ORDERS
                    ASSIGN_FOC_DATETIME -> Known.ASSIGN_FOC_DATETIME
                    WAIT -> Known.WAIT
                    EXTERNAL_ACTION -> Known.EXTERNAL_ACTION
                    CONTACT_SUPPORT -> Known.CONTACT_SUPPORT
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

        /** The document to (re)upload, when applicable */
        class RequiredDocument
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

                @JvmField val LOA = of("loa")

                @JvmField val INVOICE = of("invoice")

                @JvmField val NULL = of("null")

                @JvmStatic fun of(value: String) = RequiredDocument(JsonField.of(value))
            }

            /** An enum containing [RequiredDocument]'s known values. */
            enum class Known {
                LOA,
                INVOICE,
                NULL,
            }

            /**
             * An enum containing [RequiredDocument]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [RequiredDocument] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOA,
                INVOICE,
                NULL,
                /**
                 * An enum member indicating that [RequiredDocument] was instantiated with an
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
                    LOA -> Value.LOA
                    INVOICE -> Value.INVOICE
                    NULL -> Value.NULL
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
                    LOA -> Known.LOA
                    INVOICE -> Known.INVOICE
                    NULL -> Known.NULL
                    else -> throw TelnyxInvalidDataException("Unknown RequiredDocument: $value")
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
            fun validate(): RequiredDocument = apply {
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

                return other is RequiredDocument && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Remediation &&
                action == other.action &&
                fields == other.fields &&
                requiredDocument == other.requiredDocument &&
                retryable == other.retryable &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(action, fields, requiredDocument, retryable, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Remediation{action=$action, fields=$fields, requiredDocument=$requiredDocument, retryable=$retryable, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrdersExceptionType &&
            code == other.code &&
            description == other.description &&
            remediation == other.remediation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(code, description, remediation, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrdersExceptionType{code=$code, description=$description, remediation=$remediation, additionalProperties=$additionalProperties}"
}
