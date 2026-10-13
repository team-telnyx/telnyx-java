// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailTemplateCommon
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val autoescape: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val htmlBody: JsonField<String>,
    private val name: JsonField<String>,
    private val recordType: JsonField<RecordType>,
    private val strictVariables: JsonField<Boolean>,
    private val textBody: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val variableSchema: JsonField<VariableSchema>,
    private val variables: JsonField<List<String>>,
    private val variablesMode: JsonField<VariablesMode>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("autoescape")
        @ExcludeMissing
        autoescape: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("html_body") @ExcludeMissing htmlBody: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("strict_variables")
        @ExcludeMissing
        strictVariables: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("text_body") @ExcludeMissing textBody: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("variable_schema")
        @ExcludeMissing
        variableSchema: JsonField<VariableSchema> = JsonMissing.of(),
        @JsonProperty("variables")
        @ExcludeMissing
        variables: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("variables_mode")
        @ExcludeMissing
        variablesMode: JsonField<VariablesMode> = JsonMissing.of(),
    ) : this(
        id,
        autoescape,
        createdAt,
        htmlBody,
        name,
        recordType,
        strictVariables,
        textBody,
        updatedAt,
        variableSchema,
        variables,
        variablesMode,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Whether HTML autoescaping is enabled for this template. When `true`, only rendered
     * `html_body` expression output is HTML-escaped at the output boundary; `subject` and
     * `text_body` are never autoescaped.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun autoescape(): Boolean = autoescape.getRequired("autoescape")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun htmlBody(): Optional<String> = htmlBody.getOptional("html_body")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordType(): RecordType = recordType.getRequired("record_type")

    /**
     * Whether strict variable validation is enabled for this template. When `true`, sends and
     * renders that are missing a variable marked `required: true` in `variable_schema` fail with
     * 422 naming the variable.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun strictVariables(): Boolean = strictVariables.getRequired("strict_variables")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textBody(): Optional<String> = textBody.getOptional("text_body")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Structured variable requirements, or `null` when the template uses only the legacy
     * `variables` array.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun variableSchema(): Optional<VariableSchema> = variableSchema.getOptional("variable_schema")

    /**
     * Persisted variable names. In `explicit` mode this array preserves the exact provided order,
     * duplicates, and string contents; in `automatic` mode it is derived from the stored subject
     * and bodies.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun variables(): List<String> = variables.getRequired("variables")

    /**
     * `automatic` when variable names are derived from template content; `explicit` when
     * `variables` is the exact manually managed array.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun variablesMode(): VariablesMode = variablesMode.getRequired("variables_mode")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [autoescape].
     *
     * Unlike [autoescape], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("autoescape") @ExcludeMissing fun _autoescape(): JsonField<Boolean> = autoescape

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [htmlBody].
     *
     * Unlike [htmlBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("html_body") @ExcludeMissing fun _htmlBody(): JsonField<String> = htmlBody

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
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [strictVariables].
     *
     * Unlike [strictVariables], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("strict_variables")
    @ExcludeMissing
    fun _strictVariables(): JsonField<Boolean> = strictVariables

    /**
     * Returns the raw JSON value of [textBody].
     *
     * Unlike [textBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_body") @ExcludeMissing fun _textBody(): JsonField<String> = textBody

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [variableSchema].
     *
     * Unlike [variableSchema], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("variable_schema")
    @ExcludeMissing
    fun _variableSchema(): JsonField<VariableSchema> = variableSchema

    /**
     * Returns the raw JSON value of [variables].
     *
     * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("variables") @ExcludeMissing fun _variables(): JsonField<List<String>> = variables

    /**
     * Returns the raw JSON value of [variablesMode].
     *
     * Unlike [variablesMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("variables_mode")
    @ExcludeMissing
    fun _variablesMode(): JsonField<VariablesMode> = variablesMode

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
         * Returns a mutable builder for constructing an instance of [EmailTemplateCommon].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .autoescape()
         * .createdAt()
         * .htmlBody()
         * .name()
         * .recordType()
         * .strictVariables()
         * .textBody()
         * .updatedAt()
         * .variableSchema()
         * .variables()
         * .variablesMode()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailTemplateCommon]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var autoescape: JsonField<Boolean>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var htmlBody: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var recordType: JsonField<RecordType>? = null
        private var strictVariables: JsonField<Boolean>? = null
        private var textBody: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var variableSchema: JsonField<VariableSchema>? = null
        private var variables: JsonField<MutableList<String>>? = null
        private var variablesMode: JsonField<VariablesMode>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailTemplateCommon: EmailTemplateCommon) = apply {
            id = emailTemplateCommon.id
            autoescape = emailTemplateCommon.autoescape
            createdAt = emailTemplateCommon.createdAt
            htmlBody = emailTemplateCommon.htmlBody
            name = emailTemplateCommon.name
            recordType = emailTemplateCommon.recordType
            strictVariables = emailTemplateCommon.strictVariables
            textBody = emailTemplateCommon.textBody
            updatedAt = emailTemplateCommon.updatedAt
            variableSchema = emailTemplateCommon.variableSchema
            variables = emailTemplateCommon.variables.map { it.toMutableList() }
            variablesMode = emailTemplateCommon.variablesMode
            additionalProperties = emailTemplateCommon.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Whether HTML autoescaping is enabled for this template. When `true`, only rendered
         * `html_body` expression output is HTML-escaped at the output boundary; `subject` and
         * `text_body` are never autoescaped.
         */
        fun autoescape(autoescape: Boolean) = autoescape(JsonField.of(autoescape))

        /**
         * Sets [Builder.autoescape] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoescape] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoescape(autoescape: JsonField<Boolean>) = apply { this.autoescape = autoescape }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun htmlBody(htmlBody: String?) = htmlBody(JsonField.ofNullable(htmlBody))

        /** Alias for calling [Builder.htmlBody] with `htmlBody.orElse(null)`. */
        fun htmlBody(htmlBody: Optional<String>) = htmlBody(htmlBody.getOrNull())

        /**
         * Sets [Builder.htmlBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.htmlBody] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun htmlBody(htmlBody: JsonField<String>) = apply { this.htmlBody = htmlBody }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        /**
         * Whether strict variable validation is enabled for this template. When `true`, sends and
         * renders that are missing a variable marked `required: true` in `variable_schema` fail
         * with 422 naming the variable.
         */
        fun strictVariables(strictVariables: Boolean) =
            strictVariables(JsonField.of(strictVariables))

        /**
         * Sets [Builder.strictVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.strictVariables] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun strictVariables(strictVariables: JsonField<Boolean>) = apply {
            this.strictVariables = strictVariables
        }

        fun textBody(textBody: String?) = textBody(JsonField.ofNullable(textBody))

        /** Alias for calling [Builder.textBody] with `textBody.orElse(null)`. */
        fun textBody(textBody: Optional<String>) = textBody(textBody.getOrNull())

        /**
         * Sets [Builder.textBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textBody] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun textBody(textBody: JsonField<String>) = apply { this.textBody = textBody }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * Structured variable requirements, or `null` when the template uses only the legacy
         * `variables` array.
         */
        fun variableSchema(variableSchema: VariableSchema?) =
            variableSchema(JsonField.ofNullable(variableSchema))

        /** Alias for calling [Builder.variableSchema] with `variableSchema.orElse(null)`. */
        fun variableSchema(variableSchema: Optional<VariableSchema>) =
            variableSchema(variableSchema.getOrNull())

        /**
         * Sets [Builder.variableSchema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variableSchema] with a well-typed [VariableSchema] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun variableSchema(variableSchema: JsonField<VariableSchema>) = apply {
            this.variableSchema = variableSchema
        }

        /**
         * Persisted variable names. In `explicit` mode this array preserves the exact provided
         * order, duplicates, and string contents; in `automatic` mode it is derived from the stored
         * subject and bodies.
         */
        fun variables(variables: List<String>) = variables(JsonField.of(variables))

        /**
         * Sets [Builder.variables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variables] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun variables(variables: JsonField<List<String>>) = apply {
            this.variables = variables.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [variables].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVariable(variable: String) = apply {
            variables =
                (variables ?: JsonField.of(mutableListOf())).also {
                    checkKnown("variables", it).add(variable)
                }
        }

        /**
         * `automatic` when variable names are derived from template content; `explicit` when
         * `variables` is the exact manually managed array.
         */
        fun variablesMode(variablesMode: VariablesMode) = variablesMode(JsonField.of(variablesMode))

        /**
         * Sets [Builder.variablesMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variablesMode] with a well-typed [VariablesMode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun variablesMode(variablesMode: JsonField<VariablesMode>) = apply {
            this.variablesMode = variablesMode
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
         * Returns an immutable instance of [EmailTemplateCommon].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .autoescape()
         * .createdAt()
         * .htmlBody()
         * .name()
         * .recordType()
         * .strictVariables()
         * .textBody()
         * .updatedAt()
         * .variableSchema()
         * .variables()
         * .variablesMode()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailTemplateCommon =
            EmailTemplateCommon(
                checkRequired("id", id),
                checkRequired("autoescape", autoescape),
                checkRequired("createdAt", createdAt),
                checkRequired("htmlBody", htmlBody),
                checkRequired("name", name),
                checkRequired("recordType", recordType),
                checkRequired("strictVariables", strictVariables),
                checkRequired("textBody", textBody),
                checkRequired("updatedAt", updatedAt),
                checkRequired("variableSchema", variableSchema),
                checkRequired("variables", variables).map { it.toImmutable() },
                checkRequired("variablesMode", variablesMode),
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
    fun validate(): EmailTemplateCommon = apply {
        if (validated) {
            return@apply
        }

        id()
        autoescape()
        createdAt()
        htmlBody()
        name()
        recordType().validate()
        strictVariables()
        textBody()
        updatedAt()
        variableSchema().ifPresent { it.validate() }
        variables()
        variablesMode().validate()
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
            (if (autoescape.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (htmlBody.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (strictVariables.asKnown().isPresent) 1 else 0) +
            (if (textBody.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (variableSchema.asKnown().getOrNull()?.validity() ?: 0) +
            (variables.asKnown().getOrNull()?.size ?: 0) +
            (variablesMode.asKnown().getOrNull()?.validity() ?: 0)

    class RecordType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val EMAIL_TEMPLATE = of("email_template")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            EMAIL_TEMPLATE
        }

        /**
         * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EMAIL_TEMPLATE,
            /**
             * An enum member indicating that [RecordType] was instantiated with an unknown value.
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
                EMAIL_TEMPLATE -> Value.EMAIL_TEMPLATE
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
                EMAIL_TEMPLATE -> Known.EMAIL_TEMPLATE
                else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    /**
     * Structured variable requirements, or `null` when the template uses only the legacy
     * `variables` array.
     */
    class VariableSchema
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

            /** Returns a mutable builder for constructing an instance of [VariableSchema]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VariableSchema]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(variableSchema: VariableSchema) = apply {
                additionalProperties = variableSchema.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [VariableSchema].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): VariableSchema = VariableSchema(additionalProperties.toImmutable())
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
        fun validate(): VariableSchema = apply {
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VariableSchema && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "VariableSchema{additionalProperties=$additionalProperties}"
    }

    /**
     * `automatic` when variable names are derived from template content; `explicit` when
     * `variables` is the exact manually managed array.
     */
    class VariablesMode @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val AUTOMATIC = of("automatic")

            @JvmField val EXPLICIT = of("explicit")

            @JvmStatic fun of(value: String) = VariablesMode(JsonField.of(value))
        }

        /** An enum containing [VariablesMode]'s known values. */
        enum class Known {
            AUTOMATIC,
            EXPLICIT,
        }

        /**
         * An enum containing [VariablesMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VariablesMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTOMATIC,
            EXPLICIT,
            /**
             * An enum member indicating that [VariablesMode] was instantiated with an unknown
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
                AUTOMATIC -> Value.AUTOMATIC
                EXPLICIT -> Value.EXPLICIT
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
                AUTOMATIC -> Known.AUTOMATIC
                EXPLICIT -> Known.EXPLICIT
                else -> throw TelnyxInvalidDataException("Unknown VariablesMode: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): VariablesMode = apply {
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

            return other is VariablesMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailTemplateCommon &&
            id == other.id &&
            autoescape == other.autoescape &&
            createdAt == other.createdAt &&
            htmlBody == other.htmlBody &&
            name == other.name &&
            recordType == other.recordType &&
            strictVariables == other.strictVariables &&
            textBody == other.textBody &&
            updatedAt == other.updatedAt &&
            variableSchema == other.variableSchema &&
            variables == other.variables &&
            variablesMode == other.variablesMode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            autoescape,
            createdAt,
            htmlBody,
            name,
            recordType,
            strictVariables,
            textBody,
            updatedAt,
            variableSchema,
            variables,
            variablesMode,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailTemplateCommon{id=$id, autoescape=$autoescape, createdAt=$createdAt, htmlBody=$htmlBody, name=$name, recordType=$recordType, strictVariables=$strictVariables, textBody=$textBody, updatedAt=$updatedAt, variableSchema=$variableSchema, variables=$variables, variablesMode=$variablesMode, additionalProperties=$additionalProperties}"
}
