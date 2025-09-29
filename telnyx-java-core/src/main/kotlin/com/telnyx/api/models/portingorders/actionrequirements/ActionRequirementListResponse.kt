// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.actionrequirements

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ActionRequirementListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<PaginationMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<PaginationMeta> = JsonMissing.of(),
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
    fun meta(): Optional<PaginationMeta> = meta.getOptional("meta")

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
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<PaginationMeta> = meta

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
         * [ActionRequirementListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionRequirementListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<PaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(actionRequirementListResponse: ActionRequirementListResponse) = apply {
            data = actionRequirementListResponse.data.map { it.toMutableList() }
            meta = actionRequirementListResponse.meta
            additionalProperties = actionRequirementListResponse.additionalProperties.toMutableMap()
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

        fun meta(meta: PaginationMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [PaginationMeta] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meta(meta: JsonField<PaginationMeta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [ActionRequirementListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionRequirementListResponse =
            ActionRequirementListResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ActionRequirementListResponse = apply {
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
        private val actionType: JsonField<String>,
        private val actionUrl: JsonField<String>,
        private val cancelReason: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val portingOrderId: JsonField<String>,
        private val recordType: JsonField<RecordType>,
        private val requirementTypeId: JsonField<String>,
        private val status: JsonField<Status>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("action_type")
            @ExcludeMissing
            actionType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("action_url")
            @ExcludeMissing
            actionUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cancel_reason")
            @ExcludeMissing
            cancelReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("porting_order_id")
            @ExcludeMissing
            portingOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
            @JsonProperty("requirement_type_id")
            @ExcludeMissing
            requirementTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            actionType,
            actionUrl,
            cancelReason,
            createdAt,
            portingOrderId,
            recordType,
            requirementTypeId,
            status,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * Identifies the action requirement
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The type of action required
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun actionType(): Optional<String> = actionType.getOptional("action_type")

        /**
         * Optional URL for the action
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun actionUrl(): Optional<String> = actionUrl.getOptional("action_url")

        /**
         * Reason for cancellation if status is 'cancelled'
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cancelReason(): Optional<String> = cancelReason.getOptional("cancel_reason")

        /**
         * ISO 8601 formatted date-time indicating when the resource was created
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * The ID of the porting order this action requirement belongs to
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun portingOrderId(): Optional<String> = portingOrderId.getOptional("porting_order_id")

        /**
         * Identifies the type of the resource
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

        /**
         * The ID of the requirement type
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requirementTypeId(): Optional<String> =
            requirementTypeId.getOptional("requirement_type_id")

        /**
         * Current status of the action requirement
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * ISO 8601 formatted date-time indicating when the resource was updated
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
         * Returns the raw JSON value of [actionType].
         *
         * Unlike [actionType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action_type")
        @ExcludeMissing
        fun _actionType(): JsonField<String> = actionType

        /**
         * Returns the raw JSON value of [actionUrl].
         *
         * Unlike [actionUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action_url") @ExcludeMissing fun _actionUrl(): JsonField<String> = actionUrl

        /**
         * Returns the raw JSON value of [cancelReason].
         *
         * Unlike [cancelReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cancel_reason")
        @ExcludeMissing
        fun _cancelReason(): JsonField<String> = cancelReason

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [portingOrderId].
         *
         * Unlike [portingOrderId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("porting_order_id")
        @ExcludeMissing
        fun _portingOrderId(): JsonField<String> = portingOrderId

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

        /**
         * Returns the raw JSON value of [requirementTypeId].
         *
         * Unlike [requirementTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requirement_type_id")
        @ExcludeMissing
        fun _requirementTypeId(): JsonField<String> = requirementTypeId

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var actionType: JsonField<String> = JsonMissing.of()
            private var actionUrl: JsonField<String> = JsonMissing.of()
            private var cancelReason: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var portingOrderId: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<RecordType> = JsonMissing.of()
            private var requirementTypeId: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                actionType = data.actionType
                actionUrl = data.actionUrl
                cancelReason = data.cancelReason
                createdAt = data.createdAt
                portingOrderId = data.portingOrderId
                recordType = data.recordType
                requirementTypeId = data.requirementTypeId
                status = data.status
                updatedAt = data.updatedAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Identifies the action requirement */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The type of action required */
            fun actionType(actionType: String) = actionType(JsonField.of(actionType))

            /**
             * Sets [Builder.actionType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actionType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actionType(actionType: JsonField<String>) = apply { this.actionType = actionType }

            /** Optional URL for the action */
            fun actionUrl(actionUrl: String?) = actionUrl(JsonField.ofNullable(actionUrl))

            /** Alias for calling [Builder.actionUrl] with `actionUrl.orElse(null)`. */
            fun actionUrl(actionUrl: Optional<String>) = actionUrl(actionUrl.getOrNull())

            /**
             * Sets [Builder.actionUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actionUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actionUrl(actionUrl: JsonField<String>) = apply { this.actionUrl = actionUrl }

            /** Reason for cancellation if status is 'cancelled' */
            fun cancelReason(cancelReason: String?) =
                cancelReason(JsonField.ofNullable(cancelReason))

            /** Alias for calling [Builder.cancelReason] with `cancelReason.orElse(null)`. */
            fun cancelReason(cancelReason: Optional<String>) =
                cancelReason(cancelReason.getOrNull())

            /**
             * Sets [Builder.cancelReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cancelReason(cancelReason: JsonField<String>) = apply {
                this.cancelReason = cancelReason
            }

            /** ISO 8601 formatted date-time indicating when the resource was created */
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

            /** The ID of the porting order this action requirement belongs to */
            fun portingOrderId(portingOrderId: String) =
                portingOrderId(JsonField.of(portingOrderId))

            /**
             * Sets [Builder.portingOrderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portingOrderId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun portingOrderId(portingOrderId: JsonField<String>) = apply {
                this.portingOrderId = portingOrderId
            }

            /** Identifies the type of the resource */
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

            /** The ID of the requirement type */
            fun requirementTypeId(requirementTypeId: String) =
                requirementTypeId(JsonField.of(requirementTypeId))

            /**
             * Sets [Builder.requirementTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requirementTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requirementTypeId(requirementTypeId: JsonField<String>) = apply {
                this.requirementTypeId = requirementTypeId
            }

            /** Current status of the action requirement */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** ISO 8601 formatted date-time indicating when the resource was updated */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             */
            fun build(): Data =
                Data(
                    id,
                    actionType,
                    actionUrl,
                    cancelReason,
                    createdAt,
                    portingOrderId,
                    recordType,
                    requirementTypeId,
                    status,
                    updatedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            actionType()
            actionUrl()
            cancelReason()
            createdAt()
            portingOrderId()
            recordType().ifPresent { it.validate() }
            requirementTypeId()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (actionType.asKnown().isPresent) 1 else 0) +
                (if (actionUrl.asKnown().isPresent) 1 else 0) +
                (if (cancelReason.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (portingOrderId.asKnown().isPresent) 1 else 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (requirementTypeId.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        /** Identifies the type of the resource */
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

                @JvmField val PORTING_ACTION_REQUIREMENT = of("porting_action_requirement")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                PORTING_ACTION_REQUIREMENT
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
                PORTING_ACTION_REQUIREMENT,
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
                    PORTING_ACTION_REQUIREMENT -> Value.PORTING_ACTION_REQUIREMENT
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
                    PORTING_ACTION_REQUIREMENT -> Known.PORTING_ACTION_REQUIREMENT
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

        /** Current status of the action requirement */
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

                @JvmField val CREATED = of("created")

                @JvmField val PENDING = of("pending")

                @JvmField val COMPLETED = of("completed")

                @JvmField val CANCELLED = of("cancelled")

                @JvmField val FAILED = of("failed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                CREATED,
                PENDING,
                COMPLETED,
                CANCELLED,
                FAILED,
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
                CREATED,
                PENDING,
                COMPLETED,
                CANCELLED,
                FAILED,
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
                    CREATED -> Value.CREATED
                    PENDING -> Value.PENDING
                    COMPLETED -> Value.COMPLETED
                    CANCELLED -> Value.CANCELLED
                    FAILED -> Value.FAILED
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
                    CREATED -> Known.CREATED
                    PENDING -> Known.PENDING
                    COMPLETED -> Known.COMPLETED
                    CANCELLED -> Known.CANCELLED
                    FAILED -> Known.FAILED
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
                id == other.id &&
                actionType == other.actionType &&
                actionUrl == other.actionUrl &&
                cancelReason == other.cancelReason &&
                createdAt == other.createdAt &&
                portingOrderId == other.portingOrderId &&
                recordType == other.recordType &&
                requirementTypeId == other.requirementTypeId &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                actionType,
                actionUrl,
                cancelReason,
                createdAt,
                portingOrderId,
                recordType,
                requirementTypeId,
                status,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, actionType=$actionType, actionUrl=$actionUrl, cancelReason=$cancelReason, createdAt=$createdAt, portingOrderId=$portingOrderId, recordType=$recordType, requirementTypeId=$requirementTypeId, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionRequirementListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionRequirementListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
