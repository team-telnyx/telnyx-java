// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.clusters

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Starts a background task to compute how the data in an
 * [embedded storage bucket](https://developers.telnyx.com/api/inference/inference-embedding/post-embedding)
 * is clustered. This helps identify common themes and patterns in the data.
 */
class ClusterComputeParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The embedded storage bucket to compute the clusters from. The bucket must already be
     * [embedded](https://developers.telnyx.com/api/inference/inference-embedding/post-embedding).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucket(): String = body.bucket()

    /**
     * Array of files to filter which are included.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun files(): Optional<List<String>> = body.files()

    /**
     * Smallest number of related text chunks to qualify as a cluster. Top-level clusters should be
     * thought of as identifying broad themes in your data.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minClusterSize(): Optional<Long> = body.minClusterSize()

    /**
     * Smallest number of related text chunks to qualify as a sub-cluster. Sub-clusters should be
     * thought of as identifying more specific topics within a broader theme.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minSubclusterSize(): Optional<Long> = body.minSubclusterSize()

    /**
     * Prefix to filter whcih files in the buckets are included.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prefix(): Optional<String> = body.prefix()

    /**
     * Returns the raw JSON value of [bucket].
     *
     * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bucket(): JsonField<String> = body._bucket()

    /**
     * Returns the raw JSON value of [files].
     *
     * Unlike [files], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _files(): JsonField<List<String>> = body._files()

    /**
     * Returns the raw JSON value of [minClusterSize].
     *
     * Unlike [minClusterSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _minClusterSize(): JsonField<Long> = body._minClusterSize()

    /**
     * Returns the raw JSON value of [minSubclusterSize].
     *
     * Unlike [minSubclusterSize], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _minSubclusterSize(): JsonField<Long> = body._minSubclusterSize()

    /**
     * Returns the raw JSON value of [prefix].
     *
     * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _prefix(): JsonField<String> = body._prefix()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ClusterComputeParams].
         *
         * The following fields are required:
         * ```java
         * .bucket()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClusterComputeParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(clusterComputeParams: ClusterComputeParams) = apply {
            body = clusterComputeParams.body.toBuilder()
            additionalHeaders = clusterComputeParams.additionalHeaders.toBuilder()
            additionalQueryParams = clusterComputeParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bucket]
         * - [files]
         * - [minClusterSize]
         * - [minSubclusterSize]
         * - [prefix]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The embedded storage bucket to compute the clusters from. The bucket must already be
         * [embedded](https://developers.telnyx.com/api/inference/inference-embedding/post-embedding).
         */
        fun bucket(bucket: String) = apply { body.bucket(bucket) }

        /**
         * Sets [Builder.bucket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucket] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bucket(bucket: JsonField<String>) = apply { body.bucket(bucket) }

        /** Array of files to filter which are included. */
        fun files(files: List<String>) = apply { body.files(files) }

        /**
         * Sets [Builder.files] to an arbitrary JSON value.
         *
         * You should usually call [Builder.files] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun files(files: JsonField<List<String>>) = apply { body.files(files) }

        /**
         * Adds a single [String] to [files].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFile(file: String) = apply { body.addFile(file) }

        /**
         * Smallest number of related text chunks to qualify as a cluster. Top-level clusters should
         * be thought of as identifying broad themes in your data.
         */
        fun minClusterSize(minClusterSize: Long) = apply { body.minClusterSize(minClusterSize) }

        /**
         * Sets [Builder.minClusterSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minClusterSize] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minClusterSize(minClusterSize: JsonField<Long>) = apply {
            body.minClusterSize(minClusterSize)
        }

        /**
         * Smallest number of related text chunks to qualify as a sub-cluster. Sub-clusters should
         * be thought of as identifying more specific topics within a broader theme.
         */
        fun minSubclusterSize(minSubclusterSize: Long) = apply {
            body.minSubclusterSize(minSubclusterSize)
        }

        /**
         * Sets [Builder.minSubclusterSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minSubclusterSize] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minSubclusterSize(minSubclusterSize: JsonField<Long>) = apply {
            body.minSubclusterSize(minSubclusterSize)
        }

        /** Prefix to filter whcih files in the buckets are included. */
        fun prefix(prefix: String) = apply { body.prefix(prefix) }

        /**
         * Sets [Builder.prefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prefix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prefix(prefix: JsonField<String>) = apply { body.prefix(prefix) }

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
         * Returns an immutable instance of [ClusterComputeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bucket()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClusterComputeParams =
            ClusterComputeParams(
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
        private val bucket: JsonField<String>,
        private val files: JsonField<List<String>>,
        private val minClusterSize: JsonField<Long>,
        private val minSubclusterSize: JsonField<Long>,
        private val prefix: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bucket") @ExcludeMissing bucket: JsonField<String> = JsonMissing.of(),
            @JsonProperty("files")
            @ExcludeMissing
            files: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("min_cluster_size")
            @ExcludeMissing
            minClusterSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("min_subcluster_size")
            @ExcludeMissing
            minSubclusterSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
        ) : this(bucket, files, minClusterSize, minSubclusterSize, prefix, mutableMapOf())

        /**
         * The embedded storage bucket to compute the clusters from. The bucket must already be
         * [embedded](https://developers.telnyx.com/api/inference/inference-embedding/post-embedding).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bucket(): String = bucket.getRequired("bucket")

        /**
         * Array of files to filter which are included.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun files(): Optional<List<String>> = files.getOptional("files")

        /**
         * Smallest number of related text chunks to qualify as a cluster. Top-level clusters should
         * be thought of as identifying broad themes in your data.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minClusterSize(): Optional<Long> = minClusterSize.getOptional("min_cluster_size")

        /**
         * Smallest number of related text chunks to qualify as a sub-cluster. Sub-clusters should
         * be thought of as identifying more specific topics within a broader theme.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minSubclusterSize(): Optional<Long> =
            minSubclusterSize.getOptional("min_subcluster_size")

        /**
         * Prefix to filter whcih files in the buckets are included.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prefix(): Optional<String> = prefix.getOptional("prefix")

        /**
         * Returns the raw JSON value of [bucket].
         *
         * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

        /**
         * Returns the raw JSON value of [files].
         *
         * Unlike [files], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("files") @ExcludeMissing fun _files(): JsonField<List<String>> = files

        /**
         * Returns the raw JSON value of [minClusterSize].
         *
         * Unlike [minClusterSize], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("min_cluster_size")
        @ExcludeMissing
        fun _minClusterSize(): JsonField<Long> = minClusterSize

        /**
         * Returns the raw JSON value of [minSubclusterSize].
         *
         * Unlike [minSubclusterSize], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("min_subcluster_size")
        @ExcludeMissing
        fun _minSubclusterSize(): JsonField<Long> = minSubclusterSize

        /**
         * Returns the raw JSON value of [prefix].
         *
         * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

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
             * .bucket()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var bucket: JsonField<String>? = null
            private var files: JsonField<MutableList<String>>? = null
            private var minClusterSize: JsonField<Long> = JsonMissing.of()
            private var minSubclusterSize: JsonField<Long> = JsonMissing.of()
            private var prefix: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                bucket = body.bucket
                files = body.files.map { it.toMutableList() }
                minClusterSize = body.minClusterSize
                minSubclusterSize = body.minSubclusterSize
                prefix = body.prefix
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The embedded storage bucket to compute the clusters from. The bucket must already be
             * [embedded](https://developers.telnyx.com/api/inference/inference-embedding/post-embedding).
             */
            fun bucket(bucket: String) = bucket(JsonField.of(bucket))

            /**
             * Sets [Builder.bucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bucket] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

            /** Array of files to filter which are included. */
            fun files(files: List<String>) = files(JsonField.of(files))

            /**
             * Sets [Builder.files] to an arbitrary JSON value.
             *
             * You should usually call [Builder.files] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun files(files: JsonField<List<String>>) = apply {
                this.files = files.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [files].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFile(file: String) = apply {
                files =
                    (files ?: JsonField.of(mutableListOf())).also {
                        checkKnown("files", it).add(file)
                    }
            }

            /**
             * Smallest number of related text chunks to qualify as a cluster. Top-level clusters
             * should be thought of as identifying broad themes in your data.
             */
            fun minClusterSize(minClusterSize: Long) = minClusterSize(JsonField.of(minClusterSize))

            /**
             * Sets [Builder.minClusterSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minClusterSize] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minClusterSize(minClusterSize: JsonField<Long>) = apply {
                this.minClusterSize = minClusterSize
            }

            /**
             * Smallest number of related text chunks to qualify as a sub-cluster. Sub-clusters
             * should be thought of as identifying more specific topics within a broader theme.
             */
            fun minSubclusterSize(minSubclusterSize: Long) =
                minSubclusterSize(JsonField.of(minSubclusterSize))

            /**
             * Sets [Builder.minSubclusterSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minSubclusterSize] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minSubclusterSize(minSubclusterSize: JsonField<Long>) = apply {
                this.minSubclusterSize = minSubclusterSize
            }

            /** Prefix to filter whcih files in the buckets are included. */
            fun prefix(prefix: String) = prefix(JsonField.of(prefix))

            /**
             * Sets [Builder.prefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prefix] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

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
             * .bucket()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("bucket", bucket),
                    (files ?: JsonMissing.of()).map { it.toImmutable() },
                    minClusterSize,
                    minSubclusterSize,
                    prefix,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            bucket()
            files()
            minClusterSize()
            minSubclusterSize()
            prefix()
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
            (if (bucket.asKnown().isPresent) 1 else 0) +
                (files.asKnown().getOrNull()?.size ?: 0) +
                (if (minClusterSize.asKnown().isPresent) 1 else 0) +
                (if (minSubclusterSize.asKnown().isPresent) 1 else 0) +
                (if (prefix.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bucket == other.bucket &&
                files == other.files &&
                minClusterSize == other.minClusterSize &&
                minSubclusterSize == other.minSubclusterSize &&
                prefix == other.prefix &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                bucket,
                files,
                minClusterSize,
                minSubclusterSize,
                prefix,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bucket=$bucket, files=$files, minClusterSize=$minClusterSize, minSubclusterSize=$minSubclusterSize, prefix=$prefix, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClusterComputeParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ClusterComputeParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
