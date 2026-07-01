// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.references

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Submit the two business references and one financial reference for a DIR.
 *
 * The DIR's authorizer email must be verified first (see the email-verification endpoint). Until it
 * is, this returns `409` and no references are stored.
 *
 * The request body carries exactly two business references plus one financial reference. On success
 * the references are stored and the response echoes them in the same shape as the GET. Submitting
 * again converges on the already-stored references rather than erroring.
 */
class ReferenceCreateParams
private constructor(
    private val dirId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun dirId(): Optional<String> = Optional.ofNullable(dirId)

    /**
     * Exactly two business references.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessReferences(): List<ReferenceInput> = body.businessReferences()

    /**
     * One reference supplied at submit. The reference type is implied by the field that carries it
     * (business_references vs financial_reference).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun financialReference(): ReferenceInput = body.financialReference()

    /**
     * Returns the raw JSON value of [businessReferences].
     *
     * Unlike [businessReferences], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _businessReferences(): JsonField<List<ReferenceInput>> = body._businessReferences()

    /**
     * Returns the raw JSON value of [financialReference].
     *
     * Unlike [financialReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _financialReference(): JsonField<ReferenceInput> = body._financialReference()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReferenceCreateParams].
         *
         * The following fields are required:
         * ```java
         * .businessReferences()
         * .financialReference()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReferenceCreateParams]. */
    class Builder internal constructor() {

        private var dirId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(referenceCreateParams: ReferenceCreateParams) = apply {
            dirId = referenceCreateParams.dirId
            body = referenceCreateParams.body.toBuilder()
            additionalHeaders = referenceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = referenceCreateParams.additionalQueryParams.toBuilder()
        }

        fun dirId(dirId: String?) = apply { this.dirId = dirId }

        /** Alias for calling [Builder.dirId] with `dirId.orElse(null)`. */
        fun dirId(dirId: Optional<String>) = dirId(dirId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [businessReferences]
         * - [financialReference]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Exactly two business references. */
        fun businessReferences(businessReferences: List<ReferenceInput>) = apply {
            body.businessReferences(businessReferences)
        }

        /**
         * Sets [Builder.businessReferences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessReferences] with a well-typed
         * `List<ReferenceInput>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun businessReferences(businessReferences: JsonField<List<ReferenceInput>>) = apply {
            body.businessReferences(businessReferences)
        }

        /**
         * Adds a single [ReferenceInput] to [businessReferences].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBusinessReference(businessReference: ReferenceInput) = apply {
            body.addBusinessReference(businessReference)
        }

        /**
         * One reference supplied at submit. The reference type is implied by the field that carries
         * it (business_references vs financial_reference).
         */
        fun financialReference(financialReference: ReferenceInput) = apply {
            body.financialReference(financialReference)
        }

        /**
         * Sets [Builder.financialReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialReference] with a well-typed [ReferenceInput]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun financialReference(financialReference: JsonField<ReferenceInput>) = apply {
            body.financialReference(financialReference)
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
         * Returns an immutable instance of [ReferenceCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .businessReferences()
         * .financialReference()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReferenceCreateParams =
            ReferenceCreateParams(
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

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Exactly two business references plus one financial reference. The DIR's authorizer email must
     * be verified before this is accepted.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val businessReferences: JsonField<List<ReferenceInput>>,
        private val financialReference: JsonField<ReferenceInput>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("business_references")
            @ExcludeMissing
            businessReferences: JsonField<List<ReferenceInput>> = JsonMissing.of(),
            @JsonProperty("financial_reference")
            @ExcludeMissing
            financialReference: JsonField<ReferenceInput> = JsonMissing.of(),
        ) : this(businessReferences, financialReference, mutableMapOf())

        /**
         * Exactly two business references.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun businessReferences(): List<ReferenceInput> =
            businessReferences.getRequired("business_references")

        /**
         * One reference supplied at submit. The reference type is implied by the field that carries
         * it (business_references vs financial_reference).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun financialReference(): ReferenceInput =
            financialReference.getRequired("financial_reference")

        /**
         * Returns the raw JSON value of [businessReferences].
         *
         * Unlike [businessReferences], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("business_references")
        @ExcludeMissing
        fun _businessReferences(): JsonField<List<ReferenceInput>> = businessReferences

        /**
         * Returns the raw JSON value of [financialReference].
         *
         * Unlike [financialReference], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("financial_reference")
        @ExcludeMissing
        fun _financialReference(): JsonField<ReferenceInput> = financialReference

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
             * .businessReferences()
             * .financialReference()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var businessReferences: JsonField<MutableList<ReferenceInput>>? = null
            private var financialReference: JsonField<ReferenceInput>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                businessReferences = body.businessReferences.map { it.toMutableList() }
                financialReference = body.financialReference
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Exactly two business references. */
            fun businessReferences(businessReferences: List<ReferenceInput>) =
                businessReferences(JsonField.of(businessReferences))

            /**
             * Sets [Builder.businessReferences] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessReferences] with a well-typed
             * `List<ReferenceInput>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun businessReferences(businessReferences: JsonField<List<ReferenceInput>>) = apply {
                this.businessReferences = businessReferences.map { it.toMutableList() }
            }

            /**
             * Adds a single [ReferenceInput] to [businessReferences].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBusinessReference(businessReference: ReferenceInput) = apply {
                businessReferences =
                    (businessReferences ?: JsonField.of(mutableListOf())).also {
                        checkKnown("businessReferences", it).add(businessReference)
                    }
            }

            /**
             * One reference supplied at submit. The reference type is implied by the field that
             * carries it (business_references vs financial_reference).
             */
            fun financialReference(financialReference: ReferenceInput) =
                financialReference(JsonField.of(financialReference))

            /**
             * Sets [Builder.financialReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.financialReference] with a well-typed
             * [ReferenceInput] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun financialReference(financialReference: JsonField<ReferenceInput>) = apply {
                this.financialReference = financialReference
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
             * .businessReferences()
             * .financialReference()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("businessReferences", businessReferences).map {
                        it.toImmutable()
                    },
                    checkRequired("financialReference", financialReference),
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

            businessReferences().forEach { it.validate() }
            financialReference().validate()
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
            (businessReferences.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (financialReference.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                businessReferences == other.businessReferences &&
                financialReference == other.financialReference &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(businessReferences, financialReference, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{businessReferences=$businessReferences, financialReference=$financialReference, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReferenceCreateParams &&
            dirId == other.dirId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(dirId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ReferenceCreateParams{dirId=$dirId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
