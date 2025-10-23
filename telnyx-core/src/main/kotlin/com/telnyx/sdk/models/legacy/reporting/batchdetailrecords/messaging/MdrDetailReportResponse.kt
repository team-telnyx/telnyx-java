// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.messaging

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
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.Filter
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MdrDetailReportResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val connections: JsonField<List<Long>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val directions: JsonField<List<Direction>>,
    private val endDate: JsonField<OffsetDateTime>,
    private val filters: JsonField<List<Filter>>,
    private val profiles: JsonField<List<String>>,
    private val recordType: JsonField<String>,
    private val recordTypes: JsonField<List<RecordType>>,
    private val reportName: JsonField<String>,
    private val reportUrl: JsonField<String>,
    private val startDate: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connections")
        @ExcludeMissing
        connections: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("directions")
        @ExcludeMissing
        directions: JsonField<List<Direction>> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<Filter>> = JsonMissing.of(),
        @JsonProperty("profiles")
        @ExcludeMissing
        profiles: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_types")
        @ExcludeMissing
        recordTypes: JsonField<List<RecordType>> = JsonMissing.of(),
        @JsonProperty("report_name")
        @ExcludeMissing
        reportName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("report_url") @ExcludeMissing reportUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        connections,
        createdAt,
        directions,
        endDate,
        filters,
        profiles,
        recordType,
        recordTypes,
        reportName,
        reportUrl,
        startDate,
        status,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Identifies the resource
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connections(): Optional<List<Long>> = connections.getOptional("connections")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun directions(): Optional<List<Direction>> = directions.getOptional("directions")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filters(): Optional<List<Filter>> = filters.getOptional("filters")

    /**
     * List of messaging profile IDs
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profiles(): Optional<List<String>> = profiles.getOptional("profiles")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordTypes(): Optional<List<RecordType>> = recordTypes.getOptional("record_types")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportName(): Optional<String> = reportName.getOptional("report_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportUrl(): Optional<String> = reportUrl.getOptional("report_url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): Optional<OffsetDateTime> = startDate.getOptional("start_date")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
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
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [directions].
     *
     * Unlike [directions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("directions")
    @ExcludeMissing
    fun _directions(): JsonField<List<Direction>> = directions

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

    /**
     * Returns the raw JSON value of [profiles].
     *
     * Unlike [profiles], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profiles") @ExcludeMissing fun _profiles(): JsonField<List<String>> = profiles

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
    fun _recordTypes(): JsonField<List<RecordType>> = recordTypes

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
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        /** Returns a mutable builder for constructing an instance of [MdrDetailReportResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MdrDetailReportResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var connections: JsonField<MutableList<Long>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var directions: JsonField<MutableList<Direction>>? = null
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var filters: JsonField<MutableList<Filter>>? = null
        private var profiles: JsonField<MutableList<String>>? = null
        private var recordType: JsonField<String> = JsonMissing.of()
        private var recordTypes: JsonField<MutableList<RecordType>>? = null
        private var reportName: JsonField<String> = JsonMissing.of()
        private var reportUrl: JsonField<String> = JsonMissing.of()
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mdrDetailReportResponse: MdrDetailReportResponse) = apply {
            id = mdrDetailReportResponse.id
            connections = mdrDetailReportResponse.connections.map { it.toMutableList() }
            createdAt = mdrDetailReportResponse.createdAt
            directions = mdrDetailReportResponse.directions.map { it.toMutableList() }
            endDate = mdrDetailReportResponse.endDate
            filters = mdrDetailReportResponse.filters.map { it.toMutableList() }
            profiles = mdrDetailReportResponse.profiles.map { it.toMutableList() }
            recordType = mdrDetailReportResponse.recordType
            recordTypes = mdrDetailReportResponse.recordTypes.map { it.toMutableList() }
            reportName = mdrDetailReportResponse.reportName
            reportUrl = mdrDetailReportResponse.reportUrl
            startDate = mdrDetailReportResponse.startDate
            status = mdrDetailReportResponse.status
            updatedAt = mdrDetailReportResponse.updatedAt
            additionalProperties = mdrDetailReportResponse.additionalProperties.toMutableMap()
        }

        /** Identifies the resource */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun directions(directions: List<Direction>) = directions(JsonField.of(directions))

        /**
         * Sets [Builder.directions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.directions] with a well-typed `List<Direction>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun directions(directions: JsonField<List<Direction>>) = apply {
            this.directions = directions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Direction] to [directions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDirection(direction: Direction) = apply {
            directions =
                (directions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("directions", it).add(direction)
                }
        }

        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

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

        /** List of messaging profile IDs */
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

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        fun recordTypes(recordTypes: List<RecordType>) = recordTypes(JsonField.of(recordTypes))

        /**
         * Sets [Builder.recordTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordTypes] with a well-typed `List<RecordType>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordTypes(recordTypes: JsonField<List<RecordType>>) = apply {
            this.recordTypes = recordTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [RecordType] to [recordTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecordType(recordType: RecordType) = apply {
            recordTypes =
                (recordTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recordTypes", it).add(recordType)
                }
        }

        fun reportName(reportName: String) = reportName(JsonField.of(reportName))

        /**
         * Sets [Builder.reportName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportName(reportName: JsonField<String>) = apply { this.reportName = reportName }

        fun reportUrl(reportUrl: String) = reportUrl(JsonField.of(reportUrl))

        /**
         * Sets [Builder.reportUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportUrl(reportUrl: JsonField<String>) = apply { this.reportUrl = reportUrl }

        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [MdrDetailReportResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MdrDetailReportResponse =
            MdrDetailReportResponse(
                id,
                (connections ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                (directions ?: JsonMissing.of()).map { it.toImmutable() },
                endDate,
                (filters ?: JsonMissing.of()).map { it.toImmutable() },
                (profiles ?: JsonMissing.of()).map { it.toImmutable() },
                recordType,
                (recordTypes ?: JsonMissing.of()).map { it.toImmutable() },
                reportName,
                reportUrl,
                startDate,
                status,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MdrDetailReportResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        connections()
        createdAt()
        directions().ifPresent { it.forEach { it.validate() } }
        endDate()
        filters().ifPresent { it.forEach { it.validate() } }
        profiles()
        recordType()
        recordTypes().ifPresent { it.forEach { it.validate() } }
        reportName()
        reportUrl()
        startDate()
        status().ifPresent { it.validate() }
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
            (connections.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (directions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (profiles.asKnown().getOrNull()?.size ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (recordTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (reportName.asKnown().isPresent) 1 else 0) +
            (if (reportUrl.asKnown().isPresent) 1 else 0) +
            (if (startDate.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INBOUND = of("INBOUND")

            @JvmField val OUTBOUND = of("OUTBOUND")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            INBOUND,
            OUTBOUND,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND,
            OUTBOUND,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
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
                INBOUND -> Value.INBOUND
                OUTBOUND -> Value.OUTBOUND
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
                INBOUND -> Known.INBOUND
                OUTBOUND -> Known.OUTBOUND
                else -> throw TelnyxInvalidDataException("Unknown Direction: $value")
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

        fun validate(): Direction = apply {
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

            return other is Direction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class RecordType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INCOMPLETE = of("INCOMPLETE")

            @JvmField val COMPLETED = of("COMPLETED")

            @JvmField val ERRORS = of("ERRORS")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            INCOMPLETE,
            COMPLETED,
            ERRORS,
        }

        /**
         * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INCOMPLETE,
            COMPLETED,
            ERRORS,
            /**
             * An enum member indicating that [RecordType] was instantiated with an unknown value.
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
                INCOMPLETE -> Value.INCOMPLETE
                COMPLETED -> Value.COMPLETED
                ERRORS -> Value.ERRORS
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
                INCOMPLETE -> Known.INCOMPLETE
                COMPLETED -> Known.COMPLETED
                ERRORS -> Known.ERRORS
                else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

        fun validate(): RecordType = apply {
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

            return other is RecordType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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

            @JvmField val PENDING = of("PENDING")

            @JvmField val COMPLETE = of("COMPLETE")

            @JvmField val FAILED = of("FAILED")

            @JvmField val EXPIRED = of("EXPIRED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            COMPLETE,
            FAILED,
            EXPIRED,
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
            COMPLETE,
            FAILED,
            EXPIRED,
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
                COMPLETE -> Value.COMPLETE
                FAILED -> Value.FAILED
                EXPIRED -> Value.EXPIRED
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
                COMPLETE -> Known.COMPLETE
                FAILED -> Known.FAILED
                EXPIRED -> Known.EXPIRED
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

        return other is MdrDetailReportResponse &&
            id == other.id &&
            connections == other.connections &&
            createdAt == other.createdAt &&
            directions == other.directions &&
            endDate == other.endDate &&
            filters == other.filters &&
            profiles == other.profiles &&
            recordType == other.recordType &&
            recordTypes == other.recordTypes &&
            reportName == other.reportName &&
            reportUrl == other.reportUrl &&
            startDate == other.startDate &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            connections,
            createdAt,
            directions,
            endDate,
            filters,
            profiles,
            recordType,
            recordTypes,
            reportName,
            reportUrl,
            startDate,
            status,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MdrDetailReportResponse{id=$id, connections=$connections, createdAt=$createdAt, directions=$directions, endDate=$endDate, filters=$filters, profiles=$profiles, recordType=$recordType, recordTypes=$recordTypes, reportName=$reportName, reportUrl=$reportUrl, startDate=$startDate, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
