// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.tools

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Test a webhook tool for an assistant */
class ToolTestParams
private constructor(
    private val assistantId: String,
    private val toolId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun assistantId(): String = assistantId

    fun toolId(): Optional<String> = Optional.ofNullable(toolId)

    /**
     * Key-value arguments to use for the webhook test
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun arguments(): Optional<Arguments> = body.arguments()

    /**
     * Key-value dynamic variables to use for the webhook test
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dynamicVariables(): Optional<DynamicVariables> = body.dynamicVariables()

    /**
     * Returns the raw JSON value of [arguments].
     *
     * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _arguments(): JsonField<Arguments> = body._arguments()

    /**
     * Returns the raw JSON value of [dynamicVariables].
     *
     * Unlike [dynamicVariables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _dynamicVariables(): JsonField<DynamicVariables> = body._dynamicVariables()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ToolTestParams].
         *
         * The following fields are required:
         * ```java
         * .assistantId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ToolTestParams]. */
    class Builder internal constructor() {

        private var assistantId: String? = null
        private var toolId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(toolTestParams: ToolTestParams) = apply {
            assistantId = toolTestParams.assistantId
            toolId = toolTestParams.toolId
            body = toolTestParams.body.toBuilder()
            additionalHeaders = toolTestParams.additionalHeaders.toBuilder()
            additionalQueryParams = toolTestParams.additionalQueryParams.toBuilder()
        }

        fun assistantId(assistantId: String) = apply { this.assistantId = assistantId }

        fun toolId(toolId: String?) = apply { this.toolId = toolId }

        /** Alias for calling [Builder.toolId] with `toolId.orElse(null)`. */
        fun toolId(toolId: Optional<String>) = toolId(toolId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [arguments]
         * - [dynamicVariables]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Key-value arguments to use for the webhook test */
        fun arguments(arguments: Arguments) = apply { body.arguments(arguments) }

        /**
         * Sets [Builder.arguments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arguments] with a well-typed [Arguments] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun arguments(arguments: JsonField<Arguments>) = apply { body.arguments(arguments) }

        /** Key-value dynamic variables to use for the webhook test */
        fun dynamicVariables(dynamicVariables: DynamicVariables) = apply {
            body.dynamicVariables(dynamicVariables)
        }

        /**
         * Sets [Builder.dynamicVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dynamicVariables] with a well-typed [DynamicVariables]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dynamicVariables(dynamicVariables: JsonField<DynamicVariables>) = apply {
            body.dynamicVariables(dynamicVariables)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ToolTestParams].
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
        fun build(): ToolTestParams =
            ToolTestParams(
                checkRequired("assistantId", assistantId),
                toolId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> assistantId
            1 -> toolId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request model for testing a webhook tool */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val arguments: JsonField<Arguments>,
        private val dynamicVariables: JsonField<DynamicVariables>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("arguments")
            @ExcludeMissing
            arguments: JsonField<Arguments> = JsonMissing.of(),
            @JsonProperty("dynamic_variables")
            @ExcludeMissing
            dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of(),
        ) : this(arguments, dynamicVariables, mutableMapOf())

        /**
         * Key-value arguments to use for the webhook test
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun arguments(): Optional<Arguments> = arguments.getOptional("arguments")

        /**
         * Key-value dynamic variables to use for the webhook test
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dynamicVariables(): Optional<DynamicVariables> =
            dynamicVariables.getOptional("dynamic_variables")

        /**
         * Returns the raw JSON value of [arguments].
         *
         * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("arguments")
        @ExcludeMissing
        fun _arguments(): JsonField<Arguments> = arguments

        /**
         * Returns the raw JSON value of [dynamicVariables].
         *
         * Unlike [dynamicVariables], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dynamic_variables")
        @ExcludeMissing
        fun _dynamicVariables(): JsonField<DynamicVariables> = dynamicVariables

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var arguments: JsonField<Arguments> = JsonMissing.of()
            private var dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                arguments = body.arguments
                dynamicVariables = body.dynamicVariables
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Key-value arguments to use for the webhook test */
            fun arguments(arguments: Arguments) = arguments(JsonField.of(arguments))

            /**
             * Sets [Builder.arguments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arguments] with a well-typed [Arguments] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun arguments(arguments: JsonField<Arguments>) = apply { this.arguments = arguments }

            /** Key-value dynamic variables to use for the webhook test */
            fun dynamicVariables(dynamicVariables: DynamicVariables) =
                dynamicVariables(JsonField.of(dynamicVariables))

            /**
             * Sets [Builder.dynamicVariables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dynamicVariables] with a well-typed
             * [DynamicVariables] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun dynamicVariables(dynamicVariables: JsonField<DynamicVariables>) = apply {
                this.dynamicVariables = dynamicVariables
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(arguments, dynamicVariables, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            arguments().ifPresent { it.validate() }
            dynamicVariables().ifPresent { it.validate() }
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
            (arguments.asKnown().getOrNull()?.validity() ?: 0) +
                (dynamicVariables.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                arguments == other.arguments &&
                dynamicVariables == other.dynamicVariables &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(arguments, dynamicVariables, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{arguments=$arguments, dynamicVariables=$dynamicVariables, additionalProperties=$additionalProperties}"
    }

    /** Key-value arguments to use for the webhook test */
    class Arguments
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

            /** Returns a mutable builder for constructing an instance of [Arguments]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Arguments]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(arguments: Arguments) = apply {
                additionalProperties = arguments.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Arguments].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Arguments = Arguments(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Arguments = apply {
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

            return other is Arguments && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Arguments{additionalProperties=$additionalProperties}"
    }

    /** Key-value dynamic variables to use for the webhook test */
    class DynamicVariables
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

            /** Returns a mutable builder for constructing an instance of [DynamicVariables]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DynamicVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dynamicVariables: DynamicVariables) = apply {
                additionalProperties = dynamicVariables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DynamicVariables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DynamicVariables = DynamicVariables(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): DynamicVariables = apply {
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

            return other is DynamicVariables && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "DynamicVariables{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolTestParams &&
            assistantId == other.assistantId &&
            toolId == other.toolId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(assistantId, toolId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ToolTestParams{assistantId=$assistantId, toolId=$toolId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
