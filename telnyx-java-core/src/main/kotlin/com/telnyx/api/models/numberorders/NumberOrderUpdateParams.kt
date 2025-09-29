// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.numberorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
import com.telnyx.api.models.numberorderphonenumbers.UpdateRegulatoryRequirement
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Updates a phone number order. */
class NumberOrderUpdateParams
private constructor(
    private val numberOrderId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun numberOrderId(): Optional<String> = Optional.ofNullable(numberOrderId)

    /**
     * A customer reference string for customer look ups.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = body.customerReference()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regulatoryRequirements(): Optional<List<UpdateRegulatoryRequirement>> =
        body.regulatoryRequirements()

    /**
     * Returns the raw JSON value of [customerReference].
     *
     * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customerReference(): JsonField<String> = body._customerReference()

    /**
     * Returns the raw JSON value of [regulatoryRequirements].
     *
     * Unlike [regulatoryRequirements], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _regulatoryRequirements(): JsonField<List<UpdateRegulatoryRequirement>> =
        body._regulatoryRequirements()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): NumberOrderUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [NumberOrderUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberOrderUpdateParams]. */
    class Builder internal constructor() {

        private var numberOrderId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(numberOrderUpdateParams: NumberOrderUpdateParams) = apply {
            numberOrderId = numberOrderUpdateParams.numberOrderId
            body = numberOrderUpdateParams.body.toBuilder()
            additionalHeaders = numberOrderUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = numberOrderUpdateParams.additionalQueryParams.toBuilder()
        }

        fun numberOrderId(numberOrderId: String?) = apply { this.numberOrderId = numberOrderId }

        /** Alias for calling [Builder.numberOrderId] with `numberOrderId.orElse(null)`. */
        fun numberOrderId(numberOrderId: Optional<String>) =
            numberOrderId(numberOrderId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customerReference]
         * - [regulatoryRequirements]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** A customer reference string for customer look ups. */
        fun customerReference(customerReference: String) = apply {
            body.customerReference(customerReference)
        }

        /**
         * Sets [Builder.customerReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerReference(customerReference: JsonField<String>) = apply {
            body.customerReference(customerReference)
        }

        fun regulatoryRequirements(regulatoryRequirements: List<UpdateRegulatoryRequirement>) =
            apply {
                body.regulatoryRequirements(regulatoryRequirements)
            }

        /**
         * Sets [Builder.regulatoryRequirements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regulatoryRequirements] with a well-typed
         * `List<UpdateRegulatoryRequirement>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun regulatoryRequirements(
            regulatoryRequirements: JsonField<List<UpdateRegulatoryRequirement>>
        ) = apply { body.regulatoryRequirements(regulatoryRequirements) }

        /**
         * Adds a single [UpdateRegulatoryRequirement] to [regulatoryRequirements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRegulatoryRequirement(regulatoryRequirement: UpdateRegulatoryRequirement) = apply {
            body.addRegulatoryRequirement(regulatoryRequirement)
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
         * Returns an immutable instance of [NumberOrderUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NumberOrderUpdateParams =
            NumberOrderUpdateParams(
                numberOrderId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> numberOrderId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customerReference: JsonField<String>,
        private val regulatoryRequirements: JsonField<List<UpdateRegulatoryRequirement>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("regulatory_requirements")
            @ExcludeMissing
            regulatoryRequirements: JsonField<List<UpdateRegulatoryRequirement>> = JsonMissing.of(),
        ) : this(customerReference, regulatoryRequirements, mutableMapOf())

        /**
         * A customer reference string for customer look ups.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regulatoryRequirements(): Optional<List<UpdateRegulatoryRequirement>> =
            regulatoryRequirements.getOptional("regulatory_requirements")

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
         * Returns the raw JSON value of [regulatoryRequirements].
         *
         * Unlike [regulatoryRequirements], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("regulatory_requirements")
        @ExcludeMissing
        fun _regulatoryRequirements(): JsonField<List<UpdateRegulatoryRequirement>> =
            regulatoryRequirements

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

            private var customerReference: JsonField<String> = JsonMissing.of()
            private var regulatoryRequirements:
                JsonField<MutableList<UpdateRegulatoryRequirement>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                customerReference = body.customerReference
                regulatoryRequirements = body.regulatoryRequirements.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
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

            fun regulatoryRequirements(regulatoryRequirements: List<UpdateRegulatoryRequirement>) =
                regulatoryRequirements(JsonField.of(regulatoryRequirements))

            /**
             * Sets [Builder.regulatoryRequirements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regulatoryRequirements] with a well-typed
             * `List<UpdateRegulatoryRequirement>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun regulatoryRequirements(
                regulatoryRequirements: JsonField<List<UpdateRegulatoryRequirement>>
            ) = apply {
                this.regulatoryRequirements = regulatoryRequirements.map { it.toMutableList() }
            }

            /**
             * Adds a single [UpdateRegulatoryRequirement] to [regulatoryRequirements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRegulatoryRequirement(regulatoryRequirement: UpdateRegulatoryRequirement) =
                apply {
                    regulatoryRequirements =
                        (regulatoryRequirements ?: JsonField.of(mutableListOf())).also {
                            checkKnown("regulatoryRequirements", it).add(regulatoryRequirement)
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
                    customerReference,
                    (regulatoryRequirements ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            customerReference()
            regulatoryRequirements().ifPresent { it.forEach { it.validate() } }
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
                (regulatoryRequirements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                customerReference == other.customerReference &&
                regulatoryRequirements == other.regulatoryRequirements &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(customerReference, regulatoryRequirements, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customerReference=$customerReference, regulatoryRequirements=$regulatoryRequirements, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberOrderUpdateParams &&
            numberOrderId == other.numberOrderId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(numberOrderId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "NumberOrderUpdateParams{numberOrderId=$numberOrderId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
