// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ToolRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val toolDefinition: JsonField<ToolDefinition>,
    private val type: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val displayName: JsonField<String>,
    private val timeoutMs: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tool_definition")
        @ExcludeMissing
        toolDefinition: JsonField<ToolDefinition> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeout_ms") @ExcludeMissing timeoutMs: JsonField<Long> = JsonMissing.of(),
    ) : this(id, toolDefinition, type, createdAt, displayName, timeoutMs, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toolDefinition(): ToolDefinition = toolDefinition.getRequired("tool_definition")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = displayName.getOptional("display_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutMs(): Optional<Long> = timeoutMs.getOptional("timeout_ms")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [toolDefinition].
     *
     * Unlike [toolDefinition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_definition")
    @ExcludeMissing
    fun _toolDefinition(): JsonField<ToolDefinition> = toolDefinition

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [timeoutMs].
     *
     * Unlike [timeoutMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeout_ms") @ExcludeMissing fun _timeoutMs(): JsonField<Long> = timeoutMs

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
         * Returns a mutable builder for constructing an instance of [ToolRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .toolDefinition()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ToolRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var toolDefinition: JsonField<ToolDefinition>? = null
        private var type: JsonField<String>? = null
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var displayName: JsonField<String> = JsonMissing.of()
        private var timeoutMs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(toolRetrieveResponse: ToolRetrieveResponse) = apply {
            id = toolRetrieveResponse.id
            toolDefinition = toolRetrieveResponse.toolDefinition
            type = toolRetrieveResponse.type
            createdAt = toolRetrieveResponse.createdAt
            displayName = toolRetrieveResponse.displayName
            timeoutMs = toolRetrieveResponse.timeoutMs
            additionalProperties = toolRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun toolDefinition(toolDefinition: ToolDefinition) =
            toolDefinition(JsonField.of(toolDefinition))

        /**
         * Sets [Builder.toolDefinition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolDefinition] with a well-typed [ToolDefinition] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolDefinition(toolDefinition: JsonField<ToolDefinition>) = apply {
            this.toolDefinition = toolDefinition
        }

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        fun timeoutMs(timeoutMs: Long) = timeoutMs(JsonField.of(timeoutMs))

        /**
         * Sets [Builder.timeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeoutMs(timeoutMs: JsonField<Long>) = apply { this.timeoutMs = timeoutMs }

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
         * Returns an immutable instance of [ToolRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .toolDefinition()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ToolRetrieveResponse =
            ToolRetrieveResponse(
                checkRequired("id", id),
                checkRequired("toolDefinition", toolDefinition),
                checkRequired("type", type),
                createdAt,
                displayName,
                timeoutMs,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ToolRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        toolDefinition().validate()
        type()
        createdAt()
        displayName()
        timeoutMs()
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
            (toolDefinition.asKnown().getOrNull()?.validity() ?: 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (timeoutMs.asKnown().isPresent) 1 else 0)

    class ToolDefinition
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ToolDefinition]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ToolDefinition]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(toolDefinition: ToolDefinition) = apply {
                additionalProperties = toolDefinition.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ToolDefinition].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ToolDefinition = ToolDefinition(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ToolDefinition = apply {
            if (validated) {
                return@apply
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ToolDefinition && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ToolDefinition{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolRetrieveResponse &&
            id == other.id &&
            toolDefinition == other.toolDefinition &&
            type == other.type &&
            createdAt == other.createdAt &&
            displayName == other.displayName &&
            timeoutMs == other.timeoutMs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            toolDefinition,
            type,
            createdAt,
            displayName,
            timeoutMs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolRetrieveResponse{id=$id, toolDefinition=$toolDefinition, type=$type, createdAt=$createdAt, displayName=$displayName, timeoutMs=$timeoutMs, additionalProperties=$additionalProperties}"
}
