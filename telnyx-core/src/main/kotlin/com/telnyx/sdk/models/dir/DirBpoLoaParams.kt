// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

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
 * The Letter of Authorization in which a Brand Owner authorizes an approved BPO (Business Process
 * Outsourcer) to place branded calls that display this DIR on the owner's behalf. Both parties are
 * read from the caller's account: the Brand Owner is the enterprise that owns the DIR, and the BPO
 * is `bpo_enterprise_id`. No business identity is accepted in the body.
 *
 * When `signature` is omitted the PDF is returned unsigned so the Brand Owner can sign it
 * externally and the BPO can upload it via the Documents API. When `signature` is present the PDF
 * embeds the supplied image, printed name, and signed-at date.
 *
 * Returns `application/pdf`.
 */
class DirBpoLoaParams
private constructor(
    private val dirId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun dirId(): Optional<String> = Optional.ofNullable(dirId)

    /**
     * The approved BPO enterprise the Brand Owner is authorizing. Must be a BPO account on the
     * caller's organization that has already been approved.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bpoEnterpriseId(): String = body.bpoEnterpriseId()

    /**
     * Optional. When provided the rendered PDF embeds the signature image, printed name, and
     * signed-at date. When absent the PDF is returned unsigned so the Brand Owner can sign
     * externally and the BPO can upload it via the Documents API.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signature(): Optional<SignaturePayload> = body.signature()

    /**
     * Returns the raw JSON value of [bpoEnterpriseId].
     *
     * Unlike [bpoEnterpriseId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bpoEnterpriseId(): JsonField<String> = body._bpoEnterpriseId()

    /**
     * Returns the raw JSON value of [signature].
     *
     * Unlike [signature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _signature(): JsonField<SignaturePayload> = body._signature()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DirBpoLoaParams].
         *
         * The following fields are required:
         * ```java
         * .bpoEnterpriseId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DirBpoLoaParams]. */
    class Builder internal constructor() {

        private var dirId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dirBpoLoaParams: DirBpoLoaParams) = apply {
            dirId = dirBpoLoaParams.dirId
            body = dirBpoLoaParams.body.toBuilder()
            additionalHeaders = dirBpoLoaParams.additionalHeaders.toBuilder()
            additionalQueryParams = dirBpoLoaParams.additionalQueryParams.toBuilder()
        }

        fun dirId(dirId: String?) = apply { this.dirId = dirId }

        /** Alias for calling [Builder.dirId] with `dirId.orElse(null)`. */
        fun dirId(dirId: Optional<String>) = dirId(dirId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bpoEnterpriseId]
         * - [signature]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The approved BPO enterprise the Brand Owner is authorizing. Must be a BPO account on the
         * caller's organization that has already been approved.
         */
        fun bpoEnterpriseId(bpoEnterpriseId: String) = apply {
            body.bpoEnterpriseId(bpoEnterpriseId)
        }

        /**
         * Sets [Builder.bpoEnterpriseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bpoEnterpriseId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bpoEnterpriseId(bpoEnterpriseId: JsonField<String>) = apply {
            body.bpoEnterpriseId(bpoEnterpriseId)
        }

        /**
         * Optional. When provided the rendered PDF embeds the signature image, printed name, and
         * signed-at date. When absent the PDF is returned unsigned so the Brand Owner can sign
         * externally and the BPO can upload it via the Documents API.
         */
        fun signature(signature: SignaturePayload) = apply { body.signature(signature) }

        /**
         * Sets [Builder.signature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signature] with a well-typed [SignaturePayload] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun signature(signature: JsonField<SignaturePayload>) = apply { body.signature(signature) }

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
         * Returns an immutable instance of [DirBpoLoaParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bpoEnterpriseId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DirBpoLoaParams =
            DirBpoLoaParams(
                dirId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> dirId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bpoEnterpriseId: JsonField<String>,
        private val signature: JsonField<SignaturePayload>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bpo_enterprise_id")
            @ExcludeMissing
            bpoEnterpriseId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("signature")
            @ExcludeMissing
            signature: JsonField<SignaturePayload> = JsonMissing.of(),
        ) : this(bpoEnterpriseId, signature, mutableMapOf())

        /**
         * The approved BPO enterprise the Brand Owner is authorizing. Must be a BPO account on the
         * caller's organization that has already been approved.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bpoEnterpriseId(): String = bpoEnterpriseId.getRequired("bpo_enterprise_id")

        /**
         * Optional. When provided the rendered PDF embeds the signature image, printed name, and
         * signed-at date. When absent the PDF is returned unsigned so the Brand Owner can sign
         * externally and the BPO can upload it via the Documents API.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signature(): Optional<SignaturePayload> = signature.getOptional("signature")

        /**
         * Returns the raw JSON value of [bpoEnterpriseId].
         *
         * Unlike [bpoEnterpriseId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bpo_enterprise_id")
        @ExcludeMissing
        fun _bpoEnterpriseId(): JsonField<String> = bpoEnterpriseId

        /**
         * Returns the raw JSON value of [signature].
         *
         * Unlike [signature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signature")
        @ExcludeMissing
        fun _signature(): JsonField<SignaturePayload> = signature

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
             * .bpoEnterpriseId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var bpoEnterpriseId: JsonField<String>? = null
            private var signature: JsonField<SignaturePayload> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                bpoEnterpriseId = body.bpoEnterpriseId
                signature = body.signature
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The approved BPO enterprise the Brand Owner is authorizing. Must be a BPO account on
             * the caller's organization that has already been approved.
             */
            fun bpoEnterpriseId(bpoEnterpriseId: String) =
                bpoEnterpriseId(JsonField.of(bpoEnterpriseId))

            /**
             * Sets [Builder.bpoEnterpriseId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bpoEnterpriseId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bpoEnterpriseId(bpoEnterpriseId: JsonField<String>) = apply {
                this.bpoEnterpriseId = bpoEnterpriseId
            }

            /**
             * Optional. When provided the rendered PDF embeds the signature image, printed name,
             * and signed-at date. When absent the PDF is returned unsigned so the Brand Owner can
             * sign externally and the BPO can upload it via the Documents API.
             */
            fun signature(signature: SignaturePayload) = signature(JsonField.of(signature))

            /**
             * Sets [Builder.signature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signature] with a well-typed [SignaturePayload]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun signature(signature: JsonField<SignaturePayload>) = apply {
                this.signature = signature
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
             * .bpoEnterpriseId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("bpoEnterpriseId", bpoEnterpriseId),
                    signature,
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

            bpoEnterpriseId()
            signature().ifPresent { it.validate() }
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
            (if (bpoEnterpriseId.asKnown().isPresent) 1 else 0) +
                (signature.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bpoEnterpriseId == other.bpoEnterpriseId &&
                signature == other.signature &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(bpoEnterpriseId, signature, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bpoEnterpriseId=$bpoEnterpriseId, signature=$signature, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DirBpoLoaParams &&
            dirId == other.dirId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(dirId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DirBpoLoaParams{dirId=$dirId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
