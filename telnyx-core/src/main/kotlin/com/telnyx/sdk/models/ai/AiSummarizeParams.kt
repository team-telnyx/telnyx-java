// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

/**
 * Generate a summary of a file's contents.
 *
 * Supports the following text formats:
 * - PDF, HTML, txt, json, csv
 *
 * Supports the following media formats (billed for both the transcription and summary):
 * - flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm
 * - Up to 100 MB
 */
class AiSummarizeParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The name of the bucket that contains the file to be summarized.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucket(): String = body.bucket()

    /**
     * The name of the file to be summarized.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filename(): String = body.filename()

    /**
     * A system prompt to guide the summary generation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun systemPrompt(): Optional<String> = body.systemPrompt()

    /**
     * Returns the raw JSON value of [bucket].
     *
     * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bucket(): JsonField<String> = body._bucket()

    /**
     * Returns the raw JSON value of [filename].
     *
     * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filename(): JsonField<String> = body._filename()

    /**
     * Returns the raw JSON value of [systemPrompt].
     *
     * Unlike [systemPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _systemPrompt(): JsonField<String> = body._systemPrompt()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AiSummarizeParams].
         *
         * The following fields are required:
         * ```java
         * .bucket()
         * .filename()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AiSummarizeParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(aiSummarizeParams: AiSummarizeParams) = apply {
            body = aiSummarizeParams.body.toBuilder()
            additionalHeaders = aiSummarizeParams.additionalHeaders.toBuilder()
            additionalQueryParams = aiSummarizeParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bucket]
         * - [filename]
         * - [systemPrompt]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The name of the bucket that contains the file to be summarized. */
        fun bucket(bucket: String) = apply { body.bucket(bucket) }

        /**
         * Sets [Builder.bucket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucket] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bucket(bucket: JsonField<String>) = apply { body.bucket(bucket) }

        /** The name of the file to be summarized. */
        fun filename(filename: String) = apply { body.filename(filename) }

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { body.filename(filename) }

        /** A system prompt to guide the summary generation. */
        fun systemPrompt(systemPrompt: String) = apply { body.systemPrompt(systemPrompt) }

        /**
         * Sets [Builder.systemPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun systemPrompt(systemPrompt: JsonField<String>) = apply {
            body.systemPrompt(systemPrompt)
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
         * Returns an immutable instance of [AiSummarizeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bucket()
         * .filename()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AiSummarizeParams =
            AiSummarizeParams(
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
        private val filename: JsonField<String>,
        private val systemPrompt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bucket") @ExcludeMissing bucket: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("system_prompt")
            @ExcludeMissing
            systemPrompt: JsonField<String> = JsonMissing.of(),
        ) : this(bucket, filename, systemPrompt, mutableMapOf())

        /**
         * The name of the bucket that contains the file to be summarized.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bucket(): String = bucket.getRequired("bucket")

        /**
         * The name of the file to be summarized.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filename(): String = filename.getRequired("filename")

        /**
         * A system prompt to guide the summary generation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun systemPrompt(): Optional<String> = systemPrompt.getOptional("system_prompt")

        /**
         * Returns the raw JSON value of [bucket].
         *
         * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [systemPrompt].
         *
         * Unlike [systemPrompt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("system_prompt")
        @ExcludeMissing
        fun _systemPrompt(): JsonField<String> = systemPrompt

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
             * .filename()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var bucket: JsonField<String>? = null
            private var filename: JsonField<String>? = null
            private var systemPrompt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                bucket = body.bucket
                filename = body.filename
                systemPrompt = body.systemPrompt
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The name of the bucket that contains the file to be summarized. */
            fun bucket(bucket: String) = bucket(JsonField.of(bucket))

            /**
             * Sets [Builder.bucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bucket] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

            /** The name of the file to be summarized. */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /** A system prompt to guide the summary generation. */
            fun systemPrompt(systemPrompt: String) = systemPrompt(JsonField.of(systemPrompt))

            /**
             * Sets [Builder.systemPrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.systemPrompt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun systemPrompt(systemPrompt: JsonField<String>) = apply {
                this.systemPrompt = systemPrompt
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
             * .bucket()
             * .filename()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("bucket", bucket),
                    checkRequired("filename", filename),
                    systemPrompt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            bucket()
            filename()
            systemPrompt()
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
                (if (filename.asKnown().isPresent) 1 else 0) +
                (if (systemPrompt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bucket == other.bucket &&
                filename == other.filename &&
                systemPrompt == other.systemPrompt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(bucket, filename, systemPrompt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bucket=$bucket, filename=$filename, systemPrompt=$systemPrompt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AiSummarizeParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AiSummarizeParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
