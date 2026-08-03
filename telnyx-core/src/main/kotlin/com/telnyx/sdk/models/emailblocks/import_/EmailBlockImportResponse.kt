// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks.import_

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
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailBlockImportResponse
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
     * Import job. Schema fields hidden: `account_id`, `csv_content`, `block_ttl_days`. Nullable
     * fields use the omit-nullable pattern.
     *
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
         * Returns a mutable builder for constructing an instance of [EmailBlockImportResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailBlockImportResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailBlockImportResponse: EmailBlockImportResponse) = apply {
            data = emailBlockImportResponse.data
            additionalProperties = emailBlockImportResponse.additionalProperties.toMutableMap()
        }

        /**
         * Import job. Schema fields hidden: `account_id`, `csv_content`, `block_ttl_days`. Nullable
         * fields use the omit-nullable pattern.
         */
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
         * Returns an immutable instance of [EmailBlockImportResponse].
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
        fun build(): EmailBlockImportResponse =
            EmailBlockImportResponse(
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
    fun validate(): EmailBlockImportResponse = apply {
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

    /**
     * Import job. Schema fields hidden: `account_id`, `csv_content`, `block_ttl_days`. Nullable
     * fields use the omit-nullable pattern.
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val recordType: JsonField<RecordType>,
        private val status: JsonField<Status>,
        private val total: JsonField<Long>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val completedAt: JsonField<OffsetDateTime>,
        private val createdCount: JsonField<Long>,
        private val errorCount: JsonField<Long>,
        private val errors: JsonField<Errors>,
        private val existingCount: JsonField<Long>,
        private val failureReason: JsonField<String>,
        private val processedRows: JsonField<Long>,
        private val provider: JsonField<Provider>,
        private val skippedCount: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("completed_at")
            @ExcludeMissing
            completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("created_count")
            @ExcludeMissing
            createdCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("error_count")
            @ExcludeMissing
            errorCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("errors") @ExcludeMissing errors: JsonField<Errors> = JsonMissing.of(),
            @JsonProperty("existing_count")
            @ExcludeMissing
            existingCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("failure_reason")
            @ExcludeMissing
            failureReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("processed_rows")
            @ExcludeMissing
            processedRows: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
            @JsonProperty("skipped_count")
            @ExcludeMissing
            skippedCount: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            recordType,
            status,
            total,
            updatedAt,
            completedAt,
            createdCount,
            errorCount,
            errors,
            existingCount,
            failureReason,
            processedRows,
            provider,
            skippedCount,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * View-only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): RecordType = recordType.getRequired("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Data-row count at upload.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun total(): Long = total.getRequired("total")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * Omitted until terminal success.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completed_at")

        /**
         * Only when `status == completed`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdCount(): Optional<Long> = createdCount.getOptional("created_count")

        /**
         * Only when `status == completed`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun errorCount(): Optional<Long> = errorCount.getOptional("error_count")

        /**
         * `{row_number: reason}`; only rendered when non-empty.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun errors(): Optional<Errors> = errors.getOptional("errors")

        /**
         * Only when `status == completed`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun existingCount(): Optional<Long> = existingCount.getOptional("existing_count")

        /**
         * Only on terminal failure.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun failureReason(): Optional<String> = failureReason.getOptional("failure_reason")

        /**
         * Only when `status == completed`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun processedRows(): Optional<Long> = processedRows.getOptional("processed_rows")

        /**
         * Omitted when nil.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provider(): Optional<Provider> = provider.getOptional("provider")

        /**
         * Only when `status == completed`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun skippedCount(): Optional<Long> = skippedCount.getOptional("skipped_count")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [completedAt].
         *
         * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("completed_at")
        @ExcludeMissing
        fun _completedAt(): JsonField<OffsetDateTime> = completedAt

        /**
         * Returns the raw JSON value of [createdCount].
         *
         * Unlike [createdCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("created_count")
        @ExcludeMissing
        fun _createdCount(): JsonField<Long> = createdCount

        /**
         * Returns the raw JSON value of [errorCount].
         *
         * Unlike [errorCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error_count") @ExcludeMissing fun _errorCount(): JsonField<Long> = errorCount

        /**
         * Returns the raw JSON value of [errors].
         *
         * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<Errors> = errors

        /**
         * Returns the raw JSON value of [existingCount].
         *
         * Unlike [existingCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("existing_count")
        @ExcludeMissing
        fun _existingCount(): JsonField<Long> = existingCount

        /**
         * Returns the raw JSON value of [failureReason].
         *
         * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("failure_reason")
        @ExcludeMissing
        fun _failureReason(): JsonField<String> = failureReason

        /**
         * Returns the raw JSON value of [processedRows].
         *
         * Unlike [processedRows], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("processed_rows")
        @ExcludeMissing
        fun _processedRows(): JsonField<Long> = processedRows

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

        /**
         * Returns the raw JSON value of [skippedCount].
         *
         * Unlike [skippedCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("skipped_count")
        @ExcludeMissing
        fun _skippedCount(): JsonField<Long> = skippedCount

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
             * .id()
             * .createdAt()
             * .recordType()
             * .status()
             * .total()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var recordType: JsonField<RecordType>? = null
            private var status: JsonField<Status>? = null
            private var total: JsonField<Long>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdCount: JsonField<Long> = JsonMissing.of()
            private var errorCount: JsonField<Long> = JsonMissing.of()
            private var errors: JsonField<Errors> = JsonMissing.of()
            private var existingCount: JsonField<Long> = JsonMissing.of()
            private var failureReason: JsonField<String> = JsonMissing.of()
            private var processedRows: JsonField<Long> = JsonMissing.of()
            private var provider: JsonField<Provider> = JsonMissing.of()
            private var skippedCount: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                recordType = data.recordType
                status = data.status
                total = data.total
                updatedAt = data.updatedAt
                completedAt = data.completedAt
                createdCount = data.createdCount
                errorCount = data.errorCount
                errors = data.errors
                existingCount = data.existingCount
                failureReason = data.failureReason
                processedRows = data.processedRows
                provider = data.provider
                skippedCount = data.skippedCount
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** View-only. */
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

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Data-row count at upload. */
            fun total(total: Long) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun total(total: JsonField<Long>) = apply { this.total = total }

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

            /** Omitted until terminal success. */
            fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

            /**
             * Sets [Builder.completedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
                this.completedAt = completedAt
            }

            /** Only when `status == completed`. */
            fun createdCount(createdCount: Long) = createdCount(JsonField.of(createdCount))

            /**
             * Sets [Builder.createdCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdCount(createdCount: JsonField<Long>) = apply {
                this.createdCount = createdCount
            }

            /** Only when `status == completed`. */
            fun errorCount(errorCount: Long) = errorCount(JsonField.of(errorCount))

            /**
             * Sets [Builder.errorCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorCount(errorCount: JsonField<Long>) = apply { this.errorCount = errorCount }

            /** `{row_number: reason}`; only rendered when non-empty. */
            fun errors(errors: Errors) = errors(JsonField.of(errors))

            /**
             * Sets [Builder.errors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errors] with a well-typed [Errors] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errors(errors: JsonField<Errors>) = apply { this.errors = errors }

            /** Only when `status == completed`. */
            fun existingCount(existingCount: Long) = existingCount(JsonField.of(existingCount))

            /**
             * Sets [Builder.existingCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.existingCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun existingCount(existingCount: JsonField<Long>) = apply {
                this.existingCount = existingCount
            }

            /** Only on terminal failure. */
            fun failureReason(failureReason: String) = failureReason(JsonField.of(failureReason))

            /**
             * Sets [Builder.failureReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failureReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun failureReason(failureReason: JsonField<String>) = apply {
                this.failureReason = failureReason
            }

            /** Only when `status == completed`. */
            fun processedRows(processedRows: Long) = processedRows(JsonField.of(processedRows))

            /**
             * Sets [Builder.processedRows] to an arbitrary JSON value.
             *
             * You should usually call [Builder.processedRows] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun processedRows(processedRows: JsonField<Long>) = apply {
                this.processedRows = processedRows
            }

            /** Omitted when nil. */
            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

            /** Only when `status == completed`. */
            fun skippedCount(skippedCount: Long) = skippedCount(JsonField.of(skippedCount))

            /**
             * Sets [Builder.skippedCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skippedCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun skippedCount(skippedCount: JsonField<Long>) = apply {
                this.skippedCount = skippedCount
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .recordType()
             * .status()
             * .total()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("recordType", recordType),
                    checkRequired("status", status),
                    checkRequired("total", total),
                    checkRequired("updatedAt", updatedAt),
                    completedAt,
                    createdCount,
                    errorCount,
                    errors,
                    existingCount,
                    failureReason,
                    processedRows,
                    provider,
                    skippedCount,
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

            id()
            createdAt()
            recordType().validate()
            status().validate()
            total()
            updatedAt()
            completedAt()
            createdCount()
            errorCount()
            errors().ifPresent { it.validate() }
            existingCount()
            failureReason()
            processedRows()
            provider().ifPresent { it.validate() }
            skippedCount()
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (total.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (completedAt.asKnown().isPresent) 1 else 0) +
                (if (createdCount.asKnown().isPresent) 1 else 0) +
                (if (errorCount.asKnown().isPresent) 1 else 0) +
                (errors.asKnown().getOrNull()?.validity() ?: 0) +
                (if (existingCount.asKnown().isPresent) 1 else 0) +
                (if (failureReason.asKnown().isPresent) 1 else 0) +
                (if (processedRows.asKnown().isPresent) 1 else 0) +
                (provider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (skippedCount.asKnown().isPresent) 1 else 0)

        /** View-only. */
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

                @JvmField val EMAIL_BLOCK_IMPORT = of("email_block_import")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                EMAIL_BLOCK_IMPORT
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
                EMAIL_BLOCK_IMPORT,
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
                    EMAIL_BLOCK_IMPORT -> Value.EMAIL_BLOCK_IMPORT
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
                    EMAIL_BLOCK_IMPORT -> Known.EMAIL_BLOCK_IMPORT
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

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val PENDING = of("pending")

                @JvmField val PROCESSING = of("processing")

                @JvmField val COMPLETED = of("completed")

                @JvmField val FAILED = of("failed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                PROCESSING,
                COMPLETED,
                FAILED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                PROCESSING,
                COMPLETED,
                FAILED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    PENDING -> Value.PENDING
                    PROCESSING -> Value.PROCESSING
                    COMPLETED -> Value.COMPLETED
                    FAILED -> Value.FAILED
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
                    PENDING -> Known.PENDING
                    PROCESSING -> Known.PROCESSING
                    COMPLETED -> Known.COMPLETED
                    FAILED -> Known.FAILED
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        /** `{row_number: reason}`; only rendered when non-empty. */
        class Errors
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Errors]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Errors]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(errors: Errors) = apply {
                    additionalProperties = errors.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Errors].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Errors = Errors(additionalProperties.toImmutable())
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
            fun validate(): Errors = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Errors && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Errors{additionalProperties=$additionalProperties}"
        }

        /** Omitted when nil. */
        class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val SENDGRID = of("sendgrid")

                @JvmField val MAILGUN = of("mailgun")

                @JvmField val SES = of("ses")

                @JvmField val GENERIC = of("generic")

                @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
            }

            /** An enum containing [Provider]'s known values. */
            enum class Known {
                SENDGRID,
                MAILGUN,
                SES,
                GENERIC,
            }

            /**
             * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Provider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SENDGRID,
                MAILGUN,
                SES,
                GENERIC,
                /**
                 * An enum member indicating that [Provider] was instantiated with an unknown value.
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
                    SENDGRID -> Value.SENDGRID
                    MAILGUN -> Value.MAILGUN
                    SES -> Value.SES
                    GENERIC -> Value.GENERIC
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
                    SENDGRID -> Known.SENDGRID
                    MAILGUN -> Known.MAILGUN
                    SES -> Known.SES
                    GENERIC -> Known.GENERIC
                    else -> throw TelnyxInvalidDataException("Unknown Provider: $value")
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
            fun validate(): Provider = apply {
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

                return other is Provider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                createdAt == other.createdAt &&
                recordType == other.recordType &&
                status == other.status &&
                total == other.total &&
                updatedAt == other.updatedAt &&
                completedAt == other.completedAt &&
                createdCount == other.createdCount &&
                errorCount == other.errorCount &&
                errors == other.errors &&
                existingCount == other.existingCount &&
                failureReason == other.failureReason &&
                processedRows == other.processedRows &&
                provider == other.provider &&
                skippedCount == other.skippedCount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                recordType,
                status,
                total,
                updatedAt,
                completedAt,
                createdCount,
                errorCount,
                errors,
                existingCount,
                failureReason,
                processedRows,
                provider,
                skippedCount,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, recordType=$recordType, status=$status, total=$total, updatedAt=$updatedAt, completedAt=$completedAt, createdCount=$createdCount, errorCount=$errorCount, errors=$errors, existingCount=$existingCount, failureReason=$failureReason, processedRows=$processedRows, provider=$provider, skippedCount=$skippedCount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailBlockImportResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailBlockImportResponse{data=$data, additionalProperties=$additionalProperties}"
}
