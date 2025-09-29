// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.queues.calls

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkRequired
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CallRetrieveResponse
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

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

        /** Returns a mutable builder for constructing an instance of [CallRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callRetrieveResponse: CallRetrieveResponse) = apply {
            data = callRetrieveResponse.data
            additionalProperties = callRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CallRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallRetrieveResponse =
            CallRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CallRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
        private val callControlId: JsonField<String>,
        private val callLegId: JsonField<String>,
        private val callSessionId: JsonField<String>,
        private val connectionId: JsonField<String>,
        private val enqueuedAt: JsonField<String>,
        private val from: JsonField<String>,
        private val queueId: JsonField<String>,
        private val queuePosition: JsonField<Long>,
        private val recordType: JsonField<RecordType>,
        private val to: JsonField<String>,
        private val waitTimeSecs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("call_control_id")
            @ExcludeMissing
            callControlId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_leg_id")
            @ExcludeMissing
            callLegId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_session_id")
            @ExcludeMissing
            callSessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enqueued_at")
            @ExcludeMissing
            enqueuedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("queue_id") @ExcludeMissing queueId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("queue_position")
            @ExcludeMissing
            queuePosition: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wait_time_secs")
            @ExcludeMissing
            waitTimeSecs: JsonField<Long> = JsonMissing.of(),
        ) : this(
            callControlId,
            callLegId,
            callSessionId,
            connectionId,
            enqueuedAt,
            from,
            queueId,
            queuePosition,
            recordType,
            to,
            waitTimeSecs,
            mutableMapOf(),
        )

        /**
         * Unique identifier and token for controlling the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun callControlId(): String = callControlId.getRequired("call_control_id")

        /**
         * ID that is unique to the call and can be used to correlate webhook events
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun callLegId(): String = callLegId.getRequired("call_leg_id")

        /**
         * ID that is unique to the call session and can be used to correlate webhook events. Call
         * session is a group of related call legs that logically belong to the same phone call,
         * e.g. an inbound and outbound leg of a transferred call
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun callSessionId(): String = callSessionId.getRequired("call_session_id")

        /**
         * Call Control App ID (formerly Telnyx connection ID) used in the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun connectionId(): String = connectionId.getRequired("connection_id")

        /**
         * ISO 8601 formatted date of when the call was put in the queue
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun enqueuedAt(): String = enqueuedAt.getRequired("enqueued_at")

        /**
         * Number or SIP URI placing the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): String = from.getRequired("from")

        /**
         * Unique identifier of the queue the call is in.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun queueId(): String = queueId.getRequired("queue_id")

        /**
         * Current position of the call in the queue
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun queuePosition(): Long = queuePosition.getRequired("queue_position")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): RecordType = recordType.getRequired("record_type")

        /**
         * Destination number or SIP URI of the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): String = to.getRequired("to")

        /**
         * The time the call has been waiting in the queue, given in seconds
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun waitTimeSecs(): Long = waitTimeSecs.getRequired("wait_time_secs")

        /**
         * Returns the raw JSON value of [callControlId].
         *
         * Unlike [callControlId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_control_id")
        @ExcludeMissing
        fun _callControlId(): JsonField<String> = callControlId

        /**
         * Returns the raw JSON value of [callLegId].
         *
         * Unlike [callLegId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("call_leg_id") @ExcludeMissing fun _callLegId(): JsonField<String> = callLegId

        /**
         * Returns the raw JSON value of [callSessionId].
         *
         * Unlike [callSessionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_session_id")
        @ExcludeMissing
        fun _callSessionId(): JsonField<String> = callSessionId

        /**
         * Returns the raw JSON value of [connectionId].
         *
         * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<String> = connectionId

        /**
         * Returns the raw JSON value of [enqueuedAt].
         *
         * Unlike [enqueuedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enqueued_at")
        @ExcludeMissing
        fun _enqueuedAt(): JsonField<String> = enqueuedAt

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [queueId].
         *
         * Unlike [queueId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("queue_id") @ExcludeMissing fun _queueId(): JsonField<String> = queueId

        /**
         * Returns the raw JSON value of [queuePosition].
         *
         * Unlike [queuePosition], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("queue_position")
        @ExcludeMissing
        fun _queuePosition(): JsonField<Long> = queuePosition

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

        /**
         * Returns the raw JSON value of [waitTimeSecs].
         *
         * Unlike [waitTimeSecs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("wait_time_secs")
        @ExcludeMissing
        fun _waitTimeSecs(): JsonField<Long> = waitTimeSecs

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .callControlId()
             * .callLegId()
             * .callSessionId()
             * .connectionId()
             * .enqueuedAt()
             * .from()
             * .queueId()
             * .queuePosition()
             * .recordType()
             * .to()
             * .waitTimeSecs()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var callControlId: JsonField<String>? = null
            private var callLegId: JsonField<String>? = null
            private var callSessionId: JsonField<String>? = null
            private var connectionId: JsonField<String>? = null
            private var enqueuedAt: JsonField<String>? = null
            private var from: JsonField<String>? = null
            private var queueId: JsonField<String>? = null
            private var queuePosition: JsonField<Long>? = null
            private var recordType: JsonField<RecordType>? = null
            private var to: JsonField<String>? = null
            private var waitTimeSecs: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                callControlId = data.callControlId
                callLegId = data.callLegId
                callSessionId = data.callSessionId
                connectionId = data.connectionId
                enqueuedAt = data.enqueuedAt
                from = data.from
                queueId = data.queueId
                queuePosition = data.queuePosition
                recordType = data.recordType
                to = data.to
                waitTimeSecs = data.waitTimeSecs
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Unique identifier and token for controlling the call. */
            fun callControlId(callControlId: String) = callControlId(JsonField.of(callControlId))

            /**
             * Sets [Builder.callControlId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callControlId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callControlId(callControlId: JsonField<String>) = apply {
                this.callControlId = callControlId
            }

            /** ID that is unique to the call and can be used to correlate webhook events */
            fun callLegId(callLegId: String) = callLegId(JsonField.of(callLegId))

            /**
             * Sets [Builder.callLegId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callLegId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callLegId(callLegId: JsonField<String>) = apply { this.callLegId = callLegId }

            /**
             * ID that is unique to the call session and can be used to correlate webhook events.
             * Call session is a group of related call legs that logically belong to the same phone
             * call, e.g. an inbound and outbound leg of a transferred call
             */
            fun callSessionId(callSessionId: String) = callSessionId(JsonField.of(callSessionId))

            /**
             * Sets [Builder.callSessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSessionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSessionId(callSessionId: JsonField<String>) = apply {
                this.callSessionId = callSessionId
            }

            /** Call Control App ID (formerly Telnyx connection ID) used in the call. */
            fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

            /**
             * Sets [Builder.connectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /** ISO 8601 formatted date of when the call was put in the queue */
            fun enqueuedAt(enqueuedAt: String) = enqueuedAt(JsonField.of(enqueuedAt))

            /**
             * Sets [Builder.enqueuedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enqueuedAt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enqueuedAt(enqueuedAt: JsonField<String>) = apply { this.enqueuedAt = enqueuedAt }

            /** Number or SIP URI placing the call. */
            fun from(from: String) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<String>) = apply { this.from = from }

            /** Unique identifier of the queue the call is in. */
            fun queueId(queueId: String) = queueId(JsonField.of(queueId))

            /**
             * Sets [Builder.queueId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.queueId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun queueId(queueId: JsonField<String>) = apply { this.queueId = queueId }

            /** Current position of the call in the queue */
            fun queuePosition(queuePosition: Long) = queuePosition(JsonField.of(queuePosition))

            /**
             * Sets [Builder.queuePosition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.queuePosition] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun queuePosition(queuePosition: JsonField<Long>) = apply {
                this.queuePosition = queuePosition
            }

            fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [RecordType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<RecordType>) = apply {
                this.recordType = recordType
            }

            /** Destination number or SIP URI of the call. */
            fun to(to: String) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<String>) = apply { this.to = to }

            /** The time the call has been waiting in the queue, given in seconds */
            fun waitTimeSecs(waitTimeSecs: Long) = waitTimeSecs(JsonField.of(waitTimeSecs))

            /**
             * Sets [Builder.waitTimeSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waitTimeSecs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun waitTimeSecs(waitTimeSecs: JsonField<Long>) = apply {
                this.waitTimeSecs = waitTimeSecs
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
             *
             * The following fields are required:
             * ```java
             * .callControlId()
             * .callLegId()
             * .callSessionId()
             * .connectionId()
             * .enqueuedAt()
             * .from()
             * .queueId()
             * .queuePosition()
             * .recordType()
             * .to()
             * .waitTimeSecs()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("callControlId", callControlId),
                    checkRequired("callLegId", callLegId),
                    checkRequired("callSessionId", callSessionId),
                    checkRequired("connectionId", connectionId),
                    checkRequired("enqueuedAt", enqueuedAt),
                    checkRequired("from", from),
                    checkRequired("queueId", queueId),
                    checkRequired("queuePosition", queuePosition),
                    checkRequired("recordType", recordType),
                    checkRequired("to", to),
                    checkRequired("waitTimeSecs", waitTimeSecs),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            callControlId()
            callLegId()
            callSessionId()
            connectionId()
            enqueuedAt()
            from()
            queueId()
            queuePosition()
            recordType().validate()
            to()
            waitTimeSecs()
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
            (if (callControlId.asKnown().isPresent) 1 else 0) +
                (if (callLegId.asKnown().isPresent) 1 else 0) +
                (if (callSessionId.asKnown().isPresent) 1 else 0) +
                (if (connectionId.asKnown().isPresent) 1 else 0) +
                (if (enqueuedAt.asKnown().isPresent) 1 else 0) +
                (if (from.asKnown().isPresent) 1 else 0) +
                (if (queueId.asKnown().isPresent) 1 else 0) +
                (if (queuePosition.asKnown().isPresent) 1 else 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (to.asKnown().isPresent) 1 else 0) +
                (if (waitTimeSecs.asKnown().isPresent) 1 else 0)

        class RecordType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val QUEUE_CALL = of("queue_call")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                QUEUE_CALL
            }

            /**
             * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RecordType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                QUEUE_CALL,
                /**
                 * An enum member indicating that [RecordType] was instantiated with an unknown
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
                    QUEUE_CALL -> Value.QUEUE_CALL
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
                    QUEUE_CALL -> Known.QUEUE_CALL
                    else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

            fun validate(): RecordType = apply {
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

                return other is RecordType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                callControlId == other.callControlId &&
                callLegId == other.callLegId &&
                callSessionId == other.callSessionId &&
                connectionId == other.connectionId &&
                enqueuedAt == other.enqueuedAt &&
                from == other.from &&
                queueId == other.queueId &&
                queuePosition == other.queuePosition &&
                recordType == other.recordType &&
                to == other.to &&
                waitTimeSecs == other.waitTimeSecs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                callControlId,
                callLegId,
                callSessionId,
                connectionId,
                enqueuedAt,
                from,
                queueId,
                queuePosition,
                recordType,
                to,
                waitTimeSecs,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{callControlId=$callControlId, callLegId=$callLegId, callSessionId=$callSessionId, connectionId=$connectionId, enqueuedAt=$enqueuedAt, from=$from, queueId=$queueId, queuePosition=$queuePosition, recordType=$recordType, to=$to, waitTimeSecs=$waitTimeSecs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
