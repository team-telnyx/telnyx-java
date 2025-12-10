// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationeventconditions

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

class NotificationEventConditionListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val allowMultipleChannels: JsonField<Boolean>,
    private val associatedRecordType: JsonField<AssociatedRecordType>,
    private val asynchronous: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val enabled: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val notificationEventId: JsonField<String>,
    private val parameters: JsonField<List<Parameter>>,
    private val supportedChannels: JsonField<List<String>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allow_multiple_channels")
        @ExcludeMissing
        allowMultipleChannels: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("associated_record_type")
        @ExcludeMissing
        associatedRecordType: JsonField<AssociatedRecordType> = JsonMissing.of(),
        @JsonProperty("asynchronous")
        @ExcludeMissing
        asynchronous: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("notification_event_id")
        @ExcludeMissing
        notificationEventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parameters")
        @ExcludeMissing
        parameters: JsonField<List<Parameter>> = JsonMissing.of(),
        @JsonProperty("supported_channels")
        @ExcludeMissing
        supportedChannels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        allowMultipleChannels,
        associatedRecordType,
        asynchronous,
        createdAt,
        description,
        enabled,
        name,
        notificationEventId,
        parameters,
        supportedChannels,
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
     * Dictates whether a notification channel id needs to be provided when creating a notficiation
     * setting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowMultipleChannels(): Optional<Boolean> =
        allowMultipleChannels.getOptional("allow_multiple_channels")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun associatedRecordType(): Optional<AssociatedRecordType> =
        associatedRecordType.getOptional("associated_record_type")

    /**
     * Dictates whether a notification setting will take effect immediately.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun asynchronous(): Optional<Boolean> = asynchronous.getOptional("asynchronous")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notificationEventId(): Optional<String> =
        notificationEventId.getOptional("notification_event_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parameters(): Optional<List<Parameter>> = parameters.getOptional("parameters")

    /**
     * Dictates the supported notification channel types that can be emitted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportedChannels(): Optional<List<String>> =
        supportedChannels.getOptional("supported_channels")

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
     * Returns the raw JSON value of [allowMultipleChannels].
     *
     * Unlike [allowMultipleChannels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allow_multiple_channels")
    @ExcludeMissing
    fun _allowMultipleChannels(): JsonField<Boolean> = allowMultipleChannels

    /**
     * Returns the raw JSON value of [associatedRecordType].
     *
     * Unlike [associatedRecordType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associated_record_type")
    @ExcludeMissing
    fun _associatedRecordType(): JsonField<AssociatedRecordType> = associatedRecordType

    /**
     * Returns the raw JSON value of [asynchronous].
     *
     * Unlike [asynchronous], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("asynchronous")
    @ExcludeMissing
    fun _asynchronous(): JsonField<Boolean> = asynchronous

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [notificationEventId].
     *
     * Unlike [notificationEventId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("notification_event_id")
    @ExcludeMissing
    fun _notificationEventId(): JsonField<String> = notificationEventId

    /**
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parameters")
    @ExcludeMissing
    fun _parameters(): JsonField<List<Parameter>> = parameters

    /**
     * Returns the raw JSON value of [supportedChannels].
     *
     * Unlike [supportedChannels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("supported_channels")
    @ExcludeMissing
    fun _supportedChannels(): JsonField<List<String>> = supportedChannels

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [NotificationEventConditionListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationEventConditionListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var allowMultipleChannels: JsonField<Boolean> = JsonMissing.of()
        private var associatedRecordType: JsonField<AssociatedRecordType> = JsonMissing.of()
        private var asynchronous: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var notificationEventId: JsonField<String> = JsonMissing.of()
        private var parameters: JsonField<MutableList<Parameter>>? = null
        private var supportedChannels: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            notificationEventConditionListResponse: NotificationEventConditionListResponse
        ) = apply {
            id = notificationEventConditionListResponse.id
            allowMultipleChannels = notificationEventConditionListResponse.allowMultipleChannels
            associatedRecordType = notificationEventConditionListResponse.associatedRecordType
            asynchronous = notificationEventConditionListResponse.asynchronous
            createdAt = notificationEventConditionListResponse.createdAt
            description = notificationEventConditionListResponse.description
            enabled = notificationEventConditionListResponse.enabled
            name = notificationEventConditionListResponse.name
            notificationEventId = notificationEventConditionListResponse.notificationEventId
            parameters =
                notificationEventConditionListResponse.parameters.map { it.toMutableList() }
            supportedChannels =
                notificationEventConditionListResponse.supportedChannels.map { it.toMutableList() }
            updatedAt = notificationEventConditionListResponse.updatedAt
            additionalProperties =
                notificationEventConditionListResponse.additionalProperties.toMutableMap()
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

        /**
         * Dictates whether a notification channel id needs to be provided when creating a
         * notficiation setting.
         */
        fun allowMultipleChannels(allowMultipleChannels: Boolean) =
            allowMultipleChannels(JsonField.of(allowMultipleChannels))

        /**
         * Sets [Builder.allowMultipleChannels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowMultipleChannels] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowMultipleChannels(allowMultipleChannels: JsonField<Boolean>) = apply {
            this.allowMultipleChannels = allowMultipleChannels
        }

        fun associatedRecordType(associatedRecordType: AssociatedRecordType) =
            associatedRecordType(JsonField.of(associatedRecordType))

        /**
         * Sets [Builder.associatedRecordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associatedRecordType] with a well-typed
         * [AssociatedRecordType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun associatedRecordType(associatedRecordType: JsonField<AssociatedRecordType>) = apply {
            this.associatedRecordType = associatedRecordType
        }

        /** Dictates whether a notification setting will take effect immediately. */
        fun asynchronous(asynchronous: Boolean) = asynchronous(JsonField.of(asynchronous))

        /**
         * Sets [Builder.asynchronous] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asynchronous] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun asynchronous(asynchronous: JsonField<Boolean>) = apply {
            this.asynchronous = asynchronous
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

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun notificationEventId(notificationEventId: String) =
            notificationEventId(JsonField.of(notificationEventId))

        /**
         * Sets [Builder.notificationEventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notificationEventId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notificationEventId(notificationEventId: JsonField<String>) = apply {
            this.notificationEventId = notificationEventId
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

        /** Dictates the supported notification channel types that can be emitted. */
        fun supportedChannels(supportedChannels: List<String>) =
            supportedChannels(JsonField.of(supportedChannels))

        /**
         * Sets [Builder.supportedChannels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedChannels] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun supportedChannels(supportedChannels: JsonField<List<String>>) = apply {
            this.supportedChannels = supportedChannels.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [supportedChannels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSupportedChannel(supportedChannel: String) = apply {
            supportedChannels =
                (supportedChannels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("supportedChannels", it).add(supportedChannel)
                }
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
         * Returns an immutable instance of [NotificationEventConditionListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NotificationEventConditionListResponse =
            NotificationEventConditionListResponse(
                id,
                allowMultipleChannels,
                associatedRecordType,
                asynchronous,
                createdAt,
                description,
                enabled,
                name,
                notificationEventId,
                (parameters ?: JsonMissing.of()).map { it.toImmutable() },
                (supportedChannels ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NotificationEventConditionListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        allowMultipleChannels()
        associatedRecordType().ifPresent { it.validate() }
        asynchronous()
        createdAt()
        description()
        enabled()
        name()
        notificationEventId()
        parameters().ifPresent { it.forEach { it.validate() } }
        supportedChannels()
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
            (if (allowMultipleChannels.asKnown().isPresent) 1 else 0) +
            (associatedRecordType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (asynchronous.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (notificationEventId.asKnown().isPresent) 1 else 0) +
            (parameters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (supportedChannels.asKnown().getOrNull()?.size ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class AssociatedRecordType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACCOUNT = of("account")

            @JvmField val PHONE_NUMBER = of("phone_number")

            @JvmStatic fun of(value: String) = AssociatedRecordType(JsonField.of(value))
        }

        /** An enum containing [AssociatedRecordType]'s known values. */
        enum class Known {
            ACCOUNT,
            PHONE_NUMBER,
        }

        /**
         * An enum containing [AssociatedRecordType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AssociatedRecordType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCOUNT,
            PHONE_NUMBER,
            /**
             * An enum member indicating that [AssociatedRecordType] was instantiated with an
             * unknown value.
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
                ACCOUNT -> Value.ACCOUNT
                PHONE_NUMBER -> Value.PHONE_NUMBER
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
                ACCOUNT -> Known.ACCOUNT
                PHONE_NUMBER -> Known.PHONE_NUMBER
                else -> throw TelnyxInvalidDataException("Unknown AssociatedRecordType: $value")
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

        fun validate(): AssociatedRecordType = apply {
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

            return other is AssociatedRecordType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Parameter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dataType: JsonField<String>,
        private val name: JsonField<String>,
        private val optional: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data_type")
            @ExcludeMissing
            dataType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("optional")
            @ExcludeMissing
            optional: JsonField<Boolean> = JsonMissing.of(),
        ) : this(dataType, name, optional, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dataType(): Optional<String> = dataType.getOptional("data_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun optional(): Optional<Boolean> = optional.getOptional("optional")

        /**
         * Returns the raw JSON value of [dataType].
         *
         * Unlike [dataType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data_type") @ExcludeMissing fun _dataType(): JsonField<String> = dataType

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [optional].
         *
         * Unlike [optional], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("optional") @ExcludeMissing fun _optional(): JsonField<Boolean> = optional

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

            private var dataType: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var optional: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parameter: Parameter) = apply {
                dataType = parameter.dataType
                name = parameter.name
                optional = parameter.optional
                additionalProperties = parameter.additionalProperties.toMutableMap()
            }

            fun dataType(dataType: String) = dataType(JsonField.of(dataType))

            /**
             * Sets [Builder.dataType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataType(dataType: JsonField<String>) = apply { this.dataType = dataType }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun optional(optional: Boolean) = optional(JsonField.of(optional))

            /**
             * Sets [Builder.optional] to an arbitrary JSON value.
             *
             * You should usually call [Builder.optional] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun optional(optional: JsonField<Boolean>) = apply { this.optional = optional }

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
            fun build(): Parameter =
                Parameter(dataType, name, optional, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Parameter = apply {
            if (validated) {
                return@apply
            }

            dataType()
            name()
            optional()
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
            (if (dataType.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (optional.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Parameter &&
                dataType == other.dataType &&
                name == other.name &&
                optional == other.optional &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(dataType, name, optional, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Parameter{dataType=$dataType, name=$name, optional=$optional, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationEventConditionListResponse &&
            id == other.id &&
            allowMultipleChannels == other.allowMultipleChannels &&
            associatedRecordType == other.associatedRecordType &&
            asynchronous == other.asynchronous &&
            createdAt == other.createdAt &&
            description == other.description &&
            enabled == other.enabled &&
            name == other.name &&
            notificationEventId == other.notificationEventId &&
            parameters == other.parameters &&
            supportedChannels == other.supportedChannels &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            allowMultipleChannels,
            associatedRecordType,
            asynchronous,
            createdAt,
            description,
            enabled,
            name,
            notificationEventId,
            parameters,
            supportedChannels,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationEventConditionListResponse{id=$id, allowMultipleChannels=$allowMultipleChannels, associatedRecordType=$associatedRecordType, asynchronous=$asynchronous, createdAt=$createdAt, description=$description, enabled=$enabled, name=$name, notificationEventId=$notificationEventId, parameters=$parameters, supportedChannels=$supportedChannels, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
