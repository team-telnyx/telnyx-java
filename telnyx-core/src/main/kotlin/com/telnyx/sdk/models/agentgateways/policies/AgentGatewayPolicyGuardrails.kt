// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policies

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The guardrails a policy adds to its base's, and the ones it removes from them, by name. */
class AgentGatewayPolicyGuardrails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val add: JsonField<List<String>>,
    private val remove: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("add") @ExcludeMissing add: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("remove") @ExcludeMissing remove: JsonField<List<String>> = JsonMissing.of(),
    ) : this(add, remove, mutableMapOf())

    /**
     * Guardrails the policy runs in addition to its base's.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun add(): Optional<List<String>> = add.getOptional("add")

    /**
     * Guardrails from its base that the policy does not run.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun remove(): Optional<List<String>> = remove.getOptional("remove")

    /**
     * Returns the raw JSON value of [add].
     *
     * Unlike [add], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("add") @ExcludeMissing fun _add(): JsonField<List<String>> = add

    /**
     * Returns the raw JSON value of [remove].
     *
     * Unlike [remove], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remove") @ExcludeMissing fun _remove(): JsonField<List<String>> = remove

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
         * Returns a mutable builder for constructing an instance of [AgentGatewayPolicyGuardrails].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentGatewayPolicyGuardrails]. */
    class Builder internal constructor() {

        private var add: JsonField<MutableList<String>>? = null
        private var remove: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentGatewayPolicyGuardrails: AgentGatewayPolicyGuardrails) = apply {
            add = agentGatewayPolicyGuardrails.add.map { it.toMutableList() }
            remove = agentGatewayPolicyGuardrails.remove.map { it.toMutableList() }
            additionalProperties = agentGatewayPolicyGuardrails.additionalProperties.toMutableMap()
        }

        /** Guardrails the policy runs in addition to its base's. */
        fun add(add: List<String>) = add(JsonField.of(add))

        /**
         * Sets [Builder.add] to an arbitrary JSON value.
         *
         * You should usually call [Builder.add] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun add(add: JsonField<List<String>>) = apply { this.add = add.map { it.toMutableList() } }

        /**
         * Adds a single [String] to [Builder.add].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdd(add: String) = apply {
            this.add =
                (this.add ?: JsonField.of(mutableListOf())).also { checkKnown("add", it).add(add) }
        }

        /** Guardrails from its base that the policy does not run. */
        fun remove(remove: List<String>) = remove(JsonField.of(remove))

        /**
         * Sets [Builder.remove] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remove] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun remove(remove: JsonField<List<String>>) = apply {
            this.remove = remove.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.remove].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemove(remove: String) = apply {
            this.remove =
                (this.remove ?: JsonField.of(mutableListOf())).also {
                    checkKnown("remove", it).add(remove)
                }
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
         * Returns an immutable instance of [AgentGatewayPolicyGuardrails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AgentGatewayPolicyGuardrails =
            AgentGatewayPolicyGuardrails(
                (add ?: JsonMissing.of()).map { it.toImmutable() },
                (remove ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): AgentGatewayPolicyGuardrails = apply {
        if (validated) {
            return@apply
        }

        add()
        remove()
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
        (add.asKnown().getOrNull()?.size ?: 0) + (remove.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentGatewayPolicyGuardrails &&
            add == other.add &&
            remove == other.remove &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(add, remove, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentGatewayPolicyGuardrails{add=$add, remove=$remove, additionalProperties=$additionalProperties}"
}
