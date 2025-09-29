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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConnectionListActiveCallsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<Meta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

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
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConnectionListActiveCallsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectionListActiveCallsResponse: ConnectionListActiveCallsResponse) =
            apply {
                data = connectionListActiveCallsResponse.data.map { it.toMutableList() }
                meta = connectionListActiveCallsResponse.meta
                additionalProperties =
                    connectionListActiveCallsResponse.additionalProperties.toMutableMap()
            }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

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
         */
        fun build(): ConnectionListActiveCallsResponse =
            ConnectionListActiveCallsResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConnectionListActiveCallsResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    class Data
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
         * session is a group of related call legs that logically belong to the same phone call,
         * e.g. an inbound and outbound leg of a transferred call
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
         * Unlike [callControlId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_control_id")
        @ExcludeMissing
        fun _callControlId(): JsonField<String> = callControlId

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
             * Returns a mutable builder for constructing an instance of [Data].
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

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var callControlId: JsonField<String>? = null
            private var callDuration: JsonField<Long>? = null
            private var callLegId: JsonField<String>? = null
            private var callSessionId: JsonField<String>? = null
            private var clientState: JsonField<String>? = null
            private var recordType: JsonField<RecordType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                callControlId = data.callControlId
                callDuration = data.callDuration
                callLegId = data.callLegId
                callSessionId = data.callSessionId
                clientState = data.clientState
                recordType = data.recordType
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

            /** Indicates the duration of the call in seconds */
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

            /** State received from a command. */
            fun clientState(clientState: String) = clientState(JsonField.of(clientState))

            /**
             * Sets [Builder.clientState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientState(clientState: JsonField<String>) = apply {
                this.clientState = clientState
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
             * .callDuration()
             * .callLegId()
             * .callSessionId()
             * .clientState()
             * .recordType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
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

        fun validate(): Data = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CALL,
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
                    CALL -> Value.CALL
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
                    CALL -> Known.CALL
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
            "Data{callControlId=$callControlId, callDuration=$callDuration, callLegId=$callLegId, callSessionId=$callSessionId, clientState=$clientState, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cursors: JsonField<Cursors>,
        private val next: JsonField<String>,
        private val previous: JsonField<String>,
        private val totalItems: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cursors") @ExcludeMissing cursors: JsonField<Cursors> = JsonMissing.of(),
            @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
            @JsonProperty("previous")
            @ExcludeMissing
            previous: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total_items")
            @ExcludeMissing
            totalItems: JsonField<Long> = JsonMissing.of(),
        ) : this(cursors, next, previous, totalItems, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cursors(): Optional<Cursors> = cursors.getOptional("cursors")

        /**
         * Path to next page.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun next(): Optional<String> = next.getOptional("next")

        /**
         * Path to previous page.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun previous(): Optional<String> = previous.getOptional("previous")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalItems(): Optional<Long> = totalItems.getOptional("total_items")

        /**
         * Returns the raw JSON value of [cursors].
         *
         * Unlike [cursors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cursors") @ExcludeMissing fun _cursors(): JsonField<Cursors> = cursors

        /**
         * Returns the raw JSON value of [next].
         *
         * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

        /**
         * Returns the raw JSON value of [previous].
         *
         * Unlike [previous], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("previous") @ExcludeMissing fun _previous(): JsonField<String> = previous

        /**
         * Returns the raw JSON value of [totalItems].
         *
         * Unlike [totalItems], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_items") @ExcludeMissing fun _totalItems(): JsonField<Long> = totalItems

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

            /** Returns a mutable builder for constructing an instance of [Meta]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var cursors: JsonField<Cursors> = JsonMissing.of()
            private var next: JsonField<String> = JsonMissing.of()
            private var previous: JsonField<String> = JsonMissing.of()
            private var totalItems: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                cursors = meta.cursors
                next = meta.next
                previous = meta.previous
                totalItems = meta.totalItems
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun cursors(cursors: Cursors) = cursors(JsonField.of(cursors))

            /**
             * Sets [Builder.cursors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cursors] with a well-typed [Cursors] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cursors(cursors: JsonField<Cursors>) = apply { this.cursors = cursors }

            /** Path to next page. */
            fun next(next: String) = next(JsonField.of(next))

            /**
             * Sets [Builder.next] to an arbitrary JSON value.
             *
             * You should usually call [Builder.next] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun next(next: JsonField<String>) = apply { this.next = next }

            /** Path to previous page. */
            fun previous(previous: String) = previous(JsonField.of(previous))

            /**
             * Sets [Builder.previous] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previous] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun previous(previous: JsonField<String>) = apply { this.previous = previous }

            fun totalItems(totalItems: Long) = totalItems(JsonField.of(totalItems))

            /**
             * Sets [Builder.totalItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalItems] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalItems(totalItems: JsonField<Long>) = apply { this.totalItems = totalItems }

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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Meta =
                Meta(cursors, next, previous, totalItems, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            cursors().ifPresent { it.validate() }
            next()
            previous()
            totalItems()
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
            (cursors.asKnown().getOrNull()?.validity() ?: 0) +
                (if (next.asKnown().isPresent) 1 else 0) +
                (if (previous.asKnown().isPresent) 1 else 0) +
                (if (totalItems.asKnown().isPresent) 1 else 0)

        class Cursors
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val after: JsonField<String>,
            private val before: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("after") @ExcludeMissing after: JsonField<String> = JsonMissing.of(),
                @JsonProperty("before") @ExcludeMissing before: JsonField<String> = JsonMissing.of(),
            ) : this(after, before, mutableMapOf())

            /**
             * Opaque identifier of next page.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun after(): Optional<String> = after.getOptional("after")

            /**
             * Opaque identifier of previous page.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun before(): Optional<String> = before.getOptional("before")

            /**
             * Returns the raw JSON value of [after].
             *
             * Unlike [after], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("after") @ExcludeMissing fun _after(): JsonField<String> = after

            /**
             * Returns the raw JSON value of [before].
             *
             * Unlike [before], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("before") @ExcludeMissing fun _before(): JsonField<String> = before

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

                /** Returns a mutable builder for constructing an instance of [Cursors]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Cursors]. */
            class Builder internal constructor() {

                private var after: JsonField<String> = JsonMissing.of()
                private var before: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cursors: Cursors) = apply {
                    after = cursors.after
                    before = cursors.before
                    additionalProperties = cursors.additionalProperties.toMutableMap()
                }

                /** Opaque identifier of next page. */
                fun after(after: String) = after(JsonField.of(after))

                /**
                 * Sets [Builder.after] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.after] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun after(after: JsonField<String>) = apply { this.after = after }

                /** Opaque identifier of previous page. */
                fun before(before: String) = before(JsonField.of(before))

                /**
                 * Sets [Builder.before] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.before] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun before(before: JsonField<String>) = apply { this.before = before }

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
                 * Returns an immutable instance of [Cursors].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Cursors = Cursors(after, before, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Cursors = apply {
                if (validated) {
                    return@apply
                }

                after()
                before()
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
                (if (after.asKnown().isPresent) 1 else 0) +
                    (if (before.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cursors &&
                    after == other.after &&
                    before == other.before &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(after, before, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Cursors{after=$after, before=$before, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                cursors == other.cursors &&
                next == other.next &&
                previous == other.previous &&
                totalItems == other.totalItems &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(cursors, next, previous, totalItems, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{cursors=$cursors, next=$next, previous=$previous, totalItems=$totalItems, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectionListActiveCallsResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConnectionListActiveCallsResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
