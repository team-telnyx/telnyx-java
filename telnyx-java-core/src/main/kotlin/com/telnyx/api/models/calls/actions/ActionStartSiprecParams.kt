// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
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
 * Start siprec session to configured in SIPREC connector SRS.
 *
 * **Expected Webhooks:**
 * - `siprec.started`
 * - `siprec.stopped`
 * - `siprec.failed`
 */
class ActionStartSiprecParams
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
     * Name of configured SIPREC connector to be used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectorName(): Optional<String> = body.connectorName()

    /**
     * When set, custom parameters will be added as metadata
     * (recording.session.ExtensionParameters). Otherwise, they’ll be added to sip headers.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeMetadataCustomHeaders(): Optional<IncludeMetadataCustomHeaders> =
        body.includeMetadataCustomHeaders()

    /**
     * Controls whether to encrypt media sent to your SRS using SRTP and TLS. When set you need to
     * configure SRS port in your connector to 5061.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secure(): Optional<Secure> = body.secure()

    /**
     * Sets `Session-Expires` header to the INVITE. A reinvite is sent every half the value set.
     * Usefull for session keep alive. Minimum value is 90, set to 0 to disable.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionTimeoutSecs(): Optional<Long> = body.sessionTimeoutSecs()

    /**
     * Specifies SIP transport protocol.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipTransport(): Optional<SipTransport> = body.sipTransport()

    /**
     * Specifies which track should be sent on siprec session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun siprecTrack(): Optional<SiprecTrack> = body.siprecTrack()

    /**
     * Returns the raw JSON value of [clientState].
     *
     * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientState(): JsonField<String> = body._clientState()

    /**
     * Returns the raw JSON value of [connectorName].
     *
     * Unlike [connectorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _connectorName(): JsonField<String> = body._connectorName()

    /**
     * Returns the raw JSON value of [includeMetadataCustomHeaders].
     *
     * Unlike [includeMetadataCustomHeaders], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _includeMetadataCustomHeaders(): JsonField<IncludeMetadataCustomHeaders> =
        body._includeMetadataCustomHeaders()

    /**
     * Returns the raw JSON value of [secure].
     *
     * Unlike [secure], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _secure(): JsonField<Secure> = body._secure()

    /**
     * Returns the raw JSON value of [sessionTimeoutSecs].
     *
     * Unlike [sessionTimeoutSecs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sessionTimeoutSecs(): JsonField<Long> = body._sessionTimeoutSecs()

    /**
     * Returns the raw JSON value of [sipTransport].
     *
     * Unlike [sipTransport], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sipTransport(): JsonField<SipTransport> = body._sipTransport()

    /**
     * Returns the raw JSON value of [siprecTrack].
     *
     * Unlike [siprecTrack], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _siprecTrack(): JsonField<SiprecTrack> = body._siprecTrack()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ActionStartSiprecParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ActionStartSiprecParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionStartSiprecParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionStartSiprecParams: ActionStartSiprecParams) = apply {
            callControlId = actionStartSiprecParams.callControlId
            body = actionStartSiprecParams.body.toBuilder()
            additionalHeaders = actionStartSiprecParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionStartSiprecParams.additionalQueryParams.toBuilder()
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
         * - [connectorName]
         * - [includeMetadataCustomHeaders]
         * - [secure]
         * - [sessionTimeoutSecs]
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

        /** Name of configured SIPREC connector to be used. */
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

        /**
         * When set, custom parameters will be added as metadata
         * (recording.session.ExtensionParameters). Otherwise, they’ll be added to sip headers.
         */
        fun includeMetadataCustomHeaders(
            includeMetadataCustomHeaders: IncludeMetadataCustomHeaders
        ) = apply { body.includeMetadataCustomHeaders(includeMetadataCustomHeaders) }

        /**
         * Sets [Builder.includeMetadataCustomHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeMetadataCustomHeaders] with a well-typed
         * [IncludeMetadataCustomHeaders] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun includeMetadataCustomHeaders(
            includeMetadataCustomHeaders: JsonField<IncludeMetadataCustomHeaders>
        ) = apply { body.includeMetadataCustomHeaders(includeMetadataCustomHeaders) }

        /**
         * Controls whether to encrypt media sent to your SRS using SRTP and TLS. When set you need
         * to configure SRS port in your connector to 5061.
         */
        fun secure(secure: Secure) = apply { body.secure(secure) }

        /**
         * Sets [Builder.secure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secure] with a well-typed [Secure] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun secure(secure: JsonField<Secure>) = apply { body.secure(secure) }

        /**
         * Sets `Session-Expires` header to the INVITE. A reinvite is sent every half the value set.
         * Usefull for session keep alive. Minimum value is 90, set to 0 to disable.
         */
        fun sessionTimeoutSecs(sessionTimeoutSecs: Long) = apply {
            body.sessionTimeoutSecs(sessionTimeoutSecs)
        }

        /**
         * Sets [Builder.sessionTimeoutSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionTimeoutSecs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sessionTimeoutSecs(sessionTimeoutSecs: JsonField<Long>) = apply {
            body.sessionTimeoutSecs(sessionTimeoutSecs)
        }

        /** Specifies SIP transport protocol. */
        fun sipTransport(sipTransport: SipTransport) = apply { body.sipTransport(sipTransport) }

        /**
         * Sets [Builder.sipTransport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipTransport] with a well-typed [SipTransport] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sipTransport(sipTransport: JsonField<SipTransport>) = apply {
            body.sipTransport(sipTransport)
        }

        /** Specifies which track should be sent on siprec session. */
        fun siprecTrack(siprecTrack: SiprecTrack) = apply { body.siprecTrack(siprecTrack) }

        /**
         * Sets [Builder.siprecTrack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.siprecTrack] with a well-typed [SiprecTrack] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun siprecTrack(siprecTrack: JsonField<SiprecTrack>) = apply {
            body.siprecTrack(siprecTrack)
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
         * Returns an immutable instance of [ActionStartSiprecParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionStartSiprecParams =
            ActionStartSiprecParams(
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
        private val connectorName: JsonField<String>,
        private val includeMetadataCustomHeaders: JsonField<IncludeMetadataCustomHeaders>,
        private val secure: JsonField<Secure>,
        private val sessionTimeoutSecs: JsonField<Long>,
        private val sipTransport: JsonField<SipTransport>,
        private val siprecTrack: JsonField<SiprecTrack>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connector_name")
            @ExcludeMissing
            connectorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("include_metadata_custom_headers")
            @ExcludeMissing
            includeMetadataCustomHeaders: JsonField<IncludeMetadataCustomHeaders> =
                JsonMissing.of(),
            @JsonProperty("secure") @ExcludeMissing secure: JsonField<Secure> = JsonMissing.of(),
            @JsonProperty("session_timeout_secs")
            @ExcludeMissing
            sessionTimeoutSecs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sip_transport")
            @ExcludeMissing
            sipTransport: JsonField<SipTransport> = JsonMissing.of(),
            @JsonProperty("siprec_track")
            @ExcludeMissing
            siprecTrack: JsonField<SiprecTrack> = JsonMissing.of(),
        ) : this(
            clientState,
            connectorName,
            includeMetadataCustomHeaders,
            secure,
            sessionTimeoutSecs,
            sipTransport,
            siprecTrack,
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
         * Name of configured SIPREC connector to be used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectorName(): Optional<String> = connectorName.getOptional("connector_name")

        /**
         * When set, custom parameters will be added as metadata
         * (recording.session.ExtensionParameters). Otherwise, they’ll be added to sip headers.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeMetadataCustomHeaders(): Optional<IncludeMetadataCustomHeaders> =
            includeMetadataCustomHeaders.getOptional("include_metadata_custom_headers")

        /**
         * Controls whether to encrypt media sent to your SRS using SRTP and TLS. When set you need
         * to configure SRS port in your connector to 5061.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secure(): Optional<Secure> = secure.getOptional("secure")

        /**
         * Sets `Session-Expires` header to the INVITE. A reinvite is sent every half the value set.
         * Usefull for session keep alive. Minimum value is 90, set to 0 to disable.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sessionTimeoutSecs(): Optional<Long> =
            sessionTimeoutSecs.getOptional("session_timeout_secs")

        /**
         * Specifies SIP transport protocol.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipTransport(): Optional<SipTransport> = sipTransport.getOptional("sip_transport")

        /**
         * Specifies which track should be sent on siprec session.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun siprecTrack(): Optional<SiprecTrack> = siprecTrack.getOptional("siprec_track")

        /**
         * Returns the raw JSON value of [clientState].
         *
         * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_state")
        @ExcludeMissing
        fun _clientState(): JsonField<String> = clientState

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
         * Returns the raw JSON value of [includeMetadataCustomHeaders].
         *
         * Unlike [includeMetadataCustomHeaders], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("include_metadata_custom_headers")
        @ExcludeMissing
        fun _includeMetadataCustomHeaders(): JsonField<IncludeMetadataCustomHeaders> =
            includeMetadataCustomHeaders

        /**
         * Returns the raw JSON value of [secure].
         *
         * Unlike [secure], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("secure") @ExcludeMissing fun _secure(): JsonField<Secure> = secure

        /**
         * Returns the raw JSON value of [sessionTimeoutSecs].
         *
         * Unlike [sessionTimeoutSecs], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("session_timeout_secs")
        @ExcludeMissing
        fun _sessionTimeoutSecs(): JsonField<Long> = sessionTimeoutSecs

        /**
         * Returns the raw JSON value of [sipTransport].
         *
         * Unlike [sipTransport], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sip_transport")
        @ExcludeMissing
        fun _sipTransport(): JsonField<SipTransport> = sipTransport

        /**
         * Returns the raw JSON value of [siprecTrack].
         *
         * Unlike [siprecTrack], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("siprec_track")
        @ExcludeMissing
        fun _siprecTrack(): JsonField<SiprecTrack> = siprecTrack

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
            private var connectorName: JsonField<String> = JsonMissing.of()
            private var includeMetadataCustomHeaders: JsonField<IncludeMetadataCustomHeaders> =
                JsonMissing.of()
            private var secure: JsonField<Secure> = JsonMissing.of()
            private var sessionTimeoutSecs: JsonField<Long> = JsonMissing.of()
            private var sipTransport: JsonField<SipTransport> = JsonMissing.of()
            private var siprecTrack: JsonField<SiprecTrack> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                clientState = body.clientState
                connectorName = body.connectorName
                includeMetadataCustomHeaders = body.includeMetadataCustomHeaders
                secure = body.secure
                sessionTimeoutSecs = body.sessionTimeoutSecs
                sipTransport = body.sipTransport
                siprecTrack = body.siprecTrack
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

            /** Name of configured SIPREC connector to be used. */
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

            /**
             * When set, custom parameters will be added as metadata
             * (recording.session.ExtensionParameters). Otherwise, they’ll be added to sip headers.
             */
            fun includeMetadataCustomHeaders(
                includeMetadataCustomHeaders: IncludeMetadataCustomHeaders
            ) = includeMetadataCustomHeaders(JsonField.of(includeMetadataCustomHeaders))

            /**
             * Sets [Builder.includeMetadataCustomHeaders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeMetadataCustomHeaders] with a well-typed
             * [IncludeMetadataCustomHeaders] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun includeMetadataCustomHeaders(
                includeMetadataCustomHeaders: JsonField<IncludeMetadataCustomHeaders>
            ) = apply { this.includeMetadataCustomHeaders = includeMetadataCustomHeaders }

            /**
             * Controls whether to encrypt media sent to your SRS using SRTP and TLS. When set you
             * need to configure SRS port in your connector to 5061.
             */
            fun secure(secure: Secure) = secure(JsonField.of(secure))

            /**
             * Sets [Builder.secure] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secure] with a well-typed [Secure] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secure(secure: JsonField<Secure>) = apply { this.secure = secure }

            /**
             * Sets `Session-Expires` header to the INVITE. A reinvite is sent every half the value
             * set. Usefull for session keep alive. Minimum value is 90, set to 0 to disable.
             */
            fun sessionTimeoutSecs(sessionTimeoutSecs: Long) =
                sessionTimeoutSecs(JsonField.of(sessionTimeoutSecs))

            /**
             * Sets [Builder.sessionTimeoutSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionTimeoutSecs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionTimeoutSecs(sessionTimeoutSecs: JsonField<Long>) = apply {
                this.sessionTimeoutSecs = sessionTimeoutSecs
            }

            /** Specifies SIP transport protocol. */
            fun sipTransport(sipTransport: SipTransport) = sipTransport(JsonField.of(sipTransport))

            /**
             * Sets [Builder.sipTransport] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipTransport] with a well-typed [SipTransport] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sipTransport(sipTransport: JsonField<SipTransport>) = apply {
                this.sipTransport = sipTransport
            }

            /** Specifies which track should be sent on siprec session. */
            fun siprecTrack(siprecTrack: SiprecTrack) = siprecTrack(JsonField.of(siprecTrack))

            /**
             * Sets [Builder.siprecTrack] to an arbitrary JSON value.
             *
             * You should usually call [Builder.siprecTrack] with a well-typed [SiprecTrack] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun siprecTrack(siprecTrack: JsonField<SiprecTrack>) = apply {
                this.siprecTrack = siprecTrack
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
                    connectorName,
                    includeMetadataCustomHeaders,
                    secure,
                    sessionTimeoutSecs,
                    sipTransport,
                    siprecTrack,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            clientState()
            connectorName()
            includeMetadataCustomHeaders().ifPresent { it.validate() }
            secure().ifPresent { it.validate() }
            sessionTimeoutSecs()
            sipTransport().ifPresent { it.validate() }
            siprecTrack().ifPresent { it.validate() }
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
                (if (connectorName.asKnown().isPresent) 1 else 0) +
                (includeMetadataCustomHeaders.asKnown().getOrNull()?.validity() ?: 0) +
                (secure.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sessionTimeoutSecs.asKnown().isPresent) 1 else 0) +
                (sipTransport.asKnown().getOrNull()?.validity() ?: 0) +
                (siprecTrack.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                clientState == other.clientState &&
                connectorName == other.connectorName &&
                includeMetadataCustomHeaders == other.includeMetadataCustomHeaders &&
                secure == other.secure &&
                sessionTimeoutSecs == other.sessionTimeoutSecs &&
                sipTransport == other.sipTransport &&
                siprecTrack == other.siprecTrack &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                clientState,
                connectorName,
                includeMetadataCustomHeaders,
                secure,
                sessionTimeoutSecs,
                sipTransport,
                siprecTrack,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{clientState=$clientState, connectorName=$connectorName, includeMetadataCustomHeaders=$includeMetadataCustomHeaders, secure=$secure, sessionTimeoutSecs=$sessionTimeoutSecs, sipTransport=$sipTransport, siprecTrack=$siprecTrack, additionalProperties=$additionalProperties}"
    }

    /**
     * When set, custom parameters will be added as metadata
     * (recording.session.ExtensionParameters). Otherwise, they’ll be added to sip headers.
     */
    class IncludeMetadataCustomHeaders
    @JsonCreator
    private constructor(private val value: JsonField<Boolean>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

        companion object {

            @JvmField val TRUE = of(true)

            @JvmField val FALSE = of(false)

            @JvmStatic fun of(value: Boolean) = IncludeMetadataCustomHeaders(JsonField.of(value))
        }

        /** An enum containing [IncludeMetadataCustomHeaders]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
        }

        /**
         * An enum containing [IncludeMetadataCustomHeaders]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [IncludeMetadataCustomHeaders] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            /**
             * An enum member indicating that [IncludeMetadataCustomHeaders] was instantiated with
             * an unknown value.
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
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
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                else ->
                    throw TelnyxInvalidDataException("Unknown IncludeMetadataCustomHeaders: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asBoolean(): Boolean =
            _value().asBoolean().orElseThrow {
                TelnyxInvalidDataException("Value is not a Boolean")
            }

        private var validated: Boolean = false

        fun validate(): IncludeMetadataCustomHeaders = apply {
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

            return other is IncludeMetadataCustomHeaders && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Controls whether to encrypt media sent to your SRS using SRTP and TLS. When set you need to
     * configure SRS port in your connector to 5061.
     */
    class Secure @JsonCreator private constructor(private val value: JsonField<Boolean>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

        companion object {

            @JvmField val TRUE = of(true)

            @JvmField val FALSE = of(false)

            @JvmStatic fun of(value: Boolean) = Secure(JsonField.of(value))
        }

        /** An enum containing [Secure]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
        }

        /**
         * An enum containing [Secure]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Secure] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            /** An enum member indicating that [Secure] was instantiated with an unknown value. */
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
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
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                else -> throw TelnyxInvalidDataException("Unknown Secure: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asBoolean(): Boolean =
            _value().asBoolean().orElseThrow {
                TelnyxInvalidDataException("Value is not a Boolean")
            }

        private var validated: Boolean = false

        fun validate(): Secure = apply {
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

            return other is Secure && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Specifies SIP transport protocol. */
    class SipTransport @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val UDP = of("udp")

            @JvmField val TCP = of("tcp")

            @JvmField val TLS = of("tls")

            @JvmStatic fun of(value: String) = SipTransport(JsonField.of(value))
        }

        /** An enum containing [SipTransport]'s known values. */
        enum class Known {
            UDP,
            TCP,
            TLS,
        }

        /**
         * An enum containing [SipTransport]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SipTransport] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UDP,
            TCP,
            TLS,
            /**
             * An enum member indicating that [SipTransport] was instantiated with an unknown value.
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
                UDP -> Value.UDP
                TCP -> Value.TCP
                TLS -> Value.TLS
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
                UDP -> Known.UDP
                TCP -> Known.TCP
                TLS -> Known.TLS
                else -> throw TelnyxInvalidDataException("Unknown SipTransport: $value")
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

        fun validate(): SipTransport = apply {
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

            return other is SipTransport && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Specifies which track should be sent on siprec session. */
    class SiprecTrack @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val INBOUND_TRACK = of("inbound_track")

            @JvmField val OUTBOUND_TRACK = of("outbound_track")

            @JvmField val BOTH_TRACKS = of("both_tracks")

            @JvmStatic fun of(value: String) = SiprecTrack(JsonField.of(value))
        }

        /** An enum containing [SiprecTrack]'s known values. */
        enum class Known {
            INBOUND_TRACK,
            OUTBOUND_TRACK,
            BOTH_TRACKS,
        }

        /**
         * An enum containing [SiprecTrack]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SiprecTrack] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND_TRACK,
            OUTBOUND_TRACK,
            BOTH_TRACKS,
            /**
             * An enum member indicating that [SiprecTrack] was instantiated with an unknown value.
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
                INBOUND_TRACK -> Value.INBOUND_TRACK
                OUTBOUND_TRACK -> Value.OUTBOUND_TRACK
                BOTH_TRACKS -> Value.BOTH_TRACKS
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
                INBOUND_TRACK -> Known.INBOUND_TRACK
                OUTBOUND_TRACK -> Known.OUTBOUND_TRACK
                BOTH_TRACKS -> Known.BOTH_TRACKS
                else -> throw TelnyxInvalidDataException("Unknown SiprecTrack: $value")
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

        fun validate(): SiprecTrack = apply {
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

            return other is SiprecTrack && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionStartSiprecParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionStartSiprecParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
