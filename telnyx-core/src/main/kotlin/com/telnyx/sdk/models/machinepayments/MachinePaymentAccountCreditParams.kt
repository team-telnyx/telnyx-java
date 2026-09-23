// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.machinepayments

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

/**
 * Creates an account credit using the Machine Payment Protocol (MPP), an HTTP-402 payment flow for
 * machines and agents.
 *
 * The flow has two steps. First, send an authenticated request with the `amount_usd` to credit; the
 * response is `402 Payment Required` with one or more payment challenges (for example separate
 * Tempo and Stripe challenges) in the `WWW-Authenticate` header. Second, retry the request with an
 * `Authorization: Payment ...` credential constructed from the challenge; on success the response
 * includes the credited transaction and a `Payment-Receipt` header.
 *
 * The credited account is never chosen by the request body: the initial request credits the account
 * of the authenticated user, and a paid retry credits the account bound to the verified payment
 * credential. The amount must be within the configured bounds (by default between 5.00 and 500.00
 * USD).
 *
 * Successful paid retries are idempotent — when Rails reaches its duplicate-transaction lookup for
 * an already-recorded payment, it returns the existing transaction with `created: false` instead of
 * crediting the account again. This deduplication applies to successful fulfillment: re-sending the
 * same Stripe credential may instead be rejected by the upstream provider as an idempotent replay
 * and return `402 Payment Required` rather than the existing transaction.
 * > **Warning: the payment credential is bound to a specific Telnyx account ID.** A payment is
 * > captured before the bound account is validated. If the credential names an account that is
 * > missing, suspended, blocked, cancelled, dormant, or ineligible for the tier, the payment is
 * > captured but **no account is credited**. If the credential names a different but eligible
 * > account, that account is credited — the service does not compare it against the payer's
 * > account. There is **no automatic refund**: if the captured payment does not credit the intended
 * > account, contact Telnyx support for remediation.
 */
class MachinePaymentAccountCreditParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Amount to credit in USD, as a decimal string with up to two fractional digits (by default
     * between 5.00 and 500.00). The request body is required on the initial challenge request and
     * remains required on a paid retry, where you re-send the identical body plus the payment
     * credential — the credential, not the body, selects the payment, and the retried body is not
     * re-validated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amountUsd(): String = body.amountUsd()

    /**
     * Returns the raw JSON value of [amountUsd].
     *
     * Unlike [amountUsd], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amountUsd(): JsonField<String> = body._amountUsd()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MachinePaymentAccountCreditParams].
         *
         * The following fields are required:
         * ```java
         * .amountUsd()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MachinePaymentAccountCreditParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(machinePaymentAccountCreditParams: MachinePaymentAccountCreditParams) =
            apply {
                body = machinePaymentAccountCreditParams.body.toBuilder()
                additionalHeaders = machinePaymentAccountCreditParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    machinePaymentAccountCreditParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amountUsd]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Amount to credit in USD, as a decimal string with up to two fractional digits (by default
         * between 5.00 and 500.00). The request body is required on the initial challenge request
         * and remains required on a paid retry, where you re-send the identical body plus the
         * payment credential — the credential, not the body, selects the payment, and the retried
         * body is not re-validated.
         */
        fun amountUsd(amountUsd: String) = apply { body.amountUsd(amountUsd) }

        /**
         * Sets [Builder.amountUsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountUsd] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountUsd(amountUsd: JsonField<String>) = apply { body.amountUsd(amountUsd) }

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
         * Returns an immutable instance of [MachinePaymentAccountCreditParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amountUsd()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MachinePaymentAccountCreditParams =
            MachinePaymentAccountCreditParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amountUsd: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount_usd")
            @ExcludeMissing
            amountUsd: JsonField<String> = JsonMissing.of()
        ) : this(amountUsd, mutableMapOf())

        /**
         * Amount to credit in USD, as a decimal string with up to two fractional digits (by default
         * between 5.00 and 500.00). The request body is required on the initial challenge request
         * and remains required on a paid retry, where you re-send the identical body plus the
         * payment credential — the credential, not the body, selects the payment, and the retried
         * body is not re-validated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountUsd(): String = amountUsd.getRequired("amount_usd")

        /**
         * Returns the raw JSON value of [amountUsd].
         *
         * Unlike [amountUsd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount_usd") @ExcludeMissing fun _amountUsd(): JsonField<String> = amountUsd

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
             * .amountUsd()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amountUsd: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                amountUsd = body.amountUsd
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Amount to credit in USD, as a decimal string with up to two fractional digits (by
             * default between 5.00 and 500.00). The request body is required on the initial
             * challenge request and remains required on a paid retry, where you re-send the
             * identical body plus the payment credential — the credential, not the body, selects
             * the payment, and the retried body is not re-validated.
             */
            fun amountUsd(amountUsd: String) = amountUsd(JsonField.of(amountUsd))

            /**
             * Sets [Builder.amountUsd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountUsd] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountUsd(amountUsd: JsonField<String>) = apply { this.amountUsd = amountUsd }

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
             * .amountUsd()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("amountUsd", amountUsd), additionalProperties.toMutableMap())
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

            amountUsd()
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
        @JvmSynthetic internal fun validity(): Int = (if (amountUsd.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                amountUsd == other.amountUsd &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amountUsd, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amountUsd=$amountUsd, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MachinePaymentAccountCreditParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MachinePaymentAccountCreditParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
