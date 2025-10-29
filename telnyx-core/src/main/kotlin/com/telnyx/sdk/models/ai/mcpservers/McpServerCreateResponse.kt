// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.mcpservers

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class McpServerCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val type: JsonField<String>,
    private val url: JsonField<String>,
    private val allowedTools: JsonField<List<String>>,
    private val apiKeyRef: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allowed_tools")
        @ExcludeMissing
        allowedTools: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("api_key_ref") @ExcludeMissing apiKeyRef: JsonField<String> = JsonMissing.of(),
    ) : this(id, createdAt, name, type, url, allowedTools, apiKeyRef, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedTools(): Optional<List<String>> = allowedTools.getOptional("allowed_tools")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKeyRef(): Optional<String> = apiKeyRef.getOptional("api_key_ref")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [allowedTools].
     *
     * Unlike [allowedTools], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allowed_tools")
    @ExcludeMissing
    fun _allowedTools(): JsonField<List<String>> = allowedTools

    /**
     * Returns the raw JSON value of [apiKeyRef].
     *
     * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_key_ref") @ExcludeMissing fun _apiKeyRef(): JsonField<String> = apiKeyRef

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
         * Returns a mutable builder for constructing an instance of [McpServerCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .name()
         * .type()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [McpServerCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var allowedTools: JsonField<MutableList<String>>? = null
        private var apiKeyRef: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mcpServerCreateResponse: McpServerCreateResponse) = apply {
            id = mcpServerCreateResponse.id
            createdAt = mcpServerCreateResponse.createdAt
            name = mcpServerCreateResponse.name
            type = mcpServerCreateResponse.type
            url = mcpServerCreateResponse.url
            allowedTools = mcpServerCreateResponse.allowedTools.map { it.toMutableList() }
            apiKeyRef = mcpServerCreateResponse.apiKeyRef
            additionalProperties = mcpServerCreateResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        fun allowedTools(allowedTools: List<String>?) =
            allowedTools(JsonField.ofNullable(allowedTools))

        /** Alias for calling [Builder.allowedTools] with `allowedTools.orElse(null)`. */
        fun allowedTools(allowedTools: Optional<List<String>>) =
            allowedTools(allowedTools.getOrNull())

        /**
         * Sets [Builder.allowedTools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedTools] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowedTools(allowedTools: JsonField<List<String>>) = apply {
            this.allowedTools = allowedTools.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [allowedTools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedTool(allowedTool: String) = apply {
            allowedTools =
                (allowedTools ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedTools", it).add(allowedTool)
                }
        }

        fun apiKeyRef(apiKeyRef: String?) = apiKeyRef(JsonField.ofNullable(apiKeyRef))

        /** Alias for calling [Builder.apiKeyRef] with `apiKeyRef.orElse(null)`. */
        fun apiKeyRef(apiKeyRef: Optional<String>) = apiKeyRef(apiKeyRef.getOrNull())

        /**
         * Sets [Builder.apiKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apiKeyRef(apiKeyRef: JsonField<String>) = apply { this.apiKeyRef = apiKeyRef }

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
         * Returns an immutable instance of [McpServerCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .name()
         * .type()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): McpServerCreateResponse =
            McpServerCreateResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("name", name),
                checkRequired("type", type),
                checkRequired("url", url),
                (allowedTools ?: JsonMissing.of()).map { it.toImmutable() },
                apiKeyRef,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): McpServerCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        name()
        type()
        url()
        allowedTools()
        apiKeyRef()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (allowedTools.asKnown().getOrNull()?.size ?: 0) +
            (if (apiKeyRef.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is McpServerCreateResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            name == other.name &&
            type == other.type &&
            url == other.url &&
            allowedTools == other.allowedTools &&
            apiKeyRef == other.apiKeyRef &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, createdAt, name, type, url, allowedTools, apiKeyRef, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "McpServerCreateResponse{id=$id, createdAt=$createdAt, name=$name, type=$type, url=$url, allowedTools=$allowedTools, apiKeyRef=$apiKeyRef, additionalProperties=$additionalProperties}"
}
