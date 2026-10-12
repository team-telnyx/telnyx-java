// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NumberRetrieveOwnershipResponse
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
         * [NumberRetrieveOwnershipResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberRetrieveOwnershipResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(numberRetrieveOwnershipResponse: NumberRetrieveOwnershipResponse) =
            apply {
                data = numberRetrieveOwnershipResponse.data
                additionalProperties =
                    numberRetrieveOwnershipResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [NumberRetrieveOwnershipResponse].
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
        fun build(): NumberRetrieveOwnershipResponse =
            NumberRetrieveOwnershipResponse(
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
    fun validate(): NumberRetrieveOwnershipResponse = apply {
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
        private val baselineCarrier: JsonField<String>,
        private val baselineRecordedAt: JsonField<OffsetDateTime>,
        private val confirmBy: JsonField<OffsetDateTime>,
        private val flagReason: JsonField<String>,
        private val history: JsonField<List<History>>,
        private val lastCheckedAt: JsonField<OffsetDateTime>,
        private val ownershipStatus: JsonField<ReputationOwnershipStatus>,
        private val phoneNumber: JsonField<String>,
        private val source: JsonField<ReputationNumberSource>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("baseline_carrier")
            @ExcludeMissing
            baselineCarrier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("baseline_recorded_at")
            @ExcludeMissing
            baselineRecordedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("confirm_by")
            @ExcludeMissing
            confirmBy: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("flag_reason")
            @ExcludeMissing
            flagReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("history")
            @ExcludeMissing
            history: JsonField<List<History>> = JsonMissing.of(),
            @JsonProperty("last_checked_at")
            @ExcludeMissing
            lastCheckedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ownership_status")
            @ExcludeMissing
            ownershipStatus: JsonField<ReputationOwnershipStatus> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source")
            @ExcludeMissing
            source: JsonField<ReputationNumberSource> = JsonMissing.of(),
        ) : this(
            baselineCarrier,
            baselineRecordedAt,
            confirmBy,
            flagReason,
            history,
            lastCheckedAt,
            ownershipStatus,
            phoneNumber,
            source,
            mutableMapOf(),
        )

        /**
         * Service provider ID (SPID) of the carrier that held the number when its ownership was
         * last established.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun baselineCarrier(): Optional<String> = baselineCarrier.getOptional("baseline_carrier")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun baselineRecordedAt(): Optional<OffsetDateTime> =
            baselineRecordedAt.getOptional("baseline_recorded_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun confirmBy(): Optional<OffsetDateTime> = confirmBy.getOptional("confirm_by")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun flagReason(): Optional<String> = flagReason.getOptional("flag_reason")

        /**
         * Ownership events, most recent first.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun history(): Optional<List<History>> = history.getOptional("history")

        /**
         * When ownership of the number was last checked.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastCheckedAt(): Optional<OffsetDateTime> = lastCheckedAt.getOptional("last_checked_at")

        /**
         * Result of ongoing ownership checks. `verified`: the number is with the carrier on record.
         * `pending_confirmation`: the number's carrier changed, or a periodic ownership
         * re-verification is due; confirm you still own it before `confirm_by`. `flagged`: a
         * periodic re-verification went unanswered; the number stays monitored and is not removed,
         * but confirm ownership (`POST .../ownership_confirm`) to return it to `verified`.
         * `removed`: the number is no longer monitored; returned by `POST .../ownership_confirm`
         * with `still_own: false`, and when listing numbers with
         * `filter[ownership_status]=removed`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ownershipStatus(): Optional<ReputationOwnershipStatus> =
            ownershipStatus.getOptional("ownership_status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Where the phone number is hosted. `telnyx`: in your Telnyx inventory. `external`: a
         * number you own that is hosted with another provider.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun source(): Optional<ReputationNumberSource> = source.getOptional("source")

        /**
         * Returns the raw JSON value of [baselineCarrier].
         *
         * Unlike [baselineCarrier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("baseline_carrier")
        @ExcludeMissing
        fun _baselineCarrier(): JsonField<String> = baselineCarrier

        /**
         * Returns the raw JSON value of [baselineRecordedAt].
         *
         * Unlike [baselineRecordedAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("baseline_recorded_at")
        @ExcludeMissing
        fun _baselineRecordedAt(): JsonField<OffsetDateTime> = baselineRecordedAt

        /**
         * Returns the raw JSON value of [confirmBy].
         *
         * Unlike [confirmBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confirm_by")
        @ExcludeMissing
        fun _confirmBy(): JsonField<OffsetDateTime> = confirmBy

        /**
         * Returns the raw JSON value of [flagReason].
         *
         * Unlike [flagReason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("flag_reason")
        @ExcludeMissing
        fun _flagReason(): JsonField<String> = flagReason

        /**
         * Returns the raw JSON value of [history].
         *
         * Unlike [history], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("history") @ExcludeMissing fun _history(): JsonField<List<History>> = history

        /**
         * Returns the raw JSON value of [lastCheckedAt].
         *
         * Unlike [lastCheckedAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("last_checked_at")
        @ExcludeMissing
        fun _lastCheckedAt(): JsonField<OffsetDateTime> = lastCheckedAt

        /**
         * Returns the raw JSON value of [ownershipStatus].
         *
         * Unlike [ownershipStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ownership_status")
        @ExcludeMissing
        fun _ownershipStatus(): JsonField<ReputationOwnershipStatus> = ownershipStatus

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source")
        @ExcludeMissing
        fun _source(): JsonField<ReputationNumberSource> = source

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

            private var baselineCarrier: JsonField<String> = JsonMissing.of()
            private var baselineRecordedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var confirmBy: JsonField<OffsetDateTime> = JsonMissing.of()
            private var flagReason: JsonField<String> = JsonMissing.of()
            private var history: JsonField<MutableList<History>>? = null
            private var lastCheckedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var ownershipStatus: JsonField<ReputationOwnershipStatus> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var source: JsonField<ReputationNumberSource> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                baselineCarrier = data.baselineCarrier
                baselineRecordedAt = data.baselineRecordedAt
                confirmBy = data.confirmBy
                flagReason = data.flagReason
                history = data.history.map { it.toMutableList() }
                lastCheckedAt = data.lastCheckedAt
                ownershipStatus = data.ownershipStatus
                phoneNumber = data.phoneNumber
                source = data.source
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * Service provider ID (SPID) of the carrier that held the number when its ownership was
             * last established.
             */
            fun baselineCarrier(baselineCarrier: String?) =
                baselineCarrier(JsonField.ofNullable(baselineCarrier))

            /** Alias for calling [Builder.baselineCarrier] with `baselineCarrier.orElse(null)`. */
            fun baselineCarrier(baselineCarrier: Optional<String>) =
                baselineCarrier(baselineCarrier.getOrNull())

            /**
             * Sets [Builder.baselineCarrier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baselineCarrier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baselineCarrier(baselineCarrier: JsonField<String>) = apply {
                this.baselineCarrier = baselineCarrier
            }

            fun baselineRecordedAt(baselineRecordedAt: OffsetDateTime?) =
                baselineRecordedAt(JsonField.ofNullable(baselineRecordedAt))

            /**
             * Alias for calling [Builder.baselineRecordedAt] with
             * `baselineRecordedAt.orElse(null)`.
             */
            fun baselineRecordedAt(baselineRecordedAt: Optional<OffsetDateTime>) =
                baselineRecordedAt(baselineRecordedAt.getOrNull())

            /**
             * Sets [Builder.baselineRecordedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baselineRecordedAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun baselineRecordedAt(baselineRecordedAt: JsonField<OffsetDateTime>) = apply {
                this.baselineRecordedAt = baselineRecordedAt
            }

            fun confirmBy(confirmBy: OffsetDateTime?) = confirmBy(JsonField.ofNullable(confirmBy))

            /** Alias for calling [Builder.confirmBy] with `confirmBy.orElse(null)`. */
            fun confirmBy(confirmBy: Optional<OffsetDateTime>) = confirmBy(confirmBy.getOrNull())

            /**
             * Sets [Builder.confirmBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confirmBy] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confirmBy(confirmBy: JsonField<OffsetDateTime>) = apply {
                this.confirmBy = confirmBy
            }

            fun flagReason(flagReason: String?) = flagReason(JsonField.ofNullable(flagReason))

            /** Alias for calling [Builder.flagReason] with `flagReason.orElse(null)`. */
            fun flagReason(flagReason: Optional<String>) = flagReason(flagReason.getOrNull())

            /**
             * Sets [Builder.flagReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.flagReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun flagReason(flagReason: JsonField<String>) = apply { this.flagReason = flagReason }

            /** Ownership events, most recent first. */
            fun history(history: List<History>) = history(JsonField.of(history))

            /**
             * Sets [Builder.history] to an arbitrary JSON value.
             *
             * You should usually call [Builder.history] with a well-typed `List<History>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun history(history: JsonField<List<History>>) = apply {
                this.history = history.map { it.toMutableList() }
            }

            /**
             * Adds a single [History] to [Builder.history].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addHistory(history: History) = apply {
                this.history =
                    (this.history ?: JsonField.of(mutableListOf())).also {
                        checkKnown("history", it).add(history)
                    }
            }

            /** When ownership of the number was last checked. */
            fun lastCheckedAt(lastCheckedAt: OffsetDateTime?) =
                lastCheckedAt(JsonField.ofNullable(lastCheckedAt))

            /** Alias for calling [Builder.lastCheckedAt] with `lastCheckedAt.orElse(null)`. */
            fun lastCheckedAt(lastCheckedAt: Optional<OffsetDateTime>) =
                lastCheckedAt(lastCheckedAt.getOrNull())

            /**
             * Sets [Builder.lastCheckedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastCheckedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lastCheckedAt(lastCheckedAt: JsonField<OffsetDateTime>) = apply {
                this.lastCheckedAt = lastCheckedAt
            }

            /**
             * Result of ongoing ownership checks. `verified`: the number is with the carrier on
             * record. `pending_confirmation`: the number's carrier changed, or a periodic ownership
             * re-verification is due; confirm you still own it before `confirm_by`. `flagged`: a
             * periodic re-verification went unanswered; the number stays monitored and is not
             * removed, but confirm ownership (`POST .../ownership_confirm`) to return it to
             * `verified`. `removed`: the number is no longer monitored; returned by `POST
             * .../ownership_confirm` with `still_own: false`, and when listing numbers with
             * `filter[ownership_status]=removed`.
             */
            fun ownershipStatus(ownershipStatus: ReputationOwnershipStatus) =
                ownershipStatus(JsonField.of(ownershipStatus))

            /**
             * Sets [Builder.ownershipStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ownershipStatus] with a well-typed
             * [ReputationOwnershipStatus] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun ownershipStatus(ownershipStatus: JsonField<ReputationOwnershipStatus>) = apply {
                this.ownershipStatus = ownershipStatus
            }

            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /**
             * Where the phone number is hosted. `telnyx`: in your Telnyx inventory. `external`: a
             * number you own that is hosted with another provider.
             */
            fun source(source: ReputationNumberSource) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [ReputationNumberSource]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun source(source: JsonField<ReputationNumberSource>) = apply { this.source = source }

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
                    baselineCarrier,
                    baselineRecordedAt,
                    confirmBy,
                    flagReason,
                    (history ?: JsonMissing.of()).map { it.toImmutable() },
                    lastCheckedAt,
                    ownershipStatus,
                    phoneNumber,
                    source,
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

            baselineCarrier()
            baselineRecordedAt()
            confirmBy()
            flagReason()
            history().ifPresent { it.forEach { it.validate() } }
            lastCheckedAt()
            ownershipStatus().ifPresent { it.validate() }
            phoneNumber()
            source().ifPresent { it.validate() }
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
            (if (baselineCarrier.asKnown().isPresent) 1 else 0) +
                (if (baselineRecordedAt.asKnown().isPresent) 1 else 0) +
                (if (confirmBy.asKnown().isPresent) 1 else 0) +
                (if (flagReason.asKnown().isPresent) 1 else 0) +
                (history.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (lastCheckedAt.asKnown().isPresent) 1 else 0) +
                (ownershipStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (source.asKnown().getOrNull()?.validity() ?: 0)

        class History
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val eventType: JsonField<String>,
            private val occurredAt: JsonField<OffsetDateTime>,
            private val outcome: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("event_type")
                @ExcludeMissing
                eventType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("occurred_at")
                @ExcludeMissing
                occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("outcome")
                @ExcludeMissing
                outcome: JsonField<String> = JsonMissing.of(),
            ) : this(eventType, occurredAt, outcome, mutableMapOf())

            /**
             * `added`, `check`, `flag`, `confirm` or `removed`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventType(): Optional<String> = eventType.getOptional("event_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun occurredAt(): Optional<OffsetDateTime> = occurredAt.getOptional("occurred_at")

            /**
             * What the event found or did, for example `unchanged` or `carrier_changed`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun outcome(): Optional<String> = outcome.getOptional("outcome")

            /**
             * Returns the raw JSON value of [eventType].
             *
             * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("event_type")
            @ExcludeMissing
            fun _eventType(): JsonField<String> = eventType

            /**
             * Returns the raw JSON value of [occurredAt].
             *
             * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("occurred_at")
            @ExcludeMissing
            fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

            /**
             * Returns the raw JSON value of [outcome].
             *
             * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<String> = outcome

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

                /** Returns a mutable builder for constructing an instance of [History]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [History]. */
            class Builder internal constructor() {

                private var eventType: JsonField<String> = JsonMissing.of()
                private var occurredAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var outcome: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(history: History) = apply {
                    eventType = history.eventType
                    occurredAt = history.occurredAt
                    outcome = history.outcome
                    additionalProperties = history.additionalProperties.toMutableMap()
                }

                /** `added`, `check`, `flag`, `confirm` or `removed`. */
                fun eventType(eventType: String) = eventType(JsonField.of(eventType))

                /**
                 * Sets [Builder.eventType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

                fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

                /**
                 * Sets [Builder.occurredAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
                    this.occurredAt = occurredAt
                }

                /** What the event found or did, for example `unchanged` or `carrier_changed`. */
                fun outcome(outcome: String?) = outcome(JsonField.ofNullable(outcome))

                /** Alias for calling [Builder.outcome] with `outcome.orElse(null)`. */
                fun outcome(outcome: Optional<String>) = outcome(outcome.getOrNull())

                /**
                 * Sets [Builder.outcome] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.outcome] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun outcome(outcome: JsonField<String>) = apply { this.outcome = outcome }

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
                 * Returns an immutable instance of [History].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): History =
                    History(eventType, occurredAt, outcome, additionalProperties.toMutableMap())
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
            fun validate(): History = apply {
                if (validated) {
                    return@apply
                }

                eventType()
                occurredAt()
                outcome()
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
                (if (eventType.asKnown().isPresent) 1 else 0) +
                    (if (occurredAt.asKnown().isPresent) 1 else 0) +
                    (if (outcome.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is History &&
                    eventType == other.eventType &&
                    occurredAt == other.occurredAt &&
                    outcome == other.outcome &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(eventType, occurredAt, outcome, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "History{eventType=$eventType, occurredAt=$occurredAt, outcome=$outcome, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                baselineCarrier == other.baselineCarrier &&
                baselineRecordedAt == other.baselineRecordedAt &&
                confirmBy == other.confirmBy &&
                flagReason == other.flagReason &&
                history == other.history &&
                lastCheckedAt == other.lastCheckedAt &&
                ownershipStatus == other.ownershipStatus &&
                phoneNumber == other.phoneNumber &&
                source == other.source &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                baselineCarrier,
                baselineRecordedAt,
                confirmBy,
                flagReason,
                history,
                lastCheckedAt,
                ownershipStatus,
                phoneNumber,
                source,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{baselineCarrier=$baselineCarrier, baselineRecordedAt=$baselineRecordedAt, confirmBy=$confirmBy, flagReason=$flagReason, history=$history, lastCheckedAt=$lastCheckedAt, ownershipStatus=$ownershipStatus, phoneNumber=$phoneNumber, source=$source, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberRetrieveOwnershipResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumberRetrieveOwnershipResponse{data=$data, additionalProperties=$additionalProperties}"
}
