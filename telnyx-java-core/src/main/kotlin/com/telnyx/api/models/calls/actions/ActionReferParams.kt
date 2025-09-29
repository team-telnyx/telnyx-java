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
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.calls.CustomSipHeader
import com.telnyx.api.models.calls.SipHeader
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Initiate a SIP Refer on a Call Control call. You can initiate a SIP Refer at any point in the
 * duration of a call.
 *
 * **Expected Webhooks:**
 * - `call.refer.started`
 * - `call.refer.completed`
 * - `call.refer.failed`
 */
class ActionReferParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    /**
     * The SIP URI to which the call will be referred to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sipAddress(): String = body.sipAddress()

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded
     * string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = body.clientState()

    /**
     * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent
     * commands with the same `command_id` as one that has already been executed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commandId(): Optional<String> = body.commandId()

    /**
     * Custom headers to be added to the SIP INVITE.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customHeaders(): Optional<List<CustomSipHeader>> = body.customHeaders()

    /**
     * SIP Authentication password used for SIP challenges.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipAuthPassword(): Optional<String> = body.sipAuthPassword()

    /**
     * SIP Authentication username used for SIP challenges.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipAuthUsername(): Optional<String> = body.sipAuthUsername()

    /**
     * SIP headers to be added to the request. Currently only User-to-User header is supported.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipHeaders(): Optional<List<SipHeader>> = body.sipHeaders()

    /**
     * Returns the raw JSON value of [sipAddress].
     *
     * Unlike [sipAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sipAddress(): JsonField<String> = body._sipAddress()

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
     * Returns the raw JSON value of [customHeaders].
     *
     * Unlike [customHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customHeaders(): JsonField<List<CustomSipHeader>> = body._customHeaders()

    /**
     * Returns the raw JSON value of [sipAuthPassword].
     *
     * Unlike [sipAuthPassword], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sipAuthPassword(): JsonField<String> = body._sipAuthPassword()

    /**
     * Returns the raw JSON value of [sipAuthUsername].
     *
     * Unlike [sipAuthUsername], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sipAuthUsername(): JsonField<String> = body._sipAuthUsername()

    /**
     * Returns the raw JSON value of [sipHeaders].
     *
     * Unlike [sipHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sipHeaders(): JsonField<List<SipHeader>> = body._sipHeaders()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionReferParams].
         *
         * The following fields are required:
         * ```java
         * .sipAddress()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionReferParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionReferParams: ActionReferParams) = apply {
            callControlId = actionReferParams.callControlId
            body = actionReferParams.body.toBuilder()
            additionalHeaders = actionReferParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionReferParams.additionalQueryParams.toBuilder()
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
         * - [sipAddress]
         * - [clientState]
         * - [commandId]
         * - [customHeaders]
         * - [sipAuthPassword]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The SIP URI to which the call will be referred to. */
        fun sipAddress(sipAddress: String) = apply { body.sipAddress(sipAddress) }

        /**
         * Sets [Builder.sipAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sipAddress(sipAddress: JsonField<String>) = apply { body.sipAddress(sipAddress) }

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
         * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent
         * commands with the same `command_id` as one that has already been executed.
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

        /** Custom headers to be added to the SIP INVITE. */
        fun customHeaders(customHeaders: List<CustomSipHeader>) = apply {
            body.customHeaders(customHeaders)
        }

        /**
         * Sets [Builder.customHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customHeaders] with a well-typed `List<CustomSipHeader>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customHeaders(customHeaders: JsonField<List<CustomSipHeader>>) = apply {
            body.customHeaders(customHeaders)
        }

        /**
         * Adds a single [CustomSipHeader] to [customHeaders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomHeader(customHeader: CustomSipHeader) = apply {
            body.addCustomHeader(customHeader)
        }

        /** SIP Authentication password used for SIP challenges. */
        fun sipAuthPassword(sipAuthPassword: String) = apply {
            body.sipAuthPassword(sipAuthPassword)
        }

        /**
         * Sets [Builder.sipAuthPassword] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipAuthPassword] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sipAuthPassword(sipAuthPassword: JsonField<String>) = apply {
            body.sipAuthPassword(sipAuthPassword)
        }

        /** SIP Authentication username used for SIP challenges. */
        fun sipAuthUsername(sipAuthUsername: String) = apply {
            body.sipAuthUsername(sipAuthUsername)
        }

        /**
         * Sets [Builder.sipAuthUsername] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipAuthUsername] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sipAuthUsername(sipAuthUsername: JsonField<String>) = apply {
            body.sipAuthUsername(sipAuthUsername)
        }

        /**
         * SIP headers to be added to the request. Currently only User-to-User header is supported.
         */
        fun sipHeaders(sipHeaders: List<SipHeader>) = apply { body.sipHeaders(sipHeaders) }

        /**
         * Sets [Builder.sipHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipHeaders] with a well-typed `List<SipHeader>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sipHeaders(sipHeaders: JsonField<List<SipHeader>>) = apply {
            body.sipHeaders(sipHeaders)
        }

        /**
         * Adds a single [SipHeader] to [sipHeaders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSipHeader(sipHeader: SipHeader) = apply { body.addSipHeader(sipHeader) }

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
         * Returns an immutable instance of [ActionReferParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sipAddress()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionReferParams =
            ActionReferParams(
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
        private val sipAddress: JsonField<String>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val customHeaders: JsonField<List<CustomSipHeader>>,
        private val sipAuthPassword: JsonField<String>,
        private val sipAuthUsername: JsonField<String>,
        private val sipHeaders: JsonField<List<SipHeader>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("sip_address")
            @ExcludeMissing
            sipAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_headers")
            @ExcludeMissing
            customHeaders: JsonField<List<CustomSipHeader>> = JsonMissing.of(),
            @JsonProperty("sip_auth_password")
            @ExcludeMissing
            sipAuthPassword: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sip_auth_username")
            @ExcludeMissing
            sipAuthUsername: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sip_headers")
            @ExcludeMissing
            sipHeaders: JsonField<List<SipHeader>> = JsonMissing.of(),
        ) : this(
            sipAddress,
            clientState,
            commandId,
            customHeaders,
            sipAuthPassword,
            sipAuthUsername,
            sipHeaders,
            mutableMapOf(),
        )

        /**
         * The SIP URI to which the call will be referred to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sipAddress(): String = sipAddress.getRequired("sip_address")

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientState(): Optional<String> = clientState.getOptional("client_state")

        /**
         * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent
         * commands with the same `command_id` as one that has already been executed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commandId(): Optional<String> = commandId.getOptional("command_id")

        /**
         * Custom headers to be added to the SIP INVITE.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customHeaders(): Optional<List<CustomSipHeader>> =
            customHeaders.getOptional("custom_headers")

        /**
         * SIP Authentication password used for SIP challenges.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipAuthPassword(): Optional<String> = sipAuthPassword.getOptional("sip_auth_password")

        /**
         * SIP Authentication username used for SIP challenges.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipAuthUsername(): Optional<String> = sipAuthUsername.getOptional("sip_auth_username")

        /**
         * SIP headers to be added to the request. Currently only User-to-User header is supported.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipHeaders(): Optional<List<SipHeader>> = sipHeaders.getOptional("sip_headers")

        /**
         * Returns the raw JSON value of [sipAddress].
         *
         * Unlike [sipAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sip_address")
        @ExcludeMissing
        fun _sipAddress(): JsonField<String> = sipAddress

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
         * Returns the raw JSON value of [customHeaders].
         *
         * Unlike [customHeaders], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_headers")
        @ExcludeMissing
        fun _customHeaders(): JsonField<List<CustomSipHeader>> = customHeaders

        /**
         * Returns the raw JSON value of [sipAuthPassword].
         *
         * Unlike [sipAuthPassword], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sip_auth_password")
        @ExcludeMissing
        fun _sipAuthPassword(): JsonField<String> = sipAuthPassword

        /**
         * Returns the raw JSON value of [sipAuthUsername].
         *
         * Unlike [sipAuthUsername], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sip_auth_username")
        @ExcludeMissing
        fun _sipAuthUsername(): JsonField<String> = sipAuthUsername

        /**
         * Returns the raw JSON value of [sipHeaders].
         *
         * Unlike [sipHeaders], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sip_headers")
        @ExcludeMissing
        fun _sipHeaders(): JsonField<List<SipHeader>> = sipHeaders

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
             * .sipAddress()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var sipAddress: JsonField<String>? = null
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var customHeaders: JsonField<MutableList<CustomSipHeader>>? = null
            private var sipAuthPassword: JsonField<String> = JsonMissing.of()
            private var sipAuthUsername: JsonField<String> = JsonMissing.of()
            private var sipHeaders: JsonField<MutableList<SipHeader>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                sipAddress = body.sipAddress
                clientState = body.clientState
                commandId = body.commandId
                customHeaders = body.customHeaders.map { it.toMutableList() }
                sipAuthPassword = body.sipAuthPassword
                sipAuthUsername = body.sipAuthUsername
                sipHeaders = body.sipHeaders.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The SIP URI to which the call will be referred to. */
            fun sipAddress(sipAddress: String) = sipAddress(JsonField.of(sipAddress))

            /**
             * Sets [Builder.sipAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sipAddress(sipAddress: JsonField<String>) = apply { this.sipAddress = sipAddress }

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
             * Use this field to avoid execution of duplicate commands. Telnyx will ignore
             * subsequent commands with the same `command_id` as one that has already been executed.
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

            /** Custom headers to be added to the SIP INVITE. */
            fun customHeaders(customHeaders: List<CustomSipHeader>) =
                customHeaders(JsonField.of(customHeaders))

            /**
             * Sets [Builder.customHeaders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customHeaders] with a well-typed
             * `List<CustomSipHeader>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun customHeaders(customHeaders: JsonField<List<CustomSipHeader>>) = apply {
                this.customHeaders = customHeaders.map { it.toMutableList() }
            }

            /**
             * Adds a single [CustomSipHeader] to [customHeaders].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCustomHeader(customHeader: CustomSipHeader) = apply {
                customHeaders =
                    (customHeaders ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customHeaders", it).add(customHeader)
                    }
            }

            /** SIP Authentication password used for SIP challenges. */
            fun sipAuthPassword(sipAuthPassword: String) =
                sipAuthPassword(JsonField.of(sipAuthPassword))

            /**
             * Sets [Builder.sipAuthPassword] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipAuthPassword] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sipAuthPassword(sipAuthPassword: JsonField<String>) = apply {
                this.sipAuthPassword = sipAuthPassword
            }

            /** SIP Authentication username used for SIP challenges. */
            fun sipAuthUsername(sipAuthUsername: String) =
                sipAuthUsername(JsonField.of(sipAuthUsername))

            /**
             * Sets [Builder.sipAuthUsername] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipAuthUsername] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sipAuthUsername(sipAuthUsername: JsonField<String>) = apply {
                this.sipAuthUsername = sipAuthUsername
            }

            /**
             * SIP headers to be added to the request. Currently only User-to-User header is
             * supported.
             */
            fun sipHeaders(sipHeaders: List<SipHeader>) = sipHeaders(JsonField.of(sipHeaders))

            /**
             * Sets [Builder.sipHeaders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipHeaders] with a well-typed `List<SipHeader>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sipHeaders(sipHeaders: JsonField<List<SipHeader>>) = apply {
                this.sipHeaders = sipHeaders.map { it.toMutableList() }
            }

            /**
             * Adds a single [SipHeader] to [sipHeaders].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSipHeader(sipHeader: SipHeader) = apply {
                sipHeaders =
                    (sipHeaders ?: JsonField.of(mutableListOf())).also {
                        checkKnown("sipHeaders", it).add(sipHeader)
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
             *
             * The following fields are required:
             * ```java
             * .sipAddress()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("sipAddress", sipAddress),
                    clientState,
                    commandId,
                    (customHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                    sipAuthPassword,
                    sipAuthUsername,
                    (sipHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            sipAddress()
            clientState()
            commandId()
            customHeaders().ifPresent { it.forEach { it.validate() } }
            sipAuthPassword()
            sipAuthUsername()
            sipHeaders().ifPresent { it.forEach { it.validate() } }
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
            (if (sipAddress.asKnown().isPresent) 1 else 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (customHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (sipAuthPassword.asKnown().isPresent) 1 else 0) +
                (if (sipAuthUsername.asKnown().isPresent) 1 else 0) +
                (sipHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                sipAddress == other.sipAddress &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                customHeaders == other.customHeaders &&
                sipAuthPassword == other.sipAuthPassword &&
                sipAuthUsername == other.sipAuthUsername &&
                sipHeaders == other.sipHeaders &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                sipAddress,
                clientState,
                commandId,
                customHeaders,
                sipAuthPassword,
                sipAuthUsername,
                sipHeaders,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{sipAddress=$sipAddress, clientState=$clientState, commandId=$commandId, customHeaders=$customHeaders, sipAuthPassword=$sipAuthPassword, sipAuthUsername=$sipAuthUsername, sipHeaders=$sipHeaders, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionReferParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionReferParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
