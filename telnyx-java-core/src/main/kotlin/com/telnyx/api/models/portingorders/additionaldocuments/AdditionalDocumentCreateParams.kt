// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.additionaldocuments

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates a list of additional documents for a porting order. */
class AdditionalDocumentCreateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalDocuments(): Optional<List<AdditionalDocument>> = body.additionalDocuments()

    /**
     * Returns the raw JSON value of [additionalDocuments].
     *
     * Unlike [additionalDocuments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _additionalDocuments(): JsonField<List<AdditionalDocument>> = body._additionalDocuments()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AdditionalDocumentCreateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [AdditionalDocumentCreateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AdditionalDocumentCreateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(additionalDocumentCreateParams: AdditionalDocumentCreateParams) = apply {
            id = additionalDocumentCreateParams.id
            body = additionalDocumentCreateParams.body.toBuilder()
            additionalHeaders = additionalDocumentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = additionalDocumentCreateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [additionalDocuments]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun additionalDocuments(additionalDocuments: List<AdditionalDocument>) = apply {
            body.additionalDocuments(additionalDocuments)
        }

        /**
         * Sets [Builder.additionalDocuments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalDocuments] with a well-typed
         * `List<AdditionalDocument>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun additionalDocuments(additionalDocuments: JsonField<List<AdditionalDocument>>) = apply {
            body.additionalDocuments(additionalDocuments)
        }

        /**
         * Adds a single [AdditionalDocument] to [additionalDocuments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdditionalDocument(additionalDocument: AdditionalDocument) = apply {
            body.addAdditionalDocument(additionalDocument)
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
         * Returns an immutable instance of [AdditionalDocumentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AdditionalDocumentCreateParams =
            AdditionalDocumentCreateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val additionalDocuments: JsonField<List<AdditionalDocument>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("additional_documents")
            @ExcludeMissing
            additionalDocuments: JsonField<List<AdditionalDocument>> = JsonMissing.of()
        ) : this(additionalDocuments, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun additionalDocuments(): Optional<List<AdditionalDocument>> =
            additionalDocuments.getOptional("additional_documents")

        /**
         * Returns the raw JSON value of [additionalDocuments].
         *
         * Unlike [additionalDocuments], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("additional_documents")
        @ExcludeMissing
        fun _additionalDocuments(): JsonField<List<AdditionalDocument>> = additionalDocuments

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var additionalDocuments: JsonField<MutableList<AdditionalDocument>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                additionalDocuments = body.additionalDocuments.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun additionalDocuments(additionalDocuments: List<AdditionalDocument>) =
                additionalDocuments(JsonField.of(additionalDocuments))

            /**
             * Sets [Builder.additionalDocuments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.additionalDocuments] with a well-typed
             * `List<AdditionalDocument>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun additionalDocuments(additionalDocuments: JsonField<List<AdditionalDocument>>) =
                apply {
                    this.additionalDocuments = additionalDocuments.map { it.toMutableList() }
                }

            /**
             * Adds a single [AdditionalDocument] to [additionalDocuments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAdditionalDocument(additionalDocument: AdditionalDocument) = apply {
                additionalDocuments =
                    (additionalDocuments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("additionalDocuments", it).add(additionalDocument)
                    }
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
             */
            fun build(): Body =
                Body(
                    (additionalDocuments ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            additionalDocuments().ifPresent { it.forEach { it.validate() } }
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
            (additionalDocuments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                additionalDocuments == other.additionalDocuments &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(additionalDocuments, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{additionalDocuments=$additionalDocuments, additionalProperties=$additionalProperties}"
    }

    class AdditionalDocument
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val documentId: JsonField<String>,
        private val documentType: JsonField<DocumentType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("document_id")
            @ExcludeMissing
            documentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("document_type")
            @ExcludeMissing
            documentType: JsonField<DocumentType> = JsonMissing.of(),
        ) : this(documentId, documentType, mutableMapOf())

        /**
         * The document identification
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun documentId(): Optional<String> = documentId.getOptional("document_id")

        /**
         * The type of document being created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun documentType(): Optional<DocumentType> = documentType.getOptional("document_type")

        /**
         * Returns the raw JSON value of [documentId].
         *
         * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("document_id")
        @ExcludeMissing
        fun _documentId(): JsonField<String> = documentId

        /**
         * Returns the raw JSON value of [documentType].
         *
         * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun _documentType(): JsonField<DocumentType> = documentType

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

            /** Returns a mutable builder for constructing an instance of [AdditionalDocument]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AdditionalDocument]. */
        class Builder internal constructor() {

            private var documentId: JsonField<String> = JsonMissing.of()
            private var documentType: JsonField<DocumentType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(additionalDocument: AdditionalDocument) = apply {
                documentId = additionalDocument.documentId
                documentType = additionalDocument.documentType
                additionalProperties = additionalDocument.additionalProperties.toMutableMap()
            }

            /** The document identification */
            fun documentId(documentId: String) = documentId(JsonField.of(documentId))

            /**
             * Sets [Builder.documentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

            /** The type of document being created. */
            fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

            /**
             * Sets [Builder.documentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentType(documentType: JsonField<DocumentType>) = apply {
                this.documentType = documentType
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
             * Returns an immutable instance of [AdditionalDocument].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AdditionalDocument =
                AdditionalDocument(documentId, documentType, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): AdditionalDocument = apply {
            if (validated) {
                return@apply
            }

            documentId()
            documentType().ifPresent { it.validate() }
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
            (if (documentId.asKnown().isPresent) 1 else 0) +
                (documentType.asKnown().getOrNull()?.validity() ?: 0)

        /** The type of document being created. */
        class DocumentType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val LOA = of("loa")

                @JvmField val INVOICE = of("invoice")

                @JvmField val CSR = of("csr")

                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = DocumentType(JsonField.of(value))
            }

            /** An enum containing [DocumentType]'s known values. */
            enum class Known {
                LOA,
                INVOICE,
                CSR,
                OTHER,
            }

            /**
             * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DocumentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOA,
                INVOICE,
                CSR,
                OTHER,
                /**
                 * An enum member indicating that [DocumentType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    LOA -> Value.LOA
                    INVOICE -> Value.INVOICE
                    CSR -> Value.CSR
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    LOA -> Known.LOA
                    INVOICE -> Known.INVOICE
                    CSR -> Known.CSR
                    OTHER -> Known.OTHER
                    else -> throw TelnyxInvalidDataException("Unknown DocumentType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): DocumentType = apply {
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

                return other is DocumentType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AdditionalDocument &&
                documentId == other.documentId &&
                documentType == other.documentType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(documentId, documentType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AdditionalDocument{documentId=$documentId, documentType=$documentType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AdditionalDocumentCreateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AdditionalDocumentCreateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
