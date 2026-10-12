// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.externalverification

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
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Request permission to add phone numbers that the enterprise owns but that are hosted with another
 * provider. Submit one or more uploaded documents proving ownership, such as a carrier invoice or
 * account statement. The request is reviewed once per enterprise. While it is `pending` or
 * `rejected` you can submit again to replace the documents; once `approved` it cannot be changed.
 */
class ExternalVerificationCreateParams
private constructor(
    private val enterpriseId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun enterpriseId(): Optional<String> = Optional.ofNullable(enterpriseId)

    /**
     * Ids of uploaded documents (Documents API) proving the enterprise owns its phone numbers
     * hosted with another provider, for example a carrier invoice or account statement.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentIds(): List<String> = body.documentIds()

    /**
     * Optional. The phone numbers hosted with another provider that the documents cover, in E.164
     * format. Shown to the reviewer to match the documents to your numbers; you can still add
     * numbers that are not listed here, and each is checked on its own.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumbers(): Optional<List<String>> = body.phoneNumbers()

    /**
     * Returns the raw JSON value of [documentIds].
     *
     * Unlike [documentIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _documentIds(): JsonField<List<String>> = body._documentIds()

    /**
     * Returns the raw JSON value of [phoneNumbers].
     *
     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phoneNumbers(): JsonField<List<String>> = body._phoneNumbers()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalVerificationCreateParams].
         *
         * The following fields are required:
         * ```java
         * .documentIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalVerificationCreateParams]. */
    class Builder internal constructor() {

        private var enterpriseId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalVerificationCreateParams: ExternalVerificationCreateParams) =
            apply {
                enterpriseId = externalVerificationCreateParams.enterpriseId
                body = externalVerificationCreateParams.body.toBuilder()
                additionalHeaders = externalVerificationCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    externalVerificationCreateParams.additionalQueryParams.toBuilder()
            }

        fun enterpriseId(enterpriseId: String?) = apply { this.enterpriseId = enterpriseId }

        /** Alias for calling [Builder.enterpriseId] with `enterpriseId.orElse(null)`. */
        fun enterpriseId(enterpriseId: Optional<String>) = enterpriseId(enterpriseId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [documentIds]
         * - [phoneNumbers]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Ids of uploaded documents (Documents API) proving the enterprise owns its phone numbers
         * hosted with another provider, for example a carrier invoice or account statement.
         */
        fun documentIds(documentIds: List<String>) = apply { body.documentIds(documentIds) }

        /**
         * Sets [Builder.documentIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentIds(documentIds: JsonField<List<String>>) = apply {
            body.documentIds(documentIds)
        }

        /**
         * Adds a single [String] to [documentIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocumentId(documentId: String) = apply { body.addDocumentId(documentId) }

        /**
         * Optional. The phone numbers hosted with another provider that the documents cover, in
         * E.164 format. Shown to the reviewer to match the documents to your numbers; you can still
         * add numbers that are not listed here, and each is checked on its own.
         */
        fun phoneNumbers(phoneNumbers: List<String>) = apply { body.phoneNumbers(phoneNumbers) }

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
            body.phoneNumbers(phoneNumbers)
        }

        /**
         * Adds a single [String] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: String) = apply { body.addPhoneNumber(phoneNumber) }

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
         * Returns an immutable instance of [ExternalVerificationCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .documentIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalVerificationCreateParams =
            ExternalVerificationCreateParams(
                enterpriseId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> enterpriseId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val documentIds: JsonField<List<String>>,
        private val phoneNumbers: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("document_ids")
            @ExcludeMissing
            documentIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("phone_numbers")
            @ExcludeMissing
            phoneNumbers: JsonField<List<String>> = JsonMissing.of(),
        ) : this(documentIds, phoneNumbers, mutableMapOf())

        /**
         * Ids of uploaded documents (Documents API) proving the enterprise owns its phone numbers
         * hosted with another provider, for example a carrier invoice or account statement.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentIds(): List<String> = documentIds.getRequired("document_ids")

        /**
         * Optional. The phone numbers hosted with another provider that the documents cover, in
         * E.164 format. Shown to the reviewer to match the documents to your numbers; you can still
         * add numbers that are not listed here, and each is checked on its own.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumbers(): Optional<List<String>> = phoneNumbers.getOptional("phone_numbers")

        /**
         * Returns the raw JSON value of [documentIds].
         *
         * Unlike [documentIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("document_ids")
        @ExcludeMissing
        fun _documentIds(): JsonField<List<String>> = documentIds

        /**
         * Returns the raw JSON value of [phoneNumbers].
         *
         * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        fun _phoneNumbers(): JsonField<List<String>> = phoneNumbers

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
             * .documentIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var documentIds: JsonField<MutableList<String>>? = null
            private var phoneNumbers: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                documentIds = body.documentIds.map { it.toMutableList() }
                phoneNumbers = body.phoneNumbers.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Ids of uploaded documents (Documents API) proving the enterprise owns its phone
             * numbers hosted with another provider, for example a carrier invoice or account
             * statement.
             */
            fun documentIds(documentIds: List<String>) = documentIds(JsonField.of(documentIds))

            /**
             * Sets [Builder.documentIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentIds(documentIds: JsonField<List<String>>) = apply {
                this.documentIds = documentIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [documentIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDocumentId(documentId: String) = apply {
                documentIds =
                    (documentIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("documentIds", it).add(documentId)
                    }
            }

            /**
             * Optional. The phone numbers hosted with another provider that the documents cover, in
             * E.164 format. Shown to the reviewer to match the documents to your numbers; you can
             * still add numbers that are not listed here, and each is checked on its own.
             */
            fun phoneNumbers(phoneNumbers: List<String>) = phoneNumbers(JsonField.of(phoneNumbers))

            /**
             * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumbers] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
                this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [phoneNumbers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPhoneNumber(phoneNumber: String) = apply {
                phoneNumbers =
                    (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("phoneNumbers", it).add(phoneNumber)
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
             * .documentIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("documentIds", documentIds).map { it.toImmutable() },
                    (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
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

            documentIds()
            phoneNumbers()
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
            (documentIds.asKnown().getOrNull()?.size ?: 0) +
                (phoneNumbers.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                documentIds == other.documentIds &&
                phoneNumbers == other.phoneNumbers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(documentIds, phoneNumbers, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{documentIds=$documentIds, phoneNumbers=$phoneNumbers, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalVerificationCreateParams &&
            enterpriseId == other.enterpriseId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(enterpriseId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExternalVerificationCreateParams{enterpriseId=$enterpriseId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
