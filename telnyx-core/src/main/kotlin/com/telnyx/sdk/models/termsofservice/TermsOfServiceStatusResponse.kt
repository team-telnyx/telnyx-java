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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TermsOfServiceStatusResponse
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
     * Whether the calling user has agreed to a product's current Terms of Service. The `user_id` is
     * intentionally omitted on this public surface.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

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
         * Returns a mutable builder for constructing an instance of [TermsOfServiceStatusResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TermsOfServiceStatusResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(termsOfServiceStatusResponse: TermsOfServiceStatusResponse) = apply {
            data = termsOfServiceStatusResponse.data
            additionalProperties = termsOfServiceStatusResponse.additionalProperties.toMutableMap()
        }

        /**
         * Whether the calling user has agreed to a product's current Terms of Service. The
         * `user_id` is intentionally omitted on this public surface.
         */
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
         * Returns an immutable instance of [TermsOfServiceStatusResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TermsOfServiceStatusResponse =
            TermsOfServiceStatusResponse(
                checkRequired("data", data),
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
    fun validate(): TermsOfServiceStatusResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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

    /**
     * Whether the calling user has agreed to a product's current Terms of Service. The `user_id` is
     * intentionally omitted on this public surface.
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agreementRequired: JsonField<Boolean>,
        private val currentTermsVersion: JsonField<String>,
        private val hasAgreed: JsonField<Boolean>,
        private val productType: JsonField<ProductType>,
        private val agreedAt: JsonField<OffsetDateTime>,
        private val agreedVersion: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agreement_required")
            @ExcludeMissing
            agreementRequired: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("current_terms_version")
            @ExcludeMissing
            currentTermsVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("has_agreed")
            @ExcludeMissing
            hasAgreed: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("product_type")
            @ExcludeMissing
            productType: JsonField<ProductType> = JsonMissing.of(),
            @JsonProperty("agreed_at")
            @ExcludeMissing
            agreedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("agreed_version")
            @ExcludeMissing
            agreedVersion: JsonField<String> = JsonMissing.of(),
        ) : this(
            agreementRequired,
            currentTermsVersion,
            hasAgreed,
            productType,
            agreedAt,
            agreedVersion,
            mutableMapOf(),
        )

        /**
         * `true` when the user must agree to the latest version before using the product.
         * Equivalent to `!has_agreed`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun agreementRequired(): Boolean = agreementRequired.getRequired("agreement_required")

        /**
         * Latest published version of the ToS for this product.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currentTermsVersion(): String = currentTermsVersion.getRequired("current_terms_version")

        /**
         * `true` if the user has agreed to the latest version.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hasAgreed(): Boolean = hasAgreed.getRequired("has_agreed")

        /**
         * Telnyx product the Terms of Service apply to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productType(): ProductType = productType.getRequired("product_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agreedAt(): Optional<OffsetDateTime> = agreedAt.getOptional("agreed_at")

        /**
         * Version the user previously agreed to (may be older than `current_terms_version`). `null`
         * if the user has never agreed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agreedVersion(): Optional<String> = agreedVersion.getOptional("agreed_version")

        /**
         * Returns the raw JSON value of [agreementRequired].
         *
         * Unlike [agreementRequired], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("agreement_required")
        @ExcludeMissing
        fun _agreementRequired(): JsonField<Boolean> = agreementRequired

        /**
         * Returns the raw JSON value of [currentTermsVersion].
         *
         * Unlike [currentTermsVersion], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("current_terms_version")
        @ExcludeMissing
        fun _currentTermsVersion(): JsonField<String> = currentTermsVersion

        /**
         * Returns the raw JSON value of [hasAgreed].
         *
         * Unlike [hasAgreed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("has_agreed") @ExcludeMissing fun _hasAgreed(): JsonField<Boolean> = hasAgreed

        /**
         * Returns the raw JSON value of [productType].
         *
         * Unlike [productType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_type")
        @ExcludeMissing
        fun _productType(): JsonField<ProductType> = productType

        /**
         * Returns the raw JSON value of [agreedAt].
         *
         * Unlike [agreedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agreed_at")
        @ExcludeMissing
        fun _agreedAt(): JsonField<OffsetDateTime> = agreedAt

        /**
         * Returns the raw JSON value of [agreedVersion].
         *
         * Unlike [agreedVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("agreed_version")
        @ExcludeMissing
        fun _agreedVersion(): JsonField<String> = agreedVersion

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
             * .agreementRequired()
             * .currentTermsVersion()
             * .hasAgreed()
             * .productType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var agreementRequired: JsonField<Boolean>? = null
            private var currentTermsVersion: JsonField<String>? = null
            private var hasAgreed: JsonField<Boolean>? = null
            private var productType: JsonField<ProductType>? = null
            private var agreedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var agreedVersion: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                agreementRequired = data.agreementRequired
                currentTermsVersion = data.currentTermsVersion
                hasAgreed = data.hasAgreed
                productType = data.productType
                agreedAt = data.agreedAt
                agreedVersion = data.agreedVersion
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * `true` when the user must agree to the latest version before using the product.
             * Equivalent to `!has_agreed`.
             */
            fun agreementRequired(agreementRequired: Boolean) =
                agreementRequired(JsonField.of(agreementRequired))

            /**
             * Sets [Builder.agreementRequired] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agreementRequired] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agreementRequired(agreementRequired: JsonField<Boolean>) = apply {
                this.agreementRequired = agreementRequired
            }

            /** Latest published version of the ToS for this product. */
            fun currentTermsVersion(currentTermsVersion: String) =
                currentTermsVersion(JsonField.of(currentTermsVersion))

            /**
             * Sets [Builder.currentTermsVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentTermsVersion] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun currentTermsVersion(currentTermsVersion: JsonField<String>) = apply {
                this.currentTermsVersion = currentTermsVersion
            }

            /** `true` if the user has agreed to the latest version. */
            fun hasAgreed(hasAgreed: Boolean) = hasAgreed(JsonField.of(hasAgreed))

            /**
             * Sets [Builder.hasAgreed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasAgreed] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasAgreed(hasAgreed: JsonField<Boolean>) = apply { this.hasAgreed = hasAgreed }

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

            fun agreedAt(agreedAt: OffsetDateTime?) = agreedAt(JsonField.ofNullable(agreedAt))

            /** Alias for calling [Builder.agreedAt] with `agreedAt.orElse(null)`. */
            fun agreedAt(agreedAt: Optional<OffsetDateTime>) = agreedAt(agreedAt.getOrNull())

            /**
             * Sets [Builder.agreedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agreedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agreedAt(agreedAt: JsonField<OffsetDateTime>) = apply { this.agreedAt = agreedAt }

            /**
             * Version the user previously agreed to (may be older than `current_terms_version`).
             * `null` if the user has never agreed.
             */
            fun agreedVersion(agreedVersion: String?) =
                agreedVersion(JsonField.ofNullable(agreedVersion))

            /** Alias for calling [Builder.agreedVersion] with `agreedVersion.orElse(null)`. */
            fun agreedVersion(agreedVersion: Optional<String>) =
                agreedVersion(agreedVersion.getOrNull())

            /**
             * Sets [Builder.agreedVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agreedVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agreedVersion(agreedVersion: JsonField<String>) = apply {
                this.agreedVersion = agreedVersion
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
             *
             * The following fields are required:
             * ```java
             * .agreementRequired()
             * .currentTermsVersion()
             * .hasAgreed()
             * .productType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("agreementRequired", agreementRequired),
                    checkRequired("currentTermsVersion", currentTermsVersion),
                    checkRequired("hasAgreed", hasAgreed),
                    checkRequired("productType", productType),
                    agreedAt,
                    agreedVersion,
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

            agreementRequired()
            currentTermsVersion()
            hasAgreed()
            productType().validate()
            agreedAt()
            agreedVersion()
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
            (if (agreementRequired.asKnown().isPresent) 1 else 0) +
                (if (currentTermsVersion.asKnown().isPresent) 1 else 0) +
                (if (hasAgreed.asKnown().isPresent) 1 else 0) +
                (productType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (agreedAt.asKnown().isPresent) 1 else 0) +
                (if (agreedVersion.asKnown().isPresent) 1 else 0)

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

            return other is Data &&
                agreementRequired == other.agreementRequired &&
                currentTermsVersion == other.currentTermsVersion &&
                hasAgreed == other.hasAgreed &&
                productType == other.productType &&
                agreedAt == other.agreedAt &&
                agreedVersion == other.agreedVersion &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                agreementRequired,
                currentTermsVersion,
                hasAgreed,
                productType,
                agreedAt,
                agreedVersion,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{agreementRequired=$agreementRequired, currentTermsVersion=$currentTermsVersion, hasAgreed=$hasAgreed, productType=$productType, agreedAt=$agreedAt, agreedVersion=$agreedVersion, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TermsOfServiceStatusResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TermsOfServiceStatusResponse{data=$data, additionalProperties=$additionalProperties}"
}
