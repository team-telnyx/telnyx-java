// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.messaging

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.Filter
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates a new MDR detailed report request with the specified filters */
class MessagingCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * End time in ISO format. Note: If end time includes the last 4 hours, some MDRs might not
     * appear in this report, due to wait time for downstream message delivery confirmation
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
     * List of connections to filter by
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connections(): Optional<List<Long>> = body.connections()

    /**
     * List of directions to filter by (Inbound = 1, Outbound = 2)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun directions(): Optional<List<Int>> = body.directions()

    /**
     * List of filters to apply
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filters(): Optional<List<Filter>> = body.filters()

    /**
     * Whether to include message body in the report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeMessageBody(): Optional<Boolean> = body.includeMessageBody()

    /**
     * List of managed accounts to include
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managedAccounts(): Optional<List<String>> = body.managedAccounts()

    /**
     * List of messaging profile IDs to filter by
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profiles(): Optional<List<String>> = body.profiles()

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
     * Returns the raw JSON value of [connections].
     *
     * Unlike [connections], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _connections(): JsonField<List<Long>> = body._connections()

    /**
     * Returns the raw JSON value of [directions].
     *
     * Unlike [directions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _directions(): JsonField<List<Int>> = body._directions()

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filters(): JsonField<List<Filter>> = body._filters()

    /**
     * Returns the raw JSON value of [includeMessageBody].
     *
     * Unlike [includeMessageBody], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _includeMessageBody(): JsonField<Boolean> = body._includeMessageBody()

    /**
     * Returns the raw JSON value of [managedAccounts].
     *
     * Unlike [managedAccounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _managedAccounts(): JsonField<List<String>> = body._managedAccounts()

    /**
     * Returns the raw JSON value of [profiles].
     *
     * Unlike [profiles], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _profiles(): JsonField<List<String>> = body._profiles()

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
         * Returns a mutable builder for constructing an instance of [MessagingCreateParams].
         *
         * The following fields are required:
         * ```java
         * .endTime()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messagingCreateParams: MessagingCreateParams) = apply {
            body = messagingCreateParams.body.toBuilder()
            additionalHeaders = messagingCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = messagingCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [endTime]
         * - [startTime]
         * - [connections]
         * - [directions]
         * - [filters]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * End time in ISO format. Note: If end time includes the last 4 hours, some MDRs might not
         * appear in this report, due to wait time for downstream message delivery confirmation
         */
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

        /** List of directions to filter by (Inbound = 1, Outbound = 2) */
        fun directions(directions: List<Int>) = apply { body.directions(directions) }

        /**
         * Sets [Builder.directions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.directions] with a well-typed `List<Int>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun directions(directions: JsonField<List<Int>>) = apply { body.directions(directions) }

        /**
         * Adds a single [Int] to [directions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDirection(direction: Int) = apply { body.addDirection(direction) }

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

        /** Whether to include message body in the report */
        fun includeMessageBody(includeMessageBody: Boolean) = apply {
            body.includeMessageBody(includeMessageBody)
        }

        /**
         * Sets [Builder.includeMessageBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeMessageBody] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeMessageBody(includeMessageBody: JsonField<Boolean>) = apply {
            body.includeMessageBody(includeMessageBody)
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

        /** List of messaging profile IDs to filter by */
        fun profiles(profiles: List<String>) = apply { body.profiles(profiles) }

        /**
         * Sets [Builder.profiles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profiles] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun profiles(profiles: JsonField<List<String>>) = apply { body.profiles(profiles) }

        /**
         * Adds a single [String] to [profiles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProfile(profile: String) = apply { body.addProfile(profile) }

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
         * Returns an immutable instance of [MessagingCreateParams].
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
        fun build(): MessagingCreateParams =
            MessagingCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request object for MDR detailed report */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endTime: JsonField<OffsetDateTime>,
        private val startTime: JsonField<OffsetDateTime>,
        private val connections: JsonField<List<Long>>,
        private val directions: JsonField<List<Int>>,
        private val filters: JsonField<List<Filter>>,
        private val includeMessageBody: JsonField<Boolean>,
        private val managedAccounts: JsonField<List<String>>,
        private val profiles: JsonField<List<String>>,
        private val recordTypes: JsonField<List<Int>>,
        private val reportName: JsonField<String>,
        private val selectAllManagedAccounts: JsonField<Boolean>,
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
            @JsonProperty("connections")
            @ExcludeMissing
            connections: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("directions")
            @ExcludeMissing
            directions: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<List<Filter>> = JsonMissing.of(),
            @JsonProperty("include_message_body")
            @ExcludeMissing
            includeMessageBody: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("managed_accounts")
            @ExcludeMissing
            managedAccounts: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("profiles")
            @ExcludeMissing
            profiles: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("record_types")
            @ExcludeMissing
            recordTypes: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("report_name")
            @ExcludeMissing
            reportName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("select_all_managed_accounts")
            @ExcludeMissing
            selectAllManagedAccounts: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        ) : this(
            endTime,
            startTime,
            connections,
            directions,
            filters,
            includeMessageBody,
            managedAccounts,
            profiles,
            recordTypes,
            reportName,
            selectAllManagedAccounts,
            timezone,
            mutableMapOf(),
        )

        /**
         * End time in ISO format. Note: If end time includes the last 4 hours, some MDRs might not
         * appear in this report, due to wait time for downstream message delivery confirmation
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
         * List of connections to filter by
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connections(): Optional<List<Long>> = connections.getOptional("connections")

        /**
         * List of directions to filter by (Inbound = 1, Outbound = 2)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun directions(): Optional<List<Int>> = directions.getOptional("directions")

        /**
         * List of filters to apply
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filters(): Optional<List<Filter>> = filters.getOptional("filters")

        /**
         * Whether to include message body in the report
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeMessageBody(): Optional<Boolean> =
            includeMessageBody.getOptional("include_message_body")

        /**
         * List of managed accounts to include
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun managedAccounts(): Optional<List<String>> =
            managedAccounts.getOptional("managed_accounts")

        /**
         * List of messaging profile IDs to filter by
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun profiles(): Optional<List<String>> = profiles.getOptional("profiles")

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
         * Returns the raw JSON value of [connections].
         *
         * Unlike [connections], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("connections")
        @ExcludeMissing
        fun _connections(): JsonField<List<Long>> = connections

        /**
         * Returns the raw JSON value of [directions].
         *
         * Unlike [directions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("directions")
        @ExcludeMissing
        fun _directions(): JsonField<List<Int>> = directions

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

        /**
         * Returns the raw JSON value of [includeMessageBody].
         *
         * Unlike [includeMessageBody], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("include_message_body")
        @ExcludeMissing
        fun _includeMessageBody(): JsonField<Boolean> = includeMessageBody

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
         * Returns the raw JSON value of [profiles].
         *
         * Unlike [profiles], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("profiles")
        @ExcludeMissing
        fun _profiles(): JsonField<List<String>> = profiles

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
            private var connections: JsonField<MutableList<Long>>? = null
            private var directions: JsonField<MutableList<Int>>? = null
            private var filters: JsonField<MutableList<Filter>>? = null
            private var includeMessageBody: JsonField<Boolean> = JsonMissing.of()
            private var managedAccounts: JsonField<MutableList<String>>? = null
            private var profiles: JsonField<MutableList<String>>? = null
            private var recordTypes: JsonField<MutableList<Int>>? = null
            private var reportName: JsonField<String> = JsonMissing.of()
            private var selectAllManagedAccounts: JsonField<Boolean> = JsonMissing.of()
            private var timezone: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                endTime = body.endTime
                startTime = body.startTime
                connections = body.connections.map { it.toMutableList() }
                directions = body.directions.map { it.toMutableList() }
                filters = body.filters.map { it.toMutableList() }
                includeMessageBody = body.includeMessageBody
                managedAccounts = body.managedAccounts.map { it.toMutableList() }
                profiles = body.profiles.map { it.toMutableList() }
                recordTypes = body.recordTypes.map { it.toMutableList() }
                reportName = body.reportName
                selectAllManagedAccounts = body.selectAllManagedAccounts
                timezone = body.timezone
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * End time in ISO format. Note: If end time includes the last 4 hours, some MDRs might
             * not appear in this report, due to wait time for downstream message delivery
             * confirmation
             */
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

            /** List of directions to filter by (Inbound = 1, Outbound = 2) */
            fun directions(directions: List<Int>) = directions(JsonField.of(directions))

            /**
             * Sets [Builder.directions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.directions] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun directions(directions: JsonField<List<Int>>) = apply {
                this.directions = directions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [directions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDirection(direction: Int) = apply {
                directions =
                    (directions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("directions", it).add(direction)
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

            /** Whether to include message body in the report */
            fun includeMessageBody(includeMessageBody: Boolean) =
                includeMessageBody(JsonField.of(includeMessageBody))

            /**
             * Sets [Builder.includeMessageBody] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeMessageBody] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun includeMessageBody(includeMessageBody: JsonField<Boolean>) = apply {
                this.includeMessageBody = includeMessageBody
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

            /** List of messaging profile IDs to filter by */
            fun profiles(profiles: List<String>) = profiles(JsonField.of(profiles))

            /**
             * Sets [Builder.profiles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.profiles] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun profiles(profiles: JsonField<List<String>>) = apply {
                this.profiles = profiles.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [profiles].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProfile(profile: String) = apply {
                profiles =
                    (profiles ?: JsonField.of(mutableListOf())).also {
                        checkKnown("profiles", it).add(profile)
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
                    (connections ?: JsonMissing.of()).map { it.toImmutable() },
                    (directions ?: JsonMissing.of()).map { it.toImmutable() },
                    (filters ?: JsonMissing.of()).map { it.toImmutable() },
                    includeMessageBody,
                    (managedAccounts ?: JsonMissing.of()).map { it.toImmutable() },
                    (profiles ?: JsonMissing.of()).map { it.toImmutable() },
                    (recordTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    reportName,
                    selectAllManagedAccounts,
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
            connections()
            directions()
            filters().ifPresent { it.forEach { it.validate() } }
            includeMessageBody()
            managedAccounts()
            profiles()
            recordTypes()
            reportName()
            selectAllManagedAccounts()
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
                (connections.asKnown().getOrNull()?.size ?: 0) +
                (directions.asKnown().getOrNull()?.size ?: 0) +
                (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (includeMessageBody.asKnown().isPresent) 1 else 0) +
                (managedAccounts.asKnown().getOrNull()?.size ?: 0) +
                (profiles.asKnown().getOrNull()?.size ?: 0) +
                (recordTypes.asKnown().getOrNull()?.size ?: 0) +
                (if (reportName.asKnown().isPresent) 1 else 0) +
                (if (selectAllManagedAccounts.asKnown().isPresent) 1 else 0) +
                (if (timezone.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                endTime == other.endTime &&
                startTime == other.startTime &&
                connections == other.connections &&
                directions == other.directions &&
                filters == other.filters &&
                includeMessageBody == other.includeMessageBody &&
                managedAccounts == other.managedAccounts &&
                profiles == other.profiles &&
                recordTypes == other.recordTypes &&
                reportName == other.reportName &&
                selectAllManagedAccounts == other.selectAllManagedAccounts &&
                timezone == other.timezone &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                endTime,
                startTime,
                connections,
                directions,
                filters,
                includeMessageBody,
                managedAccounts,
                profiles,
                recordTypes,
                reportName,
                selectAllManagedAccounts,
                timezone,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{endTime=$endTime, startTime=$startTime, connections=$connections, directions=$directions, filters=$filters, includeMessageBody=$includeMessageBody, managedAccounts=$managedAccounts, profiles=$profiles, recordTypes=$recordTypes, reportName=$reportName, selectAllManagedAccounts=$selectAllManagedAccounts, timezone=$timezone, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MessagingCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
