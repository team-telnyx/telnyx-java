// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks.imports

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.MultipartField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name

/**
 * Accepts `multipart/form-data` with a `file` field (the CSV) and an optional `block_ttl_days`
 * (integer >0, default 30). Validates:
 * - content ≤ 25 MiB, else `413`
 * - row count ≤ 250 000, else `413`
 * - header-only / all-blank / undetectable provider → `400` Returns `202` with the import record
 *   (status `pending`); an Oban worker (`EmailBlockImportWorker`, max_attempts 3) transitions
 *   `pending → processing → completed | failed`. `block_ttl_days` applies only to imported
 *   `manual_block` rows; other reasons get `expires_at: nil`. Provider is auto-detected from the
 *   CSV header (`sendgrid` / `mailgun` / `ses` / `generic`).
 */
class ImportCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The CSV file (Plug.Upload). Missing/non-upload → 400.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun file(): InputStream = body.file()

    /**
     * TTL for imported `manual_block` rows; other reasons get `expires_at: null`. Invalid/missing →
     * falls back to 30.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blockTtlDays(): Optional<Long> = body.blockTtlDays()

    /**
     * Returns the raw multipart value of [file].
     *
     * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _file(): MultipartField<InputStream> = body._file()

    /**
     * Returns the raw multipart value of [blockTtlDays].
     *
     * Unlike [blockTtlDays], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _blockTtlDays(): MultipartField<Long> = body._blockTtlDays()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ImportCreateParams].
         *
         * The following fields are required:
         * ```java
         * .file()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ImportCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(importCreateParams: ImportCreateParams) = apply {
            body = importCreateParams.body.toBuilder()
            additionalHeaders = importCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = importCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [file]
         * - [blockTtlDays]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The CSV file (Plug.Upload). Missing/non-upload → 400. */
        fun file(file: InputStream) = apply { body.file(file) }

        /**
         * Sets [Builder.file] to an arbitrary multipart value.
         *
         * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun file(file: MultipartField<InputStream>) = apply { body.file(file) }

        /** The CSV file (Plug.Upload). Missing/non-upload → 400. */
        fun file(file: ByteArray) = apply { body.file(file) }

        /** The CSV file (Plug.Upload). Missing/non-upload → 400. */
        fun file(path: Path) = apply { body.file(path) }

        /**
         * TTL for imported `manual_block` rows; other reasons get `expires_at: null`.
         * Invalid/missing → falls back to 30.
         */
        fun blockTtlDays(blockTtlDays: Long) = apply { body.blockTtlDays(blockTtlDays) }

        /**
         * Sets [Builder.blockTtlDays] to an arbitrary multipart value.
         *
         * You should usually call [Builder.blockTtlDays] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun blockTtlDays(blockTtlDays: MultipartField<Long>) = apply {
            body.blockTtlDays(blockTtlDays)
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

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [ImportCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .file()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ImportCreateParams =
            ImportCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("file" to _file(), "block_ttl_days" to _blockTtlDays()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val file: MultipartField<InputStream>,
        private val blockTtlDays: MultipartField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * The CSV file (Plug.Upload). Missing/non-upload → 400.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun file(): InputStream = file.value.getRequired("file")

        /**
         * TTL for imported `manual_block` rows; other reasons get `expires_at: null`.
         * Invalid/missing → falls back to 30.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun blockTtlDays(): Optional<Long> = blockTtlDays.value.getOptional("block_ttl_days")

        /**
         * Returns the raw multipart value of [file].
         *
         * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

        /**
         * Returns the raw multipart value of [blockTtlDays].
         *
         * Unlike [blockTtlDays], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("block_ttl_days")
        @ExcludeMissing
        fun _blockTtlDays(): MultipartField<Long> = blockTtlDays

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
             * .file()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var file: MultipartField<InputStream>? = null
            private var blockTtlDays: MultipartField<Long> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                file = body.file
                blockTtlDays = body.blockTtlDays
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The CSV file (Plug.Upload). Missing/non-upload → 400. */
            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary multipart value.
             *
             * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            /** The CSV file (Plug.Upload). Missing/non-upload → 400. */
            fun file(file: ByteArray) = file(file.inputStream())

            /** The CSV file (Plug.Upload). Missing/non-upload → 400. */
            fun file(path: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /**
             * TTL for imported `manual_block` rows; other reasons get `expires_at: null`.
             * Invalid/missing → falls back to 30.
             */
            fun blockTtlDays(blockTtlDays: Long) = blockTtlDays(MultipartField.of(blockTtlDays))

            /**
             * Sets [Builder.blockTtlDays] to an arbitrary multipart value.
             *
             * You should usually call [Builder.blockTtlDays] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blockTtlDays(blockTtlDays: MultipartField<Long>) = apply {
                this.blockTtlDays = blockTtlDays
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
             *
             * The following fields are required:
             * ```java
             * .file()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("file", file), blockTtlDays, additionalProperties.toMutableMap())
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            file()
            blockTtlDays()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                file == other.file &&
                blockTtlDays == other.blockTtlDays &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(file, blockTtlDays, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{file=$file, blockTtlDays=$blockTtlDays, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ImportCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ImportCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
