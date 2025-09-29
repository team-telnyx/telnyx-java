// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbersregulatoryrequirements

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
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PhoneNumbersRegulatoryRequirementRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<PaginationMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<PaginationMeta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<PaginationMeta> = meta.getOptional("meta")

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
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<PaginationMeta> = meta

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
         * [PhoneNumbersRegulatoryRequirementRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumbersRegulatoryRequirementRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<PaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            phoneNumbersRegulatoryRequirementRetrieveResponse:
                PhoneNumbersRegulatoryRequirementRetrieveResponse
        ) = apply {
            data = phoneNumbersRegulatoryRequirementRetrieveResponse.data.map { it.toMutableList() }
            meta = phoneNumbersRegulatoryRequirementRetrieveResponse.meta
            additionalProperties =
                phoneNumbersRegulatoryRequirementRetrieveResponse.additionalProperties
                    .toMutableMap()
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

        fun meta(meta: PaginationMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [PaginationMeta] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meta(meta: JsonField<PaginationMeta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [PhoneNumbersRegulatoryRequirementRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumbersRegulatoryRequirementRetrieveResponse =
            PhoneNumbersRegulatoryRequirementRetrieveResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PhoneNumbersRegulatoryRequirementRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val phoneNumber: JsonField<String>,
        private val phoneNumberType: JsonField<String>,
        private val recordType: JsonField<String>,
        private val regionInformation: JsonField<List<RegionInformation>>,
        private val regulatoryRequirements: JsonField<List<RegulatoryRequirement>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number_type")
            @ExcludeMissing
            phoneNumberType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region_information")
            @ExcludeMissing
            regionInformation: JsonField<List<RegionInformation>> = JsonMissing.of(),
            @JsonProperty("regulatory_requirements")
            @ExcludeMissing
            regulatoryRequirements: JsonField<List<RegulatoryRequirement>> = JsonMissing.of(),
        ) : this(
            phoneNumber,
            phoneNumberType,
            recordType,
            regionInformation,
            regulatoryRequirements,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberType(): Optional<String> = phoneNumberType.getOptional("phone_number_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regionInformation(): Optional<List<RegionInformation>> =
            regionInformation.getOptional("region_information")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regulatoryRequirements(): Optional<List<RegulatoryRequirement>> =
            regulatoryRequirements.getOptional("regulatory_requirements")

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [phoneNumberType].
         *
         * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_number_type")
        @ExcludeMissing
        fun _phoneNumberType(): JsonField<String> = phoneNumberType

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

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
         * Returns the raw JSON value of [regulatoryRequirements].
         *
         * Unlike [regulatoryRequirements], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("regulatory_requirements")
        @ExcludeMissing
        fun _regulatoryRequirements(): JsonField<List<RegulatoryRequirement>> =
            regulatoryRequirements

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

            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var phoneNumberType: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var regionInformation: JsonField<MutableList<RegionInformation>>? = null
            private var regulatoryRequirements: JsonField<MutableList<RegulatoryRequirement>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                phoneNumber = data.phoneNumber
                phoneNumberType = data.phoneNumberType
                recordType = data.recordType
                regionInformation = data.regionInformation.map { it.toMutableList() }
                regulatoryRequirements = data.regulatoryRequirements.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
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

            fun phoneNumberType(phoneNumberType: String) =
                phoneNumberType(JsonField.of(phoneNumberType))

            /**
             * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumberType(phoneNumberType: JsonField<String>) = apply {
                this.phoneNumberType = phoneNumberType
            }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

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

            fun regulatoryRequirements(regulatoryRequirements: List<RegulatoryRequirement>) =
                regulatoryRequirements(JsonField.of(regulatoryRequirements))

            /**
             * Sets [Builder.regulatoryRequirements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regulatoryRequirements] with a well-typed
             * `List<RegulatoryRequirement>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun regulatoryRequirements(
                regulatoryRequirements: JsonField<List<RegulatoryRequirement>>
            ) = apply {
                this.regulatoryRequirements = regulatoryRequirements.map { it.toMutableList() }
            }

            /**
             * Adds a single [RegulatoryRequirement] to [regulatoryRequirements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRegulatoryRequirement(regulatoryRequirement: RegulatoryRequirement) = apply {
                regulatoryRequirements =
                    (regulatoryRequirements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("regulatoryRequirements", it).add(regulatoryRequirement)
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    phoneNumber,
                    phoneNumberType,
                    recordType,
                    (regionInformation ?: JsonMissing.of()).map { it.toImmutable() },
                    (regulatoryRequirements ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            phoneNumber()
            phoneNumberType()
            recordType()
            regionInformation().ifPresent { it.forEach { it.validate() } }
            regulatoryRequirements().ifPresent { it.forEach { it.validate() } }
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
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (phoneNumberType.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (regionInformation.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (regulatoryRequirements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class RegionInformation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val regionName: JsonField<String>,
            private val regionType: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("region_name")
                @ExcludeMissing
                regionName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("region_type")
                @ExcludeMissing
                regionType: JsonField<String> = JsonMissing.of(),
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
            fun regionType(): Optional<String> = regionType.getOptional("region_type")

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
            fun _regionType(): JsonField<String> = regionType

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
                private var regionType: JsonField<String> = JsonMissing.of()
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

                fun regionType(regionType: String) = regionType(JsonField.of(regionType))

                /**
                 * Sets [Builder.regionType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.regionType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun regionType(regionType: JsonField<String>) = apply {
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
                regionType()
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
                    (if (regionType.asKnown().isPresent) 1 else 0)

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

        class RegulatoryRequirement
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val acceptanceCriteria: JsonField<AcceptanceCriteria>,
            private val description: JsonField<String>,
            private val example: JsonField<String>,
            private val fieldType: JsonField<String>,
            private val label: JsonField<String>,
            private val recordType: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("acceptance_criteria")
                @ExcludeMissing
                acceptanceCriteria: JsonField<AcceptanceCriteria> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("example")
                @ExcludeMissing
                example: JsonField<String> = JsonMissing.of(),
                @JsonProperty("field_type")
                @ExcludeMissing
                fieldType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
                @JsonProperty("record_type")
                @ExcludeMissing
                recordType: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                acceptanceCriteria,
                description,
                example,
                fieldType,
                label,
                recordType,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun acceptanceCriteria(): Optional<AcceptanceCriteria> =
                acceptanceCriteria.getOptional("acceptance_criteria")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun example(): Optional<String> = example.getOptional("example")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fieldType(): Optional<String> = fieldType.getOptional("field_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun label(): Optional<String> = label.getOptional("label")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordType(): Optional<String> = recordType.getOptional("record_type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [acceptanceCriteria].
             *
             * Unlike [acceptanceCriteria], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("acceptance_criteria")
            @ExcludeMissing
            fun _acceptanceCriteria(): JsonField<AcceptanceCriteria> = acceptanceCriteria

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
             * Returns the raw JSON value of [example].
             *
             * Unlike [example], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("example") @ExcludeMissing fun _example(): JsonField<String> = example

            /**
             * Returns the raw JSON value of [fieldType].
             *
             * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("field_type")
            @ExcludeMissing
            fun _fieldType(): JsonField<String> = fieldType

            /**
             * Returns the raw JSON value of [label].
             *
             * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

            /**
             * Returns the raw JSON value of [recordType].
             *
             * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of
                 * [RegulatoryRequirement].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RegulatoryRequirement]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var acceptanceCriteria: JsonField<AcceptanceCriteria> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var example: JsonField<String> = JsonMissing.of()
                private var fieldType: JsonField<String> = JsonMissing.of()
                private var label: JsonField<String> = JsonMissing.of()
                private var recordType: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(regulatoryRequirement: RegulatoryRequirement) = apply {
                    id = regulatoryRequirement.id
                    acceptanceCriteria = regulatoryRequirement.acceptanceCriteria
                    description = regulatoryRequirement.description
                    example = regulatoryRequirement.example
                    fieldType = regulatoryRequirement.fieldType
                    label = regulatoryRequirement.label
                    recordType = regulatoryRequirement.recordType
                    additionalProperties = regulatoryRequirement.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun acceptanceCriteria(acceptanceCriteria: AcceptanceCriteria) =
                    acceptanceCriteria(JsonField.of(acceptanceCriteria))

                /**
                 * Sets [Builder.acceptanceCriteria] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.acceptanceCriteria] with a well-typed
                 * [AcceptanceCriteria] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun acceptanceCriteria(acceptanceCriteria: JsonField<AcceptanceCriteria>) = apply {
                    this.acceptanceCriteria = acceptanceCriteria
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

                fun example(example: String) = example(JsonField.of(example))

                /**
                 * Sets [Builder.example] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.example] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun example(example: JsonField<String>) = apply { this.example = example }

                fun fieldType(fieldType: String) = fieldType(JsonField.of(fieldType))

                /**
                 * Sets [Builder.fieldType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fieldType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fieldType(fieldType: JsonField<String>) = apply { this.fieldType = fieldType }

                fun label(label: String) = label(JsonField.of(label))

                /**
                 * Sets [Builder.label] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.label] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun label(label: JsonField<String>) = apply { this.label = label }

                fun recordType(recordType: String) = recordType(JsonField.of(recordType))

                /**
                 * Sets [Builder.recordType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordType(recordType: JsonField<String>) = apply {
                    this.recordType = recordType
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
                 * Returns an immutable instance of [RegulatoryRequirement].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RegulatoryRequirement =
                    RegulatoryRequirement(
                        id,
                        acceptanceCriteria,
                        description,
                        example,
                        fieldType,
                        label,
                        recordType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RegulatoryRequirement = apply {
                if (validated) {
                    return@apply
                }

                id()
                acceptanceCriteria().ifPresent { it.validate() }
                description()
                example()
                fieldType()
                label()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (acceptanceCriteria.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (example.asKnown().isPresent) 1 else 0) +
                    (if (fieldType.asKnown().isPresent) 1 else 0) +
                    (if (label.asKnown().isPresent) 1 else 0) +
                    (if (recordType.asKnown().isPresent) 1 else 0)

            class AcceptanceCriteria
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val fieldType: JsonField<String>,
                private val fieldValue: JsonField<String>,
                private val localityLimit: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("field_type")
                    @ExcludeMissing
                    fieldType: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("field_value")
                    @ExcludeMissing
                    fieldValue: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("locality_limit")
                    @ExcludeMissing
                    localityLimit: JsonField<String> = JsonMissing.of(),
                ) : this(fieldType, fieldValue, localityLimit, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun fieldType(): Optional<String> = fieldType.getOptional("field_type")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun fieldValue(): Optional<String> = fieldValue.getOptional("field_value")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun localityLimit(): Optional<String> = localityLimit.getOptional("locality_limit")

                /**
                 * Returns the raw JSON value of [fieldType].
                 *
                 * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("field_type")
                @ExcludeMissing
                fun _fieldType(): JsonField<String> = fieldType

                /**
                 * Returns the raw JSON value of [fieldValue].
                 *
                 * Unlike [fieldValue], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("field_value")
                @ExcludeMissing
                fun _fieldValue(): JsonField<String> = fieldValue

                /**
                 * Returns the raw JSON value of [localityLimit].
                 *
                 * Unlike [localityLimit], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("locality_limit")
                @ExcludeMissing
                fun _localityLimit(): JsonField<String> = localityLimit

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
                     * [AcceptanceCriteria].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AcceptanceCriteria]. */
                class Builder internal constructor() {

                    private var fieldType: JsonField<String> = JsonMissing.of()
                    private var fieldValue: JsonField<String> = JsonMissing.of()
                    private var localityLimit: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(acceptanceCriteria: AcceptanceCriteria) = apply {
                        fieldType = acceptanceCriteria.fieldType
                        fieldValue = acceptanceCriteria.fieldValue
                        localityLimit = acceptanceCriteria.localityLimit
                        additionalProperties =
                            acceptanceCriteria.additionalProperties.toMutableMap()
                    }

                    fun fieldType(fieldType: String) = fieldType(JsonField.of(fieldType))

                    /**
                     * Sets [Builder.fieldType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fieldType] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fieldType(fieldType: JsonField<String>) = apply {
                        this.fieldType = fieldType
                    }

                    fun fieldValue(fieldValue: String) = fieldValue(JsonField.of(fieldValue))

                    /**
                     * Sets [Builder.fieldValue] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fieldValue] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fieldValue(fieldValue: JsonField<String>) = apply {
                        this.fieldValue = fieldValue
                    }

                    fun localityLimit(localityLimit: String) =
                        localityLimit(JsonField.of(localityLimit))

                    /**
                     * Sets [Builder.localityLimit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.localityLimit] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun localityLimit(localityLimit: JsonField<String>) = apply {
                        this.localityLimit = localityLimit
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
                     * Returns an immutable instance of [AcceptanceCriteria].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): AcceptanceCriteria =
                        AcceptanceCriteria(
                            fieldType,
                            fieldValue,
                            localityLimit,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AcceptanceCriteria = apply {
                    if (validated) {
                        return@apply
                    }

                    fieldType()
                    fieldValue()
                    localityLimit()
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
                    (if (fieldType.asKnown().isPresent) 1 else 0) +
                        (if (fieldValue.asKnown().isPresent) 1 else 0) +
                        (if (localityLimit.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AcceptanceCriteria &&
                        fieldType == other.fieldType &&
                        fieldValue == other.fieldValue &&
                        localityLimit == other.localityLimit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(fieldType, fieldValue, localityLimit, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AcceptanceCriteria{fieldType=$fieldType, fieldValue=$fieldValue, localityLimit=$localityLimit, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RegulatoryRequirement &&
                    id == other.id &&
                    acceptanceCriteria == other.acceptanceCriteria &&
                    description == other.description &&
                    example == other.example &&
                    fieldType == other.fieldType &&
                    label == other.label &&
                    recordType == other.recordType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    acceptanceCriteria,
                    description,
                    example,
                    fieldType,
                    label,
                    recordType,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RegulatoryRequirement{id=$id, acceptanceCriteria=$acceptanceCriteria, description=$description, example=$example, fieldType=$fieldType, label=$label, recordType=$recordType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                phoneNumber == other.phoneNumber &&
                phoneNumberType == other.phoneNumberType &&
                recordType == other.recordType &&
                regionInformation == other.regionInformation &&
                regulatoryRequirements == other.regulatoryRequirements &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                phoneNumber,
                phoneNumberType,
                recordType,
                regionInformation,
                regulatoryRequirements,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{phoneNumber=$phoneNumber, phoneNumberType=$phoneNumberType, recordType=$recordType, regionInformation=$regionInformation, regulatoryRequirements=$regulatoryRequirements, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumbersRegulatoryRequirementRetrieveResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumbersRegulatoryRequirementRetrieveResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
