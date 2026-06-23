// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.scheduledevents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class ScheduledPhoneCallEventResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val assistantId: JsonField<String>,
    private val scheduledAtFixedDatetime: JsonField<OffsetDateTime>,
    private val telnyxAgentTarget: JsonField<String>,
    private val telnyxConversationChannel: JsonField<ConversationChannelType>,
    private val telnyxEndUserTarget: JsonField<String>,
    private val callAttempts: JsonField<List<CallAttempt>>,
    private val callDuration: JsonField<Long>,
    private val callSettings: JsonField<ScheduledCallSettings>,
    private val callStatus: JsonField<String>,
    private val conversationId: JsonField<String>,
    private val conversationMetadata: JsonField<ConversationMetadata>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dispatchedAt: JsonField<OffsetDateTime>,
    private val dynamicVariables: JsonField<DynamicVariables>,
    private val errors: JsonField<List<String>>,
    private val maxRetriesClientErrors: JsonField<Long>,
    private val retryAttempts: JsonField<Long>,
    private val retryCount: JsonField<Long>,
    private val retryIntervalSecs: JsonField<Long>,
    private val scheduledEventId: JsonField<String>,
    private val status: JsonField<EventStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("assistant_id")
        @ExcludeMissing
        assistantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scheduled_at_fixed_datetime")
        @ExcludeMissing
        scheduledAtFixedDatetime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("telnyx_agent_target")
        @ExcludeMissing
        telnyxAgentTarget: JsonField<String> = JsonMissing.of(),
        @JsonProperty("telnyx_conversation_channel")
        @ExcludeMissing
        telnyxConversationChannel: JsonField<ConversationChannelType> = JsonMissing.of(),
        @JsonProperty("telnyx_end_user_target")
        @ExcludeMissing
        telnyxEndUserTarget: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_attempts")
        @ExcludeMissing
        callAttempts: JsonField<List<CallAttempt>> = JsonMissing.of(),
        @JsonProperty("call_duration")
        @ExcludeMissing
        callDuration: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("call_settings")
        @ExcludeMissing
        callSettings: JsonField<ScheduledCallSettings> = JsonMissing.of(),
        @JsonProperty("call_status")
        @ExcludeMissing
        callStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conversation_id")
        @ExcludeMissing
        conversationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conversation_metadata")
        @ExcludeMissing
        conversationMetadata: JsonField<ConversationMetadata> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dispatched_at")
        @ExcludeMissing
        dispatchedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dynamic_variables")
        @ExcludeMissing
        dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of(),
        @JsonProperty("errors") @ExcludeMissing errors: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("max_retries_client_errors")
        @ExcludeMissing
        maxRetriesClientErrors: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("retry_attempts")
        @ExcludeMissing
        retryAttempts: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("retry_count") @ExcludeMissing retryCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("retry_interval_secs")
        @ExcludeMissing
        retryIntervalSecs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("scheduled_event_id")
        @ExcludeMissing
        scheduledEventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<EventStatus> = JsonMissing.of(),
    ) : this(
        assistantId,
        scheduledAtFixedDatetime,
        telnyxAgentTarget,
        telnyxConversationChannel,
        telnyxEndUserTarget,
        callAttempts,
        callDuration,
        callSettings,
        callStatus,
        conversationId,
        conversationMetadata,
        createdAt,
        dispatchedAt,
        dynamicVariables,
        errors,
        maxRetriesClientErrors,
        retryAttempts,
        retryCount,
        retryIntervalSecs,
        scheduledEventId,
        status,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun assistantId(): String = assistantId.getRequired("assistant_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scheduledAtFixedDatetime(): OffsetDateTime =
        scheduledAtFixedDatetime.getRequired("scheduled_at_fixed_datetime")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun telnyxAgentTarget(): String = telnyxAgentTarget.getRequired("telnyx_agent_target")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun telnyxConversationChannel(): ConversationChannelType =
        telnyxConversationChannel.getRequired("telnyx_conversation_channel")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun telnyxEndUserTarget(): String = telnyxEndUserTarget.getRequired("telnyx_end_user_target")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callAttempts(): Optional<List<CallAttempt>> = callAttempts.getOptional("call_attempts")

    /**
     * Duration of the call in seconds
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callDuration(): Optional<Long> = callDuration.getOptional("call_duration")

    /**
     * Per-call telephony overrides applied when a scheduled phone-call event dispatches. Phone-call
     * events only. New per-call dispatch options should be added here rather than as top-level
     * event fields.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callSettings(): Optional<ScheduledCallSettings> = callSettings.getOptional("call_settings")

    /**
     * Values: busy, canceled, no-answer, ringing, completed, failed, in-progress
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callStatus(): Optional<String> = callStatus.getOptional("call_status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationId(): Optional<String> = conversationId.getOptional("conversation_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationMetadata(): Optional<ConversationMetadata> =
        conversationMetadata.getOptional("conversation_metadata")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Date time at which call was sent
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dispatchedAt(): Optional<OffsetDateTime> = dispatchedAt.getOptional("dispatched_at")

    /**
     * A map of dynamic variable names to values. These variables can be referenced in the
     * assistant's instructions and messages using {{variable_name}} syntax.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dynamicVariables(): Optional<DynamicVariables> =
        dynamicVariables.getOptional("dynamic_variables")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errors(): Optional<List<String>> = errors.getOptional("errors")

    /**
     * Configure number of retries on client errors: busy, no-answer, failed, canceled (caller hung
     * up before the callee answered)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxRetriesClientErrors(): Optional<Long> =
        maxRetriesClientErrors.getOptional("max_retries_client_errors")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retryAttempts(): Optional<Long> = retryAttempts.getOptional("retry_attempts")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retryCount(): Optional<Long> = retryCount.getOptional("retry_count")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retryIntervalSecs(): Optional<Long> = retryIntervalSecs.getOptional("retry_interval_secs")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduledEventId(): Optional<String> = scheduledEventId.getOptional("scheduled_event_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<EventStatus> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [assistantId].
     *
     * Unlike [assistantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("assistant_id")
    @ExcludeMissing
    fun _assistantId(): JsonField<String> = assistantId

    /**
     * Returns the raw JSON value of [scheduledAtFixedDatetime].
     *
     * Unlike [scheduledAtFixedDatetime], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("scheduled_at_fixed_datetime")
    @ExcludeMissing
    fun _scheduledAtFixedDatetime(): JsonField<OffsetDateTime> = scheduledAtFixedDatetime

    /**
     * Returns the raw JSON value of [telnyxAgentTarget].
     *
     * Unlike [telnyxAgentTarget], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("telnyx_agent_target")
    @ExcludeMissing
    fun _telnyxAgentTarget(): JsonField<String> = telnyxAgentTarget

    /**
     * Returns the raw JSON value of [telnyxConversationChannel].
     *
     * Unlike [telnyxConversationChannel], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("telnyx_conversation_channel")
    @ExcludeMissing
    fun _telnyxConversationChannel(): JsonField<ConversationChannelType> = telnyxConversationChannel

    /**
     * Returns the raw JSON value of [telnyxEndUserTarget].
     *
     * Unlike [telnyxEndUserTarget], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("telnyx_end_user_target")
    @ExcludeMissing
    fun _telnyxEndUserTarget(): JsonField<String> = telnyxEndUserTarget

    /**
     * Returns the raw JSON value of [callAttempts].
     *
     * Unlike [callAttempts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_attempts")
    @ExcludeMissing
    fun _callAttempts(): JsonField<List<CallAttempt>> = callAttempts

    /**
     * Returns the raw JSON value of [callDuration].
     *
     * Unlike [callDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_duration")
    @ExcludeMissing
    fun _callDuration(): JsonField<Long> = callDuration

    /**
     * Returns the raw JSON value of [callSettings].
     *
     * Unlike [callSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_settings")
    @ExcludeMissing
    fun _callSettings(): JsonField<ScheduledCallSettings> = callSettings

    /**
     * Returns the raw JSON value of [callStatus].
     *
     * Unlike [callStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_status") @ExcludeMissing fun _callStatus(): JsonField<String> = callStatus

    /**
     * Returns the raw JSON value of [conversationId].
     *
     * Unlike [conversationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conversation_id")
    @ExcludeMissing
    fun _conversationId(): JsonField<String> = conversationId

    /**
     * Returns the raw JSON value of [conversationMetadata].
     *
     * Unlike [conversationMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("conversation_metadata")
    @ExcludeMissing
    fun _conversationMetadata(): JsonField<ConversationMetadata> = conversationMetadata

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [dispatchedAt].
     *
     * Unlike [dispatchedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dispatched_at")
    @ExcludeMissing
    fun _dispatchedAt(): JsonField<OffsetDateTime> = dispatchedAt

    /**
     * Returns the raw JSON value of [dynamicVariables].
     *
     * Unlike [dynamicVariables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dynamic_variables")
    @ExcludeMissing
    fun _dynamicVariables(): JsonField<DynamicVariables> = dynamicVariables

    /**
     * Returns the raw JSON value of [errors].
     *
     * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<String>> = errors

    /**
     * Returns the raw JSON value of [maxRetriesClientErrors].
     *
     * Unlike [maxRetriesClientErrors], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("max_retries_client_errors")
    @ExcludeMissing
    fun _maxRetriesClientErrors(): JsonField<Long> = maxRetriesClientErrors

    /**
     * Returns the raw JSON value of [retryAttempts].
     *
     * Unlike [retryAttempts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retry_attempts")
    @ExcludeMissing
    fun _retryAttempts(): JsonField<Long> = retryAttempts

    /**
     * Returns the raw JSON value of [retryCount].
     *
     * Unlike [retryCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retry_count") @ExcludeMissing fun _retryCount(): JsonField<Long> = retryCount

    /**
     * Returns the raw JSON value of [retryIntervalSecs].
     *
     * Unlike [retryIntervalSecs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("retry_interval_secs")
    @ExcludeMissing
    fun _retryIntervalSecs(): JsonField<Long> = retryIntervalSecs

    /**
     * Returns the raw JSON value of [scheduledEventId].
     *
     * Unlike [scheduledEventId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("scheduled_event_id")
    @ExcludeMissing
    fun _scheduledEventId(): JsonField<String> = scheduledEventId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<EventStatus> = status

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
         * [ScheduledPhoneCallEventResponse].
         *
         * The following fields are required:
         * ```java
         * .assistantId()
         * .scheduledAtFixedDatetime()
         * .telnyxAgentTarget()
         * .telnyxConversationChannel()
         * .telnyxEndUserTarget()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScheduledPhoneCallEventResponse]. */
    class Builder internal constructor() {

        private var assistantId: JsonField<String>? = null
        private var scheduledAtFixedDatetime: JsonField<OffsetDateTime>? = null
        private var telnyxAgentTarget: JsonField<String>? = null
        private var telnyxConversationChannel: JsonField<ConversationChannelType>? = null
        private var telnyxEndUserTarget: JsonField<String>? = null
        private var callAttempts: JsonField<MutableList<CallAttempt>>? = null
        private var callDuration: JsonField<Long> = JsonMissing.of()
        private var callSettings: JsonField<ScheduledCallSettings> = JsonMissing.of()
        private var callStatus: JsonField<String> = JsonMissing.of()
        private var conversationId: JsonField<String> = JsonMissing.of()
        private var conversationMetadata: JsonField<ConversationMetadata> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dispatchedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of()
        private var errors: JsonField<MutableList<String>>? = null
        private var maxRetriesClientErrors: JsonField<Long> = JsonMissing.of()
        private var retryAttempts: JsonField<Long> = JsonMissing.of()
        private var retryCount: JsonField<Long> = JsonMissing.of()
        private var retryIntervalSecs: JsonField<Long> = JsonMissing.of()
        private var scheduledEventId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<EventStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scheduledPhoneCallEventResponse: ScheduledPhoneCallEventResponse) =
            apply {
                assistantId = scheduledPhoneCallEventResponse.assistantId
                scheduledAtFixedDatetime = scheduledPhoneCallEventResponse.scheduledAtFixedDatetime
                telnyxAgentTarget = scheduledPhoneCallEventResponse.telnyxAgentTarget
                telnyxConversationChannel =
                    scheduledPhoneCallEventResponse.telnyxConversationChannel
                telnyxEndUserTarget = scheduledPhoneCallEventResponse.telnyxEndUserTarget
                callAttempts =
                    scheduledPhoneCallEventResponse.callAttempts.map { it.toMutableList() }
                callDuration = scheduledPhoneCallEventResponse.callDuration
                callSettings = scheduledPhoneCallEventResponse.callSettings
                callStatus = scheduledPhoneCallEventResponse.callStatus
                conversationId = scheduledPhoneCallEventResponse.conversationId
                conversationMetadata = scheduledPhoneCallEventResponse.conversationMetadata
                createdAt = scheduledPhoneCallEventResponse.createdAt
                dispatchedAt = scheduledPhoneCallEventResponse.dispatchedAt
                dynamicVariables = scheduledPhoneCallEventResponse.dynamicVariables
                errors = scheduledPhoneCallEventResponse.errors.map { it.toMutableList() }
                maxRetriesClientErrors = scheduledPhoneCallEventResponse.maxRetriesClientErrors
                retryAttempts = scheduledPhoneCallEventResponse.retryAttempts
                retryCount = scheduledPhoneCallEventResponse.retryCount
                retryIntervalSecs = scheduledPhoneCallEventResponse.retryIntervalSecs
                scheduledEventId = scheduledPhoneCallEventResponse.scheduledEventId
                status = scheduledPhoneCallEventResponse.status
                additionalProperties =
                    scheduledPhoneCallEventResponse.additionalProperties.toMutableMap()
            }

        fun assistantId(assistantId: String) = assistantId(JsonField.of(assistantId))

        /**
         * Sets [Builder.assistantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assistantId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assistantId(assistantId: JsonField<String>) = apply { this.assistantId = assistantId }

        fun scheduledAtFixedDatetime(scheduledAtFixedDatetime: OffsetDateTime) =
            scheduledAtFixedDatetime(JsonField.of(scheduledAtFixedDatetime))

        /**
         * Sets [Builder.scheduledAtFixedDatetime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledAtFixedDatetime] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun scheduledAtFixedDatetime(scheduledAtFixedDatetime: JsonField<OffsetDateTime>) = apply {
            this.scheduledAtFixedDatetime = scheduledAtFixedDatetime
        }

        fun telnyxAgentTarget(telnyxAgentTarget: String) =
            telnyxAgentTarget(JsonField.of(telnyxAgentTarget))

        /**
         * Sets [Builder.telnyxAgentTarget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telnyxAgentTarget] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun telnyxAgentTarget(telnyxAgentTarget: JsonField<String>) = apply {
            this.telnyxAgentTarget = telnyxAgentTarget
        }

        fun telnyxConversationChannel(telnyxConversationChannel: ConversationChannelType) =
            telnyxConversationChannel(JsonField.of(telnyxConversationChannel))

        /**
         * Sets [Builder.telnyxConversationChannel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telnyxConversationChannel] with a well-typed
         * [ConversationChannelType] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun telnyxConversationChannel(
            telnyxConversationChannel: JsonField<ConversationChannelType>
        ) = apply { this.telnyxConversationChannel = telnyxConversationChannel }

        fun telnyxEndUserTarget(telnyxEndUserTarget: String) =
            telnyxEndUserTarget(JsonField.of(telnyxEndUserTarget))

        /**
         * Sets [Builder.telnyxEndUserTarget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telnyxEndUserTarget] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun telnyxEndUserTarget(telnyxEndUserTarget: JsonField<String>) = apply {
            this.telnyxEndUserTarget = telnyxEndUserTarget
        }

        fun callAttempts(callAttempts: List<CallAttempt>) = callAttempts(JsonField.of(callAttempts))

        /**
         * Sets [Builder.callAttempts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callAttempts] with a well-typed `List<CallAttempt>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun callAttempts(callAttempts: JsonField<List<CallAttempt>>) = apply {
            this.callAttempts = callAttempts.map { it.toMutableList() }
        }

        /**
         * Adds a single [CallAttempt] to [callAttempts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCallAttempt(callAttempt: CallAttempt) = apply {
            callAttempts =
                (callAttempts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("callAttempts", it).add(callAttempt)
                }
        }

        /** Duration of the call in seconds */
        fun callDuration(callDuration: Long) = callDuration(JsonField.of(callDuration))

        /**
         * Sets [Builder.callDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callDuration] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callDuration(callDuration: JsonField<Long>) = apply { this.callDuration = callDuration }

        /**
         * Per-call telephony overrides applied when a scheduled phone-call event dispatches.
         * Phone-call events only. New per-call dispatch options should be added here rather than as
         * top-level event fields.
         */
        fun callSettings(callSettings: ScheduledCallSettings) =
            callSettings(JsonField.of(callSettings))

        /**
         * Sets [Builder.callSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSettings] with a well-typed [ScheduledCallSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun callSettings(callSettings: JsonField<ScheduledCallSettings>) = apply {
            this.callSettings = callSettings
        }

        /** Values: busy, canceled, no-answer, ringing, completed, failed, in-progress */
        fun callStatus(callStatus: String) = callStatus(JsonField.of(callStatus))

        /**
         * Sets [Builder.callStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callStatus(callStatus: JsonField<String>) = apply { this.callStatus = callStatus }

        fun conversationId(conversationId: String) = conversationId(JsonField.of(conversationId))

        /**
         * Sets [Builder.conversationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conversationId(conversationId: JsonField<String>) = apply {
            this.conversationId = conversationId
        }

        fun conversationMetadata(conversationMetadata: ConversationMetadata) =
            conversationMetadata(JsonField.of(conversationMetadata))

        /**
         * Sets [Builder.conversationMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationMetadata] with a well-typed
         * [ConversationMetadata] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun conversationMetadata(conversationMetadata: JsonField<ConversationMetadata>) = apply {
            this.conversationMetadata = conversationMetadata
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

        /** Date time at which call was sent */
        fun dispatchedAt(dispatchedAt: OffsetDateTime) = dispatchedAt(JsonField.of(dispatchedAt))

        /**
         * Sets [Builder.dispatchedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dispatchedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dispatchedAt(dispatchedAt: JsonField<OffsetDateTime>) = apply {
            this.dispatchedAt = dispatchedAt
        }

        /**
         * A map of dynamic variable names to values. These variables can be referenced in the
         * assistant's instructions and messages using {{variable_name}} syntax.
         */
        fun dynamicVariables(dynamicVariables: DynamicVariables) =
            dynamicVariables(JsonField.of(dynamicVariables))

        /**
         * Sets [Builder.dynamicVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dynamicVariables] with a well-typed [DynamicVariables]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dynamicVariables(dynamicVariables: JsonField<DynamicVariables>) = apply {
            this.dynamicVariables = dynamicVariables
        }

        fun errors(errors: List<String>) = errors(JsonField.of(errors))

        /**
         * Sets [Builder.errors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errors] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errors(errors: JsonField<List<String>>) = apply {
            this.errors = errors.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [errors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addError(error: String) = apply {
            errors =
                (errors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("errors", it).add(error)
                }
        }

        /**
         * Configure number of retries on client errors: busy, no-answer, failed, canceled (caller
         * hung up before the callee answered)
         */
        fun maxRetriesClientErrors(maxRetriesClientErrors: Long) =
            maxRetriesClientErrors(JsonField.of(maxRetriesClientErrors))

        /**
         * Sets [Builder.maxRetriesClientErrors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRetriesClientErrors] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxRetriesClientErrors(maxRetriesClientErrors: JsonField<Long>) = apply {
            this.maxRetriesClientErrors = maxRetriesClientErrors
        }

        fun retryAttempts(retryAttempts: Long) = retryAttempts(JsonField.of(retryAttempts))

        /**
         * Sets [Builder.retryAttempts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retryAttempts] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun retryAttempts(retryAttempts: JsonField<Long>) = apply {
            this.retryAttempts = retryAttempts
        }

        fun retryCount(retryCount: Long) = retryCount(JsonField.of(retryCount))

        /**
         * Sets [Builder.retryCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retryCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun retryCount(retryCount: JsonField<Long>) = apply { this.retryCount = retryCount }

        fun retryIntervalSecs(retryIntervalSecs: Long) =
            retryIntervalSecs(JsonField.of(retryIntervalSecs))

        /**
         * Sets [Builder.retryIntervalSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retryIntervalSecs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun retryIntervalSecs(retryIntervalSecs: JsonField<Long>) = apply {
            this.retryIntervalSecs = retryIntervalSecs
        }

        fun scheduledEventId(scheduledEventId: String) =
            scheduledEventId(JsonField.of(scheduledEventId))

        /**
         * Sets [Builder.scheduledEventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledEventId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scheduledEventId(scheduledEventId: JsonField<String>) = apply {
            this.scheduledEventId = scheduledEventId
        }

        fun status(status: EventStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [EventStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<EventStatus>) = apply { this.status = status }

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
         * Returns an immutable instance of [ScheduledPhoneCallEventResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .assistantId()
         * .scheduledAtFixedDatetime()
         * .telnyxAgentTarget()
         * .telnyxConversationChannel()
         * .telnyxEndUserTarget()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScheduledPhoneCallEventResponse =
            ScheduledPhoneCallEventResponse(
                checkRequired("assistantId", assistantId),
                checkRequired("scheduledAtFixedDatetime", scheduledAtFixedDatetime),
                checkRequired("telnyxAgentTarget", telnyxAgentTarget),
                checkRequired("telnyxConversationChannel", telnyxConversationChannel),
                checkRequired("telnyxEndUserTarget", telnyxEndUserTarget),
                (callAttempts ?: JsonMissing.of()).map { it.toImmutable() },
                callDuration,
                callSettings,
                callStatus,
                conversationId,
                conversationMetadata,
                createdAt,
                dispatchedAt,
                dynamicVariables,
                (errors ?: JsonMissing.of()).map { it.toImmutable() },
                maxRetriesClientErrors,
                retryAttempts,
                retryCount,
                retryIntervalSecs,
                scheduledEventId,
                status,
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
    fun validate(): ScheduledPhoneCallEventResponse = apply {
        if (validated) {
            return@apply
        }

        assistantId()
        scheduledAtFixedDatetime()
        telnyxAgentTarget()
        telnyxConversationChannel().validate()
        telnyxEndUserTarget()
        callAttempts().ifPresent { it.forEach { it.validate() } }
        callDuration()
        callSettings().ifPresent { it.validate() }
        callStatus()
        conversationId()
        conversationMetadata().ifPresent { it.validate() }
        createdAt()
        dispatchedAt()
        dynamicVariables().ifPresent { it.validate() }
        errors()
        maxRetriesClientErrors()
        retryAttempts()
        retryCount()
        retryIntervalSecs()
        scheduledEventId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (assistantId.asKnown().isPresent) 1 else 0) +
            (if (scheduledAtFixedDatetime.asKnown().isPresent) 1 else 0) +
            (if (telnyxAgentTarget.asKnown().isPresent) 1 else 0) +
            (telnyxConversationChannel.asKnown().getOrNull()?.validity() ?: 0) +
            (if (telnyxEndUserTarget.asKnown().isPresent) 1 else 0) +
            (callAttempts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (callDuration.asKnown().isPresent) 1 else 0) +
            (callSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (callStatus.asKnown().isPresent) 1 else 0) +
            (if (conversationId.asKnown().isPresent) 1 else 0) +
            (conversationMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (dispatchedAt.asKnown().isPresent) 1 else 0) +
            (dynamicVariables.asKnown().getOrNull()?.validity() ?: 0) +
            (errors.asKnown().getOrNull()?.size ?: 0) +
            (if (maxRetriesClientErrors.asKnown().isPresent) 1 else 0) +
            (if (retryAttempts.asKnown().isPresent) 1 else 0) +
            (if (retryCount.asKnown().isPresent) 1 else 0) +
            (if (retryIntervalSecs.asKnown().isPresent) 1 else 0) +
            (if (scheduledEventId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    /** One row in `call_attempts` — captures the terminal outcome of a single dispatch. */
    class CallAttempt
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attemptNumber: JsonField<Long>,
        private val attemptedAt: JsonField<OffsetDateTime>,
        private val callStatus: JsonField<String>,
        private val callDuration: JsonField<Long>,
        private val telnyxCallControlId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attempt_number")
            @ExcludeMissing
            attemptNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("attempted_at")
            @ExcludeMissing
            attemptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("call_status")
            @ExcludeMissing
            callStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_duration")
            @ExcludeMissing
            callDuration: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("telnyx_call_control_id")
            @ExcludeMissing
            telnyxCallControlId: JsonField<String> = JsonMissing.of(),
        ) : this(
            attemptNumber,
            attemptedAt,
            callStatus,
            callDuration,
            telnyxCallControlId,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun attemptNumber(): Long = attemptNumber.getRequired("attempt_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun attemptedAt(): OffsetDateTime = attemptedAt.getRequired("attempted_at")

        /**
         * Values: busy, canceled, no-answer, ringing, completed, failed, in-progress
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun callStatus(): String = callStatus.getRequired("call_status")

        /**
         * Duration of the call in seconds
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callDuration(): Optional<Long> = callDuration.getOptional("call_duration")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun telnyxCallControlId(): Optional<String> =
            telnyxCallControlId.getOptional("telnyx_call_control_id")

        /**
         * Returns the raw JSON value of [attemptNumber].
         *
         * Unlike [attemptNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attempt_number")
        @ExcludeMissing
        fun _attemptNumber(): JsonField<Long> = attemptNumber

        /**
         * Returns the raw JSON value of [attemptedAt].
         *
         * Unlike [attemptedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attempted_at")
        @ExcludeMissing
        fun _attemptedAt(): JsonField<OffsetDateTime> = attemptedAt

        /**
         * Returns the raw JSON value of [callStatus].
         *
         * Unlike [callStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("call_status")
        @ExcludeMissing
        fun _callStatus(): JsonField<String> = callStatus

        /**
         * Returns the raw JSON value of [callDuration].
         *
         * Unlike [callDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_duration")
        @ExcludeMissing
        fun _callDuration(): JsonField<Long> = callDuration

        /**
         * Returns the raw JSON value of [telnyxCallControlId].
         *
         * Unlike [telnyxCallControlId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("telnyx_call_control_id")
        @ExcludeMissing
        fun _telnyxCallControlId(): JsonField<String> = telnyxCallControlId

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
             * Returns a mutable builder for constructing an instance of [CallAttempt].
             *
             * The following fields are required:
             * ```java
             * .attemptNumber()
             * .attemptedAt()
             * .callStatus()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CallAttempt]. */
        class Builder internal constructor() {

            private var attemptNumber: JsonField<Long>? = null
            private var attemptedAt: JsonField<OffsetDateTime>? = null
            private var callStatus: JsonField<String>? = null
            private var callDuration: JsonField<Long> = JsonMissing.of()
            private var telnyxCallControlId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(callAttempt: CallAttempt) = apply {
                attemptNumber = callAttempt.attemptNumber
                attemptedAt = callAttempt.attemptedAt
                callStatus = callAttempt.callStatus
                callDuration = callAttempt.callDuration
                telnyxCallControlId = callAttempt.telnyxCallControlId
                additionalProperties = callAttempt.additionalProperties.toMutableMap()
            }

            fun attemptNumber(attemptNumber: Long) = attemptNumber(JsonField.of(attemptNumber))

            /**
             * Sets [Builder.attemptNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attemptNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attemptNumber(attemptNumber: JsonField<Long>) = apply {
                this.attemptNumber = attemptNumber
            }

            fun attemptedAt(attemptedAt: OffsetDateTime) = attemptedAt(JsonField.of(attemptedAt))

            /**
             * Sets [Builder.attemptedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attemptedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun attemptedAt(attemptedAt: JsonField<OffsetDateTime>) = apply {
                this.attemptedAt = attemptedAt
            }

            /** Values: busy, canceled, no-answer, ringing, completed, failed, in-progress */
            fun callStatus(callStatus: String) = callStatus(JsonField.of(callStatus))

            /**
             * Sets [Builder.callStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callStatus(callStatus: JsonField<String>) = apply { this.callStatus = callStatus }

            /** Duration of the call in seconds */
            fun callDuration(callDuration: Long) = callDuration(JsonField.of(callDuration))

            /**
             * Sets [Builder.callDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callDuration] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callDuration(callDuration: JsonField<Long>) = apply {
                this.callDuration = callDuration
            }

            fun telnyxCallControlId(telnyxCallControlId: String) =
                telnyxCallControlId(JsonField.of(telnyxCallControlId))

            /**
             * Sets [Builder.telnyxCallControlId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.telnyxCallControlId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun telnyxCallControlId(telnyxCallControlId: JsonField<String>) = apply {
                this.telnyxCallControlId = telnyxCallControlId
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
             * Returns an immutable instance of [CallAttempt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .attemptNumber()
             * .attemptedAt()
             * .callStatus()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CallAttempt =
                CallAttempt(
                    checkRequired("attemptNumber", attemptNumber),
                    checkRequired("attemptedAt", attemptedAt),
                    checkRequired("callStatus", callStatus),
                    callDuration,
                    telnyxCallControlId,
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
        fun validate(): CallAttempt = apply {
            if (validated) {
                return@apply
            }

            attemptNumber()
            attemptedAt()
            callStatus()
            callDuration()
            telnyxCallControlId()
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
            (if (attemptNumber.asKnown().isPresent) 1 else 0) +
                (if (attemptedAt.asKnown().isPresent) 1 else 0) +
                (if (callStatus.asKnown().isPresent) 1 else 0) +
                (if (callDuration.asKnown().isPresent) 1 else 0) +
                (if (telnyxCallControlId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CallAttempt &&
                attemptNumber == other.attemptNumber &&
                attemptedAt == other.attemptedAt &&
                callStatus == other.callStatus &&
                callDuration == other.callDuration &&
                telnyxCallControlId == other.telnyxCallControlId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                attemptNumber,
                attemptedAt,
                callStatus,
                callDuration,
                telnyxCallControlId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CallAttempt{attemptNumber=$attemptNumber, attemptedAt=$attemptedAt, callStatus=$callStatus, callDuration=$callDuration, telnyxCallControlId=$telnyxCallControlId, additionalProperties=$additionalProperties}"
    }

    class ConversationMetadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ConversationMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConversationMetadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(conversationMetadata: ConversationMetadata) = apply {
                additionalProperties = conversationMetadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ConversationMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ConversationMetadata =
                ConversationMetadata(additionalProperties.toImmutable())
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
        fun validate(): ConversationMetadata = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConversationMetadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ConversationMetadata{additionalProperties=$additionalProperties}"
    }

    /**
     * A map of dynamic variable names to values. These variables can be referenced in the
     * assistant's instructions and messages using {{variable_name}} syntax.
     */
    class DynamicVariables
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [DynamicVariables]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DynamicVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dynamicVariables: DynamicVariables) = apply {
                additionalProperties = dynamicVariables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DynamicVariables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DynamicVariables = DynamicVariables(additionalProperties.toImmutable())
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
        fun validate(): DynamicVariables = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DynamicVariables && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "DynamicVariables{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScheduledPhoneCallEventResponse &&
            assistantId == other.assistantId &&
            scheduledAtFixedDatetime == other.scheduledAtFixedDatetime &&
            telnyxAgentTarget == other.telnyxAgentTarget &&
            telnyxConversationChannel == other.telnyxConversationChannel &&
            telnyxEndUserTarget == other.telnyxEndUserTarget &&
            callAttempts == other.callAttempts &&
            callDuration == other.callDuration &&
            callSettings == other.callSettings &&
            callStatus == other.callStatus &&
            conversationId == other.conversationId &&
            conversationMetadata == other.conversationMetadata &&
            createdAt == other.createdAt &&
            dispatchedAt == other.dispatchedAt &&
            dynamicVariables == other.dynamicVariables &&
            errors == other.errors &&
            maxRetriesClientErrors == other.maxRetriesClientErrors &&
            retryAttempts == other.retryAttempts &&
            retryCount == other.retryCount &&
            retryIntervalSecs == other.retryIntervalSecs &&
            scheduledEventId == other.scheduledEventId &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            assistantId,
            scheduledAtFixedDatetime,
            telnyxAgentTarget,
            telnyxConversationChannel,
            telnyxEndUserTarget,
            callAttempts,
            callDuration,
            callSettings,
            callStatus,
            conversationId,
            conversationMetadata,
            createdAt,
            dispatchedAt,
            dynamicVariables,
            errors,
            maxRetriesClientErrors,
            retryAttempts,
            retryCount,
            retryIntervalSecs,
            scheduledEventId,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScheduledPhoneCallEventResponse{assistantId=$assistantId, scheduledAtFixedDatetime=$scheduledAtFixedDatetime, telnyxAgentTarget=$telnyxAgentTarget, telnyxConversationChannel=$telnyxConversationChannel, telnyxEndUserTarget=$telnyxEndUserTarget, callAttempts=$callAttempts, callDuration=$callDuration, callSettings=$callSettings, callStatus=$callStatus, conversationId=$conversationId, conversationMetadata=$conversationMetadata, createdAt=$createdAt, dispatchedAt=$dispatchedAt, dynamicVariables=$dynamicVariables, errors=$errors, maxRetriesClientErrors=$maxRetriesClientErrors, retryAttempts=$retryAttempts, retryCount=$retryCount, retryIntervalSecs=$retryIntervalSecs, scheduledEventId=$scheduledEventId, status=$status, additionalProperties=$additionalProperties}"
}
