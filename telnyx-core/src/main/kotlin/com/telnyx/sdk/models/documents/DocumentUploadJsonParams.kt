// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
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
class DocumentUploadJsonParams
private constructor(
    private val document: Document,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A customer reference string for customer look ups.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = document.customerReference()

    /**
     * Alternatively, instead of the URL you can provide the Base64 encoded contents of the file you
     * are uploading.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun file(): Optional<String> = document.file()

    /**
     * The filename of the document.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filename(): Optional<String> = document.filename()

    /**
     * If the file is already hosted publicly, you can provide a URL and have the documents service
     * fetch it for you.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = document.url()

    /**
     * Returns the raw JSON value of [customerReference].
     *
     * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customerReference(): JsonField<String> = document._customerReference()

    /**
     * Returns the raw JSON value of [file].
     *
     * Unlike [file], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _file(): JsonField<String> = document._file()

    /**
     * Returns the raw JSON value of [filename].
     *
     * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filename(): JsonField<String> = document._filename()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = document._url()

    fun _additionalBodyProperties(): Map<String, JsonValue> = document._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DocumentUploadJsonParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DocumentUploadJsonParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentUploadJsonParams]. */
    class Builder internal constructor() {

        private var document: Document.Builder = Document.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(documentUploadJsonParams: DocumentUploadJsonParams) = apply {
            document = documentUploadJsonParams.document.toBuilder()
            additionalHeaders = documentUploadJsonParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentUploadJsonParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customerReference]
         * - [file]
         * - [filename]
         * - [url]
         */
        fun document(document: Document) = apply { this.document = document.toBuilder() }

        /** A customer reference string for customer look ups. */
        fun customerReference(customerReference: String) = apply {
            document.customerReference(customerReference)
        }

        /**
         * Sets [Builder.customerReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerReference(customerReference: JsonField<String>) = apply {
            document.customerReference(customerReference)
        }

        /**
         * Alternatively, instead of the URL you can provide the Base64 encoded contents of the file
         * you are uploading.
         */
        fun file(file: String) = apply { document.file(file) }

        /**
         * Sets [Builder.file] to an arbitrary JSON value.
         *
         * You should usually call [Builder.file] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun file(file: JsonField<String>) = apply { document.file(file) }

        /** The filename of the document. */
        fun filename(filename: String) = apply { document.filename(filename) }

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { document.filename(filename) }

        /**
         * If the file is already hosted publicly, you can provide a URL and have the documents
         * service fetch it for you.
         */
        fun url(url: String) = apply { document.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { document.url(url) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            document.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            document.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                document.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            document.removeAdditionalProperty(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            document.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [DocumentUploadJsonParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocumentUploadJsonParams =
            DocumentUploadJsonParams(
                document.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Document = document

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Document
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customerReference: JsonField<String>,
        private val file: JsonField<String>,
        private val filename: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("file") @ExcludeMissing file: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(customerReference, file, filename, url, mutableMapOf())

        /**
         * A customer reference string for customer look ups.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * Alternatively, instead of the URL you can provide the Base64 encoded contents of the file
         * you are uploading.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun file(): Optional<String> = file.getOptional("file")

        /**
         * The filename of the document.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filename(): Optional<String> = filename.getOptional("filename")

        /**
         * If the file is already hosted publicly, you can provide a URL and have the documents
         * service fetch it for you.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [customerReference].
         *
         * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_reference")
        @ExcludeMissing
        fun _customerReference(): JsonField<String> = customerReference

        /**
         * Returns the raw JSON value of [file].
         *
         * Unlike [file], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): JsonField<String> = file

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Document]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Document]. */
        class Builder internal constructor() {

            private var customerReference: JsonField<String> = JsonMissing.of()
            private var file: JsonField<String> = JsonMissing.of()
            private var filename: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(document: Document) = apply {
                customerReference = document.customerReference
                file = document.file
                filename = document.filename
                url = document.url
                additionalProperties = document.additionalProperties.toMutableMap()
            }

            /** A customer reference string for customer look ups. */
            fun customerReference(customerReference: String) =
                customerReference(JsonField.of(customerReference))

            /**
             * Sets [Builder.customerReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerReference] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerReference(customerReference: JsonField<String>) = apply {
                this.customerReference = customerReference
            }

            /**
             * Alternatively, instead of the URL you can provide the Base64 encoded contents of the
             * file you are uploading.
             */
            fun file(file: String) = file(JsonField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary JSON value.
             *
             * You should usually call [Builder.file] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun file(file: JsonField<String>) = apply { this.file = file }

            /** The filename of the document. */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /**
             * If the file is already hosted publicly, you can provide a URL and have the documents
             * service fetch it for you.
             */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Document].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Document =
                Document(
                    customerReference,
                    file,
                    filename,
                    url,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Document = apply {
            if (validated) {
                return@apply
            }

            customerReference()
            file()
            filename()
            url()
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
            (if (customerReference.asKnown().isPresent) 1 else 0) +
                (if (file.asKnown().isPresent) 1 else 0) +
                (if (filename.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Document &&
                customerReference == other.customerReference &&
                file == other.file &&
                filename == other.filename &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(customerReference, file, filename, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Document{customerReference=$customerReference, file=$file, filename=$filename, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentUploadJsonParams &&
            document == other.document &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(document, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DocumentUploadJsonParams{document=$document, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
