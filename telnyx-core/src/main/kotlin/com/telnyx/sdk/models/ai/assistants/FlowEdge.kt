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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Directed transition from one node to a target, gated by a condition.
 *
 * The target is either another node in the same flow (`NodeTarget`) or a different assistant
 * (`AssistantTarget`). Multiple edges may share a `start_node_id`; the runtime evaluates them in
 * the order they're declared and takes the first whose condition is true.
 */
class FlowEdge
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val condition: JsonField<Condition>,
    private val startNodeId: JsonField<String>,
    private val target: JsonField<Target>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("condition")
        @ExcludeMissing
        condition: JsonField<Condition> = JsonMissing.of(),
        @JsonProperty("start_node_id")
        @ExcludeMissing
        startNodeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target") @ExcludeMissing target: JsonField<Target> = JsonMissing.of(),
    ) : this(id, condition, startNodeId, target, mutableMapOf())

    /**
     * Caller-supplied unique identifier for this edge within the flow.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Condition that gates the transition. Discriminated by `type`: `llm`, `expression`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun condition(): Condition = condition.getRequired("condition")

    /**
     * ID of the node this edge transitions away from.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startNodeId(): String = startNodeId.getRequired("start_node_id")

    /**
     * Destination of the transition. Discriminated by `type`: `node` (jump to another node in this
     * flow) or `assistant` (hand off to a different assistant).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun target(): Target = target.getRequired("target")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [condition].
     *
     * Unlike [condition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("condition") @ExcludeMissing fun _condition(): JsonField<Condition> = condition

    /**
     * Returns the raw JSON value of [startNodeId].
     *
     * Unlike [startNodeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_node_id")
    @ExcludeMissing
    fun _startNodeId(): JsonField<String> = startNodeId

    /**
     * Returns the raw JSON value of [target].
     *
     * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

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
         * Returns a mutable builder for constructing an instance of [FlowEdge].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .condition()
         * .startNodeId()
         * .target()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FlowEdge]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var condition: JsonField<Condition>? = null
        private var startNodeId: JsonField<String>? = null
        private var target: JsonField<Target>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(flowEdge: FlowEdge) = apply {
            id = flowEdge.id
            condition = flowEdge.condition
            startNodeId = flowEdge.startNodeId
            target = flowEdge.target
            additionalProperties = flowEdge.additionalProperties.toMutableMap()
        }

        /** Caller-supplied unique identifier for this edge within the flow. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Condition that gates the transition. Discriminated by `type`: `llm`, `expression`. */
        fun condition(condition: Condition) = condition(JsonField.of(condition))

        /**
         * Sets [Builder.condition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.condition] with a well-typed [Condition] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun condition(condition: JsonField<Condition>) = apply { this.condition = condition }

        /** Alias for calling [condition] with `Condition.ofLlm(llm)`. */
        fun condition(llm: Condition.Llm) = condition(Condition.ofLlm(llm))

        /**
         * Alias for calling [condition] with the following:
         * ```java
         * Condition.Llm.builder()
         *     .prompt(prompt)
         *     .build()
         * ```
         */
        fun llmCondition(prompt: String) = condition(Condition.Llm.builder().prompt(prompt).build())

        /** Alias for calling [condition] with `Condition.ofExpression(expression)`. */
        fun condition(expression: Condition.Expression) =
            condition(Condition.ofExpression(expression))

        /**
         * Alias for calling [condition] with the following:
         * ```java
         * Condition.Expression.builder()
         *     .expression(expression)
         *     .build()
         * ```
         */
        fun expressionCondition(expression: JsonValue) =
            condition(Condition.Expression.builder().expression(expression).build())

        /** Alias for calling [condition] with `Condition.ofDefault()`. */
        fun conditionDefault() = condition(Condition.ofDefault())

        /** ID of the node this edge transitions away from. */
        fun startNodeId(startNodeId: String) = startNodeId(JsonField.of(startNodeId))

        /**
         * Sets [Builder.startNodeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startNodeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startNodeId(startNodeId: JsonField<String>) = apply { this.startNodeId = startNodeId }

        /**
         * Destination of the transition. Discriminated by `type`: `node` (jump to another node in
         * this flow) or `assistant` (hand off to a different assistant).
         */
        fun target(target: Target) = target(JsonField.of(target))

        /**
         * Sets [Builder.target] to an arbitrary JSON value.
         *
         * You should usually call [Builder.target] with a well-typed [Target] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun target(target: JsonField<Target>) = apply { this.target = target }

        /** Alias for calling [target] with `Target.ofNode(node)`. */
        fun target(node: Target.Node) = target(Target.ofNode(node))

        /**
         * Alias for calling [target] with the following:
         * ```java
         * Target.Node.builder()
         *     .nodeId(nodeId)
         *     .build()
         * ```
         */
        fun nodeTarget(nodeId: String) = target(Target.Node.builder().nodeId(nodeId).build())

        /** Alias for calling [target] with `Target.ofAssistant(assistant)`. */
        fun target(assistant: Target.Assistant) = target(Target.ofAssistant(assistant))

        /**
         * Alias for calling [target] with the following:
         * ```java
         * Target.Assistant.builder()
         *     .assistantId(assistantId)
         *     .build()
         * ```
         */
        fun assistantTarget(assistantId: String) =
            target(Target.Assistant.builder().assistantId(assistantId).build())

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
         * Returns an immutable instance of [FlowEdge].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .condition()
         * .startNodeId()
         * .target()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FlowEdge =
            FlowEdge(
                checkRequired("id", id),
                checkRequired("condition", condition),
                checkRequired("startNodeId", startNodeId),
                checkRequired("target", target),
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
    fun validate(): FlowEdge = apply {
        if (validated) {
            return@apply
        }

        id()
        condition().validate()
        startNodeId()
        target().validate()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (condition.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startNodeId.asKnown().isPresent) 1 else 0) +
            (target.asKnown().getOrNull()?.validity() ?: 0)

    /** Condition that gates the transition. Discriminated by `type`: `llm`, `expression`. */
    @JsonDeserialize(using = Condition.Deserializer::class)
    @JsonSerialize(using = Condition.Serializer::class)
    class Condition
    private constructor(
        private val llm: Llm? = null,
        private val expression: Expression? = null,
        private val default_: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * Edge condition evaluated by the LLM from a natural-language prompt.
         *
         * The model is asked to judge the prompt against conversation context and returns
         * true/false. Use this for fuzzy intents that aren't expressible as a deterministic
         * expression (e.g. 'user wants to escalate to a human').
         */
        fun llm(): Optional<Llm> = Optional.ofNullable(llm)

        /**
         * Edge condition evaluated as a deterministic expression AST.
         *
         * The expression is computed against runtime dynamic variables and must evaluate to a
         * boolean. Prefer this over `LLMCondition` when the rule is a clean function of known
         * variables — it's cheaper and predictable.
         */
        fun expression(): Optional<Expression> = Optional.ofNullable(expression)

        /**
         * Fallback edge condition: fires only when no other edge's condition is true.
         *
         * Evaluated after every conditioned (`llm` / `expression`) edge regardless of declaration
         * order, so it routes the flow whenever none of the node's other outgoing edges match.
         * Valid **only** on edges leaving a `tool` or `speak` node, where the deterministic step
         * auto-advances and must always have somewhere to go. A tool/speak node with any outgoing
         * edge is required to carry exactly one `default` edge so it never dead-ends; a tool/speak
         * node with no outgoing edges is a valid terminal step. Carries no parameters.
         */
        fun default_(): Optional<JsonValue> = Optional.ofNullable(default_)

        fun isLlm(): Boolean = llm != null

        fun isExpression(): Boolean = expression != null

        fun isDefault(): Boolean = default_ != null

        /**
         * Edge condition evaluated by the LLM from a natural-language prompt.
         *
         * The model is asked to judge the prompt against conversation context and returns
         * true/false. Use this for fuzzy intents that aren't expressible as a deterministic
         * expression (e.g. 'user wants to escalate to a human').
         */
        fun asLlm(): Llm = llm.getOrThrow("llm")

        /**
         * Edge condition evaluated as a deterministic expression AST.
         *
         * The expression is computed against runtime dynamic variables and must evaluate to a
         * boolean. Prefer this over `LLMCondition` when the rule is a clean function of known
         * variables — it's cheaper and predictable.
         */
        fun asExpression(): Expression = expression.getOrThrow("expression")

        /**
         * Fallback edge condition: fires only when no other edge's condition is true.
         *
         * Evaluated after every conditioned (`llm` / `expression`) edge regardless of declaration
         * order, so it routes the flow whenever none of the node's other outgoing edges match.
         * Valid **only** on edges leaving a `tool` or `speak` node, where the deterministic step
         * auto-advances and must always have somewhere to go. A tool/speak node with any outgoing
         * edge is required to carry exactly one `default` edge so it never dead-ends; a tool/speak
         * node with no outgoing edges is a valid terminal step. Carries no parameters.
         */
        fun asDefault(): JsonValue = default_.getOrThrow("default_")

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
         * Optional<String> result = condition.accept(new Condition.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitLlm(Llm llm) {
         *         return Optional.of(llm.toString());
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
                llm != null -> visitor.visitLlm(llm)
                expression != null -> visitor.visitExpression(expression)
                default_ != null -> visitor.visitDefault(default_)
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
        fun validate(): Condition = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitLlm(llm: Llm) {
                        llm.validate()
                    }

                    override fun visitExpression(expression: Expression) {
                        expression.validate()
                    }

                    override fun visitDefault(default_: JsonValue) {
                        default_.let {
                            if (it != JsonValue.from(mapOf("type" to "default"))) {
                                throw TelnyxInvalidDataException(
                                    "'default_' is invalid, received $it"
                                )
                            }
                        }
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
                    override fun visitLlm(llm: Llm) = llm.validity()

                    override fun visitExpression(expression: Expression) = expression.validity()

                    override fun visitDefault(default_: JsonValue) =
                        default_.let {
                            if (it == JsonValue.from(mapOf("type" to "default"))) 1 else 0
                        }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Condition &&
                llm == other.llm &&
                expression == other.expression &&
                default_ == other.default_
        }

        override fun hashCode(): Int = Objects.hash(llm, expression, default_)

        override fun toString(): String =
            when {
                llm != null -> "Condition{llm=$llm}"
                expression != null -> "Condition{expression=$expression}"
                default_ != null -> "Condition{default_=$default_}"
                _json != null -> "Condition{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Condition")
            }

        companion object {

            /**
             * Edge condition evaluated by the LLM from a natural-language prompt.
             *
             * The model is asked to judge the prompt against conversation context and returns
             * true/false. Use this for fuzzy intents that aren't expressible as a deterministic
             * expression (e.g. 'user wants to escalate to a human').
             */
            @JvmStatic fun ofLlm(llm: Llm) = Condition(llm = llm)

            /**
             * Edge condition evaluated as a deterministic expression AST.
             *
             * The expression is computed against runtime dynamic variables and must evaluate to a
             * boolean. Prefer this over `LLMCondition` when the rule is a clean function of known
             * variables — it's cheaper and predictable.
             */
            @JvmStatic fun ofExpression(expression: Expression) = Condition(expression = expression)

            /**
             * Fallback edge condition: fires only when no other edge's condition is true.
             *
             * Evaluated after every conditioned (`llm` / `expression`) edge regardless of
             * declaration order, so it routes the flow whenever none of the node's other outgoing
             * edges match. Valid **only** on edges leaving a `tool` or `speak` node, where the
             * deterministic step auto-advances and must always have somewhere to go. A tool/speak
             * node with any outgoing edge is required to carry exactly one `default` edge so it
             * never dead-ends; a tool/speak node with no outgoing edges is a valid terminal step.
             * Carries no parameters.
             */
            @JvmStatic
            fun ofDefault() = Condition(default_ = JsonValue.from(mapOf("type" to "default")))
        }

        /**
         * An interface that defines how to map each variant of [Condition] to a value of type [T].
         */
        interface Visitor<out T> {

            /**
             * Edge condition evaluated by the LLM from a natural-language prompt.
             *
             * The model is asked to judge the prompt against conversation context and returns
             * true/false. Use this for fuzzy intents that aren't expressible as a deterministic
             * expression (e.g. 'user wants to escalate to a human').
             */
            fun visitLlm(llm: Llm): T

            /**
             * Edge condition evaluated as a deterministic expression AST.
             *
             * The expression is computed against runtime dynamic variables and must evaluate to a
             * boolean. Prefer this over `LLMCondition` when the rule is a clean function of known
             * variables — it's cheaper and predictable.
             */
            fun visitExpression(expression: Expression): T

            /**
             * Fallback edge condition: fires only when no other edge's condition is true.
             *
             * Evaluated after every conditioned (`llm` / `expression`) edge regardless of
             * declaration order, so it routes the flow whenever none of the node's other outgoing
             * edges match. Valid **only** on edges leaving a `tool` or `speak` node, where the
             * deterministic step auto-advances and must always have somewhere to go. A tool/speak
             * node with any outgoing edge is required to carry exactly one `default` edge so it
             * never dead-ends; a tool/speak node with no outgoing edges is a valid terminal step.
             * Carries no parameters.
             */
            fun visitDefault(default_: JsonValue): T

            /**
             * Maps an unknown variant of [Condition] to a value of type [T].
             *
             * An instance of [Condition] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Condition: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Condition>(Condition::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Condition {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "llm" -> {
                        return tryDeserialize(node, jacksonTypeRef<Llm>())?.let {
                            Condition(llm = it, _json = json)
                        } ?: Condition(_json = json)
                    }
                    "expression" -> {
                        return tryDeserialize(node, jacksonTypeRef<Expression>())?.let {
                            Condition(expression = it, _json = json)
                        } ?: Condition(_json = json)
                    }
                    "default" -> {
                        return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                            ?.let { Condition(default_ = it, _json = json) }
                            ?.takeIf { it.isValid() } ?: Condition(_json = json)
                    }
                }

                return Condition(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Condition>(Condition::class) {

            override fun serialize(
                value: Condition,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.llm != null -> generator.writeObject(value.llm)
                    value.expression != null -> generator.writeObject(value.expression)
                    value.default_ != null -> generator.writeObject(value.default_)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Condition")
                }
            }
        }

        /**
         * Edge condition evaluated by the LLM from a natural-language prompt.
         *
         * The model is asked to judge the prompt against conversation context and returns
         * true/false. Use this for fuzzy intents that aren't expressible as a deterministic
         * expression (e.g. 'user wants to escalate to a human').
         */
        class Llm
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val prompt: JsonField<String>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("prompt")
                @ExcludeMissing
                prompt: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(prompt, type, mutableMapOf())

            /**
             * Natural-language criterion the LLM judges as true/false.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun prompt(): String = prompt.getRequired("prompt")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("llm")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [prompt].
             *
             * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

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
                 * Returns a mutable builder for constructing an instance of [Llm].
                 *
                 * The following fields are required:
                 * ```java
                 * .prompt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Llm]. */
            class Builder internal constructor() {

                private var prompt: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("llm")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(llm: Llm) = apply {
                    prompt = llm.prompt
                    type = llm.type
                    additionalProperties = llm.additionalProperties.toMutableMap()
                }

                /** Natural-language criterion the LLM judges as true/false. */
                fun prompt(prompt: String) = prompt(JsonField.of(prompt))

                /**
                 * Sets [Builder.prompt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prompt] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("llm")
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
                 * Returns an immutable instance of [Llm].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .prompt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Llm =
                    Llm(checkRequired("prompt", prompt), type, additionalProperties.toMutableMap())
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
            fun validate(): Llm = apply {
                if (validated) {
                    return@apply
                }

                prompt()
                _type().let {
                    if (it != JsonValue.from("llm")) {
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
                (if (prompt.asKnown().isPresent) 1 else 0) +
                    type.let { if (it == JsonValue.from("llm")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Llm &&
                    prompt == other.prompt &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(prompt, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Llm{prompt=$prompt, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * Edge condition evaluated as a deterministic expression AST.
         *
         * The expression is computed against runtime dynamic variables and must evaluate to a
         * boolean. Prefer this over `LLMCondition` when the rule is a clean function of known
         * variables — it's cheaper and predictable.
         */
        class Expression
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val expression: JsonValue,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("expression")
                @ExcludeMissing
                expression: JsonValue = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(expression, type, mutableMapOf())

            /**
             * Root of the expression AST; evaluates to a boolean. Typed as free-form JSON to avoid
             * an uncompilable by-value self-reference; see the Expression schema for the variant
             * structure.
             *
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```java
             * MyClass myObject = expression.expression().convert(MyClass.class);
             * ```
             */
            @JsonProperty("expression") @ExcludeMissing fun _expression(): JsonValue = expression

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("expression")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

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
                 * Returns a mutable builder for constructing an instance of [Expression].
                 *
                 * The following fields are required:
                 * ```java
                 * .expression()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Expression]. */
            class Builder internal constructor() {

                private var expression: JsonValue? = null
                private var type: JsonValue = JsonValue.from("expression")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(expression: Expression) = apply {
                    this.expression = expression.expression
                    type = expression.type
                    additionalProperties = expression.additionalProperties.toMutableMap()
                }

                /**
                 * Root of the expression AST; evaluates to a boolean. Typed as free-form JSON to
                 * avoid an uncompilable by-value self-reference; see the Expression schema for the
                 * variant structure.
                 */
                fun expression(expression: JsonValue) = apply { this.expression = expression }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("expression")
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
                 * Returns an immutable instance of [Expression].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .expression()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Expression =
                    Expression(
                        checkRequired("expression", expression),
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
            fun validate(): Expression = apply {
                if (validated) {
                    return@apply
                }

                _type().let {
                    if (it != JsonValue.from("expression")) {
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
                type.let { if (it == JsonValue.from("expression")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Expression &&
                    expression == other.expression &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(expression, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Expression{expression=$expression, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    /**
     * Destination of the transition. Discriminated by `type`: `node` (jump to another node in this
     * flow) or `assistant` (hand off to a different assistant).
     */
    @JsonDeserialize(using = Target.Deserializer::class)
    @JsonSerialize(using = Target.Serializer::class)
    class Target
    private constructor(
        private val node: Node? = null,
        private val assistant: Assistant? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * Edge target referencing another node within the same flow.
         *
         * The runtime transitions the active node to `node_id` and continues processing within the
         * current assistant's flow.
         */
        fun node(): Optional<Node> = Optional.ofNullable(node)

        /**
         * Edge target referencing a different assistant.
         *
         * When the edge fires, the conversation hands off to `assistant_id`: the active assistant
         * on the conversation row is rewritten and the new assistant's flow starts at its own
         * `start_node_id`. The current turn's LLM response is delivered to the user as-is;
         * subsequent turns route to the new assistant.
         */
        fun assistant(): Optional<Assistant> = Optional.ofNullable(assistant)

        fun isNode(): Boolean = node != null

        fun isAssistant(): Boolean = assistant != null

        /**
         * Edge target referencing another node within the same flow.
         *
         * The runtime transitions the active node to `node_id` and continues processing within the
         * current assistant's flow.
         */
        fun asNode(): Node = node.getOrThrow("node")

        /**
         * Edge target referencing a different assistant.
         *
         * When the edge fires, the conversation hands off to `assistant_id`: the active assistant
         * on the conversation row is rewritten and the new assistant's flow starts at its own
         * `start_node_id`. The current turn's LLM response is delivered to the user as-is;
         * subsequent turns route to the new assistant.
         */
        fun asAssistant(): Assistant = assistant.getOrThrow("assistant")

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
         * Optional<String> result = target.accept(new Target.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitNode(Node node) {
         *         return Optional.of(node.toString());
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
                node != null -> visitor.visitNode(node)
                assistant != null -> visitor.visitAssistant(assistant)
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
        fun validate(): Target = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNode(node: Node) {
                        node.validate()
                    }

                    override fun visitAssistant(assistant: Assistant) {
                        assistant.validate()
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
                    override fun visitNode(node: Node) = node.validity()

                    override fun visitAssistant(assistant: Assistant) = assistant.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Target && node == other.node && assistant == other.assistant
        }

        override fun hashCode(): Int = Objects.hash(node, assistant)

        override fun toString(): String =
            when {
                node != null -> "Target{node=$node}"
                assistant != null -> "Target{assistant=$assistant}"
                _json != null -> "Target{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Target")
            }

        companion object {

            /**
             * Edge target referencing another node within the same flow.
             *
             * The runtime transitions the active node to `node_id` and continues processing within
             * the current assistant's flow.
             */
            @JvmStatic fun ofNode(node: Node) = Target(node = node)

            /**
             * Edge target referencing a different assistant.
             *
             * When the edge fires, the conversation hands off to `assistant_id`: the active
             * assistant on the conversation row is rewritten and the new assistant's flow starts at
             * its own `start_node_id`. The current turn's LLM response is delivered to the user
             * as-is; subsequent turns route to the new assistant.
             */
            @JvmStatic fun ofAssistant(assistant: Assistant) = Target(assistant = assistant)
        }

        /** An interface that defines how to map each variant of [Target] to a value of type [T]. */
        interface Visitor<out T> {

            /**
             * Edge target referencing another node within the same flow.
             *
             * The runtime transitions the active node to `node_id` and continues processing within
             * the current assistant's flow.
             */
            fun visitNode(node: Node): T

            /**
             * Edge target referencing a different assistant.
             *
             * When the edge fires, the conversation hands off to `assistant_id`: the active
             * assistant on the conversation row is rewritten and the new assistant's flow starts at
             * its own `start_node_id`. The current turn's LLM response is delivered to the user
             * as-is; subsequent turns route to the new assistant.
             */
            fun visitAssistant(assistant: Assistant): T

            /**
             * Maps an unknown variant of [Target] to a value of type [T].
             *
             * An instance of [Target] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Target: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Target>(Target::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Target {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "node" -> {
                        return tryDeserialize(node, jacksonTypeRef<Node>())?.let {
                            Target(node = it, _json = json)
                        } ?: Target(_json = json)
                    }
                    "assistant" -> {
                        return tryDeserialize(node, jacksonTypeRef<Assistant>())?.let {
                            Target(assistant = it, _json = json)
                        } ?: Target(_json = json)
                    }
                }

                return Target(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Target>(Target::class) {

            override fun serialize(
                value: Target,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.node != null -> generator.writeObject(value.node)
                    value.assistant != null -> generator.writeObject(value.assistant)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Target")
                }
            }
        }

        /**
         * Edge target referencing another node within the same flow.
         *
         * The runtime transitions the active node to `node_id` and continues processing within the
         * current assistant's flow.
         */
        class Node
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val nodeId: JsonField<String>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("node_id")
                @ExcludeMissing
                nodeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(nodeId, type, mutableMapOf())

            /**
             * ID of the node this edge transitions into.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun nodeId(): String = nodeId.getRequired("node_id")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("node")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [nodeId].
             *
             * Unlike [nodeId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("node_id") @ExcludeMissing fun _nodeId(): JsonField<String> = nodeId

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
                 * Returns a mutable builder for constructing an instance of [Node].
                 *
                 * The following fields are required:
                 * ```java
                 * .nodeId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Node]. */
            class Builder internal constructor() {

                private var nodeId: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("node")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(node: Node) = apply {
                    nodeId = node.nodeId
                    type = node.type
                    additionalProperties = node.additionalProperties.toMutableMap()
                }

                /** ID of the node this edge transitions into. */
                fun nodeId(nodeId: String) = nodeId(JsonField.of(nodeId))

                /**
                 * Sets [Builder.nodeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nodeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun nodeId(nodeId: JsonField<String>) = apply { this.nodeId = nodeId }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("node")
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
                 * Returns an immutable instance of [Node].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .nodeId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Node =
                    Node(checkRequired("nodeId", nodeId), type, additionalProperties.toMutableMap())
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
            fun validate(): Node = apply {
                if (validated) {
                    return@apply
                }

                nodeId()
                _type().let {
                    if (it != JsonValue.from("node")) {
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
                (if (nodeId.asKnown().isPresent) 1 else 0) +
                    type.let { if (it == JsonValue.from("node")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Node &&
                    nodeId == other.nodeId &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(nodeId, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Node{nodeId=$nodeId, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * Edge target referencing a different assistant.
         *
         * When the edge fires, the conversation hands off to `assistant_id`: the active assistant
         * on the conversation row is rewritten and the new assistant's flow starts at its own
         * `start_node_id`. The current turn's LLM response is delivered to the user as-is;
         * subsequent turns route to the new assistant.
         */
        class Assistant
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val assistantId: JsonField<String>,
            private val type: JsonValue,
            private val position: JsonField<NodePosition>,
            private val voiceMode: JsonField<VoiceMode>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("assistant_id")
                @ExcludeMissing
                assistantId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("position")
                @ExcludeMissing
                position: JsonField<NodePosition> = JsonMissing.of(),
                @JsonProperty("voice_mode")
                @ExcludeMissing
                voiceMode: JsonField<VoiceMode> = JsonMissing.of(),
            ) : this(assistantId, type, position, voiceMode, mutableMapOf())

            /**
             * ID of the assistant the conversation transitions to.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun assistantId(): String = assistantId.getRequired("assistant_id")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("assistant")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Optional canvas coordinates for rendering the target assistant as a node in authoring
             * UIs. Pure presentation — the runtime ignores it; round-trips so frontends can persist
             * graph layout across reloads. When multiple edges target the same assistant, each
             * edge's `position` is independent (frontends typically use the first non-null one).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun position(): Optional<NodePosition> = position.getOptional("position")

            /**
             * Voice behavior when handing off to the target assistant, mirroring the handoff tool's
             * `voice_mode`. `unified` (default) keeps the current voice across the handoff;
             * `distinct` lets the target assistant speak with its own configured voice. Only
             * applies to assistant targets — node targets override voice via the node's own
             * `voice_settings`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun voiceMode(): Optional<VoiceMode> = voiceMode.getOptional("voice_mode")

            /**
             * Returns the raw JSON value of [assistantId].
             *
             * Unlike [assistantId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("assistant_id")
            @ExcludeMissing
            fun _assistantId(): JsonField<String> = assistantId

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
                 * Returns a mutable builder for constructing an instance of [Assistant].
                 *
                 * The following fields are required:
                 * ```java
                 * .assistantId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Assistant]. */
            class Builder internal constructor() {

                private var assistantId: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("assistant")
                private var position: JsonField<NodePosition> = JsonMissing.of()
                private var voiceMode: JsonField<VoiceMode> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(assistant: Assistant) = apply {
                    assistantId = assistant.assistantId
                    type = assistant.type
                    position = assistant.position
                    voiceMode = assistant.voiceMode
                    additionalProperties = assistant.additionalProperties.toMutableMap()
                }

                /** ID of the assistant the conversation transitions to. */
                fun assistantId(assistantId: String) = assistantId(JsonField.of(assistantId))

                /**
                 * Sets [Builder.assistantId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assistantId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assistantId(assistantId: JsonField<String>) = apply {
                    this.assistantId = assistantId
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("assistant")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /**
                 * Optional canvas coordinates for rendering the target assistant as a node in
                 * authoring UIs. Pure presentation — the runtime ignores it; round-trips so
                 * frontends can persist graph layout across reloads. When multiple edges target the
                 * same assistant, each edge's `position` is independent (frontends typically use
                 * the first non-null one).
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
                 * Voice behavior when handing off to the target assistant, mirroring the handoff
                 * tool's `voice_mode`. `unified` (default) keeps the current voice across the
                 * handoff; `distinct` lets the target assistant speak with its own configured
                 * voice. Only applies to assistant targets — node targets override voice via the
                 * node's own `voice_settings`.
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
                 * Returns an immutable instance of [Assistant].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .assistantId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Assistant =
                    Assistant(
                        checkRequired("assistantId", assistantId),
                        type,
                        position,
                        voiceMode,
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
            fun validate(): Assistant = apply {
                if (validated) {
                    return@apply
                }

                assistantId()
                _type().let {
                    if (it != JsonValue.from("assistant")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
                position().ifPresent { it.validate() }
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
                (if (assistantId.asKnown().isPresent) 1 else 0) +
                    type.let { if (it == JsonValue.from("assistant")) 1 else 0 } +
                    (position.asKnown().getOrNull()?.validity() ?: 0) +
                    (voiceMode.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Voice behavior when handing off to the target assistant, mirroring the handoff tool's
             * `voice_mode`. `unified` (default) keeps the current voice across the handoff;
             * `distinct` lets the target assistant speak with its own configured voice. Only
             * applies to assistant targets — node targets override voice via the node's own
             * `voice_settings`.
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

                return other is Assistant &&
                    assistantId == other.assistantId &&
                    type == other.type &&
                    position == other.position &&
                    voiceMode == other.voiceMode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(assistantId, type, position, voiceMode, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Assistant{assistantId=$assistantId, type=$type, position=$position, voiceMode=$voiceMode, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FlowEdge &&
            id == other.id &&
            condition == other.condition &&
            startNodeId == other.startNodeId &&
            target == other.target &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, condition, startNodeId, target, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FlowEdge{id=$id, condition=$condition, startNodeId=$startNodeId, target=$target, additionalProperties=$additionalProperties}"
}
