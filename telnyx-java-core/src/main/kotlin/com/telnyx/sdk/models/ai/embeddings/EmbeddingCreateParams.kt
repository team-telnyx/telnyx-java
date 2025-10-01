// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.embeddings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Perform embedding on a Telnyx Storage Bucket using the a embedding model. The current supported
 * file types are:
 * - PDF
 * - HTML
 * - txt/unstructured text files
 * - json
 * - csv
 * - audio / video (mp3, mp4, mpeg, mpga, m4a, wav, or webm ) - Max of 100mb file size.
 *
 * Any files not matching the above types will be attempted to be embedded as unstructured text.
 *
 * This process can be slow, so it runs in the background and the user can check the status of the
 * task using the endpoint `/ai/embeddings/{task_id}`.
 *
 * **Important Note**: When you update documents in a Telnyx Storage bucket, their associated
 * embeddings are automatically kept up to date. If you add or update a file, it is automatically
 * embedded. If you delete a file, the embeddings are deleted for that particular file.
 *
 * You can also specify a custom `loader` param. Currently the only supported loader value is
 * `intercom` which loads Intercom article jsons as specified by
 * [the Intercom article API](https://developers.intercom.com/docs/references/rest-api/api.intercom.io/Articles/article/)
 * This loader will split each article into paragraphs and save additional parameters relevant to
 * Intercom docs, such as `article_url` and `heading`. These values will be returned by the
 * `/v2/ai/embeddings/similarity-search` endpoint in the `loader_metadata` field.
 */
class EmbeddingCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucketName(): String = body.bucketName()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentChunkOverlapSize(): Optional<Long> = body.documentChunkOverlapSize()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentChunkSize(): Optional<Long> = body.documentChunkSize()

    /**
     * Supported models to vectorize and embed documents.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embeddingModel(): Optional<EmbeddingModel> = body.embeddingModel()

    /**
     * Supported types of custom document loaders for embeddings.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loader(): Optional<Loader> = body.loader()

    /**
     * Returns the raw JSON value of [bucketName].
     *
     * Unlike [bucketName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bucketName(): JsonField<String> = body._bucketName()

    /**
     * Returns the raw JSON value of [documentChunkOverlapSize].
     *
     * Unlike [documentChunkOverlapSize], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _documentChunkOverlapSize(): JsonField<Long> = body._documentChunkOverlapSize()

    /**
     * Returns the raw JSON value of [documentChunkSize].
     *
     * Unlike [documentChunkSize], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _documentChunkSize(): JsonField<Long> = body._documentChunkSize()

    /**
     * Returns the raw JSON value of [embeddingModel].
     *
     * Unlike [embeddingModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _embeddingModel(): JsonField<EmbeddingModel> = body._embeddingModel()

    /**
     * Returns the raw JSON value of [loader].
     *
     * Unlike [loader], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _loader(): JsonField<Loader> = body._loader()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmbeddingCreateParams].
         *
         * The following fields are required:
         * ```java
         * .bucketName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmbeddingCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(embeddingCreateParams: EmbeddingCreateParams) = apply {
            body = embeddingCreateParams.body.toBuilder()
            additionalHeaders = embeddingCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = embeddingCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bucketName]
         * - [documentChunkOverlapSize]
         * - [documentChunkSize]
         * - [embeddingModel]
         * - [loader]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun bucketName(bucketName: String) = apply { body.bucketName(bucketName) }

        /**
         * Sets [Builder.bucketName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucketName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bucketName(bucketName: JsonField<String>) = apply { body.bucketName(bucketName) }

        fun documentChunkOverlapSize(documentChunkOverlapSize: Long) = apply {
            body.documentChunkOverlapSize(documentChunkOverlapSize)
        }

        /**
         * Sets [Builder.documentChunkOverlapSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentChunkOverlapSize] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentChunkOverlapSize(documentChunkOverlapSize: JsonField<Long>) = apply {
            body.documentChunkOverlapSize(documentChunkOverlapSize)
        }

        fun documentChunkSize(documentChunkSize: Long) = apply {
            body.documentChunkSize(documentChunkSize)
        }

        /**
         * Sets [Builder.documentChunkSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentChunkSize] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentChunkSize(documentChunkSize: JsonField<Long>) = apply {
            body.documentChunkSize(documentChunkSize)
        }

        /** Supported models to vectorize and embed documents. */
        fun embeddingModel(embeddingModel: EmbeddingModel) = apply {
            body.embeddingModel(embeddingModel)
        }

        /**
         * Sets [Builder.embeddingModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddingModel] with a well-typed [EmbeddingModel] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun embeddingModel(embeddingModel: JsonField<EmbeddingModel>) = apply {
            body.embeddingModel(embeddingModel)
        }

        /** Supported types of custom document loaders for embeddings. */
        fun loader(loader: Loader) = apply { body.loader(loader) }

        /**
         * Sets [Builder.loader] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loader] with a well-typed [Loader] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun loader(loader: JsonField<Loader>) = apply { body.loader(loader) }

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
         * Returns an immutable instance of [EmbeddingCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bucketName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmbeddingCreateParams =
            EmbeddingCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bucketName: JsonField<String>,
        private val documentChunkOverlapSize: JsonField<Long>,
        private val documentChunkSize: JsonField<Long>,
        private val embeddingModel: JsonField<EmbeddingModel>,
        private val loader: JsonField<Loader>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bucket_name")
            @ExcludeMissing
            bucketName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("document_chunk_overlap_size")
            @ExcludeMissing
            documentChunkOverlapSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("document_chunk_size")
            @ExcludeMissing
            documentChunkSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("embedding_model")
            @ExcludeMissing
            embeddingModel: JsonField<EmbeddingModel> = JsonMissing.of(),
            @JsonProperty("loader") @ExcludeMissing loader: JsonField<Loader> = JsonMissing.of(),
        ) : this(
            bucketName,
            documentChunkOverlapSize,
            documentChunkSize,
            embeddingModel,
            loader,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bucketName(): String = bucketName.getRequired("bucket_name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun documentChunkOverlapSize(): Optional<Long> =
            documentChunkOverlapSize.getOptional("document_chunk_overlap_size")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun documentChunkSize(): Optional<Long> =
            documentChunkSize.getOptional("document_chunk_size")

        /**
         * Supported models to vectorize and embed documents.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun embeddingModel(): Optional<EmbeddingModel> =
            embeddingModel.getOptional("embedding_model")

        /**
         * Supported types of custom document loaders for embeddings.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun loader(): Optional<Loader> = loader.getOptional("loader")

        /**
         * Returns the raw JSON value of [bucketName].
         *
         * Unlike [bucketName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bucket_name")
        @ExcludeMissing
        fun _bucketName(): JsonField<String> = bucketName

        /**
         * Returns the raw JSON value of [documentChunkOverlapSize].
         *
         * Unlike [documentChunkOverlapSize], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("document_chunk_overlap_size")
        @ExcludeMissing
        fun _documentChunkOverlapSize(): JsonField<Long> = documentChunkOverlapSize

        /**
         * Returns the raw JSON value of [documentChunkSize].
         *
         * Unlike [documentChunkSize], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("document_chunk_size")
        @ExcludeMissing
        fun _documentChunkSize(): JsonField<Long> = documentChunkSize

        /**
         * Returns the raw JSON value of [embeddingModel].
         *
         * Unlike [embeddingModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("embedding_model")
        @ExcludeMissing
        fun _embeddingModel(): JsonField<EmbeddingModel> = embeddingModel

        /**
         * Returns the raw JSON value of [loader].
         *
         * Unlike [loader], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("loader") @ExcludeMissing fun _loader(): JsonField<Loader> = loader

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .bucketName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var bucketName: JsonField<String>? = null
            private var documentChunkOverlapSize: JsonField<Long> = JsonMissing.of()
            private var documentChunkSize: JsonField<Long> = JsonMissing.of()
            private var embeddingModel: JsonField<EmbeddingModel> = JsonMissing.of()
            private var loader: JsonField<Loader> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                bucketName = body.bucketName
                documentChunkOverlapSize = body.documentChunkOverlapSize
                documentChunkSize = body.documentChunkSize
                embeddingModel = body.embeddingModel
                loader = body.loader
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun bucketName(bucketName: String) = bucketName(JsonField.of(bucketName))

            /**
             * Sets [Builder.bucketName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bucketName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bucketName(bucketName: JsonField<String>) = apply { this.bucketName = bucketName }

            fun documentChunkOverlapSize(documentChunkOverlapSize: Long) =
                documentChunkOverlapSize(JsonField.of(documentChunkOverlapSize))

            /**
             * Sets [Builder.documentChunkOverlapSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentChunkOverlapSize] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun documentChunkOverlapSize(documentChunkOverlapSize: JsonField<Long>) = apply {
                this.documentChunkOverlapSize = documentChunkOverlapSize
            }

            fun documentChunkSize(documentChunkSize: Long) =
                documentChunkSize(JsonField.of(documentChunkSize))

            /**
             * Sets [Builder.documentChunkSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentChunkSize] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentChunkSize(documentChunkSize: JsonField<Long>) = apply {
                this.documentChunkSize = documentChunkSize
            }

            /** Supported models to vectorize and embed documents. */
            fun embeddingModel(embeddingModel: EmbeddingModel) =
                embeddingModel(JsonField.of(embeddingModel))

            /**
             * Sets [Builder.embeddingModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embeddingModel] with a well-typed [EmbeddingModel]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun embeddingModel(embeddingModel: JsonField<EmbeddingModel>) = apply {
                this.embeddingModel = embeddingModel
            }

            /** Supported types of custom document loaders for embeddings. */
            fun loader(loader: Loader) = loader(JsonField.of(loader))

            /**
             * Sets [Builder.loader] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loader] with a well-typed [Loader] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loader(loader: JsonField<Loader>) = apply { this.loader = loader }

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
             *
             * The following fields are required:
             * ```java
             * .bucketName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("bucketName", bucketName),
                    documentChunkOverlapSize,
                    documentChunkSize,
                    embeddingModel,
                    loader,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            bucketName()
            documentChunkOverlapSize()
            documentChunkSize()
            embeddingModel().ifPresent { it.validate() }
            loader().ifPresent { it.validate() }
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
            (if (bucketName.asKnown().isPresent) 1 else 0) +
                (if (documentChunkOverlapSize.asKnown().isPresent) 1 else 0) +
                (if (documentChunkSize.asKnown().isPresent) 1 else 0) +
                (embeddingModel.asKnown().getOrNull()?.validity() ?: 0) +
                (loader.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bucketName == other.bucketName &&
                documentChunkOverlapSize == other.documentChunkOverlapSize &&
                documentChunkSize == other.documentChunkSize &&
                embeddingModel == other.embeddingModel &&
                loader == other.loader &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                bucketName,
                documentChunkOverlapSize,
                documentChunkSize,
                embeddingModel,
                loader,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bucketName=$bucketName, documentChunkOverlapSize=$documentChunkOverlapSize, documentChunkSize=$documentChunkSize, embeddingModel=$embeddingModel, loader=$loader, additionalProperties=$additionalProperties}"
    }

    /** Supported models to vectorize and embed documents. */
    class EmbeddingModel @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val THENLPER_GTE_LARGE = of("thenlper/gte-large")

            @JvmField val INTFLOAT_MULTILINGUAL_E5_LARGE = of("intfloat/multilingual-e5-large")

            @JvmStatic fun of(value: String) = EmbeddingModel(JsonField.of(value))
        }

        /** An enum containing [EmbeddingModel]'s known values. */
        enum class Known {
            THENLPER_GTE_LARGE,
            INTFLOAT_MULTILINGUAL_E5_LARGE,
        }

        /**
         * An enum containing [EmbeddingModel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EmbeddingModel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            THENLPER_GTE_LARGE,
            INTFLOAT_MULTILINGUAL_E5_LARGE,
            /**
             * An enum member indicating that [EmbeddingModel] was instantiated with an unknown
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
                THENLPER_GTE_LARGE -> Value.THENLPER_GTE_LARGE
                INTFLOAT_MULTILINGUAL_E5_LARGE -> Value.INTFLOAT_MULTILINGUAL_E5_LARGE
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
                THENLPER_GTE_LARGE -> Known.THENLPER_GTE_LARGE
                INTFLOAT_MULTILINGUAL_E5_LARGE -> Known.INTFLOAT_MULTILINGUAL_E5_LARGE
                else -> throw TelnyxInvalidDataException("Unknown EmbeddingModel: $value")
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

        fun validate(): EmbeddingModel = apply {
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

            return other is EmbeddingModel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Supported types of custom document loaders for embeddings. */
    class Loader @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DEFAULT = of("default")

            @JvmField val INTERCOM = of("intercom")

            @JvmStatic fun of(value: String) = Loader(JsonField.of(value))
        }

        /** An enum containing [Loader]'s known values. */
        enum class Known {
            DEFAULT,
            INTERCOM,
        }

        /**
         * An enum containing [Loader]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Loader] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEFAULT,
            INTERCOM,
            /** An enum member indicating that [Loader] was instantiated with an unknown value. */
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
                DEFAULT -> Value.DEFAULT
                INTERCOM -> Value.INTERCOM
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
                DEFAULT -> Known.DEFAULT
                INTERCOM -> Known.INTERCOM
                else -> throw TelnyxInvalidDataException("Unknown Loader: $value")
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

        fun validate(): Loader = apply {
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

            return other is Loader && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmbeddingCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EmbeddingCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
