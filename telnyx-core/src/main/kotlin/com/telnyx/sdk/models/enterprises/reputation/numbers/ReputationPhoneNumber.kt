// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.ReputationData
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ReputationPhoneNumber
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val confirmBy: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val enterpriseId: JsonField<String>,
    private val flagReason: JsonField<String>,
    private val ownershipStatus: JsonField<ReputationOwnershipStatus>,
    private val phoneNumber: JsonField<String>,
    private val removalReason: JsonField<RemovalReason>,
    private val removedAt: JsonField<OffsetDateTime>,
    private val reputationData: JsonField<ReputationData>,
    private val source: JsonField<ReputationNumberSource>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("confirm_by")
        @ExcludeMissing
        confirmBy: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("enterprise_id")
        @ExcludeMissing
        enterpriseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("flag_reason")
        @ExcludeMissing
        flagReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ownership_status")
        @ExcludeMissing
        ownershipStatus: JsonField<ReputationOwnershipStatus> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("removal_reason")
        @ExcludeMissing
        removalReason: JsonField<RemovalReason> = JsonMissing.of(),
        @JsonProperty("removed_at")
        @ExcludeMissing
        removedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("reputation_data")
        @ExcludeMissing
        reputationData: JsonField<ReputationData> = JsonMissing.of(),
        @JsonProperty("source")
        @ExcludeMissing
        source: JsonField<ReputationNumberSource> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        confirmBy,
        createdAt,
        enterpriseId,
        flagReason,
        ownershipStatus,
        phoneNumber,
        removalReason,
        removedAt,
        reputationData,
        source,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Deadline to confirm you still own the number. Set only while `ownership_status` is
     * `pending_confirmation`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun confirmBy(): Optional<OffsetDateTime> = confirmBy.getOptional("confirm_by")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enterpriseId(): Optional<String> = enterpriseId.getOptional("enterprise_id")

    /**
     * Why the number's ownership was flagged. `carrier_changed` when an ownership check found the
     * number with a different carrier.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun flagReason(): Optional<String> = flagReason.getOptional("flag_reason")

    /**
     * Result of ongoing ownership checks. `verified`: the number is with the carrier on record.
     * `pending_confirmation`: the number's carrier changed, or a periodic ownership re-verification
     * is due; confirm you still own it before `confirm_by`. `flagged`: a periodic re-verification
     * went unanswered; the number stays monitored and is not removed, but confirm ownership (`POST
     * .../ownership_confirm`) to return it to `verified`. `removed`: the number is no longer
     * monitored; returned by `POST .../ownership_confirm` with `still_own: false`, and when listing
     * numbers with `filter[ownership_status]=removed`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ownershipStatus(): Optional<ReputationOwnershipStatus> =
        ownershipStatus.getOptional("ownership_status")

    /**
     * E.164 with leading `+`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * Why a number was removed. `ported_away`: you confirmed the number left your control after a
     * carrier change. `unconfirmed_ownership`: a carrier change was not confirmed before the
     * deadline. `reassigned`: the number was reported as permanently disconnected.
     * `customer_reported`: you reported that you no longer own the number. `customer_removed`: you
     * removed the number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun removalReason(): Optional<RemovalReason> = removalReason.getOptional("removal_reason")

    /**
     * When the number was removed. Set only for removed numbers.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun removedAt(): Optional<OffsetDateTime> = removedAt.getOptional("removed_at")

    /**
     * Reputation snapshot for a phone number. Each metric is a 0–100 score; `spam_risk` is a coarse
     * bucket. Field set may grow over time - read by key.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reputationData(): Optional<ReputationData> = reputationData.getOptional("reputation_data")

    /**
     * Where the phone number is hosted. `telnyx`: in your Telnyx inventory. `external`: a number
     * you own that is hosted with another provider.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<ReputationNumberSource> = source.getOptional("source")

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
     * Returns the raw JSON value of [confirmBy].
     *
     * Unlike [confirmBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confirm_by")
    @ExcludeMissing
    fun _confirmBy(): JsonField<OffsetDateTime> = confirmBy

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
     * Returns the raw JSON value of [flagReason].
     *
     * Unlike [flagReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flag_reason") @ExcludeMissing fun _flagReason(): JsonField<String> = flagReason

    /**
     * Returns the raw JSON value of [ownershipStatus].
     *
     * Unlike [ownershipStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ownership_status")
    @ExcludeMissing
    fun _ownershipStatus(): JsonField<ReputationOwnershipStatus> = ownershipStatus

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [removalReason].
     *
     * Unlike [removalReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("removal_reason")
    @ExcludeMissing
    fun _removalReason(): JsonField<RemovalReason> = removalReason

    /**
     * Returns the raw JSON value of [removedAt].
     *
     * Unlike [removedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("removed_at")
    @ExcludeMissing
    fun _removedAt(): JsonField<OffsetDateTime> = removedAt

    /**
     * Returns the raw JSON value of [reputationData].
     *
     * Unlike [reputationData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reputation_data")
    @ExcludeMissing
    fun _reputationData(): JsonField<ReputationData> = reputationData

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source")
    @ExcludeMissing
    fun _source(): JsonField<ReputationNumberSource> = source

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

        /** Returns a mutable builder for constructing an instance of [ReputationPhoneNumber]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReputationPhoneNumber]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var confirmBy: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var enterpriseId: JsonField<String> = JsonMissing.of()
        private var flagReason: JsonField<String> = JsonMissing.of()
        private var ownershipStatus: JsonField<ReputationOwnershipStatus> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var removalReason: JsonField<RemovalReason> = JsonMissing.of()
        private var removedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var reputationData: JsonField<ReputationData> = JsonMissing.of()
        private var source: JsonField<ReputationNumberSource> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reputationPhoneNumber: ReputationPhoneNumber) = apply {
            id = reputationPhoneNumber.id
            confirmBy = reputationPhoneNumber.confirmBy
            createdAt = reputationPhoneNumber.createdAt
            enterpriseId = reputationPhoneNumber.enterpriseId
            flagReason = reputationPhoneNumber.flagReason
            ownershipStatus = reputationPhoneNumber.ownershipStatus
            phoneNumber = reputationPhoneNumber.phoneNumber
            removalReason = reputationPhoneNumber.removalReason
            removedAt = reputationPhoneNumber.removedAt
            reputationData = reputationPhoneNumber.reputationData
            source = reputationPhoneNumber.source
            updatedAt = reputationPhoneNumber.updatedAt
            additionalProperties = reputationPhoneNumber.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Deadline to confirm you still own the number. Set only while `ownership_status` is
         * `pending_confirmation`.
         */
        fun confirmBy(confirmBy: OffsetDateTime?) = confirmBy(JsonField.ofNullable(confirmBy))

        /** Alias for calling [Builder.confirmBy] with `confirmBy.orElse(null)`. */
        fun confirmBy(confirmBy: Optional<OffsetDateTime>) = confirmBy(confirmBy.getOrNull())

        /**
         * Sets [Builder.confirmBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confirmBy] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun confirmBy(confirmBy: JsonField<OffsetDateTime>) = apply { this.confirmBy = confirmBy }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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

        /**
         * Why the number's ownership was flagged. `carrier_changed` when an ownership check found
         * the number with a different carrier.
         */
        fun flagReason(flagReason: String?) = flagReason(JsonField.ofNullable(flagReason))

        /** Alias for calling [Builder.flagReason] with `flagReason.orElse(null)`. */
        fun flagReason(flagReason: Optional<String>) = flagReason(flagReason.getOrNull())

        /**
         * Sets [Builder.flagReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flagReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun flagReason(flagReason: JsonField<String>) = apply { this.flagReason = flagReason }

        /**
         * Result of ongoing ownership checks. `verified`: the number is with the carrier on record.
         * `pending_confirmation`: the number's carrier changed, or a periodic ownership
         * re-verification is due; confirm you still own it before `confirm_by`. `flagged`: a
         * periodic re-verification went unanswered; the number stays monitored and is not removed,
         * but confirm ownership (`POST .../ownership_confirm`) to return it to `verified`.
         * `removed`: the number is no longer monitored; returned by `POST .../ownership_confirm`
         * with `still_own: false`, and when listing numbers with
         * `filter[ownership_status]=removed`.
         */
        fun ownershipStatus(ownershipStatus: ReputationOwnershipStatus) =
            ownershipStatus(JsonField.of(ownershipStatus))

        /**
         * Sets [Builder.ownershipStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ownershipStatus] with a well-typed
         * [ReputationOwnershipStatus] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun ownershipStatus(ownershipStatus: JsonField<ReputationOwnershipStatus>) = apply {
            this.ownershipStatus = ownershipStatus
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

        /**
         * Why a number was removed. `ported_away`: you confirmed the number left your control after
         * a carrier change. `unconfirmed_ownership`: a carrier change was not confirmed before the
         * deadline. `reassigned`: the number was reported as permanently disconnected.
         * `customer_reported`: you reported that you no longer own the number. `customer_removed`:
         * you removed the number.
         */
        fun removalReason(removalReason: RemovalReason?) =
            removalReason(JsonField.ofNullable(removalReason))

        /** Alias for calling [Builder.removalReason] with `removalReason.orElse(null)`. */
        fun removalReason(removalReason: Optional<RemovalReason>) =
            removalReason(removalReason.getOrNull())

        /**
         * Sets [Builder.removalReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.removalReason] with a well-typed [RemovalReason] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun removalReason(removalReason: JsonField<RemovalReason>) = apply {
            this.removalReason = removalReason
        }

        /** When the number was removed. Set only for removed numbers. */
        fun removedAt(removedAt: OffsetDateTime?) = removedAt(JsonField.ofNullable(removedAt))

        /** Alias for calling [Builder.removedAt] with `removedAt.orElse(null)`. */
        fun removedAt(removedAt: Optional<OffsetDateTime>) = removedAt(removedAt.getOrNull())

        /**
         * Sets [Builder.removedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.removedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun removedAt(removedAt: JsonField<OffsetDateTime>) = apply { this.removedAt = removedAt }

        /**
         * Reputation snapshot for a phone number. Each metric is a 0–100 score; `spam_risk` is a
         * coarse bucket. Field set may grow over time - read by key.
         */
        fun reputationData(reputationData: ReputationData?) =
            reputationData(JsonField.ofNullable(reputationData))

        /** Alias for calling [Builder.reputationData] with `reputationData.orElse(null)`. */
        fun reputationData(reputationData: Optional<ReputationData>) =
            reputationData(reputationData.getOrNull())

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

        /**
         * Where the phone number is hosted. `telnyx`: in your Telnyx inventory. `external`: a
         * number you own that is hosted with another provider.
         */
        fun source(source: ReputationNumberSource) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [ReputationNumberSource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun source(source: JsonField<ReputationNumberSource>) = apply { this.source = source }

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
         * Returns an immutable instance of [ReputationPhoneNumber].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReputationPhoneNumber =
            ReputationPhoneNumber(
                id,
                confirmBy,
                createdAt,
                enterpriseId,
                flagReason,
                ownershipStatus,
                phoneNumber,
                removalReason,
                removedAt,
                reputationData,
                source,
                updatedAt,
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
    fun validate(): ReputationPhoneNumber = apply {
        if (validated) {
            return@apply
        }

        id()
        confirmBy()
        createdAt()
        enterpriseId()
        flagReason()
        ownershipStatus().ifPresent { it.validate() }
        phoneNumber()
        removalReason().ifPresent { it.validate() }
        removedAt()
        reputationData().ifPresent { it.validate() }
        source().ifPresent { it.validate() }
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
            (if (confirmBy.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (enterpriseId.asKnown().isPresent) 1 else 0) +
            (if (flagReason.asKnown().isPresent) 1 else 0) +
            (ownershipStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (removalReason.asKnown().getOrNull()?.validity() ?: 0) +
            (if (removedAt.asKnown().isPresent) 1 else 0) +
            (reputationData.asKnown().getOrNull()?.validity() ?: 0) +
            (source.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /**
     * Why a number was removed. `ported_away`: you confirmed the number left your control after a
     * carrier change. `unconfirmed_ownership`: a carrier change was not confirmed before the
     * deadline. `reassigned`: the number was reported as permanently disconnected.
     * `customer_reported`: you reported that you no longer own the number. `customer_removed`: you
     * removed the number.
     */
    class RemovalReason @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val PORTED_AWAY = of("ported_away")

            @JvmField val UNCONFIRMED_OWNERSHIP = of("unconfirmed_ownership")

            @JvmField val REASSIGNED = of("reassigned")

            @JvmField val CUSTOMER_REPORTED = of("customer_reported")

            @JvmField val CUSTOMER_REMOVED = of("customer_removed")

            @JvmStatic fun of(value: String) = RemovalReason(JsonField.of(value))
        }

        /** An enum containing [RemovalReason]'s known values. */
        enum class Known {
            PORTED_AWAY,
            UNCONFIRMED_OWNERSHIP,
            REASSIGNED,
            CUSTOMER_REPORTED,
            CUSTOMER_REMOVED,
        }

        /**
         * An enum containing [RemovalReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RemovalReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PORTED_AWAY,
            UNCONFIRMED_OWNERSHIP,
            REASSIGNED,
            CUSTOMER_REPORTED,
            CUSTOMER_REMOVED,
            /**
             * An enum member indicating that [RemovalReason] was instantiated with an unknown
             * value.
             */
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
                PORTED_AWAY -> Value.PORTED_AWAY
                UNCONFIRMED_OWNERSHIP -> Value.UNCONFIRMED_OWNERSHIP
                REASSIGNED -> Value.REASSIGNED
                CUSTOMER_REPORTED -> Value.CUSTOMER_REPORTED
                CUSTOMER_REMOVED -> Value.CUSTOMER_REMOVED
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
                PORTED_AWAY -> Known.PORTED_AWAY
                UNCONFIRMED_OWNERSHIP -> Known.UNCONFIRMED_OWNERSHIP
                REASSIGNED -> Known.REASSIGNED
                CUSTOMER_REPORTED -> Known.CUSTOMER_REPORTED
                CUSTOMER_REMOVED -> Known.CUSTOMER_REMOVED
                else -> throw TelnyxInvalidDataException("Unknown RemovalReason: $value")
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
        fun validate(): RemovalReason = apply {
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

            return other is RemovalReason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReputationPhoneNumber &&
            id == other.id &&
            confirmBy == other.confirmBy &&
            createdAt == other.createdAt &&
            enterpriseId == other.enterpriseId &&
            flagReason == other.flagReason &&
            ownershipStatus == other.ownershipStatus &&
            phoneNumber == other.phoneNumber &&
            removalReason == other.removalReason &&
            removedAt == other.removedAt &&
            reputationData == other.reputationData &&
            source == other.source &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            confirmBy,
            createdAt,
            enterpriseId,
            flagReason,
            ownershipStatus,
            phoneNumber,
            removalReason,
            removedAt,
            reputationData,
            source,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReputationPhoneNumber{id=$id, confirmBy=$confirmBy, createdAt=$createdAt, enterpriseId=$enterpriseId, flagReason=$flagReason, ownershipStatus=$ownershipStatus, phoneNumber=$phoneNumber, removalReason=$removalReason, removedAt=$removedAt, reputationData=$reputationData, source=$source, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
