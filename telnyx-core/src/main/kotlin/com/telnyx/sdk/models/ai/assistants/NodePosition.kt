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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * 2D coordinates for a node, used by authoring UIs to lay out the graph.
 *
 * Purely a presentation aid. The runtime ignores `position`; it round-trips through the API so
 * frontends can persist the graph layout customers arrange in the editor.
 */
class NodePosition
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val x: JsonField<Double>,
    private val y: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("x") @ExcludeMissing x: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("y") @ExcludeMissing y: JsonField<Double> = JsonMissing.of(),
    ) : this(x, y, mutableMapOf())

    /**
     * Horizontal coordinate in the authoring canvas.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun x(): Double = x.getRequired("x")

    /**
     * Vertical coordinate in the authoring canvas.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun y(): Double = y.getRequired("y")

    /**
     * Returns the raw JSON value of [x].
     *
     * Unlike [x], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("x") @ExcludeMissing fun _x(): JsonField<Double> = x

    /**
     * Returns the raw JSON value of [y].
     *
     * Unlike [y], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("y") @ExcludeMissing fun _y(): JsonField<Double> = y

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
         * Returns a mutable builder for constructing an instance of [NodePosition].
         *
         * The following fields are required:
         * ```java
         * .x()
         * .y()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NodePosition]. */
    class Builder internal constructor() {

        private var x: JsonField<Double>? = null
        private var y: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(nodePosition: NodePosition) = apply {
            x = nodePosition.x
            y = nodePosition.y
            additionalProperties = nodePosition.additionalProperties.toMutableMap()
        }

        /** Horizontal coordinate in the authoring canvas. */
        fun x(x: Double) = x(JsonField.of(x))

        /**
         * Sets [Builder.x] to an arbitrary JSON value.
         *
         * You should usually call [Builder.x] with a well-typed [Double] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun x(x: JsonField<Double>) = apply { this.x = x }

        /** Vertical coordinate in the authoring canvas. */
        fun y(y: Double) = y(JsonField.of(y))

        /**
         * Sets [Builder.y] to an arbitrary JSON value.
         *
         * You should usually call [Builder.y] with a well-typed [Double] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun y(y: JsonField<Double>) = apply { this.y = y }

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
         * Returns an immutable instance of [NodePosition].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .x()
         * .y()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NodePosition =
            NodePosition(
                checkRequired("x", x),
                checkRequired("y", y),
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
    fun validate(): NodePosition = apply {
        if (validated) {
            return@apply
        }

        x()
        y()
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
        (if (x.asKnown().isPresent) 1 else 0) + (if (y.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NodePosition &&
            x == other.x &&
            y == other.y &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(x, y, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "NodePosition{x=$x, y=$y, additionalProperties=$additionalProperties}"
}
