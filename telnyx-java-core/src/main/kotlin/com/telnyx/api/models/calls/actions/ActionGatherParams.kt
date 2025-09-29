// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Gather DTMF signals to build interactive menus.
 *
 * You can pass a list of valid digits. The `Answer` command must be issued before the `gather`
 * command.
 *
 * **Expected Webhooks:**
 * - `call.dtmf.received` (you may receive many of these webhooks)
 * - `call.gather.ended`
 */
class ActionGatherParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded
     * string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = body.clientState()

    /**
     * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
     * `command_id` for the same `call_control_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commandId(): Optional<String> = body.commandId()

    /**
     * An id that will be sent back in the corresponding `call.gather.ended` webhook. Will be
     * randomly generated if not specified.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gatherId(): Optional<String> = body.gatherId()

    /**
     * The number of milliseconds to wait for the first DTMF.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun initialTimeoutMillis(): Optional<Int> = body.initialTimeoutMillis()

    /**
     * The number of milliseconds to wait for input between digits.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interDigitTimeoutMillis(): Optional<Int> = body.interDigitTimeoutMillis()

    /**
     * The maximum number of digits to fetch. This parameter has a maximum value of 128.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maximumDigits(): Optional<Int> = body.maximumDigits()

    /**
     * The minimum number of digits to fetch. This parameter has a minimum value of 1.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumDigits(): Optional<Int> = body.minimumDigits()

    /**
     * The digit used to terminate input if fewer than `maximum_digits` digits have been gathered.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun terminatingDigit(): Optional<String> = body.terminatingDigit()

    /**
     * The number of milliseconds to wait to complete the request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutMillis(): Optional<Int> = body.timeoutMillis()

    /**
     * A list of all digits accepted as valid.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validDigits(): Optional<String> = body.validDigits()

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
     * Returns the raw JSON value of [gatherId].
     *
     * Unlike [gatherId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _gatherId(): JsonField<String> = body._gatherId()

    /**
     * Returns the raw JSON value of [initialTimeoutMillis].
     *
     * Unlike [initialTimeoutMillis], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _initialTimeoutMillis(): JsonField<Int> = body._initialTimeoutMillis()

    /**
     * Returns the raw JSON value of [interDigitTimeoutMillis].
     *
     * Unlike [interDigitTimeoutMillis], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _interDigitTimeoutMillis(): JsonField<Int> = body._interDigitTimeoutMillis()

    /**
     * Returns the raw JSON value of [maximumDigits].
     *
     * Unlike [maximumDigits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maximumDigits(): JsonField<Int> = body._maximumDigits()

    /**
     * Returns the raw JSON value of [minimumDigits].
     *
     * Unlike [minimumDigits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _minimumDigits(): JsonField<Int> = body._minimumDigits()

    /**
     * Returns the raw JSON value of [terminatingDigit].
     *
     * Unlike [terminatingDigit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _terminatingDigit(): JsonField<String> = body._terminatingDigit()

    /**
     * Returns the raw JSON value of [timeoutMillis].
     *
     * Unlike [timeoutMillis], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeoutMillis(): JsonField<Int> = body._timeoutMillis()

    /**
     * Returns the raw JSON value of [validDigits].
     *
     * Unlike [validDigits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _validDigits(): JsonField<String> = body._validDigits()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ActionGatherParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ActionGatherParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionGatherParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionGatherParams: ActionGatherParams) = apply {
            callControlId = actionGatherParams.callControlId
            body = actionGatherParams.body.toBuilder()
            additionalHeaders = actionGatherParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionGatherParams.additionalQueryParams.toBuilder()
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
         * - [clientState]
         * - [commandId]
         * - [gatherId]
         * - [initialTimeoutMillis]
         * - [interDigitTimeoutMillis]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         */
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
         * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
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

        /**
         * An id that will be sent back in the corresponding `call.gather.ended` webhook. Will be
         * randomly generated if not specified.
         */
        fun gatherId(gatherId: String) = apply { body.gatherId(gatherId) }

        /**
         * Sets [Builder.gatherId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gatherId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gatherId(gatherId: JsonField<String>) = apply { body.gatherId(gatherId) }

        /** The number of milliseconds to wait for the first DTMF. */
        fun initialTimeoutMillis(initialTimeoutMillis: Int) = apply {
            body.initialTimeoutMillis(initialTimeoutMillis)
        }

        /**
         * Sets [Builder.initialTimeoutMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialTimeoutMillis] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun initialTimeoutMillis(initialTimeoutMillis: JsonField<Int>) = apply {
            body.initialTimeoutMillis(initialTimeoutMillis)
        }

        /** The number of milliseconds to wait for input between digits. */
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

        /** The maximum number of digits to fetch. This parameter has a maximum value of 128. */
        fun maximumDigits(maximumDigits: Int) = apply { body.maximumDigits(maximumDigits) }

        /**
         * Sets [Builder.maximumDigits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumDigits] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maximumDigits(maximumDigits: JsonField<Int>) = apply {
            body.maximumDigits(maximumDigits)
        }

        /** The minimum number of digits to fetch. This parameter has a minimum value of 1. */
        fun minimumDigits(minimumDigits: Int) = apply { body.minimumDigits(minimumDigits) }

        /**
         * Sets [Builder.minimumDigits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumDigits] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minimumDigits(minimumDigits: JsonField<Int>) = apply {
            body.minimumDigits(minimumDigits)
        }

        /**
         * The digit used to terminate input if fewer than `maximum_digits` digits have been
         * gathered.
         */
        fun terminatingDigit(terminatingDigit: String) = apply {
            body.terminatingDigit(terminatingDigit)
        }

        /**
         * Sets [Builder.terminatingDigit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.terminatingDigit] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun terminatingDigit(terminatingDigit: JsonField<String>) = apply {
            body.terminatingDigit(terminatingDigit)
        }

        /** The number of milliseconds to wait to complete the request. */
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

        /** A list of all digits accepted as valid. */
        fun validDigits(validDigits: String) = apply { body.validDigits(validDigits) }

        /**
         * Sets [Builder.validDigits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validDigits] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun validDigits(validDigits: JsonField<String>) = apply { body.validDigits(validDigits) }

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
         * Returns an immutable instance of [ActionGatherParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionGatherParams =
            ActionGatherParams(
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

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val gatherId: JsonField<String>,
        private val initialTimeoutMillis: JsonField<Int>,
        private val interDigitTimeoutMillis: JsonField<Int>,
        private val maximumDigits: JsonField<Int>,
        private val minimumDigits: JsonField<Int>,
        private val terminatingDigit: JsonField<String>,
        private val timeoutMillis: JsonField<Int>,
        private val validDigits: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gather_id")
            @ExcludeMissing
            gatherId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("initial_timeout_millis")
            @ExcludeMissing
            initialTimeoutMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("inter_digit_timeout_millis")
            @ExcludeMissing
            interDigitTimeoutMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("maximum_digits")
            @ExcludeMissing
            maximumDigits: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("minimum_digits")
            @ExcludeMissing
            minimumDigits: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("terminating_digit")
            @ExcludeMissing
            terminatingDigit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeout_millis")
            @ExcludeMissing
            timeoutMillis: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("valid_digits")
            @ExcludeMissing
            validDigits: JsonField<String> = JsonMissing.of(),
        ) : this(
            clientState,
            commandId,
            gatherId,
            initialTimeoutMillis,
            interDigitTimeoutMillis,
            maximumDigits,
            minimumDigits,
            terminatingDigit,
            timeoutMillis,
            validDigits,
            mutableMapOf(),
        )

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientState(): Optional<String> = clientState.getOptional("client_state")

        /**
         * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
         * `command_id` for the same `call_control_id`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commandId(): Optional<String> = commandId.getOptional("command_id")

        /**
         * An id that will be sent back in the corresponding `call.gather.ended` webhook. Will be
         * randomly generated if not specified.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gatherId(): Optional<String> = gatherId.getOptional("gather_id")

        /**
         * The number of milliseconds to wait for the first DTMF.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun initialTimeoutMillis(): Optional<Int> =
            initialTimeoutMillis.getOptional("initial_timeout_millis")

        /**
         * The number of milliseconds to wait for input between digits.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interDigitTimeoutMillis(): Optional<Int> =
            interDigitTimeoutMillis.getOptional("inter_digit_timeout_millis")

        /**
         * The maximum number of digits to fetch. This parameter has a maximum value of 128.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximumDigits(): Optional<Int> = maximumDigits.getOptional("maximum_digits")

        /**
         * The minimum number of digits to fetch. This parameter has a minimum value of 1.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumDigits(): Optional<Int> = minimumDigits.getOptional("minimum_digits")

        /**
         * The digit used to terminate input if fewer than `maximum_digits` digits have been
         * gathered.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun terminatingDigit(): Optional<String> = terminatingDigit.getOptional("terminating_digit")

        /**
         * The number of milliseconds to wait to complete the request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeoutMillis(): Optional<Int> = timeoutMillis.getOptional("timeout_millis")

        /**
         * A list of all digits accepted as valid.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun validDigits(): Optional<String> = validDigits.getOptional("valid_digits")

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
         * Returns the raw JSON value of [gatherId].
         *
         * Unlike [gatherId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gather_id") @ExcludeMissing fun _gatherId(): JsonField<String> = gatherId

        /**
         * Returns the raw JSON value of [initialTimeoutMillis].
         *
         * Unlike [initialTimeoutMillis], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("initial_timeout_millis")
        @ExcludeMissing
        fun _initialTimeoutMillis(): JsonField<Int> = initialTimeoutMillis

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
         * Returns the raw JSON value of [maximumDigits].
         *
         * Unlike [maximumDigits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maximum_digits")
        @ExcludeMissing
        fun _maximumDigits(): JsonField<Int> = maximumDigits

        /**
         * Returns the raw JSON value of [minimumDigits].
         *
         * Unlike [minimumDigits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimum_digits")
        @ExcludeMissing
        fun _minimumDigits(): JsonField<Int> = minimumDigits

        /**
         * Returns the raw JSON value of [terminatingDigit].
         *
         * Unlike [terminatingDigit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("terminating_digit")
        @ExcludeMissing
        fun _terminatingDigit(): JsonField<String> = terminatingDigit

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
         * Returns the raw JSON value of [validDigits].
         *
         * Unlike [validDigits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("valid_digits")
        @ExcludeMissing
        fun _validDigits(): JsonField<String> = validDigits

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

            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var gatherId: JsonField<String> = JsonMissing.of()
            private var initialTimeoutMillis: JsonField<Int> = JsonMissing.of()
            private var interDigitTimeoutMillis: JsonField<Int> = JsonMissing.of()
            private var maximumDigits: JsonField<Int> = JsonMissing.of()
            private var minimumDigits: JsonField<Int> = JsonMissing.of()
            private var terminatingDigit: JsonField<String> = JsonMissing.of()
            private var timeoutMillis: JsonField<Int> = JsonMissing.of()
            private var validDigits: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                clientState = body.clientState
                commandId = body.commandId
                gatherId = body.gatherId
                initialTimeoutMillis = body.initialTimeoutMillis
                interDigitTimeoutMillis = body.interDigitTimeoutMillis
                maximumDigits = body.maximumDigits
                minimumDigits = body.minimumDigits
                terminatingDigit = body.terminatingDigit
                timeoutMillis = body.timeoutMillis
                validDigits = body.validDigits
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Use this field to add state to every subsequent webhook. It must be a valid Base-64
             * encoded string.
             */
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
             * Use this field to avoid duplicate commands. Telnyx will ignore any command with the
             * same `command_id` for the same `call_control_id`.
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

            /**
             * An id that will be sent back in the corresponding `call.gather.ended` webhook. Will
             * be randomly generated if not specified.
             */
            fun gatherId(gatherId: String) = gatherId(JsonField.of(gatherId))

            /**
             * Sets [Builder.gatherId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gatherId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gatherId(gatherId: JsonField<String>) = apply { this.gatherId = gatherId }

            /** The number of milliseconds to wait for the first DTMF. */
            fun initialTimeoutMillis(initialTimeoutMillis: Int) =
                initialTimeoutMillis(JsonField.of(initialTimeoutMillis))

            /**
             * Sets [Builder.initialTimeoutMillis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initialTimeoutMillis] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun initialTimeoutMillis(initialTimeoutMillis: JsonField<Int>) = apply {
                this.initialTimeoutMillis = initialTimeoutMillis
            }

            /** The number of milliseconds to wait for input between digits. */
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

            /** The maximum number of digits to fetch. This parameter has a maximum value of 128. */
            fun maximumDigits(maximumDigits: Int) = maximumDigits(JsonField.of(maximumDigits))

            /**
             * Sets [Builder.maximumDigits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumDigits] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumDigits(maximumDigits: JsonField<Int>) = apply {
                this.maximumDigits = maximumDigits
            }

            /** The minimum number of digits to fetch. This parameter has a minimum value of 1. */
            fun minimumDigits(minimumDigits: Int) = minimumDigits(JsonField.of(minimumDigits))

            /**
             * Sets [Builder.minimumDigits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumDigits] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimumDigits(minimumDigits: JsonField<Int>) = apply {
                this.minimumDigits = minimumDigits
            }

            /**
             * The digit used to terminate input if fewer than `maximum_digits` digits have been
             * gathered.
             */
            fun terminatingDigit(terminatingDigit: String) =
                terminatingDigit(JsonField.of(terminatingDigit))

            /**
             * Sets [Builder.terminatingDigit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.terminatingDigit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun terminatingDigit(terminatingDigit: JsonField<String>) = apply {
                this.terminatingDigit = terminatingDigit
            }

            /** The number of milliseconds to wait to complete the request. */
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

            /** A list of all digits accepted as valid. */
            fun validDigits(validDigits: String) = validDigits(JsonField.of(validDigits))

            /**
             * Sets [Builder.validDigits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.validDigits] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun validDigits(validDigits: JsonField<String>) = apply {
                this.validDigits = validDigits
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
                    clientState,
                    commandId,
                    gatherId,
                    initialTimeoutMillis,
                    interDigitTimeoutMillis,
                    maximumDigits,
                    minimumDigits,
                    terminatingDigit,
                    timeoutMillis,
                    validDigits,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            clientState()
            commandId()
            gatherId()
            initialTimeoutMillis()
            interDigitTimeoutMillis()
            maximumDigits()
            minimumDigits()
            terminatingDigit()
            timeoutMillis()
            validDigits()
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
            (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (if (gatherId.asKnown().isPresent) 1 else 0) +
                (if (initialTimeoutMillis.asKnown().isPresent) 1 else 0) +
                (if (interDigitTimeoutMillis.asKnown().isPresent) 1 else 0) +
                (if (maximumDigits.asKnown().isPresent) 1 else 0) +
                (if (minimumDigits.asKnown().isPresent) 1 else 0) +
                (if (terminatingDigit.asKnown().isPresent) 1 else 0) +
                (if (timeoutMillis.asKnown().isPresent) 1 else 0) +
                (if (validDigits.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                gatherId == other.gatherId &&
                initialTimeoutMillis == other.initialTimeoutMillis &&
                interDigitTimeoutMillis == other.interDigitTimeoutMillis &&
                maximumDigits == other.maximumDigits &&
                minimumDigits == other.minimumDigits &&
                terminatingDigit == other.terminatingDigit &&
                timeoutMillis == other.timeoutMillis &&
                validDigits == other.validDigits &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                clientState,
                commandId,
                gatherId,
                initialTimeoutMillis,
                interDigitTimeoutMillis,
                maximumDigits,
                minimumDigits,
                terminatingDigit,
                timeoutMillis,
                validDigits,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{clientState=$clientState, commandId=$commandId, gatherId=$gatherId, initialTimeoutMillis=$initialTimeoutMillis, interDigitTimeoutMillis=$interDigitTimeoutMillis, maximumDigits=$maximumDigits, minimumDigits=$minimumDigits, terminatingDigit=$terminatingDigit, timeoutMillis=$timeoutMillis, validDigits=$validDigits, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionGatherParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionGatherParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
