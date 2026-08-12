// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AgentInteraction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val interactionType: JsonField<InteractionType>,
    private val description: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("interaction_type")
        @ExcludeMissing
        interactionType: JsonField<InteractionType> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
    ) : this(interactionType, description, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun interactionType(): InteractionType = interactionType.getRequired("interaction_type")

    /**
     * Required when interaction_type is `OTHER`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Returns the raw JSON value of [interactionType].
     *
     * Unlike [interactionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interaction_type")
    @ExcludeMissing
    fun _interactionType(): JsonField<InteractionType> = interactionType

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
         * Returns a mutable builder for constructing an instance of [AgentInteraction].
         *
         * The following fields are required:
         * ```java
         * .interactionType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentInteraction]. */
    class Builder internal constructor() {

        private var interactionType: JsonField<InteractionType>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentInteraction: AgentInteraction) = apply {
            interactionType = agentInteraction.interactionType
            description = agentInteraction.description
            additionalProperties = agentInteraction.additionalProperties.toMutableMap()
        }

        fun interactionType(interactionType: InteractionType) =
            interactionType(JsonField.of(interactionType))

        /**
         * Sets [Builder.interactionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interactionType] with a well-typed [InteractionType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun interactionType(interactionType: JsonField<InteractionType>) = apply {
            this.interactionType = interactionType
        }

        /** Required when interaction_type is `OTHER`. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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
         * Returns an immutable instance of [AgentInteraction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .interactionType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentInteraction =
            AgentInteraction(
                checkRequired("interactionType", interactionType),
                description,
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
    fun validate(): AgentInteraction = apply {
        if (validated) {
            return@apply
        }

        interactionType().validate()
        description()
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
        (interactionType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0)

    class InteractionType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val TRANSACTIONAL_UPDATES = of("TRANSACTIONAL_UPDATES")

            @JvmField val CUSTOMER_SUPPORT = of("CUSTOMER_SUPPORT")

            @JvmField val LOYALTY_OR_REWARD = of("LOYALTY_OR_REWARD")

            @JvmField val MARKETING_OR_PROMOTIONAL = of("MARKETING_OR_PROMOTIONAL")

            @JvmField val ACCOUNT_ALERTS = of("ACCOUNT_ALERTS")

            @JvmField val TWO_WAY_CONVERSATION = of("TWO_WAY_CONVERSATION")

            @JvmField val OTHER = of("OTHER")

            @JvmStatic fun of(value: String) = InteractionType(JsonField.of(value))
        }

        /** An enum containing [InteractionType]'s known values. */
        enum class Known {
            TRANSACTIONAL_UPDATES,
            CUSTOMER_SUPPORT,
            LOYALTY_OR_REWARD,
            MARKETING_OR_PROMOTIONAL,
            ACCOUNT_ALERTS,
            TWO_WAY_CONVERSATION,
            OTHER,
        }

        /**
         * An enum containing [InteractionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [InteractionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRANSACTIONAL_UPDATES,
            CUSTOMER_SUPPORT,
            LOYALTY_OR_REWARD,
            MARKETING_OR_PROMOTIONAL,
            ACCOUNT_ALERTS,
            TWO_WAY_CONVERSATION,
            OTHER,
            /**
             * An enum member indicating that [InteractionType] was instantiated with an unknown
             * value.
             */
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
                TRANSACTIONAL_UPDATES -> Value.TRANSACTIONAL_UPDATES
                CUSTOMER_SUPPORT -> Value.CUSTOMER_SUPPORT
                LOYALTY_OR_REWARD -> Value.LOYALTY_OR_REWARD
                MARKETING_OR_PROMOTIONAL -> Value.MARKETING_OR_PROMOTIONAL
                ACCOUNT_ALERTS -> Value.ACCOUNT_ALERTS
                TWO_WAY_CONVERSATION -> Value.TWO_WAY_CONVERSATION
                OTHER -> Value.OTHER
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
                TRANSACTIONAL_UPDATES -> Known.TRANSACTIONAL_UPDATES
                CUSTOMER_SUPPORT -> Known.CUSTOMER_SUPPORT
                LOYALTY_OR_REWARD -> Known.LOYALTY_OR_REWARD
                MARKETING_OR_PROMOTIONAL -> Known.MARKETING_OR_PROMOTIONAL
                ACCOUNT_ALERTS -> Known.ACCOUNT_ALERTS
                TWO_WAY_CONVERSATION -> Known.TWO_WAY_CONVERSATION
                OTHER -> Known.OTHER
                else -> throw TelnyxInvalidDataException("Unknown InteractionType: $value")
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
        fun validate(): InteractionType = apply {
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

            return other is InteractionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentInteraction &&
            interactionType == other.interactionType &&
            description == other.description &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(interactionType, description, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentInteraction{interactionType=$interactionType, description=$description, additionalProperties=$additionalProperties}"
}
