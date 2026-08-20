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

/** Conversation flow as returned by the API. */
class ConversationFlow
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
     * All nodes in the flow.
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
     * Directed transitions between nodes.
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
         * Returns a mutable builder for constructing an instance of [ConversationFlow].
         *
         * The following fields are required:
         * ```java
         * .nodes()
         * .startNodeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConversationFlow]. */
    class Builder internal constructor() {

        private var nodes: JsonField<MutableList<Node>>? = null
        private var startNodeId: JsonField<String>? = null
        private var edges: JsonField<MutableList<FlowEdge>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(conversationFlow: ConversationFlow) = apply {
            nodes = conversationFlow.nodes.map { it.toMutableList() }
            startNodeId = conversationFlow.startNodeId
            edges = conversationFlow.edges.map { it.toMutableList() }
            additionalProperties = conversationFlow.additionalProperties.toMutableMap()
        }

        /** All nodes in the flow. */
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
        fun addNode(prompt: FlowNode) = addNode(Node.ofPrompt(prompt))

        /** Alias for calling [addNode] with `Node.ofTool(tool)`. */
        fun addNode(tool: ToolNode) = addNode(Node.ofTool(tool))

        /** Alias for calling [addNode] with `Node.ofSpeak(speak)`. */
        fun addNode(speak: SpeakNode) = addNode(Node.ofSpeak(speak))

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

        /** Directed transitions between nodes. */
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
         * Returns an immutable instance of [ConversationFlow].
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
        fun build(): ConversationFlow =
            ConversationFlow(
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
    fun validate(): ConversationFlow = apply {
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

    /** One step in a conversation flow, as returned by the API. */
    @JsonDeserialize(using = Node.Deserializer::class)
    @JsonSerialize(using = Node.Serializer::class)
    class Node
    private constructor(
        private val prompt: FlowNode? = null,
        private val tool: ToolNode? = null,
        private val speak: SpeakNode? = null,
        private val _json: JsonValue? = null,
    ) {

        /** One step in a conversation flow, as returned by the API. */
        fun prompt(): Optional<FlowNode> = Optional.ofNullable(prompt)

        /** A standalone tool step in a conversation flow, as returned by the API. */
        fun tool(): Optional<ToolNode> = Optional.ofNullable(tool)

        /** A standalone scripted-message step in a flow, as returned by the API. */
        fun speak(): Optional<SpeakNode> = Optional.ofNullable(speak)

        fun isPrompt(): Boolean = prompt != null

        fun isTool(): Boolean = tool != null

        fun isSpeak(): Boolean = speak != null

        /** One step in a conversation flow, as returned by the API. */
        fun asPrompt(): FlowNode = prompt.getOrThrow("prompt")

        /** A standalone tool step in a conversation flow, as returned by the API. */
        fun asTool(): ToolNode = tool.getOrThrow("tool")

        /** A standalone scripted-message step in a flow, as returned by the API. */
        fun asSpeak(): SpeakNode = speak.getOrThrow("speak")

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
         *     public Optional<String> visitPrompt(FlowNode prompt) {
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
                    override fun visitPrompt(prompt: FlowNode) {
                        prompt.validate()
                    }

                    override fun visitTool(tool: ToolNode) {
                        tool.validate()
                    }

                    override fun visitSpeak(speak: SpeakNode) {
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
                    override fun visitPrompt(prompt: FlowNode) = prompt.validity()

                    override fun visitTool(tool: ToolNode) = tool.validity()

                    override fun visitSpeak(speak: SpeakNode) = speak.validity()

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

            /** One step in a conversation flow, as returned by the API. */
            @JvmStatic fun ofPrompt(prompt: FlowNode) = Node(prompt = prompt)

            /** A standalone tool step in a conversation flow, as returned by the API. */
            @JvmStatic fun ofTool(tool: ToolNode) = Node(tool = tool)

            /** A standalone scripted-message step in a flow, as returned by the API. */
            @JvmStatic fun ofSpeak(speak: SpeakNode) = Node(speak = speak)
        }

        /** An interface that defines how to map each variant of [Node] to a value of type [T]. */
        interface Visitor<out T> {

            /** One step in a conversation flow, as returned by the API. */
            fun visitPrompt(prompt: FlowNode): T

            /** A standalone tool step in a conversation flow, as returned by the API. */
            fun visitTool(tool: ToolNode): T

            /** A standalone scripted-message step in a flow, as returned by the API. */
            fun visitSpeak(speak: SpeakNode): T

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
                        return tryDeserialize(node, jacksonTypeRef<FlowNode>())?.let {
                            Node(prompt = it, _json = json)
                        } ?: Node(_json = json)
                    }
                    "tool" -> {
                        return tryDeserialize(node, jacksonTypeRef<ToolNode>())?.let {
                            Node(tool = it, _json = json)
                        } ?: Node(_json = json)
                    }
                    "speak" -> {
                        return tryDeserialize(node, jacksonTypeRef<SpeakNode>())?.let {
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

        return other is ConversationFlow &&
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
        "ConversationFlow{nodes=$nodes, startNodeId=$startNodeId, edges=$edges, additionalProperties=$additionalProperties}"
}
