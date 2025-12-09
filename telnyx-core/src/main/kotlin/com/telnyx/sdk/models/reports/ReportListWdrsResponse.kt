// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ReportListWdrsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val cost: JsonField<Cost>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val downlinkData: JsonField<DownlinkData>,
    private val durationSeconds: JsonField<Double>,
    private val imsi: JsonField<String>,
    private val mcc: JsonField<String>,
    private val mnc: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val rate: JsonField<Rate>,
    private val recordType: JsonField<String>,
    private val simCardId: JsonField<String>,
    private val simGroupId: JsonField<String>,
    private val simGroupName: JsonField<String>,
    private val uplinkData: JsonField<UplinkData>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cost") @ExcludeMissing cost: JsonField<Cost> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("downlink_data")
        @ExcludeMissing
        downlinkData: JsonField<DownlinkData> = JsonMissing.of(),
        @JsonProperty("duration_seconds")
        @ExcludeMissing
        durationSeconds: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("imsi") @ExcludeMissing imsi: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mcc") @ExcludeMissing mcc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mnc") @ExcludeMissing mnc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rate") @ExcludeMissing rate: JsonField<Rate> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sim_card_id")
        @ExcludeMissing
        simCardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sim_group_id")
        @ExcludeMissing
        simGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sim_group_name")
        @ExcludeMissing
        simGroupName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uplink_data")
        @ExcludeMissing
        uplinkData: JsonField<UplinkData> = JsonMissing.of(),
    ) : this(
        id,
        cost,
        createdAt,
        downlinkData,
        durationSeconds,
        imsi,
        mcc,
        mnc,
        phoneNumber,
        rate,
        recordType,
        simCardId,
        simGroupId,
        simGroupName,
        uplinkData,
        mutableMapOf(),
    )

    /**
     * WDR id
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cost(): Optional<Cost> = cost.getOptional("cost")

    /**
     * Record created time
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun downlinkData(): Optional<DownlinkData> = downlinkData.getOptional("downlink_data")

    /**
     * Session duration in seconds.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationSeconds(): Optional<Double> = durationSeconds.getOptional("duration_seconds")

    /**
     * International mobile subscriber identity.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun imsi(): Optional<String> = imsi.getOptional("imsi")

    /**
     * Mobile country code.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mcc(): Optional<String> = mcc.getOptional("mcc")

    /**
     * Mobile network code.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mnc(): Optional<String> = mnc.getOptional("mnc")

    /**
     * Phone number
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rate(): Optional<Rate> = rate.getOptional("rate")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * Sim card unique identifier
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun simCardId(): Optional<String> = simCardId.getOptional("sim_card_id")

    /**
     * Sim group unique identifier
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun simGroupId(): Optional<String> = simGroupId.getOptional("sim_group_id")

    /**
     * Defined sim group name
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun simGroupName(): Optional<String> = simGroupName.getOptional("sim_group_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uplinkData(): Optional<UplinkData> = uplinkData.getOptional("uplink_data")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [cost].
     *
     * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Cost> = cost

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [downlinkData].
     *
     * Unlike [downlinkData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("downlink_data")
    @ExcludeMissing
    fun _downlinkData(): JsonField<DownlinkData> = downlinkData

    /**
     * Returns the raw JSON value of [durationSeconds].
     *
     * Unlike [durationSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration_seconds")
    @ExcludeMissing
    fun _durationSeconds(): JsonField<Double> = durationSeconds

    /**
     * Returns the raw JSON value of [imsi].
     *
     * Unlike [imsi], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imsi") @ExcludeMissing fun _imsi(): JsonField<String> = imsi

    /**
     * Returns the raw JSON value of [mcc].
     *
     * Unlike [mcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

    /**
     * Returns the raw JSON value of [mnc].
     *
     * Unlike [mnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mnc") @ExcludeMissing fun _mnc(): JsonField<String> = mnc

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [rate].
     *
     * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<Rate> = rate

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [simCardId].
     *
     * Unlike [simCardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sim_card_id") @ExcludeMissing fun _simCardId(): JsonField<String> = simCardId

    /**
     * Returns the raw JSON value of [simGroupId].
     *
     * Unlike [simGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sim_group_id") @ExcludeMissing fun _simGroupId(): JsonField<String> = simGroupId

    /**
     * Returns the raw JSON value of [simGroupName].
     *
     * Unlike [simGroupName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sim_group_name")
    @ExcludeMissing
    fun _simGroupName(): JsonField<String> = simGroupName

    /**
     * Returns the raw JSON value of [uplinkData].
     *
     * Unlike [uplinkData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uplink_data")
    @ExcludeMissing
    fun _uplinkData(): JsonField<UplinkData> = uplinkData

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

        /** Returns a mutable builder for constructing an instance of [ReportListWdrsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportListWdrsResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var cost: JsonField<Cost> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var downlinkData: JsonField<DownlinkData> = JsonMissing.of()
        private var durationSeconds: JsonField<Double> = JsonMissing.of()
        private var imsi: JsonField<String> = JsonMissing.of()
        private var mcc: JsonField<String> = JsonMissing.of()
        private var mnc: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var rate: JsonField<Rate> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var simCardId: JsonField<String> = JsonMissing.of()
        private var simGroupId: JsonField<String> = JsonMissing.of()
        private var simGroupName: JsonField<String> = JsonMissing.of()
        private var uplinkData: JsonField<UplinkData> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reportListWdrsResponse: ReportListWdrsResponse) = apply {
            id = reportListWdrsResponse.id
            cost = reportListWdrsResponse.cost
            createdAt = reportListWdrsResponse.createdAt
            downlinkData = reportListWdrsResponse.downlinkData
            durationSeconds = reportListWdrsResponse.durationSeconds
            imsi = reportListWdrsResponse.imsi
            mcc = reportListWdrsResponse.mcc
            mnc = reportListWdrsResponse.mnc
            phoneNumber = reportListWdrsResponse.phoneNumber
            rate = reportListWdrsResponse.rate
            recordType = reportListWdrsResponse.recordType
            simCardId = reportListWdrsResponse.simCardId
            simGroupId = reportListWdrsResponse.simGroupId
            simGroupName = reportListWdrsResponse.simGroupName
            uplinkData = reportListWdrsResponse.uplinkData
            additionalProperties = reportListWdrsResponse.additionalProperties.toMutableMap()
        }

        /** WDR id */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun cost(cost: Cost) = cost(JsonField.of(cost))

        /**
         * Sets [Builder.cost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cost] with a well-typed [Cost] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cost(cost: JsonField<Cost>) = apply { this.cost = cost }

        /** Record created time */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun downlinkData(downlinkData: DownlinkData) = downlinkData(JsonField.of(downlinkData))

        /**
         * Sets [Builder.downlinkData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downlinkData] with a well-typed [DownlinkData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun downlinkData(downlinkData: JsonField<DownlinkData>) = apply {
            this.downlinkData = downlinkData
        }

        /** Session duration in seconds. */
        fun durationSeconds(durationSeconds: Double) =
            durationSeconds(JsonField.of(durationSeconds))

        /**
         * Sets [Builder.durationSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationSeconds] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun durationSeconds(durationSeconds: JsonField<Double>) = apply {
            this.durationSeconds = durationSeconds
        }

        /** International mobile subscriber identity. */
        fun imsi(imsi: String) = imsi(JsonField.of(imsi))

        /**
         * Sets [Builder.imsi] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imsi] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imsi(imsi: JsonField<String>) = apply { this.imsi = imsi }

        /** Mobile country code. */
        fun mcc(mcc: String) = mcc(JsonField.of(mcc))

        /**
         * Sets [Builder.mcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

        /** Mobile network code. */
        fun mnc(mnc: String) = mnc(JsonField.of(mnc))

        /**
         * Sets [Builder.mnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mnc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mnc(mnc: JsonField<String>) = apply { this.mnc = mnc }

        /** Phone number */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        fun rate(rate: Rate) = rate(JsonField.of(rate))

        /**
         * Sets [Builder.rate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rate] with a well-typed [Rate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rate(rate: JsonField<Rate>) = apply { this.rate = rate }

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** Sim card unique identifier */
        fun simCardId(simCardId: String) = simCardId(JsonField.of(simCardId))

        /**
         * Sets [Builder.simCardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.simCardId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun simCardId(simCardId: JsonField<String>) = apply { this.simCardId = simCardId }

        /** Sim group unique identifier */
        fun simGroupId(simGroupId: String) = simGroupId(JsonField.of(simGroupId))

        /**
         * Sets [Builder.simGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.simGroupId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun simGroupId(simGroupId: JsonField<String>) = apply { this.simGroupId = simGroupId }

        /** Defined sim group name */
        fun simGroupName(simGroupName: String) = simGroupName(JsonField.of(simGroupName))

        /**
         * Sets [Builder.simGroupName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.simGroupName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun simGroupName(simGroupName: JsonField<String>) = apply {
            this.simGroupName = simGroupName
        }

        fun uplinkData(uplinkData: UplinkData) = uplinkData(JsonField.of(uplinkData))

        /**
         * Sets [Builder.uplinkData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uplinkData] with a well-typed [UplinkData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun uplinkData(uplinkData: JsonField<UplinkData>) = apply { this.uplinkData = uplinkData }

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
         * Returns an immutable instance of [ReportListWdrsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReportListWdrsResponse =
            ReportListWdrsResponse(
                id,
                cost,
                createdAt,
                downlinkData,
                durationSeconds,
                imsi,
                mcc,
                mnc,
                phoneNumber,
                rate,
                recordType,
                simCardId,
                simGroupId,
                simGroupName,
                uplinkData,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ReportListWdrsResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        cost().ifPresent { it.validate() }
        createdAt()
        downlinkData().ifPresent { it.validate() }
        durationSeconds()
        imsi()
        mcc()
        mnc()
        phoneNumber()
        rate().ifPresent { it.validate() }
        recordType()
        simCardId()
        simGroupId()
        simGroupName()
        uplinkData().ifPresent { it.validate() }
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
            (cost.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (downlinkData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (durationSeconds.asKnown().isPresent) 1 else 0) +
            (if (imsi.asKnown().isPresent) 1 else 0) +
            (if (mcc.asKnown().isPresent) 1 else 0) +
            (if (mnc.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (rate.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (simCardId.asKnown().isPresent) 1 else 0) +
            (if (simGroupId.asKnown().isPresent) 1 else 0) +
            (if (simGroupName.asKnown().isPresent) 1 else 0) +
            (uplinkData.asKnown().getOrNull()?.validity() ?: 0)

    class Cost
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<String>,
        private val currency: JsonField<Currency>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
        ) : this(amount, currency, mutableMapOf())

        /**
         * Final cost. Cost is calculated as rate * unit
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<String> = amount.getOptional("amount")

        /**
         * Currency of the rate and cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<Currency> = currency.getOptional("currency")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

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

            /** Returns a mutable builder for constructing an instance of [Cost]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cost]. */
        class Builder internal constructor() {

            private var amount: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cost: Cost) = apply {
                amount = cost.amount
                currency = cost.currency
                additionalProperties = cost.additionalProperties.toMutableMap()
            }

            /** Final cost. Cost is calculated as rate * unit */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** Currency of the rate and cost */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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
             * Returns an immutable instance of [Cost].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Cost = Cost(amount, currency, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Cost = apply {
            if (validated) {
                return@apply
            }

            amount()
            currency().ifPresent { it.validate() }
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
            (if (amount.asKnown().isPresent) 1 else 0) +
                (currency.asKnown().getOrNull()?.validity() ?: 0)

        /** Currency of the rate and cost */
        class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val AUD = of("AUD")

                @JvmField val CAD = of("CAD")

                @JvmField val EUR = of("EUR")

                @JvmField val GBP = of("GBP")

                @JvmField val USD = of("USD")

                @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
            }

            /** An enum containing [Currency]'s known values. */
            enum class Known {
                AUD,
                CAD,
                EUR,
                GBP,
                USD,
            }

            /**
             * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Currency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AUD,
                CAD,
                EUR,
                GBP,
                USD,
                /**
                 * An enum member indicating that [Currency] was instantiated with an unknown value.
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
                    AUD -> Value.AUD
                    CAD -> Value.CAD
                    EUR -> Value.EUR
                    GBP -> Value.GBP
                    USD -> Value.USD
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
                    AUD -> Known.AUD
                    CAD -> Known.CAD
                    EUR -> Known.EUR
                    GBP -> Known.GBP
                    USD -> Known.USD
                    else -> throw TelnyxInvalidDataException("Unknown Currency: $value")
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

            fun validate(): Currency = apply {
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

                return other is Currency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cost &&
                amount == other.amount &&
                currency == other.currency &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, currency, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cost{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
    }

    class DownlinkData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Double>,
        private val unit: JsonField<Unit>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
        ) : this(amount, unit, mutableMapOf())

        /**
         * Downlink data
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<Double> = amount.getOptional("amount")

        /**
         * Transmission unit
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unit(): Optional<Unit> = unit.getOptional("unit")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

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

            /** Returns a mutable builder for constructing an instance of [DownlinkData]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DownlinkData]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double> = JsonMissing.of()
            private var unit: JsonField<Unit> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(downlinkData: DownlinkData) = apply {
                amount = downlinkData.amount
                unit = downlinkData.unit
                additionalProperties = downlinkData.additionalProperties.toMutableMap()
            }

            /** Downlink data */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** Transmission unit */
            fun unit(unit: Unit) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [Unit] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

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
             * Returns an immutable instance of [DownlinkData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DownlinkData =
                DownlinkData(amount, unit, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): DownlinkData = apply {
            if (validated) {
                return@apply
            }

            amount()
            unit().ifPresent { it.validate() }
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
            (if (amount.asKnown().isPresent) 1 else 0) +
                (unit.asKnown().getOrNull()?.validity() ?: 0)

        /** Transmission unit */
        class Unit @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val B = of("B")

                @JvmField val KB = of("KB")

                @JvmField val MB = of("MB")

                @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
            }

            /** An enum containing [Unit]'s known values. */
            enum class Known {
                B,
                KB,
                MB,
            }

            /**
             * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Unit] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                B,
                KB,
                MB,
                /** An enum member indicating that [Unit] was instantiated with an unknown value. */
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
                    B -> Value.B
                    KB -> Value.KB
                    MB -> Value.MB
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
                    B -> Known.B
                    KB -> Known.KB
                    MB -> Known.MB
                    else -> throw TelnyxInvalidDataException("Unknown Unit: $value")
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

            fun validate(): Unit = apply {
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

                return other is Unit && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DownlinkData &&
                amount == other.amount &&
                unit == other.unit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, unit, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DownlinkData{amount=$amount, unit=$unit, additionalProperties=$additionalProperties}"
    }

    class Rate
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<String>,
        private val currency: JsonField<Currency>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
        ) : this(amount, currency, mutableMapOf())

        /**
         * Rate from which cost is calculated
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<String> = amount.getOptional("amount")

        /**
         * Currency of the rate and cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<Currency> = currency.getOptional("currency")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

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

            /** Returns a mutable builder for constructing an instance of [Rate]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rate]. */
        class Builder internal constructor() {

            private var amount: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rate: Rate) = apply {
                amount = rate.amount
                currency = rate.currency
                additionalProperties = rate.additionalProperties.toMutableMap()
            }

            /** Rate from which cost is calculated */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** Currency of the rate and cost */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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
             * Returns an immutable instance of [Rate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Rate = Rate(amount, currency, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Rate = apply {
            if (validated) {
                return@apply
            }

            amount()
            currency().ifPresent { it.validate() }
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
            (if (amount.asKnown().isPresent) 1 else 0) +
                (currency.asKnown().getOrNull()?.validity() ?: 0)

        /** Currency of the rate and cost */
        class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val AUD = of("AUD")

                @JvmField val CAD = of("CAD")

                @JvmField val EUR = of("EUR")

                @JvmField val GBP = of("GBP")

                @JvmField val USD = of("USD")

                @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
            }

            /** An enum containing [Currency]'s known values. */
            enum class Known {
                AUD,
                CAD,
                EUR,
                GBP,
                USD,
            }

            /**
             * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Currency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AUD,
                CAD,
                EUR,
                GBP,
                USD,
                /**
                 * An enum member indicating that [Currency] was instantiated with an unknown value.
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
                    AUD -> Value.AUD
                    CAD -> Value.CAD
                    EUR -> Value.EUR
                    GBP -> Value.GBP
                    USD -> Value.USD
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
                    AUD -> Known.AUD
                    CAD -> Known.CAD
                    EUR -> Known.EUR
                    GBP -> Known.GBP
                    USD -> Known.USD
                    else -> throw TelnyxInvalidDataException("Unknown Currency: $value")
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

            fun validate(): Currency = apply {
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

                return other is Currency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Rate &&
                amount == other.amount &&
                currency == other.currency &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, currency, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rate{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
    }

    class UplinkData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Double>,
        private val unit: JsonField<Unit>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
        ) : this(amount, unit, mutableMapOf())

        /**
         * Uplink data
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<Double> = amount.getOptional("amount")

        /**
         * Transmission unit
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unit(): Optional<Unit> = unit.getOptional("unit")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

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

            /** Returns a mutable builder for constructing an instance of [UplinkData]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UplinkData]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double> = JsonMissing.of()
            private var unit: JsonField<Unit> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(uplinkData: UplinkData) = apply {
                amount = uplinkData.amount
                unit = uplinkData.unit
                additionalProperties = uplinkData.additionalProperties.toMutableMap()
            }

            /** Uplink data */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** Transmission unit */
            fun unit(unit: Unit) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [Unit] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

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
             * Returns an immutable instance of [UplinkData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UplinkData = UplinkData(amount, unit, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): UplinkData = apply {
            if (validated) {
                return@apply
            }

            amount()
            unit().ifPresent { it.validate() }
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
            (if (amount.asKnown().isPresent) 1 else 0) +
                (unit.asKnown().getOrNull()?.validity() ?: 0)

        /** Transmission unit */
        class Unit @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val B = of("B")

                @JvmField val KB = of("KB")

                @JvmField val MB = of("MB")

                @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
            }

            /** An enum containing [Unit]'s known values. */
            enum class Known {
                B,
                KB,
                MB,
            }

            /**
             * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Unit] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                B,
                KB,
                MB,
                /** An enum member indicating that [Unit] was instantiated with an unknown value. */
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
                    B -> Value.B
                    KB -> Value.KB
                    MB -> Value.MB
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
                    B -> Known.B
                    KB -> Known.KB
                    MB -> Known.MB
                    else -> throw TelnyxInvalidDataException("Unknown Unit: $value")
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

            fun validate(): Unit = apply {
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

                return other is Unit && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UplinkData &&
                amount == other.amount &&
                unit == other.unit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, unit, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UplinkData{amount=$amount, unit=$unit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportListWdrsResponse &&
            id == other.id &&
            cost == other.cost &&
            createdAt == other.createdAt &&
            downlinkData == other.downlinkData &&
            durationSeconds == other.durationSeconds &&
            imsi == other.imsi &&
            mcc == other.mcc &&
            mnc == other.mnc &&
            phoneNumber == other.phoneNumber &&
            rate == other.rate &&
            recordType == other.recordType &&
            simCardId == other.simCardId &&
            simGroupId == other.simGroupId &&
            simGroupName == other.simGroupName &&
            uplinkData == other.uplinkData &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            cost,
            createdAt,
            downlinkData,
            durationSeconds,
            imsi,
            mcc,
            mnc,
            phoneNumber,
            rate,
            recordType,
            simCardId,
            simGroupId,
            simGroupName,
            uplinkData,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReportListWdrsResponse{id=$id, cost=$cost, createdAt=$createdAt, downlinkData=$downlinkData, durationSeconds=$durationSeconds, imsi=$imsi, mcc=$mcc, mnc=$mnc, phoneNumber=$phoneNumber, rate=$rate, recordType=$recordType, simCardId=$simCardId, simGroupId=$simGroupId, simGroupName=$simGroupName, uplinkData=$uplinkData, additionalProperties=$additionalProperties}"
}
