// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections.civicaddresses

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

class CivicAddressRetrieveResponse
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
         * Returns a mutable builder for constructing an instance of [CivicAddressRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CivicAddressRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(civicAddressRetrieveResponse: CivicAddressRetrieveResponse) = apply {
            data = civicAddressRetrieveResponse.data
            additionalProperties = civicAddressRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CivicAddressRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CivicAddressRetrieveResponse =
            CivicAddressRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CivicAddressRetrieveResponse = apply {
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
        private val id: JsonField<String>,
        private val cityOrTown: JsonField<String>,
        private val cityOrTownAlias: JsonField<String>,
        private val companyName: JsonField<String>,
        private val country: JsonField<String>,
        private val countryOrDistrict: JsonField<String>,
        private val defaultLocationId: JsonField<String>,
        private val description: JsonField<String>,
        private val houseNumber: JsonField<String>,
        private val houseNumberSuffix: JsonField<String>,
        private val locations: JsonField<List<Location>>,
        private val postalOrZipCode: JsonField<String>,
        private val recordType: JsonField<String>,
        private val stateOrProvince: JsonField<String>,
        private val streetName: JsonField<String>,
        private val streetSuffix: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("city_or_town")
            @ExcludeMissing
            cityOrTown: JsonField<String> = JsonMissing.of(),
            @JsonProperty("city_or_town_alias")
            @ExcludeMissing
            cityOrTownAlias: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_name")
            @ExcludeMissing
            companyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country_or_district")
            @ExcludeMissing
            countryOrDistrict: JsonField<String> = JsonMissing.of(),
            @JsonProperty("default_location_id")
            @ExcludeMissing
            defaultLocationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("house_number")
            @ExcludeMissing
            houseNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("house_number_suffix")
            @ExcludeMissing
            houseNumberSuffix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locations")
            @ExcludeMissing
            locations: JsonField<List<Location>> = JsonMissing.of(),
            @JsonProperty("postal_or_zip_code")
            @ExcludeMissing
            postalOrZipCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state_or_province")
            @ExcludeMissing
            stateOrProvince: JsonField<String> = JsonMissing.of(),
            @JsonProperty("street_name")
            @ExcludeMissing
            streetName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("street_suffix")
            @ExcludeMissing
            streetSuffix: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            cityOrTown,
            cityOrTownAlias,
            companyName,
            country,
            countryOrDistrict,
            defaultLocationId,
            description,
            houseNumber,
            houseNumberSuffix,
            locations,
            postalOrZipCode,
            recordType,
            stateOrProvince,
            streetName,
            streetSuffix,
            mutableMapOf(),
        )

        /**
         * Uniquely identifies the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cityOrTown(): Optional<String> = cityOrTown.getOptional("city_or_town")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cityOrTownAlias(): Optional<String> = cityOrTownAlias.getOptional("city_or_town_alias")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun companyName(): Optional<String> = companyName.getOptional("company_name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun countryOrDistrict(): Optional<String> =
            countryOrDistrict.getOptional("country_or_district")

        /**
         * Identifies what is the default location in the list of locations.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultLocationId(): Optional<String> =
            defaultLocationId.getOptional("default_location_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun houseNumber(): Optional<String> = houseNumber.getOptional("house_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun houseNumberSuffix(): Optional<String> =
            houseNumberSuffix.getOptional("house_number_suffix")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun locations(): Optional<List<Location>> = locations.getOptional("locations")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun postalOrZipCode(): Optional<String> = postalOrZipCode.getOptional("postal_or_zip_code")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stateOrProvince(): Optional<String> = stateOrProvince.getOptional("state_or_province")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streetName(): Optional<String> = streetName.getOptional("street_name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streetSuffix(): Optional<String> = streetSuffix.getOptional("street_suffix")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [cityOrTown].
         *
         * Unlike [cityOrTown], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city_or_town")
        @ExcludeMissing
        fun _cityOrTown(): JsonField<String> = cityOrTown

        /**
         * Returns the raw JSON value of [cityOrTownAlias].
         *
         * Unlike [cityOrTownAlias], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("city_or_town_alias")
        @ExcludeMissing
        fun _cityOrTownAlias(): JsonField<String> = cityOrTownAlias

        /**
         * Returns the raw JSON value of [companyName].
         *
         * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("company_name")
        @ExcludeMissing
        fun _companyName(): JsonField<String> = companyName

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [countryOrDistrict].
         *
         * Unlike [countryOrDistrict], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("country_or_district")
        @ExcludeMissing
        fun _countryOrDistrict(): JsonField<String> = countryOrDistrict

        /**
         * Returns the raw JSON value of [defaultLocationId].
         *
         * Unlike [defaultLocationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("default_location_id")
        @ExcludeMissing
        fun _defaultLocationId(): JsonField<String> = defaultLocationId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [houseNumber].
         *
         * Unlike [houseNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("house_number")
        @ExcludeMissing
        fun _houseNumber(): JsonField<String> = houseNumber

        /**
         * Returns the raw JSON value of [houseNumberSuffix].
         *
         * Unlike [houseNumberSuffix], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("house_number_suffix")
        @ExcludeMissing
        fun _houseNumberSuffix(): JsonField<String> = houseNumberSuffix

        /**
         * Returns the raw JSON value of [locations].
         *
         * Unlike [locations], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locations")
        @ExcludeMissing
        fun _locations(): JsonField<List<Location>> = locations

        /**
         * Returns the raw JSON value of [postalOrZipCode].
         *
         * Unlike [postalOrZipCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("postal_or_zip_code")
        @ExcludeMissing
        fun _postalOrZipCode(): JsonField<String> = postalOrZipCode

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [stateOrProvince].
         *
         * Unlike [stateOrProvince], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("state_or_province")
        @ExcludeMissing
        fun _stateOrProvince(): JsonField<String> = stateOrProvince

        /**
         * Returns the raw JSON value of [streetName].
         *
         * Unlike [streetName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("street_name")
        @ExcludeMissing
        fun _streetName(): JsonField<String> = streetName

        /**
         * Returns the raw JSON value of [streetSuffix].
         *
         * Unlike [streetSuffix], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("street_suffix")
        @ExcludeMissing
        fun _streetSuffix(): JsonField<String> = streetSuffix

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

            private var id: JsonField<String> = JsonMissing.of()
            private var cityOrTown: JsonField<String> = JsonMissing.of()
            private var cityOrTownAlias: JsonField<String> = JsonMissing.of()
            private var companyName: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var countryOrDistrict: JsonField<String> = JsonMissing.of()
            private var defaultLocationId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var houseNumber: JsonField<String> = JsonMissing.of()
            private var houseNumberSuffix: JsonField<String> = JsonMissing.of()
            private var locations: JsonField<MutableList<Location>>? = null
            private var postalOrZipCode: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var stateOrProvince: JsonField<String> = JsonMissing.of()
            private var streetName: JsonField<String> = JsonMissing.of()
            private var streetSuffix: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                cityOrTown = data.cityOrTown
                cityOrTownAlias = data.cityOrTownAlias
                companyName = data.companyName
                country = data.country
                countryOrDistrict = data.countryOrDistrict
                defaultLocationId = data.defaultLocationId
                description = data.description
                houseNumber = data.houseNumber
                houseNumberSuffix = data.houseNumberSuffix
                locations = data.locations.map { it.toMutableList() }
                postalOrZipCode = data.postalOrZipCode
                recordType = data.recordType
                stateOrProvince = data.stateOrProvince
                streetName = data.streetName
                streetSuffix = data.streetSuffix
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Uniquely identifies the resource. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun cityOrTown(cityOrTown: String) = cityOrTown(JsonField.of(cityOrTown))

            /**
             * Sets [Builder.cityOrTown] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cityOrTown] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cityOrTown(cityOrTown: JsonField<String>) = apply { this.cityOrTown = cityOrTown }

            fun cityOrTownAlias(cityOrTownAlias: String) =
                cityOrTownAlias(JsonField.of(cityOrTownAlias))

            /**
             * Sets [Builder.cityOrTownAlias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cityOrTownAlias] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cityOrTownAlias(cityOrTownAlias: JsonField<String>) = apply {
                this.cityOrTownAlias = cityOrTownAlias
            }

            fun companyName(companyName: String) = companyName(JsonField.of(companyName))

            /**
             * Sets [Builder.companyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun companyName(companyName: JsonField<String>) = apply {
                this.companyName = companyName
            }

            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun countryOrDistrict(countryOrDistrict: String) =
                countryOrDistrict(JsonField.of(countryOrDistrict))

            /**
             * Sets [Builder.countryOrDistrict] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryOrDistrict] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryOrDistrict(countryOrDistrict: JsonField<String>) = apply {
                this.countryOrDistrict = countryOrDistrict
            }

            /** Identifies what is the default location in the list of locations. */
            fun defaultLocationId(defaultLocationId: String) =
                defaultLocationId(JsonField.of(defaultLocationId))

            /**
             * Sets [Builder.defaultLocationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultLocationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultLocationId(defaultLocationId: JsonField<String>) = apply {
                this.defaultLocationId = defaultLocationId
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

            fun houseNumber(houseNumber: String) = houseNumber(JsonField.of(houseNumber))

            /**
             * Sets [Builder.houseNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.houseNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun houseNumber(houseNumber: JsonField<String>) = apply {
                this.houseNumber = houseNumber
            }

            fun houseNumberSuffix(houseNumberSuffix: String) =
                houseNumberSuffix(JsonField.of(houseNumberSuffix))

            /**
             * Sets [Builder.houseNumberSuffix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.houseNumberSuffix] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun houseNumberSuffix(houseNumberSuffix: JsonField<String>) = apply {
                this.houseNumberSuffix = houseNumberSuffix
            }

            fun locations(locations: List<Location>) = locations(JsonField.of(locations))

            /**
             * Sets [Builder.locations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locations] with a well-typed `List<Location>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locations(locations: JsonField<List<Location>>) = apply {
                this.locations = locations.map { it.toMutableList() }
            }

            /**
             * Adds a single [Location] to [locations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLocation(location: Location) = apply {
                locations =
                    (locations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("locations", it).add(location)
                    }
            }

            fun postalOrZipCode(postalOrZipCode: String) =
                postalOrZipCode(JsonField.of(postalOrZipCode))

            /**
             * Sets [Builder.postalOrZipCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalOrZipCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalOrZipCode(postalOrZipCode: JsonField<String>) = apply {
                this.postalOrZipCode = postalOrZipCode
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

            fun stateOrProvince(stateOrProvince: String) =
                stateOrProvince(JsonField.of(stateOrProvince))

            /**
             * Sets [Builder.stateOrProvince] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stateOrProvince] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stateOrProvince(stateOrProvince: JsonField<String>) = apply {
                this.stateOrProvince = stateOrProvince
            }

            fun streetName(streetName: String) = streetName(JsonField.of(streetName))

            /**
             * Sets [Builder.streetName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streetName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun streetName(streetName: JsonField<String>) = apply { this.streetName = streetName }

            fun streetSuffix(streetSuffix: String) = streetSuffix(JsonField.of(streetSuffix))

            /**
             * Sets [Builder.streetSuffix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streetSuffix] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun streetSuffix(streetSuffix: JsonField<String>) = apply {
                this.streetSuffix = streetSuffix
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
                    id,
                    cityOrTown,
                    cityOrTownAlias,
                    companyName,
                    country,
                    countryOrDistrict,
                    defaultLocationId,
                    description,
                    houseNumber,
                    houseNumberSuffix,
                    (locations ?: JsonMissing.of()).map { it.toImmutable() },
                    postalOrZipCode,
                    recordType,
                    stateOrProvince,
                    streetName,
                    streetSuffix,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            cityOrTown()
            cityOrTownAlias()
            companyName()
            country()
            countryOrDistrict()
            defaultLocationId()
            description()
            houseNumber()
            houseNumberSuffix()
            locations().ifPresent { it.forEach { it.validate() } }
            postalOrZipCode()
            recordType()
            stateOrProvince()
            streetName()
            streetSuffix()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (cityOrTown.asKnown().isPresent) 1 else 0) +
                (if (cityOrTownAlias.asKnown().isPresent) 1 else 0) +
                (if (companyName.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (countryOrDistrict.asKnown().isPresent) 1 else 0) +
                (if (defaultLocationId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (houseNumber.asKnown().isPresent) 1 else 0) +
                (if (houseNumberSuffix.asKnown().isPresent) 1 else 0) +
                (locations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (postalOrZipCode.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (stateOrProvince.asKnown().isPresent) 1 else 0) +
                (if (streetName.asKnown().isPresent) 1 else 0) +
                (if (streetSuffix.asKnown().isPresent) 1 else 0)

        class Location
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val additionalInfo: JsonField<String>,
            private val description: JsonField<String>,
            private val isDefault: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("additional_info")
                @ExcludeMissing
                additionalInfo: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("is_default")
                @ExcludeMissing
                isDefault: JsonField<Boolean> = JsonMissing.of(),
            ) : this(id, additionalInfo, description, isDefault, mutableMapOf())

            /**
             * Uniquely identifies the resource.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun additionalInfo(): Optional<String> = additionalInfo.getOptional("additional_info")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Represents whether the location is the default or not.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isDefault(): Optional<Boolean> = isDefault.getOptional("is_default")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [additionalInfo].
             *
             * Unlike [additionalInfo], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("additional_info")
            @ExcludeMissing
            fun _additionalInfo(): JsonField<String> = additionalInfo

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [isDefault].
             *
             * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("is_default")
            @ExcludeMissing
            fun _isDefault(): JsonField<Boolean> = isDefault

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

                /** Returns a mutable builder for constructing an instance of [Location]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Location]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalInfo: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var isDefault: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(location: Location) = apply {
                    id = location.id
                    additionalInfo = location.additionalInfo
                    description = location.description
                    isDefault = location.isDefault
                    additionalProperties = location.additionalProperties.toMutableMap()
                }

                /** Uniquely identifies the resource. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalInfo(additionalInfo: String) =
                    additionalInfo(JsonField.of(additionalInfo))

                /**
                 * Sets [Builder.additionalInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.additionalInfo] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun additionalInfo(additionalInfo: JsonField<String>) = apply {
                    this.additionalInfo = additionalInfo
                }

                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Represents whether the location is the default or not. */
                fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

                /**
                 * Sets [Builder.isDefault] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isDefault] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

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
                 * Returns an immutable instance of [Location].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Location =
                    Location(
                        id,
                        additionalInfo,
                        description,
                        isDefault,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Location = apply {
                if (validated) {
                    return@apply
                }

                id()
                additionalInfo()
                description()
                isDefault()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (additionalInfo.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (isDefault.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Location &&
                    id == other.id &&
                    additionalInfo == other.additionalInfo &&
                    description == other.description &&
                    isDefault == other.isDefault &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, additionalInfo, description, isDefault, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Location{id=$id, additionalInfo=$additionalInfo, description=$description, isDefault=$isDefault, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                cityOrTown == other.cityOrTown &&
                cityOrTownAlias == other.cityOrTownAlias &&
                companyName == other.companyName &&
                country == other.country &&
                countryOrDistrict == other.countryOrDistrict &&
                defaultLocationId == other.defaultLocationId &&
                description == other.description &&
                houseNumber == other.houseNumber &&
                houseNumberSuffix == other.houseNumberSuffix &&
                locations == other.locations &&
                postalOrZipCode == other.postalOrZipCode &&
                recordType == other.recordType &&
                stateOrProvince == other.stateOrProvince &&
                streetName == other.streetName &&
                streetSuffix == other.streetSuffix &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                cityOrTown,
                cityOrTownAlias,
                companyName,
                country,
                countryOrDistrict,
                defaultLocationId,
                description,
                houseNumber,
                houseNumberSuffix,
                locations,
                postalOrZipCode,
                recordType,
                stateOrProvince,
                streetName,
                streetSuffix,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, cityOrTown=$cityOrTown, cityOrTownAlias=$cityOrTownAlias, companyName=$companyName, country=$country, countryOrDistrict=$countryOrDistrict, defaultLocationId=$defaultLocationId, description=$description, houseNumber=$houseNumber, houseNumberSuffix=$houseNumberSuffix, locations=$locations, postalOrZipCode=$postalOrZipCode, recordType=$recordType, stateOrProvince=$stateOrProvince, streetName=$streetName, streetSuffix=$streetSuffix, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CivicAddressRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CivicAddressRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
