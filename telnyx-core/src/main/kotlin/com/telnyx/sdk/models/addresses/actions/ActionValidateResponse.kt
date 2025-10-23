// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.addresses.actions

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
import com.telnyx.sdk.models.ApiError
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ActionValidateResponse
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

        /** Returns a mutable builder for constructing an instance of [ActionValidateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionValidateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(actionValidateResponse: ActionValidateResponse) = apply {
            data = actionValidateResponse.data
            additionalProperties = actionValidateResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ActionValidateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionValidateResponse =
            ActionValidateResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ActionValidateResponse = apply {
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
        private val result: JsonField<Result>,
        private val suggested: JsonField<Suggested>,
        private val errors: JsonField<List<ApiError>>,
        private val recordType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
            @JsonProperty("suggested")
            @ExcludeMissing
            suggested: JsonField<Suggested> = JsonMissing.of(),
            @JsonProperty("errors")
            @ExcludeMissing
            errors: JsonField<List<ApiError>> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
        ) : this(result, suggested, errors, recordType, mutableMapOf())

        /**
         * Indicates whether an address is valid or invalid.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): Result = result.getRequired("result")

        /**
         * Provides normalized address when available.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun suggested(): Suggested = suggested.getRequired("suggested")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun errors(): Optional<List<ApiError>> = errors.getOptional("errors")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        /**
         * Returns the raw JSON value of [suggested].
         *
         * Unlike [suggested], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("suggested")
        @ExcludeMissing
        fun _suggested(): JsonField<Suggested> = suggested

        /**
         * Returns the raw JSON value of [errors].
         *
         * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<ApiError>> = errors

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .result()
             * .suggested()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var result: JsonField<Result>? = null
            private var suggested: JsonField<Suggested>? = null
            private var errors: JsonField<MutableList<ApiError>>? = null
            private var recordType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                result = data.result
                suggested = data.suggested
                errors = data.errors.map { it.toMutableList() }
                recordType = data.recordType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Indicates whether an address is valid or invalid. */
            fun result(result: Result) = result(JsonField.of(result))

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [Result] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** Provides normalized address when available. */
            fun suggested(suggested: Suggested) = suggested(JsonField.of(suggested))

            /**
             * Sets [Builder.suggested] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suggested] with a well-typed [Suggested] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suggested(suggested: JsonField<Suggested>) = apply { this.suggested = suggested }

            fun errors(errors: List<ApiError>) = errors(JsonField.of(errors))

            /**
             * Sets [Builder.errors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errors] with a well-typed `List<ApiError>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errors(errors: JsonField<List<ApiError>>) = apply {
                this.errors = errors.map { it.toMutableList() }
            }

            /**
             * Adds a single [ApiError] to [errors].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addError(error: ApiError) = apply {
                errors =
                    (errors ?: JsonField.of(mutableListOf())).also {
                        checkKnown("errors", it).add(error)
                    }
            }

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

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
             *
             * The following fields are required:
             * ```java
             * .result()
             * .suggested()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("result", result),
                    checkRequired("suggested", suggested),
                    (errors ?: JsonMissing.of()).map { it.toImmutable() },
                    recordType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            result().validate()
            suggested().validate()
            errors().ifPresent { it.forEach { it.validate() } }
            recordType()
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
            (result.asKnown().getOrNull()?.validity() ?: 0) +
                (suggested.asKnown().getOrNull()?.validity() ?: 0) +
                (errors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (recordType.asKnown().isPresent) 1 else 0)

        /** Indicates whether an address is valid or invalid. */
        class Result @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val VALID = of("valid")

                @JvmField val INVALID = of("invalid")

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            /** An enum containing [Result]'s known values. */
            enum class Known {
                VALID,
                INVALID,
            }

            /**
             * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Result] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                VALID,
                INVALID,
                /**
                 * An enum member indicating that [Result] was instantiated with an unknown value.
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
                    VALID -> Value.VALID
                    INVALID -> Value.INVALID
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
                    VALID -> Known.VALID
                    INVALID -> Known.INVALID
                    else -> throw TelnyxInvalidDataException("Unknown Result: $value")
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

            fun validate(): Result = apply {
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

                return other is Result && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Provides normalized address when available. */
        class Suggested
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val administrativeArea: JsonField<String>,
            private val countryCode: JsonField<String>,
            private val extendedAddress: JsonField<String>,
            private val locality: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val streetAddress: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("administrative_area")
                @ExcludeMissing
                administrativeArea: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country_code")
                @ExcludeMissing
                countryCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("extended_address")
                @ExcludeMissing
                extendedAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("locality")
                @ExcludeMissing
                locality: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("street_address")
                @ExcludeMissing
                streetAddress: JsonField<String> = JsonMissing.of(),
            ) : this(
                administrativeArea,
                countryCode,
                extendedAddress,
                locality,
                postalCode,
                streetAddress,
                mutableMapOf(),
            )

            /**
             * The locality of the address. For US addresses, this corresponds to the state of the
             * address.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun administrativeArea(): Optional<String> =
                administrativeArea.getOptional("administrative_area")

            /**
             * The two-character (ISO 3166-1 alpha-2) country code of the address.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

            /**
             * Additional street address information about the address such as, but not limited to,
             * unit number or apartment number.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun extendedAddress(): Optional<String> =
                extendedAddress.getOptional("extended_address")

            /**
             * The locality of the address. For US addresses, this corresponds to the city of the
             * address.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun locality(): Optional<String> = locality.getOptional("locality")

            /**
             * The postal code of the address.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

            /**
             * The primary street address information about the address.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun streetAddress(): Optional<String> = streetAddress.getOptional("street_address")

            /**
             * Returns the raw JSON value of [administrativeArea].
             *
             * Unlike [administrativeArea], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("administrative_area")
            @ExcludeMissing
            fun _administrativeArea(): JsonField<String> = administrativeArea

            /**
             * Returns the raw JSON value of [countryCode].
             *
             * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("country_code")
            @ExcludeMissing
            fun _countryCode(): JsonField<String> = countryCode

            /**
             * Returns the raw JSON value of [extendedAddress].
             *
             * Unlike [extendedAddress], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("extended_address")
            @ExcludeMissing
            fun _extendedAddress(): JsonField<String> = extendedAddress

            /**
             * Returns the raw JSON value of [locality].
             *
             * Unlike [locality], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

            /**
             * Returns the raw JSON value of [postalCode].
             *
             * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /**
             * Returns the raw JSON value of [streetAddress].
             *
             * Unlike [streetAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("street_address")
            @ExcludeMissing
            fun _streetAddress(): JsonField<String> = streetAddress

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

                /** Returns a mutable builder for constructing an instance of [Suggested]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Suggested]. */
            class Builder internal constructor() {

                private var administrativeArea: JsonField<String> = JsonMissing.of()
                private var countryCode: JsonField<String> = JsonMissing.of()
                private var extendedAddress: JsonField<String> = JsonMissing.of()
                private var locality: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var streetAddress: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(suggested: Suggested) = apply {
                    administrativeArea = suggested.administrativeArea
                    countryCode = suggested.countryCode
                    extendedAddress = suggested.extendedAddress
                    locality = suggested.locality
                    postalCode = suggested.postalCode
                    streetAddress = suggested.streetAddress
                    additionalProperties = suggested.additionalProperties.toMutableMap()
                }

                /**
                 * The locality of the address. For US addresses, this corresponds to the state of
                 * the address.
                 */
                fun administrativeArea(administrativeArea: String) =
                    administrativeArea(JsonField.of(administrativeArea))

                /**
                 * Sets [Builder.administrativeArea] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.administrativeArea] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun administrativeArea(administrativeArea: JsonField<String>) = apply {
                    this.administrativeArea = administrativeArea
                }

                /** The two-character (ISO 3166-1 alpha-2) country code of the address. */
                fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

                /**
                 * Sets [Builder.countryCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.countryCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun countryCode(countryCode: JsonField<String>) = apply {
                    this.countryCode = countryCode
                }

                /**
                 * Additional street address information about the address such as, but not limited
                 * to, unit number or apartment number.
                 */
                fun extendedAddress(extendedAddress: String) =
                    extendedAddress(JsonField.of(extendedAddress))

                /**
                 * Sets [Builder.extendedAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.extendedAddress] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun extendedAddress(extendedAddress: JsonField<String>) = apply {
                    this.extendedAddress = extendedAddress
                }

                /**
                 * The locality of the address. For US addresses, this corresponds to the city of
                 * the address.
                 */
                fun locality(locality: String) = locality(JsonField.of(locality))

                /**
                 * Sets [Builder.locality] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.locality] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun locality(locality: JsonField<String>) = apply { this.locality = locality }

                /** The postal code of the address. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /**
                 * Sets [Builder.postalCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postalCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The primary street address information about the address. */
                fun streetAddress(streetAddress: String) =
                    streetAddress(JsonField.of(streetAddress))

                /**
                 * Sets [Builder.streetAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.streetAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun streetAddress(streetAddress: JsonField<String>) = apply {
                    this.streetAddress = streetAddress
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
                 * Returns an immutable instance of [Suggested].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Suggested =
                    Suggested(
                        administrativeArea,
                        countryCode,
                        extendedAddress,
                        locality,
                        postalCode,
                        streetAddress,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Suggested = apply {
                if (validated) {
                    return@apply
                }

                administrativeArea()
                countryCode()
                extendedAddress()
                locality()
                postalCode()
                streetAddress()
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
                (if (administrativeArea.asKnown().isPresent) 1 else 0) +
                    (if (countryCode.asKnown().isPresent) 1 else 0) +
                    (if (extendedAddress.asKnown().isPresent) 1 else 0) +
                    (if (locality.asKnown().isPresent) 1 else 0) +
                    (if (postalCode.asKnown().isPresent) 1 else 0) +
                    (if (streetAddress.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Suggested &&
                    administrativeArea == other.administrativeArea &&
                    countryCode == other.countryCode &&
                    extendedAddress == other.extendedAddress &&
                    locality == other.locality &&
                    postalCode == other.postalCode &&
                    streetAddress == other.streetAddress &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    administrativeArea,
                    countryCode,
                    extendedAddress,
                    locality,
                    postalCode,
                    streetAddress,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Suggested{administrativeArea=$administrativeArea, countryCode=$countryCode, extendedAddress=$extendedAddress, locality=$locality, postalCode=$postalCode, streetAddress=$streetAddress, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                result == other.result &&
                suggested == other.suggested &&
                errors == other.errors &&
                recordType == other.recordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(result, suggested, errors, recordType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{result=$result, suggested=$suggested, errors=$errors, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionValidateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionValidateResponse{data=$data, additionalProperties=$additionalProperties}"
}
