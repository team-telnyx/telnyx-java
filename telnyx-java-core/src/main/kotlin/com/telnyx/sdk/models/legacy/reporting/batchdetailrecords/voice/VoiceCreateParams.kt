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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates a new CDR report request with the specified filters */
class VoiceCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * End time in ISO format
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endTime(): OffsetDateTime = body.endTime()

    /**
     * Start time in ISO format
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = body.startTime()

    /**
     * List of call types to filter by (Inbound = 1, Outbound = 2)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callTypes(): Optional<List<Int>> = body.callTypes()

    /**
     * List of connections to filter by
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connections(): Optional<List<Long>> = body.connections()

    /**
     * Set of fields to include in the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fields(): Optional<List<String>> = body.fields()

    /**
     * List of filters to apply
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filters(): Optional<List<Filter>> = body.filters()

    /**
     * Whether to include all metadata
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeAllMetadata(): Optional<Boolean> = body.includeAllMetadata()

    /**
     * List of managed accounts to include
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managedAccounts(): Optional<List<String>> = body.managedAccounts()

    /**
     * List of record types to filter by (Complete = 1, Incomplete = 2, Errors = 3)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordTypes(): Optional<List<Int>> = body.recordTypes()

    /**
     * Name of the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportName(): Optional<String> = body.reportName()

    /**
     * Whether to select all managed accounts
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun selectAllManagedAccounts(): Optional<Boolean> = body.selectAllManagedAccounts()

    /**
     * Source of the report. Valid values: calls (default), call-control, fax-api, webrtc
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<String> = body.source()

    /**
     * Timezone for the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezone(): Optional<String> = body.timezone()

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endTime(): JsonField<OffsetDateTime> = body._endTime()

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startTime(): JsonField<OffsetDateTime> = body._startTime()

    /**
     * Returns the raw JSON value of [callTypes].
     *
     * Unlike [callTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callTypes(): JsonField<List<Int>> = body._callTypes()

    /**
     * Returns the raw JSON value of [connections].
     *
     * Unlike [connections], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _connections(): JsonField<List<Long>> = body._connections()

    /**
     * Returns the raw JSON value of [fields].
     *
     * Unlike [fields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fields(): JsonField<List<String>> = body._fields()

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filters(): JsonField<List<Filter>> = body._filters()

    /**
     * Returns the raw JSON value of [includeAllMetadata].
     *
     * Unlike [includeAllMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _includeAllMetadata(): JsonField<Boolean> = body._includeAllMetadata()

    /**
     * Returns the raw JSON value of [managedAccounts].
     *
     * Unlike [managedAccounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _managedAccounts(): JsonField<List<String>> = body._managedAccounts()

    /**
     * Returns the raw JSON value of [recordTypes].
     *
     * Unlike [recordTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordTypes(): JsonField<List<Int>> = body._recordTypes()

    /**
     * Returns the raw JSON value of [reportName].
     *
     * Unlike [reportName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reportName(): JsonField<String> = body._reportName()

    /**
     * Returns the raw JSON value of [selectAllManagedAccounts].
     *
     * Unlike [selectAllManagedAccounts], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _selectAllManagedAccounts(): JsonField<Boolean> = body._selectAllManagedAccounts()

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _source(): JsonField<String> = body._source()

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timezone(): JsonField<String> = body._timezone()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VoiceCreateParams].
         *
         * The following fields are required:
         * ```java
         * .endTime()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoiceCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(voiceCreateParams: VoiceCreateParams) = apply {
            body = voiceCreateParams.body.toBuilder()
            additionalHeaders = voiceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = voiceCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [endTime]
         * - [startTime]
         * - [callTypes]
         * - [connections]
         * - [fields]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** End time in ISO format */
        fun endTime(endTime: OffsetDateTime) = apply { body.endTime(endTime) }

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { body.endTime(endTime) }

        /** Start time in ISO format */
        fun startTime(startTime: OffsetDateTime) = apply { body.startTime(startTime) }

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { body.startTime(startTime) }

        /** List of call types to filter by (Inbound = 1, Outbound = 2) */
        fun callTypes(callTypes: List<Int>) = apply { body.callTypes(callTypes) }

        /**
         * Sets [Builder.callTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callTypes] with a well-typed `List<Int>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callTypes(callTypes: JsonField<List<Int>>) = apply { body.callTypes(callTypes) }

        /**
         * Adds a single [Int] to [callTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCallType(callType: Int) = apply { body.addCallType(callType) }

        /** List of connections to filter by */
        fun connections(connections: List<Long>) = apply { body.connections(connections) }

        /**
         * Sets [Builder.connections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connections] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connections(connections: JsonField<List<Long>>) = apply {
            body.connections(connections)
        }

        /**
         * Adds a single [Long] to [connections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addConnection(connection: Long) = apply { body.addConnection(connection) }

        /** Set of fields to include in the report */
        fun fields(fields: List<String>) = apply { body.fields(fields) }

        /**
         * Sets [Builder.fields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fields] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fields(fields: JsonField<List<String>>) = apply { body.fields(fields) }

        /**
         * Adds a single [String] to [fields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addField(field: String) = apply { body.addField(field) }

        /** List of filters to apply */
        fun filters(filters: List<Filter>) = apply { body.filters(filters) }

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed `List<Filter>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filters(filters: JsonField<List<Filter>>) = apply { body.filters(filters) }

        /**
         * Adds a single [Filter] to [filters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: Filter) = apply { body.addFilter(filter) }

        /** Whether to include all metadata */
        fun includeAllMetadata(includeAllMetadata: Boolean) = apply {
            body.includeAllMetadata(includeAllMetadata)
        }

        /**
         * Sets [Builder.includeAllMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeAllMetadata] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeAllMetadata(includeAllMetadata: JsonField<Boolean>) = apply {
            body.includeAllMetadata(includeAllMetadata)
        }

        /** List of managed accounts to include */
        fun managedAccounts(managedAccounts: List<String>) = apply {
            body.managedAccounts(managedAccounts)
        }

        /**
         * Sets [Builder.managedAccounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.managedAccounts] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun managedAccounts(managedAccounts: JsonField<List<String>>) = apply {
            body.managedAccounts(managedAccounts)
        }

        /**
         * Adds a single [String] to [managedAccounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addManagedAccount(managedAccount: String) = apply {
            body.addManagedAccount(managedAccount)
        }

        /** List of record types to filter by (Complete = 1, Incomplete = 2, Errors = 3) */
        fun recordTypes(recordTypes: List<Int>) = apply { body.recordTypes(recordTypes) }

        /**
         * Sets [Builder.recordTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordTypes] with a well-typed `List<Int>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordTypes(recordTypes: JsonField<List<Int>>) = apply { body.recordTypes(recordTypes) }

        /**
         * Adds a single [Int] to [recordTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecordType(recordType: Int) = apply { body.addRecordType(recordType) }

        /** Name of the report */
        fun reportName(reportName: String) = apply { body.reportName(reportName) }

        /**
         * Sets [Builder.reportName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportName(reportName: JsonField<String>) = apply { body.reportName(reportName) }

        /** Whether to select all managed accounts */
        fun selectAllManagedAccounts(selectAllManagedAccounts: Boolean) = apply {
            body.selectAllManagedAccounts(selectAllManagedAccounts)
        }

        /**
         * Sets [Builder.selectAllManagedAccounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.selectAllManagedAccounts] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun selectAllManagedAccounts(selectAllManagedAccounts: JsonField<Boolean>) = apply {
            body.selectAllManagedAccounts(selectAllManagedAccounts)
        }

        /** Source of the report. Valid values: calls (default), call-control, fax-api, webrtc */
        fun source(source: String) = apply { body.source(source) }

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { body.source(source) }

        /** Timezone for the report */
        fun timezone(timezone: String) = apply { body.timezone(timezone) }

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { body.timezone(timezone) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [VoiceCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endTime()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VoiceCreateParams =
            VoiceCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request object for CDR detailed report */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endTime: JsonField<OffsetDateTime>,
        private val startTime: JsonField<OffsetDateTime>,
        private val callTypes: JsonField<List<Int>>,
        private val connections: JsonField<List<Long>>,
        private val fields: JsonField<List<String>>,
        private val filters: JsonField<List<Filter>>,
        private val includeAllMetadata: JsonField<Boolean>,
        private val managedAccounts: JsonField<List<String>>,
        private val recordTypes: JsonField<List<Int>>,
        private val reportName: JsonField<String>,
        private val selectAllManagedAccounts: JsonField<Boolean>,
        private val source: JsonField<String>,
        private val timezone: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_time")
            @ExcludeMissing
            endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("call_types")
            @ExcludeMissing
            callTypes: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("connections")
            @ExcludeMissing
            connections: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("fields")
            @ExcludeMissing
            fields: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<List<Filter>> = JsonMissing.of(),
            @JsonProperty("include_all_metadata")
            @ExcludeMissing
            includeAllMetadata: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("managed_accounts")
            @ExcludeMissing
            managedAccounts: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("record_types")
            @ExcludeMissing
            recordTypes: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("report_name")
            @ExcludeMissing
            reportName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("select_all_managed_accounts")
            @ExcludeMissing
            selectAllManagedAccounts: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        ) : this(
            endTime,
            startTime,
            callTypes,
            connections,
            fields,
            filters,
            includeAllMetadata,
            managedAccounts,
            recordTypes,
            reportName,
            selectAllManagedAccounts,
            source,
            timezone,
            mutableMapOf(),
        )

        /**
         * End time in ISO format
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endTime(): OffsetDateTime = endTime.getRequired("end_time")

        /**
         * Start time in ISO format
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

        /**
         * List of call types to filter by (Inbound = 1, Outbound = 2)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callTypes(): Optional<List<Int>> = callTypes.getOptional("call_types")

        /**
         * List of connections to filter by
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connections(): Optional<List<Long>> = connections.getOptional("connections")

        /**
         * Set of fields to include in the report
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fields(): Optional<List<String>> = fields.getOptional("fields")

        /**
         * List of filters to apply
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filters(): Optional<List<Filter>> = filters.getOptional("filters")

        /**
         * Whether to include all metadata
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeAllMetadata(): Optional<Boolean> =
            includeAllMetadata.getOptional("include_all_metadata")

        /**
         * List of managed accounts to include
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun managedAccounts(): Optional<List<String>> =
            managedAccounts.getOptional("managed_accounts")

        /**
         * List of record types to filter by (Complete = 1, Incomplete = 2, Errors = 3)
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
         * Whether to select all managed accounts
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun selectAllManagedAccounts(): Optional<Boolean> =
            selectAllManagedAccounts.getOptional("select_all_managed_accounts")

        /**
         * Source of the report. Valid values: calls (default), call-control, fax-api, webrtc
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun source(): Optional<String> = source.getOptional("source")

        /**
         * Timezone for the report
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timezone(): Optional<String> = timezone.getOptional("timezone")

        /**
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_time")
        @ExcludeMissing
        fun _endTime(): JsonField<OffsetDateTime> = endTime

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time")
        @ExcludeMissing
        fun _startTime(): JsonField<OffsetDateTime> = startTime

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
         * Returns the raw JSON value of [fields].
         *
         * Unlike [fields], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fields") @ExcludeMissing fun _fields(): JsonField<List<String>> = fields

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

        /**
         * Returns the raw JSON value of [includeAllMetadata].
         *
         * Unlike [includeAllMetadata], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("include_all_metadata")
        @ExcludeMissing
        fun _includeAllMetadata(): JsonField<Boolean> = includeAllMetadata

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
         * Returns the raw JSON value of [selectAllManagedAccounts].
         *
         * Unlike [selectAllManagedAccounts], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("select_all_managed_accounts")
        @ExcludeMissing
        fun _selectAllManagedAccounts(): JsonField<Boolean> = selectAllManagedAccounts

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

        /**
         * Returns the raw JSON value of [timezone].
         *
         * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .endTime()
             * .startTime()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var endTime: JsonField<OffsetDateTime>? = null
            private var startTime: JsonField<OffsetDateTime>? = null
            private var callTypes: JsonField<MutableList<Int>>? = null
            private var connections: JsonField<MutableList<Long>>? = null
            private var fields: JsonField<MutableList<String>>? = null
            private var filters: JsonField<MutableList<Filter>>? = null
            private var includeAllMetadata: JsonField<Boolean> = JsonMissing.of()
            private var managedAccounts: JsonField<MutableList<String>>? = null
            private var recordTypes: JsonField<MutableList<Int>>? = null
            private var reportName: JsonField<String> = JsonMissing.of()
            private var selectAllManagedAccounts: JsonField<Boolean> = JsonMissing.of()
            private var source: JsonField<String> = JsonMissing.of()
            private var timezone: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                endTime = body.endTime
                startTime = body.startTime
                callTypes = body.callTypes.map { it.toMutableList() }
                connections = body.connections.map { it.toMutableList() }
                fields = body.fields.map { it.toMutableList() }
                filters = body.filters.map { it.toMutableList() }
                includeAllMetadata = body.includeAllMetadata
                managedAccounts = body.managedAccounts.map { it.toMutableList() }
                recordTypes = body.recordTypes.map { it.toMutableList() }
                reportName = body.reportName
                selectAllManagedAccounts = body.selectAllManagedAccounts
                source = body.source
                timezone = body.timezone
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** End time in ISO format */
            fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

            /**
             * Sets [Builder.endTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

            /** Start time in ISO format */
            fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                this.startTime = startTime
            }

            /** List of call types to filter by (Inbound = 1, Outbound = 2) */
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

            /** List of connections to filter by */
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

            /** Set of fields to include in the report */
            fun fields(fields: List<String>) = fields(JsonField.of(fields))

            /**
             * Sets [Builder.fields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fields] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fields(fields: JsonField<List<String>>) = apply {
                this.fields = fields.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [fields].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addField(field: String) = apply {
                fields =
                    (fields ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fields", it).add(field)
                    }
            }

            /** List of filters to apply */
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

            /** Whether to include all metadata */
            fun includeAllMetadata(includeAllMetadata: Boolean) =
                includeAllMetadata(JsonField.of(includeAllMetadata))

            /**
             * Sets [Builder.includeAllMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeAllMetadata] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun includeAllMetadata(includeAllMetadata: JsonField<Boolean>) = apply {
                this.includeAllMetadata = includeAllMetadata
            }

            /** List of managed accounts to include */
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

            /** List of record types to filter by (Complete = 1, Incomplete = 2, Errors = 3) */
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

            /** Whether to select all managed accounts */
            fun selectAllManagedAccounts(selectAllManagedAccounts: Boolean) =
                selectAllManagedAccounts(JsonField.of(selectAllManagedAccounts))

            /**
             * Sets [Builder.selectAllManagedAccounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.selectAllManagedAccounts] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun selectAllManagedAccounts(selectAllManagedAccounts: JsonField<Boolean>) = apply {
                this.selectAllManagedAccounts = selectAllManagedAccounts
            }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .endTime()
             * .startTime()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("endTime", endTime),
                    checkRequired("startTime", startTime),
                    (callTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    (connections ?: JsonMissing.of()).map { it.toImmutable() },
                    (fields ?: JsonMissing.of()).map { it.toImmutable() },
                    (filters ?: JsonMissing.of()).map { it.toImmutable() },
                    includeAllMetadata,
                    (managedAccounts ?: JsonMissing.of()).map { it.toImmutable() },
                    (recordTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    reportName,
                    selectAllManagedAccounts,
                    source,
                    timezone,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            endTime()
            startTime()
            callTypes()
            connections()
            fields()
            filters().ifPresent { it.forEach { it.validate() } }
            includeAllMetadata()
            managedAccounts()
            recordTypes()
            reportName()
            selectAllManagedAccounts()
            source()
            timezone()
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
            (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (callTypes.asKnown().getOrNull()?.size ?: 0) +
                (connections.asKnown().getOrNull()?.size ?: 0) +
                (fields.asKnown().getOrNull()?.size ?: 0) +
                (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (includeAllMetadata.asKnown().isPresent) 1 else 0) +
                (managedAccounts.asKnown().getOrNull()?.size ?: 0) +
                (recordTypes.asKnown().getOrNull()?.size ?: 0) +
                (if (reportName.asKnown().isPresent) 1 else 0) +
                (if (selectAllManagedAccounts.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (timezone.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                endTime == other.endTime &&
                startTime == other.startTime &&
                callTypes == other.callTypes &&
                connections == other.connections &&
                fields == other.fields &&
                filters == other.filters &&
                includeAllMetadata == other.includeAllMetadata &&
                managedAccounts == other.managedAccounts &&
                recordTypes == other.recordTypes &&
                reportName == other.reportName &&
                selectAllManagedAccounts == other.selectAllManagedAccounts &&
                source == other.source &&
                timezone == other.timezone &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                endTime,
                startTime,
                callTypes,
                connections,
                fields,
                filters,
                includeAllMetadata,
                managedAccounts,
                recordTypes,
                reportName,
                selectAllManagedAccounts,
                source,
                timezone,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{endTime=$endTime, startTime=$startTime, callTypes=$callTypes, connections=$connections, fields=$fields, filters=$filters, includeAllMetadata=$includeAllMetadata, managedAccounts=$managedAccounts, recordTypes=$recordTypes, reportName=$reportName, selectAllManagedAccounts=$selectAllManagedAccounts, source=$source, timezone=$timezone, additionalProperties=$additionalProperties}"
    }

    /**
     * Query filter criteria. Note: The first filter object must specify filter_type as 'and'. You
     * cannot follow an 'or' with another 'and'.
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
        ) : this(billingGroup, cld, cldFilter, cli, cliFilter, filterType, tagsList, mutableMapOf())

        /**
         * Billing group UUID to filter by
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingGroup(): Optional<String> = billingGroup.getOptional("billing_group")

        /**
         * Called line identification (destination number)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cld(): Optional<String> = cld.getOptional("cld")

        /**
         * Filter type for CLD matching
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cldFilter(): Optional<CldFilter> = cldFilter.getOptional("cld_filter")

        /**
         * Calling line identification (caller ID)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cli(): Optional<String> = cli.getOptional("cli")

        /**
         * Filter type for CLI matching
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cliFilter(): Optional<CliFilter> = cliFilter.getOptional("cli_filter")

        /**
         * Logical operator for combining filters
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filterType(): Optional<FilterType> = filterType.getOptional("filter_type")

        /**
         * Tag name to filter by
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
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
         * Unlike [cldFilter], this method doesn't throw if the JSON field has an unexpected type.
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
         * Unlike [cliFilter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cli_filter")
        @ExcludeMissing
        fun _cliFilter(): JsonField<CliFilter> = cliFilter

        /**
         * Returns the raw JSON value of [filterType].
         *
         * Unlike [filterType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter_type")
        @ExcludeMissing
        fun _filterType(): JsonField<FilterType> = filterType

        /**
         * Returns the raw JSON value of [tagsList].
         *
         * Unlike [tagsList], this method doesn't throw if the JSON field has an unexpected type.
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
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingGroup(billingGroup: JsonField<String>) = apply {
                this.billingGroup = billingGroup
            }

            /** Called line identification (destination number) */
            fun cld(cld: String) = cld(JsonField.of(cld))

            /**
             * Sets [Builder.cld] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cld] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cld(cld: JsonField<String>) = apply { this.cld = cld }

            /** Filter type for CLD matching */
            fun cldFilter(cldFilter: CldFilter) = cldFilter(JsonField.of(cldFilter))

            /**
             * Sets [Builder.cldFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cldFilter] with a well-typed [CldFilter] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cldFilter(cldFilter: JsonField<CldFilter>) = apply { this.cldFilter = cldFilter }

            /** Calling line identification (caller ID) */
            fun cli(cli: String) = cli(JsonField.of(cli))

            /**
             * Sets [Builder.cli] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cli] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cli(cli: JsonField<String>) = apply { this.cli = cli }

            /** Filter type for CLI matching */
            fun cliFilter(cliFilter: CliFilter) = cliFilter(JsonField.of(cliFilter))

            /**
             * Sets [Builder.cliFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cliFilter] with a well-typed [CliFilter] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cliFilter(cliFilter: JsonField<CliFilter>) = apply { this.cliFilter = cliFilter }

            /** Logical operator for combining filters */
            fun filterType(filterType: FilterType) = filterType(JsonField.of(filterType))

            /**
             * Sets [Builder.filterType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filterType] with a well-typed [FilterType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filterType(filterType: JsonField<FilterType>) = apply {
                this.filterType = filterType
            }

            /** Tag name to filter by */
            fun tagsList(tagsList: String) = tagsList(JsonField.of(tagsList))

            /**
             * Sets [Builder.tagsList] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tagsList] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tagsList(tagsList: JsonField<String>) = apply { this.tagsList = tagsList }

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
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
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
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
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
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
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
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
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
        class FilterType @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
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
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
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

        return other is VoiceCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VoiceCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
