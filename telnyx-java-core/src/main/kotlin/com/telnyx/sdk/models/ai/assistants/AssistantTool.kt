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
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The handoff tool allows the assistant to hand off control of the conversation to another AI
 * assistant. By default, this will happen transparently to the end user.
 */
@JsonDeserialize(using = AssistantTool.Deserializer::class)
@JsonSerialize(using = AssistantTool.Serializer::class)
class AssistantTool
private constructor(
    private val webhook: WebhookTool? = null,
    private val retrieval: RetrievalTool? = null,
    private val handoff: HandoffTool? = null,
    private val hangup: HangupTool? = null,
    private val transfer: TransferTool? = null,
    private val sipRefer: SipReferTool? = null,
    private val dtmf: DtmfTool? = null,
    private val _json: JsonValue? = null,
) {

    fun webhook(): Optional<WebhookTool> = Optional.ofNullable(webhook)

    fun retrieval(): Optional<RetrievalTool> = Optional.ofNullable(retrieval)

    /**
     * The handoff tool allows the assistant to hand off control of the conversation to another AI
     * assistant. By default, this will happen transparently to the end user.
     */
    fun handoff(): Optional<HandoffTool> = Optional.ofNullable(handoff)

    fun hangup(): Optional<HangupTool> = Optional.ofNullable(hangup)

    fun transfer(): Optional<TransferTool> = Optional.ofNullable(transfer)

    fun sipRefer(): Optional<SipReferTool> = Optional.ofNullable(sipRefer)

    fun dtmf(): Optional<DtmfTool> = Optional.ofNullable(dtmf)

    fun isWebhook(): Boolean = webhook != null

    fun isRetrieval(): Boolean = retrieval != null

    fun isHandoff(): Boolean = handoff != null

    fun isHangup(): Boolean = hangup != null

    fun isTransfer(): Boolean = transfer != null

    fun isSipRefer(): Boolean = sipRefer != null

    fun isDtmf(): Boolean = dtmf != null

    fun asWebhook(): WebhookTool = webhook.getOrThrow("webhook")

    fun asRetrieval(): RetrievalTool = retrieval.getOrThrow("retrieval")

    /**
     * The handoff tool allows the assistant to hand off control of the conversation to another AI
     * assistant. By default, this will happen transparently to the end user.
     */
    fun asHandoff(): HandoffTool = handoff.getOrThrow("handoff")

    fun asHangup(): HangupTool = hangup.getOrThrow("hangup")

    fun asTransfer(): TransferTool = transfer.getOrThrow("transfer")

    fun asSipRefer(): SipReferTool = sipRefer.getOrThrow("sipRefer")

    fun asDtmf(): DtmfTool = dtmf.getOrThrow("dtmf")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            webhook != null -> visitor.visitWebhook(webhook)
            retrieval != null -> visitor.visitRetrieval(retrieval)
            handoff != null -> visitor.visitHandoff(handoff)
            hangup != null -> visitor.visitHangup(hangup)
            transfer != null -> visitor.visitTransfer(transfer)
            sipRefer != null -> visitor.visitSipRefer(sipRefer)
            dtmf != null -> visitor.visitDtmf(dtmf)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): AssistantTool = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitWebhook(webhook: WebhookTool) {
                    webhook.validate()
                }

                override fun visitRetrieval(retrieval: RetrievalTool) {
                    retrieval.validate()
                }

                override fun visitHandoff(handoff: HandoffTool) {
                    handoff.validate()
                }

                override fun visitHangup(hangup: HangupTool) {
                    hangup.validate()
                }

                override fun visitTransfer(transfer: TransferTool) {
                    transfer.validate()
                }

                override fun visitSipRefer(sipRefer: SipReferTool) {
                    sipRefer.validate()
                }

                override fun visitDtmf(dtmf: DtmfTool) {
                    dtmf.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitWebhook(webhook: WebhookTool) = webhook.validity()

                override fun visitRetrieval(retrieval: RetrievalTool) = retrieval.validity()

                override fun visitHandoff(handoff: HandoffTool) = handoff.validity()

                override fun visitHangup(hangup: HangupTool) = hangup.validity()

                override fun visitTransfer(transfer: TransferTool) = transfer.validity()

                override fun visitSipRefer(sipRefer: SipReferTool) = sipRefer.validity()

                override fun visitDtmf(dtmf: DtmfTool) = dtmf.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssistantTool &&
            webhook == other.webhook &&
            retrieval == other.retrieval &&
            handoff == other.handoff &&
            hangup == other.hangup &&
            transfer == other.transfer &&
            sipRefer == other.sipRefer &&
            dtmf == other.dtmf
    }

    override fun hashCode(): Int =
        Objects.hash(webhook, retrieval, handoff, hangup, transfer, sipRefer, dtmf)

    override fun toString(): String =
        when {
            webhook != null -> "AssistantTool{webhook=$webhook}"
            retrieval != null -> "AssistantTool{retrieval=$retrieval}"
            handoff != null -> "AssistantTool{handoff=$handoff}"
            hangup != null -> "AssistantTool{hangup=$hangup}"
            transfer != null -> "AssistantTool{transfer=$transfer}"
            sipRefer != null -> "AssistantTool{sipRefer=$sipRefer}"
            dtmf != null -> "AssistantTool{dtmf=$dtmf}"
            _json != null -> "AssistantTool{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AssistantTool")
        }

    companion object {

        @JvmStatic fun ofWebhook(webhook: WebhookTool) = AssistantTool(webhook = webhook)

        @JvmStatic fun ofRetrieval(retrieval: RetrievalTool) = AssistantTool(retrieval = retrieval)

        /**
         * The handoff tool allows the assistant to hand off control of the conversation to another
         * AI assistant. By default, this will happen transparently to the end user.
         */
        @JvmStatic fun ofHandoff(handoff: HandoffTool) = AssistantTool(handoff = handoff)

        @JvmStatic fun ofHangup(hangup: HangupTool) = AssistantTool(hangup = hangup)

        @JvmStatic fun ofTransfer(transfer: TransferTool) = AssistantTool(transfer = transfer)

        @JvmStatic fun ofSipRefer(sipRefer: SipReferTool) = AssistantTool(sipRefer = sipRefer)

        @JvmStatic fun ofDtmf(dtmf: DtmfTool) = AssistantTool(dtmf = dtmf)
    }

    /**
     * An interface that defines how to map each variant of [AssistantTool] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitWebhook(webhook: WebhookTool): T

        fun visitRetrieval(retrieval: RetrievalTool): T

        /**
         * The handoff tool allows the assistant to hand off control of the conversation to another
         * AI assistant. By default, this will happen transparently to the end user.
         */
        fun visitHandoff(handoff: HandoffTool): T

        fun visitHangup(hangup: HangupTool): T

        fun visitTransfer(transfer: TransferTool): T

        fun visitSipRefer(sipRefer: SipReferTool): T

        fun visitDtmf(dtmf: DtmfTool): T

        /**
         * Maps an unknown variant of [AssistantTool] to a value of type [T].
         *
         * An instance of [AssistantTool] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown AssistantTool: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<AssistantTool>(AssistantTool::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): AssistantTool {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<WebhookTool>())?.let {
                            AssistantTool(webhook = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<RetrievalTool>())?.let {
                            AssistantTool(retrieval = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<HandoffTool>())?.let {
                            AssistantTool(handoff = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<HangupTool>())?.let {
                            AssistantTool(hangup = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<TransferTool>())?.let {
                            AssistantTool(transfer = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SipReferTool>())?.let {
                            AssistantTool(sipRefer = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DtmfTool>())?.let {
                            AssistantTool(dtmf = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> AssistantTool(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<AssistantTool>(AssistantTool::class) {

        override fun serialize(
            value: AssistantTool,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.webhook != null -> generator.writeObject(value.webhook)
                value.retrieval != null -> generator.writeObject(value.retrieval)
                value.handoff != null -> generator.writeObject(value.handoff)
                value.hangup != null -> generator.writeObject(value.hangup)
                value.transfer != null -> generator.writeObject(value.transfer)
                value.sipRefer != null -> generator.writeObject(value.sipRefer)
                value.dtmf != null -> generator.writeObject(value.dtmf)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AssistantTool")
            }
        }
    }

    /**
     * The handoff tool allows the assistant to hand off control of the conversation to another AI
     * assistant. By default, this will happen transparently to the end user.
     */
    class HandoffTool
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val handoff: JsonField<Handoff>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("handoff") @ExcludeMissing handoff: JsonField<Handoff> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(handoff, type, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun handoff(): Handoff = handoff.getRequired("handoff")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [handoff].
         *
         * Unlike [handoff], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("handoff") @ExcludeMissing fun _handoff(): JsonField<Handoff> = handoff

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [HandoffTool].
             *
             * The following fields are required:
             * ```java
             * .handoff()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [HandoffTool]. */
        class Builder internal constructor() {

            private var handoff: JsonField<Handoff>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(handoffTool: HandoffTool) = apply {
                handoff = handoffTool.handoff
                type = handoffTool.type
                additionalProperties = handoffTool.additionalProperties.toMutableMap()
            }

            fun handoff(handoff: Handoff) = handoff(JsonField.of(handoff))

            /**
             * Sets [Builder.handoff] to an arbitrary JSON value.
             *
             * You should usually call [Builder.handoff] with a well-typed [Handoff] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun handoff(handoff: JsonField<Handoff>) = apply { this.handoff = handoff }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [HandoffTool].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .handoff()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): HandoffTool =
                HandoffTool(
                    checkRequired("handoff", handoff),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): HandoffTool = apply {
            if (validated) {
                return@apply
            }

            handoff().validate()
            type().validate()
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
            (handoff.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Handoff
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val aiAssistants: JsonField<List<AiAssistant>>,
            private val voiceMode: JsonField<VoiceMode>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ai_assistants")
                @ExcludeMissing
                aiAssistants: JsonField<List<AiAssistant>> = JsonMissing.of(),
                @JsonProperty("voice_mode")
                @ExcludeMissing
                voiceMode: JsonField<VoiceMode> = JsonMissing.of(),
            ) : this(aiAssistants, voiceMode, mutableMapOf())

            /**
             * List of possible assistants that can receive a handoff.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun aiAssistants(): List<AiAssistant> = aiAssistants.getRequired("ai_assistants")

            /**
             * With the unified voice mode all assistants share the same voice, making the handoff
             * transparent to the user. With the distinct voice mode all assistants retain their
             * voice configuration, providing the experience of a conference call with a team of
             * assistants.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun voiceMode(): Optional<VoiceMode> = voiceMode.getOptional("voice_mode")

            /**
             * Returns the raw JSON value of [aiAssistants].
             *
             * Unlike [aiAssistants], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ai_assistants")
            @ExcludeMissing
            fun _aiAssistants(): JsonField<List<AiAssistant>> = aiAssistants

            /**
             * Returns the raw JSON value of [voiceMode].
             *
             * Unlike [voiceMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("voice_mode")
            @ExcludeMissing
            fun _voiceMode(): JsonField<VoiceMode> = voiceMode

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
                 * Returns a mutable builder for constructing an instance of [Handoff].
                 *
                 * The following fields are required:
                 * ```java
                 * .aiAssistants()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Handoff]. */
            class Builder internal constructor() {

                private var aiAssistants: JsonField<MutableList<AiAssistant>>? = null
                private var voiceMode: JsonField<VoiceMode> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(handoff: Handoff) = apply {
                    aiAssistants = handoff.aiAssistants.map { it.toMutableList() }
                    voiceMode = handoff.voiceMode
                    additionalProperties = handoff.additionalProperties.toMutableMap()
                }

                /** List of possible assistants that can receive a handoff. */
                fun aiAssistants(aiAssistants: List<AiAssistant>) =
                    aiAssistants(JsonField.of(aiAssistants))

                /**
                 * Sets [Builder.aiAssistants] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aiAssistants] with a well-typed
                 * `List<AiAssistant>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun aiAssistants(aiAssistants: JsonField<List<AiAssistant>>) = apply {
                    this.aiAssistants = aiAssistants.map { it.toMutableList() }
                }

                /**
                 * Adds a single [AiAssistant] to [aiAssistants].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAiAssistant(aiAssistant: AiAssistant) = apply {
                    aiAssistants =
                        (aiAssistants ?: JsonField.of(mutableListOf())).also {
                            checkKnown("aiAssistants", it).add(aiAssistant)
                        }
                }

                /**
                 * With the unified voice mode all assistants share the same voice, making the
                 * handoff transparent to the user. With the distinct voice mode all assistants
                 * retain their voice configuration, providing the experience of a conference call
                 * with a team of assistants.
                 */
                fun voiceMode(voiceMode: VoiceMode) = voiceMode(JsonField.of(voiceMode))

                /**
                 * Sets [Builder.voiceMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.voiceMode] with a well-typed [VoiceMode] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun voiceMode(voiceMode: JsonField<VoiceMode>) = apply {
                    this.voiceMode = voiceMode
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
                 * Returns an immutable instance of [Handoff].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .aiAssistants()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Handoff =
                    Handoff(
                        checkRequired("aiAssistants", aiAssistants).map { it.toImmutable() },
                        voiceMode,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Handoff = apply {
                if (validated) {
                    return@apply
                }

                aiAssistants().forEach { it.validate() }
                voiceMode().ifPresent { it.validate() }
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
                (aiAssistants.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (voiceMode.asKnown().getOrNull()?.validity() ?: 0)

            class AiAssistant
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                ) : this(id, name, mutableMapOf())

                /**
                 * The ID of the assistant to hand off to.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Helpful name for giving context on when to handoff to the assistant.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * Returns a mutable builder for constructing an instance of [AiAssistant].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .name()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AiAssistant]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(aiAssistant: AiAssistant) = apply {
                        id = aiAssistant.id
                        name = aiAssistant.name
                        additionalProperties = aiAssistant.additionalProperties.toMutableMap()
                    }

                    /** The ID of the assistant to hand off to. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** Helpful name for giving context on when to handoff to the assistant. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Returns an immutable instance of [AiAssistant].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AiAssistant =
                        AiAssistant(
                            checkRequired("id", id),
                            checkRequired("name", name),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AiAssistant = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
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
                        (if (name.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AiAssistant &&
                        id == other.id &&
                        name == other.name &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AiAssistant{id=$id, name=$name, additionalProperties=$additionalProperties}"
            }

            /**
             * With the unified voice mode all assistants share the same voice, making the handoff
             * transparent to the user. With the distinct voice mode all assistants retain their
             * voice configuration, providing the experience of a conference call with a team of
             * assistants.
             */
            class VoiceMode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val UNIFIED = of("unified")

                    @JvmField val DISTINCT = of("distinct")

                    @JvmStatic fun of(value: String) = VoiceMode(JsonField.of(value))
                }

                /** An enum containing [VoiceMode]'s known values. */
                enum class Known {
                    UNIFIED,
                    DISTINCT,
                }

                /**
                 * An enum containing [VoiceMode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [VoiceMode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    UNIFIED,
                    DISTINCT,
                    /**
                     * An enum member indicating that [VoiceMode] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        UNIFIED -> Value.UNIFIED
                        DISTINCT -> Value.DISTINCT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        UNIFIED -> Known.UNIFIED
                        DISTINCT -> Known.DISTINCT
                        else -> throw TelnyxInvalidDataException("Unknown VoiceMode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): VoiceMode = apply {
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

                    return other is VoiceMode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Handoff &&
                    aiAssistants == other.aiAssistants &&
                    voiceMode == other.voiceMode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(aiAssistants, voiceMode, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Handoff{aiAssistants=$aiAssistants, voiceMode=$voiceMode, additionalProperties=$additionalProperties}"
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val HANDOFF = of("handoff")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                HANDOFF
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HANDOFF,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    HANDOFF -> Value.HANDOFF
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    HANDOFF -> Known.HANDOFF
                    else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

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

            return other is HandoffTool &&
                handoff == other.handoff &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(handoff, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "HandoffTool{handoff=$handoff, type=$type, additionalProperties=$additionalProperties}"
    }

    class SipReferTool
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val refer: JsonField<Refer>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("refer") @ExcludeMissing refer: JsonField<Refer> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(refer, type, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun refer(): Refer = refer.getRequired("refer")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [refer].
         *
         * Unlike [refer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("refer") @ExcludeMissing fun _refer(): JsonField<Refer> = refer

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [SipReferTool].
             *
             * The following fields are required:
             * ```java
             * .refer()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SipReferTool]. */
        class Builder internal constructor() {

            private var refer: JsonField<Refer>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sipReferTool: SipReferTool) = apply {
                refer = sipReferTool.refer
                type = sipReferTool.type
                additionalProperties = sipReferTool.additionalProperties.toMutableMap()
            }

            fun refer(refer: Refer) = refer(JsonField.of(refer))

            /**
             * Sets [Builder.refer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refer] with a well-typed [Refer] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun refer(refer: JsonField<Refer>) = apply { this.refer = refer }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [SipReferTool].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .refer()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SipReferTool =
                SipReferTool(
                    checkRequired("refer", refer),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SipReferTool = apply {
            if (validated) {
                return@apply
            }

            refer().validate()
            type().validate()
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
            (refer.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Refer
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val targets: JsonField<List<Target>>,
            private val customHeaders: JsonField<List<CustomHeader>>,
            private val sipHeaders: JsonField<List<SipHeader>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("targets")
                @ExcludeMissing
                targets: JsonField<List<Target>> = JsonMissing.of(),
                @JsonProperty("custom_headers")
                @ExcludeMissing
                customHeaders: JsonField<List<CustomHeader>> = JsonMissing.of(),
                @JsonProperty("sip_headers")
                @ExcludeMissing
                sipHeaders: JsonField<List<SipHeader>> = JsonMissing.of(),
            ) : this(targets, customHeaders, sipHeaders, mutableMapOf())

            /**
             * The different possible targets of the SIP refer. The assistant will be able to choose
             * one of the targets to refer the call to.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun targets(): List<Target> = targets.getRequired("targets")

            /**
             * Custom headers to be added to the SIP REFER.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun customHeaders(): Optional<List<CustomHeader>> =
                customHeaders.getOptional("custom_headers")

            /**
             * SIP headers to be added to the SIP REFER. Currently only User-to-User and Diversion
             * headers are supported.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipHeaders(): Optional<List<SipHeader>> = sipHeaders.getOptional("sip_headers")

            /**
             * Returns the raw JSON value of [targets].
             *
             * Unlike [targets], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("targets")
            @ExcludeMissing
            fun _targets(): JsonField<List<Target>> = targets

            /**
             * Returns the raw JSON value of [customHeaders].
             *
             * Unlike [customHeaders], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("custom_headers")
            @ExcludeMissing
            fun _customHeaders(): JsonField<List<CustomHeader>> = customHeaders

            /**
             * Returns the raw JSON value of [sipHeaders].
             *
             * Unlike [sipHeaders], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sip_headers")
            @ExcludeMissing
            fun _sipHeaders(): JsonField<List<SipHeader>> = sipHeaders

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
                 * Returns a mutable builder for constructing an instance of [Refer].
                 *
                 * The following fields are required:
                 * ```java
                 * .targets()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Refer]. */
            class Builder internal constructor() {

                private var targets: JsonField<MutableList<Target>>? = null
                private var customHeaders: JsonField<MutableList<CustomHeader>>? = null
                private var sipHeaders: JsonField<MutableList<SipHeader>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(refer: Refer) = apply {
                    targets = refer.targets.map { it.toMutableList() }
                    customHeaders = refer.customHeaders.map { it.toMutableList() }
                    sipHeaders = refer.sipHeaders.map { it.toMutableList() }
                    additionalProperties = refer.additionalProperties.toMutableMap()
                }

                /**
                 * The different possible targets of the SIP refer. The assistant will be able to
                 * choose one of the targets to refer the call to.
                 */
                fun targets(targets: List<Target>) = targets(JsonField.of(targets))

                /**
                 * Sets [Builder.targets] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.targets] with a well-typed `List<Target>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun targets(targets: JsonField<List<Target>>) = apply {
                    this.targets = targets.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Target] to [targets].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTarget(target: Target) = apply {
                    targets =
                        (targets ?: JsonField.of(mutableListOf())).also {
                            checkKnown("targets", it).add(target)
                        }
                }

                /** Custom headers to be added to the SIP REFER. */
                fun customHeaders(customHeaders: List<CustomHeader>) =
                    customHeaders(JsonField.of(customHeaders))

                /**
                 * Sets [Builder.customHeaders] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customHeaders] with a well-typed
                 * `List<CustomHeader>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun customHeaders(customHeaders: JsonField<List<CustomHeader>>) = apply {
                    this.customHeaders = customHeaders.map { it.toMutableList() }
                }

                /**
                 * Adds a single [CustomHeader] to [customHeaders].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCustomHeader(customHeader: CustomHeader) = apply {
                    customHeaders =
                        (customHeaders ?: JsonField.of(mutableListOf())).also {
                            checkKnown("customHeaders", it).add(customHeader)
                        }
                }

                /**
                 * SIP headers to be added to the SIP REFER. Currently only User-to-User and
                 * Diversion headers are supported.
                 */
                fun sipHeaders(sipHeaders: List<SipHeader>) = sipHeaders(JsonField.of(sipHeaders))

                /**
                 * Sets [Builder.sipHeaders] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sipHeaders] with a well-typed `List<SipHeader>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sipHeaders(sipHeaders: JsonField<List<SipHeader>>) = apply {
                    this.sipHeaders = sipHeaders.map { it.toMutableList() }
                }

                /**
                 * Adds a single [SipHeader] to [sipHeaders].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSipHeader(sipHeader: SipHeader) = apply {
                    sipHeaders =
                        (sipHeaders ?: JsonField.of(mutableListOf())).also {
                            checkKnown("sipHeaders", it).add(sipHeader)
                        }
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
                 * Returns an immutable instance of [Refer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .targets()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Refer =
                    Refer(
                        checkRequired("targets", targets).map { it.toImmutable() },
                        (customHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                        (sipHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Refer = apply {
                if (validated) {
                    return@apply
                }

                targets().forEach { it.validate() }
                customHeaders().ifPresent { it.forEach { it.validate() } }
                sipHeaders().ifPresent { it.forEach { it.validate() } }
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
                (targets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (customHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (sipHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Target
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val sipAddress: JsonField<String>,
                private val sipAuthPassword: JsonField<String>,
                private val sipAuthUsername: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("sip_address")
                    @ExcludeMissing
                    sipAddress: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("sip_auth_password")
                    @ExcludeMissing
                    sipAuthPassword: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("sip_auth_username")
                    @ExcludeMissing
                    sipAuthUsername: JsonField<String> = JsonMissing.of(),
                ) : this(name, sipAddress, sipAuthPassword, sipAuthUsername, mutableMapOf())

                /**
                 * The name of the target.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * The SIP URI to which the call will be referred.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun sipAddress(): String = sipAddress.getRequired("sip_address")

                /**
                 * SIP Authentication password used for SIP challenges.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun sipAuthPassword(): Optional<String> =
                    sipAuthPassword.getOptional("sip_auth_password")

                /**
                 * SIP Authentication username used for SIP challenges.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun sipAuthUsername(): Optional<String> =
                    sipAuthUsername.getOptional("sip_auth_username")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [sipAddress].
                 *
                 * Unlike [sipAddress], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("sip_address")
                @ExcludeMissing
                fun _sipAddress(): JsonField<String> = sipAddress

                /**
                 * Returns the raw JSON value of [sipAuthPassword].
                 *
                 * Unlike [sipAuthPassword], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("sip_auth_password")
                @ExcludeMissing
                fun _sipAuthPassword(): JsonField<String> = sipAuthPassword

                /**
                 * Returns the raw JSON value of [sipAuthUsername].
                 *
                 * Unlike [sipAuthUsername], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("sip_auth_username")
                @ExcludeMissing
                fun _sipAuthUsername(): JsonField<String> = sipAuthUsername

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
                     * Returns a mutable builder for constructing an instance of [Target].
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .sipAddress()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Target]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var sipAddress: JsonField<String>? = null
                    private var sipAuthPassword: JsonField<String> = JsonMissing.of()
                    private var sipAuthUsername: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(target: Target) = apply {
                        name = target.name
                        sipAddress = target.sipAddress
                        sipAuthPassword = target.sipAuthPassword
                        sipAuthUsername = target.sipAuthUsername
                        additionalProperties = target.additionalProperties.toMutableMap()
                    }

                    /** The name of the target. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** The SIP URI to which the call will be referred. */
                    fun sipAddress(sipAddress: String) = sipAddress(JsonField.of(sipAddress))

                    /**
                     * Sets [Builder.sipAddress] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sipAddress] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun sipAddress(sipAddress: JsonField<String>) = apply {
                        this.sipAddress = sipAddress
                    }

                    /** SIP Authentication password used for SIP challenges. */
                    fun sipAuthPassword(sipAuthPassword: String) =
                        sipAuthPassword(JsonField.of(sipAuthPassword))

                    /**
                     * Sets [Builder.sipAuthPassword] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sipAuthPassword] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun sipAuthPassword(sipAuthPassword: JsonField<String>) = apply {
                        this.sipAuthPassword = sipAuthPassword
                    }

                    /** SIP Authentication username used for SIP challenges. */
                    fun sipAuthUsername(sipAuthUsername: String) =
                        sipAuthUsername(JsonField.of(sipAuthUsername))

                    /**
                     * Sets [Builder.sipAuthUsername] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sipAuthUsername] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun sipAuthUsername(sipAuthUsername: JsonField<String>) = apply {
                        this.sipAuthUsername = sipAuthUsername
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
                     * Returns an immutable instance of [Target].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .sipAddress()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Target =
                        Target(
                            checkRequired("name", name),
                            checkRequired("sipAddress", sipAddress),
                            sipAuthPassword,
                            sipAuthUsername,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Target = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    sipAddress()
                    sipAuthPassword()
                    sipAuthUsername()
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
                        (if (sipAddress.asKnown().isPresent) 1 else 0) +
                        (if (sipAuthPassword.asKnown().isPresent) 1 else 0) +
                        (if (sipAuthUsername.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Target &&
                        name == other.name &&
                        sipAddress == other.sipAddress &&
                        sipAuthPassword == other.sipAuthPassword &&
                        sipAuthUsername == other.sipAuthUsername &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        name,
                        sipAddress,
                        sipAuthPassword,
                        sipAuthUsername,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Target{name=$name, sipAddress=$sipAddress, sipAuthPassword=$sipAuthPassword, sipAuthUsername=$sipAuthUsername, additionalProperties=$additionalProperties}"
            }

            class CustomHeader
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(name, value, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * The value of the header. Note that we support mustache templating for the value.
                 * For example you can use
                 * `{{#integration_secret}}test-secret{{/integration_secret}}` to pass the value of
                 * the integration secret.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun value(): Optional<String> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

                    /** Returns a mutable builder for constructing an instance of [CustomHeader]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CustomHeader]. */
                class Builder internal constructor() {

                    private var name: JsonField<String> = JsonMissing.of()
                    private var value: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(customHeader: CustomHeader) = apply {
                        name = customHeader.name
                        value = customHeader.value
                        additionalProperties = customHeader.additionalProperties.toMutableMap()
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The value of the header. Note that we support mustache templating for the
                     * value. For example you can use
                     * `{{#integration_secret}}test-secret{{/integration_secret}}` to pass the value
                     * of the integration secret.
                     */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [CustomHeader].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CustomHeader =
                        CustomHeader(name, value, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): CustomHeader = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    value()
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
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CustomHeader &&
                        name == other.name &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CustomHeader{name=$name, value=$value, additionalProperties=$additionalProperties}"
            }

            class SipHeader
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<Name>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name") @ExcludeMissing name: JsonField<Name> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(name, value, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<Name> = name.getOptional("name")

                /**
                 * The value of the header. Note that we support mustache templating for the value.
                 * For example you can use
                 * `{{#integration_secret}}test-secret{{/integration_secret}}` to pass the value of
                 * the integration secret.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun value(): Optional<String> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Name> = name

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

                    /** Returns a mutable builder for constructing an instance of [SipHeader]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SipHeader]. */
                class Builder internal constructor() {

                    private var name: JsonField<Name> = JsonMissing.of()
                    private var value: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(sipHeader: SipHeader) = apply {
                        name = sipHeader.name
                        value = sipHeader.value
                        additionalProperties = sipHeader.additionalProperties.toMutableMap()
                    }

                    fun name(name: Name) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [Name] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<Name>) = apply { this.name = name }

                    /**
                     * The value of the header. Note that we support mustache templating for the
                     * value. For example you can use
                     * `{{#integration_secret}}test-secret{{/integration_secret}}` to pass the value
                     * of the integration secret.
                     */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [SipHeader].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): SipHeader =
                        SipHeader(name, value, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): SipHeader = apply {
                    if (validated) {
                        return@apply
                    }

                    name().ifPresent { it.validate() }
                    value()
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
                    (name.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                class Name @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val USER_TO_USER = of("User-to-User")

                        @JvmField val DIVERSION = of("Diversion")

                        @JvmStatic fun of(value: String) = Name(JsonField.of(value))
                    }

                    /** An enum containing [Name]'s known values. */
                    enum class Known {
                        USER_TO_USER,
                        DIVERSION,
                    }

                    /**
                     * An enum containing [Name]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Name] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        USER_TO_USER,
                        DIVERSION,
                        /**
                         * An enum member indicating that [Name] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            USER_TO_USER -> Value.USER_TO_USER
                            DIVERSION -> Value.DIVERSION
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            USER_TO_USER -> Known.USER_TO_USER
                            DIVERSION -> Known.DIVERSION
                            else -> throw TelnyxInvalidDataException("Unknown Name: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Name = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Name && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SipHeader &&
                        name == other.name &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SipHeader{name=$name, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Refer &&
                    targets == other.targets &&
                    customHeaders == other.customHeaders &&
                    sipHeaders == other.sipHeaders &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(targets, customHeaders, sipHeaders, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Refer{targets=$targets, customHeaders=$customHeaders, sipHeaders=$sipHeaders, additionalProperties=$additionalProperties}"
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val REFER = of("refer")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                REFER
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REFER,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    REFER -> Value.REFER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    REFER -> Known.REFER
                    else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

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

            return other is SipReferTool &&
                refer == other.refer &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(refer, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SipReferTool{refer=$refer, type=$type, additionalProperties=$additionalProperties}"
    }

    class DtmfTool
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val sendDtmf: JsonField<SendDtmf>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("send_dtmf")
            @ExcludeMissing
            sendDtmf: JsonField<SendDtmf> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(sendDtmf, type, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sendDtmf(): SendDtmf = sendDtmf.getRequired("send_dtmf")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [sendDtmf].
         *
         * Unlike [sendDtmf], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("send_dtmf") @ExcludeMissing fun _sendDtmf(): JsonField<SendDtmf> = sendDtmf

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [DtmfTool].
             *
             * The following fields are required:
             * ```java
             * .sendDtmf()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DtmfTool]. */
        class Builder internal constructor() {

            private var sendDtmf: JsonField<SendDtmf>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dtmfTool: DtmfTool) = apply {
                sendDtmf = dtmfTool.sendDtmf
                type = dtmfTool.type
                additionalProperties = dtmfTool.additionalProperties.toMutableMap()
            }

            fun sendDtmf(sendDtmf: SendDtmf) = sendDtmf(JsonField.of(sendDtmf))

            /**
             * Sets [Builder.sendDtmf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendDtmf] with a well-typed [SendDtmf] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sendDtmf(sendDtmf: JsonField<SendDtmf>) = apply { this.sendDtmf = sendDtmf }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [DtmfTool].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .sendDtmf()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DtmfTool =
                DtmfTool(
                    checkRequired("sendDtmf", sendDtmf),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DtmfTool = apply {
            if (validated) {
                return@apply
            }

            sendDtmf().validate()
            type().validate()
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
            (sendDtmf.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class SendDtmf
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

                /** Returns a mutable builder for constructing an instance of [SendDtmf]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SendDtmf]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(sendDtmf: SendDtmf) = apply {
                    additionalProperties = sendDtmf.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [SendDtmf].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): SendDtmf = SendDtmf(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): SendDtmf = apply {
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

                return other is SendDtmf && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "SendDtmf{additionalProperties=$additionalProperties}"
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SEND_DTMF = of("send_dtmf")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                SEND_DTMF
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SEND_DTMF,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SEND_DTMF -> Value.SEND_DTMF
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SEND_DTMF -> Known.SEND_DTMF
                    else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

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

            return other is DtmfTool &&
                sendDtmf == other.sendDtmf &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(sendDtmf, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DtmfTool{sendDtmf=$sendDtmf, type=$type, additionalProperties=$additionalProperties}"
    }
}
