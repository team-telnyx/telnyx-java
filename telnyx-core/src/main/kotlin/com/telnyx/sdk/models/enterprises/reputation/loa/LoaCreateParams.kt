// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.loa

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
 * Render the LOA for this enterprise as a PDF. The enterprise identity, address, and
 * authorized-representative contact are taken from the enterprise record; the optional `agent`
 * block is supplied only when a third-party partner manages the numbers. The response is the PDF
 * itself (unsigned unless a `signature` is provided). Sign it and upload it to the Telnyx Documents
 * API (`POST /v2/documents`, see https://developers.telnyx.com/api/documents) to obtain the
 * `loa_document_id` required by `POST .../reputation`.
 */
class LoaCreateParams
private constructor(
    private val enterpriseId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun enterpriseId(): Optional<String> = Optional.ofNullable(enterpriseId)

    /**
     * Third-party reseller / partner managing the enterprise's phone numbers. Omit when the
     * enterprise works directly with Telnyx.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agent(): Optional<Agent> = body.agent()

    /**
     * Optional signature embedded in the rendered PDF. When omitted the PDF is returned unsigned
     * for the customer to sign and upload.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signature(): Optional<Signature> = body.signature()

    /**
     * Returns the raw JSON value of [agent].
     *
     * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agent(): JsonField<Agent> = body._agent()

    /**
     * Returns the raw JSON value of [signature].
     *
     * Unlike [signature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _signature(): JsonField<Signature> = body._signature()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): LoaCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [LoaCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LoaCreateParams]. */
    class Builder internal constructor() {

        private var enterpriseId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(loaCreateParams: LoaCreateParams) = apply {
            enterpriseId = loaCreateParams.enterpriseId
            body = loaCreateParams.body.toBuilder()
            additionalHeaders = loaCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = loaCreateParams.additionalQueryParams.toBuilder()
        }

        fun enterpriseId(enterpriseId: String?) = apply { this.enterpriseId = enterpriseId }

        /** Alias for calling [Builder.enterpriseId] with `enterpriseId.orElse(null)`. */
        fun enterpriseId(enterpriseId: Optional<String>) = enterpriseId(enterpriseId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [agent]
         * - [signature]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Third-party reseller / partner managing the enterprise's phone numbers. Omit when the
         * enterprise works directly with Telnyx.
         */
        fun agent(agent: Agent) = apply { body.agent(agent) }

        /**
         * Sets [Builder.agent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agent] with a well-typed [Agent] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agent(agent: JsonField<Agent>) = apply { body.agent(agent) }

        /**
         * Optional signature embedded in the rendered PDF. When omitted the PDF is returned
         * unsigned for the customer to sign and upload.
         */
        fun signature(signature: Signature) = apply { body.signature(signature) }

        /**
         * Sets [Builder.signature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signature] with a well-typed [Signature] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signature(signature: JsonField<Signature>) = apply { body.signature(signature) }

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
         * Returns an immutable instance of [LoaCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LoaCreateParams =
            LoaCreateParams(
                enterpriseId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> enterpriseId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * All fields optional. The enterprise identity, address, and authorized-representative contact
     * are read from the enterprise record keyed by the path parameter.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agent: JsonField<Agent>,
        private val signature: JsonField<Signature>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agent") @ExcludeMissing agent: JsonField<Agent> = JsonMissing.of(),
            @JsonProperty("signature")
            @ExcludeMissing
            signature: JsonField<Signature> = JsonMissing.of(),
        ) : this(agent, signature, mutableMapOf())

        /**
         * Third-party reseller / partner managing the enterprise's phone numbers. Omit when the
         * enterprise works directly with Telnyx.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agent(): Optional<Agent> = agent.getOptional("agent")

        /**
         * Optional signature embedded in the rendered PDF. When omitted the PDF is returned
         * unsigned for the customer to sign and upload.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signature(): Optional<Signature> = signature.getOptional("signature")

        /**
         * Returns the raw JSON value of [agent].
         *
         * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent") @ExcludeMissing fun _agent(): JsonField<Agent> = agent

        /**
         * Returns the raw JSON value of [signature].
         *
         * Unlike [signature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signature")
        @ExcludeMissing
        fun _signature(): JsonField<Signature> = signature

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

            private var agent: JsonField<Agent> = JsonMissing.of()
            private var signature: JsonField<Signature> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                agent = body.agent
                signature = body.signature
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Third-party reseller / partner managing the enterprise's phone numbers. Omit when the
             * enterprise works directly with Telnyx.
             */
            fun agent(agent: Agent) = agent(JsonField.of(agent))

            /**
             * Sets [Builder.agent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agent] with a well-typed [Agent] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun agent(agent: JsonField<Agent>) = apply { this.agent = agent }

            /**
             * Optional signature embedded in the rendered PDF. When omitted the PDF is returned
             * unsigned for the customer to sign and upload.
             */
            fun signature(signature: Signature) = signature(JsonField.of(signature))

            /**
             * Sets [Builder.signature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signature] with a well-typed [Signature] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signature(signature: JsonField<Signature>) = apply { this.signature = signature }

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
            fun build(): Body = Body(agent, signature, additionalProperties.toMutableMap())
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

            agent().ifPresent { it.validate() }
            signature().ifPresent { it.validate() }
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
            (agent.asKnown().getOrNull()?.validity() ?: 0) +
                (signature.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                agent == other.agent &&
                signature == other.signature &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(agent, signature, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{agent=$agent, signature=$signature, additionalProperties=$additionalProperties}"
    }

    /**
     * Third-party reseller / partner managing the enterprise's phone numbers. Omit when the
     * enterprise works directly with Telnyx.
     */
    class Agent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val administrativeArea: JsonField<String>,
        private val city: JsonField<String>,
        private val contactEmail: JsonField<String>,
        private val contactName: JsonField<String>,
        private val contactPhone: JsonField<String>,
        private val contactTitle: JsonField<String>,
        private val country: JsonField<String>,
        private val legalName: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val streetAddress: JsonField<String>,
        private val dba: JsonField<String>,
        private val extendedAddress: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("administrative_area")
            @ExcludeMissing
            administrativeArea: JsonField<String> = JsonMissing.of(),
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contact_email")
            @ExcludeMissing
            contactEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contact_name")
            @ExcludeMissing
            contactName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contact_phone")
            @ExcludeMissing
            contactPhone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contact_title")
            @ExcludeMissing
            contactTitle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("legal_name")
            @ExcludeMissing
            legalName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("street_address")
            @ExcludeMissing
            streetAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dba") @ExcludeMissing dba: JsonField<String> = JsonMissing.of(),
            @JsonProperty("extended_address")
            @ExcludeMissing
            extendedAddress: JsonField<String> = JsonMissing.of(),
        ) : this(
            administrativeArea,
            city,
            contactEmail,
            contactName,
            contactPhone,
            contactTitle,
            country,
            legalName,
            postalCode,
            streetAddress,
            dba,
            extendedAddress,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun administrativeArea(): String = administrativeArea.getRequired("administrative_area")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contactEmail(): String = contactEmail.getRequired("contact_email")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contactName(): String = contactName.getRequired("contact_name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contactPhone(): String = contactPhone.getRequired("contact_phone")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contactTitle(): String = contactTitle.getRequired("contact_title")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun legalName(): String = legalName.getRequired("legal_name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun streetAddress(): String = streetAddress.getRequired("street_address")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dba(): Optional<String> = dba.getOptional("dba")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun extendedAddress(): Optional<String> = extendedAddress.getOptional("extended_address")

        /**
         * Returns the raw JSON value of [administrativeArea].
         *
         * Unlike [administrativeArea], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("administrative_area")
        @ExcludeMissing
        fun _administrativeArea(): JsonField<String> = administrativeArea

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [contactEmail].
         *
         * Unlike [contactEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contact_email")
        @ExcludeMissing
        fun _contactEmail(): JsonField<String> = contactEmail

        /**
         * Returns the raw JSON value of [contactName].
         *
         * Unlike [contactName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contact_name")
        @ExcludeMissing
        fun _contactName(): JsonField<String> = contactName

        /**
         * Returns the raw JSON value of [contactPhone].
         *
         * Unlike [contactPhone], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contact_phone")
        @ExcludeMissing
        fun _contactPhone(): JsonField<String> = contactPhone

        /**
         * Returns the raw JSON value of [contactTitle].
         *
         * Unlike [contactTitle], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contact_title")
        @ExcludeMissing
        fun _contactTitle(): JsonField<String> = contactTitle

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [legalName].
         *
         * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("legal_name") @ExcludeMissing fun _legalName(): JsonField<String> = legalName

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [streetAddress].
         *
         * Unlike [streetAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("street_address")
        @ExcludeMissing
        fun _streetAddress(): JsonField<String> = streetAddress

        /**
         * Returns the raw JSON value of [dba].
         *
         * Unlike [dba], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dba") @ExcludeMissing fun _dba(): JsonField<String> = dba

        /**
         * Returns the raw JSON value of [extendedAddress].
         *
         * Unlike [extendedAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("extended_address")
        @ExcludeMissing
        fun _extendedAddress(): JsonField<String> = extendedAddress

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
             * Returns a mutable builder for constructing an instance of [Agent].
             *
             * The following fields are required:
             * ```java
             * .administrativeArea()
             * .city()
             * .contactEmail()
             * .contactName()
             * .contactPhone()
             * .contactTitle()
             * .country()
             * .legalName()
             * .postalCode()
             * .streetAddress()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Agent]. */
        class Builder internal constructor() {

            private var administrativeArea: JsonField<String>? = null
            private var city: JsonField<String>? = null
            private var contactEmail: JsonField<String>? = null
            private var contactName: JsonField<String>? = null
            private var contactPhone: JsonField<String>? = null
            private var contactTitle: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var legalName: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var streetAddress: JsonField<String>? = null
            private var dba: JsonField<String> = JsonMissing.of()
            private var extendedAddress: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(agent: Agent) = apply {
                administrativeArea = agent.administrativeArea
                city = agent.city
                contactEmail = agent.contactEmail
                contactName = agent.contactName
                contactPhone = agent.contactPhone
                contactTitle = agent.contactTitle
                country = agent.country
                legalName = agent.legalName
                postalCode = agent.postalCode
                streetAddress = agent.streetAddress
                dba = agent.dba
                extendedAddress = agent.extendedAddress
                additionalProperties = agent.additionalProperties.toMutableMap()
            }

            fun administrativeArea(administrativeArea: String) =
                administrativeArea(JsonField.of(administrativeArea))

            /**
             * Sets [Builder.administrativeArea] to an arbitrary JSON value.
             *
             * You should usually call [Builder.administrativeArea] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun administrativeArea(administrativeArea: JsonField<String>) = apply {
                this.administrativeArea = administrativeArea
            }

            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            fun contactEmail(contactEmail: String) = contactEmail(JsonField.of(contactEmail))

            /**
             * Sets [Builder.contactEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactEmail(contactEmail: JsonField<String>) = apply {
                this.contactEmail = contactEmail
            }

            fun contactName(contactName: String) = contactName(JsonField.of(contactName))

            /**
             * Sets [Builder.contactName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactName(contactName: JsonField<String>) = apply {
                this.contactName = contactName
            }

            fun contactPhone(contactPhone: String) = contactPhone(JsonField.of(contactPhone))

            /**
             * Sets [Builder.contactPhone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactPhone] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactPhone(contactPhone: JsonField<String>) = apply {
                this.contactPhone = contactPhone
            }

            fun contactTitle(contactTitle: String) = contactTitle(JsonField.of(contactTitle))

            /**
             * Sets [Builder.contactTitle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactTitle] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactTitle(contactTitle: JsonField<String>) = apply {
                this.contactTitle = contactTitle
            }

            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun legalName(legalName: String) = legalName(JsonField.of(legalName))

            /**
             * Sets [Builder.legalName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            fun streetAddress(streetAddress: String) = streetAddress(JsonField.of(streetAddress))

            /**
             * Sets [Builder.streetAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streetAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun streetAddress(streetAddress: JsonField<String>) = apply {
                this.streetAddress = streetAddress
            }

            fun dba(dba: String?) = dba(JsonField.ofNullable(dba))

            /** Alias for calling [Builder.dba] with `dba.orElse(null)`. */
            fun dba(dba: Optional<String>) = dba(dba.getOrNull())

            /**
             * Sets [Builder.dba] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dba] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun dba(dba: JsonField<String>) = apply { this.dba = dba }

            fun extendedAddress(extendedAddress: String?) =
                extendedAddress(JsonField.ofNullable(extendedAddress))

            /** Alias for calling [Builder.extendedAddress] with `extendedAddress.orElse(null)`. */
            fun extendedAddress(extendedAddress: Optional<String>) =
                extendedAddress(extendedAddress.getOrNull())

            /**
             * Sets [Builder.extendedAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extendedAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extendedAddress(extendedAddress: JsonField<String>) = apply {
                this.extendedAddress = extendedAddress
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
             * Returns an immutable instance of [Agent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .administrativeArea()
             * .city()
             * .contactEmail()
             * .contactName()
             * .contactPhone()
             * .contactTitle()
             * .country()
             * .legalName()
             * .postalCode()
             * .streetAddress()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Agent =
                Agent(
                    checkRequired("administrativeArea", administrativeArea),
                    checkRequired("city", city),
                    checkRequired("contactEmail", contactEmail),
                    checkRequired("contactName", contactName),
                    checkRequired("contactPhone", contactPhone),
                    checkRequired("contactTitle", contactTitle),
                    checkRequired("country", country),
                    checkRequired("legalName", legalName),
                    checkRequired("postalCode", postalCode),
                    checkRequired("streetAddress", streetAddress),
                    dba,
                    extendedAddress,
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
        fun validate(): Agent = apply {
            if (validated) {
                return@apply
            }

            administrativeArea()
            city()
            contactEmail()
            contactName()
            contactPhone()
            contactTitle()
            country()
            legalName()
            postalCode()
            streetAddress()
            dba()
            extendedAddress()
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
            (if (administrativeArea.asKnown().isPresent) 1 else 0) +
                (if (city.asKnown().isPresent) 1 else 0) +
                (if (contactEmail.asKnown().isPresent) 1 else 0) +
                (if (contactName.asKnown().isPresent) 1 else 0) +
                (if (contactPhone.asKnown().isPresent) 1 else 0) +
                (if (contactTitle.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (legalName.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (streetAddress.asKnown().isPresent) 1 else 0) +
                (if (dba.asKnown().isPresent) 1 else 0) +
                (if (extendedAddress.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Agent &&
                administrativeArea == other.administrativeArea &&
                city == other.city &&
                contactEmail == other.contactEmail &&
                contactName == other.contactName &&
                contactPhone == other.contactPhone &&
                contactTitle == other.contactTitle &&
                country == other.country &&
                legalName == other.legalName &&
                postalCode == other.postalCode &&
                streetAddress == other.streetAddress &&
                dba == other.dba &&
                extendedAddress == other.extendedAddress &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                administrativeArea,
                city,
                contactEmail,
                contactName,
                contactPhone,
                contactTitle,
                country,
                legalName,
                postalCode,
                streetAddress,
                dba,
                extendedAddress,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Agent{administrativeArea=$administrativeArea, city=$city, contactEmail=$contactEmail, contactName=$contactName, contactPhone=$contactPhone, contactTitle=$contactTitle, country=$country, legalName=$legalName, postalCode=$postalCode, streetAddress=$streetAddress, dba=$dba, extendedAddress=$extendedAddress, additionalProperties=$additionalProperties}"
    }

    /**
     * Optional signature embedded in the rendered PDF. When omitted the PDF is returned unsigned
     * for the customer to sign and upload.
     */
    class Signature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val imageBase64: JsonField<String>,
        private val signerName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("image_base64")
            @ExcludeMissing
            imageBase64: JsonField<String> = JsonMissing.of(),
            @JsonProperty("signer_name")
            @ExcludeMissing
            signerName: JsonField<String> = JsonMissing.of(),
        ) : this(imageBase64, signerName, mutableMapOf())

        /**
         * Base64-encoded signature image.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun imageBase64(): String = imageBase64.getRequired("image_base64")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signerName(): Optional<String> = signerName.getOptional("signer_name")

        /**
         * Returns the raw JSON value of [imageBase64].
         *
         * Unlike [imageBase64], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image_base64")
        @ExcludeMissing
        fun _imageBase64(): JsonField<String> = imageBase64

        /**
         * Returns the raw JSON value of [signerName].
         *
         * Unlike [signerName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signer_name")
        @ExcludeMissing
        fun _signerName(): JsonField<String> = signerName

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
             * Returns a mutable builder for constructing an instance of [Signature].
             *
             * The following fields are required:
             * ```java
             * .imageBase64()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Signature]. */
        class Builder internal constructor() {

            private var imageBase64: JsonField<String>? = null
            private var signerName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(signature: Signature) = apply {
                imageBase64 = signature.imageBase64
                signerName = signature.signerName
                additionalProperties = signature.additionalProperties.toMutableMap()
            }

            /** Base64-encoded signature image. */
            fun imageBase64(imageBase64: String) = imageBase64(JsonField.of(imageBase64))

            /**
             * Sets [Builder.imageBase64] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageBase64] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imageBase64(imageBase64: JsonField<String>) = apply {
                this.imageBase64 = imageBase64
            }

            fun signerName(signerName: String?) = signerName(JsonField.ofNullable(signerName))

            /** Alias for calling [Builder.signerName] with `signerName.orElse(null)`. */
            fun signerName(signerName: Optional<String>) = signerName(signerName.getOrNull())

            /**
             * Sets [Builder.signerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signerName(signerName: JsonField<String>) = apply { this.signerName = signerName }

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
             * Returns an immutable instance of [Signature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .imageBase64()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Signature =
                Signature(
                    checkRequired("imageBase64", imageBase64),
                    signerName,
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
        fun validate(): Signature = apply {
            if (validated) {
                return@apply
            }

            imageBase64()
            signerName()
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
            (if (imageBase64.asKnown().isPresent) 1 else 0) +
                (if (signerName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Signature &&
                imageBase64 == other.imageBase64 &&
                signerName == other.signerName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(imageBase64, signerName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Signature{imageBase64=$imageBase64, signerName=$signerName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LoaCreateParams &&
            enterpriseId == other.enterpriseId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(enterpriseId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "LoaCreateParams{enterpriseId=$enterpriseId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
