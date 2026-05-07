// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

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

/**
 * What a rule serves when matched.
 *
 * Exactly one of:
 * - ``version_id`` — serve a specific version
 * - ``rollout`` — weighted random across versions; weights must sum to less than 100, with the
 *   leftover routing to the main version
 */
class Serve
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val rollout: JsonField<List<RolloutSlot>>,
    private val versionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("rollout")
        @ExcludeMissing
        rollout: JsonField<List<RolloutSlot>> = JsonMissing.of(),
        @JsonProperty("version_id") @ExcludeMissing versionId: JsonField<String> = JsonMissing.of(),
    ) : this(rollout, versionId, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rollout(): Optional<List<RolloutSlot>> = rollout.getOptional("rollout")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun versionId(): Optional<String> = versionId.getOptional("version_id")

    /**
     * Returns the raw JSON value of [rollout].
     *
     * Unlike [rollout], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rollout") @ExcludeMissing fun _rollout(): JsonField<List<RolloutSlot>> = rollout

    /**
     * Returns the raw JSON value of [versionId].
     *
     * Unlike [versionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version_id") @ExcludeMissing fun _versionId(): JsonField<String> = versionId

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

        /** Returns a mutable builder for constructing an instance of [Serve]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Serve]. */
    class Builder internal constructor() {

        private var rollout: JsonField<MutableList<RolloutSlot>>? = null
        private var versionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(serve: Serve) = apply {
            rollout = serve.rollout.map { it.toMutableList() }
            versionId = serve.versionId
            additionalProperties = serve.additionalProperties.toMutableMap()
        }

        fun rollout(rollout: List<RolloutSlot>) = rollout(JsonField.of(rollout))

        /**
         * Sets [Builder.rollout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rollout] with a well-typed `List<RolloutSlot>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rollout(rollout: JsonField<List<RolloutSlot>>) = apply {
            this.rollout = rollout.map { it.toMutableList() }
        }

        /**
         * Adds a single [RolloutSlot] to [Builder.rollout].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRollout(rollout: RolloutSlot) = apply {
            this.rollout =
                (this.rollout ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rollout", it).add(rollout)
                }
        }

        fun versionId(versionId: String) = versionId(JsonField.of(versionId))

        /**
         * Sets [Builder.versionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.versionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun versionId(versionId: JsonField<String>) = apply { this.versionId = versionId }

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
         * Returns an immutable instance of [Serve].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Serve =
            Serve(
                (rollout ?: JsonMissing.of()).map { it.toImmutable() },
                versionId,
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
    fun validate(): Serve = apply {
        if (validated) {
            return@apply
        }

        rollout().ifPresent { it.forEach { it.validate() } }
        versionId()
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
        (rollout.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (versionId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Serve &&
            rollout == other.rollout &&
            versionId == other.versionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(rollout, versionId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Serve{rollout=$rollout, versionId=$versionId, additionalProperties=$additionalProperties}"
}
