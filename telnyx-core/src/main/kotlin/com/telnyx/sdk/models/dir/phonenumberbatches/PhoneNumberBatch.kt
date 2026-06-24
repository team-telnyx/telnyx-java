// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.phonenumberbatches

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.dir.Document
import com.telnyx.sdk.models.dir.phonenumbers.DirPhoneNumber
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A phone-number batch groups all numbers added in a single bulk-add request. Telnyx vets the batch
 * as a unit. The response embeds the full `phone_numbers` array so you can read per-number status
 * without a separate call, plus a batch-level `status` summarising the unit's progress.
 */
class PhoneNumberBatch
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val batchId: JsonField<String>,
    private val dirDisplayName: JsonField<String>,
    private val dirId: JsonField<String>,
    private val documents: JsonField<List<Document>>,
    private val enterpriseId: JsonField<String>,
    private val phoneNumbers: JsonField<List<DirPhoneNumber>>,
    private val status: JsonField<DirPhoneNumberStatus>,
    private val submittedAt: JsonField<OffsetDateTime>,
    private val totalCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("batch_id") @ExcludeMissing batchId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dir_display_name")
        @ExcludeMissing
        dirDisplayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dir_id") @ExcludeMissing dirId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documents")
        @ExcludeMissing
        documents: JsonField<List<Document>> = JsonMissing.of(),
        @JsonProperty("enterprise_id")
        @ExcludeMissing
        enterpriseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        phoneNumbers: JsonField<List<DirPhoneNumber>> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<DirPhoneNumberStatus> = JsonMissing.of(),
        @JsonProperty("submitted_at")
        @ExcludeMissing
        submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("total_count") @ExcludeMissing totalCount: JsonField<Long> = JsonMissing.of(),
    ) : this(
        batchId,
        dirDisplayName,
        dirId,
        documents,
        enterpriseId,
        phoneNumbers,
        status,
        submittedAt,
        totalCount,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun batchId(): Optional<String> = batchId.getOptional("batch_id")

    /**
     * The DIR's display name at the time the batch was read.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dirDisplayName(): Optional<String> = dirDisplayName.getOptional("dir_display_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dirId(): Optional<String> = dirId.getOptional("dir_id")

    /**
     * Documents attached to this batch (e.g. a Letter of Authorization). Empty when none were
     * supplied at add time.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documents(): Optional<List<Document>> = documents.getOptional("documents")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enterpriseId(): Optional<String> = enterpriseId.getOptional("enterprise_id")

    /**
     * All phone numbers in this batch, with per-number status.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumbers(): Optional<List<DirPhoneNumber>> = phoneNumbers.getOptional("phone_numbers")

    /**
     * Aggregate batch status. Mirrors the values used on individual phone numbers (`submitted`,
     * `in_review`, `verified`, `unsuccessful`, `permanently_rejected`, etc.).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<DirPhoneNumberStatus> = status.getOptional("status")

    /**
     * When the batch was created (and implicitly submitted for vetting).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submittedAt(): Optional<OffsetDateTime> = submittedAt.getOptional("submitted_at")

    /**
     * Number of phone numbers in this batch (length of `phone_numbers`).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCount(): Optional<Long> = totalCount.getOptional("total_count")

    /**
     * Returns the raw JSON value of [batchId].
     *
     * Unlike [batchId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("batch_id") @ExcludeMissing fun _batchId(): JsonField<String> = batchId

    /**
     * Returns the raw JSON value of [dirDisplayName].
     *
     * Unlike [dirDisplayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dir_display_name")
    @ExcludeMissing
    fun _dirDisplayName(): JsonField<String> = dirDisplayName

    /**
     * Returns the raw JSON value of [dirId].
     *
     * Unlike [dirId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dir_id") @ExcludeMissing fun _dirId(): JsonField<String> = dirId

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documents")
    @ExcludeMissing
    fun _documents(): JsonField<List<Document>> = documents

    /**
     * Returns the raw JSON value of [enterpriseId].
     *
     * Unlike [enterpriseId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enterprise_id")
    @ExcludeMissing
    fun _enterpriseId(): JsonField<String> = enterpriseId

    /**
     * Returns the raw JSON value of [phoneNumbers].
     *
     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    fun _phoneNumbers(): JsonField<List<DirPhoneNumber>> = phoneNumbers

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<DirPhoneNumberStatus> = status

    /**
     * Returns the raw JSON value of [submittedAt].
     *
     * Unlike [submittedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submitted_at")
    @ExcludeMissing
    fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

    /**
     * Returns the raw JSON value of [totalCount].
     *
     * Unlike [totalCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_count") @ExcludeMissing fun _totalCount(): JsonField<Long> = totalCount

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

        /** Returns a mutable builder for constructing an instance of [PhoneNumberBatch]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberBatch]. */
    class Builder internal constructor() {

        private var batchId: JsonField<String> = JsonMissing.of()
        private var dirDisplayName: JsonField<String> = JsonMissing.of()
        private var dirId: JsonField<String> = JsonMissing.of()
        private var documents: JsonField<MutableList<Document>>? = null
        private var enterpriseId: JsonField<String> = JsonMissing.of()
        private var phoneNumbers: JsonField<MutableList<DirPhoneNumber>>? = null
        private var status: JsonField<DirPhoneNumberStatus> = JsonMissing.of()
        private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var totalCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(phoneNumberBatch: PhoneNumberBatch) = apply {
            batchId = phoneNumberBatch.batchId
            dirDisplayName = phoneNumberBatch.dirDisplayName
            dirId = phoneNumberBatch.dirId
            documents = phoneNumberBatch.documents.map { it.toMutableList() }
            enterpriseId = phoneNumberBatch.enterpriseId
            phoneNumbers = phoneNumberBatch.phoneNumbers.map { it.toMutableList() }
            status = phoneNumberBatch.status
            submittedAt = phoneNumberBatch.submittedAt
            totalCount = phoneNumberBatch.totalCount
            additionalProperties = phoneNumberBatch.additionalProperties.toMutableMap()
        }

        fun batchId(batchId: String) = batchId(JsonField.of(batchId))

        /**
         * Sets [Builder.batchId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.batchId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun batchId(batchId: JsonField<String>) = apply { this.batchId = batchId }

        /** The DIR's display name at the time the batch was read. */
        fun dirDisplayName(dirDisplayName: String) = dirDisplayName(JsonField.of(dirDisplayName))

        /**
         * Sets [Builder.dirDisplayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dirDisplayName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dirDisplayName(dirDisplayName: JsonField<String>) = apply {
            this.dirDisplayName = dirDisplayName
        }

        fun dirId(dirId: String) = dirId(JsonField.of(dirId))

        /**
         * Sets [Builder.dirId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dirId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dirId(dirId: JsonField<String>) = apply { this.dirId = dirId }

        /**
         * Documents attached to this batch (e.g. a Letter of Authorization). Empty when none were
         * supplied at add time.
         */
        fun documents(documents: List<Document>) = documents(JsonField.of(documents))

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed `List<Document>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documents(documents: JsonField<List<Document>>) = apply {
            this.documents = documents.map { it.toMutableList() }
        }

        /**
         * Adds a single [Document] to [documents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocument(document: Document) = apply {
            documents =
                (documents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documents", it).add(document)
                }
        }

        fun enterpriseId(enterpriseId: String) = enterpriseId(JsonField.of(enterpriseId))

        /**
         * Sets [Builder.enterpriseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enterpriseId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enterpriseId(enterpriseId: JsonField<String>) = apply {
            this.enterpriseId = enterpriseId
        }

        /** All phone numbers in this batch, with per-number status. */
        fun phoneNumbers(phoneNumbers: List<DirPhoneNumber>) =
            phoneNumbers(JsonField.of(phoneNumbers))

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed `List<DirPhoneNumber>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<DirPhoneNumber>>) = apply {
            this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [DirPhoneNumber] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: DirPhoneNumber) = apply {
            phoneNumbers =
                (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phoneNumbers", it).add(phoneNumber)
                }
        }

        /**
         * Aggregate batch status. Mirrors the values used on individual phone numbers (`submitted`,
         * `in_review`, `verified`, `unsuccessful`, `permanently_rejected`, etc.).
         */
        fun status(status: DirPhoneNumberStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [DirPhoneNumberStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<DirPhoneNumberStatus>) = apply { this.status = status }

        /** When the batch was created (and implicitly submitted for vetting). */
        fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

        /**
         * Sets [Builder.submittedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submittedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
            this.submittedAt = submittedAt
        }

        /** Number of phone numbers in this batch (length of `phone_numbers`). */
        fun totalCount(totalCount: Long) = totalCount(JsonField.of(totalCount))

        /**
         * Sets [Builder.totalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

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
         * Returns an immutable instance of [PhoneNumberBatch].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberBatch =
            PhoneNumberBatch(
                batchId,
                dirDisplayName,
                dirId,
                (documents ?: JsonMissing.of()).map { it.toImmutable() },
                enterpriseId,
                (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                submittedAt,
                totalCount,
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
    fun validate(): PhoneNumberBatch = apply {
        if (validated) {
            return@apply
        }

        batchId()
        dirDisplayName()
        dirId()
        documents().ifPresent { it.forEach { it.validate() } }
        enterpriseId()
        phoneNumbers().ifPresent { it.forEach { it.validate() } }
        status().ifPresent { it.validate() }
        submittedAt()
        totalCount()
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
        (if (batchId.asKnown().isPresent) 1 else 0) +
            (if (dirDisplayName.asKnown().isPresent) 1 else 0) +
            (if (dirId.asKnown().isPresent) 1 else 0) +
            (documents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (enterpriseId.asKnown().isPresent) 1 else 0) +
            (phoneNumbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (submittedAt.asKnown().isPresent) 1 else 0) +
            (if (totalCount.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberBatch &&
            batchId == other.batchId &&
            dirDisplayName == other.dirDisplayName &&
            dirId == other.dirId &&
            documents == other.documents &&
            enterpriseId == other.enterpriseId &&
            phoneNumbers == other.phoneNumbers &&
            status == other.status &&
            submittedAt == other.submittedAt &&
            totalCount == other.totalCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            batchId,
            dirDisplayName,
            dirId,
            documents,
            enterpriseId,
            phoneNumbers,
            status,
            submittedAt,
            totalCount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumberBatch{batchId=$batchId, dirDisplayName=$dirDisplayName, dirId=$dirId, documents=$documents, enterpriseId=$enterpriseId, phoneNumbers=$phoneNumbers, status=$status, submittedAt=$submittedAt, totalCount=$totalCount, additionalProperties=$additionalProperties}"
}
