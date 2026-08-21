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
        fun addNode(prompt: FlowNodeReq) = addNode(Node.ofPrompt(prompt))

        /** Alias for calling [addNode] with `Node.ofTool(tool)`. */
        fun addNode(tool: ToolNodeReq) = addNode(Node.ofTool(tool))

        /** Alias for calling [addNode] with `Node.ofSpeak(speak)`. */
        fun addNode(speak: SpeakNodeReq) = addNode(Node.ofSpeak(speak))

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
        private val prompt: FlowNodeReq? = null,
        private val tool: ToolNodeReq? = null,
        private val speak: SpeakNodeReq? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * One step in a conversation flow, as supplied by API clients.
         *
         * Each node carries the prompt, tool scope, and optional overrides for
         * model/voice/transcription. Unset overrides cascade from the assistant.
         */
        fun prompt(): Optional<FlowNodeReq> = Optional.ofNullable(prompt)

        /**
         * A standalone tool step in a conversation flow, as supplied by clients.
         *
         * Unlike a prompt node, a tool node has no instructions or model — it isn't an LLM turn.
         * Reaching it deterministically runs one shared tool (arguments filled from matching
         * dynamic variables by name), then routes on the result via outgoing `tool_result` edges.
         */
        fun tool(): Optional<ToolNodeReq> = Optional.ofNullable(tool)

        /**
         * A standalone scripted-message step in a flow, as supplied by clients.
         *
         * Unlike a prompt node, a speak node has no instructions or model — it isn't an LLM turn.
         * Reaching it delivers `message` to the user verbatim (with `{{variable}}` interpolation),
         * then routes via outgoing `llm` / `expression` edges.
         */
        fun speak(): Optional<SpeakNodeReq> = Optional.ofNullable(speak)

        fun isPrompt(): Boolean = prompt != null

        fun isTool(): Boolean = tool != null

        fun isSpeak(): Boolean = speak != null

        /**
         * One step in a conversation flow, as supplied by API clients.
         *
         * Each node carries the prompt, tool scope, and optional overrides for
         * model/voice/transcription. Unset overrides cascade from the assistant.
         */
        fun asPrompt(): FlowNodeReq = prompt.getOrThrow("prompt")

        /**
         * A standalone tool step in a conversation flow, as supplied by clients.
         *
         * Unlike a prompt node, a tool node has no instructions or model — it isn't an LLM turn.
         * Reaching it deterministically runs one shared tool (arguments filled from matching
         * dynamic variables by name), then routes on the result via outgoing `tool_result` edges.
         */
        fun asTool(): ToolNodeReq = tool.getOrThrow("tool")

        /**
         * A standalone scripted-message step in a flow, as supplied by clients.
         *
         * Unlike a prompt node, a speak node has no instructions or model — it isn't an LLM turn.
         * Reaching it delivers `message` to the user verbatim (with `{{variable}}` interpolation),
         * then routes via outgoing `llm` / `expression` edges.
         */
        fun asSpeak(): SpeakNodeReq = speak.getOrThrow("speak")

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
         *     public Optional<String> visitPrompt(FlowNodeReq prompt) {
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
                    override fun visitPrompt(prompt: FlowNodeReq) {
                        prompt.validate()
                    }

                    override fun visitTool(tool: ToolNodeReq) {
                        tool.validate()
                    }

                    override fun visitSpeak(speak: SpeakNodeReq) {
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
                    override fun visitPrompt(prompt: FlowNodeReq) = prompt.validity()

                    override fun visitTool(tool: ToolNodeReq) = tool.validity()

                    override fun visitSpeak(speak: SpeakNodeReq) = speak.validity()

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
            @JvmStatic fun ofPrompt(prompt: FlowNodeReq) = Node(prompt = prompt)

            /**
             * A standalone tool step in a conversation flow, as supplied by clients.
             *
             * Unlike a prompt node, a tool node has no instructions or model — it isn't an LLM
             * turn. Reaching it deterministically runs one shared tool (arguments filled from
             * matching dynamic variables by name), then routes on the result via outgoing
             * `tool_result` edges.
             */
            @JvmStatic fun ofTool(tool: ToolNodeReq) = Node(tool = tool)

            /**
             * A standalone scripted-message step in a flow, as supplied by clients.
             *
             * Unlike a prompt node, a speak node has no instructions or model — it isn't an LLM
             * turn. Reaching it delivers `message` to the user verbatim (with `{{variable}}`
             * interpolation), then routes via outgoing `llm` / `expression` edges.
             */
            @JvmStatic fun ofSpeak(speak: SpeakNodeReq) = Node(speak = speak)
        }

        /** An interface that defines how to map each variant of [Node] to a value of type [T]. */
        interface Visitor<out T> {

            /**
             * One step in a conversation flow, as supplied by API clients.
             *
             * Each node carries the prompt, tool scope, and optional overrides for
             * model/voice/transcription. Unset overrides cascade from the assistant.
             */
            fun visitPrompt(prompt: FlowNodeReq): T

            /**
             * A standalone tool step in a conversation flow, as supplied by clients.
             *
             * Unlike a prompt node, a tool node has no instructions or model — it isn't an LLM
             * turn. Reaching it deterministically runs one shared tool (arguments filled from
             * matching dynamic variables by name), then routes on the result via outgoing
             * `tool_result` edges.
             */
            fun visitTool(tool: ToolNodeReq): T

            /**
             * A standalone scripted-message step in a flow, as supplied by clients.
             *
             * Unlike a prompt node, a speak node has no instructions or model — it isn't an LLM
             * turn. Reaching it delivers `message` to the user verbatim (with `{{variable}}`
             * interpolation), then routes via outgoing `llm` / `expression` edges.
             */
            fun visitSpeak(speak: SpeakNodeReq): T

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
                        return tryDeserialize(node, jacksonTypeRef<FlowNodeReq>())?.let {
                            Node(prompt = it, _json = json)
                        } ?: Node(_json = json)
                    }
                    "tool" -> {
                        return tryDeserialize(node, jacksonTypeRef<ToolNodeReq>())?.let {
                            Node(tool = it, _json = json)
                        } ?: Node(_json = json)
                    }
                    "speak" -> {
                        return tryDeserialize(node, jacksonTypeRef<SpeakNodeReq>())?.let {
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
