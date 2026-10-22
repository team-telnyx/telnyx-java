// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dialmetrics

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

/** Dial counts and rates for one region in one time bucket. One record per region per bucket. */
class DialMetricListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val averageDps: JsonField<Double>,
    private val dials: JsonField<Dials>,
    private val dpsLimit: JsonField<Long>,
    private val endTime: JsonField<OffsetDateTime>,
    private val peakDps: JsonField<Double>,
    private val recordType: JsonField<RecordType>,
    private val region: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("average_dps")
        @ExcludeMissing
        averageDps: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dials") @ExcludeMissing dials: JsonField<Dials> = JsonMissing.of(),
        @JsonProperty("dps_limit") @ExcludeMissing dpsLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("peak_dps") @ExcludeMissing peakDps: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        averageDps,
        dials,
        dpsLimit,
        endTime,
        peakDps,
        recordType,
        region,
        startTime,
        mutableMapOf(),
    )

    /**
     * `dials.total` divided by the bucket duration in seconds, rounded to 4 decimal places. Counts
     * every dial attempt, rejected ones included.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun averageDps(): Optional<Double> = averageDps.getOptional("average_dps")

    /**
     * Dial attempt counts in the bucket.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dials(): Optional<Dials> = dials.getOptional("dials")

    /**
     * DPS limit in force during the busiest 5-second window, so it compares directly with
     * `peak_dps`. `null` means unlimited. Enforcement near the limit is approximate;
     * `dials.rejected.dps_limit` is the authoritative signal that the limit was reached.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dpsLimit(): Optional<Long> = dpsLimit.getOptional("dps_limit")

    /**
     * End of the bucket (exclusive), UTC. Five seconds, one minute or one hour after `start_time`,
     * depending on `granularity`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    /**
     * Dials per second, rounded to 4 decimal places, in the busiest 5-second window of the bucket,
     * summed across all call-processing nodes of the region. Counts every dial attempt, rejected
     * ones included, so `peak_dps` above `dps_limit` is expected when dials were rejected. For
     * `granularity=second` it equals `average_dps`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun peakDps(): Optional<Double> = peakDps.getOptional("peak_dps")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

    /**
     * Region where the dials were handled. Current values are `us`, `eu`, `australia`,
     * `middle_east`, `canada` and `india`. New values can be added, so clients must tolerate values
     * not listed here. Buckets of different regions are separate records.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun region(): Optional<String> = region.getOptional("region")

    /**
     * Start of the bucket (inclusive), UTC.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

    /**
     * Returns the raw JSON value of [averageDps].
     *
     * Unlike [averageDps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("average_dps") @ExcludeMissing fun _averageDps(): JsonField<Double> = averageDps

    /**
     * Returns the raw JSON value of [dials].
     *
     * Unlike [dials], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dials") @ExcludeMissing fun _dials(): JsonField<Dials> = dials

    /**
     * Returns the raw JSON value of [dpsLimit].
     *
     * Unlike [dpsLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dps_limit") @ExcludeMissing fun _dpsLimit(): JsonField<Long> = dpsLimit

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [peakDps].
     *
     * Unlike [peakDps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("peak_dps") @ExcludeMissing fun _peakDps(): JsonField<Double> = peakDps

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

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

        /** Returns a mutable builder for constructing an instance of [DialMetricListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DialMetricListResponse]. */
    class Builder internal constructor() {

        private var averageDps: JsonField<Double> = JsonMissing.of()
        private var dials: JsonField<Dials> = JsonMissing.of()
        private var dpsLimit: JsonField<Long> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var peakDps: JsonField<Double> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dialMetricListResponse: DialMetricListResponse) = apply {
            averageDps = dialMetricListResponse.averageDps
            dials = dialMetricListResponse.dials
            dpsLimit = dialMetricListResponse.dpsLimit
            endTime = dialMetricListResponse.endTime
            peakDps = dialMetricListResponse.peakDps
            recordType = dialMetricListResponse.recordType
            region = dialMetricListResponse.region
            startTime = dialMetricListResponse.startTime
            additionalProperties = dialMetricListResponse.additionalProperties.toMutableMap()
        }

        /**
         * `dials.total` divided by the bucket duration in seconds, rounded to 4 decimal places.
         * Counts every dial attempt, rejected ones included.
         */
        fun averageDps(averageDps: Double) = averageDps(JsonField.of(averageDps))

        /**
         * Sets [Builder.averageDps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.averageDps] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun averageDps(averageDps: JsonField<Double>) = apply { this.averageDps = averageDps }

        /** Dial attempt counts in the bucket. */
        fun dials(dials: Dials) = dials(JsonField.of(dials))

        /**
         * Sets [Builder.dials] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dials] with a well-typed [Dials] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dials(dials: JsonField<Dials>) = apply { this.dials = dials }

        /**
         * DPS limit in force during the busiest 5-second window, so it compares directly with
         * `peak_dps`. `null` means unlimited. Enforcement near the limit is approximate;
         * `dials.rejected.dps_limit` is the authoritative signal that the limit was reached.
         */
        fun dpsLimit(dpsLimit: Long?) = dpsLimit(JsonField.ofNullable(dpsLimit))

        /**
         * Alias for [Builder.dpsLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun dpsLimit(dpsLimit: Long) = dpsLimit(dpsLimit as Long?)

        /** Alias for calling [Builder.dpsLimit] with `dpsLimit.orElse(null)`. */
        fun dpsLimit(dpsLimit: Optional<Long>) = dpsLimit(dpsLimit.getOrNull())

        /**
         * Sets [Builder.dpsLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dpsLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dpsLimit(dpsLimit: JsonField<Long>) = apply { this.dpsLimit = dpsLimit }

        /**
         * End of the bucket (exclusive), UTC. Five seconds, one minute or one hour after
         * `start_time`, depending on `granularity`.
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

        /**
         * Dials per second, rounded to 4 decimal places, in the busiest 5-second window of the
         * bucket, summed across all call-processing nodes of the region. Counts every dial attempt,
         * rejected ones included, so `peak_dps` above `dps_limit` is expected when dials were
         * rejected. For `granularity=second` it equals `average_dps`.
         */
        fun peakDps(peakDps: Double) = peakDps(JsonField.of(peakDps))

        /**
         * Sets [Builder.peakDps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.peakDps] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun peakDps(peakDps: JsonField<Double>) = apply { this.peakDps = peakDps }

        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        /**
         * Region where the dials were handled. Current values are `us`, `eu`, `australia`,
         * `middle_east`, `canada` and `india`. New values can be added, so clients must tolerate
         * values not listed here. Buckets of different regions are separate records.
         */
        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

        /** Start of the bucket (inclusive), UTC. */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

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
         * Returns an immutable instance of [DialMetricListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DialMetricListResponse =
            DialMetricListResponse(
                averageDps,
                dials,
                dpsLimit,
                endTime,
                peakDps,
                recordType,
                region,
                startTime,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): DialMetricListResponse = apply {
        if (validated) {
            return@apply
        }

        averageDps()
        dials().ifPresent { it.validate() }
        dpsLimit()
        endTime()
        peakDps()
        recordType().ifPresent { it.validate() }
        region()
        startTime()
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
        (if (averageDps.asKnown().isPresent) 1 else 0) +
            (dials.asKnown().getOrNull()?.validity() ?: 0) +
            (if (dpsLimit.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (peakDps.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (region.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0)

    /** Dial attempt counts in the bucket. */
    class Dials
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accepted: JsonField<Long>,
        private val rejected: JsonField<Rejected>,
        private val total: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accepted") @ExcludeMissing accepted: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("rejected")
            @ExcludeMissing
            rejected: JsonField<Rejected> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
        ) : this(accepted, rejected, total, mutableMapOf())

        /**
         * Dial attempts that were not rejected by a limit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accepted(): Optional<Long> = accepted.getOptional("accepted")

        /**
         * Dial attempts rejected by a limit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rejected(): Optional<Rejected> = rejected.getOptional("rejected")

        /**
         * All dial attempts, rejected ones included: accepted plus every rejected count.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun total(): Optional<Long> = total.getOptional("total")

        /**
         * Returns the raw JSON value of [accepted].
         *
         * Unlike [accepted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accepted") @ExcludeMissing fun _accepted(): JsonField<Long> = accepted

        /**
         * Returns the raw JSON value of [rejected].
         *
         * Unlike [rejected], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rejected") @ExcludeMissing fun _rejected(): JsonField<Rejected> = rejected

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

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

            /** Returns a mutable builder for constructing an instance of [Dials]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Dials]. */
        class Builder internal constructor() {

            private var accepted: JsonField<Long> = JsonMissing.of()
            private var rejected: JsonField<Rejected> = JsonMissing.of()
            private var total: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dials: Dials) = apply {
                accepted = dials.accepted
                rejected = dials.rejected
                total = dials.total
                additionalProperties = dials.additionalProperties.toMutableMap()
            }

            /** Dial attempts that were not rejected by a limit. */
            fun accepted(accepted: Long) = accepted(JsonField.of(accepted))

            /**
             * Sets [Builder.accepted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accepted] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accepted(accepted: JsonField<Long>) = apply { this.accepted = accepted }

            /** Dial attempts rejected by a limit. */
            fun rejected(rejected: Rejected) = rejected(JsonField.of(rejected))

            /**
             * Sets [Builder.rejected] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rejected] with a well-typed [Rejected] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rejected(rejected: JsonField<Rejected>) = apply { this.rejected = rejected }

            /** All dial attempts, rejected ones included: accepted plus every rejected count. */
            fun total(total: Long) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun total(total: JsonField<Long>) = apply { this.total = total }

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
             * Returns an immutable instance of [Dials].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Dials =
                Dials(accepted, rejected, total, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Dials = apply {
            if (validated) {
                return@apply
            }

            accepted()
            rejected().ifPresent { it.validate() }
            total()
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
            (if (accepted.asKnown().isPresent) 1 else 0) +
                (rejected.asKnown().getOrNull()?.validity() ?: 0) +
                (if (total.asKnown().isPresent) 1 else 0)

        /** Dial attempts rejected by a limit. */
        class Rejected
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val dailyLimit: JsonField<Long>,
            private val dpsLimit: JsonField<Long>,
            private val hourlyLimit: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("daily_limit")
                @ExcludeMissing
                dailyLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("dps_limit")
                @ExcludeMissing
                dpsLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("hourly_limit")
                @ExcludeMissing
                hourlyLimit: JsonField<Long> = JsonMissing.of(),
            ) : this(dailyLimit, dpsLimit, hourlyLimit, mutableMapOf())

            /**
             * Rejected by a daily limit.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun dailyLimit(): Optional<Long> = dailyLimit.getOptional("daily_limit")

            /**
             * Rejected by the dials-per-second limit.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun dpsLimit(): Optional<Long> = dpsLimit.getOptional("dps_limit")

            /**
             * Rejected by an hourly limit.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hourlyLimit(): Optional<Long> = hourlyLimit.getOptional("hourly_limit")

            /**
             * Returns the raw JSON value of [dailyLimit].
             *
             * Unlike [dailyLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("daily_limit")
            @ExcludeMissing
            fun _dailyLimit(): JsonField<Long> = dailyLimit

            /**
             * Returns the raw JSON value of [dpsLimit].
             *
             * Unlike [dpsLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dps_limit") @ExcludeMissing fun _dpsLimit(): JsonField<Long> = dpsLimit

            /**
             * Returns the raw JSON value of [hourlyLimit].
             *
             * Unlike [hourlyLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("hourly_limit")
            @ExcludeMissing
            fun _hourlyLimit(): JsonField<Long> = hourlyLimit

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

                /** Returns a mutable builder for constructing an instance of [Rejected]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Rejected]. */
            class Builder internal constructor() {

                private var dailyLimit: JsonField<Long> = JsonMissing.of()
                private var dpsLimit: JsonField<Long> = JsonMissing.of()
                private var hourlyLimit: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(rejected: Rejected) = apply {
                    dailyLimit = rejected.dailyLimit
                    dpsLimit = rejected.dpsLimit
                    hourlyLimit = rejected.hourlyLimit
                    additionalProperties = rejected.additionalProperties.toMutableMap()
                }

                /** Rejected by a daily limit. */
                fun dailyLimit(dailyLimit: Long) = dailyLimit(JsonField.of(dailyLimit))

                /**
                 * Sets [Builder.dailyLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dailyLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dailyLimit(dailyLimit: JsonField<Long>) = apply { this.dailyLimit = dailyLimit }

                /** Rejected by the dials-per-second limit. */
                fun dpsLimit(dpsLimit: Long) = dpsLimit(JsonField.of(dpsLimit))

                /**
                 * Sets [Builder.dpsLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dpsLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dpsLimit(dpsLimit: JsonField<Long>) = apply { this.dpsLimit = dpsLimit }

                /** Rejected by an hourly limit. */
                fun hourlyLimit(hourlyLimit: Long) = hourlyLimit(JsonField.of(hourlyLimit))

                /**
                 * Sets [Builder.hourlyLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hourlyLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hourlyLimit(hourlyLimit: JsonField<Long>) = apply {
                    this.hourlyLimit = hourlyLimit
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
                 * Returns an immutable instance of [Rejected].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Rejected =
                    Rejected(dailyLimit, dpsLimit, hourlyLimit, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Rejected = apply {
                if (validated) {
                    return@apply
                }

                dailyLimit()
                dpsLimit()
                hourlyLimit()
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
                (if (dailyLimit.asKnown().isPresent) 1 else 0) +
                    (if (dpsLimit.asKnown().isPresent) 1 else 0) +
                    (if (hourlyLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Rejected &&
                    dailyLimit == other.dailyLimit &&
                    dpsLimit == other.dpsLimit &&
                    hourlyLimit == other.hourlyLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(dailyLimit, dpsLimit, hourlyLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Rejected{dailyLimit=$dailyLimit, dpsLimit=$dpsLimit, hourlyLimit=$hourlyLimit, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Dials &&
                accepted == other.accepted &&
                rejected == other.rejected &&
                total == other.total &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accepted, rejected, total, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Dials{accepted=$accepted, rejected=$rejected, total=$total, additionalProperties=$additionalProperties}"
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

            @JvmField val DIAL_METRIC = of("dial_metric")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            DIAL_METRIC
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
            DIAL_METRIC,
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
                DIAL_METRIC -> Value.DIAL_METRIC
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
                DIAL_METRIC -> Known.DIAL_METRIC
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DialMetricListResponse &&
            averageDps == other.averageDps &&
            dials == other.dials &&
            dpsLimit == other.dpsLimit &&
            endTime == other.endTime &&
            peakDps == other.peakDps &&
            recordType == other.recordType &&
            region == other.region &&
            startTime == other.startTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            averageDps,
            dials,
            dpsLimit,
            endTime,
            peakDps,
            recordType,
            region,
            startTime,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DialMetricListResponse{averageDps=$averageDps, dials=$dials, dpsLimit=$dpsLimit, endTime=$endTime, peakDps=$peakDps, recordType=$recordType, region=$region, startTime=$startTime, additionalProperties=$additionalProperties}"
}
