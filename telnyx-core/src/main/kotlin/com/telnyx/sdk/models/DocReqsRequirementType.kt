// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

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

class DocReqsRequirementType
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val acceptanceCriteria: JsonField<AcceptanceCriteria>,
    private val createdAt: JsonField<String>,
    private val description: JsonField<String>,
    private val example: JsonField<String>,
    private val name: JsonField<String>,
    private val recordType: JsonField<String>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acceptance_criteria")
        @ExcludeMissing
        acceptanceCriteria: JsonField<AcceptanceCriteria> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("example") @ExcludeMissing example: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        acceptanceCriteria,
        createdAt,
        description,
        example,
        name,
        recordType,
        type,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Identifies the associated document
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Specifies objective criteria for acceptance
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acceptanceCriteria(): Optional<AcceptanceCriteria> =
        acceptanceCriteria.getOptional("acceptance_criteria")

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * Describes the requirement type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Provides one or more examples of acceptable documents
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun example(): Optional<String> = example.getOptional("example")

    /**
     * A short descriptive name for this requirement_type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Identifies the type of the resource
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * Defines the type of this requirement type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * ISO 8601 formatted date-time indicating when the resource was last updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [acceptanceCriteria].
     *
     * Unlike [acceptanceCriteria], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("acceptance_criteria")
    @ExcludeMissing
    fun _acceptanceCriteria(): JsonField<AcceptanceCriteria> = acceptanceCriteria

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [DocReqsRequirementType]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocReqsRequirementType]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var acceptanceCriteria: JsonField<AcceptanceCriteria> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var example: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(docReqsRequirementType: DocReqsRequirementType) = apply {
            id = docReqsRequirementType.id
            acceptanceCriteria = docReqsRequirementType.acceptanceCriteria
            createdAt = docReqsRequirementType.createdAt
            description = docReqsRequirementType.description
            example = docReqsRequirementType.example
            name = docReqsRequirementType.name
            recordType = docReqsRequirementType.recordType
            type = docReqsRequirementType.type
            updatedAt = docReqsRequirementType.updatedAt
            additionalProperties = docReqsRequirementType.additionalProperties.toMutableMap()
        }

        /** Identifies the associated document */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Specifies objective criteria for acceptance */
        fun acceptanceCriteria(acceptanceCriteria: AcceptanceCriteria) =
            acceptanceCriteria(JsonField.of(acceptanceCriteria))

        /**
         * Sets [Builder.acceptanceCriteria] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptanceCriteria] with a well-typed
         * [AcceptanceCriteria] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun acceptanceCriteria(acceptanceCriteria: JsonField<AcceptanceCriteria>) = apply {
            this.acceptanceCriteria = acceptanceCriteria
        }

        /** ISO 8601 formatted date-time indicating when the resource was created. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** Describes the requirement type */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Provides one or more examples of acceptable documents */
        fun example(example: String) = example(JsonField.of(example))

        /**
         * Sets [Builder.example] to an arbitrary JSON value.
         *
         * You should usually call [Builder.example] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun example(example: JsonField<String>) = apply { this.example = example }

        /** A short descriptive name for this requirement_type */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Identifies the type of the resource */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** Defines the type of this requirement type */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** ISO 8601 formatted date-time indicating when the resource was last updated. */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [DocReqsRequirementType].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocReqsRequirementType =
            DocReqsRequirementType(
                id,
                acceptanceCriteria,
                createdAt,
                description,
                example,
                name,
                recordType,
                type,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DocReqsRequirementType = apply {
        if (validated) {
            return@apply
        }

        id()
        acceptanceCriteria().ifPresent { it.validate() }
        createdAt()
        description()
        example()
        name()
        recordType()
        type().ifPresent { it.validate() }
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
            (acceptanceCriteria.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (example.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Specifies objective criteria for acceptance */
    class AcceptanceCriteria
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val acceptableCharacters: JsonField<String>,
        private val acceptableValues: JsonField<List<String>>,
        private val localityLimit: JsonField<String>,
        private val maxLength: JsonField<Long>,
        private val minLength: JsonField<Long>,
        private val timeLimit: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("acceptable_characters")
            @ExcludeMissing
            acceptableCharacters: JsonField<String> = JsonMissing.of(),
            @JsonProperty("acceptable_values")
            @ExcludeMissing
            acceptableValues: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("locality_limit")
            @ExcludeMissing
            localityLimit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_length")
            @ExcludeMissing
            maxLength: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("min_length")
            @ExcludeMissing
            minLength: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("time_limit")
            @ExcludeMissing
            timeLimit: JsonField<String> = JsonMissing.of(),
        ) : this(
            acceptableCharacters,
            acceptableValues,
            localityLimit,
            maxLength,
            minLength,
            timeLimit,
            mutableMapOf(),
        )

        /**
         * Specifies the allowed characters as a string
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun acceptableCharacters(): Optional<String> =
            acceptableCharacters.getOptional("acceptable_characters")

        /**
         * Specifies the list of strictly possible values for the requirement. Ignored when empty
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun acceptableValues(): Optional<List<String>> =
            acceptableValues.getOptional("acceptable_values")

        /**
         * Specifies geography-based acceptance criteria
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun localityLimit(): Optional<String> = localityLimit.getOptional("locality_limit")

        /**
         * Maximum length allowed for the value
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxLength(): Optional<Long> = maxLength.getOptional("max_length")

        /**
         * Minimum length allowed for the value
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minLength(): Optional<Long> = minLength.getOptional("min_length")

        /**
         * Specifies time-based acceptance criteria
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeLimit(): Optional<String> = timeLimit.getOptional("time_limit")

        /**
         * Returns the raw JSON value of [acceptableCharacters].
         *
         * Unlike [acceptableCharacters], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("acceptable_characters")
        @ExcludeMissing
        fun _acceptableCharacters(): JsonField<String> = acceptableCharacters

        /**
         * Returns the raw JSON value of [acceptableValues].
         *
         * Unlike [acceptableValues], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("acceptable_values")
        @ExcludeMissing
        fun _acceptableValues(): JsonField<List<String>> = acceptableValues

        /**
         * Returns the raw JSON value of [localityLimit].
         *
         * Unlike [localityLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("locality_limit")
        @ExcludeMissing
        fun _localityLimit(): JsonField<String> = localityLimit

        /**
         * Returns the raw JSON value of [maxLength].
         *
         * Unlike [maxLength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_length") @ExcludeMissing fun _maxLength(): JsonField<Long> = maxLength

        /**
         * Returns the raw JSON value of [minLength].
         *
         * Unlike [minLength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("min_length") @ExcludeMissing fun _minLength(): JsonField<Long> = minLength

        /**
         * Returns the raw JSON value of [timeLimit].
         *
         * Unlike [timeLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("time_limit") @ExcludeMissing fun _timeLimit(): JsonField<String> = timeLimit

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

            /** Returns a mutable builder for constructing an instance of [AcceptanceCriteria]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AcceptanceCriteria]. */
        class Builder internal constructor() {

            private var acceptableCharacters: JsonField<String> = JsonMissing.of()
            private var acceptableValues: JsonField<MutableList<String>>? = null
            private var localityLimit: JsonField<String> = JsonMissing.of()
            private var maxLength: JsonField<Long> = JsonMissing.of()
            private var minLength: JsonField<Long> = JsonMissing.of()
            private var timeLimit: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(acceptanceCriteria: AcceptanceCriteria) = apply {
                acceptableCharacters = acceptanceCriteria.acceptableCharacters
                acceptableValues = acceptanceCriteria.acceptableValues.map { it.toMutableList() }
                localityLimit = acceptanceCriteria.localityLimit
                maxLength = acceptanceCriteria.maxLength
                minLength = acceptanceCriteria.minLength
                timeLimit = acceptanceCriteria.timeLimit
                additionalProperties = acceptanceCriteria.additionalProperties.toMutableMap()
            }

            /** Specifies the allowed characters as a string */
            fun acceptableCharacters(acceptableCharacters: String) =
                acceptableCharacters(JsonField.of(acceptableCharacters))

            /**
             * Sets [Builder.acceptableCharacters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptableCharacters] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun acceptableCharacters(acceptableCharacters: JsonField<String>) = apply {
                this.acceptableCharacters = acceptableCharacters
            }

            /**
             * Specifies the list of strictly possible values for the requirement. Ignored when
             * empty
             */
            fun acceptableValues(acceptableValues: List<String>) =
                acceptableValues(JsonField.of(acceptableValues))

            /**
             * Sets [Builder.acceptableValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptableValues] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun acceptableValues(acceptableValues: JsonField<List<String>>) = apply {
                this.acceptableValues = acceptableValues.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [acceptableValues].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAcceptableValue(acceptableValue: String) = apply {
                acceptableValues =
                    (acceptableValues ?: JsonField.of(mutableListOf())).also {
                        checkKnown("acceptableValues", it).add(acceptableValue)
                    }
            }

            /** Specifies geography-based acceptance criteria */
            fun localityLimit(localityLimit: String) = localityLimit(JsonField.of(localityLimit))

            /**
             * Sets [Builder.localityLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.localityLimit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun localityLimit(localityLimit: JsonField<String>) = apply {
                this.localityLimit = localityLimit
            }

            /** Maximum length allowed for the value */
            fun maxLength(maxLength: Long) = maxLength(JsonField.of(maxLength))

            /**
             * Sets [Builder.maxLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxLength] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxLength(maxLength: JsonField<Long>) = apply { this.maxLength = maxLength }

            /** Minimum length allowed for the value */
            fun minLength(minLength: Long) = minLength(JsonField.of(minLength))

            /**
             * Sets [Builder.minLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minLength] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minLength(minLength: JsonField<Long>) = apply { this.minLength = minLength }

            /** Specifies time-based acceptance criteria */
            fun timeLimit(timeLimit: String) = timeLimit(JsonField.of(timeLimit))

            /**
             * Sets [Builder.timeLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeLimit] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeLimit(timeLimit: JsonField<String>) = apply { this.timeLimit = timeLimit }

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
             * Returns an immutable instance of [AcceptanceCriteria].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AcceptanceCriteria =
                AcceptanceCriteria(
                    acceptableCharacters,
                    (acceptableValues ?: JsonMissing.of()).map { it.toImmutable() },
                    localityLimit,
                    maxLength,
                    minLength,
                    timeLimit,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AcceptanceCriteria = apply {
            if (validated) {
                return@apply
            }

            acceptableCharacters()
            acceptableValues()
            localityLimit()
            maxLength()
            minLength()
            timeLimit()
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
            (if (acceptableCharacters.asKnown().isPresent) 1 else 0) +
                (acceptableValues.asKnown().getOrNull()?.size ?: 0) +
                (if (localityLimit.asKnown().isPresent) 1 else 0) +
                (if (maxLength.asKnown().isPresent) 1 else 0) +
                (if (minLength.asKnown().isPresent) 1 else 0) +
                (if (timeLimit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AcceptanceCriteria &&
                acceptableCharacters == other.acceptableCharacters &&
                acceptableValues == other.acceptableValues &&
                localityLimit == other.localityLimit &&
                maxLength == other.maxLength &&
                minLength == other.minLength &&
                timeLimit == other.timeLimit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                acceptableCharacters,
                acceptableValues,
                localityLimit,
                maxLength,
                minLength,
                timeLimit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AcceptanceCriteria{acceptableCharacters=$acceptableCharacters, acceptableValues=$acceptableValues, localityLimit=$localityLimit, maxLength=$maxLength, minLength=$minLength, timeLimit=$timeLimit, additionalProperties=$additionalProperties}"
    }

    /** Defines the type of this requirement type */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DOCUMENT = of("document")

            @JvmField val ADDRESS = of("address")

            @JvmField val TEXTUAL = of("textual")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            DOCUMENT,
            ADDRESS,
            TEXTUAL,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DOCUMENT,
            ADDRESS,
            TEXTUAL,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                DOCUMENT -> Value.DOCUMENT
                ADDRESS -> Value.ADDRESS
                TEXTUAL -> Value.TEXTUAL
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
                DOCUMENT -> Known.DOCUMENT
                ADDRESS -> Known.ADDRESS
                TEXTUAL -> Known.TEXTUAL
                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocReqsRequirementType &&
            id == other.id &&
            acceptanceCriteria == other.acceptanceCriteria &&
            createdAt == other.createdAt &&
            description == other.description &&
            example == other.example &&
            name == other.name &&
            recordType == other.recordType &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            acceptanceCriteria,
            createdAt,
            description,
            example,
            name,
            recordType,
            type,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocReqsRequirementType{id=$id, acceptanceCriteria=$acceptanceCriteria, createdAt=$createdAt, description=$description, example=$example, name=$name, recordType=$recordType, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
