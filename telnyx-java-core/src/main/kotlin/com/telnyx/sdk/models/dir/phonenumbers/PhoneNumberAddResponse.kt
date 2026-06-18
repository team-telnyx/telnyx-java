// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.phonenumbers

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
 * Bulk-add success response (HTTP 201). All numbers in the request were accepted into a single new
 * batch. Every entry in `data` shares the same `batch_id` - read it from any element to obtain the
 * batch id for subsequent `GET .../phone_number_batches/{batch_id}` calls. If any number in the
 * request fails (schema-invalid, not in inventory, already attached to another DIR, etc.) the
 * entire request is rejected with HTTP 400 and the canonical Telnyx error envelope; the success
 * body described here is therefore an all-or-nothing payload.
 */
class PhoneNumberAddResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * Phone numbers accepted into the new batch. List order mirrors the request order. Each element
     * shares the same `batch_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
         * Returns a mutable builder for constructing an instance of [PhoneNumberAddResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberAddResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(phoneNumberAddResponse: PhoneNumberAddResponse) = apply {
            data = phoneNumberAddResponse.data.map { it.toMutableList() }
            additionalProperties = phoneNumberAddResponse.additionalProperties.toMutableMap()
        }

        /**
         * Phone numbers accepted into the new batch. List order mirrors the request order. Each
         * element shares the same `batch_id`.
         */
        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
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
         * Returns an immutable instance of [PhoneNumberAddResponse].
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
        fun build(): PhoneNumberAddResponse =
            PhoneNumberAddResponse(
                checkRequired("data", data).map { it.toImmutable() },
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
    fun validate(): PhoneNumberAddResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Data
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
         * - `submitted` / `in_review` - Telnyx is reviewing the batch this number belongs to.
         * - `verified` - approved; the DIR's display identity will be shown on outbound calls from
         *   this number.
         * - `unsuccessful` - Telnyx rejected this submission; the customer may re-add to retry.
         * - `suspended` - temporarily disabled (e.g. by an active infringement claim on the DIR).
         * - `expired` - verification expired; re-add to renew.
         * - `permanently_rejected` - terminal; cannot be re-added on this or any other DIR you own.
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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
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
            internal fun from(data: Data) = apply {
                id = data.id
                batchId = data.batchId
                createdAt = data.createdAt
                dirId = data.dirId
                enterpriseId = data.enterpriseId
                loaDocumentId = data.loaDocumentId
                phoneNumber = data.phoneNumber
                rejectionReason = data.rejectionReason
                status = data.status
                updatedAt = data.updatedAt
                verifiedAt = data.verifiedAt
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
             * - `submitted` / `in_review` - Telnyx is reviewing the batch this number belongs to.
             * - `verified` - approved; the DIR's display identity will be shown on outbound calls
             *   from this number.
             * - `unsuccessful` - Telnyx rejected this submission; the customer may re-add to retry.
             * - `suspended` - temporarily disabled (e.g. by an active infringement claim on the
             *   DIR).
             * - `expired` - verification expired; re-add to renew.
             * - `permanently_rejected` - terminal; cannot be re-added on this or any other DIR you
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
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
        fun validate(): Data = apply {
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
         * - `submitted` / `in_review` - Telnyx is reviewing the batch this number belongs to.
         * - `verified` - approved; the DIR's display identity will be shown on outbound calls from
         *   this number.
         * - `unsuccessful` - Telnyx rejected this submission; the customer may re-add to retry.
         * - `suspended` - temporarily disabled (e.g. by an active infringement claim on the DIR).
         * - `expired` - verification expired; re-add to renew.
         * - `permanently_rejected` - terminal; cannot be re-added on this or any other DIR you own.
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

            return other is Data &&
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
            "Data{id=$id, batchId=$batchId, createdAt=$createdAt, dirId=$dirId, enterpriseId=$enterpriseId, loaDocumentId=$loaDocumentId, phoneNumber=$phoneNumber, rejectionReason=$rejectionReason, status=$status, updatedAt=$updatedAt, verifiedAt=$verifiedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberAddResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumberAddResponse{data=$data, additionalProperties=$additionalProperties}"
}
