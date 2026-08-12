// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Updates mutable settings for an existing email domain, including inbound delivery and tracking
 * configuration. Shared domains are read-only for non-owner accounts.
 */
class EmailDomainUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * DMARC policy for a sending domain. Drives the recommended _dmarc.<domain> TXT record. DMARC
     * is advisory and never blocks sending. When omitted or null, the domain uses the advisory
     * default (v=DMARC1; p=none; rua=mailto:dmarc@telnyx.com).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dmarcPolicy(): Optional<EmailDmarcPolicy> = body.dmarcPolicy()

    /**
     * Enable or disable inbound routing for this domain
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundEnabled(): Optional<Boolean> = body.inboundEnabled()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tracking(): Optional<DomainsTrackingSettings> = body.tracking()

    /**
     * Returns the raw JSON value of [dmarcPolicy].
     *
     * Unlike [dmarcPolicy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dmarcPolicy(): JsonField<EmailDmarcPolicy> = body._dmarcPolicy()

    /**
     * Returns the raw JSON value of [inboundEnabled].
     *
     * Unlike [inboundEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inboundEnabled(): JsonField<Boolean> = body._inboundEnabled()

    /**
     * Returns the raw JSON value of [tracking].
     *
     * Unlike [tracking], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tracking(): JsonField<DomainsTrackingSettings> = body._tracking()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EmailDomainUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EmailDomainUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailDomainUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emailDomainUpdateParams: EmailDomainUpdateParams) = apply {
            id = emailDomainUpdateParams.id
            body = emailDomainUpdateParams.body.toBuilder()
            additionalHeaders = emailDomainUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = emailDomainUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [dmarcPolicy]
         * - [inboundEnabled]
         * - [tracking]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * DMARC policy for a sending domain. Drives the recommended _dmarc.<domain> TXT record.
         * DMARC is advisory and never blocks sending. When omitted or null, the domain uses the
         * advisory default (v=DMARC1; p=none; rua=mailto:dmarc@telnyx.com).
         */
        fun dmarcPolicy(dmarcPolicy: EmailDmarcPolicy?) = apply { body.dmarcPolicy(dmarcPolicy) }

        /** Alias for calling [Builder.dmarcPolicy] with `dmarcPolicy.orElse(null)`. */
        fun dmarcPolicy(dmarcPolicy: Optional<EmailDmarcPolicy>) =
            dmarcPolicy(dmarcPolicy.getOrNull())

        /**
         * Sets [Builder.dmarcPolicy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dmarcPolicy] with a well-typed [EmailDmarcPolicy] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dmarcPolicy(dmarcPolicy: JsonField<EmailDmarcPolicy>) = apply {
            body.dmarcPolicy(dmarcPolicy)
        }

        /** Enable or disable inbound routing for this domain */
        fun inboundEnabled(inboundEnabled: Boolean) = apply { body.inboundEnabled(inboundEnabled) }

        /**
         * Sets [Builder.inboundEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inboundEnabled(inboundEnabled: JsonField<Boolean>) = apply {
            body.inboundEnabled(inboundEnabled)
        }

        fun tracking(tracking: DomainsTrackingSettings) = apply { body.tracking(tracking) }

        /**
         * Sets [Builder.tracking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tracking] with a well-typed [DomainsTrackingSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun tracking(tracking: JsonField<DomainsTrackingSettings>) = apply {
            body.tracking(tracking)
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
         * Returns an immutable instance of [EmailDomainUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailDomainUpdateParams =
            EmailDomainUpdateParams(
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

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dmarcPolicy: JsonField<EmailDmarcPolicy>,
        private val inboundEnabled: JsonField<Boolean>,
        private val tracking: JsonField<DomainsTrackingSettings>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dmarc_policy")
            @ExcludeMissing
            dmarcPolicy: JsonField<EmailDmarcPolicy> = JsonMissing.of(),
            @JsonProperty("inbound_enabled")
            @ExcludeMissing
            inboundEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tracking")
            @ExcludeMissing
            tracking: JsonField<DomainsTrackingSettings> = JsonMissing.of(),
        ) : this(dmarcPolicy, inboundEnabled, tracking, mutableMapOf())

        /**
         * DMARC policy for a sending domain. Drives the recommended _dmarc.<domain> TXT record.
         * DMARC is advisory and never blocks sending. When omitted or null, the domain uses the
         * advisory default (v=DMARC1; p=none; rua=mailto:dmarc@telnyx.com).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dmarcPolicy(): Optional<EmailDmarcPolicy> = dmarcPolicy.getOptional("dmarc_policy")

        /**
         * Enable or disable inbound routing for this domain
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inboundEnabled(): Optional<Boolean> = inboundEnabled.getOptional("inbound_enabled")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tracking(): Optional<DomainsTrackingSettings> = tracking.getOptional("tracking")

        /**
         * Returns the raw JSON value of [dmarcPolicy].
         *
         * Unlike [dmarcPolicy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dmarc_policy")
        @ExcludeMissing
        fun _dmarcPolicy(): JsonField<EmailDmarcPolicy> = dmarcPolicy

        /**
         * Returns the raw JSON value of [inboundEnabled].
         *
         * Unlike [inboundEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("inbound_enabled")
        @ExcludeMissing
        fun _inboundEnabled(): JsonField<Boolean> = inboundEnabled

        /**
         * Returns the raw JSON value of [tracking].
         *
         * Unlike [tracking], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tracking")
        @ExcludeMissing
        fun _tracking(): JsonField<DomainsTrackingSettings> = tracking

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

            private var dmarcPolicy: JsonField<EmailDmarcPolicy> = JsonMissing.of()
            private var inboundEnabled: JsonField<Boolean> = JsonMissing.of()
            private var tracking: JsonField<DomainsTrackingSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                dmarcPolicy = body.dmarcPolicy
                inboundEnabled = body.inboundEnabled
                tracking = body.tracking
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * DMARC policy for a sending domain. Drives the recommended _dmarc.<domain> TXT record.
             * DMARC is advisory and never blocks sending. When omitted or null, the domain uses the
             * advisory default (v=DMARC1; p=none; rua=mailto:dmarc@telnyx.com).
             */
            fun dmarcPolicy(dmarcPolicy: EmailDmarcPolicy?) =
                dmarcPolicy(JsonField.ofNullable(dmarcPolicy))

            /** Alias for calling [Builder.dmarcPolicy] with `dmarcPolicy.orElse(null)`. */
            fun dmarcPolicy(dmarcPolicy: Optional<EmailDmarcPolicy>) =
                dmarcPolicy(dmarcPolicy.getOrNull())

            /**
             * Sets [Builder.dmarcPolicy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dmarcPolicy] with a well-typed [EmailDmarcPolicy]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dmarcPolicy(dmarcPolicy: JsonField<EmailDmarcPolicy>) = apply {
                this.dmarcPolicy = dmarcPolicy
            }

            /** Enable or disable inbound routing for this domain */
            fun inboundEnabled(inboundEnabled: Boolean) =
                inboundEnabled(JsonField.of(inboundEnabled))

            /**
             * Sets [Builder.inboundEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inboundEnabled(inboundEnabled: JsonField<Boolean>) = apply {
                this.inboundEnabled = inboundEnabled
            }

            fun tracking(tracking: DomainsTrackingSettings) = tracking(JsonField.of(tracking))

            /**
             * Sets [Builder.tracking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tracking] with a well-typed
             * [DomainsTrackingSettings] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun tracking(tracking: JsonField<DomainsTrackingSettings>) = apply {
                this.tracking = tracking
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
                Body(dmarcPolicy, inboundEnabled, tracking, additionalProperties.toMutableMap())
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

            dmarcPolicy().ifPresent { it.validate() }
            inboundEnabled()
            tracking().ifPresent { it.validate() }
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
            (dmarcPolicy.asKnown().getOrNull()?.validity() ?: 0) +
                (if (inboundEnabled.asKnown().isPresent) 1 else 0) +
                (tracking.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                dmarcPolicy == other.dmarcPolicy &&
                inboundEnabled == other.inboundEnabled &&
                tracking == other.tracking &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(dmarcPolicy, inboundEnabled, tracking, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{dmarcPolicy=$dmarcPolicy, inboundEnabled=$inboundEnabled, tracking=$tracking, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailDomainUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EmailDomainUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
