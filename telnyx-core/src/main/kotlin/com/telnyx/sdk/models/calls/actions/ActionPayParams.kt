// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Collect payment details from the caller using DTMF and either charge or tokenize the payment
 * method through a configured Pay connector. Pay pauses active call recordings while sensitive
 * payment details are collected.
 *
 * When `payment_token` is supplied, the DTMF collection steps are skipped and the existing token is
 * sent to the connector.
 *
 * **Expected Webhooks:**
 * - `call.payment.progress`
 * - `call.payment.completed`
 *
 * **Test mode card numbers:** `4111111111111111` (Visa), `5555555555554444` (Mastercard),
 * `378282246310005` (American Express), `6011111111111117` (Discover), `3065930009020004` (Diners
 * Club), `3566002020360505` (JCB), `6200000000000005` (UnionPay), and `6771798021000008` (Maestro).
 * Test-mode connectors reject other card numbers before contacting the configured processor. The
 * UnionPay and Maestro numbers are accepted for processor testing, but Pay currently does not emit
 * a card type for them.
 */
class ActionPayParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    /**
     * Amount to charge. Required when `transaction_type` is `charge`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Double> = body.amount()

    /**
     * Base64-encoded state included in subsequent webhooks.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = body.clientState()

    /**
     * Idempotency key for the command. Telnyx ignores a duplicate command with the same
     * `command_id` for the same `call_control_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commandId(): Optional<String> = body.commandId()

    /**
     * Name of the Pay connector used to process the transaction.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectorName(): Optional<String> = body.connectorName()

    /**
     * Currency used for the transaction. Pay currently supports USD only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<Currency> = body.currency()

    /**
     * Optional description forwarded with the payment transaction.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Time in milliseconds to wait between consecutive DTMF digits.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interDigitTimeoutMillis(): Optional<Int> = body.interDigitTimeoutMillis()

    /**
     * Language used for payment prompts.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = body.language()

    /**
     * Maximum number of attempts for each payment collection step.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxAttempts(): Optional<Int> = body.maxAttempts()

    /**
     * Metadata forwarded to the Pay connector.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Additional parameters forwarded to the Pay connector.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parameters(): Optional<Parameters> = body.parameters()

    /**
     * Payment method to collect.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentMethod(): Optional<PaymentMethod> = body.paymentMethod()

    /**
     * Existing payment token. When supplied, payment-detail collection is skipped.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentToken(): Optional<String> = body.paymentToken()

    /**
     * Custom text-to-speech prompts keyed by payment collection step.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prompts(): Optional<Prompts> = body.prompts()

    /**
     * Speech synthesis service level used for payment prompts. Pay defaults to `premium`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceLevel(): Optional<String> = body.serviceLevel()

    /**
     * Time in milliseconds to wait for DTMF input for each collection step.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutMillis(): Optional<Int> = body.timeoutMillis()

    /**
     * Transaction to perform. If omitted, Pay infers `tokenize` when `amount` is absent or zero and
     * `charge` when `amount` is positive.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionType(): Optional<TransactionType> = body.transactionType()

    /**
     * Voice used for payment prompts. Accepts `male`, `female`, or a provider voice in
     * `<Provider>.<Model>.<VoiceId>` format, for example `AWS.Polly.Joanna` or
     * `Telnyx.KokoroTTS.af`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voice(): Optional<String> = body.voice()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Double> = body._amount()

    /**
     * Returns the raw JSON value of [clientState].
     *
     * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientState(): JsonField<String> = body._clientState()

    /**
     * Returns the raw JSON value of [commandId].
     *
     * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commandId(): JsonField<String> = body._commandId()

    /**
     * Returns the raw JSON value of [connectorName].
     *
     * Unlike [connectorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _connectorName(): JsonField<String> = body._connectorName()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<Currency> = body._currency()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [interDigitTimeoutMillis].
     *
     * Unlike [interDigitTimeoutMillis], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _interDigitTimeoutMillis(): JsonField<Int> = body._interDigitTimeoutMillis()

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _language(): JsonField<String> = body._language()

    /**
     * Returns the raw JSON value of [maxAttempts].
     *
     * Unlike [maxAttempts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxAttempts(): JsonField<Int> = body._maxAttempts()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _parameters(): JsonField<Parameters> = body._parameters()

    /**
     * Returns the raw JSON value of [paymentMethod].
     *
     * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paymentMethod(): JsonField<PaymentMethod> = body._paymentMethod()

    /**
     * Returns the raw JSON value of [paymentToken].
     *
     * Unlike [paymentToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paymentToken(): JsonField<String> = body._paymentToken()

    /**
     * Returns the raw JSON value of [prompts].
     *
     * Unlike [prompts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _prompts(): JsonField<Prompts> = body._prompts()

    /**
     * Returns the raw JSON value of [serviceLevel].
     *
     * Unlike [serviceLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _serviceLevel(): JsonField<String> = body._serviceLevel()

    /**
     * Returns the raw JSON value of [timeoutMillis].
     *
     * Unlike [timeoutMillis], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeoutMillis(): JsonField<Int> = body._timeoutMillis()

    /**
     * Returns the raw JSON value of [transactionType].
     *
     * Unlike [transactionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transactionType(): JsonField<TransactionType> = body._transactionType()

    /**
     * Returns the raw JSON value of [voice].
     *
     * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voice(): JsonField<String> = body._voice()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ActionPayParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ActionPayParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionPayParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionPayParams: ActionPayParams) = apply {
            callControlId = actionPayParams.callControlId
            body = actionPayParams.body.toBuilder()
            additionalHeaders = actionPayParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionPayParams.additionalQueryParams.toBuilder()
        }

        fun callControlId(callControlId: String?) = apply { this.callControlId = callControlId }

        /** Alias for calling [Builder.callControlId] with `callControlId.orElse(null)`. */
        fun callControlId(callControlId: Optional<String>) =
            callControlId(callControlId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [clientState]
         * - [commandId]
         * - [connectorName]
         * - [currency]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Amount to charge. Required when `transaction_type` is `charge`. */
        fun amount(amount: Double) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { body.amount(amount) }

        /** Base64-encoded state included in subsequent webhooks. */
        fun clientState(clientState: String) = apply { body.clientState(clientState) }

        /**
         * Sets [Builder.clientState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientState(clientState: JsonField<String>) = apply { body.clientState(clientState) }

        /**
         * Idempotency key for the command. Telnyx ignores a duplicate command with the same
         * `command_id` for the same `call_control_id`.
         */
        fun commandId(commandId: String) = apply { body.commandId(commandId) }

        /**
         * Sets [Builder.commandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commandId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commandId(commandId: JsonField<String>) = apply { body.commandId(commandId) }

        /** Name of the Pay connector used to process the transaction. */
        fun connectorName(connectorName: String) = apply { body.connectorName(connectorName) }

        /**
         * Sets [Builder.connectorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectorName(connectorName: JsonField<String>) = apply {
            body.connectorName(connectorName)
        }

        /** Currency used for the transaction. Pay currently supports USD only. */
        fun currency(currency: Currency) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { body.currency(currency) }

        /** Optional description forwarded with the payment transaction. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Time in milliseconds to wait between consecutive DTMF digits. */
        fun interDigitTimeoutMillis(interDigitTimeoutMillis: Int) = apply {
            body.interDigitTimeoutMillis(interDigitTimeoutMillis)
        }

        /**
         * Sets [Builder.interDigitTimeoutMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interDigitTimeoutMillis] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interDigitTimeoutMillis(interDigitTimeoutMillis: JsonField<Int>) = apply {
            body.interDigitTimeoutMillis(interDigitTimeoutMillis)
        }

        /** Language used for payment prompts. */
        fun language(language: String) = apply { body.language(language) }

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { body.language(language) }

        /** Maximum number of attempts for each payment collection step. */
        fun maxAttempts(maxAttempts: Int) = apply { body.maxAttempts(maxAttempts) }

        /**
         * Sets [Builder.maxAttempts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxAttempts] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxAttempts(maxAttempts: JsonField<Int>) = apply { body.maxAttempts(maxAttempts) }

        /** Metadata forwarded to the Pay connector. */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Additional parameters forwarded to the Pay connector. */
        fun parameters(parameters: Parameters) = apply { body.parameters(parameters) }

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed [Parameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parameters(parameters: JsonField<Parameters>) = apply { body.parameters(parameters) }

        /** Payment method to collect. */
        fun paymentMethod(paymentMethod: PaymentMethod) = apply {
            body.paymentMethod(paymentMethod)
        }

        /**
         * Sets [Builder.paymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentMethod] with a well-typed [PaymentMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
            body.paymentMethod(paymentMethod)
        }

        /** Existing payment token. When supplied, payment-detail collection is skipped. */
        fun paymentToken(paymentToken: String) = apply { body.paymentToken(paymentToken) }

        /**
         * Sets [Builder.paymentToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentToken(paymentToken: JsonField<String>) = apply {
            body.paymentToken(paymentToken)
        }

        /** Custom text-to-speech prompts keyed by payment collection step. */
        fun prompts(prompts: Prompts) = apply { body.prompts(prompts) }

        /**
         * Sets [Builder.prompts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompts] with a well-typed [Prompts] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prompts(prompts: JsonField<Prompts>) = apply { body.prompts(prompts) }

        /** Speech synthesis service level used for payment prompts. Pay defaults to `premium`. */
        fun serviceLevel(serviceLevel: String) = apply { body.serviceLevel(serviceLevel) }

        /**
         * Sets [Builder.serviceLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceLevel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serviceLevel(serviceLevel: JsonField<String>) = apply {
            body.serviceLevel(serviceLevel)
        }

        /** Time in milliseconds to wait for DTMF input for each collection step. */
        fun timeoutMillis(timeoutMillis: Int) = apply { body.timeoutMillis(timeoutMillis) }

        /**
         * Sets [Builder.timeoutMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutMillis] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeoutMillis(timeoutMillis: JsonField<Int>) = apply {
            body.timeoutMillis(timeoutMillis)
        }

        /**
         * Transaction to perform. If omitted, Pay infers `tokenize` when `amount` is absent or zero
         * and `charge` when `amount` is positive.
         */
        fun transactionType(transactionType: TransactionType) = apply {
            body.transactionType(transactionType)
        }

        /**
         * Sets [Builder.transactionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionType] with a well-typed [TransactionType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transactionType(transactionType: JsonField<TransactionType>) = apply {
            body.transactionType(transactionType)
        }

        /**
         * Voice used for payment prompts. Accepts `male`, `female`, or a provider voice in
         * `<Provider>.<Model>.<VoiceId>` format, for example `AWS.Polly.Joanna` or
         * `Telnyx.KokoroTTS.af`.
         */
        fun voice(voice: String) = apply { body.voice(voice) }

        /**
         * Sets [Builder.voice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voice] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voice(voice: JsonField<String>) = apply { body.voice(voice) }

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
         * Returns an immutable instance of [ActionPayParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionPayParams =
            ActionPayParams(
                callControlId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> callControlId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Double>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val connectorName: JsonField<String>,
        private val currency: JsonField<Currency>,
        private val description: JsonField<String>,
        private val interDigitTimeoutMillis: JsonField<Int>,
        private val language: JsonField<String>,
        private val maxAttempts: JsonField<Int>,
        private val metadata: JsonField<Metadata>,
        private val parameters: JsonField<Parameters>,
        private val paymentMethod: JsonField<PaymentMethod>,
        private val paymentToken: JsonField<String>,
        private val prompts: JsonField<Prompts>,
        private val serviceLevel: JsonField<String>,
        private val timeoutMillis: JsonField<Int>,
        private val transactionType: JsonField<TransactionType>,
        private val voice: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connector_name")
            @ExcludeMissing
            connectorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inter_digit_timeout_millis")
            @ExcludeMissing
            interDigitTimeoutMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_attempts")
            @ExcludeMissing
            maxAttempts: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("parameters")
            @ExcludeMissing
            parameters: JsonField<Parameters> = JsonMissing.of(),
            @JsonProperty("payment_method")
            @ExcludeMissing
            paymentMethod: JsonField<PaymentMethod> = JsonMissing.of(),
            @JsonProperty("payment_token")
            @ExcludeMissing
            paymentToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompts") @ExcludeMissing prompts: JsonField<Prompts> = JsonMissing.of(),
            @JsonProperty("service_level")
            @ExcludeMissing
            serviceLevel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeout_millis")
            @ExcludeMissing
            timeoutMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("transaction_type")
            @ExcludeMissing
            transactionType: JsonField<TransactionType> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
        ) : this(
            amount,
            clientState,
            commandId,
            connectorName,
            currency,
            description,
            interDigitTimeoutMillis,
            language,
            maxAttempts,
            metadata,
            parameters,
            paymentMethod,
            paymentToken,
            prompts,
            serviceLevel,
            timeoutMillis,
            transactionType,
            voice,
            mutableMapOf(),
        )

        /**
         * Amount to charge. Required when `transaction_type` is `charge`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<Double> = amount.getOptional("amount")

        /**
         * Base64-encoded state included in subsequent webhooks.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientState(): Optional<String> = clientState.getOptional("client_state")

        /**
         * Idempotency key for the command. Telnyx ignores a duplicate command with the same
         * `command_id` for the same `call_control_id`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commandId(): Optional<String> = commandId.getOptional("command_id")

        /**
         * Name of the Pay connector used to process the transaction.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectorName(): Optional<String> = connectorName.getOptional("connector_name")

        /**
         * Currency used for the transaction. Pay currently supports USD only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<Currency> = currency.getOptional("currency")

        /**
         * Optional description forwarded with the payment transaction.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Time in milliseconds to wait between consecutive DTMF digits.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interDigitTimeoutMillis(): Optional<Int> =
            interDigitTimeoutMillis.getOptional("inter_digit_timeout_millis")

        /**
         * Language used for payment prompts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * Maximum number of attempts for each payment collection step.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxAttempts(): Optional<Int> = maxAttempts.getOptional("max_attempts")

        /**
         * Metadata forwarded to the Pay connector.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Additional parameters forwarded to the Pay connector.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parameters(): Optional<Parameters> = parameters.getOptional("parameters")

        /**
         * Payment method to collect.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentMethod(): Optional<PaymentMethod> = paymentMethod.getOptional("payment_method")

        /**
         * Existing payment token. When supplied, payment-detail collection is skipped.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentToken(): Optional<String> = paymentToken.getOptional("payment_token")

        /**
         * Custom text-to-speech prompts keyed by payment collection step.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prompts(): Optional<Prompts> = prompts.getOptional("prompts")

        /**
         * Speech synthesis service level used for payment prompts. Pay defaults to `premium`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun serviceLevel(): Optional<String> = serviceLevel.getOptional("service_level")

        /**
         * Time in milliseconds to wait for DTMF input for each collection step.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeoutMillis(): Optional<Int> = timeoutMillis.getOptional("timeout_millis")

        /**
         * Transaction to perform. If omitted, Pay infers `tokenize` when `amount` is absent or zero
         * and `charge` when `amount` is positive.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transactionType(): Optional<TransactionType> =
            transactionType.getOptional("transaction_type")

        /**
         * Voice used for payment prompts. Accepts `male`, `female`, or a provider voice in
         * `<Provider>.<Model>.<VoiceId>` format, for example `AWS.Polly.Joanna` or
         * `Telnyx.KokoroTTS.af`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voice(): Optional<String> = voice.getOptional("voice")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [clientState].
         *
         * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_state")
        @ExcludeMissing
        fun _clientState(): JsonField<String> = clientState

        /**
         * Returns the raw JSON value of [commandId].
         *
         * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("command_id") @ExcludeMissing fun _commandId(): JsonField<String> = commandId

        /**
         * Returns the raw JSON value of [connectorName].
         *
         * Unlike [connectorName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connector_name")
        @ExcludeMissing
        fun _connectorName(): JsonField<String> = connectorName

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [interDigitTimeoutMillis].
         *
         * Unlike [interDigitTimeoutMillis], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inter_digit_timeout_millis")
        @ExcludeMissing
        fun _interDigitTimeoutMillis(): JsonField<Int> = interDigitTimeoutMillis

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [maxAttempts].
         *
         * Unlike [maxAttempts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_attempts")
        @ExcludeMissing
        fun _maxAttempts(): JsonField<Int> = maxAttempts

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [parameters].
         *
         * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonField<Parameters> = parameters

        /**
         * Returns the raw JSON value of [paymentMethod].
         *
         * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_method")
        @ExcludeMissing
        fun _paymentMethod(): JsonField<PaymentMethod> = paymentMethod

        /**
         * Returns the raw JSON value of [paymentToken].
         *
         * Unlike [paymentToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_token")
        @ExcludeMissing
        fun _paymentToken(): JsonField<String> = paymentToken

        /**
         * Returns the raw JSON value of [prompts].
         *
         * Unlike [prompts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompts") @ExcludeMissing fun _prompts(): JsonField<Prompts> = prompts

        /**
         * Returns the raw JSON value of [serviceLevel].
         *
         * Unlike [serviceLevel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("service_level")
        @ExcludeMissing
        fun _serviceLevel(): JsonField<String> = serviceLevel

        /**
         * Returns the raw JSON value of [timeoutMillis].
         *
         * Unlike [timeoutMillis], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeout_millis")
        @ExcludeMissing
        fun _timeoutMillis(): JsonField<Int> = timeoutMillis

        /**
         * Returns the raw JSON value of [transactionType].
         *
         * Unlike [transactionType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transaction_type")
        @ExcludeMissing
        fun _transactionType(): JsonField<TransactionType> = transactionType

        /**
         * Returns the raw JSON value of [voice].
         *
         * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<String> = voice

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

            private var amount: JsonField<Double> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var connectorName: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var interDigitTimeoutMillis: JsonField<Int> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var maxAttempts: JsonField<Int> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var parameters: JsonField<Parameters> = JsonMissing.of()
            private var paymentMethod: JsonField<PaymentMethod> = JsonMissing.of()
            private var paymentToken: JsonField<String> = JsonMissing.of()
            private var prompts: JsonField<Prompts> = JsonMissing.of()
            private var serviceLevel: JsonField<String> = JsonMissing.of()
            private var timeoutMillis: JsonField<Int> = JsonMissing.of()
            private var transactionType: JsonField<TransactionType> = JsonMissing.of()
            private var voice: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                amount = body.amount
                clientState = body.clientState
                commandId = body.commandId
                connectorName = body.connectorName
                currency = body.currency
                description = body.description
                interDigitTimeoutMillis = body.interDigitTimeoutMillis
                language = body.language
                maxAttempts = body.maxAttempts
                metadata = body.metadata
                parameters = body.parameters
                paymentMethod = body.paymentMethod
                paymentToken = body.paymentToken
                prompts = body.prompts
                serviceLevel = body.serviceLevel
                timeoutMillis = body.timeoutMillis
                transactionType = body.transactionType
                voice = body.voice
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Amount to charge. Required when `transaction_type` is `charge`. */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** Base64-encoded state included in subsequent webhooks. */
            fun clientState(clientState: String) = clientState(JsonField.of(clientState))

            /**
             * Sets [Builder.clientState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientState(clientState: JsonField<String>) = apply {
                this.clientState = clientState
            }

            /**
             * Idempotency key for the command. Telnyx ignores a duplicate command with the same
             * `command_id` for the same `call_control_id`.
             */
            fun commandId(commandId: String) = commandId(JsonField.of(commandId))

            /**
             * Sets [Builder.commandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commandId(commandId: JsonField<String>) = apply { this.commandId = commandId }

            /** Name of the Pay connector used to process the transaction. */
            fun connectorName(connectorName: String) = connectorName(JsonField.of(connectorName))

            /**
             * Sets [Builder.connectorName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectorName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectorName(connectorName: JsonField<String>) = apply {
                this.connectorName = connectorName
            }

            /** Currency used for the transaction. Pay currently supports USD only. */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Optional description forwarded with the payment transaction. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Time in milliseconds to wait between consecutive DTMF digits. */
            fun interDigitTimeoutMillis(interDigitTimeoutMillis: Int) =
                interDigitTimeoutMillis(JsonField.of(interDigitTimeoutMillis))

            /**
             * Sets [Builder.interDigitTimeoutMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interDigitTimeoutMillis] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun interDigitTimeoutMillis(interDigitTimeoutMillis: JsonField<Int>) = apply {
                this.interDigitTimeoutMillis = interDigitTimeoutMillis
            }

            /** Language used for payment prompts. */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /** Maximum number of attempts for each payment collection step. */
            fun maxAttempts(maxAttempts: Int) = maxAttempts(JsonField.of(maxAttempts))

            /**
             * Sets [Builder.maxAttempts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxAttempts] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxAttempts(maxAttempts: JsonField<Int>) = apply { this.maxAttempts = maxAttempts }

            /** Metadata forwarded to the Pay connector. */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Additional parameters forwarded to the Pay connector. */
            fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

            /**
             * Sets [Builder.parameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parameters] with a well-typed [Parameters] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parameters(parameters: JsonField<Parameters>) = apply {
                this.parameters = parameters
            }

            /** Payment method to collect. */
            fun paymentMethod(paymentMethod: PaymentMethod) =
                paymentMethod(JsonField.of(paymentMethod))

            /**
             * Sets [Builder.paymentMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentMethod] with a well-typed [PaymentMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
                this.paymentMethod = paymentMethod
            }

            /** Existing payment token. When supplied, payment-detail collection is skipped. */
            fun paymentToken(paymentToken: String) = paymentToken(JsonField.of(paymentToken))

            /**
             * Sets [Builder.paymentToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentToken(paymentToken: JsonField<String>) = apply {
                this.paymentToken = paymentToken
            }

            /** Custom text-to-speech prompts keyed by payment collection step. */
            fun prompts(prompts: Prompts) = prompts(JsonField.of(prompts))

            /**
             * Sets [Builder.prompts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prompts] with a well-typed [Prompts] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prompts(prompts: JsonField<Prompts>) = apply { this.prompts = prompts }

            /**
             * Speech synthesis service level used for payment prompts. Pay defaults to `premium`.
             */
            fun serviceLevel(serviceLevel: String) = serviceLevel(JsonField.of(serviceLevel))

            /**
             * Sets [Builder.serviceLevel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serviceLevel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun serviceLevel(serviceLevel: JsonField<String>) = apply {
                this.serviceLevel = serviceLevel
            }

            /** Time in milliseconds to wait for DTMF input for each collection step. */
            fun timeoutMillis(timeoutMillis: Int) = timeoutMillis(JsonField.of(timeoutMillis))

            /**
             * Sets [Builder.timeoutMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeoutMillis] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeoutMillis(timeoutMillis: JsonField<Int>) = apply {
                this.timeoutMillis = timeoutMillis
            }

            /**
             * Transaction to perform. If omitted, Pay infers `tokenize` when `amount` is absent or
             * zero and `charge` when `amount` is positive.
             */
            fun transactionType(transactionType: TransactionType) =
                transactionType(JsonField.of(transactionType))

            /**
             * Sets [Builder.transactionType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionType] with a well-typed [TransactionType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transactionType(transactionType: JsonField<TransactionType>) = apply {
                this.transactionType = transactionType
            }

            /**
             * Voice used for payment prompts. Accepts `male`, `female`, or a provider voice in
             * `<Provider>.<Model>.<VoiceId>` format, for example `AWS.Polly.Joanna` or
             * `Telnyx.KokoroTTS.af`.
             */
            fun voice(voice: String) = voice(JsonField.of(voice))

            /**
             * Sets [Builder.voice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voice] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voice(voice: JsonField<String>) = apply { this.voice = voice }

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
                    amount,
                    clientState,
                    commandId,
                    connectorName,
                    currency,
                    description,
                    interDigitTimeoutMillis,
                    language,
                    maxAttempts,
                    metadata,
                    parameters,
                    paymentMethod,
                    paymentToken,
                    prompts,
                    serviceLevel,
                    timeoutMillis,
                    transactionType,
                    voice,
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

            amount()
            clientState()
            commandId()
            connectorName()
            currency().ifPresent { it.validate() }
            description()
            interDigitTimeoutMillis()
            language()
            maxAttempts()
            metadata().ifPresent { it.validate() }
            parameters().ifPresent { it.validate() }
            paymentMethod().ifPresent { it.validate() }
            paymentToken()
            prompts().ifPresent { it.validate() }
            serviceLevel()
            timeoutMillis()
            transactionType().ifPresent { it.validate() }
            voice()
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
            (if (amount.asKnown().isPresent) 1 else 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (if (connectorName.asKnown().isPresent) 1 else 0) +
                (currency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (interDigitTimeoutMillis.asKnown().isPresent) 1 else 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (if (maxAttempts.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (parameters.asKnown().getOrNull()?.validity() ?: 0) +
                (paymentMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (paymentToken.asKnown().isPresent) 1 else 0) +
                (prompts.asKnown().getOrNull()?.validity() ?: 0) +
                (if (serviceLevel.asKnown().isPresent) 1 else 0) +
                (if (timeoutMillis.asKnown().isPresent) 1 else 0) +
                (transactionType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (voice.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                amount == other.amount &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                connectorName == other.connectorName &&
                currency == other.currency &&
                description == other.description &&
                interDigitTimeoutMillis == other.interDigitTimeoutMillis &&
                language == other.language &&
                maxAttempts == other.maxAttempts &&
                metadata == other.metadata &&
                parameters == other.parameters &&
                paymentMethod == other.paymentMethod &&
                paymentToken == other.paymentToken &&
                prompts == other.prompts &&
                serviceLevel == other.serviceLevel &&
                timeoutMillis == other.timeoutMillis &&
                transactionType == other.transactionType &&
                voice == other.voice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                clientState,
                commandId,
                connectorName,
                currency,
                description,
                interDigitTimeoutMillis,
                language,
                maxAttempts,
                metadata,
                parameters,
                paymentMethod,
                paymentToken,
                prompts,
                serviceLevel,
                timeoutMillis,
                transactionType,
                voice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, clientState=$clientState, commandId=$commandId, connectorName=$connectorName, currency=$currency, description=$description, interDigitTimeoutMillis=$interDigitTimeoutMillis, language=$language, maxAttempts=$maxAttempts, metadata=$metadata, parameters=$parameters, paymentMethod=$paymentMethod, paymentToken=$paymentToken, prompts=$prompts, serviceLevel=$serviceLevel, timeoutMillis=$timeoutMillis, transactionType=$transactionType, voice=$voice, additionalProperties=$additionalProperties}"
    }

    /** Currency used for the transaction. Pay currently supports USD only. */
    class Currency @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val USD = of("USD")

            @JvmField val USD_2 = of("usd")

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        /** An enum containing [Currency]'s known values. */
        enum class Known {
            USD,
            USD_2,
        }

        /**
         * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Currency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USD,
            USD_2,
            /** An enum member indicating that [Currency] was instantiated with an unknown value. */
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
                USD -> Value.USD
                USD_2 -> Value.USD_2
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
                USD -> Known.USD
                USD_2 -> Known.USD_2
                else -> throw TelnyxInvalidDataException("Unknown Currency: $value")
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
        fun validate(): Currency = apply {
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

            return other is Currency && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Metadata forwarded to the Pay connector. */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** Additional parameters forwarded to the Pay connector. */
    class Parameters
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Parameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Parameters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parameters: Parameters) = apply {
                additionalProperties = parameters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Parameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Parameters = Parameters(additionalProperties.toImmutable())
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
        fun validate(): Parameters = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Parameters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Parameters{additionalProperties=$additionalProperties}"
    }

    /** Payment method to collect. */
    class PaymentMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CREDIT_CARD = of("credit-card")

            @JvmField val ACH_DEBIT = of("ach-debit")

            @JvmStatic fun of(value: String) = PaymentMethod(JsonField.of(value))
        }

        /** An enum containing [PaymentMethod]'s known values. */
        enum class Known {
            CREDIT_CARD,
            ACH_DEBIT,
        }

        /**
         * An enum containing [PaymentMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaymentMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT_CARD,
            ACH_DEBIT,
            /**
             * An enum member indicating that [PaymentMethod] was instantiated with an unknown
             * value.
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
                CREDIT_CARD -> Value.CREDIT_CARD
                ACH_DEBIT -> Value.ACH_DEBIT
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
                CREDIT_CARD -> Known.CREDIT_CARD
                ACH_DEBIT -> Known.ACH_DEBIT
                else -> throw TelnyxInvalidDataException("Unknown PaymentMethod: $value")
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
        fun validate(): PaymentMethod = apply {
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

            return other is PaymentMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Custom text-to-speech prompts keyed by payment collection step. */
    class Prompts
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bankAccountNumber: JsonField<PayPromptValue>,
        private val bankRoutingNumber: JsonField<PayPromptValue>,
        private val expirationDate: JsonField<PayPromptValue>,
        private val paymentCardNumber: JsonField<PayPromptValue>,
        private val postalCode: JsonField<PayPromptValue>,
        private val securityCode: JsonField<PayPromptValue>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bank-account-number")
            @ExcludeMissing
            bankAccountNumber: JsonField<PayPromptValue> = JsonMissing.of(),
            @JsonProperty("bank-routing-number")
            @ExcludeMissing
            bankRoutingNumber: JsonField<PayPromptValue> = JsonMissing.of(),
            @JsonProperty("expiration-date")
            @ExcludeMissing
            expirationDate: JsonField<PayPromptValue> = JsonMissing.of(),
            @JsonProperty("payment-card-number")
            @ExcludeMissing
            paymentCardNumber: JsonField<PayPromptValue> = JsonMissing.of(),
            @JsonProperty("postal-code")
            @ExcludeMissing
            postalCode: JsonField<PayPromptValue> = JsonMissing.of(),
            @JsonProperty("security-code")
            @ExcludeMissing
            securityCode: JsonField<PayPromptValue> = JsonMissing.of(),
        ) : this(
            bankAccountNumber,
            bankRoutingNumber,
            expirationDate,
            paymentCardNumber,
            postalCode,
            securityCode,
            mutableMapOf(),
        )

        /**
         * A default prompt string or an ordered list of qualified prompts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bankAccountNumber(): Optional<PayPromptValue> =
            bankAccountNumber.getOptional("bank-account-number")

        /**
         * A default prompt string or an ordered list of qualified prompts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bankRoutingNumber(): Optional<PayPromptValue> =
            bankRoutingNumber.getOptional("bank-routing-number")

        /**
         * A default prompt string or an ordered list of qualified prompts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expirationDate(): Optional<PayPromptValue> =
            expirationDate.getOptional("expiration-date")

        /**
         * A default prompt string or an ordered list of qualified prompts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentCardNumber(): Optional<PayPromptValue> =
            paymentCardNumber.getOptional("payment-card-number")

        /**
         * A default prompt string or an ordered list of qualified prompts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun postalCode(): Optional<PayPromptValue> = postalCode.getOptional("postal-code")

        /**
         * A default prompt string or an ordered list of qualified prompts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun securityCode(): Optional<PayPromptValue> = securityCode.getOptional("security-code")

        /**
         * Returns the raw JSON value of [bankAccountNumber].
         *
         * Unlike [bankAccountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bank-account-number")
        @ExcludeMissing
        fun _bankAccountNumber(): JsonField<PayPromptValue> = bankAccountNumber

        /**
         * Returns the raw JSON value of [bankRoutingNumber].
         *
         * Unlike [bankRoutingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bank-routing-number")
        @ExcludeMissing
        fun _bankRoutingNumber(): JsonField<PayPromptValue> = bankRoutingNumber

        /**
         * Returns the raw JSON value of [expirationDate].
         *
         * Unlike [expirationDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expiration-date")
        @ExcludeMissing
        fun _expirationDate(): JsonField<PayPromptValue> = expirationDate

        /**
         * Returns the raw JSON value of [paymentCardNumber].
         *
         * Unlike [paymentCardNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment-card-number")
        @ExcludeMissing
        fun _paymentCardNumber(): JsonField<PayPromptValue> = paymentCardNumber

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal-code")
        @ExcludeMissing
        fun _postalCode(): JsonField<PayPromptValue> = postalCode

        /**
         * Returns the raw JSON value of [securityCode].
         *
         * Unlike [securityCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("security-code")
        @ExcludeMissing
        fun _securityCode(): JsonField<PayPromptValue> = securityCode

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

            /** Returns a mutable builder for constructing an instance of [Prompts]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Prompts]. */
        class Builder internal constructor() {

            private var bankAccountNumber: JsonField<PayPromptValue> = JsonMissing.of()
            private var bankRoutingNumber: JsonField<PayPromptValue> = JsonMissing.of()
            private var expirationDate: JsonField<PayPromptValue> = JsonMissing.of()
            private var paymentCardNumber: JsonField<PayPromptValue> = JsonMissing.of()
            private var postalCode: JsonField<PayPromptValue> = JsonMissing.of()
            private var securityCode: JsonField<PayPromptValue> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(prompts: Prompts) = apply {
                bankAccountNumber = prompts.bankAccountNumber
                bankRoutingNumber = prompts.bankRoutingNumber
                expirationDate = prompts.expirationDate
                paymentCardNumber = prompts.paymentCardNumber
                postalCode = prompts.postalCode
                securityCode = prompts.securityCode
                additionalProperties = prompts.additionalProperties.toMutableMap()
            }

            /** A default prompt string or an ordered list of qualified prompts. */
            fun bankAccountNumber(bankAccountNumber: PayPromptValue) =
                bankAccountNumber(JsonField.of(bankAccountNumber))

            /**
             * Sets [Builder.bankAccountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankAccountNumber] with a well-typed
             * [PayPromptValue] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun bankAccountNumber(bankAccountNumber: JsonField<PayPromptValue>) = apply {
                this.bankAccountNumber = bankAccountNumber
            }

            /** Alias for calling [bankAccountNumber] with `PayPromptValue.ofString(string)`. */
            fun bankAccountNumber(string: String) =
                bankAccountNumber(PayPromptValue.ofString(string))

            /** Alias for calling [bankAccountNumber] with `PayPromptValue.ofPrompts(prompts)`. */
            fun bankAccountNumberOfPrompts(prompts: List<PayPromptValue.PayPrompt>) =
                bankAccountNumber(PayPromptValue.ofPrompts(prompts))

            /** A default prompt string or an ordered list of qualified prompts. */
            fun bankRoutingNumber(bankRoutingNumber: PayPromptValue) =
                bankRoutingNumber(JsonField.of(bankRoutingNumber))

            /**
             * Sets [Builder.bankRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankRoutingNumber] with a well-typed
             * [PayPromptValue] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun bankRoutingNumber(bankRoutingNumber: JsonField<PayPromptValue>) = apply {
                this.bankRoutingNumber = bankRoutingNumber
            }

            /** Alias for calling [bankRoutingNumber] with `PayPromptValue.ofString(string)`. */
            fun bankRoutingNumber(string: String) =
                bankRoutingNumber(PayPromptValue.ofString(string))

            /** Alias for calling [bankRoutingNumber] with `PayPromptValue.ofPrompts(prompts)`. */
            fun bankRoutingNumberOfPrompts(prompts: List<PayPromptValue.PayPrompt>) =
                bankRoutingNumber(PayPromptValue.ofPrompts(prompts))

            /** A default prompt string or an ordered list of qualified prompts. */
            fun expirationDate(expirationDate: PayPromptValue) =
                expirationDate(JsonField.of(expirationDate))

            /**
             * Sets [Builder.expirationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expirationDate] with a well-typed [PayPromptValue]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun expirationDate(expirationDate: JsonField<PayPromptValue>) = apply {
                this.expirationDate = expirationDate
            }

            /** Alias for calling [expirationDate] with `PayPromptValue.ofString(string)`. */
            fun expirationDate(string: String) = expirationDate(PayPromptValue.ofString(string))

            /** Alias for calling [expirationDate] with `PayPromptValue.ofPrompts(prompts)`. */
            fun expirationDateOfPrompts(prompts: List<PayPromptValue.PayPrompt>) =
                expirationDate(PayPromptValue.ofPrompts(prompts))

            /** A default prompt string or an ordered list of qualified prompts. */
            fun paymentCardNumber(paymentCardNumber: PayPromptValue) =
                paymentCardNumber(JsonField.of(paymentCardNumber))

            /**
             * Sets [Builder.paymentCardNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentCardNumber] with a well-typed
             * [PayPromptValue] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun paymentCardNumber(paymentCardNumber: JsonField<PayPromptValue>) = apply {
                this.paymentCardNumber = paymentCardNumber
            }

            /** Alias for calling [paymentCardNumber] with `PayPromptValue.ofString(string)`. */
            fun paymentCardNumber(string: String) =
                paymentCardNumber(PayPromptValue.ofString(string))

            /** Alias for calling [paymentCardNumber] with `PayPromptValue.ofPrompts(prompts)`. */
            fun paymentCardNumberOfPrompts(prompts: List<PayPromptValue.PayPrompt>) =
                paymentCardNumber(PayPromptValue.ofPrompts(prompts))

            /** A default prompt string or an ordered list of qualified prompts. */
            fun postalCode(postalCode: PayPromptValue) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [PayPromptValue] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<PayPromptValue>) = apply {
                this.postalCode = postalCode
            }

            /** Alias for calling [postalCode] with `PayPromptValue.ofString(string)`. */
            fun postalCode(string: String) = postalCode(PayPromptValue.ofString(string))

            /** Alias for calling [postalCode] with `PayPromptValue.ofPrompts(prompts)`. */
            fun postalCodeOfPrompts(prompts: List<PayPromptValue.PayPrompt>) =
                postalCode(PayPromptValue.ofPrompts(prompts))

            /** A default prompt string or an ordered list of qualified prompts. */
            fun securityCode(securityCode: PayPromptValue) =
                securityCode(JsonField.of(securityCode))

            /**
             * Sets [Builder.securityCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.securityCode] with a well-typed [PayPromptValue]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun securityCode(securityCode: JsonField<PayPromptValue>) = apply {
                this.securityCode = securityCode
            }

            /** Alias for calling [securityCode] with `PayPromptValue.ofString(string)`. */
            fun securityCode(string: String) = securityCode(PayPromptValue.ofString(string))

            /** Alias for calling [securityCode] with `PayPromptValue.ofPrompts(prompts)`. */
            fun securityCodeOfPrompts(prompts: List<PayPromptValue.PayPrompt>) =
                securityCode(PayPromptValue.ofPrompts(prompts))

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
             * Returns an immutable instance of [Prompts].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Prompts =
                Prompts(
                    bankAccountNumber,
                    bankRoutingNumber,
                    expirationDate,
                    paymentCardNumber,
                    postalCode,
                    securityCode,
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
        fun validate(): Prompts = apply {
            if (validated) {
                return@apply
            }

            bankAccountNumber().ifPresent { it.validate() }
            bankRoutingNumber().ifPresent { it.validate() }
            expirationDate().ifPresent { it.validate() }
            paymentCardNumber().ifPresent { it.validate() }
            postalCode().ifPresent { it.validate() }
            securityCode().ifPresent { it.validate() }
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
            (bankAccountNumber.asKnown().getOrNull()?.validity() ?: 0) +
                (bankRoutingNumber.asKnown().getOrNull()?.validity() ?: 0) +
                (expirationDate.asKnown().getOrNull()?.validity() ?: 0) +
                (paymentCardNumber.asKnown().getOrNull()?.validity() ?: 0) +
                (postalCode.asKnown().getOrNull()?.validity() ?: 0) +
                (securityCode.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Prompts &&
                bankAccountNumber == other.bankAccountNumber &&
                bankRoutingNumber == other.bankRoutingNumber &&
                expirationDate == other.expirationDate &&
                paymentCardNumber == other.paymentCardNumber &&
                postalCode == other.postalCode &&
                securityCode == other.securityCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                bankAccountNumber,
                bankRoutingNumber,
                expirationDate,
                paymentCardNumber,
                postalCode,
                securityCode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Prompts{bankAccountNumber=$bankAccountNumber, bankRoutingNumber=$bankRoutingNumber, expirationDate=$expirationDate, paymentCardNumber=$paymentCardNumber, postalCode=$postalCode, securityCode=$securityCode, additionalProperties=$additionalProperties}"
    }

    /**
     * Transaction to perform. If omitted, Pay infers `tokenize` when `amount` is absent or zero and
     * `charge` when `amount` is positive.
     */
    class TransactionType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CHARGE = of("charge")

            @JvmField val TOKENIZE = of("tokenize")

            @JvmStatic fun of(value: String) = TransactionType(JsonField.of(value))
        }

        /** An enum containing [TransactionType]'s known values. */
        enum class Known {
            CHARGE,
            TOKENIZE,
        }

        /**
         * An enum containing [TransactionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransactionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHARGE,
            TOKENIZE,
            /**
             * An enum member indicating that [TransactionType] was instantiated with an unknown
             * value.
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
                CHARGE -> Value.CHARGE
                TOKENIZE -> Value.TOKENIZE
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
                CHARGE -> Known.CHARGE
                TOKENIZE -> Known.TOKENIZE
                else -> throw TelnyxInvalidDataException("Unknown TransactionType: $value")
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
        fun validate(): TransactionType = apply {
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

            return other is TransactionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionPayParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionPayParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
