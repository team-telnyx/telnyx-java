// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortingOrderRetrieveRequirementsResponse
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
         * [PortingOrderRetrieveRequirementsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderRetrieveRequirementsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<PaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            portingOrderRetrieveRequirementsResponse: PortingOrderRetrieveRequirementsResponse
        ) = apply {
            data = portingOrderRetrieveRequirementsResponse.data.map { it.toMutableList() }
            meta = portingOrderRetrieveRequirementsResponse.meta
            additionalProperties =
                portingOrderRetrieveRequirementsResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [PortingOrderRetrieveRequirementsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderRetrieveRequirementsResponse =
            PortingOrderRetrieveRequirementsResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingOrderRetrieveRequirementsResponse = apply {
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
        private val fieldType: JsonField<FieldType>,
        private val fieldValue: JsonField<String>,
        private val recordType: JsonField<String>,
        private val requirementStatus: JsonField<String>,
        private val requirementType: JsonField<RequirementType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("field_type")
            @ExcludeMissing
            fieldType: JsonField<FieldType> = JsonMissing.of(),
            @JsonProperty("field_value")
            @ExcludeMissing
            fieldValue: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requirement_status")
            @ExcludeMissing
            requirementStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requirement_type")
            @ExcludeMissing
            requirementType: JsonField<RequirementType> = JsonMissing.of(),
        ) : this(
            fieldType,
            fieldValue,
            recordType,
            requirementStatus,
            requirementType,
            mutableMapOf(),
        )

        /**
         * Type of value expected on field_value field
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fieldType(): Optional<FieldType> = fieldType.getOptional("field_type")

        /**
         * Identifies the document that satisfies this requirement
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fieldValue(): Optional<String> = fieldValue.getOptional("field_value")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * Status of the requirement
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requirementStatus(): Optional<String> =
            requirementStatus.getOptional("requirement_status")

        /**
         * Identifies the requirement type that meets this requirement
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requirementType(): Optional<RequirementType> =
            requirementType.getOptional("requirement_type")

        /**
         * Returns the raw JSON value of [fieldType].
         *
         * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field_type")
        @ExcludeMissing
        fun _fieldType(): JsonField<FieldType> = fieldType

        /**
         * Returns the raw JSON value of [fieldValue].
         *
         * Unlike [fieldValue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field_value")
        @ExcludeMissing
        fun _fieldValue(): JsonField<String> = fieldValue

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [requirementStatus].
         *
         * Unlike [requirementStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requirement_status")
        @ExcludeMissing
        fun _requirementStatus(): JsonField<String> = requirementStatus

        /**
         * Returns the raw JSON value of [requirementType].
         *
         * Unlike [requirementType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requirement_type")
        @ExcludeMissing
        fun _requirementType(): JsonField<RequirementType> = requirementType

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

            private var fieldType: JsonField<FieldType> = JsonMissing.of()
            private var fieldValue: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var requirementStatus: JsonField<String> = JsonMissing.of()
            private var requirementType: JsonField<RequirementType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                fieldType = data.fieldType
                fieldValue = data.fieldValue
                recordType = data.recordType
                requirementStatus = data.requirementStatus
                requirementType = data.requirementType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Type of value expected on field_value field */
            fun fieldType(fieldType: FieldType) = fieldType(JsonField.of(fieldType))

            /**
             * Sets [Builder.fieldType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldType] with a well-typed [FieldType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldType(fieldType: JsonField<FieldType>) = apply { this.fieldType = fieldType }

            /** Identifies the document that satisfies this requirement */
            fun fieldValue(fieldValue: String) = fieldValue(JsonField.of(fieldValue))

            /**
             * Sets [Builder.fieldValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldValue] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldValue(fieldValue: JsonField<String>) = apply { this.fieldValue = fieldValue }

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

            /** Status of the requirement */
            fun requirementStatus(requirementStatus: String) =
                requirementStatus(JsonField.of(requirementStatus))

            /**
             * Sets [Builder.requirementStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requirementStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requirementStatus(requirementStatus: JsonField<String>) = apply {
                this.requirementStatus = requirementStatus
            }

            /** Identifies the requirement type that meets this requirement */
            fun requirementType(requirementType: RequirementType) =
                requirementType(JsonField.of(requirementType))

            /**
             * Sets [Builder.requirementType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requirementType] with a well-typed [RequirementType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requirementType(requirementType: JsonField<RequirementType>) = apply {
                this.requirementType = requirementType
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
                    fieldType,
                    fieldValue,
                    recordType,
                    requirementStatus,
                    requirementType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            fieldType().ifPresent { it.validate() }
            fieldValue()
            recordType()
            requirementStatus()
            requirementType().ifPresent { it.validate() }
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
            (fieldType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fieldValue.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (requirementStatus.asKnown().isPresent) 1 else 0) +
                (requirementType.asKnown().getOrNull()?.validity() ?: 0)

        /** Type of value expected on field_value field */
        class FieldType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val DOCUMENT = of("document")

                @JvmField val TEXTUAL = of("textual")

                @JvmStatic fun of(value: String) = FieldType(JsonField.of(value))
            }

            /** An enum containing [FieldType]'s known values. */
            enum class Known {
                DOCUMENT,
                TEXTUAL,
            }

            /**
             * An enum containing [FieldType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [FieldType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DOCUMENT,
                TEXTUAL,
                /**
                 * An enum member indicating that [FieldType] was instantiated with an unknown
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
                    DOCUMENT -> Value.DOCUMENT
                    TEXTUAL -> Value.TEXTUAL
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
                    DOCUMENT -> Known.DOCUMENT
                    TEXTUAL -> Known.TEXTUAL
                    else -> throw TelnyxInvalidDataException("Unknown FieldType: $value")
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

            fun validate(): FieldType = apply {
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

                return other is FieldType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Identifies the requirement type that meets this requirement */
        class RequirementType
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val acceptanceCriteria: JsonField<AcceptanceCriteria>,
            private val description: JsonField<String>,
            private val example: JsonField<String>,
            private val name: JsonField<String>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("acceptance_criteria")
                @ExcludeMissing
                acceptanceCriteria: JsonField<AcceptanceCriteria> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("example")
                @ExcludeMissing
                example: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(id, acceptanceCriteria, description, example, name, type, mutableMapOf())

            /**
             * Identifies the requirement type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * The acceptance criteria for the requirement type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun acceptanceCriteria(): Optional<AcceptanceCriteria> =
                acceptanceCriteria.getOptional("acceptance_criteria")

            /**
             * A description of the requirement type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * An example of the requirement type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun example(): Optional<String> = example.getOptional("example")

            /**
             * The name of the requirement type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * The type of the requirement type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [acceptanceCriteria].
             *
             * Unlike [acceptanceCriteria], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("acceptance_criteria")
            @ExcludeMissing
            fun _acceptanceCriteria(): JsonField<AcceptanceCriteria> = acceptanceCriteria

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [example].
             *
             * Unlike [example], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("example") @ExcludeMissing fun _example(): JsonField<String> = example

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [RequirementType]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RequirementType]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var acceptanceCriteria: JsonField<AcceptanceCriteria> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var example: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(requirementType: RequirementType) = apply {
                    id = requirementType.id
                    acceptanceCriteria = requirementType.acceptanceCriteria
                    description = requirementType.description
                    example = requirementType.example
                    name = requirementType.name
                    type = requirementType.type
                    additionalProperties = requirementType.additionalProperties.toMutableMap()
                }

                /** Identifies the requirement type */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The acceptance criteria for the requirement type */
                fun acceptanceCriteria(acceptanceCriteria: AcceptanceCriteria) =
                    acceptanceCriteria(JsonField.of(acceptanceCriteria))

                /**
                 * Sets [Builder.acceptanceCriteria] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.acceptanceCriteria] with a well-typed
                 * [AcceptanceCriteria] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun acceptanceCriteria(acceptanceCriteria: JsonField<AcceptanceCriteria>) = apply {
                    this.acceptanceCriteria = acceptanceCriteria
                }

                /** A description of the requirement type */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** An example of the requirement type */
                fun example(example: String) = example(JsonField.of(example))

                /**
                 * Sets [Builder.example] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.example] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun example(example: JsonField<String>) = apply { this.example = example }

                /** The name of the requirement type */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The type of the requirement type */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [RequirementType].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RequirementType =
                    RequirementType(
                        id,
                        acceptanceCriteria,
                        description,
                        example,
                        name,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RequirementType = apply {
                if (validated) {
                    return@apply
                }

                id()
                acceptanceCriteria().ifPresent { it.validate() }
                description()
                example()
                name()
                type()
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
                    (acceptanceCriteria.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (example.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            /** The acceptance criteria for the requirement type */
            class AcceptanceCriteria
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
                     * Returns a mutable builder for constructing an instance of
                     * [AcceptanceCriteria].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AcceptanceCriteria]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(acceptanceCriteria: AcceptanceCriteria) = apply {
                        additionalProperties =
                            acceptanceCriteria.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [AcceptanceCriteria].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): AcceptanceCriteria =
                        AcceptanceCriteria(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): AcceptanceCriteria = apply {
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

                    return other is AcceptanceCriteria &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AcceptanceCriteria{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RequirementType &&
                    id == other.id &&
                    acceptanceCriteria == other.acceptanceCriteria &&
                    description == other.description &&
                    example == other.example &&
                    name == other.name &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    acceptanceCriteria,
                    description,
                    example,
                    name,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RequirementType{id=$id, acceptanceCriteria=$acceptanceCriteria, description=$description, example=$example, name=$name, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                fieldType == other.fieldType &&
                fieldValue == other.fieldValue &&
                recordType == other.recordType &&
                requirementStatus == other.requirementStatus &&
                requirementType == other.requirementType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                fieldType,
                fieldValue,
                recordType,
                requirementStatus,
                requirementType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{fieldType=$fieldType, fieldValue=$fieldValue, recordType=$recordType, requirementStatus=$requirementStatus, requirementType=$requirementType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderRetrieveRequirementsResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrderRetrieveRequirementsResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
