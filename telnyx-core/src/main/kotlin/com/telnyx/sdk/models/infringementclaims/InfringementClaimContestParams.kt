// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.infringementclaims

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.dir.Document
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Submit a written response and supporting documents disputing the claim. The first call moves the
 * claim from `pending` to `contested`; subsequent calls append supplementary evidence without
 * changing status. The `documents[]` you attach are aggregated across rounds in the claim's
 * `contest_documents` field.
 *
 * Only `pending` and `contested` claims accept new evidence. A `resolved` claim returns `400`.
 *
 * Failure modes:
 * - `400` - the claim is `resolved` (terminal); cannot be contested further.
 * - `404` - the claim does not exist or is not against a DIR you own.
 * - `422` - `contest_notes` is too short (< 10 chars), too long (> 2000 chars), `documents` is > 20
 *   entries, or a `document_id` is duplicated within the same submission.
 */
class InfringementClaimContestParams
private constructor(
    private val claimId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun claimId(): Optional<String> = Optional.ofNullable(claimId)

    /**
     * Customer's response to the claim. 10–2000 characters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contestNotes(): String = body.contestNotes()

    /**
     * Up to 20 supporting documents per submission. `document_id` must be unique within this
     * submission. Documents are aggregated into the claim's `contest_documents` across all
     * submissions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documents(): Optional<List<Document>> = body.documents()

    /**
     * Returns the raw JSON value of [contestNotes].
     *
     * Unlike [contestNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contestNotes(): JsonField<String> = body._contestNotes()

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _documents(): JsonField<List<Document>> = body._documents()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InfringementClaimContestParams].
         *
         * The following fields are required:
         * ```java
         * .contestNotes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InfringementClaimContestParams]. */
    class Builder internal constructor() {

        private var claimId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(infringementClaimContestParams: InfringementClaimContestParams) = apply {
            claimId = infringementClaimContestParams.claimId
            body = infringementClaimContestParams.body.toBuilder()
            additionalHeaders = infringementClaimContestParams.additionalHeaders.toBuilder()
            additionalQueryParams = infringementClaimContestParams.additionalQueryParams.toBuilder()
        }

        fun claimId(claimId: String?) = apply { this.claimId = claimId }

        /** Alias for calling [Builder.claimId] with `claimId.orElse(null)`. */
        fun claimId(claimId: Optional<String>) = claimId(claimId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [contestNotes]
         * - [documents]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Customer's response to the claim. 10–2000 characters. */
        fun contestNotes(contestNotes: String) = apply { body.contestNotes(contestNotes) }

        /**
         * Sets [Builder.contestNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contestNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contestNotes(contestNotes: JsonField<String>) = apply {
            body.contestNotes(contestNotes)
        }

        /**
         * Up to 20 supporting documents per submission. `document_id` must be unique within this
         * submission. Documents are aggregated into the claim's `contest_documents` across all
         * submissions.
         */
        fun documents(documents: List<Document>) = apply { body.documents(documents) }

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed `List<Document>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documents(documents: JsonField<List<Document>>) = apply { body.documents(documents) }

        /**
         * Adds a single [Document] to [documents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocument(document: Document) = apply { body.addDocument(document) }

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
         * Returns an immutable instance of [InfringementClaimContestParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contestNotes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InfringementClaimContestParams =
            InfringementClaimContestParams(
                claimId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> claimId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contestNotes: JsonField<String>,
        private val documents: JsonField<List<Document>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contest_notes")
            @ExcludeMissing
            contestNotes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("documents")
            @ExcludeMissing
            documents: JsonField<List<Document>> = JsonMissing.of(),
        ) : this(contestNotes, documents, mutableMapOf())

        /**
         * Customer's response to the claim. 10–2000 characters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contestNotes(): String = contestNotes.getRequired("contest_notes")

        /**
         * Up to 20 supporting documents per submission. `document_id` must be unique within this
         * submission. Documents are aggregated into the claim's `contest_documents` across all
         * submissions.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun documents(): Optional<List<Document>> = documents.getOptional("documents")

        /**
         * Returns the raw JSON value of [contestNotes].
         *
         * Unlike [contestNotes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contest_notes")
        @ExcludeMissing
        fun _contestNotes(): JsonField<String> = contestNotes

        /**
         * Returns the raw JSON value of [documents].
         *
         * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("documents")
        @ExcludeMissing
        fun _documents(): JsonField<List<Document>> = documents

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
             * .contestNotes()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var contestNotes: JsonField<String>? = null
            private var documents: JsonField<MutableList<Document>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                contestNotes = body.contestNotes
                documents = body.documents.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Customer's response to the claim. 10–2000 characters. */
            fun contestNotes(contestNotes: String) = contestNotes(JsonField.of(contestNotes))

            /**
             * Sets [Builder.contestNotes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contestNotes] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contestNotes(contestNotes: JsonField<String>) = apply {
                this.contestNotes = contestNotes
            }

            /**
             * Up to 20 supporting documents per submission. `document_id` must be unique within
             * this submission. Documents are aggregated into the claim's `contest_documents` across
             * all submissions.
             */
            fun documents(documents: List<Document>) = documents(JsonField.of(documents))

            /**
             * Sets [Builder.documents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documents] with a well-typed `List<Document>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documents(documents: JsonField<List<Document>>) = apply {
                this.documents = documents.map { it.toMutableList() }
            }

            /**
             * Adds a single [Document] to [documents].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDocument(document: Document) = apply {
                documents =
                    (documents ?: JsonField.of(mutableListOf())).also {
                        checkKnown("documents", it).add(document)
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
             *
             * The following fields are required:
             * ```java
             * .contestNotes()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("contestNotes", contestNotes),
                    (documents ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            contestNotes()
            documents().ifPresent { it.forEach { it.validate() } }
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
            (if (contestNotes.asKnown().isPresent) 1 else 0) +
                (documents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                contestNotes == other.contestNotes &&
                documents == other.documents &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(contestNotes, documents, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{contestNotes=$contestNotes, documents=$documents, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InfringementClaimContestParams &&
            claimId == other.claimId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(claimId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InfringementClaimContestParams{claimId=$claimId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
