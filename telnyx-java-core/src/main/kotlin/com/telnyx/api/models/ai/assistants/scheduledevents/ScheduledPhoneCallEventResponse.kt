// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.scheduledevents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
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
    private val conversationId: JsonField<String>,
    private val conversationMetadata: JsonField<ConversationMetadata>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val errors: JsonField<List<String>>,
    private val retryAttempts: JsonField<Long>,
    private val retryCount: JsonField<Long>,
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
        @JsonProperty("conversation_id")
        @ExcludeMissing
        conversationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conversation_metadata")
        @ExcludeMissing
        conversationMetadata: JsonField<ConversationMetadata> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("errors") @ExcludeMissing errors: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("retry_attempts")
        @ExcludeMissing
        retryAttempts: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("retry_count") @ExcludeMissing retryCount: JsonField<Long> = JsonMissing.of(),
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
        conversationId,
        conversationMetadata,
        createdAt,
        errors,
        retryAttempts,
        retryCount,
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errors(): Optional<List<String>> = errors.getOptional("errors")

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
     * Returns the raw JSON value of [errors].
     *
     * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<String>> = errors

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
        private var conversationId: JsonField<String> = JsonMissing.of()
        private var conversationMetadata: JsonField<ConversationMetadata> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var errors: JsonField<MutableList<String>>? = null
        private var retryAttempts: JsonField<Long> = JsonMissing.of()
        private var retryCount: JsonField<Long> = JsonMissing.of()
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
                conversationId = scheduledPhoneCallEventResponse.conversationId
                conversationMetadata = scheduledPhoneCallEventResponse.conversationMetadata
                createdAt = scheduledPhoneCallEventResponse.createdAt
                errors = scheduledPhoneCallEventResponse.errors.map { it.toMutableList() }
                retryAttempts = scheduledPhoneCallEventResponse.retryAttempts
                retryCount = scheduledPhoneCallEventResponse.retryCount
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
                conversationId,
                conversationMetadata,
                createdAt,
                (errors ?: JsonMissing.of()).map { it.toImmutable() },
                retryAttempts,
                retryCount,
                scheduledEventId,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScheduledPhoneCallEventResponse = apply {
        if (validated) {
            return@apply
        }

        assistantId()
        scheduledAtFixedDatetime()
        telnyxAgentTarget()
        telnyxConversationChannel().validate()
        telnyxEndUserTarget()
        conversationId()
        conversationMetadata().ifPresent { it.validate() }
        createdAt()
        errors()
        retryAttempts()
        retryCount()
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
            (if (conversationId.asKnown().isPresent) 1 else 0) +
            (conversationMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (errors.asKnown().getOrNull()?.size ?: 0) +
            (if (retryAttempts.asKnown().isPresent) 1 else 0) +
            (if (retryCount.asKnown().isPresent) 1 else 0) +
            (if (scheduledEventId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

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
            conversationId == other.conversationId &&
            conversationMetadata == other.conversationMetadata &&
            createdAt == other.createdAt &&
            errors == other.errors &&
            retryAttempts == other.retryAttempts &&
            retryCount == other.retryCount &&
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
            conversationId,
            conversationMetadata,
            createdAt,
            errors,
            retryAttempts,
            retryCount,
            scheduledEventId,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScheduledPhoneCallEventResponse{assistantId=$assistantId, scheduledAtFixedDatetime=$scheduledAtFixedDatetime, telnyxAgentTarget=$telnyxAgentTarget, telnyxConversationChannel=$telnyxConversationChannel, telnyxEndUserTarget=$telnyxEndUserTarget, conversationId=$conversationId, conversationMetadata=$conversationMetadata, createdAt=$createdAt, errors=$errors, retryAttempts=$retryAttempts, retryCount=$retryCount, scheduledEventId=$scheduledEventId, status=$status, additionalProperties=$additionalProperties}"
}
