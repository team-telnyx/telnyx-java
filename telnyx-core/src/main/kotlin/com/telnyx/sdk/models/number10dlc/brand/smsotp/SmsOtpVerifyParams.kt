// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand.smsotp

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
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Verify the SMS OTP (One-Time Password) for Sole Proprietor brand verification.
 *
 * **Verification Flow:**
 * 1. User receives OTP via SMS after triggering
 * 2. User submits the OTP pin through this endpoint
 * 3. Upon successful verification:
 *     - A `BRAND_OTP_VERIFIED` webhook event is sent to the CSP
 *     - The brand's `identityStatus` changes to `VERIFIED`
 *     - Campaigns can now be created for this brand
 *
 * **Error Handling:**
 *
 * Provides proper error responses for:
 * * Invalid OTP pins
 * * Expired OTPs
 * * OTP verification failures
 */
class SmsOtpVerifyParams
private constructor(
    private val brandId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun brandId(): Optional<String> = Optional.ofNullable(brandId)

    /**
     * The OTP PIN received via SMS
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun otpPin(): String = body.otpPin()

    /**
     * Returns the raw JSON value of [otpPin].
     *
     * Unlike [otpPin], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _otpPin(): JsonField<String> = body._otpPin()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SmsOtpVerifyParams].
         *
         * The following fields are required:
         * ```java
         * .otpPin()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SmsOtpVerifyParams]. */
    class Builder internal constructor() {

        private var brandId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(smsOtpVerifyParams: SmsOtpVerifyParams) = apply {
            brandId = smsOtpVerifyParams.brandId
            body = smsOtpVerifyParams.body.toBuilder()
            additionalHeaders = smsOtpVerifyParams.additionalHeaders.toBuilder()
            additionalQueryParams = smsOtpVerifyParams.additionalQueryParams.toBuilder()
        }

        fun brandId(brandId: String?) = apply { this.brandId = brandId }

        /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
        fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [otpPin]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The OTP PIN received via SMS */
        fun otpPin(otpPin: String) = apply { body.otpPin(otpPin) }

        /**
         * Sets [Builder.otpPin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otpPin] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun otpPin(otpPin: JsonField<String>) = apply { body.otpPin(otpPin) }

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
         * Returns an immutable instance of [SmsOtpVerifyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .otpPin()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SmsOtpVerifyParams =
            SmsOtpVerifyParams(
                brandId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> brandId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request body for verifying a Brand SMS OTP */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val otpPin: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("otpPin") @ExcludeMissing otpPin: JsonField<String> = JsonMissing.of()
        ) : this(otpPin, mutableMapOf())

        /**
         * The OTP PIN received via SMS
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun otpPin(): String = otpPin.getRequired("otpPin")

        /**
         * Returns the raw JSON value of [otpPin].
         *
         * Unlike [otpPin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("otpPin") @ExcludeMissing fun _otpPin(): JsonField<String> = otpPin

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
             * .otpPin()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var otpPin: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                otpPin = body.otpPin
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The OTP PIN received via SMS */
            fun otpPin(otpPin: String) = otpPin(JsonField.of(otpPin))

            /**
             * Sets [Builder.otpPin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.otpPin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun otpPin(otpPin: JsonField<String>) = apply { this.otpPin = otpPin }

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
             * .otpPin()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("otpPin", otpPin), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            otpPin()
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
        @JvmSynthetic internal fun validity(): Int = (if (otpPin.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                otpPin == other.otpPin &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(otpPin, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{otpPin=$otpPin, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SmsOtpVerifyParams &&
            brandId == other.brandId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(brandId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SmsOtpVerifyParams{brandId=$brandId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
