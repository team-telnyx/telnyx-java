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
 * Conversation flow as supplied by API clients (create / update).
 *
 * A directed graph of `FlowNodeReq` connected by `FlowEdge`s. Validation enforces unique node/edge
 * IDs, that `start_node_id` references a real node, and that every edge's endpoints reference real
 * nodes.
 */
class ConversationFlowReq
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val nodes: JsonField<List<Node>>,
    private val startNodeId: JsonField<String>,
    private val edges: JsonField<List<FlowEdge>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("nodes") @ExcludeMissing nodes: JsonField<List<Node>> = JsonMissing.of(),
        @JsonProperty("start_node_id")
        @ExcludeMissing
        startNodeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("edges") @ExcludeMissing edges: JsonField<List<FlowEdge>> = JsonMissing.of(),
    ) : this(nodes, startNodeId, edges, mutableMapOf())

    /**
     * All nodes in the flow. Must contain `start_node_id`. Each node is a prompt node (`type:
     * prompt`) or a tool node (`type: tool`).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nodes(): List<Node> = nodes.getRequired("nodes")

    /**
     * ID of the node where the conversation begins.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startNodeId(): String = startNodeId.getRequired("start_node_id")

    /**
     * Directed transitions between nodes. May be empty for a single-node flow.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun edges(): Optional<List<FlowEdge>> = edges.getOptional("edges")

    /**
     * Returns the raw JSON value of [nodes].
     *
     * Unlike [nodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nodes") @ExcludeMissing fun _nodes(): JsonField<List<Node>> = nodes

    /**
     * Returns the raw JSON value of [startNodeId].
     *
     * Unlike [startNodeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_node_id")
    @ExcludeMissing
    fun _startNodeId(): JsonField<String> = startNodeId

    /**
     * Returns the raw JSON value of [edges].
     *
     * Unlike [edges], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("edges") @ExcludeMissing fun _edges(): JsonField<List<FlowEdge>> = edges

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
         * Returns a mutable builder for constructing an instance of [ConversationFlowReq].
         *
         * The following fields are required:
         * ```java
         * .nodes()
         * .startNodeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConversationFlowReq]. */
    class Builder internal constructor() {

        private var nodes: JsonField<MutableList<Node>>? = null
        private var startNodeId: JsonField<String>? = null
        private var edges: JsonField<MutableList<FlowEdge>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(conversationFlowReq: ConversationFlowReq) = apply {
            nodes = conversationFlowReq.nodes.map { it.toMutableList() }
            startNodeId = conversationFlowReq.startNodeId
            edges = conversationFlowReq.edges.map { it.toMutableList() }
            additionalProperties = conversationFlowReq.additionalProperties.toMutableMap()
        }

        /**
         * All nodes in the flow. Must contain `start_node_id`. Each node is a prompt node (`type:
         * prompt`) or a tool node (`type: tool`).
         */
        fun nodes(nodes: List<Node>) = nodes(JsonField.of(nodes))

        /**
         * Sets [Builder.nodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nodes] with a well-typed `List<Node>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nodes(nodes: JsonField<List<Node>>) = apply {
            this.nodes = nodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Node] to [nodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNode(node: Node) = apply {
            nodes =
                (nodes ?: JsonField.of(mutableListOf())).also { checkKnown("nodes", it).add(node) }
        }

        /** Alias for calling [addNode] with `Node.ofPrompt(prompt)`. */
        fun addNode(prompt: Node.Prompt) = addNode(Node.ofPrompt(prompt))

        /** Alias for calling [addNode] with `Node.ofTool(tool)`. */
        fun addNode(tool: Node.Tool) = addNode(Node.ofTool(tool))

        /** Alias for calling [addNode] with `Node.ofSpeak(speak)`. */
        fun addNode(speak: Node.Speak) = addNode(Node.ofSpeak(speak))

        /** ID of the node where the conversation begins. */
        fun startNodeId(startNodeId: String) = startNodeId(JsonField.of(startNodeId))

        /**
         * Sets [Builder.startNodeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startNodeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startNodeId(startNodeId: JsonField<String>) = apply { this.startNodeId = startNodeId }

        /** Directed transitions between nodes. May be empty for a single-node flow. */
        fun edges(edges: List<FlowEdge>) = edges(JsonField.of(edges))

        /**
         * Sets [Builder.edges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.edges] with a well-typed `List<FlowEdge>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun edges(edges: JsonField<List<FlowEdge>>) = apply {
            this.edges = edges.map { it.toMutableList() }
        }

        /**
         * Adds a single [FlowEdge] to [edges].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEdge(edge: FlowEdge) = apply {
            edges =
                (edges ?: JsonField.of(mutableListOf())).also { checkKnown("edges", it).add(edge) }
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
         * Returns an immutable instance of [ConversationFlowReq].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .nodes()
         * .startNodeId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConversationFlowReq =
            ConversationFlowReq(
                checkRequired("nodes", nodes).map { it.toImmutable() },
                checkRequired("startNodeId", startNodeId),
                (edges ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): ConversationFlowReq = apply {
        if (validated) {
            return@apply
        }

        nodes().forEach { it.validate() }
        startNodeId()
        edges().ifPresent { it.forEach { it.validate() } }
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
        (nodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (startNodeId.asKnown().isPresent) 1 else 0) +
            (edges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * One step in a conversation flow, as supplied by API clients.
     *
     * Each node carries the prompt, tool scope, and optional overrides for
     * model/voice/transcription. Unset overrides cascade from the assistant.
     */
    @JsonDeserialize(using = Node.Deserializer::class)
    @JsonSerialize(using = Node.Serializer::class)
    class Node
    private constructor(
        private val prompt: Prompt? = null,
        private val tool: Tool? = null,
        private val speak: Speak? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * One step in a conversation flow, as supplied by API clients.
         *
         * Each node carries the prompt, tool scope, and optional overrides for
         * model/voice/transcription. Unset overrides cascade from the assistant.
         */
        fun prompt(): Optional<Prompt> = Optional.ofNullable(prompt)

        /**
         * A standalone tool step in a conversation flow, as supplied by clients.
         *
         * Unlike a prompt node, a tool node has no instructions or model — it isn't an LLM turn.
         * Reaching it deterministically runs one shared tool (arguments filled from matching
         * dynamic variables by name), then routes on the result via outgoing `tool_result` edges.
         */
        fun tool(): Optional<Tool> = Optional.ofNullable(tool)

        /**
         * A standalone scripted-message step in a flow, as supplied by clients.
         *
         * Unlike a prompt node, a speak node has no instructions or model — it isn't an LLM turn.
         * Reaching it delivers `message` to the user verbatim (with `{{variable}}` interpolation),
         * then routes via outgoing `llm` / `expression` edges.
         */
        fun speak(): Optional<Speak> = Optional.ofNullable(speak)

        fun isPrompt(): Boolean = prompt != null

        fun isTool(): Boolean = tool != null

        fun isSpeak(): Boolean = speak != null

        /**
         * One step in a conversation flow, as supplied by API clients.
         *
         * Each node carries the prompt, tool scope, and optional overrides for
         * model/voice/transcription. Unset overrides cascade from the assistant.
         */
        fun asPrompt(): Prompt = prompt.getOrThrow("prompt")

        /**
         * A standalone tool step in a conversation flow, as supplied by clients.
         *
         * Unlike a prompt node, a tool node has no instructions or model — it isn't an LLM turn.
         * Reaching it deterministically runs one shared tool (arguments filled from matching
         * dynamic variables by name), then routes on the result via outgoing `tool_result` edges.
         */
        fun asTool(): Tool = tool.getOrThrow("tool")

        /**
         * A standalone scripted-message step in a flow, as supplied by clients.
         *
         * Unlike a prompt node, a speak node has no instructions or model — it isn't an LLM turn.
         * Reaching it delivers `message` to the user verbatim (with `{{variable}}` interpolation),
         * then routes via outgoing `llm` / `expression` edges.
         */
        fun asSpeak(): Speak = speak.getOrThrow("speak")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = node.accept(new Node.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitPrompt(Prompt prompt) {
         *         return Optional.of(prompt.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                prompt != null -> visitor.visitPrompt(prompt)
                tool != null -> visitor.visitTool(tool)
                speak != null -> visitor.visitSpeak(speak)
                else -> visitor.unknown(_json)
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
        fun validate(): Node = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPrompt(prompt: Prompt) {
                        prompt.validate()
                    }

                    override fun visitTool(tool: Tool) {
                        tool.validate()
                    }

                    override fun visitSpeak(speak: Speak) {
                        speak.validate()
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
                    override fun visitPrompt(prompt: Prompt) = prompt.validity()

                    override fun visitTool(tool: Tool) = tool.validity()

                    override fun visitSpeak(speak: Speak) = speak.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Node &&
                prompt == other.prompt &&
                tool == other.tool &&
                speak == other.speak
        }

        override fun hashCode(): Int = Objects.hash(prompt, tool, speak)

        override fun toString(): String =
            when {
                prompt != null -> "Node{prompt=$prompt}"
                tool != null -> "Node{tool=$tool}"
                speak != null -> "Node{speak=$speak}"
                _json != null -> "Node{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Node")
            }

        companion object {

            /**
             * One step in a conversation flow, as supplied by API clients.
             *
             * Each node carries the prompt, tool scope, and optional overrides for
             * model/voice/transcription. Unset overrides cascade from the assistant.
             */
            @JvmStatic fun ofPrompt(prompt: Prompt) = Node(prompt = prompt)

            /**
             * A standalone tool step in a conversation flow, as supplied by clients.
             *
             * Unlike a prompt node, a tool node has no instructions or model — it isn't an LLM
             * turn. Reaching it deterministically runs one shared tool (arguments filled from
             * matching dynamic variables by name), then routes on the result via outgoing
             * `tool_result` edges.
             */
            @JvmStatic fun ofTool(tool: Tool) = Node(tool = tool)

            /**
             * A standalone scripted-message step in a flow, as supplied by clients.
             *
             * Unlike a prompt node, a speak node has no instructions or model — it isn't an LLM
             * turn. Reaching it delivers `message` to the user verbatim (with `{{variable}}`
             * interpolation), then routes via outgoing `llm` / `expression` edges.
             */
            @JvmStatic fun ofSpeak(speak: Speak) = Node(speak = speak)
        }

        /** An interface that defines how to map each variant of [Node] to a value of type [T]. */
        interface Visitor<out T> {

            /**
             * One step in a conversation flow, as supplied by API clients.
             *
             * Each node carries the prompt, tool scope, and optional overrides for
             * model/voice/transcription. Unset overrides cascade from the assistant.
             */
            fun visitPrompt(prompt: Prompt): T

            /**
             * A standalone tool step in a conversation flow, as supplied by clients.
             *
             * Unlike a prompt node, a tool node has no instructions or model — it isn't an LLM
             * turn. Reaching it deterministically runs one shared tool (arguments filled from
             * matching dynamic variables by name), then routes on the result via outgoing
             * `tool_result` edges.
             */
            fun visitTool(tool: Tool): T

            /**
             * A standalone scripted-message step in a flow, as supplied by clients.
             *
             * Unlike a prompt node, a speak node has no instructions or model — it isn't an LLM
             * turn. Reaching it delivers `message` to the user verbatim (with `{{variable}}`
             * interpolation), then routes via outgoing `llm` / `expression` edges.
             */
            fun visitSpeak(speak: Speak): T

            /**
             * Maps an unknown variant of [Node] to a value of type [T].
             *
             * An instance of [Node] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Node: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Node>(Node::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Node {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "prompt" -> {
                        return tryDeserialize(node, jacksonTypeRef<Prompt>())?.let {
                            Node(prompt = it, _json = json)
                        } ?: Node(_json = json)
                    }
                    "tool" -> {
                        return tryDeserialize(node, jacksonTypeRef<Tool>())?.let {
                            Node(tool = it, _json = json)
                        } ?: Node(_json = json)
                    }
                    "speak" -> {
                        return tryDeserialize(node, jacksonTypeRef<Speak>())?.let {
                            Node(speak = it, _json = json)
                        } ?: Node(_json = json)
                    }
                }

                return Node(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Node>(Node::class) {

            override fun serialize(
                value: Node,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.prompt != null -> generator.writeObject(value.prompt)
                    value.tool != null -> generator.writeObject(value.tool)
                    value.speak != null -> generator.writeObject(value.speak)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Node")
                }
            }
        }

        /**
         * One step in a conversation flow, as supplied by API clients.
         *
         * Each node carries the prompt, tool scope, and optional overrides for
         * model/voice/transcription. Unset overrides cascade from the assistant.
         */
        class Prompt
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val instructions: JsonField<String>,
            private val externalLlm: JsonField<ExternalLlmReq>,
            private val instructionsMode: JsonField<InstructionsMode>,
            private val llmApiKeyRef: JsonField<String>,
            private val model: JsonField<String>,
            private val name: JsonField<String>,
            private val position: JsonField<NodePosition>,
            private val sharedToolIds: JsonField<List<String>>,
            private val toolsMode: JsonField<ToolsMode>,
            private val transcription: JsonField<TranscriptionSettings>,
            private val type: JsonField<Type>,
            private val voiceSettings: JsonField<VoiceSettings>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("instructions")
                @ExcludeMissing
                instructions: JsonField<String> = JsonMissing.of(),
                @JsonProperty("external_llm")
                @ExcludeMissing
                externalLlm: JsonField<ExternalLlmReq> = JsonMissing.of(),
                @JsonProperty("instructions_mode")
                @ExcludeMissing
                instructionsMode: JsonField<InstructionsMode> = JsonMissing.of(),
                @JsonProperty("llm_api_key_ref")
                @ExcludeMissing
                llmApiKeyRef: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("position")
                @ExcludeMissing
                position: JsonField<NodePosition> = JsonMissing.of(),
                @JsonProperty("shared_tool_ids")
                @ExcludeMissing
                sharedToolIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("tools_mode")
                @ExcludeMissing
                toolsMode: JsonField<ToolsMode> = JsonMissing.of(),
                @JsonProperty("transcription")
                @ExcludeMissing
                transcription: JsonField<TranscriptionSettings> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("voice_settings")
                @ExcludeMissing
                voiceSettings: JsonField<VoiceSettings> = JsonMissing.of(),
            ) : this(
                id,
                instructions,
                externalLlm,
                instructionsMode,
                llmApiKeyRef,
                model,
                name,
                position,
                sharedToolIds,
                toolsMode,
                transcription,
                type,
                voiceSettings,
                mutableMapOf(),
            )

            /**
             * Caller-supplied unique identifier for this node within the flow.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Prompt that drives the LLM while this node is active. Required.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun instructions(): String = instructions.getRequired("instructions")

            /**
             * Override for `Assistant.external_llm` while this node is active. Use this to route a
             * node's turns to a different external LLM (different `model`, `base_url`,
             * credentials). Part of the LLM bundle — see `model` for cascade semantics. Mutually
             * exclusive with `model` on the node (a single LLM identity per node).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun externalLlm(): Optional<ExternalLlmReq> = externalLlm.getOptional("external_llm")

            /**
             * How `instructions` combine with the assistant-level instructions. `replace`
             * (default): the node's instructions are used alone. `append`: the node's instructions
             * are concatenated after the assistant's instructions.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun instructionsMode(): Optional<InstructionsMode> =
                instructionsMode.getOptional("instructions_mode")

            /**
             * Override for `Assistant.llm_api_key_ref` while this node is active. Part of the LLM
             * bundle — see `model` for cascade semantics.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun llmApiKeyRef(): Optional<String> = llmApiKeyRef.getOptional("llm_api_key_ref")

            /**
             * Override for `Assistant.model` while this node is active. Part of the LLM bundle
             * (`model` + `llm_api_key_ref` + `external_llm`): when any of the three is set on the
             * node, all three are taken from the node and the assistant-level LLM identity is not
             * consulted. When none of the three is set, the assistant's bundle cascades unchanged.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun model(): Optional<String> = model.getOptional("model")

            /**
             * Optional human-readable label, displayed in authoring UIs.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Optional canvas coordinates used by authoring UIs to lay out the graph. Ignored by
             * the runtime; round-trips so frontends can persist graph layout across reloads.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun position(): Optional<NodePosition> = position.getOptional("position")

            /**
             * IDs of shared (org-level) tools available at this node. Knowledge bases are attached
             * the same way — via a shared retrieval tool. Tools not listed here are not callable
             * while this node is active.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sharedToolIds(): Optional<List<String>> =
                sharedToolIds.getOptional("shared_tool_ids")

            /**
             * How `shared_tool_ids` combine with the assistant-level tool set. `replace` (default):
             * only the node's tools are callable. `append`: the node's tools are added to the
             * assistant's tools. Ignored when `shared_tool_ids` is null.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun toolsMode(): Optional<ToolsMode> = toolsMode.getOptional("tools_mode")

            /**
             * Per-node transcription override (model/language/region). Unset fields cascade from
             * the assistant-level transcription.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transcription(): Optional<TranscriptionSettings> =
                transcription.getOptional("transcription")

            /**
             * Node kind discriminator. `prompt` (default) is an LLM-driven step; `tool` is a
             * standalone tool execution (see `ToolNodeReq`).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Per-node voice override. Only fields set here override the assistant-level voice
             * settings; unset fields cascade.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun voiceSettings(): Optional<VoiceSettings> =
                voiceSettings.getOptional("voice_settings")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [instructions].
             *
             * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("instructions")
            @ExcludeMissing
            fun _instructions(): JsonField<String> = instructions

            /**
             * Returns the raw JSON value of [externalLlm].
             *
             * Unlike [externalLlm], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("external_llm")
            @ExcludeMissing
            fun _externalLlm(): JsonField<ExternalLlmReq> = externalLlm

            /**
             * Returns the raw JSON value of [instructionsMode].
             *
             * Unlike [instructionsMode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("instructions_mode")
            @ExcludeMissing
            fun _instructionsMode(): JsonField<InstructionsMode> = instructionsMode

            /**
             * Returns the raw JSON value of [llmApiKeyRef].
             *
             * Unlike [llmApiKeyRef], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("llm_api_key_ref")
            @ExcludeMissing
            fun _llmApiKeyRef(): JsonField<String> = llmApiKeyRef

            /**
             * Returns the raw JSON value of [model].
             *
             * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [position].
             *
             * Unlike [position], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("position")
            @ExcludeMissing
            fun _position(): JsonField<NodePosition> = position

            /**
             * Returns the raw JSON value of [sharedToolIds].
             *
             * Unlike [sharedToolIds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("shared_tool_ids")
            @ExcludeMissing
            fun _sharedToolIds(): JsonField<List<String>> = sharedToolIds

            /**
             * Returns the raw JSON value of [toolsMode].
             *
             * Unlike [toolsMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tools_mode")
            @ExcludeMissing
            fun _toolsMode(): JsonField<ToolsMode> = toolsMode

            /**
             * Returns the raw JSON value of [transcription].
             *
             * Unlike [transcription], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transcription")
            @ExcludeMissing
            fun _transcription(): JsonField<TranscriptionSettings> = transcription

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [voiceSettings].
             *
             * Unlike [voiceSettings], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("voice_settings")
            @ExcludeMissing
            fun _voiceSettings(): JsonField<VoiceSettings> = voiceSettings

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
                 * Returns a mutable builder for constructing an instance of [Prompt].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .instructions()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Prompt]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var instructions: JsonField<String>? = null
                private var externalLlm: JsonField<ExternalLlmReq> = JsonMissing.of()
                private var instructionsMode: JsonField<InstructionsMode> = JsonMissing.of()
                private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
                private var model: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var position: JsonField<NodePosition> = JsonMissing.of()
                private var sharedToolIds: JsonField<MutableList<String>>? = null
                private var toolsMode: JsonField<ToolsMode> = JsonMissing.of()
                private var transcription: JsonField<TranscriptionSettings> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var voiceSettings: JsonField<VoiceSettings> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(prompt: Prompt) = apply {
                    id = prompt.id
                    instructions = prompt.instructions
                    externalLlm = prompt.externalLlm
                    instructionsMode = prompt.instructionsMode
                    llmApiKeyRef = prompt.llmApiKeyRef
                    model = prompt.model
                    name = prompt.name
                    position = prompt.position
                    sharedToolIds = prompt.sharedToolIds.map { it.toMutableList() }
                    toolsMode = prompt.toolsMode
                    transcription = prompt.transcription
                    type = prompt.type
                    voiceSettings = prompt.voiceSettings
                    additionalProperties = prompt.additionalProperties.toMutableMap()
                }

                /** Caller-supplied unique identifier for this node within the flow. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Prompt that drives the LLM while this node is active. Required. */
                fun instructions(instructions: String) = instructions(JsonField.of(instructions))

                /**
                 * Sets [Builder.instructions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.instructions] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun instructions(instructions: JsonField<String>) = apply {
                    this.instructions = instructions
                }

                /**
                 * Override for `Assistant.external_llm` while this node is active. Use this to
                 * route a node's turns to a different external LLM (different `model`, `base_url`,
                 * credentials). Part of the LLM bundle — see `model` for cascade semantics.
                 * Mutually exclusive with `model` on the node (a single LLM identity per node).
                 */
                fun externalLlm(externalLlm: ExternalLlmReq) =
                    externalLlm(JsonField.of(externalLlm))

                /**
                 * Sets [Builder.externalLlm] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalLlm] with a well-typed [ExternalLlmReq]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalLlm(externalLlm: JsonField<ExternalLlmReq>) = apply {
                    this.externalLlm = externalLlm
                }

                /**
                 * How `instructions` combine with the assistant-level instructions. `replace`
                 * (default): the node's instructions are used alone. `append`: the node's
                 * instructions are concatenated after the assistant's instructions.
                 */
                fun instructionsMode(instructionsMode: InstructionsMode) =
                    instructionsMode(JsonField.of(instructionsMode))

                /**
                 * Sets [Builder.instructionsMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.instructionsMode] with a well-typed
                 * [InstructionsMode] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun instructionsMode(instructionsMode: JsonField<InstructionsMode>) = apply {
                    this.instructionsMode = instructionsMode
                }

                /**
                 * Override for `Assistant.llm_api_key_ref` while this node is active. Part of the
                 * LLM bundle — see `model` for cascade semantics.
                 */
                fun llmApiKeyRef(llmApiKeyRef: String) = llmApiKeyRef(JsonField.of(llmApiKeyRef))

                /**
                 * Sets [Builder.llmApiKeyRef] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.llmApiKeyRef] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun llmApiKeyRef(llmApiKeyRef: JsonField<String>) = apply {
                    this.llmApiKeyRef = llmApiKeyRef
                }

                /**
                 * Override for `Assistant.model` while this node is active. Part of the LLM bundle
                 * (`model` + `llm_api_key_ref` + `external_llm`): when any of the three is set on
                 * the node, all three are taken from the node and the assistant-level LLM identity
                 * is not consulted. When none of the three is set, the assistant's bundle cascades
                 * unchanged.
                 */
                fun model(model: String) = model(JsonField.of(model))

                /**
                 * Sets [Builder.model] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.model] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun model(model: JsonField<String>) = apply { this.model = model }

                /** Optional human-readable label, displayed in authoring UIs. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * Optional canvas coordinates used by authoring UIs to lay out the graph. Ignored
                 * by the runtime; round-trips so frontends can persist graph layout across reloads.
                 */
                fun position(position: NodePosition) = position(JsonField.of(position))

                /**
                 * Sets [Builder.position] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.position] with a well-typed [NodePosition] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun position(position: JsonField<NodePosition>) = apply { this.position = position }

                /**
                 * IDs of shared (org-level) tools available at this node. Knowledge bases are
                 * attached the same way — via a shared retrieval tool. Tools not listed here are
                 * not callable while this node is active.
                 */
                fun sharedToolIds(sharedToolIds: List<String>) =
                    sharedToolIds(JsonField.of(sharedToolIds))

                /**
                 * Sets [Builder.sharedToolIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sharedToolIds] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sharedToolIds(sharedToolIds: JsonField<List<String>>) = apply {
                    this.sharedToolIds = sharedToolIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [sharedToolIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSharedToolId(sharedToolId: String) = apply {
                    sharedToolIds =
                        (sharedToolIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("sharedToolIds", it).add(sharedToolId)
                        }
                }

                /**
                 * How `shared_tool_ids` combine with the assistant-level tool set. `replace`
                 * (default): only the node's tools are callable. `append`: the node's tools are
                 * added to the assistant's tools. Ignored when `shared_tool_ids` is null.
                 */
                fun toolsMode(toolsMode: ToolsMode) = toolsMode(JsonField.of(toolsMode))

                /**
                 * Sets [Builder.toolsMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolsMode] with a well-typed [ToolsMode] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun toolsMode(toolsMode: JsonField<ToolsMode>) = apply {
                    this.toolsMode = toolsMode
                }

                /**
                 * Per-node transcription override (model/language/region). Unset fields cascade
                 * from the assistant-level transcription.
                 */
                fun transcription(transcription: TranscriptionSettings) =
                    transcription(JsonField.of(transcription))

                /**
                 * Sets [Builder.transcription] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transcription] with a well-typed
                 * [TranscriptionSettings] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun transcription(transcription: JsonField<TranscriptionSettings>) = apply {
                    this.transcription = transcription
                }

                /**
                 * Node kind discriminator. `prompt` (default) is an LLM-driven step; `tool` is a
                 * standalone tool execution (see `ToolNodeReq`).
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * Per-node voice override. Only fields set here override the assistant-level voice
                 * settings; unset fields cascade.
                 */
                fun voiceSettings(voiceSettings: VoiceSettings) =
                    voiceSettings(JsonField.of(voiceSettings))

                /**
                 * Sets [Builder.voiceSettings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.voiceSettings] with a well-typed [VoiceSettings]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun voiceSettings(voiceSettings: JsonField<VoiceSettings>) = apply {
                    this.voiceSettings = voiceSettings
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
                 * Returns an immutable instance of [Prompt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .instructions()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Prompt =
                    Prompt(
                        checkRequired("id", id),
                        checkRequired("instructions", instructions),
                        externalLlm,
                        instructionsMode,
                        llmApiKeyRef,
                        model,
                        name,
                        position,
                        (sharedToolIds ?: JsonMissing.of()).map { it.toImmutable() },
                        toolsMode,
                        transcription,
                        type,
                        voiceSettings,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Prompt = apply {
                if (validated) {
                    return@apply
                }

                id()
                instructions()
                externalLlm().ifPresent { it.validate() }
                instructionsMode().ifPresent { it.validate() }
                llmApiKeyRef()
                model()
                name()
                position().ifPresent { it.validate() }
                sharedToolIds()
                toolsMode().ifPresent { it.validate() }
                transcription().ifPresent { it.validate() }
                type().ifPresent { it.validate() }
                voiceSettings().ifPresent { it.validate() }
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
                    (if (instructions.asKnown().isPresent) 1 else 0) +
                    (externalLlm.asKnown().getOrNull()?.validity() ?: 0) +
                    (instructionsMode.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
                    (if (model.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (position.asKnown().getOrNull()?.validity() ?: 0) +
                    (sharedToolIds.asKnown().getOrNull()?.size ?: 0) +
                    (toolsMode.asKnown().getOrNull()?.validity() ?: 0) +
                    (transcription.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (voiceSettings.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * How `instructions` combine with the assistant-level instructions. `replace`
             * (default): the node's instructions are used alone. `append`: the node's instructions
             * are concatenated after the assistant's instructions.
             */
            class InstructionsMode
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val REPLACE = of("replace")

                    @JvmField val APPEND = of("append")

                    @JvmStatic fun of(value: String) = InstructionsMode(JsonField.of(value))
                }

                /** An enum containing [InstructionsMode]'s known values. */
                enum class Known {
                    REPLACE,
                    APPEND,
                }

                /**
                 * An enum containing [InstructionsMode]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [InstructionsMode] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    REPLACE,
                    APPEND,
                    /**
                     * An enum member indicating that [InstructionsMode] was instantiated with an
                     * unknown value.
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
                        REPLACE -> Value.REPLACE
                        APPEND -> Value.APPEND
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
                        REPLACE -> Known.REPLACE
                        APPEND -> Known.APPEND
                        else -> throw TelnyxInvalidDataException("Unknown InstructionsMode: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): InstructionsMode = apply {
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

                    return other is InstructionsMode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * How `shared_tool_ids` combine with the assistant-level tool set. `replace` (default):
             * only the node's tools are callable. `append`: the node's tools are added to the
             * assistant's tools. Ignored when `shared_tool_ids` is null.
             */
            class ToolsMode @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val REPLACE = of("replace")

                    @JvmField val APPEND = of("append")

                    @JvmStatic fun of(value: String) = ToolsMode(JsonField.of(value))
                }

                /** An enum containing [ToolsMode]'s known values. */
                enum class Known {
                    REPLACE,
                    APPEND,
                }

                /**
                 * An enum containing [ToolsMode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [ToolsMode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    REPLACE,
                    APPEND,
                    /**
                     * An enum member indicating that [ToolsMode] was instantiated with an unknown
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
                        REPLACE -> Value.REPLACE
                        APPEND -> Value.APPEND
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
                        REPLACE -> Known.REPLACE
                        APPEND -> Known.APPEND
                        else -> throw TelnyxInvalidDataException("Unknown ToolsMode: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ToolsMode = apply {
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

                    return other is ToolsMode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Node kind discriminator. `prompt` (default) is an LLM-driven step; `tool` is a
             * standalone tool execution (see `ToolNodeReq`).
             */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val PROMPT = of("prompt")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PROMPT
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PROMPT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        PROMPT -> Value.PROMPT
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
                        PROMPT -> Known.PROMPT
                        else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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

                return other is Prompt &&
                    id == other.id &&
                    instructions == other.instructions &&
                    externalLlm == other.externalLlm &&
                    instructionsMode == other.instructionsMode &&
                    llmApiKeyRef == other.llmApiKeyRef &&
                    model == other.model &&
                    name == other.name &&
                    position == other.position &&
                    sharedToolIds == other.sharedToolIds &&
                    toolsMode == other.toolsMode &&
                    transcription == other.transcription &&
                    type == other.type &&
                    voiceSettings == other.voiceSettings &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    instructions,
                    externalLlm,
                    instructionsMode,
                    llmApiKeyRef,
                    model,
                    name,
                    position,
                    sharedToolIds,
                    toolsMode,
                    transcription,
                    type,
                    voiceSettings,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Prompt{id=$id, instructions=$instructions, externalLlm=$externalLlm, instructionsMode=$instructionsMode, llmApiKeyRef=$llmApiKeyRef, model=$model, name=$name, position=$position, sharedToolIds=$sharedToolIds, toolsMode=$toolsMode, transcription=$transcription, type=$type, voiceSettings=$voiceSettings, additionalProperties=$additionalProperties}"
        }

        /**
         * A standalone tool step in a conversation flow, as supplied by clients.
         *
         * Unlike a prompt node, a tool node has no instructions or model — it isn't an LLM turn.
         * Reaching it deterministically runs one shared tool (arguments filled from matching
         * dynamic variables by name), then routes on the result via outgoing `tool_result` edges.
         */
        class Tool
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val sharedToolId: JsonField<String>,
            private val name: JsonField<String>,
            private val position: JsonField<NodePosition>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("shared_tool_id")
                @ExcludeMissing
                sharedToolId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("position")
                @ExcludeMissing
                position: JsonField<NodePosition> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(id, sharedToolId, name, position, type, mutableMapOf())

            /**
             * Caller-supplied unique identifier for this node within the flow.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * ID of the single shared (org-level) tool this node executes. When the flow reaches
             * this node the tool runs as a deliberate step (no LLM turn); its outgoing
             * `tool_result` edges then route on the outcome. Arguments are filled from the
             * conversation's dynamic variables by name — a dynamic variable whose name matches one
             * of the tool's parameters supplies that argument. Cross-validated against the org's
             * shared tools on write.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sharedToolId(): String = sharedToolId.getRequired("shared_tool_id")

            /**
             * Optional human-readable label, displayed in authoring UIs.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Optional canvas coordinates used by authoring UIs to lay out the graph. Ignored by
             * the runtime; round-trips so frontends can persist graph layout across reloads.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun position(): Optional<NodePosition> = position.getOptional("position")

            /**
             * Node kind discriminator. Always `tool` for a tool node.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [sharedToolId].
             *
             * Unlike [sharedToolId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("shared_tool_id")
            @ExcludeMissing
            fun _sharedToolId(): JsonField<String> = sharedToolId

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [position].
             *
             * Unlike [position], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("position")
            @ExcludeMissing
            fun _position(): JsonField<NodePosition> = position

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
                 * Returns a mutable builder for constructing an instance of [Tool].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .sharedToolId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tool]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var sharedToolId: JsonField<String>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var position: JsonField<NodePosition> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tool: Tool) = apply {
                    id = tool.id
                    sharedToolId = tool.sharedToolId
                    name = tool.name
                    position = tool.position
                    type = tool.type
                    additionalProperties = tool.additionalProperties.toMutableMap()
                }

                /** Caller-supplied unique identifier for this node within the flow. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * ID of the single shared (org-level) tool this node executes. When the flow
                 * reaches this node the tool runs as a deliberate step (no LLM turn); its outgoing
                 * `tool_result` edges then route on the outcome. Arguments are filled from the
                 * conversation's dynamic variables by name — a dynamic variable whose name matches
                 * one of the tool's parameters supplies that argument. Cross-validated against the
                 * org's shared tools on write.
                 */
                fun sharedToolId(sharedToolId: String) = sharedToolId(JsonField.of(sharedToolId))

                /**
                 * Sets [Builder.sharedToolId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sharedToolId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sharedToolId(sharedToolId: JsonField<String>) = apply {
                    this.sharedToolId = sharedToolId
                }

                /** Optional human-readable label, displayed in authoring UIs. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * Optional canvas coordinates used by authoring UIs to lay out the graph. Ignored
                 * by the runtime; round-trips so frontends can persist graph layout across reloads.
                 */
                fun position(position: NodePosition) = position(JsonField.of(position))

                /**
                 * Sets [Builder.position] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.position] with a well-typed [NodePosition] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun position(position: JsonField<NodePosition>) = apply { this.position = position }

                /** Node kind discriminator. Always `tool` for a tool node. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Tool].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .sharedToolId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tool =
                    Tool(
                        checkRequired("id", id),
                        checkRequired("sharedToolId", sharedToolId),
                        name,
                        position,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Tool = apply {
                if (validated) {
                    return@apply
                }

                id()
                sharedToolId()
                name()
                position().ifPresent { it.validate() }
                type().ifPresent { it.validate() }
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
                    (if (sharedToolId.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (position.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /** Node kind discriminator. Always `tool` for a tool node. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val TOOL = of("tool")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    TOOL
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TOOL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        TOOL -> Value.TOOL
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
                        TOOL -> Known.TOOL
                        else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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

                return other is Tool &&
                    id == other.id &&
                    sharedToolId == other.sharedToolId &&
                    name == other.name &&
                    position == other.position &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, sharedToolId, name, position, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tool{id=$id, sharedToolId=$sharedToolId, name=$name, position=$position, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * A standalone scripted-message step in a flow, as supplied by clients.
         *
         * Unlike a prompt node, a speak node has no instructions or model — it isn't an LLM turn.
         * Reaching it delivers `message` to the user verbatim (with `{{variable}}` interpolation),
         * then routes via outgoing `llm` / `expression` edges.
         */
        class Speak
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val message: JsonField<String>,
            private val name: JsonField<String>,
            private val position: JsonField<NodePosition>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("position")
                @ExcludeMissing
                position: JsonField<NodePosition> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(id, message, name, position, type, mutableMapOf())

            /**
             * Caller-supplied unique identifier for this node within the flow.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Message delivered to the user verbatim when the flow reaches this node. No LLM turn —
             * the text is spoken/sent exactly as written. `{{variable}}` placeholders are
             * interpolated from the conversation's dynamic variables; an unresolved placeholder
             * renders as an empty string. After delivering, the flow routes via the node's outgoing
             * `llm` / `expression` edges (commonly a single unconditional edge).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun message(): String = message.getRequired("message")

            /**
             * Optional human-readable label, displayed in authoring UIs.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Optional canvas coordinates used by authoring UIs to lay out the graph. Ignored by
             * the runtime; round-trips so frontends can persist graph layout across reloads.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun position(): Optional<NodePosition> = position.getOptional("position")

            /**
             * Node kind discriminator. Always `speak` for a speak node.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [position].
             *
             * Unlike [position], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("position")
            @ExcludeMissing
            fun _position(): JsonField<NodePosition> = position

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
                 * Returns a mutable builder for constructing an instance of [Speak].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .message()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Speak]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var message: JsonField<String>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var position: JsonField<NodePosition> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(speak: Speak) = apply {
                    id = speak.id
                    message = speak.message
                    name = speak.name
                    position = speak.position
                    type = speak.type
                    additionalProperties = speak.additionalProperties.toMutableMap()
                }

                /** Caller-supplied unique identifier for this node within the flow. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Message delivered to the user verbatim when the flow reaches this node. No LLM
                 * turn — the text is spoken/sent exactly as written. `{{variable}}` placeholders
                 * are interpolated from the conversation's dynamic variables; an unresolved
                 * placeholder renders as an empty string. After delivering, the flow routes via the
                 * node's outgoing `llm` / `expression` edges (commonly a single unconditional
                 * edge).
                 */
                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                /** Optional human-readable label, displayed in authoring UIs. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * Optional canvas coordinates used by authoring UIs to lay out the graph. Ignored
                 * by the runtime; round-trips so frontends can persist graph layout across reloads.
                 */
                fun position(position: NodePosition) = position(JsonField.of(position))

                /**
                 * Sets [Builder.position] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.position] with a well-typed [NodePosition] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun position(position: JsonField<NodePosition>) = apply { this.position = position }

                /** Node kind discriminator. Always `speak` for a speak node. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Speak].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .message()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Speak =
                    Speak(
                        checkRequired("id", id),
                        checkRequired("message", message),
                        name,
                        position,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Speak = apply {
                if (validated) {
                    return@apply
                }

                id()
                message()
                name()
                position().ifPresent { it.validate() }
                type().ifPresent { it.validate() }
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
                    (if (message.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (position.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /** Node kind discriminator. Always `speak` for a speak node. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val SPEAK = of("speak")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    SPEAK
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SPEAK,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        SPEAK -> Value.SPEAK
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
                        SPEAK -> Known.SPEAK
                        else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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

                return other is Speak &&
                    id == other.id &&
                    message == other.message &&
                    name == other.name &&
                    position == other.position &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, message, name, position, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Speak{id=$id, message=$message, name=$name, position=$position, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConversationFlowReq &&
            nodes == other.nodes &&
            startNodeId == other.startNodeId &&
            edges == other.edges &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(nodes, startNodeId, edges, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConversationFlowReq{nodes=$nodes, startNodeId=$startNodeId, edges=$edges, additionalProperties=$additionalProperties}"
}
