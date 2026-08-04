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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates a Liquid email template. Variables are auto-extracted when omitted. */
class EmailTemplateCreateParams
private constructor(
    private val idempotencyKey: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    /**
     * Letters, numbers, spaces, hyphens, and underscores only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Liquid template HTML body.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun htmlBody(): Optional<String> = body.htmlBody()

    /**
     * Liquid template subject.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = body.subject()

    /**
     * Liquid template text body.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textBody(): Optional<String> = body.textBody()

    /**
     * Template variables. Auto-extracted from subject/body fields when absent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun variables(): Optional<List<String>> = body.variables()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [htmlBody].
     *
     * Unlike [htmlBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _htmlBody(): JsonField<String> = body._htmlBody()

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subject(): JsonField<String> = body._subject()

    /**
     * Returns the raw JSON value of [textBody].
     *
     * Unlike [textBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _textBody(): JsonField<String> = body._textBody()

    /**
     * Returns the raw JSON value of [variables].
     *
     * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _variables(): JsonField<List<String>> = body._variables()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailTemplateCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailTemplateCreateParams]. */
    class Builder internal constructor() {

        private var idempotencyKey: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emailTemplateCreateParams: EmailTemplateCreateParams) = apply {
            idempotencyKey = emailTemplateCreateParams.idempotencyKey
            body = emailTemplateCreateParams.body.toBuilder()
            additionalHeaders = emailTemplateCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = emailTemplateCreateParams.additionalQueryParams.toBuilder()
        }

        fun idempotencyKey(idempotencyKey: String?) = apply { this.idempotencyKey = idempotencyKey }

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [htmlBody]
         * - [subject]
         * - [textBody]
         * - [variables]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Letters, numbers, spaces, hyphens, and underscores only. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Liquid template HTML body. */
        fun htmlBody(htmlBody: String?) = apply { body.htmlBody(htmlBody) }

        /** Alias for calling [Builder.htmlBody] with `htmlBody.orElse(null)`. */
        fun htmlBody(htmlBody: Optional<String>) = htmlBody(htmlBody.getOrNull())

        /**
         * Sets [Builder.htmlBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.htmlBody] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun htmlBody(htmlBody: JsonField<String>) = apply { body.htmlBody(htmlBody) }

        /** Liquid template subject. */
        fun subject(subject: String?) = apply { body.subject(subject) }

        /** Alias for calling [Builder.subject] with `subject.orElse(null)`. */
        fun subject(subject: Optional<String>) = subject(subject.getOrNull())

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { body.subject(subject) }

        /** Liquid template text body. */
        fun textBody(textBody: String?) = apply { body.textBody(textBody) }

        /** Alias for calling [Builder.textBody] with `textBody.orElse(null)`. */
        fun textBody(textBody: Optional<String>) = textBody(textBody.getOrNull())

        /**
         * Sets [Builder.textBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textBody] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun textBody(textBody: JsonField<String>) = apply { body.textBody(textBody) }

        /** Template variables. Auto-extracted from subject/body fields when absent. */
        fun variables(variables: List<String>) = apply { body.variables(variables) }

        /**
         * Sets [Builder.variables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variables] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun variables(variables: JsonField<List<String>>) = apply { body.variables(variables) }

        /**
         * Adds a single [String] to [variables].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVariable(variable: String) = apply { body.addVariable(variable) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [EmailTemplateCreateParams].
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
        fun build(): EmailTemplateCreateParams =
            EmailTemplateCreateParams(
                idempotencyKey,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers =
        com.telnyx.sdk.core.http.Headers.builder()
            .apply {
                idempotencyKey?.let { put("Idempotency-Key", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val htmlBody: JsonField<String>,
        private val subject: JsonField<String>,
        private val textBody: JsonField<String>,
        private val variables: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("html_body")
            @ExcludeMissing
            htmlBody: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text_body")
            @ExcludeMissing
            textBody: JsonField<String> = JsonMissing.of(),
            @JsonProperty("variables")
            @ExcludeMissing
            variables: JsonField<List<String>> = JsonMissing.of(),
        ) : this(name, htmlBody, subject, textBody, variables, mutableMapOf())

        /**
         * Letters, numbers, spaces, hyphens, and underscores only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Liquid template HTML body.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun htmlBody(): Optional<String> = htmlBody.getOptional("html_body")

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
         * Template variables. Auto-extracted from subject/body fields when absent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun variables(): Optional<List<String>> = variables.getOptional("variables")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [htmlBody].
         *
         * Unlike [htmlBody], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("html_body") @ExcludeMissing fun _htmlBody(): JsonField<String> = htmlBody

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
         * Returns the raw JSON value of [variables].
         *
         * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("variables")
        @ExcludeMissing
        fun _variables(): JsonField<List<String>> = variables

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var htmlBody: JsonField<String> = JsonMissing.of()
            private var subject: JsonField<String> = JsonMissing.of()
            private var textBody: JsonField<String> = JsonMissing.of()
            private var variables: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                htmlBody = body.htmlBody
                subject = body.subject
                textBody = body.textBody
                variables = body.variables.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Letters, numbers, spaces, hyphens, and underscores only. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Liquid template HTML body. */
            fun htmlBody(htmlBody: String?) = htmlBody(JsonField.ofNullable(htmlBody))

            /** Alias for calling [Builder.htmlBody] with `htmlBody.orElse(null)`. */
            fun htmlBody(htmlBody: Optional<String>) = htmlBody(htmlBody.getOrNull())

            /**
             * Sets [Builder.htmlBody] to an arbitrary JSON value.
             *
             * You should usually call [Builder.htmlBody] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun htmlBody(htmlBody: JsonField<String>) = apply { this.htmlBody = htmlBody }

            /** Liquid template subject. */
            fun subject(subject: String?) = subject(JsonField.ofNullable(subject))

            /** Alias for calling [Builder.subject] with `subject.orElse(null)`. */
            fun subject(subject: Optional<String>) = subject(subject.getOrNull())

            /**
             * Sets [Builder.subject] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subject] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subject(subject: JsonField<String>) = apply { this.subject = subject }

            /** Liquid template text body. */
            fun textBody(textBody: String?) = textBody(JsonField.ofNullable(textBody))

            /** Alias for calling [Builder.textBody] with `textBody.orElse(null)`. */
            fun textBody(textBody: Optional<String>) = textBody(textBody.getOrNull())

            /**
             * Sets [Builder.textBody] to an arbitrary JSON value.
             *
             * You should usually call [Builder.textBody] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun textBody(textBody: JsonField<String>) = apply { this.textBody = textBody }

            /** Template variables. Auto-extracted from subject/body fields when absent. */
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
             * Returns an immutable instance of [Body].
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
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    htmlBody,
                    subject,
                    textBody,
                    (variables ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            htmlBody()
            subject()
            textBody()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (htmlBody.asKnown().isPresent) 1 else 0) +
                (if (subject.asKnown().isPresent) 1 else 0) +
                (if (textBody.asKnown().isPresent) 1 else 0) +
                (variables.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                htmlBody == other.htmlBody &&
                subject == other.subject &&
                textBody == other.textBody &&
                variables == other.variables &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(name, htmlBody, subject, textBody, variables, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, htmlBody=$htmlBody, subject=$subject, textBody=$textBody, variables=$variables, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailTemplateCreateParams &&
            idempotencyKey == other.idempotencyKey &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(idempotencyKey, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EmailTemplateCreateParams{idempotencyKey=$idempotencyKey, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
