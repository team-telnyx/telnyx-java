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
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.BookAppointmentTool
import com.telnyx.sdk.models.BookAppointmentToolParams
import com.telnyx.sdk.models.CallControlBucketIds
import com.telnyx.sdk.models.CallControlRetrievalTool
import com.telnyx.sdk.models.CheckAvailabilityTool
import com.telnyx.sdk.models.CheckAvailabilityToolParams
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
        fun addTool(bookAppointment: BookAppointmentTool) =
            addTool(Tool.ofBookAppointment(bookAppointment))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * BookAppointmentTool.builder()
         *     .type(BookAppointmentTool.Type.BOOK_APPOINTMENT)
         *     .bookAppointment(bookAppointment)
         *     .build()
         * ```
         */
        fun addBookAppointmentTool(bookAppointment: BookAppointmentToolParams) =
            addTool(
                BookAppointmentTool.builder()
                    .type(BookAppointmentTool.Type.BOOK_APPOINTMENT)
                    .bookAppointment(bookAppointment)
                    .build()
            )

        /** Alias for calling [addTool] with `Tool.ofCheckAvailability(checkAvailability)`. */
        fun addTool(checkAvailability: CheckAvailabilityTool) =
            addTool(Tool.ofCheckAvailability(checkAvailability))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * CheckAvailabilityTool.builder()
         *     .type(CheckAvailabilityTool.Type.CHECK_AVAILABILITY)
         *     .checkAvailability(checkAvailability)
         *     .build()
         * ```
         */
        fun addCheckAvailabilityTool(checkAvailability: CheckAvailabilityToolParams) =
            addTool(
                CheckAvailabilityTool.builder()
                    .type(CheckAvailabilityTool.Type.CHECK_AVAILABILITY)
                    .checkAvailability(checkAvailability)
                    .build()
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
        fun addTool(retrieval: CallControlRetrievalTool) = addTool(Tool.ofRetrieval(retrieval))

        /**
         * Alias for calling [addTool] with the following:
         * ```java
         * CallControlRetrievalTool.builder()
         *     .type(CallControlRetrievalTool.Type.RETRIEVAL)
         *     .retrieval(retrieval)
         *     .build()
         * ```
         */
        fun addRetrievalTool(retrieval: CallControlBucketIds) =
            addTool(
                CallControlRetrievalTool.builder()
                    .type(CallControlRetrievalTool.Type.RETRIEVAL)
                    .retrieval(retrieval)
                    .build()
            )

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
        private val retrieval: CallControlRetrievalTool? = null,
        private val _json: JsonValue? = null,
    ) {

        fun bookAppointment(): Optional<BookAppointmentTool> = Optional.ofNullable(bookAppointment)

        fun checkAvailability(): Optional<CheckAvailabilityTool> =
            Optional.ofNullable(checkAvailability)

        fun webhook(): Optional<WebhookTool> = Optional.ofNullable(webhook)

        fun hangup(): Optional<HangupTool> = Optional.ofNullable(hangup)

        fun transfer(): Optional<TransferTool> = Optional.ofNullable(transfer)

        fun retrieval(): Optional<CallControlRetrievalTool> = Optional.ofNullable(retrieval)

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

        fun asRetrieval(): CallControlRetrievalTool = retrieval.getOrThrow("retrieval")

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

                    override fun visitRetrieval(retrieval: CallControlRetrievalTool) {
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

                    override fun visitRetrieval(retrieval: CallControlRetrievalTool) =
                        retrieval.validity()

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

            @JvmStatic
            fun ofRetrieval(retrieval: CallControlRetrievalTool) = Tool(retrieval = retrieval)
        }

        /** An interface that defines how to map each variant of [Tool] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitBookAppointment(bookAppointment: BookAppointmentTool): T

            fun visitCheckAvailability(checkAvailability: CheckAvailabilityTool): T

            fun visitWebhook(webhook: WebhookTool): T

            fun visitHangup(hangup: HangupTool): T

            fun visitTransfer(transfer: TransferTool): T

            fun visitRetrieval(retrieval: CallControlRetrievalTool): T

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
                        return tryDeserialize(node, jacksonTypeRef<CallControlRetrievalTool>())
                            ?.let { Tool(retrieval = it, _json = json) } ?: Tool(_json = json)
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
