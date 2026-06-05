// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.infringementclaims

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

class InfringementClaimContestResponse
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
         * [InfringementClaimContestResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InfringementClaimContestResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(infringementClaimContestResponse: InfringementClaimContestResponse) =
            apply {
                data = infringementClaimContestResponse.data
                additionalProperties =
                    infringementClaimContestResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [InfringementClaimContestResponse].
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
        fun build(): InfringementClaimContestResponse =
            InfringementClaimContestResponse(
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
    fun validate(): InfringementClaimContestResponse = apply {
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
        private val id: JsonField<String>,
        private val claimDate: JsonField<OffsetDateTime>,
        private val claimDescription: JsonField<String>,
        private val claimType: JsonField<ClaimType>,
        private val claimantContact: JsonField<String>,
        private val claimantName: JsonField<String>,
        private val contestDocuments: JsonField<List<ContestDocument>>,
        private val contestHistory: JsonField<List<ContestHistory>>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val dir: JsonField<Dir>,
        private val dirId: JsonField<String>,
        private val enterpriseId: JsonField<String>,
        private val resolution: JsonField<Resolution>,
        private val resolutionDate: JsonField<OffsetDateTime>,
        private val resolutionNotes: JsonField<String>,
        private val status: JsonField<Status>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("claim_date")
            @ExcludeMissing
            claimDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("claim_description")
            @ExcludeMissing
            claimDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("claim_type")
            @ExcludeMissing
            claimType: JsonField<ClaimType> = JsonMissing.of(),
            @JsonProperty("claimant_contact")
            @ExcludeMissing
            claimantContact: JsonField<String> = JsonMissing.of(),
            @JsonProperty("claimant_name")
            @ExcludeMissing
            claimantName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contest_documents")
            @ExcludeMissing
            contestDocuments: JsonField<List<ContestDocument>> = JsonMissing.of(),
            @JsonProperty("contest_history")
            @ExcludeMissing
            contestHistory: JsonField<List<ContestHistory>> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dir") @ExcludeMissing dir: JsonField<Dir> = JsonMissing.of(),
            @JsonProperty("dir_id") @ExcludeMissing dirId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enterprise_id")
            @ExcludeMissing
            enterpriseId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resolution")
            @ExcludeMissing
            resolution: JsonField<Resolution> = JsonMissing.of(),
            @JsonProperty("resolution_date")
            @ExcludeMissing
            resolutionDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("resolution_notes")
            @ExcludeMissing
            resolutionNotes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            claimDate,
            claimDescription,
            claimType,
            claimantContact,
            claimantName,
            contestDocuments,
            contestHistory,
            createdAt,
            dir,
            dirId,
            enterpriseId,
            resolution,
            resolutionDate,
            resolutionNotes,
            status,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * When the claim was filed (set by the claimant's representative at file time).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun claimDate(): Optional<OffsetDateTime> = claimDate.getOptional("claim_date")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun claimDescription(): Optional<String> = claimDescription.getOptional("claim_description")

        /**
         * Category of infringement being claimed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun claimType(): Optional<ClaimType> = claimType.getOptional("claim_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun claimantContact(): Optional<String> = claimantContact.getOptional("claimant_contact")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun claimantName(): Optional<String> = claimantName.getOptional("claimant_name")

        /**
         * Aggregated across all customer contest submissions on this claim.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contestDocuments(): Optional<List<ContestDocument>> =
            contestDocuments.getOptional("contest_documents")

        /**
         * Per-round submission audit trail. Each entry records one `POST
         * /infringement_claims/{id}/contest` call (notes, timestamp, document count). Aggregated
         * documents live on `contest_documents`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contestHistory(): Optional<List<ContestHistory>> =
            contestHistory.getOptional("contest_history")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Snapshot of the DIR the claim is filed against, embedded for convenience.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dir(): Optional<Dir> = dir.getOptional("dir")

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
         * Set only when `status` is `resolved`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resolution(): Optional<Resolution> = resolution.getOptional("resolution")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resolutionDate(): Optional<OffsetDateTime> =
            resolutionDate.getOptional("resolution_date")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resolutionNotes(): Optional<String> = resolutionNotes.getOptional("resolution_notes")

        /**
         * Lifecycle status. `pending` — newly filed; the DIR is auto-suspended. `contested` — you
         * have submitted contest evidence; awaiting Telnyx review. `resolved` — final.
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
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [claimDate].
         *
         * Unlike [claimDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("claim_date")
        @ExcludeMissing
        fun _claimDate(): JsonField<OffsetDateTime> = claimDate

        /**
         * Returns the raw JSON value of [claimDescription].
         *
         * Unlike [claimDescription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("claim_description")
        @ExcludeMissing
        fun _claimDescription(): JsonField<String> = claimDescription

        /**
         * Returns the raw JSON value of [claimType].
         *
         * Unlike [claimType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("claim_type")
        @ExcludeMissing
        fun _claimType(): JsonField<ClaimType> = claimType

        /**
         * Returns the raw JSON value of [claimantContact].
         *
         * Unlike [claimantContact], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("claimant_contact")
        @ExcludeMissing
        fun _claimantContact(): JsonField<String> = claimantContact

        /**
         * Returns the raw JSON value of [claimantName].
         *
         * Unlike [claimantName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("claimant_name")
        @ExcludeMissing
        fun _claimantName(): JsonField<String> = claimantName

        /**
         * Returns the raw JSON value of [contestDocuments].
         *
         * Unlike [contestDocuments], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contest_documents")
        @ExcludeMissing
        fun _contestDocuments(): JsonField<List<ContestDocument>> = contestDocuments

        /**
         * Returns the raw JSON value of [contestHistory].
         *
         * Unlike [contestHistory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contest_history")
        @ExcludeMissing
        fun _contestHistory(): JsonField<List<ContestHistory>> = contestHistory

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [dir].
         *
         * Unlike [dir], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dir") @ExcludeMissing fun _dir(): JsonField<Dir> = dir

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
         * Returns the raw JSON value of [resolution].
         *
         * Unlike [resolution], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resolution")
        @ExcludeMissing
        fun _resolution(): JsonField<Resolution> = resolution

        /**
         * Returns the raw JSON value of [resolutionDate].
         *
         * Unlike [resolutionDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("resolution_date")
        @ExcludeMissing
        fun _resolutionDate(): JsonField<OffsetDateTime> = resolutionDate

        /**
         * Returns the raw JSON value of [resolutionNotes].
         *
         * Unlike [resolutionNotes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("resolution_notes")
        @ExcludeMissing
        fun _resolutionNotes(): JsonField<String> = resolutionNotes

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
            private var claimDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var claimDescription: JsonField<String> = JsonMissing.of()
            private var claimType: JsonField<ClaimType> = JsonMissing.of()
            private var claimantContact: JsonField<String> = JsonMissing.of()
            private var claimantName: JsonField<String> = JsonMissing.of()
            private var contestDocuments: JsonField<MutableList<ContestDocument>>? = null
            private var contestHistory: JsonField<MutableList<ContestHistory>>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dir: JsonField<Dir> = JsonMissing.of()
            private var dirId: JsonField<String> = JsonMissing.of()
            private var enterpriseId: JsonField<String> = JsonMissing.of()
            private var resolution: JsonField<Resolution> = JsonMissing.of()
            private var resolutionDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var resolutionNotes: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                claimDate = data.claimDate
                claimDescription = data.claimDescription
                claimType = data.claimType
                claimantContact = data.claimantContact
                claimantName = data.claimantName
                contestDocuments = data.contestDocuments.map { it.toMutableList() }
                contestHistory = data.contestHistory.map { it.toMutableList() }
                createdAt = data.createdAt
                dir = data.dir
                dirId = data.dirId
                enterpriseId = data.enterpriseId
                resolution = data.resolution
                resolutionDate = data.resolutionDate
                resolutionNotes = data.resolutionNotes
                status = data.status
                updatedAt = data.updatedAt
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

            /** When the claim was filed (set by the claimant's representative at file time). */
            fun claimDate(claimDate: OffsetDateTime) = claimDate(JsonField.of(claimDate))

            /**
             * Sets [Builder.claimDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.claimDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun claimDate(claimDate: JsonField<OffsetDateTime>) = apply {
                this.claimDate = claimDate
            }

            fun claimDescription(claimDescription: String) =
                claimDescription(JsonField.of(claimDescription))

            /**
             * Sets [Builder.claimDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.claimDescription] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun claimDescription(claimDescription: JsonField<String>) = apply {
                this.claimDescription = claimDescription
            }

            /** Category of infringement being claimed. */
            fun claimType(claimType: ClaimType) = claimType(JsonField.of(claimType))

            /**
             * Sets [Builder.claimType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.claimType] with a well-typed [ClaimType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun claimType(claimType: JsonField<ClaimType>) = apply { this.claimType = claimType }

            fun claimantContact(claimantContact: String) =
                claimantContact(JsonField.of(claimantContact))

            /**
             * Sets [Builder.claimantContact] to an arbitrary JSON value.
             *
             * You should usually call [Builder.claimantContact] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun claimantContact(claimantContact: JsonField<String>) = apply {
                this.claimantContact = claimantContact
            }

            fun claimantName(claimantName: String) = claimantName(JsonField.of(claimantName))

            /**
             * Sets [Builder.claimantName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.claimantName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun claimantName(claimantName: JsonField<String>) = apply {
                this.claimantName = claimantName
            }

            /** Aggregated across all customer contest submissions on this claim. */
            fun contestDocuments(contestDocuments: List<ContestDocument>) =
                contestDocuments(JsonField.of(contestDocuments))

            /**
             * Sets [Builder.contestDocuments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contestDocuments] with a well-typed
             * `List<ContestDocument>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun contestDocuments(contestDocuments: JsonField<List<ContestDocument>>) = apply {
                this.contestDocuments = contestDocuments.map { it.toMutableList() }
            }

            /**
             * Adds a single [ContestDocument] to [contestDocuments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContestDocument(contestDocument: ContestDocument) = apply {
                contestDocuments =
                    (contestDocuments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contestDocuments", it).add(contestDocument)
                    }
            }

            /**
             * Per-round submission audit trail. Each entry records one `POST
             * /infringement_claims/{id}/contest` call (notes, timestamp, document count).
             * Aggregated documents live on `contest_documents`.
             */
            fun contestHistory(contestHistory: List<ContestHistory>) =
                contestHistory(JsonField.of(contestHistory))

            /**
             * Sets [Builder.contestHistory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contestHistory] with a well-typed
             * `List<ContestHistory>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun contestHistory(contestHistory: JsonField<List<ContestHistory>>) = apply {
                this.contestHistory = contestHistory.map { it.toMutableList() }
            }

            /**
             * Adds a single [ContestHistory] to [Builder.contestHistory].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContestHistory(contestHistory: ContestHistory) = apply {
                this.contestHistory =
                    (this.contestHistory ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contestHistory", it).add(contestHistory)
                    }
            }

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

            /** Snapshot of the DIR the claim is filed against, embedded for convenience. */
            fun dir(dir: Dir) = dir(JsonField.of(dir))

            /**
             * Sets [Builder.dir] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dir] with a well-typed [Dir] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun dir(dir: JsonField<Dir>) = apply { this.dir = dir }

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

            /** Set only when `status` is `resolved`. */
            fun resolution(resolution: Resolution?) = resolution(JsonField.ofNullable(resolution))

            /** Alias for calling [Builder.resolution] with `resolution.orElse(null)`. */
            fun resolution(resolution: Optional<Resolution>) = resolution(resolution.getOrNull())

            /**
             * Sets [Builder.resolution] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resolution] with a well-typed [Resolution] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resolution(resolution: JsonField<Resolution>) = apply {
                this.resolution = resolution
            }

            fun resolutionDate(resolutionDate: OffsetDateTime?) =
                resolutionDate(JsonField.ofNullable(resolutionDate))

            /** Alias for calling [Builder.resolutionDate] with `resolutionDate.orElse(null)`. */
            fun resolutionDate(resolutionDate: Optional<OffsetDateTime>) =
                resolutionDate(resolutionDate.getOrNull())

            /**
             * Sets [Builder.resolutionDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resolutionDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun resolutionDate(resolutionDate: JsonField<OffsetDateTime>) = apply {
                this.resolutionDate = resolutionDate
            }

            fun resolutionNotes(resolutionNotes: String?) =
                resolutionNotes(JsonField.ofNullable(resolutionNotes))

            /** Alias for calling [Builder.resolutionNotes] with `resolutionNotes.orElse(null)`. */
            fun resolutionNotes(resolutionNotes: Optional<String>) =
                resolutionNotes(resolutionNotes.getOrNull())

            /**
             * Sets [Builder.resolutionNotes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resolutionNotes] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resolutionNotes(resolutionNotes: JsonField<String>) = apply {
                this.resolutionNotes = resolutionNotes
            }

            /**
             * Lifecycle status. `pending` — newly filed; the DIR is auto-suspended. `contested` —
             * you have submitted contest evidence; awaiting Telnyx review. `resolved` — final.
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
                    claimDate,
                    claimDescription,
                    claimType,
                    claimantContact,
                    claimantName,
                    (contestDocuments ?: JsonMissing.of()).map { it.toImmutable() },
                    (contestHistory ?: JsonMissing.of()).map { it.toImmutable() },
                    createdAt,
                    dir,
                    dirId,
                    enterpriseId,
                    resolution,
                    resolutionDate,
                    resolutionNotes,
                    status,
                    updatedAt,
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
            claimDate()
            claimDescription()
            claimType().ifPresent { it.validate() }
            claimantContact()
            claimantName()
            contestDocuments().ifPresent { it.forEach { it.validate() } }
            contestHistory().ifPresent { it.forEach { it.validate() } }
            createdAt()
            dir().ifPresent { it.validate() }
            dirId()
            enterpriseId()
            resolution().ifPresent { it.validate() }
            resolutionDate()
            resolutionNotes()
            status().ifPresent { it.validate() }
            updatedAt()
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
                (if (claimDate.asKnown().isPresent) 1 else 0) +
                (if (claimDescription.asKnown().isPresent) 1 else 0) +
                (claimType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (claimantContact.asKnown().isPresent) 1 else 0) +
                (if (claimantName.asKnown().isPresent) 1 else 0) +
                (contestDocuments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (contestHistory.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (dir.asKnown().getOrNull()?.validity() ?: 0) +
                (if (dirId.asKnown().isPresent) 1 else 0) +
                (if (enterpriseId.asKnown().isPresent) 1 else 0) +
                (resolution.asKnown().getOrNull()?.validity() ?: 0) +
                (if (resolutionDate.asKnown().isPresent) 1 else 0) +
                (if (resolutionNotes.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        /** Category of infringement being claimed. */
        class ClaimType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val TRADEMARK = of("trademark")

                @JvmField val COPYRIGHT = of("copyright")

                @JvmStatic fun of(value: String) = ClaimType(JsonField.of(value))
            }

            /** An enum containing [ClaimType]'s known values. */
            enum class Known {
                TRADEMARK,
                COPYRIGHT,
            }

            /**
             * An enum containing [ClaimType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ClaimType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TRADEMARK,
                COPYRIGHT,
                /**
                 * An enum member indicating that [ClaimType] was instantiated with an unknown
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
                    TRADEMARK -> Value.TRADEMARK
                    COPYRIGHT -> Value.COPYRIGHT
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
                    TRADEMARK -> Known.TRADEMARK
                    COPYRIGHT -> Known.COPYRIGHT
                    else -> throw TelnyxInvalidDataException("Unknown ClaimType: $value")
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
            fun validate(): ClaimType = apply {
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

                return other is ClaimType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ContestDocument
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
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun documentId(): String = documentId.getRequired("document_id")

            /**
             * Type of supporting document. Pick the closest match to what the file actually
             * contains; `other` triggers manual vetting and may slow approval. The matching
             * short_name reference list is at `GET /v2/dir/document_types`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun documentType(): DocumentType = documentType.getRequired("document_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Returns the raw JSON value of [documentId].
             *
             * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [ContestDocument].
                 *
                 * The following fields are required:
                 * ```java
                 * .documentId()
                 * .documentType()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ContestDocument]. */
            class Builder internal constructor() {

                private var documentId: JsonField<String>? = null
                private var documentType: JsonField<DocumentType>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contestDocument: ContestDocument) = apply {
                    documentId = contestDocument.documentId
                    documentType = contestDocument.documentType
                    description = contestDocument.description
                    additionalProperties = contestDocument.additionalProperties.toMutableMap()
                }

                /**
                 * Id returned by the Telnyx Documents API after you upload the file (upload via
                 * `POST /v2/documents`; see https://developers.telnyx.com/api/documents).
                 */
                fun documentId(documentId: String) = documentId(JsonField.of(documentId))

                /**
                 * Sets [Builder.documentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.documentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun documentId(documentId: JsonField<String>) = apply {
                    this.documentId = documentId
                }

                /**
                 * Type of supporting document. Pick the closest match to what the file actually
                 * contains; `other` triggers manual vetting and may slow approval. The matching
                 * short_name reference list is at `GET /v2/dir/document_types`.
                 */
                fun documentType(documentType: DocumentType) =
                    documentType(JsonField.of(documentType))

                /**
                 * Sets [Builder.documentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.documentType] with a well-typed [DocumentType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun documentType(documentType: JsonField<DocumentType>) = apply {
                    this.documentType = documentType
                }

                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [ContestDocument].
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
                fun build(): ContestDocument =
                    ContestDocument(
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): ContestDocument = apply {
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
             * Type of supporting document. Pick the closest match to what the file actually
             * contains; `other` triggers manual vetting and may slow approval. The matching
             * short_name reference list is at `GET /v2/dir/document_types`.
             */
            class DocumentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DocumentType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * An enum member indicating that [DocumentType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
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

                return other is ContestDocument &&
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
                "ContestDocument{documentId=$documentId, documentType=$documentType, description=$description, additionalProperties=$additionalProperties}"
        }

        /**
         * One round of customer contest evidence on an infringement claim. The aggregated documents
         * across rounds live on the parent claim's `contest_documents`; this submission record
         * carries only the per-round notes and document count.
         */
        class ContestHistory
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val documentCount: JsonField<Long>,
            private val notes: JsonField<String>,
            private val submittedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("document_count")
                @ExcludeMissing
                documentCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
                @JsonProperty("submitted_at")
                @ExcludeMissing
                submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(documentCount, notes, submittedAt, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun documentCount(): Optional<Long> = documentCount.getOptional("document_count")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun notes(): Optional<String> = notes.getOptional("notes")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun submittedAt(): Optional<OffsetDateTime> = submittedAt.getOptional("submitted_at")

            /**
             * Returns the raw JSON value of [documentCount].
             *
             * Unlike [documentCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("document_count")
            @ExcludeMissing
            fun _documentCount(): JsonField<Long> = documentCount

            /**
             * Returns the raw JSON value of [notes].
             *
             * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

            /**
             * Returns the raw JSON value of [submittedAt].
             *
             * Unlike [submittedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /** Returns a mutable builder for constructing an instance of [ContestHistory]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ContestHistory]. */
            class Builder internal constructor() {

                private var documentCount: JsonField<Long> = JsonMissing.of()
                private var notes: JsonField<String> = JsonMissing.of()
                private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contestHistory: ContestHistory) = apply {
                    documentCount = contestHistory.documentCount
                    notes = contestHistory.notes
                    submittedAt = contestHistory.submittedAt
                    additionalProperties = contestHistory.additionalProperties.toMutableMap()
                }

                fun documentCount(documentCount: Long) = documentCount(JsonField.of(documentCount))

                /**
                 * Sets [Builder.documentCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.documentCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun documentCount(documentCount: JsonField<Long>) = apply {
                    this.documentCount = documentCount
                }

                fun notes(notes: String) = notes(JsonField.of(notes))

                /**
                 * Sets [Builder.notes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.notes] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun notes(notes: JsonField<String>) = apply { this.notes = notes }

                fun submittedAt(submittedAt: OffsetDateTime) =
                    submittedAt(JsonField.of(submittedAt))

                /**
                 * Sets [Builder.submittedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.submittedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [ContestHistory].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ContestHistory =
                    ContestHistory(
                        documentCount,
                        notes,
                        submittedAt,
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
            fun validate(): ContestHistory = apply {
                if (validated) {
                    return@apply
                }

                documentCount()
                notes()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (documentCount.asKnown().isPresent) 1 else 0) +
                    (if (notes.asKnown().isPresent) 1 else 0) +
                    (if (submittedAt.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ContestHistory &&
                    documentCount == other.documentCount &&
                    notes == other.notes &&
                    submittedAt == other.submittedAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(documentCount, notes, submittedAt, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ContestHistory{documentCount=$documentCount, notes=$notes, submittedAt=$submittedAt, additionalProperties=$additionalProperties}"
        }

        /** Snapshot of the DIR the claim is filed against, embedded for convenience. */
        class Dir
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val displayName: JsonField<String>,
            private val enterpriseId: JsonField<String>,
            private val status: JsonField<Status>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("display_name")
                @ExcludeMissing
                displayName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("enterprise_id")
                @ExcludeMissing
                enterpriseId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            ) : this(id, displayName, enterpriseId, status, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun displayName(): Optional<String> = displayName.getOptional("display_name")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun enterpriseId(): Optional<String> = enterpriseId.getOptional("enterprise_id")

            /**
             * DIR lifecycle status.
             * - `draft` — newly created; editable; not yet submitted.
             * - `submitted` / `in_review` — Telnyx is reviewing.
             * - `verified` — approved; phone numbers may be attached.
             * - `rejected` — Telnyx rejected this submission; `rejection_reasons` is populated;
             *   customer can edit and resubmit.
             * - `unsuccessful` — system-side error during processing; customer can edit and
             *   resubmit.
             * - `suspended` — temporarily disabled (e.g. by an active infringement claim).
             * - `expired` — verification expired; customer must resubmit.
             * - `infringement_claimed` — a trademark/impersonation claim is open against this DIR.
             * - `permanently_rejected` — terminal; cannot be resubmitted.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [displayName].
             *
             * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("display_name")
            @ExcludeMissing
            fun _displayName(): JsonField<String> = displayName

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
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

                /** Returns a mutable builder for constructing an instance of [Dir]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Dir]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var displayName: JsonField<String> = JsonMissing.of()
                private var enterpriseId: JsonField<String> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dir: Dir) = apply {
                    id = dir.id
                    displayName = dir.displayName
                    enterpriseId = dir.enterpriseId
                    status = dir.status
                    additionalProperties = dir.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun displayName(displayName: String) = displayName(JsonField.of(displayName))

                /**
                 * Sets [Builder.displayName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.displayName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun displayName(displayName: JsonField<String>) = apply {
                    this.displayName = displayName
                }

                fun enterpriseId(enterpriseId: String) = enterpriseId(JsonField.of(enterpriseId))

                /**
                 * Sets [Builder.enterpriseId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enterpriseId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun enterpriseId(enterpriseId: JsonField<String>) = apply {
                    this.enterpriseId = enterpriseId
                }

                /**
                 * DIR lifecycle status.
                 * - `draft` — newly created; editable; not yet submitted.
                 * - `submitted` / `in_review` — Telnyx is reviewing.
                 * - `verified` — approved; phone numbers may be attached.
                 * - `rejected` — Telnyx rejected this submission; `rejection_reasons` is populated;
                 *   customer can edit and resubmit.
                 * - `unsuccessful` — system-side error during processing; customer can edit and
                 *   resubmit.
                 * - `suspended` — temporarily disabled (e.g. by an active infringement claim).
                 * - `expired` — verification expired; customer must resubmit.
                 * - `infringement_claimed` — a trademark/impersonation claim is open against this
                 *   DIR.
                 * - `permanently_rejected` — terminal; cannot be resubmitted.
                 */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

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
                 * Returns an immutable instance of [Dir].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Dir =
                    Dir(id, displayName, enterpriseId, status, additionalProperties.toMutableMap())
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
            fun validate(): Dir = apply {
                if (validated) {
                    return@apply
                }

                id()
                displayName()
                enterpriseId()
                status().ifPresent { it.validate() }
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
                    (if (displayName.asKnown().isPresent) 1 else 0) +
                    (if (enterpriseId.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * DIR lifecycle status.
             * - `draft` — newly created; editable; not yet submitted.
             * - `submitted` / `in_review` — Telnyx is reviewing.
             * - `verified` — approved; phone numbers may be attached.
             * - `rejected` — Telnyx rejected this submission; `rejection_reasons` is populated;
             *   customer can edit and resubmit.
             * - `unsuccessful` — system-side error during processing; customer can edit and
             *   resubmit.
             * - `suspended` — temporarily disabled (e.g. by an active infringement claim).
             * - `expired` — verification expired; customer must resubmit.
             * - `infringement_claimed` — a trademark/impersonation claim is open against this DIR.
             * - `permanently_rejected` — terminal; cannot be resubmitted.
             */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DRAFT = of("draft")

                    @JvmField val SUBMITTED = of("submitted")

                    @JvmField val IN_REVIEW = of("in_review")

                    @JvmField val VERIFIED = of("verified")

                    @JvmField val REJECTED = of("rejected")

                    @JvmField val UNSUCCESSFUL = of("unsuccessful")

                    @JvmField val SUSPENDED = of("suspended")

                    @JvmField val EXPIRED = of("expired")

                    @JvmField val INFRINGEMENT_CLAIMED = of("infringement_claimed")

                    @JvmField val PERMANENTLY_REJECTED = of("permanently_rejected")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    DRAFT,
                    SUBMITTED,
                    IN_REVIEW,
                    VERIFIED,
                    REJECTED,
                    UNSUCCESSFUL,
                    SUSPENDED,
                    EXPIRED,
                    INFRINGEMENT_CLAIMED,
                    PERMANENTLY_REJECTED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DRAFT,
                    SUBMITTED,
                    IN_REVIEW,
                    VERIFIED,
                    REJECTED,
                    UNSUCCESSFUL,
                    SUSPENDED,
                    EXPIRED,
                    INFRINGEMENT_CLAIMED,
                    PERMANENTLY_REJECTED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DRAFT -> Value.DRAFT
                        SUBMITTED -> Value.SUBMITTED
                        IN_REVIEW -> Value.IN_REVIEW
                        VERIFIED -> Value.VERIFIED
                        REJECTED -> Value.REJECTED
                        UNSUCCESSFUL -> Value.UNSUCCESSFUL
                        SUSPENDED -> Value.SUSPENDED
                        EXPIRED -> Value.EXPIRED
                        INFRINGEMENT_CLAIMED -> Value.INFRINGEMENT_CLAIMED
                        PERMANENTLY_REJECTED -> Value.PERMANENTLY_REJECTED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DRAFT -> Known.DRAFT
                        SUBMITTED -> Known.SUBMITTED
                        IN_REVIEW -> Known.IN_REVIEW
                        VERIFIED -> Known.VERIFIED
                        REJECTED -> Known.REJECTED
                        UNSUCCESSFUL -> Known.UNSUCCESSFUL
                        SUSPENDED -> Known.SUSPENDED
                        EXPIRED -> Known.EXPIRED
                        INFRINGEMENT_CLAIMED -> Known.INFRINGEMENT_CLAIMED
                        PERMANENTLY_REJECTED -> Known.PERMANENTLY_REJECTED
                        else -> throw TelnyxInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
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

                return other is Dir &&
                    id == other.id &&
                    displayName == other.displayName &&
                    enterpriseId == other.enterpriseId &&
                    status == other.status &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, displayName, enterpriseId, status, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Dir{id=$id, displayName=$displayName, enterpriseId=$enterpriseId, status=$status, additionalProperties=$additionalProperties}"
        }

        /** Set only when `status` is `resolved`. */
        class Resolution @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val UPHELD = of("upheld")

                @JvmField val REJECTED = of("rejected")

                @JvmField val MODIFIED = of("modified")

                @JvmStatic fun of(value: String) = Resolution(JsonField.of(value))
            }

            /** An enum containing [Resolution]'s known values. */
            enum class Known {
                UPHELD,
                REJECTED,
                MODIFIED,
            }

            /**
             * An enum containing [Resolution]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Resolution] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                UPHELD,
                REJECTED,
                MODIFIED,
                /**
                 * An enum member indicating that [Resolution] was instantiated with an unknown
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
                    UPHELD -> Value.UPHELD
                    REJECTED -> Value.REJECTED
                    MODIFIED -> Value.MODIFIED
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
                    UPHELD -> Known.UPHELD
                    REJECTED -> Known.REJECTED
                    MODIFIED -> Known.MODIFIED
                    else -> throw TelnyxInvalidDataException("Unknown Resolution: $value")
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
            fun validate(): Resolution = apply {
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

                return other is Resolution && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Lifecycle status. `pending` — newly filed; the DIR is auto-suspended. `contested` — you
         * have submitted contest evidence; awaiting Telnyx review. `resolved` — final.
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

                @JvmField val PENDING = of("pending")

                @JvmField val CONTESTED = of("contested")

                @JvmField val RESOLVED = of("resolved")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                CONTESTED,
                RESOLVED,
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
                CONTESTED,
                RESOLVED,
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
                    CONTESTED -> Value.CONTESTED
                    RESOLVED -> Value.RESOLVED
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
                    CONTESTED -> Known.CONTESTED
                    RESOLVED -> Known.RESOLVED
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
                claimDate == other.claimDate &&
                claimDescription == other.claimDescription &&
                claimType == other.claimType &&
                claimantContact == other.claimantContact &&
                claimantName == other.claimantName &&
                contestDocuments == other.contestDocuments &&
                contestHistory == other.contestHistory &&
                createdAt == other.createdAt &&
                dir == other.dir &&
                dirId == other.dirId &&
                enterpriseId == other.enterpriseId &&
                resolution == other.resolution &&
                resolutionDate == other.resolutionDate &&
                resolutionNotes == other.resolutionNotes &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                claimDate,
                claimDescription,
                claimType,
                claimantContact,
                claimantName,
                contestDocuments,
                contestHistory,
                createdAt,
                dir,
                dirId,
                enterpriseId,
                resolution,
                resolutionDate,
                resolutionNotes,
                status,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, claimDate=$claimDate, claimDescription=$claimDescription, claimType=$claimType, claimantContact=$claimantContact, claimantName=$claimantName, contestDocuments=$contestDocuments, contestHistory=$contestHistory, createdAt=$createdAt, dir=$dir, dirId=$dirId, enterpriseId=$enterpriseId, resolution=$resolution, resolutionDate=$resolutionDate, resolutionNotes=$resolutionNotes, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InfringementClaimContestResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InfringementClaimContestResponse{data=$data, additionalProperties=$additionalProperties}"
}
