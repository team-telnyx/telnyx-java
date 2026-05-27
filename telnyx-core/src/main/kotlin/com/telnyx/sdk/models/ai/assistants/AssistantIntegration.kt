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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Reference to a connected integration attached to an assistant. Discover available integrations
 * with `/ai/integrations` and connected integrations with `/ai/integrations/connections`.
 */
class AssistantIntegration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val integrationId: JsonField<String>,
    private val allowedList: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("integration_id")
        @ExcludeMissing
        integrationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allowed_list")
        @ExcludeMissing
        allowedList: JsonField<List<String>> = JsonMissing.of(),
    ) : this(integrationId, allowedList, mutableMapOf())

    /**
     * Catalog integration ID to attach. This is the `id` from the integrations catalog at
     * `/ai/integrations` (the same value also appears as `integration_id` on entries returned by
     * `/ai/integrations/connections`). It is **not** the connection-level `id` from
     * `/ai/integrations/connections`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun integrationId(): String = integrationId.getRequired("integration_id")

    /**
     * Optional per-assistant allowlist of integration tool names. When omitted or empty, all tools
     * allowed by the connected integration are available to the assistant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedList(): Optional<List<String>> = allowedList.getOptional("allowed_list")

    /**
     * Returns the raw JSON value of [integrationId].
     *
     * Unlike [integrationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("integration_id")
    @ExcludeMissing
    fun _integrationId(): JsonField<String> = integrationId

    /**
     * Returns the raw JSON value of [allowedList].
     *
     * Unlike [allowedList], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allowed_list")
    @ExcludeMissing
    fun _allowedList(): JsonField<List<String>> = allowedList

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
         * Returns a mutable builder for constructing an instance of [AssistantIntegration].
         *
         * The following fields are required:
         * ```java
         * .integrationId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssistantIntegration]. */
    class Builder internal constructor() {

        private var integrationId: JsonField<String>? = null
        private var allowedList: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(assistantIntegration: AssistantIntegration) = apply {
            integrationId = assistantIntegration.integrationId
            allowedList = assistantIntegration.allowedList.map { it.toMutableList() }
            additionalProperties = assistantIntegration.additionalProperties.toMutableMap()
        }

        /**
         * Catalog integration ID to attach. This is the `id` from the integrations catalog at
         * `/ai/integrations` (the same value also appears as `integration_id` on entries returned
         * by `/ai/integrations/connections`). It is **not** the connection-level `id` from
         * `/ai/integrations/connections`.
         */
        fun integrationId(integrationId: String) = integrationId(JsonField.of(integrationId))

        /**
         * Sets [Builder.integrationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun integrationId(integrationId: JsonField<String>) = apply {
            this.integrationId = integrationId
        }

        /**
         * Optional per-assistant allowlist of integration tool names. When omitted or empty, all
         * tools allowed by the connected integration are available to the assistant.
         */
        fun allowedList(allowedList: List<String>) = allowedList(JsonField.of(allowedList))

        /**
         * Sets [Builder.allowedList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedList] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowedList(allowedList: JsonField<List<String>>) = apply {
            this.allowedList = allowedList.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.allowedList].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedList(allowedList: String) = apply {
            this.allowedList =
                (this.allowedList ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedList", it).add(allowedList)
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
         * Returns an immutable instance of [AssistantIntegration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .integrationId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssistantIntegration =
            AssistantIntegration(
                checkRequired("integrationId", integrationId),
                (allowedList ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): AssistantIntegration = apply {
        if (validated) {
            return@apply
        }

        integrationId()
        allowedList()
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
        (if (integrationId.asKnown().isPresent) 1 else 0) +
            (allowedList.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssistantIntegration &&
            integrationId == other.integrationId &&
            allowedList == other.allowedList &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(integrationId, allowedList, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AssistantIntegration{integrationId=$integrationId, allowedList=$allowedList, additionalProperties=$additionalProperties}"
}
