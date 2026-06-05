// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice.agreements

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns the Terms of Service agreements the authenticated user has on file. Each entry records
 * the version agreed to and when. Most users only have one agreement per product, but if the ToS is
 * updated and the user re-agrees a new entry is added.
 *
 * Results are paginated with the standard `page[number]` / `page[size]` parameters; the response
 * uses the standard `{data, meta}` JSON:API envelope.
 *
 * By default this returns agreements for **all** products the user has agreed to (including Branded
 * Calling). Pass the `product_type` query parameter to scope the result to a single product.
 */
class AgreementListParams
private constructor(
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val productType: ProductType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** 1-based page number. Out-of-range values return an empty page with correct meta. */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** Items per page. Maximum 250; values above are clamped to 250. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Optional filter. Omit to list the user's agreements for **every** product (branded_calling
     * and number_reputation); pass a value to return only that product's agreements.
     */
    fun productType(): Optional<ProductType> = Optional.ofNullable(productType)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AgreementListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AgreementListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgreementListParams]. */
    class Builder internal constructor() {

        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var productType: ProductType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(agreementListParams: AgreementListParams) = apply {
            pageNumber = agreementListParams.pageNumber
            pageSize = agreementListParams.pageSize
            productType = agreementListParams.productType
            additionalHeaders = agreementListParams.additionalHeaders.toBuilder()
            additionalQueryParams = agreementListParams.additionalQueryParams.toBuilder()
        }

        /** 1-based page number. Out-of-range values return an empty page with correct meta. */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        /** Items per page. Maximum 250; values above are clamped to 250. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * Optional filter. Omit to list the user's agreements for **every** product
         * (branded_calling and number_reputation); pass a value to return only that product's
         * agreements.
         */
        fun productType(productType: ProductType?) = apply { this.productType = productType }

        /** Alias for calling [Builder.productType] with `productType.orElse(null)`. */
        fun productType(productType: Optional<ProductType>) = productType(productType.getOrNull())

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
         * Returns an immutable instance of [AgreementListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AgreementListParams =
            AgreementListParams(
                pageNumber,
                pageSize,
                productType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                productType?.let { put("product_type", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Optional filter. Omit to list the user's agreements for **every** product (branded_calling
     * and number_reputation); pass a value to return only that product's agreements.
     */
    class ProductType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BRANDED_CALLING = of("branded_calling")

            @JvmField val NUMBER_REPUTATION = of("number_reputation")

            @JvmStatic fun of(value: String) = ProductType(JsonField.of(value))
        }

        /** An enum containing [ProductType]'s known values. */
        enum class Known {
            BRANDED_CALLING,
            NUMBER_REPUTATION,
        }

        /**
         * An enum containing [ProductType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ProductType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BRANDED_CALLING,
            NUMBER_REPUTATION,
            /**
             * An enum member indicating that [ProductType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BRANDED_CALLING -> Value.BRANDED_CALLING
                NUMBER_REPUTATION -> Value.NUMBER_REPUTATION
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BRANDED_CALLING -> Known.BRANDED_CALLING
                NUMBER_REPUTATION -> Known.NUMBER_REPUTATION
                else -> throw TelnyxInvalidDataException("Unknown ProductType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

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
        fun validate(): ProductType = apply {
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

            return other is ProductType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgreementListParams &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            productType == other.productType &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pageNumber, pageSize, productType, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AgreementListParams{pageNumber=$pageNumber, pageSize=$pageSize, productType=$productType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
