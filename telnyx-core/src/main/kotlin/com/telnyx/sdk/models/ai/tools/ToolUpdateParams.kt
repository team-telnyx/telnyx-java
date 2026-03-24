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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update Tool */
class ToolUpdateParams
private constructor(
    private val toolId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun toolId(): Optional<String> = Optional.ofNullable(toolId)

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = body.displayName()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun function(): Optional<Function> = body.function()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun handoff(): Optional<Handoff> = body.handoff()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invite(): Optional<Invite> = body.invite()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retrieval(): Optional<Retrieval> = body.retrieval()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutMs(): Optional<Long> = body.timeoutMs()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<String> = body.type()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhook(): Optional<Webhook> = body.webhook()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [function].
     *
     * Unlike [function], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _function(): JsonField<Function> = body._function()

    /**
     * Returns the raw JSON value of [handoff].
     *
     * Unlike [handoff], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _handoff(): JsonField<Handoff> = body._handoff()

    /**
     * Returns the raw JSON value of [invite].
     *
     * Unlike [invite], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invite(): JsonField<Invite> = body._invite()

    /**
     * Returns the raw JSON value of [retrieval].
     *
     * Unlike [retrieval], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _retrieval(): JsonField<Retrieval> = body._retrieval()

    /**
     * Returns the raw JSON value of [timeoutMs].
     *
     * Unlike [timeoutMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeoutMs(): JsonField<Long> = body._timeoutMs()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<String> = body._type()

    /**
     * Returns the raw JSON value of [webhook].
     *
     * Unlike [webhook], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhook(): JsonField<Webhook> = body._webhook()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ToolUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ToolUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ToolUpdateParams]. */
    class Builder internal constructor() {

        private var toolId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(toolUpdateParams: ToolUpdateParams) = apply {
            toolId = toolUpdateParams.toolId
            body = toolUpdateParams.body.toBuilder()
            additionalHeaders = toolUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = toolUpdateParams.additionalQueryParams.toBuilder()
        }

        fun toolId(toolId: String?) = apply { this.toolId = toolId }

        /** Alias for calling [Builder.toolId] with `toolId.orElse(null)`. */
        fun toolId(toolId: Optional<String>) = toolId(toolId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [displayName]
         * - [function]
         * - [handoff]
         * - [invite]
         * - [retrieval]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun displayName(displayName: String) = apply { body.displayName(displayName) }

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        fun function(function: Function) = apply { body.function(function) }

        /**
         * Sets [Builder.function] to an arbitrary JSON value.
         *
         * You should usually call [Builder.function] with a well-typed [Function] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun function(function: JsonField<Function>) = apply { body.function(function) }

        fun handoff(handoff: Handoff) = apply { body.handoff(handoff) }

        /**
         * Sets [Builder.handoff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.handoff] with a well-typed [Handoff] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun handoff(handoff: JsonField<Handoff>) = apply { body.handoff(handoff) }

        fun invite(invite: Invite) = apply { body.invite(invite) }

        /**
         * Sets [Builder.invite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invite] with a well-typed [Invite] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun invite(invite: JsonField<Invite>) = apply { body.invite(invite) }

        fun retrieval(retrieval: Retrieval) = apply { body.retrieval(retrieval) }

        /**
         * Sets [Builder.retrieval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retrieval] with a well-typed [Retrieval] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun retrieval(retrieval: JsonField<Retrieval>) = apply { body.retrieval(retrieval) }

        fun timeoutMs(timeoutMs: Long) = apply { body.timeoutMs(timeoutMs) }

        /**
         * Sets [Builder.timeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeoutMs(timeoutMs: JsonField<Long>) = apply { body.timeoutMs(timeoutMs) }

        fun type(type: String) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { body.type(type) }

        fun webhook(webhook: Webhook) = apply { body.webhook(webhook) }

        /**
         * Sets [Builder.webhook] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhook] with a well-typed [Webhook] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun webhook(webhook: JsonField<Webhook>) = apply { body.webhook(webhook) }

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
         * Returns an immutable instance of [ToolUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ToolUpdateParams =
            ToolUpdateParams(
                toolId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> toolId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request model for updating a shared tool. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val displayName: JsonField<String>,
        private val function: JsonField<Function>,
        private val handoff: JsonField<Handoff>,
        private val invite: JsonField<Invite>,
        private val retrieval: JsonField<Retrieval>,
        private val timeoutMs: JsonField<Long>,
        private val type: JsonField<String>,
        private val webhook: JsonField<Webhook>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("function")
            @ExcludeMissing
            function: JsonField<Function> = JsonMissing.of(),
            @JsonProperty("handoff") @ExcludeMissing handoff: JsonField<Handoff> = JsonMissing.of(),
            @JsonProperty("invite") @ExcludeMissing invite: JsonField<Invite> = JsonMissing.of(),
            @JsonProperty("retrieval")
            @ExcludeMissing
            retrieval: JsonField<Retrieval> = JsonMissing.of(),
            @JsonProperty("timeout_ms")
            @ExcludeMissing
            timeoutMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook") @ExcludeMissing webhook: JsonField<Webhook> = JsonMissing.of(),
        ) : this(
            displayName,
            function,
            handoff,
            invite,
            retrieval,
            timeoutMs,
            type,
            webhook,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.getOptional("display_name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun function(): Optional<Function> = function.getOptional("function")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun handoff(): Optional<Handoff> = handoff.getOptional("handoff")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invite(): Optional<Invite> = invite.getOptional("invite")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun retrieval(): Optional<Retrieval> = retrieval.getOptional("retrieval")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeoutMs(): Optional<Long> = timeoutMs.getOptional("timeout_ms")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhook(): Optional<Webhook> = webhook.getOptional("webhook")

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [function].
         *
         * Unlike [function], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("function") @ExcludeMissing fun _function(): JsonField<Function> = function

        /**
         * Returns the raw JSON value of [handoff].
         *
         * Unlike [handoff], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("handoff") @ExcludeMissing fun _handoff(): JsonField<Handoff> = handoff

        /**
         * Returns the raw JSON value of [invite].
         *
         * Unlike [invite], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invite") @ExcludeMissing fun _invite(): JsonField<Invite> = invite

        /**
         * Returns the raw JSON value of [retrieval].
         *
         * Unlike [retrieval], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retrieval")
        @ExcludeMissing
        fun _retrieval(): JsonField<Retrieval> = retrieval

        /**
         * Returns the raw JSON value of [timeoutMs].
         *
         * Unlike [timeoutMs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout_ms") @ExcludeMissing fun _timeoutMs(): JsonField<Long> = timeoutMs

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [webhook].
         *
         * Unlike [webhook], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook") @ExcludeMissing fun _webhook(): JsonField<Webhook> = webhook

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var displayName: JsonField<String> = JsonMissing.of()
            private var function: JsonField<Function> = JsonMissing.of()
            private var handoff: JsonField<Handoff> = JsonMissing.of()
            private var invite: JsonField<Invite> = JsonMissing.of()
            private var retrieval: JsonField<Retrieval> = JsonMissing.of()
            private var timeoutMs: JsonField<Long> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var webhook: JsonField<Webhook> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                displayName = body.displayName
                function = body.function
                handoff = body.handoff
                invite = body.invite
                retrieval = body.retrieval
                timeoutMs = body.timeoutMs
                type = body.type
                webhook = body.webhook
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            fun function(function: Function) = function(JsonField.of(function))

            /**
             * Sets [Builder.function] to an arbitrary JSON value.
             *
             * You should usually call [Builder.function] with a well-typed [Function] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun function(function: JsonField<Function>) = apply { this.function = function }

            fun handoff(handoff: Handoff) = handoff(JsonField.of(handoff))

            /**
             * Sets [Builder.handoff] to an arbitrary JSON value.
             *
             * You should usually call [Builder.handoff] with a well-typed [Handoff] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun handoff(handoff: JsonField<Handoff>) = apply { this.handoff = handoff }

            fun invite(invite: Invite) = invite(JsonField.of(invite))

            /**
             * Sets [Builder.invite] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invite] with a well-typed [Invite] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invite(invite: JsonField<Invite>) = apply { this.invite = invite }

            fun retrieval(retrieval: Retrieval) = retrieval(JsonField.of(retrieval))

            /**
             * Sets [Builder.retrieval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retrieval] with a well-typed [Retrieval] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retrieval(retrieval: JsonField<Retrieval>) = apply { this.retrieval = retrieval }

            fun timeoutMs(timeoutMs: Long) = timeoutMs(JsonField.of(timeoutMs))

            /**
             * Sets [Builder.timeoutMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeoutMs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeoutMs(timeoutMs: JsonField<Long>) = apply { this.timeoutMs = timeoutMs }

            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            fun webhook(webhook: Webhook) = webhook(JsonField.of(webhook))

            /**
             * Sets [Builder.webhook] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhook] with a well-typed [Webhook] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhook(webhook: JsonField<Webhook>) = apply { this.webhook = webhook }

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
             */
            fun build(): Body =
                Body(
                    displayName,
                    function,
                    handoff,
                    invite,
                    retrieval,
                    timeoutMs,
                    type,
                    webhook,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            displayName()
            function().ifPresent { it.validate() }
            handoff().ifPresent { it.validate() }
            invite().ifPresent { it.validate() }
            retrieval().ifPresent { it.validate() }
            timeoutMs()
            type()
            webhook().ifPresent { it.validate() }
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
            (if (displayName.asKnown().isPresent) 1 else 0) +
                (function.asKnown().getOrNull()?.validity() ?: 0) +
                (handoff.asKnown().getOrNull()?.validity() ?: 0) +
                (invite.asKnown().getOrNull()?.validity() ?: 0) +
                (retrieval.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timeoutMs.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (webhook.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                displayName == other.displayName &&
                function == other.function &&
                handoff == other.handoff &&
                invite == other.invite &&
                retrieval == other.retrieval &&
                timeoutMs == other.timeoutMs &&
                type == other.type &&
                webhook == other.webhook &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                displayName,
                function,
                handoff,
                invite,
                retrieval,
                timeoutMs,
                type,
                webhook,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{displayName=$displayName, function=$function, handoff=$handoff, invite=$invite, retrieval=$retrieval, timeoutMs=$timeoutMs, type=$type, webhook=$webhook, additionalProperties=$additionalProperties}"
    }

    class Function
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

            /** Returns a mutable builder for constructing an instance of [Function]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Function]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(function: Function) = apply {
                additionalProperties = function.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Function].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Function = Function(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Function = apply {
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

            return other is Function && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Function{additionalProperties=$additionalProperties}"
    }

    class Handoff
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

            /** Returns a mutable builder for constructing an instance of [Handoff]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Handoff]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(handoff: Handoff) = apply {
                additionalProperties = handoff.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Handoff].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Handoff = Handoff(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Handoff = apply {
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

            return other is Handoff && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Handoff{additionalProperties=$additionalProperties}"
    }

    class Invite
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

            /** Returns a mutable builder for constructing an instance of [Invite]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Invite]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invite: Invite) = apply {
                additionalProperties = invite.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Invite].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Invite = Invite(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Invite = apply {
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

            return other is Invite && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Invite{additionalProperties=$additionalProperties}"
    }

    class Retrieval
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

            /** Returns a mutable builder for constructing an instance of [Retrieval]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Retrieval]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(retrieval: Retrieval) = apply {
                additionalProperties = retrieval.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Retrieval].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Retrieval = Retrieval(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Retrieval = apply {
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

            return other is Retrieval && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Retrieval{additionalProperties=$additionalProperties}"
    }

    class Webhook
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

            /** Returns a mutable builder for constructing an instance of [Webhook]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Webhook]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhook: Webhook) = apply {
                additionalProperties = webhook.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Webhook].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Webhook = Webhook(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Webhook = apply {
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

            return other is Webhook && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Webhook{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolUpdateParams &&
            toolId == other.toolId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(toolId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ToolUpdateParams{toolId=$toolId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
