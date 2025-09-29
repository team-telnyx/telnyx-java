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
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a scheduled event for an assistant */
class ScheduledEventCreateParams
private constructor(
    private val assistantId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun assistantId(): Optional<String> = Optional.ofNullable(assistantId)

    /**
     * The datetime at which the event should be scheduled. Formatted as ISO 8601.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scheduledAtFixedDatetime(): OffsetDateTime = body.scheduledAtFixedDatetime()

    /**
     * The phone number, SIP URI, to schedule the call or text from.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun telnyxAgentTarget(): String = body.telnyxAgentTarget()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun telnyxConversationChannel(): ConversationChannelType = body.telnyxConversationChannel()

    /**
     * The phone number, SIP URI, to schedule the call or text to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun telnyxEndUserTarget(): String = body.telnyxEndUserTarget()

    /**
     * Metadata associated with the conversation. Telnyx provides several pieces of metadata, but
     * customers can also add their own.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationMetadata(): Optional<ConversationMetadata> = body.conversationMetadata()

    /**
     * Required for sms scheduled events. The text to be sent to the end user.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = body.text()

    /**
     * Returns the raw JSON value of [scheduledAtFixedDatetime].
     *
     * Unlike [scheduledAtFixedDatetime], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _scheduledAtFixedDatetime(): JsonField<OffsetDateTime> = body._scheduledAtFixedDatetime()

    /**
     * Returns the raw JSON value of [telnyxAgentTarget].
     *
     * Unlike [telnyxAgentTarget], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _telnyxAgentTarget(): JsonField<String> = body._telnyxAgentTarget()

    /**
     * Returns the raw JSON value of [telnyxConversationChannel].
     *
     * Unlike [telnyxConversationChannel], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _telnyxConversationChannel(): JsonField<ConversationChannelType> =
        body._telnyxConversationChannel()

    /**
     * Returns the raw JSON value of [telnyxEndUserTarget].
     *
     * Unlike [telnyxEndUserTarget], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _telnyxEndUserTarget(): JsonField<String> = body._telnyxEndUserTarget()

    /**
     * Returns the raw JSON value of [conversationMetadata].
     *
     * Unlike [conversationMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _conversationMetadata(): JsonField<ConversationMetadata> = body._conversationMetadata()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<String> = body._text()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ScheduledEventCreateParams].
         *
         * The following fields are required:
         * ```java
         * .scheduledAtFixedDatetime()
         * .telnyxAgentTarget()
         * .telnyxConversationChannel()
         * .telnyxEndUserTarget()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScheduledEventCreateParams]. */
    class Builder internal constructor() {

        private var assistantId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(scheduledEventCreateParams: ScheduledEventCreateParams) = apply {
            assistantId = scheduledEventCreateParams.assistantId
            body = scheduledEventCreateParams.body.toBuilder()
            additionalHeaders = scheduledEventCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = scheduledEventCreateParams.additionalQueryParams.toBuilder()
        }

        fun assistantId(assistantId: String?) = apply { this.assistantId = assistantId }

        /** Alias for calling [Builder.assistantId] with `assistantId.orElse(null)`. */
        fun assistantId(assistantId: Optional<String>) = assistantId(assistantId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [scheduledAtFixedDatetime]
         * - [telnyxAgentTarget]
         * - [telnyxConversationChannel]
         * - [telnyxEndUserTarget]
         * - [conversationMetadata]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The datetime at which the event should be scheduled. Formatted as ISO 8601. */
        fun scheduledAtFixedDatetime(scheduledAtFixedDatetime: OffsetDateTime) = apply {
            body.scheduledAtFixedDatetime(scheduledAtFixedDatetime)
        }

        /**
         * Sets [Builder.scheduledAtFixedDatetime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledAtFixedDatetime] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun scheduledAtFixedDatetime(scheduledAtFixedDatetime: JsonField<OffsetDateTime>) = apply {
            body.scheduledAtFixedDatetime(scheduledAtFixedDatetime)
        }

        /** The phone number, SIP URI, to schedule the call or text from. */
        fun telnyxAgentTarget(telnyxAgentTarget: String) = apply {
            body.telnyxAgentTarget(telnyxAgentTarget)
        }

        /**
         * Sets [Builder.telnyxAgentTarget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telnyxAgentTarget] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun telnyxAgentTarget(telnyxAgentTarget: JsonField<String>) = apply {
            body.telnyxAgentTarget(telnyxAgentTarget)
        }

        fun telnyxConversationChannel(telnyxConversationChannel: ConversationChannelType) = apply {
            body.telnyxConversationChannel(telnyxConversationChannel)
        }

        /**
         * Sets [Builder.telnyxConversationChannel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telnyxConversationChannel] with a well-typed
         * [ConversationChannelType] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun telnyxConversationChannel(
            telnyxConversationChannel: JsonField<ConversationChannelType>
        ) = apply { body.telnyxConversationChannel(telnyxConversationChannel) }

        /** The phone number, SIP URI, to schedule the call or text to. */
        fun telnyxEndUserTarget(telnyxEndUserTarget: String) = apply {
            body.telnyxEndUserTarget(telnyxEndUserTarget)
        }

        /**
         * Sets [Builder.telnyxEndUserTarget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telnyxEndUserTarget] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun telnyxEndUserTarget(telnyxEndUserTarget: JsonField<String>) = apply {
            body.telnyxEndUserTarget(telnyxEndUserTarget)
        }

        /**
         * Metadata associated with the conversation. Telnyx provides several pieces of metadata,
         * but customers can also add their own.
         */
        fun conversationMetadata(conversationMetadata: ConversationMetadata) = apply {
            body.conversationMetadata(conversationMetadata)
        }

        /**
         * Sets [Builder.conversationMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationMetadata] with a well-typed
         * [ConversationMetadata] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun conversationMetadata(conversationMetadata: JsonField<ConversationMetadata>) = apply {
            body.conversationMetadata(conversationMetadata)
        }

        /** Required for sms scheduled events. The text to be sent to the end user. */
        fun text(text: String) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { body.text(text) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ScheduledEventCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .scheduledAtFixedDatetime()
         * .telnyxAgentTarget()
         * .telnyxConversationChannel()
         * .telnyxEndUserTarget()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScheduledEventCreateParams =
            ScheduledEventCreateParams(
                assistantId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> assistantId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val scheduledAtFixedDatetime: JsonField<OffsetDateTime>,
        private val telnyxAgentTarget: JsonField<String>,
        private val telnyxConversationChannel: JsonField<ConversationChannelType>,
        private val telnyxEndUserTarget: JsonField<String>,
        private val conversationMetadata: JsonField<ConversationMetadata>,
        private val text: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
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
            @JsonProperty("conversation_metadata")
            @ExcludeMissing
            conversationMetadata: JsonField<ConversationMetadata> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        ) : this(
            scheduledAtFixedDatetime,
            telnyxAgentTarget,
            telnyxConversationChannel,
            telnyxEndUserTarget,
            conversationMetadata,
            text,
            mutableMapOf(),
        )

        /**
         * The datetime at which the event should be scheduled. Formatted as ISO 8601.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scheduledAtFixedDatetime(): OffsetDateTime =
            scheduledAtFixedDatetime.getRequired("scheduled_at_fixed_datetime")

        /**
         * The phone number, SIP URI, to schedule the call or text from.
         *
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
         * The phone number, SIP URI, to schedule the call or text to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun telnyxEndUserTarget(): String =
            telnyxEndUserTarget.getRequired("telnyx_end_user_target")

        /**
         * Metadata associated with the conversation. Telnyx provides several pieces of metadata,
         * but customers can also add their own.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conversationMetadata(): Optional<ConversationMetadata> =
            conversationMetadata.getOptional("conversation_metadata")

        /**
         * Required for sms scheduled events. The text to be sent to the end user.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

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
        fun _telnyxConversationChannel(): JsonField<ConversationChannelType> =
            telnyxConversationChannel

        /**
         * Returns the raw JSON value of [telnyxEndUserTarget].
         *
         * Unlike [telnyxEndUserTarget], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("telnyx_end_user_target")
        @ExcludeMissing
        fun _telnyxEndUserTarget(): JsonField<String> = telnyxEndUserTarget

        /**
         * Returns the raw JSON value of [conversationMetadata].
         *
         * Unlike [conversationMetadata], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("conversation_metadata")
        @ExcludeMissing
        fun _conversationMetadata(): JsonField<ConversationMetadata> = conversationMetadata

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .scheduledAtFixedDatetime()
             * .telnyxAgentTarget()
             * .telnyxConversationChannel()
             * .telnyxEndUserTarget()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var scheduledAtFixedDatetime: JsonField<OffsetDateTime>? = null
            private var telnyxAgentTarget: JsonField<String>? = null
            private var telnyxConversationChannel: JsonField<ConversationChannelType>? = null
            private var telnyxEndUserTarget: JsonField<String>? = null
            private var conversationMetadata: JsonField<ConversationMetadata> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                scheduledAtFixedDatetime = body.scheduledAtFixedDatetime
                telnyxAgentTarget = body.telnyxAgentTarget
                telnyxConversationChannel = body.telnyxConversationChannel
                telnyxEndUserTarget = body.telnyxEndUserTarget
                conversationMetadata = body.conversationMetadata
                text = body.text
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The datetime at which the event should be scheduled. Formatted as ISO 8601. */
            fun scheduledAtFixedDatetime(scheduledAtFixedDatetime: OffsetDateTime) =
                scheduledAtFixedDatetime(JsonField.of(scheduledAtFixedDatetime))

            /**
             * Sets [Builder.scheduledAtFixedDatetime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduledAtFixedDatetime] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun scheduledAtFixedDatetime(scheduledAtFixedDatetime: JsonField<OffsetDateTime>) =
                apply {
                    this.scheduledAtFixedDatetime = scheduledAtFixedDatetime
                }

            /** The phone number, SIP URI, to schedule the call or text from. */
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
             * [ConversationChannelType] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun telnyxConversationChannel(
                telnyxConversationChannel: JsonField<ConversationChannelType>
            ) = apply { this.telnyxConversationChannel = telnyxConversationChannel }

            /** The phone number, SIP URI, to schedule the call or text to. */
            fun telnyxEndUserTarget(telnyxEndUserTarget: String) =
                telnyxEndUserTarget(JsonField.of(telnyxEndUserTarget))

            /**
             * Sets [Builder.telnyxEndUserTarget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.telnyxEndUserTarget] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun telnyxEndUserTarget(telnyxEndUserTarget: JsonField<String>) = apply {
                this.telnyxEndUserTarget = telnyxEndUserTarget
            }

            /**
             * Metadata associated with the conversation. Telnyx provides several pieces of
             * metadata, but customers can also add their own.
             */
            fun conversationMetadata(conversationMetadata: ConversationMetadata) =
                conversationMetadata(JsonField.of(conversationMetadata))

            /**
             * Sets [Builder.conversationMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conversationMetadata] with a well-typed
             * [ConversationMetadata] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun conversationMetadata(conversationMetadata: JsonField<ConversationMetadata>) =
                apply {
                    this.conversationMetadata = conversationMetadata
                }

            /** Required for sms scheduled events. The text to be sent to the end user. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .scheduledAtFixedDatetime()
             * .telnyxAgentTarget()
             * .telnyxConversationChannel()
             * .telnyxEndUserTarget()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("scheduledAtFixedDatetime", scheduledAtFixedDatetime),
                    checkRequired("telnyxAgentTarget", telnyxAgentTarget),
                    checkRequired("telnyxConversationChannel", telnyxConversationChannel),
                    checkRequired("telnyxEndUserTarget", telnyxEndUserTarget),
                    conversationMetadata,
                    text,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            scheduledAtFixedDatetime()
            telnyxAgentTarget()
            telnyxConversationChannel().validate()
            telnyxEndUserTarget()
            conversationMetadata().ifPresent { it.validate() }
            text()
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
            (if (scheduledAtFixedDatetime.asKnown().isPresent) 1 else 0) +
                (if (telnyxAgentTarget.asKnown().isPresent) 1 else 0) +
                (telnyxConversationChannel.asKnown().getOrNull()?.validity() ?: 0) +
                (if (telnyxEndUserTarget.asKnown().isPresent) 1 else 0) +
                (conversationMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (text.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                scheduledAtFixedDatetime == other.scheduledAtFixedDatetime &&
                telnyxAgentTarget == other.telnyxAgentTarget &&
                telnyxConversationChannel == other.telnyxConversationChannel &&
                telnyxEndUserTarget == other.telnyxEndUserTarget &&
                conversationMetadata == other.conversationMetadata &&
                text == other.text &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                scheduledAtFixedDatetime,
                telnyxAgentTarget,
                telnyxConversationChannel,
                telnyxEndUserTarget,
                conversationMetadata,
                text,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{scheduledAtFixedDatetime=$scheduledAtFixedDatetime, telnyxAgentTarget=$telnyxAgentTarget, telnyxConversationChannel=$telnyxConversationChannel, telnyxEndUserTarget=$telnyxEndUserTarget, conversationMetadata=$conversationMetadata, text=$text, additionalProperties=$additionalProperties}"
    }

    /**
     * Metadata associated with the conversation. Telnyx provides several pieces of metadata, but
     * customers can also add their own.
     */
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

        return other is ScheduledEventCreateParams &&
            assistantId == other.assistantId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(assistantId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ScheduledEventCreateParams{assistantId=$assistantId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
