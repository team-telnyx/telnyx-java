// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Send an SMS message for an assistant. This endpoint:
 * 1. Validates the assistant exists and has messaging profile configured
 * 2. If should_create_conversation is true, creates a new conversation with metadata
 * 3. Sends the SMS message (If `text` is set, this will be sent. Otherwise, if this is the first
 *    message in the conversation and the assistant has a `greeting` configured, this will be sent.
 *    Otherwise the assistant will generate the text to send.)
 * 4. Updates conversation metadata if provided
 * 5. Returns the conversation ID
 */
class AssistantSendSmsParams
private constructor(
    private val assistantId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun assistantId(): Optional<String> = Optional.ofNullable(assistantId)

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): String = body.from()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = body.text()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): String = body.to()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationMetadata(): Optional<ConversationMetadata> = body.conversationMetadata()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shouldCreateConversation(): Optional<Boolean> = body.shouldCreateConversation()

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _from(): JsonField<String> = body._from()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<String> = body._text()

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _to(): JsonField<String> = body._to()

    /**
     * Returns the raw JSON value of [conversationMetadata].
     *
     * Unlike [conversationMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _conversationMetadata(): JsonField<ConversationMetadata> = body._conversationMetadata()

    /**
     * Returns the raw JSON value of [shouldCreateConversation].
     *
     * Unlike [shouldCreateConversation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _shouldCreateConversation(): JsonField<Boolean> = body._shouldCreateConversation()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AssistantSendSmsParams].
         *
         * The following fields are required:
         * ```java
         * .from()
         * .text()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssistantSendSmsParams]. */
    class Builder internal constructor() {

        private var assistantId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(assistantSendSmsParams: AssistantSendSmsParams) = apply {
            assistantId = assistantSendSmsParams.assistantId
            body = assistantSendSmsParams.body.toBuilder()
            additionalHeaders = assistantSendSmsParams.additionalHeaders.toBuilder()
            additionalQueryParams = assistantSendSmsParams.additionalQueryParams.toBuilder()
        }

        fun assistantId(assistantId: String?) = apply { this.assistantId = assistantId }

        /** Alias for calling [Builder.assistantId] with `assistantId.orElse(null)`. */
        fun assistantId(assistantId: Optional<String>) = assistantId(assistantId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [from]
         * - [text]
         * - [to]
         * - [conversationMetadata]
         * - [shouldCreateConversation]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun from(from: String) = apply { body.from(from) }

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { body.from(from) }

        fun text(text: String) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { body.text(text) }

        fun to(to: String) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { body.to(to) }

        fun conversationMetadata(conversationMetadata: ConversationMetadata) = apply {
            body.conversationMetadata(conversationMetadata)
        }

        /**
         * Sets [Builder.conversationMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationMetadata] with a well-typed
         * [ConversationMetadata] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun conversationMetadata(conversationMetadata: JsonField<ConversationMetadata>) = apply {
            body.conversationMetadata(conversationMetadata)
        }

        fun shouldCreateConversation(shouldCreateConversation: Boolean) = apply {
            body.shouldCreateConversation(shouldCreateConversation)
        }

        /**
         * Sets [Builder.shouldCreateConversation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shouldCreateConversation] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun shouldCreateConversation(shouldCreateConversation: JsonField<Boolean>) = apply {
            body.shouldCreateConversation(shouldCreateConversation)
        }

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

        fun additionalHeaders(additionalHeaders: Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
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
         * Returns an immutable instance of [AssistantSendSmsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .from()
         * .text()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssistantSendSmsParams =
            AssistantSendSmsParams(
                assistantId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> assistantId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val from: JsonField<String>,
        private val text: JsonField<String>,
        private val to: JsonField<String>,
        private val conversationMetadata: JsonField<ConversationMetadata>,
        private val shouldCreateConversation: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
            @JsonProperty("conversation_metadata")
            @ExcludeMissing
            conversationMetadata: JsonField<ConversationMetadata> = JsonMissing.of(),
            @JsonProperty("should_create_conversation")
            @ExcludeMissing
            shouldCreateConversation: JsonField<Boolean> = JsonMissing.of(),
        ) : this(from, text, to, conversationMetadata, shouldCreateConversation, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): String = from.getRequired("from")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): String = to.getRequired("to")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conversationMetadata(): Optional<ConversationMetadata> =
            conversationMetadata.getOptional("conversation_metadata")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shouldCreateConversation(): Optional<Boolean> =
            shouldCreateConversation.getOptional("should_create_conversation")

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

        /**
         * Returns the raw JSON value of [conversationMetadata].
         *
         * Unlike [conversationMetadata], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("conversation_metadata")
        @ExcludeMissing
        fun _conversationMetadata(): JsonField<ConversationMetadata> = conversationMetadata

        /**
         * Returns the raw JSON value of [shouldCreateConversation].
         *
         * Unlike [shouldCreateConversation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("should_create_conversation")
        @ExcludeMissing
        fun _shouldCreateConversation(): JsonField<Boolean> = shouldCreateConversation

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
             * .from()
             * .text()
             * .to()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var from: JsonField<String>? = null
            private var text: JsonField<String>? = null
            private var to: JsonField<String>? = null
            private var conversationMetadata: JsonField<ConversationMetadata> = JsonMissing.of()
            private var shouldCreateConversation: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                from = body.from
                text = body.text
                to = body.to
                conversationMetadata = body.conversationMetadata
                shouldCreateConversation = body.shouldCreateConversation
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun from(from: String) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<String>) = apply { this.from = from }

            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            fun to(to: String) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<String>) = apply { this.to = to }

            fun conversationMetadata(conversationMetadata: ConversationMetadata) =
                conversationMetadata(JsonField.of(conversationMetadata))

            /**
             * Sets [Builder.conversationMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conversationMetadata] with a well-typed
             * [ConversationMetadata] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun conversationMetadata(conversationMetadata: JsonField<ConversationMetadata>) =
                apply {
                    this.conversationMetadata = conversationMetadata
                }

            fun shouldCreateConversation(shouldCreateConversation: Boolean) =
                shouldCreateConversation(JsonField.of(shouldCreateConversation))

            /**
             * Sets [Builder.shouldCreateConversation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shouldCreateConversation] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun shouldCreateConversation(shouldCreateConversation: JsonField<Boolean>) = apply {
                this.shouldCreateConversation = shouldCreateConversation
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
             * .from()
             * .text()
             * .to()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("from", from),
                    checkRequired("text", text),
                    checkRequired("to", to),
                    conversationMetadata,
                    shouldCreateConversation,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            from()
            text()
            to()
            conversationMetadata().ifPresent { it.validate() }
            shouldCreateConversation()
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
            (if (from.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (to.asKnown().isPresent) 1 else 0) +
                (conversationMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (shouldCreateConversation.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                from == other.from &&
                text == other.text &&
                to == other.to &&
                conversationMetadata == other.conversationMetadata &&
                shouldCreateConversation == other.shouldCreateConversation &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                from,
                text,
                to,
                conversationMetadata,
                shouldCreateConversation,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{from=$from, text=$text, to=$to, conversationMetadata=$conversationMetadata, shouldCreateConversation=$shouldCreateConversation, additionalProperties=$additionalProperties}"
    }

    class ConversationMetadata
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

            /** Returns a mutable builder for constructing an instance of [ConversationMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConversationMetadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(conversationMetadata: ConversationMetadata) = apply {
                additionalProperties = conversationMetadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ConversationMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ConversationMetadata =
                ConversationMetadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ConversationMetadata = apply {
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

            return other is ConversationMetadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ConversationMetadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssistantSendSmsParams &&
            assistantId == other.assistantId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(assistantId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AssistantSendSmsParams{assistantId=$assistantId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
