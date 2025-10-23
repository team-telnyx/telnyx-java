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
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PhoneNumberWithMessagingSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val eligibleMessagingProducts: JsonField<List<String>>,
    private val features: JsonField<Features>,
    private val health: JsonField<NumberHealthMetrics>,
    private val messagingProduct: JsonField<String>,
    private val messagingProfileId: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val recordType: JsonField<RecordType>,
    private val trafficType: JsonField<String>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country_code")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("eligible_messaging_products")
        @ExcludeMissing
        eligibleMessagingProducts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("features") @ExcludeMissing features: JsonField<Features> = JsonMissing.of(),
        @JsonProperty("health")
        @ExcludeMissing
        health: JsonField<NumberHealthMetrics> = JsonMissing.of(),
        @JsonProperty("messaging_product")
        @ExcludeMissing
        messagingProduct: JsonField<String> = JsonMissing.of(),
        @JsonProperty("messaging_profile_id")
        @ExcludeMissing
        messagingProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("traffic_type")
        @ExcludeMissing
        trafficType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        countryCode,
        createdAt,
        eligibleMessagingProducts,
        features,
        health,
        messagingProduct,
        messagingProfileId,
        phoneNumber,
        recordType,
        trafficType,
        type,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Identifies the type of resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * ISO 3166-1 alpha-2 country code.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * The messaging products that this number can be registered to use
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eligibleMessagingProducts(): Optional<List<String>> =
        eligibleMessagingProducts.getOptional("eligible_messaging_products")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun features(): Optional<Features> = features.getOptional("features")

    /**
     * High level health metrics about the number and it's messaging sending patterns.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun health(): Optional<NumberHealthMetrics> = health.getOptional("health")

    /**
     * The messaging product that the number is registered to use
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingProduct(): Optional<String> = messagingProduct.getOptional("messaging_product")

    /**
     * Unique identifier for a messaging profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingProfileId(): Optional<String> =
        messagingProfileId.getOptional("messaging_profile_id")

    /**
     * +E.164 formatted phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

    /**
     * The messaging traffic or use case for which the number is currently configured.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trafficType(): Optional<String> = trafficType.getOptional("traffic_type")

    /**
     * The type of the phone number
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_code")
    @ExcludeMissing
    fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [eligibleMessagingProducts].
     *
     * Unlike [eligibleMessagingProducts], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("eligible_messaging_products")
    @ExcludeMissing
    fun _eligibleMessagingProducts(): JsonField<List<String>> = eligibleMessagingProducts

    /**
     * Returns the raw JSON value of [features].
     *
     * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("features") @ExcludeMissing fun _features(): JsonField<Features> = features

    /**
     * Returns the raw JSON value of [health].
     *
     * Unlike [health], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("health") @ExcludeMissing fun _health(): JsonField<NumberHealthMetrics> = health

    /**
     * Returns the raw JSON value of [messagingProduct].
     *
     * Unlike [messagingProduct], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("messaging_product")
    @ExcludeMissing
    fun _messagingProduct(): JsonField<String> = messagingProduct

    /**
     * Returns the raw JSON value of [messagingProfileId].
     *
     * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("messaging_profile_id")
    @ExcludeMissing
    fun _messagingProfileId(): JsonField<String> = messagingProfileId

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [trafficType].
     *
     * Unlike [trafficType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("traffic_type")
    @ExcludeMissing
    fun _trafficType(): JsonField<String> = trafficType

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * [PhoneNumberWithMessagingSettings].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberWithMessagingSettings]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eligibleMessagingProducts: JsonField<MutableList<String>>? = null
        private var features: JsonField<Features> = JsonMissing.of()
        private var health: JsonField<NumberHealthMetrics> = JsonMissing.of()
        private var messagingProduct: JsonField<String> = JsonMissing.of()
        private var messagingProfileId: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var trafficType: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(phoneNumberWithMessagingSettings: PhoneNumberWithMessagingSettings) =
            apply {
                id = phoneNumberWithMessagingSettings.id
                countryCode = phoneNumberWithMessagingSettings.countryCode
                createdAt = phoneNumberWithMessagingSettings.createdAt
                eligibleMessagingProducts =
                    phoneNumberWithMessagingSettings.eligibleMessagingProducts.map {
                        it.toMutableList()
                    }
                features = phoneNumberWithMessagingSettings.features
                health = phoneNumberWithMessagingSettings.health
                messagingProduct = phoneNumberWithMessagingSettings.messagingProduct
                messagingProfileId = phoneNumberWithMessagingSettings.messagingProfileId
                phoneNumber = phoneNumberWithMessagingSettings.phoneNumber
                recordType = phoneNumberWithMessagingSettings.recordType
                trafficType = phoneNumberWithMessagingSettings.trafficType
                type = phoneNumberWithMessagingSettings.type
                updatedAt = phoneNumberWithMessagingSettings.updatedAt
                additionalProperties =
                    phoneNumberWithMessagingSettings.additionalProperties.toMutableMap()
            }

        /** Identifies the type of resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ISO 3166-1 alpha-2 country code. */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The messaging products that this number can be registered to use */
        fun eligibleMessagingProducts(eligibleMessagingProducts: List<String>) =
            eligibleMessagingProducts(JsonField.of(eligibleMessagingProducts))

        /**
         * Sets [Builder.eligibleMessagingProducts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eligibleMessagingProducts] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun eligibleMessagingProducts(eligibleMessagingProducts: JsonField<List<String>>) = apply {
            this.eligibleMessagingProducts = eligibleMessagingProducts.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [eligibleMessagingProducts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEligibleMessagingProduct(eligibleMessagingProduct: String) = apply {
            eligibleMessagingProducts =
                (eligibleMessagingProducts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("eligibleMessagingProducts", it).add(eligibleMessagingProduct)
                }
        }

        fun features(features: Features) = features(JsonField.of(features))

        /**
         * Sets [Builder.features] to an arbitrary JSON value.
         *
         * You should usually call [Builder.features] with a well-typed [Features] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun features(features: JsonField<Features>) = apply { this.features = features }

        /** High level health metrics about the number and it's messaging sending patterns. */
        fun health(health: NumberHealthMetrics) = health(JsonField.of(health))

        /**
         * Sets [Builder.health] to an arbitrary JSON value.
         *
         * You should usually call [Builder.health] with a well-typed [NumberHealthMetrics] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun health(health: JsonField<NumberHealthMetrics>) = apply { this.health = health }

        /** The messaging product that the number is registered to use */
        fun messagingProduct(messagingProduct: String) =
            messagingProduct(JsonField.of(messagingProduct))

        /**
         * Sets [Builder.messagingProduct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingProduct] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messagingProduct(messagingProduct: JsonField<String>) = apply {
            this.messagingProduct = messagingProduct
        }

        /** Unique identifier for a messaging profile. */
        fun messagingProfileId(messagingProfileId: String?) =
            messagingProfileId(JsonField.ofNullable(messagingProfileId))

        /**
         * Alias for calling [Builder.messagingProfileId] with `messagingProfileId.orElse(null)`.
         */
        fun messagingProfileId(messagingProfileId: Optional<String>) =
            messagingProfileId(messagingProfileId.getOrNull())

        /**
         * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
            this.messagingProfileId = messagingProfileId
        }

        /** +E.164 formatted phone number. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** Identifies the type of the resource. */
        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        /** The messaging traffic or use case for which the number is currently configured. */
        fun trafficType(trafficType: String) = trafficType(JsonField.of(trafficType))

        /**
         * Sets [Builder.trafficType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trafficType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trafficType(trafficType: JsonField<String>) = apply { this.trafficType = trafficType }

        /** The type of the phone number */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** ISO 8601 formatted date indicating when the resource was updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [PhoneNumberWithMessagingSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberWithMessagingSettings =
            PhoneNumberWithMessagingSettings(
                id,
                countryCode,
                createdAt,
                (eligibleMessagingProducts ?: JsonMissing.of()).map { it.toImmutable() },
                features,
                health,
                messagingProduct,
                messagingProfileId,
                phoneNumber,
                recordType,
                trafficType,
                type,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PhoneNumberWithMessagingSettings = apply {
        if (validated) {
            return@apply
        }

        id()
        countryCode()
        createdAt()
        eligibleMessagingProducts()
        features().ifPresent { it.validate() }
        health().ifPresent { it.validate() }
        messagingProduct()
        messagingProfileId()
        phoneNumber()
        recordType().ifPresent { it.validate() }
        trafficType()
        type().ifPresent { it.validate() }
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (eligibleMessagingProducts.asKnown().getOrNull()?.size ?: 0) +
            (features.asKnown().getOrNull()?.validity() ?: 0) +
            (health.asKnown().getOrNull()?.validity() ?: 0) +
            (if (messagingProduct.asKnown().isPresent) 1 else 0) +
            (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (trafficType.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class Features
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val mms: JsonField<MessagingFeatureSet>,
        private val sms: JsonField<MessagingFeatureSet>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("mms")
            @ExcludeMissing
            mms: JsonField<MessagingFeatureSet> = JsonMissing.of(),
            @JsonProperty("sms")
            @ExcludeMissing
            sms: JsonField<MessagingFeatureSet> = JsonMissing.of(),
        ) : this(mms, sms, mutableMapOf())

        /**
         * The set of features available for a specific messaging use case (SMS or MMS). Features
         * can vary depending on the characteristics the phone number, as well as its current
         * product configuration.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mms(): Optional<MessagingFeatureSet> = mms.getOptional("mms")

        /**
         * The set of features available for a specific messaging use case (SMS or MMS). Features
         * can vary depending on the characteristics the phone number, as well as its current
         * product configuration.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sms(): Optional<MessagingFeatureSet> = sms.getOptional("sms")

        /**
         * Returns the raw JSON value of [mms].
         *
         * Unlike [mms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mms") @ExcludeMissing fun _mms(): JsonField<MessagingFeatureSet> = mms

        /**
         * Returns the raw JSON value of [sms].
         *
         * Unlike [sms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sms") @ExcludeMissing fun _sms(): JsonField<MessagingFeatureSet> = sms

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

            /** Returns a mutable builder for constructing an instance of [Features]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Features]. */
        class Builder internal constructor() {

            private var mms: JsonField<MessagingFeatureSet> = JsonMissing.of()
            private var sms: JsonField<MessagingFeatureSet> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(features: Features) = apply {
                mms = features.mms
                sms = features.sms
                additionalProperties = features.additionalProperties.toMutableMap()
            }

            /**
             * The set of features available for a specific messaging use case (SMS or MMS).
             * Features can vary depending on the characteristics the phone number, as well as its
             * current product configuration.
             */
            fun mms(mms: MessagingFeatureSet?) = mms(JsonField.ofNullable(mms))

            /** Alias for calling [Builder.mms] with `mms.orElse(null)`. */
            fun mms(mms: Optional<MessagingFeatureSet>) = mms(mms.getOrNull())

            /**
             * Sets [Builder.mms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mms] with a well-typed [MessagingFeatureSet] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mms(mms: JsonField<MessagingFeatureSet>) = apply { this.mms = mms }

            /**
             * The set of features available for a specific messaging use case (SMS or MMS).
             * Features can vary depending on the characteristics the phone number, as well as its
             * current product configuration.
             */
            fun sms(sms: MessagingFeatureSet?) = sms(JsonField.ofNullable(sms))

            /** Alias for calling [Builder.sms] with `sms.orElse(null)`. */
            fun sms(sms: Optional<MessagingFeatureSet>) = sms(sms.getOrNull())

            /**
             * Sets [Builder.sms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sms] with a well-typed [MessagingFeatureSet] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sms(sms: JsonField<MessagingFeatureSet>) = apply { this.sms = sms }

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
             * Returns an immutable instance of [Features].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Features = Features(mms, sms, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Features = apply {
            if (validated) {
                return@apply
            }

            mms().ifPresent { it.validate() }
            sms().ifPresent { it.validate() }
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
            (mms.asKnown().getOrNull()?.validity() ?: 0) +
                (sms.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Features &&
                mms == other.mms &&
                sms == other.sms &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(mms, sms, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Features{mms=$mms, sms=$sms, additionalProperties=$additionalProperties}"
    }

    /** Identifies the type of the resource. */
    class RecordType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MESSAGING_PHONE_NUMBER = of("messaging_phone_number")

            @JvmField val MESSAGING_SETTINGS = of("messaging_settings")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            MESSAGING_PHONE_NUMBER,
            MESSAGING_SETTINGS,
        }

        /**
         * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MESSAGING_PHONE_NUMBER,
            MESSAGING_SETTINGS,
            /**
             * An enum member indicating that [RecordType] was instantiated with an unknown value.
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
                MESSAGING_PHONE_NUMBER -> Value.MESSAGING_PHONE_NUMBER
                MESSAGING_SETTINGS -> Value.MESSAGING_SETTINGS
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
                MESSAGING_PHONE_NUMBER -> Known.MESSAGING_PHONE_NUMBER
                MESSAGING_SETTINGS -> Known.MESSAGING_SETTINGS
                else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

        fun validate(): RecordType = apply {
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

            return other is RecordType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of the phone number */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LONG_CODE = of("long-code")

            @JvmField val TOLL_FREE = of("toll-free")

            @JvmField val SHORT_CODE = of("short-code")

            @JvmField val LONGCODE = of("longcode")

            @JvmField val TOLLFREE = of("tollfree")

            @JvmField val SHORTCODE = of("shortcode")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            LONG_CODE,
            TOLL_FREE,
            SHORT_CODE,
            LONGCODE,
            TOLLFREE,
            SHORTCODE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LONG_CODE,
            TOLL_FREE,
            SHORT_CODE,
            LONGCODE,
            TOLLFREE,
            SHORTCODE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                LONG_CODE -> Value.LONG_CODE
                TOLL_FREE -> Value.TOLL_FREE
                SHORT_CODE -> Value.SHORT_CODE
                LONGCODE -> Value.LONGCODE
                TOLLFREE -> Value.TOLLFREE
                SHORTCODE -> Value.SHORTCODE
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
                LONG_CODE -> Known.LONG_CODE
                TOLL_FREE -> Known.TOLL_FREE
                SHORT_CODE -> Known.SHORT_CODE
                LONGCODE -> Known.LONGCODE
                TOLLFREE -> Known.TOLLFREE
                SHORTCODE -> Known.SHORTCODE
                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

        return other is PhoneNumberWithMessagingSettings &&
            id == other.id &&
            countryCode == other.countryCode &&
            createdAt == other.createdAt &&
            eligibleMessagingProducts == other.eligibleMessagingProducts &&
            features == other.features &&
            health == other.health &&
            messagingProduct == other.messagingProduct &&
            messagingProfileId == other.messagingProfileId &&
            phoneNumber == other.phoneNumber &&
            recordType == other.recordType &&
            trafficType == other.trafficType &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            countryCode,
            createdAt,
            eligibleMessagingProducts,
            features,
            health,
            messagingProduct,
            messagingProfileId,
            phoneNumber,
            recordType,
            trafficType,
            type,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumberWithMessagingSettings{id=$id, countryCode=$countryCode, createdAt=$createdAt, eligibleMessagingProducts=$eligibleMessagingProducts, features=$features, health=$health, messagingProduct=$messagingProduct, messagingProfileId=$messagingProfileId, phoneNumber=$phoneNumber, recordType=$recordType, trafficType=$trafficType, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
