// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberlookup

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

class NumberLookupRetrieveResponse
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
         * Returns a mutable builder for constructing an instance of [NumberLookupRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberLookupRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(numberLookupRetrieveResponse: NumberLookupRetrieveResponse) = apply {
            data = numberLookupRetrieveResponse.data
            additionalProperties = numberLookupRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [NumberLookupRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NumberLookupRetrieveResponse =
            NumberLookupRetrieveResponse(data, additionalProperties.toMutableMap())
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
    fun validate(): NumberLookupRetrieveResponse = apply {
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
        private val callerIdentity: JsonField<CallerIdentity>,
        private val callerName: JsonField<CallerName>,
        private val carrier: JsonField<Carrier>,
        private val countryCode: JsonField<String>,
        private val enhancedCallerName: JsonField<EnhancedCallerName>,
        private val fraud: JsonField<String>,
        private val nationalFormat: JsonField<String>,
        private val nnidOverride: JsonField<NnidOverride>,
        private val phoneNumber: JsonField<String>,
        private val portability: JsonField<Portability>,
        private val recordType: JsonField<String>,
        private val validNumber: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("caller_identity")
            @ExcludeMissing
            callerIdentity: JsonField<CallerIdentity> = JsonMissing.of(),
            @JsonProperty("caller_name")
            @ExcludeMissing
            callerName: JsonField<CallerName> = JsonMissing.of(),
            @JsonProperty("carrier") @ExcludeMissing carrier: JsonField<Carrier> = JsonMissing.of(),
            @JsonProperty("country_code")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enhanced_caller_name")
            @ExcludeMissing
            enhancedCallerName: JsonField<EnhancedCallerName> = JsonMissing.of(),
            @JsonProperty("fraud") @ExcludeMissing fraud: JsonField<String> = JsonMissing.of(),
            @JsonProperty("national_format")
            @ExcludeMissing
            nationalFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nnid_override")
            @ExcludeMissing
            nnidOverride: JsonField<NnidOverride> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("portability")
            @ExcludeMissing
            portability: JsonField<Portability> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("valid_number")
            @ExcludeMissing
            validNumber: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            callerIdentity,
            callerName,
            carrier,
            countryCode,
            enhancedCallerName,
            fraud,
            nationalFormat,
            nnidOverride,
            phoneNumber,
            portability,
            recordType,
            validNumber,
            mutableMapOf(),
        )

        /**
         * Identity information for the phone number's owner, including name and postal address.
         * Populated when `type=caller-identity` is requested.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callerIdentity(): Optional<CallerIdentity> =
            callerIdentity.getOptional("caller_identity")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callerName(): Optional<CallerName> = callerName.getOptional("caller_name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun carrier(): Optional<Carrier> = carrier.getOptional("carrier")

        /**
         * Region code that matches the specific country calling code
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

        /**
         * Enhanced caller name for the phone number's owner. Populated when
         * `type=enhanced-caller-name` is requested.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enhancedCallerName(): Optional<EnhancedCallerName> =
            enhancedCallerName.getOptional("enhanced_caller_name")

        /**
         * Unused
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fraud(): Optional<String> = fraud.getOptional("fraud")

        /**
         * Hyphen-separated national number, preceded by the national destination code (NDC), with a
         * 0 prefix, if an NDC is found
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nationalFormat(): Optional<String> = nationalFormat.getOptional("national_format")

        /**
         * Network number ID (NNID) override for the phone number, when one applies (available only
         * to accounts enabled for NNID); otherwise null.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nnidOverride(): Optional<NnidOverride> = nnidOverride.getOptional("nnid_override")

        /**
         * E164-formatted phone number
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun portability(): Optional<Portability> = portability.getOptional("portability")

        /**
         * Identifies the type of record
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * Indicates whether the phone number is valid.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun validNumber(): Optional<Boolean> = validNumber.getOptional("valid_number")

        /**
         * Returns the raw JSON value of [callerIdentity].
         *
         * Unlike [callerIdentity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("caller_identity")
        @ExcludeMissing
        fun _callerIdentity(): JsonField<CallerIdentity> = callerIdentity

        /**
         * Returns the raw JSON value of [callerName].
         *
         * Unlike [callerName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("caller_name")
        @ExcludeMissing
        fun _callerName(): JsonField<CallerName> = callerName

        /**
         * Returns the raw JSON value of [carrier].
         *
         * Unlike [carrier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("carrier") @ExcludeMissing fun _carrier(): JsonField<Carrier> = carrier

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country_code")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [enhancedCallerName].
         *
         * Unlike [enhancedCallerName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("enhanced_caller_name")
        @ExcludeMissing
        fun _enhancedCallerName(): JsonField<EnhancedCallerName> = enhancedCallerName

        /**
         * Returns the raw JSON value of [fraud].
         *
         * Unlike [fraud], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fraud") @ExcludeMissing fun _fraud(): JsonField<String> = fraud

        /**
         * Returns the raw JSON value of [nationalFormat].
         *
         * Unlike [nationalFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("national_format")
        @ExcludeMissing
        fun _nationalFormat(): JsonField<String> = nationalFormat

        /**
         * Returns the raw JSON value of [nnidOverride].
         *
         * Unlike [nnidOverride], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("nnid_override")
        @ExcludeMissing
        fun _nnidOverride(): JsonField<NnidOverride> = nnidOverride

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [portability].
         *
         * Unlike [portability], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("portability")
        @ExcludeMissing
        fun _portability(): JsonField<Portability> = portability

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [validNumber].
         *
         * Unlike [validNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("valid_number")
        @ExcludeMissing
        fun _validNumber(): JsonField<Boolean> = validNumber

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

            private var callerIdentity: JsonField<CallerIdentity> = JsonMissing.of()
            private var callerName: JsonField<CallerName> = JsonMissing.of()
            private var carrier: JsonField<Carrier> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var enhancedCallerName: JsonField<EnhancedCallerName> = JsonMissing.of()
            private var fraud: JsonField<String> = JsonMissing.of()
            private var nationalFormat: JsonField<String> = JsonMissing.of()
            private var nnidOverride: JsonField<NnidOverride> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var portability: JsonField<Portability> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var validNumber: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                callerIdentity = data.callerIdentity
                callerName = data.callerName
                carrier = data.carrier
                countryCode = data.countryCode
                enhancedCallerName = data.enhancedCallerName
                fraud = data.fraud
                nationalFormat = data.nationalFormat
                nnidOverride = data.nnidOverride
                phoneNumber = data.phoneNumber
                portability = data.portability
                recordType = data.recordType
                validNumber = data.validNumber
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * Identity information for the phone number's owner, including name and postal address.
             * Populated when `type=caller-identity` is requested.
             */
            fun callerIdentity(callerIdentity: CallerIdentity) =
                callerIdentity(JsonField.of(callerIdentity))

            /**
             * Sets [Builder.callerIdentity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callerIdentity] with a well-typed [CallerIdentity]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callerIdentity(callerIdentity: JsonField<CallerIdentity>) = apply {
                this.callerIdentity = callerIdentity
            }

            fun callerName(callerName: CallerName) = callerName(JsonField.of(callerName))

            /**
             * Sets [Builder.callerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callerName] with a well-typed [CallerName] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callerName(callerName: JsonField<CallerName>) = apply {
                this.callerName = callerName
            }

            fun carrier(carrier: Carrier) = carrier(JsonField.of(carrier))

            /**
             * Sets [Builder.carrier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrier] with a well-typed [Carrier] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun carrier(carrier: JsonField<Carrier>) = apply { this.carrier = carrier }

            /** Region code that matches the specific country calling code */
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

            /**
             * Enhanced caller name for the phone number's owner. Populated when
             * `type=enhanced-caller-name` is requested.
             */
            fun enhancedCallerName(enhancedCallerName: EnhancedCallerName) =
                enhancedCallerName(JsonField.of(enhancedCallerName))

            /**
             * Sets [Builder.enhancedCallerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enhancedCallerName] with a well-typed
             * [EnhancedCallerName] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun enhancedCallerName(enhancedCallerName: JsonField<EnhancedCallerName>) = apply {
                this.enhancedCallerName = enhancedCallerName
            }

            /** Unused */
            fun fraud(fraud: String?) = fraud(JsonField.ofNullable(fraud))

            /** Alias for calling [Builder.fraud] with `fraud.orElse(null)`. */
            fun fraud(fraud: Optional<String>) = fraud(fraud.getOrNull())

            /**
             * Sets [Builder.fraud] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fraud] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fraud(fraud: JsonField<String>) = apply { this.fraud = fraud }

            /**
             * Hyphen-separated national number, preceded by the national destination code (NDC),
             * with a 0 prefix, if an NDC is found
             */
            fun nationalFormat(nationalFormat: String) =
                nationalFormat(JsonField.of(nationalFormat))

            /**
             * Sets [Builder.nationalFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nationalFormat] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nationalFormat(nationalFormat: JsonField<String>) = apply {
                this.nationalFormat = nationalFormat
            }

            /**
             * Network number ID (NNID) override for the phone number, when one applies (available
             * only to accounts enabled for NNID); otherwise null.
             */
            fun nnidOverride(nnidOverride: NnidOverride?) =
                nnidOverride(JsonField.ofNullable(nnidOverride))

            /** Alias for calling [Builder.nnidOverride] with `nnidOverride.orElse(null)`. */
            fun nnidOverride(nnidOverride: Optional<NnidOverride>) =
                nnidOverride(nnidOverride.getOrNull())

            /**
             * Sets [Builder.nnidOverride] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nnidOverride] with a well-typed [NnidOverride] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nnidOverride(nnidOverride: JsonField<NnidOverride>) = apply {
                this.nnidOverride = nnidOverride
            }

            /** E164-formatted phone number */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            fun portability(portability: Portability) = portability(JsonField.of(portability))

            /**
             * Sets [Builder.portability] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portability] with a well-typed [Portability] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun portability(portability: JsonField<Portability>) = apply {
                this.portability = portability
            }

            /** Identifies the type of record */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** Indicates whether the phone number is valid. */
            fun validNumber(validNumber: Boolean) = validNumber(JsonField.of(validNumber))

            /**
             * Sets [Builder.validNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.validNumber] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun validNumber(validNumber: JsonField<Boolean>) = apply {
                this.validNumber = validNumber
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
                    callerIdentity,
                    callerName,
                    carrier,
                    countryCode,
                    enhancedCallerName,
                    fraud,
                    nationalFormat,
                    nnidOverride,
                    phoneNumber,
                    portability,
                    recordType,
                    validNumber,
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            callerIdentity().ifPresent { it.validate() }
            callerName().ifPresent { it.validate() }
            carrier().ifPresent { it.validate() }
            countryCode()
            enhancedCallerName().ifPresent { it.validate() }
            fraud()
            nationalFormat()
            nnidOverride().ifPresent { it.validate() }
            phoneNumber()
            portability().ifPresent { it.validate() }
            recordType()
            validNumber()
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
            (callerIdentity.asKnown().getOrNull()?.validity() ?: 0) +
                (callerName.asKnown().getOrNull()?.validity() ?: 0) +
                (carrier.asKnown().getOrNull()?.validity() ?: 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (enhancedCallerName.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fraud.asKnown().isPresent) 1 else 0) +
                (if (nationalFormat.asKnown().isPresent) 1 else 0) +
                (nnidOverride.asKnown().getOrNull()?.validity() ?: 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (portability.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (validNumber.asKnown().isPresent) 1 else 0)

        /**
         * Identity information for the phone number's owner, including name and postal address.
         * Populated when `type=caller-identity` is requested.
         */
        class CallerIdentity
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val address: JsonField<Address>,
            private val confidenceScore: JsonField<Double>,
            private val errorCode: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<Address> = JsonMissing.of(),
                @JsonProperty("confidence_score")
                @ExcludeMissing
                confidenceScore: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("error_code")
                @ExcludeMissing
                errorCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(address, confidenceScore, errorCode, name, mutableMapOf())

            /**
             * Postal address associated with the phone number's owner.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun address(): Optional<Address> = address.getOptional("address")

            /**
             * How strongly the phone number is linked to the returned name, on a scale of 50 to 90
             * (higher means more supporting signals). Reflects signal strength, not probability: 70
             * indicates stronger, more consistent evidence than 60, not a 70% chance of being
             * correct. As a guide, 70+ is high confidence, 60 moderate, and 50 limited. Below 50 no
             * name is returned, so scores under 50 are never present.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun confidenceScore(): Optional<Double> =
                confidenceScore.getOptional("confidence_score")

            /**
             * A lookup-specific error code if the identity could not be resolved; otherwise null.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun errorCode(): Optional<String> = errorCode.getOptional("error_code")

            /**
             * The name associated with the phone number.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

            /**
             * Returns the raw JSON value of [confidenceScore].
             *
             * Unlike [confidenceScore], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("confidence_score")
            @ExcludeMissing
            fun _confidenceScore(): JsonField<Double> = confidenceScore

            /**
             * Returns the raw JSON value of [errorCode].
             *
             * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_code")
            @ExcludeMissing
            fun _errorCode(): JsonField<String> = errorCode

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

                /** Returns a mutable builder for constructing an instance of [CallerIdentity]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CallerIdentity]. */
            class Builder internal constructor() {

                private var address: JsonField<Address> = JsonMissing.of()
                private var confidenceScore: JsonField<Double> = JsonMissing.of()
                private var errorCode: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(callerIdentity: CallerIdentity) = apply {
                    address = callerIdentity.address
                    confidenceScore = callerIdentity.confidenceScore
                    errorCode = callerIdentity.errorCode
                    name = callerIdentity.name
                    additionalProperties = callerIdentity.additionalProperties.toMutableMap()
                }

                /** Postal address associated with the phone number's owner. */
                fun address(address: Address) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [Address] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<Address>) = apply { this.address = address }

                /**
                 * How strongly the phone number is linked to the returned name, on a scale of 50 to
                 * 90 (higher means more supporting signals). Reflects signal strength, not
                 * probability: 70 indicates stronger, more consistent evidence than 60, not a 70%
                 * chance of being correct. As a guide, 70+ is high confidence, 60 moderate, and 50
                 * limited. Below 50 no name is returned, so scores under 50 are never present.
                 */
                fun confidenceScore(confidenceScore: Double?) =
                    confidenceScore(JsonField.ofNullable(confidenceScore))

                /**
                 * Alias for [Builder.confidenceScore].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun confidenceScore(confidenceScore: Double) =
                    confidenceScore(confidenceScore as Double?)

                /**
                 * Alias for calling [Builder.confidenceScore] with `confidenceScore.orElse(null)`.
                 */
                fun confidenceScore(confidenceScore: Optional<Double>) =
                    confidenceScore(confidenceScore.getOrNull())

                /**
                 * Sets [Builder.confidenceScore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.confidenceScore] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun confidenceScore(confidenceScore: JsonField<Double>) = apply {
                    this.confidenceScore = confidenceScore
                }

                /**
                 * A lookup-specific error code if the identity could not be resolved; otherwise
                 * null.
                 */
                fun errorCode(errorCode: String?) = errorCode(JsonField.ofNullable(errorCode))

                /** Alias for calling [Builder.errorCode] with `errorCode.orElse(null)`. */
                fun errorCode(errorCode: Optional<String>) = errorCode(errorCode.getOrNull())

                /**
                 * Sets [Builder.errorCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

                /** The name associated with the phone number. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [CallerIdentity].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CallerIdentity =
                    CallerIdentity(
                        address,
                        confidenceScore,
                        errorCode,
                        name,
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
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): CallerIdentity = apply {
                if (validated) {
                    return@apply
                }

                address().ifPresent { it.validate() }
                confidenceScore()
                errorCode()
                name()
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
                (address.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (confidenceScore.asKnown().isPresent) 1 else 0) +
                    (if (errorCode.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

            /** Postal address associated with the phone number's owner. */
            class Address
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val city: JsonField<String>,
                private val countryCode: JsonField<String>,
                private val postalCode: JsonField<String>,
                private val stateCode: JsonField<String>,
                private val streetLine1: JsonField<String>,
                private val streetLine2: JsonField<String>,
                private val zip4: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("city")
                    @ExcludeMissing
                    city: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("country_code")
                    @ExcludeMissing
                    countryCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("postal_code")
                    @ExcludeMissing
                    postalCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("state_code")
                    @ExcludeMissing
                    stateCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("street_line_1")
                    @ExcludeMissing
                    streetLine1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("street_line_2")
                    @ExcludeMissing
                    streetLine2: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("zip4") @ExcludeMissing zip4: JsonField<String> = JsonMissing.of(),
                ) : this(
                    city,
                    countryCode,
                    postalCode,
                    stateCode,
                    streetLine1,
                    streetLine2,
                    zip4,
                    mutableMapOf(),
                )

                /**
                 * City.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun city(): Optional<String> = city.getOptional("city")

                /**
                 * Two-letter ISO 3166-1 country code.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

                /**
                 * Postal or ZIP code.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

                /**
                 * Two-letter state or province code.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun stateCode(): Optional<String> = stateCode.getOptional("state_code")

                /**
                 * First line of the street address.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun streetLine1(): Optional<String> = streetLine1.getOptional("street_line_1")

                /**
                 * Second line of the street address, if any.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun streetLine2(): Optional<String> = streetLine2.getOptional("street_line_2")

                /**
                 * ZIP+4 extension, if available.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun zip4(): Optional<String> = zip4.getOptional("zip4")

                /**
                 * Returns the raw JSON value of [city].
                 *
                 * Unlike [city], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                /**
                 * Returns the raw JSON value of [countryCode].
                 *
                 * Unlike [countryCode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("country_code")
                @ExcludeMissing
                fun _countryCode(): JsonField<String> = countryCode

                /**
                 * Returns the raw JSON value of [postalCode].
                 *
                 * Unlike [postalCode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("postal_code")
                @ExcludeMissing
                fun _postalCode(): JsonField<String> = postalCode

                /**
                 * Returns the raw JSON value of [stateCode].
                 *
                 * Unlike [stateCode], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("state_code")
                @ExcludeMissing
                fun _stateCode(): JsonField<String> = stateCode

                /**
                 * Returns the raw JSON value of [streetLine1].
                 *
                 * Unlike [streetLine1], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("street_line_1")
                @ExcludeMissing
                fun _streetLine1(): JsonField<String> = streetLine1

                /**
                 * Returns the raw JSON value of [streetLine2].
                 *
                 * Unlike [streetLine2], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("street_line_2")
                @ExcludeMissing
                fun _streetLine2(): JsonField<String> = streetLine2

                /**
                 * Returns the raw JSON value of [zip4].
                 *
                 * Unlike [zip4], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("zip4") @ExcludeMissing fun _zip4(): JsonField<String> = zip4

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

                    /** Returns a mutable builder for constructing an instance of [Address]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Address]. */
                class Builder internal constructor() {

                    private var city: JsonField<String> = JsonMissing.of()
                    private var countryCode: JsonField<String> = JsonMissing.of()
                    private var postalCode: JsonField<String> = JsonMissing.of()
                    private var stateCode: JsonField<String> = JsonMissing.of()
                    private var streetLine1: JsonField<String> = JsonMissing.of()
                    private var streetLine2: JsonField<String> = JsonMissing.of()
                    private var zip4: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(address: Address) = apply {
                        city = address.city
                        countryCode = address.countryCode
                        postalCode = address.postalCode
                        stateCode = address.stateCode
                        streetLine1 = address.streetLine1
                        streetLine2 = address.streetLine2
                        zip4 = address.zip4
                        additionalProperties = address.additionalProperties.toMutableMap()
                    }

                    /** City. */
                    fun city(city: String?) = city(JsonField.ofNullable(city))

                    /** Alias for calling [Builder.city] with `city.orElse(null)`. */
                    fun city(city: Optional<String>) = city(city.getOrNull())

                    /**
                     * Sets [Builder.city] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.city] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun city(city: JsonField<String>) = apply { this.city = city }

                    /** Two-letter ISO 3166-1 country code. */
                    fun countryCode(countryCode: String?) =
                        countryCode(JsonField.ofNullable(countryCode))

                    /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
                    fun countryCode(countryCode: Optional<String>) =
                        countryCode(countryCode.getOrNull())

                    /**
                     * Sets [Builder.countryCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.countryCode] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun countryCode(countryCode: JsonField<String>) = apply {
                        this.countryCode = countryCode
                    }

                    /** Postal or ZIP code. */
                    fun postalCode(postalCode: String?) =
                        postalCode(JsonField.ofNullable(postalCode))

                    /** Alias for calling [Builder.postalCode] with `postalCode.orElse(null)`. */
                    fun postalCode(postalCode: Optional<String>) =
                        postalCode(postalCode.getOrNull())

                    /**
                     * Sets [Builder.postalCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.postalCode] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun postalCode(postalCode: JsonField<String>) = apply {
                        this.postalCode = postalCode
                    }

                    /** Two-letter state or province code. */
                    fun stateCode(stateCode: String?) = stateCode(JsonField.ofNullable(stateCode))

                    /** Alias for calling [Builder.stateCode] with `stateCode.orElse(null)`. */
                    fun stateCode(stateCode: Optional<String>) = stateCode(stateCode.getOrNull())

                    /**
                     * Sets [Builder.stateCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.stateCode] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun stateCode(stateCode: JsonField<String>) = apply {
                        this.stateCode = stateCode
                    }

                    /** First line of the street address. */
                    fun streetLine1(streetLine1: String?) =
                        streetLine1(JsonField.ofNullable(streetLine1))

                    /** Alias for calling [Builder.streetLine1] with `streetLine1.orElse(null)`. */
                    fun streetLine1(streetLine1: Optional<String>) =
                        streetLine1(streetLine1.getOrNull())

                    /**
                     * Sets [Builder.streetLine1] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.streetLine1] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun streetLine1(streetLine1: JsonField<String>) = apply {
                        this.streetLine1 = streetLine1
                    }

                    /** Second line of the street address, if any. */
                    fun streetLine2(streetLine2: String?) =
                        streetLine2(JsonField.ofNullable(streetLine2))

                    /** Alias for calling [Builder.streetLine2] with `streetLine2.orElse(null)`. */
                    fun streetLine2(streetLine2: Optional<String>) =
                        streetLine2(streetLine2.getOrNull())

                    /**
                     * Sets [Builder.streetLine2] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.streetLine2] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun streetLine2(streetLine2: JsonField<String>) = apply {
                        this.streetLine2 = streetLine2
                    }

                    /** ZIP+4 extension, if available. */
                    fun zip4(zip4: String?) = zip4(JsonField.ofNullable(zip4))

                    /** Alias for calling [Builder.zip4] with `zip4.orElse(null)`. */
                    fun zip4(zip4: Optional<String>) = zip4(zip4.getOrNull())

                    /**
                     * Sets [Builder.zip4] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.zip4] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun zip4(zip4: JsonField<String>) = apply { this.zip4 = zip4 }

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
                     * Returns an immutable instance of [Address].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Address =
                        Address(
                            city,
                            countryCode,
                            postalCode,
                            stateCode,
                            streetLine1,
                            streetLine2,
                            zip4,
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
                fun validate(): Address = apply {
                    if (validated) {
                        return@apply
                    }

                    city()
                    countryCode()
                    postalCode()
                    stateCode()
                    streetLine1()
                    streetLine2()
                    zip4()
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
                    (if (city.asKnown().isPresent) 1 else 0) +
                        (if (countryCode.asKnown().isPresent) 1 else 0) +
                        (if (postalCode.asKnown().isPresent) 1 else 0) +
                        (if (stateCode.asKnown().isPresent) 1 else 0) +
                        (if (streetLine1.asKnown().isPresent) 1 else 0) +
                        (if (streetLine2.asKnown().isPresent) 1 else 0) +
                        (if (zip4.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Address &&
                        city == other.city &&
                        countryCode == other.countryCode &&
                        postalCode == other.postalCode &&
                        stateCode == other.stateCode &&
                        streetLine1 == other.streetLine1 &&
                        streetLine2 == other.streetLine2 &&
                        zip4 == other.zip4 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        city,
                        countryCode,
                        postalCode,
                        stateCode,
                        streetLine1,
                        streetLine2,
                        zip4,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Address{city=$city, countryCode=$countryCode, postalCode=$postalCode, stateCode=$stateCode, streetLine1=$streetLine1, streetLine2=$streetLine2, zip4=$zip4, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CallerIdentity &&
                    address == other.address &&
                    confidenceScore == other.confidenceScore &&
                    errorCode == other.errorCode &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(address, confidenceScore, errorCode, name, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CallerIdentity{address=$address, confidenceScore=$confidenceScore, errorCode=$errorCode, name=$name, additionalProperties=$additionalProperties}"
        }

        class CallerName
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val callerName: JsonField<String>,
            private val errorCode: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("caller_name")
                @ExcludeMissing
                callerName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("error_code")
                @ExcludeMissing
                errorCode: JsonField<String> = JsonMissing.of(),
            ) : this(callerName, errorCode, mutableMapOf())

            /**
             * The name of the requested phone number's owner as per the CNAM database
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callerName(): Optional<String> = callerName.getOptional("caller_name")

            /**
             * A caller-name lookup specific error code, expressed as a stringified 5-digit integer
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun errorCode(): Optional<String> = errorCode.getOptional("error_code")

            /**
             * Returns the raw JSON value of [callerName].
             *
             * Unlike [callerName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("caller_name")
            @ExcludeMissing
            fun _callerName(): JsonField<String> = callerName

            /**
             * Returns the raw JSON value of [errorCode].
             *
             * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_code")
            @ExcludeMissing
            fun _errorCode(): JsonField<String> = errorCode

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

                /** Returns a mutable builder for constructing an instance of [CallerName]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CallerName]. */
            class Builder internal constructor() {

                private var callerName: JsonField<String> = JsonMissing.of()
                private var errorCode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(callerName: CallerName) = apply {
                    this.callerName = callerName.callerName
                    errorCode = callerName.errorCode
                    additionalProperties = callerName.additionalProperties.toMutableMap()
                }

                /** The name of the requested phone number's owner as per the CNAM database */
                fun callerName(callerName: String) = callerName(JsonField.of(callerName))

                /**
                 * Sets [Builder.callerName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callerName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callerName(callerName: JsonField<String>) = apply {
                    this.callerName = callerName
                }

                /**
                 * A caller-name lookup specific error code, expressed as a stringified 5-digit
                 * integer
                 */
                fun errorCode(errorCode: String) = errorCode(JsonField.of(errorCode))

                /**
                 * Sets [Builder.errorCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

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
                 * Returns an immutable instance of [CallerName].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CallerName =
                    CallerName(callerName, errorCode, additionalProperties.toMutableMap())
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
            fun validate(): CallerName = apply {
                if (validated) {
                    return@apply
                }

                callerName()
                errorCode()
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
                (if (callerName.asKnown().isPresent) 1 else 0) +
                    (if (errorCode.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CallerName &&
                    callerName == other.callerName &&
                    errorCode == other.errorCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(callerName, errorCode, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CallerName{callerName=$callerName, errorCode=$errorCode, additionalProperties=$additionalProperties}"
        }

        class Carrier
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val errorCode: JsonField<String>,
            private val mobileCountryCode: JsonField<String>,
            private val mobileNetworkCode: JsonField<String>,
            private val name: JsonField<String>,
            private val normalizedCarrier: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("error_code")
                @ExcludeMissing
                errorCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("mobile_country_code")
                @ExcludeMissing
                mobileCountryCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("mobile_network_code")
                @ExcludeMissing
                mobileNetworkCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("normalized_carrier")
                @ExcludeMissing
                normalizedCarrier: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(
                errorCode,
                mobileCountryCode,
                mobileNetworkCode,
                name,
                normalizedCarrier,
                type,
                mutableMapOf(),
            )

            /**
             * Unused
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun errorCode(): Optional<String> = errorCode.getOptional("error_code")

            /**
             * Region code that matches the specific country calling code if the requested phone
             * number type is mobile
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mobileCountryCode(): Optional<String> =
                mobileCountryCode.getOptional("mobile_country_code")

            /**
             * National destination code (NDC), with a 0 prefix, if an NDC is found and the
             * requested phone number type is mobile
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mobileNetworkCode(): Optional<String> =
                mobileNetworkCode.getOptional("mobile_network_code")

            /**
             * SPID (Service Provider ID) name, if the requested phone number has been ported;
             * otherwise, the name of carrier who owns the phone number block
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * If known to Telnyx and applicable, the primary network carrier.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun normalizedCarrier(): Optional<String> =
                normalizedCarrier.getOptional("normalized_carrier")

            /**
             * A phone number type that identifies the type of service associated with the requested
             * phone number
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [errorCode].
             *
             * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_code")
            @ExcludeMissing
            fun _errorCode(): JsonField<String> = errorCode

            /**
             * Returns the raw JSON value of [mobileCountryCode].
             *
             * Unlike [mobileCountryCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mobile_country_code")
            @ExcludeMissing
            fun _mobileCountryCode(): JsonField<String> = mobileCountryCode

            /**
             * Returns the raw JSON value of [mobileNetworkCode].
             *
             * Unlike [mobileNetworkCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mobile_network_code")
            @ExcludeMissing
            fun _mobileNetworkCode(): JsonField<String> = mobileNetworkCode

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [normalizedCarrier].
             *
             * Unlike [normalizedCarrier], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("normalized_carrier")
            @ExcludeMissing
            fun _normalizedCarrier(): JsonField<String> = normalizedCarrier

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

                /** Returns a mutable builder for constructing an instance of [Carrier]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Carrier]. */
            class Builder internal constructor() {

                private var errorCode: JsonField<String> = JsonMissing.of()
                private var mobileCountryCode: JsonField<String> = JsonMissing.of()
                private var mobileNetworkCode: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var normalizedCarrier: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(carrier: Carrier) = apply {
                    errorCode = carrier.errorCode
                    mobileCountryCode = carrier.mobileCountryCode
                    mobileNetworkCode = carrier.mobileNetworkCode
                    name = carrier.name
                    normalizedCarrier = carrier.normalizedCarrier
                    type = carrier.type
                    additionalProperties = carrier.additionalProperties.toMutableMap()
                }

                /** Unused */
                fun errorCode(errorCode: String?) = errorCode(JsonField.ofNullable(errorCode))

                /** Alias for calling [Builder.errorCode] with `errorCode.orElse(null)`. */
                fun errorCode(errorCode: Optional<String>) = errorCode(errorCode.getOrNull())

                /**
                 * Sets [Builder.errorCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

                /**
                 * Region code that matches the specific country calling code if the requested phone
                 * number type is mobile
                 */
                fun mobileCountryCode(mobileCountryCode: String) =
                    mobileCountryCode(JsonField.of(mobileCountryCode))

                /**
                 * Sets [Builder.mobileCountryCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mobileCountryCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mobileCountryCode(mobileCountryCode: JsonField<String>) = apply {
                    this.mobileCountryCode = mobileCountryCode
                }

                /**
                 * National destination code (NDC), with a 0 prefix, if an NDC is found and the
                 * requested phone number type is mobile
                 */
                fun mobileNetworkCode(mobileNetworkCode: String) =
                    mobileNetworkCode(JsonField.of(mobileNetworkCode))

                /**
                 * Sets [Builder.mobileNetworkCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mobileNetworkCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mobileNetworkCode(mobileNetworkCode: JsonField<String>) = apply {
                    this.mobileNetworkCode = mobileNetworkCode
                }

                /**
                 * SPID (Service Provider ID) name, if the requested phone number has been ported;
                 * otherwise, the name of carrier who owns the phone number block
                 */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** If known to Telnyx and applicable, the primary network carrier. */
                fun normalizedCarrier(normalizedCarrier: String) =
                    normalizedCarrier(JsonField.of(normalizedCarrier))

                /**
                 * Sets [Builder.normalizedCarrier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.normalizedCarrier] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun normalizedCarrier(normalizedCarrier: JsonField<String>) = apply {
                    this.normalizedCarrier = normalizedCarrier
                }

                /**
                 * A phone number type that identifies the type of service associated with the
                 * requested phone number
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Carrier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Carrier =
                    Carrier(
                        errorCode,
                        mobileCountryCode,
                        mobileNetworkCode,
                        name,
                        normalizedCarrier,
                        type,
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
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Carrier = apply {
                if (validated) {
                    return@apply
                }

                errorCode()
                mobileCountryCode()
                mobileNetworkCode()
                name()
                normalizedCarrier()
                type().ifPresent { it.validate() }
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
                (if (errorCode.asKnown().isPresent) 1 else 0) +
                    (if (mobileCountryCode.asKnown().isPresent) 1 else 0) +
                    (if (mobileNetworkCode.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (normalizedCarrier.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * A phone number type that identifies the type of service associated with the requested
             * phone number
             */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FIXED_LINE = of("fixed line")

                    @JvmField val MOBILE = of("mobile")

                    @JvmField val VOIP = of("voip")

                    @JvmField val FIXED_LINE_OR_MOBILE = of("fixed line or mobile")

                    @JvmField val TOLL_FREE = of("toll free")

                    @JvmField val PREMIUM_RATE = of("premium rate")

                    @JvmField val SHARED_COST = of("shared cost")

                    @JvmField val PERSONAL_NUMBER = of("personal number")

                    @JvmField val PAGER = of("pager")

                    @JvmField val UAN = of("uan")

                    @JvmField val VOICEMAIL = of("voicemail")

                    @JvmField val UNKNOWN = of("unknown")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    FIXED_LINE,
                    MOBILE,
                    VOIP,
                    FIXED_LINE_OR_MOBILE,
                    TOLL_FREE,
                    PREMIUM_RATE,
                    SHARED_COST,
                    PERSONAL_NUMBER,
                    PAGER,
                    UAN,
                    VOICEMAIL,
                    UNKNOWN,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FIXED_LINE,
                    MOBILE,
                    VOIP,
                    FIXED_LINE_OR_MOBILE,
                    TOLL_FREE,
                    PREMIUM_RATE,
                    SHARED_COST,
                    PERSONAL_NUMBER,
                    PAGER,
                    UAN,
                    VOICEMAIL,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FIXED_LINE -> Value.FIXED_LINE
                        MOBILE -> Value.MOBILE
                        VOIP -> Value.VOIP
                        FIXED_LINE_OR_MOBILE -> Value.FIXED_LINE_OR_MOBILE
                        TOLL_FREE -> Value.TOLL_FREE
                        PREMIUM_RATE -> Value.PREMIUM_RATE
                        SHARED_COST -> Value.SHARED_COST
                        PERSONAL_NUMBER -> Value.PERSONAL_NUMBER
                        PAGER -> Value.PAGER
                        UAN -> Value.UAN
                        VOICEMAIL -> Value.VOICEMAIL
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FIXED_LINE -> Known.FIXED_LINE
                        MOBILE -> Known.MOBILE
                        VOIP -> Known.VOIP
                        FIXED_LINE_OR_MOBILE -> Known.FIXED_LINE_OR_MOBILE
                        TOLL_FREE -> Known.TOLL_FREE
                        PREMIUM_RATE -> Known.PREMIUM_RATE
                        SHARED_COST -> Known.SHARED_COST
                        PERSONAL_NUMBER -> Known.PERSONAL_NUMBER
                        PAGER -> Known.PAGER
                        UAN -> Known.UAN
                        VOICEMAIL -> Known.VOICEMAIL
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Carrier &&
                    errorCode == other.errorCode &&
                    mobileCountryCode == other.mobileCountryCode &&
                    mobileNetworkCode == other.mobileNetworkCode &&
                    name == other.name &&
                    normalizedCarrier == other.normalizedCarrier &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    errorCode,
                    mobileCountryCode,
                    mobileNetworkCode,
                    name,
                    normalizedCarrier,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Carrier{errorCode=$errorCode, mobileCountryCode=$mobileCountryCode, mobileNetworkCode=$mobileNetworkCode, name=$name, normalizedCarrier=$normalizedCarrier, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * Enhanced caller name for the phone number's owner. Populated when
         * `type=enhanced-caller-name` is requested.
         */
        class EnhancedCallerName
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val callerName: JsonField<String>,
            private val errorCode: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("caller_name")
                @ExcludeMissing
                callerName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("error_code")
                @ExcludeMissing
                errorCode: JsonField<String> = JsonMissing.of(),
            ) : this(callerName, errorCode, mutableMapOf())

            /**
             * The name associated with the phone number.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callerName(): Optional<String> = callerName.getOptional("caller_name")

            /**
             * A lookup-specific error code if the enhanced caller name could not be resolved;
             * otherwise null.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun errorCode(): Optional<String> = errorCode.getOptional("error_code")

            /**
             * Returns the raw JSON value of [callerName].
             *
             * Unlike [callerName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("caller_name")
            @ExcludeMissing
            fun _callerName(): JsonField<String> = callerName

            /**
             * Returns the raw JSON value of [errorCode].
             *
             * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_code")
            @ExcludeMissing
            fun _errorCode(): JsonField<String> = errorCode

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
                 * Returns a mutable builder for constructing an instance of [EnhancedCallerName].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [EnhancedCallerName]. */
            class Builder internal constructor() {

                private var callerName: JsonField<String> = JsonMissing.of()
                private var errorCode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(enhancedCallerName: EnhancedCallerName) = apply {
                    callerName = enhancedCallerName.callerName
                    errorCode = enhancedCallerName.errorCode
                    additionalProperties = enhancedCallerName.additionalProperties.toMutableMap()
                }

                /** The name associated with the phone number. */
                fun callerName(callerName: String?) = callerName(JsonField.ofNullable(callerName))

                /** Alias for calling [Builder.callerName] with `callerName.orElse(null)`. */
                fun callerName(callerName: Optional<String>) = callerName(callerName.getOrNull())

                /**
                 * Sets [Builder.callerName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callerName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callerName(callerName: JsonField<String>) = apply {
                    this.callerName = callerName
                }

                /**
                 * A lookup-specific error code if the enhanced caller name could not be resolved;
                 * otherwise null.
                 */
                fun errorCode(errorCode: String?) = errorCode(JsonField.ofNullable(errorCode))

                /** Alias for calling [Builder.errorCode] with `errorCode.orElse(null)`. */
                fun errorCode(errorCode: Optional<String>) = errorCode(errorCode.getOrNull())

                /**
                 * Sets [Builder.errorCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

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
                 * Returns an immutable instance of [EnhancedCallerName].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): EnhancedCallerName =
                    EnhancedCallerName(callerName, errorCode, additionalProperties.toMutableMap())
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
            fun validate(): EnhancedCallerName = apply {
                if (validated) {
                    return@apply
                }

                callerName()
                errorCode()
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
                (if (callerName.asKnown().isPresent) 1 else 0) +
                    (if (errorCode.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EnhancedCallerName &&
                    callerName == other.callerName &&
                    errorCode == other.errorCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(callerName, errorCode, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EnhancedCallerName{callerName=$callerName, errorCode=$errorCode, additionalProperties=$additionalProperties}"
        }

        /**
         * Network number ID (NNID) override for the phone number, when one applies (available only
         * to accounts enabled for NNID); otherwise null.
         */
        class NnidOverride
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val nnid: JsonField<String>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("nnid") @ExcludeMissing nnid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(name, nnid, type, mutableMapOf())

            /**
             * Name associated with the NNID.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * The network number ID.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun nnid(): Optional<String> = nnid.getOptional("nnid")

            /**
             * The NNID type.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [nnid].
             *
             * Unlike [nnid], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("nnid") @ExcludeMissing fun _nnid(): JsonField<String> = nnid

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [NnidOverride]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NnidOverride]. */
            class Builder internal constructor() {

                private var name: JsonField<String> = JsonMissing.of()
                private var nnid: JsonField<String> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(nnidOverride: NnidOverride) = apply {
                    name = nnidOverride.name
                    nnid = nnidOverride.nnid
                    type = nnidOverride.type
                    additionalProperties = nnidOverride.additionalProperties.toMutableMap()
                }

                /** Name associated with the NNID. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The network number ID. */
                fun nnid(nnid: String) = nnid(JsonField.of(nnid))

                /**
                 * Sets [Builder.nnid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nnid] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun nnid(nnid: JsonField<String>) = apply { this.nnid = nnid }

                /** The NNID type. */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [NnidOverride].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): NnidOverride =
                    NnidOverride(name, nnid, type, additionalProperties.toMutableMap())
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
            fun validate(): NnidOverride = apply {
                if (validated) {
                    return@apply
                }

                name()
                nnid()
                type()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                    (if (nnid.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NnidOverride &&
                    name == other.name &&
                    nnid == other.nnid &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(name, nnid, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NnidOverride{name=$name, nnid=$nnid, type=$type, additionalProperties=$additionalProperties}"
        }

        class Portability
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val altspid: JsonField<String>,
            private val altspidCarrierName: JsonField<String>,
            private val altspidCarrierType: JsonField<String>,
            private val city: JsonField<String>,
            private val lineType: JsonField<LineType>,
            private val lrn: JsonField<String>,
            private val ocn: JsonField<String>,
            private val portedDate: JsonField<String>,
            private val portedStatus: JsonField<PortedStatus>,
            private val spid: JsonField<String>,
            private val spidCarrierName: JsonField<String>,
            private val spidCarrierType: JsonField<String>,
            private val state: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("altspid")
                @ExcludeMissing
                altspid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("altspid_carrier_name")
                @ExcludeMissing
                altspidCarrierName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("altspid_carrier_type")
                @ExcludeMissing
                altspidCarrierType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line_type")
                @ExcludeMissing
                lineType: JsonField<LineType> = JsonMissing.of(),
                @JsonProperty("lrn") @ExcludeMissing lrn: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ocn") @ExcludeMissing ocn: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ported_date")
                @ExcludeMissing
                portedDate: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ported_status")
                @ExcludeMissing
                portedStatus: JsonField<PortedStatus> = JsonMissing.of(),
                @JsonProperty("spid") @ExcludeMissing spid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("spid_carrier_name")
                @ExcludeMissing
                spidCarrierName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("spid_carrier_type")
                @ExcludeMissing
                spidCarrierType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            ) : this(
                altspid,
                altspidCarrierName,
                altspidCarrierType,
                city,
                lineType,
                lrn,
                ocn,
                portedDate,
                portedStatus,
                spid,
                spidCarrierName,
                spidCarrierType,
                state,
                mutableMapOf(),
            )

            /**
             * Alternative SPID (Service Provider ID). Often used when a carrier is using a number
             * from another carrier
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun altspid(): Optional<String> = altspid.getOptional("altspid")

            /**
             * Alternative service provider name
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun altspidCarrierName(): Optional<String> =
                altspidCarrierName.getOptional("altspid_carrier_name")

            /**
             * Alternative service provider type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun altspidCarrierType(): Optional<String> =
                altspidCarrierType.getOptional("altspid_carrier_type")

            /**
             * City name extracted from the locality in the Local Exchange Routing Guide (LERG)
             * database
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun city(): Optional<String> = city.getOptional("city")

            /**
             * The line type of the phone number. Uses the same value set as carrier.type; see the
             * API reference for the full list.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lineType(): Optional<LineType> = lineType.getOptional("line_type")

            /**
             * Local Routing Number, if assigned to the requested phone number
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lrn(): Optional<String> = lrn.getOptional("lrn")

            /**
             * Operating Company Name (OCN) as per the Local Exchange Routing Guide (LERG) database
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ocn(): Optional<String> = ocn.getOptional("ocn")

            /**
             * ISO-formatted date when the requested phone number has been ported
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun portedDate(): Optional<String> = portedDate.getOptional("ported_date")

            /**
             * Indicates whether or not the requested phone number has been ported
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun portedStatus(): Optional<PortedStatus> = portedStatus.getOptional("ported_status")

            /**
             * SPID (Service Provider ID)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun spid(): Optional<String> = spid.getOptional("spid")

            /**
             * Service provider name
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun spidCarrierName(): Optional<String> =
                spidCarrierName.getOptional("spid_carrier_name")

            /**
             * Service provider type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun spidCarrierType(): Optional<String> =
                spidCarrierType.getOptional("spid_carrier_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun state(): Optional<String> = state.getOptional("state")

            /**
             * Returns the raw JSON value of [altspid].
             *
             * Unlike [altspid], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("altspid") @ExcludeMissing fun _altspid(): JsonField<String> = altspid

            /**
             * Returns the raw JSON value of [altspidCarrierName].
             *
             * Unlike [altspidCarrierName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("altspid_carrier_name")
            @ExcludeMissing
            fun _altspidCarrierName(): JsonField<String> = altspidCarrierName

            /**
             * Returns the raw JSON value of [altspidCarrierType].
             *
             * Unlike [altspidCarrierType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("altspid_carrier_type")
            @ExcludeMissing
            fun _altspidCarrierType(): JsonField<String> = altspidCarrierType

            /**
             * Returns the raw JSON value of [city].
             *
             * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Returns the raw JSON value of [lineType].
             *
             * Unlike [lineType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("line_type")
            @ExcludeMissing
            fun _lineType(): JsonField<LineType> = lineType

            /**
             * Returns the raw JSON value of [lrn].
             *
             * Unlike [lrn], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lrn") @ExcludeMissing fun _lrn(): JsonField<String> = lrn

            /**
             * Returns the raw JSON value of [ocn].
             *
             * Unlike [ocn], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ocn") @ExcludeMissing fun _ocn(): JsonField<String> = ocn

            /**
             * Returns the raw JSON value of [portedDate].
             *
             * Unlike [portedDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ported_date")
            @ExcludeMissing
            fun _portedDate(): JsonField<String> = portedDate

            /**
             * Returns the raw JSON value of [portedStatus].
             *
             * Unlike [portedStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ported_status")
            @ExcludeMissing
            fun _portedStatus(): JsonField<PortedStatus> = portedStatus

            /**
             * Returns the raw JSON value of [spid].
             *
             * Unlike [spid], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("spid") @ExcludeMissing fun _spid(): JsonField<String> = spid

            /**
             * Returns the raw JSON value of [spidCarrierName].
             *
             * Unlike [spidCarrierName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("spid_carrier_name")
            @ExcludeMissing
            fun _spidCarrierName(): JsonField<String> = spidCarrierName

            /**
             * Returns the raw JSON value of [spidCarrierType].
             *
             * Unlike [spidCarrierType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("spid_carrier_type")
            @ExcludeMissing
            fun _spidCarrierType(): JsonField<String> = spidCarrierType

            /**
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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

                /** Returns a mutable builder for constructing an instance of [Portability]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Portability]. */
            class Builder internal constructor() {

                private var altspid: JsonField<String> = JsonMissing.of()
                private var altspidCarrierName: JsonField<String> = JsonMissing.of()
                private var altspidCarrierType: JsonField<String> = JsonMissing.of()
                private var city: JsonField<String> = JsonMissing.of()
                private var lineType: JsonField<LineType> = JsonMissing.of()
                private var lrn: JsonField<String> = JsonMissing.of()
                private var ocn: JsonField<String> = JsonMissing.of()
                private var portedDate: JsonField<String> = JsonMissing.of()
                private var portedStatus: JsonField<PortedStatus> = JsonMissing.of()
                private var spid: JsonField<String> = JsonMissing.of()
                private var spidCarrierName: JsonField<String> = JsonMissing.of()
                private var spidCarrierType: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(portability: Portability) = apply {
                    altspid = portability.altspid
                    altspidCarrierName = portability.altspidCarrierName
                    altspidCarrierType = portability.altspidCarrierType
                    city = portability.city
                    lineType = portability.lineType
                    lrn = portability.lrn
                    ocn = portability.ocn
                    portedDate = portability.portedDate
                    portedStatus = portability.portedStatus
                    spid = portability.spid
                    spidCarrierName = portability.spidCarrierName
                    spidCarrierType = portability.spidCarrierType
                    state = portability.state
                    additionalProperties = portability.additionalProperties.toMutableMap()
                }

                /**
                 * Alternative SPID (Service Provider ID). Often used when a carrier is using a
                 * number from another carrier
                 */
                fun altspid(altspid: String) = altspid(JsonField.of(altspid))

                /**
                 * Sets [Builder.altspid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.altspid] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun altspid(altspid: JsonField<String>) = apply { this.altspid = altspid }

                /** Alternative service provider name */
                fun altspidCarrierName(altspidCarrierName: String) =
                    altspidCarrierName(JsonField.of(altspidCarrierName))

                /**
                 * Sets [Builder.altspidCarrierName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.altspidCarrierName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun altspidCarrierName(altspidCarrierName: JsonField<String>) = apply {
                    this.altspidCarrierName = altspidCarrierName
                }

                /** Alternative service provider type */
                fun altspidCarrierType(altspidCarrierType: String) =
                    altspidCarrierType(JsonField.of(altspidCarrierType))

                /**
                 * Sets [Builder.altspidCarrierType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.altspidCarrierType] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun altspidCarrierType(altspidCarrierType: JsonField<String>) = apply {
                    this.altspidCarrierType = altspidCarrierType
                }

                /**
                 * City name extracted from the locality in the Local Exchange Routing Guide (LERG)
                 * database
                 */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /**
                 * The line type of the phone number. Uses the same value set as carrier.type; see
                 * the API reference for the full list.
                 */
                fun lineType(lineType: LineType) = lineType(JsonField.of(lineType))

                /**
                 * Sets [Builder.lineType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lineType] with a well-typed [LineType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lineType(lineType: JsonField<LineType>) = apply { this.lineType = lineType }

                /** Local Routing Number, if assigned to the requested phone number */
                fun lrn(lrn: String) = lrn(JsonField.of(lrn))

                /**
                 * Sets [Builder.lrn] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lrn] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lrn(lrn: JsonField<String>) = apply { this.lrn = lrn }

                /**
                 * Operating Company Name (OCN) as per the Local Exchange Routing Guide (LERG)
                 * database
                 */
                fun ocn(ocn: String) = ocn(JsonField.of(ocn))

                /**
                 * Sets [Builder.ocn] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ocn] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun ocn(ocn: JsonField<String>) = apply { this.ocn = ocn }

                /** ISO-formatted date when the requested phone number has been ported */
                fun portedDate(portedDate: String) = portedDate(JsonField.of(portedDate))

                /**
                 * Sets [Builder.portedDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.portedDate] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun portedDate(portedDate: JsonField<String>) = apply {
                    this.portedDate = portedDate
                }

                /** Indicates whether or not the requested phone number has been ported */
                fun portedStatus(portedStatus: PortedStatus) =
                    portedStatus(JsonField.of(portedStatus))

                /**
                 * Sets [Builder.portedStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.portedStatus] with a well-typed [PortedStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun portedStatus(portedStatus: JsonField<PortedStatus>) = apply {
                    this.portedStatus = portedStatus
                }

                /** SPID (Service Provider ID) */
                fun spid(spid: String) = spid(JsonField.of(spid))

                /**
                 * Sets [Builder.spid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spid] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun spid(spid: JsonField<String>) = apply { this.spid = spid }

                /** Service provider name */
                fun spidCarrierName(spidCarrierName: String) =
                    spidCarrierName(JsonField.of(spidCarrierName))

                /**
                 * Sets [Builder.spidCarrierName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spidCarrierName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun spidCarrierName(spidCarrierName: JsonField<String>) = apply {
                    this.spidCarrierName = spidCarrierName
                }

                /** Service provider type */
                fun spidCarrierType(spidCarrierType: String) =
                    spidCarrierType(JsonField.of(spidCarrierType))

                /**
                 * Sets [Builder.spidCarrierType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spidCarrierType] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun spidCarrierType(spidCarrierType: JsonField<String>) = apply {
                    this.spidCarrierType = spidCarrierType
                }

                fun state(state: String) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

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
                 * Returns an immutable instance of [Portability].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Portability =
                    Portability(
                        altspid,
                        altspidCarrierName,
                        altspidCarrierType,
                        city,
                        lineType,
                        lrn,
                        ocn,
                        portedDate,
                        portedStatus,
                        spid,
                        spidCarrierName,
                        spidCarrierType,
                        state,
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
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Portability = apply {
                if (validated) {
                    return@apply
                }

                altspid()
                altspidCarrierName()
                altspidCarrierType()
                city()
                lineType().ifPresent { it.validate() }
                lrn()
                ocn()
                portedDate()
                portedStatus().ifPresent { it.validate() }
                spid()
                spidCarrierName()
                spidCarrierType()
                state()
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
                (if (altspid.asKnown().isPresent) 1 else 0) +
                    (if (altspidCarrierName.asKnown().isPresent) 1 else 0) +
                    (if (altspidCarrierType.asKnown().isPresent) 1 else 0) +
                    (if (city.asKnown().isPresent) 1 else 0) +
                    (lineType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (lrn.asKnown().isPresent) 1 else 0) +
                    (if (ocn.asKnown().isPresent) 1 else 0) +
                    (if (portedDate.asKnown().isPresent) 1 else 0) +
                    (portedStatus.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (spid.asKnown().isPresent) 1 else 0) +
                    (if (spidCarrierName.asKnown().isPresent) 1 else 0) +
                    (if (spidCarrierType.asKnown().isPresent) 1 else 0) +
                    (if (state.asKnown().isPresent) 1 else 0)

            /**
             * The line type of the phone number. Uses the same value set as carrier.type; see the
             * API reference for the full list.
             */
            class LineType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FIXED_LINE = of("fixed line")

                    @JvmField val MOBILE = of("mobile")

                    @JvmField val VOIP = of("voip")

                    @JvmField val FIXED_LINE_OR_MOBILE = of("fixed line or mobile")

                    @JvmField val TOLL_FREE = of("toll free")

                    @JvmField val PREMIUM_RATE = of("premium rate")

                    @JvmField val SHARED_COST = of("shared cost")

                    @JvmField val PERSONAL_NUMBER = of("personal number")

                    @JvmField val PAGER = of("pager")

                    @JvmField val UAN = of("uan")

                    @JvmField val VOICEMAIL = of("voicemail")

                    @JvmField val UNKNOWN = of("unknown")

                    @JvmStatic fun of(value: String) = LineType(JsonField.of(value))
                }

                /** An enum containing [LineType]'s known values. */
                enum class Known {
                    FIXED_LINE,
                    MOBILE,
                    VOIP,
                    FIXED_LINE_OR_MOBILE,
                    TOLL_FREE,
                    PREMIUM_RATE,
                    SHARED_COST,
                    PERSONAL_NUMBER,
                    PAGER,
                    UAN,
                    VOICEMAIL,
                    UNKNOWN,
                }

                /**
                 * An enum containing [LineType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [LineType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FIXED_LINE,
                    MOBILE,
                    VOIP,
                    FIXED_LINE_OR_MOBILE,
                    TOLL_FREE,
                    PREMIUM_RATE,
                    SHARED_COST,
                    PERSONAL_NUMBER,
                    PAGER,
                    UAN,
                    VOICEMAIL,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [LineType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FIXED_LINE -> Value.FIXED_LINE
                        MOBILE -> Value.MOBILE
                        VOIP -> Value.VOIP
                        FIXED_LINE_OR_MOBILE -> Value.FIXED_LINE_OR_MOBILE
                        TOLL_FREE -> Value.TOLL_FREE
                        PREMIUM_RATE -> Value.PREMIUM_RATE
                        SHARED_COST -> Value.SHARED_COST
                        PERSONAL_NUMBER -> Value.PERSONAL_NUMBER
                        PAGER -> Value.PAGER
                        UAN -> Value.UAN
                        VOICEMAIL -> Value.VOICEMAIL
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FIXED_LINE -> Known.FIXED_LINE
                        MOBILE -> Known.MOBILE
                        VOIP -> Known.VOIP
                        FIXED_LINE_OR_MOBILE -> Known.FIXED_LINE_OR_MOBILE
                        TOLL_FREE -> Known.TOLL_FREE
                        PREMIUM_RATE -> Known.PREMIUM_RATE
                        SHARED_COST -> Known.SHARED_COST
                        PERSONAL_NUMBER -> Known.PERSONAL_NUMBER
                        PAGER -> Known.PAGER
                        UAN -> Known.UAN
                        VOICEMAIL -> Known.VOICEMAIL
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw TelnyxInvalidDataException("Unknown LineType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): LineType = apply {
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

                    return other is LineType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Indicates whether or not the requested phone number has been ported */
            class PortedStatus
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val Y = of("Y")

                    @JvmField val N = of("N")

                    @JvmField val EMPTY = of("")

                    @JvmStatic fun of(value: String) = PortedStatus(JsonField.of(value))
                }

                /** An enum containing [PortedStatus]'s known values. */
                enum class Known {
                    Y,
                    N,
                    EMPTY,
                }

                /**
                 * An enum containing [PortedStatus]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PortedStatus] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    Y,
                    N,
                    EMPTY,
                    /**
                     * An enum member indicating that [PortedStatus] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        Y -> Value.Y
                        N -> Value.N
                        EMPTY -> Value.EMPTY
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        Y -> Known.Y
                        N -> Known.N
                        EMPTY -> Known.EMPTY
                        else -> throw TelnyxInvalidDataException("Unknown PortedStatus: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): PortedStatus = apply {
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

                    return other is PortedStatus && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Portability &&
                    altspid == other.altspid &&
                    altspidCarrierName == other.altspidCarrierName &&
                    altspidCarrierType == other.altspidCarrierType &&
                    city == other.city &&
                    lineType == other.lineType &&
                    lrn == other.lrn &&
                    ocn == other.ocn &&
                    portedDate == other.portedDate &&
                    portedStatus == other.portedStatus &&
                    spid == other.spid &&
                    spidCarrierName == other.spidCarrierName &&
                    spidCarrierType == other.spidCarrierType &&
                    state == other.state &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    altspid,
                    altspidCarrierName,
                    altspidCarrierType,
                    city,
                    lineType,
                    lrn,
                    ocn,
                    portedDate,
                    portedStatus,
                    spid,
                    spidCarrierName,
                    spidCarrierType,
                    state,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Portability{altspid=$altspid, altspidCarrierName=$altspidCarrierName, altspidCarrierType=$altspidCarrierType, city=$city, lineType=$lineType, lrn=$lrn, ocn=$ocn, portedDate=$portedDate, portedStatus=$portedStatus, spid=$spid, spidCarrierName=$spidCarrierName, spidCarrierType=$spidCarrierType, state=$state, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                callerIdentity == other.callerIdentity &&
                callerName == other.callerName &&
                carrier == other.carrier &&
                countryCode == other.countryCode &&
                enhancedCallerName == other.enhancedCallerName &&
                fraud == other.fraud &&
                nationalFormat == other.nationalFormat &&
                nnidOverride == other.nnidOverride &&
                phoneNumber == other.phoneNumber &&
                portability == other.portability &&
                recordType == other.recordType &&
                validNumber == other.validNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                callerIdentity,
                callerName,
                carrier,
                countryCode,
                enhancedCallerName,
                fraud,
                nationalFormat,
                nnidOverride,
                phoneNumber,
                portability,
                recordType,
                validNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{callerIdentity=$callerIdentity, callerName=$callerName, carrier=$carrier, countryCode=$countryCode, enhancedCallerName=$enhancedCallerName, fraud=$fraud, nationalFormat=$nationalFormat, nnidOverride=$nnidOverride, phoneNumber=$phoneNumber, portability=$portability, recordType=$recordType, validNumber=$validNumber, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberLookupRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumberLookupRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
