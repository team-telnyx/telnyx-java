// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Starts siprec session with specified parameters for call idientified by call_sid. */
class CallSiprecJsonParams
private constructor(
    private val accountSid: String,
    private val callSid: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountSid(): String = accountSid

    fun callSid(): Optional<String> = Optional.ofNullable(callSid)

    /**
     * The name of the connector to use for the SIPREC session.
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
     * Name of the SIPREC session. May be used to stop the SIPREC session from TeXML instruction.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

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
     * URL destination for Telnyx to send status callback events to for the siprec session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCallback(): Optional<String> = body.statusCallback()

    /**
     * HTTP request type used for `StatusCallback`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCallbackMethod(): Optional<StatusCallbackMethod> = body.statusCallbackMethod()

    /**
     * The track to be used for siprec session. Can be `both_tracks`, `inbound_track` or
     * `outbound_track`. Defaults to `both_tracks`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun track(): Optional<Track> = body.track()

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

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
     * Returns the raw JSON value of [statusCallback].
     *
     * Unlike [statusCallback], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _statusCallback(): JsonField<String> = body._statusCallback()

    /**
     * Returns the raw JSON value of [statusCallbackMethod].
     *
     * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = body._statusCallbackMethod()

    /**
     * Returns the raw JSON value of [track].
     *
     * Unlike [track], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _track(): JsonField<Track> = body._track()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CallSiprecJsonParams].
         *
         * The following fields are required:
         * ```java
         * .accountSid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallSiprecJsonParams]. */
    class Builder internal constructor() {

        private var accountSid: String? = null
        private var callSid: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(callSiprecJsonParams: CallSiprecJsonParams) = apply {
            accountSid = callSiprecJsonParams.accountSid
            callSid = callSiprecJsonParams.callSid
            body = callSiprecJsonParams.body.toBuilder()
            additionalHeaders = callSiprecJsonParams.additionalHeaders.toBuilder()
            additionalQueryParams = callSiprecJsonParams.additionalQueryParams.toBuilder()
        }

        fun accountSid(accountSid: String) = apply { this.accountSid = accountSid }

        fun callSid(callSid: String?) = apply { this.callSid = callSid }

        /** Alias for calling [Builder.callSid] with `callSid.orElse(null)`. */
        fun callSid(callSid: Optional<String>) = callSid(callSid.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [connectorName]
         * - [includeMetadataCustomHeaders]
         * - [name]
         * - [secure]
         * - [sessionTimeoutSecs]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The name of the connector to use for the SIPREC session. */
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
         * Name of the SIPREC session. May be used to stop the SIPREC session from TeXML
         * instruction.
         */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

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

        /** URL destination for Telnyx to send status callback events to for the siprec session. */
        fun statusCallback(statusCallback: String) = apply { body.statusCallback(statusCallback) }

        /**
         * Sets [Builder.statusCallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallback] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusCallback(statusCallback: JsonField<String>) = apply {
            body.statusCallback(statusCallback)
        }

        /** HTTP request type used for `StatusCallback`. */
        fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) = apply {
            body.statusCallbackMethod(statusCallbackMethod)
        }

        /**
         * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallbackMethod] with a well-typed
         * [StatusCallbackMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) = apply {
            body.statusCallbackMethod(statusCallbackMethod)
        }

        /**
         * The track to be used for siprec session. Can be `both_tracks`, `inbound_track` or
         * `outbound_track`. Defaults to `both_tracks`.
         */
        fun track(track: Track) = apply { body.track(track) }

        /**
         * Sets [Builder.track] to an arbitrary JSON value.
         *
         * You should usually call [Builder.track] with a well-typed [Track] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun track(track: JsonField<Track>) = apply { body.track(track) }

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
         * Returns an immutable instance of [CallSiprecJsonParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountSid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CallSiprecJsonParams =
            CallSiprecJsonParams(
                checkRequired("accountSid", accountSid),
                callSid,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountSid
            1 -> callSid ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val connectorName: JsonField<String>,
        private val includeMetadataCustomHeaders: JsonField<IncludeMetadataCustomHeaders>,
        private val name: JsonField<String>,
        private val secure: JsonField<Secure>,
        private val sessionTimeoutSecs: JsonField<Long>,
        private val sipTransport: JsonField<SipTransport>,
        private val statusCallback: JsonField<String>,
        private val statusCallbackMethod: JsonField<StatusCallbackMethod>,
        private val track: JsonField<Track>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ConnectorName")
            @ExcludeMissing
            connectorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("IncludeMetadataCustomHeaders")
            @ExcludeMissing
            includeMetadataCustomHeaders: JsonField<IncludeMetadataCustomHeaders> =
                JsonMissing.of(),
            @JsonProperty("Name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("Secure") @ExcludeMissing secure: JsonField<Secure> = JsonMissing.of(),
            @JsonProperty("SessionTimeoutSecs")
            @ExcludeMissing
            sessionTimeoutSecs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("SipTransport")
            @ExcludeMissing
            sipTransport: JsonField<SipTransport> = JsonMissing.of(),
            @JsonProperty("StatusCallback")
            @ExcludeMissing
            statusCallback: JsonField<String> = JsonMissing.of(),
            @JsonProperty("StatusCallbackMethod")
            @ExcludeMissing
            statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of(),
            @JsonProperty("Track") @ExcludeMissing track: JsonField<Track> = JsonMissing.of(),
        ) : this(
            connectorName,
            includeMetadataCustomHeaders,
            name,
            secure,
            sessionTimeoutSecs,
            sipTransport,
            statusCallback,
            statusCallbackMethod,
            track,
            mutableMapOf(),
        )

        /**
         * The name of the connector to use for the SIPREC session.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectorName(): Optional<String> = connectorName.getOptional("ConnectorName")

        /**
         * When set, custom parameters will be added as metadata
         * (recording.session.ExtensionParameters). Otherwise, they’ll be added to sip headers.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeMetadataCustomHeaders(): Optional<IncludeMetadataCustomHeaders> =
            includeMetadataCustomHeaders.getOptional("IncludeMetadataCustomHeaders")

        /**
         * Name of the SIPREC session. May be used to stop the SIPREC session from TeXML
         * instruction.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("Name")

        /**
         * Controls whether to encrypt media sent to your SRS using SRTP and TLS. When set you need
         * to configure SRS port in your connector to 5061.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secure(): Optional<Secure> = secure.getOptional("Secure")

        /**
         * Sets `Session-Expires` header to the INVITE. A reinvite is sent every half the value set.
         * Usefull for session keep alive. Minimum value is 90, set to 0 to disable.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sessionTimeoutSecs(): Optional<Long> =
            sessionTimeoutSecs.getOptional("SessionTimeoutSecs")

        /**
         * Specifies SIP transport protocol.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipTransport(): Optional<SipTransport> = sipTransport.getOptional("SipTransport")

        /**
         * URL destination for Telnyx to send status callback events to for the siprec session.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCallback(): Optional<String> = statusCallback.getOptional("StatusCallback")

        /**
         * HTTP request type used for `StatusCallback`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCallbackMethod(): Optional<StatusCallbackMethod> =
            statusCallbackMethod.getOptional("StatusCallbackMethod")

        /**
         * The track to be used for siprec session. Can be `both_tracks`, `inbound_track` or
         * `outbound_track`. Defaults to `both_tracks`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun track(): Optional<Track> = track.getOptional("Track")

        /**
         * Returns the raw JSON value of [connectorName].
         *
         * Unlike [connectorName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ConnectorName")
        @ExcludeMissing
        fun _connectorName(): JsonField<String> = connectorName

        /**
         * Returns the raw JSON value of [includeMetadataCustomHeaders].
         *
         * Unlike [includeMetadataCustomHeaders], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("IncludeMetadataCustomHeaders")
        @ExcludeMissing
        fun _includeMetadataCustomHeaders(): JsonField<IncludeMetadataCustomHeaders> =
            includeMetadataCustomHeaders

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [secure].
         *
         * Unlike [secure], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Secure") @ExcludeMissing fun _secure(): JsonField<Secure> = secure

        /**
         * Returns the raw JSON value of [sessionTimeoutSecs].
         *
         * Unlike [sessionTimeoutSecs], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("SessionTimeoutSecs")
        @ExcludeMissing
        fun _sessionTimeoutSecs(): JsonField<Long> = sessionTimeoutSecs

        /**
         * Returns the raw JSON value of [sipTransport].
         *
         * Unlike [sipTransport], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("SipTransport")
        @ExcludeMissing
        fun _sipTransport(): JsonField<SipTransport> = sipTransport

        /**
         * Returns the raw JSON value of [statusCallback].
         *
         * Unlike [statusCallback], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("StatusCallback")
        @ExcludeMissing
        fun _statusCallback(): JsonField<String> = statusCallback

        /**
         * Returns the raw JSON value of [statusCallbackMethod].
         *
         * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("StatusCallbackMethod")
        @ExcludeMissing
        fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = statusCallbackMethod

        /**
         * Returns the raw JSON value of [track].
         *
         * Unlike [track], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Track") @ExcludeMissing fun _track(): JsonField<Track> = track

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

            private var connectorName: JsonField<String> = JsonMissing.of()
            private var includeMetadataCustomHeaders: JsonField<IncludeMetadataCustomHeaders> =
                JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var secure: JsonField<Secure> = JsonMissing.of()
            private var sessionTimeoutSecs: JsonField<Long> = JsonMissing.of()
            private var sipTransport: JsonField<SipTransport> = JsonMissing.of()
            private var statusCallback: JsonField<String> = JsonMissing.of()
            private var statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of()
            private var track: JsonField<Track> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                connectorName = body.connectorName
                includeMetadataCustomHeaders = body.includeMetadataCustomHeaders
                name = body.name
                secure = body.secure
                sessionTimeoutSecs = body.sessionTimeoutSecs
                sipTransport = body.sipTransport
                statusCallback = body.statusCallback
                statusCallbackMethod = body.statusCallbackMethod
                track = body.track
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The name of the connector to use for the SIPREC session. */
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
             * Name of the SIPREC session. May be used to stop the SIPREC session from TeXML
             * instruction.
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            /**
             * URL destination for Telnyx to send status callback events to for the siprec session.
             */
            fun statusCallback(statusCallback: String) =
                statusCallback(JsonField.of(statusCallback))

            /**
             * Sets [Builder.statusCallback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCallback] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusCallback(statusCallback: JsonField<String>) = apply {
                this.statusCallback = statusCallback
            }

            /** HTTP request type used for `StatusCallback`. */
            fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) =
                statusCallbackMethod(JsonField.of(statusCallbackMethod))

            /**
             * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCallbackMethod] with a well-typed
             * [StatusCallbackMethod] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) =
                apply {
                    this.statusCallbackMethod = statusCallbackMethod
                }

            /**
             * The track to be used for siprec session. Can be `both_tracks`, `inbound_track` or
             * `outbound_track`. Defaults to `both_tracks`.
             */
            fun track(track: Track) = track(JsonField.of(track))

            /**
             * Sets [Builder.track] to an arbitrary JSON value.
             *
             * You should usually call [Builder.track] with a well-typed [Track] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun track(track: JsonField<Track>) = apply { this.track = track }

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
                    connectorName,
                    includeMetadataCustomHeaders,
                    name,
                    secure,
                    sessionTimeoutSecs,
                    sipTransport,
                    statusCallback,
                    statusCallbackMethod,
                    track,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            connectorName()
            includeMetadataCustomHeaders().ifPresent { it.validate() }
            name()
            secure().ifPresent { it.validate() }
            sessionTimeoutSecs()
            sipTransport().ifPresent { it.validate() }
            statusCallback()
            statusCallbackMethod().ifPresent { it.validate() }
            track().ifPresent { it.validate() }
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
            (if (connectorName.asKnown().isPresent) 1 else 0) +
                (includeMetadataCustomHeaders.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (secure.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sessionTimeoutSecs.asKnown().isPresent) 1 else 0) +
                (sipTransport.asKnown().getOrNull()?.validity() ?: 0) +
                (if (statusCallback.asKnown().isPresent) 1 else 0) +
                (statusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (track.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                connectorName == other.connectorName &&
                includeMetadataCustomHeaders == other.includeMetadataCustomHeaders &&
                name == other.name &&
                secure == other.secure &&
                sessionTimeoutSecs == other.sessionTimeoutSecs &&
                sipTransport == other.sipTransport &&
                statusCallback == other.statusCallback &&
                statusCallbackMethod == other.statusCallbackMethod &&
                track == other.track &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                connectorName,
                includeMetadataCustomHeaders,
                name,
                secure,
                sessionTimeoutSecs,
                sipTransport,
                statusCallback,
                statusCallbackMethod,
                track,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{connectorName=$connectorName, includeMetadataCustomHeaders=$includeMetadataCustomHeaders, name=$name, secure=$secure, sessionTimeoutSecs=$sessionTimeoutSecs, sipTransport=$sipTransport, statusCallback=$statusCallback, statusCallbackMethod=$statusCallbackMethod, track=$track, additionalProperties=$additionalProperties}"
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

    /** HTTP request type used for `StatusCallback`. */
    class StatusCallbackMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = StatusCallbackMethod(JsonField.of(value))
        }

        /** An enum containing [StatusCallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [StatusCallbackMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [StatusCallbackMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [StatusCallbackMethod] was instantiated with an
             * unknown value.
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
                GET -> Value.GET
                POST -> Value.POST
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
                GET -> Known.GET
                POST -> Known.POST
                else -> throw TelnyxInvalidDataException("Unknown StatusCallbackMethod: $value")
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

        fun validate(): StatusCallbackMethod = apply {
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

            return other is StatusCallbackMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The track to be used for siprec session. Can be `both_tracks`, `inbound_track` or
     * `outbound_track`. Defaults to `both_tracks`.
     */
    class Track @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BOTH_TRACKS = of("both_tracks")

            @JvmField val INBOUND_TRACK = of("inbound_track")

            @JvmField val OUTBOUND_TRACK = of("outbound_track")

            @JvmStatic fun of(value: String) = Track(JsonField.of(value))
        }

        /** An enum containing [Track]'s known values. */
        enum class Known {
            BOTH_TRACKS,
            INBOUND_TRACK,
            OUTBOUND_TRACK,
        }

        /**
         * An enum containing [Track]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Track] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BOTH_TRACKS,
            INBOUND_TRACK,
            OUTBOUND_TRACK,
            /** An enum member indicating that [Track] was instantiated with an unknown value. */
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
                BOTH_TRACKS -> Value.BOTH_TRACKS
                INBOUND_TRACK -> Value.INBOUND_TRACK
                OUTBOUND_TRACK -> Value.OUTBOUND_TRACK
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
                BOTH_TRACKS -> Known.BOTH_TRACKS
                INBOUND_TRACK -> Known.INBOUND_TRACK
                OUTBOUND_TRACK -> Known.OUTBOUND_TRACK
                else -> throw TelnyxInvalidDataException("Unknown Track: $value")
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

        fun validate(): Track = apply {
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

            return other is Track && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallSiprecJsonParams &&
            accountSid == other.accountSid &&
            callSid == other.callSid &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountSid, callSid, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CallSiprecJsonParams{accountSid=$accountSid, callSid=$callSid, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
