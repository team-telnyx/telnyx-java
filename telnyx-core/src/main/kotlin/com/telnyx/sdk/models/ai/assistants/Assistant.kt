// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Assistant configuration including choice of LLM, custom instructions, and tools. */
class Assistant
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val instructions: JsonField<String>,
    private val model: JsonField<String>,
    private val openaiApiKeyRef: JsonField<String>,
    private val tools: JsonField<List<Tool>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("instructions")
        @ExcludeMissing
        instructions: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("openai_api_key_ref")
        @ExcludeMissing
        openaiApiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tools") @ExcludeMissing tools: JsonField<List<Tool>> = JsonMissing.of(),
    ) : this(instructions, model, openaiApiKeyRef, tools, mutableMapOf())

    /**
     * The system instructions that the voice assistant uses during the gather command
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<String> = instructions.getOptional("instructions")

    /**
     * The model to be used by the voice assistant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * This is necessary only if the model selected is from OpenAI. You would pass the `identifier`
     * for an integration secret
     * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
     * that refers to your OpenAI API Key. Warning: Free plans are unlikely to work with this
     * integration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun openaiApiKeyRef(): Optional<String> = openaiApiKeyRef.getOptional("openai_api_key_ref")

    /**
     * The tools that the voice assistant can use.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tools(): Optional<List<Tool>> = tools.getOptional("tools")

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<String> = instructions

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [openaiApiKeyRef].
     *
     * Unlike [openaiApiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("openai_api_key_ref")
    @ExcludeMissing
    fun _openaiApiKeyRef(): JsonField<String> = openaiApiKeyRef

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<Tool>> = tools

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

        /** Returns a mutable builder for constructing an instance of [Assistant]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Assistant]. */
    class Builder internal constructor() {

        private var instructions: JsonField<String> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var openaiApiKeyRef: JsonField<String> = JsonMissing.of()
        private var tools: JsonField<MutableList<Tool>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(assistant: Assistant) = apply {
            instructions = assistant.instructions
            model = assistant.model
            openaiApiKeyRef = assistant.openaiApiKeyRef
            tools = assistant.tools.map { it.toMutableList() }
            additionalProperties = assistant.additionalProperties.toMutableMap()
        }

        /** The system instructions that the voice assistant uses during the gather command */
        fun instructions(instructions: String) = instructions(JsonField.of(instructions))

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            this.instructions = instructions
        }

        /** The model to be used by the voice assistant. */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /**
         * This is necessary only if the model selected is from OpenAI. You would pass the
         * `identifier` for an integration secret
         * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         * that refers to your OpenAI API Key. Warning: Free plans are unlikely to work with this
         * integration.
         */
        fun openaiApiKeyRef(openaiApiKeyRef: String) =
            openaiApiKeyRef(JsonField.of(openaiApiKeyRef))

        /**
         * Sets [Builder.openaiApiKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openaiApiKeyRef] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun openaiApiKeyRef(openaiApiKeyRef: JsonField<String>) = apply {
            this.openaiApiKeyRef = openaiApiKeyRef
        }

        /** The tools that the voice assistant can use. */
        fun tools(tools: List<Tool>) = tools(JsonField.of(tools))

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<Tool>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tools(tools: JsonField<List<Tool>>) = apply {
            this.tools = tools.map { it.toMutableList() }
        }

        /**
         * Adds a single [Tool] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTool(tool: Tool) = apply {
            tools =
                (tools ?: JsonField.of(mutableListOf())).also { checkKnown("tools", it).add(tool) }
        }

        /** Alias for calling [addTool] with `Tool.ofBookAppointment(bookAppointment)`. */
        fun addTool(bookAppointment: Tool.BookAppointmentTool) =
            addTool(Tool.ofBookAppointment(bookAppointment))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * Tool.BookAppointmentTool.builder()
         *     .bookAppointment(bookAppointment)
         *     .build()
         * ```
         */
        fun addBookAppointmentTool(bookAppointment: Tool.BookAppointmentTool.BookAppointment) =
            addTool(Tool.BookAppointmentTool.builder().bookAppointment(bookAppointment).build())

        /** Alias for calling [addTool] with `Tool.ofCheckAvailability(checkAvailability)`. */
        fun addTool(checkAvailability: Tool.CheckAvailabilityTool) =
            addTool(Tool.ofCheckAvailability(checkAvailability))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * Tool.CheckAvailabilityTool.builder()
         *     .checkAvailability(checkAvailability)
         *     .build()
         * ```
         */
        fun addCheckAvailabilityTool(
            checkAvailability: Tool.CheckAvailabilityTool.CheckAvailability
        ) =
            addTool(
                Tool.CheckAvailabilityTool.builder().checkAvailability(checkAvailability).build()
            )

        /** Alias for calling [addTool] with `Tool.ofWebhook(webhook)`. */
        fun addTool(webhook: WebhookTool) = addTool(Tool.ofWebhook(webhook))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * WebhookTool.builder()
         *     .type(WebhookTool.Type.WEBHOOK)
         *     .webhook(webhook)
         *     .build()
         * ```
         */
        fun addWebhookTool(webhook: WebhookTool.Webhook) =
            addTool(WebhookTool.builder().type(WebhookTool.Type.WEBHOOK).webhook(webhook).build())

        /** Alias for calling [addTool] with `Tool.ofHangup(hangup)`. */
        fun addTool(hangup: HangupTool) = addTool(Tool.ofHangup(hangup))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * HangupTool.builder()
         *     .type(HangupTool.Type.HANGUP)
         *     .hangup(hangup)
         *     .build()
         * ```
         */
        fun addHangupTool(hangup: HangupToolParams) =
            addTool(HangupTool.builder().type(HangupTool.Type.HANGUP).hangup(hangup).build())

        /** Alias for calling [addTool] with `Tool.ofTransfer(transfer)`. */
        fun addTool(transfer: TransferTool) = addTool(Tool.ofTransfer(transfer))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * TransferTool.builder()
         *     .type(TransferTool.Type.TRANSFER)
         *     .transfer(transfer)
         *     .build()
         * ```
         */
        fun addTransferTool(transfer: TransferTool.Transfer) =
            addTool(
                TransferTool.builder().type(TransferTool.Type.TRANSFER).transfer(transfer).build()
            )

        /** Alias for calling [addTool] with `Tool.ofRetrieval(retrieval)`. */
        fun addTool(retrieval: Tool.Retrieval) = addTool(Tool.ofRetrieval(retrieval))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * Tool.Retrieval.builder()
         *     .retrieval(retrieval)
         *     .build()
         * ```
         */
        fun addRetrievalTool(retrieval: Tool.Retrieval.RetrievalConfig) =
            addTool(Tool.Retrieval.builder().retrieval(retrieval).build())

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
         * Returns an immutable instance of [Assistant].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Assistant =
            Assistant(
                instructions,
                model,
                openaiApiKeyRef,
                (tools ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Assistant = apply {
        if (validated) {
            return@apply
        }

        instructions()
        model()
        openaiApiKeyRef()
        tools().ifPresent { it.forEach { it.validate() } }
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
        (if (instructions.asKnown().isPresent) 1 else 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (openaiApiKeyRef.asKnown().isPresent) 1 else 0) +
            (tools.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    @JsonDeserialize(using = Tool.Deserializer::class)
    @JsonSerialize(using = Tool.Serializer::class)
    class Tool
    private constructor(
        private val bookAppointment: BookAppointmentTool? = null,
        private val checkAvailability: CheckAvailabilityTool? = null,
        private val webhook: WebhookTool? = null,
        private val hangup: HangupTool? = null,
        private val transfer: TransferTool? = null,
        private val retrieval: Retrieval? = null,
        private val _json: JsonValue? = null,
    ) {

        fun bookAppointment(): Optional<BookAppointmentTool> = Optional.ofNullable(bookAppointment)

        fun checkAvailability(): Optional<CheckAvailabilityTool> =
            Optional.ofNullable(checkAvailability)

        fun webhook(): Optional<WebhookTool> = Optional.ofNullable(webhook)

        fun hangup(): Optional<HangupTool> = Optional.ofNullable(hangup)

        fun transfer(): Optional<TransferTool> = Optional.ofNullable(transfer)

        fun retrieval(): Optional<Retrieval> = Optional.ofNullable(retrieval)

        fun isBookAppointment(): Boolean = bookAppointment != null

        fun isCheckAvailability(): Boolean = checkAvailability != null

        fun isWebhook(): Boolean = webhook != null

        fun isHangup(): Boolean = hangup != null

        fun isTransfer(): Boolean = transfer != null

        fun isRetrieval(): Boolean = retrieval != null

        fun asBookAppointment(): BookAppointmentTool = bookAppointment.getOrThrow("bookAppointment")

        fun asCheckAvailability(): CheckAvailabilityTool =
            checkAvailability.getOrThrow("checkAvailability")

        fun asWebhook(): WebhookTool = webhook.getOrThrow("webhook")

        fun asHangup(): HangupTool = hangup.getOrThrow("hangup")

        fun asTransfer(): TransferTool = transfer.getOrThrow("transfer")

        fun asRetrieval(): Retrieval = retrieval.getOrThrow("retrieval")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                bookAppointment != null -> visitor.visitBookAppointment(bookAppointment)
                checkAvailability != null -> visitor.visitCheckAvailability(checkAvailability)
                webhook != null -> visitor.visitWebhook(webhook)
                hangup != null -> visitor.visitHangup(hangup)
                transfer != null -> visitor.visitTransfer(transfer)
                retrieval != null -> visitor.visitRetrieval(retrieval)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Tool = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitBookAppointment(bookAppointment: BookAppointmentTool) {
                        bookAppointment.validate()
                    }

                    override fun visitCheckAvailability(checkAvailability: CheckAvailabilityTool) {
                        checkAvailability.validate()
                    }

                    override fun visitWebhook(webhook: WebhookTool) {
                        webhook.validate()
                    }

                    override fun visitHangup(hangup: HangupTool) {
                        hangup.validate()
                    }

                    override fun visitTransfer(transfer: TransferTool) {
                        transfer.validate()
                    }

                    override fun visitRetrieval(retrieval: Retrieval) {
                        retrieval.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitBookAppointment(bookAppointment: BookAppointmentTool) =
                        bookAppointment.validity()

                    override fun visitCheckAvailability(checkAvailability: CheckAvailabilityTool) =
                        checkAvailability.validity()

                    override fun visitWebhook(webhook: WebhookTool) = webhook.validity()

                    override fun visitHangup(hangup: HangupTool) = hangup.validity()

                    override fun visitTransfer(transfer: TransferTool) = transfer.validity()

                    override fun visitRetrieval(retrieval: Retrieval) = retrieval.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tool &&
                bookAppointment == other.bookAppointment &&
                checkAvailability == other.checkAvailability &&
                webhook == other.webhook &&
                hangup == other.hangup &&
                transfer == other.transfer &&
                retrieval == other.retrieval
        }

        override fun hashCode(): Int =
            Objects.hash(bookAppointment, checkAvailability, webhook, hangup, transfer, retrieval)

        override fun toString(): String =
            when {
                bookAppointment != null -> "Tool{bookAppointment=$bookAppointment}"
                checkAvailability != null -> "Tool{checkAvailability=$checkAvailability}"
                webhook != null -> "Tool{webhook=$webhook}"
                hangup != null -> "Tool{hangup=$hangup}"
                transfer != null -> "Tool{transfer=$transfer}"
                retrieval != null -> "Tool{retrieval=$retrieval}"
                _json != null -> "Tool{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Tool")
            }

        companion object {

            @JvmStatic
            fun ofBookAppointment(bookAppointment: BookAppointmentTool) =
                Tool(bookAppointment = bookAppointment)

            @JvmStatic
            fun ofCheckAvailability(checkAvailability: CheckAvailabilityTool) =
                Tool(checkAvailability = checkAvailability)

            @JvmStatic fun ofWebhook(webhook: WebhookTool) = Tool(webhook = webhook)

            @JvmStatic fun ofHangup(hangup: HangupTool) = Tool(hangup = hangup)

            @JvmStatic fun ofTransfer(transfer: TransferTool) = Tool(transfer = transfer)

            @JvmStatic fun ofRetrieval(retrieval: Retrieval) = Tool(retrieval = retrieval)
        }

        /** An interface that defines how to map each variant of [Tool] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitBookAppointment(bookAppointment: BookAppointmentTool): T

            fun visitCheckAvailability(checkAvailability: CheckAvailabilityTool): T

            fun visitWebhook(webhook: WebhookTool): T

            fun visitHangup(hangup: HangupTool): T

            fun visitTransfer(transfer: TransferTool): T

            fun visitRetrieval(retrieval: Retrieval): T

            /**
             * Maps an unknown variant of [Tool] to a value of type [T].
             *
             * An instance of [Tool] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Tool: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Tool>(Tool::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Tool {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "book_appointment" -> {
                        return tryDeserialize(node, jacksonTypeRef<BookAppointmentTool>())?.let {
                            Tool(bookAppointment = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                    "check_availability" -> {
                        return tryDeserialize(node, jacksonTypeRef<CheckAvailabilityTool>())?.let {
                            Tool(checkAvailability = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                    "webhook" -> {
                        return tryDeserialize(node, jacksonTypeRef<WebhookTool>())?.let {
                            Tool(webhook = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                    "hangup" -> {
                        return tryDeserialize(node, jacksonTypeRef<HangupTool>())?.let {
                            Tool(hangup = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                    "transfer" -> {
                        return tryDeserialize(node, jacksonTypeRef<TransferTool>())?.let {
                            Tool(transfer = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                    "retrieval" -> {
                        return tryDeserialize(node, jacksonTypeRef<Retrieval>())?.let {
                            Tool(retrieval = it, _json = json)
                        } ?: Tool(_json = json)
                    }
                }

                return Tool(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Tool>(Tool::class) {

            override fun serialize(
                value: Tool,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.bookAppointment != null -> generator.writeObject(value.bookAppointment)
                    value.checkAvailability != null ->
                        generator.writeObject(value.checkAvailability)
                    value.webhook != null -> generator.writeObject(value.webhook)
                    value.hangup != null -> generator.writeObject(value.hangup)
                    value.transfer != null -> generator.writeObject(value.transfer)
                    value.retrieval != null -> generator.writeObject(value.retrieval)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Tool")
                }
            }
        }

        class BookAppointmentTool
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val bookAppointment: JsonField<BookAppointment>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("book_appointment")
                @ExcludeMissing
                bookAppointment: JsonField<BookAppointment> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(bookAppointment, type, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bookAppointment(): BookAppointment = bookAppointment.getRequired("book_appointment")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("book_appointment")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [bookAppointment].
             *
             * Unlike [bookAppointment], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("book_appointment")
            @ExcludeMissing
            fun _bookAppointment(): JsonField<BookAppointment> = bookAppointment

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
                 * Returns a mutable builder for constructing an instance of [BookAppointmentTool].
                 *
                 * The following fields are required:
                 * ```java
                 * .bookAppointment()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BookAppointmentTool]. */
            class Builder internal constructor() {

                private var bookAppointment: JsonField<BookAppointment>? = null
                private var type: JsonValue = JsonValue.from("book_appointment")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(bookAppointmentTool: BookAppointmentTool) = apply {
                    bookAppointment = bookAppointmentTool.bookAppointment
                    type = bookAppointmentTool.type
                    additionalProperties = bookAppointmentTool.additionalProperties.toMutableMap()
                }

                fun bookAppointment(bookAppointment: BookAppointment) =
                    bookAppointment(JsonField.of(bookAppointment))

                /**
                 * Sets [Builder.bookAppointment] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bookAppointment] with a well-typed
                 * [BookAppointment] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun bookAppointment(bookAppointment: JsonField<BookAppointment>) = apply {
                    this.bookAppointment = bookAppointment
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("book_appointment")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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
                 * Returns an immutable instance of [BookAppointmentTool].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .bookAppointment()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BookAppointmentTool =
                    BookAppointmentTool(
                        checkRequired("bookAppointment", bookAppointment),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BookAppointmentTool = apply {
                if (validated) {
                    return@apply
                }

                bookAppointment().validate()
                _type().let {
                    if (it != JsonValue.from("book_appointment")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
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
                (bookAppointment.asKnown().getOrNull()?.validity() ?: 0) +
                    type.let { if (it == JsonValue.from("book_appointment")) 1 else 0 }

            class BookAppointment
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val apiKeyRef: JsonField<String>,
                private val eventTypeId: JsonField<Long>,
                private val attendeeName: JsonField<String>,
                private val attendeeTimezone: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("api_key_ref")
                    @ExcludeMissing
                    apiKeyRef: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("event_type_id")
                    @ExcludeMissing
                    eventTypeId: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("attendee_name")
                    @ExcludeMissing
                    attendeeName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("attendee_timezone")
                    @ExcludeMissing
                    attendeeTimezone: JsonField<String> = JsonMissing.of(),
                ) : this(apiKeyRef, eventTypeId, attendeeName, attendeeTimezone, mutableMapOf())

                /**
                 * Reference to an integration secret that contains your Cal.com API key. You would
                 * pass the `identifier` for an integration secret
                 * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
                 * that refers to your Cal.com API key.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun apiKeyRef(): String = apiKeyRef.getRequired("api_key_ref")

                /**
                 * Event Type ID for which slots are being fetched.
                 * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-event-type-id)
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun eventTypeId(): Long = eventTypeId.getRequired("event_type_id")

                /**
                 * The name of the attendee
                 * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-attendee-name).
                 * If not provided, the assistant will ask for the attendee's name.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun attendeeName(): Optional<String> = attendeeName.getOptional("attendee_name")

                /**
                 * The timezone of the attendee
                 * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-attendee-timezone).
                 * If not provided, the assistant will ask for the attendee's timezone.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun attendeeTimezone(): Optional<String> =
                    attendeeTimezone.getOptional("attendee_timezone")

                /**
                 * Returns the raw JSON value of [apiKeyRef].
                 *
                 * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("api_key_ref")
                @ExcludeMissing
                fun _apiKeyRef(): JsonField<String> = apiKeyRef

                /**
                 * Returns the raw JSON value of [eventTypeId].
                 *
                 * Unlike [eventTypeId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("event_type_id")
                @ExcludeMissing
                fun _eventTypeId(): JsonField<Long> = eventTypeId

                /**
                 * Returns the raw JSON value of [attendeeName].
                 *
                 * Unlike [attendeeName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("attendee_name")
                @ExcludeMissing
                fun _attendeeName(): JsonField<String> = attendeeName

                /**
                 * Returns the raw JSON value of [attendeeTimezone].
                 *
                 * Unlike [attendeeTimezone], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("attendee_timezone")
                @ExcludeMissing
                fun _attendeeTimezone(): JsonField<String> = attendeeTimezone

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
                     * Returns a mutable builder for constructing an instance of [BookAppointment].
                     *
                     * The following fields are required:
                     * ```java
                     * .apiKeyRef()
                     * .eventTypeId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [BookAppointment]. */
                class Builder internal constructor() {

                    private var apiKeyRef: JsonField<String>? = null
                    private var eventTypeId: JsonField<Long>? = null
                    private var attendeeName: JsonField<String> = JsonMissing.of()
                    private var attendeeTimezone: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(bookAppointment: BookAppointment) = apply {
                        apiKeyRef = bookAppointment.apiKeyRef
                        eventTypeId = bookAppointment.eventTypeId
                        attendeeName = bookAppointment.attendeeName
                        attendeeTimezone = bookAppointment.attendeeTimezone
                        additionalProperties = bookAppointment.additionalProperties.toMutableMap()
                    }

                    /**
                     * Reference to an integration secret that contains your Cal.com API key. You
                     * would pass the `identifier` for an integration secret
                     * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
                     * that refers to your Cal.com API key.
                     */
                    fun apiKeyRef(apiKeyRef: String) = apiKeyRef(JsonField.of(apiKeyRef))

                    /**
                     * Sets [Builder.apiKeyRef] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.apiKeyRef] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun apiKeyRef(apiKeyRef: JsonField<String>) = apply {
                        this.apiKeyRef = apiKeyRef
                    }

                    /**
                     * Event Type ID for which slots are being fetched.
                     * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-event-type-id)
                     */
                    fun eventTypeId(eventTypeId: Long) = eventTypeId(JsonField.of(eventTypeId))

                    /**
                     * Sets [Builder.eventTypeId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.eventTypeId] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun eventTypeId(eventTypeId: JsonField<Long>) = apply {
                        this.eventTypeId = eventTypeId
                    }

                    /**
                     * The name of the attendee
                     * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-attendee-name).
                     * If not provided, the assistant will ask for the attendee's name.
                     */
                    fun attendeeName(attendeeName: String) =
                        attendeeName(JsonField.of(attendeeName))

                    /**
                     * Sets [Builder.attendeeName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attendeeName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun attendeeName(attendeeName: JsonField<String>) = apply {
                        this.attendeeName = attendeeName
                    }

                    /**
                     * The timezone of the attendee
                     * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-attendee-timezone).
                     * If not provided, the assistant will ask for the attendee's timezone.
                     */
                    fun attendeeTimezone(attendeeTimezone: String) =
                        attendeeTimezone(JsonField.of(attendeeTimezone))

                    /**
                     * Sets [Builder.attendeeTimezone] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attendeeTimezone] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun attendeeTimezone(attendeeTimezone: JsonField<String>) = apply {
                        this.attendeeTimezone = attendeeTimezone
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
                     * Returns an immutable instance of [BookAppointment].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .apiKeyRef()
                     * .eventTypeId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): BookAppointment =
                        BookAppointment(
                            checkRequired("apiKeyRef", apiKeyRef),
                            checkRequired("eventTypeId", eventTypeId),
                            attendeeName,
                            attendeeTimezone,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): BookAppointment = apply {
                    if (validated) {
                        return@apply
                    }

                    apiKeyRef()
                    eventTypeId()
                    attendeeName()
                    attendeeTimezone()
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
                    (if (apiKeyRef.asKnown().isPresent) 1 else 0) +
                        (if (eventTypeId.asKnown().isPresent) 1 else 0) +
                        (if (attendeeName.asKnown().isPresent) 1 else 0) +
                        (if (attendeeTimezone.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BookAppointment &&
                        apiKeyRef == other.apiKeyRef &&
                        eventTypeId == other.eventTypeId &&
                        attendeeName == other.attendeeName &&
                        attendeeTimezone == other.attendeeTimezone &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        apiKeyRef,
                        eventTypeId,
                        attendeeName,
                        attendeeTimezone,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "BookAppointment{apiKeyRef=$apiKeyRef, eventTypeId=$eventTypeId, attendeeName=$attendeeName, attendeeTimezone=$attendeeTimezone, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BookAppointmentTool &&
                    bookAppointment == other.bookAppointment &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(bookAppointment, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BookAppointmentTool{bookAppointment=$bookAppointment, type=$type, additionalProperties=$additionalProperties}"
        }

        class CheckAvailabilityTool
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val checkAvailability: JsonField<CheckAvailability>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("check_availability")
                @ExcludeMissing
                checkAvailability: JsonField<CheckAvailability> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(checkAvailability, type, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun checkAvailability(): CheckAvailability =
                checkAvailability.getRequired("check_availability")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("check_availability")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [checkAvailability].
             *
             * Unlike [checkAvailability], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("check_availability")
            @ExcludeMissing
            fun _checkAvailability(): JsonField<CheckAvailability> = checkAvailability

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
                 * [CheckAvailabilityTool].
                 *
                 * The following fields are required:
                 * ```java
                 * .checkAvailability()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CheckAvailabilityTool]. */
            class Builder internal constructor() {

                private var checkAvailability: JsonField<CheckAvailability>? = null
                private var type: JsonValue = JsonValue.from("check_availability")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(checkAvailabilityTool: CheckAvailabilityTool) = apply {
                    checkAvailability = checkAvailabilityTool.checkAvailability
                    type = checkAvailabilityTool.type
                    additionalProperties = checkAvailabilityTool.additionalProperties.toMutableMap()
                }

                fun checkAvailability(checkAvailability: CheckAvailability) =
                    checkAvailability(JsonField.of(checkAvailability))

                /**
                 * Sets [Builder.checkAvailability] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.checkAvailability] with a well-typed
                 * [CheckAvailability] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun checkAvailability(checkAvailability: JsonField<CheckAvailability>) = apply {
                    this.checkAvailability = checkAvailability
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("check_availability")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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
                 * Returns an immutable instance of [CheckAvailabilityTool].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .checkAvailability()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CheckAvailabilityTool =
                    CheckAvailabilityTool(
                        checkRequired("checkAvailability", checkAvailability),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CheckAvailabilityTool = apply {
                if (validated) {
                    return@apply
                }

                checkAvailability().validate()
                _type().let {
                    if (it != JsonValue.from("check_availability")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
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
                (checkAvailability.asKnown().getOrNull()?.validity() ?: 0) +
                    type.let { if (it == JsonValue.from("check_availability")) 1 else 0 }

            class CheckAvailability
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val apiKeyRef: JsonField<String>,
                private val eventTypeId: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("api_key_ref")
                    @ExcludeMissing
                    apiKeyRef: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("event_type_id")
                    @ExcludeMissing
                    eventTypeId: JsonField<Long> = JsonMissing.of(),
                ) : this(apiKeyRef, eventTypeId, mutableMapOf())

                /**
                 * Reference to an integration secret that contains your Cal.com API key. You would
                 * pass the `identifier` for an integration secret
                 * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
                 * that refers to your Cal.com API key.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun apiKeyRef(): String = apiKeyRef.getRequired("api_key_ref")

                /**
                 * Event Type ID for which slots are being fetched.
                 * [cal.com](https://cal.com/docs/api-reference/v2/slots/get-available-slots#parameter-event-type-id)
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun eventTypeId(): Long = eventTypeId.getRequired("event_type_id")

                /**
                 * Returns the raw JSON value of [apiKeyRef].
                 *
                 * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("api_key_ref")
                @ExcludeMissing
                fun _apiKeyRef(): JsonField<String> = apiKeyRef

                /**
                 * Returns the raw JSON value of [eventTypeId].
                 *
                 * Unlike [eventTypeId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("event_type_id")
                @ExcludeMissing
                fun _eventTypeId(): JsonField<Long> = eventTypeId

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
                     * [CheckAvailability].
                     *
                     * The following fields are required:
                     * ```java
                     * .apiKeyRef()
                     * .eventTypeId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CheckAvailability]. */
                class Builder internal constructor() {

                    private var apiKeyRef: JsonField<String>? = null
                    private var eventTypeId: JsonField<Long>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(checkAvailability: CheckAvailability) = apply {
                        apiKeyRef = checkAvailability.apiKeyRef
                        eventTypeId = checkAvailability.eventTypeId
                        additionalProperties = checkAvailability.additionalProperties.toMutableMap()
                    }

                    /**
                     * Reference to an integration secret that contains your Cal.com API key. You
                     * would pass the `identifier` for an integration secret
                     * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
                     * that refers to your Cal.com API key.
                     */
                    fun apiKeyRef(apiKeyRef: String) = apiKeyRef(JsonField.of(apiKeyRef))

                    /**
                     * Sets [Builder.apiKeyRef] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.apiKeyRef] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun apiKeyRef(apiKeyRef: JsonField<String>) = apply {
                        this.apiKeyRef = apiKeyRef
                    }

                    /**
                     * Event Type ID for which slots are being fetched.
                     * [cal.com](https://cal.com/docs/api-reference/v2/slots/get-available-slots#parameter-event-type-id)
                     */
                    fun eventTypeId(eventTypeId: Long) = eventTypeId(JsonField.of(eventTypeId))

                    /**
                     * Sets [Builder.eventTypeId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.eventTypeId] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun eventTypeId(eventTypeId: JsonField<Long>) = apply {
                        this.eventTypeId = eventTypeId
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
                     * Returns an immutable instance of [CheckAvailability].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .apiKeyRef()
                     * .eventTypeId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CheckAvailability =
                        CheckAvailability(
                            checkRequired("apiKeyRef", apiKeyRef),
                            checkRequired("eventTypeId", eventTypeId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CheckAvailability = apply {
                    if (validated) {
                        return@apply
                    }

                    apiKeyRef()
                    eventTypeId()
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
                    (if (apiKeyRef.asKnown().isPresent) 1 else 0) +
                        (if (eventTypeId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CheckAvailability &&
                        apiKeyRef == other.apiKeyRef &&
                        eventTypeId == other.eventTypeId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(apiKeyRef, eventTypeId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CheckAvailability{apiKeyRef=$apiKeyRef, eventTypeId=$eventTypeId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CheckAvailabilityTool &&
                    checkAvailability == other.checkAvailability &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(checkAvailability, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CheckAvailabilityTool{checkAvailability=$checkAvailability, type=$type, additionalProperties=$additionalProperties}"
        }

        class Retrieval
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val retrieval: JsonField<RetrievalConfig>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("retrieval")
                @ExcludeMissing
                retrieval: JsonField<RetrievalConfig> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(retrieval, type, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun retrieval(): RetrievalConfig = retrieval.getRequired("retrieval")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("retrieval")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [retrieval].
             *
             * Unlike [retrieval], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("retrieval")
            @ExcludeMissing
            fun _retrieval(): JsonField<RetrievalConfig> = retrieval

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
                 * Returns a mutable builder for constructing an instance of [Retrieval].
                 *
                 * The following fields are required:
                 * ```java
                 * .retrieval()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Retrieval]. */
            class Builder internal constructor() {

                private var retrieval: JsonField<RetrievalConfig>? = null
                private var type: JsonValue = JsonValue.from("retrieval")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(retrieval: Retrieval) = apply {
                    this.retrieval = retrieval.retrieval
                    type = retrieval.type
                    additionalProperties = retrieval.additionalProperties.toMutableMap()
                }

                fun retrieval(retrieval: RetrievalConfig) = retrieval(JsonField.of(retrieval))

                /**
                 * Sets [Builder.retrieval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.retrieval] with a well-typed [RetrievalConfig]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun retrieval(retrieval: JsonField<RetrievalConfig>) = apply {
                    this.retrieval = retrieval
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("retrieval")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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
                 * Returns an immutable instance of [Retrieval].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .retrieval()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Retrieval =
                    Retrieval(
                        checkRequired("retrieval", retrieval),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Retrieval = apply {
                if (validated) {
                    return@apply
                }

                retrieval().validate()
                _type().let {
                    if (it != JsonValue.from("retrieval")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
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
                (retrieval.asKnown().getOrNull()?.validity() ?: 0) +
                    type.let { if (it == JsonValue.from("retrieval")) 1 else 0 }

            class RetrievalConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bucketIds: JsonField<List<String>>,
                private val maxNumResults: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bucket_ids")
                    @ExcludeMissing
                    bucketIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("max_num_results")
                    @ExcludeMissing
                    maxNumResults: JsonField<Long> = JsonMissing.of(),
                ) : this(bucketIds, maxNumResults, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun bucketIds(): List<String> = bucketIds.getRequired("bucket_ids")

                /**
                 * The maximum number of results to retrieve as context for the language model.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun maxNumResults(): Optional<Long> = maxNumResults.getOptional("max_num_results")

                /**
                 * Returns the raw JSON value of [bucketIds].
                 *
                 * Unlike [bucketIds], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bucket_ids")
                @ExcludeMissing
                fun _bucketIds(): JsonField<List<String>> = bucketIds

                /**
                 * Returns the raw JSON value of [maxNumResults].
                 *
                 * Unlike [maxNumResults], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("max_num_results")
                @ExcludeMissing
                fun _maxNumResults(): JsonField<Long> = maxNumResults

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
                     * Returns a mutable builder for constructing an instance of [RetrievalConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .bucketIds()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RetrievalConfig]. */
                class Builder internal constructor() {

                    private var bucketIds: JsonField<MutableList<String>>? = null
                    private var maxNumResults: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(retrievalConfig: RetrievalConfig) = apply {
                        bucketIds = retrievalConfig.bucketIds.map { it.toMutableList() }
                        maxNumResults = retrievalConfig.maxNumResults
                        additionalProperties = retrievalConfig.additionalProperties.toMutableMap()
                    }

                    fun bucketIds(bucketIds: List<String>) = bucketIds(JsonField.of(bucketIds))

                    /**
                     * Sets [Builder.bucketIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bucketIds] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun bucketIds(bucketIds: JsonField<List<String>>) = apply {
                        this.bucketIds = bucketIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [bucketIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addBucketId(bucketId: String) = apply {
                        bucketIds =
                            (bucketIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("bucketIds", it).add(bucketId)
                            }
                    }

                    /**
                     * The maximum number of results to retrieve as context for the language model.
                     */
                    fun maxNumResults(maxNumResults: Long) =
                        maxNumResults(JsonField.of(maxNumResults))

                    /**
                     * Sets [Builder.maxNumResults] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxNumResults] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun maxNumResults(maxNumResults: JsonField<Long>) = apply {
                        this.maxNumResults = maxNumResults
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
                     * Returns an immutable instance of [RetrievalConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bucketIds()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): RetrievalConfig =
                        RetrievalConfig(
                            checkRequired("bucketIds", bucketIds).map { it.toImmutable() },
                            maxNumResults,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): RetrievalConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    bucketIds()
                    maxNumResults()
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
                    (bucketIds.asKnown().getOrNull()?.size ?: 0) +
                        (if (maxNumResults.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RetrievalConfig &&
                        bucketIds == other.bucketIds &&
                        maxNumResults == other.maxNumResults &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(bucketIds, maxNumResults, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RetrievalConfig{bucketIds=$bucketIds, maxNumResults=$maxNumResults, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Retrieval &&
                    retrieval == other.retrieval &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(retrieval, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Retrieval{retrieval=$retrieval, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Assistant &&
            instructions == other.instructions &&
            model == other.model &&
            openaiApiKeyRef == other.openaiApiKeyRef &&
            tools == other.tools &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(instructions, model, openaiApiKeyRef, tools, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Assistant{instructions=$instructions, model=$model, openaiApiKeyRef=$openaiApiKeyRef, tools=$tools, additionalProperties=$additionalProperties}"
}
