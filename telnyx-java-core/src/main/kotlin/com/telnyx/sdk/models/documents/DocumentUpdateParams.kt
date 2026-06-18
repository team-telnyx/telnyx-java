// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documents

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a document. */
class DocumentUpdateParams
private constructor(
    private val documentId: String?,
    private val docServiceDocument: DocServiceDocument,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun documentId(): Optional<String> = Optional.ofNullable(documentId)

    fun docServiceDocument(): DocServiceDocument = docServiceDocument

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        docServiceDocument._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .docServiceDocument()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentUpdateParams]. */
    class Builder internal constructor() {

        private var documentId: String? = null
        private var docServiceDocument: DocServiceDocument? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(documentUpdateParams: DocumentUpdateParams) = apply {
            documentId = documentUpdateParams.documentId
            docServiceDocument = documentUpdateParams.docServiceDocument
            additionalHeaders = documentUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentUpdateParams.additionalQueryParams.toBuilder()
        }

        fun documentId(documentId: String?) = apply { this.documentId = documentId }

        /** Alias for calling [Builder.documentId] with `documentId.orElse(null)`. */
        fun documentId(documentId: Optional<String>) = documentId(documentId.getOrNull())

        fun docServiceDocument(docServiceDocument: DocServiceDocument) = apply {
            this.docServiceDocument = docServiceDocument
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
         * Returns an immutable instance of [DocumentUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .docServiceDocument()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentUpdateParams =
            DocumentUpdateParams(
                documentId,
                checkRequired("docServiceDocument", docServiceDocument),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): DocServiceDocument = docServiceDocument

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> documentId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentUpdateParams &&
            documentId == other.documentId &&
            docServiceDocument == other.docServiceDocument &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(documentId, docServiceDocument, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DocumentUpdateParams{documentId=$documentId, docServiceDocument=$docServiceDocument, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
