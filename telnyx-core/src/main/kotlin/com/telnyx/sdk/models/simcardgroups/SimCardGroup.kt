// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardgroups

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SimCardGroup
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val consumedData: JsonField<ConsumedData>,
    private val createdAt: JsonField<String>,
    private val dataLimit: JsonField<DataLimit>,
    private val isDefault: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val privateWirelessGatewayId: JsonField<String>,
    private val recordType: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val wirelessBlocklistId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("consumed_data")
        @ExcludeMissing
        consumedData: JsonField<ConsumedData> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data_limit")
        @ExcludeMissing
        dataLimit: JsonField<DataLimit> = JsonMissing.of(),
        @JsonProperty("default") @ExcludeMissing isDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("private_wireless_gateway_id")
        @ExcludeMissing
        privateWirelessGatewayId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wireless_blocklist_id")
        @ExcludeMissing
        wirelessBlocklistId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        consumedData,
        createdAt,
        dataLimit,
        isDefault,
        name,
        privateWirelessGatewayId,
        recordType,
        updatedAt,
        wirelessBlocklistId,
        mutableMapOf(),
    )

    /**
     * Identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Represents the amount of data consumed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun consumedData(): Optional<ConsumedData> = consumedData.getOptional("consumed_data")

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * Upper limit on the amount of data the SIM cards, within the group, can use.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataLimit(): Optional<DataLimit> = dataLimit.getOptional("data_limit")

    /**
     * Indicates whether the SIM card group is the users default group.<br/>The default group is
     * created for the user and can not be removed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isDefault(): Optional<Boolean> = isDefault.getOptional("default")

    /**
     * A user friendly name for the SIM card group.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The identification of the related Private Wireless Gateway resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun privateWirelessGatewayId(): Optional<String> =
        privateWirelessGatewayId.getOptional("private_wireless_gateway_id")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * ISO 8601 formatted date-time indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * The identification of the related Wireless Blocklist resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun wirelessBlocklistId(): Optional<String> =
        wirelessBlocklistId.getOptional("wireless_blocklist_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [consumedData].
     *
     * Unlike [consumedData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("consumed_data")
    @ExcludeMissing
    fun _consumedData(): JsonField<ConsumedData> = consumedData

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [dataLimit].
     *
     * Unlike [dataLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_limit") @ExcludeMissing fun _dataLimit(): JsonField<DataLimit> = dataLimit

    /**
     * Returns the raw JSON value of [isDefault].
     *
     * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("default") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [privateWirelessGatewayId].
     *
     * Unlike [privateWirelessGatewayId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("private_wireless_gateway_id")
    @ExcludeMissing
    fun _privateWirelessGatewayId(): JsonField<String> = privateWirelessGatewayId

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [wirelessBlocklistId].
     *
     * Unlike [wirelessBlocklistId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("wireless_blocklist_id")
    @ExcludeMissing
    fun _wirelessBlocklistId(): JsonField<String> = wirelessBlocklistId

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

        /** Returns a mutable builder for constructing an instance of [SimCardGroup]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimCardGroup]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var consumedData: JsonField<ConsumedData> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var dataLimit: JsonField<DataLimit> = JsonMissing.of()
        private var isDefault: JsonField<Boolean> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var privateWirelessGatewayId: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var wirelessBlocklistId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simCardGroup: SimCardGroup) = apply {
            id = simCardGroup.id
            consumedData = simCardGroup.consumedData
            createdAt = simCardGroup.createdAt
            dataLimit = simCardGroup.dataLimit
            isDefault = simCardGroup.isDefault
            name = simCardGroup.name
            privateWirelessGatewayId = simCardGroup.privateWirelessGatewayId
            recordType = simCardGroup.recordType
            updatedAt = simCardGroup.updatedAt
            wirelessBlocklistId = simCardGroup.wirelessBlocklistId
            additionalProperties = simCardGroup.additionalProperties.toMutableMap()
        }

        /** Identifies the resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Represents the amount of data consumed. */
        fun consumedData(consumedData: ConsumedData) = consumedData(JsonField.of(consumedData))

        /**
         * Sets [Builder.consumedData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.consumedData] with a well-typed [ConsumedData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun consumedData(consumedData: JsonField<ConsumedData>) = apply {
            this.consumedData = consumedData
        }

        /** ISO 8601 formatted date-time indicating when the resource was created. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** Upper limit on the amount of data the SIM cards, within the group, can use. */
        fun dataLimit(dataLimit: DataLimit) = dataLimit(JsonField.of(dataLimit))

        /**
         * Sets [Builder.dataLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataLimit] with a well-typed [DataLimit] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataLimit(dataLimit: JsonField<DataLimit>) = apply { this.dataLimit = dataLimit }

        /**
         * Indicates whether the SIM card group is the users default group.<br/>The default group is
         * created for the user and can not be removed.
         */
        fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

        /**
         * Sets [Builder.isDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

        /** A user friendly name for the SIM card group. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The identification of the related Private Wireless Gateway resource. */
        fun privateWirelessGatewayId(privateWirelessGatewayId: String) =
            privateWirelessGatewayId(JsonField.of(privateWirelessGatewayId))

        /**
         * Sets [Builder.privateWirelessGatewayId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privateWirelessGatewayId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun privateWirelessGatewayId(privateWirelessGatewayId: JsonField<String>) = apply {
            this.privateWirelessGatewayId = privateWirelessGatewayId
        }

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

        /** ISO 8601 formatted date-time indicating when the resource was updated. */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        /** The identification of the related Wireless Blocklist resource. */
        fun wirelessBlocklistId(wirelessBlocklistId: String) =
            wirelessBlocklistId(JsonField.of(wirelessBlocklistId))

        /**
         * Sets [Builder.wirelessBlocklistId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wirelessBlocklistId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wirelessBlocklistId(wirelessBlocklistId: JsonField<String>) = apply {
            this.wirelessBlocklistId = wirelessBlocklistId
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
         * Returns an immutable instance of [SimCardGroup].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SimCardGroup =
            SimCardGroup(
                id,
                consumedData,
                createdAt,
                dataLimit,
                isDefault,
                name,
                privateWirelessGatewayId,
                recordType,
                updatedAt,
                wirelessBlocklistId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SimCardGroup = apply {
        if (validated) {
            return@apply
        }

        id()
        consumedData().ifPresent { it.validate() }
        createdAt()
        dataLimit().ifPresent { it.validate() }
        isDefault()
        name()
        privateWirelessGatewayId()
        recordType()
        updatedAt()
        wirelessBlocklistId()
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
            (consumedData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (dataLimit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isDefault.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (privateWirelessGatewayId.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (wirelessBlocklistId.asKnown().isPresent) 1 else 0)

    /** Upper limit on the amount of data the SIM cards, within the group, can use. */
    class DataLimit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<String>,
        private val unit: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
        ) : this(amount, unit, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<String> = amount.getOptional("amount")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unit(): Optional<String> = unit.getOptional("unit")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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

            /** Returns a mutable builder for constructing an instance of [DataLimit]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DataLimit]. */
        class Builder internal constructor() {

            private var amount: JsonField<String> = JsonMissing.of()
            private var unit: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dataLimit: DataLimit) = apply {
                amount = dataLimit.amount
                unit = dataLimit.unit
                additionalProperties = dataLimit.additionalProperties.toMutableMap()
            }

            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            fun unit(unit: String) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
             * Returns an immutable instance of [DataLimit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DataLimit = DataLimit(amount, unit, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): DataLimit = apply {
            if (validated) {
                return@apply
            }

            amount()
            unit()
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
            (if (amount.asKnown().isPresent) 1 else 0) + (if (unit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataLimit &&
                amount == other.amount &&
                unit == other.unit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, unit, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DataLimit{amount=$amount, unit=$unit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimCardGroup &&
            id == other.id &&
            consumedData == other.consumedData &&
            createdAt == other.createdAt &&
            dataLimit == other.dataLimit &&
            isDefault == other.isDefault &&
            name == other.name &&
            privateWirelessGatewayId == other.privateWirelessGatewayId &&
            recordType == other.recordType &&
            updatedAt == other.updatedAt &&
            wirelessBlocklistId == other.wirelessBlocklistId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            consumedData,
            createdAt,
            dataLimit,
            isDefault,
            name,
            privateWirelessGatewayId,
            recordType,
            updatedAt,
            wirelessBlocklistId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimCardGroup{id=$id, consumedData=$consumedData, createdAt=$createdAt, dataLimit=$dataLimit, isDefault=$isDefault, name=$name, privateWirelessGatewayId=$privateWirelessGatewayId, recordType=$recordType, updatedAt=$updatedAt, wirelessBlocklistId=$wirelessBlocklistId, additionalProperties=$additionalProperties}"
}
