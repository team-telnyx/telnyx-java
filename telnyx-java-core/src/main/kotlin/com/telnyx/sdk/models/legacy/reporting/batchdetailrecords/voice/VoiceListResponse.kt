// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VoiceListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<Meta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
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
    fun meta(): Optional<Meta> = meta.getOptional("meta")

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
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

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

        /** Returns a mutable builder for constructing an instance of [VoiceListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoiceListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(voiceListResponse: VoiceListResponse) = apply {
            data = voiceListResponse.data.map { it.toMutableList() }
            meta = voiceListResponse.meta
            additionalProperties = voiceListResponse.additionalProperties.toMutableMap()
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

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [VoiceListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VoiceListResponse =
            VoiceListResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VoiceListResponse = apply {
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

    /** Response object for CDR detailed report */
    class Data
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
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("report_url")
            @ExcludeMissing
            reportUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("retry") @ExcludeMissing retry: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("timezone")
            @ExcludeMissing
            timezone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<String> = JsonMissing.of(),
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
        fun managedAccounts(): Optional<List<String>> =
            managedAccounts.getOptional("managed_accounts")

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
        @JsonProperty("call_types")
        @ExcludeMissing
        fun _callTypes(): JsonField<List<Int>> = callTypes

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
         * Unlike [managedAccounts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("managed_accounts")
        @ExcludeMissing
        fun _managedAccounts(): JsonField<List<String>> = managedAccounts

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

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
        @JsonProperty("report_name")
        @ExcludeMissing
        fun _reportName(): JsonField<String> = reportName

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
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
            internal fun from(data: Data) = apply {
                id = data.id
                callTypes = data.callTypes.map { it.toMutableList() }
                connections = data.connections.map { it.toMutableList() }
                createdAt = data.createdAt
                endTime = data.endTime
                filters = data.filters.map { it.toMutableList() }
                managedAccounts = data.managedAccounts.map { it.toMutableList() }
                recordType = data.recordType
                recordTypes = data.recordTypes.map { it.toMutableList() }
                reportName = data.reportName
                reportUrl = data.reportUrl
                retry = data.retry
                source = data.source
                startTime = data.startTime
                status = data.status
                timezone = data.timezone
                updatedAt = data.updatedAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the report */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** List of call types (Inbound = 1, Outbound = 2) */
            fun callTypes(callTypes: List<Int>) = callTypes(JsonField.of(callTypes))

            /**
             * Sets [Builder.callTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callTypes] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            /** End time in ISO format */
            fun endTime(endTime: String) = endTime(JsonField.of(endTime))

            /**
             * Sets [Builder.endTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endTime(endTime: JsonField<String>) = apply { this.endTime = endTime }

            /** List of filters */
            fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.managedAccounts] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.reportName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reportName(reportName: JsonField<String>) = apply { this.reportName = reportName }

            /** URL to download the report */
            fun reportUrl(reportUrl: String) = reportUrl(JsonField.of(reportUrl))

            /**
             * Sets [Builder.reportUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reportUrl(reportUrl: JsonField<String>) = apply { this.reportUrl = reportUrl }

            /** Number of retries */
            fun retry(retry: Int) = retry(JsonField.of(retry))

            /**
             * Sets [Builder.retry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retry] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun retry(retry: JsonField<Int>) = apply { this.retry = retry }

            /**
             * Source of the report. Valid values: calls (default), call-control, fax-api, webrtc
             */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Start time in ISO format */
            fun startTime(startTime: String) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<String>) = apply { this.startTime = startTime }

            /** Status of the report (Pending = 1, Complete = 2, Failed = 3, Expired = 4) */
            fun status(status: Int) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun status(status: JsonField<Int>) = apply { this.status = status }

            /** Timezone for the report */
            fun timezone(timezone: String) = timezone(JsonField.of(timezone))

            /**
             * Sets [Builder.timezone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timezone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

            /** Last update date of the report */
            fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
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

        fun validate(): Data = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

        /**
         * Query filter criteria. Note: The first filter object must specify filter_type as 'and'.
         * You cannot follow an 'or' with another 'and'.
         */
        class Filter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val billingGroup: JsonField<String>,
            private val cld: JsonField<String>,
            private val cldFilter: JsonField<CldFilter>,
            private val cli: JsonField<String>,
            private val cliFilter: JsonField<CliFilter>,
            private val filterType: JsonField<FilterType>,
            private val tagsList: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("billing_group")
                @ExcludeMissing
                billingGroup: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cld") @ExcludeMissing cld: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cld_filter")
                @ExcludeMissing
                cldFilter: JsonField<CldFilter> = JsonMissing.of(),
                @JsonProperty("cli") @ExcludeMissing cli: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cli_filter")
                @ExcludeMissing
                cliFilter: JsonField<CliFilter> = JsonMissing.of(),
                @JsonProperty("filter_type")
                @ExcludeMissing
                filterType: JsonField<FilterType> = JsonMissing.of(),
                @JsonProperty("tags_list")
                @ExcludeMissing
                tagsList: JsonField<String> = JsonMissing.of(),
            ) : this(
                billingGroup,
                cld,
                cldFilter,
                cli,
                cliFilter,
                filterType,
                tagsList,
                mutableMapOf(),
            )

            /**
             * Billing group UUID to filter by
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billingGroup(): Optional<String> = billingGroup.getOptional("billing_group")

            /**
             * Called line identification (destination number)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cld(): Optional<String> = cld.getOptional("cld")

            /**
             * Filter type for CLD matching
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cldFilter(): Optional<CldFilter> = cldFilter.getOptional("cld_filter")

            /**
             * Calling line identification (caller ID)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cli(): Optional<String> = cli.getOptional("cli")

            /**
             * Filter type for CLI matching
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cliFilter(): Optional<CliFilter> = cliFilter.getOptional("cli_filter")

            /**
             * Logical operator for combining filters
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun filterType(): Optional<FilterType> = filterType.getOptional("filter_type")

            /**
             * Tag name to filter by
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tagsList(): Optional<String> = tagsList.getOptional("tags_list")

            /**
             * Returns the raw JSON value of [billingGroup].
             *
             * Unlike [billingGroup], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("billing_group")
            @ExcludeMissing
            fun _billingGroup(): JsonField<String> = billingGroup

            /**
             * Returns the raw JSON value of [cld].
             *
             * Unlike [cld], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cld") @ExcludeMissing fun _cld(): JsonField<String> = cld

            /**
             * Returns the raw JSON value of [cldFilter].
             *
             * Unlike [cldFilter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cld_filter")
            @ExcludeMissing
            fun _cldFilter(): JsonField<CldFilter> = cldFilter

            /**
             * Returns the raw JSON value of [cli].
             *
             * Unlike [cli], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cli") @ExcludeMissing fun _cli(): JsonField<String> = cli

            /**
             * Returns the raw JSON value of [cliFilter].
             *
             * Unlike [cliFilter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cli_filter")
            @ExcludeMissing
            fun _cliFilter(): JsonField<CliFilter> = cliFilter

            /**
             * Returns the raw JSON value of [filterType].
             *
             * Unlike [filterType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("filter_type")
            @ExcludeMissing
            fun _filterType(): JsonField<FilterType> = filterType

            /**
             * Returns the raw JSON value of [tagsList].
             *
             * Unlike [tagsList], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tags_list") @ExcludeMissing fun _tagsList(): JsonField<String> = tagsList

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

                /** Returns a mutable builder for constructing an instance of [Filter]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Filter]. */
            class Builder internal constructor() {

                private var billingGroup: JsonField<String> = JsonMissing.of()
                private var cld: JsonField<String> = JsonMissing.of()
                private var cldFilter: JsonField<CldFilter> = JsonMissing.of()
                private var cli: JsonField<String> = JsonMissing.of()
                private var cliFilter: JsonField<CliFilter> = JsonMissing.of()
                private var filterType: JsonField<FilterType> = JsonMissing.of()
                private var tagsList: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(filter: Filter) = apply {
                    billingGroup = filter.billingGroup
                    cld = filter.cld
                    cldFilter = filter.cldFilter
                    cli = filter.cli
                    cliFilter = filter.cliFilter
                    filterType = filter.filterType
                    tagsList = filter.tagsList
                    additionalProperties = filter.additionalProperties.toMutableMap()
                }

                /** Billing group UUID to filter by */
                fun billingGroup(billingGroup: String) = billingGroup(JsonField.of(billingGroup))

                /**
                 * Sets [Builder.billingGroup] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingGroup] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun billingGroup(billingGroup: JsonField<String>) = apply {
                    this.billingGroup = billingGroup
                }

                /** Called line identification (destination number) */
                fun cld(cld: String) = cld(JsonField.of(cld))

                /**
                 * Sets [Builder.cld] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cld] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cld(cld: JsonField<String>) = apply { this.cld = cld }

                /** Filter type for CLD matching */
                fun cldFilter(cldFilter: CldFilter) = cldFilter(JsonField.of(cldFilter))

                /**
                 * Sets [Builder.cldFilter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cldFilter] with a well-typed [CldFilter] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cldFilter(cldFilter: JsonField<CldFilter>) = apply {
                    this.cldFilter = cldFilter
                }

                /** Calling line identification (caller ID) */
                fun cli(cli: String) = cli(JsonField.of(cli))

                /**
                 * Sets [Builder.cli] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cli] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cli(cli: JsonField<String>) = apply { this.cli = cli }

                /** Filter type for CLI matching */
                fun cliFilter(cliFilter: CliFilter) = cliFilter(JsonField.of(cliFilter))

                /**
                 * Sets [Builder.cliFilter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cliFilter] with a well-typed [CliFilter] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cliFilter(cliFilter: JsonField<CliFilter>) = apply {
                    this.cliFilter = cliFilter
                }

                /** Logical operator for combining filters */
                fun filterType(filterType: FilterType) = filterType(JsonField.of(filterType))

                /**
                 * Sets [Builder.filterType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filterType] with a well-typed [FilterType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filterType(filterType: JsonField<FilterType>) = apply {
                    this.filterType = filterType
                }

                /** Tag name to filter by */
                fun tagsList(tagsList: String) = tagsList(JsonField.of(tagsList))

                /**
                 * Sets [Builder.tagsList] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tagsList] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tagsList(tagsList: JsonField<String>) = apply { this.tagsList = tagsList }

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
                 * Returns an immutable instance of [Filter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Filter =
                    Filter(
                        billingGroup,
                        cld,
                        cldFilter,
                        cli,
                        cliFilter,
                        filterType,
                        tagsList,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Filter = apply {
                if (validated) {
                    return@apply
                }

                billingGroup()
                cld()
                cldFilter().ifPresent { it.validate() }
                cli()
                cliFilter().ifPresent { it.validate() }
                filterType().ifPresent { it.validate() }
                tagsList()
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
                (if (billingGroup.asKnown().isPresent) 1 else 0) +
                    (if (cld.asKnown().isPresent) 1 else 0) +
                    (cldFilter.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (cli.asKnown().isPresent) 1 else 0) +
                    (cliFilter.asKnown().getOrNull()?.validity() ?: 0) +
                    (filterType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (tagsList.asKnown().isPresent) 1 else 0)

            /** Filter type for CLD matching */
            class CldFilter @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val CONTAINS = of("contains")

                    @JvmField val STARTS_WITH = of("starts_with")

                    @JvmField val ENDS_WITH = of("ends_with")

                    @JvmStatic fun of(value: String) = CldFilter(JsonField.of(value))
                }

                /** An enum containing [CldFilter]'s known values. */
                enum class Known {
                    CONTAINS,
                    STARTS_WITH,
                    ENDS_WITH,
                }

                /**
                 * An enum containing [CldFilter]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [CldFilter] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONTAINS,
                    STARTS_WITH,
                    ENDS_WITH,
                    /**
                     * An enum member indicating that [CldFilter] was instantiated with an unknown
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
                        CONTAINS -> Value.CONTAINS
                        STARTS_WITH -> Value.STARTS_WITH
                        ENDS_WITH -> Value.ENDS_WITH
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
                        CONTAINS -> Known.CONTAINS
                        STARTS_WITH -> Known.STARTS_WITH
                        ENDS_WITH -> Known.ENDS_WITH
                        else -> throw TelnyxInvalidDataException("Unknown CldFilter: $value")
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

                fun validate(): CldFilter = apply {
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

                    return other is CldFilter && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Filter type for CLI matching */
            class CliFilter @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val CONTAINS = of("contains")

                    @JvmField val STARTS_WITH = of("starts_with")

                    @JvmField val ENDS_WITH = of("ends_with")

                    @JvmStatic fun of(value: String) = CliFilter(JsonField.of(value))
                }

                /** An enum containing [CliFilter]'s known values. */
                enum class Known {
                    CONTAINS,
                    STARTS_WITH,
                    ENDS_WITH,
                }

                /**
                 * An enum containing [CliFilter]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [CliFilter] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONTAINS,
                    STARTS_WITH,
                    ENDS_WITH,
                    /**
                     * An enum member indicating that [CliFilter] was instantiated with an unknown
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
                        CONTAINS -> Value.CONTAINS
                        STARTS_WITH -> Value.STARTS_WITH
                        ENDS_WITH -> Value.ENDS_WITH
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
                        CONTAINS -> Known.CONTAINS
                        STARTS_WITH -> Known.STARTS_WITH
                        ENDS_WITH -> Known.ENDS_WITH
                        else -> throw TelnyxInvalidDataException("Unknown CliFilter: $value")
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

                fun validate(): CliFilter = apply {
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

                    return other is CliFilter && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Logical operator for combining filters */
            class FilterType
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

                    @JvmField val AND = of("and")

                    @JvmField val OR = of("or")

                    @JvmStatic fun of(value: String) = FilterType(JsonField.of(value))
                }

                /** An enum containing [FilterType]'s known values. */
                enum class Known {
                    AND,
                    OR,
                }

                /**
                 * An enum containing [FilterType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [FilterType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AND,
                    OR,
                    /**
                     * An enum member indicating that [FilterType] was instantiated with an unknown
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
                        AND -> Value.AND
                        OR -> Value.OR
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
                        AND -> Known.AND
                        OR -> Known.OR
                        else -> throw TelnyxInvalidDataException("Unknown FilterType: $value")
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

                fun validate(): FilterType = apply {
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

                    return other is FilterType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Filter &&
                    billingGroup == other.billingGroup &&
                    cld == other.cld &&
                    cldFilter == other.cldFilter &&
                    cli == other.cli &&
                    cliFilter == other.cliFilter &&
                    filterType == other.filterType &&
                    tagsList == other.tagsList &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    billingGroup,
                    cld,
                    cldFilter,
                    cli,
                    cliFilter,
                    filterType,
                    tagsList,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Filter{billingGroup=$billingGroup, cld=$cld, cldFilter=$cldFilter, cli=$cli, cliFilter=$cliFilter, filterType=$filterType, tagsList=$tagsList, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
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
            "Data{id=$id, callTypes=$callTypes, connections=$connections, createdAt=$createdAt, endTime=$endTime, filters=$filters, managedAccounts=$managedAccounts, recordType=$recordType, recordTypes=$recordTypes, reportName=$reportName, reportUrl=$reportUrl, retry=$retry, source=$source, startTime=$startTime, status=$status, timezone=$timezone, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pageNumber: JsonField<Int>,
        private val pageSize: JsonField<Int>,
        private val totalPages: JsonField<Int>,
        private val totalResults: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("page_number")
            @ExcludeMissing
            pageNumber: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("total_pages")
            @ExcludeMissing
            totalPages: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("total_results")
            @ExcludeMissing
            totalResults: JsonField<Int> = JsonMissing.of(),
        ) : this(pageNumber, pageSize, totalPages, totalResults, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageNumber(): Optional<Int> = pageNumber.getOptional("page_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageSize(): Optional<Int> = pageSize.getOptional("page_size")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalPages(): Optional<Int> = totalPages.getOptional("total_pages")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalResults(): Optional<Int> = totalResults.getOptional("total_results")

        /**
         * Returns the raw JSON value of [pageNumber].
         *
         * Unlike [pageNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_number") @ExcludeMissing fun _pageNumber(): JsonField<Int> = pageNumber

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Int> = pageSize

        /**
         * Returns the raw JSON value of [totalPages].
         *
         * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Int> = totalPages

        /**
         * Returns the raw JSON value of [totalResults].
         *
         * Unlike [totalResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_results")
        @ExcludeMissing
        fun _totalResults(): JsonField<Int> = totalResults

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

            /** Returns a mutable builder for constructing an instance of [Meta]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var pageNumber: JsonField<Int> = JsonMissing.of()
            private var pageSize: JsonField<Int> = JsonMissing.of()
            private var totalPages: JsonField<Int> = JsonMissing.of()
            private var totalResults: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                pageNumber = meta.pageNumber
                pageSize = meta.pageSize
                totalPages = meta.totalPages
                totalResults = meta.totalResults
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun pageNumber(pageNumber: Int) = pageNumber(JsonField.of(pageNumber))

            /**
             * Sets [Builder.pageNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageNumber] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageNumber(pageNumber: JsonField<Int>) = apply { this.pageNumber = pageNumber }

            fun pageSize(pageSize: Int) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Int>) = apply { this.pageSize = pageSize }

            fun totalPages(totalPages: Int) = totalPages(JsonField.of(totalPages))

            /**
             * Sets [Builder.totalPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalPages] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalPages(totalPages: JsonField<Int>) = apply { this.totalPages = totalPages }

            fun totalResults(totalResults: Int) = totalResults(JsonField.of(totalResults))

            /**
             * Sets [Builder.totalResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalResults] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalResults(totalResults: JsonField<Int>) = apply {
                this.totalResults = totalResults
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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Meta =
                Meta(
                    pageNumber,
                    pageSize,
                    totalPages,
                    totalResults,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            pageNumber()
            pageSize()
            totalPages()
            totalResults()
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
            (if (pageNumber.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (totalPages.asKnown().isPresent) 1 else 0) +
                (if (totalResults.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                pageNumber == other.pageNumber &&
                pageSize == other.pageSize &&
                totalPages == other.totalPages &&
                totalResults == other.totalResults &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(pageNumber, pageSize, totalPages, totalResults, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{pageNumber=$pageNumber, pageSize=$pageSize, totalPages=$totalPages, totalResults=$totalResults, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoiceListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VoiceListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
