// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice

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
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.Filter
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response object for CDR detailed report */
class CdrDetailedReqResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val callTypes: JsonField<List<Int>>,
    private val connections: JsonField<List<Long>>,
    private val createdAt: JsonField<String>,
    private val endTime: JsonField<String>,
    private val filters: JsonField<List<Filter>>,
    private val managedAccounts: JsonField<List<String>>,
    private val recordType: JsonField<String>,
    private val recordTypes: JsonField<List<Int>>,
    private val reportName: JsonField<String>,
    private val reportUrl: JsonField<String>,
    private val retry: JsonField<Int>,
    private val source: JsonField<String>,
    private val startTime: JsonField<String>,
    private val status: JsonField<Int>,
    private val timezone: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_types")
        @ExcludeMissing
        callTypes: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("connections")
        @ExcludeMissing
        connections: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_time") @ExcludeMissing endTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<Filter>> = JsonMissing.of(),
        @JsonProperty("managed_accounts")
        @ExcludeMissing
        managedAccounts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_types")
        @ExcludeMissing
        recordTypes: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("report_name")
        @ExcludeMissing
        reportName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("report_url") @ExcludeMissing reportUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("retry") @ExcludeMissing retry: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_time") @ExcludeMissing startTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        callTypes,
        connections,
        createdAt,
        endTime,
        filters,
        managedAccounts,
        recordType,
        recordTypes,
        reportName,
        reportUrl,
        retry,
        source,
        startTime,
        status,
        timezone,
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
     * List of call types (Inbound = 1, Outbound = 2)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callTypes(): Optional<List<Int>> = callTypes.getOptional("call_types")

    /**
     * List of connections
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connections(): Optional<List<Long>> = connections.getOptional("connections")

    /**
     * Creation date of the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * End time in ISO format
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<String> = endTime.getOptional("end_time")

    /**
     * List of filters
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filters(): Optional<List<Filter>> = filters.getOptional("filters")

    /**
     * List of managed accounts
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managedAccounts(): Optional<List<String>> = managedAccounts.getOptional("managed_accounts")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * List of record types (Complete = 1, Incomplete = 2, Errors = 3)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordTypes(): Optional<List<Int>> = recordTypes.getOptional("record_types")

    /**
     * Name of the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportName(): Optional<String> = reportName.getOptional("report_name")

    /**
     * URL to download the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportUrl(): Optional<String> = reportUrl.getOptional("report_url")

    /**
     * Number of retries
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retry(): Optional<Int> = retry.getOptional("retry")

    /**
     * Source of the report. Valid values: calls (default), call-control, fax-api, webrtc
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<String> = source.getOptional("source")

    /**
     * Start time in ISO format
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<String> = startTime.getOptional("start_time")

    /**
     * Status of the report (Pending = 1, Complete = 2, Failed = 3, Expired = 4)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Int> = status.getOptional("status")

    /**
     * Timezone for the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezone(): Optional<String> = timezone.getOptional("timezone")

    /**
     * Last update date of the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [callTypes].
     *
     * Unlike [callTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_types") @ExcludeMissing fun _callTypes(): JsonField<List<Int>> = callTypes

    /**
     * Returns the raw JSON value of [connections].
     *
     * Unlike [connections], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connections")
    @ExcludeMissing
    fun _connections(): JsonField<List<Long>> = connections

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<String> = endTime

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

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
     * Returns the raw JSON value of [recordTypes].
     *
     * Unlike [recordTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_types")
    @ExcludeMissing
    fun _recordTypes(): JsonField<List<Int>> = recordTypes

    /**
     * Returns the raw JSON value of [reportName].
     *
     * Unlike [reportName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("report_name") @ExcludeMissing fun _reportName(): JsonField<String> = reportName

    /**
     * Returns the raw JSON value of [reportUrl].
     *
     * Unlike [reportUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("report_url") @ExcludeMissing fun _reportUrl(): JsonField<String> = reportUrl

    /**
     * Returns the raw JSON value of [retry].
     *
     * Unlike [retry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retry") @ExcludeMissing fun _retry(): JsonField<Int> = retry

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time") @ExcludeMissing fun _startTime(): JsonField<String> = startTime

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Int> = status

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

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

        /** Returns a mutable builder for constructing an instance of [CdrDetailedReqResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CdrDetailedReqResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var callTypes: JsonField<MutableList<Int>>? = null
        private var connections: JsonField<MutableList<Long>>? = null
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var endTime: JsonField<String> = JsonMissing.of()
        private var filters: JsonField<MutableList<Filter>>? = null
        private var managedAccounts: JsonField<MutableList<String>>? = null
        private var recordType: JsonField<String> = JsonMissing.of()
        private var recordTypes: JsonField<MutableList<Int>>? = null
        private var reportName: JsonField<String> = JsonMissing.of()
        private var reportUrl: JsonField<String> = JsonMissing.of()
        private var retry: JsonField<Int> = JsonMissing.of()
        private var source: JsonField<String> = JsonMissing.of()
        private var startTime: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Int> = JsonMissing.of()
        private var timezone: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cdrDetailedReqResponse: CdrDetailedReqResponse) = apply {
            id = cdrDetailedReqResponse.id
            callTypes = cdrDetailedReqResponse.callTypes.map { it.toMutableList() }
            connections = cdrDetailedReqResponse.connections.map { it.toMutableList() }
            createdAt = cdrDetailedReqResponse.createdAt
            endTime = cdrDetailedReqResponse.endTime
            filters = cdrDetailedReqResponse.filters.map { it.toMutableList() }
            managedAccounts = cdrDetailedReqResponse.managedAccounts.map { it.toMutableList() }
            recordType = cdrDetailedReqResponse.recordType
            recordTypes = cdrDetailedReqResponse.recordTypes.map { it.toMutableList() }
            reportName = cdrDetailedReqResponse.reportName
            reportUrl = cdrDetailedReqResponse.reportUrl
            retry = cdrDetailedReqResponse.retry
            source = cdrDetailedReqResponse.source
            startTime = cdrDetailedReqResponse.startTime
            status = cdrDetailedReqResponse.status
            timezone = cdrDetailedReqResponse.timezone
            updatedAt = cdrDetailedReqResponse.updatedAt
            additionalProperties = cdrDetailedReqResponse.additionalProperties.toMutableMap()
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

        /** List of call types (Inbound = 1, Outbound = 2) */
        fun callTypes(callTypes: List<Int>) = callTypes(JsonField.of(callTypes))

        /**
         * Sets [Builder.callTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callTypes] with a well-typed `List<Int>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callTypes(callTypes: JsonField<List<Int>>) = apply {
            this.callTypes = callTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [callTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCallType(callType: Int) = apply {
            callTypes =
                (callTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("callTypes", it).add(callType)
                }
        }

        /** List of connections */
        fun connections(connections: List<Long>) = connections(JsonField.of(connections))

        /**
         * Sets [Builder.connections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connections] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connections(connections: JsonField<List<Long>>) = apply {
            this.connections = connections.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [connections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addConnection(connection: Long) = apply {
            connections =
                (connections ?: JsonField.of(mutableListOf())).also {
                    checkKnown("connections", it).add(connection)
                }
        }

        /** Creation date of the report */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** End time in ISO format */
        fun endTime(endTime: String) = endTime(JsonField.of(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endTime(endTime: JsonField<String>) = apply { this.endTime = endTime }

        /** List of filters */
        fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed `List<Filter>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filters(filters: JsonField<List<Filter>>) = apply {
            this.filters = filters.map { it.toMutableList() }
        }

        /**
         * Adds a single [Filter] to [filters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: Filter) = apply {
            filters =
                (filters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filters", it).add(filter)
                }
        }

        /** List of managed accounts */
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

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** List of record types (Complete = 1, Incomplete = 2, Errors = 3) */
        fun recordTypes(recordTypes: List<Int>) = recordTypes(JsonField.of(recordTypes))

        /**
         * Sets [Builder.recordTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordTypes] with a well-typed `List<Int>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordTypes(recordTypes: JsonField<List<Int>>) = apply {
            this.recordTypes = recordTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [recordTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecordType(recordType: Int) = apply {
            recordTypes =
                (recordTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recordTypes", it).add(recordType)
                }
        }

        /** Name of the report */
        fun reportName(reportName: String) = reportName(JsonField.of(reportName))

        /**
         * Sets [Builder.reportName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportName(reportName: JsonField<String>) = apply { this.reportName = reportName }

        /** URL to download the report */
        fun reportUrl(reportUrl: String) = reportUrl(JsonField.of(reportUrl))

        /**
         * Sets [Builder.reportUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportUrl(reportUrl: JsonField<String>) = apply { this.reportUrl = reportUrl }

        /** Number of retries */
        fun retry(retry: Int) = retry(JsonField.of(retry))

        /**
         * Sets [Builder.retry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retry] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun retry(retry: JsonField<Int>) = apply { this.retry = retry }

        /** Source of the report. Valid values: calls (default), call-control, fax-api, webrtc */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Start time in ISO format */
        fun startTime(startTime: String) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startTime(startTime: JsonField<String>) = apply { this.startTime = startTime }

        /** Status of the report (Pending = 1, Complete = 2, Failed = 3, Expired = 4) */
        fun status(status: Int) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Int>) = apply { this.status = status }

        /** Timezone for the report */
        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

        /** Last update date of the report */
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
         * Returns an immutable instance of [CdrDetailedReqResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CdrDetailedReqResponse =
            CdrDetailedReqResponse(
                id,
                (callTypes ?: JsonMissing.of()).map { it.toImmutable() },
                (connections ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                endTime,
                (filters ?: JsonMissing.of()).map { it.toImmutable() },
                (managedAccounts ?: JsonMissing.of()).map { it.toImmutable() },
                recordType,
                (recordTypes ?: JsonMissing.of()).map { it.toImmutable() },
                reportName,
                reportUrl,
                retry,
                source,
                startTime,
                status,
                timezone,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CdrDetailedReqResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        callTypes()
        connections()
        createdAt()
        endTime()
        filters().ifPresent { it.forEach { it.validate() } }
        managedAccounts()
        recordType()
        recordTypes()
        reportName()
        reportUrl()
        retry()
        source()
        startTime()
        status()
        timezone()
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
            (callTypes.asKnown().getOrNull()?.size ?: 0) +
            (connections.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (managedAccounts.asKnown().getOrNull()?.size ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (recordTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (reportName.asKnown().isPresent) 1 else 0) +
            (if (reportUrl.asKnown().isPresent) 1 else 0) +
            (if (retry.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (timezone.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CdrDetailedReqResponse &&
            id == other.id &&
            callTypes == other.callTypes &&
            connections == other.connections &&
            createdAt == other.createdAt &&
            endTime == other.endTime &&
            filters == other.filters &&
            managedAccounts == other.managedAccounts &&
            recordType == other.recordType &&
            recordTypes == other.recordTypes &&
            reportName == other.reportName &&
            reportUrl == other.reportUrl &&
            retry == other.retry &&
            source == other.source &&
            startTime == other.startTime &&
            status == other.status &&
            timezone == other.timezone &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            callTypes,
            connections,
            createdAt,
            endTime,
            filters,
            managedAccounts,
            recordType,
            recordTypes,
            reportName,
            reportUrl,
            retry,
            source,
            startTime,
            status,
            timezone,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CdrDetailedReqResponse{id=$id, callTypes=$callTypes, connections=$connections, createdAt=$createdAt, endTime=$endTime, filters=$filters, managedAccounts=$managedAccounts, recordType=$recordType, recordTypes=$recordTypes, reportName=$reportName, reportUrl=$reportUrl, retry=$retry, source=$source, startTime=$startTime, status=$status, timezone=$timezone, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
