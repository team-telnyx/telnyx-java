// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.availablephonenumbers

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
import com.telnyx.sdk.models.AvailablePhoneNumbersMetadata
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AvailablePhoneNumberListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<AvailablePhoneNumbersMetadata>,
    private val metadata: JsonField<AvailablePhoneNumbersMetadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta")
        @ExcludeMissing
        meta: JsonField<AvailablePhoneNumbersMetadata> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        metadata: JsonField<AvailablePhoneNumbersMetadata> = JsonMissing.of(),
    ) : this(data, meta, metadata, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<AvailablePhoneNumbersMetadata> = meta.getOptional("meta")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<AvailablePhoneNumbersMetadata> = metadata.getOptional("metadata")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta")
    @ExcludeMissing
    fun _meta(): JsonField<AvailablePhoneNumbersMetadata> = meta

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata")
    @ExcludeMissing
    fun _metadata(): JsonField<AvailablePhoneNumbersMetadata> = metadata

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
         * [AvailablePhoneNumberListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AvailablePhoneNumberListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<AvailablePhoneNumbersMetadata> = JsonMissing.of()
        private var metadata: JsonField<AvailablePhoneNumbersMetadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(availablePhoneNumberListResponse: AvailablePhoneNumberListResponse) =
            apply {
                data = availablePhoneNumberListResponse.data.map { it.toMutableList() }
                meta = availablePhoneNumberListResponse.meta
                metadata = availablePhoneNumberListResponse.metadata
                additionalProperties =
                    availablePhoneNumberListResponse.additionalProperties.toMutableMap()
            }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: AvailablePhoneNumbersMetadata) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [AvailablePhoneNumbersMetadata]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun meta(meta: JsonField<AvailablePhoneNumbersMetadata>) = apply { this.meta = meta }

        fun metadata(metadata: AvailablePhoneNumbersMetadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed
         * [AvailablePhoneNumbersMetadata] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun metadata(metadata: JsonField<AvailablePhoneNumbersMetadata>) = apply {
            this.metadata = metadata
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
         * Returns an immutable instance of [AvailablePhoneNumberListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AvailablePhoneNumberListResponse =
            AvailablePhoneNumberListResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                metadata,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AvailablePhoneNumberListResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
        metadata().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bestEffort: JsonField<Boolean>,
        private val costInformation: JsonField<CostInformation>,
        private val features: JsonField<List<Feature>>,
        private val phoneNumber: JsonField<String>,
        private val quickship: JsonField<Boolean>,
        private val recordType: JsonField<RecordType>,
        private val regionInformation: JsonField<List<RegionInformation>>,
        private val reservable: JsonField<Boolean>,
        private val vanityFormat: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("best_effort")
            @ExcludeMissing
            bestEffort: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("cost_information")
            @ExcludeMissing
            costInformation: JsonField<CostInformation> = JsonMissing.of(),
            @JsonProperty("features")
            @ExcludeMissing
            features: JsonField<List<Feature>> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quickship")
            @ExcludeMissing
            quickship: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
            @JsonProperty("region_information")
            @ExcludeMissing
            regionInformation: JsonField<List<RegionInformation>> = JsonMissing.of(),
            @JsonProperty("reservable")
            @ExcludeMissing
            reservable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("vanity_format")
            @ExcludeMissing
            vanityFormat: JsonField<String> = JsonMissing.of(),
        ) : this(
            bestEffort,
            costInformation,
            features,
            phoneNumber,
            quickship,
            recordType,
            regionInformation,
            reservable,
            vanityFormat,
            mutableMapOf(),
        )

        /**
         * Specifies whether the phone number is an exact match based on the search criteria or not.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bestEffort(): Optional<Boolean> = bestEffort.getOptional("best_effort")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun costInformation(): Optional<CostInformation> =
            costInformation.getOptional("cost_information")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun features(): Optional<List<Feature>> = features.getOptional("features")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Specifies whether the phone number can receive calls immediately after purchase or not.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun quickship(): Optional<Boolean> = quickship.getOptional("quickship")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regionInformation(): Optional<List<RegionInformation>> =
            regionInformation.getOptional("region_information")

        /**
         * Specifies whether the phone number can be reserved before purchase or not.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reservable(): Optional<Boolean> = reservable.getOptional("reservable")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vanityFormat(): Optional<String> = vanityFormat.getOptional("vanity_format")

        /**
         * Returns the raw JSON value of [bestEffort].
         *
         * Unlike [bestEffort], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("best_effort")
        @ExcludeMissing
        fun _bestEffort(): JsonField<Boolean> = bestEffort

        /**
         * Returns the raw JSON value of [costInformation].
         *
         * Unlike [costInformation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cost_information")
        @ExcludeMissing
        fun _costInformation(): JsonField<CostInformation> = costInformation

        /**
         * Returns the raw JSON value of [features].
         *
         * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("features")
        @ExcludeMissing
        fun _features(): JsonField<List<Feature>> = features

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [quickship].
         *
         * Unlike [quickship], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quickship") @ExcludeMissing fun _quickship(): JsonField<Boolean> = quickship

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

        /**
         * Returns the raw JSON value of [regionInformation].
         *
         * Unlike [regionInformation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("region_information")
        @ExcludeMissing
        fun _regionInformation(): JsonField<List<RegionInformation>> = regionInformation

        /**
         * Returns the raw JSON value of [reservable].
         *
         * Unlike [reservable], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reservable")
        @ExcludeMissing
        fun _reservable(): JsonField<Boolean> = reservable

        /**
         * Returns the raw JSON value of [vanityFormat].
         *
         * Unlike [vanityFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vanity_format")
        @ExcludeMissing
        fun _vanityFormat(): JsonField<String> = vanityFormat

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

            private var bestEffort: JsonField<Boolean> = JsonMissing.of()
            private var costInformation: JsonField<CostInformation> = JsonMissing.of()
            private var features: JsonField<MutableList<Feature>>? = null
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var quickship: JsonField<Boolean> = JsonMissing.of()
            private var recordType: JsonField<RecordType> = JsonMissing.of()
            private var regionInformation: JsonField<MutableList<RegionInformation>>? = null
            private var reservable: JsonField<Boolean> = JsonMissing.of()
            private var vanityFormat: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                bestEffort = data.bestEffort
                costInformation = data.costInformation
                features = data.features.map { it.toMutableList() }
                phoneNumber = data.phoneNumber
                quickship = data.quickship
                recordType = data.recordType
                regionInformation = data.regionInformation.map { it.toMutableList() }
                reservable = data.reservable
                vanityFormat = data.vanityFormat
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * Specifies whether the phone number is an exact match based on the search criteria or
             * not.
             */
            fun bestEffort(bestEffort: Boolean) = bestEffort(JsonField.of(bestEffort))

            /**
             * Sets [Builder.bestEffort] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bestEffort] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bestEffort(bestEffort: JsonField<Boolean>) = apply { this.bestEffort = bestEffort }

            fun costInformation(costInformation: CostInformation) =
                costInformation(JsonField.of(costInformation))

            /**
             * Sets [Builder.costInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.costInformation] with a well-typed [CostInformation]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun costInformation(costInformation: JsonField<CostInformation>) = apply {
                this.costInformation = costInformation
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

            /**
             * Specifies whether the phone number can receive calls immediately after purchase or
             * not.
             */
            fun quickship(quickship: Boolean) = quickship(JsonField.of(quickship))

            /**
             * Sets [Builder.quickship] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quickship] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quickship(quickship: JsonField<Boolean>) = apply { this.quickship = quickship }

            fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [RecordType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<RecordType>) = apply {
                this.recordType = recordType
            }

            fun regionInformation(regionInformation: List<RegionInformation>) =
                regionInformation(JsonField.of(regionInformation))

            /**
             * Sets [Builder.regionInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regionInformation] with a well-typed
             * `List<RegionInformation>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun regionInformation(regionInformation: JsonField<List<RegionInformation>>) = apply {
                this.regionInformation = regionInformation.map { it.toMutableList() }
            }

            /**
             * Adds a single [RegionInformation] to [Builder.regionInformation].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRegionInformation(regionInformation: RegionInformation) = apply {
                this.regionInformation =
                    (this.regionInformation ?: JsonField.of(mutableListOf())).also {
                        checkKnown("regionInformation", it).add(regionInformation)
                    }
            }

            /** Specifies whether the phone number can be reserved before purchase or not. */
            fun reservable(reservable: Boolean) = reservable(JsonField.of(reservable))

            /**
             * Sets [Builder.reservable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reservable] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reservable(reservable: JsonField<Boolean>) = apply { this.reservable = reservable }

            fun vanityFormat(vanityFormat: String) = vanityFormat(JsonField.of(vanityFormat))

            /**
             * Sets [Builder.vanityFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vanityFormat] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vanityFormat(vanityFormat: JsonField<String>) = apply {
                this.vanityFormat = vanityFormat
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
                    bestEffort,
                    costInformation,
                    (features ?: JsonMissing.of()).map { it.toImmutable() },
                    phoneNumber,
                    quickship,
                    recordType,
                    (regionInformation ?: JsonMissing.of()).map { it.toImmutable() },
                    reservable,
                    vanityFormat,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            bestEffort()
            costInformation().ifPresent { it.validate() }
            features().ifPresent { it.forEach { it.validate() } }
            phoneNumber()
            quickship()
            recordType().ifPresent { it.validate() }
            regionInformation().ifPresent { it.forEach { it.validate() } }
            reservable()
            vanityFormat()
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
            (if (bestEffort.asKnown().isPresent) 1 else 0) +
                (costInformation.asKnown().getOrNull()?.validity() ?: 0) +
                (features.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (quickship.asKnown().isPresent) 1 else 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (regionInformation.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (reservable.asKnown().isPresent) 1 else 0) +
                (if (vanityFormat.asKnown().isPresent) 1 else 0)

        class CostInformation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val currency: JsonField<String>,
            private val monthlyCost: JsonField<String>,
            private val upfrontCost: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("monthly_cost")
                @ExcludeMissing
                monthlyCost: JsonField<String> = JsonMissing.of(),
                @JsonProperty("upfront_cost")
                @ExcludeMissing
                upfrontCost: JsonField<String> = JsonMissing.of(),
            ) : this(currency, monthlyCost, upfrontCost, mutableMapOf())

            /**
             * The ISO 4217 code for the currency.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<String> = currency.getOptional("currency")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun monthlyCost(): Optional<String> = monthlyCost.getOptional("monthly_cost")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun upfrontCost(): Optional<String> = upfrontCost.getOptional("upfront_cost")

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [monthlyCost].
             *
             * Unlike [monthlyCost], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("monthly_cost")
            @ExcludeMissing
            fun _monthlyCost(): JsonField<String> = monthlyCost

            /**
             * Returns the raw JSON value of [upfrontCost].
             *
             * Unlike [upfrontCost], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("upfront_cost")
            @ExcludeMissing
            fun _upfrontCost(): JsonField<String> = upfrontCost

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

                /** Returns a mutable builder for constructing an instance of [CostInformation]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CostInformation]. */
            class Builder internal constructor() {

                private var currency: JsonField<String> = JsonMissing.of()
                private var monthlyCost: JsonField<String> = JsonMissing.of()
                private var upfrontCost: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(costInformation: CostInformation) = apply {
                    currency = costInformation.currency
                    monthlyCost = costInformation.monthlyCost
                    upfrontCost = costInformation.upfrontCost
                    additionalProperties = costInformation.additionalProperties.toMutableMap()
                }

                /** The ISO 4217 code for the currency. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun monthlyCost(monthlyCost: String) = monthlyCost(JsonField.of(monthlyCost))

                /**
                 * Sets [Builder.monthlyCost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.monthlyCost] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun monthlyCost(monthlyCost: JsonField<String>) = apply {
                    this.monthlyCost = monthlyCost
                }

                fun upfrontCost(upfrontCost: String) = upfrontCost(JsonField.of(upfrontCost))

                /**
                 * Sets [Builder.upfrontCost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.upfrontCost] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun upfrontCost(upfrontCost: JsonField<String>) = apply {
                    this.upfrontCost = upfrontCost
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
                 * Returns an immutable instance of [CostInformation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CostInformation =
                    CostInformation(
                        currency,
                        monthlyCost,
                        upfrontCost,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CostInformation = apply {
                if (validated) {
                    return@apply
                }

                currency()
                monthlyCost()
                upfrontCost()
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
                (if (currency.asKnown().isPresent) 1 else 0) +
                    (if (monthlyCost.asKnown().isPresent) 1 else 0) +
                    (if (upfrontCost.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CostInformation &&
                    currency == other.currency &&
                    monthlyCost == other.monthlyCost &&
                    upfrontCost == other.upfrontCost &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(currency, monthlyCost, upfrontCost, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CostInformation{currency=$currency, monthlyCost=$monthlyCost, upfrontCost=$upfrontCost, additionalProperties=$additionalProperties}"
        }

        class Feature
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
            ) : this(name, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

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

                /** Returns a mutable builder for constructing an instance of [Feature]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Feature]. */
            class Builder internal constructor() {

                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(feature: Feature) = apply {
                    name = feature.name
                    additionalProperties = feature.additionalProperties.toMutableMap()
                }

                fun name(name: String) = name(JsonField.of(name))

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
                 * Returns an immutable instance of [Feature].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Feature = Feature(name, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Feature = apply {
                if (validated) {
                    return@apply
                }

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
            @JvmSynthetic internal fun validity(): Int = (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Feature &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Feature{name=$name, additionalProperties=$additionalProperties}"
        }

        class RecordType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val AVAILABLE_PHONE_NUMBER = of("available_phone_number")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                AVAILABLE_PHONE_NUMBER
            }

            /**
             * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RecordType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AVAILABLE_PHONE_NUMBER,
                /**
                 * An enum member indicating that [RecordType] was instantiated with an unknown
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
                    AVAILABLE_PHONE_NUMBER -> Value.AVAILABLE_PHONE_NUMBER
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
                    AVAILABLE_PHONE_NUMBER -> Known.AVAILABLE_PHONE_NUMBER
                    else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

        class RegionInformation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val regionName: JsonField<String>,
            private val regionType: JsonField<RegionType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("region_name")
                @ExcludeMissing
                regionName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("region_type")
                @ExcludeMissing
                regionType: JsonField<RegionType> = JsonMissing.of(),
            ) : this(regionName, regionType, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun regionName(): Optional<String> = regionName.getOptional("region_name")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun regionType(): Optional<RegionType> = regionType.getOptional("region_type")

            /**
             * Returns the raw JSON value of [regionName].
             *
             * Unlike [regionName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("region_name")
            @ExcludeMissing
            fun _regionName(): JsonField<String> = regionName

            /**
             * Returns the raw JSON value of [regionType].
             *
             * Unlike [regionType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("region_type")
            @ExcludeMissing
            fun _regionType(): JsonField<RegionType> = regionType

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
                 * Returns a mutable builder for constructing an instance of [RegionInformation].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RegionInformation]. */
            class Builder internal constructor() {

                private var regionName: JsonField<String> = JsonMissing.of()
                private var regionType: JsonField<RegionType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(regionInformation: RegionInformation) = apply {
                    regionName = regionInformation.regionName
                    regionType = regionInformation.regionType
                    additionalProperties = regionInformation.additionalProperties.toMutableMap()
                }

                fun regionName(regionName: String) = regionName(JsonField.of(regionName))

                /**
                 * Sets [Builder.regionName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.regionName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun regionName(regionName: JsonField<String>) = apply {
                    this.regionName = regionName
                }

                fun regionType(regionType: RegionType) = regionType(JsonField.of(regionType))

                /**
                 * Sets [Builder.regionType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.regionType] with a well-typed [RegionType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun regionType(regionType: JsonField<RegionType>) = apply {
                    this.regionType = regionType
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
                 * Returns an immutable instance of [RegionInformation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RegionInformation =
                    RegionInformation(regionName, regionType, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): RegionInformation = apply {
                if (validated) {
                    return@apply
                }

                regionName()
                regionType().ifPresent { it.validate() }
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
                (if (regionName.asKnown().isPresent) 1 else 0) +
                    (regionType.asKnown().getOrNull()?.validity() ?: 0)

            class RegionType
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

                    @JvmField val COUNTRY_CODE = of("country_code")

                    @JvmField val RATE_CENTER = of("rate_center")

                    @JvmField val STATE = of("state")

                    @JvmField val LOCATION = of("location")

                    @JvmStatic fun of(value: String) = RegionType(JsonField.of(value))
                }

                /** An enum containing [RegionType]'s known values. */
                enum class Known {
                    COUNTRY_CODE,
                    RATE_CENTER,
                    STATE,
                    LOCATION,
                }

                /**
                 * An enum containing [RegionType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [RegionType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COUNTRY_CODE,
                    RATE_CENTER,
                    STATE,
                    LOCATION,
                    /**
                     * An enum member indicating that [RegionType] was instantiated with an unknown
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
                        COUNTRY_CODE -> Value.COUNTRY_CODE
                        RATE_CENTER -> Value.RATE_CENTER
                        STATE -> Value.STATE
                        LOCATION -> Value.LOCATION
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
                        COUNTRY_CODE -> Known.COUNTRY_CODE
                        RATE_CENTER -> Known.RATE_CENTER
                        STATE -> Known.STATE
                        LOCATION -> Known.LOCATION
                        else -> throw TelnyxInvalidDataException("Unknown RegionType: $value")
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

                fun validate(): RegionType = apply {
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

                    return other is RegionType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RegionInformation &&
                    regionName == other.regionName &&
                    regionType == other.regionType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(regionName, regionType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RegionInformation{regionName=$regionName, regionType=$regionType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                bestEffort == other.bestEffort &&
                costInformation == other.costInformation &&
                features == other.features &&
                phoneNumber == other.phoneNumber &&
                quickship == other.quickship &&
                recordType == other.recordType &&
                regionInformation == other.regionInformation &&
                reservable == other.reservable &&
                vanityFormat == other.vanityFormat &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                bestEffort,
                costInformation,
                features,
                phoneNumber,
                quickship,
                recordType,
                regionInformation,
                reservable,
                vanityFormat,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{bestEffort=$bestEffort, costInformation=$costInformation, features=$features, phoneNumber=$phoneNumber, quickship=$quickship, recordType=$recordType, regionInformation=$regionInformation, reservable=$reservable, vanityFormat=$vanityFormat, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AvailablePhoneNumberListResponse &&
            data == other.data &&
            meta == other.meta &&
            metadata == other.metadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, metadata, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AvailablePhoneNumberListResponse{data=$data, meta=$meta, metadata=$metadata, additionalProperties=$additionalProperties}"
}
