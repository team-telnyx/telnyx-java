// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

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

class CollectionRetrieveDocumentsPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<CollectionRetrieveDocumentsResponse>>,
    private val meta: JsonField<Meta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<CollectionRetrieveDocumentsResponse>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<CollectionRetrieveDocumentsResponse>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<List<CollectionRetrieveDocumentsResponse>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

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
         * [CollectionRetrieveDocumentsPageResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CollectionRetrieveDocumentsPageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<CollectionRetrieveDocumentsResponse>>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            collectionRetrieveDocumentsPageResponse: CollectionRetrieveDocumentsPageResponse
        ) = apply {
            data = collectionRetrieveDocumentsPageResponse.data.map { it.toMutableList() }
            meta = collectionRetrieveDocumentsPageResponse.meta
            additionalProperties =
                collectionRetrieveDocumentsPageResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<CollectionRetrieveDocumentsResponse>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed
         * `List<CollectionRetrieveDocumentsResponse>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<CollectionRetrieveDocumentsResponse>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [CollectionRetrieveDocumentsResponse] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: CollectionRetrieveDocumentsResponse) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [CollectionRetrieveDocumentsPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CollectionRetrieveDocumentsPageResponse =
            CollectionRetrieveDocumentsPageResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
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
    fun validate(): CollectionRetrieveDocumentsPageResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val collectionSlug: JsonField<String>,
        private val pageNumber: JsonField<Long>,
        private val pageSize: JsonField<Long>,
        private val retrievalType: JsonField<String>,
        private val searchedSources: JsonField<List<String>>,
        private val topK: JsonField<Long>,
        private val totalPages: JsonField<Long>,
        private val totalResults: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("collection_slug")
            @ExcludeMissing
            collectionSlug: JsonField<String> = JsonMissing.of(),
            @JsonProperty("page_number")
            @ExcludeMissing
            pageNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("retrieval_type")
            @ExcludeMissing
            retrievalType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("searched_sources")
            @ExcludeMissing
            searchedSources: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("top_k") @ExcludeMissing topK: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_pages")
            @ExcludeMissing
            totalPages: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_results")
            @ExcludeMissing
            totalResults: JsonField<Long> = JsonMissing.of(),
        ) : this(
            collectionSlug,
            pageNumber,
            pageSize,
            retrievalType,
            searchedSources,
            topK,
            totalPages,
            totalResults,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun collectionSlug(): Optional<String> = collectionSlug.getOptional("collection_slug")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageNumber(): Optional<Long> = pageNumber.getOptional("page_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun retrievalType(): Optional<String> = retrievalType.getOptional("retrieval_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun searchedSources(): Optional<List<String>> =
            searchedSources.getOptional("searched_sources")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun topK(): Optional<Long> = topK.getOptional("top_k")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalPages(): Optional<Long> = totalPages.getOptional("total_pages")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalResults(): Optional<Long> = totalResults.getOptional("total_results")

        /**
         * Returns the raw JSON value of [collectionSlug].
         *
         * Unlike [collectionSlug], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("collection_slug")
        @ExcludeMissing
        fun _collectionSlug(): JsonField<String> = collectionSlug

        /**
         * Returns the raw JSON value of [pageNumber].
         *
         * Unlike [pageNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_number") @ExcludeMissing fun _pageNumber(): JsonField<Long> = pageNumber

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        /**
         * Returns the raw JSON value of [retrievalType].
         *
         * Unlike [retrievalType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("retrieval_type")
        @ExcludeMissing
        fun _retrievalType(): JsonField<String> = retrievalType

        /**
         * Returns the raw JSON value of [searchedSources].
         *
         * Unlike [searchedSources], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("searched_sources")
        @ExcludeMissing
        fun _searchedSources(): JsonField<List<String>> = searchedSources

        /**
         * Returns the raw JSON value of [topK].
         *
         * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top_k") @ExcludeMissing fun _topK(): JsonField<Long> = topK

        /**
         * Returns the raw JSON value of [totalPages].
         *
         * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Long> = totalPages

        /**
         * Returns the raw JSON value of [totalResults].
         *
         * Unlike [totalResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_results")
        @ExcludeMissing
        fun _totalResults(): JsonField<Long> = totalResults

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

            /** Returns a mutable builder for constructing an instance of [Meta]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var collectionSlug: JsonField<String> = JsonMissing.of()
            private var pageNumber: JsonField<Long> = JsonMissing.of()
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var retrievalType: JsonField<String> = JsonMissing.of()
            private var searchedSources: JsonField<MutableList<String>>? = null
            private var topK: JsonField<Long> = JsonMissing.of()
            private var totalPages: JsonField<Long> = JsonMissing.of()
            private var totalResults: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                collectionSlug = meta.collectionSlug
                pageNumber = meta.pageNumber
                pageSize = meta.pageSize
                retrievalType = meta.retrievalType
                searchedSources = meta.searchedSources.map { it.toMutableList() }
                topK = meta.topK
                totalPages = meta.totalPages
                totalResults = meta.totalResults
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun collectionSlug(collectionSlug: String) =
                collectionSlug(JsonField.of(collectionSlug))

            /**
             * Sets [Builder.collectionSlug] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectionSlug] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun collectionSlug(collectionSlug: JsonField<String>) = apply {
                this.collectionSlug = collectionSlug
            }

            fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

            /**
             * Sets [Builder.pageNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageNumber] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageNumber(pageNumber: JsonField<Long>) = apply { this.pageNumber = pageNumber }

            fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            fun retrievalType(retrievalType: String) = retrievalType(JsonField.of(retrievalType))

            /**
             * Sets [Builder.retrievalType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retrievalType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retrievalType(retrievalType: JsonField<String>) = apply {
                this.retrievalType = retrievalType
            }

            fun searchedSources(searchedSources: List<String>) =
                searchedSources(JsonField.of(searchedSources))

            /**
             * Sets [Builder.searchedSources] to an arbitrary JSON value.
             *
             * You should usually call [Builder.searchedSources] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun searchedSources(searchedSources: JsonField<List<String>>) = apply {
                this.searchedSources = searchedSources.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [searchedSources].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSearchedSource(searchedSource: String) = apply {
                searchedSources =
                    (searchedSources ?: JsonField.of(mutableListOf())).also {
                        checkKnown("searchedSources", it).add(searchedSource)
                    }
            }

            fun topK(topK: Long) = topK(JsonField.of(topK))

            /**
             * Sets [Builder.topK] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topK] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

            fun totalPages(totalPages: Long) = totalPages(JsonField.of(totalPages))

            /**
             * Sets [Builder.totalPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalPages] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalPages(totalPages: JsonField<Long>) = apply { this.totalPages = totalPages }

            fun totalResults(totalResults: Long) = totalResults(JsonField.of(totalResults))

            /**
             * Sets [Builder.totalResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalResults] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalResults(totalResults: JsonField<Long>) = apply {
                this.totalResults = totalResults
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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Meta =
                Meta(
                    collectionSlug,
                    pageNumber,
                    pageSize,
                    retrievalType,
                    (searchedSources ?: JsonMissing.of()).map { it.toImmutable() },
                    topK,
                    totalPages,
                    totalResults,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            collectionSlug()
            pageNumber()
            pageSize()
            retrievalType()
            searchedSources()
            topK()
            totalPages()
            totalResults()
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
            (if (collectionSlug.asKnown().isPresent) 1 else 0) +
                (if (pageNumber.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (retrievalType.asKnown().isPresent) 1 else 0) +
                (searchedSources.asKnown().getOrNull()?.size ?: 0) +
                (if (topK.asKnown().isPresent) 1 else 0) +
                (if (totalPages.asKnown().isPresent) 1 else 0) +
                (if (totalResults.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                collectionSlug == other.collectionSlug &&
                pageNumber == other.pageNumber &&
                pageSize == other.pageSize &&
                retrievalType == other.retrievalType &&
                searchedSources == other.searchedSources &&
                topK == other.topK &&
                totalPages == other.totalPages &&
                totalResults == other.totalResults &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                collectionSlug,
                pageNumber,
                pageSize,
                retrievalType,
                searchedSources,
                topK,
                totalPages,
                totalResults,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{collectionSlug=$collectionSlug, pageNumber=$pageNumber, pageSize=$pageSize, retrievalType=$retrievalType, searchedSources=$searchedSources, topK=$topK, totalPages=$totalPages, totalResults=$totalResults, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CollectionRetrieveDocumentsPageResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CollectionRetrieveDocumentsPageResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
