// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice

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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TermsOfServiceRetrieveInfoResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val agreements: JsonField<List<Agreement>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agreements")
        @ExcludeMissing
        agreements: JsonField<List<Agreement>> = JsonMissing.of()
    ) : this(agreements, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agreements(): Optional<List<Agreement>> = agreements.getOptional("agreements")

    /**
     * Returns the raw JSON value of [agreements].
     *
     * Unlike [agreements], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agreements")
    @ExcludeMissing
    fun _agreements(): JsonField<List<Agreement>> = agreements

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
         * Returns a mutable builder for constructing an instance of
         * [TermsOfServiceRetrieveInfoResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TermsOfServiceRetrieveInfoResponse]. */
    class Builder internal constructor() {

        private var agreements: JsonField<MutableList<Agreement>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(termsOfServiceRetrieveInfoResponse: TermsOfServiceRetrieveInfoResponse) =
            apply {
                agreements =
                    termsOfServiceRetrieveInfoResponse.agreements.map { it.toMutableList() }
                additionalProperties =
                    termsOfServiceRetrieveInfoResponse.additionalProperties.toMutableMap()
            }

        fun agreements(agreements: List<Agreement>) = agreements(JsonField.of(agreements))

        /**
         * Sets [Builder.agreements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agreements] with a well-typed `List<Agreement>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agreements(agreements: JsonField<List<Agreement>>) = apply {
            this.agreements = agreements.map { it.toMutableList() }
        }

        /**
         * Adds a single [Agreement] to [agreements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAgreement(agreement: Agreement) = apply {
            agreements =
                (agreements ?: JsonField.of(mutableListOf())).also {
                    checkKnown("agreements", it).add(agreement)
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
         * Returns an immutable instance of [TermsOfServiceRetrieveInfoResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TermsOfServiceRetrieveInfoResponse =
            TermsOfServiceRetrieveInfoResponse(
                (agreements ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): TermsOfServiceRetrieveInfoResponse = apply {
        if (validated) {
            return@apply
        }

        agreements().ifPresent { it.forEach { it.validate() } }
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
        (agreements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Agreement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currentVersion: JsonField<String>,
        private val description: JsonField<String>,
        private val effectiveDate: JsonField<LocalDate>,
        private val productType: JsonField<ProductType>,
        private val termsUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("current_version")
            @ExcludeMissing
            currentVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("effective_date")
            @ExcludeMissing
            effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("product_type")
            @ExcludeMissing
            productType: JsonField<ProductType> = JsonMissing.of(),
            @JsonProperty("terms_url")
            @ExcludeMissing
            termsUrl: JsonField<String> = JsonMissing.of(),
        ) : this(currentVersion, description, effectiveDate, productType, termsUrl, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currentVersion(): Optional<String> = currentVersion.getOptional("current_version")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun effectiveDate(): Optional<LocalDate> = effectiveDate.getOptional("effective_date")

        /**
         * Telnyx product the Terms of Service apply to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productType(): Optional<ProductType> = productType.getOptional("product_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun termsUrl(): Optional<String> = termsUrl.getOptional("terms_url")

        /**
         * Returns the raw JSON value of [currentVersion].
         *
         * Unlike [currentVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("current_version")
        @ExcludeMissing
        fun _currentVersion(): JsonField<String> = currentVersion

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [effectiveDate].
         *
         * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

        /**
         * Returns the raw JSON value of [productType].
         *
         * Unlike [productType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_type")
        @ExcludeMissing
        fun _productType(): JsonField<ProductType> = productType

        /**
         * Returns the raw JSON value of [termsUrl].
         *
         * Unlike [termsUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("terms_url") @ExcludeMissing fun _termsUrl(): JsonField<String> = termsUrl

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

            /** Returns a mutable builder for constructing an instance of [Agreement]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Agreement]. */
        class Builder internal constructor() {

            private var currentVersion: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
            private var productType: JsonField<ProductType> = JsonMissing.of()
            private var termsUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(agreement: Agreement) = apply {
                currentVersion = agreement.currentVersion
                description = agreement.description
                effectiveDate = agreement.effectiveDate
                productType = agreement.productType
                termsUrl = agreement.termsUrl
                additionalProperties = agreement.additionalProperties.toMutableMap()
            }

            fun currentVersion(currentVersion: String) =
                currentVersion(JsonField.of(currentVersion))

            /**
             * Sets [Builder.currentVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currentVersion(currentVersion: JsonField<String>) = apply {
                this.currentVersion = currentVersion
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            /**
             * Sets [Builder.effectiveDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            /** Telnyx product the Terms of Service apply to. */
            fun productType(productType: ProductType) = productType(JsonField.of(productType))

            /**
             * Sets [Builder.productType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productType] with a well-typed [ProductType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productType(productType: JsonField<ProductType>) = apply {
                this.productType = productType
            }

            fun termsUrl(termsUrl: String) = termsUrl(JsonField.of(termsUrl))

            /**
             * Sets [Builder.termsUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.termsUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun termsUrl(termsUrl: JsonField<String>) = apply { this.termsUrl = termsUrl }

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
             * Returns an immutable instance of [Agreement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Agreement =
                Agreement(
                    currentVersion,
                    description,
                    effectiveDate,
                    productType,
                    termsUrl,
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
        fun validate(): Agreement = apply {
            if (validated) {
                return@apply
            }

            currentVersion()
            description()
            effectiveDate()
            productType().ifPresent { it.validate() }
            termsUrl()
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
            (if (currentVersion.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (effectiveDate.asKnown().isPresent) 1 else 0) +
                (productType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (termsUrl.asKnown().isPresent) 1 else 0)

        /** Telnyx product the Terms of Service apply to. */
        class ProductType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val BRANDED_CALLING = of("branded_calling")

                @JvmField val NUMBER_REPUTATION = of("number_reputation")

                @JvmStatic fun of(value: String) = ProductType(JsonField.of(value))
            }

            /** An enum containing [ProductType]'s known values. */
            enum class Known {
                BRANDED_CALLING,
                NUMBER_REPUTATION,
            }

            /**
             * An enum containing [ProductType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ProductType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BRANDED_CALLING,
                NUMBER_REPUTATION,
                /**
                 * An enum member indicating that [ProductType] was instantiated with an unknown
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
                    BRANDED_CALLING -> Value.BRANDED_CALLING
                    NUMBER_REPUTATION -> Value.NUMBER_REPUTATION
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
                    BRANDED_CALLING -> Known.BRANDED_CALLING
                    NUMBER_REPUTATION -> Known.NUMBER_REPUTATION
                    else -> throw TelnyxInvalidDataException("Unknown ProductType: $value")
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
            fun validate(): ProductType = apply {
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

                return other is ProductType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Agreement &&
                currentVersion == other.currentVersion &&
                description == other.description &&
                effectiveDate == other.effectiveDate &&
                productType == other.productType &&
                termsUrl == other.termsUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currentVersion,
                description,
                effectiveDate,
                productType,
                termsUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Agreement{currentVersion=$currentVersion, description=$description, effectiveDate=$effectiveDate, productType=$productType, termsUrl=$termsUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TermsOfServiceRetrieveInfoResponse &&
            agreements == other.agreements &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(agreements, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TermsOfServiceRetrieveInfoResponse{agreements=$agreements, additionalProperties=$additionalProperties}"
}
