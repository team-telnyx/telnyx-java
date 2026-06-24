// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Slim list-endpoint shape. Omits per-number results and webhook URLs to keep responses small. */
class RemediationListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val callPurpose: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val phoneNumbersCount: JsonField<Long>,
    private val status: JsonField<RemediationStatus>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val tier1CompletedAt: JsonField<OffsetDateTime>,
    private val tier2CompletedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_purpose")
        @ExcludeMissing
        callPurpose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("phone_numbers_count")
        @ExcludeMissing
        phoneNumbersCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<RemediationStatus> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("tier1_completed_at")
        @ExcludeMissing
        tier1CompletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("tier2_completed_at")
        @ExcludeMissing
        tier2CompletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        callPurpose,
        createdAt,
        phoneNumbersCount,
        status,
        updatedAt,
        tier1CompletedAt,
        tier2CompletedAt,
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
    fun callPurpose(): String = callPurpose.getRequired("call_purpose")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumbersCount(): Long = phoneNumbersCount.getRequired("phone_numbers_count")

    /**
     * Customer-facing status of a remediation request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): RemediationStatus = status.getRequired("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tier1CompletedAt(): Optional<OffsetDateTime> =
        tier1CompletedAt.getOptional("tier1_completed_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tier2CompletedAt(): Optional<OffsetDateTime> =
        tier2CompletedAt.getOptional("tier2_completed_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [callPurpose].
     *
     * Unlike [callPurpose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_purpose")
    @ExcludeMissing
    fun _callPurpose(): JsonField<String> = callPurpose

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [phoneNumbersCount].
     *
     * Unlike [phoneNumbersCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("phone_numbers_count")
    @ExcludeMissing
    fun _phoneNumbersCount(): JsonField<Long> = phoneNumbersCount

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<RemediationStatus> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [tier1CompletedAt].
     *
     * Unlike [tier1CompletedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tier1_completed_at")
    @ExcludeMissing
    fun _tier1CompletedAt(): JsonField<OffsetDateTime> = tier1CompletedAt

    /**
     * Returns the raw JSON value of [tier2CompletedAt].
     *
     * Unlike [tier2CompletedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tier2_completed_at")
    @ExcludeMissing
    fun _tier2CompletedAt(): JsonField<OffsetDateTime> = tier2CompletedAt

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
         * Returns a mutable builder for constructing an instance of [RemediationListResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .callPurpose()
         * .createdAt()
         * .phoneNumbersCount()
         * .status()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RemediationListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var callPurpose: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var phoneNumbersCount: JsonField<Long>? = null
        private var status: JsonField<RemediationStatus>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var tier1CompletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var tier2CompletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(remediationListResponse: RemediationListResponse) = apply {
            id = remediationListResponse.id
            callPurpose = remediationListResponse.callPurpose
            createdAt = remediationListResponse.createdAt
            phoneNumbersCount = remediationListResponse.phoneNumbersCount
            status = remediationListResponse.status
            updatedAt = remediationListResponse.updatedAt
            tier1CompletedAt = remediationListResponse.tier1CompletedAt
            tier2CompletedAt = remediationListResponse.tier2CompletedAt
            additionalProperties = remediationListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun callPurpose(callPurpose: String) = callPurpose(JsonField.of(callPurpose))

        /**
         * Sets [Builder.callPurpose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callPurpose] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callPurpose(callPurpose: JsonField<String>) = apply { this.callPurpose = callPurpose }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun phoneNumbersCount(phoneNumbersCount: Long) =
            phoneNumbersCount(JsonField.of(phoneNumbersCount))

        /**
         * Sets [Builder.phoneNumbersCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbersCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phoneNumbersCount(phoneNumbersCount: JsonField<Long>) = apply {
            this.phoneNumbersCount = phoneNumbersCount
        }

        /** Customer-facing status of a remediation request. */
        fun status(status: RemediationStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [RemediationStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<RemediationStatus>) = apply { this.status = status }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun tier1CompletedAt(tier1CompletedAt: OffsetDateTime?) =
            tier1CompletedAt(JsonField.ofNullable(tier1CompletedAt))

        /** Alias for calling [Builder.tier1CompletedAt] with `tier1CompletedAt.orElse(null)`. */
        fun tier1CompletedAt(tier1CompletedAt: Optional<OffsetDateTime>) =
            tier1CompletedAt(tier1CompletedAt.getOrNull())

        /**
         * Sets [Builder.tier1CompletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tier1CompletedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun tier1CompletedAt(tier1CompletedAt: JsonField<OffsetDateTime>) = apply {
            this.tier1CompletedAt = tier1CompletedAt
        }

        fun tier2CompletedAt(tier2CompletedAt: OffsetDateTime?) =
            tier2CompletedAt(JsonField.ofNullable(tier2CompletedAt))

        /** Alias for calling [Builder.tier2CompletedAt] with `tier2CompletedAt.orElse(null)`. */
        fun tier2CompletedAt(tier2CompletedAt: Optional<OffsetDateTime>) =
            tier2CompletedAt(tier2CompletedAt.getOrNull())

        /**
         * Sets [Builder.tier2CompletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tier2CompletedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun tier2CompletedAt(tier2CompletedAt: JsonField<OffsetDateTime>) = apply {
            this.tier2CompletedAt = tier2CompletedAt
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
         * Returns an immutable instance of [RemediationListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .callPurpose()
         * .createdAt()
         * .phoneNumbersCount()
         * .status()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RemediationListResponse =
            RemediationListResponse(
                checkRequired("id", id),
                checkRequired("callPurpose", callPurpose),
                checkRequired("createdAt", createdAt),
                checkRequired("phoneNumbersCount", phoneNumbersCount),
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
                tier1CompletedAt,
                tier2CompletedAt,
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
    fun validate(): RemediationListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        callPurpose()
        createdAt()
        phoneNumbersCount()
        status().validate()
        updatedAt()
        tier1CompletedAt()
        tier2CompletedAt()
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
            (if (callPurpose.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (phoneNumbersCount.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (tier1CompletedAt.asKnown().isPresent) 1 else 0) +
            (if (tier2CompletedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RemediationListResponse &&
            id == other.id &&
            callPurpose == other.callPurpose &&
            createdAt == other.createdAt &&
            phoneNumbersCount == other.phoneNumbersCount &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            tier1CompletedAt == other.tier1CompletedAt &&
            tier2CompletedAt == other.tier2CompletedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            callPurpose,
            createdAt,
            phoneNumbersCount,
            status,
            updatedAt,
            tier1CompletedAt,
            tier2CompletedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RemediationListResponse{id=$id, callPurpose=$callPurpose, createdAt=$createdAt, phoneNumbersCount=$phoneNumbersCount, status=$status, updatedAt=$updatedAt, tier1CompletedAt=$tier1CompletedAt, tier2CompletedAt=$tier2CompletedAt, additionalProperties=$additionalProperties}"
}
