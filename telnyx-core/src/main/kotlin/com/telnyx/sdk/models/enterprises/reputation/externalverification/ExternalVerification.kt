// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.externalverification

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalVerification
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val documentIds: JsonField<List<String>>,
    private val enterpriseId: JsonField<String>,
    private val phoneNumbers: JsonField<List<String>>,
    private val rejectionReason: JsonField<String>,
    private val reviewedAt: JsonField<OffsetDateTime>,
    private val status: JsonField<ExternalVerificationStatus>,
    private val submittedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("document_ids")
        @ExcludeMissing
        documentIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("enterprise_id")
        @ExcludeMissing
        enterpriseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        phoneNumbers: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("rejection_reason")
        @ExcludeMissing
        rejectionReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reviewed_at")
        @ExcludeMissing
        reviewedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<ExternalVerificationStatus> = JsonMissing.of(),
        @JsonProperty("submitted_at")
        @ExcludeMissing
        submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        documentIds,
        enterpriseId,
        phoneNumbers,
        rejectionReason,
        reviewedAt,
        status,
        submittedAt,
        mutableMapOf(),
    )

    /**
     * The ownership-proof documents on file.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentIds(): Optional<List<String>> = documentIds.getOptional("document_ids")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enterpriseId(): Optional<String> = enterpriseId.getOptional("enterprise_id")

    /**
     * The phone numbers you listed with the documents.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumbers(): Optional<List<String>> = phoneNumbers.getOptional("phone_numbers")

    /**
     * Why the proof was rejected. Set only when `status` is `rejected`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rejectionReason(): Optional<String> = rejectionReason.getOptional("rejection_reason")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reviewedAt(): Optional<OffsetDateTime> = reviewedAt.getOptional("reviewed_at")

    /**
     * Review state of the ownership proof that allows adding phone numbers hosted with another
     * provider.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<ExternalVerificationStatus> = status.getOptional("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submittedAt(): Optional<OffsetDateTime> = submittedAt.getOptional("submitted_at")

    /**
     * Returns the raw JSON value of [documentIds].
     *
     * Unlike [documentIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_ids")
    @ExcludeMissing
    fun _documentIds(): JsonField<List<String>> = documentIds

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
    fun _phoneNumbers(): JsonField<List<String>> = phoneNumbers

    /**
     * Returns the raw JSON value of [rejectionReason].
     *
     * Unlike [rejectionReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rejection_reason")
    @ExcludeMissing
    fun _rejectionReason(): JsonField<String> = rejectionReason

    /**
     * Returns the raw JSON value of [reviewedAt].
     *
     * Unlike [reviewedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reviewed_at")
    @ExcludeMissing
    fun _reviewedAt(): JsonField<OffsetDateTime> = reviewedAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<ExternalVerificationStatus> = status

    /**
     * Returns the raw JSON value of [submittedAt].
     *
     * Unlike [submittedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submitted_at")
    @ExcludeMissing
    fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

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

        /** Returns a mutable builder for constructing an instance of [ExternalVerification]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalVerification]. */
    class Builder internal constructor() {

        private var documentIds: JsonField<MutableList<String>>? = null
        private var enterpriseId: JsonField<String> = JsonMissing.of()
        private var phoneNumbers: JsonField<MutableList<String>>? = null
        private var rejectionReason: JsonField<String> = JsonMissing.of()
        private var reviewedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<ExternalVerificationStatus> = JsonMissing.of()
        private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalVerification: ExternalVerification) = apply {
            documentIds = externalVerification.documentIds.map { it.toMutableList() }
            enterpriseId = externalVerification.enterpriseId
            phoneNumbers = externalVerification.phoneNumbers.map { it.toMutableList() }
            rejectionReason = externalVerification.rejectionReason
            reviewedAt = externalVerification.reviewedAt
            status = externalVerification.status
            submittedAt = externalVerification.submittedAt
            additionalProperties = externalVerification.additionalProperties.toMutableMap()
        }

        /** The ownership-proof documents on file. */
        fun documentIds(documentIds: List<String>) = documentIds(JsonField.of(documentIds))

        /**
         * Sets [Builder.documentIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentIds(documentIds: JsonField<List<String>>) = apply {
            this.documentIds = documentIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [documentIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocumentId(documentId: String) = apply {
            documentIds =
                (documentIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documentIds", it).add(documentId)
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

        /** The phone numbers you listed with the documents. */
        fun phoneNumbers(phoneNumbers: List<String>) = phoneNumbers(JsonField.of(phoneNumbers))

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
            this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: String) = apply {
            phoneNumbers =
                (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phoneNumbers", it).add(phoneNumber)
                }
        }

        /** Why the proof was rejected. Set only when `status` is `rejected`. */
        fun rejectionReason(rejectionReason: String?) =
            rejectionReason(JsonField.ofNullable(rejectionReason))

        /** Alias for calling [Builder.rejectionReason] with `rejectionReason.orElse(null)`. */
        fun rejectionReason(rejectionReason: Optional<String>) =
            rejectionReason(rejectionReason.getOrNull())

        /**
         * Sets [Builder.rejectionReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rejectionReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rejectionReason(rejectionReason: JsonField<String>) = apply {
            this.rejectionReason = rejectionReason
        }

        fun reviewedAt(reviewedAt: OffsetDateTime?) = reviewedAt(JsonField.ofNullable(reviewedAt))

        /** Alias for calling [Builder.reviewedAt] with `reviewedAt.orElse(null)`. */
        fun reviewedAt(reviewedAt: Optional<OffsetDateTime>) = reviewedAt(reviewedAt.getOrNull())

        /**
         * Sets [Builder.reviewedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reviewedAt(reviewedAt: JsonField<OffsetDateTime>) = apply {
            this.reviewedAt = reviewedAt
        }

        /**
         * Review state of the ownership proof that allows adding phone numbers hosted with another
         * provider.
         */
        fun status(status: ExternalVerificationStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [ExternalVerificationStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun status(status: JsonField<ExternalVerificationStatus>) = apply { this.status = status }

        fun submittedAt(submittedAt: OffsetDateTime?) =
            submittedAt(JsonField.ofNullable(submittedAt))

        /** Alias for calling [Builder.submittedAt] with `submittedAt.orElse(null)`. */
        fun submittedAt(submittedAt: Optional<OffsetDateTime>) =
            submittedAt(submittedAt.getOrNull())

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
         * Returns an immutable instance of [ExternalVerification].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExternalVerification =
            ExternalVerification(
                (documentIds ?: JsonMissing.of()).map { it.toImmutable() },
                enterpriseId,
                (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                rejectionReason,
                reviewedAt,
                status,
                submittedAt,
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
    fun validate(): ExternalVerification = apply {
        if (validated) {
            return@apply
        }

        documentIds()
        enterpriseId()
        phoneNumbers()
        rejectionReason()
        reviewedAt()
        status().ifPresent { it.validate() }
        submittedAt()
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
        (documentIds.asKnown().getOrNull()?.size ?: 0) +
            (if (enterpriseId.asKnown().isPresent) 1 else 0) +
            (phoneNumbers.asKnown().getOrNull()?.size ?: 0) +
            (if (rejectionReason.asKnown().isPresent) 1 else 0) +
            (if (reviewedAt.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (submittedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalVerification &&
            documentIds == other.documentIds &&
            enterpriseId == other.enterpriseId &&
            phoneNumbers == other.phoneNumbers &&
            rejectionReason == other.rejectionReason &&
            reviewedAt == other.reviewedAt &&
            status == other.status &&
            submittedAt == other.submittedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            documentIds,
            enterpriseId,
            phoneNumbers,
            rejectionReason,
            reviewedAt,
            status,
            submittedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalVerification{documentIds=$documentIds, enterpriseId=$enterpriseId, phoneNumbers=$phoneNumbers, rejectionReason=$rejectionReason, reviewedAt=$reviewedAt, status=$status, submittedAt=$submittedAt, additionalProperties=$additionalProperties}"
}
