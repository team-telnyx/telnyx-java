// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.notificationchannels

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A Notification Channel */
class NotificationChannel
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val channelDestination: JsonField<String>,
    private val channelTypeId: JsonField<ChannelTypeId>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val notificationProfileId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channel_destination")
        @ExcludeMissing
        channelDestination: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channel_type_id")
        @ExcludeMissing
        channelTypeId: JsonField<ChannelTypeId> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("notification_profile_id")
        @ExcludeMissing
        notificationProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        channelDestination,
        channelTypeId,
        createdAt,
        notificationProfileId,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * A UUID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The destination associated with the channel type.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelDestination(): Optional<String> =
        channelDestination.getOptional("channel_destination")

    /**
     * A Channel Type ID
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelTypeId(): Optional<ChannelTypeId> = channelTypeId.getOptional("channel_type_id")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * A UUID reference to the associated Notification Profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notificationProfileId(): Optional<String> =
        notificationProfileId.getOptional("notification_profile_id")

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [channelDestination].
     *
     * Unlike [channelDestination], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("channel_destination")
    @ExcludeMissing
    fun _channelDestination(): JsonField<String> = channelDestination

    /**
     * Returns the raw JSON value of [channelTypeId].
     *
     * Unlike [channelTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel_type_id")
    @ExcludeMissing
    fun _channelTypeId(): JsonField<ChannelTypeId> = channelTypeId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [notificationProfileId].
     *
     * Unlike [notificationProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("notification_profile_id")
    @ExcludeMissing
    fun _notificationProfileId(): JsonField<String> = notificationProfileId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [NotificationChannel]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationChannel]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var channelDestination: JsonField<String> = JsonMissing.of()
        private var channelTypeId: JsonField<ChannelTypeId> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var notificationProfileId: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationChannel: NotificationChannel) = apply {
            id = notificationChannel.id
            channelDestination = notificationChannel.channelDestination
            channelTypeId = notificationChannel.channelTypeId
            createdAt = notificationChannel.createdAt
            notificationProfileId = notificationChannel.notificationProfileId
            updatedAt = notificationChannel.updatedAt
            additionalProperties = notificationChannel.additionalProperties.toMutableMap()
        }

        /** A UUID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The destination associated with the channel type. */
        fun channelDestination(channelDestination: String) =
            channelDestination(JsonField.of(channelDestination))

        /**
         * Sets [Builder.channelDestination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelDestination] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channelDestination(channelDestination: JsonField<String>) = apply {
            this.channelDestination = channelDestination
        }

        /** A Channel Type ID */
        fun channelTypeId(channelTypeId: ChannelTypeId) = channelTypeId(JsonField.of(channelTypeId))

        /**
         * Sets [Builder.channelTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelTypeId] with a well-typed [ChannelTypeId] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channelTypeId(channelTypeId: JsonField<ChannelTypeId>) = apply {
            this.channelTypeId = channelTypeId
        }

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** A UUID reference to the associated Notification Profile. */
        fun notificationProfileId(notificationProfileId: String) =
            notificationProfileId(JsonField.of(notificationProfileId))

        /**
         * Sets [Builder.notificationProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notificationProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notificationProfileId(notificationProfileId: JsonField<String>) = apply {
            this.notificationProfileId = notificationProfileId
        }

        /** ISO 8601 formatted date indicating when the resource was updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [NotificationChannel].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NotificationChannel =
            NotificationChannel(
                id,
                channelDestination,
                channelTypeId,
                createdAt,
                notificationProfileId,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NotificationChannel = apply {
        if (validated) {
            return@apply
        }

        id()
        channelDestination()
        channelTypeId().ifPresent { it.validate() }
        createdAt()
        notificationProfileId()
        updatedAt()
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
            (if (channelDestination.asKnown().isPresent) 1 else 0) +
            (channelTypeId.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (notificationProfileId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** A Channel Type ID */
    class ChannelTypeId @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SMS = of("sms")

            @JvmField val VOICE = of("voice")

            @JvmField val EMAIL = of("email")

            @JvmField val WEBHOOK = of("webhook")

            @JvmStatic fun of(value: String) = ChannelTypeId(JsonField.of(value))
        }

        /** An enum containing [ChannelTypeId]'s known values. */
        enum class Known {
            SMS,
            VOICE,
            EMAIL,
            WEBHOOK,
        }

        /**
         * An enum containing [ChannelTypeId]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ChannelTypeId] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SMS,
            VOICE,
            EMAIL,
            WEBHOOK,
            /**
             * An enum member indicating that [ChannelTypeId] was instantiated with an unknown
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
                SMS -> Value.SMS
                VOICE -> Value.VOICE
                EMAIL -> Value.EMAIL
                WEBHOOK -> Value.WEBHOOK
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
                SMS -> Known.SMS
                VOICE -> Known.VOICE
                EMAIL -> Known.EMAIL
                WEBHOOK -> Known.WEBHOOK
                else -> throw TelnyxInvalidDataException("Unknown ChannelTypeId: $value")
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

        fun validate(): ChannelTypeId = apply {
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

            return other is ChannelTypeId && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationChannel &&
            id == other.id &&
            channelDestination == other.channelDestination &&
            channelTypeId == other.channelTypeId &&
            createdAt == other.createdAt &&
            notificationProfileId == other.notificationProfileId &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            channelDestination,
            channelTypeId,
            createdAt,
            notificationProfileId,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationChannel{id=$id, channelDestination=$channelDestination, channelTypeId=$channelTypeId, createdAt=$createdAt, notificationProfileId=$notificationProfileId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
