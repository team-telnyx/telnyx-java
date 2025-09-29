// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.auditevents

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
import com.telnyx.api.core.BaseDeserializer
import com.telnyx.api.core.BaseSerializer
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.allMaxBy
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.getOrThrow
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AuditEventListResponse
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

        /** Returns a mutable builder for constructing an instance of [AuditEventListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuditEventListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(auditEventListResponse: AuditEventListResponse) = apply {
            data = auditEventListResponse.data.map { it.toMutableList() }
            meta = auditEventListResponse.meta
            additionalProperties = auditEventListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [AuditEventListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuditEventListResponse =
            AuditEventListResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AuditEventListResponse = apply {
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
         * An alternate identifier for a resource which may be considered unique enough to identify
         * the resource but is not the primary identifier for the resource. For example, this field
         * could be used to store the phone number value for a phone number when the primary
         * database identifier is a separate distinct value.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun alternateResourceId(): Optional<String> =
            alternateResourceId.getOptional("alternate_resource_id")

        /**
         * Indicates if the change was made by Telnyx on your behalf, the organization owner, a
         * member of your organization, or in the case of managed accounts, the account manager.
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
         * Unlike [alternateResourceId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("alternate_resource_id")
        @ExcludeMissing
        fun _alternateResourceId(): JsonField<String> = alternateResourceId

        /**
         * Returns the raw JSON value of [changeMadeBy].
         *
         * Unlike [changeMadeBy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("change_made_by")
        @ExcludeMissing
        fun _changeMadeBy(): JsonField<ChangeMadeBy> = changeMadeBy

        /**
         * Returns the raw JSON value of [changeType].
         *
         * Unlike [changeType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("change_type")
        @ExcludeMissing
        fun _changeType(): JsonField<String> = changeType

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
         * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [resourceId].
         *
         * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resource_id")
        @ExcludeMissing
        fun _resourceId(): JsonField<String> = resourceId

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
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
            internal fun from(data: Data) = apply {
                id = data.id
                alternateResourceId = data.alternateResourceId
                changeMadeBy = data.changeMadeBy
                changeType = data.changeType
                changes = data.changes.map { it.toMutableList() }
                createdAt = data.createdAt
                organizationId = data.organizationId
                recordType = data.recordType
                resourceId = data.resourceId
                userId = data.userId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the audit log entry. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * An alternate identifier for a resource which may be considered unique enough to
             * identify the resource but is not the primary identifier for the resource. For
             * example, this field could be used to store the phone number value for a phone number
             * when the primary database identifier is a separate distinct value.
             */
            fun alternateResourceId(alternateResourceId: String?) =
                alternateResourceId(JsonField.ofNullable(alternateResourceId))

            /**
             * Alias for calling [Builder.alternateResourceId] with
             * `alternateResourceId.orElse(null)`.
             */
            fun alternateResourceId(alternateResourceId: Optional<String>) =
                alternateResourceId(alternateResourceId.getOrNull())

            /**
             * Sets [Builder.alternateResourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alternateResourceId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.changeType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun changeType(changeType: JsonField<String>) = apply { this.changeType = changeType }

            /** Details of the changes made to the resource. */
            fun changes(changes: List<Change>?) = changes(JsonField.ofNullable(changes))

            /** Alias for calling [Builder.changes] with `changes.orElse(null)`. */
            fun changes(changes: Optional<List<Change>>) = changes(changes.getOrNull())

            /**
             * Sets [Builder.changes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.changes] with a well-typed `List<Change>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Unique identifier for the organization that owns the resource. */
            fun organizationId(organizationId: String) =
                organizationId(JsonField.of(organizationId))

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
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** Unique identifier for the resource that was changed. */
            fun resourceId(resourceId: String) = resourceId(JsonField.of(resourceId))

            /**
             * Sets [Builder.resourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resourceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

            /** Unique identifier for the user who made the change. */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
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

        fun validate(): Data = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
         * Indicates if the change was made by Telnyx on your behalf, the organization owner, a
         * member of your organization, or in the case of managed accounts, the account manager.
         */
        class ChangeMadeBy @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TELNYX,
                ACCOUNT_MANAGER,
                ACCOUNT_OWNER,
                ORGANIZATION_MEMBER,
                /**
                 * An enum member indicating that [ChangeMadeBy] was instantiated with an unknown
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
                    TELNYX -> Value.TELNYX
                    ACCOUNT_MANAGER -> Value.ACCOUNT_MANAGER
                    ACCOUNT_OWNER -> Value.ACCOUNT_OWNER
                    ORGANIZATION_MEMBER -> Value.ORGANIZATION_MEMBER
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
                    TELNYX -> Known.TELNYX
                    ACCOUNT_MANAGER -> Known.ACCOUNT_MANAGER
                    ACCOUNT_OWNER -> Known.ACCOUNT_OWNER
                    ORGANIZATION_MEMBER -> Known.ORGANIZATION_MEMBER
                    else -> throw TelnyxInvalidDataException("Unknown ChangeMadeBy: $value")
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun field(): Optional<String> = field.getOptional("field")

            /**
             * The previous value of the field. Can be any JSON type.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun from(): Optional<From> = from.getOptional("from")

            /**
             * The new value of the field. Can be any JSON type.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
                 * The name of the field that was changed. May use the dot notation to indicate
                 * nested fields.
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
                 * You should usually call [Builder.from] with a well-typed [From] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun from(from: JsonField<From>) = apply { this.from = from }

                /** Alias for calling [from] with `From.ofString(string)`. */
                fun from(string: String) = from(From.ofString(string))

                /** Alias for calling [from] with `From.ofNumber(number)`. */
                fun from(number: Double) = from(From.ofNumber(number))

                /** Alias for calling [from] with `From.ofBool(bool)`. */
                fun from(bool: Boolean) = from(From.ofBool(bool))

                /** Alias for calling [from] with `From.ofUnionMember3(unionMember3)`. */
                fun from(unionMember3: From.UnionMember3) = from(From.ofUnionMember3(unionMember3))

                /** Alias for calling [from] with `From.ofJsonValues(jsonValues)`. */
                fun fromOfJsonValues(jsonValues: List<JsonValue>) =
                    from(From.ofJsonValues(jsonValues))

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

                /** Alias for calling [to] with `To.ofUnionMember3(unionMember3)`. */
                fun to(unionMember3: To.UnionMember3) = to(To.ofUnionMember3(unionMember3))

                /** Alias for calling [to] with `To.ofJsonValues(jsonValues)`. */
                fun toOfJsonValues(jsonValues: List<JsonValue>) = to(To.ofJsonValues(jsonValues))

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
                private val unionMember3: UnionMember3? = null,
                private val jsonValues: List<JsonValue>? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun number(): Optional<Double> = Optional.ofNullable(number)

                fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

                fun unionMember3(): Optional<UnionMember3> = Optional.ofNullable(unionMember3)

                fun jsonValues(): Optional<List<JsonValue>> = Optional.ofNullable(jsonValues)

                fun isString(): Boolean = string != null

                fun isNumber(): Boolean = number != null

                fun isBool(): Boolean = bool != null

                fun isUnionMember3(): Boolean = unionMember3 != null

                fun isJsonValues(): Boolean = jsonValues != null

                fun asString(): String = string.getOrThrow("string")

                fun asNumber(): Double = number.getOrThrow("number")

                fun asBool(): Boolean = bool.getOrThrow("bool")

                fun asUnionMember3(): UnionMember3 = unionMember3.getOrThrow("unionMember3")

                fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        number != null -> visitor.visitNumber(number)
                        bool != null -> visitor.visitBool(bool)
                        unionMember3 != null -> visitor.visitUnionMember3(unionMember3)
                        jsonValues != null -> visitor.visitJsonValues(jsonValues)
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

                            override fun visitUnionMember3(unionMember3: UnionMember3) {
                                unionMember3.validate()
                            }

                            override fun visitJsonValues(jsonValues: List<JsonValue>) {}
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

                            override fun visitUnionMember3(unionMember3: UnionMember3) =
                                unionMember3.validity()

                            override fun visitJsonValues(jsonValues: List<JsonValue>) =
                                jsonValues.size

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
                        unionMember3 == other.unionMember3 &&
                        jsonValues == other.jsonValues
                }

                override fun hashCode(): Int =
                    Objects.hash(string, number, bool, unionMember3, jsonValues)

                override fun toString(): String =
                    when {
                        string != null -> "From{string=$string}"
                        number != null -> "From{number=$number}"
                        bool != null -> "From{bool=$bool}"
                        unionMember3 != null -> "From{unionMember3=$unionMember3}"
                        jsonValues != null -> "From{jsonValues=$jsonValues}"
                        _json != null -> "From{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid From")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = From(string = string)

                    @JvmStatic fun ofNumber(number: Double) = From(number = number)

                    @JvmStatic fun ofBool(bool: Boolean) = From(bool = bool)

                    @JvmStatic
                    fun ofUnionMember3(unionMember3: UnionMember3) =
                        From(unionMember3 = unionMember3)

                    @JvmStatic
                    fun ofJsonValues(jsonValues: List<JsonValue>) =
                        From(jsonValues = jsonValues.toImmutable())
                }

                /**
                 * An interface that defines how to map each variant of [From] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitNumber(number: Double): T

                    fun visitBool(bool: Boolean): T

                    fun visitUnionMember3(unionMember3: UnionMember3): T

                    fun visitJsonValues(jsonValues: List<JsonValue>): T

                    /**
                     * Maps an unknown variant of [From] to a value of type [T].
                     *
                     * An instance of [From] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
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
                                    tryDeserialize(node, jacksonTypeRef<UnionMember3>())?.let {
                                        From(unionMember3 = it, _json = json)
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
                                    tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                        From(jsonValues = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants.
                            0 -> From(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
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
                            value.unionMember3 != null -> generator.writeObject(value.unionMember3)
                            value.jsonValues != null -> generator.writeObject(value.jsonValues)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid From")
                        }
                    }
                }

                class UnionMember3
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
                         * Returns a mutable builder for constructing an instance of [UnionMember3].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [UnionMember3]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(unionMember3: UnionMember3) = apply {
                            additionalProperties = unionMember3.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [UnionMember3].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): UnionMember3 = UnionMember3(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): UnionMember3 = apply {
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

                        return other is UnionMember3 &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "UnionMember3{additionalProperties=$additionalProperties}"
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
                private val unionMember3: UnionMember3? = null,
                private val jsonValues: List<JsonValue>? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun number(): Optional<Double> = Optional.ofNullable(number)

                fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

                fun unionMember3(): Optional<UnionMember3> = Optional.ofNullable(unionMember3)

                fun jsonValues(): Optional<List<JsonValue>> = Optional.ofNullable(jsonValues)

                fun isString(): Boolean = string != null

                fun isNumber(): Boolean = number != null

                fun isBool(): Boolean = bool != null

                fun isUnionMember3(): Boolean = unionMember3 != null

                fun isJsonValues(): Boolean = jsonValues != null

                fun asString(): String = string.getOrThrow("string")

                fun asNumber(): Double = number.getOrThrow("number")

                fun asBool(): Boolean = bool.getOrThrow("bool")

                fun asUnionMember3(): UnionMember3 = unionMember3.getOrThrow("unionMember3")

                fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        number != null -> visitor.visitNumber(number)
                        bool != null -> visitor.visitBool(bool)
                        unionMember3 != null -> visitor.visitUnionMember3(unionMember3)
                        jsonValues != null -> visitor.visitJsonValues(jsonValues)
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

                            override fun visitUnionMember3(unionMember3: UnionMember3) {
                                unionMember3.validate()
                            }

                            override fun visitJsonValues(jsonValues: List<JsonValue>) {}
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

                            override fun visitUnionMember3(unionMember3: UnionMember3) =
                                unionMember3.validity()

                            override fun visitJsonValues(jsonValues: List<JsonValue>) =
                                jsonValues.size

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
                        unionMember3 == other.unionMember3 &&
                        jsonValues == other.jsonValues
                }

                override fun hashCode(): Int =
                    Objects.hash(string, number, bool, unionMember3, jsonValues)

                override fun toString(): String =
                    when {
                        string != null -> "To{string=$string}"
                        number != null -> "To{number=$number}"
                        bool != null -> "To{bool=$bool}"
                        unionMember3 != null -> "To{unionMember3=$unionMember3}"
                        jsonValues != null -> "To{jsonValues=$jsonValues}"
                        _json != null -> "To{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid To")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = To(string = string)

                    @JvmStatic fun ofNumber(number: Double) = To(number = number)

                    @JvmStatic fun ofBool(bool: Boolean) = To(bool = bool)

                    @JvmStatic
                    fun ofUnionMember3(unionMember3: UnionMember3) = To(unionMember3 = unionMember3)

                    @JvmStatic
                    fun ofJsonValues(jsonValues: List<JsonValue>) =
                        To(jsonValues = jsonValues.toImmutable())
                }

                /**
                 * An interface that defines how to map each variant of [To] to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitNumber(number: Double): T

                    fun visitBool(bool: Boolean): T

                    fun visitUnionMember3(unionMember3: UnionMember3): T

                    fun visitJsonValues(jsonValues: List<JsonValue>): T

                    /**
                     * Maps an unknown variant of [To] to a value of type [T].
                     *
                     * An instance of [To] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
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
                                    tryDeserialize(node, jacksonTypeRef<UnionMember3>())?.let {
                                        To(unionMember3 = it, _json = json)
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
                                    tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                        To(jsonValues = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants.
                            0 -> To(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
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
                            value.unionMember3 != null -> generator.writeObject(value.unionMember3)
                            value.jsonValues != null -> generator.writeObject(value.jsonValues)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid To")
                        }
                    }
                }

                class UnionMember3
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
                         * Returns a mutable builder for constructing an instance of [UnionMember3].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [UnionMember3]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(unionMember3: UnionMember3) = apply {
                            additionalProperties = unionMember3.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [UnionMember3].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): UnionMember3 = UnionMember3(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): UnionMember3 = apply {
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

                        return other is UnionMember3 &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "UnionMember3{additionalProperties=$additionalProperties}"
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

            private val hashCode: Int by lazy {
                Objects.hash(field, from, to, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Change{field=$field, from=$from, to=$to, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
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
            "Data{id=$id, alternateResourceId=$alternateResourceId, changeMadeBy=$changeMadeBy, changeType=$changeType, changes=$changes, createdAt=$createdAt, organizationId=$organizationId, recordType=$recordType, resourceId=$resourceId, userId=$userId, additionalProperties=$additionalProperties}"
    }

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pageNumber: JsonField<Long>,
        private val pageSize: JsonField<Long>,
        private val totalPages: JsonField<Long>,
        private val totalResults: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("page_number")
            @ExcludeMissing
            pageNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_pages")
            @ExcludeMissing
            totalPages: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_results")
            @ExcludeMissing
            totalResults: JsonField<Long> = JsonMissing.of(),
        ) : this(pageNumber, pageSize, totalPages, totalResults, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageNumber(): Optional<Long> = pageNumber.getOptional("page_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalPages(): Optional<Long> = totalPages.getOptional("total_pages")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalResults(): Optional<Long> = totalResults.getOptional("total_results")

        /**
         * Returns the raw JSON value of [pageNumber].
         *
         * Unlike [pageNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_number") @ExcludeMissing fun _pageNumber(): JsonField<Long> = pageNumber

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        /**
         * Returns the raw JSON value of [totalPages].
         *
         * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Long> = totalPages

        /**
         * Returns the raw JSON value of [totalResults].
         *
         * Unlike [totalResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_results")
        @ExcludeMissing
        fun _totalResults(): JsonField<Long> = totalResults

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

            private var pageNumber: JsonField<Long> = JsonMissing.of()
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var totalPages: JsonField<Long> = JsonMissing.of()
            private var totalResults: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                pageNumber = meta.pageNumber
                pageSize = meta.pageSize
                totalPages = meta.totalPages
                totalResults = meta.totalResults
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

            /**
             * Sets [Builder.pageNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageNumber] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageNumber(pageNumber: JsonField<Long>) = apply { this.pageNumber = pageNumber }

            fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            fun totalPages(totalPages: Long) = totalPages(JsonField.of(totalPages))

            /**
             * Sets [Builder.totalPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalPages] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalPages(totalPages: JsonField<Long>) = apply { this.totalPages = totalPages }

            fun totalResults(totalResults: Long) = totalResults(JsonField.of(totalResults))

            /**
             * Sets [Builder.totalResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalResults] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalResults(totalResults: JsonField<Long>) = apply {
                this.totalResults = totalResults
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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Meta =
                Meta(
                    pageNumber,
                    pageSize,
                    totalPages,
                    totalResults,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            pageNumber()
            pageSize()
            totalPages()
            totalResults()
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
            (if (pageNumber.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (totalPages.asKnown().isPresent) 1 else 0) +
                (if (totalResults.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                pageNumber == other.pageNumber &&
                pageSize == other.pageSize &&
                totalPages == other.totalPages &&
                totalResults == other.totalResults &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(pageNumber, pageSize, totalPages, totalResults, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{pageNumber=$pageNumber, pageSize=$pageSize, totalPages=$totalPages, totalResults=$totalResults, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuditEventListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuditEventListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
