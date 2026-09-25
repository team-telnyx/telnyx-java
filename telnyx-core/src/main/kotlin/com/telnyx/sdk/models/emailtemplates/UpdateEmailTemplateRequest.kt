// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class UpdateEmailTemplateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val autoescape: JsonField<Boolean>,
    private val htmlBody: JsonField<String>,
    private val name: JsonField<String>,
    private val strictVariables: JsonField<Boolean>,
    private val subject: JsonField<String>,
    private val textBody: JsonField<String>,
    private val variableSchema: JsonField<VariableSchema>,
    private val variables: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("autoescape")
        @ExcludeMissing
        autoescape: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("html_body") @ExcludeMissing htmlBody: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("strict_variables")
        @ExcludeMissing
        strictVariables: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text_body") @ExcludeMissing textBody: JsonField<String> = JsonMissing.of(),
        @JsonProperty("variable_schema")
        @ExcludeMissing
        variableSchema: JsonField<VariableSchema> = JsonMissing.of(),
        @JsonProperty("variables")
        @ExcludeMissing
        variables: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        autoescape,
        htmlBody,
        name,
        strictVariables,
        subject,
        textBody,
        variableSchema,
        variables,
        mutableMapOf(),
    )

    /**
     * Per-template HTML autoescaping setting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoescape(): Optional<Boolean> = autoescape.getOptional("autoescape")

    /**
     * Liquid template HTML body.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun htmlBody(): Optional<String> = htmlBody.getOptional("html_body")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Per-template strict variable-validation setting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun strictVariables(): Optional<Boolean> = strictVariables.getOptional("strict_variables")

    /**
     * Liquid template subject.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = subject.getOptional("subject")

    /**
     * Liquid template text body.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textBody(): Optional<String> = textBody.getOptional("text_body")

    /**
     * Structured variable requirements. Required variables cannot define defaults; invalid
     * combinations return 422. Set to `null` to clear the schema.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun variableSchema(): Optional<VariableSchema> = variableSchema.getOptional("variable_schema")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun variables(): Optional<List<String>> = variables.getOptional("variables")

    /**
     * Returns the raw JSON value of [autoescape].
     *
     * Unlike [autoescape], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("autoescape") @ExcludeMissing fun _autoescape(): JsonField<Boolean> = autoescape

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
     * Returns the raw JSON value of [strictVariables].
     *
     * Unlike [strictVariables], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("strict_variables")
    @ExcludeMissing
    fun _strictVariables(): JsonField<Boolean> = strictVariables

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

    /**
     * Returns the raw JSON value of [textBody].
     *
     * Unlike [textBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_body") @ExcludeMissing fun _textBody(): JsonField<String> = textBody

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
         * Returns a mutable builder for constructing an instance of [UpdateEmailTemplateRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateEmailTemplateRequest]. */
    class Builder internal constructor() {

        private var autoescape: JsonField<Boolean> = JsonMissing.of()
        private var htmlBody: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var strictVariables: JsonField<Boolean> = JsonMissing.of()
        private var subject: JsonField<String> = JsonMissing.of()
        private var textBody: JsonField<String> = JsonMissing.of()
        private var variableSchema: JsonField<VariableSchema> = JsonMissing.of()
        private var variables: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateEmailTemplateRequest: UpdateEmailTemplateRequest) = apply {
            autoescape = updateEmailTemplateRequest.autoescape
            htmlBody = updateEmailTemplateRequest.htmlBody
            name = updateEmailTemplateRequest.name
            strictVariables = updateEmailTemplateRequest.strictVariables
            subject = updateEmailTemplateRequest.subject
            textBody = updateEmailTemplateRequest.textBody
            variableSchema = updateEmailTemplateRequest.variableSchema
            variables = updateEmailTemplateRequest.variables.map { it.toMutableList() }
            additionalProperties = updateEmailTemplateRequest.additionalProperties.toMutableMap()
        }

        /** Per-template HTML autoescaping setting. */
        fun autoescape(autoescape: Boolean) = autoescape(JsonField.of(autoescape))

        /**
         * Sets [Builder.autoescape] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoescape] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoescape(autoescape: JsonField<Boolean>) = apply { this.autoescape = autoescape }

        /** Liquid template HTML body. */
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

        /** Per-template strict variable-validation setting. */
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

        /** Liquid template subject. */
        fun subject(subject: String?) = subject(JsonField.ofNullable(subject))

        /** Alias for calling [Builder.subject] with `subject.orElse(null)`. */
        fun subject(subject: Optional<String>) = subject(subject.getOrNull())

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { this.subject = subject }

        /** Liquid template text body. */
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

        /**
         * Structured variable requirements. Required variables cannot define defaults; invalid
         * combinations return 422. Set to `null` to clear the schema.
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
         * Returns an immutable instance of [UpdateEmailTemplateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UpdateEmailTemplateRequest =
            UpdateEmailTemplateRequest(
                autoescape,
                htmlBody,
                name,
                strictVariables,
                subject,
                textBody,
                variableSchema,
                (variables ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): UpdateEmailTemplateRequest = apply {
        if (validated) {
            return@apply
        }

        autoescape()
        htmlBody()
        name()
        strictVariables()
        subject()
        textBody()
        variableSchema().ifPresent { it.validate() }
        variables()
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
        (if (autoescape.asKnown().isPresent) 1 else 0) +
            (if (htmlBody.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (strictVariables.asKnown().isPresent) 1 else 0) +
            (if (subject.asKnown().isPresent) 1 else 0) +
            (if (textBody.asKnown().isPresent) 1 else 0) +
            (variableSchema.asKnown().getOrNull()?.validity() ?: 0) +
            (variables.asKnown().getOrNull()?.size ?: 0)

    /**
     * Structured variable requirements. Required variables cannot define defaults; invalid
     * combinations return 422. Set to `null` to clear the schema.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateEmailTemplateRequest &&
            autoescape == other.autoescape &&
            htmlBody == other.htmlBody &&
            name == other.name &&
            strictVariables == other.strictVariables &&
            subject == other.subject &&
            textBody == other.textBody &&
            variableSchema == other.variableSchema &&
            variables == other.variables &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            autoescape,
            htmlBody,
            name,
            strictVariables,
            subject,
            textBody,
            variableSchema,
            variables,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateEmailTemplateRequest{autoescape=$autoescape, htmlBody=$htmlBody, name=$name, strictVariables=$strictVariables, subject=$subject, textBody=$textBody, variableSchema=$variableSchema, variables=$variables, additionalProperties=$additionalProperties}"
}
