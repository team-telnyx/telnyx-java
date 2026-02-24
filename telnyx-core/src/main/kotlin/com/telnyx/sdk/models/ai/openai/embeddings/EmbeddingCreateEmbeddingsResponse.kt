// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.openai.embeddings

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
import kotlin.jvm.optionals.getOrNull

class EmbeddingCreateEmbeddingsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val model: JsonField<String>,
    private val modelObject: JsonField<String>,
    private val usage: JsonField<Usage>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing modelObject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
    ) : this(data, model, modelObject, usage, mutableMapOf())

    /**
     * List of embedding objects
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * The model used for embedding
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = model.getRequired("model")

    /**
     * The object type, always 'list'
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modelObject(): String = modelObject.getRequired("object")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usage(): Usage = usage.getRequired("usage")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [modelObject].
     *
     * Unlike [modelObject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _modelObject(): JsonField<String> = modelObject

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

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
         * Returns a mutable builder for constructing an instance of
         * [EmbeddingCreateEmbeddingsResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .model()
         * .modelObject()
         * .usage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmbeddingCreateEmbeddingsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var model: JsonField<String>? = null
        private var modelObject: JsonField<String>? = null
        private var usage: JsonField<Usage>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(embeddingCreateEmbeddingsResponse: EmbeddingCreateEmbeddingsResponse) =
            apply {
                data = embeddingCreateEmbeddingsResponse.data.map { it.toMutableList() }
                model = embeddingCreateEmbeddingsResponse.model
                modelObject = embeddingCreateEmbeddingsResponse.modelObject
                usage = embeddingCreateEmbeddingsResponse.usage
                additionalProperties =
                    embeddingCreateEmbeddingsResponse.additionalProperties.toMutableMap()
            }

        /** List of embedding objects */
        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /** The model used for embedding */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /** The object type, always 'list' */
        fun modelObject(modelObject: String) = modelObject(JsonField.of(modelObject))

        /**
         * Sets [Builder.modelObject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelObject] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelObject(modelObject: JsonField<String>) = apply { this.modelObject = modelObject }

        fun usage(usage: Usage) = usage(JsonField.of(usage))

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

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
         * Returns an immutable instance of [EmbeddingCreateEmbeddingsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .model()
         * .modelObject()
         * .usage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmbeddingCreateEmbeddingsResponse =
            EmbeddingCreateEmbeddingsResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("model", model),
                checkRequired("modelObject", modelObject),
                checkRequired("usage", usage),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EmbeddingCreateEmbeddingsResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        model()
        modelObject()
        usage().validate()
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (modelObject.asKnown().isPresent) 1 else 0) +
            (usage.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val embedding: JsonField<List<Double>>,
        private val index: JsonField<Long>,
        private val modelObject: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("embedding")
            @ExcludeMissing
            embedding: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("object")
            @ExcludeMissing
            modelObject: JsonField<String> = JsonMissing.of(),
        ) : this(embedding, index, modelObject, mutableMapOf())

        /**
         * The embedding vector
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun embedding(): List<Double> = embedding.getRequired("embedding")

        /**
         * The index of the embedding in the list of embeddings
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun index(): Long = index.getRequired("index")

        /**
         * The object type, always 'embedding'
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelObject(): String = modelObject.getRequired("object")

        /**
         * Returns the raw JSON value of [embedding].
         *
         * Unlike [embedding], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("embedding")
        @ExcludeMissing
        fun _embedding(): JsonField<List<Double>> = embedding

        /**
         * Returns the raw JSON value of [index].
         *
         * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

        /**
         * Returns the raw JSON value of [modelObject].
         *
         * Unlike [modelObject], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object") @ExcludeMissing fun _modelObject(): JsonField<String> = modelObject

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .embedding()
             * .index()
             * .modelObject()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var embedding: JsonField<MutableList<Double>>? = null
            private var index: JsonField<Long>? = null
            private var modelObject: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                embedding = data.embedding.map { it.toMutableList() }
                index = data.index
                modelObject = data.modelObject
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The embedding vector */
            fun embedding(embedding: List<Double>) = embedding(JsonField.of(embedding))

            /**
             * Sets [Builder.embedding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embedding] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun embedding(embedding: JsonField<List<Double>>) = apply {
                this.embedding = embedding.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.embedding].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEmbedding(embedding: Double) = apply {
                this.embedding =
                    (this.embedding ?: JsonField.of(mutableListOf())).also {
                        checkKnown("embedding", it).add(embedding)
                    }
            }

            /** The index of the embedding in the list of embeddings */
            fun index(index: Long) = index(JsonField.of(index))

            /**
             * Sets [Builder.index] to an arbitrary JSON value.
             *
             * You should usually call [Builder.index] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun index(index: JsonField<Long>) = apply { this.index = index }

            /** The object type, always 'embedding' */
            fun modelObject(modelObject: String) = modelObject(JsonField.of(modelObject))

            /**
             * Sets [Builder.modelObject] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelObject] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelObject(modelObject: JsonField<String>) = apply {
                this.modelObject = modelObject
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .embedding()
             * .index()
             * .modelObject()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("embedding", embedding).map { it.toImmutable() },
                    checkRequired("index", index),
                    checkRequired("modelObject", modelObject),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            embedding()
            index()
            modelObject()
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
            (embedding.asKnown().getOrNull()?.size ?: 0) +
                (if (index.asKnown().isPresent) 1 else 0) +
                (if (modelObject.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                embedding == other.embedding &&
                index == other.index &&
                modelObject == other.modelObject &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(embedding, index, modelObject, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{embedding=$embedding, index=$index, modelObject=$modelObject, additionalProperties=$additionalProperties}"
    }

    class Usage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val promptTokens: JsonField<Long>,
        private val totalTokens: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("prompt_tokens")
            @ExcludeMissing
            promptTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_tokens")
            @ExcludeMissing
            totalTokens: JsonField<Long> = JsonMissing.of(),
        ) : this(promptTokens, totalTokens, mutableMapOf())

        /**
         * Number of tokens in the input
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun promptTokens(): Long = promptTokens.getRequired("prompt_tokens")

        /**
         * Total number of tokens used
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalTokens(): Long = totalTokens.getRequired("total_tokens")

        /**
         * Returns the raw JSON value of [promptTokens].
         *
         * Unlike [promptTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        fun _promptTokens(): JsonField<Long> = promptTokens

        /**
         * Returns the raw JSON value of [totalTokens].
         *
         * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_tokens")
        @ExcludeMissing
        fun _totalTokens(): JsonField<Long> = totalTokens

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
             * Returns a mutable builder for constructing an instance of [Usage].
             *
             * The following fields are required:
             * ```java
             * .promptTokens()
             * .totalTokens()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Usage]. */
        class Builder internal constructor() {

            private var promptTokens: JsonField<Long>? = null
            private var totalTokens: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usage: Usage) = apply {
                promptTokens = usage.promptTokens
                totalTokens = usage.totalTokens
                additionalProperties = usage.additionalProperties.toMutableMap()
            }

            /** Number of tokens in the input */
            fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

            /**
             * Sets [Builder.promptTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptTokens(promptTokens: JsonField<Long>) = apply {
                this.promptTokens = promptTokens
            }

            /** Total number of tokens used */
            fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

            /**
             * Sets [Builder.totalTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

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
             * Returns an immutable instance of [Usage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .promptTokens()
             * .totalTokens()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Usage =
                Usage(
                    checkRequired("promptTokens", promptTokens),
                    checkRequired("totalTokens", totalTokens),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Usage = apply {
            if (validated) {
                return@apply
            }

            promptTokens()
            totalTokens()
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
            (if (promptTokens.asKnown().isPresent) 1 else 0) +
                (if (totalTokens.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Usage &&
                promptTokens == other.promptTokens &&
                totalTokens == other.totalTokens &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(promptTokens, totalTokens, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Usage{promptTokens=$promptTokens, totalTokens=$totalTokens, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmbeddingCreateEmbeddingsResponse &&
            data == other.data &&
            model == other.model &&
            modelObject == other.modelObject &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(data, model, modelObject, usage, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmbeddingCreateEmbeddingsResponse{data=$data, model=$model, modelObject=$modelObject, usage=$usage, additionalProperties=$additionalProperties}"
}
