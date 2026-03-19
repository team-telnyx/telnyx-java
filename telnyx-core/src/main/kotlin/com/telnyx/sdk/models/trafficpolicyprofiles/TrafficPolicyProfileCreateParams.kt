// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.trafficpolicyprofiles

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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a new traffic policy profile. At least one of `services`, `ip_ranges`, or `domains` must
 * be provided.
 */
class TrafficPolicyProfileCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The type of the traffic policy profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * Array of domain names.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domains(): Optional<List<String>> = body.domains()

    /**
     * Array of IP ranges in CIDR notation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipRanges(): Optional<List<String>> = body.ipRanges()

    /**
     * Bandwidth limit in kbps. Must be 512 or 1024.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limitBwKbps(): Optional<LimitBwKbps> = body.limitBwKbps()

    /**
     * Array of PCEF service IDs to include in the profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun services(): Optional<List<String>> = body.services()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [domains].
     *
     * Unlike [domains], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _domains(): JsonField<List<String>> = body._domains()

    /**
     * Returns the raw JSON value of [ipRanges].
     *
     * Unlike [ipRanges], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ipRanges(): JsonField<List<String>> = body._ipRanges()

    /**
     * Returns the raw JSON value of [limitBwKbps].
     *
     * Unlike [limitBwKbps], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limitBwKbps(): JsonField<LimitBwKbps> = body._limitBwKbps()

    /**
     * Returns the raw JSON value of [services].
     *
     * Unlike [services], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _services(): JsonField<List<String>> = body._services()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TrafficPolicyProfileCreateParams].
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TrafficPolicyProfileCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(trafficPolicyProfileCreateParams: TrafficPolicyProfileCreateParams) =
            apply {
                body = trafficPolicyProfileCreateParams.body.toBuilder()
                additionalHeaders = trafficPolicyProfileCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    trafficPolicyProfileCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [type]
         * - [domains]
         * - [ipRanges]
         * - [limitBwKbps]
         * - [services]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The type of the traffic policy profile. */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /** Array of domain names. */
        fun domains(domains: List<String>) = apply { body.domains(domains) }

        /**
         * Sets [Builder.domains] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domains] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun domains(domains: JsonField<List<String>>) = apply { body.domains(domains) }

        /**
         * Adds a single [String] to [domains].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDomain(domain: String) = apply { body.addDomain(domain) }

        /** Array of IP ranges in CIDR notation. */
        fun ipRanges(ipRanges: List<String>) = apply { body.ipRanges(ipRanges) }

        /**
         * Sets [Builder.ipRanges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipRanges] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ipRanges(ipRanges: JsonField<List<String>>) = apply { body.ipRanges(ipRanges) }

        /**
         * Adds a single [String] to [ipRanges].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIpRange(ipRange: String) = apply { body.addIpRange(ipRange) }

        /** Bandwidth limit in kbps. Must be 512 or 1024. */
        fun limitBwKbps(limitBwKbps: LimitBwKbps) = apply { body.limitBwKbps(limitBwKbps) }

        /**
         * Sets [Builder.limitBwKbps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limitBwKbps] with a well-typed [LimitBwKbps] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun limitBwKbps(limitBwKbps: JsonField<LimitBwKbps>) = apply {
            body.limitBwKbps(limitBwKbps)
        }

        /** Array of PCEF service IDs to include in the profile. */
        fun services(services: List<String>) = apply { body.services(services) }

        /**
         * Sets [Builder.services] to an arbitrary JSON value.
         *
         * You should usually call [Builder.services] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun services(services: JsonField<List<String>>) = apply { body.services(services) }

        /**
         * Adds a single [String] to [services].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addService(service: String) = apply { body.addService(service) }

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
         * Returns an immutable instance of [TrafficPolicyProfileCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TrafficPolicyProfileCreateParams =
            TrafficPolicyProfileCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val domains: JsonField<List<String>>,
        private val ipRanges: JsonField<List<String>>,
        private val limitBwKbps: JsonField<LimitBwKbps>,
        private val services: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("domains")
            @ExcludeMissing
            domains: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("ip_ranges")
            @ExcludeMissing
            ipRanges: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("limit_bw_kbps")
            @ExcludeMissing
            limitBwKbps: JsonField<LimitBwKbps> = JsonMissing.of(),
            @JsonProperty("services")
            @ExcludeMissing
            services: JsonField<List<String>> = JsonMissing.of(),
        ) : this(type, domains, ipRanges, limitBwKbps, services, mutableMapOf())

        /**
         * The type of the traffic policy profile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Array of domain names.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun domains(): Optional<List<String>> = domains.getOptional("domains")

        /**
         * Array of IP ranges in CIDR notation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ipRanges(): Optional<List<String>> = ipRanges.getOptional("ip_ranges")

        /**
         * Bandwidth limit in kbps. Must be 512 or 1024.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun limitBwKbps(): Optional<LimitBwKbps> = limitBwKbps.getOptional("limit_bw_kbps")

        /**
         * Array of PCEF service IDs to include in the profile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun services(): Optional<List<String>> = services.getOptional("services")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [domains].
         *
         * Unlike [domains], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("domains") @ExcludeMissing fun _domains(): JsonField<List<String>> = domains

        /**
         * Returns the raw JSON value of [ipRanges].
         *
         * Unlike [ipRanges], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip_ranges")
        @ExcludeMissing
        fun _ipRanges(): JsonField<List<String>> = ipRanges

        /**
         * Returns the raw JSON value of [limitBwKbps].
         *
         * Unlike [limitBwKbps], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit_bw_kbps")
        @ExcludeMissing
        fun _limitBwKbps(): JsonField<LimitBwKbps> = limitBwKbps

        /**
         * Returns the raw JSON value of [services].
         *
         * Unlike [services], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("services")
        @ExcludeMissing
        fun _services(): JsonField<List<String>> = services

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
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var domains: JsonField<MutableList<String>>? = null
            private var ipRanges: JsonField<MutableList<String>>? = null
            private var limitBwKbps: JsonField<LimitBwKbps> = JsonMissing.of()
            private var services: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                type = body.type
                domains = body.domains.map { it.toMutableList() }
                ipRanges = body.ipRanges.map { it.toMutableList() }
                limitBwKbps = body.limitBwKbps
                services = body.services.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The type of the traffic policy profile. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Array of domain names. */
            fun domains(domains: List<String>) = domains(JsonField.of(domains))

            /**
             * Sets [Builder.domains] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domains] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domains(domains: JsonField<List<String>>) = apply {
                this.domains = domains.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [domains].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDomain(domain: String) = apply {
                domains =
                    (domains ?: JsonField.of(mutableListOf())).also {
                        checkKnown("domains", it).add(domain)
                    }
            }

            /** Array of IP ranges in CIDR notation. */
            fun ipRanges(ipRanges: List<String>) = ipRanges(JsonField.of(ipRanges))

            /**
             * Sets [Builder.ipRanges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ipRanges] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ipRanges(ipRanges: JsonField<List<String>>) = apply {
                this.ipRanges = ipRanges.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [ipRanges].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIpRange(ipRange: String) = apply {
                ipRanges =
                    (ipRanges ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ipRanges", it).add(ipRange)
                    }
            }

            /** Bandwidth limit in kbps. Must be 512 or 1024. */
            fun limitBwKbps(limitBwKbps: LimitBwKbps) = limitBwKbps(JsonField.of(limitBwKbps))

            /**
             * Sets [Builder.limitBwKbps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limitBwKbps] with a well-typed [LimitBwKbps] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun limitBwKbps(limitBwKbps: JsonField<LimitBwKbps>) = apply {
                this.limitBwKbps = limitBwKbps
            }

            /** Array of PCEF service IDs to include in the profile. */
            fun services(services: List<String>) = services(JsonField.of(services))

            /**
             * Sets [Builder.services] to an arbitrary JSON value.
             *
             * You should usually call [Builder.services] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun services(services: JsonField<List<String>>) = apply {
                this.services = services.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [services].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addService(service: String) = apply {
                services =
                    (services ?: JsonField.of(mutableListOf())).also {
                        checkKnown("services", it).add(service)
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
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("type", type),
                    (domains ?: JsonMissing.of()).map { it.toImmutable() },
                    (ipRanges ?: JsonMissing.of()).map { it.toImmutable() },
                    limitBwKbps,
                    (services ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            domains()
            ipRanges()
            limitBwKbps().ifPresent { it.validate() }
            services()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) +
                (domains.asKnown().getOrNull()?.size ?: 0) +
                (ipRanges.asKnown().getOrNull()?.size ?: 0) +
                (limitBwKbps.asKnown().getOrNull()?.validity() ?: 0) +
                (services.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                type == other.type &&
                domains == other.domains &&
                ipRanges == other.ipRanges &&
                limitBwKbps == other.limitBwKbps &&
                services == other.services &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(type, domains, ipRanges, limitBwKbps, services, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{type=$type, domains=$domains, ipRanges=$ipRanges, limitBwKbps=$limitBwKbps, services=$services, additionalProperties=$additionalProperties}"
    }

    /** The type of the traffic policy profile. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val WHITELIST = of("whitelist")

            @JvmField val BLACKLIST = of("blacklist")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            WHITELIST,
            BLACKLIST,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WHITELIST,
            BLACKLIST,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                WHITELIST -> Value.WHITELIST
                BLACKLIST -> Value.BLACKLIST
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
                WHITELIST -> Known.WHITELIST
                BLACKLIST -> Known.BLACKLIST
                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Bandwidth limit in kbps. Must be 512 or 1024. */
    class LimitBwKbps @JsonCreator private constructor(private val value: JsonField<Long>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

        companion object {

            @JvmField val _512 = of(512L)

            @JvmField val _1024 = of(1024L)

            @JvmStatic fun of(value: Long) = LimitBwKbps(JsonField.of(value))
        }

        /** An enum containing [LimitBwKbps]'s known values. */
        enum class Known {
            _512,
            _1024,
        }

        /**
         * An enum containing [LimitBwKbps]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LimitBwKbps] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _512,
            _1024,
            /**
             * An enum member indicating that [LimitBwKbps] was instantiated with an unknown value.
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
                _512 -> Value._512
                _1024 -> Value._1024
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
                _512 -> Known._512
                _1024 -> Known._1024
                else -> throw TelnyxInvalidDataException("Unknown LimitBwKbps: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asLong(): Long =
            _value().asNumber().getOrNull()?.let {
                if (it.toDouble() % 1 == 0.0) it.toLong() else null
            } ?: throw TelnyxInvalidDataException("Value is not a Long")

        private var validated: Boolean = false

        fun validate(): LimitBwKbps = apply {
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

            return other is LimitBwKbps && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrafficPolicyProfileCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TrafficPolicyProfileCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
