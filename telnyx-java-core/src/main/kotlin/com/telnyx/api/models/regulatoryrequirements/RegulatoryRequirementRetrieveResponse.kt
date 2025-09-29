// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.regulatoryrequirements

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RegulatoryRequirementRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
         * [RegulatoryRequirementRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RegulatoryRequirementRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            regulatoryRequirementRetrieveResponse: RegulatoryRequirementRetrieveResponse
        ) = apply {
            data = regulatoryRequirementRetrieveResponse.data.map { it.toMutableList() }
            additionalProperties =
                regulatoryRequirementRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [RegulatoryRequirementRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RegulatoryRequirementRetrieveResponse =
            RegulatoryRequirementRetrieveResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RegulatoryRequirementRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val action: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val phoneNumberType: JsonField<String>,
        private val regulatoryRequirements: JsonField<List<RegulatoryRequirement>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action") @ExcludeMissing action: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country_code")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number_type")
            @ExcludeMissing
            phoneNumberType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("regulatory_requirements")
            @ExcludeMissing
            regulatoryRequirements: JsonField<List<RegulatoryRequirement>> = JsonMissing.of(),
        ) : this(action, countryCode, phoneNumberType, regulatoryRequirements, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun action(): Optional<String> = action.getOptional("action")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberType(): Optional<String> = phoneNumberType.getOptional("phone_number_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regulatoryRequirements(): Optional<List<RegulatoryRequirement>> =
            regulatoryRequirements.getOptional("regulatory_requirements")

        /**
         * Returns the raw JSON value of [action].
         *
         * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<String> = action

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country_code")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [phoneNumberType].
         *
         * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_number_type")
        @ExcludeMissing
        fun _phoneNumberType(): JsonField<String> = phoneNumberType

        /**
         * Returns the raw JSON value of [regulatoryRequirements].
         *
         * Unlike [regulatoryRequirements], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("regulatory_requirements")
        @ExcludeMissing
        fun _regulatoryRequirements(): JsonField<List<RegulatoryRequirement>> =
            regulatoryRequirements

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

            private var action: JsonField<String> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var phoneNumberType: JsonField<String> = JsonMissing.of()
            private var regulatoryRequirements: JsonField<MutableList<RegulatoryRequirement>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                action = data.action
                countryCode = data.countryCode
                phoneNumberType = data.phoneNumberType
                regulatoryRequirements = data.regulatoryRequirements.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun action(action: String) = action(JsonField.of(action))

            /**
             * Sets [Builder.action] to an arbitrary JSON value.
             *
             * You should usually call [Builder.action] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun action(action: JsonField<String>) = apply { this.action = action }

            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
            }

            fun phoneNumberType(phoneNumberType: String) =
                phoneNumberType(JsonField.of(phoneNumberType))

            /**
             * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumberType(phoneNumberType: JsonField<String>) = apply {
                this.phoneNumberType = phoneNumberType
            }

            fun regulatoryRequirements(regulatoryRequirements: List<RegulatoryRequirement>) =
                regulatoryRequirements(JsonField.of(regulatoryRequirements))

            /**
             * Sets [Builder.regulatoryRequirements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regulatoryRequirements] with a well-typed
             * `List<RegulatoryRequirement>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun regulatoryRequirements(
                regulatoryRequirements: JsonField<List<RegulatoryRequirement>>
            ) = apply {
                this.regulatoryRequirements = regulatoryRequirements.map { it.toMutableList() }
            }

            /**
             * Adds a single [RegulatoryRequirement] to [regulatoryRequirements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRegulatoryRequirement(regulatoryRequirement: RegulatoryRequirement) = apply {
                regulatoryRequirements =
                    (regulatoryRequirements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("regulatoryRequirements", it).add(regulatoryRequirement)
                    }
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
                    action,
                    countryCode,
                    phoneNumberType,
                    (regulatoryRequirements ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            action()
            countryCode()
            phoneNumberType()
            regulatoryRequirements().ifPresent { it.forEach { it.validate() } }
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
            (if (action.asKnown().isPresent) 1 else 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (phoneNumberType.asKnown().isPresent) 1 else 0) +
                (regulatoryRequirements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class RegulatoryRequirement
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val acceptanceCriteria: JsonField<AcceptanceCriteria>,
            private val description: JsonField<String>,
            private val example: JsonField<String>,
            private val fieldType: JsonField<String>,
            private val name: JsonField<String>,
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
                @JsonProperty("field_type")
                @ExcludeMissing
                fieldType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(id, acceptanceCriteria, description, example, fieldType, name, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun acceptanceCriteria(): Optional<AcceptanceCriteria> =
                acceptanceCriteria.getOptional("acceptance_criteria")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun example(): Optional<String> = example.getOptional("example")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fieldType(): Optional<String> = fieldType.getOptional("field_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

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
             * Returns the raw JSON value of [fieldType].
             *
             * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("field_type")
            @ExcludeMissing
            fun _fieldType(): JsonField<String> = fieldType

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * [RegulatoryRequirement].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RegulatoryRequirement]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var acceptanceCriteria: JsonField<AcceptanceCriteria> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var example: JsonField<String> = JsonMissing.of()
                private var fieldType: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(regulatoryRequirement: RegulatoryRequirement) = apply {
                    id = regulatoryRequirement.id
                    acceptanceCriteria = regulatoryRequirement.acceptanceCriteria
                    description = regulatoryRequirement.description
                    example = regulatoryRequirement.example
                    fieldType = regulatoryRequirement.fieldType
                    name = regulatoryRequirement.name
                    additionalProperties = regulatoryRequirement.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun example(example: String) = example(JsonField.of(example))

                /**
                 * Sets [Builder.example] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.example] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun example(example: JsonField<String>) = apply { this.example = example }

                fun fieldType(fieldType: String) = fieldType(JsonField.of(fieldType))

                /**
                 * Sets [Builder.fieldType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fieldType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fieldType(fieldType: JsonField<String>) = apply { this.fieldType = fieldType }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [RegulatoryRequirement].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RegulatoryRequirement =
                    RegulatoryRequirement(
                        id,
                        acceptanceCriteria,
                        description,
                        example,
                        fieldType,
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RegulatoryRequirement = apply {
                if (validated) {
                    return@apply
                }

                id()
                acceptanceCriteria().ifPresent { it.validate() }
                description()
                example()
                fieldType()
                name()
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
                    (if (fieldType.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

            class AcceptanceCriteria
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val acceptableCharacters: JsonField<String>,
                private val acceptableValues: JsonField<List<String>>,
                private val caseSensitive: JsonField<String>,
                private val localityLimit: JsonField<String>,
                private val maxLength: JsonField<String>,
                private val minLength: JsonField<String>,
                private val regex: JsonField<String>,
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
                    @JsonProperty("case_sensitive")
                    @ExcludeMissing
                    caseSensitive: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("locality_limit")
                    @ExcludeMissing
                    localityLimit: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("max_length")
                    @ExcludeMissing
                    maxLength: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("min_length")
                    @ExcludeMissing
                    minLength: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("regex")
                    @ExcludeMissing
                    regex: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("time_limit")
                    @ExcludeMissing
                    timeLimit: JsonField<String> = JsonMissing.of(),
                ) : this(
                    acceptableCharacters,
                    acceptableValues,
                    caseSensitive,
                    localityLimit,
                    maxLength,
                    minLength,
                    regex,
                    timeLimit,
                    mutableMapOf(),
                )

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun acceptableCharacters(): Optional<String> =
                    acceptableCharacters.getOptional("acceptable_characters")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun acceptableValues(): Optional<List<String>> =
                    acceptableValues.getOptional("acceptable_values")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun caseSensitive(): Optional<String> = caseSensitive.getOptional("case_sensitive")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun localityLimit(): Optional<String> = localityLimit.getOptional("locality_limit")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun maxLength(): Optional<String> = maxLength.getOptional("max_length")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun minLength(): Optional<String> = minLength.getOptional("min_length")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun regex(): Optional<String> = regex.getOptional("regex")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
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
                 * Unlike [acceptableValues], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("acceptable_values")
                @ExcludeMissing
                fun _acceptableValues(): JsonField<List<String>> = acceptableValues

                /**
                 * Returns the raw JSON value of [caseSensitive].
                 *
                 * Unlike [caseSensitive], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("case_sensitive")
                @ExcludeMissing
                fun _caseSensitive(): JsonField<String> = caseSensitive

                /**
                 * Returns the raw JSON value of [localityLimit].
                 *
                 * Unlike [localityLimit], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("locality_limit")
                @ExcludeMissing
                fun _localityLimit(): JsonField<String> = localityLimit

                /**
                 * Returns the raw JSON value of [maxLength].
                 *
                 * Unlike [maxLength], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("max_length")
                @ExcludeMissing
                fun _maxLength(): JsonField<String> = maxLength

                /**
                 * Returns the raw JSON value of [minLength].
                 *
                 * Unlike [minLength], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("min_length")
                @ExcludeMissing
                fun _minLength(): JsonField<String> = minLength

                /**
                 * Returns the raw JSON value of [regex].
                 *
                 * Unlike [regex], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("regex") @ExcludeMissing fun _regex(): JsonField<String> = regex

                /**
                 * Returns the raw JSON value of [timeLimit].
                 *
                 * Unlike [timeLimit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("time_limit")
                @ExcludeMissing
                fun _timeLimit(): JsonField<String> = timeLimit

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
                     * [AcceptanceCriteria].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AcceptanceCriteria]. */
                class Builder internal constructor() {

                    private var acceptableCharacters: JsonField<String> = JsonMissing.of()
                    private var acceptableValues: JsonField<MutableList<String>>? = null
                    private var caseSensitive: JsonField<String> = JsonMissing.of()
                    private var localityLimit: JsonField<String> = JsonMissing.of()
                    private var maxLength: JsonField<String> = JsonMissing.of()
                    private var minLength: JsonField<String> = JsonMissing.of()
                    private var regex: JsonField<String> = JsonMissing.of()
                    private var timeLimit: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(acceptanceCriteria: AcceptanceCriteria) = apply {
                        acceptableCharacters = acceptanceCriteria.acceptableCharacters
                        acceptableValues =
                            acceptanceCriteria.acceptableValues.map { it.toMutableList() }
                        caseSensitive = acceptanceCriteria.caseSensitive
                        localityLimit = acceptanceCriteria.localityLimit
                        maxLength = acceptanceCriteria.maxLength
                        minLength = acceptanceCriteria.minLength
                        regex = acceptanceCriteria.regex
                        timeLimit = acceptanceCriteria.timeLimit
                        additionalProperties =
                            acceptanceCriteria.additionalProperties.toMutableMap()
                    }

                    fun acceptableCharacters(acceptableCharacters: String) =
                        acceptableCharacters(JsonField.of(acceptableCharacters))

                    /**
                     * Sets [Builder.acceptableCharacters] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.acceptableCharacters] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun acceptableCharacters(acceptableCharacters: JsonField<String>) = apply {
                        this.acceptableCharacters = acceptableCharacters
                    }

                    fun acceptableValues(acceptableValues: List<String>) =
                        acceptableValues(JsonField.of(acceptableValues))

                    /**
                     * Sets [Builder.acceptableValues] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.acceptableValues] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
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

                    fun caseSensitive(caseSensitive: String) =
                        caseSensitive(JsonField.of(caseSensitive))

                    /**
                     * Sets [Builder.caseSensitive] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.caseSensitive] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun caseSensitive(caseSensitive: JsonField<String>) = apply {
                        this.caseSensitive = caseSensitive
                    }

                    fun localityLimit(localityLimit: String) =
                        localityLimit(JsonField.of(localityLimit))

                    /**
                     * Sets [Builder.localityLimit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.localityLimit] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun localityLimit(localityLimit: JsonField<String>) = apply {
                        this.localityLimit = localityLimit
                    }

                    fun maxLength(maxLength: String) = maxLength(JsonField.of(maxLength))

                    /**
                     * Sets [Builder.maxLength] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxLength] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maxLength(maxLength: JsonField<String>) = apply {
                        this.maxLength = maxLength
                    }

                    fun minLength(minLength: String) = minLength(JsonField.of(minLength))

                    /**
                     * Sets [Builder.minLength] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.minLength] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun minLength(minLength: JsonField<String>) = apply {
                        this.minLength = minLength
                    }

                    fun regex(regex: String) = regex(JsonField.of(regex))

                    /**
                     * Sets [Builder.regex] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.regex] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun regex(regex: JsonField<String>) = apply { this.regex = regex }

                    fun timeLimit(timeLimit: String) = timeLimit(JsonField.of(timeLimit))

                    /**
                     * Sets [Builder.timeLimit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timeLimit] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun timeLimit(timeLimit: JsonField<String>) = apply {
                        this.timeLimit = timeLimit
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
                        AcceptanceCriteria(
                            acceptableCharacters,
                            (acceptableValues ?: JsonMissing.of()).map { it.toImmutable() },
                            caseSensitive,
                            localityLimit,
                            maxLength,
                            minLength,
                            regex,
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
                    caseSensitive()
                    localityLimit()
                    maxLength()
                    minLength()
                    regex()
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
                        (if (caseSensitive.asKnown().isPresent) 1 else 0) +
                        (if (localityLimit.asKnown().isPresent) 1 else 0) +
                        (if (maxLength.asKnown().isPresent) 1 else 0) +
                        (if (minLength.asKnown().isPresent) 1 else 0) +
                        (if (regex.asKnown().isPresent) 1 else 0) +
                        (if (timeLimit.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AcceptanceCriteria &&
                        acceptableCharacters == other.acceptableCharacters &&
                        acceptableValues == other.acceptableValues &&
                        caseSensitive == other.caseSensitive &&
                        localityLimit == other.localityLimit &&
                        maxLength == other.maxLength &&
                        minLength == other.minLength &&
                        regex == other.regex &&
                        timeLimit == other.timeLimit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        acceptableCharacters,
                        acceptableValues,
                        caseSensitive,
                        localityLimit,
                        maxLength,
                        minLength,
                        regex,
                        timeLimit,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AcceptanceCriteria{acceptableCharacters=$acceptableCharacters, acceptableValues=$acceptableValues, caseSensitive=$caseSensitive, localityLimit=$localityLimit, maxLength=$maxLength, minLength=$minLength, regex=$regex, timeLimit=$timeLimit, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RegulatoryRequirement &&
                    id == other.id &&
                    acceptanceCriteria == other.acceptanceCriteria &&
                    description == other.description &&
                    example == other.example &&
                    fieldType == other.fieldType &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    acceptanceCriteria,
                    description,
                    example,
                    fieldType,
                    name,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RegulatoryRequirement{id=$id, acceptanceCriteria=$acceptanceCriteria, description=$description, example=$example, fieldType=$fieldType, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                action == other.action &&
                countryCode == other.countryCode &&
                phoneNumberType == other.phoneNumberType &&
                regulatoryRequirements == other.regulatoryRequirements &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                action,
                countryCode,
                phoneNumberType,
                regulatoryRequirements,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{action=$action, countryCode=$countryCode, phoneNumberType=$phoneNumberType, regulatoryRequirements=$regulatoryRequirements, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RegulatoryRequirementRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RegulatoryRequirementRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
