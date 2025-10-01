// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationsettings

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NotificationSetting
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val associatedRecordType: JsonField<String>,
    private val associatedRecordTypeValue: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val notificationChannelId: JsonField<String>,
    private val notificationEventConditionId: JsonField<String>,
    private val notificationProfileId: JsonField<String>,
    private val parameters: JsonField<List<Parameter>>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("associated_record_type")
        @ExcludeMissing
        associatedRecordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("associated_record_type_value")
        @ExcludeMissing
        associatedRecordTypeValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("notification_channel_id")
        @ExcludeMissing
        notificationChannelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("notification_event_condition_id")
        @ExcludeMissing
        notificationEventConditionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("notification_profile_id")
        @ExcludeMissing
        notificationProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parameters")
        @ExcludeMissing
        parameters: JsonField<List<Parameter>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        associatedRecordType,
        associatedRecordTypeValue,
        createdAt,
        notificationChannelId,
        notificationEventConditionId,
        notificationProfileId,
        parameters,
        status,
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun associatedRecordType(): Optional<String> =
        associatedRecordType.getOptional("associated_record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun associatedRecordTypeValue(): Optional<String> =
        associatedRecordTypeValue.getOptional("associated_record_type_value")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * A UUID reference to the associated Notification Channel.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notificationChannelId(): Optional<String> =
        notificationChannelId.getOptional("notification_channel_id")

    /**
     * A UUID reference to the associated Notification Event Condition.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notificationEventConditionId(): Optional<String> =
        notificationEventConditionId.getOptional("notification_event_condition_id")

    /**
     * A UUID reference to the associated Notification Profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notificationProfileId(): Optional<String> =
        notificationProfileId.getOptional("notification_profile_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parameters(): Optional<List<Parameter>> = parameters.getOptional("parameters")

    /**
     * Most preferences apply immediately; however, other may needs to propagate.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

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
     * Returns the raw JSON value of [associatedRecordType].
     *
     * Unlike [associatedRecordType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associated_record_type")
    @ExcludeMissing
    fun _associatedRecordType(): JsonField<String> = associatedRecordType

    /**
     * Returns the raw JSON value of [associatedRecordTypeValue].
     *
     * Unlike [associatedRecordTypeValue], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("associated_record_type_value")
    @ExcludeMissing
    fun _associatedRecordTypeValue(): JsonField<String> = associatedRecordTypeValue

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [notificationChannelId].
     *
     * Unlike [notificationChannelId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("notification_channel_id")
    @ExcludeMissing
    fun _notificationChannelId(): JsonField<String> = notificationChannelId

    /**
     * Returns the raw JSON value of [notificationEventConditionId].
     *
     * Unlike [notificationEventConditionId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("notification_event_condition_id")
    @ExcludeMissing
    fun _notificationEventConditionId(): JsonField<String> = notificationEventConditionId

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
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parameters")
    @ExcludeMissing
    fun _parameters(): JsonField<List<Parameter>> = parameters

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        /** Returns a mutable builder for constructing an instance of [NotificationSetting]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationSetting]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var associatedRecordType: JsonField<String> = JsonMissing.of()
        private var associatedRecordTypeValue: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var notificationChannelId: JsonField<String> = JsonMissing.of()
        private var notificationEventConditionId: JsonField<String> = JsonMissing.of()
        private var notificationProfileId: JsonField<String> = JsonMissing.of()
        private var parameters: JsonField<MutableList<Parameter>>? = null
        private var status: JsonField<Status> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationSetting: NotificationSetting) = apply {
            id = notificationSetting.id
            associatedRecordType = notificationSetting.associatedRecordType
            associatedRecordTypeValue = notificationSetting.associatedRecordTypeValue
            createdAt = notificationSetting.createdAt
            notificationChannelId = notificationSetting.notificationChannelId
            notificationEventConditionId = notificationSetting.notificationEventConditionId
            notificationProfileId = notificationSetting.notificationProfileId
            parameters = notificationSetting.parameters.map { it.toMutableList() }
            status = notificationSetting.status
            updatedAt = notificationSetting.updatedAt
            additionalProperties = notificationSetting.additionalProperties.toMutableMap()
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

        fun associatedRecordType(associatedRecordType: String) =
            associatedRecordType(JsonField.of(associatedRecordType))

        /**
         * Sets [Builder.associatedRecordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associatedRecordType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun associatedRecordType(associatedRecordType: JsonField<String>) = apply {
            this.associatedRecordType = associatedRecordType
        }

        fun associatedRecordTypeValue(associatedRecordTypeValue: String) =
            associatedRecordTypeValue(JsonField.of(associatedRecordTypeValue))

        /**
         * Sets [Builder.associatedRecordTypeValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associatedRecordTypeValue] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun associatedRecordTypeValue(associatedRecordTypeValue: JsonField<String>) = apply {
            this.associatedRecordTypeValue = associatedRecordTypeValue
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

        /** A UUID reference to the associated Notification Channel. */
        fun notificationChannelId(notificationChannelId: String) =
            notificationChannelId(JsonField.of(notificationChannelId))

        /**
         * Sets [Builder.notificationChannelId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notificationChannelId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notificationChannelId(notificationChannelId: JsonField<String>) = apply {
            this.notificationChannelId = notificationChannelId
        }

        /** A UUID reference to the associated Notification Event Condition. */
        fun notificationEventConditionId(notificationEventConditionId: String) =
            notificationEventConditionId(JsonField.of(notificationEventConditionId))

        /**
         * Sets [Builder.notificationEventConditionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notificationEventConditionId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun notificationEventConditionId(notificationEventConditionId: JsonField<String>) = apply {
            this.notificationEventConditionId = notificationEventConditionId
        }

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

        fun parameters(parameters: List<Parameter>) = parameters(JsonField.of(parameters))

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed `List<Parameter>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parameters(parameters: JsonField<List<Parameter>>) = apply {
            this.parameters = parameters.map { it.toMutableList() }
        }

        /**
         * Adds a single [Parameter] to [parameters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParameter(parameter: Parameter) = apply {
            parameters =
                (parameters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("parameters", it).add(parameter)
                }
        }

        /** Most preferences apply immediately; however, other may needs to propagate. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [NotificationSetting].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NotificationSetting =
            NotificationSetting(
                id,
                associatedRecordType,
                associatedRecordTypeValue,
                createdAt,
                notificationChannelId,
                notificationEventConditionId,
                notificationProfileId,
                (parameters ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NotificationSetting = apply {
        if (validated) {
            return@apply
        }

        id()
        associatedRecordType()
        associatedRecordTypeValue()
        createdAt()
        notificationChannelId()
        notificationEventConditionId()
        notificationProfileId()
        parameters().ifPresent { it.forEach { it.validate() } }
        status().ifPresent { it.validate() }
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
            (if (associatedRecordType.asKnown().isPresent) 1 else 0) +
            (if (associatedRecordTypeValue.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (notificationChannelId.asKnown().isPresent) 1 else 0) +
            (if (notificationEventConditionId.asKnown().isPresent) 1 else 0) +
            (if (notificationProfileId.asKnown().isPresent) 1 else 0) +
            (parameters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class Parameter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(name, value, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun value(): Optional<String> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

            /** Returns a mutable builder for constructing an instance of [Parameter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Parameter]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parameter: Parameter) = apply {
                name = parameter.name
                value = parameter.value
                additionalProperties = parameter.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [Parameter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Parameter = Parameter(name, value, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Parameter = apply {
            if (validated) {
                return@apply
            }

            name()
            value()
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
            (if (name.asKnown().isPresent) 1 else 0) + (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Parameter &&
                name == other.name &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Parameter{name=$name, value=$value, additionalProperties=$additionalProperties}"
    }

    /** Most preferences apply immediately; however, other may needs to propagate. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ENABLED = of("enabled")

            @JvmField val ENABLE_RECEIVED = of("enable-received")

            @JvmField val ENABLE_PENDING = of("enable-pending")

            @JvmField val ENABLE_SUBMTITED = of("enable-submtited")

            @JvmField val DELETE_RECEIVED = of("delete-received")

            @JvmField val DELETE_PENDING = of("delete-pending")

            @JvmField val DELETE_SUBMITTED = of("delete-submitted")

            @JvmField val DELETED = of("deleted")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ENABLED,
            ENABLE_RECEIVED,
            ENABLE_PENDING,
            ENABLE_SUBMTITED,
            DELETE_RECEIVED,
            DELETE_PENDING,
            DELETE_SUBMITTED,
            DELETED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENABLED,
            ENABLE_RECEIVED,
            ENABLE_PENDING,
            ENABLE_SUBMTITED,
            DELETE_RECEIVED,
            DELETE_PENDING,
            DELETE_SUBMITTED,
            DELETED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ENABLED -> Value.ENABLED
                ENABLE_RECEIVED -> Value.ENABLE_RECEIVED
                ENABLE_PENDING -> Value.ENABLE_PENDING
                ENABLE_SUBMTITED -> Value.ENABLE_SUBMTITED
                DELETE_RECEIVED -> Value.DELETE_RECEIVED
                DELETE_PENDING -> Value.DELETE_PENDING
                DELETE_SUBMITTED -> Value.DELETE_SUBMITTED
                DELETED -> Value.DELETED
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
                ENABLED -> Known.ENABLED
                ENABLE_RECEIVED -> Known.ENABLE_RECEIVED
                ENABLE_PENDING -> Known.ENABLE_PENDING
                ENABLE_SUBMTITED -> Known.ENABLE_SUBMTITED
                DELETE_RECEIVED -> Known.DELETE_RECEIVED
                DELETE_PENDING -> Known.DELETE_PENDING
                DELETE_SUBMITTED -> Known.DELETE_SUBMITTED
                DELETED -> Known.DELETED
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        return other is NotificationSetting &&
            id == other.id &&
            associatedRecordType == other.associatedRecordType &&
            associatedRecordTypeValue == other.associatedRecordTypeValue &&
            createdAt == other.createdAt &&
            notificationChannelId == other.notificationChannelId &&
            notificationEventConditionId == other.notificationEventConditionId &&
            notificationProfileId == other.notificationProfileId &&
            parameters == other.parameters &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            associatedRecordType,
            associatedRecordTypeValue,
            createdAt,
            notificationChannelId,
            notificationEventConditionId,
            notificationProfileId,
            parameters,
            status,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationSetting{id=$id, associatedRecordType=$associatedRecordType, associatedRecordTypeValue=$associatedRecordTypeValue, createdAt=$createdAt, notificationChannelId=$notificationChannelId, notificationEventConditionId=$notificationEventConditionId, notificationProfileId=$notificationProfileId, parameters=$parameters, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
