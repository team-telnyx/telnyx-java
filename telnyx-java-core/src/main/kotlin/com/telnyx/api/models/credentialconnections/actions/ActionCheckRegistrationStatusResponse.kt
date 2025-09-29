// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.credentialconnections.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ActionCheckRegistrationStatusResponse
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

        /**
         * Returns a mutable builder for constructing an instance of
         * [ActionCheckRegistrationStatusResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionCheckRegistrationStatusResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            actionCheckRegistrationStatusResponse: ActionCheckRegistrationStatusResponse
        ) = apply {
            data = actionCheckRegistrationStatusResponse.data
            additionalProperties =
                actionCheckRegistrationStatusResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ActionCheckRegistrationStatusResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionCheckRegistrationStatusResponse =
            ActionCheckRegistrationStatusResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ActionCheckRegistrationStatusResponse = apply {
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
        private val ipAddress: JsonField<String>,
        private val lastRegistration: JsonField<String>,
        private val port: JsonField<Long>,
        private val recordType: JsonField<String>,
        private val sipUsername: JsonField<String>,
        private val status: JsonField<Status>,
        private val transport: JsonField<String>,
        private val userAgent: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ip_address")
            @ExcludeMissing
            ipAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_registration")
            @ExcludeMissing
            lastRegistration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("port") @ExcludeMissing port: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sip_username")
            @ExcludeMissing
            sipUsername: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("transport")
            @ExcludeMissing
            transport: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_agent")
            @ExcludeMissing
            userAgent: JsonField<String> = JsonMissing.of(),
        ) : this(
            ipAddress,
            lastRegistration,
            port,
            recordType,
            sipUsername,
            status,
            transport,
            userAgent,
            mutableMapOf(),
        )

        /**
         * The ip used during the SIP connection
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ipAddress(): Optional<String> = ipAddress.getOptional("ip_address")

        /**
         * ISO 8601 formatted date indicating when the resource was last updated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastRegistration(): Optional<String> = lastRegistration.getOptional("last_registration")

        /**
         * The port of the SIP connection
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun port(): Optional<Long> = port.getOptional("port")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * The user name of the SIP connection
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipUsername(): Optional<String> = sipUsername.getOptional("sip_username")

        /**
         * The current registration status of your SIP connection
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * The protocol of the SIP connection
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transport(): Optional<String> = transport.getOptional("transport")

        /**
         * The user agent of the SIP connection
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userAgent(): Optional<String> = userAgent.getOptional("user_agent")

        /**
         * Returns the raw JSON value of [ipAddress].
         *
         * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip_address") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

        /**
         * Returns the raw JSON value of [lastRegistration].
         *
         * Unlike [lastRegistration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("last_registration")
        @ExcludeMissing
        fun _lastRegistration(): JsonField<String> = lastRegistration

        /**
         * Returns the raw JSON value of [port].
         *
         * Unlike [port], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("port") @ExcludeMissing fun _port(): JsonField<Long> = port

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [sipUsername].
         *
         * Unlike [sipUsername], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sip_username")
        @ExcludeMissing
        fun _sipUsername(): JsonField<String> = sipUsername

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [transport].
         *
         * Unlike [transport], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transport") @ExcludeMissing fun _transport(): JsonField<String> = transport

        /**
         * Returns the raw JSON value of [userAgent].
         *
         * Unlike [userAgent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_agent") @ExcludeMissing fun _userAgent(): JsonField<String> = userAgent

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var ipAddress: JsonField<String> = JsonMissing.of()
            private var lastRegistration: JsonField<String> = JsonMissing.of()
            private var port: JsonField<Long> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var sipUsername: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var transport: JsonField<String> = JsonMissing.of()
            private var userAgent: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                ipAddress = data.ipAddress
                lastRegistration = data.lastRegistration
                port = data.port
                recordType = data.recordType
                sipUsername = data.sipUsername
                status = data.status
                transport = data.transport
                userAgent = data.userAgent
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The ip used during the SIP connection */
            fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

            /**
             * Sets [Builder.ipAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

            /** ISO 8601 formatted date indicating when the resource was last updated. */
            fun lastRegistration(lastRegistration: String) =
                lastRegistration(JsonField.of(lastRegistration))

            /**
             * Sets [Builder.lastRegistration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastRegistration] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastRegistration(lastRegistration: JsonField<String>) = apply {
                this.lastRegistration = lastRegistration
            }

            /** The port of the SIP connection */
            fun port(port: Long) = port(JsonField.of(port))

            /**
             * Sets [Builder.port] to an arbitrary JSON value.
             *
             * You should usually call [Builder.port] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun port(port: JsonField<Long>) = apply { this.port = port }

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** The user name of the SIP connection */
            fun sipUsername(sipUsername: String) = sipUsername(JsonField.of(sipUsername))

            /**
             * Sets [Builder.sipUsername] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipUsername] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sipUsername(sipUsername: JsonField<String>) = apply {
                this.sipUsername = sipUsername
            }

            /** The current registration status of your SIP connection */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The protocol of the SIP connection */
            fun transport(transport: String) = transport(JsonField.of(transport))

            /**
             * Sets [Builder.transport] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transport] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transport(transport: JsonField<String>) = apply { this.transport = transport }

            /** The user agent of the SIP connection */
            fun userAgent(userAgent: String) = userAgent(JsonField.of(userAgent))

            /**
             * Sets [Builder.userAgent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userAgent] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userAgent(userAgent: JsonField<String>) = apply { this.userAgent = userAgent }

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
             */
            fun build(): Data =
                Data(
                    ipAddress,
                    lastRegistration,
                    port,
                    recordType,
                    sipUsername,
                    status,
                    transport,
                    userAgent,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            ipAddress()
            lastRegistration()
            port()
            recordType()
            sipUsername()
            status().ifPresent { it.validate() }
            transport()
            userAgent()
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
            (if (ipAddress.asKnown().isPresent) 1 else 0) +
                (if (lastRegistration.asKnown().isPresent) 1 else 0) +
                (if (port.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (sipUsername.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (transport.asKnown().isPresent) 1 else 0) +
                (if (userAgent.asKnown().isPresent) 1 else 0)

        /** The current registration status of your SIP connection */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val NOT_APPLICABLE = of("Not Applicable")

                @JvmField val NOT_REGISTERED = of("Not Registered")

                @JvmField val FAILED = of("Failed")

                @JvmField val EXPIRED = of("Expired")

                @JvmField val REGISTERED = of("Registered")

                @JvmField val UNREGISTERED = of("Unregistered")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                NOT_APPLICABLE,
                NOT_REGISTERED,
                FAILED,
                EXPIRED,
                REGISTERED,
                UNREGISTERED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NOT_APPLICABLE,
                NOT_REGISTERED,
                FAILED,
                EXPIRED,
                REGISTERED,
                UNREGISTERED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    NOT_APPLICABLE -> Value.NOT_APPLICABLE
                    NOT_REGISTERED -> Value.NOT_REGISTERED
                    FAILED -> Value.FAILED
                    EXPIRED -> Value.EXPIRED
                    REGISTERED -> Value.REGISTERED
                    UNREGISTERED -> Value.UNREGISTERED
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
                    NOT_APPLICABLE -> Known.NOT_APPLICABLE
                    NOT_REGISTERED -> Known.NOT_REGISTERED
                    FAILED -> Known.FAILED
                    EXPIRED -> Known.EXPIRED
                    REGISTERED -> Known.REGISTERED
                    UNREGISTERED -> Known.UNREGISTERED
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                ipAddress == other.ipAddress &&
                lastRegistration == other.lastRegistration &&
                port == other.port &&
                recordType == other.recordType &&
                sipUsername == other.sipUsername &&
                status == other.status &&
                transport == other.transport &&
                userAgent == other.userAgent &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                ipAddress,
                lastRegistration,
                port,
                recordType,
                sipUsername,
                status,
                transport,
                userAgent,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{ipAddress=$ipAddress, lastRegistration=$lastRegistration, port=$port, recordType=$recordType, sipUsername=$sipUsername, status=$status, transport=$transport, userAgent=$userAgent, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionCheckRegistrationStatusResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionCheckRegistrationStatusResponse{data=$data, additionalProperties=$additionalProperties}"
}
