// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.connections

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ConnectionListActiveCallsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val callControlId: JsonField<String>,
    private val callDuration: JsonField<Long>,
    private val callLegId: JsonField<String>,
    private val callSessionId: JsonField<String>,
    private val clientState: JsonField<String>,
    private val recordType: JsonField<RecordType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("call_control_id")
        @ExcludeMissing
        callControlId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_duration")
        @ExcludeMissing
        callDuration: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("call_leg_id")
        @ExcludeMissing
        callLegId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_session_id")
        @ExcludeMissing
        callSessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_state")
        @ExcludeMissing
        clientState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
    ) : this(
        callControlId,
        callDuration,
        callLegId,
        callSessionId,
        clientState,
        recordType,
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
     * Indicates the duration of the call in seconds
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callDuration(): Long = callDuration.getRequired("call_duration")

    /**
     * ID that is unique to the call and can be used to correlate webhook events
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callLegId(): String = callLegId.getRequired("call_leg_id")

    /**
     * ID that is unique to the call session and can be used to correlate webhook events. Call
     * session is a group of related call legs that logically belong to the same phone call, e.g. an
     * inbound and outbound leg of a transferred call
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callSessionId(): String = callSessionId.getRequired("call_session_id")

    /**
     * State received from a command.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientState(): String = clientState.getRequired("client_state")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordType(): RecordType = recordType.getRequired("record_type")

    /**
     * Returns the raw JSON value of [callControlId].
     *
     * Unlike [callControlId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_control_id")
    @ExcludeMissing
    fun _callControlId(): JsonField<String> = callControlId

    /**
     * Returns the raw JSON value of [callDuration].
     *
     * Unlike [callDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_duration")
    @ExcludeMissing
    fun _callDuration(): JsonField<Long> = callDuration

    /**
     * Returns the raw JSON value of [callLegId].
     *
     * Unlike [callLegId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_leg_id") @ExcludeMissing fun _callLegId(): JsonField<String> = callLegId

    /**
     * Returns the raw JSON value of [callSessionId].
     *
     * Unlike [callSessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_session_id")
    @ExcludeMissing
    fun _callSessionId(): JsonField<String> = callSessionId

    /**
     * Returns the raw JSON value of [clientState].
     *
     * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_state")
    @ExcludeMissing
    fun _clientState(): JsonField<String> = clientState

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

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
         * [ConnectionListActiveCallsResponse].
         *
         * The following fields are required:
         * ```java
         * .callControlId()
         * .callDuration()
         * .callLegId()
         * .callSessionId()
         * .clientState()
         * .recordType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConnectionListActiveCallsResponse]. */
    class Builder internal constructor() {

        private var callControlId: JsonField<String>? = null
        private var callDuration: JsonField<Long>? = null
        private var callLegId: JsonField<String>? = null
        private var callSessionId: JsonField<String>? = null
        private var clientState: JsonField<String>? = null
        private var recordType: JsonField<RecordType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectionListActiveCallsResponse: ConnectionListActiveCallsResponse) =
            apply {
                callControlId = connectionListActiveCallsResponse.callControlId
                callDuration = connectionListActiveCallsResponse.callDuration
                callLegId = connectionListActiveCallsResponse.callLegId
                callSessionId = connectionListActiveCallsResponse.callSessionId
                clientState = connectionListActiveCallsResponse.clientState
                recordType = connectionListActiveCallsResponse.recordType
                additionalProperties =
                    connectionListActiveCallsResponse.additionalProperties.toMutableMap()
            }

        /** Unique identifier and token for controlling the call. */
        fun callControlId(callControlId: String) = callControlId(JsonField.of(callControlId))

        /**
         * Sets [Builder.callControlId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callControlId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callControlId(callControlId: JsonField<String>) = apply {
            this.callControlId = callControlId
        }

        /** Indicates the duration of the call in seconds */
        fun callDuration(callDuration: Long) = callDuration(JsonField.of(callDuration))

        /**
         * Sets [Builder.callDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callDuration] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callDuration(callDuration: JsonField<Long>) = apply { this.callDuration = callDuration }

        /** ID that is unique to the call and can be used to correlate webhook events */
        fun callLegId(callLegId: String) = callLegId(JsonField.of(callLegId))

        /**
         * Sets [Builder.callLegId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callLegId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callLegId(callLegId: JsonField<String>) = apply { this.callLegId = callLegId }

        /**
         * ID that is unique to the call session and can be used to correlate webhook events. Call
         * session is a group of related call legs that logically belong to the same phone call,
         * e.g. an inbound and outbound leg of a transferred call
         */
        fun callSessionId(callSessionId: String) = callSessionId(JsonField.of(callSessionId))

        /**
         * Sets [Builder.callSessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callSessionId(callSessionId: JsonField<String>) = apply {
            this.callSessionId = callSessionId
        }

        /** State received from a command. */
        fun clientState(clientState: String) = clientState(JsonField.of(clientState))

        /**
         * Sets [Builder.clientState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientState(clientState: JsonField<String>) = apply { this.clientState = clientState }

        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

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
         * Returns an immutable instance of [ConnectionListActiveCallsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .callControlId()
         * .callDuration()
         * .callLegId()
         * .callSessionId()
         * .clientState()
         * .recordType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConnectionListActiveCallsResponse =
            ConnectionListActiveCallsResponse(
                checkRequired("callControlId", callControlId),
                checkRequired("callDuration", callDuration),
                checkRequired("callLegId", callLegId),
                checkRequired("callSessionId", callSessionId),
                checkRequired("clientState", clientState),
                checkRequired("recordType", recordType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConnectionListActiveCallsResponse = apply {
        if (validated) {
            return@apply
        }

        callControlId()
        callDuration()
        callLegId()
        callSessionId()
        clientState()
        recordType().validate()
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
        (if (callControlId.asKnown().isPresent) 1 else 0) +
            (if (callDuration.asKnown().isPresent) 1 else 0) +
            (if (callLegId.asKnown().isPresent) 1 else 0) +
            (if (callSessionId.asKnown().isPresent) 1 else 0) +
            (if (clientState.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0)

    class RecordType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CALL = of("call")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            CALL
        }

        /**
         * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CALL,
            /**
             * An enum member indicating that [RecordType] was instantiated with an unknown value.
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
                CALL -> Value.CALL
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
                CALL -> Known.CALL
                else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

        return other is ConnectionListActiveCallsResponse &&
            callControlId == other.callControlId &&
            callDuration == other.callDuration &&
            callLegId == other.callLegId &&
            callSessionId == other.callSessionId &&
            clientState == other.clientState &&
            recordType == other.recordType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            callControlId,
            callDuration,
            callLegId,
            callSessionId,
            clientState,
            recordType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConnectionListActiveCallsResponse{callControlId=$callControlId, callDuration=$callDuration, callLegId=$callLegId, callSessionId=$callSessionId, clientState=$clientState, recordType=$recordType, additionalProperties=$additionalProperties}"
}
