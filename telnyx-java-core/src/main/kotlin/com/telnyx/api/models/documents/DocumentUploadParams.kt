// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.documents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.telnyx.api.core.BaseSerializer
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.MultipartField
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.getOrThrow
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Upload a document.<br /><br />Uploaded files must be linked to a service within 30 minutes or
 * they will be automatically deleted.
 */
class DocumentUploadParams
private constructor(
    private val body: MultipartField<Body>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun body(): Body = body.value.getRequired("body")

    /**
     * Returns the raw multipart value of [body].
     *
     * Unlike [body], this method doesn't throw if the multipart field has an unexpected type.
     */
    @JsonProperty("body") @ExcludeMissing fun _body(): MultipartField<Body> = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentUploadParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentUploadParams]. */
    class Builder internal constructor() {

        private var body: MultipartField<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(documentUploadParams: DocumentUploadParams) = apply {
            body = documentUploadParams.body
            additionalHeaders = documentUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentUploadParams.additionalQueryParams.toBuilder()
        }

        fun body(body: Body) = body(MultipartField.of(body))

        /**
         * Sets [Builder.body] to an arbitrary multipart value.
         *
         * You should usually call [Builder.body] with a well-typed [Body] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun body(body: MultipartField<Body>) = apply { this.body = body }

        /**
         * Alias for calling [body] with
         * `Body.ofDocServiceDocumentUploadUrl(docServiceDocumentUploadUrl)`.
         */
        fun body(docServiceDocumentUploadUrl: Body.DocServiceDocumentUploadUrl) =
            body(Body.ofDocServiceDocumentUploadUrl(docServiceDocumentUploadUrl))

        /**
         * Alias for calling [body] with
         * `Body.ofDocServiceDocumentUploadInline(docServiceDocumentUploadInline)`.
         */
        fun body(docServiceDocumentUploadInline: Body.DocServiceDocumentUploadInline) =
            body(Body.ofDocServiceDocumentUploadInline(docServiceDocumentUploadInline))

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
         * Returns an immutable instance of [DocumentUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentUploadParams =
            DocumentUploadParams(
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("body" to _body()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val docServiceDocumentUploadUrl: DocServiceDocumentUploadUrl? = null,
        private val docServiceDocumentUploadInline: DocServiceDocumentUploadInline? = null,
        private val _json: JsonValue? = null,
    ) {

        fun docServiceDocumentUploadUrl(): Optional<DocServiceDocumentUploadUrl> =
            Optional.ofNullable(docServiceDocumentUploadUrl)

        fun docServiceDocumentUploadInline(): Optional<DocServiceDocumentUploadInline> =
            Optional.ofNullable(docServiceDocumentUploadInline)

        fun isDocServiceDocumentUploadUrl(): Boolean = docServiceDocumentUploadUrl != null

        fun isDocServiceDocumentUploadInline(): Boolean = docServiceDocumentUploadInline != null

        fun asDocServiceDocumentUploadUrl(): DocServiceDocumentUploadUrl =
            docServiceDocumentUploadUrl.getOrThrow("docServiceDocumentUploadUrl")

        fun asDocServiceDocumentUploadInline(): DocServiceDocumentUploadInline =
            docServiceDocumentUploadInline.getOrThrow("docServiceDocumentUploadInline")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                docServiceDocumentUploadUrl != null ->
                    visitor.visitDocServiceDocumentUploadUrl(docServiceDocumentUploadUrl)
                docServiceDocumentUploadInline != null ->
                    visitor.visitDocServiceDocumentUploadInline(docServiceDocumentUploadInline)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDocServiceDocumentUploadUrl(
                        docServiceDocumentUploadUrl: DocServiceDocumentUploadUrl
                    ) {
                        docServiceDocumentUploadUrl.validate()
                    }

                    override fun visitDocServiceDocumentUploadInline(
                        docServiceDocumentUploadInline: DocServiceDocumentUploadInline
                    ) {
                        docServiceDocumentUploadInline.validate()
                    }
                }
            )
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
                docServiceDocumentUploadUrl == other.docServiceDocumentUploadUrl &&
                docServiceDocumentUploadInline == other.docServiceDocumentUploadInline
        }

        override fun hashCode(): Int =
            Objects.hash(docServiceDocumentUploadUrl, docServiceDocumentUploadInline)

        override fun toString(): String =
            when {
                docServiceDocumentUploadUrl != null ->
                    "Body{docServiceDocumentUploadUrl=$docServiceDocumentUploadUrl}"
                docServiceDocumentUploadInline != null ->
                    "Body{docServiceDocumentUploadInline=$docServiceDocumentUploadInline}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic
            fun ofDocServiceDocumentUploadUrl(
                docServiceDocumentUploadUrl: DocServiceDocumentUploadUrl
            ) = Body(docServiceDocumentUploadUrl = docServiceDocumentUploadUrl)

            @JvmStatic
            fun ofDocServiceDocumentUploadInline(
                docServiceDocumentUploadInline: DocServiceDocumentUploadInline
            ) = Body(docServiceDocumentUploadInline = docServiceDocumentUploadInline)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitDocServiceDocumentUploadUrl(
                docServiceDocumentUploadUrl: DocServiceDocumentUploadUrl
            ): T

            fun visitDocServiceDocumentUploadInline(
                docServiceDocumentUploadInline: DocServiceDocumentUploadInline
            ): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.docServiceDocumentUploadUrl != null ->
                        generator.writeObject(value.docServiceDocumentUploadUrl)
                    value.docServiceDocumentUploadInline != null ->
                        generator.writeObject(value.docServiceDocumentUploadInline)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class DocServiceDocumentUploadUrl
        private constructor(
            private val url: MultipartField<String>,
            private val customerReference: MultipartField<String>,
            private val filename: MultipartField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            /**
             * If the file is already hosted publicly, you can provide a URL and have the documents
             * service fetch it for you.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.value.getRequired("url")

            /**
             * Optional reference string for customer tracking.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun customerReference(): Optional<String> =
                customerReference.value.getOptional("customer_reference")

            /**
             * The filename of the document.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun filename(): Optional<String> = filename.value.getOptional("filename")

            /**
             * Returns the raw multipart value of [url].
             *
             * Unlike [url], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): MultipartField<String> = url

            /**
             * Returns the raw multipart value of [customerReference].
             *
             * Unlike [customerReference], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("customer_reference")
            @ExcludeMissing
            fun _customerReference(): MultipartField<String> = customerReference

            /**
             * Returns the raw multipart value of [filename].
             *
             * Unlike [filename], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("filename")
            @ExcludeMissing
            fun _filename(): MultipartField<String> = filename

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
                 * [DocServiceDocumentUploadUrl].
                 *
                 * The following fields are required:
                 * ```java
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DocServiceDocumentUploadUrl]. */
            class Builder internal constructor() {

                private var url: MultipartField<String>? = null
                private var customerReference: MultipartField<String> = MultipartField.of(null)
                private var filename: MultipartField<String> = MultipartField.of(null)
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(docServiceDocumentUploadUrl: DocServiceDocumentUploadUrl) =
                    apply {
                        url = docServiceDocumentUploadUrl.url
                        customerReference = docServiceDocumentUploadUrl.customerReference
                        filename = docServiceDocumentUploadUrl.filename
                        additionalProperties =
                            docServiceDocumentUploadUrl.additionalProperties.toMutableMap()
                    }

                /**
                 * If the file is already hosted publicly, you can provide a URL and have the
                 * documents service fetch it for you.
                 */
                fun url(url: String) = url(MultipartField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: MultipartField<String>) = apply { this.url = url }

                /** Optional reference string for customer tracking. */
                fun customerReference(customerReference: String) =
                    customerReference(MultipartField.of(customerReference))

                /**
                 * Sets [Builder.customerReference] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.customerReference] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun customerReference(customerReference: MultipartField<String>) = apply {
                    this.customerReference = customerReference
                }

                /** The filename of the document. */
                fun filename(filename: String) = filename(MultipartField.of(filename))

                /**
                 * Sets [Builder.filename] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.filename] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filename(filename: MultipartField<String>) = apply { this.filename = filename }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DocServiceDocumentUploadUrl].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DocServiceDocumentUploadUrl =
                    DocServiceDocumentUploadUrl(
                        checkRequired("url", url),
                        customerReference,
                        filename,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DocServiceDocumentUploadUrl = apply {
                if (validated) {
                    return@apply
                }

                url()
                customerReference()
                filename()
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

                return other is DocServiceDocumentUploadUrl &&
                    url == other.url &&
                    customerReference == other.customerReference &&
                    filename == other.filename &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(url, customerReference, filename, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DocServiceDocumentUploadUrl{url=$url, customerReference=$customerReference, filename=$filename, additionalProperties=$additionalProperties}"
        }

        class DocServiceDocumentUploadInline
        private constructor(
            private val file: MultipartField<String>,
            private val customerReference: MultipartField<String>,
            private val filename: MultipartField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            /**
             * The Base64 encoded contents of the file you are uploading.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun file(): String = file.value.getRequired("file")

            /**
             * A customer reference string for customer look ups.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun customerReference(): Optional<String> =
                customerReference.value.getOptional("customer_reference")

            /**
             * The filename of the document.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun filename(): Optional<String> = filename.value.getOptional("filename")

            /**
             * Returns the raw multipart value of [file].
             *
             * Unlike [file], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<String> = file

            /**
             * Returns the raw multipart value of [customerReference].
             *
             * Unlike [customerReference], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("customer_reference")
            @ExcludeMissing
            fun _customerReference(): MultipartField<String> = customerReference

            /**
             * Returns the raw multipart value of [filename].
             *
             * Unlike [filename], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("filename")
            @ExcludeMissing
            fun _filename(): MultipartField<String> = filename

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
                 * [DocServiceDocumentUploadInline].
                 *
                 * The following fields are required:
                 * ```java
                 * .file()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DocServiceDocumentUploadInline]. */
            class Builder internal constructor() {

                private var file: MultipartField<String>? = null
                private var customerReference: MultipartField<String> = MultipartField.of(null)
                private var filename: MultipartField<String> = MultipartField.of(null)
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(docServiceDocumentUploadInline: DocServiceDocumentUploadInline) =
                    apply {
                        file = docServiceDocumentUploadInline.file
                        customerReference = docServiceDocumentUploadInline.customerReference
                        filename = docServiceDocumentUploadInline.filename
                        additionalProperties =
                            docServiceDocumentUploadInline.additionalProperties.toMutableMap()
                    }

                /** The Base64 encoded contents of the file you are uploading. */
                fun file(file: String) = file(MultipartField.of(file))

                /**
                 * Sets [Builder.file] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.file] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun file(file: MultipartField<String>) = apply { this.file = file }

                /** A customer reference string for customer look ups. */
                fun customerReference(customerReference: String) =
                    customerReference(MultipartField.of(customerReference))

                /**
                 * Sets [Builder.customerReference] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.customerReference] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun customerReference(customerReference: MultipartField<String>) = apply {
                    this.customerReference = customerReference
                }

                /** The filename of the document. */
                fun filename(filename: String) = filename(MultipartField.of(filename))

                /**
                 * Sets [Builder.filename] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.filename] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filename(filename: MultipartField<String>) = apply { this.filename = filename }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DocServiceDocumentUploadInline].
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
                fun build(): DocServiceDocumentUploadInline =
                    DocServiceDocumentUploadInline(
                        checkRequired("file", file),
                        customerReference,
                        filename,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DocServiceDocumentUploadInline = apply {
                if (validated) {
                    return@apply
                }

                file()
                customerReference()
                filename()
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

                return other is DocServiceDocumentUploadInline &&
                    file == other.file &&
                    customerReference == other.customerReference &&
                    filename == other.filename &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(file, customerReference, filename, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DocServiceDocumentUploadInline{file=$file, customerReference=$customerReference, filename=$filename, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentUploadParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DocumentUploadParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
