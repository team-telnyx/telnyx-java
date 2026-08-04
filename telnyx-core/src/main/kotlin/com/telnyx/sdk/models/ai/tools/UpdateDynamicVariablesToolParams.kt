// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Configuration for an update_dynamic_variables tool. */
class UpdateDynamicVariablesToolParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val updatableVariables: JsonField<List<UpdatableVariable>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatable_variables")
        @ExcludeMissing
        updatableVariables: JsonField<List<UpdatableVariable>> = JsonMissing.of(),
    ) : this(description, name, updatableVariables, mutableMapOf())

    /**
     * Description of the tool passed to the assistant, guiding when to call it and which variables
     * to update.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * The function name surfaced to the LLM. Must match the OpenAI function-name pattern
     * `^[a-zA-Z0-9_-]+$` and be unique across the assistant's function, webhook, and client_side
     * tools.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The dynamic variables the assistant is allowed to write. At least one is required.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatableVariables(): List<UpdatableVariable> =
        updatableVariables.getRequired("updatable_variables")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [updatableVariables].
     *
     * Unlike [updatableVariables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("updatable_variables")
    @ExcludeMissing
    fun _updatableVariables(): JsonField<List<UpdatableVariable>> = updatableVariables

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
         * [UpdateDynamicVariablesToolParams].
         *
         * The following fields are required:
         * ```java
         * .description()
         * .name()
         * .updatableVariables()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateDynamicVariablesToolParams]. */
    class Builder internal constructor() {

        private var description: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var updatableVariables: JsonField<MutableList<UpdatableVariable>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateDynamicVariablesToolParams: UpdateDynamicVariablesToolParams) =
            apply {
                description = updateDynamicVariablesToolParams.description
                name = updateDynamicVariablesToolParams.name
                updatableVariables =
                    updateDynamicVariablesToolParams.updatableVariables.map { it.toMutableList() }
                additionalProperties =
                    updateDynamicVariablesToolParams.additionalProperties.toMutableMap()
            }

        /**
         * Description of the tool passed to the assistant, guiding when to call it and which
         * variables to update.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The function name surfaced to the LLM. Must match the OpenAI function-name pattern
         * `^[a-zA-Z0-9_-]+$` and be unique across the assistant's function, webhook, and
         * client_side tools.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The dynamic variables the assistant is allowed to write. At least one is required. */
        fun updatableVariables(updatableVariables: List<UpdatableVariable>) =
            updatableVariables(JsonField.of(updatableVariables))

        /**
         * Sets [Builder.updatableVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatableVariables] with a well-typed
         * `List<UpdatableVariable>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun updatableVariables(updatableVariables: JsonField<List<UpdatableVariable>>) = apply {
            this.updatableVariables = updatableVariables.map { it.toMutableList() }
        }

        /**
         * Adds a single [UpdatableVariable] to [updatableVariables].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUpdatableVariable(updatableVariable: UpdatableVariable) = apply {
            updatableVariables =
                (updatableVariables ?: JsonField.of(mutableListOf())).also {
                    checkKnown("updatableVariables", it).add(updatableVariable)
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
         * Returns an immutable instance of [UpdateDynamicVariablesToolParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .description()
         * .name()
         * .updatableVariables()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UpdateDynamicVariablesToolParams =
            UpdateDynamicVariablesToolParams(
                checkRequired("description", description),
                checkRequired("name", name),
                checkRequired("updatableVariables", updatableVariables).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): UpdateDynamicVariablesToolParams = apply {
        if (validated) {
            return@apply
        }

        description()
        name()
        updatableVariables().forEach { it.validate() }
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
        (if (description.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (updatableVariables.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class UpdatableVariable
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val description: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(name, description, type, mutableMapOf())

        /**
         * The dynamic-variable key to update. Must match `^[a-zA-Z0-9._-]+$` and may not start with
         * the reserved `telnyx_` prefix (reserved for system variables). The `pattern` encodes both
         * rules via a negative lookahead.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Optional description of the variable, guiding the assistant on what value to capture.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Optional hint for the variable's value type (e.g. `string`).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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

            /**
             * Returns a mutable builder for constructing an instance of [UpdatableVariable].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UpdatableVariable]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(updatableVariable: UpdatableVariable) = apply {
                name = updatableVariable.name
                description = updatableVariable.description
                type = updatableVariable.type
                additionalProperties = updatableVariable.additionalProperties.toMutableMap()
            }

            /**
             * The dynamic-variable key to update. Must match `^[a-zA-Z0-9._-]+$` and may not start
             * with the reserved `telnyx_` prefix (reserved for system variables). The `pattern`
             * encodes both rules via a negative lookahead.
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Optional description of the variable, guiding the assistant on what value to capture.
             */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Optional hint for the variable's value type (e.g. `string`). */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [UpdatableVariable].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UpdatableVariable =
                UpdatableVariable(
                    checkRequired("name", name),
                    description,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): UpdatableVariable = apply {
            if (validated) {
                return@apply
            }

            name()
            description()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UpdatableVariable &&
                name == other.name &&
                description == other.description &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(name, description, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UpdatableVariable{name=$name, description=$description, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateDynamicVariablesToolParams &&
            description == other.description &&
            name == other.name &&
            updatableVariables == other.updatableVariables &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(description, name, updatableVariables, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateDynamicVariablesToolParams{description=$description, name=$name, updatableVariables=$updatableVariables, additionalProperties=$additionalProperties}"
}
