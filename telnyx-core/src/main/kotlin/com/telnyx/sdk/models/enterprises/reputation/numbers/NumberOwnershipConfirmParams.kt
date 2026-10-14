// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

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
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Answer an ownership question about a phone number hosted with another provider.
 *
 * Send `still_own: true` to confirm you still own a number whose `ownership_status` is
 * `pending_confirmation` or `flagged`; its status returns to `verified` and, after a carrier
 * change, the new carrier becomes the one on record.
 *
 * Send `still_own: false` to report that you no longer own the number. It is removed from Number
 * Reputation immediately, whatever its current status, and the response shows it with
 * `ownership_status: removed`.
 */
class NumberOwnershipConfirmParams
private constructor(
    private val enterpriseId: String,
    private val phoneNumber: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun enterpriseId(): String = enterpriseId

    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

    /**
     * `true` confirms you still own the number. `false` reports that you no longer own it and
     * removes it from Number Reputation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stillOwn(): Boolean = body.stillOwn()

    /**
     * Optional id of an uploaded document supporting the confirmation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evidenceDocumentId(): Optional<String> = body.evidenceDocumentId()

    /**
     * Returns the raw JSON value of [stillOwn].
     *
     * Unlike [stillOwn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stillOwn(): JsonField<Boolean> = body._stillOwn()

    /**
     * Returns the raw JSON value of [evidenceDocumentId].
     *
     * Unlike [evidenceDocumentId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _evidenceDocumentId(): JsonField<String> = body._evidenceDocumentId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NumberOwnershipConfirmParams].
         *
         * The following fields are required:
         * ```java
         * .enterpriseId()
         * .stillOwn()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberOwnershipConfirmParams]. */
    class Builder internal constructor() {

        private var enterpriseId: String? = null
        private var phoneNumber: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(numberOwnershipConfirmParams: NumberOwnershipConfirmParams) = apply {
            enterpriseId = numberOwnershipConfirmParams.enterpriseId
            phoneNumber = numberOwnershipConfirmParams.phoneNumber
            body = numberOwnershipConfirmParams.body.toBuilder()
            additionalHeaders = numberOwnershipConfirmParams.additionalHeaders.toBuilder()
            additionalQueryParams = numberOwnershipConfirmParams.additionalQueryParams.toBuilder()
        }

        fun enterpriseId(enterpriseId: String) = apply { this.enterpriseId = enterpriseId }

        fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [stillOwn]
         * - [evidenceDocumentId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * `true` confirms you still own the number. `false` reports that you no longer own it and
         * removes it from Number Reputation.
         */
        fun stillOwn(stillOwn: Boolean) = apply { body.stillOwn(stillOwn) }

        /**
         * Sets [Builder.stillOwn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stillOwn] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stillOwn(stillOwn: JsonField<Boolean>) = apply { body.stillOwn(stillOwn) }

        /** Optional id of an uploaded document supporting the confirmation. */
        fun evidenceDocumentId(evidenceDocumentId: String) = apply {
            body.evidenceDocumentId(evidenceDocumentId)
        }

        /**
         * Sets [Builder.evidenceDocumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evidenceDocumentId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evidenceDocumentId(evidenceDocumentId: JsonField<String>) = apply {
            body.evidenceDocumentId(evidenceDocumentId)
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
         * Returns an immutable instance of [NumberOwnershipConfirmParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .enterpriseId()
         * .stillOwn()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NumberOwnershipConfirmParams =
            NumberOwnershipConfirmParams(
                checkRequired("enterpriseId", enterpriseId),
                phoneNumber,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> enterpriseId
            1 -> phoneNumber ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val stillOwn: JsonField<Boolean>,
        private val evidenceDocumentId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("still_own")
            @ExcludeMissing
            stillOwn: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("evidence_document_id")
            @ExcludeMissing
            evidenceDocumentId: JsonField<String> = JsonMissing.of(),
        ) : this(stillOwn, evidenceDocumentId, mutableMapOf())

        /**
         * `true` confirms you still own the number. `false` reports that you no longer own it and
         * removes it from Number Reputation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun stillOwn(): Boolean = stillOwn.getRequired("still_own")

        /**
         * Optional id of an uploaded document supporting the confirmation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun evidenceDocumentId(): Optional<String> =
            evidenceDocumentId.getOptional("evidence_document_id")

        /**
         * Returns the raw JSON value of [stillOwn].
         *
         * Unlike [stillOwn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("still_own") @ExcludeMissing fun _stillOwn(): JsonField<Boolean> = stillOwn

        /**
         * Returns the raw JSON value of [evidenceDocumentId].
         *
         * Unlike [evidenceDocumentId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("evidence_document_id")
        @ExcludeMissing
        fun _evidenceDocumentId(): JsonField<String> = evidenceDocumentId

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
             * .stillOwn()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var stillOwn: JsonField<Boolean>? = null
            private var evidenceDocumentId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                stillOwn = body.stillOwn
                evidenceDocumentId = body.evidenceDocumentId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * `true` confirms you still own the number. `false` reports that you no longer own it
             * and removes it from Number Reputation.
             */
            fun stillOwn(stillOwn: Boolean) = stillOwn(JsonField.of(stillOwn))

            /**
             * Sets [Builder.stillOwn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stillOwn] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stillOwn(stillOwn: JsonField<Boolean>) = apply { this.stillOwn = stillOwn }

            /** Optional id of an uploaded document supporting the confirmation. */
            fun evidenceDocumentId(evidenceDocumentId: String) =
                evidenceDocumentId(JsonField.of(evidenceDocumentId))

            /**
             * Sets [Builder.evidenceDocumentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evidenceDocumentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun evidenceDocumentId(evidenceDocumentId: JsonField<String>) = apply {
                this.evidenceDocumentId = evidenceDocumentId
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
             * .stillOwn()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("stillOwn", stillOwn),
                    evidenceDocumentId,
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

            stillOwn()
            evidenceDocumentId()
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
            (if (stillOwn.asKnown().isPresent) 1 else 0) +
                (if (evidenceDocumentId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                stillOwn == other.stillOwn &&
                evidenceDocumentId == other.evidenceDocumentId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(stillOwn, evidenceDocumentId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{stillOwn=$stillOwn, evidenceDocumentId=$evidenceDocumentId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberOwnershipConfirmParams &&
            enterpriseId == other.enterpriseId &&
            phoneNumber == other.phoneNumber &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(enterpriseId, phoneNumber, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "NumberOwnershipConfirmParams{enterpriseId=$enterpriseId, phoneNumber=$phoneNumber, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
