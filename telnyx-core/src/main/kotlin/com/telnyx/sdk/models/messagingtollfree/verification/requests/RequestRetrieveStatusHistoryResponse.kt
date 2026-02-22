// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

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

/** A paginated response */
class RequestRetrieveStatusHistoryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val records: JsonField<List<Record>>,
    private val totalRecords: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("records")
        @ExcludeMissing
        records: JsonField<List<Record>> = JsonMissing.of(),
        @JsonProperty("total_records")
        @ExcludeMissing
        totalRecords: JsonField<Long> = JsonMissing.of(),
    ) : this(records, totalRecords, mutableMapOf())

    /**
     * The records yielded by this request
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun records(): List<Record> = records.getRequired("records")

    /**
     * The total amount of records for these query parameters
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalRecords(): Long = totalRecords.getRequired("total_records")

    /**
     * Returns the raw JSON value of [records].
     *
     * Unlike [records], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("records") @ExcludeMissing fun _records(): JsonField<List<Record>> = records

    /**
     * Returns the raw JSON value of [totalRecords].
     *
     * Unlike [totalRecords], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_records")
    @ExcludeMissing
    fun _totalRecords(): JsonField<Long> = totalRecords

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
         * [RequestRetrieveStatusHistoryResponse].
         *
         * The following fields are required:
         * ```java
         * .records()
         * .totalRecords()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RequestRetrieveStatusHistoryResponse]. */
    class Builder internal constructor() {

        private var records: JsonField<MutableList<Record>>? = null
        private var totalRecords: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            requestRetrieveStatusHistoryResponse: RequestRetrieveStatusHistoryResponse
        ) = apply {
            records = requestRetrieveStatusHistoryResponse.records.map { it.toMutableList() }
            totalRecords = requestRetrieveStatusHistoryResponse.totalRecords
            additionalProperties =
                requestRetrieveStatusHistoryResponse.additionalProperties.toMutableMap()
        }

        /** The records yielded by this request */
        fun records(records: List<Record>) = records(JsonField.of(records))

        /**
         * Sets [Builder.records] to an arbitrary JSON value.
         *
         * You should usually call [Builder.records] with a well-typed `List<Record>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun records(records: JsonField<List<Record>>) = apply {
            this.records = records.map { it.toMutableList() }
        }

        /**
         * Adds a single [Record] to [records].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecord(record: Record) = apply {
            records =
                (records ?: JsonField.of(mutableListOf())).also {
                    checkKnown("records", it).add(record)
                }
        }

        /** The total amount of records for these query parameters */
        fun totalRecords(totalRecords: Long) = totalRecords(JsonField.of(totalRecords))

        /**
         * Sets [Builder.totalRecords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalRecords] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalRecords(totalRecords: JsonField<Long>) = apply { this.totalRecords = totalRecords }

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
         * Returns an immutable instance of [RequestRetrieveStatusHistoryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .records()
         * .totalRecords()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RequestRetrieveStatusHistoryResponse =
            RequestRetrieveStatusHistoryResponse(
                checkRequired("records", records).map { it.toImmutable() },
                checkRequired("totalRecords", totalRecords),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RequestRetrieveStatusHistoryResponse = apply {
        if (validated) {
            return@apply
        }

        records().forEach { it.validate() }
        totalRecords()
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
        (records.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalRecords.asKnown().isPresent) 1 else 0)

    /** A single entry in the verification request status history */
    class Record
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val updatedAt: JsonField<OffsetDateTime>,
        private val verificationStatus: JsonField<TfVerificationStatus>,
        private val reason: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("verificationStatus")
            @ExcludeMissing
            verificationStatus: JsonField<TfVerificationStatus> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        ) : this(updatedAt, verificationStatus, reason, mutableMapOf())

        /**
         * The timestamp at which this status change occurred
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

        /**
         * Tollfree verification status
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun verificationStatus(): TfVerificationStatus =
            verificationStatus.getRequired("verificationStatus")

        /**
         * An explanation of why this request has its current status.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reason(): Optional<String> = reason.getOptional("reason")

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [verificationStatus].
         *
         * Unlike [verificationStatus], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("verificationStatus")
        @ExcludeMissing
        fun _verificationStatus(): JsonField<TfVerificationStatus> = verificationStatus

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
             * Returns a mutable builder for constructing an instance of [Record].
             *
             * The following fields are required:
             * ```java
             * .updatedAt()
             * .verificationStatus()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Record]. */
        class Builder internal constructor() {

            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var verificationStatus: JsonField<TfVerificationStatus>? = null
            private var reason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(record: Record) = apply {
                updatedAt = record.updatedAt
                verificationStatus = record.verificationStatus
                reason = record.reason
                additionalProperties = record.additionalProperties.toMutableMap()
            }

            /** The timestamp at which this status change occurred */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** Tollfree verification status */
            fun verificationStatus(verificationStatus: TfVerificationStatus) =
                verificationStatus(JsonField.of(verificationStatus))

            /**
             * Sets [Builder.verificationStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verificationStatus] with a well-typed
             * [TfVerificationStatus] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun verificationStatus(verificationStatus: JsonField<TfVerificationStatus>) = apply {
                this.verificationStatus = verificationStatus
            }

            /** An explanation of why this request has its current status. */
            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
            fun reason(reason: Optional<String>) = reason(reason.getOrNull())

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
             * Returns an immutable instance of [Record].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .updatedAt()
             * .verificationStatus()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Record =
                Record(
                    checkRequired("updatedAt", updatedAt),
                    checkRequired("verificationStatus", verificationStatus),
                    reason,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Record = apply {
            if (validated) {
                return@apply
            }

            updatedAt()
            verificationStatus().validate()
            reason()
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
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (verificationStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (reason.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Record &&
                updatedAt == other.updatedAt &&
                verificationStatus == other.verificationStatus &&
                reason == other.reason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(updatedAt, verificationStatus, reason, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Record{updatedAt=$updatedAt, verificationStatus=$verificationStatus, reason=$reason, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RequestRetrieveStatusHistoryResponse &&
            records == other.records &&
            totalRecords == other.totalRecords &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(records, totalRecords, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RequestRetrieveStatusHistoryResponse{records=$records, totalRecords=$totalRecords, additionalProperties=$additionalProperties}"
}
