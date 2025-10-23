// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.requirementgroups

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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new requirement group */
class RequirementGroupCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun action(): Action = body.action()

    /**
     * ISO alpha 2 country code
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun countryCode(): String = body.countryCode()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumberType(): PhoneNumberType = body.phoneNumberType()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = body.customerReference()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regulatoryRequirements(): Optional<List<RegulatoryRequirement>> =
        body.regulatoryRequirements()

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _action(): JsonField<Action> = body._action()

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _countryCode(): JsonField<String> = body._countryCode()

    /**
     * Returns the raw JSON value of [phoneNumberType].
     *
     * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phoneNumberType(): JsonField<PhoneNumberType> = body._phoneNumberType()

    /**
     * Returns the raw JSON value of [customerReference].
     *
     * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customerReference(): JsonField<String> = body._customerReference()

    /**
     * Returns the raw JSON value of [regulatoryRequirements].
     *
     * Unlike [regulatoryRequirements], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _regulatoryRequirements(): JsonField<List<RegulatoryRequirement>> =
        body._regulatoryRequirements()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RequirementGroupCreateParams].
         *
         * The following fields are required:
         * ```java
         * .action()
         * .countryCode()
         * .phoneNumberType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RequirementGroupCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(requirementGroupCreateParams: RequirementGroupCreateParams) = apply {
            body = requirementGroupCreateParams.body.toBuilder()
            additionalHeaders = requirementGroupCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = requirementGroupCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [action]
         * - [countryCode]
         * - [phoneNumberType]
         * - [customerReference]
         * - [regulatoryRequirements]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun action(action: Action) = apply { body.action(action) }

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [Action] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<Action>) = apply { body.action(action) }

        /** ISO alpha 2 country code */
        fun countryCode(countryCode: String) = apply { body.countryCode(countryCode) }

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { body.countryCode(countryCode) }

        fun phoneNumberType(phoneNumberType: PhoneNumberType) = apply {
            body.phoneNumberType(phoneNumberType)
        }

        /**
         * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberType] with a well-typed [PhoneNumberType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumberType(phoneNumberType: JsonField<PhoneNumberType>) = apply {
            body.phoneNumberType(phoneNumberType)
        }

        fun customerReference(customerReference: String) = apply {
            body.customerReference(customerReference)
        }

        /**
         * Sets [Builder.customerReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerReference(customerReference: JsonField<String>) = apply {
            body.customerReference(customerReference)
        }

        fun regulatoryRequirements(regulatoryRequirements: List<RegulatoryRequirement>) = apply {
            body.regulatoryRequirements(regulatoryRequirements)
        }

        /**
         * Sets [Builder.regulatoryRequirements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regulatoryRequirements] with a well-typed
         * `List<RegulatoryRequirement>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun regulatoryRequirements(regulatoryRequirements: JsonField<List<RegulatoryRequirement>>) =
            apply {
                body.regulatoryRequirements(regulatoryRequirements)
            }

        /**
         * Adds a single [RegulatoryRequirement] to [regulatoryRequirements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRegulatoryRequirement(regulatoryRequirement: RegulatoryRequirement) = apply {
            body.addRegulatoryRequirement(regulatoryRequirement)
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
         * Returns an immutable instance of [RequirementGroupCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .action()
         * .countryCode()
         * .phoneNumberType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RequirementGroupCreateParams =
            RequirementGroupCreateParams(
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
        private val action: JsonField<Action>,
        private val countryCode: JsonField<String>,
        private val phoneNumberType: JsonField<PhoneNumberType>,
        private val customerReference: JsonField<String>,
        private val regulatoryRequirements: JsonField<List<RegulatoryRequirement>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
            @JsonProperty("country_code")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number_type")
            @ExcludeMissing
            phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of(),
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("regulatory_requirements")
            @ExcludeMissing
            regulatoryRequirements: JsonField<List<RegulatoryRequirement>> = JsonMissing.of(),
        ) : this(
            action,
            countryCode,
            phoneNumberType,
            customerReference,
            regulatoryRequirements,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun action(): Action = action.getRequired("action")

        /**
         * ISO alpha 2 country code
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countryCode(): String = countryCode.getRequired("country_code")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumberType(): PhoneNumberType = phoneNumberType.getRequired("phone_number_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regulatoryRequirements(): Optional<List<RegulatoryRequirement>> =
            regulatoryRequirements.getOptional("regulatory_requirements")

        /**
         * Returns the raw JSON value of [action].
         *
         * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country_code")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [phoneNumberType].
         *
         * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_number_type")
        @ExcludeMissing
        fun _phoneNumberType(): JsonField<PhoneNumberType> = phoneNumberType

        /**
         * Returns the raw JSON value of [customerReference].
         *
         * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_reference")
        @ExcludeMissing
        fun _customerReference(): JsonField<String> = customerReference

        /**
         * Returns the raw JSON value of [regulatoryRequirements].
         *
         * Unlike [regulatoryRequirements], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("regulatory_requirements")
        @ExcludeMissing
        fun _regulatoryRequirements(): JsonField<List<RegulatoryRequirement>> =
            regulatoryRequirements

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .action()
             * .countryCode()
             * .phoneNumberType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var action: JsonField<Action>? = null
            private var countryCode: JsonField<String>? = null
            private var phoneNumberType: JsonField<PhoneNumberType>? = null
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var regulatoryRequirements: JsonField<MutableList<RegulatoryRequirement>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                action = body.action
                countryCode = body.countryCode
                phoneNumberType = body.phoneNumberType
                customerReference = body.customerReference
                regulatoryRequirements = body.regulatoryRequirements.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun action(action: Action) = action(JsonField.of(action))

            /**
             * Sets [Builder.action] to an arbitrary JSON value.
             *
             * You should usually call [Builder.action] with a well-typed [Action] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun action(action: JsonField<Action>) = apply { this.action = action }

            /** ISO alpha 2 country code */
            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
            }

            fun phoneNumberType(phoneNumberType: PhoneNumberType) =
                phoneNumberType(JsonField.of(phoneNumberType))

            /**
             * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberType] with a well-typed [PhoneNumberType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun phoneNumberType(phoneNumberType: JsonField<PhoneNumberType>) = apply {
                this.phoneNumberType = phoneNumberType
            }

            fun customerReference(customerReference: String) =
                customerReference(JsonField.of(customerReference))

            /**
             * Sets [Builder.customerReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerReference] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerReference(customerReference: JsonField<String>) = apply {
                this.customerReference = customerReference
            }

            fun regulatoryRequirements(regulatoryRequirements: List<RegulatoryRequirement>) =
                regulatoryRequirements(JsonField.of(regulatoryRequirements))

            /**
             * Sets [Builder.regulatoryRequirements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regulatoryRequirements] with a well-typed
             * `List<RegulatoryRequirement>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun regulatoryRequirements(
                regulatoryRequirements: JsonField<List<RegulatoryRequirement>>
            ) = apply {
                this.regulatoryRequirements = regulatoryRequirements.map { it.toMutableList() }
            }

            /**
             * Adds a single [RegulatoryRequirement] to [regulatoryRequirements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRegulatoryRequirement(regulatoryRequirement: RegulatoryRequirement) = apply {
                regulatoryRequirements =
                    (regulatoryRequirements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("regulatoryRequirements", it).add(regulatoryRequirement)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .action()
             * .countryCode()
             * .phoneNumberType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("action", action),
                    checkRequired("countryCode", countryCode),
                    checkRequired("phoneNumberType", phoneNumberType),
                    customerReference,
                    (regulatoryRequirements ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            action().validate()
            countryCode()
            phoneNumberType().validate()
            customerReference()
            regulatoryRequirements().ifPresent { it.forEach { it.validate() } }
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
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (phoneNumberType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (regulatoryRequirements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                action == other.action &&
                countryCode == other.countryCode &&
                phoneNumberType == other.phoneNumberType &&
                customerReference == other.customerReference &&
                regulatoryRequirements == other.regulatoryRequirements &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                action,
                countryCode,
                phoneNumberType,
                customerReference,
                regulatoryRequirements,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{action=$action, countryCode=$countryCode, phoneNumberType=$phoneNumberType, customerReference=$customerReference, regulatoryRequirements=$regulatoryRequirements, additionalProperties=$additionalProperties}"
    }

    class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ORDERING = of("ordering")

            @JvmField val PORTING = of("porting")

            @JvmStatic fun of(value: String) = Action(JsonField.of(value))
        }

        /** An enum containing [Action]'s known values. */
        enum class Known {
            ORDERING,
            PORTING,
        }

        /**
         * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Action] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ORDERING,
            PORTING,
            /** An enum member indicating that [Action] was instantiated with an unknown value. */
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
                ORDERING -> Value.ORDERING
                PORTING -> Value.PORTING
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
                ORDERING -> Known.ORDERING
                PORTING -> Known.PORTING
                else -> throw TelnyxInvalidDataException("Unknown Action: $value")
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

    class PhoneNumberType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val LOCAL = of("local")

            @JvmField val TOLL_FREE = of("toll_free")

            @JvmField val MOBILE = of("mobile")

            @JvmField val NATIONAL = of("national")

            @JvmField val SHARED_COST = of("shared_cost")

            @JvmStatic fun of(value: String) = PhoneNumberType(JsonField.of(value))
        }

        /** An enum containing [PhoneNumberType]'s known values. */
        enum class Known {
            LOCAL,
            TOLL_FREE,
            MOBILE,
            NATIONAL,
            SHARED_COST,
        }

        /**
         * An enum containing [PhoneNumberType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PhoneNumberType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOCAL,
            TOLL_FREE,
            MOBILE,
            NATIONAL,
            SHARED_COST,
            /**
             * An enum member indicating that [PhoneNumberType] was instantiated with an unknown
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
                LOCAL -> Value.LOCAL
                TOLL_FREE -> Value.TOLL_FREE
                MOBILE -> Value.MOBILE
                NATIONAL -> Value.NATIONAL
                SHARED_COST -> Value.SHARED_COST
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
                LOCAL -> Known.LOCAL
                TOLL_FREE -> Known.TOLL_FREE
                MOBILE -> Known.MOBILE
                NATIONAL -> Known.NATIONAL
                SHARED_COST -> Known.SHARED_COST
                else -> throw TelnyxInvalidDataException("Unknown PhoneNumberType: $value")
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

        fun validate(): PhoneNumberType = apply {
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

            return other is PhoneNumberType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class RegulatoryRequirement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fieldValue: JsonField<String>,
        private val requirementId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("field_value")
            @ExcludeMissing
            fieldValue: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requirement_id")
            @ExcludeMissing
            requirementId: JsonField<String> = JsonMissing.of(),
        ) : this(fieldValue, requirementId, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fieldValue(): Optional<String> = fieldValue.getOptional("field_value")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requirementId(): Optional<String> = requirementId.getOptional("requirement_id")

        /**
         * Returns the raw JSON value of [fieldValue].
         *
         * Unlike [fieldValue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field_value")
        @ExcludeMissing
        fun _fieldValue(): JsonField<String> = fieldValue

        /**
         * Returns the raw JSON value of [requirementId].
         *
         * Unlike [requirementId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requirement_id")
        @ExcludeMissing
        fun _requirementId(): JsonField<String> = requirementId

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
             * Returns a mutable builder for constructing an instance of [RegulatoryRequirement].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RegulatoryRequirement]. */
        class Builder internal constructor() {

            private var fieldValue: JsonField<String> = JsonMissing.of()
            private var requirementId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(regulatoryRequirement: RegulatoryRequirement) = apply {
                fieldValue = regulatoryRequirement.fieldValue
                requirementId = regulatoryRequirement.requirementId
                additionalProperties = regulatoryRequirement.additionalProperties.toMutableMap()
            }

            fun fieldValue(fieldValue: String) = fieldValue(JsonField.of(fieldValue))

            /**
             * Sets [Builder.fieldValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldValue] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldValue(fieldValue: JsonField<String>) = apply { this.fieldValue = fieldValue }

            fun requirementId(requirementId: String) = requirementId(JsonField.of(requirementId))

            /**
             * Sets [Builder.requirementId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requirementId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requirementId(requirementId: JsonField<String>) = apply {
                this.requirementId = requirementId
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
             * Returns an immutable instance of [RegulatoryRequirement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RegulatoryRequirement =
                RegulatoryRequirement(
                    fieldValue,
                    requirementId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RegulatoryRequirement = apply {
            if (validated) {
                return@apply
            }

            fieldValue()
            requirementId()
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
            (if (fieldValue.asKnown().isPresent) 1 else 0) +
                (if (requirementId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RegulatoryRequirement &&
                fieldValue == other.fieldValue &&
                requirementId == other.requirementId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(fieldValue, requirementId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RegulatoryRequirement{fieldValue=$fieldValue, requirementId=$requirementId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RequirementGroupCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RequirementGroupCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
