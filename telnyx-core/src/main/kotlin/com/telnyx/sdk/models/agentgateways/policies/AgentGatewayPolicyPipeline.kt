// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policies

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Ordered steps that run in place of the policy's guardrails running independently. */
class AgentGatewayPolicyPipeline
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val hook: JsonField<Hook>,
    private val steps: JsonField<List<AgentGatewayPolicyStep>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("hook") @ExcludeMissing hook: JsonField<Hook> = JsonMissing.of(),
        @JsonProperty("steps")
        @ExcludeMissing
        steps: JsonField<List<AgentGatewayPolicyStep>> = JsonMissing.of(),
    ) : this(hook, steps, mutableMapOf())

    /**
     * `before_request` runs the steps on the request, and `after_request` on the model's response.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hook(): Hook = hook.getRequired("hook")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun steps(): List<AgentGatewayPolicyStep> = steps.getRequired("steps")

    /**
     * Returns the raw JSON value of [hook].
     *
     * Unlike [hook], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hook") @ExcludeMissing fun _hook(): JsonField<Hook> = hook

    /**
     * Returns the raw JSON value of [steps].
     *
     * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("steps")
    @ExcludeMissing
    fun _steps(): JsonField<List<AgentGatewayPolicyStep>> = steps

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
         * Returns a mutable builder for constructing an instance of [AgentGatewayPolicyPipeline].
         *
         * The following fields are required:
         * ```java
         * .hook()
         * .steps()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentGatewayPolicyPipeline]. */
    class Builder internal constructor() {

        private var hook: JsonField<Hook>? = null
        private var steps: JsonField<MutableList<AgentGatewayPolicyStep>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentGatewayPolicyPipeline: AgentGatewayPolicyPipeline) = apply {
            hook = agentGatewayPolicyPipeline.hook
            steps = agentGatewayPolicyPipeline.steps.map { it.toMutableList() }
            additionalProperties = agentGatewayPolicyPipeline.additionalProperties.toMutableMap()
        }

        /**
         * `before_request` runs the steps on the request, and `after_request` on the model's
         * response.
         */
        fun hook(hook: Hook) = hook(JsonField.of(hook))

        /**
         * Sets [Builder.hook] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hook] with a well-typed [Hook] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hook(hook: JsonField<Hook>) = apply { this.hook = hook }

        fun steps(steps: List<AgentGatewayPolicyStep>) = steps(JsonField.of(steps))

        /**
         * Sets [Builder.steps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.steps] with a well-typed `List<AgentGatewayPolicyStep>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun steps(steps: JsonField<List<AgentGatewayPolicyStep>>) = apply {
            this.steps = steps.map { it.toMutableList() }
        }

        /**
         * Adds a single [AgentGatewayPolicyStep] to [steps].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStep(step: AgentGatewayPolicyStep) = apply {
            steps =
                (steps ?: JsonField.of(mutableListOf())).also { checkKnown("steps", it).add(step) }
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
         * Returns an immutable instance of [AgentGatewayPolicyPipeline].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .hook()
         * .steps()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentGatewayPolicyPipeline =
            AgentGatewayPolicyPipeline(
                checkRequired("hook", hook),
                checkRequired("steps", steps).map { it.toImmutable() },
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
    fun validate(): AgentGatewayPolicyPipeline = apply {
        if (validated) {
            return@apply
        }

        hook().validate()
        steps().forEach { it.validate() }
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
        (hook.asKnown().getOrNull()?.validity() ?: 0) +
            (steps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * `before_request` runs the steps on the request, and `after_request` on the model's response.
     */
    class Hook @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BEFORE_REQUEST = of("before_request")

            @JvmField val AFTER_REQUEST = of("after_request")

            @JvmStatic fun of(value: String) = Hook(JsonField.of(value))
        }

        /** An enum containing [Hook]'s known values. */
        enum class Known {
            BEFORE_REQUEST,
            AFTER_REQUEST,
        }

        /**
         * An enum containing [Hook]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Hook] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BEFORE_REQUEST,
            AFTER_REQUEST,
            /** An enum member indicating that [Hook] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BEFORE_REQUEST -> Value.BEFORE_REQUEST
                AFTER_REQUEST -> Value.AFTER_REQUEST
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BEFORE_REQUEST -> Known.BEFORE_REQUEST
                AFTER_REQUEST -> Known.AFTER_REQUEST
                else -> throw TelnyxInvalidDataException("Unknown Hook: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

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
        fun validate(): Hook = apply {
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

            return other is Hook && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentGatewayPolicyPipeline &&
            hook == other.hook &&
            steps == other.steps &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(hook, steps, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentGatewayPolicyPipeline{hook=$hook, steps=$steps, additionalProperties=$additionalProperties}"
}
