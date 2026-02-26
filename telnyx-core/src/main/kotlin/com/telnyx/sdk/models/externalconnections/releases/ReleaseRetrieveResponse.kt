// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.releases

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
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ReleaseRetrieveResponse
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

        /** Returns a mutable builder for constructing an instance of [ReleaseRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReleaseRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(releaseRetrieveResponse: ReleaseRetrieveResponse) = apply {
            data = releaseRetrieveResponse.data
            additionalProperties = releaseRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ReleaseRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReleaseRetrieveResponse =
            ReleaseRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ReleaseRetrieveResponse = apply {
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
        private val createdAt: JsonField<String>,
        private val errorMessage: JsonField<String>,
        private val status: JsonField<Status>,
        private val telephoneNumbers: JsonField<List<TnReleaseEntry>>,
        private val tenantId: JsonField<String>,
        private val ticketId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error_message")
            @ExcludeMissing
            errorMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("telephone_numbers")
            @ExcludeMissing
            telephoneNumbers: JsonField<List<TnReleaseEntry>> = JsonMissing.of(),
            @JsonProperty("tenant_id")
            @ExcludeMissing
            tenantId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ticket_id")
            @ExcludeMissing
            ticketId: JsonField<String> = JsonMissing.of(),
        ) : this(
            createdAt,
            errorMessage,
            status,
            telephoneNumbers,
            tenantId,
            ticketId,
            mutableMapOf(),
        )

        /**
         * ISO 8601 formatted date indicating when the resource was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

        /**
         * A message set if there is an error with the upload process.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

        /**
         * Represents the status of the release on Microsoft Teams.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun telephoneNumbers(): Optional<List<TnReleaseEntry>> =
            telephoneNumbers.getOptional("telephone_numbers")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

        /**
         * Uniquely identifies the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ticketId(): Optional<String> = ticketId.getOptional("ticket_id")

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [errorMessage].
         *
         * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("error_message")
        @ExcludeMissing
        fun _errorMessage(): JsonField<String> = errorMessage

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [telephoneNumbers].
         *
         * Unlike [telephoneNumbers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("telephone_numbers")
        @ExcludeMissing
        fun _telephoneNumbers(): JsonField<List<TnReleaseEntry>> = telephoneNumbers

        /**
         * Returns the raw JSON value of [tenantId].
         *
         * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

        /**
         * Returns the raw JSON value of [ticketId].
         *
         * Unlike [ticketId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ticket_id") @ExcludeMissing fun _ticketId(): JsonField<String> = ticketId

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

            private var createdAt: JsonField<String> = JsonMissing.of()
            private var errorMessage: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var telephoneNumbers: JsonField<MutableList<TnReleaseEntry>>? = null
            private var tenantId: JsonField<String> = JsonMissing.of()
            private var ticketId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                createdAt = data.createdAt
                errorMessage = data.errorMessage
                status = data.status
                telephoneNumbers = data.telephoneNumbers.map { it.toMutableList() }
                tenantId = data.tenantId
                ticketId = data.ticketId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** ISO 8601 formatted date indicating when the resource was created. */
            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            /** A message set if there is an error with the upload process. */
            fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

            /**
             * Sets [Builder.errorMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorMessage(errorMessage: JsonField<String>) = apply {
                this.errorMessage = errorMessage
            }

            /** Represents the status of the release on Microsoft Teams. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun telephoneNumbers(telephoneNumbers: List<TnReleaseEntry>) =
                telephoneNumbers(JsonField.of(telephoneNumbers))

            /**
             * Sets [Builder.telephoneNumbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.telephoneNumbers] with a well-typed
             * `List<TnReleaseEntry>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun telephoneNumbers(telephoneNumbers: JsonField<List<TnReleaseEntry>>) = apply {
                this.telephoneNumbers = telephoneNumbers.map { it.toMutableList() }
            }

            /**
             * Adds a single [TnReleaseEntry] to [telephoneNumbers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTelephoneNumber(telephoneNumber: TnReleaseEntry) = apply {
                telephoneNumbers =
                    (telephoneNumbers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("telephoneNumbers", it).add(telephoneNumber)
                    }
            }

            fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

            /**
             * Sets [Builder.tenantId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tenantId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

            /** Uniquely identifies the resource. */
            fun ticketId(ticketId: String) = ticketId(JsonField.of(ticketId))

            /**
             * Sets [Builder.ticketId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ticketId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ticketId(ticketId: JsonField<String>) = apply { this.ticketId = ticketId }

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
                    createdAt,
                    errorMessage,
                    status,
                    (telephoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                    tenantId,
                    ticketId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            createdAt()
            errorMessage()
            status().ifPresent { it.validate() }
            telephoneNumbers().ifPresent { it.forEach { it.validate() } }
            tenantId()
            ticketId()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (errorMessage.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (telephoneNumbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (tenantId.asKnown().isPresent) 1 else 0) +
                (if (ticketId.asKnown().isPresent) 1 else 0)

        /** Represents the status of the release on Microsoft Teams. */
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

                @JvmField val PENDING_UPLOAD = of("pending_upload")

                @JvmField val PENDING = of("pending")

                @JvmField val IN_PROGRESS = of("in_progress")

                @JvmField val COMPLETE = of("complete")

                @JvmField val FAILED = of("failed")

                @JvmField val EXPIRED = of("expired")

                @JvmField val UNKNOWN = of("unknown")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING_UPLOAD,
                PENDING,
                IN_PROGRESS,
                COMPLETE,
                FAILED,
                EXPIRED,
                UNKNOWN,
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
                PENDING_UPLOAD,
                PENDING,
                IN_PROGRESS,
                COMPLETE,
                FAILED,
                EXPIRED,
                UNKNOWN,
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
                    PENDING_UPLOAD -> Value.PENDING_UPLOAD
                    PENDING -> Value.PENDING
                    IN_PROGRESS -> Value.IN_PROGRESS
                    COMPLETE -> Value.COMPLETE
                    FAILED -> Value.FAILED
                    EXPIRED -> Value.EXPIRED
                    UNKNOWN -> Value.UNKNOWN
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
                    PENDING_UPLOAD -> Known.PENDING_UPLOAD
                    PENDING -> Known.PENDING
                    IN_PROGRESS -> Known.IN_PROGRESS
                    COMPLETE -> Known.COMPLETE
                    FAILED -> Known.FAILED
                    EXPIRED -> Known.EXPIRED
                    UNKNOWN -> Known.UNKNOWN
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
                createdAt == other.createdAt &&
                errorMessage == other.errorMessage &&
                status == other.status &&
                telephoneNumbers == other.telephoneNumbers &&
                tenantId == other.tenantId &&
                ticketId == other.ticketId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                createdAt,
                errorMessage,
                status,
                telephoneNumbers,
                tenantId,
                ticketId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{createdAt=$createdAt, errorMessage=$errorMessage, status=$status, telephoneNumbers=$telephoneNumbers, tenantId=$tenantId, ticketId=$ticketId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReleaseRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReleaseRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
