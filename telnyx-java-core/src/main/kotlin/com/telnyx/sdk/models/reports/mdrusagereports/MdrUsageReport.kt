// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports.mdrusagereports

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MdrUsageReport
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val aggregationType: JsonField<AggregationType>,
    private val connections: JsonField<List<Long>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val endDate: JsonField<OffsetDateTime>,
    private val profiles: JsonField<String>,
    private val recordType: JsonField<String>,
    private val reportUrl: JsonField<String>,
    private val result: JsonField<List<Result>>,
    private val startDate: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aggregation_type")
        @ExcludeMissing
        aggregationType: JsonField<AggregationType> = JsonMissing.of(),
        @JsonProperty("connections")
        @ExcludeMissing
        connections: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("profiles") @ExcludeMissing profiles: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("report_url") @ExcludeMissing reportUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<List<Result>> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        aggregationType,
        connections,
        createdAt,
        endDate,
        profiles,
        recordType,
        reportUrl,
        result,
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
    fun aggregationType(): Optional<AggregationType> =
        aggregationType.getOptional("aggregation_type")

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
    fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profiles(): Optional<String> = profiles.getOptional("profiles")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportUrl(): Optional<String> = reportUrl.getOptional("report_url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<List<Result>> = result.getOptional("result")

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
     * Returns the raw JSON value of [aggregationType].
     *
     * Unlike [aggregationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aggregation_type")
    @ExcludeMissing
    fun _aggregationType(): JsonField<AggregationType> = aggregationType

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
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [profiles].
     *
     * Unlike [profiles], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profiles") @ExcludeMissing fun _profiles(): JsonField<String> = profiles

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
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<List<Result>> = result

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

        /** Returns a mutable builder for constructing an instance of [MdrUsageReport]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MdrUsageReport]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var aggregationType: JsonField<AggregationType> = JsonMissing.of()
        private var connections: JsonField<MutableList<Long>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var profiles: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var reportUrl: JsonField<String> = JsonMissing.of()
        private var result: JsonField<MutableList<Result>>? = null
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mdrUsageReport: MdrUsageReport) = apply {
            id = mdrUsageReport.id
            aggregationType = mdrUsageReport.aggregationType
            connections = mdrUsageReport.connections.map { it.toMutableList() }
            createdAt = mdrUsageReport.createdAt
            endDate = mdrUsageReport.endDate
            profiles = mdrUsageReport.profiles
            recordType = mdrUsageReport.recordType
            reportUrl = mdrUsageReport.reportUrl
            result = mdrUsageReport.result.map { it.toMutableList() }
            startDate = mdrUsageReport.startDate
            status = mdrUsageReport.status
            updatedAt = mdrUsageReport.updatedAt
            additionalProperties = mdrUsageReport.additionalProperties.toMutableMap()
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

        fun aggregationType(aggregationType: AggregationType) =
            aggregationType(JsonField.of(aggregationType))

        /**
         * Sets [Builder.aggregationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregationType] with a well-typed [AggregationType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun aggregationType(aggregationType: JsonField<AggregationType>) = apply {
            this.aggregationType = aggregationType
        }

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

        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        fun profiles(profiles: String) = profiles(JsonField.of(profiles))

        /**
         * Sets [Builder.profiles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profiles] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun profiles(profiles: JsonField<String>) = apply { this.profiles = profiles }

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        fun reportUrl(reportUrl: String) = reportUrl(JsonField.of(reportUrl))

        /**
         * Sets [Builder.reportUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportUrl(reportUrl: JsonField<String>) = apply { this.reportUrl = reportUrl }

        fun result(result: List<Result>) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun result(result: JsonField<List<Result>>) = apply {
            this.result = result.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [Builder.result].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            this.result =
                (this.result ?: JsonField.of(mutableListOf())).also {
                    checkKnown("result", it).add(result)
                }
        }

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
         * Returns an immutable instance of [MdrUsageReport].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MdrUsageReport =
            MdrUsageReport(
                id,
                aggregationType,
                (connections ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                endDate,
                profiles,
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

    fun validate(): MdrUsageReport = apply {
        if (validated) {
            return@apply
        }

        id()
        aggregationType().ifPresent { it.validate() }
        connections()
        createdAt()
        endDate()
        profiles()
        recordType()
        reportUrl()
        result().ifPresent { it.forEach { it.validate() } }
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
            (aggregationType.asKnown().getOrNull()?.validity() ?: 0) +
            (connections.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (if (profiles.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (reportUrl.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (startDate.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class AggregationType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val NO_AGGREGATION = of("NO_AGGREGATION")

            @JvmField val PROFILE = of("PROFILE")

            @JvmField val TAGS = of("TAGS")

            @JvmStatic fun of(value: String) = AggregationType(JsonField.of(value))
        }

        /** An enum containing [AggregationType]'s known values. */
        enum class Known {
            NO_AGGREGATION,
            PROFILE,
            TAGS,
        }

        /**
         * An enum containing [AggregationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AggregationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NO_AGGREGATION,
            PROFILE,
            TAGS,
            /**
             * An enum member indicating that [AggregationType] was instantiated with an unknown
             * value.
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
                NO_AGGREGATION -> Value.NO_AGGREGATION
                PROFILE -> Value.PROFILE
                TAGS -> Value.TAGS
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
                NO_AGGREGATION -> Known.NO_AGGREGATION
                PROFILE -> Known.PROFILE
                TAGS -> Known.TAGS
                else -> throw TelnyxInvalidDataException("Unknown AggregationType: $value")
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

        fun validate(): AggregationType = apply {
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

            return other is AggregationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val carrierPassthroughFee: JsonField<String>,
        private val connection: JsonField<String>,
        private val cost: JsonField<String>,
        private val currency: JsonField<String>,
        private val delivered: JsonField<String>,
        private val direction: JsonField<String>,
        private val messageType: JsonField<String>,
        private val parts: JsonField<String>,
        private val product: JsonField<String>,
        private val profileId: JsonField<String>,
        private val received: JsonField<String>,
        private val sent: JsonField<String>,
        private val tags: JsonField<String>,
        private val tnType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("carrier_passthrough_fee")
            @ExcludeMissing
            carrierPassthroughFee: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connection")
            @ExcludeMissing
            connection: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cost") @ExcludeMissing cost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("delivered")
            @ExcludeMissing
            delivered: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message_type")
            @ExcludeMissing
            messageType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parts") @ExcludeMissing parts: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product") @ExcludeMissing product: JsonField<String> = JsonMissing.of(),
            @JsonProperty("profile_id")
            @ExcludeMissing
            profileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("received")
            @ExcludeMissing
            received: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sent") @ExcludeMissing sent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tn_type") @ExcludeMissing tnType: JsonField<String> = JsonMissing.of(),
        ) : this(
            carrierPassthroughFee,
            connection,
            cost,
            currency,
            delivered,
            direction,
            messageType,
            parts,
            product,
            profileId,
            received,
            sent,
            tags,
            tnType,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun carrierPassthroughFee(): Optional<String> =
            carrierPassthroughFee.getOptional("carrier_passthrough_fee")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connection(): Optional<String> = connection.getOptional("connection")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cost(): Optional<String> = cost.getOptional("cost")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun delivered(): Optional<String> = delivered.getOptional("delivered")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun direction(): Optional<String> = direction.getOptional("direction")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messageType(): Optional<String> = messageType.getOptional("message_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parts(): Optional<String> = parts.getOptional("parts")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun product(): Optional<String> = product.getOptional("product")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun profileId(): Optional<String> = profileId.getOptional("profile_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun received(): Optional<String> = received.getOptional("received")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sent(): Optional<String> = sent.getOptional("sent")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<String> = tags.getOptional("tags")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tnType(): Optional<String> = tnType.getOptional("tn_type")

        /**
         * Returns the raw JSON value of [carrierPassthroughFee].
         *
         * Unlike [carrierPassthroughFee], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("carrier_passthrough_fee")
        @ExcludeMissing
        fun _carrierPassthroughFee(): JsonField<String> = carrierPassthroughFee

        /**
         * Returns the raw JSON value of [connection].
         *
         * Unlike [connection], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("connection")
        @ExcludeMissing
        fun _connection(): JsonField<String> = connection

        /**
         * Returns the raw JSON value of [cost].
         *
         * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<String> = cost

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [delivered].
         *
         * Unlike [delivered], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delivered") @ExcludeMissing fun _delivered(): JsonField<String> = delivered

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

        /**
         * Returns the raw JSON value of [messageType].
         *
         * Unlike [messageType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message_type")
        @ExcludeMissing
        fun _messageType(): JsonField<String> = messageType

        /**
         * Returns the raw JSON value of [parts].
         *
         * Unlike [parts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parts") @ExcludeMissing fun _parts(): JsonField<String> = parts

        /**
         * Returns the raw JSON value of [product].
         *
         * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<String> = product

        /**
         * Returns the raw JSON value of [profileId].
         *
         * Unlike [profileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("profile_id") @ExcludeMissing fun _profileId(): JsonField<String> = profileId

        /**
         * Returns the raw JSON value of [received].
         *
         * Unlike [received], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("received") @ExcludeMissing fun _received(): JsonField<String> = received

        /**
         * Returns the raw JSON value of [sent].
         *
         * Unlike [sent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sent") @ExcludeMissing fun _sent(): JsonField<String> = sent

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<String> = tags

        /**
         * Returns the raw JSON value of [tnType].
         *
         * Unlike [tnType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tn_type") @ExcludeMissing fun _tnType(): JsonField<String> = tnType

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

            /** Returns a mutable builder for constructing an instance of [Result]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var carrierPassthroughFee: JsonField<String> = JsonMissing.of()
            private var connection: JsonField<String> = JsonMissing.of()
            private var cost: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var delivered: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<String> = JsonMissing.of()
            private var messageType: JsonField<String> = JsonMissing.of()
            private var parts: JsonField<String> = JsonMissing.of()
            private var product: JsonField<String> = JsonMissing.of()
            private var profileId: JsonField<String> = JsonMissing.of()
            private var received: JsonField<String> = JsonMissing.of()
            private var sent: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<String> = JsonMissing.of()
            private var tnType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                carrierPassthroughFee = result.carrierPassthroughFee
                connection = result.connection
                cost = result.cost
                currency = result.currency
                delivered = result.delivered
                direction = result.direction
                messageType = result.messageType
                parts = result.parts
                product = result.product
                profileId = result.profileId
                received = result.received
                sent = result.sent
                tags = result.tags
                tnType = result.tnType
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            fun carrierPassthroughFee(carrierPassthroughFee: String) =
                carrierPassthroughFee(JsonField.of(carrierPassthroughFee))

            /**
             * Sets [Builder.carrierPassthroughFee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrierPassthroughFee] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun carrierPassthroughFee(carrierPassthroughFee: JsonField<String>) = apply {
                this.carrierPassthroughFee = carrierPassthroughFee
            }

            fun connection(connection: String) = connection(JsonField.of(connection))

            /**
             * Sets [Builder.connection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connection] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connection(connection: JsonField<String>) = apply { this.connection = connection }

            fun cost(cost: String) = cost(JsonField.of(cost))

            /**
             * Sets [Builder.cost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cost] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cost(cost: JsonField<String>) = apply { this.cost = cost }

            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun delivered(delivered: String) = delivered(JsonField.of(delivered))

            /**
             * Sets [Builder.delivered] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delivered] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun delivered(delivered: JsonField<String>) = apply { this.delivered = delivered }

            fun direction(direction: String) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<String>) = apply { this.direction = direction }

            fun messageType(messageType: String) = messageType(JsonField.of(messageType))

            /**
             * Sets [Builder.messageType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messageType(messageType: JsonField<String>) = apply {
                this.messageType = messageType
            }

            fun parts(parts: String) = parts(JsonField.of(parts))

            /**
             * Sets [Builder.parts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parts] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parts(parts: JsonField<String>) = apply { this.parts = parts }

            fun product(product: String) = product(JsonField.of(product))

            /**
             * Sets [Builder.product] to an arbitrary JSON value.
             *
             * You should usually call [Builder.product] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun product(product: JsonField<String>) = apply { this.product = product }

            fun profileId(profileId: String) = profileId(JsonField.of(profileId))

            /**
             * Sets [Builder.profileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.profileId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun profileId(profileId: JsonField<String>) = apply { this.profileId = profileId }

            fun received(received: String) = received(JsonField.of(received))

            /**
             * Sets [Builder.received] to an arbitrary JSON value.
             *
             * You should usually call [Builder.received] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun received(received: JsonField<String>) = apply { this.received = received }

            fun sent(sent: String) = sent(JsonField.of(sent))

            /**
             * Sets [Builder.sent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sent] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun sent(sent: JsonField<String>) = apply { this.sent = sent }

            fun tags(tags: String) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tags(tags: JsonField<String>) = apply { this.tags = tags }

            fun tnType(tnType: String) = tnType(JsonField.of(tnType))

            /**
             * Sets [Builder.tnType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tnType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tnType(tnType: JsonField<String>) = apply { this.tnType = tnType }

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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Result =
                Result(
                    carrierPassthroughFee,
                    connection,
                    cost,
                    currency,
                    delivered,
                    direction,
                    messageType,
                    parts,
                    product,
                    profileId,
                    received,
                    sent,
                    tags,
                    tnType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            carrierPassthroughFee()
            connection()
            cost()
            currency()
            delivered()
            direction()
            messageType()
            parts()
            product()
            profileId()
            received()
            sent()
            tags()
            tnType()
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
            (if (carrierPassthroughFee.asKnown().isPresent) 1 else 0) +
                (if (connection.asKnown().isPresent) 1 else 0) +
                (if (cost.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (delivered.asKnown().isPresent) 1 else 0) +
                (if (direction.asKnown().isPresent) 1 else 0) +
                (if (messageType.asKnown().isPresent) 1 else 0) +
                (if (parts.asKnown().isPresent) 1 else 0) +
                (if (product.asKnown().isPresent) 1 else 0) +
                (if (profileId.asKnown().isPresent) 1 else 0) +
                (if (received.asKnown().isPresent) 1 else 0) +
                (if (sent.asKnown().isPresent) 1 else 0) +
                (if (tags.asKnown().isPresent) 1 else 0) +
                (if (tnType.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                carrierPassthroughFee == other.carrierPassthroughFee &&
                connection == other.connection &&
                cost == other.cost &&
                currency == other.currency &&
                delivered == other.delivered &&
                direction == other.direction &&
                messageType == other.messageType &&
                parts == other.parts &&
                product == other.product &&
                profileId == other.profileId &&
                received == other.received &&
                sent == other.sent &&
                tags == other.tags &&
                tnType == other.tnType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                carrierPassthroughFee,
                connection,
                cost,
                currency,
                delivered,
                direction,
                messageType,
                parts,
                product,
                profileId,
                received,
                sent,
                tags,
                tnType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{carrierPassthroughFee=$carrierPassthroughFee, connection=$connection, cost=$cost, currency=$currency, delivered=$delivered, direction=$direction, messageType=$messageType, parts=$parts, product=$product, profileId=$profileId, received=$received, sent=$sent, tags=$tags, tnType=$tnType, additionalProperties=$additionalProperties}"
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

        return other is MdrUsageReport &&
            id == other.id &&
            aggregationType == other.aggregationType &&
            connections == other.connections &&
            createdAt == other.createdAt &&
            endDate == other.endDate &&
            profiles == other.profiles &&
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
            connections,
            createdAt,
            endDate,
            profiles,
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
        "MdrUsageReport{id=$id, aggregationType=$aggregationType, connections=$connections, createdAt=$createdAt, endDate=$endDate, profiles=$profiles, recordType=$recordType, reportUrl=$reportUrl, result=$result, startDate=$startDate, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
