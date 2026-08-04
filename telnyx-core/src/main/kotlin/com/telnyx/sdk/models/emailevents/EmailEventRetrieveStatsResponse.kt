// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailevents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class EmailEventRetrieveStatsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of
         * [EmailEventRetrieveStatsResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailEventRetrieveStatsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailEventRetrieveStatsResponse: EmailEventRetrieveStatsResponse) =
            apply {
                data = emailEventRetrieveStatsResponse.data
                additionalProperties =
                    emailEventRetrieveStatsResponse.additionalProperties.toMutableMap()
            }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [EmailEventRetrieveStatsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailEventRetrieveStatsResponse =
            EmailEventRetrieveStatsResponse(
                checkRequired("data", data),
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
    fun validate(): EmailEventRetrieveStatsResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val counts: JsonField<Counts>,
        private val rates: JsonField<Rates>,
        private val recordType: JsonField<RecordType>,
        private val timeRange: JsonField<TimeRange>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("counts") @ExcludeMissing counts: JsonField<Counts> = JsonMissing.of(),
            @JsonProperty("rates") @ExcludeMissing rates: JsonField<Rates> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
            @JsonProperty("time_range")
            @ExcludeMissing
            timeRange: JsonField<TimeRange> = JsonMissing.of(),
        ) : this(counts, rates, recordType, timeRange, mutableMapOf())

        /**
         * Recipient-level outcome counts for the queried time range. Each to, cc, and bcc recipient
         * counts separately; repeated events of the same type for the same message and recipient
         * count once. Partial MTA injection results count successful recipients as sent and
         * unsuccessful recipients as failed. Only the ten listed event types are counted; other
         * valid event types (scheduled, cancelled, sandbox, sending, rejected) are not included in
         * stats.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun counts(): Counts = counts.getRequired("counts")

        /**
         * Recipient-level event rates as percentages, rounded to 2 decimal places.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rates(): Rates = rates.getRequired("rates")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): RecordType = recordType.getRequired("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timeRange(): TimeRange = timeRange.getRequired("time_range")

        /**
         * Returns the raw JSON value of [counts].
         *
         * Unlike [counts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("counts") @ExcludeMissing fun _counts(): JsonField<Counts> = counts

        /**
         * Returns the raw JSON value of [rates].
         *
         * Unlike [rates], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rates") @ExcludeMissing fun _rates(): JsonField<Rates> = rates

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

        /**
         * Returns the raw JSON value of [timeRange].
         *
         * Unlike [timeRange], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("time_range")
        @ExcludeMissing
        fun _timeRange(): JsonField<TimeRange> = timeRange

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .counts()
             * .rates()
             * .recordType()
             * .timeRange()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var counts: JsonField<Counts>? = null
            private var rates: JsonField<Rates>? = null
            private var recordType: JsonField<RecordType>? = null
            private var timeRange: JsonField<TimeRange>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                counts = data.counts
                rates = data.rates
                recordType = data.recordType
                timeRange = data.timeRange
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * Recipient-level outcome counts for the queried time range. Each to, cc, and bcc
             * recipient counts separately; repeated events of the same type for the same message
             * and recipient count once. Partial MTA injection results count successful recipients
             * as sent and unsuccessful recipients as failed. Only the ten listed event types are
             * counted; other valid event types (scheduled, cancelled, sandbox, sending, rejected)
             * are not included in stats.
             */
            fun counts(counts: Counts) = counts(JsonField.of(counts))

            /**
             * Sets [Builder.counts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.counts] with a well-typed [Counts] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun counts(counts: JsonField<Counts>) = apply { this.counts = counts }

            /** Recipient-level event rates as percentages, rounded to 2 decimal places. */
            fun rates(rates: Rates) = rates(JsonField.of(rates))

            /**
             * Sets [Builder.rates] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rates] with a well-typed [Rates] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rates(rates: JsonField<Rates>) = apply { this.rates = rates }

            fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [RecordType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<RecordType>) = apply {
                this.recordType = recordType
            }

            fun timeRange(timeRange: TimeRange) = timeRange(JsonField.of(timeRange))

            /**
             * Sets [Builder.timeRange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeRange] with a well-typed [TimeRange] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeRange(timeRange: JsonField<TimeRange>) = apply { this.timeRange = timeRange }

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
             *
             * The following fields are required:
             * ```java
             * .counts()
             * .rates()
             * .recordType()
             * .timeRange()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("counts", counts),
                    checkRequired("rates", rates),
                    checkRequired("recordType", recordType),
                    checkRequired("timeRange", timeRange),
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            counts().validate()
            rates().validate()
            recordType().validate()
            timeRange().validate()
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
            (counts.asKnown().getOrNull()?.validity() ?: 0) +
                (rates.asKnown().getOrNull()?.validity() ?: 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (timeRange.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Recipient-level outcome counts for the queried time range. Each to, cc, and bcc recipient
         * counts separately; repeated events of the same type for the same message and recipient
         * count once. Partial MTA injection results count successful recipients as sent and
         * unsuccessful recipients as failed. Only the ten listed event types are counted; other
         * valid event types (scheduled, cancelled, sandbox, sending, rejected) are not included in
         * stats.
         */
        class Counts
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val bounced: JsonField<Long>,
            private val clicked: JsonField<Long>,
            private val complained: JsonField<Long>,
            private val deferred: JsonField<Long>,
            private val delivered: JsonField<Long>,
            private val failed: JsonField<Long>,
            private val opened: JsonField<Long>,
            private val queued: JsonField<Long>,
            private val sent: JsonField<Long>,
            private val unsubscribed: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bounced")
                @ExcludeMissing
                bounced: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("clicked")
                @ExcludeMissing
                clicked: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("complained")
                @ExcludeMissing
                complained: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("deferred")
                @ExcludeMissing
                deferred: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("delivered")
                @ExcludeMissing
                delivered: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("failed") @ExcludeMissing failed: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("opened") @ExcludeMissing opened: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("queued") @ExcludeMissing queued: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("sent") @ExcludeMissing sent: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("unsubscribed")
                @ExcludeMissing
                unsubscribed: JsonField<Long> = JsonMissing.of(),
            ) : this(
                bounced,
                clicked,
                complained,
                deferred,
                delivered,
                failed,
                opened,
                queued,
                sent,
                unsubscribed,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bounced(): Long = bounced.getRequired("bounced")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun clicked(): Long = clicked.getRequired("clicked")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun complained(): Long = complained.getRequired("complained")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun deferred(): Long = deferred.getRequired("deferred")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun delivered(): Long = delivered.getRequired("delivered")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun failed(): Long = failed.getRequired("failed")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun opened(): Long = opened.getRequired("opened")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun queued(): Long = queued.getRequired("queued")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sent(): Long = sent.getRequired("sent")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unsubscribed(): Long = unsubscribed.getRequired("unsubscribed")

            /**
             * Returns the raw JSON value of [bounced].
             *
             * Unlike [bounced], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("bounced") @ExcludeMissing fun _bounced(): JsonField<Long> = bounced

            /**
             * Returns the raw JSON value of [clicked].
             *
             * Unlike [clicked], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("clicked") @ExcludeMissing fun _clicked(): JsonField<Long> = clicked

            /**
             * Returns the raw JSON value of [complained].
             *
             * Unlike [complained], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("complained")
            @ExcludeMissing
            fun _complained(): JsonField<Long> = complained

            /**
             * Returns the raw JSON value of [deferred].
             *
             * Unlike [deferred], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("deferred") @ExcludeMissing fun _deferred(): JsonField<Long> = deferred

            /**
             * Returns the raw JSON value of [delivered].
             *
             * Unlike [delivered], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("delivered") @ExcludeMissing fun _delivered(): JsonField<Long> = delivered

            /**
             * Returns the raw JSON value of [failed].
             *
             * Unlike [failed], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("failed") @ExcludeMissing fun _failed(): JsonField<Long> = failed

            /**
             * Returns the raw JSON value of [opened].
             *
             * Unlike [opened], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("opened") @ExcludeMissing fun _opened(): JsonField<Long> = opened

            /**
             * Returns the raw JSON value of [queued].
             *
             * Unlike [queued], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("queued") @ExcludeMissing fun _queued(): JsonField<Long> = queued

            /**
             * Returns the raw JSON value of [sent].
             *
             * Unlike [sent], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sent") @ExcludeMissing fun _sent(): JsonField<Long> = sent

            /**
             * Returns the raw JSON value of [unsubscribed].
             *
             * Unlike [unsubscribed], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unsubscribed")
            @ExcludeMissing
            fun _unsubscribed(): JsonField<Long> = unsubscribed

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
                 * Returns a mutable builder for constructing an instance of [Counts].
                 *
                 * The following fields are required:
                 * ```java
                 * .bounced()
                 * .clicked()
                 * .complained()
                 * .deferred()
                 * .delivered()
                 * .failed()
                 * .opened()
                 * .queued()
                 * .sent()
                 * .unsubscribed()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Counts]. */
            class Builder internal constructor() {

                private var bounced: JsonField<Long>? = null
                private var clicked: JsonField<Long>? = null
                private var complained: JsonField<Long>? = null
                private var deferred: JsonField<Long>? = null
                private var delivered: JsonField<Long>? = null
                private var failed: JsonField<Long>? = null
                private var opened: JsonField<Long>? = null
                private var queued: JsonField<Long>? = null
                private var sent: JsonField<Long>? = null
                private var unsubscribed: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(counts: Counts) = apply {
                    bounced = counts.bounced
                    clicked = counts.clicked
                    complained = counts.complained
                    deferred = counts.deferred
                    delivered = counts.delivered
                    failed = counts.failed
                    opened = counts.opened
                    queued = counts.queued
                    sent = counts.sent
                    unsubscribed = counts.unsubscribed
                    additionalProperties = counts.additionalProperties.toMutableMap()
                }

                fun bounced(bounced: Long) = bounced(JsonField.of(bounced))

                /**
                 * Sets [Builder.bounced] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bounced] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun bounced(bounced: JsonField<Long>) = apply { this.bounced = bounced }

                fun clicked(clicked: Long) = clicked(JsonField.of(clicked))

                /**
                 * Sets [Builder.clicked] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clicked] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun clicked(clicked: JsonField<Long>) = apply { this.clicked = clicked }

                fun complained(complained: Long) = complained(JsonField.of(complained))

                /**
                 * Sets [Builder.complained] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.complained] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun complained(complained: JsonField<Long>) = apply { this.complained = complained }

                fun deferred(deferred: Long) = deferred(JsonField.of(deferred))

                /**
                 * Sets [Builder.deferred] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deferred] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun deferred(deferred: JsonField<Long>) = apply { this.deferred = deferred }

                fun delivered(delivered: Long) = delivered(JsonField.of(delivered))

                /**
                 * Sets [Builder.delivered] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.delivered] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun delivered(delivered: JsonField<Long>) = apply { this.delivered = delivered }

                fun failed(failed: Long) = failed(JsonField.of(failed))

                /**
                 * Sets [Builder.failed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.failed] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun failed(failed: JsonField<Long>) = apply { this.failed = failed }

                fun opened(opened: Long) = opened(JsonField.of(opened))

                /**
                 * Sets [Builder.opened] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.opened] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun opened(opened: JsonField<Long>) = apply { this.opened = opened }

                fun queued(queued: Long) = queued(JsonField.of(queued))

                /**
                 * Sets [Builder.queued] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.queued] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun queued(queued: JsonField<Long>) = apply { this.queued = queued }

                fun sent(sent: Long) = sent(JsonField.of(sent))

                /**
                 * Sets [Builder.sent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sent] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun sent(sent: JsonField<Long>) = apply { this.sent = sent }

                fun unsubscribed(unsubscribed: Long) = unsubscribed(JsonField.of(unsubscribed))

                /**
                 * Sets [Builder.unsubscribed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unsubscribed] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unsubscribed(unsubscribed: JsonField<Long>) = apply {
                    this.unsubscribed = unsubscribed
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
                 * Returns an immutable instance of [Counts].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .bounced()
                 * .clicked()
                 * .complained()
                 * .deferred()
                 * .delivered()
                 * .failed()
                 * .opened()
                 * .queued()
                 * .sent()
                 * .unsubscribed()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Counts =
                    Counts(
                        checkRequired("bounced", bounced),
                        checkRequired("clicked", clicked),
                        checkRequired("complained", complained),
                        checkRequired("deferred", deferred),
                        checkRequired("delivered", delivered),
                        checkRequired("failed", failed),
                        checkRequired("opened", opened),
                        checkRequired("queued", queued),
                        checkRequired("sent", sent),
                        checkRequired("unsubscribed", unsubscribed),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Counts = apply {
                if (validated) {
                    return@apply
                }

                bounced()
                clicked()
                complained()
                deferred()
                delivered()
                failed()
                opened()
                queued()
                sent()
                unsubscribed()
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
                (if (bounced.asKnown().isPresent) 1 else 0) +
                    (if (clicked.asKnown().isPresent) 1 else 0) +
                    (if (complained.asKnown().isPresent) 1 else 0) +
                    (if (deferred.asKnown().isPresent) 1 else 0) +
                    (if (delivered.asKnown().isPresent) 1 else 0) +
                    (if (failed.asKnown().isPresent) 1 else 0) +
                    (if (opened.asKnown().isPresent) 1 else 0) +
                    (if (queued.asKnown().isPresent) 1 else 0) +
                    (if (sent.asKnown().isPresent) 1 else 0) +
                    (if (unsubscribed.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Counts &&
                    bounced == other.bounced &&
                    clicked == other.clicked &&
                    complained == other.complained &&
                    deferred == other.deferred &&
                    delivered == other.delivered &&
                    failed == other.failed &&
                    opened == other.opened &&
                    queued == other.queued &&
                    sent == other.sent &&
                    unsubscribed == other.unsubscribed &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    bounced,
                    clicked,
                    complained,
                    deferred,
                    delivered,
                    failed,
                    opened,
                    queued,
                    sent,
                    unsubscribed,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Counts{bounced=$bounced, clicked=$clicked, complained=$complained, deferred=$deferred, delivered=$delivered, failed=$failed, opened=$opened, queued=$queued, sent=$sent, unsubscribed=$unsubscribed, additionalProperties=$additionalProperties}"
        }

        /** Recipient-level event rates as percentages, rounded to 2 decimal places. */
        class Rates
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val bounceRate: JsonField<Float>,
            private val clickRate: JsonField<Float>,
            private val complaintRate: JsonField<Float>,
            private val deferredRate: JsonField<Float>,
            private val deliveryRate: JsonField<Float>,
            private val openRate: JsonField<Float>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bounce_rate")
                @ExcludeMissing
                bounceRate: JsonField<Float> = JsonMissing.of(),
                @JsonProperty("click_rate")
                @ExcludeMissing
                clickRate: JsonField<Float> = JsonMissing.of(),
                @JsonProperty("complaint_rate")
                @ExcludeMissing
                complaintRate: JsonField<Float> = JsonMissing.of(),
                @JsonProperty("deferred_rate")
                @ExcludeMissing
                deferredRate: JsonField<Float> = JsonMissing.of(),
                @JsonProperty("delivery_rate")
                @ExcludeMissing
                deliveryRate: JsonField<Float> = JsonMissing.of(),
                @JsonProperty("open_rate")
                @ExcludeMissing
                openRate: JsonField<Float> = JsonMissing.of(),
            ) : this(
                bounceRate,
                clickRate,
                complaintRate,
                deferredRate,
                deliveryRate,
                openRate,
                mutableMapOf(),
            )

            /**
             * Bounced recipients / queued recipients as a percentage.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bounceRate(): Float = bounceRate.getRequired("bounce_rate")

            /**
             * Recipients clicked / recipients opened as a percentage.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun clickRate(): Float = clickRate.getRequired("click_rate")

            /**
             * Recipients with a complaint feedback report / delivered recipients as a percentage.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun complaintRate(): Float = complaintRate.getRequired("complaint_rate")

            /**
             * Deferred recipients / queued recipients as a percentage.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun deferredRate(): Float = deferredRate.getRequired("deferred_rate")

            /**
             * Delivered recipients / queued recipients as a percentage.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun deliveryRate(): Float = deliveryRate.getRequired("delivery_rate")

            /**
             * Recipients opened / recipients delivered as a percentage.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun openRate(): Float = openRate.getRequired("open_rate")

            /**
             * Returns the raw JSON value of [bounceRate].
             *
             * Unlike [bounceRate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bounce_rate")
            @ExcludeMissing
            fun _bounceRate(): JsonField<Float> = bounceRate

            /**
             * Returns the raw JSON value of [clickRate].
             *
             * Unlike [clickRate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("click_rate")
            @ExcludeMissing
            fun _clickRate(): JsonField<Float> = clickRate

            /**
             * Returns the raw JSON value of [complaintRate].
             *
             * Unlike [complaintRate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("complaint_rate")
            @ExcludeMissing
            fun _complaintRate(): JsonField<Float> = complaintRate

            /**
             * Returns the raw JSON value of [deferredRate].
             *
             * Unlike [deferredRate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("deferred_rate")
            @ExcludeMissing
            fun _deferredRate(): JsonField<Float> = deferredRate

            /**
             * Returns the raw JSON value of [deliveryRate].
             *
             * Unlike [deliveryRate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("delivery_rate")
            @ExcludeMissing
            fun _deliveryRate(): JsonField<Float> = deliveryRate

            /**
             * Returns the raw JSON value of [openRate].
             *
             * Unlike [openRate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("open_rate") @ExcludeMissing fun _openRate(): JsonField<Float> = openRate

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
                 * Returns a mutable builder for constructing an instance of [Rates].
                 *
                 * The following fields are required:
                 * ```java
                 * .bounceRate()
                 * .clickRate()
                 * .complaintRate()
                 * .deferredRate()
                 * .deliveryRate()
                 * .openRate()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Rates]. */
            class Builder internal constructor() {

                private var bounceRate: JsonField<Float>? = null
                private var clickRate: JsonField<Float>? = null
                private var complaintRate: JsonField<Float>? = null
                private var deferredRate: JsonField<Float>? = null
                private var deliveryRate: JsonField<Float>? = null
                private var openRate: JsonField<Float>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(rates: Rates) = apply {
                    bounceRate = rates.bounceRate
                    clickRate = rates.clickRate
                    complaintRate = rates.complaintRate
                    deferredRate = rates.deferredRate
                    deliveryRate = rates.deliveryRate
                    openRate = rates.openRate
                    additionalProperties = rates.additionalProperties.toMutableMap()
                }

                /** Bounced recipients / queued recipients as a percentage. */
                fun bounceRate(bounceRate: Float) = bounceRate(JsonField.of(bounceRate))

                /**
                 * Sets [Builder.bounceRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bounceRate] with a well-typed [Float] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bounceRate(bounceRate: JsonField<Float>) = apply {
                    this.bounceRate = bounceRate
                }

                /** Recipients clicked / recipients opened as a percentage. */
                fun clickRate(clickRate: Float) = clickRate(JsonField.of(clickRate))

                /**
                 * Sets [Builder.clickRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clickRate] with a well-typed [Float] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clickRate(clickRate: JsonField<Float>) = apply { this.clickRate = clickRate }

                /**
                 * Recipients with a complaint feedback report / delivered recipients as a
                 * percentage.
                 */
                fun complaintRate(complaintRate: Float) = complaintRate(JsonField.of(complaintRate))

                /**
                 * Sets [Builder.complaintRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.complaintRate] with a well-typed [Float] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun complaintRate(complaintRate: JsonField<Float>) = apply {
                    this.complaintRate = complaintRate
                }

                /** Deferred recipients / queued recipients as a percentage. */
                fun deferredRate(deferredRate: Float) = deferredRate(JsonField.of(deferredRate))

                /**
                 * Sets [Builder.deferredRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deferredRate] with a well-typed [Float] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun deferredRate(deferredRate: JsonField<Float>) = apply {
                    this.deferredRate = deferredRate
                }

                /** Delivered recipients / queued recipients as a percentage. */
                fun deliveryRate(deliveryRate: Float) = deliveryRate(JsonField.of(deliveryRate))

                /**
                 * Sets [Builder.deliveryRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deliveryRate] with a well-typed [Float] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun deliveryRate(deliveryRate: JsonField<Float>) = apply {
                    this.deliveryRate = deliveryRate
                }

                /** Recipients opened / recipients delivered as a percentage. */
                fun openRate(openRate: Float) = openRate(JsonField.of(openRate))

                /**
                 * Sets [Builder.openRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.openRate] with a well-typed [Float] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun openRate(openRate: JsonField<Float>) = apply { this.openRate = openRate }

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
                 * Returns an immutable instance of [Rates].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .bounceRate()
                 * .clickRate()
                 * .complaintRate()
                 * .deferredRate()
                 * .deliveryRate()
                 * .openRate()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Rates =
                    Rates(
                        checkRequired("bounceRate", bounceRate),
                        checkRequired("clickRate", clickRate),
                        checkRequired("complaintRate", complaintRate),
                        checkRequired("deferredRate", deferredRate),
                        checkRequired("deliveryRate", deliveryRate),
                        checkRequired("openRate", openRate),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Rates = apply {
                if (validated) {
                    return@apply
                }

                bounceRate()
                clickRate()
                complaintRate()
                deferredRate()
                deliveryRate()
                openRate()
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
                (if (bounceRate.asKnown().isPresent) 1 else 0) +
                    (if (clickRate.asKnown().isPresent) 1 else 0) +
                    (if (complaintRate.asKnown().isPresent) 1 else 0) +
                    (if (deferredRate.asKnown().isPresent) 1 else 0) +
                    (if (deliveryRate.asKnown().isPresent) 1 else 0) +
                    (if (openRate.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Rates &&
                    bounceRate == other.bounceRate &&
                    clickRate == other.clickRate &&
                    complaintRate == other.complaintRate &&
                    deferredRate == other.deferredRate &&
                    deliveryRate == other.deliveryRate &&
                    openRate == other.openRate &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    bounceRate,
                    clickRate,
                    complaintRate,
                    deferredRate,
                    deliveryRate,
                    openRate,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Rates{bounceRate=$bounceRate, clickRate=$clickRate, complaintRate=$complaintRate, deferredRate=$deferredRate, deliveryRate=$deliveryRate, openRate=$openRate, additionalProperties=$additionalProperties}"
        }

        class RecordType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val EMAIL_EVENT_STATS = of("email_event_stats")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                EMAIL_EVENT_STATS
            }

            /**
             * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RecordType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EMAIL_EVENT_STATS,
                /**
                 * An enum member indicating that [RecordType] was instantiated with an unknown
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
                    EMAIL_EVENT_STATS -> Value.EMAIL_EVENT_STATS
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
                    EMAIL_EVENT_STATS -> Known.EMAIL_EVENT_STATS
                    else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

            return other is Data &&
                counts == other.counts &&
                rates == other.rates &&
                recordType == other.recordType &&
                timeRange == other.timeRange &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(counts, rates, recordType, timeRange, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{counts=$counts, rates=$rates, recordType=$recordType, timeRange=$timeRange, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailEventRetrieveStatsResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailEventRetrieveStatsResponse{data=$data, additionalProperties=$additionalProperties}"
}
