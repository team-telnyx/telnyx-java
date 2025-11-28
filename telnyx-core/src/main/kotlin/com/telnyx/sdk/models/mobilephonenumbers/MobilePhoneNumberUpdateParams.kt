// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilephonenumbers

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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a Mobile Phone Number */
class MobilePhoneNumberUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callForwarding(): Optional<CallForwarding> = body.callForwarding()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callRecording(): Optional<CallRecording> = body.callRecording()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callerIdNameEnabled(): Optional<Boolean> = body.callerIdNameEnabled()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cnamListing(): Optional<CnamListing> = body.cnamListing()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): Optional<String> = body.connectionId()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = body.customerReference()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inbound(): Optional<Inbound> = body.inbound()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundCallScreening(): Optional<InboundCallScreening> = body.inboundCallScreening()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noiseSuppression(): Optional<Boolean> = body.noiseSuppression()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outbound(): Optional<Outbound> = body.outbound()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * Returns the raw JSON value of [callForwarding].
     *
     * Unlike [callForwarding], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callForwarding(): JsonField<CallForwarding> = body._callForwarding()

    /**
     * Returns the raw JSON value of [callRecording].
     *
     * Unlike [callRecording], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callRecording(): JsonField<CallRecording> = body._callRecording()

    /**
     * Returns the raw JSON value of [callerIdNameEnabled].
     *
     * Unlike [callerIdNameEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _callerIdNameEnabled(): JsonField<Boolean> = body._callerIdNameEnabled()

    /**
     * Returns the raw JSON value of [cnamListing].
     *
     * Unlike [cnamListing], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cnamListing(): JsonField<CnamListing> = body._cnamListing()

    /**
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _connectionId(): JsonField<String> = body._connectionId()

    /**
     * Returns the raw JSON value of [customerReference].
     *
     * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customerReference(): JsonField<String> = body._customerReference()

    /**
     * Returns the raw JSON value of [inbound].
     *
     * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inbound(): JsonField<Inbound> = body._inbound()

    /**
     * Returns the raw JSON value of [inboundCallScreening].
     *
     * Unlike [inboundCallScreening], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _inboundCallScreening(): JsonField<InboundCallScreening> = body._inboundCallScreening()

    /**
     * Returns the raw JSON value of [noiseSuppression].
     *
     * Unlike [noiseSuppression], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _noiseSuppression(): JsonField<Boolean> = body._noiseSuppression()

    /**
     * Returns the raw JSON value of [outbound].
     *
     * Unlike [outbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _outbound(): JsonField<Outbound> = body._outbound()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MobilePhoneNumberUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [MobilePhoneNumberUpdateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MobilePhoneNumberUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(mobilePhoneNumberUpdateParams: MobilePhoneNumberUpdateParams) = apply {
            id = mobilePhoneNumberUpdateParams.id
            body = mobilePhoneNumberUpdateParams.body.toBuilder()
            additionalHeaders = mobilePhoneNumberUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = mobilePhoneNumberUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [callForwarding]
         * - [callRecording]
         * - [callerIdNameEnabled]
         * - [cnamListing]
         * - [connectionId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun callForwarding(callForwarding: CallForwarding) = apply {
            body.callForwarding(callForwarding)
        }

        /**
         * Sets [Builder.callForwarding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callForwarding] with a well-typed [CallForwarding] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callForwarding(callForwarding: JsonField<CallForwarding>) = apply {
            body.callForwarding(callForwarding)
        }

        fun callRecording(callRecording: CallRecording) = apply {
            body.callRecording(callRecording)
        }

        /**
         * Sets [Builder.callRecording] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callRecording] with a well-typed [CallRecording] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callRecording(callRecording: JsonField<CallRecording>) = apply {
            body.callRecording(callRecording)
        }

        fun callerIdNameEnabled(callerIdNameEnabled: Boolean) = apply {
            body.callerIdNameEnabled(callerIdNameEnabled)
        }

        /**
         * Sets [Builder.callerIdNameEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callerIdNameEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callerIdNameEnabled(callerIdNameEnabled: JsonField<Boolean>) = apply {
            body.callerIdNameEnabled(callerIdNameEnabled)
        }

        fun cnamListing(cnamListing: CnamListing) = apply { body.cnamListing(cnamListing) }

        /**
         * Sets [Builder.cnamListing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cnamListing] with a well-typed [CnamListing] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cnamListing(cnamListing: JsonField<CnamListing>) = apply {
            body.cnamListing(cnamListing)
        }

        fun connectionId(connectionId: String?) = apply { body.connectionId(connectionId) }

        /** Alias for calling [Builder.connectionId] with `connectionId.orElse(null)`. */
        fun connectionId(connectionId: Optional<String>) = connectionId(connectionId.getOrNull())

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            body.connectionId(connectionId)
        }

        fun customerReference(customerReference: String?) = apply {
            body.customerReference(customerReference)
        }

        /** Alias for calling [Builder.customerReference] with `customerReference.orElse(null)`. */
        fun customerReference(customerReference: Optional<String>) =
            customerReference(customerReference.getOrNull())

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

        fun inbound(inbound: Inbound) = apply { body.inbound(inbound) }

        /**
         * Sets [Builder.inbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inbound] with a well-typed [Inbound] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inbound(inbound: JsonField<Inbound>) = apply { body.inbound(inbound) }

        fun inboundCallScreening(inboundCallScreening: InboundCallScreening) = apply {
            body.inboundCallScreening(inboundCallScreening)
        }

        /**
         * Sets [Builder.inboundCallScreening] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundCallScreening] with a well-typed
         * [InboundCallScreening] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun inboundCallScreening(inboundCallScreening: JsonField<InboundCallScreening>) = apply {
            body.inboundCallScreening(inboundCallScreening)
        }

        fun noiseSuppression(noiseSuppression: Boolean) = apply {
            body.noiseSuppression(noiseSuppression)
        }

        /**
         * Sets [Builder.noiseSuppression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noiseSuppression] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun noiseSuppression(noiseSuppression: JsonField<Boolean>) = apply {
            body.noiseSuppression(noiseSuppression)
        }

        fun outbound(outbound: Outbound) = apply { body.outbound(outbound) }

        /**
         * Sets [Builder.outbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outbound] with a well-typed [Outbound] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outbound(outbound: JsonField<Outbound>) = apply { body.outbound(outbound) }

        fun tags(tags: List<String>) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

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
         * Returns an immutable instance of [MobilePhoneNumberUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MobilePhoneNumberUpdateParams =
            MobilePhoneNumberUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val callForwarding: JsonField<CallForwarding>,
        private val callRecording: JsonField<CallRecording>,
        private val callerIdNameEnabled: JsonField<Boolean>,
        private val cnamListing: JsonField<CnamListing>,
        private val connectionId: JsonField<String>,
        private val customerReference: JsonField<String>,
        private val inbound: JsonField<Inbound>,
        private val inboundCallScreening: JsonField<InboundCallScreening>,
        private val noiseSuppression: JsonField<Boolean>,
        private val outbound: JsonField<Outbound>,
        private val tags: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("call_forwarding")
            @ExcludeMissing
            callForwarding: JsonField<CallForwarding> = JsonMissing.of(),
            @JsonProperty("call_recording")
            @ExcludeMissing
            callRecording: JsonField<CallRecording> = JsonMissing.of(),
            @JsonProperty("caller_id_name_enabled")
            @ExcludeMissing
            callerIdNameEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("cnam_listing")
            @ExcludeMissing
            cnamListing: JsonField<CnamListing> = JsonMissing.of(),
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inbound") @ExcludeMissing inbound: JsonField<Inbound> = JsonMissing.of(),
            @JsonProperty("inbound_call_screening")
            @ExcludeMissing
            inboundCallScreening: JsonField<InboundCallScreening> = JsonMissing.of(),
            @JsonProperty("noise_suppression")
            @ExcludeMissing
            noiseSuppression: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("outbound")
            @ExcludeMissing
            outbound: JsonField<Outbound> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            callForwarding,
            callRecording,
            callerIdNameEnabled,
            cnamListing,
            connectionId,
            customerReference,
            inbound,
            inboundCallScreening,
            noiseSuppression,
            outbound,
            tags,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callForwarding(): Optional<CallForwarding> =
            callForwarding.getOptional("call_forwarding")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callRecording(): Optional<CallRecording> = callRecording.getOptional("call_recording")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callerIdNameEnabled(): Optional<Boolean> =
            callerIdNameEnabled.getOptional("caller_id_name_enabled")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cnamListing(): Optional<CnamListing> = cnamListing.getOptional("cnam_listing")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inbound(): Optional<Inbound> = inbound.getOptional("inbound")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inboundCallScreening(): Optional<InboundCallScreening> =
            inboundCallScreening.getOptional("inbound_call_screening")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun noiseSuppression(): Optional<Boolean> =
            noiseSuppression.getOptional("noise_suppression")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outbound(): Optional<Outbound> = outbound.getOptional("outbound")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Returns the raw JSON value of [callForwarding].
         *
         * Unlike [callForwarding], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_forwarding")
        @ExcludeMissing
        fun _callForwarding(): JsonField<CallForwarding> = callForwarding

        /**
         * Returns the raw JSON value of [callRecording].
         *
         * Unlike [callRecording], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_recording")
        @ExcludeMissing
        fun _callRecording(): JsonField<CallRecording> = callRecording

        /**
         * Returns the raw JSON value of [callerIdNameEnabled].
         *
         * Unlike [callerIdNameEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("caller_id_name_enabled")
        @ExcludeMissing
        fun _callerIdNameEnabled(): JsonField<Boolean> = callerIdNameEnabled

        /**
         * Returns the raw JSON value of [cnamListing].
         *
         * Unlike [cnamListing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cnam_listing")
        @ExcludeMissing
        fun _cnamListing(): JsonField<CnamListing> = cnamListing

        /**
         * Returns the raw JSON value of [connectionId].
         *
         * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<String> = connectionId

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
         * Returns the raw JSON value of [inbound].
         *
         * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inbound") @ExcludeMissing fun _inbound(): JsonField<Inbound> = inbound

        /**
         * Returns the raw JSON value of [inboundCallScreening].
         *
         * Unlike [inboundCallScreening], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inbound_call_screening")
        @ExcludeMissing
        fun _inboundCallScreening(): JsonField<InboundCallScreening> = inboundCallScreening

        /**
         * Returns the raw JSON value of [noiseSuppression].
         *
         * Unlike [noiseSuppression], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("noise_suppression")
        @ExcludeMissing
        fun _noiseSuppression(): JsonField<Boolean> = noiseSuppression

        /**
         * Returns the raw JSON value of [outbound].
         *
         * Unlike [outbound], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("outbound") @ExcludeMissing fun _outbound(): JsonField<Outbound> = outbound

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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

            private var callForwarding: JsonField<CallForwarding> = JsonMissing.of()
            private var callRecording: JsonField<CallRecording> = JsonMissing.of()
            private var callerIdNameEnabled: JsonField<Boolean> = JsonMissing.of()
            private var cnamListing: JsonField<CnamListing> = JsonMissing.of()
            private var connectionId: JsonField<String> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var inbound: JsonField<Inbound> = JsonMissing.of()
            private var inboundCallScreening: JsonField<InboundCallScreening> = JsonMissing.of()
            private var noiseSuppression: JsonField<Boolean> = JsonMissing.of()
            private var outbound: JsonField<Outbound> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                callForwarding = body.callForwarding
                callRecording = body.callRecording
                callerIdNameEnabled = body.callerIdNameEnabled
                cnamListing = body.cnamListing
                connectionId = body.connectionId
                customerReference = body.customerReference
                inbound = body.inbound
                inboundCallScreening = body.inboundCallScreening
                noiseSuppression = body.noiseSuppression
                outbound = body.outbound
                tags = body.tags.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun callForwarding(callForwarding: CallForwarding) =
                callForwarding(JsonField.of(callForwarding))

            /**
             * Sets [Builder.callForwarding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callForwarding] with a well-typed [CallForwarding]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callForwarding(callForwarding: JsonField<CallForwarding>) = apply {
                this.callForwarding = callForwarding
            }

            fun callRecording(callRecording: CallRecording) =
                callRecording(JsonField.of(callRecording))

            /**
             * Sets [Builder.callRecording] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callRecording] with a well-typed [CallRecording]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callRecording(callRecording: JsonField<CallRecording>) = apply {
                this.callRecording = callRecording
            }

            fun callerIdNameEnabled(callerIdNameEnabled: Boolean) =
                callerIdNameEnabled(JsonField.of(callerIdNameEnabled))

            /**
             * Sets [Builder.callerIdNameEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callerIdNameEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callerIdNameEnabled(callerIdNameEnabled: JsonField<Boolean>) = apply {
                this.callerIdNameEnabled = callerIdNameEnabled
            }

            fun cnamListing(cnamListing: CnamListing) = cnamListing(JsonField.of(cnamListing))

            /**
             * Sets [Builder.cnamListing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cnamListing] with a well-typed [CnamListing] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cnamListing(cnamListing: JsonField<CnamListing>) = apply {
                this.cnamListing = cnamListing
            }

            fun connectionId(connectionId: String?) =
                connectionId(JsonField.ofNullable(connectionId))

            /** Alias for calling [Builder.connectionId] with `connectionId.orElse(null)`. */
            fun connectionId(connectionId: Optional<String>) =
                connectionId(connectionId.getOrNull())

            /**
             * Sets [Builder.connectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            fun customerReference(customerReference: String?) =
                customerReference(JsonField.ofNullable(customerReference))

            /**
             * Alias for calling [Builder.customerReference] with `customerReference.orElse(null)`.
             */
            fun customerReference(customerReference: Optional<String>) =
                customerReference(customerReference.getOrNull())

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

            fun inbound(inbound: Inbound) = inbound(JsonField.of(inbound))

            /**
             * Sets [Builder.inbound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inbound] with a well-typed [Inbound] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inbound(inbound: JsonField<Inbound>) = apply { this.inbound = inbound }

            fun inboundCallScreening(inboundCallScreening: InboundCallScreening) =
                inboundCallScreening(JsonField.of(inboundCallScreening))

            /**
             * Sets [Builder.inboundCallScreening] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundCallScreening] with a well-typed
             * [InboundCallScreening] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun inboundCallScreening(inboundCallScreening: JsonField<InboundCallScreening>) =
                apply {
                    this.inboundCallScreening = inboundCallScreening
                }

            fun noiseSuppression(noiseSuppression: Boolean) =
                noiseSuppression(JsonField.of(noiseSuppression))

            /**
             * Sets [Builder.noiseSuppression] to an arbitrary JSON value.
             *
             * You should usually call [Builder.noiseSuppression] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun noiseSuppression(noiseSuppression: JsonField<Boolean>) = apply {
                this.noiseSuppression = noiseSuppression
            }

            fun outbound(outbound: Outbound) = outbound(JsonField.of(outbound))

            /**
             * Sets [Builder.outbound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outbound] with a well-typed [Outbound] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outbound(outbound: JsonField<Outbound>) = apply { this.outbound = outbound }

            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
                    callForwarding,
                    callRecording,
                    callerIdNameEnabled,
                    cnamListing,
                    connectionId,
                    customerReference,
                    inbound,
                    inboundCallScreening,
                    noiseSuppression,
                    outbound,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            callForwarding().ifPresent { it.validate() }
            callRecording().ifPresent { it.validate() }
            callerIdNameEnabled()
            cnamListing().ifPresent { it.validate() }
            connectionId()
            customerReference()
            inbound().ifPresent { it.validate() }
            inboundCallScreening().ifPresent { it.validate() }
            noiseSuppression()
            outbound().ifPresent { it.validate() }
            tags()
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
            (callForwarding.asKnown().getOrNull()?.validity() ?: 0) +
                (callRecording.asKnown().getOrNull()?.validity() ?: 0) +
                (if (callerIdNameEnabled.asKnown().isPresent) 1 else 0) +
                (cnamListing.asKnown().getOrNull()?.validity() ?: 0) +
                (if (connectionId.asKnown().isPresent) 1 else 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (inbound.asKnown().getOrNull()?.validity() ?: 0) +
                (inboundCallScreening.asKnown().getOrNull()?.validity() ?: 0) +
                (if (noiseSuppression.asKnown().isPresent) 1 else 0) +
                (outbound.asKnown().getOrNull()?.validity() ?: 0) +
                (tags.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                callForwarding == other.callForwarding &&
                callRecording == other.callRecording &&
                callerIdNameEnabled == other.callerIdNameEnabled &&
                cnamListing == other.cnamListing &&
                connectionId == other.connectionId &&
                customerReference == other.customerReference &&
                inbound == other.inbound &&
                inboundCallScreening == other.inboundCallScreening &&
                noiseSuppression == other.noiseSuppression &&
                outbound == other.outbound &&
                tags == other.tags &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                callForwarding,
                callRecording,
                callerIdNameEnabled,
                cnamListing,
                connectionId,
                customerReference,
                inbound,
                inboundCallScreening,
                noiseSuppression,
                outbound,
                tags,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{callForwarding=$callForwarding, callRecording=$callRecording, callerIdNameEnabled=$callerIdNameEnabled, cnamListing=$cnamListing, connectionId=$connectionId, customerReference=$customerReference, inbound=$inbound, inboundCallScreening=$inboundCallScreening, noiseSuppression=$noiseSuppression, outbound=$outbound, tags=$tags, additionalProperties=$additionalProperties}"
    }

    class CallForwarding
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val callForwardingEnabled: JsonField<Boolean>,
        private val forwardingType: JsonField<ForwardingType>,
        private val forwardsTo: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("call_forwarding_enabled")
            @ExcludeMissing
            callForwardingEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("forwarding_type")
            @ExcludeMissing
            forwardingType: JsonField<ForwardingType> = JsonMissing.of(),
            @JsonProperty("forwards_to")
            @ExcludeMissing
            forwardsTo: JsonField<String> = JsonMissing.of(),
        ) : this(callForwardingEnabled, forwardingType, forwardsTo, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callForwardingEnabled(): Optional<Boolean> =
            callForwardingEnabled.getOptional("call_forwarding_enabled")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun forwardingType(): Optional<ForwardingType> =
            forwardingType.getOptional("forwarding_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun forwardsTo(): Optional<String> = forwardsTo.getOptional("forwards_to")

        /**
         * Returns the raw JSON value of [callForwardingEnabled].
         *
         * Unlike [callForwardingEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("call_forwarding_enabled")
        @ExcludeMissing
        fun _callForwardingEnabled(): JsonField<Boolean> = callForwardingEnabled

        /**
         * Returns the raw JSON value of [forwardingType].
         *
         * Unlike [forwardingType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("forwarding_type")
        @ExcludeMissing
        fun _forwardingType(): JsonField<ForwardingType> = forwardingType

        /**
         * Returns the raw JSON value of [forwardsTo].
         *
         * Unlike [forwardsTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("forwards_to")
        @ExcludeMissing
        fun _forwardsTo(): JsonField<String> = forwardsTo

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

            /** Returns a mutable builder for constructing an instance of [CallForwarding]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CallForwarding]. */
        class Builder internal constructor() {

            private var callForwardingEnabled: JsonField<Boolean> = JsonMissing.of()
            private var forwardingType: JsonField<ForwardingType> = JsonMissing.of()
            private var forwardsTo: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(callForwarding: CallForwarding) = apply {
                callForwardingEnabled = callForwarding.callForwardingEnabled
                forwardingType = callForwarding.forwardingType
                forwardsTo = callForwarding.forwardsTo
                additionalProperties = callForwarding.additionalProperties.toMutableMap()
            }

            fun callForwardingEnabled(callForwardingEnabled: Boolean) =
                callForwardingEnabled(JsonField.of(callForwardingEnabled))

            /**
             * Sets [Builder.callForwardingEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callForwardingEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callForwardingEnabled(callForwardingEnabled: JsonField<Boolean>) = apply {
                this.callForwardingEnabled = callForwardingEnabled
            }

            fun forwardingType(forwardingType: ForwardingType?) =
                forwardingType(JsonField.ofNullable(forwardingType))

            /** Alias for calling [Builder.forwardingType] with `forwardingType.orElse(null)`. */
            fun forwardingType(forwardingType: Optional<ForwardingType>) =
                forwardingType(forwardingType.getOrNull())

            /**
             * Sets [Builder.forwardingType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.forwardingType] with a well-typed [ForwardingType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun forwardingType(forwardingType: JsonField<ForwardingType>) = apply {
                this.forwardingType = forwardingType
            }

            fun forwardsTo(forwardsTo: String?) = forwardsTo(JsonField.ofNullable(forwardsTo))

            /** Alias for calling [Builder.forwardsTo] with `forwardsTo.orElse(null)`. */
            fun forwardsTo(forwardsTo: Optional<String>) = forwardsTo(forwardsTo.getOrNull())

            /**
             * Sets [Builder.forwardsTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.forwardsTo] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun forwardsTo(forwardsTo: JsonField<String>) = apply { this.forwardsTo = forwardsTo }

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
             * Returns an immutable instance of [CallForwarding].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CallForwarding =
                CallForwarding(
                    callForwardingEnabled,
                    forwardingType,
                    forwardsTo,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CallForwarding = apply {
            if (validated) {
                return@apply
            }

            callForwardingEnabled()
            forwardingType().ifPresent { it.validate() }
            forwardsTo()
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
            (if (callForwardingEnabled.asKnown().isPresent) 1 else 0) +
                (forwardingType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (forwardsTo.asKnown().isPresent) 1 else 0)

        class ForwardingType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ALWAYS = of("always")

                @JvmField val ON_FAILURE = of("on-failure")

                @JvmStatic fun of(value: String) = ForwardingType(JsonField.of(value))
            }

            /** An enum containing [ForwardingType]'s known values. */
            enum class Known {
                ALWAYS,
                ON_FAILURE,
            }

            /**
             * An enum containing [ForwardingType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ForwardingType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ALWAYS,
                ON_FAILURE,
                /**
                 * An enum member indicating that [ForwardingType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ALWAYS -> Value.ALWAYS
                    ON_FAILURE -> Value.ON_FAILURE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ALWAYS -> Known.ALWAYS
                    ON_FAILURE -> Known.ON_FAILURE
                    else -> throw TelnyxInvalidDataException("Unknown ForwardingType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): ForwardingType = apply {
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

                return other is ForwardingType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CallForwarding &&
                callForwardingEnabled == other.callForwardingEnabled &&
                forwardingType == other.forwardingType &&
                forwardsTo == other.forwardsTo &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(callForwardingEnabled, forwardingType, forwardsTo, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CallForwarding{callForwardingEnabled=$callForwardingEnabled, forwardingType=$forwardingType, forwardsTo=$forwardsTo, additionalProperties=$additionalProperties}"
    }

    class CallRecording
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val inboundCallRecordingChannels: JsonField<InboundCallRecordingChannels>,
        private val inboundCallRecordingEnabled: JsonField<Boolean>,
        private val inboundCallRecordingFormat: JsonField<InboundCallRecordingFormat>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("inbound_call_recording_channels")
            @ExcludeMissing
            inboundCallRecordingChannels: JsonField<InboundCallRecordingChannels> =
                JsonMissing.of(),
            @JsonProperty("inbound_call_recording_enabled")
            @ExcludeMissing
            inboundCallRecordingEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("inbound_call_recording_format")
            @ExcludeMissing
            inboundCallRecordingFormat: JsonField<InboundCallRecordingFormat> = JsonMissing.of(),
        ) : this(
            inboundCallRecordingChannels,
            inboundCallRecordingEnabled,
            inboundCallRecordingFormat,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inboundCallRecordingChannels(): Optional<InboundCallRecordingChannels> =
            inboundCallRecordingChannels.getOptional("inbound_call_recording_channels")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inboundCallRecordingEnabled(): Optional<Boolean> =
            inboundCallRecordingEnabled.getOptional("inbound_call_recording_enabled")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inboundCallRecordingFormat(): Optional<InboundCallRecordingFormat> =
            inboundCallRecordingFormat.getOptional("inbound_call_recording_format")

        /**
         * Returns the raw JSON value of [inboundCallRecordingChannels].
         *
         * Unlike [inboundCallRecordingChannels], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inbound_call_recording_channels")
        @ExcludeMissing
        fun _inboundCallRecordingChannels(): JsonField<InboundCallRecordingChannels> =
            inboundCallRecordingChannels

        /**
         * Returns the raw JSON value of [inboundCallRecordingEnabled].
         *
         * Unlike [inboundCallRecordingEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inbound_call_recording_enabled")
        @ExcludeMissing
        fun _inboundCallRecordingEnabled(): JsonField<Boolean> = inboundCallRecordingEnabled

        /**
         * Returns the raw JSON value of [inboundCallRecordingFormat].
         *
         * Unlike [inboundCallRecordingFormat], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inbound_call_recording_format")
        @ExcludeMissing
        fun _inboundCallRecordingFormat(): JsonField<InboundCallRecordingFormat> =
            inboundCallRecordingFormat

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

            /** Returns a mutable builder for constructing an instance of [CallRecording]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CallRecording]. */
        class Builder internal constructor() {

            private var inboundCallRecordingChannels: JsonField<InboundCallRecordingChannels> =
                JsonMissing.of()
            private var inboundCallRecordingEnabled: JsonField<Boolean> = JsonMissing.of()
            private var inboundCallRecordingFormat: JsonField<InboundCallRecordingFormat> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(callRecording: CallRecording) = apply {
                inboundCallRecordingChannels = callRecording.inboundCallRecordingChannels
                inboundCallRecordingEnabled = callRecording.inboundCallRecordingEnabled
                inboundCallRecordingFormat = callRecording.inboundCallRecordingFormat
                additionalProperties = callRecording.additionalProperties.toMutableMap()
            }

            fun inboundCallRecordingChannels(
                inboundCallRecordingChannels: InboundCallRecordingChannels
            ) = inboundCallRecordingChannels(JsonField.of(inboundCallRecordingChannels))

            /**
             * Sets [Builder.inboundCallRecordingChannels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundCallRecordingChannels] with a well-typed
             * [InboundCallRecordingChannels] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun inboundCallRecordingChannels(
                inboundCallRecordingChannels: JsonField<InboundCallRecordingChannels>
            ) = apply { this.inboundCallRecordingChannels = inboundCallRecordingChannels }

            fun inboundCallRecordingEnabled(inboundCallRecordingEnabled: Boolean) =
                inboundCallRecordingEnabled(JsonField.of(inboundCallRecordingEnabled))

            /**
             * Sets [Builder.inboundCallRecordingEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundCallRecordingEnabled] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inboundCallRecordingEnabled(inboundCallRecordingEnabled: JsonField<Boolean>) =
                apply {
                    this.inboundCallRecordingEnabled = inboundCallRecordingEnabled
                }

            fun inboundCallRecordingFormat(inboundCallRecordingFormat: InboundCallRecordingFormat) =
                inboundCallRecordingFormat(JsonField.of(inboundCallRecordingFormat))

            /**
             * Sets [Builder.inboundCallRecordingFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundCallRecordingFormat] with a well-typed
             * [InboundCallRecordingFormat] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun inboundCallRecordingFormat(
                inboundCallRecordingFormat: JsonField<InboundCallRecordingFormat>
            ) = apply { this.inboundCallRecordingFormat = inboundCallRecordingFormat }

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
             * Returns an immutable instance of [CallRecording].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CallRecording =
                CallRecording(
                    inboundCallRecordingChannels,
                    inboundCallRecordingEnabled,
                    inboundCallRecordingFormat,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CallRecording = apply {
            if (validated) {
                return@apply
            }

            inboundCallRecordingChannels().ifPresent { it.validate() }
            inboundCallRecordingEnabled()
            inboundCallRecordingFormat().ifPresent { it.validate() }
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
            (inboundCallRecordingChannels.asKnown().getOrNull()?.validity() ?: 0) +
                (if (inboundCallRecordingEnabled.asKnown().isPresent) 1 else 0) +
                (inboundCallRecordingFormat.asKnown().getOrNull()?.validity() ?: 0)

        class InboundCallRecordingChannels
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SINGLE = of("single")

                @JvmField val DUAL = of("dual")

                @JvmStatic fun of(value: String) = InboundCallRecordingChannels(JsonField.of(value))
            }

            /** An enum containing [InboundCallRecordingChannels]'s known values. */
            enum class Known {
                SINGLE,
                DUAL,
            }

            /**
             * An enum containing [InboundCallRecordingChannels]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [InboundCallRecordingChannels] can contain an unknown value in a
             * couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SINGLE,
                DUAL,
                /**
                 * An enum member indicating that [InboundCallRecordingChannels] was instantiated
                 * with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SINGLE -> Value.SINGLE
                    DUAL -> Value.DUAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SINGLE -> Known.SINGLE
                    DUAL -> Known.DUAL
                    else ->
                        throw TelnyxInvalidDataException(
                            "Unknown InboundCallRecordingChannels: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): InboundCallRecordingChannels = apply {
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

                return other is InboundCallRecordingChannels && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class InboundCallRecordingFormat
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val WAV = of("wav")

                @JvmField val MP3 = of("mp3")

                @JvmStatic fun of(value: String) = InboundCallRecordingFormat(JsonField.of(value))
            }

            /** An enum containing [InboundCallRecordingFormat]'s known values. */
            enum class Known {
                WAV,
                MP3,
            }

            /**
             * An enum containing [InboundCallRecordingFormat]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [InboundCallRecordingFormat] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WAV,
                MP3,
                /**
                 * An enum member indicating that [InboundCallRecordingFormat] was instantiated with
                 * an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    WAV -> Value.WAV
                    MP3 -> Value.MP3
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    WAV -> Known.WAV
                    MP3 -> Known.MP3
                    else ->
                        throw TelnyxInvalidDataException(
                            "Unknown InboundCallRecordingFormat: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): InboundCallRecordingFormat = apply {
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

                return other is InboundCallRecordingFormat && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CallRecording &&
                inboundCallRecordingChannels == other.inboundCallRecordingChannels &&
                inboundCallRecordingEnabled == other.inboundCallRecordingEnabled &&
                inboundCallRecordingFormat == other.inboundCallRecordingFormat &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                inboundCallRecordingChannels,
                inboundCallRecordingEnabled,
                inboundCallRecordingFormat,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CallRecording{inboundCallRecordingChannels=$inboundCallRecordingChannels, inboundCallRecordingEnabled=$inboundCallRecordingEnabled, inboundCallRecordingFormat=$inboundCallRecordingFormat, additionalProperties=$additionalProperties}"
    }

    class CnamListing
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cnamListingDetails: JsonField<String>,
        private val cnamListingEnabled: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cnam_listing_details")
            @ExcludeMissing
            cnamListingDetails: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cnam_listing_enabled")
            @ExcludeMissing
            cnamListingEnabled: JsonField<Boolean> = JsonMissing.of(),
        ) : this(cnamListingDetails, cnamListingEnabled, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cnamListingDetails(): Optional<String> =
            cnamListingDetails.getOptional("cnam_listing_details")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cnamListingEnabled(): Optional<Boolean> =
            cnamListingEnabled.getOptional("cnam_listing_enabled")

        /**
         * Returns the raw JSON value of [cnamListingDetails].
         *
         * Unlike [cnamListingDetails], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cnam_listing_details")
        @ExcludeMissing
        fun _cnamListingDetails(): JsonField<String> = cnamListingDetails

        /**
         * Returns the raw JSON value of [cnamListingEnabled].
         *
         * Unlike [cnamListingEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cnam_listing_enabled")
        @ExcludeMissing
        fun _cnamListingEnabled(): JsonField<Boolean> = cnamListingEnabled

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

            /** Returns a mutable builder for constructing an instance of [CnamListing]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CnamListing]. */
        class Builder internal constructor() {

            private var cnamListingDetails: JsonField<String> = JsonMissing.of()
            private var cnamListingEnabled: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cnamListing: CnamListing) = apply {
                cnamListingDetails = cnamListing.cnamListingDetails
                cnamListingEnabled = cnamListing.cnamListingEnabled
                additionalProperties = cnamListing.additionalProperties.toMutableMap()
            }

            fun cnamListingDetails(cnamListingDetails: String?) =
                cnamListingDetails(JsonField.ofNullable(cnamListingDetails))

            /**
             * Alias for calling [Builder.cnamListingDetails] with
             * `cnamListingDetails.orElse(null)`.
             */
            fun cnamListingDetails(cnamListingDetails: Optional<String>) =
                cnamListingDetails(cnamListingDetails.getOrNull())

            /**
             * Sets [Builder.cnamListingDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cnamListingDetails] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cnamListingDetails(cnamListingDetails: JsonField<String>) = apply {
                this.cnamListingDetails = cnamListingDetails
            }

            fun cnamListingEnabled(cnamListingEnabled: Boolean) =
                cnamListingEnabled(JsonField.of(cnamListingEnabled))

            /**
             * Sets [Builder.cnamListingEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cnamListingEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cnamListingEnabled(cnamListingEnabled: JsonField<Boolean>) = apply {
                this.cnamListingEnabled = cnamListingEnabled
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
             * Returns an immutable instance of [CnamListing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CnamListing =
                CnamListing(
                    cnamListingDetails,
                    cnamListingEnabled,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CnamListing = apply {
            if (validated) {
                return@apply
            }

            cnamListingDetails()
            cnamListingEnabled()
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
            (if (cnamListingDetails.asKnown().isPresent) 1 else 0) +
                (if (cnamListingEnabled.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CnamListing &&
                cnamListingDetails == other.cnamListingDetails &&
                cnamListingEnabled == other.cnamListingEnabled &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(cnamListingDetails, cnamListingEnabled, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CnamListing{cnamListingDetails=$cnamListingDetails, cnamListingEnabled=$cnamListingEnabled, additionalProperties=$additionalProperties}"
    }

    class Inbound
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val interceptionAppId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("interception_app_id")
            @ExcludeMissing
            interceptionAppId: JsonField<String> = JsonMissing.of()
        ) : this(interceptionAppId, mutableMapOf())

        /**
         * The ID of the CallControl or TeXML Application that will intercept inbound calls.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interceptionAppId(): Optional<String> =
            interceptionAppId.getOptional("interception_app_id")

        /**
         * Returns the raw JSON value of [interceptionAppId].
         *
         * Unlike [interceptionAppId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interception_app_id")
        @ExcludeMissing
        fun _interceptionAppId(): JsonField<String> = interceptionAppId

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

            /** Returns a mutable builder for constructing an instance of [Inbound]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Inbound]. */
        class Builder internal constructor() {

            private var interceptionAppId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inbound: Inbound) = apply {
                interceptionAppId = inbound.interceptionAppId
                additionalProperties = inbound.additionalProperties.toMutableMap()
            }

            /** The ID of the CallControl or TeXML Application that will intercept inbound calls. */
            fun interceptionAppId(interceptionAppId: String?) =
                interceptionAppId(JsonField.ofNullable(interceptionAppId))

            /**
             * Alias for calling [Builder.interceptionAppId] with `interceptionAppId.orElse(null)`.
             */
            fun interceptionAppId(interceptionAppId: Optional<String>) =
                interceptionAppId(interceptionAppId.getOrNull())

            /**
             * Sets [Builder.interceptionAppId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interceptionAppId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun interceptionAppId(interceptionAppId: JsonField<String>) = apply {
                this.interceptionAppId = interceptionAppId
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
             * Returns an immutable instance of [Inbound].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Inbound = Inbound(interceptionAppId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Inbound = apply {
            if (validated) {
                return@apply
            }

            interceptionAppId()
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
        internal fun validity(): Int = (if (interceptionAppId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Inbound &&
                interceptionAppId == other.interceptionAppId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(interceptionAppId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Inbound{interceptionAppId=$interceptionAppId, additionalProperties=$additionalProperties}"
    }

    class InboundCallScreening
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

            @JvmField val DISABLED = of("disabled")

            @JvmField val REJECT_CALLS = of("reject_calls")

            @JvmField val FLAG_CALLS = of("flag_calls")

            @JvmStatic fun of(value: String) = InboundCallScreening(JsonField.of(value))
        }

        /** An enum containing [InboundCallScreening]'s known values. */
        enum class Known {
            DISABLED,
            REJECT_CALLS,
            FLAG_CALLS,
        }

        /**
         * An enum containing [InboundCallScreening]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [InboundCallScreening] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DISABLED,
            REJECT_CALLS,
            FLAG_CALLS,
            /**
             * An enum member indicating that [InboundCallScreening] was instantiated with an
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
                DISABLED -> Value.DISABLED
                REJECT_CALLS -> Value.REJECT_CALLS
                FLAG_CALLS -> Value.FLAG_CALLS
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
                DISABLED -> Known.DISABLED
                REJECT_CALLS -> Known.REJECT_CALLS
                FLAG_CALLS -> Known.FLAG_CALLS
                else -> throw TelnyxInvalidDataException("Unknown InboundCallScreening: $value")
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

        fun validate(): InboundCallScreening = apply {
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

            return other is InboundCallScreening && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Outbound
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val interceptionAppId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("interception_app_id")
            @ExcludeMissing
            interceptionAppId: JsonField<String> = JsonMissing.of()
        ) : this(interceptionAppId, mutableMapOf())

        /**
         * The ID of the CallControl or TeXML Application that will intercept outbound calls.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interceptionAppId(): Optional<String> =
            interceptionAppId.getOptional("interception_app_id")

        /**
         * Returns the raw JSON value of [interceptionAppId].
         *
         * Unlike [interceptionAppId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interception_app_id")
        @ExcludeMissing
        fun _interceptionAppId(): JsonField<String> = interceptionAppId

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

            /** Returns a mutable builder for constructing an instance of [Outbound]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Outbound]. */
        class Builder internal constructor() {

            private var interceptionAppId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outbound: Outbound) = apply {
                interceptionAppId = outbound.interceptionAppId
                additionalProperties = outbound.additionalProperties.toMutableMap()
            }

            /**
             * The ID of the CallControl or TeXML Application that will intercept outbound calls.
             */
            fun interceptionAppId(interceptionAppId: String?) =
                interceptionAppId(JsonField.ofNullable(interceptionAppId))

            /**
             * Alias for calling [Builder.interceptionAppId] with `interceptionAppId.orElse(null)`.
             */
            fun interceptionAppId(interceptionAppId: Optional<String>) =
                interceptionAppId(interceptionAppId.getOrNull())

            /**
             * Sets [Builder.interceptionAppId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interceptionAppId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun interceptionAppId(interceptionAppId: JsonField<String>) = apply {
                this.interceptionAppId = interceptionAppId
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
             * Returns an immutable instance of [Outbound].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Outbound = Outbound(interceptionAppId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Outbound = apply {
            if (validated) {
                return@apply
            }

            interceptionAppId()
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
        internal fun validity(): Int = (if (interceptionAppId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Outbound &&
                interceptionAppId == other.interceptionAppId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(interceptionAppId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Outbound{interceptionAppId=$interceptionAppId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MobilePhoneNumberUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MobilePhoneNumberUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
