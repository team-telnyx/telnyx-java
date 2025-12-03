// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Upload a document.<br /><br />Uploaded files must be linked to a service within 30 minutes or
 * they will be automatically deleted.
 */
class DocumentUploadParams
private constructor(
    private val document: Document,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun document(): Document = document

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
         * .document()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentUploadParams]. */
    class Builder internal constructor() {

        private var document: Document? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(documentUploadParams: DocumentUploadParams) = apply {
            document = documentUploadParams.document
            additionalHeaders = documentUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentUploadParams.additionalQueryParams.toBuilder()
        }

        fun document(document: Document) = apply { this.document = document }

        /**
         * Alias for calling [document] with
         * `Document.ofDocServiceDocumentUploadUrl(docServiceDocumentUploadUrl)`.
         */
        fun document(docServiceDocumentUploadUrl: Document.DocServiceDocumentUploadUrl) =
            document(Document.ofDocServiceDocumentUploadUrl(docServiceDocumentUploadUrl))

        /**
         * Alias for calling [document] with
         * `Document.ofDocServiceDocumentUploadInline(docServiceDocumentUploadInline)`.
         */
        fun document(docServiceDocumentUploadInline: Document.DocServiceDocumentUploadInline) =
            document(Document.ofDocServiceDocumentUploadInline(docServiceDocumentUploadInline))

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
         * .document()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentUploadParams =
            DocumentUploadParams(
                checkRequired("document", document),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Document = document

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Document.Deserializer::class)
    @JsonSerialize(using = Document.Serializer::class)
    class Document
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

        fun validate(): Document = apply {
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

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitDocServiceDocumentUploadUrl(
                        docServiceDocumentUploadUrl: DocServiceDocumentUploadUrl
                    ) = docServiceDocumentUploadUrl.validity()

                    override fun visitDocServiceDocumentUploadInline(
                        docServiceDocumentUploadInline: DocServiceDocumentUploadInline
                    ) = docServiceDocumentUploadInline.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Document &&
                docServiceDocumentUploadUrl == other.docServiceDocumentUploadUrl &&
                docServiceDocumentUploadInline == other.docServiceDocumentUploadInline
        }

        override fun hashCode(): Int =
            Objects.hash(docServiceDocumentUploadUrl, docServiceDocumentUploadInline)

        override fun toString(): String =
            when {
                docServiceDocumentUploadUrl != null ->
                    "Document{docServiceDocumentUploadUrl=$docServiceDocumentUploadUrl}"
                docServiceDocumentUploadInline != null ->
                    "Document{docServiceDocumentUploadInline=$docServiceDocumentUploadInline}"
                _json != null -> "Document{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Document")
            }

        companion object {

            @JvmStatic
            fun ofDocServiceDocumentUploadUrl(
                docServiceDocumentUploadUrl: DocServiceDocumentUploadUrl
            ) = Document(docServiceDocumentUploadUrl = docServiceDocumentUploadUrl)

            @JvmStatic
            fun ofDocServiceDocumentUploadInline(
                docServiceDocumentUploadInline: DocServiceDocumentUploadInline
            ) = Document(docServiceDocumentUploadInline = docServiceDocumentUploadInline)
        }

        /**
         * An interface that defines how to map each variant of [Document] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitDocServiceDocumentUploadUrl(
                docServiceDocumentUploadUrl: DocServiceDocumentUploadUrl
            ): T

            fun visitDocServiceDocumentUploadInline(
                docServiceDocumentUploadInline: DocServiceDocumentUploadInline
            ): T

            /**
             * Maps an unknown variant of [Document] to a value of type [T].
             *
             * An instance of [Document] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Document: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Document>(Document::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Document {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<DocServiceDocumentUploadUrl>())
                                ?.let { Document(docServiceDocumentUploadUrl = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<DocServiceDocumentUploadInline>())
                                ?.let {
                                    Document(docServiceDocumentUploadInline = it, _json = json)
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Document(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Document>(Document::class) {

            override fun serialize(
                value: Document,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.docServiceDocumentUploadUrl != null ->
                        generator.writeObject(value.docServiceDocumentUploadUrl)
                    value.docServiceDocumentUploadInline != null ->
                        generator.writeObject(value.docServiceDocumentUploadInline)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Document")
                }
            }
        }

        class DocServiceDocumentUploadUrl
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val url: JsonField<String>,
            private val customerReference: JsonField<String>,
            private val filename: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("customer_reference")
                @ExcludeMissing
                customerReference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("filename")
                @ExcludeMissing
                filename: JsonField<String> = JsonMissing.of(),
            ) : this(url, customerReference, filename, mutableMapOf())

            /**
             * If the file is already hosted publicly, you can provide a URL and have the documents
             * service fetch it for you.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * Optional reference string for customer tracking.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun customerReference(): Optional<String> =
                customerReference.getOptional("customer_reference")

            /**
             * The filename of the document.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun filename(): Optional<String> = filename.getOptional("filename")

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            /**
             * Returns the raw JSON value of [customerReference].
             *
             * Unlike [customerReference], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("customer_reference")
            @ExcludeMissing
            fun _customerReference(): JsonField<String> = customerReference

            /**
             * Returns the raw JSON value of [filename].
             *
             * Unlike [filename], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

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

                private var url: JsonField<String>? = null
                private var customerReference: JsonField<String> = JsonMissing.of()
                private var filename: JsonField<String> = JsonMissing.of()
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
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                /** Optional reference string for customer tracking. */
                fun customerReference(customerReference: String) =
                    customerReference(JsonField.of(customerReference))

                /**
                 * Sets [Builder.customerReference] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerReference] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun customerReference(customerReference: JsonField<String>) = apply {
                    this.customerReference = customerReference
                }

                /** The filename of the document. */
                fun filename(filename: String) = filename(JsonField.of(filename))

                /**
                 * Sets [Builder.filename] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filename] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filename(filename: JsonField<String>) = apply { this.filename = filename }

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

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (url.asKnown().isPresent) 1 else 0) +
                    (if (customerReference.asKnown().isPresent) 1 else 0) +
                    (if (filename.asKnown().isPresent) 1 else 0)

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
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val file: JsonField<String>,
            private val customerReference: JsonField<String>,
            private val filename: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("file") @ExcludeMissing file: JsonField<String> = JsonMissing.of(),
                @JsonProperty("customer_reference")
                @ExcludeMissing
                customerReference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("filename")
                @ExcludeMissing
                filename: JsonField<String> = JsonMissing.of(),
            ) : this(file, customerReference, filename, mutableMapOf())

            /**
             * The Base64 encoded contents of the file you are uploading.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun file(): String = file.getRequired("file")

            /**
             * A customer reference string for customer look ups.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun customerReference(): Optional<String> =
                customerReference.getOptional("customer_reference")

            /**
             * The filename of the document.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun filename(): Optional<String> = filename.getOptional("filename")

            /**
             * Returns the raw JSON value of [file].
             *
             * Unlike [file], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("file") @ExcludeMissing fun _file(): JsonField<String> = file

            /**
             * Returns the raw JSON value of [customerReference].
             *
             * Unlike [customerReference], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("customer_reference")
            @ExcludeMissing
            fun _customerReference(): JsonField<String> = customerReference

            /**
             * Returns the raw JSON value of [filename].
             *
             * Unlike [filename], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

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

                private var file: JsonField<String>? = null
                private var customerReference: JsonField<String> = JsonMissing.of()
                private var filename: JsonField<String> = JsonMissing.of()
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
                fun file(file: String) = file(JsonField.of(file))

                /**
                 * Sets [Builder.file] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.file] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun file(file: JsonField<String>) = apply { this.file = file }

                /** A customer reference string for customer look ups. */
                fun customerReference(customerReference: String) =
                    customerReference(JsonField.of(customerReference))

                /**
                 * Sets [Builder.customerReference] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerReference] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun customerReference(customerReference: JsonField<String>) = apply {
                    this.customerReference = customerReference
                }

                /** The filename of the document. */
                fun filename(filename: String) = filename(JsonField.of(filename))

                /**
                 * Sets [Builder.filename] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filename] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filename(filename: JsonField<String>) = apply { this.filename = filename }

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

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (file.asKnown().isPresent) 1 else 0) +
                    (if (customerReference.asKnown().isPresent) 1 else 0) +
                    (if (filename.asKnown().isPresent) 1 else 0)

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
            document == other.document &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(document, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DocumentUploadParams{document=$document, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
