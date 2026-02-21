// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.alphanumericsenderids

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AlphanumericSenderIdListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val alphanumericSenderId: JsonField<String>,
    private val messagingProfileId: JsonField<String>,
    private val organizationId: JsonField<String>,
    private val recordType: JsonField<RecordType>,
    private val usLongCodeFallback: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alphanumeric_sender_id")
        @ExcludeMissing
        alphanumericSenderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("messaging_profile_id")
        @ExcludeMissing
        messagingProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("us_long_code_fallback")
        @ExcludeMissing
        usLongCodeFallback: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        alphanumericSenderId,
        messagingProfileId,
        organizationId,
        recordType,
        usLongCodeFallback,
        mutableMapOf(),
    )

    /**
     * Uniquely identifies the alphanumeric sender ID resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The alphanumeric sender ID string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alphanumericSenderId(): Optional<String> =
        alphanumericSenderId.getOptional("alphanumeric_sender_id")

    /**
     * The messaging profile this sender ID belongs to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingProfileId(): Optional<String> =
        messagingProfileId.getOptional("messaging_profile_id")

    /**
     * The organization that owns this sender ID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationId(): Optional<String> = organizationId.getOptional("organization_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

    /**
     * A US long code number to use as fallback when sending to US destinations.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usLongCodeFallback(): Optional<String> =
        usLongCodeFallback.getOptional("us_long_code_fallback")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [alphanumericSenderId].
     *
     * Unlike [alphanumericSenderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("alphanumeric_sender_id")
    @ExcludeMissing
    fun _alphanumericSenderId(): JsonField<String> = alphanumericSenderId

    /**
     * Returns the raw JSON value of [messagingProfileId].
     *
     * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("messaging_profile_id")
    @ExcludeMissing
    fun _messagingProfileId(): JsonField<String> = messagingProfileId

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [usLongCodeFallback].
     *
     * Unlike [usLongCodeFallback], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("us_long_code_fallback")
    @ExcludeMissing
    fun _usLongCodeFallback(): JsonField<String> = usLongCodeFallback

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
         * [AlphanumericSenderIdListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AlphanumericSenderIdListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var alphanumericSenderId: JsonField<String> = JsonMissing.of()
        private var messagingProfileId: JsonField<String> = JsonMissing.of()
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var usLongCodeFallback: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(alphanumericSenderIdListResponse: AlphanumericSenderIdListResponse) =
            apply {
                id = alphanumericSenderIdListResponse.id
                alphanumericSenderId = alphanumericSenderIdListResponse.alphanumericSenderId
                messagingProfileId = alphanumericSenderIdListResponse.messagingProfileId
                organizationId = alphanumericSenderIdListResponse.organizationId
                recordType = alphanumericSenderIdListResponse.recordType
                usLongCodeFallback = alphanumericSenderIdListResponse.usLongCodeFallback
                additionalProperties =
                    alphanumericSenderIdListResponse.additionalProperties.toMutableMap()
            }

        /** Uniquely identifies the alphanumeric sender ID resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The alphanumeric sender ID string. */
        fun alphanumericSenderId(alphanumericSenderId: String) =
            alphanumericSenderId(JsonField.of(alphanumericSenderId))

        /**
         * Sets [Builder.alphanumericSenderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alphanumericSenderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun alphanumericSenderId(alphanumericSenderId: JsonField<String>) = apply {
            this.alphanumericSenderId = alphanumericSenderId
        }

        /** The messaging profile this sender ID belongs to. */
        fun messagingProfileId(messagingProfileId: String) =
            messagingProfileId(JsonField.of(messagingProfileId))

        /**
         * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
            this.messagingProfileId = messagingProfileId
        }

        /** The organization that owns this sender ID. */
        fun organizationId(organizationId: String) = organizationId(JsonField.of(organizationId))

        /**
         * Sets [Builder.organizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationId(organizationId: JsonField<String>) = apply {
            this.organizationId = organizationId
        }

        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        /** A US long code number to use as fallback when sending to US destinations. */
        fun usLongCodeFallback(usLongCodeFallback: String) =
            usLongCodeFallback(JsonField.of(usLongCodeFallback))

        /**
         * Sets [Builder.usLongCodeFallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usLongCodeFallback] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usLongCodeFallback(usLongCodeFallback: JsonField<String>) = apply {
            this.usLongCodeFallback = usLongCodeFallback
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
         * Returns an immutable instance of [AlphanumericSenderIdListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AlphanumericSenderIdListResponse =
            AlphanumericSenderIdListResponse(
                id,
                alphanumericSenderId,
                messagingProfileId,
                organizationId,
                recordType,
                usLongCodeFallback,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AlphanumericSenderIdListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        alphanumericSenderId()
        messagingProfileId()
        organizationId()
        recordType().ifPresent { it.validate() }
        usLongCodeFallback()
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
            (if (alphanumericSenderId.asKnown().isPresent) 1 else 0) +
            (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (usLongCodeFallback.asKnown().isPresent) 1 else 0)

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

            @JvmField val ALPHANUMERIC_SENDER_ID = of("alphanumeric_sender_id")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            ALPHANUMERIC_SENDER_ID
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
            ALPHANUMERIC_SENDER_ID,
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
                ALPHANUMERIC_SENDER_ID -> Value.ALPHANUMERIC_SENDER_ID
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
                ALPHANUMERIC_SENDER_ID -> Known.ALPHANUMERIC_SENDER_ID
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

        return other is AlphanumericSenderIdListResponse &&
            id == other.id &&
            alphanumericSenderId == other.alphanumericSenderId &&
            messagingProfileId == other.messagingProfileId &&
            organizationId == other.organizationId &&
            recordType == other.recordType &&
            usLongCodeFallback == other.usLongCodeFallback &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            alphanumericSenderId,
            messagingProfileId,
            organizationId,
            recordType,
            usLongCodeFallback,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AlphanumericSenderIdListResponse{id=$id, alphanumericSenderId=$alphanumericSenderId, messagingProfileId=$messagingProfileId, organizationId=$organizationId, recordType=$recordType, usLongCodeFallback=$usLongCodeFallback, additionalProperties=$additionalProperties}"
}
