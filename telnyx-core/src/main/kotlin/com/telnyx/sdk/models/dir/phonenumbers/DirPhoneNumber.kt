// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.phonenumbers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.dir.phonenumberbatches.DirPhoneNumberStatus
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DirPhoneNumber
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
    private val status: JsonField<DirPhoneNumberStatus>,
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
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<DirPhoneNumberStatus> = JsonMissing.of(),
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
     * - `submitted` / `in_review` - Telnyx is reviewing the batch this number belongs to.
     * - `verified` - approved; the DIR's display identity will be shown on outbound calls from this
     *   number.
     * - `unsuccessful` - Telnyx rejected this submission; the customer may re-add to retry.
     * - `suspended` - temporarily disabled (e.g. by an active infringement claim on the DIR).
     * - `expired` - verification expired; re-add to renew.
     * - `permanently_rejected` - terminal; cannot be re-added on this or any other DIR you own.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<DirPhoneNumberStatus> = status.getOptional("status")

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
     * Unlike [enterpriseId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enterprise_id")
    @ExcludeMissing
    fun _enterpriseId(): JsonField<String> = enterpriseId

    /**
     * Returns the raw JSON value of [loaDocumentId].
     *
     * Unlike [loaDocumentId], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [rejectionReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rejection_reason")
    @ExcludeMissing
    fun _rejectionReason(): JsonField<RejectionReason> = rejectionReason

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<DirPhoneNumberStatus> = status

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

        /** Returns a mutable builder for constructing an instance of [DirPhoneNumber]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DirPhoneNumber]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var batchId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dirId: JsonField<String> = JsonMissing.of()
        private var enterpriseId: JsonField<String> = JsonMissing.of()
        private var loaDocumentId: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var rejectionReason: JsonField<RejectionReason> = JsonMissing.of()
        private var status: JsonField<DirPhoneNumberStatus> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var verifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dirPhoneNumber: DirPhoneNumber) = apply {
            id = dirPhoneNumber.id
            batchId = dirPhoneNumber.batchId
            createdAt = dirPhoneNumber.createdAt
            dirId = dirPhoneNumber.dirId
            enterpriseId = dirPhoneNumber.enterpriseId
            loaDocumentId = dirPhoneNumber.loaDocumentId
            phoneNumber = dirPhoneNumber.phoneNumber
            rejectionReason = dirPhoneNumber.rejectionReason
            status = dirPhoneNumber.status
            updatedAt = dirPhoneNumber.updatedAt
            verifiedAt = dirPhoneNumber.verifiedAt
            additionalProperties = dirPhoneNumber.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Id of the batch this number was vetted as part of. */
        fun batchId(batchId: String?) = batchId(JsonField.ofNullable(batchId))

        /** Alias for calling [Builder.batchId] with `batchId.orElse(null)`. */
        fun batchId(batchId: Optional<String>) = batchId(batchId.getOrNull())

        /**
         * Sets [Builder.batchId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.batchId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun dirId(dirId: String) = dirId(JsonField.of(dirId))

        /**
         * Sets [Builder.dirId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dirId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dirId(dirId: JsonField<String>) = apply { this.dirId = dirId }

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

        /** Id of the Letter of Authorization document attached to this number's batch. */
        fun loaDocumentId(loaDocumentId: String?) =
            loaDocumentId(JsonField.ofNullable(loaDocumentId))

        /** Alias for calling [Builder.loaDocumentId] with `loaDocumentId.orElse(null)`. */
        fun loaDocumentId(loaDocumentId: Optional<String>) =
            loaDocumentId(loaDocumentId.getOrNull())

        /**
         * Sets [Builder.loaDocumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loaDocumentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun loaDocumentId(loaDocumentId: JsonField<String>) = apply {
            this.loaDocumentId = loaDocumentId
        }

        /** E.164 with leading `+`. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

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
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rejectionReason(rejectionReason: JsonField<RejectionReason>) = apply {
            this.rejectionReason = rejectionReason
        }

        /**
         * Phone-number lifecycle status.
         * - `submitted` / `in_review` - Telnyx is reviewing the batch this number belongs to.
         * - `verified` - approved; the DIR's display identity will be shown on outbound calls from
         *   this number.
         * - `unsuccessful` - Telnyx rejected this submission; the customer may re-add to retry.
         * - `suspended` - temporarily disabled (e.g. by an active infringement claim on the DIR).
         * - `expired` - verification expired; re-add to renew.
         * - `permanently_rejected` - terminal; cannot be re-added on this or any other DIR you own.
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

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun verifiedAt(verifiedAt: OffsetDateTime?) = verifiedAt(JsonField.ofNullable(verifiedAt))

        /** Alias for calling [Builder.verifiedAt] with `verifiedAt.orElse(null)`. */
        fun verifiedAt(verifiedAt: Optional<OffsetDateTime>) = verifiedAt(verifiedAt.getOrNull())

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
         * Returns an immutable instance of [DirPhoneNumber].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DirPhoneNumber =
            DirPhoneNumber(
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
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): DirPhoneNumber = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DirPhoneNumber &&
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
        "DirPhoneNumber{id=$id, batchId=$batchId, createdAt=$createdAt, dirId=$dirId, enterpriseId=$enterpriseId, loaDocumentId=$loaDocumentId, phoneNumber=$phoneNumber, rejectionReason=$rejectionReason, status=$status, updatedAt=$updatedAt, verifiedAt=$verifiedAt, additionalProperties=$additionalProperties}"
}
