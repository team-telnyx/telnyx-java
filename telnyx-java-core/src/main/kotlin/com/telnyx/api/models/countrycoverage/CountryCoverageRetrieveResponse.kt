// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.countrycoverage

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CountryCoverageRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
         * [CountryCoverageRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CountryCoverageRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(countryCoverageRetrieveResponse: CountryCoverageRetrieveResponse) =
            apply {
                data = countryCoverageRetrieveResponse.data.map { it.toMutableList() }
                additionalProperties =
                    countryCoverageRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CountryCoverageRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CountryCoverageRetrieveResponse =
            CountryCoverageRetrieveResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CountryCoverageRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val code: JsonField<String>,
        private val features: JsonField<List<String>>,
        private val internationalSms: JsonField<Boolean>,
        private val inventoryCoverage: JsonField<Boolean>,
        private val local: JsonField<Local>,
        private val mobile: JsonField<Mobile>,
        private val national: JsonField<National>,
        private val numbers: JsonField<Boolean>,
        private val p2p: JsonField<Boolean>,
        private val phoneNumberType: JsonField<List<String>>,
        private val quickship: JsonField<Boolean>,
        private val region: JsonField<String>,
        private val reservable: JsonField<Boolean>,
        private val sharedCost: JsonField<SharedCost>,
        private val tollFree: JsonField<TollFree>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("features")
            @ExcludeMissing
            features: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("international_sms")
            @ExcludeMissing
            internationalSms: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("inventory_coverage")
            @ExcludeMissing
            inventoryCoverage: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("local") @ExcludeMissing local: JsonField<Local> = JsonMissing.of(),
            @JsonProperty("mobile") @ExcludeMissing mobile: JsonField<Mobile> = JsonMissing.of(),
            @JsonProperty("national")
            @ExcludeMissing
            national: JsonField<National> = JsonMissing.of(),
            @JsonProperty("numbers") @ExcludeMissing numbers: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("p2p") @ExcludeMissing p2p: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("phone_number_type")
            @ExcludeMissing
            phoneNumberType: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("quickship")
            @ExcludeMissing
            quickship: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reservable")
            @ExcludeMissing
            reservable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("shared_cost")
            @ExcludeMissing
            sharedCost: JsonField<SharedCost> = JsonMissing.of(),
            @JsonProperty("toll_free")
            @ExcludeMissing
            tollFree: JsonField<TollFree> = JsonMissing.of(),
        ) : this(
            code,
            features,
            internationalSms,
            inventoryCoverage,
            local,
            mobile,
            national,
            numbers,
            p2p,
            phoneNumberType,
            quickship,
            region,
            reservable,
            sharedCost,
            tollFree,
            mutableMapOf(),
        )

        /**
         * Country ISO code
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun code(): Optional<String> = code.getOptional("code")

        /**
         * Set of features supported
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun features(): Optional<List<String>> = features.getOptional("features")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun internationalSms(): Optional<Boolean> =
            internationalSms.getOptional("international_sms")

        /**
         * Indicates whether country can be queried with inventory coverage endpoint
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inventoryCoverage(): Optional<Boolean> =
            inventoryCoverage.getOptional("inventory_coverage")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun local(): Optional<Local> = local.getOptional("local")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mobile(): Optional<Mobile> = mobile.getOptional("mobile")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun national(): Optional<National> = national.getOptional("national")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numbers(): Optional<Boolean> = numbers.getOptional("numbers")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun p2p(): Optional<Boolean> = p2p.getOptional("p2p")

        /**
         * Phone number type
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberType(): Optional<List<String>> =
            phoneNumberType.getOptional("phone_number_type")

        /**
         * Supports quickship
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun quickship(): Optional<Boolean> = quickship.getOptional("quickship")

        /**
         * Geographic region (e.g., AMER, EMEA, APAC)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun region(): Optional<String> = region.getOptional("region")

        /**
         * Supports reservable
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reservable(): Optional<Boolean> = reservable.getOptional("reservable")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sharedCost(): Optional<SharedCost> = sharedCost.getOptional("shared_cost")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tollFree(): Optional<TollFree> = tollFree.getOptional("toll_free")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [features].
         *
         * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("features")
        @ExcludeMissing
        fun _features(): JsonField<List<String>> = features

        /**
         * Returns the raw JSON value of [internationalSms].
         *
         * Unlike [internationalSms], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("international_sms")
        @ExcludeMissing
        fun _internationalSms(): JsonField<Boolean> = internationalSms

        /**
         * Returns the raw JSON value of [inventoryCoverage].
         *
         * Unlike [inventoryCoverage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("inventory_coverage")
        @ExcludeMissing
        fun _inventoryCoverage(): JsonField<Boolean> = inventoryCoverage

        /**
         * Returns the raw JSON value of [local].
         *
         * Unlike [local], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("local") @ExcludeMissing fun _local(): JsonField<Local> = local

        /**
         * Returns the raw JSON value of [mobile].
         *
         * Unlike [mobile], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mobile") @ExcludeMissing fun _mobile(): JsonField<Mobile> = mobile

        /**
         * Returns the raw JSON value of [national].
         *
         * Unlike [national], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("national") @ExcludeMissing fun _national(): JsonField<National> = national

        /**
         * Returns the raw JSON value of [numbers].
         *
         * Unlike [numbers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numbers") @ExcludeMissing fun _numbers(): JsonField<Boolean> = numbers

        /**
         * Returns the raw JSON value of [p2p].
         *
         * Unlike [p2p], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("p2p") @ExcludeMissing fun _p2p(): JsonField<Boolean> = p2p

        /**
         * Returns the raw JSON value of [phoneNumberType].
         *
         * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_number_type")
        @ExcludeMissing
        fun _phoneNumberType(): JsonField<List<String>> = phoneNumberType

        /**
         * Returns the raw JSON value of [quickship].
         *
         * Unlike [quickship], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quickship") @ExcludeMissing fun _quickship(): JsonField<Boolean> = quickship

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [reservable].
         *
         * Unlike [reservable], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reservable")
        @ExcludeMissing
        fun _reservable(): JsonField<Boolean> = reservable

        /**
         * Returns the raw JSON value of [sharedCost].
         *
         * Unlike [sharedCost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shared_cost")
        @ExcludeMissing
        fun _sharedCost(): JsonField<SharedCost> = sharedCost

        /**
         * Returns the raw JSON value of [tollFree].
         *
         * Unlike [tollFree], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("toll_free") @ExcludeMissing fun _tollFree(): JsonField<TollFree> = tollFree

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

            private var code: JsonField<String> = JsonMissing.of()
            private var features: JsonField<MutableList<String>>? = null
            private var internationalSms: JsonField<Boolean> = JsonMissing.of()
            private var inventoryCoverage: JsonField<Boolean> = JsonMissing.of()
            private var local: JsonField<Local> = JsonMissing.of()
            private var mobile: JsonField<Mobile> = JsonMissing.of()
            private var national: JsonField<National> = JsonMissing.of()
            private var numbers: JsonField<Boolean> = JsonMissing.of()
            private var p2p: JsonField<Boolean> = JsonMissing.of()
            private var phoneNumberType: JsonField<MutableList<String>>? = null
            private var quickship: JsonField<Boolean> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var reservable: JsonField<Boolean> = JsonMissing.of()
            private var sharedCost: JsonField<SharedCost> = JsonMissing.of()
            private var tollFree: JsonField<TollFree> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                code = data.code
                features = data.features.map { it.toMutableList() }
                internationalSms = data.internationalSms
                inventoryCoverage = data.inventoryCoverage
                local = data.local
                mobile = data.mobile
                national = data.national
                numbers = data.numbers
                p2p = data.p2p
                phoneNumberType = data.phoneNumberType.map { it.toMutableList() }
                quickship = data.quickship
                region = data.region
                reservable = data.reservable
                sharedCost = data.sharedCost
                tollFree = data.tollFree
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Country ISO code */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Set of features supported */
            fun features(features: List<String>) = features(JsonField.of(features))

            /**
             * Sets [Builder.features] to an arbitrary JSON value.
             *
             * You should usually call [Builder.features] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun features(features: JsonField<List<String>>) = apply {
                this.features = features.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [features].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFeature(feature: String) = apply {
                features =
                    (features ?: JsonField.of(mutableListOf())).also {
                        checkKnown("features", it).add(feature)
                    }
            }

            fun internationalSms(internationalSms: Boolean) =
                internationalSms(JsonField.of(internationalSms))

            /**
             * Sets [Builder.internationalSms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.internationalSms] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun internationalSms(internationalSms: JsonField<Boolean>) = apply {
                this.internationalSms = internationalSms
            }

            /** Indicates whether country can be queried with inventory coverage endpoint */
            fun inventoryCoverage(inventoryCoverage: Boolean) =
                inventoryCoverage(JsonField.of(inventoryCoverage))

            /**
             * Sets [Builder.inventoryCoverage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inventoryCoverage] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inventoryCoverage(inventoryCoverage: JsonField<Boolean>) = apply {
                this.inventoryCoverage = inventoryCoverage
            }

            fun local(local: Local) = local(JsonField.of(local))

            /**
             * Sets [Builder.local] to an arbitrary JSON value.
             *
             * You should usually call [Builder.local] with a well-typed [Local] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun local(local: JsonField<Local>) = apply { this.local = local }

            fun mobile(mobile: Mobile) = mobile(JsonField.of(mobile))

            /**
             * Sets [Builder.mobile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mobile] with a well-typed [Mobile] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mobile(mobile: JsonField<Mobile>) = apply { this.mobile = mobile }

            fun national(national: National) = national(JsonField.of(national))

            /**
             * Sets [Builder.national] to an arbitrary JSON value.
             *
             * You should usually call [Builder.national] with a well-typed [National] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun national(national: JsonField<National>) = apply { this.national = national }

            fun numbers(numbers: Boolean) = numbers(JsonField.of(numbers))

            /**
             * Sets [Builder.numbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numbers] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numbers(numbers: JsonField<Boolean>) = apply { this.numbers = numbers }

            fun p2p(p2p: Boolean) = p2p(JsonField.of(p2p))

            /**
             * Sets [Builder.p2p] to an arbitrary JSON value.
             *
             * You should usually call [Builder.p2p] with a well-typed [Boolean] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun p2p(p2p: JsonField<Boolean>) = apply { this.p2p = p2p }

            /** Phone number type */
            fun phoneNumberType(phoneNumberType: List<String>) =
                phoneNumberType(JsonField.of(phoneNumberType))

            /**
             * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberType] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun phoneNumberType(phoneNumberType: JsonField<List<String>>) = apply {
                this.phoneNumberType = phoneNumberType.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.phoneNumberType].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPhoneNumberType(phoneNumberType: String) = apply {
                this.phoneNumberType =
                    (this.phoneNumberType ?: JsonField.of(mutableListOf())).also {
                        checkKnown("phoneNumberType", it).add(phoneNumberType)
                    }
            }

            /** Supports quickship */
            fun quickship(quickship: Boolean) = quickship(JsonField.of(quickship))

            /**
             * Sets [Builder.quickship] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quickship] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quickship(quickship: JsonField<Boolean>) = apply { this.quickship = quickship }

            /** Geographic region (e.g., AMER, EMEA, APAC) */
            fun region(region: String?) = region(JsonField.ofNullable(region))

            /** Alias for calling [Builder.region] with `region.orElse(null)`. */
            fun region(region: Optional<String>) = region(region.getOrNull())

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** Supports reservable */
            fun reservable(reservable: Boolean) = reservable(JsonField.of(reservable))

            /**
             * Sets [Builder.reservable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reservable] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reservable(reservable: JsonField<Boolean>) = apply { this.reservable = reservable }

            fun sharedCost(sharedCost: SharedCost) = sharedCost(JsonField.of(sharedCost))

            /**
             * Sets [Builder.sharedCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sharedCost] with a well-typed [SharedCost] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sharedCost(sharedCost: JsonField<SharedCost>) = apply {
                this.sharedCost = sharedCost
            }

            fun tollFree(tollFree: TollFree) = tollFree(JsonField.of(tollFree))

            /**
             * Sets [Builder.tollFree] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tollFree] with a well-typed [TollFree] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tollFree(tollFree: JsonField<TollFree>) = apply { this.tollFree = tollFree }

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
                    code,
                    (features ?: JsonMissing.of()).map { it.toImmutable() },
                    internationalSms,
                    inventoryCoverage,
                    local,
                    mobile,
                    national,
                    numbers,
                    p2p,
                    (phoneNumberType ?: JsonMissing.of()).map { it.toImmutable() },
                    quickship,
                    region,
                    reservable,
                    sharedCost,
                    tollFree,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            code()
            features()
            internationalSms()
            inventoryCoverage()
            local().ifPresent { it.validate() }
            mobile().ifPresent { it.validate() }
            national().ifPresent { it.validate() }
            numbers()
            p2p()
            phoneNumberType()
            quickship()
            region()
            reservable()
            sharedCost().ifPresent { it.validate() }
            tollFree().ifPresent { it.validate() }
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
            (if (code.asKnown().isPresent) 1 else 0) +
                (features.asKnown().getOrNull()?.size ?: 0) +
                (if (internationalSms.asKnown().isPresent) 1 else 0) +
                (if (inventoryCoverage.asKnown().isPresent) 1 else 0) +
                (local.asKnown().getOrNull()?.validity() ?: 0) +
                (mobile.asKnown().getOrNull()?.validity() ?: 0) +
                (national.asKnown().getOrNull()?.validity() ?: 0) +
                (if (numbers.asKnown().isPresent) 1 else 0) +
                (if (p2p.asKnown().isPresent) 1 else 0) +
                (phoneNumberType.asKnown().getOrNull()?.size ?: 0) +
                (if (quickship.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (reservable.asKnown().isPresent) 1 else 0) +
                (sharedCost.asKnown().getOrNull()?.validity() ?: 0) +
                (tollFree.asKnown().getOrNull()?.validity() ?: 0)

        class Local
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val features: JsonField<List<String>>,
            private val fullPstnReplacement: JsonField<Boolean>,
            private val internationalSms: JsonField<Boolean>,
            private val p2p: JsonField<Boolean>,
            private val quickship: JsonField<Boolean>,
            private val reservable: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("features")
                @ExcludeMissing
                features: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("full_pstn_replacement")
                @ExcludeMissing
                fullPstnReplacement: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("international_sms")
                @ExcludeMissing
                internationalSms: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("p2p") @ExcludeMissing p2p: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("quickship")
                @ExcludeMissing
                quickship: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reservable")
                @ExcludeMissing
                reservable: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                features,
                fullPstnReplacement,
                internationalSms,
                p2p,
                quickship,
                reservable,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun features(): Optional<List<String>> = features.getOptional("features")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fullPstnReplacement(): Optional<Boolean> =
                fullPstnReplacement.getOptional("full_pstn_replacement")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun internationalSms(): Optional<Boolean> =
                internationalSms.getOptional("international_sms")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun p2p(): Optional<Boolean> = p2p.getOptional("p2p")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun quickship(): Optional<Boolean> = quickship.getOptional("quickship")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reservable(): Optional<Boolean> = reservable.getOptional("reservable")

            /**
             * Returns the raw JSON value of [features].
             *
             * Unlike [features], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("features")
            @ExcludeMissing
            fun _features(): JsonField<List<String>> = features

            /**
             * Returns the raw JSON value of [fullPstnReplacement].
             *
             * Unlike [fullPstnReplacement], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("full_pstn_replacement")
            @ExcludeMissing
            fun _fullPstnReplacement(): JsonField<Boolean> = fullPstnReplacement

            /**
             * Returns the raw JSON value of [internationalSms].
             *
             * Unlike [internationalSms], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("international_sms")
            @ExcludeMissing
            fun _internationalSms(): JsonField<Boolean> = internationalSms

            /**
             * Returns the raw JSON value of [p2p].
             *
             * Unlike [p2p], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("p2p") @ExcludeMissing fun _p2p(): JsonField<Boolean> = p2p

            /**
             * Returns the raw JSON value of [quickship].
             *
             * Unlike [quickship], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quickship")
            @ExcludeMissing
            fun _quickship(): JsonField<Boolean> = quickship

            /**
             * Returns the raw JSON value of [reservable].
             *
             * Unlike [reservable], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reservable")
            @ExcludeMissing
            fun _reservable(): JsonField<Boolean> = reservable

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

                /** Returns a mutable builder for constructing an instance of [Local]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Local]. */
            class Builder internal constructor() {

                private var features: JsonField<MutableList<String>>? = null
                private var fullPstnReplacement: JsonField<Boolean> = JsonMissing.of()
                private var internationalSms: JsonField<Boolean> = JsonMissing.of()
                private var p2p: JsonField<Boolean> = JsonMissing.of()
                private var quickship: JsonField<Boolean> = JsonMissing.of()
                private var reservable: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(local: Local) = apply {
                    features = local.features.map { it.toMutableList() }
                    fullPstnReplacement = local.fullPstnReplacement
                    internationalSms = local.internationalSms
                    p2p = local.p2p
                    quickship = local.quickship
                    reservable = local.reservable
                    additionalProperties = local.additionalProperties.toMutableMap()
                }

                fun features(features: List<String>) = features(JsonField.of(features))

                /**
                 * Sets [Builder.features] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.features] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun features(features: JsonField<List<String>>) = apply {
                    this.features = features.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [features].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFeature(feature: String) = apply {
                    features =
                        (features ?: JsonField.of(mutableListOf())).also {
                            checkKnown("features", it).add(feature)
                        }
                }

                fun fullPstnReplacement(fullPstnReplacement: Boolean) =
                    fullPstnReplacement(JsonField.of(fullPstnReplacement))

                /**
                 * Sets [Builder.fullPstnReplacement] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fullPstnReplacement] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fullPstnReplacement(fullPstnReplacement: JsonField<Boolean>) = apply {
                    this.fullPstnReplacement = fullPstnReplacement
                }

                fun internationalSms(internationalSms: Boolean) =
                    internationalSms(JsonField.of(internationalSms))

                /**
                 * Sets [Builder.internationalSms] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.internationalSms] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun internationalSms(internationalSms: JsonField<Boolean>) = apply {
                    this.internationalSms = internationalSms
                }

                fun p2p(p2p: Boolean) = p2p(JsonField.of(p2p))

                /**
                 * Sets [Builder.p2p] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.p2p] with a well-typed [Boolean] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun p2p(p2p: JsonField<Boolean>) = apply { this.p2p = p2p }

                fun quickship(quickship: Boolean) = quickship(JsonField.of(quickship))

                /**
                 * Sets [Builder.quickship] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quickship] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quickship(quickship: JsonField<Boolean>) = apply { this.quickship = quickship }

                fun reservable(reservable: Boolean) = reservable(JsonField.of(reservable))

                /**
                 * Sets [Builder.reservable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reservable] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reservable(reservable: JsonField<Boolean>) = apply {
                    this.reservable = reservable
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
                 * Returns an immutable instance of [Local].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Local =
                    Local(
                        (features ?: JsonMissing.of()).map { it.toImmutable() },
                        fullPstnReplacement,
                        internationalSms,
                        p2p,
                        quickship,
                        reservable,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Local = apply {
                if (validated) {
                    return@apply
                }

                features()
                fullPstnReplacement()
                internationalSms()
                p2p()
                quickship()
                reservable()
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
                (features.asKnown().getOrNull()?.size ?: 0) +
                    (if (fullPstnReplacement.asKnown().isPresent) 1 else 0) +
                    (if (internationalSms.asKnown().isPresent) 1 else 0) +
                    (if (p2p.asKnown().isPresent) 1 else 0) +
                    (if (quickship.asKnown().isPresent) 1 else 0) +
                    (if (reservable.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Local &&
                    features == other.features &&
                    fullPstnReplacement == other.fullPstnReplacement &&
                    internationalSms == other.internationalSms &&
                    p2p == other.p2p &&
                    quickship == other.quickship &&
                    reservable == other.reservable &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    features,
                    fullPstnReplacement,
                    internationalSms,
                    p2p,
                    quickship,
                    reservable,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Local{features=$features, fullPstnReplacement=$fullPstnReplacement, internationalSms=$internationalSms, p2p=$p2p, quickship=$quickship, reservable=$reservable, additionalProperties=$additionalProperties}"
        }

        class Mobile
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Mobile]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Mobile]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mobile: Mobile) = apply {
                    additionalProperties = mobile.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Mobile].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Mobile = Mobile(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Mobile = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Mobile && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Mobile{additionalProperties=$additionalProperties}"
        }

        class National
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [National]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [National]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(national: National) = apply {
                    additionalProperties = national.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [National].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): National = National(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): National = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is National && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "National{additionalProperties=$additionalProperties}"
        }

        class SharedCost
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [SharedCost]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SharedCost]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(sharedCost: SharedCost) = apply {
                    additionalProperties = sharedCost.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [SharedCost].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): SharedCost = SharedCost(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): SharedCost = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SharedCost && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "SharedCost{additionalProperties=$additionalProperties}"
        }

        class TollFree
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val features: JsonField<List<String>>,
            private val fullPstnReplacement: JsonField<Boolean>,
            private val internationalSms: JsonField<Boolean>,
            private val p2p: JsonField<Boolean>,
            private val quickship: JsonField<Boolean>,
            private val reservable: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("features")
                @ExcludeMissing
                features: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("full_pstn_replacement")
                @ExcludeMissing
                fullPstnReplacement: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("international_sms")
                @ExcludeMissing
                internationalSms: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("p2p") @ExcludeMissing p2p: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("quickship")
                @ExcludeMissing
                quickship: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reservable")
                @ExcludeMissing
                reservable: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                features,
                fullPstnReplacement,
                internationalSms,
                p2p,
                quickship,
                reservable,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun features(): Optional<List<String>> = features.getOptional("features")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fullPstnReplacement(): Optional<Boolean> =
                fullPstnReplacement.getOptional("full_pstn_replacement")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun internationalSms(): Optional<Boolean> =
                internationalSms.getOptional("international_sms")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun p2p(): Optional<Boolean> = p2p.getOptional("p2p")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun quickship(): Optional<Boolean> = quickship.getOptional("quickship")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reservable(): Optional<Boolean> = reservable.getOptional("reservable")

            /**
             * Returns the raw JSON value of [features].
             *
             * Unlike [features], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("features")
            @ExcludeMissing
            fun _features(): JsonField<List<String>> = features

            /**
             * Returns the raw JSON value of [fullPstnReplacement].
             *
             * Unlike [fullPstnReplacement], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("full_pstn_replacement")
            @ExcludeMissing
            fun _fullPstnReplacement(): JsonField<Boolean> = fullPstnReplacement

            /**
             * Returns the raw JSON value of [internationalSms].
             *
             * Unlike [internationalSms], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("international_sms")
            @ExcludeMissing
            fun _internationalSms(): JsonField<Boolean> = internationalSms

            /**
             * Returns the raw JSON value of [p2p].
             *
             * Unlike [p2p], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("p2p") @ExcludeMissing fun _p2p(): JsonField<Boolean> = p2p

            /**
             * Returns the raw JSON value of [quickship].
             *
             * Unlike [quickship], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quickship")
            @ExcludeMissing
            fun _quickship(): JsonField<Boolean> = quickship

            /**
             * Returns the raw JSON value of [reservable].
             *
             * Unlike [reservable], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reservable")
            @ExcludeMissing
            fun _reservable(): JsonField<Boolean> = reservable

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

                /** Returns a mutable builder for constructing an instance of [TollFree]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TollFree]. */
            class Builder internal constructor() {

                private var features: JsonField<MutableList<String>>? = null
                private var fullPstnReplacement: JsonField<Boolean> = JsonMissing.of()
                private var internationalSms: JsonField<Boolean> = JsonMissing.of()
                private var p2p: JsonField<Boolean> = JsonMissing.of()
                private var quickship: JsonField<Boolean> = JsonMissing.of()
                private var reservable: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tollFree: TollFree) = apply {
                    features = tollFree.features.map { it.toMutableList() }
                    fullPstnReplacement = tollFree.fullPstnReplacement
                    internationalSms = tollFree.internationalSms
                    p2p = tollFree.p2p
                    quickship = tollFree.quickship
                    reservable = tollFree.reservable
                    additionalProperties = tollFree.additionalProperties.toMutableMap()
                }

                fun features(features: List<String>) = features(JsonField.of(features))

                /**
                 * Sets [Builder.features] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.features] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun features(features: JsonField<List<String>>) = apply {
                    this.features = features.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [features].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFeature(feature: String) = apply {
                    features =
                        (features ?: JsonField.of(mutableListOf())).also {
                            checkKnown("features", it).add(feature)
                        }
                }

                fun fullPstnReplacement(fullPstnReplacement: Boolean) =
                    fullPstnReplacement(JsonField.of(fullPstnReplacement))

                /**
                 * Sets [Builder.fullPstnReplacement] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fullPstnReplacement] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fullPstnReplacement(fullPstnReplacement: JsonField<Boolean>) = apply {
                    this.fullPstnReplacement = fullPstnReplacement
                }

                fun internationalSms(internationalSms: Boolean) =
                    internationalSms(JsonField.of(internationalSms))

                /**
                 * Sets [Builder.internationalSms] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.internationalSms] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun internationalSms(internationalSms: JsonField<Boolean>) = apply {
                    this.internationalSms = internationalSms
                }

                fun p2p(p2p: Boolean) = p2p(JsonField.of(p2p))

                /**
                 * Sets [Builder.p2p] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.p2p] with a well-typed [Boolean] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun p2p(p2p: JsonField<Boolean>) = apply { this.p2p = p2p }

                fun quickship(quickship: Boolean) = quickship(JsonField.of(quickship))

                /**
                 * Sets [Builder.quickship] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quickship] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quickship(quickship: JsonField<Boolean>) = apply { this.quickship = quickship }

                fun reservable(reservable: Boolean) = reservable(JsonField.of(reservable))

                /**
                 * Sets [Builder.reservable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reservable] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reservable(reservable: JsonField<Boolean>) = apply {
                    this.reservable = reservable
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
                 * Returns an immutable instance of [TollFree].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TollFree =
                    TollFree(
                        (features ?: JsonMissing.of()).map { it.toImmutable() },
                        fullPstnReplacement,
                        internationalSms,
                        p2p,
                        quickship,
                        reservable,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TollFree = apply {
                if (validated) {
                    return@apply
                }

                features()
                fullPstnReplacement()
                internationalSms()
                p2p()
                quickship()
                reservable()
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
                (features.asKnown().getOrNull()?.size ?: 0) +
                    (if (fullPstnReplacement.asKnown().isPresent) 1 else 0) +
                    (if (internationalSms.asKnown().isPresent) 1 else 0) +
                    (if (p2p.asKnown().isPresent) 1 else 0) +
                    (if (quickship.asKnown().isPresent) 1 else 0) +
                    (if (reservable.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TollFree &&
                    features == other.features &&
                    fullPstnReplacement == other.fullPstnReplacement &&
                    internationalSms == other.internationalSms &&
                    p2p == other.p2p &&
                    quickship == other.quickship &&
                    reservable == other.reservable &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    features,
                    fullPstnReplacement,
                    internationalSms,
                    p2p,
                    quickship,
                    reservable,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TollFree{features=$features, fullPstnReplacement=$fullPstnReplacement, internationalSms=$internationalSms, p2p=$p2p, quickship=$quickship, reservable=$reservable, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                code == other.code &&
                features == other.features &&
                internationalSms == other.internationalSms &&
                inventoryCoverage == other.inventoryCoverage &&
                local == other.local &&
                mobile == other.mobile &&
                national == other.national &&
                numbers == other.numbers &&
                p2p == other.p2p &&
                phoneNumberType == other.phoneNumberType &&
                quickship == other.quickship &&
                region == other.region &&
                reservable == other.reservable &&
                sharedCost == other.sharedCost &&
                tollFree == other.tollFree &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                code,
                features,
                internationalSms,
                inventoryCoverage,
                local,
                mobile,
                national,
                numbers,
                p2p,
                phoneNumberType,
                quickship,
                region,
                reservable,
                sharedCost,
                tollFree,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{code=$code, features=$features, internationalSms=$internationalSms, inventoryCoverage=$inventoryCoverage, local=$local, mobile=$mobile, national=$national, numbers=$numbers, p2p=$p2p, phoneNumberType=$phoneNumberType, quickship=$quickship, region=$region, reservable=$reservable, sharedCost=$sharedCost, tollFree=$tollFree, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CountryCoverageRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CountryCoverageRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
