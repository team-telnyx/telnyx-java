// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.advancedorders

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AdvancedOrder
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val areaCode: JsonField<String>,
    private val comments: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val customerReference: JsonField<String>,
    private val features: JsonField<List<Feature>>,
    private val phoneNumberType: JsonField<PhoneNumberType>,
    private val quantity: JsonField<Long>,
    private val requirementGroupId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("area_code") @ExcludeMissing areaCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comments") @ExcludeMissing comments: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country_code")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_reference")
        @ExcludeMissing
        customerReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("features")
        @ExcludeMissing
        features: JsonField<List<Feature>> = JsonMissing.of(),
        @JsonProperty("phone_number_type")
        @ExcludeMissing
        phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("requirement_group_id")
        @ExcludeMissing
        requirementGroupId: JsonField<String> = JsonMissing.of(),
    ) : this(
        areaCode,
        comments,
        countryCode,
        customerReference,
        features,
        phoneNumberType,
        quantity,
        requirementGroupId,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun areaCode(): Optional<String> = areaCode.getOptional("area_code")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comments(): Optional<String> = comments.getOptional("comments")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = customerReference.getOptional("customer_reference")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun features(): Optional<List<Feature>> = features.getOptional("features")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberType(): Optional<PhoneNumberType> =
        phoneNumberType.getOptional("phone_number_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantity(): Optional<Long> = quantity.getOptional("quantity")

    /**
     * The ID of the requirement group to associate with this advanced order
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requirementGroupId(): Optional<String> =
        requirementGroupId.getOptional("requirement_group_id")

    /**
     * Returns the raw JSON value of [areaCode].
     *
     * Unlike [areaCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("area_code") @ExcludeMissing fun _areaCode(): JsonField<String> = areaCode

    /**
     * Returns the raw JSON value of [comments].
     *
     * Unlike [comments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<String> = comments

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_code")
    @ExcludeMissing
    fun _countryCode(): JsonField<String> = countryCode

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
     * Returns the raw JSON value of [features].
     *
     * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("features") @ExcludeMissing fun _features(): JsonField<List<Feature>> = features

    /**
     * Returns the raw JSON value of [phoneNumberType].
     *
     * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number_type")
    @ExcludeMissing
    fun _phoneNumberType(): JsonField<PhoneNumberType> = phoneNumberType

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

    /**
     * Returns the raw JSON value of [requirementGroupId].
     *
     * Unlike [requirementGroupId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requirement_group_id")
    @ExcludeMissing
    fun _requirementGroupId(): JsonField<String> = requirementGroupId

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

        /** Returns a mutable builder for constructing an instance of [AdvancedOrder]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AdvancedOrder]. */
    class Builder internal constructor() {

        private var areaCode: JsonField<String> = JsonMissing.of()
        private var comments: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var customerReference: JsonField<String> = JsonMissing.of()
        private var features: JsonField<MutableList<Feature>>? = null
        private var phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of()
        private var quantity: JsonField<Long> = JsonMissing.of()
        private var requirementGroupId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(advancedOrder: AdvancedOrder) = apply {
            areaCode = advancedOrder.areaCode
            comments = advancedOrder.comments
            countryCode = advancedOrder.countryCode
            customerReference = advancedOrder.customerReference
            features = advancedOrder.features.map { it.toMutableList() }
            phoneNumberType = advancedOrder.phoneNumberType
            quantity = advancedOrder.quantity
            requirementGroupId = advancedOrder.requirementGroupId
            additionalProperties = advancedOrder.additionalProperties.toMutableMap()
        }

        fun areaCode(areaCode: String) = areaCode(JsonField.of(areaCode))

        /**
         * Sets [Builder.areaCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.areaCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun areaCode(areaCode: JsonField<String>) = apply { this.areaCode = areaCode }

        fun comments(comments: String) = comments(JsonField.of(comments))

        /**
         * Sets [Builder.comments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comments] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comments(comments: JsonField<String>) = apply { this.comments = comments }

        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

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

        fun features(features: List<Feature>) = features(JsonField.of(features))

        /**
         * Sets [Builder.features] to an arbitrary JSON value.
         *
         * You should usually call [Builder.features] with a well-typed `List<Feature>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun features(features: JsonField<List<Feature>>) = apply {
            this.features = features.map { it.toMutableList() }
        }

        /**
         * Adds a single [Feature] to [features].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFeature(feature: Feature) = apply {
            features =
                (features ?: JsonField.of(mutableListOf())).also {
                    checkKnown("features", it).add(feature)
                }
        }

        fun phoneNumberType(phoneNumberType: PhoneNumberType) =
            phoneNumberType(JsonField.of(phoneNumberType))

        /**
         * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberType] with a well-typed [PhoneNumberType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumberType(phoneNumberType: JsonField<PhoneNumberType>) = apply {
            this.phoneNumberType = phoneNumberType
        }

        fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

        /** The ID of the requirement group to associate with this advanced order */
        fun requirementGroupId(requirementGroupId: String) =
            requirementGroupId(JsonField.of(requirementGroupId))

        /**
         * Sets [Builder.requirementGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirementGroupId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requirementGroupId(requirementGroupId: JsonField<String>) = apply {
            this.requirementGroupId = requirementGroupId
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
         * Returns an immutable instance of [AdvancedOrder].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AdvancedOrder =
            AdvancedOrder(
                areaCode,
                comments,
                countryCode,
                customerReference,
                (features ?: JsonMissing.of()).map { it.toImmutable() },
                phoneNumberType,
                quantity,
                requirementGroupId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AdvancedOrder = apply {
        if (validated) {
            return@apply
        }

        areaCode()
        comments()
        countryCode()
        customerReference()
        features().ifPresent { it.forEach { it.validate() } }
        phoneNumberType().ifPresent { it.validate() }
        quantity()
        requirementGroupId()
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
        (if (areaCode.asKnown().isPresent) 1 else 0) +
            (if (comments.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (customerReference.asKnown().isPresent) 1 else 0) +
            (features.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (phoneNumberType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (if (requirementGroupId.asKnown().isPresent) 1 else 0)

    class Feature @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SMS = of("sms")

            @JvmField val MMS = of("mms")

            @JvmField val VOICE = of("voice")

            @JvmField val FAX = of("fax")

            @JvmField val EMERGENCY = of("emergency")

            @JvmStatic fun of(value: String) = Feature(JsonField.of(value))
        }

        /** An enum containing [Feature]'s known values. */
        enum class Known {
            SMS,
            MMS,
            VOICE,
            FAX,
            EMERGENCY,
        }

        /**
         * An enum containing [Feature]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Feature] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SMS,
            MMS,
            VOICE,
            FAX,
            EMERGENCY,
            /** An enum member indicating that [Feature] was instantiated with an unknown value. */
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
                SMS -> Value.SMS
                MMS -> Value.MMS
                VOICE -> Value.VOICE
                FAX -> Value.FAX
                EMERGENCY -> Value.EMERGENCY
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
                SMS -> Known.SMS
                MMS -> Known.MMS
                VOICE -> Known.VOICE
                FAX -> Known.FAX
                EMERGENCY -> Known.EMERGENCY
                else -> throw TelnyxInvalidDataException("Unknown Feature: $value")
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

        fun validate(): Feature = apply {
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

            return other is Feature && value == other.value
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

            @JvmField val MOBILE = of("mobile")

            @JvmField val TOLL_FREE = of("toll_free")

            @JvmField val SHARED_COST = of("shared_cost")

            @JvmField val NATIONAL = of("national")

            @JvmField val LANDLINE = of("landline")

            @JvmStatic fun of(value: String) = PhoneNumberType(JsonField.of(value))
        }

        /** An enum containing [PhoneNumberType]'s known values. */
        enum class Known {
            LOCAL,
            MOBILE,
            TOLL_FREE,
            SHARED_COST,
            NATIONAL,
            LANDLINE,
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
            MOBILE,
            TOLL_FREE,
            SHARED_COST,
            NATIONAL,
            LANDLINE,
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
                MOBILE -> Value.MOBILE
                TOLL_FREE -> Value.TOLL_FREE
                SHARED_COST -> Value.SHARED_COST
                NATIONAL -> Value.NATIONAL
                LANDLINE -> Value.LANDLINE
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
                MOBILE -> Known.MOBILE
                TOLL_FREE -> Known.TOLL_FREE
                SHARED_COST -> Known.SHARED_COST
                NATIONAL -> Known.NATIONAL
                LANDLINE -> Known.LANDLINE
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AdvancedOrder &&
            areaCode == other.areaCode &&
            comments == other.comments &&
            countryCode == other.countryCode &&
            customerReference == other.customerReference &&
            features == other.features &&
            phoneNumberType == other.phoneNumberType &&
            quantity == other.quantity &&
            requirementGroupId == other.requirementGroupId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            areaCode,
            comments,
            countryCode,
            customerReference,
            features,
            phoneNumberType,
            quantity,
            requirementGroupId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AdvancedOrder{areaCode=$areaCode, comments=$comments, countryCode=$countryCode, customerReference=$customerReference, features=$features, phoneNumberType=$phoneNumberType, quantity=$quantity, requirementGroupId=$requirementGroupId, additionalProperties=$additionalProperties}"
}
