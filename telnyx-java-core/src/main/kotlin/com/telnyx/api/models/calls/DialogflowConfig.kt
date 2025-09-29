// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class DialogflowConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val analyzeSentiment: JsonField<Boolean>,
    private val partialAutomatedAgentReply: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("analyze_sentiment")
        @ExcludeMissing
        analyzeSentiment: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("partial_automated_agent_reply")
        @ExcludeMissing
        partialAutomatedAgentReply: JsonField<Boolean> = JsonMissing.of(),
    ) : this(analyzeSentiment, partialAutomatedAgentReply, mutableMapOf())

    /**
     * Enable sentiment analysis from Dialogflow.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun analyzeSentiment(): Optional<Boolean> = analyzeSentiment.getOptional("analyze_sentiment")

    /**
     * Enable partial automated agent reply from Dialogflow.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun partialAutomatedAgentReply(): Optional<Boolean> =
        partialAutomatedAgentReply.getOptional("partial_automated_agent_reply")

    /**
     * Returns the raw JSON value of [analyzeSentiment].
     *
     * Unlike [analyzeSentiment], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("analyze_sentiment")
    @ExcludeMissing
    fun _analyzeSentiment(): JsonField<Boolean> = analyzeSentiment

    /**
     * Returns the raw JSON value of [partialAutomatedAgentReply].
     *
     * Unlike [partialAutomatedAgentReply], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("partial_automated_agent_reply")
    @ExcludeMissing
    fun _partialAutomatedAgentReply(): JsonField<Boolean> = partialAutomatedAgentReply

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

        /** Returns a mutable builder for constructing an instance of [DialogflowConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DialogflowConfig]. */
    class Builder internal constructor() {

        private var analyzeSentiment: JsonField<Boolean> = JsonMissing.of()
        private var partialAutomatedAgentReply: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dialogflowConfig: DialogflowConfig) = apply {
            analyzeSentiment = dialogflowConfig.analyzeSentiment
            partialAutomatedAgentReply = dialogflowConfig.partialAutomatedAgentReply
            additionalProperties = dialogflowConfig.additionalProperties.toMutableMap()
        }

        /** Enable sentiment analysis from Dialogflow. */
        fun analyzeSentiment(analyzeSentiment: Boolean) =
            analyzeSentiment(JsonField.of(analyzeSentiment))

        /**
         * Sets [Builder.analyzeSentiment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.analyzeSentiment] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun analyzeSentiment(analyzeSentiment: JsonField<Boolean>) = apply {
            this.analyzeSentiment = analyzeSentiment
        }

        /** Enable partial automated agent reply from Dialogflow. */
        fun partialAutomatedAgentReply(partialAutomatedAgentReply: Boolean) =
            partialAutomatedAgentReply(JsonField.of(partialAutomatedAgentReply))

        /**
         * Sets [Builder.partialAutomatedAgentReply] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partialAutomatedAgentReply] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun partialAutomatedAgentReply(partialAutomatedAgentReply: JsonField<Boolean>) = apply {
            this.partialAutomatedAgentReply = partialAutomatedAgentReply
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
         * Returns an immutable instance of [DialogflowConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DialogflowConfig =
            DialogflowConfig(
                analyzeSentiment,
                partialAutomatedAgentReply,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DialogflowConfig = apply {
        if (validated) {
            return@apply
        }

        analyzeSentiment()
        partialAutomatedAgentReply()
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
        (if (analyzeSentiment.asKnown().isPresent) 1 else 0) +
            (if (partialAutomatedAgentReply.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DialogflowConfig &&
            analyzeSentiment == other.analyzeSentiment &&
            partialAutomatedAgentReply == other.partialAutomatedAgentReply &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(analyzeSentiment, partialAutomatedAgentReply, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DialogflowConfig{analyzeSentiment=$analyzeSentiment, partialAutomatedAgentReply=$partialAutomatedAgentReply, additionalProperties=$additionalProperties}"
}
