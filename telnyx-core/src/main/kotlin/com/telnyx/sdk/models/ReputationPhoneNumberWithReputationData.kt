// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ReputationPhoneNumberWithReputationData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val enterpriseId: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val reputationData: JsonField<ReputationData>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("enterprise_id")
        @ExcludeMissing
        enterpriseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reputation_data")
        @ExcludeMissing
        reputationData: JsonField<ReputationData> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, createdAt, enterpriseId, phoneNumber, reputationData, updatedAt, mutableMapOf())

    /**
     * Unique identifier
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * When the number was associated
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * ID of the associated enterprise
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enterpriseId(): Optional<String> = enterpriseId.getOptional("enterprise_id")

    /**
     * Phone number in E.164 format
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * Reputation metrics
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reputationData(): Optional<ReputationData> = reputationData.getOptional("reputation_data")

    /**
     * When the record was last updated
     *
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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [enterpriseId].
     *
     * Unlike [enterpriseId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enterprise_id")
    @ExcludeMissing
    fun _enterpriseId(): JsonField<String> = enterpriseId

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [reputationData].
     *
     * Unlike [reputationData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reputation_data")
    @ExcludeMissing
    fun _reputationData(): JsonField<ReputationData> = reputationData

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReputationPhoneNumberWithReputationData].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReputationPhoneNumberWithReputationData]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var enterpriseId: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var reputationData: JsonField<ReputationData> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            reputationPhoneNumberWithReputationData: ReputationPhoneNumberWithReputationData
        ) = apply {
            id = reputationPhoneNumberWithReputationData.id
            createdAt = reputationPhoneNumberWithReputationData.createdAt
            enterpriseId = reputationPhoneNumberWithReputationData.enterpriseId
            phoneNumber = reputationPhoneNumberWithReputationData.phoneNumber
            reputationData = reputationPhoneNumberWithReputationData.reputationData
            updatedAt = reputationPhoneNumberWithReputationData.updatedAt
            additionalProperties =
                reputationPhoneNumberWithReputationData.additionalProperties.toMutableMap()
        }

        /** Unique identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** When the number was associated */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** ID of the associated enterprise */
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

        /** Phone number in E.164 format */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** Reputation metrics */
        fun reputationData(reputationData: ReputationData) =
            reputationData(JsonField.of(reputationData))

        /**
         * Sets [Builder.reputationData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reputationData] with a well-typed [ReputationData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reputationData(reputationData: JsonField<ReputationData>) = apply {
            this.reputationData = reputationData
        }

        /** When the record was last updated */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [ReputationPhoneNumberWithReputationData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReputationPhoneNumberWithReputationData =
            ReputationPhoneNumberWithReputationData(
                id,
                createdAt,
                enterpriseId,
                phoneNumber,
                reputationData,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ReputationPhoneNumberWithReputationData = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        enterpriseId()
        phoneNumber()
        reputationData().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (enterpriseId.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (reputationData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReputationPhoneNumberWithReputationData &&
            id == other.id &&
            createdAt == other.createdAt &&
            enterpriseId == other.enterpriseId &&
            phoneNumber == other.phoneNumber &&
            reputationData == other.reputationData &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            enterpriseId,
            phoneNumber,
            reputationData,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReputationPhoneNumberWithReputationData{id=$id, createdAt=$createdAt, enterpriseId=$enterpriseId, phoneNumber=$phoneNumber, reputationData=$reputationData, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
