// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.phonenumberbatches

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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
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
class PhoneNumberBatchListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val batchId: JsonField<String>,
    private val dirDisplayName: JsonField<String>,
    private val dirId: JsonField<String>,
    private val documents: JsonField<List<Document>>,
    private val enterpriseId: JsonField<String>,
    private val phoneNumbers: JsonField<List<PhoneNumber>>,
    private val status: JsonField<Status>,
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
        phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
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
    fun phoneNumbers(): Optional<List<PhoneNumber>> = phoneNumbers.getOptional("phone_numbers")

    /**
     * Aggregate batch status. Mirrors the values used on individual phone numbers (`submitted`,
     * `in_review`, `verified`, `unsuccessful`, `permanently_rejected`, etc.).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

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
    fun _phoneNumbers(): JsonField<List<PhoneNumber>> = phoneNumbers

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        /**
         * Returns a mutable builder for constructing an instance of [PhoneNumberBatchListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberBatchListResponse]. */
    class Builder internal constructor() {

        private var batchId: JsonField<String> = JsonMissing.of()
        private var dirDisplayName: JsonField<String> = JsonMissing.of()
        private var dirId: JsonField<String> = JsonMissing.of()
        private var documents: JsonField<MutableList<Document>>? = null
        private var enterpriseId: JsonField<String> = JsonMissing.of()
        private var phoneNumbers: JsonField<MutableList<PhoneNumber>>? = null
        private var status: JsonField<Status> = JsonMissing.of()
        private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var totalCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(phoneNumberBatchListResponse: PhoneNumberBatchListResponse) = apply {
            batchId = phoneNumberBatchListResponse.batchId
            dirDisplayName = phoneNumberBatchListResponse.dirDisplayName
            dirId = phoneNumberBatchListResponse.dirId
            documents = phoneNumberBatchListResponse.documents.map { it.toMutableList() }
            enterpriseId = phoneNumberBatchListResponse.enterpriseId
            phoneNumbers = phoneNumberBatchListResponse.phoneNumbers.map { it.toMutableList() }
            status = phoneNumberBatchListResponse.status
            submittedAt = phoneNumberBatchListResponse.submittedAt
            totalCount = phoneNumberBatchListResponse.totalCount
            additionalProperties = phoneNumberBatchListResponse.additionalProperties.toMutableMap()
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
        fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = phoneNumbers(JsonField.of(phoneNumbers))

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed `List<PhoneNumber>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
            this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [PhoneNumber] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
            phoneNumbers =
                (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phoneNumbers", it).add(phoneNumber)
                }
        }

        /**
         * Aggregate batch status. Mirrors the values used on individual phone numbers (`submitted`,
         * `in_review`, `verified`, `unsuccessful`, `permanently_rejected`, etc.).
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [PhoneNumberBatchListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberBatchListResponse =
            PhoneNumberBatchListResponse(
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
    fun validate(): PhoneNumberBatchListResponse = apply {
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

    class Document
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val documentId: JsonField<String>,
        private val documentType: JsonField<DocumentType>,
        private val description: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("document_id")
            @ExcludeMissing
            documentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("document_type")
            @ExcludeMissing
            documentType: JsonField<DocumentType> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
        ) : this(documentId, documentType, description, mutableMapOf())

        /**
         * Id returned by the Telnyx Documents API after you upload the file (upload via `POST
         * /v2/documents`; see https://developers.telnyx.com/api/documents).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentId(): String = documentId.getRequired("document_id")

        /**
         * Type of supporting document. Pick the closest match to what the file actually contains;
         * `other` triggers manual vetting and may slow approval. The matching short_name reference
         * list is at `GET /v2/dir/document_types`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentType(): DocumentType = documentType.getRequired("document_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Returns the raw JSON value of [documentId].
         *
         * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("document_id")
        @ExcludeMissing
        fun _documentId(): JsonField<String> = documentId

        /**
         * Returns the raw JSON value of [documentType].
         *
         * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun _documentType(): JsonField<DocumentType> = documentType

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
             * Returns a mutable builder for constructing an instance of [Document].
             *
             * The following fields are required:
             * ```java
             * .documentId()
             * .documentType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Document]. */
        class Builder internal constructor() {

            private var documentId: JsonField<String>? = null
            private var documentType: JsonField<DocumentType>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(document: Document) = apply {
                documentId = document.documentId
                documentType = document.documentType
                description = document.description
                additionalProperties = document.additionalProperties.toMutableMap()
            }

            /**
             * Id returned by the Telnyx Documents API after you upload the file (upload via `POST
             * /v2/documents`; see https://developers.telnyx.com/api/documents).
             */
            fun documentId(documentId: String) = documentId(JsonField.of(documentId))

            /**
             * Sets [Builder.documentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

            /**
             * Type of supporting document. Pick the closest match to what the file actually
             * contains; `other` triggers manual vetting and may slow approval. The matching
             * short_name reference list is at `GET /v2/dir/document_types`.
             */
            fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

            /**
             * Sets [Builder.documentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentType(documentType: JsonField<DocumentType>) = apply {
                this.documentType = documentType
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
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
             * Returns an immutable instance of [Document].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .documentId()
             * .documentType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Document =
                Document(
                    checkRequired("documentId", documentId),
                    checkRequired("documentType", documentType),
                    description,
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
        fun validate(): Document = apply {
            if (validated) {
                return@apply
            }

            documentId()
            documentType().validate()
            description()
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
            (if (documentId.asKnown().isPresent) 1 else 0) +
                (documentType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0)

        /**
         * Type of supporting document. Pick the closest match to what the file actually contains;
         * `other` triggers manual vetting and may slow approval. The matching short_name reference
         * list is at `GET /v2/dir/document_types`.
         */
        class DocumentType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val LETTER_OF_AUTHORIZATION = of("letter_of_authorization")

                @JvmField val BUSINESS_REGISTRATION = of("business_registration")

                @JvmField val ARTICLES_OF_INCORPORATION = of("articles_of_incorporation")

                @JvmField val TAX_DOCUMENT = of("tax_document")

                @JvmField val EIN_LETTER = of("ein_letter")

                @JvmField val TRADEMARK_REGISTRATION = of("trademark_registration")

                @JvmField val WEBSITE_OWNERSHIP = of("website_ownership")

                @JvmField val BUSINESS_LICENSE = of("business_license")

                @JvmField val PROFESSIONAL_LICENSE = of("professional_license")

                @JvmField val GOVERNMENT_ID = of("government_id")

                @JvmField val UTILITY_BILL = of("utility_bill")

                @JvmField val BANK_STATEMENT = of("bank_statement")

                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = DocumentType(JsonField.of(value))
            }

            /** An enum containing [DocumentType]'s known values. */
            enum class Known {
                LETTER_OF_AUTHORIZATION,
                BUSINESS_REGISTRATION,
                ARTICLES_OF_INCORPORATION,
                TAX_DOCUMENT,
                EIN_LETTER,
                TRADEMARK_REGISTRATION,
                WEBSITE_OWNERSHIP,
                BUSINESS_LICENSE,
                PROFESSIONAL_LICENSE,
                GOVERNMENT_ID,
                UTILITY_BILL,
                BANK_STATEMENT,
                OTHER,
            }

            /**
             * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DocumentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LETTER_OF_AUTHORIZATION,
                BUSINESS_REGISTRATION,
                ARTICLES_OF_INCORPORATION,
                TAX_DOCUMENT,
                EIN_LETTER,
                TRADEMARK_REGISTRATION,
                WEBSITE_OWNERSHIP,
                BUSINESS_LICENSE,
                PROFESSIONAL_LICENSE,
                GOVERNMENT_ID,
                UTILITY_BILL,
                BANK_STATEMENT,
                OTHER,
                /**
                 * An enum member indicating that [DocumentType] was instantiated with an unknown
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
                    LETTER_OF_AUTHORIZATION -> Value.LETTER_OF_AUTHORIZATION
                    BUSINESS_REGISTRATION -> Value.BUSINESS_REGISTRATION
                    ARTICLES_OF_INCORPORATION -> Value.ARTICLES_OF_INCORPORATION
                    TAX_DOCUMENT -> Value.TAX_DOCUMENT
                    EIN_LETTER -> Value.EIN_LETTER
                    TRADEMARK_REGISTRATION -> Value.TRADEMARK_REGISTRATION
                    WEBSITE_OWNERSHIP -> Value.WEBSITE_OWNERSHIP
                    BUSINESS_LICENSE -> Value.BUSINESS_LICENSE
                    PROFESSIONAL_LICENSE -> Value.PROFESSIONAL_LICENSE
                    GOVERNMENT_ID -> Value.GOVERNMENT_ID
                    UTILITY_BILL -> Value.UTILITY_BILL
                    BANK_STATEMENT -> Value.BANK_STATEMENT
                    OTHER -> Value.OTHER
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
                    LETTER_OF_AUTHORIZATION -> Known.LETTER_OF_AUTHORIZATION
                    BUSINESS_REGISTRATION -> Known.BUSINESS_REGISTRATION
                    ARTICLES_OF_INCORPORATION -> Known.ARTICLES_OF_INCORPORATION
                    TAX_DOCUMENT -> Known.TAX_DOCUMENT
                    EIN_LETTER -> Known.EIN_LETTER
                    TRADEMARK_REGISTRATION -> Known.TRADEMARK_REGISTRATION
                    WEBSITE_OWNERSHIP -> Known.WEBSITE_OWNERSHIP
                    BUSINESS_LICENSE -> Known.BUSINESS_LICENSE
                    PROFESSIONAL_LICENSE -> Known.PROFESSIONAL_LICENSE
                    GOVERNMENT_ID -> Known.GOVERNMENT_ID
                    UTILITY_BILL -> Known.UTILITY_BILL
                    BANK_STATEMENT -> Known.BANK_STATEMENT
                    OTHER -> Known.OTHER
                    else -> throw TelnyxInvalidDataException("Unknown DocumentType: $value")
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
            fun validate(): DocumentType = apply {
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

                return other is DocumentType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Document &&
                documentId == other.documentId &&
                documentType == other.documentType &&
                description == other.description &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(documentId, documentType, description, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Document{documentId=$documentId, documentType=$documentType, description=$description, additionalProperties=$additionalProperties}"
    }

    class PhoneNumber
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val batchId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val dirId: JsonField<String>,
        private val enterpriseId: JsonField<String>,
        private val loaDocumentId: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val rejectionReason: JsonField<RejectionReason>,
        private val status: JsonField<Status>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val verifiedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("batch_id") @ExcludeMissing batchId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dir_id") @ExcludeMissing dirId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enterprise_id")
            @ExcludeMissing
            enterpriseId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("loa_document_id")
            @ExcludeMissing
            loaDocumentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rejection_reason")
            @ExcludeMissing
            rejectionReason: JsonField<RejectionReason> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("verified_at")
            @ExcludeMissing
            verifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            batchId,
            createdAt,
            dirId,
            enterpriseId,
            loaDocumentId,
            phoneNumber,
            rejectionReason,
            status,
            updatedAt,
            verifiedAt,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Id of the batch this number was vetted as part of.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun batchId(): Optional<String> = batchId.getOptional("batch_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dirId(): Optional<String> = dirId.getOptional("dir_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enterpriseId(): Optional<String> = enterpriseId.getOptional("enterprise_id")

        /**
         * Id of the Letter of Authorization document attached to this number's batch.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun loaDocumentId(): Optional<String> = loaDocumentId.getOptional("loa_document_id")

        /**
         * E.164 with leading `+`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Populated when `status` is `unsuccessful` or `permanently_rejected`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rejectionReason(): Optional<RejectionReason> =
            rejectionReason.getOptional("rejection_reason")

        /**
         * Phone-number lifecycle status.
         * - `submitted` / `in_review` — Telnyx is reviewing the batch this number belongs to.
         * - `verified` — approved; the DIR's display identity will be shown on outbound calls from
         *   this number.
         * - `unsuccessful` — Telnyx rejected this submission; the customer may re-add to retry.
         * - `suspended` — temporarily disabled (e.g. by an active infringement claim on the DIR).
         * - `expired` — verification expired; re-add to renew.
         * - `permanently_rejected` — terminal; cannot be re-added on this or any other DIR you own.
         *
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
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun verifiedAt(): Optional<OffsetDateTime> = verifiedAt.getOptional("verified_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [batchId].
         *
         * Unlike [batchId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("batch_id") @ExcludeMissing fun _batchId(): JsonField<String> = batchId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [dirId].
         *
         * Unlike [dirId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dir_id") @ExcludeMissing fun _dirId(): JsonField<String> = dirId

        /**
         * Returns the raw JSON value of [enterpriseId].
         *
         * Unlike [enterpriseId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("enterprise_id")
        @ExcludeMissing
        fun _enterpriseId(): JsonField<String> = enterpriseId

        /**
         * Returns the raw JSON value of [loaDocumentId].
         *
         * Unlike [loaDocumentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("loa_document_id")
        @ExcludeMissing
        fun _loaDocumentId(): JsonField<String> = loaDocumentId

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [rejectionReason].
         *
         * Unlike [rejectionReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rejection_reason")
        @ExcludeMissing
        fun _rejectionReason(): JsonField<RejectionReason> = rejectionReason

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

        /**
         * Returns the raw JSON value of [verifiedAt].
         *
         * Unlike [verifiedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("verified_at")
        @ExcludeMissing
        fun _verifiedAt(): JsonField<OffsetDateTime> = verifiedAt

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

            /** Returns a mutable builder for constructing an instance of [PhoneNumber]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PhoneNumber]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var batchId: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dirId: JsonField<String> = JsonMissing.of()
            private var enterpriseId: JsonField<String> = JsonMissing.of()
            private var loaDocumentId: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var rejectionReason: JsonField<RejectionReason> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var verifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(phoneNumber: PhoneNumber) = apply {
                id = phoneNumber.id
                batchId = phoneNumber.batchId
                createdAt = phoneNumber.createdAt
                dirId = phoneNumber.dirId
                enterpriseId = phoneNumber.enterpriseId
                loaDocumentId = phoneNumber.loaDocumentId
                this.phoneNumber = phoneNumber.phoneNumber
                rejectionReason = phoneNumber.rejectionReason
                status = phoneNumber.status
                updatedAt = phoneNumber.updatedAt
                verifiedAt = phoneNumber.verifiedAt
                additionalProperties = phoneNumber.additionalProperties.toMutableMap()
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

            /** Id of the batch this number was vetted as part of. */
            fun batchId(batchId: String?) = batchId(JsonField.ofNullable(batchId))

            /** Alias for calling [Builder.batchId] with `batchId.orElse(null)`. */
            fun batchId(batchId: Optional<String>) = batchId(batchId.getOrNull())

            /**
             * Sets [Builder.batchId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.batchId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun batchId(batchId: JsonField<String>) = apply { this.batchId = batchId }

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

            fun dirId(dirId: String) = dirId(JsonField.of(dirId))

            /**
             * Sets [Builder.dirId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dirId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dirId(dirId: JsonField<String>) = apply { this.dirId = dirId }

            fun enterpriseId(enterpriseId: String) = enterpriseId(JsonField.of(enterpriseId))

            /**
             * Sets [Builder.enterpriseId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enterpriseId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enterpriseId(enterpriseId: JsonField<String>) = apply {
                this.enterpriseId = enterpriseId
            }

            /** Id of the Letter of Authorization document attached to this number's batch. */
            fun loaDocumentId(loaDocumentId: String?) =
                loaDocumentId(JsonField.ofNullable(loaDocumentId))

            /** Alias for calling [Builder.loaDocumentId] with `loaDocumentId.orElse(null)`. */
            fun loaDocumentId(loaDocumentId: Optional<String>) =
                loaDocumentId(loaDocumentId.getOrNull())

            /**
             * Sets [Builder.loaDocumentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loaDocumentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loaDocumentId(loaDocumentId: JsonField<String>) = apply {
                this.loaDocumentId = loaDocumentId
            }

            /** E.164 with leading `+`. */
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

            /** Populated when `status` is `unsuccessful` or `permanently_rejected`. */
            fun rejectionReason(rejectionReason: RejectionReason?) =
                rejectionReason(JsonField.ofNullable(rejectionReason))

            /** Alias for calling [Builder.rejectionReason] with `rejectionReason.orElse(null)`. */
            fun rejectionReason(rejectionReason: Optional<RejectionReason>) =
                rejectionReason(rejectionReason.getOrNull())

            /**
             * Sets [Builder.rejectionReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rejectionReason] with a well-typed [RejectionReason]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun rejectionReason(rejectionReason: JsonField<RejectionReason>) = apply {
                this.rejectionReason = rejectionReason
            }

            /**
             * Phone-number lifecycle status.
             * - `submitted` / `in_review` — Telnyx is reviewing the batch this number belongs to.
             * - `verified` — approved; the DIR's display identity will be shown on outbound calls
             *   from this number.
             * - `unsuccessful` — Telnyx rejected this submission; the customer may re-add to retry.
             * - `suspended` — temporarily disabled (e.g. by an active infringement claim on the
             *   DIR).
             * - `expired` — verification expired; re-add to renew.
             * - `permanently_rejected` — terminal; cannot be re-added on this or any other DIR you
             *   own.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun verifiedAt(verifiedAt: OffsetDateTime?) =
                verifiedAt(JsonField.ofNullable(verifiedAt))

            /** Alias for calling [Builder.verifiedAt] with `verifiedAt.orElse(null)`. */
            fun verifiedAt(verifiedAt: Optional<OffsetDateTime>) =
                verifiedAt(verifiedAt.getOrNull())

            /**
             * Sets [Builder.verifiedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verifiedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verifiedAt(verifiedAt: JsonField<OffsetDateTime>) = apply {
                this.verifiedAt = verifiedAt
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
             * Returns an immutable instance of [PhoneNumber].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PhoneNumber =
                PhoneNumber(
                    id,
                    batchId,
                    createdAt,
                    dirId,
                    enterpriseId,
                    loaDocumentId,
                    phoneNumber,
                    rejectionReason,
                    status,
                    updatedAt,
                    verifiedAt,
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
        fun validate(): PhoneNumber = apply {
            if (validated) {
                return@apply
            }

            id()
            batchId()
            createdAt()
            dirId()
            enterpriseId()
            loaDocumentId()
            phoneNumber()
            rejectionReason().ifPresent { it.validate() }
            status().ifPresent { it.validate() }
            updatedAt()
            verifiedAt()
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
                (if (batchId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (dirId.asKnown().isPresent) 1 else 0) +
                (if (enterpriseId.asKnown().isPresent) 1 else 0) +
                (if (loaDocumentId.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (rejectionReason.asKnown().getOrNull()?.validity() ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (verifiedAt.asKnown().isPresent) 1 else 0)

        /** Populated when `status` is `unsuccessful` or `permanently_rejected`. */
        class RejectionReason
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val code: JsonField<String>,
            private val detail: JsonField<String>,
            private val message: JsonField<String>,
            private val title: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
                @JsonProperty("detail")
                @ExcludeMissing
                detail: JsonField<String> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            ) : this(code, detail, message, title, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun code(): Optional<String> = code.getOptional("code")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun detail(): Optional<String> = detail.getOptional("detail")

            /**
             * Customer-visible free-text comment from the Telnyx vetting team. Only the first entry
             * of `rejection_reasons` carries this; the rest are `null`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun message(): Optional<String> = message.getOptional("message")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun title(): Optional<String> = title.getOptional("title")

            /**
             * Returns the raw JSON value of [code].
             *
             * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

            /**
             * Returns the raw JSON value of [detail].
             *
             * Unlike [detail], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("detail") @ExcludeMissing fun _detail(): JsonField<String> = detail

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            /**
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

                /** Returns a mutable builder for constructing an instance of [RejectionReason]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RejectionReason]. */
            class Builder internal constructor() {

                private var code: JsonField<String> = JsonMissing.of()
                private var detail: JsonField<String> = JsonMissing.of()
                private var message: JsonField<String> = JsonMissing.of()
                private var title: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(rejectionReason: RejectionReason) = apply {
                    code = rejectionReason.code
                    detail = rejectionReason.detail
                    message = rejectionReason.message
                    title = rejectionReason.title
                    additionalProperties = rejectionReason.additionalProperties.toMutableMap()
                }

                fun code(code: String) = code(JsonField.of(code))

                /**
                 * Sets [Builder.code] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.code] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<String>) = apply { this.code = code }

                fun detail(detail: String) = detail(JsonField.of(detail))

                /**
                 * Sets [Builder.detail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.detail] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun detail(detail: JsonField<String>) = apply { this.detail = detail }

                /**
                 * Customer-visible free-text comment from the Telnyx vetting team. Only the first
                 * entry of `rejection_reasons` carries this; the rest are `null`.
                 */
                fun message(message: String?) = message(JsonField.ofNullable(message))

                /** Alias for calling [Builder.message] with `message.orElse(null)`. */
                fun message(message: Optional<String>) = message(message.getOrNull())

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                fun title(title: String) = title(JsonField.of(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

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
                 * Returns an immutable instance of [RejectionReason].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RejectionReason =
                    RejectionReason(
                        code,
                        detail,
                        message,
                        title,
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
            fun validate(): RejectionReason = apply {
                if (validated) {
                    return@apply
                }

                code()
                detail()
                message()
                title()
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
                (if (code.asKnown().isPresent) 1 else 0) +
                    (if (detail.asKnown().isPresent) 1 else 0) +
                    (if (message.asKnown().isPresent) 1 else 0) +
                    (if (title.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RejectionReason &&
                    code == other.code &&
                    detail == other.detail &&
                    message == other.message &&
                    title == other.title &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(code, detail, message, title, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RejectionReason{code=$code, detail=$detail, message=$message, title=$title, additionalProperties=$additionalProperties}"
        }

        /**
         * Phone-number lifecycle status.
         * - `submitted` / `in_review` — Telnyx is reviewing the batch this number belongs to.
         * - `verified` — approved; the DIR's display identity will be shown on outbound calls from
         *   this number.
         * - `unsuccessful` — Telnyx rejected this submission; the customer may re-add to retry.
         * - `suspended` — temporarily disabled (e.g. by an active infringement claim on the DIR).
         * - `expired` — verification expired; re-add to renew.
         * - `permanently_rejected` — terminal; cannot be re-added on this or any other DIR you own.
         */
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

                @JvmField val SUBMITTED = of("submitted")

                @JvmField val IN_REVIEW = of("in_review")

                @JvmField val VERIFIED = of("verified")

                @JvmField val UNSUCCESSFUL = of("unsuccessful")

                @JvmField val SUSPENDED = of("suspended")

                @JvmField val EXPIRED = of("expired")

                @JvmField val PERMANENTLY_REJECTED = of("permanently_rejected")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                SUBMITTED,
                IN_REVIEW,
                VERIFIED,
                UNSUCCESSFUL,
                SUSPENDED,
                EXPIRED,
                PERMANENTLY_REJECTED,
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
                SUBMITTED,
                IN_REVIEW,
                VERIFIED,
                UNSUCCESSFUL,
                SUSPENDED,
                EXPIRED,
                PERMANENTLY_REJECTED,
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
                    SUBMITTED -> Value.SUBMITTED
                    IN_REVIEW -> Value.IN_REVIEW
                    VERIFIED -> Value.VERIFIED
                    UNSUCCESSFUL -> Value.UNSUCCESSFUL
                    SUSPENDED -> Value.SUSPENDED
                    EXPIRED -> Value.EXPIRED
                    PERMANENTLY_REJECTED -> Value.PERMANENTLY_REJECTED
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
                    SUBMITTED -> Known.SUBMITTED
                    IN_REVIEW -> Known.IN_REVIEW
                    VERIFIED -> Known.VERIFIED
                    UNSUCCESSFUL -> Known.UNSUCCESSFUL
                    SUSPENDED -> Known.SUSPENDED
                    EXPIRED -> Known.EXPIRED
                    PERMANENTLY_REJECTED -> Known.PERMANENTLY_REJECTED
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhoneNumber &&
                id == other.id &&
                batchId == other.batchId &&
                createdAt == other.createdAt &&
                dirId == other.dirId &&
                enterpriseId == other.enterpriseId &&
                loaDocumentId == other.loaDocumentId &&
                phoneNumber == other.phoneNumber &&
                rejectionReason == other.rejectionReason &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                verifiedAt == other.verifiedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                batchId,
                createdAt,
                dirId,
                enterpriseId,
                loaDocumentId,
                phoneNumber,
                rejectionReason,
                status,
                updatedAt,
                verifiedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhoneNumber{id=$id, batchId=$batchId, createdAt=$createdAt, dirId=$dirId, enterpriseId=$enterpriseId, loaDocumentId=$loaDocumentId, phoneNumber=$phoneNumber, rejectionReason=$rejectionReason, status=$status, updatedAt=$updatedAt, verifiedAt=$verifiedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Aggregate batch status. Mirrors the values used on individual phone numbers (`submitted`,
     * `in_review`, `verified`, `unsuccessful`, `permanently_rejected`, etc.).
     */
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

            @JvmField val SUBMITTED = of("submitted")

            @JvmField val IN_REVIEW = of("in_review")

            @JvmField val VERIFIED = of("verified")

            @JvmField val UNSUCCESSFUL = of("unsuccessful")

            @JvmField val SUSPENDED = of("suspended")

            @JvmField val EXPIRED = of("expired")

            @JvmField val PERMANENTLY_REJECTED = of("permanently_rejected")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            SUBMITTED,
            IN_REVIEW,
            VERIFIED,
            UNSUCCESSFUL,
            SUSPENDED,
            EXPIRED,
            PERMANENTLY_REJECTED,
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
            SUBMITTED,
            IN_REVIEW,
            VERIFIED,
            UNSUCCESSFUL,
            SUSPENDED,
            EXPIRED,
            PERMANENTLY_REJECTED,
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
                SUBMITTED -> Value.SUBMITTED
                IN_REVIEW -> Value.IN_REVIEW
                VERIFIED -> Value.VERIFIED
                UNSUCCESSFUL -> Value.UNSUCCESSFUL
                SUSPENDED -> Value.SUSPENDED
                EXPIRED -> Value.EXPIRED
                PERMANENTLY_REJECTED -> Value.PERMANENTLY_REJECTED
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
                SUBMITTED -> Known.SUBMITTED
                IN_REVIEW -> Known.IN_REVIEW
                VERIFIED -> Known.VERIFIED
                UNSUCCESSFUL -> Known.UNSUCCESSFUL
                SUSPENDED -> Known.SUSPENDED
                EXPIRED -> Known.EXPIRED
                PERMANENTLY_REJECTED -> Known.PERMANENTLY_REJECTED
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberBatchListResponse &&
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
        "PhoneNumberBatchListResponse{batchId=$batchId, dirDisplayName=$dirDisplayName, dirId=$dirId, documents=$documents, enterpriseId=$enterpriseId, phoneNumbers=$phoneNumbers, status=$status, submittedAt=$submittedAt, totalCount=$totalCount, additionalProperties=$additionalProperties}"
}
