// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.enum_

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.api.core.Enum
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get Enum */
class EnumRetrieveParams
private constructor(
    private val endpoint: Endpoint?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun endpoint(): Optional<Endpoint> = Optional.ofNullable(endpoint)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EnumRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EnumRetrieveParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EnumRetrieveParams]. */
    class Builder internal constructor() {

        private var endpoint: Endpoint? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(enumRetrieveParams: EnumRetrieveParams) = apply {
            endpoint = enumRetrieveParams.endpoint
            additionalHeaders = enumRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = enumRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun endpoint(endpoint: Endpoint?) = apply { this.endpoint = endpoint }

        /** Alias for calling [Builder.endpoint] with `endpoint.orElse(null)`. */
        fun endpoint(endpoint: Optional<Endpoint>) = endpoint(endpoint.getOrNull())

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
         * Returns an immutable instance of [EnumRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EnumRetrieveParams =
            EnumRetrieveParams(endpoint, additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> endpoint?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Endpoint @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MNO = of("mno")

            @JvmField val OPTIONAL_ATTRIBUTES = of("optionalAttributes")

            @JvmField val USECASE = of("usecase")

            @JvmField val VERTICAL = of("vertical")

            @JvmField val ALT_BUSINESS_ID_TYPE = of("altBusinessIdType")

            @JvmField val BRAND_IDENTITY_STATUS = of("brandIdentityStatus")

            @JvmField val BRAND_RELATIONSHIP = of("brandRelationship")

            @JvmField val CAMPAIGN_STATUS = of("campaignStatus")

            @JvmField val ENTITY_TYPE = of("entityType")

            @JvmField val EXT_VETTING_PROVIDER = of("extVettingProvider")

            @JvmField val VETTING_STATUS = of("vettingStatus")

            @JvmField val BRAND_STATUS = of("brandStatus")

            @JvmField val OPERATION_STATUS = of("operationStatus")

            @JvmField val APPROVED_PUBLIC_COMPANY = of("approvedPublicCompany")

            @JvmField val STOCK_EXCHANGE = of("stockExchange")

            @JvmField val VETTING_CLASS = of("vettingClass")

            @JvmStatic fun of(value: String) = Endpoint(JsonField.of(value))
        }

        /** An enum containing [Endpoint]'s known values. */
        enum class Known {
            MNO,
            OPTIONAL_ATTRIBUTES,
            USECASE,
            VERTICAL,
            ALT_BUSINESS_ID_TYPE,
            BRAND_IDENTITY_STATUS,
            BRAND_RELATIONSHIP,
            CAMPAIGN_STATUS,
            ENTITY_TYPE,
            EXT_VETTING_PROVIDER,
            VETTING_STATUS,
            BRAND_STATUS,
            OPERATION_STATUS,
            APPROVED_PUBLIC_COMPANY,
            STOCK_EXCHANGE,
            VETTING_CLASS,
        }

        /**
         * An enum containing [Endpoint]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Endpoint] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MNO,
            OPTIONAL_ATTRIBUTES,
            USECASE,
            VERTICAL,
            ALT_BUSINESS_ID_TYPE,
            BRAND_IDENTITY_STATUS,
            BRAND_RELATIONSHIP,
            CAMPAIGN_STATUS,
            ENTITY_TYPE,
            EXT_VETTING_PROVIDER,
            VETTING_STATUS,
            BRAND_STATUS,
            OPERATION_STATUS,
            APPROVED_PUBLIC_COMPANY,
            STOCK_EXCHANGE,
            VETTING_CLASS,
            /** An enum member indicating that [Endpoint] was instantiated with an unknown value. */
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
                MNO -> Value.MNO
                OPTIONAL_ATTRIBUTES -> Value.OPTIONAL_ATTRIBUTES
                USECASE -> Value.USECASE
                VERTICAL -> Value.VERTICAL
                ALT_BUSINESS_ID_TYPE -> Value.ALT_BUSINESS_ID_TYPE
                BRAND_IDENTITY_STATUS -> Value.BRAND_IDENTITY_STATUS
                BRAND_RELATIONSHIP -> Value.BRAND_RELATIONSHIP
                CAMPAIGN_STATUS -> Value.CAMPAIGN_STATUS
                ENTITY_TYPE -> Value.ENTITY_TYPE
                EXT_VETTING_PROVIDER -> Value.EXT_VETTING_PROVIDER
                VETTING_STATUS -> Value.VETTING_STATUS
                BRAND_STATUS -> Value.BRAND_STATUS
                OPERATION_STATUS -> Value.OPERATION_STATUS
                APPROVED_PUBLIC_COMPANY -> Value.APPROVED_PUBLIC_COMPANY
                STOCK_EXCHANGE -> Value.STOCK_EXCHANGE
                VETTING_CLASS -> Value.VETTING_CLASS
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
                MNO -> Known.MNO
                OPTIONAL_ATTRIBUTES -> Known.OPTIONAL_ATTRIBUTES
                USECASE -> Known.USECASE
                VERTICAL -> Known.VERTICAL
                ALT_BUSINESS_ID_TYPE -> Known.ALT_BUSINESS_ID_TYPE
                BRAND_IDENTITY_STATUS -> Known.BRAND_IDENTITY_STATUS
                BRAND_RELATIONSHIP -> Known.BRAND_RELATIONSHIP
                CAMPAIGN_STATUS -> Known.CAMPAIGN_STATUS
                ENTITY_TYPE -> Known.ENTITY_TYPE
                EXT_VETTING_PROVIDER -> Known.EXT_VETTING_PROVIDER
                VETTING_STATUS -> Known.VETTING_STATUS
                BRAND_STATUS -> Known.BRAND_STATUS
                OPERATION_STATUS -> Known.OPERATION_STATUS
                APPROVED_PUBLIC_COMPANY -> Known.APPROVED_PUBLIC_COMPANY
                STOCK_EXCHANGE -> Known.STOCK_EXCHANGE
                VETTING_CLASS -> Known.VETTING_CLASS
                else -> throw TelnyxInvalidDataException("Unknown Endpoint: $value")
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

        fun validate(): Endpoint = apply {
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

            return other is Endpoint && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EnumRetrieveParams &&
            endpoint == other.endpoint &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(endpoint, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EnumRetrieveParams{endpoint=$endpoint, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
