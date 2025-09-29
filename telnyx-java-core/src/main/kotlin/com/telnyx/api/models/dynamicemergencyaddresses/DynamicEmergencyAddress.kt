// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.dynamicemergencyaddresses

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkRequired
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DynamicEmergencyAddress
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val administrativeArea: JsonField<String>,
    private val countryCode: JsonField<CountryCode>,
    private val houseNumber: JsonField<String>,
    private val locality: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val streetName: JsonField<String>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val extendedAddress: JsonField<String>,
    private val houseSuffix: JsonField<String>,
    private val recordType: JsonField<String>,
    private val sipGeolocationId: JsonField<String>,
    private val status: JsonField<Status>,
    private val streetPostDirectional: JsonField<String>,
    private val streetPreDirectional: JsonField<String>,
    private val streetSuffix: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("administrative_area")
        @ExcludeMissing
        administrativeArea: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country_code")
        @ExcludeMissing
        countryCode: JsonField<CountryCode> = JsonMissing.of(),
        @JsonProperty("house_number")
        @ExcludeMissing
        houseNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality") @ExcludeMissing locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street_name")
        @ExcludeMissing
        streetName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extended_address")
        @ExcludeMissing
        extendedAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("house_suffix")
        @ExcludeMissing
        houseSuffix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sip_geolocation_id")
        @ExcludeMissing
        sipGeolocationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("street_post_directional")
        @ExcludeMissing
        streetPostDirectional: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street_pre_directional")
        @ExcludeMissing
        streetPreDirectional: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street_suffix")
        @ExcludeMissing
        streetSuffix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        administrativeArea,
        countryCode,
        houseNumber,
        locality,
        postalCode,
        streetName,
        id,
        createdAt,
        extendedAddress,
        houseSuffix,
        recordType,
        sipGeolocationId,
        status,
        streetPostDirectional,
        streetPreDirectional,
        streetSuffix,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun administrativeArea(): String = administrativeArea.getRequired("administrative_area")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun countryCode(): CountryCode = countryCode.getRequired("country_code")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun houseNumber(): String = houseNumber.getRequired("house_number")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun locality(): String = locality.getRequired("locality")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun postalCode(): String = postalCode.getRequired("postal_code")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun streetName(): String = streetName.getRequired("street_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * ISO 8601 formatted date of when the resource was created
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extendedAddress(): Optional<String> = extendedAddress.getOptional("extended_address")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun houseSuffix(): Optional<String> = houseSuffix.getOptional("house_suffix")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * Unique location reference string to be used in SIP INVITE from / p-asserted headers.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipGeolocationId(): Optional<String> = sipGeolocationId.getOptional("sip_geolocation_id")

    /**
     * Status of dynamic emergency address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streetPostDirectional(): Optional<String> =
        streetPostDirectional.getOptional("street_post_directional")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streetPreDirectional(): Optional<String> =
        streetPreDirectional.getOptional("street_pre_directional")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streetSuffix(): Optional<String> = streetSuffix.getOptional("street_suffix")

    /**
     * ISO 8601 formatted date of when the resource was last updated
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [administrativeArea].
     *
     * Unlike [administrativeArea], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("administrative_area")
    @ExcludeMissing
    fun _administrativeArea(): JsonField<String> = administrativeArea

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_code")
    @ExcludeMissing
    fun _countryCode(): JsonField<CountryCode> = countryCode

    /**
     * Returns the raw JSON value of [houseNumber].
     *
     * Unlike [houseNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("house_number")
    @ExcludeMissing
    fun _houseNumber(): JsonField<String> = houseNumber

    /**
     * Returns the raw JSON value of [locality].
     *
     * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Returns the raw JSON value of [streetName].
     *
     * Unlike [streetName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("street_name") @ExcludeMissing fun _streetName(): JsonField<String> = streetName

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [extendedAddress].
     *
     * Unlike [extendedAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extended_address")
    @ExcludeMissing
    fun _extendedAddress(): JsonField<String> = extendedAddress

    /**
     * Returns the raw JSON value of [houseSuffix].
     *
     * Unlike [houseSuffix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("house_suffix")
    @ExcludeMissing
    fun _houseSuffix(): JsonField<String> = houseSuffix

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [sipGeolocationId].
     *
     * Unlike [sipGeolocationId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sip_geolocation_id")
    @ExcludeMissing
    fun _sipGeolocationId(): JsonField<String> = sipGeolocationId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [streetPostDirectional].
     *
     * Unlike [streetPostDirectional], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("street_post_directional")
    @ExcludeMissing
    fun _streetPostDirectional(): JsonField<String> = streetPostDirectional

    /**
     * Returns the raw JSON value of [streetPreDirectional].
     *
     * Unlike [streetPreDirectional], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("street_pre_directional")
    @ExcludeMissing
    fun _streetPreDirectional(): JsonField<String> = streetPreDirectional

    /**
     * Returns the raw JSON value of [streetSuffix].
     *
     * Unlike [streetSuffix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("street_suffix")
    @ExcludeMissing
    fun _streetSuffix(): JsonField<String> = streetSuffix

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [DynamicEmergencyAddress].
         *
         * The following fields are required:
         * ```java
         * .administrativeArea()
         * .countryCode()
         * .houseNumber()
         * .locality()
         * .postalCode()
         * .streetName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DynamicEmergencyAddress]. */
    class Builder internal constructor() {

        private var administrativeArea: JsonField<String>? = null
        private var countryCode: JsonField<CountryCode>? = null
        private var houseNumber: JsonField<String>? = null
        private var locality: JsonField<String>? = null
        private var postalCode: JsonField<String>? = null
        private var streetName: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var extendedAddress: JsonField<String> = JsonMissing.of()
        private var houseSuffix: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var sipGeolocationId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var streetPostDirectional: JsonField<String> = JsonMissing.of()
        private var streetPreDirectional: JsonField<String> = JsonMissing.of()
        private var streetSuffix: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dynamicEmergencyAddress: DynamicEmergencyAddress) = apply {
            administrativeArea = dynamicEmergencyAddress.administrativeArea
            countryCode = dynamicEmergencyAddress.countryCode
            houseNumber = dynamicEmergencyAddress.houseNumber
            locality = dynamicEmergencyAddress.locality
            postalCode = dynamicEmergencyAddress.postalCode
            streetName = dynamicEmergencyAddress.streetName
            id = dynamicEmergencyAddress.id
            createdAt = dynamicEmergencyAddress.createdAt
            extendedAddress = dynamicEmergencyAddress.extendedAddress
            houseSuffix = dynamicEmergencyAddress.houseSuffix
            recordType = dynamicEmergencyAddress.recordType
            sipGeolocationId = dynamicEmergencyAddress.sipGeolocationId
            status = dynamicEmergencyAddress.status
            streetPostDirectional = dynamicEmergencyAddress.streetPostDirectional
            streetPreDirectional = dynamicEmergencyAddress.streetPreDirectional
            streetSuffix = dynamicEmergencyAddress.streetSuffix
            updatedAt = dynamicEmergencyAddress.updatedAt
            additionalProperties = dynamicEmergencyAddress.additionalProperties.toMutableMap()
        }

        fun administrativeArea(administrativeArea: String) =
            administrativeArea(JsonField.of(administrativeArea))

        /**
         * Sets [Builder.administrativeArea] to an arbitrary JSON value.
         *
         * You should usually call [Builder.administrativeArea] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun administrativeArea(administrativeArea: JsonField<String>) = apply {
            this.administrativeArea = administrativeArea
        }

        fun countryCode(countryCode: CountryCode) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [CountryCode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun countryCode(countryCode: JsonField<CountryCode>) = apply {
            this.countryCode = countryCode
        }

        fun houseNumber(houseNumber: String) = houseNumber(JsonField.of(houseNumber))

        /**
         * Sets [Builder.houseNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.houseNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun houseNumber(houseNumber: JsonField<String>) = apply { this.houseNumber = houseNumber }

        fun locality(locality: String) = locality(JsonField.of(locality))

        /**
         * Sets [Builder.locality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locality(locality: JsonField<String>) = apply { this.locality = locality }

        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        fun streetName(streetName: String) = streetName(JsonField.of(streetName))

        /**
         * Sets [Builder.streetName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streetName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun streetName(streetName: JsonField<String>) = apply { this.streetName = streetName }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ISO 8601 formatted date of when the resource was created */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun extendedAddress(extendedAddress: String) =
            extendedAddress(JsonField.of(extendedAddress))

        /**
         * Sets [Builder.extendedAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extendedAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extendedAddress(extendedAddress: JsonField<String>) = apply {
            this.extendedAddress = extendedAddress
        }

        fun houseSuffix(houseSuffix: String) = houseSuffix(JsonField.of(houseSuffix))

        /**
         * Sets [Builder.houseSuffix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.houseSuffix] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun houseSuffix(houseSuffix: JsonField<String>) = apply { this.houseSuffix = houseSuffix }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** Unique location reference string to be used in SIP INVITE from / p-asserted headers. */
        fun sipGeolocationId(sipGeolocationId: String) =
            sipGeolocationId(JsonField.of(sipGeolocationId))

        /**
         * Sets [Builder.sipGeolocationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipGeolocationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sipGeolocationId(sipGeolocationId: JsonField<String>) = apply {
            this.sipGeolocationId = sipGeolocationId
        }

        /** Status of dynamic emergency address */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun streetPostDirectional(streetPostDirectional: String) =
            streetPostDirectional(JsonField.of(streetPostDirectional))

        /**
         * Sets [Builder.streetPostDirectional] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streetPostDirectional] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun streetPostDirectional(streetPostDirectional: JsonField<String>) = apply {
            this.streetPostDirectional = streetPostDirectional
        }

        fun streetPreDirectional(streetPreDirectional: String) =
            streetPreDirectional(JsonField.of(streetPreDirectional))

        /**
         * Sets [Builder.streetPreDirectional] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streetPreDirectional] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun streetPreDirectional(streetPreDirectional: JsonField<String>) = apply {
            this.streetPreDirectional = streetPreDirectional
        }

        fun streetSuffix(streetSuffix: String) = streetSuffix(JsonField.of(streetSuffix))

        /**
         * Sets [Builder.streetSuffix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streetSuffix] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun streetSuffix(streetSuffix: JsonField<String>) = apply {
            this.streetSuffix = streetSuffix
        }

        /** ISO 8601 formatted date of when the resource was last updated */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [DynamicEmergencyAddress].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .administrativeArea()
         * .countryCode()
         * .houseNumber()
         * .locality()
         * .postalCode()
         * .streetName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DynamicEmergencyAddress =
            DynamicEmergencyAddress(
                checkRequired("administrativeArea", administrativeArea),
                checkRequired("countryCode", countryCode),
                checkRequired("houseNumber", houseNumber),
                checkRequired("locality", locality),
                checkRequired("postalCode", postalCode),
                checkRequired("streetName", streetName),
                id,
                createdAt,
                extendedAddress,
                houseSuffix,
                recordType,
                sipGeolocationId,
                status,
                streetPostDirectional,
                streetPreDirectional,
                streetSuffix,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DynamicEmergencyAddress = apply {
        if (validated) {
            return@apply
        }

        administrativeArea()
        countryCode().validate()
        houseNumber()
        locality()
        postalCode()
        streetName()
        id()
        createdAt()
        extendedAddress()
        houseSuffix()
        recordType()
        sipGeolocationId()
        status().ifPresent { it.validate() }
        streetPostDirectional()
        streetPreDirectional()
        streetSuffix()
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
        (if (administrativeArea.asKnown().isPresent) 1 else 0) +
            (countryCode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (houseNumber.asKnown().isPresent) 1 else 0) +
            (if (locality.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (streetName.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (extendedAddress.asKnown().isPresent) 1 else 0) +
            (if (houseSuffix.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (sipGeolocationId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (streetPostDirectional.asKnown().isPresent) 1 else 0) +
            (if (streetPreDirectional.asKnown().isPresent) 1 else 0) +
            (if (streetSuffix.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class CountryCode @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val US = of("US")

            @JvmField val CA = of("CA")

            @JvmField val PR = of("PR")

            @JvmStatic fun of(value: String) = CountryCode(JsonField.of(value))
        }

        /** An enum containing [CountryCode]'s known values. */
        enum class Known {
            US,
            CA,
            PR,
        }

        /**
         * An enum containing [CountryCode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CountryCode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            US,
            CA,
            PR,
            /**
             * An enum member indicating that [CountryCode] was instantiated with an unknown value.
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
                US -> Value.US
                CA -> Value.CA
                PR -> Value.PR
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
                US -> Known.US
                CA -> Known.CA
                PR -> Known.PR
                else -> throw TelnyxInvalidDataException("Unknown CountryCode: $value")
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

        fun validate(): CountryCode = apply {
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

            return other is CountryCode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Status of dynamic emergency address */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING = of("pending")

            @JvmField val ACTIVATED = of("activated")

            @JvmField val REJECTED = of("rejected")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            ACTIVATED,
            REJECTED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            ACTIVATED,
            REJECTED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                ACTIVATED -> Value.ACTIVATED
                REJECTED -> Value.REJECTED
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
                PENDING -> Known.PENDING
                ACTIVATED -> Known.ACTIVATED
                REJECTED -> Known.REJECTED
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DynamicEmergencyAddress &&
            administrativeArea == other.administrativeArea &&
            countryCode == other.countryCode &&
            houseNumber == other.houseNumber &&
            locality == other.locality &&
            postalCode == other.postalCode &&
            streetName == other.streetName &&
            id == other.id &&
            createdAt == other.createdAt &&
            extendedAddress == other.extendedAddress &&
            houseSuffix == other.houseSuffix &&
            recordType == other.recordType &&
            sipGeolocationId == other.sipGeolocationId &&
            status == other.status &&
            streetPostDirectional == other.streetPostDirectional &&
            streetPreDirectional == other.streetPreDirectional &&
            streetSuffix == other.streetSuffix &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            administrativeArea,
            countryCode,
            houseNumber,
            locality,
            postalCode,
            streetName,
            id,
            createdAt,
            extendedAddress,
            houseSuffix,
            recordType,
            sipGeolocationId,
            status,
            streetPostDirectional,
            streetPreDirectional,
            streetSuffix,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DynamicEmergencyAddress{administrativeArea=$administrativeArea, countryCode=$countryCode, houseNumber=$houseNumber, locality=$locality, postalCode=$postalCode, streetName=$streetName, id=$id, createdAt=$createdAt, extendedAddress=$extendedAddress, houseSuffix=$houseSuffix, recordType=$recordType, sipGeolocationId=$sipGeolocationId, status=$status, streetPostDirectional=$streetPostDirectional, streetPreDirectional=$streetPreDirectional, streetSuffix=$streetSuffix, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
