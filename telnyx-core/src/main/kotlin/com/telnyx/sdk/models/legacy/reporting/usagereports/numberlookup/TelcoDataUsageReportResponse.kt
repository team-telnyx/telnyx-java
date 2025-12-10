// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Telco data usage report response */
class TelcoDataUsageReportResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val aggregationType: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val endDate: JsonField<LocalDate>,
    private val managedAccounts: JsonField<List<String>>,
    private val recordType: JsonField<String>,
    private val reportUrl: JsonField<String>,
    private val result: JsonField<List<TelcoDataUsageRecord>>,
    private val startDate: JsonField<LocalDate>,
    private val status: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aggregation_type")
        @ExcludeMissing
        aggregationType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_date") @ExcludeMissing endDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("managed_accounts")
        @ExcludeMissing
        managedAccounts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("report_url") @ExcludeMissing reportUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        result: JsonField<List<TelcoDataUsageRecord>> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        aggregationType,
        createdAt,
        endDate,
        managedAccounts,
        recordType,
        reportUrl,
        result,
        startDate,
        status,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Type of aggregation used in the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregationType(): Optional<String> = aggregationType.getOptional("aggregation_type")

    /**
     * Timestamp when the report was created
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * End date of the report period
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<LocalDate> = endDate.getOptional("end_date")

    /**
     * List of managed account IDs included in the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managedAccounts(): Optional<List<String>> = managedAccounts.getOptional("managed_accounts")

    /**
     * Record type identifier
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * URL to download the complete report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportUrl(): Optional<String> = reportUrl.getOptional("report_url")

    /**
     * Array of usage records
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<List<TelcoDataUsageRecord>> = result.getOptional("result")

    /**
     * Start date of the report period
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): Optional<LocalDate> = startDate.getOptional("start_date")

    /**
     * Current status of the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Timestamp when the report was last updated
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
     * Returns the raw JSON value of [aggregationType].
     *
     * Unlike [aggregationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aggregation_type")
    @ExcludeMissing
    fun _aggregationType(): JsonField<String> = aggregationType

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

    /**
     * Returns the raw JSON value of [managedAccounts].
     *
     * Unlike [managedAccounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("managed_accounts")
    @ExcludeMissing
    fun _managedAccounts(): JsonField<List<String>> = managedAccounts

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [reportUrl].
     *
     * Unlike [reportUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("report_url") @ExcludeMissing fun _reportUrl(): JsonField<String> = reportUrl

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result")
    @ExcludeMissing
    fun _result(): JsonField<List<TelcoDataUsageRecord>> = result

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date") @ExcludeMissing fun _startDate(): JsonField<LocalDate> = startDate

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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
         * Returns a mutable builder for constructing an instance of [TelcoDataUsageReportResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TelcoDataUsageReportResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var aggregationType: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<LocalDate> = JsonMissing.of()
        private var managedAccounts: JsonField<MutableList<String>>? = null
        private var recordType: JsonField<String> = JsonMissing.of()
        private var reportUrl: JsonField<String> = JsonMissing.of()
        private var result: JsonField<MutableList<TelcoDataUsageRecord>>? = null
        private var startDate: JsonField<LocalDate> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(telcoDataUsageReportResponse: TelcoDataUsageReportResponse) = apply {
            id = telcoDataUsageReportResponse.id
            aggregationType = telcoDataUsageReportResponse.aggregationType
            createdAt = telcoDataUsageReportResponse.createdAt
            endDate = telcoDataUsageReportResponse.endDate
            managedAccounts =
                telcoDataUsageReportResponse.managedAccounts.map { it.toMutableList() }
            recordType = telcoDataUsageReportResponse.recordType
            reportUrl = telcoDataUsageReportResponse.reportUrl
            result = telcoDataUsageReportResponse.result.map { it.toMutableList() }
            startDate = telcoDataUsageReportResponse.startDate
            status = telcoDataUsageReportResponse.status
            updatedAt = telcoDataUsageReportResponse.updatedAt
            additionalProperties = telcoDataUsageReportResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the report */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Type of aggregation used in the report */
        fun aggregationType(aggregationType: String) =
            aggregationType(JsonField.of(aggregationType))

        /**
         * Sets [Builder.aggregationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregationType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun aggregationType(aggregationType: JsonField<String>) = apply {
            this.aggregationType = aggregationType
        }

        /** Timestamp when the report was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** End date of the report period */
        fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

        /** List of managed account IDs included in the report */
        fun managedAccounts(managedAccounts: List<String>) =
            managedAccounts(JsonField.of(managedAccounts))

        /**
         * Sets [Builder.managedAccounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.managedAccounts] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun managedAccounts(managedAccounts: JsonField<List<String>>) = apply {
            this.managedAccounts = managedAccounts.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [managedAccounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addManagedAccount(managedAccount: String) = apply {
            managedAccounts =
                (managedAccounts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("managedAccounts", it).add(managedAccount)
                }
        }

        /** Record type identifier */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** URL to download the complete report */
        fun reportUrl(reportUrl: String) = reportUrl(JsonField.of(reportUrl))

        /**
         * Sets [Builder.reportUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportUrl(reportUrl: JsonField<String>) = apply { this.reportUrl = reportUrl }

        /** Array of usage records */
        fun result(result: List<TelcoDataUsageRecord>) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed `List<TelcoDataUsageRecord>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun result(result: JsonField<List<TelcoDataUsageRecord>>) = apply {
            this.result = result.map { it.toMutableList() }
        }

        /**
         * Adds a single [TelcoDataUsageRecord] to [Builder.result].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: TelcoDataUsageRecord) = apply {
            this.result =
                (this.result ?: JsonField.of(mutableListOf())).also {
                    checkKnown("result", it).add(result)
                }
        }

        /** Start date of the report period */
        fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

        /** Current status of the report */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** Timestamp when the report was last updated */
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
         * Returns an immutable instance of [TelcoDataUsageReportResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TelcoDataUsageReportResponse =
            TelcoDataUsageReportResponse(
                id,
                aggregationType,
                createdAt,
                endDate,
                (managedAccounts ?: JsonMissing.of()).map { it.toImmutable() },
                recordType,
                reportUrl,
                (result ?: JsonMissing.of()).map { it.toImmutable() },
                startDate,
                status,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TelcoDataUsageReportResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        aggregationType()
        createdAt()
        endDate()
        managedAccounts()
        recordType()
        reportUrl()
        result().ifPresent { it.forEach { it.validate() } }
        startDate()
        status()
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
            (if (aggregationType.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (managedAccounts.asKnown().getOrNull()?.size ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (reportUrl.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (startDate.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TelcoDataUsageReportResponse &&
            id == other.id &&
            aggregationType == other.aggregationType &&
            createdAt == other.createdAt &&
            endDate == other.endDate &&
            managedAccounts == other.managedAccounts &&
            recordType == other.recordType &&
            reportUrl == other.reportUrl &&
            result == other.result &&
            startDate == other.startDate &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            aggregationType,
            createdAt,
            endDate,
            managedAccounts,
            recordType,
            reportUrl,
            result,
            startDate,
            status,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TelcoDataUsageReportResponse{id=$id, aggregationType=$aggregationType, createdAt=$createdAt, endDate=$endDate, managedAccounts=$managedAccounts, recordType=$recordType, reportUrl=$reportUrl, result=$result, startDate=$startDate, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
