// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.businessaccounts.phonenumbers

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PhoneNumberListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val callingEnabled: JsonField<Boolean>,
    private val coexistenceState: JsonField<CoexistenceState>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val displayName: JsonField<String>,
    private val enabled: JsonField<Boolean>,
    private val isOnBizApp: JsonField<Boolean>,
    private val phoneNumber: JsonField<String>,
    private val phoneNumberId: JsonField<String>,
    private val qualityRating: JsonField<String>,
    private val recordType: JsonField<String>,
    private val status: JsonField<String>,
    private val syncDeadline: JsonField<OffsetDateTime>,
    private val syncProgress: JsonField<SyncProgress>,
    private val userId: JsonField<String>,
    private val wabaId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("calling_enabled")
        @ExcludeMissing
        callingEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("coexistence_state")
        @ExcludeMissing
        coexistenceState: JsonField<CoexistenceState> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_on_biz_app")
        @ExcludeMissing
        isOnBizApp: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number_id")
        @ExcludeMissing
        phoneNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quality_rating")
        @ExcludeMissing
        qualityRating: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sync_deadline")
        @ExcludeMissing
        syncDeadline: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sync_progress")
        @ExcludeMissing
        syncProgress: JsonField<SyncProgress> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("waba_id") @ExcludeMissing wabaId: JsonField<String> = JsonMissing.of(),
    ) : this(
        callingEnabled,
        coexistenceState,
        createdAt,
        displayName,
        enabled,
        isOnBizApp,
        phoneNumber,
        phoneNumberId,
        qualityRating,
        recordType,
        status,
        syncDeadline,
        syncProgress,
        userId,
        wabaId,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callingEnabled(): Optional<Boolean> = callingEnabled.getOptional("calling_enabled")

    /**
     * Current lifecycle state for a coexistence number. This is null for a standard Cloud API
     * number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun coexistenceState(): Optional<CoexistenceState> =
        coexistenceState.getOptional("coexistence_state")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = displayName.getOptional("display_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

    /**
     * Indicates whether the number is connected to both the WhatsApp Business app and Cloud API
     * through WhatsApp Coexistence.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isOnBizApp(): Optional<Boolean> = isOnBizApp.getOptional("is_on_biz_app")

    /**
     * Phone number in E164 format
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * Whatsapp phone number ID
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberId(): Optional<String> = phoneNumberId.getOptional("phone_number_id")

    /**
     * Whatsapp quality rating
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun qualityRating(): Optional<String> = qualityRating.getOptional("quality_rating")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Deadline for initiating the current coexistence synchronization cycle. This is null when no
     * deadline applies.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun syncDeadline(): Optional<OffsetDateTime> = syncDeadline.getOptional("sync_deadline")

    /**
     * Synchronization progress. This object is returned only while a coexistence number is
     * synchronizing.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun syncProgress(): Optional<SyncProgress> = syncProgress.getOptional("sync_progress")

    /**
     * User ID
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * WABA ID of Whatsapp business account
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun wabaId(): Optional<String> = wabaId.getOptional("waba_id")

    /**
     * Returns the raw JSON value of [callingEnabled].
     *
     * Unlike [callingEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("calling_enabled")
    @ExcludeMissing
    fun _callingEnabled(): JsonField<Boolean> = callingEnabled

    /**
     * Returns the raw JSON value of [coexistenceState].
     *
     * Unlike [coexistenceState], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("coexistence_state")
    @ExcludeMissing
    fun _coexistenceState(): JsonField<CoexistenceState> = coexistenceState

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [isOnBizApp].
     *
     * Unlike [isOnBizApp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_on_biz_app")
    @ExcludeMissing
    fun _isOnBizApp(): JsonField<Boolean> = isOnBizApp

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [phoneNumberId].
     *
     * Unlike [phoneNumberId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number_id")
    @ExcludeMissing
    fun _phoneNumberId(): JsonField<String> = phoneNumberId

    /**
     * Returns the raw JSON value of [qualityRating].
     *
     * Unlike [qualityRating], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quality_rating")
    @ExcludeMissing
    fun _qualityRating(): JsonField<String> = qualityRating

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [syncDeadline].
     *
     * Unlike [syncDeadline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sync_deadline")
    @ExcludeMissing
    fun _syncDeadline(): JsonField<OffsetDateTime> = syncDeadline

    /**
     * Returns the raw JSON value of [syncProgress].
     *
     * Unlike [syncProgress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sync_progress")
    @ExcludeMissing
    fun _syncProgress(): JsonField<SyncProgress> = syncProgress

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [wabaId].
     *
     * Unlike [wabaId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("waba_id") @ExcludeMissing fun _wabaId(): JsonField<String> = wabaId

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

        /** Returns a mutable builder for constructing an instance of [PhoneNumberListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberListResponse]. */
    class Builder internal constructor() {

        private var callingEnabled: JsonField<Boolean> = JsonMissing.of()
        private var coexistenceState: JsonField<CoexistenceState> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var displayName: JsonField<String> = JsonMissing.of()
        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var isOnBizApp: JsonField<Boolean> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var phoneNumberId: JsonField<String> = JsonMissing.of()
        private var qualityRating: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var syncDeadline: JsonField<OffsetDateTime> = JsonMissing.of()
        private var syncProgress: JsonField<SyncProgress> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var wabaId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(phoneNumberListResponse: PhoneNumberListResponse) = apply {
            callingEnabled = phoneNumberListResponse.callingEnabled
            coexistenceState = phoneNumberListResponse.coexistenceState
            createdAt = phoneNumberListResponse.createdAt
            displayName = phoneNumberListResponse.displayName
            enabled = phoneNumberListResponse.enabled
            isOnBizApp = phoneNumberListResponse.isOnBizApp
            phoneNumber = phoneNumberListResponse.phoneNumber
            phoneNumberId = phoneNumberListResponse.phoneNumberId
            qualityRating = phoneNumberListResponse.qualityRating
            recordType = phoneNumberListResponse.recordType
            status = phoneNumberListResponse.status
            syncDeadline = phoneNumberListResponse.syncDeadline
            syncProgress = phoneNumberListResponse.syncProgress
            userId = phoneNumberListResponse.userId
            wabaId = phoneNumberListResponse.wabaId
            additionalProperties = phoneNumberListResponse.additionalProperties.toMutableMap()
        }

        fun callingEnabled(callingEnabled: Boolean) = callingEnabled(JsonField.of(callingEnabled))

        /**
         * Sets [Builder.callingEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callingEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callingEnabled(callingEnabled: JsonField<Boolean>) = apply {
            this.callingEnabled = callingEnabled
        }

        /**
         * Current lifecycle state for a coexistence number. This is null for a standard Cloud API
         * number.
         */
        fun coexistenceState(coexistenceState: CoexistenceState?) =
            coexistenceState(JsonField.ofNullable(coexistenceState))

        /** Alias for calling [Builder.coexistenceState] with `coexistenceState.orElse(null)`. */
        fun coexistenceState(coexistenceState: Optional<CoexistenceState>) =
            coexistenceState(coexistenceState.getOrNull())

        /**
         * Sets [Builder.coexistenceState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coexistenceState] with a well-typed [CoexistenceState]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun coexistenceState(coexistenceState: JsonField<CoexistenceState>) = apply {
            this.coexistenceState = coexistenceState
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /**
         * Indicates whether the number is connected to both the WhatsApp Business app and Cloud API
         * through WhatsApp Coexistence.
         */
        fun isOnBizApp(isOnBizApp: Boolean) = isOnBizApp(JsonField.of(isOnBizApp))

        /**
         * Sets [Builder.isOnBizApp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isOnBizApp] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isOnBizApp(isOnBizApp: JsonField<Boolean>) = apply { this.isOnBizApp = isOnBizApp }

        /** Phone number in E164 format */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** Whatsapp phone number ID */
        fun phoneNumberId(phoneNumberId: String) = phoneNumberId(JsonField.of(phoneNumberId))

        /**
         * Sets [Builder.phoneNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumberId(phoneNumberId: JsonField<String>) = apply {
            this.phoneNumberId = phoneNumberId
        }

        /** Whatsapp quality rating */
        fun qualityRating(qualityRating: String) = qualityRating(JsonField.of(qualityRating))

        /**
         * Sets [Builder.qualityRating] to an arbitrary JSON value.
         *
         * You should usually call [Builder.qualityRating] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun qualityRating(qualityRating: JsonField<String>) = apply {
            this.qualityRating = qualityRating
        }

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /**
         * Deadline for initiating the current coexistence synchronization cycle. This is null when
         * no deadline applies.
         */
        fun syncDeadline(syncDeadline: OffsetDateTime?) =
            syncDeadline(JsonField.ofNullable(syncDeadline))

        /** Alias for calling [Builder.syncDeadline] with `syncDeadline.orElse(null)`. */
        fun syncDeadline(syncDeadline: Optional<OffsetDateTime>) =
            syncDeadline(syncDeadline.getOrNull())

        /**
         * Sets [Builder.syncDeadline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.syncDeadline] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun syncDeadline(syncDeadline: JsonField<OffsetDateTime>) = apply {
            this.syncDeadline = syncDeadline
        }

        /**
         * Synchronization progress. This object is returned only while a coexistence number is
         * synchronizing.
         */
        fun syncProgress(syncProgress: SyncProgress?) =
            syncProgress(JsonField.ofNullable(syncProgress))

        /** Alias for calling [Builder.syncProgress] with `syncProgress.orElse(null)`. */
        fun syncProgress(syncProgress: Optional<SyncProgress>) =
            syncProgress(syncProgress.getOrNull())

        /**
         * Sets [Builder.syncProgress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.syncProgress] with a well-typed [SyncProgress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun syncProgress(syncProgress: JsonField<SyncProgress>) = apply {
            this.syncProgress = syncProgress
        }

        /** User ID */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** WABA ID of Whatsapp business account */
        fun wabaId(wabaId: String) = wabaId(JsonField.of(wabaId))

        /**
         * Sets [Builder.wabaId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wabaId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun wabaId(wabaId: JsonField<String>) = apply { this.wabaId = wabaId }

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
         * Returns an immutable instance of [PhoneNumberListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberListResponse =
            PhoneNumberListResponse(
                callingEnabled,
                coexistenceState,
                createdAt,
                displayName,
                enabled,
                isOnBizApp,
                phoneNumber,
                phoneNumberId,
                qualityRating,
                recordType,
                status,
                syncDeadline,
                syncProgress,
                userId,
                wabaId,
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
    fun validate(): PhoneNumberListResponse = apply {
        if (validated) {
            return@apply
        }

        callingEnabled()
        coexistenceState().ifPresent { it.validate() }
        createdAt()
        displayName()
        enabled()
        isOnBizApp()
        phoneNumber()
        phoneNumberId()
        qualityRating()
        recordType()
        status()
        syncDeadline()
        syncProgress().ifPresent { it.validate() }
        userId()
        wabaId()
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
        (if (callingEnabled.asKnown().isPresent) 1 else 0) +
            (coexistenceState.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (if (isOnBizApp.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (if (phoneNumberId.asKnown().isPresent) 1 else 0) +
            (if (qualityRating.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (syncDeadline.asKnown().isPresent) 1 else 0) +
            (syncProgress.asKnown().getOrNull()?.validity() ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (wabaId.asKnown().isPresent) 1 else 0)

    /**
     * Current lifecycle state for a coexistence number. This is null for a standard Cloud API
     * number.
     */
    class CoexistenceState @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val PENDING_ONBOARDING = of("pending_onboarding")

            @JvmField val SYNC_PENDING = of("sync_pending")

            @JvmField val SYNCING = of("syncing")

            @JvmField val SYNC_COMPLETE = of("sync_complete")

            @JvmField val ACTIVE = of("active")

            @JvmField val HISTORY_DECLINED = of("history_declined")

            @JvmField val SYNC_DEADLINE_EXPIRED = of("sync_deadline_expired")

            @JvmField val OFFBOARDED = of("offboarded")

            @JvmField val DISCONNECTED = of("disconnected")

            @JvmStatic fun of(value: String) = CoexistenceState(JsonField.of(value))
        }

        /** An enum containing [CoexistenceState]'s known values. */
        enum class Known {
            PENDING_ONBOARDING,
            SYNC_PENDING,
            SYNCING,
            SYNC_COMPLETE,
            ACTIVE,
            HISTORY_DECLINED,
            SYNC_DEADLINE_EXPIRED,
            OFFBOARDED,
            DISCONNECTED,
        }

        /**
         * An enum containing [CoexistenceState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CoexistenceState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING_ONBOARDING,
            SYNC_PENDING,
            SYNCING,
            SYNC_COMPLETE,
            ACTIVE,
            HISTORY_DECLINED,
            SYNC_DEADLINE_EXPIRED,
            OFFBOARDED,
            DISCONNECTED,
            /**
             * An enum member indicating that [CoexistenceState] was instantiated with an unknown
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
                PENDING_ONBOARDING -> Value.PENDING_ONBOARDING
                SYNC_PENDING -> Value.SYNC_PENDING
                SYNCING -> Value.SYNCING
                SYNC_COMPLETE -> Value.SYNC_COMPLETE
                ACTIVE -> Value.ACTIVE
                HISTORY_DECLINED -> Value.HISTORY_DECLINED
                SYNC_DEADLINE_EXPIRED -> Value.SYNC_DEADLINE_EXPIRED
                OFFBOARDED -> Value.OFFBOARDED
                DISCONNECTED -> Value.DISCONNECTED
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
                PENDING_ONBOARDING -> Known.PENDING_ONBOARDING
                SYNC_PENDING -> Known.SYNC_PENDING
                SYNCING -> Known.SYNCING
                SYNC_COMPLETE -> Known.SYNC_COMPLETE
                ACTIVE -> Known.ACTIVE
                HISTORY_DECLINED -> Known.HISTORY_DECLINED
                SYNC_DEADLINE_EXPIRED -> Known.SYNC_DEADLINE_EXPIRED
                OFFBOARDED -> Known.OFFBOARDED
                DISCONNECTED -> Known.DISCONNECTED
                else -> throw TelnyxInvalidDataException("Unknown CoexistenceState: $value")
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
        fun validate(): CoexistenceState = apply {
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

            return other is CoexistenceState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Synchronization progress. This object is returned only while a coexistence number is
     * synchronizing.
     */
    class SyncProgress
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contactsStatus: JsonField<String>,
        private val historyChunkOrder: JsonField<Long>,
        private val historyPhase: JsonField<Long>,
        private val historyProgress: JsonField<Long>,
        private val historyStatus: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contacts_status")
            @ExcludeMissing
            contactsStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("history_chunk_order")
            @ExcludeMissing
            historyChunkOrder: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("history_phase")
            @ExcludeMissing
            historyPhase: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("history_progress")
            @ExcludeMissing
            historyProgress: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("history_status")
            @ExcludeMissing
            historyStatus: JsonField<String> = JsonMissing.of(),
        ) : this(
            contactsStatus,
            historyChunkOrder,
            historyPhase,
            historyProgress,
            historyStatus,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contactsStatus(): Optional<String> = contactsStatus.getOptional("contacts_status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun historyChunkOrder(): Optional<Long> =
            historyChunkOrder.getOptional("history_chunk_order")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun historyPhase(): Optional<Long> = historyPhase.getOptional("history_phase")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun historyProgress(): Optional<Long> = historyProgress.getOptional("history_progress")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun historyStatus(): Optional<String> = historyStatus.getOptional("history_status")

        /**
         * Returns the raw JSON value of [contactsStatus].
         *
         * Unlike [contactsStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contacts_status")
        @ExcludeMissing
        fun _contactsStatus(): JsonField<String> = contactsStatus

        /**
         * Returns the raw JSON value of [historyChunkOrder].
         *
         * Unlike [historyChunkOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("history_chunk_order")
        @ExcludeMissing
        fun _historyChunkOrder(): JsonField<Long> = historyChunkOrder

        /**
         * Returns the raw JSON value of [historyPhase].
         *
         * Unlike [historyPhase], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("history_phase")
        @ExcludeMissing
        fun _historyPhase(): JsonField<Long> = historyPhase

        /**
         * Returns the raw JSON value of [historyProgress].
         *
         * Unlike [historyProgress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("history_progress")
        @ExcludeMissing
        fun _historyProgress(): JsonField<Long> = historyProgress

        /**
         * Returns the raw JSON value of [historyStatus].
         *
         * Unlike [historyStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("history_status")
        @ExcludeMissing
        fun _historyStatus(): JsonField<String> = historyStatus

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

            /** Returns a mutable builder for constructing an instance of [SyncProgress]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SyncProgress]. */
        class Builder internal constructor() {

            private var contactsStatus: JsonField<String> = JsonMissing.of()
            private var historyChunkOrder: JsonField<Long> = JsonMissing.of()
            private var historyPhase: JsonField<Long> = JsonMissing.of()
            private var historyProgress: JsonField<Long> = JsonMissing.of()
            private var historyStatus: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(syncProgress: SyncProgress) = apply {
                contactsStatus = syncProgress.contactsStatus
                historyChunkOrder = syncProgress.historyChunkOrder
                historyPhase = syncProgress.historyPhase
                historyProgress = syncProgress.historyProgress
                historyStatus = syncProgress.historyStatus
                additionalProperties = syncProgress.additionalProperties.toMutableMap()
            }

            fun contactsStatus(contactsStatus: String) =
                contactsStatus(JsonField.of(contactsStatus))

            /**
             * Sets [Builder.contactsStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactsStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactsStatus(contactsStatus: JsonField<String>) = apply {
                this.contactsStatus = contactsStatus
            }

            fun historyChunkOrder(historyChunkOrder: Long?) =
                historyChunkOrder(JsonField.ofNullable(historyChunkOrder))

            /**
             * Alias for [Builder.historyChunkOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun historyChunkOrder(historyChunkOrder: Long) =
                historyChunkOrder(historyChunkOrder as Long?)

            /**
             * Alias for calling [Builder.historyChunkOrder] with `historyChunkOrder.orElse(null)`.
             */
            fun historyChunkOrder(historyChunkOrder: Optional<Long>) =
                historyChunkOrder(historyChunkOrder.getOrNull())

            /**
             * Sets [Builder.historyChunkOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.historyChunkOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun historyChunkOrder(historyChunkOrder: JsonField<Long>) = apply {
                this.historyChunkOrder = historyChunkOrder
            }

            fun historyPhase(historyPhase: Long?) = historyPhase(JsonField.ofNullable(historyPhase))

            /**
             * Alias for [Builder.historyPhase].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun historyPhase(historyPhase: Long) = historyPhase(historyPhase as Long?)

            /** Alias for calling [Builder.historyPhase] with `historyPhase.orElse(null)`. */
            fun historyPhase(historyPhase: Optional<Long>) = historyPhase(historyPhase.getOrNull())

            /**
             * Sets [Builder.historyPhase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.historyPhase] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun historyPhase(historyPhase: JsonField<Long>) = apply {
                this.historyPhase = historyPhase
            }

            fun historyProgress(historyProgress: Long?) =
                historyProgress(JsonField.ofNullable(historyProgress))

            /**
             * Alias for [Builder.historyProgress].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun historyProgress(historyProgress: Long) = historyProgress(historyProgress as Long?)

            /** Alias for calling [Builder.historyProgress] with `historyProgress.orElse(null)`. */
            fun historyProgress(historyProgress: Optional<Long>) =
                historyProgress(historyProgress.getOrNull())

            /**
             * Sets [Builder.historyProgress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.historyProgress] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun historyProgress(historyProgress: JsonField<Long>) = apply {
                this.historyProgress = historyProgress
            }

            fun historyStatus(historyStatus: String) = historyStatus(JsonField.of(historyStatus))

            /**
             * Sets [Builder.historyStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.historyStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun historyStatus(historyStatus: JsonField<String>) = apply {
                this.historyStatus = historyStatus
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
             * Returns an immutable instance of [SyncProgress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SyncProgress =
                SyncProgress(
                    contactsStatus,
                    historyChunkOrder,
                    historyPhase,
                    historyProgress,
                    historyStatus,
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
        fun validate(): SyncProgress = apply {
            if (validated) {
                return@apply
            }

            contactsStatus()
            historyChunkOrder()
            historyPhase()
            historyProgress()
            historyStatus()
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
            (if (contactsStatus.asKnown().isPresent) 1 else 0) +
                (if (historyChunkOrder.asKnown().isPresent) 1 else 0) +
                (if (historyPhase.asKnown().isPresent) 1 else 0) +
                (if (historyProgress.asKnown().isPresent) 1 else 0) +
                (if (historyStatus.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SyncProgress &&
                contactsStatus == other.contactsStatus &&
                historyChunkOrder == other.historyChunkOrder &&
                historyPhase == other.historyPhase &&
                historyProgress == other.historyProgress &&
                historyStatus == other.historyStatus &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                contactsStatus,
                historyChunkOrder,
                historyPhase,
                historyProgress,
                historyStatus,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SyncProgress{contactsStatus=$contactsStatus, historyChunkOrder=$historyChunkOrder, historyPhase=$historyPhase, historyProgress=$historyProgress, historyStatus=$historyStatus, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberListResponse &&
            callingEnabled == other.callingEnabled &&
            coexistenceState == other.coexistenceState &&
            createdAt == other.createdAt &&
            displayName == other.displayName &&
            enabled == other.enabled &&
            isOnBizApp == other.isOnBizApp &&
            phoneNumber == other.phoneNumber &&
            phoneNumberId == other.phoneNumberId &&
            qualityRating == other.qualityRating &&
            recordType == other.recordType &&
            status == other.status &&
            syncDeadline == other.syncDeadline &&
            syncProgress == other.syncProgress &&
            userId == other.userId &&
            wabaId == other.wabaId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            callingEnabled,
            coexistenceState,
            createdAt,
            displayName,
            enabled,
            isOnBizApp,
            phoneNumber,
            phoneNumberId,
            qualityRating,
            recordType,
            status,
            syncDeadline,
            syncProgress,
            userId,
            wabaId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumberListResponse{callingEnabled=$callingEnabled, coexistenceState=$coexistenceState, createdAt=$createdAt, displayName=$displayName, enabled=$enabled, isOnBizApp=$isOnBizApp, phoneNumber=$phoneNumber, phoneNumberId=$phoneNumberId, qualityRating=$qualityRating, recordType=$recordType, status=$status, syncDeadline=$syncDeadline, syncProgress=$syncProgress, userId=$userId, wabaId=$wabaId, additionalProperties=$additionalProperties}"
}
