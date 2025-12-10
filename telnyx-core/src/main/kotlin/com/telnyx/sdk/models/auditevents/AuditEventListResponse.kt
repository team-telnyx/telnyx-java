// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.auditevents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AuditEventListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val alternateResourceId: JsonField<String>,
    private val changeMadeBy: JsonField<ChangeMadeBy>,
    private val changeType: JsonField<String>,
    private val changes: JsonField<List<Change>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val organizationId: JsonField<String>,
    private val recordType: JsonField<String>,
    private val resourceId: JsonField<String>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alternate_resource_id")
        @ExcludeMissing
        alternateResourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("change_made_by")
        @ExcludeMissing
        changeMadeBy: JsonField<ChangeMadeBy> = JsonMissing.of(),
        @JsonProperty("change_type")
        @ExcludeMissing
        changeType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("changes")
        @ExcludeMissing
        changes: JsonField<List<Change>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resource_id")
        @ExcludeMissing
        resourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        alternateResourceId,
        changeMadeBy,
        changeType,
        changes,
        createdAt,
        organizationId,
        recordType,
        resourceId,
        userId,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the audit log entry.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * An alternate identifier for a resource which may be considered unique enough to identify the
     * resource but is not the primary identifier for the resource. For example, this field could be
     * used to store the phone number value for a phone number when the primary database identifier
     * is a separate distinct value.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alternateResourceId(): Optional<String> =
        alternateResourceId.getOptional("alternate_resource_id")

    /**
     * Indicates if the change was made by Telnyx on your behalf, the organization owner, a member
     * of your organization, or in the case of managed accounts, the account manager.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun changeMadeBy(): Optional<ChangeMadeBy> = changeMadeBy.getOptional("change_made_by")

    /**
     * The type of change that occurred.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun changeType(): Optional<String> = changeType.getOptional("change_type")

    /**
     * Details of the changes made to the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun changes(): Optional<List<Change>> = changes.getOptional("changes")

    /**
     * ISO 8601 formatted date indicating when the change occurred.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Unique identifier for the organization that owns the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationId(): Optional<String> = organizationId.getOptional("organization_id")

    /**
     * The type of the resource being audited.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * Unique identifier for the resource that was changed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourceId(): Optional<String> = resourceId.getOptional("resource_id")

    /**
     * Unique identifier for the user who made the change.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [alternateResourceId].
     *
     * Unlike [alternateResourceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("alternate_resource_id")
    @ExcludeMissing
    fun _alternateResourceId(): JsonField<String> = alternateResourceId

    /**
     * Returns the raw JSON value of [changeMadeBy].
     *
     * Unlike [changeMadeBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("change_made_by")
    @ExcludeMissing
    fun _changeMadeBy(): JsonField<ChangeMadeBy> = changeMadeBy

    /**
     * Returns the raw JSON value of [changeType].
     *
     * Unlike [changeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("change_type") @ExcludeMissing fun _changeType(): JsonField<String> = changeType

    /**
     * Returns the raw JSON value of [changes].
     *
     * Unlike [changes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("changes") @ExcludeMissing fun _changes(): JsonField<List<Change>> = changes

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [resourceId].
     *
     * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_id") @ExcludeMissing fun _resourceId(): JsonField<String> = resourceId

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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

        /** Returns a mutable builder for constructing an instance of [AuditEventListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuditEventListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var alternateResourceId: JsonField<String> = JsonMissing.of()
        private var changeMadeBy: JsonField<ChangeMadeBy> = JsonMissing.of()
        private var changeType: JsonField<String> = JsonMissing.of()
        private var changes: JsonField<MutableList<Change>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var resourceId: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(auditEventListResponse: AuditEventListResponse) = apply {
            id = auditEventListResponse.id
            alternateResourceId = auditEventListResponse.alternateResourceId
            changeMadeBy = auditEventListResponse.changeMadeBy
            changeType = auditEventListResponse.changeType
            changes = auditEventListResponse.changes.map { it.toMutableList() }
            createdAt = auditEventListResponse.createdAt
            organizationId = auditEventListResponse.organizationId
            recordType = auditEventListResponse.recordType
            resourceId = auditEventListResponse.resourceId
            userId = auditEventListResponse.userId
            additionalProperties = auditEventListResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the audit log entry. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * An alternate identifier for a resource which may be considered unique enough to identify
         * the resource but is not the primary identifier for the resource. For example, this field
         * could be used to store the phone number value for a phone number when the primary
         * database identifier is a separate distinct value.
         */
        fun alternateResourceId(alternateResourceId: String?) =
            alternateResourceId(JsonField.ofNullable(alternateResourceId))

        /**
         * Alias for calling [Builder.alternateResourceId] with `alternateResourceId.orElse(null)`.
         */
        fun alternateResourceId(alternateResourceId: Optional<String>) =
            alternateResourceId(alternateResourceId.getOrNull())

        /**
         * Sets [Builder.alternateResourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alternateResourceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun alternateResourceId(alternateResourceId: JsonField<String>) = apply {
            this.alternateResourceId = alternateResourceId
        }

        /**
         * Indicates if the change was made by Telnyx on your behalf, the organization owner, a
         * member of your organization, or in the case of managed accounts, the account manager.
         */
        fun changeMadeBy(changeMadeBy: ChangeMadeBy) = changeMadeBy(JsonField.of(changeMadeBy))

        /**
         * Sets [Builder.changeMadeBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changeMadeBy] with a well-typed [ChangeMadeBy] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun changeMadeBy(changeMadeBy: JsonField<ChangeMadeBy>) = apply {
            this.changeMadeBy = changeMadeBy
        }

        /** The type of change that occurred. */
        fun changeType(changeType: String) = changeType(JsonField.of(changeType))

        /**
         * Sets [Builder.changeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changeType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun changeType(changeType: JsonField<String>) = apply { this.changeType = changeType }

        /** Details of the changes made to the resource. */
        fun changes(changes: List<Change>?) = changes(JsonField.ofNullable(changes))

        /** Alias for calling [Builder.changes] with `changes.orElse(null)`. */
        fun changes(changes: Optional<List<Change>>) = changes(changes.getOrNull())

        /**
         * Sets [Builder.changes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changes] with a well-typed `List<Change>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun changes(changes: JsonField<List<Change>>) = apply {
            this.changes = changes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Change] to [changes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChange(change: Change) = apply {
            changes =
                (changes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("changes", it).add(change)
                }
        }

        /** ISO 8601 formatted date indicating when the change occurred. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Unique identifier for the organization that owns the resource. */
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

        /** The type of the resource being audited. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** Unique identifier for the resource that was changed. */
        fun resourceId(resourceId: String) = resourceId(JsonField.of(resourceId))

        /**
         * Sets [Builder.resourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

        /** Unique identifier for the user who made the change. */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
         * Returns an immutable instance of [AuditEventListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuditEventListResponse =
            AuditEventListResponse(
                id,
                alternateResourceId,
                changeMadeBy,
                changeType,
                (changes ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                organizationId,
                recordType,
                resourceId,
                userId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AuditEventListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        alternateResourceId()
        changeMadeBy().ifPresent { it.validate() }
        changeType()
        changes().ifPresent { it.forEach { it.validate() } }
        createdAt()
        organizationId()
        recordType()
        resourceId()
        userId()
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
            (if (alternateResourceId.asKnown().isPresent) 1 else 0) +
            (changeMadeBy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (changeType.asKnown().isPresent) 1 else 0) +
            (changes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (resourceId.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    /**
     * Indicates if the change was made by Telnyx on your behalf, the organization owner, a member
     * of your organization, or in the case of managed accounts, the account manager.
     */
    class ChangeMadeBy @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TELNYX = of("telnyx")

            @JvmField val ACCOUNT_MANAGER = of("account_manager")

            @JvmField val ACCOUNT_OWNER = of("account_owner")

            @JvmField val ORGANIZATION_MEMBER = of("organization_member")

            @JvmStatic fun of(value: String) = ChangeMadeBy(JsonField.of(value))
        }

        /** An enum containing [ChangeMadeBy]'s known values. */
        enum class Known {
            TELNYX,
            ACCOUNT_MANAGER,
            ACCOUNT_OWNER,
            ORGANIZATION_MEMBER,
        }

        /**
         * An enum containing [ChangeMadeBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ChangeMadeBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TELNYX,
            ACCOUNT_MANAGER,
            ACCOUNT_OWNER,
            ORGANIZATION_MEMBER,
            /**
             * An enum member indicating that [ChangeMadeBy] was instantiated with an unknown value.
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
                TELNYX -> Value.TELNYX
                ACCOUNT_MANAGER -> Value.ACCOUNT_MANAGER
                ACCOUNT_OWNER -> Value.ACCOUNT_OWNER
                ORGANIZATION_MEMBER -> Value.ORGANIZATION_MEMBER
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
                TELNYX -> Known.TELNYX
                ACCOUNT_MANAGER -> Known.ACCOUNT_MANAGER
                ACCOUNT_OWNER -> Known.ACCOUNT_OWNER
                ORGANIZATION_MEMBER -> Known.ORGANIZATION_MEMBER
                else -> throw TelnyxInvalidDataException("Unknown ChangeMadeBy: $value")
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

        fun validate(): ChangeMadeBy = apply {
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

            return other is ChangeMadeBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Details of the changes made to a resource. */
    class Change
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val field: JsonField<String>,
        private val from: JsonField<From>,
        private val to: JsonField<To>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("field") @ExcludeMissing field: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from") @ExcludeMissing from: JsonField<From> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<To> = JsonMissing.of(),
        ) : this(field, from, to, mutableMapOf())

        /**
         * The name of the field that was changed. May use the dot notation to indicate nested
         * fields.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun field(): Optional<String> = field.getOptional("field")

        /**
         * The previous value of the field. Can be any JSON type.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun from(): Optional<From> = from.getOptional("from")

        /**
         * The new value of the field. Can be any JSON type.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun to(): Optional<To> = to.getOptional("to")

        /**
         * Returns the raw JSON value of [field].
         *
         * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<From> = from

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<To> = to

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

            /** Returns a mutable builder for constructing an instance of [Change]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Change]. */
        class Builder internal constructor() {

            private var field: JsonField<String> = JsonMissing.of()
            private var from: JsonField<From> = JsonMissing.of()
            private var to: JsonField<To> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(change: Change) = apply {
                field = change.field
                from = change.from
                to = change.to
                additionalProperties = change.additionalProperties.toMutableMap()
            }

            /**
             * The name of the field that was changed. May use the dot notation to indicate nested
             * fields.
             */
            fun field(field: String) = field(JsonField.of(field))

            /**
             * Sets [Builder.field] to an arbitrary JSON value.
             *
             * You should usually call [Builder.field] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun field(field: JsonField<String>) = apply { this.field = field }

            /** The previous value of the field. Can be any JSON type. */
            fun from(from: From?) = from(JsonField.ofNullable(from))

            /** Alias for calling [Builder.from] with `from.orElse(null)`. */
            fun from(from: Optional<From>) = from(from.getOrNull())

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [From] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<From>) = apply { this.from = from }

            /** Alias for calling [from] with `From.ofString(string)`. */
            fun from(string: String) = from(From.ofString(string))

            /** Alias for calling [from] with `From.ofNumber(number)`. */
            fun from(number: Double) = from(From.ofNumber(number))

            /** Alias for calling [from] with `From.ofBool(bool)`. */
            fun from(bool: Boolean) = from(From.ofBool(bool))

            /** Alias for calling [from] with `From.ofChangesObject(changesObject)`. */
            fun from(changesObject: From.ChangesObject) = from(From.ofChangesObject(changesObject))

            /** Alias for calling [from] with `From.ofChangesLists(changesLists)`. */
            fun fromOfChangesLists(changesLists: List<From.ChangesList>) =
                from(From.ofChangesLists(changesLists))

            /** The new value of the field. Can be any JSON type. */
            fun to(to: To?) = to(JsonField.ofNullable(to))

            /** Alias for calling [Builder.to] with `to.orElse(null)`. */
            fun to(to: Optional<To>) = to(to.getOrNull())

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [To] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<To>) = apply { this.to = to }

            /** Alias for calling [to] with `To.ofString(string)`. */
            fun to(string: String) = to(To.ofString(string))

            /** Alias for calling [to] with `To.ofNumber(number)`. */
            fun to(number: Double) = to(To.ofNumber(number))

            /** Alias for calling [to] with `To.ofBool(bool)`. */
            fun to(bool: Boolean) = to(To.ofBool(bool))

            /** Alias for calling [to] with `To.ofChangesObject(changesObject)`. */
            fun to(changesObject: To.ChangesObject) = to(To.ofChangesObject(changesObject))

            /** Alias for calling [to] with `To.ofChangesLists(changesLists)`. */
            fun toOfChangesLists(changesLists: List<To.ChangesList>) =
                to(To.ofChangesLists(changesLists))

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
             * Returns an immutable instance of [Change].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Change = Change(field, from, to, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Change = apply {
            if (validated) {
                return@apply
            }

            field()
            from().ifPresent { it.validate() }
            to().ifPresent { it.validate() }
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
            (if (field.asKnown().isPresent) 1 else 0) +
                (from.asKnown().getOrNull()?.validity() ?: 0) +
                (to.asKnown().getOrNull()?.validity() ?: 0)

        /** The previous value of the field. Can be any JSON type. */
        @JsonDeserialize(using = From.Deserializer::class)
        @JsonSerialize(using = From.Serializer::class)
        class From
        private constructor(
            private val string: String? = null,
            private val number: Double? = null,
            private val bool: Boolean? = null,
            private val changesObject: ChangesObject? = null,
            private val changesLists: List<ChangesList>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun number(): Optional<Double> = Optional.ofNullable(number)

            fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

            fun changesObject(): Optional<ChangesObject> = Optional.ofNullable(changesObject)

            fun changesLists(): Optional<List<ChangesList>> = Optional.ofNullable(changesLists)

            fun isString(): Boolean = string != null

            fun isNumber(): Boolean = number != null

            fun isBool(): Boolean = bool != null

            fun isChangesObject(): Boolean = changesObject != null

            fun isChangesLists(): Boolean = changesLists != null

            fun asString(): String = string.getOrThrow("string")

            fun asNumber(): Double = number.getOrThrow("number")

            fun asBool(): Boolean = bool.getOrThrow("bool")

            fun asChangesObject(): ChangesObject = changesObject.getOrThrow("changesObject")

            fun asChangesLists(): List<ChangesList> = changesLists.getOrThrow("changesLists")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    number != null -> visitor.visitNumber(number)
                    bool != null -> visitor.visitBool(bool)
                    changesObject != null -> visitor.visitChangesObject(changesObject)
                    changesLists != null -> visitor.visitChangesLists(changesLists)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): From = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitNumber(number: Double) {}

                        override fun visitBool(bool: Boolean) {}

                        override fun visitChangesObject(changesObject: ChangesObject) {
                            changesObject.validate()
                        }

                        override fun visitChangesLists(changesLists: List<ChangesList>) {
                            changesLists.forEach { it.validate() }
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitNumber(number: Double) = 1

                        override fun visitBool(bool: Boolean) = 1

                        override fun visitChangesObject(changesObject: ChangesObject) =
                            changesObject.validity()

                        override fun visitChangesLists(changesLists: List<ChangesList>) =
                            changesLists.sumOf { it.validity().toInt() }

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is From &&
                    string == other.string &&
                    number == other.number &&
                    bool == other.bool &&
                    changesObject == other.changesObject &&
                    changesLists == other.changesLists
            }

            override fun hashCode(): Int =
                Objects.hash(string, number, bool, changesObject, changesLists)

            override fun toString(): String =
                when {
                    string != null -> "From{string=$string}"
                    number != null -> "From{number=$number}"
                    bool != null -> "From{bool=$bool}"
                    changesObject != null -> "From{changesObject=$changesObject}"
                    changesLists != null -> "From{changesLists=$changesLists}"
                    _json != null -> "From{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid From")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = From(string = string)

                @JvmStatic fun ofNumber(number: Double) = From(number = number)

                @JvmStatic fun ofBool(bool: Boolean) = From(bool = bool)

                @JvmStatic
                fun ofChangesObject(changesObject: ChangesObject) =
                    From(changesObject = changesObject)

                @JvmStatic
                fun ofChangesLists(changesLists: List<ChangesList>) =
                    From(changesLists = changesLists.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [From] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitNumber(number: Double): T

                fun visitBool(bool: Boolean): T

                fun visitChangesObject(changesObject: ChangesObject): T

                fun visitChangesLists(changesLists: List<ChangesList>): T

                /**
                 * Maps an unknown variant of [From] to a value of type [T].
                 *
                 * An instance of [From] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown From: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<From>(From::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): From {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<ChangesObject>())?.let {
                                    From(changesObject = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    From(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    From(number = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                    From(bool = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<ChangesList>>())?.let {
                                    From(changesLists = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants.
                        0 -> From(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<From>(From::class) {

                override fun serialize(
                    value: From,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.number != null -> generator.writeObject(value.number)
                        value.bool != null -> generator.writeObject(value.bool)
                        value.changesObject != null -> generator.writeObject(value.changesObject)
                        value.changesLists != null -> generator.writeObject(value.changesLists)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid From")
                    }
                }
            }

            class ChangesObject
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

                    /**
                     * Returns a mutable builder for constructing an instance of [ChangesObject].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ChangesObject]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(changesObject: ChangesObject) = apply {
                        additionalProperties = changesObject.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [ChangesObject].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ChangesObject = ChangesObject(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): ChangesObject = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ChangesObject &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ChangesObject{additionalProperties=$additionalProperties}"
            }

            class ChangesList
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

                    /** Returns a mutable builder for constructing an instance of [ChangesList]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ChangesList]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(changesList: ChangesList) = apply {
                        additionalProperties = changesList.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [ChangesList].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ChangesList = ChangesList(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): ChangesList = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ChangesList &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "ChangesList{additionalProperties=$additionalProperties}"
            }
        }

        /** The new value of the field. Can be any JSON type. */
        @JsonDeserialize(using = To.Deserializer::class)
        @JsonSerialize(using = To.Serializer::class)
        class To
        private constructor(
            private val string: String? = null,
            private val number: Double? = null,
            private val bool: Boolean? = null,
            private val changesObject: ChangesObject? = null,
            private val changesLists: List<ChangesList>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun number(): Optional<Double> = Optional.ofNullable(number)

            fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

            fun changesObject(): Optional<ChangesObject> = Optional.ofNullable(changesObject)

            fun changesLists(): Optional<List<ChangesList>> = Optional.ofNullable(changesLists)

            fun isString(): Boolean = string != null

            fun isNumber(): Boolean = number != null

            fun isBool(): Boolean = bool != null

            fun isChangesObject(): Boolean = changesObject != null

            fun isChangesLists(): Boolean = changesLists != null

            fun asString(): String = string.getOrThrow("string")

            fun asNumber(): Double = number.getOrThrow("number")

            fun asBool(): Boolean = bool.getOrThrow("bool")

            fun asChangesObject(): ChangesObject = changesObject.getOrThrow("changesObject")

            fun asChangesLists(): List<ChangesList> = changesLists.getOrThrow("changesLists")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    number != null -> visitor.visitNumber(number)
                    bool != null -> visitor.visitBool(bool)
                    changesObject != null -> visitor.visitChangesObject(changesObject)
                    changesLists != null -> visitor.visitChangesLists(changesLists)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): To = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitNumber(number: Double) {}

                        override fun visitBool(bool: Boolean) {}

                        override fun visitChangesObject(changesObject: ChangesObject) {
                            changesObject.validate()
                        }

                        override fun visitChangesLists(changesLists: List<ChangesList>) {
                            changesLists.forEach { it.validate() }
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitNumber(number: Double) = 1

                        override fun visitBool(bool: Boolean) = 1

                        override fun visitChangesObject(changesObject: ChangesObject) =
                            changesObject.validity()

                        override fun visitChangesLists(changesLists: List<ChangesList>) =
                            changesLists.sumOf { it.validity().toInt() }

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is To &&
                    string == other.string &&
                    number == other.number &&
                    bool == other.bool &&
                    changesObject == other.changesObject &&
                    changesLists == other.changesLists
            }

            override fun hashCode(): Int =
                Objects.hash(string, number, bool, changesObject, changesLists)

            override fun toString(): String =
                when {
                    string != null -> "To{string=$string}"
                    number != null -> "To{number=$number}"
                    bool != null -> "To{bool=$bool}"
                    changesObject != null -> "To{changesObject=$changesObject}"
                    changesLists != null -> "To{changesLists=$changesLists}"
                    _json != null -> "To{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid To")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = To(string = string)

                @JvmStatic fun ofNumber(number: Double) = To(number = number)

                @JvmStatic fun ofBool(bool: Boolean) = To(bool = bool)

                @JvmStatic
                fun ofChangesObject(changesObject: ChangesObject) =
                    To(changesObject = changesObject)

                @JvmStatic
                fun ofChangesLists(changesLists: List<ChangesList>) =
                    To(changesLists = changesLists.toImmutable())
            }

            /** An interface that defines how to map each variant of [To] to a value of type [T]. */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitNumber(number: Double): T

                fun visitBool(bool: Boolean): T

                fun visitChangesObject(changesObject: ChangesObject): T

                fun visitChangesLists(changesLists: List<ChangesList>): T

                /**
                 * Maps an unknown variant of [To] to a value of type [T].
                 *
                 * An instance of [To] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown To: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<To>(To::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): To {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<ChangesObject>())?.let {
                                    To(changesObject = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    To(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    To(number = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                    To(bool = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<ChangesList>>())?.let {
                                    To(changesLists = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants.
                        0 -> To(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<To>(To::class) {

                override fun serialize(
                    value: To,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.number != null -> generator.writeObject(value.number)
                        value.bool != null -> generator.writeObject(value.bool)
                        value.changesObject != null -> generator.writeObject(value.changesObject)
                        value.changesLists != null -> generator.writeObject(value.changesLists)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid To")
                    }
                }
            }

            class ChangesObject
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

                    /**
                     * Returns a mutable builder for constructing an instance of [ChangesObject].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ChangesObject]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(changesObject: ChangesObject) = apply {
                        additionalProperties = changesObject.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [ChangesObject].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ChangesObject = ChangesObject(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): ChangesObject = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ChangesObject &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ChangesObject{additionalProperties=$additionalProperties}"
            }

            class ChangesList
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

                    /** Returns a mutable builder for constructing an instance of [ChangesList]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ChangesList]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(changesList: ChangesList) = apply {
                        additionalProperties = changesList.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [ChangesList].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ChangesList = ChangesList(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): ChangesList = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ChangesList &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "ChangesList{additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Change &&
                field == other.field &&
                from == other.from &&
                to == other.to &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(field, from, to, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Change{field=$field, from=$from, to=$to, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuditEventListResponse &&
            id == other.id &&
            alternateResourceId == other.alternateResourceId &&
            changeMadeBy == other.changeMadeBy &&
            changeType == other.changeType &&
            changes == other.changes &&
            createdAt == other.createdAt &&
            organizationId == other.organizationId &&
            recordType == other.recordType &&
            resourceId == other.resourceId &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            alternateResourceId,
            changeMadeBy,
            changeType,
            changes,
            createdAt,
            organizationId,
            recordType,
            resourceId,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuditEventListResponse{id=$id, alternateResourceId=$alternateResourceId, changeMadeBy=$changeMadeBy, changeType=$changeType, changes=$changes, createdAt=$createdAt, organizationId=$organizationId, recordType=$recordType, resourceId=$resourceId, userId=$userId, additionalProperties=$additionalProperties}"
}
